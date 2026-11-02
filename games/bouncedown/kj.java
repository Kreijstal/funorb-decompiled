/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends IntrusiveNode {
    byte[] field_h;
    static String field_g;
    static int field_i;

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_g = null;
    }

    kj(byte[] param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "More suggestions";
    }
}
