/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et {
    static int field_c;
    static boolean field_b;
    static String field_e;
    static String field_a;
    static nu field_d;

    final static ut[] a(int param0, String param1, ut param2, int param3) {
        ut[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut[] var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        ut[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            param2 = wm.a((byte) -86, param2, param3);
            var9 = new ut[2];
            var4 = var9;
            var5 = param0;
            L1: while (true) {
              if ((var5 ^ -1) <= -3) {
                stackIn_14_0 = (ut[]) (var4);
                break L0;
              } else {
                L2: {
                  var4[var5] = new ut(param2.field_o, param2.field_v);
                  if (1 != var5) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  var6 = stackIn_6_0;
                  iw.a(param0 ^ 55, var9[var5]);
                  param2.d(0, 0);
                  if (var6 == 0) {
                    on.g(0, 0, on.field_g, on.field_f);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var6 != 0) {
                    stackIn_12_0 = 2;
                    break L4;
                  } else {
                    stackIn_12_0 = 0;
                    break L4;
                  }
                }
                var7 = stackIn_12_0;
                un.field_d.d(param1.toLowerCase(), var7 + (on.field_g >> 1859216161), -13 + (on.field_f + var7), 0, -1);
                ta.e(123);
                sd.a(var9[var5], (byte) -51);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("et.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 < 116) {
            ut var2 = (ut) null;
            et.a(49, (String) null, (ut) null, 57);
        }
        field_e = null;
    }

    static {
        field_b = false;
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = "type";
    }
}
