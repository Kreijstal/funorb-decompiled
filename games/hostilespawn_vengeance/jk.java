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
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int <= 20) {
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
                var7 = null;
                String discarded$2 = jk.a((byte) 61, (CharSequence) null);
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
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 > 90) {
                        break L5;
                      } else {
                        var3[var4] = (char)(97 + (-65 + var5));
                        var4++;
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
            stackOut_25_1 = new StringBuilder().append("jk.A(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
        field_a = "Reach the bridge's main navigation console and set the station to crash into the planet.";
    }
}
