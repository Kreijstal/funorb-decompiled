/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameAppletShell {
    static SystemTaskService taskService;
    static int oldestIncomingOpcode;
    private int affiliateId;
    private int language;
    private boolean jagexHost;
    private int secondaryPort;
    private int primaryPort;
    private int serverNumber;
    private boolean disconnectRequested;
    private long instanceId;
    String serverHost;
    private boolean member;
    private int gameCrc;

    private final void enableProgressResponses(int guard) {
        if (guard <= 110) {
          this.readSessionCookieResponse((byte) 65);
        }
        LoginText.field_b[4] = true;
    }

    final int reconnectAndResendRequests(byte guard) {
        int var2 = this.pollReconnect((byte) 117);
        if (guard != -67) {
          return 16;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (LoginText.field_b[1]) {
            HighscorePlayerRecord.resendArchiveKeyRequests(-83, 2);
          }
          if (LoginText.field_b[2]) {
            ThreeSliceButtonPainter.resendScoreRequests(3, (byte) 105);
          }
          if (LoginText.field_b[3]) {
            EmailValidationError.resendAchievementRequests(26, 4);
          }
          if (LoginText.field_b[4]) {
            ProxyAuthenticationException.resendProgressRequests((byte) 88, 5);
          }
          if (LoginText.field_b[5]) {
            SavedDataRequestSupport.writePendingRequests(6, 17205);
          }
          if (LoginText.field_b[6]) {
            BoundedUrlRequest.writePendingRatings(7, 69);
          }
          if (LoginText.field_b[8]) {
            LevelObject.d((byte) 27);
          }
        }
        return var2;
    }

    final int pollOverlayActions(boolean fullscreen, int guard) {
        if (guard != -556) {
          int[] var4 = (int[]) null;
          NetworkGameClient.scatterFacesByPriority((byte[]) null, 119, (int[]) null, 11, -27);
        }
        return this.serviceAccountActions(255, true, fullscreen);
    }

    private final void initializeAccountPacketLengths(byte guard) {
        SpriteLabelColumns.field_u[2] = -2;
        SpriteLabelColumns.field_u[10] = -1;
        SpriteLabelColumns.field_u[8] = -2;
        SpriteLabelColumns.field_u[12] = -1;
        SpriteLabelColumns.field_u[9] = -1;
        SpriteLabelColumns.field_u[11] = -1;
        SpriteLabelColumns.field_u[5] = -1;
        if (guard != -14) {
          this.serverHost = (String) null;
        }
        SpriteLabelColumns.field_u[4] = -1;
        SpriteLabelColumns.field_u[6] = -2;
        SpriteLabelColumns.field_u[16] = -1;
        SpriteLabelColumns.field_u[1] = 16;
        SpriteLabelColumns.field_u[3] = -1;
        SpriteLabelColumns.field_u[13] = -1;
        SpriteLabelColumns.field_u[17] = -1;
        SpriteLabelColumns.field_u[18] = 1;
        SpriteLabelColumns.field_u[7] = -1;
    }

    final void initializeFramework(int fontArchiveId, int spriteArchiveId, int languageArchiveId, int buttonArchiveId, int handshakeValue, byte guard, boolean optionFlag, int preloadArchiveId) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        QuickChatPhraseCache.field_h = this.language;
        SpriteState.b(QuickChatPhraseCache.field_h, 15);
        NanoTickClock.a(5000, 5000, this.serverNumber, this.member, handshakeValue, taskService, this.gameCrc, optionFlag, (byte) 84, this.primaryPort, this.instanceId, this.serverHost, QuickChatPhraseCache.field_h, this.secondaryPort);
        DualLinkNode.a(this.serverHost, taskService, handshakeValue, guard ^ 22212, QuickChatPhraseCache.field_h, this.serverNumber, this.gameCrc, this.secondaryPort, this.primaryPort);
        ImageProducerRasterBuffer.configurePunctuationKeyCodes(guard + 213);
        ArchiveFactorySupport.field_b = EscapeVector.createMouseWheelInput(13);
        CanvasRenderSupport.attachCanvasInput(SpriteDecodeSupport.field_d, true);
        ChatHistorySupport.field_g = spriteArchiveId;
        MarkerSliderPainter.field_k = fontArchiveId;
        ChatMessage.field_l = buttonArchiveId;
        if (guard != -99) {
          this.serviceAccountFlow(28);
        }
        InstructionsScreen.field_a = languageArchiveId;
        MenuInputState.field_l = preloadArchiveId;
        this.initializeAccountPacketLengths((byte) -14);
        GameKeyHandler.checkStartupGuard(79);
    }

    final void serviceAccountFlow(int guard) {
        Object stackIn_12_0;
        boolean stackIn_12_3;
        int var3 = EscapeVector.obfuscationControl;
        if (guard != -9926) {
          this.primaryPort = 25;
        }
        if (RepeatedCharacterSupport.isSessionFrameworkReady((byte) 102)) {
          int stackIn_11_1 = guard ^ -9787;
          boolean stackIn_11_2 = false;
          if (null == IsaacRandom.field_d) {
            stackIn_12_0 = this;
            stackIn_12_3 = false;
          } else {
            stackIn_12_0 = this;
            stackIn_12_3 = true;
          }
          int discarded$1 = this.serviceAccountActions(stackIn_11_1, stackIn_11_2, stackIn_12_3);
        } else if (AccountNoticeKind.frameworkLoadingStage >= 10) {
          if (!AccountTermsPanel.l(3)) {
            AccountNoticeKind.advanceIntroClock(true);
          } else if (QuickChatPhraseCache.field_e == 0) {
            int discarded$2 = this.serviceAccountActions(255, false, false);
          } else {
            KeyboardStateSupport.serviceAccountInput(25972, KeyboardIdleSupport.field_f);
          }
        }
    }

    final static Sprite[] buildDecodedSprites(int guard) {
        int var8 = EscapeVector.obfuscationControl;
        Sprite[] var1 = new Sprite[ArchiveLoadTask.spriteCount];
        for (int var2 = 0; ArchiveLoadTask.spriteCount > var2; var2++) {
          int var3 = SpriteLoadTask.spriteWidths[var2] * SavedDataQuerySupport.spriteHeights[var2];
          byte[] var20 = AnimatedPathMarker.spriteIndices[var2];
          if (!UiContainer.spriteHasAlpha[var2]) {
            int[] var9 = new int[var3];
            int[] var21 = var9;
            for (int var6_int = 0; var6_int < var3; var6_int++) {
              var9[var6_int] = ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var20[var6_int], 255)];
            }
            var1[var2] = new Sprite(IntroAudioSupport.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[var2], ChatMessage.spriteOffsetYs[var2], SpriteLoadTask.spriteWidths[var2], SavedDataQuerySupport.spriteHeights[var2], var21);
          } else {
            byte[] var22 = CheckboxPainter.spriteAlphas[var2];
            int[] var16 = new int[var3];
            int[] var13 = var16;
            int[] var6 = var13;
            for (int var7 = 0; var7 < var3; var7++) {
              var6[var7] = MatchingTextValidator.bitwiseOr(SpriteCheckboxPainter.bitwiseAnd(255, (int) var22[var7]) << 24, ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd(255, (int) var20[var7])]);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(IntroAudioSupport.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[var2], ChatMessage.spriteOffsetYs[var2], SpriteLoadTask.spriteWidths[var2], SavedDataQuerySupport.spriteHeights[var2], var16));
          }
        }
        if (guard != 15556) {
          NetworkGameClient.buildDecodedSprites(126);
        }
        SpriteDecodeSupport.releaseSpriteSheet(false);
        return var1;
    }

    private final void enableBaseResponses(boolean reflectionChecks, byte guard) {
        LoginText.field_b[18] = true;
        LoginText.field_b[17] = true;
        LoginText.field_b[0] = true;
        LoginText.field_b[3] = true;
        LoginText.field_b[16] = true;
        int var3 = -65 % ((-38 - guard) / 40);
        LoginText.field_b[8] = reflectionChecks;
        LoginText.field_b[7] = true;
    }

    private final void startApplet(int width, String cacheName, int height, int indexCount, int cacheBuild) {
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (!this.isHostAllowed(true)) {
              return;
            }
            this.serverHost = this.getCodeBase().getHost();
            String var6 = this.serverHost.toLowerCase();
            boolean stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.jagexHost = stackIn_7_1;
            this.primaryPort = Integer.parseInt(this.getParameter("gameport1"));
            this.secondaryPort = Integer.parseInt(this.getParameter("gameport2"));
            String var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.serverNumber = Integer.parseInt(var7);
            }
            this.gameCrc = Integer.parseInt(this.getParameter("gamecrc"));
            this.instanceId = Long.parseLong(this.getParameter("instanceid"));
            this.member = this.getParameter("member").equals("yes");
            String var8 = this.getParameter("lang");
            if (var8 != null) {
              this.language = Integer.parseInt(var8);
            }
            if (this.language >= 5) {
              this.language = 0;
            }
            String var9 = this.getParameter("affid");
            if (var9 != null) {
              this.affiliateId = Integer.parseInt(var9);
            }
            SavedDataQuerySupport.field_e = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletThread(this.gameCrc, indexCount, 1, width, height, cacheBuild, cacheName);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var6_ref = (Exception) (Object) decompiledCaughtException;
            String var10 = (String) null;
            GameModeSelectScreen.reportClientError(false, (String) null, (Throwable) ((Object) var6_ref));
            this.showErrorPage(-1, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_23_0 = var6_ref2;
          StringBuilder stackIn_23_1 = new StringBuilder().append("g.BA(").append(width).append(',');
          if (cacheName == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(height).append(',').append(indexCount).append(',').append(cacheBuild).append(')').toString());
        }
    }

    private final int serviceAccountActions(int guard, boolean deferLogin, boolean fullscreen) {
        try {
          int var8 = EscapeVector.obfuscationControl;
          int var4 = ThemeAssetSupport.serviceAccountInput(guard ^ 191, fullscreen, KeyboardIdleSupport.field_f, QuickChatPhraseCache.field_h);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            int var5_int = MeshMaterial.pollAccountFormRequest(GrowableIntList.b(true), ByteArrayPoolSupport.currentLoginText(false), 55);
            if (var5_int != -1) {
              AchievementGrantRule.completeNameAvailabilityAndSuggestions(AccountTermsPanel.field_I, MouseWheelInput.field_a, guard ^ -156, var5_int);
              AccountTermsPanel.field_I = null;
              MouseWheelInput.field_a = null;
            }
            Boolean var11 = ResizableModalPanel.takeEmailAvailabilityResponse(-9878);
            if (var11 != null) {
              EmailCredentials.completeEmailAvailability(var11.booleanValue(), -19503);
            }
          }
          if (var4 == 2) {
            int var5_intLifetime1 = SpriteArchiveSupport.pollLoginWithText(DualLinkNode.e(0), this.affiliateId, TrackerMusicDefinition.currentEmailOrLoginName(31069), UiTheme.a(30519), AchievementQuery.d(guard ^ -4157), DisplayNameForm.k(-99), 0);
            if (var5_intLifetime1 != -1) {
              NameAvailabilityResponseSupport.completeNameAvailability(AccountTermsPanel.field_I, MouseWheelInput.field_a, (byte) -72, var5_intLifetime1);
              AccountTermsPanel.field_I = null;
              MouseWheelInput.field_a = null;
            }
          }
          if (3 == var4) {
            if (IntKeyLookup.field_b != -1 &&
              0 != IntKeyLookup.field_b) {
              IntKeyLookup.field_b = -1;
              SecondaryIntrusiveDeque.d(0);
            }
            if (deferLogin) {
              MarkerSlider.field_P = false;
            } else {
              int var5_intLifetime2 = LoginHandshakeSupport.pollLogin(1, this.affiliateId, UiTheme.a(30519), DualLinkNode.e(0), false, this.jagexHost);
              if (var5_intLifetime2 != -1) {
                if (0 == var5_intLifetime2) {
                  DialWidget.field_J = KeyboardIdleSupport.field_d;
                  AchievementRecord.a(true);
                  QuickChatPhraseCache.field_e = 10;
                  SpriteState.guestSession = false;
                } else {
                  EmailSyntaxValidator.a(var5_intLifetime2, (byte) 83, MouseWheelInput.field_a);
                  MouseWheelInput.field_a = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (BitCountSupport.field_d) {
              DiskCacheRequest.clearSessionAndReload(PointCloudEffect.activeApplet((byte) -113), 21027);
            } else {
              SpriteState.guestSession = true;
              QuickChatPhraseCache.field_e = 10;
            }
          }
          if (var4 == 5) {
            QuitPageSupport.openQuitPage(guard - 10042, PointCloudEffect.activeApplet((byte) -72));
          }
          if (var4 == 6 &&
            CipherPacketBuffer.field_u) {
            QuickChatPhraseCache.field_e = 10;
          }
          if (var4 == 7) {
            ServerListNavigationSupport.openServerList(PointCloudEffect.activeApplet((byte) -120), (byte) -99);
          }
          if (var4 == 8) {
            DiskCacheRequest.clearSessionAndReload(PointCloudEffect.activeApplet((byte) -127), guard ^ 21212);
          }
          if (var4 == 9) {
            DelayedServerPacket.openSupportPage(guard - 251, PointCloudEffect.activeApplet((byte) -89));
          }
          if (var4 == 10) {
            QuickChatDynamicCommand.outgoingPackets.writeCipheredOpcode(17, true);
          }
          if (guard != 255) {
            this.instanceId = -32L;
          }
          if (var4 == 11) {
            IntValueNode.reloadAppletPage(false, PointCloudEffect.activeApplet((byte) -102));
          }
          if (var4 == 12) {
            AlphaContainer.openRelativeUrl(PointCloudEffect.activeApplet((byte) -86), (byte) -123, EmailAvailabilityValidator.c((byte) -31));
          }
          if (var4 == 13) {
            try {
              if (ViewportController.field_m == null) {
                ViewportController.field_m = new BoundedUrlRequest(taskService, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ViewportController.field_m.pollCompletion(17)) {
                PacketBuffer var12 = ViewportController.field_m.completedResponse(-43);
                if (var12 != null) {
                  String var7 = AccountMessagePanel.decodeCp1252(var12.position, 0, var12.payload, (byte) 117);
                  AchievementGrantRule.a(var7, (byte) -6);
                } else {
                  String var9 = (String) null;
                  AchievementGrantRule.a((String) null, (byte) -6);
                }
                ViewportController.field_m = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              Exception var5 = (Exception) (Object) decompiledCaughtException;
              GameModeSelectScreen.reportClientError(false, "S1", (Throwable) ((Object) var5));
              String var10 = (String) null;
              AchievementGrantRule.a((String) null, (byte) -6);
              ViewportController.field_m = null;
            }
          }
          if (15 == var4) {
            QuickChatPhraseCache.field_e = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void configureAccountResponses(boolean archiveKeys, byte guard, boolean scores, boolean progress, boolean savedData) {
        this.enableBaseResponses(false, (byte) 78);
        if (archiveKeys) {
          this.enableArchiveKeyResponses(true);
        }
        if (scores) {
          this.enableScoreResponses((byte) -113);
        }
        int var6 = 84 / ((28 - guard) / 60);
        if (progress) {
          this.enableProgressResponses(127);
        }
        if (savedData) {
          this.enableSavedDataResponses(125);
        }
    }

    private final void readBrowserUrlResponse(boolean guard) {
        int var2 = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
        boolean var3 = ((1 & var2) != 0);
        int var4 = -1 + EmailSyntaxValidator.field_r;
        byte[] var5 = new byte[var4];
        QuickChatDynamicCommand.incomingPackets.readCipheredBytes(var5, 19583, var4, 0);
        Bzip2State.openBrowserUrl(guard, (var3), PointCloudEffect.activeApplet((byte) -122), RasterSnapshot.a(var5, 117));
    }

    final void startApplet(String cacheName, int width, int indexCount) {
        try {
          this.startApplet(width, cacheName, 480, indexCount, 32);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "g.KA(" + (cacheName != null ? "{...}" : "null") + ',' + width + ',' + indexCount + ')');
        }
    }

    final static void initializeSessionCounters(int guard, int levelIndex) {
        SocketJs5Transport.field_r = new SessionCounterState(levelIndex);
        int var2 = 45 / ((guard - 89) / 35);
    }

    final void dispatchAccountPacket(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = LegacyStyleNode.field_v;
        int var3 = 96 % ((80 - guard) / 33);
        if (var2 < 64 &&
          LoginText.field_b[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            ArchiveKeyRequest.decodeArchiveKeyResponse(false);
          } else if (2 == var2) {
            DisplayModeInfo.a((byte) -120);
          } else if (3 == var2) {
            ImageProducerRasterBuffer.readAchievementResponse(103);
          } else if (var2 == 4) {
            LegacyButton.decodeProgressResponse(108457410);
          } else if (var2 == 5) {
            AudioService.decodeSavedDataResponse((byte) 124);
          } else if (var2 == 6) {
            DisplayAndRatingSupport.decodeRatingResponse((byte) 113);
          } else if (7 == var2) {
            this.readSessionCookieResponse((byte) 108);
          } else if (var2 == 8) {
            DirectByteStorage.readReflectionCheck(QuickChatDynamicCommand.incomingPackets, taskService, EmailSyntaxValidator.field_r, -24183);
          } else if (var2 == 16) {
            ArchiveKeyRequest.decodeAccountName(true);
          } else {
            if (11 != var2 &&
              12 != var2) {
              if (13 == var2) {
                SocketJs5Transport.readContactUpdate(0);
                return;
              }
              if (var2 == 17) {
                this.readBrowserUrlResponse(true);
                return;
              }
              if (var2 == 18) {
                SavedCompletionFlags.decodeLoginFlagReset((byte) -125);
                return;
              }
              GameModeSelectScreen.reportClientError(false, "MGS1: " + LoginStage.formatPacketDiagnostic((byte) 107), (Throwable) null);
              ConnectionSupport.closeTransport(16);
              return;
            }
            boolean stackIn_25_0 = (12 == var2);
            ChatMessage var4 = ChatMessageDecoder.decodeMessage(stackIn_25_0, 2);
            DynamicTerrainRenderer.acceptChatMessage(19956, var4);
          }
          return;
        }
        GameModeSelectScreen.reportClientError(false, "MGS2: " + LoginStage.formatPacketDiagnostic((byte) 49), (Throwable) null);
        ConnectionSupport.closeTransport(16);
    }

    final static void scatterFacesByPriority(byte[] priorities, int faceIndexScratch, int[] priorityCursors, int guard, int bucketCountScratch) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (guard <= 113) {
            taskService = (SystemTaskService) null;
          }
          int var5_int = 0;
          while (true) {
            if (var5_int >= AccountFormStage.faceDepthBucketCounts.length) {
              return;
            }
            bucketCountScratch = AccountFormStage.faceDepthBucketCounts[var5_int];
            int var6 = var5_int << 4;
            while (true) {
              int incrementValue$0 = bucketCountScratch;
              bucketCountScratch--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              int incrementValue$1 = var6;
              var6++;
              faceIndexScratch = SavedDataQuerySupport.bucketedFaceIndices[incrementValue$1];
              byte dupTemp$2 = priorities[faceIndexScratch];
              int dupTemp$3 = priorityCursors[dupTemp$2];
              priorityCursors[dupTemp$2] = dupTemp$3 + 1;
              SavedDataQuerySupport.bucketedFaceIndices[dupTemp$3] = faceIndexScratch;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("g.IA(");
          if (priorities == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(faceIndexScratch).append(',');
          if (priorityCursors == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',').append(bucketCountScratch).append(')').toString());
        }
    }

    private final void readSessionCookieResponse(byte guard) {
        String var2 = PauseMenuScreen.readIncomingString((byte) 0);
        SecondaryIntrusiveDeque.setSessionCookie(var2, -112, PointCloudEffect.activeApplet((byte) -59));
        int var3 = 59 % ((guard - 41) / 61);
    }

    public static void releaseStatics(byte guard) {
        taskService = null;
        if (guard != -73) {
          NetworkGameClient.initializeSessionCounters(-56, 26);
        }
    }

    private final void enableScoreResponses(byte guard) {
        if (guard >= -63) {
          this.gameCrc = -123;
        }
        LoginText.field_b[2] = true;
    }

    private final void enableSavedDataResponses(int guard) {
        if (guard < 99) {
          String var3 = (String) null;
          this.startApplet(69, (String) null, -3, 75, 67);
        }
        LoginText.field_b[5] = true;
    }

    private final int pollReconnect(byte guard) {
        if (this.errorReported) {
          return -1;
        }
        if (!AccountSessionStatusSupport.hasAccountSession(17830)) {
          return -1;
        }
        if (MarkerSlider.field_P) {
          return -1;
        }
        int var2 = LoginHandshakeSupport.pollLogin(1, this.affiliateId, UiTheme.a(guard ^ 30530), DualLinkNode.e(guard - 117), true, this.jagexHost);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!ByteStorage.field_a) {
            this.showErrorPage(-1, "reconnect");
          }
          DialWidgetPainter.b((byte) -123);
          EmailSyntaxValidator.a(var2, (byte) 83, MouseWheelInput.field_a);
          if (guard != 117) {
            this.serverHost = (String) null;
          }
          MarkerSlider.field_P = true;
          ContactEntry.field_mb = MonotonicClockSupport.monotonicMillis(128) + 15000L;
          return var2;
        }
        if (11 == QuickChatPhraseCache.field_e &&
          0 == IntKeyLookup.field_b) {
          AchievementRecord.a(true);
        }
        return var2;
    }

    final void serviceFramework(int guard, boolean preserveCanvas) {
        int var5 = EscapeVector.obfuscationControl;
        if (DirectByteStorage.field_n != null) {
          if (null == IsaacRandom.field_d) {
            java.awt.Container var6 = TextLayout.gameContainer(-1);
            java.awt.Dimension var4 = var6.getSize();
            DirectByteStorage.field_n.setDesiredSize(var4.height, var4.width, 18705);
          }
          DirectByteStorage.field_n.updateViewport(9477);
        }
        KeyboardStateSupport.pollKeyboardState(28087);
        SpriteState.pollMouseState(-3657);
        if (!ChatSettingsSupport.needsFrameworkPreparation(16836) &&
          11 != QuickChatPhraseCache.field_e) {
          AccountOverlayController.updateAccountOverlay(-103);
        }
        if (null != ArchiveFactorySupport.field_b) {
          KeyboardIdleSupport.field_f = ArchiveFactorySupport.field_b.pollRotation(-126);
        }
        if (HudMessage.a(true)) {
          int var3 = 1200 * FrameCadenceSupport.ticksPerSecond(0);
          if (this.disconnectRequested ||
            !(KeyboardIdleSupport.keyboardIdleTicks((byte) -12) <= var3) &&
            !(SpriteDecodeSupport.mouseIdleTicks((byte) -127) <= var3)) {
            this.disconnectRequested = false;
            ConnectionSupport.closeTransport(guard ^ -17);
            DialWidgetPainter.b((byte) -87);
            EmailSyntaxValidator.a(2, (byte) 83, TextFieldValidator.field_g);
            IntrusiveNode.a(12);
            MarkerSlider.field_P = true;
            ContactEntry.field_mb = MonotonicClockSupport.monotonicMillis(guard + 129) + 15000L;
          }
        }
        if (IntKeyLookup.field_b == -1 ||
          IntKeyLookup.field_b == 0) {
          boolean stackIn_24_0 = !(-1 != IntKeyLookup.field_b);
          boolean var3Lifetime1 = stackIn_24_0;
          IntKeyLookup.field_b = SpriteCheckboxPainter.b(guard - 1021831774);
          if (var3Lifetime1 &&
            0 == IntKeyLookup.field_b &&
            QuickChatPhraseCache.field_e == 11 &&
            !AccountSessionStatusSupport.hasAccountSession(17830)) {
            AchievementRecord.a(true);
          }
          if (IntKeyLookup.field_b != -1 &&
            IntKeyLookup.field_b != 0) {
            ContactEntry.field_mb = 15000L + MonotonicClockSupport.monotonicMillis(128);
          }
        }
        if (IntKeyLookup.field_b != -1 &&
          IntKeyLookup.field_b != 0) {
          if (10 > AccountNoticeKind.frameworkLoadingStage) {
            if (IntKeyLookup.field_b == 3) {
              this.showErrorPage(guard + 0, "js5crc");
            } else if (IntKeyLookup.field_b == 4) {
              this.showErrorPage(-1, "js5io");
            } else if (2 == IntKeyLookup.field_b) {
              this.showErrorPage(-1, "js5connect_full");
            } else if (IntKeyLookup.field_b != 5) {
              this.showErrorPage(-1, "js5connect");
            } else {
              this.showErrorPage(-1, "outofdate");
            }
          } else if (QuickChatPhraseCache.field_e >= 10) {
            DialWidgetPainter.b((byte) -103);
            if (IntKeyLookup.field_b == 3) {
              EmailSyntaxValidator.a(256, (byte) 83, GameKeyHandler.field_b);
            } else if (IntKeyLookup.field_b == 4) {
              EmailSyntaxValidator.a(256, (byte) 83, SecondaryNodeHashTable.field_e);
            } else if (IntKeyLookup.field_b == 2) {
              EmailSyntaxValidator.a(256, (byte) 83, DirectByteStorage.field_l);
            } else if (IntKeyLookup.field_b != 5) {
              EmailSyntaxValidator.a(256, (byte) 83, ArchiveSpriteLoader.field_f);
            } else {
              EmailSyntaxValidator.a(5, (byte) 83, HighscoreTable.field_a);
            }
            MarkerSlider.field_P = true;
          }
        }
        if ((guard != IntKeyLookup.field_b &&
          IntKeyLookup.field_b != 0 ||
          AccountSessionStatusSupport.hasAccountSession(17830)) &&
          ContactEntry.field_mb <= MonotonicClockSupport.monotonicMillis(128)) {
          MarkerSlider.field_P = false;
          if (IntKeyLookup.field_b != -1 &&
            IntKeyLookup.field_b != 0) {
            IntKeyLookup.field_b = -1;
            SecondaryIntrusiveDeque.d(~guard);
          }
        }
        if (0 == IntKeyLookup.field_b &&
          !AccountSessionStatusSupport.hasAccountSession(guard ^ -17831)) {
          MenuTitleRenderSupport.field_d = false;
        }
        if (0 == AccountNoticeKind.frameworkLoadingStage &&
          EmailValidationError.a(23403)) {
          AccountNoticeKind.frameworkLoadingStage = 1;
        }
        if (AccountNoticeKind.frameworkLoadingStage == 1) {
          if (QuickChatPhraseCache.field_h != 0) {
            PasswordValidator.field_p = LoginHandshakeSupport.createDefaultArchive(InstructionsScreen.field_a, guard - 127);
          }
          ChatSettingsSupport.field_a = MarkerSliderPainter.createArchive(MarkerSliderPainter.field_k, 0, false, 1, true);
          LoadingProgressDialog.field_ab = MarkerSliderPainter.createArchive(ChatMessage.field_l, 0, false, 1, true);
          AlternateUsernameCredentials.field_j = MarkerSliderPainter.createArchive(ChatHistorySupport.field_g, 0, false, 1, true);
          MarkerSliderPainter.field_h = ChatSettingsSupport.field_a;
          AccountNoticeKind.frameworkLoadingStage = 2;
          SavedDataQuery.field_m = LoadingProgressDialog.field_ab;
        }
        if (AccountNoticeKind.frameworkLoadingStage == 2) {
          if (null != PasswordValidator.field_p &&
            PasswordValidator.field_p.ensureIndex(~guard)) {
            if (!PasswordValidator.field_p.hasGroupName("", (byte) -119)) {
              PasswordValidator.field_p = null;
            } else if (PasswordValidator.field_p.tryLoadNamedGroup(0, "")) {
              DropTargetWidget.a(true, PasswordValidator.field_p);
              PasswordValidator.field_p = null;
              SpriteOffset.resetFrameTiming((byte) 62);
            }
          }
          if (PasswordValidator.field_p == null) {
            AccountNoticeKind.frameworkLoadingStage = 3;
          }
        }
        if (3 == AccountNoticeKind.frameworkLoadingStage &&
          SpriteDecodeSupport.commonUiReady(ChatSettingsSupport.field_a, LoadingProgressDialog.field_ab, AlternateUsernameCredentials.field_j, (byte) -90) &&
          MeshProjectionSupport.loadAllArchiveGroups(11, AlternateUsernameCredentials.field_j)) {
          PasswordValidator.releaseLoadingScreenResources(-8055);
          IntroAudioSupport.checkReleaseGuard(-87);
          CipherPacketBuffer.field_u = false;
          DelegatingCanvas.field_e = AccountSessionStatusSupport.field_a;
          GzipDecoder.initializeAccountUi(BitCountSupport.field_d, (byte) -124, AlternateUsernameCredentials.field_j, ChatSettingsSupport.field_a, LoadingProgressDialog.field_ab);
          if (ProxySocketConnector.field_p ||
            KeyboardStateSupport.field_d != null) {
            String stackIn_98_0 = KeyboardStateSupport.field_d;
            boolean stackIn_99_1 = !(ProxySocketConnector.field_p);
            int stackIn_101_2 = 64;
            boolean stackIn_102_3 = !(ProxySocketConnector.field_p);
            QuickChatPhraseCache.showLoginDialog(stackIn_98_0, stackIn_99_1, stackIn_101_2, stackIn_102_3);
          }
          if (SavedDataQuerySupport.field_e) {
            NameAvailabilityResultSupport.chooseGuestSession(4);
          }
          if (TransitionPoint.field_b == null) {
            TransitionPoint.field_b = UsernameCredentials.sharedPcmMixer((byte) 117);
            StringNode.field_h = MenuInputState.introDurationMillis(-31119);
          }
          SpriteFactorySupport.initializeIntroAssets(AlternateUsernameCredentials.field_j, TransitionPoint.field_b, StringNode.field_h, (byte) 103);
          ChatSettingsSupport.field_a = null;
          AlternateUsernameCredentials.field_j = null;
          LoadingProgressDialog.field_ab = null;
          QuickChatPhraseDefinition.inspectAppletUsername(82, (java.applet.Applet) (this));
          SpriteOffset.resetFrameTiming((byte) 126);
          AccountNoticeKind.frameworkLoadingStage = 10;
        }
        if (AccountNoticeKind.frameworkLoadingStage == 10) {
          if (QuickChatPhraseCache.field_h != 0) {
            KeyboardIdleSupport.field_c = LoginHandshakeSupport.createDefaultArchive(MenuInputState.field_l, -127);
          }
          AccountNoticeKind.frameworkLoadingStage = 11;
        }
        if (AccountNoticeKind.frameworkLoadingStage == 11) {
          if (KeyboardIdleSupport.field_c != null && (!KeyboardIdleSupport.field_c.ensureIndex(0) ||
            !KeyboardIdleSupport.field_c.tryLoadAllGroups((byte) -119))) {
            InstructionsScreen.setLoadingProgress(Bullet.formatArchiveProgress(AlphaContainer.field_H, KeyboardIdleSupport.field_c, HighscoreTable.field_g, -12920), 17637, 0.0f);
            boolean decompiledFrameRemainder0 = false;
          }
          else {
            SpriteDecodeSupport.field_b = true;
            AccountNoticeKind.frameworkLoadingStage = 12;
          }
        }
        if (AccountNoticeKind.frameworkLoadingStage == 12 &&
          !SpriteDecodeSupport.field_b) {
          AccountNoticeKind.frameworkLoadingStage = 13;
        }
        if (AccountNoticeKind.frameworkLoadingStage == 13) {
          boolean var3Lifetime2 = true;
          if (null != DualLinkNode.field_n) {
            boolean stackIn_131_0 = !(!DualLinkNode.field_n.pollComplete(7020));
            var3Lifetime2 = stackIn_131_0;
            InstructionsScreen.setLoadingProgress(DualLinkNode.field_n.message, 17637, DualLinkNode.field_n.progressPercent);
          }
          if (var3Lifetime2) {
            AccountNoticeKind.frameworkLoadingStage = 20;
          }
        }
        if (!preserveCanvas &&
          PacketBuffer.field_i) {
          Checkbox.detachCanvasInput(SpriteDecodeSupport.field_d, (byte) -127);
          this.replaceCanvas(-32);
          CanvasRenderSupport.attachCanvasInput(SpriteDecodeSupport.field_d, true);
        }
        if (LoginText.field_b[8]) {
          CipherPacketBuffer.p(11197);
        }
    }

    final static boolean supportsSessionRecovery(int guard) {
        int var1 = 50 % ((guard - 14) / 40);
        return true;
    }

    final static void clearFaceDepthBuckets(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          int[] var5 = AccountFormStage.faceDepthBucketCounts;
          int[] var1 = var5;
          int var2 = 0;
          int var3 = var5.length;
          if (guard >= -110) {
            return;
          }
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1_ref), "g.MA(" + guard + ')');
        }
    }

    private final void enableArchiveKeyResponses(boolean enabled) {
        LoginText.field_b[1] = enabled;
    }

    protected NetworkGameClient() {
    }

    static {
        oldestIncomingOpcode = -1;
    }
}
