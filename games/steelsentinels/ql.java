/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends gh {
    gh field_bc;
    static gh field_Vb;
    static int field_Ub;
    kg field_Xb;
    static String field_dc;
    static boolean field_cc;
    static String field_Yb;
    static gh field_ec;
    gh field_Sb;
    static int[] field_ac;
    static String field_Zb;
    static ld field_Tb;
    gh field_Wb;

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 18286) {
                break L1;
              } else {
                field_ec = null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (8 <= var2_int) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (param0[var2_int] == 0) {
                  var2_int++;
                  continue L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ql.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ql) this).field_zb = param0;
        int var9 = -88 % ((64 - param5) / 58);
        ((ql) this).field_Lb = param1;
        ((ql) this).field_eb = param7;
        ((ql) this).field_Y = param3;
        ((ql) this).a(param2, param4, 102, param6);
    }

    ql(long param0, gh param1, gh param2, lb param3, gh param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((ql) this).field_Wb = new gh(0L, (gh) null);
            ((ql) this).field_Xb = new kg(0L, ((ql) this).field_Wb, param2, param3);
            ((ql) this).field_bc = new gh(0L, param4);
            ((ql) this).field_Sb = new gh(0L, param4);
            ((ql) this).field_bc.field_S = param5;
            ((ql) this).field_Sb.field_S = param6;
            ((ql) this).a((gh) (Object) ((ql) this).field_Xb, 127);
            ((ql) this).a(((ql) this).field_bc, 121);
            ((ql) this).a(((ql) this).field_Sb, 127);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ql.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    ql(long param0, ql param1, String param2, String param3) {
        this(param0, (gh) (Object) param1, param1.field_Xb.field_Tb, param1.field_Xb.field_Sb, param1.field_bc, param2, param3);
    }

    final static void j(int param0) {
        kc.field_A = false;
        de.field_d = false;
        hc.a(-1, 0);
        jn.field_b = mm.field_e;
        cb.field_j = mm.field_e;
    }

    public static void d(byte param0) {
        field_Vb = null;
        field_ac = null;
        field_Yb = null;
        field_ec = null;
        int var1 = 42;
        field_dc = null;
        field_Zb = null;
        field_Tb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param0 + ((ql) this).field_zb) / 2;
        int var6 = -param1 + ((ql) this).field_Lb;
        ((ql) this).field_Xb.a(((ql) this).field_zb, -2048, param3, var6 - param0, param0, 0, 0);
        ((ql) this).field_bc.field_eb = var6;
        ((ql) this).field_bc.field_zb = -param0 + var5;
        ((ql) this).field_bc.field_Lb = param1;
        ((ql) this).field_bc.field_Y = 0;
        ((ql) this).field_Sb.field_zb = ((ql) this).field_zb + -var5;
        ((ql) this).field_Sb.field_Y = var5;
        int var7 = -101 / ((param2 - -79) / 46);
        ((ql) this).field_Sb.field_eb = var6;
        ((ql) this).field_Sb.field_Lb = param1;
    }

    final static void b(boolean param0) {
        gi.field_o.a(0, 0, 18, 0, fl.field_c.field_zb - (rm.field_p ? 2 + ua.field_G + 42 : 0));
        uj.field_j.a(0, 0, 18, -2 + (fl.field_c.field_zb + -ua.field_G - 40), 42 + ua.field_G);
        mj.field_Sb.a(fl.field_c.field_zb, -2048, ua.field_G, -20 + fl.field_c.field_Lb, 2, 0, 20);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cc = true;
        field_Zb = "Unable to delete name - system busy";
        field_dc = "To play a multiplayer game, please log in or create a free account.";
        field_Yb = "ESC - cancel this line";
        field_ac = new int[]{25, 26, 39, 0, -1, -1, 7};
        field_Ub = 10;
    }
}
