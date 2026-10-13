/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteScrollBar {
    private int y;
    private int repeatCountdown;
    private int unitStep;
    private RgbSprite[] arrowSprites;
    private int orientation;
    private int contentExtent;
    private int length;
    private int x;
    private boolean interactive;
    private boolean changed;
    static wm nameCheckResultConsumed;
    private int visibleExtent;
    private int scrollOffset;
    private boolean decrementHovered;
    private boolean enabled;
    static String[] field_h;
    private int[] colours;
    private boolean incrementHovered;
    private int thickness;

    final static void a(int param0, int param1, byte param2, Unit param3) {
        if (param2 != -97) {
          return;
        }
        try {
          param0 -= 16;
          AttackEvent.field_E.drawHalfSize(param0 + 48, 12 + param1);
          km.field_h[0].drawHalfSize(46 + param0, param1 + 10);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nb.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void updatePointer(int pointerX, int pointerY, int obfuscationGuard) {
        this.incrementHovered = false;
        this.decrementHovered = false;
        if (!this.enabled) {
          return;
        }
        if (this.interactive) {
          this.incrementHovered = this.containsArrow(0, pointerX, pointerY, obfuscationGuard);
          this.decrementHovered = this.containsArrow(1, pointerX, pointerY, 0);
          return;
        }
    }

    private final void drawTrack(int obfuscationGuard) {
        int var2 = 0;
        int var3 = 0;
        if (this.orientation == 0) {
          var2 = this.length;
          var3 = this.arrowSprites[0].canvasHeight;
          SoftwareRaster.b(this.x, this.y, var2, var3, this.colours[0]);
          if (obfuscationGuard != 1043) {
            this.drawTrack(61);
            return;
          }
          return;
        }
        if (this.orientation == 1) {
          var3 = this.length;
          var2 = this.arrowSprites[0].canvasWidth;
        }
        SoftwareRaster.b(this.x, this.y, var2, var3, this.colours[0]);
        if (obfuscationGuard == 1043) {
          return;
        }
        this.drawTrack(61);
    }

    final static int c(byte param0) {
        if (param0 < 93) {
          Unit var2 = (Unit) null;
          SpriteScrollBar.a(-81, 18, (byte) -44, (Unit) null);
          return DropTargetWidgetContainer.field_K;
        }
        return DropTargetWidgetContainer.field_K;
    }

    final boolean containsPointer(int pointerX, int obfuscationGuard, int pointerY) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime3;
        int var5Lifetime3;
        if (obfuscationGuard != -2) {
          this.updatePointer(-86, 56, -106);
          if (this.orientation == 0) {
            var4 = this.length;
            var5 = this.thickness;
            return ChatMessage.a(pointerY, this.x, this.y, pointerX, var4, (byte) -107, var5);
          }
          if (this.orientation != 1) {
            return false;
          }
          var4Lifetime3 = this.thickness;
          var5Lifetime3 = this.length;
          return ChatMessage.a(pointerY, this.x, this.y, pointerX, var4Lifetime3, (byte) -107, var5Lifetime3);
        }
        if (this.orientation == 0) {
          var4Lifetime1 = this.length;
          var5Lifetime1 = this.thickness;
          return ChatMessage.a(pointerY, this.x, this.y, pointerX, var4Lifetime1, (byte) -107, var5Lifetime1);
        }
        if (this.orientation != 1) {
          return false;
        }
        var4Lifetime2 = this.thickness;
        var5Lifetime2 = this.length;
        return ChatMessage.a(pointerY, this.x, this.y, pointerX, var4Lifetime2, (byte) -107, var5Lifetime2);
    }

    private final boolean containsArrow(int arrowIndex, int pointerY, int pointerX, int obfuscationGuard) {
        int var5 = 0;
        int var6 = this.getArrowX(obfuscationGuard ^ 0, arrowIndex);
        int var7 = this.getArrowY(obfuscationGuard, arrowIndex);
        int var8 = this.arrowSprites[0].canvasWidth;
        int var9 = this.arrowSprites[0].canvasHeight;
        var5 = ChatMessage.a(pointerY, var6, var7, pointerX, var8, (byte) -110, var9) ? 1 : 0;
        return var5 != 0;
    }

    public static void d(byte param0) {
        field_h = null;
        int var1 = -89 / ((param0 + 18) / 38);
        nameCheckResultConsumed = null;
    }

    private final boolean advanceRepeat(boolean held, byte obfuscationGuard) {
        if (obfuscationGuard != 10) {
          this.repeatCountdown = -1;
          if (this.repeatCountdown > 0) {
            if (this.repeatCountdown <= 0) {
              this.repeatCountdown = 0;
              return false;
            }
            if (held) {
              this.repeatCountdown = this.repeatCountdown - 1;
              return false;
            }
            this.repeatCountdown = 0;
            return false;
          }
          if (held) {
            this.repeatCountdown = 5;
            return true;
          }
          if (this.repeatCountdown <= 0) {
            this.repeatCountdown = 0;
            return false;
          }
          this.repeatCountdown = 0;
          return false;
        }
        if (this.repeatCountdown > 0) {
          if (this.repeatCountdown <= 0) {
            this.repeatCountdown = 0;
            return false;
          }
          if (held) {
            this.repeatCountdown = this.repeatCountdown - 1;
            return false;
          }
          this.repeatCountdown = 0;
          return false;
        }
        if (held) {
          this.repeatCountdown = 5;
          return true;
        }
        if (this.repeatCountdown <= 0) {
          this.repeatCountdown = 0;
          return false;
        }
        this.repeatCountdown = 0;
        return false;
    }

    final void configureRange(int offset, byte obfuscationGuard, int visibleExtent, int contentExtent, int unitStep) {
        if (obfuscationGuard == 47) {
          this.scrollOffset = offset;
          this.visibleExtent = visibleExtent;
          this.contentExtent = contentExtent;
          this.unitStep = unitStep;
          return;
        }
        this.enableInteraction(43);
        this.scrollOffset = offset;
        this.visibleExtent = visibleExtent;
        this.contentExtent = contentExtent;
        this.unitStep = unitStep;
    }

    private final void enableInteraction(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return;
        }
        this.interactive = true;
    }

    private final void initializeThickness(int obfuscationGuard) {
        if (obfuscationGuard != 27150) {
          return;
        }
        this.thickness = this.arrowSprites[0].canvasWidth;
    }

    final void drawScrollBar(int obfuscationGuard) {
        this.drawTrack(obfuscationGuard ^ 1043);
        this.drawArrow((byte) -91, obfuscationGuard);
        this.drawArrow((byte) -121, 1);
        this.drawThumb(-1342059263);
    }

    final boolean hasChanged(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return false;
        }
        return this.changed;
    }

    final int getThickness(int obfuscationGuard) {
        if (obfuscationGuard != 26787) {
          this.isEnabled(true);
          return this.thickness;
        }
        return this.thickness;
    }

    private final int getArrowState(int arrowIndex, int obfuscationGuard) {
        int spriteIndex = 0;
        if (obfuscationGuard != 1) {
          this.colours = (int[]) null;
          if (arrowIndex == 0) {
            if (this.incrementHovered) {
              spriteIndex = 1;
              return spriteIndex;
            }
            return spriteIndex;
          }
          if (arrowIndex != 1) {
            return spriteIndex;
          }
          if (this.decrementHovered) {
            spriteIndex = 1;
            return spriteIndex;
          }
          return spriteIndex;
        }
        if (arrowIndex == 0) {
          if (this.incrementHovered) {
            spriteIndex = 1;
            return spriteIndex;
          }
          return spriteIndex;
        }
        if (arrowIndex != 1) {
          return spriteIndex;
        }
        if (this.decrementHovered) {
          spriteIndex = 1;
          return spriteIndex;
        }
        return spriteIndex;
    }

    final int getOffset(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return -78;
        }
        return this.scrollOffset;
    }

    private final int getArrowY(int obfuscationGuard, int arrowIndex) {
        int arrowHeight = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int arrowY = obfuscationGuard;
        if (arrowIndex != 0) {
          if (arrowIndex != 1) {
            return arrowY;
          }
          if (0 == this.orientation) {
            arrowY = this.y;
            return arrowY;
          }
          if (this.orientation != 1) {
            return arrowY;
          }
          arrowY = this.y;
          return arrowY;
        }
        if (this.orientation == 0) {
          arrowY = this.y;
          return arrowY;
        }
        if (1 == this.orientation) {
          arrowHeight = this.arrowSprites[0].canvasHeight;
          arrowY = this.y - (-this.length + arrowHeight);
          return arrowY;
        }
        return arrowY;
    }

    final void setBounds(int y, int obfuscationGuard, int x, int length) {
        this.length = length;
        this.x = x;
        this.y = y;
        if (obfuscationGuard >= -119) {
          return;
        }
    }

    final void disable(byte obfuscationGuard) {
        if (obfuscationGuard != -65) {
          this.scrollOffset = 67;
          this.enabled = false;
          return;
        }
        this.enabled = false;
    }

    private final void drawArrow(byte obfuscationGuard, int arrowIndex) {
        RgbSprite var9 = null;
        RgbSprite var11 = null;
        RgbSprite var10 = null;
        RgbSprite var12 = null;
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = this.getArrowX(0, arrowIndex);
        int var4 = this.getArrowY(0, arrowIndex);
        int var6 = -12 / ((-44 - obfuscationGuard) / 33);
        int var5 = this.getArrowState(arrowIndex, 1);
        RgbSprite var10Lifetime1;
        RgbSprite var12Lifetime1;
        RgbSprite var10Lifetime2;
        RgbSprite var12Lifetime2;
        if (arrowIndex != 0) {
          if (1 != arrowIndex) {
            return;
          }
          if (0 == this.orientation) {
            var9 = this.arrowSprites[var5];
            var10 = var9;
            var12 = var10;
            var10Lifetime2 = var9;
            var9.drawHorizontalFlip(var3, var4);
            return;
          }
          if (this.orientation == 1) {
            var10Lifetime1 = this.arrowSprites[var5];
            var12Lifetime2 = var10Lifetime1;
            var12Lifetime2 = var10Lifetime1;
            var10Lifetime1.drawVerticalFlip(var3, var4);
            return;
          }
          return;
        }
        if (this.orientation == 0) {
          var12Lifetime1 = this.arrowSprites[var5];
          var12Lifetime1.drawTransparent(var3, var4);
          return;
        }
        if (1 == this.orientation) {
          var11 = this.arrowSprites[var5];
          var11.drawTransparent(var3, var4);
          return;
        }
    }

    final int getVisibleExtent(byte obfuscationGuard) {
        if (obfuscationGuard < 62) {
          this.drawScrollBar(-97);
          return this.visibleExtent;
        }
        return this.visibleExtent;
    }

    final void updateInput(boolean pressed, int wheelDelta, int obfuscationGuard, boolean held) {
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_80_1 = false;
        boolean stackIn_83_1 = false;
        boolean stackIn_121_1 = false;
        boolean stackIn_124_1 = false;
        int var5;
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        this.changed = false;
        if (!this.enabled) {
          return;
        }
        if (!this.interactive) {
          return;
        }
        if (this.advanceRepeat(held, (byte) 10)) {
          if (this.orientation == 1 &&
            !this.incrementHovered &&
            !this.decrementHovered) {
            stackIn_13_1 = !(0 >= wheelDelta);
            this.incrementHovered = stackIn_13_1;
            stackIn_16_1 = !(wheelDelta >= 0);
            this.decrementHovered = stackIn_16_1;
          }
          if (!this.incrementHovered) {
            if (!this.decrementHovered) {
              return;
            }
            var5 = -1;
          } else {
            var5 = 1;
          }
          this.scrollOffset = this.scrollOffset + var5 * this.unitStep;
          if (obfuscationGuard != -2) {
            return;
          }
          if (this.scrollOffset < 0) {
            this.scrollOffset = 0;
          }
        } else {
          if (!pressed) {
            if (wheelDelta == 0) {
              return;
            }
            if (this.orientation == 1 &&
              !this.incrementHovered) {
              if (this.decrementHovered) {
                if (!this.incrementHovered) {
                  if (!this.decrementHovered) {
                    return;
                  }
                  var5 = -1;
                } else {
                  var5 = 1;
                }
                this.scrollOffset = this.scrollOffset + var5 * this.unitStep;
                if (obfuscationGuard != -2) {
                  return;
                }
                if (this.scrollOffset >= 0) {
                  var6 = this.visibleExtent + this.scrollOffset;
                  this.changed = true;
                  if (var6 <= this.contentExtent) {
                    return;
                  }
                  this.scrollOffset = this.contentExtent - this.visibleExtent;
                  return;
                }
                this.scrollOffset = 0;
                var6Lifetime4 = this.visibleExtent + this.scrollOffset;
                this.changed = true;
                if (var6Lifetime4 > this.contentExtent) {
                  this.scrollOffset = this.contentExtent - this.visibleExtent;
                }
                return;
              }
              stackIn_121_1 = !(0 >= wheelDelta);
              this.incrementHovered = stackIn_121_1;
              stackIn_124_1 = !(wheelDelta >= 0);
              this.decrementHovered = stackIn_124_1;
            }
            if (!this.incrementHovered) {
              if (!this.decrementHovered) {
                return;
              }
              var5 = -1;
            } else {
              var5 = 1;
            }
            this.scrollOffset = this.scrollOffset + var5 * this.unitStep;
            if (obfuscationGuard != -2) {
              return;
            }
            if (this.scrollOffset < 0) {
              this.scrollOffset = 0;
            }
            var6Lifetime3 = this.visibleExtent + this.scrollOffset;
            this.changed = true;
            if (var6Lifetime3 <= this.contentExtent) {
              return;
            }
            this.scrollOffset = this.contentExtent - this.visibleExtent;
            return;
          }
          if (this.orientation != 1) {
            if (!this.incrementHovered) {
              if (!this.decrementHovered) {
                return;
              }
              var5 = -1;
            } else {
              var5 = 1;
            }
            this.scrollOffset = this.scrollOffset + var5 * this.unitStep;
            if (obfuscationGuard != -2) {
              return;
            }
            if (this.scrollOffset >= 0) {
              var6Lifetime2 = this.visibleExtent + this.scrollOffset;
              this.changed = true;
              if (var6Lifetime2 <= this.contentExtent) {
                return;
              }
              this.scrollOffset = this.contentExtent - this.visibleExtent;
              return;
            }
            this.scrollOffset = 0;
          } else {
            if (this.incrementHovered) {
              if (!this.incrementHovered) {
                if (!this.decrementHovered) {
                  return;
                }
                var5 = -1;
              } else {
                var5 = 1;
              }
              this.scrollOffset = this.scrollOffset + var5 * this.unitStep;
              if (obfuscationGuard != -2) {
                return;
              }
              if (this.scrollOffset >= 0) {
                var6Lifetime2 = this.visibleExtent + this.scrollOffset;
                this.changed = true;
                if (var6Lifetime2 <= this.contentExtent) {
                  return;
                }
                this.scrollOffset = this.contentExtent - this.visibleExtent;
                return;
              }
              this.scrollOffset = 0;
            } else {
              if (this.decrementHovered) {
                if (!this.incrementHovered) {
                  if (!this.decrementHovered) {
                    return;
                  }
                  var5 = -1;
                } else {
                  var5 = 1;
                }
                this.scrollOffset = this.scrollOffset + var5 * this.unitStep;
                if (obfuscationGuard != -2) {
                  return;
                }
                if (this.scrollOffset < 0) {
                  this.scrollOffset = 0;
                }
              } else {
                stackIn_80_1 = !(0 >= wheelDelta);
                this.incrementHovered = stackIn_80_1;
                stackIn_83_1 = !(wheelDelta >= 0);
                this.decrementHovered = stackIn_83_1;
                if (!this.incrementHovered) {
                  if (!this.decrementHovered) {
                    return;
                  }
                  var5 = -1;
                } else {
                  var5 = 1;
                }
                this.scrollOffset = this.scrollOffset + var5 * this.unitStep;
                if (obfuscationGuard != -2) {
                  return;
                }
                if (this.scrollOffset >= 0) {
                  var6Lifetime2 = this.visibleExtent + this.scrollOffset;
                  this.changed = true;
                  if (var6Lifetime2 <= this.contentExtent) {
                    return;
                  }
                  this.scrollOffset = this.contentExtent - this.visibleExtent;
                  return;
                }
                this.scrollOffset = 0;
              }
            }
          }
        }
        var6Lifetime1 = this.visibleExtent + this.scrollOffset;
        this.changed = true;
        if (var6Lifetime1 > this.contentExtent) {
          this.scrollOffset = this.contentExtent - this.visibleExtent;
        }
    }

    final boolean isEnabled(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return false;
        }
        return this.enabled;
    }

    final void enable(int obfuscationGuard) {
        this.enabled = true;
        if (obfuscationGuard > -60) {
          this.drawScrollBar(-13);
        }
    }

    private final int getArrowX(int obfuscationGuard, int arrowIndex) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int arrowX = obfuscationGuard;
        if (arrowIndex != 0) {
          if (arrowIndex != 1) {
            return arrowX;
          }
          if (this.orientation == 0) {
            arrowX = this.x;
            return arrowX;
          }
          if (this.orientation == 1) {
            arrowX = this.x;
            return arrowX;
          }
          return arrowX;
        }
        if (0 != this.orientation) {
          if (this.orientation == 1) {
            arrowX = this.x;
          }
          return arrowX;
        }
        int arrowWidth = this.arrowSprites[0].canvasWidth;
        arrowX = this.x - (-this.length + arrowWidth);
        return arrowX;
    }

    private final void drawThumb(int obfuscationGuard) {
        boolean guardRepeatResult = false;
        int horizontalArrowSize = 0;
        int thumbX = 0;
        int thumbY = 0;
        int verticalArrowSize;
        if (obfuscationGuard != -1342059263) {
          guardRepeatResult = this.advanceRepeat(false, (byte) 16);
        }
        int thumbWidth = 0;
        int thumbHeight = 0;
        int contentDivisor = this.contentExtent;
        if (0 >= contentDivisor) {
          contentDivisor = 1;
        }
        if (this.orientation == 0) {
          horizontalArrowSize = this.arrowSprites[0].canvasWidth;
          thumbX = horizontalArrowSize + (this.getArrowX(0, 1) + (-(horizontalArrowSize << 1) + this.length) * this.scrollOffset / contentDivisor);
          thumbY = this.y;
          thumbWidth = this.visibleExtent * (this.length - (horizontalArrowSize << 1)) / contentDivisor;
          if (this.visibleExtent + this.scrollOffset == this.contentExtent) {
            thumbWidth = this.getArrowX(0, 0) - thumbX;
          }
          thumbHeight = this.thickness;
        }
        if (this.orientation == 1) {
          thumbX = this.x;
          verticalArrowSize = this.arrowSprites[0].canvasHeight;
          thumbY = verticalArrowSize + this.getArrowY(0, 1) + (-(verticalArrowSize << 1) + this.length) * this.scrollOffset / contentDivisor;
          thumbWidth = this.thickness;
          thumbHeight = this.visibleExtent * (-(verticalArrowSize << 1) + this.length) / contentDivisor;
          if (this.scrollOffset + this.visibleExtent == this.contentExtent) {
            thumbHeight = this.getArrowY(0, 0) - thumbY;
          }
          SoftwareRaster.f(thumbX, thumbY, thumbWidth, thumbHeight, this.colours[1]);
          SoftwareRaster.b(thumbX, thumbY, thumbWidth, thumbHeight, this.colours[0]);
          return;
        }
        SoftwareRaster.f(thumbX, thumbY, thumbWidth, thumbHeight, this.colours[1]);
        SoftwareRaster.b(thumbX, thumbY, thumbWidth, thumbHeight, this.colours[0]);
    }

    SpriteScrollBar(RgbSprite[] arrowSprites, int[] colours, int orientation) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.orientation = orientation;
          this.arrowSprites = arrowSprites;
          this.colours = colours;
          this.initializeThickness(27150);
          this.enableInteraction(0);
          this.disable((byte) -65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("nb.<init>(");
          if (arrowSprites == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (colours == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(orientation).append(')').toString());
        }
    }

    static {
        nameCheckResultConsumed = new wm();
    }
}
