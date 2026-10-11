/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vkb extends rqa {
    final static int a(int param0, int param1) {
        if (param0 < 8) {
          return -114;
        }
        int var2 = 0;
        if (param1 > 65535) {
          param1 = param1 >>> 16;
          var2 = var2 | 16;
        }
        if (param1 > 255) {
          param1 = param1 >>> 8;
          var2 = var2 | 8;
        }
        if (param1 > 15) {
          var2 = var2 | 4;
          param1 = param1 >>> 4;
        }
        if (param1 > 3) {
          var2 = var2 | 2;
          param1 = param1 >>> 2;
        }
        if (param1 > 1) {
          param1 = param1 >>> 1;
          var2 = var2 | 1;
        }
        return var2;
    }

    vkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -72);
          }
          tcb.field_q = param0[0].a(41);
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vkb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        double var18_double = 0.0;
        int var18 = 0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        var26 = VoidHunters.field_G;
        try {
          if (klb.field_o != null) {
            return;
          }
          klb.field_o = new int[65536];
          if (param0 != -10693) {
            vkb.a(43, 19);
          }
          var1_double = 0.7 + (-0.015 + 0.03 * Math.random());
          for (var3 = 0; var3 < 65536; var3++) {
            var4 = 0.0078125 + (double)((64562 & var3) >> 10) / 64.0;
            var6 = 0.0625 + (double)(7 & var3 >> 7) / 8.0;
            var8 = (double)(var3 & 127) / 128.0;
            var10 = var8;
            var12 = var8;
            var14 = var8;
            if (var6 != 0.0) {
              if (0.5 > var8) {
                var16_double = var8 * (1.0 + var6);
              } else {
                var16_double = var8 + var6 - var8 * var6;
              }
              var18_double = 2.0 * var8 - var16_double;
              var20 = 0.3333333333333333 + var4;
              if (1.0 < var20) {
                var20 = var20 - 1.0;
              }
              var22 = var4;
              var24 = var4 - 0.3333333333333333;
              if (6.0 * var22 < 1.0) {
                var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
              } else {
                if (!(var22 * 2.0 < 1.0)) {
                  if (2.0 > 3.0 * var22) {
                    var12 = (var16_double - var18_double) * (-var22 + 0.6666666666666666) * 6.0 + var18_double;
                  } else {
                    var12 = var18_double;
                  }
                } else {
                  var12 = var16_double;
                }
              }
              if (!(1.0 > 6.0 * var20)) {
                if (!(2.0 * var20 < 1.0)) {
                  if (!(2.0 > 3.0 * var20)) {
                    var10 = var18_double;
                  } else {
                    var10 = 6.0 * ((-var18_double + var16_double) * (-var20 + 0.6666666666666666)) + var18_double;
                  }
                } else {
                  var10 = var16_double;
                }
              } else {
                var10 = 6.0 * (-var18_double + var16_double) * var20 + var18_double;
              }
              if (var24 < 0.0) {
                var24 = var24 + 1.0;
              }
              if (!(1.0 > var24 * 6.0)) {
                if (1.0 > var24 * 2.0) {
                  var14 = var16_double;
                } else {
                  if (!(2.0 > var24 * 3.0)) {
                    var14 = var18_double;
                  } else {
                    var14 = 6.0 * ((-var24 + 0.6666666666666666) * (var16_double - var18_double)) + var18_double;
                  }
                }
              } else {
                var14 = var18_double + 6.0 * (var16_double - var18_double) * var24;
              }
            }
            var10 = Math.pow(var10, var1_double);
            var12 = Math.pow(var12, var1_double);
            var14 = Math.pow(var14, var1_double);
            var16 = (int)(256.0 * var10);
            var17 = (int)(var12 * 256.0);
            var18 = (int)(var14 * 256.0);
            var19 = (var17 << 8) + ((var16 << 16) + var18);
            klb.field_o[var3] = var19;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "vkb.B(" + param0 + ')');
        }
    }

    static {
    }
}
