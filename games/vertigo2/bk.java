/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static String field_d;
    private boolean field_e;
    static String field_b;
    private boolean field_c;
    static int field_f;
    private String field_a;

    final String d(byte param0) {
        if (param0 < 104) {
            ((bk) this).field_e = false;
            return ((bk) this).field_a;
        }
        return ((bk) this).field_a;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mp var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        String stackIn_9_1 = null;
        int stackIn_10_0 = 0;
        String stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        String stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        mp stackIn_16_0 = null;
        int stackOut_8_0 = 0;
        String stackOut_8_1 = null;
        int stackOut_10_0 = 0;
        String stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_9_0 = 0;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        mp stackOut_15_0 = null;
        mp stackOut_14_0 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        var1 = qp.field_d - pk.field_o;
        pk.field_o = ni.field_a - (var1 >> -1072467359);
        qp.field_d = var1 + pk.field_o;
        if (param0 >= -90) {
          return;
        } else {
          ui.field_d = -(sf.field_d >> 708339521) + kf.field_b;
          var2 = ui.field_d;
          var3 = 0;
          L0: while (true) {
            if (al.field_y.length <= var3) {
              return;
            } else {
              L1: {
                var4 = dg.field_f[var3];
                if (-1 < (var4 ^ -1)) {
                  var5 = t.field_c;
                  break L1;
                } else {
                  if (var4 == kg.field_G.field_c) {
                    var5 = vm.field_b;
                    break L1;
                  } else {
                    var5 = vg.field_d;
                    break L1;
                  }
                }
              }
              L2: {
                var6 = al.field_y[var3];
                stackOut_8_0 = 127;
                stackOut_8_1 = (String) var6;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (0 > var4) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = (String) (Object) stackIn_10_1;
                  stackOut_10_2 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L2;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = (String) (Object) stackIn_9_1;
                  stackOut_9_2 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L2;
                }
              }
              L3: {
                var7 = ao.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0);
                var8 = -(var7 >> -590984703) + ni.field_a;
                if (0 <= var4) {
                  L4: {
                    var2 = var2 + vo.field_y;
                    if (kg.field_G.field_c != var4) {
                      stackOut_15_0 = od.field_Jb;
                      stackIn_16_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = td.field_a;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  L5: {
                    var9 = stackIn_16_0;
                    if (var9 != null) {
                      var9.a(ml.field_v + (eb.field_h << -2019023359), -hc.field_a + var8, var2, (hc.field_a << -1797162335) + var7, -59);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var2 = var2 + eb.field_h;
                  break L3;
                } else {
                  break L3;
                }
              }
              if ((var4 ^ -1) <= -1) {
                hd.field_f.b(var6, var8, hq.field_r + var2, var5, -1);
                var2 = var2 + (ml.field_v + vo.field_y + eb.field_h);
                var3++;
                var3++;
                continue L0;
              } else {
                oc.field_s.b(var6, var8, jm.field_G + var2, var5, -1);
                var2 = var2 + cd.field_a;
                var3++;
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        ((bk) this).field_e = param1 ? true : false;
        ((bk) this).field_c = true;
        if (param0 != 0) {
            bk.b((byte) 100);
        }
    }

    final static er[] a(int param0, int param1, r param2, int param3) {
        Object var5 = null;
        if (param3 == -2724) {
          if (!hq.a(124, param0, param1, param2)) {
            return null;
          } else {
            return wa.c(param3 + 2846);
          }
        } else {
          var5 = null;
          er[] discarded$5 = bk.a(-14, -96, (r) null, 39);
          if (!hq.a(124, param0, param1, param2)) {
            return null;
          } else {
            return wa.c(param3 + 2846);
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    final boolean a(byte param0) {
        if (param0 >= -61) {
            return true;
        }
        return ((bk) this).field_c;
    }

    final boolean c(byte param0) {
        if (param0 > -109) {
            bk.b((byte) -90);
            return ((bk) this).field_e;
        }
        return ((bk) this).field_e;
    }

    bk(String param0) {
        ((bk) this).field_e = false;
        ((bk) this).field_c = false;
        ((bk) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Retry";
        field_b = "All players have left <%0>'s game.";
        field_f = 0;
    }
}
