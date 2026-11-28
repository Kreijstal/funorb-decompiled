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

    private final void initializeAssetArchives(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (null != GameDomainSupport006.resourceArchiveState0027) {
            GameAssets.performAction1496(false, GameDomainSupport006.resourceArchiveState0027);
            GameDomainSupport006.resourceArchiveState0027 = null;
            NodeDeque.performAction1737(true);
          }
          MixedSupport123.performAction1616((byte) -81);
          MixedSupport020.resourceArchiveState0003 = MixedSupport138.computeResourceArchive1719(3, 21);
          BirthDateInput.resourceArchiveState0024 = MixedSupport138.computeResourceArchive1719(4, 44);
          EmailFormatValidator.resourceArchiveState0008 = MixedSupport138.computeResourceArchive1719(6, 39);
          MixedSupport031.resourceArchiveState0005 = MixedSupport138.computeResourceArchive1719(11, 102);
          StandardContentDialog.resourceArchiveState0015 = MixedSupport138.computeResourceArchive1719(7, 50);
          ThemeTips.resourceArchiveState0009 = MixedSupport138.computeResourceArchive1719(8, 113);
          MixedSupport005.resourceArchiveState0001 = MixedSupport138.computeResourceArchive1719(9, integerArgument1 ^ 24867);
          MouseInput.resourceArchiveState0026 = MixedSupport138.computeResourceArchive1719(10, integerArgument1 ^ 24938);
          GameAssets.mixedSupport014State0001 = new MixedSupport014(65);
          GameAssets.mixedSupport014State0001.performAction0196("basic", MixedSupport005.resourceArchiveState0002, MixedSupport013.stringState0064, (byte) 95, MixedSupport086.stringState0365);
          GameAssets.mixedSupport014State0001.performAction0196("arial13", MixedSupport005.resourceArchiveState0002, MixedSupport133.stringState0574, (byte) 112, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("arial13", GameSession.resourceArchiveState0019, MixedSupport133.stringState0574, (byte) 106, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("arialbold14", MixedSupport005.resourceArchiveState0002, MixedSupport133.stringState0574, (byte) -97, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("arialbold14", GameSession.resourceArchiveState0019, MixedSupport133.stringState0574, (byte) 94, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0196("lobby", MixedSupport005.resourceArchiveState0002, MixedSupport013.stringState0064, (byte) -21, MixedSupport086.stringState0365);
          GameAssets.mixedSupport014State0001.performAction0196("lobby", GameSession.resourceArchiveState0019, MixedSupport133.stringState0574, (byte) 87, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0194(ProxySocketFactory.stringState0495, (byte) 122, ThemeTips.resourceArchiveState0009, LoginPanel.stringState0224);
          GameAssets.mixedSupport014State0001.performAction0194(ProxySocketFactory.stringState0495, (byte) -109, MixedSupport005.resourceArchiveState0001, LoginPanel.stringState0224);
          if (integerArgument1 != 24903) {
            DekoBlokoClient.getEmailValidationError((String) null, -14);
          }
          GameAssets.mixedSupport014State0001.performAction0194(MixedSupport123.stringState0539, (byte) 51, MouseInput.resourceArchiveState0026, AgeValidator.stringState0305);
          GameAssets.mixedSupport014State0001.performAction0196("", EmailFormatValidator.resourceArchiveState0008, MixedSupport013.stringState0064, (byte) 102, MixedSupport086.stringState0365);
          GameAssets.mixedSupport014State0001.performAction0196("", StandardContentDialog.resourceArchiveState0015, MixedSupport133.stringState0574, (byte) -107, Js5ArchiveManager.stringState0361);
          GameAssets.mixedSupport014State0001.performAction0194(MixedSupport103.stringState0436, (byte) -121, MixedSupport031.resourceArchiveState0005, MixedSupport045.stringState0192);
          GameAssets.mixedSupport014State0001.performAction0194(SceneWidgetPart001.stringState0058, (byte) 114, MixedSupport020.resourceArchiveState0003, MixedSupport010.stringState0048);
          GameAssets.mixedSupport014State0001.performAction0194(SceneWidgetPart001.stringState0058, (byte) -45, BirthDateInput.resourceArchiveState0024, MixedSupport010.stringState0048);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal2), "client.V(" + integerArgument1 + ')');
        }
    }

    final static EmailValidationError getEmailValidationError(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        String stringLocal4 = null;
        EmailValidationError emailValidationErrorLocal5 = null;
        EmailValidationError stackEmailValidationErrorLocal6 = null;
        EmailValidationError stackEmailValidationErrorLocal7 = null;
        EmailValidationError stackEmailValidationErrorLocal8 = null;
        EmailValidationError stackEmailValidationErrorLocal9 = null;
        EmailValidationError stackEmailValidationErrorLocal10 = null;
        RuntimeException stackRuntimeExceptionLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        try {
          if (stringArgument1 != null &&
            0 != stringArgument1.length()) {
            integerLocal1 = stringArgument1.indexOf('@');
            if (-1 == integerLocal1) {
              stackEmailValidationErrorLocal7 = MouseWheelInput.emailValidationErrorState0004;
              return stackEmailValidationErrorLocal7;
            }
            stringLocal3 = stringArgument1.substring(0, integerLocal1);
            stringLocal4 = stringArgument1.substring(1 + integerLocal1);
            if (integerArgument2 != -12828) {
              stackEmailValidationErrorLocal8 = (EmailValidationError) null;
              return stackEmailValidationErrorLocal8;
            }
            emailValidationErrorLocal5 = MixedSupport086.computeEmailValidationError1107(integerArgument2 + 12827, stringLocal3);
            if (null != emailValidationErrorLocal5) {
              stackEmailValidationErrorLocal9 = emailValidationErrorLocal5;
              return stackEmailValidationErrorLocal9;
            }
            stackEmailValidationErrorLocal10 = MixedSupport022.computeEmailValidationError0328(stringLocal4, -2734);
            return stackEmailValidationErrorLocal10;
          }
          stackEmailValidationErrorLocal6 = Framebuffer.emailValidationErrorState0002;
          return stackEmailValidationErrorLocal6;
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal11), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(integerArgument2).append(')').toString());
        }
    }

    private final void updateGameAndNetworkState(byte byteArgument1) {
        PlayerBoardUpdateQueue cachedMixedSupport075Local1 = null;
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
        ReturnedShapeUpdate mixedSupport142Local33 = null;
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
              if (AgeValidator.integerState0361 < 15 &&
                MixedSupport065.integerState0347 < 15 &&
                8 > MixedSupport006.integerState0039) {
                MixedSupport006.integerState0039 = MixedSupport006.integerState0039 + 1;
              }
              if (15 < AgeValidator.integerState0361 &&
                MixedSupport065.integerState0347 > 15 &&
                MixedSupport006.integerState0039 > 1) {
                MixedSupport006.integerState0039 = MixedSupport006.integerState0039 - 1;
              }
              ResourceSupport003.integerState0553 = 50;
              AgeValidator.integerState0361 = MixedSupport065.integerState0347;
              if (integerLocal51 != 0) {
                MixedSupport006.integerState0039 = 1;
              }
            }
          } else {
            MixedSupport006.integerState0039 = 1;
          }
          MixedSupport042.computeInteger0533((byte) -108);
          MixedSupport101.integerState0589 = Js5ArchiveManager.computeInteger1099((byte) -40);
          if (MixedSupport112.booleanState0166 &&
            null != AccountCreationResultPanel.midiSynthesizerState0001) {
            AccountCreationResultPanel.midiSynthesizerState0001.performAction0686(DefaultTextWidgetRenderer.integerState0011 * 50 / 128);
            MixedSupport112.booleanState0166 = false;
          }
          if (MixedSupport020.fullscreenCanvasState0001 != null &&
            MixedSupport020.fullscreenCanvasState0001.booleanState0156) {
            MixedSupport118.performAction1548(false);
            SceneWidgetPart008.performAction1128(54);
          }
          stackBooleanLocal2 = (null != MixedSupport020.fullscreenCanvasState0001);
          this.serviceFramework(stackBooleanLocal2, -11);
          if (ResourceSupport003.booleanState0127) {
            this.initializeAssetArchives(24903);
            ResourceSupport003.booleanState0127 = false;
          }
          CipherPacketBuffer.integerState0799 = CipherPacketBuffer.integerState0799 + 1;
          if (MixedSupport119.computeBoolean1560((byte) -104)) {
            this.updateLoginFlow(10);
            if (MixedSupport119.computeBoolean1560((byte) -93)) {
              return;
            }
          }
          boolean frameRemainderLocal52 = true;
          if (!GameAssets.booleanState0176) {
            FullscreenCanvas.performAction1381(HuffmanCodec.integerState0353, (byte) -115);
            frameRemainderLocal52 = !(!this.advanceGameAssetLoading(0));
            if (frameRemainderLocal52) {
              GameAssets.booleanState0176 = true;
              frameRemainderLocal52 = (integerLocal51 != 0);
            }
          }
          if (frameRemainderLocal52) {
            if (DraggableWidgetContainer.computeBoolean1486(-1)) {
              if (!UiComponentPart001.computeBoolean0059((byte) -127)) {
                if (!TextHotspotBounds.computeBoolean1256(65)) {
                  if (DisplayNameSelectionPanel.computeBoolean0321((byte) 123)) {
                    if (SceneWidgetPart002.integerState0241 != SceneWidgetPart002.integerState0249) {
                      this.updateScreensAndTransitions(30661, false);
                      frameRemainderLocal52 = (integerLocal51 != 0);
                    }
                    if (frameRemainderLocal52) {
                      integerLocal25 = SocketFactory.computeInteger1794(false);
                      if (integerLocal25 == 1) {
                        ValidatedTextField.performAction1167(CacheWorkQueue.booleanState0079, MixedSupport037.integerState0224, true);
                      }
                      this.updateScreensAndTransitions(30661, true);
                      frameRemainderLocal52 = (integerLocal51 != 0);
                    }
                  }
                  if (frameRemainderLocal52) {
                    this.updateScreensAndTransitions(30661, false);
                    frameRemainderLocal52 = (integerLocal51 != 0);
                  }
                }
                if (frameRemainderLocal52) {
                  stackBooleanLocal3 = (null != MixedSupport020.fullscreenCanvasState0001);
                  integerLocal25 = this.computeInteger0109(stackBooleanLocal3, (byte) 102);
                  if (1 == integerLocal25 ||
                    2 == integerLocal25) {
                    if (MixedSupport020.fullscreenCanvasState0001 != null) {
                      MixedSupport118.performAction1548(false);
                    }
                    if (integerLocal25 == 2) {
                      TextHotspotBounds.performAction1252((byte) -17, DraggableWidgetContainer.computeApplet1485(25144));
                    }
                  }
                  this.updateScreensAndTransitions(30661, true);
                  frameRemainderLocal52 = (integerLocal51 != 0);
                }
              }
              if (frameRemainderLocal52) {
                if (~SceneWidgetPart002.integerState0241 != ~SceneWidgetPart002.integerState0249) {
                  this.updateScreensAndTransitions(30661, false);
                  frameRemainderLocal52 = (integerLocal51 != 0);
                }
                if (frameRemainderLocal52) {
                  integerLocal25 = MixedSupport123.computeInteger1615((byte) -117);
                  switch (integerLocal25) {
                    case 2:
                      MixedSupport118.performAction1548(false);
                    default:
                      break;
                    case 4:
                      ValidatedTextField.performAction1167(true, 3, true);
                      if (integerLocal51 == 0) {
                        break;
                      }
                    case 3:
                      HuffmanCodec.performAction0823(2, true);
                      break;
                  }
                  this.updateScreensAndTransitions(30661, true);
                  if (integerLocal51 != 0) {
                    MixedSupport023.performAction0338(-60);
                  }
                }
              }
            } else {
              MixedSupport023.performAction0338(-60);
            }
          }
          if (!StandardContentDialog.computeBoolean1242(-30146)) {
            scanLoop1: while (true) {
              objectLocal26 = (NetworkSupport005) (NodeHashTable.nodeDequeState0031.removeLast(4));
              if (objectLocal26 != null) {
                UiComponent.performAction0216(4, (NetworkSupport005) (objectLocal26), -697);
                if (integerLocal51 != 0) {
                  break;
                }
                continue;
              }
              do {
                objectLocal26 = (MixedSupport038) (PlayerNameAvailabilityValidator.nodeDequeState0011.removeLast(4));
                if (objectLocal26 == null) {
                  if (integerLocal51 == 0) {
                    break scanLoop1;
                  }
                } else {
                  GameDomainSupport006.performAction1824(3, 5, (MixedSupport038) (objectLocal26));
                }
              } while (integerLocal51 == 0);
              break scanLoop1;
            }
          }
          scanLoop2: while (true) {
            stackBooleanLocal4 = MixedSupport140.computeBoolean1728(ByteStorage.integerArrayState0158, 0);
            while (true) {
              if (stackBooleanLocal4) {
                stackIntegerLocal19 = ~HashNode.integerState0070;
                stackIntegerLocal20 = -10;
                if (integerLocal51 == 0) {
                  if (stackIntegerLocal19 == stackIntegerLocal20) {
                    MixedSupport083.booleanState0118 = false;
                    objectLocal26 = LabeledWidgetContainer.cipherPacketBufferState0001.readNullTerminatedString((byte) -38);
                    AccountCreationResultPanel.performAction1814(1, -86, false, 0, true, (String) (objectLocal26));
                    continue scanLoop2;
                  }
                  if (77 == HashNode.integerState0070) {
                    MixedSupport083.booleanState0118 = false;
                    BirthDateTextFields.performAction1277(true, false, true);
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 14) {
                    SocketFactory.performAction1792((byte) 66);
                    MixedSupport016.performAction0205(true);
                    SecondaryNodeHashTable.performAction1119(DropTargetWidgetContainer.computeSceneWidget0706(8192), MixedSupport108.computeSceneWidget1421(-95), 0, 5, ArrayWidgetContainer.roundUpPowerOfTwo(-10498, 2000), RichTextWidget.computeSceneWidget1365((byte) 117), Bzip2State.byteArrayState0040, 150, ArrayWidgetContainer.roundUpPowerOfTwo(-10498, 8), 1024);
                    SecondaryNodeDequeIterator.performAction0362(21014, SceneWidgetPart011.computeSceneWidget1575((byte) 98), MixedSupport073.computeSceneWidget0919(-126));
                    ProgressMessageDialog.booleanState0059 = true;
                    IterableNodeCollection.booleanState0193 = true;
                    MixedSupport083.booleanState0118 = false;
                    objectLocal26 = MixedSupport063.integerArrayState0111;
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
                      MixedSupport069.performAction0903(true);
                      ComponentContainer.renderingSupport007State0006 = MixedSupport033.computeRenderingSupport0070497(false, false, 0, false, false, 32357, false, false);
                      MixedSupport023.performAction0341(false, 126);
                      MixedSupport133.performAction1677((byte) -124);
                      MixedSupport043.booleanState0049 = false;
                      MixedSupport034.booleanState0042 = false;
                      MixedSupport046.booleanState0053 = true;
                      IterableNodeCollection.booleanState0193 = false;
                      LoginCredentials.performAction0788(-48);
                    }
                    MixedSupport083.booleanState0118 = false;
                    GameDomainSupport006.booleanState0227 = false;
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 10 &&
                    IterableNodeCollection.booleanState0193) {
                    RenderingSupport007.performAction0843((byte) 113);
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 75) {
                    objectLocal26 = UiComponentPart002.computeIntegerArray0082(-123);
                    objectLocal28 = objectLocal26;
                    objectLocal29 = LabeledWidgetContainer.cipherPacketBufferState0001;
                    integerLocal31 = ((PacketBuffer) (objectLocal29)).readUnsignedByte((byte) -45);
                    integerLocal34 = 0;
                    scanLoop3: while (true) {
                      if (integerLocal34 < integerLocal31) {
                        ((int[]) (objectLocal28))[integerLocal34] = ((PacketBuffer) (objectLocal29)).readInt(7553);
                        integerLocal34++;
                        continue;
                      }
                      if (!SceneWidgetPart008.booleanState0123) {
                        break scanLoop3;
                      }
                      objectLocal28 = objectLocal26;
                      objectLocal29 = MixedSupport088.integerArrayState0172;
                      integerLocal31 = 0;
                      while (integerLocal31 < 8) {
                        ((int[]) (objectLocal28))[integerLocal31] = PlayerBoardUpdateQueue.bitwiseAnd(((int[]) (objectLocal28))[integerLocal31], ~((int[]) (objectLocal29))[integerLocal31]);
                        integerLocal31++;
                      }
                      if (null != ComponentContainer.gameSessionState0002 &&
                        ComponentContainer.gameSessionState0002.mixedSupport028State0001.bucketBoardArrayState0001[ComponentContainer.gameSessionState0002.integerState0612] != null) {
                        integerLocal27 = 0;
                        while (integerLocal27 < 31) {
                          stackBooleanLocal4 = MixedSupport107.computeBoolean1404(-18, integerLocal27, (int[]) (objectLocal26));
                          if (stackBooleanLocal4) {
                            ComponentContainer.gameSessionState0002.mixedSupport028State0001.bucketBoardArrayState0001[ComponentContainer.gameSessionState0002.integerState0612].nodeDequeState0017.addFirst(new MixedSupport136(integerLocal27), 2777);
                          }
                          integerLocal27++;
                        }
                      }
                      objectLocal28 = MixedSupport063.integerArrayState0111;
                      objectLocal29 = objectLocal26;
                      integerLocal31 = 0;
                      while (integerLocal31 < 8) {
                        ((int[]) (objectLocal28))[integerLocal31] = LabeledWidgetContainer.bitwiseOr(((int[]) (objectLocal28))[integerLocal31], ((int[]) (objectLocal29))[integerLocal31]);
                        integerLocal31++;
                      }
                      break;
                    }
                    objectLocal28 = MixedSupport088.integerArrayState0172;
                    objectLocal29 = objectLocal26;
                    integerLocal31 = 0;
                    while (integerLocal31 < 8) {
                      ((int[]) (objectLocal28))[integerLocal31] = LabeledWidgetContainer.bitwiseOr(((int[]) (objectLocal28))[integerLocal31], ((int[]) (objectLocal29))[integerLocal31]);
                      integerLocal31++;
                    }
                    continue scanLoop2;
                  }
                  if (58 == HashNode.integerState0070 ||
                    HashNode.integerState0070 == 59) {
                    integerLocal25 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedShort(3);
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
                    integerLocal41 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedShort(3);
                    integerLocal42 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -92);
                    integerLocal43 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -116);
                    integerLocal44 = LabeledWidgetContainer.cipherPacketBufferState0001.readByte((byte) -100);
                    if (integerLocal44 < 0) {
                      integerLocal44 = -2;
                    }
                    stringArrayLocal45 = new String[integerLocal43];
                    integerLocal46 = 0;
                    while (integerLocal46 < integerLocal43) {
                      stringArrayLocal45[integerLocal46] = LabeledWidgetContainer.cipherPacketBufferState0001.readNullCircumfixedString(true);
                      integerLocal46++;
                    }
                    integerLocal46 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -27);
                    MixedSupport048.mixedSupport072State0001 = null;
                    gameSessionLocal47 = new GameSession(true, integerLocal42, integerLocal36 != 0, integerLocal27, integerLocal30, integerLocal31, integerLocal34, stringArrayLocal45, integerLocal44, integerLocal37 != 0, false, false);
                    gameSessionLocal47.integerState0609 = integerLocal41;
                    gameSessionLocal47.booleanState0143 = integerLocal38 != 0;
                    if (integerLocal38 == 0) {
                      if (integerLocal40 != 0) {
                        gameSessionLocal47.nodeDequeState0024.addFirst(new RenderingSupport006(TextLayout.stringState0083, 10, true), 2777);
                      }
                    } else {
                      gameSessionLocal47.nodeDequeState0024.addFirst(new RenderingSupport006(MixedSupport013.stringState0062, 8, true), 2777);
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
                      MixedSupport028.performAction0400(58);
                    }
                    GameDomainSupport006.booleanState0227 = false;
                    MixedSupport007.booleanState0005 = true;
                    if (integerLocal27 != 10) {
                      musicTrackArrayLocal50 = MixedSupport113.musicTrackArrayArrayState0001[integerLocal42];
                    } else {
                      musicTrackArrayLocal50 = IsaacRandom.musicTrackArrayState0001;
                    }
                    MixedSupport087.performAction1134(gameSessionLocal47.computeInteger1323(true), musicTrackArrayLocal50[0], true);
                    continue scanLoop2;
                  }
                  if (HashNode.integerState0070 == 60) {
                    if (MixedSupport043.booleanState0049 ||
                      MixedSupport034.booleanState0042) {
                      MixedSupport043.booleanState0049 = false;
                      MixedSupport007.booleanState0005 = false;
                      MixedSupport034.booleanState0042 = false;
                      MixedSupport016.performAction0205(true);
                      MixedSupport133.performAction1677((byte) -125);
                      LoginCredentials.performAction0788(-111);
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
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -92);
                      objectLocal29 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      stackObjectLocal13 = objectLocal29;
                      stackBooleanLocal14 = (~integerLocal27 == ~((GameSession) (objectLocal26)).integerState0612);
                      ((BucketBoard) stackObjectLocal13).decodeMultiplayerSnapshot(stackBooleanLocal14, LabeledWidgetContainer.cipherPacketBufferState0001, (byte) 118);
                      ((GameSession) (objectLocal26)).performAction1317(true, (BucketBoard) (objectLocal29), 600, 200, ((BucketBoard) (objectLocal29)).livesRemaining, integerLocal27, false);
                      if (((GameSession) (objectLocal26)).integerState0612 != integerLocal27) {
                        continue scanLoop2;
                      }
                      SocketFactory.cipherPacketBufferState0002.writeCipheredByte(59, -4);
                      SocketFactory.cipherPacketBufferState0002.writeByte(true, ((BucketBoard) (objectLocal29)).pieceAcknowledgement);
                      ((GameSession) (objectLocal26)).integerState0615 = 7 * ((BucketBoard) (objectLocal29)).dominoDescriptor - 4;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 62) {
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -124);
                      integerLocal30 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -116);
                      if (!(((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0173 > integerLocal27) ||
                        ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27] == null) {
                        NetworkArchiveRequestManager.performAction1289((Throwable) null, 16408, "T4: " + integerLocal27);
                        NodeHashTable.performAction1498(85);
                        continue scanLoop2;
                      }
                      bucketBoardLocal32 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      while (true) {
                        if (bucketBoardLocal32.integerState0486 < bucketBoardLocal32.integerState0444) {
                          integerLocal34 = ((GameSession) (objectLocal26)).applyQueuedPlayerBoardUpdate(-117, integerLocal27) ? 1 : 0;
                          stackIntegerLocal15 = integerLocal34;
                          if (stackIntegerLocal15 == 0) {
                            NetworkArchiveRequestManager.performAction1289((Throwable) null, 16408, "T6");
                            NodeHashTable.performAction1498(79);
                            continue scanLoop2;
                          }
                          continue;
                        }
                        break;
                      }
                      ((GameSession) (objectLocal26)).performAction1305(18, bucketBoardLocal32, integerLocal27);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27] = null;
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 & ~(1 << integerLocal27);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0168 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0168 - 1;
                      stackIntegerLocal15 = ((GameSession) (objectLocal26)).integerState0612;
                      if (stackIntegerLocal15 == integerLocal27) {
                        MixedSupport016.performAction0205(true);
                        MixedSupport090.booleanState0124 = true;
                        ((GameSession) (objectLocal26)).performAction1314(MixedSupport110.musicTrackState0006, 0);
                      }
                      ((GameSession) (objectLocal26)).booleanState0143 = false;
                      ContentTransitionDialog.integerState0095 = 1;
                      DiagnosticSupport002.booleanState0082 = false;
                      MixedSupport107.integerState0681 = 0;
                      MixedSupport006.integerState0039 = 1;
                      ((GameSession) (objectLocal26)).integerState0607 = integerLocal30;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 63) {
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -53);
                      integerLocal30 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -118);
                      integerLocal31 = NetworkSupport012.integerState0759 - LabeledWidgetContainer.cipherPacketBufferState0001.position;
                      if (0 > integerLocal31) {
                        NetworkArchiveRequestManager.performAction1289((Throwable) null, 16408, "T8: " + integerLocal27 + " " + integerLocal30 + " " + integerLocal31);
                        NodeHashTable.performAction1498(65);
                        continue scanLoop2;
                      }
                      cipherPacketBufferLocal35 = new CipherPacketBuffer(integerLocal31 + 1);
                      cipherPacketBufferLocal35.writeByte(true, integerLocal30);
                      cipherPacketBufferLocal35.writeBytes(false, integerLocal31, LabeledWidgetContainer.cipherPacketBufferState0001.payload, LabeledWidgetContainer.cipherPacketBufferState0001.position);
                      cipherPacketBufferLocal35.position = 0;
                      ((GameSession) (objectLocal26)).mixedSupport075ArrayState0001[integerLocal27].nodeDequeState0014.addFirst(cipherPacketBufferLocal35, 2777);
                      cachedMixedSupport075Local1 = ((GameSession) (objectLocal26)).mixedSupport075ArrayState0001[integerLocal27];
                      cachedMixedSupport075Local1.integerState0420 = cachedMixedSupport075Local1.integerState0420 + integerLocal30;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 64) {
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -127);
                      objectLocal29 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      mixedSupport142Local33 = new ReturnedShapeUpdate();
                      mixedSupport142Local33.integerState0882 = LabeledWidgetContainer.cipherPacketBufferState0001.readByte((byte) -88);
                      mixedSupport142Local33.integerState0878 = LabeledWidgetContainer.cipherPacketBufferState0001.readByte((byte) -118);
                      mixedSupport142Local33.integerState0876 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -93);
                      mixedSupport142Local33.integerState0881 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -83);
                      mixedSupport142Local33.returnedShapeState0001 = ((GameSession) (objectLocal26)).returnedShapeCache.computeReturnedShape1181(true, true, LabeledWidgetContainer.cipherPacketBufferState0001);
                      mixedSupport142Local33.integerState0879 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -64);
                      ((GameSession) (objectLocal26)).mixedSupport075ArrayState0001[integerLocal27].nodeDequeState0014.addFirst(mixedSupport142Local33, 2777);
                      integerLocal34 = LabeledWidgetContainer.cipherPacketBufferState0001.readVarInt(117);
                      integerLocal36 = LabeledWidgetContainer.cipherPacketBufferState0001.readVarInt(127) + integerLocal34;
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
                            ((GameSession) (objectLocal26)).returnedShapeCache.performAction1179(returnedShapeLocal39, 0);
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
                          integerLocal37 = ((GameSession) (objectLocal26)).applyQueuedPlayerBoardUpdate(-126, integerLocal27) ? 1 : 0;
                          stackIntegerLocal18 = integerLocal37;
                          if (stackIntegerLocal18 == 0) {
                            NetworkArchiveRequestManager.performAction1289((Throwable) null, 16408, "T7");
                            NodeHashTable.performAction1498(97);
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
                      while (mixedSupport142Local33.isLinked((byte) 58)) {
                        ((GameSession) (objectLocal26)).applyQueuedPlayerBoardUpdate(-118, integerLocal27);
                      }
                      SocketFactory.cipherPacketBufferState0002.writeCipheredByte(59, -4);
                      SocketFactory.cipherPacketBufferState0002.writeByte(true, ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27].pieceAcknowledgement);
                      ((GameSession) (objectLocal26)).integerState0601 = 0;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 65) {
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -60);
                      objectLocal29 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      do {
                        integerLocal31 = ((GameSession) (objectLocal26)).applyQueuedPlayerBoardUpdate(-116, integerLocal27) ? 1 : 0;
                      } while (integerLocal31 != 0);
                      if (~((GameSession) (objectLocal26)).integerState0612 == ~integerLocal27) {
                        integerLocal31 = 0;
                        while (!(((BucketBoard) (objectLocal29)).livesRemaining <= integerLocal31)) {
                          MixedSupport039.integerState0232 = MixedSupport039.integerState0232 + 30000;
                          EditableTextField.integerState0716 = EditableTextField.integerState0716 + 30000;
                          integerLocal31++;
                        }
                      }
                      ((BucketBoard) (objectLocal29)).livesRemaining = 0;
                      ((BucketBoard) (objectLocal29)).performAction0990(-9897);
                      ((GameSession) (objectLocal26)).integerState0601 = 0;
                      if (~integerLocal27 != ~((GameSession) (objectLocal26)).integerState0612) {
                        continue scanLoop2;
                      }
                      ((GameSession) (objectLocal26)).nodeDequeState0024.addFirst(new RenderingSupport006(MixedSupport014.stringState0070, 13, true), 2777);
                      ((GameSession) (objectLocal26)).booleanState0142 = true;
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 66) {
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -22);
                      integerLocal30 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -76);
                      bucketBoardLocal32 = ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27];
                      integerLocal34 = 0;
                      while (integerLocal34 < integerLocal30) {
                        bucketBoardLocal32.computeReturnedShape0979(-19939);
                        integerLocal34++;
                      }
                      continue scanLoop2;
                    }
                    if (67 == HashNode.integerState0070) {
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -50);
                      objectLocal29 = ((GameSession) (objectLocal26)).returnedShapeCache.computeReturnedShape1181(true, true, LabeledWidgetContainer.cipherPacketBufferState0001);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal27].performAction0975((ReturnedShape) (objectLocal29), (byte) -121);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 68) {
                      ((GameSession) (objectLocal26)).integerState0607 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -35);
                      ((GameSession) (objectLocal26)).nodeDequeState0024.addFirst(new RenderingSupport006(MixedSupport028.stringState0140, 12, false), 2777);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 69) {
                      ((GameSession) (objectLocal26)).integerState0607 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -78);
                      ((GameSession) (objectLocal26)).booleanState0143 = true;
                      ((GameSession) (objectLocal26)).nodeDequeState0024.addFirst(new RenderingSupport006(MixedSupport013.stringState0062, 8, false), 2777);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 76) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerArrayState0034[((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0167] = LabeledWidgetContainer.cipherPacketBufferState0001.readByte((byte) -89);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0167 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0167 + 1;
                      continue scanLoop2;
                    }
                    if (70 == HashNode.integerState0070) {
                      integerLocal27 = LabeledWidgetContainer.cipherPacketBufferState0001.readByte((byte) -104);
                      integerLocal30 = 0;
                      while (integerLocal30 < ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0173) {
                        stackObjectLocal11 = null;
                        stackObjectLocal12 = objectLocal26;
                        if (stackObjectLocal11 != ((GameSession) (stackObjectLocal12)).mixedSupport028State0001.bucketBoardArrayState0001[integerLocal30]) {
                          while (!((GameSession) (objectLocal26)).mixedSupport075ArrayState0001[integerLocal30].nodeDequeState0014.isEmpty(-24)) {
                            ((GameSession) (objectLocal26)).applyQueuedPlayerBoardUpdate(39, integerLocal30);
                          }
                        }
                        integerLocal30++;
                      }
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.performAction0401(integerLocal27, (byte) -70);
                      ((GameSession) (objectLocal26)).queueMatchResultBanner(100);
                      if (((GameSession) (objectLocal26)).integerState0612 >= 0) {
                        MixedSupport016.performAction0205(true);
                      }
                      if (integerLocal27 < 0 ||
                        ((GameSession) (objectLocal26)).booleanState0142) {
                        ((GameSession) (objectLocal26)).performAction1314(MixedSupport110.musicTrackState0006, 0);
                      } else {
                        ((GameSession) (objectLocal26)).performAction1314(PlayerNamePrompt.musicTrackState0001, 0);
                      }
                      MixedSupport090.booleanState0124 = true;
                      continue scanLoop2;
                    }
                    if (71 == HashNode.integerState0070) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -45);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 72) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0171 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -19);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 73) {
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0169 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -77);
                      continue scanLoop2;
                    }
                    if (HashNode.integerState0070 == 74) {
                      ((GameSession) (objectLocal26)).integerState0613 = LabeledWidgetContainer.cipherPacketBufferState0001.readUnsignedByte((byte) -31);
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0170 & ~((GameSession) (objectLocal26)).integerState0613;
                      ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0169 = ((GameSession) (objectLocal26)).mixedSupport028State0001.integerState0169 & ~((GameSession) (objectLocal26)).integerState0613;
                      continue scanLoop2;
                    }
                    break;
                  }
                  this.dispatchCommonPacket((byte) 126);
                  continue scanLoop2;
                }
              } else {
                AccountCreationResultPanel.performAction1818(4792, 0);
                stackIntegerLocal19 = byteArgument1;
                stackIntegerLocal20 = 49;
              }
              if (stackIntegerLocal19 < stackIntegerLocal20) {
                DekoBlokoClient.getEmailValidationError((String) null, 33);
              }
              if (null != GameDomainSupport003.rgbSpriteState0020 &&
                AlphaWidgetContainer.integerState0188 <= 0) {
                stackIntegerLocal21 = 0;
              } else {
                stackIntegerLocal21 = 1;
              }
              integerLocal25 = stackIntegerLocal21;
              if (MixedSupport043.booleanState0049) {
                integerLocal25 = SecondaryNodeHashTable.booleanState0122 ? 1 : 0;
              }
              if (MixedSupport034.booleanState0042) {
                integerLocal25 = ValidatedTextField.booleanState0128 ? 1 : 0;
              }
              if (integerLocal25 != 0) {
                MixedSupport010.integerState0067 = 0;
              }
              if (RichTextLayout.computeBoolean0398((byte) -60)) {
                integerLocal27 = this.reconnectAndResendRequests((byte) 125);
                if (integerLocal27 == 0 ||
                  integerLocal27 == 1) {
                  if (1 != integerLocal27) {
                    if (IterableNodeCollection.booleanState0193) {
                      MixedSupport133.performAction1677((byte) -123);
                      MixedSupport046.booleanState0053 = true;
                      if (MixedSupport043.booleanState0049) {
                        AccountCreationResultPanel.performAction1814(1, -99, false, 0, true, MixedSupport004.stringState0017);
                      }
                      ComponentContainer.renderingSupport007State0006 = MixedSupport033.computeRenderingSupport0070497(false, false, 0, false, false, 32357, false, false);
                      MixedSupport023.performAction0341(false, 96);
                      IterableNodeCollection.booleanState0193 = false;
                      MixedSupport043.booleanState0049 = false;
                      MixedSupport034.booleanState0042 = false;
                      LoginCredentials.performAction0788(-100);
                      MixedSupport007.booleanState0005 = false;
                    }
                    GameDomainSupport006.booleanState0227 = false;
                    MixedSupport083.booleanState0118 = false;
                    if (integerLocal51 != 0) {
                      GameDomainSupport006.booleanState0227 = true;
                      MixedSupport083.booleanState0118 = true;
                    }
                  } else {
                    GameDomainSupport006.booleanState0227 = true;
                    MixedSupport083.booleanState0118 = true;
                  }
                }
                integerLocal30 = 0;
                if (integerLocal27 == 2) {
                  integerLocal30 = 1;
                }
                if (IterableNodeCollection.booleanState0193 ||
                  MixedSupport083.booleanState0118 ||
                  GameDomainSupport006.booleanState0227) {
                  integerLocal30 = 1;
                }
                if (!RichTextLayout.computeBoolean0398((byte) -88)) {
                  integerLocal30 = 0;
                }
                if (integerLocal30 != 0) {
                  MixedSupport048.performAction0583(false);
                }
              }
              ResourceSupport003.performAction1164(0);
              if (GameAssets.booleanState0176 &&
                !MixedSupport007.booleanState0005 &&
                LoginCredentials.musicTrackState0004 != PcmPlayerService.musicTrackState0005) {
                MixedSupport087.performAction1134(256, LoginCredentials.musicTrackState0004, true);
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException caughtParameterLocal53) {
          caughtExceptionLocal22 = caughtParameterLocal53;
          runtimeExceptionLocal24 = caughtExceptionLocal22;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal24), "client.Q(" + byteArgument1 + ')');
        }
    }

    public static void clearDekoBlokoGlobals(byte byteArgument1) {
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal2), "client.U(" + byteArgument1 + ')');
        }
    }

    public DekoBlokoClient() {
    }

    final void prepareGameShutdown(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (SceneWidgetNode.pcmPlayerState0002 != null) {
            SceneWidgetNode.pcmPlayerState0002.dispose();
          }
          if (integerArgument1 != 0) {
            return;
          }
          if (null != MixedSupport019.pcmPlayerState0001) {
            MixedSupport019.pcmPlayerState0001.dispose();
          }
          if (null != MixedSupport020.fullscreenCanvasState0001) {
            MixedSupport118.performAction1548(false);
          }
          SceneWidgetPart010.performAction1468((byte) 88);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal2), "client.I(" + integerArgument1 + ')');
        }
    }

    private final void updateScreensAndTransitions(int integerArgument1, boolean booleanArgument2) {
        RenderingSupport007 stackRenderingSupport007Local1 = null;
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
            if (LobbyRoomRow.integerState0847 == SceneWidgetPart002.integerState0249) {
              ReturnedShape.integerState0694 = ReturnedShape.integerState0694 + 1;
              if (ReturnedShape.integerState0694 != 16) {
                return;
              }
              if (!CacheWorkQueue.booleanState0079) {
                MixedSupport029.performAction0406(integerArgument1 - 30553);
                if (integerLocal17 != 0) {
                  MixedSupport047.performAction0574((byte) -126);
                }
              } else {
                MixedSupport047.performAction0574((byte) -126);
              }
              SceneWidgetPart002.integerState0249 = ValidationStatusIcon.integerState0238;
              if (integerLocal17 == 0) {
                return;
              }
            }
            if (~SceneWidgetPart002.integerState0249 != ~ValidationStatusIcon.integerState0238) {
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
            if (!StandardContentDialog.computeBoolean1242(-30146)) {
              if (null != MixedSupport048.mixedSupport072State0001) {
                NetworkArchiveRequestManager.performAction1287(3, (byte) 85, MixedSupport048.mixedSupport072State0001);
              }
              InteractiveComponent.performAction0465(integerArgument1 - 31870);
              if (1 != MixedSupport037.integerState0224) {
                if (2 != MixedSupport037.integerState0224) {
                  if (MixedSupport037.integerState0224 != 3) {
                    if (MixedSupport037.integerState0224 == 4) {
                      MixedSupport023.performAction0341(false, integerArgument1 - 30547);
                      frameRemainderLocal21 = (integerLocal17 != 0);
                    }
                    if (frameRemainderLocal21) {
                      if (MixedSupport037.integerState0224 != 5) {
                        if (MixedSupport037.integerState0224 == 6) {
                          MixedSupport020.renderingSupport007State0003 = MixedSupport105.computeRenderingSupport0071369(-44, false);
                          frameRemainderLocal21 = (integerLocal17 != 0);
                        }
                        if (frameRemainderLocal21) {
                          if (MixedSupport037.integerState0224 != 8) {
                            if (7 != MixedSupport037.integerState0224) {
                              throw new IllegalStateException(Integer.toString(MixedSupport037.integerState0224));
                            }
                            ContentTransitionDialog.renderingSupport007State0002 = NetworkSupport009.computeRenderingSupport0071183(false, 415);
                            frameRemainderLocal21 = (integerLocal17 != 0);
                          }
                          if (frameRemainderLocal21) {
                            MixedSupport007.renderingSupport007State0001 = FullscreenStatusDialog.computeRenderingSupport0070696((byte) 82, false);
                            frameRemainderLocal21 = (integerLocal17 != 0);
                          }
                        }
                      }
                      if (frameRemainderLocal21) {
                        MixedSupport051.renderingSupport007State0005 = IterableNodeCollection.computeRenderingSupport0071657(MixedSupport088.integerArrayState0172, false, 0, -111);
                        if (integerLocal17 != 0) {
                          HuffmanCodec.performAction0823(2, true);
                          PlayerNameAvailabilityValidator.performAction0825(0, true);
                          GameplayControls.performAction1752(true, (byte) -53);
                        }
                      }
                    }
                  } else {
                    HuffmanCodec.performAction0823(2, true);
                    if (integerLocal17 != 0) {
                      PlayerNameAvailabilityValidator.performAction0825(0, true);
                      GameplayControls.performAction1752(true, (byte) -53);
                    }
                  }
                } else {
                  PlayerNameAvailabilityValidator.performAction0825(0, true);
                  if (integerLocal17 != 0) {
                    GameplayControls.performAction1752(true, (byte) -53);
                  }
                }
              } else {
                GameplayControls.performAction1752(true, (byte) -53);
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
            if (null != ComponentContainer.renderingSupport007State0006) {
              if (DebouncedFieldValidator.booleanState0006) {
                MixedSupport097.renderingSupport007State0007.performAction0875((byte) -96);
                frameRemainderLocal23 = (integerLocal17 != 0);
              }
              if (frameRemainderLocal23) {
                if (!BucketBoard.booleanState0109) {
                  if (!SceneWidgetPart007.booleanState0114) {
                    if (!MixedSupport043.booleanState0048) {
                      if (!LobbyRoomRow.booleanState0203) {
                        if (SecondaryNodeHashTable.booleanState0121) {
                          MixedSupport033.renderingSupport007State0004.performAction0876(2824);
                          frameRemainderLocal23 = (integerLocal17 != 0);
                        }
                        if (frameRemainderLocal23) {
                          if (!MixedSupport049.booleanState0058) {
                            ComponentContainer.renderingSupport007State0006.performAction0884(128);
                            frameRemainderLocal23 = (integerLocal17 != 0);
                          }
                          if (frameRemainderLocal23) {
                            MixedSupport051.performAction0606((RenderingSupport007) null, (byte) 95);
                            SoftwareFramebuffer.computeBoolean1798(false);
                            integerLocal13 = GuestPlayConfirmationForm.updateMembershipSlides(0, true);
                            if (1 == integerLocal13 ||
                              integerLocal13 == 2) {
                              MixedSupport049.booleanState0058 = false;
                              stackRenderingSupport007Local1 = ComponentContainer.renderingSupport007State0006;
                              stackIntegerLocal2 = integerArgument1 ^ -30662;
                              stackBooleanLocal3 = (integerLocal13 == 2);
                              ((RenderingSupport007) (Object) stackRenderingSupport007Local1).performAction0865(stackIntegerLocal2, stackBooleanLocal3);
                            }
                            if (3 == integerLocal13) {
                              NetworkSupport012.openSubscriptionPage((byte) -65, DraggableWidgetContainer.computeApplet1485(25144));
                            }
                            frameRemainderLocal23 = (integerLocal17 != 0);
                          }
                        }
                      }
                      if (frameRemainderLocal23) {
                        ContentTransitionDialog.renderingSupport007State0002.performAction0869(-8622);
                        frameRemainderLocal23 = (integerLocal17 != 0);
                      }
                    }
                    if (frameRemainderLocal23) {
                      MixedSupport007.renderingSupport007State0001.performAction0885((byte) 101);
                      frameRemainderLocal23 = (integerLocal17 != 0);
                    }
                  }
                  if (frameRemainderLocal23) {
                    MixedSupport020.renderingSupport007State0003.performAction0873((byte) -63);
                    frameRemainderLocal23 = (integerLocal17 != 0);
                  }
                }
                if (frameRemainderLocal23) {
                  MixedSupport051.renderingSupport007State0005.performAction0882(-114);
                  frameRemainderLocal23 = (integerLocal17 != 0);
                }
              }
            }
            if (frameRemainderLocal23) {
              if (MixedSupport007.booleanState0005) {
                if (IterableNodeCollection.booleanState0193) {
                  integerLocal10 = 1;
                  if (ComponentContainer.renderingSupport007State0006 == null &&
                    !RichTextLayout.computeBoolean0399((byte) 92)) {
                    stackIntegerLocal4 = 1;
                  } else {
                    stackIntegerLocal4 = 0;
                  }
                  integerLocal12 = stackIntegerLocal4;
                  frameRemainderLocal23 = (integerLocal17 != 0);
                }
                if (frameRemainderLocal23) {
                  integerLocal20 = ComponentContainer.gameSessionState0002.computeBoolean1322(2, true) ? 1 : 0;
                  while (integerLocal20 == 0) {
                    stackBooleanLocal5 = DualNodeDeque.computeBoolean0027(50);
                    if (integerLocal17 != 0) {
                      frameCompletedLocal22 = false;
                      break;
                    }
                    if (stackBooleanLocal5) {
                      integerLocal20 = ComponentContainer.gameSessionState0002.computeBoolean1333(false) ? 1 : 0;
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
            !MixedSupport083.booleanState0118 &&
            !GameDomainSupport006.booleanState0227) {
            if (MixedSupport043.booleanState0049 &&
              LoginCredentials.booleanState0085) {
              integerLocal10 = 0;
            }
            ModalDialogHost.performAction0833(integerLocal10 != 0, -3051);
            if (MixedSupport034.booleanState0042) {
              UiComponent.gameSessionState0001.computeBoolean1322(2, integerLocal12 != 0);
            }
            if (MixedSupport043.booleanState0049) {
              StandardContentDialog.performAction1239(180, 320, false, integerLocal12 != 0);
              if (LoginCredentials.booleanState0085) {
                integerLocal12 = 0;
              }
              ComponentContainer.gameSessionState0002.computeBoolean1322(2, integerLocal12 != 0);
            }
            while (DualNodeDeque.computeBoolean0027(-123)) {
              if (integerLocal17 != 0) {
                frameCompletedLocal25 = false;
                break;
              }
              if (null != GameDomainSupport003.rgbSpriteState0020 &&
                AlphaWidgetContainer.integerState0188 <= 0) {
                stackIntegerLocal6 = 0;
              } else {
                stackIntegerLocal6 = 1;
              }
              integerLocal18 = stackIntegerLocal6;
              if (MixedSupport043.booleanState0049) {
                integerLocal18 = SecondaryNodeHashTable.booleanState0122 ? 1 : 0;
              }
              if (MixedSupport034.booleanState0042) {
                integerLocal18 = ValidatedTextField.booleanState0128 ? 1 : 0;
              }
              boolean frameRemainderLocal26 = true;
              if (!booleanArgument2) {
                if ((MixedSupport043.booleanState0049) &&
                  (frameRemainderLocal26 = !(!MixedSupport046.computeBoolean0566(13, 12, 15, (byte) -83)))) {
                  continue;
                }
                if ((frameRemainderLocal26) &&
                  (integerLocal18 != 0)) {
                  SceneWidgetPart005.computeBoolean0711(12, 15, 13, (byte) 69);
                }
              }
              if (MixedSupport034.booleanState0042 &&
                integerLocal12 != 0) {
                UiComponent.gameSessionState0001.computeBoolean1333(false);
              }
              if (MixedSupport043.booleanState0049 &&
                integerLocal12 != 0) {
                ComponentContainer.gameSessionState0002.computeBoolean1333(false);
              }
            }
          }
          if ((frameCompletedLocal25) &&
            (frameRemainderLocal24 = !(IterableNodeCollection.booleanState0193))) {
            NetworkSupport004.performAction0600(-29550);
          }
          if ((frameRemainderLocal24) &&
            (DualNodeDeque.computeInteger0037(integerArgument1 - 58860) == 0)) {
            SocketFactory.performAction1792((byte) 68);
          }
          if (GameDomainSupport003.rgbSpriteState0020 != null &&
            AlphaWidgetContainer.integerState0188 <= 0) {
            stackIntegerLocal7 = 0;
          } else {
            stackIntegerLocal7 = 1;
          }
          integerLocal19 = stackIntegerLocal7;
          if (MixedSupport043.booleanState0049) {
            integerLocal19 = SecondaryNodeHashTable.booleanState0122 ? 1 : 0;
          }
          if (MixedSupport034.booleanState0042) {
            integerLocal19 = ValidatedTextField.booleanState0128 ? 1 : 0;
          }
          if (integerLocal19 == 0) {
            if (!(AlphaWidgetContainer.integerState0188 <= 0)) {
              AlphaWidgetContainer.integerState0188 = AlphaWidgetContainer.integerState0188 - 1;
              if ((integerLocal17 != 0) &&
                (AlphaWidgetContainer.integerState0188 < UiComponentPart009.integerState0149)) {
                AlphaWidgetContainer.integerState0188 = AlphaWidgetContainer.integerState0188 + 1;
              }
            }
          } else {
            if (AlphaWidgetContainer.integerState0188 < UiComponentPart009.integerState0149) {
              AlphaWidgetContainer.integerState0188 = AlphaWidgetContainer.integerState0188 + 1;
            }
          }
          boolean frameRemainderLocal27 = true;
          integerLocal14 = UiComponentPart009.integerState0149 * UiComponentPart009.integerState0149;
          integerLocal15 = -(AlphaWidgetContainer.integerState0188 * AlphaWidgetContainer.integerState0188) + integerLocal14;
          integerLocal16 = RichTextLayout.integerState0157 + 120 * integerLocal15 / integerLocal14;
          MixedSupport061.performAction0728(integerLocal16, -32);
          if (MixedSupport128.rgbSpriteState0060 == GameDomainSupport003.rgbSpriteState0020 &&
            DualNodeDeque.computeInteger0037(integerArgument1 - 58860) == 0) {
            if (MixedSupport007.booleanState0005) {
              ProxyAuthenticationRequiredException.booleanState0024 = false;
              if (ComponentContainer.gameSessionState0002 != null &&
                ComponentContainer.gameSessionState0002.integerState0623 < 38) {
                MixedSupport128.rgbSpriteState0060 = NanoFrameTimer.rgbSpriteArrayState0009[ComponentContainer.gameSessionState0002.mixedSupport028State0001.integerState0166];
              }
              if (MixedSupport034.booleanState0042) {
                MixedSupport128.rgbSpriteState0060 = NanoFrameTimer.rgbSpriteArrayState0009[UiComponent.gameSessionState0001.mixedSupport028State0001.integerState0166];
              }
              stackBooleanLocal8 = !(IterableNodeCollection.booleanState0193);
              MouseInput.booleanState0223 = stackBooleanLocal8;
              frameRemainderLocal27 = (integerLocal17 != 0);
            }
            if (frameRemainderLocal27) {
              if (IterableNodeCollection.booleanState0193) {
                ProxyAuthenticationRequiredException.booleanState0024 = false;
                MouseInput.booleanState0223 = false;
                MixedSupport128.rgbSpriteState0060 = null;
                if (integerLocal17 != 0) {
                  ProxyAuthenticationRequiredException.booleanState0024 = true;
                  MixedSupport128.rgbSpriteState0060 = SceneWidgetPart011.rgbSpriteState0058;
                  MouseInput.booleanState0223 = true;
                }
              } else {
                ProxyAuthenticationRequiredException.booleanState0024 = true;
                MixedSupport128.rgbSpriteState0060 = SceneWidgetPart011.rgbSpriteState0058;
                MouseInput.booleanState0223 = true;
              }
            }
          }
          if (MixedSupport128.rgbSpriteState0060 != GameDomainSupport003.rgbSpriteState0020) {
            MixedSupport137.integerState0848 = MixedSupport137.integerState0848 + 1;
            if (30 <= MixedSupport137.integerState0848) {
              MixedSupport137.integerState0848 = 0;
              GameDomainSupport003.rgbSpriteState0020 = MixedSupport128.rgbSpriteState0060;
              IconLabelWidget.booleanState0151 = MouseInput.booleanState0223;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal28) {
          caughtExceptionLocal9 = caughtParameterLocal28;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal11), "client.O(" + integerArgument1 + ',' + booleanArgument2 + ')');
        }
    }

    final void releaseGameResources(int integerArgument1) {
        DekoBlokoClient.clearDekoBlokoGlobals((byte) -56);
        MixedSupport136.clearStaticReferences((byte) 101);
        NodeDeque.clearStaticReferences((byte) 79);
        MixedSupport011.clearStaticReferences(112);
        SceneWidgetNode.clearStaticReferences(710);
        KeyboardInputHandler.clearStaticReferences(128);
        TranslatedUiText.performAction1062((byte) -33);
        MixedSupport146.clearStaticReferences(true);
        DiagnosticSupport002.resetStaticState((byte) -9);
        GameApplet.performAction0681(6);
        NetworkSupport008.clearStaticReferences(false);
        MouseInput.clearStaticReferences(true);
        MouseWheelInput.clearStaticReferences(64);
        SoftwareRaster.clearStaticReferences();
        ResourceArchive.clearStaticReferences(127);
        MixedSupport122.clearStaticReferences(122);
        GameDomainSupport001.clearStaticReferences(-117);
        PacketBuffer.clearStaticReferences(8);
        MixedSupport062.clearStaticReferences(78);
        GameDomainSupport004.clearStaticReferences(false);
        MixedSupport037.clearStaticReferences((byte) -108);
        RenderingSupport003.clearStaticReferences(true);
        MixedSupport025.clearStaticReferences(121);
        MixedSupport052.clearStaticReferences((byte) 82);
        MixedSupport088.resetStaticState(false);
        MixedSupport073.resetStaticState(126);
        MixedSupport124.resetStaticState(23358);
        MixedSupport056.clearStaticReferences(-21128);
        MixedSupport096.clearStaticReferences((byte) -46);
        GameAssets.performAction1493((byte) -105);
        MixedSupport078.clearStaticReferences(89);
        MixedSupport065.clearStaticReferences(-114);
        FrameTimer.performAction0707((byte) -120);
        Framebuffer.clearStaticReferences(24744);
        MixedSupport014.clearStaticReferences(12623);
        FullscreenCanvas.clearStaticReferences(-100);
        DisplayModeController.clearStaticReferences((byte) -91);
        ArchiveNetworkClient.clearStaticReferences((byte) 115);
        CacheWorkQueue.clearStaticReferences(0);
        Js5ArchiveManager.clearStaticReferences((byte) 0);
        BufferedFile.clearStaticReferences((byte) -73);
        BufferedSocket.clearStaticReferences(-11657);
        SoundCache.clearStaticReferences(113);
        PcmPlayer.clearStaticReferences();
        MusicTrack.clearStaticReferences(31158);
        MidiSynthesizer.clearStaticReferences();
        RenderingSupport007.performAction0886(126);
        GameSession.resetStaticState(false);
        MixedSupport005.clearStaticReferences(8);
        NetworkSupport004.clearStaticReferences(0);
        MixedSupport131.resetStaticState((byte) -75);
        BucketBoard.performAction0989(36);
        HashNode.clearDeclaredStaticReferences(25189);
        MixedSupport143.performAction1776(18);
        MixedSupport017.clearStaticReferences(78);
        MixedSupport021.performAction0324(36);
        PcmPlayerService.clearStaticReferences(-120);
        MixedSupport123.clearStaticReferences(103);
        MixedSupport063.clearStaticReferences(true);
        SceneWidget.clearDeclaredStaticReferences((byte) 77);
        LobbyRoomRow.performAction1712((byte) 116);
        SecondaryNodeHashTable.clearStaticReferences(-121);
        SceneWidgetPart012.discardDeclaredStaticReferences(-18263);
        RenderingSupport004.clearStaticReferences(0);
        DualNode.releaseDeclaredStaticReferences(-106);
        MixedSupport139.clearStaticReferences(true);
        MixedSupport095.clearStaticReferences(110);
        MixedSupport029.clearStaticReferences(-96);
        MixedSupport109.clearStaticReferences(-114);
        ModalDialogHost.clearStaticReferences((byte) 102);
        AccountCreationResultPanel.performAction1821(0);
        ProgressDialog.performAction1395((byte) 89);
        StandardContentDialog.clearStaticReferences((byte) 24);
        ProgressMessageDialog.resetDeclaredStaticReferences(15);
        AccountRegistrationPanel.performAction1594(true);
        GuestPlayConfirmationForm.clearStaticReferences((byte) 1);
        LoginPanel.clearStaticReferences(0);
        DisplayNameSelectionPanel.clearStaticReferences(3);
        LoginCredentials.clearStaticReferences((byte) 101);
        NetworkSupport002.clearStaticReferences(23302);
        MixedSupport081.clearStaticReferences(0);
        MixedSupport086.clearStaticReferences(-61);
        PcmResampler.clearStaticReferences(23369);
        MixedSupport089.clearStaticReferences(-1);
        ResourceSupport001.clearStaticReferences((byte) -67);
        GzipDecompressor.clearStaticReferences(-13495);
        ResourceSupport003.clearStaticReferences((byte) 91);
        MixedSupport007.clearStaticReferences(119);
        Sprite.clearStaticReferences(-27983);
        BitmapFont.clearStaticReferences();
        MixedSupport126.clearStaticReferences((byte) -32);
        MixedSupport085.resetStaticState(3);
        MixedSupport097.clearStaticReferences((byte) -120);
        MixedSupport051.clearStaticReferences((byte) -128);
        MixedSupport127.clearStaticReferences(true);
        MixedSupport111.clearStaticReferences(-117);
        MixedSupport079.clearStaticReferences(108);
        IconLabelWidget.clearGameOptionDescriptions(77);
        SceneWidgetPart008.discardDeclaredStaticReferences(48);
        SceneWidgetPart003.discardDeclaredStaticReferences(3);
        SceneWidgetPart006.discardDeclaredStaticReferences(32);
        SceneWidgetPart002.resetStaticState(-2);
        SceneWidgetPart010.clearStaticReferences((byte) -94);
        MixedSupport099.clearStaticReferences((byte) -103);
        SceneWidgetPart007.discardDeclaredStaticReferences(256);
        MixedSupport006.performAction0063((byte) -112);
        GameDomainSupport002.clearStaticReferences((byte) 102);
        MixedSupport116.clearStaticReferences(-28610);
        GameplayControls.performAction1747((byte) -93);
        MixedSupport058.clearStaticReferences(-18551);
        MixedSupport137.resetStaticState(27067);
        MixedSupport093.resetStaticState(false);
        MixedSupport067.resetStaticState(-109);
        HuffmanCodec.clearStaticReferences((byte) -91);
        GameDomainSupport003.clearStaticReferences(-9724);
        NineSliceSprite.clearStaticReferences((byte) -94);
        MixedSupport027.performAction0387(-22811);
        MixedSupport098.performAction1216(-1);
        MixedSupport039.clearStaticReferences(0);
        MixedSupport028.clearStaticReferences(92);
        ReturnedShapeCache.clearStaticReferences(2);
        MixedSupport112.clearStaticReferences((byte) -82);
        AnimatedTileRegion.clearStaticReferences(127);
        MixedSupport117.resetStaticState((byte) 110);
        CipherPacketBuffer.resetStaticState((byte) 120);
        MixedSupport087.clearStaticReferences(14925);
        MixedSupport047.performAction0575(2);
        MixedSupport134.resetStaticState(-66);
        MixedSupport048.clearStaticReferences(98);
        MixedSupport043.performAction0546(true);
        IsaacRandom.clearStaticReferences((byte) -78);
        MixedSupport054.performAction0634((byte) 126);
        ReturnedShape.performAction1433(false);
        RenderingSupport006.clearStaticReferences(123);
        ReturnedShapeUpdate.resetStaticState(121);
        MixedSupport031.clearStaticReferences(10140);
        MixedSupport101.clearStaticReferences(62);
        BirthDateChatEnableForm.clearStaticReferences(-17690);
        MixedSupport046.performAction0565((byte) -118);
        PolygonScanlineRasterizer.clearStaticReferences();
        NetworkSupport001.clearStaticReferences(0);
        SceneWidgetPart001.discardDeclaredStaticReferences(15338);
        NetworkArchiveRequestManager.clearStaticReferences(112);
        DualNodeDeque.performAction0036(1);
        NetworkArchiveRequest.performAction1251((byte) 106);
        MixedSupport069.clearStaticReferences(-1643605936);
        ArchiveRequestManager.performAction0468(true);
        MixedSupport076.clearStaticReferences(true);
        BoundedRandomAccessFile.clearStaticReferences(12741);
        MixedSupport018.clearStaticReferences(-27513);
        MixedSupport115.performAction1488((byte) -126);
        MixedSupport100.clearStaticReferences((byte) 126);
        FullscreenStatusDialog.discardDeclaredStaticReferences(-30);
        DefaultTextWidgetRenderer.clearStaticReferences(-1);
        MixedSupport104.clearStaticReferences();
        VorbisSample.clearStaticReferences();
        NetworkSupport009.clearStaticReferences(3805);
        ClientException.performAction0364((byte) -68);
        MixedSupport138.clearStaticReferences((byte) 91);
        MixedSupport110.resetStaticState(2);
        MixedSupport036.clearStaticReferences(38);
        MixedSupport002.performAction0026(true);
        MixedSupport077.clearStaticReferences(101);
        DelegatingCanvas.clearStaticReferences(16057);
        MixedSupport133.clearStaticReferences((byte) 86);
        MixedSupport091.clearStaticReferences(true);
        ByteStorage.clearStaticReferences(false);
        if (integerArgument1 < 75) {
          return;
        }
        try {
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.clearStaticReferences(true);
          MixedSupport071.clearStaticReferences(true);
          ByteArrayPoolSupport.clearStaticReferences((byte) 111);
          MixedSupport083.clearStaticReferences(-117);
          MixedSupport070.clearStaticReferences((byte) -117);
          MixedSupport009.clearStaticReferences((byte) -102);
          InputAdapter001.clearStaticReferences((byte) -100);
          MixedSupport105.clearStaticReferences((byte) 126);
          TextLayout.clearStaticReferences((byte) 126);
          UiComponent.performAction0224(54);
          ComponentDecorator.performAction1018((byte) -79);
          ResizableModalDialog.performAction1559((byte) 94);
          ModalDialog.clearStaticReferences(2);
          ComponentContainer.releaseDeclaredStaticReferences(116);
          MixedSupport108.clearStaticReferences((byte) -119);
          MixedSupport066.clearStaticReferences(-5161);
          VorbisFloor.clearStaticReferences();
          MixedSupport128.performAction1633((byte) -128);
          MixedSupport042.clearStaticReferences(29047);
          MixedSupport045.clearStaticReferences((byte) -52);
          MixedSupport019.clearStaticReferences(-48);
          SceneWidgetPart005.clearStaticReferences((byte) 34);
          MixedSupport032.performAction0470((byte) 82);
          NetworkSupport012.resetStaticState(30553);
          MixedSupport003.clearStaticReferences((byte) -17);
          NetworkSupport007.resetStaticState(0);
          MixedSupport074.performAction0922((byte) 92);
          MixedSupport035.performAction0501((byte) 117);
          ThemeTips.clearStaticReferences(false);
          SocketFactory.clearStaticReferences((byte) -37);
          ProxyAuthenticationRequiredException.performAction0330((byte) 91);
          NanoFrameTimer.performAction0386(72);
          SoftwareFramebuffer.clearDeclaredStaticReferences(-119);
          MixedSupport049.clearStaticReferences(79);
          MixedSupport023.clearStaticReferences(true);
          RenderingSupport012.clearStaticReferences(-20007);
          SynthesizerVoice.clearStaticReferences();
          MixedSupport040.clearStaticReferences(25988);
          RenderingSupport002.resetStaticState(124);
          MixedSupport013.clearStaticReferences((byte) 92);
          MixedSupport145.performAction1789(1);
          LabeledWidgetContainer.clearStaticReferences(-121);
          ValidatedTextField.clearStaticReferences((byte) 109);
          EditableTextField.clearTextFieldGlobals(81);
          ContentTransitionDialog.discardDeclaredStaticReferences(104);
          NameSuggestionsPanel.clearStaticReferences(1);
          RichTextWidget.clearStaticReferences((byte) 117);
          ValidationStatusIcon.clearStaticReferences(-99);
          AccountFieldStatusIndicator.resetStaticState((byte) 47);
          UiComponentPart009.clearStaticReferences(false);
          TextFieldValidator.performAction1827(18966);
          MixedSupport010.clearStaticReferences((byte) 22);
          RegistrationAgreementPane.clearStaticReferences((byte) 106);
          UiComponentPart001.performAction0054(-59);
          UiComponentPart002.performAction0078(-109);
          SceneWidgetPart011.clearStaticReferences((byte) 105);
          PlayerNamePrompt.discardDeclaredStaticReferences(-102);
          MixedSupport022.clearStaticReferences((byte) -121);
          MixedSupport107.clearStaticReferences(573767765);
          BirthDateValidator.clearStaticReferences(119);
          BirthDateTextFields.resetStaticState(33);
          ArrayWidgetContainer.performAction1162(true);
          BirthDateInput.clearStaticReferences(-20);
          RichTextLayout.clearDeclaredStaticReferences((byte) -37);
          DirectByteStorage.performAction0550(0);
          GrowableIntArray.clearStaticReferences(false);
          DraggableWidgetContainer.performAction1484(11344);
          DropTargetWidgetContainer.performAction0705(true);
          NodeHashTable.clearStaticReferences(0);
          IterableNodeCollection.performAction1659((byte) 73);
          MixedSupport140.performAction1730((byte) 46);
          MixedSupport106.clearStaticReferences(2);
          MixedSupport125.clearStaticReferences(8);
          ProxySocketFactory.clearStaticReferences(false);
          AudioFilter.clearStaticReferences();
          MixedSupport147.performAction1809(0);
          NodeHashTableIterator.clearStaticReferences(1714134600);
          SecondaryNodeDequeIterator.clearStaticReferences(8);
          MixedSupport068.clearStaticReferences(93);
          MixedSupport072.clearStaticReferences(-1);
          InputAdapter003.performAction1489(3);
          MixedSupport129.performAction1651(-21771);
          MixedSupport041.clearDeclaredStaticReferences(8);
          MixedSupport094.performAction1198((byte) 6);
          MixedSupport024.clearDeclaredStaticReferences(87);
          MixedSupport050.releaseDeclaredStaticReferences(38);
          MixedSupport121.clearStaticReferences(false);
          AlphaWidgetContainer.clearStaticReferences(0);
          SceneWidgetPart014.discardDeclaredStaticReferences(-78);
          MixedSupport020.clearStaticReferences((byte) -39);
          GameDomainSupport005.clearStaticReferences((byte) 78);
          PlayerBoardUpdateQueue.clearStaticReferences(-19893);
          MixedSupport033.performAction0498(30061);
          NetworkSupport005.performAction0908((byte) 22);
          MixedSupport113.clearStaticReferences(13820388);
          MixedSupport038.clearStaticReferences(-45);
          MixedSupport119.clearStaticReferences(false);
          MixedSupport132.clearStaticReferences(0);
          RenderingSupport001.clearStaticReferences(-73);
          MixedSupport004.clearStaticReferences((byte) -47);
          MixedSupport016.clearStaticReferences((byte) 121);
          DialogMessagePane.clearStaticReferences(true);
          MixedSupport144.performAction1787(2);
          MixedSupport061.performAction0727(-85);
          GameDomainSupport006.performAction1826(7751);
          MixedSupport103.performAction1285(-30349);
          MixedSupport090.performAction1141((byte) 121);
          FullscreenNoticeType.clearStaticReferences((byte) -89);
          MixedSupport053.resetStaticState(22771);
          MixedSupport034.clearStaticReferences((byte) -74);
          MixedSupport118.clearStaticReferences((byte) 86);
          TextLineMetrics.clearStaticReferences(-120);
          PlayerNameAvailabilityValidator.clearStaticReferences(62);
          PasswordValidator.clearStaticReferences(0);
          EmailFormatValidator.clearStaticReferences(9369);
          ConfirmedEmailAvailabilityValidator.clearEmailValidatorResources((byte) -68);
          AgeValidator.clearStaticReferences(127);
          MatchingFieldValidator.performAction1427((byte) -112);
          MixedSupport057.clearStaticReferences(28180);
          TextHotspotBounds.clearStaticReferences(-59);
          ValidationStatus.clearStaticReferences(20908);
          DebouncedFieldValidator.clearStaticReferences((byte) 127);
          EmailValidationError.clearStaticReferences(true);
          this.stringState0042 = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "client.J(" + integerArgument1 + ')');
        }
    }

    final void renderFrame(int integerArgument1) {
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
          if (MixedSupport119.computeBoolean1560((byte) -56)) {
            MixedSupport065.performAction0786(canvasLocal8, MixedSupport016.computeBoolean0203(integerArgument1 ^ 8512), -6351);
            return;
          }
          if (!GameAssets.booleanState0176) {
            DisplayNameSelectionPanel.performAction0319(true, canvasLocal8);
            return;
          }
          if (!DraggableWidgetContainer.computeBoolean1486(-1)) {
            RichTextWidget.performAction1359(100.0f, -81, MixedSupport010.stringState0048);
            DisplayNameSelectionPanel.performAction0319(true, canvasLocal8);
            return;
          }
          boolean frameRemainderLocal18 = true;
          ProgressDialog.performAction1390(AgeValidator.rgbSpriteState0026, MixedSupport106.rgbSpriteState0047, (byte) -109);
          if (ComponentContainer.renderingSupport007State0006 == null &&
            !RichTextLayout.computeBoolean0399((byte) 111) && (!MixedSupport043.booleanState0049 ||
            !LoginCredentials.booleanState0085)) {
            stackIntegerLocal1 = 1;
            frameRemainderLocal18 = false;
          }
          else {
            stackIntegerLocal1 = 0;
          }
          integerLocal10 = stackIntegerLocal1;
          if (0 == MixedSupport107.integerState0681) {
            ContentTransitionDialog.integerState0095 = MixedSupport006.integerState0039;
          }
          if (ContentTransitionDialog.integerState0095 <= 1) {
            DiagnosticSupport002.booleanState0082 = false;
            if (integerLocal16 != 0) {
              InputAdapter003.rgbSpriteState0054.bindAsRenderTarget();
            }
          } else {
            InputAdapter003.rgbSpriteState0054.bindAsRenderTarget();
          }
          while (true) {
            if (MixedSupport107.integerState0681 == 0) {
              UiComponentPart001.performAction0058((byte) 84);
            }
            if (ComponentContainer.gameSessionState0002 != null) {
              ComponentContainer.gameSessionState0002.performAction1316(integerLocal10 != 0, MixedSupport107.integerState0681, ContentTransitionDialog.integerState0095, true, false);
            }
            if (null != UiComponent.gameSessionState0001) {
              UiComponent.gameSessionState0001.performAction1316(integerLocal10 != 0, MixedSupport107.integerState0681, ContentTransitionDialog.integerState0095, true, false);
            }
            if (1 < ContentTransitionDialog.integerState0095) {
              MixedSupport107.integerState0681 = MixedSupport107.integerState0681 + 1;
              if (!DiagnosticSupport002.booleanState0082 &&
                ContentTransitionDialog.integerState0095 > MixedSupport107.integerState0681) {
                continue;
              }
            }
            break;
          }
          if (1 < ContentTransitionDialog.integerState0095) {
            if (MixedSupport107.integerState0681 >= ContentTransitionDialog.integerState0095) {
              rgbSpriteLocal11 = AccountFieldStatusIndicator.rgbSpriteState0038;
              AccountFieldStatusIndicator.rgbSpriteState0038 = InputAdapter003.rgbSpriteState0054;
              DiagnosticSupport002.booleanState0082 = true;
              MixedSupport107.integerState0681 = 0;
              InputAdapter003.rgbSpriteState0054 = rgbSpriteLocal11;
            }
            MixedSupport076.framebufferState0001.performAction0420((byte) -113);
            AccountFieldStatusIndicator.rgbSpriteState0038.drawOpaque(0, 0);
          }
          if (null != ComponentContainer.gameSessionState0002) {
            ComponentContainer.gameSessionState0002.performAction1316(integerLocal10 != 0, MixedSupport107.integerState0681, ContentTransitionDialog.integerState0095, false, false);
          }
          if (UiComponent.gameSessionState0001 != null) {
            UiComponent.gameSessionState0001.performAction1316(integerLocal10 != 0, MixedSupport107.integerState0681, ContentTransitionDialog.integerState0095, false, false);
          }
          if (!MixedSupport007.booleanState0005 &&
            !IterableNodeCollection.booleanState0193) {
            ComponentContainer.renderingSupport007State0006.performAction0854(false);
            integerLocal12 = 0;
            if (null != MixedSupport097.renderingSupport007State0007) {
              integerLocal12 = 1;
              MixedSupport097.renderingSupport007State0007.performAction0863((byte) -75);
            }
            if (MixedSupport051.renderingSupport007State0005 != null) {
              integerLocal12 = 1;
              MixedSupport051.renderingSupport007State0005.performAction0877((byte) 99);
            }
            if (null != MixedSupport020.renderingSupport007State0003) {
              MixedSupport020.renderingSupport007State0003.performAction0857((byte) -48);
              integerLocal12 = 1;
            }
            if (null != MixedSupport007.renderingSupport007State0001) {
              MixedSupport007.renderingSupport007State0001.performAction0880(123);
              integerLocal12 = 1;
            }
            if (null != ContentTransitionDialog.renderingSupport007State0002) {
              ContentTransitionDialog.renderingSupport007State0002.performAction0868((byte) 45);
              integerLocal12 = 1;
            }
            if (MixedSupport033.renderingSupport007State0004 != null) {
              MixedSupport033.renderingSupport007State0004.performAction0864(2);
              integerLocal12 = 1;
            }
            if (MixedSupport049.booleanState0058 &&
              GameDomainSupport003.rgbSpriteState0020 == MixedSupport128.rgbSpriteState0060 &&
              integerLocal12 == 0) {
              GameDomainSupport005.performAction1209(390);
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
          stackBooleanLocal4 = (integerLocal17 == 0) && (ComponentContainer.renderingSupport007State0006 == null) && (MixedSupport014.computeBoolean0190((byte) -128));
          AccountRegistrationPanel.performAction1584(stackIntegerLocal3, stackBooleanLocal4);
          if (integerLocal17 != 0) {
            MixedSupport022.performAction0329(false, MixedSupport014.computeBoolean0190((byte) -128));
          }
          if (integerArgument1 != 320) {
            stringState0097 = (String) null;
          }
          if ((MixedSupport007.booleanState0005 ||
            IterableNodeCollection.booleanState0193) &&
            ComponentContainer.renderingSupport007State0006 != null) {
            SoftwareRaster.darkenRectangleHalf(0, 0, 640, 480);
            ComponentContainer.renderingSupport007State0006.performAction0874(-26325);
            if (MixedSupport033.renderingSupport007State0004 != null) {
              MixedSupport033.renderingSupport007State0004.performAction0864(2);
            }
          }
          if (DisplayNameSelectionPanel.computeBoolean0321((byte) 99)) {
            SoftwareRaster.fillRectangleAlpha(320 - GameDomainSupport006.computeInteger1825(3) / 2 - 34, -(NetworkArchiveRequest.computeInteger1250(20) / 2) + 240 - 24, GameDomainSupport006.computeInteger1825(3) + 68, NetworkArchiveRequest.computeInteger1250(126) + 48, 0, 200);
            GameplayControls.performAction1749(NetworkArchiveRequest.computeInteger1250(integerArgument1 - 356) + 60, (byte) 50, DefaultTextWidgetRenderer.rgbSpriteArrayState0001, GameDomainSupport006.computeInteger1825(3) + 80, 240 - NetworkArchiveRequest.computeInteger1250(-5) / 2 - 30, 320 - GameDomainSupport006.computeInteger1825(3) / 2 - 40);
            IterableNodeCollection.performAction1660(32659);
          }
          if (!UiComponentPart001.computeBoolean0059((byte) 94)) {
            if (TextHotspotBounds.computeBoolean1256(67)) {
              stackIntegerLocal5 = 112;
              if (MixedSupport020.fullscreenCanvasState0001 != null) {
                stackBooleanLocal6 = true;
              } else {
                stackBooleanLocal6 = GameSession.booleanState0141;
              }
              ResizableModalDialog.performAction1553(stackIntegerLocal5, stackBooleanLocal6);
              if (integerLocal16 != 0) {
                SoftwareRaster.fillRectangleAlpha(-34 - MixedSupport136.computeInteger1705(480) / 2 + 320, -24 + (-(DialogMessagePane.computeInteger0369(110) / 2) + 240), 68 + MixedSupport136.computeInteger1705(480), 48 + DialogMessagePane.computeInteger0369(110), 0, 200);
                GameplayControls.performAction1749(DialogMessagePane.computeInteger0369(113) + 60, (byte) 50, DefaultTextWidgetRenderer.rgbSpriteArrayState0001, 80 + MixedSupport136.computeInteger1705(480), 210 - DialogMessagePane.computeInteger0369(108) / 2, 320 - (MixedSupport136.computeInteger1705(integerArgument1 ^ 160) / 2 + 40));
                MixedSupport020.performAction0299(true);
              }
            }
          } else {
            SoftwareRaster.fillRectangleAlpha(-34 - MixedSupport136.computeInteger1705(480) / 2 + 320, -24 + (-(DialogMessagePane.computeInteger0369(110) / 2) + 240), 68 + MixedSupport136.computeInteger1705(480), 48 + DialogMessagePane.computeInteger0369(110), 0, 200);
            GameplayControls.performAction1749(DialogMessagePane.computeInteger0369(113) + 60, (byte) 50, DefaultTextWidgetRenderer.rgbSpriteArrayState0001, 80 + MixedSupport136.computeInteger1705(480), 210 - DialogMessagePane.computeInteger0369(108) / 2, 320 - (MixedSupport136.computeInteger1705(integerArgument1 ^ 160) / 2 + 40));
            MixedSupport020.performAction0299(true);
          }
          if (SceneWidgetPart002.integerState0249 != SceneWidgetPart002.integerState0241) {
            integerLocal13 = 256 * ReturnedShape.integerState0694 / 16;
            if (integerLocal13 > 0) {
              SoftwareRaster.fillRectangleAlpha(0, 0, SoftwareRaster.integerState0285, SoftwareRaster.integerState0284, 0, integerLocal13);
            }
          }
          if (2 <= PasswordValidator.integerState0776) {
            longLocal14 = Runtime.getRuntime().totalMemory() / 1024L;
            longLocal15 = -(Runtime.getRuntime().freeMemory() / 1024L) + longLocal14;
            DraggableWidgetContainer.renderingSupport009State0005.drawString("FPS: " + MixedSupport065.integerState0347, 12, 38, 16777215, 1);
            DraggableWidgetContainer.renderingSupport009State0005.drawString(longLocal15 + "/" + longLocal14 + " kB", 12, 52, 16777215, 1);
          }
          BirthDateChatEnableForm.performAction1045(1, 0, 0, canvasLocal8);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal7 = caughtParameterLocal19;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal9), "client.F(" + integerArgument1 + ')');
        }
    }

    final void updateGameTick(int integerArgument1) {
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
              this.updateGameAndNetworkState((byte) 51);
              integerLocal2 = 0;
              break;
            }
            MixedSupport100.booleanArrayState0008[integerLocal2] = false;
            MixedSupport005.booleanArrayState0001[integerLocal2] = false;
            AgeValidator.integerArrayArrayState0015[0][integerLocal2] = 9 * AgeValidator.integerArrayArrayState0015[0][integerLocal2] / 10;
            AgeValidator.integerArrayArrayState0015[1][integerLocal2] = 9 * AgeValidator.integerArrayArrayState0015[1][integerLocal2] / 10;
            integerLocal2++;
          } while (integerLocal5 == 0);
          if (integerArgument1 != 11978) {
            return;
          }
          while (8 > integerLocal2) {
            if (integerLocal5 != 0) {
              return;
            }
            if (!MixedSupport100.booleanArrayState0008[integerLocal2] &&
              SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2] != null) {
              SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2].setLoopCount(0);
              if (!SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2].isLinked((byte) 78)) {
                SoftwareFramebuffer.rawPcmStreamArrayState0003[integerLocal2] = null;
              }
            }
            if (!MixedSupport005.booleanArrayState0001[integerLocal2] &&
              null != MixedSupport062.rawPcmStreamArrayState0002[integerLocal2]) {
              MixedSupport062.rawPcmStreamArrayState0002[integerLocal2].fadeOutAndUnlink(PcmPlayer.integerState0209 / 50);
              MixedSupport062.rawPcmStreamArrayState0002[integerLocal2] = null;
            }
            if (MixedSupport116.rawPcmStreamArrayArrayState0001[0][integerLocal2] != null) {
              integerLocal4 = AgeValidator.integerArrayArrayState0015[0][integerLocal2];
              if (0 == integerLocal4) {
                MixedSupport116.rawPcmStreamArrayArrayState0001[0][integerLocal2].fadeOutAndUnlink(PcmPlayer.integerState0209 / 50);
                MixedSupport116.rawPcmStreamArrayArrayState0001[0][integerLocal2] = null;
              } else {
                MixedSupport116.rawPcmStreamArrayArrayState0001[0][integerLocal2].rampVolume(PcmPlayer.integerState0209 / 50, GameDomainSupport005.integerState0578 * integerLocal4);
              }
            }
            if (null != MixedSupport116.rawPcmStreamArrayArrayState0001[1][integerLocal2]) {
              integerLocal6 = AgeValidator.integerArrayArrayState0015[1][integerLocal2];
              if (0 == integerLocal6) {
                MixedSupport116.rawPcmStreamArrayArrayState0001[1][integerLocal2].fadeOutAndUnlink(PcmPlayer.integerState0209 / 50);
                MixedSupport116.rawPcmStreamArrayArrayState0001[1][integerLocal2] = null;
              } else {
                MixedSupport116.rawPcmStreamArrayArrayState0001[1][integerLocal2].rampVolume(PcmPlayer.integerState0209 / 50, integerLocal6 * GameDomainSupport005.integerState0578);
              }
            }
            integerLocal2++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal1 = caughtParameterLocal7;
          runtimeExceptionLocal3 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal3), "client.D(" + integerArgument1 + ')');
        }
    }

    final void initializeGame(boolean booleanArgument1) {
        try {
          this.initializeFramework(5, 94, 31, 0, 1, 12, 2, booleanArgument1);
          PcmPlayer.configureAudio(22050, true, 10);
          SceneWidgetNode.pcmPlayerState0002 = PcmPlayer.createOutput(GzipDecompressor.platformServiceState0003, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001), 0, 22050);
          MixedSupport019.pcmPlayerState0001 = PcmPlayer.createOutput(GzipDecompressor.platformServiceState0003, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001), 1, 1024);
          SecondaryNodeDequeIterator.pcmStreamMixerState0001 = new PcmStreamMixer();
          MixedSupport019.pcmPlayerState0001.setRootStream(SecondaryNodeDequeIterator.pcmStreamMixerState0001);
          GameAssets.pcmStreamMixerState0004 = new PcmStreamMixer();
          SceneWidgetNode.pcmPlayerState0002.setRootStream(GameAssets.pcmStreamMixerState0004);
          this.configureOptionalPacketHandlers(false, true, true, false, true, true, false);
          ByteStorage.integerArrayState0158[66] = 2;
          ByteStorage.integerArrayState0158[74] = 1;
          ByteStorage.integerArrayState0158[64] = -2;
          ByteStorage.integerArrayState0158[68] = 1;
          ByteStorage.integerArrayState0158[10] = -1;
          ByteStorage.integerArrayState0158[70] = 1;
          ByteStorage.integerArrayState0158[73] = 1;
          ByteStorage.integerArrayState0158[58] = -2;
          ByteStorage.integerArrayState0158[9] = -1;
          ByteStorage.integerArrayState0158[62] = 2;
          ByteStorage.integerArrayState0158[72] = 1;
          MixedSupport009.integerArrayArrayState0004 = MouseWheelInput.integerArrayArrayState0010;
          ByteStorage.integerArrayState0158[71] = 1;
          ByteStorage.integerArrayState0158[63] = -1;
          ByteStorage.integerArrayState0158[59] = -2;
          ByteStorage.integerArrayState0158[65] = 1;
          ByteStorage.integerArrayState0158[75] = -1;
          ByteStorage.integerArrayState0158[76] = 1;
          ByteStorage.integerArrayState0158[69] = 1;
          MixedSupport062.integerArrayArrayState0012 = DialogMessagePane.integerArrayArrayState0007;
          MixedSupport127.booleanState0191 = true;
          SceneWidgetPart007.integerArrayArrayState0017 = MixedSupport042.integerArrayArrayState0008;
          ByteStorage.integerArrayState0158[61] = -2;
          ByteStorage.integerArrayState0158[67] = -1;
          AccountFieldStatusIndicator.rgbSpriteState0038 = new RgbSprite(640, 480);
          InputAdapter003.rgbSpriteState0054 = new RgbSprite(640, 480);
          MixedSupport006.integerState0039 = 1;
          MixedSupport107.integerState0681 = 0;
          ContentTransitionDialog.integerState0095 = 1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "client.G(" + booleanArgument1 + ')');
        }
    }

    final static void updateLobbyRoomRows(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, boolean booleanArgument5, int integerArgument6, byte byteArgument7) {
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
        LobbyRoomRow stackSceneWidgetPart013Local13;
        SceneWidget stackSceneWidgetLocal14;
        SceneWidget stackSceneWidgetLocal15;
        long stackLongLocal16;
        SceneWidget stackSceneWidgetLocal17 = null;
        SceneWidget stackSceneWidgetLocal18 = null;
        SceneWidget stackSceneWidgetLocal19 = null;
        LobbyRoomRow stackSceneWidgetPart013Local20;
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
        LobbyRoomRow sceneWidgetPart013Local46 = null;
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
          integerLocal41 = ((SceneWidgetPart008) (Object) stackSceneWidgetPart008Local6).computeBoolean1124(stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9, stackBooleanLocal10, 2, booleanArgument3) ? 1 : 0;
          nodeDequeLocal43 = MixedSupport047.sceneWidgetPart008State0003.sceneWidgetState0090.nodeDequeState0034;
          if (byteArgument7 > -48) {
            DekoBlokoClient.clearDekoBlokoGlobals((byte) 82);
          }
          longLocal44 = MixedSupport062.correctedCurrentTimeMillis(4);
          objectLocal45 = null;
          sceneWidgetPart013Local46 = (LobbyRoomRow) (nodeDequeLocal43.beginBackward((byte) -101));
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
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0131, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0131.integerState0916 = 1;
                sceneWidgetPart013Local46.sceneWidgetState0141 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0141, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0144 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0027);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0144, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0144.integerState0893 = 0;
                sceneWidgetPart013Local46.sceneWidgetState0132 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0027);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0132, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0132.integerState0893 = 0;
                sceneWidgetPart013Local46.sceneWidgetState0137 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0137, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0137.integerState0916 = 2;
                stackSceneWidgetPart013Local13 = sceneWidgetPart013Local46;
                stackSceneWidgetLocal14 = null;
                stackSceneWidgetLocal15 = null;
                stackLongLocal16 = 0L;
                if (MixedSupport097.booleanState0133) {
                  stackSceneWidgetLocal17 = null;
                  stackSceneWidgetLocal18 = null;
                  stackSceneWidgetLocal19 = MixedSupport036.sceneWidgetState0027;
                } else {
                  stackSceneWidgetLocal17 = null;
                  stackSceneWidgetLocal18 = null;
                  stackSceneWidgetLocal19 = RenderingSupport004.sceneWidgetState0040;
                }
                stackSceneWidgetPart013Local13.sceneWidgetState0142 = new SceneWidget(stackLongLocal16, stackSceneWidgetLocal19);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0142, -16834);
                sceneWidgetPart013Local46.sceneWidgetArrayState0009 = new SceneWidget[MixedSupport063.integerState0336];
                sceneWidgetPart013Local46.sceneWidgetState0138 = new SceneWidget(0L, (SceneWidget) null);
                if ((integerLocal48 & 1 << MixedSupport124.integerState0791) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0138, -16834);
                }
                sceneWidgetPart013Local46.sceneWidgetState0143 = new SceneWidget(0L, (SceneWidget) null);
                if ((integerLocal48 & 1 << MixedSupport124.integerState0789) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0143, -16834);
                }
                sceneWidgetPart013Local46.sceneWidgetState0129 = new SceneWidget(0L, (SceneWidget) null);
                if ((1 << ReturnedShape.integerState0696 & integerLocal48) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0129, -16834);
                }
                sceneWidgetPart013Local46.sceneWidgetState0136 = new SceneWidget(0L, (SceneWidget) null);
                if ((1 << MixedSupport131.integerState0820 & integerLocal48) != 0) {
                  sceneWidgetPart013Local46.sceneWidgetState0142.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0136, -16834);
                }
                sceneWidgetLocal49 = sceneWidgetPart013Local46.sceneWidgetState0138;
                sceneWidgetLocal50 = sceneWidgetPart013Local46.sceneWidgetState0136;
                sceneWidgetPart013Local46.sceneWidgetState0129.integerState0885 = 1;
                sceneWidgetLocal51 = sceneWidgetPart013Local46.sceneWidgetState0143;
                sceneWidgetLocal51.integerState0885 = 1;
                sceneWidgetLocal50.integerState0885 = 1;
                sceneWidgetLocal49.integerState0885 = 1;
                integerLocal52 = 0;
                while (MixedSupport063.integerState0336 > integerLocal52) {
                  sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal52] = new SceneWidget(0L, (SceneWidget) null);
                  stackIntegerLocal11 = ~(1 << integerLocal52 + MixedSupport132.integerState0822 & integerLocal48);
                  stackIntegerLocal12 = -1;
                  if (stackIntegerLocal11 != stackIntegerLocal12) {
                    sceneWidgetPart013Local46.sceneWidgetState0142.performAction1768(sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal52], -16834);
                  }
                  sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal52].integerState0885 = 1;
                  integerLocal52++;
                }
                stackSceneWidgetPart013Local20 = sceneWidgetPart013Local46;
                stackSceneWidgetLocal21 = null;
                stackSceneWidgetLocal22 = null;
                stackLongLocal23 = 0L;
                if (!MixedSupport097.booleanState0133) {
                  stackSceneWidgetLocal24 = null;
                  stackSceneWidgetLocal25 = null;
                  stackSceneWidgetLocal26 = MixedSupport036.sceneWidgetState0027;
                } else {
                  stackSceneWidgetLocal24 = null;
                  stackSceneWidgetLocal25 = null;
                  stackSceneWidgetLocal26 = RenderingSupport004.sceneWidgetState0040;
                }
                stackSceneWidgetPart013Local20.sceneWidgetState0133 = new SceneWidget(stackLongLocal23, stackSceneWidgetLocal26);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0133, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0133.integerState0916 = 2;
                sceneWidgetPart013Local46.sceneWidgetState0135 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0135, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0130 = new SceneWidget(0L, NameSuggestionsPanel.sceneWidgetState0019);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0130, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0134 = new SceneWidget(0L, NameSuggestionsPanel.sceneWidgetState0019);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0134, -16834);
                sceneWidgetPart013Local46.sceneWidgetState0145 = new SceneWidget(0L, MixedSupport125.sceneWidgetState0125);
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0145, -16834);
                sceneWidgetPart013Local46.performAction1774(-69);
                sceneWidgetPart013Local46.sceneWidgetState0140 = new SceneWidget(0L, MixedSupport078.sceneWidgetState0076);
                integerLocal47 = 1;
                sceneWidgetPart013Local46.performAction1768(sceneWidgetPart013Local46.sceneWidgetState0140, -16834);
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
            while (MixedSupport063.integerState0336 > integerLocal57) {
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
            if (!sceneWidgetPart013Local46.computeBoolean1713((byte) 126)) {
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
                sceneWidgetPart013Local46.sceneWidgetState0131.stringState0598 = MixedSupport096.stringState0408;
              }
              if (null == sceneWidgetPart013Local46.sceneWidgetState0140.stringState0598) {
                sceneWidgetPart013Local46.sceneWidgetState0131.performAction1764(68, 0, integerLocal67, ComponentContainer.integerState0377, 0);
              } else {
                sceneWidgetPart013Local46.sceneWidgetState0140.performAction1764(68, 0, integerLocal67, ComponentContainer.integerState0377, 0);
              }
              sceneWidgetPart013Local46.sceneWidgetState0141.stringState0598 = BitmapFont.truncateWithEllipsis(sceneWidgetPart013Local46.sceneWidgetState0141.bitmapFontState0020, stringLocal68, 78);
              sceneWidgetPart013Local46.sceneWidgetState0141.performAction1764(78, 0, integerLocal67, ComponentContainer.integerState0377, 70);
              if (sceneWidgetPart013Local46.sceneWidgetState0141.booleanState0218 &&
                !sceneWidgetPart013Local46.sceneWidgetState0141.stringState0598.equals(stringLocal68)) {
                MixedSupport117.stringState0515 = stringLocal68;
              }
              sceneWidgetPart013Local46.sceneWidgetState0144.stringState0598 = Integer.toString(sceneWidgetPart013Local46.integerState0843);
              if (sceneWidgetPart013Local46.booleanState0201) {
                sceneWidgetPart013Local46.sceneWidgetState0144.integerState0916 = 2;
                sceneWidgetPart013Local46.sceneWidgetState0132.stringState0598 = "/" + sceneWidgetPart013Local46.integerState0840;
                integerLocal69 = (-sceneWidgetPart013Local46.sceneWidgetState0132.bitmapFontState0020.stringWidth("/") + 348) / 2;
                sceneWidgetPart013Local46.sceneWidgetState0144.performAction1764(integerLocal69 - 150, 0, integerLocal67, ComponentContainer.integerState0377, 150);
                sceneWidgetPart013Local46.sceneWidgetState0132.performAction1764(198 - integerLocal69, 0, integerLocal67, ComponentContainer.integerState0377, integerLocal69);
              } else {
                sceneWidgetPart013Local46.sceneWidgetState0144.integerState0916 = 1;
                sceneWidgetPart013Local46.sceneWidgetState0144.performAction1764(48, 0, integerLocal67, ComponentContainer.integerState0377, 150);
              }
              sceneWidgetPart013Local46.sceneWidgetState0137.stringState0598 = Integer.toString(sceneWidgetPart013Local46.integerState0838);
              sceneWidgetPart013Local46.sceneWidgetState0137.performAction1764(48, 0, integerLocal67, ComponentContainer.integerState0377, 200);
              stackIntegerLocal28 = (!MixedSupport097.booleanState0133) ? 200 : 250;
              regionExit1: {
                boolean frameCompletedLocal111 = true;
                boolean frameCompletedLocal112 = true;
                integerLocal103 = stackIntegerLocal28;
                sceneWidgetPart013Local46.sceneWidgetState0142.performAction1764(-2 + (-integerLocal103 + 365), 0, integerLocal67, ComponentContainer.integerState0377, integerLocal103);
                integerLocal71 = MixedSupport063.integerState0335;
                if (0 == (integerLocal102 & 1 << MixedSupport124.integerState0791)) {
                  while (true) {
                    if (0 != (integerLocal102 & 1 << MixedSupport124.integerState0789)) {
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
                      sceneWidgetPart013Local46.sceneWidgetState0143.performAction1764(rgbSpriteLocal73.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (rgbSpriteLocal73.integerState0254 + MixedSupport063.integerState0335);
                    }
                    if ((1 << ReturnedShape.integerState0696 & integerLocal102) != 0) {
                      rgbSpriteLocal91 = GameDomainSupport001.rgbSpriteArrayState0002[-1 + sceneWidgetPart013Local46.integerState0845];
                      sceneWidgetPart013Local46.sceneWidgetState0129.rgbSpriteState0070 = rgbSpriteLocal91;
                      sceneWidgetPart013Local46.sceneWidgetState0129.performAction1764(rgbSpriteLocal91.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport063.integerState0335 + rgbSpriteLocal91.integerState0254);
                    }
                    if ((1 << MixedSupport131.integerState0820 & integerLocal102) != 0) {
                      stackRgbSpriteArrayLocal33 = NodeHashTable.rgbSpriteArrayState0026;
                      if (!sceneWidgetPart013Local46.booleanState0208) {
                        stackIntegerLocal34 = 0;
                      } else {
                        stackIntegerLocal34 = 1;
                      }
                      rgbSpriteLocal92 = stackRgbSpriteArrayLocal33[stackIntegerLocal34];
                      sceneWidgetPart013Local46.sceneWidgetState0136.rgbSpriteState0070 = rgbSpriteLocal92;
                      sceneWidgetPart013Local46.sceneWidgetState0136.performAction1764(rgbSpriteLocal92.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport063.integerState0335 + rgbSpriteLocal92.integerState0254);
                    }
                    if (null == DualNode.rgbSpriteArrayArrayState0003) {
                      frameCompletedLocal112 = false;
                      break;
                    }
                    integerLocal75 = 0;
                    while (!(MixedSupport063.integerState0336 <= integerLocal75)) {
                      stackRgbSpriteArrayLocal29 = DualNode.rgbSpriteArrayArrayState0003[integerLocal75];
                      if (stackRgbSpriteArrayLocal29 != null &&
                        (integerLocal102 & 1 << MixedSupport132.integerState0822 + integerLocal75) != 0) {
                        rgbSpriteLocal93 = DualNode.rgbSpriteArrayArrayState0003[integerLocal75][sceneWidgetPart013Local46.byteArrayState0032[integerLocal75] & 255];
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal75].rgbSpriteState0070 = rgbSpriteLocal93;
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal75].performAction1764(rgbSpriteLocal93.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                        integerLocal71 = integerLocal71 + (rgbSpriteLocal93.integerState0254 + MixedSupport063.integerState0335);
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
                    sceneWidgetPart013Local46.sceneWidgetState0138.performAction1764(rgbSpriteLocal90.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                    integerLocal71 = integerLocal71 + (rgbSpriteLocal90.integerState0254 + MixedSupport063.integerState0335);
                    if (0 != (integerLocal102 & 1 << MixedSupport124.integerState0789)) {
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
                      sceneWidgetPart013Local46.sceneWidgetState0143.performAction1764(rgbSpriteLocal94.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (rgbSpriteLocal94.integerState0254 + MixedSupport063.integerState0335);
                    }
                    if ((1 << ReturnedShape.integerState0696 & integerLocal102) != 0) {
                      rgbSpriteLocal95 = GameDomainSupport001.rgbSpriteArrayState0002[-1 + sceneWidgetPart013Local46.integerState0845];
                      sceneWidgetPart013Local46.sceneWidgetState0129.rgbSpriteState0070 = rgbSpriteLocal95;
                      sceneWidgetPart013Local46.sceneWidgetState0129.performAction1764(rgbSpriteLocal95.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport063.integerState0335 + rgbSpriteLocal95.integerState0254);
                    }
                    if ((1 << MixedSupport131.integerState0820 & integerLocal102) != 0) {
                      stackRgbSpriteArrayLocal85 = NodeHashTable.rgbSpriteArrayState0026;
                      if (!sceneWidgetPart013Local46.booleanState0208) {
                        stackIntegerLocal100 = 0;
                      } else {
                        stackIntegerLocal100 = 1;
                      }
                      rgbSpriteLocal96 = stackRgbSpriteArrayLocal85[stackIntegerLocal100];
                      sceneWidgetPart013Local46.sceneWidgetState0136.rgbSpriteState0070 = rgbSpriteLocal96;
                      sceneWidgetPart013Local46.sceneWidgetState0136.performAction1764(rgbSpriteLocal96.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                      integerLocal71 = integerLocal71 + (MixedSupport063.integerState0335 + rgbSpriteLocal96.integerState0254);
                    }
                    if (null == DualNode.rgbSpriteArrayArrayState0003) {
                      break;
                    }
                    integerLocal110 = 0;
                    while (!(MixedSupport063.integerState0336 <= integerLocal110)) {
                      stackRgbSpriteArrayLocal83 = DualNode.rgbSpriteArrayArrayState0003[integerLocal110];
                      if (stackRgbSpriteArrayLocal83 != null &&
                        (integerLocal102 & 1 << MixedSupport132.integerState0822 + integerLocal110) != 0) {
                        rgbSpriteLocal97 = DualNode.rgbSpriteArrayArrayState0003[integerLocal110][sceneWidgetPart013Local46.byteArrayState0032[integerLocal110] & 255];
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal110].rgbSpriteState0070 = rgbSpriteLocal97;
                        sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal110].performAction1764(rgbSpriteLocal97.integerState0254, 0, 0, sceneWidgetPart013Local46.sceneWidgetState0142.integerState0915, integerLocal71);
                        integerLocal71 = integerLocal71 + (rgbSpriteLocal97.integerState0254 + MixedSupport063.integerState0335);
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
                while (!(MixedSupport063.integerState0336 <= integerLocal76)) {
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
              sceneWidgetPart013Local46.sceneWidgetState0133.performAction1764(sceneWidgetPart013Local46.integerState0896 - 365, 0, integerLocal67, ComponentContainer.integerState0377, 365);
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
                integerLocal109 = sceneWidgetPart013Local46.sceneWidgetState0135.bitmapFontState0020.lineCount(stringLocal79, sceneWidgetPart013Local46.integerState0896 - 2 * sceneWidgetPart013Local46.sceneWidgetState0135.integerState0893);
                sceneWidgetPart013Local46.sceneWidgetState0135.performAction1764(sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, integerLocal109 * ComponentContainer.integerState0377, 0);
                integerLocal67 = integerLocal67 + ComponentContainer.integerState0377 * integerLocal109;
              }
              if (sceneWidgetPart013Local46.booleanState0200) {
                sceneWidgetPart013Local46.sceneWidgetState0130.stringState0598 = NodeHashTableIterator.substituteIndexedPlaceholders(121, MixedSupport077.stringState0330, new String[]{stringLocal68});
                sceneWidgetPart013Local46.sceneWidgetState0130.performAction1764(-(2 * SecondaryNodeHashTable.integerState0540) + sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, ComponentContainer.integerState0377, SecondaryNodeHashTable.integerState0540);
                integerLocal67 = integerLocal67 + ComponentContainer.integerState0377;
              }
              if (sceneWidgetPart013Local46.booleanState0206) {
                sceneWidgetPart013Local46.sceneWidgetState0134.stringState0598 = NodeHashTableIterator.substituteIndexedPlaceholders(106, RenderingSupport012.stringState0440, new String[]{stringLocal68});
                sceneWidgetPart013Local46.sceneWidgetState0134.performAction1764(-(SecondaryNodeHashTable.integerState0540 * 2) + sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, ComponentContainer.integerState0377, SecondaryNodeHashTable.integerState0540);
                integerLocal67 = integerLocal67 + ComponentContainer.integerState0377;
              }
            }
            stringLocal70 = GameplayControls.computeString1751(stringLocal68, sceneWidgetPart013Local46.integerState0844, true);
            if (stringLocal70 != null) {
              integerLocal104 = sceneWidgetPart013Local46.sceneWidgetState0145.bitmapFontState0020.lineCount(stringLocal70, -SecondaryNodeHashTable.integerState0540 + (sceneWidgetPart013Local46.integerState0896 - SecondaryNodeHashTable.integerState0540));
              sceneWidgetPart013Local46.sceneWidgetState0145.integerState0917 = sceneWidgetPart013Local46.integerState0846 * 256 / MixedSupport089.integerState0547;
              sceneWidgetPart013Local46.sceneWidgetState0145.stringState0598 = stringLocal70;
              sceneWidgetPart013Local46.sceneWidgetState0145.performAction1764(-(SecondaryNodeHashTable.integerState0540 * 2) + sceneWidgetPart013Local46.integerState0896, 0, integerLocal67, integerLocal104 * ComponentContainer.integerState0377, SecondaryNodeHashTable.integerState0540);
              integerLocal67 = integerLocal67 + ComponentContainer.integerState0377 * integerLocal104;
            }
            if (integerLocal41 == 0) {
              sceneWidgetPart013Local46.integerState0895 = integerLocal67 - sceneWidgetPart013Local46.integerState0915;
            }
            if (integerLocal47 != 0) {
              MixedSupport047.sceneWidgetPart008State0003.sceneWidgetState0090.performAction1769((SceneWidget) (objectLocal45), sceneWidgetPart013Local46, 2, 0);
            }
            integerLocal105 = 0;
            while (integerLocal105 < MixedSupport063.integerState0336) {
              stackBooleanLocal36 = sceneWidgetPart013Local46.sceneWidgetArrayState0009[integerLocal105].booleanState0218;
              if (stackBooleanLocal36) {
                if (PlayerNamePrompt.stringArrayArrayState0003 != null) {
                  if (null == PlayerNamePrompt.stringArrayArrayState0003[integerLocal105]) {
                    stackStringLocal35 = null;
                  } else {
                    stackStringLocal35 = PlayerNamePrompt.stringArrayArrayState0003[integerLocal105][sceneWidgetPart013Local46.byteArrayState0032[integerLocal105] & 255];
                  }
                } else {
                  stackStringLocal35 = null;
                }
                stringLocal74 = stackStringLocal35;
                if (stringLocal74 != null) {
                  MixedSupport117.stringState0515 = AccountFieldStatusIndicator.stringArrayState0026[integerLocal105] + " - " + stringLocal74;
                } else {
                  MixedSupport117.stringState0515 = AccountFieldStatusIndicator.stringArrayState0026[integerLocal105];
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
              MixedSupport117.stringState0515 = MixedSupport056.stringState0240 + " - " + stringLocal72;
            }
            if (sceneWidgetPart013Local46.sceneWidgetState0136.booleanState0218) {
              if (sceneWidgetPart013Local46.booleanState0208) {
                stackStringLocal37 = MixedSupport020.stringState0094;
              } else {
                stackStringLocal37 = NodeHashTable.stringState0508;
              }
              MixedSupport117.stringState0515 = stackStringLocal37;
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
                stackStringLocal38 = MixedSupport143.stringState0602;
              }
              MixedSupport117.stringState0515 = stackStringLocal38;
            }
            if (sceneWidgetPart013Local46.sceneWidgetState0129.booleanState0218) {
              if (sceneWidgetPart013Local46.integerState0845 != 2) {
                stackStringLocal39 = MixedSupport009.stringState0039;
              } else {
                stackStringLocal39 = ConfirmedEmailAvailabilityValidator.stringState0537;
              }
              MixedSupport117.stringState0515 = stackStringLocal39;
            }
            boolean frameRemainderLocal113 = true;
            if (sceneWidgetPart013Local46.integerState0891 != 0 &&
              !sceneWidgetPart013Local46.computeBoolean1713((byte) 100)) {
              if (sceneWidgetPart013Local46.sceneWidgetState0140.integerState0891 != 0) {
                if (!sceneWidgetPart013Local46.booleanState0204 ||
                  sceneWidgetPart013Local46.booleanState0201 &&
                  (sceneWidgetPart013Local46.booleanState0205 ||
                  sceneWidgetPart013Local46.booleanState0200)) {
                  RenderingSupport002.performAction0241(sceneWidgetPart013Local46.getRoomId(-36), (byte) -9, integerArgument6);
                } else {
                  MixedSupport045.performAction0554(false, sceneWidgetPart013Local46.getRoomId(-87), integerArgument6);
                }
                frameRemainderLocal113 = false;
              }
              else {
                MixedSupport053.performAction0622(0, booleanArgument5, sceneWidgetPart013Local46, stringLocal68);
              }
            }
            sceneWidgetPart013Local46 = (LobbyRoomRow) (nodeDequeLocal43.nextBackward(true));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal114) {
          caughtExceptionLocal40 = caughtParameterLocal114;
          runtimeExceptionLocal42 = caughtExceptionLocal40;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal42), "client.S(" + integerArgument1 + ',' + integerArgument2 + ',' + booleanArgument3 + ',' + integerArgument4 + ',' + booleanArgument5 + ',' + integerArgument6 + ',' + byteArgument7 + ')');
        }
    }

    private final boolean advanceGameAssetLoading(int integerArgument1) {
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
            MixedSupport039.performAction0528((byte) -123);
            RichTextWidget.performAction1359(65.0f, integerArgument1 + 98, ReturnedShape.stringState0472);
            this.renderFrame(320);
            ModalDialogHost.networkSupport011State0001 = new SoundCache(ThemeTips.resourceArchiveState0009, MixedSupport005.resourceArchiveState0001);
            MixedSupport100.rawSoundState0016 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "fruit_step", integerArgument1 ^ 0);
            rawSoundState0005 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "cooked_fruit_step", 0);
            FullscreenStatusDialog.rawSoundState0010 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_loose_shape_rotate", 0);
            MixedSupport011.rawSoundState0004 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_loose_shape_land_squish", 0);
            MixedSupport039.rawSoundState0007 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_group_shape_land", 0);
            MouseWheelInput.rawSoundState0009 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "fruit_move", 0);
            MixedSupport145.rawSoundState0023 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_loose_tiles_pop", 0);
            MixedSupport112.rawSoundState0020 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_solid_tiles_pop2", 0);
            PlayerNameAvailabilityValidator.rawSoundArrayState0002[0] = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_combo_1", 0);
            PlayerNameAvailabilityValidator.rawSoundArrayState0002[1] = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_combo_2", integerArgument1 + 0);
            PlayerNameAvailabilityValidator.rawSoundArrayState0002[2] = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_combo_3", MixedSupport106.bitwiseXor(integerArgument1, 0));
            PlayerNameAvailabilityValidator.rawSoundArrayState0002[3] = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_combo_4", MixedSupport106.bitwiseXor(integerArgument1, 0));
            RenderingSupport001.rawSoundState0002 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_simultaneous_bonus2", 0);
            MixedSupport090.rawSoundState0015 = ModalDialogHost.networkSupport011State0001.getMusicSampleByName((byte) 101, "", "db_loose_drill");
            MixedSupport040.rawSoundState0008 = ModalDialogHost.networkSupport011State0001.getMusicSampleByName((byte) 101, "", "db_bucket_water_capsule2");
            TextHotspotBounds.rawSoundState0017 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_quake", integerArgument1 ^ 0);
            IsaacRandom.rawSoundState0006 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_special_item_explode", integerArgument1 ^ 0);
            pcmResamplerLocal24 = new PcmResampler(22050, 11025);
            TextHotspotBounds.rawSoundState0017 = TextHotspotBounds.rawSoundState0017.resample(pcmResamplerLocal24);
            IsaacRandom.rawSoundState0006 = IsaacRandom.rawSoundState0006.resample(pcmResamplerLocal24);
            SceneWidget.rawSoundState0022 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_poison", integerArgument1 ^ 0);
            MixedSupport103.rawSoundState0018 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_glass_lower", 0);
            SceneWidgetPart003.rawSoundArrayState0001[2] = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_bucket_glass_crack2_2", integerArgument1 + 0);
            SceneWidgetPart003.rawSoundArrayState0001[1] = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_bucket_glass_crack3", integerArgument1 + 0);
            SceneWidgetPart003.rawSoundArrayState0001[0] = ModalDialogHost.networkSupport011State0001.getMusicSampleByName((byte) 101, "", "db_bucket_glass_explode");
            FrameTimer.rawSoundState0011 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_bucket_explode", 0);
            LoginCredentials.rawSoundState0013 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_bucket_debris", 0);
            RenderingSupport001.rawSoundState0003 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_loose_shape_fall_looped", 0);
            PcmPlayerService.rawSoundState0019 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_loose_shape_fall_quake_looped", 0);
            MixedSupport006.rawSoundState0001 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_suck_into_machine", 0);
            ComponentContainer.rawSoundState0014 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "microwave_motor_2", 0);
            MixedSupport131.rawSoundState0021 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_shape_out_of_machine2", integerArgument1 ^ 0);
            SceneWidgetPart005.rawSoundState0012 = ModalDialogHost.networkSupport011State0001.getSoundEffectByName("", "db_last_shape_out", 0);
            ThemeTips.resourceArchiveState0009 = null;
            MixedSupport005.resourceArchiveState0001 = null;
            NodeDeque.performAction1737(true);
            return false;
          }
          if (MouseInput.resourceArchiveState0026 != null) {
            RichTextWidget.performAction1359(75.0f, -96, MixedSupport134.stringState0577);
            this.renderFrame(320);
            LoginCredentials.musicTrackState0004 = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Deko Bloko Titlescreen");
            MixedSupport113.musicTrackArrayArrayState0001[0][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Ant_and_Deko_remix_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[0][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Ant_and_Deko_remix_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[0][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Ant_and_Deko_remix_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[0][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Ant_and_Deko_remix_FINISH_THEM");
            MixedSupport113.musicTrackArrayArrayState0001[1][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Art_Deko_remix_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[1][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Art_Deko_remix_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[1][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Art_Deko_remix_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[1][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Art_Deko_remix_FINISH_THEM");
            MixedSupport113.musicTrackArrayArrayState0001[2][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Bokonosis!_remix_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[2][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Bokonosis!_remix_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[2][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Bokonosis!_remix_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[2][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Bokonosis!_remix_FINISH_THEM");
            MixedSupport113.musicTrackArrayArrayState0001[6][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Deko_Rating_remix_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[6][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Deko_Rating_remix_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[6][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Deko_Rating_remix_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[6][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Deko_Rating_remix_FINISH_THEM");
            MixedSupport113.musicTrackArrayArrayState0001[7][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/double_deko_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[7][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/double_deko_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[7][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/double_deko_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[7][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/double_deko_FINISH_THEM");
            MixedSupport113.musicTrackArrayArrayState0001[4][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/making_connections_remix_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[4][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/making_connections_remix_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[4][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/making_connections_remix_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[4][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/making_connections_remix_FINISH_THEM");
            MixedSupport113.musicTrackArrayArrayState0001[3][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Oh No Boko!_remix_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[3][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Oh No Boko!_remix_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[3][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Oh No Boko!_remix_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[3][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Oh No Boko!_remix_FINISH_THEM");
            MixedSupport113.musicTrackArrayArrayState0001[5][0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Swab the Deks!_remix_NORMAL");
            MixedSupport113.musicTrackArrayArrayState0001[5][1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Swab the Deks!_remix_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[5][2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Swab the Deks!_remix_REALLY_PANIC");
            MixedSupport113.musicTrackArrayArrayState0001[5][3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Swab the Deks!_remix_FINISH_THEM");
            IsaacRandom.musicTrackArrayState0001[0] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/momentum_remix_NORMAL");
            IsaacRandom.musicTrackArrayState0001[1] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/momentum_remix_PANIC");
            IsaacRandom.musicTrackArrayState0001[2] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/momentum_remix_REALLY_PANIC");
            IsaacRandom.musicTrackArrayState0001[3] = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/momentum_remix_FINISH_THEM");
            PlayerNamePrompt.musicTrackState0001 = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Deko Bloko Game Win");
            MixedSupport110.musicTrackState0006 = NetworkSupport008.computeMusicTrack1173(MouseInput.resourceArchiveState0026, 91, "", ModalDialogHost.networkSupport011State0001, "music/Deko Bloko Game Lose");
            MouseInput.resourceArchiveState0026 = null;
            NodeDeque.performAction1737(true);
            return false;
          }
          if (null == StandardContentDialog.resourceArchiveState0015) {
            if (MixedSupport020.resourceArchiveState0003 != null) {
              RenderingSupport003.performAction0570((byte) -93, new HuffmanCodec(MixedSupport020.resourceArchiveState0003.getFileByName(0, "huffman", "")));
              MixedSupport020.resourceArchiveState0003 = null;
              NodeDeque.performAction1737(true);
              return false;
            }
            MixedSupport011.performAction0155(320, MixedSupport094.rgbSpriteArrayState0020, Framebuffer.renderingSupport010State0001, true, SceneWidgetNode.renderingSupport010State0002, 20, integerArgument1, 4, 1, 20, 20, 20, DefaultTextWidgetRenderer.rgbSpriteArrayState0001, 14, 480, 240, CacheWorkQueue.rgbSpriteArrayState0016, 32, 16, 0, 5);
            FrameTimer.performAction0709(MixedSupport094.rgbSpriteArrayState0020, SceneWidgetNode.renderingSupport010State0002, DefaultTextWidgetRenderer.rgbSpriteArrayState0001, 320, 20, 0, 32, 20, 240, 4, 5, 20, Framebuffer.renderingSupport010State0001, CacheWorkQueue.rgbSpriteArrayState0016, 1, 14, 10406, 0, 16, 20);
            ComponentContainer.renderingSupport007State0006 = MixedSupport033.computeRenderingSupport0070497(false, false, 0, false, false, 32357, false, false);
            FunOrbClient.performAction0104(50, -27096);
            MixedSupport076.performAction0945((byte) 86, 50);
            MixedSupport004.performAction0051(integerArgument1 + 4, 50);
            MixedSupport087.performAction1134(256, LoginCredentials.musicTrackState0004, true);
            NodeDeque.performAction1737(true);
            return true;
          }
          RichTextWidget.performAction1359(90.0f, 96, MixedSupport136.stringState0582);
          this.renderFrame(320);
          DraggableWidgetContainer.renderingSupport009State0005 = MixedSupport016.computeRenderingSupport0090204("", GameSession.resourceArchiveState0019, MixedSupport005.resourceArchiveState0002, (byte) 108, "arial13");
          indexedSpriteArrayLocal25 = ResizableModalDialog.computeIndexedSpriteArray1554("", MixedSupport005.resourceArchiveState0002, false, "arialbold14");
          byteArrayLocal26 = GameSession.resourceArchiveState0019.getFileByName(0, "", "arialbold14");
          SceneWidget.renderingSupport009State0007 = RenderingSupport004.computeRenderingSupport0090580(indexedSpriteArrayLocal25, 55, byteArrayLocal26);
          SceneWidgetNode.renderingSupport010State0002 = RenderingSupport003.computeRenderingSupport0100569((byte) -49, 16777215, 1, indexedSpriteArrayLocal25, byteArrayLocal26, 1);
          indexedSpriteArrayLocal27 = ResizableModalDialog.computeIndexedSpriteArray1554("tinybloko", EmailFormatValidator.resourceArchiveState0008, false, "");
          byteArrayLocal28 = StandardContentDialog.resourceArchiveState0015.getFileByName(integerArgument1 ^ 0, "tinybloko", "");
          RenderingSupport006.renderingSupport009State0003 = RenderingSupport004.computeRenderingSupport0090580(indexedSpriteArrayLocal27, integerArgument1 ^ 111, byteArrayLocal28);
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
                DefaultTextWidgetRenderer.renderingSupport009State0001 = RenderingSupport004.computeRenderingSupport0090580(indexedSpriteArrayLocal27, integerArgument1 ^ 103, byteArrayLocal28);
                Framebuffer.renderingSupport010State0001 = RenderingSupport003.computeRenderingSupport0100569((byte) 100, 16694016, 2, indexedSpriteArrayLocal27, byteArrayLocal28, 1);
                Framebuffer.renderingSupport010State0001.integerArrayArrayState0018[1] = new int[]{0, 16777215, 1};
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
                  GameApplet.renderingSupport009State0002 = RenderingSupport004.computeRenderingSupport0090580(indexedSpriteArrayLocal27, 121, byteArrayLocal28);
                  DefaultTextWidgetRenderer.rgbSpriteArrayState0001 = ProxyAuthenticationRequiredException.computeRgbSpriteArray0334("ui_frame_vbrick", "ui_frame_hbrick", EmailFormatValidator.resourceArchiveState0008, true, "ui_frame_corner");
                  MixedSupport094.rgbSpriteArrayState0020 = InteractiveComponent.computeRgbSpriteArray0463("ui_button_up", "", integerArgument1 ^ -95, EmailFormatValidator.resourceArchiveState0008);
                  CacheWorkQueue.rgbSpriteArrayState0016 = InteractiveComponent.computeRgbSpriteArray0463("ui_button_highlight", "", -114, EmailFormatValidator.resourceArchiveState0008);
                  UiComponent.rgbSpriteArrayState0005 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "chat_toggle_button");
                  MixedSupport046.rgbSpriteArrayState0015 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "chat_toggle_button_highlight");
                  MixedSupport138.rgbSpriteState0063 = DropTargetWidgetContainer.computeRgbSprite0704(MixedSupport005.resourceArchiveState0002, "unachieved", "basic", 8192);
                  MouseInput.rgbSpriteState0072 = DropTargetWidgetContainer.computeRgbSprite0704(MixedSupport005.resourceArchiveState0002, "locked", "basic", integerArgument1 + 8192);
                  ProxyAuthenticationRequiredException.rgbSpriteState0011 = new RgbSprite(32, 32);
                  ProxyAuthenticationRequiredException.rgbSpriteState0011.bindAsRenderTarget();
                  MixedSupport138.rgbSpriteState0063.drawDownscaledAreaAveraged(0, 0, 32, 32);
                  MixedSupport047.rgbSpriteState0018 = new RgbSprite(32, 32);
                  MixedSupport047.rgbSpriteState0018.bindAsRenderTarget();
                  MouseInput.rgbSpriteState0072.drawDownscaledAreaAveraged(0, 0, 32, 32);
                  MixedSupport076.framebufferState0001.performAction0420((byte) -84);
                  break;
                }
                byteArrayLocal28[integerLocal29] = (byte)(byteArrayLocal28[integerLocal29] * 3 / 2);
                integerLocal29++;
              } while (integerLocal10 == 0);
              rgbSpriteLocal30 = DropTargetWidgetContainer.computeRgbSprite0704(MixedSupport005.resourceArchiveState0002, "orbcoin", "basic", 8192);
              MixedSupport111.rgbSpriteState0052 = new RgbSprite(20, 20);
              MixedSupport111.rgbSpriteState0052.bindAsRenderTarget();
              rgbSpriteLocal30.drawDownscaledAreaAveraged(0, 0, 20, 20);
              MixedSupport076.framebufferState0001.performAction0420((byte) -106);
              objectLocal31 = null;
              MixedSupport047.indexedSpriteArrayState0003 = ResizableModalDialog.computeIndexedSpriteArray1554("solid_mask", EmailFormatValidator.resourceArchiveState0008, false, "");
              MixedSupport089.rgbSpriteArrayState0019 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "pop");
              BirthDateValidator.rgbSpriteArrayState0022 = NodeHashTable.computeRgbSpriteArray1501(integerArgument1 ^ 25972, false, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "explode"), false);
              MixedSupport106.rgbSpriteState0047 = NetworkSupport007.computeRgbSprite1040(DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "wildcard", "", 8192), false, (byte) -28, false);
              AgeValidator.rgbSpriteState0026 = MixedSupport106.rgbSpriteState0047.copy();
              rgbSpriteArrayLocal33 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "specialitems");
              integerLocal35 = 0;
              scanLoop1: while (true) {
                if (integerLocal35 < 6) {
                  stackIntegerLocal15 = 0;
                  if (integerLocal10 != 0) {
                    break scanLoop1;
                  }
                  integerLocal36 = stackIntegerLocal15;
                  while (4 > integerLocal36) {
                    MixedSupport062.rgbSpriteArrayArrayState0008[integerLocal35][integerLocal36] = NetworkSupport007.computeRgbSprite1040(rgbSpriteArrayLocal33[integerLocal35 * 4 + integerLocal36], false, (byte) -55, false);
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
                  rgbSpriteArrayLocal33 = MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, EmailFormatValidator.resourceArchiveState0008, "", DisplayModeController.stringArrayState0038[integerLocal35] + "_tiles");
                  stackIntegerLocal20 = 0;
                  frameRemainderLocal58 = (integerLocal10 == 0);
                  if (frameRemainderLocal58) {
                    integerLocal36 = stackIntegerLocal20;
                    while (7 > integerLocal36) {
                      MixedSupport035.rgbSpriteArrayArrayState0006[integerLocal35][integerLocal36] = NetworkSupport007.computeRgbSprite1040(rgbSpriteArrayLocal33[integerLocal36], false, (byte) -63, false);
                      integerLocal36++;
                    }
                    MixedSupport035.rgbSpriteArrayArrayState0006[integerLocal35][7] = AgeValidator.rgbSpriteState0026;
                    integerLocal36 = 0;
                    scanLoop2: while (true) {
                      stackIntegerLocal17 = -8;
                      if (stackIntegerLocal17 < ~integerLocal36) {
                        rgbSpriteLocal39 = NetworkSupport007.computeRgbSprite1040(rgbSpriteArrayLocal33[integerLocal36 + 7], true, (byte) -124, true);
                        stackIntegerLocal16 = 0;
                        integerLocal41 = stackIntegerLocal16;
                        scanLoop3: while (true) {
                          stackIntegerLocal18 = -17;
                          stackIntegerLocal19 = ~integerLocal41;
                          if (stackIntegerLocal18 < stackIntegerLocal19) {
                            rgbSpriteLocal44 = rgbSpriteLocal39.copy();
                            rgbSpriteLocal44.bindAsRenderTarget();
                            MixedSupport035.rgbSpriteArrayArrayState0006[integerLocal35][integerLocal36].drawDownscaledAreaBlended(6, 6, 24, 24);
                            rgbSpriteLocal39.drawWithOpacity(0, 0, 128);
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
                            MixedSupport090.rgbSpriteArrayArrayArrayState0001[integerLocal35][integerLocal36][integerLocal41] = rgbSpriteLocal44;
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
                    SceneWidgetPart010.rgbSpriteArrayState0025[integerLocal35] = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, DisplayModeController.stringArrayState0038[integerLocal35] + "_bucketback", "", 8192);
                    SceneWidgetPart010.rgbSpriteArrayState0025[integerLocal35].normalizeCanvas();
                    integerLocal35++;
                    continue;
                  }
                }
                if (frameRemainderLocal58) {
                  MixedSupport076.framebufferState0001.performAction0420((byte) -114);
                  stackIntegerLocal20 = 0;
                }
                integerLocal35 = stackIntegerLocal20;
                boolean naturalLoopExitLocal59 = false;
                while (!(naturalLoopExitLocal59 = (8 <= integerLocal35))) {
                  stackByteArrayLocal21 = MixedSupport031.resourceArchiveState0005.getFileByName(integerArgument1 + 0, "", DisplayModeController.stringArrayState0038[integerLocal35] + ".jpg");
                  if (integerLocal10 == 0) {
                    byteArrayLocal37 = stackByteArrayLocal21;
                    NanoFrameTimer.rgbSpriteArrayState0009[integerLocal35] = new RgbSprite(byteArrayLocal37, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
                    integerLocal35++;
                    continue;
                  }
                  break;
                }
                if (naturalLoopExitLocal59) {
                  stackByteArrayLocal21 = MixedSupport031.resourceArchiveState0005.getFileByName(integerArgument1 + 0, "", "menu2.jpg");
                }
                byteArrayLocal34 = stackByteArrayLocal21;
                SceneWidgetPart011.rgbSpriteState0058 = new RgbSprite(byteArrayLocal34, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
                byteArrayLocal53 = MixedSupport031.resourceArchiveState0005.getFileByName(0, "", "achievements.jpg");
                CipherPacketBuffer.rgbSpriteArrayState0030 = MixedSupport036.computeRgbSpriteArray0506(31, new RgbSprite(byteArrayLocal53, (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001)), -10241);
                rgbSpriteArrayLocal40 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "achievements");
                integerLocal41 = 0;
                while (integerLocal41 < 31) {
                  rgbSpriteArrayLocal40[integerLocal41].normalizeCanvas();
                  SceneWidgetPart007.performAction1050(0, rgbSpriteArrayLocal40[integerLocal41], CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal41]);
                  rgbSpriteArrayLocal40[integerLocal41] = null;
                  integerLocal41++;
                  if (integerLocal10 == 0) {
                    continue;
                  }
                  break;
                }
                rgbSpriteArrayLocal54 = null;
                ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0029 = new RgbSprite[31];
                integerLocal41 = 0;
                do {
                  if (integerLocal41 >= 31) {
                    MixedSupport076.framebufferState0001.performAction0420((byte) -108);
                    MixedSupport100.rgbSpriteState0042 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_clouds", "", 8192);
                    DelegatingCanvas.rgbSpriteState0013 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_tl", "", 8192);
                    GameDomainSupport004.rgbSpriteState0024 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_t", "", 8192);
                    MixedSupport116.rgbSpriteState0056 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_tr", "", 8192);
                    MixedSupport042.rgbSpriteState0016 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_l", "", integerArgument1 ^ 8192);
                    TextFieldValidator.rgbSpriteState0076 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_r", "", 8192);
                    MixedSupport138.rgbSpriteState0064 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_bl", "", 8192);
                    MixedSupport100.rgbSpriteState0041 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_b", "", 8192);
                    MixedSupport144.rgbSpriteState0071 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_border_br", "", integerArgument1 ^ 8192);
                    GameDomainSupport006.rgbSpriteState0075 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_menu_title", "", 8192);
                    LobbyRoomRow.rgbSpriteState0062 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "ui_lobby_logo", "", 8192);
                    MixedSupport061.rgbSpriteState0021 = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, MixedSupport131.stringState0567, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 107);
                    MixedSupport146.rgbSpriteState0074 = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, MixedSupport006.stringState0028, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 120);
                    rgbSpriteArrayState0007[0] = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, BirthDateChatEnableForm.stringState0350, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 120);
                    rgbSpriteArrayState0007[1] = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, BirthDateValidator.stringState0447, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 114);
                    rgbSpriteArrayState0007[2] = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, ResourceSupport001.stringState0013, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 104);
                    MixedSupport086.rgbSpriteState0036 = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, LabeledWidgetContainer.stringState0109, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 102);
                    MixedSupport073.rgbSpriteState0029 = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, CacheWorkQueue.stringState0265, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 99);
                    ResourceSupport001.rgbSpriteState0004 = SceneWidgetPart007.computeRgbSprite1049(16776192, 16743168, MixedSupport124.stringState0542, RenderingSupport006.renderingSupport009State0003, 6, 0, (byte) 88);
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[0] = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "fruit_buckettop");
                    ByteArrayPoolSupport.rgbSpriteArrayArrayState0012[0] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "fruit_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[0] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "fruit_leftsidetex"), true);
                    NineSliceSprite.indexedSpriteArrayArrayState0001[0] = ResizableModalDialog.computeIndexedSpriteArray1554("fruit_leftmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    MixedSupport107.rgbSpriteArrayArrayState0009[0] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "fruit_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[0] = NodeHashTable.computeRgbSpriteArray1501(MixedSupport106.bitwiseXor(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "fruit_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[0] = ResizableModalDialog.computeIndexedSpriteArray1554("fruit_rightmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[0] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "fruit_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[0] = ResizableModalDialog.computeIndexedSpriteArray1554("fruit_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[1] = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "animals_buckettop");
                    cachedRgbSpriteArrayLocal1 = NodeHashTable.computeRgbSpriteArray1501(25972, false, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "animals_sidespr"), true);
                    MixedSupport107.rgbSpriteArrayArrayState0010[1] = cachedRgbSpriteArrayLocal1;
                    BoundedRandomAccessFile.rgbSpriteArrayArrayState0007[1] = cachedRgbSpriteArrayLocal1;
                    HashNode.rgbSpriteArrayArrayState0004[1] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, EmailFormatValidator.resourceArchiveState0008, "", "animals_bottomspecial"), false);
                    MixedSupport041.indexedSpriteArrayArrayState0002[1] = ResizableModalDialog.computeIndexedSpriteArray1554("animals_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[2] = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "breakfast_buckettop");
                    ByteArrayPoolSupport.rgbSpriteArrayArrayState0012[2] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "breakfast_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[2] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "breakfast_leftsidetex"), true);
                    NineSliceSprite.indexedSpriteArrayArrayState0001[2] = ResizableModalDialog.computeIndexedSpriteArray1554("breakfast_leftmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    MixedSupport107.rgbSpriteArrayArrayState0009[2] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "breakfast_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[2] = NodeHashTable.computeRgbSpriteArray1501(MixedSupport106.bitwiseXor(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "breakfast_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[2] = ResizableModalDialog.computeIndexedSpriteArray1554("breakfast_rightmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[2] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "breakfast_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[2] = ResizableModalDialog.computeIndexedSpriteArray1554("breakfast_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[3] = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "bugs_buckettop");
                    cachedRgbSpriteArrayLocal2 = NodeHashTable.computeRgbSpriteArray1501(25972, false, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "bugs_sidespr"), true);
                    MixedSupport107.rgbSpriteArrayArrayState0010[3] = cachedRgbSpriteArrayLocal2;
                    BoundedRandomAccessFile.rgbSpriteArrayArrayState0007[3] = cachedRgbSpriteArrayLocal2;
                    HashNode.rgbSpriteArrayArrayState0004[3] = NodeHashTable.computeRgbSpriteArray1501(MixedSupport106.bitwiseXor(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, EmailFormatValidator.resourceArchiveState0008, "", "bugs_bottomspecial"), false);
                    MixedSupport041.indexedSpriteArrayArrayState0002[3] = ResizableModalDialog.computeIndexedSpriteArray1554("bugs_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[4] = MixedSupport011.computeRgbSpriteArray0154(MixedSupport106.bitwiseXor(integerArgument1, 112), EmailFormatValidator.resourceArchiveState0008, "", "flowers_buckettop");
                    ByteArrayPoolSupport.rgbSpriteArrayArrayState0012[4] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "flowers_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[4] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(MixedSupport106.bitwiseXor(integerArgument1, 112), EmailFormatValidator.resourceArchiveState0008, "", "flowers_leftsidetex"), true);
                    NineSliceSprite.indexedSpriteArrayArrayState0001[4] = ResizableModalDialog.computeIndexedSpriteArray1554("flowers_leftmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    MixedSupport107.rgbSpriteArrayArrayState0009[4] = NodeHashTable.computeRgbSpriteArray1501(MixedSupport106.bitwiseXor(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "flowers_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[4] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "flowers_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[4] = ResizableModalDialog.computeIndexedSpriteArray1554("flowers_rightmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[4] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "flowers_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[4] = ResizableModalDialog.computeIndexedSpriteArray1554("flowers_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[5] = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "undersea_buckettop");
                    cachedRgbSpriteArrayLocal3 = NodeHashTable.computeRgbSpriteArray1501(25972, false, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "undersea_sidespr"), true);
                    MixedSupport107.rgbSpriteArrayArrayState0010[5] = cachedRgbSpriteArrayLocal3;
                    BoundedRandomAccessFile.rgbSpriteArrayArrayState0007[5] = cachedRgbSpriteArrayLocal3;
                    HashNode.rgbSpriteArrayArrayState0004[5] = NodeHashTable.computeRgbSpriteArray1501(MixedSupport106.bitwiseXor(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "undersea_bottomspecial"), false);
                    MixedSupport041.indexedSpriteArrayArrayState0002[5] = ResizableModalDialog.computeIndexedSpriteArray1554("undersea_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[6] = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "city_buckettop");
                    ByteArrayPoolSupport.rgbSpriteArrayArrayState0012[6] = NodeHashTable.computeRgbSpriteArray1501(integerArgument1 + 25972, true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, EmailFormatValidator.resourceArchiveState0008, "", "city_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[6] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "city_leftsidetex"), true);
                    NineSliceSprite.indexedSpriteArrayArrayState0001[6] = ResizableModalDialog.computeIndexedSpriteArray1554("city_leftmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    MixedSupport107.rgbSpriteArrayArrayState0009[6] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "city_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[6] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(MixedSupport106.bitwiseXor(integerArgument1, 112), EmailFormatValidator.resourceArchiveState0008, "", "city_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[6] = ResizableModalDialog.computeIndexedSpriteArray1554("city_rightmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[6] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "city_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[6] = ResizableModalDialog.computeIndexedSpriteArray1554("city_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    LobbyRoomRow.rgbSpriteArrayArrayState0013[7] = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "eightbit_buckettop");
                    ByteArrayPoolSupport.rgbSpriteArrayArrayState0012[7] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "eightbit_lefttex"), true);
                    GameDomainSupport001.rgbSpriteArrayArrayState0002[7] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, EmailFormatValidator.resourceArchiveState0008, "", "eightbit_leftsidetex"), true);
                    NineSliceSprite.indexedSpriteArrayArrayState0001[7] = ResizableModalDialog.computeIndexedSpriteArray1554("eightbit_leftmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    MixedSupport107.rgbSpriteArrayArrayState0009[7] = NodeHashTable.computeRgbSpriteArray1501(25972, true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "eightbit_righttex"), true);
                    SecondaryNodeDequeIterator.rgbSpriteArrayArrayState0005[7] = NodeHashTable.computeRgbSpriteArray1501(MixedSupport106.bitwiseXor(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(MixedSupport106.bitwiseXor(integerArgument1, 112), EmailFormatValidator.resourceArchiveState0008, "", "eightbit_rightsidetex"), true);
                    ProxySocketFactory.indexedSpriteArrayArrayState0003[7] = ResizableModalDialog.computeIndexedSpriteArray1554("eightbit_rightmask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    ResourceSupport001.rgbSpriteArrayArrayState0001[7] = NodeHashTable.computeRgbSpriteArray1501(MixedSupport106.bitwiseXor(integerArgument1, 25972), true, MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "eightbit_bottomtex"), true);
                    MixedSupport041.indexedSpriteArrayArrayState0002[7] = ResizableModalDialog.computeIndexedSpriteArray1554("eightbit_bottommask", EmailFormatValidator.resourceArchiveState0008, false, "");
                    break;
                  }
                  ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0029[integerLocal41] = new RgbSprite(32, 32);
                  ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0029[integerLocal41].bindAsRenderTarget();
                  CipherPacketBuffer.rgbSpriteArrayState0030[integerLocal41].drawDownscaledAreaAveraged(0, 0, 32, 32);
                  integerLocal41++;
                } while (integerLocal10 == 0);
                integerLocal41 = 0;
                scanLoop4: while (true) {
                  if (integerLocal41 < 8) {
                    MixedSupport094.performAction1202(ByteArrayPoolSupport.rgbSpriteArrayArrayState0012[integerLocal41], 19264);
                    MixedSupport094.performAction1202(MixedSupport107.rgbSpriteArrayArrayState0009[integerLocal41], integerArgument1 + 19264);
                    MixedSupport094.performAction1202(ResourceSupport001.rgbSpriteArrayArrayState0001[integerLocal41], 19264);
                    IterableNodeCollection.performAction1658(NineSliceSprite.indexedSpriteArrayArrayState0001[integerLocal41], (byte) 115);
                    IterableNodeCollection.performAction1658(ProxySocketFactory.indexedSpriteArrayArrayState0003[integerLocal41], (byte) -118);
                    IterableNodeCollection.performAction1658(MixedSupport041.indexedSpriteArrayArrayState0002[integerLocal41], (byte) 114);
                    stackIntegerLocal22 = 0;
                    if (integerLocal10 != 0) {
                      break scanLoop4;
                    }
                    integerLocal43 = stackIntegerLocal22;
                    while (integerLocal43 < LobbyRoomRow.rgbSpriteArrayArrayState0013[integerLocal41].length) {
                      LobbyRoomRow.rgbSpriteArrayArrayState0013[integerLocal41][integerLocal43].normalizeCanvas();
                      integerLocal43++;
                    }
                    integerLocal41++;
                    continue scanLoop4;
                  }
                  CipherPacketBuffer.rgbSpriteState0061 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_buttons1", "", 8192);
                  MixedSupport013.rgbSpriteState0007 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_front", "", integerArgument1 ^ 8192);
                  MixedSupport016.rgbSpriteState0010 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_glass", "", 8192);
                  MixedSupport027.rgbSpriteState0014 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_glasslit", "", integerArgument1 ^ 8192);
                  ContentTransitionDialog.rgbSpriteState0009 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_lights1", "", 8192);
                  FullscreenNoticeType.rgbSpriteState0033 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_mouth", "", 8192);
                  MixedSupport002.rgbSpriteState0002 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_next", "", integerArgument1 + 8192);
                  EmailValidationError.rgbSpriteState0023 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_nextlit", "", 8192);
                  GameDomainSupport001.rgbSpriteState0006 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_pipe", "", 8192);
                  MixedSupport124.rgbSpriteState0059 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "machine_portal", "", integerArgument1 + 8192);
                  MixedSupport009.integerArrayState0015 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "blobmatch_scorecols", "", 8192).integerArrayState0024;
                  DefaultTextWidgetRenderer.integerArrayState0002 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "eliminatetile_scorecols", "", integerArgument1 ^ 8192).integerArrayState0024;
                  LoginCredentials.integerArrayState0115 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "simultaneous_scorecols", "", 8192).integerArrayState0024;
                  TextLineMetrics.integerArrayState0167 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "chain_scorecols", "", 8192).integerArrayState0024;
                  NetworkSupport008.integerArrayState0176 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "bomb_scorecols", "", integerArgument1 ^ 8192).integerArrayState0024;
                  Bzip2State.integerArrayState0252 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "bombardmessagecols", "", 8192).integerArrayState0024;
                  StandardContentDialog.rgbSpriteArrayState0021 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "instructions_keys");
                  ComponentDecorator.rgbSpriteState0034 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "instructions_arrow", "", 8192);
                  NetworkSupport001.rgbSpriteState0005 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "instructions_inmultiplayer", "", 8192);
                  MixedSupport077.rgbSpriteState0032 = DropTargetWidgetContainer.computeRgbSprite0704(EmailFormatValidator.resourceArchiveState0008, "instructions_insingleplayer", "", integerArgument1 + 8192);
                  stackIntegerLocal22 = 5;
                  break;
                }
                rgbSpriteArrayArrayLocal42 = new RgbSprite[stackIntegerLocal22][];
                rgbSpriteArrayArrayLocal45 = new RgbSprite[5][];
                cachedRgbSpriteArrayLocal4 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "bucketsize_icons");
                rgbSpriteArrayArrayLocal45[0] = cachedRgbSpriteArrayLocal4;
                rgbSpriteArrayArrayLocal42[0] = cachedRgbSpriteArrayLocal4;
                cachedRgbSpriteArrayLocal5 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "speed_icons");
                rgbSpriteArrayArrayLocal45[1] = cachedRgbSpriteArrayLocal5;
                rgbSpriteArrayArrayLocal42[1] = cachedRgbSpriteArrayLocal5;
                cachedRgbSpriteArrayLocal6 = MixedSupport011.computeRgbSpriteArray0154(integerArgument1 + 112, EmailFormatValidator.resourceArchiveState0008, "", "shapefeedback_icons");
                rgbSpriteArrayArrayLocal45[4] = cachedRgbSpriteArrayLocal6;
                rgbSpriteArrayArrayLocal42[4] = cachedRgbSpriteArrayLocal6;
                GzipDecompressor.rgbSpriteArrayState0018 = cachedRgbSpriteArrayLocal6;
                cachedRgbSpriteArrayLocal7 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "colours_icons");
                rgbSpriteArrayArrayLocal45[2] = cachedRgbSpriteArrayLocal7;
                rgbSpriteArrayArrayLocal42[2] = cachedRgbSpriteArrayLocal7;
                cachedRgbSpriteArrayLocal8 = MixedSupport011.computeRgbSpriteArray0154(112, EmailFormatValidator.resourceArchiveState0008, "", "specialitems_icons");
                rgbSpriteArrayArrayLocal45[3] = cachedRgbSpriteArrayLocal8;
                rgbSpriteArrayArrayLocal42[3] = cachedRgbSpriteArrayLocal8;
                MixedSupport010.performAction0143(Bzip2State.byteArrayState0040, MixedSupport085.integerArrayState0166, NodeHashTable.stringArrayState0045, MixedSupport099.byteArrayState0020, 8, IconLabelWidget.stringArrayArrayState0007, MixedSupport005.resourceArchiveState0002, 5, 25150, GameSession.resourceArchiveState0019, rgbSpriteArrayArrayLocal42, rgbSpriteArrayArrayLocal45, true, BirthDateInput.resourceArchiveState0024, MixedSupport121.stringArrayArrayState0008);
                MixedSupport050.performAction0596(-3504, 200);
                BirthDateValidator.performAction1354(MixedSupport005.resourceArchiveState0002, GameSession.resourceArchiveState0019, -96);
                ReturnedShape.performAction1434(MixedSupport003.stringArrayState0001, 0, 180, -94, 16694016, (java.applet.Applet) (this));
                GameSession.resourceArchiveState0019 = null;
                StandardContentDialog.resourceArchiveState0015 = null;
                NodeDeque.performAction1737(true);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException caughtParameterLocal60) {
          caughtExceptionLocal23 = caughtParameterLocal60;
          runtimeExceptionLocal9 = caughtExceptionLocal23;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal9), "client.T(" + integerArgument1 + ')');
        }
    }

    final static boolean isPasswordLengthInvalid(int integerArgument1, String stringArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (integerArgument1 <= 79) {
            DekoBlokoClient.getEmailValidationError((String) null, -100);
          }
          if (null != stringArgument2 &&
            stringArgument2.length() >= MixedSupport081.integerState0501 &&
            stringArgument2.length() <= NanoFrameTimer.integerState0153) {
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public final void init() {
        try {
          this.startWithDefaultSize(-2990, 32, "dekobloko");
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "client.init()");
        }
    }

    static {
        byteArrayState0004 = new byte[65536];
        ArrayBlockSupport.performAction0072(byteArrayState0004, 0, 65536, (byte) -128);
        stringState0095 = "Theme <%0> strategy";
        stringState0096 = "Show all private chat";
        rgbSpriteArrayState0007 = new RgbSprite[3];
        stringState0097 = "Use this alternative as your account name";
    }
}
