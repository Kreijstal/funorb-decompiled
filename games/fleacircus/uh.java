/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends lh {
    int field_q;
    int field_u;
    int field_p;
    static dd[] field_m;
    int field_j;
    int field_l;
    static sf field_s;
    static String field_o;
    static dd field_k;
    int field_i;
    static String field_t;
    static int[] field_n;
    int[] field_r;

    final static rh a(int param0, int param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        rh stackOut_3_0 = null;
        try {
          if (param1 == 26) {
            return (rh) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = ag.a(param2, param4, false, param0, param3, 1);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((uh) this).field_u = param5;
                        ((uh) this).field_r = param1;
                        if (param0 == 3) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((uh) this).field_p = 120;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((uh) this).field_l = param6;
                        ((uh) this).field_i = param7;
                        ((uh) this).field_p = param3;
                        ((uh) this).field_q = param4;
                        ((uh) this).field_j = param2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var9 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var9;
                        stackOut_7_1 = new StringBuilder().append("uh.B(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_t = null;
            field_o = null;
            field_n = null;
            field_m = null;
            field_k = null;
            field_s = null;
            if (param0 != 8) {
                field_n = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "uh.C(" + param0 + 41);
        }
    }

    final static void a(byte param0, rh param1) {
        byte[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_559_0 = 0;
        int stackOut_558_0 = 0;
        int stackOut_557_0 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          em.field_c = param1;
          var2 = tf.a(0, "waitingfor_patches");
          if (var2 != null) {
            cf.field_b = ab.a(0, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = tf.a(0, "loading_patches");
          if (null != var2) {
            kk.field_c = ab.a(0, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = tf.a(0, "level_names,0,0");
          if (null == var2) {
            break L2;
          } else {
            wj.field_c[0][0] = ab.a(0, var2);
            break L2;
          }
        }
        L3: {
          var2 = tf.a(0, "level_names,0,1");
          if (null != var2) {
            wj.field_c[0][1] = ab.a(0, var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = tf.a(0, "level_names,0,2");
          if (var2 == null) {
            break L4;
          } else {
            wj.field_c[0][2] = ab.a(0, var2);
            break L4;
          }
        }
        L5: {
          var2 = tf.a(0, "level_names,0,3");
          if (var2 != null) {
            wj.field_c[0][3] = ab.a(0, var2);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var2 = tf.a(0, "level_names,0,4");
          if (null != var2) {
            wj.field_c[0][4] = ab.a(0, var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = tf.a(0, "level_names,0,5");
          if (var2 != null) {
            wj.field_c[0][5] = ab.a(0, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = tf.a(0, "level_names,0,6");
          if (var2 == null) {
            break L8;
          } else {
            wj.field_c[0][6] = ab.a(0, var2);
            break L8;
          }
        }
        L9: {
          var2 = tf.a(0, "level_names,0,7");
          if (null == var2) {
            break L9;
          } else {
            wj.field_c[0][7] = ab.a(0, var2);
            break L9;
          }
        }
        L10: {
          var2 = tf.a(0, "level_names,0,8");
          if (var2 != null) {
            wj.field_c[0][8] = ab.a(0, var2);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = tf.a(0, "level_names,0,9");
          if (var2 != null) {
            wj.field_c[0][9] = ab.a(0, var2);
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          var2 = tf.a(0, "level_names,0,10");
          if (null != var2) {
            wj.field_c[0][10] = ab.a(0, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = tf.a(0, "level_names,0,11");
          if (var2 != null) {
            wj.field_c[0][11] = ab.a(0, var2);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var2 = tf.a(0, "level_names,0,12");
          if (var2 != null) {
            wj.field_c[0][12] = ab.a(0, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = tf.a(0, "level_names,0,13");
          if (var2 == null) {
            break L15;
          } else {
            wj.field_c[0][13] = ab.a(0, var2);
            break L15;
          }
        }
        L16: {
          var2 = tf.a(0, "level_names,0,14");
          if (var2 != null) {
            wj.field_c[0][14] = ab.a(0, var2);
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          var2 = tf.a(0, "level_names,0,15");
          if (null != var2) {
            wj.field_c[0][15] = ab.a(0, var2);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var2 = tf.a(0, "level_names,0,16");
          if (null == var2) {
            break L18;
          } else {
            wj.field_c[0][16] = ab.a(0, var2);
            break L18;
          }
        }
        L19: {
          var2 = tf.a(0, "level_names,0,17");
          if (var2 != null) {
            wj.field_c[0][17] = ab.a(0, var2);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          var2 = tf.a(0, "level_names,0,18");
          if (var2 != null) {
            wj.field_c[0][18] = ab.a(0, var2);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          var2 = tf.a(0, "level_names,0,19");
          if (var2 != null) {
            wj.field_c[0][19] = ab.a(0, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = tf.a(0, "level_names,0,20");
          if (var2 != null) {
            wj.field_c[0][20] = ab.a(0, var2);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          var2 = tf.a(0, "level_names,0,21");
          if (var2 == null) {
            break L23;
          } else {
            wj.field_c[0][21] = ab.a(0, var2);
            break L23;
          }
        }
        L24: {
          var2 = tf.a(0, "level_names,0,22");
          if (null != var2) {
            wj.field_c[0][22] = ab.a(0, var2);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          var2 = tf.a(0, "level_names,0,23");
          if (null != var2) {
            wj.field_c[0][23] = ab.a(0, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = tf.a(0, "level_names,0,24");
          if (var2 == null) {
            break L26;
          } else {
            wj.field_c[0][24] = ab.a(0, var2);
            break L26;
          }
        }
        L27: {
          var2 = tf.a(0, "level_names,0,25");
          if (null == var2) {
            break L27;
          } else {
            wj.field_c[0][25] = ab.a(0, var2);
            break L27;
          }
        }
        L28: {
          var2 = tf.a(0, "level_names,0,26");
          if (var2 == null) {
            break L28;
          } else {
            wj.field_c[0][26] = ab.a(0, var2);
            break L28;
          }
        }
        L29: {
          var2 = tf.a(0, "level_names,0,27");
          if (var2 != null) {
            wj.field_c[0][27] = ab.a(0, var2);
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          var2 = tf.a(0, "level_names,0,28");
          if (var2 != null) {
            wj.field_c[0][28] = ab.a(0, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = tf.a(0, "level_names,0,29");
          if (var2 == null) {
            break L31;
          } else {
            wj.field_c[0][29] = ab.a(0, var2);
            break L31;
          }
        }
        L32: {
          var2 = tf.a(0, "level_names,0,30");
          if (null == var2) {
            break L32;
          } else {
            wj.field_c[0][30] = ab.a(0, var2);
            break L32;
          }
        }
        L33: {
          var2 = tf.a(0, "level_names,0,31");
          if (var2 == null) {
            break L33;
          } else {
            wj.field_c[0][31] = ab.a(0, var2);
            break L33;
          }
        }
        L34: {
          var2 = tf.a(0, "level_names,0,32");
          if (null == var2) {
            break L34;
          } else {
            wj.field_c[0][32] = ab.a(0, var2);
            break L34;
          }
        }
        L35: {
          var2 = tf.a(0, "level_names,0,33");
          if (null != var2) {
            wj.field_c[0][33] = ab.a(0, var2);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          var2 = tf.a(0, "level_names,0,34");
          if (var2 != null) {
            wj.field_c[0][34] = ab.a(0, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = tf.a(0, "level_names,0,35");
          if (null == var2) {
            break L37;
          } else {
            wj.field_c[0][35] = ab.a(0, var2);
            break L37;
          }
        }
        L38: {
          var2 = tf.a(0, "level_names,0,36");
          if (null != var2) {
            wj.field_c[0][36] = ab.a(0, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = tf.a(0, "level_names,0,37");
          if (null == var2) {
            break L39;
          } else {
            wj.field_c[0][37] = ab.a(0, var2);
            break L39;
          }
        }
        L40: {
          var2 = tf.a(0, "level_names,0,38");
          if (null == var2) {
            break L40;
          } else {
            wj.field_c[0][38] = ab.a(0, var2);
            break L40;
          }
        }
        L41: {
          var2 = tf.a(0, "level_names,0,39");
          if (null != var2) {
            wj.field_c[0][39] = ab.a(0, var2);
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          var2 = tf.a(0, "level_names,0,40");
          if (null == var2) {
            break L42;
          } else {
            wj.field_c[0][40] = ab.a(0, var2);
            break L42;
          }
        }
        L43: {
          var2 = tf.a(0, "level_names,1,0");
          if (null == var2) {
            break L43;
          } else {
            wj.field_c[1][0] = ab.a(0, var2);
            break L43;
          }
        }
        L44: {
          var2 = tf.a(0, "level_names,1,1");
          if (var2 == null) {
            break L44;
          } else {
            wj.field_c[1][1] = ab.a(0, var2);
            break L44;
          }
        }
        L45: {
          var2 = tf.a(0, "level_names,1,2");
          if (var2 != null) {
            wj.field_c[1][2] = ab.a(0, var2);
            break L45;
          } else {
            break L45;
          }
        }
        L46: {
          var2 = tf.a(0, "level_names,1,3");
          if (var2 == null) {
            break L46;
          } else {
            wj.field_c[1][3] = ab.a(0, var2);
            break L46;
          }
        }
        L47: {
          var2 = tf.a(0, "level_names,1,4");
          if (var2 != null) {
            wj.field_c[1][4] = ab.a(0, var2);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          var2 = tf.a(0, "level_names,1,5");
          if (var2 != null) {
            wj.field_c[1][5] = ab.a(0, var2);
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var2 = tf.a(0, "level_names,1,6");
          if (null != var2) {
            wj.field_c[1][6] = ab.a(0, var2);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = tf.a(0, "level_names,1,7");
          if (null == var2) {
            break L50;
          } else {
            wj.field_c[1][7] = ab.a(0, var2);
            break L50;
          }
        }
        L51: {
          var2 = tf.a(0, "level_names,1,8");
          if (null == var2) {
            break L51;
          } else {
            wj.field_c[1][8] = ab.a(0, var2);
            break L51;
          }
        }
        L52: {
          var2 = tf.a(0, "level_names,1,9");
          if (var2 == null) {
            break L52;
          } else {
            wj.field_c[1][9] = ab.a(0, var2);
            break L52;
          }
        }
        L53: {
          var2 = tf.a(0, "level_names,1,10");
          if (null == var2) {
            break L53;
          } else {
            wj.field_c[1][10] = ab.a(0, var2);
            break L53;
          }
        }
        L54: {
          var2 = tf.a(0, "level_names,1,11");
          if (null != var2) {
            wj.field_c[1][11] = ab.a(0, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = tf.a(0, "level_names,1,12");
          if (null == var2) {
            break L55;
          } else {
            wj.field_c[1][12] = ab.a(0, var2);
            break L55;
          }
        }
        L56: {
          var2 = tf.a(0, "level_names,1,13");
          if (null == var2) {
            break L56;
          } else {
            wj.field_c[1][13] = ab.a(0, var2);
            break L56;
          }
        }
        L57: {
          var2 = tf.a(0, "level_names,1,14");
          if (null == var2) {
            break L57;
          } else {
            wj.field_c[1][14] = ab.a(0, var2);
            break L57;
          }
        }
        L58: {
          var2 = tf.a(0, "level_names,1,15");
          if (var2 != null) {
            wj.field_c[1][15] = ab.a(0, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = tf.a(0, "level_names,1,16");
          if (null != var2) {
            wj.field_c[1][16] = ab.a(0, var2);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          var2 = tf.a(0, "level_names,1,17");
          if (var2 != null) {
            wj.field_c[1][17] = ab.a(0, var2);
            break L60;
          } else {
            break L60;
          }
        }
        L61: {
          var2 = tf.a(0, "level_names,1,18");
          if (null != var2) {
            wj.field_c[1][18] = ab.a(0, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = tf.a(0, "level_names,1,19");
          if (var2 == null) {
            break L62;
          } else {
            wj.field_c[1][19] = ab.a(0, var2);
            break L62;
          }
        }
        L63: {
          var2 = tf.a(0, "level_names,1,20");
          if (var2 != null) {
            wj.field_c[1][20] = ab.a(0, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var2 = tf.a(0, "level_names,1,21");
          if (var2 != null) {
            wj.field_c[1][21] = ab.a(0, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          var2 = tf.a(0, "level_names,1,22");
          if (var2 == null) {
            break L65;
          } else {
            wj.field_c[1][22] = ab.a(0, var2);
            break L65;
          }
        }
        L66: {
          var2 = tf.a(0, "level_names,1,23");
          if (null != var2) {
            wj.field_c[1][23] = ab.a(0, var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          var2 = tf.a(0, "level_names,1,24");
          if (null == var2) {
            break L67;
          } else {
            wj.field_c[1][24] = ab.a(0, var2);
            break L67;
          }
        }
        L68: {
          var2 = tf.a(0, "level_names,1,25");
          if (null == var2) {
            break L68;
          } else {
            wj.field_c[1][25] = ab.a(0, var2);
            break L68;
          }
        }
        L69: {
          var2 = tf.a(0, "level_names,1,26");
          if (null != var2) {
            wj.field_c[1][26] = ab.a(0, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = tf.a(0, "level_names,1,27");
          if (null == var2) {
            break L70;
          } else {
            wj.field_c[1][27] = ab.a(0, var2);
            break L70;
          }
        }
        L71: {
          var2 = tf.a(0, "level_names,1,28");
          if (var2 == null) {
            break L71;
          } else {
            wj.field_c[1][28] = ab.a(0, var2);
            break L71;
          }
        }
        L72: {
          var2 = tf.a(0, "level_names,1,29");
          if (var2 != null) {
            wj.field_c[1][29] = ab.a(0, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          var2 = tf.a(0, "END_OF_FREE_GAME");
          if (null != var2) {
            nc.field_b = ab.a(0, var2);
            break L73;
          } else {
            break L73;
          }
        }
        L74: {
          var2 = tf.a(0, "achievement_names,0");
          if (var2 == null) {
            break L74;
          } else {
            wa.field_f[0] = ab.a(0, var2);
            break L74;
          }
        }
        L75: {
          var2 = tf.a(0, "achievement_names,1");
          if (null != var2) {
            wa.field_f[1] = ab.a(0, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = tf.a(0, "achievement_names,2");
          if (var2 == null) {
            break L76;
          } else {
            wa.field_f[2] = ab.a(0, var2);
            break L76;
          }
        }
        L77: {
          var2 = tf.a(0, "achievement_names,3");
          if (null != var2) {
            wa.field_f[3] = ab.a(0, var2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = tf.a(0, "achievement_names,4");
          if (null != var2) {
            wa.field_f[4] = ab.a(0, var2);
            break L78;
          } else {
            break L78;
          }
        }
        L79: {
          var2 = tf.a(0, "achievement_names,5");
          if (null != var2) {
            wa.field_f[5] = ab.a(0, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = tf.a(0, "achievement_names,6");
          if (var2 == null) {
            break L80;
          } else {
            wa.field_f[6] = ab.a(0, var2);
            break L80;
          }
        }
        L81: {
          var2 = tf.a(0, "achievement_names,7");
          if (null != var2) {
            wa.field_f[7] = ab.a(0, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = tf.a(0, "achievement_names,8");
          if (null != var2) {
            wa.field_f[8] = ab.a(0, var2);
            break L82;
          } else {
            break L82;
          }
        }
        L83: {
          var2 = tf.a(0, "achievement_names,9");
          if (null == var2) {
            break L83;
          } else {
            wa.field_f[9] = ab.a(0, var2);
            break L83;
          }
        }
        L84: {
          var2 = tf.a(0, "achievement_names,10");
          if (null == var2) {
            break L84;
          } else {
            wa.field_f[10] = ab.a(0, var2);
            break L84;
          }
        }
        L85: {
          var2 = tf.a(0, "achievement_names,11");
          if (null == var2) {
            break L85;
          } else {
            wa.field_f[11] = ab.a(0, var2);
            break L85;
          }
        }
        L86: {
          var2 = tf.a(0, "achievement_names,12");
          if (var2 != null) {
            wa.field_f[12] = ab.a(0, var2);
            break L86;
          } else {
            break L86;
          }
        }
        L87: {
          var2 = tf.a(0, "achievement_names,13");
          if (var2 != null) {
            wa.field_f[13] = ab.a(0, var2);
            break L87;
          } else {
            break L87;
          }
        }
        L88: {
          var2 = tf.a(0, "achievement_names,14");
          if (null != var2) {
            wa.field_f[14] = ab.a(0, var2);
            break L88;
          } else {
            break L88;
          }
        }
        L89: {
          var2 = tf.a(0, "achievement_names,15");
          if (null != var2) {
            wa.field_f[15] = ab.a(0, var2);
            break L89;
          } else {
            break L89;
          }
        }
        L90: {
          var2 = tf.a(0, "achievement_criteria,0");
          if (var2 == null) {
            break L90;
          } else {
            ij.field_J[0] = ab.a(0, var2);
            break L90;
          }
        }
        L91: {
          var2 = tf.a(0, "achievement_criteria,1");
          if (null != var2) {
            ij.field_J[1] = ab.a(0, var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = tf.a(0, "achievement_criteria,2");
          if (var2 != null) {
            ij.field_J[2] = ab.a(0, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = tf.a(0, "achievement_criteria,3");
          if (var2 == null) {
            break L93;
          } else {
            ij.field_J[3] = ab.a(0, var2);
            break L93;
          }
        }
        L94: {
          var2 = tf.a(0, "achievement_criteria,4");
          if (var2 == null) {
            break L94;
          } else {
            ij.field_J[4] = ab.a(0, var2);
            break L94;
          }
        }
        L95: {
          var2 = tf.a(0, "achievement_criteria,5");
          if (null != var2) {
            ij.field_J[5] = ab.a(0, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = tf.a(0, "achievement_criteria,6");
          if (var2 != null) {
            ij.field_J[6] = ab.a(0, var2);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          var2 = tf.a(0, "achievement_criteria,7");
          if (null != var2) {
            ij.field_J[7] = ab.a(0, var2);
            break L97;
          } else {
            break L97;
          }
        }
        L98: {
          var2 = tf.a(0, "achievement_criteria,8");
          if (var2 != null) {
            ij.field_J[8] = ab.a(0, var2);
            break L98;
          } else {
            break L98;
          }
        }
        L99: {
          var2 = tf.a(0, "achievement_criteria,9");
          if (var2 != null) {
            ij.field_J[9] = ab.a(0, var2);
            break L99;
          } else {
            break L99;
          }
        }
        L100: {
          var2 = tf.a(0, "achievement_criteria,10");
          if (null != var2) {
            ij.field_J[10] = ab.a(0, var2);
            break L100;
          } else {
            break L100;
          }
        }
        L101: {
          var2 = tf.a(0, "achievement_criteria,11");
          if (null != var2) {
            ij.field_J[11] = ab.a(0, var2);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          var2 = tf.a(0, "achievement_criteria,12");
          if (var2 != null) {
            ij.field_J[12] = ab.a(0, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          var2 = tf.a(0, "achievement_criteria,13");
          if (null != var2) {
            ij.field_J[13] = ab.a(0, var2);
            break L103;
          } else {
            break L103;
          }
        }
        L104: {
          var2 = tf.a(0, "achievement_criteria,14");
          if (null == var2) {
            break L104;
          } else {
            ij.field_J[14] = ab.a(0, var2);
            break L104;
          }
        }
        L105: {
          var2 = tf.a(0, "achievement_criteria,15");
          if (null == var2) {
            break L105;
          } else {
            ij.field_J[15] = ab.a(0, var2);
            break L105;
          }
        }
        L106: {
          var2 = tf.a(0, "BLOCKS_IN_THE_LEVEL_INTRO");
          if (null == var2) {
            break L106;
          } else {
            gj.field_D = ab.a(0, var2);
            break L106;
          }
        }
        L107: {
          var2 = tf.a(0, "SHADOW_OPEN");
          if (var2 != null) {
            ti.field_a = ab.a(0, var2);
            break L107;
          } else {
            break L107;
          }
        }
        L108: {
          var2 = tf.a(0, "SHADOW_CLOSE");
          if (null != var2) {
            ua.field_xb = ab.a(0, var2);
            break L108;
          } else {
            break L108;
          }
        }
        L109: {
          var2 = tf.a(0, "START_LEVEL_BUTTON_CAPTION");
          if (null == var2) {
            break L109;
          } else {
            hg.field_o = ab.a(0, var2);
            break L109;
          }
        }
        L110: {
          var2 = tf.a(0, "START_LEVEL_BUTTON_CAPTION_EXT");
          if (null != var2) {
            String discarded$1 = ab.a(0, var2);
            break L110;
          } else {
            break L110;
          }
        }
        L111: {
          var2 = tf.a(0, "GOTO_NEXT_LEVEL_BUTTON_CAPTION");
          if (null != var2) {
            nj.field_d = ab.a(0, var2);
            break L111;
          } else {
            break L111;
          }
        }
        L112: {
          var2 = tf.a(0, "ENTRANCE_TIP");
          if (null == var2) {
            break L112;
          } else {
            jk.field_o = ab.a(0, var2);
            break L112;
          }
        }
        L113: {
          var2 = tf.a(0, "WALL_TIP");
          if (null != var2) {
            ak.field_g = ab.a(0, var2);
            break L113;
          } else {
            break L113;
          }
        }
        L114: {
          var2 = tf.a(0, "RAMP_TIP");
          if (var2 != null) {
            qa.field_o = ab.a(0, var2);
            break L114;
          } else {
            break L114;
          }
        }
        L115: {
          var2 = tf.a(0, "BALLOON_TIP");
          if (null == var2) {
            break L115;
          } else {
            ta.field_s = ab.a(0, var2);
            break L115;
          }
        }
        L116: {
          var2 = tf.a(0, "TRAPDOOR_TIP");
          if (null != var2) {
            wh.field_c = ab.a(0, var2);
            break L116;
          } else {
            break L116;
          }
        }
        L117: {
          var2 = tf.a(0, "WATER_TIP");
          if (var2 != null) {
            jk.field_q = ab.a(0, var2);
            break L117;
          } else {
            break L117;
          }
        }
        L118: {
          var2 = tf.a(0, "FAN_TIP");
          if (var2 != null) {
            ga.field_r = ab.a(0, var2);
            break L118;
          } else {
            break L118;
          }
        }
        L119: {
          var2 = tf.a(0, "SPIDER_TIP");
          if (var2 == null) {
            break L119;
          } else {
            wj.field_a = ab.a(0, var2);
            break L119;
          }
        }
        L120: {
          var2 = tf.a(0, "TRANSPORTER_TIP");
          if (null != var2) {
            of.field_g = ab.a(0, var2);
            break L120;
          } else {
            break L120;
          }
        }
        L121: {
          var2 = tf.a(0, "BOMB_TIP");
          if (null != var2) {
            ca.field_O = ab.a(0, var2);
            break L121;
          } else {
            break L121;
          }
        }
        L122: {
          var2 = tf.a(0, "EXIT_TIP");
          if (var2 != null) {
            fh.field_f = ab.a(0, var2);
            break L122;
          } else {
            break L122;
          }
        }
        L123: {
          var2 = tf.a(0, "RECESSED_WALL_TIP");
          if (var2 != null) {
            hd.field_d = ab.a(0, var2);
            break L123;
          } else {
            break L123;
          }
        }
        L124: {
          var2 = tf.a(0, "ANTI_GRAVITY_TIP");
          if (null != var2) {
            qj.field_F = ab.a(0, var2);
            break L124;
          } else {
            break L124;
          }
        }
        L125: {
          var2 = tf.a(0, "BARRIER_TIP");
          if (null == var2) {
            break L125;
          } else {
            ti.field_b = ab.a(0, var2);
            break L125;
          }
        }
        L126: {
          var2 = tf.a(0, "ONE_TOUCH_WALL_TIP");
          if (var2 == null) {
            break L126;
          } else {
            wa.field_p = ab.a(0, var2);
            break L126;
          }
        }
        L127: {
          var2 = tf.a(0, "WEAK_PLATFORM_TIP");
          if (null != var2) {
            gf.field_a = ab.a(0, var2);
            break L127;
          } else {
            break L127;
          }
        }
        L128: {
          var2 = tf.a(0, "BLUE_SWITCH_TIP");
          if (var2 == null) {
            break L128;
          } else {
            gg.field_d = ab.a(0, var2);
            break L128;
          }
        }
        L129: {
          var2 = tf.a(0, "GREEN_SWITCH_TIP");
          if (var2 != null) {
            fi.field_k = ab.a(0, var2);
            break L129;
          } else {
            break L129;
          }
        }
        L130: {
          var2 = tf.a(0, "SPIKES_TIP");
          if (var2 != null) {
            ld.field_b = ab.a(0, var2);
            break L130;
          } else {
            break L130;
          }
        }
        L131: {
          var2 = tf.a(0, "SPRING_TIP");
          if (var2 == null) {
            break L131;
          } else {
            si.field_H = ab.a(0, var2);
            break L131;
          }
        }
        L132: {
          var2 = tf.a(0, "TUTORIAL_TEXT,0");
          if (var2 == null) {
            break L132;
          } else {
            kl.field_a[0] = ab.a(0, var2);
            break L132;
          }
        }
        L133: {
          var2 = tf.a(0, "TUTORIAL_TEXT,1");
          if (var2 != null) {
            kl.field_a[1] = ab.a(0, var2);
            break L133;
          } else {
            break L133;
          }
        }
        L134: {
          var2 = tf.a(0, "TUTORIAL_TEXT,2");
          if (var2 == null) {
            break L134;
          } else {
            kl.field_a[2] = ab.a(0, var2);
            break L134;
          }
        }
        L135: {
          var2 = tf.a(0, "TUTORIAL_TEXT,3");
          if (null != var2) {
            kl.field_a[3] = ab.a(0, var2);
            break L135;
          } else {
            break L135;
          }
        }
        L136: {
          var2 = tf.a(0, "TUTORIAL_TEXT,4");
          if (var2 == null) {
            break L136;
          } else {
            kl.field_a[4] = ab.a(0, var2);
            break L136;
          }
        }
        L137: {
          var2 = tf.a(0, "TUTORIAL_TEXT,5");
          if (var2 == null) {
            break L137;
          } else {
            kl.field_a[5] = ab.a(0, var2);
            break L137;
          }
        }
        L138: {
          var2 = tf.a(0, "TUTORIAL_TEXT,6");
          if (var2 != null) {
            kl.field_a[6] = ab.a(0, var2);
            break L138;
          } else {
            break L138;
          }
        }
        L139: {
          var2 = tf.a(0, "TUTORIAL_TEXT,7");
          if (null == var2) {
            break L139;
          } else {
            kl.field_a[7] = ab.a(0, var2);
            break L139;
          }
        }
        L140: {
          var2 = tf.a(0, "TUTORIAL_TEXT,8");
          if (var2 != null) {
            kl.field_a[8] = ab.a(0, var2);
            break L140;
          } else {
            break L140;
          }
        }
        L141: {
          var2 = tf.a(0, "TUTORIAL_TEXT,9");
          if (null == var2) {
            break L141;
          } else {
            kl.field_a[9] = ab.a(0, var2);
            break L141;
          }
        }
        L142: {
          var2 = tf.a(0, "TUTORIAL_TEXT,10");
          if (var2 == null) {
            break L142;
          } else {
            kl.field_a[10] = ab.a(0, var2);
            break L142;
          }
        }
        L143: {
          var2 = tf.a(0, "TUTORIAL_TEXT,11");
          if (var2 != null) {
            kl.field_a[11] = ab.a(0, var2);
            break L143;
          } else {
            break L143;
          }
        }
        L144: {
          var2 = tf.a(0, "TUTORIAL_TEXT,12");
          if (var2 != null) {
            kl.field_a[12] = ab.a(0, var2);
            break L144;
          } else {
            break L144;
          }
        }
        L145: {
          var2 = tf.a(0, "TUTORIAL_TEXT,13");
          if (null == var2) {
            break L145;
          } else {
            kl.field_a[13] = ab.a(0, var2);
            break L145;
          }
        }
        L146: {
          var2 = tf.a(0, "TUTORIAL_TEXT,14");
          if (var2 == null) {
            break L146;
          } else {
            kl.field_a[14] = ab.a(0, var2);
            break L146;
          }
        }
        L147: {
          var2 = tf.a(0, "NEW_GAME");
          if (null == var2) {
            break L147;
          } else {
            ec.field_a = ab.a(0, var2);
            break L147;
          }
        }
        L148: {
          var2 = tf.a(0, "CLASSIC_GAME");
          if (null != var2) {
            ib.field_e = ab.a(0, var2);
            break L148;
          } else {
            break L148;
          }
        }
        L149: {
          var2 = tf.a(0, "CONTINUE");
          if (null == var2) {
            break L149;
          } else {
            r.field_k = ab.a(0, var2);
            break L149;
          }
        }
        L150: {
          var2 = tf.a(0, "SHOW_TIPS");
          if (var2 == null) {
            break L150;
          } else {
            bb.field_H = ab.a(0, var2);
            break L150;
          }
        }
        L151: {
          var2 = tf.a(0, "INSTRUCTIONS_TITLES_1");
          if (null != var2) {
            fj.field_a = ab.a(0, var2);
            break L151;
          } else {
            break L151;
          }
        }
        L152: {
          var2 = tf.a(0, "INSTRUCTIONS_TITLES_2");
          if (null == var2) {
            break L152;
          } else {
            pb.field_h = ab.a(0, var2);
            break L152;
          }
        }
        L153: {
          var2 = tf.a(0, "INSTRUCTIONS_TITLES_3");
          if (var2 == null) {
            break L153;
          } else {
            tb.field_b = ab.a(0, var2);
            break L153;
          }
        }
        L154: {
          var2 = tf.a(0, "INSTRUCTIONS_TITLES_4");
          if (var2 != null) {
            mh.field_v = ab.a(0, var2);
            break L154;
          } else {
            break L154;
          }
        }
        L155: {
          var2 = tf.a(0, "INSTRUCTIONS_TITLES_5");
          if (var2 != null) {
            na.field_b = ab.a(0, var2);
            break L155;
          } else {
            break L155;
          }
        }
        L156: {
          var2 = tf.a(0, "INSTRUCTIONS_TITLES_6");
          if (null == var2) {
            break L156;
          } else {
            ec.field_d = ab.a(0, var2);
            break L156;
          }
        }
        L157: {
          var2 = tf.a(0, "INSTRUCTIONS_TITLES_7");
          if (var2 != null) {
            vj.field_a = ab.a(0, var2);
            break L157;
          } else {
            break L157;
          }
        }
        L158: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_1_1");
          if (null != var2) {
            em.field_a = ab.a(0, var2);
            break L158;
          } else {
            break L158;
          }
        }
        L159: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_1_2");
          if (null == var2) {
            break L159;
          } else {
            hf.field_f = ab.a(0, var2);
            break L159;
          }
        }
        L160: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_1_3");
          if (null == var2) {
            break L160;
          } else {
            oj.field_j = ab.a(0, var2);
            break L160;
          }
        }
        L161: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_1");
          if (var2 != null) {
            hc.field_f = ab.a(0, var2);
            break L161;
          } else {
            break L161;
          }
        }
        L162: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_2");
          if (null != var2) {
            si.field_o = ab.a(0, var2);
            break L162;
          } else {
            break L162;
          }
        }
        L163: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_3");
          if (null != var2) {
            ia.field_o = ab.a(0, var2);
            break L163;
          } else {
            break L163;
          }
        }
        L164: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_4");
          if (var2 == null) {
            break L164;
          } else {
            vg.field_v = ab.a(0, var2);
            break L164;
          }
        }
        L165: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_5");
          if (null != var2) {
            qa.field_q = ab.a(0, var2);
            break L165;
          } else {
            break L165;
          }
        }
        L166: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_6");
          if (null == var2) {
            break L166;
          } else {
            ea.field_c = ab.a(0, var2);
            break L166;
          }
        }
        L167: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_7");
          if (var2 != null) {
            cl.field_c = ab.a(0, var2);
            break L167;
          } else {
            break L167;
          }
        }
        L168: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_2_8");
          if (var2 != null) {
            wa.field_d = ab.a(0, var2);
            break L168;
          } else {
            break L168;
          }
        }
        L169: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_3_1");
          if (null == var2) {
            break L169;
          } else {
            fl.field_d = ab.a(0, var2);
            break L169;
          }
        }
        L170: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_3_2");
          if (null != var2) {
            oc.field_d = ab.a(0, var2);
            break L170;
          } else {
            break L170;
          }
        }
        L171: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_3_3");
          if (null != var2) {
            af.field_a = ab.a(0, var2);
            break L171;
          } else {
            break L171;
          }
        }
        L172: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_3_4");
          if (var2 == null) {
            break L172;
          } else {
            dl.field_u = ab.a(0, var2);
            break L172;
          }
        }
        L173: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_3_5");
          if (var2 != null) {
            kl.field_d = ab.a(0, var2);
            break L173;
          } else {
            break L173;
          }
        }
        L174: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_3_6");
          if (null != var2) {
            w.field_i = ab.a(0, var2);
            break L174;
          } else {
            break L174;
          }
        }
        L175: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_4_1");
          if (null == var2) {
            break L175;
          } else {
            hc.field_c = ab.a(0, var2);
            break L175;
          }
        }
        L176: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_4_2");
          if (var2 != null) {
            pl.field_i = ab.a(0, var2);
            break L176;
          } else {
            break L176;
          }
        }
        L177: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_4_3");
          if (var2 != null) {
            oe.field_b = ab.a(0, var2);
            break L177;
          } else {
            break L177;
          }
        }
        L178: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_4_4");
          if (null == var2) {
            break L178;
          } else {
            em.field_h = ab.a(0, var2);
            break L178;
          }
        }
        L179: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_4_5");
          if (null != var2) {
            re.field_b = ab.a(0, var2);
            break L179;
          } else {
            break L179;
          }
        }
        L180: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_4_6");
          if (var2 == null) {
            break L180;
          } else {
            kf.field_j = ab.a(0, var2);
            break L180;
          }
        }
        L181: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_4_7");
          if (null != var2) {
            lg.field_a = ab.a(0, var2);
            break L181;
          } else {
            break L181;
          }
        }
        L182: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_5_1");
          if (var2 != null) {
            jg.field_c = ab.a(0, var2);
            break L182;
          } else {
            break L182;
          }
        }
        L183: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_5_2");
          if (null == var2) {
            break L183;
          } else {
            hm.field_f = ab.a(0, var2);
            break L183;
          }
        }
        L184: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_5_3");
          if (var2 != null) {
            ui.field_lb = ab.a(0, var2);
            break L184;
          } else {
            break L184;
          }
        }
        L185: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_5_4");
          if (null == var2) {
            break L185;
          } else {
            gm.field_ib = ab.a(0, var2);
            break L185;
          }
        }
        L186: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_5_5");
          if (var2 == null) {
            break L186;
          } else {
            j.field_l = ab.a(0, var2);
            break L186;
          }
        }
        L187: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_5_6");
          if (null == var2) {
            break L187;
          } else {
            cj.field_a = ab.a(0, var2);
            break L187;
          }
        }
        L188: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_6_1");
          if (null != var2) {
            jj.field_V = ab.a(0, var2);
            break L188;
          } else {
            break L188;
          }
        }
        L189: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_6_2");
          if (null != var2) {
            g.field_t = ab.a(0, var2);
            break L189;
          } else {
            break L189;
          }
        }
        L190: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_6_3");
          if (null == var2) {
            break L190;
          } else {
            qj.field_E = ab.a(0, var2);
            break L190;
          }
        }
        L191: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_7_1");
          if (null == var2) {
            break L191;
          } else {
            ga.field_q = ab.a(0, var2);
            break L191;
          }
        }
        L192: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_7_2");
          if (var2 == null) {
            break L192;
          } else {
            kb.field_n = ab.a(0, var2);
            break L192;
          }
        }
        L193: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_7_3");
          if (var2 == null) {
            break L193;
          } else {
            vc.field_g = ab.a(0, var2);
            break L193;
          }
        }
        L194: {
          var2 = tf.a(0, "INSTRUCTIONS_BODIES_7_4");
          if (null == var2) {
            break L194;
          } else {
            ai.field_o = ab.a(0, var2);
            break L194;
          }
        }
        L195: {
          var2 = tf.a(0, "GAME_NAME_JSTRING");
          if (null == var2) {
            break L195;
          } else {
            ih.field_m = ab.a(0, var2);
            break L195;
          }
        }
        L196: {
          var2 = tf.a(0, "GAME_COMPLETE,0");
          if (var2 == null) {
            break L196;
          } else {
            bh.field_u[0] = ab.a(0, var2);
            break L196;
          }
        }
        L197: {
          var2 = tf.a(0, "GAME_COMPLETE,1");
          if (var2 != null) {
            bh.field_u[1] = ab.a(0, var2);
            break L197;
          } else {
            break L197;
          }
        }
        L198: {
          var2 = tf.a(0, "GAME_COMPLETE,2");
          if (var2 != null) {
            bh.field_u[2] = ab.a(0, var2);
            break L198;
          } else {
            break L198;
          }
        }
        L199: {
          var2 = tf.a(0, "LEVEL_NOT_YET_REACHED_MESSAGE");
          if (var2 == null) {
            break L199;
          } else {
            ik.field_C = ab.a(0, var2);
            break L199;
          }
        }
        L200: {
          var2 = tf.a(0, "LABEL_BUTTON_BLOCK");
          if (null == var2) {
            break L200;
          } else {
            ha.field_p = ab.a(0, var2);
            break L200;
          }
        }
        L201: {
          var2 = tf.a(0, "LABEL_BUTTON_LEFTSLOPE");
          if (var2 != null) {
            j.field_h = ab.a(0, var2);
            break L201;
          } else {
            break L201;
          }
        }
        L202: {
          var2 = tf.a(0, "LABEL_BUTTON_RIGHTSLOPE");
          if (null != var2) {
            tb.field_e = ab.a(0, var2);
            break L202;
          } else {
            break L202;
          }
        }
        L203: {
          var2 = tf.a(0, "LABEL_LEVELNAME");
          if (null != var2) {
            pk.field_G = ab.a(0, var2);
            break L203;
          } else {
            break L203;
          }
        }
        L204: {
          var2 = tf.a(0, "LABEL_FLEAINFO");
          var3 = -26 / ((-20 - param0) / 37);
          if (var2 == null) {
            break L204;
          } else {
            fb.field_f = ab.a(0, var2);
            break L204;
          }
        }
        L205: {
          var2 = tf.a(0, "LABEL_FLEAINFO_LEVELSELECT");
          if (var2 == null) {
            break L205;
          } else {
            kl.field_b = ab.a(0, var2);
            break L205;
          }
        }
        L206: {
          var2 = tf.a(0, "LABEL_MUSTSAVE");
          if (var2 == null) {
            break L206;
          } else {
            fleas.field_H = ab.a(0, var2);
            break L206;
          }
        }
        L207: {
          var2 = tf.a(0, "LABEL_FLEASRESCUED");
          if (var2 != null) {
            va.field_s = ab.a(0, var2);
            break L207;
          } else {
            break L207;
          }
        }
        L208: {
          var2 = tf.a(0, "LABEL_SCORE");
          if (null == var2) {
            break L208;
          } else {
            hm.field_h = ab.a(0, var2);
            break L208;
          }
        }
        L209: {
          var2 = tf.a(0, "LABEL_SCORE_THIS_LEVEL");
          if (null != var2) {
            pd.field_i = ab.a(0, var2);
            break L209;
          } else {
            break L209;
          }
        }
        L210: {
          var2 = tf.a(0, "BONUS");
          if (null == var2) {
            break L210;
          } else {
            fleas.field_I = ab.a(0, var2);
            break L210;
          }
        }
        L211: {
          var2 = tf.a(0, "LABEL_BONUS_TIME");
          if (var2 == null) {
            break L211;
          } else {
            lf.field_b = ab.a(0, var2);
            break L211;
          }
        }
        L212: {
          var2 = tf.a(0, "LABEL_LEVELCOMPLETE");
          if (null != var2) {
            fi.field_l = ab.a(0, var2);
            break L212;
          } else {
            break L212;
          }
        }
        L213: {
          var2 = tf.a(0, "LEVEL_FAIL_MESSAGE");
          if (var2 == null) {
            break L213;
          } else {
            uj.field_d = ab.a(0, var2);
            break L213;
          }
        }
        L214: {
          var2 = tf.a(0, "members_benefits_captions,0");
          if (null != var2) {
            jd.field_g[0] = ab.a(0, var2);
            break L214;
          } else {
            break L214;
          }
        }
        L215: {
          var2 = tf.a(0, "members_benefits_captions,1");
          if (null == var2) {
            break L215;
          } else {
            jd.field_g[1] = ab.a(0, var2);
            break L215;
          }
        }
        L216: {
          var2 = tf.a(0, "members_benefits_captions,2");
          if (null == var2) {
            break L216;
          } else {
            jd.field_g[2] = ab.a(0, var2);
            break L216;
          }
        }
        L217: {
          var2 = tf.a(0, "members_benefits_captions,3");
          if (var2 == null) {
            break L217;
          } else {
            jd.field_g[3] = ab.a(0, var2);
            break L217;
          }
        }
        em.field_c = null;
        L218: {
          if (!cd.field_e) {
            break L218;
          } else {
            L219: {
              if (var4 == 0) {
                stackOut_558_0 = 1;
                stackIn_559_0 = stackOut_558_0;
                break L219;
              } else {
                stackOut_557_0 = 0;
                stackIn_559_0 = stackOut_557_0;
                break L219;
              }
            }
            fleas.field_A = stackIn_559_0 != 0;
            break L218;
          }
        }
    }

    uh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Retry";
        field_n = new int[5];
        field_t = "Highscores";
    }
}
