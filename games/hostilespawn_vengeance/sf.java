/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends ig implements sk {
    private bg field_W;
    private int field_Z;
    static boolean field_U;
    static bd field_ab;
    static jb[] field_V;
    static int[] field_X;
    static String field_Y;
    static bd field_T;

    public final bg a(byte param0) {
        int var2 = -60 % ((param0 - 35) / 39);
        return ((sf) this).field_W;
    }

    final void a(bg param0, byte param1) {
        ((sf) this).field_W = param0;
        if (param1 >= -37) {
            field_ab = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
          field_V = null;
          pf.b(511);
          si.f(param3, param1, param0, param2);
          return;
        } else {
          pf.b(511);
          si.f(param3, param1, param0, param2);
          return;
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((sf) this).field_Z = -param3 + (j.field_c - ((sf) this).field_v);
    }

    final void e(byte param0) {
        super.e(param0);
        if (((sf) this).field_W != null) {
            ((sf) this).field_W.a(true);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 < 60) {
            return true;
        }
        return in.a(true, 10, -59, param1);
    }

    final static double a(int param0, double param1) {
        if (param0 != 24) {
            return 0.5905378176354061;
        }
        return param1 * 24.0 - (double)uj.field_p.field_g;
    }

    public static void p(int param0) {
        Object var2 = null;
        field_T = null;
        field_V = null;
        field_X = null;
        field_ab = null;
        if (param0 != 10) {
          var2 = null;
          boolean discarded$2 = sf.a((byte) 48, (CharSequence) null);
          field_Y = null;
          return;
        } else {
          field_Y = null;
          return;
        }
    }

    final String e(int param0) {
        if (param0 == 34) {
          if (((sf) this).field_u) {
            if (((sf) this).field_i == null) {
              return null;
            } else {
              jg.a(-128, rb.field_m, j.field_c - (((sf) this).field_Z + -((sf) this).field_s));
              return ((sf) this).field_i;
            }
          } else {
            return null;
          }
        } else {
          field_X = null;
          if (((sf) this).field_u) {
            if (((sf) this).field_i == null) {
              return null;
            } else {
              jg.a(-128, rb.field_m, j.field_c - (((sf) this).field_Z + -((sf) this).field_s));
              return ((sf) this).field_i;
            }
          } else {
            return null;
          }
        }
    }

    sf(String param0, mh param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = false;
        field_Y = "Find the <%0>";
        field_V = new jb[51];
    }
}
