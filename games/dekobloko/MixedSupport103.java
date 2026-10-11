/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MixedSupport103 {
    static RgbSprite rgbSpriteState0040;
    static String stringState0414;
    static String stringState0415;
    static String stringState0416;
    static SceneWidget sceneWidgetState0096;

    public static void performAction1394(int integerArgument1) {
        sceneWidgetState0096 = null;
        stringState0416 = null;
        stringState0415 = null;
        stringState0414 = null;
        if (integerArgument1 != -1) {
          MixedSupport103.computeBoolean1395(100, -24);
        }
        rgbSpriteState0040 = null;
    }

    final static void performAction1397(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        MixedSupport034 mixedSupport034Local6 = null;
        Object objectLocal7 = null;
        int integerLocal8 = 0;
        MixedSupport053 mixedSupport053Local9 = null;
        CipherPacketBuffer cipherPacketBufferLocal10 = null;
        byte[] byteArrayLocal11 = null;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          cipherPacketBufferLocal10 = UiComponentPart006.cipherPacketBufferState0001;
          integerLocal3 = cipherPacketBufferLocal10.computeInteger2085((byte) -119);
          if (integerArgument1 != 14750) {
            sceneWidgetState0096 = (SceneWidget) null;
          }
          if (integerLocal3 == 0) {
            mixedSupport053Local9 = (MixedSupport053) (NetworkSupport002.nodeDequeState0002.computeHashNode1970((byte) 80));
            if (mixedSupport053Local9 == null) {
              NodeHashTable.performAction1703(67);
              return;
            }
            integerLocal5 = cipherPacketBufferLocal10.computeInteger2085((byte) -90);
            if (0 == integerLocal5) {
              objectLocal7 = null;
            } else {
              byteArrayLocal11 = new byte[integerLocal5];
              cipherPacketBufferLocal10.performAction2075(byteArrayLocal11, 0, (byte) 125, integerLocal5);
            }
            cipherPacketBufferLocal10.position = cipherPacketBufferLocal10.position + 4;
            if (!cipherPacketBufferLocal10.computeBoolean2094(0)) {
              NodeHashTable.performAction1703(integerArgument1 ^ 14802);
              return;
            }
            mixedSupport053Local9.performAction0161((byte) 109);
          } else {
            if (integerLocal3 == 1) {
              integerLocal4 = cipherPacketBufferLocal10.computeInteger2096(7553);
              mixedSupport034Local6 = (MixedSupport034) (MixedSupport117.nodeDequeState0030.computeHashNode1970((byte) 46));
              while (mixedSupport034Local6 != null) {
                if (integerLocal4 != mixedSupport034Local6.integerState0218) {
                  mixedSupport034Local6 = (MixedSupport034) (MixedSupport117.nodeDequeState0030.computeHashNode1974(true));
                  continue;
                }
                break;
              }
              if (mixedSupport034Local6 != null) {
                mixedSupport034Local6.performAction0161((byte) 119);
                return;
              }
              NodeHashTable.performAction1703(60);
              return;
            }
            NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "A1: " + BufferedSocket.computeString1563((byte) 47));
            NodeHashTable.performAction1703(78);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal1 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "pe.E(" + integerArgument1 + ')');
        }
    }

    final static boolean computeBoolean1398(int integerArgument1, int integerArgument2) {
        try {
          int integerLocal1 = 0;
          Throwable caughtExceptionLocal2 = null;
          IOException iOExceptionLocal3 = null;
          if (integerArgument1 != 25973) {
            stringState0416 = (String) null;
          }
          if (UiComponentPart006.cipherPacketBufferState0001.position >= integerArgument2) {
            return true;
          }
          if (GameSession.bufferedSocketState0002 == null) {
            return false;
          }
          try {
            integerLocal1 = GameSession.bufferedSocketState0002.computeInteger1560(0);
            if (integerLocal1 > 0) {
              if (-UiComponentPart006.cipherPacketBufferState0001.position + integerArgument2 < integerLocal1) {
                integerLocal1 = -UiComponentPart006.cipherPacketBufferState0001.position + integerArgument2;
              }
              GameSession.bufferedSocketState0002.performAction1556(integerLocal1, UiComponentPart006.cipherPacketBufferState0001.position, (byte) 17, UiComponentPart006.cipherPacketBufferState0001.payload);
              MixedSupport100.longState0040 = MixedSupport063.computeLong0827(4);
              UiComponentPart006.cipherPacketBufferState0001.position = UiComponentPart006.cipherPacketBufferState0001.position + integerLocal1;
              if (integerArgument2 > UiComponentPart006.cipherPacketBufferState0001.position) {
                return false;
              }
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
              return true;
            }
            if (integerLocal1 < 0) {
              NodeHashTable.performAction1703(69);
            } else {
              if (MixedSupport122.computeLong1734(integerArgument1 - 25974) <= 30000L) {
                return false;
              }
              NodeHashTable.performAction1703(69);
            }
          } catch (java.io.IOException caughtParameterLocal4) {
            caughtExceptionLocal2 = caughtParameterLocal4;
            iOExceptionLocal3 = (IOException) (Object) caughtExceptionLocal2;
            NodeHashTable.performAction1703(96);
          }
          return false;
        } catch (RuntimeException | Error uncheckedExceptionLocal5) {
          throw uncheckedExceptionLocal5;
        } catch (Throwable checkedExceptionLocal6) {
          throw new RuntimeException(checkedExceptionLocal6);
        }
    }

    final static int computeInteger1396(byte[] byteArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = -1;
          if (integerArgument3 > -103) {
            MixedSupport103.computeBoolean1395(73, -42);
          }
          for (integerLocal1 = integerArgument4; integerLocal1 < integerArgument2; integerLocal1++) {
            integerLocal2 = MixedSupport001.integerArrayState0003[(byteArrayArgument1[integerLocal1] ^ integerLocal2) & 255] ^ integerLocal2 >>> 8;
          }
          integerLocal2 = ~integerLocal2;
          stackIntegerLocal5 = integerLocal2;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal3 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal3;
          stackStringBuilderLocal7 = new StringBuilder().append("pe.A(");
          if (byteArrayArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static boolean computeBoolean1395(int integerArgument1, int integerArgument2) {
        if (integerArgument1 != 922790152) {
          return false;
        }
        return integerArgument2 == (-integerArgument2 & integerArgument2) ? true : false;
    }

    static {
        stringState0415 = "Passwords must be between 5 and 20 characters long";
        stringState0414 = "Please remove <%0> from your ignore list first.";
    }
}
