/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends hn implements ba, ng {
    private lg field_E;
    static gg[] field_F;
    static la field_C;
    private gp field_H;
    private lg field_B;
    static int field_G;
    vp field_I;

    private final int a(int param0, int param1, String param2, gm param3, int param4, boolean param5, String param6) {
        RuntimeException var8 = null;
        bj var9 = null;
        na var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new na(20, param0, param1 + 120, 25, param3, false, 120, 3, dg.field_e, 16777215, param2);
          this.a(var10, -6938);
          var9 = new bj(((wg) ((Object) param3)).a(-10116), param6, 126, param0 + var10.field_o, param1 + 25, param4);
          var9.field_t = (ca) (this);
          if (!param5) {
            this.field_I = (vp) null;
          }
          this.a(var9, -6938);
          stackIn_3_0 = var9.field_o + var10.field_o;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("th.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        gm var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -85) {
            var7 = (gm) null;
            this.a(-56, (gm) null, 62, 24);
          }
          if (this.field_E == param1) {
            og.a(6);
            return;
          }
          if (this.field_B != param1) {
            return;
          }
          this.g((byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("th.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(byte param0) {
        ((il) (this.field_H.a(-10116))).e(-97);
        if (param0 < 89) {
          this.field_I = (vp) null;
        }
    }

    final static void a(int param0, gg param1) {
        try {
          tb.field_l.a(param1, param0, on.field_c * 96 / 160);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "th.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Torquing.field_u;
        if (param7 >= param13) {
          if (param15 > param7) {
            kj.a(param3, param2, param11, param9, param0, ph.field_e, param1, param10 + 388870409, param5, param14, param6, param7, param4, param12, param8, param13, param15);
          } else {
            if (param15 > param13) {
              kj.a(param6, param2, param11, param12, param14, ph.field_e, param5, 388870384, param1, param0, param3, param15, param4, param9, param8, param13, param7);
            } else {
              kj.a(param8, param12, param14, param2, param11, ph.field_e, param5, 388870384, param4, param0, param3, param13, param1, param9, param6, param15, param7);
            }
          }
        } else {
          if (param13 < param15) {
            kj.a(param8, param9, param0, param2, param11, ph.field_e, param1, 388870384, param4, param14, param6, param13, param5, param12, param3, param7, param15);
          } else {
            if (param15 <= param7) {
              kj.a(param3, param12, param14, param9, param0, ph.field_e, param4, param10 ^ -388870377, param5, param11, param8, param7, param1, param2, param6, param15, param13);
            } else {
              kj.a(param6, param9, param0, param12, param14, ph.field_e, param4, param10 ^ -388870377, param1, param11, param8, param15, param5, param2, param3, param7, param13);
            }
          }
        }
        if (param10 == -25) {
          return;
        }
        th.a(21, -20, -21, -16, -119, -99, 65, 87, -16, -122, -124, -67, -66, 29, 56, -5);
    }

    private final boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        if (!this.a(-127, this.field_H)) {
          return false;
        }
        return true;
    }

    private final boolean a(int param0, wg param1) {
        sk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cd var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 119 / ((-49 - param0) / 63);
          var3 = param1.a(-10116);
          if (var3 == null) {
            return true;
          }
          var5 = var3.a((byte) -77);
          stackIn_7_0 = (so.field_s == var5);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("th.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_F = null;
        field_C = null;
        if (param0 != 2147483647) {
          field_F = (gg[]) null;
        }
    }

    public final void a(byte param0, String param1) {
        gp var3 = null;
        String var4 = null;
        if (param0 != 21) {
          return;
        }
        try {
          var3 = this.field_H;
          var4 = param1;
          ((tk) ((Object) var3)).a(false, var4, true);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "th.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public th() {
        super(0, 0, 496, 0, (el) null);
        this.field_H = new gp("", (ca) null, 12);
        pc var1 = new pc(sp.field_R, 0, 0, 0, 0, 16777215, -1, 3, 0, dg.field_e.field_x, -1, 2147483647, true);
        gm var2 = new gm(sa.field_a, var1, (ca) null);
        this.field_B = new lg(dh.field_d, (ca) null);
        this.field_E = new lg(dg.field_j, (ca) null);
        this.field_H.field_n = ag.field_d;
        this.field_H.a(new il(this.field_H), 83);
        this.field_B.field_x = false;
        this.field_B.field_q = (el) ((Object) new rf());
        this.field_E.field_q = (el) ((Object) new je());
        this.field_H.field_q = (el) ((Object) new ig(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a((byte) -70, 20, var3, 50, 270);
        this.a(var2, -6938);
        var3 += 50;
        var3 = var3 + (this.a(de.field_b, 170, this.field_H, ad.field_l, var3, 126) + 5);
        this.field_B.a((byte) 124, 496 - var5 >> 1, var3, 40, var5);
        this.field_E.a((byte) 125, 3 + var4, 15 + var3, 40, 60);
        this.field_E.field_t = (ca) (this);
        this.field_B.field_t = (ca) (this);
        this.a(this.field_B, -6938);
        this.a(this.field_E, -6938);
        this.field_I = new vp((ba) (this));
        this.field_I.a((byte) -94, this.field_H.field_w + (this.field_H.field_p + 60), 20, 150, -this.field_H.field_w + (this.field_p - this.field_H.field_p - 60));
        this.a(this.field_I, -6938);
        this.a((byte) 127, 0, 0, var3 + 55 + var4, 496);
    }

    private final int a(String param0, int param1, gm param2, String param3, int param4, int param5) {
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
          if (param5 >= 111) {
            stackIn_4_0 = this.a(param4, param1, param3, param2, 35, true, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -54;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("th.I(");
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 <= 119) {
          this.a(23, (gm) null, 'ﾚ', -1);
          if (this.b(true)) {
            cm.a((byte) -21, this.field_H.field_m);
            return;
          }
          return;
        }
        if (this.b(true)) {
          cm.a((byte) -21, this.field_H.field_m);
          return;
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 107)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_5_0 = this.a((byte) -120, param1);
            return stackIn_5_0;
          }
          if (param0 == 99) {
            stackIn_9_0 = this.b(param1, -9928);
            return stackIn_9_0;
          }
          var5_int = 30 / ((param3 + 33) / 57);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("th.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, gm param1, int param2, int param3) {
        try {
          super.a(-113, param1, param2, param3);
          this.field_B.field_x = this.b(true);
          int var5_int = 109 % ((param0 + 28) / 43);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "th.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_F = new gg[29];
    }
}
