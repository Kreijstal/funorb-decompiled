/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static int field_c;
    static String field_a;
    static int field_b;

    final static nc a(int param0, int param1) {
        return mj.field_Hb[param1];
    }

    public static void a(int param0) {
        field_a = null;
    }

    final static void a() {
        sc.d((byte) 87);
    }

    final static void a(boolean param0, int param1, String param2) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              jg.field_a = true;
              ic.field_d = 1;
              var11 = param2;
              var6 = wf.field_n;
              if (ic.field_d == 0) {
                var7 = mb.a(e.field_c, false, var11, lj.field_t, 480);
                var8 = 3 + var7;
                dn.field_a = new int[var8];
                eo.field_e = new String[var8];
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var8) {
                    oq.field_x = new int[2];
                    var9 = 0;
                    L3: while (true) {
                      if (var7 <= var9) {
                        eo.field_e[-3 + var8] = "";
                        eo.field_e[-2 + var8] = var6;
                        dn.field_a[-2 + var8] = 0;
                        oq.field_x[0] = 1;
                        eo.field_e[var8 + -1] = ic.field_f;
                        dn.field_a[-1 + var8] = 1;
                        oq.field_x[1] = 2;
                        break L1;
                      } else {
                        eo.field_e[var9] = lj.field_t[var9];
                        var9++;
                        continue L3;
                      }
                    }
                  } else {
                    dn.field_a[var9] = -1;
                    var9++;
                    continue L2;
                  }
                }
              } else {
                if (1 != ic.field_d) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = mb.a(e.field_c, false, var11, lj.field_t, 480);
                  var8 = var7 + 2;
                  dn.field_a = new int[var8];
                  eo.field_e = new String[var8];
                  var9 = 0;
                  L4: while (true) {
                    if (var9 >= var8) {
                      oq.field_x = new int[1];
                      var9 = 0;
                      L5: while (true) {
                        if (var9 >= var7) {
                          eo.field_e[var8 - 2] = "";
                          eo.field_e[-1 + var8] = ic.field_f;
                          dn.field_a[var8 - 1] = 0;
                          oq.field_x[0] = 2;
                          break L1;
                        } else {
                          eo.field_e[var9] = lj.field_t[var9];
                          var9++;
                          continue L5;
                        }
                      }
                    } else {
                      dn.field_a[var9] = -1;
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
            mo.field_Jb.field_c = oq.field_x.length;
            var7 = 0;
            var8 = 0;
            L6: while (true) {
              if (var8 >= eo.field_e.length) {
                pl.field_F = mo.field_Jb.field_c * (ne.field_tb + pb.field_b << 1);
                mc.field_e = aq.field_x - (-var7 + (var7 >> 1));
                ch.field_i = -(var7 >> 1) + aq.field_x;
                var8 = 0;
                L7: while (true) {
                  if (var8 >= eo.field_e.length) {
                    eb.field_M = -(pl.field_F >> 1) + pm.field_Q;
                    mo.field_Jb.a(0, true, -31458, aj.a(bo.field_d, false, bd.field_g));
                    break L0;
                  } else {
                    L8: {
                      stackOut_30_0 = pl.field_F;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (dn.field_a[var8] < 0) {
                        stackOut_32_0 = stackIn_32_0;
                        stackOut_32_1 = dq.field_l;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        break L8;
                      } else {
                        stackOut_31_0 = stackIn_31_0;
                        stackOut_31_1 = po.field_n;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        break L8;
                      }
                    }
                    pl.field_F = stackIn_33_0 + stackIn_33_1;
                    var8++;
                    continue L7;
                  }
                }
              } else {
                L9: {
                  if (dn.field_a[var8] < 0) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L9;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L9;
                  }
                }
                L10: {
                  var9 = vh.a(stackIn_23_0 != 0, -36, eo.field_e[var8]);
                  if (-1 == dn.field_a[var8]) {
                    break L10;
                  } else {
                    var9 = var9 + wb.field_db * 2;
                    break L10;
                  }
                }
                L11: {
                  if (var9 <= var7) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("gk.A(").append(1).append(44).append(2).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + 1 + 44 + 1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel";
    }
}
