/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ip {
    static int[][] field_a;
    static ll[] field_c;
    static int[] field_b;

    final static String a(byte param0, CharSequence param1) {
        String discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (20 < var2_int) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = new char[var2_int];
              var8 = var9;
              var3 = var8;
              if (param0 == -81) {
                break L2;
              } else {
                var7 = (CharSequence) null;
                discarded$2 = ip.a((byte) -114, (CharSequence) null);
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackOut_22_0 = new String(var9);
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (65 > var5) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(-65 + (var5 - -97));
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (122 >= var5) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 <= 57) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
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
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("ip.E(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    abstract int b(int param0, int param1);

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -3) {
          field_c = (ll[]) null;
          field_c = null;
          field_a = (int[][]) null;
          return;
        } else {
          field_c = null;
          field_a = (int[][]) null;
          return;
        }
    }

    abstract ps a(boolean param0);

    abstract byte[] a(int param0, int param1);

    static {
        field_b = new int[8192];
        field_a = new int[][]{new int[]{3, 0, 0, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0, 0, 1}, new int[]{4, 1, 0, 0, 0, 0, 2}, new int[]{8, 0, 0, 0, 0, 0, 3}, new int[]{6, 0, 1, 0, 0, 0, 2}, new int[]{4, 2, 0, 0, 0, 0, 3}, new int[]{0, 6, 0, 0, 0, 0, 3}, new int[]{2, 4, 0, 0, 0, 0, 3}, new int[]{6, 0, 0, 1, 0, 0, 2}, new int[]{0, 5, 2, 0, 0, 0, 3}, new int[]{0, 6, 0, 1, 0, 0, 3}, new int[]{0, 0, 0, 3, 0, 0, 1}, new int[]{0, 1, 0, 4, 0, 0, 2}, new int[]{6, 2, 0, 0, 1, 0, 3}, new int[]{0, 0, 1, 6, 0, 0, 2}, new int[]{0, 6, 0, 0, 1, 0, 3}, new int[]{0, 6, 0, 0, 2, 0, 3}, new int[]{0, 0, 0, 0, 4, 0, 2}, new int[]{0, 0, 0, 8, 0, 0, 3}, new int[]{0, 0, 2, 6, 0, 0, 3}, new int[]{0, 0, 0, 0, 4, 1, 2}};
    }
}
