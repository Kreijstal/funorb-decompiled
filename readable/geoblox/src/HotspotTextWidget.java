/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends ButtonWidget {
    static byte[][] decodedSpriteAlpha;
    static Sprite spriteScratchRaster;
    static ByteArrayBuffer field_I;
    private TextHotspotBounds hoveredHotspot;
    private String[] hotspotHoverTexts;
    static Sprite[] avatarCryBeginFrames;
    static boolean field_K;
    private IntrusiveDeque hotspotBounds;

    final void activateButton(int buttonY, int methodGuard, int buttonX, int pointerButton) {
        super.activateButton(buttonY, methodGuard, buttonX, pointerButton);
        int relativeButtonX = -this.widgetX + buttonX;
        int relativeButtonY = buttonY - this.widgetY;
        TextHotspotBounds hitRecord = this.findHotspot((byte) -114, relativeButtonY, relativeButtonX);
        if (hitRecord != null && null != this.listener) {
            ((HotspotActivationListener) ((Object) this.listener)).onHotspotActivated((HotspotTextWidget) (this), hitRecord.hotspotId, methodGuard + 28924, pointerButton);
        }
    }

    final static LoginPayload a(boolean param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        LoginPayload stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param3) {
            field_I = (ByteArrayBuffer) null;
          }
          if (param2.indexOf('@') != -1) {
            var6 = param2;
          } else {
            var7 = (CharSequence) ((Object) param2);
            var4_long = ResourceArchive.a(var7, -48);
          }
          stackIn_6_0 = SecondaryDeque.a(true, var4_long, (String) (var6), param1, param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vf.F(").append(param0).append(',');
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
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 != 0) {
            field_K = false;
        }
        spriteScratchRaster = null;
        field_I = null;
        avatarCryBeginFrames = null;
        decodedSpriteAlpha = (byte[][]) null;
    }

    HotspotTextWidget(String text, WidgetRenderer renderer) {
        super(text, (WidgetListener) null);
        this.hoveredHotspot = null;
        try {
            this.renderer = renderer;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vf.<init>(" + (text != null ? "{...}" : "null") + ',' + (renderer != null ? "{...}" : "null") + ')');
        }
    }

    String getHoverText(byte methodGuard) {
        if (null == this.hoveredHotspot) {
            return null;
        }
        if (this.hotspotHoverTexts == null) {
            return null;
        }
        if (this.hotspotHoverTexts.length <= this.hoveredHotspot.hotspotId) {
            return null;
        }
        if (methodGuard != 69) {
            return (String) null;
        }
        return this.hotspotHoverTexts[this.hoveredHotspot.hotspotId];
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
          this.hoveredHotspot = null;
          if (this.pointerInside) {
            var5_int = -this.widgetX + PrefixCodeDecoder.pointerXSnapshot - parentX;
            var6 = -this.widgetY - parentY + PcmResampler.pointerYSnapshot;
            this.hoveredHotspot = this.findHotspot((byte) 72, var6, var5_int);
          }
          if (hoverGuard) {
            spriteScratchRaster = (Sprite) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("vf.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(parentX).append(')').toString());
        }
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 46 / ((1 - methodGuard) / 43);
        super.renderWidget(parentX, parentY, (byte) -42, renderPass);
        if (renderPass != 0) {
            return;
        }
        TextWidgetLayout var6 = (TextWidgetLayout) ((Object) this.renderer);
        TextHotspotBounds var7 = this.hoveredHotspot;
        if (var7 == null) {
        } else {
            var8 = var6.a(parentX, (UiWidget) (this), (byte) 46);
            var9 = var6.a(parentY, -2, (UiWidget) (this));
            do {
                ImageProducerRasterBuffer.a(-2 + var9 + var7.y, 2 + var7.width, 14164, 2 + var7.height, var7.x + (var8 - 2));
                var7 = var7.nextSegment;
            } while (var7 != null);
        }
    }

    final static Boolean a(byte param0) {
        Boolean var1 = IntrusiveNodeHashTable.field_b;
        int var2 = -97 / ((param0 - 44) / 60);
        IntrusiveNodeHashTable.field_b = null;
        return var1;
    }

    final static void f(int param0) {
        int var1_int = 0;
        GameplayEntity var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 != 0) {
            return;
          }
          for (var1_int = 0; 1000 > var1_int; var1_int++) {
            var2 = new GameplayEntity(0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, var1_int);
            SecondaryNodeDeque.availableEntities.addLast(-117, var2);
            RasterTargetSnapshot.entitiesById[var1_int] = var2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "vf.G(" + param0 + ')');
        }
    }

    boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard >= -30) {
            this.activateButton(-15, -109, 48, 91);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String i(int param0) {
        if (param0 != 1000) {
            String var2 = (String) null;
            HotspotTextWidget.a(false, (String) null, (String) null, true);
        }
        return eh.field_d.readNullTerminatedText((byte) 101);
    }

    final void rebuildHotspotBounds(int methodGuard) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        int var3;
        TextWidgetLayout var4;
        TextLayout var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        TextLayoutLine var13;
        int var14;
        int var15;
        TextHotspotBounds var16;
        int var17;
        var17 = Geoblox.clientControlFlowFlag;
        this.hotspotBounds = new IntrusiveDeque();
        var2 = 83 / ((methodGuard - 48) / 55);
        var3 = 0;
        var4 = (TextWidgetLayout) ((Object) this.renderer);
        var5 = var4.a((byte) 116, (UiWidget) (this));
        while (true) {
          var6 = this.widgetText.indexOf("<hotspot=", var3);
          if (-1 == var6) {
            return;
          }
          var8 = this.widgetText.indexOf(">", var6);
          var7 = this.widgetText.substring(var6 + 9, var8);
          var8 = Integer.parseInt(var7);
          var3 = this.widgetText.indexOf("</hotspot>", var6);
          var9 = var5.a((byte) 24, var6);
          var10 = var5.a((byte) 24, var3);
          var11 = null;
          for (var12 = var9; var10 >= var12; var12++) {
            var13 = var5.field_a[var12];
            if (var9 == var12) {
              stackIn_7_0 = var5.a(var6, 124);
            } else {
              stackIn_7_0 = var13.field_c[0];
            }
            var14 = stackIn_7_0;
            if (var12 == var10) {
              stackIn_12_0 = var5.a(var3, 116);
            } else {
              if (var13 == null) {
                stackIn_12_0 = 0;
              } else {
                stackIn_12_0 = var13.field_c[-1 + var13.field_c.length];
              }
            }
            var15 = stackIn_12_0;
            var16 = new TextHotspotBounds(var8, var14, var13.field_d, var15 - var14, Math.max(var4.a(1), -var13.field_d + var13.field_a));
            if (var11 != null) {
              ((TextHotspotBounds) (var11)).nextSegment = var16;
            }
            this.hotspotBounds.addLast(-44, var16);
            var11 = var16;
          }
          continue;
        }
    }

    final void setHotspotHoverText(int hotspotId, int methodGuard, String hoverText) {
        int var6 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          var4_int = 122 % ((41 - methodGuard) / 55);
          if (!((null != this.hotspotHoverTexts) &&
              (hotspotId < this.hotspotHoverTexts.length))) {
            var5 = new String[hotspotId + 1];
            if (null != this.hotspotHoverTexts) {
              for (var6 = 0; var6 < this.hotspotHoverTexts.length; var6++) {
                var5[var6] = this.hotspotHoverTexts[var6];
              }
            }
            this.hotspotHoverTexts = var5;
          }
          this.hotspotHoverTexts[hotspotId] = hoverText;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("vf.M(").append(hotspotId).append(',').append(methodGuard).append(',');
          if (hoverText == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void fitTextBounds(int x, int methodGuard, int y, int width) {
        if (methodGuard != 0) {
            field_I = (ByteArrayBuffer) null;
        }
        this.setWidgetBounds(((TextWidgetLayout) ((Object) this.renderer)).a(14, (UiWidget) (this)), width, (byte) -40, y, x);
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        if (methodGuard > -6) {
            decodedSpriteAlpha = (byte[][]) null;
        }
        super.setWidgetBounds(height, width, (byte) -123, y, x);
        this.rebuildHotspotBounds(-96);
    }

    private final TextHotspotBounds findHotspot(byte methodGuard, int y, int x) {
        TextHotspotBounds var4;
        int var5;
        TextHotspotBounds var6;
        int var7;
        var7 = Geoblox.clientControlFlowFlag;
        var5 = 3 / ((methodGuard + 46) / 58);
        var4 = (TextHotspotBounds) ((Object) this.hotspotBounds.firstForIteration(0));
        while (var4 != null) {
          var6 = var4;
          while (var6 != null) {
            if ((var6.x <= x) &&
                (y >= var6.y) &&
                (x < var6.width + var6.x) &&
                (y <= var6.y + var6.height)) {
              return var4;
            }
            var6 = var6.nextSegment;
          }
          var4 = (TextHotspotBounds) ((Object) this.hotspotBounds.nextForIteration(1));
        }
        return null;
    }

    static {
        field_K = false;
        spriteScratchRaster = new Sprite((int)(0.5 + Math.sqrt(2592.0)) + 2, 2 + (int)(Math.sqrt(2592.0) + 0.5));
    }
}
