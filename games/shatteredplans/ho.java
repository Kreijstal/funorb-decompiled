/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_b;
    static AnimatedPanel field_j;
    static nq field_f;
    static int field_c;
    static int field_a;
    static char field_h;
    static String field_g;
    static Player field_d;
    static byte[] field_i;
    static int[] field_e;

    final static void a(boolean param0, int param1) {
        if (null != IndexedSpriteState.field_h) {
          SoftwareRasterizer.clearRect(SoftwareRasterizer.field_i, SoftwareRasterizer.field_a, SoftwareRasterizer.field_l - SoftwareRasterizer.field_i, -SoftwareRasterizer.field_a + SoftwareRasterizer.field_f);
          IndexedSpriteState.field_h.drawFullRaster(param0, -100);
          if (param1 != 8323199) {
            ho.a(-86);
            return;
          }
          return;
        }
        if (param1 == 8323199) {
          return;
        }
        ho.a(-86);
    }

    final static SocketConnector createSocketConnector(int param0, int param1, String param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4276) {
            field_h = 'ￊ';
          }
          var3 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var3)).port = param0;
          ((SocketConnector) ((Object) var3)).host = param2;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ho.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 == 520) {
          field_i = null;
          field_g = null;
          field_j = null;
          field_d = null;
          return;
        }
        ho.a(false, 124);
        field_i = null;
        field_g = null;
        field_j = null;
        field_d = null;
    }

    static {
        field_b = 0;
        field_g = "Enemy Production";
        field_e = new int[]{16729156, 4521796, 7829503, 8323199, 16776960, 65535, 16776960, 8388479, 8355839};
        field_i = new byte[520];
    }
}
