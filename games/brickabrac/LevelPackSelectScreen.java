/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelPackSelectScreen extends MenuScreen {
    private LevelPackCard firstPackCard;
    static String field_x;
    static RgbSprite[] field_z;
    static RgbSprite field_r;
    static int[] field_v;
    private LevelPackCard secondPackCard;
    static int field_y;
    static int field_w;
    static boolean field_s;

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -120) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.selection.selectedIndex >= 0) {
          if (keyCode != 98 &&
            keyCode != 99) {
            if (keyCode == 96) {
              if (1 == this.selection.selectedIndex) {
                this.selection.setSelectedIndex(false, 2);
              } else {
                if ((this.selection.selectedIndex == 2)) {
                  this.selection.setSelectedIndex(false, 1);
                }
              }
            } else {
              if ((keyCode == 97)) {
                if (this.selection.selectedIndex == 2) {
                  this.selection.setSelectedIndex(false, 1);
                } else {
                  if ((this.selection.selectedIndex == 1)) {
                    this.selection.setSelectedIndex(false, 2);
                  }
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.selection.selectedIndex == 0) {
              this.selection.setSelectedIndex(false, 1);
            } else {
              this.selection.setSelectedIndex(false, 0);
            }
          }
        } else {
          this.selection.setSelectedIndex(false, 0);
        }

    }

    final boolean handleMenuAction(int buttonIndex, boolean inputFlag, byte obfuscationGuard) {
        int var4;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = this.buttons[buttonIndex].actionId;
        var5 = var4;
        if (var5 != 40) {
          if (var5 != 41) {
            return super.handleMenuAction(buttonIndex, inputFlag, (byte) 123);
          }
          if (this.selection.isActivated((byte) 113)) {
            ng.requestScreen(inputFlag, 54, 15);
          }
        } else {
          if (this.selection.isActivated((byte) 113)) {
            ng.requestScreen(inputFlag, obfuscationGuard - 54, 13);
          }
        }
        if (obfuscationGuard == 123) {
          return false;
        }
        field_x = (String) null;
        return false;
    }

    public static void f(int param0) {
        field_r = null;
        field_v = null;
        field_x = null;
        if (param0 != 14529) {
          field_z = (RgbSprite[]) null;
        }
        field_z = null;
    }

    final void layoutButtons(boolean obfuscationGuard) {
        int dupTemp$0 = 0;
        int var4 = 0;
        String stackIn_7_0 = null;
        int var2;
        int var3;
        MenuButton var5;
        String var5_ref;
        int var6;
        MenuButton var7;
        MenuButton var8;
        MenuButton var9;
        String var10;
        MenuButton var11;
        MenuButton var12;
        int var3Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (!obfuscationGuard) {
          return;
        }
        var2 = 0;
        for (var3 = 0; 1 > var3; var3++) {
          var7 = this.buttons[var3];
          var9 = var7;
          if (var9.actionId == 8) {
            stackIn_7_0 = this.e((byte) 81);
          } else {
            stackIn_7_0 = ag.buttonLabels[var7.actionId];
          }
          var10 = stackIn_7_0;
          var5_ref = var10;
          dupTemp$0 = nn.field_g.measureText(var10) + 30;
          var9.width = dupTemp$0;
          var2 = var2 + dupTemp$0;
          if (var3 > 0) {
            var2 += 10;
          }
        }
        var3Lifetime1 = (640 - var2) / 2;
        for (var4 = 0; var4 < 1; var4++) {
          var11 = this.buttons[var4];
          var11.x = var3Lifetime1;
          var11.y = this.getButtonTop(var4, 1);
          var11.height = this.getButtonHeight((byte) -112, var4);
          var3Lifetime1 = var3Lifetime1 + (var11.width + 10);
        }
        var8 = this.buttons[1];
        var12 = var8;
        var8.width = SaveResultsPromptScreen.packCardIcons[0].canvasWidth + 60;
        var12.height = var12.width;
        var12.x = (600 - 2 * var12.width) / 2;
        var12.y = (523 - var12.height) / 2;
        var5 = this.buttons[2];
        var5.y = var12.y;
        var5.height = var12.height;
        var5.x = 340;
        var5.width = var12.width;
        return;
    }

    LevelPackSelectScreen() {
        super(16, 180, 460, 402, 35, ag.field_L);
        this.firstPackCard = new LevelPackCard((MenuScreen) (this), this.buttons[1], 1, 0);
        this.secondPackCard = new LevelPackCard((MenuScreen) (this), this.buttons[2], 2, 1);
    }

    final void drawScreen(byte obfuscationGuard) {
        super.drawScreen((byte) -56);
        al.a(this.screenId, 19);
        GzipInflater.a(550, 5, 243, 5, 140, (byte) -91, 45);
        this.a(0);
        this.firstPackCard.draw((byte) 105);
        this.secondPackCard.draw((byte) 116);
        if (obfuscationGuard >= -14) {
          field_z = (RgbSprite[]) null;
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        super.advanceScreen(updateFlag, inputEnabled, -118);
        this.firstPackCard.updateFocus((byte) -75);
        this.secondPackCard.updateFocus((byte) -75);
        if (obfuscationGuard > -52) {
          field_r = (RgbSprite) null;
        }
    }

    static {
        field_x = "Message lobby";
        field_v = new int[4];
        field_y = 10;
        field_s = true;
    }
}
