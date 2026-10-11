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
        int var5 = 0;
        ut[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut[] var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        ut[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          param2 = wm.a((byte) -86, param2, param3);
          var9 = new ut[2];
          var4 = var9;
          for (var5 = param0; var5 < 2; var5++) {
            var4[var5] = new ut(param2.field_o, param2.field_v);
            stackIn_6_0 = (1 != var5) ? 0 : 1;
            var6 = stackIn_6_0;
            iw.a(param0 ^ 55, var9[var5]);
            param2.d(0, 0);
            if (var6 == 0) {
              on.g(0, 0, on.field_g, on.field_f);
            }
            stackIn_12_0 = (var6 != 0) ? 2 : 0;
            var7 = stackIn_12_0;
            un.field_d.d(param1.toLowerCase(), var7 + (on.field_g >> 1), -13 + (on.field_f + var7), 0, -1);
            ta.e(123);
            sd.a(var9[var5], (byte) -51);
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("et.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
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
