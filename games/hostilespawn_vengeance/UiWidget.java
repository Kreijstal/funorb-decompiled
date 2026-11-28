/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    static int field_k;
    int field_v;
    int field_r;
    static float field_w;
    String field_i;
    int field_o;
    static String field_j;
    String field_n;
    WidgetEventListener field_p;
    static BufferedSocket field_t;
    int field_s;
    int field_m;
    TextLayout field_l;
    boolean field_u;
    int field_q;
    WidgetRenderer field_h;
    int field_x;

    boolean isFocused(int param0) {
        if (param0 != -9015) {
          this.processPointerInput(118, 53, false, -73);
          return false;
        }
        return false;
    }

    final static RgbSprite d(byte param0) {
        int var1;
        Object var3;
        int[] var5_ref_int__;
        int var5;
        int var6;
        int var7;
        int[] var9;
        byte[] var14;
        byte[] var15;
        byte[] var16;
        byte[] var17;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var1 = ConfirmedEmailAvailabilityValidator.field_r[0] * TextInputField.field_X[0];
        if (param0 >= 36) {
          regionExit1: {
            var17 = ja.field_e[0];
            if (qj.field_k[0]) {
              var16 = vh.field_a[0];
              var5_ref_int__ = new int[var1];
              var6 = 0;
              while (var6 < var1) {
                var5_ref_int__[var6] = ll.a(PcmOutputWorker.bitwiseAnd(255, (int) var16[var6]) << 24, bf.field_d[PcmOutputWorker.bitwiseAnd((int) var17[var6], 255)]);
                var6++;
                if (var7 == 0) {
                  continue;
                }
                break;
              }
              var3 = new ArgbSprite(ra.field_a, GameCanvas.field_e, th.field_Jb[0], LabeledWidgetContainer.field_O[0], TextInputField.field_X[0], ConfirmedEmailAvailabilityValidator.field_r[0], var5_ref_int__);
              if (var7 == 0) {
                break regionExit1;
              }
            }
            var9 = new int[var1];
            var5 = 0;
            while (var1 > var5) {
              var9[var5] = bf.field_d[PcmOutputWorker.bitwiseAnd((int) var17[var5], 255)];
              var5++;
              if (var7 == 0) {
                continue;
              }
              break;
            }
            var3 = new RgbSprite(ra.field_a, GameCanvas.field_e, th.field_Jb[0], LabeledWidgetContainer.field_O[0], TextInputField.field_X[0], ConfirmedEmailAvailabilityValidator.field_r[0], var9);
          }
        } else {
          regionExit2: {
            field_k = 78;
            var15 = ja.field_e[0];
            if (qj.field_k[0]) {
              var14 = vh.field_a[0];
              var5_ref_int__ = new int[var1];
              var6 = 0;
              while (var6 < var1) {
                var5_ref_int__[var6] = ll.a(PcmOutputWorker.bitwiseAnd(255, (int) var14[var6]) << 24, bf.field_d[PcmOutputWorker.bitwiseAnd((int) var15[var6], 255)]);
                var6++;
                if (var7 == 0) {
                  continue;
                }
                break;
              }
              var3 = new ArgbSprite(ra.field_a, GameCanvas.field_e, th.field_Jb[0], LabeledWidgetContainer.field_O[0], TextInputField.field_X[0], ConfirmedEmailAvailabilityValidator.field_r[0], var5_ref_int__);
              if (var7 == 0) {
                break regionExit2;
              }
            }
            var9 = new int[var1];
            var5 = 0;
            while (var1 > var5) {
              var9[var5] = bf.field_d[PcmOutputWorker.bitwiseAnd((int) var15[var5], 255)];
              var5++;
              if (var7 == 0) {
                continue;
              }
              break;
            }
            var3 = new RgbSprite(ra.field_a, GameCanvas.field_e, th.field_Jb[0], LabeledWidgetContainer.field_O[0], TextInputField.field_X[0], ConfirmedEmailAvailabilityValidator.field_r[0], var9);
          }
        }
        uj.d(121);
        return (RgbSprite) (var3);
    }

    final boolean processPointerInput(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var7;
        DraggableWidgetContainer var8;
        DraggableWidgetContainer var9;
        DraggableWidgetContainer var10;
        DraggableWidgetContainer var11;
        var7 = HostileSpawn.field_I ? 1 : 0;
        this.updatePointer(this, param0, 0, param3);
        var5 = this.isFocused(-9015) ? 1 : 0;
        if (!param2) {
          if (var5 == 0) {
            mn.field_c = EditableTextField.field_L;
            IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            UiWidget.d((byte) 54);
            return param2;
          }
          if (pf.field_o == 0) {
            mn.field_c = EditableTextField.field_L;
            IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            UiWidget.d((byte) 54);
            return param2;
          }
          this.blur((byte) -82);
          if (var7 == 0) {
            mn.field_c = EditableTextField.field_L;
            IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            UiWidget.d((byte) 54);
            return param2;
          }
        }
        if (ll.field_c != 0 &&
          var5 != 0) {
          this.handleWheel(rb.field_m, param0, param3, 0, this, j.field_c, ll.field_c);
        }
        if (pf.field_o == 0) {
          if (EditableTextField.field_L != 0) {
            mn.field_c = EditableTextField.field_L;
            IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            UiWidget.d((byte) 54);
            return param2;
          }
          if (mn.field_c == 0) {
            mn.field_c = EditableTextField.field_L;
            IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            UiWidget.d((byte) 54);
            return param2;
          }
          this.pointerReleased(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
          var11 = DiskArchiveRequest.field_D;
          if (var11 != null) {
            if (var11.field_p instanceof WidgetDropListener) {
              ((WidgetDropListener) (var11.field_p)).widgetDropped(var11, false, (DropTargetWidgetContainer) null);
            }
            DiskArchiveRequest.field_D = null;
          }
          mn.field_c = EditableTextField.field_L;
          IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          UiWidget.d((byte) 54);
          return param2;
        }
        if (this.pointerPressed(ec.field_a, param3, param0, rc.field_b, (byte) 110, this, pf.field_o)) {
          param2 = false;
          if (var7 == 0) {
            if (EditableTextField.field_L != 0) {
              mn.field_c = EditableTextField.field_L;
              IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              }
              UiWidget.d((byte) 54);
              return param2;
            }
            if (mn.field_c == 0) {
              mn.field_c = EditableTextField.field_L;
              IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              }
              UiWidget.d((byte) 54);
              return param2;
            }
            this.pointerReleased(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
            var8 = DiskArchiveRequest.field_D;
            if (var8 != null) {
              if (var8.field_p instanceof WidgetDropListener) {
                ((WidgetDropListener) (var8.field_p)).widgetDropped(var8, false, (DropTargetWidgetContainer) null);
              }
              DiskArchiveRequest.field_D = null;
            }
            mn.field_c = EditableTextField.field_L;
            IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            UiWidget.d((byte) 54);
            return param2;
          }
        }
        if (var5 != 0) {
          this.blur((byte) 47);
          if (EditableTextField.field_L == 0 &&
            mn.field_c != 0) {
            this.pointerReleased(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
            var10 = DiskArchiveRequest.field_D;
            if (var10 != null) {
              if (var10.field_p instanceof WidgetDropListener) {
                ((WidgetDropListener) (var10.field_p)).widgetDropped(var10, false, (DropTargetWidgetContainer) null);
                DiskArchiveRequest.field_D = null;
                mn.field_c = EditableTextField.field_L;
                IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
                if (param1 != 8799) {
                  UiWidget.d((byte) 54);
                }
                return param2;
              }
              DiskArchiveRequest.field_D = null;
            }
          }
          mn.field_c = EditableTextField.field_L;
          IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          UiWidget.d((byte) 54);
          return param2;
        }
        if (EditableTextField.field_L != 0) {
          mn.field_c = EditableTextField.field_L;
          IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          UiWidget.d((byte) 54);
          return param2;
        }
        if (mn.field_c == 0) {
          mn.field_c = EditableTextField.field_L;
          IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          UiWidget.d((byte) 54);
          return param2;
        }
        this.pointerReleased(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
        var9 = DiskArchiveRequest.field_D;
        if (var9 != null) {
          if (var9.field_p instanceof WidgetDropListener) {
            ((WidgetDropListener) (var9.field_p)).widgetDropped(var9, false, (DropTargetWidgetContainer) null);
          }
          DiskArchiveRequest.field_D = null;
        }
        mn.field_c = EditableTextField.field_L;
        IntrusiveNode.a(this.getTooltipText(34), (byte) -82);
        if (param1 == 8799) {
          return param2;
        }
        UiWidget.d((byte) 54);
        return param2;
    }

    final void drawAllLayers(int param0, int param1, byte param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var4 = this.getMaximumRenderLayer(0);
        var5_int = 0;
        while (var4 >= var5_int) {
          this.drawWidget(param1, param0, (byte) 116, var5_int);
          var5_int++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        var6 = 55 % ((87 - param2) / 35);
        var5 = ii.c((byte) 72);
        if (var5 != null) {
          gf.field_e.a(qh.field_q, var5, l.field_d, 94);
        }
    }

    public final String toString() {
        return this.appendDebugTree(122, new Hashtable(), 0, new StringBuilder()).toString();
    }

    void drawWidget(int param0, int param1, byte param2, int param3) {
        if (param2 <= 42) {
          this.field_x = 49;
          if (param3 == 0) {
            if (null != this.field_h) {
              this.field_h.paintWidget(param0, param1, 15430, this, true);
            }
            return;
          }
          return;
        }
        if (param3 != 0) {
          return;
        }
        if (null != this.field_h) {
          this.field_h.paintWidget(param0, param1, 15430, this, true);
          return;
        }
    }

    public static void d(int param0) {
        field_t = null;
        if (param0 != 5956) {
          UiWidget.d((byte) -93);
          field_j = null;
          return;
        }
        field_j = null;
    }

    UiWidget(String param0, WidgetEventListener param1) {
        this(param0, gf.field_e.field_h, param1);
    }

    final boolean beginDebugTreeEntry(StringBuilder param0, int param1, boolean param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            this.field_v = -27;
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
          stackIn_9_1 = new StringBuilder().append("ag.RA(");
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
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    boolean pointerPressed(int param0, int param1, int param2, int param3, byte param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.containsPointer(param3, param0, 255, param2, param1)) {
            this.field_r = param6;
          }
          if (param4 == 110) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ag.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean containsPointer(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 255) {
          return false;
        }
        if (param1 < param4 + this.field_v) {
          return false;
        }
        if (this.field_m + param3 > param0) {
          return false;
        }
        if (this.field_s + (this.field_v + param4) <= param1) {
          return false;
        }
        if (param0 < this.field_x + (this.field_m + param3)) {
          return true;
        }
        return false;
    }

    void blur(byte param0) {
        int var2 = -78 % ((param0 + 27) / 39);
    }

    final void refreshLayout(int param0) {
        this.setBounds(this.field_s, this.field_m, param0 ^ param0, this.field_v, this.field_x);
    }

    String getTooltipText(int param0) {
        if (param0 != 34) {
          this.field_s = 88;
          if (this.field_u) {
            return this.field_i;
          }
          return null;
        }
        if (this.field_u) {
          return this.field_i;
        }
        return null;
    }

    void pointerReleased(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        try {
          this.field_r = param5;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "ag.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    int getMaximumRenderLayer(int param0) {
        if (param0 != 0) {
          return -69;
        }
        return 0;
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 0) {
          this.field_m = param1;
          this.field_v = param3;
          this.field_s = param0;
          this.field_x = param4;
          return;
        }
        this.field_m = -30;
        this.field_m = param1;
        this.field_v = param3;
        this.field_s = param0;
        this.field_x = param4;
    }

    StringBuilder appendDebugTree(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(param3, param2, false, param1)) {
            this.appendDebugProperties(param2, param1, param3, 116);
          }
          if (param0 <= 73) {
            this.containsPointer(66, -8, -116, 93, -80);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ag.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    boolean takeFocus(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            return false;
          }
          this.field_l = (TextLayout) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ag.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 != 0) {
            return;
          }
          var5_int = this.containsPointer(rb.field_m, j.field_c, 255, param1, param3) ? 1 : 0;
          stackIn_5_0 = (this.field_u) ? 0 : 1;
          if (var5_int != 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_13_1 = (var5_int != 0);
            this.field_u = stackIn_13_1;
            if (null != this.field_p &&
              this.field_p instanceof WidgetHoverListener) {
              ((WidgetHoverListener) (this.field_p)).onWidgetHoverChanged(var5_int != 0, (byte) 98, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ag.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void appendDebugProperties(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_v).append(",").append(this.field_m).append(" ").append(this.field_s).append("x").append(this.field_x);
          if (this.field_n != null) {
            discarded$1 = param2.append(" text=\"").append(this.field_n).append('"');
          }
          if (this.field_u) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.isFocused(-9015)) {
            discarded$3 = param2.append(" focused");
          }
          var5_int = 99 % ((-49 - param3) / 58);
          if (null != this.field_h) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.field_h instanceof UiWidget)) {
              discarded$5 = param2.append(this.field_h);
              if (var6 != 0) {
                param2 = this.appendDebugTree(123, param1, 1 + param0, param2);
              }
            } else {
              param2 = this.appendDebugTree(123, param1, 1 + param0, param2);
            }
          }
          if (this.field_p != null) {
            discarded$6 = param2.append(" listener=");
            if (!(this.field_p instanceof UiWidget)) {
              discarded$7 = param2.append(this.field_p);
              if (var6 == 0) {
                return;
              }
            }
            param2 = this.appendDebugTree(97, param1, 1 + param0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ag.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handleWheel(int param0, int param1, int param2, int param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ag.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    protected UiWidget() {
        this.field_o = 0;
        this.field_q = 0;
    }

    UiWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        RuntimeException runtimeException = null;
        TextWidgetRenderer var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_q = 0;
        try {
          this.field_h = param1;
          this.field_p = param2;
          this.field_n = param0;
          if (this.field_h instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.field_h);
            this.field_s = var4.getPreferredWidth(false, this);
            this.field_x = var4.getPreferredHeight(this, (byte) -79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ag.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        this.field_o = 0;
        this.field_q = 0;
        try {
          this.field_m = param1;
          this.field_v = param0;
          this.field_x = param3;
          this.field_s = param2;
          this.field_p = param5;
          this.field_h = param4;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "ag.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    boolean handleKey(int param0, UiWidget param1, int param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 274) {
            return false;
          }
          this.field_u = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ag.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean processKeyInput(int param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (!this.isFocused(-9015)) {
          if (param2 != 80) {
            field_t = (BufferedSocket) null;
            var4 = param0;
            if (var4 == 80) {
              return this.takeFocus((byte) -93, this);
            }
            return false;
          }
          var4Lifetime3 = param0;
          if (var4Lifetime3 == 80) {
            return this.takeFocus((byte) -93, this);
          }
          return false;
        }
        if (this.handleKey(274, this, param0, param1)) {
          return true;
        }
        if (param2 != 80) {
          field_t = (BufferedSocket) null;
          var4Lifetime1 = param0;
          if (var4Lifetime1 == 80) {
            return this.takeFocus((byte) -93, this);
          }
          return false;
        }
        var4Lifetime2 = param0;
        if (var4Lifetime2 == 80) {
          return this.takeFocus((byte) -93, this);
        }
        return false;
    }

    static {
        field_k = -1;
        field_j = "Rating: <col=ffffff><%0>";
        field_w = 0.0f;
    }
}
