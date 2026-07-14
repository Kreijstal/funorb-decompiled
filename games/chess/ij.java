/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static String field_c;
    static String field_b;
    static String field_d;
    static String field_e;
    static String field_f;
    static String[] field_a;

    final static void a(um param0, boolean param1, um param2, byte param3) {
        Object var5 = null;
        da.a(fi.field_b, r.field_Tb, ic.field_c, bj.field_eb, ia.field_o, qn.field_P, af.field_o, tk.field_d, param1, false, sj.field_k, (lh) (Object) pk.field_a);
        el.field_z = ao.a(param2, "chatfilter", 2993, "lobby");
        nk.field_x[2] = ii.field_K;
        nk.field_x[1] = gg.field_g;
        if (param3 <= 70) {
          var5 = null;
          ij.a((um) null, false, (um) null, (byte) 17);
          nk.field_x[0] = fm.field_Q;
          dm.a((lh) (Object) v.field_k, param0, 1513239);
          return;
        } else {
          nk.field_x[0] = fm.field_Q;
          dm.a((lh) (Object) v.field_k, param0, 1513239);
          return;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0 != 255) {
          ij.a(28);
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        i.a(true, oc.field_o, -5136, ih.field_Q);
        if (param0 > -127) {
            field_d = null;
            ag.field_e = true;
            return;
        }
        ag.field_e = true;
    }

    final static kf a(int param0, int param1, um param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        if (param0 < -23) {
          var4 = param2.b((byte) -74, param1);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new kf(var4);
          }
        } else {
          return null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The '<%0>' setting needs to be changed.";
        field_f = "Black's move";
        field_e = "Public";
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_d = "Instructions";
    }
}
