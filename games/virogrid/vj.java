/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String field_a;
    static int[] field_b;

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 == 17) {
          field_a = null;
          return;
        }
        Js5Archive var2 = (Js5Archive) null;
        vj.a((Js5Archive) null, (Js5Archive) null, true, false);
        field_a = null;
    }

    final static void a(Js5Archive param0, Js5Archive param1, boolean param2, boolean param3) {
        try {
          kb.a(pl.field_a, IntrusiveDequeCursor.field_e, ub.field_z, ti.field_h, ke.field_u, da.field_n, IntrusiveDeque.field_a, wn.field_m, param2, -112, em.chatFont, nb.field_r);
          j.chatFilterIcons = ke.a(32, param1, "lobby", "chatfilter");
          hn.field_i[1] = ng.field_Y;
          hn.field_i[0] = Js5Archive.field_g;
          hn.field_i[2] = jk.field_f;
          kb.a(db.generalFont, false, param0);
          if (!param3) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "vj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        int var2 = Virogrid.field_F ? 1 : 0;
        if (!lb.a((byte) -20)) {
          if (null != ih.field_b &&
            ih.field_b.field_a) {
            am.a((byte) -16);
            ig.field_c.a(0, new mk(ig.field_c, rg.field_b));
          }
          return;
        }
        try {
          ig.field_c.a(GameBoard.field_p, dc.field_P, (byte) -127, true);
          ig.field_c.i(16);
          while (nd.b((byte) -98)) {
            ig.field_c.a(um.field_Gb, nm.field_d, -97);
          }
          int var1_int = 80 % ((-47 - param0) / 37);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "vj.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Add <%0> to friend list";
    }
}
