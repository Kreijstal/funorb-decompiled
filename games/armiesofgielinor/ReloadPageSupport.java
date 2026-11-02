/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReloadPageSupport {
    static BinaryBitmapFont field_a;
    static int field_f;
    static WidgetTheme field_c;
    static int field_e;
    static ClientUiComponent field_g;
    static byte[] field_b;
    static RgbSprite[] field_d;

    public static void releaseStatics(int obfuscationGuard) {
        field_d = null;
        field_a = null;
        field_c = null;
        if (obfuscationGuard != 0) {
          return;
        }
        field_g = null;
        field_b = null;
    }

    final static int indexOfString(String text, String[] candidates, byte obfuscationGuard) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (text == null) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var3_int = candidates.length;
          var4 = 64 % ((obfuscationGuard - 80) / 35);
          for (var5 = 0; var5 < var3_int; var5++) {
            var6 = candidates[var5];
            if (text.equals(var6)) {
              stackIn_9_0 = var5;
              return stackIn_9_0;
            }
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("t.A(");
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (candidates == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void reloadPage(byte obfuscationGuard, java.applet.Applet applet) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          String[] var6 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (obfuscationGuard != -118) {
                var6 = (String[]) null;
                ReloadPageSupport.indexOfString((String) null, (String[]) null, (byte) -128);
              }
              var2 = applet.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(applet.getCodeBase(), var4);
              applet.getAppletContext().showDocument(StructureTerrainSupport.a(-3780, var5, applet), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("t.C(").append(obfuscationGuard).append(',');
            if (applet == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = -1;
        field_e = 0;
    }
}
