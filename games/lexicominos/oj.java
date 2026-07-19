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
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
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
            var4 = -47 / ((param0 - 44) / 52);
            var3 = var6.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var6[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var6[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var6[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var6[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var6[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var6[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var6[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var6[incrementValue$47] = 0;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "oj.C(" + param0 + ')');
        }
    }

    final static sh a(boolean param0, int param1) {
        sh discarded$2 = null;
        if (param0) {
          discarded$2 = oj.a(false, 68);
          return il.a(true, 12317, false, param1, false, 1);
        } else {
          return il.a(true, 12317, false, param1, false, 1);
        }
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
              this.field_a.a(param2, param0.field_I, true, 256);
              if (param1 == 0) {
                break L1;
              } else {
                field_j = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("oj.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        int[] var13 = null;
        int[] var15 = null;
        int[] var18 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param2.length;
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (var5_int >= var4_int) {
                  if (!param1) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  param0[var5_int] = this.field_a.a(param2, (byte) 106, var5_int);
                  var5_int++;
                  if (var12 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              var15 = new int[var4_int];
              var13 = var15;
              var5 = var13;
              var6 = 0;
              L3: while (true) {
                L4: {
                  if (var4_int <= var6) {
                    dd.a(var15, -23588);
                    break L4;
                  } else {
                    var5[var6] = (-param0[var6] << 108662480) - -var6;
                    var6++;
                    if (var12 != 0) {
                      break L4;
                    } else {
                      continue L3;
                    }
                  }
                }
                var18 = var5;
                var7 = 0;
                L5: while (true) {
                  stackOut_15_0 = var7;
                  stackOut_15_1 = var18.length;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  L6: while (true) {
                    L7: {
                      if (stackIn_16_0 >= stackIn_16_1) {
                        break L7;
                      } else {
                        var8 = var18[var7];
                        var9 = (short)var8;
                        if (var12 == 0) {
                          L8: {
                            if (-1 <= (param0[var9] ^ -1)) {
                              break L8;
                            } else {
                              var10 = -(var8 >> -1246102960);
                              var11 = 1 + var9;
                              L9: while (true) {
                                L10: {
                                  if (var10 + var9 <= var11) {
                                    var11 = 0;
                                    break L10;
                                  } else {
                                    param0[var11] = 0;
                                    var11++;
                                    if (var12 != 0) {
                                      break L10;
                                    } else {
                                      continue L9;
                                    }
                                  }
                                }
                                if (var9 <= var11) {
                                  break L8;
                                } else {
                                  stackOut_27_0 = var9;
                                  stackOut_27_1 = param0[var11] + var11;
                                  stackIn_16_0 = stackOut_27_0;
                                  stackIn_16_1 = stackOut_27_1;
                                  continue L6;
                                }
                              }
                            }
                          }
                          var7++;
                          if (var12 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var4);
            stackOut_31_1 = new StringBuilder().append("oj.E(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        sh discarded$2 = null;
        field_c = null;
        if (param0 != -26) {
          discarded$2 = oj.a(false, -114);
          field_d = null;
          field_l = null;
          field_j = null;
          return;
        } else {
          field_d = null;
          field_l = null;
          field_j = null;
          return;
        }
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
        char[] var9 = null;
        int[] var10 = null;
        ng var11 = null;
        int[] var12 = null;
        char[] var13 = null;
        int[] var14 = null;
        char[] var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        ng stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_28_0 = 0;
        ng stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var11 = new ng();
            var3_ref = var11;
            var14 = new int[param0[0].length];
            var12 = var14;
            var10 = var12;
            var4 = var10;
            var5_int = 0;
            L1: while (true) {
              stackOut_2_0 = param0.length;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= var5_int) {
                      break L4;
                    } else {
                      this.a(var14, false, param0[var5_int]);
                      stackOut_4_0 = 0;
                      stackIn_14_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        var6 = stackIn_5_0;
                        L5: while (true) {
                          L6: {
                            if (var14.length <= var6) {
                              break L6;
                            } else {
                              stackOut_7_0 = var14[var6];
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var8 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  if (stackIn_8_0 != 0) {
                                    var11.b(121, pc.a(var5_int, var14[var6], (byte) 14, var6, 1));
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var6++;
                                if (var8 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5_int++;
                          if (var8 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = new int[param0.length];
                  stackOut_13_0 = param0.length;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                }
                var15 = new char[stackIn_14_0];
                var13 = var15;
                var5 = var13;
                var6 = 0;
                L8: while (true) {
                  stackOut_15_0 = param0[0].length;
                  stackOut_15_1 = var6;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if (stackIn_16_0 <= stackIn_16_1) {
                          break L11;
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_29_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var8 != 0) {
                            break L10;
                          } else {
                            var7 = stackIn_18_0;
                            L12: while (true) {
                              L13: {
                                L14: {
                                  if (param0.length <= var7) {
                                    break L14;
                                  } else {
                                    var5[var7] = param0[param0.length - 1 + -var7][var6];
                                    var7++;
                                    if (var8 != 0) {
                                      break L13;
                                    } else {
                                      if (var8 == 0) {
                                        continue L12;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                this.a(var4, false, var15);
                                break L13;
                              }
                              var7 = 0;
                              if (var7 >= var15.length) {
                                var6++;
                                if (var8 == 0) {
                                  continue L8;
                                } else {
                                  break L11;
                                }
                              } else {
                                stackOut_25_0 = 0;
                                stackOut_25_1 = var4[var7];
                                stackIn_16_0 = stackOut_25_0;
                                stackIn_16_1 = stackOut_25_1;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      stackOut_28_0 = param1;
                      stackIn_29_0 = stackOut_28_0;
                      break L10;
                    }
                    L15: {
                      if (stackIn_29_0 == 17161) {
                        break L15;
                      } else {
                        var9 = (char[]) null;
                        this.a((int[]) null, true, (char[]) null);
                        break L15;
                      }
                    }
                    stackOut_31_0 = (ng) (var3_ref);
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("oj.B(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L16;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L16;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        return stackIn_32_0;
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
        int var11 = 0;
        String var12 = null;
        CharSequence var13 = null;
        boolean stackIn_4_0 = false;
        int stackIn_12_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        cd stackIn_22_1 = null;
        int stackIn_23_0 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        Throwable decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        cd stackOut_21_1 = null;
        Object stackOut_20_0 = null;
        cd stackOut_20_1 = null;
        int stackOut_22_0 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_a = param2;
            this.field_i = param2.field_g;
            var4_int = 0;
            var5 = null;
            var6 = null;
            var7 = null;
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 >= param2.field_c.length) {
                    break L3;
                  } else {
                    var12 = param2.field_c[var8][0];
                    var10 = param2.field_c[var8][1];
                    stackOut_3_0 = "lang".equals(var12);
                    stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0) {
                            break L5;
                          } else {
                            L6: {
                              if ("font".equals(var12)) {
                                break L6;
                              } else {
                                L7: {
                                  if (!"fhei".equals(var12)) {
                                    break L7;
                                  } else {
                                    var7 = var10;
                                    if (var11 == 0) {
                                      break L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                if (!"disabled".equals(var12)) {
                                  break L4;
                                } else {
                                  L8: {
                                    if (!var10.equals("true")) {
                                      stackOut_11_0 = 0;
                                      stackIn_12_0 = stackOut_11_0;
                                      break L8;
                                    } else {
                                      stackOut_10_0 = 1;
                                      stackIn_12_0 = stackOut_10_0;
                                      break L8;
                                    }
                                  }
                                  var4_int = stackIn_12_0;
                                  if (var11 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var6 = var10;
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5 = var10;
                        break L4;
                      }
                      var8++;
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L9: {
                  stackOut_16_0 = this;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (var4_int == 0) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L9;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L9;
                  }
                }
                L10: {
                  ((oj) (this)).field_e = stackIn_19_1 != 0;
                  this.field_k = (String) (var5);
                  var13 = (CharSequence) ((Object) ("flag_" + (String) (var5)));
                  this.field_h = df.a("", ef.a(var13, (byte) -14), param0, (byte) -92);
                  stackOut_19_0 = this;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (var6 == null) {
                    stackOut_21_0 = this;
                    stackOut_21_1 = bi.field_a;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L10;
                  } else {
                    stackOut_20_0 = this;
                    stackOut_20_1 = hb.a(param1, 246, "", ef.a((CharSequence) (var6), (byte) -82), param0);
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L10;
                  }
                }
                ((oj) (this)).field_f = stackIn_22_1;
                stackOut_22_0 = -1;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              }
              L11: {
                var8 = stackIn_23_0;
                if (var7 != null) {
                  try {
                    L12: {
                      var8 = si.a((byte) 115, (CharSequence) (var7));
                      break L12;
                    }
                  } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var9 = (NumberFormatException) (Object) decompiledCaughtException;
                      break L13;
                    }
                  }
                  break L11;
                } else {
                  break L11;
                }
              }
              L14: {
                stackOut_28_0 = this;
                stackIn_30_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (-1 == var8) {
                  stackOut_30_0 = this;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (var6 != null) {
                    stackOut_32_0 = this;
                    stackOut_32_1 = this.field_f.field_E;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L14;
                  } else {
                    stackOut_31_0 = this;
                    stackOut_31_1 = pa.field_d;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L14;
                  }
                } else {
                  stackOut_29_0 = this;
                  stackOut_29_1 = var8;
                  stackIn_33_0 = stackOut_29_0;
                  stackIn_33_1 = stackOut_29_1;
                  break L14;
                }
              }
              ((oj) (this)).field_b = stackIn_33_1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var4);
            stackOut_35_1 = new StringBuilder().append("oj.<init>(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L15;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L15;
            }
          }
          L16: {
            stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L16;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L16;
            }
          }
          L17: {
            stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L17;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L17;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    static {
        field_c = new String[]{"Use the \"Next\" box to plan ahead.", "In \"Standard\" mode the speed at which blocks rotate and move horizontally increases, up until level 4.", "In \"Delicate\" mode the speed increases until level 8, making control of the blocks more difficult – but enabling you to react faster.", "Note that the only way to clear tiles is to make words with them."};
        field_d = "You have 1 unread message!";
    }
}
