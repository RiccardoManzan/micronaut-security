/*
 * Copyright 2017-2023 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.oauth2.url;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpRequest;
import java.net.URL;

/**
 * Builds an absolute URL for the current server.
 *
 * @author James Kleeh
 * @since 1.2.0
 */
public interface AbsoluteUrlBuilder {

    /**
     * Builds an absolute URL for the given path.
     *
     * @param current The current request
     * @param path The path
     * @return The absolute URL
     */
    URL buildUrl(@Nullable HttpRequest<?> current, String path);
}
