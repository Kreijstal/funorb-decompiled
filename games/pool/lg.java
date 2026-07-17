/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends am {
    static String field_v;
    static String field_y;
    static sj field_s;
    private pf field_t;
    static int field_x;
    static String field_w;
    private pf[] field_u;
    static String field_r;

    private final void a(boolean param0, lg param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pf var5 = null;
        pf var6 = null;
        int var7 = 0;
        pf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pf stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pf stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        pf stackIn_11_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        pf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pf stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        pf stackOut_10_2 = null;
        pf stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pf stackOut_9_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            super.a(-1177150015, (am) (Object) param1);
            L1: {
              if (param0) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((lg) this).field_u[var4_int];
                      if (var5 == null) {
                        param1.field_u[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param1.field_u[var4_int];
                          stackOut_8_0 = (pf) var5;
                          stackOut_8_1 = 288;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var6 == null) {
                            pf dupTemp$25 = new pf();
                            param1.field_u[var4_int] = dupTemp$25;
                            stackOut_10_0 = (pf) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (pf) dupTemp$25;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L4;
                          } else {
                            stackOut_9_0 = (pf) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (pf) var6;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L4;
                          }
                        }
                        ((pf) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                qn.a((Object[]) (Object) ((lg) this).field_u, 0, (Object[]) (Object) param1.field_u, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("lg.CA(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 89 + 41);
        }
    }

    public lg() {
        ((lg) this).field_u = new pf[6];
        ((lg) this).field_t = new pf();
        pf dupTemp$0 = new pf();
        ((lg) this).field_u[0] = dupTemp$0;
        pf var1 = dupTemp$0;
        var1.a(-51);
    }

    final void a(dd param0, int param1) {
        pf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        pf var6 = null;
        int var7 = 0;
        pf[] var8 = null;
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
        var7 = Pool.field_O;
        try {
          L0: {
            var8 = ((lg) this).field_u;
            var3 = var8;
            var5 = 78 / ((29 - param1) / 36);
            var4 = 0;
            L1: while (true) {
              if (var4 >= var8.length) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var4];
                  if (var6 != null) {
                    var6.field_b = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("lg.EA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final void a(byte param0, int param1, dd[] param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (((lg) this).field_u[var4_int] == null) {
                ((lg) this).field_u[var4_int] = new pf();
            }
            if (param0 != -79) {
                ke discarded$0 = lg.c(-45);
            }
            ((lg) this).field_u[param1].field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "lg.BA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final pf b(int param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            ((lg) this).a((dd) null, -125);
        }
        pf dupTemp$0 = new pf();
        ((lg) this).field_u[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void a() {
        field_v = null;
        field_w = null;
        field_r = null;
        field_y = null;
        field_s = null;
    }

    final void a(dd[] param0, int param1) {
        pf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pf var5 = null;
        int var6 = 0;
        pf[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            var7 = ((lg) this).field_u;
            var3 = var7;
            if (param1 == 6) {
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_j = param0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("lg.DA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        RuntimeException var6 = null;
        pf var7 = null;
        int var8 = 0;
        pf var10 = null;
        fe var11 = null;
        pf var12 = null;
        pf var13 = null;
        pf var14 = null;
        pf var15 = null;
        ei stackIn_3_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ei stackOut_1_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof fe)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ei) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ei) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (fe) (Object) stackIn_3_0;
              wh.a(param1 + param4.field_C, param4.field_D + param3, param4.field_l + (param4.field_C + param1), (byte) 85, param4.field_y + (param4.field_D + param3));
              if (var11 != null) {
                param0 = param0 & var11.field_I;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = -10 / ((param2 - 2) / 41);
              var7 = ((lg) this).field_u[0];
              ((lg) this).field_t.a(-107);
              var7.a((lg) this, param3, ((lg) this).field_t, -116, param4, param1);
              if (var11 == null) {
                break L3;
              } else {
                L4: {
                  if (var11.field_G) {
                    var12 = ((lg) this).field_u[1];
                    if (var12 != null) {
                      var12.a((lg) this, param3, ((lg) this).field_t, -103, param4, param1);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (!var11.field_s) {
                  break L3;
                } else {
                  L5: {
                    var13 = ((lg) this).field_u[3];
                    if (var11.field_n == 0) {
                      break L5;
                    } else {
                      if (var13 == null) {
                        break L5;
                      } else {
                        var13.a((lg) this, param3, ((lg) this).field_t, -113, param4, param1);
                        break L3;
                      }
                    }
                  }
                  var10 = ((lg) this).field_u[2];
                  if (var10 == null) {
                    break L3;
                  } else {
                    var10.a((lg) this, param3, ((lg) this).field_t, -108, param4, param1);
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (param4.d(66)) {
                var14 = ((lg) this).field_u[5];
                if (var14 == null) {
                  break L6;
                } else {
                  var14.a((lg) this, param3, ((lg) this).field_t, -128, param4, param1);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (param0) {
                break L7;
              } else {
                var15 = ((lg) this).field_u[4];
                if (var15 == null) {
                  break L7;
                } else {
                  var15.a((lg) this, param3, ((lg) this).field_t, -112, param4, param1);
                  break L7;
                }
              }
            }
            ((lg) this).field_t.a(param3, param1, param4, (lg) this, 110);
            oc.a(121);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("lg.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    lg(lg param0, boolean param1) {
        this();
        try {
            int discarded$0 = 89;
            param0.a(param1, (lg) this);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "lg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static ke c(int param0) {
        if (param0 != 5) {
            ke discarded$0 = lg.c(-37);
        }
        int discarded$1 = 1;
        return new ke(gd.a(true), mn.a());
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Change display name";
        field_v = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_w = "Play free version";
        field_r = "Names cannot start or end with space or underscore";
    }
}
