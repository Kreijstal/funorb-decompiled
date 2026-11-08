/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Pixelate extends NetworkGameClient {
    static bd field_G;
    static Sprite field_E;
    public static boolean field_H;

    final void initializeClient(byte param0) {
        this.initializeFramework(55, false, 4, 2, true, 12, 1, 0);
        MusicCrossfadeStream var3 = new MusicCrossfadeStream();
        var3.field_x.setDefaultInstrumentAndBank(true, 9, 128);
        var3.field_H.setDefaultInstrumentAndBank(true, 9, 128);
        DateInputWidget.initializeAudio(22050, mc.field_k, var3, true, (java.awt.Component) ((Object) NameAvailabilityValidator.field_u), 127);
        IndexedSpriteState.field_l = 16777215;
        mh.field_a = 2;
        ce.field_b = 13421772;
        ScoreMarkerDemo.field_k = 0;
        PlayerBoard.field_n = 0;
        MatchingTextValidator.field_s = 16777215;
        this.enablePacketHandlerGroups(true, true, true, true, true, true, -80);
        GrowableIntList.field_d[69] = -1;
        GrowableIntList.field_d[64] = 1;
        GrowableIntList.field_d[61] = 3;
        GrowableIntList.field_d[58] = -2;
        if (param0 != -15) {
          field_G = (bd) null;
        }
        GrowableIntList.field_d[70] = 0;
        GrowableIntList.field_d[10] = -1;
        GrowableIntList.field_d[9] = -1;
        GrowableIntList.field_d[66] = 1;
        GrowableIntList.field_d[62] = 5;
        GrowableIntList.field_d[65] = 1;
        GrowableIntList.field_d[57] = -2;
        GrowableIntList.field_d[71] = 1;
    }

    final void updateClient(boolean param0) {
        boolean discarded$0 = false;
        int var11 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_38_1 = false;
        boolean stackIn_39_2 = false;
        boolean stackIn_51_1 = false;
        boolean stackIn_60_1 = false;
        boolean stackIn_61_2 = false;
        boolean stackIn_70_0 = false;
        int stackIn_91_0 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_138_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int var2;
        Object var3_ref;
        int var3;
        int var4;
        String[] var4_ref_String__;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var12;
        byte[] var13;
        hf var14;
        MatchController var15;
        Object var16;
        GameResultsScreen var16_ref;
        byte[] var17;
        byte[] var19;
        byte[] var22;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var7Lifetime2;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime3;
        int var4Lifetime1Lifetime4;
        int var4Lifetime1Lifetime5;
        int var9Lifetime1;
        var16 = null;
        var12 = field_H ? 1 : 0;
        ce.field_g = GreenGrowTheRushesBackground.getIdleTimeoutLimit(13428);
        ByteStorage.removeFinishedSounds(-29949);
        if (ib.field_f != null &&
          ib.field_f.field_g) {
          SoundVoice.closeFullscreenCanvas(116);
          ClientContextMenu.refreshOpenLegacyMenu((byte) -53);
        }
        stackIn_5_1 = 0;
        stackIn_6_2 = (ib.field_f != null);
        this.serviceFramework(stackIn_5_1, stackIn_6_2);
        pa.field_b = pa.field_b + 1;
        if (MatchHud.field_i) {
          this.openArchives(-18528);
          MatchHud.field_i = false;
        }
        stackIn_11_0 = !param0;
        if (bd.shouldShowBootstrapLoadingScreen(stackIn_11_0)) {
          this.updateAccountOrLobbyUi((byte) 20);
          if (bd.shouldShowBootstrapLoadingScreen(true)) {
            if (LoadingStepTracker.isLobbyUiReady(122)) {
              discarded$0 = this.updateArchiveLoading(false, 4);
            }
            return;
          }
        }
        if (param0) {
          return;
        }
        if (Checkbox.field_R) {
          if (ReflectionCheckRequest.isWaitingForAccountData((byte) -70)) {
            if (!hf.b((byte) 100)) {
              if (pe.requestLeaveServer(false)) {
                stackIn_51_1 = (ib.field_f != null);
                var2 = this.runAccountUiActions(stackIn_51_1, (byte) 96);
                if (1 == var2 ||
                  var2 == 2) {
                  if (null != ib.field_f) {
                    SoundVoice.closeFullscreenCanvas(72);
                  }
                  if (2 == var2) {
                    d.openQuitPage(0, AudioService.getApplet(13867));
                  }
                }
                stackIn_60_1 = true;
                stackIn_61_2 = !(param0);
                this.advanceClientState(stackIn_60_1, stackIn_61_2);
              } else {
                if (!Kite.isMessageMenuPending((byte) 58)) {
                  this.advanceClientState(false, true);
                } else {
                  if (GameModeCard.field_d == GameModeCard.field_a) {
                    var2 = DriftingParticle.pollLegacyMenuSelection(2);
                    if (var2 == 1) {
                      gi.setPopupIdAndCaption(QuickChatMenu.field_Ib, TimerBarDemo.field_q, (byte) 78);
                    }
                    this.advanceClientState(true, true);
                  } else {
                    this.advanceClientState(false, true);
                  }
                }
              }
            } else {
              if (GameModeCard.field_d == GameModeCard.field_a) {
                var2 = TriangleMesh.pollMessageMenuSelection((byte) 83);
                if (var2 == 2) {
                  SoundVoice.closeFullscreenCanvas(97);
                } else {
                  if (var2 == 3) {
                    FireworkSpark.field_b = false;
                    var3_ref = qj.field_e;
                    QuickChatPhraseCache.configureQuickChatStyle(((BitmapFont) (var3_ref)).maxDescent + ((BitmapFont) (var3_ref)).maxAscent, -879, ((BitmapFont) (var3_ref)).maxAscent, 2, 320, 8, ab.field_c, (BitmapFont) (var3_ref), 240, bi.field_g, 8, true);
                  } else {
                    if (var2 == 4) {
                      FireworkSpark.field_b = true;
                      gi.setPopupIdAndCaption(InputQueue.field_a, 0, (byte) 89);
                    }
                  }
                }
                stackIn_38_1 = true;
                stackIn_39_2 = !(param0);
                this.advanceClientState(stackIn_38_1, stackIn_39_2);
              } else {
                this.advanceClientState(false, true);
              }
            }
          } else {
            PuzzlePieceQueue.pollAchievementSyncRequests(4478);
          }
        } else {
          NameSuggestionsPanel.processWidgetInput((byte) -108, DriftingParticle.field_i);
          if (this.updateArchiveLoading(true, 4)) {
            Checkbox.field_R = true;
          }
        }
        if (!ArrayWidgetContainer.isAccountUiActive((byte) 70)) {
          while (true) {
            var14 = (hf) (DualLinkDeque.field_h.removeFirst(-28918));
            if (var14 == null) {
              break;
            }
            DirectByteStorage.queueProgressRecord(109, var14, 4);
          }
        }
        var16_ref = (GameResultsScreen) (StripedProgressBar.field_H[13]);
        while (true) {
          stackIn_70_0 = !param0;
          if (!jf.pollIncomingPacket(stackIn_70_0, GrowableIntList.field_d)) {
            SecondaryNodeHashTable.flushOutgoingPackets(0, 10000);
            if (ContentTransitionDialog.field_kb) {
            }
            if (PlayerController.canPollServerConnection((byte) -59)) {
              var3 = this.pollLoginResult(1272);
              if (0 == var3 ||
                var3 == 1) {
                MatchHud.resetReflectionCheckQueue(true);
                if (var3 != 1) {
                  if (StripedProgressBar.field_G) {
                    SaveDataRequest.field_l = true;
                    mi.field_o = true;
                    if (ValidationHelpWidget.field_Y) {
                      SingleChildContainer.field_F = IntrusiveDeque.field_a;
                      stackIn_177_0 = (gq.isOfflineOrAccountUi(115)) ? 12 : 0;
                      la.changeScreen(stackIn_177_0, 11, false, -25528);
                    } else {
                      stackIn_173_0 = (gq.isOfflineOrAccountUi(100)) ? 12 : 0;
                      la.changeScreen(stackIn_173_0, 0, false, -25528);
                    }
                    IntrusiveDequeCursor.commitScreenChange(0);
                    wo.getScreen(109, fc.field_e).enterScreen(2, 0, false);
                    StripedProgressBar.field_G = false;
                    ValidationHelpWidget.field_Y = false;
                    DateOfBirthValidator.field_i = false;
                  }
                  LinkButtonPainter.field_d = false;
                  ValidationState.field_c = false;
                } else {
                  LinkButtonPainter.field_d = true;
                  ValidationState.field_c = true;
                }
              }
              var4 = 0;
              if (var3 == 2) {
                var4 = 1;
              }
              if (StripedProgressBar.field_G ||
                ValidationState.field_c ||
                LinkButtonPainter.field_d) {
                var4 = 1;
              }
              if (!PlayerController.canPollServerConnection((byte) -59)) {
                var4 = 0;
              }
              if (var4 != 0) {
                MainMenuScreen.g((byte) 103);
              }
            }
            return;
          }
          if (TextLayoutLine.field_e == 9) {
            IntrusiveDequeCursor.commitScreenChange(0);
            MidiPcmStream.field_t = 11;
            ValidationState.field_c = false;
            SingleChildContainer.field_F = MusicCrossfadeStream.field_o.readString(5);
            continue;
          }
          if (TextLayoutLine.field_e == 14) {
            IntrusiveDequeCursor.commitScreenChange(0);
            GameModeCard.initializeLobby(150, DropTargetWidget.nextPowerOfTwo(-1879863704, 2000), 1024, 3, hp.getGameMemberListContent(0), PairedTextColumns.getPlayerListContent((byte) 79), LoginCredentials.field_d, DropTargetWidget.nextPowerOfTwo(-1879863704, 8), cl.field_f.length, IndexedSpriteState.getGameListContent(1));
            fc.bindLobbyLists(FireworkBurst.getFriendListContent(-26573), 64, TickClock.getIgnoreListContent(119));
            MidiPcmStream.field_t = -2;
            StripedProgressBar.field_G = true;
            ValidationState.field_c = false;
            continue;
          }
          if (TextLayoutLine.field_e == 15) {
            if (StripedProgressBar.field_G) {
              IntrusiveDequeCursor.commitScreenChange(0);
              SceneWidget.closeTransientDialogs(0);
              ek.a(true);
              SaveDataRequest.field_l = true;
              MidiPcmStream.field_t = 0;
              DateOfBirthValidator.field_i = false;
              mi.field_o = true;
              ValidationHelpWidget.field_Y = false;
              StripedProgressBar.field_G = false;
            }
            LinkButtonPainter.field_d = false;
            ValidationState.field_c = false;
            continue;
          }
          if (10 == TextLayoutLine.field_e &&
            StripedProgressBar.field_G) {
            AccountRegistrationPanel.handleSocialListPacket(true);
            continue;
          }
          if (TextLayoutLine.field_e != 57 &&
            TextLayoutLine.field_e != 58) {
            if (TextLayoutLine.field_e == 59) {
              if (ValidationHelpWidget.field_Y ||
                DateOfBirthValidator.field_i) {
                IntrusiveDequeCursor.commitScreenChange(0);
                if (ValidationHelpWidget.field_Y) {
                  ro.field_e.showResults(false, 250, false);
                }
                SaveDataRequest.field_l = true;
                dg.playMenuMusic(0, (byte) -117);
                ValidationHelpWidget.field_Y = false;
                DateOfBirthValidator.field_i = false;
                MidiPcmStream.field_t = -2;
              }
              LinkButtonPainter.field_d = false;
              continue;
            }
            var3_ref = null;
            if (ValidationHelpWidget.field_Y) {
              var3_ref = ro.field_e;
            } else {
              if (DateOfBirthValidator.field_i) {
                var3_ref = MatchingTextValidator.field_r;
              }
            }
            if (var3_ref != null) {
              if (TextLayoutLine.field_e == 61) {
                var4Lifetime1 = MusicCrossfadeStream.field_o.readUnsignedMedium((byte) 13);
                var5 = var4Lifetime1 >> 8;
                var6 = (128 & var4Lifetime1) >> 7;
                var7 = 127 & var4Lifetime1;
                ((MatchController) (var3_ref)).queueRemoteInput(var6, var7, var5, -62);
                continue;
              }
              if (TextLayoutLine.field_e == 69) {
                var4Lifetime1Lifetime1 = MusicCrossfadeStream.field_o.readUnsignedShort((byte) 41);
                var5Lifetime2 = MusicCrossfadeStream.field_o.readUnsignedShort((byte) 14);
                var6 = MusicCrossfadeStream.field_o.readUnsignedShort((byte) -117);
                var7Lifetime2 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
                var8 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
                var9 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
                var19 = new byte[var9];
                var17 = var19;
                var13 = var17;
                var22 = var13;
                for (var11 = 0; var19.length > var11; var11++) {
                  var13[var11] = MusicCrossfadeStream.field_o.readByte(0);
                }
                ((MatchController) (var3_ref)).applyRemoteBoardState(var8, var6, var7Lifetime2, var4Lifetime1Lifetime1, (byte) 125, var5Lifetime2, var22);
                continue;
              }
              if (TextLayoutLine.field_e == 70) {
                ((MatchController) (var3_ref)).startNextRound(-102);
                continue;
              }
              if (62 == TextLayoutLine.field_e) {
                var4Lifetime1Lifetime2 = MusicCrossfadeStream.field_o.readByte(0);
                var5Lifetime3 = MusicCrossfadeStream.field_o.readUnsignedShort((byte) -116);
                var6 = MusicCrossfadeStream.field_o.readUnsignedShort((byte) -121);
                ((MatchController) (var3_ref)).receiveMatchResult(var5Lifetime3, var4Lifetime1Lifetime2, var6, false);
                continue;
              }
              if (TextLayoutLine.field_e == 64) {
                var4Lifetime1Lifetime3 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
                var5Lifetime4 = var4Lifetime1Lifetime3 & ~((MatchController) (var3_ref)).field_a.field_k;
                ((MatchController) (var3_ref)).field_a.field_k = var4Lifetime1Lifetime3;
                if (var5Lifetime4 != 1 &&
                  2 != var5Lifetime4) {
                  continue;
                }
                stackIn_138_0 = (var5Lifetime4 == 1) ? 0 : 1;
                var6 = stackIn_138_0;
                var16_ref.setStatusMessage(AlphaContainer.formatTemplate(e.field_e, 76, new String[]{((MatchController) (var3_ref)).field_a.playerNames[var6]}), (byte) -4);
                continue;
              }
              if (TextLayoutLine.field_e == 65) {
                ((MatchController) (var3_ref)).field_a.field_p = MusicCrossfadeStream.field_o.readUnsignedByte(255);
                if (null == ro.field_e) {
                  continue;
                }
                var16_ref.updateRematchLabel(1);
                continue;
              }
              if (TextLayoutLine.field_e == 66) {
                var4Lifetime1Lifetime4 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
                var5Lifetime5 = ~((MatchController) (var3_ref)).field_o & var4Lifetime1Lifetime4;
                ((MatchController) (var3_ref)).field_o = var4Lifetime1Lifetime4;
                if (ro.field_e == null) {
                  continue;
                }
                var16_ref.updateRematchLabel(1);
                if (var5Lifetime5 != 1 &&
                  var5Lifetime5 != 2) {
                  continue;
                }
                stackIn_150_0 = (var5Lifetime5 != 1) ? 1 : 0;
                var6 = stackIn_150_0;
                var16_ref.setStatusMessage(AlphaContainer.formatTemplate(ArrayWidgetContainer.field_M, 75, new String[]{((MatchController) (var3_ref)).field_a.playerNames[var6]}), (byte) -4);
                continue;
              }
              if (71 == TextLayoutLine.field_e) {
                var4Lifetime1Lifetime5 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
                if (ro.field_e == null) {
                  continue;
                }
                if (var4Lifetime1Lifetime5 == 0) {
                  ro.field_e.awardAchievement(12, (byte) 58, 243);
                }
                if (1 != var4Lifetime1Lifetime5) {
                  continue;
                }
                ro.field_e.awardAchievement(13, (byte) 58, 242);
                continue;
              }
            }
            this.dispatchServerPacket(-12);
            continue;
          }
          IntrusiveDequeCursor.commitScreenChange(0);
          stackIn_91_0 = (MusicCrossfadeStream.field_o.readUnsignedByte(255) == 0) ? 0 : 1;
          var3Lifetime1 = stackIn_91_0;
          var4_ref_String__ = new String[MusicCrossfadeStream.field_o.readUnsignedByte(255)];
          var5Lifetime1 = MusicCrossfadeStream.field_o.readByte(0);
          if (var5Lifetime1 < 0) {
            var5Lifetime1 = -2;
          }
          for (var6 = 0; var6 < var4_ref_String__.length; var6++) {
            var4_ref_String__[var6] = MusicCrossfadeStream.field_o.readNullCircumfixedString(118);
          }
          var6 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
          var7Lifetime1 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
          var8Lifetime1 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
          var9Lifetime1 = MusicCrossfadeStream.field_o.readInt(0);
          HighscoresScreen.field_p = null;
          stackIn_100_0 = (TextLayoutLine.field_e == 58);
          DateOfBirthValidator.field_i = stackIn_100_0;
          StatusBar.setResultsKind(2);
          var15 = new MatchController(var4_ref_String__, var5Lifetime1, var3Lifetime1 != 0, var9Lifetime1, var6, var7Lifetime1, var8Lifetime1);
          var15.readState((byte) 20, MusicCrossfadeStream.field_o);
          if (1 == MusicCrossfadeStream.field_o.readUnsignedByte(255)) {
            var15.resetControllersForRound(-57);
          }
          if (TextLayoutLine.field_e != 57) {
            ro.field_e = null;
            MatchingTextValidator.field_r = var15;
            var16_ref.hideRematchOption(-120);
            var16_ref.setStatusMessage((String) null, (byte) -4);
          } else {
            MatchingTextValidator.field_r = null;
            ro.field_e = var15;
            ValidationHelpWidget.field_Y = true;
            var16_ref.updateRematchLabel(1);
            var16_ref.setStatusMessage((String) null, (byte) -4);
          }
          LinkButtonPainter.field_d = false;
          MidiPcmStream.field_t = -1;
        }
    }

    final void releaseClientStatics(int param0) {
        Pixelate.releaseStatics(param0 - 19640);
        ph.releaseStatics(111);
        IntrusiveDeque.releaseStatics((byte) 76);
        ef.releaseStatics(true);
        FloatingSquare.clearStatics((byte) -109);
        MenuScreen.releaseStatics(-1);
        GameModeSelectScreen.b(false);
        ab.clearSharedReferences(false);
        oo.clearStatics(true);
        MusicCrossfadeStream.releaseStatics(-97);
        TextTableInitializer.releaseStatics(11799);
        BackgroundScene.releaseStatics(-4136);
        KeyboardInputHandler.releaseStatics(-1);
        vf.clearSharedReferences(-109);
        vd.releaseStatics(70);
        qh.releaseStatics(param0 - 22862);
        r.releaseStatics(-31558);
        NetworkGameClient.releaseStatics(true);
        ClientException.releaseStatics(true);
        GameApplet.releaseStatics(true);
        JaggrabDownloader.releaseStatics((byte) -57);
        MouseInputHandler.releaseStatics(-116);
        MouseWheelHandler.releaseStatics(false);
        SoftwareRasterizer.releaseStatics();
        ResourceArchive.releaseStatics(-34);
        BitmapFont.releaseStatics();
        wp.releaseStatics(param0 - 23028);
        PacketBuffer.releaseStatics((byte) 114);
        hm.releaseStatics((byte) 9);
        he.releaseStatics(0);
        la.releaseStatics(param0 - 23114);
        pa.releaseStatics(82);
        gb.releaseStatics(false);
        nf.releaseStatics((byte) -107);
        sf.releaseStatics((byte) 61);
        th.releaseStatics((byte) -96);
        dk.releaseStatics((byte) -93);
        ChatMessage.releaseStatics(-127);
        bl.releaseStatics(-46342);
        TickClock.releaseStatics(false);
        CanvasRasterBuffer.releaseStatics(true);
        LoadingStepTracker.releaseStatics(true);
        FullscreenFocusCanvas.releaseStatics((byte) -85);
        ViewportController.releaseStatics(true);
        MatchController.releaseStatics((byte) -101);
        dg.releaseStatics(1048576);
        aq.releaseStatics((byte) 119);
        Js5Transport.releaseStatics((byte) -53);
        DiskCacheWorker.releaseStatics(-1);
        Js5ArchiveManager.releaseStatics((byte) -125);
        BufferedRandomAccessFile.releaseStatics(127);
        BufferedSocket.releaseStatics((byte) -84);
        IntrusiveNode.releaseStatics(-3);
        SpriteState.releaseStatics((byte) -114);
        DualLinkNode.releaseStatics(-2575);
        nk.releaseStatics(true);
        dh.releaseStatics(true);
        ConditionalTextValue.releaseStatics((byte) -108);
        lg.releaseStatics((byte) -120);
        ea.releaseStatics(true);
        LoginCredentials.releaseStatics(1762);
        CipherPacketBuffer.clearSharedReferences(25208);
        IsaacRandom.releaseStatics(7);
        MidiPcmStream.releaseStatics(-69);
        NodeHashTable.releaseStatics(-101);
        MusicPatchNode.releaseStatics(-69);
        MidiFileReader.releaseMessageTable();
        MusicPatchPcmStream.releaseStatics((byte) 106);
        SoundCache.releaseStatics((byte) 91);
        AudioOutput.releaseStatics();
        nh.releaseStatics((byte) 108);
        MenuInputState.releaseStatics(65);
        SceneWidgetNode.releaseStatics(true);
        ed.releaseStatics(75);
        e.releaseStatics(200);
        sk.releaseStatics((byte) 99);
        SceneWidget.releaseStatics((byte) 59);
        LobbyGame.releaseStatics((byte) 87);
        SecondaryNodeHashTable.releaseStatics(true);
        LobbyPlayer.releaseStatics(true);
        qj.releaseStaticReferences(false);
        ArchiveIndex.releaseStatics(117);
        GzipDecoder.releaseStatics(-8);
        ArchiveProvider.releaseStatics((byte) -63);
        rm.releaseStatics((byte) -116);
        cn.releaseStatics(-59);
        ModalStack.releaseStatics(param0 - 12614);
        RegistrationRequestDialog.releaseStatics(-103);
        LoadingProgressDialog.clearStatics(-100);
        LoginDialog.releaseStatics((byte) 106);
        AccountRequestDialog.releaseStatics((byte) 125);
        AccountRegistrationPanel.releaseStatics((byte) 64);
        AccountChoicePanel.releaseStatics((byte) -123);
        LoginForm.releaseStatics(118);
        DisplayNameForm.releaseStatics((byte) 123);
        UiTheme.releaseStatics(true);
        d.releaseStatics(false);
        fg.releaseStatics(9882);
        VorbisSample.releaseStatics();
        nd.releaseStatics(param0 - 23110);
        SpriteEffectHelpers.releaseStatics();
        jb.releaseStatics((byte) 33);
        DisplayNameRequestGlobals.releaseStatics(21601);
        ig.releaseStatics((byte) 2);
        Puzzle.releaseStatics(116);
        PuzzlePieceQueue.releaseStatics(true);
        OptionsScreen.releaseStatics((byte) 122);
        StatusBar.releaseStatics((byte) -101);
        ScoreMarkerBar.releaseStatics((byte) -112);
        AchievementsScreen.releaseStatics(true);
        HowToPlayScreen.releaseStatics(108);
        FallingPieceView.releaseStatics((byte) 51);
        BoardView.releaseStatics(true);
        PictureStrip.releaseStatics(0);
        ScoreMarkerDemo.releaseStatics(param0 ^ 3805);
        TimerBarDemo.releaseStatics(126);
        PlayerBoard.releaseStatics((byte) 125);
        GreenGrowTheRushesBackground.releaseStatics(0);
        BlastFromThePastBackground.releaseStatics((byte) 34);
        BouncedownBackground.releaseStatics((byte) -13);
        KiteBackground.releaseStatics(21476);
        pe.releaseStatics(7);
        an.clearStatics(-1);
        ek.releaseStatics(14);
        di.releaseStatics(false);
        ro.releaseStatics(false);
        IconTextComponent.releaseStatics(58);
        ScrollContainer.releaseStatics(0);
        PairedTextColumns.clearStatics(118);
        VerticalScrollbar.releaseStatics((byte) 89);
        ContextActionMenu.clearStatics((byte) 122);
        ScrollPaneWithFooter.releaseStatics((byte) -88);
        ClientContextMenu.releaseStatics((byte) 121);
        ReportAbuseDialog.releaseStatics(1);
        wo.releaseStatics(true);
        NightToRememberBackground.releaseStatics(-12424);
        ep.releaseStatics(param0 - 23120);
        pk.clearSharedReferences(4194303);
        of.releaseStatics((byte) 79);
        ej.releaseStatics(-115);
        em.releaseStatics(param0 ^ 23098);
        HuffmanCodec.releaseStatics(false);
        PicturePreview.releaseStatics((byte) -91);
        MatchHud.releaseStatics(param0 - 23119);
        Match.releaseStatics(0);
        IndexedSpriteState.releaseStatics(false);
        bj.releaseStatics((byte) 109);
        fc.releaseStatics(32);
        GameResultsScreen.releaseStatics((byte) -49);
        l.releaseStatics(param0 - 20899);
        mp.releaseStatics(true);
        PlayerController.releaseStatics(103);
        fe.releaseStatics(param0 ^ -23078);
        hp.releaseStatics((byte) -15);
        ReflectionCheckRequest.releaseStatics((byte) -38);
        BoundedRandomAccessFile.releaseStatics(-1);
        MainMenuScreen.releaseStatics((byte) 23);
        GameplayScreen.releaseStatics(param0 ^ 23116);
        fq.clearStatics((byte) -123);
        HighscoresScreen.releaseStatics((byte) 49);
        PauseMenuScreen.releaseStatics(false);
        ij.releaseStatics(-124);
        wa.releaseStatics(0);
        ra.releaseStatics(false);
        AudioService.releaseStatics(true);
        TwistedLogicBackground.releaseStatics((byte) 106);
        dc.releaseStatics(param0 ^ -23119);
        PolygonFiller.releaseStatics();
        AcidSunsetBackground.releaseStatics(0);
        EmergentBehaviourBackground.releaseStatics(0);
        SocketJs5Transport.releaseStatics(111);
        DualLinkDeque.clearSharedReferences((byte) 97);
        Js5NetworkRequest.releaseStatics((byte) -104);
        SectorCacheStore.releaseStatics(512);
        DiskCacheRequest.releaseStatics(100);
        CachedArchiveProvider.releaseStatics((byte) 45);
        fj.clearStatics((byte) 119);
        ArchiveRequest.releaseStatics((byte) -106);
        qf.releaseStatics(false);
        AccountNoticeDialog.releaseStatics((byte) -63);
        TextWidgetPainter.releaseStatics(-120);
        MeshRasterState.releaseStatics();
        jk.releaseStatics(20);
        TriangleMesh.releaseStatics((byte) -79);
        cl.releaseStatics(938035464);
        bq.releaseStatics((byte) 124);
        cd.releaseStatics(false);
        oi.releaseStatics(param0 ^ param0);
        DelegatingCanvas.releaseStatics(param0 - 23207);
        ri.releaseStatics(10);
        IntKeyLookup.releaseStatics(11924);
        ByteStorage.releaseStatics(param0 - 31989);
        Bzip2Decoder.releaseSharedState();
        Bzip2State.releaseStatics((byte) -92);
        fd.releaseStatics(-24465);
        JavaRandomHelpers.releaseStatics((byte) -118);
        CheckboxPainter.releaseStatics((byte) -123);
        StatefulTextPainter.releaseStatics(param0 - 23174);
        DialWidgetPainter.releaseStatics(-26570);
        MarkerSliderPainter.releaseStatics(94);
        TextLayout.releaseStatics(-127);
        UiComponent.releaseStatics(param0 - 23118);
        TextButton.clearStatics(89);
        SingleChildContainer.releaseStatics(0);
        ResizableModalPanel.releaseStatics(127);
        ModalPanel.releaseStatics(-43);
        UiContainer.releaseStatics((byte) -105);
        IntrusiveDequeCursor.releaseStatics(false);
        ce.releaseStatics(true);
        VorbisFloor.releaseStatics();
        wf.releaseStatics((byte) -66);
        qg.releaseStatics((byte) 124);
        dn.releaseStatics((byte) -41);
        ui.releaseStatics(23652);
        QuickChatMenu.releaseStatics(1);
        QuickChatCategoryCache.releaseStatics(param0 ^ -6504);
        QuickChatPhraseCache.releaseStatics(param0 - 23002);
        QuickChatCategory.releaseStatics(69);
        QuickChatPhraseDefinition.clearStatics((byte) -58);
        WeightedLruCache.releaseStatics(1);
        SocketConnector.releaseStatics(29731);
        ProxyAuthenticationException.releaseStatics((byte) 73);
        NanoTickClock.releaseStatics(false);
        ImageProducerRasterBuffer.releaseStatics(-56);
        vm.releaseStatics(116);
        bo.releaseStatics(true);
        ScorePopup.clearStatics(false);
        TimerBar.releaseStatics((byte) -69);
        jf.releaseStatics(-31476);
        InputQueue.releaseStatics(-3);
        WhirlpoolHasher.clearStatics(64);
        td.releaseStatics(param0 - 23112);
        qn.releaseStatics(-1);
        MusicPatch.releaseStatics(param0 ^ 23118);
        un.releaseStatics((byte) -6);
        SynthInstrument.releaseStatics();
        LabeledField.releaseStatics((byte) -84);
        ValidatedTextWidget.releaseStatics(false);
        EditableTextWidget.releaseStatics(12669);
        ContentTransitionDialog.clearStatics((byte) 82);
        StripedProgressBar.releaseStatics((byte) -9);
        NameSuggestionsPanel.releaseStatics(16);
        TextHotspotWidget.releaseStatics(1861726552);
        ValidationIndicator.releaseStatics((byte) -87);
        ValidationHelpWidget.releaseStatics(false);
        Checkbox.releaseStatics(98);
        TextFieldValidator.releaseStatics(101);
        ih.releaseStatics(-1);
        AccountTermsPanel.clearSharedReferences((byte) 103);
        DialWidget.releaseStatics((byte) 95);
        MarkerSlider.releaseStatics((byte) -89);
        TabbedPanel.releaseStatics(15967);
        AccountNamePrompt.releaseStatics((byte) -70);
        ke.releaseStatics(-19064);
        BirthDateEntryPanel.releaseStatics(-8012);
        DateOfBirthValidator.releaseStatics(true);
        NumericDateInputWidget.releaseStatics((byte) -28);
        ArrayWidgetContainer.releaseStatics(-87);
        CachedTextLayout.releaseStatics(0);
        DirectByteStorage.releaseStatics((byte) 94);
        GrowableIntList.releaseStatics(1);
        DraggableWidget.releaseStatics(param0 ^ -23082);
        IterableNodeHashTable.releaseStatics((byte) -105);
        SecondaryNodeDeque.releaseStatics(true);
        CacheReference.releaseStatics(-520925311);
        wm.releaseStatics(false);
        StrongCacheReference.releaseStatics(109);
        ProxySocketConnector.releaseStatics(-6835);
        AudioFilter.releaseStatics();
        na.releaseStatics((byte) 4);
        DateInputWidget.releaseStatics((byte) 125);
        NodeHashTableIterator.releaseStatics(true);
        SecondaryNodeDequeIterator.releaseStatics(param0 ^ -23078);
        RankingTableRequest.releaseStatics(30);
        rh.releaseStatics((byte) 64);
        gi.releaseStatics(-112);
        RankingQuery.releaseStatics((byte) 90);
        cm.releaseStatics(128);
        ListRequest.releaseStatics((byte) -10);
        ThreeSliceButtonPainter.clearStatics(param0 ^ -23054);
        LinkButtonPainter.releaseStatics(param0 ^ -23069);
        GradientOutlineTextPainter.releaseStatics(-102);
        PasswordFieldPainter.releaseStatics(8192);
        SpriteCheckboxPainter.releaseStatics(14518);
        AlphaContainer.releaseStatics((byte) -120);
        SocialListEntry.releaseStatics(param0 ^ -16156);
        gd.releaseStatics(0);
        ff.releaseStatics(-46);
        mc.releaseStatics(-1);
        hf.releaseStatics((byte) 22);
        um.releaseStatics(-127);
        SaveDataRequest.releaseStatics(17);
        AsyncValidationResult.releaseStatics(0);
        bd.releaseStatics(param0 - 23048);
        ug.releaseStatics(param0 ^ 15191);
        LoginMethod.releaseStatics(105);
        EmailCredentials.releaseStatics((byte) 124);
        gq.releaseStatics(100);
        wk.releaseStatics(-19101);
        ge.clearSharedReferences(param0 - 23119);
        id.releaseStatics(-118);
        AccountMessagePanel.releaseStaticReferences(param0 ^ 23118);
        SoundVoice.releaseStatics((byte) -113);
        ib.releaseStatics(2);
        PieceTiming.releaseStatics(10934);
        PuzzleThumbnail.releaseStatics((byte) 104);
        BoardParticle.releaseStatics(7);
        RetroBlock.releaseStatics(6);
        RisingBubble.releaseStatics(false);
        Cloud.releaseStatics(-1345);
        Kite.releaseStatics((byte) -89);
        KiteTailSegment.releaseStatics(25335);
        RasterState.releaseStatics(param0 ^ -9315);
        FireworkDisplay.releaseStatics((byte) 48);
        FireworkBurst.releaseStatics(3);
        FireworkSpark.releaseStatics(false);
        ji.releaseStatics(-14186);
        Vector3.releaseStatics((byte) 69);
        Matrix3.releaseStatics((byte) -27);
        jn.releaseStatics(29353);
        DriftingParticle.clearStatics((byte) -114);
        fp.releaseStatics(param0 + 329385410);
        sm.releaseStatics((byte) -115);
        StatsRequest.releaseStatics(3);
        WidgetStyleLayer.releaseStatics(0);
        TextLayoutLine.releaseStatics((byte) -26);
        bi.releaseStatics(-8);
        QueuedInput.releaseStatics(-5778);
        NameAvailabilityValidator.releaseStatics(0);
        PasswordValidator.clearStatics(-30055);
        EmailValidator.releaseStatics(param0 ^ 23056);
        EmailConfirmationValidator.releaseStatics(16);
        AgeValidator.releaseStatics(-1);
        MatchingTextValidator.releaseStatics(true);
        dq.releaseStatics(-120);
        ni.releaseStatics((byte) -13);
        ValidationState.releaseStatics(-125);
        DebouncedValidator.releaseStatics((byte) -125);
        el.releaseStatics(param0 ^ -13666);
        this.field_w = null;
    }

    final static void sendStatsRequest(int param0, byte param1, StatsRequest param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          if (param1 <= 90) {
            field_E = (Sprite) null;
          }
          var5 = ChatMessage.field_f;
          var5.writeOpcode(param0, 15514);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(160, 1);
          var5.writeByte(160, param2.field_p);
          var5.writeSignedSmart(param2.field_k, -14596);
          var5.writeInt(param2.field_l, -108);
          var5.writeInt(param2.field_n, -43);
          var5.writeInt(param2.field_o, -104);
          var5.writeInt(param2.field_q, -106);
          var5.appendCrc32(var4, (byte) 43);
          var5.backpatchByteLength(-var4 + var5.position, -1);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "Pixelate.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void shutdownClientServices(int param0) {
        QuickChatPhraseDefinition.shutdownAudio((byte) -92);
        int var2 = -13 % ((-23 - param0) / 61);
        if (ib.field_f != null) {
          SoundVoice.closeFullscreenCanvas(121);
        }
        MusicPatch.shutdownConnectionAndInput((byte) -91);
    }

    final static void updateLobbyGameList(boolean param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var18_int = 0;
        int var22_int = 0;
        SceneWidget dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollContainer stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        LobbyGame stackIn_12_0;
        SceneWidget stackIn_12_1;
        SceneWidget stackIn_12_2;
        long stackIn_12_3;
        SceneWidget stackIn_13_1 = null;
        SceneWidget stackIn_13_2 = null;
        SceneWidget stackIn_13_4 = null;
        LobbyGame stackIn_30_0;
        SceneWidget stackIn_30_1;
        SceneWidget stackIn_30_2;
        long stackIn_30_3;
        SceneWidget stackIn_31_1;
        SceneWidget stackIn_31_2;
        SceneWidget stackIn_31_4;
        int stackIn_35_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        Sprite[] stackIn_80_0 = null;
        int stackIn_81_1 = 0;
        Sprite[] stackIn_88_0 = null;
        int stackIn_89_1 = 0;
        String stackIn_155_0 = null;
        String stackIn_165_0 = null;
        String stackIn_170_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        IntrusiveDeque var8 = null;
        long var9 = 0L;
        Object var11 = null;
        LobbyGame var12 = null;
        int var13 = 0;
        int var14 = 0;
        SceneWidget var18 = null;
        SceneWidget var19 = null;
        SceneWidget var20 = null;
        SceneWidget var21 = null;
        SceneWidget var22 = null;
        SceneWidget var23 = null;
        SceneWidget var24 = null;
        SceneWidget var25 = null;
        SceneWidget var26 = null;
        SceneWidget var27 = null;
        SceneWidget var28 = null;
        SceneWidget var29 = null;
        SceneWidget var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        Sprite var42 = null;
        SceneWidget var43 = null;
        SceneWidget var44 = null;
        SceneWidget var45 = null;
        SceneWidget var46 = null;
        SceneWidget var47 = null;
        SceneWidget var48 = null;
        SceneWidget var49 = null;
        Object var50 = null;
        Sprite var50_ref = null;
        Object var51 = null;
        Sprite var51_ref = null;
        Object var52 = null;
        Sprite var52_ref = null;
        Object var53 = null;
        Sprite var53_ref = null;
        Sprite var54 = null;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = field_H ? 1 : 0;
        try {
          stackIn_3_0 = ReflectionCheckRequest.field_k;
          stackIn_3_1 = param0;
          stackIn_4_2 = (ReflectionCheckRequest.field_k == bj.field_d);
          var7_int = ((ScrollContainer) (Object) stackIn_3_0).updateScrolling(stackIn_3_1, stackIn_4_2, 2, param2 * (fq.field_q * 4 + 8), 0, 2 * fq.field_q + 4) ? 1 : 0;
          if (param1 != 69) {
            return;
          }
          var8 = ReflectionCheckRequest.field_k.content.children;
          var9 = hm.monotonicMillis(64);
          var11 = null;
          var12 = (LobbyGame) (var8.first(1504642273));
          while (var12 != null) {
            var13 = 0;
            if (var12.children == null) {
              var14 = param4 | param6;
              var12.field_Nb = new SceneWidget(0L, of.field_i);
              var12.addChild(var12.field_Nb, (byte) 26);
              var12.field_Nb.horizontalAlignment = 1;
              var12.field_qc = new SceneWidget(0L, SceneWidget.field_T);
              var12.addChild(var12.field_qc, (byte) 26);
              var12.field_Yb = new SceneWidget(0L, of.field_i);
              var12.addChild(var12.field_Yb, (byte) 26);
              var12.field_Yb.field_C = 0;
              var12.field_Sb = new SceneWidget(0L, of.field_i);
              var12.addChild(var12.field_Sb, (byte) 26);
              var12.field_Sb.field_C = 0;
              var12.field_gc = new SceneWidget(0L, SceneWidget.field_T);
              var12.addChild(var12.field_gc, (byte) 26);
              var12.field_gc.horizontalAlignment = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (DialWidgetPainter.field_n) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = of.field_i;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = SceneWidget.field_T;
              }
              stackIn_12_0.field_Zb = new SceneWidget(stackIn_12_3, stackIn_13_4);
              var12.addChild(var12.field_Zb, (byte) 26);
              var12.field_ac = new SceneWidget[fj.field_b];
              var12.field_ic = new SceneWidget(0L, (SceneWidget) null);
              if ((var14 & 1 << ek.field_a) != 0) {
                var12.field_Zb.addChild(var12.field_ic, (byte) 26);
              }
              var12.field_Jb = new SceneWidget(0L, (SceneWidget) null);
              if ((var14 & 1 << ef.field_f) != 0) {
                var12.field_Zb.addChild(var12.field_Jb, (byte) 26);
              }
              var12.field_Fb = new SceneWidget(0L, (SceneWidget) null);
              if ((var14 & 1 << PasswordValidator.field_m) != 0) {
                var12.field_Zb.addChild(var12.field_Fb, (byte) 26);
              }
              var12.field_Vb = new SceneWidget(0L, (SceneWidget) null);
              if (0 != (1 << ClientException.field_e & var14)) {
                var12.field_Zb.addChild(var12.field_Vb, (byte) 26);
              }
              var45 = var12.field_ic;
              var44 = var12.field_Vb;
              var43 = var12.field_Jb;
              var12.field_Fb.verticalAlignment = 1;
              var43.verticalAlignment = 1;
              var44.verticalAlignment = 1;
              var45.verticalAlignment = 1;
              for (var18_int = 0; fj.field_b > var18_int; var18_int++) {
                var12.field_ac[var18_int] = new SceneWidget(0L, (SceneWidget) null);
                if (0 != (var14 & 1 << var18_int + cl.field_j)) {
                  var12.field_Zb.addChild(var12.field_ac[var18_int], (byte) 26);
                }
                var12.field_ac[var18_int].verticalAlignment = 1;
              }
              stackIn_30_0 = var12;
              stackIn_30_1 = null;
              stackIn_30_2 = null;
              stackIn_30_3 = 0L;
              if (!DialWidgetPainter.field_n) {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = of.field_i;
              } else {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = SceneWidget.field_T;
              }
              stackIn_30_0.field_Gb = new SceneWidget(stackIn_30_3, stackIn_31_4);
              var12.addChild(var12.field_Gb, (byte) 26);
              var12.field_Gb.horizontalAlignment = 2;
              var12.field_Kb = new SceneWidget(0L, SceneWidget.field_T);
              var12.addChild(var12.field_Kb, (byte) 26);
              var12.field_Wb = new SceneWidget(0L, dn.field_c);
              var12.addChild(var12.field_Wb, (byte) 26);
              var12.field_lc = new SceneWidget(0L, dn.field_c);
              var12.addChild(var12.field_lc, (byte) 26);
              var12.field_rc = new SceneWidget(0L, TextFieldValidator.field_h);
              var12.addChild(var12.field_rc, (byte) 26);
              var12.markTreeDirty(-257);
              var12.field_jc = new SceneWidget(0L, TimerBar.field_p);
              var12.addChild(var12.field_jc, (byte) 26);
              var13 = 1;
            }
            var12.field_Nb.field_cb = null;
            stackIn_35_0 = (!var12.field_dc) ? param6 : param4;
            var14Lifetime1 = stackIn_35_0;
            var46 = var12.field_Nb;
            var12.field_Nb.height = 0;
            var46.field_K = 0;
            var12.field_jc.field_cb = null;
            var47 = var12.field_jc;
            var12.field_jc.height = 0;
            var47.field_K = 0;
            var12.field_qc.field_cb = null;
            var12.field_qc.height = 0;
            var48 = var12.field_qc;
            var12.field_Yb.field_cb = null;
            var48.field_K = 0;
            var12.field_Yb.height = 0;
            var18 = var12.field_Yb;
            var18.field_K = 0;
            var12.field_Sb.field_cb = null;
            var19 = var12.field_Sb;
            var12.field_Sb.height = 0;
            var12.field_gc.field_cb = null;
            var19.field_K = 0;
            var20 = var12.field_gc;
            var12.field_gc.height = 0;
            var12.field_Zb.field_cb = null;
            var20.field_K = 0;
            var21 = var12.field_Zb;
            var12.field_Zb.height = 0;
            var21.field_K = 0;
            for (var22_int = 0; fj.field_b > var22_int; var22_int++) {
              var12.field_ac[var22_int].field_H = null;
              var23 = var12.field_ac[var22_int];
              var12.field_ac[var22_int].height = 0;
              var23.field_K = 0;
            }
            var12.field_ic.field_H = null;
            var12.field_ic.height = 0;
            var22 = var12.field_ic;
            var22.field_K = 0;
            var12.field_Vb.field_H = null;
            var12.field_Vb.height = 0;
            var49 = var12.field_Vb;
            var49.field_K = 0;
            var12.field_Jb.field_H = null;
            var12.field_Jb.height = 0;
            var24 = var12.field_Jb;
            var12.field_Fb.field_H = null;
            var24.field_K = 0;
            var25 = var12.field_Fb;
            var12.field_Fb.height = 0;
            var25.field_K = 0;
            var12.field_Gb.field_cb = null;
            var26 = var12.field_Gb;
            var12.field_Gb.height = 0;
            var12.field_Kb.field_cb = null;
            var26.field_K = 0;
            var12.field_Kb.height = 0;
            var27 = var12.field_Kb;
            var27.field_K = 0;
            var12.field_Wb.field_cb = null;
            var12.field_Wb.height = 0;
            var28 = var12.field_Wb;
            var28.field_K = 0;
            var12.field_lc.field_cb = null;
            var12.field_lc.height = 0;
            var29 = var12.field_lc;
            var29.field_K = 0;
            var12.field_rc.field_cb = null;
            var30 = var12.field_rc;
            var12.field_rc.height = 0;
            var30.field_K = 0;
            var12.field_K = ReflectionCheckRequest.field_k.content.field_K;
            var31 = 0;
            var32 = var12.field_pc;
            if (!var12.isUnlisted(param1 + 364)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.field_dc) {
                if (0 > var12.field_nc) {
                  if (var12.field_Mb && (var12.field_hc ||
                    var12.field_cc)) {
                    var12.field_jc.field_cb = Checkbox.field_S;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_Tb == 2) {
                      var12.field_jc.field_cb = GrowableIntList.field_g;
                    } else {
                      var12.field_Nb.field_cb = DialWidgetPainter.field_j;
                    }
                  }
                } else {
                  var12.field_Nb.field_cb = IntKeyLookup.field_g;
                }
              } else {
                if (!var12.field_hc &&
                  !var12.field_cc) {
                  if (!var12.field_Pb) {
                    var12.field_Nb.field_cb = HighscoresScreen.field_s;
                  } else {
                    var12.field_Nb.field_cb = KiteTailSegment.field_b;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_jc.field_cb = Checkbox.field_S;
                }
              }
              if (null != var12.field_jc.field_cb) {
                var12.field_jc.setBounds(var31, fq.field_q, 0, 256, 68);
              } else {
                var12.field_Nb.setBounds(var31, fq.field_q, 0, 256, 68);
              }
              var12.field_qc.field_cb = BitmapFont.truncateWithEllipsis(var12.field_qc.font, var32, 78);
              var12.field_qc.setBounds(var31, fq.field_q, 70, 256, 78);
              if (var12.field_qc.field_W &&
                !var12.field_qc.field_cb.equals(var32)) {
                PuzzleThumbnail.field_o = var32;
              }
              var12.field_Yb.field_cb = Integer.toString(var12.field_mc);
              if (var12.field_Mb) {
                var12.field_Sb.field_cb = "/" + var12.field_ec;
                var12.field_Yb.horizontalAlignment = 2;
                var33_int = (348 - var12.field_Sb.font.textWidth("/")) / 2;
                var12.field_Yb.setBounds(var31, fq.field_q, 150, 256, var33_int - 150);
                var12.field_Sb.setBounds(var31, fq.field_q, var33_int, 256, 198 - var33_int);
              } else {
                var12.field_Yb.horizontalAlignment = 1;
                var12.field_Yb.setBounds(var31, fq.field_q, 150, 256, 48);
              }
              var12.field_gc.field_cb = Integer.toString(var12.field_bc);
              var12.field_gc.setBounds(var31, fq.field_q, 200, 256, 48);
              stackIn_69_0 = (!DialWidgetPainter.field_n) ? 200 : 250;
              var33_intLifetime1 = stackIn_69_0;
              var12.field_Zb.setBounds(var31, fq.field_q, var33_intLifetime1, param1 + 187, -2 + (-var33_intLifetime1 + 365));
              var34_int = PlayerBoard.field_q;
              if ((1 << ek.field_a & var14Lifetime1) != 0) {
                var50_ref = DraggableWidget.field_P[var12.field_Ib];
                var12.field_ic.field_H = var50_ref;
                var12.field_ic.setBounds(0, var12.field_Zb.height, var34_int, 256, var50_ref.field_A);
                var34_int = var34_int + (var50_ref.field_A + PlayerBoard.field_q);
              }
              if ((var14Lifetime1 & 1 << ef.field_f) != 0) {
                if (!var12.field_hc) {
                  stackIn_78_0 = (var12.field_cc) ? 1 : 0;
                } else {
                  stackIn_78_0 = 1;
                }
                var36 = stackIn_78_0;
                stackIn_80_0 = EmailCredentials.field_h;
                if (var36 == 0) {
                  stackIn_81_1 = 0;
                } else {
                  stackIn_81_1 = 1;
                }
                var51_ref = stackIn_80_0[stackIn_81_1];
                var12.field_Jb.field_H = var51_ref;
                var12.field_Jb.setBounds(0, var12.field_Zb.height, var34_int, 256, var51_ref.field_A);
                var34_int = var34_int + (PlayerBoard.field_q + var51_ref.field_A);
              }
              if ((1 << PasswordValidator.field_m & var14Lifetime1) != 0) {
                var52_ref = PuzzlePieceQueue.field_d[-1 + var12.field_Tb];
                var12.field_Fb.field_H = var52_ref;
                var12.field_Fb.setBounds(0, var12.field_Zb.height, var34_int, 256, var52_ref.field_A);
                var34_int = var34_int + (PlayerBoard.field_q + var52_ref.field_A);
              }
              if ((var14Lifetime1 & 1 << ClientException.field_e) != 0) {
                stackIn_88_0 = fd.field_c;
                if (!var12.field_oc) {
                  stackIn_89_1 = 0;
                } else {
                  stackIn_89_1 = 1;
                }
                var53_ref = stackIn_88_0[stackIn_89_1];
                var12.field_Vb.field_H = var53_ref;
                var12.field_Vb.setBounds(0, var12.field_Zb.height, var34_int, 256, var53_ref.field_A);
                var34_int = var34_int + (PlayerBoard.field_q + var53_ref.field_A);
              }
              if (ig.field_a != null) {
                for (var36Lifetime1 = 0; var36Lifetime1 < fj.field_b; var36Lifetime1++) {
                  if (ig.field_a[var36Lifetime1] != null &&
                    0 != (var14Lifetime1 & 1 << cl.field_j + var36Lifetime1)) {
                    var42 = ig.field_a[var36Lifetime1][255 & var12.field_Eb[var36Lifetime1]];
                    var54 = var42;
                    var12.field_ac[var36Lifetime1].field_H = var42;
                    var12.field_ac[var36Lifetime1].setBounds(0, var12.field_Zb.height, var34_int, 256, var54.field_A);
                    var34_int = var34_int + (PlayerBoard.field_q + var54.field_A);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_Zb.field_K) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_ic.field_D = var12.field_ic.field_D + var36Lifetime2;
                var12.field_Jb.field_D = var12.field_Jb.field_D + var36Lifetime2;
                var12.field_Fb.field_D = var12.field_Fb.field_D + var36Lifetime2;
                var12.field_Vb.field_D = var12.field_Vb.field_D + var36Lifetime2;
                for (var37_int = 0; var37_int < fj.field_b; var37_int++) {
                  dupTemp$0 = var12.field_ac[var37_int];
                  dupTemp$0.field_D = dupTemp$0.field_D + var36Lifetime2;
                }
              }
              if (var12.field_dc) {
                var37_intLifetime1 = var12.field_nc;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Lb);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 < 60) {
                  var12.field_Gb.field_cb = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Gb.field_cb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Gb.setBounds(var31, fq.field_q, 365, 256, var12.field_K - 365);
              var31 = var31 + fq.field_q;
              if (var12.field_Ub != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(TabbedPanel.field_Fb);
                discarded$2 = var37.append(var12.field_Ub[0]);
                for (var38_intLifetime1 = 1; var12.field_mc > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Ub[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Kb.field_cb = var38;
                var39Lifetime1 = var12.field_Kb.font.wrappedLineCount(var38, var12.field_K - 2 * var12.field_Kb.field_C);
                var12.field_Kb.setBounds(var31, fq.field_q * var39Lifetime1, 0, 256, var12.field_K);
                var31 = var31 + fq.field_q * var39Lifetime1;
              }
              if (var12.field_cc) {
                var12.field_Wb.field_cb = AlphaContainer.formatTemplate(JavaRandomHelpers.field_a, param1 - 22, new String[]{var32});
                var12.field_Wb.setBounds(var31, fq.field_q, MouseWheelHandler.field_c, 256, -(2 * MouseWheelHandler.field_c) + var12.field_K);
                var31 = var31 + fq.field_q;
              }
              if (var12.field_Ob) {
                var12.field_lc.field_cb = AlphaContainer.formatTemplate(NodeHashTable.field_h, param1 ^ 25, new String[]{var32});
                var12.field_lc.setBounds(var31, fq.field_q, MouseWheelHandler.field_c, 256, var12.field_K - MouseWheelHandler.field_c * 2);
                var31 = var31 + fq.field_q;
              }
            }
            var33 = lg.getJoinFailureMessage((byte) 121, var32, var12.field_Qb);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_rc.font.wrappedLineCount(var33, -MouseWheelHandler.field_c + var12.field_K - MouseWheelHandler.field_c);
              var12.field_rc.field_cb = var33;
              var12.field_rc.textOpacity = var12.field_Rb * 256 / mh.field_b;
              var12.field_rc.setBounds(var31, fq.field_q * var34_intLifetime1, MouseWheelHandler.field_c, 256, -(2 * MouseWheelHandler.field_c) + var12.field_K);
              var31 = var31 + var34_intLifetime1 * fq.field_q;
            }
            if (var7_int == 0) {
              var12.pendingHeightDelta = -var12.height + var31;
            }
            if (var13 != 0) {
              ReflectionCheckRequest.field_k.content.positionAfter(var12, 2, param1 - 70, (SceneWidget) (var11));
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < fj.field_b; var34_intLifetime2++) {
              if (var12.field_ac[var34_intLifetime2].field_W) {
                if (null == dq.field_b) {
                  var35 = null;
                } else {
                  if (dq.field_b[var34_intLifetime2] != null) {
                    var35 = dq.field_b[var34_intLifetime2][255 & var12.field_Eb[var34_intLifetime2]];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 != null) {
                  PuzzleThumbnail.field_o = jk.field_e[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  PuzzleThumbnail.field_o = jk.field_e[var34_intLifetime2];
                }
              }
            }
            if (var12.field_ic.field_W) {
              if (1 == var12.field_Ib) {
                var34 = ri.field_g;
              } else {
                var34 = AchievementsScreen.field_p[var12.field_Ib];
              }
              PuzzleThumbnail.field_o = DisplayNameForm.field_R + " - " + var34;
            }
            if (var12.field_Vb.field_W) {
              if (!var12.field_oc) {
                stackIn_155_0 = StatefulTextPainter.field_t;
              } else {
                stackIn_155_0 = RisingBubble.field_d;
              }
              PuzzleThumbnail.field_o = stackIn_155_0;
            }
            if (var12.field_Jb.field_W) {
              if (!var12.field_hc &&
                !var12.field_cc) {
                if (!var12.field_Mb) {
                  stackIn_165_0 = ClientException.field_b;
                } else {
                  stackIn_165_0 = he.field_e;
                }
              } else {
                stackIn_165_0 = StatusBar.field_c;
              }
              PuzzleThumbnail.field_o = stackIn_165_0;
            }
            if (var12.field_Fb.field_W) {
              if (var12.field_Tb != 2) {
                stackIn_170_0 = DialWidgetPainter.field_i;
              } else {
                stackIn_170_0 = SecondaryNodeDequeIterator.field_a;
              }
              PuzzleThumbnail.field_o = stackIn_170_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_P != 0) {
              if (var12.isUnlisted(433)) {
                var12 = (LobbyGame) (var8.next(1504642273));
                continue;
              }
              if (0 == var12.field_jc.field_P) {
                PairedTextColumns.openLobbyGameContextMenu(param3, var32, var12, param1 + 32);
              } else {
                if (var12.field_dc && (!var12.field_Mb ||
                  !var12.field_hc &&
                  !var12.field_cc)) {
                  qj.sendGameJoinRequest(false, var12.getGameId((byte) 8), param5);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ClientContextMenu.sendLobbyGameRequest(param5, -925, var12.getGameId((byte) 8));
                }
              }
            }
            var12 = (LobbyGame) (var8.next(1504642273));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var7), "Pixelate.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public Pixelate() {
    }

    final void renderClient(int param0) {
        int stackIn_12_0 = 0;
        boolean stackIn_51_0 = false;
        int var3;
        MenuScreen var4;
        int var5;
        java.awt.Canvas var6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var5 = field_H ? 1 : 0;
        var6 = ReportAbuseDialog.getActiveCanvas((byte) -122);
        if (bd.shouldShowBootstrapLoadingScreen(true)) {
          TextWidgetPainter.renderStartupScreen(wp.a(-8798), -107, var6);
          return;
        }
        if (!Checkbox.field_R) {
          DialWidget.renderLoadingScreen(-1913, var6);
          return;
        }
        if (!ReflectionCheckRequest.isWaitingForAccountData((byte) -83)) {
          FireworkDisplay.setLoadingStatus(100.0f, -1, em.field_a);
          DialWidget.renderLoadingScreen(-1913, var6);
          return;
        }
        SoftwareRasterizer.clear();
        if (param0 < 91) {
          field_G = (bd) null;
        }
        if (MidiPcmStream.field_t == fc.field_e) {
          SingleChildContainer.drawScreenOrTransition(true, 108, fc.field_e);
        } else {
          if (0 > MidiPcmStream.field_t) {
            stackIn_12_0 = fc.field_e;
          } else {
            stackIn_12_0 = MidiPcmStream.field_t;
          }
          var3 = stackIn_12_0;
          if (var3 < 0) {
            var3 = 14;
          }
          var4 = wo.getScreen(-51, var3);
          if (NameAvailabilityValidator.field_t >= 16) {
            SingleChildContainer.drawScreenOrTransition(false, -93, MidiPcmStream.field_t);
            var4.drawFadeTransition(-(NameAvailabilityValidator.field_t << 4) + 512, true, true);
          } else {
            SingleChildContainer.drawScreenOrTransition(false, 97, fc.field_e);
            var4.drawFadeTransition(NameAvailabilityValidator.field_t << 4, true, false);
          }
        }
        TextTableInitializer.drawFrontEndOverlays(ep.isBlinkPhaseVisible(30022), 12402);
        if (fc.field_e == 4 ||
          MidiPcmStream.field_t == 4) {
          var3Lifetime1 = 192;
          if (MidiPcmStream.field_t != fc.field_e) {
            var3Lifetime1 = NameAvailabilityValidator.field_t << 3;
            if (var3Lifetime1 > 192) {
              var3Lifetime1 = 192;
            }
            if (fc.field_e == 4) {
              var3Lifetime1 = 192 - var3Lifetime1;
            }
          }
          SoftwareRasterizer.fillRectangleAlpha(0, nf.field_f, 640, -nf.field_f + 480, 0, var3Lifetime1);
        }
        if (fc.field_e != MidiPcmStream.field_t &&
          -2 == MidiPcmStream.field_t) {
          var3Lifetime2 = -(NameAvailabilityValidator.field_t << 4) + 256;
          if (var3Lifetime2 < 0) {
            var3Lifetime2 = 0;
          }
          MusicPatchNode.field_B.drawAlpha(0, 0, var3Lifetime2);
        } else if (MidiPcmStream.field_t != fc.field_e &&
          fc.field_e == -2) {
          var3Lifetime2 = NameAvailabilityValidator.field_t << 4;
          if (var3Lifetime2 > 256) {
            var3Lifetime2 = 256;
          }
          MusicPatchNode.field_B.drawAlpha(0, 0, var3Lifetime2);
        } else {
          if (fc.field_e != -2) {
            MusicPatchNode.field_B.drawTransparent(0, 0);
          }
        }
        un.drawAchievementBanner((byte) 87);
        if (!hf.b((byte) 100)) {
          if (pe.requestLeaveServer(false)) {
            if (ib.field_f == null) {
              stackIn_51_0 = ro.field_d;
            } else {
              stackIn_51_0 = true;
            }
            LoadingProgressDialog.drawDimmedAccountLayers(stackIn_51_0, true);
          } else {
            if (Kite.isMessageMenuPending((byte) 41)) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d);
              ValidationState.setLegacyMenuFrameStyle(ab.field_c[0].field_F, ab.field_c[0].field_E, ab.field_c, -1501881951);
            }
          }
        } else {
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d);
          ThreeSliceButtonPainter.setLegacyMenuFrameSprites(ab.field_c, ab.field_c[0].field_E, -96, ab.field_c[0].field_F);
        }
        if (GameModeCard.field_a != GameModeCard.field_d) {
          var3Lifetime3 = (hf.field_o << 8) / 16;
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d, 0, var3Lifetime3);
        }
        fj.presentToCanvas(0, 0, (byte) -123, var6);
    }

    private final boolean updateArchiveLoading(boolean param0, int param1) {
        int var3_int = 0;
        int var8 = 0;
        int var9;
        Sprite var3;
        Sprite var4;
        Sprite var5;
        Sprite var6;
        Sprite[][] var7;
        var9 = field_H ? 1 : 0;
        TextTableInitializer.initializeMenuLabels(-29810);
        if (ji.field_b != null) {
          if (qn.field_l.ensureIndex(-3) &&
            qn.field_l.ensureGroupAvailableByName("basic", -1)) {
            if (qn.field_l.ensureIndex(-3) &&
              qn.field_l.ensureGroupAvailableByName("arial13", -1)) {
              if (dg.field_d.ensureIndex(-3) &&
                dg.field_d.ensureGroupAvailableByName("arial13", param1 ^ -5)) {
                if (qn.field_l.ensureIndex(-3) &&
                  qn.field_l.ensureGroupAvailableByName("lobby", -1)) {
                  if (dg.field_d.ensureIndex(param1 ^ -7) &&
                    dg.field_d.ensureGroupAvailableByName("lobby", -1)) {
                    if (ji.field_b.ensureIndex(-3) &&
                      ji.field_b.ensureAllGroupsAvailable((byte) 92)) {
                      if (PacketBuffer.field_p.ensureIndex(param1 ^ -7) &&
                        PacketBuffer.field_p.ensureAllGroupsAvailable((byte) 92)) {
                        if (ab.field_f.ensureIndex(-3) &&
                          ab.field_f.ensureAllGroupsAvailable((byte) 92)) {
                          if (BoundedRandomAccessFile.field_c.ensureIndex(-3) &&
                            BoundedRandomAccessFile.field_c.ensureAllGroupsAvailable((byte) 92)) {
                            if (MenuInputState.field_d.ensureIndex(-3) &&
                              MenuInputState.field_d.ensureGroupAvailableByName("basic", -1)) {
                              if (PlayerBoard.field_c.ensureIndex(param1 ^ -7) &&
                                PlayerBoard.field_c.ensureGroupAvailableByName("basic", -1)) {
                                if (SocketConnector.field_a.ensureIndex(-3) &&
                                  SocketConnector.field_a.ensureAllGroupsAvailable((byte) 92)) {
                                  if (GameModeSelectScreen.field_u.ensureIndex(-3) &&
                                    GameModeSelectScreen.field_u.ensureAllGroupsAvailable((byte) 92)) {
                                    FireworkDisplay.setLoadingStatus(85.0f, -1, rh.field_r);
                                    this.renderClient(param1 + 106);
                                    if (!param0) {
                                      return false;
                                    }
                                    SocketConnector.stopAudioService(5);
                                    Js5Transport.loadSkinSounds(new SoundCache(ji.field_b, PacketBuffer.field_p), 5088, PacketBuffer.field_p);
                                    ji.field_b = null;
                                    sf.a(param1 - 4);
                                    return false;
                                  }
                                  FireworkDisplay.setLoadingStatus(80.0f, -1, dk.formatArchiveProgressLabel(em.field_a, 0, RasterState.field_p, GameModeSelectScreen.field_u));
                                  return false;
                                }
                                FireworkDisplay.setLoadingStatus(75.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(120, SocketConnector.field_a, em.field_a, "", RasterState.field_p));
                                return false;
                              }
                              FireworkDisplay.setLoadingStatus(75.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(53, PlayerBoard.field_c, CipherPacketBuffer.field_x, "basic", CanvasRasterBuffer.field_f));
                              return false;
                            }
                            FireworkDisplay.setLoadingStatus(75.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(param1 + 113, MenuInputState.field_d, PasswordValidator.field_q, "basic", SocialListEntry.field_Mb));
                            return false;
                          }
                          FireworkDisplay.setLoadingStatus(60.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(61, BoundedRandomAccessFile.field_c, AccountChoicePanel.field_I, "", fq.field_p));
                          return false;
                        }
                        FireworkDisplay.setLoadingStatus(45.0f, -1, BoundedRandomAccessFile.formatProgressLabel(ab.field_f, fq.field_p, AccountChoicePanel.field_I, -22165, 0));
                        return false;
                      }
                      FireworkDisplay.setLoadingStatus(40.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(83, PacketBuffer.field_p, EmergentBehaviourBackground.field_n, "", l.field_u));
                      return false;
                    }
                    FireworkDisplay.setLoadingStatus(20.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(125, ji.field_b, EmergentBehaviourBackground.field_n, "", l.field_u));
                    return false;
                  }
                  FireworkDisplay.setLoadingStatus(17.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(107, dg.field_d, CipherPacketBuffer.field_x, "lobby", CanvasRasterBuffer.field_f));
                  return false;
                }
                FireworkDisplay.setLoadingStatus(13.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(56, qn.field_l, PasswordValidator.field_q, "lobby", SocialListEntry.field_Mb));
                return false;
              }
              FireworkDisplay.setLoadingStatus(12.0f, -1, TextLayoutLine.formatNamedGroupProgressLabel(57, dg.field_d, CipherPacketBuffer.field_x, "arial13", CanvasRasterBuffer.field_f));
              return false;
            }
            FireworkDisplay.setLoadingStatus(11.0f, param1 ^ -5, TextLayoutLine.formatNamedGroupProgressLabel(78, qn.field_l, PasswordValidator.field_q, "arial13", SocialListEntry.field_Mb));
            return false;
          }
          FireworkDisplay.setLoadingStatus(10.0f, param1 - 5, TextLayoutLine.formatNamedGroupProgressLabel(62, qn.field_l, PasswordValidator.field_q, "basic", SocialListEntry.field_Mb));
          return false;
        }
        if (PacketBuffer.field_p != null) {
          FireworkDisplay.setLoadingStatus(90.0f, -1, rh.field_r);
          this.renderClient(param1 + 94);
          PacketBuffer.field_p = null;
          sf.a(0);
          return false;
        }
        if (BoundedRandomAccessFile.field_c != null) {
          FireworkDisplay.setLoadingStatus(92.0f, param1 ^ -5, "Unpacking music");
          this.renderClient(117);
          lg.loadMusicTracks(param1 - 1, BoundedRandomAccessFile.field_c);
          BoundedRandomAccessFile.field_c = null;
        }
        if (ab.field_f != null) {
          FireworkDisplay.setLoadingStatus(94.0f, param1 - 5, ff.field_f);
          this.renderClient(118);
          for (var3_int = 0; var3_int < 18; var3_int++) {
            if (bj.field_c[var3_int] != null &&
              !ri.field_a.field_x.prepareTrack(bj.field_c[var3_int], SoundCache.field_d, ab.field_f, 109, 176400)) {
              sf.a(0);
              return false;
            }
          }
          ri.field_a.field_x.releasePatchSamples(-38);
          ri.field_a.field_H.releasePatchSamples(-38);
          ab.field_f = null;
          SoundCache.field_d = null;
          sf.a(0);
          return false;
        }
        if (null == PlayerBoard.field_c) {
          if (SocketConnector.field_a != null) {
            LoadingStepTracker.setChatHuffmanCodec(true, new HuffmanCodec(SocketConnector.field_a.getNamedFile((byte) 24, "huffman", "")));
            SocketConnector.field_a = null;
            sf.a(param1 - 4);
            return false;
          }
          ArchiveRequest.createTimerBarCapSprites((byte) 112);
          Js5NetworkRequest.createRoundedPanelSprite(7902);
          wo.buildCountdownSprites(3);
          id.createGlowAndNoiseSprites(param1 - 2);
          nd.initializeMenuButtonWidths(3);
          if (param1 != 4) {
            this.shutdownClientServices(-87);
          }
          nd.buildHowToPlayDemo((byte) 37);
          MidiPcmStream.field_t = 0;
          fc.field_e = 14;
          wo.setFrameRate(50, -37);
          ArrayWidgetContainer.setSoundVolume(256, -113);
          dg.playMenuMusic(0, (byte) -90);
          sf.a(0);
          return true;
        }
        FireworkDisplay.setLoadingStatus(96.0f, -1, CachedTextLayout.field_g);
        this.renderClient(param1 ^ 123);
        PieceTiming.field_e = RisingBubble.loadPaletteFont(MenuInputState.field_d, "basic", "font", PlayerBoard.field_c, 22510);
        qj.field_e = PicturePreview.loadBinaryBitmapFontByName(param1 ^ 4, dg.field_d, "", qn.field_l, "arial13");
        nh.buildFontColourPalettes((byte) 117);
        EmergentBehaviourBackground.field_u = bi.loadSprite("basic", "background", MenuInputState.field_d, (byte) -36);
        Match.createPuzzleModePuzzle(13728, 0, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 23, "basic", "level1"));
        Match.createPuzzleModePuzzle(13728, 1, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, -128, "basic", "level2"));
        Match.createPuzzleModePuzzle(13728, 2, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, -4, "basic", "level3"));
        Match.createPuzzleModePuzzle(13728, 3, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 41, "basic", "level4"));
        Match.createPuzzleModePuzzle(13728, 4, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, -114, "basic", "level5"));
        Match.createPuzzleModePuzzle(13728, 5, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 66, "basic", "level6"));
        Match.createPuzzleModePuzzle(param1 + 13724, 6, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, param1 ^ 122, "basic", "level7"));
        Match.createPuzzleModePuzzle(13728, 7, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 0, "basic", "level8"));
        Match.createPuzzleModePuzzle(13728, 8, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 59, "basic", "level9"));
        Match.createPuzzleModePuzzle(13728, 9, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, -121, "basic", "level10"));
        FallingPieceView.field_c[3][4] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, -106, "basic", "set34");
        FallingPieceView.field_c[4][3] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, param1 + 28, "basic", "set43");
        FallingPieceView.field_c[3][5] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 125, "basic", "set35");
        FallingPieceView.field_c[5][3] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 80, "basic", "set53");
        FallingPieceView.field_c[4][4] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 47, "basic", "set44");
        FallingPieceView.field_c[5][4] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 77, "basic", "set54");
        FallingPieceView.field_c[4][5] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, -105, "basic", "set45");
        FallingPieceView.field_c[5][5] = NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, -111, "basic", "set55");
        td.buildPuzzleModePictures(127, NetworkGameClient.loadIndexedSpritesByName(MenuInputState.field_d, 44, "basic", "puzzle"));
        lg.field_d[0] = bi.loadSprite("basic", "icon_singleplayer", MenuInputState.field_d, (byte) -45);
        lg.field_d[1] = bi.loadSprite("basic", "icon_puzzle", MenuInputState.field_d, (byte) -73);
        var3 = bi.loadSprite("basic", "locked", qn.field_l, (byte) -124);
        MusicPatch.field_m = bi.loadSprite("basic", "icon_menu", MenuInputState.field_d, (byte) -105);
        NumericDateInputWidget.field_W = SocketConnector.loadRgbSpritesByName("titles", "basic", (byte) 47, MenuInputState.field_d);
        ih.field_a = SocketConnector.loadRgbSpritesByName("tick", "basic", (byte) 47, MenuInputState.field_d);
        hp.field_Gb = bi.loadSprite("basic", "timer", MenuInputState.field_d, (byte) -86);
        JaggrabDownloader.field_m = SocketConnector.loadRgbSpritesByName("marker", "basic", (byte) 47, MenuInputState.field_d);
        PicturePreview.loadFrameSprites(5, "basic", "frame");
        ab.field_c = PicturePreview.loadFrameSprites(param1 + 1, "basic", "frame_filled");
        bi.field_g = PicturePreview.loadFrameSprites(5, "basic", "frame_raised");
        MusicPatchNode.field_B = bi.loadSprite("basic", "gameframe", MenuInputState.field_d, (byte) -25);
        PlayerBoard.field_w = var3;
        gd.field_i = var3;
        MatchingTextValidator.field_v = bi.loadSprite("basic", "instructions6", MenuInputState.field_d, (byte) -121);
        pk.field_c = SocketConnector.loadRgbSpritesByName("instructions_keys", "basic", (byte) 47, MenuInputState.field_d);
        CachedTextLayout.field_p = SocketConnector.loadRgbSpritesByName("instructions_keys2", "basic", (byte) 47, MenuInputState.field_d);
        jk.field_a = bi.loadSprite("basic", "background_rushes", MenuInputState.field_d, (byte) -58);
        ThreeSliceButtonPainter.field_w = bi.loadSprite("basic", "background_retro", MenuInputState.field_d, (byte) -78);
        AccountRequestDialog.field_tb = SocketConnector.loadRgbSpritesByName("sprites_retro", "basic", (byte) 47, MenuInputState.field_d);
        ArrayWidgetContainer.field_H = bi.loadSprite("basic", "background_bouncedown", MenuInputState.field_d, (byte) -117);
        DebouncedValidator.field_b = bi.loadSprite("basic", "sprites_bouncedown", MenuInputState.field_d, (byte) -125);
        SocketConnector.field_c = SocketConnector.loadRgbSpritesByName("cloud", "basic", (byte) 47, MenuInputState.field_d);
        IntrusiveDequeCursor.field_f = bi.loadSprite("basic", "kite", MenuInputState.field_d, (byte) -77);
        ContentTransitionDialog.field_hb = bi.loadSprite("basic", "bow", MenuInputState.field_d, (byte) -30);
        CheckboxPainter.field_j = bi.loadSprite("basic", "lobby_logo", MenuInputState.field_d, (byte) -62);
        em.setupPuzzleSelectGrid(SocketConnector.loadRgbSpritesByName("scrollbutton", "basic", (byte) 47, MenuInputState.field_d), -77);
        var4 = bi.loadSprite("basic", "background_fireworks", MenuInputState.field_d, (byte) -38);
        var5 = bi.loadSprite("basic", "sprite_fireworks", MenuInputState.field_d, (byte) -95);
        ValidationHelpWidget.setBackgroundAndShadow(var4, var5, 80);
        SecondaryNodeDequeIterator.buildSkinTileSprites(0, SocketConnector.loadRgbSpritesByName("tiles0", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        SecondaryNodeDequeIterator.buildSkinTileSprites(1, SocketConnector.loadRgbSpritesByName("tiles1", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        SecondaryNodeDequeIterator.buildSkinTileSprites(2, SocketConnector.loadRgbSpritesByName("tiles2", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        SecondaryNodeDequeIterator.buildSkinTileSprites(3, SocketConnector.loadRgbSpritesByName("tiles3", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        SecondaryNodeDequeIterator.buildSkinTileSprites(4, SocketConnector.loadRgbSpritesByName("tiles4", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        SecondaryNodeDequeIterator.buildSkinTileSprites(5, SocketConnector.loadRgbSpritesByName("tiles5", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        SecondaryNodeDequeIterator.buildSkinTileSprites(6, SocketConnector.loadRgbSpritesByName("tiles6", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        SecondaryNodeDequeIterator.buildSkinTileSprites(7, SocketConnector.loadRgbSpritesByName("tiles7", "basic", (byte) 47, MenuInputState.field_d), (byte) -53);
        oo.field_c = new Sprite[22];
        oo.field_c[0] = bi.loadSprite("basic", "achievement0", MenuInputState.field_d, (byte) -75);
        oo.field_c[1] = bi.loadSprite("basic", "achievement1", MenuInputState.field_d, (byte) -57);
        oo.field_c[2] = bi.loadSprite("basic", "achievement2", MenuInputState.field_d, (byte) -34);
        oo.field_c[3] = bi.loadSprite("basic", "achievement3", MenuInputState.field_d, (byte) -125);
        oo.field_c[4] = bi.loadSprite("basic", "achievement4", MenuInputState.field_d, (byte) -34);
        oo.field_c[5] = bi.loadSprite("basic", "achievement5", MenuInputState.field_d, (byte) -37);
        oo.field_c[6] = bi.loadSprite("basic", "achievement6", MenuInputState.field_d, (byte) -93);
        oo.field_c[7] = bi.loadSprite("basic", "achievement7", MenuInputState.field_d, (byte) -88);
        oo.field_c[8] = bi.loadSprite("basic", "achievement8", MenuInputState.field_d, (byte) -76);
        oo.field_c[9] = bi.loadSprite("basic", "achievement9", MenuInputState.field_d, (byte) -105);
        oo.field_c[10] = bi.loadSprite("basic", "achievement10", MenuInputState.field_d, (byte) -62);
        oo.field_c[11] = bi.loadSprite("basic", "achievement11", MenuInputState.field_d, (byte) -82);
        oo.field_c[12] = bi.loadSprite("basic", "achievement12", MenuInputState.field_d, (byte) -81);
        oo.field_c[13] = bi.loadSprite("basic", "achievement13", MenuInputState.field_d, (byte) -100);
        oo.field_c[14] = bi.loadSprite("basic", "achievement14", MenuInputState.field_d, (byte) -102);
        oo.field_c[15] = bi.loadSprite("basic", "achievement15", MenuInputState.field_d, (byte) -81);
        oo.field_c[16] = bi.loadSprite("basic", "achievement16", MenuInputState.field_d, (byte) -41);
        oo.field_c[17] = bi.loadSprite("basic", "achievement17", MenuInputState.field_d, (byte) -89);
        oo.field_c[18] = bi.loadSprite("basic", "achievement18", MenuInputState.field_d, (byte) -106);
        oo.field_c[19] = bi.loadSprite("basic", "achievement19", MenuInputState.field_d, (byte) -40);
        oo.field_c[20] = bi.loadSprite("basic", "achievement20", MenuInputState.field_d, (byte) -92);
        oo.field_c[21] = bi.loadSprite("basic", "achievement21", MenuInputState.field_d, (byte) -39);
        ScorePopup.field_a = bi.loadSprite("basic", "unachieved", qn.field_l, (byte) -86);
        var6 = bi.loadSprite("basic", "orbcoin", qn.field_l, (byte) -32);
        KeyboardInputHandler.a((byte) -59, ScorePopup.field_a);
        KeyboardInputHandler.a((byte) -59, var6);
        RisingBubble.field_c = new Sprite(16, 16);
        RisingBubble.field_c.makeRasterTarget();
        var6.drawScaledAveraged(0, 0, 16, 16);
        CanvasRasterBuffer.field_b = new Sprite(22, 48);
        MenuScreen.field_c = new Sprite(22, 48);
        CanvasRasterBuffer.field_b.makeRasterTarget();
        SoftwareRasterizer.fillRoundedRectangle(-22, 0, 42, 48, 20, 65793);
        MenuScreen.field_c.makeRasterTarget();
        CanvasRasterBuffer.field_b.drawHorizontalFlip(0, 0);
        ClientException.field_f.bindRaster(19692);
        var7 = new Sprite[Kite.field_u.length][];
        for (var8 = 0; Kite.field_u.length > var8; var8++) {
          if (null != Kite.field_u[var8]) {
            var7[var8] = SocketConnector.loadRgbSpritesByName(Kite.field_u[var8], "basic", (byte) 47, MenuInputState.field_d);
          }
        }
        CachedArchiveProvider.initializeLobbyUi(true, DriftingParticle.field_c, LoginCredentials.field_d, qn.field_l, hp.field_Hb, la.field_c, var7, 2, 2, var7, GameModeSelectScreen.field_u, param1 + 29, IntKeyLookup.field_d, dg.field_d, cl.field_f);
        fe.field_a = false;
        ri.allocateChatHistory(200, (byte) -126);
        Js5ArchiveManager.setSharedArchives(qn.field_l, true, dg.field_d);
        ProxySocketConnector.readGameAppletParameters((byte) -94, 0, 0, 16777215, (java.applet.Applet) (this), AccountNoticeDialog.field_bb);
        PlayerBoard.field_c = null;
        dg.field_d = null;
        sf.a(0);
        return false;
    }

    public final void init() {
        this.startClientApplet("Pixelate", 640, 13);
    }

    private final void openArchives(int param0) {
        if (null != WidgetStyleLayer.field_f) {
          LoginForm.loadTextResources(79, WidgetStyleLayer.field_f);
          WidgetStyleLayer.field_f = null;
          sf.a(0);
        }
        if (param0 != -18528) {
          Pixelate.updateLobbyGameList(false, (byte) -93, -109, true, 5, -125, 20);
        }
        SocketConnector.field_a = MouseInputHandler.createLocalArchive(3, (byte) 124);
        MenuInputState.field_d = MouseInputHandler.createLocalArchive(5, (byte) 124);
        PlayerBoard.field_c = MouseInputHandler.createLocalArchive(6, (byte) 124);
        ji.field_b = MouseInputHandler.createLocalArchive(7, (byte) 124);
        PacketBuffer.field_p = MouseInputHandler.createLocalArchive(8, (byte) 124);
        ab.field_f = MouseInputHandler.createLocalArchive(9, (byte) 124);
        BoundedRandomAccessFile.field_c = MouseInputHandler.createLocalArchive(10, (byte) 124);
        GameModeSelectScreen.field_u = MouseInputHandler.createLocalArchive(11, (byte) 124);
        TextTableInitializer.initializeMenuLabels(-29810);
    }

    private final void advanceClientState(boolean param0, boolean param1) {
        boolean discarded$0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_61_0 = false;
        int stackIn_79_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int var3;
        BinaryBitmapFont var3_ref_tc;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var3Lifetime1;
        var8 = field_H ? 1 : 0;
        if (GameModeCard.field_d != GameModeCard.field_a) {
          if (GameModeCard.field_a == TextTableInitializer.field_e) {
            hf.field_o = hf.field_o + 1;
            if (16 == hf.field_o) {
              if (FireworkSpark.field_b) {
                d.restartLogin(-17540);
              } else {
                MarkerSlider.returnToLoginStage(-20822);
              }
              GameModeCard.field_a = BoardView.field_y;
            }
          } else {
            if (BoardView.field_y != GameModeCard.field_a) {
              hf.field_o = hf.field_o - 1;
              if (hf.field_o == 0) {
                GameModeCard.field_a = GameModeCard.field_d;
              }
            } else {
              if (!ArrayWidgetContainer.isAccountUiActive((byte) 121)) {
                if (null != HighscoresScreen.field_p) {
                  ValidationHelpWidget.queueHighscoreSubmission(HighscoresScreen.field_p, true, 3);
                }
                un.clearPendingMessageFlag(true);
                var3 = TimerBarDemo.field_q;
                stackIn_79_0 = (gq.isOfflineOrAccountUi(74)) ? 12 : 0;
                la.changeScreen(stackIn_79_0, var3, true, -25528);
                if (FireworkSpark.field_b) {
                  FireworkSpark.field_b = false;
                  var3_ref_tc = qj.field_e;
                  QuickChatPhraseCache.configureQuickChatStyle(((BitmapFont) ((Object) var3_ref_tc)).maxDescent + ((BitmapFont) ((Object) var3_ref_tc)).maxAscent, -879, ((BitmapFont) ((Object) var3_ref_tc)).maxAscent, 2, 320, 8, ab.field_c, var3_ref_tc, 240, bi.field_g, 8, false);
                }
                if (BoardParticle.isNonNegative((byte) -104, MidiPcmStream.field_t)) {
                  IntrusiveDequeCursor.commitScreenChange(0);
                }
                GameModeCard.field_a = MatchingTextValidator.field_A;
              } else {
                GameModeCard.field_a = MatchingTextValidator.field_A;
              }
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          mi.tickAchievementBanner(-124);
          if (!param0) {
            if (fc.field_e == MidiPcmStream.field_t) {
              if (fc.field_e == -1) {
                if (!StripedProgressBar.field_G) {
                  while (DirectByteStorage.pollKeyEvent(123)) {
                    if (EmailValidator.field_m[82] &&
                      ke.field_a == 11) {
                      stackIn_24_0 = !(Match.field_u);
                      Match.field_u = stackIn_24_0;
                    }
                    ro.field_e.handleKey(ke.field_a, (byte) -79);
                  }
                  ro.field_e.tick(-110, true);
                } else {
                  var4 = 1;
                  var3 = 1;
                }
              } else {
                if (fc.field_e != -2) {
                  if (BoardParticle.isNonNegative((byte) -104, fc.field_e)) {
                    wo.getScreen(-79, fc.field_e).handleInput((byte) -83);
                    DialWidgetPainter.tickFloatingSquares(0);
                  }
                } else {
                  var3 = 1;
                  DialWidgetPainter.tickFloatingSquares(0);
                }
              }
            } else {
              NameAvailabilityValidator.field_t = NameAvailabilityValidator.field_t + 1;
              if (NameAvailabilityValidator.field_t == 32) {
                IntrusiveDequeCursor.commitScreenChange(0);
              }
              DialWidgetPainter.tickFloatingSquares(0);
              if ((MidiPcmStream.field_t == -1 ||
                fc.field_e == -1) && null != LoginCredentials.field_e) {
                LoginCredentials.field_e.tick(-1);
              }
            }
          }
          if (StripedProgressBar.field_G &&
            !ValidationState.field_c &&
            !LinkButtonPainter.field_d) {
            bl.updateLobbyHighlightsAndLayout(-55, var3 != 0);
            if (PlayerBoard.field_g) {
              MatchController.openTextPopup(true, 1, fc.field_e, (byte) -68, InputQueue.field_a);
              PlayerBoard.field_g = false;
            }
            if (DateOfBirthValidator.field_i) {
              MatchingTextValidator.field_r.tick(-110, var4 != 0);
            }
            if (ValidationHelpWidget.field_Y) {
              ro.field_e.tick(-110, var4 != 0);
            }
            while (DirectByteStorage.pollKeyEvent(122)) {
              if (ContentTransitionDialog.field_kb &&
                LabeledField.dispatchKeyInput(true, 13, 15, 12)) {
                continue;
              }
              if (DateOfBirthValidator.field_i) {
                MatchingTextValidator.field_r.handleKey(ke.field_a, (byte) -35);
              }
              if (!ValidationHelpWidget.field_Y) {
                continue;
              }
              ro.field_e.handleKey(ke.field_a, (byte) 116);
            }
          }
          if (!StripedProgressBar.field_G) {
            UiComponent.resetOverlayState(false);
          }
          boolean decompiledFrameRemainder0 = true;
          if (MidiPcmStream.field_t != -2 &&
            MidiPcmStream.field_t != -5 &&
            MidiPcmStream.field_t != -4 && (MidiPcmStream.field_t != -1 ||
            !DateOfBirthValidator.field_i) && 4 != MidiPcmStream.field_t) {
            stackIn_61_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_61_0 = true;
          }
          ContentTransitionDialog.field_kb = stackIn_61_0;
          if (!ContentTransitionDialog.field_kb) {
            if (0 >= AccountNamePrompt.field_Kb) {
              var5 = qh.field_c * qh.field_c;
              var6 = -(AccountNamePrompt.field_Kb * AccountNamePrompt.field_Kb) + var5;
              var7 = nf.field_f + var6 * 120 / var5;
              qf.a(21983, var7);
            } else {
              AccountNamePrompt.field_Kb = AccountNamePrompt.field_Kb - 1;
              var5 = qh.field_c * qh.field_c;
              var6 = -(AccountNamePrompt.field_Kb * AccountNamePrompt.field_Kb) + var5;
              var7 = nf.field_f + var6 * 120 / var5;
              qf.a(21983, var7);
            }
          } else {
            if (AccountNamePrompt.field_Kb < qh.field_c) {
              AccountNamePrompt.field_Kb = AccountNamePrompt.field_Kb + 1;
            }
            var5 = qh.field_c * qh.field_c;
            var6 = -(AccountNamePrompt.field_Kb * AccountNamePrompt.field_Kb) + var5;
            var7 = nf.field_f + var6 * 120 / var5;
            qf.a(21983, var7);
          }
        }
        if (MidiPcmStream.field_t == -3) {
          HighscoresScreen.field_p = null;
          ro.field_e = new MatchController();
          stackIn_97_0 = (!MenuScreen.field_f) ? 0 : 1;
          var3Lifetime1 = stackIn_97_0;
          stackIn_100_0 = (gq.isOfflineOrAccountUi(108)) ? 12 : 0;
          la.changeScreen(stackIn_100_0, -1, var3Lifetime1 != 0, -25528);
        }
        if (MidiPcmStream.field_t == -4) {
          ChatMessage.field_f.writeOpcode(9, 15514);
          ValidationState.field_c = true;
          MidiPcmStream.field_t = fc.field_e;
          AccountNamePrompt.field_Kb = qh.field_c;
        }
        if (!param1) {
          discarded$0 = this.updateArchiveLoading(false, 93);
        }
        if (MidiPcmStream.field_t == -5) {
          qg.a(LoginMethod.field_c.getGameId((byte) 8), 11, false);
          LinkButtonPainter.field_d = true;
          MidiPcmStream.field_t = fc.field_e;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 3478) {
          return;
        }
        field_E = null;
        field_G = null;
    }

    final static int parseIntWithRadix(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = StrongCacheReference.parseInt(param2, param0, true, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = -73;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("Pixelate.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_G = new bd();
    }
}
