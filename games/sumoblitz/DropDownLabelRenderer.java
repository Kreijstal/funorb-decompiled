/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropDownLabelRenderer implements WidgetRenderer {
    private DropDownWidget dropdown;
    static boolean field_b;
    static String field_c;

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        try {
          if (guard != 5592405) {
            field_b = true;
          }
          var6_int = widget.x + parentX;
          var7 = parentY + widget.y;
          ByteArrayStorage.drawBeveledBorder(widget.height, var6_int, widget.width, (byte) -84, var7);
          if (widget.hasFocus(-1)) {
            AudioServiceThread.drawDottedRectangle(var7 + 2, widget.width - 4, -13181, var6_int + 2, -4 + widget.height);
          }
          SoftwareRasterizer.setClip(var6_int, var7, -2 + widget.width + var6_int, widget.height + var7);
          var8 = this.dropdown.optionList.selectedOption(-72);
          if (var8 != null) {
            var9 = var8.toString();
            this.dropdown.font.drawText(var9, var6_int + 2, (this.dropdown.font.ascent + widget.height >> 1) + (var7 - 1), 10000536, -1);
            if (this.dropdown.hasFocus(-1) &&
              var9.startsWith(this.dropdown.searchPrefix)) {
              var10 = this.dropdown.font.stringWidth(this.dropdown.searchPrefix);
              SoftwareRasterizer.fillRectangleAlpha(var6_int + 2, var7 + 2, var10, widget.height - 4, 2188450, 100);
            }
          }
          SoftwareRasterizer.resetClip();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("dv.A(");
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    final static RasterIndexedSprite[] takeDecodedIndexedSprites(boolean guard) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (!guard) {
          field_b = false;
        }
        RasterIndexedSprite[] var1 = new RasterIndexedSprite[RasterStateFrame.field_n];
        for (var2 = 0; var2 < RasterStateFrame.field_n; var2++) {
          var1[var2] = new RasterIndexedSprite(vf.field_d, ToolkitImageProducerBuffer.field_u, MenuSelectionController.field_h[var2], StrongCacheReference.field_C[var2], CheckboxRenderer.field_k[var2], ScrollViewport.field_B[var2], TextLayout.field_d[var2], LegacyOpenGlEffectManager.field_l);
        }
        PowerupPickup.releaseSpriteDecoderArrays((byte) -68);
        return var1;
    }

    DropDownLabelRenderer(DropDownWidget owner) {
        try {
          this.dropdown = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dv.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != 59) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          DropDownLabelRenderer.readAppletSettings(-92, (java.applet.Applet) null);
        }
    }

    final static String readAppletSettings(int guard, java.applet.Applet applet) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_7_0 = null;
          String stackIn_13_0 = null;
          String stackIn_17_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Sumoblitz.field_L ? 1 : 0;
          try {
            try {
              var9 = applet.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (tw.a(applet, 109, "getcookies"));
              var5 = SocialContact.split(';', var4, -27224);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_7_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (guard > -2) {
              stackIn_13_0 = (String) null;
              return stackIn_13_0;
            }
            if (IntIndexHashTable.field_d == null) {
              return applet.getParameter("settings");
            }
            stackIn_17_0 = IntIndexHashTable.field_d;
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("dv.C(").append(guard).append(',');
            if (applet == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
