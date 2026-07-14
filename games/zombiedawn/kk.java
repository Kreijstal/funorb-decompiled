/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends le {
    int field_l;
    static vo field_j;
    static String field_k;
    static sg field_i;
    int field_h;
    static jp field_m;

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -251) {
          L0: {
            field_m = null;
            if ((ej.field_x ^ -1) >= -251) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((ej.field_x ^ -1) >= -251) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(byte param0) {
        if (param0 >= -102) {
          field_k = null;
          field_j = null;
          field_i = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_j = null;
          field_i = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final kk c(int param0) {
        if (param0 < 36) {
          field_m = null;
          return new kk(((kk) this).field_l, ((kk) this).field_h);
        } else {
          return new kk(((kk) this).field_l, ((kk) this).field_h);
        }
    }

    kk(int param0, int param1) {
        ((kk) this).field_h = param1;
        ((kk) this).field_l = param0;
    }

    final static oi a(int param0, byte[] param1) {
        oi var2 = null;
        if (param1 != null) {
          var2 = new oi(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, vj.field_m);
          no.f((byte) -87);
          if (param0 != -16491) {
            kk.c((byte) -90);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new vo();
        field_m = new jp(1);
    }
}
