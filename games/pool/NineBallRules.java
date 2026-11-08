/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineBallRules extends GameRules {
    static int[] field_g;
    static UiComponent field_j;
    static int field_h;
    private int field_f;
    static String unpackingGraphics;
    static String chatviewscrolledup;

    final int timeoutResolution(int param0) {
        ShotRecord var2;
        int var3;
        int var4;
        var4 = Pool.field_O;
        var2 = this.field_d.currentShot(75);
        var2.field_t = true;
        if (param0 != -1) {
          return -103;
        }
        var3 = var2.ballInHandMode;
        if (var3 == 2) {
          return this.baseResolutionFlags(10) & ~AccountWelcomePanel.field_Y | AccountWelcomePanel.field_Q;
        }
        if (3 == var3) {
          return this.baseResolutionFlags(10) & ~AccountWelcomePanel.field_Y | AccountWelcomePanel.field_V;
        }
        if (var3 == 1) {
          return this.baseResolutionFlags(10) & ~AccountWelcomePanel.field_Y | AccountWelcomePanel.field_R;
        }
        if (var3 != 0) {
        }
        return this.baseResolutionFlags(10);
    }

    final void updateGroupLabels(int param0) {
        int discarded$0 = 0;
        if (param0 > -25) {
          discarded$0 = this.foulFlagsNoContact(60);
        }
    }

    NineBallRules(PoolGameModel param0) {
        super(param0);
        this.field_f = 1;
    }

    final int groupMessageIndex(ShotRecord param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -96 / ((-32 - param1) / 40);
          stackIn_1_0 = 12 + param0.groupBefore;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("fj.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final int initialBallInHandMode(boolean param0) {
        if (param0) {
          this.field_f = 76;
          return 1;
        }
        return 1;
    }

    public static void releaseStatics(boolean param0) {
        unpackingGraphics = null;
        if (param0) {
          field_j = (UiComponent) null;
        }
        field_j = null;
        field_g = null;
        chatviewscrolledup = null;
    }

    final static int achievementNameCount(byte param0) {
        if (param0 >= -6) {
          NineBallRules.achievementNameCount((byte) -21);
        }
        return !MeshColorSupport.a(true) ? -1 + RenderingInitializationSupport.achievementNames.length : RenderingInitializationSupport.achievementNames.length;
    }

    private final int baseResolutionFlags(int param0) {
        if (param0 != 10) {
          field_j = (UiComponent) null;
        }
        return AccountWelcomePanel.field_Q | BrowserUrlSupport.field_f;
    }

    final boolean isPotLegal(int param0, byte param1, ShotRecord param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9) {
            unpackingGraphics = (String) null;
          }
          return !(param0 <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("fj.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static Sprite[] createBeveledPanelSprites(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          String var5 = (String) null;
          NineBallRules.isActivePrivateChatRecipient((String) null, (byte) 90);
        }
        return EightBallRules.createBeveledPanelSprites(param0, 64, param2, param1, 1);
    }

    final static boolean isActivePrivateChatRecipient(String name, byte obfuscationGuard) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DualLinkNode.field_p) {
            return false;
          }
          if (CookieDateSupport.field_b == 2 &&
            ResourceArchive.field_a != null) {
            var3 = (CharSequence) ((Object) name);
            if (!ResourceArchive.field_a.equals(TutorialController.normalizeDisplayName(91, var3))) {
              return false;
            }
            if (obfuscationGuard == -101) {
              return true;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("fj.RA(");
          if (name == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int defaultBallInHandMode(int param0) {
        int var2 = 77 / ((param0 + 79) / 38);
        return 1;
    }

    final boolean isFirstContactLegal(ShotRecord param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -33) {
            NineBallRules.createBeveledPanelSprites(67, 8, 86, true);
          }
          stackIn_5_0 = (param0.field_n == param0.groupBefore);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fj.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final Sprite targetBallSprite(ShotRecord param0, int param1) {
        RuntimeException var3 = null;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_5_0 = null;
        Sprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = (Sprite) null;
            return stackIn_2_0;
          }
          if (param0.groupBefore != -1) {
            stackIn_7_0 = MeshBoundsSupport.field_a[param0.groupBefore];
            return stackIn_7_0;
          }
          stackIn_5_0 = ClassicBallSkin.field_n;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fj.JA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int initialGroup(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (param0 != -1) {
          String var4 = (String) null;
          NineBallRules.isActivePrivateChatRecipient((String) null, (byte) 119);
        }
        for (var2 = 1; var2 < 9; var2++) {
          if (this.field_d.balls[var2].inPlay) {
            return var2;
          }
        }
        return 9;
    }

    final void onShotStart(int param0) {
        this.field_f = this.initialGroup(-1);
        if (param0 != 11828) {
          this.onShotStart(-102);
        }
    }

    final boolean showsTargetBall(int param0) {
        if (param0 < 113) {
          NineBallRules.releaseStatics(false);
        }
        return true;
    }

    final int evaluateShot(byte param0) {
        int var3;
        int var4;
        Object var6;
        PotEvent var6_ref;
        int var7;
        ShotRecord var8;
        ShotRecord var9;
        IntrusiveDequeCursor var10;
        IntrusiveDequeCursor var11;
        var6 = null;
        var7 = Pool.field_O;
        var8 = this.field_d.currentShot(123);
        var9 = var8;
        if (var9 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        }
        var3 = 0;
        if (this.field_d.isCueBallPotted((byte) 118)) {
          var9.addEvent(3, -14, new int[]{this.field_d.field_A});
          var3 = var3 | (this.foulFlagsCueBallPotted((byte) -47) | MeshBase.field_c);
          var9.field_t = true;
          var9.field_w = (byte)(var9.field_w - 1);
        }
        if (var9.field_n != -1) {
          if (this.field_f != var9.field_n) {
            var9.addEvent(8, -14, new int[]{});
            var3 = var3 | this.foulFlagsWrongBallFirst(0);
            var9.field_w = (byte)(var9.field_w - 1);
            var9.field_t = true;
          }
        } else {
          var9.addEvent(7, -14, new int[]{var8.playerIndex});
          var9.field_t = true;
          var3 = var3 | this.foulFlagsNoContact(75);
          var9.field_w = (byte)(var9.field_w - 1);
        }
        var4 = 74 % ((-37 - param0) / 60);
        if (var3 != 0) {
          if (!var9.pottedBalls.isEmpty(0)) {
            var11 = new IntrusiveDequeCursor(var9.pottedBalls);
            var6_ref = (PotEvent) (var11.last((byte) -92));
            while (var6_ref != null) {
              if (9 != var6_ref.ballIndex) {
                var6_ref = (PotEvent) (var11.previous(-86));
                continue;
              }
              var9.addEvent(9, -14, new int[]{this.field_d.field_A});
              var9.field_t = true;
              return Quaternion.field_e;
            }
          }
        } else {
          if (!var9.pottedBalls.isEmpty(0)) {
            var10 = new IntrusiveDequeCursor(var9.pottedBalls);
            var6_ref = (PotEvent) (var10.last((byte) -92));
            while (var6_ref != null) {
              if (var6_ref.ballIndex == 9) {
                var9.addEvent(10, -14, new int[]{this.field_d.field_A});
                return ScreenProjectionSupport.field_e;
              }
              var3 = var3 | MarkerSliderPainter.field_j;
              var9.field_w = (byte)(var9.field_w + 1);
              var6_ref = (PotEvent) (var10.previous(-126));
            }
          }
          if (this.field_d.shouldChangePlayer(false, (byte) 81, var9)) {
            if (this.isPlayerSnookered((var9.playerIndex + 1) % this.field_d.playerCount, -102)) {
              var9.field_w = (byte)(var9.field_w + 1);
            }
          } else {
            if (this.isPlayerSnookered(var9.playerIndex % this.field_d.playerCount, -41)) {
              var9.field_w = (byte)(var9.field_w - 1);
            }
          }
        }
        return var3;
    }

    final static boolean canOpenQuickChatOptions(String param0, int[] param1, int param2, int param3, long param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var6_int = 94 % ((param2 + 49) / 53);
          if (param1 != null && (2 != param3 ||
            AccountStateQuery.a(false, param4, param0))) {
            stackIn_6_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_6_0 = false;
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("fj.QA(");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int foulFlagsWrongBallFirst(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
          discarded$0 = this.foulFlagsWrongBallFirst(-69);
        }
        return this.baseResolutionFlags(param0 + 10);
    }

    final int ballCount(int param0) {
        if (param0 != 26840) {
          field_j = (UiComponent) null;
        }
        return 10;
    }

    final int[] rackOrder(int param0, byte param1) {
        int var4 = 0;
        int var5 = Pool.field_O;
        IsaacCipher var6 = new IsaacCipher(new int[]{1024 + param0});
        IsaacCipher var3 = var6;
        for (var4 = 0; var4 < 7; var4++) {
          CachedArchiveSource.field_M[var4] = var4 + 2;
          FullscreenDisplayMode.field_a[var4] = var6.a(23165, 2048);
        }
        StrongCacheEntry.sortPairedArrays(FullscreenDisplayMode.field_a, CachedArchiveSource.field_M, (byte) -54);
        Js5Transport.field_s[1] = 1;
        Js5Transport.field_s[0] = 0;
        Js5Transport.field_s[3] = CachedArchiveSource.field_M[1];
        Js5Transport.field_s[2] = CachedArchiveSource.field_M[0];
        Js5Transport.field_s[6] = CachedArchiveSource.field_M[3];
        Js5Transport.field_s[4] = CachedArchiveSource.field_M[2];
        Js5Transport.field_s[5] = 9;
        Js5Transport.field_s[7] = -1;
        if (param1 != -32) {
          field_g = (int[]) null;
        }
        Js5Transport.field_s[10] = -1;
        Js5Transport.field_s[12] = -1;
        Js5Transport.field_s[14] = -1;
        Js5Transport.field_s[13] = CachedArchiveSource.field_M[6];
        Js5Transport.field_s[8] = CachedArchiveSource.field_M[4];
        Js5Transport.field_s[9] = CachedArchiveSource.field_M[5];
        Js5Transport.field_s[11] = -1;
        Js5Transport.field_s[15] = -1;
        return Js5Transport.field_s;
    }

    final byte ballGroup(int param0, int param1) {
        if (param1 != 30554) {
          this.rackOrder(93, (byte) 18);
        }
        return (byte)param0;
    }

    private final int foulFlagsCueBallPotted(byte param0) {
        int var2 = 94 / ((param0 - 5) / 44);
        return this.baseResolutionFlags(10);
    }

    final boolean isBallInGroup(int param0, byte param1, int param2) {
        if (param1 <= 122) {
          return false;
        }
        return param2 > 0 ? true : false;
    }

    private final int foulFlagsNoContact(int param0) {
        if (param0 < 8) {
          NineBallRules.achievementNameCount((byte) -24);
        }
        return this.baseResolutionFlags(10);
    }

    final boolean isPlayerSnookered(int param0, int param1) {
        if (param1 >= -28) {
          return true;
        }
        this.field_d.computeAimTargets(12226, 0);
        return !this.field_d.field_r[this.initialGroup(-1)].visible ? true : false;
    }

    static {
        field_g = new int[8192];
        chatviewscrolledup = "Chat view has been scrolled up. Scroll down to chat.";
        unpackingGraphics = "Unpacking graphics";
    }
}
