/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport050 extends MixedSupport024 {
    static String stringState0208;
    static int integerState0265;
    static boolean booleanState0064;

    final static void performAction0658(int integerArgument1, int integerArgument2) {
        PlatformSupport006.integerArrayState0198 = new int[3];
        ComponentContainer.integerState0376 = integerArgument2;
        MixedSupport102.mixedSupport056ArrayState0001 = new MixedSupport056[integerArgument2 * 15];
        if (integerArgument1 == -3504) {
          MixedSupport058.integerState0317 = 0;
          return;
        }
        stringState0208 = (String) null;
        MixedSupport058.integerState0317 = 0;
    }

    private MixedSupport050(BitmapFont bitmapFontArgument1, int integerArgument2) {
        super(bitmapFontArgument1, integerArgument2);
    }

    MixedSupport050(int integerArgument1) {
        this(GameDomainSupport003.bitmapFontState0015, integerArgument1);
    }

    public static void performAction0660(int integerArgument1) {
        int integerLocal1 = 85 / ((-16 - integerArgument1) / 51);
        stringState0208 = null;
    }

    final String computeString0021(UiComponent uiComponentArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          integerLocal1 = 61 / ((byteArgument2 - 59) / 53);
          stackStringLocal3 = UiComponentPart032.computeString1925('*', uiComponentArgument1.stringState0078.length(), -12681);
          return stackStringLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("gm.D(");
          if (uiComponentArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction0659(int integerArgument1, int integerArgument2) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        CipherPacketBuffer cipherPacketBufferLocal2;
        if (integerArgument2 > 35) {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.performAction1861(integerArgument1, -4);
          cipherPacketBufferLocal1.performAction2073(true, 1);
          cipherPacketBufferLocal1.performAction2073(true, 2);
          return;
        }
        stringState0208 = (String) null;
        cipherPacketBufferLocal2 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal2.performAction1861(integerArgument1, -4);
        cipherPacketBufferLocal2.performAction2073(true, 1);
        cipherPacketBufferLocal2.performAction2073(true, 2);
    }

    static {
        stringState0208 = "OK";
    }
}
