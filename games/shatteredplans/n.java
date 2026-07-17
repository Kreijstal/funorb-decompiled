/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends oh {
    int field_i;
    static wh field_h;
    static double field_p;
    static String field_q;
    static String field_m;
    static String field_l;
    static bi field_k;
    static qr field_o;
    static String field_j;
    static qr[] field_n;

    public static void a() {
        field_n = null;
        field_k = null;
        field_m = null;
        field_l = null;
        field_o = null;
        field_h = null;
        field_q = null;
        field_j = null;
    }

    n(fs param0, fs param1, String param2) {
        try {
            ((n) this).field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static sq a(String param0) {
        sq[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sq var4 = null;
        int var5 = 0;
        sq[] var6 = null;
        sq stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        sq stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6 = mf.field_q;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              if (param0.equalsIgnoreCase(var4.field_g)) {
                stackOut_8_0 = (sq) var4;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("n.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -21502 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = Math.atan2(1.0, 0.0);
        field_m = "Your game";
        field_l = "Colonies were founded on a hundred worlds. Poorly equipped and without support, many failed. System after system was lost to the gathering night.";
        field_q = "This option cannot be combined with the current '<%0>' setting.";
        field_j = "Click to show the Projects window.";
    }
}
