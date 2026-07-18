/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends sl {
    private Object field_N;
    static tq field_P;
    static String field_M;
    static vl field_F;
    static lp field_I;
    static int[] field_E;
    static double field_J;
    static String field_K;
    static int field_O;
    static jp[][] field_L;
    static String field_H;

    final static void a(int param0, jp param1, int param2, int param3, int param4, pb param5) {
        try {
            fc.a(-53, param5.field_p);
            lb.g(param0, 0, param5.field_i, param5.field_q, bg.field_u[param4], 928072);
            param1.b(-(30 / param2) + (param5.field_i + -param1.field_x) / 2, -(66 / param2) + (-param1.field_z + param3 + param5.field_q), 0, 208);
            sc.b(-101);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ej.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    public static void h(int param0) {
        field_I = null;
        field_M = null;
        field_L = null;
        field_P = null;
        field_F = null;
        field_K = null;
        field_H = null;
        field_E = null;
    }

    ej(Object param0, int param1) {
        super(param1);
        try {
            ((ej) this).field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Object g(int param0) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          ej.a(-50, (jp) null, -35, 2, 119, (pb) null);
          return ((ej) this).field_N;
        } else {
          return ((ej) this).field_N;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new tq();
        field_E = new int[29];
        field_M = "Day";
        field_E[7] = 3;
        field_E[8] = 6;
        field_E[18] = 1;
        field_E[17] = 3;
        field_E[15] = 5;
        field_E[5] = 4;
        field_E[12] = 7;
        field_E[4] = 5;
        field_E[10] = 2;
        field_J = 0.0;
        field_F = new vl();
        field_K = "Only show game chat from my friends";
        field_O = 480;
        field_H = "Resign";
    }
}
