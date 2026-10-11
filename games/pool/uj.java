/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ie field_e;
    static di field_d;
    static dd field_c;
    static String field_b;
    static int[] field_a;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 > 13) {
          field_c = null;
          return;
        }
        uj.a((byte) 78);
        field_c = null;
    }

    final static void a(uf param0, ij param1, int[] param2, int[] param3, int param4) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var12 = Pool.field_O;
        try {
          var15 = param0.field_ab;
          var14 = var15;
          var13 = var14;
          var5 = var13;
          var6 = -var15[0] + param3[0];
          var7 = param3[param4] - var15[1];
          var8 = -var15[2] + param3[2];
          var9 = var8 * var15[11] + var15[9] * var6 + var15[10] * var7 >> 16;
          if (0 >= var9) {
            param2[1] = qh.field_f >> 1;
            param2[0] = qh.field_l >> 1;
            return;
          }
          param2[1] = var15[8] * var8 + (var6 * var15[6] + var15[7] * var7) >> 7;
          param2[0] = var7 * var15[4] + (var6 * var15[3] + var15[5] * var8) >> 7;
          param2[1] = fb.field_d + param2[1] / var9;
          param2[0] = fb.field_q + param2[0] / var9;
          var10 = param1.field_K.field_A >> 1;
          param2[1] = param2[1] - var10;
          var11 = param1.field_K.field_z >> 1;
          if (-var11 + qh.field_l < param2[0]) {
            param2[0] = qh.field_l - var11;
          } else {
            if (var11 > param2[0]) {
              param2[0] = var11;
            }
          }
          if (-var10 + qh.field_f < param2[1]) {
            param2[1] = qh.field_f - var10;
            return;
          }
          if (param2[1] >= var10) {
            param2[1] = param2[1];
            return;
          }
          param2[1] = var10;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("uj.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_e = new ie();
        field_b = "Rankings";
        field_a = new int[]{0, 1, 3, 9, 10, 8, 7, 5, 15, 2, 12, 14, 4, 13, 11, 6};
    }
}
