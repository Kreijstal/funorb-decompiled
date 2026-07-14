/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ma implements mj {
    static int field_Q;
    static String field_N;
    static String field_O;
    static String field_K;
    private fb field_U;
    private fb field_M;
    private fb field_R;
    static tk field_P;
    static ek field_L;
    static String field_S;
    static String field_T;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 > -80) {
          ((ii) this).field_M = null;
          var5 = param3 + ((ii) this).field_u;
          var6 = ((ii) this).field_r - -param0;
          int discarded$2 = rb.field_b.a(pe.field_e, 20 + var5, 20 + var6, ((ii) this).field_y + -40, ((ii) this).field_C - 50, 16777215, -1, 1, 0, rb.field_b.field_C);
          super.a(param0, param1, -90, param3);
          return;
        } else {
          var5 = param3 + ((ii) this).field_u;
          var6 = ((ii) this).field_r - -param0;
          int discarded$3 = rb.field_b.a(pe.field_e, 20 + var5, 20 + var6, ((ii) this).field_y + -40, ((ii) this).field_C - 50, 16777215, -1, 1, 0, rb.field_b.field_C);
          super.a(param0, param1, -90, param3);
          return;
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        if (!(!super.a(param0, param1, param2 + 0, param3))) {
            return true;
        }
        if (!((param1 ^ -1) != -99)) {
            return ((ii) this).a(param3, param2 ^ -27965);
        }
        if (param2 != -1) {
            Object var6 = null;
            ((ii) this).a((fb) null, -72, -53, -40, -75);
            if (99 == param1) {
                return ((ii) this).a(param3, (byte) -73);
            }
            return false;
        }
        if (!(99 != param1)) {
            return ((ii) this).a(param3, (byte) -73);
        }
        return false;
    }

    public static void a(int param0) {
        field_P = null;
        field_T = null;
        if (param0 < 40) {
          return;
        } else {
          field_K = null;
          field_N = null;
          field_S = null;
          field_L = null;
          field_O = null;
          return;
        }
    }

    public ii() {
        super(0, 0, 476, 225, (jm) null);
        ((ii) this).field_R = new fb(fd.field_o, (rg) null);
        ((ii) this).field_M = new fb(vf.field_c, (rg) null);
        ((ii) this).field_U = new fb(jd.field_g, (rg) null);
        sf var1 = new sf();
        ((ii) this).field_R.field_n = (jm) (Object) var1;
        ((ii) this).field_M.field_n = (jm) (Object) var1;
        ((ii) this).field_U.field_n = (jm) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 732279617;
        ((ii) this).field_M.a(-var2 + -48 + ((ii) this).field_C, 34, 30, var4, ((ii) this).field_y - var3 >> -760035647);
        ((ii) this).field_U.a(-var2 + ((ii) this).field_C + -48, 34, 30, var4, (-var3 + ((ii) this).field_y >> -1898409343) + (var4 + var2));
        ((ii) this).field_R.a(((ii) this).field_C - (78 - -(2 * var2)), 34, 30, var3, ((ii) this).field_y + -var3 >> -826185311);
        ((ii) this).field_M.field_p = (rg) this;
        ((ii) this).field_R.field_p = (rg) this;
        ((ii) this).field_R.field_j = sl.field_d;
        ((ii) this).field_U.field_p = (rg) this;
        ((ii) this).field_U.field_j = qd.field_I;
        ((ii) this).b((mf) (Object) ((ii) this).field_M, 95);
        ((ii) this).b((mf) (Object) ((ii) this).field_R, 95);
        ((ii) this).b((mf) (Object) ((ii) this).field_U, 95);
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        var7 = Chess.field_G;
        if (param4 == -24221) {
          if (((ii) this).field_M != param0) {
            if (((ii) this).field_R != param0) {
              if (param0 == ((ii) this).field_U) {
                jg.b(true);
                return;
              } else {
                return;
              }
            } else {
              dc.c((byte) 126);
              return;
            }
          } else {
            mf.e(param4 ^ -24297);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Service unavailable";
        field_N = "Advertising websites";
        field_K = "Off";
        field_P = new tk();
        field_S = "<%0> has joined your game.";
        field_T = "Logging in...";
    }
}
