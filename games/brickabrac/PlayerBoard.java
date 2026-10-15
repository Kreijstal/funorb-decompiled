/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlayerBoard extends IntrusiveNode {
    NodeDeque incomingInputBatches;
    int simulationTick;
    int[] outgoingInputMasks;
    static String[][] field_jb;
    int controlMask;
    int leftKeyCode;
    int rightKeyCode;
    NodeDeque scorePopups;
    int lives;
    int score;
    int actionKeyCode;
    int bufferedInputTicks;
    private ObjectHistoryBuffer snapshotHistory;
    Paddle paddle;
    NodeDeque queuedBalls;
    NodeDeque activeBalls;
    NodeDeque ballPulses;
    int field_A;
    NodeDeque fallingPowerUps;
    NodeDeque bubbles;
    ObjectHistoryBuffer powerUpHistory;
    int field_N;
    IntNode levelState;
    int nextPowerUpIndex;
    int field_hb;
    NodeDeque[] brickGroups;
    NodeDeque motionPaths;
    int levelIndex;
    int field_u;
    private int randomCallCount;
    int field_m;
    int boardOffset;
    int field_Q;
    int countedBricks;
    int stateTicks;
    byte[] powerUpDropCounters;
    int boardState;
    private int randomSeed;
    int field_G;
    private Random messageRandom;
    int boardWidth;
    private IsaacGenerator seededRandom;
    private int field_T;
    int field_wb;
    int field_J;
    boolean field_tb;
    int positionWord;
    int characterIndex;
    int bubbleTick;
    int messageTicks;
    private Brick[] portalBricks;
    PowerUpWarning pendingWarning;
    int flaggedBrickTypeMask;
    int field_r;
    int receivedInputTick;
    String pendingMessage;
    int[] powerUpMeterLevels256;
    int eyeExpressionTicks;
    int maskedTicks;
    PowerUpWarning displayedWarning;
    int bubbleSeed;
    int eyeExpression;
    int field_t;
    int field_n;
    int field_l;
    int positionOrderTicks;
    String displayedMessage;
    int[] powerUpMeterVelocities256;
    int resultWord;
    int resultCode;

    final void installLevelBricks(NodeDeque paths, int obfuscationGuard, NodeDeque[] groups) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var7 = null;
        Brick var7_ref = null;
        int var8 = 0;
        NodeDeque var9 = null;
        NodeDeque var10 = null;
        Brick var7_refLifetime1;
        NodeDeque var10Lifetime1;
        NodeDeque var10Lifetime2;
        int var5Lifetime1;
        int var4_intLifetime1;
        var7 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          this.flaggedBrickTypeMask = 0;
          this.brickGroups = groups;
          this.countedBricks = 0;
          this.motionPaths = paths;
          if (this.brickGroups == null) {
            return;
          }
          if (this.motionPaths != null) {
            NanoGameClock.attachBrickMotionPaths(this.brickGroups, (byte) 35, this.motionPaths, true);
          }
          if (obfuscationGuard != 9) {
            return;
          }
          var4_int = 0;
          for (var5 = 0; var5 < this.brickGroups.length; var5++) {
            var9 = this.brickGroups[var5];
            var10 = var9;
            var10Lifetime2 = var9;
            var7_ref = (Brick) (var9.first(-94));
            while (var7_ref != null) {
              boolean decompiledFrameRemainder0 = true;
              if (var7_ref.typeId != 1 &&
                var7_ref.typeId != 25 &&
                var7_ref.typeId != 28) {
                if ((var7_ref.flags & 2) != 0) {
                  this.flaggedBrickTypeMask = this.flaggedBrickTypeMask | 1 << var7_ref.typeId;
                }
                decompiledFrameRemainder0 = (var7_ref.typeId != 0 ||
                  2 != var7_ref.pendingTypeId);
                if (decompiledFrameRemainder0) {
                  this.countedBricks = this.countedBricks + 1;
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var7_ref.typeId == 28)) {
                var4_int++;
              }
              var7_ref = (Brick) (var9.next((byte) 116));
            }
          }
          this.portalBricks = new Brick[var4_int];
          var4_intLifetime1 = 0;
          for (var5Lifetime1 = 0; this.brickGroups.length > var5Lifetime1; var5Lifetime1++) {
            var10Lifetime1 = this.brickGroups[var5Lifetime1];
            var7_refLifetime1 = (Brick) (var10Lifetime1.first(-37));
            while (var7_refLifetime1 != null) {
              if (var7_refLifetime1.typeId == 28) {
                incrementValue$0 = var4_intLifetime1;
                var4_intLifetime1++;
                var7_refLifetime1.portalIndex = incrementValue$0;
                this.portalBricks[var7_refLifetime1.portalIndex] = var7_refLifetime1;
              }
              var7_refLifetime1 = (Brick) (var10Lifetime1.next((byte) 116));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_37_0 = var4;
          stackIn_37_1 = new StringBuilder().append("j.G(");
          if (paths == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(obfuscationGuard).append(',');
          if (groups == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    private final PowerUpWarning selectPowerUpWarning(int obfuscationGuard) {
        int typeThreeDelay;
        int typeFifteenDelay;
        int hasExpiringBallPhase;
        Ball queuedBall;
        int clientBranchFlag;
        Ball activeBall;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        typeThreeDelay = this.ticksUntilPendingPowerUp(3, 96, 25);
        if (typeThreeDelay != -1 &&
          typeThreeDelay > this.paddle.field_w) {
          return new PowerUpWarning(3);
        }
        if (this.paddle.field_w > 0 &&
          this.paddle.field_w < 25 &&
          typeThreeDelay == -1) {
          return new PowerUpWarning(3, false);
        }
        if (this.ticksUntilPendingPowerUp(9, 96, 25) != -1) {
          return new PowerUpWarning(9);
        }
        typeFifteenDelay = this.ticksUntilPendingPowerUp(15, 117, 25);
        if (typeFifteenDelay != -1) {
          hasExpiringBallPhase = 0;
          queuedBall = (Ball) (this.queuedBalls.first(-98));
          while (queuedBall != null) {
            if (typeFifteenDelay > queuedBall.phaseTicks) {
              hasExpiringBallPhase = 1;
            }
            queuedBall = (Ball) (this.queuedBalls.next((byte) 116));
          }
          activeBall = (Ball) (this.activeBalls.first(-95));
          while (activeBall != null) {
            if (activeBall.phaseTicks < typeFifteenDelay) {
              hasExpiringBallPhase = 1;
            }
            activeBall = (Ball) (this.activeBalls.next((byte) 116));
          }
          if (hasExpiringBallPhase != 0) {
            return new PowerUpWarning(15);
          }
        }
        if (this.ticksUntilPendingPowerUp(6, 117, 25) != -1) {
          return new PowerUpWarning(6);
        }
        if (this.ticksUntilPendingPowerUp(16, 74, 25) != -1) {
          return new PowerUpWarning(16);
        }
        if (this.ticksUntilPendingPowerUp(7, 123, 25) != -1) {
          return new PowerUpWarning(7);
        }
        if (obfuscationGuard >= -81) {
          this.receivedInputTick = 12;
        }
        if (this.ticksUntilPendingPowerUp(11, 33, 25) != -1) {
          return new PowerUpWarning(11);
        }
        if (this.ticksUntilPendingPowerUp(8, 84, 25) != -1) {
          return new PowerUpWarning(8);
        }
        if (this.ticksUntilPendingPowerUp(13, 102, 25) != -1) {
          return new PowerUpWarning(13);
        }
        return null;
    }

    final int computeBoardChecksum(boolean obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        int stackIn_4_0 = 0;
        int stackIn_97_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        Brick var7 = null;
        int var8 = 0;
        int var9 = 0;
        Ball var10 = null;
        PowerUp var11 = null;
        BrickMotionPath var12 = null;
        BubbleDistortion var13 = null;
        Ball var14 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var5Lifetime1Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_4_0 = (diagnostics == null) ? 0 : 1;
          var3_int = stackIn_4_0;
          if (var3_int != 0) {
            discarded$0 = diagnostics.append("Checksum breakdown for a player.\n");
          }
          var4 = 455818059;
          if (var3_int != 0) {
            discarded$1 = diagnostics.append("State info: " + this.boardState + " " + this.stateTicks + "\n");
          }
          var4 = var4 ^ this.boardState * 83 + 255 << 21;
          var4 = var4 ^ 238 + this.stateTicks * 73 << 12;
          if (var3_int != 0) {
            discarded$2 = diagnostics.append("1. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$3 = diagnostics.append("Score, Level, Lives: " + this.score + " " + this.levelIndex + " " + this.lives + "\n");
          }
          var4 = var4 ^ 65535 + this.score * 29;
          var4 = var4 ^ 15601376 + 67 * this.levelIndex << 3;
          var4 = var4 ^ this.lives * 61 + 961453 << 10;
          if (var3_int != 0) {
            discarded$4 = diagnostics.append("2. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$5 = diagnostics.append("Hit brick info: " + this.countedBricks + " " + this.field_m + " " + this.field_Q + "\n");
          }
          var4 = var4 ^ this.countedBricks * 11 + (this.field_m * 17 + 14334957);
          var4 = var4 ^ 13287405 + this.field_Q * 103 << 6;
          if (var3_int != 0) {
            discarded$6 = diagnostics.append("3. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$7 = diagnostics.append("PRNG: " + this.randomSeed + " " + this.randomCallCount + "\n");
          }
          var4 = var4 ^ 5457 + 31 * this.randomSeed << 5;
          var4 = var4 ^ 43 * this.randomCallCount + 818 << 9;
          if (var3_int != 0) {
            discarded$8 = diagnostics.append("4. " + Integer.toString(var4, 16) + "\n");
          }
          var4 = var4 ^ 7 * this.boardWidth + 61453 << 8;
          var4 = var4 ^ 19 * this.field_T + 17 << 17;
          var4 = var4 ^ 12648430 + this.boardOffset * 17 << 3;
          if (!obfuscationGuard) {
            this.field_Q = -85;
          }
          if (var3_int != 0) {
            discarded$9 = diagnostics.append("5. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$10 = diagnostics.append("Keys and time: " + this.controlMask + " " + this.simulationTick + "\n");
          }
          var4 = var4 ^ 21879 + this.simulationTick * 23 << 12;
          if (var3_int != 0) {
            discarded$11 = diagnostics.append("6. " + Integer.toString(var4, 16) + "\n");
          }
          if (this.motionPaths != null) {
            var5 = 7;
            var12 = (BrickMotionPath) (this.motionPaths.first(-104));
            while (var12 != null) {
              var5 = 6 + var5 * 3 + 5 & 31;
              var7_int = var12.computeSyncChecksum(108, diagnostics);
              var4 = var4 ^ (var7_int << var5 | var5 >>> -var5 + 32);
              var12 = (BrickMotionPath) (this.motionPaths.next((byte) 116));
            }
          }
          if (var3_int != 0) {
            discarded$12 = diagnostics.append("7. Paths: " + Integer.toString(var4, 16) + "\n");
          }
          if (this.brickGroups != null) {
            var5Lifetime1 = 0;
            for (var6 = 0; this.brickGroups.length > var6; var6++) {
              var5Lifetime1Lifetime1 = 31 & 5 + 7 * var6;
              var7 = (Brick) (this.brickGroups[var6].first(-94));
              while (var7 != null) {
                if ((1 & var7.flags) == 0) {
                  var8 = var7.computeSyncChecksum(108, diagnostics);
                  var4 = var4 ^ (var8 << var5Lifetime1Lifetime1 | var8 >>> 32 - var5Lifetime1Lifetime1);
                }
                var7 = (Brick) (this.brickGroups[var6].next((byte) 116));
              }
            }
          }
          if (var3_int != 0) {
            discarded$13 = diagnostics.append("8. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$14 = diagnostics.append("Ball info:\n");
          }
          if (var3_int != 0) {
            discarded$15 = diagnostics.append("Balls queued up: " + this.queuedBalls.size(120) + "\n");
          }
          var14 = (Ball) (this.queuedBalls.first(-13));
          while (var14 != null) {
            var4 = var4 ^ var14.computeSyncChecksum(94, diagnostics);
            var14 = (Ball) (this.queuedBalls.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$16 = diagnostics.append("Balls in play: " + this.activeBalls.size(119) + "\n");
          }
          var10 = (Ball) (this.activeBalls.first(-75));
          while (var10 != null) {
            var4 = var4 ^ var10.computeSyncChecksum(82, diagnostics);
            var10 = (Ball) (this.activeBalls.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$17 = diagnostics.append("9. " + Integer.toString(var4, 16) + "\n");
          }
          var11 = (PowerUp) (this.fallingPowerUps.first(-61));
          while (var11 != null) {
            var4 = var4 ^ var11.computeSyncChecksum(114, diagnostics);
            var11 = (PowerUp) (this.fallingPowerUps.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$18 = diagnostics.append("10. " + Integer.toString(var4, 16) + "\n");
          }
          var4 = var4 ^ this.paddle.computeSyncChecksum(93, diagnostics);
          if (var3_int != 0) {
            discarded$19 = diagnostics.append("11. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$20 = diagnostics.append("Bubble info " + this.bubbles.size(124) + "\n");
            discarded$21 = diagnostics.append(this.bubbleSeed + " " + this.bubbleTick + "\n");
          }
          var13 = (BubbleDistortion) (this.bubbles.first(-90));
          while (var13 != null) {
            var4 = var4 ^ var13.computeSyncChecksum(114, diagnostics);
            var13 = (BubbleDistortion) (this.bubbles.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$22 = diagnostics.append("12. " + Integer.toString(var4, 16) + "\n");
          }
          for (var5Lifetime2 = 3; var5Lifetime2 < 29; var5Lifetime2++) {
            var6Lifetime1 = this.powerUpDropCounters[var5Lifetime2] % WeightedLruCache.powerUpDropPeriods[var5Lifetime2];
            var6Lifetime1 = (15 & var6Lifetime1) << 4 | var6Lifetime1 >> 4;
            var4 = var4 ^ var6Lifetime1 * 3 + 26386 << (15 & var5Lifetime2);
          }
          if (var3_int != 0) {
            discarded$23 = diagnostics.append("13. " + Integer.toString(var4, 16) + "\n");
          }
          var4 = var4 ^ 17 + 3 * this.field_n << 3;
          if (var3_int != 0) {
            discarded$24 = diagnostics.append("14. " + Integer.toString(var4, 16) + "\n");
          }
          stackIn_97_0 = var4;
          return stackIn_97_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("j.L(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_jb = (String[][]) null;
        if (param0 != -2947) {
          field_jb = (String[][]) null;
        }
    }

    final void choosePendingMessage(String[] messages, byte obfuscationGuard) {
        try {
          this.pendingMessage = messages[aa.nextBoundedJavaRandom(messages.length, this.messageRandom, true)];
          if (obfuscationGuard != 75) {
            this.field_hb = -123;
          }
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "j.E(" + (messages != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    private final int ticksUntilPendingPowerUp(int typeId, int obfuscationGuard, int lookaheadTicks) {
        int historyIndex = 0;
        PowerUp powerUp = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard <= 8) {
          return -87;
        }
        lookaheadTicks = this.simulationTick + lookaheadTicks;
        for (historyIndex = this.nextPowerUpIndex; historyIndex <= this.powerUpHistory.latestIndex; historyIndex++) {
          powerUp = (PowerUp) (this.powerUpHistory.get(historyIndex, 111));
          if (!(lookaheadTicks >= powerUp.activationTick)) {
            return -1;
          }
          if (powerUp.typeId == typeId) {
            return powerUp.activationTick - this.simulationTick;
          }
        }
        return -1;
    }

    final void readBoardSnapshot(boolean skipExtension, PacketBuffer packet, int boardMode) {
        int var6_int = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        NodeDeque[] var5 = null;
        NodeDeque var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        PowerUp var11 = null;
        int var12 = 0;
        Brick var13 = null;
        BrickMotionPath var14 = null;
        Ball var15 = null;
        Ball var16 = null;
        int var4_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          this.boardState = packet.readUnsignedByte(255);
          this.stateTicks = packet.readUnsignedShort(65280);
          this.simulationTick = packet.readInt(255);
          this.snapshotHistory.latestIndex = -1 + this.simulationTick / 5;
          this.score = packet.readUnsignedMedium((byte) -34);
          this.levelIndex = packet.readUnsignedByte(255);
          this.lives = packet.readUnsignedByte(255);
          this.field_m = packet.readUnsignedShort(65280);
          this.field_Q = packet.readUnsignedShort(65280);
          this.positionWord = packet.readUnsignedShort(65280);
          this.randomCallCount = 0;
          var4_int = 0;
          var5_int = packet.readInt(255);
          while (var4_int < var5_int) {
            this.nextRandomInt(118);
            var4_int++;
          }
          this.field_n = packet.readUnsignedShort(65280);
          var4_intLifetime1 = this.field_n % 16;
          var5 = new NodeDeque[3];
          for (var6_int = 0; var6_int < var5.length; var6_int++) {
            var5[var6_int] = new NodeDeque();
            var7 = packet.readUnsignedShort(65280);
            for (var8 = 0; var7 > var8; var8++) {
              var13 = new Brick();
              var13.readBodySnapshot(92, packet);
              var13.y256 = var13.y256 - (var4_intLifetime1 * 1 << 8);
              var5[var6_int].addLast(var13, (byte) 3);
            }
          }
          var6 = new NodeDeque();
          var7Lifetime1 = packet.readUnsignedShort(65280);
          for (var8Lifetime1 = 0; var8Lifetime1 < var7Lifetime1; var8Lifetime1++) {
            var14 = new BrickMotionPath();
            var14.readBodySnapshot(114, packet);
            var6.addLast(var14, (byte) 3);
          }
          this.installLevelBricks(var6, 9, var5);
          this.queuedBalls.clear((byte) -79);
          this.activeBalls.clear((byte) -118);
          var8Lifetime2 = packet.readUnsignedByte(255);
          for (var9 = 0; var8Lifetime2 > var9; var9++) {
            var15 = new Ball();
            var15.readBodySnapshot(110, packet);
            this.queuedBalls.addLast(var15, (byte) 3);
          }
          var8Lifetime3 = packet.readUnsignedByte(255);
          for (var9Lifetime1 = 0; var8Lifetime3 > var9Lifetime1; var9Lifetime1++) {
            var16 = new Ball();
            var16.readBodySnapshot(107, packet);
            this.activeBalls.addLast(var16, (byte) 3);
          }
          this.fallingPowerUps.clear((byte) -63);
          var9Lifetime2 = packet.readUnsignedByte(255);
          for (var10 = 0; var9Lifetime2 > var10; var10++) {
            var11 = new PowerUp();
            var11.readBodySnapshot(97, packet);
            this.fallingPowerUps.addLast(var11, (byte) 3);
          }
          this.paddle.readBodySnapshot(100, packet);
          this.bubbles.clear((byte) -83);
          this.bubbleTick = packet.readInt(255);
          this.bubbleSeed = packet.readInt(255);
          this.recreateBubbles(1000);
          if (skipExtension) {
            return;
          }
          for (var10Lifetime1 = 3; var10Lifetime1 < 29; var10Lifetime1++) {
            this.powerUpDropCounters[var10Lifetime1] = (byte)packet.readUnsignedByte(255);
          }
          this.field_r = packet.readUnsignedShort(65280);
          this.positionOrderTicks = packet.readUnsignedShort(65280);
          this.positionWord = packet.readInt(255);
          this.field_G = this.positionWord + this.boardOffset << 8;
          stackIn_30_0 = (1 == boardMode) ? 15 : 9;
          CacheIoRequest.addBoardBorders(stackIn_30_0, this.brickGroups[2], 16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("j.T(").append(skipExtension).append(',');
          if (packet == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(boardMode).append(')').toString());
        }
    }

    final void setBriefEyeExpression(int obfuscationGuard, int eyeExpression) {
        if (obfuscationGuard != 16387) {
          Paddle unusedPaddle = (Paddle) null;
          this.addPaddleScore(-103, (Paddle) null, -75);
        }
        this.setEyeExpression(eyeExpression, true, 50);
    }

    final void recreateBubbles(int obfuscationGuard) {
        int column = 0;
        int row = 0;
        int elapsedTick = 0;
        IsaacGenerator random;
        int cellWidth;
        int cellHeight;
        int x256;
        int y256;
        int velocityY256;
        int radius256;
        BubbleDistortion bubble;
        int clientBranchFlag;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        if (this.bubbleTick >= 0 &&
          this.bubbleTick <= 564) {
          if (obfuscationGuard != 1000) {
            this.eyeExpressionTicks = 95;
          }
          random = new IsaacGenerator(new int[]{this.bubbleSeed});
          cellWidth = (-68 + this.boardWidth) / 8;
          cellHeight = 60;
          for (column = 0; column < 8; column++) {
            for (row = 0; row < 8; row++) {
              x256 = cellWidth * column + 34 + random.nextBoundedInt(-37880252, cellWidth) << 8;
              y256 = 480 - (-(cellHeight * row) - random.nextBoundedInt(-37880252, cellHeight)) << 8;
              velocityY256 = -768;
              radius256 = 5120 + random.nextBoundedInt(obfuscationGuard ^ -37880404, 2);
              bubble = new BubbleDistortion(x256, y256, 0, velocityY256, radius256, 0);
              bubble.oscillationOffset = random.nextBoundedInt(obfuscationGuard ^ -37880404, 4096);
              bubble.oscillationStep = random.nextBoundedInt(-37880252, 100) + 300;
              bubble.oscillationAmplitude = 8000 + random.nextBoundedInt(-37880252, 1000);
              this.bubbles.addLast(bubble, (byte) 3);
              for (elapsedTick = 0; this.bubbleTick > elapsedTick; elapsedTick++) {
                bubble.advance(-2081170685);
              }
            }
          }
          return;
        }
    }

    final static void playGameplaySound(PcmSound sound, int obfuscationGuard, int volume) {
        try {
          hm.playSoundAtVolume(0, sound, volume);
          if (obfuscationGuard > -29) {
            PcmSound var4 = (PcmSound) null;
            PlayerBoard.playGameplaySound((PcmSound) null, -15, 82);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "j.P(" + (sound != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + volume + ')');
        }
    }

    private final void resetServe(byte obfuscationGuard, boolean resetAccounting, int launchAngle) {
        if (resetAccounting) {
          this.field_t = 0;
          this.field_m = 0;
        }
        this.paddle.resetSize(obfuscationGuard ^ 85);
        this.queuedBalls.clear((byte) -82);
        this.queuedBalls.addLast(new Ball(this.paddle, launchAngle, 1536), (byte) 3);
        this.fallingPowerUps.clear((byte) -92);
        this.activeBalls.clear((byte) -88);
        if (obfuscationGuard != 85) {
          this.rightKeyCode = 84;
        }
    }

    final void resetServeWithRandomAngle(int obfuscationGuard, boolean resetAccounting) {
        if (obfuscationGuard != 26496) {
          return;
        }
        this.resetServe((byte) 85, resetAccounting, this.nextRandomBoundedInt(2048, (byte) 62) - 1024);
    }

    final void beginDefeatTransition(byte obfuscationGuard) {
        this.boardState = 3;
        this.stateTicks = 0;
        if (obfuscationGuard != 22) {
          this.levelState = (IntNode) null;
        }
    }

    final void advancePowerUpWarnings(int obfuscationGuard) {
        int fieldTemp$2 = 0;
        if (obfuscationGuard != -101) {
          return;
        }
        if (this.displayedWarning != null) {
          fieldTemp$2 = this.displayedWarning.ageTicks + 1;
          this.displayedWarning.ageTicks = this.displayedWarning.ageTicks + 1;
          if (!(fieldTemp$2 < 100)) {
            this.displayedWarning = this.pendingWarning;
            this.pendingWarning = null;
          }
        } else {
          this.displayedWarning = this.pendingWarning;
          this.pendingWarning = null;
        }
        if (this.pendingWarning == null) {
          this.pendingWarning = this.selectPowerUpWarning(-99);
        } else {
          this.pendingWarning.ageTicks = this.pendingWarning.ageTicks + 1;
        }
    }

    final int nextRandomInt(int obfuscationGuard) {
        int var2 = -93 / ((obfuscationGuard - 76) / 39);
        this.randomCallCount = this.randomCallCount + 1;
        return this.seededRandom.nextInt(115);
    }

    final void toggleBrickTypes26And27(int obfuscationGuard) {
        int groupIndex = 0;
        Brick brick;
        int unusedGameFlag;
        StringBuilder unusedDiagnosticBuilder;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -27) {
          unusedDiagnosticBuilder = (StringBuilder) null;
          this.computeBoardChecksum(true, (StringBuilder) null);
        }
        for (groupIndex = 0; this.brickGroups.length > groupIndex; groupIndex++) {
          brick = (Brick) (this.brickGroups[groupIndex].first(-81));
          while (brick != null) {
            if (brick.typeId == 26 &&
              brick.pendingTypeId == 26) {
              brick.pendingTypeId = 27;
              brick.stateWord = 0;
              brick.transitionCode = 10;
            } else if (26 == brick.typeId &&
              brick.pendingTypeId == 27) {
              brick.pendingTypeId = 26;
              brick.typeId = 27;
              brick.stateWord = -brick.stateWord + 15;
              brick.transitionCode = 10;
            } else if (brick.typeId == 26 &&
              brick.pendingTypeId < 0) {
              brick.transitionCode = 10;
              brick.pendingTypeId = 27;
              brick.stateWord = 0;
            } else if (brick.typeId == 27 &&
              brick.pendingTypeId == 26) {
              brick.typeId = 26;
              brick.stateWord = 15 - brick.stateWord;
              brick.transitionCode = 10;
              brick.pendingTypeId = 27;
            } else {
              if (27 == brick.typeId &&
                brick.pendingTypeId == 27) {
                throw new RuntimeException();
              }
              if (brick.typeId == 27) {
                if (brick.pendingTypeId >= 0) {
                  brick = (Brick) (this.brickGroups[groupIndex].next((byte) 116));
                  continue;
                }
                brick.pendingTypeId = 26;
                brick.transitionCode = 10;
                brick.stateWord = 0;
              }
            }
            brick = (Brick) (this.brickGroups[groupIndex].next((byte) 116));
          }
        }
    }

    final int nextRandomBoundedInt(int bound, byte obfuscationGuard) {
        this.randomCallCount = this.randomCallCount + 1;
        if (obfuscationGuard != 62) {
          this.field_J = 79;
        }
        return this.seededRandom.nextBoundedInt(-37880252, bound);
    }

    final void setEyeExpression(int eyeExpression, boolean obfuscationGuard, int ticks) {
        this.eyeExpressionTicks = ticks;
        this.eyeExpression = eyeExpression;
        if (!obfuscationGuard) {
          this.advancePowerUpWarnings(27);
        }
    }

    final void teleportBall(byte obfuscationGuard, Brick sourcePortal, Ball ball) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String sourceSummary = null;
        StringBuilder ballContextBuilder = null;
        String ballSummary = null;
        RuntimeException caughtFailure = null;
        int destinationIndex = 0;
        RuntimeException failure = null;
        Brick destinationPortal = null;
        int angleSample = 0;
        int outgoingAngle = 0;
        try {
          destinationIndex = this.nextRandomBoundedInt(-1 + this.portalBricks.length, (byte) 62);
          if (sourcePortal.portalIndex <= destinationIndex) {
            destinationIndex++;
          }
          destinationPortal = this.portalBricks[destinationIndex];
          ball.x256 = destinationPortal.width256 / 2 + destinationPortal.x256 - ball.radius256;
          if (obfuscationGuard != -63) {
            this.messageTicks = -27;
          }
          ball.y256 = -(2 * ball.radius256) + destinationPortal.y256;
          angleSample = this.nextRandomBoundedInt(65536, (byte) 62);
          outgoingAngle = MouseInput.a(angleSample, -1, 33554432) + MouseInput.a(-angleSample + 65536, -1, 67108864);
          outgoingAngle = outgoingAngle >> 16;
          if (ball.velocityX256 < 0) {
            outgoingAngle = -outgoingAngle;
            ball.redirectVelocity(6546, outgoingAngle);
          } else {
            ball.redirectVelocity(6546, outgoingAngle);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("j.U(").append(obfuscationGuard).append(',');
          if (sourcePortal == null) {
            sourceSummary = "null";
          } else {
            sourceSummary = "{...}";
          }
          ballContextBuilder = ((StringBuilder) (Object) contextBuilder).append(sourceSummary).append(',');
          if (ball == null) {
            ballSummary = "null";
          } else {
            ballSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) ballContextBuilder).append(ballSummary).append(')').toString());
        }
    }

    final void addBrickScore(int points, Brick brick, int heightDivisor) {
        try {
          this.addScore(points, false, brick.x256 + brick.width256 / 2, brick.height256 / heightDivisor + brick.y256);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "j.I(" + points + ',' + (brick != null ? "{...}" : "null") + ',' + heightDivisor + ')');
        }
    }

    final void addPaddleScore(int points, Paddle paddle, int widthDivisor) {
        try {
          this.addScore(points, false, paddle.x256 + paddle.width256 / widthDivisor, -12800 + paddle.y256);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "j.M(" + points + ',' + (paddle != null ? "{...}" : "null") + ',' + widthDivisor + ')');
        }
    }

    final void addScore(int points, boolean resetStateWord, int x256, int y256) {
        int var6 = 0;
        int var5 = 0;
        if (100 < this.nextRandomBoundedInt(200, (byte) 62)) {
          var5 = points;
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + var5;
        } else {
          var5 = points;
          var6 = this.nextRandomBoundedInt(50, (byte) 62);
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - var6 * var5;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + (1 + var6) * var5;
        }
        if (resetStateWord) {
          this.field_l = 1;
        }
        this.score = this.score + points;
        this.scorePopups.addLast(new ScorePopup(points, x256, y256), (byte) 3);
    }

    final boolean advancePowerUpDropCounter(int obfuscationGuard, int typeId) {
        byte incrementedCounter = 0;
        if (WeightedLruCache.powerUpDropPeriods[typeId] > 0) {
          incrementedCounter = (byte)(this.powerUpDropCounters[typeId] + 1);
          this.powerUpDropCounters[typeId] = incrementedCounter;
          this.powerUpDropCounters[typeId] = (byte)(incrementedCounter % WeightedLruCache.powerUpDropPeriods[typeId]);
        }
        if (obfuscationGuard != 26) {
          this.setBriefEyeExpression(-111, 112);
        }
        return this.powerUpDropCounters[typeId] == 0 ? true : false;
    }

    PlayerBoard(int boardWidth, int initialBoardOffset, int controlSet, int randomSeed, int characterIndex) {
        this.outgoingInputMasks = new int[5];
        this.controlMask = 0;
        this.incomingInputBatches = new NodeDeque();
        this.lives = 4;
        this.score = 0;
        this.scorePopups = new NodeDeque();
        this.queuedBalls = new NodeDeque();
        this.activeBalls = new NodeDeque();
        this.ballPulses = new NodeDeque();
        this.fallingPowerUps = new NodeDeque();
        this.bubbles = new NodeDeque();
        this.powerUpHistory = new ObjectHistoryBuffer(500);
        this.levelState = new IntNode();
        this.field_G = -1;
        this.powerUpDropCounters = new byte[29];
        this.messageRandom = new Random();
        this.positionOrderTicks = -1;
        this.bubbleTick = -1;
        this.field_wb = 466;
        this.boardWidth = boardWidth;
        this.boardOffset = initialBoardOffset;
        this.field_G = initialBoardOffset << 8;
        this.field_T = this.boardWidth / 2;
        this.paddle = new Paddle(this.field_T << 8, 0, 0, this.boardWidth << 8);
        this.randomSeed = randomSeed;
        this.boardState = 0;
        this.seededRandom = new IsaacGenerator(new int[]{this.randomSeed});
        this.powerUpMeterLevels256 = new int[29];
        this.powerUpMeterVelocities256 = new int[29];
        this.snapshotHistory = new ObjectHistoryBuffer(500);
        this.setBriefEyeExpression(16387, 0);
        this.characterIndex = characterIndex;
        if (HighscoresScreen.field_w == null) {
          HighscoresScreen.field_w = new int[2][3];
          HighscoresScreen.field_w[0][2] = PcmPlayerService.field_e;
          HighscoresScreen.field_w[0][0] = EmailAvailabilityRequest.field_f;
          HighscoresScreen.field_w[0][1] = HorizontalFrameHelpers.field_b;
          HighscoresScreen.field_w[1][2] = VolcanicBackground.field_u;
          HighscoresScreen.field_w[1][1] = ce.field_d;
          HighscoresScreen.field_w[1][0] = jl.field_b;
        }
        this.leftKeyCode = HighscoresScreen.field_w[controlSet][0];
        this.rightKeyCode = HighscoresScreen.field_w[controlSet][1];
        this.actionKeyCode = HighscoresScreen.field_w[controlSet][2];
    }

    static {
        field_jb = new String[][]{new String[]{"1", "3", "5", "Unlimited"}};
    }
}
