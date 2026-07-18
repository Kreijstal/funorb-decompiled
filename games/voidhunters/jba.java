/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jba implements wwa {
    private int field_i;
    private int field_a;
    private int field_f;
    private no field_g;
    private int field_d;
    static llb field_b;
    private int field_c;
    static llb field_h;
    private int field_e;

    final static wfb a(int[][] param0, long param1, int param2, Random param3, int param4, long param5) {
        Object var8 = null;
        int var9_int = 0;
        int[][] var9 = null;
        int var10 = 0;
        Object var10_ref = null;
        int var11_int = 0;
        Random var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Random var15 = null;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[][] var23 = null;
        wfb var24 = null;
        int[] var25 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int[][] var28 = null;
        int[] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        wfb stackIn_32_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        Object stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        wfb stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        Object stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var8 = null;
              if (param0 != null) {
                var20 = param0[0];
                var22 = var20;
                var8 = (Object) (Object) var22;
                var9_int = 0;
                L2: while (true) {
                  if (var9_int >= var20.length / 2) {
                    var9_int = 0;
                    L3: while (true) {
                      if (var9_int >= var22.length) {
                        var30 = new int[-1 + param0.length][];
                        var28 = var30;
                        var26 = var28;
                        var23 = var26;
                        var21 = var23;
                        var9 = var21;
                        var10 = 0;
                        L4: while (true) {
                          if (var30.length <= var10) {
                            param0 = var9;
                            break L1;
                          } else {
                            var21[var10] = param0[1 + var10];
                            var10++;
                            continue L4;
                          }
                        }
                      } else {
                        ((int[]) var8)[var9_int] = ((int[]) var8)[var9_int] >> 4;
                        var9_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var10 = var20[var9_int];
                    var11_int = var20[1 + var9_int];
                    var12 = var20.length - (2 - -var9_int);
                    var13 = var20[var12];
                    var14 = var20[var12 + 1];
                    var20[var9_int] = var13;
                    var20[1 + var9_int] = var14;
                    var20[var12] = var10;
                    var20[var12 - -1] = var11_int;
                    var9_int += 2;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (var8 == null) {
                var8 = (Object) (Object) tka.a(param1, (byte) 55, param5, param2, param3);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var24 = new wfb((int[]) var8, 0, 0);
              var24.a(4, 102, false);
              if (param0 == null) {
                var24.field_w = new int[3][];
                var10_ref = var8;
                var11 = new Random((long)((int[]) var8)[0]);
                var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> 1) << 3;
                var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> 1) << 3;
                var14 = 0;
                L7: while (true) {
                  if (3 <= var14) {
                    break L6;
                  } else {
                    var15 = new Random((long)((int[]) var10_ref)[1]);
                    var31 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                    var29 = var31;
                    var27 = var29;
                    var25 = var27;
                    var16 = var25;
                    var17 = 0;
                    L8: while (true) {
                      if (var17 >= var31.length) {
                        var17 = 0;
                        L9: while (true) {
                          if (var17 >= var31.length) {
                            var24.field_w[var14] = var31;
                            var10_ref = (Object) (Object) var16;
                            var14++;
                            continue L7;
                          } else {
                            var16[var17] = var16[var17] + var12 * (var14 - -1);
                            var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                            var18 = 0;
                            L10: while (true) {
                              L11: {
                                if (var18 >= 100) {
                                  break L11;
                                } else {
                                  if (fra.a((int[]) var10_ref, var16[var17 + 1], 2, var31[var17])) {
                                    break L11;
                                  } else {
                                    var16[var17] = var31[var17] * 200 >> 8;
                                    var16[1 + var17] = var16[var17 - -1] * 200 >> 8;
                                    var18++;
                                    continue L10;
                                  }
                                }
                              }
                              var17 += 2;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        var16[var17] = var16[var17] << 4;
                        var17++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                var24.field_w = param0;
                break L6;
              }
            }
            var24.field_m = true;
            var24.field_k = false;
            var10 = 71 / ((param4 - 45) / 63);
            var24.a(121, 8);
            var24.field_B = 16;
            var24.field_r = true;
            stackOut_31_0 = (wfb) var24;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = (Object) (Object) decompiledCaughtException;
            stackOut_33_0 = var8;
            stackOut_33_1 = new StringBuilder().append("jba.C(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          L13: {
            stackOut_36_0 = stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_32_0;
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        v var13 = null;
        shb stackIn_4_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        shb stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof v)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (shb) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (shb) param1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (v) (Object) stackIn_4_0;
              dma.d(param2 + param1.field_g, param1.field_r + param3, param1.field_h, param1.field_f, ((jba) this).field_e);
              if (var13 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = param1.field_h - var13.field_C * 2;
            var8 = var13.field_C + (param1.field_g + param2);
            var9 = var13.field_F + (param1.field_r + param3);
            dma.a(var8, var9, var8 + var7, var9, ((jba) this).field_f);
            var10 = var13.a(0) - 1;
            var11 = 112 / ((-27 - param0) / 35);
            L3: while (true) {
              if (0 > var10) {
                L4: {
                  if (null != ((jba) this).field_g) {
                    ((jba) this).field_g.a(var13.field_j, var7 / 2 + var8, var13.field_F + (((jba) this).field_g.field_H + var9), ((jba) this).field_a, ((jba) this).field_i);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                dma.f(var8 + var7 * var13.a(-115, var10) / var13.e(-111), var9, ((jba) this).field_c, ((jba) this).field_d);
                var10--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("jba.A(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_b = null;
    }

    jba(no param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((jba) this).field_e = param4;
            ((jba) this).field_g = param0;
            ((jba) this).field_c = param5;
            ((jba) this).field_f = param3;
            ((jba) this).field_i = param2;
            ((jba) this).field_d = param6;
            ((jba) this).field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
