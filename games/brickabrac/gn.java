/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends ld {
    static long field_C;
    static int[] field_x;
    static String field_A;
    static jp field_z;
    static String[] field_D;
    static String field_y;
    static long field_E;

    public static void i(int param0) {
        field_y = null;
        int var1 = 63 % ((-67 - param0) / 54);
        field_A = null;
        field_x = null;
        field_z = null;
        field_D = null;
    }

    final static void a(int param0, cq param1, int param2) {
        pi var3 = null;
        var3 = k.field_h;
        if (param0 != -21167) {
          return;
        } else {
          var3.e(-13413, param2);
          var3.a(-113, param1.field_m);
          var3.a(param0 ^ 21215, param1.field_s);
          return;
        }
    }

    final boolean a(byte param0, int param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0;
        int stackOut_4_0;
        int stackOut_3_0;
        var3 = ((gn) this).field_m[param1].field_f;
        if (param0 >= 80) {
          if (eg.field_k) {
            if (var3 != 12) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_C = -10L;
          if (!eg.field_k) {
            return true;
          } else {
            L0: {
              if (var3 == 12) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1, ln param2) {
        pi var3 = null;
        int var4 = 0;
        pi var5 = null;
        var5 = k.field_h;
        var3 = var5;
        var5.e(-13413, param0);
        var5.field_l = var5.field_l + 1;
        var4 = var5.field_l;
        var5.a(-125, 1);
        if (null == param2.field_i) {
          var5.a(-11, 0);
          int discarded$4 = var5.d(3, var4);
          var5.field_l = var5.field_l - 4;
          param2.field_m = var5.e(255);
          var5.d((byte) 121, -var4 + var5.field_l);
          if (param1 > 113) {
            return;
          } else {
            gn.i(-46);
            return;
          }
        } else {
          var5.a(-108, param2.field_i.length);
          var5.a(param2.field_i, -1, 0, param2.field_i.length);
          int discarded$5 = var5.d(3, var4);
          var5.field_l = var5.field_l - 4;
          param2.field_m = var5.e(255);
          var5.d((byte) 121, -var4 + var5.field_l);
          if (param1 > 113) {
            return;
          } else {
            gn.i(-46);
            return;
          }
        }
    }

    final static void a(boolean param0, mf param1, mf param2, mf param3, int param4) {
        ma.field_I = rm.a("", 16711935);
        ma.field_I.a(false, 20892);
        if (param4 <= 11) {
          field_D = null;
          nq.a(param3, param1, (byte) -59, param2);
          np.b(false);
          ka.field_l = ej.field_P;
          ik.field_g = ej.field_P;
          return;
        } else {
          nq.a(param3, param1, (byte) -59, param2);
          np.b(false);
          ka.field_l = ej.field_P;
          ik.field_g = ej.field_P;
          return;
        }
    }

    final int f(int param0) {
        Object var3 = null;
        if (param0 != -6) {
          var3 = null;
          gn.a(false, (mf) null, (mf) null, (mf) null, 63);
          return gp.field_d.field_db;
        } else {
          return gp.field_d.field_db;
        }
    }

    final void c(int param0) {
        if (param0 != -1) {
            gn.i(-22);
            da.f((byte) 122);
            return;
        }
        da.f((byte) 122);
    }

    gn() {
        super(19, ff.field_h);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_y = "Quick Chat game";
        field_A = "Enter name of player to delete from list";
    }
}
