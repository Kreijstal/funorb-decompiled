/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NetworkArchiveRequestManager extends NetworkSupport003 {
    static CacheWorkQueue cacheWorkQueueState0003;
    static String stringState0438;
    private BufferedSocket bufferedSocketState0001;
    static MixedSupport084 mixedSupport084State0003;
    static RgbSprite rgbSpriteState0044;
    static int integerState0598;
    static SceneWidget sceneWidgetState0098;

    final void performAction0386(byte byteArgument1) {
        if (byteArgument1 < 107) {
          this.performAction0386((byte) 12);
        }
        if (null != this.bufferedSocketState0001) {
          this.bufferedSocketState0001.performAction1555(0);
        }
    }

    final void performAction0376(Object objectArgument1, byte byteArgument2, boolean booleanArgument3) {
        try {
          RuntimeException stackRuntimeExceptionLocal1 = null;
          StringBuilder stackStringBuilderLocal2 = null;
          String stackStringLocal3 = null;
          Throwable caughtExceptionLocal4 = null;
          Exception exceptionLocal5 = null;
          int integerLocal6 = 0;
          RuntimeException runtimeExceptionLocal7 = null;
          ResourceSupport004 resourceSupport004Local8 = null;
          IOException iOExceptionLocal9 = null;
          Exception exceptionLocal10 = null;
          int integerLocal11 = 0;
          ResourceSupport004 resourceSupport004Local12;
          integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            if (null != this.bufferedSocketState0001) {
              try {
                this.bufferedSocketState0001.performAction1555(0);
              } catch (java.lang.Exception caughtParameterLocal13) {
                caughtExceptionLocal4 = caughtParameterLocal13;
                exceptionLocal5 = (Exception) (Object) caughtExceptionLocal4;
              }
              this.bufferedSocketState0001 = null;
            }
            this.bufferedSocketState0001 = (BufferedSocket) (objectArgument1);
            this.performAction1471((byte) -15);
            this.performAction1465((byte) -124, booleanArgument3);
            integerLocal6 = -84 % ((byteArgument2 + 75) / 50);
            this.resourceSupport004State0001 = null;
            this.packetBufferState0003.position = 0;
            while (true) {
              resourceSupport004Local8 = (ResourceSupport004) (this.dualNodeDequeState0002.computeDualNode0029((byte) -111));
              if (resourceSupport004Local8 != null) {
                this.dualNodeDequeState0001.performAction0032(resourceSupport004Local8, -7267);
                continue;
              }
              break;
            }
            while (true) {
              resourceSupport004Local12 = (ResourceSupport004) (this.dualNodeDequeState0004.computeDualNode0029((byte) -71));
              if (resourceSupport004Local12 != null) {
                this.dualNodeDequeState0003.performAction0032(resourceSupport004Local12, -7267);
                continue;
              }
              break;
            }
            if (0 != this.byteState0001) {
              try {
                this.packetBufferState0002.position = 0;
                this.packetBufferState0002.performAction2073(true, 4);
                this.packetBufferState0002.performAction2073(true, (int) this.byteState0001);
                this.packetBufferState0002.performAction2067(0, false);
                this.bufferedSocketState0001.performAction1557(0, this.packetBufferState0002.payload.length, 1, this.packetBufferState0002.payload);
              } catch (java.io.IOException caughtParameterLocal14) {
                caughtExceptionLocal4 = caughtParameterLocal14;
                iOExceptionLocal9 = (IOException) (Object) caughtExceptionLocal4;
                try {
                  this.bufferedSocketState0001.performAction1555(0);
                } catch (java.lang.Exception caughtParameterLocal15) {
                  caughtExceptionLocal4 = caughtParameterLocal15;
                  exceptionLocal10 = (Exception) (Object) caughtExceptionLocal4;
                }
                this.integerState0132 = this.integerState0132 + 1;
                this.integerState0131 = -2;
                this.bufferedSocketState0001 = null;
              }
            }
            this.integerState0130 = 0;
            this.longState0006 = MixedSupport063.computeLong0827(4);
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal16) {
            caughtExceptionLocal4 = caughtParameterLocal16;
            runtimeExceptionLocal7 = (RuntimeException) (Object) caughtExceptionLocal4;
            stackRuntimeExceptionLocal1 = runtimeExceptionLocal7;
            stackStringBuilderLocal2 = new StringBuilder().append("qb.K(");
            if (objectArgument1 == null) {
              stackStringLocal3 = "null";
            } else {
              stackStringLocal3 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(byteArgument2).append(',').append(booleanArgument3).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal17) {
          throw uncheckedExceptionLocal17;
        } catch (Throwable checkedExceptionLocal18) {
          throw new RuntimeException(checkedExceptionLocal18);
        }
    }

    private final void performAction1465(byte byteArgument1, boolean booleanArgument2) {
        try {
          IOException iOException = null;
          PacketBuffer stackPacketBufferLocal2 = null;
          boolean stackBooleanLocal3 = false;
          int stackIntegerLocal4 = 0;
          Throwable caughtExceptionLocal5 = null;
          Exception exceptionLocal6 = null;
          if (null == this.bufferedSocketState0001) {
            return;
          }
          try {
            this.packetBufferState0002.position = 0;
            stackPacketBufferLocal2 = this.packetBufferState0002;
            stackBooleanLocal3 = true;
            if (!booleanArgument2) {
              stackIntegerLocal4 = 3;
            } else {
              stackIntegerLocal4 = 2;
            }
            ((PacketBuffer) (Object) stackPacketBufferLocal2).performAction2073(stackBooleanLocal3, stackIntegerLocal4);
            if (byteArgument1 >= -108) {
              return;
            }
            this.packetBufferState0002.performAction2065(-93, 0L);
            this.bufferedSocketState0001.performAction1557(0, this.packetBufferState0002.payload.length, 1, this.packetBufferState0002.payload);
          } catch (java.io.IOException caughtParameterLocal7) {
            caughtExceptionLocal5 = caughtParameterLocal7;
            iOException = (IOException) (Object) caughtExceptionLocal5;
            try {
              this.bufferedSocketState0001.performAction1555(0);
            } catch (java.lang.Exception caughtParameterLocal8) {
              caughtExceptionLocal5 = caughtParameterLocal8;
              exceptionLocal6 = (Exception) (Object) caughtExceptionLocal5;
            }
            this.integerState0132 = this.integerState0132 + 1;
            this.integerState0131 = -2;
            this.bufferedSocketState0001 = null;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal9) {
          throw uncheckedExceptionLocal9;
        } catch (Throwable checkedExceptionLocal10) {
          throw new RuntimeException(checkedExceptionLocal10);
        }
    }

    final static int computeInteger1469(boolean booleanArgument1, int integerArgument2, LoginCredentials loginCredentialsArgument3, int integerArgument4, int integerArgument5, LoginCredentials loginCredentialsArgument6, String stringArgument7) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        PacketBuffer stackPacketBufferLocal3 = null;
        int stackIntegerLocal4 = 0;
        String stackStringLocal5 = null;
        PacketBuffer stackPacketBufferLocal6 = null;
        int stackIntegerLocal7 = 0;
        String stackStringLocal8 = null;
        int stackIntegerLocal9 = 0;
        int stackIntegerLocal10 = 0;
        int stackIntegerLocal11 = 0;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        RuntimeException stackRuntimeExceptionLocal14 = null;
        StringBuilder stackStringBuilderLocal15 = null;
        String stackStringLocal16 = null;
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        StringBuilder stackStringBuilderLocal19 = null;
        String stackStringLocal20 = null;
        RuntimeException caughtExceptionLocal21 = null;
        RuntimeException runtimeExceptionLocal22 = null;
        int integerLocal23 = 0;
        String stringLocal24 = null;
        int integerLocal25 = 0;
        String stringLocal26 = null;
        int integerLocal27 = 0;
        String stringLocal28 = null;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        String stringLocal31 = null;
        Object objectLocal32 = null;
        CharSequence charSequenceLocal33 = null;
        String stringLocal34;
        String stringLocal35;
        String stringLocal36;
        String stringLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        objectLocal32 = null;
        integerLocal30 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          stringLocal31 = loginCredentialsArgument3.computeString0891((byte) 56);
          stringLocal28 = stringLocal31;
          stringLocal34 = stringLocal31;
          integerLocal23 = -65 / ((-58 - integerArgument4) / 43);
          stringLocal24 = loginCredentialsArgument6.computeString0891((byte) 56);
          stringLocal35 = stringLocal24;
          stringLocal36 = stringLocal24;
          if (null == GameSession.bufferedSocketState0002 &&
            !NetworkSupport006.computeBoolean1152(false, -75)) {
            stackIntegerLocal2 = -1;
            return stackIntegerLocal2;
          }
          if (UiComponentPart023.mixedSupport139State0009 == ResourceSupport002.mixedSupport139State0001) {
            SceneWidgetPart014.booleanState0220 = null;
            SocketFactory.cipherPacketBufferState0002.position = 0;
            if (stringArgument7 == null) {
              MixedSupport147.packetBufferState0008.position = 0;
              MixedSupport147.packetBufferState0008.performAction2067(RenderingSupport004.randomState0002.nextInt(), false);
              MixedSupport147.packetBufferState0008.performAction2067(RenderingSupport004.randomState0002.nextInt(), false);
              stackPacketBufferLocal3 = MixedSupport147.packetBufferState0008;
              stackIntegerLocal4 = 8;
              if (!loginCredentialsArgument3.computeBoolean0895(true)) {
                stackStringLocal5 = "";
              } else {
                stackStringLocal5 = stringLocal31;
              }
              ((PacketBuffer) (Object) stackPacketBufferLocal3).performAction2078(stackIntegerLocal4, stackStringLocal5);
              stackPacketBufferLocal6 = MixedSupport147.packetBufferState0008;
              stackIntegerLocal7 = 8;
              if (loginCredentialsArgument6.computeBoolean0895(true)) {
                stackStringLocal8 = stringLocal24;
              } else {
                stackStringLocal8 = "";
              }
              ((PacketBuffer) (Object) stackPacketBufferLocal6).performAction2078(stackIntegerLocal7, stackStringLocal8);
              SocketFactory.cipherPacketBufferState0002.performAction2073(true, 16);
              SocketFactory.cipherPacketBufferState0002.position = SocketFactory.cipherPacketBufferState0002.position + 1;
              integerLocal25 = SocketFactory.cipherPacketBufferState0002.position;
              CodecSupport003.performAction1618(AnimatedTileRegion.bigIntegerState0004, RichTextLayout.bigIntegerState0001, SocketFactory.cipherPacketBufferState0002, MixedSupport147.packetBufferState0008, 0);
              SocketFactory.cipherPacketBufferState0002.performAction2079(-integerLocal25 + SocketFactory.cipherPacketBufferState0002.position, true);
            } else {
              integerLocal25 = 0;
              if (booleanArgument1) {
                integerLocal25 = integerLocal25 | 1;
              }
              MixedSupport147.packetBufferState0008.position = 0;
              MixedSupport147.packetBufferState0008.performAction2067(RenderingSupport004.randomState0002.nextInt(), false);
              MixedSupport147.packetBufferState0008.performAction2067(RenderingSupport004.randomState0002.nextInt(), false);
              MixedSupport147.packetBufferState0008.performAction2078(8, stringLocal31);
              MixedSupport147.packetBufferState0008.performAction2078(8, stringLocal24);
              charSequenceLocal33 = (CharSequence) ((Object) stringArgument7);
              MixedSupport147.packetBufferState0008.performAction2078(8, MixedSupport009.computeString0112(charSequenceLocal33, 65));
              MixedSupport147.packetBufferState0008.performAction2087(-1, integerArgument5);
              MixedSupport147.packetBufferState0008.performAction2073(true, integerArgument2);
              MixedSupport147.packetBufferState0008.performAction2073(true, integerLocal25);
              SocketFactory.cipherPacketBufferState0002.performAction2073(true, 18);
              SocketFactory.cipherPacketBufferState0002.position = SocketFactory.cipherPacketBufferState0002.position + 2;
              integerLocal27 = SocketFactory.cipherPacketBufferState0002.position;
              stringLocal37 = MixedSupport001.computeString0016(UiComponentPart029.computeApplet1689(25144), (byte) 121);
              if (stringLocal37 == null) {
                stringLocal37 = "";
              }
              SocketFactory.cipherPacketBufferState0002.performAction2066(0, stringLocal37);
              CodecSupport003.performAction1618(AnimatedTileRegion.bigIntegerState0004, RichTextLayout.bigIntegerState0001, SocketFactory.cipherPacketBufferState0002, MixedSupport147.packetBufferState0008, 0);
              SocketFactory.cipherPacketBufferState0002.performAction2081(true, -integerLocal27 + SocketFactory.cipherPacketBufferState0002.position);
            }
            UiComponentPart033.performAction2052(4792, -1);
            UiComponentPart023.mixedSupport139State0009 = MixedSupport071.mixedSupport139State0003;
          }
          if (MixedSupport071.mixedSupport139State0003 == UiComponentPart023.mixedSupport139State0009 &&
            MixedSupport103.computeBoolean1398(25973, 1)) {
            integerLocal39 = UiComponentPart006.cipherPacketBufferState0001.computeInteger2085((byte) -70);
            UiComponentPart006.cipherPacketBufferState0001.position = 0;
            if (integerLocal39 >= 100 &&
              integerLocal39 <= 105) {
              UiComponentPart023.mixedSupport139State0009 = MixedSupport083.mixedSupport139State0006;
              UiComponentPart023.stringArrayState0030 = new String[-100 + integerLocal39];
            } else {
              if (integerLocal39 == 248) {
                LoginCredentials.performAction0894(UiComponentPart029.computeApplet1689(25144), 0);
                UiComponentPart028.stringState0483 = SceneWidgetPart012.stringState0533;
                NodeHashTable.performAction1703(89);
                SceneWidgetPart006.booleanState0083 = false;
                stackIntegerLocal9 = integerLocal39;
                return stackIntegerLocal9;
              }
              if (99 == integerLocal39) {
                MixedSupport103.computeBoolean1398(25973, MixedSupport147.computeInteger1957(1));
                SceneWidgetPart014.booleanState0220 = new Boolean(MixedSupport033.computeBoolean0547(UiComponentPart006.cipherPacketBufferState0001, 19));
                UiComponentPart006.cipherPacketBufferState0001.position = 0;
              } else {
                NetworkSupport012.integerState0759 = -1;
                HashNode.integerState0070 = integerLocal39;
                UiComponentPart023.mixedSupport139State0009 = MixedSupport112.mixedSupport139State0010;
              }
            }
          }
          if (UiComponentPart023.mixedSupport139State0009 == MixedSupport083.mixedSupport139State0006) {
            integerLocal40 = 2;
            if (MixedSupport103.computeBoolean1398(25973, integerLocal40)) {
              integerLocal38 = UiComponentPart006.cipherPacketBufferState0001.computeInteger2089(3);
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
              if (MixedSupport103.computeBoolean1398(25973, integerLocal38)) {
                integerLocal29 = UiComponentPart023.stringArrayState0030.length;
                for (integerLocal1 = 0; integerLocal29 > integerLocal1; integerLocal1++) {
                  UiComponentPart023.stringArrayState0030[integerLocal1] = UiComponentPart006.cipherPacketBufferState0001.computeString2080(true);
                }
                NodeHashTable.performAction1703(60);
                SceneWidgetPart006.booleanState0083 = false;
                stackIntegerLocal10 = integerLocal29 + 100;
                return stackIntegerLocal10;
              }
            }
          }
          if (MixedSupport112.mixedSupport139State0010 == UiComponentPart023.mixedSupport139State0009 &&
            MixedSupport039.computeBoolean0580((byte) 117)) {
            if (255 == HashNode.integerState0070) {
              stringLocal26 = UiComponentPart006.cipherPacketBufferState0001.computeString2083(-16829);
              if (stringLocal26 != null) {
                MixedSupport001.performAction0017(stringLocal26, false, UiComponentPart029.computeApplet1689(25144));
              }
            } else {
              UiComponentPart028.stringState0483 = UiComponentPart006.cipherPacketBufferState0001.computeString2082((byte) -38);
            }
            NodeHashTable.performAction1703(105);
            SceneWidgetPart006.booleanState0083 = false;
            stackIntegerLocal11 = HashNode.integerState0070;
            return stackIntegerLocal11;
          }
          if (null == GameSession.bufferedSocketState0002) {
            if (SceneWidgetPart006.booleanState0083) {
              if (30000L < MixedSupport122.computeLong1734(-1)) {
                UiComponentPart028.stringState0483 = MixedSupport073.stringState0311;
              } else {
                UiComponentPart028.stringState0483 = CodecSupport003.stringState0470;
              }
              SceneWidgetPart006.booleanState0083 = false;
              stackIntegerLocal12 = 249;
              return stackIntegerLocal12;
            }
            integerLocal41 = MixedSupport052.integerState0270;
            MixedSupport052.integerState0270 = UiComponentPart010.integerState0189;
            SceneWidgetPart006.booleanState0083 = true;
            UiComponentPart010.integerState0189 = integerLocal41;
          }
          stackIntegerLocal13 = -1;
          return stackIntegerLocal13;
        } catch (java.lang.RuntimeException caughtParameterLocal42) {
          caughtExceptionLocal21 = caughtParameterLocal42;
          runtimeExceptionLocal22 = caughtExceptionLocal21;
          stackRuntimeExceptionLocal14 = runtimeExceptionLocal22;
          stackStringBuilderLocal15 = new StringBuilder().append("qb.F(").append(booleanArgument1).append(',').append(integerArgument2).append(',');
          if (loginCredentialsArgument3 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          stackStringBuilderLocal17 = ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (loginCredentialsArgument6 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          stackStringBuilderLocal19 = ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',');
          if (stringArgument7 == null) {
            stackStringLocal20 = "null";
          } else {
            stackStringLocal20 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal14), ((StringBuilder) (Object) stackStringBuilderLocal19).append(stackStringLocal20).append(')').toString());
        }
    }

    final boolean computeBoolean0374(byte byteArgument1) {
        try {
          int integerLocal1 = 0;
          int stackIntegerLocal2 = 0;
          int stackIntegerLocal3 = 0;
          Throwable caughtExceptionLocal4 = null;
          long longLocal5 = 0L;
          ResourceSupport004 resourceSupport004Local6 = null;
          IOException iOExceptionLocal7 = null;
          int integerLocal8 = 0;
          Exception exceptionLocal9 = null;
          int integerLocal10 = 0;
          Exception exceptionLocal11 = null;
          int integerLocal12 = 0;
          int integerLocal13 = 0;
          int integerLocal14 = 0;
          int integerLocal15 = 0;
          int integerLocal16 = 0;
          int integerLocal17 = 0;
          int integerLocal18 = 0;
          long longLocal19 = 0L;
          Object objectLocal20 = null;
          ResourceSupport004 resourceSupport004Local21 = null;
          int integerLocal22 = 0;
          int integerLocal23 = 0;
          ResourceSupport004 resourceSupport004Local24;
          integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          if (null != this.bufferedSocketState0001) {
            longLocal5 = MixedSupport063.computeLong0827(byteArgument1 ^ -52);
            integerLocal10 = (int)(-this.longState0006 + longLocal5);
            if (200 < integerLocal10) {
              integerLocal10 = 200;
            }
            this.longState0006 = longLocal5;
            this.integerState0130 = this.integerState0130 + integerLocal10;
            if (this.integerState0130 > 30000) {
              try {
                this.bufferedSocketState0001.performAction1555(0);
              } catch (java.lang.Exception caughtParameterLocal25) {
                caughtExceptionLocal4 = caughtParameterLocal25;
                exceptionLocal11 = (Exception) (Object) caughtExceptionLocal4;
              }
              this.bufferedSocketState0001 = null;
            }
          }
          if (null == this.bufferedSocketState0001) {
            if (this.computeInteger0384((byte) -114) == 0 &&
              this.computeInteger0385(byteArgument1 ^ -56) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.bufferedSocketState0001.performAction1559((byte) -124);
            resourceSupport004Local6 = (ResourceSupport004) (this.dualNodeDequeState0001.computeDualNode0034(-2198));
            while (resourceSupport004Local6 != null) {
              this.packetBufferState0002.position = 0;
              this.packetBufferState0002.performAction2073(true, 1);
              this.packetBufferState0002.performAction2065(-71, resourceSupport004Local6.longState0003);
              this.bufferedSocketState0001.performAction1557(0, this.packetBufferState0002.payload.length, 1, this.packetBufferState0002.payload);
              this.dualNodeDequeState0002.performAction0032(resourceSupport004Local6, -7267);
              resourceSupport004Local6 = (ResourceSupport004) (this.dualNodeDequeState0001.computeDualNode0033((byte) 20));
            }
            if (byteArgument1 != -56) {
              return false;
            }
            resourceSupport004Local24 = (ResourceSupport004) (this.dualNodeDequeState0003.computeDualNode0034(-2198));
            while (resourceSupport004Local24 != null) {
              this.packetBufferState0002.position = 0;
              this.packetBufferState0002.performAction2073(true, 0);
              this.packetBufferState0002.performAction2065(-98, resourceSupport004Local24.longState0003);
              this.bufferedSocketState0001.performAction1557(0, this.packetBufferState0002.payload.length, 1, this.packetBufferState0002.payload);
              this.dualNodeDequeState0004.performAction0032(resourceSupport004Local24, -7267);
              resourceSupport004Local24 = (ResourceSupport004) (this.dualNodeDequeState0003.computeDualNode0033((byte) 20));
            }
            for (integerLocal1 = 0; integerLocal1 < 100; integerLocal1++) {
              integerLocal8 = this.bufferedSocketState0001.computeInteger1560(0);
              if (integerLocal8 < 0) {
                throw new IOException();
              }
              if (integerLocal8 == 0) {
                return true;
              }
              this.integerState0130 = 0;
              integerLocal10 = 0;
              if (null != this.resourceSupport004State0001) {
                if (0 == this.resourceSupport004State0001.integerState0582) {
                  integerLocal10 = 1;
                }
              } else {
                integerLocal10 = 10;
              }
              if (integerLocal10 <= 0) {
                integerLocal12 = -this.resourceSupport004State0001.byteState0003 + this.resourceSupport004State0001.packetBufferState0007.payload.length;
                integerLocal13 = -this.resourceSupport004State0001.integerState0582 + 512;
                if (integerLocal13 > integerLocal12 - this.resourceSupport004State0001.packetBufferState0007.position) {
                  integerLocal13 = integerLocal12 - this.resourceSupport004State0001.packetBufferState0007.position;
                }
                if (integerLocal13 > integerLocal8) {
                  integerLocal13 = integerLocal8;
                }
                this.bufferedSocketState0001.performAction1556(integerLocal13, this.resourceSupport004State0001.packetBufferState0007.position, (byte) 17, this.resourceSupport004State0001.packetBufferState0007.payload);
                if (0 != this.byteState0001) {
                  for (integerLocal14 = 0; integerLocal14 < integerLocal13; integerLocal14++) {
                    this.resourceSupport004State0001.packetBufferState0007.payload[integerLocal14 + this.resourceSupport004State0001.packetBufferState0007.position] = (byte)MixedSupport111.computeInteger1576((int) this.resourceSupport004State0001.packetBufferState0007.payload[integerLocal14 + this.resourceSupport004State0001.packetBufferState0007.position], (int) this.byteState0001);
                  }
                }
                this.resourceSupport004State0001.integerState0582 = this.resourceSupport004State0001.integerState0582 + integerLocal13;
                this.resourceSupport004State0001.packetBufferState0007.position = this.resourceSupport004State0001.packetBufferState0007.position + integerLocal13;
                if (this.resourceSupport004State0001.packetBufferState0007.position != integerLocal12) {
                  if (512 == this.resourceSupport004State0001.integerState0582) {
                    this.resourceSupport004State0001.integerState0582 = 0;
                  }
                } else {
                  this.resourceSupport004State0001.performAction0145((byte) 116);
                  this.resourceSupport004State0001.booleanState0173 = false;
                  this.resourceSupport004State0001 = null;
                }
              } else {
                integerLocal12 = -this.packetBufferState0003.position + integerLocal10;
                if (integerLocal12 > integerLocal8) {
                  integerLocal12 = integerLocal8;
                }
                this.bufferedSocketState0001.performAction1556(integerLocal12, this.packetBufferState0003.position, (byte) 17, this.packetBufferState0003.payload);
                if (this.byteState0001 != 0) {
                  for (integerLocal13 = 0; integerLocal12 > integerLocal13; integerLocal13++) {
                    this.packetBufferState0003.payload[this.packetBufferState0003.position + integerLocal13] = (byte)MixedSupport111.computeInteger1576((int) this.packetBufferState0003.payload[this.packetBufferState0003.position + integerLocal13], (int) this.byteState0001);
                  }
                }
                this.packetBufferState0003.position = this.packetBufferState0003.position + integerLocal12;
                if (this.packetBufferState0003.position >= integerLocal10) {
                  if (this.resourceSupport004State0001 == null) {
                    this.packetBufferState0003.position = 0;
                    integerLocal13 = this.packetBufferState0003.computeInteger2085((byte) -48);
                    integerLocal14 = this.packetBufferState0003.computeInteger2096(7553);
                    integerLocal15 = this.packetBufferState0003.computeInteger2085((byte) -99);
                    integerLocal16 = this.packetBufferState0003.computeInteger2096(7553);
                    integerLocal17 = 127 & integerLocal15;
                    stackIntegerLocal2 = (0 == (128 & integerLocal15)) ? 0 : 1;
                    boolean frameRemainderLocal26 = true;
                    boolean frameCompletedLocal27 = true;
                    integerLocal18 = stackIntegerLocal2;
                    longLocal19 = (long)integerLocal14 + ((long)integerLocal13 << 32);
                    objectLocal20 = null;
                    if (integerLocal18 == 0) {
                      resourceSupport004Local21 = (ResourceSupport004) (this.dualNodeDequeState0002.computeDualNode0034(-2198));
                      while (resourceSupport004Local21 != null) {
                        if (~resourceSupport004Local21.longState0003 == ~longLocal19) {
                          frameCompletedLocal27 = false;
                          break;
                        }
                        resourceSupport004Local21 = (ResourceSupport004) (this.dualNodeDequeState0002.computeDualNode0033((byte) 20));
                      }
                      frameRemainderLocal26 = !(frameCompletedLocal27);
                    }
                    if ((frameRemainderLocal26) &&
                      (frameCompletedLocal27)) {
                      resourceSupport004Local21 = (ResourceSupport004) (this.dualNodeDequeState0004.computeDualNode0034(byteArgument1 - 2142));
                      while (resourceSupport004Local21 != null) {
                        if (resourceSupport004Local21.longState0003 == longLocal19) {
                          break;
                        }
                        resourceSupport004Local21 = (ResourceSupport004) (this.dualNodeDequeState0004.computeDualNode0033((byte) 20));
                      }
                    }
                    if (resourceSupport004Local21 == null) {
                      throw new IOException();
                    }
                    stackIntegerLocal3 = (integerLocal17 == 0) ? 5 : 9;
                    integerLocal22 = stackIntegerLocal3;
                    this.resourceSupport004State0001 = resourceSupport004Local21;
                    this.resourceSupport004State0001.packetBufferState0007 = new PacketBuffer(integerLocal16 + integerLocal22 + this.resourceSupport004State0001.byteState0003);
                    this.resourceSupport004State0001.packetBufferState0007.performAction2073(true, integerLocal17);
                    this.resourceSupport004State0001.packetBufferState0007.performAction2067(integerLocal16, false);
                    this.resourceSupport004State0001.integerState0582 = 10;
                    this.packetBufferState0003.position = 0;
                  } else {
                    if (0 != this.resourceSupport004State0001.integerState0582) {
                      throw new IOException();
                    }
                    if (-1 != this.packetBufferState0003.payload[0]) {
                      this.resourceSupport004State0001 = null;
                    } else {
                      this.resourceSupport004State0001.integerState0582 = 1;
                      this.packetBufferState0003.position = 0;
                    }
                  }
                }
              }
            }
            return true;
          } catch (java.io.IOException caughtParameterLocal28) {
            caughtExceptionLocal4 = caughtParameterLocal28;
            iOExceptionLocal7 = (IOException) (Object) caughtExceptionLocal4;
            try {
              this.bufferedSocketState0001.performAction1555(0);
            } catch (java.lang.Exception caughtParameterLocal29) {
              caughtExceptionLocal4 = caughtParameterLocal29;
              exceptionLocal9 = (Exception) (Object) caughtExceptionLocal4;
            }
            this.integerState0132 = this.integerState0132 + 1;
            this.integerState0131 = -2;
            this.bufferedSocketState0001 = null;
            if (this.computeInteger0384((byte) -115) == 0 &&
              this.computeInteger0385(0) == 0) {
              return true;
            }
            return false;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal30) {
          throw uncheckedExceptionLocal30;
        } catch (Throwable checkedExceptionLocal31) {
          throw new RuntimeException(checkedExceptionLocal31);
        }
    }

    final void performAction0375(int integerArgument1) {
        Exception exception = null;
        Throwable caughtExceptionLocal2 = null;
        try {
          this.bufferedSocketState0001.performAction1555(0);
          if (integerArgument1 != 8192) {
            this.computeBoolean0374((byte) -2);
          }
        } catch (java.lang.Exception caughtParameterLocal3) {
          caughtExceptionLocal2 = caughtParameterLocal3;
          exception = (Exception) (Object) caughtExceptionLocal2;
        }
        this.integerState0131 = -1;
        this.integerState0132 = this.integerState0132 + 1;
        this.bufferedSocketState0001 = null;
        this.byteState0001 = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    public static void performAction1470(int integerArgument1) {
        mixedSupport084State0003 = null;
        rgbSpriteState0044 = null;
        sceneWidgetState0098 = null;
        int integerLocal1 = -57 % ((60 - integerArgument1) / 50);
        stringState0438 = null;
        cacheWorkQueueState0003 = null;
    }

    final static int computeInteger1467(int integerArgument1, String stringArgument2, boolean booleanArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument1 != 0) {
            stackIntegerLocal2 = 14;
            return stackIntegerLocal2;
          }
          if (booleanArgument3) {
            stackIntegerLocal4 = NetworkSupport001.bitmapFontState0003.computeInteger1208(stringArgument2);
            return stackIntegerLocal4;
          }
          stackIntegerLocal3 = SoftwareFramebuffer.bitmapFontState0021.computeInteger1208(stringArgument2);
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("qb.G(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    final static void performAction1466(int integerArgument1, byte byteArgument2, MixedSupport076 mixedSupport076Argument3) {
        try {
          GameDomainSupport005.nodeDequeState0023.performAction1963(mixedSupport076Argument3, 2777);
          if (byteArgument2 != 85) {
            stringState0438 = (String) null;
          }
          MixedSupport043.performAction0599((byte) -113, integerArgument1, mixedSupport076Argument3);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qb.B(" + integerArgument1 + ',' + byteArgument2 + ',' + (mixedSupport076Argument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1468(Throwable throwableArgument1, int integerArgument2, String stringArgument3) {
        try {
          PlatformService stackPlatformServiceLocal1;
          java.net.URL stackURLLocal2;
          java.net.URL stackURLLocal3;
          java.net.URL stackURLLocal4;
          StringBuilder stackStringBuilderLocal5;
          java.net.URL stackURLLocal6;
          java.net.URL stackURLLocal7;
          String stackStringLocal8;
          Throwable caughtExceptionLocal9 = null;
          String stringLocal10 = null;
          Exception exceptionLocal11 = null;
          AsyncTask asyncTaskLocal12 = null;
          DataInputStream dataInputStreamLocal13 = null;
          int integerLocal14 = 0;
          String stringLocal15 = null;
          integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            stringLocal10 = "";
            if (throwableArgument1 != null) {
              stringLocal10 = MixedSupport064.computeString0853(throwableArgument1, (byte) 37);
            }
            if (stringArgument3 != null) {
              if (throwableArgument1 != null) {
                stringLocal10 = stringLocal10 + " | ";
              }
              stringLocal10 = stringLocal10 + stringArgument3;
            }
            CacheWorkQueue.performAction0837(18239, stringLocal10);
            stringLocal10 = HashNode.computeString0159(0, stringLocal10, "%3a", ":");
            stringLocal10 = HashNode.computeString0159(integerArgument2 - 16408, stringLocal10, "%40", "@");
            stringLocal10 = HashNode.computeString0159(integerArgument2 ^ integerArgument2, stringLocal10, "%26", "&");
            stringLocal15 = HashNode.computeString0159(0, stringLocal10, "%23", "#");
            if (null == MixedSupport128.appletState0002) {
              return;
            }
            stackPlatformServiceLocal1 = MixedSupport093.platformServiceState0004;
            stackURLLocal2 = null;
            stackURLLocal3 = null;
            stackURLLocal4 = MixedSupport128.appletState0002.getCodeBase();
            stackStringBuilderLocal5 = new StringBuilder().append("clienterror.ws?c=").append(SceneWidgetPart014.integerState0919).append("&u=");
            if (Framebuffer.stringState0155 != null) {
              stackURLLocal6 = null;
              stackURLLocal7 = null;
              stackStringLocal8 = Framebuffer.stringState0155;
            } else {
              stackURLLocal6 = null;
              stackURLLocal7 = null;
              stackStringLocal8 = "" + MixedSupport132.longState0049;
            }
            asyncTaskLocal12 = ((PlatformService) (Object) stackPlatformServiceLocal1).computeAsyncTask0571(new java.net.URL(stackURLLocal4, ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal8).append("&v1=").append(PlatformService.stringState0168).append("&v2=").append(PlatformService.stringState0170).append("&e=").append(stringLocal15).toString()), (byte) 42);
            while (asyncTaskLocal12.integerState0510 == 0) {
              MixedSupport132.performAction1837(1L, -128);
            }
            if (1 == asyncTaskLocal12.integerState0510) {
              dataInputStreamLocal13 = (DataInputStream) (asyncTaskLocal12.objectState0004);
              dataInputStreamLocal13.read();
              dataInputStreamLocal13.close();
            }
          } catch (java.lang.Exception caughtParameterLocal16) {
            caughtExceptionLocal9 = caughtParameterLocal16;
            exceptionLocal11 = (Exception) (Object) caughtExceptionLocal9;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal17) {
          throw uncheckedExceptionLocal17;
        } catch (Throwable checkedExceptionLocal18) {
          throw new RuntimeException(checkedExceptionLocal18);
        }
    }

    private final void performAction1471(byte byteArgument1) {
        try {
          IOException iOException = null;
          Throwable caughtExceptionLocal2 = null;
          Exception exceptionLocal3 = null;
          if (byteArgument1 != -15) {
            return;
          }
          if (this.bufferedSocketState0001 == null) {
            return;
          }
          try {
            this.packetBufferState0002.position = 0;
            this.packetBufferState0002.performAction2073(true, 6);
            this.packetBufferState0002.performAction2076((byte) 46, 3);
            this.packetBufferState0002.performAction2087(-1, 0);
            this.bufferedSocketState0001.performAction1557(0, this.packetBufferState0002.payload.length, 1, this.packetBufferState0002.payload);
          } catch (java.io.IOException caughtParameterLocal4) {
            caughtExceptionLocal2 = caughtParameterLocal4;
            iOException = (IOException) (Object) caughtExceptionLocal2;
            try {
              this.bufferedSocketState0001.performAction1555(byteArgument1 + 15);
            } catch (java.lang.Exception caughtParameterLocal5) {
              caughtExceptionLocal2 = caughtParameterLocal5;
              exceptionLocal3 = (Exception) (Object) caughtExceptionLocal2;
            }
            this.bufferedSocketState0001 = null;
            this.integerState0132 = this.integerState0132 + 1;
            this.integerState0131 = -2;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal6) {
          throw uncheckedExceptionLocal6;
        } catch (Throwable checkedExceptionLocal7) {
          throw new RuntimeException(checkedExceptionLocal7);
        }
    }

    public NetworkArchiveRequestManager() {
    }

    static {
        integerState0598 = 22;
        mixedSupport084State0003 = new MixedSupport084();
    }
}
