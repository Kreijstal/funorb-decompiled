/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static int field_a;
    static String field_b;
    static RgbSprite[] field_c;

    final static void a(java.math.BigInteger param0, PacketBuffer param1, java.math.BigInteger param2, byte param3, PacketBuffer param4) {
        try {
          if (param3 != 111) {
            field_b = (String) null;
          }
          tg.a(param0, param4.position, param2, (byte) 84, param1, 0, param4.payload);
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "wc.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void resetStaticState(byte param0) {
        field_b = null;
        if (param0 != -50) {
          field_a = -89;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Open in popup window";
    }
}
