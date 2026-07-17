/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.AWTEvent;

final class fm {
    private kj field_g;
    private Object[] field_c;
    static pl field_b;
    static char[] field_d;
    static ak[] field_f;
    static String field_j;
    boolean field_i;
    private jp field_a;
    int field_e;
    private Object[][] field_k;
    static ak[] field_h;

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((fm) this).b(-3)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((fm) this).field_g.field_g.a(le.a(var4, (byte) 103), (byte) -67);
              if (param0 >= 114) {
                if (this.a(var3_int, -1)) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = -1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = 73;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("fm.E(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final int c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 100) {
                break L1;
              } else {
                ((fm) this).field_g = (kj) ((fm) this).field_c[7];
                break L1;
              }
            }
            if (!((fm) this).b(-3)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((fm) this).field_g.field_g.a(le.a(var4, (byte) 104), (byte) -67);
              stackOut_6_0 = ((fm) this).a(var3_int, (byte) -78);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fm.D(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    private final synchronized boolean a(int param0, int param1) {
        if (((fm) this).b(param1 + -2)) {
          L0: {
            if (param0 > param1) {
              break L0;
            } else {
              if (param0 >= ((fm) this).field_g.field_i.length) {
                break L0;
              } else {
                if (-1 == ((fm) this).field_g.field_i[param0]) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
          }
          if (nm.field_d) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int b(int param0, byte param1) {
        if (param1 < 22) {
            byte[] discarded$0 = this.a(((int[]) ((fm) this).field_c[1])[10], (int[]) null, 79, ((int[]) ((fm) this).field_c[0])[1]);
        }
        if (!(this.a(param0, -1))) {
            return 0;
        }
        return ((fm) this).field_g.field_i[param0];
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((fm) this).b(-3)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((fm) this).field_g.field_g.a(le.a(var4, (byte) -111), (byte) -67);
              if (param0 > 124) {
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("fm.O(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static void a(cb param0, Object param1, byte param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_7_0 = null;
        java.awt.AWTEvent stackIn_7_1 = null;
        Object stackIn_11_0 = null;
        java.awt.AWTEvent stackIn_11_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Object stackOut_6_0 = null;
        java.awt.AWTEvent stackOut_6_1 = null;
        Object stackOut_10_0 = null;
        Object stackOut_10_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.field_w == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var3_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (50 <= var3_int) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = null;
                        stackOut_6_1 = param0.field_w.peekEvent();
                        stackIn_11_0 = stackOut_6_0;
                        stackIn_11_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == (Object) (Object) stackIn_7_1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        vg.a(1L, (byte) 23);
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = null;
                        stackOut_10_1 = param1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = (java.awt.AWTEvent) (Object) stackOut_10_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 16 : 18);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == (Object) (Object) stackIn_11_1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof Exception ? 16 : 18);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param0.field_w.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof Exception ? 16 : 18);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param2 == -52) {
                            statePc = 25;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof Exception ? 16 : 18);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        boolean discarded$1 = fm.a((byte) 28, (CharSequence) null);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof Exception ? 16 : 18);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    stackOut_18_0 = (RuntimeException) var3_ref;
                    stackOut_18_1 = new StringBuilder().append("fm.A(");
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (param0 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "{...}";
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                    stackOut_20_2 = "null";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    if (param1 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                    stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                    stackOut_22_2 = "{...}";
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    statePc = 24;
                    continue stateLoop;
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
                    throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 41);
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((fm) this).b(-3)) {
              L1: {
                if (param0 == 0) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param1;
              var4_int = ((fm) this).field_g.field_g.a(le.a(var6, (byte) -125), (byte) -67);
              if (!this.a(var4_int, -1)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param2;
                var5 = ((fm) this).field_g.field_q[var4_int].a(le.a(var7, (byte) 77), (byte) -67);
                stackOut_9_0 = ((fm) this).a(var4_int, var5, -2);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("fm.AA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    final byte[] a(int param0, int param1, boolean param2) {
        if (!param2) {
            fm.a((cb) null, ((fm) this).field_c[0], ((byte[]) ((Object[]) ((fm) this).field_c[0])[1])[2]);
        }
        return this.a(-1, (int[]) null, param1, param0);
    }

    final synchronized boolean b(int param0) {
        L0: {
          if (null == ((fm) this).field_g) {
            ((fm) this).field_g = ((fm) this).field_a.a((byte) 36);
            if (((fm) this).field_g != null) {
              ((fm) this).field_c = new Object[((fm) this).field_g.field_b];
              ((fm) this).field_k = new Object[((fm) this).field_g.field_b][];
              break L0;
            } else {
              return false;
            }
          } else {
            break L0;
          }
        }
        if (param0 != -3) {
          boolean discarded$2 = ((fm) this).a(-35, ((int[]) ((fm) this).field_c[0])[8], 66);
          return true;
        } else {
          return true;
        }
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (param0 == 92) {
            break L0;
          } else {
            int discarded$1 = ((fm) this).a(-33, (String) null);
            break L0;
          }
        }
        if (!((fm) this).b(-3)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var3 >= ((fm) this).field_g.field_f.length) {
                  break L3;
                } else {
                  stackOut_5_0 = ((fm) this).field_g.field_f[var3];
                  stackIn_12_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      var4 = stackIn_6_0;
                      if (null == ((fm) this).field_c[var4]) {
                        this.b(var4, false);
                        if (((fm) this).field_c[var4] != null) {
                          break L4;
                        } else {
                          var2 = 0;
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_11_0 = var2;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
            return stackIn_12_0 != 0;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        we var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        we var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_22_0 = 0;
        int[] stackIn_26_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_127_0 = 0;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_11_0 = null;
        int[] stackOut_25_0 = null;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_53_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var22 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (this.a(param1, -1)) {
              if (null != ((fm) this).field_c[param1]) {
                L1: {
                  var5_int = ((fm) this).field_g.field_h[param1];
                  var6 = ((fm) this).field_g.field_r[param1];
                  if (null != ((fm) this).field_k[param1]) {
                    break L1;
                  } else {
                    ((fm) this).field_k[param1] = new Object[((fm) this).field_g.field_i[param1]];
                    break L1;
                  }
                }
                var7 = ((fm) this).field_k[param1];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            if (var5_int <= var9_int) {
                              break L7;
                            } else {
                              stackOut_11_0 = (int[]) var6;
                              stackIn_26_0 = stackOut_11_0;
                              stackIn_12_0 = stackOut_11_0;
                              if (var22 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_12_0 == null) {
                                      break L9;
                                    } else {
                                      var10_int = var6[var9_int];
                                      if (var22 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var10_int = var9_int;
                                  break L8;
                                }
                                L10: {
                                  if (null == var7[var10_int]) {
                                    var8 = 0;
                                    if (var22 == 0) {
                                      break L7;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var9_int++;
                                continue L2;
                              }
                            }
                          }
                          if (var8 == 0) {
                            if (param2 == null) {
                              break L4;
                            } else {
                              if (0 != param2[0]) {
                                break L5;
                              } else {
                                stackOut_25_0 = (int[]) param2;
                                stackIn_26_0 = stackOut_25_0;
                                break L6;
                              }
                            }
                          } else {
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0 != 0;
                          }
                        }
                        if (stackIn_26_0[1] != 0) {
                          break L5;
                        } else {
                          if (param2[2] != 0) {
                            break L5;
                          } else {
                            if (param2[3] == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var9_array = tg.a(false, true, ((fm) this).field_c[param1]);
                      var10 = new we(var9_array);
                      var10.a(param2, 19324, 5, var10.field_k.length);
                      break L3;
                    }
                    var9_array = tg.a(false, false, ((fm) this).field_c[param1]);
                    break L3;
                  }
                  try {
                    L11: {
                      var23 = la.a(var9_array, 0);
                      var10_array = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_34_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_34_1 = new StringBuilder();
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      if (param2 == null) {
                        stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                        stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                        stackOut_36_2 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        break L12;
                      } else {
                        stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                        stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                        stackOut_35_2 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        break L12;
                      }
                    }
                    throw aa.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + " " + param1 + " " + param2.length + " " + wg.a(var9_array, 126, param2.length) + " " + wg.a(var9_array, 125, param2.length + -2) + " " + ((fm) this).field_g.field_k[param1] + " " + ((fm) this).field_g.field_o);
                  }
                  L13: {
                    if (((fm) this).field_i) {
                      ((fm) this).field_c[param1] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (1 >= var5_int) {
                          break L16;
                        } else {
                          L17: {
                            if (((fm) this).field_e == 2) {
                              break L17;
                            } else {
                              var11 = var23.length;
                              var11--;
                              var12 = var23[var11] & 255;
                              var11 = var11 - var12 * var5_int * 4;
                              var13 = new we(var10_array);
                              var14_ref_int__ = new int[var5_int];
                              var13.field_m = var11;
                              var15 = 0;
                              L18: while (true) {
                                L19: {
                                  if (var15 >= var12) {
                                    stackOut_53_0 = var5_int;
                                    stackIn_54_0 = stackOut_53_0;
                                    break L19;
                                  } else {
                                    var16_int = 0;
                                    stackOut_45_0 = 0;
                                    stackIn_54_0 = stackOut_45_0;
                                    stackIn_46_0 = stackOut_45_0;
                                    if (var22 != 0) {
                                      break L19;
                                    } else {
                                      var17 = stackIn_46_0;
                                      L20: while (true) {
                                        L21: {
                                          if (var17 >= var5_int) {
                                            var15++;
                                            break L21;
                                          } else {
                                            var16_int = var16_int + var13.k(0);
                                            var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                            var17++;
                                            if (var22 != 0) {
                                              break L21;
                                            } else {
                                              continue L20;
                                            }
                                          }
                                        }
                                        continue L18;
                                      }
                                    }
                                  }
                                }
                                var15_ref_byte____ = new byte[stackIn_54_0][];
                                var16_int = 0;
                                L22: while (true) {
                                  L23: {
                                    if (var16_int >= var5_int) {
                                      var13.field_m = var11;
                                      var16_int = 0;
                                      break L23;
                                    } else {
                                      var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                      var14_ref_int__[var16_int] = 0;
                                      var16_int++;
                                      if (var22 != 0) {
                                        break L23;
                                      } else {
                                        continue L22;
                                      }
                                    }
                                  }
                                  var17 = 0;
                                  L24: while (true) {
                                    L25: {
                                      if (var12 <= var17) {
                                        stackOut_70_0 = 0;
                                        stackIn_71_0 = stackOut_70_0;
                                        break L25;
                                      } else {
                                        var18 = 0;
                                        stackOut_62_0 = 0;
                                        stackIn_71_0 = stackOut_62_0;
                                        stackIn_63_0 = stackOut_62_0;
                                        if (var22 != 0) {
                                          break L25;
                                        } else {
                                          var19 = stackIn_63_0;
                                          L26: while (true) {
                                            L27: {
                                              if (var5_int <= var19) {
                                                var17++;
                                                break L27;
                                              } else {
                                                var18 = var18 + var13.k(0);
                                                qb.a(var23, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                var16_int = var16_int + var18;
                                                var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L27;
                                                } else {
                                                  continue L26;
                                                }
                                              }
                                            }
                                            continue L24;
                                          }
                                        }
                                      }
                                    }
                                    var17 = stackIn_71_0;
                                    L28: while (true) {
                                      if (var5_int <= var17) {
                                        if (var22 == 0) {
                                          break L15;
                                        } else {
                                          break L17;
                                        }
                                      } else {
                                        if (var22 != 0) {
                                          break L15;
                                        } else {
                                          L29: {
                                            L30: {
                                              if (var6 == null) {
                                                break L30;
                                              } else {
                                                var18 = var6[var17];
                                                if (var22 == 0) {
                                                  break L29;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                            var18 = var17;
                                            break L29;
                                          }
                                          L31: {
                                            L32: {
                                              if (((fm) this).field_e != 0) {
                                                break L32;
                                              } else {
                                                var7[var18] = aj.a(false, var15_ref_byte____[var17], -123);
                                                if (var22 == 0) {
                                                  break L31;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                            break L31;
                                          }
                                          var17++;
                                          continue L28;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var5_int * var12 * 4;
                          var13 = new we(var10_array);
                          var14 = 0;
                          var15 = 0;
                          var13.field_m = var11;
                          var16_int = 0;
                          L33: while (true) {
                            L34: {
                              if (var12 <= var16_int) {
                                stackOut_98_0 = var14;
                                stackIn_99_0 = stackOut_98_0;
                                break L34;
                              } else {
                                var17 = 0;
                                stackOut_85_0 = 0;
                                stackIn_99_0 = stackOut_85_0;
                                stackIn_86_0 = stackOut_85_0;
                                if (var22 != 0) {
                                  break L34;
                                } else {
                                  var18 = stackIn_86_0;
                                  L35: while (true) {
                                    L36: {
                                      if (var18 >= var5_int) {
                                        var16_int++;
                                        break L36;
                                      } else {
                                        var17 = var17 + var13.k(0);
                                        if (var22 != 0) {
                                          break L36;
                                        } else {
                                          L37: {
                                            L38: {
                                              if (var6 == null) {
                                                break L38;
                                              } else {
                                                var19 = var6[var18];
                                                if (var22 == 0) {
                                                  break L37;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            var19 = var18;
                                            break L37;
                                          }
                                          L39: {
                                            if (param0 == var19) {
                                              var14 = var14 + var17;
                                              var15 = var19;
                                              break L39;
                                            } else {
                                              break L39;
                                            }
                                          }
                                          var18++;
                                          continue L35;
                                        }
                                      }
                                    }
                                    continue L33;
                                  }
                                }
                              }
                            }
                            if (stackIn_99_0 == 0) {
                              stackOut_101_0 = 1;
                              stackIn_102_0 = stackOut_101_0;
                              return stackIn_102_0 != 0;
                            } else {
                              var16 = new byte[var14];
                              var14 = 0;
                              var13.field_m = var11;
                              var17 = 0;
                              var18 = 0;
                              L40: while (true) {
                                if (var18 >= var12) {
                                  var7[var15] = (Object) (Object) var16;
                                  if (var22 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  var19 = 0;
                                  stackOut_105_0 = 0;
                                  stackIn_127_0 = stackOut_105_0;
                                  stackIn_106_0 = stackOut_105_0;
                                  if (var22 != 0) {
                                    break L14;
                                  } else {
                                    var20 = stackIn_106_0;
                                    L41: while (true) {
                                      L42: {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          break L42;
                                        } else {
                                          var19 = var19 + var13.k(0);
                                          if (var22 != 0) {
                                            break L42;
                                          } else {
                                            L43: {
                                              L44: {
                                                if (var6 == null) {
                                                  break L44;
                                                } else {
                                                  var21 = var6[var20];
                                                  if (var22 == 0) {
                                                    break L43;
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                              var21 = var20;
                                              break L43;
                                            }
                                            L45: {
                                              if (var21 == param0) {
                                                qb.a(var10_array, var17, var16, var14, var19);
                                                var14 = var14 + var19;
                                                break L45;
                                              } else {
                                                break L45;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            continue L41;
                                          }
                                        }
                                      }
                                      continue L40;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L46: {
                        L47: {
                          if (var6 == null) {
                            break L47;
                          } else {
                            var11 = var6[0];
                            if (var22 == 0) {
                              break L46;
                            } else {
                              break L47;
                            }
                          }
                        }
                        var11 = 0;
                        break L46;
                      }
                      L48: {
                        if (((fm) this).field_e == 0) {
                          break L48;
                        } else {
                          var7[var11] = (Object) (Object) var23;
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L48;
                          }
                        }
                      }
                      var7[var11] = aj.a(false, var23, 124);
                      return true;
                    }
                    stackOut_126_0 = 1;
                    stackIn_127_0 = stackOut_126_0;
                    break L14;
                  }
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L49: {
            var5 = decompiledCaughtException;
            stackOut_128_0 = (RuntimeException) var5;
            stackOut_128_1 = new StringBuilder().append("fm.C(").append(param0).append(44).append(param1).append(44);
            stackIn_130_0 = stackOut_128_0;
            stackIn_130_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param2 == null) {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L49;
            } else {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "{...}";
              stackIn_131_0 = stackOut_129_0;
              stackIn_131_1 = stackOut_129_1;
              stackIn_131_2 = stackOut_129_2;
              break L49;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_131_0, stackIn_131_2 + 44 + 0 + 41);
        }
        return stackIn_127_0 != 0;
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                boolean discarded$1 = ((fm) this).a((byte) 110);
                break L1;
              }
            }
            if (this.b(param2, 0, param3)) {
              L2: {
                L3: {
                  var5 = null;
                  if (null == ((fm) this).field_k[param3]) {
                    break L3;
                  } else {
                    if (((fm) this).field_k[param3][param2] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param2, param3, param1, 0)) {
                  break L2;
                } else {
                  this.b(param3, false);
                  if (this.a(param2, param3, param1, 0)) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              if (null == ((fm) this).field_k[param3]) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (((fm) this).field_k[param3][param2] == null) {
                    break L4;
                  } else {
                    var7 = tg.a(false, false, ((fm) this).field_k[param3][param2]);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    L6: {
                      if (((fm) this).field_e == 1) {
                        break L6;
                      } else {
                        if (((fm) this).field_e == 2) {
                          ((fm) this).field_k[param3] = null;
                          if (!Pixelate.field_H) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((fm) this).field_k[param3][param2] = null;
                    if (((fm) this).field_g.field_i[param3] != 1) {
                      break L5;
                    } else {
                      ((fm) this).field_k[param3] = null;
                      break L5;
                    }
                  }
                }
                stackOut_25_0 = var5;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_27_0 = var5;
            stackOut_27_1 = new StringBuilder().append("fm.K(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_26_0;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 63) {
                break L1;
              } else {
                fm.a((cb) null, (Object) null, (byte) 25);
                break L1;
              }
            }
            stackOut_2_0 = f.a(param1, (byte) -70, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("fm.L(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final synchronized int a(int param0, byte param1) {
        if (!(this.a(param0, -1))) {
            return 0;
        }
        if (param1 != -78) {
            fm.a(-74);
        }
        if (!(null == ((fm) this).field_c[param0])) {
            return 100;
        }
        return ((fm) this).field_a.b(param0, param1 ^ -8270);
    }

    final synchronized byte[] b(int param0, int param1) {
        int var3 = 0;
        if (((fm) this).b(-3)) {
          if (((fm) this).field_g.field_i.length != 1) {
            if (this.a(param0, -1)) {
              if (((fm) this).field_g.field_i[param0] == 1) {
                return ((fm) this).a(param0, 0, true);
              } else {
                var3 = 10 / ((param1 - -24) / 54);
                throw new RuntimeException();
              }
            } else {
              return null;
            }
          } else {
            return ((fm) this).a(0, param0, true);
          }
        } else {
          return null;
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param1, param2 ^ param2, param0)) {
          return false;
        } else {
          L0: {
            if (((fm) this).field_k[param0] == null) {
              break L0;
            } else {
              if (((fm) this).field_k[param0][param1] != null) {
                return true;
              } else {
                break L0;
              }
            }
          }
          if (null == ((fm) this).field_c[param0]) {
            this.b(param0, false);
            if (((fm) this).field_c[param0] != null) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((fm) this).b(param1 + -2)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((fm) this).field_g.field_g.a(le.a(var4, (byte) -97), (byte) -67);
              if (param1 == -1) {
                stackOut_6_0 = ((fm) this).a(var3_int, false);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fm.R(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    fm(jp param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((fm) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((fm) this).field_a = param0;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((fm) this).field_i = stackIn_7_1 != 0;
                  ((fm) this).field_e = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("fm.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        var2 = 75 / ((19 - param0) / 58);
        if (!((fm) this).b(-3)) {
          return -1;
        } else {
          return ((fm) this).field_g.field_i.length;
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (((fm) this).b(-3)) {
          L0: {
            if (param2 < param1) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (((fm) this).field_g.field_i.length <= param2) {
                  break L0;
                } else {
                  if (((fm) this).field_g.field_i[param2] <= param0) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (nm.field_d) {
            throw new IllegalArgumentException(param2 + " " + param0);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        int var1 = -1;
        field_d = null;
        field_b = null;
        field_h = null;
        field_f = null;
        field_j = null;
    }

    private final synchronized void b(int param0, boolean param1) {
        L0: {
          if (!param1) {
            break L0;
          } else {
            boolean discarded$2 = ((fm) this).a(((byte[]) ((fm) this).field_c[4])[1]);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((fm) this).field_i) {
              break L2;
            } else {
              ((fm) this).field_c[param0] = aj.a(false, ((fm) this).field_a.a(param0, 103), -116);
              if (!Pixelate.field_H) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ((fm) this).field_c[param0] = (Object) (Object) ((fm) this).field_a.a(param0, -94);
          break L1;
        }
    }

    final int a(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.a(param2, -1)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 <= -94) {
                param1 = param1.toLowerCase();
                var5 = (CharSequence) (Object) param1;
                var4_int = ((fm) this).field_g.field_q[param2].a(le.a(var5, (byte) 110), (byte) -67);
                if (!this.b(var4_int, 0, param2)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_5_0 = -122;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("fm.G(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!this.a(param0, -1)) {
          return false;
        } else {
          if (null != ((fm) this).field_c[param0]) {
            return true;
          } else {
            this.b(param0, param1);
            if (((fm) this).field_c[param0] == null) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if (((fm) this).b(-3)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              if (var4 >= ((fm) this).field_c.length) {
                if (var2 == 0) {
                  return 100;
                } else {
                  var4 = var3 * 100 / var2;
                  break L1;
                }
              } else {
                stackOut_4_0 = ~((fm) this).field_g.field_h[var4];
                stackOut_4_1 = -1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var5 == 0) {
                  L2: {
                    if (stackIn_6_0 < stackIn_6_1) {
                      var3 = var3 + ((fm) this).a(var4, (byte) -78);
                      var2 += 100;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4++;
                  continue L0;
                } else {
                  var4 = stackIn_5_0 / stackIn_5_1;
                  break L1;
                }
              }
            }
            return var4;
          }
        } else {
          return 0;
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((fm) this).b(param0 + -27)) {
              L1: {
                if (param0 == 24) {
                  break L1;
                } else {
                  field_j = null;
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((fm) this).field_g.field_g.a(le.a(var6, (byte) 67), (byte) -67);
              if (this.a(var4_int, -1)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((fm) this).field_g.field_q[var4_int].a(le.a(var7, (byte) 61), (byte) -67);
                stackOut_8_0 = ((fm) this).a(var4_int, var5, true);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("fm.N(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[128];
        field_j = "Withdraw invitation to <%0> to join this game";
    }
}
