/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pa {
    static gq field_d;
    static int field_b;
    static String field_a;
    static int field_c;
    static sm[] field_e;

    final static hi a(int param0, boolean param1) {
        df var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        df var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var7 = Torquing.field_u;
          var8 = kj.field_d;
          var2 = var8;
          var3 = var8.i((byte) -101);
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          fd.field_a = stackIn_3_0 != 0;
          n.field_u = var3 & 127;
          hh.field_a = var8.i((byte) -101);
          pm.field_r = var8.b(9);
          if (n.field_u != 2) {
            bg.field_n = 0;
            oh.field_b = 0;
            break L1;
          } else {
            bg.field_n = var8.i(7088);
            oh.field_b = var8.e((byte) 62);
            break L1;
          }
        }
        L2: {
          if (var8.i((byte) -101) != 1) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L2;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_11_0;
          un.field_c = var8.h((byte) 125);
          if (var4 == 0) {
            dg.field_m = un.field_c;
            break L3;
          } else {
            dg.field_m = var8.h((byte) 119);
            break L3;
          }
        }
        L4: {
          if (n.field_u == 1) {
            int discarded$4 = var8.i(7088);
            String discarded$5 = var8.h((byte) 125);
            break L4;
          } else {
            if (n.field_u != 4) {
              break L4;
            } else {
              int discarded$6 = var8.i(7088);
              String discarded$7 = var8.h((byte) 125);
              break L4;
            }
          }
        }
        L5: {
          if (param0 == -11936) {
            break L5;
          } else {
            field_c = -78;
            break L5;
          }
        }
        np.field_m = Torquing.a(26657, 80, (fj) (Object) var8);
        md.field_a = null;
        return new hi(false);
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static dn b(int param0, boolean param1) {
        if (param0 < 6) {
            field_a = null;
        }
        dn var2 = new dn(true);
        var2.field_g = false;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new gq(0);
        field_a = "Waiting for levels";
    }
}
