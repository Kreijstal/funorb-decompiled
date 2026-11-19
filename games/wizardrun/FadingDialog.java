/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FadingDialog extends WidgetContainer {
    private int field_K;
    static AccountConnectionState field_G;
    static volatile boolean field_F;
    static int field_J;
    boolean field_H;
    private DialogLayer field_E;
    static int field_I;

    private final int getTargetOpacity(int param0) {
        if (param0 == -660264703) {
          return !this.field_H ? 0 : this.field_E.getTopVisibleDialog(param0 ^ -660264703) != this ? 0 : 256;
        }
        return 75;
    }

    abstract void drawDialogFrame(int param0, int param1, int param2);

    boolean finishAnimationAndCheckClosed(int param0) {
        if (param0 != 16) {
          return true;
        }
        this.field_K = this.getTargetOpacity(-660264703);
        if (this.field_K != 0) {
          return false;
        }
        if (!this.field_H) {
          return true;
        }
        return false;
    }

    final void resizeAndCenter(int param0, int param1, int param2) {
        this.setBounds(110, LabeledField.field_K - param1 >> 1, param1, param2, EmailDomainHelpers.field_a - param2 >> 1);
        if (param0 != 6154) {
          String var5 = (String) null;
          FadingDialog.openWindowsBrowser(-85, (String) null);
        }
    }

    final static boolean openWindowsBrowser(int param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          try {
            if (!PlatformTaskDispatcher.field_k.startsWith("win")) {
              return false;
            }
            if (param0 <= 81) {
              field_F = true;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param1.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("tj.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    boolean animateAndCheckClosed(int param0) {
        if (param0 != 1) {
          return true;
        }
        int var2 = this.getTargetOpacity(-660264703);
        int var3 = -this.field_K + var2;
        if (var3 > 0) {
          this.field_K = this.field_K + (-1 + (var3 + 8)) / 8;
        }
        if (var3 < 0) {
          this.field_K = this.field_K + (1 + (-16 + var3)) / 16;
        }
        if (this.field_K != 0) {
          return false;
        }
        if (var2 == 0) {
          return !this.field_H ? true : false;
        }
        return false;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_K == 0) {
          return;
        }
        if (this.field_K >= 256) {
          if (param2 == 0) {
            this.drawDialogFrame(this.x + param0, -1, this.y + param3);
            super.drawLayer(param0, param1 ^ 0, param2, param3);
            return;
          }
          return;
        }
        if (RasterSnapshot.field_n == null) {
          RasterSnapshot.field_n = new Sprite(this.width, this.height);
          UrlPacketDownloader.pushSpriteRaster(RasterSnapshot.field_n, false);
          SoftwareRasterizer.clear();
          this.drawDialogFrame(param1, -1, 0);
          super.drawLayer(-this.x - param0, 0, param2, -this.y - param3);
          UsernameLoginCredentials.popRasterState(4);
          RasterSnapshot.field_n.drawAlpha(this.x + param0, param3 + this.y, this.field_K);
          return;
        }
        if (this.width > RasterSnapshot.field_n.width) {
          RasterSnapshot.field_n = new Sprite(this.width, this.height);
          UrlPacketDownloader.pushSpriteRaster(RasterSnapshot.field_n, false);
          SoftwareRasterizer.clear();
          this.drawDialogFrame(param1, -1, 0);
          super.drawLayer(-this.x - param0, 0, param2, -this.y - param3);
          UsernameLoginCredentials.popRasterState(4);
          RasterSnapshot.field_n.drawAlpha(this.x + param0, param3 + this.y, this.field_K);
          return;
        }
        if (this.height > RasterSnapshot.field_n.height) {
          RasterSnapshot.field_n = new Sprite(this.width, this.height);
          UrlPacketDownloader.pushSpriteRaster(RasterSnapshot.field_n, false);
          SoftwareRasterizer.clear();
          this.drawDialogFrame(param1, -1, 0);
          super.drawLayer(-this.x - param0, 0, param2, -this.y - param3);
          UsernameLoginCredentials.popRasterState(4);
          RasterSnapshot.field_n.drawAlpha(this.x + param0, param3 + this.y, this.field_K);
          return;
        }
        UrlPacketDownloader.pushSpriteRaster(RasterSnapshot.field_n, false);
        SoftwareRasterizer.clear();
        this.drawDialogFrame(param1, -1, 0);
        super.drawLayer(-this.x - param0, 0, param2, -this.y - param3);
        UsernameLoginCredentials.popRasterState(4);
        RasterSnapshot.field_n.drawAlpha(this.x + param0, param3 + this.y, this.field_K);
    }

    final static void writeAccountEligibilityCookie(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          NameCheckProgressDialog.field_yb = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          if (param0 != 3088) {
            String var6 = (String) null;
            FadingDialog.openWindowsBrowser(-110, (String) null);
          }
          BrowserCookieHelpers.writeCookie(var4, var2, false, var3, param1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "tj.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_G = null;
        if (!param0) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          FadingDialog.writeAccountEligibilityCookie(82, (java.applet.Applet) null);
        }
    }

    final static String[] splitOnCharacter(String param0, int param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = wizardrun.field_H;
        try {
          var10 = (CharSequence) ((Object) param0);
          var3_int = ValidationState.countCharacter(param2, var10, (byte) 75);
          var4 = new String[var3_int + 1];
          if (param1 != -22710) {
            field_G = (AccountConnectionState) null;
          }
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tj.DB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final UiWidget getFocusedWidget(int param0) {
        UiWidget var2 = super.getFocusedWidget(param0);
        if (var2 != null) {
          return var2;
        }
        return (UiWidget) (this);
    }

    FadingDialog(DialogLayer param0, int param1, int param2) {
        super(EmailDomainHelpers.field_a - param1 >> 1, -param2 + LabeledField.field_K >> 1, param1, param2, (WidgetRenderer) null);
        try {
          this.field_H = false;
          this.field_E = param0;
          this.field_K = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_F = false;
        field_I = 0;
        field_G = new AccountConnectionState();
    }
}
