package org.infinispan;

/**
 * This exception is thrown when the cache or cache manager does not have the
 * right lifecycle state for operations to be called on it. Situations like
 * this include when the cache is stopping or is stopped, when the cache
 * manager is stopped...etc.
 *
 * @since 7.0
 * @deprecated since 10.1 please use {@link org.infinispan.commons.IllegalLifecycleStateException} instead
 */
@Deprecated
public class IllegalLifecycleStateException extends org.infinispan.commons.IllegalLifecycleStateException {
   public IllegalLifecycleStateException() {
   }

   public IllegalLifecycleStateException(String s) {
      super(s);
   }

   public IllegalLifecycleStateException(String message, Throwable cause) {
      super(message, cause);
   }

   public IllegalLifecycleStateException(Throwable cause) {
      super(cause);
   }
}
