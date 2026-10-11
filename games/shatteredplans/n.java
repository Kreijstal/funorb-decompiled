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
        field_n = null;
        field_k = null;
        field_m = null;
        if (param0 != 11209) {
          String var2 = (String) null;
          n.a((String) null, -73);
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
        int var3 = 0;
        sq[] var2 = null;
        sq var4 = null;
        int var5 = 0;
        sq[] var6 = null;
        sq stackIn_3_0 = null;
        sq stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6 = mf.field_q;
          var2 = var6;
          if (param1 != -21502) {
            stackIn_3_0 = (sq) null;
            return stackIn_3_0;
          }
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (param0.equalsIgnoreCase(var4.field_g)) {
              stackIn_10_0 = var4;
              return stackIn_10_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("n.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
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
