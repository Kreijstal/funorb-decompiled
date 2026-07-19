/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static cn field_b;
    static ng field_c;
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        String discarded$0 = null;
        if (param3 != 19807) {
            String var6 = (String) null;
            discarded$0 = rd.a((byte) -74, (String) null);
        }
        hf.a(108);
        em.h(param1, param4, param0, param2);
    }

    final static String a(byte param0, String param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 == 72) {
                break L1;
              } else {
                rd.a(111, -86, -93, -27, 95);
                break L1;
              }
            }
            var10 = param1.toCharArray();
            var8 = var10;
            var2 = var8;
            var3 = 0;
            var4_int = 0;
            L2: while (true) {
              L3: {
                if (var4_int >= var10.length) {
                  break L3;
                } else {
                  if (var4_int < -var3 + -1 + var10.length) {
                    L4: {
                      var5 = var10[var4_int];
                      if (Character.isSpaceChar((char) var5)) {
                        var3++;
                        var6 = 1 + var4_int;
                        L5: while (true) {
                          if (var10.length <= var6) {
                            break L4;
                          } else {
                            var2[-1 + var6] = var10[var6];
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var11 = new char[var10.length - var3];
              var9 = var11;
              var4 = var9;
              qg.a(var2, 0, var4, 0, var11.length);
              stackOut_13_0 = new String(var11);
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2_ref);
            stackOut_15_1 = new StringBuilder().append("rd.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    public static void a(int param0) {
        int var1 = -2 % ((param0 - 10) / 48);
        field_b = null;
        field_c = null;
    }

    static {
        field_b = new cn();
    }
}
