/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static IndexedSprite[] field_b;
    static SpriteWidget field_d;
    static SpriteWidget field_a;
    static int[] field_c;

    abstract void setBytes(byte[] param0, byte param1);

    final static int getFramesPerSecond(byte param0) {
        if (param0 != 5) {
          ByteStorage.releaseStatics(109);
        }
        return (int)(1000000000L / ReflectionCheckHelpers.field_f);
    }

    final static int performAccountServerRequest(int param0, boolean param1, int param2, boolean param3, String param4, ConditionalTextValue param5, ConditionalTextValue param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer stackIn_11_0 = null;
        String stackIn_12_1 = null;
        PacketBuffer stackIn_14_0 = null;
        String stackIn_15_1 = null;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          var14 = param5.getText(-127);
          var8 = param6.getText(-127);
          if (QuickChatMenu.field_Ub == null &&
            !DraggableWidget.pollGameSocketConnection(-111, false)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (LoginCredentialType.field_c == DigestHelpers.field_a) {
            ViewControlStrings.field_b = null;
            IterableNodeHashTable.field_g.position = 0;
            if (param4 != null) {
              var9 = 0;
              FadingModalPanel.field_D.position = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
              FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
              FadingModalPanel.field_D.writeZeroPrefixedString(var14, (byte) -87);
              FadingModalPanel.field_D.writeZeroPrefixedString(var8, (byte) -125);
              var15 = (CharSequence) ((Object) param4);
              FadingModalPanel.field_D.writeZeroPrefixedString(HelpPopup.sanitizeAccountName((byte) 51, var15), (byte) 118);
              FadingModalPanel.field_D.writeShort((byte) -88, param0);
              FadingModalPanel.field_D.writeByte(param2, -69);
              FadingModalPanel.field_D.writeByte(var9, -66);
              IterableNodeHashTable.field_g.writeByte(18, 105);
              IterableNodeHashTable.field_g.position = IterableNodeHashTable.field_g.position + 2;
              var10 = IterableNodeHashTable.field_g.position;
              var11_ref_String = ProgressMessageDialog.readSettingsCookie(-25, ContentTransitionDialog.getApplet((byte) 41));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              IterableNodeHashTable.field_g.writeString(var11_ref_String, (byte) -75);
              StatefulWidgetPainter.writeEncryptedPayload(LoginRsaKey.field_a, FadingModalPanel.field_D, IterableNodeHashTable.field_g, DisplayModeInfo.field_i, 0);
              IterableNodeHashTable.field_g.backpatchShortLength(-var10 + IterableNodeHashTable.field_g.position, -3991);
            } else {
              FadingModalPanel.field_D.position = 0;
              FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
              FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
              stackIn_11_0 = FadingModalPanel.field_D;
              if (param5.isSelected(0)) {
                stackIn_12_1 = var14;
              } else {
                stackIn_12_1 = "";
              }
              ((PacketBuffer) (Object) stackIn_11_0).writeZeroPrefixedString(stackIn_12_1, (byte) 109);
              stackIn_14_0 = FadingModalPanel.field_D;
              if (!param6.isSelected(0)) {
                stackIn_15_1 = "";
              } else {
                stackIn_15_1 = var8;
              }
              ((PacketBuffer) (Object) stackIn_14_0).writeZeroPrefixedString(stackIn_15_1, (byte) -32);
              IterableNodeHashTable.field_g.writeByte(16, -90);
              IterableNodeHashTable.field_g.position = IterableNodeHashTable.field_g.position + 1;
              var9 = IterableNodeHashTable.field_g.position;
              StatefulWidgetPainter.writeEncryptedPayload(LoginRsaKey.field_a, FadingModalPanel.field_D, IterableNodeHashTable.field_g, DisplayModeInfo.field_i, 0);
              IterableNodeHashTable.field_g.backpatchByteLength(IterableNodeHashTable.field_g.position - var9, -1);
            }
            DateOfBirthValidator.flushPackets(-1, -1);
            DigestHelpers.field_a = MouseInputHandler.field_e;
          }
          if (MouseInputHandler.field_e == DigestHelpers.field_a &&
            FrameSkin.fillIncomingBuffer(1, 0)) {
            var9Lifetime1 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
            ProgressMessageDialog.field_qb.position = 0;
            if (100 <= var9Lifetime1 &&
              105 >= var9Lifetime1) {
              GameOptions.field_b = new String[-100 + var9Lifetime1];
              DigestHelpers.field_a = AgeValidator.field_n;
            } else {
              if (var9Lifetime1 == 248) {
                ArchiveIndex.setTuhstatbutCookie(ContentTransitionDialog.getApplet((byte) -112), 20298);
                GameKeyHandler.field_g = RasterBuffer.field_a;
                MenuInputState.closeGameConnection(false);
                CameraAndLogoHelpers.field_e = false;
                stackIn_32_0 = var9Lifetime1;
                return stackIn_32_0;
              }
              if (99 == var9Lifetime1) {
                FrameSkin.fillIncomingBuffer(DiskArchiveRequest.constantOne(0), 0);
                ViewControlStrings.field_b = new Boolean(FullscreenErrorDialog.readBooleanByte(ProgressMessageDialog.field_qb, -87));
                ProgressMessageDialog.field_qb.position = 0;
              } else {
                PasswordConfirmationValidator.field_q = var9Lifetime1;
                ArchiveProvider.field_a = -1;
                DigestHelpers.field_a = GameEntryHelpers.field_a;
              }
            }
          }
          if (AgeValidator.field_n == DigestHelpers.field_a) {
            var9Lifetime2 = 2;
            if (FrameSkin.fillIncomingBuffer(var9Lifetime2, 0)) {
              var10Lifetime1 = ProgressMessageDialog.field_qb.readUnsignedShort((byte) -45);
              ProgressMessageDialog.field_qb.position = 0;
              if (FrameSkin.fillIncomingBuffer(var10Lifetime1, 0)) {
                var11 = GameOptions.field_b.length;
                for (var12 = 0; var12 < var11; var12++) {
                  GameOptions.field_b[var12] = ProgressMessageDialog.field_qb.readZeroPrefixedString(15070);
                }
                MenuInputState.closeGameConnection(false);
                CameraAndLogoHelpers.field_e = false;
                stackIn_43_0 = 100 + var11;
                return stackIn_43_0;
              }
            }
          }
          if (!param3) {
            field_c = (int[]) null;
          }
          if (GameEntryHelpers.field_a == DigestHelpers.field_a &&
            GameSession.isPacketPayloadReady((byte) 48)) {
            if (255 != PasswordConfirmationValidator.field_q) {
              GameKeyHandler.field_g = ProgressMessageDialog.field_qb.readString(-118);
            } else {
              var9_ref_String = ProgressMessageDialog.field_qb.readOptionalString(123);
              if (var9_ref_String != null) {
                GzipDecompressor.setSettingsCookie(-51, var9_ref_String, ContentTransitionDialog.getApplet((byte) 37));
              }
            }
            MenuInputState.closeGameConnection(false);
            CameraAndLogoHelpers.field_e = false;
            stackIn_54_0 = PasswordConfirmationValidator.field_q;
            return stackIn_54_0;
          }
          if (QuickChatMenu.field_Ub == null) {
            if (CameraAndLogoHelpers.field_e) {
              if (30000L >= AccountCreationSupport.getMillisSinceLastServerData(-126)) {
                GameKeyHandler.field_g = TextJoinHelpers.field_a;
              } else {
                GameKeyHandler.field_g = EditableTextWidget.field_L;
              }
              CameraAndLogoHelpers.field_e = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = ConditionalTextValue.field_b;
            ConditionalTextValue.field_b = MenuInputState.field_i;
            MenuInputState.field_i = var9Lifetime3;
            CameraAndLogoHelpers.field_e = true;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("wh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param5 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -23862) {
          field_b = (IndexedSprite[]) null;
        }
    }

    abstract byte[] toByteArray(int param0);

    final static void handleGameMenuAction(int param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_120_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = param2;
        if (0 != var3) {
          if (var3 == 24) {
            var3 = param1 ? 1 : 0;
            MarkerSlider.changeScreen(-2, 0, var3 != 0, -3);
            PendingRequest.createGameOptions(false, (byte) 87);
          } else {
            if (var3 != 1) {
              if (2 == var3) {
                SoundPlaybackHelpers.playSoundEffect(30, AccountCreationSupport.field_k);
                SingleChildWidget.field_z = ContextMenuHelpers.field_c;
                TooltipAndOptionsHelpers.field_c = AsyncCheckResult.field_a;
                BitCountAndDialogHelpers.field_c = 2;
                PendingRequest.createGameOptions(false, (byte) 87);
                var3 = param1 ? 1 : 0;
                MarkerSlider.changeScreen(-2, 0, var3 != 0, -1);
              } else {
                if (var3 == 7) {
                  SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
                  var3 = param1 ? 1 : 0;
                  var4 = LoginMethodHelpers.field_e;
                  if (0 == GameClock.field_c ||
                    MidiPcmStream.field_y == 2 ||
                    3 == MidiPcmStream.field_y ||
                    GameClock.field_c == 4 ||
                    GameClock.field_c == 5) {
                    var4 = GameClock.field_c;
                  }
                  MarkerSlider.changeScreen(-2, var4, var3 != 0, 0);
                } else {
                  if (var3 != 3) {
                    if (var3 != 5) {
                      if (var3 == 8) {
                        if (MidiPcmStream.field_y != 10) {
                          SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
                          var3 = LoginMethodHelpers.field_e;
                          var4 = param1 ? 1 : 0;
                          var5 = LoginMethodHelpers.field_e;
                          if (0 == GameClock.field_c ||
                            2 == MidiPcmStream.field_y ||
                            MidiPcmStream.field_y == 3 ||
                            GameClock.field_c == 4 ||
                            GameClock.field_c == 5) {
                            var5 = GameClock.field_c;
                          }
                          MarkerSlider.changeScreen(-2, var5, var4 != 0, var3);
                        } else {
                          BufferedSocket.enterMainMenu(12229, param1);
                        }
                      } else {
                        if (var3 != 4) {
                          if (var3 != 14 &&
                            var3 != 15 &&
                            16 != var3 &&
                            var3 != 17 &&
                            var3 != 28 &&
                            var3 != 25 &&
                            var3 != 26 &&
                            var3 != 27) {
                            if (6 != var3) {
                              if (9 == var3) {
                                PendingRequest.createGameOptions(true, (byte) 87);
                                SoundPlaybackHelpers.field_e = false;
                                QuickChatPhraseDefinition.field_q = true;
                                DropTargetWidget.field_I.leaveOfflineGame((byte) -70, param1);
                              } else {
                                if (10 != var3) {
                                  if (var3 == 11) {
                                    DropTargetWidget.field_I.resign((byte) -45);
                                    var3 = param1 ? 1 : 0;
                                    MarkerSlider.changeScreen(-2, 0, var3 != 0, -1);
                                  } else {
                                    if (var3 == 18) {
                                      DropTargetWidget.field_I.restartGame((byte) 70);
                                      var3 = param1 ? 1 : 0;
                                      MarkerSlider.changeScreen(-2, 0, var3 != 0, -1);
                                    } else {
                                      if (var3 != 19) {
                                        if (var3 == 12) {
                                          PendingRequest.createGameOptions(true, (byte) 87);
                                          if (DecodedSpriteHelpers.field_a) {
                                            var3 = param1 ? 1 : 0;
                                            var4 = LoginMethodHelpers.field_e;
                                            if (GameClock.field_c == 0 ||
                                              2 == MidiPcmStream.field_y ||
                                              MidiPcmStream.field_y == 3 ||
                                              GameClock.field_c == 4 ||
                                              GameClock.field_c == 5) {
                                              var4 = GameClock.field_c;
                                            }
                                            MarkerSlider.changeScreen(-2, var4, var3 != 0, -5);
                                          }
                                          if (LoginRsaKey.field_d) {
                                            DiskCacheWorker.sendShortSetting(0, 11, param0 + 12440);
                                          }
                                        } else {
                                          if (20 == var3) {
                                            GameApplet.field_c = 0;
                                          } else {
                                            if (21 != var3) {
                                              if (var3 != 22) {
                                                if (var3 != 13) {
                                                  if (var3 == 23) {
                                                    SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
                                                    var3 = param1 ? 1 : 0;
                                                    var4 = LoginMethodHelpers.field_e;
                                                    if (GameClock.field_c == 0 ||
                                                      MidiPcmStream.field_y == 2 ||
                                                      MidiPcmStream.field_y == 3 ||
                                                      4 == GameClock.field_c ||
                                                      GameClock.field_c == 5) {
                                                      var4 = GameClock.field_c;
                                                    }
                                                    MarkerSlider.changeScreen(-2, var4, var3 != 0, 1);
                                                  }
                                                } else {
                                                  Js5ArchiveManager.openQuitPage((byte) 39, ContentTransitionDialog.getApplet((byte) -125));
                                                }
                                              } else {
                                                PasswordFieldPainter.field_D = false;
                                                if (MidiPcmStream.field_y == 8 ||
                                                  MidiPcmStream.field_y == 6) {
                                                  CheckboxButton.beginFadeToScreen((byte) 86, TextFieldValidator.field_l, MidiPcmStream.field_y);
                                                }
                                              }
                                            } else {
                                              GameApplet.field_c = 1;
                                            }
                                          }
                                        }
                                      } else {
                                        SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
                                        stackIn_120_0 = (TextDecodeHelpers.field_g == 0) ? 1 : 0;
                                        LobbySortHelpers.field_g = stackIn_120_0;
                                      }
                                    }
                                  }
                                } else {
                                  DropTargetWidget.field_I.sendGameCommand(param0 - 2035);
                                  var3 = param1 ? 1 : 0;
                                  MarkerSlider.changeScreen(-2, 0, var3 != 0, -1);
                                }
                              }
                            } else {
                              if (null != FullscreenState.field_b) {
                                FullscreenSupport.exitFullscreen((byte) -16);
                              } else {
                                var3 = param1 ? 1 : 0;
                                PasswordFieldPainter.field_D = false;
                                GameSession.applyLobbyTheme(MusicVolumeAndOverlayHelpers.frameSprites, ReflectionCheckHelpers.standardFont.field_A, 320, MusicVolumeAndOverlayHelpers.frameSprites, 8, PopupInputHelpers.menuFont, 2, ReflectionCheckHelpers.standardFont.field_A + ReflectionCheckHelpers.standardFont.field_G, 8, -16824, var3 != 0, 240);
                              }
                            }
                          }
                        } else {
                          SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
                          var3 = param1 ? 1 : 0;
                          var4 = LoginMethodHelpers.field_e;
                          if (0 == GameClock.field_c ||
                            MidiPcmStream.field_y == 2 ||
                            3 == MidiPcmStream.field_y ||
                            4 == GameClock.field_c ||
                            5 == GameClock.field_c) {
                            var4 = GameClock.field_c;
                          }
                          MarkerSlider.changeScreen(-2, var4, var3 != 0, 6);
                        }
                      }
                    } else {
                      SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
                      LobbySortHelpers.field_g = 0;
                      var3 = param1 ? 1 : 0;
                      var4 = LoginMethodHelpers.field_e;
                      if (GameClock.field_c == 0 ||
                        MidiPcmStream.field_y == 2 ||
                        3 == MidiPcmStream.field_y ||
                        GameClock.field_c == 4 ||
                        GameClock.field_c == 5) {
                        var4 = GameClock.field_c;
                      }
                      MarkerSlider.changeScreen(param0 ^ -2096, var4, var3 != 0, 7);
                    }
                  } else {
                    SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
                    var3 = param1 ? 1 : 0;
                    var4 = LoginMethodHelpers.field_e;
                    if (GameClock.field_c == 0 ||
                      MidiPcmStream.field_y == 2 ||
                      MidiPcmStream.field_y == 3 ||
                      GameClock.field_c == 4 ||
                      5 == GameClock.field_c) {
                      var4 = GameClock.field_c;
                    }
                    MarkerSlider.changeScreen(param0 ^ -2096, var4, var3 != 0, 8);
                  }
                }
              }
            } else {
              SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
              if (!VerticalScrollbar.isGuestSession(20)) {
                var3 = param1 ? 1 : 0;
                var4 = LoginMethodHelpers.field_e;
                if (GameClock.field_c == 0 ||
                  2 == MidiPcmStream.field_y ||
                  MidiPcmStream.field_y == 3 ||
                  4 == GameClock.field_c ||
                  5 == GameClock.field_c) {
                  var4 = GameClock.field_c;
                }
                MarkerSlider.changeScreen(-2, var4, var3 != 0, -4);
              } else {
                PasswordFieldPainter.field_D = false;
                stackIn_58_0 = (!VerticalScrollbar.isGuestSession(20)) ? 1 : 0;
                var3 = stackIn_58_0;
                IconTextComponent.showFramedNotice(8, 2, var3, 320, 8, ReflectionCheckHelpers.standardFont.field_A, true, 240, MusicVolumeAndOverlayHelpers.frameSprites, (byte) 118, MusicVolumeAndOverlayHelpers.frameSprites, param1, ReflectionCheckHelpers.standardFont.field_A + ReflectionCheckHelpers.standardFont.field_G, LobbyGame.textLobbyPleaselogin, PopupInputHelpers.menuFont);
              }
            }
          }
        } else {
          SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
          var3 = param1 ? 1 : 0;
          var4 = LoginMethodHelpers.field_e;
          if (GameClock.field_c == 0 ||
            MidiPcmStream.field_y == 2 ||
            3 == MidiPcmStream.field_y ||
            GameClock.field_c == 4 ||
            5 == GameClock.field_c) {
            var4 = GameClock.field_c;
          }
          MarkerSlider.changeScreen(-2, var4, var3 != 0, 11);
        }
        if (param0 != 2094) {
          field_c = (int[]) null;
        }
    }

    static {
    }
}
