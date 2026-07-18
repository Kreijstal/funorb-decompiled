/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ieb extends rqa {
    static int[] field_o;

    final static void f() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        bc var9 = null;
        int var10 = 0;
        String stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        bc stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        bc stackOut_15_0 = null;
        bc stackOut_14_0 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var1_int = mtb.field_p + -mua.field_d;
            mua.field_d = -(var1_int >> 1) + alb.field_b;
            nl.field_m = -(ot.field_b >> 1) + pba.field_r;
            mtb.field_p = mua.field_d - -var1_int;
            var2 = nl.field_m;
            var3 = 0;
            L1: while (true) {
              if (var3 >= db.field_o.length) {
                break L0;
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
                  stackOut_8_0 = (String) var6;
                  stackOut_8_1 = -37;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (0 > var4) {
                    stackOut_10_0 = (String) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L3;
                  } else {
                    stackOut_9_0 = (String) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    break L3;
                  }
                }
                L4: {
                  var7 = lsa.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0);
                  var8 = -(var7 >> 1) + alb.field_b;
                  if (0 <= var4) {
                    L5: {
                      if (ei.field_c.field_j == var4) {
                        stackOut_15_0 = ska.field_o;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = vhb.field_d;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_16_0;
                      var2 = var2 + pva.field_g;
                      if (var9 == null) {
                        break L6;
                      } else {
                        var9.a((byte) 54, var8 + -ih.field_e, (ih.field_e << 1) + var7, var2, tba.field_o - -(hwa.field_q << 1));
                        break L6;
                      }
                    }
                    var2 = var2 + hwa.field_q;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var4 >= 0) {
                    bl.field_x.c(var6, var8, var2 - -kjb.field_p, var5, -1);
                    var2 = var2 + (pva.field_g + (hwa.field_q + tba.field_o));
                    break L7;
                  } else {
                    oja.field_p.c(var6, var8, var2 - -mab.field_f, var5, -1);
                    var2 = var2 + whb.field_a;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "ieb.B(" + -1321004447 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              si.a(58, 62, param0[0].a(18));
              if (param1 < -119) {
                break L1;
              } else {
                ieb.e(-54);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ieb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(int param0) {
        if (param0 < 112) {
            return;
        }
        msa.field_s = brb.f((byte) 62);
        klb.field_r = new ida();
        int discarded$0 = 0;
        rga.a(true, true);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var2 = -35 % ((-9 - param1) / 32);
            var3 = 0;
            if (param0 < 0) {
              break L1;
            } else {
              if (65536 <= param0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var3 += 16;
          param0 = param0 >>> 16;
          break L0;
        }
        L2: {
          if (param0 >= 256) {
            var3 += 8;
            param0 = param0 >>> 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0 < 16) {
            break L3;
          } else {
            var3 += 4;
            param0 = param0 >>> 4;
            break L3;
          }
        }
        L4: {
          if (4 > param0) {
            break L4;
          } else {
            var3 += 2;
            param0 = param0 >>> 2;
            break L4;
          }
        }
        L5: {
          if (param0 < 1) {
            break L5;
          } else {
            var3++;
            param0 = param0 >>> 1;
            break L5;
          }
        }
        return param0 + var3;
    }

    ieb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a() {
        field_o = null;
    }

    static {
    }
}
