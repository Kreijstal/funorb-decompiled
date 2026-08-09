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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("kh.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_22_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
              if (var4 >= var2_int) {
                if (param1 == 1457) {
                  stackIn_24_0 = new String(var8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_22_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  L4: {
                    var5 = param0.charAt(var4);
                    if (65 > var5) {
                      break L4;
                    } else {
                      if (90 >= var5) {
                        var3[var4] = (char)(97 + (-65 + var5));
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (57 >= var5) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("kh.C(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0;
        } else {
          return stackIn_24_0;
        }
    }

    final static void a(boolean param0) {
        lr.a(true, bi.field_d, (byte) 122, in.field_C);
        if (param0) {
            field_c = (int[][]) null;
        }
        ih.field_c = true;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 2) {
            pl var2 = (pl) null;
            kh.a((pl) null, true);
        }
        field_c = (int[][]) null;
        field_a = null;
        field_f = (byte[][]) null;
        field_d = null;
    }

    static {
        field_f = new byte[1000][];
        field_b = new int[2];
    }
}
