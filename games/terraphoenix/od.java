/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static ba[] field_h;
    static re[] field_c;
    static String field_b;
    static bg field_e;
    static boolean field_a;
    static String field_f;
    static o field_g;
    static String field_d;

    final static boolean b(int param0) {
        dc var2;
        boolean stackIn_6_0 = false;
        if (param0 != 255) {
          var2 = (dc) null;
          od.a((dc) null, (byte) -95);
        }
        stackIn_6_0 = (ig.field_e != null) && (mh.field_a.a(true));
        return stackIn_6_0;
    }

    final static void a(dc param0, byte param1) {
        int var2_int = 0;
        dc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Terraphoenix.field_V;
        try {
          if (param0.field_h == null) {
            return;
          }
          if (param0.field_f != 0 ||
            param0.field_j != 0) {
            for (var2_int = 0; var2_int < am.field_J; var2_int++) {
              var3 = ra.field_i[var2_int];
              if (var3.field_l == 2 &&
                var3.field_f == param0.field_f &&
                var3.field_j == param0.field_j) {
                return;
              }
            }
          }
          if (param0.field_i != null) {
          }
          if (param1 > -92) {
            field_b = (String) null;
          }
          jd.a(param0, (byte) -119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("od.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_d = null;
        field_g = null;
        field_h = null;
        if (param0 != 21) {
          od.b(-64);
        }
        field_c = null;
    }

    static {
        int var0 = 0;
        field_c = new re[21];
        field_b = "Waiting for music";
        field_h = new ba[255];
        for (var0 = 0; field_h.length > var0; var0++) {
          field_h[var0] = new ba();
        }
        field_f = "Start the mission";
        field_g = new o();
        field_d = "Close minimap";
    }
}
