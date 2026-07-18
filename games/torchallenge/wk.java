/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends ic {
    static int field_G;
    static int field_F;

    final static void a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (da.field_c != null) {
                da.field_c.o(77);
                break L1;
              } else {
                break L1;
              }
            }
            kb.field_O = new fg(param2, param0, false, true, true);
            bg.field_K.c(0, (ee) (Object) kb.field_O);
            if (param1 < -27) {
              break L0;
            } else {
              var4 = null;
              wk.a((String) null, -113, (String) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("wk.S(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static ef a(String[] args, int param1) {
        ef var2 = null;
        RuntimeException var2_ref = null;
        ef stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_2_0 = null;
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
              var2 = new ef(false);
              if (param1 == -1) {
                break L1;
              } else {
                wk.c(false);
                break L1;
              }
            }
            var2.field_b = args;
            stackOut_2_0 = (ef) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("wk.P(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
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
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        uk var7 = null;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var8 = 16 / ((param1 - -29) / 39);
              super.a(param0, (byte) -124, param2, param3, param4, param5);
              var7 = gl.field_b;
              if (var7 == null) {
                break L1;
              } else {
                if (!((wk) this).a(param5, param4, param0, -29991, param3)) {
                  break L1;
                } else {
                  if (!(((wk) this).field_k instanceof f)) {
                    if (var7.field_k instanceof f) {
                      ((f) (Object) var7.field_k).a(var7, (wk) this, false);
                      gl.field_b = null;
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    ((f) (Object) ((wk) this).field_k).a(var7, (wk) this, false);
                    gl.field_b = null;
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("wk.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ka var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = 8;
              if (null != ql.field_l) {
                break L1;
              } else {
                ql.field_l = new int[2];
                var3 = e.b((byte) 57, 3);
                var4 = e.b((byte) 57, 2);
                var8 = -1;
                ql.field_l[0] = var3;
                var9 = 0;
                L2: while (true) {
                  L3: {
                    if (var9 >= 3) {
                      break L3;
                    } else {
                      L4: {
                        if (var3 != var9) {
                          var8++;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (var8 != var4) {
                        var9++;
                        continue L2;
                      } else {
                        var4 = var9;
                        break L3;
                      }
                    }
                  }
                  ql.field_l[1] = var4;
                  break L1;
                }
              }
            }
            L5: {
              if (null != vj.field_d) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L5;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L5;
              }
            }
            L6: {
              var8 = stackIn_14_0;
              if (var8 != 0) {
                break L6;
              } else {
                var12 = 0;
                var9 = var12;
                L7: while (true) {
                  if (vj.field_d.length <= var12) {
                    break L6;
                  } else {
                    L8: {
                      if (vj.field_d[var12] == null) {
                        var8 = 1;
                        var12++;
                        break L8;
                      } else {
                        var12++;
                        break L8;
                      }
                    }
                    var12++;
                    continue L7;
                  }
                }
              }
            }
            L9: {
              if (var8 != 0) {
                e.a((byte) -99, var6);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var3 = ql.field_l[0];
              var7 = vj.field_d[var3];
              var5 = dg.field_M[var3][0][2];
              var2 = dg.field_M[var3][0][1];
              var1_int = dg.field_M[var3][0][0];
              if (var5 >= 0) {
                break L10;
              } else {
                cg.field_g.d();
                qg.b();
                var7.d(0, 0);
                la.field_f.a(117);
                var7 = cg.field_g;
                break L10;
              }
            }
            L11: {
              var7.b(var1_int + -var6, -var6 + var2, 256);
              var7 = we.field_m[1 + var3];
              if (var5 >= 0) {
                var7.g(var1_int, var2);
                break L11;
              } else {
                var7.d(var1_int, var2);
                break L11;
              }
            }
            L12: {
              var4 = ql.field_l[1];
              var2 = dg.field_M[var4][1][1];
              var1_int = dg.field_M[var4][1][0];
              var7 = vj.field_d[var4];
              var5 = dg.field_M[var4][1][2];
              if (var5 >= 0) {
                break L12;
              } else {
                cg.field_g.d();
                qg.b();
                var7.d(0, 0);
                la.field_f.a(126);
                var7 = cg.field_g;
                break L12;
              }
            }
            L13: {
              var7.b(-var6 + var1_int, -var6 + var2, 256);
              var7 = we.field_m[var4 + 1];
              if (param0) {
                break L13;
              } else {
                var11 = null;
                ef discarded$1 = wk.a((String[]) null, -30);
                break L13;
              }
            }
            L14: {
              if (var5 >= 0) {
                var7.g(var1_int, var2);
                break L14;
              } else {
                var7.d(var1_int, var2);
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "wk.R(" + param0 + ')');
        }
    }

    private wk(int param0, int param1, int param2, int param3, j param4, gg param5, ee param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((wk) this).field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "wk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 0;
    }
}
