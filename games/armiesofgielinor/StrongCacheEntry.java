/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheEntry extends CacheEntry {
    static int[] field_D;
    private Object value;
    static ClientUiComponent field_C;
    static int field_E;
    static String field_A;

    final boolean isReferenceBacked(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_E = -65;
          return false;
        }
        return false;
    }

    public static void c(boolean param0) {
        field_A = null;
        field_D = null;
        field_C = null;
        if (!param0) {
          StrongCacheEntry.c(true);
        }
    }

    final Object getValue(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return (Object) null;
        }
        return this.value;
    }

    StrongCacheEntry(Object value, int weight) {
        super(weight);
        try {
          this.value = value;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "f.<init>(" + (value != null ? "{...}" : "null") + ',' + weight + ')');
        }
    }

    static {
        field_D = new int[]{83};
        field_A = "Type your age in years";
    }
}
