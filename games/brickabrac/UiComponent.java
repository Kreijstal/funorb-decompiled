/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiComponent extends ba {
    boolean useParentFrameBounds;
    int textColor;
    int selectedOffsetX;
    RgbSprite[] capturedFrameSprites;
    int capturedTextColor;
    private int remainingX;
    boolean selected;
    boolean enabled;
    int lineSpacing;
    private int spriteAlpha256;
    private int activeOffsetY;
    RgbSprite activeSprite;
    private int contentOffsetX;
    int screenY;
    TextFont font;
    int horizontalAlignment;
    private boolean inheritVisualState;
    int capturedOffsetX;
    int capturedOffsetY;
    int remainingY;
    private int activeOffsetX;
    private int pressLocalY;
    String textSuffix;
    static MenuSelection field_H;
    boolean hovered;
    int capturedButton;
    int verticalAlignment;
    RgbSprite selectedSprite;
    int width;
    RgbSprite[] activeFrameSprites;
    int pressLocalX;
    RgbSprite[] selectedFrameSprites;
    int height;
    private boolean field_fb;
    int localY;
    int activeTextColor;
    int screenX;
    int pressedButton;
    static int[] field_F;
    boolean draggable;
    static int previousPacketOpcode;
    RgbSprite[] disabledFrameSprites;
    RgbSprite sprite;
    boolean activeInside;
    NodeDeque children;
    static ResourceArchive field_lb;
    static tf field_ab;
    static RgbSprite field_ib;
    int selectedOffsetY;
    String text;
    private int remainingWidth;
    int textAlpha256;
    static String field_Z;
    private boolean field_Bb;
    private int contentOffsetY;
    int disabledTextColor;
    int textInset;
    static String field_mb;
    int selectedTextColor;
    RgbSprite capturedSprite;
    int localX;
    RgbSprite[] frameSprites;
    int remainingHeight;
    static PcmSound[] field_ob;
    RgbSprite disabledSprite;

    UiComponent(long id, UiComponent styleTemplate) {
        this(id, styleTemplate, 0, 0, 0, 0, (String) null);
    }

    private final void updateTree(int parentWidth, int obfuscationGuard, int parentX, int parentHeight, int parentY, boolean inputEnabled) {
        boolean hoverResult = false;
        boolean activeResult = false;
        int xStep;
        int savedClipLeft;
        int savedClipTop;
        int savedClipRight;
        int savedClipBottom;
        int claimedPress;
        UiComponent child;
        int unusedGameFlag;
        UiComponent unusedStyle;
        int yStep;
        int widthStep;
        int heightStep;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 886229954) {
          unusedStyle = (UiComponent) null;
          this.copyStyle((byte) -43, (UiComponent) null);
        }
        if (0 >= this.remainingX) {
          xStep = this.remainingX >> 2;
        } else {
          xStep = -(-this.remainingX >> 2);
        }
        this.localX = this.localX + xStep;
        this.remainingX = this.remainingX - xStep;
        if (this.remainingY > 0) {
          yStep = -(-this.remainingY >> 2);
        } else {
          yStep = this.remainingY >> 2;
        }
        this.localY = this.localY + yStep;
        this.remainingY = this.remainingY - yStep;
        if (0 < this.remainingWidth) {
          widthStep = -(-this.remainingWidth >> 2);
        } else {
          widthStep = this.remainingWidth >> 2;
        }
        this.width = this.width + widthStep;
        this.remainingWidth = this.remainingWidth - widthStep;
        if (this.remainingHeight > 0) {
          heightStep = -(-this.remainingHeight >> 2);
        } else {
          heightStep = this.remainingHeight >> 2;
        }
        this.remainingHeight = this.remainingHeight - heightStep;
        this.screenY = this.localY + parentY;
        this.height = this.height + heightStep;
        this.screenX = parentX + this.localX;
        inputEnabled = inputEnabled & this.enabled;
        savedClipLeft = Rasterizer2D.clipLeft;
        savedClipTop = Rasterizer2D.clipTop;
        savedClipRight = Rasterizer2D.clipRight;
        savedClipBottom = Rasterizer2D.clipBottom;
        Rasterizer2D.intersectClip(this.screenX, this.screenY, this.width + this.screenX, this.height + this.screenY);
        claimedPress = 0;
        if (!wc.uiPressClaimed &&
          inputEnabled &&
          BackgroundScene.pressedButton != 0 &&
          Rasterizer2D.clipLeft <= tb.pressX &&
          Rasterizer2D.clipRight > tb.pressX &&
          qo.pressY >= Rasterizer2D.clipTop &&
          Rasterizer2D.clipBottom > qo.pressY) {
          this.pressedButton = BackgroundScene.pressedButton;
          this.pressLocalX = -this.screenX + tb.pressX;
          this.capturedButton = BackgroundScene.pressedButton;
          claimedPress = 1;
          this.pressLocalY = -this.screenY + qo.pressY;
        } else {
          this.pressedButton = 0;
          if (0 != BackgroundScene.pressedButton) {
            this.capturedButton = 0;
          }
        }
        hoverResult = (!NinjaBackground.uiHoverClaimed) && (Rasterizer2D.clipLeft <= MusicPatch.pointerX) && (Rasterizer2D.clipRight > MusicPatch.pointerX) && (po.pointerY >= Rasterizer2D.clipTop) && (Rasterizer2D.clipBottom > po.pointerY);
        this.hovered = hoverResult;
        if (0 == cb.heldButton) {
          this.capturedButton = 0;
        }
        activeResult = (this.hovered) && (this.capturedButton == cb.heldButton) && (inputEnabled);
        this.activeInside = activeResult;
        if (this.children != null) {
          child = (UiComponent) (this.children.last(obfuscationGuard ^ 886229954));
          while (child != null) {
            child.updateTree(this.width, 886229954, this.screenX, this.height, this.screenY, inputEnabled);
            child = (UiComponent) (this.children.previous(33));
          }
        }
        if (this.hovered) {
          NinjaBackground.uiHoverClaimed = true;
        }
        if (claimedPress != 0) {
          wc.uiPressClaimed = true;
        }
        Rasterizer2D.setClip(savedClipLeft, savedClipTop, savedClipRight, savedClipBottom);
        if (this.capturedButton != 0 &&
          this.draggable) {
          this.localY = po.pointerY - this.pressLocalY - parentY;
          this.localX = -this.pressLocalX + MusicPatch.pointerX - parentX;
          if (0 > this.localX) {
            this.localX = 0;
          }
          if (this.localX > -this.width + parentWidth) {
            this.localX = -this.width + parentWidth;
          }
          if (this.localY < 0) {
            this.localY = 0;
          }
          if (-this.height + parentHeight < this.localY) {
            this.localY = parentHeight - this.height;
          }
          this.remainingY = 0;
          this.screenX = parentX + this.localX;
          this.remainingX = 0;
          this.screenY = parentY + this.localY;
        }
    }

    private final void drawTree(boolean selected, int parentY, int obfuscationGuard, int parentWidth, boolean active, boolean enabled, boolean captured, int parentHeight, boolean showTextSuffix, int parentX, boolean unusedChildFlag) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        RgbSprite[] var17;
        RgbSprite var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24_int;
        String var24;
        UiComponent var24_ref;
        int var25;
        int var26;
        String var27;
        String var24Lifetime1;
        String var24Lifetime2;
        var26 = BrickABrac.field_J ? 1 : 0;
        this.screenX = this.localX + parentX;
        this.screenY = parentY + this.localY;
        var13 = -125 / ((obfuscationGuard - 22) / 33);
        var12 = Rasterizer2D.clipLeft;
        var14 = Rasterizer2D.clipTop;
        var15 = Rasterizer2D.clipRight;
        var16 = Rasterizer2D.clipBottom;
        Rasterizer2D.intersectClip(this.screenX, this.screenY, this.screenX + this.width, this.screenY + this.height);
        if (!this.inheritVisualState) {
          selected = this.selected;
          active = this.activeInside;
          stackIn_5_0 = (this.capturedButton != 0);
          captured = stackIn_5_0;
        }
        enabled = enabled & this.enabled;
        var17 = this.frameSprites;
        var18 = this.sprite;
        var19 = this.textColor;
        var20 = 0;
        if (!enabled) {
          if (this.disabledTextColor >= 0) {
            var19 = this.disabledTextColor;
          }
          if (this.disabledFrameSprites != null) {
            var17 = this.disabledFrameSprites;
          }
          if (this.disabledSprite != null) {
            var18 = this.disabledSprite;
          }
        }
        var21 = 0;
        if (active) {
          if (this.activeFrameSprites != null) {
            var17 = this.activeFrameSprites;
          }
          if (this.activeTextColor >= 0) {
            var19 = this.activeTextColor;
          }
          if (this.activeOffsetX != -2147483648) {
            var20 = this.activeOffsetX;
          }
          if (null != this.activeSprite) {
            var18 = this.activeSprite;
          }
          if (this.activeOffsetY != -2147483648) {
            var21 = this.activeOffsetY;
          }
        }
        if (captured) {
          if (null != this.capturedSprite) {
            var18 = this.capturedSprite;
          }
          if (this.capturedFrameSprites != null) {
            var17 = this.capturedFrameSprites;
          }
          if (-2147483648 != this.capturedOffsetY) {
            var21 = this.capturedOffsetY;
          }
          if (this.capturedTextColor >= 0) {
            var19 = this.capturedTextColor;
          }
          if (this.capturedOffsetX != -2147483648) {
            var20 = this.capturedOffsetX;
          }
        }
        if (selected) {
          if (this.selectedTextColor >= 0) {
            var19 = this.selectedTextColor;
          }
          if (null != this.selectedSprite) {
            var18 = this.selectedSprite;
          }
          if (this.selectedOffsetX != -2147483648) {
            var20 = this.selectedOffsetX;
          }
          if (this.selectedFrameSprites != null) {
            var17 = this.selectedFrameSprites;
          }
          if (-2147483648 != this.selectedOffsetY) {
            var21 = this.selectedOffsetY;
          }
        }
        var22 = this.contentOffsetX + var20;
        var23 = this.contentOffsetY + var21;
        if (!this.useParentFrameBounds) {
          nh.a(this.width, this.height, -40, this.screenX, var17, this.screenY);
        } else {
          nh.a(parentWidth, parentHeight, -40, parentX, var17, parentY);
        }
        if (var18 != null) {
          var24_int = var22 + this.screenX;
          var25 = var23 + this.screenY;
          if (1 == this.horizontalAlignment) {
            var24_int = var24_int + (this.width - var18.canvasWidth) / 2;
          }
          if (2 == this.horizontalAlignment) {
            var24_int = var24_int + (-var18.canvasWidth + this.width);
          }
          if (1 == this.verticalAlignment) {
            var25 = var25 + (this.height - var18.canvasHeight) / 2;
          }
          if (this.verticalAlignment == 2) {
            var25 = var25 + (this.height - var18.canvasHeight);
          }
          if (256 > this.spriteAlpha256) {
            var18.b(var24_int, var25, this.spriteAlpha256);
          } else {
            var18.drawTransparent(var24_int, var25);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.text &&
          this.font != null) {
          var27 = this.text;
          var24 = var27;
          var24Lifetime1 = var27;
          var24Lifetime2 = var27;
          if (showTextSuffix &&
            this.textSuffix != null) {
            var24Lifetime2 = var27 + this.textSuffix;
          }
          if (this.font.measureText(var24Lifetime2) <= -(this.textInset * 2) + this.width &&
            var24Lifetime2.indexOf("<br>") < 0) {
            if (this.verticalAlignment != 1) {
              if (this.verticalAlignment == 2) {
                var23 = var23 + (-this.font.ascent + this.height - this.font.descent);
              }
            } else {
              var23 = var23 + (this.height - this.font.ascent - this.font.descent) / 2;
            }
            if (this.horizontalAlignment == 0) {
              this.font.c(var24Lifetime2, var22 + (this.screenX + this.textInset), this.screenY + var23 + this.font.ascent, var19, -1, this.textAlpha256);
            } else {
              if (this.horizontalAlignment == 1) {
                this.font.drawCenteredAlpha(var24Lifetime2, var22 + this.textInset + this.screenX + (-(this.textInset * 2) + this.width) / 2, this.screenY - (-var23 - this.font.ascent), var19, -1, this.textAlpha256);
              } else {
                if (this.horizontalAlignment != 2) {
                  this.font.a(var24Lifetime2, var22 + (this.textInset + this.screenX), var23 + this.screenY, -(2 * this.textInset) + this.width, this.height, var19, -1, this.textAlpha256, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
                } else {
                  this.font.drawRightAlpha(var24Lifetime2, this.screenX + this.textInset - (-var22 + this.textInset * 2) + this.width, this.screenY + (var23 + this.font.ascent), var19, -1, this.textAlpha256);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.font.a(var24Lifetime2, var22 + (this.textInset + this.screenX), var23 + this.screenY, -(this.textInset * 2) + this.width, this.height, var19, -1, this.textAlpha256, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
          }
        }
        if (this.children != null) {
          var24_ref = (UiComponent) (this.children.first(-46));
          while (var24_ref != null) {
            var24_ref.drawTree(selected, this.screenY + var21, 89, this.width, active, enabled, captured, this.height, showTextSuffix, var20 + this.screenX, this.field_Bb);
            var24_ref = (UiComponent) (this.children.next((byte) 116));
          }
        }
        Rasterizer2D.setClip(var12, var14, var15, var16);
    }

    final void copyStyle(byte obfuscationGuard, UiComponent styleTemplate) {
        boolean stackIn_79_1 = false;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (obfuscationGuard > -65) {
            return;
          }
          if (styleTemplate != null) {
            if (null != styleTemplate.disabledSprite) {
              this.disabledSprite = styleTemplate.disabledSprite;
            }
            if (null != styleTemplate.textSuffix) {
              this.textSuffix = styleTemplate.textSuffix;
            }
            if (null != styleTemplate.selectedSprite) {
              this.selectedSprite = styleTemplate.selectedSprite;
            }
            if (styleTemplate.textColor != 0) {
              this.textColor = styleTemplate.textColor;
            }
            if (styleTemplate.font != null) {
              this.font = styleTemplate.font;
            }
            if (styleTemplate.capturedTextColor >= 0) {
              this.capturedTextColor = styleTemplate.capturedTextColor;
            }
            if (styleTemplate.selectedTextColor >= 0) {
              this.selectedTextColor = styleTemplate.selectedTextColor;
            }
            if (styleTemplate.frameSprites != null) {
              this.frameSprites = styleTemplate.frameSprites;
            }
            if (styleTemplate.selectedFrameSprites != null) {
              this.selectedFrameSprites = styleTemplate.selectedFrameSprites;
            }
            if (styleTemplate.field_fb) {
              this.field_fb = styleTemplate.field_fb;
            }
            if (styleTemplate.activeTextColor >= 0) {
              this.activeTextColor = styleTemplate.activeTextColor;
            }
            if (styleTemplate.activeSprite != null) {
              this.activeSprite = styleTemplate.activeSprite;
            }
            if (styleTemplate.textInset != 0) {
              this.textInset = styleTemplate.textInset;
            }
            if (!styleTemplate.enabled) {
              this.enabled = styleTemplate.enabled;
            }
            if (null != styleTemplate.disabledFrameSprites) {
              this.disabledFrameSprites = styleTemplate.disabledFrameSprites;
            }
            if (styleTemplate.inheritVisualState) {
              this.inheritVisualState = styleTemplate.inheritVisualState;
            }
            if (null != styleTemplate.activeFrameSprites) {
              this.activeFrameSprites = styleTemplate.activeFrameSprites;
            }
            if (styleTemplate.lineSpacing != 0) {
              this.lineSpacing = styleTemplate.lineSpacing;
            }
            if (styleTemplate.sprite != null) {
              this.sprite = styleTemplate.sprite;
            }
            if (styleTemplate.text != null) {
              this.text = styleTemplate.text;
            }
            if (styleTemplate.selected) {
              this.selected = styleTemplate.selected;
            }
            if (null != styleTemplate.capturedSprite) {
              this.capturedSprite = styleTemplate.capturedSprite;
            }
            if (styleTemplate.capturedFrameSprites != null) {
              this.capturedFrameSprites = styleTemplate.capturedFrameSprites;
            }
            if (styleTemplate.useParentFrameBounds) {
              this.useParentFrameBounds = styleTemplate.useParentFrameBounds;
            }
            if (styleTemplate.textAlpha256 != 256) {
              this.textAlpha256 = styleTemplate.textAlpha256;
            }
            if (styleTemplate.disabledTextColor >= 0) {
              this.disabledTextColor = styleTemplate.disabledTextColor;
            }
            if (styleTemplate.selectedOffsetY != -2147483648) {
              this.selectedOffsetY = styleTemplate.selectedOffsetY;
            }
            if (styleTemplate.horizontalAlignment != 0) {
              this.horizontalAlignment = styleTemplate.horizontalAlignment;
            }
            if (styleTemplate.selectedOffsetX != -2147483648) {
              this.selectedOffsetX = styleTemplate.selectedOffsetX;
            }
            stackIn_79_1 = (this.field_fb) && (styleTemplate.field_Bb);
            this.field_Bb = stackIn_79_1;
            if (-2147483648 != styleTemplate.capturedOffsetX) {
              this.capturedOffsetX = styleTemplate.capturedOffsetX;
            }
            if (styleTemplate.draggable) {
              this.draggable = styleTemplate.draggable;
            }
            if (-2147483648 != styleTemplate.activeOffsetX) {
              this.activeOffsetX = styleTemplate.activeOffsetX;
            }
            if (styleTemplate.contentOffsetX != 0) {
              this.contentOffsetX = styleTemplate.contentOffsetX;
            }
            if (styleTemplate.verticalAlignment != 0) {
              this.verticalAlignment = styleTemplate.verticalAlignment;
            }
            if (styleTemplate.contentOffsetY != 0) {
              this.contentOffsetY = styleTemplate.contentOffsetY;
            }
            if (styleTemplate.capturedOffsetY != -2147483648) {
              this.capturedOffsetY = styleTemplate.capturedOffsetY;
            }
            if (styleTemplate.activeOffsetY != -2147483648) {
              this.activeOffsetY = styleTemplate.activeOffsetY;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_102_0 = var3;
          stackIn_102_1 = new StringBuilder().append("mh.T(").append(obfuscationGuard).append(',');
          if (styleTemplate == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    UiComponent(long id, UiComponent styleTemplate, String text) {
        this(id, styleTemplate, 0, 0, 0, 0, text);
    }

    public static void c(byte param0) {
        field_Z = null;
        field_ab = null;
        field_ob = null;
        field_ib = null;
        field_H = null;
        field_F = null;
        if (param0 > 60) {
          field_mb = null;
          field_lb = null;
          return;
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (AlignedIconLabel.a((byte) -95, param1)) {
          return true;
        }
        if (param1 != 45 &&
          param1 != 160 &&
          32 != param1 &&
          95 != param1) {
          if (param0) {
            return false;
          }
          previousPacketOpcode = -56;
          return false;
        }
        return true;
    }

    final void layoutVerticalContent(int viewportHeight, int gap, int obfuscationGuard, boolean keepChildLayout) {
        UiComponent child = null;
        int nextChildY = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        int currentScroll = -this.localY;
        int targetScroll = currentScroll - this.remainingY;
        int currentHeight = this.height;
        int targetHeight = this.remainingHeight + currentHeight;
        int maximumTargetScroll;
        if (!keepChildLayout) {
          nextChildY = 0;
          child = (UiComponent) (this.children.first(obfuscationGuard ^ 2147483544));
          while (child != null) {
            child.remainingY = nextChildY - child.localY;
            nextChildY = nextChildY + (gap + child.height + child.remainingHeight);
            child = (UiComponent) (this.children.next((byte) 116));
          }
          targetHeight = -gap + nextChildY;
        }
        maximumTargetScroll = targetHeight - viewportHeight;
        if (maximumTargetScroll < targetScroll) {
          targetScroll = maximumTargetScroll;
        }
        if (0 > targetScroll) {
          targetScroll = 0;
        }
        int maximumCurrentScroll = -viewportHeight + currentHeight;
        if (maximumCurrentScroll < currentScroll) {
          currentScroll = maximumCurrentScroll;
        }
        if (0 > currentScroll) {
          currentScroll = 0;
        }
        this.remainingY = currentScroll - targetScroll;
        this.remainingHeight = -currentHeight + targetHeight;
        this.height = currentHeight;
        this.localY = -currentScroll;
        if (obfuscationGuard != -2147483648) {
          UiComponent.c((byte) -123);
        }
    }

    final void markDescendantsToInheritVisualState(boolean obfuscationGuard) {
        UiComponent var4 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (null != this.children) {
          var4 = (UiComponent) (this.children.last(0));
          while (var4 != null) {
            var4.inheritVisualState = true;
            var4.markDescendantsToInheritVisualState(true);
            var4 = (UiComponent) (this.children.previous(118));
          }
        }
        if (!obfuscationGuard) {
          this.lineSpacing = -7;
        }
    }

    final void updateRoot(boolean inputEnabled, int obfuscationGuard) {
        NinjaBackground.uiHoverClaimed = !inputEnabled ? true : false;
        if (obfuscationGuard == -15211) {
          wc.uiPressClaimed = !inputEnabled ? true : false;
          this.updateTree(Rasterizer2D.width, 886229954, 0, Rasterizer2D.height, 0, true);
          return;
        }
    }

    final void drawRoot(boolean enabled, boolean showTextSuffix) {
        this.drawTree(false, 0, -109, Rasterizer2D.width, false, enabled, false, Rasterizer2D.height, showTextSuffix, 0, false);
    }

    final void setBounds(int height, int y, int x, int width, byte obfuscationGuard) {
        if (obfuscationGuard != 64) {
          this.layoutVerticalContent(105, -91, -77, false);
        }
        this.localY = y;
        this.height = height;
        this.remainingX = 0;
        this.remainingWidth = 0;
        this.remainingHeight = 0;
        this.width = width;
        this.remainingY = 0;
        this.localX = x;
    }

    final void placeBelow(UiComponent previous, int gap, UiComponent target, int obfuscationGuard) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String previousSummary = null;
        StringBuilder targetContext = null;
        String targetSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (obfuscationGuard != 17290) {
            return;
          }
          if (previous != null) {
            target.localY = gap + previous.localY + previous.height;
            target.remainingY = previous.remainingHeight + previous.remainingY;
          } else {
            target.localY = 0;
            target.remainingY = 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("mh.CA(");
          if (previous == null) {
            previousSummary = "null";
          } else {
            previousSummary = "{...}";
          }
          targetContext = ((StringBuilder) (Object) contextBuilder).append(previousSummary).append(',').append(gap).append(',');
          if (target == null) {
            targetSummary = "null";
          } else {
            targetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) targetContext).append(targetSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void addChild(UiComponent child, int obfuscationGuard) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String childSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (null == this.children) {
            this.children = new NodeDeque();
          }
          this.children.addLast(child, (byte) 3);
          if (obfuscationGuard != 0) {
            this.updateTree(-97, -100, 116, 23, -11, true);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("mh.P(");
          if (child == null) {
            childSummary = "null";
          } else {
            childSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(childSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    protected UiComponent() {
        this.selectedOffsetX = -2147483648;
        this.spriteAlpha256 = 256;
        this.capturedOffsetY = -2147483648;
        this.activeOffsetX = -2147483648;
        this.activeOffsetY = -2147483648;
        this.capturedOffsetX = -2147483648;
        this.activeTextColor = -1;
        this.capturedTextColor = -1;
        this.field_fb = false;
        this.enabled = true;
        this.textAlpha256 = 256;
        this.field_Bb = false;
        this.selectedTextColor = -1;
        this.selectedOffsetY = -2147483648;
        this.disabledTextColor = -1;
    }

    UiComponent(long id, UiComponent styleTemplate, int x, int y, int width, int height, String text) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.selectedOffsetX = -2147483648;
        this.spriteAlpha256 = 256;
        this.capturedOffsetY = -2147483648;
        this.activeOffsetX = -2147483648;
        this.activeOffsetY = -2147483648;
        this.capturedOffsetX = -2147483648;
        this.activeTextColor = -1;
        this.capturedTextColor = -1;
        this.field_fb = false;
        this.enabled = true;
        this.textAlpha256 = 256;
        this.field_Bb = false;
        this.selectedTextColor = -1;
        this.selectedOffsetY = -2147483648;
        this.disabledTextColor = -1;
        try {
          this.localY = y;
          this.key = id;
          this.width = width;
          this.localX = x;
          this.height = height;
          this.copyStyle((byte) -67, styleTemplate);
          if (text != null) {
            this.text = text;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mh.<init>(").append(id).append(',');
          if (styleTemplate == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(x).append(',').append(y).append(',').append(width).append(',').append(height).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int measureContentWidth(int wrapWidth, int minimum) {
        UiComponent child = null;
        int childRight = 0;
        int textWidth = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        int width = minimum;
        int spriteWidth;
        if (this.text != null &&
          null != this.font) {
          textWidth = this.font.measureWrappedWidth(this.text, wrapWidth);
          if (width < textWidth) {
            width = textWidth;
          }
        }
        if (this.sprite != null) {
          spriteWidth = this.sprite.canvasWidth;
          if (spriteWidth > width) {
            width = spriteWidth;
          }
        }
        if (this.children != null) {
          child = (UiComponent) (this.children.first(-85));
          while (child != null) {
            childRight = child.localX + child.width;
            if (width < childRight) {
              width = childRight;
            }
            child = (UiComponent) (this.children.next((byte) 116));
          }
        }
        return width;
    }

    final int getContentWidth(int obfuscationGuard) {
        if (obfuscationGuard < 59) {
          this.selectedOffsetY = -89;
        }
        return this.measureContentWidth(2147483647, 0);
    }

    static {
        field_H = new MenuSelection(1);
        field_Z = "Game";
        previousPacketOpcode = -1;
        field_mb = "Log in / Create account";
        field_F = new int[9000];
        field_ob = new PcmSound[8];
        field_ab = new tf();
    }
}
