/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed extends en {
    static int[] field_V;
    private int field_T;
    static int field_O;
    private int field_N;
    static String field_U;
    private boolean field_Q;
    private boolean field_R;
    private int field_W;
    static String field_P;
    private int field_S;

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (((ed) this).field_Q) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((ed) this).b(param6, 1343807649, param1, param3, param5)) {
              L2: {
                if (param2 != 1) {
                  break L2;
                } else {
                  ((ed) this).field_S = -param1 + -((ed) this).field_t + param6;
                  ((ed) this).field_T = -param3 + (-((ed) this).field_w + param5);
                  gi.field_c = (ed) this;
                  break L2;
                }
              }
              ((ed) this).field_x = param2;
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } else {
              stackOut_4_0 = var8_int;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("ed.PA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
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
        StringBuilder stackOut_9_0 = null;
        Object stackOut_1_0 = null;
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
            if (param3 == -372494750) {
              L1: {
                if (((ed) this).a(param0, param2, param3 ^ -372494832, param1)) {
                  ((ed) this).a(-120, param1, param0, param2);
                  ((ed) this).a(-31857, param2, param1, param0);
                  StringBuilder discarded$26 = param1.append(" revert=").append(((ed) this).field_R);
                  if (2147483647 == ((ed) this).field_N) {
                    break L1;
                  } else {
                    if (((ed) this).field_W != 2147483647) {
                      StringBuilder discarded$27 = param1.append(" to ").append(((ed) this).field_N).append(44).append(((ed) this).field_W);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_9_0 = (StringBuilder) param1;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ed.WA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (null != aa.field_bc) {
            stackOut_4_0 = aa.field_bc.field_b;
            stackIn_5_0 = stackOut_4_0 ? 1 : 0;
            break L0;
          } else {
            if (null == ud.field_Qb) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var3 = stackIn_5_0;
          if (var3 != 0) {
            stackOut_7_0 = oj.field_a.field_z;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          } else {
            stackOut_6_0 = 480;
            stackIn_8_0 = stackOut_6_0;
            break L1;
          }
        }
        var4 = stackIn_8_0;
        var5 = -param2 + var4;
        var6 = -(var5 / 2) + -638 - -(int)a.field_d + param1;
        var7 = var5 / 20;
        if (param0 == 101) {
          L2: {
            L3: {
              if (var5 < 0) {
                break L3;
              } else {
                if (0 > var6) {
                  break L3;
                } else {
                  if (var7 <= 1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var7 = -1;
            break L2;
          }
          L4: {
            if (var7 != 1) {
              break L4;
            } else {
              var7 = 1 + var6 / 26;
              break L4;
            }
          }
          return var7;
        } else {
          return -98;
        }
    }

    final static int h(int param0) {
        return hk.field_a;
    }

    private ed(int param0, int param1, int param2, int param3, kg param4, dn param5, na param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ed) this).field_N = 2147483647;
        ((ed) this).field_W = 2147483647;
        try {
            ((ed) this).field_J = param6;
            ((ed) this).field_R = param7 ? true : false;
            ((ed) this).field_Q = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ed.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((ed) this).field_x = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ed.AB(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void d(byte param0) {
        super.d((byte) 122);
        ((ed) this).field_J.a(((ed) this).field_u, 0, 51, 0, ((ed) this).field_F);
        ((ed) this).field_W = ((ed) this).field_w;
        ((ed) this).field_N = ((ed) this).field_t;
        if (param0 <= 116) {
            ((ed) this).field_S = 40;
        }
    }

    final static se e(byte param0) {
        try {
            Throwable var1 = null;
            se stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            se stackOut_0_0 = null;
            try {
              L0: {
                stackOut_0_0 = (se) Class.forName("tj").newInstance();
                stackIn_1_0 = stackOut_0_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (!(((ed) this).field_J instanceof ae)) {
                      break L4;
                    } else {
                      if (!((ae) (Object) ((ed) this).field_J).field_K) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (((ed) this).field_x != 1) {
                    break L3;
                  } else {
                    L5: {
                      var5_int = aa.field_Nb + (-((ed) this).field_S + -param1);
                      var6 = -param2 + (-((ed) this).field_T + a.field_a);
                      if (((ed) this).field_t != var5_int) {
                        break L5;
                      } else {
                        if (((ed) this).field_w != var6) {
                          break L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    ((ed) this).field_w = var6;
                    ((ed) this).field_t = var5_int;
                    if (!(((ed) this).field_s instanceof he)) {
                      break L2;
                    } else {
                      ((he) (Object) ((ed) this).field_s).a(param1, param2, (ed) this, -26289);
                      break L2;
                    }
                  }
                }
                if (((ed) this).field_R) {
                  L6: {
                    if (((ed) this).field_N == ((ed) this).field_t) {
                      break L6;
                    } else {
                      L7: {
                        var5_int = ((ed) this).field_N - ((ed) this).field_t;
                        stackOut_12_0 = this;
                        stackOut_12_1 = ((ed) this).field_t;
                        stackIn_16_0 = stackOut_12_0;
                        stackIn_16_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (Math.abs(var5_int) > 2) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = var5_int >> 1;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L7;
                        } else {
                          stackOut_13_0 = this;
                          stackOut_13_1 = stackIn_13_1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          if (var5_int <= 0) {
                            stackOut_15_0 = this;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = -1;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            break L7;
                          } else {
                            stackOut_14_0 = this;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = 1;
                            stackIn_17_0 = stackOut_14_0;
                            stackIn_17_1 = stackOut_14_1;
                            stackIn_17_2 = stackOut_14_2;
                            break L7;
                          }
                        }
                      }
                      ((ed) this).field_t = stackIn_17_1 + stackIn_17_2;
                      break L6;
                    }
                  }
                  if (((ed) this).field_w != ((ed) this).field_W) {
                    L8: {
                      var5_int = -((ed) this).field_w + ((ed) this).field_W;
                      stackOut_20_0 = this;
                      stackOut_20_1 = ((ed) this).field_w;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      if (-3 <= Math.abs(var5_int)) {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (-1 >= var5_int) {
                          stackOut_24_0 = this;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = -1;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          break L8;
                        } else {
                          stackOut_23_0 = this;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_25_2 = stackOut_23_2;
                          break L8;
                        }
                      } else {
                        stackOut_21_0 = this;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = var5_int >> 1;
                        stackIn_25_0 = stackOut_21_0;
                        stackIn_25_1 = stackOut_21_1;
                        stackIn_25_2 = stackOut_21_2;
                        break L8;
                      }
                    }
                    ((ed) this).field_w = stackIn_25_1 + stackIn_25_2;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  break L1;
                }
              }
              super.a(param0, param1, param2, param3);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("ed.MA(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(boolean param0) {
        field_U = null;
        field_V = null;
        field_P = null;
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        ko var1_ref = null;
        float var1_float = 0.0f;
        float var2_float = 0.0f;
        kb var2 = null;
        qi var3 = null;
        kb var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kb var7 = null;
        kb stackIn_82_0 = null;
        kb stackIn_82_1 = null;
        int stackIn_82_2 = 0;
        kb stackIn_83_0 = null;
        kb stackIn_83_1 = null;
        int stackIn_83_2 = 0;
        kb stackIn_84_0 = null;
        kb stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        int stackIn_102_0 = 0;
        int stackIn_132_0 = 0;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_81_0 = null;
        kb stackOut_81_1 = null;
        int stackOut_81_2 = 0;
        kb stackOut_83_0 = null;
        kb stackOut_83_1 = null;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        kb stackOut_82_0 = null;
        kb stackOut_82_1 = null;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (qe.field_g != va.field_p) {
                L2: {
                  L3: {
                    var1_int = 1;
                    if (cd.field_d.field_c) {
                      break L3;
                    } else {
                      if (!wk.field_i.field_c) {
                        break L3;
                      } else {
                        im.field_e = uk.field_x;
                        ok.field_d = mh.field_c;
                        cl.field_g = 2;
                        var2_float = -dj.field_h + im.field_e;
                        L4: while (true) {
                          if ((double)var2_float >= -3.141592653589793) {
                            L5: while (true) {
                              if ((double)var2_float <= 3.141592653589793) {
                                L6: {
                                  if ((double)Math.abs(var2_float) > 0.01) {
                                    break L6;
                                  } else {
                                    if (0.05 >= (double)Math.abs(-ok.field_d + rn.field_d)) {
                                      break L2;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var1_int = 0;
                                break L2;
                              } else {
                                var2_float = (float)((double)var2_float - 6.283185307179586);
                                continue L5;
                              }
                            }
                          } else {
                            var2_float = (float)((double)var2_float + 6.283185307179586);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  if (!cd.field_d.field_c) {
                    break L2;
                  } else {
                    if (wk.field_i.field_c) {
                      break L2;
                    } else {
                      rn.field_d = mh.field_c;
                      dj.field_h = uk.field_x;
                      ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
                      ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
                      wk.field_i.field_c = true;
                      eo.a(-30);
                      break L2;
                    }
                  }
                }
                L7: {
                  if (cd.field_d.field_n) {
                    jl.field_e = jl.field_e - 16384;
                    if (0 >= jl.field_e) {
                      jl.field_e = 0;
                      break L7;
                    } else {
                      var1_int = 0;
                      break L7;
                    }
                  } else {
                    L8: {
                      if (wk.field_i.field_n) {
                        jl.field_e = 0;
                        wk.field_i.field_n = false;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    jl.field_e = jl.field_e + 16384;
                    if (jl.field_e < 262144) {
                      var1_int = 0;
                      break L7;
                    } else {
                      jl.field_e = 262144;
                      break L7;
                    }
                  }
                }
                L9: {
                  wk.field_i.field_g = cd.field_d.field_g;
                  if (wk.field_i.field_l < cd.field_d.field_l) {
                    wk.field_i.field_l = wk.field_i.field_l + 1;
                    break L9;
                  } else {
                    if (wk.field_i.field_l > cd.field_d.field_l) {
                      wk.field_i.field_l = wk.field_i.field_l - 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  wk.field_i.field_j = cd.field_d.field_j;
                  wk.field_i.field_e = cd.field_d.field_e;
                  if (cd.field_d.field_l == wk.field_i.field_l) {
                    break L10;
                  } else {
                    var1_int = 0;
                    break L10;
                  }
                }
                if (var1_int != 0) {
                  va.field_p = qe.field_g;
                  wk.field_i = cd.field_d;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L11: {
              if (cl.field_g != 0) {
                L12: while (true) {
                  if (-3.141592653589793 <= (double)dj.field_h) {
                    L13: while (true) {
                      if ((double)dj.field_h <= 3.141592653589793) {
                        L14: while (true) {
                          if ((double)im.field_e >= -3.141592653589793) {
                            L15: while (true) {
                              if ((double)im.field_e <= 3.141592653589793) {
                                var1_float = im.field_e - dj.field_h;
                                L16: while (true) {
                                  if (-3.141592653589793 <= (double)var1_float) {
                                    L17: while (true) {
                                      if ((double)var1_float <= 3.141592653589793) {
                                        L18: {
                                          dj.field_h = dj.field_h + 0.05000000074505806f * var1_float;
                                          var2_float = -rn.field_d + ok.field_d;
                                          rn.field_d = rn.field_d + 0.05000000074505806f * var2_float;
                                          ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
                                          ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
                                          eo.a(-42);
                                          if (0.0001 <= (double)Math.abs(var1_float)) {
                                            break L18;
                                          } else {
                                            if (0.05 <= (double)Math.abs(var2_float)) {
                                              break L18;
                                            } else {
                                              cl.field_g = 0;
                                              break L11;
                                            }
                                          }
                                        }
                                        if (0.1 <= (double)Math.abs(var1_float)) {
                                          break L11;
                                        } else {
                                          if (Math.abs(var2_float) >= 1.0f) {
                                            break L11;
                                          } else {
                                            cl.field_g = 1;
                                            break L11;
                                          }
                                        }
                                      } else {
                                        var1_float = (float)((double)var1_float - 6.283185307179586);
                                        continue L17;
                                      }
                                    }
                                  } else {
                                    var1_float = (float)((double)var1_float + 6.283185307179586);
                                    continue L16;
                                  }
                                }
                              } else {
                                im.field_e = (float)((double)im.field_e - 6.283185307179586);
                                continue L15;
                              }
                            }
                          } else {
                            im.field_e = (float)((double)im.field_e + 6.283185307179586);
                            continue L14;
                          }
                        }
                      } else {
                        dj.field_h = (float)((double)dj.field_h - 6.283185307179586);
                        continue L13;
                      }
                    }
                  } else {
                    dj.field_h = (float)((double)dj.field_h + 6.283185307179586);
                    continue L12;
                  }
                }
              } else {
                break L11;
              }
            }
            L19: {
              if (field_O == 10) {
                if (50 < dh.field_e) {
                  if (dh.field_e <= 100) {
                    bo.field_y = (float)(-50 + dh.field_e);
                    break L19;
                  } else {
                    if (dh.field_e <= 350) {
                      var1_int = dh.field_e + -100;
                      ul.field_d = (float)((double)(0.10000000149011612f * (210.0f - 4.0f * s.field_c)) + 3.141592653589793);
                      hi.field_d[0] = Math.cos((double)ul.field_d);
                      hi.field_d[2] = Math.sin((double)ul.field_d);
                      jl.field_e = (var1_int * (4 * var1_int * var1_int) / 5000 << 16) / 3125;
                      sk.field_c = 256 + -(var1_int * var1_int * (var1_int * 128) / 7812500);
                      s.field_c = (float)((long)(var1_int * (var1_int * var1_int)) * 210L) / 62500000.0f;
                      break L19;
                    } else {
                      if (351 == dh.field_e) {
                        jl.field_e = 262144;
                        sk.field_c = 0;
                        hi.field_d[0] = 1.0;
                        s.field_c = 52.5f;
                        hi.field_d[2] = 0.0;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                } else {
                  bo.field_y = 0.0f;
                  break L19;
                }
              } else {
                break L19;
              }
            }
            var1_ref = (ko) (Object) eg.field_J.c(false);
            L20: while (true) {
              if (var1_ref == null) {
                var2 = (kb) (Object) tb.field_d.c(false);
                L21: while (true) {
                  if (var2 == null) {
                    L22: {
                      if (ui.a(40, 1692) != 0) {
                        break L22;
                      } else {
                        L23: {
                          stackOut_81_0 = null;
                          stackOut_81_1 = null;
                          stackOut_81_2 = ui.a(3, 1692);
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_83_1 = stackOut_81_1;
                          stackIn_83_2 = stackOut_81_2;
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          stackIn_82_2 = stackOut_81_2;
                          if (ui.a(2, 1692) != 0) {
                            stackOut_83_0 = null;
                            stackOut_83_1 = null;
                            stackOut_83_2 = stackIn_83_2;
                            stackOut_83_3 = 0;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            stackIn_84_2 = stackOut_83_2;
                            stackIn_84_3 = stackOut_83_3;
                            break L23;
                          } else {
                            stackOut_82_0 = null;
                            stackOut_82_1 = null;
                            stackOut_82_2 = stackIn_82_2;
                            stackOut_82_3 = 1;
                            stackIn_84_0 = stackOut_82_0;
                            stackIn_84_1 = stackOut_82_1;
                            stackIn_84_2 = stackOut_82_2;
                            stackIn_84_3 = stackOut_82_3;
                            break L23;
                          }
                        }
                        var7 = new kb(stackIn_84_2, stackIn_84_3 != 0, ui.a(64, 1692));
                        var3_ref = (kb) (Object) tb.field_d.c(false);
                        L24: while (true) {
                          L25: {
                            if (var3_ref == null) {
                              break L25;
                            } else {
                              if (var3_ref.field_s < var7.field_s) {
                                break L25;
                              } else {
                                var3_ref = (kb) (Object) tb.field_d.a((byte) -70);
                                continue L24;
                              }
                            }
                          }
                          if (var3_ref == null) {
                            tb.field_d.a((mc) (Object) var7, false);
                            break L22;
                          } else {
                            cl.a((mc) (Object) var3_ref, 98, (mc) (Object) var7);
                            break L22;
                          }
                        }
                      }
                    }
                    L26: {
                      if (cf.a(0, (byte) 106)) {
                        L27: {
                          if (vh.field_d) {
                            if (il.field_S < 32) {
                              il.field_S = il.field_S + 1;
                              break L27;
                            } else {
                              L28: {
                                var3_int = -bl.field_Xb + ki.field_b & 65535;
                                if ((32768 & var3_int) == 0) {
                                  break L28;
                                } else {
                                  var3_int = var3_int - 65536;
                                  break L28;
                                }
                              }
                              var3_int = var3_int >> 5;
                              bl.field_Xb = bl.field_Xb + var3_int;
                              if ((var3_int & -4) == 0) {
                                ac.field_a.a((byte) 122, go.field_a);
                                vh.field_d = false;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                          } else {
                            L29: {
                              int fieldTemp$6 = il.field_S - 1;
                              il.field_S = il.field_S - 1;
                              if (fieldTemp$6 < 0) {
                                il.field_S = 0;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            if (ui.a(200, 1692) == 0) {
                              L30: {
                                ki.field_b = ui.a(65536, 1692);
                                ac.field_a.a((byte) 57, vg.field_Vb);
                                vh.field_d = true;
                                var3_int = ki.field_b - bl.field_Xb & 65535;
                                if ((var3_int & 32768) == 0) {
                                  stackOut_101_0 = 0;
                                  stackIn_102_0 = stackOut_101_0;
                                  break L30;
                                } else {
                                  stackOut_100_0 = 1;
                                  stackIn_102_0 = stackOut_100_0;
                                  break L30;
                                }
                              }
                              jo.field_a = stackIn_102_0 != 0;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                        }
                        boolean discarded$7 = ac.field_a.a((byte) -125);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L31: {
                      var3 = (qi) (Object) nd.field_Sb.c(false);
                      if (param0 < -81) {
                        break L31;
                      } else {
                        field_V = null;
                        break L31;
                      }
                    }
                    L32: while (true) {
                      if (var3 == null) {
                        L33: {
                          if (wk.field_i.field_e <= 0) {
                            break L33;
                          } else {
                            L34: {
                              if (wk.field_i.field_e == 1) {
                                break L34;
                              } else {
                                if (ui.a(wk.field_i.field_e, 1692) == 0) {
                                  break L34;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            L35: while (true) {
                              var4 = ui.a(8193, 1692) - 4096;
                              var5 = -4096 + ui.a(8193, 1692);
                              if (var4 * var4 - -(var5 * var5) >= 8388608) {
                                continue L35;
                              } else {
                                var3 = new qi(0, 1638400, 0, var4, -8192, var5, 150);
                                nd.field_Sb.a((mc) (Object) var3, false);
                                break L33;
                              }
                            }
                          }
                        }
                        L36: {
                          L37: {
                            if (field_O == -4) {
                              break L37;
                            } else {
                              if (field_O != -2) {
                                L38: {
                                  if (!cd.field_d.field_c) {
                                    stackOut_131_0 = 1;
                                    stackIn_132_0 = stackOut_131_0;
                                    break L38;
                                  } else {
                                    stackOut_130_0 = 2;
                                    stackIn_132_0 = stackOut_130_0;
                                    break L38;
                                  }
                                }
                                wk.field_u = stackIn_132_0;
                                break L36;
                              } else {
                                break L37;
                              }
                            }
                          }
                          wk.field_u = 0;
                          break L36;
                        }
                        L39: {
                          if (wk.field_u == ml.field_ab) {
                            wd.field_i = 0;
                            break L39;
                          } else {
                            int fieldTemp$8 = wd.field_i + 8;
                            wd.field_i = wd.field_i + 8;
                            if (fieldTemp$8 >= 256) {
                              wd.field_i = 0;
                              ml.field_ab = wk.field_u;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                        }
                        L40: {
                          var4 = 0;
                          if (wk.field_u == 2) {
                            var4 = go.field_g.b(ai.field_c) - -17;
                            if (var4 < 135) {
                              var4 = 135;
                              break L40;
                            } else {
                              break L40;
                            }
                          } else {
                            if (wk.field_u != 1) {
                              break L40;
                            } else {
                              var4 = 17 + go.field_g.b(qf.field_d);
                              break L40;
                            }
                          }
                        }
                        a.field_d = a.field_d + (-a.field_d + (float)var4) * 0.10000000149011612f;
                        break L0;
                      } else {
                        L41: {
                          int fieldTemp$9 = var3.field_s - 1;
                          var3.field_s = var3.field_s - 1;
                          if (fieldTemp$9 <= 0) {
                            var3.b(false);
                            break L41;
                          } else {
                            var3.field_v = var3.field_v + var3.field_r;
                            var3.field_t = var3.field_t + var3.field_x;
                            var3.field_y = var3.field_y + var3.field_w;
                            var3.field_r = var3.field_r + 48;
                            break L41;
                          }
                        }
                        var3 = (qi) (Object) nd.field_Sb.a((byte) -70);
                        continue L32;
                      }
                    }
                  } else {
                    L42: {
                      int fieldTemp$10 = var2.field_r + 1;
                      var2.field_r = var2.field_r + 1;
                      if (83 < fieldTemp$10) {
                        var2.b(false);
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    var2 = (kb) (Object) tb.field_d.a((byte) -70);
                    continue L21;
                  }
                }
              } else {
                L43: {
                  int fieldTemp$11 = var1_ref.field_n - 1;
                  var1_ref.field_n = var1_ref.field_n - 1;
                  if (0 != fieldTemp$11) {
                    break L43;
                  } else {
                    var1_ref.b(false);
                    break L43;
                  }
                }
                var1_ref = (ko) (Object) eg.field_J.a((byte) -70);
                continue L20;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "ed.G(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Names cannot start or end with space or underscore";
        field_P = "Leave game";
    }
}
