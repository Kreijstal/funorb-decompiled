/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static int field_c;
    static String field_a;
    static int field_b;

    final static nc a(int param0, int param1) {
        if (param0 != 2) {
            field_c = 127;
        }
        return mj.field_Hb[param1];
    }

    public static void a(int param0) {
        if (param0 <= 38) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        sc.d((byte) 87);
        if (param0 != 16) {
            gk.a(-7);
        }
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        String stackIn_4_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              jg.field_a = true;
              ic.field_d = param3;
              var11 = param2;
              if (param4) {
                stackIn_4_0 = wf.field_n;
                break L1;
              } else {
                stackIn_4_0 = p.field_b;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (ic.field_d == 0) {
                var7 = mb.a(e.field_c, false, var11, lj.field_t, 480);
                var8 = 3 + var7;
                dn.field_a = new int[var8];
                eo.field_e = new String[var8];
                var9 = 0;
                L3: while (true) {
                  if (var9 >= var8) {
                    oq.field_x = new int[2];
                    var9 = 0;
                    L4: while (true) {
                      if (var7 <= var9) {
                        eo.field_e[-3 + var8] = "";
                        eo.field_e[-2 + var8] = var6;
                        dn.field_a[-2 + var8] = 0;
                        oq.field_x[0] = 1;
                        eo.field_e[var8 + -1] = ic.field_f;
                        dn.field_a[-1 + var8] = 1;
                        oq.field_x[1] = 2;
                        break L2;
                      } else {
                        eo.field_e[var9] = lj.field_t[var9];
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    dn.field_a[var9] = -1;
                    var9++;
                    continue L3;
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
                  L5: while (true) {
                    if (var9 >= var8) {
                      oq.field_x = new int[1];
                      var9 = 0;
                      L6: while (true) {
                        if (var9 >= var7) {
                          eo.field_e[var8 - 2] = "";
                          eo.field_e[-1 + var8] = ic.field_f;
                          dn.field_a[var8 - 1] = 0;
                          oq.field_x[0] = 2;
                          break L2;
                        } else {
                          eo.field_e[var9] = lj.field_t[var9];
                          var9++;
                          continue L6;
                        }
                      }
                    } else {
                      dn.field_a[var9] = -1;
                      var9++;
                      continue L5;
                    }
                  }
                }
              }
            }
            mo.field_Jb.field_c = oq.field_x.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (var8 >= eo.field_e.length) {
                pl.field_F = mo.field_Jb.field_c * (ne.field_tb + pb.field_b << 2059566049);
                mc.field_e = aq.field_x - (-var7 + (var7 >> 577309889));
                ch.field_i = -(var7 >> 2026215201) + aq.field_x;
                var8 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var8 >= eo.field_e.length) {
                        if (param1 == 2) {
                          break L9;
                        } else {
                          break L10;
                        }
                      } else {
                        stackIn_36_0 = pl.field_F;

                        stackIn_36_1 = dn.field_a[var8];

                        L11: {


                          if (stackIn_36_1 < 0) {

                            stackIn_39_1 = dq.field_l;
                            break L11;
                          } else {

                            stackIn_39_1 = po.field_n;
                            break L11;
                          }
                        }
                        pl.field_F = stackIn_36_0 + stackIn_39_1;
                        var8++;
                        continue L8;
                      }
                    }
                    gk.a((byte) -33);
                    break L9;
                  }
                  eb.field_M = -(pl.field_F >> -2077899647) + pm.field_Q;
                  mo.field_Jb.a(0, param0, -31458, aj.a(bo.field_d, false, bd.field_g));
                  break L0;
                }
              } else {
                L12: {
                  if (-1 < (dn.field_a[var8] ^ -1)) {
                    stackIn_26_0 = 0;
                    break L12;
                  } else {
                    stackIn_26_0 = 1;
                    break L12;
                  }
                }
                L13: {
                  var9 = vh.a(stackIn_26_0 != 0, -36, eo.field_e[var8]);
                  if (-1 == dn.field_a[var8]) {
                    break L13;
                  } else {
                    var9 = var9 + wb.field_db * 2;
                    break L13;
                  }
                }
                if (var9 > var7) {
                  var7 = var9;
                  var8++;
                  continue L7;
                } else {
                  var8++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var5);

            stackIn_46_1 = new StringBuilder().append("gk.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L14;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Cancel";
    }
}
