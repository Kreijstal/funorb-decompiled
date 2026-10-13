/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollControlWidget extends ArrayWidgetContainer implements WidgetActivationListener {
    private InteractiveWidget leftButton;
    private InteractiveWidget track;
    private InteractiveWidget upButton;
    static String field_bb;
    private boolean verticalEnabled;
    private boolean adjustmentEnabled;
    private int horizontalStep;
    int horizontalPosition;
    int verticalStep;
    private int minimumThumbHeight;
    int verticalPosition;
    static String field_J;
    private int minimumThumbWidth;
    private int horizontalPageStep;
    private DraggableWidgetContainer thumb;
    private boolean horizontalEnabled;
    private InteractiveWidget downButton;
    private int verticalPageStep;
    private InteractiveWidget rightButton;

    private final void setVerticalOverflow(byte obfuscationGuard, boolean overflow) {
        InteractiveWidget stackIn_8_0 = null;
        InteractiveWidget stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        InteractiveWidget stackIn_19_0 = null;
        boolean stackIn_22_1 = false;
        InteractiveWidget stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        InteractiveWidget stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        InteractiveWidget stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        InteractiveWidget stackIn_47_0 = null;
        boolean stackIn_49_1 = false;
        InteractiveWidget stackIn_56_0 = null;
        boolean stackIn_57_1 = false;
        InteractiveWidget stackIn_62_0 = null;
        boolean stackIn_63_1 = false;
        InteractiveWidget stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        InteractiveWidget stackIn_77_0 = null;
        boolean stackIn_79_1 = false;
        InteractiveWidget stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        InteractiveWidget stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        InteractiveWidget stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        stackIn_47_0 = this.track;
        if (overflow) {
          stackIn_49_1 = true;
        } else {
          if (this.horizontalEnabled) {
            stackIn_47_0.enabled = true;
            if (this.thumb.child instanceof InteractiveWidget) {
              stackIn_19_0 = (InteractiveWidget) (this.thumb.child);
              if (overflow) {
                stackIn_19_0.enabled = true;
                if (this.upButton != null) {
                  stackIn_8_0 = this.upButton;
                  stackIn_8_0.enabled = true;
                }
                if (obfuscationGuard <= 123) {
                  return;
                }
                if (this.downButton != null) {
                  stackIn_14_0 = this.downButton;
                  stackIn_15_1 = (!overflow) ? false : true;
                  stackIn_14_0.enabled = stackIn_15_1;
                }
                return;
              }
              stackIn_22_1 = (!this.horizontalEnabled) ? false : true;
              stackIn_19_0.enabled = stackIn_22_1;
            }
            if (this.upButton == null) {
              if (obfuscationGuard <= 123) {
                return;
              }
              if (this.downButton != null) {
                stackIn_29_0 = this.downButton;
                stackIn_30_1 = (!overflow) ? false : true;
                stackIn_29_0.enabled = stackIn_30_1;
              }
              return;
            }
            stackIn_36_0 = this.upButton;
            stackIn_37_1 = (!overflow) ? false : true;
            stackIn_36_0.enabled = stackIn_37_1;
            if (obfuscationGuard <= 123) {
              return;
            }
            if (this.downButton != null) {
              stackIn_42_0 = this.downButton;
              stackIn_43_1 = (!overflow) ? false : true;
              stackIn_42_0.enabled = stackIn_43_1;
            }
            return;
          }
          stackIn_49_1 = false;
        }
        stackIn_47_0.enabled = stackIn_49_1;
        if (this.thumb.child instanceof InteractiveWidget) {
          stackIn_77_0 = (InteractiveWidget) (this.thumb.child);
          if (overflow) {
            stackIn_79_1 = true;
          } else {
            if (this.horizontalEnabled) {
              stackIn_77_0.enabled = true;
              if (this.upButton == null) {
                if (obfuscationGuard <= 123) {
                  return;
                }
                if (this.downButton != null) {
                  stackIn_72_0 = this.downButton;
                  stackIn_73_1 = (!overflow) ? false : true;
                  stackIn_72_0.enabled = stackIn_73_1;
                }
                return;
              }
              stackIn_56_0 = this.upButton;
              stackIn_57_1 = (!overflow) ? false : true;
              stackIn_56_0.enabled = stackIn_57_1;
              if (obfuscationGuard <= 123) {
                return;
              }
              if (this.downButton != null) {
                stackIn_62_0 = this.downButton;
                stackIn_63_1 = (!overflow) ? false : true;
                stackIn_62_0.enabled = stackIn_63_1;
              }
              return;
            }
            stackIn_79_1 = false;
          }
          stackIn_77_0.enabled = stackIn_79_1;
        }
        if (this.upButton == null) {
          if (obfuscationGuard <= 123) {
            return;
          }
          if (this.downButton != null) {
            stackIn_99_0 = this.downButton;
            stackIn_100_1 = (!overflow) ? false : true;
            stackIn_99_0.enabled = stackIn_100_1;
          }
          return;
        }
        stackIn_83_0 = this.upButton;
        stackIn_84_1 = (!overflow) ? false : true;
        stackIn_83_0.enabled = stackIn_84_1;
        if (obfuscationGuard <= 123) {
          return;
        }
        if (this.downButton != null) {
          stackIn_89_0 = this.downButton;
          stackIn_90_1 = (!overflow) ? false : true;
          stackIn_89_0.enabled = stackIn_90_1;
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard ^ 0)) {
            return true;
          }
          if (this.adjustmentEnabled &&
            this.thumb.isFocused(false)) {
            if (98 == keyCode) {
              this.adjustVerticalPosition(this.verticalPosition - this.verticalStep, 0);
              return true;
            }
            if (keyCode == 99) {
              this.adjustVerticalPosition(this.verticalStep + this.verticalPosition, 0);
              return true;
            }
            if (96 == keyCode) {
              this.adjustHorizontalPosition(this.horizontalPosition - this.horizontalStep, (byte) 125);
              return true;
            }
            if (keyCode == 97) {
              this.adjustHorizontalPosition(this.horizontalPosition + this.horizontalStep, (byte) 111);
              return true;
            }
            if (keyCode == 104) {
              this.adjustVerticalPosition(this.verticalPosition - this.getVerticalPageFraction(true), 0);
              return true;
            }
            if (keyCode == 105) {
              this.adjustVerticalPosition(this.verticalPosition + this.getVerticalPageFraction(true), 0);
              return true;
            }
            if (keyCode == 102) {
              if (this.verticalEnabled &&
                br.heldKeys[82]) {
                this.adjustVerticalPosition(0, obfuscationGuard ^ -12215);
                return true;
              }
              if (this.horizontalEnabled) {
                this.adjustHorizontalPosition(0, (byte) 48);
                return true;
              }
            } else {
              if (keyCode == 103) {
                if (this.verticalEnabled &&
                  br.heldKeys[82]) {
                  this.adjustVerticalPosition(65536, obfuscationGuard + 12215);
                  return true;
                }
                if (this.horizontalEnabled) {
                  this.adjustHorizontalPosition(65536, (byte) 117);
                  return true;
                }
              }
            }
          }
          if (obfuscationGuard == -12215) {
            return false;
          }
          field_bb = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_49_0 = var5;
          stackIn_49_1 = new StringBuilder().append("nv.F(");
          if (rootWidget == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ScrollControlWidget(int x, int y, int width, int height, WidgetPainter painter, WidgetPainter trackPainter, WidgetPainter thumbPainter, int thumbWidth, int thumbHeight, int minimumThumbWidth, int minimumThumbHeight, boolean horizontalEnabled, boolean verticalEnabled, int horizontalPosition, int verticalPosition) {
        super(x, y, width, height, painter);
        DraggableWidgetContainer dupTemp$0 = null;
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
        this.adjustmentEnabled = true;
        this.horizontalStep = 1024;
        this.minimumThumbHeight = 0;
        this.verticalStep = 1024;
        this.horizontalPosition = 32768;
        this.verticalPosition = 32768;
        this.minimumThumbWidth = 0;
        this.verticalPageStep = 8192;
        this.horizontalPageStep = 8192;
        try {
          this.children = new Widget[6];
          dupTemp$0 = new DraggableWidgetContainer(x, y, thumbWidth, thumbHeight, (WidgetPainter) null, (WidgetListener) null, new InteractiveWidget(0, 0, thumbWidth, thumbHeight, thumbPainter, (WidgetListener) null), false, false);
          this.thumb = dupTemp$0;
          this.children[0] = (Widget) ((Object) dupTemp$0);
          dupTemp$1 = new InteractiveWidget(x, y, thumbWidth, thumbHeight, trackPainter, (WidgetListener) null);
          this.track = dupTemp$1;
          this.children[1] = (Widget) ((Object) dupTemp$1);
          stackIn_4_1 = (verticalEnabled);
          this.verticalEnabled = stackIn_4_1;
          this.minimumThumbWidth = minimumThumbWidth;
          this.minimumThumbHeight = minimumThumbHeight;
          stackIn_7_1 = (horizontalEnabled);
          this.horizontalEnabled = stackIn_7_1;
          this.setHorizontalPosition(-86, horizontalPosition);
          this.setVerticalPosition((byte) -123, verticalPosition);
          this.setBounds(x, width, y, 8192, height);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("nv.<init>(").append(x).append(',').append(y).append(',').append(width).append(',').append(height).append(',');
          if (painter == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (trackPainter == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (thumbPainter == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(thumbWidth).append(',').append(thumbHeight).append(',').append(minimumThumbWidth).append(',').append(minimumThumbHeight).append(',').append(horizontalEnabled).append(',').append(verticalEnabled).append(',').append(horizontalPosition).append(',').append(verticalPosition).append(')').toString());
        }
    }

    private final void positionThumbY(int obfuscationGuard) {
        int maximumThumbY = 0;
        int minimumThumbY = this.upButton == null ? this.track.y : this.upButton.y + this.upButton.height;
        if (obfuscationGuard == 16695) {
          maximumThumbY = this.downButton != null ? -this.thumb.height + this.downButton.y : -this.thumb.height + this.track.y + this.track.height;
          this.thumb.y = minimumThumbY + ((-minimumThumbY + maximumThumbY) * this.verticalPosition >> 16);
          return;
        }
    }

    final boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        DraggableWidgetContainer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 11) {
            return false;
          }
          var3 = this.thumb;
          if (var3 != null &&
            ((Widget) ((Object) var3)).takeFocus(obfuscationGuard ^ 0, rootWidget)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("nv.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void setVerticalPosition(byte obfuscationGuard, int position) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (position < 0) {
          this.verticalPosition = 0;
          if (obfuscationGuard != -123) {
            this.verticalPageStep = -68;
            this.positionThumbY(16695);
            return;
          }
          this.positionThumbY(16695);
          return;
        }
        if (position > 65536) {
          this.verticalPosition = 65536;
          if (obfuscationGuard != -123) {
            this.verticalPageStep = -68;
            this.positionThumbY(16695);
            return;
          }
          this.positionThumbY(16695);
          return;
        }
        this.verticalPosition = position;
        if (obfuscationGuard == -123) {
          this.positionThumbY(16695);
          return;
        }
        this.verticalPageStep = -68;
        this.positionThumbY(16695);
    }

    final static boolean c(int param0, int param1) {
        if (param0 != 0) {
          ScrollControlWidget.l(106);
          if (!(param1 < bw.unitDefinitions.length)) {
            return false;
          }
          return 3 == bw.unitDefinitions[param1][0] ? true : false;
        }
        if (!(param1 < bw.unitDefinitions.length)) {
          return false;
        }
        return 3 == bw.unitDefinitions[param1][0] ? true : false;
    }

    private final void setHorizontalPosition(int obfuscationGuard, int position) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = 123 % ((obfuscationGuard - 2) / 56);
        if (position < 0) {
          this.horizontalPosition = 0;
          this.positionThumbX(1681504464);
          return;
        }
        if (position > 65536) {
          this.horizontalPosition = 65536;
          this.positionThumbX(1681504464);
          return;
        }
        this.horizontalPosition = position;
        this.positionThumbX(1681504464);
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          if ((!(this.thumb.child instanceof InteractiveWidget) ||
            ((InteractiveWidget) (this.thumb.child)).enabled) && this.thumb.pressedButton == 1) {
            if (this.horizontalEnabled) {
              var5_int = this.horizontalPosition;
              this.readThumbX(115);
              if (this.horizontalPosition != var5_int &&
                this.listener instanceof ScrollControlListener) {
                ((ScrollControlListener) (this.listener)).scrollDragged(this.horizontalPosition, this.horizontalPosition, (byte) -39, this);
              }
            } else {
              this.positionThumbX(1681504464);
            }
            if (this.verticalEnabled) {
              var5_intLifetime2 = this.verticalPosition;
              this.readThumbY(0);
              if (this.verticalPosition != var5_intLifetime2 &&
                this.listener instanceof ScrollControlListener) {
                ((ScrollControlListener) (this.listener)).scrollDragged(this.horizontalPosition, this.verticalPosition, (byte) -39, this);
              }
            } else {
              this.positionThumbY(16695);
            }
          }
          if (this.track.enabled &&
            this.track.lastActivationButton == 1) {
            if (this.verticalEnabled) {
              if (this.horizontalEnabled) {
                var5_intLifetime1 = -this.x - originX + (AiPlanningStrategy.pointerX - (this.thumb.x + (this.thumb.width >> 1)));
                var6 = -originY + ko.pointerY - (this.y + this.thumb.y + (this.thumb.height >> 1));
                if (Math.abs(var6) > Math.abs(var5_intLifetime1)) {
                  if (0 < var6) {
                    this.adjustVerticalPosition(this.verticalPageStep + this.verticalPosition, obfuscationGuard ^ 32722);
                  } else {
                    this.adjustVerticalPosition(-this.verticalPageStep + this.verticalPosition, 0);
                  }
                } else {
                  if (var5_intLifetime1 <= 0) {
                    this.adjustHorizontalPosition(this.horizontalPosition - this.horizontalPageStep, (byte) 117);
                  } else {
                    this.adjustHorizontalPosition(this.horizontalPosition + this.horizontalPageStep, (byte) 101);
                  }
                }
              } else {
                if ((this.thumb.height >> 1) + (originY + this.thumb.y) >= ko.pointerY) {
                  this.adjustVerticalPosition(-this.verticalPageStep + this.verticalPosition, obfuscationGuard ^ 32722);
                } else {
                  this.adjustVerticalPosition(this.verticalPageStep + this.verticalPosition, 0);
                }
              }
            } else {
              if (this.horizontalEnabled) {
                if (originX + (this.thumb.x + (this.thumb.width >> 1)) >= AiPlanningStrategy.pointerX) {
                  this.adjustHorizontalPosition(this.horizontalPosition - this.horizontalPageStep, (byte) 84);
                } else {
                  this.adjustHorizontalPosition(this.horizontalPosition + this.horizontalPageStep, (byte) 110);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_41_0 = var5;
          stackIn_41_1 = new StringBuilder().append("nv.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    private final void setHorizontalOverflow(byte obfuscationGuard, boolean overflow) {
        InteractiveWidget stackIn_8_0 = null;
        InteractiveWidget stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        InteractiveWidget stackIn_18_0 = null;
        boolean stackIn_21_1 = false;
        InteractiveWidget stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        InteractiveWidget stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        InteractiveWidget stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        InteractiveWidget stackIn_45_0 = null;
        boolean stackIn_47_1 = false;
        InteractiveWidget stackIn_54_0 = null;
        boolean stackIn_55_1 = false;
        InteractiveWidget stackIn_59_0 = null;
        boolean stackIn_60_1 = false;
        InteractiveWidget stackIn_68_0 = null;
        boolean stackIn_69_1 = false;
        InteractiveWidget stackIn_74_0 = null;
        boolean stackIn_76_1 = false;
        InteractiveWidget stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        InteractiveWidget stackIn_85_0 = null;
        boolean stackIn_86_1 = false;
        InteractiveWidget stackIn_95_0 = null;
        boolean stackIn_96_1 = false;
        stackIn_45_0 = this.track;
        if (overflow) {
          stackIn_47_1 = true;
        } else {
          if (this.verticalEnabled) {
            stackIn_45_0.enabled = true;
            if (this.thumb.child instanceof InteractiveWidget) {
              stackIn_18_0 = (InteractiveWidget) (this.thumb.child);
              if (overflow) {
                stackIn_18_0.enabled = true;
                if (null != this.leftButton) {
                  stackIn_8_0 = this.leftButton;
                  stackIn_8_0.enabled = true;
                }
                if (this.rightButton != null) {
                  stackIn_13_0 = this.rightButton;
                  stackIn_14_1 = (!overflow) ? false : true;
                  stackIn_13_0.enabled = stackIn_14_1;
                }
                if (obfuscationGuard != 11) {
                  this.horizontalStep = 42;
                }
                return;
              }
              stackIn_21_1 = (!this.verticalEnabled) ? false : true;
              stackIn_18_0.enabled = stackIn_21_1;
            }
            if (null == this.leftButton) {
              if (this.rightButton != null) {
                stackIn_27_0 = this.rightButton;
                stackIn_28_1 = (!overflow) ? false : true;
                stackIn_27_0.enabled = stackIn_28_1;
              }
              if (obfuscationGuard != 11) {
                this.horizontalStep = 42;
              }
              return;
            }
            stackIn_34_0 = this.leftButton;
            stackIn_35_1 = (!overflow) ? false : true;
            stackIn_34_0.enabled = stackIn_35_1;
            if (this.rightButton != null) {
              stackIn_39_0 = this.rightButton;
              stackIn_40_1 = (!overflow) ? false : true;
              stackIn_39_0.enabled = stackIn_40_1;
            }
            if (obfuscationGuard == 11) {
              return;
            }
            this.horizontalStep = 42;
            return;
          }
          stackIn_47_1 = false;
        }
        stackIn_45_0.enabled = stackIn_47_1;
        boolean decompiledFrameRemainder0 = true;
        if (this.thumb.child instanceof InteractiveWidget) {
          stackIn_74_0 = (InteractiveWidget) (this.thumb.child);
          if (overflow) {
            stackIn_76_1 = true;
          } else {
            if (this.verticalEnabled) {
              stackIn_74_0.enabled = true;
              if (null == this.leftButton) {
                if (this.rightButton != null) {
                  stackIn_68_0 = this.rightButton;
                  stackIn_69_1 = (!overflow) ? false : true;
                  stackIn_68_0.enabled = stackIn_69_1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_54_0 = this.leftButton;
                stackIn_55_1 = (!overflow) ? false : true;
                stackIn_54_0.enabled = stackIn_55_1;
                if (this.rightButton != null) {
                  stackIn_59_0 = this.rightButton;
                  stackIn_60_1 = (!overflow) ? false : true;
                  stackIn_59_0.enabled = stackIn_60_1;
                }
                if (obfuscationGuard != 11) {
                  this.horizontalStep = 42;
                }
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_76_1 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_74_0.enabled = stackIn_76_1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (null == this.leftButton) {
            if (this.rightButton != null) {
              stackIn_95_0 = this.rightButton;
              stackIn_96_1 = (!overflow) ? false : true;
              stackIn_95_0.enabled = stackIn_96_1;
            }
          } else {
            stackIn_80_0 = this.leftButton;
            stackIn_81_1 = (!overflow) ? false : true;
            stackIn_80_0.enabled = stackIn_81_1;
            if (this.rightButton != null) {
              stackIn_85_0 = this.rightButton;
              stackIn_86_1 = (!overflow) ? false : true;
              stackIn_85_0.enabled = stackIn_86_1;
            }
          }
        }
        if (obfuscationGuard == 11) {
          return;
        }
        this.horizontalStep = 42;
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (button == 1 &&
            this.adjustmentEnabled) {
            if (this.verticalEnabled &&
              widget == this.upButton) {
              this.adjustVerticalPosition(this.verticalPosition - this.verticalStep, 0);
            } else {
              if (this.verticalEnabled &&
                this.downButton == widget) {
                this.adjustVerticalPosition(this.verticalPosition + this.verticalStep, 0);
              } else {
                if (this.horizontalEnabled &&
                  this.leftButton == widget) {
                  this.adjustHorizontalPosition(-this.horizontalStep + this.horizontalPosition, (byte) 121);
                } else {
                  if (this.horizontalEnabled &&
                    this.rightButton == widget) {
                    this.adjustHorizontalPosition(this.horizontalPosition + this.horizontalStep, (byte) 118);
                  }
                }
              }
            }
          }
          if (obfuscationGuard != 11) {
            field_bb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("nv.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void l(int param0) {
        if (param0 != -24061) {
          ScrollControlWidget.l(-117);
          field_bb = null;
          field_J = null;
          return;
        }
        field_bb = null;
        field_J = null;
    }

    private final void adjustVerticalPosition(int position, int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          field_J = (String) null;
          this.setVerticalPosition((byte) -123, position);
          if (this.listener instanceof ScrollControlListener) {
            ((ScrollControlListener) (this.listener)).scrollAdjusted((byte) -112, this, this.verticalPosition, this.verticalPosition);
            return;
          }
          return;
        }
        this.setVerticalPosition((byte) -123, position);
        if (!(this.listener instanceof ScrollControlListener)) {
          return;
        }
        ((ScrollControlListener) (this.listener)).scrollAdjusted((byte) -112, this, this.verticalPosition, this.verticalPosition);
    }

    private final void adjustHorizontalPosition(int position, byte obfuscationGuard) {
        if (obfuscationGuard >= 47) {
          this.setHorizontalPosition(-114, position);
          if (this.listener instanceof ScrollControlListener) {
            ((ScrollControlListener) (this.listener)).scrollAdjusted((byte) -109, this, this.verticalPosition, this.horizontalPosition);
          }
          return;
        }
        this.track = (InteractiveWidget) null;
        this.setHorizontalPosition(-114, position);
        if (this.listener instanceof ScrollControlListener) {
          ((ScrollControlListener) (this.listener)).scrollAdjusted((byte) -109, this, this.verticalPosition, this.horizontalPosition);
        }
    }

    private final int getVerticalPageFraction(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return -2;
        }
        return (this.thumb.height << 16) / this.track.height;
    }

    final void sizeHorizontalThumb(int contentWidth, byte obfuscationGuard, int viewportWidth) {
        int thumbWidth = 0;
        if (contentWidth <= viewportWidth) {
          this.thumb.setBounds(this.thumb.x, this.track.width, this.thumb.y, 8192, this.thumb.height);
          this.setHorizontalOverflow((byte) 11, false);
        } else {
          thumbWidth = this.track.width * viewportWidth / contentWidth;
          if (thumbWidth < this.minimumThumbWidth) {
            thumbWidth = this.minimumThumbWidth;
          }
          this.thumb.setBounds(this.thumb.x, thumbWidth, this.thumb.y, 8192, this.thumb.height);
          this.setHorizontalOverflow((byte) 11, true);
        }
        if (obfuscationGuard == 124) {
          this.positionThumbX(1681504464);
          return;
        }
    }

    private final void readThumbX(int obfuscationGuard) {
        int minimumThumbX = null == this.leftButton ? this.track.x : this.leftButton.width + this.leftButton.x;
        int maximumThumbX = null == this.rightButton ? -this.thumb.width + (this.track.width + this.track.x) : -this.thumb.width + this.rightButton.x;
        if (obfuscationGuard >= 96) {
          this.setHorizontalPosition(116, maximumThumbX > minimumThumbX ? (-minimumThumbX + this.thumb.x << 16) / (-minimumThumbX + maximumThumbX) : 0);
          return;
        }
    }

    final void sizeVerticalThumb(int viewportHeight, int obfuscationGuard, int contentHeight) {
        int thumbHeight = 0;
        if (contentHeight <= viewportHeight) {
          this.thumb.setBounds(this.thumb.x, this.thumb.width, this.thumb.y, 8192, this.track.height);
          this.setVerticalOverflow((byte) 124, false);
        } else {
          thumbHeight = viewportHeight * this.track.height / contentHeight;
          if (this.minimumThumbHeight > thumbHeight) {
            thumbHeight = this.minimumThumbHeight;
          }
          this.thumb.setBounds(this.thumb.x, this.thumb.width, this.thumb.y, 8192, thumbHeight);
          this.setVerticalOverflow((byte) 127, true);
        }
        if (obfuscationGuard == -13127) {
          this.positionThumbY(16695);
          return;
        }
    }

    private final void readThumbY(int obfuscationGuard) {
        int maximumThumbY = 0;
        int minimumThumbY = null != this.upButton ? this.upButton.y + this.upButton.height : this.track.y;
        if (obfuscationGuard == 0) {
          maximumThumbY = this.downButton != null ? -this.thumb.height + this.downButton.y : this.track.y - (-this.track.height + this.thumb.height);
          this.setVerticalPosition((byte) -123, minimumThumbY >= maximumThumbY ? 0 : (-minimumThumbY + this.thumb.y << 16) / (-minimumThumbY + maximumThumbY));
          return;
        }
    }

    final void layoutChildren(byte obfuscationGuard) {
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard < 84) {
          return;
        }
        if (this.leftButton == null) {
          this.track.x = 0;
        } else {
          this.leftButton.x = 0;
          this.leftButton.y = this.height - this.leftButton.height >> 1;
          this.track.x = this.leftButton.width + this.leftButton.x;
        }
        if (null == this.rightButton) {
          this.track.width = -this.track.x + this.width;
          this.positionThumbX(1681504464);
          if (null == this.upButton) {
            this.track.y = 0;
          } else {
            this.upButton.y = 0;
            this.upButton.x = this.width - this.upButton.width >> 1;
            this.track.y = this.upButton.y + this.upButton.height;
          }
          if (this.downButton == null) {
            this.track.height = this.height - this.track.y;
          } else {
            this.downButton.x = this.width - this.downButton.width >> 1;
            this.downButton.y = this.height - this.downButton.height;
            this.track.height = -this.downButton.height - this.track.y + this.height;
          }
          this.positionThumbY(16695);
          if (!this.verticalEnabled) {
            this.thumb.height = this.track.height;
            this.thumb.y = 0;
          }
          if (!this.horizontalEnabled) {
            this.thumb.x = 0;
            this.thumb.width = this.track.width;
          }
          this.thumb.refreshLayout(0);
          return;
        }
        this.rightButton.x = -this.rightButton.width + this.width;
        this.rightButton.y = -this.rightButton.height + this.height >> 1;
        this.track.width = -this.track.x + (this.width - this.rightButton.width);
        this.positionThumbX(1681504464);
        if (null != this.upButton) {
          this.upButton.y = 0;
          this.upButton.x = this.width - this.upButton.width >> 1;
          this.track.y = this.upButton.y + this.upButton.height;
          if (this.downButton == null) {
            this.track.height = this.height - this.track.y;
          } else {
            this.downButton.x = this.width - this.downButton.width >> 1;
            this.downButton.y = this.height - this.downButton.height;
            this.track.height = -this.downButton.height - this.track.y + this.height;
          }
          this.positionThumbY(16695);
          if (!this.verticalEnabled) {
            this.thumb.height = this.track.height;
            this.thumb.y = 0;
          }
          if (!this.horizontalEnabled) {
            this.thumb.x = 0;
            this.thumb.width = this.track.width;
          }
          this.thumb.refreshLayout(0);
          return;
        }
        this.track.y = 0;
        if (this.downButton == null) {
          this.track.height = this.height - this.track.y;
        } else {
          this.downButton.x = this.width - this.downButton.width >> 1;
          this.downButton.y = this.height - this.downButton.height;
          this.track.height = -this.downButton.height - this.track.y + this.height;
        }
        this.positionThumbY(16695);
        if (!this.verticalEnabled) {
          this.thumb.height = this.track.height;
          this.thumb.y = 0;
        }
        if (!this.horizontalEnabled) {
          this.thumb.x = 0;
          this.thumb.width = this.track.width;
        }
        this.thumb.refreshLayout(0);
    }

    private final void positionThumbX(int obfuscationGuard) {
        int minimumThumbX = 0;
        int maximumThumbX = 0;
        int guardMinimumThumbX;
        int guardMaximumThumbX;
        if (obfuscationGuard == 1681504464) {
          minimumThumbX = null == this.leftButton ? this.track.x : this.leftButton.x + this.leftButton.width;
          maximumThumbX = null != this.rightButton ? -this.thumb.width + this.rightButton.x : this.track.width + this.track.x - this.thumb.width;
          this.thumb.x = minimumThumbX + ((-minimumThumbX + maximumThumbX) * this.horizontalPosition >> 16);
          return;
        }
        this.track = (InteractiveWidget) null;
        guardMinimumThumbX = null == this.leftButton ? this.track.x : this.leftButton.x + this.leftButton.width;
        guardMaximumThumbX = null != this.rightButton ? -this.thumb.width + this.rightButton.x : this.track.width + this.track.x - this.thumb.width;
        this.thumb.x = guardMinimumThumbX + ((-guardMinimumThumbX + guardMaximumThumbX) * this.horizontalPosition >> 16);
    }

    static {
        field_J = "Melee weapons are useful in close combat.";
        field_bb = "AnimateStatic";
    }
}
