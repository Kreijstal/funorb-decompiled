/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements ir {
    private int field_k;
    private int field_g;
    private BitmapFont field_l;
    private int field_o;
    private int field_h;
    static PcmSample[] aircraftEngineSamples;
    private int field_i;
    static String field_e;
    static String field_a;
    private int field_m;
    private int field_b;
    private int field_j;
    private int field_f;
    private int field_d;
    private int field_n;

    final static int a(int param0, byte[] param1, int param2) {
        String stackIn_7_2 = null;
        try {
          if (param0 > -117) {
            byte[] var4 = (byte[]) null;
            lj.a(-124, (byte[]) null, 84);
          }
          int stackIn_3_0 = cl.a(0, param1, param2, (byte) -105);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("lj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        ea stackIn_5_0 = null;
        String stackIn_17_2 = null;
        try {
          if (param1 != -7592) {
            return;
          }
          if (param3 instanceof sq) {
            stackIn_5_0 = (ea) (param3);
          } else {
            stackIn_5_0 = null;
          }
          sq var11 = (sq) (stackIn_5_0);
          if (var11 != null) {
            param0 = param0 & var11.field_u;
          }
          int var7 = 5592405;
          SoftwareRasterizer.b(param2 + param3.field_p, param4 + param3.field_h, param3.field_q, param3.field_n, this.field_o);
          if (param0) {
            var7 = 16777215;
          }
          int var8 = param2 + param3.field_p + this.field_n;
          int var9 = this.field_h + param4 + param3.field_h;
          SoftwareRasterizer.d(var8, var9, this.field_m, this.field_j, 5592405);
          SoftwareRasterizer.b(var8, var9, this.field_m, this.field_j, var7);
          if (var11.field_s) {
            SoftwareRasterizer.f(var8, var9, var8 + this.field_m, var9 + this.field_j, 1);
            SoftwareRasterizer.f(var8 + this.field_m, var9, var8, this.field_j + var9, 1);
          }
          if (null != this.field_l) {
            int var10 = this.field_m + (this.field_n + this.field_f);
            this.field_l.drawParagraph(param3.field_f, param2 + param3.field_p + var10, param4 + (param3.field_h + this.field_i), param3.field_q - (this.field_f + var10), param3.field_n - (this.field_f << 1), this.field_g, this.field_k, this.field_b, this.field_d, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var6;
          StringBuilder stackIn_16_1 = new StringBuilder().append("lj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        aircraftEngineSamples = null;
        field_a = null;
        field_e = null;
        if (!param0) {
          lj.a(107);
        }
    }

    final static void a(int param0) {
        if (RendererManager.field_c > 32) {
          int var1 = RendererManager.field_c % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          ve.a((byte) 43, RendererManager.field_c - var1);
          if (param0 <= 97) {
            lj.a(true);
            return;
          }
          return;
        }
        ve.a((byte) 43, 0);
        if (param0 <= 97) {
          lj.a(true);
          return;
        }
    }

    lj(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_b = 1;
        this.field_d = 1;
        try {
          this.field_m = param8;
          this.field_h = param6;
          this.field_n = param5;
          this.field_f = param1;
          this.field_g = param3;
          this.field_o = param9;
          this.field_j = param7;
          this.field_l = param0;
          this.field_k = param4;
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_e = "Confirm Email:";
        field_a = "Try again";
    }
}
