/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextActionMenu extends ClientUiComponent {
    static df field_Qb;
    private IconTextComponent[] items;
    private int pendingResult;
    static int field_Wb;
    private int verticalPadding;
    static int[][] field_Vb;
    static String field_Jb;
    private RgbSprite[] matchedButtonSkin;
    private ClientUiComponent itemTextStyle;
    private ClientUiComponent emptyTextStyle;
    static String field_Ob;
    private int itemPadding;
    private int itemCount;
    private int iconTextGap;
    private int horizontalPadding;
    private int[] actionIds;
    private int rowHeight;

    final void addIconAction(boolean obfuscationGuard, String text, int actionId, RgbSprite icon) {
        try {
          if (obfuscationGuard) {
            this.isWaitingForAction((byte) 111);
          }
          this.items[this.itemCount] = new IconTextComponent(0L, (ClientUiComponent) null, (ClientUiComponent) null, this.itemTextStyle, icon, text);
          this.items[this.itemCount].matchedButtonSkinSprites = this.matchedButtonSkin;
          this.items[this.itemCount].drawSkinInParentBounds = true;
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(this.items[this.itemCount], 86);
          this.actionIds[this.itemCount] = actionId;
          this.itemCount = this.itemCount + 1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "np.E(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ',' + actionId + ',' + (icon != null ? "{...}" : "null") + ')');
        }
    }

    ContextActionMenu(ContextActionMenu style) {
        this(style, style.matchedButtonSkin, style.emptyTextStyle, style.itemTextStyle, style.horizontalPadding, style.itemPadding, style.iconTextGap, style.verticalPadding, style.rowHeight);
    }

    final static void a(boolean param0, byte param1) {
        if (!cd.c(9501)) {
          return;
        }
        if (param0) {
          SoftwareRaster.b(0, 0, SoftwareRaster.width, SoftwareRaster.height, 0, 192);
        }
        SphinxActionRequest.field_v.a(0, -118, 0);
        if (param1 >= -111) {
          ModelMesh var3 = (ModelMesh) null;
          ContextActionMenu.a(false, (ModelMesh) null);
        }
    }

    final boolean isWaitingForAction(byte obfuscationGuard) {
        if (obfuscationGuard < 59) {
          return false;
        }
        if (this.pendingResult != -2) {
          return false;
        }
        if (rs.field_q == 13) {
          this.pendingResult = -1;
          return true;
        }
        return true;
    }

    final static void openPublicQuickChat(int obfuscationGuard) {
        rs.outgoingChatChannel = 0;
        if (obfuscationGuard <= 63) {
          field_Jb = (String) null;
        }
        TrianglePulse.openDefaultQuickChatMenu((byte) 126);
    }

    final void layoutPopup(int anchorHeight, int anchorY, int anchorWidth, byte obfuscationGuard, int anchorX) {
        int itemIndex = 0;
        int popupWidth;
        int measurementIndex;
        int itemWidth;
        int popupY;
        int obfuscationControl;
        int popupHeight;
        int popupX;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.itemCount == 0) {
          this.items[this.itemCount] = new IconTextComponent(0L, (ClientUiComponent) null, (ClientUiComponent) null, this.emptyTextStyle, (RgbSprite) null, QuickChatCategory.field_F);
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(this.items[this.itemCount], 43);
          this.actionIds[this.itemCount] = -1;
          this.itemCount = this.itemCount + 1;
        }
        if (obfuscationGuard != -118) {
          return;
        }
        popupWidth = 0;
        for (measurementIndex = 0; measurementIndex < this.itemCount; measurementIndex++) {
          itemWidth = this.items[measurementIndex].measureRowWidth(obfuscationGuard ^ 35, this.iconTextGap, this.itemPadding);
          if (popupWidth < itemWidth) {
            popupWidth = itemWidth;
          }
        }
        popupWidth = popupWidth + 2 * this.horizontalPadding;
        popupHeight = this.verticalPadding + this.itemCount * this.rowHeight + this.verticalPadding;
        popupX = jp.a(anchorX, anchorWidth, popupWidth, -1);
        popupY = pd.a(popupHeight, 0, anchorY, anchorHeight);
        this.setBounds(popupHeight, -20500, popupWidth, popupY, popupX);
        for (itemIndex = 0; this.itemCount > itemIndex; itemIndex++) {
          this.items[itemIndex].setLayout(this.rowHeight, this.itemPadding, -30061, -(2 * this.horizontalPadding) + popupWidth, this.rowHeight * itemIndex + this.verticalPadding, this.horizontalPadding, this.iconTextGap);
        }
        return;
    }

    ContextActionMenu(ClientUiComponent style, RgbSprite[] matchedButtonSkin, ClientUiComponent emptyTextStyle, ClientUiComponent itemTextStyle, int horizontalPadding, int itemPadding, int iconTextGap, int verticalPadding, int rowHeight) {
        super(0L, style);
        this.items = new IconTextComponent[256];
        this.pendingResult = -2;
        this.actionIds = new int[256];
        try {
          this.horizontalPadding = horizontalPadding;
          this.emptyTextStyle = emptyTextStyle;
          this.itemPadding = itemPadding;
          this.matchedButtonSkin = matchedButtonSkin;
          this.iconTextGap = iconTextGap;
          this.rowHeight = rowHeight;
          this.verticalPadding = verticalPadding;
          this.itemTextStyle = itemTextStyle;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "np.<init>(" + (style != null ? "{...}" : "null") + ',' + (matchedButtonSkin != null ? "{...}" : "null") + ',' + (emptyTextStyle != null ? "{...}" : "null") + ',' + (itemTextStyle != null ? "{...}" : "null") + ',' + horizontalPadding + ',' + itemPadding + ',' + iconTextGap + ',' + verticalPadding + ',' + rowHeight + ')');
        }
    }

    public static void e(byte param0) {
        field_Qb = null;
        if (param0 != 5) {
          ContextActionMenu.openPublicQuickChat(-69);
        }
        field_Jb = null;
        field_Vb = (int[][]) null;
        field_Ob = null;
    }

    final void addTextAction(int actionId, String text, byte obfuscationGuard) {
        try {
          if (obfuscationGuard >= -98) {
            ContextActionMenu.openPublicQuickChat(-112);
          }
          this.items[this.itemCount] = new IconTextComponent(0L, (ClientUiComponent) null, (ClientUiComponent) null, this.itemTextStyle, (RgbSprite) null, text);
          this.items[this.itemCount].matchedButtonSkinSprites = this.matchedButtonSkin;
          this.items[this.itemCount].drawSkinInParentBounds = true;
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(this.items[this.itemCount], 55);
          this.actionIds[this.itemCount] = actionId;
          this.itemCount = this.itemCount + 1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "np.C(" + actionId + ',' + (text != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(boolean param0, ModelMesh param1) {
        int var2_int = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            ContextActionMenu.e((byte) 102);
          }
          for (var2_int = 0; var2_int < param1.vertexCount; var2_int++) {
            param1.verticesY[var2_int] = 0;
          }
          param1.field_R = MidiPcmStream.field_E;
          param1.field_Z = MidiPcmStream.field_E;
          param1.field_t = MidiPcmStream.field_E;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "np.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int pollAction(byte obfuscationGuard, boolean enableCapture) {
        int itemIndex;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.updateInput(true, enableCapture);
        if (!enableCapture) {
          return -2;
        }
        itemIndex = 0;
        if (obfuscationGuard <= 93) {
          this.pendingResult = -92;
        }
        while (itemIndex < this.itemCount) {
          if (this.items[itemIndex].pressedButton != 0) {
            return this.actionIds[itemIndex];
          }
          itemIndex++;
        }
        if (DeployEvent.pointerPressButton != 0) {
          return -1;
        }
        return this.pendingResult;
    }

    static {
        field_Vb = new int[][]{new int[]{0, 0, 0}, new int[]{2, 0, 0}, new int[]{5, 0, 0}, new int[]{10, 0, 0}, new int[]{0, 2, 0}, new int[]{0, 3, 0}, new int[]{0, 0, 1}};
        field_Jb = "Cancel draw";
        field_Ob = "Mind control";
    }
}
