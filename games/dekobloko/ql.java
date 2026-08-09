/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_g;
    static String field_a;
    static cc field_b;
    volatile boolean field_e;
    static int field_c;
    static String field_f;
    static int[] field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ql.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static lm a(ji param0, byte param1, int param2, int param3, ji param4) {
        RuntimeException var5 = null;
        lm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 41) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (gb.a(param3, param0, param2, 56)) {
              stackIn_6_0 = w.a(param4.a(param2, -117, param3), (byte) -5);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ql.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    ql() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, byte param1) {
        int var2 = -50 % ((param1 - -51) / 49);
        qm.a((byte) 57);
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
            return false;
        }
        return !wl.field_p ? true : false;
    }

    final static void a(vj param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        bh var3 = null;
        int var4_int = 0;
        vj var4 = null;
        bh var5 = null;
        bh var6 = null;
        uk var7 = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        uk stackIn_14_1 = null;
        int stackIn_17_0 = 0;
        uk stackIn_17_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param2 ^ -1) >= -2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var3 = param0.field_c.field_b;
                        var4_int = 0;
                        if (param1 < -114) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (param2 <= var4_int) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = var3.field_b;
                        var4_int += 2;
                        if (var8 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = new vj();
                        param0.a(-128, var3, var4);
                        ql.a(param0, -117, (1 + param2) / 2);
                        ql.a(var4, -127, param2 / 2);
                        var5 = param0.field_c.field_b;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = var4.field_c.field_b;
                        if (var4.field_c != var6) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = (uk) ((Object) var6);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0.field_c == var5) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_17_0 = var7.field_o;
                        stackIn_14_0 = stackIn_17_0;
                        stackIn_17_1 = (uk) ((Object) var5);
                        stackIn_14_1 = stackIn_17_1;
                        if (var8 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 <= stackIn_14_1.field_o) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = var5.field_b;
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 113;
                        stackIn_17_1 = (uk) (var7);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        fm.a((byte) stackIn_17_0, stackIn_17_1, var5);
                        if (var8 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_21_0 = (RuntimeException) (runtimeException);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = new StringBuilder().append("ql.D(");
                    stackIn_20_1 = stackIn_21_1;
                    if (param0 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 > -70) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void c(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ik.field_f;
        synchronized (var1) {
          L0: {
            L1: {
              pf.field_g = pf.field_g + 1;
              be.field_n = pa.field_bb;
              bh.field_g = lc.field_f;
              if (param0 == -2) {
                break L1;
              } else {
                ql.c(-55);
                break L1;
              }
            }
            pm.field_f = te.field_r;
            pm.field_b = ml.field_b;
            ml.field_b = false;
            ig.field_Yb = nk.field_l;
            he.field_S = ge.field_a;
            nf.field_h = qa.field_t;
            nk.field_l = 0;
            break L0;
          }
        }
    }

    final void a(fd param0, int param1) {
        try {
            if (param1 <= 4) {
                fd var4 = (fd) null;
                this.a((fd) null, 55);
            }
            wj.a(true, this.field_g, param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ql.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        field_a = "Month";
        field_f = "Reject";
    }
}
