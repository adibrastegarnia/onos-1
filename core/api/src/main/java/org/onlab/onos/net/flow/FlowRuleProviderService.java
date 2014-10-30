/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onlab.onos.net.flow;

import org.onlab.onos.net.DeviceId;
import org.onlab.onos.net.provider.ProviderService;

/**
 * Service through which flow rule providers can inject information into
 * the core.
 */
public interface FlowRuleProviderService extends ProviderService<FlowRuleProvider> {

    /**
     * Signals that a flow rule that was previously installed has been removed.
     *
     * @param flowEntry removed flow entry
     */
    void flowRemoved(FlowEntry flowEntry);

    /**
     * Pushes the collection of flow entries currently applied on the given
     * device.
     *
     * @param flowEntries collection of flow rules
     */
    void pushFlowMetrics(DeviceId deviceId, Iterable<FlowEntry> flowEntries);

}
