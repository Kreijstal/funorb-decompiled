/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MainMenuScreen extends ButtonMenuScreen {
    private UiLayoutNode field_B;
    static BitmapFont field_F;
    static Sprite field_C;
    private int field_E;
    static String field_G;
    static String[] field_D;

    final void buildWidgets(int param0) {
        this.field_B = eo.a("", 7126504, un.field_d, -1, false);
        if (param0 != -38) {
          this.field_B = (UiLayoutNode) null;
        }
    }

    final static void a(int param0, int param1, CommonGame param2, boolean param3) {
        try {
          RegistrationRequestDialog.field_kb = param1;
          NotCommand.field_F = param2;
          wp.field_c = param0;
          if (!param3) {
            MainMenuScreen.isScreenShown(20, -118);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "sf.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void layoutQuickPlayWidget(int param0) {
        if (param0 == 20378) {
          this.field_B.a(true, this.field_B.field_q, -180 + f.field_d, 50 + (ReceivedAuctionItem.field_B >> 1), this.field_B.field_mb);
          return;
        }
        AppScreen var3 = (AppScreen) null;
        this.setTransitionProgress(59, false, 46, (AppScreen) null);
        this.field_B.a(true, this.field_B.field_q, -180 + f.field_d, 50 + (ReceivedAuctionItem.field_B >> 1), this.field_B.field_mb);
    }

    final void drawOverlay(boolean param0, int param1) {
        if (param1 < 99) {
          this.field_B = (UiLayoutNode) null;
          super.drawOverlay(param0, 110);
          SoftwareRasterizer.a(this.field_B.field_F - 10, this.field_B.field_T - 20, 20 + this.field_B.field_q, 100 + this.field_B.field_mb, 8, 65793, this.field_E >> 1);
          this.field_B.a(76, param0);
          un.field_d.c(sk.field_b, this.field_B.field_F + (this.field_B.field_q >> 1), (this.field_B.field_mb >> 1) + (this.field_B.field_T - 28), 16777215, -1, this.field_E);
          un.field_d.c(TextFieldValidator.field_e.toUpperCase(), (this.field_B.field_q >> 1) + this.field_B.field_F, 6 + this.field_B.field_T + (this.field_B.field_mb >> 1), 16777215, -1, this.field_E);
          un.field_d.a(ri.field_v.toLowerCase(), this.field_B.field_F, this.field_B.field_mb + this.field_B.field_T, this.field_B.field_q, 80, 16777215, -1, this.field_E, 1, 1, 0);
          if (!GameLoopApplet.field_E.field_J[0]) {
            SoftwareRasterizer.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> 1);
            return;
          }
          if (PlayArea.a(100)) {
            SoftwareRasterizer.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> 1);
            return;
          }
          return;
        }
        super.drawOverlay(param0, 110);
        SoftwareRasterizer.a(this.field_B.field_F - 10, this.field_B.field_T - 20, 20 + this.field_B.field_q, 100 + this.field_B.field_mb, 8, 65793, this.field_E >> 1);
        this.field_B.a(76, param0);
        un.field_d.c(sk.field_b, this.field_B.field_F + (this.field_B.field_q >> 1), (this.field_B.field_mb >> 1) + (this.field_B.field_T - 28), 16777215, -1, this.field_E);
        un.field_d.c(TextFieldValidator.field_e.toUpperCase(), (this.field_B.field_q >> 1) + this.field_B.field_F, 6 + this.field_B.field_T + (this.field_B.field_mb >> 1), 16777215, -1, this.field_E);
        un.field_d.a(ri.field_v.toLowerCase(), this.field_B.field_F, this.field_B.field_mb + this.field_B.field_T, this.field_B.field_q, 80, 16777215, -1, this.field_E, 1, 1, 0);
        if (!GameLoopApplet.field_E.field_J[0]) {
          SoftwareRasterizer.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> 1);
          return;
        }
        if (PlayArea.a(100)) {
          SoftwareRasterizer.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> 1);
          return;
        }
    }

    final boolean handleKey(int param0, int param1, char param2) {
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = Kickabout.field_G;
        if (param1 >= -5) {
          return false;
        }
        var4 = this.buttonSelection.selectedIndex;
        if (param0 == 99) {
          var5 = 1 + var4;
          if (var4 == 3) {
            var5 = 5;
          }
          if (4 == var4) {
            var5 = 6;
          }
          if (var4 == 5) {
            var5 = 0;
          }
          if (6 == var4) {
            var5 = 0;
          }
          if (var5 < 0) {
            var5 = 0;
          }
          this.buttonSelection.selectIndex((byte) 68, var5);
          return true;
        }
        if (98 == param0) {
          var5Lifetime1 = -1 + var4;
          if (var4 == 0) {
            var5Lifetime1 = 5;
          }
          if (var4 == 4) {
            var5Lifetime1 = 2;
          }
          if (var4 == 5) {
            var5Lifetime1 = 3;
          }
          if (var4 == 6) {
            var5Lifetime1 = 4;
          }
          if (var5Lifetime1 < 0) {
            var5Lifetime1 = 6;
          }
          this.buttonSelection.selectIndex((byte) 68, var5Lifetime1);
          return true;
        }
        if (param0 == 97) {
          var5Lifetime2 = var4;
          if (3 == var4) {
            var5Lifetime2 = 4;
          }
          if (4 == var4) {
            var5Lifetime2 = 3;
          }
          if (var4 == 5) {
            var5Lifetime2 = 6;
          }
          if (var4 == 6) {
            var5Lifetime2 = 5;
          }
          if (var5Lifetime2 < 0) {
            var5Lifetime2 = 6;
          }
          this.buttonSelection.selectIndex((byte) 68, var5Lifetime2);
          return true;
        }
        if (param0 != 96) {
          this.buttonSelection.b(-99);
          if (this.buttonSelection.selectedIndex < 0) {
            return true;
          }
          if (!this.buttonSelection.c(-1)) {
            return true;
          }
          this.buttons[this.buttonSelection.selectedIndex].activate(-1, false);
          return true;
        }
        var5Lifetime3 = var4;
        if (3 == var4) {
          var5Lifetime3 = 4;
        }
        if (4 == var4) {
          var5Lifetime3 = 3;
        }
        if (var4 == 5) {
          var5Lifetime3 = 6;
        }
        if (var4 == 6) {
          var5Lifetime3 = 5;
        }
        if (var5Lifetime3 < 0) {
          var5Lifetime3 = 6;
        }
        this.buttonSelection.selectIndex((byte) 68, var5Lifetime3);
        return true;
    }

    final static boolean isScreenShown(int param0, int param1) {
        if (param1 != -1) {
          return true;
        }
        if (param0 == AuctionLogEntry.field_h.screenId) {
          if (GameModesHelpScreen.field_G == null) {
            return true;
          }
          if (GameModesHelpScreen.field_G == null) {
            return false;
          }
          if (GameModesHelpScreen.field_G.screenId == param0) {
            return true;
          }
          return false;
        }
        if (GameModesHelpScreen.field_G == null) {
          return false;
        }
        if (GameModesHelpScreen.field_G.screenId != param0) {
          return false;
        }
        return true;
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        super.enterScreen(param0, param1, param2);
        this.layoutQuickPlayWidget(param0 ^ 20378);
    }

    final int buttonCenterX(int param0, int param1) {
        int var3 = -this.buttons[param0].width + this.buttons[0].width >> 1;
        if (param1 != -22667) {
          this.drawOverlay(false, 58);
          if (3 == param0) {
            return -var3 + 190;
          }
          if (param0 == 5) {
            return -var3 + 190;
          }
          if (param0 == 4) {
            return 190 + var3;
          }
          if (param0 != 6) {
            return 190;
          }
          return 190 + var3;
        }
        if (3 == param0) {
          return -var3 + 190;
        }
        if (param0 == 5) {
          return -var3 + 190;
        }
        if (param0 == 4) {
          return 190 + var3;
        }
        if (param0 != 6) {
          return 190;
        }
        return 190 + var3;
    }

    public static void releaseStatics(int param0) {
        field_F = null;
        field_C = null;
        if (param0 == 90) {
          field_G = null;
          field_D = null;
          return;
        }
        field_D = (String[]) null;
        field_G = null;
        field_D = null;
    }

    final void updateScreen(byte param0, boolean param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Kickabout.field_G;
        super.updateScreen((byte) 123, param1);
        this.field_B.b(0, param1);
        if (!GameLoopApplet.field_E.field_J[0]) {
          this.field_B.field_gb = false;
          var3 = 46 % ((param0 - 38) / 60);
          if (this.field_B.field_sb != 1) {
            return;
          }
          ii.a((byte) -117);
          if (PlayArea.a(100)) {
            ButtonMenuScreen.a(16144);
          } else {
            if (!GameLoopApplet.field_E.field_J[0]) {
              tb.a((byte) 126, 40);
            } else {
              if (!GameLoopApplet.field_E.d((byte) 116)) {
                tb.a((byte) 126, 5);
              } else {
                or.field_d.b(90, (byte) 93);
                DelayedServerPacket.a(26, true, -2);
              }
            }
          }
          return;
        }
        if (PlayArea.a(100)) {
          this.field_B.field_gb = false;
        }
        var3Lifetime1 = 46 % ((param0 - 38) / 60);
        if (this.field_B.field_sb != 1) {
          return;
        }
        ii.a((byte) -117);
        if (PlayArea.a(100)) {
          ButtonMenuScreen.a(16144);
        } else {
          if (!GameLoopApplet.field_E.field_J[0]) {
            tb.a((byte) 126, 40);
          } else {
            if (!GameLoopApplet.field_E.d((byte) 116)) {
              tb.a((byte) 126, 5);
            } else {
              or.field_d.b(90, (byte) 93);
              DelayedServerPacket.a(26, true, -2);
            }
          }
        }
    }

    final int buttonCenterY(int param0, int param1) {
        int var3 = -79 % ((-49 - param0) / 52);
        if (param1 > 3) {
          param1--;
        }
        if (4 >= param1) {
          return super.buttonCenterY(79, param1);
        }
        param1--;
        return super.buttonCenterY(79, param1);
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != -5974) {
            field_D = (String[]) null;
          }
          var3_int = 0;
          while (0 < param2) {
            var3_int = var3_int << 1 | 1 & param1;
            param1 = param1 >>> 1;
            param2--;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var3), "sf.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    MainMenuScreen() {
        this.field_E = 0;
    }

    final void setTransitionProgress(int param0, boolean param1, int param2, AppScreen param3) {
        try {
          super.setTransitionProgress(param0, param1, -96, param3);
          if (param2 >= -28) {
            field_C = (Sprite) null;
          }
          this.layoutQuickPlayWidget(20378);
          if (!param1) {
            this.field_E = 256 - (param0 << 1);
          } else {
            this.field_E = param0;
          }
          if (this.field_E > 256) {
            this.field_E = 256;
          }
          if (this.field_E < 0) {
            this.field_E = 0;
          }
          this.field_B.field_P = this.field_E;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "sf.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = new String[]{"Character", "Class", "Stats", "Trinkets", "Price"};
        field_G = "Enter name of friend to add to list";
    }
}
