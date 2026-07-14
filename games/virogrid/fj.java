/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_c;
    static String field_a;
    static p field_b;

    final static void a(byte param0, int param1, int param2) {
        if (ke.field_r != null) {
            // if_icmplt L17
        } else {
            ke.field_r = new int[2 * param2];
        }
        if (null != wh.field_c) {
            // if_icmple L54
        }
        wh.field_c = new int[2 * param2];
        if (null != vc.field_jb) {
            // if_icmplt L72
        } else {
            vc.field_jb = new int[param2 * 2];
        }
        if (tg.field_A != null) {
            // if_icmpgt L97
        } else {
            tg.field_A = new int[param2 * 2];
        }
        if (kf.field_j != null) {
            // if_icmple L133
        }
        kf.field_j = new int[2 * param2];
        if (vl.field_i != null) {
            // if_icmpgt L150
        } else {
            vl.field_i = new int[2 * param2];
        }
        if (param0 <= 116) {
            field_c = null;
        }
        if (null != lk.field_Tb) {
            // if_icmplt L194
        } else {
            lk.field_Tb = new int[2 * (param2 - -param1)];
        }
        if (null != jg.field_b) {
            // if_icmpgt L223
        } else {
            jg.field_b = new boolean[param2 * 2];
        }
        dj.field_c = -2147483648;
        ka.field_m = 0;
        ka.field_k = 2147483647;
        rk.field_e = 2147483647;
        bl.field_F = -2147483648;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 > -47) {
            field_a = null;
        }
        field_b = null;
    }

    final static tf[] a(hg param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        tf[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        tf var6 = null;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        var2 = param0.c((byte) -78, 8);
        if (-1 <= (var2 ^ -1)) {
          var3 = param0.c((byte) -78, 12);
          var4 = new tf[var3];
          var5 = 0;
          L0: while (true) {
            if (var5 >= var3) {
              L1: {
                if (param1 == 9) {
                  break L1;
                } else {
                  fj.a((byte) 38);
                  break L1;
                }
              }
              return var4;
            } else {
              if (tk.a(param1 + -8, param0)) {
                var6 = new tf();
                int discarded$6 = param0.c((byte) -78, 24);
                int discarded$7 = param0.c((byte) -78, 24);
                var6.field_b = param0.c((byte) -78, 24);
                int discarded$8 = param0.c((byte) -78, 9);
                int discarded$9 = param0.c((byte) -78, 12);
                int discarded$10 = param0.c((byte) -78, 12);
                int discarded$11 = param0.c((byte) -78, 12);
                var4[var5] = var6;
                var5++;
                continue L0;
              } else {
                var6_int = param0.c((byte) -78, rc.a(-1 + var5, 4));
                var4[var5] = var4[var6_int];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Lobby";
        field_b = new p();
    }
}
