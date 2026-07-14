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
        this.a(-121, param1, param2, param3);
        if (param0 <= -99) {
          return;
        } else {
          bk.a(-47);
          return;
        }
    }

    bk(String param0, wc param1, boolean param2) {
        this(param0, param1);
        ((bk) this).field_z = param2 ? true : false;
    }

    public static void f(int param0) {
        field_H = null;
        field_J = null;
        field_K = null;
        field_L = null;
        if (param0 != 0) {
            bk.a(126);
            field_M = null;
            return;
        }
        field_M = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == 1021) {
          if (2 > param0) {
            if ((param2 ^ -1) <= -6) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          bk.f(44);
          if (2 > param0) {
            if ((param2 ^ -1) <= -6) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        }
    }

    private bk(String param0, wc param1) {
        this(param0, io.field_n.field_u, param1);
        ((bk) this).field_r = io.field_n.field_b;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        tg.field_e.a(-12619);
        var1 = 0;
        L0: while (true) {
          if (32 <= var1) {
            var1 = 0;
            if (param0 == 2) {
              L1: while (true) {
                if (32 <= var1) {
                  e.field_Q = 0;
                  return;
                } else {
                  kn.field_tb[var1] = 0L;
                  var1++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            rl.field_l[var1] = 0L;
            var1++;
            continue L0;
          }
        }
    }

    private bk(String param0, pf param1, wc param2) {
        super(param0, param1, param2);
        ((bk) this).field_r = io.field_n.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Email (Login):";
        field_H = "Level <%0>";
    }
}
