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

    public static void a(int param0) {
        sq discarded$0 = null;
        field_n = null;
        field_k = null;
        field_m = null;
        if (param0 != 11209) {
            String var2 = (String) null;
            discarded$0 = n.a((String) null, -73);
        }
        field_l = null;
        field_o = null;
        field_h = null;
        field_q = null;
        field_j = null;
    }

    n(fs param0, fs param1, String param2) {
        try {
            this.field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static sq a(String param0, int param1) {
        sq[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sq var4 = null;
        int var5 = 0;
        sq[] var6 = null;
        sq stackIn_3_0 = null;
        sq stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sq stackOut_9_0 = null;
        sq stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6 = mf.field_q;
            var2 = var6;
            if (param1 == -21502) {
              var3 = 0;
              L1: while (true) {
                if (var3 < var6.length) {
                  var4 = var6[var3];
                  if (param0.equalsIgnoreCase(var4.field_g)) {
                    stackOut_9_0 = (sq) (var4);
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackOut_2_0 = (sq) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2_ref);
            stackOut_13_1 = new StringBuilder().append("n.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_p = Math.atan2(1.0, 0.0);
        field_m = "Your game";
        field_l = "Colonies were founded on a hundred worlds. Poorly equipped and without support, many failed. System after system was lost to the gathering night.";
        field_q = "This option cannot be combined with the current '<%0>' setting.";
        field_j = "Click to show the Projects window.";
    }
}
