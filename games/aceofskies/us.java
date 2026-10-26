/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us implements ir {
    private int field_d;
    private BitmapFont field_g;
    private int field_b;
    private int field_f;
    private int field_a;
    private int field_e;
    private int field_c;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int var10 = 0;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        pf var12 = null;
        var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!(param3 instanceof pf)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (ea) (param3);
          }
          var12 = (pf) (stackIn_4_0);
          SoftwareRasterizer.b(param2 + param3.field_p, param3.field_h + param4, param3.field_q, param3.field_n, this.field_f);
          if (var12 == null) {
          }
          var7 = -(var12.field_B * 2) + param3.field_q;
          if (param1 != -7592) {
            return;
          }
          var8 = var12.field_B + param2 + param3.field_p;
          var9 = var12.field_x + param3.field_h + param4;
          SoftwareRasterizer.f(var8, var9, var8 + var7, var9, this.field_b);
          for (var10 = -1 + var12.c(true); var10 >= 0; var10--) {
            SoftwareRasterizer.g(var7 * var12.a(false, var10) / var12.a(param1 ^ 7589) + var8, var9, this.field_c, this.field_d);
          }
          if (null != this.field_g) {
            this.field_g.drawCenteredText(var12.field_f, var7 / 2 + var8, var12.field_x + var9 + this.field_g.lineAdvance, this.field_e, this.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("us.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var4 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        int var3 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (null != sa.field_h) {
            return;
          }
          sa.field_h = new int[65536];
          var1_double = -0.015 + 0.03 * Math.random() + 0.7;
          if (param0 != 2069944240) {
            us.a(-104);
          }
          var3 = 0;
          for (var4 = 0; var4 < 512; var4++) {
            var5 = 360.0f * ((float)(var4 >> 3) / 64.0f + 0.0078125f);
            var6 = (float)(7 & var4) / 8.0f + 0.0625f;
            for (var7 = 0; var7 < 128; var7++) {
              var8 = (float)var7 / 128.0f;
              var9 = 0.0f;
              var10 = 0.0f;
              var11 = 0.0f;
              var12 = var5 / 60.0f;
              var13 = (int)var12;
              var14 = var13 % 6;
              var15 = var12 - (float)var13;
              var16 = (1.0f - var6) * var8;
              var17 = (-(var6 * var15) + 1.0f) * var8;
              var18 = (-(var6 * (1.0f - var15)) + 1.0f) * var8;
              if (0 == var14) {
                var10 = var18;
                var11 = var16;
                var9 = var8;
              } else {
                if (var14 != 1) {
                  if (var14 != 2) {
                    if (var14 != 3) {
                      if (4 == var14) {
                        var10 = var16;
                        var11 = var8;
                        var9 = var18;
                      } else {
                        if (5 == var14) {
                          var11 = var17;
                          var9 = var8;
                          var10 = var16;
                        }
                      }
                    } else {
                      var10 = var17;
                      var11 = var8;
                      var9 = var16;
                    }
                  } else {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                  }
                } else {
                  var9 = var17;
                  var10 = var8;
                  var11 = var16;
                }
              }
              var9 = (float)Math.pow((double)var9, var1_double);
              var10 = (float)Math.pow((double)var10, var1_double);
              var11 = (float)Math.pow((double)var11, var1_double);
              var19 = (int)(var9 * 256.0f);
              var20 = (int)(var10 * 256.0f);
              var21 = (int)(var11 * 256.0f);
              var22 = var21 + (var19 << 16) + (-16777216 + (var20 << 8));
              incrementValue$0 = var3;
              var3++;
              sa.field_h[incrementValue$0] = var22;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "us.A(" + param0 + ')');
        }
    }

    us(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_d = param6;
          this.field_c = param5;
          this.field_a = param2;
          this.field_f = param4;
          this.field_b = param3;
          this.field_e = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "us.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
