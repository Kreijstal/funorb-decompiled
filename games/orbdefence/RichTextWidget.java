/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveWidget {
    static String field_J;
    static int field_O;
    static boolean field_G;
    private String[] field_K;
    static String field_L;
    private TextHotspotBounds field_H;
    static String[] field_N;
    private IntrusiveDeque field_I;
    static fk field_M;

    final void setTextBounds(int param0, byte param1, int param2, int param3) {
        if (param1 != 53) {
          return;
        }
        this.setBounds(param3, param0, ((TextWidgetRenderer) ((Object) this.field_j)).getPreferredHeight((UiWidget) (this), true), (byte) -90, param2);
    }

    final void setBounds(int param0, int param1, int param2, byte param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.rebuildHotspotBounds((byte) -127);
    }

    RichTextWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetEventListener) null);
        this.field_H = null;
        try {
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setHotspotTooltip(int param0, String param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != 2) {
            return;
          }
          if (null == this.field_K ||
            this.field_K.length <= param0) {
            var7 = new String[param0 + 1];
            var8 = var7;
            var4 = var8;
            if (null != this.field_K) {
              for (var5 = 0; var5 < this.field_K.length; var5++) {
                var7[var5] = this.field_K[var5];
              }
            }
            this.field_K = var8;
          }
          this.field_K[param0] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("te.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void rebuildHotspotBounds(byte param0) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        TextWidgetRenderer var3;
        TextLayout var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        TextLineMetrics var12;
        int var13;
        int var14;
        TextHotspotBounds var15;
        int var16;
        UiWidget var17;
        int var7Lifetime1;
        var16 = OrbDefence.field_D ? 1 : 0;
        this.field_I = new IntrusiveDeque();
        var2 = 0;
        var3 = (TextWidgetRenderer) ((Object) this.field_j);
        var4 = var3.getTextLayout((UiWidget) (this), true);
        while (true) {
          var5 = this.field_l.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            if (param0 != -127) {
              var17 = (UiWidget) null;
              this.takeFocus(-25, (UiWidget) null);
            }
            return;
          }
          var7 = this.field_l.indexOf(">", var5);
          var6 = this.field_l.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_l.indexOf("</hotspot>", var5);
          var8 = var4.getLineIndexForTextOffset(var5, (byte) 107);
          var9 = var4.getLineIndexForTextOffset(var2, (byte) 107);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_c[var11];
            if (var11 != var8) {
              stackIn_7_0 = var12.field_g[0];
            } else {
              stackIn_7_0 = var4.getXForTextOffset(param0 ^ 12, var5);
            }
            var13 = stackIn_7_0;
            if (var9 != var11) {
              if (var12 != null) {
                stackIn_12_0 = var12.field_g[var12.field_g.length - 1];
              } else {
                stackIn_12_0 = 0;
              }
            } else {
              stackIn_12_0 = var4.getXForTextOffset(param0 + 32, var2);
            }
            var14 = stackIn_12_0;
            var15 = new TextHotspotBounds(var7Lifetime1, var13, var12.field_f, -var13 + var14, Math.max(var3.getFontLineHeight((byte) -128), -var12.field_f + var12.field_c));
            if (var10 != null) {
              ((TextHotspotBounds) (var10)).field_p = var15;
            }
            this.field_I.addLast(-92, var15);
            var10 = var15;
          }
        }
    }

    final static int j(int param0) {
        if (param0 != 2) {
          RichTextWidget.releaseDeclaredStaticReferences(-128);
        }
        return LabeledWidgetContainer.field_H;
    }

    void drawWidget(int param0, int param1, int param2, int param3) {
        TextHotspotBounds discarded$0 = null;
        int var7 = 0;
        int var8 = 0;
        super.drawWidget(param0, param1, param2 + 0, param3);
        if (param2 != 1048575) {
          discarded$0 = this.findHotspotAt(-110, 35, 78);
        }
        if (param1 != 0) {
          return;
        }
        TextWidgetRenderer var9 = (TextWidgetRenderer) ((Object) this.field_j);
        TextHotspotBounds var6 = this.field_H;
        if (var6 == null) {
        } else {
          var7 = var9.getTextOriginX((UiWidget) (this), param3, (byte) 54);
          var8 = var9.getTextOriginY((UiWidget) (this), 9534, param0);
          do {
            wh.a(var6.field_s + 2, false, -2 + var7 + var6.field_o, var6.field_n + 2, -2 + var8 + var6.field_g);
            var6 = var6.field_p;
          } while (var6 != null);
        }
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_H = null;
          if (this.field_t) {
            var5_int = ua.field_a - param2 - this.field_s;
            var6 = DiskCacheWorker.field_d - param3 - this.field_n;
            this.field_H = this.findHotspotAt(-2, var6, var5_int);
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -81) {
            this.activateFromInput(-120, 119, 43, -76);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("te.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    String getTooltipText(int param0) {
        if (param0 != -8235) {
          return (String) null;
        }
        if (this.field_H == null) {
          return null;
        }
        if (this.field_K == null) {
          return null;
        }
        if (this.field_K.length <= this.field_H.field_q) {
          return null;
        }
        return this.field_K[this.field_H.field_q];
    }

    private final TextHotspotBounds findHotspotAt(int param0, int param1, int param2) {
        TextHotspotBounds var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        TextHotspotBounds var4 = (TextHotspotBounds) (this.field_I.beginForward((byte) -22));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_o &&
              (var5.field_g <= param1 && var5.field_s + var5.field_o > param2) &&
              !(var5.field_g + var5.field_n < param1)) {
              return var4;
            }
            var5 = var5.field_p;
          }
          var4 = (TextHotspotBounds) (this.field_I.nextForward(param0 ^ -853));
        }
        if (param0 == -2) {
          return null;
        }
        field_L = (String) null;
        return null;
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_N = null;
        field_J = null;
        field_M = null;
        if (param0 != -3213) {
          RichTextWidget.releaseDeclaredStaticReferences(-125);
        }
        field_L = null;
    }

    final void activateFromInput(int param0, int param1, int param2, int param3) {
        super.activateFromInput(param0 ^ 0, param1, param2, param3);
        if (param0 != 84) {
          this.setTextBounds(93, (byte) 51, 88, -37);
        }
        int var5 = -this.field_s + param3;
        int var6 = -this.field_n + param1;
        TextHotspotBounds var7 = this.findHotspotAt(param0 ^ -86, var6, var5);
        if (var7 != null &&
          null != this.field_h) {
          ((TextHotspotListener) ((Object) this.field_h)).onTextHotspotActivated(param2, var7.field_q, (byte) 101, this);
        }
    }

    static {
        field_J = "to return to the normal view.";
        field_G = false;
        field_N = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_L = "Please enter your age in years";
        field_M = new fk(0);
    }
}
