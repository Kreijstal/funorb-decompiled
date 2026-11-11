/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MatchState implements dv {
    int playerCount;
    PlayerSimulation[] simulations;
    int field_E;
    Player[] players;
    CharacterChoice[] characterChoices;
    private int courseId;
    private ScoringObserverFactory scoringFactory;
    static String field_N;
    int roundsToWin;
    int gameMode;
    private int field_O;
    int roundIndex;
    ScoreStandings scoreStandings;
    String[] playerNames;
    int roundSeed;
    BitSet[] field_x;
    private int roundWinner;
    int field_b;
    boolean[] field_I;
    int[] roundWins;
    RaceStandings standings;
    boolean matchOver;
    MatchStatistics statistics;
    private String[] colouredPlayerNames;
    static SpriteData[] field_j;
    int[] field_g;
    private boolean field_s;
    int playersRemaining;
    long[] field_F;
    private int matchSeed;
    CommonChooseReward rewardChoice;
    private boolean[] field_n;
    private boolean[] finishedRound;
    static int field_w;
    private int resignedMask;
    int declaredWinner;
    private CourseLayout[] courseLayouts;
    private boolean field_M;
    private int leftMask;
    private int field_a;
    static Sprite field_p;
    int field_t;

    final void resyncPlayerToRoom(int param0, int param1, int param2, int param3, int param4) {
        Room var6 = this.simulations[param1].getRoomAt(true, param0);
        if (var6 == null) {
          throw new IllegalStateException("Could not resync player to room: " + param1 + ", " + param0);
        }
        this.simulations[param1].tick = param3;
        var6.setTick((byte) 88, param4);
        var6.restart((byte) -65);
        if (param2 != 1) {
          this.playerCount = 37;
        }
    }

    final void b(boolean param0, int param1, int param2) {
        this.field_s = false;
        PlayerSimulation var4 = this.simulations[param2];
        if (!param0) {
          return;
        }
        var4.getObserver(9262).a(var4, param1, 104);
        if (!var4.isActive(-19271)) {
          this.markFinishedRound(121, param2);
        }
    }

    final int getCourseId(int param0) {
        if (param0 != 0) {
          this.declareWinner(68, (byte) -44);
        }
        return this.courseId;
    }

    final boolean b(int param0, int param1) {
        if (param1 != 0) {
          this.field_n = (boolean[]) null;
        }
        return this.field_n[param0];
    }

    private final void c(int param0) {
        this.startRound((byte) -89);
        if (param0 != 22640) {
          this.c(96);
        }
    }

    public static void releaseStatics(int param0) {
        field_N = null;
        field_p = null;
        if (param0 != 0) {
          MatchState.h(88);
        }
        field_j = null;
    }

    final boolean a(boolean param0, int param1, int param2) {
        Player var4 = this.players[param1];
        if (param0) {
          return false;
        }
        Room var5 = var4.getRoom((byte) -85);
        if (var5 == null) {
          return true;
        }
        int var6 = var5.getCourseIndex(74);
        if (param2 != var6 &&
          param2 != var6 + 1) {
          return true;
        }
        return false;
    }

    final void copyCorpsesToRoom(boolean param0, Room param1) {
        int var4 = 0;
        int var3_int = 0;
        Room var5 = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          if (param1.hasActiveVariant((byte) -82)) {
            return;
          }
          var3_int = param1.getCourseIndex(91);
          for (var4 = 0; var4 < this.simulations.length; var4++) {
            if (this.simulations[var4] != null) {
              var5 = this.simulations[var4].getRoomAt(param0, var3_int);
              if (var5 != null) {
                param1.copyCorpsesFrom(var5, (byte) 126);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ff.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void setRoundWinner(int param0, int param1) {
        this.roundWinner = param0;
        this.statistics.markRoundLosers(this.roundWinner, false);
        this.statistics.a((byte) 74);
        if (~this.roundWinner <= param1) {
          this.roundWins[this.roundWinner] = this.roundWins[this.roundWinner] + 1;
        }
    }

    final int findPlayerIndex(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 <= 62) {
            this.d(-118);
          }
          for (var3_int = 0; this.players.length > var3_int; var3_int++) {
            if (faa.accountNamesMatch(param0, 109, this.playerNames[var3_int])) {
              stackIn_8_0 = var3_int;
              return stackIn_8_0;
            }
          }
          stackIn_11_0 = -2;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ff.PA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean k(int param0) {
        if (param0 != -25319) {
          this.field_s = true;
        }
        return this.gameMode == 2 ? true : false;
    }

    final int getMatchWinner(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 54) {
          this.field_n = (boolean[]) null;
        }
        var2 = -1;
        var3 = -1;
        for (var4 = 0; var4 < this.players.length; var4++) {
          var5 = this.roundWins[var4];
          if (-1 == var3 ||
            var5 > var2) {
            var2 = var5;
            var3 = var4;
          }
        }
        if (var2 < this.roundsToWin) {
          return -1;
        }
        return var3;
    }

    final void h(int param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 45) {
          return;
        }
        for (var3 = 0; this.players.length > var3; var3++) {
          this.simulations[var3].d(119, param0);
        }
    }

    final Room getPlayerRoom(int param0, int param1) {
        if (param0 != 0) {
          this.roundIndex = -127;
        }
        return this.players[param1].getRoom((byte) 106);
    }

    final void markLeft(byte param0, int param1) {
        if (!this.hasResigned((byte) -107, param1)) {
          if (this.hasLeft(13, param1)) {
            return;
          }
          this.leftMask = this.leftMask | 1 << param1;
          this.markFinishedRound(38, param1);
          int var3 = 27 / ((51 - param0) / 43);
          this.playersRemaining = this.playersRemaining - 1;
          return;
        }
    }

    private final void markFinishedRound(int param0, int param1) {
        this.finishedRound[param1] = true;
        if (param0 < 29) {
          this.resyncPlayerToRoom(-104, 79, -8, 3, -72);
        }
    }

    public final void decode(BitPacketBuffer param0, boolean param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.matchOver = CircleMovementLocomotor.readBitFlag(5907, param0);
          this.declaredWinner = uma.readSignedBits(32, param0, -26803);
          this.roundIndex = param0.readBits((byte) 44, 32);
          this.roundSeed = param0.readBits((byte) 44, 32);
          this.characterChoices = (CharacterChoice[]) (gha.readDecodableArray(this.characterChoices, 1, 8, -16499, TileOperator.field_q, param0));
          this.courseLayouts = (CourseLayout[]) (gha.readDecodableArray(this.courseLayouts, 1, 8, -16499, OpenGlRenderbuffer.field_u, param0));
          this.roundWins = fa.a(0, param0, 8, this.roundWins);
          this.roundWinner = uma.readSignedBits(32, param0, -26803);
          this.finishedRound = PooledObject.a(8, this.finishedRound, (byte) 93, param0);
          this.playersRemaining = param0.readBits((byte) 44, 32);
          this.field_s = CircleMovementLocomotor.readBitFlag(5907, param0);
          if (!CircleMovementLocomotor.readBitFlag(5907, param0)) {
            this.rewardChoice = null;
          } else {
            if (null == this.rewardChoice) {
              this.rewardChoice = new CommonChooseReward();
            }
            this.rewardChoice.decode(param0, false);
          }
          this.field_E = uma.readSignedBits(32, param0, -26803);
          this.field_I = PooledObject.a(8, this.field_I, (byte) -41, param0);
          if (param1) {
            return;
          }
          this.c(22640);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ff.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void d(int param0, int param1) {
        if (msa.field_a == param1) {
          if (null == SecondaryNodeDequeIterator.field_a) {
            return;
          }
          if (param0 != 0) {
            return;
          }
          S2CPlayerProfilePacket.a(108, 13);
          S2CPlayerProfilePacket.a(84, 14);
          S2CPlayerProfilePacket.a(43, 15);
          return;
        }
    }

    final boolean allFinishedRound(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = param0; var2 < this.players.length; var2++) {
          if (!this.finishedRound[var2]) {
            return false;
          }
        }
        return true;
    }

    final String getColouredPlayerName(int param0, int param1) {
        if (param1 != 23807) {
          return (String) null;
        }
        if (param0 < 0) {
          return dpa.field_c;
        }
        return this.colouredPlayerNames[param0];
    }

    final boolean isSinglePlayer(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1878) {
          this.getPlayerCourseIndex(-41, -61);
        }
        stackIn_6_0 = (this.playerCount == 1) && (this.gameMode != 2);
        return stackIn_6_0;
    }

    final boolean hasTimedOut(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 >= -56) {
          this.startRound((byte) 52);
        }
        stackIn_6_0 = (!this.hasResigned((byte) -102, param1)) && (this.simulations[param1].hasTimedOut(-31170));
        return stackIn_6_0;
    }

    final static boolean h(int param0) {
        if (param0 != 1) {
          field_w = 88;
        }
        return du.field_e;
    }

    final void beginNextRound(byte param0) {
        if (this.declaredWinner < 0) {
          this.roundIndex = this.roundIndex + 1;
          this.roundSeed = this.roundIndex + (this.matchSeed + 1);
          this.statistics.a((byte) 108);
          this.startRound((byte) -89);
        }
        int var2 = -128 % ((80 - param0) / 37);
        this.roundWinner = -1;
        this.field_s = true;
    }

    final boolean g(int param0, int param1) {
        if (param0 < 68) {
          return false;
        }
        return (1 << param1 & this.field_t) > 0 ? true : false;
    }

    final boolean g(int param0) {
        if (param0 != 0) {
          this.k(37);
        }
        return this.field_s;
    }

    final QueuedPlayerEvent pollQueuedEvent(boolean param0, int param1) {
        if (!param0) {
          return (QueuedPlayerEvent) null;
        }
        return this.simulations[param1].getObserver(9262).pollQueuedEvent(104);
    }

    final void markResigned(int param0, int param1) {
        if (!this.hasResigned((byte) -82, param1)) {
          if (this.hasLeft(13, param1)) {
            return;
          }
          this.resignedMask = this.resignedMask | param0 << param1;
          this.markFinishedRound(40, param1);
          this.playersRemaining = this.playersRemaining - 1;
          return;
        }
    }

    final boolean allCharactersChosen(int param0) {
        int var3 = 0;
        CharacterChoice var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        CharacterChoice[] var7 = this.characterChoices;
        CharacterChoice[] var2 = var7;
        int var4 = -71 % ((param0 + 68) / 44);
        for (var3 = 0; var3 < var7.length; var3++) {
          var5 = var7[var3];
          if (var5.getCharacter(56) == -1) {
            return false;
          }
        }
        return true;
    }

    final void declareWinner(int param0, byte param1) {
        this.declaredWinner = param0;
        this.matchOver = true;
        if (param1 <= 100) {
          this.roundSeed = 80;
        }
    }

    final int getPlayerCourseIndex(int param0, int param1) {
        if (param0 != 1) {
          this.declareWinner(21, (byte) 42);
        }
        return this.players[param1].getRoom((byte) 87).getCourseIndex(-79);
    }

    final boolean hasLeft(int param0, int param1) {
        if (param0 != 13) {
          this.roundSeed = -75;
        }
        return (1 << param1 & this.leftMask) > 0 ? true : false;
    }

    private final void createSimulation(byte param0, int param1) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4 = 16 % ((54 - param0) / 35);
        MatchScoringObserver var7 = this.scoringFactory.createScoringObserver(this, -25077);
        MatchScoringObserver var3 = var7;
        this.simulations[param1] = new PlayerSimulation(var7, this.players[param1], this.field_O, this.field_a);
        for (var5 = 0; this.simulations[param1].getRoomCount(-106) > var5; var5++) {
          this.simulations[param1].setRoom(-28088, var5, this.courseLayouts[this.roundIndex].createRoom(1024, var5, this.roundSeed, this.simulations[param1]));
        }
    }

    final boolean hasFinishedCourse(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 != 90) {
          this.leftMask = 124;
        }
        stackIn_6_0 = (!this.hasResigned((byte) -91, param1)) && (this.simulations[param1].isFinished(param0 - 90));
        return stackIn_6_0;
    }

    final boolean hasResigned(byte param0, int param1) {
        if (param0 > -73) {
          this.field_O = 117;
        }
        return (1 << param1 & this.resignedMask) > 0 ? true : false;
    }

    final boolean haveAllOthersResigned(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (!param1) {
          field_w = -127;
        }
        while (this.playerCount > var3) {
          if (var3 != param0 &&
            !this.hasResigned((byte) -122, var3)) {
            return false;
          }
          var3++;
        }
        return true;
    }

    final String getPlayerName(int param0, int param1) {
        if (param1 > param0) {
          return dpa.field_c;
        }
        return this.playerNames[param0];
    }

    final int getRoomHashByte(int param0, int param1) {
        if (param0 != 0) {
          this.field_a = 20;
        }
        return dna.lowByte(this.simulations[param1].getRoomStateHash(true), 255);
    }

    final PlayerSimulation getSimulation(int param0, int param1) {
        if (param0 < param1) {
          return null;
        }
        return this.simulations[param0];
    }

    final void deliverPendingEvent(byte param0, PendingEvent param1) {
        PlayerSimulation var3 = null;
        try {
          if (param0 <= 14) {
            this.getMatchWinner((byte) -115);
          }
          var3 = this.simulations[param1.getCourse(3)];
          var3.getObserver(9262).queueEvent(var3, param1, false);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ff.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getSimulationTick(byte param0, int param1) {
        if (param0 != 115) {
          this.getColouredPlayerName(-62, 55);
        }
        return this.simulations[param1].tick;
    }

    final boolean d(int param0) {
        if (param0 > -61) {
          this.declaredWinner = -104;
        }
        return this.field_M;
    }

    final void startRound(byte param0) {
        int var2;
        Room var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        var4 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.simulations.length; var2++) {
          this.players[var2].resetMatchProgress((byte) 126);
          this.createSimulation((byte) -36, var2);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.simulations.length; var2Lifetime1++) {
          var3 = this.simulations[var2Lifetime1].getFirstRoom(-88);
          if (var3 != null) {
            var3.restart((byte) -89);
          }
        }
        this.standings.reset(false);
        var2Lifetime2 = 0;
        if (param0 != -89) {
          return;
        }
        while (var2Lifetime2 < this.finishedRound.length) {
          this.finishedRound[var2Lifetime2] = this.hasResigned((byte) -81, var2Lifetime2);
          var2Lifetime2++;
        }
        if (0 == this.gameMode) {
          this.rewardChoice = new CommonChooseReward(this);
          this.rewardChoice.rollRewards(param0 + 28713);
          this.field_E = 0;
        }
    }

    final int getRoundWinner(int param0) {
        if (param0 != 2) {
          return 69;
        }
        return this.roundWinner;
    }

    final boolean d(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 < 57) {
          return true;
        }
        stackIn_7_0 = (this.gameMode == 0) || (this.gameMode == 2);
        return stackIn_7_0;
    }

    MatchState(String[] param0, int param1, int param2, int param3, int param4, int param5, int param6, BitSet[] param7, boolean[] param8, ScoringObserverFactory param9, CourseGenerator param10) {
        int var13 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var12_intLifetime3;
        this.field_s = true;
        this.declaredWinner = -1;
        this.field_E = -1;
        try {
          this.roundsToWin = param4;
          this.scoringFactory = param9;
          this.playerNames = param0;
          this.gameMode = param5;
          if (param10 != null) {
            if (this.gameMode != 0) {
              var12_int = 1;
            } else {
              var12_int = this.playerNames.length * (-1 + param4) + 1;
            }
            this.courseLayouts = new CourseLayout[var12_int];
            for (var13 = 0; var13 < var12_int; var13++) {
              this.courseLayouts[var13] = param10.generateLayout((byte) 58);
            }
          }
          this.colouredPlayerNames = new String[this.playerNames.length];
          for (var12_intLifetime1 = 0; var12_intLifetime1 < this.playerNames.length; var12_intLifetime1++) {
            this.colouredPlayerNames[var12_intLifetime1] = "<col=" + PasswordValidator.field_k[var12_intLifetime1] + ">" + this.playerNames[var12_intLifetime1] + "</col>";
          }
          this.playerCount = param0.length;
          this.field_a = param3;
          this.field_O = param2;
          this.field_n = param8;
          this.matchSeed = param1;
          this.field_x = param7;
          this.roundSeed = this.matchSeed;
          this.playersRemaining = this.playerCount;
          this.roundWins = new int[this.playersRemaining];
          this.players = new Player[this.playersRemaining];
          this.characterChoices = new CharacterChoice[this.playersRemaining];
          for (var12_intLifetime2 = 0; this.players.length > var12_intLifetime2; var12_intLifetime2++) {
            this.players[var12_intLifetime2] = new Player(var12_intLifetime2);
            this.characterChoices[var12_intLifetime2] = new CharacterChoice(this.players[var12_intLifetime2]);
          }
          var12_intLifetime3 = this.gameMode;
          if (var12_intLifetime3 == 0) {
            this.courseId = -1;
          } else {
            if (var12_intLifetime3 == 1) {
              this.courseId = param6;
            } else {
              if (3 == var12_intLifetime3) {
                this.courseId = pl.a((byte) 64);
              } else {
                if (2 == var12_intLifetime3) {
                  this.courseId = -1;
                }
              }
            }
          }
          this.simulations = new PlayerSimulation[this.playerCount];
          this.finishedRound = new boolean[this.players.length];
          this.roundWinner = -1;
          this.standings = new RaceStandings(this);
          this.scoreStandings = new ScoreStandings(this);
          if (this.gameMode == 0) {
            this.rewardChoice = new CommonChooseReward(this);
            this.rewardChoice.rollRewards(28624);
            this.field_E = 0;
          }
          this.statistics = new MatchStatistics(this.playerCount);
          this.field_g = new int[this.playerCount];
          this.field_F = new long[this.playerCount];
          this.field_I = new boolean[this.playerCount];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_29_0 = var12;
          stackIn_29_1 = new StringBuilder().append("ff.<init>(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param8 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param9 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param10 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    static {
        field_N = "Options";
        field_w = 256;
    }
}
