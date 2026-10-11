/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends f implements bp {
    private dl field_F;
    static wa[] field_J;
    static String field_E;
    static qr field_D;
    static String field_M;
    static int field_L;
    private kg[] field_I;
    static eb field_K;
    static bi field_H;
    private String[] field_G;

    public static void a(int param0) {
        if (param0 != 9075) {
          bj.a(-83);
        }
        field_E = null;
        field_D = null;
        field_M = null;
        field_K = null;
        field_J = null;
        field_H = null;
    }

    final static void k(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          nm.field_a = -1 + gf.field_k;
          if (param0 != 26987) {
            field_H = (bi) null;
          }
          er.field_i = 0;
          if (field_J != null &&
            gf.field_k <= field_J.length) {
            for (var1_int = 0; var1_int < gf.field_k; var1_int++) {
              field_J[var1_int] = null;
            }
            return;
          }
          field_J = new wa[gf.field_k];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "bj.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        nq var5 = gn.field_u;
        if (this.field_G != null) {
          var5.a(da.field_c, param3 + this.field_m, this.field_q + param2, this.field_x, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_J);
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_G.length; var6_int++) {
            if (this.field_I[var6_int] == param0) {
              this.field_F.a(15270, this.field_G[var6_int]);
            }
          }
          if (param1 != 6) {
            this.a(105, -29, -115, 86);
          }
          if (this.field_I[this.field_G.length] == param0) {
            this.field_F.a(2147483647);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("bj.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    bj(dl param0) {
        super(0, 0, 0, 0, (iq) null);
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        rq var4 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_A.a(0);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_G = new String[var3_int];
            for (var4_int = param1; var3_int > var4_int; var4_int++) {
              this.field_G[var4_int] = ih.a((CharSequence) ((Object) param0[var4_int]), 68).replace(' ', ' ');
            }
            var4 = new rq(gn.field_u, 0, 1);
            this.field_I = new kg[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_I[var5] = new kg(this.field_G[var5], (ko) (this));
              this.field_I[var5].field_p = (iq) ((Object) var4);
              this.field_I[var5].field_v = ip.field_f;
              this.field_I[var5].a(20 + var5 * 16, 15, (byte) 112, 0, 80);
              this.b((byte) -107, this.field_I[var5]);
            }
            this.field_I[var3_int] = new kg(vl.field_p, (ko) (this));
            this.field_I[var3_int].field_p = (iq) ((Object) var4);
            this.field_I[var3_int].a(16 + (var3_int * 16 + 20), 15, (byte) 102, 0, 100);
            this.b((byte) -65, this.field_I[var3_int]);
            return;
          }
          this.field_G = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bj.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2 + 0, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a(param3, true);
            return stackIn_6_0;
          }
          if (param2 != 13) {
            return true;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_13_0 = this.a(param3, 116);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("bj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_M = "<%0> has left.";
    }
}
