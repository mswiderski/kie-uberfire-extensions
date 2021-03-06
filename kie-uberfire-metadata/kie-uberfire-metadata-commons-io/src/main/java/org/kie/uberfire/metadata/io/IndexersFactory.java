/*
 * Copyright 2014 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.uberfire.metadata.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.kie.uberfire.metadata.engine.Indexer;
import org.uberfire.commons.validation.PortablePreconditions;

/**
 * Container for Indexers setup by CDI after IOServiceIndexedImpl has been created
 */
public class IndexersFactory {

    private static final List<Indexer> indexers = new ArrayList<Indexer>();

    public static void addIndexer( final Indexer indexer ) {
        indexers.add( PortablePreconditions.checkNotNull( "indexer",
                                                          indexer ) );
    }

    public static List<Indexer> getIndexers() {
        return Collections.unmodifiableList( indexers );
    }

}
