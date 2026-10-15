/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pp {
    static RgbSprite field_b;
    static String field_c;
    static int field_a;

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var13;
        ClientException var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        int var12;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        var13 = BrickABrac.field_J ? 1 : 0;
        if (param1 instanceof ClientException) {
          var14 = (ClientException) ((Object) param1);
          param1 = var14.originalCause;
          var2 = var14.context + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        if (param0 != 22570) {
          return (String) null;
        }
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime3 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', var9 + 1);
          if (var9 == -1) {
            var11Lifetime5Lifetime2 = var8;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var16;
          var2Lifetime3Lifetime3 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (var9 != -1) {
            if (-1 == var10) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (0 <= var12) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    final static int countCharacter(byte obfuscationGuard, char character, CharSequence text) {
        int count = 0;
        int length = 0;
        int characterIndex = 0;
        int gameFlag = 0;
        int resultCount = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        gameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          count = 0;
          length = text.length();
          characterIndex = 0;
          if (obfuscationGuard != 120) {
            field_b = (RgbSprite) null;
          }
          while (length > characterIndex) {
            if (character == text.charAt(characterIndex)) {
              count++;
            }
            characterIndex++;
          }
          resultCount = count;
          return resultCount;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("pp.G(").append(obfuscationGuard).append(',').append(character).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(')').toString());
        }
    }

    final static void a(byte param0) {
        vd.field_f.failureCount = 0;
        vd.field_f.lastError = 0;
        int var1 = -90 % ((-32 - param0) / 62);
    }

    final static void setFullscreenDialogCenter(int x, int y, byte obfuscationGuard) {
        ProxySocketConnector.fullscreenDialogCenterX = x;
        if (obfuscationGuard != 19) {
          return;
        }
        ScreenshotViewer.fullscreenDialogCenterY = y;
    }

    final static int a(PlayerBoard param0, byte param1, MultiplayerMatch param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.configuration.repeats) {
            stackIn_3_0 = param0.levelIndex;
            return stackIn_3_0;
          }
          var3_int = 44 / ((param1 + 59) / 34);
          if (param0.levelIndex >= param2.configuration.getPeriod(-30)) {
            stackIn_7_0 = -1 + param2.configuration.getPeriod(79);
          } else {
            stackIn_7_0 = param0.levelIndex;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pp.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
          CharSequence var2 = (CharSequence) null;
          pp.countCharacter((byte) -84, 'ﾽ', (CharSequence) null);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static boolean hasInvalidPasswordLength(String password, boolean obfuscationGuard) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            field_b = (RgbSprite) null;
          }
          if (password != null &&
            password.length() >= TranslucentNineSliceFrame.field_n &&
            password.length() <= FullscreenFailureDialog.field_bb) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pp.D(");
          if (password == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_c = "Rankings";
    }
}
