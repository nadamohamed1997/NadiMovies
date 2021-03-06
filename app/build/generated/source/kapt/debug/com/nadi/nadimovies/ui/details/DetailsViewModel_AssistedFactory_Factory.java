// Generated by Dagger (https://dagger.dev).
package com.nadi.nadimovies.ui.details;

import com.nadi.core.similar.SimilarUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailsViewModel_AssistedFactory_Factory implements Factory<DetailsViewModel_AssistedFactory> {
  private final Provider<SimilarUseCase> similarUseCaseProvider;

  public DetailsViewModel_AssistedFactory_Factory(Provider<SimilarUseCase> similarUseCaseProvider) {
    this.similarUseCaseProvider = similarUseCaseProvider;
  }

  @Override
  public DetailsViewModel_AssistedFactory get() {
    return newInstance(similarUseCaseProvider);
  }

  public static DetailsViewModel_AssistedFactory_Factory create(
      Provider<SimilarUseCase> similarUseCaseProvider) {
    return new DetailsViewModel_AssistedFactory_Factory(similarUseCaseProvider);
  }

  public static DetailsViewModel_AssistedFactory newInstance(
      Provider<SimilarUseCase> similarUseCase) {
    return new DetailsViewModel_AssistedFactory(similarUseCase);
  }
}
