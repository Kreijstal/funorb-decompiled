/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

abstract class ma extends ce implements ra {
    static w field_J;
    static String[] field_H;
    static w field_G;
    static int field_I;
    ce field_L;
    static ck field_K;

    void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        RuntimeException var7 = null;
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
        try {
          L0: {
            L1: {
              if (param1 == 64) {
                break L1;
              } else {
                boolean discarded$2 = this.a((ce) null, (byte) -1);
                break L1;
              }
            }
            L2: {
              if (((ma) this).field_L != null) {
                ((ma) this).field_L.a(param0, 64, param2 + ((ma) this).field_u, param3, ((ma) this).field_D + param4, param5);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("ma.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                if (((ma) this).field_p != null) {
                  ((ma) this).field_p.a(true, param0, param3, (byte) -98, (ce) this);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((ma) this).field_L == null) {
                break L2;
              } else {
                ((ma) this).field_L.a(param0 + ((ma) this).field_u, -119, param2, param3 - -((ma) this).field_D);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var5, "ma.C(" + param0 + ',' + -109 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        try {
            super.b(param0, param1, param2, param3, param4);
            ((ma) this).b(true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ma.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 99 / ((36 - param0) / 51);
              if (((ma) this).field_L == null) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = ((ma) this).field_L.d(125);
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ma.DC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    String c(byte param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              var2 = super.c(param0);
              if (((ma) this).field_L == null) {
                break L1;
              } else {
                var3 = ((ma) this).field_L.c((byte) 113);
                if (var3 != null) {
                  stackOut_4_0 = (String) var3;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_6_0 = (String) var2;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2_ref, "ma.R(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    ce a(int param0) {
        ce var2 = null;
        RuntimeException var2_ref = null;
        ce stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              var2 = ((ma) this).field_L;
              if (var2 == null) {
                break L1;
              } else {
                if (var2.a(true)) {
                  stackOut_6_0 = (ce) var2;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 14) {
              stackOut_11_0 = null;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              return (ce) (Object) stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2_ref, "ma.N(" + param0 + ')');
        }
        return (ce) (Object) stackIn_12_0;
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
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
        try {
          L0: {
            L1: {
              super.a(param0, 119, param2, param3);
              if (((ma) this).field_L != null) {
                ((ma) this).field_L.a(param0, 110, param2 - -((ma) this).field_D, ((ma) this).field_u + param3);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ma.A(");
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
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 113 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(ce param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -112) {
                break L1;
              } else {
                boolean discarded$2 = ((ma) this).a(112, -42, (ce) null, -60, 72, 122, (byte) 63);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ma) this).field_L == null) {
                  break L3;
                } else {
                  if (((ma) this).field_L.a(true)) {
                    break L3;
                  } else {
                    if (!((ma) this).field_L.a(false, param0)) {
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_13_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ma.H(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
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
            if (!param0) {
              L1: {
                L2: {
                  if (null == ((ma) this).field_L) {
                    break L2;
                  } else {
                    if (!((ma) this).field_L.a(false, param1)) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ma.EC(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        ce stackIn_5_0 = null;
        ce stackIn_7_0 = null;
        ce stackIn_9_0 = null;
        ce stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_4_0 = null;
        ce stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ce stackOut_5_0 = null;
        ce stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (!param6) {
                break L1;
              } else {
                ((ma) this).field_L = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ma) this).field_L == null) {
                  break L3;
                } else {
                  L4: {
                    stackOut_4_0 = ((ma) this).field_L;
                    stackIn_9_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (param6) {
                      stackOut_9_0 = (ce) (Object) stackIn_9_0;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L4;
                    } else {
                      stackOut_5_0 = (ce) (Object) stackIn_5_0;
                      stackIn_7_0 = stackOut_5_0;
                      stackOut_7_0 = (ce) (Object) stackIn_7_0;
                      stackOut_7_1 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      break L4;
                    }
                  }
                  if (((ce) (Object) stackIn_10_0).a(stackIn_10_1 == 0)) {
                    break L3;
                  } else {
                    if (!((ma) this).field_L.a(param0, param1, param2, param3, param4, param5, false)) {
                      break L3;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_17_0 = stackOut_14_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("ma.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static wb a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vj var4 = null;
        Object var5 = null;
        Object var6 = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        pf var17 = null;
        String var18 = null;
        int var19 = 0;
        nm stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        nm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        nm stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        wb stackIn_21_0 = null;
        w stackIn_42_0 = null;
        w stackIn_44_0 = null;
        w stackIn_45_0 = null;
        String stackIn_45_1 = null;
        w stackIn_46_0 = null;
        w stackIn_48_0 = null;
        w stackIn_49_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_92_0 = null;
        Object stackIn_100_0 = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        nm stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        nm stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        wb stackOut_20_0 = null;
        w stackOut_41_0 = null;
        w stackOut_44_0 = null;
        String stackOut_44_1 = null;
        w stackOut_42_0 = null;
        String stackOut_42_1 = null;
        w stackOut_45_0 = null;
        w stackOut_48_0 = null;
        String stackOut_48_1 = null;
        w stackOut_46_0 = null;
        String stackOut_46_1 = null;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        w stackOut_91_0 = null;
        Object stackOut_99_0 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_4_0 = k.field_b.field_Rb;
              stackOut_4_1 = kf.field_O - -2;
              stackOut_4_2 = (kf.field_O + 2) * (3 * param0);
              stackOut_4_3 = -15230;
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              stackIn_7_3 = stackOut_4_3;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              if (k.field_b.field_Rb != ki.field_w) {
                stackOut_7_0 = (nm) (Object) stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                break L1;
              } else {
                stackOut_5_0 = (nm) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = 1;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                stackIn_8_2 = stackOut_5_2;
                stackIn_8_3 = stackOut_5_3;
                stackIn_8_4 = stackOut_5_4;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((nm) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, 2, param1) ? 1 : 0;
                var4 = k.field_b.field_Sb.field_M;
                var5 = null;
                if (jj.field_b == 2) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      tb.field_c.field_Hb = false;
                      jc.field_c.field_Y = wm.field_k;
                      if (1 != jj.field_b) {
                        break L5;
                      } else {
                        k.field_b.field_Rb.field_Rb.field_Y = si.field_m;
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    k.field_b.field_Rb.field_Rb.field_Y = wf.field_m;
                    break L4;
                  }
                  int discarded$1 = 1;
                  gk.a(k.field_b.field_Sb);
                  if (var19 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              tb.field_c.field_Hb = true;
              jc.field_c.field_Y = cm.a((byte) 98, ve.field_cc, new String[1]);
              k.field_b.field_Rb.field_Rb.field_Y = null;
              var6 = null;
              var7 = (wb) (Object) var4.c((byte) -108);
              L6: while (true) {
                L7: {
                  L8: {
                    if (null == var7) {
                      break L8;
                    } else {
                      var8 = 0;
                      stackOut_20_0 = (wb) var7;
                      stackIn_92_0 = (Object) (Object) stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var19 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_21_0.field_M != null) {
                            break L9;
                          } else {
                            var7.field_Sb = new w(0L, gg.field_G);
                            var7.a(var7.field_Sb, -16834);
                            var7.field_Yb = new w(0L, fc.field_f);
                            var7.a(var7.field_Yb, -16834);
                            var7.field_Wb = new w(0L, gg.field_G);
                            var7.a(var7.field_Wb, -16834);
                            var7.field_Yb.field_X = 2;
                            var7.d(-112);
                            var8 = 1;
                            break L9;
                          }
                        }
                        L10: {
                          L11: {
                            var7.field_mb = k.field_b.field_Sb.field_mb;
                            var9 = 0;
                            if (var7.field_Vb != null) {
                              break L11;
                            } else {
                              var10 = 13369344;
                              var11 = 16737894;
                              if (var19 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (f.field_w != var7.field_Vb) {
                              break L12;
                            } else {
                              var10 = 52224;
                              var11 = 6750054;
                              if (var19 == 0) {
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var11 = 16777062;
                          var10 = 13421568;
                          break L10;
                        }
                        L13: {
                          var12 = 0;
                          if (var7.field_Tb == null) {
                            break L13;
                          } else {
                            if (var7.field_Tb.equals((Object) (Object) "")) {
                              break L13;
                            } else {
                              var7.field_Wb.field_Bb = var11;
                              var7.field_Wb.field_I = a.field_p;
                              var7.field_Wb.a(3 + a.field_p.field_K, 0, var9, kf.field_O, 0);
                              var12 = 1;
                              break L13;
                            }
                          }
                        }
                        L14: {
                          var7.field_Yb.field_G = var10;
                          var7.field_Sb.field_G = var10;
                          var7.field_Yb.field_fb = var11;
                          var7.field_Sb.field_fb = var11;
                          var7.field_Yb.field_rb = var11;
                          var7.field_Sb.field_rb = var11;
                          var7.field_Yb.field_Bb = var11;
                          var7.field_Sb.field_Bb = var11;
                          var13 = 0;
                          var14 = -2 + (var7.field_mb - 80);
                          if (var12 != 0) {
                            var13 = a.field_p.field_K + 3;
                            var14 = var14 - var13;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          stackOut_41_0 = var7.field_Sb;
                          stackIn_44_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (0 >= var14) {
                            stackOut_44_0 = (w) (Object) stackIn_44_0;
                            stackOut_44_1 = var7.field_Ob;
                            stackIn_45_0 = stackOut_44_0;
                            stackIn_45_1 = stackOut_44_1;
                            break L15;
                          } else {
                            stackOut_42_0 = (w) (Object) stackIn_42_0;
                            stackOut_42_1 = mm.a(var7.field_Sb.field_J, var7.field_Ob, var14);
                            stackIn_45_0 = stackOut_42_0;
                            stackIn_45_1 = stackOut_42_1;
                            break L15;
                          }
                        }
                        L16: {
                          stackIn_45_0.field_Y = stackIn_45_1;
                          var7.field_Sb.a(var14, 0, var9, kf.field_O, var13);
                          stackOut_45_0 = var7.field_Yb;
                          stackIn_48_0 = stackOut_45_0;
                          stackIn_46_0 = stackOut_45_0;
                          if (null != var7.field_Vb) {
                            stackOut_48_0 = (w) (Object) stackIn_48_0;
                            stackOut_48_1 = var7.field_Vb;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            break L16;
                          } else {
                            stackOut_46_0 = (w) (Object) stackIn_46_0;
                            stackOut_46_1 = rg.field_b;
                            stackIn_49_0 = stackOut_46_0;
                            stackIn_49_1 = stackOut_46_1;
                            break L16;
                          }
                        }
                        L17: {
                          stackIn_49_0.field_Y = stackIn_49_1;
                          var7.field_Yb.a(80, 0, var9, kf.field_O, var7.field_mb + -80);
                          if (var7.field_Sb.field_Y.equals((Object) (Object) var7.field_Ob)) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L17;
                          } else {
                            stackOut_50_0 = 1;
                            stackIn_53_0 = stackOut_50_0;
                            break L17;
                          }
                        }
                        L18: {
                          var15 = stackIn_53_0;
                          var9 = var9 + kf.field_O;
                          if (var3_int != 0) {
                            break L18;
                          } else {
                            var7.field_F = var9 - var7.field_N;
                            break L18;
                          }
                        }
                        L19: {
                          if (var8 == 0) {
                            break L19;
                          } else {
                            k.field_b.field_Sb.a((w) var6, (w) (Object) var7, 2, 0);
                            break L19;
                          }
                        }
                        L20: {
                          L21: {
                            L22: {
                              if (var7.field_Wb == null) {
                                break L22;
                              } else {
                                if (var7.field_Wb.field_jb) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (var7.field_ob == 0) {
                                break L23;
                              } else {
                                L24: {
                                  var16 = var7.field_Ob;
                                  sl.a(var16, (int[]) null, (byte) 101, k.field_b.field_Rb, (w) (Object) var7, (String) null, 0L, -1, -1);
                                  var5 = (Object) (Object) var7;
                                  if (var7.field_Vb == null) {
                                    break L24;
                                  } else {
                                    if (wi.a(-103, w.field_H.field_b)) {
                                      break L24;
                                    } else {
                                      if (!wc.field_n) {
                                        L25: {
                                          if (wl.field_p) {
                                            break L25;
                                          } else {
                                            var17 = w.field_H;
                                            var18 = cm.a((byte) 111, ai.field_M, new String[1]);
                                            var17.field_h.a(var18, 8, 80);
                                            break L25;
                                          }
                                        }
                                        var17 = w.field_H;
                                        var18 = cm.a((byte) 99, wa.field_e, new String[1]);
                                        var17.field_h.a(var18, 18, 65);
                                        break L24;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                if (var19 == 0) {
                                  break L20;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (!var7.field_Sb.field_jb) {
                              break L20;
                            } else {
                              if (var15 != 0) {
                                sl.field_g = var7.field_Ob;
                                if (var19 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              } else {
                                break L20;
                              }
                            }
                          }
                          sl.field_g = var7.field_Tb;
                          break L20;
                        }
                        var6 = (Object) (Object) var7;
                        var7 = (wb) (Object) var4.d(true);
                        if (var19 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_91_0 = k.field_b.field_Ob;
                  stackIn_92_0 = (Object) (Object) stackOut_91_0;
                  break L7;
                }
                L26: {
                  if (((w) (Object) stackIn_92_0).field_ob == 0) {
                    break L26;
                  } else {
                    vh.field_h = new hb(k.field_b.field_Ob.field_E, k.field_b.field_Ob.field_pb, k.field_b.field_Ob.field_mb, k.field_b.field_Ob.field_N, h.field_g, ah.field_h, ua.field_H, ua.field_H);
                    of.field_d = 0;
                    break L26;
                  }
                }
                if (k.field_b.field_Nb.field_ob != 0) {
                  vh.field_h = new hb(k.field_b.field_Nb.field_E, k.field_b.field_Nb.field_pb, k.field_b.field_Nb.field_mb, k.field_b.field_Nb.field_N, fj.field_b, ah.field_h, ua.field_H, ua.field_H);
                  of.field_d = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_99_0 = var5;
            stackIn_100_0 = stackOut_99_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ma.K(" + param0 + ',' + param1 + ',' + 99 + ')');
        }
        return (wb) (Object) stackIn_100_0;
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                boolean discarded$2 = ((ma) this).a(-67, 8, (ce) null, -37, -30, 67, (byte) -40);
                break L1;
              }
            }
            L2: {
              if (null == ((ma) this).a(14)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ma.TB(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static pi a(ji param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        pi stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_6_0 = null;
        Object stackOut_4_0 = null;
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
            if (gb.a(param1, param0, param2, 78)) {
              int discarded$1 = 0;
              stackOut_6_0 = a.b();
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (pi) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ma.J(");
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
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + 21828 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_15_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_17_0 = 0;
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
            L1: {
              if (((ma) this).field_L == null) {
                break L1;
              } else {
                if (!((ma) this).field_L.a(true)) {
                  break L1;
                } else {
                  if (!((ma) this).field_L.a(-125, param1, param2, param3)) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            }
            var5_int = param1;
            if (var5_int == 80) {
              L2: {
                if (bj.field_d[81]) {
                  stackOut_15_0 = this.a(param2, (byte) -112);
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                } else {
                  stackOut_13_0 = this.b(false, param2);
                  stackIn_16_0 = stackOut_13_0;
                  break L2;
                }
              }
              return stackIn_16_0;
            } else {
              var5_int = 24 / ((param0 - -22) / 49);
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("ma.QA(").append(param0).append(',').append(param1).append(',');
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
          throw dh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final boolean b(boolean param0, ce param1) {
        RuntimeException var3 = null;
        ce stackIn_6_0 = null;
        ce stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_4_0 = null;
        ce stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
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
            L1: {
              L2: {
                if (null == ((ma) this).field_L) {
                  break L2;
                } else {
                  stackOut_4_0 = ((ma) this).field_L;
                  stackIn_6_0 = stackOut_4_0;
                  stackOut_6_0 = (ce) (Object) stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  if (((ce) (Object) stackIn_9_0).a(stackIn_9_1 != 0)) {
                    break L2;
                  } else {
                    if (!((ma) this).field_L.a(false, param1)) {
                      break L2;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_16_0 = stackOut_13_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ma.G(").append(false).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static tj a(int param0, long param1) {
        RuntimeException var3 = null;
        tj stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        tj stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 < -98) {
                break L1;
              } else {
                field_G = null;
                break L1;
              }
            }
            stackOut_3_0 = (tj) (Object) ob.field_i.a(24710, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ma.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    ma(int param0, int param1, int param2, int param3, gl param4, kg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$15 = param2.append('\n');
              if (param0 <= -37) {
                break L1;
              } else {
                boolean discarded$16 = ((ma) this).a(36, -51, (ce) null, -111, 8, 107, (byte) -44);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var5_int > param1) {
                      break L5;
                    } else {
                      StringBuilder discarded$17 = param2.append(' ');
                      var5_int++;
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (((ma) this).field_L != null) {
                    break L4;
                  } else {
                    StringBuilder discarded$18 = param2.append("null");
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                StringBuilder discarded$19 = ((ma) this).field_L.a(param3, param1 + 1, param2, true);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ma.M(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((ma) this).field_L) {
                ((ma) this).field_L.f(112);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                boolean discarded$2 = ((ma) this).a(true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ma.KB(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (param0 != -95) {
            return;
        }
        try {
            if (((ma) this).field_L != null) {
                ((ma) this).field_L.d((byte) -95);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ma.WB(" + param0 + ')');
        }
    }

    public static void e() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_J = null;
            field_G = null;
            field_H = null;
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "ma.I(" + -79 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
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
            L1: {
              if (param6 == -55) {
                break L1;
              } else {
                ce discarded$2 = ((ma) this).a(59);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ma) this).field_L == null) {
                  break L3;
                } else {
                  if (!((ma) this).field_L.a(param0, param1, param2, param3, ((ma) this).field_D + param4, ((ma) this).field_u + param5, (byte) -55)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("ma.LB(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_10_0 != 0;
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        Object stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((ma) this).a(0, param1, param0, param2)) {
                ((ma) this).a((byte) 72, param2, param0, param1);
                ((ma) this).a((byte) -116, param1, param2, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3) {
              stackOut_7_0 = (StringBuilder) param2;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (StringBuilder) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ma.MB(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final static int a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_45_0 = 0;
        try {
          L0: {
            if (0 == param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 > 0) {
                L1: {
                  var2_int = 1;
                  if (param0 > 65535) {
                    param0 = param0 >> 16;
                    var2_int += 16;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 > 255) {
                    param0 = param0 >> 8;
                    var2_int += 8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0 > 15) {
                    param0 = param0 >> 4;
                    var2_int += 4;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 > 3) {
                    var2_int += 2;
                    param0 = param0 >> 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (1 < param0) {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_28_0 = var2_int;
                stackIn_29_0 = stackOut_28_0;
                return stackIn_29_0;
              } else {
                L6: {
                  var2_int = 2;
                  if (param0 >= -65536) {
                    break L6;
                  } else {
                    param0 = param0 >> 16;
                    var2_int += 16;
                    break L6;
                  }
                }
                L7: {
                  if (param0 >= -256) {
                    break L7;
                  } else {
                    param0 = param0 >> 8;
                    var2_int += 8;
                    break L7;
                  }
                }
                L8: {
                  if (param0 >= -16) {
                    break L8;
                  } else {
                    var2_int += 4;
                    param0 = param0 >> 4;
                    break L8;
                  }
                }
                L9: {
                  if (param0 < -4) {
                    var2_int += 2;
                    param0 = param0 >> 2;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0 >= -2) {
                    break L10;
                  } else {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L10;
                  }
                }
                stackOut_45_0 = var2_int;
                stackIn_46_0 = stackOut_45_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ma.L(" + param0 + ',' + 49 + ')');
        }
        return stackIn_46_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
