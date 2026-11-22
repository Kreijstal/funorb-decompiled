/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    static String field_h;
    byte[] payload;
    int field_i;
    long releaseAtMillis;

    public static void releaseStatics(int param0) {
        field_h = null;
        if (param0 != -29867) {
          field_h = (String) null;
        }
    }

    DelayedPacket(long param0, int param1, byte[] param2) {
        try {
          this.field_i = param1;
          this.releaseAtMillis = param0;
          this.payload = param2;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "rha.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Johnsson";
    }
}
