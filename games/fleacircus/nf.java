/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends gj implements pe, da {
    static int field_K;
    static jd field_M;
    private bc field_I;
    ij field_H;
    static byte[] field_G;
    private bb field_J;
    private bb field_L;
    static ej field_F;

    private final boolean e(byte param0) {
        if (param0 > -46) {
          return true;
        }
        if (this.a(10000536, (nh) (this.field_I))) {
          return true;
        }
        return false;
    }

    private final int a(String param0, String param1, int param2, byte param3, int param4, int param5, qa param6) {
        RuntimeException var8 = null;
        v var9 = null;
        ml var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new ml(20, param2, 120 + param4, 25, param6, false, 120, 3, ug.field_e, 16777215, param1);
          this.a((qa) (var10), (byte) -107);
          if (param3 != 109) {
            stackIn_2_0 = 12;
            return stackIn_2_0;
          }
          var9 = new v(((nh) ((Object) param6)).a((byte) 55), param0, 126, param2 + var10.field_j, 25 + param4, param5);
          var9.field_s = (kd) (this);
          this.a((qa) (var9), (byte) -124);
          stackIn_4_0 = var9.field_j + var10.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("nf.FA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void j(int param0) {
        if (!this.e((byte) -113)) {
          return;
        }
        if (param0 == 3) {
          el.a(this.field_I.field_i, (byte) 126);
          return;
        }
        nf.f((byte) 10);
        el.a(this.field_I.field_i, (byte) 126);
    }

    public final void a(int param0) {
        ((vf) (this.field_I.a((byte) 76))).d(true);
        if (param0 > -66) {
          qa var3 = (qa) null;
          this.a(26, 17, (qa) null, '﾿');
        }
    }

    public final void a(String param0, byte param1) {
        bc var3 = null;
        String var4 = null;
        try {
          if (param1 != -96) {
            nf.f((byte) 39);
          }
          var3 = this.field_I;
          var4 = param0;
          ((c) ((Object) var3)).a(false, (byte) -69, var4);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "nf.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public nf() {
        super(0, 0, 496, 0, (ch) null);
        this.field_I = new bc("", (kd) null, 12);
        e var1 = new e(nb.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, ug.field_e.field_H, -1, 2147483647, true);
        qa var2 = new qa(t.field_c, var1, (kd) null);
        this.field_J = new bb(e.field_g, (kd) null);
        this.field_L = new bb(gd.field_d, (kd) null);
        this.field_I.field_m = df.field_c;
        this.field_I.a(true, new vf(this.field_I));
        this.field_J.field_D = false;
        this.field_J.field_p = (ch) ((Object) new ri());
        this.field_L.field_p = (ch) ((Object) new me());
        this.field_I.field_p = (ch) ((Object) new aa(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, var3, 50, 80);
        this.a(var2, (byte) -50);
        var3 += 50;
        var3 = var3 + (5 + this.a(me.field_a, 98, bb.field_J, var3, 170, this.field_I));
        this.field_J.a(-var5 + 496 >> 1, var5, var3, 40, 80);
        this.field_L.a(3 + var4, 60, var3 + 15, 40, 80);
        this.field_L.field_s = (kd) (this);
        this.field_J.field_s = (kd) (this);
        this.a((qa) (this.field_J), (byte) -45);
        this.a((qa) (this.field_L), (byte) -126);
        this.field_H = new ij((pe) (this));
        this.field_H.a(60 + this.field_I.field_y + this.field_I.field_u, -this.field_I.field_u + (-this.field_I.field_y + this.field_u - 60), 20, 150, 80);
        this.a((qa) (this.field_H), (byte) -38);
        this.a(0, 496, 0, var4 + (55 + var3), 80);
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        try {
          if (param3 > -85) {
            this.field_J = (bb) null;
          }
          super.a(param0, param1, param2, (byte) -96);
          this.field_J.field_D = this.e((byte) -74);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "nf.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 248) {
            this.j(115);
          }
          if (this.field_L == param4) {
            na.a((byte) -121);
            return;
          }
          if (this.field_J != param4) {
            return;
          }
          this.j(3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("nf.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean a(int param0, nh param1) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10000536) {
            this.j(121);
          }
          var3 = param1.a((byte) -100);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(false);
          stackIn_8_0 = (var4 == hm.field_b);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("nf.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_7_0 = this.b(param2, -28533);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(32, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nf.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(String param0, int param1, String param2, int param3, int param4, qa param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 98) {
            stackIn_4_0 = this.a(param2, param0, param3, (byte) 109, param4, 35, param5);
            return stackIn_4_0;
          }
          stackIn_2_0 = -126;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("nf.BA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_M = null;
        field_F = null;
        if (param0 >= -40) {
          return;
        }
        field_G = null;
    }

    static {
        field_G = new byte[520];
    }
}
