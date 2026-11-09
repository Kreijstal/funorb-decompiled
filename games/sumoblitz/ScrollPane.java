/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPane extends ArrayWidgetContainer {
    private ScrollControl horizontalScrollControl;
    ScrollControl verticalScrollControl;
    static String field_C;
    static SpriteData[] field_F;
    ScrollViewport viewport;
    private boolean field_H;
    static boolean field_E;
    private boolean field_A;
    static String thisPasswordContainsRepeatedText;

    ScrollPane(int param0, int param1, int param2, int param3, WidgetRenderer param4, UiWidget param5, WidgetRenderer param6) {
        super(param0, param1, param2, param3, param4);
        ScrollViewport dupTemp$0 = null;
        try {
          this.children = new UiWidget[3];
          dupTemp$0 = new ScrollViewport(param0, param1, param2, param3, param6, param5);
          this.viewport = dupTemp$0;
          this.children[2] = (UiWidget) ((Object) dupTemp$0);
          this.layoutChildren(false);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "mc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          super.update(parentX, 65, root, parentY);
          this.updateScrollExtents(1);
          int var5_int = -92 % ((-25 - guard) / 45);
          this.applyScrollPositions(1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "mc.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    private final void applyScrollPositions(int guard) {
        UiWidget var3 = null;
        UiWidget var3Lifetime1;
        UiWidget var3Lifetime2;
        UiWidget var3Lifetime3;
        if (null != this.horizontalScrollControl) {
          this.viewport.child.x = -(int)((long)(-this.viewport.width + this.viewport.child.width) * (long)this.horizontalScrollControl.horizontalPositionQ16 >> 16);
          if (this.verticalScrollControl == null) {
            if (guard == 1) {
              return;
            }
            var3 = (UiWidget) null;
            this.onKey((UiWidget) null, 'g', (byte) -4, -28);
            return;
          }
          this.viewport.child.y = -(int)((long)(this.viewport.child.height - this.viewport.height) * (long)this.verticalScrollControl.verticalPositionQ16 >> 16);
          if (guard != 1) {
            var3Lifetime3 = (UiWidget) null;
            this.onKey((UiWidget) null, 'g', (byte) -4, -28);
            return;
          }
          return;
        }
        if (this.verticalScrollControl != null) {
          this.viewport.child.y = -(int)((long)(this.viewport.child.height - this.viewport.height) * (long)this.verticalScrollControl.verticalPositionQ16 >> 16);
          if (guard == 1) {
            return;
          }
          var3Lifetime1 = (UiWidget) null;
          this.onKey((UiWidget) null, 'g', (byte) -4, -28);
          return;
        }
        if (guard == 1) {
          return;
        }
        var3Lifetime2 = (UiWidget) null;
        this.onKey((UiWidget) null, 'g', (byte) -4, -28);
    }

    private final boolean scrollVerticalSteps(int stepCount, int guard) {
        if (guard != 0) {
          UiWidget var4 = (UiWidget) null;
          this.onKey((UiWidget) null, '￠', (byte) -97, -36);
          if (this.verticalScrollControl != null) {
            this.verticalScrollControl.setVerticalPosition(guard ^ 0, stepCount * this.verticalScrollControl.verticalStepQ16 + this.verticalScrollControl.verticalPositionQ16);
            return true;
          }
          return false;
        }
        if (this.verticalScrollControl != null) {
          this.verticalScrollControl.setVerticalPosition(guard ^ 0, stepCount * this.verticalScrollControl.verticalStepQ16 + this.verticalScrollControl.verticalPositionQ16);
          return true;
        }
        return false;
    }

    final boolean onMouseWheel(int parentY, int wheelDelta, int guard, int parentX, int pointerY, UiWidget root, int pointerX) {
        RuntimeException var8 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onMouseWheel(parentY, wheelDelta, guard ^ 0, parentX, pointerY, root, pointerX)) {
            return true;
          }
          if (guard != -1) {
            this.verticalScrollControl = (ScrollControl) null;
          }
          stackIn_10_0 = (this.hasFocus(-1)) && (this.scrollVerticalSteps(wheelDelta, 0));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("mc.RA(").append(parentY).append(',').append(wheelDelta).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',');
          if (root == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(pointerX).append(')').toString());
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        UiWidget var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 9) {
            var6 = (UiWidget) null;
            this.update(20, 50, (UiWidget) null, 57);
          }
          if (!super.onKey(root, character, (byte) 74, keyCode)) {
            return false;
          }
          this.applyScrollPositions(1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mc.KA(");
          if (root == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    final void setVerticalScrollControl(int guard, boolean reserveSpace, ScrollControl control) {
        if (guard != 1332) {
          return;
        }
        try {
          this.verticalScrollControl = control;
          this.children[1] = (UiWidget) ((Object) control);
          this.field_H = reserveSpace ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "mc.VA(" + guard + ',' + reserveSpace + ',' + (control != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -93 % ((30 - param0) / 59);
          stackIn_1_0 = ToolkitRasterStateCacheEntry.a((byte) 126, hc.class, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("mc.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static RasterIndexedSprite a(byte param0, ResourceArchive param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RasterIndexedSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.groupId(0, param3);
          var5 = -112 / ((param0 + 84) / 40);
          var6 = param1.fileId(var4_int, param2, (byte) 127);
          stackIn_1_0 = TextureFormat.a(var6, var4_int, param1, -21834);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("mc.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        thisPasswordContainsRepeatedText = null;
        if (!param0) {
          field_F = (SpriteData[]) null;
          field_C = null;
          field_F = null;
          return;
        }
        field_C = null;
        field_F = null;
    }

    private final void updateScrollExtents(int guard) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 1) {
          return;
        }
        if (null != this.verticalScrollControl) {
          if (this.viewport.child.height <= this.viewport.height) {
            this.verticalScrollControl.setVerticalExtent(101, 1, 1);
            if (null == this.horizontalScrollControl) {
              return;
            }
            if (this.viewport.width < this.viewport.child.width) {
              this.horizontalScrollControl.setHorizontalExtent(this.viewport.width, this.viewport.child.width, 8);
              return;
            }
            this.horizontalScrollControl.setHorizontalExtent(1, 1, 107);
            return;
          }
          this.verticalScrollControl.setVerticalExtent(12, this.viewport.child.height, this.viewport.height);
          if (null == this.horizontalScrollControl) {
            return;
          }
          if (this.viewport.width < this.viewport.child.width) {
            this.horizontalScrollControl.setHorizontalExtent(this.viewport.width, this.viewport.child.width, 8);
            return;
          }
          this.horizontalScrollControl.setHorizontalExtent(1, 1, 107);
          return;
        }
        if (null == this.horizontalScrollControl) {
          return;
        }
        if (this.viewport.width < this.viewport.child.width) {
          this.horizontalScrollControl.setHorizontalExtent(this.viewport.width, this.viewport.child.width, 8);
          return;
        }
        this.horizontalScrollControl.setHorizontalExtent(1, 1, 107);
    }

    final void layoutChildren(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        ScrollControl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        ScrollControl stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_3;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        ScrollControl stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        ScrollControl stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_47_3;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        ScrollControl stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        ScrollControl stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_68_3;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        ScrollControl stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_82_2 = 0;
        ScrollControl stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_87_3;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        ScrollControl stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_100_2 = 0;
        ScrollControl stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_105_3;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        ScrollControl stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        int stackIn_123_2 = 0;
        ScrollControl stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_128_3;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        ScrollControl stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_142_2 = 0;
        ScrollControl stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_147_3;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        ScrollControl stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_160_2 = 0;
        ScrollControl stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_164_2 = 0;
        int stackIn_165_3;
        int stackIn_172_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_178_0 = 0;
        ScrollControl stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_183_2 = 0;
        ScrollControl stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        int stackIn_188_3;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        ScrollControl stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        int stackIn_202_2 = 0;
        ScrollControl stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int stackIn_207_3;
        int stackIn_212_0 = 0;
        int stackIn_215_0 = 0;
        ScrollControl stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        int stackIn_220_2 = 0;
        ScrollControl stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_224_2 = 0;
        int stackIn_225_3;
        int stackIn_231_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        ScrollControl stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        int stackIn_242_2 = 0;
        ScrollControl stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        int stackIn_247_3;
        int stackIn_253_0 = 0;
        int stackIn_256_0 = 0;
        ScrollControl stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        int stackIn_261_2 = 0;
        ScrollControl stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        int stackIn_265_2 = 0;
        int stackIn_266_3;
        int stackIn_271_0 = 0;
        int stackIn_274_0 = 0;
        ScrollControl stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        int stackIn_279_2 = 0;
        ScrollControl stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        int stackIn_283_2 = 0;
        int stackIn_284_3;
        int var2;
        int var3;
        int var4;
        int var5;
        if (param0) {
          thisPasswordContainsRepeatedText = (String) null;
          if (this.field_H) {
            var2 = 0;
            if (!this.field_A &&
              null != this.horizontalScrollControl) {
              stackIn_7_0 = this.horizontalScrollControl.height;
            } else {
              stackIn_7_0 = 0;
            }
            var3 = stackIn_7_0;
            if (this.verticalScrollControl != null) {
              stackIn_10_0 = -this.verticalScrollControl.width + this.width;
            } else {
              stackIn_10_0 = this.width;
            }
            var4 = stackIn_10_0;
            if (null == this.horizontalScrollControl) {
              stackIn_13_0 = this.height;
            } else {
              stackIn_13_0 = -this.horizontalScrollControl.height + this.height;
            }
            var5 = stackIn_13_0;
            this.viewport.setBounds(-123, var2, var3, var5, var4);
            if (this.verticalScrollControl != null) {
              stackIn_17_0 = this.verticalScrollControl;
              stackIn_17_1 = -119;
              if (!this.field_H) {
                stackIn_18_2 = 0;
              } else {
                stackIn_18_2 = this.width - this.verticalScrollControl.width;
              }
              ((ScrollControl) (Object) stackIn_17_0).setBounds(stackIn_17_1, stackIn_18_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
            }
            if (this.horizontalScrollControl != null) {
              stackIn_22_0 = this.horizontalScrollControl;
              stackIn_22_1 = 91;
              stackIn_22_2 = this.viewport.x;
              if (this.field_A) {
                stackIn_23_3 = -this.horizontalScrollControl.height + this.height;
              } else {
                stackIn_23_3 = 0;
              }
              ((ScrollControl) (Object) stackIn_22_0).setBounds(stackIn_22_1, stackIn_22_2, stackIn_23_3, this.horizontalScrollControl.height, this.viewport.width);
            }
          } else {
            if (this.verticalScrollControl == null) {
              var2 = 0;
              if (!this.field_A &&
                null != this.horizontalScrollControl) {
                stackIn_31_0 = this.horizontalScrollControl.height;
              } else {
                stackIn_31_0 = 0;
              }
              var3 = stackIn_31_0;
              if (this.verticalScrollControl != null) {
                stackIn_34_0 = -this.verticalScrollControl.width + this.width;
              } else {
                stackIn_34_0 = this.width;
              }
              var4 = stackIn_34_0;
              if (null == this.horizontalScrollControl) {
                stackIn_37_0 = this.height;
              } else {
                stackIn_37_0 = -this.horizontalScrollControl.height + this.height;
              }
              var5 = stackIn_37_0;
              this.viewport.setBounds(-123, var2, var3, var5, var4);
              if (this.verticalScrollControl != null) {
                stackIn_41_0 = this.verticalScrollControl;
                stackIn_41_1 = -119;
                if (!this.field_H) {
                  stackIn_42_2 = 0;
                } else {
                  stackIn_42_2 = this.width - this.verticalScrollControl.width;
                }
                ((ScrollControl) (Object) stackIn_41_0).setBounds(stackIn_41_1, stackIn_42_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
              }
              if (this.horizontalScrollControl != null) {
                stackIn_46_0 = this.horizontalScrollControl;
                stackIn_46_1 = 91;
                stackIn_46_2 = this.viewport.x;
                if (this.field_A) {
                  stackIn_47_3 = -this.horizontalScrollControl.height + this.height;
                } else {
                  stackIn_47_3 = 0;
                }
                ((ScrollControl) (Object) stackIn_46_0).setBounds(stackIn_46_1, stackIn_46_2, stackIn_47_3, this.horizontalScrollControl.height, this.viewport.width);
              }
            } else {
              var2 = this.verticalScrollControl.width;
              if (this.field_A) {
                stackIn_52_0 = 0;
                var3 = stackIn_52_0;
                if (this.verticalScrollControl != null) {
                  stackIn_55_0 = -this.verticalScrollControl.width + this.width;
                } else {
                  stackIn_55_0 = this.width;
                }
                var4 = stackIn_55_0;
                if (null == this.horizontalScrollControl) {
                  stackIn_58_0 = this.height;
                } else {
                  stackIn_58_0 = -this.horizontalScrollControl.height + this.height;
                }
                var5 = stackIn_58_0;
                this.viewport.setBounds(-123, var2, var3, var5, var4);
                if (this.verticalScrollControl != null) {
                  stackIn_62_0 = this.verticalScrollControl;
                  stackIn_62_1 = -119;
                  if (!this.field_H) {
                    stackIn_63_2 = 0;
                  } else {
                    stackIn_63_2 = this.width - this.verticalScrollControl.width;
                  }
                  ((ScrollControl) (Object) stackIn_62_0).setBounds(stackIn_62_1, stackIn_63_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                }
                if (this.horizontalScrollControl != null) {
                  stackIn_67_0 = this.horizontalScrollControl;
                  stackIn_67_1 = 91;
                  stackIn_67_2 = this.viewport.x;
                  if (this.field_A) {
                    stackIn_68_3 = -this.horizontalScrollControl.height + this.height;
                  } else {
                    stackIn_68_3 = 0;
                  }
                  ((ScrollControl) (Object) stackIn_67_0).setBounds(stackIn_67_1, stackIn_67_2, stackIn_68_3, this.horizontalScrollControl.height, this.viewport.width);
                }
              } else {
                if (null == this.horizontalScrollControl) {
                  var3 = 0;
                  if (this.verticalScrollControl != null) {
                    stackIn_92_0 = -this.verticalScrollControl.width + this.width;
                  } else {
                    stackIn_92_0 = this.width;
                  }
                  var4 = stackIn_92_0;
                  if (null == this.horizontalScrollControl) {
                    stackIn_95_0 = this.height;
                  } else {
                    stackIn_95_0 = -this.horizontalScrollControl.height + this.height;
                  }
                  var5 = stackIn_95_0;
                  this.viewport.setBounds(-123, var2, var3, var5, var4);
                  if (this.verticalScrollControl != null) {
                    stackIn_99_0 = this.verticalScrollControl;
                    stackIn_99_1 = -119;
                    if (!this.field_H) {
                      stackIn_100_2 = 0;
                    } else {
                      stackIn_100_2 = this.width - this.verticalScrollControl.width;
                    }
                    ((ScrollControl) (Object) stackIn_99_0).setBounds(stackIn_99_1, stackIn_100_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                  }
                  if (this.horizontalScrollControl != null) {
                    stackIn_104_0 = this.horizontalScrollControl;
                    stackIn_104_1 = 91;
                    stackIn_104_2 = this.viewport.x;
                    if (this.field_A) {
                      stackIn_105_3 = -this.horizontalScrollControl.height + this.height;
                    } else {
                      stackIn_105_3 = 0;
                    }
                    ((ScrollControl) (Object) stackIn_104_0).setBounds(stackIn_104_1, stackIn_104_2, stackIn_105_3, this.horizontalScrollControl.height, this.viewport.width);
                  }
                } else {
                  var3 = this.horizontalScrollControl.height;
                  if (this.verticalScrollControl != null) {
                    stackIn_74_0 = -this.verticalScrollControl.width + this.width;
                  } else {
                    stackIn_74_0 = this.width;
                  }
                  var4 = stackIn_74_0;
                  if (null == this.horizontalScrollControl) {
                    stackIn_77_0 = this.height;
                  } else {
                    stackIn_77_0 = -this.horizontalScrollControl.height + this.height;
                  }
                  var5 = stackIn_77_0;
                  this.viewport.setBounds(-123, var2, var3, var5, var4);
                  if (this.verticalScrollControl != null) {
                    stackIn_81_0 = this.verticalScrollControl;
                    stackIn_81_1 = -119;
                    if (!this.field_H) {
                      stackIn_82_2 = 0;
                    } else {
                      stackIn_82_2 = this.width - this.verticalScrollControl.width;
                    }
                    ((ScrollControl) (Object) stackIn_81_0).setBounds(stackIn_81_1, stackIn_82_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                  }
                  if (this.horizontalScrollControl != null) {
                    stackIn_86_0 = this.horizontalScrollControl;
                    stackIn_86_1 = 91;
                    stackIn_86_2 = this.viewport.x;
                    if (this.field_A) {
                      stackIn_87_3 = -this.horizontalScrollControl.height + this.height;
                    } else {
                      stackIn_87_3 = 0;
                    }
                    ((ScrollControl) (Object) stackIn_86_0).setBounds(stackIn_86_1, stackIn_86_2, stackIn_87_3, this.horizontalScrollControl.height, this.viewport.width);
                  }
                }
              }
            }
          }
        } else {
          if (this.field_H) {
            var2 = 0;
            if (this.field_A) {
              stackIn_112_0 = 0;
              var3 = stackIn_112_0;
              if (this.verticalScrollControl != null) {
                stackIn_115_0 = -this.verticalScrollControl.width + this.width;
              } else {
                stackIn_115_0 = this.width;
              }
              var4 = stackIn_115_0;
              if (null == this.horizontalScrollControl) {
                stackIn_118_0 = this.height;
              } else {
                stackIn_118_0 = -this.horizontalScrollControl.height + this.height;
              }
              var5 = stackIn_118_0;
              this.viewport.setBounds(-123, var2, var3, var5, var4);
              if (this.verticalScrollControl != null) {
                stackIn_122_0 = this.verticalScrollControl;
                stackIn_122_1 = -119;
                if (!this.field_H) {
                  stackIn_123_2 = 0;
                } else {
                  stackIn_123_2 = this.width - this.verticalScrollControl.width;
                }
                ((ScrollControl) (Object) stackIn_122_0).setBounds(stackIn_122_1, stackIn_123_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
              }
              if (this.horizontalScrollControl != null) {
                stackIn_127_0 = this.horizontalScrollControl;
                stackIn_127_1 = 91;
                stackIn_127_2 = this.viewport.x;
                if (this.field_A) {
                  stackIn_128_3 = -this.horizontalScrollControl.height + this.height;
                } else {
                  stackIn_128_3 = 0;
                }
                ((ScrollControl) (Object) stackIn_127_0).setBounds(stackIn_127_1, stackIn_127_2, stackIn_128_3, this.horizontalScrollControl.height, this.viewport.width);
              }
            } else {
              if (null == this.horizontalScrollControl) {
                var3 = 0;
                if (this.verticalScrollControl != null) {
                  stackIn_152_0 = -this.verticalScrollControl.width + this.width;
                } else {
                  stackIn_152_0 = this.width;
                }
                var4 = stackIn_152_0;
                if (null == this.horizontalScrollControl) {
                  stackIn_155_0 = this.height;
                } else {
                  stackIn_155_0 = -this.horizontalScrollControl.height + this.height;
                }
                var5 = stackIn_155_0;
                this.viewport.setBounds(-123, var2, var3, var5, var4);
                if (this.verticalScrollControl != null) {
                  stackIn_159_0 = this.verticalScrollControl;
                  stackIn_159_1 = -119;
                  if (!this.field_H) {
                    stackIn_160_2 = 0;
                  } else {
                    stackIn_160_2 = this.width - this.verticalScrollControl.width;
                  }
                  ((ScrollControl) (Object) stackIn_159_0).setBounds(stackIn_159_1, stackIn_160_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                }
                if (this.horizontalScrollControl != null) {
                  stackIn_164_0 = this.horizontalScrollControl;
                  stackIn_164_1 = 91;
                  stackIn_164_2 = this.viewport.x;
                  if (this.field_A) {
                    stackIn_165_3 = -this.horizontalScrollControl.height + this.height;
                  } else {
                    stackIn_165_3 = 0;
                  }
                  ((ScrollControl) (Object) stackIn_164_0).setBounds(stackIn_164_1, stackIn_164_2, stackIn_165_3, this.horizontalScrollControl.height, this.viewport.width);
                }
              } else {
                var3 = this.horizontalScrollControl.height;
                if (this.verticalScrollControl != null) {
                  stackIn_134_0 = -this.verticalScrollControl.width + this.width;
                } else {
                  stackIn_134_0 = this.width;
                }
                var4 = stackIn_134_0;
                if (null == this.horizontalScrollControl) {
                  stackIn_137_0 = this.height;
                } else {
                  stackIn_137_0 = -this.horizontalScrollControl.height + this.height;
                }
                var5 = stackIn_137_0;
                this.viewport.setBounds(-123, var2, var3, var5, var4);
                if (this.verticalScrollControl != null) {
                  stackIn_141_0 = this.verticalScrollControl;
                  stackIn_141_1 = -119;
                  if (!this.field_H) {
                    stackIn_142_2 = 0;
                  } else {
                    stackIn_142_2 = this.width - this.verticalScrollControl.width;
                  }
                  ((ScrollControl) (Object) stackIn_141_0).setBounds(stackIn_141_1, stackIn_142_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                }
                if (this.horizontalScrollControl != null) {
                  stackIn_146_0 = this.horizontalScrollControl;
                  stackIn_146_1 = 91;
                  stackIn_146_2 = this.viewport.x;
                  if (this.field_A) {
                    stackIn_147_3 = -this.horizontalScrollControl.height + this.height;
                  } else {
                    stackIn_147_3 = 0;
                  }
                  ((ScrollControl) (Object) stackIn_146_0).setBounds(stackIn_146_1, stackIn_146_2, stackIn_147_3, this.horizontalScrollControl.height, this.viewport.width);
                }
              }
            }
          } else {
            if (this.verticalScrollControl != null) {
              var2 = this.verticalScrollControl.width;
              if (this.field_A) {
                stackIn_231_0 = 0;
                var3 = stackIn_231_0;
                if (this.verticalScrollControl != null) {
                  stackIn_234_0 = -this.verticalScrollControl.width + this.width;
                } else {
                  stackIn_234_0 = this.width;
                }
                var4 = stackIn_234_0;
                if (null == this.horizontalScrollControl) {
                  stackIn_237_0 = this.height;
                } else {
                  stackIn_237_0 = -this.horizontalScrollControl.height + this.height;
                }
                var5 = stackIn_237_0;
                this.viewport.setBounds(-123, var2, var3, var5, var4);
                if (this.verticalScrollControl != null) {
                  stackIn_241_0 = this.verticalScrollControl;
                  stackIn_241_1 = -119;
                  if (!this.field_H) {
                    stackIn_242_2 = 0;
                  } else {
                    stackIn_242_2 = this.width - this.verticalScrollControl.width;
                  }
                  ((ScrollControl) (Object) stackIn_241_0).setBounds(stackIn_241_1, stackIn_242_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                }
                if (this.horizontalScrollControl != null) {
                  stackIn_246_0 = this.horizontalScrollControl;
                  stackIn_246_1 = 91;
                  stackIn_246_2 = this.viewport.x;
                  if (this.field_A) {
                    stackIn_247_3 = -this.horizontalScrollControl.height + this.height;
                  } else {
                    stackIn_247_3 = 0;
                  }
                  ((ScrollControl) (Object) stackIn_246_0).setBounds(stackIn_246_1, stackIn_246_2, stackIn_247_3, this.horizontalScrollControl.height, this.viewport.width);
                }
              } else {
                if (null == this.horizontalScrollControl) {
                  var3 = 0;
                  if (this.verticalScrollControl != null) {
                    stackIn_271_0 = -this.verticalScrollControl.width + this.width;
                  } else {
                    stackIn_271_0 = this.width;
                  }
                  var4 = stackIn_271_0;
                  if (null == this.horizontalScrollControl) {
                    stackIn_274_0 = this.height;
                  } else {
                    stackIn_274_0 = -this.horizontalScrollControl.height + this.height;
                  }
                  var5 = stackIn_274_0;
                  this.viewport.setBounds(-123, var2, var3, var5, var4);
                  if (this.verticalScrollControl != null) {
                    stackIn_278_0 = this.verticalScrollControl;
                    stackIn_278_1 = -119;
                    if (!this.field_H) {
                      stackIn_279_2 = 0;
                    } else {
                      stackIn_279_2 = this.width - this.verticalScrollControl.width;
                    }
                    ((ScrollControl) (Object) stackIn_278_0).setBounds(stackIn_278_1, stackIn_279_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                  }
                  if (this.horizontalScrollControl != null) {
                    stackIn_283_0 = this.horizontalScrollControl;
                    stackIn_283_1 = 91;
                    stackIn_283_2 = this.viewport.x;
                    if (this.field_A) {
                      stackIn_284_3 = -this.horizontalScrollControl.height + this.height;
                    } else {
                      stackIn_284_3 = 0;
                    }
                    ((ScrollControl) (Object) stackIn_283_0).setBounds(stackIn_283_1, stackIn_283_2, stackIn_284_3, this.horizontalScrollControl.height, this.viewport.width);
                  }
                  this.updateScrollExtents(1);
                  return;
                }
                var3 = this.horizontalScrollControl.height;
                if (this.verticalScrollControl != null) {
                  stackIn_253_0 = -this.verticalScrollControl.width + this.width;
                } else {
                  stackIn_253_0 = this.width;
                }
                var4 = stackIn_253_0;
                if (null == this.horizontalScrollControl) {
                  stackIn_256_0 = this.height;
                } else {
                  stackIn_256_0 = -this.horizontalScrollControl.height + this.height;
                }
                var5 = stackIn_256_0;
                this.viewport.setBounds(-123, var2, var3, var5, var4);
                if (this.verticalScrollControl != null) {
                  stackIn_260_0 = this.verticalScrollControl;
                  stackIn_260_1 = -119;
                  if (!this.field_H) {
                    stackIn_261_2 = 0;
                  } else {
                    stackIn_261_2 = this.width - this.verticalScrollControl.width;
                  }
                  ((ScrollControl) (Object) stackIn_260_0).setBounds(stackIn_260_1, stackIn_261_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                }
                if (this.horizontalScrollControl != null) {
                  stackIn_265_0 = this.horizontalScrollControl;
                  stackIn_265_1 = 91;
                  stackIn_265_2 = this.viewport.x;
                  if (this.field_A) {
                    stackIn_266_3 = -this.horizontalScrollControl.height + this.height;
                  } else {
                    stackIn_266_3 = 0;
                  }
                  ((ScrollControl) (Object) stackIn_265_0).setBounds(stackIn_265_1, stackIn_265_2, stackIn_266_3, this.horizontalScrollControl.height, this.viewport.width);
                }
              }
              this.updateScrollExtents(1);
              return;
            }
            var2 = 0;
            if (this.field_A) {
              stackIn_172_0 = 0;
              var3 = stackIn_172_0;
              if (this.verticalScrollControl != null) {
                stackIn_175_0 = -this.verticalScrollControl.width + this.width;
              } else {
                stackIn_175_0 = this.width;
              }
              var4 = stackIn_175_0;
              if (null == this.horizontalScrollControl) {
                stackIn_178_0 = this.height;
              } else {
                stackIn_178_0 = -this.horizontalScrollControl.height + this.height;
              }
              var5 = stackIn_178_0;
              this.viewport.setBounds(-123, var2, var3, var5, var4);
              if (this.verticalScrollControl != null) {
                stackIn_182_0 = this.verticalScrollControl;
                stackIn_182_1 = -119;
                if (!this.field_H) {
                  stackIn_183_2 = 0;
                } else {
                  stackIn_183_2 = this.width - this.verticalScrollControl.width;
                }
                ((ScrollControl) (Object) stackIn_182_0).setBounds(stackIn_182_1, stackIn_183_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
              }
              if (this.horizontalScrollControl != null) {
                stackIn_187_0 = this.horizontalScrollControl;
                stackIn_187_1 = 91;
                stackIn_187_2 = this.viewport.x;
                if (this.field_A) {
                  stackIn_188_3 = -this.horizontalScrollControl.height + this.height;
                } else {
                  stackIn_188_3 = 0;
                }
                ((ScrollControl) (Object) stackIn_187_0).setBounds(stackIn_187_1, stackIn_187_2, stackIn_188_3, this.horizontalScrollControl.height, this.viewport.width);
              }
            } else {
              if (null == this.horizontalScrollControl) {
                var3 = 0;
                if (this.verticalScrollControl != null) {
                  stackIn_212_0 = -this.verticalScrollControl.width + this.width;
                } else {
                  stackIn_212_0 = this.width;
                }
                var4 = stackIn_212_0;
                if (null == this.horizontalScrollControl) {
                  stackIn_215_0 = this.height;
                } else {
                  stackIn_215_0 = -this.horizontalScrollControl.height + this.height;
                }
                var5 = stackIn_215_0;
                this.viewport.setBounds(-123, var2, var3, var5, var4);
                if (this.verticalScrollControl != null) {
                  stackIn_219_0 = this.verticalScrollControl;
                  stackIn_219_1 = -119;
                  if (!this.field_H) {
                    stackIn_220_2 = 0;
                  } else {
                    stackIn_220_2 = this.width - this.verticalScrollControl.width;
                  }
                  ((ScrollControl) (Object) stackIn_219_0).setBounds(stackIn_219_1, stackIn_220_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                }
                if (this.horizontalScrollControl != null) {
                  stackIn_224_0 = this.horizontalScrollControl;
                  stackIn_224_1 = 91;
                  stackIn_224_2 = this.viewport.x;
                  if (this.field_A) {
                    stackIn_225_3 = -this.horizontalScrollControl.height + this.height;
                  } else {
                    stackIn_225_3 = 0;
                  }
                  ((ScrollControl) (Object) stackIn_224_0).setBounds(stackIn_224_1, stackIn_224_2, stackIn_225_3, this.horizontalScrollControl.height, this.viewport.width);
                }
              } else {
                var3 = this.horizontalScrollControl.height;
                if (this.verticalScrollControl != null) {
                  stackIn_194_0 = -this.verticalScrollControl.width + this.width;
                } else {
                  stackIn_194_0 = this.width;
                }
                var4 = stackIn_194_0;
                if (null == this.horizontalScrollControl) {
                  stackIn_197_0 = this.height;
                } else {
                  stackIn_197_0 = -this.horizontalScrollControl.height + this.height;
                }
                var5 = stackIn_197_0;
                this.viewport.setBounds(-123, var2, var3, var5, var4);
                if (this.verticalScrollControl != null) {
                  stackIn_201_0 = this.verticalScrollControl;
                  stackIn_201_1 = -119;
                  if (!this.field_H) {
                    stackIn_202_2 = 0;
                  } else {
                    stackIn_202_2 = this.width - this.verticalScrollControl.width;
                  }
                  ((ScrollControl) (Object) stackIn_201_0).setBounds(stackIn_201_1, stackIn_202_2, this.viewport.y, this.viewport.height, this.verticalScrollControl.width);
                }
                if (this.horizontalScrollControl != null) {
                  stackIn_206_0 = this.horizontalScrollControl;
                  stackIn_206_1 = 91;
                  stackIn_206_2 = this.viewport.x;
                  if (this.field_A) {
                    stackIn_207_3 = -this.horizontalScrollControl.height + this.height;
                  } else {
                    stackIn_207_3 = 0;
                  }
                  ((ScrollControl) (Object) stackIn_206_0).setBounds(stackIn_206_1, stackIn_206_2, stackIn_207_3, this.horizontalScrollControl.height, this.viewport.width);
                }
              }
            }
          }
        }
        this.updateScrollExtents(1);
    }

    static {
        thisPasswordContainsRepeatedText = "This password contains repeated characters, and would be easy to guess";
    }
}
