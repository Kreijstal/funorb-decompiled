/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteDropdownMenu {
    private boolean open;
    private int displayX;
    private int optionCount;
    private boolean selectionChanged;
    private int displayY;
    private int preferredWidth;
    private int[] colours;
    private int displayWidth;
    private int visibleEndIndex;
    static String field_s;
    private int requestedY;
    private BinaryBitmapFont font;
    private int requestedX;
    private String[] options;
    private int displayHeight;
    private int preferredHeight;
    private int horizontalOffset;
    static int field_v;
    private int hoveredIndex;
    private boolean enabled;
    private int visibleStartIndex;
    private RgbSprite[] frameSprites;
    private SpriteScrollBar horizontalScrollBar;
    private SpriteScrollBar verticalScrollBar;
    private int[] savedClip;
    private int selectedIndex;
    private RgbSprite[] arrowSprites;

    private final boolean needsVerticalScrollBar(int obfuscationGuard) {
        if (this.fitsVerticalBounds(4)) {
          return false;
        }
        if (obfuscationGuard >= -20) {
          this.updateLayout(86);
        }
        if (!this.canTranslateVertically((byte) -88)) {
          return true;
        }
        return false;
    }

    private final int getContentTop(int obfuscationGuard) {
        int topBorder = this.frameSprites[1].canvasHeight;
        int contentTop = this.displayY + topBorder;
        if (obfuscationGuard >= -47) {
          this.open = true;
        }
        return contentTop;
    }

    public static void w(int param0) {
        field_s = null;
        if (param0 != 0) {
          field_v = -114;
        }
    }

    private final boolean canTranslateHorizontally(int obfuscationGuard) {
        int discarded$0 = 0;
        int var2 = this.requestedX;
        int var3 = this.requestedX + this.preferredWidth;
        if (!(SoftwareRaster.clipLeft <= var2)) {
          var3 = var3 + (SoftwareRaster.clipLeft - var2);
          if (SoftwareRaster.clipRight >= var3) {
            return true;
          }
          return false;
        }
        if (obfuscationGuard != -2) {
          discarded$0 = this.getContentHeight(-95);
        }
        var3 = this.preferredWidth + this.requestedX;
        if (!(SoftwareRaster.clipRight >= var3)) {
          var2 = var2 - (-SoftwareRaster.clipRight + var3);
          return SoftwareRaster.clipLeft <= var2 ? true : false;
        }
        return true;
    }

    private final int getMaximumTextWidth(int obfuscationGuard) {
        int guardContentHeight = 0;
        int optionIndex = 0;
        int maximumWidth;
        String optionText;
        int textWidth;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        maximumWidth = 0;
        if (obfuscationGuard < 109) {
          guardContentHeight = this.getContentHeight(-54);
        }
        for (optionIndex = 0; optionIndex < this.optionCount; optionIndex++) {
          optionText = this.options[optionIndex];
          textWidth = this.font.textWidth(optionText);
          if (maximumWidth < textWidth) {
            maximumWidth = textWidth;
          }
        }
        return maximumWidth;
    }

    final boolean isOpen(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.findOptionAt(5, (byte) 18, -39);
        }
        return this.open;
    }

    final String getOptionText(byte obfuscationGuard, int index) {
        int var3 = 77 % ((-25 - obfuscationGuard) / 56);
        return this.options[index];
    }

    final void drawMenu(int obfuscationGuard) {
        if (!this.open) {
          return;
        }
        this.drawFrame(7);
        this.drawOptions(obfuscationGuard - 6812);
        if (obfuscationGuard != 6815) {
          return;
        }
        this.drawScrollBars((byte) -8);
    }

    private final void computePreferredWidth(int obfuscationGuard) {
        int maximumTextWidth = this.getMaximumTextWidth(114);
        int spacePadding = this.font.characterWidth(' ') << 1;
        int frameBorderWidth = this.frameSprites[3].canvasWidth + this.frameSprites[5].canvasWidth;
        if (obfuscationGuard != 0) {
          return;
        }
        int scrollBarThickness = this.verticalScrollBar.getThickness(obfuscationGuard ^ 26787);
        this.preferredWidth = maximumTextWidth + (spacePadding + scrollBarThickness) + frameBorderWidth;
    }

    final void setSelectedIndex(int index, byte obfuscationGuard) {
        this.selectedIndex = index;
        int var3 = -28 % ((-31 - obfuscationGuard) / 34);
    }

    private final void configureVerticalScroll(int obfuscationGuard) {
        boolean guardFitsVertical = false;
        int rowHeight = this.getRowHeight((byte) -88);
        int contentHeight = this.getContentHeight(1);
        if (obfuscationGuard < 9) {
          guardFitsVertical = this.fitsVerticalBounds(-105);
        }
        int visibleRows = contentHeight / rowHeight;
        this.verticalScrollBar.configureRange(0, (byte) 47, visibleRows, this.optionCount, 1);
        this.visibleStartIndex = this.verticalScrollBar.getOffset(false);
        this.visibleEndIndex = this.visibleStartIndex + this.verticalScrollBar.getVisibleExtent((byte) 102);
    }

    private final RgbSprite[] copyHorizontalArrows(boolean obfuscationGuard) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = this.arrowSprites.length;
        RgbSprite[] var3 = new RgbSprite[var2];
        if (obfuscationGuard) {
          this.frameSprites = (RgbSprite[]) null;
        }
        for (var4 = 0; var2 > var4; var4++) {
          var3[var4] = this.arrowSprites[var4].copySprite();
          var3[var4].rotateCounterClockwise();
        }
        return var3;
    }

    private final void applyInput(boolean pressed, boolean held, byte obfuscationGuard, int wheelDelta) {
        this.verticalScrollBar.updateInput(pressed, wheelDelta, -2, held);
        this.horizontalScrollBar.updateInput(pressed, wheelDelta, -2, held);
        this.readScrollOffsets((byte) 116);
        if (obfuscationGuard != 16) {
          return;
        }
        this.selectionChanged = false;
        if (!this.open) {
          return;
        }
        if (!this.enabled) {
          return;
        }
        if (!pressed) {
          return;
        }
        if (this.hoveredIndex >= 0) {
          this.selectedIndex = this.hoveredIndex;
          this.selectionChanged = true;
        }
    }

    final void setOptions(byte obfuscationGuard, String[] options) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.options = options;
          var3_int = 54 % ((15 - obfuscationGuard) / 63);
          this.selectedIndex = 0;
          this.optionCount = this.options.length;
          this.computePreferredSize(0);
          this.refreshOptionLayout(-101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ng.N(").append(obfuscationGuard).append(',');
          if (options == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final boolean fitsVerticalBounds(int obfuscationGuard) {
        int var2 = this.requestedY;
        int var3 = this.requestedY + this.preferredHeight;
        if (SoftwareRaster.clipTop > var2) {
          return false;
        }
        if (var3 > SoftwareRaster.clipBottom) {
          return false;
        }
        if (obfuscationGuard != 4) {
          return true;
        }
        return true;
    }

    final boolean isPointerOverScrollBars(int obfuscationGuard, int pointerX, int pointerY) {
        int var4;
        int stackIn_8_0 = 0;
        int var4Lifetime1;
        if (obfuscationGuard != 31127) {
          return true;
        }
        var4 = 0;
        if (!this.horizontalScrollBar.containsPointer(pointerX, -2, pointerY)) {
          stackIn_8_0 = (this.verticalScrollBar.containsPointer(pointerX, -2, pointerY)) ? 1 : 0;
        } else {
          stackIn_8_0 = 1;
        }
        var4Lifetime1 = stackIn_8_0;
        return var4Lifetime1 != 0;
    }

    final void closeMenu(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          this.drawScrollBars((byte) 36);
        }
        this.open = false;
    }

    private final void readScrollOffsets(byte obfuscationGuard) {
        if (this.verticalScrollBar.hasChanged(false)) {
          this.visibleStartIndex = this.verticalScrollBar.getOffset(false);
          this.visibleEndIndex = this.visibleStartIndex + this.verticalScrollBar.getVisibleExtent((byte) 76);
        }
        if (this.horizontalScrollBar.hasChanged(false)) {
          this.horizontalOffset = this.horizontalScrollBar.getOffset(false);
        }
        if (obfuscationGuard <= 46) {
          return;
        }
    }

    private final void fitHorizontalLayout(int obfuscationGuard) {
        int candidateLeft = 0;
        int candidateRight = 0;
        int rightEdge;
        this.displayWidth = this.preferredWidth;
        this.displayX = this.requestedX;
        if (this.fitsHorizontalBounds(true)) {
          return;
        }
        if (obfuscationGuard != 0) {
          this.drawScrollBars((byte) 127);
        }
        if (this.canTranslateHorizontally(-2)) {
          candidateLeft = this.requestedX;
          candidateRight = this.requestedX + this.preferredWidth;
          if (candidateLeft < SoftwareRaster.clipLeft) {
            candidateRight = candidateRight + (SoftwareRaster.clipLeft - candidateLeft);
            if (SoftwareRaster.clipRight >= candidateRight) {
              candidateLeft = SoftwareRaster.clipLeft;
              this.displayWidth = candidateRight - candidateLeft;
              this.displayX = candidateLeft;
              return;
            }
          }
          rightEdge = this.requestedX + this.preferredWidth;
          if (rightEdge > SoftwareRaster.clipRight) {
            candidateLeft = candidateLeft - (rightEdge - SoftwareRaster.clipRight);
            if (SoftwareRaster.clipLeft <= candidateLeft) {
              this.displayX = candidateLeft;
              rightEdge = SoftwareRaster.clipRight;
              this.displayWidth = -candidateLeft + rightEdge;
              return;
            }
          }
        }
        this.displayX = SoftwareRaster.clipLeft;
        this.displayWidth = SoftwareRaster.clipRight;
    }

    private final void updatePointer(byte obfuscationGuard, int pointerX, int pointerY) {
        this.hoveredIndex = -1;
        if (this.enabled &&
          this.open) {
          this.hoveredIndex = this.findOptionAt(pointerY, (byte) -128, pointerX);
        }
        if (obfuscationGuard != 58) {
          this.updateScrollBarVisibility(104);
        }
        this.verticalScrollBar.updatePointer(pointerY, pointerX, 0);
        this.horizontalScrollBar.updatePointer(pointerY, pointerX, 0);
    }

    final boolean hasSelectionChanged(int obfuscationGuard) {
        int var2 = -57 / ((54 - obfuscationGuard) / 50);
        return this.selectionChanged;
    }

    private final void positionHorizontalScrollBar(byte obfuscationGuard) {
        int scrollBarX = this.getContentLeft(-88);
        int scrollBarY = this.getContentTop(-105) + this.getContentHeight(1);
        if (obfuscationGuard <= 21) {
          return;
        }
        int scrollBarLength = this.getContentWidth(1);
        this.horizontalScrollBar.setBounds(scrollBarY, -128, scrollBarX, scrollBarLength);
    }

    private final int getRowHeight(byte obfuscationGuard) {
        if (obfuscationGuard >= -82) {
          this.hoveredIndex = 47;
        }
        int fontHeight = this.font.maxDescent + this.font.maxAscent;
        int rowPadding = 4;
        int rowHeight = rowPadding + fontHeight;
        return rowHeight;
    }

    private final void refreshOptionLayout(int obfuscationGuard) {
        if (obfuscationGuard > -16) {
          this.preferredHeight = -30;
        }
        this.updateLayout(-25621);
        this.configureVerticalScroll(96);
        this.configureHorizontalScroll(1773277345);
    }

    final void disableInput(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.openMenu(-121);
        }
        this.enabled = false;
    }

    private final int getContentHeight(int obfuscationGuard) {
        int contentTop = this.getContentTop(-123);
        int scrollBarThickness = this.horizontalScrollBar.getThickness(obfuscationGuard + 26786);
        int bottomBorder = this.frameSprites[7].canvasHeight;
        int contentBottom = -scrollBarThickness + (-bottomBorder + (this.displayY + this.displayHeight));
        int contentHeight = -contentTop + contentBottom + obfuscationGuard;
        return contentHeight;
    }

    private final void drawFrame(int obfuscationGuard) {
        int frameX = this.displayX;
        int frameY = this.displayY;
        int frameWidth = this.displayWidth;
        if (obfuscationGuard != 7) {
          return;
        }
        int frameHeight = this.displayHeight;
        if (!this.verticalScrollBar.isEnabled(false)) {
          frameWidth = frameWidth - this.verticalScrollBar.getThickness(26787);
        }
        if (!this.horizontalScrollBar.isEnabled(false)) {
          frameHeight = frameHeight - this.horizontalScrollBar.getThickness(26787);
        }
        SoftwareRaster.f(frameX, frameY, frameWidth, frameHeight, 7829367);
        ReportAbuseDialog.drawNineSlice(this.frameSprites, frameHeight, frameX, (byte) -47, frameY, frameWidth);
    }

    private final void positionVerticalScrollBar(int obfuscationGuard) {
        int scrollBarX = this.getContentLeft(-91) + this.getContentWidth(1);
        int scrollBarY = this.getContentTop(-100);
        if (obfuscationGuard <= 22) {
          this.selectionChanged = false;
        }
        int scrollBarLength = this.getContentHeight(1);
        this.verticalScrollBar.setBounds(scrollBarY, -125, scrollBarX, scrollBarLength);
    }

    private final void configureHorizontalScroll(int obfuscationGuard) {
        int stepDivisor = 3;
        int contentWidth = this.getContentWidth(1);
        int scrollStep = contentWidth / stepDivisor;
        this.horizontalScrollBar.configureRange(0, (byte) 47, this.displayWidth, contentWidth, scrollStep);
        this.horizontalOffset = this.horizontalScrollBar.getOffset(false);
        if (obfuscationGuard != 1773277345) {
          this.horizontalScrollBar = (SpriteScrollBar) null;
        }
    }

    private final int getContentLeft(int obfuscationGuard) {
        if (obfuscationGuard >= -55) {
          this.enableInput(82);
        }
        int leftBorder = this.frameSprites[3].canvasWidth;
        int contentLeft = this.displayX + leftBorder;
        return contentLeft;
    }

    final boolean isInputEnabled(int obfuscationGuard) {
        if (obfuscationGuard <= 80) {
          this.arrowSprites = (RgbSprite[]) null;
        }
        return this.enabled;
    }

    final static rn a(String param0, int param1) {
        rn stackIn_3_0 = null;
        rn stackIn_6_0 = null;
        rn stackIn_12_0 = null;
        int stackIn_20_0 = 0;
        rn stackIn_24_0 = null;
        rn stackIn_30_0 = null;
        rn stackIn_40_0 = null;
        rn stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_3_0 = HotspotTextWidget.field_N;
            return stackIn_3_0;
          }
          if (64 < var2_int) {
            stackIn_6_0 = el.field_e;
            return stackIn_6_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_12_0 = ov.field_h;
              return stackIn_12_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 != 92) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = ov.field_h;
                  return stackIn_24_0;
                }
                var3 = 0;
              } else {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              }
            }
            return null;
          }
          if (param1 != 15026) {
            stackIn_30_0 = (rn) null;
            return stackIn_30_0;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = ov.field_h;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == FullscreenStatusDialog.field_Z.indexOf(var5Lifetime1)) {
                stackIn_45_0 = ov.field_h;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("ng.I(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setPosition(int x, int obfuscationGuard, int y) {
        boolean discarded$0 = false;
        this.requestedY = y;
        this.requestedX = x;
        if (obfuscationGuard <= 74) {
          discarded$0 = this.needsHorizontalScrollBar(74);
        }
        this.updateLayout(-25621);
    }

    final int getOptionCount(int obfuscationGuard) {
        int var2 = -10 % ((37 - obfuscationGuard) / 33);
        return this.optionCount;
    }

    final static void openClientContextMenu(ScrollContainer scrollContainer, ClientUiComponent sourceComponent, int[] quickChatContext, String displayName, int roomId, int obfuscationGuard, int chatChannel, String accountName, long accountId) {
        try {
          int var10_int = -119 % ((obfuscationGuard + 47) / 32);
          PointerInputHandler.contextMenuScrollContainer = scrollContainer;
          FullscreenMembershipDialog.activeContextMenu = new ClientContextMenu(sourceComponent, accountId, accountName, displayName, roomId, chatChannel, quickChatContext);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ng.FA(" + (scrollContainer != null ? "{...}" : "null") + ',' + (sourceComponent != null ? "{...}" : "null") + ',' + (quickChatContext != null ? "{...}" : "null") + ',' + (displayName != null ? "{...}" : "null") + ',' + roomId + ',' + obfuscationGuard + ',' + chatChannel + ',' + (accountName != null ? "{...}" : "null") + ',' + accountId + ')');
        }
    }

    private final boolean needsHorizontalScrollBar(int obfuscationGuard) {
        boolean discarded$0 = false;
        if (this.fitsHorizontalBounds(true)) {
          return false;
        }
        if (obfuscationGuard != 0) {
          discarded$0 = this.canTranslateHorizontally(52);
        }
        if (!this.canTranslateHorizontally(-2)) {
          return true;
        }
        return false;
    }

    final static void b(boolean param0) {
        RgbSprite var1 = null;
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1 = new RgbSprite(540, 140);
          CombatSandbox.a(var1, 3);
          if (!param0) {
            SpriteDropdownMenu.w(33);
          }
          TriangleRasterizer.useRasterClip();
          SoftwareRaster.b();
          PasswordValidator.field_j = 0;
          DebouncedValidator.e(9);
          var2 = var1.copySprite();
          for (var3 = 0; 15 > var3; var3++) {
            var2.a(-2, -2, 16777215);
            SoftwareRaster.c(4, 4, 0, 0, 540, 140);
          }
          kq.field_P.b();
          var1.drawHalfSize(0, 0);
          QuickChatPhraseRepository.popRasterState(-18862);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ng.V(" + param0 + ')');
        }
    }

    private final void drawScrollBars(byte obfuscationGuard) {
        if (this.verticalScrollBar.isEnabled(false)) {
          this.verticalScrollBar.drawScrollBar(0);
        }
        if (this.horizontalScrollBar.isEnabled(false)) {
          this.horizontalScrollBar.drawScrollBar(0);
        }
        if (obfuscationGuard != -8) {
          return;
        }
    }

    private final int getContentWidth(int obfuscationGuard) {
        int contentLeft = this.getContentLeft(-128);
        int scrollBarThickness = this.verticalScrollBar.getThickness(26787);
        int rightBorder = this.frameSprites[5].canvasWidth;
        int contentRight = -scrollBarThickness - rightBorder + (this.displayX + this.displayWidth);
        int contentWidth = -contentLeft + (contentRight + obfuscationGuard);
        return contentWidth;
    }

    final void enableInput(int obfuscationGuard) {
        this.enabled = true;
        int var2 = -49 % ((obfuscationGuard - 31) / 52);
    }

    private final void updateLayout(int obfuscationGuard) {
        this.fitVerticalLayout((byte) -4);
        this.fitHorizontalLayout(0);
        this.positionVerticalScrollBar(obfuscationGuard ^ -25718);
        if (obfuscationGuard != -25621) {
          return;
        }
        this.positionHorizontalScrollBar((byte) 120);
    }

    final int getSelectedIndex(int obfuscationGuard) {
        int var2 = -62 % ((obfuscationGuard + 13) / 45);
        return this.selectedIndex;
    }

    final void updateInput(int pointerY, boolean held, boolean pressed, int obfuscationGuard, int pointerX, int wheelDelta) {
        if (obfuscationGuard != 0) {
          field_s = (String) null;
        }
        this.updateLayout(obfuscationGuard - 25621);
        this.updateScrollBarVisibility(-1);
        this.updatePointer((byte) 58, pointerX, pointerY);
        this.applyInput(pressed, held, (byte) 16, wheelDelta);
    }

    private final void fitVerticalLayout(byte obfuscationGuard) {
        int candidateTop = 0;
        int candidateBottom = 0;
        int bottomEdge;
        this.displayY = this.requestedY;
        this.displayHeight = this.preferredHeight;
        if (this.fitsVerticalBounds(obfuscationGuard ^ -8)) {
          return;
        }
        if (this.canTranslateVertically((byte) -105)) {
          candidateTop = this.requestedY;
          candidateBottom = this.preferredHeight + this.requestedY;
          if (!(SoftwareRaster.clipTop <= candidateTop)) {
            candidateBottom = candidateBottom + (-candidateTop + SoftwareRaster.clipTop);
            if (!(SoftwareRaster.clipBottom < candidateBottom)) {
              candidateTop = SoftwareRaster.clipTop;
              this.displayY = candidateTop;
              this.displayHeight = candidateBottom - candidateTop;
              return;
            }
          }
          bottomEdge = this.requestedY + this.preferredHeight;
          if (!(SoftwareRaster.clipBottom >= bottomEdge)) {
            candidateTop = candidateTop - (-SoftwareRaster.clipBottom + bottomEdge);
            if (!(SoftwareRaster.clipTop > candidateTop)) {
              bottomEdge = SoftwareRaster.clipBottom;
              this.displayY = candidateTop;
              this.displayHeight = bottomEdge - candidateTop;
              return;
            }
          }
        }
        if (obfuscationGuard != -4) {
          return;
        }
        this.displayHeight = SoftwareRaster.clipBottom;
        this.displayY = SoftwareRaster.clipTop;
    }

    private final boolean fitsHorizontalBounds(boolean obfuscationGuard) {
        int var2 = this.requestedX;
        if (!obfuscationGuard) {
          return true;
        }
        int var3 = this.requestedX + this.preferredWidth;
        if (SoftwareRaster.clipLeft > var2) {
          return false;
        }
        if (SoftwareRaster.clipRight < var3) {
          return false;
        }
        return true;
    }

    private final void drawOptions(int obfuscationGuard) {
        int optionIndex = 0;
        String optionText = null;
        int textColour = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int textY = this.getContentTop(obfuscationGuard - 100);
        if (obfuscationGuard != 3) {
          return;
        }
        int contentBottom = textY + this.getContentHeight(obfuscationGuard ^ 2);
        int textX = this.getContentLeft(-116);
        int contentRight = textX + this.getContentWidth(1);
        int horizontalOffset = this.horizontalOffset;
        SoftwareRaster.b(this.savedClip);
        SoftwareRaster.b(textX, textY, contentRight, contentBottom);
        textX = -horizontalOffset + textX;
        textY = textY + this.font.maxAscent;
        int rowHeight = this.getRowHeight((byte) -85);
        for (optionIndex = this.visibleStartIndex; this.visibleEndIndex > optionIndex; optionIndex++) {
          optionText = this.options[optionIndex];
          textColour = this.colours[0];
          if (optionIndex == this.hoveredIndex) {
            textColour = this.colours[1];
          }
          this.font.drawText(optionText, textX, textY, textColour, -1);
          textY = textY + rowHeight;
        }
        SoftwareRaster.a(this.savedClip);
    }

    final static void x(int param0) {
        qf.field_e = null;
        SummonEvent.field_F = null;
        ed.field_e = null;
        if (jl.field_b != null) {
          UpkeepEvent.field_z = jl.field_b;
          DebouncedValidator.field_b = ArchiveProvider.field_d;
          UpkeepEvent.field_z.matchedButtonTextColour = -1;
          UpkeepEvent.field_z.heldPressTextColour = -1;
          jl.field_b = null;
          ArchiveProvider.field_d = null;
        }
        UnitCycler.field_g = null;
        hf.textChatActive = true;
        DateOfBirthValidator.field_i = null;
        int var1 = 89 % ((param0 + 51) / 39);
    }

    final static void a(RgbSprite param0, int param1, RgbSprite param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ds.field_a = new RgbSprite[op.field_c[param1].length];
          GameCanvas.field_c = new RgbSprite[op.field_c[0].length];
          DiskCacheWorker.field_d = param0;
          ClientUiNode.field_y = param2;
          for (var3_int = 0; op.field_c[0].length > var3_int; var3_int++) {
            ds.field_a[var3_int] = new RgbSprite(DiskCacheWorker.field_d.pixelWidth, DiskCacheWorker.field_d.pixelHeight);
            GameCanvas.field_c[var3_int] = new RgbSprite(ClientUiNode.field_y.pixelWidth, ClientUiNode.field_y.pixelHeight);
            ds.field_a[var3_int].b();
            DiskCacheWorker.field_d.drawTintedGrayscale(0, 0, op.field_c[0][var3_int]);
            GameCanvas.field_c[var3_int].b();
            ClientUiNode.field_y.drawShadedGrayscale(0, 0, op.field_c[0][var3_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ng.MA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void openMenu(int obfuscationGuard) {
        this.open = true;
        if (obfuscationGuard <= 25) {
          return;
        }
    }

    private final void computePreferredSize(int obfuscationGuard) {
        this.computePreferredHeight(124);
        this.computePreferredWidth(obfuscationGuard);
    }

    private final void updateScrollBarVisibility(int obfuscationGuard) {
        boolean discarded$0 = false;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.open) {
          return;
        }
        if (!this.enabled) {
          return;
        }
        if (!this.needsHorizontalScrollBar(0)) {
          this.horizontalScrollBar.disable((byte) -65);
        } else {
          this.horizontalScrollBar.enable(-97);
        }
        if (obfuscationGuard != -1) {
          discarded$0 = this.fitsVerticalBounds(100);
        }
        if (!this.needsVerticalScrollBar(-87)) {
          this.verticalScrollBar.disable((byte) -65);
        } else {
          this.verticalScrollBar.enable(-124);
        }
    }

    SpriteDropdownMenu(RgbSprite[] frameSprites, RgbSprite[] arrowSprites, BinaryBitmapFont font, int[] colours, String[] options, int x, int y) {
        RuntimeException var8 = null;
        RgbSprite[] var9 = null;
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
          this.font = font;
          this.colours = colours;
          this.arrowSprites = arrowSprites;
          this.frameSprites = frameSprites;
          this.verticalScrollBar = new SpriteScrollBar(this.arrowSprites, this.colours, 1);
          var9 = this.copyHorizontalArrows(false);
          this.horizontalScrollBar = new SpriteScrollBar(var9, this.colours, 0);
          this.setOptions((byte) 87, options);
          this.setPosition(x, 94, y);
          this.enableInput(98);
          this.closeMenu(0);
          this.savedClip = new int[4];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_5_0 = var8;
          stackIn_5_1 = new StringBuilder().append("ng.<init>(");
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

    private final boolean canTranslateVertically(byte obfuscationGuard) {
        int var2 = this.requestedY;
        int var4 = 40 / ((obfuscationGuard - 15) / 45);
        int var3 = this.requestedY + this.preferredHeight;
        if (!(var2 >= SoftwareRaster.clipTop)) {
          var3 = var3 + (-var2 + SoftwareRaster.clipTop);
          if (var3 > SoftwareRaster.clipBottom) {
            return false;
          }
          return true;
        }
        var3 = this.preferredHeight + this.requestedY;
        if (SoftwareRaster.clipBottom < var3) {
          var2 = var2 - (var3 - SoftwareRaster.clipBottom);
          if (SoftwareRaster.clipTop <= var2) {
            return true;
          }
          return false;
        }
        return true;
    }

    final int findOptionAt(int pointerY, byte obfuscationGuard, int pointerX) {
        int optionIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int contentLeft = this.getContentLeft(-60);
        int rowTop = this.getContentTop(-101);
        int rowHeight = this.getRowHeight((byte) -111);
        int guardQuotient = -30 / ((obfuscationGuard + 89) / 32);
        int contentWidth = this.getContentWidth(1);
        for (optionIndex = this.visibleStartIndex; this.visibleEndIndex > optionIndex; optionIndex++) {
          if (ChatMessage.a(pointerY, contentLeft, rowTop, pointerX, contentWidth, (byte) -101, rowHeight)) {
            return optionIndex;
          }
          rowTop = rowTop + rowHeight;
        }
        return -1;
    }

    private final void computePreferredHeight(int obfuscationGuard) {
        int rowHeight = this.getRowHeight((byte) -111);
        int rowsHeight = this.optionCount * rowHeight;
        if (obfuscationGuard < 118) {
          this.horizontalScrollBar = (SpriteScrollBar) null;
        }
        int frameBorderHeight = this.frameSprites[1].canvasHeight + this.frameSprites[7].canvasHeight;
        int scrollBarThickness = this.horizontalScrollBar.getThickness(26787);
        this.preferredHeight = rowsHeight + frameBorderHeight + scrollBarThickness;
    }

    static {
        field_s = "Spells to harm groups of units.";
    }
}
