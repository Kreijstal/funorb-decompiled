/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String field_a;
    static qj[] field_b;
    private static String field_z;

    public static void a(boolean param0) {
        if (param0) {
          field_a = null;
          field_b = null;
          return;
        }
        String var2 = (String) null;
        bb.a((String) null, (byte) 22, (String) null, (String) null);
        field_a = null;
        field_b = null;
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var5 = TrackController.field_F ? 1 : 0;
        int var4 = param0.indexOf(param3);
        if (param1 != -82) {
          return (String) null;
        }
        while (-1 != var4) {
          param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param3.length());
          var4 = param0.indexOf(param3, var4 + param2.length());
        }
        return param0;
    }

    static {
        field_z = "bb.B(";
        field_a = "Open in popup window";
    }
}
