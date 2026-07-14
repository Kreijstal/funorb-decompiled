/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static sh field_h;
    static String field_b;
    int field_k;
    static kg field_d;
    static int[] field_g;
    static String field_j;
    static String field_f;
    static boolean field_c;
    int field_a;
    static int[] field_e;
    static String[] field_i;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final int a(int param0, wb param1) {
        if (param0 >= -80) {
          return -14;
        } else {
          return ((wb) this).field_k * param1.field_k + ((wb) this).field_a * param1.field_a;
        }
    }

    final int a(int param0) {
        int var2 = 55 % ((-50 - param0) / 49);
        return ((wb) this).field_k * ((wb) this).field_k - -(((wb) this).field_a * ((wb) this).field_a);
    }

    final in a(float param0, byte param1) {
        if (param1 < 119) {
          field_e = null;
          return new in((float)((wb) this).field_k / param0, (float)((wb) this).field_a / param0);
        } else {
          return new in((float)((wb) this).field_k / param0, (float)((wb) this).field_a / param0);
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        field_j = null;
        field_d = null;
        field_i = null;
        field_b = null;
        field_h = null;
        if (param0 <= 90) {
            field_i = null;
        }
    }

    final int a(boolean param0, wb param1) {
        if (param0) {
          field_f = null;
          return -(param1.field_k * ((wb) this).field_a) + ((wb) this).field_k * param1.field_a;
        } else {
          return -(param1.field_k * ((wb) this).field_a) + ((wb) this).field_k * param1.field_a;
        }
    }

    final static in a(vj param0, vj param1, int param2) {
        in var3 = null;
        in var4 = null;
        in var5 = null;
        in var6 = null;
        float var7 = 0.0f;
        Object var8 = null;
        var3 = param0.a(false);
        var4 = param1.g(-1);
        var5 = var4.a((byte) -119);
        var6 = new in(var4);
        var6.a(var3, param2 ^ 2095);
        if (param2 != 3251) {
          L0: {
            var8 = null;
            in discarded$1 = wb.a((vj) null, (vj) null, -127);
            if (0.0010000000474974513f <= Math.abs(var5.a(var6, (byte) -10))) {
              var6.a(-1);
              var7 = var5.a(var6, (byte) -10);
              var6.a(1.0f / var7, -1);
              break L0;
            } else {
              var6 = var5;
              break L0;
            }
          }
          return var6;
        } else {
          L1: {
            if (0.0010000000474974513f <= Math.abs(var5.a(var6, (byte) -10))) {
              var6.a(-1);
              var7 = var5.a(var6, (byte) -10);
              var6.a(1.0f / var7, -1);
              break L1;
            } else {
              var6 = var5;
              break L1;
            }
          }
          return var6;
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, ql param10) {
        int discarded$0 = param10.a(param1, 1 + param6, 1 + param5, param4, param7, 8, -1, 114, param9, param3, param0);
        int discarded$1 = param10.a(param1, param6, param5, param4, param7, param2, param8, param9, param3, param0);
    }

    final in b(int param0) {
        int var3 = 11 % ((-68 - param0) / 44);
        float var2 = (float)Math.sqrt((double)(((wb) this).field_k * ((wb) this).field_k - -(((wb) this).field_a * ((wb) this).field_a)));
        return new in((float)((wb) this).field_k / var2, (float)((wb) this).field_a / var2);
    }

    wb(int param0, int param1) {
        ((wb) this).field_k = param0;
        ((wb) this).field_a = param1;
    }

    wb(qm param0, qm param1) {
        ((wb) this).field_a = param1.field_f + -param0.field_f;
        ((wb) this).field_k = -param0.field_h + param1.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new sh();
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_j = "Invalid password.";
        field_e = new int[8192];
        field_b = "Collecting <col=1>1 or 2 blue or green</col> powerups has a lasting effect that does not need to be activated.";
        field_i = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
