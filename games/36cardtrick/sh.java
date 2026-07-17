/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends mh {
    static byte[] field_j;
    static String field_f;
    static ff field_k;
    static qi field_i;
    static int[] field_l;
    static qj field_e;
    static qk field_g;
    static String field_h;

    public static void a(int param0) {
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_h = null;
        field_e = null;
    }

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = Main.field_T;
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
            L2: {
              if (param1 == -128) {
                break L2;
              } else {
                var7 = null;
                String discarded$2 = sh.a((CharSequence) null, (byte) 31);
                break L2;
              }
            }
            var11 = new char[var2_int];
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var3 = var8;
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackOut_23_0 = new String(var11);
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param0.charAt(var4);
                    if (65 > var5) {
                      break L5;
                    } else {
                      if (var5 > 90) {
                        break L5;
                      } else {
                        var3[var4] = (char)(-65 + var5 + 97);
                        var4++;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (48 > var5) {
                        break L8;
                      } else {
                        if (var5 <= 57) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("sh.F(");
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
          throw ma.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 41);
        }
        return stackIn_24_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new byte[65536];
        og.a(field_j, 0, 65536, (byte) -128);
        field_f = "More suggestions";
        field_k = null;
        field_h = "Return to game";
    }
}
