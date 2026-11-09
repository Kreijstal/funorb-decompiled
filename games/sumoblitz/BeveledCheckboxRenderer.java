/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BeveledCheckboxRenderer implements WidgetRenderer {
    static int field_a;
    static String emailAddressIsUnavailableText;

    public static void releaseStatics(int param0) {
        if (param0 != -4) {
          field_a = 101;
          emailAddressIsUnavailableText = null;
          return;
        }
        emailAddressIsUnavailableText = null;
    }

    final static boolean hasAnyMask34(int flags, int unused, int guard) {
        if (guard <= -116) {
          return (34 & flags) != 0 ? true : false;
        }
        BeveledCheckboxRenderer.hasOpenDialogs(true);
        return (34 & flags) != 0 ? true : false;
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          var6_int = parentX + widget.x;
          if (guard != 5592405) {
            emailAddressIsUnavailableText = (String) null;
          }
          var7 = parentY + widget.y;
          ByteArrayStorage.drawBeveledBorder(widget.height, var6_int, widget.width, (byte) -84, var7);
          var8 = ToolkitRasterStateCacheEntry.field_m[1];
          if (widget instanceof InteractiveWidget &&
            ((InteractiveWidget) (widget)).selected) {
            var8.drawAdditive((-var8.paddedWidth + widget.width >> 1) + (var6_int + 1), (-var8.paddedHeight + widget.height >> 1) + (var7 + 1), 256);
          }
          if (!widget.hasFocus(guard - 5592406)) {
            return;
          }
          AudioServiceThread.drawDottedRectangle(var7 + 2, -4 + widget.width, guard - 5605586, var6_int + 2, -4 + widget.height);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("oj.A(");
          if (widget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    final static boolean hasFlag2048(int flags, int guard, int unused) {
        if (guard == 13836) {
          return 0 != (2048 & flags) ? true : false;
        }
        BeveledCheckboxRenderer.releaseStatics(-32);
        return 0 != (2048 & flags) ? true : false;
    }

    final static boolean registrationEmailNews(int guard) {
        int var1 = -55 / ((-62 - guard) / 36);
        return DropDownLabelRenderer.field_b;
    }

    final static boolean hasOpenDialogs(boolean guard) {
        if (guard) {
          emailAddressIsUnavailableText = (String) null;
          if (HardwareTextureSprite.field_e == null) {
            return false;
          }
          if (null != HardwareTextureSprite.field_e.topOpenDialog((byte) 54)) {
            return true;
          }
          return false;
        }
        if (HardwareTextureSprite.field_e == null) {
          return false;
        }
        if (null != HardwareTextureSprite.field_e.topOpenDialog((byte) 54)) {
          return true;
        }
        return false;
    }

    static {
        emailAddressIsUnavailableText = "Email address is unavailable";
    }
}
