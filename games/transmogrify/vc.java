/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends rg implements ie {
    private wa field_Q;
    static nk field_G;
    static int field_O;
    private int field_P;
    static q field_N;

    public static void p(int param0) {
        if (param0 < 78) {
          vc.p(67);
          field_G = null;
          field_N = null;
          return;
        }
        field_G = null;
        field_N = null;
    }

    final void a(int param0, wa param1) {
        try {
          int var3_int = 32 / ((-1 - param0) / 56);
          this.field_Q = param1;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "vc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final wa a(byte param0) {
        int var2 = -111 / ((46 - param0) / 34);
        return this.field_Q;
    }

    final void e(byte param0) {
        super.e((byte) 117);
        if (this.field_Q != null) {
          this.field_Q.a(true);
        }
        if (param0 > 43) {
          return;
        }
        this.field_Q = (wa) null;
    }

    vc(String param0, ma param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean e(boolean param0) {
        if (param0) {
          return false;
        }
        if (gl.field_y < 10) {
          return false;
        }
        if (!ge.field_x) {
          return !i.b(true) ? true : false;
        }
        return false;
    }

    final String f(int param0) {
        if (!this.field_g) {
          return null;
        }
        if (this.field_j == null) {
          return null;
        }
        if (param0 == 4) {
          sh.a((byte) 123, this.field_l + (-this.field_P + oa.field_j), bk.field_a);
          return this.field_j;
        }
        this.field_Q = (wa) null;
        sh.a((byte) 123, this.field_l + (-this.field_P + oa.field_j), bk.field_a);
        return this.field_j;
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_P = -param3 + (oa.field_j - this.field_p);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "vc.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_G = new nk(2);
        field_N = new q();
    }
}
