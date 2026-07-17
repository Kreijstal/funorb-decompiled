/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends mi {
    static String field_G;
    static String[] field_I;
    static o[] field_H;

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param1 < -86) {
              int discarded$2 = 1;
              var3 = ag.a(param0);
              if (-1 != param2.indexOf(param0)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (param2.indexOf(var3) == -1) {
                  L1: {
                    L2: {
                      if (param2.startsWith(param0)) {
                        break L2;
                      } else {
                        if (param2.startsWith(var3)) {
                          break L2;
                        } else {
                          if (param2.endsWith(param0)) {
                            break L2;
                          } else {
                            if (!param2.endsWith(var3)) {
                              stackOut_14_0 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L1;
                  }
                  break L0;
                } else {
                  return true;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("pd.MA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_15_0 != 0;
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = wizardrun.field_H;
          if (hl.field_a <= 0) {
            if (e.a(-89)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            L1: {
              if (null == oa.field_c) {
                ki.field_E = hb.a(0, 640, 0, 480, 0, ld.field_g);
                break L1;
              } else {
                ki.field_E = oa.field_c.c(0);
                rc.a(0, 2);
                break L1;
              }
            }
            if (ki.field_E != null) {
              var2 = 2;
              jf.a(false, (java.awt.Canvas) (Object) ki.field_E);
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          }
        }
        L2: {
          if (null != oa.field_c) {
            int discarded$4 = -89;
            pd.f();
            break L2;
          } else {
            if (!dg.field_b) {
              int discarded$5 = -89;
              pd.f();
              break L2;
            } else {
              int discarded$6 = 15991;
              le.a(param0, var2);
              int discarded$7 = -89;
              pd.f();
              break L2;
            }
          }
        }
    }

    final static void d(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        mg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        pg var11 = null;
        mg var12 = null;
        int[] var13 = null;
        te var14 = null;
        te var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var12 = nk.field_N;
              var2 = var12.f(255);
              if (var2 != 0) {
                if (var2 == 1) {
                  var11 = (pg) (Object) sf.field_j.b((byte) 123);
                  if (var11 == null) {
                    ql.a(-58);
                    return;
                  } else {
                    var11.a(false);
                    break L1;
                  }
                } else {
                  if (var2 == 2) {
                    var15 = (te) (Object) bk.field_d.b((byte) 48);
                    if (var15 != null) {
                      var15.field_l = mh.m(-26421);
                      var15.field_i = true;
                      var15.field_j = var15.field_l[0];
                      var15.a(false);
                      break L1;
                    } else {
                      ql.a(-34);
                      return;
                    }
                  } else {
                    int discarded$1 = 6;
                    rg.a((Throwable) null, "A1: " + ni.c(), -562);
                    ql.a(-109);
                    break L1;
                  }
                }
              } else {
                var10 = mh.m(-26421);
                var18 = var10;
                var17 = var18;
                var16 = var17;
                var13 = var16;
                var3 = var13;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((va) (Object) var5).f(255);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var14 = (te) (Object) bk.field_d.b((byte) 97);
                    if (var14 == null) {
                      ql.a(-113);
                      return;
                    } else {
                      var14.field_l = var3;
                      var14.field_j = var18[0];
                      var14.field_i = true;
                      var14.a(false);
                      break L1;
                    }
                  } else {
                    var9[var7] = ((va) (Object) var5).i(255);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "pd.OA(" + 0 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        pj var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5 + param5);
              var7 = tg.field_h;
              if (var7 == null) {
                break L1;
              } else {
                if (!((pd) this).b(param1, param3, 0, param0, param2)) {
                  break L1;
                } else {
                  if (!(((pd) this).field_s instanceof qg)) {
                    if (!(var7.field_s instanceof qg)) {
                      break L1;
                    } else {
                      ((qg) (Object) var7.field_s).a(var7, -106, (pd) this);
                      tg.field_h = null;
                      break L1;
                    }
                  } else {
                    ((qg) (Object) ((pd) this).field_s).a(var7, -95, (pd) this);
                    tg.field_h = null;
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7_ref;
            stackOut_7_1 = new StringBuilder().append("pd.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param5 + 41);
        }
    }

    private pd(int param0, int param1, int param2, int param3, bf param4, ce param5, ub param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((pd) this).field_F = param6;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "pd.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    public static void f() {
        field_I = null;
        field_G = null;
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "You and your friends have not";
    }
}
