/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends gn {
    static int field_k;
    static byte[] field_h;
    static volatile boolean field_l;
    int field_f;
    int field_m;
    int field_g;
    int field_e;
    int field_i;
    er field_j;

    final static void a(byte param0, boolean param1) {
        if (param0 <= 21) {
          field_k = 101;
          mu.field_Y.a(97, param1);
          return;
        }
        mu.field_Y.a(97, param1);
    }

    final static double a(byte param0, ea param1) {
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double stackIn_2_0 = 0.0;
        double stackIn_4_0 = 0.0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_double = (double)fr.a(param1, ra.field_F, true);
          var4 = (double)fr.a(param1, tf.field_g, true);
          var6 = (double)fr.a(param1, gm.field_fb, true);
          if (param0 <= 91) {
            stackIn_2_0 = 1.8026836499173446;
            return stackIn_2_0;
          }
          var8 = -uc.field_C[param1.field_c][param1.field_i][param1.field_k] + (uc.field_C[param1.field_c][param1.field_i][param1.field_e] + (uc.field_C[param1.field_c][param1.field_d][param1.field_k] + (-uc.field_C[param1.field_l][param1.field_i][param1.field_e] + (-uc.field_C[param1.field_l][param1.field_d][param1.field_k] + uc.field_C[param1.field_l][param1.field_d][param1.field_e]) + uc.field_C[param1.field_l][param1.field_i][param1.field_k] - uc.field_C[param1.field_c][param1.field_d][param1.field_e])));
          stackIn_4_0 = var8 - (var6 * var6 + (var4 * var4 + var2_double * var2_double)) / (double)fr.a(param1, ao.field_i, true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("er.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_l = false;
          }
          stackIn_3_0 = s.a(param1, -119, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("er.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -94) {
          er.a((byte) -85, false);
        }
    }

    er(int param0, int param1, int param2, int param3, int param4) {
        this.field_m = param2;
        this.field_i = param0;
        this.field_g = param1;
        this.field_e = param3;
        this.field_f = param4;
    }

    static {
        field_l = true;
    }
}
