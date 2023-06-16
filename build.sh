#!/bin/bash
# Build all projects
# For information on why Maven multi-module wasn't used, please see README.md

# Fail on errors
set -e

projects=(
  "1_quickstart/complete/quickstart"
  "2_maven/example/mavenproj"
  "4_dependencyinjection/no_di/colours"
  "4_dependencyinjection/di_config/colours"
  "4_dependencyinjection/di_annotations/colours"
)

# Build all projects
for project in "${projects[@]}"; do
    echo "Building to \"${project}\"..."
    cd "./${project}/"

    if [[ $CI = "true" ]]; then
      # Running in CI, use Maven for caching purposes
      (mvn clean verify)
    else
      # Running locally, use wrapper
      (. mvnw clean verify)
    fi

    cd -
done
