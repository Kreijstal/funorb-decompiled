/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollWidgetContainer extends ArrayWidgetContainer {
    private boolean horizontalControlAtBottom;
    private ScrollControlWidget horizontalControl;
    static String field_U;
    ClippedWidgetContainer viewport;
    static ResourceProtocolClient field_T;
    static String field_J;
    static NodeDeque field_P;
    static String field_V;
    static String field_R;
    private boolean verticalControlOnRight;
    static int field_M;
    static String field_N;
    ScrollControlWidget verticalControl;

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!super.handleKey(rootWidget, keyCode, character, obfuscationGuard)) {
            return false;
          }
          this.applyScrollPositions((byte) -110);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ai.F(");
          if (rootWidget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int readCompactInt(CipherPacketBuffer packet, boolean obfuscationGuard) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            field_N = (String) null;
          }
          stackIn_3_0 = de.readTieredSignedInt(-102, packet, 4, 14, 30, 20);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ai.C(");
          if (packet == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean handleWheel(int pointerX, int originX, int originY, int pointerY, int wheelDelta, int obfuscationGuard, Widget rootWidget) {
        RuntimeException var8 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWheel(pointerX, originX, originY, pointerY, wheelDelta, 122, rootWidget)) {
            return true;
          }
          if (obfuscationGuard <= 93) {
            field_T = (ResourceProtocolClient) null;
          }
          stackIn_9_0 = (this.isFocused(false)) && (this.scrollVertically(wheelDelta, 959449104));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("ai.RA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(pointerY).append(',').append(wheelDelta).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void setVerticalControl(byte obfuscationGuard, boolean onRight, ScrollControlWidget control) {
        try {
          this.verticalControlOnRight = onRight ? true : false;
          this.verticalControl = control;
          this.children[1] = (Widget) ((Object) control);
          if (obfuscationGuard <= 92) {
            field_R = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ai.B(" + obfuscationGuard + ',' + onRight + ',' + (control != null ? "{...}" : "null") + ')');
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        super.updatePointer(obfuscationGuard + 0, originX, originY, rootWidget);
        this.updateThumbSizes((byte) -3);
        if (obfuscationGuard != 32722) {
          return;
        }
        try {
          this.applyScrollPositions((byte) -116);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ai.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    private final void updateThumbSizes(byte obfuscationGuard) {
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -3) {
          return;
        }
        if (this.verticalControl != null) {
          if (this.viewport.child.height <= this.viewport.height) {
            this.verticalControl.sizeVerticalThumb(1, -13127, 1);
            if (this.horizontalControl == null) {
              return;
            }
            if (this.viewport.width < this.viewport.child.width) {
              this.horizontalControl.sizeHorizontalThumb(this.viewport.child.width, (byte) 124, this.viewport.width);
              return;
            }
            this.horizontalControl.sizeHorizontalThumb(1, (byte) 124, 1);
            return;
          }
          this.verticalControl.sizeVerticalThumb(this.viewport.height, -13127, this.viewport.child.height);
          if (this.horizontalControl == null) {
            return;
          }
          if (this.viewport.width < this.viewport.child.width) {
            this.horizontalControl.sizeHorizontalThumb(this.viewport.child.width, (byte) 124, this.viewport.width);
            return;
          }
          this.horizontalControl.sizeHorizontalThumb(1, (byte) 124, 1);
          return;
        }
        if (this.horizontalControl != null) {
          if (this.viewport.width < this.viewport.child.width) {
            this.horizontalControl.sizeHorizontalThumb(this.viewport.child.width, (byte) 124, this.viewport.width);
            return;
          }
          this.horizontalControl.sizeHorizontalThumb(1, (byte) 124, 1);
          return;
        }
    }

    ScrollWidgetContainer(int x, int y, int width, int height, WidgetPainter painter, Widget content, WidgetPainter viewportPainter) {
        super(x, y, width, height, painter);
        ClippedWidgetContainer contentViewport = null;
        try {
          this.children = new Widget[3];
          contentViewport = new ClippedWidgetContainer(x, y, width, height, viewportPainter, content);
          this.viewport = contentViewport;
          this.children[2] = (Widget) ((Object) contentViewport);
          this.layoutChildren((byte) 120);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ai.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (painter != null ? "{...}" : "null") + ',' + (content != null ? "{...}" : "null") + ',' + (viewportPainter != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean scrollVertically(int wheelDelta, int obfuscationGuard) {
        if (obfuscationGuard != 959449104) {
          return false;
        }
        if (null == this.verticalControl) {
          return false;
        }
        this.verticalControl.setVerticalPosition((byte) -123, this.verticalControl.verticalPosition + wheelDelta * this.verticalControl.verticalStep);
        return true;
    }

    private final void applyScrollPositions(byte obfuscationGuard) {
        if (obfuscationGuard > -104) {
          this.applyScrollPositions((byte) -37);
          if (this.verticalControl == null) {
            if (null != this.horizontalControl) {
              this.viewport.child.x = -(int)((long)this.horizontalControl.horizontalPosition * (long)(-this.viewport.width + this.viewport.child.width) >> 16);
              return;
            }
            return;
          }
          this.viewport.child.y = -(int)((long)(-this.viewport.height + this.viewport.child.height) * (long)this.verticalControl.verticalPosition >> 16);
          if (null == this.horizontalControl) {
            return;
          }
          this.viewport.child.x = -(int)((long)this.horizontalControl.horizontalPosition * (long)(-this.viewport.width + this.viewport.child.width) >> 16);
          return;
        }
        if (this.verticalControl != null) {
          this.viewport.child.y = -(int)((long)(-this.viewport.height + this.viewport.child.height) * (long)this.verticalControl.verticalPosition >> 16);
          if (null != this.horizontalControl) {
            this.viewport.child.x = -(int)((long)this.horizontalControl.horizontalPosition * (long)(-this.viewport.width + this.viewport.child.width) >> 16);
            return;
          }
          return;
        }
        if (null != this.horizontalControl) {
          this.viewport.child.x = -(int)((long)this.horizontalControl.horizontalPosition * (long)(-this.viewport.width + this.viewport.child.width) >> 16);
          return;
        }
    }

    final void layoutChildren(byte obfuscationGuard) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        ScrollControlWidget stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        ScrollControlWidget stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3;
        int stackIn_27_0 = 0;
        ScrollControlWidget stackIn_31_0 = null;
        int stackIn_32_1 = 0;
        ScrollControlWidget stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_3;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        ScrollControlWidget stackIn_52_0 = null;
        int stackIn_53_1 = 0;
        ScrollControlWidget stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_3;
        int stackIn_63_0 = 0;
        ScrollControlWidget stackIn_67_0 = null;
        int stackIn_68_1 = 0;
        ScrollControlWidget stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_73_3;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        ScrollControlWidget stackIn_87_0 = null;
        int stackIn_88_1 = 0;
        ScrollControlWidget stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_93_3;
        int stackIn_98_0 = 0;
        ScrollControlWidget stackIn_102_0 = null;
        int stackIn_103_1 = 0;
        ScrollControlWidget stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_108_3;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        ScrollControlWidget stackIn_121_0 = null;
        int stackIn_122_1 = 0;
        ScrollControlWidget stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_127_3;
        int stackIn_132_0 = 0;
        ScrollControlWidget stackIn_136_0 = null;
        int stackIn_137_1 = 0;
        ScrollControlWidget stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        int stackIn_142_3;
        int stackIn_148_0 = 0;
        int stackIn_152_0 = 0;
        ScrollControlWidget stackIn_156_0 = null;
        int stackIn_157_1 = 0;
        ScrollControlWidget stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int stackIn_162_3;
        int stackIn_167_0 = 0;
        ScrollControlWidget stackIn_171_0 = null;
        int stackIn_172_1 = 0;
        ScrollControlWidget stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        int stackIn_176_2 = 0;
        int stackIn_177_3;
        int stackIn_183_0 = 0;
        int stackIn_187_0 = 0;
        ScrollControlWidget stackIn_191_0 = null;
        int stackIn_192_1 = 0;
        ScrollControlWidget stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        int stackIn_196_2 = 0;
        int stackIn_197_3;
        int stackIn_202_0 = 0;
        ScrollControlWidget stackIn_206_0 = null;
        int stackIn_207_1 = 0;
        ScrollControlWidget stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        int stackIn_211_2 = 0;
        int stackIn_212_3;
        int stackIn_217_0 = 0;
        int stackIn_221_0 = 0;
        ScrollControlWidget stackIn_225_0 = null;
        int stackIn_226_1 = 0;
        ScrollControlWidget stackIn_230_0 = null;
        int stackIn_230_1 = 0;
        int stackIn_230_2 = 0;
        int stackIn_231_3;
        int stackIn_236_0 = 0;
        ScrollControlWidget stackIn_240_0 = null;
        int stackIn_241_1 = 0;
        ScrollControlWidget stackIn_245_0 = null;
        int stackIn_245_1 = 0;
        int stackIn_245_2 = 0;
        int stackIn_246_3;
        int viewportX;
        int viewportY;
        int viewportWidth;
        int viewportHeight;
        if (this.verticalControlOnRight) {
          viewportX = 0;
          if (!this.horizontalControlAtBottom &&
            this.horizontalControl != null) {
            stackIn_5_0 = this.horizontalControl.height;
          } else {
            stackIn_5_0 = 0;
          }
          viewportY = stackIn_5_0;
          if (this.verticalControl != null) {
            stackIn_8_0 = this.width - this.verticalControl.width;
          } else {
            stackIn_8_0 = this.width;
          }
          viewportWidth = stackIn_8_0;
          if (obfuscationGuard > 84) {
            if (this.horizontalControl != null) {
              stackIn_27_0 = this.height - this.horizontalControl.height;
            } else {
              stackIn_27_0 = this.height;
            }
            viewportHeight = stackIn_27_0;
            this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
            if (this.verticalControl != null) {
              stackIn_31_0 = this.verticalControl;
              if (!this.verticalControlOnRight) {
                stackIn_32_1 = 0;
              } else {
                stackIn_32_1 = this.width - this.verticalControl.width;
              }
              ((ScrollControlWidget) (Object) stackIn_31_0).setBounds(stackIn_32_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
            }
            if (null != this.horizontalControl) {
              stackIn_36_0 = this.horizontalControl;
              stackIn_36_1 = this.viewport.x;
              stackIn_36_2 = this.viewport.width;
              if (this.horizontalControlAtBottom) {
                stackIn_37_3 = this.height - this.horizontalControl.height;
              } else {
                stackIn_37_3 = 0;
              }
              ((ScrollControlWidget) (Object) stackIn_36_0).setBounds(stackIn_36_1, stackIn_36_2, stackIn_37_3, 8192, this.horizontalControl.height);
            }
          } else {
            this.layoutChildren((byte) -27);
            if (this.horizontalControl != null) {
              stackIn_12_0 = this.height - this.horizontalControl.height;
            } else {
              stackIn_12_0 = this.height;
            }
            viewportHeight = stackIn_12_0;
            this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
            if (this.verticalControl != null) {
              stackIn_16_0 = this.verticalControl;
              if (!this.verticalControlOnRight) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = this.width - this.verticalControl.width;
              }
              ((ScrollControlWidget) (Object) stackIn_16_0).setBounds(stackIn_17_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
            }
            if (null != this.horizontalControl) {
              stackIn_21_0 = this.horizontalControl;
              stackIn_21_1 = this.viewport.x;
              stackIn_21_2 = this.viewport.width;
              if (this.horizontalControlAtBottom) {
                stackIn_22_3 = this.height - this.horizontalControl.height;
              } else {
                stackIn_22_3 = 0;
              }
              ((ScrollControlWidget) (Object) stackIn_21_0).setBounds(stackIn_21_1, stackIn_21_2, stackIn_22_3, 8192, this.horizontalControl.height);
            }
          }
        } else {
          if (null != this.verticalControl) {
            viewportX = this.verticalControl.width;
            if (this.horizontalControlAtBottom) {
              viewportY = 0;
              if (this.verticalControl != null) {
                stackIn_148_0 = this.width - this.verticalControl.width;
              } else {
                stackIn_148_0 = this.width;
              }
              viewportWidth = stackIn_148_0;
              if (obfuscationGuard > 84) {
                if (this.horizontalControl != null) {
                  stackIn_167_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_167_0 = this.height;
                }
                viewportHeight = stackIn_167_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_171_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_172_1 = 0;
                  } else {
                    stackIn_172_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_171_0).setBounds(stackIn_172_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_176_0 = this.horizontalControl;
                  stackIn_176_1 = this.viewport.x;
                  stackIn_176_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_177_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_177_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_176_0).setBounds(stackIn_176_1, stackIn_176_2, stackIn_177_3, 8192, this.horizontalControl.height);
                }
              } else {
                this.layoutChildren((byte) -27);
                if (this.horizontalControl != null) {
                  stackIn_152_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_152_0 = this.height;
                }
                viewportHeight = stackIn_152_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_156_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_157_1 = 0;
                  } else {
                    stackIn_157_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_156_0).setBounds(stackIn_157_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_161_0 = this.horizontalControl;
                  stackIn_161_1 = this.viewport.x;
                  stackIn_161_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_162_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_162_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_161_0).setBounds(stackIn_161_1, stackIn_161_2, stackIn_162_3, 8192, this.horizontalControl.height);
                }
              }
            } else {
              if (this.horizontalControl != null) {
                viewportY = this.horizontalControl.height;
                if (this.verticalControl != null) {
                  stackIn_217_0 = this.width - this.verticalControl.width;
                } else {
                  stackIn_217_0 = this.width;
                }
                viewportWidth = stackIn_217_0;
                if (obfuscationGuard > 84) {
                  if (this.horizontalControl != null) {
                    stackIn_236_0 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_236_0 = this.height;
                  }
                  viewportHeight = stackIn_236_0;
                  this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                  if (this.verticalControl != null) {
                    stackIn_240_0 = this.verticalControl;
                    if (!this.verticalControlOnRight) {
                      stackIn_241_1 = 0;
                    } else {
                      stackIn_241_1 = this.width - this.verticalControl.width;
                    }
                    ((ScrollControlWidget) (Object) stackIn_240_0).setBounds(stackIn_241_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                  }
                  if (null != this.horizontalControl) {
                    stackIn_245_0 = this.horizontalControl;
                    stackIn_245_1 = this.viewport.x;
                    stackIn_245_2 = this.viewport.width;
                    if (this.horizontalControlAtBottom) {
                      stackIn_246_3 = this.height - this.horizontalControl.height;
                    } else {
                      stackIn_246_3 = 0;
                    }
                    ((ScrollControlWidget) (Object) stackIn_245_0).setBounds(stackIn_245_1, stackIn_245_2, stackIn_246_3, 8192, this.horizontalControl.height);
                  }
                  this.updateThumbSizes((byte) -3);
                  return;
                }
                this.layoutChildren((byte) -27);
                if (this.horizontalControl != null) {
                  stackIn_221_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_221_0 = this.height;
                }
                viewportHeight = stackIn_221_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_225_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_226_1 = 0;
                  } else {
                    stackIn_226_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_225_0).setBounds(stackIn_226_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_230_0 = this.horizontalControl;
                  stackIn_230_1 = this.viewport.x;
                  stackIn_230_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_231_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_231_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_230_0).setBounds(stackIn_230_1, stackIn_230_2, stackIn_231_3, 8192, this.horizontalControl.height);
                }
                this.updateThumbSizes((byte) -3);
                return;
              }
              viewportY = 0;
              if (this.verticalControl != null) {
                stackIn_183_0 = this.width - this.verticalControl.width;
              } else {
                stackIn_183_0 = this.width;
              }
              viewportWidth = stackIn_183_0;
              if (obfuscationGuard > 84) {
                if (this.horizontalControl != null) {
                  stackIn_202_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_202_0 = this.height;
                }
                viewportHeight = stackIn_202_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_206_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_207_1 = 0;
                  } else {
                    stackIn_207_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_206_0).setBounds(stackIn_207_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_211_0 = this.horizontalControl;
                  stackIn_211_1 = this.viewport.x;
                  stackIn_211_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_212_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_212_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_211_0).setBounds(stackIn_211_1, stackIn_211_2, stackIn_212_3, 8192, this.horizontalControl.height);
                }
              } else {
                this.layoutChildren((byte) -27);
                if (this.horizontalControl != null) {
                  stackIn_187_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_187_0 = this.height;
                }
                viewportHeight = stackIn_187_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_191_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_192_1 = 0;
                  } else {
                    stackIn_192_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_191_0).setBounds(stackIn_192_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_196_0 = this.horizontalControl;
                  stackIn_196_1 = this.viewport.x;
                  stackIn_196_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_197_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_197_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_196_0).setBounds(stackIn_196_1, stackIn_196_2, stackIn_197_3, 8192, this.horizontalControl.height);
                }
              }
            }
            this.updateThumbSizes((byte) -3);
            return;
          }
          viewportX = 0;
          if (this.horizontalControlAtBottom) {
            viewportY = 0;
            if (this.verticalControl != null) {
              stackIn_44_0 = this.width - this.verticalControl.width;
            } else {
              stackIn_44_0 = this.width;
            }
            viewportWidth = stackIn_44_0;
            if (obfuscationGuard > 84) {
              if (this.horizontalControl != null) {
                stackIn_63_0 = this.height - this.horizontalControl.height;
              } else {
                stackIn_63_0 = this.height;
              }
              viewportHeight = stackIn_63_0;
              this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
              if (this.verticalControl != null) {
                stackIn_67_0 = this.verticalControl;
                if (!this.verticalControlOnRight) {
                  stackIn_68_1 = 0;
                } else {
                  stackIn_68_1 = this.width - this.verticalControl.width;
                }
                ((ScrollControlWidget) (Object) stackIn_67_0).setBounds(stackIn_68_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
              }
              if (null != this.horizontalControl) {
                stackIn_72_0 = this.horizontalControl;
                stackIn_72_1 = this.viewport.x;
                stackIn_72_2 = this.viewport.width;
                if (this.horizontalControlAtBottom) {
                  stackIn_73_3 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_73_3 = 0;
                }
                ((ScrollControlWidget) (Object) stackIn_72_0).setBounds(stackIn_72_1, stackIn_72_2, stackIn_73_3, 8192, this.horizontalControl.height);
              }
            } else {
              this.layoutChildren((byte) -27);
              if (this.horizontalControl != null) {
                stackIn_48_0 = this.height - this.horizontalControl.height;
              } else {
                stackIn_48_0 = this.height;
              }
              viewportHeight = stackIn_48_0;
              this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
              if (this.verticalControl != null) {
                stackIn_52_0 = this.verticalControl;
                if (!this.verticalControlOnRight) {
                  stackIn_53_1 = 0;
                } else {
                  stackIn_53_1 = this.width - this.verticalControl.width;
                }
                ((ScrollControlWidget) (Object) stackIn_52_0).setBounds(stackIn_53_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
              }
              if (null != this.horizontalControl) {
                stackIn_57_0 = this.horizontalControl;
                stackIn_57_1 = this.viewport.x;
                stackIn_57_2 = this.viewport.width;
                if (this.horizontalControlAtBottom) {
                  stackIn_58_3 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_58_3 = 0;
                }
                ((ScrollControlWidget) (Object) stackIn_57_0).setBounds(stackIn_57_1, stackIn_57_2, stackIn_58_3, 8192, this.horizontalControl.height);
              }
            }
          } else {
            if (this.horizontalControl != null) {
              viewportY = this.horizontalControl.height;
              if (this.verticalControl != null) {
                stackIn_113_0 = this.width - this.verticalControl.width;
              } else {
                stackIn_113_0 = this.width;
              }
              viewportWidth = stackIn_113_0;
              if (obfuscationGuard > 84) {
                if (this.horizontalControl != null) {
                  stackIn_132_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_132_0 = this.height;
                }
                viewportHeight = stackIn_132_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_136_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_137_1 = 0;
                  } else {
                    stackIn_137_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_136_0).setBounds(stackIn_137_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_141_0 = this.horizontalControl;
                  stackIn_141_1 = this.viewport.x;
                  stackIn_141_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_142_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_142_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_141_0).setBounds(stackIn_141_1, stackIn_141_2, stackIn_142_3, 8192, this.horizontalControl.height);
                }
              } else {
                this.layoutChildren((byte) -27);
                if (this.horizontalControl != null) {
                  stackIn_117_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_117_0 = this.height;
                }
                viewportHeight = stackIn_117_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_121_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_122_1 = 0;
                  } else {
                    stackIn_122_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_121_0).setBounds(stackIn_122_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_126_0 = this.horizontalControl;
                  stackIn_126_1 = this.viewport.x;
                  stackIn_126_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_127_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_127_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_126_0).setBounds(stackIn_126_1, stackIn_126_2, stackIn_127_3, 8192, this.horizontalControl.height);
                }
              }
            } else {
              viewportY = 0;
              if (this.verticalControl != null) {
                stackIn_79_0 = this.width - this.verticalControl.width;
              } else {
                stackIn_79_0 = this.width;
              }
              viewportWidth = stackIn_79_0;
              if (obfuscationGuard > 84) {
                if (this.horizontalControl != null) {
                  stackIn_98_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_98_0 = this.height;
                }
                viewportHeight = stackIn_98_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_102_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_103_1 = 0;
                  } else {
                    stackIn_103_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_102_0).setBounds(stackIn_103_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_107_0 = this.horizontalControl;
                  stackIn_107_1 = this.viewport.x;
                  stackIn_107_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_108_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_108_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_107_0).setBounds(stackIn_107_1, stackIn_107_2, stackIn_108_3, 8192, this.horizontalControl.height);
                }
              } else {
                this.layoutChildren((byte) -27);
                if (this.horizontalControl != null) {
                  stackIn_83_0 = this.height - this.horizontalControl.height;
                } else {
                  stackIn_83_0 = this.height;
                }
                viewportHeight = stackIn_83_0;
                this.viewport.setBounds(viewportX, viewportWidth, viewportY, 8192, viewportHeight);
                if (this.verticalControl != null) {
                  stackIn_87_0 = this.verticalControl;
                  if (!this.verticalControlOnRight) {
                    stackIn_88_1 = 0;
                  } else {
                    stackIn_88_1 = this.width - this.verticalControl.width;
                  }
                  ((ScrollControlWidget) (Object) stackIn_87_0).setBounds(stackIn_88_1, this.verticalControl.width, this.viewport.y, 8192, this.viewport.height);
                }
                if (null != this.horizontalControl) {
                  stackIn_92_0 = this.horizontalControl;
                  stackIn_92_1 = this.viewport.x;
                  stackIn_92_2 = this.viewport.width;
                  if (this.horizontalControlAtBottom) {
                    stackIn_93_3 = this.height - this.horizontalControl.height;
                  } else {
                    stackIn_93_3 = 0;
                  }
                  ((ScrollControlWidget) (Object) stackIn_92_0).setBounds(stackIn_92_1, stackIn_92_2, stackIn_93_3, 8192, this.horizontalControl.height);
                }
              }
            }
          }
        }
        this.updateThumbSizes((byte) -3);
    }

    public static void b(boolean param0) {
        field_U = null;
        field_P = null;
        field_T = null;
        field_N = null;
        field_R = null;
        if (param0) {
          return;
        }
        field_J = null;
        field_V = null;
    }

    static {
        field_U = "Pause Menu";
        field_J = "Camouflaged armour helps to protect against damage from flying units.";
        field_R = "Hide private chat and appear offline to friends";
        field_V = "Campaigns";
        field_N = "Select a unit to use this item on.";
        field_M = 1;
        field_P = new NodeDeque();
    }
}
