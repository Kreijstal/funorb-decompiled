/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    int field_r;
    static String field_x;
    int field_C;
    static hg field_m;
    String field_v;
    static String field_B;
    int field_q;
    static ci[] field_l;
    WidgetEventListener field_p;
    int field_A;
    int field_u;
    int field_y;
    static boolean field_o;
    WidgetRenderer field_n;
    int field_k;
    boolean field_w;
    static int field_z;
    String field_j;
    TextLayout field_t;
    static rk[] field_s;

    boolean pointerPressed(int param0, int param1, int param2, byte param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.containsPointer(param2, param5, param6, (byte) -117, param1)) {
            this.field_q = param0;
          }
          if (param3 == 88) {
            return false;
          }
          this.field_j = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("mf.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_z = 37;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void blur(int param0) {
        int var2 = 70 % ((34 - param0) / 57);
    }

    final boolean processKeyInput(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!this.isFocused((byte) -67)) {
          var4 = -101 / ((2 - param1) / 35);
          var5 = param2;
          if (var5 != 80) {
            return false;
          }
          return this.takeFocus(0, this);
        }
        if (this.handleKey(param0, param2, -1, this)) {
          return true;
        }
        var4Lifetime1 = -101 / ((2 - param1) / 35);
        var5Lifetime1 = param2;
        if (var5Lifetime1 != 80) {
          return false;
        }
        return this.takeFocus(0, this);
    }

    boolean handleWheel(int param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 59) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("mf.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_l = null;
        field_B = null;
        field_s = null;
        field_x = null;
        if (param0 != 0) {
          return;
        }
        field_m = null;
    }

    final void appendDebugProperties(Hashtable param0, StringBuilder param1, int param2, boolean param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        UiWidget var7 = null;
        var6 = Chess.field_G;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_u).append(",").append(this.field_r).append(" ").append(this.field_y).append("x").append(this.field_C);
          if (this.field_v != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_v).append('"');
          }
          if (this.field_w) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.isFocused((byte) -67)) {
            discarded$3 = param1.append(" focused");
          }
          if (this.field_n != null) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_n instanceof UiWidget) {
              param1 = this.appendDebugTree(param0, param2 + 1, param1, 1);
              if (var6 != 0) {
                discarded$5 = param1.append(this.field_n);
              }
            } else {
              discarded$5 = param1.append(this.field_n);
            }
          }
          if (this.field_p != null) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_p instanceof UiWidget)) {
              discarded$7 = param1.append(this.field_p);
              if (var6 != 0) {
                param1 = this.appendDebugTree(param0, 1 + param2, param1, 1);
              }
            } else {
              param1 = this.appendDebugTree(param0, 1 + param2, param1, 1);
            }
          }
          if (param3) {
            var7 = (UiWidget) null;
            this.pointerPressed(107, 21, -55, (byte) -96, (UiWidget) null, -117, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("mf.WB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(pf param0, int param1) {
        try {
          ka.field_a.a(false, param0, param1 + 113);
          if (param1 != 0) {
            field_m = (hg) null;
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "mf.UB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        return this.appendDebugTree(new Hashtable(), 0, new StringBuilder(), 1).toString();
    }

    void pointerReleased(int param0, UiWidget param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_q = param4;
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "mf.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void refreshLayout(byte param0) {
        if (param0 <= 89) {
          return;
        }
        this.setBounds(this.field_r, 34, this.field_C, this.field_y, this.field_u);
    }

    final boolean processPointerInput(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var7;
        DraggableWidgetContainer var8;
        DraggableWidgetContainer var9;
        DraggableWidgetContainer var11;
        DraggableWidgetContainer var12;
        DraggableWidgetContainer var19;
        var7 = Chess.field_G;
        this.updatePointer(param2, -87, this, param1);
        if (param0 >= -116) {
          return true;
        }
        regionExit1: {
          var5 = this.isFocused((byte) -67) ? 1 : 0;
          if (param3) {
            if (0 != fl.field_p) {
              if (var5 == 0) {
                if (0 == th.field_d) {
                  if (((wh.field_f == 0)) &&
                    ((DiskCacheWorker.field_h != 0))) {
                    this.pointerReleased(rf.field_b, this, param2, BufferedSocket.field_k, 0, param1);
                    var8 = AwtRasterBuffer.field_a;
                    if (var8 != null) {
                      if (!(var8.field_p instanceof WidgetDropListener)) {
                        AwtRasterBuffer.field_a = null;
                      } else {
                        ((WidgetDropListener) (var8.field_p)).widgetDropped(var8, -10925, (DropTargetWidgetContainer) null);
                        AwtRasterBuffer.field_a = null;
                      }
                    }
                    if (var7 != 0 &&
                      var5 != 0 &&
                      th.field_d != 0) {
                      this.blur(102);
                    }
                  }
                } else {
                  if (this.pointerPressed(th.field_d, TextHotspotBounds.field_m, ag.field_f, (byte) 88, this, param1, param2)) {
                    param3 = false;
                  }
                  if (((wh.field_f == 0)) &&
                    ((DiskCacheWorker.field_h != 0))) {
                    this.pointerReleased(rf.field_b, this, param2, BufferedSocket.field_k, 0, param1);
                    var9 = AwtRasterBuffer.field_a;
                    if (var9 != null) {
                      if (!(var9.field_p instanceof WidgetDropListener)) {
                        AwtRasterBuffer.field_a = null;
                      } else {
                        ((WidgetDropListener) (var9.field_p)).widgetDropped(var9, -10925, (DropTargetWidgetContainer) null);
                        AwtRasterBuffer.field_a = null;
                      }
                    }
                  }
                }
                break regionExit1;
              }
              this.handleWheel(78, fl.field_p, param1, this, param2, rf.field_b, BufferedSocket.field_k);
            }
            if (0 == th.field_d) {
              if (((wh.field_f == 0)) &&
                ((DiskCacheWorker.field_h != 0))) {
                this.pointerReleased(rf.field_b, this, param2, BufferedSocket.field_k, 0, param1);
                var11 = AwtRasterBuffer.field_a;
                if (var11 == null) {
                  if (((var7 != 0)) &&
                    ((var5 != 0)) &&
                    ((th.field_d != 0))) {
                    this.blur(102);
                  }
                } else {
                  if (!(var11.field_p instanceof WidgetDropListener)) {
                    AwtRasterBuffer.field_a = null;
                    if (((var7 != 0)) &&
                      ((var5 != 0)) &&
                      ((th.field_d != 0))) {
                      this.blur(102);
                    }
                  } else {
                    ((WidgetDropListener) (var11.field_p)).widgetDropped(var11, -10925, (DropTargetWidgetContainer) null);
                    AwtRasterBuffer.field_a = null;
                    if (((var7 != 0)) &&
                      ((var5 != 0)) &&
                      ((th.field_d != 0))) {
                      this.blur(102);
                    }
                  }
                }
              }
              break regionExit1;
            }
            if (!this.pointerPressed(th.field_d, TextHotspotBounds.field_m, ag.field_f, (byte) 88, this, param1, param2)) {
              if (var5 == 0) {
                if (((wh.field_f == 0)) &&
                  ((DiskCacheWorker.field_h != 0))) {
                  this.pointerReleased(rf.field_b, this, param2, BufferedSocket.field_k, 0, param1);
                  var12 = AwtRasterBuffer.field_a;
                  if (var12 == null) {
                    if (var7 != 0 &&
                      var5 != 0 &&
                      th.field_d != 0) {
                      this.blur(102);
                      break regionExit1;
                    }
                  } else {
                    if (!(var12.field_p instanceof WidgetDropListener)) {
                      AwtRasterBuffer.field_a = null;
                      if (var7 != 0 &&
                        var5 != 0 &&
                        th.field_d != 0) {
                        this.blur(102);
                      }
                    } else {
                      ((WidgetDropListener) (var12.field_p)).widgetDropped(var12, -10925, (DropTargetWidgetContainer) null);
                      AwtRasterBuffer.field_a = null;
                    }
                  }
                }
                break regionExit1;
              }
              this.blur(115);
              if (var7 != 0) {
                param3 = false;
              }
            } else {
              param3 = false;
            }
            if ((wh.field_f == 0) &&
              (DiskCacheWorker.field_h != 0)) {
              this.pointerReleased(rf.field_b, this, param2, BufferedSocket.field_k, 0, param1);
              var19 = AwtRasterBuffer.field_a;
              if (var19 != null) {
                if (!(var19.field_p instanceof WidgetDropListener)) {
                  AwtRasterBuffer.field_a = null;
                  if (var7 != 0 &&
                    var5 != 0 &&
                    th.field_d != 0) {
                    this.blur(102);
                    break regionExit1;
                  }
                } else {
                  ((WidgetDropListener) (var19.field_p)).widgetDropped(var19, -10925, (DropTargetWidgetContainer) null);
                  AwtRasterBuffer.field_a = null;
                  if (var7 != 0 &&
                    var5 != 0 &&
                    th.field_d != 0) {
                    this.blur(102);
                    break regionExit1;
                  }
                }
                break regionExit1;
              }
              if ((var7 != 0) && (var5 != 0 &&
                th.field_d != 0)) {
                this.blur(102);
              }
            }
          } else {
            if (var5 != 0 &&
              th.field_d != 0) {
              this.blur(102);
            }
          }
        }
        DiskCacheWorker.field_h = wh.field_f;
        StandardContentDialog.a(this.getTooltipText(0), true);
        return param3;
    }

    String getTooltipText(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return !this.field_w ? null : this.field_j;
    }

    void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        int var5_int = 0;
        UiWidget var6 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPointer(rf.field_b, param3, param0, (byte) -117, BufferedSocket.field_k) ? 1 : 0;
          stackIn_2_0 = this.field_w;
          if (var5_int != 0) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_8_1 = (var5_int != 0);
            this.field_w = stackIn_8_1;
            if (null != this.field_p &&
              this.field_p instanceof WidgetHoverListener) {
              ((WidgetHoverListener) (this.field_p)).onWidgetHoverChanged(this, var5_int != 0, 92);
            }
          }
          if (param1 > -6) {
            var6 = (UiWidget) null;
            this.handleWheel(67, 95, -96, (UiWidget) null, 27, -113, 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("mf.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    UiWidget(String param0, WidgetEventListener param1) {
        this(param0, FullscreenFocusCanvas.field_a.field_f, param1);
    }

    void drawWidget(int param0, int param1, int param2, int param3) {
        if (param2 >= -80) {
          return;
        }
        if (param1 != 0) {
          return;
        }
        if (null != this.field_n) {
          this.field_n.paintWidget((byte) 126, param3, param0, true, this);
          return;
        }
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.field_y = param3;
        this.field_C = param2;
        if (param1 == 34) {
          this.field_r = param0;
          this.field_u = param4;
          return;
        }
        UiWidget var7 = (UiWidget) null;
        this.pointerReleased(-106, (UiWidget) null, 9, 48, 115, -76);
        this.field_r = param0;
        this.field_u = param4;
    }

    final boolean containsPointer(int param0, int param1, int param2, byte param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param3 != -117) {
          UiWidget.clearStaticReferences(-121);
          if (this.field_u + param2 > param4) {
            return false;
          }
          if (param1 + this.field_r > param0) {
            return false;
          }
          if (this.field_y + (param2 + this.field_u) <= param4) {
            return false;
          }
          if (param0 >= this.field_C + (param1 + this.field_r)) {
            return false;
          }
          return true;
        }
        if (this.field_u + param2 > param4) {
          return false;
        }
        if (param1 + this.field_r > param0) {
          return false;
        }
        stackIn_18_0 = (this.field_y + (param2 + this.field_u) > param4) && (param0 < this.field_C + (param1 + this.field_r));
        return stackIn_18_0;
    }

    boolean isFocused(byte param0) {
        if (param0 != -67) {
          this.toString();
          return false;
        }
        return false;
    }

    final static void e(int param0) {
        ld.a("", (String) null, 0);
        if (param0 < 76) {
          pf var2 = (pf) null;
          UiWidget.a((pf) null, 89);
        }
    }

    final boolean beginDebugTreeEntry(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -3) {
            var6 = (StringBuilder) null;
            this.appendDebugProperties((Hashtable) null, (StringBuilder) null, 58, false);
          }
          if (param1.containsKey(this)) {
            discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param1.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mf.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 8308) {
          return -18;
        }
        if (param1 != 1) {
          return TextLineMetrics.field_f[param1];
        }
        if (sh.a(14222, param0)) {
          return 29;
        }
        return TextLineMetrics.field_f[param1];
    }

    int getMaximumRenderLayer(boolean param0) {
        if (!param0) {
          StringBuilder var3 = (StringBuilder) null;
          this.appendDebugTree((Hashtable) null, -62, (StringBuilder) null, -111);
          return 0;
        }
        return 0;
    }

    StringBuilder appendDebugTree(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.beginDebugTreeEntry(param1, param0, param2, -34)) {
            this.appendDebugProperties(param0, param2, param1, false);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mf.WA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("mf.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void drawAllLayers(boolean param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Chess.field_G;
        var4 = this.getMaximumRenderLayer(param0);
        var5_int = 0;
        while (var4 >= var5_int) {
          this.drawWidget(param1, var5_int, -84, param2);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = BufferedRandomAccessFile.d((byte) 60);
        if (!param0) {
          UiWidget.clearStaticReferences(118);
        }
        if (var5 == null) {
          return;
        }
        FullscreenFocusCanvas.field_a.a(var5, ModalDialogHost.field_S, 106, ProgressMessageDialog.field_Db);
    }

    protected UiWidget() {
        this.field_k = 0;
        this.field_A = 0;
    }

    UiWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        TextWidgetRenderer var4 = null;
        this.field_k = 0;
        this.field_A = 0;
        try {
          this.field_p = param2;
          this.field_v = param0;
          this.field_n = param1;
          if (this.field_n instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.field_n);
            this.field_y = var4.getPreferredWidth((byte) -119, this);
            this.field_C = var4.getPreferredHeight(true, this);
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        this.field_k = 0;
        this.field_A = 0;
        try {
          this.field_u = param0;
          this.field_n = param4;
          this.field_y = param2;
          this.field_C = param3;
          this.field_r = param1;
          this.field_p = param5;
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "mf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "Accept draw";
        field_B = "Please remove <%0> from your friend list first.";
        field_m = new hg(11, 0, 1, 2);
    }
}
