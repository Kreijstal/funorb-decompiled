/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class of {
    int field_f;
    static String field_b;
    private int field_d;
    static int field_g;
    private int field_l;
    private int field_a;
    int field_h;
    static int field_k;
    private int field_j;
    private int field_c;
    static ci field_i;
    boolean field_e;

    final void b(byte param0) {
        ((of) this).field_a = 0;
        if (param0 > -2) {
            return;
        }
        ((of) this).field_l = 0;
        ((of) this).field_j = 0;
        if (!(0 != ((of) this).field_c)) {
            ((of) this).field_j = vg.field_a;
        }
    }

    final boolean c(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 84) {
            break L0;
          } else {
            ((of) this).a(61, -108, 32);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((of) this).field_l == 1) {
              break L2;
            } else {
              if (((of) this).field_j == 97) {
                break L2;
              } else {
                if (((of) this).field_j == 84) {
                  break L2;
                } else {
                  if (((of) this).field_j != 83) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        if (~param2 > ~((of) this).field_f) {
          if (((of) this).field_f <= param0) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              if (param1 == 99) {
                break L0;
              } else {
                boolean discarded$1 = ((of) this).b(false);
                break L0;
              }
            }
            L1: {
              ((of) this).field_l = 0;
              ((of) this).field_a = 0;
              ((of) this).field_j = 0;
              if (th.field_d == 0) {
                break L1;
              } else {
                ((of) this).field_e = true;
                ((of) this).field_d = ji.field_R;
                ((of) this).field_l = th.field_d;
                ((of) this).field_a = th.field_d;
                ((of) this).field_h = param0;
                ((of) this).field_c = th.field_d;
                break L1;
              }
            }
            L2: {
              if (((of) this).field_c == 0) {
                break L2;
              } else {
                if (0 != wh.field_f) {
                  L3: {
                    if (((of) this).field_d > 0) {
                      break L3;
                    } else {
                      ((of) this).field_d = jh.field_f;
                      ((of) this).field_l = ((of) this).field_c;
                      break L3;
                    }
                  }
                  ((of) this).field_d = ((of) this).field_d - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if (th.field_d != 0) {
                break L4;
              } else {
                if (0 != wh.field_f) {
                  break L4;
                } else {
                  ((of) this).field_c = 0;
                  break L4;
                }
              }
            }
            L5: {
              if (((of) this).field_c != 0) {
                break L5;
              } else {
                L6: {
                  if (((of) this).field_e) {
                    break L6;
                  } else {
                    if (lf.field_O) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                if (param2 < 0) {
                  if (((of) this).field_e) {
                    ((of) this).field_h = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  L7: {
                    if (~param2 == ~((of) this).field_h) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((of) this).field_h = param2;
                  ((of) this).field_e = true;
                  break L5;
                }
              }
            }
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.a(-1, param4, param2, param1, rf.field_b, hn.field_k, param3);
        int var7 = this.a(param0 + -62, param4, param2, param1, ag.field_f, re.field_m, param3);
        if (param0 != 61) {
            ((of) this).a(-57, 37, false, 100);
        }
        ((of) this).a(var7, 99, var6);
    }

    final boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (((of) this).field_l == 2) {
                break L1;
              } else {
                if (((of) this).field_j != 96) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 97) {
            ((of) this).field_e = false;
        }
        return ((of) this).field_j == 97 ? true : false;
    }

    final static String a(String param0, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        nk var5 = null;
        int var6 = 0;
        ve var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var8 = (CharSequence) (Object) param2;
            if (ed.a(var8, 21257)) {
              if (2 != ld.field_g) {
                stackOut_5_0 = vf.field_e;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var7 = hh.a(param3 + -15023, param0);
                if (var7 == null) {
                  stackOut_9_0 = oc.a(tl.field_Ib, new String[1], (byte) -90);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var7.c(-2193);
                  var7.d(param3);
                  wc.field_v = wc.field_v - 1;
                  var5 = qn.field_U;
                  var5.f(param1, -123);
                  var5.field_l = var5.field_l + 1;
                  var6 = var5.field_l;
                  var5.c(3, (byte) -112);
                  var5.a(-120, param2);
                  var5.a(var5.field_l + -var6, -1);
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = qj.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("of.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 41);
        }
        return (String) (Object) stackIn_12_0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -1) {
            boolean discarded$0 = ((of) this).c(-39);
        }
        if (param3 <= param5) {
            if (param5 < param2) {
                if (param4 >= param1) {
                    if (!(param6 * ((of) this).field_f + param1 <= param4)) {
                        return (-param1 + param4) / param6;
                    }
                }
            }
        }
        return -1;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        ((of) this).field_c = param3;
        ((of) this).field_e = param2 ? true : false;
        if (!((of) this).field_e) {
            ((of) this).field_h = param0;
        } else {
            ((of) this).field_h = param1;
        }
    }

    final void c(byte param0) {
        int var2 = -119 % ((param0 - 78) / 32);
        ((of) this).field_l = 0;
        ((of) this).field_j = 0;
        ((of) this).field_a = 0;
        if (((of) this).field_c == 0) {
            if (vg.field_a == 98) {
                if (((of) this).field_h <= 0) {
                    ((of) this).field_h = ((of) this).field_f;
                }
                ((of) this).field_e = false;
                ((of) this).field_h = ((of) this).field_h - 1;
            }
        }
        if (!(((of) this).field_c != 0)) {
            ((of) this).field_j = vg.field_a;
        }
        if (((of) this).field_c == 0) {
            if (!(99 != vg.field_a)) {
                ((of) this).field_h = ((of) this).field_h + 1;
                if (!(((of) this).field_h < ((of) this).field_f)) {
                    ((of) this).field_h = 0;
                }
                ((of) this).field_e = false;
            }
        }
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Chess.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (ih.field_U) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            if (param1 > 61) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var8 = null;
                            String discarded$2 = of.a((String) null, 68, (String) null, 35);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) u.a(true, "getcookies", param0);
                            var4 = gl.a((byte) -118, ';', var3);
                            var5 = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var5++;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var2_ref = caughtException;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_20_0 = (RuntimeException) var2_ref2;
                        stackOut_20_1 = new StringBuilder().append("of.S(");
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param0 == null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw fk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        if (param0 != 94) {
            return false;
        }
        return ((of) this).field_j == 102 ? true : false;
    }

    final static void d(int param0) {
        uk.field_e = false;
        ei.field_u = 0;
        eg.field_j = null;
        vn.field_Db = -1;
        fm.field_S = -1;
    }

    final boolean b(boolean param0) {
        if (param0) {
            return true;
        }
        return ((of) this).field_c != 0 ? true : false;
    }

    final boolean d(byte param0) {
        Object var3 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 > 31) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = of.a((java.applet.Applet) null, (byte) -89);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != ((of) this).field_a) {
              break L2;
            } else {
              if (((of) this).field_j == 84) {
                break L2;
              } else {
                if (83 != ((of) this).field_j) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public static void c(boolean param0) {
        field_b = null;
        field_i = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        cf.a(83, true, param0);
    }

    final boolean a(int param0) {
        if (param0 != -97) {
            ((of) this).field_e = false;
        }
        return ((of) this).field_j == 96 ? true : false;
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_17_0 = null;
        String stackOut_24_0 = null;
        String stackOut_31_0 = null;
        String stackOut_35_0 = null;
        String stackOut_39_0 = null;
        String stackOut_27_0 = null;
        String stackOut_20_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            if (1 == param0) {
              stackOut_2_0 = oc.a(ch.field_eb, new String[1], (byte) -93);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 != 2) {
                if (param0 != 3) {
                  L1: {
                    if (param1 == -26564) {
                      break L1;
                    } else {
                      var4 = null;
                      boolean discarded$1 = of.a((java.applet.Applet) null, (byte) 31);
                      break L1;
                    }
                  }
                  if (param0 != 4) {
                    if (5 == param0) {
                      stackOut_17_0 = oc.a(dl.field_h, new String[1], (byte) -56);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (param0 != 6) {
                        if (7 == param0) {
                          stackOut_24_0 = oc.a(ih.field_V, new String[1], (byte) -64);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (param0 != 8) {
                            if (11 == param0) {
                              stackOut_31_0 = oc.a(sk.field_o, new String[1], (byte) -64);
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            } else {
                              if (param0 == 12) {
                                stackOut_35_0 = oc.a(he.field_Lb, new String[1], (byte) -85);
                                stackIn_36_0 = stackOut_35_0;
                                return stackIn_36_0;
                              } else {
                                if (param0 == 13) {
                                  stackOut_39_0 = oc.a(gf.field_c, new String[1], (byte) -121);
                                  stackIn_40_0 = stackOut_39_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackOut_27_0 = oc.a(n.field_a, new String[1], (byte) -47);
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0;
                          }
                        }
                      } else {
                        stackOut_20_0 = oc.a(wc.field_y, new String[1], (byte) -93);
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                    }
                  } else {
                    stackOut_13_0 = oc.a(bl.field_b, new String[1], (byte) -79);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  stackOut_8_0 = oc.a(ng.field_a, new String[1], (byte) -121);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = oc.a(ii.field_S, new String[1], (byte) -83);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("of.M(").append(param0).append(44).append(param1).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L2;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 41);
        }
        return stackIn_40_0;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return 103 == ((of) this).field_j ? true : false;
    }

    of(int param0) {
        ((of) this).field_h = 0;
        ((of) this).field_e = false;
        ((of) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You need a rating of <%1> to play with the current options.";
    }
}
