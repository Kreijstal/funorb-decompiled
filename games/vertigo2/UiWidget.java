/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    WidgetEventListener field_v;
    int y;
    int height;
    int field_A;
    boolean field_p;
    static PacketBuffer field_x;
    String field_q;
    int field_y;
    int x;
    WidgetListener listener;
    static String field_z;
    String text;
    int field_u;
    int width;
    TextLayout field_r;

    StringBuilder appendDebugTree(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(param3, -1, param1, param0)) {
            this.appendDebugProperties(param0, param3, true, param1);
          }
          if (param2 == -79) {
            stackIn_7_0 = (StringBuilder) (param3);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("iq.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean processKeyInput(int param0, int param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (this.isFocused(73)) {
          if (this.handleKey(param2, 13, param1, this)) {
            return true;
          }
          var4 = param1;
          if (var4 == 80) {
            return this.takeFocus((byte) 116, this);
          }
          if (param0 >= -84) {
            this.drawAllLayers(113, -23, 115);
            return false;
          }
          return false;
        }
        var4Lifetime1 = param1;
        if (var4Lifetime1 == 80) {
          return this.takeFocus((byte) 116, this);
        }
        if (param0 < -84) {
          return false;
        }
        this.drawAllLayers(113, -23, 115);
        return false;
    }

    final boolean containsPointer(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 0) {
          return true;
        }
        if (this.x + param2 > param3) {
          return false;
        }
        if (this.y + param1 > param4) {
          return false;
        }
        if (this.x + param2 + this.width <= param3) {
          return false;
        }
        if (param4 < this.height + this.y + param1) {
          return true;
        }
        return false;
    }

    final static int e(int param0) {
        if (param0 != 12343) {
          field_x = (PacketBuffer) null;
          return wp.field_a;
        }
        return wp.field_a;
    }

    final boolean processPointerInput(int param0, boolean param1, byte param2, int param3) {
        int var5;
        int var6;
        DraggableWidgetContainer var6_ref_qg;
        int var7;
        var7 = Vertigo2.field_L ? 1 : 0;
        this.updatePointer((byte) 12, param3, param0, this);
        var5 = this.isFocused(84) ? 1 : 0;
        regionExit1: {
          if (!param1) {
            if (var5 == 0) {
              break regionExit1;
            }
            if (0 == kf.field_c) {
              break regionExit1;
            }
            this.blur((byte) 2);
          }
          if (param1 ||
            var7 != 0) {
            if (uo.field_h != 0 &&
              var5 != 0) {
              this.handleWheel(PacketBuffer.field_n, uo.field_h, param3, param0, gb.field_d, (byte) -122, this);
              if (kf.field_c != 0) {
                if (!this.pointerPressed(ModalDialogHost.field_N, param3, param0, this, kf.field_c, (byte) -125, no.field_e)) {
                  this.blur((byte) 2);
                  if (var7 != 0) {
                    param1 = false;
                  }
                } else {
                  param1 = false;
                }
              }
            } else {
              if (kf.field_c != 0) {
                if (this.pointerPressed(ModalDialogHost.field_N, param3, param0, this, kf.field_c, (byte) -125, no.field_e)) {
                  param1 = false;
                } else {
                  if (var5 != 0) {
                    this.blur((byte) 2);
                    if (var7 != 0) {
                      param1 = false;
                    }
                  }
                }
              }
            }
            if (q.field_v == 0 &&
              ProxyAuthenticationRequiredException.field_c != 0) {
              this.pointerReleased(this, (byte) 46, param3, param0, PacketBuffer.field_n, gb.field_d);
              var6_ref_qg = ArrayWidgetContainer.field_E;
              if (var6_ref_qg != null) {
                if (var6_ref_qg.field_v instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var6_ref_qg.field_v)).widgetDropped(-13413, var6_ref_qg, (DropTargetWidgetContainer) null);
                }
                ArrayWidgetContainer.field_E = null;
              }
            }
          }
        }
        ProxyAuthenticationRequiredException.field_c = q.field_v;
        qc.a(this.getTooltipText(false), 74);
        var6 = 96 % ((4 - param2) / 50);
        return param1;
    }

    void updatePointer(byte param0, int param1, int param2, UiWidget param3) {
        int var5_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPointer(0, param2, param1, PacketBuffer.field_n, gb.field_d) ? 1 : 0;
          if (param0 < 6) {
            return;
          }
          if ((this.field_p ? 1 : 0) != var5_int) {
            stackIn_7_1 = (var5_int != 0);
            this.field_p = stackIn_7_1;
            if (this.field_v != null) {
              if (!(this.field_v instanceof WidgetHoverListener)) {
                return;
              }
              ((WidgetHoverListener) (this.field_v)).onWidgetHoverChanged(-19618, var5_int != 0, this);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("iq.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    boolean pointerPressed(int param0, int param1, int param2, UiWidget param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 > -107) {
            this.getMaximumRenderLayer((byte) 40);
          }
          if (!this.containsPointer(0, param2, param1, param0, param6)) {
            return false;
          }
          this.field_A = param4;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("iq.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13) {
            return false;
          }
          this.field_y = 82;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("iq.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 >= -60) {
          return;
        }
        TextHotspotBounds.a(1);
    }

    String getTooltipText(boolean param0) {
        if (!param0) {
          return !this.field_p ? null : this.field_q;
        }
        this.getMaximumRenderLayer((byte) 24);
        return !this.field_p ? null : this.field_q;
    }

    UiWidget(String param0, WidgetEventListener param1) {
        this(param0, eb.field_c.field_h, param1);
    }

    boolean takeFocus(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 116) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("iq.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void setBounds(boolean param0, int param1, int param2, int param3, int param4) {
        this.width = param4;
        this.y = param2;
        if (param0) {
          return;
        }
        this.x = param1;
        this.height = param3;
    }

    final void drawAllLayers(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6_int;
        String var6;
        int var7;
        var7 = Vertigo2.field_L ? 1 : 0;
        var4 = 50 / ((-5 - param1) / 34);
        var5 = this.getMaximumRenderLayer((byte) -109);
        var6_int = 0;
        while (var6_int <= var5) {
          this.drawWidget(false, var6_int, param0, param2);
          var6_int++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        var6 = ti.a((byte) -52);
        if (var6 != null) {
          eb.field_c.a(var6, -48, hn.field_n, rl.field_db);
        }
    }

    final void appendDebugProperties(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!param2) {
            this.beginDebugTreeEntry((StringBuilder) null, -88, 38, (Hashtable) null);
          }
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (null != this.text) {
            discarded$1 = param1.append(" text=\"").append(this.text).append('"');
          }
          if (this.field_p) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.isFocused(87)) {
            discarded$3 = param1.append(" focused");
          }
          if (this.listener != null) {
            discarded$4 = param1.append(" renderer=");
            if (this.listener instanceof UiWidget) {
              param1 = this.appendDebugTree(param0, param3 + 1, (byte) -79, param1);
              if (var6 != 0) {
                discarded$5 = param1.append(this.listener);
              }
            } else {
              discarded$5 = param1.append(this.listener);
            }
          }
          if (null != this.field_v) {
            discarded$6 = param1.append(" listener=");
            if (this.field_v instanceof UiWidget) {
              param1 = this.appendDebugTree(param0, param3 + 1, (byte) -79, param1);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param1.append(this.field_v);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("iq.CB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean beginDebugTreeEntry(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            this.y = 80;
          }
          if (param3.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("iq.HB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void refreshLayout(int param0) {
        this.setBounds(false, this.x, this.y, this.height, this.width);
        if (param0 > -51) {
          this.drawAllLayers(44, 60, -37);
        }
    }

    public final String toString() {
        return this.appendDebugTree(new Hashtable(), 0, (byte) -79, new StringBuilder()).toString();
    }

    void drawWidget(boolean param0, int param1, int param2, int param3) {
        if (param1 == 0) {
          if (null == this.listener) {
            if (param0) {
              UiWidget.e(-54);
              return;
            }
            return;
          }
          this.listener.paintWidget(true, param2, true, this, param3);
        }
        if (!param0) {
          return;
        }
        UiWidget.e(-54);
    }

    boolean isFocused(int param0) {
        if (param0 <= 3) {
          this.field_q = (String) null;
          return false;
        }
        return false;
    }

    void pointerReleased(UiWidget param0, byte param1, int param2, int param3, int param4, int param5) {
        try {
          if (param1 != 46) {
            this.drawAllLayers(-119, -76, -10);
          }
          this.field_A = 0;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "iq.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        field_x = null;
        if (param0 != -73) {
          UiWidget.e(106);
          field_z = null;
          return;
        }
        field_z = null;
    }

    final static boolean b(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 84) {
            stackIn_6_0 = (null != or.a(118, param0));
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("iq.DB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    int getMaximumRenderLayer(byte param0) {
        if (param0 >= -97) {
          return 84;
        }
        return 0;
    }

    final static int a(int param0, s param1, int param2, vi param3) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_29_0Lifetime1;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != null &&
            param1.field_n != null &&
            param3 != null &&
            param1.field_p == param3.field_v) {
            if (param2 != -1) {
              stackIn_10_0 = -80;
              return stackIn_10_0;
            }
            var4_int = param3.field_o.length;
            var5 = param1.field_n[param0].length / var4_int;
            var6 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var5 <= var6))) {
              stackIn_32_0 = compareLongs(param3.field_r, param1.field_w[param0][var6]);
              if (var8 == 0) {
                if (stackIn_32_0 == 0 &&
                  PasswordValidator.a(param1.field_x[param0][var6], true)) {
                  var7 = 0;
                  while (true) {
                    if (var7 < var4_int) {
                      stackIn_29_0 = ~param3.field_o[var7];
                      if (stackIn_29_0 != ~param1.field_n[param0][var4_int * var6 + var7]) {
                        break;
                      }
                      var7++;
                      continue;
                    }
                    stackIn_29_0Lifetime1 = var6;
                    return stackIn_29_0Lifetime1;
                  }
                }
                var6++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_32_0 = -1;
            }
            return stackIn_32_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_35_0 = var4;
          stackIn_35_1 = new StringBuilder().append("iq.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    void blur(byte param0) {
        if (param0 != 2) {
          field_z = (String) null;
        }
    }

    boolean handleWheel(int param0, int param1, int param2, int param3, int param4, byte param5, UiWidget param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 3 % ((param5 + 87) / 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("iq.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    protected UiWidget() {
        this.field_y = 0;
        this.field_u = 0;
    }

    UiWidget(String param0, WidgetListener param1, WidgetEventListener param2) {
        TextWidgetRenderer var4 = null;
        this.field_y = 0;
        this.field_u = 0;
        try {
          this.listener = param1;
          this.field_v = param2;
          this.text = param0;
          if (this.listener instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.listener);
            this.width = var4.getPreferredWidth(this, (byte) 112);
            this.height = var4.getPreferredHeight(this, -1);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "iq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetListener param4, WidgetEventListener param5) {
        this.field_y = 0;
        this.field_u = 0;
        try {
          this.height = param3;
          this.x = param0;
          this.field_v = param5;
          this.width = param2;
          this.listener = param4;
          this.y = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "iq.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new PacketBuffer(256);
        field_z = "???";
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
