/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends qr {
    String field_Ab;
    String field_Eb;
    qr field_Fb;
    qr field_Db;
    int field_zb;
    static String field_Gb;
    String field_xb;
    String field_Bb;
    qr field_Cb;
    static String field_yb;

    final static String a(bc param0, int param1, String param2, String param3, int param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.b((byte) 5)) {
            stackIn_3_0 = (String) (param2);
            return stackIn_3_0;
          }
          if (param4 != -14930) {
            var6 = (String) null;
            ve.a((bc) null, -19, (String) null, (String) null, -86);
          }
          stackIn_7_0 = param3 + " - " + param0.c((byte) 36, param1) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ve.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_yb = null;
        field_Gb = null;
        if (param0 != 0) {
          ve.g(15);
        }
    }

    ve() {
        super(0L, (qr) null);
    }

    static {
        field_Gb = "<%0> might change the options - wait and see.";
        field_yb = "Tips";
    }
}
