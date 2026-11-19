/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableDialog {
    static String field_X;
    static int field_W;
    static String[] field_eb;
    private ContentTransitionPhase transitionPhase;
    private int resizeFrames;
    private OpacityWidget contentWrapper;
    private int transitionFrame;
    private int headerHeight;
    private int fadeInFrames;
    private UiWidget pendingContent;
    private int fadeOutFrames;
    static AccountConnectionState field_ib;
    static String field_Y;
    static Sprite field_bb;
    static ValidationState field_V;

    boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -96) {
            this.animateAndCheckClosed(13);
          }
          if (super.handleKeyPress(param0, param1, (byte) -120, param3)) {
            return true;
          }
          if (null == this.contentWrapper) {
            return false;
          }
          if (param1 == 98) {
            this.contentWrapper.requestFocus(param3, 8);
          }
          if (param1 == 99) {
            this.contentWrapper.requestFocus(param3, 8);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("gf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_V = null;
        field_ib = null;
        field_bb = null;
        field_X = null;
        field_eb = null;
        field_Y = null;
        if (param0 != -68) {
          field_V = (ValidationState) null;
        }
    }

    final boolean finishAnimationAndCheckClosed(int param0) {
        this.finishResize((byte) -3);
        if (param0 != 16) {
          UiWidget var3 = (UiWidget) null;
          this.transitionToContent((UiWidget) null, -46);
        }
        return super.finishAnimationAndCheckClosed(16);
    }

    final void onResizeFinished(int param0) {
        if (this.transitionPhase == ArchiveLoadingStage.field_g) {
          return;
        }
        this.transitionFrame = 0;
        this.transitionPhase = FriendLookupState.field_c;
        this.setContent(this.pendingContent, true);
        if (param0 != -8144) {
          UiWidget var3 = (UiWidget) null;
          this.handleKeyPress('ﾭ', 97, (byte) -70, (UiWidget) null);
        }
        this.contentWrapper.opacity = 0;
        this.pendingContent = null;
    }

    static long bitAndLong(long param0, long param1) {
        return param0 & param1;
    }

    final void finishResize(byte param0) {
        if (null != this.transitionPhase) {
          if (this.transitionPhase != FriendLookupState.field_c) {
            this.resizeAndCenter(6154, this.pendingContent.height + 12 + this.headerHeight, 12 + this.pendingContent.width);
            this.setContent(this.pendingContent, true);
          }
          this.contentWrapper.opacity = 256;
          this.transitionPhase = null;
        }
        super.finishResize(param0);
    }

    private final void setContent(UiWidget param0, boolean param1) {
        try {
          if (this.contentWrapper != null) {
            this.contentWrapper.unlink(false);
          }
          if (param0 != null) {
            param0.setBounds(127, this.headerHeight + 6, param0.height, param0.width, 6);
            this.contentWrapper = new OpacityWidget(param0);
          } else {
            this.contentWrapper = new OpacityWidget();
          }
          this.addChild((UiWidget) (this.contentWrapper), (byte) 109);
          if (!param1) {
            ContentTransitionDialog.drawLogoMeshes(74);
          }
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "gf.RB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void h(byte param0) {
        if (!FramedButtonPainter.field_p) {
          throw new IllegalStateException();
        }
        MessagePanel.field_M = true;
        ArchiveRequest.a(11579568, false);
        if (param0 < 53) {
          ContentTransitionDialog.drawLogoMeshes(90);
        }
        ArchiveRequest.field_t = 0;
    }

    ContentTransitionDialog(DialogLayer param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, param1.width + 12, param1.height + 12 + param2);
        try {
          this.fadeInFrames = param3;
          this.fadeOutFrames = param3;
          this.headerHeight = param2;
          this.resizeFrames = param4;
          this.setContent(param1, true);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void drawLogoMeshes(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        TriangleMesh var4_ref_le = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        TriangleMesh var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = wizardrun.field_H;
        try {
          RankingStatsDecoder.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = NanoTickClock.field_f.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_le = NanoTickClock.field_f[var3];
            var4_ref_le.b(-119);
            IterableNodeHashTable.setLogoPieceTransform((byte) 115, var3);
            var5 = var4_ref_le.field_r + var4_ref_le.field_g >> 1;
            var6 = var4_ref_le.field_D + var4_ref_le.field_K >> 1;
            var7 = var4_ref_le.field_E + var4_ref_le.field_M >> 1;
            var8 = RankingStatsDecoder.field_a[9] >> 2;
            var9 = RankingStatsDecoder.field_a[10] >> 2;
            var10_int = RankingStatsDecoder.field_a[11] >> 2;
            var11 = var10_int * ImageProducerRasterBuffer.field_m[5] + (var9 * ImageProducerRasterBuffer.field_m[4] + var8 * ImageProducerRasterBuffer.field_m[3]) >> 14;
            var12 = var9 * ImageProducerRasterBuffer.field_m[7] + (var8 * ImageProducerRasterBuffer.field_m[6] + var10_int * ImageProducerRasterBuffer.field_m[8]) >> 14;
            var13 = var10_int * ImageProducerRasterBuffer.field_m[11] + ImageProducerRasterBuffer.field_m[9] * var8 + var9 * ImageProducerRasterBuffer.field_m[10] >> 14;
            var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 16;
          }
          var3Lifetime1 = RankingStatsDecoder.field_a[9] >> 8;
          var4 = RankingStatsDecoder.field_a[10] >> 8;
          var5Lifetime1 = RankingStatsDecoder.field_a[11] >> 8;
          var6Lifetime1 = DualLinkNodeHashTable.field_f << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = NineSliceFrame.a(-2942, var6Lifetime1) >> 8;
          var9Lifetime1 = wizardrun.a((byte) -39, var6Lifetime1) >> 8;
          if (-1 != AchievementSubmission.field_n &&
            NetworkArchiveRequest.field_B != -1) {
            var8Lifetime1 = 240 - NetworkArchiveRequest.field_B;
            var9Lifetime1 = -128;
            var7Lifetime1 = AchievementSubmission.field_n - 320;
          }
          if (param0 >= -113) {
            return;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < NanoTickClock.field_f.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < NanoTickClock.field_f.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = NanoTickClock.field_f[var16];
            IterableNodeHashTable.setLogoPieceTransform((byte) 115, var16);
            for (var18 = 0; var18 < 3; var18++) {
              ImageProducerRasterBuffer.field_m[var18] = ImageProducerRasterBuffer.field_m[var18] + BeveledFrameFactory.field_d[var15][var18];
            }
            EmailValidationError.a(false, (byte) 106, var17, true, ImageProducerRasterBuffer.field_m, false, RankingStatsDecoder.field_a);
            MeshLightingHelpers.a(var14, var12Lifetime1, var8Lifetime1, false, var9Lifetime1, var17, var7Lifetime1, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "gf.QB(" + param0 + ')');
        }
    }

    final static void b(int param0, String param1) {
        try {
          if (param0 != 9) {
            field_V = (ValidationState) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "gf.TB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void transitionToContent(UiWidget param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.pendingContent = param0;
          if (param1 > -109) {
            return;
          }
          if (FullscreenFailureDialog.field_W != this.transitionPhase) {
            if (this.transitionPhase != ArchiveLoadingStage.field_g) {
              this.transitionPhase = ArchiveLoadingStage.field_g;
              this.transitionFrame = 0;
            }
          } else {
            this.animateResize(this.pendingContent.width + 12, 12 + this.headerHeight + this.pendingContent.height, 0, this.resizeFrames);
            this.transitionFrame = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gf.VB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean animateAndCheckClosed(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var3;
        var3 = wizardrun.field_H;
        if (null != this.transitionPhase) {
          if (this.transitionPhase == ArchiveLoadingStage.field_g) {
            fieldTemp$4 = this.transitionFrame + 1;
            this.transitionFrame = this.transitionFrame + 1;
            if (fieldTemp$4 != this.fadeOutFrames) {
              this.contentWrapper.opacity = -((this.transitionFrame << 8) / this.fadeOutFrames) + 256;
            } else {
              this.transitionPhase = FullscreenFailureDialog.field_W;
              this.animateResize(12 + this.pendingContent.width, 12 - (-this.headerHeight - this.pendingContent.height), 0, this.resizeFrames);
              this.contentWrapper.opacity = 0;
              this.transitionFrame = 0;
            }
          } else {
            if (this.transitionPhase == FriendLookupState.field_c) {
              fieldTemp$5 = this.transitionFrame + 1;
              this.transitionFrame = this.transitionFrame + 1;
              if (fieldTemp$5 != this.fadeInFrames) {
                this.contentWrapper.opacity = (this.transitionFrame << 8) / this.fadeInFrames;
              } else {
                this.transitionPhase = null;
                this.contentWrapper.opacity = 256;
              }
            }
          }
        }
        if (param0 != 1) {
          field_bb = (Sprite) null;
        }
        return super.animateAndCheckClosed(param0 ^ 0);
    }

    static {
        field_eb = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = "Discard";
        field_ib = new AccountConnectionState();
        field_V = new ValidationState();
    }
}
