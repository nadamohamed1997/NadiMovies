// Generated by Dagger (https://dagger.dev).
package com.nadi.data.gateway;

import com.nadi.data.network.MovieAPIs;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrailerGatewayImplementer_Factory implements Factory<TrailerGatewayImplementer> {
  private final Provider<MovieAPIs> movieAPIsProvider;

  public TrailerGatewayImplementer_Factory(Provider<MovieAPIs> movieAPIsProvider) {
    this.movieAPIsProvider = movieAPIsProvider;
  }

  @Override
  public TrailerGatewayImplementer get() {
    return newInstance(movieAPIsProvider.get());
  }

  public static TrailerGatewayImplementer_Factory create(Provider<MovieAPIs> movieAPIsProvider) {
    return new TrailerGatewayImplementer_Factory(movieAPIsProvider);
  }

  public static TrailerGatewayImplementer newInstance(MovieAPIs movieAPIs) {
    return new TrailerGatewayImplementer(movieAPIs);
  }
}