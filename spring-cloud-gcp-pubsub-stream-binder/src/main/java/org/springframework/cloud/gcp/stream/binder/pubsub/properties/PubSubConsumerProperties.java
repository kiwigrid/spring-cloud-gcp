/*
 *  Copyright 2017 original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.gcp.stream.binder.pubsub.properties;

/**
 * @author João André Martins
 */
public class PubSubConsumerProperties {

	private boolean autoCreateResources = true;

	private boolean useBinaryProtocol = true;

	public boolean isAutoCreateResources() {
		return this.autoCreateResources;
	}

	public void setAutoCreateResources(boolean autoCreateResources) {
		this.autoCreateResources = autoCreateResources;
	}

	public boolean isUseBinaryProtocol() {
		return this.useBinaryProtocol;
	}

	public void setUseBinaryProtocol(boolean useBinaryProtocol) {
		this.useBinaryProtocol = useBinaryProtocol;
	}
}
