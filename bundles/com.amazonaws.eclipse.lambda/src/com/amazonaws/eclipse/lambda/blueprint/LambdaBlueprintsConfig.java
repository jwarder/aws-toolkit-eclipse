/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.eclipse.lambda.blueprint;

import java.util.Map;

public class LambdaBlueprintsConfig {
    private String version;
    private String defaultBlueprint;
    private Map<String, LambdaBlueprint> blueprints;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getDefaultBlueprint() {
        return defaultBlueprint;
    }
    public void setDefaultBlueprint(String defaultBlueprint) {
        this.defaultBlueprint = defaultBlueprint;
    }
    public Map<String, LambdaBlueprint> getBlueprints() {
        return blueprints;
    }
    public void setBlueprints(Map<String, LambdaBlueprint> blueprints) {
        this.blueprints = blueprints;
    }
}
