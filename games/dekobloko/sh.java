/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static cb field_g;
    static String field_h;
    static boolean field_j;
    static String field_b;
    static String field_e;
    static String field_c;
    static mi field_a;
    static long field_f;
    static int field_i;
    static af field_d;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 < -17) {
                break L0;
              } else {
                field_a = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_d = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_a = null;
          field_b = null;
          field_g = null;
        }
    }

    final static void a(int param0) {
        try {
            k.field_e = null;
            wd.field_d = false;
            pa.field_Z = -1;
            dh.field_e = -1;
            jc.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "sh.D(" + param0 + 41);
        }
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var5_int ^ -1) <= (a.field_r.length ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param2 = a.field_r[var5_int];
                        stackOut_3_0 = var5_int << 423294052;
                        stackIn_14_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var7 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param2--;
                        if (0 == param2) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6++;
                        param4 = hb.field_Vb[var6];
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param3[param0[param4]] = param3[param0[param4]] + 1;
                        hb.field_Vb[param3[param0[param4]]] = param4;
                        if (var7 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int++;
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
                        if (var7 == 0) {
                            statePc = 2;
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
                        stackOut_13_0 = param1;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == -25724) {
                            statePc = 29;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        sh.a(-65);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) runtimeException;
                        stackOut_20_1 = new StringBuilder().append("sh.E(");
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
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param3 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw dh.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param4 + 41);
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ck param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9_int = param3 + (param7.field_F + param6 - param0);
                        var10 = param4 + (param3 + param7.field_F) + param6;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param2 == 25547) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        sh.a((byte[]) null, 13, 74, (int[]) null, -77);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = param8 + param7.field_z + (param7.field_H >> -1694860959);
                        hk.f(var9_int, 0, var10, var11 + param5);
                        param7.f(-1 + param3, param8 + -1, param1);
                        param7.f(param3 - 1, param8 + 1, param1);
                        hk.a(he.field_V);
                        hk.f(var9_int - -1, 0, var10 + 1, param5 + var11);
                        param7.f(param3 - -1, -1 + param8, param1);
                        param7.f(1 + param3, param8 - -1, param1);
                        hk.a(he.field_V);
                        var10 = -param0 + -param6 + param3 + param7.field_F + param7.field_I;
                        var9_int = -param4 + (-param6 + param7.field_I + param7.field_F) - -param3;
                        hk.f(var9_int, -param5 + var11, var10, 480);
                        param7.f(param3 - 1, -1 + param8, param1);
                        param7.f(param3 - 1, 1 + param8, param1);
                        hk.a(he.field_V);
                        hk.f(1 + var9_int, var11 + -param5, var10 + 1, 480);
                        param7.f(1 + param3, -1 + param8, param1);
                        param7.f(param3 + 1, param8 - -1, param1);
                        hk.a(he.field_V);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var9 = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) var9;
                        stackOut_8_1 = new StringBuilder().append("sh.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param7 == null) {
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
                    throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param8 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, ji param1) {
        byte[] var2 = null;
        L0: {
          pc.field_b = param1;
          var2 = kb.a(-24, "gamename");
          if (var2 != null) {
            ph.field_Gb = qj.a(var2, 2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = kb.a(-18, "benefits,0");
          if (null != var2) {
            ac.field_z[0] = qj.a(var2, 2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = kb.a(-116, "benefits,1");
          if (null != var2) {
            ac.field_z[1] = qj.a(var2, 2);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = kb.a(-72, "benefits,2");
          if (null == var2) {
            break L3;
          } else {
            ac.field_z[2] = qj.a(var2, 2);
            break L3;
          }
        }
        L4: {
          var2 = kb.a(-52, "benefits,3");
          if (var2 != null) {
            ac.field_z[3] = qj.a(var2, 2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = kb.a(-30, "benefits,4");
          if (var2 == null) {
            break L5;
          } else {
            ac.field_z[4] = qj.a(var2, 2);
            break L5;
          }
        }
        L6: {
          var2 = kb.a(-29, "benefits,5");
          if (null == var2) {
            break L6;
          } else {
            ac.field_z[5] = qj.a(var2, 2);
            break L6;
          }
        }
        L7: {
          var2 = kb.a(-58, "waitingfor_backgrounds");
          if (null != var2) {
            qa.field_w = qj.a(var2, 2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = kb.a(-68, "loading_backgrounds");
          if (null == var2) {
            break L8;
          } else {
            ga.field_b = qj.a(var2, 2);
            break L8;
          }
        }
        L9: {
          var2 = kb.a(-75, "mp_x_players_wanttodraw");
          if (var2 != null) {
            we.field_e = qj.a(var2, 2);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var2 = kb.a(-77, "press_esc_to_accept");
          if (var2 != null) {
            cg.field_b = qj.a(var2, 2);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = kb.a(-112, "keycode_rotateleft");
          if (null != var2) {
            oh.field_n = var2[0] & 255;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          var2 = kb.a(-90, "keycode_rotateright");
          if (null != var2) {
            um.field_d = var2[0] & 255;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = kb.a(-76, "rated_membersonly");
          if (var2 == null) {
            break L13;
          } else {
            uj.field_g = qj.a(var2, 2);
            break L13;
          }
        }
        L14: {
          var2 = kb.a(-97, "staminamode");
          if (null != var2) {
            gn.field_d = qj.a(var2, 2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = kb.a(-63, "masterchallenge");
          if (var2 == null) {
            break L15;
          } else {
            b.field_Q = qj.a(var2, 2);
            break L15;
          }
        }
        L16: {
          var2 = kb.a(-54, "challenge_highscores");
          if (null == var2) {
            break L16;
          } else {
            ul.field_b = qj.a(var2, 2);
            break L16;
          }
        }
        L17: {
          var2 = kb.a(-103, "stamina_highscores");
          if (null != var2) {
            ak.field_e = qj.a(var2, 2);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var2 = kb.a(-125, "multiplayer_rankings");
          if (null == var2) {
            break L18;
          } else {
            u.field_g = qj.a(var2, 2);
            break L18;
          }
        }
        L19: {
          var2 = kb.a(-113, "player");
          if (null == var2) {
            break L19;
          } else {
            ub.field_e = qj.a(var2, 2);
            break L19;
          }
        }
        L20: {
          var2 = kb.a(-106, "status");
          if (null == var2) {
            break L20;
          } else {
            tf.field_ab = qj.a(var2, 2);
            break L20;
          }
        }
        L21: {
          var2 = kb.a(-46, "position");
          if (var2 == null) {
            break L21;
          } else {
            p.field_d = qj.a(var2, 2);
            break L21;
          }
        }
        L22: {
          var2 = kb.a(-126, "winner");
          if (null != var2) {
            oi.field_e = qj.a(var2, 2);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          var2 = kb.a(-111, "drawn");
          if (var2 != null) {
            oi.field_b = qj.a(var2, 2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = kb.a(-78, "playing");
          if (null == var2) {
            break L24;
          } else {
            eg.field_a = qj.a(var2, 2);
            break L24;
          }
        }
        L25: {
          var2 = kb.a(-116, "resigned");
          if (null != var2) {
            v.field_f = qj.a(var2, 2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = kb.a(-119, "left");
          if (null != var2) {
            rc.field_h = qj.a(var2, 2);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          var2 = kb.a(-108, "defeated");
          if (var2 == null) {
            break L27;
          } else {
            wl.field_s = qj.a(var2, 2);
            break L27;
          }
        }
        L28: {
          var2 = kb.a(-58, "rematch_request");
          if (var2 == null) {
            break L28;
          } else {
            we.field_g = qj.a(var2, 2);
            break L28;
          }
        }
        L29: {
          var2 = kb.a(-95, "draw_request");
          if (var2 == null) {
            break L29;
          } else {
            sk.field_b = qj.a(var2, 2);
            break L29;
          }
        }
        L30: {
          var2 = kb.a(-21, "ready");
          if (null == var2) {
            break L30;
          } else {
            ub.field_b = qj.a(var2, 2);
            break L30;
          }
        }
        L31: {
          var2 = kb.a(-82, "steady");
          if (null != var2) {
            ui.field_o = qj.a(var2, 2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = kb.a(-80, "total");
          if (var2 != null) {
            n.field_a = qj.a(var2, 2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = kb.a(-31, "settling_score");
          if (var2 != null) {
            th.field_a = qj.a(var2, 2);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          var2 = kb.a(-44, "matching_score");
          if (var2 != null) {
            t.field_bb = qj.a(var2, 2);
            break L34;
          } else {
            break L34;
          }
        }
        if (!param0) {
          L35: {
            var2 = kb.a(-42, "eliminate_score");
            if (null == var2) {
              break L35;
            } else {
              ii.field_p = qj.a(var2, 2);
              break L35;
            }
          }
          L36: {
            var2 = kb.a(-51, "simultaneous_bonus");
            if (null == var2) {
              break L36;
            } else {
              jc.field_b = qj.a(var2, 2);
              break L36;
            }
          }
          L37: {
            var2 = kb.a(-117, "chain_bonus");
            if (var2 == null) {
              break L37;
            } else {
              wm.field_m = qj.a(var2, 2);
              break L37;
            }
          }
          L38: {
            var2 = kb.a(-105, "special_item_bonus");
            if (var2 == null) {
              break L38;
            } else {
              on.field_a = qj.a(var2, 2);
              break L38;
            }
          }
          L39: {
            var2 = kb.a(-23, "fast_drop_bonus");
            if (null != var2) {
              qi.field_L = qj.a(var2, 2);
              break L39;
            } else {
              break L39;
            }
          }
          L40: {
            var2 = kb.a(-21, "press_space_or_enter");
            if (var2 == null) {
              break L40;
            } else {
              ak.field_c = qj.a(var2, 2);
              break L40;
            }
          }
          L41: {
            var2 = kb.a(-102, "shape_feedback");
            if (null != var2) {
              eh.field_e = qj.a(var2, 2);
              break L41;
            } else {
              break L41;
            }
          }
          L42: {
            var2 = kb.a(-126, "colours_in_play");
            if (null != var2) {
              field_e = qj.a(var2, 2);
              break L42;
            } else {
              break L42;
            }
          }
          L43: {
            var2 = kb.a(-17, "specials_enabled");
            if (var2 != null) {
              md.field_Y = qj.a(var2, 2);
              break L43;
            } else {
              break L43;
            }
          }
          L44: {
            var2 = kb.a(-86, "stage_colon");
            if (null == var2) {
              break L44;
            } else {
              qa.field_u = qj.a(var2, 2);
              break L44;
            }
          }
          L45: {
            var2 = kb.a(-127, "theme_colon");
            if (var2 == null) {
              break L45;
            } else {
              re.field_s = qj.a(var2, 2);
              break L45;
            }
          }
          L46: {
            var2 = kb.a(-29, "theme_x_strategy");
            if (null == var2) {
              break L46;
            } else {
              client.field_E = qj.a(var2, 2);
              break L46;
            }
          }
          L47: {
            var2 = kb.a(-65, "hs_theme");
            if (var2 != null) {
              a.field_x = qj.a(var2, 2);
              break L47;
            } else {
              break L47;
            }
          }
          L48: {
            var2 = kb.a(-33, "fruit");
            if (null == var2) {
              break L48;
            } else {
              vf.field_c = qj.a(var2, 2);
              break L48;
            }
          }
          L49: {
            var2 = kb.a(-90, "animals");
            if (null != var2) {
              t.field_ib = qj.a(var2, 2);
              break L49;
            } else {
              break L49;
            }
          }
          L50: {
            var2 = kb.a(-80, "breakfast");
            if (null != var2) {
              u.field_c = qj.a(var2, 2);
              break L50;
            } else {
              break L50;
            }
          }
          L51: {
            var2 = kb.a(-111, "bugs");
            if (var2 == null) {
              break L51;
            } else {
              kl.field_w = qj.a(var2, 2);
              break L51;
            }
          }
          L52: {
            var2 = kb.a(-24, "flowers");
            if (var2 != null) {
              dn.field_j = qj.a(var2, 2);
              break L52;
            } else {
              break L52;
            }
          }
          L53: {
            var2 = kb.a(-16, "undersea");
            if (var2 == null) {
              break L53;
            } else {
              ea.field_y = qj.a(var2, 2);
              break L53;
            }
          }
          L54: {
            var2 = kb.a(-21, "city");
            if (var2 != null) {
              l.field_e = qj.a(var2, 2);
              break L54;
            } else {
              break L54;
            }
          }
          L55: {
            var2 = kb.a(-47, "eightbit");
            if (var2 == null) {
              break L55;
            } else {
              pa.field_W = qj.a(var2, 2);
              break L55;
            }
          }
          L56: {
            var2 = kb.a(-29, "hs_stage");
            if (null == var2) {
              break L56;
            } else {
              ng.field_g = qj.a(var2, 2);
              break L56;
            }
          }
          L57: {
            var2 = kb.a(-38, "stage_x");
            if (var2 == null) {
              break L57;
            } else {
              dl.field_L = qj.a(var2, 2);
              break L57;
            }
          }
          L58: {
            var2 = kb.a(-125, "number_colon_name");
            if (null == var2) {
              break L58;
            } else {
              id.field_O = qj.a(var2, 2);
              break L58;
            }
          }
          L59: {
            var2 = kb.a(-61, "number_colon");
            if (var2 != null) {
              kk.field_q = qj.a(var2, 2);
              break L59;
            } else {
              break L59;
            }
          }
          L60: {
            var2 = kb.a(-115, "unlock_masterchallenge_free");
            if (var2 != null) {
              String discarded$1 = qj.a(var2, 2);
              break L60;
            } else {
              break L60;
            }
          }
          L61: {
            var2 = kb.a(-18, "unlock_masterchallenge_members");
            if (null != var2) {
              rg.field_f = qj.a(var2, 2);
              break L61;
            } else {
              break L61;
            }
          }
          L62: {
            var2 = kb.a(-21, "achievement_names,0");
            if (var2 == null) {
              break L62;
            } else {
              qk.field_s[0] = qj.a(var2, 2);
              break L62;
            }
          }
          L63: {
            var2 = kb.a(-30, "achievement_names,1");
            if (var2 == null) {
              break L63;
            } else {
              qk.field_s[1] = qj.a(var2, 2);
              break L63;
            }
          }
          L64: {
            var2 = kb.a(-34, "achievement_names,2");
            if (null != var2) {
              qk.field_s[2] = qj.a(var2, 2);
              break L64;
            } else {
              break L64;
            }
          }
          L65: {
            var2 = kb.a(-59, "achievement_names,3");
            if (null == var2) {
              break L65;
            } else {
              qk.field_s[3] = qj.a(var2, 2);
              break L65;
            }
          }
          L66: {
            var2 = kb.a(-39, "achievement_names,4");
            if (var2 == null) {
              break L66;
            } else {
              qk.field_s[4] = qj.a(var2, 2);
              break L66;
            }
          }
          L67: {
            var2 = kb.a(-123, "achievement_names,5");
            if (var2 != null) {
              qk.field_s[5] = qj.a(var2, 2);
              break L67;
            } else {
              break L67;
            }
          }
          L68: {
            var2 = kb.a(-105, "achievement_names,6");
            if (null == var2) {
              break L68;
            } else {
              qk.field_s[6] = qj.a(var2, 2);
              break L68;
            }
          }
          L69: {
            var2 = kb.a(-119, "achievement_names,7");
            if (null == var2) {
              break L69;
            } else {
              qk.field_s[7] = qj.a(var2, 2);
              break L69;
            }
          }
          L70: {
            var2 = kb.a(-68, "achievement_names,8");
            if (var2 == null) {
              break L70;
            } else {
              qk.field_s[8] = qj.a(var2, 2);
              break L70;
            }
          }
          L71: {
            var2 = kb.a(-51, "achievement_names,9");
            if (var2 != null) {
              qk.field_s[9] = qj.a(var2, 2);
              break L71;
            } else {
              break L71;
            }
          }
          L72: {
            var2 = kb.a(-18, "achievement_names,10");
            if (var2 == null) {
              break L72;
            } else {
              qk.field_s[10] = qj.a(var2, 2);
              break L72;
            }
          }
          L73: {
            var2 = kb.a(-25, "achievement_names,11");
            if (null != var2) {
              qk.field_s[11] = qj.a(var2, 2);
              break L73;
            } else {
              break L73;
            }
          }
          L74: {
            var2 = kb.a(-60, "achievement_names,12");
            if (null != var2) {
              qk.field_s[12] = qj.a(var2, 2);
              break L74;
            } else {
              break L74;
            }
          }
          L75: {
            var2 = kb.a(-105, "achievement_names,13");
            if (null != var2) {
              qk.field_s[13] = qj.a(var2, 2);
              break L75;
            } else {
              break L75;
            }
          }
          L76: {
            var2 = kb.a(-21, "achievement_names,14");
            if (var2 == null) {
              break L76;
            } else {
              qk.field_s[14] = qj.a(var2, 2);
              break L76;
            }
          }
          L77: {
            var2 = kb.a(-119, "achievement_names,15");
            if (null == var2) {
              break L77;
            } else {
              qk.field_s[15] = qj.a(var2, 2);
              break L77;
            }
          }
          L78: {
            var2 = kb.a(-26, "achievement_names,16");
            if (null != var2) {
              qk.field_s[16] = qj.a(var2, 2);
              break L78;
            } else {
              break L78;
            }
          }
          L79: {
            var2 = kb.a(-110, "achievement_names,17");
            if (var2 == null) {
              break L79;
            } else {
              qk.field_s[17] = qj.a(var2, 2);
              break L79;
            }
          }
          L80: {
            var2 = kb.a(-91, "achievement_names,18");
            if (var2 == null) {
              break L80;
            } else {
              qk.field_s[18] = qj.a(var2, 2);
              break L80;
            }
          }
          L81: {
            var2 = kb.a(-30, "achievement_names,19");
            if (null == var2) {
              break L81;
            } else {
              qk.field_s[19] = qj.a(var2, 2);
              break L81;
            }
          }
          L82: {
            var2 = kb.a(-49, "achievement_names,20");
            if (var2 == null) {
              break L82;
            } else {
              qk.field_s[20] = qj.a(var2, 2);
              break L82;
            }
          }
          L83: {
            var2 = kb.a(-79, "achievement_names,21");
            if (null != var2) {
              qk.field_s[21] = qj.a(var2, 2);
              break L83;
            } else {
              break L83;
            }
          }
          L84: {
            var2 = kb.a(-40, "achievement_names,22");
            if (null != var2) {
              qk.field_s[22] = qj.a(var2, 2);
              break L84;
            } else {
              break L84;
            }
          }
          L85: {
            var2 = kb.a(-108, "achievement_names,23");
            if (var2 != null) {
              qk.field_s[23] = qj.a(var2, 2);
              break L85;
            } else {
              break L85;
            }
          }
          L86: {
            var2 = kb.a(-78, "achievement_names,24");
            if (null == var2) {
              break L86;
            } else {
              qk.field_s[24] = qj.a(var2, 2);
              break L86;
            }
          }
          L87: {
            var2 = kb.a(-118, "achievement_names,25");
            if (var2 == null) {
              break L87;
            } else {
              qk.field_s[25] = qj.a(var2, 2);
              break L87;
            }
          }
          L88: {
            var2 = kb.a(-76, "achievement_names,26");
            if (null != var2) {
              qk.field_s[26] = qj.a(var2, 2);
              break L88;
            } else {
              break L88;
            }
          }
          L89: {
            var2 = kb.a(-57, "achievement_names,27");
            if (null != var2) {
              qk.field_s[27] = qj.a(var2, 2);
              break L89;
            } else {
              break L89;
            }
          }
          L90: {
            var2 = kb.a(-118, "achievement_names,28");
            if (var2 != null) {
              qk.field_s[28] = qj.a(var2, 2);
              break L90;
            } else {
              break L90;
            }
          }
          L91: {
            var2 = kb.a(-42, "achievement_names,29");
            if (var2 == null) {
              break L91;
            } else {
              qk.field_s[29] = qj.a(var2, 2);
              break L91;
            }
          }
          L92: {
            var2 = kb.a(-39, "achievement_names,30");
            if (null == var2) {
              break L92;
            } else {
              qk.field_s[30] = qj.a(var2, 2);
              break L92;
            }
          }
          L93: {
            var2 = kb.a(-96, "achievement_criteria,0");
            if (var2 == null) {
              break L93;
            } else {
              jh.field_c[0] = qj.a(var2, 2);
              break L93;
            }
          }
          L94: {
            var2 = kb.a(-40, "achievement_criteria,1");
            if (var2 != null) {
              jh.field_c[1] = qj.a(var2, 2);
              break L94;
            } else {
              break L94;
            }
          }
          L95: {
            var2 = kb.a(-18, "achievement_criteria,2");
            if (var2 == null) {
              break L95;
            } else {
              jh.field_c[2] = qj.a(var2, 2);
              break L95;
            }
          }
          L96: {
            var2 = kb.a(-54, "achievement_criteria,3");
            if (null != var2) {
              jh.field_c[3] = qj.a(var2, 2);
              break L96;
            } else {
              break L96;
            }
          }
          L97: {
            var2 = kb.a(-85, "achievement_criteria,4");
            if (null != var2) {
              jh.field_c[4] = qj.a(var2, 2);
              break L97;
            } else {
              break L97;
            }
          }
          L98: {
            var2 = kb.a(-72, "achievement_criteria,5");
            if (null != var2) {
              jh.field_c[5] = qj.a(var2, 2);
              break L98;
            } else {
              break L98;
            }
          }
          L99: {
            var2 = kb.a(-93, "achievement_criteria,6");
            if (var2 != null) {
              jh.field_c[6] = qj.a(var2, 2);
              break L99;
            } else {
              break L99;
            }
          }
          L100: {
            var2 = kb.a(-88, "achievement_criteria,7");
            if (null == var2) {
              break L100;
            } else {
              jh.field_c[7] = qj.a(var2, 2);
              break L100;
            }
          }
          L101: {
            var2 = kb.a(-128, "achievement_criteria,8");
            if (null == var2) {
              break L101;
            } else {
              jh.field_c[8] = qj.a(var2, 2);
              break L101;
            }
          }
          L102: {
            var2 = kb.a(-117, "achievement_criteria,9");
            if (null == var2) {
              break L102;
            } else {
              jh.field_c[9] = qj.a(var2, 2);
              break L102;
            }
          }
          L103: {
            var2 = kb.a(-75, "achievement_criteria,10");
            if (null == var2) {
              break L103;
            } else {
              jh.field_c[10] = qj.a(var2, 2);
              break L103;
            }
          }
          L104: {
            var2 = kb.a(-86, "achievement_criteria,11");
            if (null != var2) {
              jh.field_c[11] = qj.a(var2, 2);
              break L104;
            } else {
              break L104;
            }
          }
          L105: {
            var2 = kb.a(-94, "achievement_criteria,12");
            if (null != var2) {
              jh.field_c[12] = qj.a(var2, 2);
              break L105;
            } else {
              break L105;
            }
          }
          L106: {
            var2 = kb.a(-40, "achievement_criteria,13");
            if (var2 != null) {
              jh.field_c[13] = qj.a(var2, 2);
              break L106;
            } else {
              break L106;
            }
          }
          L107: {
            var2 = kb.a(-28, "achievement_criteria,14");
            if (var2 == null) {
              break L107;
            } else {
              jh.field_c[14] = qj.a(var2, 2);
              break L107;
            }
          }
          L108: {
            var2 = kb.a(-46, "achievement_criteria,15");
            if (null != var2) {
              jh.field_c[15] = qj.a(var2, 2);
              break L108;
            } else {
              break L108;
            }
          }
          L109: {
            var2 = kb.a(-82, "achievement_criteria,16");
            if (var2 != null) {
              jh.field_c[16] = qj.a(var2, 2);
              break L109;
            } else {
              break L109;
            }
          }
          L110: {
            var2 = kb.a(-61, "achievement_criteria,17");
            if (null != var2) {
              jh.field_c[17] = qj.a(var2, 2);
              break L110;
            } else {
              break L110;
            }
          }
          L111: {
            var2 = kb.a(-87, "achievement_criteria,18");
            if (var2 != null) {
              jh.field_c[18] = qj.a(var2, 2);
              break L111;
            } else {
              break L111;
            }
          }
          L112: {
            var2 = kb.a(-62, "achievement_criteria,19");
            if (var2 == null) {
              break L112;
            } else {
              jh.field_c[19] = qj.a(var2, 2);
              break L112;
            }
          }
          L113: {
            var2 = kb.a(-123, "achievement_criteria,20");
            if (var2 != null) {
              jh.field_c[20] = qj.a(var2, 2);
              break L113;
            } else {
              break L113;
            }
          }
          L114: {
            var2 = kb.a(-97, "achievement_criteria,21");
            if (var2 != null) {
              jh.field_c[21] = qj.a(var2, 2);
              break L114;
            } else {
              break L114;
            }
          }
          L115: {
            var2 = kb.a(-111, "achievement_criteria,22");
            if (null == var2) {
              break L115;
            } else {
              jh.field_c[22] = qj.a(var2, 2);
              break L115;
            }
          }
          L116: {
            var2 = kb.a(-38, "achievement_criteria,23");
            if (var2 == null) {
              break L116;
            } else {
              jh.field_c[23] = qj.a(var2, 2);
              break L116;
            }
          }
          L117: {
            var2 = kb.a(-86, "achievement_criteria,24");
            if (var2 == null) {
              break L117;
            } else {
              jh.field_c[24] = qj.a(var2, 2);
              break L117;
            }
          }
          L118: {
            var2 = kb.a(-51, "achievement_criteria,25");
            if (var2 != null) {
              jh.field_c[25] = qj.a(var2, 2);
              break L118;
            } else {
              break L118;
            }
          }
          L119: {
            var2 = kb.a(-117, "achievement_criteria,26");
            if (var2 == null) {
              break L119;
            } else {
              jh.field_c[26] = qj.a(var2, 2);
              break L119;
            }
          }
          L120: {
            var2 = kb.a(-109, "achievement_criteria,27");
            if (null != var2) {
              jh.field_c[27] = qj.a(var2, 2);
              break L120;
            } else {
              break L120;
            }
          }
          L121: {
            var2 = kb.a(-21, "achievement_criteria,28");
            if (null == var2) {
              break L121;
            } else {
              jh.field_c[28] = qj.a(var2, 2);
              break L121;
            }
          }
          L122: {
            var2 = kb.a(-16, "achievement_criteria,29");
            if (null != var2) {
              jh.field_c[29] = qj.a(var2, 2);
              break L122;
            } else {
              break L122;
            }
          }
          L123: {
            var2 = kb.a(-97, "achievement_criteria,30");
            if (var2 == null) {
              break L123;
            } else {
              jh.field_c[30] = qj.a(var2, 2);
              break L123;
            }
          }
          L124: {
            var2 = kb.a(-68, "gameoptlabels,0");
            if (var2 != null) {
              si.field_f[0] = qj.a(var2, 2);
              break L124;
            } else {
              break L124;
            }
          }
          L125: {
            var2 = kb.a(-72, "gameoptlabels,1");
            if (null != var2) {
              si.field_f[1] = qj.a(var2, 2);
              break L125;
            } else {
              break L125;
            }
          }
          L126: {
            var2 = kb.a(-25, "gameoptlabels,2");
            if (null == var2) {
              break L126;
            } else {
              si.field_f[2] = qj.a(var2, 2);
              break L126;
            }
          }
          L127: {
            var2 = kb.a(-126, "gameoptlabels,3");
            if (null == var2) {
              break L127;
            } else {
              si.field_f[3] = qj.a(var2, 2);
              break L127;
            }
          }
          L128: {
            var2 = kb.a(-90, "gameoptlabels,4");
            if (var2 == null) {
              break L128;
            } else {
              si.field_f[4] = qj.a(var2, 2);
              break L128;
            }
          }
          L129: {
            var2 = kb.a(-58, "gameopt_buttonnames,0,0");
            if (null == var2) {
              break L129;
            } else {
              tg.field_d[0][0] = qj.a(var2, 2);
              break L129;
            }
          }
          L130: {
            var2 = kb.a(-116, "gameopt_buttonnames,0,1");
            if (var2 != null) {
              tg.field_d[0][1] = qj.a(var2, 2);
              break L130;
            } else {
              break L130;
            }
          }
          L131: {
            var2 = kb.a(-64, "gameopt_buttonnames,1,0");
            if (null == var2) {
              break L131;
            } else {
              tg.field_d[1][0] = qj.a(var2, 2);
              break L131;
            }
          }
          L132: {
            var2 = kb.a(-104, "gameopt_buttonnames,1,1");
            if (null != var2) {
              tg.field_d[1][1] = qj.a(var2, 2);
              break L132;
            } else {
              break L132;
            }
          }
          L133: {
            var2 = kb.a(-77, "gameopt_buttonnames,1,2");
            if (null == var2) {
              break L133;
            } else {
              tg.field_d[1][2] = qj.a(var2, 2);
              break L133;
            }
          }
          L134: {
            var2 = kb.a(-25, "gameopt_buttonnames,1,3");
            if (null != var2) {
              tg.field_d[1][3] = qj.a(var2, 2);
              break L134;
            } else {
              break L134;
            }
          }
          L135: {
            var2 = kb.a(-37, "gameopt_buttonnames,1,4");
            if (var2 == null) {
              break L135;
            } else {
              tg.field_d[1][4] = qj.a(var2, 2);
              break L135;
            }
          }
          L136: {
            var2 = kb.a(-105, "gameopt_buttonnames,2,0");
            if (null != var2) {
              tg.field_d[2][0] = qj.a(var2, 2);
              break L136;
            } else {
              break L136;
            }
          }
          L137: {
            var2 = kb.a(-37, "gameopt_buttonnames,2,1");
            if (var2 != null) {
              tg.field_d[2][1] = qj.a(var2, 2);
              break L137;
            } else {
              break L137;
            }
          }
          L138: {
            var2 = kb.a(-37, "gameopt_buttonnames,2,2");
            if (var2 == null) {
              break L138;
            } else {
              tg.field_d[2][2] = qj.a(var2, 2);
              break L138;
            }
          }
          L139: {
            var2 = kb.a(-46, "gameopt_buttonnames,2,3");
            if (null != var2) {
              tg.field_d[2][3] = qj.a(var2, 2);
              break L139;
            } else {
              break L139;
            }
          }
          L140: {
            var2 = kb.a(-101, "gameopt_buttonnames,2,4");
            if (null == var2) {
              break L140;
            } else {
              tg.field_d[2][4] = qj.a(var2, 2);
              break L140;
            }
          }
          L141: {
            var2 = kb.a(-50, "gameopt_buttonnames,3,0");
            if (var2 != null) {
              tg.field_d[3][0] = qj.a(var2, 2);
              break L141;
            } else {
              break L141;
            }
          }
          L142: {
            var2 = kb.a(-106, "gameopt_buttonnames,3,1");
            if (null == var2) {
              break L142;
            } else {
              tg.field_d[3][1] = qj.a(var2, 2);
              break L142;
            }
          }
          L143: {
            var2 = kb.a(-63, "gameopt_buttonnames,3,2");
            if (null != var2) {
              tg.field_d[3][2] = qj.a(var2, 2);
              break L143;
            } else {
              break L143;
            }
          }
          L144: {
            var2 = kb.a(-49, "gameopt_buttonnames,3,3");
            if (null != var2) {
              tg.field_d[3][3] = qj.a(var2, 2);
              break L144;
            } else {
              break L144;
            }
          }
          L145: {
            var2 = kb.a(-79, "gameopt_buttonnames,3,4");
            if (null == var2) {
              break L145;
            } else {
              tg.field_d[3][4] = qj.a(var2, 2);
              break L145;
            }
          }
          L146: {
            var2 = kb.a(-89, "gameopt_buttonnames,4,0");
            if (var2 != null) {
              tg.field_d[4][0] = qj.a(var2, 2);
              break L146;
            } else {
              break L146;
            }
          }
          L147: {
            var2 = kb.a(-36, "gameopt_buttonnames,4,1");
            if (var2 != null) {
              tg.field_d[4][1] = qj.a(var2, 2);
              break L147;
            } else {
              break L147;
            }
          }
          L148: {
            var2 = kb.a(-82, "gameopt_buttonnames,4,2");
            if (null != var2) {
              tg.field_d[4][2] = qj.a(var2, 2);
              break L148;
            } else {
              break L148;
            }
          }
          L149: {
            var2 = kb.a(-18, "gameopt_buttonnames,4,3");
            if (null != var2) {
              tg.field_d[4][3] = qj.a(var2, 2);
              break L149;
            } else {
              break L149;
            }
          }
          L150: {
            var2 = kb.a(-121, "gameopt_tooltipnames,0,0");
            if (var2 != null) {
              qd.field_Pb[0][0] = qj.a(var2, 2);
              break L150;
            } else {
              break L150;
            }
          }
          L151: {
            var2 = kb.a(-62, "gameopt_tooltipnames,0,1");
            if (null != var2) {
              qd.field_Pb[0][1] = qj.a(var2, 2);
              break L151;
            } else {
              break L151;
            }
          }
          L152: {
            var2 = kb.a(-71, "gameopt_tooltipnames,1,0");
            if (var2 == null) {
              break L152;
            } else {
              qd.field_Pb[1][0] = qj.a(var2, 2);
              break L152;
            }
          }
          L153: {
            var2 = kb.a(-103, "gameopt_tooltipnames,1,1");
            if (var2 != null) {
              qd.field_Pb[1][1] = qj.a(var2, 2);
              break L153;
            } else {
              break L153;
            }
          }
          L154: {
            var2 = kb.a(-38, "gameopt_tooltipnames,1,2");
            if (null != var2) {
              qd.field_Pb[1][2] = qj.a(var2, 2);
              break L154;
            } else {
              break L154;
            }
          }
          L155: {
            var2 = kb.a(-123, "gameopt_tooltipnames,1,3");
            if (var2 == null) {
              break L155;
            } else {
              qd.field_Pb[1][3] = qj.a(var2, 2);
              break L155;
            }
          }
          L156: {
            var2 = kb.a(-128, "gameopt_tooltipnames,1,4");
            if (null == var2) {
              break L156;
            } else {
              qd.field_Pb[1][4] = qj.a(var2, 2);
              break L156;
            }
          }
          L157: {
            var2 = kb.a(-86, "gameopt_tooltipnames,2,0");
            if (var2 == null) {
              break L157;
            } else {
              qd.field_Pb[2][0] = qj.a(var2, 2);
              break L157;
            }
          }
          L158: {
            var2 = kb.a(-43, "gameopt_tooltipnames,2,1");
            if (var2 == null) {
              break L158;
            } else {
              qd.field_Pb[2][1] = qj.a(var2, 2);
              break L158;
            }
          }
          L159: {
            var2 = kb.a(-107, "gameopt_tooltipnames,2,2");
            if (var2 != null) {
              qd.field_Pb[2][2] = qj.a(var2, 2);
              break L159;
            } else {
              break L159;
            }
          }
          L160: {
            var2 = kb.a(-80, "gameopt_tooltipnames,2,3");
            if (var2 != null) {
              qd.field_Pb[2][3] = qj.a(var2, 2);
              break L160;
            } else {
              break L160;
            }
          }
          L161: {
            var2 = kb.a(-46, "gameopt_tooltipnames,2,4");
            if (null != var2) {
              qd.field_Pb[2][4] = qj.a(var2, 2);
              break L161;
            } else {
              break L161;
            }
          }
          L162: {
            var2 = kb.a(-45, "gameopt_tooltipnames,3,0");
            if (null != var2) {
              qd.field_Pb[3][0] = qj.a(var2, 2);
              break L162;
            } else {
              break L162;
            }
          }
          L163: {
            var2 = kb.a(-17, "gameopt_tooltipnames,3,1");
            if (null == var2) {
              break L163;
            } else {
              qd.field_Pb[3][1] = qj.a(var2, 2);
              break L163;
            }
          }
          L164: {
            var2 = kb.a(-51, "gameopt_tooltipnames,3,2");
            if (var2 != null) {
              qd.field_Pb[3][2] = qj.a(var2, 2);
              break L164;
            } else {
              break L164;
            }
          }
          L165: {
            var2 = kb.a(-83, "gameopt_tooltipnames,3,3");
            if (null != var2) {
              qd.field_Pb[3][3] = qj.a(var2, 2);
              break L165;
            } else {
              break L165;
            }
          }
          L166: {
            var2 = kb.a(-118, "gameopt_tooltipnames,3,4");
            if (null == var2) {
              break L166;
            } else {
              qd.field_Pb[3][4] = qj.a(var2, 2);
              break L166;
            }
          }
          L167: {
            var2 = kb.a(-79, "gameopt_tooltipnames,4,0");
            if (var2 != null) {
              qd.field_Pb[4][0] = qj.a(var2, 2);
              break L167;
            } else {
              break L167;
            }
          }
          L168: {
            var2 = kb.a(-116, "gameopt_tooltipnames,4,1");
            if (var2 != null) {
              qd.field_Pb[4][1] = qj.a(var2, 2);
              break L168;
            } else {
              break L168;
            }
          }
          L169: {
            var2 = kb.a(-63, "gameopt_tooltipnames,4,2");
            if (null == var2) {
              break L169;
            } else {
              qd.field_Pb[4][2] = qj.a(var2, 2);
              break L169;
            }
          }
          L170: {
            var2 = kb.a(-28, "instructions_titles_thebasics");
            if (var2 != null) {
              kc.field_s = qj.a(var2, 2);
              break L170;
            } else {
              break L170;
            }
          }
          L171: {
            var2 = kb.a(-46, "instructions_titles_thecontrols");
            if (null == var2) {
              break L171;
            } else {
              ug.field_n = qj.a(var2, 2);
              break L171;
            }
          }
          L172: {
            var2 = kb.a(-116, "instructions_titles_thetwist");
            if (var2 != null) {
              bj.field_c = qj.a(var2, 2);
              break L172;
            } else {
              break L172;
            }
          }
          L173: {
            var2 = kb.a(-58, "instructions_titles_inmultiplayer");
            if (null == var2) {
              break L173;
            } else {
              kc.field_q = qj.a(var2, 2);
              break L173;
            }
          }
          L174: {
            var2 = kb.a(-94, "instructions_titles_insingleplayer");
            if (null != var2) {
              fm.field_c = qj.a(var2, 2);
              break L174;
            } else {
              break L174;
            }
          }
          L175: {
            var2 = kb.a(-36, "instructions_titles_specialitems");
            if (null != var2) {
              mb.field_e = qj.a(var2, 2);
              break L175;
            } else {
              break L175;
            }
          }
          L176: {
            var2 = kb.a(-28, "instructions_titles_activatingspecialitems");
            if (var2 == null) {
              break L176;
            } else {
              hg.field_d = qj.a(var2, 2);
              break L176;
            }
          }
          L177: {
            var2 = kb.a(-89, "instructions_piecesarefalling");
            if (null != var2) {
              cc.field_d = qj.a(var2, 2);
              break L177;
            } else {
              break L177;
            }
          }
          L178: {
            var2 = kb.a(-42, "instructions_matchthepieces");
            if (null != var2) {
              dn.field_q = qj.a(var2, 2);
              break L178;
            } else {
              break L178;
            }
          }
          L179: {
            var2 = kb.a(-121, "instructions_machinetransforms");
            if (var2 == null) {
              break L179;
            } else {
              rf.field_i = qj.a(var2, 2);
              break L179;
            }
          }
          L180: {
            var2 = kb.a(-62, "instructions_clearingsolids");
            if (null == var2) {
              break L180;
            } else {
              rk.field_N = qj.a(var2, 2);
              break L180;
            }
          }
          L181: {
            var2 = kb.a(-52, "instructions_multiplayer_solids");
            if (var2 == null) {
              break L181;
            } else {
              di.field_D = qj.a(var2, 2);
              break L181;
            }
          }
          L182: {
            var2 = kb.a(-69, "instructions_singleplayer_solids");
            if (null == var2) {
              break L182;
            } else {
              ah.field_g = qj.a(var2, 2);
              break L182;
            }
          }
          L183: {
            var2 = kb.a(-122, "instructions_wildcard");
            if (null != var2) {
              nk.field_c = qj.a(var2, 2);
              break L183;
            } else {
              break L183;
            }
          }
          L184: {
            var2 = kb.a(-122, "instructions_gettingspecials");
            if (var2 != null) {
              kb.field_e = qj.a(var2, 2);
              break L184;
            } else {
              break L184;
            }
          }
          L185: {
            var2 = kb.a(-33, "instructions_activatingspecials");
            if (var2 != null) {
              dk.field_f = qj.a(var2, 2);
              break L185;
            } else {
              break L185;
            }
          }
          L186: {
            var2 = kb.a(-65, "instructions_multiplayer_specials");
            if (null == var2) {
              break L186;
            } else {
              ki.field_u = qj.a(var2, 2);
              break L186;
            }
          }
          L187: {
            var2 = kb.a(-47, "instructions_itemdescriptions,0,0");
            if (var2 == null) {
              break L187;
            } else {
              nk.field_d[0][0] = qj.a(var2, 2);
              break L187;
            }
          }
          L188: {
            var2 = kb.a(-17, "instructions_itemdescriptions,0,1");
            if (var2 != null) {
              nk.field_d[0][1] = qj.a(var2, 2);
              break L188;
            } else {
              break L188;
            }
          }
          L189: {
            var2 = kb.a(-98, "instructions_itemdescriptions,1,0");
            if (var2 == null) {
              break L189;
            } else {
              nk.field_d[1][0] = qj.a(var2, 2);
              break L189;
            }
          }
          L190: {
            var2 = kb.a(-103, "instructions_itemdescriptions,1,1");
            if (var2 == null) {
              break L190;
            } else {
              nk.field_d[1][1] = qj.a(var2, 2);
              break L190;
            }
          }
          L191: {
            var2 = kb.a(-27, "instructions_itemdescriptions,2,0");
            if (null != var2) {
              nk.field_d[2][0] = qj.a(var2, 2);
              break L191;
            } else {
              break L191;
            }
          }
          L192: {
            var2 = kb.a(-82, "instructions_itemdescriptions,2,1");
            if (var2 == null) {
              break L192;
            } else {
              nk.field_d[2][1] = qj.a(var2, 2);
              break L192;
            }
          }
          L193: {
            var2 = kb.a(-53, "instructions_itemdescriptions,3,0");
            if (var2 == null) {
              break L193;
            } else {
              nk.field_d[3][0] = qj.a(var2, 2);
              break L193;
            }
          }
          L194: {
            var2 = kb.a(-128, "instructions_itemdescriptions,3,1");
            if (null != var2) {
              nk.field_d[3][1] = qj.a(var2, 2);
              break L194;
            } else {
              break L194;
            }
          }
          L195: {
            var2 = kb.a(-79, "instructions_itemdescriptions,4,0");
            if (var2 == null) {
              break L195;
            } else {
              nk.field_d[4][0] = qj.a(var2, 2);
              break L195;
            }
          }
          L196: {
            var2 = kb.a(-123, "instructions_itemdescriptions,4,1");
            if (null != var2) {
              nk.field_d[4][1] = qj.a(var2, 2);
              break L196;
            } else {
              break L196;
            }
          }
          L197: {
            var2 = kb.a(-62, "instructions_itemdescriptions,5,0");
            if (var2 == null) {
              break L197;
            } else {
              nk.field_d[5][0] = qj.a(var2, 2);
              break L197;
            }
          }
          L198: {
            var2 = kb.a(-60, "instructions_itemdescriptions,5,1");
            if (var2 == null) {
              break L198;
            } else {
              nk.field_d[5][1] = qj.a(var2, 2);
              break L198;
            }
          }
          L199: {
            var2 = kb.a(-102, "instructions_itemdescriptions,6,0");
            if (null == var2) {
              break L199;
            } else {
              nk.field_d[6][0] = qj.a(var2, 2);
              break L199;
            }
          }
          L200: {
            var2 = kb.a(-55, "instructions_itemdescriptions,6,1");
            if (var2 != null) {
              nk.field_d[6][1] = qj.a(var2, 2);
              break L200;
            } else {
              break L200;
            }
          }
          L201: {
            var2 = kb.a(-124, "instructions_controls,0");
            if (null == var2) {
              break L201;
            } else {
              vk.field_b[0] = qj.a(var2, 2);
              break L201;
            }
          }
          L202: {
            var2 = kb.a(-92, "instructions_controls,1");
            if (var2 != null) {
              vk.field_b[1] = qj.a(var2, 2);
              break L202;
            } else {
              break L202;
            }
          }
          L203: {
            var2 = kb.a(-117, "instructions_controls,2");
            if (var2 == null) {
              break L203;
            } else {
              vk.field_b[2] = qj.a(var2, 2);
              break L203;
            }
          }
          L204: {
            var2 = kb.a(-108, "instructions_controls,3");
            if (var2 == null) {
              break L204;
            } else {
              vk.field_b[3] = qj.a(var2, 2);
              break L204;
            }
          }
          L205: {
            var2 = kb.a(-61, "instructions_controls,4");
            if (var2 == null) {
              break L205;
            } else {
              vk.field_b[4] = qj.a(var2, 2);
              break L205;
            }
          }
          L206: {
            var2 = kb.a(-61, "instructions_controls,5");
            if (null != var2) {
              vk.field_b[5] = qj.a(var2, 2);
              break L206;
            } else {
              break L206;
            }
          }
          L207: {
            var2 = kb.a(-31, "instructions_controls,6");
            if (var2 != null) {
              vk.field_b[6] = qj.a(var2, 2);
              break L207;
            } else {
              break L207;
            }
          }
          L208: {
            var2 = kb.a(-53, "didyouknow_title");
            if (null != var2) {
              o.field_c = qj.a(var2, 2);
              break L208;
            } else {
              break L208;
            }
          }
          L209: {
            var2 = kb.a(-87, "didyouknow,0");
            if (null != var2) {
              jg.field_k[0] = qj.a(var2, 2);
              break L209;
            } else {
              break L209;
            }
          }
          L210: {
            var2 = kb.a(-89, "didyouknow,1");
            if (var2 == null) {
              break L210;
            } else {
              jg.field_k[1] = qj.a(var2, 2);
              break L210;
            }
          }
          L211: {
            var2 = kb.a(-112, "didyouknow,2");
            if (null == var2) {
              break L211;
            } else {
              jg.field_k[2] = qj.a(var2, 2);
              break L211;
            }
          }
          L212: {
            var2 = kb.a(-72, "didyouknow,3");
            if (null == var2) {
              break L212;
            } else {
              jg.field_k[3] = qj.a(var2, 2);
              break L212;
            }
          }
          L213: {
            var2 = kb.a(-127, "didyouknow,4");
            if (null == var2) {
              break L213;
            } else {
              jg.field_k[4] = qj.a(var2, 2);
              break L213;
            }
          }
          L214: {
            var2 = kb.a(-32, "didyouknow,5");
            if (var2 != null) {
              jg.field_k[5] = qj.a(var2, 2);
              break L214;
            } else {
              break L214;
            }
          }
          L215: {
            var2 = kb.a(-116, "didyouknow,6");
            if (null == var2) {
              break L215;
            } else {
              jg.field_k[6] = qj.a(var2, 2);
              break L215;
            }
          }
          L216: {
            var2 = kb.a(-97, "didyouknow,7");
            if (null == var2) {
              break L216;
            } else {
              jg.field_k[7] = qj.a(var2, 2);
              break L216;
            }
          }
          L217: {
            var2 = kb.a(-117, "didyouknow,8");
            if (var2 != null) {
              jg.field_k[8] = qj.a(var2, 2);
              break L217;
            } else {
              break L217;
            }
          }
          L218: {
            var2 = kb.a(-112, "didyouknow,9");
            if (null != var2) {
              jg.field_k[9] = qj.a(var2, 2);
              break L218;
            } else {
              break L218;
            }
          }
          L219: {
            var2 = kb.a(-99, "didyouknow,10");
            if (null != var2) {
              jg.field_k[10] = qj.a(var2, 2);
              break L219;
            } else {
              break L219;
            }
          }
          L220: {
            var2 = kb.a(-57, "didyouknow,11");
            if (var2 == null) {
              break L220;
            } else {
              jg.field_k[11] = qj.a(var2, 2);
              break L220;
            }
          }
          L221: {
            var2 = kb.a(-104, "tutorial,0");
            if (var2 != null) {
              rk.field_O[0] = qj.a(var2, 2);
              break L221;
            } else {
              break L221;
            }
          }
          L222: {
            var2 = kb.a(-90, "tutorial,1");
            if (null != var2) {
              rk.field_O[1] = qj.a(var2, 2);
              break L222;
            } else {
              break L222;
            }
          }
          L223: {
            var2 = kb.a(-77, "tutorial,2");
            if (null != var2) {
              rk.field_O[2] = qj.a(var2, 2);
              break L223;
            } else {
              break L223;
            }
          }
          L224: {
            var2 = kb.a(-76, "tutorial,3");
            if (var2 == null) {
              break L224;
            } else {
              rk.field_O[3] = qj.a(var2, 2);
              break L224;
            }
          }
          L225: {
            var2 = kb.a(-97, "to_activate_specials");
            if (null == var2) {
              break L225;
            } else {
              qe.field_j = qj.a(var2, 2);
              break L225;
            }
          }
          L226: {
            var2 = kb.a(-49, "premultiplayer_tutorial,0");
            if (null == var2) {
              break L226;
            } else {
              sg.field_h[0] = qj.a(var2, 2);
              break L226;
            }
          }
          L227: {
            var2 = kb.a(-42, "premultiplayer_tutorial,1");
            if (var2 == null) {
              break L227;
            } else {
              sg.field_h[1] = qj.a(var2, 2);
              break L227;
            }
          }
          L228: {
            var2 = kb.a(-36, "masterchallengeintro,0");
            if (null != var2) {
              uj.field_f[0] = qj.a(var2, 2);
              break L228;
            } else {
              break L228;
            }
          }
          L229: {
            var2 = kb.a(-52, "masterchallengeintro,1");
            if (var2 != null) {
              uj.field_f[1] = qj.a(var2, 2);
              break L229;
            } else {
              break L229;
            }
          }
          L230: {
            var2 = kb.a(-78, "showtutorialagain");
            if (var2 == null) {
              break L230;
            } else {
              vb.field_T = qj.a(var2, 2);
              break L230;
            }
          }
          L231: {
            var2 = kb.a(-83, "challengestrategy,0");
            if (null == var2) {
              break L231;
            } else {
              jj.field_d[0] = qj.a(var2, 2);
              break L231;
            }
          }
          L232: {
            var2 = kb.a(-39, "challengestrategy,1");
            if (null == var2) {
              break L232;
            } else {
              jj.field_d[1] = qj.a(var2, 2);
              break L232;
            }
          }
          L233: {
            var2 = kb.a(-73, "challengestrategy,2");
            if (null != var2) {
              jj.field_d[2] = qj.a(var2, 2);
              break L233;
            } else {
              break L233;
            }
          }
          L234: {
            var2 = kb.a(-75, "challengestrategy,3");
            if (var2 != null) {
              jj.field_d[3] = qj.a(var2, 2);
              break L234;
            } else {
              break L234;
            }
          }
          L235: {
            var2 = kb.a(-54, "challengestrategy,4");
            if (null != var2) {
              jj.field_d[4] = qj.a(var2, 2);
              break L235;
            } else {
              break L235;
            }
          }
          L236: {
            var2 = kb.a(-96, "challengestrategy,5");
            if (var2 != null) {
              jj.field_d[5] = qj.a(var2, 2);
              break L236;
            } else {
              break L236;
            }
          }
          L237: {
            var2 = kb.a(-67, "challengestrategy,6");
            if (null == var2) {
              break L237;
            } else {
              jj.field_d[6] = qj.a(var2, 2);
              break L237;
            }
          }
          L238: {
            var2 = kb.a(-60, "challengestrategy,7");
            if (null != var2) {
              jj.field_d[7] = qj.a(var2, 2);
              break L238;
            } else {
              break L238;
            }
          }
          L239: {
            var2 = kb.a(-16, "x_at_once");
            if (null == var2) {
              break L239;
            } else {
              on.field_h = qj.a(var2, 2);
              break L239;
            }
          }
          L240: {
            var2 = kb.a(-59, "x_chain");
            if (var2 != null) {
              e.field_d = qj.a(var2, 2);
              break L240;
            } else {
              break L240;
            }
          }
          L241: {
            var2 = kb.a(-35, "x_shapes");
            if (null == var2) {
              break L241;
            } else {
              uj.field_b = qj.a(var2, 2);
              break L241;
            }
          }
          L242: {
            var2 = kb.a(-95, "start");
            if (null != var2) {
              sk.field_i = qj.a(var2, 2);
              break L242;
            } else {
              break L242;
            }
          }
          L243: {
            var2 = kb.a(-72, "challenge");
            if (null == var2) {
              break L243;
            } else {
              ka.field_M = qj.a(var2, 2);
              break L243;
            }
          }
          L244: {
            var2 = kb.a(-89, "new_theme_unlocked");
            if (null != var2) {
              tb.field_a = qj.a(var2, 2);
              break L244;
            } else {
              break L244;
            }
          }
          L245: {
            var2 = kb.a(-110, "speedup");
            if (var2 != null) {
              eb.field_c = qj.a(var2, 2);
              break L245;
            } else {
              break L245;
            }
          }
          L246: {
            var2 = kb.a(-61, "panic");
            if (var2 != null) {
              bn.field_c = qj.a(var2, 2);
              break L246;
            } else {
              break L246;
            }
          }
          L247: {
            var2 = kb.a(-90, "fight");
            if (null != var2) {
              cf.field_e = qj.a(var2, 2);
              break L247;
            } else {
              break L247;
            }
          }
          L248: {
            var2 = kb.a(-93, "finish_name");
            if (var2 != null) {
              pc.field_a = qj.a(var2, 2);
              break L248;
            } else {
              break L248;
            }
          }
          L249: {
            var2 = kb.a(-60, "you_win");
            if (var2 != null) {
              cn.field_T = qj.a(var2, 2);
              break L249;
            } else {
              break L249;
            }
          }
          L250: {
            var2 = kb.a(-36, "name_wins");
            if (null == var2) {
              break L250;
            } else {
              fh.field_b = qj.a(var2, 2);
              break L250;
            }
          }
          L251: {
            var2 = kb.a(-107, "draw");
            if (null == var2) {
              break L251;
            } else {
              ri.field_k = qj.a(var2, 2);
              break L251;
            }
          }
          L252: {
            var2 = kb.a(-100, "well_done");
            if (null != var2) {
              ua.field_D = qj.a(var2, 2);
              break L252;
            } else {
              break L252;
            }
          }
          L253: {
            var2 = kb.a(-101, "oh_no");
            if (var2 != null) {
              cb.field_i = qj.a(var2, 2);
              break L253;
            } else {
              break L253;
            }
          }
          L254: {
            var2 = kb.a(-61, "thefinal");
            if (var2 != null) {
              ji.field_h = qj.a(var2, 2);
              break L254;
            } else {
              break L254;
            }
          }
          L255: {
            var2 = kb.a(-70, "name_is_out");
            if (null != var2) {
              a.field_e = qj.a(var2, 2);
              break L255;
            } else {
              break L255;
            }
          }
          L256: {
            var2 = kb.a(-40, "main_menu_ticker,0");
            if (null != var2) {
              pb.field_f[0] = qj.a(var2, 2);
              break L256;
            } else {
              break L256;
            }
          }
          L257: {
            var2 = kb.a(-59, "main_menu_ticker,1");
            if (null == var2) {
              break L257;
            } else {
              pb.field_f[1] = qj.a(var2, 2);
              break L257;
            }
          }
          L258: {
            var2 = kb.a(-34, "main_menu_ticker,2");
            if (null != var2) {
              pb.field_f[2] = qj.a(var2, 2);
              break L258;
            } else {
              break L258;
            }
          }
          L259: {
            var2 = kb.a(-87, "main_menu_ticker,3");
            if (null == var2) {
              break L259;
            } else {
              pb.field_f[3] = qj.a(var2, 2);
              break L259;
            }
          }
          L260: {
            var2 = kb.a(-101, "devquote");
            if (var2 != null) {
              ph.field_Cb = qj.a(var2, 2);
              break L260;
            } else {
              break L260;
            }
          }
          pc.field_b = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Drawn";
        field_e = "Colours in play:";
        field_b = "<%0> has dropped out.";
        field_c = "Retry";
    }
}
