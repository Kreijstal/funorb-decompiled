/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static String field_c;
    static hf field_h;
    static String field_b;
    static String field_d;
    static String field_g;
    static int[] field_a;
    static int field_e;
    static int field_f;

    public static void a(boolean param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_c = null;
    }

    final static String b() {
        String var1 = "";
        if (!(null == dd.field_d)) {
            var1 = dd.field_d.j(35);
        }
        if (var1.length() == 0) {
            int discarded$0 = 0;
            var1 = tg.i();
        }
        if (var1.length() == 0) {
            var1 = fi.field_e;
        }
        return var1;
    }

    final static void a(byte param0, boolean param1) {
        wc.a(param1, 1983, true);
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = param0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_4_0 = var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3 = hf.a(78, param1.charAt(var4)) + (-var3 + (var3 << 5));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("mh.E(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final static void a() {
        if (null != bk.field_r) {
            bk.field_r.a((byte) -109);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = new hf();
        field_b = "PER MONTH";
        field_d = "Confirm Password: ";
        field_a = new int[48];
        field_g = "Seek out and destroy all the alien military infrastructure.<br>Some levels are booby trapped with auto-destruct systems.<br>Escape before the timer counts down to zero.";
    }
}
