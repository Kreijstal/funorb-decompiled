/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends eg implements dm {
    static int[] field_P;
    static int field_R;
    static int[] field_Q;
    private od field_W;
    private ae field_T;
    static int[] field_S;
    static int field_V;
    static String field_U;

    final void a(na param0, int param1, int param2, boolean param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((lb) this).field_T.field_K = ((lb) this).field_W.a(-104).c(-68) == pf.field_a ? true : false;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "lb.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    lb(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (kg) null);
        ((lb) this).field_W = new od((kg) (Object) new mf(10000536), ef.field_n, 0, 0, 140, 25);
        ((lb) this).field_W.a(45, new qh());
        ((lb) this).field_T = new ae(al.field_e, (dn) this);
        ((lb) this).field_I = new na[]{(na) (Object) ((lb) this).field_W, (na) (Object) ((lb) this).field_T};
        ((lb) this).field_T.field_H = (kg) (Object) new uj();
        ((lb) this).b((byte) 37);
    }

    final void d(byte param0) {
        int var2 = 0;
        if (param0 > -109) {
          field_P = null;
          var2 = 250;
          ((lb) this).field_W.a(25, -25 + (((lb) this).field_u + 20) >> 1, -125, -var2 + ((lb) this).field_F >> 1, 140);
          ((lb) this).field_T.a(30, (((lb) this).field_u - 10 >> 1) - -2, -124, 10 + ((-var2 + ((lb) this).field_F >> 1) - -140), 100);
          return;
        } else {
          var2 = 250;
          ((lb) this).field_W.a(25, -25 + (((lb) this).field_u + 20) >> 1, -125, -var2 + ((lb) this).field_F >> 1, 140);
          ((lb) this).field_T.a(30, (((lb) this).field_u - 10 >> 1) - -2, -124, 10 + ((-var2 + ((lb) this).field_F >> 1) - -140), 100);
          return;
        }
    }

    final static void a(bh param0) {
        int var2_int = 0;
        try {
            tl.field_X = param0.e(127) << 5;
            var2_int = param0.d((byte) -99);
            l.field_j = (7 & var2_int) << 18;
            tl.field_X = tl.field_X + (var2_int >> 3);
            l.field_j = l.field_j + (param0.e(127) << 2);
            var2_int = param0.d((byte) -99);
            fd.field_F = var2_int << 15 & 2064384;
            l.field_j = l.field_j + (var2_int >> 6);
            fd.field_F = fd.field_F + (param0.d((byte) -99) << 7);
            var2_int = param0.d((byte) -99);
            om.field_Nb = (var2_int & 1) << 16;
            fd.field_F = fd.field_F + (var2_int >> 1);
            om.field_Nb = om.field_Nb + param0.e(127);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "lb.D(" + (param0 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    public static void h(int param0) {
        field_S = null;
        if (param0 != 0) {
          field_V = 73;
          field_Q = null;
          field_U = null;
          field_P = null;
          return;
        } else {
          field_Q = null;
          field_U = null;
          field_P = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        dh.field_d.b(na.field_G, param1 + (((lb) this).field_t + 4), dh.field_d.field_N + ((lb) this).field_w + (param2 + 4), 16777215, -1);
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (param0 >= 0) {
            return;
        }
        if (!(((lb) this).field_W.a(-109).c(-77) == pf.field_a)) {
            return;
        }
        try {
            qe.a(((lb) this).field_W.a(false), 0, ((lb) this).field_W.f((byte) 90), ((lb) this).field_W.g((byte) 12));
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "lb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static bf a(wf param0, int param1) {
        RuntimeException var2 = null;
        bf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 573509761) {
                break L1;
              } else {
                field_U = null;
                break L1;
              }
            }
            stackOut_2_0 = we.a(-11040, ee.a(param0, 100, 96));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("lb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Connection lost. <%0>";
        field_S = new int[8192];
        field_Q = new int[8192];
    }
}
