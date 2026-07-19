/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static volatile int field_h;
    static qb field_d;
    static cr field_b;
    static int field_a;
    static String field_g;
    static String field_c;
    static cr field_e;
    static od field_f;

    final static boolean a(int param0) {
        if (!il.field_a) {
            return false;
        }
        if (param0 != (ui.field_g ^ -1)) {
            return false;
        }
        return true;
    }

    final static String a(String param0, byte param1) {
        boolean discarded$2 = false;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new char[var2_int];
              if (param1 == -44) {
                break L1;
              } else {
                discarded$2 = ja.a(75);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_9_0 = new String(var3);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L3: {
                  var5 = param0.charAt(var4);
                  if (var4 == 0) {
                    var5 = jp.a(true, (char) var5);
                    break L3;
                  } else {
                    var5 = Character.toLowerCase((char) var5);
                    break L3;
                  }
                }
                var3[var4] = (char)var5;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ja.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    public static void b(int param0) {
        if (param0 <= 114) {
            return;
        }
        field_f = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_c = null;
    }

    static {
        field_a = 0;
        field_h = -1;
        field_g = "Quick Chat game";
        field_c = "Play rated game";
    }
}
