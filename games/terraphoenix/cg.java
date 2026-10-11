/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gb implements n {
    private eb field_J;
    static ok field_K;
    private eb field_G;
    static String field_H;
    private eb field_F;
    static String field_I;

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -106) {
          return;
        }
        int var5 = param0 + this.field_w;
        int var6 = this.field_u + param3;
        qk.field_e.a(gb.field_A, 20 + var5, 20 + var6, -40 + this.field_p, this.field_n - 50, 16777215, -1, 1, 0, qk.field_e.field_s);
        super.a(param0, -125, param2, param3);
    }

    final static void f(byte param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = Terraphoenix.field_V;
        try {
          ob.b();
          me.field_m = new int[260];
          hb.field_l = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            me.field_m[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          if (param0 > -43) {
            field_H = (String) null;
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (me.field_m.length > var5) {
            me.field_m[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "cg.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_H = null;
        if (param0 != 4) {
          return;
        }
        field_K = null;
        field_I = null;
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Terraphoenix.field_V;
        try {
          var6_int = 36 / ((param4 + 5) / 57);
          if (this.field_G != param0) {
            if (this.field_F == param0) {
              oe.a(-47);
            } else {
              if (this.field_J == param0) {
                bm.a(-126);
              }
            }
          } else {
            ld.a(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("cg.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_5_0 = this.a(48, param1);
            return stackIn_5_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_8_0 = this.a(param1, (byte) 100);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("cg.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public cg() {
        super(0, 0, 476, 225, (cj) null);
        this.field_F = new eb(td.field_j, (sc) null);
        this.field_G = new eb(sl.field_f, (sc) null);
        this.field_J = new eb(aj.field_c, (sc) null);
        ic var1 = new ic();
        this.field_F.field_l = (cj) ((Object) var1);
        this.field_G.field_l = (cj) ((Object) var1);
        this.field_J.field_l = (cj) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_G.a(-var2 + (this.field_n - 48), (byte) 48, var4, this.field_p - var3 >> 1, 30);
        this.field_J.a(this.field_n - 48 - var2, (byte) 51, var4, var4 + (-var3 + this.field_p >> 1) + var2, 30);
        this.field_F.a(-(2 * var2) - 78 + this.field_n, (byte) 111, var3, this.field_p - var3 >> 1, 30);
        this.field_G.field_r = (sc) (this);
        this.field_F.field_r = (sc) (this);
        this.field_J.field_r = (sc) (this);
        this.field_F.field_x = sj.field_d;
        this.field_J.field_x = qf.field_b;
        this.b((byte) 95, this.field_G);
        this.b((byte) 95, this.field_F);
        this.b((byte) 95, this.field_J);
    }

    static {
        field_I = "    Covering Terrain";
    }
}
