/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/
package org.apache.edgent.topology.spi.graph;

import org.apache.edgent.topology.TSink;
import org.apache.edgent.topology.TStream;
import org.apache.edgent.topology.Topology;

class ConnectorSink<G extends Topology,T> implements TSink<T> {
    
    private final ConnectorStream<G,T> feed; 
    
    ConnectorSink(ConnectorStream<G,T> feed) {
        this.feed = feed;
    }

    @Override
    public Topology topology() {
        return feed.topology();
    }
    @Override
    public TStream<T> getFeed() {
        return feed;
    }
}