/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PageReloadHelpers {
    static UiComponent field_g;
    static int[] field_c;
    static int field_d;
    Archive field_b;
    String field_h;
    String field_a;
    String field_e;
    int field_f;

    final static void selectBackFromLogin(int param0) {
        ArchiveIndex.setPendingMenuAction(4, param0 ^ param0);
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_g = null;
        if (param0 != -1) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          PageReloadHelpers.reloadPage((java.applet.Applet) null, -107);
        }
    }

    final static void reloadPage(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf((int) (char)param1);
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(ArchiveFactoryHelpers.decorateSessionUrl(var5, (byte) -112, param0), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("in.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void drawInsetBorder(int param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TetraLink.field_J;
        try {
          SoftwareRasterizer.drawHorizontalLine(param0, param1, param3 + 1, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param0, param4 + param1, 1 + param3, 12105912);
          var5_int = 1;
          if (SoftwareRasterizer.field_i > param1 + var5_int) {
            var5_int = SoftwareRasterizer.field_i - param1;
          }
          var6 = param4;
          if (param1 + var6 > SoftwareRasterizer.field_g) {
            var6 = SoftwareRasterizer.field_g - param1;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 48 * var7 / param4 + 152;
            var9 = var8 << 8 | var8 << 16 | var8;
            SoftwareRasterizer.field_b[param0 + (var7 + param1) * SoftwareRasterizer.field_f] = var9;
            SoftwareRasterizer.field_b[param0 + SoftwareRasterizer.field_f * (var7 + param1) + param3] = var9;
          }
          if (param2 > -33) {
            field_g = (UiComponent) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var5), "in.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean openUrlWithWindowsShell(int param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          try {
            if (!PlatformTaskDispatcher.field_l.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (param0 != 18) {
              PageReloadHelpers.releaseStatics(119);
            }
            for (var3 = 0; var3 < param1.length(); var3++) {
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
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("in.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private PageReloadHelpers() throws Throwable {
        throw new Error();
    }

    static {
        field_d = 3;
        field_c = new int[]{2, 18, 14, 15, 6, 5, 16, 17, 9};
    }
}
