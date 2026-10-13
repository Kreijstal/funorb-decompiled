/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_b;
    private boolean field_h;
    static String field_e;
    private ModelMesh field_c;
    private AnimationPlayer field_a;
    int field_f;
    static int field_d;
    static java.applet.Applet loaderApplet;

    private final int c(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = BestScoreStrategy.unitAnimationVariants[this.field_f].length;
        for (var3 = 0; var2 > var3; var3++) {
          if (BestScoreStrategy.unitAnimationVariants[this.field_f][var3][0] >= 0) {
            return var3;
          }
        }
        if (param0 == 82) {
          return 0;
        }
        return 111;
    }

    public static void b(byte param0) {
        loaderApplet = null;
        field_e = null;
        if (param0 >= -106) {
          la.d((byte) -100);
        }
    }

    final static void openPublicTextChat(int obfuscationGuard) {
        if (obfuscationGuard != -26887) {
          return;
        }
        rs.outgoingChatChannel = 0;
        hf.textChatActive = true;
    }

    final static void d(byte param0) {
        int[] var6 = null;
        int var2 = 0;
        int var3 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6 = jp.field_g;
          int[] var1 = var6;
          var2 = 0;
          var3 = var6.length;
          while (var3 > var2) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          int var4 = 57 % ((-6 - param0) / 49);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "la.K(" + param0 + ')');
        }
    }

    final static void updateSocialListControls(boolean enableCapture, int visibleRows, int obfuscationGuard) {
        ClientContextMenu var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        SocialListEntry var3 = AiPlanningStrategy.updateFriendListControls(obfuscationGuard + 76, visibleRows, enableCapture);
        ClientContextMenu var4Lifetime1;
        if (var3 != null) {
          FullscreenMembershipDialog.activeContextMenu.addPlayerAdmissionActions(23899, false);
          var4 = FullscreenMembershipDialog.activeContextMenu;
          var5_ref_String = AnimationFrameSet.field_y;
          var4.menu.addTextAction(5, var5_ref_String, (byte) -109);
          var4Lifetime1 = FullscreenMembershipDialog.activeContextMenu;
          var5 = BattleTutorial.pointerPressX;
          var6 = TeleportAction.pointerPressY;
          var4Lifetime1.menu.layoutPopup(0, var6, 0, (byte) -118, var5);
        }
        DeployEvent.updateIgnoreListControls(-115, enableCapture, visibleRows);
        if (obfuscationGuard != -1) {
          loaderApplet = (java.applet.Applet) null;
        }
    }

    private final void a(int param0) {
        int var2 = this.field_a.frameId >> 16;
        if (param0 < 68) {
          this.a(91);
        }
        AnimationFrameSet var3 = we.a(var2, true);
        MusicPatch.a(var3, (byte) -34);
    }

    private final void a(byte param0, int param1) {
        int var3;
        var3 = 0;
        if (this.field_b != param1 &&
          -1 != param1 &&
          param1 >= 0 &&
          param1 < 9) {
          var3 = 1;
          this.field_b = param1;
        }
        if (this.field_b == -1 ||
          this.field_b < 0 ||
          this.field_b >= 9) {
          var3 = 1;
          this.field_b = 0;
        }
        if (var3 != 0) {
          if (BestScoreStrategy.unitAnimationVariants[this.field_f][this.field_b][0] < 0) {
            this.field_b = this.c((byte) 82);
          }
          this.c(param0 ^ -126);
        }
        if (param0 != -126) {
          this.field_f = -111;
        }
    }

    final static void initializeChatHistory(byte obfuscationGuard, int categoryLimit) {
        if (obfuscationGuard != 30) {
          la.openPublicTextChat(104);
        }
        BitmapTextWidgetPainter.chatHistorySize = 0;
        MoveAttackRequest.chatHistoryPriorityCounts = new int[3];
        DefeatPlayerConsoleCommand.chatHistory = new ChatMessage[categoryLimit * 15];
        AnimationPlayer.chatHistoryCategoryLimit = categoryLimit;
    }

    final void a(byte param0) {
        int var3 = -30 / ((-31 - param0) / 54);
        int var2 = 0;
        this.a((byte) -126, var2);
        this.field_a.advance(-122);
        this.a(73);
    }

    la(int param0) {
        this.field_a = new AnimationPlayer(1);
        this.field_f = param0;
        if (param0 == 43) {
          param0 = 77;
        }
        this.field_c = (ModelMesh) (ActionRequest.unitModels[param0][0]);
        this.field_h = DiskCacheRequest.unitProjectionVariants[param0];
        this.field_b = 0;
        this.c(0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param1 = param1 | param1 << 8;
          if (param5) {
            loaderApplet = (java.applet.Applet) null;
          }
          var6_int = param1 ^ param1 >> 1;
          for (var9 = 0; var9 < 4; var9++) {
            var8 = CachedArchiveProvider.field_y[var9][1] + (param0 + (3 & param1) - 64);
            var7 = -44 + CachedArchiveProvider.field_y[var9][0] + (param3 + (7 & var6_int));
            if (var9 != 0) {
              nr.activeFoliageSprites[param1 % 9 + 25].b(var7, var8, param4, param2);
            } else {
              nr.activeFoliageSprites[16 + param1 % 9].b(var7, var8 - CachedArchiveProvider.field_y[var9][1], param4, param2);
            }
            param1 = param1 >> 1;
            var6_int = var6_int >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6), "la.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void c(int param0) {
        if (this.field_b >= 0 &&
          this.field_b < 9) {
          this.field_a.selectSequence(-1, ck.animationSequencesByGroup[ResizableModalDialog.unitAnimationGroups[this.field_f]][BestScoreStrategy.unitAnimationVariants[this.field_f][this.field_b][0]]);
        } else {
          this.field_a.selectSequence(~param0, ck.animationSequencesByGroup[ResizableModalDialog.unitAnimationGroups[this.field_f]][0]);
        }
        if (param0 != 0) {
          this.a((byte) 11, -94);
        }
        this.a(81);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        ModelMesh var15 = (ModelMesh) (this.field_a.applyCurrentFrame(false, true, false, this.field_c));
        if (75 == this.field_f) {
          var15.scaleGeometry(250, 250, 250);
        }
        if (this.field_f == 76) {
          var15.scaleGeometry(512, 512, 512);
        }
        int var8 = 0;
        int var9 = 2044 & param3 << 2;
        if (param4 <= 66) {
          this.field_f = 63;
        }
        int var10 = 0;
        TriangleRasterizer.setProjectionCenter(param2, param1);
        int var11 = 20;
        int var12 = 0;
        int var13 = 500;
        int var14 = 250 - (this.field_h ? 100 * param0 / 128 : 0);
        var14 = var14 + wv.field_g[this.field_f];
        var15.scaleGeometry(param0, param0, param0);
        if (param5) {
          fh.a(124, var15);
        }
        var15.a(var8, var9, var10, var11, var12, var14, var13);
    }

    static {
        field_e = "Enter multiplayer lobby";
    }
}
