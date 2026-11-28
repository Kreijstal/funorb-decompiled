/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport027 {
    static String stringState0130;
    static String stringState0131;
    static String stringState0132;
    static RgbSprite rgbSpriteState0014;

    public static void performAction0387(int integerArgument1) {
        stringState0131 = null;
        if (integerArgument1 == -22811) {
          stringState0130 = null;
          rgbSpriteState0014 = null;
          stringState0132 = null;
          return;
        }
        MixedSupport027.performAction0389(91);
        stringState0130 = null;
        rgbSpriteState0014 = null;
        stringState0132 = null;
    }

    final static void performAction0389(int integerArgument1) {
        MixedSupport078.imageState0002 = null;
        SoftwareFramebuffer.fontState0001 = null;
        if (integerArgument1 != -8621) {
          stringState0130 = (String) null;
        }
    }

    final static CoverageBitmapFont computeRenderingSupport0110388(ResourceArchive resourceArchiveArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, ResourceArchive resourceArchiveArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        CoverageBitmapFont stackRenderingSupport011Local2 = null;
        CoverageBitmapFont stackRenderingSupport011Local3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (!SceneWidgetPart002.computeBoolean0558(integerArgument2, resourceArchiveArgument5, integerArgument3, 102)) {
            return null;
          }
          if (byteArgument4 == -75) {
            stackRenderingSupport011Local3 = MixedSupport094.computeRenderingSupport0111201(resourceArchiveArgument1.getFile(integerArgument3, 75, integerArgument2), (byte) 25);
            return stackRenderingSupport011Local3;
          }
          stackRenderingSupport011Local2 = (CoverageBitmapFont) null;
          return stackRenderingSupport011Local2;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("e.B(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (resourceArchiveArgument5 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    static {
        stringState0132 = "<%0> CHAIN";
        stringState0130 = "Password is valid";
        stringState0131 = "Cancel draw";
    }
}
