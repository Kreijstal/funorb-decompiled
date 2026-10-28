/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaContainer extends SingleChildContainer {
    static LoginCredentialType field_E;
    static volatile int mouseIdleTicks;
    static RasterBuffer field_D;
    int alpha;
    static String field_H;

    public AlphaContainer() {
        super(0, 0, 0, 0, (WidgetPainter) null, (UiListener) null);
        this.alpha = 256;
    }

    final static int nextPowerOfTwo(byte guard, int value) {
        value--;
        value = value | value >>> 1;
        if (guard == 127) {
          value = value | value >>> 2;
          value = value | value >>> 4;
          value = value | value >>> 8;
          value = value | value >>> 16;
          return 1 + value;
        }
        AlphaContainer.releaseStatics(60);
        value = value | value >>> 2;
        value = value | value >>> 4;
        value = value | value >>> 8;
        value = value | value >>> 16;
        return 1 + value;
    }

    final static void openRelativeUrl(java.applet.Applet applet, byte guard, String relativeUrl) {
        try {
          String stackIn_9_2 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              java.net.URL var3 = new java.net.URL(applet.getCodeBase(), relativeUrl);
              var3 = WeightedCacheEntry.withSessionParameters((byte) 95, applet, var3);
              Bzip2State.a(true, true, applet, var3.toString());
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var3_ref2 = (Exception) (Object) decompiledCaughtException;
              var3_ref2.printStackTrace();
            }
            if (guard < -91) {
              return;
            }
            field_H = (String) null;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var3_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("md.B(");
            if (applet == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(',');
            if (relativeUrl == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    AlphaContainer(UiComponent param0) {
        super(param0.x, param0.y, param0.width, param0.height, (WidgetPainter) null, (UiListener) null);
        try {
          param0.setBounds(this.width, 0, 0, true, this.height);
          this.child = param0;
          this.alpha = 256;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int guard) {
        int var1 = -26 / ((guard + 6) / 58);
        field_D = null;
        field_E = null;
        field_H = null;
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (layer != 0) {
          return;
        }
        if (null == this.child) {
          return;
        }
        if (this.alpha == 0) {
          return;
        }
        if (this.alpha == 256) {
          this.child.drawLayer(this.y + screenY, (byte) 95, layer, this.x + screenX);
          return;
        }
        Sprite var6 = new Sprite(this.child.width, this.child.height);
        TickClock.pushSpriteRaster(var6, (byte) -105);
        this.child.drawLayer(0, (byte) 91, layer, 0);
        if (guard >= 85) {
          RasterRestoreSupport.popRasterState((byte) 107);
          var6.drawAlpha(this.x + screenX, this.y + screenY, this.alpha);
          return;
        }
        field_H = (String) null;
        RasterRestoreSupport.popRasterState((byte) 107);
        var6.drawAlpha(this.x + screenX, this.y + screenY, this.alpha);
    }

    static {
        field_E = new LoginCredentialType(3);
        mouseIdleTicks = 0;
    }
}
