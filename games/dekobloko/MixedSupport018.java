/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport018 {
    static String stringState0088;
    static String stringState0089;
    static String stringState0090;
    static NodeDeque nodeDequeState0005;
    static String stringState0091;
    static boolean booleanState0021;
    static NodeDeque nodeDequeState0006;
    static String stringState0092;

    public static void performAction0274(int integerArgument1) {
        if (integerArgument1 != -27513) {
          return;
        }
        stringState0092 = null;
        stringState0089 = null;
        stringState0088 = null;
        stringState0091 = null;
        stringState0090 = null;
        nodeDequeState0006 = null;
        nodeDequeState0005 = null;
    }

    final static IndexedSprite[] computeIndexedSpriteArray0276(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        IndexedSprite[] indexedSpriteArrayLocal3 = new IndexedSprite[GameDomainSupport002.integerState0177];
        if (integerArgument1 > -110) {
          return (IndexedSprite[]) null;
        }
        for (integerLocal1 = 0; integerLocal1 < GameDomainSupport002.integerState0177; integerLocal1++) {
          indexedSpriteArrayLocal3[integerLocal1] = new IndexedSprite(MixedSupport029.integerState0181, MixedSupport057.integerState0297, InputAdapter006.integerArrayState0206[integerLocal1], MixedSupport039.integerArrayState0047[integerLocal1], MixedSupport130.integerArrayState0208[integerLocal1], MixedSupport052.integerArrayState0054[integerLocal1], SceneWidgetPart011.byteArrayArrayState0008[integerLocal1], NetworkSupport006.integerArrayState0152);
        }
        MixedSupport094.performAction1305(126);
        return indexedSpriteArrayLocal3;
    }

    final static void performAction0272(byte byteArgument1) {
        int[] integerArrayLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int[] integerArrayLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerArrayLocal6 = SceneWidgetPart008.integerArrayState0170;
          integerArrayLocal1 = integerArrayLocal6;
          integerLocal2 = -61 % ((60 - byteArgument1) / 38);
          integerLocal3 = 0;
          integerLocal4 = integerArrayLocal6.length;
          while (integerLocal3 < integerLocal4) {
            integerArrayLocal6[integerLocal3++] = 0;
            integerArrayLocal6[integerLocal3++] = 0;
            integerArrayLocal6[integerLocal3++] = 0;
            integerArrayLocal6[integerLocal3++] = 0;
            integerArrayLocal6[integerLocal3++] = 0;
            integerArrayLocal6[integerLocal3++] = 0;
            integerArrayLocal6[integerLocal3++] = 0;
            integerArrayLocal6[integerLocal3++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal7 = caughtParameterLocal9;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal8), "ci.A(" + byteArgument1 + ')');
        }
    }

    final static void performAction0275(MixedSupport015 mixedSupport015Argument1, int integerArgument2, int integerArgument3, byte byteArgument4, int integerArgument5, MixedSupport015 mixedSupport015Argument6) {
        try {
          if (byteArgument4 >= -62) {
            stringState0092 = (String) null;
          }
          TextLineMetrics.mixedSupport015State0003 = mixedSupport015Argument1;
          MixedSupport022.mixedSupport015State0001 = mixedSupport015Argument6;
          NetworkSupport006.integerState0499 = integerArgument2;
          BufferedSocket.integerState0665 = integerArgument5;
          UiComponentPart022.integerState0575 = integerArgument3;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ci.E(" + (mixedSupport015Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + byteArgument4 + ',' + integerArgument5 + ',' + (mixedSupport015Argument6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean computeBoolean0273(char characterArgument1, byte byteArgument2) {
        if (byteArgument2 < 66) {
          MixedSupport018.performAction0272((byte) -16);
        }
        if (Character.isISOControl(characterArgument1)) {
          return false;
        }
        if (MixedSupport064.computeBoolean0850(-8241, characterArgument1)) {
          return true;
        }
        if (45 != characterArgument1 &&
          160 != characterArgument1 &&
          32 != characterArgument1 &&
          characterArgument1 != 95) {
          return false;
        }
        return true;
    }

    static {
        stringState0089 = "<%0> has not yet unlocked this option for use.";
        stringState0088 = "Hide private chat and appear offline to friends";
        stringState0090 = "Please select an option in the '<%0>' row.";
        nodeDequeState0005 = new NodeDeque();
        stringState0091 = "Try changing the '<%0>' setting.";
        stringState0092 = "Click or press F10 to open Quick Chat";
    }
}
