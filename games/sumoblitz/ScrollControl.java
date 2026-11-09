/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollControl extends ArrayWidgetContainer implements WidgetActionListener {
    private int horizontalStepQ16;
    private boolean verticalEnabled;
    private int field_C;
    private boolean horizontalEnabled;
    private InteractiveWidget upButton;
    private InteractiveWidget downButton;
    private InteractiveWidget leftButton;
    private int minThumbHeight;
    private DraggableWidget thumb;
    static int field_I;
    private InteractiveWidget rightButton;
    int horizontalPositionQ16;
    private int field_O;
    private InteractiveWidget track;
    private boolean field_B;
    private int minThumbWidth;
    int verticalPositionQ16;
    int verticalStepQ16;

    final void setVerticalPosition(int guard, int positionQ16) {
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 0) {
          return;
        }
        if (positionQ16 < 0) {
          this.verticalPositionQ16 = 0;
        } else {
          if (positionQ16 > 65536) {
            this.verticalPositionQ16 = 65536;
          } else {
            this.verticalPositionQ16 = positionQ16;
          }
        }
        this.positionVerticalThumb(-1840);
    }

    private final void setHorizontalPositionAndNotify(byte guard, int positionQ16) {
        int var3 = 106 / ((-25 - guard) / 52);
        this.setHorizontalPosition(positionQ16, (byte) 122);
        if (this.listener instanceof WidgetScrollListener) {
          ((WidgetScrollListener) (this.listener)).onScrollChanged(this, -6772, this.verticalPositionQ16, this.horizontalPositionQ16);
        }
    }

    final static long encodeBase37Name(CharSequence name, int guard) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = name.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = name.charAt(var5);
            if (var6 >= 65 &&
              90 >= var6) {
              var2_long = var2_long + (long)(var6 - 64);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 + (var6 - 97));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-48 + (27 + var6));
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          if (guard != 7441) {
            field_I = -23;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("vo.AA(");
          if (name == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(guard).append(')').toString());
        }
    }

    final static LegacyAlphaFont a(boolean param0, byte[] param1) {
        LegacyAlphaFont var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        Object stackIn_2_0 = null;
        LegacyAlphaFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (LegacyAlphaFont) (stackIn_2_0);
          }
          if (param0) {
            var3 = (CharSequence) null;
            ScrollControl.encodeBase37Name((CharSequence) null, 104);
          }
          var2 = new LegacyAlphaFont(param1, MenuSelectionController.field_h, StrongCacheReference.field_C, CheckboxRenderer.field_k, ScrollViewport.field_B, LegacyOpenGlEffectManager.field_l, TextLayout.field_d);
          PowerupPickup.releaseSpriteDecoderArrays((byte) -60);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("vo.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void setHorizontalPosition(int positionQ16, byte guard) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var3 = -36 / ((guard - 50) / 41);
        if (0 > positionQ16) {
          this.horizontalPositionQ16 = 0;
        } else {
          if (positionQ16 <= 65536) {
            this.horizontalPositionQ16 = positionQ16;
          } else {
            this.horizontalPositionQ16 = 65536;
          }
        }
        this.positionHorizontalThumb((byte) 100);
    }

    private final void updateHorizontalPositionFromThumb(byte guard) {
        if (guard != -121) {
          this.setVerticalControlsEnabled(100, false);
        }
        int var2 = this.leftButton == null ? this.track.x : this.leftButton.x + this.leftButton.width;
        int var3 = null != this.rightButton ? this.rightButton.x - this.thumb.width : this.track.width + this.track.x - this.thumb.width;
        this.setHorizontalPosition(var3 > var2 ? (this.thumb.x - var2 << 16) / (var3 - var2) : 0, (byte) -6);
    }

    final static ResourceArchive b(int param0, int param1) {
        ResourceArchive stackIn_7_0 = null;
        if (param1 != -1) {
          return (ResourceArchive) null;
        }
        if (GraphicsToolkit.field_g == null &&
          param0 != -1) {
          stackIn_7_0 = HardwareSpecularEffect.a(1, -117, true, param0, false, true);
        } else {
          stackIn_7_0 = GraphicsToolkit.field_g;
        }
        return stackIn_7_0;
    }

    private final void setVerticalPositionAndNotify(int positionQ16, byte guard) {
        this.setVerticalPosition(0, positionQ16);
        if (guard != -125) {
          return;
        }
        if (this.listener instanceof WidgetScrollListener) {
          ((WidgetScrollListener) (this.listener)).onScrollChanged(this, -6772, this.verticalPositionQ16, this.verticalPositionQ16);
        }
    }

    final static boolean isCp1252Character(int guard, char character) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard >= -1) {
            return false;
          }
          if ((character <= 0 ||
            128 <= character) &&
            (character < 160 ||
            255 < character)) {
            if (character == 0) {
              return false;
            }
            var6 = AccountCreationProgressDialog.CP1252_EXTENSION;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (character == var4) {
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "vo.V(" + guard + ',' + character + ')');
        }
    }

    final boolean requestFocus(UiWidget root, byte guard) {
        DraggableWidget var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 61) {
            this.setHorizontalPosition(-73, (byte) 11);
          }
          var3 = this.thumb;
          if (var3 == null) {
            return false;
          }
          if (!((UiWidget) ((Object) var3)).requestFocus(root, (byte) 61)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("vo.Q(");
          if (root == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        int var7 = 0;
        byte[] var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 710) {
            var8 = (byte[]) null;
            ScrollControl.a(true, (byte[]) null);
          }
          if (action == 1) {
            if (!this.field_B) {
              return;
            }
            if (this.verticalEnabled &&
              this.upButton == source) {
              this.setVerticalPositionAndNotify(-this.verticalStepQ16 + this.verticalPositionQ16, (byte) -125);
              return;
            }
            if (this.verticalEnabled &&
              source == this.downButton) {
              this.setVerticalPositionAndNotify(this.verticalStepQ16 + this.verticalPositionQ16, (byte) -125);
              return;
            }
            if (this.horizontalEnabled &&
              source == this.leftButton) {
              this.setHorizontalPositionAndNotify((byte) -78, this.horizontalPositionQ16 - this.horizontalStepQ16);
              return;
            }
            if (this.horizontalEnabled &&
              this.rightButton == source) {
              this.setHorizontalPositionAndNotify((byte) 48, this.horizontalStepQ16 + this.horizontalPositionQ16);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vo.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    private final void updateVerticalPositionFromThumb(int guard) {
        int var2 = this.upButton != null ? this.upButton.y + this.upButton.height : this.track.y;
        int var3 = null != this.downButton ? this.downButton.y - this.thumb.height : -this.thumb.height + this.track.y + this.track.height;
        this.setVerticalPosition(0, var3 <= var2 ? 0 : (this.thumb.y - var2 << 16) / (-var2 + var3));
        if (guard != -2066408880) {
          this.thumb = (DraggableWidget) null;
        }
    }

    private final void setHorizontalControlsEnabled(boolean isEnabled, int guard) {
        InteractiveWidget stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        InteractiveWidget stackIn_9_0 = null;
        boolean stackIn_11_1 = false;
        InteractiveWidget stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        InteractiveWidget stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        stackIn_3_0 = this.track;
        stackIn_5_1 = (isEnabled) || (this.verticalEnabled);
        stackIn_3_0.enabled = stackIn_5_1;
        if (this.thumb.child instanceof InteractiveWidget) {
          stackIn_9_0 = (InteractiveWidget) (this.thumb.child);
          stackIn_11_1 = (isEnabled) || (this.verticalEnabled);
          stackIn_9_0.enabled = stackIn_11_1;
        }
        if (guard > -126) {
          this.field_O = -95;
        }
        if (this.leftButton != null) {
          stackIn_17_0 = this.leftButton;
          stackIn_18_1 = (!isEnabled) ? false : true;
          stackIn_17_0.enabled = stackIn_18_1;
        }
        if (null != this.rightButton) {
          stackIn_23_0 = this.rightButton;
          stackIn_24_1 = (!isEnabled) ? false : true;
          stackIn_23_0.enabled = stackIn_24_1;
        }
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.update(parentX, -123, root, parentY);
          var5_int = 4 / ((guard + 25) / 45);
          if ((!(this.thumb.child instanceof InteractiveWidget) ||
            ((InteractiveWidget) (this.thumb.child)).enabled) && this.thumb.pressedButton == 1) {
            if (!this.horizontalEnabled) {
              this.positionHorizontalThumb((byte) 110);
            } else {
              var6 = this.horizontalPositionQ16;
              this.updateHorizontalPositionFromThumb((byte) -121);
              if (var6 != this.horizontalPositionQ16 &&
                this.listener instanceof WidgetScrollListener) {
                ((WidgetScrollListener) (this.listener)).onScrollDragged(this.horizontalPositionQ16, this.horizontalPositionQ16, this, false);
              }
            }
            if (!this.verticalEnabled) {
              this.positionVerticalThumb(-1840);
            } else {
              var6Lifetime2 = this.verticalPositionQ16;
              this.updateVerticalPositionFromThumb(-2066408880);
              if (this.verticalPositionQ16 != var6Lifetime2 &&
                this.listener instanceof WidgetScrollListener) {
                ((WidgetScrollListener) (this.listener)).onScrollDragged(this.verticalPositionQ16, this.horizontalPositionQ16, this, false);
              }
            }
          }
          if (this.track.enabled &&
            this.track.actionCode == 1) {
            if (this.verticalEnabled) {
              if (!this.horizontalEnabled) {
                if ((this.thumb.height >> 1) + parentY + this.thumb.y < ArenaDefinitionCodec.field_e) {
                  this.setVerticalPositionAndNotify(this.field_O + this.verticalPositionQ16, (byte) -125);
                } else {
                  this.setVerticalPositionAndNotify(this.verticalPositionQ16 - this.field_O, (byte) -125);
                }
              } else {
                var6Lifetime1 = -(this.thumb.width >> 1) + (-this.thumb.x - this.x - parentX + PointLight.mouseX);
                var7 = -parentY + (ArenaDefinitionCodec.field_e - this.y) - (this.thumb.y + (this.thumb.height >> 1));
                if (Math.abs(var7) > Math.abs(var6Lifetime1)) {
                  if (var7 > 0) {
                    this.setVerticalPositionAndNotify(this.field_O + this.verticalPositionQ16, (byte) -125);
                  } else {
                    this.setVerticalPositionAndNotify(this.verticalPositionQ16 - this.field_O, (byte) -125);
                  }
                } else {
                  if (var6Lifetime1 <= 0) {
                    this.setHorizontalPositionAndNotify((byte) -109, -this.field_C + this.horizontalPositionQ16);
                  } else {
                    this.setHorizontalPositionAndNotify((byte) 27, this.field_C + this.horizontalPositionQ16);
                  }
                }
              }
            } else {
              if (this.horizontalEnabled) {
                if (PointLight.mouseX <= this.thumb.x + parentX + (this.thumb.width >> 1)) {
                  this.setHorizontalPositionAndNotify((byte) 116, this.horizontalPositionQ16 - this.field_C);
                } else {
                  this.setHorizontalPositionAndNotify((byte) -79, this.horizontalPositionQ16 + this.field_C);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_41_0 = var5;
          stackIn_41_1 = new StringBuilder().append("vo.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(parentY).append(')').toString());
        }
    }

    private final void positionHorizontalThumb(byte guard) {
        int var2 = null == this.leftButton ? this.track.x : this.leftButton.x + this.leftButton.width;
        if (guard <= 89) {
          return;
        }
        int var3 = null == this.rightButton ? this.track.x + this.track.width - this.thumb.width : this.rightButton.x - this.thumb.width;
        this.thumb.x = ((-var2 + var3) * this.horizontalPositionQ16 >> 16) + var2;
    }

    final void setHorizontalExtent(int viewportWidth, int contentWidth, int guard) {
        int var5 = 0;
        int var4 = 34 % ((59 - guard) / 45);
        if (viewportWidth >= contentWidth) {
          this.thumb.setBounds(91, this.thumb.x, this.thumb.y, this.thumb.height, this.track.width);
          this.setHorizontalControlsEnabled(false, -127);
        } else {
          var5 = viewportWidth * this.track.width / contentWidth;
          if (var5 < this.minThumbWidth) {
            var5 = this.minThumbWidth;
          }
          this.thumb.setBounds(106, this.thumb.x, this.thumb.y, this.thumb.height, var5);
          this.setHorizontalControlsEnabled(true, -127);
        }
        this.positionHorizontalThumb((byte) 100);
    }

    private final void setVerticalControlsEnabled(int guard, boolean isEnabled) {
        InteractiveWidget stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        InteractiveWidget stackIn_12_0 = null;
        boolean stackIn_14_1 = false;
        InteractiveWidget stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        InteractiveWidget stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        stackIn_3_0 = this.track;
        stackIn_5_1 = (isEnabled) || (this.horizontalEnabled);
        stackIn_3_0.enabled = stackIn_5_1;
        if (guard != 8206) {
          return;
        }
        if (this.thumb.child instanceof InteractiveWidget) {
          stackIn_12_0 = (InteractiveWidget) (this.thumb.child);
          stackIn_14_1 = (isEnabled) || (this.horizontalEnabled);
          stackIn_12_0.enabled = stackIn_14_1;
        }
        if (null != this.upButton) {
          stackIn_18_0 = this.upButton;
          stackIn_19_1 = (!isEnabled) ? false : true;
          stackIn_18_0.enabled = stackIn_19_1;
        }
        if (null != this.downButton) {
          stackIn_23_0 = this.downButton;
          stackIn_24_1 = (!isEnabled) ? false : true;
          stackIn_23_0.enabled = stackIn_24_1;
        }
    }

    private final void positionVerticalThumb(int guard) {
        int var2 = null == this.upButton ? this.track.y : this.upButton.y + this.upButton.height;
        int var3 = this.downButton != null ? -this.thumb.height + this.downButton.y : -this.thumb.height + (this.track.height + this.track.y);
        this.thumb.y = ((-var2 + var3) * this.verticalPositionQ16 >> 16) + var2;
        if (guard != -1840) {
          this.track = (InteractiveWidget) null;
        }
    }

    final void layoutChildren(boolean guard) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.leftButton != null) {
          this.leftButton.y = -this.leftButton.height + this.height >> 1;
          this.leftButton.x = 0;
          this.track.x = this.leftButton.width + this.leftButton.x;
        } else {
          this.track.x = 0;
        }
        if (null == this.rightButton) {
          this.track.width = this.width - this.track.x;
        } else {
          this.rightButton.x = this.width - this.rightButton.width;
          this.rightButton.y = this.height - this.rightButton.height >> 1;
          this.track.width = this.width + (-this.track.x - this.rightButton.width);
        }
        this.positionHorizontalThumb((byte) 125);
        if (this.upButton != null) {
          this.upButton.y = 0;
          this.upButton.x = -this.upButton.width + this.width >> 1;
          this.track.y = this.upButton.height + this.upButton.y;
        } else {
          this.track.y = 0;
        }
        if (this.downButton == null) {
          this.track.height = -this.track.y + this.height;
        } else {
          this.downButton.y = -this.downButton.height + this.height;
          this.downButton.x = -this.downButton.width + this.width >> 1;
          this.track.height = -this.downButton.height + (-this.track.y + this.height);
        }
        this.positionVerticalThumb(-1840);
        if (!this.verticalEnabled) {
          this.thumb.y = 0;
          this.thumb.height = this.track.height;
        }
        if (!this.horizontalEnabled) {
          this.thumb.x = 0;
          this.thumb.width = this.track.width;
        }
        this.thumb.refreshLayout(guard);
    }

    final void setVerticalExtent(int guard, int contentHeight, int viewportHeight) {
        int var4 = 0;
        if (viewportHeight < contentHeight) {
          var4 = viewportHeight * this.track.height / contentHeight;
          if (var4 < this.minThumbHeight) {
            var4 = this.minThumbHeight;
          }
          this.thumb.setBounds(-95, this.thumb.x, this.thumb.y, var4, this.thumb.width);
          this.setVerticalControlsEnabled(8206, true);
        } else {
          this.thumb.setBounds(-49, this.thumb.x, this.thumb.y, this.track.height, this.thumb.width);
          this.setVerticalControlsEnabled(8206, false);
        }
        this.positionVerticalThumb(-1840);
        if (guard < 2) {
          this.positionHorizontalThumb((byte) 53);
        }
    }

    ScrollControl(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetRenderer param5, WidgetRenderer param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        DraggableWidget dupTemp$0 = null;
        InteractiveWidget dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.horizontalStepQ16 = 1024;
        this.minThumbHeight = 0;
        this.field_O = 8192;
        this.minThumbWidth = 0;
        this.field_B = true;
        this.verticalStepQ16 = 1024;
        this.verticalPositionQ16 = 32768;
        this.field_C = 8192;
        this.horizontalPositionQ16 = 32768;
        try {
          this.children = new UiWidget[6];
          dupTemp$0 = new DraggableWidget(param0, param1, param7, param8, (WidgetRenderer) null, (WidgetListener) null, new InteractiveWidget(0, 0, param7, param8, param6, (WidgetListener) null), false, false);
          this.thumb = dupTemp$0;
          this.children[0] = (UiWidget) ((Object) dupTemp$0);
          dupTemp$1 = new InteractiveWidget(param0, param1, param7, param8, param5, (WidgetListener) null);
          this.track = dupTemp$1;
          this.children[1] = (UiWidget) ((Object) dupTemp$1);
          this.minThumbWidth = param9;
          this.minThumbHeight = param10;
          stackIn_4_1 = (param12);
          this.verticalEnabled = stackIn_4_1;
          stackIn_7_1 = (param11);
          this.horizontalEnabled = stackIn_7_1;
          this.setHorizontalPosition(param13, (byte) 7);
          this.setVerticalPosition(0, param14);
          this.setBounds(96, param0, param1, param3, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("vo.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    private final int verticalThumbFraction(int guard) {
        int var2 = 57 % ((guard + 47) / 43);
        return (this.thumb.height << 16) / this.track.height;
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.onKey(root, character, (byte) 27, keyCode)) {
            return true;
          }
          if (this.field_B &&
            this.thumb.hasFocus(-1)) {
            if (keyCode == 98) {
              this.setVerticalPositionAndNotify(this.verticalPositionQ16 - this.verticalStepQ16, (byte) -125);
              return true;
            }
            if (keyCode == 99) {
              this.setVerticalPositionAndNotify(this.verticalStepQ16 + this.verticalPositionQ16, (byte) -125);
              return true;
            }
            if (keyCode == 96) {
              this.setHorizontalPositionAndNotify((byte) -124, -this.horizontalStepQ16 + this.horizontalPositionQ16);
              return true;
            }
            if (keyCode == 97) {
              this.setHorizontalPositionAndNotify((byte) -122, this.horizontalPositionQ16 + this.horizontalStepQ16);
              return true;
            }
            if (keyCode == 104) {
              this.setVerticalPositionAndNotify(this.verticalPositionQ16 - this.verticalThumbFraction(123), (byte) -125);
              return true;
            }
            if (keyCode == 105) {
              this.setVerticalPositionAndNotify(this.verticalPositionQ16 + this.verticalThumbFraction(-111), (byte) -125);
              return true;
            }
            if (keyCode == 102) {
              if (this.verticalEnabled &&
                AudioOutputBootstrap.field_b[82]) {
                this.setVerticalPositionAndNotify(0, (byte) -125);
                return true;
              }
              if (this.horizontalEnabled) {
                this.setHorizontalPositionAndNotify((byte) 123, 0);
                return true;
              }
            } else {
              if (103 == keyCode) {
                if (this.verticalEnabled &&
                  AudioOutputBootstrap.field_b[82]) {
                  this.setVerticalPositionAndNotify(65536, (byte) -125);
                  return true;
                }
                if (this.horizontalEnabled) {
                  this.setHorizontalPositionAndNotify((byte) 123, 65536);
                  return true;
                }
              }
            }
          }
          if (guard <= 9) {
            this.setHorizontalControlsEnabled(true, 89);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_50_0 = var5;
          stackIn_50_1 = new StringBuilder().append("vo.KA(");
          if (root == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    static {
        field_I = -1;
    }
}
