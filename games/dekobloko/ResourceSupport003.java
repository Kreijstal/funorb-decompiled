/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResourceSupport003 {
    static String stringState0381;
    static MixedSupport139 mixedSupport139State0008;
    static boolean booleanState0126;
    static int integerState0553;
    static boolean booleanState0127;
    static byte[][] byteArrayArrayState0006;
    static String stringState0382;
    static int integerState0554;
    static int integerState0555;

    abstract ResourceSupport001 computeResourceSupport0011070(boolean booleanArgument1);

    public static void performAction1333(byte byteArgument1) {
        stringState0382 = null;
        if (byteArgument1 > 88) {
          byteArrayArrayState0006 = (byte[][]) null;
          stringState0381 = null;
          mixedSupport139State0008 = null;
          return;
        }
        stringState0381 = (String) null;
        byteArrayArrayState0006 = (byte[][]) null;
        stringState0381 = null;
        mixedSupport139State0008 = null;
    }

    abstract int computeInteger1068(int integerArgument1, int integerArgument2);

    final static void performAction1334(int integerArgument1) {
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
          if (MixedSupport122.integerState0757 <= 20) {
            MixedSupport122.integerState0757 = MixedSupport122.integerState0757 + 1;
            LoginCredentials.integerState0348 = 255;
            return;
          }
          MixedSupport069.integerState0354 = MixedSupport069.integerState0354 + 1;
          LoginCredentials.integerState0348 = 0;
          MixedSupport122.integerState0757 = 0;
          if (MixedSupport085.integerArrayState0153.length <= MixedSupport069.integerState0354) {
            MixedSupport069.integerState0354 = 0;
            return;
          }
          return;
        }
        if (LoginCredentials.integerState0348 <= 255) {
          return;
        }
        if (MixedSupport122.integerState0757 <= 20) {
          MixedSupport122.integerState0757 = MixedSupport122.integerState0757 + 1;
          LoginCredentials.integerState0348 = 255;
          return;
        }
        MixedSupport069.integerState0354 = MixedSupport069.integerState0354 + 1;
        LoginCredentials.integerState0348 = 0;
        MixedSupport122.integerState0757 = 0;
        if (MixedSupport085.integerArrayState0153.length <= MixedSupport069.integerState0354) {
          MixedSupport069.integerState0354 = 0;
          return;
        }
    }

    abstract byte[] computeByteArray1067(int integerArgument1, byte byteArgument2);

    final static void performAction1335(boolean booleanArgument1, int integerArgument2) {
        HashNode hashNodeLocal1 = null;
        int integerLocal2 = 0;
        NetworkSupport005 networkSupport005Local3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          networkSupport005Local3 = (NetworkSupport005) (RenderingSupport002.nodeDequeState0004.computeHashNode1970((byte) -112));
          while (networkSupport005Local3 != null) {
            MixedSupport074.performAction1031(integerArgument2, -15016, networkSupport005Local3);
            networkSupport005Local3 = (NetworkSupport005) (RenderingSupport002.nodeDequeState0004.computeHashNode1974(true));
          }
          if (booleanArgument1) {
            ResourceSupport003.performAction1335(true, -48);
          }
          hashNodeLocal1 = AudioSupport004.nodeDequeState0028.computeHashNode1970((byte) 109);
          while (hashNodeLocal1 != null) {
            MixedSupport050.performAction0659(integerArgument2, 47);
            hashNodeLocal1 = AudioSupport004.nodeDequeState0028.computeHashNode1974(true);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal5), "of.C(" + booleanArgument1 + ',' + integerArgument2 + ')');
        }
    }

    static {
        stringState0381 = "That name is not available";
        mixedSupport139State0008 = new MixedSupport139();
        byteArrayArrayState0006 = new byte[1000][];
        stringState0382 = "ESC - cancel private message";
        integerState0555 = -1;
    }
}
