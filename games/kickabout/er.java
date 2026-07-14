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
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        var2 = (double)fr.a(param1, ra.field_F, true);
        var4 = (double)fr.a(param1, tf.field_g, true);
        var6 = (double)fr.a(param1, gm.field_fb, true);
        if (param0 <= 91) {
          return 1.8026836499173446;
        } else {
          var8 = -uc.field_C[param1.field_c][param1.field_i][param1.field_k] + (uc.field_C[param1.field_c][param1.field_i][param1.field_e] + (uc.field_C[param1.field_c][param1.field_d][param1.field_k] + (-uc.field_C[param1.field_l][param1.field_i][param1.field_e] + (-uc.field_C[param1.field_l][param1.field_d][param1.field_k] + uc.field_C[param1.field_l][param1.field_d][param1.field_e]) + uc.field_C[param1.field_l][param1.field_i][param1.field_k] - uc.field_C[param1.field_c][param1.field_d][param1.field_e])));
          return var8 - (var6 * var6 + (var4 * var4 + var2 * var2)) / (double)fr.a(param1, ao.field_i, true);
        }
    }

    final static int a(boolean param0, int param1, byte[] param2) {
        if (param0) {
            field_l = false;
            return s.a(param1, -119, param2, 0);
        }
        return s.a(param1, -119, param2, 0);
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -94) {
            er.a((byte) -85, false);
        }
    }

    er(int param0, int param1, int param2, int param3, int param4) {
        ((er) this).field_m = param2;
        ((er) this).field_i = param0;
        ((er) this).field_g = param1;
        ((er) this).field_e = param3;
        ((er) this).field_f = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
    }
}
