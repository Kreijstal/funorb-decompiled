/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelHud {
    private PaletteBitmapFont field_o;
    static String field_h;
    static String field_j;
    private int field_m;
    private int field_n;
    private boolean field_l;
    private int field_q;
    int field_b;
    private boolean field_i;
    private boolean field_c;
    int field_k;
    static float field_f;
    static int field_d;
    private boolean field_e;
    private float field_p;
    int field_a;
    private boolean field_s;
    private boolean field_g;
    private int field_r;

    private final String formatTimer(int param0) {
        if (param0 != 31214) {
          return (String) null;
        }
        int var2 = this.field_a / 3000;
        int var3 = this.field_a % 3000 / 50;
        return var2 + ":" + (10 <= var3 ? "" : "0") + var3;
    }

    public static void releaseStatics(byte param0) {
        field_j = null;
        field_h = null;
        if (param0 <= 59) {
          LevelHud.findAnimatedTile(-19, 30);
        }
    }

    final void incrementCrossedCount(boolean param0) {
        this.field_b = this.field_b + 1;
        if (!param0) {
          this.field_r = 87;
        }
        this.recountUnits((byte) -106);
    }

    final static void renderLevelIconGlow(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawn.field_J;
        try {
          PendingIntArrayRequest.field_q = param0;
          RandomAccessCacheFile.field_g.setAsRenderTarget();
          Rasterizer.clear();
          WhirlpoolHasher.field_i[CutsceneStateHelpers.field_e][PendingIntArrayRequest.field_q].drawTransparent(10, 10);
          for (var2_int = 0; 3 > var2_int; var2_int++) {
            SpriteEffectHelpers.drawRasterOutline(16777045);
          }
          WhirlpoolHasher.field_i[CutsceneStateHelpers.field_e][PendingIntArrayRequest.field_q].drawTransparentWithOpacity(10, 10, 0);
          Rasterizer.blurRectangle(2, 2, 0, 0, RandomAccessCacheFile.field_g.field_w, RandomAccessCacheFile.field_g.field_t);
          DisplayState.field_f.makeRasterTarget(-115);
          LoginPacketHelpers.field_a = 3 * LoginMethod.field_f.length >> 2;
          if (param1 >= -25) {
            LevelHud.releaseStatics((byte) 111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "ub.L(" + param0 + ',' + param1 + ')');
        }
    }

    final int getElapsedSeconds(int param0) {
        if (param0 >= -73) {
          this.isTimeUp(123);
        }
        return this.field_q / 50;
    }

    final void setCountOnlyMode(boolean param0, byte param1) {
        this.field_l = param0 ? true : false;
        if (param1 != -13) {
          return;
        }
        if (param0) {
          this.renderHumanCounter(-127);
        }
    }

    final static FrameSequence findAnimatedTile(int param0, int param1) {
        int var3 = 0;
        FrameSequence[] var2;
        FrameSequence var4;
        int var5;
        FrameSequence[] var6;
        var5 = ZombieDawn.field_J;
        var6 = SingleChildWidget.field_x;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4.field_e == (param1 & 127)) {
            return var4;
          }
        }
        if (param0 == 127) {
          return null;
        }
        field_j = (String) null;
        return null;
    }

    final void setCrossingCounterMode(int param0, boolean param1) {
        if (param0 != 0) {
          return;
        }
        this.field_e = param1 ? true : false;
        if (param1) {
          this.field_b = 0;
          this.renderObjectiveLabel(param0 ^ 6);
        }
    }

    private final void renderTimerLabel(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -1;
        if (this.field_p == 1.0f) {
          HunterHuman.field_Ub[5].setAsRenderTarget();
          Rasterizer.clear();
          this.field_o.drawStringRightAligned(this.formatTimer(31214), -5 + Rasterizer.width, this.field_o.field_I + 5, 0, var2);
        } else {
          LevelSelectScreen.field_p.setAsRenderTarget();
          Rasterizer.clear();
          this.field_o.drawStringRightAligned(this.formatTimer(31214), -5 + Rasterizer.width, 5 + this.field_o.field_I, 2, var2);
          var3 = (int)(this.field_p * (float)Rasterizer.width);
          var4 = (int)((float)Rasterizer.height * this.field_p);
          HunterHuman.field_Ub[5].setAsRenderTarget();
          Rasterizer.clear();
          LevelSelectScreen.field_p.drawScaled(Rasterizer.width - var3, 0, var3, var4);
        }
        SpriteFadeHelpers.field_e[5].setAsRenderTarget();
        Rasterizer.clear();
        HunterHuman.field_Ub[5].drawSilhouette(0, 0, 16777215);
        ScreenBlurHelpers.blurScreen((byte) 50);
        HunterHuman.field_Ub[5].drawSilhouette(0, param0, 0);
    }

    private final void renderHumanCounter(int param0) {
        int stackIn_8_0 = 0;
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawn.field_J;
        HunterHuman.field_Ub[2].setAsRenderTarget();
        Rasterizer.clear();
        if (this.field_s) {
          var2 = Js5Archive.field_e.field_hb;
        } else {
          if (!this.field_g) {
            var2 = Js5Archive.field_e.field_P;
          } else {
            var2 = Js5Archive.field_e.field_nb;
          }
        }
        if (!this.field_s) {
          stackIn_8_0 = Js5Archive.field_e.field_f;
        } else {
          stackIn_8_0 = 2;
        }
        var3 = stackIn_8_0;
        if (!this.field_l &&
          !this.field_g) {
          if (var3 <= 99) {
            this.field_o.drawString(var2 + "/" + var3, 20, 2 * this.field_o.field_I - 3, 2, 65793);
          } else {
            this.field_o.drawString("/" + var3, 22, this.field_o.field_I * 2 + 6, 2, 65793);
            this.field_o.drawString(Integer.toString(var2), 15, 6 + this.field_o.field_I, 2, 65793);
          }
        } else {
          this.field_o.drawString(Integer.toString(var2), 20, this.field_o.field_I * 2 - 3, 2, 65793);
        }
        SpriteFadeHelpers.field_e[2].setAsRenderTarget();
        Rasterizer.clear();
        HunterHuman.field_Ub[2].drawSilhouette(0, 0, 16777215);
        ScreenBlurHelpers.blurScreen((byte) -65);
        if (param0 >= -20) {
          this.field_k = 119;
        }
        HunterHuman.field_Ub[2].drawSilhouette(0, 0, 0);
    }

    private final void renderScoreLabel(int param0, int param1) {
        HunterHuman.field_Ub[4].setAsRenderTarget();
        Rasterizer.clear();
        this.field_o.drawStringRightAligned(this.formatScoreLabel(param0 - 73, param1), -5 + Rasterizer.width, 5 + this.field_o.field_I, param0, -1);
        SpriteFadeHelpers.field_e[4].setAsRenderTarget();
        Rasterizer.clear();
        HunterHuman.field_Ub[4].drawSilhouette(0, 0, 16777215);
        ScreenBlurHelpers.blurScreen((byte) -78);
        HunterHuman.field_Ub[4].drawSilhouette(0, 0, 0);
    }

    final void recountUnits(byte param0) {
        IntrusiveNode var2;
        int var3;
        var3 = ZombieDawn.field_J;
        this.field_k = 0;
        var2 = Js5Archive.field_e.zombies.last((byte) 26);
        IconButtonPainter.field_t = 0;
        while (var2 instanceof WorldObject) {
          if (var2 instanceof Zombie &&
            ((Zombie) (var2)).isPlayerOwned((byte) -126)) {
            this.field_k = this.field_k + 1;
          } else {
            if (var2 instanceof Human && (!this.field_s ||
              28 == ((Human) (var2)).field_t) && (((Human) (var2)).state != 18 &&
              19 != ((Human) (var2)).field_t &&
              !((Human) (var2)).field_J)) {
              IconButtonPainter.field_t = IconButtonPainter.field_t + 1;
            }
          }
          var2 = var2.previous;
        }
        IconButtonPainter.field_t = IconButtonPainter.field_t - Js5Archive.field_e.field_db;
        if (param0 != -106) {
          return;
        }
        this.renderHumanCounter(-58);
        this.renderZombieCounter(param0 + 106);
        if (this.field_e) {
          this.renderObjectiveLabel(6);
        } else {
          if (this.field_g) {
            this.renderObjectiveLabel(6);
          }
        }
        DisplayState.field_f.makeRasterTarget(-117);
        if (!this.field_s &&
          !this.field_e &&
          !this.field_g &&
          Js5Archive.field_e.field_f > Js5Archive.field_e.field_P + IconButtonPainter.field_t) {
          Blast.handleTutorialEvent(-11, param0 ^ -6878);
        }
    }

    final void hideTimer(int param0) {
        this.field_c = false;
        if (param0 != 0) {
          this.isQuotaReached(false);
        }
    }

    final boolean isTimeUp(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 16284) {
          this.renderScoreLabel(-57, -1);
        }
        stackIn_6_0 = (this.field_c) && (this.field_a <= 0);
        return stackIn_6_0;
    }

    final void setEnemyVictimMode(int param0, boolean param1) {
        this.field_g = param1 ? true : false;
        if (param0 != 10) {
          return;
        }
        if (param1) {
          this.renderObjectiveLabel(6);
          this.field_c = true;
        }
    }

    final void growLetterbox(int param0) {
        if (this.field_r < 320) {
          this.field_r = this.field_r + 1;
        }
        if (param0 != 16777215) {
          this.field_g = true;
        }
    }

    final boolean hasNoZombiesLeft(int param0) {
        if (param0 != 16954) {
          this.update(-109, 76);
        }
        return this.field_k <= 0 ? true : false;
    }

    final void draw(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var2Lifetime3Lifetime1;
        int var2Lifetime3Lifetime2;
        int var2Lifetime3Lifetime3;
        if (this.field_i) {
          var2 = LevelObstacle.field_M + this.field_n;
          Rasterizer.fillRect(0, 0, WhirlpoolHasher.field_e, var2, 0);
          var2++;
          Rasterizer.fillRect(0, -var2 + DropdownList.field_P, WhirlpoolHasher.field_e, var2, 0);
          return;
        }
        if (this.field_c) {
          var2Lifetime1 = -210 + WhirlpoolHasher.field_e;
          SpriteEffectHelpers.drawTransparent(SpriteFadeHelpers.field_e[5], var2Lifetime1, 40);
          HunterHuman.field_Ub[5].drawTransparent(var2Lifetime1, 40);
        }
        var2Lifetime2 = -310 + WhirlpoolHasher.field_e;
        SpriteEffectHelpers.drawTransparent(SpriteFadeHelpers.field_e[4], var2Lifetime2, 0);
        HunterHuman.field_Ub[4].drawTransparent(var2Lifetime2, 0);
        if (param0 >= -59) {
          this.update(54, 36);
        }
        if (!this.field_e &&
          !this.field_g) {
          var2Lifetime3 = -70 + DropdownList.field_P;
          SpriteEffectHelpers.drawTransparent(SpriteFadeHelpers.field_e[0], 0, var2Lifetime3);
          HunterHuman.field_Ub[0].drawTransparent(5, 5 + var2Lifetime3);
          var2Lifetime3Lifetime1 = DropdownList.field_P - 80;
          SpriteEffectHelpers.drawTransparent(SpriteFadeHelpers.field_e[2], 70, var2Lifetime3Lifetime1);
          HunterHuman.field_Ub[2].drawTransparent(70, var2Lifetime3Lifetime1);
          var2Lifetime3Lifetime2 = DropdownList.field_P - 68;
          var3 = -48 + WhirlpoolHasher.field_e;
          SpriteEffectHelpers.drawTransparent(SpriteFadeHelpers.field_e[1], var3, var2Lifetime3Lifetime2);
          var3 -= 35;
          HunterHuman.field_Ub[1].drawTransparent(var3, var2Lifetime3Lifetime2 + 5);
          var3Lifetime1 = -170 + WhirlpoolHasher.field_e;
          var2Lifetime3Lifetime3 = -55 + DropdownList.field_P;
          SpriteEffectHelpers.drawTransparent(SpriteFadeHelpers.field_e[3], var3Lifetime1, var2Lifetime3Lifetime3);
          HunterHuman.field_Ub[3].drawTransparent(var3Lifetime1, var2Lifetime3Lifetime3);
        } else {
          HunterHuman.field_Ub[6].drawTransparent(220 + SpriteFadeHelpers.field_b, -55 + DropdownList.field_P);
          SpriteEffectHelpers.drawTransparent(SpriteFadeHelpers.field_e[6], SpriteFadeHelpers.field_b + 220, -55 + DropdownList.field_P);
        }
    }

    final static void showLoginDialog(byte param0) {
        if (param0 < 43) {
          LevelHud.findAnimatedTile(124, 35);
        }
        PasswordFieldPainter.showLoginForm((String) null, IntroSpeedHelpers.field_d, -901373652);
    }

    private final String formatScoreLabel(int param0, int param1) {
        String var5 = ScrollContainer.formatScaledDecimal(true, 0, MenuSelection.field_a, (long)param1, (byte) 113);
        String var3 = var5;
        int var4 = 107 % ((-8 - param0) / 33);
        return BlastAffectedObject.substituteTemplateArguments(1938762664, MenuSelection.field_i, new String[]{var5});
    }

    final boolean isQuotaReached(boolean param0) {
        boolean stackIn_4_0 = false;
        boolean stackIn_12_0 = false;
        if (this.field_s) {
          stackIn_4_0 = (0 == IconButtonPainter.field_t);
          return stackIn_4_0;
        }
        if (!param0) {
          this.renderObjectiveLabel(-118);
        }
        stackIn_12_0 = (Js5Archive.field_e.field_P >= Js5Archive.field_e.field_f) && (!this.field_l) && (!this.field_g);
        return stackIn_12_0;
    }

    final void setSpecialTargetMode(int param0, boolean param1) {
        if (param0 != 49) {
          LevelHud.renderLevelIconGlow(110, (byte) 53);
        }
        this.field_s = param1 ? true : false;
        if (param1) {
          this.recountUnits((byte) -106);
          this.renderHumanCounter(-53);
        }
    }

    final void setTimerTicks(int param0) {
        this.field_a = param0;
    }

    final int getTimerSeconds(byte param0) {
        int var2 = -41 % ((2 - param0) / 45);
        return !this.field_c ? -1 : this.field_a / 50;
    }

    private final void renderObjectiveLabel(int param0) {
        ContentTransitionDialog.setRasterTarget((byte) -103, HunterHuman.field_Ub[param0]);
        Rasterizer.clear();
        String var2 = "";
        if (this.field_e) {
          var2 = BlastAffectedObject.substituteTemplateArguments(1938762664, JaggrabDownloader.field_f, new String[]{Integer.toString(this.field_b), Integer.toString(this.field_k + this.field_b)});
          this.field_o.drawStringCentered(var2, Rasterizer.width / 2, 5 + this.field_o.field_I, 2, 65793);
        } else {
          var2 = NameSuggestionsPanel.field_I + " " + Integer.toString(Js5Archive.field_e.field_nb);
          CacheEntry.field_q.drawStringCentered(var2, Rasterizer.width / 2, 5 + this.field_o.field_I, 16777088, 65793);
        }
        SingleChildWidget.popRasterState(-21189);
        ContentTransitionDialog.setRasterTarget((byte) -93, SpriteFadeHelpers.field_e[6]);
        Rasterizer.clear();
        HunterHuman.field_Ub[6].drawSilhouette(0, 0, 16777215);
        ScreenBlurHelpers.blurScreen((byte) -104);
        HunterHuman.field_Ub[6].drawSilhouette(0, 0, 0);
        SingleChildWidget.popRasterState(-21189);
    }

    private final void renderZombieCounter(int param0) {
        HunterHuman.field_Ub[3].setAsRenderTarget();
        Rasterizer.clear();
        this.field_o.drawStringRightAligned(Integer.toString(this.field_k), -5 + Rasterizer.width, this.field_o.field_I + 5, 1, 65793);
        SpriteFadeHelpers.field_e[3].setAsRenderTarget();
        Rasterizer.clear();
        HunterHuman.field_Ub[3].drawSilhouette(0, 0, 16777215);
        ScreenBlurHelpers.blurScreen((byte) -83);
        HunterHuman.field_Ub[3].drawSilhouette(param0, 0, 0);
    }

    final void setLetterbox(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        this.field_i = param1 ? true : false;
        if (param1) {
          this.field_r = 80;
          this.field_n = 0;
          this.field_c = false;
        }
    }

    final void update(int param0, int param1) {
        if (this.field_i) {
          if (this.field_n >= this.field_r) {
            if (this.field_r < this.field_n) {
              this.field_n = this.field_r;
            }
          } else {
            this.field_n = this.field_n + 1;
          }
        }
        if (this.field_c &&
          !this.isQuotaReached(true) &&
          !this.hasNoZombiesLeft(16954) &&
          !this.isTimeUp(16284)) {
          this.field_a = this.field_a - 1;
        }
        this.field_q = this.field_q + 1;
        if (1.0f != this.field_p) {
          this.field_p = this.field_p + -0.029999999329447746f;
          if (this.field_p <= 1.0f) {
            this.field_p = 1.0f;
          }
        }
        if (this.field_a > param1 &&
          this.field_a % 1500 == 49) {
          this.field_p = 2.0f;
        }
        if (this.field_a > 0 &&
          this.field_a <= 550 &&
          this.field_a % 50 == 49) {
          this.field_p = 2.0f;
          EmptyWidgetPainter.queueSoundEffect(47, false);
        }
        if (this.field_c) {
          if (1.0f < this.field_p) {
            this.renderTimerLabel(0);
          } else {
            if (this.field_a % 50 == 49) {
              this.renderTimerLabel(0);
            }
          }
        }
        if (param0 != this.field_m) {
          this.renderScoreLabel(3, param0);
          this.field_m = param0;
        }
        DisplayState.field_f.makeRasterTarget(124);
    }

    LevelHud(int param0) {
        this.field_n = 0;
        this.field_b = 0;
        this.field_l = false;
        this.field_q = 0;
        this.field_m = 0;
        this.field_k = 0;
        this.field_c = true;
        this.field_e = false;
        this.field_p = 1.0f;
        this.field_i = false;
        this.field_s = false;
        this.field_a = 0;
        this.field_g = false;
        this.field_r = 80;
        this.field_a = param0;
        this.field_q = 0;
        this.field_o = ProgressMessageDialog.field_jb;
        this.renderTimerLabel(0);
        this.renderScoreLabel(3, this.field_m);
        this.recountUnits((byte) -106);
        DisplayState.field_f.makeRasterTarget(-123);
    }

    static {
        field_h = "BREACH";
        field_j = "to return to the normal view.";
    }
}
