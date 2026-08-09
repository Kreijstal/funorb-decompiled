/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends oh {
    int field_E;
    int field_G;
    int field_v;
    int field_F;
    int field_H;
    kk field_M;
    kc field_u;
    al field_K;
    br field_A;
    int field_j;
    int field_r;
    int field_C;
    int field_q;
    int field_y;
    static String field_s;
    int field_J;
    static fg field_m;
    int field_h;
    int field_z;
    int field_k;
    static String field_l;
    int field_p;
    int field_B;
    static o field_o;
    static wa field_D;
    int field_i;
    static String field_N;
    static String[] field_w;
    static String field_x;
    static sp field_I;
    static String field_t;
    static bi field_n;

    final static mg a(dc param0, int param1, ob param2) {
        ln var3 = null;
        RuntimeException var3_ref = null;
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        mg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = mg.a(param0, param2, 20);
            var5 = 21 / ((param1 - -64) / 43);
            var4 = mg.a(param0, param2, 20);
            var6 = param2.f(-20976);
            stackIn_1_0 = new mg(var3, var4, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("qq.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final void d(boolean param0) {
        this.field_A = null;
        this.field_K = null;
        this.field_M = null;
        this.field_u = null;
        if (param0) {
            this.field_J = -43;
        }
    }

    public static void a(int param0) {
        field_w = null;
        field_N = null;
        field_I = null;
        field_D = null;
        field_t = null;
        field_o = null;
        if (param0 > -52) {
          return;
        } else {
          field_x = null;
          field_l = null;
          field_n = null;
          field_m = null;
          field_s = null;
          return;
        }
    }

    final static void c(boolean param0) {
        if (param0) {
            return;
        }
        cg.field_E.setLength(0);
        em.field_h = 0;
    }

    qq() {
    }

    static {
        field_s = "Accept unrated rematch";
        field_l = "Confirm Password: ";
        field_m = new fg();
        field_N = "Please remove <%0> from your friend list first.";
        field_x = "Buying or selling an account";
        field_w = new String[]{"New Cambridge Colony", "Historical Archives"};
        field_t = "Try again";
    }
}
