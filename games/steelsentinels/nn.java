/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends java.awt.Canvas implements java.awt.event.FocusListener {
    static BitmapFont field_g;
    java.awt.Frame field_d;
    volatile boolean field_b;
    static String field_f;
    static String field_e;
    static int[] field_c;
    static pe[] field_h;
    static RgbSprite[] field_a;

    final static void a(int param0, boolean param1, int param2, int param3) {
        ib.a(param2, db.field_b, param1, param3, 127, da.field_g, te.field_b);
        if (param0 != -1604006872) {
          field_g = (BitmapFont) null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(pn param0, int param1) {
        try {
          ok.a(-1, param0, this.field_d);
          int var3_int = 121 / ((param1 + 15) / 60);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(String[] args, int param1, String param2, byte param3) {
        int var5 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          cb.field_j = sn.field_p;
          if (param1 == 255) {
            stackIn_9_0 = !(13 <= wi.field_y);
            qf.field_d = fn.a(stackIn_9_0, (byte) 69);
          } else {
            if (param1 >= 100 &&
              param1 <= 105) {
              qf.field_d = fc.a((byte) -76, args);
            } else {
              qf.field_d = CachedArchiveProvider.a(18, param2, param1);
            }
          }
          if (param3 >= -101) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nn.C(");
          if (args == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var1 = an.field_h * an.field_h;
        if (param0) {
          return;
        }
        int var2 = var1 - wa.field_p * wa.field_p;
        int var3 = var2 * (jn.field_c - va.field_b) / var1 + va.field_b;
        qc.field_V.a(0, var3, 120, me.field_e, 640);
        nm.a(da.field_g, 0, va.field_e, 5, jn.field_c - 24, 640, 110);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    nn() {
    }

    public static void b(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 != 30) {
          return;
        }
        field_h = null;
        field_a = null;
        field_g = null;
        field_f = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_b = true;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nn.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 42) {
          return false;
        }
        return de.field_d;
    }

    final static int a(int[] param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6 = 0;
        int var4Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (param1 <= 36) {
            stackIn_3_0 = -22;
            return stackIn_3_0;
          }
          var2_int = 0;
          var3 = param0.length;
          if (var3 < 8) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          for (var4 = 0; var3 - 8 > var4; var4++) {
            if (param0[var4] >= 0 &&
              param0[var4] < tc.field_B.length) {
              var2_int = var2_int + tc.field_B[param0[var4]];
            }
          }
          var6 = var3 - 8;
          var4Lifetime1 = var6;
          while (true) {
            if (var6 >= var3) {
              stackIn_27_0 = var2_int;
              return stackIn_27_0;
            }
            if (param0[var6] >= 0 &&
              param0[var6] < dn.field_Sb.length) {
              var2_int = var2_int + dn.field_Sb[param0[var6]];
            }
            if (param0[var6] != 34) {
              var6++;
              continue;
            }
            break;
          }
          stackIn_24_0 = 6100;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("nn.G(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, RgbSprite param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = SteelSentinels.obfuscationControl;
        try {
          var6_int = (-param2 + param1 << 8) / param4.field_z;
          param3 = param3 + param4.field_H;
          var7 = (param2 << 8) + param4.field_D * var6_int;
          param0 = param0 + param4.field_D;
          var8 = param3 * SoftwareRaster.field_c + param0;
          var9 = 0;
          var10 = param4.field_F;
          if (param5 != -1) {
            nn.a(-123, false, 41, 13);
          }
          var11 = param4.field_A;
          var12 = -var11 + SoftwareRaster.field_c;
          var13 = 0;
          if (SoftwareRaster.field_l > param3) {
            var14 = SoftwareRaster.field_l - param3;
            var10 = var10 - var14;
            var9 = var9 + var11 * var14;
            param3 = SoftwareRaster.field_l;
            var8 = var8 + SoftwareRaster.field_c * var14;
          }
          if (param0 < SoftwareRaster.field_i) {
            var14Lifetime1 = SoftwareRaster.field_i - param0;
            var7 = var7 + var14Lifetime1 * var6_int;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            param0 = SoftwareRaster.field_i;
          }
          if (SoftwareRaster.field_d < var10 + param3) {
            var10 = var10 - (var10 + (param3 - SoftwareRaster.field_d));
          }
          if (param0 + var11 > SoftwareRaster.field_b) {
            var14Lifetime2 = param0 + var11 - SoftwareRaster.field_b;
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (0 < var11 &&
            var10 > 0) {
            for (param3 = -var10; param3 < 0; param3++) {
              var14Lifetime3 = var7;
              for (param0 = -var11; 0 > param0; param0++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 < 0) {
                  var8++;
                  var9++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param4.field_E[incrementValue$0];
                  if (var17 != 0) {
                    if (255 < var15) {
                      SoftwareRaster.field_g[var8] = var17;
                    } else {
                      var18 = SoftwareRaster.field_g[var8];
                      var19 = var16 * (var18 & 16711935) + var15 * (16711935 & var17) >> 8 & 16711935;
                      SoftwareRaster.field_g[var8] = ec.a(ec.a(65280, var17) * var15 + ec.a(var18, 65280) * var16 >> 8, 65280) + var19;
                    }
                  }
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("nn.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_e = "Playing";
        field_c = new int[]{109, 23, 18, 16, -1, -1, -1, -1, -1, -1, -1};
    }
}
