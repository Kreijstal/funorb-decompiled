/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends lc implements rc {
    private wd field_z;
    private wd field_A;
    static bc field_B;
    private wd field_F;
    static int field_C;
    static String field_E;
    static int field_D;
    static volatile boolean field_H;

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.a((byte) -71, param0);
            return stackIn_6_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param0, 19755);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("k.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Bounce.field_N;
        try {
          if (param0 < 6) {
            return;
          }
          if (this.field_A == param4) {
            hc.a(0);
            return;
          }
          if (this.field_z == param4) {
            ii.n(8);
            return;
          }
          if (this.field_F != param4) {
            return;
          }
          u.a((byte) -10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("k.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public k() {
        super(0, 0, 476, 225, (fc) null);
        this.field_z = new wd(gk.field_m, (sk) null);
        this.field_A = new wd(rg.field_e, (sk) null);
        this.field_F = new wd(bi.field_i, (sk) null);
        jh var1 = new jh();
        this.field_z.field_j = (fc) ((Object) var1);
        this.field_A.field_j = (fc) ((Object) var1);
        this.field_F.field_j = (fc) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_A.b(30, 80, var4, -var3 + this.field_k >> 1, this.field_m - (48 + var2));
        this.field_F.b(30, 80, var4, var4 + (this.field_k - var3 >> 1) + var2, -var2 - 48 + this.field_m);
        this.field_z.b(30, 80, var3, this.field_k - var3 >> 1, -(2 * var2) + (-78 + this.field_m));
        this.field_A.field_n = (sk) (this);
        this.field_z.field_n = (sk) (this);
        this.field_z.field_q = ge.field_a;
        this.field_F.field_n = (sk) (this);
        this.field_F.field_q = nf.field_a;
        this.b(this.field_A, true);
        this.b(this.field_z, true);
        this.b(this.field_F, true);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param3 + this.field_r;
        int var6 = param1 + this.field_i;
        if (param2 >= 33) {
          sg.field_a.a(r.field_d, 20 + var5, var6 + 20, this.field_k - 40, this.field_m - 50, 16777215, -1, 1, 0, sg.field_a.field_s);
          super.a(param0, param1, 50, param3);
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 != -81) {
          k.e((byte) 88);
          field_B = null;
          field_E = null;
          return;
        }
        field_B = null;
        field_E = null;
    }

    static {
        field_B = new bc();
        field_C = 0;
        field_E = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_H = true;
    }
}
