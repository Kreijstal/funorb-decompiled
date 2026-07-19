/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static int field_e;
    static byte[][] field_f;
    static int[][] field_c;
    static wb field_a;
    static String field_d;
    static int[] field_b;

    final static boolean a(pl param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (!param1) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (param0.b(1, (byte) -116) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("kh.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        String stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var4 >= var2_int) {
                      break L5;
                    } else {
                      var5 = param0.charAt(var4);
                      var10 = var5;
                      var9 = 65;
                      if (var6 != 0) {
                        if (var9 == var10) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          L7: {
                            L8: {
                              if (var9 > var10) {
                                break L8;
                              } else {
                                if (90 >= var5) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              L10: {
                                if (var5 < 97) {
                                  break L10;
                                } else {
                                  if (var5 <= 122) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var5 < 48) {
                                  break L11;
                                } else {
                                  if (57 >= var5) {
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var3[var4] = (char)95;
                              if (var6 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                            var3[var4] = (char)var5;
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                          var3[var4] = (char)(97 + (-65 + var5));
                          break L6;
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param1 == 1457) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                stackOut_25_0 = (String) null;
                stackIn_26_0 = stackOut_25_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
              stackOut_27_0 = new String(var8);
              stackIn_28_0 = stackOut_27_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("kh.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0;
        } else {
          return stackIn_28_0;
        }
    }

    final static void a(boolean param0) {
        lr.a(true, bi.field_d, (byte) 122, in.field_C);
        if (param0) {
            field_c = (int[][]) null;
            ih.field_c = true;
            return;
        }
        ih.field_c = true;
    }

    public static void a(int param0) {
        boolean discarded$2 = false;
        pl var2 = null;
        field_b = null;
        if (param0 != 2) {
          var2 = (pl) null;
          discarded$2 = kh.a((pl) null, true);
          field_c = (int[][]) null;
          field_a = null;
          field_f = (byte[][]) null;
          field_d = null;
          return;
        } else {
          field_c = (int[][]) null;
          field_a = null;
          field_f = (byte[][]) null;
          field_d = null;
          return;
        }
    }

    static {
        field_f = new byte[1000][];
        field_b = new int[2];
    }
}
