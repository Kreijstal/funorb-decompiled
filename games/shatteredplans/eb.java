/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_d;
    static String[] field_f;
    static String field_e;
    static int field_b;
    static int[] field_a;
    volatile boolean field_c;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -1314558012) {
          return;
        }
        field_f = null;
        field_e = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = 0;
          while (true) {
            if (var5_int >= gd.field_b.length) {
              if (param3 != 12) {
                field_b = -26;
              }
              return;
            }
            param1 = gd.field_b[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param0 = jl.field_M[incrementValue$1];
              dupTemp$2 = param2[param0];
              dupTemp$3 = param4[dupTemp$2];
              param4[dupTemp$2] = dupTemp$3 + 1;
              jl.field_M[dupTemp$3] = param0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("eb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(qb param0, int param1) {
        try {
          if (param1 != -17115) {
            field_b = 54;
          }
          ql.a(this.field_d, 0, param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "eb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_c = true;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "eb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27_int = 0;
        double var27 = 0.0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var1_intLifetime1;
        int var2Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        int var26Lifetime1;
        int var28Lifetime1;
        int var28Lifetime2;
        int var28Lifetime3;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        var34 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = 0.15000000596046448f + (float)di.field_m / 1000.0f;
          var1_int = -(int)(200.0 * Math.sin((double)var3));
          var2 = -200 + (int)(200.0 * Math.cos((double)var3));
          ks.field_j.f(var1_int, var2);
          gf.h(0, 0, gf.field_b, gf.field_k);
          var4 = 125;
          var5 = 400;
          var6 = var5 + 150;
          var7 = 100 + var6;
          var8 = var6 + 150;
          var9 = var5 + 50;
          var10 = -80;
          var11 = 140;
          var2Lifetime1 = var10;
          var1_intLifetime1 = -260;
          if (var5 > di.field_m) {
            if (di.field_m < var4) {
              stackIn_6_0 = var10;
            } else {
              stackIn_6_0 = re.a(var10, -var4 + var5, -var4 + di.field_m, var11, param0 - 320);
            }
          } else {
            stackIn_6_0 = var11;
          }
          var12 = stackIn_6_0;
          tf.field_b.c(var1_intLifetime1, var2Lifetime1 + (var12 - 120), 128);
          qq.field_n.f(var1_intLifetime1, var12 + var2Lifetime1);
          if (var5 <= di.field_m) {
            stackIn_11_0 = 205 + var10 << 4;
          } else {
            if (di.field_m < var4) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = re.a(0, -var4 + var5, di.field_m - var4, 205 + var10 << 4, 0);
            }
          }
          var13 = stackIn_11_0;
          var14 = 454 + var1_intLifetime1 << 4;
          var15 = -var13 + (var10 + 374 + var2Lifetime1 << 4);
          var16 = 32 + vc.a((byte) -39, 32);
          if (var6 > di.field_m) {
            gf.b(var14, var15, var16, 128, fe.field_u);
          }
          var17 = 454 + (var1_intLifetime1 + 3);
          var18 = var17 << 4;
          var19 = (var13 >> 4) - 36;
          if (param0 != 320) {
            eb.b(62);
          }
          var20 = var19 << 4;
          var21 = 144;
          if (var7 <= di.field_m) {
            var22 = -var7 + di.field_m;
            var23 = -var7 + 1000;
            var24 = var22 << 2;
            var24 = var24 + var22 * 16 * var22 / var23;
            var20 = var20 - (var24 >> 4);
            var21 = var21 * (-var22 + var23) / var23;
            var17 = var17 + (var24 >> 4);
            var19 = var19 - (var24 >> 8);
            var18 = var18 + var24;
          }
          var22Lifetime1 = 454 + var1_intLifetime1 + 3 << 4;
          var23Lifetime1 = 169 + var10 << 4;
          var24Lifetime1 = -var7 + 950 << 2;
          var24Lifetime1 = var24Lifetime1 + (-var7 + 950) * (-(var7 * 16) + 15200) / (1000 - var7);
          var22Lifetime1 = var22Lifetime1 + var24Lifetime1;
          var23Lifetime1 = var23Lifetime1 - (var24Lifetime1 >> 4);
          gf.d(0, 0, var22Lifetime1 + 320 >> 4, 480);
          gf.d(var17, var19, 20, 4, 0);
          if (di.field_m >= var9) {
            var25 = -var9 + di.field_m;
            var26 = var6 - var9;
            var27_int = 440 * var25 / var26;
            var28 = var27_int + rg.a(64, -64, (byte) 109);
            if (var28 < 0) {
              var28 = 0;
            }
            if (255 < var28) {
              var28 = 255;
            }
            gf.a(16 + var17, var19 + 2, (var28 >> 2) * 65793);
            var28Lifetime1 = -40 + (var27_int + rg.a(64, -64, (byte) 114));
            if (var28Lifetime1 < 0) {
              var28Lifetime1 = 0;
            }
            if (var28Lifetime1 > 255) {
              var28Lifetime1 = 255;
            }
            gf.a(3 + var17, var19 + 3, 65793 * (var28Lifetime1 >> 2));
            var28Lifetime2 = rg.a(64, -64, (byte) 98) + (var27_int - 80);
            if (var28Lifetime2 < 0) {
              var28Lifetime2 = 0;
            }
            if (var28Lifetime2 > 255) {
              var28Lifetime2 = 255;
            }
            gf.a(var17 + 12, var19, 65793 * (var28Lifetime2 >> 2));
            var28Lifetime3 = -120 + var27_int + rg.a(64, -64, (byte) 126);
            if (var28Lifetime3 < 0) {
              var28Lifetime3 = 0;
            }
            if (var28Lifetime3 > 255) {
              var28Lifetime3 = 255;
            }
            gf.a(var17 + 7, 1 + var19, (var28Lifetime3 >> 2) * 65793);
          }
          gf.a();
          if (var9 <= di.field_m) {
            var25Lifetime1 = -var9 + di.field_m;
            var26Lifetime1 = -var9 + var8;
            var27 = 0.0003141592653589793 * (double)var25Lifetime1 * (double)var25Lifetime1;
            if (var25Lifetime1 > var26Lifetime1) {
              stackIn_45_0 = 128;
            } else {
              stackIn_45_0 = var25Lifetime1 * 128 / var26Lifetime1;
            }
            var29 = stackIn_45_0;
            for (var30 = 0; var30 < 3; var30++) {
              var31 = (int)(Math.cos(3.141592653589793 * (double)(2 * var30) / 3.0 + var27) * (double)(var21 >> 1));
              var31 = var31 + var18;
              var32 = (int)((double)var21 * Math.sin(var27 + 3.141592653589793 * (double)(var30 * 2) / 3.0));
              var32 = var32 + var20;
              if ((var22Lifetime1 + 320) >= var31) {
                gf.g(var17, var19, var31 >> 4, var32 >> 4, 0);
                gf.b(var31, var32, 64, var29, fe.field_x);
                p.field_A[sd.field_p] = var31;
                np.field_f[sd.field_p] = var32;
                fieldTemp$0 = sd.field_p + 1;
                sd.field_p = sd.field_p + 1;
                if (fieldTemp$0 == 600) {
                  sd.field_p = 0;
                }
              }
            }
            stackIn_57_0 = (600 > var25Lifetime1) ? var25Lifetime1 : 600;
            var30Lifetime1 = stackIn_57_0;
            var31Lifetime1 = -1 + sd.field_p;
            for (var32Lifetime1 = 0; var30Lifetime1 > var32Lifetime1; var32Lifetime1++) {
              if (var31Lifetime1 < 0) {
                var31Lifetime1 += 600;
              }
              var33 = 256 * (var30Lifetime1 - var32Lifetime1) / 600;
              gf.b(p.field_A[var31Lifetime1], np.field_f[var31Lifetime1], var33, 12, fe.field_x);
              gf.b(p.field_A[var31Lifetime1], np.field_f[var31Lifetime1], var33 >> 2, 128, fe.field_x);
              var31Lifetime1--;
            }
          }
          if (900 < di.field_m) {
            if (di.field_m > 950) {
              var16Lifetime1 = re.a(0, 50, -900 + di.field_m, 256, 0);
            } else {
              var16Lifetime1 = re.a(256, 50, -950 + di.field_m, 0, 0);
            }
            gf.a(var22Lifetime1, var23Lifetime1, var16Lifetime1, 12, fe.field_v);
            gf.a(var22Lifetime1 + 128, var23Lifetime1 - 16, var16Lifetime1 >> 1, 12, fe.field_v);
            gf.a(var22Lifetime1 + 256, var23Lifetime1 - 32, var16Lifetime1 >> 2, 12, fe.field_v);
          }
          var25Lifetime2 = -var22Lifetime1 + var18;
          if (var25Lifetime2 > 0) {
            var16Lifetime2 = var25Lifetime2;
            if (var16Lifetime2 > 320) {
              var20 = var20 - (var16Lifetime2 - 320 >> 2);
              var18 = var18 + (var16Lifetime2 - 320 << 1);
              var16Lifetime2 = -(var16Lifetime2 >> 2) + 320;
            }
            gf.b(var18, var20, var16Lifetime2, 256, fe.field_u);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "eb.A(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    eb() {
    }

    static {
        field_b = 0;
        field_e = "Offer NAP";
        field_a = new int[]{18, 19, 9};
    }
}
