/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_a;
    static String field_b;

    final static void a(int param0, int param1) {
        jc.field_O.field_l[od.field_a] = (short)(param1 >> 1);
        jc.field_O.field_l[qf.field_F] = (short)(param1 >> 1);
        byte dupTemp$0 = bc.a(param1, 1) != 0 ? sc.field_a : cf.field_d;
        jc.field_O.field_O[od.field_a] = dupTemp$0;
        jc.field_O.field_O[qf.field_F] = dupTemp$0;
        if (param0 > 82) {
          return;
        }
        field_a = 85;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        if (g.field_A < 20) {
          return true;
        }
        if (!ri.b((byte) 64)) {
          return true;
        }
        if (qb.field_b <= 0) {
          return false;
        }
        if (!c.b(true)) {
          return true;
        }
        return false;
    }

    public static void b(boolean param0) {
        field_b = null;
        if (!param0) {
          field_a = -14;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        tk.field_c = tk.field_c + 1;
        rj.field_p = rj.field_p - af.field_ob;
        vf.field_b = vf.field_b + af.field_ob;
        int var3 = param1 << param2;
        if ((var3 & db.field_m) != 0) {
          return false;
        }
        ue.field_d = ue.field_d | var3;
        nb.field_e = nb.field_e | var3;
        db.field_m = db.field_m | var3;
        if (jf.field_n) {
          return true;
        }
        if (!dl.d(0)) {
          uh.a(tk.field_a, (byte) 119, 4, param0, ol.field_W, param2, jl.field_h, bc.field_a);
          return true;
        }
        ij.field_h.a(new dh(param2, param0, tk.field_a, jl.field_h, ol.field_W, bc.field_a), 27362);
        return true;
    }

    static {
        field_a = 9;
        field_b = "Age:";
    }
}
