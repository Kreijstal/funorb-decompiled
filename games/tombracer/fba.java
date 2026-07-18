/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fba {
    static float field_a;

    final static int[] a(int param0, float param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        int[] var10 = new int[2048];
        int[] var8 = var10;
        lva var9 = new lva();
        var9.field_z = 35;
        var9.field_u = 8;
        var9.field_n = 4;
        var9.field_w = 8;
        var9.field_s = true;
        var9.field_x = (int)(4096.0f * param1);
        var9.b((byte) 116);
        uta.a(0, 1, 2048);
        var9.a(var10, -1, 0);
        return var10;
    }

    final static float[] a(int param0, float[] param1, int param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        float[] var5 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var4 = null;
                float[] discarded$2 = fba.a(60, (float[]) null, -59);
                break L1;
              }
            }
            var5 = new float[param2];
            var3 = var5;
            lua.a(param1, 0, var5, 0, param2);
            stackOut_2_0 = (float[]) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("fba.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2 = null;
        if (param0 == 100) {
          if (ika.field_b <= 0) {
            return null;
          } else {
            int fieldTemp$1 = ika.field_b - 1;
            ika.field_b = ika.field_b - 1;
            var2 = eh.field_i[fieldTemp$1];
            eh.field_i[ika.field_b] = null;
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
    }
}
