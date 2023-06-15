#!/bin/bash
# Build all projects
# For information on why Maven multi-module wasn't used, please see README.md

# Fail on errors
set -e

projects=( "1_quickstart/complete/quickstart" )

# Build all projects
for project in "${projects[@]}"; do
    ls -l
    echo "Navigating to \"${project}\""
    cd "${project}"
    . mvnw clean verify
    cd -
done
