/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CourseDefinition {
    private boolean field_b;
    static RoomDefinition[] field_a;
    RoomDefinition[] field_c;

    public static void releaseStatics(int param0) {
        if (param0 != -1485) {
          return;
        }
        field_a = null;
    }

    final boolean a(byte param0) {
        if (param0 > -22) {
          return true;
        }
        return this.field_b;
    }

    CourseDefinition(RoomDefinition[] param0, boolean param1) {
        try {
          this.field_c = param0;
          this.field_b = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
