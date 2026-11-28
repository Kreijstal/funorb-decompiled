/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveWidget {
    static rh field_K;
    static String field_L;
    static int field_P;
    private TextHotspotBounds field_N;
    static boolean field_Q;
    private IntrusiveDeque field_R;
    private String[] field_M;
    static String[] field_O;

    void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 < 25) {
            return;
          }
          super.updatePointer(param0, param1, param2, 104);
          this.field_N = null;
          if (this.field_s) {
            var5_int = -this.x - param2 + ef.field_j;
            var6 = MouseWheelInput.field_b - param1 - this.y;
            this.field_N = this.findHotspotAt(2, var5_int, var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("vj.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final TextHotspotBounds findHotspotAt(int param0, int param1, int param2) {
        TextHotspotBounds var4;
        TextHotspotBounds var5;
        int var6;
        var6 = Terraphoenix.field_V;
        var4 = (TextHotspotBounds) (this.field_R.beginBackward(9272));
        if (param0 != 2) {
          field_K = (rh) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_n <= param1 &&
              var5.field_o <= param2 &&
              var5.field_q + var5.field_n > param1 &&
              param2 <= var5.field_o + var5.field_h) {
              return var4;
            }
            var5 = var5.field_j;
          }
          var4 = (TextHotspotBounds) (this.field_R.nextBackward((byte) -119));
        }
        return null;
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Terraphoenix.field_V;
        try {
          for (var1_int = param0; 21 > var1_int; var1_int++) {
            od.field_c[var1_int] = new re(var1_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var1), "vj.G(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, byte param2) {
        String[] var5 = null;
        int var6 = 0;
        int var7 = Terraphoenix.field_V;
        try {
          int var4_int = 100 % ((param2 - 80) / 45);
          if (this.field_M == null ||
            this.field_M.length <= param0) {
            var5 = new String[1 + param0];
            if (null != this.field_M) {
              for (var6 = 0; var6 < this.field_M.length; var6++) {
                var5[var6] = this.field_M[var6];
              }
            }
            this.field_M = var5;
          }
          this.field_M[param0] = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "vj.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    boolean takeFocus(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 2) {
            RichTextWidget.a(103);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != -24517) {
          field_L = (String) null;
        }
        AlphaWidgetContainer.field_I.closeAllDialogs(false);
        if (null == vi.field_n) {
          vi.field_n = new na(AlphaWidgetContainer.field_I, PcmResampler.field_e);
        }
        AlphaWidgetContainer.field_I.showDialog((UiWidget) (vi.field_n), (byte) -1);
    }

    final void rebuildHotspotBounds(boolean param0) {
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
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
        String var17;
        int var7Lifetime1;
        var16 = Terraphoenix.field_V;
        this.field_R = new IntrusiveDeque();
        if (!param0) {
          var17 = (String) null;
          this.a(-95, (String) null, (byte) -110);
        }
        var2 = 0;
        var3 = (TextWidgetRenderer) ((Object) this.listener);
        var4 = var3.getTextLayout((UiWidget) (this), -19302);
        while (true) {
          var5 = this.text.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.text.indexOf(">", var5);
          var6 = this.text.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.text.indexOf("</hotspot>", var5);
          var8 = var4.getLineIndexForTextOffset(var5, 0);
          var9 = var4.getLineIndexForTextOffset(var2, 0);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_f[var11];
            if (var8 != var11) {
              stackIn_10_0 = var12.field_d[0];
            } else {
              stackIn_10_0 = var4.getXForTextOffset(var5, 0);
            }
            var13 = stackIn_10_0;
            if (var9 == var11) {
              stackIn_15_0 = var4.getXForTextOffset(var2, 0);
            } else {
              if (var12 != null) {
                stackIn_15_0 = var12.field_d[var12.field_d.length - 1];
              } else {
                stackIn_15_0 = 0;
              }
            }
            var14 = stackIn_15_0;
            var15 = new TextHotspotBounds(var7Lifetime1, var13, var12.field_e, var14 - var13, Math.max(var3.getFontLineHeight(8233), -var12.field_e + var12.field_a));
            if (var10 != null) {
              ((TextHotspotBounds) (var10)).field_j = var15;
            }
            this.field_R.addFirst(var15, -16611);
            var10 = var15;
          }
        }
    }

    final void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 45) {
          return;
        }
        super.setBounds(param0, (byte) 117, param2, param3, param4);
        this.rebuildHotspotBounds(true);
    }

    String getTooltipText(int param0) {
        if (param0 <= 70) {
          field_K = (rh) null;
        }
        if (this.field_N == null) {
          return null;
        }
        if (null == this.field_M) {
          return null;
        }
        if (this.field_N.field_i >= this.field_M.length) {
          return null;
        }
        return this.field_M[this.field_N.field_i];
    }

    RichTextWidget(String param0, WidgetActionListener param1) {
        super(param0, (WidgetEventListener) null);
        this.field_N = null;
        try {
          this.listener = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawWidget(param0, -121, param2, param3);
        if (0 != param2) {
          return;
        }
        if (param1 > -106) {
          this.field_N = (TextHotspotBounds) null;
        }
        TextWidgetRenderer var9 = (TextWidgetRenderer) ((Object) this.listener);
        TextHotspotBounds var6 = this.field_N;
        if (var6 == null) {
        } else {
          var7 = var9.getTextOriginX((UiWidget) (this), -37, param0);
          var8 = var9.getTextOriginY((UiWidget) (this), param3, (byte) -72);
          do {
            ed.a(var6.field_q + 2, var6.field_h + 2, var8 + (var6.field_o - 2), 52, var7 - (-var6.field_n + 2));
            var6 = var6.field_j;
          } while (var6 != null);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.setBounds(param0, (byte) 88, param3, param2, ((TextWidgetRenderer) ((Object) this.listener)).getPreferredHeight((UiWidget) (this), (byte) 112));
        if (param1 >= -4) {
          field_L = (String) null;
        }
    }

    public static void h(int param0) {
        field_L = null;
        if (param0 != -32015) {
          RichTextWidget.a(true, false, -10, (byte) -18, -113);
        }
        field_O = null;
        field_K = null;
    }

    final static Archive a(boolean param0, boolean param1, int param2, byte param3, int param4) {
        if (param3 != 62) {
          field_L = (String) null;
        }
        return jg.a(30, param4, false, param0, param2, param1);
    }

    final void activateFromInput(int param0, int param1, byte param2, int param3) {
        super.activateFromInput(param0, param1, param2, param3);
        int var5 = param3 - this.x;
        int var6 = -this.y + param0;
        TextHotspotBounds var7 = this.findHotspotAt(param2 + 4, var5, var6);
        if (var7 != null &&
          this.field_r != null) {
          ((TextHotspotListener) ((Object) this.field_r)).onTextHotspotActivated((byte) -85, this, param1, var7.field_i);
        }
    }

    static {
        field_L = "Orb coins: <%0>";
        field_O = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_K = new rh(0, 2, 2, 1);
    }
}
