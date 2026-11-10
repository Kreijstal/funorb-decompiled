/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    static int field_q;
    int field_k;
    int field_p;
    int field_j;
    WidgetListener field_v;
    int field_m;
    int field_n;
    static int field_r;
    TextLayout field_t;
    WidgetPainter field_h;
    String field_o;
    boolean field_l;
    String field_s;
    int field_u;
    static boolean field_w;
    int field_i;

    void blur(byte param0) {
        if (param0 != 57) {
          this.onFocusedKey((UiWidget) null, -6, 18, 10, -10, false, 55);
        }
    }

    boolean onFocusedKey(UiWidget param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5) {
            return false;
          }
          this.field_s = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ga.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean focusNext(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 67) {
            return false;
          }
          this.field_l = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ga.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.containsPoint(param3, 21224, param2, param4, param0)) {
            this.field_m = param5;
          }
          if (param1 == 1) {
            return false;
          }
          this.onFocusedKey((UiWidget) null, 64, -30, -110, -58, false, 34);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ga.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void appendDebugProperties(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_j).append(" ").append(this.field_i).append("x").append(this.field_n);
          if (null != this.field_o) {
            discarded$1 = param3.append(" text=\"").append(this.field_o).append('"');
          }
          if (this.field_l) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.isFocused(-17741)) {
            discarded$3 = param3.append(" focused");
          }
          if (null != this.field_h) {
            discarded$4 = param3.append(" renderer=");
            if (this.field_h instanceof UiWidget) {
              param3 = this.appendDebugTree(param0, param3, true, param1 + 1);
              if (var6 != 0) {
                discarded$5 = param3.append(this.field_h);
              }
            } else {
              discarded$5 = param3.append(this.field_h);
            }
          }
          if (this.field_v != null) {
            discarded$6 = param3.append(" listener=");
            if (this.field_v instanceof UiWidget) {
              param3 = this.appendDebugTree(param0, param3, true, param1 + 1);
              if (var6 != 0) {
                discarded$7 = param3.append(this.field_v);
              }
            } else {
              discarded$7 = param3.append(this.field_v);
            }
          }
          if (param2 <= 64) {
            this.getTooltip(37);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ga.UA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean processPointerFrame(int param0, int param1, boolean param2, boolean param3) {
        int var5;
        DraggableWidget var6;
        int var7;
        DraggableWidget var8;
        DraggableWidget var9;
        DraggableWidget var10;
        DraggableWidget var11;
        DraggableWidget var12;
        DraggableWidget var13;
        DraggableWidget var14;
        DraggableWidget var15;
        DraggableWidget var16;
        int var5Lifetime1;
        var7 = ZombieDawn.field_J;
        this.updatePointer(this, (byte) 108, param0, param1);
        if (param3) {
          var5 = this.isFocused(-17741) ? 1 : 0;
          if (!param2) {
            if (var5 == 0) {
              LoginDialogGlobals.field_b = LaserBarrier.field_R;
              NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
              return param2;
            }
            if (0 == GzipDecompressor.field_d) {
              LoginDialogGlobals.field_b = LaserBarrier.field_R;
              NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
              return param2;
            }
            this.blur((byte) 57);
            if (var7 == 0) {
              LoginDialogGlobals.field_b = LaserBarrier.field_R;
              NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
              return param2;
            }
          }
          if (LevelObstacle.field_I != 0) {
            if (var5 == 0) {
              if (GzipDecompressor.field_d != 0) {
                if (!this.handlePointerPress(ScreechEffect.field_j, 1, param0, UiContainer.field_D, param1, GzipDecompressor.field_d, this)) {
                  if (var5 != 0) {
                    this.blur((byte) 57);
                    if (var7 != 0) {
                      param2 = false;
                    }
                  }
                } else {
                  param2 = false;
                }
              }
              if (LaserBarrier.field_R != 0) {
                LoginDialogGlobals.field_b = LaserBarrier.field_R;
                NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
                return param2;
              }
              if (0 == LoginDialogGlobals.field_b) {
                LoginDialogGlobals.field_b = LaserBarrier.field_R;
                NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
                return param2;
              }
              this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
              var8 = ValidationStatusIcon.field_H;
              if (var8 != null) {
                if (var8.field_v instanceof DropTargetListener) {
                  ((DropTargetListener) (var8.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var8);
                }
                ValidationStatusIcon.field_H = null;
              }
              LoginDialogGlobals.field_b = LaserBarrier.field_R;
              NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
              return param2;
            }
            this.onFocusedKey(this, LevelObstacle.field_I, param1, KeyStateHelpers.field_b, param0, true, FadingModalPanel.field_K);
          }
          if (GzipDecompressor.field_d != 0) {
            if (this.handlePointerPress(ScreechEffect.field_j, 1, param0, UiContainer.field_D, param1, GzipDecompressor.field_d, this)) {
              param2 = false;
            } else {
              if (var5 != 0) {
                this.blur((byte) 57);
                if (var7 != 0) {
                  param2 = false;
                  if (LaserBarrier.field_R != 0) {
                    LoginDialogGlobals.field_b = LaserBarrier.field_R;
                    NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
                    return param2;
                  }
                  if (0 == LoginDialogGlobals.field_b) {
                    LoginDialogGlobals.field_b = LaserBarrier.field_R;
                    NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
                    return param2;
                  }
                  this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
                  var9 = ValidationStatusIcon.field_H;
                  if (var9 != null) {
                    if (var9.field_v instanceof DropTargetListener) {
                      ((DropTargetListener) (var9.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var9);
                    }
                    ValidationStatusIcon.field_H = null;
                  }
                  LoginDialogGlobals.field_b = LaserBarrier.field_R;
                  NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
                  return param2;
                }
              }
            }
          }
          if (LaserBarrier.field_R != 0) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          if (0 == LoginDialogGlobals.field_b) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
          var10 = ValidationStatusIcon.field_H;
          if (var10 != null) {
            if (var10.field_v instanceof DropTargetListener) {
              ((DropTargetListener) (var10.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var10);
            }
            ValidationStatusIcon.field_H = null;
          }
          LoginDialogGlobals.field_b = LaserBarrier.field_R;
          NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
          return param2;
        }
        this.handlePointerPress(76, 88, -58, 36, -103, -17, (UiWidget) null);
        var5Lifetime1 = this.isFocused(-17741) ? 1 : 0;
        if (!param2) {
          if (var5Lifetime1 == 0) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          if (0 == GzipDecompressor.field_d) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          this.blur((byte) 57);
          if (var7 == 0) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
        }
        if (LevelObstacle.field_I != 0) {
          if (var5Lifetime1 == 0) {
            if (GzipDecompressor.field_d != 0 &&
              this.handlePointerPress(ScreechEffect.field_j, 1, param0, UiContainer.field_D, param1, GzipDecompressor.field_d, this)) {
              param2 = false;
            }
            if (LaserBarrier.field_R != 0) {
              LoginDialogGlobals.field_b = LaserBarrier.field_R;
              NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
              return param2;
            }
            if (0 == LoginDialogGlobals.field_b) {
              LoginDialogGlobals.field_b = LaserBarrier.field_R;
              NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
              return param2;
            }
            this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
            var11 = ValidationStatusIcon.field_H;
            var6 = var11;
            if (var11 != null) {
              if (var11.field_v instanceof DropTargetListener) {
                ((DropTargetListener) (var11.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var11);
              }
              ValidationStatusIcon.field_H = null;
            }
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          this.onFocusedKey(this, LevelObstacle.field_I, param1, KeyStateHelpers.field_b, param0, true, FadingModalPanel.field_K);
        }
        if (GzipDecompressor.field_d == 0) {
          if (LaserBarrier.field_R != 0) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          if (0 == LoginDialogGlobals.field_b) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
          var12 = ValidationStatusIcon.field_H;
          if (var12 != null) {
            if (var12.field_v instanceof DropTargetListener) {
              ((DropTargetListener) (var12.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var12);
            }
            ValidationStatusIcon.field_H = null;
          }
          LoginDialogGlobals.field_b = LaserBarrier.field_R;
          NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
          return param2;
        }
        if (this.handlePointerPress(ScreechEffect.field_j, 1, param0, UiContainer.field_D, param1, GzipDecompressor.field_d, this)) {
          param2 = false;
          if (LaserBarrier.field_R != 0) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          if (0 == LoginDialogGlobals.field_b) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
          var16 = ValidationStatusIcon.field_H;
          if (var16 != null) {
            if (var16.field_v instanceof DropTargetListener) {
              ((DropTargetListener) (var16.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var16);
            }
            ValidationStatusIcon.field_H = null;
          }
          LoginDialogGlobals.field_b = LaserBarrier.field_R;
          NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
          return param2;
        }
        if (var5Lifetime1 == 0) {
          if (LaserBarrier.field_R != 0) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          if (0 == LoginDialogGlobals.field_b) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
          var13 = ValidationStatusIcon.field_H;
          if (var13 != null) {
            if (var13.field_v instanceof DropTargetListener) {
              ((DropTargetListener) (var13.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var13);
            }
            ValidationStatusIcon.field_H = null;
          }
          LoginDialogGlobals.field_b = LaserBarrier.field_R;
          NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
          return param2;
        }
        this.blur((byte) 57);
        if (var7 == 0) {
          if (LaserBarrier.field_R != 0) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          if (0 == LoginDialogGlobals.field_b) {
            LoginDialogGlobals.field_b = LaserBarrier.field_R;
            NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
            return param2;
          }
          this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
          var14 = ValidationStatusIcon.field_H;
          if (var14 != null) {
            if (var14.field_v instanceof DropTargetListener) {
              ((DropTargetListener) (var14.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var14);
            }
            ValidationStatusIcon.field_H = null;
          }
          LoginDialogGlobals.field_b = LaserBarrier.field_R;
          NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
          return param2;
        }
        param2 = false;
        if (LaserBarrier.field_R != 0) {
          LoginDialogGlobals.field_b = LaserBarrier.field_R;
          NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
          return param2;
        }
        if (0 == LoginDialogGlobals.field_b) {
          LoginDialogGlobals.field_b = LaserBarrier.field_R;
          NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
          return param2;
        }
        this.handlePointerRelease(param1, 112, KeyStateHelpers.field_b, FadingModalPanel.field_K, param0, this);
        var15 = ValidationStatusIcon.field_H;
        if (var15 != null) {
          if (var15.field_v instanceof DropTargetListener) {
            ((DropTargetListener) (var15.field_v)).onWidgetDropped(-12156, (DropTargetWidget) null, var15);
          }
          ValidationStatusIcon.field_H = null;
        }
        LoginDialogGlobals.field_b = LaserBarrier.field_R;
        NetworkArchiveRequest.updateTooltip(this.getTooltip(-58), 0);
        return param2;
    }

    void handlePointerRelease(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        try {
          if (param1 < 1) {
            this.field_v = (WidgetListener) null;
          }
          this.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ga.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return this.appendDebugTree(new Hashtable(), new StringBuilder(), true, 0).toString();
    }

    boolean containsPoint(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param1 != 21224) {
          this.processPointerFrame(22, -63, true, true);
          if (param4 < this.field_k + param3) {
            return false;
          }
          if (param0 < this.field_j + param2) {
            return false;
          }
          if (this.field_i + param3 + this.field_k <= param4) {
            return false;
          }
          if (param0 >= param2 + this.field_j + this.field_n) {
            return false;
          }
          return true;
        }
        if (param4 < this.field_k + param3) {
          return false;
        }
        if (param0 < this.field_j + param2) {
          return false;
        }
        stackIn_18_0 = (this.field_i + param3 + this.field_k > param4) && (param0 < param2 + this.field_j + this.field_n);
        return stackIn_18_0;
    }

    int getLastRenderPass(int param0) {
        if (param0 != 0) {
          this.field_u = 73;
          return 0;
        }
        return 0;
    }

    final static void sendIntArrayRequest(int param0, int param1, SavedDataRequest param2) {
        BitPacketBuffer var3 = null;
        try {
          var3 = LinkTextPainter.field_e;
          var3.writeCipheredByte(11, param0);
          var3.writeByte(2, 93);
          var3.writeByte(param1, param1 ^ 35);
          var3.writeByte(param2.field_k, -96);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ga.VA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawAllLayers(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = ZombieDawn.field_J;
        var4 = this.getLastRenderPass(0);
        var5_int = param0;
        while (var4 >= var5_int) {
          this.drawLayer(param2, var5_int, param1, 0);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = TextHotspotRegion.getVisibleTooltipText(109);
        if (var5 == null) {
          return;
        }
        ProxySocketConnector.field_j.drawTooltip(GooPuddle.field_i, WeightedLruCache.field_i, var5, -104);
    }

    void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPoint(FadingModalPanel.field_K, 21224, param2, param3, KeyStateHelpers.field_b) ? 1 : 0;
          var6 = 7 / ((46 - param1) / 42);
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (stackIn_3_0 == (this.field_l ? 1 : 0)) {
            stackIn_8_1 = (var5_int != 0);
            this.field_l = stackIn_8_1;
            if (null != this.field_v) {
              if (!(this.field_v instanceof HoverListener)) {
                return;
              }
              ((HoverListener) (this.field_v)).onHoverChanged(this, 10766, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ga.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean isFocused(int param0) {
        if (param0 != -17741) {
          this.handlePointerPress(-123, 51, -13, -35, -43, -14, (UiWidget) null);
          return false;
        }
        return false;
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param1;
        this.field_i = param3;
        this.field_k = param2;
        this.field_n = param4;
        int var6 = 124 / ((param0 + 23) / 48);
    }

    final void reapplyBounds(boolean param0) {
        this.setBounds(38, this.field_j, this.field_k, this.field_i, this.field_n);
        if (!param0) {
          UiWidget.sendIntArrayRequest(122, 7, (SavedDataRequest) null);
        }
    }

    UiWidget(String param0, WidgetListener param1) {
        this(param0, ProxySocketConnector.field_j.field_n, param1);
    }

    boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -46 / ((param0 + 83) / 32);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ga.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean processKeyInput(int param0, byte param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.isFocused(-17741)) {
          var4 = param0;
          if (var4 == 80) {
            return this.focusNext((byte) 76, this);
          }
          if (param1 > 21) {
            return false;
          }
          this.field_n = 58;
          return false;
        }
        if (this.requestKeyboardFocus(28, param0, this, param2)) {
          return true;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 == 80) {
          return this.focusNext((byte) 76, this);
        }
        if (param1 > 21) {
          return false;
        }
        this.field_n = 58;
        return false;
    }

    StringBuilder appendDebugTree(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugDescription(param0, param1, 11098, param3)) {
            this.appendDebugProperties(param0, param3, 67, param1);
          }
          if (!param2) {
            this.toString();
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ga.NA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean beginDebugDescription(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 11098) {
            field_q = 49;
          }
          if (param0.containsKey(this)) {
            discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param0.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ga.BB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    String getTooltip(int param0) {
        int var2 = 67 / ((10 - param0) / 58);
        return !this.field_l ? null : this.field_s;
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        if (param1 == param3) {
          if (this.field_h == null) {
            return;
          }
          this.field_h.drawWidget(16777215, true, param0, this, param2);
        }
    }

    protected UiWidget() {
        this.field_p = 0;
        this.field_u = 0;
    }

    UiWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        WidgetTextLayout var4 = null;
        this.field_p = 0;
        this.field_u = 0;
        try {
          this.field_v = param2;
          this.field_o = param0;
          this.field_h = param1;
          if (this.field_h instanceof WidgetTextLayout) {
            var4 = (WidgetTextLayout) ((Object) this.field_h);
            this.field_i = var4.getPreferredTextWidth((byte) -58, this);
            this.field_n = var4.getPreferredTextHeight(false, this);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5) {
        this.field_p = 0;
        this.field_u = 0;
        try {
          this.field_h = param4;
          this.field_k = param0;
          this.field_j = param1;
          this.field_n = param3;
          this.field_i = param2;
          this.field_v = param5;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ga.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = 15;
        field_w = false;
        field_r = 0;
    }
}
