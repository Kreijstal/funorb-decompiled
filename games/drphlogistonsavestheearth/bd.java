/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bd extends pj {
    boolean field_Q;
    static int field_M;
    private int field_J;
    static int field_L;
    private k field_R;
    static boolean field_N;
    static bb field_T;
    static java.awt.Font field_S;
    static char[] field_K;
    static nh field_P;
    static boolean[] field_O;

    private final int i(int param0) {
        if (param0 == 0) {
          return this.field_Q ? this == this.field_R.k(127) ? 256 : 0 : 0;
        }
        this.k(-92);
        return this.field_Q ? this == this.field_R.k(127) ? 256 : 0 : 0;
    }

    bd(k param0, int param1, int param2) {
        super(-param1 + di.field_a >> 1, qe.field_l - param2 >> 1, param1, param2, (cg) null);
        try {
          this.field_Q = false;
          this.field_R = param0;
          this.field_J = 0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean j(int param0) {
        this.field_J = this.i(param0);
        if (this.field_J != 0) {
          return false;
        }
        if (!this.field_Q) {
          return true;
        }
        return false;
    }

    final vg g(int param0) {
        vg var2 = null;
        vg var2Lifetime1;
        if (param0 != -22426) {
          this.field_J = 100;
          var2 = super.g(param0 ^ 0);
          if (var2 == null) {
            return (vg) (this);
          }
          return var2;
        }
        var2Lifetime1 = super.g(param0 ^ 0);
        if (var2Lifetime1 == null) {
          return (vg) (this);
        }
        return var2Lifetime1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (this.field_J == 0) {
          return;
        }
        if (this.field_J >= 256) {
          if (0 == param1) {
            this.c(this.field_m + param3, 119, param0 + this.field_o);
            super.a(param0, param1, (byte) -21, param3);
            return;
          }
          return;
        }
        if (uk.field_f == null) {
          uk.field_f = new nh(this.field_w, this.field_k);
          aj.a(uk.field_f, (byte) 79);
          wj.c();
          this.c(0, param2 ^ -68, 0);
          super.a(-param0 - this.field_o, param1, param2, -this.field_m - param3);
          cl.d((byte) -106);
          uk.field_f.e(param0 + this.field_o, param3 + this.field_m, this.field_J);
          return;
        }
        if (this.field_w > uk.field_f.field_y) {
          uk.field_f = new nh(this.field_w, this.field_k);
          aj.a(uk.field_f, (byte) 79);
          wj.c();
          this.c(0, param2 ^ -68, 0);
          super.a(-param0 - this.field_o, param1, param2, -this.field_m - param3);
          cl.d((byte) -106);
          uk.field_f.e(param0 + this.field_o, param3 + this.field_m, this.field_J);
          return;
        }
        if (uk.field_f.field_w < this.field_k) {
          uk.field_f = new nh(this.field_w, this.field_k);
          aj.a(uk.field_f, (byte) 79);
          wj.c();
          this.c(0, param2 ^ -68, 0);
          super.a(-param0 - this.field_o, param1, param2, -this.field_m - param3);
          cl.d((byte) -106);
          uk.field_f.e(param0 + this.field_o, param3 + this.field_m, this.field_J);
          return;
        }
        aj.a(uk.field_f, (byte) 79);
        wj.c();
        this.c(0, param2 ^ -68, 0);
        super.a(-param0 - this.field_o, param1, param2, -this.field_m - param3);
        cl.d((byte) -106);
        uk.field_f.e(param0 + this.field_o, param3 + this.field_m, this.field_J);
    }

    public static void a(byte param0) {
        field_T = null;
        field_S = null;
        field_P = null;
        field_K = null;
        field_O = null;
        int var1 = -114 / ((-67 - param0) / 45);
    }

    final void b(int param0, int param1, int param2) {
        if (param1 == 1688990433) {
          this.a(qe.field_l - param2 >> 1, param2, -param0 + di.field_a >> 1, 16535, param0);
          return;
        }
        field_K = (char[]) null;
        this.a(qe.field_l - param2 >> 1, param2, -param0 + di.field_a >> 1, 16535, param0);
    }

    boolean k(int param0) {
        int var2 = this.i(0);
        int var3 = -this.field_J + var2;
        if (0 < var3) {
          this.field_J = this.field_J + (-1 + (var3 + 8)) / 8;
        }
        if (param0 != 2968) {
          return true;
        }
        if (0 > var3) {
          this.field_J = this.field_J + (var3 - 15) / 16;
        }
        if (this.field_J != 0) {
          return false;
        }
        if (var2 == 0) {
          return !this.field_Q ? true : false;
        }
        return false;
    }

    abstract void c(int param0, int param1, int param2);

    static {
        field_K = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_T = new bb();
    }
}
