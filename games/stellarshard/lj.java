/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends g implements rf, oi {
    static String field_C;
    private pl field_E;
    private ig field_G;
    static String field_B;
    static byte[][] field_D;
    ul field_F;
    private ig field_H;

    private final boolean a(int param0, je param1) {
        w var3 = null;
        RuntimeException var3_ref = null;
        cg var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) 65);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b(-28036);
          if (param0 == 31142) {
            stackIn_10_0 = (lg.field_c == var4);
            return stackIn_10_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("lj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, rj param2, String param3, String param4, int param5) {
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
          if (param1 == 64) {
            stackIn_4_0 = this.a(param3, param0, param5, 35, param4, (byte) -120, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 105;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("lj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0) {
        ((ge) (this.field_E.a((byte) 119))).a(false);
        int var2 = -28 % ((param0 - 63) / 60);
    }

    public lj() {
        super(0, 0, 496, 0, (uk) null);
        this.field_E = new pl("", (lf) null, 12);
        id var1 = new id(de.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, si.field_V.field_N, -1, 2147483647, true);
        rj var2 = new rj(l.field_d, var1, (lf) null);
        this.field_H = new ig(sf.field_e, (lf) null);
        this.field_G = new ig(bb.field_l, (lf) null);
        this.field_E.field_x = fc.field_d;
        this.field_E.a((byte) -2, new ge(this.field_E));
        this.field_H.field_E = false;
        this.field_H.field_u = (uk) ((Object) new b());
        this.field_G.field_u = (uk) ((Object) new ll());
        this.field_E.field_u = (uk) ((Object) new vg(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.b(270, 20, var3, 50, 23987);
        int var5 = 200;
        var3 += 50;
        this.b(4, var2);
        var3 = var3 + (5 + this.a(170, (byte) 64, this.field_E, si.field_I, nk.field_h, var3));
        this.field_H.b(var5, -var5 + 496 >> 1, var3, 40, 23987);
        this.field_G.b(60, 3 + var4, var3 + 15, 40, 23987);
        this.field_G.field_v = (lf) (this);
        this.field_H.field_v = (lf) (this);
        this.b(4, this.field_H);
        this.b(4, this.field_G);
        this.field_F = new ul((rf) (this));
        this.field_F.b(-60 + (-this.field_E.field_p + this.field_p - this.field_E.field_w), 60 + this.field_E.field_w + this.field_E.field_p, 20, 150, 23987);
        this.b(4, this.field_F);
        this.b(496, 0, 0, var3 - (-55 - var4), 23987);
    }

    public static void h(int param0) {
        field_C = null;
        field_B = null;
        if (param0 != 120) {
          return;
        }
        field_D = (byte[][]) null;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_H.field_E = this.e((byte) 34);
          if (param1) {
            this.field_E = (pl) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lj.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, byte param5, rj param6) {
        RuntimeException var8 = null;
        cd var9 = null;
        int var10 = 0;
        kg var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new kg(20, param2, param1 + 120, 25, param6, false, 120, 3, si.field_V, 16777215, param0);
          this.b(4, var11);
          var9 = new cd(((je) ((Object) param6)).a((byte) 48), param4, 126, var11.field_t + param2, param1 + 25, param3);
          var9.field_v = (lf) (this);
          var10 = -34 / ((-78 - param5) / 35);
          this.b(4, var9);
          stackIn_1_0 = var11.field_t + var9.field_t;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("lj.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != this.field_G) {
            if (this.field_H == param2) {
              this.f((byte) 120);
            }
          } else {
            ll.c(32270);
          }
          if (!param3) {
            return;
          }
          this.field_F = (ul) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("lj.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(byte param0, String param1) {
        pl var3 = null;
        String var4 = null;
        try {
          int var5 = 52 % ((param0 - 61) / 62);
          var3 = this.field_E;
          var4 = param1;
          ((ae) ((Object) var3)).a((byte) 20, var4, false);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0 + 0, param1, param2, param3)) {
            return true;
          }
          if (param0 != 29657) {
            return true;
          }
          if (param1 == 98) {
            stackIn_9_0 = this.a(param3, -8666);
            return stackIn_9_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_13_0 = this.a(param3, (byte) 66);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("lj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void f(byte param0) {
        if (!this.e((byte) 34)) {
          return;
        }
        gg.a(this.field_E.field_m, 97);
        int var2 = 72 / ((59 - param0) / 49);
    }

    private final boolean e(byte param0) {
        if (!this.a(param0 + 31108, (je) (this.field_E))) {
          return false;
        }
        if (param0 == 34) {
          return true;
        }
        this.field_H = (ig) null;
        return true;
    }

    static {
        field_C = "You have 1 unread message!";
        field_B = "Loading extra data";
    }
}
