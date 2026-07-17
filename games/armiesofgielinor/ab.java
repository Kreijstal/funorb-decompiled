/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static int field_a;
    static int[] field_c;
    static java.util.zip.CRC32 field_b;
    static me field_d;
    static String field_e;

    public static void a() {
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static boolean a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0.length()) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (ni.a((byte) -105, (char) var3)) {
                    break L2;
                  } else {
                    if (mu.a(28799, (char) var3)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("ab.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 0 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        wk var10 = null;
        wk var11 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1 = param1 | param1 << 8;
            var4_int = param1 >> 1 ^ param1;
            var7 = 0;
            L1: while (true) {
              if (4 <= var7) {
                break L0;
              } else {
                L2: {
                  var6 = -64 + (bm.field_y[var7][1] + param0 - -(param1 & 3));
                  var5 = -44 + ((var4_int & 7) + bm.field_y[var7][0] + param2);
                  if (0 == var7) {
                    var10 = tn.field_eb[16 + param1 % 9];
                    fe.a(var10, var5, -bm.field_y[var7][1] + var6);
                    break L2;
                  } else {
                    var11 = tn.field_eb[25 + param1 % 9];
                    fe.a(var11, var5, var6);
                    break L2;
                  }
                }
                param1 = param1 >> 1;
                var4_int = var4_int >> 1;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "ab.C(" + param0 + 44 + param1 + 44 + param2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_c = new int[16384];
        field_b = new java.util.zip.CRC32();
        field_e = "This option cannot be combined with the current '<%0>' setting.";
        field_d = new me(8, 0, 4, 1);
    }
}
