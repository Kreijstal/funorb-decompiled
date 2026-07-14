/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static qe field_a;
    static String field_b;
    static he field_c;

    final static void a(int param0, vj param1) {
        nh var2 = new nh(param1.a("final_frame.jpg", "", 24874), (java.awt.Component) (Object) n.field_g);
        int var3 = var2.field_y;
        int var4 = var2.field_w;
        aj.a(true);
        ji.field_b = new nh(var3, 3 * var4 / 4);
        ji.field_b.c();
        var2.a(param0, 0);
        vb.field_s = new nh(var3, -ji.field_b.field_w + var4);
        vb.field_s.c();
        var2.a(0, -ji.field_b.field_w);
        vb.field_s.field_v = ji.field_b.field_w;
        cl.d((byte) -99);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    final static nh[] a(String param0, String param1, int param2, vj param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != 0) {
          field_b = null;
          var4 = param3.a(param1, (byte) -115);
          var5 = param3.a((byte) -63, param0, var4);
          return ob.a(var5, -13339, param3, var4);
        } else {
          var4 = param3.a(param1, (byte) -115);
          var5 = param3.a((byte) -63, param0, var4);
          return ob.a(var5, -13339, param3, var4);
        }
    }

    final static boolean a(bl param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        return param0.a(param1 ^ -20);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Graphics: ";
    }
}
