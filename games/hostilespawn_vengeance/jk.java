/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jk {
    static Random field_b;
    static String field_a;
    static gb field_c;

    final static String a(byte param0, CharSequence param1) {
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
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (-21 <= (var2_int ^ -1)) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            L2: {
              if (param0 == 104) {
                break L2;
              } else {
                var7 = (CharSequence) null;
                jk.a((byte) 61, (CharSequence) null);
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
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 > 90) {
                        break L5;
                      } else {
                        var3[var4] = (char)(97 + (-65 + var5));
                        break L4;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (97 > var5) {
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
                      if (48 > var5) {
                        break L8;
                      } else {
                        if (var5 > 57) {
                          break L8;
                        } else {
                          break L6;
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

            stackIn_24_1 = new StringBuilder().append("jk.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final static boolean a(int param0) {
        if (param0 != -23322) {
            jk.b(-58);
            return sf.field_U;
        }
        return sf.field_U;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 > -43) {
            jk.b(66);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_b = new Random();
        field_a = "Reach the bridge's main navigation console and set the station to crash into the planet.";
    }
}
