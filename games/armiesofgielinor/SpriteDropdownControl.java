/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteDropdownControl extends SpriteControlNode {
    private SpriteDropdownMenu menu;
    private boolean hovered;
    static String field_G;
    static int field_B;
    private boolean enabled;
    private RgbSprite[] arrowSprites;
    private boolean expanded;
    static boolean field_s;
    private int selectedIndex;
    private RgbSprite[] frameSprites;
    private int y;
    private int x;
    private int[] colours;
    static String[] equipmentTutorialMessages;
    static String field_J;
    private int height;
    private boolean inputChanged;
    private int width;
    private boolean layoutEnabled;
    static int field_u;
    static String field_I;
    static ClientUiComponent field_v;
    private BinaryBitmapFont font;
    static String field_w;

    private final RgbSprite getArrowSprite(int obfuscationGuard) {
        int spriteIndex = 0;
        if (this.hovered) {
          spriteIndex = 1;
        }
        if (this.expanded) {
          spriteIndex = 2;
        }
        RgbSprite sprite = this.arrowSprites[spriteIndex];
        if (obfuscationGuard != 3) {
          this.getWidth(-61);
        }
        return sprite;
    }

    final boolean isMenuOpen(byte obfuscationGuard) {
        if (obfuscationGuard != 97) {
          return false;
        }
        return this.menu.isOpen(false);
    }

    final boolean containsControlOrMenu(int pointerX, int obfuscationGuard, int pointerY) {
        int var4;
        int stackIn_9_0 = 0;
        int var4Lifetime1;
        if (obfuscationGuard != 2) {
          this.x = 9;
        }
        if (!this.menu.isOpen(false)) {
          return this.containsPointer(pointerX, obfuscationGuard ^ 84, pointerY);
        }
        var4 = 0;
        if (!this.containsOption(pointerY, 0, pointerX)) {
          stackIn_9_0 = (this.menu.isPointerOverScrollBars(31127, pointerX, pointerY)) ? 1 : 0;
        } else {
          stackIn_9_0 = 1;
        }
        var4Lifetime1 = stackIn_9_0;
        return var4Lifetime1 != 0;
    }

    final void setPosition(int obfuscationGuard, int x, int y) {
        this.x = x;
        int var4 = 79 % ((obfuscationGuard - 15) / 32);
        this.y = y;
        this.menu.setPosition(x, 112, y);
    }

    final int getHeight(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_J = (String) null;
        }
        return this.height;
    }

    final boolean isInputEnabled(int obfuscationGuard) {
        boolean stackIn_7_0 = false;
        if (obfuscationGuard != 260) {
          return true;
        }
        stackIn_7_0 = (this.enabled) || (this.menu.isInputEnabled(85));
        return stackIn_7_0;
    }

    final void disableInput(int obfuscationGuard) {
        this.enabled = false;
        if (obfuscationGuard != 32) {
          return;
        }
        this.menu.disableInput(true);
    }

    final static boolean c(int param0, int param1) {
        if (param1 != 2) {
          return true;
        }
        return 2 <= param0 ? true : false;
    }

    final void drawControl(byte obfuscationGuard) {
        this.drawBackground(false);
        this.drawExpandedMenu(4);
        int var2 = -124 % ((75 - obfuscationGuard) / 49);
    }

    final void setSelectedIndex(int obfuscationGuard, int index) {
        if (obfuscationGuard != 0) {
          this.enabled = true;
        }
        this.selectedIndex = index;
    }

    final boolean hasInputChanged(byte obfuscationGuard) {
        if (obfuscationGuard <= 72) {
          field_w = (String) null;
        }
        return this.inputChanged;
    }

    private final void applyPress(int obfuscationGuard, boolean pressed) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = 114 / ((44 - obfuscationGuard) / 34);
        this.inputChanged = false;
        if (this.enabled) {
          if (!pressed) {
          } else {
            if (this.menu.hasSelectionChanged(-37)) {
              this.selectedIndex = this.menu.getSelectedIndex(78);
              this.expanded = false;
              this.menu.closeMenu(0);
              this.computeSize(10009);
              this.inputChanged = true;
            } else {
              if (!this.hovered) {
              } else {
                this.expanded = !this.expanded ? true : false;
                if (this.expanded) {
                  this.menu.openMenu(56);
                } else {
                  this.menu.closeMenu(0);
                }
                if (!this.expanded) {
                  this.menu.setSelectedIndex(0, (byte) 39);
                }
                this.inputChanged = true;
              }
            }
          }
        }
        if (!this.enabled) {
          if (this.menu.isOpen(false) &&
            pressed) {
            this.menu.closeMenu(0);
            this.inputChanged = true;
            this.expanded = false;
          }
          return;
        }
    }

    private final void drawExpandedMenu(int obfuscationGuard) {
        if (!this.expanded) {
          return;
        }
        this.menu.drawMenu(6815);
        if (obfuscationGuard != 4) {
          this.drawSelectedText((byte) -72);
          return;
        }
    }

    private final void initializeLayout(byte obfuscationGuard) {
        this.layoutEnabled = true;
        this.resetSelection(0);
        this.refreshSize(false);
        if (obfuscationGuard != -120) {
          this.y = 118;
          return;
        }
    }

    final boolean containsOption(int pointerY, int obfuscationGuard, int pointerX) {
        if (obfuscationGuard != 0) {
          this.initializeLayout((byte) -118);
        }
        return this.menu.findOptionAt(pointerY, (byte) 113, pointerX) >= 0 ? true : false;
    }

    final void setOptions(String[] options, int obfuscationGuard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -29799) {
            return;
          }
          this.menu.setOptions((byte) 126, options);
          this.resetSelection(0);
          this.refreshSize(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("r.V(");
          if (options == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void drawSelectedText(byte obfuscationGuard) {
        int leftBorder = this.frameSprites[3].canvasWidth;
        int spaceWidth = this.font.characterWidth(' ');
        int textX = this.x - (-leftBorder - spaceWidth);
        int topBorder = this.frameSprites[1].canvasHeight;
        if (obfuscationGuard != 108) {
          this.selectedIndex = -29;
        }
        int textPaddingY = 2;
        int fontAscent = this.font.maxAscent;
        int baselineY = topBorder + (this.y - (-textPaddingY - fontAscent));
        int textColour = this.colours[0];
        if (this.expanded) {
          textColour = this.colours[2];
        }
        if (this.hovered) {
          textColour = this.colours[1];
        }
        String selectedText = this.menu.getOptionText((byte) -96, this.selectedIndex);
        this.font.drawText(selectedText, textX, baselineY, textColour, -1);
    }

    final int getSelectedIndex(int obfuscationGuard) {
        if (obfuscationGuard != 5) {
          field_v = (ClientUiComponent) null;
        }
        return this.selectedIndex;
    }

    final static void snapshotKeyboard(boolean obfuscationGuard) {
        Object listenerLock = null;
        int keyEvent = 0;
        int obfuscationControl = 0;
        Throwable caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          listenerLock = QuickChatCategory.keyboardListener;
          synchronized (listenerLock) {
            SummonAction.keyEventReadIndex = FullscreenFocusCanvas.keyEventFrameEndIndex;
            if (!obfuscationGuard) {
              SpriteDropdownControl.d((byte) 47);
            }
            fc.keyboardIdleTicks = fc.keyboardIdleTicks + 1;
            if (us.keyStateWriteIndex < 0) {
              for (keyEvent = 0; keyEvent < 112; keyEvent++) {
                br.heldKeys[keyEvent] = false;
              }
              us.keyStateWriteIndex = cc.keyStateReadIndex;
            } else {
              while (cc.keyStateReadIndex != us.keyStateWriteIndex) {
                keyEvent = SphinxActionRequest.keyStateEvents[cc.keyStateReadIndex];
                cc.keyStateReadIndex = 127 & 1 + cc.keyStateReadIndex;
                if (0 > keyEvent) {
                  br.heldKeys[~keyEvent] = false;
                  continue;
                }
                br.heldKeys[keyEvent] = true;
              }
            }
            FullscreenFocusCanvas.keyEventFrameEndIndex = ProgressDialog.keyEventWriteIndex;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = (RuntimeException) (Object) caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "r.G(" + obfuscationGuard + ')');
        }
    }

    public static void d(byte param0) {
        equipmentTutorialMessages = null;
        if (param0 != -11) {
          return;
        }
        field_J = null;
        field_I = null;
        field_w = null;
        field_G = null;
        field_v = null;
    }

    final boolean containsPointer(int pointerX, int obfuscationGuard, int pointerY) {
        int var4 = -56 % ((17 - obfuscationGuard) / 60);
        return ChatMessage.a(pointerY, this.x, this.y, pointerX, this.width, (byte) -99, this.height);
    }

    final void enableInput(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return;
        }
        this.enabled = true;
        this.menu.enableInput(83);
    }

    final int getWidth(int obfuscationGuard) {
        if (obfuscationGuard != -18332) {
          this.x = -93;
        }
        return this.width;
    }

    private final void refreshSize(boolean obfuscationGuard) {
        this.computeSize(10009);
        if (obfuscationGuard) {
          return;
        }
    }

    private final void drawArrow(byte obfuscationGuard) {
        RgbSprite arrow = this.getArrowSprite(3);
        int rightBorder = this.frameSprites[5].canvasWidth;
        int arrowWidth = arrow.canvasWidth;
        int arrowX = -rightBorder + this.x - (-this.width + arrowWidth);
        int topBorder = this.frameSprites[1].canvasHeight;
        if (obfuscationGuard != -36) {
          return;
        }
        int arrowY = topBorder + this.y;
        arrow.drawTransparent(arrowX, arrowY);
    }

    private final void updateHover(int pointerY, int pointerX, int obfuscationGuard) {
        boolean stackIn_9_1 = false;
        this.hovered = false;
        if (obfuscationGuard != 4) {
          this.getHeight(false);
        }
        if (!this.enabled) {
          return;
        }
        stackIn_9_1 = (this.containsPointer(pointerX, obfuscationGuard ^ -82, pointerY)) && (!this.isMenuOpen((byte) 97));
        this.hovered = stackIn_9_1;
    }

    private final void drawBackground(boolean obfuscationGuard) {
        SoftwareRaster.f(this.x, this.y, this.width, this.height, 7829367);
        ReportAbuseDialog.drawNineSlice(this.frameSprites, this.height, this.x, (byte) -47, this.y, this.width);
        if (obfuscationGuard) {
          this.colours = (int[]) null;
        }
        this.drawSelectedText((byte) 108);
        this.drawArrow((byte) -36);
    }

    final void updateInput(boolean pressed, int obfuscationGuard, int pointerY, int pointerX, boolean held, int wheelDelta) {
        if (!this.layoutEnabled) {
          this.resetSelection(obfuscationGuard ^ -18596);
          return;
        }
        this.updateHover(pointerY, pointerX, 4);
        this.menu.updateInput(pointerY, held, pressed, 0, pointerX, wheelDelta);
        this.applyPress(-34, pressed);
        if (obfuscationGuard != -18596) {
          this.y = -86;
          return;
        }
    }

    private final void resetSelection(int menuIndex) {
        this.selectedIndex = 0;
        this.menu.setSelectedIndex(menuIndex, (byte) 46);
        this.hovered = false;
        this.expanded = false;
    }

    final static Boolean l(int param0) {
        if (param0 != -11506) {
          field_G = (String) null;
        }
        Boolean var1 = CampaignMenu.field_s;
        CampaignMenu.field_s = null;
        return var1;
    }

    SpriteDropdownControl(RgbSprite[] frameSprites, RgbSprite[] arrowSprites, BinaryBitmapFont font, int[] colours, String[] options, int x, int y) {
        RuntimeException var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.frameSprites = frameSprites;
          this.arrowSprites = arrowSprites;
          this.colours = colours;
          this.font = font;
          this.menu = new SpriteDropdownMenu(frameSprites, arrowSprites, font, colours, options, x, y);
          this.setPosition(-20, x, y);
          this.initializeLayout((byte) -120);
          this.disableInput(32);
          this.inputChanged = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_5_0 = var8;
          stackIn_5_1 = new StringBuilder().append("r.<init>(");
          if (frameSprites == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (arrowSprites == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (font == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (colours == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (options == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(x).append(',').append(y).append(')').toString());
        }
    }

    private final void computeSize(int obfuscationGuard) {
        int maximumWidthValue = 0;
        int maximumTextWidth;
        int optionIndex;
        int frameBorderWidth;
        String optionText;
        RgbSprite arrow;
        int textWidth;
        int arrowWidth;
        int fontHeight;
        int rowPadding;
        int arrowHeight;
        int frameBorderHeight;
        int obfuscationControl;
        int spacePadding;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        maximumTextWidth = 0;
        for (optionIndex = 0; this.menu.getOptionCount(117) > optionIndex; optionIndex++) {
          optionText = this.menu.getOptionText((byte) -126, optionIndex);
          textWidth = this.font.textWidth(optionText);
          maximumWidthValue = (maximumTextWidth >= textWidth) ? maximumTextWidth : textWidth;
          maximumTextWidth = maximumWidthValue;
        }
        spacePadding = this.font.characterWidth(' ') << 1;
        if (obfuscationGuard != 10009) {
          return;
        }
        frameBorderWidth = this.frameSprites[3].canvasWidth + this.frameSprites[5].canvasWidth;
        arrow = this.getArrowSprite(3);
        arrowWidth = arrow.canvasWidth;
        this.width = arrowWidth + frameBorderWidth + maximumTextWidth + spacePadding;
        fontHeight = this.font.maxDescent + this.font.maxAscent;
        rowPadding = 4;
        arrowHeight = arrow.canvasHeight;
        this.height = rowPadding + fontHeight;
        if (arrowHeight > this.height) {
          this.height = arrowHeight;
        }
        frameBorderHeight = this.frameSprites[7].canvasHeight + this.frameSprites[1].canvasHeight;
        this.height = frameBorderHeight + this.height;
        return;
    }

    static {
        field_J = "It's a Draw!";
        field_G = "To configure your coat of arms, please log in or create a free account.";
        equipmentTutorialMessages = new String[]{"Ah, there you are. After your success at Eastbridge, I thought you could use some training in specialist equipment. Rest assured that the items used in this tutorial or in hotseat mode will not be taken from your stock.", "If you click on the equipment icon beside the game statistics it will open up the equipment menu.", "Please pick your gods before we begin the tutorial.", "So, your first bit of kit is called <%0>. <%1> <%2>", "Next on the roster you have <%0>. <%1> <%2>", "In the middle there you see the icon for <%0>. <%1> <%2>", "Okay, here we have <%0>. <%1> <%2>", "And last but not least, you've got <%0>. <%1> <%2>", "Now that you have selected this item, click on the enemy unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on the allied unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on a village you've captured. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on an enemy-occupied tower or village. Don't click on a portal, though - it's hard to cause civil unrest in a random explosion of magical particles. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the tile you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the area you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click where you want to build a bridge. This should be a tile of water with shore on only one side, so the bridge knows which way to unfurl. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an area containing bones. These bones will become your army of the undead. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the flying unit you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a cyclops. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a Kalphite Queen. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a goblin priest. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an ogre shaman. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an elf songstress. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "You can use this item right now. Just click the icon for <%0> and you'll see.", "You seem to have brought a shrine spell into battle for a god you aren't actually worshipping. Let's move swiftly on, shall we?", "You seem to have left some empty space in your equipment setup. You don't have to purchase equipment to be trained in it, simply equip it and you can try it here for free. Let's move swiftly on, shall we?", "This item can only be used on a unit that follows a god you have not selected. Let's move on to the next item, shall we?", "To activate this, you must first click on the <%0> icon.", "<%0> In a real battle you can only use each of these items once, but for training purposes I've provided an unlimited supply.", "There you go. Feel free to experiment with this item before moving on.", "As you can see, your unit now has a new movement area highlighted. When you order this unit to move within this area, the item will be used.", "Well, that's your equipment training complete. You're always welcome to return here with different equipment for another lesson.", "Ah, I see you brought more than one <%0>. I've already instructed you in how to use it, so we'll move on when you're ready.", "Oops, you seem to have clicked a different piece of equipment. Let's try again. <%0>", "Oops, you seem to have deselected this equipment. Let's try again. <%0>"};
        field_I = "Biggest bully";
        field_B = 2;
        field_w = "Magic robes";
    }
}
