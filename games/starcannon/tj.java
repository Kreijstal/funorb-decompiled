/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tj extends kf {
    static String field_y;
    static int field_C;
    private int field_E;
    private int field_x;
    private int field_z;
    static int field_w;
    private boolean field_D;
    private int field_A;
    private boolean field_B;
    static int field_G;

    private tj(int param0, int param1, int param2, int param3, de param4, qg param5, uj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((tj) this).field_E = 2147483647;
        ((tj) this).field_z = 2147483647;
        try {
            ((tj) this).field_B = param8 ? true : false;
            ((tj) this).field_t = param6;
            ((tj) this).field_D = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "tj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
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
                if (((tj) this).field_B) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!((tj) this).a(param3, param2, param1, param5, -12790)) {
              stackOut_8_0 = var8_int;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } else {
              L2: {
                if (1 != param6) {
                  break L2;
                } else {
                  il.field_k = (tj) this;
                  ((tj) this).field_A = param5 - (((tj) this).field_s + param2);
                  ((tj) this).field_x = param1 + -((tj) this).field_j + -param3;
                  break L2;
                }
              }
              ((tj) this).field_l = param6;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("tj.G(");
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
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((tj) this).field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "tj.OA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static int a(int param0, int param1, re param2, vc param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (null == param3.field_o) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param2.field_n == param3.field_i) {
                      var4_int = param2.field_o.length;
                      var5 = param3.field_o[param0].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var5 <= var6) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          L3: {
                            if (~param2.field_k != ~param3.field_g[param0][var6]) {
                              break L3;
                            } else {
                              int discarded$1 = 0;
                              if (mc.a(param3.field_n[param0][var6])) {
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= var4_int) {
                                    stackOut_17_0 = var6;
                                    stackIn_18_0 = stackOut_17_0;
                                    return stackIn_18_0;
                                  } else {
                                    if (param2.field_o[var7] != param3.field_o[param0][var4_int * var6 + var7]) {
                                      break L3;
                                    } else {
                                      var7++;
                                      continue L4;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("tj.D(").append(param0).append(44).append(-1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          L6: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return stackIn_23_0;
    }

    final static void a(byte param0, dg param1) {
        ia var3 = null;
        int var4 = 0;
        try {
            var3 = d.field_b;
            var3.d((byte) 100, 5);
            var3.field_g = var3.field_g + 1;
            var4 = var3.field_g;
            var3.a(1, -70);
            var3.a(param1.field_k, -57);
            var3.d(5918, param1.field_f);
            var3.c((byte) -97, param1.field_h);
            var3.c((byte) -109, param1.field_m);
            var3.c((byte) -89, param1.field_g);
            var3.c((byte) -88, param1.field_i);
            int discarded$0 = var3.b((byte) -128, var4);
            var3.b(var3.field_g - var4, 31700);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "tj.B(" + 69 + 44 + (param1 != null ? "{...}" : "null") + 44 + 5 + 41);
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((tj) this).field_t instanceof dk)) {
                    break L3;
                  } else {
                    if (!((dk) (Object) ((tj) this).field_t).field_u) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((tj) this).field_l != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -((tj) this).field_A + (pe.field_d - param1);
                    var6 = -param3 + (la.field_c + -((tj) this).field_x);
                    if (var5_int != ((tj) this).field_s) {
                      break L4;
                    } else {
                      if (var6 == ((tj) this).field_j) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((tj) this).field_j = var6;
                  ((tj) this).field_s = var5_int;
                  if (!(((tj) this).field_g instanceof wb)) {
                    break L1;
                  } else {
                    ((wb) (Object) ((tj) this).field_g).a((tj) this, (byte) 117, param1, param3);
                    break L1;
                  }
                }
              }
              if (!((tj) this).field_D) {
                break L1;
              } else {
                L5: {
                  if (((tj) this).field_s != ((tj) this).field_z) {
                    L6: {
                      var5_int = -((tj) this).field_s + ((tj) this).field_z;
                      stackOut_13_0 = this;
                      stackOut_13_1 = ((tj) this).field_s;
                      stackIn_17_0 = stackOut_13_0;
                      stackIn_17_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (2 < Math.abs(var5_int)) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = var5_int >> 1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L6;
                      } else {
                        stackOut_14_0 = this;
                        stackOut_14_1 = stackIn_14_1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var5_int > 0) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_18_2 = stackOut_16_2;
                          break L6;
                        } else {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = -1;
                          stackIn_18_0 = stackOut_15_0;
                          stackIn_18_1 = stackOut_15_1;
                          stackIn_18_2 = stackOut_15_2;
                          break L6;
                        }
                      }
                    }
                    ((tj) this).field_s = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((tj) this).field_E != ((tj) this).field_j) {
                  L7: {
                    var5_int = -((tj) this).field_j + ((tj) this).field_E;
                    stackOut_21_0 = this;
                    stackOut_21_1 = ((tj) this).field_j;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    if (Math.abs(var5_int) <= 2) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (var5_int > 0) {
                        stackOut_25_0 = this;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        break L7;
                      } else {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = -1;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        break L7;
                      }
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = var5_int >> 1;
                      stackIn_26_0 = stackOut_22_0;
                      stackIn_26_1 = stackOut_22_1;
                      stackIn_26_2 = stackOut_22_2;
                      break L7;
                    }
                  }
                  ((tj) this).field_j = stackIn_26_1 + stackIn_26_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 >= 27) {
              super.a(98, param1, param2, param3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("tj.U(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param3 + 41);
        }
    }

    final static id[] h() {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        id[] var1 = new id[bj.field_b];
        for (var2 = 0; var2 < bj.field_b; var2++) {
            var1[var2] = new id(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], og.field_c[var2], of.field_g);
        }
        var2 = 22;
        rc.b((byte) 123);
        return var1;
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 >= -113) {
            tj.g(104);
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ni.a(127, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (dk.a((byte) -121, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (dk.a((byte) -127, var4.charAt(var4.length() + -1))) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (0 < var5) {
                                      stackOut_30_0 = 0;
                                      stackIn_31_0 = stackOut_30_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (dk.a((byte) -122, (char) var7)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_25_0 = 0;
                                      stackIn_26_0 = stackOut_25_0;
                                      return stackIn_26_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("tj.A(").append(-79).append(44).append(0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_31_0 != 0;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
              if (!((tj) this).a(param0, 0, param1, param3)) {
                break L1;
              } else {
                ((tj) this).a(param0, param1, param3, 19103);
                ((tj) this).a(param0, param3, -349, param1);
                StringBuilder discarded$26 = param1.append(" revert=").append(((tj) this).field_D);
                if (2147483647 == ((tj) this).field_z) {
                  break L1;
                } else {
                  if (((tj) this).field_E == 2147483647) {
                    break L1;
                  } else {
                    StringBuilder discarded$27 = param1.append(" to ").append(((tj) this).field_z).append(44).append(((tj) this).field_E);
                    break L1;
                  }
                }
              }
            }
            if (param2 == 39) {
              stackOut_7_0 = (StringBuilder) param1;
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
            stackOut_9_1 = new StringBuilder().append("tj.SA(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_8_0;
    }

    final void f(int param0) {
        super.f(-77);
        ((tj) this).field_t.a(0, ((tj) this).field_i, (byte) 122, ((tj) this).field_f, 0);
        ((tj) this).field_E = ((tj) this).field_j;
        ((tj) this).field_z = ((tj) this).field_s;
        int var2 = 98 / ((47 - param0) / 52);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Password: ";
    }
}
