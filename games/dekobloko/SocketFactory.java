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

    final static void performAction1973(byte byteArgument1) {
        if (MixedSupport046.booleanState0053) {
          GameDomainSupport001.performAction0104(true);
          SceneWidgetPart006.performAction0853(74);
          MixedSupport021.performAction0347(true);
          MixedSupport046.booleanState0053 = false;
          if (byteArgument1 <= 46) {
            SocketFactory.computeInteger1975(true);
            return;
          }
          return;
        }
        if (byteArgument1 > 46) {
          return;
        }
        SocketFactory.computeInteger1975(true);
    }

    final static RgbSprite[] computeRgbSpriteArray1974(ResourceArchive resourceArchiveArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        RgbSprite[] stackRgbSpriteArrayLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (!SceneWidgetPart002.computeBoolean0604(integerArgument4, resourceArchiveArgument1, integerArgument3, 115)) {
            return null;
          }
          if (integerArgument2 >= -123) {
            SocketFactory.performAction1973((byte) 55);
          }
          stackRgbSpriteArrayLocal2 = UiComponentPart006.computeRgbSpriteArray0382(false);
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
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final java.net.Socket computeSocket1977(int integerArgument1) throws IOException {
        if (integerArgument1 != 2) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.stringState0614, this.integerState0927);
    }

    abstract java.net.Socket computeSocket1629(int integerArgument1) throws IOException;

    public static void performAction1976(byte byteArgument1) {
        stringState0612 = null;
        stringState0613 = null;
        if (byteArgument1 != -37) {
          return;
        }
        cipherPacketBufferState0002 = null;
        stringState0615 = null;
        stringState0611 = null;
    }

    final static int computeInteger1975(boolean booleanArgument1) {
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
            UiComponentPart033.mixedSupport121State0004.performAction1668(-38);
            if (!UiComponentPart033.mixedSupport121State0004.computeBoolean1676((byte) 114)) {
              continue;
            }
            integerLocal1 = 1;
          }
          UiComponentPart033.mixedSupport121State0004.performAction1671(MixedSupport106.computeInteger1399(MixedSupport106.integerState0590, -2141435999, HashNode.integerState0069), -20563, MixedSupport106.computeInteger1399(TextLineMetrics.integerState0535, -2141435999, UiComponentPart013.integerState0276));
          if (UiComponentPart033.mixedSupport121State0004.computeBoolean1676((byte) 114)) {
            integerLocal1 = 1;
          }
          integerLocal3 = 0;
          if (integerLocal1 != 0 &&
            UiComponentPart033.mixedSupport121State0004.integerState0754 >= 0) {
            integerLocal3 = UiComponentPart010.integerArrayState0039[UiComponentPart033.mixedSupport121State0004.integerState0754];
            if (integerLocal3 == 2) {
              InteractiveComponent.performAction0500(-1209);
            }
          }
          stackIntegerLocal5 = integerLocal3;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeExceptionLocal2), "we.C(" + booleanArgument1 + ')');
        }
    }

    static {
        stringState0613 = "<%0> players want to draw. Hold 'F1' for details.";
        stringState0611 = "achievements to collect";
        stringState0612 = "Rematch!";
        stringState0615 = "EXCLUSIVE";
    }
}
