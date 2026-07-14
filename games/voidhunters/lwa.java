/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lwa extends llb {
    private llb field_wb;
    static String field_vb;
    static asb field_xb;

    final boolean a(boolean param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            boolean discarded$2 = ((lwa) this).a(false, true);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              ((lwa) this).a(true, 1332);
              if (0 == pba.field_o) {
                break L3;
              } else {
                if (((lwa) this).field_o == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 == ((lwa) this).field_wb.field_o) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static int e(byte param0) {
        if (param0 != 73) {
            field_vb = null;
        }
        return mw.field_e;
    }

    public static void h(int param0) {
        if (param0 != 0) {
            return;
        }
        field_vb = null;
        field_xb = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param1 != -1) {
            field_vb = null;
        }
        for (var2 = 0; ub.field_f.length > var2; var2++) {
            if (!(ub.field_f[var2] != param0)) {
                return var2;
            }
        }
        return -1;
    }

    lwa(llb param0, llb param1, llb param2, llb param3, llb param4, llb param5) {
        int var12 = 0;
        llb var13 = null;
        llb var14 = null;
        int var15 = 0;
        llb var17 = new llb(0L, param1, cu.field_p.toUpperCase());
        var17.field_F = 1;
        ((lwa) this).field_wb = new llb(0L, param2);
        llb var8 = new llb(0L, param3);
        llb var9 = new llb(0L, param3, kw.field_Jb);
        var9.field_F = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; var12 < skb.field_q.length; var12++) {
            var13 = new llb(0L, param3, pha.field_r[var12]);
            var14 = new llb(0L, param3, skb.field_q[var12]);
            var15 = param3.field_eb.b(skb.field_q[var12]);
            if (var15 > var11) {
                var11 = var15;
            }
            var13.a(20, 121, 65, var10, 15);
            var14.a(90, 124, 640, var10, 15);
            var8.b(-561, var13);
            var10 += 30;
            var8.b(-561, var14);
        }
        var10 += 15;
        var17.a(0, 116, 20 + (var11 - -90), 0, 24);
        ((lwa) this).a(100, 23, var17.field_hb, 100, var10 + var17.field_G);
        ((lwa) this).field_wb.a(-20 + var17.field_hb, 8, 15, 5, 15);
        var8.a(0, 119, ((lwa) this).field_hb, var17.field_G, -var17.field_G + ((lwa) this).field_G);
        var9.a(0, 121, ((lwa) this).field_hb, 20, 15);
        var8.field_gb = uwa.a(11579568, var8.field_G, 2105376, 8421504, 119, 3);
        var17.b(-561, ((lwa) this).field_wb);
        var8.b(-561, var9);
        ((lwa) this).b(-561, var17);
        ((lwa) this).b(-561, var8);
        var10 = -(((lwa) this).field_G >> -1278640639) + 240;
        ((lwa) this).field_L = 320 + -(((lwa) this).field_hb >> 1290878017);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vb = "Loading extra data";
    }
}
