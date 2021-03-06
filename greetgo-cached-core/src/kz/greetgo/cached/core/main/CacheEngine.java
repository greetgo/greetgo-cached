package kz.greetgo.cached.core.main;

import java.util.List;
import java.util.Map;

public interface CacheEngine {

  List<CacheParamDefinition> paramList(MethodAnnotationData methodAnnotationData);

  <In, Out> CoreCache<In, Out> createCoreCache(Map<String, Object> cacheParams);

}
