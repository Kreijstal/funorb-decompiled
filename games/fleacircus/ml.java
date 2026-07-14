/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends dk {
    private int field_G;
    private fa field_H;
    static ak field_I;
    private String field_M;
    private int field_L;
    static int field_O;
    private int field_J;
    static wd field_K;
    static long field_P;
    private boolean field_E;
    static String[] field_N;
    static wh field_F;

    ml(int param0, int param1, int param2, int param3, qa param4, boolean param5, int param6, int param7, fa param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ch) null, (kd) null);
        ((ml) this).field_E = param5 ? true : false;
        ((ml) this).field_J = param7;
        ((ml) this).field_M = param10;
        ((ml) this).field_A = param4;
        ((ml) this).field_L = param6;
        ((ml) this).field_H = param8;
        ((ml) this).field_G = param9;
        int var12 = -((ml) this).field_J + ((ml) this).field_L;
        int var13 = ((ml) this).field_H.b(param10, var12, ((ml) this).field_H.field_H) - -(((ml) this).field_J * 2);
        if (param3 >= var13) {
            var13 = param3;
        } else {
            ((ml) this).a(param0, param2, param1, var13, 80);
        }
        int var14 = !((ml) this).field_E ? ((ml) this).field_J * 2 + ((ml) this).field_L : 0;
        ((ml) this).field_A.a(var14, -((ml) this).field_L + (param2 - ((ml) this).field_J * 3), ((ml) this).field_J - -(var13 + -param3 >> 960240129), -(((ml) this).field_J * 2) + param3, 80);
    }

    final String g(int param0) {
        int var2 = ((ml) this).field_A.field_x ? 1 : 0;
        ((ml) this).field_A.field_x = ((ml) this).field_x;
        String var3 = ((ml) this).field_A.g(param0);
        ((ml) this).field_A.field_x = var2 != 0 ? true : false;
        return var3;
    }

    final static void d(byte param0) {
        if (!ci.field_f) {
          throw new IllegalStateException();
        } else {
          tb.field_c = true;
          if (param0 <= 38) {
            return;
          } else {
            ae.a(false, (byte) 96);
            bh.field_t = 0;
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        hg var4 = null;
        var3 = fleas.field_A ? 1 : 0;
        var4 = (hg) (Object) ak.field_d.c((byte) 47);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 960240129) {
              field_F = null;
              return;
            } else {
              return;
            }
          } else {
            ec.a(var4, (byte) 30, param0);
            var4 = (hg) (Object) ak.field_d.b((byte) -105);
            continue L0;
          }
        }
    }

    public static void j(int param0) {
        field_K = null;
        if (param0 != 1) {
          field_P = -1L;
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        } else {
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        }
    }

    final static void i(int param0) {
        ql var1 = null;
        int var2 = 0;
        var2 = fleas.field_A ? 1 : 0;
        var1 = (ql) (Object) mi.field_r.c((byte) 47);
        if (param0 >= -36) {
          field_N = null;
          L0: while (true) {
            if (var1 != null) {
              rd.a(var1, 115, 5);
              var1 = (ql) (Object) mi.field_r.b((byte) -105);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var1 != null) {
              rd.a(var1, 115, 5);
              var1 = (ql) (Object) mi.field_r.b((byte) -105);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = param1 + ((ml) this).field_y;
        int var6 = ((ml) this).field_z - -param0;
        super.b(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var7 = !((ml) this).field_E ? 0 : -(2 * ((ml) this).field_J) + (((ml) this).field_u - ((ml) this).field_L);
        int discarded$0 = ((ml) this).field_H.a(((ml) this).field_M, ((ml) this).field_J + var5 - -var7, var6 - -((ml) this).field_J, -((ml) this).field_J + ((ml) this).field_L, -(2 * ((ml) this).field_J) + ((ml) this).field_j, ((ml) this).field_G, -1, !((ml) this).field_E ? 2 : 0, 1, ((ml) this).field_H.field_H);
    }

    final static void a(int param0, int param1, dd[] param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        if (param2 != null) {
          if (0 >= param4) {
            return;
          } else {
            var6 = param2[0].field_x;
            var7 = param2[2].field_x;
            var8 = param2[1].field_x;
            param2[0].e(param0, param3, param5);
            param2[2].e(-var7 + param0 + param4, param3, param5);
            gb.a(ng.field_a);
            gb.g(param0 + var6, param3, param0 - (-param4 - -var7), param3 + param2[param1].field_r);
            var9 = var6 + param0;
            var10 = param0 + param4 - var7;
            param0 = var9;
            L0: while (true) {
              if (var10 <= param0) {
                gb.b(ng.field_a);
                return;
              } else {
                param2[1].e(param0, param3, param5);
                param0 = param0 + var8;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new ak();
        field_O = 40;
        field_N = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_K = new wd();
        field_F = new wh("email");
    }
}
