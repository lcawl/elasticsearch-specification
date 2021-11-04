/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import { UserDefinedValue } from '@spec_utils/UserDefinedValue'
import { InferenceConfigContainer } from '@_types/aggregations/pipeline'
import { RequestBase } from '@_types/Base'
import { Id } from '@_types/common'
import { Definition, Input } from './types'

/**
 * The create trained model API enables you to supply a trained model that is
 * not created by data frame analytics.
 * @rest_spec_name ml.put_trained_model
 * @since 7.10.0
 * @stability stable
 * @cluster_privileges manage_ml
 */
export interface Request extends RequestBase {
  path_parts: {
    /**
     * The unique identifier of the trained model.
     */
    model_id: Id
  }
  body: {
    /**
     * The compressed (GZipped and Base64 encoded) inference definition of the
     * model. If compressed_definition is specified, then definition cannot be
     * specified.
     */
    compressed_definition?: string
    /**
     * The inference definition for the model. If definition is specified, then
     * compressed_definition cannot be specified.
     */
    definition?: Definition
    /**
     * A human-readable description of the inference trained model.
     */
    description?: string
    /**
     * The default configuration for inference. This can be either a regression
     * or classification configuration. It must match the underlying
     * definition.trained_model's target_type.
     */
    inference_config: InferenceConfigContainer
    /**
     * The input field names for the model definition.
     */
    input: Input
    /**
     * An object map that contains metadata about the model.
     */
    metadata?: UserDefinedValue
    /**
     * An array of tags to organize the model.
     */
    tags?: string[]
  }
}
