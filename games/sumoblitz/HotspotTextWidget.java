/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends InteractiveWidget {
    static IntrusiveNodeHashTable field_N;
    private TextHotspot hoveredHotspot;
    static String connectionTimedOutPleaseText;
    private String[] hotspotTooltips;
    static int activePointerButton;
    private IntrusiveDeque hotspots;
    static String pointsRemainingText;
    static Sprite field_E;
    static tf field_L;

    final void setBoundsToTextHeight(int y, boolean guard, int x, int width) {
        this.setBounds(-50, x, y, ((TextWidgetLayout) ((Object) this.renderer)).measuredTextHeight((UiWidget) (this), (byte) 116), width);
        if (guard) {
          UiWidget var6 = (UiWidget) null;
          this.update(-89, -87, (UiWidget) null, -5);
        }
    }

    public static void releaseStatics(byte param0) {
        field_E = null;
        pointsRemainingText = null;
        field_N = null;
        if (param0 >= -115) {
          field_E = (Sprite) null;
        }
        connectionTimedOutPleaseText = null;
        field_L = null;
    }

    void update(int parentX, int guard, UiWidget root, int parentY) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.update(parentX, -117, root, parentY);
          var5_int = 65 % ((guard + 25) / 45);
          this.hoveredHotspot = null;
          if (this.hovered) {
            var6 = -this.x + (-parentX + ko.field_p);
            var7 = -parentY + (pi.field_e - this.y);
            this.hoveredHotspot = this.hotspotAt(-40, var6, var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ar.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(parentY).append(')').toString());
        }
    }

    final static void readServerDataReply(byte guard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ServerDataWriteRequest var5_ref_db = null;
        Object var6 = null;
        int var7 = 0;
        byte[] var9 = null;
        ServerDataReadRequest var10 = null;
        IsaacPacketBuffer var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var11 = ig.field_a;
          var2 = var11.readUnsignedByte(-31302);
          var3 = 99 / ((-33 - guard) / 36);
          if (var2 == 0) {
            var10 = (ServerDataReadRequest) (no.field_d.first(-110));
            if (var10 == null) {
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -109);
              return;
            }
            var5 = var11.readUnsignedByte(-31302);
            if (var5 != 0) {
              var13 = new byte[var5];
              var12 = var13;
              var9 = var12;
              var6 = var9;
              var11.readBytes(var13, var5, 0, (byte) -47);
            } else {
              var6 = null;
            }
            var11.position = var11.position + 4;
            if (!var11.verifyTrailingCrc32((byte) -9)) {
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -127);
              return;
            }
            var10.complete = true;
            var10.payload = (byte[]) (var6);
            var10.unlink(false);
          } else {
            if (var2 == 1) {
              var4 = var11.readInt(true);
              var5_ref_db = (ServerDataWriteRequest) (LoginMethodPreference.field_a.first(83));
              while (var5_ref_db != null) {
                if (var4 != var5_ref_db.requestCrc) {
                  var5_ref_db = (ServerDataWriteRequest) (LoginMethodPreference.field_a.next((byte) 18));
                  continue;
                }
                break;
              }
              if (var5_ref_db == null) {
                LegacyOpenGlTextureCache.closeAccountSocket((byte) -123);
                return;
              }
              var5_ref_db.unlink(false);
              return;
            }
            IntrusiveNode.reportClientError("A1: " + VictoryScreen.b((byte) -9), (Throwable) null, 0);
            LegacyOpenGlTextureCache.closeAccountSocket((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "ar.E(" + guard + ')');
        }
    }

    final void rebuildHotspots(int guard) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        TextWidgetLayout var3;
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
        TextHotspot var15;
        int var16;
        int var7Lifetime1;
        var16 = Sumoblitz.field_L ? 1 : 0;
        this.hotspots = new IntrusiveDeque();
        var2 = 0;
        var3 = (TextWidgetLayout) ((Object) this.renderer);
        var4 = var3.layoutText(-3, (UiWidget) (this));
        if (guard != 9) {
          connectionTimedOutPleaseText = (String) null;
        }
        while (true) {
          var5 = this.text.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.text.indexOf(">", var5);
          var6 = this.text.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.text.indexOf("</hotspot>", var5);
          var8 = var4.lineForCharacter(var5, -17500);
          var9 = var4.lineForCharacter(var2, guard - 17509);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.lines[var11];
            if (~var11 == ~var8) {
              stackIn_8_0 = var4.caretX((byte) 125, var5);
            } else {
              stackIn_8_0 = var12.caretX[0];
            }
            var13 = stackIn_8_0;
            if (var9 != var11) {
              if (var12 == null) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = var12.caretX[-1 + var12.caretX.length];
              }
            } else {
              stackIn_13_0 = var4.caretX((byte) 126, var2);
            }
            var14 = stackIn_13_0;
            var15 = new TextHotspot(var7Lifetime1, var13, var12.top, -var13 + var14, Math.max(var3.lineHeight(14763), -var12.top + var12.bottom));
            if (var10 != null) {
              ((TextHotspot) (var10)).nextFragment = var15;
            }
            this.hotspots.addLast((IntrusiveNode) (var15), (byte) 39);
            var10 = var15;
          }
        }
    }

    HotspotTextWidget(String text, WidgetRenderer renderer) {
        super(text, (WidgetListener) null);
        this.hoveredHotspot = null;
        try {
          this.renderer = renderer;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ar.<init>(" + (text != null ? "{...}" : "null") + ',' + (renderer != null ? "{...}" : "null") + ')');
        }
    }

    final void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        super.setBounds(-114, newX, newY, newHeight, newWidth);
        int var6 = -60 / ((guard - 28) / 63);
        this.rebuildHotspots(9);
    }

    boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 61) {
            return false;
          }
          field_N = (IntrusiveNodeHashTable) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ar.Q(");
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    private final TextHotspot hotspotAt(int guard, int x, int y) {
        int var4;
        TextHotspot var5;
        TextHotspot var6;
        int var7;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var4 = 22 / ((88 - guard) / 35);
        var5 = (TextHotspot) (this.hotspots.first(124));
        while (var5 != null) {
          var6 = var5;
          while (var6 != null) {
            if (var6.x <= x &&
              var6.y <= y &&
              var6.width + var6.x > x &&
              y <= var6.y + var6.height) {
              return var5;
            }
            var6 = var6.nextFragment;
          }
          var5 = (TextHotspot) (this.hotspots.next((byte) 18));
        }
        return null;
    }

    void renderLayer(int parentX, int parentY, byte guard, int layer) {
        int var7 = 0;
        int var8 = 0;
        super.renderLayer(parentX, parentY, (byte) -113, layer);
        if (layer != 0) {
          return;
        }
        TextWidgetLayout var9 = (TextWidgetLayout) ((Object) this.renderer);
        if (guard >= -35) {
          field_L = (tf) null;
        }
        TextHotspot var6 = this.hoveredHotspot;
        if (var6 != null) {
          var7 = var9.textOriginX(parentX, (UiWidget) (this), 16098);
          var8 = var9.textOriginY(parentY, (UiWidget) (this), 0);
          do {
            AudioServiceThread.drawDottedRectangle(-2 + (var6.y + var8), var6.width + 2, -13181, -2 + (var7 + var6.x), 2 + var6.height);
            var6 = var6.nextFragment;
          } while (var6 != null);
        }
    }

    final void setHotspotTooltip(int guard, String tooltip, int hotspotId) {
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard > -44) {
            connectionTimedOutPleaseText = (String) null;
          }
          if (null == this.hotspotTooltips ||
            this.hotspotTooltips.length <= hotspotId) {
            var7 = new String[1 + hotspotId];
            var8 = var7;
            var4 = var8;
            if (null != this.hotspotTooltips) {
              for (var5 = 0; var5 < this.hotspotTooltips.length; var5++) {
                var7[var5] = this.hotspotTooltips[var5];
              }
            }
            this.hotspotTooltips = var8;
          }
          this.hotspotTooltips[hotspotId] = tooltip;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ar.H(").append(guard).append(',');
          if (tooltip == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(hotspotId).append(')').toString());
        }
    }

    final void notifyAction(int action, int pointerX, boolean guard, int pointerY) {
        super.notifyAction(action, pointerX, guard, pointerY);
        int var5 = -this.x + pointerX;
        int var6 = pointerY - this.y;
        TextHotspot var7 = this.hotspotAt(126, var5, var6);
        if (var7 != null &&
          this.listener != null) {
          ((TextHotspotListener) ((Object) this.listener)).onHotspotAction(var7.id, this, action, -20036);
        }
    }

    String hoveredTooltip(int guard) {
        if (null == this.hoveredHotspot) {
          return null;
        }
        if (this.hotspotTooltips == null) {
          return null;
        }
        if (guard != -6696) {
          connectionTimedOutPleaseText = (String) null;
        }
        if (this.hotspotTooltips.length <= this.hoveredHotspot.id) {
          return null;
        }
        return this.hotspotTooltips[this.hoveredHotspot.id];
    }

    static {
        connectionTimedOutPleaseText = "Connection timed out. Please try using a different server.";
        activePointerButton = 0;
        pointsRemainingText = "points remaining: <%0>";
        field_N = new IntrusiveNodeHashTable(8);
        field_L = new tf();
    }
}
