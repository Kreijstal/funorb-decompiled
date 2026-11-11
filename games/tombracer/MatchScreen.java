/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MatchScreen extends GameScreen implements rqa {
    private int[] actionHoldTicks;
    MatchState matchState;
    private MatchProtocol protocol;
    static UiComponent field_F;
    int localPlayerIndex;
    private IntrusiveDeque overlays;
    static SpriteData field_q;
    private boolean[][] actionStates;
    private boolean[] courseResultAnnounced;
    private int viewedPlayerIndex;
    private boolean field_s;
    boolean field_D;
    private MatchPhase phase;
    private int[] field_o;
    private int[] pingTimes;
    private PlayerInputQueue[] inputQueues;
    private int field_i;
    private TutorialHints field_n;
    boolean field_A;
    int roundDeadlineTick;
    private boolean hasMessageOverlay;
    private long field_m;
    private int field_j;
    private int field_E;
    private boolean pausedByOverlay;
    private boolean field_p;
    SoundEventPlayer[] soundPlayers;

    final void initPlayers(byte param0) {
        int var3 = 0;
        int var7 = 0;
        int var2;
        Player var4;
        FollowCamera var5;
        SoundEventPlayer var6;
        Room var8;
        int var9;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = this.matchState.players.length;
        this.soundPlayers = new SoundEventPlayer[var2];
        if (param0 >= -45) {
          return;
        }
        for (var3 = 0; var2 > var3; var3++) {
          var4 = this.matchState.players[var3];
          if (var4 != null) {
            var4.setAnimator(-27496, new PlayerModel(var4, var3));
            this.matchState.characterChoices[var3].setPlayer(11008, var4);
            var5 = new FollowCamera();
            var5.setTarget(var4, -1);
            this.matchState.simulations[var3].createScenes(var5, -1);
            var6 = new SoundEventPlayer();
            this.soundPlayers[var3] = var6;
            if (var3 != this.getViewedPlayerIndex(103) ||
              this.isMenuBackgroundDemo((byte) 33)) {
              var6.setMuted(true, 0);
            }
            for (var7 = 0; this.matchState.simulations[var3].rooms.length > var7; var7++) {
              var8 = this.matchState.simulations[var3].rooms[var7];
              if (var8 != null) {
                var8.getScene((byte) 106).setListener(-28265, new RoomLighting(var8));
                var8.setSoundQueue(4855, var6);
              }
            }
          }
        }
        return;
    }

    private final void clearOverlays(byte param0) {
        this.overlays.clear(8);
        if (param0 != 99) {
          this.field_i = 64;
        }
        this.hasMessageOverlay = false;
    }

    private final void setPhase(int param0, MatchPhase param1) {
        try {
          RaceStandings.releaseAllSounds(18916);
          if (param0 != 6) {
            this.update(false, true, 46);
          }
          this.phase = param1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qh.GB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getViewedPlayerIndex(int param0) {
        if (param0 <= 74) {
          return -54;
        }
        return this.viewedPlayerIndex;
    }

    final void update(boolean param0, boolean param1, int param2) {
        int var4;
        int var5;
        MatchOverlay var6;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        msa.field_a = this.getViewedPlayerIndex(95);
        if (this.isSpectating((byte) 65) &&
          this.matchState.hasResigned((byte) -90, this.getViewedPlayerIndex(94))) {
          this.cycleViewedPlayer(1, 17219);
        }
        if (!this.isMenuBackgroundDemo((byte) 33) &&
          !this.field_D) {
          if (!param1) {
            return;
          }
          if (!param0) {
            return;
          }
        }
        this.updateInputStates(param1, param0, false);
        if (this.field_s) {
          return;
        }
        if (param2 != 15283) {
          return;
        }
        if (this.phase != null) {
          this.phase.update(80, param1);
        }
        this.pausedByOverlay = false;
        var6 = (MatchOverlay) (this.overlays.first(-80));
        while (var6 != null) {
          var6.update((byte) -120);
          if (!var6.isFinished((byte) -121)) {
            if (var6.pausesGame(true)) {
              this.pausedByOverlay = true;
            }
          } else {
            this.removeOverlay(-19805, var6);
          }
          var6 = (MatchOverlay) (this.overlays.next(param2 - 15171));
        }
        if (null != this.field_n) {
          this.field_n.showQueuedHints((byte) 44);
        }
        if (this.isMenuBackgroundDemo((byte) 33)) {
          return;
        }
        if (!this.field_D) {
          this.setTrackedScore(this.matchState.players[0].getScore(param2 - 15179), param2 + 7821);
          this.setTrackedRoomResult(this.matchState.field_g[0], 5, this.matchState.field_F[0]);
          var4 = uca.cosmeticRandom.nextBounded(7, param2 - 15283);
          PlayerViewport.field_b = PlayerViewport.field_b + var4;
          MonsterRemains.field_h = MonsterRemains.field_h + var4;
          var4Lifetime1 = uca.cosmeticRandom.nextBounded(7, 0);
          CommonChooseReward.field_b = CommonChooseReward.field_b + (long)var4Lifetime1;
          ClientMemoryVertexArray.field_f = ClientMemoryVertexArray.field_f + (long)var4Lifetime1;
        }
        if (this.protocol == null) {
          if (3 != this.matchState.gameMode) {
            if (this.matchState.field_I[this.localPlayerIndex]) {
              hba.sendRoomResult(this.field_E, this.field_m, (byte) 64, this.field_i);
              this.matchState.field_I[this.localPlayerIndex] = false;
            }
            if (this.matchState.getSimulation(this.localPlayerIndex, 0).isFinished(0)) {
              if (this.field_p) {
                return;
              }
              PlayerInputQueue.a(this.matchState.players[this.localPlayerIndex].getDeathCount((byte) -125), this.field_E, (byte) 114);
              this.field_p = true;
            }
          }
        } else {
          this.protocol.pumpActions(this, 1);
        }
        return;
    }

    private final void resetInputs(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (null != this.protocol) {
          this.protocol.reset(true);
        }
        for (var2 = 0; var2 < this.matchState.players.length; var2++) {
          this.inputQueues[var2].clear(false);
        }
        if (param0 != -1) {
          MatchScreen.releaseStatics(false);
        }
    }

    private final void concludeMatch(boolean param0, byte param1) {
        int var4;
        boolean stackIn_8_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_D) {
          if (!this.isSpectating((byte) 69) &&
            !this.matchState.matchOver) {
            this.sendLeaveMatch(1);
          }
        } else {
          if (TextWidgetPainter.a(80)) {
            GameClock.field_b = qca.hasNonZeroEntry((byte) 13, CharacterChoiceFactory.field_e);
            stackIn_8_0 = !(this.getTrackedScore((byte) 19) <= 0);
            uma.field_c = stackIn_8_0;
            SoftwareTransform3D.field_p = stackIn_8_0;
            if (this.matchState.gameMode != 3 && (GameClock.field_b ||
              uma.field_c ||
              SoftwareTransform3D.field_p)) {
              ConstrainToRectangleLocomotor.showMenuScreen(param0, 10, (byte) 106);
              decompiledFrameRemainder0 = false;
            }
            else {
              ConstrainToRectangleLocomotor.showMenuScreen(param0, 9, (byte) 91);
            }
          } else {
            if (this.matchState.gameMode == 3) {
              ConstrainToRectangleLocomotor.showMenuScreen(param0, 0, (byte) 82);
            } else {
              this.submitScore(-18570);
              ConstrainToRectangleLocomotor.showMenuScreen(param0, 9, (byte) -62);
            }
          }
        }
        this.field_s = true;
        this.clearOverlays((byte) 99);
        this.setPhase(6, (MatchPhase) null);
        if (param1 >= -75) {
          this.soundPlayers = (SoundEventPlayer[]) null;
        }
    }

    final void onDeactivated(int param0) {
        if (param0 > -102) {
          this.c(false);
        }
    }

    final void startTutorial(byte param0) {
        this.field_n = new TutorialHints(this);
        if (param0 <= 11) {
          return;
        }
        ToolkitInstance.field_c.disableWithPanel(114);
        this.matchState.characterChoices[this.localPlayerIndex].setCharacter(0, (byte) 37);
        this.startRound(106);
    }

    private final void updateInputStates(boolean param0, boolean param1, boolean param2) {
        int var7 = 0;
        boolean[] var4;
        int var5;
        int var6;
        int var8;
        boolean[] var9;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param2) {
          this.draw((byte) 23, true);
        }
        boolean decompiledFrameRemainder0 = true;
        var9 = VerticalScrollbar.field_tb;
        var4 = var9;
        if (param0 &&
          param1 &&
          !ToolkitInstance.field_c.isPanelActive(-8832) && (BeamShooterBehaviour.isScreenActive(-67, -1) ||
          this.c(false))) {
          this.actionStates[0][0] = var9[HardwareOpenGlToolkit.field_hd];
          this.actionStates[0][1] = var9[mf.field_a];
          this.actionStates[0][2] = var9[ConsoleToken.field_k];
          this.actionStates[0][3] = var9[TextureCombineSource.field_a];
          this.actionStates[0][4] = var9[gsa.field_j];
          this.actionStates[0][7] = var9[MonochromeRowCache.field_i];
          this.actionStates[0][5] = var9[PlantModel.field_o];
          this.actionStates[0][8] = var9[MidiVoice.field_g];
          this.actionStates[0][6] = var9[hra.field_b];
          this.actionStates[1][1] = var9[97];
          this.actionStates[1][0] = var9[96];
          this.actionStates[1][7] = var9[85];
          this.actionStates[1][2] = var9[98];
          this.actionStates[1][3] = var9[99];
          decompiledFrameRemainder0 = false;
        }
        else {
          for (var5 = 0; this.actionStates.length > var5; var5++) {
            for (var6 = 0; var6 < this.actionStates[var5].length; var6++) {
              this.actionStates[var5][var6] = false;
            }
          }
        }
        for (var5Lifetime1 = 0; var5Lifetime1 < 9; var5Lifetime1++) {
          var6Lifetime1 = 0;
          for (var7 = 0; this.actionStates.length > var7; var7++) {
            if (var6Lifetime1 == 0) {
              var6Lifetime1 = (this.actionStates[var7][var5Lifetime1]) ? 1 : 0;
            } else {
              var6Lifetime1 = 1;
            }
          }
          if (var6Lifetime1 != 0) {
            this.actionHoldTicks[var5Lifetime1] = this.actionHoldTicks[var5Lifetime1] + 1;
          } else {
            this.actionHoldTicks[var5Lifetime1] = 0;
          }
        }
    }

    MatchScreen(boolean param0, int param1, String[] param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, BitSet[] param10, boolean[] param11, CourseGenerator param12) {
        super(-1);
        int var15_int = 0;
        int var16 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        Object var15 = null;
        Player var17 = null;
        this.field_s = false;
        this.overlays = new IntrusiveDeque();
        this.field_A = false;
        this.hasMessageOverlay = false;
        this.roundDeadlineTick = -1;
        this.field_p = false;
        this.pausedByOverlay = false;
        try {
          if (param9 >= 0 && (!mca.isCourseAvailable((byte) 6, param9) ||
            !BrickOperator.isCourseAccessible(-74, param9))) {
            throw new IllegalStateException("CA:" + param9);
          }
          this.field_E = param9;
          this.localPlayerIndex = param3;
          MandelbrotOperator.field_o = null;
          ConsoleToken.field_o = false;
          stackIn_8_1 = (param0);
          this.field_D = stackIn_8_1;
          var14_int = param2.length;
          this.actionHoldTicks = new int[9];
          this.actionStates = new boolean[2][9];
          for (var15_int = 0; var15_int < this.actionHoldTicks.length; var15_int++) {
            this.actionHoldTicks[var15_int] = 5;
          }
          this.pingTimes = new int[var14_int];
          if (MatchState.h(1)) {
            if (!this.field_D) {
              var15 = new StatReportingObserverFactory();
            } else {
              var15 = new PlainScoringObserverFactory();
            }
            this.matchState = new MatchState(param2, param1, param5, param6, param7, param8, this.field_E, param10, param11, (ScoringObserverFactory) (var15), param12);
            if (!param0) {
              this.matchState.startRound((byte) -89);
            }
            this.inputQueues = new PlayerInputQueue[var14_int];
            this.matchState.field_x = null;
            for (var16 = 0; var16 < var14_int; var16++) {
              var17 = this.matchState.players[var16];
              if (var17 != null) {
                this.inputQueues[var16] = new PlayerInputQueue();
              }
            }
          }
          if (this.field_D) {
            this.protocol = new MatchProtocol(this.localPlayerIndex, var14_int);
          }
          this.field_o = new int[var14_int];
          this.courseResultAnnounced = new boolean[var14_int];
          ArchiveNetworkClient.field_b = null;
          if (!this.isSpectating((byte) 64)) {
            this.viewedPlayerIndex = this.localPlayerIndex;
          } else {
            this.viewedPlayerIndex = 0;
          }
          msa.field_a = this.getViewedPlayerIndex(92);
          C2SActionPacket.field_j = -1;
          this.field_p = false;
          uca.field_a = -1;
          ListTracksCommand.field_o = 617;
          Transform3D.field_b = 9170;
          ti.field_b = 8768;
          lu.field_a = 5180;
          CommonChooseReward.field_b = 1180282300L;
          MidiVoiceMixer.field_j = 17219L;
          PlayerViewport.field_b = 1727002282;
          MonsterRemains.field_h = -2073743619;
          PlayTrackCommand.field_o = 17825;
          ClientMemoryVertexArray.field_f = 2023746978L;
          nb.field_c = 22238L;
          OpenGlToolkit.field_Z = 22238;
          if (!this.field_D &&
            3 != param8 &&
            this.field_E >= 0 &&
            10 > this.field_E &&
            !this.isMenuBackgroundDemo((byte) 33)) {
            aqa.a(this.field_E, (byte) 120);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_36_0 = var14;
          stackIn_36_1 = new StringBuilder().append("qh.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param11 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param12 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final void queuePlayerInput(int param0, int param1, boolean param2) {
        if (param2) {
          this.field_D = false;
        }
        this.inputQueues[param1].push(79, param0);
    }

    private final void sendLeaveMatch(int param0) {
        if (param0 != 1) {
          this.setTrackedScore(-31, 0);
        }
        ql.field_k.writeCipheredOpcode(66, param0 ^ -2987);
    }

    final void startMenuBackgroundDemo(byte param0) {
        Player var2 = this.matchState.players[0];
        if (param0 != -25) {
          this.pausedByOverlay = true;
        }
        var2.setInvulnerable(true, true);
        this.initPlayers((byte) -99);
        this.startRound(param0 ^ 102);
    }

    final void decodePingTimes(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 < 91) {
            this.pausedByOverlay = false;
          }
          for (var3_int = 0; this.pingTimes.length > var3_int; var3_int++) {
            this.pingTimes[var3_int] = param1.readUnsignedShort(124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qh.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int findPlayerIndex(boolean param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.matchState.findPlayerIndex(param1, (byte) 114);
            return stackIn_4_0;
          }
          stackIn_2_0 = 127;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qh.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean isActionJustPressed(int param0, int param1) {
        if (param0 != 0) {
          this.pausedByOverlay = true;
        }
        return this.actionHoldTicks[param1] == 1 ? true : false;
    }

    final void startRound(int param0) {
        int var2;
        Room var3;
        int var4;
        int var2Lifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        this.clearOverlays((byte) 99);
        this.setPhase(6, new PlayPhase(this, this.protocol));
        for (var2 = 0; this.courseResultAnnounced.length > var2; var2++) {
          this.courseResultAnnounced[var2] = false;
          var3 = this.matchState.players[var2].getRoom((byte) -73);
          if (var3 != null) {
            var3.restart((byte) -75);
          }
        }
        if (this.field_n != null) {
          this.field_n.reset((byte) -121);
        }
        var2Lifetime1 = -116 / ((param0 - 23) / 54);
    }

    private final boolean isScoreInvalidated(byte param0) {
        if (param0 < 40) {
          return false;
        }
        return ConsoleToken.field_o;
    }

    public static void releaseStatics(boolean param0) {
        field_F = null;
        if (param0) {
          String var2 = (String) null;
          MatchScreen.validateDigits(-7, (String) null);
        }
        field_q = null;
    }

    final void decodeInitialState(int param0, BitPacketBuffer param1) {
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        int[][] var10 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          param1.beginBitAccess((byte) -94);
          this.matchState.decode(param1, false);
          param1.endBitAccess((byte) 98);
          this.initPlayers((byte) -115);
          if (!this.matchState.isAwaitingFirstTick(0)) {
            this.protocol.a((byte) 126);
          }
          if (param0 < 92) {
            this.cycleViewedPlayer(-34, -99);
          }
          if (!this.matchState.allCharactersChosen(14)) {
            this.showCharacterSelect((byte) 120);
          } else {
            if (this.matchState.declaredWinner < 0) {
              if (this.matchState.allFinishedRound(0)) {
                var10 = new int[this.matchState.playerCount][3];
                for (var4 = 0; this.matchState.playerCount > var4; var4++) {
                  for (var5 = 0; 3 > var5; var5++) {
                    var10[var4][var5] = this.matchState.players[var4].getTreasure(196608, var5);
                  }
                }
                this.showResults(var10, -9);
                return;
              }
              this.startRound(102);
            } else {
              this.showStandings(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qh.UB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void setActionHoldTicks(boolean param0, int param1, int param2) {
        this.actionHoldTicks[param2] = -param1;
        if (!param0) {
          this.field_A = false;
        }
    }

    final void announceLeftPlayers(int param0, byte param1) {
        int var3 = 0;
        int var5;
        FloatingMessage var4;
        String var6;
        var5 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; var3 < this.matchState.players.length; var3++) {
          if (!this.matchState.hasLeft(param1 ^ -28, var3) &&
            (1 << var3 & param0) > 0) {
            this.matchState.markLeft((byte) -95, var3);
            var4 = BannerCommand.createBannerMessage(LegacyOpenGlFlowingWaterEffect.formatText(87, RemovedFromGameMenu.field_r, new String[]{this.getPlayerName(var3, false)}), (byte) -72);
            ToolkitInstance.field_c.addMessageNow(param1 + 23, var4);
          }
        }
        if (param1 != -23) {
          var6 = (String) null;
          MatchScreen.validateDigits(-21, (String) null);
        }
    }

    final void onMatchWinner(byte param0, int param1) {
        if (param0 != -54) {
          return;
        }
        if (param1 != this.matchState.getMatchWinner((byte) 91)) {
          this.showMatchResult(param1, 108);
        }
    }

    final void endMatch(boolean param0, boolean param1, int param2) {
        Player var4 = null;
        if (this.field_s) {
          return;
        }
        if (!this.field_D &&
          this.localPlayerIndex == 0) {
          var4 = this.matchState.players[this.localPlayerIndex];
          if (!var4.getSimulation(-1).isCourseComplete(0)) {
            SectorCacheStore.sendRoomAbandonedStat(var4.getRoom((byte) -127), 64, this.matchState);
          }
        }
        if (param2 != 0) {
          this.onDeactivated(115);
        }
        if (!param1) {
          this.setPhase(6, new StandingsPhase(this, this.protocol));
        } else {
          this.concludeMatch(param0, (byte) -89);
        }
    }

    final boolean f(int param0, int param1) {
        if (null == this.protocol) {
          return true;
        }
        if (param0 != -12963) {
          return true;
        }
        return this.protocol.a(param1, param0 ^ -13022);
    }

    final void clearPlayerInputs(int param0, int param1) {
        if (param1 <= 15) {
          this.field_E = 44;
        }
        this.inputQueues[param0].clear(false);
    }

    final int getCharacterChoice(int param0, int param1) {
        if (param1 != 9) {
          return 65;
        }
        return this.matchState.characterChoices[param0].getCharacter(param1 ^ 68);
    }

    final boolean isPausedByOverlay(int param0) {
        if (param0 < 109) {
          this.field_j = -75;
        }
        return this.pausedByOverlay;
    }

    final void cycleViewedPlayer(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != 17219) {
          return;
        }
        var3 = this.getViewedPlayerIndex(param1 - 17104);
        if (!this.isSpectating((byte) 91)) {
          return;
        }
        var4 = 0;
        while (var4 == 0) {
          this.viewedPlayerIndex = param0 + this.getViewedPlayerIndex(param1 - 17096);
          if (0 > this.getViewedPlayerIndex(107)) {
            this.viewedPlayerIndex = this.matchState.players.length - 1;
          }
          if (this.getViewedPlayerIndex(114) >= this.matchState.players.length) {
            this.viewedPlayerIndex = 0;
          }
          if (this.matchState.hasResigned((byte) -111, this.getViewedPlayerIndex(127))) {
            continue;
          }
          var4 = 1;
        }
        if (null != this.soundPlayers) {
          this.soundPlayers[var3].setMuted(true, 0);
          this.soundPlayers[this.getViewedPlayerIndex(100)].setMuted(false, param1 ^ 17219);
        }
    }

    final void showRewardChoice(int param0) {
        this.clearOverlays((byte) 99);
        this.setPhase(param0 ^ -7, new RewardChoicePhase(this, this.protocol));
        if (param0 != -1) {
          MatchScreen.releaseStatics(true);
        }
    }

    final void announceResignedPlayers(int param0, int param1) {
        int var3;
        int var5;
        FloatingMessage var4;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param0 != 5) {
          return;
        }
        while (this.matchState.players.length > var3) {
          if (!this.matchState.hasResigned((byte) -93, var3) &&
            (param1 & 1 << var3) > 0) {
            this.matchState.markResigned(param0 ^ 4, var3);
            var4 = BannerCommand.createBannerMessage(LegacyOpenGlFlowingWaterEffect.formatText(84, lu.field_c, new String[]{this.getPlayerName(var3, false)}), (byte) -124);
            ToolkitInstance.field_c.addMessageNow(0, var4);
          }
          var3++;
        }
    }

    private final void setTrackedRoomResult(int param0, int param1, long param2) {
        int var5;
        long var6;
        int var8_int;
        long var8;
        int var9;
        int var10_int;
        long var10;
        int var12;
        int var8_intLifetime1;
        long var8Lifetime1;
        int var9Lifetime1;
        var12 = TombRacer.field_G ? 1 : 0;
        if (!this.matchState.field_I[this.localPlayerIndex]) {
          return;
        }
        var5 = this.field_i;
        var6 = this.field_m;
        var8_int = var5;
        var9 = uca.cosmeticRandom.nextBounded(param1, 0);
        PlayTrackCommand.field_o = PlayTrackCommand.field_o + var8_int * var9;
        OpenGlToolkit.field_Z = OpenGlToolkit.field_Z + var9;
        var8 = var6;
        var10_int = uca.cosmeticRandom.nextBounded(5, 0);
        MidiVoiceMixer.field_j = MidiVoiceMixer.field_j + var8 * (long)var10_int;
        nb.field_c = nb.field_c + (long)var10_int;
        if (param0 == var5) {
          return;
        }
        var8_intLifetime1 = param0;
        var9Lifetime1 = var5;
        if (var8_intLifetime1 != var9Lifetime1) {
          if (uca.cosmeticRandom.nextBounded(2, 0) == 0) {
            MonsterRemains.field_h = MonsterRemains.field_h - OpenGlToolkit.field_Z * (-var9Lifetime1 + var8_intLifetime1);
          } else {
            PlayerViewport.field_b = PlayerViewport.field_b + OpenGlToolkit.field_Z * (var8_intLifetime1 - var9Lifetime1);
          }
        }
        var8Lifetime1 = param2;
        var10 = var6;
        if (~var8Lifetime1 != ~var10) {
          if (0 != uca.cosmeticRandom.nextBounded(2, param1 ^ 5)) {
            ClientMemoryVertexArray.field_f = ClientMemoryVertexArray.field_f + nb.field_c * (var8Lifetime1 - var10);
          } else {
            CommonChooseReward.field_b = CommonChooseReward.field_b - nb.field_c * (-var10 + var8Lifetime1);
          }
        }
        this.field_i = param0;
        this.field_m = param2;
        return;
    }

    private final void processPlayerTick(boolean param0, int param1, int param2) {
        QueuedPlayerEvent var4;
        PendingEvent var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        this.matchState.stepPlayerSimulation(true, param2, param1);
        if (param0) {
          this.protocol = (MatchProtocol) null;
        }
        if (!this.courseResultAnnounced[param1] && (this.matchState.hasFinishedCourse((byte) 90, param1) ||
          this.matchState.hasTimedOut((byte) -117, param1))) {
          this.announceCourseResult(122, param1);
          this.courseResultAnnounced[param1] = true;
        }
        if (!this.field_D) {
          var4 = this.matchState.pollQueuedEvent(true, param1);
          while (var4 != null) {
            var5 = new PendingEvent(var4.getEvent((byte) -125), param1, param1, 50 + this.matchState.simulations[param1].tick, var4.getEvent((byte) -125).getValue((byte) -28), this.matchState.getPlayerCourseIndex(1, param1));
            this.matchState.deliverPendingEvent((byte) 96, var5);
            var4 = this.matchState.pollQueuedEvent(true, param1);
          }
        } else {
          this.matchState.simulations[param1].observer.clearQueuedEvents(-113);
        }
    }

    final boolean isFullScreen(int param0) {
        if (param0 != 31923) {
          return true;
        }
        return false;
    }

    final boolean isMenuBackgroundDemo(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 33) {
          this.announceResignedPlayers(94, 57);
        }
        stackIn_6_0 = (this.matchState != null) && (this.matchState.isMenuBackgroundDemo(param0 ^ -25288));
        return stackIn_6_0;
    }

    final void onActivated(byte param0) {
        if (param0 <= 78) {
          this.field_E = -119;
        }
    }

    public final void draw(byte param0, boolean param1) {
        boolean discarded$0 = false;
        MatchOverlay var5 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (null != this.phase) {
          this.phase.draw(param0 ^ 97, param1);
        }
        if (!this.isMenuBackgroundDemo((byte) 33)) {
          if (this.field_A) {
            return;
          }
          if (param0 != -28) {
            discarded$0 = this.isScoreInvalidated((byte) 26);
          }
          var5 = (MatchOverlay) (this.overlays.first(param0 ^ 84));
          while (var5 != null) {
            var5.draw((byte) -66);
            var5 = (MatchOverlay) (this.overlays.next(123));
          }
          return;
        }
    }

    final boolean isInPlayPhase(int param0) {
        if (param0 != 0) {
          this.handleKey(-75, 'n', 84);
        }
        return this.phase instanceof PlayPhase;
    }

    final boolean handleServerPacket(int param0, int param1, BitPacketBuffer param2) {
        RuntimeException var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4) {
            this.soundPlayers = (SoundEventPlayer[]) null;
          }
          if (this.protocol != null) {
            stackIn_6_0 = this.protocol.handleServerPacket((byte) 107, this, param2, param0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qh.DB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void addOverlay(MatchOverlay param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.overlays.addLast((byte) -120, param0);
          if (param1 != 680) {
            this.getPlayerName(-90, false);
          }
          if (param0 instanceof MessageOverlay) {
            this.hasMessageOverlay = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qh.OA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isEnded(int param0) {
        if (param0 <= 124) {
          return true;
        }
        return this.field_s;
    }

    final void showCharacterSelect(byte param0) {
        int var2 = 70 % ((37 - param0) / 62);
        this.clearOverlays((byte) 99);
        this.setPhase(6, new CharacterSelectPhase(this, this.protocol));
    }

    final static hra validateDigits(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        hra stackIn_11_0 = null;
        hra stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          if (param0 == -58) {
            stackIn_13_0 = fb.field_c;
            return stackIn_13_0;
          }
          stackIn_11_0 = (hra) null;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qh.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean hasMessageOverlay(int param0) {
        if (param0 != 0) {
          this.courseResultAnnounced = (boolean[]) null;
        }
        return this.hasMessageOverlay;
    }

    final void onRewardChoice(byte param0, int param1, int param2) {
        if (this.phase instanceof RewardChoicePhase) {
          ((RewardChoicePhase) (this.phase)).announceChoice(param1, true, param2);
        }
        int var4 = -88 / ((49 - param0) / 53);
    }

    final int getCourseId(int param0) {
        if (this.field_D) {
          return -1;
        }
        if (param0 != -1) {
          this.getCharacterChoice(-21, -109);
        }
        return this.field_E;
    }

    final boolean isSendWindowFull(int param0) {
        if (null == this.protocol) {
          return false;
        }
        int var2 = 86 % ((13 - param0) / 57);
        return this.protocol.isSendWindowFull(1);
    }

    private final void showStandings(boolean param0) {
        this.clearOverlays((byte) 99);
        if (param0) {
          this.field_s = true;
        }
        this.setPhase(6, new StandingsPhase(this, this.protocol));
    }

    final void invalidateScore(byte param0) {
        ConsoleToken.field_o = true;
        if (param0 != -38) {
          this.protocol = (MatchProtocol) null;
        }
    }

    final void announceCourseResult(int param0, int param1) {
        FloatingMessage var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 < 23) {
          this.isInPlayPhase(63);
        }
        if (this.matchState.hasFinishedCourse((byte) 90, param1)) {
          var3 = RewardChoicePhase.createTextMessage(-41, LegacyOpenGlFlowingWaterEffect.formatText(124, ara.field_yb, new String[]{this.getColouredPlayerName(param1, 9)}) + ": " + DropAnimation.formatTime(this.matchState.getSimulationTick((byte) 115, param1), (byte) -8));
        } else {
          if (this.matchState.hasTimedOut((byte) -66, param1)) {
            var3 = RewardChoicePhase.createTextMessage(-79, LegacyOpenGlFlowingWaterEffect.formatText(107, hu.field_a, new String[]{this.getColouredPlayerName(param1, 9)}) + ": " + DropAnimation.formatTime(this.matchState.getSimulationTick((byte) 115, param1), (byte) -8));
          } else {
            var3 = RewardChoicePhase.createTextMessage(-108, LegacyOpenGlFlowingWaterEffect.formatText(99, DisplaySettingsDialog.field_Q, new String[]{this.getColouredPlayerName(param1, 9)}));
          }
        }
        ToolkitInstance.field_c.addMessageNow(0, var3);
    }

    private final void sendInputMask(boolean param0, int param1) {
        int var4 = 0;
        int var3;
        Player var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (this.actionHoldTicks[0] > 0) {
          var3 = var3 | 1;
        }
        if (this.actionHoldTicks[1] > 0) {
          var3 = var3 | 2;
        }
        if (this.actionHoldTicks[2] > 0) {
          var3 = var3 | 4;
        }
        if (this.actionHoldTicks[3] > 0) {
          var3 = var3 | 8;
        }
        if (this.actionHoldTicks[4] > 0) {
          var3 = var3 | 16;
        }
        if (this.actionHoldTicks[5] > 0) {
          var3 = var3 | 32;
        }
        if (this.actionHoldTicks[7] > 0) {
          var3 = var3 | 128;
        }
        if (this.actionHoldTicks[6] > 0) {
          var3 = var3 | 64;
        }
        if (this.actionHoldTicks[8] > 0) {
          if (this.isInPlayPhase(0)) {
            if (!this.isSpectating((byte) 92) &&
              this.matchState.players[param1].isSkipAllowed((byte) 85)) {
              var3 = var3 | 256;
            }
          } else {
            var3 = var3 | 256;
          }
        }
        if (param0) {
          this.overlays = (IntrusiveDeque) null;
        }
        var3 = S2CMatchResultPacket.a(var3, 4);
        if (null == this.inputQueues) {
          this.inputQueues = new PlayerInputQueue[this.matchState.playerCount];
          for (var4 = 0; var4 < this.matchState.playerCount; var4++) {
            var5 = this.matchState.players[var4];
            if (var5 != null) {
              this.inputQueues[var4] = new PlayerInputQueue();
            }
          }
        }
        this.inputQueues[param1].push(79, var3);
        if (null != this.protocol) {
          this.protocol.queueLocalInput(true, var3);
        }
    }

    private final void showResults(int[][] param0, int param1) {
        try {
          this.clearOverlays((byte) 99);
          if (param1 != -9) {
            this.onRoundEnded((byte) 46, (int[][]) null, -97);
          }
          this.setPhase(6, new ResultsPhase(this, this.protocol, param0));
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void startNextRound(byte param0) {
        if (this.protocol != null &&
          !this.isSpectating((byte) 120)) {
          this.protocol.resetForNextRound(10);
        }
        this.matchState.beginNextRound((byte) -82);
        this.initPlayers((byte) -108);
        int var2 = -66 / ((-65 - param0) / 39);
        this.startRound(-33);
    }

    private final void removeOverlay(int param0, MatchOverlay param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -19805) {
            this.field_i = 76;
          }
          param1.unlink(42);
          if (param1 instanceof MessageOverlay) {
            this.hasMessageOverlay = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qh.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, char param1, int param2) {
        boolean stackIn_34_1 = false;
        int var4;
        int var5;
        int var6;
        MatchOverlay var7;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.localPlayerIndex >= 0) {
          var4 = this.field_D ? 1 : 0;
          if (!wka.field_d &&
            var4 == 0 &&
            SecondaryNodeDequeIterator.field_a != null &&
            !SecondaryNodeDequeIterator.field_a.isMenuBackgroundDemo((byte) 33) &&
            SecondaryNodeDequeIterator.field_a == SpriteTileOperator.field_t) {
            var5 = uca.cosmeticRandom.nextBounded(8, 0);
            if (0 != var5) {
              if (1 != var5) {
                if (var5 != 2) {
                  if (var5 == 3) {
                    ti.field_b = ti.field_b - Transform3D.field_b;
                    lu.field_a = lu.field_a + 1;
                  } else {
                    if (var5 != 4) {
                      if (var5 == 5) {
                        lu.field_a = lu.field_a + 1;
                        ListTracksCommand.field_o = ListTracksCommand.field_o + Transform3D.field_b;
                      } else {
                        if (var5 != 6) {
                          if (7 == var5) {
                            ListTracksCommand.field_o = ListTracksCommand.field_o - Transform3D.field_b;
                            lu.field_a = lu.field_a - 1;
                          }
                        } else {
                          ListTracksCommand.field_o = ListTracksCommand.field_o - lu.field_a;
                          Transform3D.field_b = Transform3D.field_b - 1;
                        }
                      }
                    } else {
                      Transform3D.field_b = Transform3D.field_b + 1;
                      ListTracksCommand.field_o = ListTracksCommand.field_o + lu.field_a;
                    }
                  }
                } else {
                  Transform3D.field_b = Transform3D.field_b + 1;
                  ti.field_b = ti.field_b - lu.field_a;
                }
              } else {
                lu.field_a = lu.field_a - 1;
                ti.field_b = ti.field_b + Transform3D.field_b;
              }
            } else {
              ti.field_b = ti.field_b + lu.field_a;
              Transform3D.field_b = Transform3D.field_b - 1;
            }
          }
        }
        if (this.phase != null &&
          this.phase.handleKey(param1, 25, param0)) {
          return true;
        }
        if (RasterizerOperator.d(20125) &&
          param0 == 88) {
          stackIn_34_1 = !(this.field_A);
          this.field_A = stackIn_34_1;
        }
        if (param0 == 13 &&
          !this.c(false) && (this.isSpectating((byte) 81) ||
          null != this.phase &&
          this.phase.allowsChat(param2 ^ -9201))) {
          ConstrainToRectangleLocomotor.showMenuScreen(false, 7, (byte) -92);
          return true;
        }
        if (param2 != 1) {
          return true;
        }
        var7 = (MatchOverlay) (this.overlays.first(param2 ^ -79));
        if (var7 == null) {
          return true;
        }
        if (!var7.handleKey(param0, param1, (byte) -116)) {
        }
        return true;
    }

    private final String formatDeathMessage(Player param0, byte param1, int param2) {
        String dupTemp$1 = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String[] var8 = null;
        String var9 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var6Lifetime1;
        try {
          var8 = tk.field_a[param2];
          var4 = var8;
          if (param1 != -9) {
            this.viewedPlayerIndex = -6;
          }
          var5 = param0.getPlayerIndex(0);
          var6 = var4[uca.cosmeticRandom.nextBounded(var8.length, param1 + 9)];
          var7 = this.getPlayerName(var5, false);
          dupTemp$1 = "<col=" + PasswordValidator.field_k[var5] + ">" + var6 + "</col>";
          var9 = dupTemp$1;
          var6Lifetime1 = dupTemp$1;
          stackIn_3_0 = LegacyOpenGlFlowingWaterEffect.formatText(84, var9, new String[]{var7});
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("qh.JA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void tickMatch(int param0) {
        int var2;
        PlayerInputQueue var3;
        int var4;
        MatchScoringObserver var5;
        PenaltyNotice var6;
        String var7;
        FloatingMessage var8;
        int var9;
        int var2Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param0 < 79) {
          this.announceLeftPlayers(-121, (byte) -26);
        }
        if (!this.matchState.matchOver) {
          if (!this.isSpectating((byte) 80) &&
            this.matchState.simulations[this.localPlayerIndex].isActive(-19271)) {
            this.pollLocalInput((byte) -36);
          }
          for (var2 = 0; var2 < this.matchState.players.length; var2++) {
            var3 = this.inputQueues[var2];
            if (var3.hasPending(-123)) {
              this.processPlayerTick(false, var2, var3.pop((byte) -54));
            }
            if (var3.getPendingCount((byte) 116) > 16) {
              this.field_o[var2] = 1;
            } else {
              if (this.field_o[var2] > 0 &&
                var3.getPendingCount((byte) 97) <= 8) {
                this.field_o[var2] = 0;
              }
            }
            var4 = this.field_o[var2];
            while (var3.getPendingCount((byte) 102) > 0) {
              if (var4 > 0) {
                var4--;
                this.processPlayerTick(false, var2, var3.pop((byte) -70));
                continue;
              }
              break;
            }
            var5 = (MatchScoringObserver) (this.matchState.simulations[var2].getObserver(9262));
            var6 = var5.pollPenaltyNotice((byte) 121);
            while (var6 != null) {
              if (ToolkitInstance.field_c.isEnabled(4782)) {
                var7 = this.formatDeathMessage(var6.getPlayer(-14065), (byte) -9, var6.getKind(74));
                var8 = RewardChoicePhase.createTextMessage(-23, var7);
                ToolkitInstance.field_c.addMessageNow(0, var8);
              }
              var6 = var5.pollPenaltyNotice((byte) -57);
            }
          }
          var2Lifetime1 = this.roundDeadlineTick - this.matchState.getSimulationTick((byte) 115, this.viewedPlayerIndex);
          if (this.roundDeadlineTick != -1 &&
            var2Lifetime1 <= 500 &&
            var2Lifetime1 % 50 == 0) {
            it.playMenuSound(255, 131);
          }
        }
        this.matchState.standings.update(16);
        if (this.field_n != null) {
          this.field_n.update(9981);
        }
    }

    final void onRoundEnded(byte param0, int[][] param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = 119 % ((param0 - 56) / 44);
          this.resetInputs(-1);
          this.matchState.setRoundWinner(param2, -1);
          this.clearOverlays((byte) 99);
          if (0 != this.matchState.gameMode) {
            this.setPhase(6, new RoundWinnerPhase(this, this.protocol));
          } else {
            this.setPhase(6, new ResultsPhase(this, this.protocol, param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qh.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void setCharacterChoice(int param0, int param1, int param2) {
        if (this.field_D) {
          throw new IllegalStateException("NMP");
        }
        this.matchState.characterChoices[param2].setCharacter(param0, (byte) 37);
        if (param1 != 50) {
          this.actionStates = (boolean[][]) null;
        }
    }

    final void onCharacterChoice(int param0, int param1, int param2) {
        if (this.phase instanceof CharacterSelectPhase) {
          ((CharacterSelectPhase) (this.phase)).onCharacterChosen(param2, 0, param0);
        }
        int var4 = 25 % ((param1 - 54) / 49);
    }

    private final int getTrackedScore(byte param0) {
        if (param0 != 19) {
          field_q = (SpriteData) null;
        }
        return this.field_j;
    }

    final void submitScore(int param0) {
        int var2;
        if (this.matchState.gameMode == 3) {
          return;
        }
        if (this.field_E == 10) {
          return;
        }
        if (param0 != -18570) {
          this.field_E = 16;
        }
        if (MandelbrotOperator.field_o == null &&
          this.field_j > 0 &&
          !this.isScoreInvalidated((byte) 62) && this.field_E >= 0) {
          var2 = this.field_E;
          MandelbrotOperator.field_o = new ScoreSubmission(var2, var2 ^ 65535, ti.field_b, ListTracksCommand.field_o, lu.field_a, Transform3D.field_b, new int[]{this.field_j});
          if (!TextWidgetPainter.a(66)) {
            su.queueScoreSubmission(MandelbrotOperator.field_o, (byte) -108, 3);
          }
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
          return true;
        }
        return this.matchState.d(-108);
    }

    private final void setTrackedScore(int param0, int param1) {
        int stackIn_4_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != this.field_j) {
          var3 = -this.field_j + param0;
          if (!wka.field_d &&
            null != SecondaryNodeDequeIterator.field_a &&
            SecondaryNodeDequeIterator.field_a.localPlayerIndex >= 0 &&
            !SecondaryNodeDequeIterator.field_a.field_D &&
            !SecondaryNodeDequeIterator.field_a.isMenuBackgroundDemo((byte) 33) &&
            SpriteTileOperator.field_t == SecondaryNodeDequeIterator.field_a) {
            var4 = uca.cosmeticRandom.nextBounded(3, 0);
            if (0 != var4) {
              if (var4 == 1) {
                ListTracksCommand.field_o = ListTracksCommand.field_o - var3;
              } else {
                var5 = var3 / 3;
                ListTracksCommand.field_o = ListTracksCommand.field_o - (-var5 + var3);
                ti.field_b = ti.field_b + var5;
              }
            } else {
              ti.field_b = ti.field_b + var3;
            }
          }
        } else {
          stackIn_4_0 = (!this.field_D) ? 0 : 1;
          var3 = stackIn_4_0;
          if (!wka.field_d &&
            var3 == 0 &&
            SecondaryNodeDequeIterator.field_a != null &&
            !SecondaryNodeDequeIterator.field_a.isMenuBackgroundDemo((byte) 33) &&
            SpriteTileOperator.field_t == SecondaryNodeDequeIterator.field_a) {
            var4 = uca.cosmeticRandom.nextBounded(8, 0);
            if (0 != var4) {
              if (var4 != 1) {
                if (var4 != 2) {
                  if (var4 != 3) {
                    if (var4 == 4) {
                      ListTracksCommand.field_o = ListTracksCommand.field_o + lu.field_a;
                      Transform3D.field_b = Transform3D.field_b + 1;
                    } else {
                      if (5 == var4) {
                        ListTracksCommand.field_o = ListTracksCommand.field_o + Transform3D.field_b;
                        lu.field_a = lu.field_a + 1;
                      } else {
                        if (var4 != 6) {
                          if (var4 == 7) {
                            lu.field_a = lu.field_a - 1;
                            ListTracksCommand.field_o = ListTracksCommand.field_o - Transform3D.field_b;
                          }
                        } else {
                          ListTracksCommand.field_o = ListTracksCommand.field_o - lu.field_a;
                          Transform3D.field_b = Transform3D.field_b - 1;
                        }
                      }
                    }
                  } else {
                    lu.field_a = lu.field_a + 1;
                    ti.field_b = ti.field_b - Transform3D.field_b;
                  }
                } else {
                  ti.field_b = ti.field_b - lu.field_a;
                  Transform3D.field_b = Transform3D.field_b + 1;
                }
              } else {
                ti.field_b = ti.field_b + Transform3D.field_b;
                lu.field_a = lu.field_a - 1;
              }
            } else {
              ti.field_b = ti.field_b + lu.field_a;
              Transform3D.field_b = Transform3D.field_b - 1;
            }
          }
        }
        if (param1 != 23104) {
          return;
        }
        this.field_j = param0;
    }

    private final void pollLocalInput(byte param0) {
        if (this.isSpectating((byte) 85)) {
          return;
        }
        if (param0 >= -4) {
          return;
        }
        if (this.protocol != null &&
          this.protocol.isSendWindowFull(1)) {
          return;
        }
        this.sendInputMask(false, this.localPlayerIndex);
    }

    final void showMatchResult(int param0, int param1) {
        this.matchState.declareWinner(param0, (byte) 119);
        this.clearOverlays((byte) 99);
        if (param1 <= 15) {
          return;
        }
        this.setPhase(6, new StandingsPhase(this, this.protocol));
    }

    final String getPlayerName(int param0, boolean param1) {
        if (param1) {
          this.field_s = false;
        }
        return this.matchState.getPlayerName(param0, 0);
    }

    final boolean isSpectating(byte param0) {
        if (param0 < 60) {
          this.pausedByOverlay = false;
        }
        return this.localPlayerIndex == -2 ? true : false;
    }

    final String getColouredPlayerName(int param0, int param1) {
        if (param1 != 9) {
          BitPacketBuffer var4 = (BitPacketBuffer) null;
          this.decodePingTimes(-82, (BitPacketBuffer) null);
        }
        return this.matchState.getColouredPlayerName(param0, 23807);
    }

    static {
    }
}
