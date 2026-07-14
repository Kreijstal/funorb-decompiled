/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v implements tl {
    static int[] field_b;
    static int field_e;
    static String field_f;
    static String field_d;
    static char field_g;
    static String field_c;
    private long field_a;

    final static void a(int param0, boolean param1, int param2, ic param3, pn param4, java.awt.Component param5, int param6, int param7) {
        tb.a(param2, param1, 10);
        fc.field_a = tb.a(param4, param5, 0, param0);
        cm.field_j = tb.a(param4, param5, 1, param6);
        ll.field_e = new wg();
        ej.field_B = param6 * 1000 / param2;
        cm.field_j.a((we) (Object) ll.field_e);
        if (param7 > -71) {
            field_g = 'ﾓ';
        } else {
            q.field_f = param3;
            q.field_f.a(ll.field_q, 1000000);
            fc.field_a.a((we) (Object) q.field_f);
            return;
        }
        q.field_f = param3;
        q.field_f.a(ll.field_q, 1000000);
        fc.field_a.a((we) (Object) q.field_f);
    }

    public final void a(int param0) {
        ((v) this).field_a = mm.a(param0 ^ 17297);
        if (param0 != -17382) {
            field_c = null;
        }
    }

    public final vd a(byte param0) {
        if (!((v) this).b(true)) {
          if ((mm.a(114) ^ -1L) > (((v) this).field_a + 350L ^ -1L)) {
            return nh.field_J;
          } else {
            if (param0 != 21) {
              return null;
            } else {
              return ((v) this).b(param0 + -32013);
            }
          }
        } else {
          return ka.field_S;
        }
    }

    public final String a(boolean param0) {
        if (!((v) this).b(param0)) {
          if (mm.a(85) < ((v) this).field_a + 350L) {
            return null;
          } else {
            return ((v) this).b((byte) -42);
          }
        } else {
          return null;
        }
    }

    abstract vd b(int param0);

    public static void c(boolean param0) {
        Object var2 = null;
        field_b = null;
        if (!param0) {
          var2 = null;
          v.a(-71, false, 92, (ic) null, (pn) null, (java.awt.Component) null, -72, -65);
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    abstract String b(byte param0);

    final static void a(int param0, String param1, int param2) {
        ji.field_i = param0;
        in.field_i = bg.field_G;
        if (param2 != 10) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "MISSION <%0> <%1>";
        field_b = new int[]{4};
        field_d = "Orb coins: ";
        field_g = '/';
        field_c = "components:</col>";
    }
}
