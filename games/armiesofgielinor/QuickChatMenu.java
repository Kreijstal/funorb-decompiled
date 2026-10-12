/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenu extends ClientUiComponent {
    private int[] phraseIds;
    private int menuHeight;
    private int collapseTicks;
    static volatile int lastPointerPressX;
    private int menuWidth;
    private int openItemIndex;
    static String field_Mb;
    static String[] field_Lb;
    private IconTextComponent[] items;
    static int field_Wb;
    static String field_Nb;
    private int itemCount;
    private int animationAnchorY;
    private int rowHeight;
    private QuickChatMenu activeSubmenu;
    private char[] shortcuts;
    private QuickChatMenu[] submenus;
    private int contentWidth;

    public static void k(int param0) {
        field_Nb = null;
        field_Lb = null;
        if (param0 != 85) {
          QuickChatMenu.k(22);
        }
        field_Mb = null;
    }

    final void layoutMenu(int padding, int iconTextGap, int bottomY, int x, int animationAnchorY, int obfuscationGuard) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.menuWidth = this.contentWidth + 2 * padding;
        this.setBounds(this.menuHeight, obfuscationGuard ^ 18789, this.menuWidth, -this.menuHeight + bottomY, x);
        if (this.animationAnchorY != animationAnchorY) {
          this.animationAnchorY = animationAnchorY;
          this.setCollapseTicks(this.collapseTicks, 48);
        }
        for (var7 = 0; var7 < this.itemCount; var7++) {
          this.items[var7].setLayout(this.rowHeight, padding, -30061, this.menuWidth, this.items[var7].y, 0, iconTextGap);
        }
        if (obfuscationGuard != -6519) {
          this.contentWidth = 23;
        }
        if (this.openItemIndex != -1 &&
          this.submenus[this.openItemIndex] != null) {
          var7Lifetime1 = this.submenus[this.openItemIndex].itemCount;
          for (var8 = this.rowHeight * (var7Lifetime1 + this.openItemIndex) + this.y; bottomY < var8; var8 = var8 - this.rowHeight) {
          }
          this.submenus[this.openItemIndex].layoutMenu(padding, iconTextGap, var8, this.menuWidth + x, this.items[this.openItemIndex].screenY, -6519);
        }
    }

    final boolean hasPressedItem(byte obfuscationGuard) {
        IconTextComponent var5 = null;
        int var4 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = 0;
        IconTextComponent[] var3 = this.items;
        int var4Lifetime1;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          var2 = var2 | (var5.pressedButton != 0 ? 1 : 0);
        }
        var4Lifetime1 = 98 % ((-22 - obfuscationGuard) / 32);
        if (var2 == 0 && this.openItemIndex != -1 &&
          null != this.submenus[this.openItemIndex]) {
          var2 = this.submenus[this.openItemIndex].hasPressedItem((byte) -58) ? 1 : 0;
        }
        return var2 != 0;
    }

    final boolean handleKeyboard(boolean obfuscationGuard, int selectionContext, int messageContext) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = 85 == rs.keyCode ? 1 : 0;
        if (this.activeSubmenu != null) {
          if (var4 != 0 &&
            -1 == this.activeSubmenu.openItemIndex) {
            this.resetSelection((byte) -106);
            this.setCollapseTicks(0, -125);
            return true;
          }
          return this.activeSubmenu.handleKeyboard(false, selectionContext, messageContext);
        }
        if (null == this.activeSubmenu && this == qd.activeQuickChatMenu &&
          var4 != 0) {
          e.closeQuickChatMenu((byte) -101);
          return true;
        }
        int var5 = DualNodeDeque.typedCharacter;
        if (obfuscationGuard) {
          this.advanceMenu(-72, (byte) -60, -60);
        }
        if (var5 > 0) {
          if (var5 == et.field_a) {
            var5 = 63;
          }
          for (var6 = 0; this.shortcuts.length > var6; var6++) {
            if (var5 == this.shortcuts[var6]) {
              this.activateItem(messageContext, 23312, var6, selectionContext);
              return true;
            }
          }
        }
        return false;
    }

    final void resetSelection(byte obfuscationGuard) {
        int var3 = 0;
        IconTextComponent var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        IconTextComponent[] var6 = this.items;
        IconTextComponent[] var2 = var6;
        if (obfuscationGuard != -106) {
          this.handleKeyboard(true, -115, -112);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.pressedButton = 0;
          var4.selected = false;
        }
        if (this.activeSubmenu != null) {
          this.activeSubmenu.resetSelection((byte) -106);
          this.activeSubmenu.unlink(obfuscationGuard ^ 25);
        }
        this.openItemIndex = -1;
        this.activeSubmenu = null;
        this.setCollapseTicks(12, -127);
    }

    private final void activateItem(int messageContext, int obfuscationGuard, int itemIndex, int selectionContext) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 23312) {
          this.advanceMenu(-87, (byte) 117, -22);
        }
        if (itemIndex == this.openItemIndex) {
          this.resetSelection((byte) -106);
          this.setCollapseTicks(0, -123);
        } else {
          if (null != this.submenus[itemIndex]) {
            this.resetSelection((byte) -106);
            this.setCollapseTicks(0, -124);
            this.openItemIndex = itemIndex;
            this.activeSubmenu = this.submenus[this.openItemIndex];
            lw.a((byte) 79, this.activeSubmenu);
            this.activeSubmenu.setCollapseTicks(12, 42);
          } else {
            if (this.phraseIds[itemIndex] == -1) {
              gn.openQuickChatHelp(5);
              e.closeQuickChatMenu((byte) -115);
            } else {
              var5 = 32768 | this.phraseIds[itemIndex];
              var6 = rs.outgoingChatChannel;
              if (var6 == 0 &&
                null != vu.currentRoom) {
                var6 = 1;
              }
              if (kp.getChatFilter(var6, 114) == 2) {
                ud.setChatFilter(1, false, var6, selectionContext);
              }
              String var8 = (String) null;
              it.writeChatMessage(var5, -91, rs.outgoingChatChannel, qd.chatRecipientName, messageContext, (String) null);
              jh.rememberLastQuickChat(qd.chatRecipientName, dj.chatRecipientAccountId, var5, rs.outgoingChatChannel, obfuscationGuard ^ 4124);
              e.closeQuickChatMenu((byte) -126);
              wf.g(-20873);
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ac.activeTerrainSprites[0].b(param0, param4, param5, param1);
        var8 = 0;
        var9 = CampaignMenuEntry.field_u[param2];
        if (var9 == 11) {
          var8 = 1;
          var9 = 7;
        }
        if (var9 == 0) {
          return;
        }
        var10 = 53 % ((param6 + 10) / 62);
        if (var9 == 7) {
          pv.field_b = var9;
          gt.field_i = var9;
          cs.field_Y = var9;
          ContextActionMenu.field_Wb = var9;
          QuickChatCategory.field_z = var9;
          ConsoleTextNode.field_m = var9;
          j.field_b = var9;
          SpellConfirmationDialog.field_e = var9;
          ChannelBaseVolumeConsoleCommand.field_E = var9;
          stackIn_9_0 = (param3 <= 0) ? 0 : 1;
          var11 = stackIn_9_0;
          stackIn_12_0 = (param3 >= -1 + ResourceRequest.field_y) ? 0 : 1;
          var12 = stackIn_12_0;
          if (param7 > 0) {
            if (var11 != 0) {
              ContextActionMenu.field_Wb = CampaignMenuEntry.field_u[-1 + (param2 - ResourceRequest.field_y)];
            }
            pv.field_b = CampaignMenuEntry.field_u[param2 - ResourceRequest.field_y];
            if (var12 != 0) {
              ConsoleTextNode.field_m = CampaignMenuEntry.field_u[-ResourceRequest.field_y + (param2 + 1)];
            }
          }
          if (var11 != 0) {
            cs.field_Y = CampaignMenuEntry.field_u[param2 - 1];
          }
          if (var12 != 0) {
            SpellConfirmationDialog.field_e = CampaignMenuEntry.field_u[1 + param2];
          }
          var9 = var9 * 20;
          if (param7 < -1 + ConsoleParseException.field_c) {
            if (var11 != 0) {
              ChannelBaseVolumeConsoleCommand.field_E = CampaignMenuEntry.field_u[-1 + param2 + ResourceRequest.field_y];
            }
            QuickChatCategory.field_z = CampaignMenuEntry.field_u[param2 + ResourceRequest.field_y];
            if (var12 != 0) {
              gt.field_i = CampaignMenuEntry.field_u[param2 + ResourceRequest.field_y + 1];
            }
          }
          ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
          ac.activeTerrainSprites[var9 - (-1 - ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
          ac.activeTerrainSprites[2 + var9 + ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, -68)].b(param0, param4, param5, param1);
          ac.activeTerrainSprites[3 + (var9 + ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
          if (cu.field_a &&
            var8 == 0 &&
            (ConsoleExpression.field_p[param2] + param2 & 5) == 5) {
            nr.activeFoliageSprites[6 + ConsoleExpression.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
          }
        }
        return;
    }

    final static void a(ClientUiComponent param0, int param1, boolean param2) {
        ClientContextMenu var8 = null;
        RgbSprite var10 = null;
        String var9 = null;
        ClientContextMenu var11 = null;
        RgbSprite var13 = null;
        String var12 = null;
        ClientContextMenu var14 = null;
        RgbSprite var16 = null;
        String var15 = null;
        ClientContextMenu var17 = null;
        RgbSprite var19 = null;
        String var18 = null;
        ClientContextMenu var20 = null;
        RgbSprite var22 = null;
        String var21 = null;
        ClientContextMenu var23 = null;
        RgbSprite var25 = null;
        String var24 = null;
        ClientContextMenu var26 = null;
        String var27 = null;
        ClientContextMenu var29 = null;
        RgbSprite var31 = null;
        String var30 = null;
        ClientContextMenu var32 = null;
        RgbSprite var34 = null;
        String var33 = null;
        ClientContextMenu var35 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RgbSprite var28 = null;
        RgbSprite var28Lifetime1;
        RgbSprite var28Lifetime2;
        RgbSprite var28Lifetime3;
        RgbSprite var28Lifetime4;
        RgbSprite var28Lifetime5;
        RgbSprite var28Lifetime6;
        RgbSprite var28Lifetime7;
        RgbSprite var28Lifetime1Lifetime1;
        RgbSprite var28Lifetime1Lifetime2;
        RgbSprite var28Lifetime1Lifetime3;
        RgbSprite var28Lifetime1Lifetime4;
        RgbSprite var28Lifetime1Lifetime5;
        ng.openClientContextMenu((ScrollContainer) null, param0, (int[]) null, (String) null, -1, 2, param1, (String) null, 0L);
        if (param2) {
          return;
        }
        try {
          if (0 == param1) {
            var8 = tn.activeContextMenu;
            var10 = dh.field_n[0];
            var28 = var10;
            var28Lifetime3 = var10;
            var9 = vl.field_o;
            var8.menu.addIconAction(false, var9, 11, var10);
            var11 = tn.activeContextMenu;
            var13 = dh.field_n[1];
            var28Lifetime4 = var13;
            var28Lifetime5 = var13;
            var12 = li.field_m;
            var11.menu.addIconAction(false, var12, 12, var13);
            var14 = tn.activeContextMenu;
            var16 = dh.field_n[2];
            var28Lifetime6 = var16;
            var28Lifetime7 = var16;
            var15 = MapRepository.field_g;
            var14.menu.addIconAction(param2, var15, 13, var16);
          }
          if (param1 == 1) {
            var17 = tn.activeContextMenu;
            var19 = dh.field_n[0];
            var28Lifetime1 = var19;
            var28Lifetime1Lifetime1 = var19;
            var18 = ChannelGainProfile.field_c;
            var17.menu.addIconAction(false, var18, 11, var19);
            var20 = tn.activeContextMenu;
            var22 = dh.field_n[1];
            var28Lifetime1Lifetime2 = var22;
            var28Lifetime1Lifetime3 = var22;
            var21 = fd.field_l;
            var20.menu.addIconAction(param2, var21, 12, var22);
            var23 = tn.activeContextMenu;
            var25 = dh.field_n[2];
            var28Lifetime1Lifetime4 = var25;
            var28Lifetime1Lifetime5 = var25;
            var24 = fa.field_c;
            var23.menu.addIconAction(false, var24, 13, var25);
          }
          if (param1 == 2) {
            var26 = tn.activeContextMenu;
            var28Lifetime2 = dh.field_n[0];
            var27 = SocketResourceClient.field_v;
            var26.menu.addIconAction(param2, var27, 11, var28Lifetime2);
            var29 = tn.activeContextMenu;
            var31 = dh.field_n[1];
            var30 = jj.field_e;
            var29.menu.addIconAction(param2, var30, 12, var31);
            var32 = tn.activeContextMenu;
            var34 = dh.field_n[2];
            var33 = ai.field_R;
            var32.menu.addIconAction(false, var33, 13, var34);
          }
          var35 = tn.activeContextMenu;
          var4 = param0.screenX;
          var5 = param0.screenY;
          var6 = param0.width;
          var7 = param0.height;
          var35.menu.layoutPopup(var7, var5, var6, (byte) -118, var4);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mq.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int getOpenMenuWidth(byte obfuscationGuard) {
        int var2 = 6 / ((-76 - obfuscationGuard) / 46);
        return this.menuWidth + (this.activeSubmenu == null ? 0 : this.activeSubmenu.getOpenMenuWidth((byte) -124));
    }

    private final void setCollapseTicks(int ticks, int obfuscationGuard) {
        int itemIndex = 0;
        int expandedY = 0;
        int ticksSquared = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int guardRemainder = 61 % ((-72 - obfuscationGuard) / 51);
        this.collapseTicks = ticks;
        for (itemIndex = 0; itemIndex < this.itemCount; itemIndex++) {
          expandedY = this.rowHeight * itemIndex;
          ticksSquared = this.collapseTicks * this.collapseTicks;
          this.items[itemIndex].y = ((-ticksSquared + 144) * expandedY + (this.animationAnchorY - this.screenY) * ticksSquared) / 144;
        }
    }

    final void advanceMenu(int selectionContext, byte obfuscationGuard, int messageContext) {
        int var4_int = 0;
        IconTextComponent var5;
        int var6;
        IconTextComponent stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        QuickChatMenu var4;
        QuickChatMenu var7;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -42) {
          return;
        }
        for (var4_int = 0; var4_int < this.items.length; var4_int++) {
          var5 = this.items[var4_int];
          if (var5.pressedButton == 1) {
            this.activateItem(messageContext, 23312, var4_int, selectionContext);
            stackIn_9_0 = var5;
            stackIn_10_1 = (this.openItemIndex == var4_int);
            stackIn_9_0.selected = stackIn_10_1;
          }
        }
        if (this.openItemIndex != -1) {
          var7 = this.submenus[this.openItemIndex];
          var4 = var7;
          if (var4 != null) {
            var7.advanceMenu(selectionContext, (byte) -42, messageContext);
          }
        }
        if (0 < this.collapseTicks) {
          this.setCollapseTicks(this.collapseTicks - 1, -126);
        }
    }

    QuickChatMenu(long key, ClientUiComponent style, ClientUiComponent itemStyle, ClientUiComponent textStyle, QuickChatMenu[] submenus, int[] phraseIds, String[] labels, char[] shortcuts) {
        super(key, style);
        int itemIndex = 0;
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
        String shortcutPrefix = null;
        String shortcutSuffix = null;
        Object arrow = null;
        int labelWidth = 0;
        BitmapFont measurementFont = null;
        BitmapFont rowFont = null;
        this.openItemIndex = -1;
        try {
          this.phraseIds = phraseIds;
          this.submenus = submenus;
          this.shortcuts = shortcuts;
          this.itemCount = this.phraseIds.length;
          measurementFont = textStyle.font;
          rowFont = measurementFont;
          this.rowHeight = rowFont.field_L + rowFont.field_H + 2;
          this.menuHeight = this.rowHeight * this.itemCount;
          this.contentWidth = 0;
          this.items = new IconTextComponent[this.itemCount];
          shortcutPrefix = "<col=999999>";
          shortcutSuffix = "</col>";
          for (itemIndex = 0; this.itemCount > itemIndex; itemIndex++) {
            if (this.shortcuts[itemIndex] > 0) {
              labels[itemIndex] = shortcutPrefix + db.a(true, this.shortcuts[itemIndex]).toUpperCase() + ": " + shortcutSuffix + labels[itemIndex];
            }
            arrow = null;
            if (this.submenus[itemIndex] != null ||
              this.phraseIds[itemIndex] == -1) {
              arrow = s.quickChatArrow;
            }
            this.items[itemIndex] = new IconTextComponent(0L, itemStyle, (ClientUiComponent) null, textStyle, (RgbSprite) (arrow), labels[itemIndex]);
            this.addChild(this.items[itemIndex], 55);
            labelWidth = measurementFont.a(labels[itemIndex]);
            if (this.contentWidth < labelWidth) {
              this.contentWidth = labelWidth;
            }
          }
          this.contentWidth = this.contentWidth + (10 + s.quickChatArrow.canvasWidth);
          this.setCollapseTicks(12, -8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("mq.<init>(").append(key).append(',');
          if (style == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (itemStyle == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (textStyle == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (submenus == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (phraseIds == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (labels == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (shortcuts == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_Nb = "Please enter your date of birth to enable chat:";
        lastPointerPressX = 0;
        field_Lb = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_Mb = "<%0> has been defeated";
        field_Wb = 3;
    }
}
