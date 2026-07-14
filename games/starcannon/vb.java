/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vb extends qf {
    static hl field_l;
    private fe field_n;
    static rk field_k;
    static int field_m;
    static String field_j;

    final String a(String param0, boolean param1) {
        he var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Object stackOut_1_0 = null;
        String stackOut_9_0 = null;
        String stackOut_15_0 = null;
        String stackOut_17_0 = null;
        String stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (String) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if (!(((vb) this).field_n instanceof ub)) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = ((ub) (Object) ((vb) this).field_n).a(false);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 == null) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3.b((byte) 12) != bf.field_x) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (String) param0;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!((String) (Object) stackIn_10_0).equals((Object) (Object) ((vb) this).field_n.field_k)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = qb.field_d;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        stackOut_17_0 = var3.a(26162);
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    try {
                        if (param0.equals((Object) (Object) ((vb) this).field_n.field_k)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = qb.field_d;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    try {
                        stackOut_22_0 = null;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return (String) (Object) stackIn_23_0;
                }
                case 24: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) var3_ref;
                        stackOut_25_1 = new StringBuilder().append("vb.A(");
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (param0 == null) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                        stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                        stackOut_26_2 = "{...}";
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                    stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                    stackOut_28_2 = "null";
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw sd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vb(fe param0, fe param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        ((vb) this).field_n = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("vb.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
                }
                case 13: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ue param0, int param1) {
        byte[] var2 = null;
        int var3 = 0;
        L0: {
          var3 = StarCannon.field_A;
          ri.field_c = param0;
          var2 = cb.a("gamename", (byte) -124);
          if (null != var2) {
            wc.field_g = uh.a(121, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = cb.a("achievement_names,0", (byte) -124);
          if (null != var2) {
            di.field_j[0] = uh.a(127, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = cb.a("achievement_names,1", (byte) -124);
          if (var2 != null) {
            di.field_j[1] = uh.a(dg.a(param1, 30856), var2);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = cb.a("achievement_names,2", (byte) -124);
          if (null != var2) {
            di.field_j[2] = uh.a(126, var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = cb.a("achievement_names,3", (byte) -124);
          if (var2 == null) {
            break L4;
          } else {
            di.field_j[3] = uh.a(dg.a(param1, 30858), var2);
            break L4;
          }
        }
        L5: {
          var2 = cb.a("achievement_names,4", (byte) -124);
          if (var2 == null) {
            break L5;
          } else {
            di.field_j[4] = uh.a(120, var2);
            break L5;
          }
        }
        L6: {
          var2 = cb.a("achievement_names,5", (byte) -124);
          if (null == var2) {
            break L6;
          } else {
            di.field_j[5] = uh.a(115, var2);
            break L6;
          }
        }
        L7: {
          var2 = cb.a("achievement_names,6", (byte) -124);
          if (var2 == null) {
            break L7;
          } else {
            di.field_j[6] = uh.a(param1 + -30835, var2);
            break L7;
          }
        }
        L8: {
          var2 = cb.a("achievement_names,7", (byte) -124);
          if (var2 != null) {
            di.field_j[7] = uh.a(param1 + -30850, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = cb.a("achievement_names,8", (byte) -124);
          if (var2 != null) {
            di.field_j[8] = uh.a(113, var2);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var2 = cb.a("achievement_names,9", (byte) -124);
          if (var2 == null) {
            break L10;
          } else {
            di.field_j[9] = uh.a(121, var2);
            break L10;
          }
        }
        L11: {
          var2 = cb.a("achievement_names,10", (byte) -124);
          if (var2 == null) {
            break L11;
          } else {
            di.field_j[10] = uh.a(122, var2);
            break L11;
          }
        }
        L12: {
          var2 = cb.a("achievement_names,11", (byte) -124);
          if (var2 != null) {
            di.field_j[11] = uh.a(126, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = cb.a("achievement_names,12", (byte) -124);
          if (null != var2) {
            di.field_j[12] = uh.a(123, var2);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var2 = cb.a("achievement_names,13", (byte) -124);
          if (var2 != null) {
            di.field_j[13] = uh.a(120, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = cb.a("achievement_names,14", (byte) -124);
          if (var2 == null) {
            break L15;
          } else {
            di.field_j[14] = uh.a(120, var2);
            break L15;
          }
        }
        L16: {
          var2 = cb.a("achievement_criteria,0", (byte) -124);
          if (null == var2) {
            break L16;
          } else {
            vd.field_h[0] = uh.a(116, var2);
            break L16;
          }
        }
        L17: {
          var2 = cb.a("achievement_criteria,1", (byte) -124);
          if (null == var2) {
            break L17;
          } else {
            vd.field_h[1] = uh.a(dg.a(param1, 30850), var2);
            break L17;
          }
        }
        L18: {
          var2 = cb.a("achievement_criteria,2", (byte) -124);
          if (null == var2) {
            break L18;
          } else {
            vd.field_h[2] = uh.a(123, var2);
            break L18;
          }
        }
        L19: {
          var2 = cb.a("achievement_criteria,3", (byte) -124);
          if (var2 == null) {
            break L19;
          } else {
            vd.field_h[3] = uh.a(dg.a(param1, 30850), var2);
            break L19;
          }
        }
        L20: {
          var2 = cb.a("achievement_criteria,4", (byte) -124);
          if (var2 != null) {
            vd.field_h[4] = uh.a(120, var2);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          var2 = cb.a("achievement_criteria,5", (byte) -124);
          if (var2 != null) {
            vd.field_h[5] = uh.a(120, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = cb.a("achievement_criteria,6", (byte) -124);
          if (var2 == null) {
            break L22;
          } else {
            vd.field_h[6] = uh.a(param1 + -30843, var2);
            break L22;
          }
        }
        L23: {
          var2 = cb.a("achievement_criteria,7", (byte) -124);
          if (null == var2) {
            break L23;
          } else {
            vd.field_h[7] = uh.a(116, var2);
            break L23;
          }
        }
        L24: {
          var2 = cb.a("achievement_criteria,8", (byte) -124);
          if (var2 != null) {
            vd.field_h[8] = uh.a(117, var2);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          var2 = cb.a("achievement_criteria,9", (byte) -124);
          if (null != var2) {
            vd.field_h[9] = uh.a(127, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = cb.a("achievement_criteria,10", (byte) -124);
          if (var2 == null) {
            break L26;
          } else {
            vd.field_h[10] = uh.a(param1 + -30840, var2);
            break L26;
          }
        }
        L27: {
          var2 = cb.a("achievement_criteria,11", (byte) -124);
          if (null == var2) {
            break L27;
          } else {
            vd.field_h[11] = uh.a(120, var2);
            break L27;
          }
        }
        L28: {
          var2 = cb.a("achievement_criteria,12", (byte) -124);
          if (var2 != null) {
            vd.field_h[12] = uh.a(117, var2);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = cb.a("achievement_criteria,13", (byte) -124);
          if (var2 == null) {
            break L29;
          } else {
            vd.field_h[13] = uh.a(123, var2);
            break L29;
          }
        }
        L30: {
          var2 = cb.a("achievement_criteria,14", (byte) -124);
          if (var2 != null) {
            vd.field_h[14] = uh.a(121, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = cb.a("optionscaps", (byte) -124);
          if (null == var2) {
            break L31;
          } else {
            String discarded$19 = uh.a(param1 ^ 30861, var2);
            break L31;
          }
        }
        L32: {
          var2 = cb.a("bosshealthcaps", (byte) -124);
          if (var2 != null) {
            s.field_h = uh.a(112, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = cb.a("lev7a", (byte) -124);
          if (var2 != null) {
            jg.field_I = uh.a(127, var2);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          var2 = cb.a("lev6c", (byte) -124);
          if (var2 == null) {
            break L34;
          } else {
            eh.field_c = uh.a(117, var2);
            break L34;
          }
        }
        L35: {
          var2 = cb.a("lev6b", (byte) -124);
          if (var2 != null) {
            jf.field_b = uh.a(122, var2);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          var2 = cb.a("lev6a", (byte) -124);
          if (var2 == null) {
            break L36;
          } else {
            d.field_n = uh.a(126, var2);
            break L36;
          }
        }
        L37: {
          var2 = cb.a("lev5b", (byte) -124);
          if (var2 == null) {
            break L37;
          } else {
            sb.field_o = uh.a(112, var2);
            break L37;
          }
        }
        L38: {
          var2 = cb.a("lev5a", (byte) -124);
          if (var2 != null) {
            bc.field_l = uh.a(126, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = cb.a("lev4a", (byte) -124);
          if (null != var2) {
            vf.field_a = uh.a(param1 ^ 30860, var2);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = cb.a("lev3a", (byte) -124);
          if (null == var2) {
            break L40;
          } else {
            qc.field_a = uh.a(121, var2);
            break L40;
          }
        }
        L41: {
          var2 = cb.a("lev2a", (byte) -124);
          if (null == var2) {
            break L41;
          } else {
            ig.field_c = uh.a(123, var2);
            break L41;
          }
        }
        L42: {
          var2 = cb.a("lev1", (byte) -124);
          if (null == var2) {
            break L42;
          } else {
            eg.field_i = uh.a(114, var2);
            break L42;
          }
        }
        L43: {
          var2 = cb.a("spacetofire", (byte) -124);
          if (null != var2) {
            String discarded$20 = uh.a(120, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = cb.a("escforopts", (byte) -124);
          if (null != var2) {
            String discarded$21 = uh.a(112, var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = cb.a("scorecapscolon", (byte) -124);
          if (null == var2) {
            break L45;
          } else {
            rd.field_o = uh.a(112, var2);
            break L45;
          }
        }
        L46: {
          var2 = cb.a("collecttopowerup", (byte) -124);
          if (null == var2) {
            break L46;
          } else {
            p.field_e = uh.a(param1 + -30845, var2);
            break L46;
          }
        }
        L47: {
          var2 = cb.a("lancepower", (byte) -124);
          if (var2 == null) {
            break L47;
          } else {
            ve.field_g = uh.a(114, var2);
            break L47;
          }
        }
        L48: {
          var2 = cb.a("helixpower", (byte) -124);
          if (null == var2) {
            break L48;
          } else {
            b.field_d = uh.a(param1 + -30838, var2);
            break L48;
          }
        }
        L49: {
          var2 = cb.a("pulsepower", (byte) -124);
          if (null == var2) {
            break L49;
          } else {
            be.field_b = uh.a(119, var2);
            break L49;
          }
        }
        L50: {
          var2 = cb.a("livescapscolon", (byte) -124);
          if (var2 != null) {
            vk.field_w = uh.a(param1 + -30842, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = cb.a("atgcaps", (byte) -124);
          if (null != var2) {
            String discarded$22 = uh.a(115, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = cb.a("levhard", (byte) -124);
          if (null != var2) {
            hg.field_D = uh.a(127, var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          var2 = cb.a("levmedium", (byte) -124);
          if (var2 != null) {
            fl.field_g = uh.a(120, var2);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          var2 = cb.a("leveasy", (byte) -124);
          if (null != var2) {
            cf.field_k = uh.a(param1 + -30847, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = cb.a("fsoff", (byte) -124);
          if (var2 == null) {
            break L55;
          } else {
            String discarded$23 = uh.a(126, var2);
            break L55;
          }
        }
        L56: {
          var2 = cb.a("fson", (byte) -124);
          if (var2 == null) {
            break L56;
          } else {
            String discarded$24 = uh.a(114, var2);
            break L56;
          }
        }
        L57: {
          var2 = cb.a("gfxhigh", (byte) -124);
          if (null != var2) {
            gh.field_A = uh.a(120, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = cb.a("gfxmed", (byte) -124);
          if (var2 != null) {
            fd.field_d = uh.a(param1 + -30850, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = cb.a("gfxlow", (byte) -124);
          if (var2 != null) {
            ec.field_d = uh.a(121, var2);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          var2 = cb.a("maxpowtext", (byte) -124);
          if (var2 != null) {
            ab.field_B = uh.a(param1 ^ 30855, var2);
            break L60;
          } else {
            break L60;
          }
        }
        L61: {
          var2 = cb.a("sideguntext", (byte) -124);
          if (null == var2) {
            break L61;
          } else {
            ra.field_y = uh.a(124, var2);
            break L61;
          }
        }
        L62: {
          var2 = cb.a("backguntext", (byte) -124);
          if (null != var2) {
            oi.field_i = uh.a(119, var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          var2 = cb.a("shieldtext", (byte) -124);
          if (null != var2) {
            t.field_x = uh.a(113, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var2 = cb.a("enginetext", (byte) -124);
          if (var2 != null) {
            hb.field_g = uh.a(126, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          var2 = cb.a("powerup2of2", (byte) -124);
          if (var2 != null) {
            di.field_k = uh.a(120, var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          var2 = cb.a("collecttext", (byte) -124);
          if (var2 != null) {
            la.field_a = uh.a(117, var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          var2 = cb.a("lifetext", (byte) -124);
          if (null != var2) {
            a.field_c = uh.a(126, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = cb.a("lancetext", (byte) -124);
          if (var2 != null) {
            mg.field_k = uh.a(118, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = cb.a("helixtext", (byte) -124);
          if (null != var2) {
            mc.field_i = uh.a(120, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = cb.a("pulsetext", (byte) -124);
          if (var2 != null) {
            gf.field_e = uh.a(123, var2);
            break L70;
          } else {
            break L70;
          }
        }
        L71: {
          var2 = cb.a("powerup1of2", (byte) -124);
          if (null != var2) {
            vc.field_k = uh.a(127, var2);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          var2 = cb.a("con7", (byte) -124);
          if (null != var2) {
            eb.field_e = uh.a(127, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          var2 = cb.a("con6", (byte) -124);
          if (var2 != null) {
            p.field_b = uh.a(114, var2);
            break L73;
          } else {
            break L73;
          }
        }
        L74: {
          var2 = cb.a("con5", (byte) -124);
          if (var2 != null) {
            cc.field_k = uh.a(119, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = cb.a("con4", (byte) -124);
          if (null == var2) {
            break L75;
          } else {
            qd.field_y = uh.a(param1 + -30843, var2);
            break L75;
          }
        }
        L76: {
          var2 = cb.a("con3", (byte) -124);
          if (null == var2) {
            break L76;
          } else {
            ac.field_c = uh.a(120, var2);
            break L76;
          }
        }
        L77: {
          var2 = cb.a("con2", (byte) -124);
          if (null == var2) {
            break L77;
          } else {
            fi.field_a = uh.a(112, var2);
            break L77;
          }
        }
        L78: {
          var2 = cb.a("con1", (byte) -124);
          if (null == var2) {
            break L78;
          } else {
            s.field_a = uh.a(param1 + -30840, var2);
            break L78;
          }
        }
        L79: {
          var2 = cb.a("controlcaps", (byte) -124);
          if (null == var2) {
            break L79;
          } else {
            tc.field_y = uh.a(param1 ^ 30860, var2);
            break L79;
          }
        }
        L80: {
          var2 = cb.a("storytext", (byte) -124);
          if (var2 == null) {
            break L80;
          } else {
            ff.field_p = uh.a(123, var2);
            break L80;
          }
        }
        L81: {
          var2 = cb.a("storycaps", (byte) -124);
          if (null == var2) {
            break L81;
          } else {
            sb.field_p = uh.a(117, var2);
            break L81;
          }
        }
        L82: {
          var2 = cb.a("nextcaps", (byte) -124);
          if (null == var2) {
            break L82;
          } else {
            String discarded$25 = uh.a(127, var2);
            break L82;
          }
        }
        L83: {
          var2 = cb.a("prevcaps", (byte) -124);
          if (null != var2) {
            String discarded$26 = uh.a(param1 ^ 30853, var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          var2 = cb.a("pageno", (byte) -124);
          if (null != var2) {
            ui.field_t = uh.a(120, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = cb.a("instrcaps", (byte) -124);
          if (null != var2) {
            String discarded$27 = uh.a(114, var2);
            break L85;
          } else {
            break L85;
          }
        }
        L86: {
          var2 = cb.a("hsunavail", (byte) -124);
          if (null == var2) {
            break L86;
          } else {
            String discarded$28 = uh.a(115, var2);
            break L86;
          }
        }
        L87: {
          var2 = cb.a("waitforhs", (byte) -124);
          if (null == var2) {
            break L87;
          } else {
            String discarded$29 = uh.a(127, var2);
            break L87;
          }
        }
        L88: {
          var2 = cb.a("hardcaps", (byte) -124);
          if (var2 == null) {
            break L88;
          } else {
            td.field_j = uh.a(118, var2);
            break L88;
          }
        }
        L89: {
          var2 = cb.a("mediumcaps", (byte) -124);
          if (var2 == null) {
            break L89;
          } else {
            lb.field_l = uh.a(116, var2);
            break L89;
          }
        }
        L90: {
          var2 = cb.a("easycaps", (byte) -124);
          if (null != var2) {
            ta.field_a = uh.a(param1 ^ 30862, var2);
            break L90;
          } else {
            break L90;
          }
        }
        L91: {
          var2 = cb.a("lastscorestring", (byte) -124);
          if (null == var2) {
            break L91;
          } else {
            String discarded$30 = uh.a(120, var2);
            break L91;
          }
        }
        L92: {
          var2 = cb.a("logincaps", (byte) -124);
          if (null != var2) {
            String discarded$31 = uh.a(param1 + -30840, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = cb.a("highscorescaps", (byte) -124);
          if (null == var2) {
            break L93;
          } else {
            String discarded$32 = uh.a(113, var2);
            break L93;
          }
        }
        L94: {
          var2 = cb.a("menucaps", (byte) -124);
          if (null == var2) {
            break L94;
          } else {
            String discarded$33 = uh.a(123, var2);
            break L94;
          }
        }
        L95: {
          var2 = cb.a("hiddenachievement", (byte) -124);
          if (null != var2) {
            String discarded$34 = uh.a(127, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = cb.a("achievementscaps", (byte) -124);
          if (var2 != null) {
            String discarded$35 = uh.a(param1 + -30850, var2);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          var2 = cb.a("mainmenucaps", (byte) -124);
          if (null != var2) {
            String discarded$36 = uh.a(param1 + -30842, var2);
            break L97;
          } else {
            break L97;
          }
        }
        L98: {
          var2 = cb.a("warninghardmode", (byte) -124);
          if (var2 == null) {
            break L98;
          } else {
            String discarded$37 = uh.a(param1 + -30836, var2);
            break L98;
          }
        }
        L99: {
          var2 = cb.a("gameover", (byte) -124);
          if (var2 != null) {
            ne.field_i = uh.a(127, var2);
            break L99;
          } else {
            break L99;
          }
        }
        L100: {
          var2 = cb.a("benefits,0", (byte) -124);
          if (param1 == 30962) {
            break L100;
          } else {
            field_j = null;
            break L100;
          }
        }
        L101: {
          if (null != var2) {
            rj.field_l[0] = uh.a(114, var2);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          var2 = cb.a("benefits,1", (byte) -124);
          if (null != var2) {
            rj.field_l[1] = uh.a(121, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          var2 = cb.a("benefits,2", (byte) -124);
          if (null == var2) {
            break L103;
          } else {
            rj.field_l[2] = uh.a(125, var2);
            break L103;
          }
        }
        ri.field_c = null;
        L104: {
          if (!th.field_i) {
            break L104;
          } else {
            var3++;
            StarCannon.field_A = var3;
            break L104;
          }
        }
    }

    public static void e(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_j = null;
              field_k = null;
              if (param0 >= 108) {
                break L0;
              } else {
                field_k = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_l = null;
        }
    }

    final p a(String param0, int param1) {
        RuntimeException var3 = null;
        he var3_ref = null;
        p stackIn_9_0 = null;
        p stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        p stackOut_8_0 = null;
        p stackOut_15_0 = null;
        p stackOut_17_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((vb) this).field_n instanceof ub) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_ref = ((ub) (Object) ((vb) this).field_n).a(false);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3_ref == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3_ref.b((byte) -8) == bf.field_x) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = sb.field_n;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        if (param1 == -26188) {
                            statePc = 14;
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
                        vb.e((byte) 95);
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!param0.equals((Object) (Object) ((vb) this).field_n.field_k)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = bf.field_x;
                        stackIn_18_0 = stackOut_15_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = sb.field_n;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) var3;
                        stackOut_20_1 = new StringBuilder().append("vb.B(");
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param0 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw sd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new rk();
        field_j = "Prev";
    }
}
