/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends ng {
    boolean field_H;
    static int field_F;
    private boolean field_K;
    static java.applet.Applet field_L;
    private boolean field_I;
    boolean field_M;
    static byte[] field_J;
    static String field_G;

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
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
              if (param0 == -58) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            L2: {
              if (!((qm) this).field_H) {
                break L2;
              } else {
                if (((qm) this).a(102, param5, param3, param6, param4)) {
                  L3: {
                    boolean discarded$1 = ((qm) this).a(param1, 27);
                    ((qm) this).field_k = param2;
                    if (((qm) this).field_n == null) {
                      break L3;
                    } else {
                      if (!(((qm) this).field_n instanceof b)) {
                        break L3;
                      } else {
                        ((b) (Object) ((qm) this).field_n).a(param4, 118, param3, param2, (qm) this, param5, param6);
                        break L3;
                      }
                    }
                  }
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("qm.N(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_6_0 = 0;
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
              if (!((qm) this).field_H) {
                break L1;
              } else {
                if (!((qm) this).field_I) {
                  break L1;
                } else {
                  L2: {
                    param0.h(2);
                    ((qm) this).field_K = true;
                    if (param1 == 27) {
                      break L2;
                    } else {
                      qm.a(-64, (sb) null, 111, 79, (sb) null, 120, -16, 109, (sb) null, 39, -126, (jl) null, 33, -16, (jl) null, -57, -112, -56, 119, 16);
                      break L2;
                    }
                  }
                  L3: {
                    if (null == ((qm) this).field_n) {
                      break L3;
                    } else {
                      if (!(((qm) this).field_n instanceof cc)) {
                        break L3;
                      } else {
                        ((cc) (Object) ((qm) this).field_n).a((ng) this, param1 ^ 44, ((qm) this).field_K);
                        break L3;
                      }
                    }
                  }
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("qm.HA(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((qm) this).field_H = true;
                break L1;
              }
            }
            L2: {
              if (((qm) this).field_n == null) {
                break L2;
              } else {
                if (((qm) this).field_n instanceof vo) {
                  ((vo) (Object) ((qm) this).field_n).a((qm) this, param1, 11, param2, param3);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "qm.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
              if (!param1) {
                break L1;
              } else {
                ((qm) this).field_K = false;
                break L1;
              }
            }
            L2: {
              if (!((qm) this).a(-89, param2, param0, param3)) {
                break L2;
              } else {
                L3: {
                  ((qm) this).a(param2, (byte) -2, param3, param0);
                  if (!((qm) this).field_M) {
                    break L3;
                  } else {
                    StringBuilder discarded$4 = param0.append(" active");
                    break L3;
                  }
                }
                if (((qm) this).field_H) {
                  break L2;
                } else {
                  StringBuilder discarded$5 = param0.append(" disabled");
                  break L2;
                }
              }
            }
            stackOut_12_0 = (StringBuilder) param0;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("qm.AA(");
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
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_13_0;
    }

    void a(int param0, int param1, int param2, ng param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              super.a(param0, param1, param2, param3);
              if (((qm) this).field_k == 0) {
                break L1;
              } else {
                if (((qm) this).field_k != ef.field_b) {
                  L2: {
                    if (!((qm) this).a(78, param2, param1, bg.field_k, uf.field_d)) {
                      break L2;
                    } else {
                      if (ef.field_b == 0) {
                        ((qm) this).a(true, -param1 + bg.field_k, ((qm) this).field_k, -param2 + uf.field_d);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((qm) this).a(bg.field_k, param2, param3, 0, param1, uf.field_d);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("qm.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
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
              if (null == ((qm) this).field_n) {
                break L1;
              } else {
                if (!(((qm) this).field_n instanceof b)) {
                  break L1;
                } else {
                  ((b) (Object) ((qm) this).field_n).a(param4, (byte) 71, param0, param5, (qm) this, param1);
                  break L1;
                }
              }
            }
            ((qm) this).field_k = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("qm.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    qm(String param0, fn param1) {
        this(param0, h.field_X.field_r, param1);
    }

    final static void a(rl param0, int[] param1, boolean param2, int[] param3, byte param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_75_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var30 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param1[3] >> 2;
              var22 = param1[4] >> 2;
              var23 = param1[5] >> 2;
              var24 = param1[6] >> 2;
              var25 = param1[7] >> 2;
              var26 = param1[8] >> 2;
              var27 = param1[9] >> 2;
              var28 = param1[10] >> 2;
              var29 = param1[11] >> 2;
              var13 = var25 * param3[4] + var24 * param3[3] - -(param3[5] * var26) >> 14;
              var12 = param3[5] * var23 + (param3[3] * var21 + param3[4] * var22) >> 14;
              var14 = var29 * param3[5] + (var28 * param3[4] + param3[3] * var27) >> 14;
              var20 = param3[11] * var29 + (var27 * param3[9] + param3[10] * var28) >> 14;
              var19 = param3[10] * var25 + var24 * param3[9] - -(param3[11] * var26) >> 14;
              var17 = param3[8] * var29 + var28 * param3[7] + param3[6] * var27 >> 14;
              var16 = var26 * param3[8] + var24 * param3[6] - -(var25 * param3[7]) >> 14;
              var15 = var21 * param3[6] + param3[7] * var22 - -(var23 * param3[8]) >> 14;
              var18 = param3[11] * var23 + param3[10] * var22 + param3[9] * var21 >> 14;
              var21 = param3[0] - param1[0];
              var22 = param3[1] + -param1[1];
              var23 = -param1[2] + param3[2];
              if (param4 >= 3) {
                break L1;
              } else {
                qm.a(112, (sb) null, 29, 72, (sb) null, 76, -127, -121, (sb) null, -76, 4, (jl) null, -119, 13, (jl) null, 46, -72, 8, -22, -67);
                break L1;
              }
            }
            var9 = var21 * param1[3] - -(param1[4] * var22) + var23 * param1[5] >> -ai.field_x + 16;
            var10 = var23 * param1[8] + (param1[7] * var22 + param1[6] * var21) >> 16 + -ai.field_x;
            var11 = param1[11] * var23 + param1[9] * var21 - -(param1[10] * var22) >> 16;
            var21 = ja.field_b;
            var22 = ja.field_i;
            var23 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var23 >= param0.field_A) {
                      break L5;
                    } else {
                      var24 = param0.field_k[var23];
                      var25 = param0.field_N[var23];
                      var26 = param0.field_E[var23];
                      var27 = (var18 * var26 + var24 * var12 - -(var25 * var15) >> -ai.field_x + 16) + var9;
                      var28 = var10 + (var26 * var19 + var13 * var24 - -(var25 * var16) >> 16 - ai.field_x);
                      var29 = var11 + (var25 * var17 + var24 * var14 - -(var26 * var20) >> 16);
                      stackOut_6_0 = -51;
                      stackOut_6_1 = ~var29;
                      stackIn_67_0 = stackOut_6_0;
                      stackIn_67_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        L6: while (true) {
                          if (stackIn_67_0 >= stackIn_67_1) {
                            break L4;
                          } else {
                            stackOut_68_0 = var18;
                            stackIn_76_0 = stackOut_68_0;
                            stackIn_69_0 = stackOut_68_0;
                            if (var30 != 0) {
                              break L3;
                            } else {
                              stackOut_69_0 = stackIn_69_0;
                              stackIn_71_0 = stackOut_69_0;
                              if (stackIn_71_0 >= wd.field_i.length) {
                                break L4;
                              } else {
                                var19 = param0.field_K[var18];
                                var20 = param0.field_q[var18];
                                var21 = param0.field_p[var18];
                                wd.field_i[var18] = var12 * var20 + (var9 * var19 + var15 * var21) >> 16;
                                lo.field_Ib[var18] = var16 * var21 + var20 * var13 + var19 * var10 >> 16;
                                wn.field_q[var18] = var17 * var21 + var11 * var19 + var14 * var20 >> 16;
                                var18++;
                                if (var30 == 0) {
                                  stackOut_66_0 = ~param0.field_a;
                                  stackOut_66_1 = ~var18;
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          L8: {
                            if (stackIn_7_0 >= stackIn_7_1) {
                              break L8;
                            } else {
                              qe.field_v[var23] = -2147483648;
                              if (var30 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            jp.field_a[var23] = var21 + var27 / var29;
                            al.field_m[var23] = var22 + var28 / var29;
                            qe.field_v[var23] = var29;
                            if (~var29 > ~var7_int) {
                              var7_int = var29;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (var8 < var29) {
                            var8 = var29;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L10: {
                          if (param6) {
                            ih.field_c[var23] = var27 >> ai.field_x;
                            qo.field_w[var23] = var28 >> ai.field_x;
                            ai.field_e[var23] = var29;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (param0.field_w == null) {
                        break L12;
                      } else {
                        if (param0.field_H == null) {
                          break L12;
                        } else {
                          if (param0.field_C == null) {
                            break L12;
                          } else {
                            if (param0.field_v == null) {
                              break L12;
                            } else {
                              if (null == param0.field_P) {
                                break L12;
                              } else {
                                if (param0.field_u == null) {
                                  break L12;
                                } else {
                                  if (param0.field_M == null) {
                                    break L12;
                                  } else {
                                    if (param0.field_y == null) {
                                      break L12;
                                    } else {
                                      if (null != param0.field_R) {
                                        var23 = 0;
                                        L13: while (true) {
                                          if (param0.field_j <= var23) {
                                            break L12;
                                          } else {
                                            var24 = param0.field_w[var23];
                                            var25 = param0.field_H[var23];
                                            var26 = param0.field_C[var23];
                                            h.field_Y[var23] = (var26 * var18 + (var12 * var24 - -(var15 * var25)) >> 16) + var9;
                                            vk.field_ub[var23] = (var26 * var19 + (var24 * var13 + var25 * var16) >> 16) + var10;
                                            gh.field_r[var23] = var11 - -(var26 * var20 + (var14 * var24 + var25 * var17) >> 16);
                                            var24 = param0.field_v[var23];
                                            var25 = param0.field_P[var23];
                                            var26 = param0.field_u[var23];
                                            eg.field_l[var23] = var9 - -(var18 * var26 + (var12 * var24 - -(var25 * var15)) >> 16);
                                            dj.field_b[var23] = var10 + (var16 * var25 + var24 * var13 - -(var19 * var26) >> 16);
                                            kh.field_c[var23] = (var20 * var26 + var14 * var24 - -(var25 * var17) >> 16) + var11;
                                            var24 = param0.field_M[var23];
                                            var25 = param0.field_y[var23];
                                            var26 = param0.field_R[var23];
                                            eg.field_h[var23] = (var24 * var12 - (-(var15 * var25) + -(var26 * var18)) >> 16) + var9;
                                            ip.field_x[var23] = var10 + (var24 * var13 - (-(var16 * var25) + -(var26 * var19)) >> 16);
                                            le.field_b[var23] = (var14 * var24 - (-(var25 * var17) - var26 * var20) >> 16) + var11;
                                            var23++;
                                            if (var30 != 0) {
                                              break L11;
                                            } else {
                                              if (var30 == 0) {
                                                continue L13;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param5) {
                      var9 = param3[3];
                      var10 = param3[4];
                      var11 = param3[5];
                      var12 = param3[6];
                      var13 = param3[7];
                      var14 = param3[8];
                      var15 = param3[9];
                      var16 = param3[10];
                      var17 = param3[11];
                      break L11;
                    } else {
                      break L4;
                    }
                  }
                  var18 = 0;
                  L14: while (true) {
                    stackOut_66_0 = ~param0.field_a;
                    stackOut_66_1 = ~var18;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    if (stackIn_67_0 >= stackIn_67_1) {
                      break L4;
                    } else {
                      stackOut_68_0 = var18;
                      stackIn_76_0 = stackOut_68_0;
                      stackIn_69_0 = stackOut_68_0;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        stackOut_69_0 = stackIn_69_0;
                        stackIn_71_0 = stackOut_69_0;
                        if (stackIn_71_0 >= wd.field_i.length) {
                          break L4;
                        } else {
                          var19 = param0.field_K[var18];
                          var20 = param0.field_q[var18];
                          var21 = param0.field_p[var18];
                          wd.field_i[var18] = var12 * var20 + (var9 * var19 + var15 * var21) >> 16;
                          lo.field_Ib[var18] = var16 * var21 + var20 * var13 + var19 * var10 >> 16;
                          wn.field_q[var18] = var17 * var21 + var11 * var19 + var14 * var20 >> 16;
                          var18++;
                          if (var30 == 0) {
                            continue L14;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_75_0 = var8;
                stackIn_76_0 = stackOut_75_0;
                break L3;
              }
              ca.a(stackIn_76_0, param0, false, var7_int, param2);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var7;
            stackOut_78_1 = new StringBuilder().append("qm.UA(");
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L15;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L15;
            }
          }
          L16: {
            stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',');
            stackIn_85_0 = stackOut_82_0;
            stackIn_85_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param1 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L16;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_86_0 = stackOut_83_0;
              stackIn_86_1 = stackOut_83_1;
              stackIn_86_2 = stackOut_83_2;
              break L16;
            }
          }
          L17: {
            stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
            stackOut_86_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(',').append(param2).append(',');
            stackIn_89_0 = stackOut_86_0;
            stackIn_89_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param3 == null) {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L17;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_90_0 = stackOut_87_0;
              stackIn_90_1 = stackOut_87_1;
              stackIn_90_2 = stackOut_87_2;
              break L17;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_90_0, stackIn_90_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                StringBuilder discarded$2 = ((qm) this).a((StringBuilder) null, false, 27, (Hashtable) null);
                break L1;
              }
            }
            stackOut_3_0 = ((qm) this).field_K;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "qm.JA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, sb param1, int param2, int param3, sb param4, int param5, int param6, int param7, sb param8, int param9, int param10, jl param11, int param12, int param13, jl param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            L1: {
              ie.field_G = param11;
              lm.field_o = param14;
              el.a(param10, param13, param9, 93, param3);
              nb.a(param5, param6, 7, param1);
              mj.a(param2, param4, param0, 300, param12, param8);
              ug.a(param15, param19, -26104);
              k.a(param7, param18, -14129, param16);
              if (param17 >= 105) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var20;
            stackOut_3_1 = new StringBuilder().append("qm.SA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param8 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param11 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param14 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    qm(String param0, eb param1, fn param2) {
        super(param0, param1, param2);
        ((qm) this).field_K = false;
        ((qm) this).field_H = true;
        ((qm) this).field_I = true;
    }

    final void h(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((qm) this).field_K) {
                ((qm) this).field_K = false;
                if (((qm) this).field_n == null) {
                  break L1;
                } else {
                  if (((qm) this).field_n instanceof cc) {
                    ((cc) (Object) ((qm) this).field_n).a((ng) this, param0 ^ 58, ((qm) this).field_K);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 2) {
                break L2;
              } else {
                field_L = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "qm.OA(" + param0 + ')');
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param1 == 3) {
              L1: {
                if (!((qm) this).b(true)) {
                  break L1;
                } else {
                  L2: {
                    if (84 == param0) {
                      break L2;
                    } else {
                      if (83 == param0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((qm) this).a(true, -1, 1, -1);
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("qm.G(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static int[] a(int param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param2 == 7) {
                break L1;
              } else {
                field_F = 18;
                break L1;
              }
            }
            var3_int = mi.d(-4096, param1);
            var4 = th.a(param1, 8191);
            var5 = mi.d(-4096, param0);
            var6 = th.a(param0, 8191);
            var7 = (int)((long)var3_int * (long)var5 >> 16);
            var8 = (int)((long)var3_int * (long)var6 >> 16);
            var9 = (int)((long)var5 * (long)var4 >> 16);
            var10 = (int)((long)var6 * (long)var4 >> 16);
            stackOut_3_0 = new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3_int, var10};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "qm.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public static void j(int param0) {
        try {
            field_J = null;
            field_G = null;
            field_L = null;
            if (param0 < 62) {
                qm.a(8, (sb) null, 42, -55, (sb) null, 28, 88, -93, (sb) null, 77, 108, (jl) null, 5, -44, (jl) null, -125, -73, 115, -35, -117);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qm.RA(" + param0 + ')');
        }
    }

    protected qm() {
        ((qm) this).field_K = false;
        ((qm) this).field_H = true;
        ((qm) this).field_I = true;
        try {
            ((qm) this).field_y = h.field_X.field_s;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qm.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "<%0> wins!";
    }
}
