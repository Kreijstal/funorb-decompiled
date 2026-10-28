/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextHotspotWidget extends TextButton {
    private IntrusiveDeque field_D;
    private String[] field_F;
    private TextHotspotRegion field_E;

    final void notifyAction(int guard, int localY, int localX, int buttonCode) {
        super.notifyAction(guard, localY, localX, buttonCode);
        int var5 = localX - this.x;
        int var6 = localY - this.y;
        TextHotspotRegion var7 = this.hotspotAt(var6, (byte) -110, var5);
        if (var7 != null &&
          null != this.listener) {
          ((TextHotspotListener) ((Object) this.listener)).onHotspotAction(guard ^ 18321, this, var7.hotspotId, buttonCode);
        }
    }

    void drawLayer(int screenY, byte guard, int layer, int screenX) {
        super.drawLayer(screenY, (byte) 87, layer, screenX);
        if (guard <= 85) {
          this.field_D = (IntrusiveDeque) null;
        }
        if (layer != 0) {
          return;
        }
        WidgetTextLayout var9 = (WidgetTextLayout) ((Object) this.painter);
        TextHotspotRegion var6 = this.field_E;
        if (var6 == null) {
        } else {
          int var7 = var9.textOriginX((byte) -113, (UiComponent) (this), screenX);
          int var8 = var9.textOriginY((UiComponent) (this), screenY, -16956);
          do {
            SeekerMine.drawDottedRectangle(false, 2 + var6.width, var6.x + var7 - 2, var6.height + 2, -2 + var8 + var6.y);
            var6 = var6.nextFragment;
          } while (var6 != null);
        }
    }

    final void setHotspotTooltip(String tooltip, byte guard, int hotspotId) {
        String stackIn_17_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (this.field_F == null ||
            hotspotId >= this.field_F.length) {
            String[] var7 = new String[1 + hotspotId];
            String[] var8 = var7;
            String[] var4 = var8;
            if (this.field_F != null) {
              for (int var5 = 0; this.field_F.length > var5; var5++) {
                var7[var5] = this.field_F[var5];
              }
            }
            this.field_F = var8;
          }
          if (guard < 51) {
            TextHotspotWidget.notifyBrowserResize(-38, (byte) -110);
          }
          this.field_F[hotspotId] = tooltip;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_16_0 = runtimeException;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ue.I(");
          if (tooltip == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(',').append(hotspotId).append(')').toString());
        }
    }

    final void rebuildHotspots(int searchStart) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var16 = EscapeVector.obfuscationControl;
        this.field_D = new IntrusiveDeque();
        int var2 = searchStart;
        WidgetTextLayout var3 = (WidgetTextLayout) ((Object) this.painter);
        TextLayout var4 = var3.ensureTextLayout((UiComponent) (this), 90);
        while (true) {
          int var5 = this.text.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          int var7 = this.text.indexOf(">", var5);
          String var6 = this.text.substring(9 + var5, var7);
          int var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.text.indexOf("</hotspot>", var5);
          int var8 = var4.lineForCharacter(var5, 0);
          int var9 = var4.lineForCharacter(var2, 0);
          Object var10 = null;
          for (int var11 = var8; var11 <= var9; var11++) {
            TextLayoutLine var12 = var4.lines[var11];
            if (var8 == var11) {
              stackIn_7_0 = var4.characterX((byte) 122, var5);
            } else {
              stackIn_7_0 = var12.insertionX[0];
            }
            int var13 = stackIn_7_0;
            if (var11 == var9) {
              stackIn_12_0 = var4.characterX((byte) 125, var2);
            } else if (var12 == null) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = var12.insertionX[-1 + var12.insertionX.length];
            }
            int var14 = stackIn_12_0;
            TextHotspotRegion var15 = new TextHotspotRegion(var7Lifetime1, var13, var12.top, -var13 + var14, Math.max(var3.lineHeight(109), var12.bottom - var12.top));
            if (var10 != null) {
              ((TextHotspotRegion) (var10)).nextFragment = var15;
            }
            this.field_D.addLast(-12328, var15);
            var10 = var15;
          }
        }
    }

    final void setBounds(int width, int y, int x, boolean guard, int height) {
        if (!guard) {
          TextHotspotWidget.notifyBrowserResize(-85, (byte) -78);
        }
        super.setBounds(width, y, x, guard, height);
        this.rebuildHotspots(0);
    }

    TextHotspotWidget(String param0, WidgetPainter param1) {
        super(param0, (UiListener) null);
        this.field_E = null;
        try {
          this.painter = param1;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final TextHotspotRegion hotspotAt(int textY, byte guard, int textX) {
        int var6 = EscapeVector.obfuscationControl;
        TextHotspotRegion var4 = (TextHotspotRegion) (this.field_D.first(false));
        if (guard > -83) {
          return (TextHotspotRegion) null;
        }
        while (var4 != null) {
          TextHotspotRegion var5 = var4;
          while (var5 != null) {
            if (textX >= var5.x &&
              var5.y <= textY &&
              var5.x + var5.width > textX &&
              var5.y + var5.height >= textY) {
              return var4;
            }
            var5 = var5.nextFragment;
          }
          var4 = (TextHotspotRegion) (this.field_D.next((byte) 70));
        }
        return null;
    }

    final static void notifyBrowserResize(int value, byte guard) {
        try {
          try {
            JavaScriptBridge.callWindowFunctionWithArguments((byte) 106, PointCloudEffect.activeApplet((byte) -62), new Object[]{new Integer(value)}, "resizing");
          } catch (Throwable throwable) {
          }
          if (guard <= 93) {
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void setBoundsToTextHeight(int guard, int x, int width, int y) {
        this.setBounds(width, y, x, true, ((WidgetTextLayout) ((Object) this.painter)).preferredHeight(-106, (UiComponent) (this)));
        if (guard != 2463) {
          this.field_F = (String[]) null;
        }
    }

    boolean focusNext(int guard, UiComponent root) {
        String stackIn_7_2 = null;
        try {
          if (guard == -4659) {
            return false;
          }
          this.field_E = (TextHotspotRegion) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ue.M(").append(guard).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          super.updateHover(guard, offsetY, offsetX, root);
          this.field_E = null;
          if (this.hovered) {
            int var5_int = -offsetX + (GzipDecoder.field_d - this.x);
            int var6 = -offsetY + UiContainer.field_y - this.y;
            this.field_E = this.hotspotAt(var6, (byte) -111, var5_int);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ue.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    String getTooltip(int guard) {
        if (this.field_E == null) {
          return null;
        }
        if (this.field_F == null) {
          return null;
        }
        if (guard != 1) {
          return (String) null;
        }
        if (this.field_E.hotspotId >= this.field_F.length) {
          return null;
        }
        return this.field_F[this.field_E.hotspotId];
    }

    static {
    }
}
