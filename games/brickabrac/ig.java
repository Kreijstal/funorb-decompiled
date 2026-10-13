/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends ib implements ha, en {
    private d field_L;
    private qf field_I;
    static long[] field_M;
    static int field_N;
    private lg field_O;
    static String field_K;
    static RgbSprite field_P;
    static String field_J;

    private final String h(int param0) {
        if (param0 != 0) {
          d var3 = (d) null;
          this.a(50, 62, (byte) 59, -10, (d) null);
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, lg param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param2 == 0) {
            ih.a("terms.ws", param1 + 538);
          } else {
            if (param2 == 1) {
              ih.a("privacy.ws", param1 + 538);
            } else {
              if (2 == param2) {
                ih.a("conduct.ws", param1 + 538);
              }
            }
          }
          if (param1 != -526) {
            field_K = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ig.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          Rasterizer2D.drawHorizontalLine(param1, param3, param2 + 1, 10000536);
          Rasterizer2D.drawHorizontalLine(param1, param3 + param0, param2 + 1, 12105912);
          var5_int = 1;
          var6 = param0;
          if (var5_int + param3 < Rasterizer2D.clipTop) {
            var5_int = -param3 + Rasterizer2D.clipTop;
          }
          if (Rasterizer2D.clipBottom < param3 + var6) {
            var6 = -param3 + Rasterizer2D.clipBottom;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 48 * var7 / param0 + 152;
            var9 = var8 | (var8 << 8 | var8 << 16);
            Rasterizer2D.pixels[param1 + (param3 + var7) * Rasterizer2D.width] = var9;
            Rasterizer2D.pixels[param2 + (param1 + (param3 + var7) * Rasterizer2D.width)] = var9;
          }
          if (param4 != -17634) {
            ig.b(-122, -110, 30, -70, -97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var5), "ig.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 == this.field_L) {
            ek.l(111);
            this.field_I.m(17);
          }
          if (param2 > -22) {
            this.field_L = (d) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ig.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    ig(qf param0) {
        super(0, 0, 288, 0, (ub) null);
        String var7 = null;
        int var3 = 0;
        um var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_I = param0;
          this.field_L = new d(ri.field_L, (uh) null);
          this.field_L.field_l = (ub) ((Object) new hi());
          var7 = rd.a(MainMenuScreen.field_z, new String[]{this.a((byte) 34), this.h(0)}, (byte) 103);
          var3 = 20;
          var4 = new um(a.field_u, 0, 0, 0, 0, 16777215, -1, 3, 0, a.field_u.field_F, -1, 2147483647, true);
          this.field_O = new lg(var7, var4);
          this.field_O.field_z = "";
          this.field_O.a(qg.field_z, 0, (byte) -98);
          this.field_O.a(qg.field_z, 1, (byte) -98);
          this.field_O.field_i = (uh) (this);
          this.field_O.field_t = -40 + this.field_t;
          this.field_O.a(26, (byte) 46, -40 + this.field_t, var3);
          var3 = var3 + (15 + this.field_O.field_s);
          this.a(this.field_O, true);
          var5 = 4;
          var6 = 200;
          this.field_L.a(40, 300 - var6 >> 1, var3, (byte) -119, var6);
          this.field_L.field_i = (uh) (this);
          this.a(this.field_L, true);
          this.a(var3 + 55 + var5, 0, 0, (byte) -119, 300);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String a(byte param0) {
        if (param0 != 34) {
          field_P = (RgbSprite) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_P = null;
        if (param0 != 12127) {
          field_J = (String) null;
        }
        field_M = null;
        field_J = null;
        field_K = null;
    }

    final static RgbSprite[] a(RgbSprite[] param0, boolean param1) {
        int var3 = 0;
        RgbSprite[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        RgbSprite[] var5 = null;
        RgbSprite[] stackIn_3_0 = null;
        RgbSprite[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = new RgbSprite[param0.length];
          var2 = var5;
          if (param1) {
            stackIn_3_0 = (RgbSprite[]) null;
            return stackIn_3_0;
          }
          for (var3 = 0; param0.length > var3; var3++) {
            var5[var3] = pl.a(-16371, param0[var3]);
          }
          stackIn_8_0 = var2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("ig.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
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
          if (param0 == 98) {
            stackIn_7_0 = this.b(param2, (byte) 86);
            return stackIn_7_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_10_0 = this.a(param2, (byte) -119);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ig.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_N = 0;
        field_M = new long[32];
        field_J = "Please enter a year between <%0> and <%1>";
    }
}
