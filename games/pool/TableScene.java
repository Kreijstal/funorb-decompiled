/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class TableScene {
    static int[] field_w;
    static int field_I;
    MusicTrack field_n;
    int field_F;
    int field_q;
    static int field_k;
    int field_u;
    int field_G;
    String field_l;
    double field_p;
    boolean field_h;
    private PcmSampleStream field_r;
    int field_d;
    private ModelInstance[] field_y;
    private int[][] field_a;
    int field_v;
    CueStick field_A;
    int field_m;
    double field_j;
    float field_z;
    int field_e;
    int field_x;
    int field_C;
    private MeshBuilder[][] field_f;
    static String timeTrial;
    MusicTrack field_i;
    static Sprite field_D;
    double field_E;
    private int[][] field_g;
    int field_H;
    MusicTrack field_b;
    private ModelInstance[][] field_o;
    Sprite field_B;
    private int field_t;
    private MeshBuilder field_s;

    void releaseModels(boolean param0) {
        if (!param0) {
          TableScene.releaseStatics(-87);
        }
        this.field_s = null;
        this.field_g = (int[][]) null;
        this.field_a = (int[][]) null;
        this.field_o = (ModelInstance[][]) null;
        this.field_f = (MeshBuilder[][]) null;
        this.field_y = null;
    }

    void d(int param0) {
        if (param0 != 16) {
          this.updateHumPitch(3, 108);
        }
    }

    final RenderableModel createModelMeshWithTransform(int[] param0, MeshBuilder param1, int param2) {
        RuntimeException var4 = null;
        ResourceArchive var5 = null;
        RenderableModel stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -25431) {
            var5 = (ResourceArchive) null;
            this.loadMusicTracks(-49, (ResourceArchive) null);
          }
          stackIn_3_0 = param1.createModelMeshTransformed(this.field_d, this.field_t, this.field_q, this.field_e, this.field_u, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("oo.FC(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    void setViewMatrix(byte param0, int[] param1) {
        try {
          int var3_int = -56 % ((-64 - param0) / 52);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int e(int param0) {
        if (param0 != 31761) {
          return 92;
        }
        return this.floorColor(param0 ^ 32445);
    }

    final void a(int[] param0, int param1, int param2, int[] param3) {
        IntrusiveNode.a(2, param3, param0);
        if (param2 > -74) {
          return;
        }
        try {
          this.playTableSound(param1, DualLinkDequeIterator.field_g, (byte) -118, LoginRequiredScreen.field_I);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.NB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void animatePottedBall(Pocket param0, int param1, PoolMatchController param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        int var12 = 0;
        Ball var13 = null;
        try {
          var13 = param2.gameModel.balls[param3];
          var6 = (long)(-param0.centerX + var13.positionX);
          var8 = (long)(var13.positionY - param0.centerY);
          var10 = IterableNodeHashTable.sqrtScaled256(param1 ^ -24621, FullscreenFocusCanvas.multiplyFixedChecked(var6, var6, false) + FullscreenFocusCanvas.multiplyFixedChecked(var8, var8, false));
          var13.integrateFullStep(true);
          if (var13.positionZ > 4194304) {
            param2.addBallToRack(0, param3);
            return;
          }
          if (var13.positionZ < 0) {
            var12 = 1179648 - AccountDisplayNameSupport.sqrtScaled256(4194304 - (var13.positionZ * var13.positionZ >> 16), param1 ^ -24622);
          } else {
            var12 = 655360;
          }
          if (param1 != 24657) {
            field_I = -86;
          }
          if (var10 > (long)var12) {
            var8 = (long)var12 * var8 / var10;
            var6 = var6 * (long)var12 / var10;
          }
          var13.positionY = (int)var8 + param0.centerY;
          var13.transformDirty = true;
          var13.velocityX = var13.velocityX * 63 >> 6;
          var13.positionX = (int)var6 + param0.centerX;
          var13.velocityY = 63 * var13.velocityY >> 6;
          if (var13.positionZ > 2359296) {
            var13.positionZ = 2359296;
          }
          var13.angularVelocityX = 15 * var13.angularVelocityX / 16;
          var13.angularVelocityY = 15 * var13.angularVelocityY / 16;
          var13.angularVelocityZ = 15 * var13.angularVelocityZ / 16;
          var13.velocityZ = var13.velocityZ + 131072;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("oo.FB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    void b(boolean param0) {
        if (param0) {
          this.field_g = (int[][]) null;
        }
        this.playTableSound(10, 256, (byte) 62, 128);
    }

    private final void buildCushionMesh(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var16 = 0;
        int var17 = 0;
        MeshBuilder var18 = null;
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
        int var7 = -param0 + param3;
        var7 = var7 * var7;
        if (param4 > -24) {
          this.field_t = 18;
        }
        int var8 = -param2 + param1;
        var8 = var8 * var8;
        double var9 = Math.sqrt((double)(var8 + (var7 + 256)));
        int var11 = (int)Math.ceil(var9 / (double)ModelMesh.field_Y.length);
        MeshBuilder[] var12 = new MeshBuilder[var11];
        ModelInstance[] var13 = new ModelInstance[var11];
        int var14 = param3 - param0;
        int var15 = -param2 + param1;
        for (var16 = 0; var12.length > var16; var16++) {
          var17 = 1 + var16;
          var18 = new MeshBuilder(4, 4, 1);
          var19 = var14 * var16 / var11 + param0;
          var20 = var17 * var14 / var11 + param0;
          var21 = param2 + var16 * var15 / var11;
          var22 = param2 + var17 * var15 / var11;
          var23 = (var20 + var19) / 2;
          var24 = (var22 + var21) / 2;
          var25 = var18.addVertex(var19 - var23, var21 - var24, 0);
          var26 = var18.addVertex(-var23 + var20, -var24 + var22, 0);
          var27 = var18.addVertex(var19 - var23, var21 - var24, SpriteResourceSupport.floatToFixed3(-16.0f, true));
          var28 = var18.addVertex(var20 - var23, var22 - var24, SpriteResourceSupport.floatToFixed3(-16.0f, true));
          var18.addFace(var25, var27, var26, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) -123, this.e(31761)), this.c(99));
          var18.addFace(var28, var26, var27, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) 94, this.e(31761)), this.c(97));
          var18.addFace(var25, var26, var27, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) 93, this.e(31761)), this.c(100));
          var18.addFace(var28, var27, var26, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) 42, this.e(31761)), this.c(95));
          var12[var16] = var18;
          var13[var16] = new ModelInstance((ModelMesh) (var12[var16].createModelMesh(this.field_C, this.field_x, this.field_q, this.field_e, this.field_u)), new int[]{var23, var24, 0});
        }
        this.field_f[param5] = var12;
        this.field_o[param5] = var13;
    }

    private final void markViewDirty(int param0) {
        PackedColorSupport.field_c = true;
        if (param0 != 0) {
          this.floorColor(-49);
        }
        MouseWheelInput.field_c.field_g = true;
        if (null != AccountContentDialog.field_ub) {
          AccountContentDialog.field_ub.markBallTransformsDirty(0);
        }
        if (null != TextWidgetPainter.field_e) {
          TextWidgetPainter.field_e.markBallTransformsDirty(0);
        }
    }

    final void drawBall(int[] param0, Ball param1) {
        int var52 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        int var45;
        int var46;
        int var47;
        int var48;
        int var49;
        int var50;
        int var51;
        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        int var58;
        int var59;
        int var60;
        int var11Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        int var24Lifetime4;
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
        int var46Lifetime1;
        int var46Lifetime2;
        int var46Lifetime3;
        int var46Lifetime4;
        int var47Lifetime1;
        int var47Lifetime2;
        int var47Lifetime3;
        int var47Lifetime4;
        if (param1.positionZ > -524288) {
          return;
        }
        if (TransformRotationSupport.field_a.field_g) {
          var3 = this.field_q + (param1.positionX >> 13);
          var4 = this.field_e + (param1.positionY >> 13);
          var5 = this.field_u + (param1.positionZ >> 13);
        } else {
          var3 = this.field_q + 2304;
          var4 = this.field_e + 1152;
          var5 = this.field_u;
        }
        var6 = (param1.positionX >> 13) - var3;
        var7 = (param1.positionY >> 13) - var4;
        var8 = (param1.positionZ >> 13) - var5;
        var9 = var7;
        var10 = -var6;
        var11 = var9 * var9 + var10 * var10;
        if (var11 > 0) {
          var11 = AccountDisplayNameSupport.sqrtScaled256(var11, -121) >> 8;
          var9 = (var9 << 8) / var11;
          var10 = (var10 << 8) / var11;
        }
        var11Lifetime1 = -var8 * var10 >> 8;
        var12 = var8 * var9 >> 8;
        var13 = var6 * var10 - var7 * var9 >> 8;
        var14 = var11Lifetime1 * var11Lifetime1 + var12 * var12 + var13 * var13;
        if (var14 > 0) {
          var14 = AccountDisplayNameSupport.sqrtScaled256(var14, -125) >> 8;
          var11Lifetime1 = (var11Lifetime1 << 8) / var14;
          var12 = (var12 << 8) / var14;
          var13 = (var13 << 8) / var14;
        }
        var14Lifetime1 = (param1.positionX >> 8) + 8 * var9;
        var15 = (param1.positionY >> 8) + 8 * var10;
        var16 = (param1.positionX >> 8) - 8 * var9;
        var17 = (param1.positionY >> 8) - 8 * var10;
        var18 = (param1.positionX >> 8) + 8 * var11Lifetime1;
        var19 = (param1.positionY >> 8) + 8 * var12;
        var20 = (param1.positionZ >> 8) + 8 * var13;
        var21 = (param1.positionX >> 8) - 8 * var11Lifetime1;
        var22 = (param1.positionY >> 8) - 8 * var12;
        var23 = (param1.positionZ >> 8) - 8 * var13;
        var24 = -2048 - (var5 << 5);
        if (var24 == 0) {
          return;
        }
        var14Lifetime1 = var14Lifetime1 + (param1.positionZ >> 8) * -(var14Lifetime1 - (var3 << 5)) / var24;
        var15 = var15 + (param1.positionZ >> 8) * -(var15 - (var4 << 5)) / var24;
        var24Lifetime1 = -2048 - (var5 << 5);
        if (var24Lifetime1 == 0) {
          return;
        }
        var16 = var16 + (param1.positionZ >> 8) * -(var16 - (var3 << 5)) / var24Lifetime1;
        var17 = var17 + (param1.positionZ >> 8) * -(var17 - (var4 << 5)) / var24Lifetime1;
        var24Lifetime2 = var23 - (var5 << 5);
        if (var24Lifetime2 == 0) {
          return;
        }
        var21 = var21 + var23 * -(var21 - (var3 << 5)) / var24Lifetime2;
        var22 = var22 + var23 * -(var22 - (var4 << 5)) / var24Lifetime2;
        var24Lifetime3 = var20 - (var5 << 5);
        if (var24Lifetime3 == 0) {
          return;
        }
        var18 = var18 + var20 * -(var18 - (var3 << 5)) / var24Lifetime3;
        var19 = var19 + var20 * -(var19 - (var4 << 5)) / var24Lifetime3;
        var24Lifetime4 = -param0[2];
        var25 = 0;
        var14Lifetime1 = (var14Lifetime1 >> 5) - param0[0];
        var15 = (var15 >> 5) - param0[1];
        var26 = param0[3] * var14Lifetime1 + param0[4] * var15 + param0[5] * var24Lifetime4 >> 3;
        var27 = param0[6] * var14Lifetime1 + param0[7] * var15 + param0[8] * var24Lifetime4 >> 3;
        var28 = param0[9] * var14Lifetime1 + param0[10] * var15 + param0[11] * var24Lifetime4 >> 16;
        if (var28 == 0) {
          var28 = 1;
        }
        if (var28 < 0) {
          var25++;
        }
        var14Lifetime2 = 5120 + var26 / var28;
        var15Lifetime1 = 3840 + var27 / var28;
        var16 = (var16 >> 5) - param0[0];
        var17 = (var17 >> 5) - param0[1];
        var26Lifetime1 = param0[3] * var16 + param0[4] * var17 + param0[5] * var24Lifetime4 >> 3;
        var27Lifetime1 = param0[6] * var16 + param0[7] * var17 + param0[8] * var24Lifetime4 >> 3;
        var28Lifetime1 = param0[9] * var16 + param0[10] * var17 + param0[11] * var24Lifetime4 >> 16;
        if (var28Lifetime1 == 0) {
          var28Lifetime1 = 1;
        }
        if (var28Lifetime1 < 0) {
          var25++;
        }
        var16Lifetime1 = 5120 + var26Lifetime1 / var28Lifetime1;
        var17Lifetime1 = 3840 + var27Lifetime1 / var28Lifetime1;
        var21 = (var21 >> 5) - param0[0];
        var22 = (var22 >> 5) - param0[1];
        var26Lifetime2 = param0[3] * var21 + param0[4] * var22 + param0[5] * var24Lifetime4 >> 3;
        var27Lifetime2 = param0[6] * var21 + param0[7] * var22 + param0[8] * var24Lifetime4 >> 3;
        var28Lifetime2 = param0[9] * var21 + param0[10] * var22 + param0[11] * var24Lifetime4 >> 16;
        if (var28Lifetime2 == 0) {
          var28Lifetime2 = 1;
        }
        if (var28Lifetime2 < 0) {
          var25++;
        }
        var21Lifetime1 = 5120 + var26Lifetime2 / var28Lifetime2;
        var22Lifetime1 = 3840 + var27Lifetime2 / var28Lifetime2;
        var18 = (var18 >> 5) - param0[0];
        var19 = (var19 >> 5) - param0[1];
        var26Lifetime3 = param0[3] * var18 + param0[4] * var19 + param0[5] * var24Lifetime4 >> 3;
        var27Lifetime3 = param0[6] * var18 + param0[7] * var19 + param0[8] * var24Lifetime4 >> 3;
        var28Lifetime3 = param0[9] * var18 + param0[10] * var19 + param0[11] * var24Lifetime4 >> 16;
        if (var28Lifetime3 == 0) {
          var28Lifetime3 = 1;
        }
        if (var28Lifetime3 < 0) {
          var25++;
        }
        var18Lifetime1 = 5120 + var26Lifetime3 / var28Lifetime3;
        var19Lifetime1 = 3840 + var27Lifetime3 / var28Lifetime3;
        if (var25 > 1) {
          return;
        }
        if (var18Lifetime1 >> 4 < SoftwareRasterizer.clipLeft &&
          var21Lifetime1 >> 4 < SoftwareRasterizer.clipLeft &&
          var16Lifetime1 >> 4 < SoftwareRasterizer.clipLeft &&
          var14Lifetime2 >> 4 < SoftwareRasterizer.clipLeft) {
          return;
        }
        if (var19Lifetime1 >> 4 < SoftwareRasterizer.clipTop &&
          var22Lifetime1 >> 4 < SoftwareRasterizer.clipTop &&
          var17Lifetime1 >> 4 < SoftwareRasterizer.clipTop &&
          var15Lifetime1 >> 4 < SoftwareRasterizer.clipTop) {
          return;
        }
        if (var18Lifetime1 >> 4 >= SoftwareRasterizer.clipRight &&
          var21Lifetime1 >> 4 >= SoftwareRasterizer.clipRight &&
          var16Lifetime1 >> 4 >= SoftwareRasterizer.clipRight &&
          var14Lifetime2 >> 4 >= SoftwareRasterizer.clipRight) {
          return;
        }
        if (var19Lifetime1 >> 4 >= SoftwareRasterizer.clipBottom &&
          var22Lifetime1 >> 4 >= SoftwareRasterizer.clipBottom &&
          var17Lifetime1 >> 4 >= SoftwareRasterizer.clipBottom &&
          var15Lifetime1 >> 4 >= SoftwareRasterizer.clipBottom) {
          return;
        }
        if ((var18Lifetime1 > 16384 ||
          var18Lifetime1 < -16384) &&
          (var21Lifetime1 > 16384 ||
          var21Lifetime1 < -16384) &&
          (var14Lifetime2 > 16384 ||
          var14Lifetime2 < -16384)) {
          if (var16Lifetime1 > 16384) {
            return;
          }
          if (var16Lifetime1 < -16384) {
            return;
          }
        }
        if ((var19Lifetime1 > 16384 ||
          var19Lifetime1 < -16384) &&
          (var22Lifetime1 > 16384 ||
          var22Lifetime1 < -16384) &&
          (var15Lifetime1 > 16384 ||
          var15Lifetime1 < -16384)) {
          if (var17Lifetime1 > 16384) {
            return;
          }
          if (var17Lifetime1 < -16384) {
            return;
          }
        }
        var26Lifetime4 = var18Lifetime1 + var21Lifetime1 + var16Lifetime1 + var14Lifetime2 >> 2;
        var27Lifetime4 = var19Lifetime1 + var22Lifetime1 + var17Lifetime1 + var15Lifetime1 >> 2;
        var28Lifetime4 = var14Lifetime2 - var16Lifetime1;
        var29 = var15Lifetime1 - var17Lifetime1;
        var30 = var18Lifetime1 - var21Lifetime1;
        var31 = var19Lifetime1 - var22Lifetime1;
        var32 = var29;
        var33 = -var28Lifetime4;
        var34 = var31;
        var35 = -var30;
        var36 = var30 * var30 + var31 * var31;
        var37 = LoginTextValue.a(false, var36) << 2;
        var38 = var28Lifetime4 * var28Lifetime4 + var29 * var29;
        if (var38 == 0) {
          return;
        }
        var39 = LoginTextValue.a(false, var38) << 2;
        var32 = (var32 << 12) / var39;
        var33 = (var33 << 12) / var39;
        var34 = (var34 << 12) / var37;
        var35 = (var35 << 12) / var37;
        var40 = var30 * var32 + var31 * var33;
        var41 = var28Lifetime4 * var34 + var29 * var35;
        var42 = var26Lifetime4 >> 4;
        var43 = var26Lifetime4 >> 4;
        var44 = var27Lifetime4 >> 4;
        var45 = var27Lifetime4 >> 4;
        var46 = var18Lifetime1 + var28Lifetime4 / 2 >> 4;
        if (var46 >= var42) {
          if (var46 > var43) {
            var43 = var46;
          }
        } else {
          var42 = var46;
        }
        var47 = var19Lifetime1 + var29 / 2 >> 4;
        if (var47 >= var44) {
          if (var47 > var45) {
            var45 = var47;
          }
        } else {
          var44 = var47;
        }
        var46Lifetime1 = var18Lifetime1 - var28Lifetime4 / 2 >> 4;
        if (var46Lifetime1 >= var42) {
          if (var46Lifetime1 > var43) {
            var43 = var46Lifetime1;
          }
        } else {
          var42 = var46Lifetime1;
        }
        var47Lifetime1 = var19Lifetime1 - var29 / 2 >> 4;
        if (var47Lifetime1 >= var44) {
          if (var47Lifetime1 > var45) {
            var45 = var47Lifetime1;
          }
        } else {
          var44 = var47Lifetime1;
        }
        var46Lifetime2 = var21Lifetime1 + var28Lifetime4 / 2 >> 4;
        if (var46Lifetime2 >= var42) {
          if (var46Lifetime2 > var43) {
            var43 = var46Lifetime2;
          }
        } else {
          var42 = var46Lifetime2;
        }
        var47Lifetime2 = var22Lifetime1 + var29 / 2 >> 4;
        if (var47Lifetime2 >= var44) {
          if (var47Lifetime2 > var45) {
            var45 = var47Lifetime2;
          }
        } else {
          var44 = var47Lifetime2;
        }
        var46Lifetime3 = var21Lifetime1 - var28Lifetime4 / 2 >> 4;
        if (var46Lifetime3 >= var42) {
          if (var46Lifetime3 > var43) {
            var43 = var46Lifetime3;
          }
        } else {
          var42 = var46Lifetime3;
        }
        var47Lifetime3 = var22Lifetime1 - var29 / 2 >> 4;
        if (var47Lifetime3 >= var44) {
          if (var47Lifetime3 > var45) {
            var45 = var47Lifetime3;
          }
        } else {
          var44 = var47Lifetime3;
        }
        if (var42 < SoftwareRasterizer.clipLeft) {
          var42 = SoftwareRasterizer.clipLeft;
        }
        if (var43 > SoftwareRasterizer.clipRight) {
          var43 = SoftwareRasterizer.clipRight;
        }
        if (var44 < SoftwareRasterizer.clipTop) {
          var44 = SoftwareRasterizer.clipTop;
        }
        if (var45 > SoftwareRasterizer.clipBottom) {
          var45 = SoftwareRasterizer.clipBottom;
        }
        for (var46Lifetime4 = var44; var46Lifetime4 < var45; var46Lifetime4++) {
          var47Lifetime4 = (var46Lifetime4 << 4) - var22Lifetime1;
          var48 = (var46Lifetime4 << 4) - var17Lifetime1;
          var49 = var47Lifetime4 * var33;
          var50 = var48 * var35;
          var51 = var46Lifetime4 * 640;
          for (var52 = var42; var52 < var43; var52++) {
            var53 = (var52 << 4) - var21Lifetime1;
            var54 = (var52 << 4) - var16Lifetime1;
            var55 = (var53 * var32 + var49 << 8) / var40 - 128;
            var56 = (var54 * var34 + var50 << 8) / var41 - 128;
            var57 = var55 * var55 + var56 * var56;
            if (var57 < 16384) {
              if (var55 < 0) {
                var55 = var55 >> 1;
                var57 = var55 * var55 + var56 * var56;
              }
              var58 = (this.field_C << 1) + (var57 * this.field_x >> 13);
              if (var58 < 0) {
                var58 = 0;
              }
              if (var58 < 256) {
                var59 = SoftwareRasterizer.pixels[var51 + var52];
                var60 = (var59 & 65280) * var58 >> 8 & 65280;
                var59 = (var59 & 16711935) * var58 >> 8 & 16711935;
                SoftwareRasterizer.pixels[var51 + var52] = var59 | var60;
              }
            }
          }
        }
        return;
    }

    final RenderableModel createModelMeshAtPosition(int[] param0, byte param1, MeshBuilder param2) {
        RuntimeException var4 = null;
        RenderableModel stackIn_2_0 = null;
        RenderableModel stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 103) {
            stackIn_4_0 = param2.createModelMeshTransformed(this.field_d, this.field_t, -param0[0] + (2304 + this.field_q), 1152 + (this.field_e - param0[1]), this.field_u - param0[2], param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (RenderableModel) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("oo.DC(");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void prepareMusic(int param0, SoundCache param1, ResourceArchive param2) {
        PlayingSound[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 3) {
            var5 = (PlayingSound[]) null;
            this.updateRollingSounds(-23, -100, (byte) -87, (PcmSample[]) null, (PlayingSound[]) null);
          }
          if (this.field_b != null) {
            RankingsScreen.field_N.prepareScoreInstruments(param1, param2, this.field_b, param0 ^ 79, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("oo.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -15631) {
          return;
        }
        timeTrial = null;
        field_w = null;
        field_D = null;
    }

    void loadMusicTracks(int param0, ResourceArchive param1) {
        try {
          if (param0 != 1) {
            this.floorTexture(67);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final byte c(int param0) {
        if (param0 <= 94) {
          return (byte) -18;
        }
        return this.floorTexture(-112);
    }

    final String describeAmbientLight(byte param0) {
        if (param0 != 32) {
          int[] var3 = (int[]) null;
          this.a(-106, (int[]) null, 4, (int[]) null, 62);
        }
        return "lighting amb=" + this.field_d + ", cont=" + this.field_m;
    }

    final RenderableModel createModelMeshWithBallTransform(int[] param0, MeshBuilder param1, int param2) {
        RuntimeException var4 = null;
        Ball[] var5 = null;
        RenderableModel stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -52) {
            var5 = (Ball[]) null;
            this.prepareBallDrawOrder(true, (int[]) null, (Ball[]) null);
          }
          stackIn_3_0 = param1.createModelMeshTransformed(this.field_C, this.field_F, this.field_q, this.field_e, this.field_u, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("oo.RB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    void buildPalettes(int param0) {
        if (param0 != 25879) {
          this.field_G = -36;
        }
    }

    void initializeScene(boolean param0) {
        if (!param0) {
          this.field_z = -0.5056021213531494f;
        }
    }

    final boolean isSoundPlaying(int param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 31 % ((-8 - param0) / 41);
        stackIn_4_0 = (null != this.field_r) && (!this.field_r.isSamplePositionOutOfRange());
        return stackIn_4_0;
    }

    private final void buildPocketMarkers(Pocket[] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        ModelMesh var3 = null;
        double var4_double = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        ModelMesh var12 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          MeshBoundsSupport.field_b = new MeshBuilder(17, 16, 1);
          for (var3_int = 0; var3_int < 16; var3_int++) {
            var4_double = Math.sin(2.0 * (3.141592653589793 * (double)var3_int) / 16.0);
            var6 = Math.cos(3.141592653589793 * (double)var3_int * 2.0 / 16.0);
            var8 = Math.sin(2.0 * (3.141592653589793 * (double)(var3_int + 1)) / 16.0);
            var10 = Math.cos(3.141592653589793 * (double)(var3_int + 1) * 2.0 / 16.0);
            MeshBoundsSupport.field_b.addFace(MeshBoundsSupport.field_b.addVertex(0, 0, 0), MeshBoundsSupport.field_b.addVertex(PotEvent.doubleToFixed3(4885, 18.0 * var10), PotEvent.doubleToFixed3(4885, var8 * 18.0), 0), MeshBoundsSupport.field_b.addVertex(PotEvent.doubleToFixed3(4885, 18.0 * var6), PotEvent.doubleToFixed3(4885, 18.0 * var4_double), 0), (byte) 1, (short) 127, (byte) 127);
          }
          var12 = (ModelMesh) (this.createModelMeshUntransformed(-113, MeshBoundsSupport.field_b));
          var3 = var12;
          LimitedRandomAccessFile.field_g = new ModelInstance[param0.length];
          if (param1 >= -16) {
            return;
          }
          for (var4 = 0; LimitedRandomAccessFile.field_g.length > var4; var4++) {
            LimitedRandomAccessFile.field_g[var4] = new ModelInstance(var12, new int[]{param0[var4].centerX >> 13, param0[var4].centerY >> 13, 0});
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("oo.CB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void buildCushionMeshes(byte param0, CushionSegment[] param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_f = new MeshBuilder[param1.length][];
          this.field_o = new ModelInstance[param1.length][];
          if (param0 != -92) {
            return;
          }
          for (var3_int = 0; var3_int < this.field_f.length; var3_int++) {
            this.buildCushionMesh(param1[var3_int].startX >> 13, param1[var3_int].endY >> 13, param1[var3_int].startY >> 13, param1[var3_int].endX >> 13, (byte) -57, var3_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("oo.GC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void loadModels(ResourceArchive param0, int param1) {
        try {
          if (param1 >= -43) {
            this.field_e = 4;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void loadSounds(SoundCache param0, int param1) {
        try {
          int var3_int = 55 % ((39 - param1) / 38);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    byte floorTexture(int param0) {
        int var2 = -110 / ((param0 - 9) / 63);
        return (byte) 0;
    }

    final void initSoundSlots(int param0, int param1) {
        if (param0 < 52) {
          return;
        }
        this.stopSounds((byte) 120);
        QuickChatPhraseDefinition.field_D = new PlayingSound[param1];
    }

    final void stopSounds(byte param0) {
        int var2 = 0;
        int var3;
        var3 = Pool.field_O;
        if (param0 < 87) {
          return;
        }
        if (QuickChatPhraseDefinition.field_D != null) {
          for (var2 = 0; var2 < QuickChatPhraseDefinition.field_D.length; var2++) {
            if (null != QuickChatPhraseDefinition.field_D[var2] &&
              !QuickChatPhraseDefinition.field_D[var2].field_o.isSamplePositionOutOfRange()) {
              QuickChatPhraseDefinition.field_D[var2].field_o.fadeOutAndUnlink(441);
            }
          }
        }
    }

    final void updateRollingSounds(int param0, int param1, byte param2, PcmSample[] param3, PlayingSound[] param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var7Lifetime1;
        var10 = Pool.field_O;
        try {
          var6_int = 6114 * param0 >> 7;
          for (var7 = 0; var7 < 2; var7++) {
            if (null != param4[var7] &&
              !param4[var7].field_o.isSamplePositionOutOfRange()) {
              var8 = param4[var7].field_n;
              var9 = -32;
              if (var8 > var6_int) {
                var9 = var6_int - var8;
              }
              param4[var7].setPanAndRampVolume(var9 + MaxLengthTextInputWidget.nextRandomInt(64, true, RankingsRequest.field_r) + var8, 441, 128);
            } else if ((param4[var7] == null ||
              param4[var7].field_o.isSamplePositionOutOfRange()) && MaxLengthTextInputWidget.nextRandomInt(param1, true, RankingsRequest.field_r) == 0) {
              param4[var7] = DualLinkDequeIterator.a(-24296, PcmSampleStream.createAtRatePercentPan(param3[MaxLengthTextInputWidget.nextRandomInt(param3.length, true, RankingsRequest.field_r)], 100, var6_int, 8192 * var7 + 4096));
            }
          }
          var7Lifetime1 = -14 % ((-11 - param2) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("oo.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    void buildTableGeometry(PoolGameModel param0, int param1) {
        CushionSegment[] var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.buildFloorTiles(2);
          this.buildPocketMarkers(param0.pockets, -33);
          this.buildCushionMeshes((byte) -92, param0.cushionSegments);
          this.a(param0.cushionSegments, 16);
          this.markViewDirty(0);
          if (param1 != 21894) {
            var4 = (CushionSegment[]) null;
            this.buildCushionMeshes((byte) 111, (CushionSegment[]) null);
            this.updateLightPosition(120);
          } else {
            this.updateLightPosition(120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oo.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final RenderableModel createModelMeshUntransformed(int param0, MeshBuilder param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RenderableModel stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -19 / ((param0 - 57) / 45);
          stackIn_1_0 = param1.createModelMesh(this.field_C, this.field_F, this.field_q, this.field_e, this.field_u);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("oo.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    abstract void drawScene(byte param0, PoolMatchController param1);

    void buildSceneryLayers(int param0) {
        if (param0 != 2) {
          this.field_g = (int[][]) null;
        }
    }

    final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          var3_int = 0;
          if (param0 <= 26) {
            this.field_b = (MusicTrack) null;
          }
          while (var3_int < this.field_y.length) {
            this.field_y[var3_int].c(6710886, param1);
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("oo.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int[] param1, int param2, int[] param3, int param4) {
        try {
          IntrusiveNode.a(param0 - 1336449638, param3, param1);
          this.playTableSound(param4, DualLinkDequeIterator.field_g * param2 >> 8, (byte) -111, LoginRequiredScreen.field_I);
          if (param0 != 1336449640) {
            this.field_j = 1.1224327362689441;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.QB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void drawBallsInOrder(int[] param0, byte param1, boolean param2, Ball[] param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        Ball var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 < 63) {
            this.field_t = 44;
          }
          for (var6_int = QuickChatPhraseRegistry.field_g + (param3.length - 1); var6_int >= 0; var6_int--) {
            var7 = LinkButtonPainter.field_f[var6_int];
            if (var7 >= param3.length) {
              if (param4) {
                GrowableIntListFactory.field_a[var7].draw(param0, -32215);
              }
            } else {
              var8 = param3[var7];
              if (!var8.inPlay &&
                var8.positionZ >= 0) {
                stackIn_9_0 = 1;
              } else {
                stackIn_9_0 = 0;
              }
              if (stackIn_9_0 != (param2 ? 1 : 0) &&
                !var8.field_o) {
                GrowableIntListFactory.field_a[var7].draw(param0, -32215);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("oo.LB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    final void prepareBallDrawOrder(boolean param0, int[] param1, Ball[] param2) {
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        var6 = Pool.field_O;
        try {
          if (param0) {
            this.field_C = 46;
          }
          for (var4_int = 0; var4_int < param2.length; var4_int++) {
            if (param2[var4_int].transformDirty) {
              param2[var4_int].updateRenderTransform(2);
              TransformRotationSupport.field_a.buildBallModel(false, param2[var4_int].renderTransform, var4_int);
            }
            GrowableIntListFactory.field_a[var4_int] = (SceneDrawable) ((Object) DropTargetWidget.field_O[var4_int]);
            LinkButtonPainter.field_f[var4_int] = var4_int;
            GrowableIntList.field_d[var4_int] = GrowableIntListFactory.field_a[var4_int].viewDepth(param1, -111);
          }
          for (var5 = 0; var5 < QuickChatPhraseRegistry.field_g; var5++) {
            GrowableIntListFactory.field_a[var4_int] = (SceneDrawable) ((Object) ArchiveLoadSequence.field_e[var5]);
            LinkButtonPainter.field_f[var4_int] = var4_int;
            GrowableIntList.field_d[var4_int] = GrowableIntListFactory.field_a[var4_int].viewDepth(param1, -114);
            var4_int++;
          }
          ChatInputSupport.quickSortRange(0, -30916, GrowableIntList.field_d, LinkButtonPainter.field_f, param2.length - (-QuickChatPhraseRegistry.field_g + 1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("oo.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String describeLighting(byte param0) {
        if (param0 != 123) {
          return (String) null;
        }
        return "lighting amb=" + this.field_C + ", cont=" + this.field_x + ", ang=[" + (int)(this.field_j * 180.0 / 3.141592653589793) + ", " + (int)(this.field_p * 180.0 / 3.141592653589793) + "], dist=" + (int)this.field_E + " => pos=[" + this.field_q + "," + this.field_e + "," + this.field_u + "], gamma=" + this.field_z;
    }

    void playTableSound(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        var5 = -95 % ((-44 - param2) / 56);
        var6 = param0;
        if (var6 != 15) {
          if (var6 != 16) {
            if (var6 != 10) {
              if (var6 != 17) {
                if (var6 == 18) {
                  if (null != this.field_n) {
                    KillerBallSkin.playMusicTrack(256, false, false, this.field_n);
                  } else {
                    if (null != this.field_i) {
                      KillerBallSkin.playMusicTrack(256, false, false, this.field_i);
                    }
                  }
                }
              } else {
                if (this.field_i != null) {
                  KillerBallSkin.playMusicTrack(256, false, false, this.field_i);
                }
              }
            } else {
              KillerBallSkin.playMusicTrack(256, true, true, this.field_b);
            }
          } else {
            this.playTableSound(3, param1, (byte) -117, param3);
          }
        } else {
          this.playTableSound(2, param1, (byte) -105, param3);
        }
    }

    void stopLoopSounds(boolean param0) {
        if (param0) {
          Pocket[] var3 = (Pocket[]) null;
          this.buildPocketMarkers((Pocket[]) null, 70);
        }
    }

    void loadSceneSprites(int param0, ResourceArchive param1) {
        try {
          if (param0 != -23569) {
            TableScene.releaseStatics(-78);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void createDebugOverlays(PoolGameModel param0, int param1) {
        int var3_int = 0;
        int var3_intLifetime1;
        try {
          DropTargetWidget.field_O = new BallDebugOverlay[param0.balls.length];
          GrowableIntListFactory.field_a = new SceneDrawable[ArchiveLoadSequence.field_e.length + param0.balls.length];
          var3_int = param1;
          for (var3_intLifetime1 = 0; var3_intLifetime1 < param0.balls.length; var3_intLifetime1++) {
            DropTargetWidget.field_O[var3_intLifetime1] = new BallDebugOverlay(var3_intLifetime1, param0);
          }
          GrowableIntList.field_d = new int[GrowableIntListFactory.field_a.length];
          LinkButtonPainter.field_f = new int[GrowableIntListFactory.field_a.length];
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void updateHumPitch(int param0, int param1) {
        int var3 = -12 / ((11 - param0) / 52);
    }

    final void updateLightPosition(int param0) {
        while (this.field_j < 0.0) {
          this.field_j = this.field_j + 6.283185307179586;
        }
        if (16.0 > this.field_E) {
          this.field_E = 16.0;
        } else {
          if (16384.0 < this.field_E) {
            this.field_E = 16384.0;
          }
        }
        while (this.field_j >= 6.283185307179586) {
          this.field_j = this.field_j - 6.283185307179586;
        }
        if (!(0.0 > this.field_p)) {
          if (1.5707963267948966 < this.field_p) {
            this.field_p = 1.5707963267948966;
          }
        } else {
          this.field_p = 0.0;
        }
        this.field_q = (int)(this.field_E * Math.cos(this.field_j) * Math.cos(this.field_p));
        if (param0 < 109) {
          return;
        }
        this.field_e = (int)(this.field_E * Math.sin(this.field_j) * Math.cos(this.field_p));
        this.field_u = -(int)(this.field_E * Math.sin(this.field_p));
        if (this.field_x <= 0) {
          this.field_x = 1;
        }
        this.field_F = 132072 / (this.field_x * 3);
        if (this.field_m <= 0) {
          this.field_m = 1;
        }
        TriangleRasterizer.field_p = this.field_z;
        this.field_t = 132072 / (3 * this.field_m);
        TriangleRasterizer.setBrightness(this.field_z);
    }

    private final void a(CushionSegment[] param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        long var3_long = 0L;
        int[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9_long = 0L;
        long var11 = 0L;
        long var13 = 0L;
        int[][] var16 = null;
        int[][] var17 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var9 = 0;
        long var10 = 0L;
        int var15 = 0;
        try {
          var3_long = -1L;
          var17 = new int[param1][];
          var16 = var17;
          var5 = var16;
          var6 = 0;
          for (var7 = 0; param0.length > var7; var7++) {
            for (var8 = 1 + var7; param0.length > var8; var8++) {
              var9_long = (long)(param0[var7].centerX(param1 + 83) - param0[var8].centerX(param1 ^ 101));
              var11 = (long)(param0[var7].centerY((byte) -127) - param0[var8].centerY((byte) -127));
              var13 = FullscreenFocusCanvas.multiplyFixedChecked(var9_long, var9_long, false) + FullscreenFocusCanvas.multiplyFixedChecked(var11, var11, false);
              if (var3_long < var13) {
                var3_long = var13;
                var6 = 0;
                incrementValue$0 = var6;
                var6++;
                var5[incrementValue$0] = new int[]{var7, var8};
              } else {
                if (~var3_long == ~var13) {
                  incrementValue$1 = var6;
                  var6++;
                  var5[incrementValue$1] = new int[]{var7, var8};
                }
              }
            }
          }
          this.field_a = new int[var6][2];
          this.field_g = new int[var6][2];
          var15 = 0;
          var7 = var15;
          while (true) {
            if (var15 >= this.field_a.length) {
              return;
            }
            var8 = param0[var17[var15][1]].centerX(123) - param0[var17[var15][0]].centerX(109);
            var9 = param0[var17[var15][1]].centerY((byte) -127) - param0[var17[var15][0]].centerY((byte) -127);
            this.field_a[var15][0] = -var9 >> 13;
            this.field_a[var15][1] = var8 >> 13;
            var10 = IterableNodeHashTable.sqrtScaled256(-111, FullscreenFocusCanvas.multiplyFixedChecked((long)var8, (long)var8, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var9, (long)var9, false));
            if (var10 <= 2147483647L &&
              var10 >= -2147483648L) {
              this.field_a[var15][0] = ArchiveProvider.divideFixed16((int)var10, (byte) -74, (long)this.field_a[var15][0]);
              this.field_a[var15][1] = ArchiveProvider.divideFixed16((int)var10, (byte) -95, (long)this.field_a[var15][1]);
              this.field_g[var15][0] = var17[var15][0];
              this.field_g[var15][1] = var17[var15][1];
              var15++;
              continue;
            }
            break;
          }
          throw new IllegalStateException("norm out of range: " + var10);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("oo.PB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    void clampCamera(boolean param0, Camera param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        Ball[] var5 = null;
        try {
          if (!(param1.targetY < 0.0)) {
            if (param1.targetY > 288.0) {
              param1.targetY = 288.0;
            }
          } else {
            param1.targetY = 0.0;
          }
          if (param1.targetX < 0.0) {
            param1.targetX = 0.0;
          } else {
            if (param1.targetX > 576.0) {
              param1.targetX = 576.0;
            }
          }
          if (param0) {
            var5 = (Ball[]) null;
            this.drawBallsInOrder((int[]) null, (byte) -29, true, (Ball[]) null, false);
          }
          var3_double = param1.getDistance(8);
          if (var3_double > 768.0) {
            param1.eyeY = 768.0 * (-param1.targetY + param1.eyeY) / var3_double + param1.targetY;
            param1.eyeZ = (param1.eyeZ - param1.targetZ) * 768.0 / var3_double + param1.targetZ;
            param1.eyeX = param1.targetX + (param1.eyeX - param1.targetX) * 768.0 / var3_double;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("oo.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void buildFloorTiles(int param0) {
        int var16 = 0;
        double var17 = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        float var2 = (float)PotEvent.doubleToFixed3(4885, Math.sqrt(414720.0));
        int var3 = (int)Math.ceil((double)(var2 / (float)ModelMesh.field_Y.length));
        int var4 = (int)Math.ceil((double)(var2 / (float)ModelMesh.field_Y.length));
        this.field_y = new ModelInstance[var3 * var4];
        double var5 = 576.0 / (double)var3;
        double var7 = 288.0 / (double)var4;
        int var9 = (PotEvent.doubleToFixed3(4885, var5) >> 1) * 16 / 16;
        int var10 = (PotEvent.doubleToFixed3(param0 + 4883, var7) >> 1) * 16 / 16;
        this.field_s = new MeshBuilder(4, param0, 1);
        int var11 = this.field_s.addVertex(-var9, -var10, 0);
        int var12 = this.field_s.addVertex(var9, -var10, 0);
        int var13 = this.field_s.addVertex(-var9, var10, 0);
        int var14 = this.field_s.addVertex(var9, var10, 0);
        this.field_s.addFace(var11, var13, var12, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) -105, this.floorColor(684)), this.floorTexture(-56));
        this.field_s.addFace(var14, var12, var13, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) -127, this.floorColor(684)), this.floorTexture(91));
        ModelMesh var15 = (ModelMesh) (this.createModelMeshUntransformed(103, this.field_s));
        for (var16 = 0; var16 < var4; var16++) {
          var17 = var7 * (double)(1 + 2 * var16) / 2.0;
          for (var19 = 0; var3 > var19; var19++) {
            var20 = var5 * (double)(1 + var19 * 2) / 2.0;
            this.field_y[var16 * var3 + var19] = new ModelInstance(var15, MidiNoteMixer.a(new double[]{var20, var17, 0.0}, -30100));
          }
        }
    }

    void loadBackdrop(int param0, ResourceArchive param1) {
        try {
          if (param0 != 5) {
            this.field_b = (MusicTrack) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oo.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(byte param0, boolean param1, int param2) {
        int var4 = 30 / ((param0 + 47) / 45);
    }

    int floorColor(int param0) {
        if (param0 != 684) {
          this.field_g = (int[][]) null;
        }
        return 6723942;
    }

    TableScene() {
        this.field_q = -1024;
        this.field_u = -10240;
        this.field_p = 0.7853981633974483;
        this.field_z = 1.0f;
        this.field_G = 0;
        this.field_x = 32;
        this.field_F = 1031;
        this.field_C = 96;
        this.field_d = 96;
        this.field_m = 32;
        this.field_E = 1024.0;
        this.field_H = 0;
        this.field_h = false;
        this.field_e = -1024;
        this.field_j = 0.7853981633974483;
        this.field_t = 1031;
        this.updateLightPosition(115);
    }

    void updatePottedBalls(int param0, PoolMatchController param1) {
        int var4 = 0;
        int var6 = 0;
        Pocket[] var3 = null;
        GrowableIntList var5 = null;
        int var7 = 0;
        Ball var8 = null;
        int var9 = 0;
        Pocket[] var10 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = Pool.field_O;
        try {
          if (param0 != 10) {
            this.field_f = (MeshBuilder[][]) null;
          }
          if (null != this.field_r &&
            this.field_r.isSamplePositionOutOfRange()) {
            this.field_r = null;
          }
          var10 = param1.gameModel.pockets;
          var3 = var10;
          for (var4 = 0; var4 < var10.length; var4++) {
            var5 = var10[var4].pottedBalls;
            if (var5 != null) {
              for (var6 = 0; var6 < var5.size((byte) 127); var6++) {
                var7 = var5.get(var6, 2229);
                var8 = param1.gameModel.balls[var7];
                if (var8.inPlay) {
                  throw new IllegalStateException("Ball in play cannot be potted!");
                }
                if (!var8.field_o) {
                  LobbyGame.field_gc.animatePottedBall(var10[var4], 24657, param1, var7);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("oo.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        timeTrial = "Time trial";
    }
}
