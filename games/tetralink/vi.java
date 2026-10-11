/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int field_d;
    static String field_b;
    static int field_c;
    static qe field_a;

    final static String a(int param0) {
        if (2 > vd.field_a) {
          return pb.field_b;
        }
        if (d.field_i != null) {
          if (!d.field_i.c(param0 ^ -31281)) {
            return eg.field_N;
          }
          return nj.field_e;
        }
        if (!rm.field_i.c(param0 ^ -31275)) {
          return qa.field_C;
        }
        if (!rm.field_i.a("commonui", (byte) -106)) {
          return nc.field_c + " - " + rm.field_i.a("commonui", true) + "%";
        }
        if (param0 != -31307) {
          field_b = (String) null;
        }
        if (!ib.field_a.c(113)) {
          return nd.field_Kb;
        }
        if (!ib.field_a.a("commonui", (byte) -119)) {
          return hh.field_a + " - " + ib.field_a.a("commonui", true) + "%";
        }
        if (!q.field_b.c(param0 ^ -31270)) {
          return fl.field_a;
        }
        if (!q.field_b.a(false)) {
          return v.field_w + " - " + q.field_b.b(22300) + "%";
        }
        return dg.field_m;
    }

    public static void b(int param0) {
        if (param0 < 12) {
          field_a = (qe) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_d = 0;
        field_b = "Show players in <%0>'s game";
        field_a = new qe();
    }
}
