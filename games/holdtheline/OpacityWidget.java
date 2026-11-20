/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpacityWidget extends SingleChildWidget {
    static tk field_G;
    int opacity;

    final static void writeCookie(long param0, java.applet.Applet param1, String param2, int param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param4 + "=" + param2 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param0) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + cd.a(75, param0 * 1000L + bb.b(-1)) + "; Max-Age=" + param0;
              }
              if (param3 > -98) {
                field_G = (tk) null;
              }
              eo.a(param1, -31645, "document.cookie=\"" + var7Lifetime4 + "\"");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("he.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    OpacityWidget(UiWidget param0) {
        super(param0.x, param0.y, param0.width, param0.height, (WidgetRenderer) null, (WidgetListener) null);
        try {
          param0.setBounds(0, (byte) 122, 0, this.height, this.width);
          this.child = param0;
          this.opacity = 256;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public OpacityWidget() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetListener) null);
        this.opacity = 256;
    }

    public static void clearSharedReferences(int param0) {
        field_G = null;
        if (param0 != 1000) {
          String var2 = (String) null;
          OpacityWidget.writeCookie(-9L, (java.applet.Applet) null, (String) null, -57, (String) null);
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        Sprite var6 = null;
        if (param3 != 0) {
          return;
        }
        if (null == this.child) {
          return;
        }
        if (0 == this.opacity) {
          return;
        }
        if (this.opacity != 256) {
          var6 = new Sprite(this.child.width, this.child.height);
          ProxySocketConnector.a(var6, -1);
          this.child.drawLayer(param0, 0, 0, param3);
          dm.b((byte) -10);
          var6.drawAlpha(param2 + this.x, param1 + this.y, this.opacity);
          return;
        }
        this.child.drawLayer(-9532, this.y + param1, this.x + param2, param3);
    }

    static {
    }
}
