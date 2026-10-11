/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ga implements el {
    static int field_S;
    private rg field_P;
    static int[] field_T;
    static double[] field_R;
    static int field_H;
    private rg field_Q;
    static int field_L;
    private rg field_O;

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (this.field_P != param3) {
            if (param3 == this.field_O) {
              jl.a((byte) -124);
            } else {
              if (param3 == this.field_Q) {
                bd.a(1849965346);
              }
            }
          } else {
            rk.b((byte) 120);
          }
          if (param0 >= 68) {
            return;
          }
          field_H = -89;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("tg.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -115, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.c(param0, 32);
            return stackIn_7_0;
          }
          var5_int = 39 / ((param1 - 47) / 43);
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(17731, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tg.Q(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public tg() {
        super(0, 0, 476, 225, (fe) null);
        this.field_O = new rg(ej.field_c, (uk) null);
        this.field_P = new rg(qn.field_m, (uk) null);
        this.field_Q = new rg(ug.field_cb, (uk) null);
        je var1 = new je();
        this.field_O.field_n = (fe) ((Object) var1);
        this.field_P.field_n = (fe) ((Object) var1);
        this.field_Q.field_n = (fe) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_P.a(-110, var4, -48 + this.field_z - var2, 30, -var3 + this.field_F >> 1);
        this.field_Q.a(-128, var4, -48 + this.field_z - var2, 30, (-var3 + this.field_F >> 1) + (var4 + var2));
        this.field_O.a(-111, var3, -78 + this.field_z - 2 * var2, 30, this.field_F - var3 >> 1);
        this.field_P.field_t = (uk) (this);
        this.field_O.field_t = (uk) (this);
        this.field_O.field_C = eh.field_eb;
        this.field_Q.field_t = (uk) (this);
        this.field_Q.field_C = nl.field_a;
        this.b(this.field_P, 10);
        this.b(this.field_O, 10);
        this.b(this.field_Q, 10);
    }

    public static void g(byte param0) {
        field_T = null;
        if (param0 <= 123) {
          field_S = 121;
          field_R = null;
          return;
        }
        field_R = null;
    }

    final static void a(byte param0) {
        if (param0 > -120) {
          field_H = 85;
          eb.a((byte) -122);
          return;
        }
        eb.a((byte) -122);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param2 >= 36) {
          var5 = this.field_q + param3;
          var6 = this.field_m + param0;
          gm.field_cb.a(gb.field_c, 20 + var5, var6 + 20, -40 + this.field_F, -50 + this.field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
          super.a(param0, param1, (byte) 86, param3);
          return;
        }
        field_R = (double[]) null;
        var5Lifetime1 = this.field_q + param3;
        var6Lifetime1 = this.field_m + param0;
        gm.field_cb.a(gb.field_c, 20 + var5Lifetime1, var6Lifetime1 + 20, -40 + this.field_F, -50 + this.field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
        super.a(param0, param1, (byte) 86, param3);
    }

    static {
        field_S = -1;
        field_T = new int[8192];
        field_R = new double[]{0.2, 0.2, 0.2, 0.06};
        field_L = 640;
    }
}
