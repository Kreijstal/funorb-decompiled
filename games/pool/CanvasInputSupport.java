/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasInputSupport {
    static String gameoptUnratedonly;
    static volatile boolean field_c;
    static ResourceArchive field_b;
    static String[] plusungoodShot;

    final static void detachInputListeners(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          HighscoresScreen.detachKeyListeners((java.awt.Component) ((Object) param0), (byte) -39);
          QuickChatDynamicCommand.detachMouseListeners((java.awt.Component) ((Object) param0), false);
          if (param1 != 0) {
            return;
          }
          if (ClientException.field_a == null) {
            return;
          }
          ClientException.field_a.detach((java.awt.Component) ((Object) param0), 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean rankingComesAfter(int leftIndex, boolean alternatePrimaryKey, int rightIndex, int obfuscationGuard) {
        int var4;
        int var5;
        java.awt.Canvas var6;
        int var4Lifetime1;
        int var5Lifetime1;
        if (obfuscationGuard != 0) {
          var6 = (java.awt.Canvas) null;
          CanvasInputSupport.detachInputListeners((java.awt.Canvas) null, -1);
        }
        if (!alternatePrimaryKey) {
          if (VertexNormal.field_c[leftIndex] < VertexNormal.field_c[rightIndex]) {
            return true;
          }
          if (VertexNormal.field_c[rightIndex] < VertexNormal.field_c[leftIndex]) {
            return false;
          }
          if (TickClock.field_g[rightIndex] > TickClock.field_g[leftIndex]) {
            return true;
          }
          if (TickClock.field_g[rightIndex] < TickClock.field_g[leftIndex]) {
            return false;
          }
          var4 = LoginTextSupport.field_d[leftIndex] + (MenuScreen.field_y[leftIndex] + TextInputPainter.field_s[leftIndex]);
          var5 = LoginTextSupport.field_d[rightIndex] + (MenuScreen.field_y[rightIndex] + TextInputPainter.field_s[rightIndex]);
          if (var5 > var4) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(leftIndex >= rightIndex);
        }
        if (TickClock.field_g[rightIndex] > TickClock.field_g[leftIndex]) {
          return true;
        }
        if (TickClock.field_g[rightIndex] < TickClock.field_g[leftIndex]) {
          return false;
        }
        if (VertexNormal.field_c[rightIndex] > VertexNormal.field_c[leftIndex]) {
          return true;
        }
        if (VertexNormal.field_c[rightIndex] < VertexNormal.field_c[leftIndex]) {
          return false;
        }
        var4Lifetime1 = LoginTextSupport.field_d[leftIndex] + (MenuScreen.field_y[leftIndex] + TextInputPainter.field_s[leftIndex]);
        var5Lifetime1 = LoginTextSupport.field_d[rightIndex] + (MenuScreen.field_y[rightIndex] + TextInputPainter.field_s[rightIndex]);
        if (var5Lifetime1 > var4Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        return !(leftIndex >= rightIndex);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        plusungoodShot = null;
        gameoptUnratedonly = null;
        field_b = null;
        if (param0 != -13) {
          field_c = false;
        }
    }

    final static boolean canAppendNameCharacter(char param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!HalloweenBallSkin.isAllowedNameCharacter(param0, (byte) 125)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          if (param2 != 15692) {
            CanvasInputSupport.releaseStatics(-56);
          }
          var3_int = param1.length();
          if (var3_int >= 12) {
            return false;
          }
          if (!Js5ArchiveManager.a(0, param0)) {
            return true;
          }
          if (0 != var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("he.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final static BinaryBitmapFont loadBinaryFontByName(ResourceArchive spriteArchive, String fileName, int obfuscationGuard, ResourceArchive metricsArchive, String groupName) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BinaryBitmapFont stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = spriteArchive.getGroupId(groupName, -1);
          var6 = spriteArchive.getFileId(var5_int, obfuscationGuard, fileName);
          stackIn_1_0 = LoginResponse.a(spriteArchive, 43, var5_int, metricsArchive, var6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("he.C(");
          if (spriteArchive == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (fileName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(',');
          if (metricsArchive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (groupName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_c = true;
        gameoptUnratedonly = "This game option is not available in rated games.";
        plusungoodShot = new String[]{"Terrible!", "Awful!", "Egad!"};
    }
}
