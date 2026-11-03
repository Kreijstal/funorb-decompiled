/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlasmaTableScene extends TableScene {
    private PcmSample field_db;
    static int field_Z;
    private PcmSample field_W;
    private byte field_S;
    private int[] field_L;
    private PcmSampleStream field_bb;
    private PcmSample field_O;
    private PcmSample field_hb;
    private PcmSample field_fb;
    private PcmSample field_J;
    static DialogLayer field_cb;
    private PcmSample field_Y;
    static int field_ab;
    private ji[] field_K;
    private PcmSample field_Q;
    static int field_V;
    private PcmSample field_N;
    private int[] field_R;
    static String mbCaptionTitle;
    private int[] field_X;
    private int[] field_M;
    static ViewportController field_gb;
    private PcmSample field_T;
    private PcmSample field_U;
    private PcmSample field_P;

    final void buildTableGeometry(PoolGameModel param0, int param1) {
        int var5_int = 0;
        int var3_int = 0;
        int var4_int = 0;
        CushionSegment var4 = null;
        CushionSegment var5 = null;
        CushionSegment var6 = null;
        CushionSegment var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4_intLifetime1;
        var8 = Pool.field_O;
        try {
          super.buildTableGeometry(param0, param1);
          t.field_a = new int[3][17][33];
          ro.field_v = new int[3][17][33];
          ArrayWidgetGroup.field_K = new jd[16][32];
          DelegatingCanvas.field_a = new jd[16][32];
          for (var3_int = 0; var3_int <= 16; var3_int++) {
            var4_int = var3_int * 2304 / 16;
            for (var5_int = 0; var5_int <= 32; var5_int++) {
              t.field_a[0][var3_int][var5_int] = 4608 * var5_int / 32;
              t.field_a[1][var3_int][var5_int] = var4_int;
              t.field_a[2][var3_int][var5_int] = 0;
            }
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 16; var3_intLifetime1++) {
            for (var4_intLifetime1 = 0; var4_intLifetime1 < 32; var4_intLifetime1++) {
              ArrayWidgetGroup.field_K[var3_intLifetime1][var4_intLifetime1] = new jd();
              DelegatingCanvas.field_a[var3_intLifetime1][var4_intLifetime1] = new jd();
            }
          }
          LimitedRandomAccessFile.field_i = ta.buildGradientPalette(new int[]{0, 16744383, 256, 0}, param1 - 22022);
          this.buildWireframeGrid(10);
          this.field_K = new ji[12];
          for (var3_intLifetime2 = 0; var3_intLifetime2 < 6; var3_intLifetime2++) {
            var4 = param0.cushionSegments[(var3_intLifetime2 * 4 + 3) % param0.cushionSegments.length];
            var5 = param0.cushionSegments[(var3_intLifetime2 * 4 + 4) % param0.cushionSegments.length];
            var6 = param0.cushionSegments[(5 + 4 * var3_intLifetime2) % param0.cushionSegments.length];
            var7 = param0.cushionSegments[(6 + 4 * var3_intLifetime2) % param0.cushionSegments.length];
            this.field_K[2 * var3_intLifetime2] = new ji(new int[]{var5.startX + var5.endX >> 14, var5.startY + var5.endY >> 14, var6.startX >> 13, var6.startY >> 13, var7.startX >> 13, var7.startY >> 13});
            this.field_K[1 + var3_intLifetime2 * 2] = new ji(new int[]{var5.startX + var5.endX >> 14, var5.startY + var5.endY >> 14, var5.startX >> 13, var5.startY >> 13, var4.startX >> 13, var4.startY >> 13});
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("fk.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void playTableSound(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        var7 = Pool.field_O;
        var5 = 119 / ((param2 + 44) / 56);
        super.playTableSound(param0, param1, (byte) -104, param3);
        var6 = param0;
        if (var6 == 5) {
          var6 = MaxLengthTextInputWidget.nextRandomInt(4, true, ea.field_r);
          if (0 == var6) {
            kp.a(100, this.field_hb, param3, param1);
          } else {
            if (var6 != 1) {
              if (var6 == 2) {
                kp.a(100, this.field_db, param3, param1);
              } else {
                if (var6 == 3) {
                  kp.a(100, this.field_T, param3, param1);
                }
              }
            } else {
              kp.a(100, this.field_N, param3, param1);
            }
          }
        } else {
          if (2 != var6) {
            if (3 != var6) {
              if (var6 == 7) {
                kp.a(100, this.field_W, param3, param1);
              } else {
                if (var6 == 8) {
                  kp.a(100, this.field_Q, param3, param1);
                } else {
                  if (var6 != 6) {
                    if (var6 == 4) {
                      kp.a(100, this.field_J, param3, param1);
                    } else {
                      if (var6 != 9) {
                        if (var6 == 10) {
                          kp.a(100, this.field_fb, param3, param1 * 64 >> 8);
                        }
                      } else {
                        if (null != this.field_bb) {
                          this.a((byte) 73, true, param0);
                        }
                        this.field_bb = PcmSampleStream.createAtStepAndVolume(this.field_U, 256, 0);
                        this.field_bb.e(-1);
                        DualLinkDequeIterator.a(-24296, this.field_bb);
                        this.field_bb.rampVolumeInSteps(4096, 16 * param1 >> 8);
                      }
                    }
                  } else {
                    kp.a(100, this.field_O, param3, param1);
                    System.out.println("playing respot the white");
                  }
                }
              }
            } else {
              kp.a(100, this.field_Y, param3, param1);
            }
          } else {
            kp.a(100, this.field_P, param3, param1);
          }
        }
    }

    private final static void a(int[] param0) {
        int var1;
        int var2;
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
        int[] var15;
        int[] var16;
        int[] stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        int var14;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var14Lifetime1;
        var16 = f.a((byte) 100, param0);
        var15 = var16;
        param0 = var15;
        param0[0] = param0[0] - 2304;
        param0[1] = param0[1] - 1152;
        param0[0] = param0[0] >> 8;
        param0[1] = param0[1] >> 8;
        param0[2] = param0[2] >> 8;
        var1 = 65536 / SoftwareRasterizer.width;
        ClassicBallSkin.field_l = ClassicBallSkin.field_l & 127;
        EmailAvailabilityValidator.field_x = -64 + ClassicBallSkin.field_l;
        gn.field_b = 0 + ClassicBallSkin.field_l;
        stackIn_2_0 = LimitedRandomAccessFile.field_i;
        if (ClassicBallSkin.field_l >= 16) {
          stackIn_3_1 = ClassicBallSkin.field_l >> 1;
        } else {
          stackIn_3_1 = (16 - ClassicBallSkin.field_l) * (LimitedRandomAccessFile.field_i.length - 1) >> 4;
        }
        AccountContentDialog.field_tb = stackIn_2_0[stackIn_3_1];
        IterableNodeHashTable.field_h = 64 + ClassicBallSkin.field_l;
        ArchiveLoadSequence.field_g = 128 + ClassicBallSkin.field_l;
        cl.field_g = LimitedRandomAccessFile.field_i[64 + (ClassicBallSkin.field_l >> 1)];
        DateInputWidget.field_Y = 192 + ClassicBallSkin.field_l;
        gn.field_d = 256 + ClassicBallSkin.field_l;
        pn.field_s = LimitedRandomAccessFile.field_i[128 + (ClassicBallSkin.field_l >> 1)];
        UsernameSuggestionsPanel.field_O = 320 + ClassicBallSkin.field_l;
        ll.field_c = 384 + ClassicBallSkin.field_l;
        NineSliceFrame.field_f = LimitedRandomAccessFile.field_i[192 + (ClassicBallSkin.field_l >> 1)];
        DisplayNamePanel.field_V = ll.field_c * ll.field_c;
        var2 = SoftwareRasterizer.clipTop;
        var3 = 256 - var16[2];
        var4 = var16[8] * var3;
        var5 = var16[11] * var3;
        var6 = ll.field_c - var16[0];
        var7 = ll.field_c - var16[1];
        var8 = var16[9] * var6 + var16[10] * var7 + var5 >> 16;
        if (var8 > 0) {
          var9 = SoftwareRasterizer.clipTop + TriangleRasterizer.projectionCenterY + (var16[6] * var6 + var16[7] * var7 + var4) >> 7 / var8;
          if (var9 > 0 &&
            var9 < var2) {
            var2 = var9;
          }
        }
        var6Lifetime1 = -ll.field_c - var16[0];
        var7Lifetime1 = ll.field_c - var16[1];
        var8Lifetime1 = var16[9] * var6Lifetime1 + var16[10] * var7Lifetime1 + var5 >> 16;
        if (var8Lifetime1 > 0) {
          var9Lifetime1 = SoftwareRasterizer.clipTop + TriangleRasterizer.projectionCenterY + (var16[6] * var6Lifetime1 + var16[7] * var7Lifetime1 + var4) >> 7 / var8Lifetime1;
          if (var9Lifetime1 > 0 &&
            var9Lifetime1 < var2) {
            var2 = var9Lifetime1;
          }
        }
        var6Lifetime2 = ll.field_c - var16[0];
        var7Lifetime2 = -ll.field_c - var16[1];
        var8Lifetime2 = var16[9] * var6Lifetime2 + var16[10] * var7Lifetime2 + var5 >> 16;
        if (var8Lifetime2 > 0) {
          var9Lifetime2 = SoftwareRasterizer.clipTop + TriangleRasterizer.projectionCenterY + (var16[6] * var6Lifetime2 + var16[7] * var7Lifetime2 + var4) >> 7 / var8Lifetime2;
          if (var9Lifetime2 > 0 &&
            var9Lifetime2 < var2) {
            var2 = var9Lifetime2;
          }
        }
        var6Lifetime3 = -ll.field_c - var16[0];
        var7Lifetime3 = -ll.field_c - var16[1];
        var8Lifetime3 = var16[9] * var6Lifetime3 + var16[10] * var7Lifetime3 + var5 >> 16;
        if (var8Lifetime3 > 0) {
          var9Lifetime3 = SoftwareRasterizer.clipTop + TriangleRasterizer.projectionCenterY + (var16[6] * var6Lifetime3 + var16[7] * var7Lifetime3 + var4) >> 7 / var8Lifetime3;
          if (var9Lifetime3 > 0 &&
            var9Lifetime3 < var2) {
            var2 = var9Lifetime3;
          }
        }
        var3Lifetime1 = var2 * SoftwareRasterizer.width;
        for (var4Lifetime1 = var2; var4Lifetime1 < SoftwareRasterizer.clipBottom; var4Lifetime1++) {
          var5Lifetime1 = var4Lifetime1 - 240;
          var10 = var16[9] + (var16[3] * (SoftwareRasterizer.clipLeft - 320) + var16[6] * var5Lifetime1 >> 9) >> 1;
          var11 = var16[10] + (var16[4] * (SoftwareRasterizer.clipLeft - 320) + var16[7] * var5Lifetime1 >> 9) >> 1;
          var12 = var16[11] + (var16[5] * (SoftwareRasterizer.clipLeft - 320) + var16[8] * var5Lifetime1 >> 9) >> 1;
          var13 = var10 * var10 + var11 * var11 + var12 * var12 >> 16;
          if (var13 > 0) {
            var13 = rf.inverseSquareRoot(var13, -126);
            var10 = ArchiveProvider.divideFixed16(var13, (byte) -82, (long)var10);
            var11 = ArchiveProvider.divideFixed16(var13, (byte) -125, (long)var11);
            var12 = ArchiveProvider.divideFixed16(var13, (byte) -109, (long)var12);
            if (var12 != 0) {
              var14 = ArchiveProvider.divideFixed16(var12, (byte) -62, (long)(256 - var16[2]));
              var6Lifetime4 = var16[0] + (var14 * var10 >> 16);
              var8Lifetime4 = var16[1] + (var14 * var11 >> 16);
              var10 = var16[9] + (var16[3] * (SoftwareRasterizer.clipRight - 320) + var16[6] * var5Lifetime1 >> 9) >> 1;
              var11 = var16[10] + (var16[4] * (SoftwareRasterizer.clipRight - 320) + var16[7] * var5Lifetime1 >> 9) >> 1;
              var12 = var16[11] + (var16[5] * (SoftwareRasterizer.clipRight - 320) + var16[8] * var5Lifetime1 >> 9) >> 1;
              var13 = var10 * var10 + var11 * var11 + var12 * var12 >> 16;
              if (var13 > 0) {
                var13 = rf.inverseSquareRoot(var13, -126);
                var10 = ArchiveProvider.divideFixed16(var13, (byte) -115, (long)var10);
                var11 = ArchiveProvider.divideFixed16(var13, (byte) -115, (long)var11);
                var12 = ArchiveProvider.divideFixed16(var13, (byte) -97, (long)var12);
                if (var12 != 0) {
                  var14Lifetime1 = ArchiveProvider.divideFixed16(var12, (byte) -100, (long)(256 - var16[2]));
                  var7Lifetime4 = var16[0] + (var14Lifetime1 * var10 >> 16);
                  var9Lifetime4 = var16[1] + (var14Lifetime1 * var11 >> 16);
                  var10 = (var9Lifetime4 - var8Lifetime4) * var1;
                  var11 = (var7Lifetime4 - var6Lifetime4) * var1;
                  var12 = (var8Lifetime4 << 16) + SoftwareRasterizer.clipLeft * var10;
                  var13 = (var6Lifetime4 << 16) + SoftwareRasterizer.clipLeft * var11;
                  PlasmaTableScene.a(0, 0, 0, 0, var12, var13, var10, var11, var3Lifetime1);
                  var3Lifetime1 = var3Lifetime1 + SoftwareRasterizer.width;
                }
              }
            }
          }
        }
    }

    final void releaseModels(boolean param0) {
        super.releaseModels(param0);
        LimitedRandomAccessFile.field_i = null;
        t.field_a = (int[][][]) null;
        ArrayWidgetGroup.field_K = (jd[][]) null;
        ro.field_v = (int[][][]) null;
        IntrusiveNode.field_b = (WireframeQuad[][][]) null;
        DelegatingCanvas.field_a = (jd[][]) null;
        this.field_K = null;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10;
        int var11;
        int var12;
        for (var9 = SoftwareRasterizer.clipLeft; var9 < SoftwareRasterizer.clipRight; var9++) {
          var10 = param4 >> 16;
          var11 = param5 >> 16;
          if (var11 <= ll.field_c &&
            var10 <= ll.field_c &&
            var11 >= -ll.field_c &&
            var10 >= -ll.field_c) {
            var12 = var11 * var11 + var10 * var10;
            if (var12 >= 0 &&
              var12 <= DisplayNamePanel.field_V) {
              param1 = LoginTextValue.a(false, var12);
              if (param1 > EmailAvailabilityValidator.field_x &&
                param1 < gn.field_b) {
                param1 = (param1 - EmailAvailabilityValidator.field_x - 32) * 255 >> 5;
                if (param1 < 0) {
                  param1 = -param1;
                }
                param0 = AccountContentDialog.field_tb;
                param1 = 255 - param1 >> 1;
                param2 = (param0 & 16711935) * param1;
                param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                param2 = SoftwareRasterizer.pixels[param8];
                param3 = param0 + param2;
                param0 = (param0 & 16711935) + (param2 & 16711935);
                param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                SoftwareRasterizer.pixels[param8] = param3 - param2 | param2 - (param2 >>> 8);
              } else {
                if (param1 > IterableNodeHashTable.field_h &&
                  param1 < ArchiveLoadSequence.field_g) {
                  param1 = (param1 - IterableNodeHashTable.field_h - 32) * 255 >> 5;
                  if (param1 < 0) {
                    param1 = -param1;
                  }
                  param0 = cl.field_g;
                  param1 = 255 - param1 >> 1;
                  param2 = (param0 & 16711935) * param1;
                  param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                  param2 = SoftwareRasterizer.pixels[param8];
                  param3 = param0 + param2;
                  param0 = (param0 & 16711935) + (param2 & 16711935);
                  param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                  SoftwareRasterizer.pixels[param8] = param3 - param2 | param2 - (param2 >>> 8);
                } else {
                  if (param1 > DateInputWidget.field_Y &&
                    param1 < gn.field_d) {
                    param1 = (param1 - DateInputWidget.field_Y - 32) * 255 >> 5;
                    if (param1 < 0) {
                      param1 = -param1;
                    }
                    param0 = pn.field_s;
                    param1 = 255 - param1 >> 1;
                    param2 = (param0 & 16711935) * param1;
                    param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                    param2 = SoftwareRasterizer.pixels[param8];
                    param3 = param0 + param2;
                    param0 = (param0 & 16711935) + (param2 & 16711935);
                    param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                    SoftwareRasterizer.pixels[param8] = param3 - param2 | param2 - (param2 >>> 8);
                  } else {
                    if (param1 > UsernameSuggestionsPanel.field_O &&
                      param1 < ll.field_c) {
                      param1 = (param1 - UsernameSuggestionsPanel.field_O - 32) * 255 >> 5;
                      if (param1 < 0) {
                        param1 = -param1;
                      }
                      param0 = NineSliceFrame.field_f;
                      param1 = 255 - param1 >> 1;
                      param2 = (param0 & 16711935) * param1;
                      param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                      param2 = SoftwareRasterizer.pixels[param8];
                      param3 = param0 + param2;
                      param0 = (param0 & 16711935) + (param2 & 16711935);
                      param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                      SoftwareRasterizer.pixels[param8] = param3 - param2 | param2 - (param2 >>> 8);
                    }
                  }
                }
              }
            }
          }
          param4 = param4 + param6;
          param5 = param5 + param7;
          param8++;
        }
    }

    final int floorColor(int param0) {
        if (param0 != 684) {
          this.n(16);
        }
        return 0;
    }

    final void loadSounds(SoundCache param0, int param1) {
        try {
          this.field_P = param0.getSynthesizedSound("", "plasma_ball_hard", (byte) 121);
          this.field_Y = param0.getSynthesizedSound("", "plasma_ball_soft", (byte) 126);
          this.field_W = param0.getSynthesizedSound("", "plasma_cue_hard", (byte) 126);
          int var3_int = -128 % ((39 - param1) / 38);
          this.field_Q = param0.getSynthesizedSound("", "plasma_cue_soft", (byte) 127);
          this.field_J = param0.getSynthesizedSound("", "plasma_pot", (byte) 123);
          this.field_O = param0.getSynthesizedSound("", "plasma_respot_the_white", (byte) 125);
          this.field_hb = param0.getSynthesizedSound("", "plasma_cushion1", (byte) 127);
          this.field_N = param0.getSynthesizedSound("", "plasma_cushion2", (byte) 124);
          this.field_db = param0.getSynthesizedSound("", "plasma_cushion3", (byte) 124);
          this.field_T = param0.getSynthesizedSound("", "plasma_cushion4", (byte) 122);
          this.field_fb = param0.getSynthesizedSound("", "plasma_loop", (byte) 125);
          this.field_U = param0.getSynthesizedSound("", "plasma_shot_mode_loop", (byte) 123);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fk.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte floorTexture(int param0) {
        int var2 = 83 % ((9 - param0) / 63);
        return (byte) -128;
    }

    private final void a(Ball[] param0, byte param1) {
        int var3_int = 0;
        jd dupTemp$0 = null;
        int var16 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd[] var3 = null;
        RuntimeException var3_ref = null;
        jd[] var4 = null;
        int var4_int = 0;
        jd[] var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        jd[][] var6 = null;
        jd var7 = null;
        jd var8 = null;
        jd var9 = null;
        jd var10 = null;
        jd var11 = null;
        jd var12 = null;
        jd var13 = null;
        jd var14 = null;
        jd var15 = null;
        int var17 = 0;
        int var18 = 0;
        var18 = Pool.field_O;
        try {
          for (var3_int = 0; param0.length > var3_int; var3_int++) {
            if (param0[var3_int].inPlay) {
              var4_int = (param0[var3_int].positionX >> 13) * 32 / 4608;
              var5_int = 16 * (param0[var3_int].positionY >> 13) / 2304;
              if (var4_int >= 0) {
                if (var4_int >= 32) {
                  var4_int = 31;
                }
              } else {
                var4_int = 0;
              }
              if (var5_int >= 0) {
                if (16 <= var5_int) {
                  var5_int = 15;
                }
              } else {
                var5_int = 0;
              }
              dupTemp$0 = ArrayWidgetGroup.field_K[var5_int][var4_int];
              dupTemp$0.field_g = dupTemp$0.field_g + (1024 + MaxLengthTextInputWidget.nextRandomInt(256, true, ea.field_r));
            }
          }
          var3 = ArrayWidgetGroup.field_K[0];
          var4 = var3;
          var5 = var4;
          var6_int = 0;
          if (param1 != -122) {
            return;
          }
          while (ArrayWidgetGroup.field_K.length > var6_int) {
            if (var6_int + 1 < ArrayWidgetGroup.field_K.length) {
              var5 = ArrayWidgetGroup.field_K[1 + var6_int];
            }
            var7 = var3[0];
            var8 = var7;
            var9 = var8;
            var10 = var4[0];
            var11 = var10;
            var12 = var11;
            var13 = var5[0];
            var14 = var13;
            var15 = var14;
            for (var16 = 0; var16 < var4.length; var16++) {
              if ((1 + var16) < var4.length) {
                var12 = var4[1 + var16];
                var15 = var5[1 + var16];
                var9 = var3[var16 + 1];
              }
              var17 = (10 * var14.field_g >> 8) + ((var12.field_g * 10 >> 8) + (var10.field_g * 10 >> 8) + ((5 * var9.field_g >> 8) + ((5 * var7.field_g >> 8) + (10 * var8.field_g >> 8) + (var11.field_g * 180 >> 8)))) + ((5 * var13.field_g >> 8) + (5 * var15.field_g >> 8));
              if (var17 > 4096) {
                var17 = 4096;
              }
              if (var17 < 0) {
                var17 = 0;
              }
              DelegatingCanvas.field_a[var6_int][var16].field_g = var17;
              var7 = var8;
              var10 = var11;
              var8 = var9;
              var13 = var14;
              var11 = var12;
              var14 = var15;
            }
            var3 = var4;
            var4 = var5;
            var6_int++;
          }
          var6 = ArrayWidgetGroup.field_K;
          ArrayWidgetGroup.field_K = DelegatingCanvas.field_a;
          DelegatingCanvas.field_a = var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_39_0 = var3_ref;
          stackIn_39_1 = new StringBuilder().append("fk.U(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setViewMatrix(byte param0, int[] param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        var8 = Pool.field_O;
        try {
          var9 = f.a((byte) 96, param1);
          var13 = var9;
          var9[0] = var9[0] - 2304;
          var9[1] = var9[1] - 1152;
          var9[2] = var9[2] >> 0;
          var9[1] = var9[1] >> 0;
          var9[0] = var9[0] >> 0;
          var9[1] = var9[1] >> 8;
          var9[0] = var9[0] >> 8;
          var4 = -81 / ((param0 + 64) / 52);
          var9[2] = var9[2] >> 8;
          for (var5 = 0; IntrusiveNode.field_b.length > var5; var5++) {
            for (var6 = 0; var6 < IntrusiveNode.field_b[var5].length; var6++) {
              for (var7 = 0; var7 < IntrusiveNode.field_b[var5][var6].length; var7++) {
                IntrusiveNode.field_b[var5][var6][var7].projectCorners(-56, var13);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fk.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void updateHumPitch(int param0, int param1) {
        if (this.field_bb != null) {
          this.field_bb.setSampleStepMagnitude(64 * param1 / 4096 + 256);
        }
        int var3 = -113 % ((param0 - 11) / 52);
    }

    public static void releaseStatics(int param0) {
        mbCaptionTitle = null;
        field_cb = null;
        field_gb = null;
        int var1 = -122 / ((param0 + 65) / 38);
    }

    private final void drawCue(boolean param0, int[] param1, PoolMatchController param2) {
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        var9 = Pool.field_O;
        try {
          if (param0) {
            this.floorTexture(2);
          }
          if (param2.canControlCue(-38)) {
            if (MouseWheelInput.field_c.field_g) {
              param2.gameModel.fillCueTransform(MouseWheelInput.field_c.field_l, param2.cueAim.polarAngle, (byte) 47, param2.cueAim.azimuth, param2.cueAim.field_e, param2.cueAim.field_d);
              MouseWheelInput.field_c.field_g = false;
            }
            var4_int = param2.cuePullbackDistance;
            this.field_R[0] = (MouseWheelInput.field_c.field_l[0] >> 13) + (var4_int * MouseWheelInput.field_c.field_l[9] >> 13);
            this.field_X[0] = (MouseWheelInput.field_c.field_l[10] * var4_int >> 13) + (MouseWheelInput.field_c.field_l[1] >> 13);
            this.field_L[0] = (MouseWheelInput.field_c.field_l[11] * var4_int >> 13) + (MouseWheelInput.field_c.field_l[2] >> 13);
            this.field_M[0] = 1;
            this.field_R[1] = ((var4_int + 456) * MouseWheelInput.field_c.field_l[9] >> 13) + (MouseWheelInput.field_c.field_l[0] >> 13);
            this.field_X[1] = ((456 + var4_int) * MouseWheelInput.field_c.field_l[10] >> 13) + (MouseWheelInput.field_c.field_l[1] >> 13);
            this.field_L[1] = (MouseWheelInput.field_c.field_l[11] * (456 + var4_int) >> 13) + (MouseWheelInput.field_c.field_l[2] >> 13);
            this.field_M[1] = 3;
            for (var5_int = 0; this.field_R.length > var5_int; var5_int++) {
              var6 = this.field_R[var5_int] - param1[0];
              var7 = -param1[1] + this.field_X[var5_int];
              var8 = -param1[2] + this.field_L[var5_int];
              this.field_R[var5_int] = param1[3] * var6 + var7 * param1[4] + param1[5] * var8 >> 16;
              this.field_X[var5_int] = param1[8] * var8 + (var7 * param1[7] + param1[6] * var6) >> 16;
              this.field_L[var5_int] = var8 * param1[11] + (param1[9] * var6 + var7 * param1[10]) >> 16;
            }
            if (this.field_L[0] <= 0 &&
              this.field_L[1] <= 0) {
              param2.buildAimPreviewTrail(-125);
              return;
            }
            if (!NanoTickClock.a(113, this.field_R[1], this.field_R[0], this.field_X[1], this.field_L[1], this.field_L[0], this.field_X[0])) {
              this.field_S = ic.a(this.field_X, 0, this.field_R, this.field_M, this.field_L, 4);
              var10 = 0;
              var5_intLifetime1 = var10;
              while (this.field_R.length > var10) {
                this.field_R[var10] = 1280 + (this.field_R[var10] << 11) / this.field_L[var10];
                this.field_X[var10] = 960 + (this.field_X[var10] << 11) / this.field_L[var10];
                this.field_M[var10] = (this.field_M[var10] << 16) / this.field_L[var10];
                var10++;
              }
              var5 = bc.field_c;
              if (param2.gameModel.rules instanceof EightBallRules) {
                var6Lifetime1 = ((EightBallRules) (param2.gameModel.rules)).initialGroup(-1);
                if (-1 != var6Lifetime1) {
                  var5 = hf.a(var6Lifetime1, (byte) 73);
                }
              }
              stackIn_26_0 = (0 != (1 & this.field_S)) ? 2 : 1;
              if ((this.field_S & 2) != 0) {
                stackIn_29_1 = 2;
              } else {
                stackIn_29_1 = 1;
              }
              wn.$cfr$intArgs$a$2435eea43ef1(stackIn_26_0, stackIn_29_1, var5, this.field_X, 127, 0, this.field_R, this.field_M);
            }
            param2.buildAimPreviewTrail(-125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("fk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final void updatePottedBalls(int param0, PoolMatchController param1) {
        int var3_int = 0;
        int var4 = Pool.field_O;
        try {
          super.updatePottedBalls(param0, param1);
          for (var3_int = 0; var3_int < this.field_K.length; var3_int++) {
            this.field_K[var3_int].a((byte) -43);
          }
          this.n(2);
          this.a(param1.gameModel.balls, (byte) -122);
          ClassicBallSkin.field_l = ClassicBallSkin.field_l - 1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fk.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void loadMusicTracks(int param0, ResourceArchive param1) {
        try {
          this.field_b = MusicTrack.loadFromArchive(param1, "", "pool_plasma");
          this.field_i = MusicTrack.loadFromArchive(param1, "", "pool_plasma_win_jingle");
          this.field_n = MusicTrack.loadFromArchive(param1, "", "pool_plasma_lose_jingle");
          if (param0 != 1) {
            field_gb = (ViewportController) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fk.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(int param0) {
        int var2 = 0;
        int var4_int = 0;
        int var6_int = 0;
        int var7 = 0;
        int var17 = 0;
        WireframeQuad[][] var3;
        WireframeQuad[] var4;
        WireframeQuad[] var5;
        WireframeQuad[] var6;
        WireframeQuad var7_ref_bl;
        WireframeQuad var8;
        WireframeQuad var9;
        WireframeQuad var10;
        WireframeQuad var11;
        WireframeQuad var12;
        WireframeQuad var13;
        WireframeQuad var14;
        WireframeQuad var15;
        WireframeQuad var16;
        int var18;
        WireframeQuad[] var19;
        var18 = Pool.field_O;
        if (param0 != 2) {
          return;
        }
        for (var2 = 0; var2 < IntrusiveNode.field_b.length; var2++) {
          var3 = IntrusiveNode.field_b[var2];
          for (var4_int = 0; var4_int < 16; var4_int++) {
            var19 = var3[var4_int];
            for (var6_int = 0; var6_int < 16; var6_int++) {
              var7_ref_bl = var19[var6_int];
              if (var7_ref_bl.field_E > 0) {
                if (!var7_ref_bl.field_c) {
                  var7_ref_bl.field_E = var7_ref_bl.field_E - 2;
                  if (var7_ref_bl.field_E <= 0) {
                    var7_ref_bl.field_E = 0;
                  }
                } else {
                  var7_ref_bl.field_E = var7_ref_bl.field_E + 2;
                  if (var7_ref_bl.field_E >= 256) {
                    if (0 == MaxLengthTextInputWidget.nextRandomInt(10, true, ea.field_r)) {
                      var7_ref_bl.field_y = var7_ref_bl.field_y + 1;
                    }
                    var7_ref_bl.field_c = false;
                  }
                }
              } else {
                if (MaxLengthTextInputWidget.nextRandomInt(2500, true, ea.field_r) == 0) {
                  var7_ref_bl.field_E = 1;
                  var7_ref_bl.field_c = true;
                } else {
                  var7_ref_bl.field_E = 0;
                }
              }
              if (var7_ref_bl.field_y > 0) {
                var7_ref_bl.field_y = var7_ref_bl.field_y + 1;
                if (var7_ref_bl.field_y >= 256) {
                  var7_ref_bl.field_y = 0;
                }
              }
            }
          }
          var4 = var3[0];
          var5 = var4;
          var6 = var5;
          for (var7 = 0; var7 < 16; var7++) {
            if (var7 < 15) {
              var6 = var3[1 + var7];
            }
            var8 = var4[0];
            var9 = var8;
            var10 = var9;
            var11 = var5[0];
            var12 = var11;
            var13 = var12;
            var14 = var6[0];
            var15 = var14;
            var16 = var15;
            for (var17 = 0; var17 < 16; var17++) {
              if (15 > var17) {
                var16 = var6[var17 + 1];
                var13 = var5[var17 + 1];
              }
              if (128 < var12.field_E) {
                boolean decompiledFrameRemainder1 = true;
                if (var11.field_E == 0) {
                  if (MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) == 0) {
                    var11.field_E = var11.field_E + 1;
                  }
                  if (var13.field_E != 0) {
                    if (((var9.field_E == 0)) &&
                      ((MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) == 0))) {
                      var9.field_E = var9.field_E + 1;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) != 0) {
                      if (((var9.field_E == 0)) &&
                        ((MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) == 0))) {
                        var9.field_E = var9.field_E + 1;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var13.field_E = var13.field_E + 1;
                    }
                  }
                } else {
                  if (var13.field_E != 0) {
                    if (((var9.field_E == 0)) &&
                      ((MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) == 0))) {
                      var9.field_E = var9.field_E + 1;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) != 0) {
                      if (((var9.field_E == 0)) &&
                        ((MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) == 0))) {
                        var9.field_E = var9.field_E + 1;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var13.field_E = var13.field_E + 1;
                    }
                  }
                }
                if ((decompiledFrameRemainder1) && (var9.field_E == 0 &&
                  MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r) == 0)) {
                  var9.field_E = var9.field_E + 1;
                }
                if (var15.field_E == 0 &&
                  0 == MaxLengthTextInputWidget.nextRandomInt(250, true, ea.field_r)) {
                  var15.field_E = var15.field_E + 1;
                }
              }
              if (var12.field_y > 0) {
                boolean decompiledFrameRemainder0 = true;
                if (!var8.field_c) {
                  if (var8.field_E == 0) {
                    var8.field_c = true;
                    if (!var10.field_c &&
                      var10.field_E == 0) {
                      var10.field_c = true;
                    }
                  } else {
                    if (var10.field_c) {
                      if ((!(var14.field_c)) &&
                        ((0 == var14.field_E))) {
                        var14.field_c = true;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var10.field_E == 0) {
                        var10.field_c = true;
                      }
                    }
                  }
                } else {
                  if (!var10.field_c &&
                    var10.field_E == 0) {
                    var10.field_c = true;
                  }
                }
                if ((decompiledFrameRemainder0) && (!var14.field_c &&
                  0 == var14.field_E)) {
                  var14.field_c = true;
                }
                if (!var16.field_c &&
                  var16.field_E == 0) {
                  var16.field_c = true;
                }
                var8.field_E = var8.field_E + 1;
                var14.field_E = var14.field_E + 1;
                var10.field_E = var10.field_E + 1;
                var16.field_E = var16.field_E + 1;
              }
              var8 = var9;
              var9 = var10;
              var11 = var12;
              var12 = var13;
              var14 = var15;
              var15 = var16;
            }
            var4 = var5;
            var5 = var6;
          }
        }
        return;
    }

    final void drawScene(byte param0, PoolMatchController param1) {
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_28_0;
        int[] stackIn_28_1;
        int stackIn_28_2;
        boolean stackIn_28_3;
        Ball[] stackIn_28_4;
        Object stackIn_29_0;
        boolean stackIn_29_5;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Ball[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        Ball[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        var10 = Pool.field_O;
        try {
          var14 = param1.gameModel.balls;
          var3 = var14;
          var16 = param1.viewMatrix;
          var13 = var16;
          var4 = var13;
          this.prepareBallDrawOrder(false, var16, var14);
          en.b(0);
          PlasmaTableScene.a(var16);
          var17 = f.a((byte) 77, var16);
          var15 = var17;
          var5_ref_int__ = var15;
          var5_ref_int__[0] = var5_ref_int__[0] - 2304;
          var5_ref_int__[1] = var5_ref_int__[1] - 1152;
          var5_ref_int__[2] = var5_ref_int__[2] >> 2;
          var5_ref_int__[1] = var5_ref_int__[1] >> 2;
          var5_ref_int__[0] = var5_ref_int__[0] >> 2;
          this.field_R[0] = 0;
          this.field_X[0] = 0;
          this.field_L[0] = 16384;
          this.field_R[1] = 0;
          this.field_M[0] = 4;
          this.field_X[1] = 0;
          this.field_L[1] = 1;
          this.field_M[1] = 4;
          for (var6_int = 0; var6_int < this.field_R.length; var6_int++) {
            var7 = this.field_R[var6_int] - var17[0];
            var8 = this.field_X[var6_int] - var17[1];
            var9 = this.field_L[var6_int] - var17[2];
            this.field_R[var6_int] = var9 * var17[5] + var17[3] * var7 + var17[4] * var8 >> 16;
            this.field_X[var6_int] = var17[7] * var8 + (var17[6] * var7 + var9 * var17[8]) >> 16;
            this.field_L[var6_int] = var17[11] * var9 + (var17[9] * var7 + var8 * var17[10]) >> 16;
          }
          if ((this.field_L[0] > 0 ||
            this.field_L[1] > 0) && !NanoTickClock.a(59, this.field_R[1], this.field_R[0], this.field_X[1], this.field_L[1], this.field_L[0], this.field_X[0])) {
            this.field_S = ic.a(this.field_X, 0, this.field_R, this.field_M, this.field_L, 4);
            var12 = 0;
            var6_intLifetime1 = var12;
            while (this.field_R.length > var12) {
              this.field_R[var12] = 1280 + (this.field_R[var12] << 11) / this.field_L[var12];
              this.field_X[var12] = (this.field_X[var12] << 11) / this.field_L[var12] + 960;
              this.field_M[var12] = (this.field_M[var12] << 16) / this.field_L[var12];
              var12++;
            }
            var6 = bc.field_c;
            if (param1.gameModel.rules instanceof EightBallRules) {
              var7Lifetime1 = ((EightBallRules) (param1.gameModel.rules)).initialGroup(-1);
              if (var7Lifetime1 != -1) {
                var6 = hf.a(var7Lifetime1, (byte) 96);
              }
            }
            stackIn_18_0 = ((1 & this.field_S) == 0) ? 1 : 2;
            if ((2 & this.field_S) == 0) {
              stackIn_21_1 = 1;
            } else {
              stackIn_21_1 = 2;
            }
            wn.$cfr$intArgs$a$2435eea43ef1(stackIn_18_0, stackIn_21_1, var6, this.field_X, 127, 0, this.field_R, this.field_M);
          }
          this.drawWireframeGrid((byte) 44, var16);
          this.drawBallsInOrder(var16, (byte) 79, false, var14, false);
          this.a(77, var16);
          this.c((byte) -25, var16);
          for (var5 = 0; this.field_K.length > var5; var5++) {
            this.field_K[var5].a(false, (byte) 98, var16);
          }
          if (0L == (LinkButtonPainter.field_i & 1073741824L)) {
            stackIn_28_0 = this;
            stackIn_28_1 = var4;
            stackIn_28_2 = 122;
            stackIn_28_3 = true;
            stackIn_28_4 = var3;
            if (param1.gameModel.currentShot(20).phase != 0) {
              stackIn_29_0 = this;
              stackIn_29_5 = false;
            } else {
              stackIn_29_0 = this;
              stackIn_29_5 = true;
            }
            this.drawBallsInOrder(stackIn_28_1, (byte) stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_29_5);
          }
          if (param0 != -55) {
            var11 = (int[]) null;
            this.c((byte) 102, (int[]) null);
          }
          if ((1073741824L & LinkButtonPainter.field_i) == 0L) {
            this.drawCue(false, var16, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_38_0 = var3_ref;
          stackIn_38_1 = new StringBuilder().append("fk.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    private final void c(byte param0, int[] param1) {
        int var17 = 0;
        int var3_int = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jd[] var16 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        jd var24 = null;
        int var25 = 0;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var26 = Pool.field_O;
        try {
          var3_int = 0;
          var34 = ro.field_v[0][var3_int];
          var29 = var34;
          var27 = var29;
          var4 = var27;
          var5 = ro.field_v[1][var3_int];
          if (param0 != -25) {
            this.field_Y = (PcmSample) null;
          }
          var35 = ro.field_v[2][var3_int];
          var30 = var35;
          var28 = var30;
          var6 = var28;
          pl.projectVertices(var5, var34.length, 0, param1, 0, var27, t.field_a[1][var3_int], t.field_a[2][var3_int], t.field_a[0][var3_int].length, var35, -26182, t.field_a[0][var3_int]);
          for (var3_intLifetime1 = 1; 16 >= var3_intLifetime1; var3_intLifetime1++) {
            var36 = ro.field_v[0][var3_intLifetime1];
            var31 = var36;
            var7 = var31;
            var38 = ro.field_v[1][var3_intLifetime1];
            var33 = var38;
            var8 = var33;
            var37 = ro.field_v[2][var3_intLifetime1];
            var32 = var37;
            var9 = var32;
            pl.projectVertices(var8, var36.length, 0, param1, 0, var7, t.field_a[1][var3_intLifetime1], t.field_a[2][var3_intLifetime1], t.field_a[0][var3_intLifetime1].length, var37, -26182, t.field_a[0][var3_intLifetime1]);
            var10 = var4[0];
            var11 = var5[0];
            var12 = var6[0];
            var13 = var36[0];
            var14 = var38[0];
            var15 = var37[0];
            var16 = ArrayWidgetGroup.field_K[-1 + var3_intLifetime1];
            for (var17 = 1; 32 >= var17; var17++) {
              var18 = var4[var17];
              var19 = var5[var17];
              var20 = var6[var17];
              var21 = var36[var17];
              var22 = var38[var17];
              var23 = var37[var17];
              if (0 < var12 &&
                0 < var20 &&
                var15 > 0 &&
                var23 > 0) {
                var24 = var16[-1 + var17];
                var25 = 48 + var24.field_g * 208 / 4096;
                SoftwareRasterizer.drawLineBlendedInclusive(var10, var11, var18, var19, 1140241, var25);
                SoftwareRasterizer.drawLineBlendedInclusive(var10, var11, var13, var14, 1140241, var25);
                SoftwareRasterizer.drawLineBlendedInclusive(var18, var19, var21, var22, 1140241, var25);
                SoftwareRasterizer.drawLineBlendedInclusive(var13, var14, var21, var22, 1140241, var25);
              }
              var10 = var18;
              var13 = var21;
              var11 = var19;
              var12 = var20;
              var15 = var23;
              var14 = var22;
            }
            var5 = var8;
            var4 = var7;
            var6 = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("fk.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void drawWireframeGrid(byte param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Pool.field_O;
        try {
          if (param0 != 44) {
            mbCaptionTitle = (String) null;
          }
          for (var3_int = 0; IntrusiveNode.field_b.length > var3_int; var3_int++) {
            for (var4 = 0; IntrusiveNode.field_b[var3_int].length > var4; var4++) {
              for (var5 = 0; IntrusiveNode.field_b[var3_int][var4].length > var5; var5++) {
                IntrusiveNode.field_b[var3_int][var4][var5].draw((byte) 67);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("fk.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    PlasmaTableScene() {
        this.field_L = new int[2];
        this.field_R = new int[2];
        this.field_X = new int[2];
        this.field_M = new int[2];
    }

    private final void buildWireframeGrid(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Pool.field_O;
        if (param0 != 10) {
          return;
        }
        IntrusiveNode.field_b = new WireframeQuad[4][16][16];
        for (var2 = 0; var2 < 16; var2++) {
          var3 = -128 + (var2 * 2048 + 256) / 128;
          var4 = ((1 + var2) * 2048 - 256) / 128 - 128;
          for (var5 = 0; var5 < 16; var5++) {
            var6 = (256 + 2048 * var5) / 128 - 128;
            var7 = -128 + (-256 + (var5 + 1) * 2048) / 128;
            IntrusiveNode.field_b[0][var2][var5] = new WireframeQuad(128, -var6, var3, 128, -var7, var3, 128, -var6, var4, 128, -var7, var4);
            IntrusiveNode.field_b[1][var2][var5] = new WireframeQuad(-var6, -128, var3, -var7, -128, var3, -var6, -128, var4, -var7, -128, var4);
            IntrusiveNode.field_b[2][var2][var5] = new WireframeQuad(-128, var6, var3, -128, var7, var3, -128, var6, var4, -128, var7, var4);
            IntrusiveNode.field_b[3][var2][var5] = new WireframeQuad(var6, 128, var3, var7, 128, var3, var6, 128, var4, var7, 128, var4);
          }
        }
    }

    final void stopLoopSounds(boolean param0) {
        if (null != this.field_bb) {
          TickClock.a((byte) -110, this.field_bb);
          this.field_bb = null;
        }
        if (param0) {
          this.field_T = (PcmSample) null;
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = 81 / ((param0 + 47) / 45);
        if (9 == param2) {
          if (this.field_bb == null) {
          } else {
            if (param1) {
              this.field_bb.fadeOutAndUnlink(64);
            } else {
              this.field_bb.fadeOutAndUnlink(4096);
            }
            this.field_bb = null;
          }
        }
    }

    static {
        mbCaptionTitle = "Members' Benefits";
        field_gb = null;
        field_V = 2;
    }
}
