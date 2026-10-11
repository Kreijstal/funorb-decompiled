/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static long field_a;
    static int field_c;
    static ln field_d;
    static boolean[] field_e;
    static double[] field_b;

    final static boolean a(int param0, int param1, mi param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        mi var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param2.a((byte) -2, param1, param0);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          if (param3 != 119) {
            var5 = (mi) null;
            mc.a(68, 108, (mi) null, (byte) -5);
          }
          lc.a(false, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("mc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (oe.field_Q == wh.field_fb) {
          return jb.field_o;
        }
        if (wh.field_fb == na.field_S) {
          return ee.field_F;
        }
        if (!fb.field_a.c(param0 ^ 17221)) {
          return ee.field_F;
        }
        if (param0 == 16) {
          return kj.field_c;
        }
        return (String) null;
    }

    public static void a(byte param0) {
        if (param0 == 58) {
          field_b = null;
          field_d = null;
          field_e = null;
          return;
        }
        field_a = -117L;
        field_b = null;
        field_d = null;
        field_e = null;
    }

    static {
        field_e = new boolean[112];
        field_d = new ln();
        field_b = new double[]{16.0, -672.0, -16.0};
    }
}
