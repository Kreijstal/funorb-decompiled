/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ieb extends rqa {
    static int[] field_o;

    final static void f(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        bc var9 = null;
        int var10 = 0;
        String stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        bc stackIn_17_0 = null;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        bc stackOut_16_0 = null;
        bc stackOut_15_0 = null;
        L0: {
          var10 = VoidHunters.field_G;
          var1 = mtb.field_p + -mua.field_d;
          mua.field_d = -(var1 >> -1983901951) + alb.field_b;
          if (param0 == -1321004447) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        nl.field_m = -(ot.field_b >> 1268082497) + pba.field_r;
        mtb.field_p = mua.field_d - -var1;
        var2 = nl.field_m;
        var3 = 0;
        L1: while (true) {
          if (var3 >= db.field_o.length) {
            return;
          } else {
            L2: {
              var4 = aka.field_o[var3];
              if (0 <= var4) {
                if (var4 == ei.field_c.field_j) {
                  var5 = mb.field_j;
                  break L2;
                } else {
                  var5 = eqa.field_o;
                  break L2;
                }
              } else {
                var5 = fda.field_o;
                break L2;
              }
            }
            L3: {
              var6 = db.field_o[var3];
              stackOut_9_0 = (String) var6;
              stackOut_9_1 = -37;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              if (0 > var4) {
                stackOut_11_0 = (String) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                break L3;
              } else {
                stackOut_10_0 = (String) (Object) stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                break L3;
              }
            }
            L4: {
              var7 = lsa.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0);
              var8 = -(var7 >> -1641760575) + alb.field_b;
              if (0 <= var4) {
                L5: {
                  if (ei.field_c.field_j == var4) {
                    stackOut_16_0 = ska.field_o;
                    stackIn_17_0 = stackOut_16_0;
                    break L5;
                  } else {
                    stackOut_15_0 = vhb.field_d;
                    stackIn_17_0 = stackOut_15_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = stackIn_17_0;
                  var2 = var2 + pva.field_g;
                  if (var9 == null) {
                    break L6;
                  } else {
                    var9.a((byte) 54, var8 + -ih.field_e, (ih.field_e << -1321004447) + var7, var2, tba.field_o - -(hwa.field_q << 1547744449));
                    break L6;
                  }
                }
                var2 = var2 + hwa.field_q;
                break L4;
              } else {
                break L4;
              }
            }
            if (var4 >= 0) {
              bl.field_x.c(var6, var8, var2 - -kjb.field_p, var5, -1);
              var2 = var2 + (pva.field_g + (hwa.field_q + tba.field_o));
              var3++;
              continue L1;
            } else {
              oja.field_p.c(var6, var8, var2 - -mab.field_f, var5, -1);
              var2 = var2 + whb.field_a;
              var3++;
              continue L1;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(58, 62, param0[0].a(18));
        if (param1 >= -119) {
            ieb.e(-54);
        }
        return new nc((Object) (Object) "void");
    }

    final static void e(int param0) {
        if (param0 < 112) {
            return;
        }
        msa.field_s = brb.f((byte) 62);
        klb.field_r = new ida();
        rga.a(true, true, false);
    }

    final static int a(int param0, int param1) {
        int var2 = -35 % ((-9 - param1) / 32);
        int var3 = 0;
        if (param0 >= 0) {
            // if_icmple L26
        } else {
            var3 += 16;
            param0 = param0 >>> 16;
        }
        if (!(-257 < param0)) {
            var3 += 8;
            param0 = param0 >>> 8;
        }
        if (-17 <= param0) {
            var3 += 4;
            param0 = param0 >>> 4;
        }
        if (4 <= param0) {
            var3 += 2;
            param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
            var3++;
            param0 = param0 >>> 1;
        }
        return param0 + var3;
    }

    ieb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 <= 79) {
            field_o = null;
        }
        field_o = null;
    }

    static {
    }
}
