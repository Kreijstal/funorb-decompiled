/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResourceSupport003 {
    static String stringState0381;
    static MixedSupport132 mixedSupport132State0008;
    static boolean booleanState0126;
    static int integerState0553;
    static boolean booleanState0127;
    static byte[][] byteArrayArrayState0006;
    static String stringState0382;
    static int integerState0554;
    static int integerState0555;

    abstract ResourceSupport001 computeResourceSupport0010949(boolean booleanArgument1);

    public static void clearStaticReferences(byte byteArgument1) {
        stringState0382 = null;
        if (byteArgument1 > 88) {
          byteArrayArrayState0006 = (byte[][]) null;
          stringState0381 = null;
          mixedSupport132State0008 = null;
          return;
        }
        stringState0381 = (String) null;
        byteArrayArrayState0006 = (byte[][]) null;
        stringState0381 = null;
        mixedSupport132State0008 = null;
    }

    abstract int computeInteger0947(int integerArgument1, int integerArgument2);

    final static void performAction1164(int integerArgument1) {
        GameDomainSupport001.integerState0053 = GameDomainSupport001.integerState0053 + 1;
        if (integerArgument1 != 0) {
          return;
        }
        LoginCredentials.integerState0348 = LoginCredentials.integerState0348 + 1;
        if (GameDomainSupport001.integerState0053 >= 131072) {
          GameDomainSupport001.integerState0053 = 0;
          if (LoginCredentials.integerState0348 <= 255) {
            return;
          }
          if (MixedSupport117.integerState0757 <= 20) {
            MixedSupport117.integerState0757 = MixedSupport117.integerState0757 + 1;
            LoginCredentials.integerState0348 = 255;
            return;
          }
          PlayerNameAvailabilityValidator.integerState0354 = PlayerNameAvailabilityValidator.integerState0354 + 1;
          LoginCredentials.integerState0348 = 0;
          MixedSupport117.integerState0757 = 0;
          if (MixedSupport081.integerArrayState0153.length <= PlayerNameAvailabilityValidator.integerState0354) {
            PlayerNameAvailabilityValidator.integerState0354 = 0;
            return;
          }
          return;
        }
        if (LoginCredentials.integerState0348 <= 255) {
          return;
        }
        if (MixedSupport117.integerState0757 <= 20) {
          MixedSupport117.integerState0757 = MixedSupport117.integerState0757 + 1;
          LoginCredentials.integerState0348 = 255;
          return;
        }
        PlayerNameAvailabilityValidator.integerState0354 = PlayerNameAvailabilityValidator.integerState0354 + 1;
        LoginCredentials.integerState0348 = 0;
        MixedSupport117.integerState0757 = 0;
        if (MixedSupport081.integerArrayState0153.length <= PlayerNameAvailabilityValidator.integerState0354) {
          PlayerNameAvailabilityValidator.integerState0354 = 0;
          return;
        }
    }

    abstract byte[] computeByteArray0946(int integerArgument1, byte byteArgument2);

    final static void performAction1165(boolean booleanArgument1, int integerArgument2) {
        HashNode hashNodeLocal1 = null;
        int integerLocal2 = 0;
        NetworkSupport005 networkSupport005Local3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          networkSupport005Local3 = (NetworkSupport005) (RenderingSupport002.nodeDequeState0004.beginBackward((byte) -112));
          while (networkSupport005Local3 != null) {
            MixedSupport070.performAction0912(integerArgument2, -15016, networkSupport005Local3);
            networkSupport005Local3 = (NetworkSupport005) (RenderingSupport002.nodeDequeState0004.nextBackward(true));
          }
          if (booleanArgument1) {
            ResourceSupport003.performAction1165(true, -48);
          }
          hashNodeLocal1 = PcmPlayerService.nodeDequeState0028.beginBackward((byte) 109);
          while (hashNodeLocal1 != null) {
            MixedSupport050.performAction0597(integerArgument2, 47);
            hashNodeLocal1 = PcmPlayerService.nodeDequeState0028.nextBackward(true);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal5), "of.C(" + booleanArgument1 + ',' + integerArgument2 + ')');
        }
    }

    static {
        stringState0381 = "That name is not available";
        mixedSupport132State0008 = new MixedSupport132();
        byteArrayArrayState0006 = new byte[1000][];
        stringState0382 = "ESC - cancel private message";
        integerState0555 = -1;
    }
}
