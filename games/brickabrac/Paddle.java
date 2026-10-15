/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Paddle extends RectangleBody {
    int catchTicks;
    private int reboundSpeedStage;
    int leftBound256;
    int reversedControlTicks;
    int rightBound256;
    static UiComponent field_C;
    static int field_x;
    private int centerX256;
    static int[] projectedVertexDepth;
    static String field_G;
    int sizeStage;
    int aftertouchTicks;
    static int textChoiceOuterPaddingY;

    public static void e(int param0) {
        field_C = null;
        int var1 = -6 / ((param0 + 5) / 47);
        field_G = null;
        projectedVertexDepth = null;
    }

    Paddle(int centerX256, int y256, int leftBound256, int rightBound256) {
        super(0, y256, 0, 0, 22528, 3840, 0);
        this.reboundSpeedStage = 1;
        this.rightBound256 = rightBound256;
        this.centerX256 = centerX256;
        this.leftBound256 = leftBound256;
        this.resetSize(0);
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = super.computeSyncChecksum(105, diagnostics) ^ 1381323349;
          if (diagnostics != null) {
            discarded$4 = diagnostics.append("base checksum for paddle: " + Integer.toString(var3_int, 16) + "\n");
            discarded$5 = diagnostics.append(this.x256 + " " + this.y256 + " " + this.velocityX256 + " " + this.velocityY256 + " " + " " + this.typeId + " " + this.stateWord + "\n");
            discarded$6 = diagnostics.append(this.leftBound256 + " " + this.rightBound256 + " " + this.centerX256 + " " + this.sizeStage + " " + " " + this.reversedControlTicks + " " + this.catchTicks + "\n");
            discarded$7 = diagnostics.append(this.reboundSpeedStage + " " + this.aftertouchTicks + "\n");
          }
          var3_int = var3_int ^ (this.rightBound256 * 41 << 5) + (this.leftBound256 * 37 << 1);
          var3_int = var3_int + (64175 + this.centerX256 * 11);
          var3_int = var3_int ^ 51 + this.sizeStage * 31 << 22;
          var3_int = var3_int ^ 85 + this.reversedControlTicks * 59 << 11;
          if (obfuscationGuard <= 79) {
            this.reversedControlTicks = 12;
          }
          var3_int = var3_int + (this.catchTicks * 29 << 26);
          var3_int = var3_int ^ 10 + 13 * this.reboundSpeedStage << 28;
          var3_int = var3_int ^ this.aftertouchTicks * 83 + 45050 << 2;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vo.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != CircleBody.reportAbuseDialog) {
          var3 = CircleBody.reportAbuseDialog.updateAndPollReason(param1, 8421504);
          if (-2 == var3) {
            if (param2 <= 69) {
              projectedVertexDepth = (int[]) null;
              return;
            }
            return;
          }
          if (var3 != -1) {
            var4 = CircleBody.reportAbuseDialog.isMuteRequested(72) ? 1 : 0;
            Widget.writeAbuseReport(var3, param0, CircleBody.reportAbuseDialog.reportTargetId, 1, var4 != 0, CircleBody.reportAbuseDialog.getReportedName(107));
          }
          CircleBody.reportAbuseDialog = null;
          ActivityIndicatorWidget.f((byte) -124);
        }
        if (param2 > 69) {
          return;
        }
        projectedVertexDepth = (int[]) null;
    }

    final void increaseReboundSpeed(boolean obfuscationGuard) {
        if (this.reboundSpeedStage != 8) {
          this.reboundSpeedStage = this.reboundSpeedStage + 1;
          if (!obfuscationGuard) {
            field_C = (UiComponent) null;
          }
          return;
        }
    }

    final void onCircleContact(byte obfuscationGuard, PlayerBoard board, CircleBody circle) {
        int relativeNormalMotion = 0;
        int targetSpeed256 = 0;
        int reboundCurveRadius256 = 0;
        int reboundX256 = 0;
        int reboundNormalY256 = 0;
        int twiceNormalProjection256 = 0;
        int candidateVelocityX256 = 0;
        int candidateVelocityY256 = 0;
        int unusedGameFlag = 0;
        Ball ball = null;
        int minimumReboundAngle8192 = 0;
        int candidateSlopeQ16 = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String boardSummary = null;
        StringBuilder circleContextBuilder = null;
        String circleSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int incomingSpeed256;
        int reflectedSpeed256;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          super.onCircleContact(obfuscationGuard, board, circle);
          ball = (Ball) (circle);
          ball.brickBounceCount = 0;
          ball.contactCount = ball.contactCount + 1;
          if (IntegerValidationHelpers.collisionFace != 1) {
            if (IntegerValidationHelpers.collisionFace == 2) {
              circle.velocityY256 = -circle.velocityY256;
              return;
            }
            circle.velocityX256 = -circle.velocityX256;
            relativeNormalMotion = (this.velocityX256 - circle.velocityX256) * SpriteGeometry.collisionNormalX256;
            if (relativeNormalMotion >= 0) {
              return;
            }
            circle.velocityX256 = this.velocityX256;
            return;
          }
          incomingSpeed256 = CacheIoRequest.approximateSqrt256(-ScreenshotViewer.multiplyQ8(circle.velocityX256, -circle.velocityX256, 93) - ScreenshotViewer.multiplyQ8(circle.velocityY256, -circle.velocityY256, 114) << 8, obfuscationGuard - 51) >> 8;
          targetSpeed256 = this.reboundSpeedStage * 16 + incomingSpeed256;
          if (3840 < targetSpeed256) {
            targetSpeed256 = 3840;
          }
          reboundCurveRadius256 = 43520;
          reboundX256 = circle.x256 + circle.radius256 - (this.x256 + (this.width256 >> 1));
          reboundNormalY256 = -CacheIoRequest.approximateSqrt256(ScreenshotViewer.multiplyQ8(reboundX256, -reboundX256, 113) - ScreenshotViewer.multiplyQ8(reboundCurveRadius256, -reboundCurveRadius256, 111) << 8, 2);
          reboundNormalY256 = reboundNormalY256 / reboundCurveRadius256;
          reboundX256 = (reboundX256 << 8) / reboundCurveRadius256;
          twiceNormalProjection256 = circle.velocityY256 * reboundNormalY256 + reboundX256 * circle.velocityX256 >> 7;
          candidateVelocityX256 = -(reboundX256 * twiceNormalProjection256 >> 8) + (circle.velocityX256 + 8) - board.nextRandomBoundedInt(16, (byte) 62);
          candidateVelocityY256 = -(twiceNormalProjection256 * reboundNormalY256 >> 8) + (circle.velocityY256 + (-board.nextRandomBoundedInt(16, (byte) 62) + 8));
          if (candidateVelocityX256 == 0) {
            circle.velocityY256 = candidateVelocityY256;
            circle.velocityX256 = candidateVelocityX256;
          } else {
            minimumReboundAngle8192 = 341;
            if (candidateVelocityY256 * candidateVelocityX256 <= 0) {
              candidateSlopeQ16 = -((candidateVelocityY256 << 8) / candidateVelocityX256) << 8;
            } else {
              candidateSlopeQ16 = (candidateVelocityY256 << 8) / candidateVelocityX256 << 8;
            }
            if (minimumReboundAngle8192 < AppletFlowHelpers.atan8192FromQ16(candidateSlopeQ16, 30922)) {
              circle.velocityY256 = candidateVelocityY256;
              circle.velocityX256 = candidateVelocityX256;
            } else {
              circle.velocityY256 = -circle.velocityY256;
            }
          }
          reflectedSpeed256 = CacheIoRequest.approximateSqrt256(-ScreenshotViewer.multiplyQ8(circle.velocityX256, -circle.velocityX256, obfuscationGuard ^ 85) - ScreenshotViewer.multiplyQ8(circle.velocityY256, -circle.velocityY256, 95) << 8, obfuscationGuard ^ 55) >> 8;
          circle.velocityX256 = targetSpeed256 * circle.velocityX256 / reflectedSpeed256;
          circle.velocityY256 = circle.velocityY256 * targetSpeed256 / reflectedSpeed256;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("vo.E(").append(obfuscationGuard).append(',');
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          circleContextBuilder = ((StringBuilder) (Object) contextBuilder).append(boardSummary).append(',');
          if (circle == null) {
            circleSummary = "null";
          } else {
            circleSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) circleContextBuilder).append(circleSummary).append(')').toString());
        }
    }

    final void resetSize(int resetState) {
        this.reboundSpeedStage = 1;
        this.x256 = this.centerX256 - 11264;
        this.sizeStage = 8;
        this.width256 = 22528;
        this.aftertouchTicks = resetState;
    }

    final void grow(int obfuscationGuard) {
        if (14 == this.sizeStage) {
          return;
        }
        if (obfuscationGuard >= 6) {
          this.x256 = this.x256 - 1536;
          this.sizeStage = this.sizeStage + 2;
          this.width256 = this.width256 + 3072;
          return;
        }
    }

    final void shrink(byte obfuscationGuard) {
        if (this.sizeStage != 0) {
          this.width256 = this.width256 - 3072;
          this.x256 = this.x256 + 1536;
          int guardCalculation = 27 / ((74 - obfuscationGuard) / 49);
          this.sizeStage = this.sizeStage - 2;
          return;
        }
    }

    final void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        super.readBodySnapshot(94, packet);
        this.sizeStage = packet.readUnsignedByte(255);
        if (obfuscationGuard <= 89) {
          return;
        }
        try {
          this.reboundSpeedStage = 15 & this.sizeStage >> 4;
          this.sizeStage = this.sizeStage & 15;
          this.reversedControlTicks = packet.readUnsignedShort(65280);
          this.catchTicks = packet.readUnsignedShort(65280);
          this.aftertouchTicks = packet.readUnsignedShort(65280);
          this.width256 = 32 + (6 * this.sizeStage + 8) << 8;
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "vo.L(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Show players in <%0>'s game";
        projectedVertexDepth = new int[8192];
    }
}
