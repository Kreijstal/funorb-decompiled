/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static int field_l;
    int field_d;
    int field_h;
    int field_j;
    static int[] field_e;
    int field_m;
    int field_a;
    byte[] field_b;
    int field_c;
    byte[] field_g;
    static String field_i;
    int field_f;
    static String field_k;

    public static void a(int param0) {
        field_i = null;
        field_e = null;
        if (param0 != -1) {
            ng.a(-11L, -116);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final static void a(byte param0) {
        if (!(kf.field_d != null)) {
            return;
        }
        ci.a((java.awt.Canvas) (Object) kf.field_d, 0);
        kf.field_d.a(false, qa.field_a);
        kf.field_d = null;
        if (!(ij.field_o == null)) {
            ij.field_o.b(-86);
        }
        ef.field_c.requestFocus();
        int var1 = 24 % ((-32 - param0) / 49);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = MinerDisturbance.field_ab;
        eh.e(param3, param4, 1 + param1, 10000536);
        eh.e(param3, param0 + param4, param1 - -1, 12105912);
        int var5 = 1;
        if (!(var5 + param4 >= eh.field_d)) {
            var5 = -param4 + eh.field_d;
        }
        int var6 = param0;
        if (eh.field_e < var6 + param4) {
            var6 = -param4 + eh.field_e;
        }
        int var7 = 122 / ((80 - param2) / 46);
        for (var8 = var5; var6 > var8; var8++) {
            var9 = 152 + var8 * 48 / param0;
            var10 = var9 | (var9 << 1855635080 | var9 << 1544973296);
            eh.field_f[param3 + eh.field_g * (var8 + param4)] = var10;
            eh.field_f[param1 + param3 + (param4 - -var8) * eh.field_g] = var10;
        }
    }

    final static void a(long param0, int param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        if (param1 == 1855635080) {
          try {
            L0: {
              Thread.sleep(param0);
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              var3 = (InterruptedException) (Object) decompiledCaughtException;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
        field_i = "Sound: ";
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
