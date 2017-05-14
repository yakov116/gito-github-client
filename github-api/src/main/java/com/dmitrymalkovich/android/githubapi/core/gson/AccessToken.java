/*
 * Copyright 2017.  Dmitry Malkovich
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
package com.dmitrymalkovich.android.githubapi.core.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Credit to https://futurestud.io/tutorials/oauth-2-on-android-with-retrofit
 * <p>
 * OAuth GitHub API: https://developer.github.com/v3/oauth/
 */
@SuppressWarnings("unused")
public class AccessToken {

    @SerializedName("access_token")
    private String mAccessToken;
    @SerializedName("token_type")
    private String mTokenType;

    public String getToken() {
        return mAccessToken;
    }

    public String getTokenType() {
        return mTokenType;
    }

    public void setAccessToken(String accessToken) {
        this.mAccessToken = accessToken;
    }

    public void setTokenType(String tokenType) {
        this.mTokenType = tokenType;
    }
}