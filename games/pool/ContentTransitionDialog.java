/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableDialog {
    private int fadeOutDurationTicks;
    static String[][] field_pb;
    static int field_rb;
    private int contentResizeDurationTicks;
    private int contentFadeTick;
    private int fadeInDurationTicks;
    private OpacityWidget contentOpacityWidget;
    static TextWidgetPainter field_mb;
    private int contentVerticalInset;
    private ClientInputResetSupport contentTransitionPhase;
    static UiComponent field_ob;
    private UiWidget pendingContent;

    final static void a(int param0, boolean param1) {
        ResourceArchive.drawAccountOverlay(param1, (byte) 108, true);
        int var2 = 40 / ((-28 - param0) / 51);
    }

    void replaceContent(UiWidget param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 30) {
            this.contentOpacityWidget = (OpacityWidget) null;
          }
          this.pendingContent = param0;
          if (VerticalScrollbar.field_Ub == this.contentTransitionPhase) {
            this.startResizeTransition((byte) -77, this.pendingContent.widgetHeight + (12 + this.contentVerticalInset), 12 + this.pendingContent.widgetWidth, this.contentResizeDurationTicks);
            this.contentFadeTick = 0;
          } else {
            if (FullscreenDisplayMode.field_c != this.contentTransitionPhase) {
              this.contentTransitionPhase = FullscreenDisplayMode.field_c;
              this.contentFadeTick = 0;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ok.O(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void applyBallCollisionImpulse(int param0, Ball param1, Ball param2, byte param3) {
        int fieldTemp$1 = 0;
        long var4_long = 0L;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        long var14 = 0L;
        long var16 = 0L;
        int var18 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (0 > param0) {
            param0 = 0;
          }
          param1.advanceTo(param0, 127);
          param2.advanceTo(param0, 122);
          var4_long = param1.horizontalSpeedSquared(-14770) + param2.horizontalSpeedSquared(-14770);
          var6 = param2.positionX - param1.positionX;
          var7 = param2.positionY - param1.positionY;
          var8 = KillerRules.multiplyFixedChecked((long)var6, (byte) -48, (long)var6) + KillerRules.multiplyFixedChecked((long)var7, (byte) -48, (long)var7);
          if (var8 < 0L) {
            throw new IllegalStateException("dnorm2_32 overflow " + var8);
          }
          var10 = IterableNodeHashTable.sqrtScaled256(-128, var8 >> 16);
          if (var10 >= -2147483648L &&
            var10 <= 2147483647L) {
            var6 = ArchiveProvider.divideFixed16((int)var10, (byte) -83, (long)var6);
            var7 = ArchiveProvider.divideFixed16((int)var10, (byte) -112, (long)var7);
            var12 = KillerRules.multiplyFixedChecked((long)param1.velocityX, (byte) -48, (long)var6) + KillerRules.multiplyFixedChecked((long)param1.velocityY, (byte) -48, (long)var7) >> 16;
            var14 = KillerRules.multiplyFixedChecked((long)param2.velocityX, (byte) -48, (long)var6) + KillerRules.multiplyFixedChecked((long)param2.velocityY, (byte) -48, (long)var7) >> 16;
            param1.velocityX = (int)((long)param1.velocityX - FullscreenFocusCanvas.multiplyFixedChecked((long)var6, var12, false));
            param1.velocityY = (int)((long)param1.velocityY - FullscreenFocusCanvas.multiplyFixedChecked((long)var7, var12, false));
            param2.velocityX = (int)((long)param2.velocityX - FullscreenFocusCanvas.multiplyFixedChecked((long)var6, var14, false));
            param2.velocityY = (int)((long)param2.velocityY - FullscreenFocusCanvas.multiplyFixedChecked((long)var7, var14, false));
            param1.velocityX = (int)((long)param1.velocityX + (FullscreenFocusCanvas.multiplyFixedChecked((long)(RankingsScreen.field_K * var6), var14, false) >> 8));
            param1.velocityY = (int)((long)param1.velocityY + (FullscreenFocusCanvas.multiplyFixedChecked((long)(RankingsScreen.field_K * var7), var14, false) >> 8));
            param2.velocityX = (int)((long)param2.velocityX + (FullscreenFocusCanvas.multiplyFixedChecked((long)(RankingsScreen.field_K * var6), var12, false) >> 8));
            param2.velocityY = (int)((long)param2.velocityY + (FullscreenFocusCanvas.multiplyFixedChecked((long)(RankingsScreen.field_K * var7), var12, false) >> 8));
            param1.angularVelocityY = TextPairLoginPayload.field_l * param1.angularVelocityY >> 8;
            param1.angularVelocityZ = TextPairLoginPayload.field_l * param1.angularVelocityZ >> 8;
            param1.angularVelocityX = TextPairLoginPayload.field_l * param1.angularVelocityX >> 8;
            param2.angularVelocityY = param2.angularVelocityY * TextPairLoginPayload.field_l >> 8;
            param2.angularVelocityZ = param2.angularVelocityZ * TextPairLoginPayload.field_l >> 8;
            param2.angularVelocityX = param2.angularVelocityX * TextPairLoginPayload.field_l >> 8;
            param1.motionState = 1;
            param2.motionState = 1;
            var18 = -53 / ((param3 - 62) / 39);
            var16 = param1.horizontalSpeedSquared(-14770) + param2.horizontalSpeedSquared(-14770);
            if (ReportAbuseDialog.field_ac.length > BallEvent.field_l) {
              ReportAbuseDialog.field_ac[BallEvent.field_l][0] = param1.positionX + param2.positionX >> 1;
              ReportAbuseDialog.field_ac[BallEvent.field_l][1] = param2.positionY + param1.positionY >> 1;
              ReportAbuseDialog.field_ac[BallEvent.field_l][2] = -524288;
            }
            if (BallEvent.field_l < TabbedPane.field_Qb.length) {
              fieldTemp$1 = BallEvent.field_l;
              BallEvent.field_l = BallEvent.field_l + 1;
              TabbedPane.field_Qb[fieldTemp$1] = (int)(-var16 + var4_long);
            }
            return;
          }
          throw new IllegalStateException("dnorm_16 overflow");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ok.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void installContent(UiWidget param0, int param1) {
        if (null != this.contentOpacityWidget) {
          this.contentOpacityWidget.unlink((byte) -117);
        }
        if (param1 != -111052767) {
          return;
        }
        try {
          if (param0 != null) {
            param0.setWidgetBounds(param0.widgetWidth, 6, param0.widgetHeight, false, 6 + this.contentVerticalInset);
            this.contentOpacityWidget = new OpacityWidget(param0);
          } else {
            this.contentOpacityWidget = new OpacityWidget();
          }
          this.addChild(true, this.contentOpacityWidget);
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ok.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int k(byte param0) {
        if (param0 != 59) {
          ContentTransitionDialog.l((byte) -91);
        }
        return DialWidget.field_R;
    }

    final void finishTransition(boolean param0) {
        if (null != this.contentTransitionPhase) {
          if (this.contentTransitionPhase != BallSkin.field_h) {
            this.resizeAndCenter(12 + this.contentVerticalInset + this.pendingContent.widgetHeight, 31936, 12 + this.pendingContent.widgetWidth);
            this.installContent(this.pendingContent, -111052767);
          }
          this.contentOpacityWidget.opacity = 256;
          this.contentTransitionPhase = null;
        }
        super.finishTransition(param0);
    }

    boolean advanceDialogAnimation(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var3;
        var3 = Pool.field_O;
        if (this.contentTransitionPhase != null) {
          if (this.contentTransitionPhase == FullscreenDisplayMode.field_c) {
            fieldTemp$4 = this.contentFadeTick + 1;
            this.contentFadeTick = this.contentFadeTick + 1;
            if (this.fadeOutDurationTicks != fieldTemp$4) {
              this.contentOpacityWidget.opacity = 256 - (this.contentFadeTick << 8) / this.fadeOutDurationTicks;
            } else {
              this.contentTransitionPhase = VerticalScrollbar.field_Ub;
              this.startResizeTransition((byte) 88, this.pendingContent.widgetHeight + (12 + this.contentVerticalInset), 12 + this.pendingContent.widgetWidth, this.contentResizeDurationTicks);
              this.contentOpacityWidget.opacity = 0;
              this.contentFadeTick = 0;
            }
          } else {
            if (this.contentTransitionPhase == BallSkin.field_h) {
              fieldTemp$5 = this.contentFadeTick + 1;
              this.contentFadeTick = this.contentFadeTick + 1;
              if (this.fadeInDurationTicks == fieldTemp$5) {
                this.contentOpacityWidget.opacity = 256;
                this.contentTransitionPhase = null;
              } else {
                this.contentOpacityWidget.opacity = (this.contentFadeTick << 8) / this.fadeInDurationTicks;
              }
            }
          }
        }
        if (param0 != -20) {
          this.fadeOutDurationTicks = 54;
        }
        return super.advanceDialogAnimation((byte) -20);
    }

    final void onResizeTransitionComplete(int param0) {
        if (this.contentTransitionPhase == FullscreenDisplayMode.field_c) {
          return;
        }
        this.contentTransitionPhase = BallSkin.field_h;
        this.contentFadeTick = 0;
        this.installContent(this.pendingContent, -111052767);
        this.contentOpacityWidget.opacity = 0;
        this.pendingContent = null;
        if (param0 != 50) {
          field_rb = -17;
        }
    }

    final boolean settleDialogAnimation(boolean param0) {
        this.finishTransition(param0);
        return super.settleDialogAnimation(false);
    }

    final static Sprite j(byte param0) {
        int var5_int = 0;
        int var6 = 0;
        int var1;
        Object var3;
        int[] var5;
        int var7;
        Ball var8;
        int[] var9;
        int[] var12;
        int[] var14;
        byte[] var17;
        byte[] var18;
        var7 = Pool.field_O;
        if (param0 >= -63) {
          var8 = (Ball) null;
          ContentTransitionDialog.applyBallCollisionImpulse(101, (Ball) null, (Ball) null, (byte) 35);
        }
        var1 = LinkButtonPainter.field_a[0] * AccountTextSupport.field_f[0];
        var17 = LimitedRandomAccessFile.field_b[0];
        if (!DebouncedValidationProvider.field_d[0]) {
          var9 = new int[var1];
          for (var5_int = 0; var1 > var5_int; var5_int++) {
            var9[var5_int] = IntrusiveNode.field_h[ArchiveLoadSequence.bitwiseAnd((int) var17[var5_int], 255)];
          }
          var3 = new Sprite(DialRenderer.field_c, AccountStateQuery.field_r, AchievementsScreen.field_I[0], LoginRequestSupport.field_d[0], LinkButtonPainter.field_a[0], AccountTextSupport.field_f[0], var9);
        } else {
          var18 = StateIconLabel.field_Sb[0];
          var14 = new int[var1];
          var12 = var14;
          var5 = var12;
          for (var6 = 0; var6 < var1; var6++) {
            var5[var6] = RenderingInitializationSupport.bitwiseOr(ArchiveLoadSequence.bitwiseAnd(-16777216, var18[var6] << 24), IntrusiveNode.field_h[ArchiveLoadSequence.bitwiseAnd(255, (int) var17[var6])]);
          }
          var3 = new ArgbSprite(DialRenderer.field_c, AccountStateQuery.field_r, AchievementsScreen.field_I[0], LoginRequestSupport.field_d[0], LinkButtonPainter.field_a[0], AccountTextSupport.field_f[0], var14);
        }
        OpacityWidget.h(-1);
        return (Sprite) (var3);
    }

    ContentTransitionDialog(DialogLayer param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.widgetWidth, param1.widgetHeight + (12 + param2));
        try {
          this.fadeInDurationTicks = param3;
          this.fadeOutDurationTicks = param3;
          this.contentVerticalInset = param2;
          this.contentResizeDurationTicks = param4;
          this.installContent(param1, -111052767);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_mb = null;
        field_pb = (String[][]) null;
        field_ob = null;
        if (param0 != -45) {
          ContentTransitionDialog.j((byte) 96);
        }
    }

    boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (this.contentOpacityWidget != null) {
            if (param1 == 98) {
              this.contentOpacityWidget.requestKeyboardFocus(param3, (byte) -96);
            }
            if (param1 == 99) {
              this.contentOpacityWidget.requestKeyboardFocus(param3, (byte) -97);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ok.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static Sprite[] l(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        int[] var6;
        int[] var8;
        int[] var11;
        int[] var13;
        byte[] var16;
        byte[] var17;
        var1 = new Sprite[PacketAvailabilitySupport.field_d];
        if (param0 != 65) {
          ContentTransitionDialog.k((byte) -62);
        }
        for (var2 = 0; PacketAvailabilitySupport.field_d > var2; var2++) {
          var3 = LinkButtonPainter.field_a[var2] * AccountTextSupport.field_f[var2];
          var16 = LimitedRandomAccessFile.field_b[var2];
          if (!DebouncedValidationProvider.field_d[var2]) {
            var8 = new int[var3];
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var8[var6_int] = IntrusiveNode.field_h[ArchiveLoadSequence.bitwiseAnd((int) var16[var6_int], 255)];
            }
            var1[var2] = new Sprite(DialRenderer.field_c, AccountStateQuery.field_r, AchievementsScreen.field_I[var2], LoginRequestSupport.field_d[var2], LinkButtonPainter.field_a[var2], AccountTextSupport.field_f[var2], var8);
          } else {
            var17 = StateIconLabel.field_Sb[var2];
            var13 = new int[var3];
            var11 = var13;
            var6 = var11;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = RenderingInitializationSupport.bitwiseOr(ArchiveLoadSequence.bitwiseAnd((int) var17[var7], 255) << 24, IntrusiveNode.field_h[ArchiveLoadSequence.bitwiseAnd(255, (int) var16[var7])]);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(DialRenderer.field_c, AccountStateQuery.field_r, AchievementsScreen.field_I[var2], LoginRequestSupport.field_d[var2], LinkButtonPainter.field_a[var2], AccountTextSupport.field_f[var2], var13));
          }
        }
        OpacityWidget.h(-1);
        return var1;
    }

    static {
        field_pb = new String[][]{new String[]{"Physics Tweakers", "Only use these in single-player mode."}, new String[]{"Camera Info", null}, new String[]{"Ball Lines", "Show the ball rotational and linear velocities"}, new String[]{"Ball Text", "Whatever text attached to balls I have set up"}, new String[]{"Cue intersections", "Shows where the cue intersects the cushions for determining what cue positions are valid"}, new String[]{"FPS", "Frames per second in the bottom right corner"}, new String[]{"Memory", "Memory usage kB/Memory free kB"}, new String[]{"Shot Console", "Log of shots. Right column lists future shots."}, new String[]{"Scenery", "Whatever debug lines have been set up for this scenery."}, new String[]{"Timer Freeze", "Stop the timer from counting down. Only on single-player."}, new String[]{"No cue oscillations", "Stop the cue from moving back and forth while in shot mode."}, new String[]{"Step-mode physics", "Freezes the physics simulation, so that it can be run one update at a time. Use the ] key to advance by one frame."}, new String[]{"Two-step physics", "Separates the collision and final-update physics steps into discrete operations. This will half the speed of the physics, it's mainly for use with the previous option, Step-mode Physics to analyze problems."}, new String[]{"Cushions", "Labels for the cushions."}, new String[]{"Hide Prediction", "The physics engine predictions for the shot based on the cue position. "}, new String[]{"Lighting Info", "The current lighting for this scenery."}, new String[]{"Ball Detail", "The ball level of detail."}, new String[]{"Hide HUD", "Hide the HUD (for taking screenshots) and the like"}, new String[]{"Ball Motion", "The paths of what happen during the shot."}, new String[]{"Move Balls", "Allows you to manhandle the balls by dragging them around. This will certainly cause connection droppage in multiplayer mode."}, new String[]{"Pocket Statuses", "What balls are in what pockets?"}, new String[]{"Debug network", "Write more information to the standard output."}, new String[]{"Jungle Debug", "Stuff for the jungle scenery only"}, new String[]{"Snookering", "Print information on ball visibility to the standard output. Use Ctrl-v to force a dump of this."}, new String[]{"Audio falloff", "Render the graph and adjust the audio falloff settings. "}, new String[]{"Ball Intersections", "Debug intersections that should collide."}, new String[]{"Achievements", "Display current achievements."}, new String[]{"Plant counts", "Display game plant stats."}, new String[]{"Collection rack", "Collection rack (at the bottom) info."}, new String[]{"Game state", "Stuff about the game..."}, new String[]{"Hide Cue and Balls", "Hides all of the cue and balls from being drawn."}, new String[]{"Checksums", "Shows checksum debug info. Will break in all but debug mode."}, new String[]{"No text", "Hide over-ball text and flash messages."}, new String[]{"Only predict cueball", "Only show predictions of cue-ball."}};
    }
}
