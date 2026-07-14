/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private String field_c;
    static int field_f;
    static bi field_e;
    static int field_d;
    private boolean field_a;
    static int field_b;

    final static lp a(int param0, byte param1, int param2, rh param3) {
        qk var5 = null;
        b var6 = null;
        ff var7 = null;
        ff var8 = null;
        Object var10 = null;
        lp var11 = null;
        lp var12 = null;
        qk var13 = null;
        qk var14 = null;
        var11 = new lp(0, 0, 132, 40);
        var12 = var11;
        if (param1 <= -22) {
          param3.field_c[param2] = var11;
          var5 = new qk(132 - rs.field_Cb.c(or.field_d[param2]), 0, or.field_d[param2]);
          var12.a((vd) (Object) var5, 8);
          var6 = new b(d.field_b[param2].field_z / 2, rs.field_Cb.field_J + 2, 132 + -(d.field_b[param2].field_z / 2), d.field_b[param2].field_w, 2, 2105376);
          var12.a((vd) (Object) var6, 8);
          var7 = new ff(3 * d.field_b[param2].field_z / 4, rs.field_Cb.field_J - -5, ec.a(param2, param0, true));
          var12.a((vd) (Object) var7, 8);
          var8 = new ff(0, 2 + rs.field_Cb.field_J, d.field_b[param2]);
          var12.a((vd) (Object) var8, 8);
          if ((param0 ^ -1) == -6) {
            var14 = new qk(d.field_b[param2].field_z, 1 + (rs.field_Cb.field_J + 2 + d.field_b[param2].field_w / 8), 130 - d.field_b[param2].field_z, d.field_b[param2].field_w, mf.field_v);
            var12.a((vd) (Object) var14, 8);
            param3.field_b[param2] = var14;
            var14.field_o = mm.field_q;
            var8.field_o = mm.field_q;
            var7.field_o = mm.field_q;
            var6.field_o = mm.field_q;
            var5.field_o = mm.field_q;
            var12.field_o = mm.field_q;
            return var12;
          } else {
            var8.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var7.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var6.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var5.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var12.field_o = re.a(ur.field_yb, 4371, new String[1]);
            return var12;
          }
        } else {
          var10 = null;
          gm discarded$1 = e.a(-126, -120, (kk) null);
          param3.field_c[param2] = var11;
          var5 = new qk(132 - rs.field_Cb.c(or.field_d[param2]), 0, or.field_d[param2]);
          var12.a((vd) (Object) var5, 8);
          var6 = new b(d.field_b[param2].field_z / 2, rs.field_Cb.field_J + 2, 132 + -(d.field_b[param2].field_z / 2), d.field_b[param2].field_w, 2, 2105376);
          var12.a((vd) (Object) var6, 8);
          var7 = new ff(3 * d.field_b[param2].field_z / 4, rs.field_Cb.field_J - -5, ec.a(param2, param0, true));
          var12.a((vd) (Object) var7, 8);
          var8 = new ff(0, 2 + rs.field_Cb.field_J, d.field_b[param2]);
          var12.a((vd) (Object) var8, 8);
          if ((param0 ^ -1) == -6) {
            var13 = new qk(d.field_b[param2].field_z, 1 + (rs.field_Cb.field_J + 2 + d.field_b[param2].field_w / 8), 130 - d.field_b[param2].field_z, d.field_b[param2].field_w, mf.field_v);
            var12.a((vd) (Object) var13, 8);
            param3.field_b[param2] = var13;
            var13.field_o = mm.field_q;
            var8.field_o = mm.field_q;
            var7.field_o = mm.field_q;
            var6.field_o = mm.field_q;
            var5.field_o = mm.field_q;
            var12.field_o = mm.field_q;
            return var12;
          } else {
            var8.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var7.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var6.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var5.field_o = re.a(ur.field_yb, 4371, new String[1]);
            var12.field_o = re.a(ur.field_yb, 4371, new String[1]);
            return var12;
          }
        }
    }

    final String a(byte param0) {
        int var2 = 96 / ((param0 - -10) / 51);
        return ((e) this).field_c;
    }

    final boolean a(int param0) {
        if (param0 != 2) {
            e.b(20);
            return ((e) this).field_a;
        }
        return ((e) this).field_a;
    }

    final static gm a(int param0, int param1, kk param2) {
        int var3 = 13 / ((-40 - param1) / 39);
        return da.a(-128, al.a(param2, 100, param0));
    }

    public static void b(int param0) {
        if (param0 != 2105376) {
            field_d = -47;
            field_e = null;
            return;
        }
        field_e = null;
    }

    e(String param0) {
        this(param0, false);
    }

    e(String param0, boolean param1) {
        ((e) this).field_c = param0;
        ((e) this).field_a = param1 ? true : false;
        if (((e) this).field_c == null) {
            ((e) this).field_c = "";
        }
        if (0 == ((e) this).field_c.length()) {
            ((e) this).field_a = false;
        }
    }

    static {
    }
}
