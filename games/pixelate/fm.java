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
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((fm) this).b(-3)) {
              param1 = param1.toLowerCase();
              var3_int = ((fm) this).field_g.field_g.a(le.a((CharSequence) (Object) param1, (byte) 103), (byte) -67);
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
            stackOut_11_1 = new StringBuilder().append("fm.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final int c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              param1 = param1.toLowerCase();
              var3_int = ((fm) this).field_g.field_g.a(le.a((CharSequence) (Object) param1, (byte) 104), (byte) -67);
              stackOut_8_0 = ((fm) this).a(var3_int, (byte) -78);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("fm.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((fm) this).b(param1 + -2)) {
              L1: {
                if (~param0 > param1) {
                  break L1;
                } else {
                  if (param0 >= ((fm) this).field_g.field_i.length) {
                    break L1;
                  } else {
                    if (((fm) this).field_g.field_i[param0] != 0) {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (!nm.field_d) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param0));
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "fm.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final int b(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 >= 22) {
                break L1;
              } else {
                byte[] discarded$2 = this.a(((int[]) ((fm) this).field_c[1])[10], (int[]) null, 79, ((int[]) ((fm) this).field_c[0])[1]);
                break L1;
              }
            }
            if (!this.a(param0, -1)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((fm) this).field_g.field_i[param0];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "fm.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((fm) this).b(-3)) {
              param1 = param1.toLowerCase();
              var3_int = ((fm) this).field_g.field_g.a(le.a((CharSequence) (Object) param1, (byte) -111), (byte) -67);
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
            stackOut_11_1 = new StringBuilder().append("fm.O(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
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
        Object stackIn_14_0 = null;
        java.awt.AWTEvent stackIn_14_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        Object stackOut_6_0 = null;
        java.awt.AWTEvent stackOut_6_1 = null;
        Object stackOut_13_0 = null;
        Object stackOut_13_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (50 <= var3_int) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = null;
                        stackOut_6_1 = param0.field_w.peekEvent();
                        stackIn_14_0 = stackOut_6_0;
                        stackIn_14_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var4 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == (Object) (Object) stackIn_7_1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        vg.a(1L, (byte) 23);
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = null;
                        stackOut_13_1 = param1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = (java.awt.AWTEvent) (Object) stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == (Object) (Object) stackIn_14_1) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param0.field_w.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 == -52) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        boolean discarded$1 = fm.a((byte) 28, (CharSequence) null);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    stackOut_23_0 = (RuntimeException) var3_ref;
                    stackOut_23_1 = new StringBuilder().append("fm.A(");
                    stackIn_26_0 = stackOut_23_0;
                    stackIn_26_1 = stackOut_23_1;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                    stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                    stackOut_24_2 = "{...}";
                    stackIn_27_0 = stackOut_24_0;
                    stackIn_27_1 = stackOut_24_1;
                    stackIn_27_2 = stackOut_24_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                    stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                    stackOut_26_2 = "null";
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_30_1 = stackOut_27_1;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    if (param1 == null) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                    stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                    stackOut_28_2 = "{...}";
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_31_1 = stackOut_28_1;
                    stackIn_31_2 = stackOut_28_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                    stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                    stackOut_30_2 = "null";
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw aa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
                }
                case 32: {
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
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
              var4_int = ((fm) this).field_g.field_g.a(le.a((CharSequence) (Object) param1, (byte) -125), (byte) -67);
              if (!this.a(var4_int, -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                var5 = ((fm) this).field_g.field_q[var4_int].a(le.a((CharSequence) (Object) param2, (byte) 77), (byte) -67);
                stackOut_11_0 = ((fm) this).a(var4_int, var5, -2);
                stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("fm.AA(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    final byte[] a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                fm.a((cb) null, ((fm) this).field_c[0], ((byte[]) ((Object[]) ((fm) this).field_c[0])[1])[2]);
                break L1;
              }
            }
            stackOut_3_0 = this.a(-1, (int[]) null, param1, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "fm.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (null == ((fm) this).field_g) {
                ((fm) this).field_g = ((fm) this).field_a.a((byte) 36);
                if (((fm) this).field_g != null) {
                  ((fm) this).field_c = new Object[((fm) this).field_g.field_b];
                  ((fm) this).field_k = new Object[((fm) this).field_g.field_b][];
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -3) {
                break L2;
              } else {
                boolean discarded$2 = ((fm) this).a(-35, ((int[]) ((fm) this).field_c[0])[8], 66);
                break L2;
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "fm.BA(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final synchronized boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 92) {
                break L1;
              } else {
                int discarded$2 = ((fm) this).a(-33, (String) null);
                break L1;
              }
            }
            if (((fm) this).b(-3)) {
              var2_int = 1;
              var3 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var3 <= ~((fm) this).field_g.field_f.length) {
                      break L4;
                    } else {
                      stackOut_9_0 = ((fm) this).field_g.field_f[var3];
                      stackIn_17_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          var4 = stackIn_10_0;
                          if (null == ((fm) this).field_c[var4]) {
                            this.b(var4, false);
                            if (((fm) this).field_c[var4] != null) {
                              break L5;
                            } else {
                              var2_int = 0;
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = var2_int;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                }
                break L0;
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "fm.J(" + param0 + ')');
        }
        return stackIn_17_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_27_0 = 0;
        int[] stackIn_34_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_61_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_159_0 = 0;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        String stackIn_164_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_12_0 = null;
        int[] stackOut_32_0 = null;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_60_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        RuntimeException stackOut_163_0 = null;
        StringBuilder stackOut_163_1 = null;
        String stackOut_163_2 = null;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        String stackOut_161_2 = null;
        var22 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (this.a(param1, ~param3)) {
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
                            if (~var5_int >= ~var9_int) {
                              break L7;
                            } else {
                              stackOut_12_0 = (int[]) var6;
                              stackIn_34_0 = stackOut_12_0;
                              stackIn_13_0 = stackOut_12_0;
                              if (var22 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_13_0 == null) {
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
                                if (var22 == 0) {
                                  continue L2;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var8 == 0) {
                            if (null == param2) {
                              break L4;
                            } else {
                              if (0 != param2[0]) {
                                break L5;
                              } else {
                                stackOut_32_0 = (int[]) param2;
                                stackIn_34_0 = stackOut_32_0;
                                break L6;
                              }
                            }
                          } else {
                            stackOut_26_0 = 1;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0 != 0;
                          }
                        }
                        if (stackIn_34_0[1] != 0) {
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
                      var10_array = la.a(var9_array, param3);
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_45_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_45_1 = new StringBuilder();
                      stackIn_48_0 = stackOut_45_0;
                      stackIn_48_1 = stackOut_45_1;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      if (null == param2) {
                        stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                        stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                        stackOut_48_2 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        break L12;
                      } else {
                        stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                        stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                        stackOut_46_2 = 1;
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
                        stackIn_49_2 = stackOut_46_2;
                        break L12;
                      }
                    }
                    throw aa.a((Throwable) (Object) stackIn_49_0, (stackIn_49_2 != 0) + " " + param1 + " " + var9_array.length + " " + wg.a(var9_array, 126, var9_array.length) + " " + wg.a(var9_array, 125, var9_array.length + -2) + " " + ((fm) this).field_g.field_k[param1] + " " + ((fm) this).field_g.field_o);
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
                              var11 = var10_array.length;
                              var11--;
                              var12 = var10_array[var11] & 255;
                              var11 = var11 - var12 * var5_int * 4;
                              var13 = new we(var10_array);
                              var14_ref_int__ = new int[var5_int];
                              var13.field_m = var11;
                              var15 = 0;
                              L18: while (true) {
                                L19: {
                                  L20: {
                                    if (var15 >= var12) {
                                      break L20;
                                    } else {
                                      var16_int = 0;
                                      stackOut_60_0 = 0;
                                      stackIn_70_0 = stackOut_60_0;
                                      stackIn_61_0 = stackOut_60_0;
                                      if (var22 != 0) {
                                        break L19;
                                      } else {
                                        var17 = stackIn_61_0;
                                        L21: while (true) {
                                          L22: {
                                            L23: {
                                              if (var17 >= var5_int) {
                                                break L23;
                                              } else {
                                                var16_int = var16_int + var13.k(param3);
                                                var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                                var17++;
                                                if (var22 != 0) {
                                                  break L22;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L21;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                            }
                                            var15++;
                                            break L22;
                                          }
                                          if (var22 == 0) {
                                            continue L18;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_69_0 = var5_int;
                                  stackIn_70_0 = stackOut_69_0;
                                  break L19;
                                }
                                var15_ref_byte____ = new byte[stackIn_70_0][];
                                var16_int = 0;
                                L24: while (true) {
                                  L25: {
                                    L26: {
                                      if (~var16_int <= ~var5_int) {
                                        break L26;
                                      } else {
                                        var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                        var14_ref_int__[var16_int] = 0;
                                        var16_int++;
                                        if (var22 != 0) {
                                          break L25;
                                        } else {
                                          if (var22 == 0) {
                                            continue L24;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                    }
                                    var13.field_m = var11;
                                    var16_int = 0;
                                    break L25;
                                  }
                                  var17 = 0;
                                  L27: while (true) {
                                    L28: {
                                      L29: {
                                        if (var12 <= var17) {
                                          break L29;
                                        } else {
                                          var18 = 0;
                                          stackOut_79_0 = 0;
                                          stackIn_89_0 = stackOut_79_0;
                                          stackIn_80_0 = stackOut_79_0;
                                          if (var22 != 0) {
                                            break L28;
                                          } else {
                                            var19 = stackIn_80_0;
                                            L30: while (true) {
                                              L31: {
                                                L32: {
                                                  if (~var5_int >= ~var19) {
                                                    break L32;
                                                  } else {
                                                    var18 = var18 + var13.k(0);
                                                    qb.a(var10_array, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                    var16_int = var16_int + var18;
                                                    var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                    var19++;
                                                    if (var22 != 0) {
                                                      break L31;
                                                    } else {
                                                      if (var22 == 0) {
                                                        continue L30;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                }
                                                var17++;
                                                break L31;
                                              }
                                              if (var22 == 0) {
                                                continue L27;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_88_0 = 0;
                                      stackIn_89_0 = stackOut_88_0;
                                      break L28;
                                    }
                                    var17 = stackIn_89_0;
                                    L33: while (true) {
                                      L34: {
                                        if (var5_int <= var17) {
                                          break L34;
                                        } else {
                                          if (var22 != 0) {
                                            break L15;
                                          } else {
                                            L35: {
                                              L36: {
                                                if (var6 == null) {
                                                  break L36;
                                                } else {
                                                  var18 = var6[var17];
                                                  if (var22 == 0) {
                                                    break L35;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                              var18 = var17;
                                              break L35;
                                            }
                                            L37: {
                                              L38: {
                                                if (((fm) this).field_e != 0) {
                                                  break L38;
                                                } else {
                                                  var7[var18] = aj.a(false, var15_ref_byte____[var17], -123);
                                                  if (var22 == 0) {
                                                    break L37;
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                              }
                                              var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                              break L37;
                                            }
                                            var17++;
                                            if (var22 == 0) {
                                              continue L33;
                                            } else {
                                              break L34;
                                            }
                                          }
                                        }
                                      }
                                      if (var22 == 0) {
                                        break L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var11 = var10_array.length;
                          var11--;
                          var12 = var10_array[var11] & 255;
                          var11 = var11 - var5_int * var12 * 4;
                          var13 = new we(var10_array);
                          var14 = 0;
                          var15 = 0;
                          var13.field_m = var11;
                          var16_int = 0;
                          L39: while (true) {
                            L40: {
                              L41: {
                                if (var12 <= var16_int) {
                                  break L41;
                                } else {
                                  var17 = 0;
                                  stackOut_107_0 = 0;
                                  stackIn_124_0 = stackOut_107_0;
                                  stackIn_108_0 = stackOut_107_0;
                                  if (var22 != 0) {
                                    break L40;
                                  } else {
                                    var18 = stackIn_108_0;
                                    L42: while (true) {
                                      L43: {
                                        L44: {
                                          if (var18 >= var5_int) {
                                            break L44;
                                          } else {
                                            var17 = var17 + var13.k(0);
                                            if (var22 != 0) {
                                              break L43;
                                            } else {
                                              L45: {
                                                L46: {
                                                  if (var6 == null) {
                                                    break L46;
                                                  } else {
                                                    var19 = var6[var18];
                                                    if (var22 == 0) {
                                                      break L45;
                                                    } else {
                                                      break L46;
                                                    }
                                                  }
                                                }
                                                var19 = var18;
                                                break L45;
                                              }
                                              L47: {
                                                if (~param0 == ~var19) {
                                                  var14 = var14 + var17;
                                                  var15 = var19;
                                                  break L47;
                                                } else {
                                                  break L47;
                                                }
                                              }
                                              var18++;
                                              if (var22 == 0) {
                                                continue L42;
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                        }
                                        var16_int++;
                                        break L43;
                                      }
                                      if (var22 == 0) {
                                        continue L39;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_123_0 = var14;
                              stackIn_124_0 = stackOut_123_0;
                              break L40;
                            }
                            if (stackIn_124_0 == 0) {
                              stackOut_126_0 = 1;
                              stackIn_127_0 = stackOut_126_0;
                              return stackIn_127_0 != 0;
                            } else {
                              var16 = new byte[var14];
                              var14 = 0;
                              var13.field_m = var11;
                              var17 = 0;
                              var18 = 0;
                              L48: while (true) {
                                L49: {
                                  if (var18 >= var12) {
                                    break L49;
                                  } else {
                                    var19 = 0;
                                    stackOut_130_0 = 0;
                                    stackIn_159_0 = stackOut_130_0;
                                    stackIn_131_0 = stackOut_130_0;
                                    if (var22 != 0) {
                                      break L14;
                                    } else {
                                      var20 = stackIn_131_0;
                                      L50: while (true) {
                                        L51: {
                                          L52: {
                                            if (var20 >= var5_int) {
                                              break L52;
                                            } else {
                                              var19 = var19 + var13.k(0);
                                              if (var22 != 0) {
                                                break L51;
                                              } else {
                                                L53: {
                                                  L54: {
                                                    if (null == var6) {
                                                      break L54;
                                                    } else {
                                                      var21 = var6[var20];
                                                      if (var22 == 0) {
                                                        break L53;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                  var21 = var20;
                                                  break L53;
                                                }
                                                L55: {
                                                  if (var21 == param0) {
                                                    qb.a(var10_array, var17, var16, var14, var19);
                                                    var14 = var14 + var19;
                                                    break L55;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                                var17 = var17 + var19;
                                                var20++;
                                                if (var22 == 0) {
                                                  continue L50;
                                                } else {
                                                  break L52;
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          break L51;
                                        }
                                        if (var22 == 0) {
                                          continue L48;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var15] = (Object) (Object) var16;
                                if (var22 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                      }
                      L56: {
                        L57: {
                          if (null == var6) {
                            break L57;
                          } else {
                            var11 = var6[0];
                            if (var22 == 0) {
                              break L56;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var11 = 0;
                        break L56;
                      }
                      L58: {
                        if (((fm) this).field_e == 0) {
                          break L58;
                        } else {
                          var7[var11] = (Object) (Object) var10_array;
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L58;
                          }
                        }
                      }
                      var7[var11] = aj.a(false, var10_array, 124);
                      break L15;
                    }
                    stackOut_158_0 = 1;
                    stackIn_159_0 = stackOut_158_0;
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
          L59: {
            var5 = decompiledCaughtException;
            stackOut_160_0 = (RuntimeException) var5;
            stackOut_160_1 = new StringBuilder().append("fm.C(").append(param0).append(',').append(param1).append(',');
            stackIn_163_0 = stackOut_160_0;
            stackIn_163_1 = stackOut_160_1;
            stackIn_161_0 = stackOut_160_0;
            stackIn_161_1 = stackOut_160_1;
            if (param2 == null) {
              stackOut_163_0 = (RuntimeException) (Object) stackIn_163_0;
              stackOut_163_1 = (StringBuilder) (Object) stackIn_163_1;
              stackOut_163_2 = "null";
              stackIn_164_0 = stackOut_163_0;
              stackIn_164_1 = stackOut_163_1;
              stackIn_164_2 = stackOut_163_2;
              break L59;
            } else {
              stackOut_161_0 = (RuntimeException) (Object) stackIn_161_0;
              stackOut_161_1 = (StringBuilder) (Object) stackIn_161_1;
              stackOut_161_2 = "{...}";
              stackIn_164_0 = stackOut_161_0;
              stackIn_164_1 = stackOut_161_1;
              stackIn_164_2 = stackOut_161_2;
              break L59;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_164_0, stackIn_164_2 + ',' + param3 + ')');
        }
        return stackIn_159_0 != 0;
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
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
            if (!this.b(param2, 0, param3)) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (byte[]) (Object) stackIn_7_0;
            } else {
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
                var6 = this.a(param2, param3, param1, 0) ? 1 : 0;
                if (var6 != 0) {
                  break L2;
                } else {
                  this.b(param3, false);
                  var6 = this.a(param2, param3, param1, 0) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (byte[]) (Object) stackIn_17_0;
                  } else {
                    break L2;
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
                    var5 = (Object) (Object) tg.a(false, false, ((fm) this).field_k[param3][param2]);
                    if (var5 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (null == var5) {
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
                stackOut_41_0 = var5;
                stackIn_42_0 = stackOut_41_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_43_0 = var5;
            stackOut_43_1 = new StringBuilder().append("fm.K(").append(param0).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_46_0 = stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L7;
            } else {
              stackOut_44_0 = stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_42_0;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_3_0 = f.a(param1, (byte) -70, false);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("fm.L(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            if (!this.a(param0, -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 == -78) {
                  break L1;
                } else {
                  fm.a(-74);
                  break L1;
                }
              }
              if (null != ((fm) this).field_c[param0]) {
                stackOut_11_0 = 100;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_13_0 = ((fm) this).field_a.b(param0, param1 ^ -8270);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "fm.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized byte[] b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_11_0 = null;
        byte[] stackOut_14_0 = null;
        byte[] stackOut_6_0 = null;
        try {
          if (!((fm) this).b(-3)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (((fm) this).field_g.field_i.length != 1) {
              if (!this.a(param0, -1)) {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              } else {
                if (((fm) this).field_g.field_i[param0] != 1) {
                  var3_int = 10 / ((param1 - -24) / 54);
                  throw new RuntimeException();
                } else {
                  stackOut_14_0 = ((fm) this).a(param0, 0, true);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              }
            } else {
              stackOut_6_0 = ((fm) this).a(0, param0, true);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "fm.V(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        try {
          L0: {
            if (!this.b(param1, param2 ^ param2, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((fm) this).field_k[param0] == null) {
                  break L1;
                } else {
                  if (((fm) this).field_k[param0][param1] != null) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              if (null == ((fm) this).field_c[param0]) {
                this.b(param0, false);
                if (((fm) this).field_c[param0] == null) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                }
              } else {
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "fm.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((fm) this).b(param1 + -2)) {
              param0 = param0.toLowerCase();
              var3_int = ((fm) this).field_g.field_g.a(le.a((CharSequence) (Object) param0, (byte) -97), (byte) -67);
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
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    fm(jp param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((fm) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  ((fm) this).field_a = param0;
                  ((fm) this).field_i = param1;
                  ((fm) this).field_e = param2;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("fm.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var2_int = 75 / ((19 - param0) / 58);
            if (((fm) this).b(-3)) {
              stackOut_3_0 = ((fm) this).field_g.field_i.length;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "fm.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((fm) this).b(-3)) {
              L1: {
                if (param2 < param1) {
                  break L1;
                } else {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (~((fm) this).field_g.field_i.length >= ~param2) {
                      break L1;
                    } else {
                      if (~((fm) this).field_g.field_i[param2] >= ~param0) {
                        break L1;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (!nm.field_d) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                throw new IllegalArgumentException(param2 + " " + param0);
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "fm.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    public static void a(int param0) {
        try {
            int var1_int = -71 % ((44 - param0) / 47);
            field_d = null;
            field_b = null;
            field_h = null;
            field_f = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fm.M(" + param0 + ')');
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                boolean discarded$2 = ((fm) this).a(((byte[]) ((fm) this).field_c[4])[1]);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((fm) this).field_i) {
                  break L3;
                } else {
                  ((fm) this).field_c[param0] = aj.a(false, ((fm) this).field_a.a(param0, 103), -116);
                  if (!Pixelate.field_H) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((fm) this).field_c[param0] = (Object) (Object) ((fm) this).field_a.a(param0, -94);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "fm.F(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!this.a(param2, -1)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 <= -94) {
                param1 = param1.toLowerCase();
                var4_int = ((fm) this).field_g.field_q[param2].a(le.a((CharSequence) (Object) param1, (byte) 110), (byte) -67);
                if (!this.b(var4_int, 0, param2)) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = var4_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = -122;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("fm.G(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            if (!this.a(param0, -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null != ((fm) this).field_c[param0]) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                this.b(param0, param1);
                if (((fm) this).field_c[param0] != null) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "fm.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final synchronized int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (((fm) this).b(-3)) {
              var2_int = param0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~((fm) this).field_c.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = ~((fm) this).field_g.field_h[var4];
                      stackOut_6_1 = -1;
                      stackIn_19_0 = stackOut_6_0;
                      stackIn_19_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 < stackIn_7_1) {
                            var3 = var3 + ((fm) this).a(var4, (byte) -78);
                            var2_int += 100;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var2_int == 0) {
                    stackOut_16_0 = 100;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  } else {
                    stackOut_18_0 = var3 * 100;
                    stackOut_18_1 = var2_int;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L2;
                  }
                }
                var4 = stackIn_19_0 / stackIn_19_1;
                stackOut_19_0 = var4;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "fm.T(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_11_0 = null;
        byte[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((fm) this).b(param0 + -27)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
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
              var4_int = ((fm) this).field_g.field_g.a(le.a((CharSequence) (Object) param2, (byte) 67), (byte) -67);
              if (!this.a(var4_int, -1)) {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              } else {
                var5 = ((fm) this).field_g.field_q[var4_int].a(le.a((CharSequence) (Object) param1, (byte) 61), (byte) -67);
                stackOut_13_0 = ((fm) this).a(var4_int, var5, true);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("fm.N(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[128];
        field_j = "Withdraw invitation to <%0> to join this game";
    }
}
