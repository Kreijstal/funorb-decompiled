/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport027 {
    static String stringState0130;
    static String stringState0131;
    static String stringState0132;
    static RgbSprite rgbSpriteState0014;

    public static void performAction0425(int integerArgument1) {
        stringState0131 = null;
        if (integerArgument1 == -22811) {
          stringState0130 = null;
          rgbSpriteState0014 = null;
          stringState0132 = null;
          return;
        }
        MixedSupport027.performAction0427(91);
        stringState0130 = null;
        rgbSpriteState0014 = null;
        stringState0132 = null;
    }

    final static void performAction0427(int integerArgument1) {
        MixedSupport082.imageState0002 = null;
        SoftwareFramebuffer.fontState0001 = null;
        if (integerArgument1 != -8621) {
          stringState0130 = (String) null;
        }
    }

    final static RenderingSupport012 computeRenderingSupport0120426(ResourceArchive resourceArchiveArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, ResourceArchive resourceArchiveArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        RenderingSupport012 stackRenderingSupport012Local2 = null;
        RenderingSupport012 stackRenderingSupport012Local3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (!SceneWidgetPart002.computeBoolean0618(integerArgument2, resourceArchiveArgument5, integerArgument3, 102)) {
            return null;
          }
          if (byteArgument4 == -75) {
            stackRenderingSupport012Local3 = MixedSupport099.computeRenderingSupport0121377(resourceArchiveArgument1.computeByteArray0912(integerArgument3, 75, integerArgument2), (byte) 25);
            return stackRenderingSupport012Local3;
          }
          stackRenderingSupport012Local2 = (RenderingSupport012) null;
          return stackRenderingSupport012Local2;
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    static {
        stringState0132 = "<%0> CHAIN";
        stringState0130 = "Password is valid";
        stringState0131 = "Cancel draw";
    }
}
