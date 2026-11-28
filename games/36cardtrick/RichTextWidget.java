/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveWidget {
    private TextHotspotBounds field_M;
    static boolean field_F;
    private IntrusiveDeque field_L;
    private String[] field_K;
    static de field_G;
    static String field_E;
    static ch field_H;
    static String[] field_I;
    static int field_J;

    final void setTextBounds(int param0, int param1, int param2, int param3) {
        int var5 = -42 % ((param0 + 14) / 33);
        this.setBounds(((TextWidgetRenderer) ((Object) this.field_v)).getPreferredHeight(-2, (UiWidget) (this)), param3, param1, param2, true);
    }

    boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 71) {
            return false;
          }
          this.field_L = (IntrusiveDeque) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void activateFromInput(int param0, boolean param1, int param2, int param3) {
        super.activateFromInput(param0, param1, param2, param3);
        int var5 = param3 - this.field_o;
        int var6 = -this.field_i + param0;
        TextHotspotBounds var7 = this.findHotspotAt(var6, (byte) 108, var5);
        if (var7 != null &&
          this.field_k != null) {
          ((TextHotspotListener) ((Object) this.field_k)).onTextHotspotActivated(param2, var7.field_g, (byte) 26, this);
        }
    }

    final void setHotspotTooltip(String param0, byte param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var4_int = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          if (this.field_K == null ||
            this.field_K.length <= param2) {
            var7 = new String[1 + param2];
            var4 = var7;
            if (this.field_K != null) {
              for (var5 = 0; var5 < this.field_K.length; var5++) {
                var7[var5] = this.field_K[var5];
              }
            }
            this.field_K = var4;
          }
          this.field_K[param2] = param0;
          var4_int = 117 % ((param1 + 22) / 38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("dg.GA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, boolean param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.rebuildHotspotBounds((byte) 5);
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_E = null;
        field_I = null;
        field_G = null;
        if (param0 >= -73) {
          return;
        }
        field_H = null;
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          return false;
        }
        return hh.field_g == DirectByteArrayStore.field_d ? true : false;
    }

    void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawWidget(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        TextWidgetRenderer var5 = (TextWidgetRenderer) ((Object) this.field_v);
        TextHotspotBounds var6 = this.field_M;
        if (var6 != null) {
          var7 = var5.getTextOriginX(param0, (byte) 90, (UiWidget) (this));
          var8 = var5.getTextOriginY((UiWidget) (this), -1815612287, param1);
          do {
            NetworkArchiveRequest.a(var8 + (var6.field_n - 2), 51, var6.field_j + 2, 2 + var6.field_k, -2 + (var7 + var6.field_i));
            var6 = var6.field_m;
          } while (var6 != null);
        }
    }

    final void rebuildHotspotBounds(byte param0) {
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
        int var7Lifetime1;
        var16 = Main.field_T;
        this.field_L = new IntrusiveDeque();
        if (param0 != 5) {
          return;
        }
        var2 = 0;
        var3 = (TextWidgetRenderer) ((Object) this.field_v);
        var4 = var3.getTextLayout((byte) -104, (UiWidget) (this));
        while (true) {
          var5 = this.field_r.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_r.indexOf(">", var5);
          var6 = this.field_r.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_r.indexOf("</hotspot>", var5);
          var8 = var4.getLineIndexForTextOffset(-13453, var5);
          var9 = var4.getLineIndexForTextOffset(-13453, var2);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_d[var11];
            if (var8 != var11) {
              stackIn_10_0 = var12.field_a[0];
            } else {
              stackIn_10_0 = var4.getXForTextOffset(true, var5);
            }
            var13 = stackIn_10_0;
            if (var11 != var9) {
              if (var12 == null) {
                stackIn_15_0 = 0;
              } else {
                stackIn_15_0 = var12.field_a[var12.field_a.length - 1];
              }
            } else {
              stackIn_15_0 = var4.getXForTextOffset(true, var2);
            }
            var14 = stackIn_15_0;
            var15 = new TextHotspotBounds(var7Lifetime1, var13, var12.field_b, var14 - var13, Math.max(var3.getFontLineHeight(param0 - 6), -var12.field_b + var12.field_c));
            if (var10 != null) {
              ((TextHotspotBounds) (var10)).field_m = var15;
            }
            var10 = var15;
            this.field_L.addLast(var15, 27362);
          }
        }
    }

    private final TextHotspotBounds findHotspotAt(int param0, byte param1, int param2) {
        TextHotspotBounds var4;
        TextHotspotBounds var5;
        int var6;
        var6 = Main.field_T;
        var4 = (TextHotspotBounds) (this.field_L.beginForward((byte) 74));
        if (param1 <= 97) {
          field_F = true;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_i &&
              param0 >= var5.field_n &&
              var5.field_j + var5.field_i > param2 &&
              param0 <= var5.field_n + var5.field_k) {
              return var4;
            }
            var5 = var5.field_m;
          }
          var4 = (TextHotspotBounds) (this.field_L.nextForward((byte) -122));
        }
        return null;
    }

    RichTextWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetEventListener) null);
        this.field_M = null;
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_M = null;
          if (this.field_j) {
            var5_int = -param1 + eg.field_b - this.field_o;
            var6 = -this.field_i + (ij.field_e - param0);
            this.field_M = this.findHotspotAt(var6, (byte) 116, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    String getTooltipText(byte param0) {
        if (param0 != -79) {
          return (String) null;
        }
        if (null == this.field_M) {
          return null;
        }
        if (null == this.field_K) {
          return null;
        }
        if (this.field_K.length <= this.field_M.field_g) {
          return null;
        }
        return this.field_K[this.field_M.field_g];
    }

    static {
        field_E = "Connection restored.";
        field_G = new de(14, 0, 4, 1);
        field_I = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
