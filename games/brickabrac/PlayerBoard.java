/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlayerBoard extends IntrusiveNode {
    NodeDeque field_eb;
    int simulationTick;
    int[] field_vb;
    static String[][] field_jb;
    int field_db;
    int field_bb;
    int field_j;
    NodeDeque scorePopups;
    int field_rb;
    int score;
    int field_I;
    int field_q;
    private ObjectHistoryBuffer snapshotHistory;
    Paddle paddle;
    NodeDeque queuedBalls;
    NodeDeque activeBalls;
    NodeDeque field_x;
    int field_A;
    NodeDeque fallingPowerUps;
    NodeDeque field_C;
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
    int field_L;
    int field_P;
    byte[] field_o;
    int field_Z;
    private int randomSeed;
    int field_G;
    private Random field_B;
    int boardWidth;
    private IsaacGenerator seededRandom;
    private int field_T;
    int field_wb;
    int field_J;
    boolean field_tb;
    int field_p;
    int field_H;
    int field_k;
    int field_i;
    private Brick[] portalBricks;
    lj field_D;
    int field_S;
    int field_r;
    int field_E;
    String field_lb;
    int[] field_cb;
    int field_ib;
    int field_U;
    lj field_w;
    int field_R;
    int field_y;
    int field_t;
    int field_n;
    int field_l;
    int field_M;
    String field_fb;
    int[] field_xb;
    int field_V;
    int field_zb;

    final void a(NodeDeque param0, int param1, NodeDeque[] param2) {
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
          this.field_S = 0;
          this.brickGroups = param2;
          this.field_L = 0;
          this.motionPaths = param0;
          if (this.brickGroups == null) {
            return;
          }
          if (this.motionPaths != null) {
            NanoGameClock.attachBrickMotionPaths(this.brickGroups, (byte) 35, this.motionPaths, true);
          }
          if (param1 != 9) {
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
                  this.field_S = this.field_S | 1 << var7_ref.typeId;
                }
                decompiledFrameRemainder0 = (var7_ref.typeId != 0 ||
                  2 != var7_ref.pendingTypeId);
                if (decompiledFrameRemainder0) {
                  this.field_L = this.field_L + 1;
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
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    private final lj g(int param0) {
        int var2;
        int var3;
        int var4;
        Ball var5;
        int var6;
        Ball var5Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = this.ticksUntilPendingPowerUp(3, 96, 25);
        if (var2 != -1 &&
          var2 > this.paddle.field_w) {
          return new lj(3);
        }
        if (this.paddle.field_w > 0 &&
          this.paddle.field_w < 25 &&
          var2 == -1) {
          return new lj(3, false);
        }
        if (this.ticksUntilPendingPowerUp(9, 96, 25) != -1) {
          return new lj(9);
        }
        var3 = this.ticksUntilPendingPowerUp(15, 117, 25);
        if (var3 != -1) {
          var4 = 0;
          var5 = (Ball) (this.queuedBalls.first(-98));
          while (var5 != null) {
            if (var3 > var5.phaseTicks) {
              var4 = 1;
            }
            var5 = (Ball) (this.queuedBalls.next((byte) 116));
          }
          var5Lifetime1 = (Ball) (this.activeBalls.first(-95));
          while (var5Lifetime1 != null) {
            if (var5Lifetime1.phaseTicks < var3) {
              var4 = 1;
            }
            var5Lifetime1 = (Ball) (this.activeBalls.next((byte) 116));
          }
          if (var4 != 0) {
            return new lj(15);
          }
        }
        if (this.ticksUntilPendingPowerUp(6, 117, 25) != -1) {
          return new lj(6);
        }
        if (this.ticksUntilPendingPowerUp(16, 74, 25) != -1) {
          return new lj(16);
        }
        if (this.ticksUntilPendingPowerUp(7, 123, 25) != -1) {
          return new lj(7);
        }
        if (param0 >= -81) {
          this.field_E = 12;
        }
        if (this.ticksUntilPendingPowerUp(11, 33, 25) != -1) {
          return new lj(11);
        }
        if (this.ticksUntilPendingPowerUp(8, 84, 25) != -1) {
          return new lj(8);
        }
        if (this.ticksUntilPendingPowerUp(13, 102, 25) != -1) {
          return new lj(13);
        }
        return null;
    }

    final int a(boolean param0, StringBuilder param1) {
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
        il var13 = null;
        Ball var14 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var5Lifetime1Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_4_0 = (param1 == null) ? 0 : 1;
          var3_int = stackIn_4_0;
          if (var3_int != 0) {
            discarded$0 = param1.append("Checksum breakdown for a player.\n");
          }
          var4 = 455818059;
          if (var3_int != 0) {
            discarded$1 = param1.append("State info: " + this.field_Z + " " + this.field_P + "\n");
          }
          var4 = var4 ^ this.field_Z * 83 + 255 << 21;
          var4 = var4 ^ 238 + this.field_P * 73 << 12;
          if (var3_int != 0) {
            discarded$2 = param1.append("1. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$3 = param1.append("Score, Level, Lives: " + this.score + " " + this.levelIndex + " " + this.field_rb + "\n");
          }
          var4 = var4 ^ 65535 + this.score * 29;
          var4 = var4 ^ 15601376 + 67 * this.levelIndex << 3;
          var4 = var4 ^ this.field_rb * 61 + 961453 << 10;
          if (var3_int != 0) {
            discarded$4 = param1.append("2. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$5 = param1.append("Hit brick info: " + this.field_L + " " + this.field_m + " " + this.field_Q + "\n");
          }
          var4 = var4 ^ this.field_L * 11 + (this.field_m * 17 + 14334957);
          var4 = var4 ^ 13287405 + this.field_Q * 103 << 6;
          if (var3_int != 0) {
            discarded$6 = param1.append("3. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$7 = param1.append("PRNG: " + this.randomSeed + " " + this.randomCallCount + "\n");
          }
          var4 = var4 ^ 5457 + 31 * this.randomSeed << 5;
          var4 = var4 ^ 43 * this.randomCallCount + 818 << 9;
          if (var3_int != 0) {
            discarded$8 = param1.append("4. " + Integer.toString(var4, 16) + "\n");
          }
          var4 = var4 ^ 7 * this.boardWidth + 61453 << 8;
          var4 = var4 ^ 19 * this.field_T + 17 << 17;
          var4 = var4 ^ 12648430 + this.boardOffset * 17 << 3;
          if (!param0) {
            this.field_Q = -85;
          }
          if (var3_int != 0) {
            discarded$9 = param1.append("5. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$10 = param1.append("Keys and time: " + this.field_db + " " + this.simulationTick + "\n");
          }
          var4 = var4 ^ 21879 + this.simulationTick * 23 << 12;
          if (var3_int != 0) {
            discarded$11 = param1.append("6. " + Integer.toString(var4, 16) + "\n");
          }
          if (this.motionPaths != null) {
            var5 = 7;
            var12 = (BrickMotionPath) (this.motionPaths.first(-104));
            while (var12 != null) {
              var5 = 6 + var5 * 3 + 5 & 31;
              var7_int = var12.computeSyncChecksum(108, param1);
              var4 = var4 ^ (var7_int << var5 | var5 >>> -var5 + 32);
              var12 = (BrickMotionPath) (this.motionPaths.next((byte) 116));
            }
          }
          if (var3_int != 0) {
            discarded$12 = param1.append("7. Paths: " + Integer.toString(var4, 16) + "\n");
          }
          if (this.brickGroups != null) {
            var5Lifetime1 = 0;
            for (var6 = 0; this.brickGroups.length > var6; var6++) {
              var5Lifetime1Lifetime1 = 31 & 5 + 7 * var6;
              var7 = (Brick) (this.brickGroups[var6].first(-94));
              while (var7 != null) {
                if ((1 & var7.flags) == 0) {
                  var8 = var7.computeSyncChecksum(108, param1);
                  var4 = var4 ^ (var8 << var5Lifetime1Lifetime1 | var8 >>> 32 - var5Lifetime1Lifetime1);
                }
                var7 = (Brick) (this.brickGroups[var6].next((byte) 116));
              }
            }
          }
          if (var3_int != 0) {
            discarded$13 = param1.append("8. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$14 = param1.append("Ball info:\n");
          }
          if (var3_int != 0) {
            discarded$15 = param1.append("Balls queued up: " + this.queuedBalls.size(120) + "\n");
          }
          var14 = (Ball) (this.queuedBalls.first(-13));
          while (var14 != null) {
            var4 = var4 ^ var14.computeSyncChecksum(94, param1);
            var14 = (Ball) (this.queuedBalls.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$16 = param1.append("Balls in play: " + this.activeBalls.size(119) + "\n");
          }
          var10 = (Ball) (this.activeBalls.first(-75));
          while (var10 != null) {
            var4 = var4 ^ var10.computeSyncChecksum(82, param1);
            var10 = (Ball) (this.activeBalls.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$17 = param1.append("9. " + Integer.toString(var4, 16) + "\n");
          }
          var11 = (PowerUp) (this.fallingPowerUps.first(-61));
          while (var11 != null) {
            var4 = var4 ^ var11.computeSyncChecksum(114, param1);
            var11 = (PowerUp) (this.fallingPowerUps.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$18 = param1.append("10. " + Integer.toString(var4, 16) + "\n");
          }
          var4 = var4 ^ this.paddle.computeSyncChecksum(93, param1);
          if (var3_int != 0) {
            discarded$19 = param1.append("11. " + Integer.toString(var4, 16) + "\n");
          }
          if (var3_int != 0) {
            discarded$20 = param1.append("Bubble info " + this.field_C.size(124) + "\n");
            discarded$21 = param1.append(this.field_R + " " + this.field_k + "\n");
          }
          var13 = (il) (this.field_C.first(-90));
          while (var13 != null) {
            var4 = var4 ^ var13.computeSyncChecksum(114, param1);
            var13 = (il) (this.field_C.next((byte) 116));
          }
          if (var3_int != 0) {
            discarded$22 = param1.append("12. " + Integer.toString(var4, 16) + "\n");
          }
          for (var5Lifetime2 = 3; var5Lifetime2 < 29; var5Lifetime2++) {
            var6Lifetime1 = this.field_o[var5Lifetime2] % to.field_f[var5Lifetime2];
            var6Lifetime1 = (15 & var6Lifetime1) << 4 | var6Lifetime1 >> 4;
            var4 = var4 ^ var6Lifetime1 * 3 + 26386 << (15 & var5Lifetime2);
          }
          if (var3_int != 0) {
            discarded$23 = param1.append("13. " + Integer.toString(var4, 16) + "\n");
          }
          var4 = var4 ^ 17 + 3 * this.field_n << 3;
          if (var3_int != 0) {
            discarded$24 = param1.append("14. " + Integer.toString(var4, 16) + "\n");
          }
          stackIn_97_0 = var4;
          return stackIn_97_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("j.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_jb = (String[][]) null;
        if (param0 != -2947) {
          field_jb = (String[][]) null;
        }
    }

    final void a(String[] param0, byte param1) {
        try {
          this.field_lb = param0[aa.a(param0.length, this.field_B, true)];
          if (param1 != 75) {
            this.field_hb = -123;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "j.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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

    final void a(boolean param0, PacketBuffer param1, int param2) {
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
          this.field_Z = param1.readUnsignedByte(255);
          this.field_P = param1.readUnsignedShort(65280);
          this.simulationTick = param1.readInt(255);
          this.snapshotHistory.latestIndex = -1 + this.simulationTick / 5;
          this.score = param1.readUnsignedMedium((byte) -34);
          this.levelIndex = param1.readUnsignedByte(255);
          this.field_rb = param1.readUnsignedByte(255);
          this.field_m = param1.readUnsignedShort(65280);
          this.field_Q = param1.readUnsignedShort(65280);
          this.field_p = param1.readUnsignedShort(65280);
          this.randomCallCount = 0;
          var4_int = 0;
          var5_int = param1.readInt(255);
          while (var4_int < var5_int) {
            this.nextRandomInt(118);
            var4_int++;
          }
          this.field_n = param1.readUnsignedShort(65280);
          var4_intLifetime1 = this.field_n % 16;
          var5 = new NodeDeque[3];
          for (var6_int = 0; var6_int < var5.length; var6_int++) {
            var5[var6_int] = new NodeDeque();
            var7 = param1.readUnsignedShort(65280);
            for (var8 = 0; var7 > var8; var8++) {
              var13 = new Brick();
              var13.readBodySnapshot(92, param1);
              var13.y256 = var13.y256 - (var4_intLifetime1 * 1 << 8);
              var5[var6_int].addLast(var13, (byte) 3);
            }
          }
          var6 = new NodeDeque();
          var7Lifetime1 = param1.readUnsignedShort(65280);
          for (var8Lifetime1 = 0; var8Lifetime1 < var7Lifetime1; var8Lifetime1++) {
            var14 = new BrickMotionPath();
            var14.readBodySnapshot(114, param1);
            var6.addLast(var14, (byte) 3);
          }
          this.a(var6, 9, var5);
          this.queuedBalls.clear((byte) -79);
          this.activeBalls.clear((byte) -118);
          var8Lifetime2 = param1.readUnsignedByte(255);
          for (var9 = 0; var8Lifetime2 > var9; var9++) {
            var15 = new Ball();
            var15.readBodySnapshot(110, param1);
            this.queuedBalls.addLast(var15, (byte) 3);
          }
          var8Lifetime3 = param1.readUnsignedByte(255);
          for (var9Lifetime1 = 0; var8Lifetime3 > var9Lifetime1; var9Lifetime1++) {
            var16 = new Ball();
            var16.readBodySnapshot(107, param1);
            this.activeBalls.addLast(var16, (byte) 3);
          }
          this.fallingPowerUps.clear((byte) -63);
          var9Lifetime2 = param1.readUnsignedByte(255);
          for (var10 = 0; var9Lifetime2 > var10; var10++) {
            var11 = new PowerUp();
            var11.readBodySnapshot(97, param1);
            this.fallingPowerUps.addLast(var11, (byte) 3);
          }
          this.paddle.readBodySnapshot(100, param1);
          this.field_C.clear((byte) -83);
          this.field_k = param1.readInt(255);
          this.field_R = param1.readInt(255);
          this.f(1000);
          if (param0) {
            return;
          }
          for (var10Lifetime1 = 3; var10Lifetime1 < 29; var10Lifetime1++) {
            this.field_o[var10Lifetime1] = (byte)param1.readUnsignedByte(255);
          }
          this.field_r = param1.readUnsignedShort(65280);
          this.field_M = param1.readUnsignedShort(65280);
          this.field_p = param1.readInt(255);
          this.field_G = this.field_p + this.boardOffset << 8;
          stackIn_30_0 = (1 == param2) ? 15 : 9;
          CacheIoRequest.addBoardBorders(stackIn_30_0, this.brickGroups[2], 16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("j.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 16387) {
          Paddle var4 = (Paddle) null;
          this.a(-103, (Paddle) null, -75);
        }
        this.a(param1, true, 50);
    }

    final void f(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var12 = 0;
        IsaacGenerator var2;
        int var3;
        int var4;
        int var7;
        int var8;
        int var9;
        int var10;
        il var11;
        int var13;
        var13 = BrickABrac.field_J ? 1 : 0;
        if (this.field_k >= 0 &&
          this.field_k <= 564) {
          if (param0 != 1000) {
            this.field_ib = 95;
          }
          var2 = new IsaacGenerator(new int[]{this.field_R});
          var3 = (-68 + this.boardWidth) / 8;
          var4 = 60;
          for (var5 = 0; var5 < 8; var5++) {
            for (var6 = 0; var6 < 8; var6++) {
              var7 = var3 * var5 + 34 + var2.nextBoundedInt(-37880252, var3) << 8;
              var8 = 480 - (-(var4 * var6) - var2.nextBoundedInt(-37880252, var4)) << 8;
              var9 = -768;
              var10 = 5120 + var2.nextBoundedInt(param0 ^ -37880404, 2);
              var11 = new il(var7, var8, 0, var9, var10, 0);
              var11.field_E = var2.nextBoundedInt(param0 ^ -37880404, 4096);
              var11.field_w = var2.nextBoundedInt(-37880252, 100) + 300;
              var11.field_y = 8000 + var2.nextBoundedInt(-37880252, 1000);
              this.field_C.addLast(var11, (byte) 3);
              for (var12 = 0; this.field_k > var12; var12++) {
                var11.d(-2081170685);
              }
            }
          }
          return;
        }
    }

    final static void a(PcmSound param0, int param1, int param2) {
        try {
          hm.a(0, param0, param2);
          if (param1 > -29) {
            PcmSound var4 = (PcmSound) null;
            PlayerBoard.a((PcmSound) null, -15, 82);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "j.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        if (param1) {
          this.field_t = 0;
          this.field_m = 0;
        }
        this.paddle.resetSize(param0 ^ 85);
        this.queuedBalls.clear((byte) -82);
        this.queuedBalls.addLast(new Ball(this.paddle, param2, 1536), (byte) 3);
        this.fallingPowerUps.clear((byte) -92);
        this.activeBalls.clear((byte) -88);
        if (param0 != 85) {
          this.field_j = 84;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 26496) {
          return;
        }
        this.a((byte) 85, param1, this.nextRandomBoundedInt(2048, (byte) 62) - 1024);
    }

    final void a(byte param0) {
        this.field_Z = 3;
        this.field_P = 0;
        if (param0 != 22) {
          this.levelState = (IntNode) null;
        }
    }

    final void c(int param0) {
        int fieldTemp$2 = 0;
        if (param0 != -101) {
          return;
        }
        if (this.field_w != null) {
          fieldTemp$2 = this.field_w.field_m + 1;
          this.field_w.field_m = this.field_w.field_m + 1;
          if (!(fieldTemp$2 < 100)) {
            this.field_w = this.field_D;
            this.field_D = null;
          }
        } else {
          this.field_w = this.field_D;
          this.field_D = null;
        }
        if (this.field_D == null) {
          this.field_D = this.g(-99);
        } else {
          this.field_D.field_m = this.field_D.field_m + 1;
        }
    }

    final int nextRandomInt(int obfuscationGuard) {
        int var2 = -93 / ((obfuscationGuard - 76) / 39);
        this.randomCallCount = this.randomCallCount + 1;
        return this.seededRandom.nextInt(115);
    }

    final void a(int param0) {
        int var2 = 0;
        Brick var3;
        int var4;
        StringBuilder var5;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -27) {
          var5 = (StringBuilder) null;
          this.a(true, (StringBuilder) null);
        }
        for (var2 = 0; this.brickGroups.length > var2; var2++) {
          var3 = (Brick) (this.brickGroups[var2].first(-81));
          while (var3 != null) {
            if (var3.typeId == 26 &&
              var3.pendingTypeId == 26) {
              var3.pendingTypeId = 27;
              var3.stateWord = 0;
              var3.transitionCode = 10;
            } else if (26 == var3.typeId &&
              var3.pendingTypeId == 27) {
              var3.pendingTypeId = 26;
              var3.typeId = 27;
              var3.stateWord = -var3.stateWord + 15;
              var3.transitionCode = 10;
            } else if (var3.typeId == 26 &&
              var3.pendingTypeId < 0) {
              var3.transitionCode = 10;
              var3.pendingTypeId = 27;
              var3.stateWord = 0;
            } else if (var3.typeId == 27 &&
              var3.pendingTypeId == 26) {
              var3.typeId = 26;
              var3.stateWord = 15 - var3.stateWord;
              var3.transitionCode = 10;
              var3.pendingTypeId = 27;
            } else {
              if (27 == var3.typeId &&
                var3.pendingTypeId == 27) {
                throw new RuntimeException();
              }
              if (var3.typeId == 27) {
                if (var3.pendingTypeId >= 0) {
                  var3 = (Brick) (this.brickGroups[var2].next((byte) 116));
                  continue;
                }
                var3.pendingTypeId = 26;
                var3.transitionCode = 10;
                var3.stateWord = 0;
              }
            }
            var3 = (Brick) (this.brickGroups[var2].next((byte) 116));
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

    final void a(int param0, boolean param1, int param2) {
        this.field_ib = param2;
        this.field_y = param0;
        if (!param1) {
          this.c(27);
        }
    }

    final void a(byte param0, Brick param1, Ball param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Brick var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          var4_int = this.nextRandomBoundedInt(-1 + this.portalBricks.length, (byte) 62);
          if (param1.portalIndex <= var4_int) {
            var4_int++;
          }
          var5 = this.portalBricks[var4_int];
          param2.x256 = var5.width256 / 2 + var5.x256 - param2.radius256;
          if (param0 != -63) {
            this.field_i = -27;
          }
          param2.y256 = -(2 * param2.radius256) + var5.y256;
          var6 = this.nextRandomBoundedInt(65536, (byte) 62);
          var7 = MouseInput.a(var6, -1, 33554432) + MouseInput.a(-var6 + 65536, -1, 67108864);
          var7 = var7 >> 16;
          if (param2.velocityX256 < 0) {
            var7 = -var7;
            param2.redirectVelocity(6546, var7);
          } else {
            param2.redirectVelocity(6546, var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("j.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, Brick param1, int param2) {
        try {
          this.addScore(param0, false, param1.x256 + param1.width256 / 2, param1.height256 / param2 + param1.y256);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "j.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, Paddle param1, int param2) {
        try {
          this.addScore(param0, false, param1.x256 + param1.width256 / param2, -12800 + param1.y256);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "j.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void addScore(int points, boolean resetStateWord, int x256, int y256) {
        int var6 = 0;
        int var5 = 0;
        if (100 < this.nextRandomBoundedInt(200, (byte) 62)) {
          var5 = points;
          ep.resultCounterTwo = ep.resultCounterTwo + var5;
        } else {
          var5 = points;
          var6 = this.nextRandomBoundedInt(50, (byte) 62);
          ep.resultCounterTwo = ep.resultCounterTwo - var6 * var5;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + (1 + var6) * var5;
        }
        if (resetStateWord) {
          this.field_l = 1;
        }
        this.score = this.score + points;
        this.scorePopups.addLast(new ScorePopup(points, x256, y256), (byte) 3);
    }

    final boolean a(int param0, int param1) {
        byte dupTemp$0 = 0;
        if (to.field_f[param1] > 0) {
          dupTemp$0 = (byte)(this.field_o[param1] + 1);
          this.field_o[param1] = dupTemp$0;
          this.field_o[param1] = (byte)(dupTemp$0 % to.field_f[param1]);
        }
        if (param0 != 26) {
          this.b(-111, 112);
        }
        return this.field_o[param1] == 0 ? true : false;
    }

    PlayerBoard(int boardWidth, int initialBoardOffset, int paletteVariant, int randomSeed, int initialState) {
        this.field_vb = new int[5];
        this.field_db = 0;
        this.field_eb = new NodeDeque();
        this.field_rb = 4;
        this.score = 0;
        this.scorePopups = new NodeDeque();
        this.queuedBalls = new NodeDeque();
        this.activeBalls = new NodeDeque();
        this.field_x = new NodeDeque();
        this.fallingPowerUps = new NodeDeque();
        this.field_C = new NodeDeque();
        this.powerUpHistory = new ObjectHistoryBuffer(500);
        this.levelState = new IntNode();
        this.field_G = -1;
        this.field_o = new byte[29];
        this.field_B = new Random();
        this.field_M = -1;
        this.field_k = -1;
        this.field_wb = 466;
        this.boardWidth = boardWidth;
        this.boardOffset = initialBoardOffset;
        this.field_G = initialBoardOffset << 8;
        this.field_T = this.boardWidth / 2;
        this.paddle = new Paddle(this.field_T << 8, 0, 0, this.boardWidth << 8);
        this.randomSeed = randomSeed;
        this.field_Z = 0;
        this.seededRandom = new IsaacGenerator(new int[]{this.randomSeed});
        this.field_cb = new int[29];
        this.field_xb = new int[29];
        this.snapshotHistory = new ObjectHistoryBuffer(500);
        this.b(16387, 0);
        this.field_H = initialState;
        if (HighscoresScreen.field_w == null) {
          HighscoresScreen.field_w = new int[2][3];
          HighscoresScreen.field_w[0][2] = aq.field_e;
          HighscoresScreen.field_w[0][0] = ac.field_f;
          HighscoresScreen.field_w[0][1] = fq.field_b;
          HighscoresScreen.field_w[1][2] = td.field_u;
          HighscoresScreen.field_w[1][1] = ce.field_d;
          HighscoresScreen.field_w[1][0] = jl.field_b;
        }
        this.field_bb = HighscoresScreen.field_w[paletteVariant][0];
        this.field_j = HighscoresScreen.field_w[paletteVariant][1];
        this.field_I = HighscoresScreen.field_w[paletteVariant][2];
    }

    static {
        field_jb = new String[][]{new String[]{"1", "3", "5", "Unlimited"}};
    }
}
