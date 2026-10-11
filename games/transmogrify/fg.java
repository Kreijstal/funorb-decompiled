/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg extends cj implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_k;
    static long field_j;
    private java.awt.image.ColorModel field_h;
    static int[] field_i;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static String a(String param0, ci param1, int param2, String param3, int param4) {
        RuntimeException var5 = null;
        int[] var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 32389) {
            var6 = (int[]) null;
            fg.a(61, 83, (byte) 125, 103, 62, -127, (int[]) null, -45);
          }
          if (param1.a((byte) -127)) {
            stackIn_6_0 = param0 + " - " + param1.a(true, param2) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fg.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_k = param0;
          param0.setDimensions(this.field_d, this.field_g);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_h);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_k == param0) {
            this.field_k = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fg.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        if (!ge.field_x) {
          throw new IllegalStateException();
        }
        bg.field_n = true;
        n.a(false, false);
        if (param0 != 91) {
          return;
        }
        gl.field_y = 0;
    }

    private final synchronized void c(byte param0) {
        if (param0 != 28) {
          return;
        }
        if (this.field_k == null) {
          return;
        }
        this.field_k.setPixels(0, 0, this.field_d, this.field_g, this.field_h, this.field_a, 0, this.field_d);
        this.field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
          this.c((byte) 28);
          if (param0 != -32299) {
            java.awt.Component var6 = (java.awt.Component) null;
            this.a(8, -89, (java.awt.Component) null, (byte) 114);
          }
          param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7) {
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
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
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var21Lifetime1;
        int var23Lifetime1;
        int var23Lifetime2;
        int var23Lifetime3;
        int var23Lifetime4;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        int var25Lifetime4;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var26Lifetime4;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var28Lifetime1;
        int var28Lifetime2;
        int var28Lifetime3;
        int var28Lifetime4;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var30Lifetime2;
        int var30Lifetime3;
        int var30Lifetime4;
        int var31Lifetime1;
        int var31Lifetime2;
        int var31Lifetime3;
        int var31Lifetime4;
        int var32Lifetime1;
        int var26Lifetime5;
        int var27Lifetime5;
        int var28Lifetime5;
        int var28Lifetime6;
        int var29Lifetime5;
        int var29Lifetime6;
        int var30Lifetime5;
        int var30Lifetime6;
        int var31Lifetime5;
        int var32Lifetime2;
        int var26Lifetime1Lifetime1;
        int var26Lifetime2Lifetime1;
        int var27Lifetime1Lifetime1;
        int var27Lifetime2Lifetime1;
        int var27Lifetime3Lifetime1;
        int var27Lifetime4Lifetime1;
        int var28Lifetime1Lifetime1;
        int var28Lifetime1Lifetime2;
        int var28Lifetime2Lifetime1;
        int var28Lifetime3Lifetime1;
        int var28Lifetime4Lifetime1;
        int var29Lifetime1Lifetime1;
        int var29Lifetime1Lifetime2;
        int var29Lifetime2Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime3Lifetime2;
        int var29Lifetime4Lifetime1;
        int var29Lifetime4Lifetime2;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var30Lifetime2Lifetime1;
        int var30Lifetime3Lifetime1;
        int var30Lifetime3Lifetime2;
        int var30Lifetime4Lifetime1;
        int var30Lifetime4Lifetime2;
        int var31Lifetime1Lifetime1;
        int var31Lifetime2Lifetime1;
        int var31Lifetime3Lifetime1;
        int var31Lifetime3Lifetime2;
        int var31Lifetime4Lifetime1;
        int var31Lifetime4Lifetime2;
        int var32Lifetime1Lifetime1;
        var33 = Transmogrify.field_A ? 1 : 0;
        try {
          var8_int = param3 + param1 - 1;
          var9 = param0 + param5 - 1;
          var10 = param4 * param4;
          var11 = -param4 + param1;
          var12 = var8_int + param4;
          var13 = param0 - param4;
          var14 = param4 + var9;
          var15 = var13;
          if (var15 < sb.field_e) {
            var15 = sb.field_e;
          }
          var16 = var15;
          var17 = var11;
          if (sb.field_d > var17) {
            var17 = sb.field_d;
          }
          var18 = param1;
          if (var18 > sb.field_b) {
            var18 = sb.field_b;
          }
          var19 = var8_int;
          if (sb.field_b < var19) {
            var19 = sb.field_b;
          }
          var20 = var12;
          if (var20 > sb.field_b) {
            var20 = sb.field_b;
          }
          var21 = (-var16 + param0 + 1) * (1 - var16 + param0);
          var22 = (1 + param1 - var17) * (-var17 + (param1 + 1));
          var23 = param0;
          if (sb.field_f < var23) {
            var23 = sb.field_f;
          }
          while (var23 > var16) {
            var21 = var21 + ((-param0 + var16 << 1) - 1);
            var24 = var17 + sb.field_c * var16;
            var25 = var17;
            var26 = var21 + var22;
            while (var25 < var18) {
              var26 = var26 + ((var25 - param1 << 1) - 1);
              if (var26 <= var10) {
                var27 = var24;
                var28 = param6[(var10 - var26) * param7 / var10];
                var29 = sb.field_h[var27];
                var30 = var29 + var28;
                var28 = (var29 & 16711935) + (var28 & 16711935);
                var29 = (16777472 & var28) + (var30 - var28 & 65536);
                sb.field_h[var27] = cl.b(-(var29 >>> 8) + var29, var30 - var29);
              }
              var24++;
              var25++;
            }
            var27Lifetime5 = param6[(var10 - var21) * param7 / var10];
            var26Lifetime5 = 1 + var21;
            while (var25 < var19) {
              var28Lifetime5 = var24;
              var29Lifetime5 = var27Lifetime5;
              var30Lifetime5 = sb.field_h[var28Lifetime5];
              var31 = var30Lifetime5 + var29Lifetime5;
              var29Lifetime5 = (var29Lifetime5 & 16711935) + (var30Lifetime5 & 16711935);
              var30Lifetime5 = (16777472 & var29Lifetime5) + (65536 & -var29Lifetime5 + var31);
              sb.field_h[var28Lifetime5] = cl.b(var30Lifetime5 - (var30Lifetime5 >>> 8), var31 - var30Lifetime5);
              var24++;
              var25++;
            }
            while (var25 < var20) {
              var26Lifetime5 = var26Lifetime5 + (-1 + (-var8_int + var25 << 1));
              if (var10 >= var26Lifetime5) {
                var28Lifetime6 = var24;
                var29Lifetime6 = param6[param7 * (-var26Lifetime5 + var10) / var10];
                var30Lifetime6 = sb.field_h[var28Lifetime6];
                var31Lifetime5 = var30Lifetime6 + var29Lifetime6;
                var29Lifetime6 = (16711935 & var30Lifetime6) + (var29Lifetime6 & 16711935);
                var30Lifetime6 = (var29Lifetime6 & 16777472) + (var31Lifetime5 - var29Lifetime6 & 65536);
                sb.field_h[var28Lifetime6] = cl.b(-(var30Lifetime6 >>> 8) + var30Lifetime6, var31Lifetime5 - var30Lifetime6);
                var24++;
                var25++;
                continue;
              }
              break;
            }
            var16++;
          }
          var23Lifetime1 = param4 + param0;
          if (var23Lifetime1 > sb.field_f) {
            var23Lifetime1 = sb.field_f;
          }
          if (param2 <= 76) {
            field_j = 46L;
          }
          while (var23Lifetime1 > var16) {
            var21 = var21 + ((-param0 + var16 << 1) - 1);
            var24Lifetime1 = sb.field_c * var16 + var17;
            var25Lifetime1 = var17;
            var26Lifetime1 = var22;
            while (var16 + (param1 - param0) > var25Lifetime1) {
              var26Lifetime1 = var26Lifetime1 + ((var25Lifetime1 - param1 << 1) - 1);
              if (var25Lifetime1 < sb.field_b) {
                var27Lifetime1 = var24Lifetime1;
                var28Lifetime1 = param6[(var10 - var26Lifetime1) * param7 / var10];
                var29Lifetime1 = sb.field_h[var27Lifetime1];
                var30Lifetime1 = var29Lifetime1 + var28Lifetime1;
                var28Lifetime1 = (var29Lifetime1 & 16711935) + (16711935 & var28Lifetime1);
                var29Lifetime1 = (16777472 & var28Lifetime1) + (65536 & var30Lifetime1 - var28Lifetime1);
                sb.field_h[var27Lifetime1] = cl.b(var29Lifetime1 - (var29Lifetime1 >>> 8), -var29Lifetime1 + var30Lifetime1);
              }
              var24Lifetime1++;
              var25Lifetime1++;
            }
            var27Lifetime1Lifetime1 = param6[param7 * (var10 - var21) / var10];
            while (var8_int - var16 + param0 > var25Lifetime1) {
              if (var25Lifetime1 < sb.field_b) {
                var28Lifetime1Lifetime1 = var24Lifetime1;
                var29Lifetime1Lifetime1 = var27Lifetime1Lifetime1;
                var30Lifetime1Lifetime1 = sb.field_h[var28Lifetime1Lifetime1];
                var31Lifetime1 = var30Lifetime1Lifetime1 + var29Lifetime1Lifetime1;
                var29Lifetime1Lifetime1 = (16711935 & var29Lifetime1Lifetime1) + (var30Lifetime1Lifetime1 & 16711935);
                var30Lifetime1Lifetime1 = (-var29Lifetime1Lifetime1 + var31Lifetime1 & 65536) + (var29Lifetime1Lifetime1 & 16777472);
                sb.field_h[var28Lifetime1Lifetime1] = cl.b(-(var30Lifetime1Lifetime1 >>> 8) + var30Lifetime1Lifetime1, -var30Lifetime1Lifetime1 + var31Lifetime1);
              }
              var24Lifetime1++;
              var25Lifetime1++;
            }
            var26Lifetime1Lifetime1 = (var8_int - (var25Lifetime1 - 1)) * (-var25Lifetime1 + var8_int + 1);
            while (var25Lifetime1 < var20) {
              var26Lifetime1Lifetime1 = var26Lifetime1Lifetime1 + ((-var8_int + var25Lifetime1 << 1) - 1);
              var28Lifetime1Lifetime2 = var24Lifetime1;
              var29Lifetime1Lifetime2 = param6[param7 * (-var26Lifetime1Lifetime1 + var10) / var10];
              var30Lifetime1Lifetime2 = sb.field_h[var28Lifetime1Lifetime2];
              var31Lifetime1Lifetime1 = var30Lifetime1Lifetime2 + var29Lifetime1Lifetime2;
              var29Lifetime1Lifetime2 = (16711935 & var30Lifetime1Lifetime2) + (var29Lifetime1Lifetime2 & 16711935);
              var30Lifetime1Lifetime2 = (var29Lifetime1Lifetime2 & 16777472) + (var31Lifetime1Lifetime1 - var29Lifetime1Lifetime2 & 65536);
              sb.field_h[var28Lifetime1Lifetime2] = cl.b(var31Lifetime1Lifetime1 - var30Lifetime1Lifetime2, var30Lifetime1Lifetime2 - (var30Lifetime1Lifetime2 >>> 8));
              var24Lifetime1++;
              var25Lifetime1++;
            }
            var16++;
          }
          var23Lifetime2 = -param4 + var9;
          if (var23Lifetime2 > sb.field_f) {
            var23Lifetime2 = sb.field_f;
          }
          var24Lifetime2 = -param4 + (param3 - param4 - 1);
          if (var17 > param1 + param4) {
            var24Lifetime2 = var24Lifetime2 + (param4 + param1 - var17);
          }
          while (var16 < var23Lifetime2) {
            var25Lifetime2 = var17 + var16 * sb.field_c;
            var26Lifetime2 = var22;
            for (var27Lifetime2 = var17; param1 + param4 > var27Lifetime2; var27Lifetime2++) {
              var26Lifetime2 = var26Lifetime2 + (-1 + (-param1 + var27Lifetime2 << 1));
              if (sb.field_b > var27Lifetime2) {
                var28Lifetime2 = var25Lifetime2;
                var29Lifetime2 = param6[(-var26Lifetime2 + var10) * param7 / var10];
                var30Lifetime2 = sb.field_h[var28Lifetime2];
                var31Lifetime2 = var30Lifetime2 + var29Lifetime2;
                var29Lifetime2 = (var29Lifetime2 & 16711935) + (var30Lifetime2 & 16711935);
                var30Lifetime2 = (var29Lifetime2 & 16777472) + (65536 & -var29Lifetime2 + var31Lifetime2);
                sb.field_h[var28Lifetime2] = cl.b(var30Lifetime2 - (var30Lifetime2 >>> 8), var31Lifetime2 - var30Lifetime2);
              }
              var25Lifetime2++;
            }
            var26Lifetime2Lifetime1 = 1 + (param4 + var10) + param4;
            var25Lifetime2 = var25Lifetime2 + var24Lifetime2;
            for (var27Lifetime2Lifetime1 = var8_int - param4; var27Lifetime2Lifetime1 < var20; var27Lifetime2Lifetime1++) {
              var26Lifetime2Lifetime1 = var26Lifetime2Lifetime1 + (-1 + (-var8_int + var27Lifetime2Lifetime1 << 1));
              if (sb.field_d <= var27Lifetime2Lifetime1) {
                var28Lifetime2Lifetime1 = var25Lifetime2;
                var29Lifetime2Lifetime1 = param6[param7 * (-var26Lifetime2Lifetime1 + var10) / var10];
                var30Lifetime2Lifetime1 = sb.field_h[var28Lifetime2Lifetime1];
                var31Lifetime2Lifetime1 = var29Lifetime2Lifetime1 + var30Lifetime2Lifetime1;
                var29Lifetime2Lifetime1 = (16711935 & var30Lifetime2Lifetime1) + (var29Lifetime2Lifetime1 & 16711935);
                var30Lifetime2Lifetime1 = (65536 & -var29Lifetime2Lifetime1 + var31Lifetime2Lifetime1) + (var29Lifetime2Lifetime1 & 16777472);
                sb.field_h[var28Lifetime2Lifetime1] = cl.b(var31Lifetime2Lifetime1 - var30Lifetime2Lifetime1, var30Lifetime2Lifetime1 - (var30Lifetime2Lifetime1 >>> 8));
              }
              var25Lifetime2++;
            }
            var16++;
          }
          var23Lifetime3 = var9;
          var21Lifetime1 = (var9 + (-var16 + 1)) * (1 - var16 + var9);
          if (var23Lifetime3 > sb.field_f) {
            var23Lifetime3 = sb.field_f;
          }
          while (var16 < var23Lifetime3) {
            var21Lifetime1 = var21Lifetime1 + ((-var9 + var16 << 1) - 1);
            var25Lifetime3 = sb.field_c * var16 + var17;
            var26Lifetime3 = var17;
            var27Lifetime3 = var22;
            while (var26Lifetime3 < var9 + (-var16 + param1)) {
              var27Lifetime3 = var27Lifetime3 + (-1 + (-param1 + var26Lifetime3 << 1));
              if (var26Lifetime3 < sb.field_b) {
                var28Lifetime3 = var25Lifetime3;
                var29Lifetime3 = param6[param7 * (var10 - var27Lifetime3) / var10];
                var30Lifetime3 = sb.field_h[var28Lifetime3];
                var31Lifetime3 = var29Lifetime3 + var30Lifetime3;
                var29Lifetime3 = (var29Lifetime3 & 16711935) + (var30Lifetime3 & 16711935);
                var30Lifetime3 = (var31Lifetime3 - var29Lifetime3 & 65536) + (16777472 & var29Lifetime3);
                sb.field_h[var28Lifetime3] = cl.b(-var30Lifetime3 + var31Lifetime3, var30Lifetime3 - (var30Lifetime3 >>> 8));
              }
              var25Lifetime3++;
              var26Lifetime3++;
            }
            var28Lifetime3Lifetime1 = param6[(var10 - var21Lifetime1) * param7 / var10];
            while (var26Lifetime3 < -var9 + var8_int + var16) {
              if (var26Lifetime3 < sb.field_b) {
                var29Lifetime3Lifetime1 = var25Lifetime3;
                var30Lifetime3Lifetime1 = var28Lifetime3Lifetime1;
                var31Lifetime3Lifetime1 = sb.field_h[var29Lifetime3Lifetime1];
                var32 = var31Lifetime3Lifetime1 + var30Lifetime3Lifetime1;
                var30Lifetime3Lifetime1 = (var31Lifetime3Lifetime1 & 16711935) + (var30Lifetime3Lifetime1 & 16711935);
                var31Lifetime3Lifetime1 = (16777472 & var30Lifetime3Lifetime1) + (65536 & var32 - var30Lifetime3Lifetime1);
                sb.field_h[var29Lifetime3Lifetime1] = cl.b(var31Lifetime3Lifetime1 - (var31Lifetime3Lifetime1 >>> 8), -var31Lifetime3Lifetime1 + var32);
              }
              var25Lifetime3++;
              var26Lifetime3++;
            }
            var27Lifetime3Lifetime1 = (1 + var8_int - var26Lifetime3) * (-var26Lifetime3 + var8_int + 1);
            while (var26Lifetime3 < var20) {
              var27Lifetime3Lifetime1 = var27Lifetime3Lifetime1 + ((var26Lifetime3 - var8_int << 1) - 1);
              var29Lifetime3Lifetime2 = var25Lifetime3;
              var30Lifetime3Lifetime2 = param6[param7 * (-var27Lifetime3Lifetime1 + var10) / var10];
              var31Lifetime3Lifetime2 = sb.field_h[var29Lifetime3Lifetime2];
              var32Lifetime2 = var30Lifetime3Lifetime2 + var31Lifetime3Lifetime2;
              var30Lifetime3Lifetime2 = (16711935 & var31Lifetime3Lifetime2) + (16711935 & var30Lifetime3Lifetime2);
              var31Lifetime3Lifetime2 = (var30Lifetime3Lifetime2 & 16777472) + (-var30Lifetime3Lifetime2 + var32Lifetime2 & 65536);
              sb.field_h[var29Lifetime3Lifetime2] = cl.b(var31Lifetime3Lifetime2 - (var31Lifetime3Lifetime2 >>> 8), -var31Lifetime3Lifetime2 + var32Lifetime2);
              var25Lifetime3++;
              var26Lifetime3++;
            }
            var16++;
          }
          var23Lifetime4 = var14;
          if (sb.field_f < var23Lifetime4) {
            var23Lifetime4 = sb.field_f;
          }
          while (var23Lifetime4 > var16) {
            var25Lifetime4 = var17 + var16 * sb.field_c;
            var21Lifetime1 = var21Lifetime1 + ((-var9 + var16 << 1) - 1);
            var26Lifetime4 = var17;
            var27Lifetime4 = var21Lifetime1 + var22;
            while (var26Lifetime4 < var18) {
              var27Lifetime4 = var27Lifetime4 + ((var26Lifetime4 - param1 << 1) - 1);
              if (var27Lifetime4 <= var10) {
                var28Lifetime4 = var25Lifetime4;
                var29Lifetime4 = param6[(var10 - var27Lifetime4) * param7 / var10];
                var30Lifetime4 = sb.field_h[var28Lifetime4];
                var31Lifetime4 = var30Lifetime4 + var29Lifetime4;
                var29Lifetime4 = (16711935 & var29Lifetime4) + (var30Lifetime4 & 16711935);
                var30Lifetime4 = (-var29Lifetime4 + var31Lifetime4 & 65536) + (var29Lifetime4 & 16777472);
                sb.field_h[var28Lifetime4] = cl.b(var31Lifetime4 - var30Lifetime4, -(var30Lifetime4 >>> 8) + var30Lifetime4);
              }
              var25Lifetime4++;
              var26Lifetime4++;
            }
            var28Lifetime4Lifetime1 = param6[(-var21Lifetime1 + var10) * param7 / var10];
            var27Lifetime4Lifetime1 = var21Lifetime1 + 1;
            while (var19 > var26Lifetime4) {
              var29Lifetime4Lifetime1 = var25Lifetime4;
              var30Lifetime4Lifetime1 = var28Lifetime4Lifetime1;
              var31Lifetime4Lifetime1 = sb.field_h[var29Lifetime4Lifetime1];
              var32Lifetime1 = var31Lifetime4Lifetime1 + var30Lifetime4Lifetime1;
              var30Lifetime4Lifetime1 = (16711935 & var31Lifetime4Lifetime1) + (16711935 & var30Lifetime4Lifetime1);
              var31Lifetime4Lifetime1 = (var30Lifetime4Lifetime1 & 16777472) + (65536 & var32Lifetime1 - var30Lifetime4Lifetime1);
              sb.field_h[var29Lifetime4Lifetime1] = cl.b(-(var31Lifetime4Lifetime1 >>> 8) + var31Lifetime4Lifetime1, var32Lifetime1 - var31Lifetime4Lifetime1);
              var25Lifetime4++;
              var26Lifetime4++;
            }
            while (var20 > var26Lifetime4) {
              var27Lifetime4Lifetime1 = var27Lifetime4Lifetime1 + (-1 + (-var8_int + var26Lifetime4 << 1));
              if (var27Lifetime4Lifetime1 <= var10) {
                var29Lifetime4Lifetime2 = var25Lifetime4;
                var30Lifetime4Lifetime2 = param6[(var10 - var27Lifetime4Lifetime1) * param7 / var10];
                var31Lifetime4Lifetime2 = sb.field_h[var29Lifetime4Lifetime2];
                var32Lifetime1Lifetime1 = var30Lifetime4Lifetime2 + var31Lifetime4Lifetime2;
                var30Lifetime4Lifetime2 = (16711935 & var31Lifetime4Lifetime2) + (var30Lifetime4Lifetime2 & 16711935);
                var31Lifetime4Lifetime2 = (16777472 & var30Lifetime4Lifetime2) + (-var30Lifetime4Lifetime2 + var32Lifetime1Lifetime1 & 65536);
                sb.field_h[var29Lifetime4Lifetime2] = cl.b(var32Lifetime1Lifetime1 - var31Lifetime4Lifetime2, -(var31Lifetime4Lifetime2 >>> 8) + var31Lifetime4Lifetime2);
                var25Lifetime4++;
                var26Lifetime4++;
                continue;
              }
              break;
            }
            var16++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_111_0 = var8;
          stackIn_111_1 = new StringBuilder().append("fg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_112_2 = "null";
          } else {
            stackIn_112_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_111_0), ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param7).append(')').toString());
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("fg.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        try {
          this.field_d = param0;
          this.field_a = new int[1 + param0 * param1];
          this.field_g = param1;
          int var5_int = 101 / ((-90 - param3) / 34);
          this.field_h = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_f = param2.createImage((java.awt.image.ImageProducer) (this));
          this.c((byte) 28);
          param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.c((byte) 28);
          param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.c((byte) 28);
          param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.a(103);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        wf var2 = null;
        int var3 = 0;
        gd var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 > -56) {
            field_j = -24L;
          }
          var4 = (gd) (rh.field_r.a((byte) -95));
          while (var4 != null) {
            ne.a((byte) 7, var4, param1);
            var4 = (gd) (rh.field_r.a(true));
          }
          var2 = oc.field_G.a((byte) -95);
          while (var2 != null) {
            re.a(2, param1);
            var2 = oc.field_G.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "fg.D(" + param0 + ',' + param1 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 <= 76) {
          field_j = 102L;
        }
    }

    fg() {
    }

    static {
        field_j = 20000000L;
        field_i = new int[]{25, 142, 50, 95, 101, 174, 185, 112, 125, 29, 66, 86, 3, 59, 2, 44, 177, 158, 116};
    }
}
