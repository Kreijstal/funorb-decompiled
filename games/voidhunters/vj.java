/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends rqa {
    static llb field_q;
    static String field_o;
    static String field_p;

    vj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e(int param0) {
        if (uh.field_p == jl.field_q.field_b) {
          if (param0 > (tb.field_b ^ -1)) {
            L0: {
              tb.field_b = tb.field_b - 1;
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          kga.field_o = kga.field_o + (jl.field_q.field_b - uh.field_p);
          uh.field_p = jl.field_q.field_b;
          if (param0 <= (tb.field_b ^ -1)) {
            L2: {
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              tb.field_b = tb.field_b - 1;
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          vj.e(-68);
          si.a(227, 62, param0[0].a(12));
          return new nc((Object) (Object) "void");
        } else {
          si.a(227, 62, param0[0].a(12));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_q = null;
        int var1 = -29 / ((param0 - -16) / 58);
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Fighter bay";
        field_p = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
