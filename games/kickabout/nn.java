/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends wj implements vh {
    private wi field_H;
    static ot field_B;
    static String field_L;
    static ot field_K;
    static String[] field_G;
    private wi field_J;
    static boolean field_D;
    static String[] field_I;
    private wi field_E;
    static ut field_C;

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          if (param3 <= 64) {
            return;
          }
          if (param1 == this.field_J) {
            nn.a(-25085);
            return;
          }
          if (param1 == this.field_E) {
            fr.a((byte) -76);
            return;
          }
          if (this.field_H != param1) {
            return;
          }
          bh.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("nn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == -25085) {
          var2 = (String) null;
          ui.a("", (byte) 111, (String) null);
          return;
        }
        nn.k(115);
        var2Lifetime1 = (String) null;
        ui.a("", (byte) 111, (String) null);
    }

    public static void k(int param0) {
        if (param0 == 2) {
          field_L = null;
          field_B = null;
          field_I = null;
          field_G = null;
          field_K = null;
          field_C = null;
          return;
        }
        field_C = (ut) null;
        field_L = null;
        field_B = null;
        field_I = null;
        field_G = null;
        field_K = null;
        field_C = null;
    }

    public nn() {
        super(0, 0, 476, 225, (gj) null);
        this.field_E = new wi(dw.field_f, (jv) null);
        this.field_J = new wi(vb.field_e, (jv) null);
        this.field_H = new wi(ba.field_o, (jv) null);
        op var1 = new op();
        this.field_E.field_r = (gj) ((Object) var1);
        this.field_J.field_r = (gj) ((Object) var1);
        this.field_H.field_r = (gj) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_J.a(30, 1, this.field_n - var3 >> 1, var4, -var2 + (this.field_i - 48));
        this.field_H.a(30, 1, var4 + ((-var3 + this.field_n >> 1) + var2), var4, -48 + (this.field_i - var2));
        this.field_E.a(30, 1, this.field_n - var3 >> 1, var3, -(var2 * 2) + (this.field_i - 78));
        this.field_J.field_k = (jv) (this);
        this.field_E.field_k = (jv) (this);
        this.field_H.field_k = (jv) (this);
        this.field_E.field_u = so.field_c;
        this.field_H.field_u = pv.field_G;
        this.a(-59, this.field_J);
        this.a(-121, this.field_E);
        this.a(-54, this.field_H);
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -101, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_7_0 = this.a(param2, (byte) -100);
            return stackIn_7_0;
          }
          if (param1 >= -60) {
            return true;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_14_0 = this.b(param2, (byte) 126);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("nn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_t;
        int var6 = param3 + this.field_g;
        gf.field_a.a(vb.field_i, 20 + var5, 20 + var6, this.field_n - 40, this.field_i - 50, 16777215, -1, 1, 0, gf.field_a.field_G);
        super.a(param0, (int) (char)param1, param2, param3);
    }

    static {
        field_G = new String[]{"POW:", "SPD:", "TCK:", "EXP:"};
        field_D = false;
        field_L = "<%0> has resigned.";
    }
}
