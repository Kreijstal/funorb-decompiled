/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MatchResultScreen extends MenuScreen {
    static int[] field_w;
    static String field_r;
    static boolean field_u;
    static int field_t;
    static boolean field_s;
    static int[][] field_v;

    abstract int getResultBottom(int obfuscationGuard);

    final void layoutButtons(boolean obfuscationGuard) {
        int var7 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        MenuButton var8;
        int var9;
        int var4Lifetime1;
        int var5Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (sj.field_c == null) {
          return;
        }
        var2 = 1;
        var3 = nn.field_g.measureText(ag.buttonLabels[this.buttons[0].actionId]);
        if (this.isButtonEnabled((byte) 110, 1)) {
          var2++;
          for (var4 = 0; var4 < sj.field_c.length; var4++) {
            var5 = nn.field_g.measureText(sj.field_c[var4]);
            if (var5 > var3) {
              var3 = var5;
            }
          }
        }
        var3 += 20;
        if (!obfuscationGuard) {
          MatchResultScreen.g(102);
        }
        var4Lifetime1 = 5 * var2 - (5 - var2 * var3);
        var5Lifetime1 = (-var4Lifetime1 + 640) / 2;
        var6 = this.getResultButtonTop(6175);
        for (var7 = 0; var7 < this.buttons.length; var7++) {
          var8 = this.buttons[var7];
          var8.x = var7 * var3 + var5Lifetime1 + 5 * var7;
          var8.y = var6;
          if (0 == var7) {
            var8.x = var8.x - 5;
          }
          var8.width = var3;
          var8.height = this.getButtonHeight((byte) 115, var7);
        }
        return;
    }

    final void drawScreen(byte obfuscationGuard) {
        RgbSprite[] stackIn_27_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        IndexedSprite var5_ref_tp;
        int var6;
        int var7;
        int var8;
        int var9;
        RgbSprite var10;
        int var11;
        RgbSprite var12;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (null != ec.field_Q) {
          ec.field_Q.drawFullBackground(true, 0, 0, 0, 0);
        }
        Rasterizer2D.darkenRectangle(0, 0, 640, 480);
        gh.a(120, true);
        if (LevelMetadata.field_p) {
          var12 = qh.field_e;
          var12.drawTransparent((640 - var12.canvasWidth) / 2, 20);
        }
        var2 = -qp.field_e[0].canvasHeight + 480;
        var3 = this.getResultBottom(-6);
        for (var4 = 0; var4 < 3; var4++) {
          var5_ref_tp = qp.field_e[var4];
          var5_ref_tp.drawTransparent((640 - var5_ref_tp.canvasWidth) / 2, -((-var3 + 480) / ((1 + var4) * 2)) + var2);
        }
        if (obfuscationGuard > -14) {
          field_s = false;
        }
        var2 = var2 - (-var3 + 480) / 2;
        var4 = qp.field_e[0].canvasWidth;
        var5 = 0;
        var6 = 0;
        scanLoop1: while (true) {
          if (BitPacketBuffer.field_o.length > var6) {
            var7 = BitPacketBuffer.field_o[var6];
            if (0 <= var7) {
              var8 = 320;
              var9 = var2;
              if (sk.field_I != 2) {
                switch (var5) {
                  case 0:
                    var9 += 14;
                    break;
                  case 1:
                    var9 += 38;
                    var8 = var8 - (-10 + var4 / 3);
                    break;
                  case 2:
                    var8 = var8 + (var4 / 3 - 10);
                    var9 += 50;
                    break;
                  default:
                    break;
                }
              } else {
                if (var5 != 0) {
                  var9 += 35;
                  var8 = var8 - (var4 / 4 - 5);
                } else {
                  var9 += 14;
                  var8 = var8 + (-6 + var4 / 4);
                }
              }
              if (var5 != 0) {
                stackIn_27_0 = AchievementSubmission.field_q;
              } else {
                stackIn_27_0 = BrickMotionPath.field_r;
              }
              var10 = stackIn_27_0[ArchiveNetworkRequest.field_C[var7]];
              var10.drawTransparent(var8 - var10.canvasWidth / 2, var9 - var10.canvasHeight);
              ce.field_e.drawCentered(fh.field_h[var7], var8, var2 + 85, 0, -1);
              var5++;
              if (var5 == 3) {
                break scanLoop1;
              }
            }
            var6++;
            continue;
          }
          break;
        }
        this.a(0);
        DelayedPacket.d(0);
        return;
    }

    MatchResultScreen(int screenId, int[] actionIds) {
        super(screenId, 180, 460, 150, 35, actionIds);
    }

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        if (obfuscationGuard < 96) {
          this.getResultBottom(66);
        }
        super.onEnter(usePointer, initialSelection, 100);
        this.layoutButtons(true);
    }

    void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        if (obfuscationGuard != -120) {
          field_w = (int[]) null;
        }
        this.selection.navigateHorizontal(0, -1);
    }

    private final int getResultButtonTop(int obfuscationGuard) {
        if (obfuscationGuard != 6175) {
          return 116;
        }
        return (284 + this.getResultBottom(obfuscationGuard - 6181)) / 2;
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard > -52) {
          this.advanceScreen(false, false, -123);
        }
        super.advanceScreen(updateFlag, inputEnabled, -121);
        int var4 = this.getResultButtonTop(6175);
        for (var5 = 0; var5 < this.buttons.length; var5++) {
          this.buttons[var5].y = var4;
        }
    }

    public static void g(int param0) {
        if (param0 != -25617) {
          return;
        }
        field_r = null;
        field_w = null;
        field_v = (int[][]) null;
    }

    static {
        field_r = "Hotseat multiplayer game";
        field_s = true;
    }
}
