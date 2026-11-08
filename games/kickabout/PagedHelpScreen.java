/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PagedHelpScreen extends ButtonMenuScreen {
    static int field_A;
    static UiLayoutNode field_D;
    int pageIndex;
    static String field_B;

    final void showPreviousPage(byte param0) {
        if (param0 > -76) {
          this.pageIndex = 32;
        }
        this.pageIndex = this.pageIndex - 1;
        if (this.pageIndex < 0) {
          this.pageIndex = 0;
        }
        LoginKind.a((byte) -103);
    }

    final boolean isButtonVisible(int param0, byte param1) {
        if (this.buttons[param0].kind == 21 &&
          !this.hasPreviousPage((byte) -122)) {
          return false;
        }
        if (param1 != -95) {
          return true;
        }
        if (this.buttons[param0].kind == 22 &&
          !this.hasNextPage(false)) {
          return false;
        }
        return super.isButtonVisible(param0, (byte) -95);
    }

    boolean handleKey(int param0, int param1, char param2) {
        this.buttonSelection.handleArrowKeys(1, true);
        if (this.buttonSelection.selectedIndex >= 0 &&
          this.buttonSelection.c(-1)) {
          this.buttons[this.buttonSelection.selectedIndex].activate(-1, false);
          return true;
        }
        if (param1 >= -5) {
          field_D = (UiLayoutNode) null;
        }
        return super.handleKey(param0, -53, param2);
    }

    void drawScreen(int param0, boolean param1) {
        int var3_int = 0;
        int var4_int = 0;
        int var5_int = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var5_intLifetime1;
        int var6Lifetime1;
        super.drawScreen(param0, param1);
        if (!this.hasPreviousPage((byte) -120)) {
          var3_int = this.buttons[0].width;
          var4_int = this.buttons[0].height;
          var5_int = this.buttonCenterX(0, -22667) + (this.slideOffsetX - (var3_int >> 1));
          var6 = this.buttonCenterY(-124, 0) - (var4_int >> 1);
          SoftwareRasterizer.fillRoundedRectangleBlended(var5_int - 4, -4 + var6, 8 + var3_int, var4_int + 8, 10, 0, 128);
          SoftwareDrawingSupport.field_r[0][3].c(var5_int, var6);
        }
        if (!this.hasNextPage(false)) {
          var3_intLifetime1 = this.buttons[2].width;
          var4_intLifetime1 = this.buttons[2].height;
          var5_intLifetime1 = -(var3_intLifetime1 >> 1) + (this.buttonCenterX(2, param0 ^ 22670) + this.slideOffsetX);
          var6Lifetime1 = -(var4_intLifetime1 >> 1) + this.buttonCenterY(101, 2);
          SoftwareRasterizer.fillRoundedRectangleBlended(-4 + var5_intLifetime1, -4 + var6Lifetime1, 8 + var3_intLifetime1, var4_intLifetime1 + 8, 10, 0, 128);
          SoftwareDrawingSupport.field_c[0][3].c(var5_intLifetime1, var6Lifetime1);
        }
        SoftwareRasterizer.fillRoundedRectangleBlended(this.slideOffsetX + 15, 60, 610, 355, 10, 0, 128);
        String[] var7 = this.getPageTitles(true);
        String[] var3 = var7;
        String var4 = var7[this.pageIndex].toUpperCase();
        SoftwareRasterizer.fillRoundedRectangleBlended(this.slideOffsetX + 40, 76, 560, 36, 10, 65793, 140);
        ByteArrayPool.field_d.drawCentered(var4, this.slideOffsetX + 320, 101, 16777215, -1);
        String var5 = this.pageIndex + 1 + " / " + var7.length;
        ByteArrayPool.field_d.drawRightAligned(var5, 580 + this.slideOffsetX, 101, 16777215, -1);
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var4_int = param3.length();
          param3.setLength(param0);
          if (param2 != -11407) {
            field_B = (String) null;
          }
          for (var5 = var4_int; var5 < param0; var5++) {
            param3.setCharAt(var5, param1);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("dj.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void updateScreen(byte param0, boolean param1) {
        super.updateScreen((byte) 98, param1);
        int var3 = -34 / ((param0 - 38) / 60);
        if (this.buttonSelection.selectedIndex == 0 &&
          !this.hasPreviousPage((byte) -93)) {
          this.buttonSelection.selectIndex((byte) 68, 1);
        }
        if (this.buttonSelection.selectedIndex == 2 &&
          !this.hasNextPage(false)) {
          this.buttonSelection.selectIndex((byte) 68, 1);
        }
    }

    private final String[] getPageTitles(boolean param0) {
        if (this.screenId == 19) {
          return TextLayout.field_a;
        }
        if (20 == this.screenId) {
          return PlayerContextMenu.field_d;
        }
        if (!param0) {
          return (String[]) null;
        }
        if (this.screenId == 21) {
          return NamedValueEntry.field_g;
        }
        if (this.screenId == 22) {
          return AuctionListing.field_l;
        }
        return null;
    }

    final void showNextPage(int param0) {
        this.pageIndex = this.pageIndex + 1;
        int var2 = this.getPageTitles(true).length;
        if (this.pageIndex >= var2) {
          this.pageIndex = var2 - 1;
        }
        LoginKind.a((byte) 58);
        if (param0 != 21) {
          this.pageIndex = 21;
        }
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        super.enterScreen(param0, param1, param2);
        this.pageIndex = 0;
    }

    private final boolean hasNextPage(boolean param0) {
        if (this.pageIndex == -1 + this.getPageTitles(true).length) {
          return false;
        }
        if (param0) {
          this.updateScreen((byte) -54, true);
        }
        return true;
    }

    final int buttonCenterX(int param0, int param1) {
        boolean discarded$0 = false;
        if (param1 != -22667) {
          discarded$0 = this.hasPreviousPage((byte) 91);
        }
        return 320 + 70 * (-1 + param0);
    }

    public static void e(int param0) {
        field_B = null;
        field_D = null;
        if (param0 != -29104) {
          StringBuilder var2 = (StringBuilder) null;
          PagedHelpScreen.a(40, 'ﾄ', 84, (StringBuilder) null);
        }
    }

    private final boolean hasPreviousPage(byte param0) {
        if (param0 > -70) {
          this.pageIndex = -4;
        }
        if (0 == this.pageIndex) {
          return false;
        }
        return true;
    }

    PagedHelpScreen() {
    }

    final int buttonCenterY(int param0, int param1) {
        int var3 = -127 / ((param0 + 49) / 52);
        return 457;
    }

    static {
        field_A = -1;
        field_B = "You cannot join this game - it is in progress";
    }
}
