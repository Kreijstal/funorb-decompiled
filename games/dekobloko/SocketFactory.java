/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketFactory {
    int integerState0927;
    static String stringState0611;
    static String stringState0612;
    static String stringState0613;
    static CipherPacketBuffer cipherPacketBufferState0002;
    String stringState0614;
    static String stringState0615;

    final static void performAction2023(byte byteArgument1) {
        if (MixedSupport046.booleanState0053) {
          GameDomainSupport001.performAction0107(true);
          SceneWidgetPart006.performAction0878(74);
          MixedSupport021.performAction0354(true);
          MixedSupport046.booleanState0053 = false;
          if (byteArgument1 <= 46) {
            SocketFactory.computeInteger2025(true);
            return;
          }
          return;
        }
        if (byteArgument1 > 46) {
          return;
        }
        SocketFactory.computeInteger2025(true);
    }

    final static RgbSprite[] computeRgbSpriteArray2024(ResourceArchive resourceArchiveArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        RgbSprite[] stackRgbSpriteArrayLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (!SceneWidgetPart002.computeBoolean0618(integerArgument4, resourceArchiveArgument1, integerArgument3, 115)) {
            return null;
          }
          if (integerArgument2 >= -123) {
            SocketFactory.performAction2023((byte) 55);
          }
          stackRgbSpriteArrayLocal2 = UiComponentPart006.computeRgbSpriteArray0389(false);
          return stackRgbSpriteArrayLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("we.D(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final java.net.Socket computeSocket2027(int integerArgument1) throws IOException {
        if (integerArgument1 != 2) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.stringState0614, this.integerState0927);
    }

    abstract java.net.Socket computeSocket1679(int integerArgument1) throws IOException;

    public static void performAction2026(byte byteArgument1) {
        stringState0612 = null;
        stringState0613 = null;
        if (byteArgument1 != -37) {
          return;
        }
        cipherPacketBufferState0002 = null;
        stringState0615 = null;
        stringState0611 = null;
    }

    final static int computeInteger2025(boolean booleanArgument1) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException caughtExceptionLocal6 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = booleanArgument1 ? 1 : 0;
          while (DualNodeDeque.computeBoolean0028(114)) {
            UiComponentPart033.mixedSupport121State0004.performAction1718(-38);
            if (!UiComponentPart033.mixedSupport121State0004.computeBoolean1726((byte) 114)) {
              continue;
            }
            integerLocal1 = 1;
          }
          UiComponentPart033.mixedSupport121State0004.performAction1721(MixedSupport106.computeInteger1448(MixedSupport106.integerState0590, -2141435999, HashNode.integerState0069), -20563, MixedSupport106.computeInteger1448(TextLineMetrics.integerState0535, -2141435999, UiComponentPart013.integerState0276));
          if (UiComponentPart033.mixedSupport121State0004.computeBoolean1726((byte) 114)) {
            integerLocal1 = 1;
          }
          integerLocal3 = 0;
          if (integerLocal1 != 0 &&
            UiComponentPart033.mixedSupport121State0004.integerState0754 >= 0) {
            integerLocal3 = UiComponentPart010.integerArrayState0039[UiComponentPart033.mixedSupport121State0004.integerState0754];
            if (integerLocal3 == 2) {
              InteractiveComponent.performAction0514(-1209);
            }
          }
          stackIntegerLocal5 = integerLocal3;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "we.C(" + booleanArgument1 + ')');
        }
    }

    static {
        stringState0613 = "<%0> players want to draw. Hold 'F1' for details.";
        stringState0611 = "achievements to collect";
        stringState0612 = "Rematch!";
        stringState0615 = "EXCLUSIVE";
    }
}
