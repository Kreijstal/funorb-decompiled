/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends ng {
    static String field_c;
    static String field_j;
    static int[] field_g;
    static long field_k;
    static int field_f;
    private String field_d;
    private String field_h;
    static String field_e;
    static int field_i;

    final sb b(byte param0) {
        if (param0 > -57) {
            field_c = null;
        }
        return jf.field_h;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Bounce.field_N;
          var3 = 0;
          if (param1 < -91) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        var4 = jl.field_a;
        L1: while (true) {
          if (var3 >= se.field_E.length) {
            return -1;
          } else {
            var5 = m.field_a[var3];
            if (-1 < (var5 ^ -1)) {
              var4 = var4 + k.field_D;
              var3++;
              continue L1;
            } else {
              var6 = vh.a(true, se.field_E[var3], true);
              var4 = var4 + hj.field_a;
              var7 = bi.field_h + -(var6 >> 651544929);
              if (!ef.a(var4, -kk.field_z + var7, -78, (cl.field_m << 443111233) + pb.field_j, (kk.field_z << 1540176769) + var6, param0, param2)) {
                var4 = var4 + (pb.field_j + (cl.field_m << 930887105) + hj.field_a);
                var3++;
                continue L1;
              } else {
                return var5;
              }
            }
          }
        }
    }

    final static void a(byte param0, int param1) {
        int discarded$0 = hf.a(false);
        int var2 = 66 / ((13 - param0) / 36);
    }

    final void a(boolean param0, wi param1) {
        param1.a(((qe) this).field_h, (byte) -67);
        if (param0) {
            field_j = null;
        }
        param1.b(((qe) this).field_d, (byte) -103);
    }

    final static lj a(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        lj var7 = null;
        int var8 = Bounce.field_N;
        int var2 = param1.length();
        if (0 == var2) {
            return uc.field_E;
        }
        if (var2 > param0) {
            return lk.field_t;
        }
        String[] var3 = di.a(-108, '.', param1);
        if (-3 < (var3.length ^ -1)) {
            return uc.field_E;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = dk.a(-64, var6);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return uk.a(-58, var3[var3.length - 1]);
    }

    final static ie a(int param0, gk param1, int param2, int param3, gk param4) {
        if (!c.a(param1, false, param2, param3)) {
            return null;
        }
        int var5 = 9 / ((param0 - -58) / 59);
        return ea.a(param4.b(-122, param3, param2), (byte) 71);
    }

    public static void c(byte param0) {
        field_e = null;
        field_g = null;
        field_c = null;
        field_j = null;
        if (param0 > -7) {
            field_c = null;
        }
    }

    qe(String param0, String param1) {
        ((qe) this).field_h = param0;
        ((qe) this).field_d = param1;
    }

    final static void c(int param0) {
        if (param0 != 443111233) {
            qe.a((byte) -62, -23);
        }
        pa.field_a = null;
        nb.field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Instructions";
        field_c = "Log in / Create account";
        field_g = new int[8192];
        field_f = 0;
    }
}
