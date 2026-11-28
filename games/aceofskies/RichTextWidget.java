/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveWidget {
    private IntrusiveDeque field_x;
    private TextHotspotBounds field_z;
    static int instructionPage;
    private String[] field_y;

    final void a(int param0, String param1, int param2) {
        String stackIn_15_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var4_int = -56 / ((param0 - 14) / 53);
          if (this.field_y == null ||
            param2 >= this.field_y.length) {
            String[] var5 = new String[param2 + 1];
            if (null != this.field_y) {
              for (int var6 = 0; this.field_y.length > var6; var6++) {
                var5[var6] = this.field_y[var6];
              }
            }
            this.field_y = var5;
          }
          this.field_y[param2] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_14_0 = runtimeException;
          StringBuilder stackIn_14_1 = new StringBuilder().append("vq.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        this.setBounds(((TextWidgetRenderer) ((Object) this.field_e)).getPreferredHeight(param3 + 2147483537, (UiWidget) (this)), param0, param1, param2, (byte) 124);
        if (param3 != 110) {
          this.drawWidget((byte) -98, -99, -83, 107);
        }
    }

    void drawWidget(byte param0, int param1, int param2, int param3) {
        super.drawWidget((byte) 109, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        TextWidgetRenderer var9 = (TextWidgetRenderer) ((Object) this.field_e);
        TextHotspotBounds var6 = this.field_z;
        if (var6 != null) {
          int var7 = var9.getTextOriginX(param3, (UiWidget) (this), (byte) -128);
          int var8 = var9.getTextOriginY(param2, false, (UiWidget) (this));
          do {
            TextLineMetrics.a(var8 + (var6.field_g - 2), var6.field_e + 2, 2 + var6.field_h, var7 + var6.field_i - 2, 112);
            var6 = var6.field_f;
          } while (var6 != null);
        }
        if (param0 < 64) {
          this.setBounds(-83, 88, 88, -90, (byte) 51);
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, byte param4) {
        super.setBounds(param0, param1, param2, param3, (byte) 127);
        if (param4 <= 122) {
          return;
        }
        this.rebuildHotspotBounds((byte) -67);
    }

    final void activateFromInput(int param0, int param1, int param2, int param3) {
        super.activateFromInput(param0, param1, param2, param3);
        int var5 = param1 - this.field_p;
        int var6 = -this.field_h + param3;
        TextHotspotBounds var7 = this.findHotspotAt(var6, 0, var5);
        if (var7 != null &&
          this.field_o != null) {
          ((TextHotspotListener) ((Object) this.field_o)).onTextHotspotActivated((byte) -73, param2, this, var7.field_k);
        }
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        String stackIn_9_2 = null;
        try {
          super.updatePointer((byte) 53, param1, param2, param3);
          this.field_z = null;
          if (this.field_g) {
            int var5_int = ic.field_b - (param3 + this.field_p);
            int var6 = -this.field_h + (cf.field_g - param2);
            this.field_z = this.findHotspotAt(var6, 0, var5_int);
          }
          if (param0 < 13) {
            UiWidget var7 = (UiWidget) null;
            this.updatePointer((byte) 11, (UiWidget) null, -123, 59);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vq.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void rebuildHotspotBounds(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var16 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_x = new IntrusiveDeque();
        int var2 = 0;
        TextWidgetRenderer var3 = (TextWidgetRenderer) ((Object) this.field_e);
        if (param0 != -67) {
          return;
        }
        TextLayout var4 = var3.getTextLayout((byte) 66, (UiWidget) (this));
        while (true) {
          int var5 = this.field_f.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          int var7 = this.field_f.indexOf(">", var5);
          String var6 = this.field_f.substring(var5 + 9, var7);
          int var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_f.indexOf("</hotspot>", var5);
          int var8 = var4.getLineIndexForTextOffset(1, var5);
          int var9 = var4.getLineIndexForTextOffset(1, var2);
          Object var10 = null;
          for (int var11 = var8; var11 <= var9; var11++) {
            TextLineMetrics var12 = var4.field_b[var11];
            if (var8 == var11) {
              stackIn_9_0 = var4.getXForTextOffset(var5, -122);
            } else {
              stackIn_9_0 = var12.field_h[0];
            }
            int var13 = stackIn_9_0;
            if (var9 == var11) {
              stackIn_14_0 = var4.getXForTextOffset(var2, -114);
            } else if (var12 != null) {
              stackIn_14_0 = var12.field_h[-1 + var12.field_h.length];
            } else {
              stackIn_14_0 = 0;
            }
            int var14 = stackIn_14_0;
            TextHotspotBounds var15 = new TextHotspotBounds(var7Lifetime1, var13, var12.field_f, -var13 + var14, Math.max(var3.getFontLineHeight(-4), var12.field_d - var12.field_f));
            if (var10 != null) {
              ((TextHotspotBounds) (var10)).field_f = var15;
            }
            var10 = var15;
            this.field_x.addLast(66, var15);
          }
        }
    }

    private final TextHotspotBounds findHotspotAt(int param0, int param1, int param2) {
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param1 != 0) {
          String var7 = (String) null;
          this.a(-112, (String) null, -74);
        }
        TextHotspotBounds var4 = (TextHotspotBounds) (this.field_x.first(268435455));
        while (var4 != null) {
          TextHotspotBounds var5 = var4;
          while (var5 != null) {
            if (var5.field_i <= param2 &&
              var5.field_g <= param0 &&
              var5.field_h + var5.field_i > param2 &&
              var5.field_g + var5.field_e >= param0) {
              return var4;
            }
            var5 = var5.field_f;
          }
          var4 = (TextHotspotBounds) (this.field_x.next((byte) 103));
        }
        return null;
    }

    String getTooltipText(byte param0) {
        if (param0 >= -41) {
          return (String) null;
        }
        if (this.field_z == null) {
          return null;
        }
        if (this.field_y == null) {
          return null;
        }
        if (this.field_y.length <= this.field_z.field_k) {
          return null;
        }
        return this.field_y[this.field_z.field_k];
    }

    boolean takeFocus(UiWidget param0, byte param1) {
        String stackIn_8_2 = null;
        try {
          if (param1 == -42) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("vq.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    RichTextWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetEventListener) null);
        this.field_z = null;
        try {
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "vq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        instructionPage = 0;
    }
}
