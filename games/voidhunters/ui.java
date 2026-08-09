/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends rqa {
    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        c var6_ref_c = null;
        int var7 = 0;
        byte[] var8 = null;
        c var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        c var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (rw.field_q != 0) {
                L2: {
                  var2_long = wt.a(false);
                  var4 = rw.field_q;
                  if (0.0 == npa.field_c) {
                    break L2;
                  } else {
                    var4 = (int)((double)var4 + jeb.field_b.nextGaussian() * npa.field_c);
                    if (0 > var4) {
                      var4 = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (dpa.field_p.field_e > 0) {
                    var14 = new byte[dpa.field_p.field_e];
                    var11 = var14;
                    var8 = var11;
                    var17 = var8;
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= var14.length) {
                        var6_ref_c = new c((long)var4 + var2_long, dpa.field_p.field_e, var17);
                        bfa.field_o.b(param1 ^ 22878, var6_ref_c);
                        dpa.field_p.field_e = 0;
                        break L3;
                      } else {
                        var8[var6] = dpa.field_p.field_h[var6];
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var9 = (c) ((Object) bfa.field_o.d(0));
                var13 = var9;
                if (var13 == null) {
                  break L1;
                } else {
                  if (var13.field_e >= var2_long) {
                    break L1;
                  } else {
                    var13.b(-3846);
                    var10 = 0;
                    var6 = var10;
                    L5: while (true) {
                      if (var13.field_d <= var10) {
                        dpa.field_p.field_e = var13.field_d;
                        break L1;
                      } else {
                        dpa.field_p.field_h[var10] = var9.field_f[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (param1 == -29008) {
                break L6;
              } else {
                ui.a(-118, -73);
                break L6;
              }
            }
            lnb.b(param0, 115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "ui.B(" + param0 + ',' + param1 + ')');
        }
    }

    ui(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            oma.field_i = param0[0].d(0);
            if (param1 <= -119) {
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ui.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
