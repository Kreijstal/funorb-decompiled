/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FunOrbClient extends GameApplet {
    private boolean booleanState0007;
    private int integerState0055;
    private int integerState0056;
    private int integerState0057;
    private int integerState0058;
    private int integerState0059;
    private boolean booleanState0008;
    private int integerState0060;
    private long longState0002;
    String stringState0042;
    private boolean booleanState0009;

    private final void performAction0124(byte byteArgument1) {
        try {
          MixedSupport126.booleanArrayState0010[5] = true;
          if (byteArgument1 <= 62) {
            this.longState0002 = -10L;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.GA(" + byteArgument1 + ')');
        }
    }

    private final void performAction0132(int integerArgument1) {
        try {
          MixedSupport126.booleanArrayState0010[6] = true;
          if (integerArgument1 != -1) {
            this.performAction0133(-42);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.EA(" + integerArgument1 + ')');
        }
    }

    private final int computeInteger0121(boolean booleanArgument1, int integerArgument2, boolean booleanArgument3) {
        try {
          int stackIntegerLocal1 = 0;
          int stackIntegerLocal2 = 0;
          int stackIntegerLocal3 = 0;
          Throwable caughtExceptionLocal4 = null;
          int integerLocal5 = 0;
          RuntimeException runtimeExceptionLocal6 = null;
          int integerLocal7 = 0;
          int integerLocal8 = 0;
          Exception exceptionLocal9 = null;
          String stringLocal10 = null;
          int integerLocal11 = 0;
          String stringLocal12 = null;
          String stringLocal13 = null;
          Boolean booleanLocal14 = null;
          PacketBuffer packetBufferLocal15 = null;
          int integerLocal16;
          int integerLocal17;
          integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            integerLocal5 = -3 % ((6 - integerArgument2) / 36);
            integerLocal7 = CodecSupport002.computeInteger1247(255, RenderingSupport007.integerState0360, booleanArgument1, MixedSupport068.integerState0353);
            if (integerLocal7 == 0) {
              throw new IllegalStateException();
            }
            if (integerLocal7 == 1) {
              integerLocal8 = NetworkSupport012.computeInteger1742(RenderingSupport003.computeLoginCredentials0634((byte) -89), MixedSupport095.computeLoginCredentials1313((byte) -117), 125);
              if (-1 != integerLocal8) {
                InputAdapter005.performAction1533(UiComponentPart028.stringState0483, UiComponentPart023.stringArrayState0030, integerLocal8, -677);
                UiComponentPart028.stringState0483 = null;
                UiComponentPart023.stringArrayState0030 = null;
              }
              booleanLocal14 = MixedSupport105.computeBoolean1417(24994);
              if (booleanLocal14 != null) {
                NetworkSupport010.performAction1433(booleanLocal14.booleanValue(), false);
              }
            }
            if (integerLocal7 == 2) {
              integerLocal16 = MixedSupport113.computeInteger1610(MixedSupport101.computeString1390(2), NetworkSupport012.computeInteger1737((byte) -97), MixedSupport033.computeString0543(116), MixedSupport002.computeString0026(-48), 0, this.integerState0056, NetworkSupport012.computeBoolean1743(1));
              if (integerLocal16 != -1) {
                MixedSupport066.performAction0869(UiComponentPart023.stringArrayState0030, integerLocal16, UiComponentPart028.stringState0483, 0);
                UiComponentPart028.stringState0483 = null;
                UiComponentPart023.stringArrayState0030 = null;
              }
            }
            if (3 == integerLocal7) {
              if (SceneWidgetPart010.integerState0722 != -1 &&
                SceneWidgetPart010.integerState0722 != 0) {
                SceneWidgetPart010.integerState0722 = -1;
                MixedSupport123.performAction1757((byte) -115);
              }
              if (!booleanArgument3) {
                integerLocal17 = MixedSupport123.computeInteger1751(MixedSupport002.computeString0026(-48), this.booleanState0008, MixedSupport101.computeString1390(2), (byte) 55, this.integerState0056, false);
                if (-1 != integerLocal17) {
                  if (integerLocal17 != 0) {
                    NetworkSupport003.performAction0377(UiComponentPart028.stringState0483, 0, integerLocal17);
                    UiComponentPart028.stringState0483 = null;
                  } else {
                    MixedSupport132.longState0049 = GameAssets.longState0046;
                    InputAdapter004.performAction1234(1);
                    MixedSupport141.booleanState0194 = false;
                    MixedSupport052.integerState0269 = 10;
                  }
                }
              } else {
                ResourceSupport003.booleanState0126 = false;
              }
            }
            if (integerLocal7 == 4) {
              if (!UiComponent.booleanState0017) {
                MixedSupport141.booleanState0194 = true;
                MixedSupport052.integerState0269 = 10;
              } else {
                DualNode.performAction0142(UiComponentPart029.computeApplet1689(25144), (byte) -57);
              }
            }
            if (integerLocal7 == 5) {
              NetworkSupport010.performAction1431((byte) -17, UiComponentPart029.computeApplet1689(25144));
            }
            if (integerLocal7 == 6 &&
              UiComponentPart025.booleanState0152) {
              MixedSupport052.integerState0269 = 10;
            }
            if (integerLocal7 == 7) {
              NetworkSupport005.performAction1023((byte) 96, UiComponentPart029.computeApplet1689(25144));
            }
            if (8 == integerLocal7) {
              DualNode.performAction0142(UiComponentPart029.computeApplet1689(25144), (byte) -57);
            }
            if (9 == integerLocal7) {
              HashNode.performAction0158(-114, UiComponentPart029.computeApplet1689(25144));
            }
            if (10 == integerLocal7) {
              SocketFactory.cipherPacketBufferState0002.performAction1861(17, -4);
            }
            if (integerLocal7 == 11) {
              SceneWidgetPart014.performAction2012(UiComponentPart029.computeApplet1689(25144), 30307);
            }
            if (integerLocal7 == 12) {
              NetworkSupport001.performAction0068(MixedSupport149.computeString1990(-30185), -88, UiComponentPart029.computeApplet1689(25144));
            }
            if (13 == integerLocal7) {
              try {
                if (MixedSupport145.networkSupport008State0001 == null) {
                  MixedSupport145.networkSupport008State0001 = new NetworkSupport008(CodecSupport001.platformServiceState0003, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                }
                if (MixedSupport145.networkSupport008State0001.computeBoolean1342(-125)) {
                  packetBufferLocal15 = MixedSupport145.networkSupport008State0001.computePacketBuffer1345(false);
                  if (packetBufferLocal15 != null) {
                    stringLocal10 = MixedSupport140.computeString1906(packetBufferLocal15.payload, 0, 0, packetBufferLocal15.position);
                    DiagnosticSupport002.performAction0864(stringLocal10, (byte) 45);
                  } else {
                    stringLocal12 = (String) null;
                    DiagnosticSupport002.performAction0864((String) null, (byte) 45);
                  }
                  MixedSupport145.networkSupport008State0001 = null;
                }
              } catch (java.lang.Exception caughtParameterLocal18) {
                caughtExceptionLocal4 = caughtParameterLocal18;
                exceptionLocal9 = (Exception) (Object) caughtExceptionLocal4;
                NetworkArchiveRequestManager.performAction1468((Throwable) ((Object) exceptionLocal9), 16408, "S1");
                stringLocal13 = (String) null;
                DiagnosticSupport002.performAction0864((String) null, (byte) 45);
                MixedSupport145.networkSupport008State0001 = null;
              }
            }
            if (integerLocal7 == 15) {
              MixedSupport052.integerState0269 = 10;
            }
            if (integerLocal7 == 16) {
              stackIntegerLocal1 = 1;
              return stackIntegerLocal1;
            }
            if (17 != integerLocal7) {
              stackIntegerLocal3 = 0;
              return stackIntegerLocal3;
            }
            stackIntegerLocal2 = 2;
            return stackIntegerLocal2;
          } catch (java.lang.RuntimeException caughtParameterLocal19) {
            caughtExceptionLocal4 = caughtParameterLocal19;
            runtimeExceptionLocal6 = (RuntimeException) (Object) caughtExceptionLocal4;
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal6), "bd.HA(" + booleanArgument1 + ',' + integerArgument2 + ',' + booleanArgument3 + ')');
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal20) {
          throw uncheckedExceptionLocal20;
        } catch (Throwable checkedExceptionLocal21) {
          throw new RuntimeException(checkedExceptionLocal21);
        }
    }

    private final void performAction0133(int integerArgument1) {
        String stringLocal1 = null;
        RuntimeException caughtExceptionLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        try {
          stringLocal1 = MusicTrack.computeString1882(integerArgument1 ^ -12040);
          MixedSupport094.performAction1306(UiComponentPart029.computeApplet1689(25144), -1, stringLocal1);
          if (integerArgument1 != 0) {
            this.performAction0128((byte) 100);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal2 = caughtParameterLocal4;
          runtimeExceptionLocal3 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal3), "bd.QA(" + integerArgument1 + ')');
        }
    }

    final void performAction0130(int integerArgument1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int integerLocal3 = 0;
        boolean stackBooleanLocal4 = false;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 != 10) {
            return;
          }
          if (UiComponentPart030.computeBoolean1762((byte) 124)) {
            stackBooleanLocal4 = (null != MixedSupport020.platformSupport006State0001);
            discarded$0 = this.computeInteger0121(stackBooleanLocal4, -41, false);
          } else {
            if (UiComponentPart004.integerState0091 >= 10) {
              if (!UiComponentPart009.computeBoolean0413(480)) {
                MixedSupport132.performAction1842((byte) -70);
                return;
              }
              if (MixedSupport052.integerState0269 == 0) {
                discarded$1 = this.computeInteger0121(false, -104, false);
                return;
              }
              PlatformSupport006.performAction1565(MixedSupport068.integerState0353, (byte) -101);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal6), "bd.MA(" + integerArgument1 + ')');
        }
    }

    private final void performAction0127(byte byteArgument1) {
        try {
          MixedSupport126.booleanArrayState0010[13] = true;
          MixedSupport126.booleanArrayState0010[12] = true;
          MixedSupport126.booleanArrayState0010[11] = true;
          if (byteArgument1 != 13) {
            this.integerState0056 = -26;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.KA(" + byteArgument1 + ')');
        }
    }

    final void performAction0123(boolean booleanArgument1, int integerArgument2) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        String stackStringLocal5 = null;
        int stackIntegerLocal6;
        boolean stackBooleanLocal7;
        int stackIntegerLocal8 = 0;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        java.awt.Dimension dimensionLocal12 = null;
        int integerLocal13 = 0;
        java.awt.Container containerLocal14 = null;
        int integerLocal15;
        int integerLocal16;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (MixedSupport081.codecSupport004State0001 != null) {
            if (null == MixedSupport020.platformSupport006State0001) {
              containerLocal14 = MixedSupport155.computeContainer2099((byte) 126);
              dimensionLocal12 = containerLocal14.getSize();
              MixedSupport081.codecSupport004State0001.performAction1635(dimensionLocal12.width, false, dimensionLocal12.height);
            }
            MixedSupport081.codecSupport004State0001.performAction1637(false);
          }
          SoftwareFramebuffer.performAction2031(19012);
          PlatformSupport006.performAction1570(-2);
          if (!MixedSupport124.computeBoolean1766((byte) -35) &&
            MixedSupport052.integerState0269 != 11) {
            MixedSupport039.performAction0582(-52);
          }
          if (null != MixedSupport134.inputAdapter003State0001) {
            MixedSupport068.integerState0353 = MixedSupport134.inputAdapter003State0001.computeInteger0056(60);
          }
          if (NodeHashTable.computeBoolean1711(-12851)) {
            integerLocal10 = InputAdapter004.computeInteger1233((byte) -74) * 1200;
            if (this.booleanState0009 ||
              !(integerLocal10 >= MixedSupport042.computeInteger0590((byte) -108)) &&
              !(integerLocal10 >= CodecSupport002.computeInteger1249((byte) -40))) {
              this.booleanState0009 = false;
              NodeHashTable.performAction1703(79);
              MixedSupport048.performAction0645(false);
              NetworkSupport003.performAction0377(MixedSupport007.stringState0035, integerArgument2 ^ -11, 2);
              MixedSupport066.performAction0870((byte) 84);
              ResourceSupport003.booleanState0126 = true;
              MixedSupport079.longState0026 = MixedSupport063.computeLong0827(integerArgument2 + 15) + 15000L;
            }
          }
          if (SceneWidgetPart010.integerState0722 == -1 ||
            SceneWidgetPart010.integerState0722 == 0) {
            stackIntegerLocal1 = (SceneWidgetPart010.integerState0722 == -1) ? 1 : 0;
            integerLocal15 = stackIntegerLocal1;
            SceneWidgetPart010.integerState0722 = UiComponentPart014.computeInteger0786(102);
            if (integerLocal15 != 0 &&
              SceneWidgetPart010.integerState0722 == 0 &&
              MixedSupport052.integerState0269 == 11 &&
              !RichTextLayout.computeBoolean0436((byte) -57)) {
              InputAdapter004.performAction1234(1);
            }
            if (-1 != SceneWidgetPart010.integerState0722 &&
              SceneWidgetPart010.integerState0722 != 0) {
              MixedSupport079.longState0026 = MixedSupport063.computeLong0827(4) + 15000L;
            }
          }
          if (SceneWidgetPart010.integerState0722 != -1 &&
            SceneWidgetPart010.integerState0722 != 0) {
            if (UiComponentPart004.integerState0091 < 10) {
              if (SceneWidgetPart010.integerState0722 == 3) {
                this.performAction0760(true, "js5crc");
              } else {
                if (4 == SceneWidgetPart010.integerState0722) {
                  this.performAction0760(true, "js5io");
                } else {
                  if (SceneWidgetPart010.integerState0722 != 2) {
                    if (SceneWidgetPart010.integerState0722 == 5) {
                      this.performAction0760(true, "outofdate");
                    } else {
                      this.performAction0760(true, "js5connect");
                    }
                  } else {
                    this.performAction0760(true, "js5connect_full");
                  }
                }
              }
            } else {
              if (MixedSupport052.integerState0269 >= 10) {
                MixedSupport048.performAction0645(false);
                if (SceneWidgetPart010.integerState0722 == 3) {
                  NetworkSupport003.performAction0377(MixedSupport058.stringState0249, 0, 256);
                } else {
                  if (4 == SceneWidgetPart010.integerState0722) {
                    NetworkSupport003.performAction0377(MixedSupport133.stringState0549, integerArgument2 + 11, 256);
                  } else {
                    if (2 == SceneWidgetPart010.integerState0722) {
                      NetworkSupport003.performAction0377(MixedSupport071.stringState0298, 0, 256);
                    } else {
                      if (SceneWidgetPart010.integerState0722 != 5) {
                        NetworkSupport003.performAction0377(ComponentContainer.stringState0307, 0, 256);
                      } else {
                        NetworkSupport003.performAction0377(MixedSupport005.stringState0018, integerArgument2 + 11, 5);
                      }
                    }
                  }
                }
                ResourceSupport003.booleanState0126 = true;
              }
            }
          }
          if ((SceneWidgetPart010.integerState0722 != -1 &&
            SceneWidgetPart010.integerState0722 != 0 ||
            RichTextLayout.computeBoolean0436((byte) -112)) &&
            MixedSupport063.computeLong0827(4) >= MixedSupport079.longState0026) {
            ResourceSupport003.booleanState0126 = false;
            if (SceneWidgetPart010.integerState0722 != -1 &&
              0 != SceneWidgetPart010.integerState0722) {
              SceneWidgetPart010.integerState0722 = -1;
              MixedSupport123.performAction1757((byte) -116);
            }
          }
          if (SceneWidgetPart010.integerState0722 == 0 &&
            !RichTextLayout.computeBoolean0436((byte) -112)) {
            UiComponentPart031.booleanState0185 = false;
          }
          if (UiComponentPart004.integerState0091 == 0 &&
            TextLineMetrics.computeBoolean1256(48)) {
            UiComponentPart004.integerState0091 = 1;
          }
          if (UiComponentPart004.integerState0091 == 1) {
            if (0 != RenderingSupport007.integerState0360) {
              NodeDeque.resourceArchiveState0025 = MixedSupport145.computeResourceArchive1946(MixedSupport146.integerState0856, 34);
            }
            MixedSupport121.resourceArchiveState0021 = UiComponentPart031.computeResourceArchive1800(1, integerArgument2 + 131, false, true, RenderingSupport002.integerState0112);
            AudioSupport004.resourceArchiveState0020 = UiComponentPart031.computeResourceArchive1800(1, 127, false, true, MixedSupport001.integerState0014);
            UiComponentPart023.resourceArchiveState0016 = UiComponentPart031.computeResourceArchive1800(1, 113, false, true, ReturnedShape.integerState0697);
            MixedSupport005.resourceArchiveState0002 = MixedSupport121.resourceArchiveState0021;
            UiComponentPart004.integerState0091 = 2;
            GameSession.resourceArchiveState0019 = AudioSupport004.resourceArchiveState0020;
          }
          if (UiComponentPart004.integerState0091 == 2) {
            if (NodeDeque.resourceArchiveState0025 != null &&
              NodeDeque.resourceArchiveState0025.computeBoolean0904((byte) 121)) {
              if (NodeDeque.resourceArchiveState0025.computeBoolean0919("", integerArgument2 ^ -11)) {
                if (NodeDeque.resourceArchiveState0025.computeBoolean0918("", (byte) -94)) {
                  TranslatedUiText.performAction1204(NodeDeque.resourceArchiveState0025, (byte) 117);
                  NodeDeque.resourceArchiveState0025 = null;
                  NodeDeque.performAction1965(true);
                }
              } else {
                NodeDeque.resourceArchiveState0025 = null;
              }
            }
            if (NodeDeque.resourceArchiveState0025 == null) {
              UiComponentPart004.integerState0091 = 3;
            }
          }
          if (3 == UiComponentPart004.integerState0091 &&
            MixedSupport124.computeBoolean1770(MixedSupport121.resourceArchiveState0021, AudioSupport004.resourceArchiveState0020, -21, UiComponentPart023.resourceArchiveState0016) &&
            ResourceSupport002.computeBoolean0096(UiComponentPart023.resourceArchiveState0016, -2147483648)) {
            MixedSupport027.performAction0427(-8621);
            SceneWidgetPart008.performAction1299((byte) 112);
            UiComponentPart025.booleanState0152 = false;
            UiComponentPart013.stringState0227 = SoftwareFramebuffer.stringState0616;
            UiComponentPart029.performAction1687(MixedSupport121.resourceArchiveState0021, UiComponentPart023.resourceArchiveState0016, (byte) 76, UiComponent.booleanState0017, AudioSupport004.resourceArchiveState0020);
            if (RenderingSupport003.booleanState0054 ||
              null != MixedSupport143.stringState0584) {
              stackIntegerLocal2 = (RenderingSupport003.booleanState0054) ? 0 : 1;
              stackIntegerLocal3 = stackIntegerLocal2;
              stackIntegerLocal4 = -86;
              stackStringLocal5 = MixedSupport143.stringState0584;
              if (RenderingSupport003.booleanState0054) {
                stackIntegerLocal6 = stackIntegerLocal3;
                stackBooleanLocal7 = false;
              } else {
                stackIntegerLocal6 = stackIntegerLocal2;
                stackBooleanLocal7 = true;
              }
              MixedSupport112.performAction1591(stackIntegerLocal6 != 0, stackIntegerLocal4, stackStringLocal5, stackBooleanLocal7);
            }
            if (MixedSupport098.booleanState0131) {
              UiComponentPart028.performAction1646(false);
            }
            if (null == InputAdapter003.pcmStreamMixerState0002) {
              InputAdapter003.pcmStreamMixerState0002 = NetworkSupport010.computePcmStreamMixer1432(15000);
              RichTextLayout.integerState0161 = MixedSupport057.computeInteger0764(1);
            }
            MixedSupport029.performAction0449(UiComponentPart023.resourceArchiveState0016, RichTextLayout.integerState0161, InputAdapter003.pcmStreamMixerState0002, 20350);
            MixedSupport121.resourceArchiveState0021 = null;
            AudioSupport004.resourceArchiveState0020 = null;
            UiComponentPart023.resourceArchiveState0016 = null;
            MixedSupport113.performAction1608((java.applet.Applet) (this), false);
            NodeDeque.performAction1965(true);
            UiComponentPart004.integerState0091 = 10;
          }
          if (~UiComponentPart004.integerState0091 == integerArgument2) {
            if (0 != RenderingSupport007.integerState0360) {
              GameDomainSupport006.resourceArchiveState0027 = MixedSupport145.computeResourceArchive1946(MixedSupport049.integerState0262, 112);
            }
            UiComponentPart004.integerState0091 = 11;
          }
          boolean frameRemainderLocal17 = true;
          if (UiComponentPart004.integerState0091 == 11) {
            if (null != GameDomainSupport006.resourceArchiveState0027 && (!GameDomainSupport006.resourceArchiveState0027.computeBoolean0904((byte) 121) ||
              !GameDomainSupport006.resourceArchiveState0027.computeBoolean0921(false))) {
              UiComponentPart025.performAction1541(0.0f, -78, ResourceSupport001.computeString0047(GameDomainSupport006.resourceArchiveState0027, MixedSupport037.stringState0174, true, MixedSupport028.stringState0137));
              frameRemainderLocal17 = false;
            }
            else {
              UiComponentPart004.integerState0091 = 12;
              ResourceSupport003.booleanState0127 = true;
            }
          }
          if (12 == UiComponentPart004.integerState0091 &&
            !ResourceSupport003.booleanState0127) {
            UiComponentPart004.integerState0091 = 13;
          }
          if (UiComponentPart004.integerState0091 == 13) {
            integerLocal16 = 1;
            if (GameAssets.mixedSupport014State0001 != null) {
              stackIntegerLocal8 = (!GameAssets.mixedSupport014State0001.computeBoolean0208(-57)) ? 0 : 1;
              integerLocal16 = stackIntegerLocal8;
              UiComponentPart025.performAction1541(GameAssets.mixedSupport014State0001.floatState0001, integerArgument2 + 82, GameAssets.mixedSupport014State0001.stringState0068);
            }
            if (integerLocal16 != 0) {
              UiComponentPart004.integerState0091 = 20;
            }
          }
          if (!booleanArgument1 &&
            LoginCredentials.booleanState0086) {
            SceneWidgetPart012.performAction1824(false, GameDomainSupport004.canvasState0001);
            this.performAction0761((byte) -91);
            MixedSupport056.performAction0747(GameDomainSupport004.canvasState0001, (byte) -97);
          }
          if (MixedSupport126.booleanArrayState0010[8]) {
            GameDomainSupport002.performAction0444(integerArgument2 - 82);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal9 = caughtParameterLocal18;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal11), "bd.RA(" + booleanArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final int computeInteger0120(boolean booleanArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        RuntimeException caughtExceptionLocal3 = null;
        try {
          if (byteArgument2 != 102) {
            this.booleanState0007 = false;
          }
          stackIntegerLocal2 = this.computeInteger0121(booleanArgument1, byteArgument2 ^ -124, true);
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          runtimeExceptionLocal1 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "bd.NA(" + booleanArgument1 + ',' + byteArgument2 + ')');
        }
    }

    final void performAction0128(byte byteArgument1) {
        int stackIntegerLocal1 = 0;
        boolean stackBooleanLocal2 = false;
        RuntimeException caughtExceptionLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException runtimeExceptionLocal5 = null;
        MixedSupport056 mixedSupport056Local6 = null;
        int integerLocal7 = 0;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 < 115) {
            this.performAction0130(-60);
          }
          integerLocal4 = HashNode.integerState0070;
          if (integerLocal4 < 64 &&
            MixedSupport126.booleanArrayState0010[integerLocal4]) {
            if (integerLocal4 == 0) {
              return;
            }
            if (integerLocal4 != 1) {
              if (2 != integerLocal4) {
                if (integerLocal4 == 3) {
                  PlatformSupport002.performAction0410(69);
                } else {
                  if (integerLocal4 != 4) {
                    if (5 == integerLocal4) {
                      MixedSupport103.performAction1397(14750);
                    } else {
                      if (integerLocal4 != 6) {
                        if (7 != integerLocal4) {
                          if (integerLocal4 == 8) {
                            UiComponentPart026.performAction1578(NetworkSupport012.integerState0759, CodecSupport001.platformServiceState0003, 4210752, UiComponentPart006.cipherPacketBufferState0001);
                          } else {
                            if (integerLocal4 == 16) {
                              MixedSupport155.performAction2098(140);
                            } else {
                              if (integerLocal4 != 11 &&
                                integerLocal4 != 12) {
                                if (13 == integerLocal4) {
                                  UiComponentPart020.performAction1332(false);
                                  return;
                                }
                                if (17 == integerLocal4) {
                                  this.performAction0136(-33);
                                  return;
                                }
                                if (integerLocal4 == 18) {
                                  CodecSupport002.performAction1251(27721);
                                  return;
                                }
                                NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "MGS1: " + BufferedSocket.computeString1563((byte) 52));
                                NodeHashTable.performAction1703(65);
                                return;
                              }
                              stackIntegerLocal1 = 0;
                              stackBooleanLocal2 = (integerLocal4 == 12);
                              mixedSupport056Local6 = NetworkSupport005.computeMixedSupport0561024(stackIntegerLocal1, stackBooleanLocal2);
                              MixedSupport020.performAction0319(mixedSupport056Local6, true);
                            }
                          }
                        } else {
                          this.performAction0133(0);
                        }
                      } else {
                        MixedSupport138.performAction1893((byte) 112);
                      }
                    }
                  } else {
                    CollectionSupport001.performAction0337((byte) 53);
                  }
                }
              } else {
                RenderingSupport008.performAction0988((byte) 48);
              }
            } else {
              MixedSupport132.performAction1843((byte) -21);
            }
            return;
          }
          NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "MGS2: " + BufferedSocket.computeString1563((byte) 127));
          NodeHashTable.performAction1703(119);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal3 = caughtParameterLocal8;
          runtimeExceptionLocal5 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal5), "bd.W(" + byteArgument1 + ')');
        }
    }

    private final void performAction0131(byte byteArgument1) {
        try {
          MixedSupport126.booleanArrayState0010[4] = true;
          if (byteArgument1 != -25) {
            this.integerState0059 = 127;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.AA(" + byteArgument1 + ')');
        }
    }

    final void performAction0117(int integerArgument1, int integerArgument2, String stringArgument3) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (integerArgument1 != -2990) {
            this.stringState0042 = (String) null;
          }
          this.performAction0119(integerArgument2, false, 480, 640, stringArgument3);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeException = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("bd.UA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    private final void performAction0118(int integerArgument1, boolean booleanArgument2) {
        try {
          if (integerArgument1 < 70) {
            this.stringState0042 = (String) null;
          }
          MixedSupport126.booleanArrayState0010[0] = true;
          MixedSupport126.booleanArrayState0010[17] = true;
          MixedSupport126.booleanArrayState0010[16] = true;
          MixedSupport126.booleanArrayState0010[7] = true;
          MixedSupport126.booleanArrayState0010[8] = booleanArgument2;
          MixedSupport126.booleanArrayState0010[18] = true;
          MixedSupport126.booleanArrayState0010[3] = true;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.SA(" + integerArgument1 + ',' + booleanArgument2 + ')');
        }
    }

    private final int computeInteger0134(int integerArgument1) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        try {
          if (this.booleanState0071) {
            stackIntegerLocal1 = -1;
            return stackIntegerLocal1;
          }
          if (!RichTextLayout.computeBoolean0436((byte) -38)) {
            stackIntegerLocal2 = -1;
            return stackIntegerLocal2;
          }
          if (ResourceSupport003.booleanState0126) {
            stackIntegerLocal3 = -1;
            return stackIntegerLocal3;
          }
          integerLocal8 = MixedSupport123.computeInteger1751(MixedSupport002.computeString0026(integerArgument1 - 68), this.booleanState0008, MixedSupport101.computeString1390(2), (byte) 55, this.integerState0056, true);
          if (-1 == integerLocal8) {
            stackIntegerLocal4 = -1;
            return stackIntegerLocal4;
          }
          if (0 != integerLocal8 &&
            integerLocal8 != 1) {
            if (!CodecSupport001.booleanState0102) {
              this.performAction0760(true, "reconnect");
            }
            MixedSupport048.performAction0645(false);
            NetworkSupport003.performAction0377(UiComponentPart028.stringState0483, integerArgument1 ^ integerArgument1, integerLocal8);
            ResourceSupport003.booleanState0126 = true;
            MixedSupport079.longState0026 = 15000L + MixedSupport063.computeLong0827(4);
            stackIntegerLocal6 = integerLocal8;
            return stackIntegerLocal6;
          }
          if (MixedSupport052.integerState0269 == 11 &&
            SceneWidgetPart010.integerState0722 == 0) {
            InputAdapter004.performAction1234(1);
          }
          stackIntegerLocal5 = integerLocal8;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal7 = caughtParameterLocal10;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal9), "bd.PA(" + integerArgument1 + ')');
        }
    }

    final static void performAction0115(int integerArgument1, int integerArgument2) {
        if (integerArgument2 != -27096) {
          return;
        }
        try {
          MixedSupport138.longState0051 = 1000000000L / (long)integerArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.CA(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final void performAction0116(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, boolean booleanArgument8) {
        java.awt.Frame frameLocal1 = new java.awt.Frame("Jagex");
        frameLocal1.pack();
        frameLocal1.dispose();
        this.setBackground(java.awt.Color.black);
        if (integerArgument2 <= 2) {
          return;
        }
        try {
          RenderingSupport007.integerState0360 = this.integerState0060;
          Sprite.performAction1055(RenderingSupport007.integerState0360, true);
          MixedSupport064.performAction0851(integerArgument3, this.integerState0055, CodecSupport001.platformServiceState0003, 5000, 5000, this.longState0002, RenderingSupport007.integerState0360, booleanArgument8, this.integerState0059, this.integerState0058, this.booleanState0007, true, this.integerState0057, this.stringState0042);
          UiComponent.performAction0231(this.integerState0058, this.integerState0055, RenderingSupport007.integerState0360, integerArgument3, this.integerState0057, this.stringState0042, CodecSupport001.platformServiceState0003, 0, this.integerState0059);
          MixedSupport028.performAction0441(120);
          MixedSupport134.inputAdapter003State0001 = UiComponentPart030.computeInputAdapter0031764(-22);
          MixedSupport056.performAction0747(GameDomainSupport004.canvasState0001, (byte) -71);
          MixedSupport049.integerState0262 = integerArgument1;
          MixedSupport001.integerState0014 = integerArgument7;
          MixedSupport146.integerState0856 = integerArgument4;
          RenderingSupport002.integerState0112 = integerArgument5;
          ReturnedShape.integerState0697 = integerArgument6;
          this.performAction0125(true);
          NetworkSupport008.performAction1341((byte) 13);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.TA(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + booleanArgument8 + ')');
        }
    }

    private final void performAction0137(int integerArgument1) {
        try {
          MixedSupport126.booleanArrayState0010[1] = true;
          if (integerArgument1 != -1) {
            this.integerState0060 = 49;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.IA(" + integerArgument1 + ')');
        }
    }

    final void performAction0122(boolean booleanArgument1, boolean booleanArgument2, boolean booleanArgument3, boolean booleanArgument4, boolean booleanArgument5, boolean booleanArgument6, boolean booleanArgument7) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          this.performAction0118(77, true);
          if (booleanArgument1) {
            this.performAction0137(-1);
          }
          if (booleanArgument3) {
            this.performAction0135(7);
          }
          if (booleanArgument4) {
            return;
          }
          if (booleanArgument6) {
            this.performAction0131((byte) -25);
          }
          if (booleanArgument7) {
            this.performAction0124((byte) 87);
          }
          if (booleanArgument5) {
            this.performAction0132(-1);
          }
          if (booleanArgument2) {
            this.performAction0127((byte) 13);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "bd.JA(" + booleanArgument1 + ',' + booleanArgument2 + ',' + booleanArgument3 + ',' + booleanArgument4 + ',' + booleanArgument5 + ',' + booleanArgument6 + ',' + booleanArgument7 + ')');
        }
    }

    private final void performAction0119(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, String stringArgument5) {
        boolean stackBooleanLocal1 = false;
        Object stackObjectLocal2;
        String stackStringLocal3;
        int stackIntegerLocal4;
        int stackIntegerLocal5;
        Object stackObjectLocal6;
        boolean stackBooleanLocal7;
        boolean stackBooleanLocal8 = false;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        Throwable caughtExceptionLocal12 = null;
        String stringLocal13 = null;
        Exception exceptionLocal14 = null;
        RuntimeException runtimeExceptionLocal15 = null;
        String stringLocal16 = null;
        String stringLocal17 = null;
        String stringLocal18 = null;
        String stringLocal19 = null;
        try {
          try {
            if (!this.computeBoolean0755((byte) -29)) {
              return;
            }
            this.stringState0042 = this.getCodeBase().getHost();
            stringLocal13 = this.stringState0042.toLowerCase();
            stackBooleanLocal1 = (stringLocal13.equals("jagex.com")) || (stringLocal13.endsWith(".jagex.com"));
            this.booleanState0008 = stackBooleanLocal1;
            this.integerState0057 = Integer.parseInt(this.getParameter("gameport1"));
            this.integerState0058 = Integer.parseInt(this.getParameter("gameport2"));
            stringLocal16 = this.getParameter("servernum");
            if (stringLocal16 != null) {
              this.integerState0059 = Integer.parseInt(stringLocal16);
            }
            this.integerState0055 = Integer.parseInt(this.getParameter("gamecrc"));
            this.longState0002 = Long.parseLong(this.getParameter("instanceid"));
            this.booleanState0007 = this.getParameter("member").equals("yes");
            stringLocal17 = this.getParameter("lang");
            if (stringLocal17 != null) {
              this.integerState0060 = Integer.parseInt(stringLocal17);
            }
            if (5 <= this.integerState0060) {
              this.integerState0060 = 0;
            }
            stringLocal18 = this.getParameter("affid");
            if (stringLocal18 != null) {
              this.integerState0056 = Integer.parseInt(stringLocal18);
            }
            MixedSupport098.booleanState0131 = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            if (booleanArgument2) {
              return;
            }
            stackObjectLocal2 = this;
            stackStringLocal3 = (String) (stringArgument5);
            stackIntegerLocal4 = 32;
            stackIntegerLocal5 = integerArgument1;
            if (booleanArgument2) {
              stackObjectLocal6 = this;
              stackBooleanLocal7 = false;
            } else {
              stackObjectLocal6 = this;
              stackBooleanLocal7 = true;
            }
            this.performAction0756(stackStringLocal3, stackIntegerLocal4, stackIntegerLocal5, stackBooleanLocal7, integerArgument3, integerArgument4, this.integerState0055);
          } catch (java.lang.Exception caughtParameterLocal20) {
            caughtExceptionLocal12 = caughtParameterLocal20;
            exceptionLocal14 = (Exception) (Object) caughtExceptionLocal12;
            stringLocal19 = (String) null;
            NetworkArchiveRequestManager.performAction1468((Throwable) ((Object) exceptionLocal14), 16408, (String) null);
            stackBooleanLocal8 = !(booleanArgument2);
            this.performAction0760(stackBooleanLocal8, "crash");
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal21) {
          caughtExceptionLocal12 = caughtParameterLocal21;
          runtimeExceptionLocal15 = (RuntimeException) (Object) caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal15;
          stackStringBuilderLocal10 = new StringBuilder().append("bd.VA(").append(integerArgument1).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (stringArgument5 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    final static boolean computeBoolean0126(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        try {
          integerLocal2 = -5 % ((byteArgument1 + 47) / 44);
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal1 = caughtParameterLocal4;
          runtimeExceptionLocal3 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal3), "bd.OA(" + byteArgument1 + ')');
        }
    }

    private final void performAction0136(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        byte[] byteArrayLocal8 = null;
        try {
          integerLocal2 = 105 / ((integerArgument1 - 27) / 38);
          integerLocal1 = UiComponentPart006.cipherPacketBufferState0001.computeInteger2085((byte) -124);
          stackIntegerLocal3 = ((integerLocal1 & 1) == 0) ? 0 : 1;
          integerLocal6 = stackIntegerLocal3;
          integerLocal7 = NetworkSupport012.integerState0759 - 1;
          byteArrayLocal8 = new byte[integerLocal7];
          UiComponentPart006.cipherPacketBufferState0001.performAction1859(-67, byteArrayLocal8, integerLocal7, 0);
          NetworkSupport002.performAction0190((byte) 84, MixedSupport110.computeString1552(byteArrayLocal8, 2), integerLocal6 != 0, UiComponentPart029.computeApplet1689(25144));
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal4 = caughtParameterLocal9;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal5), "bd.FA(" + integerArgument1 + ')');
        }
    }

    private final void performAction0135(int integerArgument1) {
        if (integerArgument1 != 7) {
          return;
        }
        try {
          MixedSupport126.booleanArrayState0010[2] = true;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.DA(" + integerArgument1 + ')');
        }
    }

    final int computeInteger0129(byte byteArgument1) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException caughtExceptionLocal4 = null;
        try {
          integerLocal1 = this.computeInteger0134(-1);
          if (byteArgument1 <= 122) {
            this.integerState0058 = -122;
          }
          if (0 == integerLocal1 ||
            integerLocal1 == 1) {
            if (MixedSupport126.booleanArrayState0010[1]) {
              UiComponentPart026.performAction1581(-20494, 2);
            }
            if (MixedSupport126.booleanArrayState0010[2]) {
              CollectionSupport002.performAction0396(-111, 3);
            }
            if (MixedSupport126.booleanArrayState0010[3]) {
              ResourceSupport003.performAction1335(false, 4);
            }
            if (MixedSupport126.booleanArrayState0010[4]) {
              MixedSupport150.performAction2007(3, 5);
            }
            if (MixedSupport126.booleanArrayState0010[5]) {
              HashNode.performAction0157(6, -120);
            }
            if (MixedSupport126.booleanArrayState0010[6]) {
              UiComponentPart009.performAction0414(640, 7);
            }
            if (MixedSupport126.booleanArrayState0010[8]) {
              MixedSupport045.performAction0615((byte) -112);
            }
          }
          stackIntegerLocal3 = integerLocal1;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal5) {
          caughtExceptionLocal4 = caughtParameterLocal5;
          runtimeExceptionLocal2 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "bd.BA(" + byteArgument1 + ')');
        }
    }

    private final void performAction0125(boolean booleanArgument1) {
        MixedSupport086.integerArrayState0158[18] = 1;
        MixedSupport086.integerArrayState0158[4] = -1;
        MixedSupport086.integerArrayState0158[13] = -1;
        MixedSupport086.integerArrayState0158[8] = -2;
        MixedSupport086.integerArrayState0158[2] = -2;
        MixedSupport086.integerArrayState0158[1] = 16;
        if (!booleanArgument1) {
          return;
        }
        try {
          MixedSupport086.integerArrayState0158[11] = -1;
          MixedSupport086.integerArrayState0158[7] = -1;
          MixedSupport086.integerArrayState0158[3] = -1;
          MixedSupport086.integerArrayState0158[6] = -2;
          MixedSupport086.integerArrayState0158[9] = -1;
          MixedSupport086.integerArrayState0158[5] = -1;
          MixedSupport086.integerArrayState0158[17] = -1;
          MixedSupport086.integerArrayState0158[12] = -1;
          MixedSupport086.integerArrayState0158[10] = -1;
          MixedSupport086.integerArrayState0158[16] = -1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bd.LA(" + booleanArgument1 + ')');
        }
    }

    protected FunOrbClient() {
    }

    static {
    }
}
