/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class DekoBlokoClient extends FunOrbClient {
    static byte[] byteArrayState0004;
    static RawSound rawSoundState0005;
    static String stringState0095;
    static String stringState0096;
    static RgbSprite[] rgbSpriteArrayState0006;
    static RgbSprite[] rgbSpriteArrayState0007;
    static String stringState0097;
    public static boolean obfuscationControl;

    private final void performAction0312(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (null != GameDomainSupport006.resourceArchiveState0027) {
            GameAssets.performAction1542(false, GameDomainSupport006.resourceArchiveState0027);
            GameDomainSupport006.resourceArchiveState0027 = null;
            NodeDeque.performAction1788(true);
          }
          MixedSupport130.performAction1666((byte) -81);
          MixedSupport020.resourceArchiveState0003 = MixedSupport145.computeResourceArchive1770(3, 21);
          UiComponentPart032.resourceArchiveState0024 = MixedSupport145.computeResourceArchive1770(4, 44);
          MixedSupport061.resourceArchiveState0008 = MixedSupport145.computeResourceArchive1770(6, 39);
          MixedSupport031.resourceArchiveState0005 = MixedSupport145.computeResourceArchive1770(11, 102);
          UiComponentPart023.resourceArchiveState0015 = MixedSupport145.computeResourceArchive1770(7, 50);
          ThemeTips.resourceArchiveState0009 = MixedSupport145.computeResourceArchive1770(8, 113);
          MixedSupport005.resourceArchiveState0001 = MixedSupport145.computeResourceArchive1770(9, integerArgument1 ^ 24867);
          MouseInput.resourceArchiveState0026 = MixedSupport145.computeResourceArchive1770(10, integerArgument1 ^ 24938);
          GameAssets.mixedSupport014State0001 = new MixedSupport014(65);
          GameAssets.mixedSupport014State0001.performAction0196("basic", MixedSupport005.resourceArchiveState0002, MixedSupport013.stringState0064, (byte) 95, MixedSupport090.stringState0365);
          GameAssets.mixedSupport014State0001.performAction0196("arial13", MixedSupport005.resourceArchiveState0002, MixedSupport140.stringState0574, (byte) 112, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("arial13", GameSession.resourceArchiveState0019, MixedSupport140.stringState0574, (byte) 106, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("arialbold14", MixedSupport005.resourceArchiveState0002, MixedSupport140.stringState0574, (byte) -97, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("arialbold14", GameSession.resourceArchiveState0019, MixedSupport140.stringState0574, (byte) 94, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("lobby", MixedSupport005.resourceArchiveState0002, MixedSupport013.stringState0064, (byte) -21, MixedSupport090.stringState0365);
          GameAssets.mixedSupport014State0001.performAction0196("lobby", GameSession.resourceArchiveState0019, MixedSupport140.stringState0574, (byte) 87, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0194(ProxySocketFactory.stringState0495, (byte) 122, ThemeTips.resourceArchiveState0009, UiComponentPart013.stringState0224);
          GameAssets.mixedSupport014State0001.performAction0194(ProxySocketFactory.stringState0495, (byte) -109, MixedSupport005.resourceArchiveState0001, UiComponentPart013.stringState0224);
          if (integerArgument1 != 24903) {
            DekoBlokoClient.computeMixedSupport0660303((String) null, -14);
          }
          GameAssets.mixedSupport014State0001.performAction0194(MixedSupport130.stringState0539, (byte) 51, MouseInput.resourceArchiveState0026, RenderingSupport007.stringState0305);
          GameAssets.mixedSupport014State0001.performAction0196("", MixedSupport061.resourceArchiveState0008, MixedSupport013.stringState0064, (byte) 102, MixedSupport090.stringState0365);
          GameAssets.mixedSupport014State0001.performAction0196("", UiComponentPart023.resourceArchiveState0015, MixedSupport140.stringState0574, (byte) -107, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0194(MixedSupport108.stringState0436, (byte) -121, MixedSupport031.resourceArchiveState0005, MixedSupport045.stringState0192);
          GameAssets.mixedSupport014State0001.performAction0194(SceneWidgetPart001.stringState0058, (byte) 114, MixedSupport020.resourceArchiveState0003, MixedSupport010.stringState0048);
          GameAssets.mixedSupport014State0001.performAction0194(SceneWidgetPart001.stringState0058, (byte) -45, UiComponentPart032.resourceArchiveState0024, MixedSupport010.stringState0048);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal2), "client.V(" + integerArgument1 + ')');
        }
    }

    final static MixedSupport066 computeMixedSupport0660303(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        String stringLocal4 = null;
        MixedSupport066 mixedSupport066Local5 = null;
        MixedSupport066 stackMixedSupport066Local6 = null;
        MixedSupport066 stackMixedSupport066Local7 = null;
        MixedSupport066 stackMixedSupport066Local8 = null;
        MixedSupport066 stackMixedSupport066Local9 = null;
        MixedSupport066 stackMixedSupport066Local10 = null;
        RuntimeException stackRuntimeExceptionLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        try {
          if (stringArgument1 != null &&
            0 != stringArgument1.length()) {
            integerLocal1 = stringArgument1.indexOf('@');
            if (-1 == integerLocal1) {
              stackMixedSupport066Local7 = MouseWheelInput.mixedSupport066State0004;
              return stackMixedSupport066Local7;
            }
            stringLocal3 = stringArgument1.substring(0, integerLocal1);
            stringLocal4 = stringArgument1.substring(1 + integerLocal1);
            if (integerArgument2 != -12828) {
              stackMixedSupport066Local8 = (MixedSupport066) null;
              return stackMixedSupport066Local8;
            }
            mixedSupport066Local5 = MixedSupport090.computeMixedSupport0661131(integerArgument2 + 12827, stringLocal3);
            if (null != mixedSupport066Local5) {
              stackMixedSupport066Local9 = mixedSupport066Local5;
              return stackMixedSupport066Local9;
            }
            stackMixedSupport066Local10 = MixedSupport022.computeMixedSupport0660330(stringLocal4, -2734);
            return stackMixedSupport066Local10;
          }
          stackMixedSupport066Local6 = Framebuffer.mixedSupport066State0002;
          return stackMixedSupport066Local6;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal14 = caughtParameterLocal15;
          runtimeExceptionLocal2 = caughtExceptionLocal14;
          stackRuntimeExceptionLocal11 = runtimeExceptionLocal2;
          stackStringBuilderLocal12 = new StringBuilder().append("client.R(");
          if (stringArgument1 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) stackRuntimeExceptionLocal11), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(integerArgument2).append(')').toString());
        }
    }

    private final void performAction0309(byte byteArgument1) {
        MixedSupport079 cachedMixedSupport079Local1 = null;
        boolean stackBooleanLocal2 = false;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        int stackIntegerLocal9 = 0;
        int stackIntegerLocal10 = 0;
        Object stackObjectLocal11 = null;
        Object stackObjectLocal12 = null;
        Object stackObjectLocal13 = null;
        boolean stackBooleanLocal14 = false;
        int stackIntegerLocal15 = 0;
        int stackIntegerLocal16 = 0;
        int stackIntegerLocal17 = 0;
        int stackIntegerLocal18 = 0;
        int stackIntegerLocal19 = 0;
        int stackIntegerLocal20 = 0;
        int stackIntegerLocal21 = 0;
        RuntimeException caughtExceptionLocal22 = null;
        int integerLocal23 = 0;
        RuntimeException runtimeExceptionLocal24 = null;
        int integerLocal25 = 0;
        Object objectLocal26 = null;
        int integerLocal27 = 0;
        Object objectLocal28 = null;
        Object objectLocal29 = null;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        BucketBoard bucketBoardLocal32 = null;
        MixedSupport149 mixedSupport149Local33 = null;
        int integerLocal34 = 0;
        CipherPacketBuffer cipherPacketBufferLocal35 = null;
        int integerLocal36 = 0;
        int integerLocal37 = 0;
        int integerLocal38 = 0;
        ReturnedShape returnedShapeLocal39 = null;
        int integerLocal40 = 0;
        int integerLocal41 = 0;
        int integerLocal42 = 0;
        int integerLocal43 = 0;
        int integerLocal44 = 0;
        String[] stringArrayLocal45 = null;
        int integerLocal46 = 0;
        GameSession gameSessionLocal47 = null;
        int integerLocal48 = 0;
        int integerLocal49 = 0;
        MusicTrack[] musicTrackArrayLocal50 = null;
        int integerLocal51 = 0;
        integerLocal51 = obfuscationControl ? 1 : 0;
        try {
          integerLocal23 = 0;
          if (ComponentContainer.gameSessionState0002 != null &&
            ComponentContainer.gameSessionState0002.mixedSupport028State0001.integerState0168 >= 3) {
            integerLocal23 = 1;
          }
          if (null != UiComponent.gameSessionState0001 &&
            UiComponent.gameSessionState0001.mixedSupport028State0001.integerState0168 >= 3) {
            integerLocal23 = 1;
          }
          if (integerLocal23 != 0) {
            if (ResourceSupport003.integerState0553 > 0) {
              ResourceSupport003.integerState0553 = ResourceSupport003.integerState0553 - 1;
            }
            if (ResourceSupport003.integerState0553 == 0) {
              if (RenderingSupport007.integerState0361 < 15 &&
                MixedSupport067.integerState0347 < 15 &&
                8 > MixedSupport006.integerState0039) {
                MixedSupport006.integerState0039 = MixedSupport006.integerState0039 + 1;
              }
              if (15 < RenderingSupport007.integerState0361 &&
                MixedSupport067.integerState0347 > 15 &&
                MixedSupport006.integerState0039 > 1) {
                MixedSupport006.integerState0039 = MixedSupport006.integerState0039 - 1;
              }
              ResourceSupport003.integerState0553 = 50;
              RenderingSupport007.integerState0361 = MixedSupport067.integerState0347;
              if (integerLocal51 != 0) {
                MixedSupport006.integerState0039 = 1;
              }
            }
          } else {
            MixedSupport006.integerState0039 = 1;
          }
          MixedSupport042.computeInteger0540((byte) -108);
          MixedSupport106.integerState0589 = Js5ArchiveManager.computeInteger1123((byte) -40);
          if (MixedSupport117.booleanState0166 &&
            null != UiComponentPart033.midiSynthesizerState0001) {
            UiComponentPart033.midiSynthesizerState0001.performAction0699(MixedSupport001.integerState0011 * 50 / 128);
            MixedSupport117.booleanState0166 = false;
          }
          if (MixedSupport020.platformSupport006State0001 != null &&
            MixedSupport020.platformSupport006State0001.booleanState0156) {
            MixedSupport123.performAction1594(false);
            SceneWidgetPart008.performAction1160(54);
          }
          stackBooleanLocal2 = (null != MixedSupport020.platformSupport006State0001);
          this.performAction0112(stackBooleanLocal2, -11);
          if (ResourceSupport003.booleanState0127) {
            this.performAction0312(24903);
            ResourceSupport003.booleanState0127 = false;
          }
          CipherPacketBuffer.integerState0799 = CipherPacketBuffer.integerState0799 + 1;
          if (MixedSupport124.computeBoolean1606((byte) -104)) {
            this.performAction0119(10);
            if (MixedSupport124.computeBoolean1606((byte) -93)) {
              return;
            }
          }
          boolean frameRemainderLocal52 = true;
          if (!GameAssets.booleanState0176) {
            PlatformSupport006.performAction1414(MixedSupport068.integerState0353, (byte) -115);
            frameRemainderLocal52 = !(!this.computeBoolean0311(0));
            if (frameRemainderLocal52) {
              GameAssets.booleanState0176 = true;
              frameRemainderLocal52 = (integerLocal51 != 0);
            }
          }
          if (frameRemainderLocal52) {
            if (UiComponentPart029.computeBoolean1531(-1)) {
              if (!UiComponentPart001.computeBoolean0059((byte) -127)) {
                if (!NetworkSupport010.computeBoolean1289(65)) {
                  if (UiComponentPart005.computeBoolean0322((byte) 123)) {
                    if (SceneWidgetPart002.integerState0241 != SceneWidgetPart002.integerState0249) {
                      this.performAction0304(30661, false);
                      frameRemainderLocal52 = (integerLocal51 != 0);
                    }
                    if (frameRemainderLocal52) {
                      integerLocal25 = SocketFactory.computeInteger1846(false);
                      if (integerLocal25 == 1) {
                        UiComponentPart021.performAction1199(CacheWorkQueue.booleanState0079, MixedSupport037.integerState0224, true);
                      }
                      this.performAction0304(30661, true);
                      frameRemainderLocal52 = (integerLocal51 != 0);
                    }
                  }
                  if (frameRemainderLocal52) {
                    this.performAction0304(30661, false);
                    frameRemainderLocal52 = (integerLocal51 != 0);
                  }
                }
                if (frameRemainderLocal52) {
                  stackBooleanLocal3 = (null != MixedSupport020.platformSupport006State0001);
                  integerLocal25 = this.computeInteger0109(stackBooleanLocal3, (byte) 102);
                  if (1 == integerLocal25 ||
                    2 == integerLocal25) {
                    if (MixedSupport020.platformSupport006State0001 != null) {
                      MixedSupport123.performAction1594(false);
                    }
                    if (integerLocal25 == 2) {
                      NetworkSupport010.performAction1285((byte) -17, UiComponentPart029.computeApplet1530(25144));
                    }
                  }
                  this.performAction0304(30661, true);
                  frameRemainderLocal52 = (integerLocal51 != 0);
                }
              }
              if (frameRemainderLocal52) {
                if (~SceneWidgetPart002.integerState0241 != ~SceneWidgetPart002.integerState0249) {
                  this.performAction0304(30661, false);
                  frameRemainderLocal52 = (integerLocal51 != 0);
                }
                if (frameRemainderLocal52) {
                  integerLocal25 = MixedSupport130.computeInteger1665((byte) -117);
                  switch (integerLocal25) {
                    case 2:
                      MixedSupport123.performAction1594(false);
                    default:
                      break;
                    case 4:
                      UiComponentPart021.performAction1199(true, 3, true);
                      if (integerLocal51 == 0) {
                        break;
                      }
                    case 3:
                      MixedSupport068.performAction0843(2, true);
                      break;
                  }
                  this.performAction0304(30661, true);
                  if (integerLocal51 != 0) {
                    MixedSupport023.performAction0340(-60);
                  }
                }
              }
            } else {
              MixedSupport023.performAction0340(-60);
            }
          }
          if (!UiComponentPart023.computeBoolean1275(-30146)) {
            scanLoop1: while (true) {
              objectLocal26 = (NetworkSupport005) (NodeHashTable.nodeDequeState0031.computeHashNode1783(4));
              if (objectLocal26 != null) {
                UiComponent.performAction0216(4, (NetworkSupport005) (objectLocal26), -697);
                if (integerLocal51 != 0) {
                  break;
                }
                continue;
              }
              do {
                objectLocal26 = (MixedSupport038) (MixedSupport069.nodeDequeState0011.computeHashNode1783(4));
                if (objectLocal26 == null) {
                  if (integerLocal51 == 0) {
                    break scanLoop1;
                  }
                } else {
                  GameDomainSupport006.performAction1877(3, 5, (MixedSupport038) (objectLocal26));
                }
              } while (integerLocal51 == 0);
              break scanLoop1;
            }
          }
          scanLoop2: while (true) {
            stackBooleanLocal4 = MixedSupport147.computeBoolean1779(MixedSupport086.integerArrayState0158, 0);
            while (true) {
              if (stackBooleanLocal4) {
                stackIntegerLocal19 = ~HashNode.integerState0070;
                stackIntegerLocal20 = -10;
                if (integerLocal51 == 0) {
                  if (stackIntegerLocal19 == stackIntegerLocal20) {
                    MixedSupport087.booleanState0118 = false;
                    objectLocal26 = UiComponentPart006.cipherPacketBufferState0001.computeString1901((byte) -38);
                    UiComponentPart033.performAction1866(1, -86, false, 0, true, (String) (objectLocal26));
                    continue scanLoop2;
                  }
                  if (77 == HashNode.integerState0070) {
                    MixedSupport087.booleanState0118 = false;
                    UiComponentPart024.performAction1310(true, false, true);
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 14) {
                    SocketFactory.performAction1844((byte) 66);
                    MixedSupport016.performAction0205(true);
                    SecondaryNodeHashTable.performAction1151(UiComponentPart015.computeSceneWidget0719(8192), MixedSupport113.computeSceneWidget1457(-95), 0, 5, UiComponentPart020.computeInteger1191(-10498, 2000), UiComponentPart025.computeSceneWidget1398((byte) 117), MixedSupport148.byteArrayState0040, 150, UiComponentPart020.computeInteger1191(-10498, 8), 1024);
                    SecondaryNodeDequeIterator.performAction0365(21014, SceneWidgetPart011.computeSceneWidget1621((byte) 98), MixedSupport077.computeSceneWidget0943(-126));
                    UiComponentPart012.booleanState0059 = true;
                    IterableNodeCollection.booleanState0193 = true;
                    MixedSupport087.booleanState0118 = false;
                    objectLocal26 = MixedSupport064.integerArrayState0111;
                    integerLocal27 = 0;
                    while (integerLocal27 < 8) {
                      ((int[]) (objectLocal26))[integerLocal27] = 0;
                      integerLocal27++;
                    }
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 15) {
                    if (IterableNodeCollection.booleanState0193) {
                      GameDomainSupport001.performAction0097(true);
                      MixedSupport073.performAction0927(true);
                      ComponentContainer.renderingSupport008State0006 = MixedSupport033.computeRenderingSupport0080501(false, false, 0, false, false, 32357, false, false);
                      MixedSupport023.performAction0343(false, 126);
                      MixedSupport140.performAction1727((byte) -124);
                      MixedSupport043.booleanState0049 = false;
                      MixedSupport034.booleanState0042 = false;
                      MixedSupport046.booleanState0053 = true;
                      IterableNodeCollection.booleanState0193 = false;
                      LoginCredentials.performAction0805(-48);
                    }
                    MixedSupport087.booleanState0118 = false;
                    GameDomainSupport006.booleanState0227 = false;
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 10 &&
                    IterableNodeCollection.booleanState0193) {
                    RenderingSupport008.performAction0867((byte) 113);
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 75) {
                    objectLocal26 = UiComponentPart002.computeIntegerArray0082(-123);
                    objectLocal28 = objectLocal26;
                    objectLocal29 = UiComponentPart006.cipherPacketBufferState0001;
                    integerLocal31 = ((PacketBuffer) (objectLocal29)).computeInteger1904((byte) -45);
                    integerLocal34 = 0;
                    scanLoop3: while (true) {
                      if (integerLocal34 < integerLocal31) {
                        ((int[]) (objectLocal28))[integerLocal34] = ((PacketBuffer) (objectLocal29)).computeInteger1914(7553);
                        integerLocal34++;
                        continue;
                      }
                      if (!SceneWidgetPart008.booleanState0123) {
                        break scanLoop3;
                      }
                      objectLocal28 = objectLocal26;
                      objectLocal29 = MixedSupport093.integerArrayState0172;
                      integerLocal31 = 0;
                      while (integerLocal31 < 8) {
                        ((int[]) (objectLocal28))[integerLocal31] = MixedSupport079.computeInteger0954(((int[]) (objectLocal28))[integerLocal31], ~((int[]) (objectLocal29))[integerLocal31]);
                        integerLocal31++;
                      }
                      if (null != ComponentContainer.gameSessionState0002 &&
                        ComponentContainer.gameSessionState0002.mixedSupport028State0001.bucketBoardArrayState0001[ComponentContainer.gameSessionState0002.integerState0612] != null) {
                        integerLocal27 = 0;
                        while (integerLocal27 < 31) {
                          stackBooleanLocal4 = MixedSupport112.computeBoolean1440(-18, integerLocal27, (int[]) (objectLocal26));
                          if (stackBooleanLocal4) {
                            ComponentContainer.gameSessionState0002.mixedSupport028State0001.bucketBoardArrayState0001[ComponentContainer.gameSessionState0002.integerState0612].nodeDequeState0017.performAction1786(new MixedSupport143(integerLocal27), 2777);
                          }
                          integerLocal27++;
                        }
                      }
                      objectLocal28 = MixedSupport064.integerArrayState0111;
                      objectLocal29 = objectLocal26;
                      integerLocal31 = 0;
                      while (integerLocal31 < 8) {
                        ((int[]) (objectLocal28))[integerLocal31] = UiComponentPart006.computeInteger0358(((int[]) (objectLocal28))[integerLocal31], ((int[]) (objectLocal29))[integerLocal31]);
                        integerLocal31++;
                      }
                      break;
                    }
                    objectLocal28 = MixedSupport093.integerArrayState0172;
                    objectLocal29 = objectLocal26;
                    integerLocal31 = 0;
                    while (integerLocal31 < 8) {
                      ((int[]) (objectLocal28))[integerLocal31] = UiComponentPart006.computeInteger0358(((int[]) (objectLocal28))[integerLocal31], ((int[]) (objectLocal29))[integerLocal31]);
                      integerLocal31++;
                    }
                    continue scanLoop2;
                  }
                  if (58 == HashNode.integerState0070 ||
                    HashNode.integerState0070 == 59) {
                    integerLocal25 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1907(3);
                    integerLocal27 = integerLocal25 & 15;
                    integerLocal30 = 3 & integerLocal25 >> 4;
                    integerLocal31 = integerLocal25 >> 6 & 7;
                    integerLocal34 = (integerLocal25 & 3812) >> 9;
                    stackIntegerLocal5 = ((integerLocal25 & 4096) == 0) ? 0 : 1;
                    integerLocal36 = stackIntegerLocal5;
                    stackIntegerLocal6 = ((8192 & integerLocal25) == 0) ? 0 : 1;
                    integerLocal37 = stackIntegerLocal6;
                    stackIntegerLocal7 = ((integerLocal25 & 16384) == 0) ? 0 : 1;
                    integerLocal38 = stackIntegerLocal7;
                    stackIntegerLocal8 = ((integerLocal25 & 32768) == 0) ? 0 : 1;
                    integerLocal40 = stackIntegerLocal8;
                    integerLocal41 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1907(3);
                    integerLocal42 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -92);
                    integerLocal43 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -116);
                    integerLocal44 = UiComponentPart006.cipherPacketBufferState0001.computeByte1911((byte) -100);
                    if (integerLocal44 < 0) {
                      integerLocal44 = -2;
                    }
                    stringArrayLocal45 = new String[integerLocal43];
                    integerLocal46 = 0;
                    while (integerLocal46 < integerLocal43) {
                      stringArrayLocal45[integerLocal46] = UiComponentPart006.cipherPacketBufferState0001.computeString1899(true);
                      integerLocal46++;
                    }
                    integerLocal46 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -27);
                    MixedSupport048.mixedSupport076State0001 = null;
                    gameSessionLocal47 = new GameSession(true, integerLocal42, integerLocal36 != 0, integerLocal27, integerLocal30, integerLocal31, integerLocal34, stringArrayLocal45, integerLocal44, integerLocal37 != 0, false, false);
                    gameSessionLocal47.integerState0609 = integerLocal41;
                    gameSessionLocal47.booleanState0143 = integerLocal38 != 0;
                    if (integerLocal38 == 0) {
                      if (integerLocal40 != 0) {
                        gameSessionLocal47.nodeDequeState0024.performAction1786(new RenderingSupport006(TextLayout.stringState0083, 10, true), 2777);
                      }
                    } else {
                      gameSessionLocal47.nodeDequeState0024.performAction1786(new RenderingSupport006(MixedSupport013.stringState0062, 8, true), 2777);
                    }
                    integerLocal48 = 0;
                    integerLocal49 = 0;
                    while (integerLocal49 < gameSessionLocal47.mixedSupport028State0001.integerState0173) {
                      stackIntegerLocal9 = -1;
                      stackIntegerLocal10 = ~(integerLocal46 & 1 << integerLocal49);
                      if (stackIntegerLocal9 != stackIntegerLocal10) {
                        gameSessionLocal47.integerArrayState0187[integerLocal49] = 200;
                        integerLocal48++;
                      }
                      integerLocal49++;
                    }
                    stackIntegerLocal9 = -3;
                    stackIntegerLocal10 = ~integerLocal48;
                    if (stackIntegerLocal9 > stackIntegerLocal10) {
                      gameSessionLocal47.integerState0602 = 100;
                    }
                    integerLocal49 = gameSessionLocal47.integerState0612;
                    if (integerLocal49 < 0) {
                      integerLocal49 = 0;
                      while (200 != gameSessionLocal47.integerArrayState0187[integerLocal49]) {
                        integerLocal49++;
                      }
                    }
                    if (2 == integerLocal48) {
                      integerLocal49 = (integerLocal49 + 1) % gameSessionLocal47.mixedSupport028State0001.integerState0173;
                      while (gameSessionLocal47.integerArrayState0187[integerLocal49] != 200) {
                        integerLocal49 = (integerLocal49 + 1) % gameSessionLocal47.mixedSupport028State0001.integerState0173;
                      }
                    }
                    gameSessionLocal47.integerState0616 = integerLocal49;
                    gameSessionLocal47.integerState0620 = integerLocal49;
                    gameSessionLocal47.integerState0605 = integerLocal49;
                    if (HashNode.integerState0070 != 58) {
                      UiComponent.gameSessionState0001 = gameSessionLocal47;
                      MixedSupport034.booleanState0042 = true;
                    } else {
                      ComponentContainer.gameSessionState0002 = gameSessionLocal47;
                      MixedSupport043.booleanState0049 = true;
                      MixedSupport028.performAction0403(58);
                    }
                    GameDomainSupport006.booleanState0227 = false;
                    MixedSupport007.booleanState0005 = true;
                    if (integerLocal27 != 10) {
                      musicTrackArrayLocal50 = MixedSupport118.musicTrackArrayArrayState0001[integerLocal42];
                    } else {
                      musicTrackArrayLocal50 = MixedSupport030.musicTrackArrayState0001;
                    }
                    MixedSupport092.performAction1166(gameSessionLocal47.computeInteger1356(true), musicTrackArrayLocal50[0], true);
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 60) {
                    if (MixedSupport043.booleanState0049 ||
                      MixedSupport034.booleanState0042) {
                      MixedSupport043.booleanState0049 = false;
                      MixedSupport007.booleanState0005 = false;
                      MixedSupport034.booleanState0042 = false;
                      MixedSupport016.performAction0205(true);
                      MixedSupport140.performAction1727((byte) -125);
                      LoginCredentials.performAction0805(-111);
                    }
                    GameDomainSupport006.booleanState0227 = false;
                    continue scanLoop2;
                  }
                  objectLocal26 = null;
                  if (!MixedSupport043.booleanState0049) {
                    if (MixedSupport034.booleanState0042) {
                      objectLocal26 = UiComponent.gameSessionState0001;
                    }
                  } else {
                    objectLocal26 = ComponentContainer.gameSessionState0002;
                  }
                  stackObjectLocal11 = null;
                  stackObjectLocal12 = objectLocal26;
                  while (stackObjectLocal11 != stackObjectLocal12) {
                    if (61 == HashNode.integerState0070) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -92);
                      objectLocal29 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      stackObjectLocal13 = objectLocal29;
                      stackBooleanLocal14 = (~integerLocal27 == ~((GameSession) (objectLocal26)).integerState0612);
                      ((BucketBoard) stackObjectLocal13).decodeMultiplayerSnapshot(stackBooleanLocal14, UiComponentPart006.cipherPacketBufferState0001, (byte) 118);
                      ((GameSession) (objectLocal26)).performAction1350(true, (BucketBoard) (objectLocal29), 600, 200, ((BucketBoard) (objectLocal29)).livesRemaining, integerLocal27, false);
                      if (((GameSession) (objectLocal26)).integerState0612 != integerLocal27) {
                        continue scanLoop2;
                      }
                      SocketFactory.cipherPacketBufferState0002.performAction1691(59, -4);
                      SocketFactory.cipherPacketBufferState0002.performAction1892(true, ((BucketBoard) (objectLocal29)).pieceAcknowledgement);
                      ((GameSession) (objectLocal26)).integerState0615 = 7 * ((BucketBoard) (objectLocal29)).dominoDescriptor - 4;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 62) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -124);
                      integerLocal30 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -116);
                      if (!(((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0173 > integerLocal27) ||
                        ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27] == null) {
                        NetworkArchiveRequestManager.performAction1322((Throwable) null, 16408, "T4: " + integerLocal27);
                        NodeHashTable.performAction1544(85);
                        continue scanLoop2;
                      }
                      bucketBoardLocal32 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      while (true) {
                        if (bucketBoardLocal32.integerState0486 < bucketBoardLocal32.integerState0444) {
                          integerLocal34 = ((GameSession) (objectLocal26)).computeBoolean1353(-117, integerLocal27) ? 1 : 0;
                          stackIntegerLocal15 = integerLocal34;
                          if (stackIntegerLocal15 == 0) {
                            NetworkArchiveRequestManager.performAction1322((Throwable) null, 16408, "T6");
                            NodeHashTable.performAction1544(79);
                            continue scanLoop2;
                          }
                          continue;
                        }
                        break;
                      }
                      ((GameSession) (objectLocal26)).performAction1338(18, bucketBoardLocal32, integerLocal27);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27] = null;
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 & ~(1 << integerLocal27);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0168 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0168 - 1;
                      stackIntegerLocal15 = ((GameSession) (objectLocal26)).integerState0612;
                      if (stackIntegerLocal15 == integerLocal27) {
                        MixedSupport016.performAction0205(true);
                        MixedSupport095.booleanState0124 = true;
                        ((GameSession) (objectLocal26)).performAction1347(MixedSupport115.musicTrackState0006, 0);
                      }
                      ((GameSession) (objectLocal26)).booleanState0143 = false;
                      UiComponentPart004.integerState0095 = 1;
                      DiagnosticSupport002.booleanState0082 = false;
                      MixedSupport112.integerState0681 = 0;
                      MixedSupport006.integerState0039 = 1;
                      ((GameSession) (objectLocal26)).integerState0607 = integerLocal30;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 63) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -53);
                      integerLocal30 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -118);
                      integerLocal31 = NetworkSupport012.integerState0759 - UiComponentPart006.cipherPacketBufferState0001.position;
                      if (0 > integerLocal31) {
                        NetworkArchiveRequestManager.performAction1322((Throwable) null, 16408, "T8: " + integerLocal27 + " " + integerLocal30 + " " + integerLocal31);
                        NodeHashTable.performAction1544(65);
                        continue scanLoop2;
                      }
                      cipherPacketBufferLocal35 = new CipherPacketBuffer(integerLocal31 + 1);
                      cipherPacketBufferLocal35.performAction1892(true, integerLocal30);
                      cipherPacketBufferLocal35.performAction1893(false, integerLocal31, UiComponentPart006.cipherPacketBufferState0001.payload, UiComponentPart006.cipherPacketBufferState0001.position);
                      cipherPacketBufferLocal35.position = 0;
                      ((GameSession) (objectLocal26)).mixedSupport079ArrayState0001[integerLocal27].nodeDequeState0014.performAction1786(cipherPacketBufferLocal35, 2777);
                      cachedMixedSupport079Local1 = ((GameSession) (objectLocal26)).mixedSupport079ArrayState0001[integerLocal27];
                      cachedMixedSupport079Local1.integerState0420 = cachedMixedSupport079Local1.integerState0420 + integerLocal30;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 64) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -127);
                      objectLocal29 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      mixedSupport149Local33 = new MixedSupport149();
                      mixedSupport149Local33.integerState0882 = UiComponentPart006.cipherPacketBufferState0001.computeByte1911((byte) -88);
                      mixedSupport149Local33.integerState0878 = UiComponentPart006.cipherPacketBufferState0001.computeByte1911((byte) -118);
                      mixedSupport149Local33.integerState0876 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -93);
                      mixedSupport149Local33.integerState0881 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -83);
                      mixedSupport149Local33.returnedShapeState0001 = ((GameSession) (objectLocal26)).returnedShapeCache.computeReturnedShape1213(true, true, UiComponentPart006.cipherPacketBufferState0001);
                      mixedSupport149Local33.integerState0879 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -64);
                      ((GameSession) (objectLocal26)).mixedSupport079ArrayState0001[integerLocal27].nodeDequeState0014.performAction1786(mixedSupport149Local33, 2777);
                      integerLocal34 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1883(117);
                      integerLocal36 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1883(127) + integerLocal34;
                      if (integerLocal36 > integerLocal34) {
                        integerLocal37 = integerLocal34;
                        while (true) {
                          if (integerLocal36 > integerLocal37) {
                            returnedShapeLocal39 = new ReturnedShape(integerLocal37);
                            stackIntegerLocal16 = ~integerLocal27;
                            stackIntegerLocal17 = ~((GameSession) (objectLocal26)).integerState0612;
                            if (stackIntegerLocal16 == stackIntegerLocal17) {
                              returnedShapeLocal39.integerState0687 = -integerLocal34 + integerLocal37;
                            }
                            ((GameSession) (objectLocal26)).returnedShapeCache.performAction1211(returnedShapeLocal39, 0);
                            integerLocal37++;
                            continue;
                          }
                          break;
                        }
                        while (true) {
                          stackIntegerLocal16 = ~((BucketBoard) (objectLocal29)).integerState0486;
                          stackIntegerLocal17 = ~((BucketBoard) (objectLocal29)).integerState0444;
                          if (stackIntegerLocal16 <= stackIntegerLocal17) {
                            break;
                          }
                          integerLocal37 = ((GameSession) (objectLocal26)).computeBoolean1353(-126, integerLocal27) ? 1 : 0;
                          stackIntegerLocal18 = integerLocal37;
                          if (stackIntegerLocal18 == 0) {
                            NetworkArchiveRequestManager.performAction1322((Throwable) null, 16408, "T7");
                            NodeHashTable.performAction1544(97);
                            continue;
                          }
                        }
                        ((BucketBoard) (objectLocal29)).integerState0444 = integerLocal36;
                        ((BucketBoard) (objectLocal29)).integerState0486 = integerLocal34;
                      }
                      stackIntegerLocal18 = ((GameSession) (objectLocal26)).integerState0612;
                      if (stackIntegerLocal18 != integerLocal27) {
                        continue scanLoop2;
                      }
                      while (mixedSupport149Local33.computeBoolean0144((byte) 58)) {
                        ((GameSession) (objectLocal26)).computeBoolean1353(-118, integerLocal27);
                      }
                      SocketFactory.cipherPacketBufferState0002.performAction1691(59, -4);
                      SocketFactory.cipherPacketBufferState0002.performAction1892(true, ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27].pieceAcknowledgement);
                      ((GameSession) (objectLocal26)).integerState0601 = 0;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 65) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -60);
                      objectLocal29 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      do {
                        integerLocal31 = ((GameSession) (objectLocal26)).computeBoolean1353(-116, integerLocal27) ? 1 : 0;
                      } while (integerLocal31 != 0);
                      if (~((GameSession) (objectLocal26)).integerState0612 == ~integerLocal27) {
                        integerLocal31 = 0;
                        while (!(((BucketBoard) (objectLocal29)).livesRemaining <= integerLocal31)) {
                          MixedSupport039.integerState0232 = MixedSupport039.integerState0232 + 30000;
                          UiComponentPart028.integerState0716 = UiComponentPart028.integerState0716 + 30000;
                          integerLocal31++;
                        }
                      }
                      ((BucketBoard) (objectLocal29)).livesRemaining = 0;
                      ((BucketBoard) (objectLocal29)).performAction1014(-9897);
                      ((GameSession) (objectLocal26)).integerState0601 = 0;
                      if (~integerLocal27 != ~((GameSession) (objectLocal26)).integerState0612) {
                        continue scanLoop2;
                      }
                      ((GameSession) (objectLocal26)).nodeDequeState0024.performAction1786(new RenderingSupport006(MixedSupport014.stringState0070, 13, true), 2777);
                      ((GameSession) (objectLocal26)).booleanState0142 = true;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 66) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -22);
                      integerLocal30 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -76);
                      bucketBoardLocal32 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      integerLocal34 = 0;
                      while (integerLocal34 < integerLocal30) {
                        bucketBoardLocal32.computeReturnedShape1003(-19939);
                        integerLocal34++;
                      }
                      continue scanLoop2;
                    }
                    if (67 == HashNode.integerState0070) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -50);
                      objectLocal29 = ((GameSession) (objectLocal26)).returnedShapeCache.computeReturnedShape1213(true, true, UiComponentPart006.cipherPacketBufferState0001);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27].performAction0999((ReturnedShape) (objectLocal29), (byte) -121);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 68) {
                      ((GameSession) (objectLocal26)).integerState0607 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -35);
                      ((GameSession) (objectLocal26)).nodeDequeState0024.performAction1786(new RenderingSupport006(MixedSupport028.stringState0140, 12, false), 2777);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 69) {
                      ((GameSession) (objectLocal26)).integerState0607 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -78);
                      ((GameSession) (objectLocal26)).booleanState0143 = true;
                      ((GameSession) (objectLocal26)).nodeDequeState0024.performAction1786(new RenderingSupport006(MixedSupport013.stringState0062, 8, false), 2777);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 76) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerArrayState0034[((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0167] = UiComponentPart006.cipherPacketBufferState0001.computeByte1911((byte) -89);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0167 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0167 + 1;
                      continue scanLoop2;
                    }
                    if (70 == HashNode.integerState0070) {
                      integerLocal27 = UiComponentPart006.cipherPacketBufferState0001.computeByte1911((byte) -104);
                      integerLocal30 = 0;
                      while (integerLocal30 < ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0173) {
                        stackObjectLocal11 = null;
                        stackObjectLocal12 = objectLocal26;
                        if (stackObjectLocal11 != ((GameSession) (stackObjectLocal12)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal30]) {
                          while (!((GameSession) (objectLocal26)).mixedSupport079ArrayState0001[integerLocal30].nodeDequeState0014.computeBoolean1789(-24)) {
                            ((GameSession) (objectLocal26)).computeBoolean1353(39, integerLocal30);
                          }
                        }
                        integerLocal30++;
                      }
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.performAction0404(integerLocal27, (byte) -70);
                      ((GameSession) (objectLocal26)).performAction1328(100);
                      if (((GameSession) (objectLocal26)).integerState0612 >= 0) {
                        MixedSupport016.performAction0205(true);
                      }
                      if (integerLocal27 < 0 ||
                        ((GameSession) (objectLocal26)).booleanState0142) {
                        ((GameSession) (objectLocal26)).performAction1347(MixedSupport115.musicTrackState0006, 0);
                      } else {
                        ((GameSession) (objectLocal26)).performAction1347(SceneWidgetPart004.musicTrackState0001, 0);
                      }
                      MixedSupport095.booleanState0124 = true;
                      continue scanLoop2;
                    }
                    if (71 == HashNode.integerState0070) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -45);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 72) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0171 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -19);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 73) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0169 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -77);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 74) {
                      ((GameSession) (objectLocal26)).integerState0613 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1904((byte) -31);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 & ~((GameSession) (objectLocal26)).integerState0613;
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0169 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0169 & ~((GameSession) (objectLocal26)).integerState0613;
                      continue scanLoop2;
                    }
                    break;
                  }
                  this.performAction0117((byte) 126);
                  continue scanLoop2;
                }
              } else {
                UiComponentPart033.performAction1871(4792, 0);
                stackIntegerLocal19 = byteArgument1;
                stackIntegerLocal20 = 49;
              }
              if (stackIntegerLocal19 < stackIntegerLocal20) {
                DekoBlokoClient.computeMixedSupport0660303((String) null, 33);
              }
              if (null != GameDomainSupport003.rgbSpriteState0020 &&
                UiComponentPart010.integerState0188 <= 0) {
                stackIntegerLocal21 = 0;
              } else {
                stackIntegerLocal21 = 1;
              }
              integerLocal25 = stackIntegerLocal21;
              if (MixedSupport043.booleanState0049) {
                integerLocal25 = SecondaryNodeHashTable.booleanState0122 ? 1 : 0;
              }
              if (MixedSupport034.booleanState0042) {
                integerLocal25 = UiComponentPart021.booleanState0128 ? 1 : 0;
              }
              if (integerLocal25 != 0) {
                MixedSupport010.integerState0067 = 0;
              }
              if (RichTextLayout.computeBoolean0401((byte) -60)) {
                integerLocal27 = this.computeInteger0118((byte) 125);
                if (integerLocal27 == 0 ||
                  integerLocal27 == 1) {
                  if (1 != integerLocal27) {
                    if (IterableNodeCollection.booleanState0193) {
                      MixedSupport140.performAction1727((byte) -123);
                      MixedSupport046.booleanState0053 = true;
                      if (MixedSupport043.booleanState0049) {
                        UiComponentPart033.performAction1866(1, -99, false, 0, true, MixedSupport004.stringState0017);
                      }
                      ComponentContainer.renderingSupport008State0006 = MixedSupport033.computeRenderingSupport0080501(false, false, 0, false, false, 32357, false, false);
                      MixedSupport023.performAction0343(false, 96);
                      IterableNodeCollection.booleanState0193 = false;
                      MixedSupport043.booleanState0049 = false;
                      MixedSupport034.booleanState0042 = false;
                      LoginCredentials.performAction0805(-100);
                      MixedSupport007.booleanState0005 = false;
                    }
                    GameDomainSupport006.booleanState0227 = false;
                    MixedSupport087.booleanState0118 = false;
                    if (integerLocal51 != 0) {
                      GameDomainSupport006.booleanState0227 = true;
                      MixedSupport087.booleanState0118 = true;
                    }
                  } else {
                    GameDomainSupport006.booleanState0227 = true;
                    MixedSupport087.booleanState0118 = true;
                  }
                }
                integerLocal30 = 0;
                if (integerLocal27 == 2) {
                  integerLocal30 = 1;
                }
                if (IterableNodeCollection.booleanState0193 ||
                  MixedSupport087.booleanState0118 ||
                  GameDomainSupport006.booleanState0227) {
                  integerLocal30 = 1;
                }
                if (!RichTextLayout.computeBoolean0401((byte) -88)) {
                  integerLocal30 = 0;
                }
                if (integerLocal30 != 0) {
                  MixedSupport048.performAction0590(false);
                }
              }
              ResourceSupport003.performAction1196(0);
              if (GameAssets.booleanState0176 &&
                !MixedSupport007.booleanState0005 &&
                LoginCredentials.musicTrackState0004 != PcmPlayerService.musicTrackState0005) {
                MixedSupport092.performAction1166(256, LoginCredentials.musicTrackState0004, true);
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException caughtParameterLocal53) {
          caughtExceptionLocal22 = caughtParameterLocal53;
          runtimeExceptionLocal24 = caughtExceptionLocal22;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal24), "client.Q(" + byteArgument1 + ')');
        }
    }

    public static void performAction0310(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          stringState0096 = null;
          byteArrayState0004 = null;
          stringState0095 = null;
          rawSoundState0005 = null;
          rgbSpriteArrayState0007 = null;
          if (byteArgument1 != -56) {
            rgbSpriteArrayState0007 = (RgbSprite[]) null;
          }
          rgbSpriteArrayState0006 = null;
          stringState0097 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal2), "client.U(" + byteArgument1 + ')');
        }
    }

    public DekoBlokoClient() {
    }

    final void performAction0308(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (SceneWidgetNode.pcmPlayerState0002 != null) {
            SceneWidgetNode.pcmPlayerState0002.performAction0493();
          }
          if (integerArgument1 != 0) {
            return;
          }
          if (null != MixedSupport019.pcmPlayerState0001) {
            MixedSupport019.pcmPlayerState0001.performAction0493();
          }
          if (null != MixedSupport020.platformSupport006State0001) {
            MixedSupport123.performAction1594(false);
          }
          SceneWidgetPart010.performAction1513((byte) 88);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal2), "client.I(" + integerArgument1 + ')');
        }
    }

    private final void performAction0304(int integerArgument1, boolean booleanArgument2) {
        RenderingSupport008 stackRenderingSupport008Local1 = null;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        int stackIntegerLocal4 = 0;
        boolean stackBooleanLocal5 = false;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        boolean stackBooleanLocal8 = false;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        integerLocal17 = obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 != 30661) {
            return;
          }
          if (SceneWidgetPart002.integerState0241 != SceneWidgetPart002.integerState0249) {
            if (SceneWidgetPart013.integerState0847 == SceneWidgetPart002.integerState0249) {
              ReturnedShape.integerState0694 = ReturnedShape.integerState0694 + 1;
              if (ReturnedShape.integerState0694 != 16) {
                return;
              }
              if (!CacheWorkQueue.booleanState0079) {
                MixedSupport029.performAction0409(integerArgument1 - 30553);
                if (integerLocal17 != 0) {
                  MixedSupport047.performAction0581((byte) -126);
                }
              } else {
                MixedSupport047.performAction0581((byte) -126);
              }
              SceneWidgetPart002.integerState0249 = UiComponentPart011.integerState0238;
              if (integerLocal17 == 0) {
                return;
              }
            }
            if (~SceneWidgetPart002.integerState0249 != ~UiComponentPart011.integerState0238) {
              ReturnedShape.integerState0694 = ReturnedShape.integerState0694 - 1;
              if (ReturnedShape.integerState0694 != 0) {
                return;
              }
              SceneWidgetPart002.integerState0249 = SceneWidgetPart002.integerState0241;
              if (integerLocal17 == 0) {
                return;
              }
            }
            boolean frameRemainderLocal21 = true;
            if (!UiComponentPart023.computeBoolean1275(-30146)) {
              if (null != MixedSupport048.mixedSupport076State0001) {
                NetworkArchiveRequestManager.performAction1320(3, (byte) 85, MixedSupport048.mixedSupport076State0001);
              }
              InteractiveComponent.performAction0468(integerArgument1 - 31870);
              if (1 != MixedSupport037.integerState0224) {
                if (2 != MixedSupport037.integerState0224) {
                  if (MixedSupport037.integerState0224 != 3) {
                    if (MixedSupport037.integerState0224 == 4) {
                      MixedSupport023.performAction0343(false, integerArgument1 - 30547);
                      frameRemainderLocal21 = (integerLocal17 != 0);
                    }
                    if (frameRemainderLocal21) {
                      if (MixedSupport037.integerState0224 != 5) {
                        if (MixedSupport037.integerState0224 == 6) {
                          MixedSupport020.renderingSupport008State0003 = MixedSupport110.computeRenderingSupport0081402(-44, false);
                          frameRemainderLocal21 = (integerLocal17 != 0);
                        }
                        if (frameRemainderLocal21) {
                          if (MixedSupport037.integerState0224 != 8) {
                            if (7 != MixedSupport037.integerState0224) {
                              throw new IllegalStateException(Integer.toString(MixedSupport037.integerState0224));
                            }
                            UiComponentPart004.renderingSupport008State0002 = NetworkSupport009.computeRenderingSupport0081215(false, 415);
                            frameRemainderLocal21 = (integerLocal17 != 0);
                          }
                          if (frameRemainderLocal21) {
                            MixedSupport007.renderingSupport008State0001 = UiComponentPart014.computeRenderingSupport0080709((byte) 82, false);
                            frameRemainderLocal21 = (integerLocal17 != 0);
                          }
                        }
                      }
                      if (frameRemainderLocal21) {
                        MixedSupport051.renderingSupport008State0005 = IterableNodeCollection.computeRenderingSupport0081707(MixedSupport093.integerArrayState0172, false, 0, -111);
                        if (integerLocal17 != 0) {
                          MixedSupport068.performAction0843(2, true);
                          MixedSupport069.performAction0847(0, true);
                          GameplayControls.performAction1803(true, (byte) -53);
                        }
                      }
                    }
                  } else {
                    MixedSupport068.performAction0843(2, true);
                    if (integerLocal17 != 0) {
                      MixedSupport069.performAction0847(0, true);
                      GameplayControls.performAction1803(true, (byte) -53);
                    }
                  }
                } else {
                  MixedSupport069.performAction0847(0, true);
                  if (integerLocal17 != 0) {
                    GameplayControls.performAction1803(true, (byte) -53);
                  }
                }
              } else {
                GameplayControls.performAction1803(true, (byte) -53);
              }
            }
            SceneWidgetPart002.integerState0249 = BucketBoard.integerState0452;
            if (integerLocal17 == 0) {
              return;
            }
          }
          boolean frameCompletedLocal22 = true;
          boolean frameRemainderLocal23 = true;
          integerLocal10 = 0;
          integerLocal12 = 0;
          if (!booleanArgument2) {
            if (null != ComponentContainer.renderingSupport008State0006) {
              if (ResourceSupport002.booleanState0006) {
                MixedSupport102.renderingSupport008State0007.performAction0899((byte) -96);
                frameRemainderLocal23 = (integerLocal17 != 0);
              }
              if (frameRemainderLocal23) {
                if (!BucketBoard.booleanState0109) {
                  if (!SceneWidgetPart007.booleanState0114) {
                    if (!MixedSupport043.booleanState0048) {
                      if (!SceneWidgetPart013.booleanState0203) {
                        if (SecondaryNodeHashTable.booleanState0121) {
                          MixedSupport033.renderingSupport008State0004.performAction0900(2824);
                          frameRemainderLocal23 = (integerLocal17 != 0);
                        }
                        if (frameRemainderLocal23) {
                          if (!MixedSupport049.booleanState0058) {
                            ComponentContainer.renderingSupport008State0006.performAction0908(128);
                            frameRemainderLocal23 = (integerLocal17 != 0);
                          }
                          if (frameRemainderLocal23) {
                            MixedSupport051.performAction0613((RenderingSupport008) null, (byte) 95);
                            SoftwareFramebuffer.computeBoolean1850(false);
                            integerLocal13 = UiComponentPart017.computeInteger0979(0, true);
                            if (1 == integerLocal13 ||
                              integerLocal13 == 2) {
                              MixedSupport049.booleanState0058 = false;
                              stackRenderingSupport008Local1 = ComponentContainer.renderingSupport008State0006;
                              stackIntegerLocal2 = integerArgument1 ^ -30662;
                              stackBooleanLocal3 = (integerLocal13 == 2);
                              ((RenderingSupport008) (Object) stackRenderingSupport008Local1).performAction0889(stackIntegerLocal2, stackBooleanLocal3);
                            }
                            if (3 == integerLocal13) {
                              NetworkSupport012.performAction1579((byte) -65, UiComponentPart029.computeApplet1530(25144));
                            }
                            frameRemainderLocal23 = (integerLocal17 != 0);
                          }
                        }
                      }
                      if (frameRemainderLocal23) {
                        UiComponentPart004.renderingSupport008State0002.performAction0893(-8622);
                        frameRemainderLocal23 = (integerLocal17 != 0);
                      }
                    }
                    if (frameRemainderLocal23) {
                      MixedSupport007.renderingSupport008State0001.performAction0909((byte) 101);
                      frameRemainderLocal23 = (integerLocal17 != 0);
                    }
                  }
                  if (frameRemainderLocal23) {
                    MixedSupport020.renderingSupport008State0003.performAction0897((byte) -63);
                    frameRemainderLocal23 = (integerLocal17 != 0);
                  }
                }
                if (frameRemainderLocal23) {
                  MixedSupport051.renderingSupport008State0005.performAction0906(-114);
                  frameRemainderLocal23 = (integerLocal17 != 0);
                }
              }
            }
            if (frameRemainderLocal23) {
              if (MixedSupport007.booleanState0005) {
                if (IterableNodeCollection.booleanState0193) {
                  integerLocal10 = 1;
                  if (ComponentContainer.renderingSupport008State0006 == null &&
                    !RichTextLayout.computeBoolean0402((byte) 92)) {
                    stackIntegerLocal4 = 1;
                  } else {
                    stackIntegerLocal4 = 0;
                  }
                  integerLocal12 = stackIntegerLocal4;
                  frameRemainderLocal23 = (integerLocal17 != 0);
                }
                if (frameRemainderLocal23) {
                  integerLocal20 = ComponentContainer.gameSessionState0002.computeBoolean1355(2, true) ? 1 : 0;
                  while (integerLocal20 == 0) {
                    stackBooleanLocal5 = DualNodeDeque.computeBoolean0027(50);
                    if (integerLocal17 != 0) {
                      frameCompletedLocal22 = false;
                      break;
                    }
                    if (stackBooleanLocal5) {
                      integerLocal20 = ComponentContainer.gameSessionState0002.computeBoolean1366(false) ? 1 : 0;
                      continue;
                    }
                    break;
                  }
                  if ((frameCompletedLocal22) &&
                    (integerLocal17 != 0 &&
                    IterableNodeCollection.booleanState0193)) {
                    integerLocal10 = 1;
                  }
                }
              } else {
                if (IterableNodeCollection.booleanState0193) {
                  integerLocal10 = 1;
                }
              }
            }
          }
          if (frameCompletedLocal22) {
            stackBooleanLocal5 = IterableNodeCollection.booleanState0193;
          }
          boolean frameRemainderLocal24 = true;
          boolean frameCompletedLocal25 = true;
          if (stackBooleanLocal5 &&
            !MixedSupport087.booleanState0118 &&
            !GameDomainSupport006.booleanState0227) {
            if (MixedSupport043.booleanState0049 &&
              LoginCredentials.booleanState0085) {
              integerLocal10 = 0;
            }
            UiComponentPart016.performAction0855(integerLocal10 != 0, -3051);
            if (MixedSupport034.booleanState0042) {
              UiComponent.gameSessionState0001.computeBoolean1355(2, integerLocal12 != 0);
            }
            if (MixedSupport043.booleanState0049) {
              UiComponentPart023.performAction1272(180, 320, false, integerLocal12 != 0);
              if (LoginCredentials.booleanState0085) {
                integerLocal12 = 0;
              }
              ComponentContainer.gameSessionState0002.computeBoolean1355(2, integerLocal12 != 0);
            }
            while (DualNodeDeque.computeBoolean0027(-123)) {
              if (integerLocal17 != 0) {
                frameCompletedLocal25 = false;
                break;
              }
              if (null != GameDomainSupport003.rgbSpriteState0020 &&
                UiComponentPart010.integerState0188 <= 0) {
                stackIntegerLocal6 = 0;
              } else {
                stackIntegerLocal6 = 1;
              }
              integerLocal18 = stackIntegerLocal6;
              if (MixedSupport043.booleanState0049) {
                integerLocal18 = SecondaryNodeHashTable.booleanState0122 ? 1 : 0;
              }
              if (MixedSupport034.booleanState0042) {
                integerLocal18 = UiComponentPart021.booleanState0128 ? 1 : 0;
              }
              boolean frameRemainderLocal26 = true;
              if (!booleanArgument2) {
                if ((MixedSupport043.booleanState0049) &&
                  (frameRemainderLocal26 = !(!MixedSupport046.computeBoolean0573(13, 12, 15, (byte) -83)))) {
                  continue;
                }
                if ((frameRemainderLocal26) &&
                  (integerLocal18 != 0)) {
                  SceneWidgetPart005.computeBoolean0724(12, 15, 13, (byte) 69);
                }
              }
              if (MixedSupport034.booleanState0042 &&
                integerLocal12 != 0) {
                UiComponent.gameSessionState0001.computeBoolean1366(false);
              }
              if (MixedSupport043.booleanState0049 &&
                integerLocal12 != 0) {
                ComponentContainer.gameSessionState0002.computeBoolean1366(false);
              }
            }
          }
          if ((frameCompletedLocal25) &&
            (frameRemainderLocal24 = !(IterableNodeCollection.booleanState0193))) {
            NetworkSupport004.performAction0607(-29550);
          }
          if ((frameRemainderLocal24) &&
            (DualNodeDeque.computeInteger0037(integerArgument1 - 58860) == 0)) {
            SocketFactory.performAction1844((byte) 68);
          }
          if (GameDomainSupport003.rgbSpriteState0020 != null &&
            UiComponentPart010.integerState0188 <= 0) {
            stackIntegerLocal7 = 0;
          } else {
            stackIntegerLocal7 = 1;
          }
          integerLocal19 = stackIntegerLocal7;
          if (MixedSupport043.booleanState0049) {
            integerLocal19 = SecondaryNodeHashTable.booleanState0122 ? 1 : 0;
          }
          if (MixedSupport034.booleanState0042) {
            integerLocal19 = UiComponentPart021.booleanState0128 ? 1 : 0;
          }
          if (integerLocal19 == 0) {
            if (!(UiComponentPart010.integerState0188 <= 0)) {
              UiComponentPart010.integerState0188 = UiComponentPart010.integerState0188 - 1;
              if ((integerLocal17 != 0) &&
                (UiComponentPart010.integerState0188 < UiComponentPart009.integerState0149)) {
                UiComponentPart010.integerState0188 = UiComponentPart010.integerState0188 + 1;
              }
            }
          } else {
            if (UiComponentPart010.integerState0188 < UiComponentPart009.integerState0149) {
              UiComponentPart010.integerState0188 = UiComponentPart010.integerState0188 + 1;
            }
          }
          boolean frameRemainderLocal27 = true;
          integerLocal14 = UiComponentPart009.integerState0149 * UiComponentPart009.integerState0149;
          integerLocal15 = -(UiComponentPart010.integerState0188 * UiComponentPart010.integerState0188) + integerLocal14;
          integerLocal16 = RichTextLayout.integerState0157 + 120 * integerLocal15 / integerLocal14;
          MixedSupport062.performAction0742(integerLocal16, -32);
          if (MixedSupport135.rgbSpriteState0060 == GameDomainSupport003.rgbSpriteState0020 &&
            DualNodeDeque.computeInteger0037(integerArgument1 - 58860) == 0) {
            if (MixedSupport007.booleanState0005) {
              DiagnosticSupport001.booleanState0024 = false;
              if (ComponentContainer.gameSessionState0002 != null &&
                ComponentContainer.gameSessionState0002.integerState0623 < 38) {
                MixedSupport135.rgbSpriteState0060 = MixedSupport026.rgbSpriteArrayState0009[ComponentContainer.gameSessionState0002.mixedSupport028State0001.integerState0166];
              }
              if (MixedSupport034.booleanState0042) {
                MixedSupport135.rgbSpriteState0060 = MixedSupport026.rgbSpriteArrayState0009[UiComponent.gameSessionState0001.mixedSupport028State0001.integerState0166];
              }
              stackBooleanLocal8 = !(IterableNodeCollection.booleanState0193);
              MouseInput.booleanState0223 = stackBooleanLocal8;
              frameRemainderLocal27 = (integerLocal17 != 0);
            }
            if (frameRemainderLocal27) {
              if (IterableNodeCollection.booleanState0193) {
                DiagnosticSupport001.booleanState0024 = false;
                MouseInput.booleanState0223 = false;
                MixedSupport135.rgbSpriteState0060 = null;
                if (integerLocal17 != 0) {
                  DiagnosticSupport001.booleanState0024 = true;
                  MixedSupport135.rgbSpriteState0060 = SceneWidgetPart011.rgbSpriteState0058;
                  MouseInput.booleanState0223 = true;
                }
              } else {
                DiagnosticSupport001.booleanState0024 = true;
                MixedSupport135.rgbSpriteState0060 = SceneWidgetPart011.rgbSpriteState0058;
                MouseInput.booleanState0223 = true;
              }
            }
          }
          if (MixedSupport135.rgbSpriteState0060 != GameDomainSupport003.rgbSpriteState0020) {
            MixedSupport144.integerState0848 = MixedSupport144.integerState0848 + 1;
            if (30 <= MixedSupport144.integerState0848) {
              MixedSupport144.integerState0848 = 0;
              GameDomainSupport003.rgbSpriteState0020 = MixedSupport135.rgbSpriteState0060;
              SceneWidgetPart009.booleanState0151 = MouseInput.booleanState0223;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal28) {
          caughtExceptionLocal9 = caughtParameterLocal28;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal11), "client.O(" + integerArgument1 + ',' + booleanArgument2 + ')');
        }
    }

    final void performAction0300(int integerArgument1) {
        DekoBlokoClient.performAction0310((byte) -56);
        MixedSupport143.performAction1757((byte) 101);
        NodeDeque.clearStaticReferences((byte) 79);
        MixedSupport011.clearStaticReferences(112);
        SceneWidgetNode.clearStaticReferences(710);
        KeyboardInputHandler.clearStaticReferences(128);
        TranslatedUiText.performAction1086((byte) -33);
        MixedSupport153.performAction1859(true);
        DiagnosticSupport002.performAction0777((byte) -9);
        GameApplet.performAction0694(6);
        NetworkSupport008.clearStaticReferences(false);
        MouseInput.clearStaticReferences(true);
        MouseWheelInput.clearStaticReferences(64);
        SoftwareRaster.performAction0650();
        ResourceArchive.clearStaticReferences(127);
        MixedSupport128.clearStaticReferences(122);
        GameDomainSupport001.performAction0093(-117);
        PacketBuffer.clearStaticReferences(8);
        MixedSupport063.clearStaticReferences(78);
        GameDomainSupport004.clearStaticReferences(false);
        MixedSupport037.performAction0526((byte) -108);
        RenderingSupport003.clearStaticReferences(true);
        MixedSupport025.performAction0383(121);
        MixedSupport052.performAction0625((byte) 82);
        MixedSupport093.performAction1169(false);
        MixedSupport077.performAction0944(126);
        MixedSupport131.performAction1668(23358);
        MixedSupport056.performAction0680(-21128);
        MixedSupport101.clearStaticReferences((byte) -46);
        GameAssets.performAction1539((byte) -105);
        MixedSupport082.performAction0983(89);
        MixedSupport067.performAction0802(-114);
        MixedSupport059.performAction0720((byte) -120);
        Framebuffer.performAction0426(24744);
        MixedSupport014.clearStaticReferences(12623);
        PlatformSupport006.clearStaticReferences(-100);
        CodecSupport001.performAction1474((byte) -91);
        NetworkSupport003.performAction0351((byte) 115);
        CacheWorkQueue.clearStaticReferences(0);
        Js5ArchiveManager.clearStaticReferences((byte) 0);
        MixedSupport091.clearStaticReferences((byte) -73);
        BufferedSocket.clearStaticReferences(-11657);
        NetworkSupport011.performAction1299(113);
        PcmPlayer.clearStaticReferences();
        MusicTrack.clearStaticReferences(31158);
        MidiSynthesizer.clearStaticReferences();
        RenderingSupport008.performAction0910(126);
        GameSession.performAction1348(false);
        MixedSupport005.clearStaticReferences(8);
        NetworkSupport004.clearStaticReferences(0);
        MixedSupport138.performAction1723((byte) -75);
        BucketBoard.performAction1013(36);
        HashNode.performAction0150(25189);
        MixedSupport150.performAction1827(18);
        MixedSupport017.clearStaticReferences(78);
        MixedSupport021.performAction0325(36);
        PcmPlayerService.clearStaticReferences(-120);
        MixedSupport130.clearStaticReferences(103);
        MixedSupport064.clearStaticReferences(true);
        SceneWidget.performAction1826((byte) 77);
        SceneWidgetPart013.performAction1763((byte) 116);
        SecondaryNodeHashTable.clearStaticReferences(-121);
        SceneWidgetPart012.performAction1659(-18263);
        RenderingSupport004.performAction0589(0);
        DualNode.performAction0129(-106);
        MixedSupport146.clearStaticReferences(true);
        MixedSupport100.clearStaticReferences(110);
        MixedSupport029.performAction0413(-96);
        MixedSupport114.performAction1472(-114);
        UiComponentPart016.performAction0860((byte) 102);
        UiComponentPart033.performAction1874(0);
        UiComponentPart026.performAction1431((byte) 89);
        UiComponentPart023.performAction1274((byte) 24);
        UiComponentPart012.performAction0602(15);
        UiComponentPart031.performAction1643(true);
        UiComponentPart017.clearStaticReferences((byte) 1);
        UiComponentPart013.clearStaticReferences(0);
        UiComponentPart005.clearStaticReferences(3);
        LoginCredentials.performAction0811((byte) 101);
        NetworkSupport002.clearStaticReferences(23302);
        MixedSupport085.clearStaticReferences(0);
        MixedSupport090.clearStaticReferences(-61);
        PcmResampler.clearStaticReferences(23369);
        MixedSupport094.clearStaticReferences(-1);
        ResourceSupport001.clearStaticReferences((byte) -67);
        GzipDecompressor.clearStaticReferences(-13495);
        ResourceSupport003.clearStaticReferences((byte) 91);
        MixedSupport007.clearStaticReferences(119);
        Sprite.performAction0955(-27983);
        BitmapFont.clearStaticReferences();
        MixedSupport133.clearStaticReferences((byte) -32);
        MixedSupport089.performAction1121(3);
        MixedSupport102.performAction1246((byte) -120);
        MixedSupport051.clearStaticReferences((byte) -128);
        MixedSupport134.clearStaticReferences(true);
        MixedSupport116.clearStaticReferences(-117);
        MixedSupport083.clearStaticReferences(108);
        SceneWidgetPart009.performAction1373(77);
        SceneWidgetPart008.performAction1163(48);
        SceneWidgetPart003.performAction0620(3);
        SceneWidgetPart006.performAction0792(32);
        SceneWidgetPart002.performAction0570(-2);
        SceneWidgetPart010.performAction1514((byte) -94);
        MixedSupport104.performAction1253((byte) -103);
        SceneWidgetPart007.performAction1081(256);
        MixedSupport006.performAction0063((byte) -112);
        GameDomainSupport002.clearStaticReferences((byte) 102);
        MixedSupport121.performAction1571(-28610);
        GameplayControls.performAction1798((byte) -93);
        MixedSupport058.clearStaticReferences(-18551);
        MixedSupport144.performAction1765(27067);
        MixedSupport098.performAction1229(false);
        MixedSupport071.performAction0861(-109);
        MixedSupport068.performAction0841((byte) -91);
        GameDomainSupport003.clearStaticReferences(-9724);
        MixedSupport015.clearStaticReferences((byte) -94);
        MixedSupport027.performAction0390(-22811);
        MixedSupport103.performAction1248(-1);
        MixedSupport039.clearStaticReferences(0);
        MixedSupport028.clearStaticReferences(92);
        ReturnedShapeCache.clearStaticReferences(2);
        MixedSupport117.performAction1516((byte) -82);
        AnimatedTileRegion.clearStaticReferences(127);
        MixedSupport122.performAction1573((byte) 110);
        CipherPacketBuffer.performAction1693((byte) 120);
        MixedSupport092.performAction1165(14925);
        MixedSupport047.performAction0582(2);
        MixedSupport141.performAction1734(-66);
        MixedSupport048.clearStaticReferences(98);
        MixedSupport043.performAction0553(true);
        MixedSupport030.clearStaticReferences((byte) -78);
        MixedSupport054.performAction0647((byte) 126);
        ReturnedShape.performAction1470(false);
        RenderingSupport006.clearStaticReferences(123);
        MixedSupport149.performAction1806(121);
        MixedSupport031.clearStaticReferences(10140);
        MixedSupport106.performAction1301(62);
        UiComponentPart019.clearStaticReferences(-17690);
        MixedSupport046.performAction0572((byte) -118);
        MixedSupport097.clearStaticReferences();
        NetworkSupport001.clearStaticReferences(0);
        SceneWidgetPart001.performAction0159(15338);
        NetworkArchiveRequestManager.performAction1324(112);
        DualNodeDeque.performAction0036(1);
        ResourceSupport004.performAction1284((byte) 106);
        MixedSupport073.performAction0929(-1643605936);
        ArchiveRequestManager.performAction0471(true);
        MixedSupport080.clearStaticReferences(true);
        PlatformSupport004.clearStaticReferences(12741);
        MixedSupport018.clearStaticReferences(-27513);
        MixedSupport120.performAction1533((byte) -126);
        MixedSupport105.performAction1270((byte) 126);
        UiComponentPart014.performAction0715(-30);
        MixedSupport001.clearStaticReferences(-1);
        MixedSupport109.clearStaticReferences();
        VorbisSample.clearStaticReferences();
        NetworkSupport009.clearStaticReferences(3805);
        ClientException.performAction0367((byte) -68);
        MixedSupport145.performAction1767((byte) 91);
        MixedSupport115.performAction1502(2);
        MixedSupport036.clearStaticReferences(38);
        MixedSupport002.performAction0026(true);
        MixedSupport081.performAction0981(101);
        PlatformSupport002.clearStaticReferences(16057);
        MixedSupport140.clearStaticReferences((byte) 86);
        MixedSupport096.clearStaticReferences(true);
        MixedSupport086.clearStaticReferences(false);
        if (integerArgument1 < 75) {
          return;
        }
        try {
          MixedSupport125.clearStaticReferences();
          MixedSupport148.clearStaticReferences(true);
          MixedSupport075.clearStaticReferences(true);
          MixedSupport137.clearStaticReferences((byte) 111);
          MixedSupport087.clearStaticReferences(-117);
          MixedSupport074.clearStaticReferences((byte) -117);
          MixedSupport009.clearStaticReferences((byte) -102);
          InputAdapter001.clearStaticReferences((byte) -100);
          MixedSupport110.clearStaticReferences((byte) 126);
          TextLayout.clearStaticReferences((byte) 126);
          UiComponent.performAction0224(54);
          ComponentDecorator.performAction1042((byte) -79);
          UiComponentPart030.performAction1605((byte) 94);
          UiComponentPart003.clearStaticReferences(2);
          ComponentContainer.performAction0921(116);
          MixedSupport113.clearStaticReferences((byte) -119);
          MixedSupport070.clearStaticReferences(-5161);
          MixedSupport060.clearStaticReferences();
          MixedSupport135.performAction1683((byte) -128);
          MixedSupport042.clearStaticReferences(29047);
          MixedSupport045.clearStaticReferences((byte) -52);
          MixedSupport019.performAction0255(-48);
          SceneWidgetPart005.clearStaticReferences((byte) 34);
          MixedSupport032.performAction0473((byte) 82);
          NetworkSupport012.performAction1580(30553);
          MixedSupport003.performAction0043((byte) -17);
          NetworkSupport007.performAction1065(0);
          MixedSupport078.performAction0946((byte) 92);
          MixedSupport035.performAction0505((byte) 117);
          ThemeTips.clearStaticReferences(false);
          SocketFactory.clearStaticReferences((byte) -37);
          DiagnosticSupport001.performAction0332((byte) 91);
          MixedSupport026.performAction0389(72);
          SoftwareFramebuffer.performAction1855(-119);
          MixedSupport049.performAction0591(79);
          MixedSupport023.clearStaticReferences(true);
          RenderingSupport013.clearStaticReferences(-20007);
          AudioSupport001.clearStaticReferences();
          MixedSupport040.performAction0536(25988);
          RenderingSupport002.performAction0240(124);
          MixedSupport013.clearStaticReferences((byte) 92);
          MixedSupport152.performAction1841(1);
          UiComponentPart006.clearStaticReferences(-121);
          UiComponentPart021.clearStaticReferences((byte) 109);
          UiComponentPart028.performAction1497(81);
          UiComponentPart004.performAction0188(104);
          UiComponentPart007.performAction0360(1);
          UiComponentPart025.performAction1399((byte) 117);
          UiComponentPart011.clearStaticReferences(-99);
          UiComponentPart022.performAction1239((byte) 47);
          UiComponentPart009.clearStaticReferences(false);
          TextFieldValidator.performAction1915(18966);
          MixedSupport010.performAction0140((byte) 22);
          UiComponentPart018.clearStaticReferences((byte) 106);
          UiComponentPart001.performAction0054(-59);
          UiComponentPart002.performAction0078(-109);
          SceneWidgetPart011.clearStaticReferences((byte) 105);
          SceneWidgetPart004.performAction0623(-102);
          MixedSupport022.clearStaticReferences((byte) -121);
          MixedSupport112.clearStaticReferences(573767765);
          InputAdapter002.clearStaticReferences(119);
          UiComponentPart024.performAction1315(33);
          UiComponentPart020.performAction1194(true);
          UiComponentPart032.performAction1753(-20);
          RichTextLayout.performAction0399((byte) -37);
          MixedSupport044.performAction0557(0);
          NetworkSupport006.clearStaticReferences(false);
          UiComponentPart029.performAction1529(11344);
          UiComponentPart015.performAction0718(true);
          NodeHashTable.clearStaticReferences(0);
          IterableNodeCollection.performAction1709((byte) 73);
          MixedSupport147.performAction1781((byte) 46);
          MixedSupport111.clearStaticReferences(2);
          MixedSupport132.clearStaticReferences(8);
          ProxySocketFactory.clearStaticReferences(false);
          AudioFilter.clearStaticReferences();
          MixedSupport154.performAction1861(0);
          NodeHashTableIterator.clearStaticReferences(1714134600);
          SecondaryNodeDequeIterator.clearStaticReferences(8);
          MixedSupport072.clearStaticReferences(93);
          MixedSupport076.performAction0941(-1);
          InputAdapter003.performAction1534(3);
          MixedSupport136.performAction1701(-21771);
          MixedSupport041.performAction0539(8);
          MixedSupport099.performAction1230((byte) 6);
          MixedSupport024.performAction0371(87);
          MixedSupport050.performAction0605(38);
          MixedSupport127.clearStaticReferences(false);
          UiComponentPart010.clearStaticReferences(0);
          SceneWidgetPart014.performAction1836(-78);
          MixedSupport020.clearStaticReferences((byte) -39);
          GameDomainSupport005.performAction1240((byte) 78);
          MixedSupport079.performAction0953(-19893);
          MixedSupport033.performAction0502(30061);
          NetworkSupport005.performAction0932((byte) 22);
          MixedSupport118.clearStaticReferences(13820388);
          MixedSupport038.clearStaticReferences(-45);
          MixedSupport124.clearStaticReferences(false);
          MixedSupport139.clearStaticReferences(0);
          RenderingSupport001.clearStaticReferences(-73);
          MixedSupport004.performAction0050((byte) -47);
          MixedSupport016.clearStaticReferences((byte) 121);
          UiComponentPart008.clearStaticReferences(true);
          MixedSupport151.performAction1838(2);
          MixedSupport062.performAction0741(-85);
          GameDomainSupport006.performAction1879(7751);
          MixedSupport108.performAction1318(-30349);
          MixedSupport095.performAction1173((byte) 121);
          MixedSupport084.performAction1032((byte) -89);
          MixedSupport053.performAction0628(22771);
          MixedSupport034.performAction0504((byte) -74);
          MixedSupport123.performAction1584((byte) 86);
          TextLineMetrics.performAction1127(-120);
          MixedSupport069.clearStaticReferences(62);
          MixedSupport126.performAction1632(0);
          MixedSupport061.performAction0740(9369);
          MixedSupport129.performAction1664((byte) -68);
          RenderingSupport007.performAction0866(127);
          MatchingFieldValidator.performAction1464((byte) -112);
          MixedSupport057.clearStaticReferences(28180);
          NetworkSupport010.performAction1288(-59);
          ValidationStatus.clearStaticReferences(20908);
          ResourceSupport002.clearStaticReferences((byte) 127);
          MixedSupport066.performAction0786(true);
          this.stringState0042 = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeException), "client.J(" + integerArgument1 + ')');
        }
    }

    final void performAction0307(int integerArgument1) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        boolean stackBooleanLocal4 = false;
        int stackIntegerLocal5 = 0;
        boolean stackBooleanLocal6 = false;
        RuntimeException caughtExceptionLocal7 = null;
        java.awt.Canvas canvasLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        RgbSprite rgbSpriteLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        long longLocal14 = 0L;
        long longLocal15 = 0L;
        int integerLocal16 = 0;
        int integerLocal17;
        integerLocal16 = obfuscationControl ? 1 : 0;
        try {
          canvasLocal8 = Js5ArchiveManager.getActiveCanvas(-86);
          if (MixedSupport124.computeBoolean1606((byte) -56)) {
            MixedSupport067.performAction0803(canvasLocal8, MixedSupport016.computeBoolean0203(integerArgument1 ^ 8512), -6351);
            return;
          }
          if (!GameAssets.booleanState0176) {
            UiComponentPart005.performAction0320(true, canvasLocal8);
            return;
          }
          if (!UiComponentPart029.computeBoolean1531(-1)) {
            UiComponentPart025.performAction1392(100.0f, -81, MixedSupport010.stringState0048);
            UiComponentPart005.performAction0320(true, canvasLocal8);
            return;
          }
          boolean frameRemainderLocal18 = true;
          UiComponentPart026.performAction1426(RenderingSupport007.rgbSpriteState0026, MixedSupport111.rgbSpriteState0047, (byte) -109);
          if (ComponentContainer.renderingSupport008State0006 == null &&
            !RichTextLayout.computeBoolean0402((byte) 111) && (!MixedSupport043.booleanState0049 ||
            !LoginCredentials.booleanState0085)) {
            stackIntegerLocal1 = 1;
            frameRemainderLocal18 = false;
          }
          else {
            stackIntegerLocal1 = 0;
          }
          integerLocal10 = stackIntegerLocal1;
          if (0 == MixedSupport112.integerState0681) {
            UiComponentPart004.integerState0095 = MixedSupport006.integerState0039;
          }
          if (UiComponentPart004.integerState0095 <= 1) {
            DiagnosticSupport002.booleanState0082 = false;
            if (integerLocal16 != 0) {
              InputAdapter003.rgbSpriteState0054.performAction0256();
            }
          } else {
            InputAdapter003.rgbSpriteState0054.performAction0256();
          }
          while (true) {
            if (MixedSupport112.integerState0681 == 0) {
              UiComponentPart001.performAction0058((byte) 84);
            }
            if (ComponentContainer.gameSessionState0002 != null) {
              ComponentContainer.gameSessionState0002.performAction1349(integerLocal10 != 0, MixedSupport112.integerState0681, UiComponentPart004.integerState0095, true, false);
            }
            if (null != UiComponent.gameSessionState0001) {
              UiComponent.gameSessionState0001.performAction1349(integerLocal10 != 0, MixedSupport112.integerState0681, UiComponentPart004.integerState0095, true, false);
            }
            if (1 < UiComponentPart004.integerState0095) {
              MixedSupport112.integerState0681 = MixedSupport112.integerState0681 + 1;
              if (!DiagnosticSupport002.booleanState0082 &&
                UiComponentPart004.integerState0095 > MixedSupport112.integerState0681) {
                continue;
              }
            }
            break;
          }
          if (1 < UiComponentPart004.integerState0095) {
            if (MixedSupport112.integerState0681 >= UiComponentPart004.integerState0095) {
              rgbSpriteLocal11 = UiComponentPart022.rgbSpriteState0038;
              UiComponentPart022.rgbSpriteState0038 = InputAdapter003.rgbSpriteState0054;
              DiagnosticSupport002.booleanState0082 = true;
              MixedSupport112.integerState0681 = 0;
              InputAdapter003.rgbSpriteState0054 = rgbSpriteLocal11;
            }
            MixedSupport080.framebufferState0001.performAction0423((byte) -113);
            UiComponentPart022.rgbSpriteState0038.performAction0290(0, 0);
          }
          if (null != ComponentContainer.gameSessionState0002) {
            ComponentContainer.gameSessionState0002.performAction1349(integerLocal10 != 0, MixedSupport112.integerState0681, UiComponentPart004.integerState0095, false, false);
          }
          if (UiComponent.gameSessionState0001 != null) {
            UiComponent.gameSessionState0001.performAction1349(integerLocal10 != 0, MixedSupport112.integerState0681, UiComponentPart004.integerState0095, false, false);
          }
          if (!MixedSupport007.booleanState0005 &&
            !IterableNodeCollection.booleanState0193) {
            ComponentContainer.renderingSupport008State0006.performAction0878(false);
            integerLocal12 = 0;
            if (null != MixedSupport102.renderingSupport008State0007) {
              integerLocal12 = 1;
              MixedSupport102.renderingSupport008State0007.performAction0887((byte) -75);
            }
            if (MixedSupport051.renderingSupport008State0005 != null) {
              integerLocal12 = 1;
              MixedSupport051.renderingSupport008State0005.performAction0901((byte) 99);
            }
            if (null != MixedSupport020.renderingSupport008State0003) {
              MixedSupport020.renderingSupport008State0003.performAction0881((byte) -48);
              integerLocal12 = 1;
            }
            if (null != MixedSupport007.renderingSupport008State0001) {
              MixedSupport007.renderingSupport008State0001.performAction0904(123);
              integerLocal12 = 1;
            }
            if (null != UiComponentPart004.renderingSupport008State0002) {
              UiComponentPart004.renderingSupport008State0002.performAction0892((byte) 45);
              integerLocal12 = 1;
            }
            if (MixedSupport033.renderingSupport008State0004 != null) {
              MixedSupport033.renderingSupport008State0004.performAction0888(2);
              integerLocal12 = 1;
            }
            if (MixedSupport049.booleanState0058 &&
              GameDomainSupport003.rgbSpriteState0020 == MixedSupport135.rgbSpriteState0060 &&
              integerLocal12 == 0) {
              GameDomainSupport005.performAction1241(390);
            }
          }
          if (MixedSupport043.booleanState0049 &&
            LoginCredentials.booleanState0085) {
            stackIntegerLocal2 = 1;
          } else {
            stackIntegerLocal2 = 0;
          }
          integerLocal17 = stackIntegerLocal2;
          stackIntegerLocal3 = 88;
          stackBooleanLocal4 = (integerLocal17 == 0) && (ComponentContainer.renderingSupport008State0006 == null) && (MixedSupport014.computeBoolean0190((byte) -128));
          UiComponentPart031.performAction1633(stackIntegerLocal3, stackBooleanLocal4);
          if (integerLocal17 != 0) {
            MixedSupport022.performAction0331(false, MixedSupport014.computeBoolean0190((byte) -128));
          }
          if (integerArgument1 != 320) {
            stringState0097 = (String) null;
          }
          if ((MixedSupport007.booleanState0005 ||
            IterableNodeCollection.booleanState0193) &&
            ComponentContainer.renderingSupport008State0006 != null) {
            SoftwareRaster.performAction0671(0, 0, 640, 480);
            ComponentContainer.renderingSupport008State0006.performAction0898(-26325);
            if (MixedSupport033.renderingSupport008State0004 != null) {
              MixedSupport033.renderingSupport008State0004.performAction0888(2);
            }
          }
          if (UiComponentPart005.computeBoolean0322((byte) 99)) {
            SoftwareRaster.performAction0654(320 - GameDomainSupport006.computeInteger1878(3) / 2 - 34, -(ResourceSupport004.computeInteger1283(20) / 2) + 240 - 24, GameDomainSupport006.computeInteger1878(3) + 68, ResourceSupport004.computeInteger1283(126) + 48, 0, 200);
            GameplayControls.performAction1800(ResourceSupport004.computeInteger1283(integerArgument1 - 356) + 60, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, GameDomainSupport006.computeInteger1878(3) + 80, 240 - ResourceSupport004.computeInteger1283(-5) / 2 - 30, 320 - GameDomainSupport006.computeInteger1878(3) / 2 - 40);
            IterableNodeCollection.performAction1710(32659);
          }
          if (!UiComponentPart001.computeBoolean0059((byte) 94)) {
            if (NetworkSupport010.computeBoolean1289(67)) {
              stackIntegerLocal5 = 112;
              if (MixedSupport020.platformSupport006State0001 != null) {
                stackBooleanLocal6 = true;
              } else {
                stackBooleanLocal6 = GameSession.booleanState0141;
              }
              UiComponentPart030.performAction1599(stackIntegerLocal5, stackBooleanLocal6);
              if (integerLocal16 != 0) {
                SoftwareRaster.performAction0654(-34 - MixedSupport143.computeInteger1756(480) / 2 + 320, -24 + (-(UiComponentPart008.computeInteger0372(110) / 2) + 240), 68 + MixedSupport143.computeInteger1756(480), 48 + UiComponentPart008.computeInteger0372(110), 0, 200);
                GameplayControls.performAction1800(UiComponentPart008.computeInteger0372(113) + 60, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 80 + MixedSupport143.computeInteger1756(480), 210 - UiComponentPart008.computeInteger0372(108) / 2, 320 - (MixedSupport143.computeInteger1756(integerArgument1 ^ 160) / 2 + 40));
                MixedSupport020.performAction0299(true);
              }
            }
          } else {
            SoftwareRaster.performAction0654(-34 - MixedSupport143.computeInteger1756(480) / 2 + 320, -24 + (-(UiComponentPart008.computeInteger0372(110) / 2) + 240), 68 + MixedSupport143.computeInteger1756(480), 48 + UiComponentPart008.computeInteger0372(110), 0, 200);
            GameplayControls.performAction1800(UiComponentPart008.computeInteger0372(113) + 60, (byte) 50, MixedSupport001.rgbSpriteArrayState0001, 80 + MixedSupport143.computeInteger1756(480), 210 - UiComponentPart008.computeInteger0372(108) / 2, 320 - (MixedSupport143.computeInteger1756(integerArgument1 ^ 160) / 2 + 40));
            MixedSupport020.performAction0299(true);
          }
          if (SceneWidgetPart002.integerState0249 != SceneWidgetPart002.integerState0241) {
            integerLocal13 = 256 * ReturnedShape.integerState0694 / 16;
            if (integerLocal13 > 0) {
              SoftwareRaster.performAction0654(0, 0, SoftwareRaster.integerState0285, SoftwareRaster.integerState0284, 0, integerLocal13);
            }
          }
          if (2 <= MixedSupport126.integerState0776) {
            longLocal14 = Runtime.getRuntime().totalMemory() / 1024L;
            longLocal15 = -(Runtime.getRuntime().freeMemory() / 1024L) + longLocal14;
            UiComponentPart029.renderingSupport010State0005.performAction1093("FPS: " + MixedSupport067.integerState0347, 12, 38, 16777215, 1);
            UiComponentPart029.renderingSupport010State0005.performAction1093(longLocal15 + "/" + longLocal14 + " kB", 12, 52, 16777215, 1);
          }
          UiComponentPart019.performAction1069(1, 0, 0, canvasLocal8);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal7 = caughtParameterLocal19;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal9), "client.F(" + integerArgument1 + ')');
        }
    }

    final void performAction0306(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6;
        integerLocal5 = obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = 0;
          do {
            if (8 <= integerLocal2) {
              this.performAction0309((byte) 51);
              integerLocal2 = 0;
              break;
            }
            MixedSupport105.booleanArrayState0008[integerLocal2] = false;
            MixedSupport005.booleanArrayState0001[integerLocal2] = false;
            RenderingSupport007.integerArrayArrayState0015[0][integerLocal2] = 9 * RenderingSupport007.integerArrayArrayState0015[0][integerLocal2] / 10;
            RenderingSupport007.integerArrayArrayState0015[1][integerLocal2] = 9 * RenderingSupport007.integerArrayArrayState0015[1][integerLocal2] / 10;
            integerLocal2++;
          } while (integerLocal5 == 0);
          if (integerArgument1 != 11978) {
            return;
          }
          while (8 > integerLocal2) {
            if (integerLocal5 != 0) {
              return;
            }
            if (!MixedSupport105.booleanArrayState0008[integerLocal2] &&
              SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2] != null) {
              SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2].performAction0461(0);
              if (!SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2].computeBoolean0144((byte) 78)) {
                SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2] = null;
              }
            }
            if (!MixedSupport005.booleanArrayState0001[integerLocal2] &&
              null != MixedSupport063.rawPcmStreamArrayState0002[integerLocal2]) {
              MixedSupport063.rawPcmStreamArrayState0002[integerLocal2].performAction0464(PcmPlayer.integerState0209 / 50);
              MixedSupport063.rawPcmStreamArrayState0002[integerLocal2] = null;
            }
            if (MixedSupport121.rawPcmStreamArrayArrayState0001[0][integerLocal2] != null) {
              integerLocal4 = RenderingSupport007.integerArrayArrayState0015[0][integerLocal2];
              if (0 == integerLocal4) {
                MixedSupport121.rawPcmStreamArrayArrayState0001[0][integerLocal2].performAction0464(PcmPlayer.integerState0209 / 50);
                MixedSupport121.rawPcmStreamArrayArrayState0001[0][integerLocal2] = null;
              } else {
                MixedSupport121.rawPcmStreamArrayArrayState0001[0][integerLocal2].performAction0459(PcmPlayer.integerState0209 / 50, GameDomainSupport005.integerState0578 * integerLocal4);
              }
            }
            if (null != MixedSupport121.rawPcmStreamArrayArrayState0001[1][integerLocal2]) {
              integerLocal6 = RenderingSupport007.integerArrayArrayState0015[1][integerLocal2];
              if (0 == integerLocal6) {
                MixedSupport121.rawPcmStreamArrayArrayState0001[1][integerLocal2].performAction0464(PcmPlayer.integerState0209 / 50);
                MixedSupport121.rawPcmStreamArrayArrayState0001[1][integerLocal2] = null;
              } else {
                MixedSupport121.rawPcmStreamArrayArrayState0001[1][integerLocal2].performAction0459(PcmPlayer.integerState0209 / 50, integerLocal6 * GameDomainSupport005.integerState0578);
              }
            }
            integerLocal2++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal1 = caughtParameterLocal7;
          runtimeExceptionLocal3 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal3), "client.D(" + integerArgument1 + ')');
        }
    }

    final void performAction0305(boolean booleanArgument1) {
        try {
          this.performAction0105(5, 94, 31, 0, 1, 12, 2, booleanArgument1);
          PcmPlayer.performAction0482(22050, true, 10);
          SceneWidgetNode.pcmPlayerState0002 = PcmPlayer.computePcmPlayer0483(GzipDecompressor.platformServiceState0003, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001), 0, 22050);
          MixedSupport019.pcmPlayerState0001 = PcmPlayer.computePcmPlayer0483(GzipDecompressor.platformServiceState0003, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001), 1, 1024);
          SecondaryNodeDequeIterator.pcmStreamMixerState0001 = new PcmStreamMixer();
          MixedSupport019.pcmPlayerState0001.performAction0490(SecondaryNodeDequeIterator.pcmStreamMixerState0001);
          GameAssets.pcmStreamMixerState0004 = new PcmStreamMixer();
          SceneWidgetNode.pcmPlayerState0002.performAction0490(GameAssets.pcmStreamMixerState0004);
          this.performAction0111(false, true, true, false, true, true, false);
          MixedSupport086.integerArrayState0158[66] = 2;
          MixedSupport086.integerArrayState0158[74] = 1;
          MixedSupport086.integerArrayState0158[64] = -2;
          MixedSupport086.integerArrayState0158[68] = 1;
          MixedSupport086.integerArrayState0158[10] = -1;
          MixedSupport086.integerArrayState0158[70] = 1;
          MixedSupport086.integerArrayState0158[73] = 1;
          MixedSupport086.integerArrayState0158[58] = -2;
          MixedSupport086.integerArrayState0158[9] = -1;
          MixedSupport086.integerArrayState0158[62] = 2;
          MixedSupport086.integerArrayState0158[72] = 1;
          MixedSupport009.integerArrayArrayState0004 = MouseWheelInput.integerArrayArrayState0010;
          MixedSupport086.integerArrayState0158[71] = 1;
          MixedSupport086.integerArrayState0158[63] = -1;
          MixedSupport086.integerArrayState0158[59] = -2;
          MixedSupport086.integerArrayState0158[65] = 1;
          MixedSupport086.integerArrayState0158[75] = -1;
          MixedSupport086.integerArrayState0158[76] = 1;
          MixedSupport086.integerArrayState0158[69] = 1;
          MixedSupport063.integerArrayArrayState0012 = UiComponentPart008.integerArrayArrayState0007;
          MixedSupport134.booleanState0191 = true;
          SceneWidgetPart007.integerArrayArrayState0017 = MixedSupport042.integerArrayArrayState0008;
          MixedSupport086.integerArrayState0158[61] = -2;
          MixedSupport086.integerArrayState0158[67] = -1;
          UiComponentPart022.rgbSpriteState0038 = new RgbSprite(640, 480);
          InputAdapter003.rgbSpriteState0054 = new RgbSprite(640, 480);
          MixedSupport006.integerState0039 = 1;
          MixedSupport112.integerState0681 = 0;
          UiComponentPart004.integerState0095 = 1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeException), "client.G(" + booleanArgument1 + ')');
        }
    }

    final static void performAction0301(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, boolean booleanArgument5, int integerArgument6, byte byteArgument7) {
        SceneWidget cachedSceneWidgetLocal1 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        SceneWidgetPart008 stackSceneWidgetPart008Local6;
        int stackIntegerLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9;
        boolean stackBooleanLocal10 = false;
        int stackIntegerLocal11 = 0;
        int stackIntegerLocal12 = 0;
        SceneWidgetPart013 stackSceneWidgetPart013Local13;
        SceneWidget stackSceneWidgetLocal14;
        SceneWidget stackSceneWidgetLocal15;
        long stackLongLocal16;
        SceneWidget stackSceneWidgetLocal17 = null;
        SceneWidget stackSceneWidgetLocal18 = null;
        SceneWidget stackSceneWidgetLocal19 = null;
        SceneWidgetPart013 stackSceneWidgetPart013Local20;
        SceneWidget stackSceneWidgetLocal21;
        SceneWidget stackSceneWidgetLocal22;
        long stackLongLocal23;
        SceneWidget stackSceneWidgetLocal24;
        SceneWidget stackSceneWidgetLocal25;
        SceneWidget stackSceneWidgetLocal26;
        int stackIntegerLocal27 = 0;
        int stackIntegerLocal28 = 0;
        RgbSprite[] stackRgbSpriteArrayLocal29 = null;
        int stackIntegerLocal30 = 0;
        RgbSprite[] stackRgbSpriteArrayLocal31 = null;
        int stackIntegerLocal32 = 0;
        RgbSprite[] stackRgbSpriteArrayLocal33 = null;
        int stackIntegerLocal34 = 0;
        String stackStringLocal35 = null;
        boolean stackBooleanLocal36 = false;
        String stackStringLocal37 = null;
        String stackStringLocal38 = null;
        String stackStringLocal39 = null;
        RuntimeException caughtExceptionLocal40 = null;
        int integerLocal41 = 0;
        RuntimeException runtimeExceptionLocal42 = null;
        NodeDeque nodeDequeLocal43 = null;
        long longLocal44 = 0L;
        Object objectLocal45 = null;
        SceneWidgetPart013 sceneWidgetPart013Local46 = null;
        int integerLocal47 = 0;
        int integerLocal48 = 0;
        SceneWidget sceneWidgetLocal49 = null;
        SceneWidget sceneWidgetLocal50 = null;
        SceneWidget sceneWidgetLocal51 = null;
        int integerLocal52 = 0;
        SceneWidget sceneWidgetLocal53 = null;
        SceneWidget sceneWidgetLocal54 = null;
        SceneWidget sceneWidgetLocal55 = null;
        SceneWidget sceneWidgetLocal56 = null;
        int integerLocal57 = 0;
        SceneWidget sceneWidgetLocal58 = null;
        SceneWidget sceneWidgetLocal59 = null;
        SceneWidget sceneWidgetLocal60 = null;
        SceneWidget sceneWidgetLocal61 = null;
        SceneWidget sceneWidgetLocal62 = null;
        SceneWidget sceneWidgetLocal63 = null;
        SceneWidget sceneWidgetLocal64 = null;
        SceneWidget sceneWidgetLocal65 = null;
        SceneWidget sceneWidgetLocal66 = null;
        int integerLocal67 = 0;
        String stringLocal68 = null;
        int integerLocal69 = 0;
        String stringLocal70 = null;
        int integerLocal71 = 0;
        String stringLocal72 = null;
        RgbSprite rgbSpriteLocal73 = null;
        String stringLocal74 = null;
        int integerLocal75 = 0;
        int integerLocal76 = 0;
        StringBuilder stringBuilderLocal77 = null;
        int integerLocal78 = 0;
        String stringLocal79 = null;
        int integerLocal80 = 0;
        int integerLocal81 = 0;
        int integerLocal82 = 0;
        RgbSprite[] stackRgbSpriteArrayLocal83;
        RgbSprite[] stackRgbSpriteArrayLocal84;
        RgbSprite[] stackRgbSpriteArrayLocal85;
        SceneWidget sceneWidgetLocal86;
        SceneWidget sceneWidgetLocal87;
        SceneWidget sceneWidgetLocal88;
        SceneWidget sceneWidgetLocal89;
        RgbSprite rgbSpriteLocal90;
        RgbSprite rgbSpriteLocal91;
        RgbSprite rgbSpriteLocal92;
        RgbSprite rgbSpriteLocal93;
        RgbSprite rgbSpriteLocal94;
        RgbSprite rgbSpriteLocal95;
        RgbSprite rgbSpriteLocal96;
        RgbSprite rgbSpriteLocal97;
        int stackIntegerLocal98;
        int stackIntegerLocal99;
        int stackIntegerLocal100;
        boolean stackBooleanLocal101;
        int integerLocal102;
        int integerLocal103;
        int integerLocal104;
        int integerLocal105;
        int integerLocal106;
        int integerLocal107;
        int integerLocal108;
        int integerLocal109;
        int integerLocal110;
        integerLocal82 = obfuscationControl ? 1 : 0;
        try {
          stackSceneWidgetPart008Local6 = MixedSupport047.sceneWidgetPart008State0003;
          stackIntegerLocal7 = 2 * (ComponentContainer.integerState0377 + 2);
          stackIntegerLocal8 = (ComponentContainer.integerState0377 * 4 + 8) * integerArgument1;
          stackIntegerLocal9 = -15230;
          stackBooleanLocal10 = (NetworkSupport005.sceneWidgetPart008State0004 == MixedSupport047.sceneWidgetPart008State0003);
          integerLocal41 = ((SceneWidgetPart008) (Object) stackSceneWidgetPart008Local6).computeBoolean1156(stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9, stackBooleanLocal10, 2, booleanArgument3) ? 1 : 0;
          nodeDequeLocal43 = MixedSupport047.sceneWidgetPart008State0003.sceneWidgetState0090.nodeDequeState0034;
          if (byteArgument7 > -48) {
            DekoBlokoClient.performAction0310((byte) 82);
          }
          longLocal44 = MixedSupport063.computeLong0749(4);
          objectLocal45 = null;
          sceneWidgetPart013Local46 = (SceneWidgetPart013) (nodeDequeLocal43.computeHashNode1792((byte) -101));
          while (null != sceneWidgetPart013Local46) {
            integerLocal47 = 0;
            if (integerLocal82 != 0) {
              return;
            }
            if (null == sceneWidgetPart013Local46.nodeDequeState0034) {
              stackIntegerLocal11 = integerArgument4;
              stackIntegerLocal12 = integerArgument2;
              while (true) {
                integerLocal48 = stackIntegerLocal11 | stackIntegerLocal12;
                sceneWidgetPart013Local46.sceneWidgetState0131 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0027);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0131, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0131.integerState0916 = 1;
                sceneWidgetPart013Local46.sceneWidgetState0141 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0141, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0144 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0027);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0144, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0144.integerState0893 = 0;
                sceneWidgetPart013Local46.sceneWidgetState0132 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0027);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0132, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0132.integerState0893 = 0;
                sceneWidgetPart013Local46.sceneWidgetState0137 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0137, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0137.integerState0916 = 2;
                stackSceneWidgetPart013Local13 = sceneWidgetPart013Local46;
                stackSceneWidgetLocal14 = null;
                stackSceneWidgetLocal15 = null;
                stackLongLocal16 = 0L;
                if (MixedSupport102.booleanState0133) {
                  stackSceneWidgetLocal17 = null;
                  stackSceneWidgetLocal18 = null;
                  stackSceneWidgetLocal19 = MixedSupport036.sceneWidgetState0027;
                } else {
                  stackSceneWidgetLocal17 = null;
                  stackSceneWidgetLocal18 = null;
                  stackSceneWidgetLocal19 = RenderingSupport004.sceneWidgetState0040;
                }
                stackSceneWidgetPart013Local13.sceneWidgetState0142 = new SceneWidget(stackLongLocal16, stackSceneWidgetLocal19);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0142, -16834);
                sceneWidgetPart013Local46.sceneWidgetArrayState0009 = new SceneWidget[MixedSupport064.integerState0336];
                sceneWidgetPart013Local46.sceneWidgetState0138 = new SceneWidget(0L, (SceneWidget) null);
                if ((integerLocal48 & 1 << MixedSupport131.integerState0791) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0138, -16834);
                }
                sceneWidgetPart013Local46.sceneWidgetState0143 = new SceneWidget(0L, (SceneWidget) null);
                if ((integerLocal48 & 1 << MixedSupport131.integerState0789) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0143, -16834);
                }
                sceneWidgetPart013Local46.sceneWidgetState0129 = new SceneWidget(0L, (SceneWidget) null);
                if ((1 << ReturnedShape.integerState0696 & integerLocal48) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0129, -16834);
                }
                sceneWidgetPart013Local46.sceneWidgetState0136 = new SceneWidget(0L, (SceneWidget) null);
                if ((1 << MixedSupport138.integerState0820 & integerLocal48) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0136, -16834);
                }
                sceneWidgetLocal49 = sceneWidgetPart013Local46.sceneWidgetState0138;
                sceneWidgetLocal50 = sceneWidgetPart013Local46.sceneWidgetState0136;
                sceneWidgetPart013Local46.sceneWidgetState0129.integerState0885 = 1;
                sceneWidgetLocal51 = sceneWidgetPart013Local46.sceneWidgetState0143;
                sceneWidgetLocal51.integerState0885 = 1;
                sceneWidgetLocal50.integerState0885 = 1;
                sceneWidgetLocal49.integerState0885 = 1;
                integerLocal52 = 0;
                while (MixedSupport064.integerState0336 > integerLocal52) {
                  sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal52] = new SceneWidget(0L, (SceneWidget) null);
                  stackIntegerLocal11 = ~(1 << integerLocal52 + MixedSupport139.integerState0822 & integerLocal48);
                  stackIntegerLocal12 = -1;
                  if (stackIntegerLocal11 != stackIntegerLocal12) {
                    sceneWidgetPart013Local46.sceneWidgetState0142.performAction1819(sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal52], -16834);
                  }
                  sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal52].integerState0885 = 1;
                  integerLocal52++;
                }
                stackSceneWidgetPart013Local20 = sceneWidgetPart013Local46;
                stackSceneWidgetLocal21 = null;
                stackSceneWidgetLocal22 = null;
                stackLongLocal23 = 0L;
                if (!MixedSupport102.booleanState0133) {
                  stackSceneWidgetLocal24 = null;
                  stackSceneWidgetLocal25 = null;
                  stackSceneWidgetLocal26 = MixedSupport036.sceneWidgetState0027;
                } else {
                  stackSceneWidgetLocal24 = null;
                  stackSceneWidgetLocal25 = null;
                  stackSceneWidgetLocal26 = RenderingSupport004.sceneWidgetState0040;
                }
                stackSceneWidgetPart013Local20.sceneWidgetState0133 = new SceneWidget(stackLongLocal23, stackSceneWidgetLocal26);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0133, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0133.integerState0916 = 2;
                sceneWidgetPart013Local46.sceneWidgetState0135 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0135, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0130 = new SceneWidget(0L, UiComponentPart007.sceneWidgetState0019);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0130, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0134 = new SceneWidget(0L, UiComponentPart007.sceneWidgetState0019);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0134, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0145 = new SceneWidget(0L, MixedSupport132.sceneWidgetState0125);
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0145, -16834);
                sceneWidgetPart013Local46.performAction1825(-69);
                sceneWidgetPart013Local46.sceneWidgetState0140 = new SceneWidget(0L, MixedSupport082.sceneWidgetState0076);
                integerLocal47 = 1;
                sceneWidgetPart013Local46.performAction1819(sceneWidgetPart013Local46.sceneWidgetState0140, -16834);
                break;
              }
            }
            stackIntegerLocal27 = (sceneWidgetPart013Local46.booleanState0204) ? integerArgument4 : integerArgument2;
            integerLocal102 = stackIntegerLocal27;
            sceneWidgetPart013Local46.sceneWidgetState0131.stringState0598 = null;
            sceneWidgetPart013Local46.sceneWidgetState0131.integerState0915 = 0;
            sceneWidgetLocal86 = sceneWidgetPart013Local46.sceneWidgetState0131;
            sceneWidgetLocal86.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0140.stringState0598 = null;
            sceneWidgetPart013Local46.sceneWidgetState0140.integerState0915 = 0;
            sceneWidgetLocal87 = sceneWidgetPart013Local46.sceneWidgetState0140;
            sceneWidgetLocal87.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0141.stringState0598 = null;
            sceneWidgetPart013Local46.sceneWidgetState0141.integerState0915 = 0;
            sceneWidgetLocal88 = sceneWidgetPart013Local46.sceneWidgetState0141;
            sceneWidgetLocal88.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0144.stringState0598 = null;
            sceneWidgetLocal53 = sceneWidgetPart013Local46.sceneWidgetState0144;
            sceneWidgetPart013Local46.sceneWidgetState0144.integerState0915 = 0;
            sceneWidgetLocal53.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0132.stringState0598 = null;
            sceneWidgetLocal54 = sceneWidgetPart013Local46.sceneWidgetState0132;
            sceneWidgetPart013Local46.sceneWidgetState0132.integerState0915 = 0;
            sceneWidgetLocal54.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0137.stringState0598 = null;
            sceneWidgetLocal55 = sceneWidgetPart013Local46.sceneWidgetState0137;
            sceneWidgetPart013Local46.sceneWidgetState0137.integerState0915 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0142.stringState0598 = null;
            sceneWidgetLocal55.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915 = 0;
            sceneWidgetLocal56 = sceneWidgetPart013Local46.sceneWidgetState0142;
            sceneWidgetLocal56.integerState0896 = 0;
            integerLocal57 = 0;
            while (MixedSupport064.integerState0336 > integerLocal57) {
              sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal57].rgbSpriteState0070 = null;
              sceneWidgetLocal59 = sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal57];
              sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal57].integerState0915 = 0;
              sceneWidgetLocal59.integerState0896 = 0;
              integerLocal57++;
            }
            sceneWidgetPart013Local46.sceneWidgetState0138.rgbSpriteState0070 = null;
            sceneWidgetPart013Local46.sceneWidgetState0138.integerState0915 = 0;
            sceneWidgetLocal58 = sceneWidgetPart013Local46.sceneWidgetState0138;
            sceneWidgetLocal58.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0136.rgbSpriteState0070 = null;
            sceneWidgetLocal89 = sceneWidgetPart013Local46.sceneWidgetState0136;
            sceneWidgetPart013Local46.sceneWidgetState0136.integerState0915 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0143.rgbSpriteState0070 = null;
            sceneWidgetLocal89.integerState0896 = 0;
            sceneWidgetLocal60 = sceneWidgetPart013Local46.sceneWidgetState0143;
            sceneWidgetPart013Local46.sceneWidgetState0143.integerState0915 = 0;
            sceneWidgetLocal60.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0129.rgbSpriteState0070 = null;
            sceneWidgetPart013Local46.sceneWidgetState0129.integerState0915 = 0;
            sceneWidgetLocal61 = sceneWidgetPart013Local46.sceneWidgetState0129;
            sceneWidgetLocal61.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0133.stringState0598 = null;
            sceneWidgetPart013Local46.sceneWidgetState0133.integerState0915 = 0;
            sceneWidgetLocal62 = sceneWidgetPart013Local46.sceneWidgetState0133;
            sceneWidgetLocal62.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0135.stringState0598 = null;
            sceneWidgetPart013Local46.sceneWidgetState0135.integerState0915 = 0;
            sceneWidgetLocal63 = sceneWidgetPart013Local46.sceneWidgetState0135;
            sceneWidgetPart013Local46.sceneWidgetState0130.stringState0598 = null;
            sceneWidgetLocal63.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0130.integerState0915 = 0;
            sceneWidgetLocal64 = sceneWidgetPart013Local46.sceneWidgetState0130;
            sceneWidgetLocal64.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0134.stringState0598 = null;
            sceneWidgetPart013Local46.sceneWidgetState0134.integerState0915 = 0;
            sceneWidgetLocal65 = sceneWidgetPart013Local46.sceneWidgetState0134;
            sceneWidgetPart013Local46.sceneWidgetState0145.stringState0598 = null;
            sceneWidgetLocal65.integerState0896 = 0;
            sceneWidgetPart013Local46.sceneWidgetState0145.integerState0915 = 0;
            sceneWidgetLocal66 = sceneWidgetPart013Local46.sceneWidgetState0145;
            sceneWidgetLocal66.integerState0896 = 0;
            sceneWidgetPart013Local46.integerState0896 = MixedSupport047.sceneWidgetPart008State0003.sceneWidgetState0090.integerState0896;
            integerLocal67 = 0;
            stringLocal68 = sceneWidgetPart013Local46.stringState0585;
            if (!sceneWidgetPart013Local46.computeBoolean1764((byte) 126)) {
              if (sceneWidgetPart013Local46.booleanState0204) {
                if (sceneWidgetPart013Local46.integerState0841 >= 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0131.stringState0598 = CipherPacketBuffer.stringState0558;
                } else if (!sceneWidgetPart013Local46.booleanState0201 ||
                  !sceneWidgetPart013Local46.booleanState0205 &&
                  !sceneWidgetPart013Local46.booleanState0200) {
                  if (sceneWidgetPart013Local46.integerState0845 == 2) {
                    sceneWidgetPart013Local46.sceneWidgetState0140.stringState0598 = MixedSupport046.stringState0196;
                  } else {
                    sceneWidgetPart013Local46.sceneWidgetState0131.stringState0598 = MixedSupport006.stringState0032;
                  }
                } else {
                  sceneWidgetPart013Local46.sceneWidgetState0140.stringState0598 = SceneWidgetPart002.stringState0193;
                }
              } else if (sceneWidgetPart013Local46.booleanState0205 ||
                sceneWidgetPart013Local46.booleanState0200) {
                sceneWidgetPart013Local46.sceneWidgetState0140.stringState0598 = SceneWidgetPart002.stringState0193;
              } else if (sceneWidgetPart013Local46.booleanState0199) {
                sceneWidgetPart013Local46.sceneWidgetState0131.stringState0598 = MixedSupport016.stringState0077;
              } else {
                sceneWidgetPart013Local46.sceneWidgetState0131.stringState0598 = MixedSupport101.stringState0408;
              }
              if (null == sceneWidgetPart013Local46.sceneWidgetState0140.stringState0598) {
                sceneWidgetPart013Local46.sceneWidgetState0131.performAction1815(68, 0, integerLocal67, ComponentContainer.integerState0377, 0);
              } else {
                sceneWidgetPart013Local46.sceneWidgetState0140.performAction1815(68, 0, integerLocal67, ComponentContainer.integerState0377, 0);
              }
              sceneWidgetPart013Local46.sceneWidgetState0141.stringState0598 = BitmapFont.computeString1098(sceneWidgetPart013Local46.sceneWidgetState0141.bitmapFontState0020, stringLocal68, 78);
              sceneWidgetPart013Local46.sceneWidgetState0141.performAction1815(78, 0, integerLocal67, ComponentContainer.integerState0377, 70);
              if (sceneWidgetPart013Local46.sceneWidgetState0141.booleanState0218 &&
                !sceneWidgetPart013Local46.sceneWidgetState0141.stringState0598.equals(stringLocal68)) {
                MixedSupport122.stringState0515 = stringLocal68;
              }
              sceneWidgetPart013Local46.sceneWidgetState0144.stringState0598 = Integer.toString(sceneWidgetPart013Local46.integerState0843);
              if (sceneWidgetPart013Local46.booleanState0201) {
                sceneWidgetPart013Local46.sceneWidgetState0144.integerState0916 = 2;
                sceneWidgetPart013Local46.sceneWidgetState0132.stringState0598 = "/" + sceneWidgetPart013Local46.integerState0840;
                integerLocal69 = (-sceneWidgetPart013Local46.sceneWidgetState0132.bitmapFontState0020.computeInteger1090("/") + 348) / 2;
                sceneWidgetPart013Local46.sceneWidgetState0144.performAction1815(integerLocal69 - 150, 0, integerLocal67, ComponentContainer.integerState0377, 150);
                sceneWidgetPart013Local46.sceneWidgetState0132.performAction1815(198 - integerLocal69, 0, integerLocal67, ComponentContainer.integerState0377, integerLocal69);
              } else {
                sceneWidgetPart013Local46.sceneWidgetState0144.integerState0916 = 1;
                sceneWidgetPart013Local46.sceneWidgetState0144.performAction1815(48, 0, integerLocal67, ComponentContainer.integerState0377, 150);
              }
              sceneWidgetPart013Local46.sceneWidgetState0137.stringState0598 = Integer.toString(sceneWidgetPart013Local46.integerState0838);
              sceneWidgetPart013Local46.sceneWidgetState0137.performAction1815(48, 0, integerLocal67, ComponentContainer.integerState0377, 200);
              stackIntegerLocal28 = (!MixedSupport102.booleanState0133) ? 200 : 250;
              regionExit1: {
                boolean frameCompletedLocal111 = true;
                boolean frameCompletedLocal112 = true;
                integerLocal103 = stackIntegerLocal28;
                sceneWidgetPart013Local46.sceneWidgetState0142.performAction1815(-2 + (-integerLocal103 + 365), 0, integerLocal67, ComponentContainer.integerState0377, integerLocal103);
                integerLocal71 = MixedSupport064.integerState0335;
                if (0 == (integerLocal102 & 1 << MixedSupport131.integerState0791)) {
                  while (true) {
                    if (0 != (integerLocal102 & 1 << MixedSupport131.integerState0789)) {
                      if (!sceneWidgetPart013Local46.booleanState0205 &&
                        !sceneWidgetPart013Local46.booleanState0200) {
                        stackIntegerLocal30 = 0;
                      } else {
                        stackIntegerLocal30 = 1;
                      }
                      integerLocal75 = stackIntegerLocal30;
                      stackRgbSpriteArrayLocal31 = (RgbSprite[]) (rgbSpriteArrayState0006);
                      if (integerLocal75 == 0) {
                        stackIntegerLocal32 = 0;
                      } else {
                        stackIntegerLocal32 = 1;
                      }
                      rgbSpriteLocal73 = stackRgbSpriteArrayLocal31[stackIntegerLocal32];
                      sceneWidgetPart013Local46.sceneWidgetState0143.rgbSpriteState0070 = rgbSpriteLocal73;
                      sceneWidgetPart013Local46.sceneWidgetState0143.performAction1815(rgbSpriteLocal73.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (rgbSpriteLocal73.integerState0254 + MixedSupport064.integerState0335);
                    }
                    if ((1 << ReturnedShape.integerState0696 & integerLocal102) != 0) {
                      rgbSpriteLocal91 = GameDomainSupport001.rgbSpriteArrayState0002[-1 + sceneWidgetPart013Local46.integerState0845];
                      sceneWidgetPart013Local46.sceneWidgetState0129.rgbSpriteState0070 = rgbSpriteLocal91;
                      sceneWidgetPart013Local46.sceneWidgetState0129.performAction1815(rgbSpriteLocal91.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport064.integerState0335 + rgbSpriteLocal91.integerState0254);
                    }
                    if ((1 << MixedSupport138.integerState0820 & integerLocal102) != 0) {
                      stackRgbSpriteArrayLocal33 = NodeHashTable.rgbSpriteArrayState0026;
                      if (!sceneWidgetPart013Local46.booleanState0208) {
                        stackIntegerLocal34 = 0;
                      } else {
                        stackIntegerLocal34 = 1;
                      }
                      rgbSpriteLocal92 = stackRgbSpriteArrayLocal33[stackIntegerLocal34];
                      sceneWidgetPart013Local46.sceneWidgetState0136.rgbSpriteState0070 = rgbSpriteLocal92;
                      sceneWidgetPart013Local46.sceneWidgetState0136.performAction1815(rgbSpriteLocal92.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport064.integerState0335 + rgbSpriteLocal92.integerState0254);
                    }
                    if (null == DualNode.rgbSpriteArrayArrayState0003) {
                      frameCompletedLocal112 = false;
                      break;
                    }
                    integerLocal75 = 0;
                    while (!(MixedSupport064.integerState0336 <= integerLocal75)) {
                      stackRgbSpriteArrayLocal29 = DualNode.rgbSpriteArrayArrayState0003[integerLocal75];
                      if (stackRgbSpriteArrayLocal29 != null &&
                        (integerLocal102 & 1 << MixedSupport139.integerState0822 + integerLocal75) != 0) {
                        rgbSpriteLocal93 = DualNode.rgbSpriteArrayArrayState0003[integerLocal75][sceneWidgetPart013Local46.byteArrayState0032[integerLocal75] & 255];
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal75].rgbSpriteState0070 = rgbSpriteLocal93;
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal75].performAction1815(rgbSpriteLocal93.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                        integerLocal71 = integerLocal71 + (rgbSpriteLocal93.integerState0254 + MixedSupport064.integerState0335);
                      }
                      integerLocal75++;
                    }
                    frameCompletedLocal111 = false;
                    break;
                  }
                }
                if ((frameCompletedLocal112) &&
                  (frameCompletedLocal111)) {
                  stackRgbSpriteArrayLocal83 = MixedSupport040.rgbSpriteArrayState0011;
                  while (true) {
                    rgbSpriteLocal90 = stackRgbSpriteArrayLocal83[sceneWidgetPart013Local46.integerState0842];
                    sceneWidgetPart013Local46.sceneWidgetState0138.rgbSpriteState0070 = rgbSpriteLocal90;
                    sceneWidgetPart013Local46.sceneWidgetState0138.performAction1815(rgbSpriteLocal90.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                    integerLocal71 = integerLocal71 + (rgbSpriteLocal90.integerState0254 + MixedSupport064.integerState0335);
                    if (0 != (integerLocal102 & 1 << MixedSupport131.integerState0789)) {
                      if (!sceneWidgetPart013Local46.booleanState0205 &&
                        !sceneWidgetPart013Local46.booleanState0200) {
                        stackIntegerLocal98 = 0;
                      } else {
                        stackIntegerLocal98 = 1;
                      }
                      integerLocal110 = stackIntegerLocal98;
                      stackRgbSpriteArrayLocal84 = (RgbSprite[]) (rgbSpriteArrayState0006);
                      if (integerLocal110 == 0) {
                        stackIntegerLocal99 = 0;
                      } else {
                        stackIntegerLocal99 = 1;
                      }
                      rgbSpriteLocal94 = stackRgbSpriteArrayLocal84[stackIntegerLocal99];
                      sceneWidgetPart013Local46.sceneWidgetState0143.rgbSpriteState0070 = rgbSpriteLocal94;
                      sceneWidgetPart013Local46.sceneWidgetState0143.performAction1815(rgbSpriteLocal94.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (rgbSpriteLocal94.integerState0254 + MixedSupport064.integerState0335);
                    }
                    if ((1 << ReturnedShape.integerState0696 & integerLocal102) != 0) {
                      rgbSpriteLocal95 = GameDomainSupport001.rgbSpriteArrayState0002[-1 + sceneWidgetPart013Local46.integerState0845];
                      sceneWidgetPart013Local46.sceneWidgetState0129.rgbSpriteState0070 = rgbSpriteLocal95;
                      sceneWidgetPart013Local46.sceneWidgetState0129.performAction1815(rgbSpriteLocal95.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport064.integerState0335 + rgbSpriteLocal95.integerState0254);
                    }
                    if ((1 << MixedSupport138.integerState0820 & integerLocal102) != 0) {
                      stackRgbSpriteArrayLocal85 = NodeHashTable.rgbSpriteArrayState0026;
                      if (!sceneWidgetPart013Local46.booleanState0208) {
                        stackIntegerLocal100 = 0;
                      } else {
                        stackIntegerLocal100 = 1;
                      }
                      rgbSpriteLocal96 = stackRgbSpriteArrayLocal85[stackIntegerLocal100];
                      sceneWidgetPart013Local46.sceneWidgetState0136.rgbSpriteState0070 = rgbSpriteLocal96;
                      sceneWidgetPart013Local46.sceneWidgetState0136.performAction1815(rgbSpriteLocal96.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport064.integerState0335 + rgbSpriteLocal96.integerState0254);
                    }
                    if (null == DualNode.rgbSpriteArrayArrayState0003) {
                      break;
                    }
                    integerLocal110 = 0;
                    while (!(MixedSupport064.integerState0336 <= integerLocal110)) {
                      stackRgbSpriteArrayLocal83 = DualNode.rgbSpriteArrayArrayState0003[integerLocal110];
                      if (stackRgbSpriteArrayLocal83 != null &&
                        (integerLocal102 & 1 << MixedSupport139.integerState0822 + integerLocal110) != 0) {
                        rgbSpriteLocal97 = DualNode.rgbSpriteArrayArrayState0003[integerLocal110][sceneWidgetPart013Local46.byteArrayState0032[integerLocal110] & 255];
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal110].rgbSpriteState0070 = rgbSpriteLocal97;
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal110].performAction1815(rgbSpriteLocal97.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                        integerLocal71 = integerLocal71 + (rgbSpriteLocal97.integerState0254 + MixedSupport064.integerState0335);
                      }
                      integerLocal110++;
                    }
                    break;
                  }
                }
              }
              integerLocal106 = (-integerLocal71 + sceneWidgetPart013Local46.sceneWidgetState0142.integerState0896) / 2;
              if (integerLocal106 > 0) {
                sceneWidgetPart013Local46.sceneWidgetState0138.integerState0890 = sceneWidgetPart013Local46.sceneWidgetState0138.integerState0890 + integerLocal106;
                sceneWidgetPart013Local46.sceneWidgetState0143.integerState0890 = sceneWidgetPart013Local46.sceneWidgetState0143.integerState0890 + integerLocal106;
                sceneWidgetPart013Local46.sceneWidgetState0129.integerState0890 = sceneWidgetPart013Local46.sceneWidgetState0129.integerState0890 + integerLocal106;
                sceneWidgetPart013Local46.sceneWidgetState0136.integerState0890 = sceneWidgetPart013Local46.sceneWidgetState0136.integerState0890 + integerLocal106;
                integerLocal76 = 0;
                while (!(MixedSupport064.integerState0336 <= integerLocal76)) {
                  cachedSceneWidgetLocal1 = sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal76];
                  cachedSceneWidgetLocal1.integerState0890 = cachedSceneWidgetLocal1.integerState0890 + integerLocal106;
                  integerLocal76++;
                }
              }
              if (sceneWidgetPart013Local46.booleanState0204) {
                integerLocal107 = sceneWidgetPart013Local46.integerState0841;
                if (integerLocal107 < 0) {
                  integerLocal107 = (int)(longLocal44 - sceneWidgetPart013Local46.longState0052);
                }
                integerLocal78 = integerLocal107 / 1000;
                integerLocal80 = integerLocal78 / 60;
                integerLocal78 = integerLocal78 % 60;
                if (integerLocal80 >= 60) {
                  integerLocal81 = integerLocal80 / 60;
                  integerLocal80 = integerLocal80 % 60;
                  sceneWidgetPart013Local46.sceneWidgetState0133.stringState0598 = integerLocal81 + ":" + integerLocal80 / 10 + integerLocal80 % 10 + ":" + integerLocal78 / 10 + integerLocal78 % 10;
                } else {
                  sceneWidgetPart013Local46.sceneWidgetState0133.stringState0598 = integerLocal80 + ":" + integerLocal78 / 10 + integerLocal78 % 10;
                }
              }
              sceneWidgetPart013Local46.sceneWidgetState0133.performAction1815(sceneWidgetPart013Local46.integerState0896 - 365, 0, integerLocal67, ComponentContainer.integerState0377, 365);
              integerLocal67 = integerLocal67 + ComponentContainer.integerState0377;
              if (null != sceneWidgetPart013Local46.stringArrayState0052) {
                integerLocal67 += 2;
                stringBuilderLocal77 = new StringBuilder(64);
                discarded$1 = stringBuilderLocal77.append(LoginCredentials.stringState0282);
                discarded$2 = stringBuilderLocal77.append(sceneWidgetPart013Local46.stringArrayState0052[0]);
                integerLocal108 = 1;
                while (integerLocal108 < sceneWidgetPart013Local46.integerState0843) {
                  discarded$3 = stringBuilderLocal77.append(", ");
                  discarded$4 = stringBuilderLocal77.append(sceneWidgetPart013Local46.stringArrayState0052[integerLocal108]);
                  integerLocal108++;
                }
                stringLocal79 = stringBuilderLocal77.toString();
                sceneWidgetPart013Local46.sceneWidgetState0135.stringState0598 = stringLocal79;
                integerLocal109 = sceneWidgetPart013Local46.sceneWidgetState0135.bitmapFontState0020.computeInteger1091(stringLocal79, sceneWidgetPart013Local46.integerState0896 - 2 * sceneWidgetPart013Local46.sceneWidgetState0135.integerState0893);
                sceneWidgetPart013Local46.sceneWidgetState0135.performAction1815(sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, integerLocal109 * ComponentContainer.integerState0377, 0);
                integerLocal67 = integerLocal67 + ComponentContainer.integerState0377 * integerLocal109;
              }
              if (sceneWidgetPart013Local46.booleanState0200) {
                sceneWidgetPart013Local46.sceneWidgetState0130.stringState0598 = NodeHashTableIterator.substituteIndexedPlaceholders(121, MixedSupport081.stringState0330, new String[]{stringLocal68});
                sceneWidgetPart013Local46.sceneWidgetState0130.performAction1815(-(2 * SecondaryNodeHashTable.integerState0540) + sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, ComponentContainer.integerState0377, SecondaryNodeHashTable.integerState0540);
                integerLocal67 = integerLocal67 + ComponentContainer.integerState0377;
              }
              if (sceneWidgetPart013Local46.booleanState0206) {
                sceneWidgetPart013Local46.sceneWidgetState0134.stringState0598 = NodeHashTableIterator.substituteIndexedPlaceholders(106, RenderingSupport013.stringState0440, new String[]{stringLocal68});
                sceneWidgetPart013Local46.sceneWidgetState0134.performAction1815(-(SecondaryNodeHashTable.integerState0540 * 2) + sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, ComponentContainer.integerState0377, SecondaryNodeHashTable.integerState0540);
                integerLocal67 = integerLocal67 + ComponentContainer.integerState0377;
              }
            }
            stringLocal70 = GameplayControls.computeString1802(stringLocal68, sceneWidgetPart013Local46.integerState0844, true);
            if (stringLocal70 != null) {
              integerLocal104 = sceneWidgetPart013Local46.sceneWidgetState0145.bitmapFontState0020.computeInteger1091(stringLocal70, -SecondaryNodeHashTable.integerState0540 + (sceneWidgetPart013Local46.integerState0896 - SecondaryNodeHashTable.integerState0540));
              sceneWidgetPart013Local46.sceneWidgetState0145.integerState0917 = sceneWidgetPart013Local46.integerState0846 * 256 / MixedSupport094.integerState0547;
              sceneWidgetPart013Local46.sceneWidgetState0145.stringState0598 = stringLocal70;
              sceneWidgetPart013Local46.sceneWidgetState0145.performAction1815(-(SecondaryNodeHashTable.integerState0540 * 2) + sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, integerLocal104 * ComponentContainer.integerState0377, SecondaryNodeHashTable.integerState0540);
              integerLocal67 = integerLocal67 + ComponentContainer.integerState0377 * integerLocal104;
            }
            if (integerLocal41 == 0) {
              sceneWidgetPart013Local46.integerState0895 = integerLocal67 - sceneWidgetPart013Local46.integerState0915;
            }
            if (integerLocal47 != 0) {
              MixedSupport047.sceneWidgetPart008State0003.sceneWidgetState0090.performAction1820((SceneWidget) (objectLocal45), sceneWidgetPart013Local46, 2, 0);
            }
            integerLocal105 = 0;
            while (integerLocal105 < MixedSupport064.integerState0336) {
              stackBooleanLocal36 = sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal105].booleanState0218;
              if (stackBooleanLocal36) {
                if (SceneWidgetPart004.stringArrayArrayState0003 != null) {
                  if (null == SceneWidgetPart004.stringArrayArrayState0003[integerLocal105]) {
                    stackStringLocal35 = null;
                  } else {
                    stackStringLocal35 = SceneWidgetPart004.stringArrayArrayState0003[integerLocal105][sceneWidgetPart013Local46.byteArrayState0032[integerLocal105] & 255];
                  }
                } else {
                  stackStringLocal35 = null;
                }
                stringLocal74 = stackStringLocal35;
                if (stringLocal74 != null) {
                  MixedSupport122.stringState0515 = UiComponentPart022.stringArrayState0026[integerLocal105] + " - " + stringLocal74;
                } else {
                  MixedSupport122.stringState0515 = UiComponentPart022.stringArrayState0026[integerLocal105];
                }
              }
              integerLocal105++;
            }
            stackBooleanLocal101 = sceneWidgetPart013Local46.sceneWidgetState0138.booleanState0218;
            if (stackBooleanLocal101) {
              if (sceneWidgetPart013Local46.integerState0842 != 1) {
                stringLocal72 = MixedSupport029.stringArrayState0011[sceneWidgetPart013Local46.integerState0842];
              } else {
                stringLocal72 = HashNode.stringState0052;
              }
              MixedSupport122.stringState0515 = MixedSupport056.stringState0240 + " - " + stringLocal72;
            }
            if (sceneWidgetPart013Local46.sceneWidgetState0136.booleanState0218) {
              if (sceneWidgetPart013Local46.booleanState0208) {
                stackStringLocal37 = MixedSupport020.stringState0094;
              } else {
                stackStringLocal37 = NodeHashTable.stringState0508;
              }
              MixedSupport122.stringState0515 = stackStringLocal37;
            }
            if (sceneWidgetPart013Local46.sceneWidgetState0143.booleanState0218) {
              if (!sceneWidgetPart013Local46.booleanState0205 &&
                !sceneWidgetPart013Local46.booleanState0200) {
                if (!sceneWidgetPart013Local46.booleanState0201) {
                  stackStringLocal38 = GameDomainSupport002.stringState0144;
                } else {
                  stackStringLocal38 = HashNode.stringState0051;
                }
              } else {
                stackStringLocal38 = MixedSupport150.stringState0602;
              }
              MixedSupport122.stringState0515 = stackStringLocal38;
            }
            if (sceneWidgetPart013Local46.sceneWidgetState0129.booleanState0218) {
              if (sceneWidgetPart013Local46.integerState0845 != 2) {
                stackStringLocal39 = MixedSupport009.stringState0039;
              } else {
                stackStringLocal39 = MixedSupport129.stringState0537;
              }
              MixedSupport122.stringState0515 = stackStringLocal39;
            }
            boolean frameRemainderLocal113 = true;
            if (sceneWidgetPart013Local46.integerState0891 != 0 &&
              !sceneWidgetPart013Local46.computeBoolean1764((byte) 100)) {
              if (sceneWidgetPart013Local46.sceneWidgetState0140.integerState0891 != 0) {
                if (!sceneWidgetPart013Local46.booleanState0204 ||
                  sceneWidgetPart013Local46.booleanState0201 &&
                  (sceneWidgetPart013Local46.booleanState0205 ||
                  sceneWidgetPart013Local46.booleanState0200)) {
                  RenderingSupport002.performAction0241(sceneWidgetPart013Local46.computeInteger1761(-36), (byte) -9, integerArgument6);
                } else {
                  MixedSupport045.performAction0561(false, sceneWidgetPart013Local46.computeInteger1761(-87), integerArgument6);
                }
                frameRemainderLocal113 = false;
              }
              else {
                MixedSupport053.performAction0629(0, booleanArgument5, sceneWidgetPart013Local46, stringLocal68);
              }
            }
            sceneWidgetPart013Local46 = (SceneWidgetPart013) (nodeDequeLocal43.computeHashNode1796(true));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal114) {
          caughtExceptionLocal40 = caughtParameterLocal114;
          runtimeExceptionLocal42 = caughtExceptionLocal40;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal42), "client.S(" + integerArgument1 + ',' + integerArgument2 + ',' + booleanArgument3 + ',' + integerArgument4 + ',' + booleanArgument5 + ',' + integerArgument6 + ',' + byteArgument7 + ')');
        }
    }

    private final boolean computeBoolean0311(int integerArgument1) {
        RgbSprite[] cachedRgbSpriteArrayLocal1 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal2 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal3 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal4 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal5 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal6 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal7 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        int stackIntegerLocal11 = 0;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        int stackIntegerLocal14 = 0;
        int stackIntegerLocal15 = 0;
        int stackIntegerLocal16 = 0;
        int stackIntegerLocal17 = 0;
        int stackIntegerLocal18 = 0;
        int stackIntegerLocal19 = 0;
        int stackIntegerLocal20 = 0;
        byte[] stackByteArrayLocal21 = null;
        int stackIntegerLocal22 = 0;
        RuntimeException caughtExceptionLocal23 = null;
        PcmResampler pcmResamplerLocal24 = null;
        IndexedSprite[] indexedSpriteArrayLocal25 = null;
        byte[] byteArrayLocal26 = null;
        IndexedSprite[] indexedSpriteArrayLocal27 = null;
        byte[] byteArrayLocal28 = null;
        int integerLocal29 = 0;
        RgbSprite rgbSpriteLocal30 = null;
        Object objectLocal31 = null;
        IndexedSprite indexedSpriteLocal32 = null;
        RgbSprite[] rgbSpriteArrayLocal33 = null;
        byte[] byteArrayLocal34 = null;
        int integerLocal35 = 0;
        int integerLocal36 = 0;
        byte[] byteArrayLocal37 = null;
        int integerLocal38 = 0;
        RgbSprite rgbSpriteLocal39 = null;
        RgbSprite[] rgbSpriteArrayLocal40 = null;
        int integerLocal41 = 0;
        RgbSprite[][] rgbSpriteArrayArrayLocal42 = null;
        int integerLocal43 = 0;
        RgbSprite rgbSpriteLocal44 = null;
        RgbSprite[][] rgbSpriteArrayArrayLocal45 = null;
        IndexedSprite indexedSpriteLocal46 = null;
        int integerLocal47 = 0;
        int integerLocal48 = 0;
        int integerLocal49 = 0;
        int integerLocal50 = 0;
        int integerLocal51 = 0;
        int integerLocal52 = 0;
        byte[] byteArrayLocal53;
        RgbSprite[] rgbSpriteArrayLocal54;
        int integerLocal55;
        integerLocal10 = obfuscationControl ? 1 : 0;
        try {
          if (null != ThemeTips.resourceArchiveState0009) {
            MixedSupport039.performAction0535((byte) -123);
            UiComponentPart025.performAction1392(65.0f, integerArgument1 + 98, ReturnedShape.stringState0472);
            this.performAction0307(320);
            UiComponentPart016.networkSupport011State0001 = new NetworkSupport011(ThemeTips.resourceArchiveState0009, MixedSupport005.resourceArchiveState0001);
            MixedSupport105.rawSoundState0016 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "fruit_step", integerArgument1 ^ 0);
            rawSoundState0005 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "cooked_fruit_step", 0);
            UiComponentPart014.rawSoundState0010 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_loose_shape_rotate", 0);
            MixedSupport011.rawSoundState0004 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_loose_shape_land_squish", 0);
            MixedSupport039.rawSoundState0007 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_group_shape_land", 0);
            MouseWheelInput.rawSoundState0009 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "fruit_move", 0);
            MixedSupport152.rawSoundState0023 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_loose_tiles_pop", 0);
            MixedSupport117.rawSoundState0020 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_solid_tiles_pop2", 0);
            MixedSupport069.rawSoundArrayState0002[0] = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_combo_1", 0);
            MixedSupport069.rawSoundArrayState0002[1] = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_combo_2", integerArgument1 + 0);
            MixedSupport069.rawSoundArrayState0002[2] = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_combo_3", MixedSupport111.computeInteger1423(integerArgument1, 0));
            MixedSupport069.rawSoundArrayState0002[3] = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_combo_4", MixedSupport111.computeInteger1423(integerArgument1, 0));
            RenderingSupport001.rawSoundState0002 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_simultaneous_bonus2", 0);
            MixedSupport095.rawSoundState0015 = UiComponentPart016.networkSupport011State0001.computeRawSound1290((byte) 101, "", "db_loose_drill");
            MixedSupport040.rawSoundState0008 = UiComponentPart016.networkSupport011State0001.computeRawSound1290((byte) 101, "", "db_bucket_water_capsule2");
            NetworkSupport010.rawSoundState0017 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_quake", integerArgument1 ^ 0);
            MixedSupport030.rawSoundState0006 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_special_item_explode", integerArgument1 ^ 0);
            pcmResamplerLocal24 = new PcmResampler(22050, 11025);
            NetworkSupport010.rawSoundState0017 = NetworkSupport010.rawSoundState0017.computeRawSound1682(pcmResamplerLocal24);
            MixedSupport030.rawSoundState0006 = MixedSupport030.rawSoundState0006.computeRawSound1682(pcmResamplerLocal24);
            SceneWidget.rawSoundState0022 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_poison", integerArgument1 ^ 0);
            MixedSupport108.rawSoundState0018 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_glass_lower", 0);
            SceneWidgetPart003.rawSoundArrayState0001[2] = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_bucket_glass_crack2_2", integerArgument1 + 0);
            SceneWidgetPart003.rawSoundArrayState0001[1] = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_bucket_glass_crack3", integerArgument1 + 0);
            SceneWidgetPart003.rawSoundArrayState0001[0] = UiComponentPart016.networkSupport011State0001.computeRawSound1290((byte) 101, "", "db_bucket_glass_explode");
            MixedSupport059.rawSoundState0011 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_bucket_explode", 0);
            LoginCredentials.rawSoundState0013 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_bucket_debris", 0);
            RenderingSupport001.rawSoundState0003 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_loose_shape_fall_looped", 0);
            PcmPlayerService.rawSoundState0019 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_loose_shape_fall_quake_looped", 0);
            MixedSupport006.rawSoundState0001 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_suck_into_machine", 0);
            ComponentContainer.rawSoundState0014 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "microwave_motor_2", 0);
            MixedSupport138.rawSoundState0021 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_shape_out_of_machine2", integerArgument1 ^ 0);
            SceneWidgetPart005.rawSoundState0012 = UiComponentPart016.networkSupport011State0001.computeRawSound1295("", "db_last_shape_out", 0);
            ThemeTips.resourceArchiveState0009 = null;
            MixedSupport005.resourceArchiveState0001 = null;
            NodeDeque.performAction1788(true);
            return false;
          }
          if (MouseInput.resourceArchiveState0026 != null) {
            UiComponentPart025.performAction1392(75.0f, -96, MixedSupport141.stringState0577);
            this.performAction0307(320);
            LoginCredentials.musicTrackState0004 = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Deko Bloko Titlescreen");
            MixedSupport118.musicTrackArrayArrayState0001[0][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Ant_and_Deko_remix_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[0][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Ant_and_Deko_remix_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[0][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Ant_and_Deko_remix_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[0][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Ant_and_Deko_remix_FINISH_THEM");
            MixedSupport118.musicTrackArrayArrayState0001[1][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Art_Deko_remix_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[1][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Art_Deko_remix_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[1][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Art_Deko_remix_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[1][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Art_Deko_remix_FINISH_THEM");
            MixedSupport118.musicTrackArrayArrayState0001[2][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Bokonosis!_remix_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[2][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Bokonosis!_remix_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[2][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Bokonosis!_remix_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[2][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Bokonosis!_remix_FINISH_THEM");
            MixedSupport118.musicTrackArrayArrayState0001[6][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Deko_Rating_remix_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[6][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Deko_Rating_remix_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[6][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Deko_Rating_remix_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[6][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Deko_Rating_remix_FINISH_THEM");
            MixedSupport118.musicTrackArrayArrayState0001[7][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/double_deko_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[7][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/double_deko_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[7][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/double_deko_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[7][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/double_deko_FINISH_THEM");
            MixedSupport118.musicTrackArrayArrayState0001[4][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/making_connections_remix_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[4][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/making_connections_remix_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[4][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/making_connections_remix_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[4][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/making_connections_remix_FINISH_THEM");
            MixedSupport118.musicTrackArrayArrayState0001[3][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Oh No Boko!_remix_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[3][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Oh No Boko!_remix_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[3][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Oh No Boko!_remix_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[3][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Oh No Boko!_remix_FINISH_THEM");
            MixedSupport118.musicTrackArrayArrayState0001[5][0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Swab the Deks!_remix_NORMAL");
            MixedSupport118.musicTrackArrayArrayState0001[5][1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Swab the Deks!_remix_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[5][2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Swab the Deks!_remix_REALLY_PANIC");
            MixedSupport118.musicTrackArrayArrayState0001[5][3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Swab the Deks!_remix_FINISH_THEM");
            MixedSupport030.musicTrackArrayState0001[0] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/momentum_remix_NORMAL");
            MixedSupport030.musicTrackArrayState0001[1] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/momentum_remix_PANIC");
            MixedSupport030.musicTrackArrayState0001[2] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/momentum_remix_REALLY_PANIC");
            MixedSupport030.musicTrackArrayState0001[3] = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/momentum_remix_FINISH_THEM");
            SceneWidgetPart004.musicTrackState0001 = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Deko Bloko Game Win");
            MixedSupport115.musicTrackState0006 = NetworkSupport008.computeMusicTrack1205(MouseInput.resourceArchiveState0026, 91, "", UiComponentPart016.networkSupport011State0001, "music/Deko Bloko Game Lose");
            MouseInput.resourceArchiveState0026 = null;
            NodeDeque.performAction1788(true);
            return false;
          }
          if (null == UiComponentPart023.resourceArchiveState0015) {
            if (MixedSupport020.resourceArchiveState0003 != null) {
              RenderingSupport003.performAction0577((byte) -93, new MixedSupport068(MixedSupport020.resourceArchiveState0003.computeByteArray0827(0, "huffman", "")));
              MixedSupport020.resourceArchiveState0003 = null;
              NodeDeque.performAction1788(true);
              return false;
            }
            MixedSupport011.performAction0155(320, MixedSupport099.rgbSpriteArrayState0020, Framebuffer.renderingSupport011State0001, true, SceneWidgetNode.renderingSupport011State0002, 20, integerArgument1, 4, 1, 20, 20, 20, MixedSupport001.rgbSpriteArrayState0001, 14, 480, 240, CacheWorkQueue.rgbSpriteArrayState0016, 32, 16, 0, 5);
            MixedSupport059.performAction0722(MixedSupport099.rgbSpriteArrayState0020, SceneWidgetNode.renderingSupport011State0002, MixedSupport001.rgbSpriteArrayState0001, 320, 20, 0, 32, 20, 240, 4, 5, 20, Framebuffer.renderingSupport011State0001, CacheWorkQueue.rgbSpriteArrayState0016, 1, 14, 10406, 0, 16, 20);
            ComponentContainer.renderingSupport008State0006 = MixedSupport033.computeRenderingSupport0080501(false, false, 0, false, false, 32357, false, false);
            FunOrbClient.performAction0104(50, -27096);
            MixedSupport080.performAction0969((byte) 86, 50);
            MixedSupport004.performAction0051(integerArgument1 + 4, 50);
            MixedSupport092.performAction1166(256, LoginCredentials.musicTrackState0004, true);
            NodeDeque.performAction1788(true);
            return true;
          }
          UiComponentPart025.performAction1392(90.0f, 96, MixedSupport143.stringState0582);
          this.performAction0307(320);
          UiComponentPart029.renderingSupport010State0005 = MixedSupport016.computeRenderingSupport0100204("", GameSession.resourceArchiveState0019, MixedSupport005.resourceArchiveState0002, (byte) 108, "arial13");
          indexedSpriteArrayLocal25 = UiComponentPart030.computeIndexedSpriteArray1600("", MixedSupport005.resourceArchiveState0002, false, "arialbold14");
          byteArrayLocal26 = GameSession.resourceArchiveState0019.computeByteArray0827(0, "", "arialbold14");
          SceneWidget.renderingSupport010State0007 = RenderingSupport004.computeRenderingSupport0100587(indexedSpriteArrayLocal25, 55, byteArrayLocal26);
          SceneWidgetNode.renderingSupport011State0002 = RenderingSupport003.computeRenderingSupport0110576((byte) -49, 16777215, 1, indexedSpriteArrayLocal25, byteArrayLocal26, 1);
          indexedSpriteArrayLocal27 = UiComponentPart030.computeIndexedSpriteArray1600("tinybloko", MixedSupport061.resourceArchiveState0008, false, "");
          byteArrayLocal28 = UiComponentPart023.resourceArchiveState0015.computeByteArray0827(integerArgument1 ^ 0, "tinybloko", "");
          RenderingSupport006.renderingSupport010State0003 = RenderingSupport004.computeRenderingSupport0100587(indexedSpriteArrayLocal27, integerArgument1 ^ 111, byteArrayLocal28);
          integerLocal29 = 0;
          while (true) {
            stackIntegerLocal11 = ~indexedSpriteArrayLocal27.length;
            boolean frameRemainderLocal56 = true;
            if (stackIntegerLocal11 < ~integerLocal29) {
              indexedSpriteLocal32 = indexedSpriteArrayLocal27[integerLocal29];
              byteArrayLocal34 = new byte[4 * (indexedSpriteLocal32.integerState0426 * indexedSpriteLocal32.integerState0425)];
              stackIntegerLocal12 = 0;
              frameRemainderLocal56 = (integerLocal10 == 0);
              if (frameRemainderLocal56) {
                integerLocal36 = stackIntegerLocal12;
                while (integerLocal36 < indexedSpriteLocal32.integerState0426) {
                  stackIntegerLocal11 = 0;
                  integerLocal38 = stackIntegerLocal11;
                  while (indexedSpriteLocal32.integerState0425 > integerLocal38) {
                    integerLocal41 = indexedSpriteLocal32.byteArrayState0021[indexedSpriteLocal32.integerState0425 * integerLocal36 + integerLocal38];
                    integerLocal43 = 2 * integerLocal38 + 4 * indexedSpriteLocal32.integerState0425 * integerLocal36;
                    byteArrayLocal34[integerLocal43] = (byte) integerLocal41;
                    byteArrayLocal34[1 + integerLocal43] = (byte) integerLocal41;
                    byteArrayLocal34[integerLocal43 + 2 * indexedSpriteLocal32.integerState0425] = (byte) integerLocal41;
                    byteArrayLocal34[indexedSpriteLocal32.integerState0425 * 2 + integerLocal43 + 1] = (byte) integerLocal41;
                    integerLocal38++;
                  }
                  integerLocal36++;
                }
                indexedSpriteLocal32.integerState0427 = indexedSpriteLocal32.integerState0427 * 2;
                indexedSpriteLocal32.integerState0423 = indexedSpriteLocal32.integerState0423 * 2;
                indexedSpriteLocal32.integerState0422 = indexedSpriteLocal32.integerState0422 * 2;
                indexedSpriteLocal32.integerState0425 = indexedSpriteLocal32.integerState0425 * 2;
                indexedSpriteLocal32.integerState0426 = indexedSpriteLocal32.integerState0426 * 2;
                indexedSpriteLocal32.byteArrayState0021 = byteArrayLocal34;
                indexedSpriteLocal32.integerState0428 = indexedSpriteLocal32.integerState0428 * 2;
                integerLocal29++;
                continue;
              }
            }
            if (frameRemainderLocal56) {
              stackIntegerLocal12 = 0;
            }
            integerLocal29 = stackIntegerLocal12;
            do {
              if (integerLocal29 >= byteArrayLocal28.length) {
                MixedSupport001.renderingSupport010State0001 = RenderingSupport004.computeRenderingSupport0100587(indexedSpriteArrayLocal27, integerArgument1 ^ 103, byteArrayLocal28);
                Framebuffer.renderingSupport011State0001 = RenderingSupport003.computeRenderingSupport0110576((byte) 100, 16694016, 2, indexedSpriteArrayLocal27, byteArrayLocal28, 1);
                Framebuffer.renderingSupport011State0001.integerArrayArrayState0018[1] = new int[]{0, 16777215, 1};
                break;
              }
              byteArrayLocal28[integerLocal29] = (byte)(byteArrayLocal28[integerLocal29] * 2);
              integerLocal29++;
            } while (integerLocal10 == 0);
            integerLocal29 = 0;
            while (true) {
              stackIntegerLocal13 = ~integerLocal29;
              boolean frameRemainderLocal57 = true;
              if (stackIntegerLocal13 > ~indexedSpriteArrayLocal27.length) {
                indexedSpriteLocal32 = indexedSpriteArrayLocal27[integerLocal29];
                byteArrayLocal34 = new byte[indexedSpriteLocal32.integerState0425 * indexedSpriteLocal32.integerState0426 * 9 / 4];
                stackIntegerLocal14 = 0;
                frameRemainderLocal57 = (integerLocal10 == 0);
                if (frameRemainderLocal57) {
                  integerLocal36 = stackIntegerLocal14;
                  while (indexedSpriteLocal32.integerState0426 > integerLocal36) {
                    stackIntegerLocal13 = 0;
                    integerLocal38 = stackIntegerLocal13;
                    while (integerLocal38 < indexedSpriteLocal32.integerState0425) {
                      integerLocal41 = indexedSpriteLocal32.byteArrayState0021[integerLocal38 + indexedSpriteLocal32.integerState0425 * integerLocal36];
                      integerLocal43 = indexedSpriteLocal32.integerState0425 * (integerLocal36 * 9) / 4 + 3 * integerLocal38 / 2;
                      byteArrayLocal34[integerLocal43] = (byte) integerLocal41;
                      byteArrayLocal34[1 + integerLocal43] = (byte) integerLocal41;
                      byteArrayLocal34[2 + integerLocal43] = (byte) integerLocal41;
                      byteArrayLocal34[integerLocal43 + 3 * indexedSpriteLocal32.integerState0425 / 2] = (byte) integerLocal41;
                      byteArrayLocal34[1 + integerLocal43 + indexedSpriteLocal32.integerState0425 * 3 / 2] = (byte) integerLocal41;
                      byteArrayLocal34[2 + (integerLocal43 + 3 * indexedSpriteLocal32.integerState0425 / 2)] = (byte) integerLocal41;
                      byteArrayLocal34[integerLocal43 + 3 * indexedSpriteLocal32.integerState0425] = (byte) integerLocal41;
                      byteArrayLocal34[integerLocal43 + 3 * indexedSpriteLocal32.integerState0425 + 1] = (byte) integerLocal41;
                      byteArrayLocal34[integerLocal43 + (3 * indexedSpriteLocal32.integerState0425 + 2)] = (byte) integerLocal41;
                      integerLocal38 += 2;
                    }
                    integerLocal36 += 2;
                  }
                  indexedSpriteLocal32.integerState0427 = 3 * indexedSpriteLocal32.integerState0427 / 2;
                  indexedSpriteLocal32.integerState0426 = indexedSpriteLocal32.integerState0426 * 3 / 2;
                  indexedSpriteLocal32.byteArrayState0021 = byteArrayLocal34;
                  indexedSpriteLocal32.integerState0428 = indexedSpriteLocal32.integerState0428 * 3 / 2;
                  indexedSpriteLocal32.integerState0423 = indexedSpriteLocal32.integerState0423 * 3 / 2;
                  indexedSpriteLocal32.integerState0425 = indexedSpriteLocal32.integerState0425 * 3 / 2;
                  indexedSpriteLocal32.integerState0422 = indexedSpriteLocal32.integerState0422 * 3 / 2;
                  integerLocal29++;
                  continue;
                }
              }
              if (frameRemainderLocal57) {
                stackIntegerLocal14 = 0;
              }
              integerLocal29 = stackIntegerLocal14;
              do {
                if (byteArrayLocal28.length <= integerLocal29) {
                  GameApplet.renderingSupport010State0002 = RenderingSupport004.computeRenderingSupport0100587(indexedSpriteArrayLocal27, 121, byteArrayLocal28);
                  MixedSupport001.rgbSpriteArrayState0001 = DiagnosticSupport001.computeRgbSpriteArray0336("ui_frame_vbrick", "ui_frame_hbrick", MixedSupport061.resourceArchiveState0008, true, "ui_frame_corner");
                  MixedSupport099.rgbSpriteArrayState0020 = InteractiveComponent.computeRgbSpriteArray0466("ui_button_up", "", integerArgument1 ^ -95, MixedSupport061.resourceArchiveState0008);
                  CacheWorkQueue.rgbSpriteArrayState0016 = InteractiveComponent.computeRgbSpriteArray0466("ui_button_highlight", "", -114, MixedSupport061.resourceArchiveState0008);
                  UiComponent.rgbSpriteArrayState0005 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "chat_toggle_button");
                  MixedSupport046.rgbSpriteArrayState0015 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "chat_toggle_button_highlight");
                  MixedSupport145.rgbSpriteState0063 = UiComponentPart015.computeRgbSprite0717(MixedSupport005.resourceArchiveState0002, "unachieved", "basic", 8192);
                  MouseInput.rgbSpriteState0072 = UiComponentPart015.computeRgbSprite0717(MixedSupport005.resourceArchiveState0002, "locked", "basic", integerArgument1 + 8192);
                  DiagnosticSupport001.rgbSpriteState0011 = new RgbSprite(32, 32);
                  DiagnosticSupport001.rgbSpriteState0011.performAction0256();
                  MixedSupport145.rgbSpriteState0063.performAction0258(0, 0, 32, 32);
                  MixedSupport047.rgbSpriteState0018 = new RgbSprite(32, 32);
                  MixedSupport047.rgbSpriteState0018.performAction0256();
                  MouseInput.rgbSpriteState0072.performAction0258(0, 0, 32, 32);
                  MixedSupport080.framebufferState0001.performAction0423((byte) -84);
                  break;
                }
                byteArrayLocal28[integerLocal29] = (byte)(byteArrayLocal28[integerLocal29] * 3 / 2);
                integerLocal29++;
              } while (integerLocal10 == 0);
              rgbSpriteLocal30 = UiComponentPart015.computeRgbSprite0717(MixedSupport005.resourceArchiveState0002, "orbcoin", "basic", 8192);
              MixedSupport116.rgbSpriteState0052 = new RgbSprite(20, 20);
              MixedSupport116.rgbSpriteState0052.performAction0256();
              rgbSpriteLocal30.performAction0258(0, 0, 20, 20);
              MixedSupport080.framebufferState0001.performAction0423((byte) -106);
              objectLocal31 = null;
              MixedSupport047.indexedSpriteArrayState0003 = UiComponentPart030.computeIndexedSpriteArray1600("solid_mask", MixedSupport061.resourceArchiveState0008, false, "");
              MixedSupport094.rgbSpriteArrayState0019 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "pop");
              InputAdapter002.rgbSpriteArrayState0022 = NodeHashTable.computeRgbSpriteArray1547(integerArgument1 ^ 25972, false, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "explode"), false);
              MixedSupport111.rgbSpriteState0047 = NetworkSupport007.computeRgbSprite1064(UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "wildcard", "", 8192), false, (byte) -28, false);
              RenderingSupport007.rgbSpriteState0026 = MixedSupport111.rgbSpriteState0047.computeRgbSprite0277();
              rgbSpriteArrayLocal33 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "specialitems");
              integerLocal35 = 0;
              scanLoop1: while (true) {
                if (integerLocal35 < 6) {
                  stackIntegerLocal15 = 0;
                  if (integerLocal10 != 0) {
                    break scanLoop1;
                  }
                  integerLocal36 = stackIntegerLocal15;
                  while (4 > integerLocal36) {
                    MixedSupport063.rgbSpriteArrayArrayState0008[integerLocal35][integerLocal36] = NetworkSupport007.computeRgbSprite1064(rgbSpriteArrayLocal33[integerLocal35 * 4 + integerLocal36], false, (byte) -55, false);
                    integerLocal36++;
                  }
                  integerLocal35++;
                  continue scanLoop1;
                }
                stackIntegerLocal15 = 0;
                break;
              }
              integerLocal35 = stackIntegerLocal15;
              while (true) {
                stackIntegerLocal16 = ~integerLocal35;
                boolean frameRemainderLocal58 = true;
                if (stackIntegerLocal16 > -9) {
                  rgbSpriteArrayLocal33 = MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, MixedSupport061.resourceArchiveState0008, "", CodecSupport001.stringArrayState0038[integerLocal35] + "_tiles");
                  stackIntegerLocal20 = 0;
                  frameRemainderLocal58 = (integerLocal10 == 0);
                  if (frameRemainderLocal58) {
                    integerLocal36 = stackIntegerLocal20;
                    while (7 > integerLocal36) {
                      MixedSupport035.rgbSpriteArrayArrayState0006[integerLocal35][integerLocal36] = NetworkSupport007.computeRgbSprite1064(rgbSpriteArrayLocal33[integerLocal36], false, (byte) -63, false);
                      integerLocal36++;
                    }
                    MixedSupport035.rgbSpriteArrayArrayState0006[integerLocal35][7] = RenderingSupport007.rgbSpriteState0026;
                    integerLocal36 = 0;
                    scanLoop2: while (true) {
                      stackIntegerLocal17 = -8;
                      if (stackIntegerLocal17 < ~integerLocal36) {
                        rgbSpriteLocal39 = NetworkSupport007.computeRgbSprite1064(rgbSpriteArrayLocal33[integerLocal36 + 7], true, (byte) -124, true);
                        stackIntegerLocal16 = 0;
                        integerLocal41 = stackIntegerLocal16;
                        scanLoop3: while (true) {
                          stackIntegerLocal18 = -17;
                          stackIntegerLocal19 = ~integerLocal41;
                          if (stackIntegerLocal18 < stackIntegerLocal19) {
                            rgbSpriteLocal44 = rgbSpriteLocal39.computeRgbSprite0277();
                            rgbSpriteLocal44.performAction0256();
                            MixedSupport035.rgbSpriteArrayArrayState0006[integerLocal35][integerLocal36].performAction0271(6, 6, 24, 24);
                            rgbSpriteLocal39.performAction0279(0, 0, 128);
                            indexedSpriteLocal46 = MixedSupport047.indexedSpriteArrayState0003[integerLocal41];
                            stackIntegerLocal17 = 0;
                            integerLocal47 = stackIntegerLocal17;
                            while (1296 > integerLocal47) {
                              integerLocal48 = indexedSpriteLocal46.integerArrayState0183[indexedSpriteLocal46.byteArrayState0021[integerLocal47] & 255] & 255;
                              integerLocal49 = rgbSpriteLocal44.integerArrayState0024[integerLocal47];
                              stackIntegerLocal18 = integerLocal48;
                              stackIntegerLocal19 = 128;
                              if (stackIntegerLocal18 > stackIntegerLocal19) {
                                integerLocal50 = 131586 * (integerLocal48 - 128);
                                integerLocal51 = integerLocal49;
                                integerLocal52 = integerLocal51 + integerLocal50;
                                integerLocal50 = (16711935 & integerLocal51) + (16711935 & integerLocal50);
                                integerLocal55 = (-integerLocal50 + integerLocal52 & 65536) + (16777472 & integerLocal50);
                                integerLocal49 = integerLocal52 - integerLocal55 | integerLocal55 - (integerLocal55 >>> 8);
                              } else {
                                integerLocal49 = ((integerLocal49 & 16711935) * integerLocal48 >> 7 & 16711935) + (((65280 & integerLocal49) * integerLocal48 & 8355876) >> 7);
                              }
                              if (integerLocal49 == 0) {
                                integerLocal49 = 1;
                              }
                              rgbSpriteLocal44.integerArrayState0024[integerLocal47] = integerLocal49;
                              integerLocal47++;
                            }
                            MixedSupport095.rgbSpriteArrayArrayArrayState0001[integerLocal35][integerLocal36][integerLocal41] = rgbSpriteLocal44;
                            integerLocal41++;
                            continue scanLoop3;
                          }
                          break;
                        }
                        integerLocal36++;
                        continue scanLoop2;
                      }
                      break;
                    }
                    SceneWidgetPart010.rgbSpriteArrayState0025[integerLocal35] = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, CodecSupport001.stringArrayState0038[integerLocal35] + "_bucketback", "", 8192);
                    SceneWidgetPart010.rgbSpriteArrayState0025[integerLocal35].performAction0269();
                    integerLocal35++;
                    continue;
                  }
                }
                if (frameRemainderLocal58) {
                  MixedSupport080.framebufferState0001.performAction0423((byte) -114);
                  stackIntegerLocal20 = 0;
                }
                integerLocal35 = stackIntegerLocal20;
                boolean naturalLoopExitLocal59 = false;
                while (!(naturalLoopExitLocal59 = (8 <= integerLocal35))) {
                  stackByteArrayLocal21 = MixedSupport031.resourceArchiveState0005.computeByteArray0827(integerArgument1 + 0, "", CodecSupport001.stringArrayState0038[integerLocal35] + ".jpg");
                  if (integerLocal10 == 0) {
                    byteArrayLocal37 = stackByteArrayLocal21;
                    MixedSupport026.rgbSpriteArrayState0009[integerLocal35] = new RgbSprite(byteArrayLocal37, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
                    integerLocal35++;
                    continue;
                  }
                  break;
                }
                if (naturalLoopExitLocal59) {
                  stackByteArrayLocal21 = MixedSupport031.resourceArchiveState0005.computeByteArray0827(integerArgument1 + 0, "", "menu2.jpg");
                }
                byteArrayLocal34 = stackByteArrayLocal21;
                SceneWidgetPart011.rgbSpriteState0058 = new RgbSprite(byteArrayLocal34, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
                byteArrayLocal53 = MixedSupport031.resourceArchiveState0005.computeByteArray0827(0, "", "achievements.jpg");
                CipherPacketBuffer.rgbSpriteArrayState0030 = MixedSupport036.computeRgbSpriteArray0510(31, new RgbSprite(byteArrayLocal53, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001)), -10241);
                rgbSpriteArrayLocal40 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "achievements");
                integerLocal41 = 0;
                while (integerLocal41 < 31) {
                  rgbSpriteArrayLocal40[integerLocal41].performAction0269();
                  SceneWidgetPart007.performAction1074(0, rgbSpriteArrayLocal40[integerLocal41], CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal41]);
                  rgbSpriteArrayLocal40[integerLocal41] = null;
                  integerLocal41++;
                  if (integerLocal10 == 0) {
                    continue;
                  }
                  break;
                }
                rgbSpriteArrayLocal54 = null;
                MixedSupport129.rgbSpriteArrayState0029 = new RgbSprite[31];
                integerLocal41 = 0;
                do {
                  if (integerLocal41 >= 31) {
                    MixedSupport080.framebufferState0001.performAction0423((byte) -108);
                    MixedSupport105.rgbSpriteState0042 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_clouds", "", 8192);
                    PlatformSupport002.rgbSpriteState0013 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_tl", "", 8192);
                    GameDomainSupport004.rgbSpriteState0024 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_t", "", 8192);
                    MixedSupport121.rgbSpriteState0056 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_tr", "", 8192);
                    MixedSupport042.rgbSpriteState0016 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_l", "", integerArgument1 ^ 8192);
                    TextFieldValidator.rgbSpriteState0076 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_r", "", 8192);
                    MixedSupport145.rgbSpriteState0064 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_bl", "", 8192);
                    MixedSupport105.rgbSpriteState0041 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_b", "", 8192);
                    MixedSupport151.rgbSpriteState0071 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_border_br", "", integerArgument1 ^ 8192);
                    GameDomainSupport006.rgbSpriteState0075 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_menu_title", "", 8192);
                    SceneWidgetPart013.rgbSpriteState0062 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "ui_lobby_logo", "", 8192);
                    MixedSupport062.rgbSpriteState0021 = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, MixedSupport138.stringState0567, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 107);
                    MixedSupport153.rgbSpriteState0074 = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, MixedSupport006.stringState0028, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 120);
                    rgbSpriteArrayState0007[0] = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, UiComponentPart019.stringState0350, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 120);
                    rgbSpriteArrayState0007[1] = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, InputAdapter002.stringState0447, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 114);
                    rgbSpriteArrayState0007[2] = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, ResourceSupport001.stringState0013, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 104);
                    MixedSupport090.rgbSpriteState0036 = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, UiComponentPart006.stringState0109, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 102);
                    MixedSupport077.rgbSpriteState0029 = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, CacheWorkQueue.stringState0265, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 99);
                    ResourceSupport001.rgbSpriteState0004 = SceneWidgetPart007.computeRgbSprite1073(16776192, 16743168, MixedSupport131.stringState0542, RenderingSupport006.renderingSupport010State0003, 6, 0, (byte) 88);
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[0] = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "fruit_buckettop");
                    MixedSupport137.rgbSpriteArrayArrayState0012[0] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "fruit_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[0] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "fruit_leftsidetex"), true);
                    MixedSupport015.indexedSpriteArrayArrayState0001[0] = UiComponentPart030.computeIndexedSpriteArray1600("fruit_leftmask", MixedSupport061.resourceArchiveState0008, false, "");
                    MixedSupport112.rgbSpriteArrayArrayState0009[0] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "fruit_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[0] = NodeHashTable.computeRgbSpriteArray1547(MixedSupport111.computeInteger1423(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "fruit_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[0] = UiComponentPart030.computeIndexedSpriteArray1600("fruit_rightmask", MixedSupport061.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[0] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "fruit_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[0] = UiComponentPart030.computeIndexedSpriteArray1600("fruit_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[1] = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "animals_buckettop");
                    cachedRgbSpriteArrayLocal1 = NodeHashTable.computeRgbSpriteArray1547(25972, false, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "animals_sidespr"), true);
                    MixedSupport112.rgbSpriteArrayArrayState0010[1] = cachedRgbSpriteArrayLocal1;
                    PlatformSupport004.rgbSpriteArrayArrayState0007[1] = cachedRgbSpriteArrayLocal1;
                    HashNode.rgbSpriteArrayArrayState0004[1] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, MixedSupport061.resourceArchiveState0008, "", "animals_bottomspecial"), false);
                    MixedSupport041.indexedSpriteArrayArrayState0002[1] = UiComponentPart030.computeIndexedSpriteArray1600("animals_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[2] = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "breakfast_buckettop");
                    MixedSupport137.rgbSpriteArrayArrayState0012[2] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "breakfast_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[2] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "breakfast_leftsidetex"), true);
                    MixedSupport015.indexedSpriteArrayArrayState0001[2] = UiComponentPart030.computeIndexedSpriteArray1600("breakfast_leftmask", MixedSupport061.resourceArchiveState0008, false, "");
                    MixedSupport112.rgbSpriteArrayArrayState0009[2] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "breakfast_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[2] = NodeHashTable.computeRgbSpriteArray1547(MixedSupport111.computeInteger1423(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "breakfast_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[2] = UiComponentPart030.computeIndexedSpriteArray1600("breakfast_rightmask", MixedSupport061.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[2] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "breakfast_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[2] = UiComponentPart030.computeIndexedSpriteArray1600("breakfast_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[3] = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "bugs_buckettop");
                    cachedRgbSpriteArrayLocal2 = NodeHashTable.computeRgbSpriteArray1547(25972, false, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "bugs_sidespr"), true);
                    MixedSupport112.rgbSpriteArrayArrayState0010[3] = cachedRgbSpriteArrayLocal2;
                    PlatformSupport004.rgbSpriteArrayArrayState0007[3] = cachedRgbSpriteArrayLocal2;
                    HashNode.rgbSpriteArrayArrayState0004[3] = NodeHashTable.computeRgbSpriteArray1547(MixedSupport111.computeInteger1423(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, MixedSupport061.resourceArchiveState0008, "", "bugs_bottomspecial"), false);
                    MixedSupport041.indexedSpriteArrayArrayState0002[3] = UiComponentPart030.computeIndexedSpriteArray1600("bugs_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[4] = MixedSupport011.computeRgbSpriteArray0154(MixedSupport111.computeInteger1423(integerArgument1, 112), MixedSupport061.resourceArchiveState0008, "", "flowers_buckettop");
                    MixedSupport137.rgbSpriteArrayArrayState0012[4] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "flowers_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[4] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(MixedSupport111.computeInteger1423(integerArgument1, 112), MixedSupport061.resourceArchiveState0008, "", "flowers_leftsidetex"), true);
                    MixedSupport015.indexedSpriteArrayArrayState0001[4] = UiComponentPart030.computeIndexedSpriteArray1600("flowers_leftmask", MixedSupport061.resourceArchiveState0008, false, "");
                    MixedSupport112.rgbSpriteArrayArrayState0009[4] = NodeHashTable.computeRgbSpriteArray1547(MixedSupport111.computeInteger1423(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "flowers_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[4] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "flowers_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[4] = UiComponentPart030.computeIndexedSpriteArray1600("flowers_rightmask", MixedSupport061.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[4] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "flowers_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[4] = UiComponentPart030.computeIndexedSpriteArray1600("flowers_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[5] = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "undersea_buckettop");
                    cachedRgbSpriteArrayLocal3 = NodeHashTable.computeRgbSpriteArray1547(25972, false, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "undersea_sidespr"), true);
                    MixedSupport112.rgbSpriteArrayArrayState0010[5] = cachedRgbSpriteArrayLocal3;
                    PlatformSupport004.rgbSpriteArrayArrayState0007[5] = cachedRgbSpriteArrayLocal3;
                    HashNode.rgbSpriteArrayArrayState0004[5] = NodeHashTable.computeRgbSpriteArray1547(MixedSupport111.computeInteger1423(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "undersea_bottomspecial"), false);
                    MixedSupport041.indexedSpriteArrayArrayState0002[5] = UiComponentPart030.computeIndexedSpriteArray1600("undersea_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[6] = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "city_buckettop");
                    MixedSupport137.rgbSpriteArrayArrayState0012[6] = NodeHashTable.computeRgbSpriteArray1547(integerArgument1 + 25972, true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, MixedSupport061.resourceArchiveState0008, "", "city_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[6] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "city_leftsidetex"), true);
                    MixedSupport015.indexedSpriteArrayArrayState0001[6] = UiComponentPart030.computeIndexedSpriteArray1600("city_leftmask", MixedSupport061.resourceArchiveState0008, false, "");
                    MixedSupport112.rgbSpriteArrayArrayState0009[6] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "city_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[6] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(MixedSupport111.computeInteger1423(integerArgument1, 112), MixedSupport061.resourceArchiveState0008, "", "city_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[6] = UiComponentPart030.computeIndexedSpriteArray1600("city_rightmask", MixedSupport061.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[6] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "city_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[6] = UiComponentPart030.computeIndexedSpriteArray1600("city_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    SceneWidgetPart013.rgbSpriteArrayArrayState0013[7] = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "eightbit_buckettop");
                    MixedSupport137.rgbSpriteArrayArrayState0012[7] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "eightbit_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[7] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, MixedSupport061.resourceArchiveState0008, "", "eightbit_leftsidetex"), true);
                    MixedSupport015.indexedSpriteArrayArrayState0001[7] = UiComponentPart030.computeIndexedSpriteArray1600("eightbit_leftmask", MixedSupport061.resourceArchiveState0008, false, "");
                    MixedSupport112.rgbSpriteArrayArrayState0009[7] = NodeHashTable.computeRgbSpriteArray1547(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "eightbit_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[7] = NodeHashTable.computeRgbSpriteArray1547(MixedSupport111.computeInteger1423(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(MixedSupport111.computeInteger1423(integerArgument1, 112), MixedSupport061.resourceArchiveState0008, "", "eightbit_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[7] = UiComponentPart030.computeIndexedSpriteArray1600("eightbit_rightmask", MixedSupport061.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[7] = NodeHashTable.computeRgbSpriteArray1547(MixedSupport111.computeInteger1423(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "eightbit_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[7] = UiComponentPart030.computeIndexedSpriteArray1600("eightbit_bottommask", MixedSupport061.resourceArchiveState0008, false, "");
                    break;
                  }
                  MixedSupport129.rgbSpriteArrayState0029[integerLocal41] = new RgbSprite(32, 32);
                  MixedSupport129.rgbSpriteArrayState0029[integerLocal41].performAction0256();
                  CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal41].performAction0258(0, 0, 32, 32);
                  integerLocal41++;
                } while (integerLocal10 == 0);
                integerLocal41 = 0;
                scanLoop4: while (true) {
                  if (integerLocal41 < 8) {
                    MixedSupport099.performAction1234(MixedSupport137.rgbSpriteArrayArrayState0012[integerLocal41], 19264);
                    MixedSupport099.performAction1234(MixedSupport112.rgbSpriteArrayArrayState0009[integerLocal41], integerArgument1 + 19264);
                    MixedSupport099.performAction1234(ResourceSupport001.rgbSpriteArrayArrayState0001[integerLocal41], 19264);
                    IterableNodeCollection.performAction1708(MixedSupport015.indexedSpriteArrayArrayState0001[integerLocal41], (byte) 115);
                    IterableNodeCollection.performAction1708(ProxySocketFactory.indexedSpriteArrayArrayState0003[integerLocal41], (byte) -118);
                    IterableNodeCollection.performAction1708(MixedSupport041.indexedSpriteArrayArrayState0002[integerLocal41], (byte) 114);
                    stackIntegerLocal22 = 0;
                    if (integerLocal10 != 0) {
                      break scanLoop4;
                    }
                    integerLocal43 = stackIntegerLocal22;
                    while (integerLocal43 < SceneWidgetPart013.rgbSpriteArrayArrayState0013[integerLocal41].length) {
                      SceneWidgetPart013.rgbSpriteArrayArrayState0013[integerLocal41][integerLocal43].performAction0269();
                      integerLocal43++;
                    }
                    integerLocal41++;
                    continue scanLoop4;
                  }
                  CipherPacketBuffer.rgbSpriteState0061 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_buttons1", "", 8192);
                  MixedSupport013.rgbSpriteState0007 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_front", "", integerArgument1 ^ 8192);
                  MixedSupport016.rgbSpriteState0010 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_glass", "", 8192);
                  MixedSupport027.rgbSpriteState0014 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_glasslit", "", integerArgument1 ^ 8192);
                  UiComponentPart004.rgbSpriteState0009 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_lights1", "", 8192);
                  MixedSupport084.rgbSpriteState0033 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_mouth", "", 8192);
                  MixedSupport002.rgbSpriteState0002 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_next", "", integerArgument1 + 8192);
                  MixedSupport066.rgbSpriteState0023 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_nextlit", "", 8192);
                  GameDomainSupport001.rgbSpriteState0006 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_pipe", "", 8192);
                  MixedSupport131.rgbSpriteState0059 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "machine_portal", "", integerArgument1 + 8192);
                  MixedSupport009.integerArrayState0015 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "blobmatch_scorecols", "", 8192).integerArrayState0024;
                  MixedSupport001.integerArrayState0002 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "eliminatetile_scorecols", "", integerArgument1 ^ 8192).integerArrayState0024;
                  LoginCredentials.integerArrayState0115 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "simultaneous_scorecols", "", 8192).integerArrayState0024;
                  TextLineMetrics.integerArrayState0167 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "chain_scorecols", "", 8192).integerArrayState0024;
                  NetworkSupport008.integerArrayState0176 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "bomb_scorecols", "", integerArgument1 ^ 8192).integerArrayState0024;
                  MixedSupport148.integerArrayState0252 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "bombardmessagecols", "", 8192).integerArrayState0024;
                  UiComponentPart023.rgbSpriteArrayState0021 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "instructions_keys");
                  ComponentDecorator.rgbSpriteState0034 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "instructions_arrow", "", 8192);
                  NetworkSupport001.rgbSpriteState0005 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "instructions_inmultiplayer", "", 8192);
                  MixedSupport081.rgbSpriteState0032 = UiComponentPart015.computeRgbSprite0717(MixedSupport061.resourceArchiveState0008, "instructions_insingleplayer", "", integerArgument1 + 8192);
                  stackIntegerLocal22 = 5;
                  break;
                }
                rgbSpriteArrayArrayLocal42 = new RgbSprite[stackIntegerLocal22][];
                rgbSpriteArrayArrayLocal45 = new RgbSprite[5][];
                cachedRgbSpriteArrayLocal4 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "bucketsize_icons");
                rgbSpriteArrayArrayLocal45[0] = cachedRgbSpriteArrayLocal4;
                rgbSpriteArrayArrayLocal42[0] = cachedRgbSpriteArrayLocal4;
                cachedRgbSpriteArrayLocal5 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "speed_icons");
                rgbSpriteArrayArrayLocal45[1] = cachedRgbSpriteArrayLocal5;
                rgbSpriteArrayArrayLocal42[1] = cachedRgbSpriteArrayLocal5;
                cachedRgbSpriteArrayLocal6 = MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, MixedSupport061.resourceArchiveState0008, "", "shapefeedback_icons");
                rgbSpriteArrayArrayLocal45[4] = cachedRgbSpriteArrayLocal6;
                rgbSpriteArrayArrayLocal42[4] = cachedRgbSpriteArrayLocal6;
                GzipDecompressor.rgbSpriteArrayState0018 = cachedRgbSpriteArrayLocal6;
                cachedRgbSpriteArrayLocal7 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "colours_icons");
                rgbSpriteArrayArrayLocal45[2] = cachedRgbSpriteArrayLocal7;
                rgbSpriteArrayArrayLocal42[2] = cachedRgbSpriteArrayLocal7;
                cachedRgbSpriteArrayLocal8 = MixedSupport011.computeRgbSpriteArray0154(112, MixedSupport061.resourceArchiveState0008, "", "specialitems_icons");
                rgbSpriteArrayArrayLocal45[3] = cachedRgbSpriteArrayLocal8;
                rgbSpriteArrayArrayLocal42[3] = cachedRgbSpriteArrayLocal8;
                MixedSupport010.performAction0143(MixedSupport148.byteArrayState0040, MixedSupport089.integerArrayState0166, NodeHashTable.stringArrayState0045, MixedSupport104.byteArrayState0020, 8, SceneWidgetPart009.stringArrayArrayState0007, MixedSupport005.resourceArchiveState0002, 5, 25150, GameSession.resourceArchiveState0019, rgbSpriteArrayArrayLocal42, rgbSpriteArrayArrayLocal45, true, UiComponentPart032.resourceArchiveState0024, MixedSupport127.stringArrayArrayState0008);
                MixedSupport050.performAction0603(-3504, 200);
                InputAdapter002.performAction1387(MixedSupport005.resourceArchiveState0002, GameSession.resourceArchiveState0019, -96);
                ReturnedShape.performAction1471(MixedSupport003.stringArrayState0001, 0, 180, -94, 16694016, (java.applet.Applet) (this));
                GameSession.resourceArchiveState0019 = null;
                UiComponentPart023.resourceArchiveState0015 = null;
                NodeDeque.performAction1788(true);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException caughtParameterLocal60) {
          caughtExceptionLocal23 = caughtParameterLocal60;
          runtimeExceptionLocal9 = caughtExceptionLocal23;
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeExceptionLocal9), "client.T(" + integerArgument1 + ')');
        }
    }

    final static boolean computeBoolean0302(int integerArgument1, String stringArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (integerArgument1 <= 79) {
            DekoBlokoClient.computeMixedSupport0660303((String) null, -100);
          }
          if (null != stringArgument2 &&
            stringArgument2.length() >= MixedSupport085.integerState0501 &&
            stringArgument2.length() <= MixedSupport026.integerState0153) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("client.P(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void init() {
        try {
          this.performAction0106(-2990, 32, "dekobloko");
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020368((Throwable) ((Object) runtimeException), "client.init()");
        }
    }

    static {
        byteArrayState0004 = new byte[65536];
        MixedSupport008.performAction0072(byteArrayState0004, 0, 65536, (byte) -128);
        stringState0095 = "Theme <%0> strategy";
        stringState0096 = "Show all private chat";
        rgbSpriteArrayState0007 = new RgbSprite[3];
        stringState0097 = "Use this alternative as your account name";
    }
}
