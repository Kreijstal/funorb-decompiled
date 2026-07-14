/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends rqa {
    final static void a(int param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var6 = 0;
        c var6_ref = null;
        int var7 = 0;
        byte[] var8 = null;
        c var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        c var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        L0: {
          var7 = VoidHunters.field_G;
          if (rw.field_q != 0) {
            L1: {
              var2 = wt.a(false);
              var4 = rw.field_q;
              if (0.0 == npa.field_c) {
                break L1;
              } else {
                var4 = (int)((double)var4 + jeb.field_b.nextGaussian() * npa.field_c);
                if (0 > var4) {
                  var4 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (dpa.field_p.field_e > 0) {
                var18 = new byte[dpa.field_p.field_e];
                var16 = var18;
                var14 = var16;
                var11 = var14;
                var8 = var11;
                var19 = var8;
                var6 = 0;
                L3: while (true) {
                  if (var6 >= var18.length) {
                    var6_ref = new c((long)var4 + var2, dpa.field_p.field_e, var19);
                    bfa.field_o.b(param1 ^ 22878, (ksa) (Object) var6_ref);
                    dpa.field_p.field_e = 0;
                    break L2;
                  } else {
                    var8[var6] = dpa.field_p.field_h[var6];
                    var6++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var9 = (c) (Object) bfa.field_o.d(0);
            var13 = var9;
            if (var13 == null) {
              break L0;
            } else {
              if (var13.field_e >= var2) {
                break L0;
              } else {
                var13.b(-3846);
                var10 = 0;
                var6 = var10;
                L4: while (true) {
                  if (var13.field_d <= var10) {
                    dpa.field_p.field_e = var13.field_d;
                    break L0;
                  } else {
                    dpa.field_p.field_h[var10] = var9.field_f[var10];
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (param1 == -29008) {
            break L5;
          } else {
            ui.a(-118, -73);
            break L5;
          }
        }
        lnb.b(param0, 115);
    }

    ui(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        oma.field_i = param0[0].d(0);
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    static {
    }
}
