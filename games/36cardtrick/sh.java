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
        if (param0 != 4352) {
            field_g = (qk) null;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (-21 <= (var2_int ^ -1)) {
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
                var7 = (CharSequence) null;
                sh.a((CharSequence) null, (byte) 31);
                break L2;
              }
            }
            var9 = new char[var2_int];
            var8 = var9;
            var3 = var8;
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackIn_21_0 = new String(var9);
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
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("sh.F(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    static {
        field_j = new byte[65536];
        og.a(field_j, 0, 65536, (byte) -128);
        field_f = "More suggestions";
        field_k = null;
        field_h = "Return to game";
    }
}
