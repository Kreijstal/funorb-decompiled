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
        if (null != hd.pendingScreen) {
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
            hd.pendingScreen.drawScreen((byte) -85);
            PixelBlockEffect.pixelate(32 - (NodeDequeCursor.screenTransitionTick - 1), 256, 16769381, false, false);
          }
        } else {
          AccountMessageDialog.currentScreen.drawScreen((byte) -63);
        }
        notification = (IntNode) (kp.achievementNotifications.first(-123));
        if (obfuscationGuard != 16769381) {
          backgroundSoundEffectArchive = (ResourceArchive) null;
        }
        if (notification != null) {
          notificationTick = ok.achievementNotificationTick;
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
        if (cf.a((byte) 62)) {
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
        PacketReceiveHelpers.a(-127);
        MembershipBenefitsScreen.clientTick = MembershipBenefitsScreen.clientTick + 1;
        if (!QuickChatMenu.h(-26090)) {
          while (true) {
            var6 = (LevelResultSubmission) (IntNode.queuedLevelResults.removeFirst(3));
            if (var6 == null) {
              break;
            }
            PasswordValidator.submitLevelResult(var6, 5, (byte) -116);
          }
        }
        if (hd.pendingScreen != null) {
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
          if ((IntArrayRequest.gameplayScreen != hd.pendingScreen ||
            IntArrayRequest.gameplayScreen.networkedMatch) &&
            hd.pendingScreen != null) {
            hd.pendingScreen.advanceScreen(false, false, -82);
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
        if (null != kp.achievementNotifications.first(-8)) {
          fieldTemp$0 = ok.achievementNotificationTick + 1;
          ok.achievementNotificationTick = ok.achievementNotificationTick + 1;
          if (fieldTemp$0 == 335) {
            ok.achievementNotificationTick = 0;
            kp.achievementNotifications.removeFirst(3);
          }
        }
        if (ok.achievementNotificationTick == 50) {
          SoundCache.playUiSound(8, NineSliceFrame.uiSounds[9]);
        }
        if (cf.a((byte) 62)) {
          IntegerParsingHelpers.updateDiagnosticOverlay(false);
        }
        var4 = 46 / ((-61 - obfuscationGuard) / 47);
    }

    final void initializeClient(boolean obfuscationGuard) {
        this.a((byte) 39, 0, 2, obfuscationGuard, 1, 4, 14, 65);
        ButtonWidgetRenderer.field_w = new IsaacGenerator(new int[]{(int)MonotonicTime.nowMillis(false)});
        AppletFlowHelpers.field_c = new RgbSprite(640, 480);
        Widget.a(AccountMessageDialog.field_ub, (byte) 60, CacheIoRequest.windowCanvas);
        this.registerUiLifecycle(3160, new GameUiController());
        ReportAbuseDialog.a(ch.incomingPacketLengths, 1);
    }

    final boolean q(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 73) {
          return false;
        }
        stackIn_8_0 = (MonotonicTime.field_c) || (RadialSelectorWidget.field_L) || (ed.field_d);
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
            kk.setMessageText(true, packet.readCp1252String(-1));
            return true;
          }
          if (14 == opcode) {
            OpacityWidget.finishScreenTransition((byte) -116);
            hm.initializeLobby(LevelPack.c(obfuscationGuard ^ -71), (byte) 86, ValidationStatus.field_h, LevelPackLoader.c(0), 150, VerticalScrollbar.roundUpPowerOfTwo(2000, (byte) -54), TextChoiceDialogHitTest.a(1345), VerticalScrollbar.roundUpPowerOfTwo(8, (byte) -53), 1024, DropTargetWidget.field_I.length);
            hn.a(FramedMenuScreen.f(115), QuickChatHelpDialog.h(obfuscationGuard - 45), obfuscationGuard ^ 12);
            RadialSelectorWidget.field_L = false;
            MonotonicTime.field_c = true;
            ScreenNavigationHelpers.requestScreen(false, 113, -2);
            return true;
          }
          if (opcode == 15) {
            if (MonotonicTime.field_c) {
              WhirlpoolHasher.a(7);
              BirthDateValidator.d((byte) -56);
              ScreenNavigationHelpers.requestScreen(false, obfuscationGuard + 43, 0);
              MonotonicTime.field_c = false;
              NewAchievementsScreen.discardGameplayOnTransition = true;
              HalloweenBackground.field_y = true;
            }
            ed.field_d = false;
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
              var19[var7] = IntrusiveHashIterator.a(var34[var7], ~var46[var7]);
            }
            if (ResourceRequest.field_y) {
              var5_int = ea.a(true, var35);
              for (var6 = 0; var6 <= var5_int; var6++) {
                if (DirectByteStorage.isBitSet(var35, var6, (byte) -75)) {
                  kp.achievementNotifications.addLast(new IntNode(var6), (byte) 3);
                }
              }
            }
            var36 = SecondaryHashTable.earnedAchievementMask;
            var28 = var36;
            var21 = var28;
            var5_arrayLifetime2 = var21;
            var47 = var4;
            for (var7 = 0; var7 < 8; var7++) {
              var21[var7] = LevelSelectScreen.d(var36[var7], var47[var7]);
            }
            var37 = SpriteInputHelpers.pendingAchievementMask;
            var29 = var37;
            var23 = var29;
            var5_arrayLifetime3 = var23;
            var48 = var4;
            for (var7 = 0; var7 < 8; var7++) {
              var23[var7] = LevelSelectScreen.d(var37[var7], var48[var7]);
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
                AlignedIconLabel.a("T3", (Throwable) null, 44);
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
              ed.field_d = false;
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
          levelOrder = kk.createIndexOrder(false, MeshAudioHelpers.field_d.levelCount, matchRandom);
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
          ed.field_d = false;
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

    public static void s(int param0) {
        field_G = null;
        field_H = null;
        if (param0 != -65) {
          BrickABrac.s(10);
        }
        fullscreenDialogRowButtons = null;
        backgroundSoundEffectArchive = null;
        gamePlayerIndex = null;
    }

    final void p(int param0) {
        int var3;
        var3 = field_J ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        if (AccountMessageDialog.currentScreen.screenId == 9 &&
          !WidgetGroup.a(SpriteInputHelpers.pendingAchievementMask, -1)) {
          ScreenNavigationHelpers.requestScreen(false, 69, 5);
        } else {
          if (CacheEntry.field_z != 2147483647) {
            if (CacheEntry.field_z != -2) {
              ScreenNavigationHelpers.requestScreen(false, param0 + 55, CacheEntry.field_z);
            } else {
              MatchingTextValidator.b(true);
            }
          }
        }
        AccountRegistrationPanel.h((byte) -64);
    }

    public BrickABrac() {
        CacheEntry.field_C = this;
    }

    final void b(int param0, int param1) {
        int var4;
        var4 = field_J ? 1 : 0;
        if (param1 != param0) {
          if (MonotonicTime.field_c) {
            HalloweenBackground.field_y = true;
            NewAchievementsScreen.discardGameplayOnTransition = true;
            if (IntArrayRequest.gameplayScreen != null &&
              !IntArrayRequest.gameplayScreen.isSpectator(param1 + 94)) {
              kk.setMessageText(true, EmailValidator.field_k);
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
          ed.field_d = false;
        } else {
          ed.field_d = true;
          RadialSelectorWidget.field_L = true;
        }
    }

    public final void init() {
        this.initializeApplet("brickabrac", 15, 1686);
    }

    final void stopClientServices(boolean obfuscationGuard) {
        rl.b(18);
        if (obfuscationGuard) {
          field_G = (String) null;
        }
        QuickChatMenu.d((byte) 107);
    }

    public final boolean handleGameKey(int keyCode, char character, int obfuscationGuard) {
        if (cf.a((byte) 62)) {
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
          this.b(78, 8);
        }
        if (null != hd.pendingScreen) {
          return false;
        }
        return null != AccountMessageDialog.currentScreen ? AccountMessageDialog.currentScreen.handleKey(character, 106, keyCode) : false;
    }

    final static int cosine8192(int obfuscationGuard, int angle) {
        angle = angle & 8191;
        if (obfuscationGuard != 2048) {
          BrickABrac.s(116);
        }
        if (angle >= 4096) {
          return angle < 6144 ? -TextWidgetRenderer.quarterSineQ16[6144 - angle] : TextWidgetRenderer.quarterSineQ16[angle - 6144];
        }
        return 2048 > angle ? TextWidgetRenderer.quarterSineQ16[-angle + 2048] : -TextWidgetRenderer.quarterSineQ16[-2048 + angle];
    }

    final void clearClientResources(boolean obfuscationGuard) {
        BrickABrac.s(-65);
        ea.a((byte) -42);
        MouseInputCleanup.a(true);
        BackgroundRegistry.a(0);
        LevelSequence.a((byte) 70);
        MenuScreen.b(-107);
        MessageScreen.f((byte) 88);
        LevelSelectScreen.f((byte) -115);
        MatchResultScreen.g(-25617);
        RasterEffectHelpers.a((byte) -75);
        ClientException.a(false);
        KeyboardInput.a((byte) -42);
        IntNode.a((byte) -115);
        NodeDeque.b((byte) 100);
        IsaacGenerator.a(2);
        sc.a(81);
        MonotonicTime.a((byte) -114);
        BitPacketBuffer.clearStaticReferences(60);
        CanvasInputHelpers.a(!obfuscationGuard ? true : false);
        LobbyUiHelpers.clearSharedReferences(120);
        GameConnectionShell.k(-113);
        AppletFlowHelpers.a((byte) 121);
        TextChoiceDialogHitTest.b(-789103103);
        ChatLobbyUiHelpers.a(11);
        pp.a(0);
        jd.a(0);
        wc.a(100);
        ch.a(20623);
        AccountDateHelpers.a((byte) 108);
        TextChoiceDialogStyles.a(-21727);
        SocialTabbedPanel.a(true);
        hm.a(8);
        Rasterizer2D.clearStaticReferences();
        UiCleanupHelpers.a(-128);
        OutgoingPacketHelpers.a(obfuscationGuard);
        ParallaxMusicHelpers.b(78);
        AppletGameShell.d(19254);
        CappedUrlRequest.b(-16637);
        MouseInput.a((byte) 24);
        MouseWheelSource.a(102);
        ResourceArchive.a(false);
        CanvasInputCleanup.a(-11470);
        wm.a(108);
        PacketBuffer.clearStaticStrings(0);
        FriendListUi.c((byte) -41);
        GameTransportActions.b(13);
        GamePresentationHelpers.a((byte) 46);
        GameOverlayHelpers.a(117);
        ChatMessage.a(0);
        kd.a(obfuscationGuard);
        HorizontalFrameHelpers.a((byte) 15);
        GameClock.a((byte) 66);
        SoftwareFramebuffer.a(-125);
        ResourcePreparationQueue.c(4862);
        GameCanvas.a(0);
        CanvasResizeController.b(0);
        ScreenNavigationHelpers.a((byte) -49);
        GameScreen.c((byte) -91);
        BlankScreen.a(-2);
        GameplayScreen.d(81);
        Brick.d(4641);
        IntrusiveNode.a(true);
        SpriteGeometry.f(2);
        DualLinkNode.a(-2);
        CalendarRankingHelpers.a(!obfuscationGuard ? true : false);
        MidiSynthesizer.c(-1);
        SoundCache.a((byte) -117);
        RectangleBody.d((byte) -106);
        MovingBody.a(34);
        CircleBody.d((byte) 97);
        PlayerBoard.d(-2947);
        MotionWaypoint.e(-116);
        BrickMotionPath.b(true);
        GameUiController.c(false);
        cf.a(-12251);
        MenuButton.a((byte) -32);
        hh.a(true);
        kk.a(0);
        ScreenshotViewer.d((byte) 102);
        rj.a(24311);
        FullscreenDialogHelpers.a(true);
        HuffmanCodec.a((byte) -94);
        jj.a(true);
        IntegerParsingHelpers.a((byte) -11);
        IncomingPacketHelpers.a(-106);
        MenuSelection.b((byte) -60);
        ed.a(-104);
        BackgroundScene.a((byte) 7);
        rb.a((byte) -116);
        BufferedFile.a(-54);
        MeshLobbyUiHelpers.a(-61);
        ConditionalTextValue.c(2);
        f.a(1);
        hd.a(12);
        LoginCredentialKind.a((byte) 65);
        LoginCredentials.a((byte) 114);
        BufferedSocket.b(119);
        we.a(-8495);
        sm.a(30000);
        fh.a(-29988);
        StateIconLabel.d(true);
        VerticalScrollbar.e((byte) 33);
        ba.a((byte) -115);
        UiComponent.c((byte) 88);
        ContextMenu.h(21);
        ScrollPaneWithFooter.h(-48);
        ContextActionController.a(0);
        ReportAbuseDialog.k(8421504);
        LobbyPlayer.h(-56);
        LobbyGame.d((byte) -32);
        SecondaryHashTable.c((byte) 85);
        QuickChatPopupHelpers.b(46);
        hn.a(122);
        GameplayAudioEvent.d(0);
        Ball.c(122);
        BubbleDistortion.c(124);
        BallPulseEffect.a(95);
        Paddle.e(-77);
        PowerUp.c(6);
        PowerUpWarning.b(false);
        ScorePopup.a((byte) -73);
        MultiplayerMatch.d(-19537);
        PlayerInputBatch.b(false);
        PacketReceiveHelpers.a(true);
        TextFont.clearTextScratchBuffers();
        GameConnectionHelpers.a((byte) 98);
        ObjectHistoryBuffer.a(81);
        aa.b(118);
        ic.a(false);
        ga.a(0);
        AlignedIconLabel.d((byte) 21);
        u.a(2);
        TabbedPane.h(47);
        NameEntryPopup.d(false);
        BrickGameLayerController.a((byte) -102);
        qp.a(false);
        ClientResourceHelpers.b(31583);
        ok.b(-116);
        BirthDateEntryPanel.d(false);
        CalendarMatchmakingState.a(121);
        IndexedSpriteGeometry.b(31797);
        ArcticBackground.d((byte) -31);
        ChocolateBackground.d((byte) -61);
        ConstructionBackground.f(94);
        er.a((byte) -121);
        DesertBackground.f(-417029247);
        JungleBackground.b(false);
        ParisBackground.f(0);
        SpaceBackground.d((byte) 21);
        VolcanicBackground.f(0);
        UnderwaterBackground.d((byte) -46);
        HalloweenBackground.f(1);
        FarmBackground.f(0);
        NinjaBackground.d((byte) -119);
        PcmPlayer.clearServiceReference();
        MusicCrossfadeStream.c(-52);
        ArchiveIndex.a((byte) 117);
        GzipInflater.a(-32);
        ArchiveSource.a((byte) -59);
        MainMenuScreen.c(!obfuscationGuard ? true : false);
        FramedMenuScreen.f((byte) -101);
        HighscoresScreen.f(-5);
        RankingsScreen.g(-118);
        InstructionsScreen.g((byte) 121);
        AchievementBrowserScreen.f((byte) -106);
        QuickChatSineHelpers.a(8070);
        SaveResultsPromptScreen.f(550);
        MembershipBenefitsScreen.g(2);
        LevelPackSelectScreen.f(14529);
        TimedSplashScreen.f(0);
        NineSliceFrame.a(0);
        np.a(true);
        BoundedFile.b(57);
        LegacyUtf8Decoder.clearStaticReferences((byte) 124);
        WidgetLayerStack.j((byte) -113);
        LoadingProgressDialog.m(-48);
        AccountContentTransitionLayer.n(28);
        AccountMessageDialog.o(50);
        AccountRegistrationPanel.a(-11310);
        AccountIntroductionPanel.a((byte) 36);
        LoginPanel.i((byte) 88);
        PlayerNameChooserPanel.h(-106);
        WidgetTheme.a(-31063);
        GameplayRenderHelpers.a(2);
        ll.a(!obfuscationGuard ? true : false);
        FullscreenFailureDialog.c(obfuscationGuard);
        kp.a(-68);
        ArchiveFetchClient.c(-12200);
        CacheIoWorker.b(26679);
        ArchiveSourceManager.b(-70);
        TextWidgetRenderer.a(31292);
        MeshRasterState.releaseTables();
        VorbisSample.releaseScratch();
        MeshAttributeRecord.a(-9669);
        Mesh3D.b((byte) -52);
        IntegerValidationHelpers.a(125);
        fm.a((byte) 68);
        gj.a(-27956);
        LevelPackLoader.b(-30593);
        FontRequestHelpers.a(-41);
        AppletResourceHelpers.a((byte) 66);
        QuickChatMenu.d(true);
        QuickChatCategoryRegistry.b((byte) -19);
        QuickChatPhraseRegistry.a(64);
        QuickChatCategoryDefinition.a((byte) 90);
        BirthDateValidator.c((byte) -93);
        DateFieldsWidget.k((byte) 84);
        ArrayWidgetGroup.c(false);
        FocusableWidget.g(-66);
        Widget.c(-14711);
        WidgetTextLayout.a(obfuscationGuard);
        QuickChatHelpDialog.d((byte) 98);
        LogoRenderHelpers.a(31186);
        PopupWidgetLayer.i(111);
        WidgetLayer.a((byte) -17);
        WidgetGroup.f((byte) -67);
        NodeDequeCursor.c(117);
        SingleChildWidget.f((byte) -102);
        BrowserResizeNotificationHelpers.a((byte) -120);
        SpriteInputHelpers.a(0);
        DelegatingCanvas.a(!obfuscationGuard ? true : false);
        nd.a((byte) 121);
        IntKeyIndex.a(true);
        ByteStorage.a(10);
        Bzip2Decoder.releaseSharedState();
        Bzip2State.a((byte) -102);
        ReflectionCheck.a(6);
        ByteArrayPoolHelpers.a(!obfuscationGuard ? true : false);
        rl.a(-18657);
        LabeledToggleRenderer.a(1);
        StatefulWidgetRenderer.b(3);
        RadialSelectorRenderer.a(0);
        MultiValueSliderRenderer.a(-51);
        GameplaySpriteHelpers.a((byte) 118);
        VorbisFloor1.releaseScratch();
        AppletSettingsUiHelpers.b(1516);
        QuickChatPhraseDefinition.f(32463);
        WeightedLruCache.a(-125);
        IntrusiveHashTable.a(120);
        MusicVoice.c((byte) 67);
        MidiFileReader.g();
        MusicVoiceMixer.c(2143);
        SocketConnector.b(-9125);
        ProxyAuthenticationRequiredException.b(10);
        NanoGameClock.f((byte) -124);
        ProducerFramebuffer.b(11);
        rq.a((byte) -118);
        DisplayModeInfo.a((byte) 19);
        IntHistoryBuffer.a(67108864);
        va.a(-15504);
        jh.a((byte) -123);
        ByteArrayNode.a(84);
        MusicPatch.a((byte) 118);
        MusicEnvelope.b((byte) 31);
        SoundTone.releaseScratch();
        GameRenderAudioHelpers.a((byte) -116);
        ar.a(-1);
        LabeledWidget.c(false);
        ValidatedTextFieldWidget.o(-16124);
        TextFieldWidget.i(80);
        ContentTransitionLayer.l(98);
        ActivityIndicatorWidget.a((byte) 123);
        UsernameSuggestionPanel.a((byte) -83);
        HotspotTextWidget.j(-2);
        ValidationIconWidget.a(2);
        ValidationMessageWidget.f((byte) -42);
        ToggleButtonWidget.a(8192);
        TextFieldValidator.c((byte) -109);
        ResourceArchiveFactory.a(-7393);
        Under13RegistrationNoticePanel.a(12127);
        KeyDispatchHelpers.a((byte) 85);
        LevelDecoder.a((byte) 89);
        ArchiveNetworkClient.h((byte) -128);
        SecondaryNodeQueue.b(true);
        ArchiveNetworkRequest.e((byte) 102);
        FileCacheStore.a((byte) 47);
        CacheIoRequest.h(-122);
        CachedArchiveSource.c((byte) 56);
        ResourceRequest.a((byte) 78);
        DateInputWidget.h(0);
        WhirlpoolHasher.b(-1);
        RadialSelectorWidget.a(110);
        MultiValueSliderWidget.j(18724);
        RichTextLayout.a((byte) -51);
        IterableIntrusiveHashTable.a(24968);
        DualLinkDeque.b(2);
        CacheEntry.f(31434);
        DraggableWidget.a(1);
        DropTargetWidget.i((byte) -116);
        DirectByteStorage.c(7301);
        GrowableIntList.a(true);
        QuickChatParameterType.a(125);
        StrongCacheEntry.h(928072);
        ProxySocketConnector.b((byte) -54);
        AudioFilter.releaseScratch();
        BoardPresentationHelpers.a(2);
        IntrusiveHashIterator.c(-93);
        DualLinkIterator.a((byte) 84);
        LevelMetadata.a((byte) 127);
        LevelPack.a(0);
        LevelList.a(true);
        MatchCompleteScreen.f((byte) -112);
        MultiplayerExitScreen.i(61);
        EmailAvailabilityRequest.c(0);
        ConnectionPhase.b(-2);
        DelayedPacket.a(-128);
        IntArrayRequest.a(112);
        LevelResultSubmission.a(-17432);
        SocialListEntry.h(-115);
        TableDataRequest.a(136);
        TableRowSubmission.a(-241);
        TableNameEntry.a((byte) -105);
        RankingsRequest.a((byte) -105);
        ButtonWidgetRenderer.c((byte) -93);
        LinkWidgetRenderer.a(false);
        TextFieldRenderer.d((byte) 91);
        PasswordFieldRenderer.b(-95);
        CheckboxWidgetRenderer.a(true);
        OpacityWidget.a(51550);
        SoundPlayback.a((byte) 49);
        ResourcePreparationEntry.b(-81);
        AchievementMaskRequest.a(28391);
        AchievementSubmission.a(105);
        TranslucentNineSliceFrame.c(5);
        MeshAudioHelpers.a(1024);
        AccountResponse.a((byte) 83);
        fa.a((byte) -102);
        FireworkBurst.a(0);
        RasterCacheSurface.a((byte) 121);
        LoginMethodPreference.a(100);
        AlternateNumericLoginCredentials.b((byte) -121);
        EmailLoginCredentials.a(false);
        RasterSnapshot.a(20888);
        DiagnosticTextLine.a(30850);
        TooltipSprite.a((byte) -77);
        OptionsScreen.c(false);
        LevelCompleteScreen.h(-257);
        PauseMenuScreen.h((byte) -34);
        HighscorePackSelector.a(false);
        AchievementIcon.d(0);
        NewAchievementsScreen.g(6);
        AchievementsScreen.h((byte) -124);
        LevelPackCard.a(32156);
        DialogMessagePanel.a(0);
        FullscreenFailureKind.a(6);
        BytePayloadSubmission.a((byte) -46);
        ValidationStatus.a(109);
        DebouncedValidationSource.d(31366);
        TextLineLayout.a((byte) 111);
        WidgetPaintStyle.b(2);
        UsernameAvailabilityValidator.f(-90);
        PasswordValidator.b(true);
        EmailValidator.e((byte) 124);
        EmailConfirmationValidator.g(0);
        MatchingTextValidator.f(-71);
        ContentTransitionPhase.a(-81);
        TextHotspotRegion.a((byte) -25);
        LegacyEmailValidationError.a((byte) 38);
        this.host = null;
    }

    static {
        field_G = "Change display name";
        field_H = "<%0>: <%1>";
    }
}
