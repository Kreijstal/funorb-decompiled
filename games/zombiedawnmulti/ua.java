/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ua extends rg {
    private boolean field_O;
    static re field_I;
    private boolean field_H;
    private int field_G;
    private int field_M;
    private int field_L;
    private int field_F;
    static String field_K;
    static cj field_E;
    static int field_N;

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
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
        StringBuilder stackOut_8_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 == 7) {
              L1: {
                if (((ua) this).a(param1, param0 ^ 126, param3, param2)) {
                  ((ua) this).a(param2, param3, (byte) 26, param1);
                  ((ua) this).a(param1, true, param3, param2);
                  StringBuilder discarded$26 = param3.append(" revert=").append(((ua) this).field_H);
                  if (((ua) this).field_G == 2147483647) {
                    break L1;
                  } else {
                    if (((ua) this).field_M == 2147483647) {
                      break L1;
                    } else {
                      StringBuilder discarded$27 = param3.append(" to ").append(((ua) this).field_G).append(44).append(((ua) this).field_M);
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_8_0 = (StringBuilder) param3;
              stackIn_9_0 = stackOut_8_0;
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
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ua.GA(").append(param0).append(44);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final static int h(int param0) {
        int var1 = 0;
        var1 = -104 % ((59 - param0) / 49);
        tj.field_a.b(0);
        if (!i.field_a.b((byte) 99)) {
          return ch.b(19352);
        } else {
          return 0;
        }
    }

    public static void g(byte param0) {
        field_E = null;
        field_I = null;
        field_K = null;
    }

    final void a(int param0) {
        super.a(param0);
        ((ua) this).field_B.b(0, 0, 28972, ((ua) this).field_n, ((ua) this).field_w);
        ((ua) this).field_G = ((ua) this).field_y;
        ((ua) this).field_M = ((ua) this).field_i;
    }

    final static String a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_20_0 = null;
        String stackOut_24_0 = null;
        String stackOut_37_0 = null;
        String stackOut_33_0 = null;
        String stackOut_30_0 = null;
        String stackOut_27_0 = null;
        String stackOut_16_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            if (param1 != 1) {
              if (param1 != 2) {
                if (param1 != 3) {
                  L1: {
                    if (param0 == -61) {
                      break L1;
                    } else {
                      var4 = null;
                      ua.a((ul) null, (ul) null, (byte) 0);
                      break L1;
                    }
                  }
                  if (4 == param1) {
                    stackOut_13_0 = vl.a(fh.field_f, new String[1], 2);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (param1 != 5) {
                      if (param1 == 6) {
                        stackOut_20_0 = vl.a(ik.field_e, new String[1], 2);
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (param1 == 7) {
                          stackOut_24_0 = vl.a(sf.field_c, new String[1], 2);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (8 != param1) {
                            if (param1 != 11) {
                              if (param1 != 12) {
                                if (13 == param1) {
                                  stackOut_37_0 = vl.a(qk.field_i, new String[1], param0 + 63);
                                  stackIn_38_0 = stackOut_37_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackOut_33_0 = vl.a(oa.field_b, new String[1], param0 + 63);
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              }
                            } else {
                              stackOut_30_0 = vl.a(qh.field_b, new String[1], 2);
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            }
                          } else {
                            stackOut_27_0 = vl.a(tq.field_Fb, new String[1], 2);
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0;
                          }
                        }
                      }
                    } else {
                      stackOut_16_0 = vl.a(un.field_l, new String[1], 2);
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                } else {
                  stackOut_7_0 = vl.a(ki.field_l, new String[1], 2);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = vl.a(qb.field_o, new String[1], 2);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = vl.a(oe.field_e, new String[1], 2);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("ua.JA(").append(param0).append(44).append(param1).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L2;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
        return stackIn_38_0;
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
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
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!((ua) this).field_O) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            if (((ua) this).a(-94, param5, param1, param0, param6)) {
              ((ua) this).field_u = param2;
              if (1 != param2) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                qi.field_a = (ua) this;
                ((ua) this).field_F = -param6 + (-((ua) this).field_i + param0);
                ((ua) this).field_L = -param5 + (-((ua) this).field_y + param1);
                return true;
              }
            } else {
              stackOut_5_0 = var8_int;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("ua.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static void i(int param0) {
        if (!(h.field_L == null)) {
            h.field_L.m(-7435);
        }
        qe.field_e = new cp();
        wj.field_i.a((cf) (Object) qe.field_e, (byte) 123);
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((ua) this).field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ua.NA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private ua(int param0, int param1, int param2, int param3, nl param4, bj param5, cf param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ua) this).field_M = 2147483647;
        ((ua) this).field_G = 2147483647;
        try {
            ((ua) this).field_H = param7 ? true : false;
            ((ua) this).field_B = param6;
            ((ua) this).field_O = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ua.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void a(ul param0, ul param1, byte param2) {
        try {
            if (param2 != 23) {
                field_N = 91;
            }
            lb.field_d = param0;
            pl.field_C = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ua.IA(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((ua) this).field_B instanceof gn)) {
                    break L3;
                  } else {
                    if (!((gn) (Object) ((ua) this).field_B).field_F) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((ua) this).field_u == 1) {
                  L4: {
                    var5_int = -((ua) this).field_L + (bd.field_g + -param2);
                    var6 = -param3 + (-((ua) this).field_F + bo.field_d);
                    if (((ua) this).field_y != var5_int) {
                      break L4;
                    } else {
                      if (((ua) this).field_i == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((ua) this).field_i = var6;
                  ((ua) this).field_y = var5_int;
                  if (!(((ua) this).field_A instanceof ad)) {
                    break L1;
                  } else {
                    ((ad) (Object) ((ua) this).field_A).a(param2, false, (ua) this, param3);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (((ua) this).field_H) {
                L5: {
                  if (((ua) this).field_G != ((ua) this).field_y) {
                    L6: {
                      var5_int = ((ua) this).field_G + -((ua) this).field_y;
                      stackOut_9_0 = this;
                      stackOut_9_1 = ((ua) this).field_y;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (Math.abs(var5_int) <= 2) {
                        stackOut_11_0 = this;
                        stackOut_11_1 = stackIn_11_1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (0 < var5_int) {
                          stackOut_13_0 = this;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          break L6;
                        } else {
                          stackOut_12_0 = this;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = -1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          break L6;
                        }
                      } else {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = var5_int >> 1;
                        stackIn_14_0 = stackOut_10_0;
                        stackIn_14_1 = stackOut_10_1;
                        stackIn_14_2 = stackOut_10_2;
                        break L6;
                      }
                    }
                    ((ua) this).field_y = stackIn_14_1 + stackIn_14_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((ua) this).field_M == ((ua) this).field_i) {
                  break L1;
                } else {
                  L7: {
                    var5_int = ((ua) this).field_M + -((ua) this).field_i;
                    stackOut_16_0 = this;
                    stackOut_16_1 = ((ua) this).field_i;
                    stackIn_20_0 = stackOut_16_0;
                    stackIn_20_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (2 < Math.abs(var5_int)) {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = var5_int >> 1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      break L7;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (var5_int > 0) {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L7;
                      } else {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = -1;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        break L7;
                      }
                    }
                  }
                  ((ua) this).field_i = stackIn_21_1 + stackIn_21_2;
                  break L1;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("ua.T(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Resume Game";
        field_I = new re();
    }
}
