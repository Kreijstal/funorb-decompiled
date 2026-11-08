/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AchievementsScreen extends MenuScreen {
    static String field_r;
    static int field_q;
    static int field_o;
    static String[] field_p;

    final void enterScreen(int param0, int param1, boolean param2) {
        TwistedLogicCube.field_v = -1;
        Cloud.field_j = -1;
        super.enterScreen(param0, param1, param2);
    }

    private final String getRowLabel(int param0, int param1) {
        if (param1 != 7698) {
          this.enterScreen(-110, 30, true);
        }
        if (param0 == 0) {
          return RequestState.field_b;
        }
        return PacketBuffer.field_o[this.field_k[param0]];
    }

    private final int getUnlockedMask(int param0) {
        if (param0 >= -95) {
          return -69;
        }
        return this.field_l == 9 ? EmailCredentials.field_k : MenuScreen.field_n;
    }

    private final boolean isAchievementVisible(int param0, byte param1) {
        boolean stackIn_9_0 = false;
        if (param1 <= 90) {
          this.handleNavigation(6);
        }
        stackIn_9_0 = ((8 == this.field_l &&
          !(param0 >= 16)) ||
          this.isAchievementUnlocked((byte) 66, param0));
        return stackIn_9_0;
    }

    final int getRowRight(int param0, boolean param1) {
        if (param1) {
          field_r = (String) null;
        }
        return this.getRowLeft(param0, (byte) 90) + this.getRowTextWidth(-112, param0);
    }

    final int getRowY(int param0, int param1) {
        int var3 = 25 / ((param0 + 13) / 37);
        return this.field_d;
    }

    private final int countUnlockedFrom(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        for (var3 = param0; var3 < GameApplet.field_n.length; var3++) {
          if ((1 << var3 & this.getUnlockedMask(-111)) > 0) {
            var2++;
          }
        }
        return var2;
    }

    final void draw(int param0) {
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        int var2;
        PaletteBitmapFont var3;
        BinaryBitmapFont var4;
        int var5;
        int var6;
        Sprite var6_ref_tf;
        int var7;
        int var8;
        Sprite var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var5Lifetime1;
        int var7Lifetime1;
        var15 = Pixelate.field_H ? 1 : 0;
        stackIn_3_0 = (9 != this.field_l) ? 0 : 1;
        var2 = stackIn_3_0;
        var3 = PieceTiming.field_e;
        if (param0 != 11) {
          AchievementsScreen.createPieceTiming(-94, (byte) 78);
        }
        var4 = PrivateChatHelpers.field_e;
        NumericDateInputWidget.field_W[6].drawTransparent(0, 45);
        this.drawRows((byte) -71);
        for (var5 = 0; var5 < GameApplet.field_n.length; var5++) {
          var6_ref_tf = this.getAchievementIcon((byte) 37, var5);
          if ((this.isAchievementUnlocked((byte) 66, var5) ||
            var2 == 0) && this.isAchievementVisible(var5, (byte) 97)) {
            var7 = this.getIconX(var5, (byte) -54);
            var8 = this.getIconY(-111, var5);
            if (var5 == Cloud.field_j) {
              SoftwareRasterizer.fillRoundedRectangleBlended(var7 - 3, -3 + var8, 38, 38, 6, 0, 128);
            }
            if (var5 == TwistedLogicCube.field_v) {
              SoftwareRasterizer.drawRoundedRectangle(var7 - 3, var8 - 3, 38, 38, 6, 16777215);
            }
            var6_ref_tf.drawQuarterSize(var7, var8);
          }
        }
        if (Cloud.field_j == -1) {
          stackIn_24_0 = TwistedLogicCube.field_v;
        } else {
          stackIn_24_0 = Cloud.field_j;
        }
        var5Lifetime1 = stackIn_24_0;
        if (-1 != var5Lifetime1) {
          var6 = var3.maxDescent + var3.field_D;
          var7Lifetime1 = var4.field_D + (var4.maxDescent + 3);
          var3.drawCentered(GameApplet.field_n[var5Lifetime1], 320, 280, 0, -1);
          if (this.isAchievementUnlocked((byte) 66, var5Lifetime1)) {
            var3.drawCentered(ViewportController.field_d, 320, 280 + var6, 0, -1);
          } else {
            var3.drawCentered(PicturePreview.field_t, 320, var6 + 280, 1, -1);
          }
          var9 = this.getAchievementIcon((byte) 37, var5Lifetime1);
          var9.drawTransparent(60, 120);
          var10 = var4.drawParagraph(this.getAchievementDescription(true, var5Lifetime1), 120, 320, 400, 400, 16777215, 0, 0, 0, var7Lifetime1);
          var11 = 320 + (var7Lifetime1 * var10 + 24);
          var4.drawText(MainMenuScreen.field_p + ChatHistoryAllocator.field_c[var5Lifetime1], 120, var11, 16777215, 0);
          var11 = var11 + (4 + var7Lifetime1);
          var4.drawText(DisplayNameForm.field_K, 120, var11, 16777215, 0);
          var12 = var4.textWidth(DisplayNameForm.field_K) + 120;
          var13 = var11;
          for (var14 = 0; var14 < ChatHistoryAllocator.field_e[var5Lifetime1]; var14++) {
            RisingBubble.field_c.drawTransparent((RisingBubble.field_c.field_A >> 1) * var14 + var12, -RisingBubble.field_c.field_B + (var13 + 4));
          }
        } else {
          var3.drawParagraph(TrigonometryHelpers.field_a, 30, 280, 580, 400, 0, -1, 1, 0, 30);
          if (ArrayWidgetContainer.isAccountUiActive((byte) 109)) {
            var6 = 280 + this.field_d >> 1;
            var4.drawCentered(ScoreMarkerDemo.field_h, 320, var6, 16777215, 0);
          }
        }
    }

    private final int achievementAt(int param0, int param1, int param2) {
        int var4;
        int var7;
        int var5;
        int var6;
        var7 = Pixelate.field_H ? 1 : 0;
        var4 = 0;
        if (param0 != 4) {
          return 126;
        }
        while (GameApplet.field_n.length > var4) {
          if (this.isAchievementVisible(var4, (byte) 95)) {
            var5 = this.getIconX(var4, (byte) -89);
            var6 = this.getIconY(124, var4);
            if (var5 < param1 &&
              var6 < param2 &&
              param1 < var5 + 32 &&
              param2 < var6 + 32) {
              return var4;
            }
          }
          var4++;
        }
        return -1;
    }

    final int getRowLeft(int param0, byte param1) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var3 = -40;
        int var4 = 0;
        int var4Lifetime1;
        if (param1 != 90) {
          field_q = 120;
        }
        while (this.field_g.field_h > var4) {
          var3 = var3 + (40 + this.getRowTextWidth(param1 - 207, var4));
          var4++;
        }
        var4Lifetime1 = 640 - var3 >> 1;
        for (var5 = 0; param0 > var5; var5++) {
          var4Lifetime1 = var4Lifetime1 + (this.getRowTextWidth(-118, var5) + 40);
        }
        return var4Lifetime1;
    }

    private final String getAchievementDescription(boolean param0, int param1) {
        if (!param0) {
          return (String) null;
        }
        if (param1 == 10 &&
          !this.isAchievementUnlocked((byte) 66, param1)) {
          return TransitionPhase.field_a;
        }
        return ClientException.field_a[param1];
    }

    final void onCancel(byte param0) {
        if (param0 >= -13) {
          return;
        }
        ScreenChangeHelpers.changeScreen(this.field_l, TickClock.field_a, false, -25528);
    }

    AchievementsScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final int getIconX(int param0, byte param1) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        var7 = Pixelate.field_H ? 1 : 0;
        if (16 > param0) {
          return 264 + 40 * (param0 % 8);
        }
        var3 = 40 * this.countUnlockedFrom(16);
        var4 = (-var3 + 320) / 2 + 264;
        var5 = 68 % ((39 - param1) / 56);
        for (var6 = 16; param0 > var6; var6++) {
          if (this.isAchievementUnlocked((byte) 66, var6)) {
            var4 += 40;
          }
        }
        return var4;
    }

    private final Sprite getAchievementIcon(byte param0, int param1) {
        if (this.isAchievementUnlocked((byte) 66, param1)) {
          return AchievementIconGlobals.field_c[param1];
        }
        if (AlternateNameCredentials.isOfflineOrAccountUi(param0 ^ 96) &&
          TwistedLogicBackground.field_p[param1]) {
          return MainScreenWidgetGlobals.field_i;
        }
        if (param0 == 37) {
          return ScorePopup.field_a;
        }
        return (Sprite) null;
    }

    private final boolean isAchievementUnlocked(byte param0, int param1) {
        if (param0 != 66) {
          field_o = -28;
        }
        return 0 < (1 << param1 & this.getUnlockedMask(-109)) ? true : false;
    }

    private final int getIconY(int param0, int param1) {
        int var4 = -118 / ((param0 - 91) / 33);
        int var3 = this.countUnlockedFrom(16) != 0 ? 130 : 150;
        return var3 + param1 / 8 * 40;
    }

    final void handleInput(byte param0) {
        super.handleInput((byte) -94);
        if (param0 > -64) {
          field_q = 92;
        }
        TwistedLogicCube.field_v = this.achievementAt(4, ProxyAuthenticationException.field_d, StatusBar.field_k);
        if (TwistedLogicCube.field_v != -1 &&
          IntrusiveDequeCursor.field_c == 1) {
          AchievementMaskRequest.playSoundEffect(128, -126);
          if (TwistedLogicCube.field_v == Cloud.field_j) {
            Cloud.field_j = -1;
          } else {
            Cloud.field_j = TwistedLogicCube.field_v;
          }
        }
    }

    final void handleNavigation(int param0) {
        if (param0 > -35) {
          return;
        }
        this.field_g.handleHorizontalNavigation(114, 0);
    }

    final static PieceTiming createPieceTiming(int param0, byte param1) {
        int var2 = -(param0 * 2) + 140;
        if (param1 < 26) {
          field_o = 88;
        }
        int var3 = 3 + JavaRandomHelpers.randomBelow(UiTheme.field_f, -124, 17);
        double var4 = (double)(param0 - 10) / 10.0 + 7.0;
        return new PieceTiming(var2, var3, TextDecodeHelpers.toFixedPoint(var4, 65536));
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          AchievementsScreen.createPieceTiming(3, (byte) 57);
        }
        field_p = null;
        field_r = null;
    }

    private final int getRowTextWidth(int param0, int param1) {
        if (param0 >= -107) {
          return 80;
        }
        return PieceTiming.field_e.textWidth(this.getRowLabel(param1, 7698)) + (0 == param1 ? MusicPatch.field_m.field_A : 0);
    }

    final void drawRow(byte param0, boolean param1, int param2) {
        String var4;
        Sprite stackIn_5_0 = null;
        Sprite var5;
        var4 = this.getRowLabel(param2, 7698);
        if (param2 == 1 &&
          this.field_k[param2] == 23) {
          stackIn_5_0 = StripedProgressBar.field_S;
        } else {
          stackIn_5_0 = StripedProgressBar.field_N;
        }
        var5 = stackIn_5_0;
        if (param2 == 0) {
          this.drawFooterButton(param1, var4, var5, -6, this.getRowLeft(0, (byte) 90) + this.getRowRight(0, false) >> 1);
        } else {
          super.drawLabeledRowButton(var4, param1, param2, var5, (byte) 124);
        }
        if (param0 > -116) {
          AchievementsScreen.createPieceTiming(40, (byte) -112);
        }
    }

    static {
        field_r = "Email: ";
    }
}
