/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static om field_a;
    static String field_b;
    static long field_c;

    public static void a(int param0) {
        if (param0 < 40) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static String b(int param0) {
        if (fc.field_a < 2) {
          return ee.field_a;
        }
        if (nk.field_p != null) {
          if (!nk.field_p.b(0)) {
            return md.field_H;
          }
          return gj.field_g;
        }
        if (!ii.field_a.b(0)) {
          return ah.field_l;
        }
        if (!ii.field_a.a(0, "commonui")) {
          return sm.field_d + " - " + ii.field_a.a("commonui", 0) + "%";
        }
        if (!w.field_ab.b(0)) {
          return CipherPacketBuffer.field_o;
        }
        if (!w.field_ab.a(0, "commonui")) {
          return qf.field_h + " - " + w.field_ab.a("commonui", param0 ^ 1) + "%";
        }
        if (param0 != 1) {
          field_a = (om) null;
        }
        if (!pl.field_j.b(0)) {
          return ff.field_a;
        }
        if (!pl.field_j.a((byte) -119)) {
          return wf.field_b + " - " + pl.field_j.a(-67) + "%";
        }
        return field_b;
    }

    static {
        field_a = new om(12, 0, 1, 0);
        field_b = "Please wait...";
    }
}
