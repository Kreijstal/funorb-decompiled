/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchScreen extends AppScreen {
    private ClubState field_n;
    int localSeat;
    boolean field_A;
    CommonGame matchState;
    private boolean field_D;
    boolean field_v;
    private int field_E;
    private boolean field_y;
    int[] field_z;
    private MatchPhaseView phaseController;
    CommonGame field_i;
    private PlayerStats[] field_k;
    CommonGame field_m;
    boolean field_g;
    boolean field_q;
    int field_B;
    static LoginKind field_w;
    boolean field_s;
    boolean isOnlineMatch;
    private boolean stateReceived;
    static IntrusiveDeque field_j;
    static GameAppletShell field_p;
    static String field_x;
    static Sprite field_l;

    final void offerDraw(int param0) {
        if (!this.isOnlineMatch) {
          throw new IllegalStateException();
        }
        if (!this.isSpectator(-2) &&
          !this.matchState.participantStatus[this.localSeat].resigned) {
          this.sendMatchControl(-16046, 2);
        }
        int var2 = 63 / ((33 - param0) / 49);
    }

    final boolean isGameOverViewShown(byte param0) {
        int var2 = -114 % ((19 - param0) / 39);
        return this.phaseController instanceof GameOverView;
    }

    final static void loadMatchSprites(byte param0, ResourceArchive param1) {
        int var3_int = 0;
        MeshData[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = Kickabout.field_G;
        try {
          LoadingProgressSupport.reportStageProgress(param0 - 15, 5, 1);
          var9 = new String[]{"tank", "striker", "specialist", "scout", "keeper"};
          for (var3_int = 0; var3_int < 5; var3_int++) {
            PacketBuffer.field_m[var3_int] = MeshData.load(param1, "", "Characters/" + var9[var3_int] + "_body");
            for (var4 = 0; var4 < 5; var4++) {
              WidgetContainer.field_v[var3_int][var4] = MeshData.load(param1, "", "Characters/" + var9[var3_int] + "_head_0" + (var4 + 1));
            }
            WriteIntegersCommand.field_B[var3_int] = DualLinkDeque.a(107, new MeshData(new MeshData[]{PacketBuffer.field_m[var3_int], WidgetContainer.field_v[var3_int][0]}, 2));
          }
          LoadingProgressSupport.reportStageProgress(param0 + 111, 5, 2);
          var3 = new MeshData[9];
          var3[0] = MeshData.load(param1, "", "balls/skin_football");
          var3[1] = MeshData.load(param1, "", "balls/skin_beachball");
          var3[2] = MeshData.load(param1, "", "balls/skin_basketball");
          var3[3] = MeshData.load(param1, "", "balls/skin_atom");
          var3[4] = MeshData.load(param1, "", "balls/skin_tennisball");
          var3[5] = MeshData.load(param1, "", "balls/sphere");
          var3[8] = MeshData.load(param1, "", "balls/sphere_halloween");
          var3[6] = MeshData.load(param1, "", "balls/planet2");
          var3[7] = MeshData.load(param1, "", "balls/asteroid_craters_3");
          LoadingProgressSupport.reportStageProgress(-104, 5, 3);
          if (param0 != -34) {
            MatchScreen.releaseStatics(true);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < 9; var4Lifetime1++) {
            if (var4Lifetime1 == 7) {
              var5 = new int[]{1000, -1000, 45, 532};
              var6 = var5[0] * TriangleRasterizer.field_o[0] >> 16;
              var7 = var5[0] * TriangleRasterizer.field_f[0] >> 16;
              EmailSyntaxValidator.field_l[var4Lifetime1] = var3[var4Lifetime1].createModelMesh(var5[2], var5[3], var6, var5[1], var7);
            } else {
              EmailSyntaxValidator.field_l[var4Lifetime1] = (ModelMesh) (var3[var4Lifetime1].createModel(110, 131072, 1, 1, 1));
            }
          }
          LoadingProgressSupport.reportStageProgress(72, 5, 4);
          HuffmanTextSupport.field_f[0] = MeshData.load(param1, "", "fans/fan_01");
          HuffmanTextSupport.field_f[1] = MeshData.load(param1, "", "fans/fan_02");
          HuffmanTextSupport.field_f[2] = MeshData.load(param1, "", "fans/fan_03");
          HuffmanTextSupport.field_f[3] = MeshData.load(param1, "", "fans/fan_04");
          HuffmanTextSupport.field_f[4] = MeshData.load(param1, "", "fans/fan_05");
          FriendRemovalSupport.field_f = MeshData.load(param1, "", "characters/torso");
          RowRangeRequest.field_k = MeshData.load(param1, "", "characters/keeper_body_halloween");
          IndexedSpriteState.field_j = new MeshData[5];
          for (var4Lifetime2 = 0; 5 > var4Lifetime2; var4Lifetime2++) {
            IndexedSpriteState.field_j[var4Lifetime2] = MeshData.load(param1, "", "characters/" + var9[var4Lifetime2] + "_head_halloween");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ap.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean canUsePitchPointer(byte param0) {
        boolean stackIn_16_0 = false;
        if (this.matchState.phase != 4) {
          return false;
        }
        if (param0 != 29) {
          this.canUsePitchPointer((byte) -25);
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.isSpectator(-2) &&
          this.matchState.participantStatus[this.localSeat].isActive(3511) &&
          ArrayWidgetContainer.field_x >= 0 &&
          TutorialCaptionSupport.field_j >= 0 &&
          ArrayWidgetContainer.field_x < 640 &&
          TutorialCaptionSupport.field_j < 480 && (((PlayingView) (this.phaseController)).hasHeldMouseInput((byte) -82) ||
          !ArchiveIndex.b(640))) {
          stackIn_16_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_16_0 = false;
        }
        return stackIn_16_0;
    }

    private final boolean b(byte param0) {
        AppScreen var3;
        boolean stackIn_6_0 = false;
        if (param0 != -73) {
          var3 = (AppScreen) null;
          this.setTransitionProgress(9, true, -127, (AppScreen) null);
        }
        stackIn_6_0 = (this.isSpectator(-2)) && (this.field_A);
        return stackIn_6_0;
    }

    final static void openSupportPage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          if (param1 != 0) {
            field_w = (LoginKind) null;
          }
          try {
            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
            param0.getAppletContext().showDocument(SessionUrlSupport.decorateSessionUrl(param0, var2, param1 ^ 3), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void updateScreen(byte param0, boolean param1) {
        int var5 = 0;
        int stackIn_18_0 = 0;
        int var3;
        int var4;
        int var6;
        int var7;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        var3 = -26 % ((38 - param0) / 60);
        if (!param1 &&
          !this.isOnlineMatch) {
          return;
        }
        if (FadingSoundPlayer.field_q) {
          return;
        }
        if (!this.stateReceived) {
          return;
        }
        if (this.matchState.phase == 4) {
          ((PlayingView) (this.phaseController)).updatePossessionSoundTeam(0);
        }
        this.matchState.processEventQueue((byte) -87);
        this.matchState.field_E.clear(22997);
        this.matchState.tick(4);
        if (this.isOnlineMatch) {
          this.field_i.tick(4);
        }
        SellPlayerDialog.g(-128);
        CheckboxPainter.b(101);
        this.phaseController.updateCamera(true);
        this.phaseController.update(-117, param1);
        if (this.isOnlineMatch &&
          !SquadPickerDialog.field_K) {
          if (this.isSpectator(-2)) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = this.getLocalInputDelay(64);
          }
          var4 = stackIn_18_0;
          for (var5 = 0; var5 < this.matchState.playerCount; var5++) {
            this.announceParticipantStatusChange(var4, 20700, var5);
          }
          this.matchState.a(this.field_i, this.localSeat, var4, -6);
        }
        FullscreenErrorDialog.q(-28033);
        if (this.field_E > 0) {
          this.field_E = this.field_E - 16;
        }
        if (!this.isOnlineMatch) {
          if (2 == this.matchState.phase &&
            this.matchState.field_C.allFormationsConfirmed((byte) 107)) {
            var7 = 0;
            var4Lifetime1 = var7;
            while (var7 < 2) {
              this.matchState.field_r[var7] = this.matchState.field_C.formationChoice[var7];
              var7++;
            }
            this.beginPhase(26415, 3);
          }
          if (this.matchState.phase == 3 &&
            this.matchState.field_o.isReadyOrInactive(-127, 0)) {
            this.beginPhase(26415, 4);
          }
        }
    }

    MatchScreen(boolean param0, PlayerStats[] param1, String[] param2, int param3, boolean param4, boolean param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11, boolean param12, int param13, ClubState param14) {
        super(-1);
        int var17 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var16 = null;
        RuntimeException var16_ref = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        this.field_B = -1;
        this.field_g = true;
        try {
          stackIn_4_1 = (param11);
          this.field_D = stackIn_4_1;
          this.field_k = param1;
          this.localSeat = param3;
          stackIn_7_1 = (param0);
          this.isOnlineMatch = stackIn_7_1;
          stackIn_10_1 = (param12);
          this.field_y = stackIn_10_1;
          stackIn_13_1 = (param5);
          this.field_q = stackIn_13_1;
          this.field_B = param13;
          stackIn_16_1 = (param10);
          this.field_A = stackIn_16_1;
          this.field_n = param14;
          QuickChatCategoryCache.field_e = false;
          stackIn_19_1 = (param4);
          this.field_s = stackIn_19_1;
          var21 = WelcomeDialog.field_F;
          var20 = var21;
          var19 = var20;
          var16 = var19;
          for (var17 = 0; var17 < 8; var17++) {
            var21[var17] = 0;
          }
          this.field_z = new int[param2.length];
          this.matchState = new CommonGame(param2, param6, param7, param8, param9, this.field_A, this.field_D, this.field_y, this.field_s);
          if (this.isOnlineMatch) {
            this.field_i = new CommonGame(this.matchState);
            this.field_m = new CommonGame(this.matchState);
          } else {
            this.matchState.disableOpponent = true;
          }
          GoalkeeperAiSupport.initializeFadingChat(ServerMessageScreen.field_E, -448);
          LoginPacketSupport.configureParticipantNamePanel(this.matchState, (byte) -85, this.localSeat, this.isOnlineMatch);
          this.stateReceived = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16_ref = decompiledCaughtException;
          stackIn_29_0 = var16_ref;
          stackIn_29_1 = new StringBuilder().append("ap.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void captureFadeSnapshot(int param0) {
        if (param0 != 9) {
          this.leaveMatch(true, 17);
        }
        if (null != this.phaseController) {
          PacketBuffer.a(-44, WorldSpriteSequence.field_h);
          LookupRecordUpdate.a((byte) -48);
          this.drawScreen(-5, false);
          TeamManagementScreen.e(122);
          this.field_E = 256;
        }
    }

    final void leaveMatch(boolean param0, int param1) {
        if (param1 != 18) {
          this.resign(27);
        }
        ScrollBar.k(0);
        if (this.isSpectator(param1 ^ -20)) {
          return;
        }
        if (!this.isOnlineMatch) {
          ServerTextTemplate.a(0, 115);
          DelayedServerPacket.a(18, param0, -2);
        }
    }

    final void c(byte param0) {
        if (param0 != 80) {
          return;
        }
        if (!this.stateReceived) {
          return;
        }
        if (this.isOnlineMatch &&
          this.matchState.phase != 0) {
          this.phaseController.drawTeamParticipantPanels(150, param0 ^ 17789);
          return;
        }
    }

    final IntrusiveDeque getGameOverEntries(byte param0) {
        int var2 = -22 % ((param0 + 66) / 57);
        if (!this.isGameOverViewShown((byte) -59)) {
          return null;
        }
        return ((GameOverView) (this.phaseController)).h(-19510);
    }

    final void readParticipantPingTimes(int param0, CipherPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != -21573) {
            return;
          }
          for (var3_int = 0; this.matchState.playerCount > var3_int; var3_int++) {
            this.field_z[var3_int] = param1.readUnsignedShort((byte) 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ap.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void announceParticipantStatusChange(int param0, int param1, int param2) {
        ParticipantStatus var5;
        Object var6;
        ParticipantStatus var7;
        var7 = this.matchState.participantStatus[param2];
        var5 = this.field_i.participantStatus[param2];
        if (var7.a(-93, var5, param0, this.localSeat)) {
          return;
        }
        var6 = null;
        if (param1 != 20700) {
          return;
        }
        if (!var7.departed &&
          var5.departed) {
          if (!var7.resigned &&
            var5.resigned) {
            var6 = ClientProtocolStage.field_e;
          } else {
            var6 = ValidatedTextWidget.field_F;
          }
        } else if (!var7.resigned &&
          var5.resigned) {
          var6 = AccountChoicePanel.field_L;
        } else {
          if (!var7.offerDraw &&
            var5.offerDraw) {
            var6 = WidgetTheme.field_q;
          }
        }
        if (var6 != null) {
          RenderedFootballer.a(LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, (String) (var6), new String[]{this.matchState.field_S[param2]}), false, (byte) -108);
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -21660) {
          this.field_q = true;
        }
        stackIn_6_0 = (this.b((byte) -73)) && (this.field_v);
        return stackIn_6_0;
    }

    private final void a(int param0, int[] param1, boolean param2, int[] param3, int[] param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = -param0 + 1;
          var7 = AnimationSkeleton.field_g[param4[var6_int]].a(-1) ? 1 : 0;
          if (param2) {
            return;
          }
          var8 = AnimationSkeleton.field_g[param4[param0]].a(-1) ? 1 : 0;
          if (var7 == 0) {
            stackIn_5_0 = param1[var6_int];
          } else {
            stackIn_5_0 = param3[var6_int];
          }
          var9 = stackIn_5_0;
          if (var8 == 0) {
            stackIn_8_0 = param1[param0];
          } else {
            stackIn_8_0 = param3[param0];
          }
          var10 = stackIn_8_0;
          if (Math.abs((15 & var10) - (15 & var9)) <= 1 &&
            (var10 & 16) == (16 & var9)) {
            var11 = var10 ^ 16;
            if (var8 == 0) {
              param1[param0] = var11;
              return;
            }
            param3[param0] = var11;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ap.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void setTransitionProgress(int param0, boolean param1, int param2, AppScreen param3) {
        try {
          if (param2 > -28) {
            this.c((byte) 62);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ap.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          ResourceArchive var2 = (ResourceArchive) null;
          MatchScreen.loadMatchSprites((byte) 13, (ResourceArchive) null);
        }
        field_l = null;
        field_j = null;
        field_x = null;
        field_w = null;
    }

    final void applyGameOverTrainingAction(int param0, ManagerAction param1, byte param2, int param3) {
        if (!this.isGameOverViewShown((byte) -68)) {
          return;
        }
        try {
          ((GameOverView) (this.phaseController)).applyTrainingAction(1, param1, param0, param3);
          if (param2 > -71) {
            this.field_v = true;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ap.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawScreen(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        BinaryBitmapFont var3_ref_uo;
        PlayArea[] var3_ref_la__;
        int var3;
        int var4;
        PlayArea var5;
        int var6;
        PlayArea[] var7;
        PlayArea[] var8;
        int var4Lifetime1;
        int var4Lifetime2;
        PlayArea[] var3_ref_la__Lifetime1;
        PlayArea var5Lifetime1;
        var6 = Kickabout.field_G;
        if (param0 != ~this.matchState.phase) {
          MidiPcmStream.drawGoalScenery(true, (byte) -114);
          MidiPcmStream.drawGoalScenery(false, (byte) -114);
        }
        if (!this.stateReceived) {
          var3_ref_uo = IsSixCommand.field_C;
          var4 = 90 + ((BitmapFont) ((Object) var3_ref_uo)).stringWidth(AuctionListingDialog.field_K) >> 1;
          SoftwareRasterizer.fillRoundedRectangleBlended(320 - var4, 223, var4 + var4, 34, 6, 65793, 128);
          ((BitmapFont) ((Object) var3_ref_uo)).drawCentered(AuctionListingDialog.field_K, 320, 246, 16777215, -1);
          return;
        }
        this.phaseController.drawContent(1);
        if ((1 & PendingRequestAcknowledgement.field_j) != 0) {
          var7 = this.matchState.field_B;
          var3_ref_la__ = var7;
          for (var4Lifetime1 = 0; var7.length > var4Lifetime1; var4Lifetime1++) {
            var5 = var7[var4Lifetime1];
            var5.a(-2943, 16777215);
          }
        }
        if ((PendingRequestAcknowledgement.field_j & 2) != 0) {
          var8 = this.matchState.field_x;
          var3_ref_la__Lifetime1 = var8;
          for (var4Lifetime2 = 0; var4Lifetime2 < var8.length; var4Lifetime2++) {
            var5Lifetime1 = var8[var4Lifetime2];
            var5Lifetime1.a(-2943, 16711680);
          }
        }
        TutorialCaptionSupport.drawTutorialCaption((byte) -121);
        if (0 < this.field_E) {
          WorldSpriteSequence.field_h.b(0, 0, this.field_E);
        }
        if (!MyKitScreen.field_O) {
          if (this.phaseController instanceof PlayingView) {
            stackIn_24_0 = (((PlayingView) (this.phaseController)).field_l) ? 1 : 0;
          } else {
            stackIn_24_0 = 0;
          }
          var3 = stackIn_24_0;
          MatchHudRoutingSupport.drawMatchHud((byte) 96, var3 != 0, this.field_z);
        }
        SquadGridWidget.b(-109);
    }

    private final void createPhaseController(int param0) {
        if (0 == this.matchState.phase) {
          this.phaseController = (MatchPhaseView) ((Object) new TeamSelectionView(this.matchState, this.localSeat, this.isOnlineMatch));
        }
        if (param0 == ~this.matchState.phase) {
          this.phaseController = (MatchPhaseView) ((Object) new WaitForPlayersView(this.matchState, this.localSeat, this.isOnlineMatch));
        }
        if (this.matchState.phase == 2) {
          this.phaseController = (MatchPhaseView) ((Object) new FormationView(this.matchState, this.localSeat, this.isOnlineMatch));
        }
        if (this.matchState.phase == 3) {
          this.phaseController = (MatchPhaseView) ((Object) new LineupView(this.matchState, this.localSeat, this.isOnlineMatch, this.field_k));
        }
        if (this.matchState.phase == 4) {
          this.phaseController = (MatchPhaseView) ((Object) new PlayingView(this.matchState, this.localSeat, this.field_i, this.isOnlineMatch, this.field_s));
        }
        if (this.matchState.phase == 5) {
          this.phaseController = (MatchPhaseView) ((Object) new GameOverView(this.matchState, this.localSeat, this.isOnlineMatch));
        }
    }

    private final void sendMatchControl(int param0, int param1) {
        if (param0 != -16046) {
          field_x = (String) null;
        }
        if (this.isOnlineMatch) {
          FootballerAiOverlaySupport.field_d.b(75, (byte) 112);
          FootballerAiOverlaySupport.field_d.writeByte(118, param1);
        }
    }

    final void rebuildWorldDrawList(byte param0, IntrusiveDeque param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.phaseController instanceof PlayingView) {
            ((PlayingView) (this.phaseController)).rebuildWorldDrawList(param1, (byte) -82);
          }
          if (param0 >= -111) {
            this.field_n = (ClubState) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ap.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void beginPhase(int param0, int param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var3Lifetime1;
        if (param0 != 26415) {
          this.leaveMatch(false, -22);
        }
        this.stateReceived = true;
        this.captureFadeSnapshot(9);
        this.matchState.enterPhase(param1, (byte) -81);
        this.createPhaseController(-2);
        this.matchState.phaseTime = -1;
        if (2 == this.matchState.phase) {
          this.matchState.enqueueEvent(SquadGridWidget.createFormationEvent(2, 1, (byte) 0), -127);
        }
        if (this.matchState.phase == 3) {
          for (var3 = 0; 4 > var3; var3++) {
            this.matchState.field_i[1][var3] = 1;
          }
          for (var3Lifetime1 = 0; 4 > var3Lifetime1; var3Lifetime1++) {
            this.matchState.field_o.autoSelectPlayer(this.field_n, this.field_k, (byte) -85, var3Lifetime1, 1);
          }
        }
    }

    final boolean handleKey(int param0, int param1, char param2) {
        int var4 = 0;
        if (13 == param0) {
          var4 = 1;
          if (this.isOnlineMatch) {
            var4 = 2;
            if (this.field_A) {
              var4 = 3;
            }
            if (!this.isSpectator(-2) &&
              this.matchState.phase != 5 &&
              this.matchState.participantStatus[this.localSeat].isActive(3511)) {
              DelayedServerPacket.a(var4, false, -2);
              return true;
            }
            var4 = 5;
            if (this.field_A) {
              var4 = 6;
            }
          }
          DelayedServerPacket.a(var4, false, -2);
          return true;
        }
        if (param0 == ClassDescriptorSupport.field_h) {
          QuickChatCategoryCache.field_e = !QuickChatCategoryCache.field_e ? true : false;
        }
        if (param1 > -5) {
          return false;
        }
        if (param0 == SocialListProtocolSupport.field_b) {
          LoginMethod.field_d = !LoginMethod.field_d ? true : false;
        }
        if (!this.stateReceived) {
          return false;
        }
        return this.phaseController.handleKey(param2, 1670, param0);
    }

    final void rebuildRenderedMatch(int param0) {
        if (this.phaseController instanceof PlayingView) {
          ((PlayingView) (this.phaseController)).rebuildRenderedMatch(-105);
        }
        int var2 = 109 / ((param0 - 6) / 37);
    }

    private final int getLocalInputDelay(int param0) {
        if (param0 < 16) {
          field_l = (Sprite) null;
        }
        return 5 + this.field_z[this.localSeat] / 20;
    }

    final void readMatchState(byte param0, CipherPacketBuffer param1) {
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        LoggedGoal var6_ref_ch = null;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var3_intLifetime1;
        var7 = Kickabout.field_G;
        try {
          this.stateReceived = true;
          this.captureFadeSnapshot(9);
          this.field_i.a(param1, this.localSeat, param0 ^ -18);
          this.field_m.copyStateFrom(this.field_i, (byte) 77);
          if (this.field_i.phase > 0) {
            stackIn_4_0 = 1;
            if (this.isSpectator(param0 ^ 17)) {
              stackIn_5_1 = 0;
            } else {
              stackIn_5_1 = this.field_i.field_g[this.localSeat].team;
            }
            var3_int = stackIn_4_0 - stackIn_5_1;
            this.a(var3_int, this.field_i.field_d, false, this.field_i.field_Q, this.field_i.field_H);
          }
          this.matchState.copyStateFrom(this.field_i, (byte) 122);
          this.createPhaseController(-2);
          if (param0 != -17) {
            this.field_n = (ClubState) null;
          }
          if (this.matchState.phase > 0 &&
            this.matchState.phase < 5 && (RankingsScreen.field_C != this.matchState.tier ||
            FormationMaskSupport.field_c != this.matchState.surface ||
            !NanoTickClock.field_n)) {
            StringCursor.a(true, (byte) -125, this.matchState.tier, this.matchState.surface);
          }
          if (5 == this.matchState.phase &&
            param1.readUnsignedByte((byte) -113) == 1) {
            ((GameOverView) (this.phaseController)).field_u = new int[2];
            ((GameOverView) (this.phaseController)).field_u[0] = param1.readUnsignedByte((byte) -113);
            ((GameOverView) (this.phaseController)).field_u[1] = param1.readUnsignedByte((byte) -116);
            var3_intLifetime1 = param1.readUnsignedByte((byte) -125);
            ((GameOverView) (this.phaseController)).field_k = new int[var3_intLifetime1];
            for (var4 = 0; var3_intLifetime1 > var4; var4++) {
              ((GameOverView) (this.phaseController)).field_k[var4] = param1.readUnsignedByte((byte) -109);
            }
            ((GameOverView) (this.phaseController)).field_bb.clear(22997);
            ((GameOverView) (this.phaseController)).field_q.clear(22997);
            var4Lifetime1 = param1.readUnsignedShort((byte) 81);
            for (var5 = 0; var4Lifetime1 > var5; var5++) {
              var6_ref_ch = new LoggedGoal();
              var6_ref_ch.readFromBuffer(param1, (byte) -79);
              if (0 != var6_ref_ch.field_f) {
                ((GameOverView) (this.phaseController)).field_q.addLast(var6_ref_ch, 3);
              } else {
                ((GameOverView) (this.phaseController)).field_bb.addLast(var6_ref_ch, 3);
              }
            }
            var3_intLifetime1 = param1.readUnsignedByte((byte) -120);
            ((GameOverView) (this.phaseController)).field_p = new int[var3_intLifetime1][4];
            ((GameOverView) (this.phaseController)).field_ab = new int[var3_intLifetime1][4];
            for (var5Lifetime1 = 0; var3_intLifetime1 > var5Lifetime1; var5Lifetime1++) {
              for (var6 = 0; var6 < 4; var6++) {
                ((GameOverView) (this.phaseController)).field_p[var5Lifetime1][var6] = param1.readUnsignedMedium(-95);
              }
            }
            for (var5Lifetime2 = 0; var5Lifetime2 < var3_intLifetime1; var5Lifetime2++) {
              for (var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
                ((GameOverView) (this.phaseController)).field_ab[var5Lifetime2][var6Lifetime1] = param1.readUnsignedMedium(-98);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("ap.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final boolean isSpectator(int param0) {
        if (param0 != -2) {
          this.field_i = (CommonGame) null;
        }
        return this.localSeat == -2 ? true : false;
    }

    final void resign(int param0) {
        if (param0 > -10) {
          IntrusiveDeque var3 = (IntrusiveDeque) null;
          this.rebuildWorldDrawList((byte) -89, (IntrusiveDeque) null);
        }
        if (!this.isOnlineMatch) {
          throw new IllegalStateException();
        }
        if (!this.isSpectator(-2) &&
          !this.matchState.participantStatus[this.localSeat].resigned) {
          this.sendMatchControl(-16046, 1);
        }
    }

    static {
        field_w = new LoginKind(2);
        field_j = new IntrusiveDeque();
        field_p = null;
        field_x = "OK";
    }
}
