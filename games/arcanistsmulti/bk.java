/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ag {
    static ll[] field_L;
    static int field_I;
    static String field_K;
    static String field_H;
    static kc field_M;
    static nf field_J;

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((bk) this).field_z) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((bk) this).field_z = stackIn_3_1 != 0;
        super.a(-121, param1, param2, param3);
        if (param0 <= -99) {
          return;
        } else {
          bk.a(-47);
          return;
        }
    }

    bk(String param0, wc param1, boolean param2) {
        this(param0, param1);
        try {
            ((bk) this).field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_H = null;
        field_J = null;
        field_K = null;
        field_L = null;
        field_M = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (2 > param0) {
            if (param2 >= 5) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    private bk(String param0, wc param1) {
        this(param0, io.field_n.field_u, param1);
        try {
            ((bk) this).field_r = io.field_n.field_b;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        tg.field_e.a(-12619);
        for (var1_int = 0; 32 > var1_int; var1_int++) {
            rl.field_l[var1_int] = 0L;
        }
        var1_int = 0;
        if (param0 != 2) {
            return;
        }
        try {
            while (32 > var1_int) {
                kn.field_tb[var1_int] = 0L;
                var1_int++;
            }
            e.field_Q = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bk.C(" + param0 + ')');
        }
    }

    private bk(String param0, pf param1, wc param2) {
        super(param0, param1, param2);
        try {
            ((bk) this).field_r = io.field_n.field_b;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Email (Login):";
        field_H = "Level <%0>";
    }
}
