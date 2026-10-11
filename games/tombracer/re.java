/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static String field_b;
    static jpa field_a;

    public static void a(byte param0) {
        int var1 = -87 % ((param0 - 30) / 32);
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        jqa.field_g = bea.field_a;
        ob.field_i = bea.field_g;
        ji.a(16);
        oca.field_b.a(0, 0, 20, nra.field_a.field_G, -2 + (-40 + nra.field_a.field_t));
        lva.field_t.a(hk.field_e.field_G, di.field_a, param0 + 5264, 0, 0);
        int var1 = 2 + di.field_a;
        rra.field_e.a(hk.field_e.field_G, hk.field_e.field_t - (rca.field_p ? var1 : 0), -23776, !rca.field_p ? 0 : var1, 0);
        da.a(false);
        st.field_j.a(nra.field_a.field_G, 40, -23776, nra.field_a.field_t - 40, 0);
        ap.field_a.a(cka.field_fd.field_G, 30, -23776, 0, 0);
        db.field_s.a(cka.field_fd.field_G, cka.field_fd.field_t - 40 - 2 - 30, param0 + 5264, 30, 0);
        gta.field_b.a(68, 30, -23776, 5, 5);
        iia.field_r.a(78, 30, -23776, 5, 75);
        spa.field_o.a(48, 30, -23776, 5, 155);
        if (param0 == -29040) {
          l.field_K.a(48, 30, -23776, 5, 205);
          var2 = rca.field_p ? 250 : 200;
          aw.field_I.a(-var2 + 363, 30, -23776, 5, 5 + var2);
          cq.field_e.a(-365 + (-5 + (cka.field_fd.field_G - 5)), 30, -23776, 5, 370);
          nsa.field_i.a(-5 + (db.field_s.field_G - 5), 2, (byte) 127, 5, io.field_a, -42 + db.field_s.field_t, 37);
          var3 = (2 + cka.field_fd.field_G) / 2;
          uq.field_c.a(var3 - 2, 40, param0 + 5264, -40 + cka.field_fd.field_t, 0);
          if (!rca.field_p) {
            var3 = 0;
          }
          pq.field_c.a(cka.field_fd.field_G - var3, 40, param0 + 5264, cka.field_fd.field_t - 40, var3);
          return;
        }
    }

    static {
        field_b = "DNF";
    }
}
