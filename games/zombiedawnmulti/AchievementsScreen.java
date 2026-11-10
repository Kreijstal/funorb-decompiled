/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementsScreen extends MenuScreen {
    static UiComponent field_l;
    static String field_q;
    static String field_p;
    static int field_r;
    static String field_o;
    private int field_n;
    private int field_t;
    private int[] field_s;
    private int[] field_m;

    final int getItemRight(int param0, int param1) {
        if (param0 >= -65) {
          field_p = (String) null;
        }
        if (!ScorePopup.isGuestSession(106) ||
          this.field_d == 6) {
          return this.getItemX((byte) -118, param1) + this.field_k;
        }
        if (param1 == 0) {
          return 350 + this.getItemX((byte) -118, param1);
        }
        return 100 + this.getItemX((byte) -118, param1);
    }

    final void drawScreen(boolean param0) {
        int var17 = 0;
        String[] var3;
        String var4;
        String var5;
        PaletteBitmapFont var6;
        BinaryBitmapFont var7;
        int var8;
        int var9;
        IndexedSprite var10;
        int var10_int;
        int var11;
        int var12;
        IndexedSprite var12_ref_ri;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        String[] var19;
        int var9Lifetime1;
        int var11Lifetime1;
        var18 = ZombieDawnMulti.field_E ? 1 : 0;
        super.drawScreen(param0);
        var19 = PlayModeChoiceDialog.field_G;
        var3 = StatSubmissionHelpers.field_e;
        var4 = RankingsRequest.field_n;
        var5 = ZombieDetonation.field_q;
        var6 = TranslatedUiText.field_e;
        var7 = EffectAudioHelpers.field_e;
        if (this.field_d == 6) {
          var7.drawCentered(ContextMenu.field_Mb, 320, 300, 16777215, 0);
        }
        var8 = ArchiveProvider.field_e;
        for (var9 = 0; SocialRequestHelpers.field_b > var9; var9++) {
          if ((this.field_d != 6 ||
            this.isAchievementEarned(var9, 86)) &&
            this.isAchievementVisible(-1, var9)) {
            var10_int = this.field_m[var9];
            var11 = this.field_s[var9];
            if (this.field_t == var9) {
              SoftwareRasterizer.fillRoundedRectAlpha(-3 + var10_int, -3 + var11, 38, 38, 6, 0, 128);
            }
            if (this.field_n == var9) {
              SoftwareRasterizer.drawRoundedRect(var10_int - 3, var11 - 3, 38, 38, 6, 16777215);
            }
            var12_ref_ri = this.getAchievementIcon(0, var9);
            var12_ref_ri.drawQuarterSize(var10_int, var11);
          }
        }
        var7.drawCentered(GameWorld.field_E, 320, var8 + 72, 16777215, 0);
        var7.drawCentered(DialogLayer.field_G, 320, 18 + (40 + (var8 + 32)), 14540083, 0);
        var9Lifetime1 = -1;
        if (this.field_t == -1) {
          if (-1 != this.field_n) {
            var9Lifetime1 = this.field_n;
          }
        } else {
          var9Lifetime1 = this.field_t;
        }
        if (var9Lifetime1 != -1) {
          var10 = this.getAchievementIcon(0, var9Lifetime1);
          var10.draw(110, 140);
          var6.drawParagraph(var19[var9Lifetime1], 260, 105, 300, 85, 0, 0, 1, 2, 35);
          var11Lifetime1 = 280;
          var12 = 200;
          var13 = 280;
          var14 = 100;
          var15 = var7.maxAscent + var7.maxDescent;
          var16 = var15 * var7.drawParagraph(var3[var9Lifetime1], var11Lifetime1, var12, var13, var14, 16777215, 0, 0, 0, var15);
          var12 = var12 + (var16 - (-var15 - 6));
          var7.drawLeft(var5 + 100 * PendingIntArrayReply.field_n[var9Lifetime1], var11Lifetime1, var12, 16777215, 0);
          var12 = var12 + (6 + var15);
          var7.drawLeft(var4, var11Lifetime1, var12, 16777215, 0);
          var11Lifetime1 = var11Lifetime1 + var7.textWidth(var4);
          for (var17 = 0; PendingIntArrayReply.field_n[var9Lifetime1] > var17; var17++) {
            BufferedFile.field_k.drawTransparent(var17 * (BufferedFile.field_k.fullWidth >> 1) + var11Lifetime1, 2 - BufferedFile.field_k.field_u + var12);
          }
        }
    }

    final void onEnter(int param0, boolean param1, int param2) {
        int var8 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int[] var15;
        int var5Lifetime1;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        super.onEnter(0, param1, param2);
        this.field_m = new int[SocialRequestHelpers.field_b];
        this.field_s = new int[SocialRequestHelpers.field_b];
        this.field_t = -1;
        this.field_n = -1;
        var4 = 0;
        for (var5 = 0; var5 < SocialRequestHelpers.field_b; var5++) {
          if (this.isAchievementVisible(-1, var5)) {
            var4++;
          }
        }
        SocialRequestHelpers.field_a = (640 - (SocialRequestHelpers.field_g - 8) * var4 - (var4 - 1) * (-SocialRequestHelpers.field_g + SocialRequestHelpers.field_e)) / 2;
        var5Lifetime1 = SocialRequestHelpers.field_a;
        var6 = ArchiveProvider.field_e;
        var7 = param0;
        for (var8 = 0; var8 < SocialRequestHelpers.field_b; var8++) {
          if (this.isAchievementVisible(~param0, var8)) {
            var9 = var5Lifetime1;
            var10 = var6;
            this.field_m[var8] = var9;
            if (var7 % 2 == 1) {
              var10 += 24;
            }
            var7++;
            this.field_s[var8] = var10;
            var5Lifetime1 = var5Lifetime1 + (SocialRequestHelpers.field_e - 8);
          } else {
            var15 = this.field_m;
            var10 = var8;
            this.field_s[var8] = -100;
            var15[var10] = -100;
          }
        }
    }

    final int getItemX(byte param0, int param1) {
        if (this.field_d == 6) {
          return param1 != 0 ? 350 : 100;
        }
        if (param0 != -118) {
          return 51;
        }
        if (ScorePopup.isGuestSession(108)) {
          return 0 == param1 ? 50 : 470;
        }
        return 320 - (this.field_k >> 1);
    }

    final static Class loadClassOrPrimitive(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param0.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param0.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param0.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param1 >= -16) {
            AchievementsScreen.releaseStatics(-4);
          }
          if (param0.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param0.equals("C")) {
            stackIn_31_0 = Class.forName(param0);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("mq.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        field_p = null;
        if (param0 != 22324) {
          AchievementsScreen.releaseStatics(-115);
        }
    }

    private final IndexedSprite getAchievementIcon(int param0, int param1) {
        if (this.isAchievementEarned(param1, 29)) {
          return GrowableIntList.field_l[param1];
        }
        if (param0 != 0) {
          return (IndexedSprite) null;
        }
        return WhirlpoolHasher.field_l;
    }

    private final boolean isAchievementEarned(int param0, int param1) {
        if (param1 <= 10) {
          field_l = (UiComponent) null;
        }
        int[] var4 = this.field_d != 6 ? PacketBuffer.field_n : LevelData.field_m;
        int[] var3 = var4;
        return PhaseChangeEvent.isBitSet(param0, 127, var4);
    }

    AchievementsScreen(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_n = -1;
        this.field_t = -1;
    }

    private final boolean isSecretAchievement(int param0, int param1) {
        boolean stackIn_8_0 = false;
        if (param0 != -17) {
          AchievementsScreen.releaseStatics(-71);
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 != 13 && (param1 != 16 ||
          ProgressBarWidget.hasFeatureBit(0, -70))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    private final boolean isAchievementVisible(int param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param0 != -1) {
          this.field_n = -73;
        }
        stackIn_7_0 = (this.isAchievementEarned(param1, 119)) || !(this.isSecretAchievement(-17, param1));
        return stackIn_7_0;
    }

    final void updateScreen(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        super.updateScreen(param0);
        this.field_n = -1;
        var2 = SocialRequestHelpers.field_e - SocialRequestHelpers.field_g >> 1;
        if (ArchiveProvider.field_e < LoginMethod.field_d &&
          ArchiveProvider.field_e + 2 * SocialRequestHelpers.field_g > LoginMethod.field_d &&
          SocialRequestHelpers.field_a - var2 < MouseInputHandler.field_g) {
          var3 = -1;
          var4 = 0;
          while (true) {
            if (var4 < SocialRequestHelpers.field_b) {
              if (this.field_m[var4] <= MouseInputHandler.field_g &&
                SocialRequestHelpers.field_g + this.field_m[var4] > MouseInputHandler.field_g &&
                LoginMethod.field_d >= this.field_s[var4] &&
                LoginMethod.field_d < SocialRequestHelpers.field_g + this.field_s[var4]) {
                var3 = var4;
              } else {
                var4++;
                continue;
              }
            }
            if (SocialRequestHelpers.field_b > var3) {
              this.field_n = var3;
            }
            if (this.field_d != 6) {
              break;
            }
            if (this.field_n < 0) {
              break;
            }
            if (this.isAchievementEarned(this.field_n, 47)) {
              break;
            }
            this.field_n = -1;
            break;
          }
        }
        if (StringHashHelpers.field_b != 0) {
          if (this.field_t != this.field_n) {
            if (-1 != this.field_n) {
              this.field_t = this.field_n;
            }
          } else {
            this.field_t = -1;
          }
        }
    }

    static {
        field_r = 500;
        field_o = "Select a human or enemy zombie!";
        field_p = "Accept <%0> into this game";
        field_q = "Click";
    }
}
