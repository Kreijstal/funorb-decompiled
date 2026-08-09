/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj implements j {
    static ga field_d;
    private int field_a;
    private int field_c;
    private int field_b;
    private int field_g;
    private mg field_e;
    private int field_f;
    private int field_h;

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        rc stackIn_4_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hh var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 instanceof hh) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = (rc) (param4);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = (hh) ((Object) stackIn_4_0);
                        if (var12 == null) {
                            statePc = 5;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        mi.b(param3 - -param4.field_m, param4.field_j + param1, param4.field_t, param4.field_x, this.field_c);
                        var7 = -(var12.field_I * 2) + param4.field_t;
                        if (param0 >= 113) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_e = (mg) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = param3 - -param4.field_m - -var12.field_I;
                        var9 = param1 + param4.field_j - -var12.field_L;
                        mi.e(var8, var9, var8 - -var7, var9, this.field_g);
                        var10 = var12.i(-85) - 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var10 < 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        mi.e(var8 + var12.b(var10, -96) * var7 / var12.a(-3), var9, this.field_b, this.field_f);
                        var10--;
                        if (var11 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_e != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_e.a(var12.field_i, var7 / 2 + var8, var9 + this.field_e.field_x + var12.field_L, this.field_h, this.field_a);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var6);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("sj.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param4 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_d = (ga) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeMouseListener(ee.field_j);
            param0.removeMouseMotionListener(ee.field_j);
            param0.removeFocusListener(ee.field_j);
            if (param1 > -24) {
                field_d = (ga) null;
            }
            u.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "sj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, bl param1, int param2) {
        if (param2 != -7471) {
            return;
        }
        try {
            m.field_h.a(param1, -7044);
            la.a(0, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "sj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_d = (ga) null;
                break L1;
              }
            }
            stackIn_3_0 = tg.a(false, -126, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("sj.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (dl.field_t.startsWith("win")) {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param1.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_7_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var3 = 33 % ((35 - param0) / 35);
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var4 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (param1.length() <= var4) {
                          break L5;
                        } else {
                          stackIn_17_0 = 0;

                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (stackIn_17_0 == (var2.indexOf((int) param1.charAt(var4)) ^ -1)) {
                              stackIn_14_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L1;
                            } else {
                              var4++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackIn_17_0 = 1;
                      break L4;
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_19_0 = 0;
              return stackIn_19_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref2);

            stackIn_22_1 = new StringBuilder().append("sj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    sj(mg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_a = param2;
            this.field_f = param6;
            this.field_h = param1;
            this.field_b = param5;
            this.field_e = param0;
            this.field_c = param4;
            this.field_g = param3;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
