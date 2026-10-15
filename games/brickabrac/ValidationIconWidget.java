/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationIconWidget extends FocusableWidget {
    private int spinnerTicks;
    private ValidationSource validationSource;
    static String field_L;
    static int[] worldDirectionX;
    static boolean field_N;
    static String invalidEmailMessage;
    static ResourceArchive field_K;
    static String field_Q;

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var5;
        int var6;
        ValidationStatus var8;
        int var9;
        int var10;
        int var11;
        RgbSprite var12;
        RgbSprite var13;
        RgbSprite var14;
        var11 = BrickABrac.field_J ? 1 : 0;
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        if (layer != 0) {
          return;
        }
        var5 = parentX + (this.x + (this.width >> 1));
        var6 = (this.height >> 1) + (this.y + parentY);
        var8 = this.validationSource.getValidationStatus((byte) -31);
        if (var8 != ConditionalTextValue.validationDebouncing &&
          SaveResultsPromptScreen.validationPending != var8) {
          if (AccountMessageDialog.validationInvalid == var8) {
            var13 = AccountDateHelpers.field_a[2];
            var13.f(-(var13.width >> 1) + var5, -(var13.height >> 1) + var6, 256);
          } else if (DualLinkIterator.validationValid == var8) {
            var14 = AccountDateHelpers.field_a[1];
            var14.f(var5 - (var14.width >> 1), -(var14.height >> 1) + var6, 256);
          }
        } else {
          var12 = AccountDateHelpers.field_a[0];
          var9 = var12.canvasWidth << 1;
          var10 = var12.canvasHeight << 1;
          if (IntrusiveHashIterator.field_c != null &&
            IntrusiveHashIterator.field_c.width >= var9 &&
            var10 <= IntrusiveHashIterator.field_c.height) {
            IndexedSpriteGeometry.pushSpriteRaster(-114, IntrusiveHashIterator.field_c);
            Rasterizer2D.clear();
          } else {
            IntrusiveHashIterator.field_c = new RgbSprite(var9, var10);
            IndexedSpriteGeometry.pushSpriteRaster(-87, IntrusiveHashIterator.field_c);
          }
          var12.a(112, 144, var12.canvasWidth << 4, var12.canvasHeight << 4, -this.spinnerTicks << 10, 4096);
          sc.popRaster(-104);
          IntrusiveHashIterator.field_c.f(-var12.canvasWidth + var5, -var12.canvasHeight + var6, 256);
        }
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          this.spinnerTicks = this.spinnerTicks + 1;
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wl.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    final boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            ValidationIconWidget.handleRankingsResponse(false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wl.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void handleRankingsResponse(boolean obfuscationGuard) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        int rankingKind = 0;
        RankingsRequest request = null;
        int recordCount = 0;
        int rowLimit = 0;
        int nameIndex = 0;
        String[][] namesBySort = null;
        int[][] statisticsBySort = null;
        int rowCount = 0;
        int ratingRowIndex = 0;
        int ratingOutputIndex = 0;
        int ratingSourceIndex = 0;
        int clientBranchFlag = 0;
        int winRateOutputIndex = 0;
        BitPacketBuffer packet = null;
        int recordIndex;
        int winRateRowIndex;
        int var10Lifetime1;
        int winRateSourceIndex;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          packet = LogoRenderHelpers.incomingPackets;
          rankingKind = packet.readUnsignedByte(255);
          request = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.first(-7));
          while (request != null) {
            if (request.rankingKind != rankingKind) {
              request = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.next((byte) 116));
              continue;
            }
            break;
          }
          if (request == null) {
            hn.closeGameTransport((byte) 64);
            return;
          }
          recordCount = packet.readUnsignedByte(255);
          if (recordCount != 0) {
            LevelCompleteScreen.receivedRankingNames[0] = LoadingProgressDialog.field_cb;
            rowLimit = request.rowLimit;
            for (nameIndex = 1; recordCount > nameIndex; nameIndex++) {
              LevelCompleteScreen.receivedRankingNames[nameIndex] = packet.readCp1252String(-1);
            }
            DualLinkNode.prepareRankingScratch((byte) 75, recordCount, rowLimit);
            for (recordIndex = 0; recordCount > recordIndex; recordIndex++) {
              CalendarRankingHelpers.decodeRankingStatistics((byte) -122, packet);
              if (recordIndex == 0) {
                request.localDraws = fh.decodedRankingDraws;
                request.localRating = SocialTabbedPanel.decodedRankingRating;
                request.localLosses = ValidatedTextFieldWidget.decodedRankingLosses;
                request.localWins = RadialSelectorWidget.decodedRankingWins;
                MessageScreen.appendRankingStatistics(SocialTabbedPanel.decodedRankingRating, fh.decodedRankingDraws, recordIndex, -19824, ValidatedTextFieldWidget.decodedRankingLosses, RadialSelectorWidget.decodedRankingWins);
              } else {
                MessageScreen.appendRankingStatistics(SocialTabbedPanel.decodedRankingRating, fh.decodedRankingDraws, recordIndex, -19824, ValidatedTextFieldWidget.decodedRankingLosses, RadialSelectorWidget.decodedRankingWins);
              }
            }
            GameplaySpriteHelpers.sortRankingViews(12429, rowLimit);
            dupTemp$0 = new String[2][rowLimit];
            request.namesBySort = dupTemp$0;
            namesBySort = dupTemp$0;
            dupTemp$1 = new int[2][4 * rowLimit];
            request.statisticsBySort = dupTemp$1;
            statisticsBySort = dupTemp$1;
            rowCount = ProxySocketConnector.rankingRowCount;
            ratingRowIndex = 0;
            ratingOutputIndex = 0;
            while (ratingRowIndex < rowCount) {
              ratingSourceIndex = VerticalScrollbar.rankingSortIndices[ratingRowIndex];
              namesBySort[0][ratingOutputIndex] = LevelCompleteScreen.receivedRankingNames[ratingSourceIndex];
              statisticsBySort[0][4 * ratingOutputIndex] = DialogMessagePanel.rankingRatings[ratingSourceIndex];
              statisticsBySort[0][ratingOutputIndex * 4 + 1] = RankingsScreen.rankingWins[ratingSourceIndex];
              statisticsBySort[0][2 + ratingOutputIndex * 4] = ObjectHistoryBuffer.rankingDraws[ratingSourceIndex];
              statisticsBySort[0][4 * ratingOutputIndex + 3] = WidgetGroup.rankingLosses[ratingSourceIndex];
              if (SpaceBackground.isLocalPlayerName(LevelCompleteScreen.receivedRankingNames[ratingSourceIndex], -40) &&
                0 == ObjectHistoryBuffer.rankingDraws[ratingSourceIndex] + RankingsScreen.rankingWins[ratingSourceIndex] + WidgetGroup.rankingLosses[ratingSourceIndex]) {
                namesBySort[0][ratingOutputIndex] = null;
                ratingOutputIndex--;
              }
              ratingOutputIndex++;
              ratingRowIndex++;
            }
            winRateRowIndex = 0;
            winRateOutputIndex = 0;
            var10Lifetime1 = winRateOutputIndex;
            while (rowCount > winRateRowIndex) {
              winRateSourceIndex = VerticalScrollbar.rankingSortIndices[winRateRowIndex + rowLimit];
              namesBySort[1][winRateOutputIndex] = LevelCompleteScreen.receivedRankingNames[winRateSourceIndex];
              statisticsBySort[1][winRateOutputIndex * 4] = DialogMessagePanel.rankingRatings[winRateSourceIndex];
              statisticsBySort[1][1 + winRateOutputIndex * 4] = RankingsScreen.rankingWins[winRateSourceIndex];
              statisticsBySort[1][2 + 4 * winRateOutputIndex] = ObjectHistoryBuffer.rankingDraws[winRateSourceIndex];
              statisticsBySort[1][winRateOutputIndex * 4 + 3] = WidgetGroup.rankingLosses[winRateSourceIndex];
              if (SpaceBackground.isLocalPlayerName(LevelCompleteScreen.receivedRankingNames[winRateSourceIndex], -31) &&
                RankingsScreen.rankingWins[winRateSourceIndex] + ObjectHistoryBuffer.rankingDraws[winRateSourceIndex] + WidgetGroup.rankingLosses[winRateSourceIndex] == 0) {
                namesBySort[1][winRateOutputIndex] = null;
                winRateOutputIndex--;
              }
              winRateRowIndex++;
              winRateOutputIndex++;
            }
          }
          if (obfuscationGuard) {
            field_Q = (String) null;
          }
          request.complete = true;
          request.unlink((byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "wl.C(" + obfuscationGuard + ')');
        }
    }

    final static int a(String param0, boolean param1, int param2, ConditionalTextValue param3, int param4, ConditionalTextValue param5, int param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_2 = null;
        PacketBuffer stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var14 = param3.getText(2);
          var8 = param5.getText(2);
          if (WhirlpoolHasher.gameTransport == null &&
            !CappedUrlRequest.a(false, param6 ^ 10004)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (GameConnectionHelpers.connectionPhase == BitPacketBuffer.readyToSendHandshake) {
            TextFieldValidator.outgoingPackets.position = 0;
            AchievementBrowserScreen.pendingEmailAvailabilityReply = null;
            if (param0 != null) {
              var9 = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              MeshAudioHelpers.accountPacketScratch.position = 0;
              MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
              MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
              MeshAudioHelpers.accountPacketScratch.writePrefixedCp1252String(param6 ^ 4, var14);
              MeshAudioHelpers.accountPacketScratch.writePrefixedCp1252String(0, var8);
              var15 = (CharSequence) ((Object) param0);
              MeshAudioHelpers.accountPacketScratch.writePrefixedCp1252String(0, AccountIntroductionPanel.a(var15, -58));
              MeshAudioHelpers.accountPacketScratch.writeShort((byte) 113, param4);
              MeshAudioHelpers.accountPacketScratch.writeByte(89, param2);
              MeshAudioHelpers.accountPacketScratch.writeByte(127, var9);
              TextFieldValidator.outgoingPackets.writeByte(53, 18);
              TextFieldValidator.outgoingPackets.position = TextFieldValidator.outgoingPackets.position + 2;
              var10 = TextFieldValidator.outgoingPackets.position;
              var11_ref_String = GameClock.readSettingsCookie(true, EmailConfirmationValidator.e((byte) -75));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              TextFieldValidator.outgoingPackets.writeCp1252String(var11_ref_String, -1);
              LevelDecoder.writeEncryptedPacketContents(TextFieldValidator.outgoingPackets, MeshAudioHelpers.accountPacketScratch, Ball.accountRsaExponent, (byte) -72, WeightedLruCache.accountRsaModulus);
              TextFieldValidator.outgoingPackets.backfillShortLength(-var10 + TextFieldValidator.outgoingPackets.position, 255);
            } else {
              MeshAudioHelpers.accountPacketScratch.position = 0;
              MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
              MeshAudioHelpers.accountPacketScratch.writeInt(IterableIntrusiveHashTable.packetRandom.nextInt(), (byte) -79);
              stackIn_11_0 = MeshAudioHelpers.accountPacketScratch;
              stackIn_11_1 = 0;
              if (!param3.isIncluded((byte) 116)) {
                stackIn_12_2 = "";
              } else {
                stackIn_12_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_11_0).writePrefixedCp1252String(stackIn_11_1, stackIn_12_2);
              stackIn_14_0 = MeshAudioHelpers.accountPacketScratch;
              stackIn_14_1 = param6 - 4;
              if (!param5.isIncluded((byte) 120)) {
                stackIn_15_2 = "";
              } else {
                stackIn_15_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_14_0).writePrefixedCp1252String(stackIn_14_1, stackIn_15_2);
              TextFieldValidator.outgoingPackets.writeByte(-10, 16);
              TextFieldValidator.outgoingPackets.position = TextFieldValidator.outgoingPackets.position + 1;
              var9 = TextFieldValidator.outgoingPackets.position;
              LevelDecoder.writeEncryptedPacketContents(TextFieldValidator.outgoingPackets, MeshAudioHelpers.accountPacketScratch, Ball.accountRsaExponent, (byte) -72, WeightedLruCache.accountRsaModulus);
              TextFieldValidator.outgoingPackets.backfillByteLength((byte) 119, TextFieldValidator.outgoingPackets.position - var9);
            }
            ActivityIndicatorWidget.flushTransportPackets(-1, 10000);
            GameConnectionHelpers.connectionPhase = DiagnosticTextLine.awaitingValidationReply;
          }
          if (DiagnosticTextLine.awaitingValidationReply == GameConnectionHelpers.connectionPhase &&
            PacketReceiveHelpers.ensureGamePacketBytes(20, 1)) {
            var9Lifetime1 = LogoRenderHelpers.incomingPackets.readUnsignedByte(255);
            LogoRenderHelpers.incomingPackets.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              GameConnectionHelpers.connectionPhase = ClientResourceHelpers.awaitingValidationStrings;
              ArchiveSourceManager.field_f = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                MatchingTextValidator.setTuhstatbutMarker(EmailConfirmationValidator.e((byte) -108), param6 + 5);
                DirectByteStorage.field_e = ConditionalTextValue.field_d;
                hn.closeGameTransport((byte) 96);
                RadialSelectorRenderer.field_d = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 == 99) {
                PacketReceiveHelpers.ensureGamePacketBytes(20, Widget.d((byte) -59));
                AchievementBrowserScreen.pendingEmailAvailabilityReply = new Boolean(kd.a(-2, LogoRenderHelpers.incomingPackets));
                LogoRenderHelpers.incomingPackets.position = 0;
              } else {
                IntrusiveHashTable.currentPacketOpcode = var9Lifetime1;
                GameConnectionHelpers.connectionPhase = SocialTabbedPanel.awaitingValidationBody;
                ga.incomingPacketLength = -1;
              }
            }
          }
          if (GameConnectionHelpers.connectionPhase == ClientResourceHelpers.awaitingValidationStrings) {
            var9Lifetime2 = 2;
            if (PacketReceiveHelpers.ensureGamePacketBytes(20, var9Lifetime2)) {
              var10Lifetime1 = LogoRenderHelpers.incomingPackets.readUnsignedShort(65280);
              LogoRenderHelpers.incomingPackets.position = 0;
              if (PacketReceiveHelpers.ensureGamePacketBytes(20, var10Lifetime1)) {
                var11 = ArchiveSourceManager.field_f.length;
                for (var12 = 0; var11 > var12; var12++) {
                  ArchiveSourceManager.field_f[var12] = LogoRenderHelpers.incomingPackets.readPrefixedCp1252String(LevelResultSubmission.a(param6, 251));
                }
                hn.closeGameTransport((byte) 79);
                RadialSelectorRenderer.field_d = false;
                stackIn_43_0 = 100 + var11;
                return stackIn_43_0;
              }
            }
          }
          if (SocialTabbedPanel.awaitingValidationBody == GameConnectionHelpers.connectionPhase &&
            TextWidgetRenderer.ensureGamePacketBody((byte) -92)) {
            if (IntrusiveHashTable.currentPacketOpcode == 255) {
              var9_ref_String = LogoRenderHelpers.incomingPackets.readNullableCp1252String(param6 - 4);
              if (var9_ref_String != null) {
                AppletSettingsUiHelpers.setSettingsCookie(param6 ^ -55, EmailConfirmationValidator.e((byte) -120), var9_ref_String);
              }
            } else {
              DirectByteStorage.field_e = LogoRenderHelpers.incomingPackets.readCp1252String(-1);
            }
            hn.closeGameTransport((byte) 106);
            RadialSelectorRenderer.field_d = false;
            stackIn_51_0 = IntrusiveHashTable.currentPacketOpcode;
            return stackIn_51_0;
          }
          if (param6 != 4) {
            field_N = false;
          }
          if (null == WhirlpoolHasher.gameTransport) {
            if (RadialSelectorRenderer.field_d) {
              if (MembershipBenefitsScreen.getMillisSinceGameRead(param6 ^ -6788) > 30000L) {
                DirectByteStorage.field_e = DisplayModeInfo.field_b;
              } else {
                DirectByteStorage.field_e = ByteArrayPoolHelpers.field_e;
              }
              RadialSelectorRenderer.field_d = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = SocketConnector.field_b;
            SocketConnector.field_b = DebouncedValidationSource.field_a;
            DebouncedValidationSource.field_a = var9Lifetime3;
            RadialSelectorRenderer.field_d = true;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("wl.E(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_K = null;
        field_L = null;
        worldDirectionX = null;
        field_Q = null;
        invalidEmailMessage = null;
        if (param0 != 2) {
          LobbyPlayer var2 = (LobbyPlayer) null;
          ValidationIconWidget.insertSortedLobbyPlayer((LobbyPlayer) null, -2);
        }
    }

    final static void insertSortedLobbyPlayer(LobbyPlayer player, int obfuscationGuard) {
        LobbyPlayer existingPlayer = null;
        int clientBranchFlag = 0;
        LobbyPlayer var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          player.unlink((byte) 111);
          if (obfuscationGuard != 17574) {
            var4 = (LobbyPlayer) null;
            ValidationIconWidget.insertSortedLobbyPlayer((LobbyPlayer) null, 48);
          }
          existingPlayer = (LobbyPlayer) (GameplayRenderHelpers.lobbyPlayers.first(-69));
          while (existingPlayer != null) {
            if (existingPlayer.comesBeforePlayer(player, obfuscationGuard ^ -18005)) {
              existingPlayer = (LobbyPlayer) (GameplayRenderHelpers.lobbyPlayers.next((byte) 116));
              continue;
            }
            break;
          }
          if (existingPlayer == null) {
            GameplayRenderHelpers.lobbyPlayers.addLast(player, (byte) 3);
          } else {
            BubbleDistortion.insertNodeBefore(player, 56, existingPlayer);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_13_0 = failure;
          stackIn_13_1 = new StringBuilder().append("wl.B(");
          if (player == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ValidationIconWidget(ValidationSource validationSource) {
        try {
          this.validationSource = validationSource;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wl.<init>(" + (validationSource != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltip(int obfuscationGuard) {
        if (obfuscationGuard <= 6) {
          field_K = (ResourceArchive) null;
        }
        if (this.mouseOver) {
          return this.validationSource.getValidationMessage(-87);
        }
        return null;
    }

    static {
        worldDirectionX = new int[8192];
        field_L = "Cancel";
        invalidEmailMessage = "Please check if address is correct";
        field_Q = "Loading sound effects";
    }
}
