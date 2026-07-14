/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ml {
    static String field_p;
    static bi field_o;
    static boolean field_n;
    static String field_q;

    final String a(boolean param0, String param1) {
        Object var4 = null;
        if (((mm) this).b(-11196, param1) != tj.field_b) {
          if (param0) {
            var4 = null;
            String discarded$2 = ((mm) this).a(true, (String) null);
            return dn.field_g;
          } else {
            return dn.field_g;
          }
        } else {
          return ig.field_b;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 >= -67) {
            field_p = null;
        }
    }

    mm(go param0) {
        super(param0);
    }

    final static void f(int param0) {
        L0: {
          if (ji.field_G != null) {
            ji.field_G.i((byte) -104);
            break L0;
          } else {
            break L0;
          }
        }
        sj.field_b = new ir();
        if (param0 != -26049) {
          field_o = null;
          ae.field_f.b((vg) (Object) sj.field_b, -54);
          return;
        } else {
          ae.field_f.b((vg) (Object) sj.field_b, -54);
          return;
        }
    }

    final static void d(int param0) {
        if (param0 != -16705) {
          field_n = false;
          bq.field_h = new dg(ho.field_j, un.field_g, po.field_d, ii.field_u, (qr) (Object) fk.field_i, gn.field_w);
          return;
        } else {
          bq.field_h = new dg(ho.field_j, un.field_g, po.field_d, ii.field_u, (qr) (Object) fk.field_i, gn.field_w);
          return;
        }
    }

    final u b(int param0, String param1) {
        int var3 = vn.a(64, param1) == null ? 1 : 0;
        if (param0 != -11196) {
            return null;
        }
        if (!(var3 != 0)) {
            return tj.field_b;
        }
        return p.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Project is complete. Click to place.";
        field_p = "Invite only";
    }
}
