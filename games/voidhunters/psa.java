/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class psa extends rqa {
    static dja field_o;

    psa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = (dja) null;
          }
          si.a(34, 62, param0[0].a(94));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("psa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var5 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = VoidHunters.field_G;
        try {
          if (null != mpb.field_h) {
            return;
          }
          mpb.field_h = new int[65536];
          var1_double = 0.7 + (-0.015 + 0.03 * Math.random());
          var3 = 0;
          var4 = -119 % ((-10 - param0) / 52);
          for (var5 = 0; var5 < 512; var5++) {
            var6 = 360.0f * ((float)(var5 >> 3) / 64.0f + 0.0078125f);
            var7 = 0.0625f + (float)(var5 & 7) / 8.0f;
            for (var8 = 0; var8 < 128; var8++) {
              var9 = (float)var8 / 128.0f;
              var10 = 0.0f;
              var11 = 0.0f;
              var12 = 0.0f;
              var13 = var6 / 60.0f;
              var14 = (int)var13;
              var15 = var14 % 6;
              var16 = var13 - (float)var14;
              var17 = (1.0f - var7) * var9;
              var18 = var9 * (1.0f - var7 * var16);
              var19 = var9 * (-(var7 * (1.0f - var16)) + 1.0f);
              if (var15 == 0) {
                var11 = var19;
                var10 = var9;
                var12 = var17;
              } else {
                if (var15 != 1) {
                  if (var15 == 2) {
                    var11 = var9;
                    var12 = var19;
                    var10 = var17;
                  } else {
                    if (3 != var15) {
                      if (4 != var15) {
                        if (var15 == 5) {
                          var11 = var17;
                          var10 = var9;
                          var12 = var18;
                        }
                      } else {
                        var12 = var9;
                        var11 = var17;
                        var10 = var19;
                      }
                    } else {
                      var12 = var9;
                      var10 = var17;
                      var11 = var18;
                    }
                  }
                } else {
                  var10 = var18;
                  var11 = var9;
                  var12 = var17;
                }
              }
              var10 = (float)Math.pow((double)var10, var1_double);
              var11 = (float)Math.pow((double)var11, var1_double);
              var12 = (float)Math.pow((double)var12, var1_double);
              var20 = (int)(256.0f * var10);
              var21 = (int)(var11 * 256.0f);
              var22 = (int)(256.0f * var12);
              var23 = var22 + (var21 << 8) + (-16777216 + (var20 << 16));
              incrementValue$0 = var3;
              var3++;
              mpb.field_h[incrementValue$0] = var23;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "psa.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          psa.e(13);
        }
        field_o = null;
    }

    static {
        field_o = (dja) ((Object) new mbb());
    }
}
