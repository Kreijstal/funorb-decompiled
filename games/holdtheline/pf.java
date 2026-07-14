/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf implements hd {
    static oa field_g;
    static String field_b;
    static int[] field_c;
    int field_e;
    static int field_d;
    static String field_f;
    int field_a;

    final static void a(boolean param0) {
        ij.c(4);
        if (!(null == kd.field_b)) {
            om.a(-46342, kd.field_b);
        }
        co.a(param0);
        lg.b(true);
        jk.a(27370);
        if (!(!cm.a(-2043140287))) {
            da.field_p.c((byte) 33, 1);
            qn.a(0, 0);
        }
        r.a(-28036);
    }

    final static hj a(byte param0) {
        if (param0 >= -117) {
            field_c = null;
            return ai.field_c;
        }
        return ai.field_c;
    }

    final static int a(byte param0, int param1) {
        if (-1 != (param1 ^ -1)) {
          if (of.a(-969)) {
            if (param1 > ao.field_b) {
              return 1;
            } else {
              if (param0 <= 0) {
                hj discarded$4 = pf.a((byte) -18);
                return 0;
              } else {
                return 0;
              }
            }
          } else {
            return 2;
          }
        } else {
          if (param1 > ao.field_b) {
            return 1;
          } else {
            if (param0 <= 0) {
              hj discarded$5 = pf.a((byte) -18);
              return 0;
            } else {
              return 0;
            }
          }
        }
    }

    public final int a(byte param0, hd param1) {
        pf var3 = null;
        int var4 = 0;
        var3 = (pf) (Object) param1;
        var4 = -(var3.field_e * var3.field_a) + var3.field_e * var3.field_a;
        if (param0 != -101) {
          L0: {
            int discarded$1 = pf.a((byte) 83, 126);
            if (var4 != 0) {
              break L0;
            } else {
              var4 = var3.field_a * var3.field_a + (-(var3.field_a * var3.field_a) + var3.field_e * var3.field_e) - var3.field_e * var3.field_e;
              break L0;
            }
          }
          return var4;
        } else {
          L1: {
            if (var4 != 0) {
              break L1;
            } else {
              var4 = var3.field_a * var3.field_a + (-(var3.field_a * var3.field_a) + var3.field_e * var3.field_e) - var3.field_e * var3.field_e;
              break L1;
            }
          }
          return var4;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_f = null;
        if (param0 <= 8) {
            pf.b((byte) -9);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Orb points: <%0>";
        field_c = new int[]{0, 2, 4, 7};
        field_f = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
