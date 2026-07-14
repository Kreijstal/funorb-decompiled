/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static long field_b;
    static hj field_d;
    static int field_a;

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -2043140287) {
            break L0;
          } else {
            boolean discarded$2 = cm.a(-80);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lk.field_h) {
              break L2;
            } else {
              if (!d.field_f.a(-1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = HoldTheLine.field_D;
          if (param0 == 110) {
            break L0;
          } else {
            cm.a((byte) 84);
            break L0;
          }
        }
        var3 = 0;
        var4 = ie.field_j;
        L1: while (true) {
          if (var3 >= ii.field_b.length) {
            return -1;
          } else {
            var5 = cd.field_f[var3];
            if ((var5 ^ -1) <= -1) {
              var6 = h.a(ii.field_b[var3], (byte) -113, true);
              var7 = -(var6 >> 943837537) + mk.field_i;
              var4 = var4 + dc.field_bb;
              if (!mo.a((vf.field_w << -221223775) + w.field_b, param2, var6 - -(pg.field_G << -2043140287), param1, 27, -pg.field_G + var7, var4)) {
                var4 = var4 + ((vf.field_w << -1855829503) + dc.field_bb - -w.field_b);
                var3++;
                continue L1;
              } else {
                return var5;
              }
            } else {
              var4 = var4 + hn.field_M;
              var3++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -28) {
            field_a = 78;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email (Login):";
    }
}
