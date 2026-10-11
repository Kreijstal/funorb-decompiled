/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static boolean field_b;
    static String field_c;
    static String field_d;
    static ba field_a;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = -106 / ((param0 - 17) / 55);
        field_d = null;
    }

    final static float[] a(float[] param0, int param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_2_0 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new float[2];
          var3 = var4;
          if (param1 < 109) {
            stackIn_2_0 = (float[]) null;
            return stackIn_2_0;
          }
          var4[0] = -param0[0] + param2[0];
          var4[1] = param2[1] - param0[1];
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ac.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(we.field_n);
          param1.removeMouseMotionListener(we.field_n);
          param1.removeFocusListener(we.field_n);
          lf.field_a = 0;
          int var2_int = -63 / ((-17 - param0) / 37);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ac.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = false;
        field_d = "Names cannot contain consecutive spaces";
    }
}
