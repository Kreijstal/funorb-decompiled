/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerTrackRenderer implements WidgetRenderer {
    private int markerRadius;
    private LegacyBitmapFont font;
    static int field_e;
    private int backgroundColor;
    private int textColor;
    private int trackColor;
    private int textShadow;
    private int markerColor;

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int var10 = 0;
        UiWidget stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        UiWidget var12 = null;
        MarkerTrackWidget var13 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (widget instanceof MarkerTrackWidget) {
            stackIn_4_0 = (UiWidget) (widget);
          } else {
            stackIn_4_0 = null;
          }
          var13 = (MarkerTrackWidget) (stackIn_4_0);
          SoftwareRasterizer.fillRectangle(widget.x + parentX, widget.y + parentY, widget.width, widget.height, this.backgroundColor);
          if (var13 != null) {
          }
          if (guard != 5592405) {
            var12 = (UiWidget) null;
            this.renderWidget((UiWidget) null, -54, -79, true, -72);
          }
          var7 = widget.width - var13.paddingX * 2;
          var8 = parentX - (-widget.x - var13.paddingX);
          var9 = parentY + widget.y + var13.trackY;
          SoftwareRasterizer.drawLine(var8, var9, var7 + var8, var9, this.trackColor);
          for (var10 = -1 + var13.markerCount(0); var10 >= 0; var10--) {
            SoftwareRasterizer.fillCircle(var8 + var13.markerPosition(var10, guard - 5616599) * var7 / var13.range(-1), var9, this.markerRadius, this.markerColor);
          }
          if (this.font == null) {
            return;
          }
          this.font.drawCentered(var13.text, var8 + var7 / 2, var13.trackY + (this.font.baselineOffset + var9), this.textColor, this.textShadow);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("iu.A(");
          if (widget == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    final static void resetAccountRequests(byte guard) {
        if (guard <= -117) {
          ReconnectState.reconnecting = false;
          StatusMessagePanel.field_A = false;
          ReflectionCheck.setAccountDialogResult(-1, -69);
          Base37NameAlphabet.nameAvailabilityState = AccountRequestDefaults.IDLE;
          ProxySocketConnector.accountCreationState = AccountRequestDefaults.IDLE;
          return;
        }
        MarkerTrackRenderer.resetAccountRequests((byte) -85);
        ReconnectState.reconnecting = false;
        StatusMessagePanel.field_A = false;
        ReflectionCheck.setAccountDialogResult(-1, -69);
        Base37NameAlphabet.nameAvailabilityState = AccountRequestDefaults.IDLE;
        ProxySocketConnector.accountCreationState = AccountRequestDefaults.IDLE;
    }

    final static void sendFourStatHiscoreRequest(int guard, FourStatHiscoreRequest request, int opcode) {
        IsaacPacketBuffer var3 = null;
        try {
          if (guard != -1) {
            field_e = 23;
          }
          var3 = InwardSparkParticle.outgoingPacket;
          var3.writeCipherByte(opcode, guard ^ -9);
          var3.writeByte((byte) 85, request.requestId);
          var3.writeByte((byte) 23, request.rowLimit);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "iu.B(" + guard + ',' + (request != null ? "{...}" : "null") + ',' + opcode + ')');
        }
    }

    MarkerTrackRenderer(LegacyBitmapFont textFont, int labelColor, int shadow, int lineColor, int background, int radius, int markerFill) {
        try {
          this.trackColor = lineColor;
          this.textColor = labelColor;
          this.markerColor = markerFill;
          this.backgroundColor = background;
          this.markerRadius = radius;
          this.textShadow = shadow;
          this.font = textFont;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "iu.<init>(" + (textFont != null ? "{...}" : "null") + ',' + labelColor + ',' + shadow + ',' + lineColor + ',' + background + ',' + radius + ',' + markerFill + ')');
        }
    }

    static {
        field_e = -1;
    }
}
