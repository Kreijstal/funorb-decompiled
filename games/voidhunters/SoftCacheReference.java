/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftCacheReference extends CacheReference {
    static String field_m;
    private java.lang.ref.SoftReference reference;

    final static void setArchiveErrorStatus(int param0) {
        GetAutozoomAmountMultiply.field_o.errorCount = 0;
        GetAutozoomAmountMultiply.field_o.errorStatus = param0;
    }

    final Object getValue(int param0) {
        if (param0 < 85) {
          field_m = (String) null;
          return this.reference.get();
        }
        return this.reference.get();
    }

    SoftCacheReference(Object param0, int param1) {
        super(param1);
        try {
          this.reference = new java.lang.ref.SoftReference(param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isSoft(byte param0) {
        if (param0 <= 29) {
          this.getValue(-10);
          return true;
        }
        return true;
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          SoftCacheReference.clearSharedReferences(false);
          field_m = null;
          return;
        }
        field_m = null;
    }

    static {
        field_m = "Asking to join <%0>'s game...";
    }
}
