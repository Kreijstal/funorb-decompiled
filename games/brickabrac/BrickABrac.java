/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class BrickABrac extends InteractiveGameClient {
    static ResourceArchive backgroundSoundEffectArchive;
    static String field_G;
    static SecondaryHashTable gamePlayerIndex;
    static int[] fullscreenDialogRowButtons;
    static String field_H;
    public static boolean field_J;

    public final void renderGameLayer(int obfuscationGuard) {
        int transitionActive;
        IntNode notification;
        int notificationY;
        int notificationTick;
        int clientBranchFlag;
        int stackIn_6_0 = 0;
        clientBranchFlag = field_J ? 1 : 0;
        if (null != InvitationDialogHelpers.pendingScreen) {
          stackIn_6_0 = (AccountMessageDialog.currentScreen.supportsTransition((byte) -51)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        transitionActive = stackIn_6_0;
        if (transitionActive != 0) {
          if (16 > NodeDequeCursor.screenTransitionTick) {
            AccountMessageDialog.currentScreen.drawScreen((byte) -75);
            PixelBlockEffect.pixelate(NodeDequeCursor.screenTransitionTick + 1, 256, 16769381, false, false);
          } else {
            InvitationDialogHelpers.pendingScreen.drawScreen((byte) -85);
            PixelBlockEffect.pixelate(32 - (NodeDequeCursor.screenTransitionTick - 1), 256, 16769381, false, false);
          }
        } else {
          AccountMessageDialog.currentScreen.drawScreen((byte) -63);
        }
        notification = (IntNode) (LevelResultWireHelpers.achievementNotifications.first(-123));
        if (obfuscationGuard != 16769381) {
          backgroundSoundEffectArchive = (ResourceArchive) null;
        }
        if (notification != null) {
          notificationTick = ClientViewHelpers.achievementNotificationTick;
          if (notificationTick < 80) {
            notificationY = -32 + notificationTick / 2;
          } else {
            if (230 > notificationTick) {
              notificationY = 8;
            } else {
              notificationY = 123 - notificationTick / 2;
            }
          }
          IntrusiveHashTable.achievementSourceIcons[notification.value].drawQuarter(8, notificationY);
          ContextActionController.field_g.drawLeft(AchievementBrowserScreen.field_s[notification.value], 48, notificationY + ContextActionController.field_g.ascent, 0, -1);
        }
        if (PauseMenuHelpers.isLoginPrivilegeAtLeastTwo((byte) 62)) {
          GamePresentationHelpers.drawDiagnosticOverlay(-79);
        }
    }

    public final void updateGameLayer(boolean inputEnabled, byte obfuscationGuard) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        GameScreen stackIn_17_0 = null;
        boolean stackIn_17_1 = false;
        boolean stackIn_18_2 = false;
        int transitionActive;
        int var4;
        int clientBranchFlag;
        LevelResultSubmission var6;
        clientBranchFlag = field_J ? 1 : 0;
        PacketReceiveHelpers.pumpAudio(-127);
        MembershipBenefitsScreen.clientTick = MembershipBenefitsScreen.clientTick + 1;
        if (!QuickChatMenu.isGuestSession(-26090)) {
          while (true) {
            var6 = (LevelResultSubmission) (IntNode.queuedLevelResults.removeFirst(3));
            if (var6 == null) {
              break;
            }
            PasswordValidator.submitLevelResult(var6, 5, (byte) -116);
          }
        }
        if (InvitationDialogHelpers.pendingScreen != null) {
          stackIn_10_0 = (AccountMessageDialog.currentScreen.supportsTransition((byte) -51)) ? 1 : 0;
        } else {
          stackIn_10_0 = 0;
        }
        transitionActive = stackIn_10_0;
        if (IntArrayRequest.gameplayScreen != AccountMessageDialog.currentScreen ||
          IntArrayRequest.gameplayScreen.networkedMatch ||
          transitionActive == 0) {
          stackIn_17_0 = AccountMessageDialog.currentScreen;
          stackIn_17_1 = true;
          stackIn_18_2 = (inputEnabled) && (transitionActive == 0);
          ((GameScreen) (Object) stackIn_17_0).advanceScreen(stackIn_17_1, stackIn_18_2, -104);
        }
        if (transitionActive != 0) {
          if ((IntArrayRequest.gameplayScreen != InvitationDialogHelpers.pendingScreen ||
            IntArrayRequest.gameplayScreen.networkedMatch) &&
            InvitationDialogHelpers.pendingScreen != null) {
            InvitationDialogHelpers.pendingScreen.advanceScreen(false, false, -82);
          }
          NodeDequeCursor.screenTransitionTick = NodeDequeCursor.screenTransitionTick + 1;
          if (32 == NodeDequeCursor.screenTransitionTick) {
            OpacityWidget.finishScreenTransition((byte) -126);
          }
        } else {
          if (IntArrayRequest.gameplayScreen != null &&
            AccountMessageDialog.currentScreen != IntArrayRequest.gameplayScreen &&
            IntArrayRequest.gameplayScreen.networkedMatch) {
            IntArrayRequest.gameplayScreen.advanceScreen(false, false, -81);
          }
        }
        if (null != LevelResultWireHelpers.achievementNotifications.first(-8)) {
          fieldTemp$0 = ClientViewHelpers.achievementNotificationTick + 1;
          ClientViewHelpers.achievementNotificationTick = ClientViewHelpers.achievementNotificationTick + 1;
          if (fieldTemp$0 == 335) {
            ClientViewHelpers.achievementNotificationTick = 0;
            LevelResultWireHelpers.achievementNotifications.removeFirst(3);
          }
        }
        if (ClientViewHelpers.achievementNotificationTick == 50) {
          SoundCache.playUiSound(8, NineSliceFrame.uiSounds[9]);
        }
        if (PauseMenuHelpers.isLoginPrivilegeAtLeastTwo((byte) 62)) {
          IntegerParsingHelpers.updateDiagnosticOverlay(false);
        }
        var4 = 46 / ((-61 - obfuscationGuard) / 47);
    }

    final void initializeClient(boolean obfuscationGuard) {
        this.initializeClientServices((byte) 39, 0, 2, obfuscationGuard, 1, 4, 14, 65);
        ButtonWidgetRenderer.field_w = new IsaacGenerator(new int[]{(int)MonotonicTime.nowMillis(false)});
        AppletFlowHelpers.field_c = new RgbSprite(640, 480);
        Widget.initializeMidiSynthesizer(AccountMessageDialog.field_ub, (byte) 60, CacheIoRequest.windowCanvas);
        this.registerUiLifecycle(3160, new GameUiController());
        ReportAbuseDialog.registerGamePacketLengths(SocialListResponseHelpers.incomingPacketLengths, 1);
    }

    final boolean isConnectionBusy(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 73) {
          return false;
        }
        stackIn_8_0 = (MonotonicTime.field_c) || (RadialSelectorWidget.field_L) || (IntegerBitLengthHelpers.field_d);
        return stackIn_8_0;
    }

    final boolean handleGamePacket(BitPacketBuffer packet, byte obfuscationGuard, int opcode) {
        int var8_int = 0;
        int fieldTemp$0 = 0;
        int var10 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        GameplayScreen stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        GameplayScreen stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        GameplayScreen stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        BitPacketBuffer stackIn_99_2 = null;
        boolean stackIn_100_3;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_138_2 = null;
        RuntimeException decompiledCaughtException = null;
        int resultWordFlag = 0;
        int[] var4 = null;
        RuntimeException failure = null;
        String[] playerNameStorage = null;
        int[] var5_array = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        IsaacGenerator matchRandom = null;
        int[] seedWords = null;
        int repeatMode = 0;
        LevelSequence configuration = null;
        int backgroundSelector = 0;
        int localPlayerMask = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var21 = null;
        int[] var23 = null;
        BitPacketBuffer var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        String[] playerNames = null;
        int[] randomSeedStorage = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] randomSeeds = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] levelOrder = null;
        int[] characterOrder = null;
        int[] var5_arrayLifetime1;
        int[] var5_arrayLifetime2;
        int[] var5_arrayLifetime3;
        int localPlayerId;
        var16 = field_J ? 1 : 0;
        try {
          if (9 == opcode) {
            OpacityWidget.finishScreenTransition((byte) -113);
            RadialSelectorWidget.field_L = false;
            ScreenNavigationHelpers.requestScreen(false, obfuscationGuard + 66, 11);
            IndexedSpriteHelpers.setMessageText(true, packet.readCp1252String(-1));
            return true;
          }
          if (14 == opcode) {
            OpacityWidget.finishScreenTransition((byte) -116);
            LobbySetupHelpers.initializeLobby(LevelPack.getGamePlayerListContent(obfuscationGuard ^ -71), (byte) 86, ValidationStatus.field_h, LevelPackLoader.getLobbyPlayerListContent(0), 150, VerticalScrollbar.roundUpPowerOfTwo(2000, (byte) -54), TextChoiceDialogHitTest.getLobbyCaptionContent(1345), VerticalScrollbar.roundUpPowerOfTwo(8, (byte) -53), 1024, DropTargetWidget.field_I.length);
            GameTransportHelpers.bindSocialListEntries(FramedMenuScreen.getIgnoreListContent(115), QuickChatHelpDialog.getFriendsListContent(obfuscationGuard - 45), obfuscationGuard ^ 12);
            RadialSelectorWidget.field_L = false;
            MonotonicTime.field_c = true;
            ScreenNavigationHelpers.requestScreen(false, 113, -2);
            return true;
          }
          if (opcode == 15) {
            if (MonotonicTime.field_c) {
              WhirlpoolHasher.closeTransientPopups(7);
              BirthDateValidator.clearChatHistory((byte) -56);
              ScreenNavigationHelpers.requestScreen(false, obfuscationGuard + 43, 0);
              MonotonicTime.field_c = false;
              NewAchievementsScreen.discardGameplayOnTransition = true;
              HalloweenBackground.field_y = true;
            }
            IntegerBitLengthHelpers.field_d = false;
            RadialSelectorRenderer.field_p = false;
            RadialSelectorWidget.field_L = false;
            return true;
          }
          if (opcode == 10 &&
            MonotonicTime.field_c) {
            ChatLobbyUiHelpers.handleLobbyResponse((byte) 33);
            return true;
          }
          if (opcode == 72) {
            var35 = Ball.createAchievementMask(8);
            var27 = var35;
            var4 = var27;
            var18 = var4;
            var5_array = var18;
            var25 = packet;
            var7 = ((PacketBuffer) ((Object) var25)).readUnsignedByte(255);
            for (var8_int = 0; var7 > var8_int; var8_int++) {
              var18[var8_int] = ((PacketBuffer) ((Object) var25)).readInt(255);
            }
            var34 = var4;
            var26 = var34;
            var19 = var26;
            var5_arrayLifetime1 = var19;
            var46 = SecondaryHashTable.earnedAchievementMask;
            for (var7 = 0; var7 < 8; var7++) {
              var19[var7] = IntrusiveHashIterator.bitwiseAnd(var34[var7], ~var46[var7]);
            }
            if (ResourceRequest.field_y) {
              var5_int = InputOptionsHelpers.findLastNonZeroIndex(true, var35);
              for (var6 = 0; var6 <= var5_int; var6++) {
                if (DirectByteStorage.isBitSet(var35, var6, (byte) -75)) {
                  LevelResultWireHelpers.achievementNotifications.addLast(new IntNode(var6), (byte) 3);
                }
              }
            }
            var36 = SecondaryHashTable.earnedAchievementMask;
            var28 = var36;
            var21 = var28;
            var5_arrayLifetime2 = var21;
            var47 = var4;
            for (var7 = 0; var7 < 8; var7++) {
              var21[var7] = LevelSelectScreen.bitwiseOr(var36[var7], var47[var7]);
            }
            var37 = SpriteInputHelpers.pendingAchievementMask;
            var29 = var37;
            var23 = var29;
            var5_arrayLifetime3 = var23;
            var48 = var4;
            for (var7 = 0; var7 < 8; var7++) {
              var23[var7] = LevelSelectScreen.bitwiseOr(var37[var7], var48[var7]);
            }
            return true;
          }
          if (IntrusiveHashTable.currentPacketOpcode != 64 &&
            65 != IntrusiveHashTable.currentPacketOpcode) {
            if (79 == IntrusiveHashTable.currentPacketOpcode) {
              if (IntArrayRequest.gameplayScreen == null) {
                return true;
              }
              if (IntArrayRequest.gameplayScreen.snapshotsReady) {
                AlignedIconLabel.reportClientError("T3", (Throwable) null, 44);
              } else {
                fieldTemp$0 = IntArrayRequest.gameplayScreen.loadedBoardSnapshots;
                IntArrayRequest.gameplayScreen.loadedBoardSnapshots = IntArrayRequest.gameplayScreen.loadedBoardSnapshots + 1;
                IntArrayRequest.gameplayScreen.match.playerBoards[fieldTemp$0].readBoardSnapshot(false, packet, IntArrayRequest.gameplayScreen.match.playerCount);
                stackIn_74_0 = IntArrayRequest.gameplayScreen;
                stackIn_75_1 = (IntArrayRequest.gameplayScreen.loadedBoardSnapshots == IntArrayRequest.gameplayScreen.match.playerCount);
                stackIn_74_0.snapshotsReady = stackIn_75_1;
                if (IntArrayRequest.gameplayScreen.snapshotsReady) {
                  if (IntArrayRequest.gameplayScreen.isSpectator(103)) {
                    return true;
                  }
                  IntArrayRequest.gameplayScreen.match.playerBoards[IntArrayRequest.gameplayScreen.localPlayerId].receivedInputTick = IntArrayRequest.gameplayScreen.match.playerBoards[IntArrayRequest.gameplayScreen.localPlayerId].simulationTick - 50;
                }
              }
              return true;
            }
            if (66 == IntrusiveHashTable.currentPacketOpcode) {
              if (IntArrayRequest.gameplayScreen != null) {
                OpacityWidget.finishScreenTransition((byte) -123);
                if (!IntArrayRequest.gameplayScreen.isSpectator(123)) {
                  IntArrayRequest.gameplayScreen.finishOfflineMatch((byte) 40, false);
                }
                IntArrayRequest.gameplayScreen.showPostMatchScreen(false, (byte) 69);
                NewAchievementsScreen.discardGameplayOnTransition = true;
                RadialSelectorRenderer.field_p = true;
                Brick.unreadChatMessageCount = 0;
                ScreenNavigationHelpers.requestScreen(false, 125, -2);
              }
              IntegerBitLengthHelpers.field_d = false;
              return true;
            }
            boolean decompiledFrameRemainder0 = true;
            if (null != IntArrayRequest.gameplayScreen) {
              if (76 == IntrusiveHashTable.currentPacketOpcode) {
                IntArrayRequest.gameplayScreen.readScheduledPowerUp(packet, (byte) 74);
                return true;
              }
              if (73 != IntrusiveHashTable.currentPacketOpcode &&
                IntrusiveHashTable.currentPacketOpcode != 74) {
                if (IntrusiveHashTable.currentPacketOpcode == 75) {
                  IntArrayRequest.gameplayScreen.readPositionCorrection((byte) 33, packet);
                  return true;
                }
                if (77 == IntrusiveHashTable.currentPacketOpcode) {
                  IntArrayRequest.gameplayScreen.readMaskedPlayerResult(packet, false, 87);
                  return true;
                }
                if (IntrusiveHashTable.currentPacketOpcode == 78) {
                  IntArrayRequest.gameplayScreen.readMaskedPlayerResult(packet, true, 118);
                  return true;
                }
                if (IntrusiveHashTable.currentPacketOpcode == 67) {
                  IntArrayRequest.gameplayScreen.readResultOrder(packet, obfuscationGuard - 47);
                  return true;
                }
                if (IntrusiveHashTable.currentPacketOpcode == 69) {
                  IntArrayRequest.gameplayScreen.readMaskOnePlayerResult(18504, packet);
                  return true;
                }
                if (IntrusiveHashTable.currentPacketOpcode == 70) {
                  IntArrayRequest.gameplayScreen.match.rematchOfferPlayerMask = packet.readUnsignedByte(255);
                  if (IntArrayRequest.gameplayScreen != null) {
                    Mesh3D.updateRematchCaption(1);
                  }
                  return true;
                }
                decompiledFrameRemainder0 = (IntrusiveHashTable.currentPacketOpcode == 71);
                if (decompiledFrameRemainder0) {
                  IntArrayRequest.gameplayScreen.rematchSetupPlayerMask = packet.readUnsignedByte(255);
                  if (IntArrayRequest.gameplayScreen != null) {
                    Mesh3D.updateRematchCaption(1);
                  }
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_99_0 = IntArrayRequest.gameplayScreen;
                stackIn_99_1 = -15;
                stackIn_99_2 = (BitPacketBuffer) (packet);
                stackIn_100_3 = (IntrusiveHashTable.currentPacketOpcode == 74);
                ((GameplayScreen) (Object) stackIn_99_0).readInputBatch((byte) stackIn_99_1, stackIn_99_2, stackIn_100_3);
                return true;
              }
            }
            if (obfuscationGuard == 47) {
              return false;
            }
            return true;
          }
          OpacityWidget.finishScreenTransition((byte) -125);
          stackIn_44_0 = (packet.readUnsignedByte(255) == 0) ? 0 : 1;
          resultWordFlag = stackIn_44_0;
          playerNames = new String[packet.readUnsignedByte(255)];
          playerNameStorage = playerNames;
          localPlayerId = packet.readByte(true);
          for (var7 = 0; playerNames.length > var7; var7++) {
            playerNameStorage[var7] = packet.readPrefixedCp1252String(255);
          }
          if (localPlayerId < 0) {
            localPlayerId = -2;
          }
          var7 = packet.readInt(obfuscationGuard ^ 208);
          matchRandom = new IsaacGenerator(new int[]{var7});
          randomSeeds = new int[playerNames.length];
          randomSeedStorage = randomSeeds;
          seedWords = randomSeedStorage;
          for (var10 = 0; var10 < playerNames.length; var10++) {
            seedWords[var10] = matchRandom.nextInt(105);
          }
          levelOrder = IndexedSpriteHelpers.createIndexOrder(false, MeshAudioHelpers.field_d.levelCount, matchRandom);
          repeatMode = packet.readByte(true);
          configuration = new LevelSequence(MeshAudioHelpers.field_d, levelOrder, repeatMode);
          backgroundSelector = matchRandom.nextBoundedInt(-37880252, 11);
          TabbedPane.currentBackground = GamePresentationHelpers.selectBackground(backgroundSelector, (byte) 19);
          characterOrder = LobbyPlayer.createCharacterOrder(matchRandom, false);
          VerticalScrollbar.field_Ub = null;
          if (0 <= localPlayerId) {
            stackIn_56_0 = 1 << localPlayerId;
          } else {
            stackIn_56_0 = 0;
          }
          localPlayerMask = stackIn_56_0;
          IntArrayRequest.gameplayScreen = new GameplayScreen(true, resultWordFlag != 0, playerNames, localPlayerId, localPlayerMask, configuration, randomSeeds, characterOrder);
          stackIn_58_0 = IntArrayRequest.gameplayScreen;
          stackIn_59_1 = (packet.readUnsignedByte(255) == 0);
          stackIn_58_0.snapshotsReady = stackIn_59_1;
          if (!IntArrayRequest.gameplayScreen.snapshotsReady) {
            IntArrayRequest.gameplayScreen.loadedBoardSnapshots = 0;
          }
          if (IntrusiveHashTable.currentPacketOpcode == 64) {
            AchievementIcon.updateDrawCaption((byte) 32);
            Mesh3D.updateRematchCaption(obfuscationGuard ^ 46);
          }
          IntegerBitLengthHelpers.field_d = false;
          TextFieldRenderer.field_A = false;
          RadialSelectorRenderer.field_p = false;
          ScreenNavigationHelpers.requestScreen(false, obfuscationGuard ^ 105, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_137_0 = failure;
          stackIn_137_1 = new StringBuilder().append("BrickABrac.K(");
          if (packet == null) {
            stackIn_138_2 = "null";
          } else {
            stackIn_138_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_137_0), ((StringBuilder) (Object) stackIn_137_1).append(stackIn_138_2).append(',').append(obfuscationGuard).append(',').append(opcode).append(')').toString());
        }
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        field_G = null;
        field_H = null;
        if (obfuscationGuard != -65) {
          BrickABrac.clearSharedReferences(10);
        }
        fullscreenDialogRowButtons = null;
        backgroundSoundEffectArchive = null;
        gamePlayerIndex = null;
    }

    final void applyPendingNavigation(int param0) {
        int var3;
        var3 = field_J ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        if (AccountMessageDialog.currentScreen.screenId == 9 &&
          !WidgetGroup.containsNonzeroInFirstEight(SpriteInputHelpers.pendingAchievementMask, -1)) {
          ScreenNavigationHelpers.requestScreen(false, 69, 5);
        } else {
          if (CacheEntry.field_z != 2147483647) {
            if (CacheEntry.field_z != -2) {
              ScreenNavigationHelpers.requestScreen(false, param0 + 55, CacheEntry.field_z);
            } else {
              MatchingTextValidator.requestEnterLobby(true);
            }
          }
        }
        AccountRegistrationPanel.refreshMenuScreens((byte) -64);
    }

    public BrickABrac() {
        CacheEntry.field_C = this;
    }

    final void onConnectionResult(int param0, int param1) {
        int var4;
        var4 = field_J ? 1 : 0;
        if (param1 != param0) {
          if (MonotonicTime.field_c) {
            HalloweenBackground.field_y = true;
            NewAchievementsScreen.discardGameplayOnTransition = true;
            if (IntArrayRequest.gameplayScreen != null &&
              !IntArrayRequest.gameplayScreen.isSpectator(param1 + 94)) {
              IndexedSpriteHelpers.setMessageText(true, EmailValidator.field_k);
              ScreenNavigationHelpers.requestScreen(false, param1 ^ 118, 11);
            } else {
              ScreenNavigationHelpers.requestScreen(false, 120, 0);
            }
            if (AccountMessageDialog.currentScreen instanceof MenuScreen) {
              ((MenuScreen) (AccountMessageDialog.currentScreen)).onEnter(false, 0, param1 + 116);
            }
            MonotonicTime.field_c = false;
          }
          RadialSelectorWidget.field_L = false;
          IntegerBitLengthHelpers.field_d = false;
        } else {
          IntegerBitLengthHelpers.field_d = true;
          RadialSelectorWidget.field_L = true;
        }
    }

    public final void init() {
        this.initializeApplet("brickabrac", 15, 1686);
    }

    final void stopClientServices(boolean obfuscationGuard) {
        LobbyCaptionGlobals.shutdownAudio(18);
        if (obfuscationGuard) {
          field_G = (String) null;
        }
        QuickChatMenu.shutdownClient((byte) 107);
    }

    public final boolean handleGameKey(int keyCode, char character, int obfuscationGuard) {
        if (PauseMenuHelpers.isLoginPrivilegeAtLeastTwo((byte) 62)) {
          if (keyCode == 5) {
            GzipInflater.showRenderRateDiagnostic = !GzipInflater.showRenderRateDiagnostic ? true : false;
            return true;
          }
          if (6 == keyCode) {
            RadialSelectorRenderer.showHeapDiagnostic = !RadialSelectorRenderer.showHeapDiagnostic ? true : false;
            return true;
          }
          if (keyCode == 7) {
            return true;
          }
        }
        if (obfuscationGuard > -58) {
          this.onConnectionResult(78, 8);
        }
        if (null != InvitationDialogHelpers.pendingScreen) {
          return false;
        }
        return null != AccountMessageDialog.currentScreen ? AccountMessageDialog.currentScreen.handleKey(character, 106, keyCode) : false;
    }

    final static int cosine8192(int obfuscationGuard, int angle) {
        angle = angle & 8191;
        if (obfuscationGuard != 2048) {
          BrickABrac.clearSharedReferences(116);
        }
        if (angle >= 4096) {
          return angle < 6144 ? -TextWidgetRenderer.quarterSineQ16[6144 - angle] : TextWidgetRenderer.quarterSineQ16[angle - 6144];
        }
        return 2048 > angle ? TextWidgetRenderer.quarterSineQ16[-angle + 2048] : -TextWidgetRenderer.quarterSineQ16[-2048 + angle];
    }

    final void clearClientResources(boolean obfuscationGuard) {
        BrickABrac.clearSharedReferences(-65);
        InputOptionsHelpers.clearSharedReferences((byte) -42);
        MouseInputCleanup.clearSharedReferences(true);
        BackgroundRegistry.clearSharedReferences(0);
        LevelSequence.clearSharedReferences((byte) 70);
        MenuScreen.clearSharedReferences(-107);
        MessageScreen.clearSharedReferences((byte) 88);
        LevelSelectScreen.clearSharedReferences((byte) -115);
        MatchResultScreen.clearSharedReferences(-25617);
        RasterEffectHelpers.clearSharedReferences((byte) -75);
        ClientException.clearSharedReferences(false);
        KeyboardInput.clearSharedReferences((byte) -42);
        IntNode.clearSharedReferences((byte) -115);
        NodeDeque.clearSharedReferences((byte) 100);
        IsaacGenerator.clearSharedReferences(2);
        RasterStackHelpers.clearSharedReferences(81);
        MonotonicTime.clearSharedReferences((byte) -114);
        BitPacketBuffer.clearStaticReferences(60);
        CanvasInputHelpers.clearSharedReferences(!obfuscationGuard ? true : false);
        LobbyUiHelpers.clearSharedReferences(120);
        GameConnectionShell.clearSharedReferences(-113);
        AppletFlowHelpers.clearSharedReferences((byte) 121);
        TextChoiceDialogHitTest.clearSharedReferences(-789103103);
        ChatLobbyUiHelpers.clearSharedReferences(11);
        TextValidationHelpers.clearSharedReferences(0);
        WhirlpoolDigestHelpers.clearSharedReferences(0);
        HalfRgbBlendHelpers.clearSharedReferences(100);
        SocialListResponseHelpers.clearSharedReferences(20623);
        AccountDateHelpers.clearSharedReferences((byte) 108);
        TextChoiceDialogStyles.clearSharedReferences(-21727);
        SocialTabbedPanel.clearSharedReferences(true);
        LobbySetupHelpers.clearSharedReferences(8);
        Rasterizer2D.clearStaticReferences();
        UiCleanupHelpers.clearSharedReferences(-128);
        OutgoingPacketHelpers.clearSharedReferences(obfuscationGuard);
        ParallaxMusicHelpers.clearSharedReferences(78);
        AppletGameShell.clearSharedReferences(19254);
        CappedUrlRequest.clearSharedReferences(-16637);
        MouseInput.clearSharedReferences((byte) 24);
        MouseWheelSource.clearSharedReferences(102);
        ResourceArchive.clearSharedReferences(false);
        CanvasInputCleanup.clearSharedReferences(-11470);
        FontSceneGlobals.clearSharedReferences(108);
        PacketBuffer.clearStaticStrings(0);
        FriendListUi.clearSharedReferences((byte) -41);
        GameTransportActions.clearSharedReferences(13);
        GamePresentationHelpers.clearSharedReferences((byte) 46);
        GameOverlayHelpers.clearSharedReferences(117);
        ChatMessage.clearSharedReferences(0);
        BackgroundSurfaceHelpers.clearSharedReferences(obfuscationGuard);
        HorizontalFrameHelpers.clearSharedReferences((byte) 15);
        GameClock.clearSharedReferences((byte) 66);
        SoftwareFramebuffer.clearSharedReferences(-125);
        ResourcePreparationQueue.clearSharedReferences(4862);
        GameCanvas.clearSharedReferences(0);
        CanvasResizeController.clearSharedReferences(0);
        ScreenNavigationHelpers.clearSharedReferences((byte) -49);
        GameScreen.clearSharedReferences((byte) -91);
        BlankScreen.clearSharedReferences(-2);
        GameplayScreen.clearSharedReferences(81);
        Brick.clearSharedReferences(4641);
        IntrusiveNode.clearSharedReferences(true);
        SpriteGeometry.clearSharedReferences(2);
        DualLinkNode.clearSharedReferences(-2);
        CalendarRankingHelpers.clearSharedReferences(!obfuscationGuard ? true : false);
        MidiSynthesizer.clearSharedReferences(-1);
        SoundCache.clearSharedReferences((byte) -117);
        RectangleBody.clearSharedReferences((byte) -106);
        MovingBody.clearSharedReferences(34);
        CircleBody.clearSharedReferences((byte) 97);
        PlayerBoard.clearSharedReferences(-2947);
        MotionWaypoint.clearSharedReferences(-116);
        BrickMotionPath.clearSharedReferences(true);
        GameUiController.clearSharedReferences(false);
        PauseMenuHelpers.clearSharedReferences(-12251);
        MenuButton.clearSharedReferences((byte) -32);
        IntegerPowerHelpers.clearSharedReferences(true);
        IndexedSpriteHelpers.clearSharedReferences(0);
        ScreenshotViewer.clearSharedReferences((byte) 102);
        TextHuffmanHelpers.clearSharedReferences(24311);
        FullscreenDialogHelpers.clearSharedReferences(true);
        HuffmanCodec.clearSharedReferences((byte) -94);
        ModalOverlayHelpers.clearSharedReferences(true);
        IntegerParsingHelpers.clearSharedReferences((byte) -11);
        IncomingPacketHelpers.clearSharedReferences(-106);
        MenuSelection.clearSharedReferences((byte) -60);
        IntegerBitLengthHelpers.clearSharedReferences(-104);
        BackgroundScene.clearSharedReferences((byte) 7);
        BrickHitTransitionTable.clearTransitionCodes((byte) -116);
        BufferedFile.clearSharedReferences(-54);
        MeshLobbyUiHelpers.clearSharedReferences(-61);
        ConditionalTextValue.clearSharedReferences(2);
        TableResponseHelpers.clearSharedReferences(1);
        InvitationDialogHelpers.clearSharedReferences(12);
        LoginCredentialKind.clearSharedReferences((byte) 65);
        LoginCredentials.clearSharedReferences((byte) 114);
        BufferedSocket.clearSharedReferences(119);
        ReflectionCheckHelpers.clearSharedReferences(-8495);
        ArchiveConnectionHelpers.clearSharedReferences(30000);
        LobbyRenderGlobals.clearSharedReferences(-29988);
        StateIconLabel.clearSharedReferences(true);
        VerticalScrollbar.clearSharedReferences((byte) 33);
        UiComponentNode.clearSharedReferences((byte) -115);
        UiComponent.clearSharedReferences((byte) 88);
        ContextMenu.clearSharedReferences(21);
        ScrollPaneWithFooter.clearSharedReferences(-48);
        ContextActionController.clearSharedReferences(0);
        ReportAbuseDialog.clearSharedReferences(8421504);
        LobbyPlayer.clearSharedReferences(-56);
        LobbyGame.clearSharedReferences((byte) -32);
        SecondaryHashTable.clearSharedReferences((byte) 85);
        QuickChatPopupHelpers.clearSharedReferences(46);
        GameTransportHelpers.clearSharedReferences(122);
        GameplayAudioEvent.clearSharedReferences(0);
        Ball.clearSharedReferences(122);
        BubbleDistortion.clearSharedReferences(124);
        BallPulseEffect.clearSharedReferences(95);
        Paddle.clearSharedReferences(-77);
        PowerUp.clearSharedReferences(6);
        PowerUpWarning.clearSharedReferences(false);
        ScorePopup.clearSharedReferences((byte) -73);
        MultiplayerMatch.clearSharedReferences(-19537);
        PlayerInputBatch.clearSharedReferences(false);
        PacketReceiveHelpers.clearSharedReferences(true);
        TextFont.clearTextScratchBuffers();
        GameConnectionHelpers.clearSharedReferences((byte) 98);
        ObjectHistoryBuffer.clearSharedReferences(81);
        JavaRandomHelpers.clearSharedReferences(118);
        LobbyInputHelpers.clearSharedReferences(false);
        LobbyOverlayHelpers.clearSharedReferences(0);
        AlignedIconLabel.clearSharedReferences((byte) 21);
        CanvasViewGlobals.clearSharedReferences(2);
        TabbedPane.clearSharedReferences(47);
        NameEntryPopup.clearSharedReferences(false);
        BrickGameLayerController.clearSharedReferences((byte) -102);
        PlayerBadgeHelpers.clearSharedReferences(false);
        ClientResourceHelpers.clearSharedReferences(31583);
        ClientViewHelpers.clearSharedReferences(-116);
        BirthDateEntryPanel.clearSharedReferences(false);
        CalendarMatchmakingState.clearSharedReferences(121);
        IndexedSpriteGeometry.clearSharedReferences(31797);
        ArcticBackground.clearSharedReferences((byte) -31);
        ChocolateBackground.clearSharedReferences((byte) -61);
        ConstructionBackground.clearSharedReferences(94);
        IntegerRemainderHelpers.clearSharedReferences((byte) -121);
        DesertBackground.clearSharedReferences(-417029247);
        JungleBackground.clearSharedReferences(false);
        ParisBackground.clearSharedReferences(0);
        SpaceBackground.clearSharedReferences((byte) 21);
        VolcanicBackground.clearSharedReferences(0);
        UnderwaterBackground.clearSharedReferences((byte) -46);
        HalloweenBackground.clearSharedReferences(1);
        FarmBackground.clearSharedReferences(0);
        NinjaBackground.clearSharedReferences((byte) -119);
        PcmPlayer.clearServiceReference();
        MusicCrossfadeStream.clearSharedReferences(-52);
        ArchiveIndex.clearSharedReferences((byte) 117);
        GzipInflater.clearSharedReferences(-32);
        ArchiveSource.clearSharedReferences((byte) -59);
        MainMenuScreen.clearSharedReferences(!obfuscationGuard ? true : false);
        FramedMenuScreen.clearSharedReferences((byte) -101);
        HighscoresScreen.clearSharedReferences(-5);
        RankingsScreen.clearSharedReferences(-118);
        InstructionsScreen.clearSharedReferences((byte) 121);
        AchievementBrowserScreen.clearSharedReferences((byte) -106);
        QuickChatSineHelpers.clearSharedReferences(8070);
        SaveResultsPromptScreen.clearSharedReferences(550);
        MembershipBenefitsScreen.clearSharedReferences(2);
        LevelPackSelectScreen.clearSharedReferences(14529);
        TimedSplashScreen.clearSharedReferences(0);
        NineSliceFrame.clearSharedReferences(0);
        WidgetLayerBootstrap.clearSharedReferences(true);
        BoundedFile.clearSharedReferences(57);
        LegacyUtf8Decoder.clearStaticReferences((byte) 124);
        WidgetLayerStack.clearSharedReferences((byte) -113);
        LoadingProgressDialog.clearSharedReferences(-48);
        AccountContentTransitionLayer.clearSharedReferences(28);
        AccountMessageDialog.clearSharedReferences(50);
        AccountRegistrationPanel.clearSharedReferences(-11310);
        AccountIntroductionPanel.clearSharedReferences((byte) 36);
        LoginPanel.clearSharedReferences((byte) 88);
        PlayerNameChooserPanel.clearSharedReferences(-106);
        WidgetTheme.clearSharedReferences(-31063);
        GameplayRenderHelpers.clearSharedReferences(2);
        PasswordTooltipHelpers.clearSharedReferences(!obfuscationGuard ? true : false);
        FullscreenFailureDialog.clearSharedReferences(obfuscationGuard);
        LevelResultWireHelpers.clearSharedReferences(-68);
        ArchiveFetchClient.clearSharedReferences(-12200);
        CacheIoWorker.clearSharedReferences(26679);
        ArchiveSourceManager.clearSharedReferences(-70);
        TextWidgetRenderer.clearSharedReferences(31292);
        MeshRasterState.releaseTables();
        VorbisSample.releaseScratch();
        MeshAttributeRecord.clearSharedReferences(-9669);
        Mesh3D.clearSharedReferences((byte) -52);
        IntegerValidationHelpers.clearSharedReferences(125);
        LobbyKeyboardGlobals.clearSharedReferences((byte) 68);
        TableQuickChatHelpers.clearSharedReferences(-27956);
        LevelPackLoader.clearSharedReferences(-30593);
        FontRequestHelpers.clearSharedReferences(-41);
        AppletResourceHelpers.clearSharedReferences((byte) 66);
        QuickChatMenu.clearSharedReferences(true);
        QuickChatCategoryRegistry.clearSharedReferences((byte) -19);
        QuickChatPhraseRegistry.clearSharedReferences(64);
        QuickChatCategoryDefinition.clearSharedReferences((byte) 90);
        BirthDateValidator.clearSharedReferences((byte) -93);
        DateFieldsWidget.clearSharedReferences((byte) 84);
        ArrayWidgetGroup.clearSharedReferences(false);
        FocusableWidget.clearSharedReferences(-66);
        Widget.clearSharedReferences(-14711);
        WidgetTextLayout.clearSharedReferences(obfuscationGuard);
        QuickChatHelpDialog.clearSharedReferences((byte) 98);
        LogoRenderHelpers.clearSharedReferences(31186);
        PopupWidgetLayer.clearSharedReferences(111);
        WidgetLayer.clearSharedReferences((byte) -17);
        WidgetGroup.clearSharedReferences((byte) -67);
        NodeDequeCursor.clearSharedReferences(117);
        SingleChildWidget.clearSharedReferences((byte) -102);
        BrowserResizeNotificationHelpers.clearSharedReferences((byte) -120);
        SpriteInputHelpers.clearSharedReferences(0);
        DelegatingCanvas.clearSharedReferences(!obfuscationGuard ? true : false);
        RankingSocketHelpers.clearSharedReferences((byte) 121);
        IntKeyIndex.clearSharedReferences(true);
        ByteStorage.clearSharedReferences(10);
        Bzip2Decoder.releaseSharedState();
        Bzip2State.clearSharedReferences((byte) -102);
        ReflectionCheck.clearSharedReferences(6);
        ByteArrayPoolHelpers.clearSharedReferences(!obfuscationGuard ? true : false);
        LobbyCaptionGlobals.clearSharedReferences(-18657);
        LabeledToggleRenderer.clearSharedReferences(1);
        StatefulWidgetRenderer.clearSharedReferences(3);
        RadialSelectorRenderer.clearSharedReferences(0);
        MultiValueSliderRenderer.clearSharedReferences(-51);
        GameplaySpriteHelpers.clearSharedReferences((byte) 118);
        VorbisFloor1.releaseScratch();
        AppletSettingsUiHelpers.clearSharedReferences(1516);
        QuickChatPhraseDefinition.clearSharedReferences(32463);
        WeightedLruCache.clearSharedReferences(-125);
        IntrusiveHashTable.clearSharedReferences(120);
        MusicVoice.clearSharedReferences((byte) 67);
        MidiFileReader.clearSharedReferences();
        MusicVoiceMixer.clearSharedReferences(2143);
        SocketConnector.clearSharedReferences(-9125);
        ProxyAuthenticationRequiredException.clearSharedReferences(10);
        NanoGameClock.clearSharedReferences((byte) -124);
        ProducerFramebuffer.clearSharedReferences(11);
        LobbyLoginGlobals.clearSharedReferences((byte) -118);
        DisplayModeInfo.clearSharedReferences((byte) 19);
        IntHistoryBuffer.clearSharedReferences(67108864);
        DialogPointerGlobals.clearSharedReferences(-15504);
        UiGeometryHelpers.clearSharedReferences((byte) -123);
        ByteArrayNode.clearSharedReferences(84);
        MusicPatch.clearSharedReferences((byte) 118);
        MusicEnvelope.clearSharedReferences((byte) 31);
        SoundTone.releaseScratch();
        GameRenderAudioHelpers.clearSharedReferences((byte) -116);
        GameSettingConstraintHelpers.clearSharedReferences(-1);
        LabeledWidget.clearSharedReferences(false);
        ValidatedTextFieldWidget.clearSharedReferences(-16124);
        TextFieldWidget.clearSharedReferences(80);
        ContentTransitionLayer.clearSharedReferences(98);
        ActivityIndicatorWidget.clearSharedReferences((byte) 123);
        UsernameSuggestionPanel.clearSharedReferences((byte) -83);
        HotspotTextWidget.clearSharedReferences(-2);
        ValidationIconWidget.clearSharedReferences(2);
        ValidationMessageWidget.clearSharedReferences((byte) -42);
        ToggleButtonWidget.clearSharedReferences(8192);
        TextFieldValidator.clearSharedReferences((byte) -109);
        ResourceArchiveFactory.clearSharedReferences(-7393);
        Under13RegistrationNoticePanel.clearSharedReferences(12127);
        KeyDispatchHelpers.clearSharedReferences((byte) 85);
        LevelDecoder.clearSharedReferences((byte) 89);
        ArchiveNetworkClient.clearSharedReferences((byte) -128);
        SecondaryNodeQueue.clearSharedReferences(true);
        ArchiveNetworkRequest.clearSharedReferences((byte) 102);
        FileCacheStore.clearSharedReferences((byte) 47);
        CacheIoRequest.clearSharedReferences(-122);
        CachedArchiveSource.clearSharedReferences((byte) 56);
        ResourceRequest.clearSharedReferences((byte) 78);
        DateInputWidget.clearSharedReferences(0);
        WhirlpoolHasher.clearSharedReferences(-1);
        RadialSelectorWidget.clearSharedReferences(110);
        MultiValueSliderWidget.clearSharedReferences(18724);
        RichTextLayout.clearSharedReferences((byte) -51);
        IterableIntrusiveHashTable.clearSharedReferences(24968);
        DualLinkDeque.clearSharedReferences(2);
        CacheEntry.clearSharedReferences(31434);
        DraggableWidget.clearSharedReferences(1);
        DropTargetWidget.clearSharedReferences((byte) -116);
        DirectByteStorage.clearSharedReferences(7301);
        GrowableIntList.clearSharedReferences(true);
        QuickChatParameterType.clearSharedReferences(125);
        StrongCacheEntry.clearSharedReferences(928072);
        ProxySocketConnector.clearSharedReferences((byte) -54);
        AudioFilter.releaseScratch();
        BoardPresentationHelpers.clearSharedReferences(2);
        IntrusiveHashIterator.clearSharedReferences(-93);
        DualLinkIterator.clearSharedReferences((byte) 84);
        LevelMetadata.clearSharedReferences((byte) 127);
        LevelPack.clearSharedReferences(0);
        LevelList.clearSharedReferences(true);
        MatchCompleteScreen.clearSharedReferences((byte) -112);
        MultiplayerExitScreen.clearSharedReferences(61);
        EmailAvailabilityRequest.clearSharedReferences(0);
        ConnectionPhase.clearSharedReferences(-2);
        DelayedPacket.clearSharedReferences(-128);
        IntArrayRequest.clearSharedReferences(112);
        LevelResultSubmission.clearSharedReferences(-17432);
        SocialListEntry.clearSharedReferences(-115);
        TableDataRequest.clearSharedReferences(136);
        TableRowSubmission.clearSharedReferences(-241);
        TableNameEntry.clearSharedReferences((byte) -105);
        RankingsRequest.clearSharedReferences((byte) -105);
        ButtonWidgetRenderer.clearSharedReferences((byte) -93);
        LinkWidgetRenderer.clearSharedReferences(false);
        TextFieldRenderer.clearSharedReferences((byte) 91);
        PasswordFieldRenderer.clearSharedReferences(-95);
        CheckboxWidgetRenderer.clearSharedReferences(true);
        OpacityWidget.clearSharedReferences(51550);
        SoundPlayback.clearSharedReferences((byte) 49);
        ResourcePreparationEntry.clearSharedReferences(-81);
        AchievementMaskRequest.clearSharedReferences(28391);
        AchievementSubmission.clearSharedReferences(105);
        TranslucentNineSliceFrame.clearSharedReferences(5);
        MeshAudioHelpers.clearSharedReferences(1024);
        AccountResponse.clearSharedReferences((byte) 83);
        IntArrayRequestHelpers.clearWaitingForLevelsText((byte) -102);
        FireworkBurst.clearSharedReferences(0);
        RasterCacheSurface.clearSharedReferences((byte) 121);
        LoginMethodPreference.clearSharedReferences(100);
        AlternateNumericLoginCredentials.clearSharedReferences((byte) -121);
        EmailLoginCredentials.clearSharedReferences(false);
        RasterSnapshot.clearSharedReferences(20888);
        DiagnosticTextLine.clearSharedReferences(30850);
        TooltipSprite.clearSharedReferences((byte) -77);
        OptionsScreen.clearSharedReferences(false);
        LevelCompleteScreen.clearSharedReferences(-257);
        PauseMenuScreen.clearSharedReferences((byte) -34);
        HighscorePackSelector.clearSharedReferences(false);
        AchievementIcon.clearSharedReferences(0);
        NewAchievementsScreen.clearSharedReferences(6);
        AchievementsScreen.clearSharedReferences((byte) -124);
        LevelPackCard.clearSharedReferences(32156);
        DialogMessagePanel.clearSharedReferences(0);
        FullscreenFailureKind.clearSharedReferences(6);
        BytePayloadSubmission.clearSharedReferences((byte) -46);
        ValidationStatus.clearSharedReferences(109);
        DebouncedValidationSource.clearSharedReferences(31366);
        TextLineLayout.clearSharedReferences((byte) 111);
        WidgetPaintStyle.clearSharedReferences(2);
        UsernameAvailabilityValidator.clearSharedReferences(-90);
        PasswordValidator.clearSharedReferences(true);
        EmailValidator.clearSharedReferences((byte) 124);
        EmailConfirmationValidator.clearSharedReferences(0);
        MatchingTextValidator.clearSharedReferences(-71);
        ContentTransitionPhase.clearSharedReferences(-81);
        TextHotspotRegion.clearSharedReferences((byte) -25);
        LegacyEmailValidationError.clearSharedReferences((byte) 38);
        this.host = null;
    }

    static {
        field_G = "Change display name";
        field_H = "<%0>: <%1>";
    }
}
