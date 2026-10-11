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
          this.field_T.field_K = this.field_W.a(-104).c(-68) == pf.field_a ? true : false;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "lb.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    lb(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (kg) null);
        this.field_W = new od(new mf(10000536), ef.field_n, 0, 0, 140, 25);
        this.field_W.a(45, new qh());
        this.field_T = new ae(al.field_e, (dn) (this));
        this.field_I = new na[]{(na) ((Object) this.field_W), (na) ((Object) this.field_T)};
        this.field_T.field_H = (kg) ((Object) new uj());
        this.b((byte) 37);
    }

    final void d(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 <= -109) {
          var2 = 250;
          this.field_W.a(25, -25 + (this.field_u + 20) >> 1, -125, -var2 + this.field_F >> 1, 140);
          this.field_T.a(30, (this.field_u - 10 >> 1) + 2, -124, 10 + ((-var2 + this.field_F >> 1) + 140), 100);
          return;
        }
        field_P = (int[]) null;
        var2Lifetime1 = 250;
        this.field_W.a(25, -25 + (this.field_u + 20) >> 1, -125, -var2Lifetime1 + this.field_F >> 1, 140);
        this.field_T.a(30, (this.field_u - 10 >> 1) + 2, -124, 10 + ((-var2Lifetime1 + this.field_F >> 1) + 140), 100);
    }

    final static void a(bh param0, boolean param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          tl.field_X = param0.e(127) << 5;
          var2_int = param0.d((byte) -99);
          l.field_j = (7 & var2_int) << 18;
          tl.field_X = tl.field_X + (var2_int >> 3);
          l.field_j = l.field_j + (param0.e(127) << 2);
          var2_intLifetime1 = param0.d((byte) -99);
          fd.field_F = var2_intLifetime1 << 15 & 2064384;
          l.field_j = l.field_j + (var2_intLifetime1 >> 6);
          fd.field_F = fd.field_F + (param0.d((byte) -99) << 7);
          if (param1) {
            wf var3 = (wf) null;
            lb.a((wf) null, 38);
          }
          var2_intLifetime2 = param0.d((byte) -99);
          om.field_Nb = (var2_intLifetime2 & 1) << 16;
          fd.field_F = fd.field_F + (var2_intLifetime2 >> 1);
          om.field_Nb = om.field_Nb + param0.e(127);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "lb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        field_S = null;
        if (param0 == 0) {
          field_Q = null;
          field_U = null;
          field_P = null;
          return;
        }
        field_V = 73;
        field_Q = null;
        field_U = null;
        field_P = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        dh.field_d.b(na.field_G, param1 + (this.field_t + 4), dh.field_d.field_N + this.field_w + (param2 + 4), 16777215, -1);
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (param0 >= 0) {
          return;
        }
        if (this.field_W.a(-109).c(-77) != pf.field_a) {
          return;
        }
        try {
          qe.a(this.field_W.a(false), 0, this.field_W.f((byte) 90), this.field_W.g((byte) 12));
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "lb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static bf a(wf param0, int param1) {
        RuntimeException var2 = null;
        bf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 573509761) {
            field_U = (String) null;
          }
          stackIn_3_0 = we.a(-11040, ee.a(param0, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("lb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_U = "Connection lost. <%0>";
        field_S = new int[8192];
        field_Q = new int[8192];
    }
}
