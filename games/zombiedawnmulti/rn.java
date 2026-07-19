/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static ja[] field_a;
    static ll field_f;
    static ai field_d;
    static ul field_e;
    static String field_g;
    static String field_b;
    static String field_c;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_d = null;
        int var1 = 40 % ((21 - param0) / 39);
    }

    final static void a(int param0) {
        if (field_f != null) {
          nq.a(95, field_f);
          if (param0 <= -26) {
            field_f.a(8192, pl.field_J);
            field_f = null;
            if (null != ng.field_g) {
              ng.field_g.d(-33);
              dk.field_Ib.requestFocus();
              return;
            } else {
              dk.field_Ib.requestFocus();
              return;
            }
          } else {
            field_a = (ja[]) null;
            field_f.a(8192, pl.field_J);
            field_f = null;
            if (null == ng.field_g) {
              dk.field_Ib.requestFocus();
              return;
            } else {
              ng.field_g.d(-33);
              dk.field_Ib.requestFocus();
              return;
            }
          }
        } else {
          return;
        }
    }

    final static cj b(int param0) {
        if (param0 != 28579) {
            return (cj) null;
        }
        return gl.field_L.field_Ib;
    }

    static {
        field_c = "Quick Thinker";
        field_g = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
