/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static ge field_a;

    final static void b(int param0) {
        int var1 = -66 % ((param0 - -11) / 59);
        sb.field_g = new kh();
        t.field_h.c(20317, (uj) (Object) sb.field_g);
    }

    final static fb a(int param0, boolean param1) {
        ia var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        ia var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var7 = StarCannon.field_A;
        var8 = se.field_p;
        var2 = var8;
        var3 = var8.j(7909);
        if (param0 == 13607) {
          L0: {
            pf.field_e = var3 & 127;
            if ((var3 & 128) == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            cf.field_r = stackIn_5_0 != 0;
            lj.field_i = var8.j(7909);
            ne.field_d = var8.c((byte) 5);
            if (pf.field_e == 2) {
              wc.field_f = var8.i(-1174051992);
              tk.field_e = var8.g(127);
              break L1;
            } else {
              wc.field_f = 0;
              tk.field_e = 0;
              break L1;
            }
          }
          L2: {
            if (1 != var8.j(7909)) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_12_0;
            ee.field_d = var8.a(-117);
            if (var4 != 0) {
              fb.field_e = var8.a(-72);
              break L3;
            } else {
              fb.field_e = ee.field_d;
              break L3;
            }
          }
          L4: {
            L5: {
              if (1 == pf.field_e) {
                break L5;
              } else {
                if (pf.field_e == 4) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            int discarded$2 = var8.i(-1174051992);
            String discarded$3 = var8.a(-95);
            break L4;
          }
          vd.field_e = ha.a((rb) (Object) var8, 80, 0);
          se.field_o = null;
          return new fb(false);
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ge();
    }
}
