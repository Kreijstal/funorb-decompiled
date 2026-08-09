/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends nb implements ag, jk {
    static int field_D;
    bb field_F;
    private cl field_E;
    private kf field_B;
    private kf field_G;
    static String field_C;

    public final void a(String param0, byte param1) {
        cl var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_E;
            var4 = param0;
            ((rl) ((Object) var3)).a(var4, -1, false);
            if (param1 >= 103) {
              break L0;
            } else {
              r.h(89);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("r.HA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final int a(String param0, String param1, w param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 11271) {
                break L1;
              } else {
                this.field_F = (bb) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, 35, 93, param5, param0, param4, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("r.E(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 215535458) {
                break L1;
              } else {
                var7 = (String) null;
                this.a((String) null, (byte) 106);
                break L1;
              }
            }
            L2: {
              if (this.field_B == param4) {
                break L2;
              } else {
                L3: {
                  if (this.field_G != param4) {
                    break L3;
                  } else {
                    this.g(126);
                    if (!Lexicominos.field_L) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                break L0;
              }
            }
            dc.c(255);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("r.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final void a(byte param0) {
        if (param0 != -12) {
            return;
        }
        ((ol) ((Object) this.field_E.a((byte) 94))).e(param0 + 95);
    }

    public static void h(int param0) {
        if (param0 != -100) {
            return;
        }
        field_C = null;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_G.field_D = this.d((byte) -89);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "r.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, int param5, w param6) {
        RuntimeException var8 = null;
        li var9 = null;
        int var10 = 0;
        jf var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = new jf(20, param3, param5 + 120, 25, param6, false, 120, 3, ql.field_Q, 16777215, param0);
            this.b((byte) 73, var11);
            var9 = new li(((nd) ((Object) param6)).a((byte) 6), param4, 126, param3 + var11.field_v, 25 + param5, param1);
            var10 = -12 / ((21 - param2) / 47);
            var9.field_r = (vd) (this);
            this.b((byte) -93, var9);
            stackIn_1_0 = var9.field_v + var11.field_v;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("r.I(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        df var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.removeKeyListener(ol.field_l);
              param0.removeFocusListener(ol.field_l);
              vg.field_b = -1;
              if (param1 == 20) {
                break L1;
              } else {
                var3 = (df) null;
                r.a((df) null, -73);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("r.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, nd param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        sc var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a((byte) 118);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = var3.b((byte) 126);
              if (param0 == 4293) {
                L1: {
                  if (var4 != rh.field_p) {
                    stackIn_10_0 = 0;
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("r.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static void a(df param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-4 >= (var2_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ok.field_G[var2_int] = 0;
                        var2_int++;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2_int >= pj.field_H) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_13_0 = tf.field_d[var2_int].field_g;
                        stackIn_9_0 = stackIn_13_0;
                        if (var5 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 != param0.field_g) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        dupTemp$0 = tf.field_d[var2_int].a(-1);
                        ok.field_G[dupTemp$0] = ok.field_G[dupTemp$0] + 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dupTemp$1 = param0.a(-1);
                        ok.field_G[dupTemp$1] = ok.field_G[dupTemp$1] + 1;
                        var2_int = 0;
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = stackIn_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (pj.field_H <= var3) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_23_0 = param0.field_g;
                        stackIn_16_0 = stackIn_23_0;
                        if (var5 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != tf.field_d[var3].field_g) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4 = tf.field_d[var3].a(-1);
                        if (ok.field_G[var4] <= si.field_s) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ok.field_G[var4] = ok.field_G[var4] - 1;
                        if (var5 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        incrementValue$2 = var2_int;
                        var2_int++;
                        tf.field_d[incrementValue$2] = tf.field_d[var3];
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = var2_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        pj.field_H = stackIn_23_0;
                        fieldTemp$3 = pj.field_H;
                        pj.field_H = pj.field_H + 1;
                        tf.field_d[fieldTemp$3] = param0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var2);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("r.H(");
                    stackIn_26_1 = stackIn_27_1;
                    if (param0 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw ld.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public r() {
        super(0, 0, 496, 0, (rd) null);
        this.field_E = new cl("", (vd) null, 12);
        ik var1 = new ik(cl.field_T, 0, 0, 0, 0, 16777215, -1, 3, 0, ql.field_Q.field_E, -1, 2147483647, true);
        w var2 = new w(oh.field_c, var1, (vd) null);
        this.field_G = new kf(va.field_l, (vd) null);
        this.field_B = new kf(he.field_a, (vd) null);
        this.field_E.field_q = cl.field_Q;
        this.field_E.a(new ol(this.field_E), (byte) 23);
        this.field_G.field_D = false;
        this.field_G.field_i = (rd) ((Object) new v());
        this.field_B.field_i = (rd) ((Object) new uj());
        this.field_E.field_i = (rd) ((Object) new id(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 270, true, var3, 20);
        var3 += 50;
        this.b((byte) 106, var2);
        var3 = var3 + (5 + this.a(nk.field_C, hc.field_kb, this.field_E, 11271, 170, var3));
        this.field_G.a(40, var5, true, var3, 496 - var5 >> -8195999);
        this.field_B.a(40, 60, true, 15 + var3, var4 + 3);
        this.field_B.field_r = (vd) (this);
        this.field_G.field_r = (vd) (this);
        this.b((byte) -97, this.field_G);
        this.b((byte) -67, this.field_B);
        this.field_F = new bb((ag) (this));
        this.field_F.a(150, this.field_j - this.field_E.field_t + (-this.field_E.field_j + -60), true, 20, this.field_E.field_j + this.field_E.field_t + 60);
        this.b((byte) 53, this.field_F);
        this.a(55 + (var3 + var4), 496, true, 0, 0);
    }

    private final boolean d(byte param0) {
        int var2 = -82 % ((param0 - 48) / 58);
        if (!this.a(4293, (nd) (this.field_E))) {
            return false;
        }
        return true;
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) -105)) {
              if ((param1 ^ -1) == -99) {
                stackIn_6_0 = this.a(0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5_int = 3 % ((-13 - param3) / 55);
                if ((param1 ^ -1) == -100) {
                  stackIn_10_0 = this.c((byte) 119, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("r.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final void g(int param0) {
        if (!this.d((byte) 114)) {
          return;
        } else {
          if (param0 < 108) {
            this.field_F = (bb) null;
            rb.a((byte) 112, this.field_E.field_u);
            return;
          } else {
            rb.a((byte) 112, this.field_E.field_u);
            return;
          }
        }
    }

    static {
        field_C = "Type your password again to make sure it's correct";
    }
}
