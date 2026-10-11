/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_a;
    static String field_b;
    static String field_c;
    static int field_d;

    final static qj a(boolean param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!param0) {
          var1 = hr.h(-101);
          if (var1 != null &&
            0 <= var1.indexOf('@')) {
            var1 = "";
          }
          return new qj(hr.h(-104), wa.b((byte) -119));
        }
        jd.a(13);
        var1Lifetime1 = hr.h(-101);
        if (var1Lifetime1 != null &&
          0 <= var1Lifetime1.indexOf('@')) {
          var1Lifetime1 = "";
        }
        return new qj(hr.h(-104), wa.b((byte) -119));
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -61 % ((param0 + 10) / 34);
        field_b = null;
    }

    static {
        field_a = "Suggested names: ";
        field_b = "Quit to website";
        field_c = "Respawning in <%0>";
    }
}
