/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static int[][] field_a;
    static boolean field_b;

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_3_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == 13) {
              var2_int = param1.length();
              var9 = new char[var2_int];
              var8 = var9;
              var3 = var8;
              var4 = 2;
              var5 = 0;
              L1: while (true) {
                if (var2_int <= var5) {
                  stackIn_26_0 = new String(var9);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var6 = param1.charAt(var5);
                    if (var4 == 0) {
                      var6 = Character.toLowerCase((char) var6);
                      break L2;
                    } else {
                      if (var4 == 2) {
                        var6 = hc.a(98, (char) var6);
                        break L2;
                      } else {
                        if (!Character.isUpperCase((char) var6)) {
                          break L2;
                        } else {
                          var6 = hc.a(98, (char) var6);
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (!Character.isLetter((char) var6)) {
                      L4: {
                        if (var6 == 46) {
                          break L4;
                        } else {
                          if (var6 == 63) {
                            break L4;
                          } else {
                            if (33 == var6) {
                              break L4;
                            } else {
                              if (Character.isSpaceChar((char) var6)) {
                                if ((var4 ^ -1) != -3) {
                                  var4 = 1;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              } else {
                                var4 = 1;
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      var4 = 2;
                      break L3;
                    } else {
                      var4 = 0;
                      break L3;
                    }
                  }
                  var3[var5] = (char)var6;
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("ve.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_26_0;
        }
    }

    public static void a(int param0) {
        field_a = (int[][]) null;
        if (param0 != 1) {
            field_a = (int[][]) null;
        }
    }

    static {
        field_a = new int[][]{new int[]{0, 0, 0, 0, 2, 4, 32768, 512, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 8, 16, 16512, 128, 32, 16400, 16416, 32768, 1, 1, 2, 2, 2, 2, 4, 4, 16392, 8, 256, 256, 16392, 16, 128, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 8, 16, 16512, 128, 32, 16400, 16416, 32768, 1, 1, 2, 2, 2, 2, 4, 4, 16392, 8, 256, 256, 16392, 16, 128, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 1, 2, 4, 504, 16384, 16384, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{64, 8, 64, 8, 8, 64, 16, 16, 16, 16, 16, 16, 16, 128, 8, 2048, 32, 504, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 1, 1, 256, 128, 8, 1, 64, 64, 32, 32, 8192, 8192, 2048, 8, 1024, 1024, 1024, 1024, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 2048, 2048, 64, 8, 512, 512, 512, 512, 512, 512, 512, 512, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    }
}
