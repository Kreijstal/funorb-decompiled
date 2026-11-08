/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiComponent extends UiComponentNode {
    int disabledTextColor;
    int selectedOffsetY;
    static int field_L;
    int lineSpacing;
    int pressLocalX;
    int textColor;
    private int remainingWidth;
    int contentOffsetX;
    private boolean field_U;
    Sprite sprite;
    private boolean inheritVisualState;
    private int activeOffsetX;
    private int remainingX;
    boolean enabled;
    static String privatequickchatFromX;
    boolean draggable;
    Sprite[] disabledFrameSprites;
    Sprite disabledSprite;
    boolean hovered;
    int screenY;
    Sprite[] capturedFrameSprites;
    Sprite[] activeFrameSprites;
    private int spriteAlpha256;
    int capturedOffsetX;
    int localY;
    int textAlpha256;
    boolean useParentFrameBounds;
    static TutorialController field_Ab;
    private int activeOffsetY;
    Sprite activeSprite;
    String textSuffix;
    int remainingHeight;
    int activeTextColor;
    BitmapFont font;
    int selectedTextColor;
    int selectedOffsetX;
    int screenX;
    String text;
    IntrusiveDeque children;
    Sprite selectedSprite;
    int horizontalAlignment;
    int textInset;
    boolean activeInside;
    Sprite[] selectedFrameSprites;
    int pressedButton;
    Sprite capturedSprite;
    private boolean field_fb;
    Sprite[] frameSprites;
    int height;
    int localX;
    int capturedTextColor;
    int capturedButton;
    boolean selected;
    private int pressLocalY;
    int capturedOffsetY;
    int verticalAlignment;
    int remainingY;
    int width;
    int contentOffsetY;

    final UiComponent findById(long param0, byte param1) {
        UiComponent var5;
        int var6;
        UiComponent var7;
        var6 = Pool.field_O;
        if (param0 == this.key) {
          return this;
        }
        if (param1 != 31) {
          return (UiComponent) null;
        }
        if (this.children == null) {
          return null;
        }
        var7 = (UiComponent) (this.children.last((byte) 111));
        while (var7 != null) {
          var5 = var7.findById(param0, (byte) 31);
          if (var5 != null) {
            return var5;
          }
          var7 = (UiComponent) (this.children.previous((byte) -5));
        }
        return null;
    }

    final int measureContentWidth(int param0, int param1) {
        UiComponent var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var4_intLifetime1;
        if (param0 >= -54) {
          this.markDescendantsToInheritVisualState((byte) 74);
        }
        int var3 = 0;
        if (null != this.text &&
          this.font != null) {
          var4_int = this.font.maxWrappedLineWidth(this.text, param1);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (this.sprite != null) {
          var4_intLifetime1 = this.sprite.field_w;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.children != null) {
          var4 = (UiComponent) (this.children.last((byte) 69));
          while (var4 != null) {
            var5 = var4.localX + var4.width;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (UiComponent) (this.children.previous((byte) -5));
          }
        }
        return var3;
    }

    final void copyStyle(byte param0, UiComponent param1) {
        boolean stackIn_96_1 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.sprite != null) {
              this.sprite = param1.sprite;
            }
            if (null != param1.disabledFrameSprites) {
              this.disabledFrameSprites = param1.disabledFrameSprites;
            }
            if (param1.frameSprites != null) {
              this.frameSprites = param1.frameSprites;
            }
            if (null != param1.text) {
              this.text = param1.text;
            }
            if (param1.disabledSprite != null) {
              this.disabledSprite = param1.disabledSprite;
            }
            if (0 <= param1.capturedTextColor) {
              this.capturedTextColor = param1.capturedTextColor;
            }
            if (null != param1.activeFrameSprites) {
              this.activeFrameSprites = param1.activeFrameSprites;
            }
            if (0 <= param1.selectedTextColor) {
              this.selectedTextColor = param1.selectedTextColor;
            }
            if (param1.textInset != 0) {
              this.textInset = param1.textInset;
            }
            if (param1.textColor != 0) {
              this.textColor = param1.textColor;
            }
            if (param1.activeSprite != null) {
              this.activeSprite = param1.activeSprite;
            }
            if (param1.selected) {
              this.selected = param1.selected;
            }
            if (param1.capturedFrameSprites != null) {
              this.capturedFrameSprites = param1.capturedFrameSprites;
            }
            if (!param1.enabled) {
              this.enabled = param1.enabled;
            }
            if (param1.useParentFrameBounds) {
              this.useParentFrameBounds = param1.useParentFrameBounds;
            }
            if (0 <= param1.disabledTextColor) {
              this.disabledTextColor = param1.disabledTextColor;
            }
            if (param1.inheritVisualState) {
              this.inheritVisualState = param1.inheritVisualState;
            }
            if (param1.font != null) {
              this.font = param1.font;
            }
            if (param1.lineSpacing != 0) {
              this.lineSpacing = param1.lineSpacing;
            }
            if (param1.selectedSprite != null) {
              this.selectedSprite = param1.selectedSprite;
            }
            if (param1.selectedFrameSprites != null) {
              this.selectedFrameSprites = param1.selectedFrameSprites;
            }
            if (null != param1.textSuffix) {
              this.textSuffix = param1.textSuffix;
            }
            if (null != param1.capturedSprite) {
              this.capturedSprite = param1.capturedSprite;
            }
            if (param1.textAlpha256 != 256) {
              this.textAlpha256 = param1.textAlpha256;
            }
            if (param1.field_U) {
              this.field_U = param1.field_U;
            }
            if (param1.activeTextColor >= 0) {
              this.activeTextColor = param1.activeTextColor;
            }
            if (param1.horizontalAlignment != 0) {
              this.horizontalAlignment = param1.horizontalAlignment;
            }
            if (param1.selectedOffsetX != -2147483648) {
              this.selectedOffsetX = param1.selectedOffsetX;
            }
            if (-2147483648 != param1.capturedOffsetY) {
              this.capturedOffsetY = param1.capturedOffsetY;
            }
            if (param1.verticalAlignment != 0) {
              this.verticalAlignment = param1.verticalAlignment;
            }
            if (param1.capturedOffsetX != -2147483648) {
              this.capturedOffsetX = param1.capturedOffsetX;
            }
            if (param1.draggable) {
              this.draggable = param1.draggable;
            }
            if (0 != param1.contentOffsetX) {
              this.contentOffsetX = param1.contentOffsetX;
            }
            if (param1.selectedOffsetY != -2147483648) {
              this.selectedOffsetY = param1.selectedOffsetY;
            }
            if (param1.activeOffsetX != -2147483648) {
              this.activeOffsetX = param1.activeOffsetX;
            }
            if (param1.activeOffsetY != -2147483648) {
              this.activeOffsetY = param1.activeOffsetY;
            }
            stackIn_96_1 = (this.field_U) && (param1.field_fb);
            this.field_fb = stackIn_96_1;
            if (param1.contentOffsetY != 0) {
              this.contentOffsetY = param1.contentOffsetY;
            }
          }
          if (param0 != -87) {
            this.field_U = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("vh.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final void markDescendantsToInheritVisualState(byte param0) {
        UiComponent var3 = null;
        if (null != this.children) {
          var3 = (UiComponent) (this.children.first((byte) -127));
          while (var3 != null) {
            var3.inheritVisualState = true;
            var3.markDescendantsToInheritVisualState((byte) -128);
            var3 = (UiComponent) (this.children.next((byte) -46));
          }
        }
        if (param0 >= -123) {
          this.pressLocalX = -106;
        }
    }

    final void drawRoot(byte param0, boolean param1) {
        this.drawTree(false, 0, (byte) 85, false, false, SoftwareRasterizer.height, 0, SoftwareRasterizer.width, param1, false, true);
        if (param0 != -79) {
          this.remainingHeight = 21;
        }
    }

    private final void drawTree(boolean param0, int param1, byte param2, boolean param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        Sprite[] var16;
        Sprite var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        UiComponent var23_ref;
        int var24;
        String var25;
        String var23Lifetime1;
        String var23Lifetime2;
        this.screenY = this.localY + param6;
        this.screenX = this.localX + param1;
        var12 = SoftwareRasterizer.clipLeft;
        var13 = SoftwareRasterizer.clipTop;
        var14 = SoftwareRasterizer.clipRight;
        var15 = SoftwareRasterizer.clipBottom;
        SoftwareRasterizer.intersectClip(this.screenX, this.screenY, this.width + this.screenX, this.screenY + this.height);
        if (!this.inheritVisualState) {
          param4 = this.activeInside;
          stackIn_5_0 = (this.capturedButton != 0);
          param0 = stackIn_5_0;
          param3 = this.selected;
        }
        param10 = param10 & this.enabled;
        var16 = this.frameSprites;
        var17 = this.sprite;
        var18 = this.textColor;
        var19 = 0;
        var20 = 0;
        if (!param10) {
          if (this.disabledFrameSprites != null) {
            var16 = this.disabledFrameSprites;
          }
          if (this.disabledTextColor >= 0) {
            var18 = this.disabledTextColor;
          }
          if (null != this.disabledSprite) {
            var17 = this.disabledSprite;
          }
        }
        if (param4) {
          if (this.activeFrameSprites != null) {
            var16 = this.activeFrameSprites;
          }
          if (this.activeSprite != null) {
            var17 = this.activeSprite;
          }
          if (this.activeOffsetX != -2147483648) {
            var19 = this.activeOffsetX;
          }
          if (this.activeTextColor >= 0) {
            var18 = this.activeTextColor;
          }
          if (this.activeOffsetY != -2147483648) {
            var20 = this.activeOffsetY;
          }
        }
        if (param0) {
          if (this.capturedOffsetX != -2147483648) {
            var19 = this.capturedOffsetX;
          }
          if (this.capturedTextColor >= 0) {
            var18 = this.capturedTextColor;
          }
          if (this.capturedOffsetY != -2147483648) {
            var20 = this.capturedOffsetY;
          }
          if (null != this.capturedSprite) {
            var17 = this.capturedSprite;
          }
          if (this.capturedFrameSprites != null) {
            var16 = this.capturedFrameSprites;
          }
        }
        if (param3) {
          if (this.selectedFrameSprites != null) {
            var16 = this.selectedFrameSprites;
          }
          if (this.selectedSprite != null) {
            var17 = this.selectedSprite;
          }
          if (this.selectedTextColor >= 0) {
            var18 = this.selectedTextColor;
          }
          if (this.selectedOffsetY != -2147483648) {
            var20 = this.selectedOffsetY;
          }
          if (this.selectedOffsetX != -2147483648) {
            var19 = this.selectedOffsetX;
          }
        }
        var21 = var19 + this.contentOffsetX;
        if (param2 != 85) {
          this.contentOffsetX = -109;
        }
        var22 = var20 + this.contentOffsetY;
        if (!this.useParentFrameBounds) {
          LogoMaterial.drawNineSlice(var16, (byte) -85, this.width, this.screenX, this.screenY, this.height);
        } else {
          LogoMaterial.drawNineSlice(var16, (byte) -107, param7, param1, param6, param5);
        }
        if (var17 != null) {
          var23_int = var21 + this.screenX;
          var24 = this.screenY + var22;
          if (this.horizontalAlignment == 1) {
            var23_int = var23_int + (-var17.field_w + this.width) / 2;
          }
          if (this.horizontalAlignment == 2) {
            var23_int = var23_int + (-var17.field_w + this.width);
          }
          if (this.verticalAlignment == 1) {
            var24 = var24 + (this.height - var17.field_y) / 2;
          }
          if (this.verticalAlignment == 2) {
            var24 = var24 + (-var17.field_y + this.height);
          }
          if (this.spriteAlpha256 >= 256) {
            var17.draw(var23_int, var24);
          } else {
            var17.drawShadedGrayscale(var23_int, var24, this.spriteAlpha256);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.text &&
          this.font != null) {
          var25 = this.text;
          var23 = var25;
          var23Lifetime1 = var25;
          var23Lifetime2 = var25;
          if (param8 &&
            null != this.textSuffix) {
            var23Lifetime2 = var25 + this.textSuffix;
          }
          if (this.font.stringWidth(var23Lifetime2) <= this.width - this.textInset * 2 &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.verticalAlignment != 1) {
              if (this.verticalAlignment == 2) {
                var22 = var22 + (this.height - (this.font.maxDescent + this.font.maxAscent));
              }
            } else {
              var22 = var22 + (this.height - (this.font.maxAscent + this.font.maxDescent)) / 2;
            }
            if (0 == this.horizontalAlignment) {
              this.font.drawLeftAlpha(var23Lifetime2, this.textInset + (this.screenX + var21), this.font.maxAscent + (var22 + this.screenY), var18, -1, this.textAlpha256);
            } else {
              if (this.horizontalAlignment == 1) {
                this.font.drawCenteredAlpha(var23Lifetime2, (-(this.textInset * 2) + this.width) / 2 + var21 + (this.screenX + this.textInset), this.font.maxAscent + var22 + this.screenY, var18, -1, this.textAlpha256);
              } else {
                if (this.horizontalAlignment != 2) {
                  this.font.drawParagraphAlpha(var23Lifetime2, this.textInset + (this.screenX + var21), this.screenY + var22, -(2 * this.textInset) + this.width, this.height, var18, -1, this.textAlpha256, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
                } else {
                  this.font.drawRightAlpha(var23Lifetime2, this.textInset + (this.screenX + var21 - (-this.width + this.textInset * 2)), this.font.maxAscent + var22 + this.screenY, var18, -1, this.textAlpha256);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.font.drawParagraphAlpha(var23Lifetime2, this.textInset + this.screenX + var21, this.screenY + var22, this.width - this.textInset * 2, this.height, var18, -1, this.textAlpha256, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
          }
        }
        if (null != this.children) {
          var23_ref = (UiComponent) (this.children.last((byte) -87));
          while (var23_ref != null) {
            var23_ref.drawTree(param0, this.screenX + var19, (byte) 85, param3, param4, this.height, this.screenY + var20, this.width, param8, this.field_fb, param10);
            var23_ref = (UiComponent) (this.children.previous((byte) -5));
          }
        }
        SoftwareRasterizer.setClip(var12, var13, var14, var15);
    }

    final void placeBelow(UiComponent param0, int param1, UiComponent param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 > -40) {
            this.selectedTextColor = 69;
          }
          if (param0 == null) {
            param2.localY = 0;
            param2.remainingY = 0;
          } else {
            param2.remainingY = param0.remainingY + param0.remainingHeight;
            param2.localY = param0.localY + (param0.height + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("vh.JA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 8) {
          field_L = -59;
        }
        privatequickchatFromX = null;
        field_Ab = null;
    }

    final void layoutVerticalContent(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        UiComponent var10_ref_vh = null;
        int var10 = 0;
        int var9 = 0;
        int var9Lifetime1;
        if (param3 == -1) {
          var5 = -this.localY;
          var6 = -this.remainingY + var5;
          var7 = this.height;
          var8 = this.remainingHeight + var7;
          if (!param2) {
            var9 = 0;
            var10_ref_vh = (UiComponent) (this.children.last((byte) -82));
            while (var10_ref_vh != null) {
              var10_ref_vh.remainingY = var9 - var10_ref_vh.localY;
              var9 = var9 + (param0 + var10_ref_vh.remainingHeight + var10_ref_vh.height);
              var10_ref_vh = (UiComponent) (this.children.previous((byte) -5));
            }
            var8 = -param0 + var9;
          }
          var9Lifetime1 = var8 - param1;
          if (var6 > var9Lifetime1) {
            var6 = var9Lifetime1;
          }
          if (var6 < 0) {
            var6 = 0;
          }
          var10 = -param1 + var7;
          if (var5 > var10) {
            var5 = var10;
          }
          if (var5 < 0) {
            var5 = 0;
          }
          this.height = var7;
          this.localY = -var5;
          this.remainingY = var5 - var6;
          this.remainingHeight = -var7 + var8;
          return;
        }
    }

    final void updateRoot(boolean param0, boolean param1) {
        AccountTextSupport.field_d = !param0 ? true : false;
        if (param1) {
          this.sprite = (Sprite) null;
        }
        ProjectedLineSupport.field_f = !param0 ? true : false;
        this.updateTree(0, true, SoftwareRasterizer.width, SoftwareRasterizer.height, (byte) 107, 0);
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.remainingY = 0;
        this.remainingHeight = 0;
        this.remainingWidth = 0;
        this.localY = param0;
        this.remainingX = 0;
        this.height = param4;
        this.width = param3;
        if (param1 != 2147483647) {
          this.setBounds(23, -24, 46, 74, -74);
        }
        this.localX = param2;
    }

    private final void updateTree(int param0, boolean param1, int param2, int param3, byte param4, int param5) {
        boolean stackIn_33_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        UiComponent var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        if (this.remainingX > 0) {
          var7 = -(-this.remainingX >> 2);
        } else {
          var7 = this.remainingX >> 2;
        }
        this.localX = this.localX + var7;
        this.remainingX = this.remainingX - var7;
        if (0 < this.remainingY) {
          var7Lifetime1 = -(-this.remainingY >> 2);
        } else {
          var7Lifetime1 = this.remainingY >> 2;
        }
        this.localY = this.localY + var7Lifetime1;
        this.remainingY = this.remainingY - var7Lifetime1;
        if (0 < this.remainingWidth) {
          var7Lifetime2 = -(-this.remainingWidth >> 2);
        } else {
          var7Lifetime2 = this.remainingWidth >> 2;
        }
        this.width = this.width + var7Lifetime2;
        this.remainingWidth = this.remainingWidth - var7Lifetime2;
        if (0 >= this.remainingHeight) {
          var7Lifetime3 = this.remainingHeight >> 2;
        } else {
          var7Lifetime3 = -(-this.remainingHeight >> 2);
        }
        this.screenX = this.localX + param5;
        param1 = param1 & this.enabled;
        this.screenY = param0 + this.localY;
        this.remainingHeight = this.remainingHeight - var7Lifetime3;
        this.height = this.height + var7Lifetime3;
        var8 = SoftwareRasterizer.clipLeft;
        var9 = SoftwareRasterizer.clipTop;
        var11 = 123 % ((28 - param4) / 34);
        var10 = SoftwareRasterizer.clipRight;
        var12 = SoftwareRasterizer.clipBottom;
        SoftwareRasterizer.intersectClip(this.screenX, this.screenY, this.screenX + this.width, this.height + this.screenY);
        var13 = 0;
        if (!AccountTextSupport.field_d &&
          param1 &&
          0 != MatchingTextValidator.field_s &&
          SoftwareRasterizer.clipLeft <= DialogLayer.field_W &&
          DialogLayer.field_W < SoftwareRasterizer.clipRight &&
          SoftwareRasterizer.clipTop <= UsernameAvailabilityValidator.field_o &&
          SoftwareRasterizer.clipBottom > UsernameAvailabilityValidator.field_o) {
          this.pressLocalY = UsernameAvailabilityValidator.field_o - this.screenY;
          var13 = 1;
          this.pressedButton = MatchingTextValidator.field_s;
          this.pressLocalX = DialogLayer.field_W - this.screenX;
          this.capturedButton = MatchingTextValidator.field_s;
        } else {
          if (0 != MatchingTextValidator.field_s) {
            this.capturedButton = 0;
          }
          this.pressedButton = 0;
        }
        if (0 == ClientInputResetSupport.field_b) {
          this.capturedButton = 0;
        }
        stackIn_33_1 = (!ProjectedLineSupport.field_f) && (SoftwareRasterizer.clipLeft <= ReflectionReplySupport.field_i) && (ReflectionReplySupport.field_i < SoftwareRasterizer.clipRight) && (DebouncedValidationProvider.field_f >= SoftwareRasterizer.clipTop) && (SoftwareRasterizer.clipBottom > DebouncedValidationProvider.field_f);
        this.hovered = stackIn_33_1;
        stackIn_38_1 = (this.hovered) && (this.capturedButton == ClientInputResetSupport.field_b) && (param1);
        this.activeInside = stackIn_38_1;
        if (this.children != null) {
          var14 = (UiComponent) (this.children.first((byte) -127));
          while (var14 != null) {
            var14.updateTree(this.screenY, param1, this.width, this.height, (byte) 63, this.screenX);
            var14 = (UiComponent) (this.children.next((byte) -46));
          }
        }
        if (var13 != 0) {
          AccountTextSupport.field_d = true;
        }
        if (this.hovered) {
          ProjectedLineSupport.field_f = true;
        }
        SoftwareRasterizer.setClip(var8, var9, var10, var12);
        if (this.capturedButton != 0 &&
          this.draggable) {
          this.localX = -param5 + (ReflectionReplySupport.field_i - this.pressLocalX);
          this.localY = -param0 + (DebouncedValidationProvider.field_f - this.pressLocalY);
          if (this.localX < 0) {
            this.localX = 0;
          }
          if (this.localY < 0) {
            this.localY = 0;
          }
          if (param2 - this.width < this.localX) {
            this.localX = param2 - this.width;
          }
          this.screenX = param5 + this.localX;
          this.remainingX = 0;
          if (param3 - this.height < this.localY) {
            this.localY = -this.height + param3;
          }
          this.remainingY = 0;
          this.screenY = this.localY + param0;
        }
    }

    UiComponent(String param0, UiComponent param1, int param2, int param3, int param4, int param5, String param6) {
        this(SpriteState.hashText31(112, (CharSequence) ((Object) param0)), param1, param2, param3, param4, param5, param6);
    }

    UiComponent(String param0, UiComponent param1) {
        this(SpriteState.hashText31(109, (CharSequence) ((Object) param0)), param1, 0, 0, 0, 0, (String) null);
    }

    UiComponent(long param0, UiComponent param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    UiComponent(long param0, UiComponent param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void addChild(int param0, UiComponent param1) {
        try {
          int var3_int = 118 / ((param0 + 50) / 43);
          if (this.children == null) {
            this.children = new IntrusiveDeque();
          }
          this.children.addFirst((byte) -83, param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vh.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getContentWidth(boolean param0) {
        if (!param0) {
          return -108;
        }
        return this.measureContentWidth(-126, 2147483647);
    }

    final static Sprite a(int param0, ResourceArchive param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Sprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -28) {
            field_Ab = (TutorialController) null;
          }
          if (TextLineLayout.a(param0, param1, param3, (byte) 121)) {
            stackIn_6_0 = NameEntryPopup.createDecodedSprite((byte) 89);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (Sprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vh.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public UiComponent() {
        this.capturedOffsetX = -2147483648;
        this.spriteAlpha256 = 256;
        this.enabled = true;
        this.activeOffsetX = -2147483648;
        this.activeTextColor = -1;
        this.selectedOffsetY = -2147483648;
        this.selectedTextColor = -1;
        this.activeOffsetY = -2147483648;
        this.disabledTextColor = -1;
        this.field_U = false;
        this.selectedOffsetX = -2147483648;
        this.textAlpha256 = 256;
        this.capturedTextColor = -1;
        this.capturedOffsetY = -2147483648;
        this.field_fb = false;
    }

    UiComponent(long param0, UiComponent param1, int param2, int param3, int param4, int param5, String param6) {
        this.capturedOffsetX = -2147483648;
        this.spriteAlpha256 = 256;
        this.enabled = true;
        this.activeOffsetX = -2147483648;
        this.activeTextColor = -1;
        this.selectedOffsetY = -2147483648;
        this.selectedTextColor = -1;
        this.activeOffsetY = -2147483648;
        this.disabledTextColor = -1;
        this.field_U = false;
        this.selectedOffsetX = -2147483648;
        this.textAlpha256 = 256;
        this.capturedTextColor = -1;
        this.capturedOffsetY = -2147483648;
        this.field_fb = false;
        try {
          this.key = param0;
          this.width = param4;
          this.localY = param3;
          this.height = param5;
          this.localX = param2;
          this.copyStyle((byte) -87, param1);
          if (param6 != null) {
            this.text = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        privatequickchatFromX = "From <%0>: ";
    }
}
