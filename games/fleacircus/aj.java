/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends pa {
    static dd[] field_t;
    static String field_x;
    private int[] field_u;
    private int[][] field_s;
    private String[] field_y;
    static long field_w;
    static dd field_v;
    static int field_q;
    int[] field_z;
    static String field_r;

    private final void a(ni param0, int param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param1 ^ -1) != -2) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_y = m.a('<', 123, param0.h(0));
                        if (var9 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == 2) {
                            statePc = 23;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 == 3) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param1 == 4) {
                            statePc = 34;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int = param0.e(false);
                        this.field_s = new int[var4_int][];
                        this.field_u = new int[var4_int];
                        var5 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_int <= var5) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = param0.d((byte) -75);
                        var7 = ql.a(param2 ^ -22467, var6);
                        if (var9 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_u[var5] = var6;
                        array$0 = new int[var7.field_c];
                        this.field_s[var5] = array$0;
                        var8 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7.field_c <= var8) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_s[var5][var8] = param0.d((byte) -73);
                        var8++;
                        if (var9 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4_int = param0.e(false);
                        this.field_z = new int[var4_int];
                        var5 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var5 >= var4_int) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_z[var5] = param0.d((byte) -122);
                        var5++;
                        if (var9 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        return;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var9 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (var4);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("aj.E(");
                    stackIn_31_1 = stackIn_32_1;
                    if (param0 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                ea.a(120, (java.awt.Component) ((Object) param1));
                il.a(false, (java.awt.Component) ((Object) param1));
                if (null == ui.field_pb) {
                  break L1;
                } else {
                  ui.field_pb.a(0, (java.awt.Component) ((Object) param1));
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("aj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String c(byte param0) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_11_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    var6 = new StringBuilder(80);
                    var2 = var6;
                    if (this.field_y == null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return "";
                }
                case 3: {
                    if (param0 >= 74) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = (String) null;
                    aj.a((String) null, 106);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    discarded$3 = var6.append(this.field_y[0]);
                    var3 = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_y.length <= var3) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    discarded$4 = var2.append("...");
                    stackIn_11_0 = var6.append(this.field_y[var3]);
                    stackIn_8_0 = stackIn_11_0;
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3++;
                    if (var4 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (StringBuilder) (var2);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return ((StringBuilder) (Object) stackIn_11_0).toString();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, Object param1, ce param2) {
        Object stackIn_11_0 = null;
        java.awt.AWTEvent stackIn_11_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2.field_a == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -60) {
                  break L1;
                } else {
                  field_x = (String) null;
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (-51 >= (var3_int ^ -1)) {
                        break L5;
                      } else {
                        stackIn_11_0 = null;

                        stackIn_11_1 = param2.field_a.peekEvent();

                        if (var4 != 0) {
                          if (stackIn_11_0 != stackIn_11_1) {
                            break L4;
                          } else {
                            break L3;
                          }
                        } else {
                          if (stackIn_11_0 == stackIn_11_1) {
                            break L5;
                          } else {
                            vh.a(1L, 49);
                            var3_int++;
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (param1 != null) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  try {
                    L6: {
                      param2.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                      break L6;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L7;
                    }
                  }
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("aj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void g(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = sg.field_i;
        synchronized (var1) {
          L0: {
            kc.field_f = lk.field_J;
            m.field_a = m.field_a + 1;
            ag.field_f = gd.field_a;
            kc.field_b = vf.field_p;
            pl.field_c = ag.field_a;
            ag.field_a = false;
            jk.field_r = vk.field_O;
            pb.field_d = fb.field_b;
            ob.field_e = th.field_s;
            vk.field_O = 0;
            break L0;
          }
        }
        L1: {
          if (param0 == 28003) {
            break L1;
          } else {
            field_x = (String) null;
            break L1;
          }
        }
    }

    final void a(ni param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var3_int = param0.e(false);
                        if (-1 == (var3_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.a(param0, var3_int, 4);
                        if (var4 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var3);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("aj.C(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(CharSequence[] param0, int param1, byte param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 != (param3 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = "";
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (1 == param3) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = param0[param1];
                        var4 = var10;
                        if (var4 != null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = "null";
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        stackIn_10_0 = var10.toString();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var4_int = param1 + param3;
                        if (param2 < -75) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_w = -65L;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = 0;
                        var6_int = param1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6_int >= var4_int) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7_ref_CharSequence = param0[var6_int];
                        if (var7_ref_CharSequence != null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 += 4;
                        if (var9 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = var5 + var7_ref_CharSequence.length();
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = new StringBuilder(var5);
                        var7 = param1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = param0[var7];
                        if (var8 != null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        discarded$0 = var6.append("null");
                        if (var9 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        discarded$1 = var6.append(var8);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        discarded$2 = var6.append(var8);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = var6.toString();
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (var4_ref);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("aj.F(");
                    stackIn_31_1 = stackIn_32_1;
                    if (param0 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_x = null;
        int var1 = 34 % ((-22 - param0) / 33);
        field_v = null;
    }

    final static ve a(String param0, int param1) {
        RuntimeException var2 = null;
        ce var3 = null;
        ve stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!uc.field_c.a(-48)) {
                break L1;
              } else {
                if (!param0.equals(uc.field_c.c(param1 + -16954))) {
                  uc.field_c = pk.a((byte) 68, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                var3 = (ce) null;
                aj.a((byte) -26, (Object) null, (ce) null);
                break L2;
              }
            }
            stackIn_7_0 = uc.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("aj.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    aj() {
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    if (null == this.field_z) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var2 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_z.length <= var2) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_z[var2] = ne.a(this.field_z[var2], 32768);
                    var2++;
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var3 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (param0 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    aj.g(-113);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_r = "Email address is unavailable";
    }
}
