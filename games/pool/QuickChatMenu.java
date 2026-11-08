/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenu extends UiComponent {
    private int itemCount;
    private int[] messageIds;
    private int contentWidth;
    private char[] shortcuts;
    static String[] field_Sb;
    private QuickChatMenu[] submenus;
    private AlignedIconLabel[] items;
    private int preferredHeight;
    static Sprite field_Rb;
    static String playerYouX2AreOfferingDraw;
    private int menuWidth;
    static String[] ungoodShot;
    private int animationAnchorY;
    static int[] field_Yb;
    static int[][] field_gc;
    private int rowHeight;
    static ResourceArchive field_Zb;
    private int selectedItem;
    private QuickChatMenu openSubmenu;
    private int remainingExpansionTicks;
    static String loginUsername;
    static BitmapFont field_ec;

    final void processPressedItems(byte param0, int param1, int param2) {
        int var4_int = 0;
        AlignedIconLabel var5;
        AlignedIconLabel stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        QuickChatMenu var4;
        QuickChatMenu var6;
        for (var4_int = 0; var4_int < this.items.length; var4_int++) {
          var5 = this.items[var4_int];
          if (var5.pressedButton == 1) {
            this.activateItem(var4_int, false, param2, param1);
            stackIn_7_0 = var5;
            stackIn_8_1 = (var4_int == this.selectedItem);
            stackIn_7_0.selected = stackIn_8_1;
          }
        }
        if (param0 != 86) {
          this.handleShortcutKey(77, 52, -4);
        }
        if (this.selectedItem != -1) {
          var6 = this.submenus[this.selectedItem];
          var4 = var6;
          if (var4 != null) {
            var6.processPressedItems((byte) 86, param1, param2);
          }
        }
        if (this.remainingExpansionTicks > 0) {
          this.setExpansionTicks(-105, -1 + this.remainingExpansionTicks);
        }
    }

    final void resetSelection(int param0) {
        int var3 = 0;
        AlignedIconLabel var4 = null;
        if (param0 != 17517) {
          this.handleShortcutKey(45, 22, -51);
        }
        AlignedIconLabel[] var5 = this.items;
        AlignedIconLabel[] var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
          var4 = var5[var3];
          var4.pressedButton = 0;
          var4.selected = false;
        }
        if (null != this.openSubmenu) {
          this.openSubmenu.resetSelection(17517);
          this.openSubmenu.unlink((byte) -117);
        }
        this.openSubmenu = null;
        this.selectedItem = -1;
        this.setExpansionTicks(-100, 12);
    }

    final int getOpenChainWidth(int param0) {
        if (param0 != -1) {
          this.itemCount = 11;
        }
        return this.menuWidth + (null != this.openSubmenu ? this.openSubmenu.getOpenChainWidth(-1) : 0);
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (0 > param2) {
          return false;
        }
        if (param2 > 11) {
          return false;
        }
        if (param3 >= 1 &&
          TutorialController.a(param2, param1, 1) >= param3) {
          if (param0 <= 103) {
            playerYouX2AreOfferingDraw = (String) null;
          }
          return true;
        }
        return false;
    }

    final boolean handleShortcutKey(int param0, int param1, int param2) {
        int var6 = 0;
        int var4 = IterableDualLinkDeque.field_a == 85 ? 1 : 0;
        if (this.openSubmenu != null) {
          if (var4 != 0 &&
            this.openSubmenu.selectedItem == -1) {
            this.resetSelection(17517);
            this.setExpansionTicks(-84, 0);
            return true;
          }
          return this.openSubmenu.handleShortcutKey(param0, param1, param2 + 0);
        }
        if (this.openSubmenu == null &&
          LobbyPlayer.field_Ub == this &&
          var4 != 0) {
          DialogLayer.i(15975);
          return true;
        }
        int var5 = LoginMethod.field_b;
        if (var5 > 0) {
          if (var5 == ArchiveLoadStep.keycharTheCharacterUnderQuestionmark) {
            var5 = 63;
          }
          for (var6 = 0; var6 < this.shortcuts.length; var6++) {
            if (var5 == this.shortcuts[var6]) {
              this.activateItem(var6, false, param0, param1);
              return true;
            }
          }
        }
        if (param2 != 85) {
          return false;
        }
        return false;
    }

    private final void setExpansionTicks(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        this.remainingExpansionTicks = param1;
        if (param0 >= -78) {
          return;
        }
        for (var5 = 0; this.itemCount > var5; var5++) {
          var4 = this.remainingExpansionTicks * this.remainingExpansionTicks;
          var3 = var5 * this.rowHeight;
          this.items[var5].localY = (var4 * (this.animationAnchorY - this.screenY) + var3 * (-var4 + 144)) / 144;
        }
    }

    final void layoutMenuChain(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7;
        int var8;
        int var7Lifetime1;
        this.menuWidth = param1 * 2 + this.contentWidth;
        this.setBounds(param4 - this.preferredHeight, 2147483647, param2, this.menuWidth, this.preferredHeight);
        if (param5 != this.animationAnchorY) {
          this.animationAnchorY = param5;
          this.setExpansionTicks(-95, this.remainingExpansionTicks);
        }
        var7 = 0;
        if (param3 < 125) {
          this.processPressedItems((byte) -95, -61, 32);
        }
        while (var7 < this.itemCount) {
          this.items[var7].setIconLabelBounds(0, true, param1, this.rowHeight, param0, this.menuWidth, this.items[var7].localY);
          var7++;
        }
        if (this.selectedItem != -1 &&
          null != this.submenus[this.selectedItem]) {
          var7Lifetime1 = this.submenus[this.selectedItem].itemCount;
          for (var8 = this.localY + this.rowHeight * (var7Lifetime1 + this.selectedItem); var8 > param4; var8 = var8 - this.rowHeight) {
          }
          this.submenus[this.selectedItem].layoutMenuChain(param0, param1, this.menuWidth + param2, (byte) 126, var8, this.items[this.selectedItem].screenY);
        }
    }

    private final void activateItem(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        String var7;
        if (param1) {
          return;
        }
        if (this.selectedItem != param0) {
          if (null != this.submenus[param0]) {
            this.resetSelection(17517);
            this.setExpansionTicks(-124, 0);
            this.selectedItem = param0;
            this.openSubmenu = this.submenus[this.selectedItem];
            UsernameSuggestionSupport.attachQuickChatMenu(this.openSubmenu, 0);
            this.openSubmenu.setExpansionTicks(-84, 12);
          } else {
            if (-1 != this.messageIds[param0]) {
              var5 = this.messageIds[param0] | 32768;
              var6 = CookieDateSupport.field_b;
              if (var6 == 0 &&
                null != HighscoresScreen.field_L) {
                var6 = 1;
              }
              if (LobbyPanelLayoutSupport.a(5, var6) == 2) {
                TextInputPainter.a(1, var6, param2, (byte) -89);
              }
              var7 = (String) null;
              AlternateLongAndTextLoginPayload.a((byte) 117, (String) null, param3, ArrayWidgetGroup.field_I, CookieDateSupport.field_b, var5);
              Bzip2DecoderState.a(var5, ArrayWidgetGroup.field_I, CookieDateSupport.field_b, (byte) -76, QuickChatMenuSupport.field_d);
              DialogLayer.i(15975);
              InputIdleSupport.resetInputIdleTimer(false);
            } else {
              ClassicBallSkin.createQuickChatHelpDialog(1);
              DialogLayer.i(15975);
            }
          }
        } else {
          this.resetSelection(17517);
          this.setExpansionTicks(-102, 0);
        }
    }

    public static void releaseStatics(int param0) {
        field_Sb = null;
        field_Yb = null;
        playerYouX2AreOfferingDraw = null;
        loginUsername = null;
        field_Zb = null;
        if (param0 >= -103) {
          QuickChatMenu.releaseStatics(78);
        }
        field_Rb = null;
        field_gc = (int[][]) null;
        ungoodShot = null;
        field_ec = null;
    }

    final boolean hasPressedItem(int param0) {
        int var4 = 0;
        AlignedIconLabel var5 = null;
        int var2 = 0;
        AlignedIconLabel[] var3 = this.items;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          var2 = var2 | (var5.pressedButton != 0 ? 1 : 0);
        }
        if (var2 == 0 && -1 != this.selectedItem &&
          this.submenus[this.selectedItem] != null) {
          var2 = this.submenus[this.selectedItem].hasPressedItem(-1) ? 1 : 0;
        }
        if (param0 != -1) {
          this.selectedItem = -79;
        }
        return var2 != 0;
    }

    QuickChatMenu(long param0, UiComponent param1, UiComponent param2, UiComponent param3, QuickChatMenu[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        BitmapFont var17 = null;
        BitmapFont var18 = null;
        this.selectedItem = -1;
        try {
          this.submenus = param4;
          this.shortcuts = param7;
          this.messageIds = param5;
          this.itemCount = this.messageIds.length;
          var17 = param3.font;
          var18 = var17;
          this.rowHeight = var18.maxAscent + 2 + var18.maxDescent;
          this.contentWidth = 0;
          this.items = new AlignedIconLabel[this.itemCount];
          this.preferredHeight = this.itemCount * this.rowHeight;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.itemCount > var13; var13++) {
            if (this.shortcuts[var13] > 0) {
              param6[var13] = var11 + ShotRecord.charToString(false, this.shortcuts[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.submenus[var13] != null ||
              this.messageIds[var13] == -1) {
              var14 = StartupInterfaceSupport.field_c;
            }
            this.items[var13] = new AlignedIconLabel(0L, param2, (UiComponent) null, param3, (Sprite) (var14), param6[var13]);
            this.addChild(-126, this.items[var13]);
            var15 = var17.stringWidth(param6[var13]);
            if (var15 > this.contentWidth) {
              this.contentWidth = var15;
            }
          }
          this.contentWidth = this.contentWidth + (StartupInterfaceSupport.field_c.field_w + 10);
          this.setExpansionTicks(-88, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("qp.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        playerYouX2AreOfferingDraw = "You and <%0> want to draw.";
        ungoodShot = new String[]{"Uh-oh!", "Too bad!", "Whoops!"};
        loginUsername = "Username: ";
    }
}
