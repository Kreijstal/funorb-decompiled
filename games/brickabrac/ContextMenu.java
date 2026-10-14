/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenu extends UiComponent {
    private int borderInsetX;
    private int keyboardResult;
    private RgbSprite[] hoverFrameSprites;
    private int iconLabelGap;
    private int borderInsetY;
    private int itemHeight;
    static int[][] field_bc;
    private int itemInsetX;
    private AlignedIconLabel[] items;
    static String field_ac;
    private int itemCount;
    private int[] actionIds;
    static String field_Ub;
    static String field_Rb;
    private UiComponent itemStyle;
    private UiComponent emptyItemStyle;

    final static void a(int param0, byte param1, int param2) {
        LobbyGame var6 = null;
        LobbyGame var7 = null;
        BitPacketBuffer var4 = null;
        if (MenuSelection.field_i != param2) {
          var6 = (LobbyGame) (LevelResultSubmission.field_i.get((long)MenuSelection.field_i, -1));
          var7 = var6;
          if (var7 != null) {
            var7.playerNames = null;
          }
          MenuSelection.field_i = param2;
          var4 = k.outgoingPackets;
          var4.writeCipheredOpcode(-13413, param0);
          var4.writeByte(-29, 3);
          var4.writeByte(-127, 11);
          var4.writeShort((byte) 121, param2);
        }
        int var3 = 20 / ((55 - param1) / 62);
    }

    final void addAction(String text, int actionId, byte obfuscationGuard) {
        try {
          this.items[this.itemCount] = new AlignedIconLabel(0L, (UiComponent) null, (UiComponent) null, this.itemStyle, (RgbSprite) null, text);
          this.items[this.itemCount].activeFrameSprites = this.hoverFrameSprites;
          this.items[this.itemCount].useParentFrameBounds = true;
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(this.items[this.itemCount], 0);
          if (obfuscationGuard < 70) {
            this.items = (AlignedIconLabel[]) null;
          }
          this.actionIds[this.itemCount] = actionId;
          this.itemCount = this.itemCount + 1;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "br.C(" + (text != null ? "{...}" : "null") + ',' + actionId + ',' + obfuscationGuard + ')');
        }
    }

    final int updateAndPollAction(byte obfuscationGuard, boolean inputEnabled) {
        int itemIndex = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        this.updateRoot(inputEnabled, -15211);
        if (!inputEnabled) {
          return -2;
        }
        int guardDivision = -36 / ((obfuscationGuard - 13) / 63);
        for (itemIndex = 0; this.itemCount > itemIndex; itemIndex++) {
          if (this.items[itemIndex].pressedButton != 0) {
            return this.actionIds[itemIndex];
          }
        }
        if (BackgroundScene.pressedButton != 0) {
          return -1;
        }
        return this.keyboardResult;
    }

    final void addIconAction(String text, int obfuscationGuard, int actionId, RgbSprite sprite) {
        try {
          this.items[this.itemCount] = new AlignedIconLabel(0L, (UiComponent) null, (UiComponent) null, this.itemStyle, sprite, text);
          this.items[this.itemCount].activeFrameSprites = this.hoverFrameSprites;
          this.items[this.itemCount].useParentFrameBounds = true;
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(this.items[this.itemCount], 0);
          this.actionIds[this.itemCount] = actionId;
          this.itemCount = this.itemCount + 1;
          if (obfuscationGuard < 62) {
            this.borderInsetX = -95;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "br.H(" + (text != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + actionId + ',' + (sprite != null ? "{...}" : "null") + ')');
        }
    }

    ContextMenu(ContextMenu styleTemplate) {
        this(styleTemplate, styleTemplate.hoverFrameSprites, styleTemplate.emptyItemStyle, styleTemplate.itemStyle, styleTemplate.borderInsetX, styleTemplate.itemInsetX, styleTemplate.iconLabelGap, styleTemplate.borderInsetY, styleTemplate.itemHeight);
    }

    public static void h(int param0) {
        field_Ub = null;
        if (param0 < 20) {
          return;
        }
        field_bc = (int[][]) null;
        field_Rb = null;
        field_ac = null;
    }

    final static int choosePopupY(int popupHeight, int anchorY, int anchorHeight, int obfuscationGuard) {
        int guardDivision = 33 % ((obfuscationGuard - 75) / 45);
        if (Rasterizer2D.height >= anchorY + anchorHeight + popupHeight) {
          return anchorY + anchorHeight;
        }
        if (0 <= anchorY - popupHeight) {
          return anchorY - popupHeight;
        }
        return Rasterizer2D.height - popupHeight;
    }

    ContextMenu(UiComponent styleTemplate, RgbSprite[] hoverFrameSprites, UiComponent emptyItemStyle, UiComponent itemStyle, int borderInsetX, int itemInsetX, int iconLabelGap, int borderInsetY, int itemHeight) {
        super(0L, styleTemplate);
        this.items = new AlignedIconLabel[256];
        this.keyboardResult = -2;
        this.actionIds = new int[256];
        try {
          this.emptyItemStyle = emptyItemStyle;
          this.itemInsetX = itemInsetX;
          this.itemHeight = itemHeight;
          this.borderInsetY = borderInsetY;
          this.itemStyle = itemStyle;
          this.hoverFrameSprites = hoverFrameSprites;
          this.iconLabelGap = iconLabelGap;
          this.borderInsetX = borderInsetX;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "br.<init>(" + (styleTemplate != null ? "{...}" : "null") + ',' + (hoverFrameSprites != null ? "{...}" : "null") + ',' + (emptyItemStyle != null ? "{...}" : "null") + ',' + (itemStyle != null ? "{...}" : "null") + ',' + borderInsetX + ',' + itemInsetX + ',' + iconLabelGap + ',' + borderInsetY + ',' + itemHeight + ')');
        }
    }

    final boolean handleCancelKey(int obfuscationGuard) {
        int cancelGuardDivision = 0;
        int guardDivision;
        if (-2 != this.keyboardResult) {
          return false;
        }
        if (MeshAttributeRecord.currentKeyCode == 13) {
          this.keyboardResult = -1;
          cancelGuardDivision = -81 % ((-25 - obfuscationGuard) / 41);
          return true;
        }
        guardDivision = -81 % ((-25 - obfuscationGuard) / 41);
        return true;
    }

    final void layoutAtAnchor(int anchorY, int obfuscationGuard, int anchorHeight, int anchorWidth, int anchorX) {
        int menuWidth;
        int itemIndex;
        int itemWidth;
        int unusedGameFlag;
        int menuY;
        int positionedItemIndex;
        int emptyMenuWidth;
        int emptyItemIndexOrMenuHeight;
        int emptyItemWidthOrMenuX;
        int emptyMenuY;
        int emptyPositionedItemIndex;
        int noncanonicalItemIndex;
        int noncanonicalMenuHeight;
        int noncanonicalItemWidth;
        int noncanonicalMenuX;
        int noncanonicalMenuY;
        int noncanonicalPositionedItemIndex;
        int menuHeight;
        int menuX;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (this.itemCount != 0) {
          menuWidth = 0;
          if (obfuscationGuard < -49) {
            for (itemIndex = 0; this.itemCount > itemIndex; itemIndex++) {
              itemWidth = this.items[itemIndex].measureIconLabelWidth(this.iconLabelGap, 24, this.itemInsetX);
              if (menuWidth < itemWidth) {
                menuWidth = itemWidth;
              }
            }
            menuWidth = menuWidth + this.borderInsetX * 2;
            menuHeight = this.itemHeight * this.itemCount + this.borderInsetY + this.borderInsetY;
            menuX = OptionsScreen.choosePopupX(-1, menuWidth, anchorX, anchorWidth);
            menuY = ContextMenu.choosePopupY(menuHeight, anchorY, anchorHeight, 122);
            this.setBounds(menuHeight, menuY, menuX, menuWidth, (byte) 64);
            for (positionedItemIndex = 0; positionedItemIndex < this.itemCount; positionedItemIndex++) {
              this.items[positionedItemIndex].setIconLabelBounds(-10411, this.itemHeight * positionedItemIndex + this.borderInsetY, this.itemInsetX, this.iconLabelGap, this.borderInsetX, this.itemHeight, menuWidth - 2 * this.borderInsetX);
            }
            return;
          }
          this.itemHeight = -94;
          for (noncanonicalItemIndex = 0; this.itemCount > noncanonicalItemIndex; noncanonicalItemIndex++) {
            noncanonicalItemWidth = this.items[noncanonicalItemIndex].measureIconLabelWidth(this.iconLabelGap, 24, this.itemInsetX);
            if (menuWidth < noncanonicalItemWidth) {
              menuWidth = noncanonicalItemWidth;
            }
          }
          menuWidth = menuWidth + this.borderInsetX * 2;
          noncanonicalMenuHeight = this.itemHeight * this.itemCount + this.borderInsetY + this.borderInsetY;
          noncanonicalMenuX = OptionsScreen.choosePopupX(-1, menuWidth, anchorX, anchorWidth);
          noncanonicalMenuY = ContextMenu.choosePopupY(noncanonicalMenuHeight, anchorY, anchorHeight, 122);
          this.setBounds(noncanonicalMenuHeight, noncanonicalMenuY, noncanonicalMenuX, menuWidth, (byte) 64);
          for (noncanonicalPositionedItemIndex = 0; noncanonicalPositionedItemIndex < this.itemCount; noncanonicalPositionedItemIndex++) {
            this.items[noncanonicalPositionedItemIndex].setIconLabelBounds(-10411, this.itemHeight * noncanonicalPositionedItemIndex + this.borderInsetY, this.itemInsetX, this.iconLabelGap, this.borderInsetX, this.itemHeight, menuWidth - 2 * this.borderInsetX);
          }
          return;
        }
        this.items[this.itemCount] = new AlignedIconLabel(0L, (UiComponent) null, (UiComponent) null, this.emptyItemStyle, (RgbSprite) null, gg.field_m);
        this.items[this.itemCount].verticalAlignment = 1;
        this.addChild(this.items[this.itemCount], 0);
        this.actionIds[this.itemCount] = -1;
        this.itemCount = this.itemCount + 1;
        emptyMenuWidth = 0;
        if (obfuscationGuard < -49) {
          for (emptyItemIndexOrMenuHeight = 0; this.itemCount > emptyItemIndexOrMenuHeight; emptyItemIndexOrMenuHeight++) {
            emptyItemWidthOrMenuX = this.items[emptyItemIndexOrMenuHeight].measureIconLabelWidth(this.iconLabelGap, 24, this.itemInsetX);
            if (emptyMenuWidth < emptyItemWidthOrMenuX) {
              emptyMenuWidth = emptyItemWidthOrMenuX;
            }
          }
          emptyMenuWidth = emptyMenuWidth + this.borderInsetX * 2;
          emptyItemIndexOrMenuHeight = this.itemHeight * this.itemCount + this.borderInsetY + this.borderInsetY;
          emptyItemWidthOrMenuX = OptionsScreen.choosePopupX(-1, emptyMenuWidth, anchorX, anchorWidth);
          emptyMenuY = ContextMenu.choosePopupY(emptyItemIndexOrMenuHeight, anchorY, anchorHeight, 122);
          this.setBounds(emptyItemIndexOrMenuHeight, emptyMenuY, emptyItemWidthOrMenuX, emptyMenuWidth, (byte) 64);
          for (emptyPositionedItemIndex = 0; emptyPositionedItemIndex < this.itemCount; emptyPositionedItemIndex++) {
            this.items[emptyPositionedItemIndex].setIconLabelBounds(-10411, this.itemHeight * emptyPositionedItemIndex + this.borderInsetY, this.itemInsetX, this.iconLabelGap, this.borderInsetX, this.itemHeight, emptyMenuWidth - 2 * this.borderInsetX);
          }
        } else {
          this.itemHeight = -94;
          for (emptyItemIndexOrMenuHeight = 0; this.itemCount > emptyItemIndexOrMenuHeight; emptyItemIndexOrMenuHeight++) {
            emptyItemWidthOrMenuX = this.items[emptyItemIndexOrMenuHeight].measureIconLabelWidth(this.iconLabelGap, 24, this.itemInsetX);
            if (emptyMenuWidth < emptyItemWidthOrMenuX) {
              emptyMenuWidth = emptyItemWidthOrMenuX;
            }
          }
          emptyMenuWidth = emptyMenuWidth + this.borderInsetX * 2;
          emptyItemIndexOrMenuHeight = this.itemHeight * this.itemCount + this.borderInsetY + this.borderInsetY;
          emptyItemWidthOrMenuX = OptionsScreen.choosePopupX(-1, emptyMenuWidth, anchorX, anchorWidth);
          emptyMenuY = ContextMenu.choosePopupY(emptyItemIndexOrMenuHeight, anchorY, anchorHeight, 122);
          this.setBounds(emptyItemIndexOrMenuHeight, emptyMenuY, emptyItemWidthOrMenuX, emptyMenuWidth, (byte) 64);
          for (emptyPositionedItemIndex = 0; emptyPositionedItemIndex < this.itemCount; emptyPositionedItemIndex++) {
            this.items[emptyPositionedItemIndex].setIconLabelBounds(-10411, this.itemHeight * emptyPositionedItemIndex + this.borderInsetY, this.itemInsetX, this.iconLabelGap, this.borderInsetX, this.itemHeight, emptyMenuWidth - 2 * this.borderInsetX);
          }
        }
    }

    static {
        field_ac = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Ub = "To report a player, right-click on their name and select the option to report abuse.";
        field_Rb = "Breaking real-world laws";
    }
}
