/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenu extends UiComponent {
    private int menuWidth;
    static int field_Wb;
    private int rowHeight;
    private char[] shortcuts;
    static String field_ac;
    private AlignedIconLabel[] items;
    static ResourceArchive backgroundMusicSampleArchive;
    private int contentWidth;
    private int animationAnchorY;
    private int selectedItem;
    private QuickChatMenu[] submenus;
    private int[] messageIds;
    private int itemCount;
    static int field_Zb;
    private int preferredHeight;
    private QuickChatMenu openSubmenu;
    private int remainingExpansionTicks;
    static TextFont field_Yb;

    final static void a(String[] args, IndexedSprite[] param1, byte[] param2, RgbSprite[][] param3, byte[] param4, int[] param5, int param6, RgbSprite[][] param7, ResourceArchive param8, int param9, ResourceArchive param10, String[][] param11, ResourceArchive param12, int param13, int[] param14, String[][] param15, boolean param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        try {
          LevelPackCard.a(param15, param1, (byte) 47, (String[]) null, param6, args, param11, param12, param8, param10, param14, param7, param9, param16, param3, param4, param2, param5, param13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("og.J(");
          if (args == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param8 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param11 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param12 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param15 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param16).append(')').toString());
        }
    }

    private final void setExpansionTicks(int remainingTicks, byte obfuscationGuard) {
        int expandedY = 0;
        int collapseWeight = 0;
        int itemIndex = 0;
        int unusedGameFlag = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -81) {
            this.hasPressedItem(-108);
          }
          this.remainingExpansionTicks = remainingTicks;
          itemIndex = 0;
          while (itemIndex < this.itemCount) {
            expandedY = itemIndex * this.rowHeight;
            collapseWeight = this.remainingExpansionTicks * this.remainingExpansionTicks;
            this.items[itemIndex].localY = (collapseWeight * (-this.screenY + this.animationAnchorY) + expandedY * (144 - collapseWeight)) / 144;
            itemIndex++;
            if (unusedGameFlag != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "og.E(" + remainingTicks + ',' + obfuscationGuard + ')');
        }
    }

    final void processPressedItems(int obfuscationGuard, int messageOpcode, int filterOpcode) {
        RuntimeException runtimeException = null;
        int itemIndex = 0;
        QuickChatMenu submenu = null;
        AlignedIconLabel item = null;
        int unusedGameFlag = 0;
        AlignedIconLabel selectedRow = null;
        boolean rowSelected = false;
        int comparisonSentinel = 0;
        int pressComplementOrSelectedItem = 0;
        RuntimeException decompiledCaughtException = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          itemIndex = 0;
          if (obfuscationGuard != 38) {
            return;
          }
          boolean finishedRowScan = false;
          while (!(finishedRowScan = (this.items.length <= itemIndex))) {
            item = this.items[itemIndex];
            comparisonSentinel = -2;
            pressComplementOrSelectedItem = ~item.pressedButton;
            if (unusedGameFlag == 0) {
              if (comparisonSentinel == pressComplementOrSelectedItem) {
                this.activateItem(filterOpcode, itemIndex, obfuscationGuard ^ 38, messageOpcode);
                selectedRow = item;
                rowSelected = (this.selectedItem == itemIndex);
                selectedRow.selected = rowSelected;
              }
              itemIndex++;
              continue;
            }
            break;
          }
          if (finishedRowScan) {
            comparisonSentinel = -1;
            pressComplementOrSelectedItem = this.selectedItem;
          }
          if (comparisonSentinel != pressComplementOrSelectedItem) {
            submenu = this.submenus[this.selectedItem];
            if (null != submenu) {
              submenu.processPressedItems(obfuscationGuard ^ 0, messageOpcode, filterOpcode);
            }
          }
          if (this.remainingExpansionTicks > 0) {
            this.setExpansionTicks(-1 + this.remainingExpansionTicks, (byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "og.B(" + obfuscationGuard + ',' + messageOpcode + ',' + filterOpcode + ')');
        }
    }

    final static boolean h(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -26090) {
            field_Zb = -8;
          }
          stackIn_4_0 = LevelPackSelectScreen.field_s;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "og.JA(" + param0 + ')');
        }
    }

    final void resetSelection(byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        AlignedIconLabel[] rows = null;
        int itemIndex = 0;
        AlignedIconLabel item = null;
        int unusedGameFlag = 0;
        RuntimeException decompiledCaughtException = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          rows = this.items;
          if (obfuscationGuard != 41) {
            this.items = (AlignedIconLabel[]) null;
          }
          itemIndex = 0;
          scanLoop1: while (true) {
            if (itemIndex < rows.length) {
              item = rows[itemIndex];
              item.pressedButton = 0;
              item.selected = false;
              itemIndex++;
              if (unusedGameFlag == 0) {
                continue;
              }
            } else {
              if (null == this.openSubmenu) {
                break scanLoop1;
              }
              this.openSubmenu.resetSelection((byte) 41);
            }
            this.openSubmenu.unlink((byte) 111);
            break;
          }
          this.openSubmenu = null;
          this.selectedItem = -1;
          this.setExpansionTicks(12, (byte) -81);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "og.H(" + obfuscationGuard + ')');
        }
    }

    final boolean hasPressedItem(int obfuscationGuard) {
        int anyPressed = 0;
        RuntimeException var2 = null;
        AlignedIconLabel[] rows = null;
        int itemIndex = 0;
        AlignedIconLabel item = null;
        int unusedGameFlag = 0;
        int rowPressed = 0;
        int pressedOrNoSelectionSentinel = 0;
        int pressComplementOrSelectedItem = 0;
        int result = 0;
        RuntimeException decompiledCaughtException = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != 28) {
            backgroundMusicSampleArchive = (ResourceArchive) null;
          }
          anyPressed = 0;
          rows = this.items;
          itemIndex = 0;
          scanLoop1: while (true) {
            if (itemIndex < rows.length) {
              item = rows[itemIndex];
              pressedOrNoSelectionSentinel = anyPressed;
              pressComplementOrSelectedItem = -1;
              if (unusedGameFlag == 0) {
                if (pressComplementOrSelectedItem == ~item.pressedButton) {
                  rowPressed = 0;
                } else {
                  rowPressed = 1;
                }
                anyPressed = pressedOrNoSelectionSentinel | rowPressed;
                itemIndex++;
                continue;
              }
            } else {
              if (anyPressed != 0) {
                break scanLoop1;
              }
              pressedOrNoSelectionSentinel = -1;
              pressComplementOrSelectedItem = this.selectedItem;
            }
            if (pressedOrNoSelectionSentinel != pressComplementOrSelectedItem &&
              this.submenus[this.selectedItem] != null) {
              anyPressed = this.submenus[this.selectedItem].hasPressedItem(28) ? 1 : 0;
            }
            break;
          }
          result = anyPressed;
          return result != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "og.A(" + obfuscationGuard + ')');
        }
    }

    private final void activateItem(int filterOpcode, int itemIndex, int obfuscationGuard, int messageOpcode) {
        RuntimeException decompiledCaughtException = null;
        int encodedMessageId = 0;
        RuntimeException var5 = null;
        int effectiveChannel = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          boolean openHelpBranch = true;
          if (this.selectedItem != itemIndex) {
            if (this.submenus[itemIndex] == null) {
              if (this.messageIds[itemIndex] != -1) {
                encodedMessageId = this.messageIds[itemIndex] | 32768;
                effectiveChannel = ScreenNavigationHelpers.quickChatChannel;
                if (effectiveChannel == 0 &&
                  ClientResourceHelpers.currentLobbyGame != null) {
                  effectiveChannel = 1;
                }
                if (OutgoingPacketHelpers.getChatFilter(effectiveChannel, (byte) 18) == 2) {
                  DirectByteStorage.updateChatFilter(0, filterOpcode, 1, effectiveChannel);
                }
                GrowableIntList.writeChatMessage(encodedMessageId, DualLinkNode.quickChatRecipient, (byte) -113, ScreenNavigationHelpers.quickChatChannel, messageOpcode, (String) null);
                MenuScreen.rememberRepeatMessage(encodedMessageId, 29295, CanvasResizeController.field_n, DualLinkNode.quickChatRecipient, ScreenNavigationHelpers.quickChatChannel);
                GamePresentationHelpers.closeQuickChatMenu(-1);
                AccountContentTransitionLayer.m(-69);
                openHelpBranch = (unusedGameFlag != 0);
              }
              if (openHelpBranch) {
                ResourcePreparationEntry.a(true);
                GamePresentationHelpers.closeQuickChatMenu(-1);
                if (unusedGameFlag != 0) {
                  this.resetSelection((byte) 41);
                  this.setExpansionTicks(0, (byte) -81);
                  this.selectedItem = itemIndex;
                  this.openSubmenu = this.submenus[this.selectedItem];
                  BlankScreen.appendQuickChatSubmenu(obfuscationGuard ^ -2, this.openSubmenu);
                  this.openSubmenu.setExpansionTicks(12, (byte) -81);
                  this.resetSelection((byte) 41);
                  this.setExpansionTicks(0, (byte) -81);
                }
              }
            } else {
              this.resetSelection((byte) 41);
              this.setExpansionTicks(0, (byte) -81);
              this.selectedItem = itemIndex;
              this.openSubmenu = this.submenus[this.selectedItem];
              BlankScreen.appendQuickChatSubmenu(obfuscationGuard ^ -2, this.openSubmenu);
              this.openSubmenu.setExpansionTicks(12, (byte) -81);
              if (unusedGameFlag != 0) {
                this.resetSelection((byte) 41);
                this.setExpansionTicks(0, (byte) -81);
              }
            }
          } else {
            this.resetSelection((byte) 41);
            this.setExpansionTicks(0, (byte) -81);
          }
          if (obfuscationGuard != 0) {
            this.items = (AlignedIconLabel[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var5), "og.I(" + filterOpcode + ',' + itemIndex + ',' + obfuscationGuard + ',' + messageOpcode + ')');
        }
    }

    QuickChatMenu(long id, UiComponent styleTemplate, UiComponent itemStyle, UiComponent labelStyle, QuickChatMenu[] submenus, int[] messageIds, String[] labels, char[] shortcuts) {
        super(id, styleTemplate);
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        TextFont font = null;
        RuntimeException var10_ref = null;
        String shortcutColorOpen = null;
        String shortcutColorClose = null;
        int itemIndex = 0;
        Object branchSprite = null;
        int labelWidth = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        this.selectedItem = -1;
        try {
          this.submenus = submenus;
          this.messageIds = messageIds;
          this.shortcuts = shortcuts;
          this.itemCount = this.messageIds.length;
          font = labelStyle.font;
          this.rowHeight = font.descent + (font.ascent + 2);
          this.preferredHeight = this.rowHeight * this.itemCount;
          this.contentWidth = 0;
          this.items = new AlignedIconLabel[this.itemCount];
          shortcutColorOpen = "<col=999999>";
          shortcutColorClose = "</col>";
          itemIndex = 0;
          boolean finishedRowCreation = false;
          while (!(finishedRowCreation = (itemIndex >= this.itemCount))) {
            if (unusedGameFlag == 0) {
              if (this.shortcuts[itemIndex] > 0) {
                labels[itemIndex] = shortcutColorOpen + MusicEnvelope.a(true, this.shortcuts[itemIndex]).toUpperCase() + ": " + shortcutColorClose + labels[itemIndex];
              }
              branchSprite = null;
              if (null != this.submenus[itemIndex] ||
                this.messageIds[itemIndex] == -1) {
                branchSprite = KeyDispatchHelpers.field_e;
              }
              this.items[itemIndex] = new AlignedIconLabel(0L, itemStyle, (UiComponent) null, labelStyle, (RgbSprite) (branchSprite), labels[itemIndex]);
              this.addChild(this.items[itemIndex], 0);
              labelWidth = font.measureText(labels[itemIndex]);
              if (labelWidth > this.contentWidth) {
                this.contentWidth = labelWidth;
              }
              itemIndex++;
              continue;
            }
            break;
          }
          if (finishedRowCreation) {
            this.contentWidth = this.contentWidth + (10 + KeyDispatchHelpers.field_e.canvasWidth);
          }
          this.setExpansionTicks(12, (byte) -81);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_25_0 = var10_ref;
          stackIn_25_1 = new StringBuilder().append("og.<init>(").append(id).append(',');
          if (styleTemplate == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (itemStyle == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (labelStyle == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (submenus == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (messageIds == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (labels == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (shortcuts == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final static void a(boolean param0, ResourceArchive param1) {
        RuntimeException stackIn_793_0 = null;
        StringBuilder stackIn_793_1 = null;
        String stackIn_794_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        byte[] var2Lifetime104;
        byte[] var2Lifetime105;
        byte[] var2Lifetime106;
        byte[] var2Lifetime107;
        byte[] var2Lifetime108;
        byte[] var2Lifetime109;
        byte[] var2Lifetime110;
        byte[] var2Lifetime111;
        byte[] var2Lifetime112;
        byte[] var2Lifetime113;
        byte[] var2Lifetime114;
        byte[] var2Lifetime115;
        byte[] var2Lifetime116;
        byte[] var2Lifetime117;
        byte[] var2Lifetime118;
        byte[] var2Lifetime119;
        byte[] var2Lifetime120;
        byte[] var2Lifetime121;
        byte[] var2Lifetime122;
        byte[] var2Lifetime123;
        byte[] var2Lifetime124;
        byte[] var2Lifetime125;
        byte[] var2Lifetime126;
        byte[] var2Lifetime127;
        byte[] var2Lifetime128;
        byte[] var2Lifetime129;
        byte[] var2Lifetime130;
        byte[] var2Lifetime131;
        byte[] var2Lifetime132;
        byte[] var2Lifetime133;
        byte[] var2Lifetime134;
        byte[] var2Lifetime135;
        byte[] var2Lifetime136;
        byte[] var2Lifetime137;
        byte[] var2Lifetime138;
        byte[] var2Lifetime139;
        byte[] var2Lifetime140;
        byte[] var2Lifetime141;
        byte[] var2Lifetime142;
        byte[] var2Lifetime143;
        byte[] var2Lifetime144;
        byte[] var2Lifetime145;
        byte[] var2Lifetime146;
        byte[] var2Lifetime147;
        byte[] var2Lifetime148;
        byte[] var2Lifetime149;
        byte[] var2Lifetime150;
        byte[] var2Lifetime151;
        byte[] var2Lifetime152;
        byte[] var2Lifetime153;
        byte[] var2Lifetime154;
        byte[] var2Lifetime155;
        byte[] var2Lifetime156;
        byte[] var2Lifetime157;
        byte[] var2Lifetime158;
        byte[] var2Lifetime159;
        byte[] var2Lifetime160;
        byte[] var2Lifetime161;
        byte[] var2Lifetime162;
        byte[] var2Lifetime163;
        byte[] var2Lifetime164;
        byte[] var2Lifetime165;
        byte[] var2Lifetime166;
        byte[] var2Lifetime167;
        byte[] var2Lifetime168;
        byte[] var2Lifetime169;
        byte[] var2Lifetime170;
        byte[] var2Lifetime171;
        byte[] var2Lifetime172;
        byte[] var2Lifetime173;
        byte[] var2Lifetime174;
        byte[] var2Lifetime175;
        byte[] var2Lifetime176;
        byte[] var2Lifetime177;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          SaveResultsPromptScreen.field_t = param1;
          var2 = GameplaySpriteHelpers.a(true, "text_game_name");
          if (null != var2) {
            MenuButton.a(var2, (byte) 71);
          }
          var2Lifetime1 = GameplaySpriteHelpers.a(true, "expansion_text,0");
          if (var2Lifetime1 != null) {
            SaveResultsPromptScreen.field_u[0] = MenuButton.a(var2Lifetime1, (byte) 116);
          }
          var2Lifetime2 = GameplaySpriteHelpers.a(true, "expansion_text,1");
          if (null != var2Lifetime2) {
            SaveResultsPromptScreen.field_u[1] = MenuButton.a(var2Lifetime2, (byte) 118);
          }
          var2Lifetime3 = GameplaySpriteHelpers.a(true, "expansion_text,2");
          if (var2Lifetime3 != null) {
            SaveResultsPromptScreen.field_u[2] = MenuButton.a(var2Lifetime3, (byte) 115);
          }
          var2Lifetime4 = GameplaySpriteHelpers.a(true, "expansion_text,3");
          if (null != var2Lifetime4) {
            SaveResultsPromptScreen.field_u[3] = MenuButton.a(var2Lifetime4, (byte) 91);
          }
          var2Lifetime5 = GameplaySpriteHelpers.a(true, "expansion_text,4");
          if (null != var2Lifetime5) {
            SaveResultsPromptScreen.field_u[4] = MenuButton.a(var2Lifetime5, (byte) 101);
          }
          var2Lifetime6 = GameplaySpriteHelpers.a(true, "expansion_installed");
          if (var2Lifetime6 != null) {
            RasterSnapshot.field_s = MenuButton.a(var2Lifetime6, (byte) 115);
          }
          var2Lifetime7 = GameplaySpriteHelpers.a(true, "achievement_names,0");
          if (var2Lifetime7 != null) {
            AchievementBrowserScreen.field_s[0] = MenuButton.a(var2Lifetime7, (byte) 114);
          }
          var2Lifetime8 = GameplaySpriteHelpers.a(true, "achievement_names,1");
          if (null != var2Lifetime8) {
            AchievementBrowserScreen.field_s[1] = MenuButton.a(var2Lifetime8, (byte) 72);
          }
          var2Lifetime9 = GameplaySpriteHelpers.a(true, "achievement_names,2");
          if (var2Lifetime9 != null) {
            AchievementBrowserScreen.field_s[2] = MenuButton.a(var2Lifetime9, (byte) 97);
          }
          var2Lifetime10 = GameplaySpriteHelpers.a(true, "achievement_names,3");
          if (null != var2Lifetime10) {
            AchievementBrowserScreen.field_s[3] = MenuButton.a(var2Lifetime10, (byte) 108);
          }
          var2Lifetime11 = GameplaySpriteHelpers.a(true, "achievement_names,4");
          if (null != var2Lifetime11) {
            AchievementBrowserScreen.field_s[4] = MenuButton.a(var2Lifetime11, (byte) 88);
          }
          var2Lifetime12 = GameplaySpriteHelpers.a(true, "achievement_names,5");
          if (null != var2Lifetime12) {
            AchievementBrowserScreen.field_s[5] = MenuButton.a(var2Lifetime12, (byte) 124);
          }
          var2Lifetime13 = GameplaySpriteHelpers.a(true, "achievement_names,6");
          if (null != var2Lifetime13) {
            AchievementBrowserScreen.field_s[6] = MenuButton.a(var2Lifetime13, (byte) 90);
          }
          var2Lifetime14 = GameplaySpriteHelpers.a(true, "achievement_names,7");
          if (var2Lifetime14 != null) {
            AchievementBrowserScreen.field_s[7] = MenuButton.a(var2Lifetime14, (byte) 115);
          }
          var2Lifetime15 = GameplaySpriteHelpers.a(true, "achievement_names,8");
          if (null != var2Lifetime15) {
            AchievementBrowserScreen.field_s[8] = MenuButton.a(var2Lifetime15, (byte) 99);
          }
          var2Lifetime16 = GameplaySpriteHelpers.a(true, "achievement_names,9");
          if (var2Lifetime16 != null) {
            AchievementBrowserScreen.field_s[9] = MenuButton.a(var2Lifetime16, (byte) 94);
          }
          var2Lifetime17 = GameplaySpriteHelpers.a(!param0, "achievement_names,10");
          if (var2Lifetime17 != null) {
            AchievementBrowserScreen.field_s[10] = MenuButton.a(var2Lifetime17, (byte) 114);
          }
          var2Lifetime18 = GameplaySpriteHelpers.a(!param0, "achievement_names,11");
          if (var2Lifetime18 != null) {
            AchievementBrowserScreen.field_s[11] = MenuButton.a(var2Lifetime18, (byte) 97);
          }
          var2Lifetime19 = GameplaySpriteHelpers.a(!param0, "achievement_names,12");
          if (null != var2Lifetime19) {
            AchievementBrowserScreen.field_s[12] = MenuButton.a(var2Lifetime19, (byte) 121);
          }
          var2Lifetime20 = GameplaySpriteHelpers.a(true, "achievement_names,13");
          if (var2Lifetime20 != null) {
            AchievementBrowserScreen.field_s[13] = MenuButton.a(var2Lifetime20, (byte) 77);
          }
          var2Lifetime21 = GameplaySpriteHelpers.a(true, "achievement_names,14");
          if (var2Lifetime21 != null) {
            AchievementBrowserScreen.field_s[14] = MenuButton.a(var2Lifetime21, (byte) 100);
          }
          var2Lifetime22 = GameplaySpriteHelpers.a(true, "achievement_names,15");
          if (null != var2Lifetime22) {
            AchievementBrowserScreen.field_s[15] = MenuButton.a(var2Lifetime22, (byte) 97);
          }
          var2Lifetime23 = GameplaySpriteHelpers.a(true, "achievement_names,16");
          if (var2Lifetime23 != null) {
            AchievementBrowserScreen.field_s[16] = MenuButton.a(var2Lifetime23, (byte) 83);
          }
          var2Lifetime24 = GameplaySpriteHelpers.a(true, "achievement_names,17");
          if (null != var2Lifetime24) {
            AchievementBrowserScreen.field_s[17] = MenuButton.a(var2Lifetime24, (byte) 85);
          }
          var2Lifetime25 = GameplaySpriteHelpers.a(true, "achievement_names,18");
          if (null != var2Lifetime25) {
            AchievementBrowserScreen.field_s[18] = MenuButton.a(var2Lifetime25, (byte) 79);
          }
          var2Lifetime26 = GameplaySpriteHelpers.a(true, "achievement_names,19");
          if (null != var2Lifetime26) {
            AchievementBrowserScreen.field_s[19] = MenuButton.a(var2Lifetime26, (byte) 118);
          }
          var2Lifetime27 = GameplaySpriteHelpers.a(true, "achievement_names,20");
          if (var2Lifetime27 != null) {
            AchievementBrowserScreen.field_s[20] = MenuButton.a(var2Lifetime27, (byte) 124);
          }
          var2Lifetime28 = GameplaySpriteHelpers.a(true, "achievement_names,21");
          if (null != var2Lifetime28) {
            AchievementBrowserScreen.field_s[21] = MenuButton.a(var2Lifetime28, (byte) 122);
          }
          var2Lifetime29 = GameplaySpriteHelpers.a(true, "achievement_names,22");
          if (var2Lifetime29 != null) {
            AchievementBrowserScreen.field_s[22] = MenuButton.a(var2Lifetime29, (byte) 79);
          }
          var2Lifetime30 = GameplaySpriteHelpers.a(true, "achievement_names,23");
          if (null != var2Lifetime30) {
            AchievementBrowserScreen.field_s[23] = MenuButton.a(var2Lifetime30, (byte) 105);
          }
          var2Lifetime31 = GameplaySpriteHelpers.a(!param0, "achievement_names,24");
          if (null != var2Lifetime31) {
            AchievementBrowserScreen.field_s[24] = MenuButton.a(var2Lifetime31, (byte) 94);
          }
          var2Lifetime32 = GameplaySpriteHelpers.a(!param0, "achievement_names,25");
          if (var2Lifetime32 != null) {
            AchievementBrowserScreen.field_s[25] = MenuButton.a(var2Lifetime32, (byte) 76);
          }
          var2Lifetime33 = GameplaySpriteHelpers.a(true, "achievement_names,26");
          if (null != var2Lifetime33) {
            AchievementBrowserScreen.field_s[26] = MenuButton.a(var2Lifetime33, (byte) 115);
          }
          var2Lifetime34 = GameplaySpriteHelpers.a(true, "achievement_names,27");
          if (null != var2Lifetime34) {
            AchievementBrowserScreen.field_s[27] = MenuButton.a(var2Lifetime34, (byte) 118);
          }
          var2Lifetime35 = GameplaySpriteHelpers.a(true, "achievement_names,28");
          if (null != var2Lifetime35) {
            AchievementBrowserScreen.field_s[28] = MenuButton.a(var2Lifetime35, (byte) 86);
          }
          var2Lifetime36 = GameplaySpriteHelpers.a(!param0, "achievement_names,29");
          if (null != var2Lifetime36) {
            AchievementBrowserScreen.field_s[29] = MenuButton.a(var2Lifetime36, (byte) 72);
          }
          var2Lifetime37 = GameplaySpriteHelpers.a(true, "achievement_names,30");
          if (var2Lifetime37 != null) {
            AchievementBrowserScreen.field_s[30] = MenuButton.a(var2Lifetime37, (byte) 118);
          }
          if (param0) {
            QuickChatMenu.h(67);
          }
          var2Lifetime38 = GameplaySpriteHelpers.a(true, "achievement_names,31");
          if (var2Lifetime38 != null) {
            AchievementBrowserScreen.field_s[31] = MenuButton.a(var2Lifetime38, (byte) 85);
          }
          var2Lifetime39 = GameplaySpriteHelpers.a(true, "achievement_names,32");
          if (var2Lifetime39 != null) {
            AchievementBrowserScreen.field_s[32] = MenuButton.a(var2Lifetime39, (byte) 89);
          }
          var2Lifetime40 = GameplaySpriteHelpers.a(!param0, "achievement_names,33");
          if (var2Lifetime40 != null) {
            AchievementBrowserScreen.field_s[33] = MenuButton.a(var2Lifetime40, (byte) 108);
          }
          var2Lifetime41 = GameplaySpriteHelpers.a(true, "achievement_names,34");
          if (var2Lifetime41 != null) {
            AchievementBrowserScreen.field_s[34] = MenuButton.a(var2Lifetime41, (byte) 111);
          }
          var2Lifetime42 = GameplaySpriteHelpers.a(true, "achievement_names,35");
          if (var2Lifetime42 != null) {
            AchievementBrowserScreen.field_s[35] = MenuButton.a(var2Lifetime42, (byte) 78);
          }
          var2Lifetime43 = GameplaySpriteHelpers.a(true, "achievement_names,36");
          if (var2Lifetime43 != null) {
            AchievementBrowserScreen.field_s[36] = MenuButton.a(var2Lifetime43, (byte) 75);
          }
          var2Lifetime44 = GameplaySpriteHelpers.a(!param0, "achievement_names,37");
          if (var2Lifetime44 != null) {
            AchievementBrowserScreen.field_s[37] = MenuButton.a(var2Lifetime44, (byte) 71);
          }
          var2Lifetime45 = GameplaySpriteHelpers.a(true, "achievement_names,38");
          if (null != var2Lifetime45) {
            AchievementBrowserScreen.field_s[38] = MenuButton.a(var2Lifetime45, (byte) 120);
          }
          var2Lifetime46 = GameplaySpriteHelpers.a(true, "achievement_names,39");
          if (var2Lifetime46 != null) {
            AchievementBrowserScreen.field_s[39] = MenuButton.a(var2Lifetime46, (byte) 117);
          }
          var2Lifetime47 = GameplaySpriteHelpers.a(true, "achievement_names,40");
          if (var2Lifetime47 != null) {
            AchievementBrowserScreen.field_s[40] = MenuButton.a(var2Lifetime47, (byte) 95);
          }
          var2Lifetime48 = GameplaySpriteHelpers.a(true, "achievement_names,41");
          if (var2Lifetime48 != null) {
            AchievementBrowserScreen.field_s[41] = MenuButton.a(var2Lifetime48, (byte) 75);
          }
          var2Lifetime49 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,0");
          if (var2Lifetime49 != null) {
            SocialListEntry.field_bc[0] = MenuButton.a(var2Lifetime49, (byte) 95);
          }
          var2Lifetime50 = GameplaySpriteHelpers.a(true, "achievement_criteria,1");
          if (null != var2Lifetime50) {
            SocialListEntry.field_bc[1] = MenuButton.a(var2Lifetime50, (byte) 109);
          }
          var2Lifetime51 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,2");
          if (null != var2Lifetime51) {
            SocialListEntry.field_bc[2] = MenuButton.a(var2Lifetime51, (byte) 100);
          }
          var2Lifetime52 = GameplaySpriteHelpers.a(true, "achievement_criteria,3");
          if (var2Lifetime52 != null) {
            SocialListEntry.field_bc[3] = MenuButton.a(var2Lifetime52, (byte) 92);
          }
          var2Lifetime53 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,4");
          if (null != var2Lifetime53) {
            SocialListEntry.field_bc[4] = MenuButton.a(var2Lifetime53, (byte) 106);
          }
          var2Lifetime54 = GameplaySpriteHelpers.a(true, "achievement_criteria,5");
          if (null != var2Lifetime54) {
            SocialListEntry.field_bc[5] = MenuButton.a(var2Lifetime54, (byte) 127);
          }
          var2Lifetime55 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,6");
          if (var2Lifetime55 != null) {
            SocialListEntry.field_bc[6] = MenuButton.a(var2Lifetime55, (byte) 116);
          }
          var2Lifetime56 = GameplaySpriteHelpers.a(true, "achievement_criteria,7");
          if (var2Lifetime56 != null) {
            SocialListEntry.field_bc[7] = MenuButton.a(var2Lifetime56, (byte) 70);
          }
          var2Lifetime57 = GameplaySpriteHelpers.a(true, "achievement_criteria,8");
          if (null != var2Lifetime57) {
            SocialListEntry.field_bc[8] = MenuButton.a(var2Lifetime57, (byte) 112);
          }
          var2Lifetime58 = GameplaySpriteHelpers.a(true, "achievement_criteria,9");
          if (var2Lifetime58 != null) {
            SocialListEntry.field_bc[9] = MenuButton.a(var2Lifetime58, (byte) 76);
          }
          var2Lifetime59 = GameplaySpriteHelpers.a(true, "achievement_criteria,10");
          if (var2Lifetime59 != null) {
            SocialListEntry.field_bc[10] = MenuButton.a(var2Lifetime59, (byte) 99);
          }
          var2Lifetime60 = GameplaySpriteHelpers.a(true, "achievement_criteria,11");
          if (null != var2Lifetime60) {
            SocialListEntry.field_bc[11] = MenuButton.a(var2Lifetime60, (byte) 78);
          }
          var2Lifetime61 = GameplaySpriteHelpers.a(true, "achievement_criteria,12");
          if (null != var2Lifetime61) {
            SocialListEntry.field_bc[12] = MenuButton.a(var2Lifetime61, (byte) 91);
          }
          var2Lifetime62 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,13");
          if (var2Lifetime62 != null) {
            SocialListEntry.field_bc[13] = MenuButton.a(var2Lifetime62, (byte) 92);
          }
          var2Lifetime63 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,14");
          if (var2Lifetime63 != null) {
            SocialListEntry.field_bc[14] = MenuButton.a(var2Lifetime63, (byte) 107);
          }
          var2Lifetime64 = GameplaySpriteHelpers.a(true, "achievement_criteria,15");
          if (null != var2Lifetime64) {
            SocialListEntry.field_bc[15] = MenuButton.a(var2Lifetime64, (byte) 125);
          }
          var2Lifetime65 = GameplaySpriteHelpers.a(true, "achievement_criteria,16");
          if (null != var2Lifetime65) {
            SocialListEntry.field_bc[16] = MenuButton.a(var2Lifetime65, (byte) 101);
          }
          var2Lifetime66 = GameplaySpriteHelpers.a(true, "achievement_criteria,17");
          if (null != var2Lifetime66) {
            SocialListEntry.field_bc[17] = MenuButton.a(var2Lifetime66, (byte) 92);
          }
          var2Lifetime67 = GameplaySpriteHelpers.a(true, "achievement_criteria,18");
          if (null != var2Lifetime67) {
            SocialListEntry.field_bc[18] = MenuButton.a(var2Lifetime67, (byte) 74);
          }
          var2Lifetime68 = GameplaySpriteHelpers.a(true, "achievement_criteria,19");
          if (var2Lifetime68 != null) {
            SocialListEntry.field_bc[19] = MenuButton.a(var2Lifetime68, (byte) 121);
          }
          var2Lifetime69 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,20");
          if (var2Lifetime69 != null) {
            SocialListEntry.field_bc[20] = MenuButton.a(var2Lifetime69, (byte) 89);
          }
          var2Lifetime70 = GameplaySpriteHelpers.a(true, "achievement_criteria,21");
          if (null != var2Lifetime70) {
            SocialListEntry.field_bc[21] = MenuButton.a(var2Lifetime70, (byte) 106);
          }
          var2Lifetime71 = GameplaySpriteHelpers.a(true, "achievement_criteria,22");
          if (var2Lifetime71 != null) {
            SocialListEntry.field_bc[22] = MenuButton.a(var2Lifetime71, (byte) 81);
          }
          var2Lifetime72 = GameplaySpriteHelpers.a(true, "achievement_criteria,23");
          if (var2Lifetime72 != null) {
            SocialListEntry.field_bc[23] = MenuButton.a(var2Lifetime72, (byte) 122);
          }
          var2Lifetime73 = GameplaySpriteHelpers.a(true, "achievement_criteria,24");
          if (null != var2Lifetime73) {
            SocialListEntry.field_bc[24] = MenuButton.a(var2Lifetime73, (byte) 77);
          }
          var2Lifetime74 = GameplaySpriteHelpers.a(true, "achievement_criteria,25");
          if (null != var2Lifetime74) {
            SocialListEntry.field_bc[25] = MenuButton.a(var2Lifetime74, (byte) 102);
          }
          var2Lifetime75 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,26");
          if (null != var2Lifetime75) {
            SocialListEntry.field_bc[26] = MenuButton.a(var2Lifetime75, (byte) 124);
          }
          var2Lifetime76 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,27");
          if (var2Lifetime76 != null) {
            SocialListEntry.field_bc[27] = MenuButton.a(var2Lifetime76, (byte) 79);
          }
          var2Lifetime77 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,28");
          if (var2Lifetime77 != null) {
            SocialListEntry.field_bc[28] = MenuButton.a(var2Lifetime77, (byte) 81);
          }
          var2Lifetime78 = GameplaySpriteHelpers.a(true, "achievement_criteria,29");
          if (null != var2Lifetime78) {
            SocialListEntry.field_bc[29] = MenuButton.a(var2Lifetime78, (byte) 72);
          }
          var2Lifetime79 = GameplaySpriteHelpers.a(true, "achievement_criteria,30");
          if (var2Lifetime79 != null) {
            SocialListEntry.field_bc[30] = MenuButton.a(var2Lifetime79, (byte) 115);
          }
          var2Lifetime80 = GameplaySpriteHelpers.a(true, "achievement_criteria,31");
          if (var2Lifetime80 != null) {
            SocialListEntry.field_bc[31] = MenuButton.a(var2Lifetime80, (byte) 110);
          }
          var2Lifetime81 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,32");
          if (var2Lifetime81 != null) {
            SocialListEntry.field_bc[32] = MenuButton.a(var2Lifetime81, (byte) 124);
          }
          var2Lifetime82 = GameplaySpriteHelpers.a(true, "achievement_criteria,33");
          if (null != var2Lifetime82) {
            SocialListEntry.field_bc[33] = MenuButton.a(var2Lifetime82, (byte) 85);
          }
          var2Lifetime83 = GameplaySpriteHelpers.a(true, "achievement_criteria,34");
          if (var2Lifetime83 != null) {
            SocialListEntry.field_bc[34] = MenuButton.a(var2Lifetime83, (byte) 72);
          }
          var2Lifetime84 = GameplaySpriteHelpers.a(true, "achievement_criteria,35");
          if (null != var2Lifetime84) {
            SocialListEntry.field_bc[35] = MenuButton.a(var2Lifetime84, (byte) 72);
          }
          var2Lifetime85 = GameplaySpriteHelpers.a(true, "achievement_criteria,36");
          if (var2Lifetime85 != null) {
            SocialListEntry.field_bc[36] = MenuButton.a(var2Lifetime85, (byte) 126);
          }
          var2Lifetime86 = GameplaySpriteHelpers.a(true, "achievement_criteria,37");
          if (null != var2Lifetime86) {
            SocialListEntry.field_bc[37] = MenuButton.a(var2Lifetime86, (byte) 94);
          }
          var2Lifetime87 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,38");
          if (var2Lifetime87 != null) {
            SocialListEntry.field_bc[38] = MenuButton.a(var2Lifetime87, (byte) 114);
          }
          var2Lifetime88 = GameplaySpriteHelpers.a(!param0, "achievement_criteria,39");
          if (var2Lifetime88 != null) {
            SocialListEntry.field_bc[39] = MenuButton.a(var2Lifetime88, (byte) 98);
          }
          var2Lifetime89 = GameplaySpriteHelpers.a(true, "achievement_criteria,40");
          if (null != var2Lifetime89) {
            SocialListEntry.field_bc[40] = MenuButton.a(var2Lifetime89, (byte) 125);
          }
          var2Lifetime90 = GameplaySpriteHelpers.a(true, "achievement_criteria,41");
          if (var2Lifetime90 != null) {
            SocialListEntry.field_bc[41] = MenuButton.a(var2Lifetime90, (byte) 86);
          }
          var2Lifetime91 = GameplaySpriteHelpers.a(true, "achievement_obtained");
          if (var2Lifetime91 != null) {
            MenuButton.a(var2Lifetime91, (byte) 89);
          }
          var2Lifetime92 = GameplaySpriteHelpers.a(true, "gameoptlabels,0");
          if (var2Lifetime92 != null) {
            HighscorePackSelector.field_d[0] = MenuButton.a(var2Lifetime92, (byte) 111);
          }
          var2Lifetime93 = GameplaySpriteHelpers.a(!param0, "gameoptnames,0,0");
          if (null != var2Lifetime93) {
            PlayerBoard.field_jb[0][0] = MenuButton.a(var2Lifetime93, (byte) 87);
          }
          var2Lifetime94 = GameplaySpriteHelpers.a(true, "gameoptnames,0,1");
          if (var2Lifetime94 != null) {
            PlayerBoard.field_jb[0][1] = MenuButton.a(var2Lifetime94, (byte) 101);
          }
          var2Lifetime95 = GameplaySpriteHelpers.a(true, "gameoptnames,0,2");
          if (null != var2Lifetime95) {
            PlayerBoard.field_jb[0][2] = MenuButton.a(var2Lifetime95, (byte) 120);
          }
          var2Lifetime96 = GameplaySpriteHelpers.a(!param0, "gameoptnames,0,3");
          if (null != var2Lifetime96) {
            PlayerBoard.field_jb[0][3] = MenuButton.a(var2Lifetime96, (byte) 112);
          }
          var2Lifetime97 = GameplaySpriteHelpers.a(true, "player_one");
          if (null != var2Lifetime97) {
            we.field_c = MenuButton.a(var2Lifetime97, (byte) 74);
          }
          var2Lifetime98 = GameplaySpriteHelpers.a(true, "player_two");
          if (null != var2Lifetime98) {
            DelayedPacket.field_q = MenuButton.a(var2Lifetime98, (byte) 76);
          }
          var2Lifetime99 = GameplaySpriteHelpers.a(true, "end_of_free");
          if (null != var2Lifetime99) {
            MenuButton.a(var2Lifetime99, (byte) 114);
          }
          var2Lifetime100 = GameplaySpriteHelpers.a(true, "end_of_paid");
          if (null != var2Lifetime100) {
            BirthDateEntryPanel.field_N = MenuButton.a(var2Lifetime100, (byte) 125);
          }
          var2Lifetime101 = GameplaySpriteHelpers.a(true, "game_drawn");
          if (var2Lifetime101 != null) {
            MenuButton.a(var2Lifetime101, (byte) 99);
          }
          var2Lifetime102 = GameplaySpriteHelpers.a(true, "resigned");
          if (var2Lifetime102 != null) {
            CanvasInputCleanup.field_h = MenuButton.a(var2Lifetime102, (byte) 107);
          }
          var2Lifetime103 = GameplaySpriteHelpers.a(!param0, "blank_colon_blank");
          if (null != var2Lifetime103) {
            BrickABrac.field_H = MenuButton.a(var2Lifetime103, (byte) 112);
          }
          var2Lifetime104 = GameplaySpriteHelpers.a(true, "n_of_m");
          if (null != var2Lifetime104) {
            FontRequestHelpers.field_e = MenuButton.a(var2Lifetime104, (byte) 85);
          }
          var2Lifetime105 = GameplaySpriteHelpers.a(!param0, "n_of_unlimited");
          if (null != var2Lifetime105) {
            MouseInput.field_a = MenuButton.a(var2Lifetime105, (byte) 112);
          }
          var2Lifetime106 = GameplaySpriteHelpers.a(!param0, "plus_something");
          if (var2Lifetime106 != null) {
            hh.positiveBoardResultFormat = MenuButton.a(var2Lifetime106, (byte) 84);
          }
          var2Lifetime107 = GameplaySpriteHelpers.a(true, "ellipsis");
          if (var2Lifetime107 != null) {
            MenuButton.a(var2Lifetime107, (byte) 126);
          }
          var2Lifetime108 = GameplaySpriteHelpers.a(true, "go_exclaim");
          if (var2Lifetime108 != null) {
            SecondaryNodeQueue.field_c = MenuButton.a(var2Lifetime108, (byte) 77);
          }
          var2Lifetime109 = GameplaySpriteHelpers.a(!param0, "cool");
          if (null != var2Lifetime109) {
            MultiValueSliderWidget.field_N = MenuButton.a(var2Lifetime109, (byte) 95);
          }
          var2Lifetime110 = GameplaySpriteHelpers.a(true, "awesome");
          if (null != var2Lifetime110) {
            ReflectionCheck.field_o = MenuButton.a(var2Lifetime110, (byte) 107);
          }
          var2Lifetime111 = GameplaySpriteHelpers.a(true, "neat");
          if (null != var2Lifetime111) {
            MonotonicTime.field_a = MenuButton.a(var2Lifetime111, (byte) 127);
          }
          var2Lifetime112 = GameplaySpriteHelpers.a(true, "nice");
          if (var2Lifetime112 != null) {
            EmailLoginCredentials.field_m = MenuButton.a(var2Lifetime112, (byte) 72);
          }
          var2Lifetime113 = GameplaySpriteHelpers.a(true, "genius");
          if (var2Lifetime113 != null) {
            ch.field_j = MenuButton.a(var2Lifetime113, (byte) 123);
          }
          var2Lifetime114 = GameplaySpriteHelpers.a(true, "well_done");
          if (var2Lifetime114 != null) {
            GameTransportActions.field_a = MenuButton.a(var2Lifetime114, (byte) 78);
          }
          var2Lifetime115 = GameplaySpriteHelpers.a(!param0, "sweet");
          if (var2Lifetime115 != null) {
            AppletFlowHelpers.field_f = MenuButton.a(var2Lifetime115, (byte) 81);
          }
          var2Lifetime116 = GameplaySpriteHelpers.a(true, "ninja_skills");
          if (var2Lifetime116 != null) {
            OutgoingPacketHelpers.field_h = MenuButton.a(var2Lifetime116, (byte) 123);
          }
          var2Lifetime117 = GameplaySpriteHelpers.a(true, "oh_no");
          if (null != var2Lifetime117) {
            ArrayWidgetGroup.field_C = MenuButton.a(var2Lifetime117, (byte) 81);
          }
          var2Lifetime118 = GameplaySpriteHelpers.a(true, "oh_dear");
          if (null != var2Lifetime118) {
            AccountContentTransitionLayer.field_ub = MenuButton.a(var2Lifetime118, (byte) 89);
          }
          var2Lifetime119 = GameplaySpriteHelpers.a(!param0, "curses");
          if (var2Lifetime119 != null) {
            PlayerNameChooserPanel.field_P = MenuButton.a(var2Lifetime119, (byte) 97);
          }
          var2Lifetime120 = GameplaySpriteHelpers.a(true, "crumbs");
          if (null != var2Lifetime120) {
            FullscreenDialogHelpers.field_f = MenuButton.a(var2Lifetime120, (byte) 77);
          }
          var2Lifetime121 = GameplaySpriteHelpers.a(!param0, "good_grief");
          if (var2Lifetime121 != null) {
            jh.field_c = MenuButton.a(var2Lifetime121, (byte) 82);
          }
          var2Lifetime122 = GameplaySpriteHelpers.a(true, "instructions_pages,0");
          if (null != var2Lifetime122) {
            TextChoiceDialogStyles.field_b[0] = MenuButton.a(var2Lifetime122, (byte) 95);
          }
          var2Lifetime123 = GameplaySpriteHelpers.a(true, "instructions_pages,1");
          if (var2Lifetime123 != null) {
            TextChoiceDialogStyles.field_b[1] = MenuButton.a(var2Lifetime123, (byte) 78);
          }
          var2Lifetime124 = GameplaySpriteHelpers.a(true, "instructions_pages,2");
          if (var2Lifetime124 != null) {
            TextChoiceDialogStyles.field_b[2] = MenuButton.a(var2Lifetime124, (byte) 97);
          }
          var2Lifetime125 = GameplaySpriteHelpers.a(!param0, "instructions_pages,3");
          if (null != var2Lifetime125) {
            TextChoiceDialogStyles.field_b[3] = MenuButton.a(var2Lifetime125, (byte) 77);
          }
          var2Lifetime126 = GameplaySpriteHelpers.a(true, "instructions_pages,4");
          if (null != var2Lifetime126) {
            TextChoiceDialogStyles.field_b[4] = MenuButton.a(var2Lifetime126, (byte) 76);
          }
          var2Lifetime127 = GameplaySpriteHelpers.a(true, "settings_label");
          if (var2Lifetime127 != null) {
            LoginPanel.field_L = MenuButton.a(var2Lifetime127, (byte) 107);
          }
          var2Lifetime128 = GameplaySpriteHelpers.a(true, "continue_label");
          if (var2Lifetime128 != null) {
            CanvasInputCleanup.field_c = MenuButton.a(var2Lifetime128, (byte) 94);
          }
          var2Lifetime129 = GameplaySpriteHelpers.a(true, "level_select_label");
          if (var2Lifetime129 != null) {
            f.field_b = MenuButton.a(var2Lifetime129, (byte) 88);
          }
          var2Lifetime130 = GameplaySpriteHelpers.a(true, "tutorial_label");
          if (null != var2Lifetime130) {
            gj.field_d = MenuButton.a(var2Lifetime130, (byte) 111);
          }
          var2Lifetime131 = GameplaySpriteHelpers.a(true, "rematch_label");
          if (null != var2Lifetime131) {
            kk.field_a = MenuButton.a(var2Lifetime131, (byte) 72);
          }
          var2Lifetime132 = GameplaySpriteHelpers.a(!param0, "test_error_message");
          if (var2Lifetime132 != null) {
            MenuButton.a(var2Lifetime132, (byte) 123);
          }
          var2Lifetime133 = GameplaySpriteHelpers.a(!param0, "name");
          if (null != var2Lifetime133) {
            DualLinkIterator.field_i = MenuButton.a(var2Lifetime133, (byte) 79);
          }
          var2Lifetime134 = GameplaySpriteHelpers.a(true, "from_level");
          if (var2Lifetime134 != null) {
            SpriteGeometry.field_u = MenuButton.a(var2Lifetime134, (byte) 80);
          }
          var2Lifetime135 = GameplaySpriteHelpers.a(true, "to_level");
          if (null != var2Lifetime135) {
            ba.field_u = MenuButton.a(var2Lifetime135, (byte) 120);
          }
          var2Lifetime136 = GameplaySpriteHelpers.a(!param0, "score");
          if (null != var2Lifetime136) {
            DebouncedValidationSource.field_d = MenuButton.a(var2Lifetime136, (byte) 85);
          }
          var2Lifetime137 = GameplaySpriteHelpers.a(true, "group_0");
          if (null != var2Lifetime137) {
            RadialSelectorWidget.field_T = MenuButton.a(var2Lifetime137, (byte) 79);
          }
          var2Lifetime138 = GameplaySpriteHelpers.a(!param0, "group_1");
          if (null != var2Lifetime138) {
            Widget.field_u = MenuButton.a(var2Lifetime138, (byte) 73);
          }
          var2Lifetime139 = GameplaySpriteHelpers.a(true, "menu_level_label");
          if (var2Lifetime139 != null) {
            FramedMenuScreen.field_t = MenuButton.a(var2Lifetime139, (byte) 119);
          }
          var2Lifetime140 = GameplaySpriteHelpers.a(!param0, "please_select_a_level");
          if (null != var2Lifetime140) {
            RichTextLayout.field_s = MenuButton.a(var2Lifetime140, (byte) 120);
          }
          var2Lifetime141 = GameplaySpriteHelpers.a(!param0, "world_select");
          if (var2Lifetime141 != null) {
            BackgroundScene.field_o = MenuButton.a(var2Lifetime141, (byte) 104);
          }
          var2Lifetime142 = GameplaySpriteHelpers.a(true, "rated_membersonly");
          if (var2Lifetime142 != null) {
            MenuButton.a(var2Lifetime142, (byte) 90);
          }
          var2Lifetime143 = GameplaySpriteHelpers.a(true, "explain_close");
          if (null != var2Lifetime143) {
            Bzip2State.field_v = MenuButton.a(var2Lifetime143, (byte) 118);
          }
          var2Lifetime144 = GameplaySpriteHelpers.a(true, "explain_welcome");
          if (null != var2Lifetime144) {
            BrickGameLayerController.field_d = MenuButton.a(var2Lifetime144, (byte) 78);
          }
          var2Lifetime145 = GameplaySpriteHelpers.a(true, "explain_lateral_move");
          if (var2Lifetime145 != null) {
            SaveResultsPromptScreen.field_y = MenuButton.a(var2Lifetime145, (byte) 73);
          }
          var2Lifetime146 = GameplaySpriteHelpers.a(true, "explain_launch");
          if (null != var2Lifetime146) {
            va.field_d = MenuButton.a(var2Lifetime146, (byte) 90);
          }
          var2Lifetime147 = GameplaySpriteHelpers.a(true, "explain_objective");
          if (null != var2Lifetime147) {
            KeyboardInput.field_b = MenuButton.a(var2Lifetime147, (byte) 99);
          }
          var2Lifetime148 = GameplaySpriteHelpers.a(true, "explain_powerup_bricks");
          if (null != var2Lifetime148) {
            ClientResourceHelpers.field_a = MenuButton.a(var2Lifetime148, (byte) 89);
          }
          var2Lifetime149 = GameplaySpriteHelpers.a(true, "explain_first_release");
          if (null != var2Lifetime149) {
            LoadingProgressDialog.field_db = MenuButton.a(var2Lifetime149, (byte) 104);
          }
          var2Lifetime150 = GameplaySpriteHelpers.a(!param0, "explain_gauges_intercept");
          if (var2Lifetime150 != null) {
            IntNode.field_n = MenuButton.a(var2Lifetime150, (byte) 100);
          }
          var2Lifetime151 = GameplaySpriteHelpers.a(true, "explain_gauges_miss");
          if (var2Lifetime151 != null) {
            ByteStorage.field_c = MenuButton.a(var2Lifetime151, (byte) 98);
          }
          var2Lifetime152 = GameplaySpriteHelpers.a(true, "explain_gauges");
          if (var2Lifetime152 != null) {
            AppletSettingsUiHelpers.field_b = MenuButton.a(var2Lifetime152, (byte) 75);
          }
          var2Lifetime153 = GameplaySpriteHelpers.a(true, "explain_fall_out");
          if (var2Lifetime153 != null) {
            QuickChatHelpDialog.field_Tb = MenuButton.a(var2Lifetime153, (byte) 85);
          }
          var2Lifetime154 = GameplaySpriteHelpers.a(!param0, "explain_ball_charge");
          if (null != var2Lifetime154) {
            CalendarMatchmakingState.field_a = MenuButton.a(var2Lifetime154, (byte) 126);
          }
          var2Lifetime155 = GameplaySpriteHelpers.a(true, "explain_hearts");
          if (null != var2Lifetime155) {
            PopupWidgetLayer.field_U = MenuButton.a(var2Lifetime155, (byte) 78);
          }
          var2Lifetime156 = GameplaySpriteHelpers.a(true, "explain_reverse");
          if (var2Lifetime156 != null) {
            ChatLobbyUiHelpers.field_e = MenuButton.a(var2Lifetime156, (byte) 74);
          }
          var2Lifetime157 = GameplaySpriteHelpers.a(true, "explain_super");
          if (var2Lifetime157 != null) {
            OutgoingPacketHelpers.field_d = MenuButton.a(var2Lifetime157, (byte) 100);
          }
          var2Lifetime158 = GameplaySpriteHelpers.a(true, "explain_extra");
          if (var2Lifetime158 != null) {
            ProxyAuthenticationRequiredException.field_c = MenuButton.a(var2Lifetime158, (byte) 101);
          }
          var2Lifetime159 = GameplaySpriteHelpers.a(!param0, "explain_distort");
          if (null != var2Lifetime159) {
            ch.field_i = MenuButton.a(var2Lifetime159, (byte) 121);
          }
          var2Lifetime160 = GameplaySpriteHelpers.a(true, "explain_shrink");
          if (null != var2Lifetime160) {
            AppletGameShell.field_f = MenuButton.a(var2Lifetime160, (byte) 112);
          }
          var2Lifetime161 = GameplaySpriteHelpers.a(true, "explain_trampoline");
          if (var2Lifetime161 != null) {
            PauseMenuScreen.field_v = MenuButton.a(var2Lifetime161, (byte) 85);
          }
          var2Lifetime162 = GameplaySpriteHelpers.a(true, "explain_wipeout");
          if (null != var2Lifetime162) {
            SecondaryHashTable.field_a = MenuButton.a(var2Lifetime162, (byte) 100);
          }
          var2Lifetime163 = GameplaySpriteHelpers.a(!param0, "explain_multiball");
          if (null != var2Lifetime163) {
            WidgetTheme.field_d = MenuButton.a(var2Lifetime163, (byte) 90);
          }
          var2Lifetime164 = GameplaySpriteHelpers.a(true, "explain_speedup");
          if (var2Lifetime164 != null) {
            MusicCrossfadeStream.field_w = MenuButton.a(var2Lifetime164, (byte) 99);
          }
          var2Lifetime165 = GameplaySpriteHelpers.a(true, "explain_control");
          if (null != var2Lifetime165) {
            AppletResourceHelpers.field_b = MenuButton.a(var2Lifetime165, (byte) 97);
          }
          var2Lifetime166 = GameplaySpriteHelpers.a(true, "explain_slowdown");
          if (null != var2Lifetime166) {
            TimedSplashScreen.field_s = MenuButton.a(var2Lifetime166, (byte) 83);
          }
          var2Lifetime167 = GameplaySpriteHelpers.a(true, "explain_sticky");
          if (var2Lifetime167 != null) {
            RadialSelectorWidget.field_V = MenuButton.a(var2Lifetime167, (byte) 114);
          }
          var2Lifetime168 = GameplaySpriteHelpers.a(true, "explain_unsuper_ball");
          if (null != var2Lifetime168) {
            MatchCompleteScreen.field_F = MenuButton.a(var2Lifetime168, (byte) 73);
          }
          var2Lifetime169 = GameplaySpriteHelpers.a(true, "explain_extra_bricks");
          if (var2Lifetime169 != null) {
            MeshAttributeRecord.field_d = MenuButton.a(var2Lifetime169, (byte) 111);
          }
          var2Lifetime170 = GameplaySpriteHelpers.a(true, "explain_grow");
          if (var2Lifetime170 != null) {
            MusicPatch.field_q = MenuButton.a(var2Lifetime170, (byte) 102);
          }
          var2Lifetime171 = GameplaySpriteHelpers.a(true, "explain_plasma");
          if (null != var2Lifetime171) {
            GameScreen.field_g = MenuButton.a(var2Lifetime171, (byte) 92);
          }
          var2Lifetime172 = GameplaySpriteHelpers.a(!param0, "keycode_player0_left");
          if (var2Lifetime172 != null) {
            EmailAvailabilityRequest.field_f = var2Lifetime172[0] & 255;
          }
          var2Lifetime173 = GameplaySpriteHelpers.a(true, "keycode_player0_right");
          if (null != var2Lifetime173) {
            HorizontalFrameHelpers.field_b = var2Lifetime173[0] & 255;
          }
          var2Lifetime174 = GameplaySpriteHelpers.a(true, "keycode_player0_launch");
          if (var2Lifetime174 != null) {
            PcmPlayerService.field_e = var2Lifetime174[0] & 255;
          }
          var2Lifetime175 = GameplaySpriteHelpers.a(!param0, "keycode_player1_left");
          if (null != var2Lifetime175) {
            LogoRenderHelpers.field_b = 255 & var2Lifetime175[0];
          }
          var2Lifetime176 = GameplaySpriteHelpers.a(true, "keycode_player1_right");
          if (null != var2Lifetime176) {
            QuickChatPopupHelpers.field_d = 255 & var2Lifetime176[0];
          }
          var2Lifetime177 = GameplaySpriteHelpers.a(!param0, "keycode_player1_launch");
          SaveResultsPromptScreen.field_t = null;
          if (var2Lifetime177 != null) {
            VolcanicBackground.field_u = var2Lifetime177[0] & 255;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_793_0 = var2_ref;
          stackIn_793_1 = new StringBuilder().append("og.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_794_2 = "null";
          } else {
            stackIn_794_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_793_0), ((StringBuilder) (Object) stackIn_793_1).append(stackIn_794_2).append(')').toString());
        }
        if (AppletGameShell.field_l != 0) {
          BrickABrac.field_J = (var3 == 0);
        }
    }

    final void layoutMenuChain(int firstItemIndex, int x, int bottomY, int iconLabelGap, int itemInset, int animationAnchorY) {
        RuntimeException decompiledCaughtException = null;
        int itemIndex = 0;
        RuntimeException var7 = null;
        int submenuBottomY = 0;
        int unusedGameFlag = 0;
        int submenuItemCount;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          this.menuWidth = this.contentWidth + 2 * itemInset;
          this.setBounds(this.preferredHeight, -this.preferredHeight + bottomY, x, this.menuWidth, (byte) 64);
          if (animationAnchorY != this.animationAnchorY) {
            this.animationAnchorY = animationAnchorY;
            this.setExpansionTicks(this.remainingExpansionTicks, (byte) -81);
          }
          itemIndex = firstItemIndex;
          while (itemIndex < this.itemCount) {
            this.items[itemIndex].setIconLabelBounds(-10411, this.items[itemIndex].localY, itemInset, iconLabelGap, 0, this.rowHeight, this.menuWidth);
            itemIndex++;
            if (unusedGameFlag != 0) {
              return;
            }
          }
          if (this.selectedItem != -1 &&
            this.submenus[this.selectedItem] != null) {
            submenuItemCount = this.submenus[this.selectedItem].itemCount;
            submenuBottomY = this.localY + (submenuItemCount + this.selectedItem) * this.rowHeight;
            while (bottomY < submenuBottomY) {
              submenuBottomY = submenuBottomY - this.rowHeight;
              if (unusedGameFlag != 0) {
                return;
              }
            }
            this.submenus[this.selectedItem].layoutMenuChain(0, this.menuWidth + x, submenuBottomY, iconLabelGap, itemInset, this.items[this.selectedItem].screenY);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var7), "og.C(" + firstItemIndex + ',' + x + ',' + bottomY + ',' + iconLabelGap + ',' + itemInset + ',' + animationAnchorY + ')');
        }
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 107) {
            backgroundMusicSampleArchive = (ResourceArchive) null;
          }
          LevelPack.b(124);
          if (null != CacheIoRequest.windowCanvas) {
            CanvasInputCleanup.detachCanvasInput(false, CacheIoRequest.windowCanvas);
          }
          ic.disableKeyboardInput((byte) -79);
          FileCacheStore.a(5);
          GameplayAudioEvent.a(param0 + 14569);
          if (GameTransportActions.canUseGameTransport(param0 - 104)) {
            TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, 1);
            ActivityIndicatorWidget.flushTransportPackets(0, 10000);
          }
          hn.closeGameTransport((byte) 53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "og.K(" + param0 + ')');
        }
    }

    final boolean handleShortcutKey(int messageOpcode, int filterOpcode, byte obfuscationGuard) {
        int backspaceFlag = 0;
        boolean submenuHandled = false;
        int shortcutOrResult = 0;
        RuntimeException decompiledCaughtException = null;
        int backspace = 0;
        RuntimeException var4 = null;
        int shortcutCharacter = 0;
        int itemIndex = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          backspaceFlag = (MeshAttributeRecord.currentKeyCode != 85) ? 0 : 1;
          backspace = backspaceFlag;
          if (this.openSubmenu != null) {
            if (backspace != 0 &&
              this.openSubmenu.selectedItem == -1) {
              this.resetSelection((byte) 41);
              this.setExpansionTicks(0, (byte) -81);
              return true;
            }
            submenuHandled = this.openSubmenu.handleShortcutKey(messageOpcode, filterOpcode, (byte) -126);
            return submenuHandled;
          }
          if (this.openSubmenu == null &&
            hd.quickChatMenu == this &&
            backspace != 0) {
            GamePresentationHelpers.closeQuickChatMenu(-1);
            return true;
          }
          if (obfuscationGuard != -126) {
            this.messageIds = (int[]) null;
          }
          boolean finishedShortcutScan = true;
          shortcutCharacter = ResourceArchiveFactory.currentKeyCharacter;
          if (shortcutCharacter > 0) {
            if (~SoundCache.field_h == ~shortcutCharacter) {
              shortcutCharacter = 63;
            }
            itemIndex = 0;
            while (itemIndex < this.shortcuts.length) {
              shortcutOrResult = shortcutCharacter;
              if (unusedGameFlag != 0) {
                finishedShortcutScan = false;
                break;
              }
              if (shortcutOrResult == this.shortcuts[itemIndex]) {
                this.activateItem(filterOpcode, itemIndex, 0, messageOpcode);
                return true;
              }
              itemIndex++;
            }
          }
          if (finishedShortcutScan) {
            shortcutOrResult = 0;
          }
          return shortcutOrResult != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4), "og.D(" + messageOpcode + ',' + filterOpcode + ',' + obfuscationGuard + ')');
        }
    }

    final int getOpenChainWidth(byte obfuscationGuard) {
        RuntimeException var2 = null;
        int ownWidth = 0;
        int submenuWidth = 0;
        int chainWidth = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -57) {
            this.layoutMenuChain(-64, -111, 97, -110, -124, 103);
          }
          ownWidth = this.menuWidth;
          if (null != this.openSubmenu) {
            submenuWidth = this.openSubmenu.getOpenChainWidth((byte) -117);
          } else {
            submenuWidth = 0;
          }
          chainWidth = ownWidth + submenuWidth;
          return chainWidth;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "og.G(" + obfuscationGuard + ')');
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          return;
        }
        try {
          field_Yb = null;
          field_ac = null;
          backgroundMusicSampleArchive = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "og.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3, int param4, int param5, int param6) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        try {
          param5 = param5 + param3.offsetX;
          param6 = param6 + param3.offsetY;
          var7_int = param5 + param6 * Rasterizer2D.width;
          var8 = param3.height;
          var9 = param3.height;
          var10 = param3.width;
          var11 = 0;
          var12 = -var10;
          var13 = 0;
          if (param0 > -111) {
            return;
          }
          var14 = param1 << 8;
          var15 = (param2 - param1 << 8) / var9;
          if (Rasterizer2D.clipTop > param6) {
            var16 = Rasterizer2D.clipTop - param6;
            param6 = Rasterizer2D.clipTop;
            var14 = var14 + var16 * var15;
            if (var16 < var9) {
              var8 = param3.pixels[var16];
            }
            var9 = var9 - var16;
            var7_int = var7_int + Rasterizer2D.width * var16;
          }
          if (var10 + param5 > Rasterizer2D.clipRight) {
            var13 = var13 - (var10 + param5 - Rasterizer2D.clipRight);
          }
          if (var9 + param6 > Rasterizer2D.clipBottom) {
            var9 = var9 - (-Rasterizer2D.clipBottom + var9 + param6);
          }
          if (param5 < Rasterizer2D.clipLeft) {
            var12 = var12 + (-param5 + Rasterizer2D.clipLeft);
          }
          if (var12 < var13 &&
            0 < var9) {
            AgeValidator.a(Rasterizer2D.pixels, var15, var13, var11, var9, var14, param3.pixels, var10, var12, var8, 8, param4, var7_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("og.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_ac = "Players";
    }
}
