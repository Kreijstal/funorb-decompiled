/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends UiFocusableComponent {
    static String field_C;
    private TextHotspotRegion hoveredHotspot;
    private IntrusiveDeque hotspots;
    static String field_G;
    private String[] hotspotTooltips;
    static IntrusiveDeque field_E;

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.rebuildHotspots((byte) 122);
    }

    final void fireAction(int param0, int param1, int param2, int param3) {
        super.fireAction(param0, param1, param2 + 0, param3);
        int var5 = param1 - this.x;
        int var6 = param3 - this.y;
        TextHotspotRegion var7 = this.findHotspot(var5, var6, param2 ^ param2);
        if (var7 != null &&
          null != this.listener) {
          ((UiHotspotListener) ((Object) this.listener)).onHotspotClicked(-1, param0, var7.id, this);
        }
    }

    String getTooltip(byte param0) {
        if (null == this.hoveredHotspot) {
          return null;
        }
        if (null == this.hotspotTooltips) {
          return null;
        }
        if (this.hoveredHotspot.id >= this.hotspotTooltips.length) {
          return null;
        }
        if (param0 != 125) {
          return (String) null;
        }
        return this.hotspotTooltips[this.hoveredHotspot.id];
    }

    private final TextHotspotRegion findHotspot(int param0, int param1, int param2) {
        TextHotspotRegion var4;
        TextHotspotRegion var5;
        int var6;
        var6 = VoidHunters.field_G;
        var4 = (TextHotspotRegion) (this.hotspots.first(param2 + param2));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param0 >= var5.x &&
              var5.y <= param1 &&
              var5.width + var5.x > param0 &&
              var5.y + var5.height >= param1) {
              return var4;
            }
            var5 = var5.continuation;
          }
          var4 = (TextHotspotRegion) (this.hotspots.next((byte) 95));
        }
        return null;
    }

    HotspotTextWidget(String param0, UiRenderer param1) {
        super(param0, (UiListener) null);
        this.hoveredHotspot = null;
        try {
          this.renderer = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void fitTextBounds(int param0, int param1, int param2, byte param3) {
        if (param3 != -23) {
          UiComponent var6 = (UiComponent) null;
          this.requestFocus(110, (UiComponent) null);
        }
        this.setBounds(param2, param0, ((UiTextRenderer) ((Object) this.renderer)).getPreferredHeight((UiComponent) (this), (byte) 81), 1, param1);
    }

    final void setHotspotTooltip(int param0, int param1, String param2) {
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        try {
          if (null == this.hotspotTooltips ||
            param0 >= this.hotspotTooltips.length) {
            var7 = new String[param0 + 1];
            var8 = var7;
            String[] var4 = var8;
            if (this.hotspotTooltips != null) {
              for (var5 = 0; this.hotspotTooltips.length > var5; var5++) {
                var7[var5] = this.hotspotTooltips[var5];
              }
            }
            this.hotspotTooltips = var8;
          }
          if (param1 != -1) {
            this.setBounds(87, 68, 4, -44, 106);
          }
          this.hotspotTooltips[param0] = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kja.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    boolean requestFocus(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_G = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kja.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.hoveredHotspot = null;
          if (this.hovered) {
            var5_int = -this.x + PlayerGameData.field_b - param1;
            var6 = -param0 + (OpenGlFaceAttachment.field_b - this.y);
            this.hoveredHotspot = this.findHotspot(var5_int, var6, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kja.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawLayer(param0, param1, 52, param3);
        if (0 != param1) {
          return;
        }
        if (param2 < 47) {
          return;
        }
        UiTextRenderer var9 = (UiTextRenderer) ((Object) this.renderer);
        TextHotspotRegion var6 = this.hoveredHotspot;
        if (var6 == null) {
        } else {
          var7 = var9.getTextOriginX(0, param0, (UiComponent) (this));
          var8 = var9.getTextOriginY(-3, param3, (UiComponent) (this));
          do {
            SetCountermeasureLauncherRandomness.drawDottedFocusRectangle(var6.y + var8 - 2, var6.width + 2, var7 + var6.x - 2, 2 + var6.height, (byte) -90);
            var6 = var6.continuation;
          } while (var6 != null);
        }
    }

    final void rebuildHotspots(byte param0) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        UiTextRenderer var3;
        TextLayout var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        TextLayoutLine var12;
        int var13;
        int var14;
        TextHotspotRegion var15;
        int var16;
        int var7Lifetime1;
        var16 = VoidHunters.field_G;
        this.hotspots = new IntrusiveDeque();
        var2 = 0;
        var3 = (UiTextRenderer) ((Object) this.renderer);
        var4 = var3.getTextLayout((UiComponent) (this), 3);
        while (true) {
          var5 = this.text.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            if (param0 <= 110) {
              this.hotspotTooltips = (String[]) null;
            }
            return;
          }
          var7 = this.text.indexOf(">", var5);
          var6 = this.text.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.text.indexOf("</hotspot>", var5);
          var8 = var4.getLineIndexForCaret(true, var5);
          var9 = var4.getLineIndexForCaret(true, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.lines[var11];
            if (var11 != var8) {
              stackIn_7_0 = var12.caretXs[0];
            } else {
              stackIn_7_0 = var4.getCaretX(var5, -125);
            }
            var13 = stackIn_7_0;
            if (var9 != var11) {
              if (var12 == null) {
                stackIn_12_0 = 0;
              } else {
                stackIn_12_0 = var12.caretXs[-1 + var12.caretXs.length];
              }
            } else {
              stackIn_12_0 = var4.getCaretX(var2, -114);
            }
            var14 = stackIn_12_0;
            var15 = new TextHotspotRegion(var7Lifetime1, var13, var12.top, var14 - var13, Math.max(var3.getLineHeight(124), -var12.top + var12.bottom));
            if (var10 != null) {
              ((TextHotspotRegion) (var10)).continuation = var15;
            }
            this.hotspots.addLast(-10258, var15);
            var10 = var15;
          }
        }
    }

    public static void clearSharedReferences(int param0) {
        field_G = null;
        field_E = null;
        field_C = null;
        int var1 = 34 % ((param0 - 20) / 47);
    }

    static {
        field_C = "Software";
        field_G = "Spawn Nebula";
    }
}
