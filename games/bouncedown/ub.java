/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static qc field_b;
    static String field_d;
    static gk field_a;
    static String field_e;
    static String field_c;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -104) {
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static void a(byte param0, gk param1) {
        tg var2 = null;
        int var3 = 0;
        int var4 = 0;
        if (param0 != -32) {
          return;
        } else {
          var2 = new tg(param1.b("final_frame.jpg", "", -90), (java.awt.Component) (Object) ch.field_h);
          var3 = var2.field_s;
          var4 = var2.field_q;
          wa.a(true);
          jl.field_c = new tg(var3, 3 * var4 / 4);
          jl.field_c.d();
          var2.b(0, 0);
          bf.field_o = new tg(var3, var4 + -jl.field_c.field_q);
          bf.field_o.d();
          var2.b(0, -jl.field_c.field_q);
          bf.field_o.field_p = jl.field_c.field_q;
          ve.a(param0 ^ 100);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_e = "Names should contain a maximum of 12 characters";
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = new qc();
    }
}
