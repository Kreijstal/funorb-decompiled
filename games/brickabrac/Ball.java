/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Ball extends CircleBody {
    static RgbSprite activeBoardMaskSprite;
    static UiComponent field_A;
    static String field_H;
    int brickBounceCount;
    static java.math.BigInteger accountRsaExponent;
    static RgbSprite[] field_G;
    private int launchAngle;
    static RgbSprite[] field_K;
    IntHistoryBuffer centerXHistory256;
    int penetrationTicks;
    static String field_x;
    int contactCount;
    int phaseTicks;
    static RgbSprite field_D;
    int destroyedBrickStreak;
    IntHistoryBuffer centerYHistory256;

    private Ball(int launchAngle, int speed) {
        super(0, 0, 0, 0, 1536, 0);
        this.centerXHistory256 = new IntHistoryBuffer(50);
        this.centerYHistory256 = new IntHistoryBuffer(50);
        this.launchAngle = launchAngle;
        this.setVelocityFromAngle(this.launchAngle, speed, 116);
    }

    final static QuickChatParameterType findQuickChatParameterType(int commandId, byte obfuscationGuard) {
        QuickChatParameterType[] var2;
        int var3;
        int var4;
        QuickChatParameterType[] var5;
        int var3Lifetime1;
        QuickChatParameterType[] var2Lifetime1;
        QuickChatParameterType[] var5Lifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard > 4) {
          var5 = SecondaryNodeQueue.getQuickChatParameterTypes(0);
          var2 = var5;
          for (var3 = 0; var5.length > var3; var3++) {
            if (commandId == var5[var3].commandId) {
              return var5[var3];
            }
          }
          return null;
        }
        field_A = (UiComponent) null;
        var5Lifetime1 = SecondaryNodeQueue.getQuickChatParameterTypes(0);
        var2Lifetime1 = var5Lifetime1;
        for (var3Lifetime1 = 0; var5Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
          if (commandId == var5Lifetime1[var3Lifetime1].commandId) {
            return var5Lifetime1[var3Lifetime1];
          }
        }
        return null;
    }

    final void positionOnPaddle(Paddle paddle, int obfuscationGuard) {
        try {
          this.x256 = -1536 + (paddle.x256 + (paddle.width256 >> 1));
          this.y256 = paddle.y256 - 3072;
          this.x256 = this.x256 + paddle.width256 * this.launchAngle / 3072;
          if (obfuscationGuard != 0) {
            this.centerXHistory256 = (IntHistoryBuffer) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "vn.P(" + (paddle != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    Ball(int x256, int y256, int velocityX256, int velocityY256) {
        super(x256, y256, velocityX256, velocityY256, 1536, 0);
        this.centerXHistory256 = new IntHistoryBuffer(50);
        this.centerYHistory256 = new IntHistoryBuffer(50);
    }

    final static int[] createAchievementMask(int obfuscationGuard) {
        if (obfuscationGuard != 8) {
          Ball.createAchievementMask(-23);
          return new int[8];
        }
        return new int[8];
    }

    public static void c(int param0) {
        accountRsaExponent = null;
        activeBoardMaskSprite = null;
        field_G = null;
        field_x = null;
        field_A = null;
        field_H = null;
        field_D = null;
        if (param0 >= 91) {
          field_K = null;
          return;
        }
        accountRsaExponent = (java.math.BigInteger) null;
        field_K = null;
    }

    Ball() {
        this(0, 0, 0, 0);
    }

    final void setVelocityFromAngle(int angle, int speed, int obfuscationGuard) {
        this.velocityX256 = (InteractiveGameClient.sine8192(angle, -4097) >> 8) * speed >> 8;
        if (obfuscationGuard >= 95) {
          this.velocityY256 = (BrickABrac.cosine8192(2048, angle) >> 8) * -speed >> 8;
          return;
        }
    }

    Ball(Paddle paddle, int launchAngle, int speed) {
        this(launchAngle, speed);
        try {
          this.positionOnPaddle(paddle, 0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "vn.<init>(" + (paddle != null ? "{...}" : "null") + ',' + launchAngle + ',' + speed + ')');
        }
    }

    final void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        super.readBodySnapshot(107, packet);
        this.contactCount = packet.readInt(255);
        if (obfuscationGuard < 89) {
          return;
        }
        try {
          this.penetrationTicks = packet.readUnsignedShort(65280);
          this.phaseTicks = packet.readShort(126);
          this.launchAngle = packet.readShort(126);
          this.brickBounceCount = packet.readVarInt((byte) -82);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "vn.L(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 79) {
            this.adjustSpeed(-49, 14);
          }
          var3_int = -19088744 ^ super.computeSyncChecksum(93, diagnostics);
          if (diagnostics != null) {
            discarded$3 = diagnostics.append("base checksum for ball: " + Integer.toString(var3_int, 16) + "\n");
            discarded$4 = diagnostics.append(this.x256 + " " + this.y256 + " " + this.velocityX256 + " " + this.velocityY256 + " " + " " + this.typeId + " " + this.stateWord + "\n");
            discarded$5 = diagnostics.append("Ball Info: " + this.penetrationTicks + " " + this.phaseTicks + " " + this.contactCount + " " + this.launchAngle + "\n");
          }
          var3_int = var3_int ^ this.penetrationTicks * 83 + 119 << 12;
          var3_int = var3_int ^ 57 + this.phaseTicks * 13 << 18;
          var3_int = var3_int ^ 6483 + this.contactCount * 53 << 3;
          var3_int = var3_int ^ this.launchAngle * 5 + 289 << 5;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vn.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void extendPhase(int obfuscationGuard, int ticks) {
        this.phaseTicks = this.phaseTicks + ticks;
        this.penetrationTicks = 0;
        if (obfuscationGuard > -27) {
          this.setVelocityFromAngle(119, 71, 24);
        }
    }

    final void adjustSpeed(int speedFloorThreshold, int speedDelta) {
        int currentSpeed = CacheIoRequest.approximateSqrt256(this.velocityX256 * this.velocityX256 + this.velocityY256 * this.velocityY256, 2) >> 8;
        int targetSpeed = speedDelta + currentSpeed;
        if (targetSpeed < speedFloorThreshold) {
          targetSpeed = 512;
        }
        if (targetSpeed > 3840) {
          targetSpeed = 3840;
        }
        this.velocityX256 = this.velocityX256 * targetSpeed / currentSpeed;
        this.velocityY256 = targetSpeed * this.velocityY256 / currentSpeed;
    }

    final void extendPenetration(byte obfuscationGuard, int ticks) {
        if (obfuscationGuard == 40) {
          this.penetrationTicks = this.penetrationTicks + ticks;
          this.phaseTicks = 0;
          return;
        }
        field_K = (RgbSprite[]) null;
        this.penetrationTicks = this.penetrationTicks + ticks;
        this.phaseTicks = 0;
    }

    final void redirectVelocity(int obfuscationGuard, int angle) {
        this.setVelocityFromAngle(angle, CacheIoRequest.approximateSqrt256(this.velocityY256 * this.velocityY256 + this.velocityX256 * this.velocityX256, 2) >> 8, 107);
        if (obfuscationGuard != 6546) {
          this.penetrationTicks = -29;
        }
    }

    static {
        field_x = "Unpacking levels";
        field_H = "To server list";
        accountRsaExponent = new java.math.BigInteger("65537");
    }
}
