/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj {
    static String field_d;
    private eb field_a;
    static int[] field_l;
    boolean field_e;
    db field_h;
    static boolean field_g;
    int field_i;
    int field_b;
    cd field_f;
    static String[] field_c;
    String field_k;
    static int[] field_j;

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var6 = qg.field_b;
            var1 = var6;
            var2 = 0;
            var4 = -47;
            var3 = var6.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var6[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var6[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var6[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var6[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var6[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var6[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var6[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var6[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1_ref, "oj.C(" + 102 + ')');
        }
    }

    final static sh a(boolean param0, int param1) {
        return il.a(true, 12317, false, param1, false, 1);
    }

    final void a(fc param0, int param1, char[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ((oj) this).field_a.a(param2, param0.field_I, true, 256);
              if (param1 == 0) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oj.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void a(int[] param0, boolean param1, char[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param2.length;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= var4_int) {
                if (!param1) {
                  var20 = new int[var4_int];
                  var18 = var20;
                  var16 = var18;
                  var14 = var16;
                  var5 = var14;
                  var6 = 0;
                  L2: while (true) {
                    if (var4_int <= var6) {
                      dd.a(var20, -23588);
                      var21 = var5;
                      var7 = 0;
                      L3: while (true) {
                        if (var7 >= var21.length) {
                          break L0;
                        } else {
                          L4: {
                            var8 = var21[var7];
                            var9 = (short)var8;
                            if (param0[var9] <= 0) {
                              break L4;
                            } else {
                              var10 = -(var8 >> 16);
                              var11 = 1 + var9;
                              L5: while (true) {
                                if (var10 + var9 <= var11) {
                                  var13 = 0;
                                  var11 = var13;
                                  L6: while (true) {
                                    if (var9 <= var13) {
                                      break L4;
                                    } else {
                                      L7: {
                                        if (var9 >= param0[var13] + var13) {
                                          break L7;
                                        } else {
                                          param0[var13] = 0;
                                          break L7;
                                        }
                                      }
                                      var13++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  param0[var11] = 0;
                                  var11++;
                                  continue L5;
                                }
                              }
                            }
                          }
                          var7++;
                          continue L3;
                        }
                      }
                    } else {
                      var5[var6] = (-param0[var6] << 16) - -var6;
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                param0[var5_int] = ((oj) this).field_a.a(param2, (byte) 106, var5_int);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("oj.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        field_l = null;
        field_j = null;
    }

    final ng a(char[][] param0, int param1) {
        RuntimeException var3 = null;
        ng var3_ref = null;
        int[] var4 = null;
        int var5_int = 0;
        char[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        ng var11 = null;
        int var12 = 0;
        int[] var13 = null;
        char[] var15 = null;
        int[] var16 = null;
        char[] var18 = null;
        int[] var19 = null;
        char[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        char[] var24 = null;
        ng stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var11 = new ng();
            var3_ref = var11;
            var22 = new int[param0[0].length];
            var19 = var22;
            var16 = var19;
            var13 = var16;
            var10 = var13;
            var4 = var10;
            var5_int = 0;
            L1: while (true) {
              if (param0.length <= var5_int) {
                var23 = new int[param0.length];
                var24 = new char[param0.length];
                var21 = var24;
                var18 = var21;
                var15 = var18;
                var5 = var15;
                var6 = 0;
                L2: while (true) {
                  if (param0[0].length <= var6) {
                    L3: {
                      if (param1 == 17161) {
                        break L3;
                      } else {
                        var9 = null;
                        this.a((int[]) null, true, (char[]) null);
                        break L3;
                      }
                    }
                    stackOut_23_0 = (ng) var3_ref;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    var7 = 0;
                    L4: while (true) {
                      if (param0.length <= var7) {
                        this.a(var23, false, var24);
                        var12 = 0;
                        var7 = var12;
                        L5: while (true) {
                          if (var12 >= var24.length) {
                            var6++;
                            continue L2;
                          } else {
                            L6: {
                              if (0 == var23[var12]) {
                                break L6;
                              } else {
                                var3_ref.b(param1 + -17053, (kd) (Object) pc.a(-var12 + param0.length + -1, 1, (byte) 14, var6, var23[var12]));
                                break L6;
                              }
                            }
                            var12++;
                            continue L5;
                          }
                        }
                      } else {
                        var5[var7] = param0[param0.length - 1 + -var7][var6];
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                this.a(var22, false, param0[var5_int]);
                var6 = 0;
                L7: while (true) {
                  if (var22.length <= var6) {
                    var5_int++;
                    continue L1;
                  } else {
                    L8: {
                      if (var22[var6] != 0) {
                        var11.b(121, (kd) (Object) pc.a(var5_int, var22[var6], (byte) 14, var6, 1));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var6++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("oj.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    oj(sh param0, sh param1, eb param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        NumberFormatException var9 = null;
        String var10 = null;
        String var12 = null;
        CharSequence var13 = null;
        int stackIn_11_0 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        cd stackIn_21_1 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        cd stackOut_20_1 = null;
        Object stackOut_19_0 = null;
        cd stackOut_19_1 = null;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            ((oj) this).field_a = param2;
            ((oj) this).field_i = param2.field_g;
            var4_int = 0;
            var5 = null;
            var6 = null;
            var7 = null;
            var8 = 0;
            L1: while (true) {
              if (var8 >= param2.field_c.length) {
                L2: {
                  stackOut_15_0 = this;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var4_int == 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L2;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L2;
                  }
                }
                L3: {
                  ((oj) this).field_e = stackIn_18_1 != 0;
                  ((oj) this).field_k = (String) var5;
                  var13 = (CharSequence) (Object) ("flag_" + (String) var5);
                  ((oj) this).field_h = df.a("", ef.a(var13, (byte) -14), param0, (byte) -92);
                  stackOut_18_0 = this;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var6 == null) {
                    stackOut_20_0 = this;
                    stackOut_20_1 = bi.field_a;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L3;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = hb.a(param1, 246, "", ef.a((CharSequence) var6, (byte) -82), param0);
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L3;
                  }
                }
                L4: {
                  ((oj) this).field_f = stackIn_21_1;
                  var8 = -1;
                  if (var7 != null) {
                    try {
                      L5: {
                        var8 = si.a((byte) 115, (CharSequence) var7);
                        break L5;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var9 = (NumberFormatException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  stackOut_26_0 = this;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (-1 == var8) {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (var6 != null) {
                      stackOut_30_0 = this;
                      stackOut_30_1 = ((oj) this).field_f.field_E;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L7;
                    } else {
                      stackOut_29_0 = this;
                      stackOut_29_1 = pa.field_d;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      break L7;
                    }
                  } else {
                    stackOut_27_0 = this;
                    stackOut_27_1 = var8;
                    stackIn_31_0 = stackOut_27_0;
                    stackIn_31_1 = stackOut_27_1;
                    break L7;
                  }
                }
                ((oj) this).field_b = stackIn_31_1;
                break L0;
              } else {
                L8: {
                  var12 = param2.field_c[var8][0];
                  var10 = param2.field_c[var8][1];
                  if ("lang".equals((Object) (Object) var12)) {
                    var5 = (Object) (Object) var10;
                    break L8;
                  } else {
                    if ("font".equals((Object) (Object) var12)) {
                      var6 = (Object) (Object) var10;
                      break L8;
                    } else {
                      if (!"fhei".equals((Object) (Object) var12)) {
                        if (!"disabled".equals((Object) (Object) var12)) {
                          break L8;
                        } else {
                          L9: {
                            if (!var10.equals((Object) (Object) "true")) {
                              stackOut_10_0 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              break L9;
                            } else {
                              stackOut_9_0 = 1;
                              stackIn_11_0 = stackOut_9_0;
                              break L9;
                            }
                          }
                          var4_int = stackIn_11_0;
                          break L8;
                        }
                      } else {
                        var7 = (Object) (Object) var10;
                        break L8;
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var4;
            stackOut_33_1 = new StringBuilder().append("oj.<init>(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          L11: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L11;
            }
          }
          L12: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Use the \"Next\" box to plan ahead.", "In \"Standard\" mode the speed at which blocks rotate and move horizontally increases, up until level 4.", "In \"Delicate\" mode the speed increases until level 8, making control of the blocks more difficult – but enabling you to react faster.", "Note that the only way to clear tiles is to make words with them."};
        field_d = "You have 1 unread message!";
    }
}
