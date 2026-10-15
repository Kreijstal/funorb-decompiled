/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Brick extends RectangleBody {
    static String field_F;
    int portalIndex;
    int transitionCode;
    int flags;
    static int[] field_D;
    private int sourceWaypointIndex;
    private static int[] field_y;
    static int[] bubbleDistortionFalloff;
    int motionPathIndex;
    MotionWaypoint[] waypoints;
    static RgbSprite field_K;
    int segmentElapsedTicks;
    int motionElapsedTicks;
    private int pathDurationTicks;
    static RgbSprite[][] chocCapsSprites;
    static int unreadChatMessageCount;
    static CacheIoWorker field_x;
    static byte[] field_O;
    static UiComponent field_A;
    static String field_z;
    int pendingTypeId;
    int destinationWaypointIndex;
    static RgbSprite jungleSmallSprite;

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 79) {
            this.advanceMotionSegment(-33);
          }
          var3_int = super.computeSyncChecksum(107, diagnostics);
          if (diagnostics != null) {
            discarded$4 = diagnostics.append(this.x256 + " " + this.y256 + " ");
            discarded$5 = diagnostics.append(this.velocityX256 + " " + " " + this.velocityY256 + " ");
            discarded$6 = diagnostics.append(this.pathDurationTicks + " " + this.motionElapsedTicks + " " + this.segmentElapsedTicks + " " + this.motionPathIndex + " ");
            discarded$7 = diagnostics.append(this.pendingTypeId + "\n");
          }
          var3_int = var3_int ^ (this.motionElapsedTicks * 19 + this.pathDurationTicks * 23 - (-(this.segmentElapsedTicks * 17) - 4641) ^ 405 + 27 * this.flags << 21 ^ 47802 + this.motionPathIndex * 3 << 4 ^ 4643 + this.pendingTypeId * 23 << 8);
          var3_int = var3_int ^ this.portalIndex * 7 + 35 << 2;
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("on.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void attachMotionPath(BrickMotionPath path, byte obfuscationGuard) {
        int waypointIndex = 0;
        MotionWaypoint waypoint = null;
        int copiedIndex = 0;
        int segmentStartTick = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int segmentEndTick;
        if (path.waypoints.isEmpty(false)) {
          return;
        }
        if (obfuscationGuard > -87) {
          return;
        }
        try {
          this.pathDurationTicks = path.durationTicks;
          this.waypoints = new MotionWaypoint[path.waypoints.size(119)];
          waypointIndex = 0;
          waypoint = (MotionWaypoint) (path.waypoints.first(-38));
          while (waypoint != null) {
            copiedIndex = waypointIndex;
            waypointIndex++;
            this.waypoints[copiedIndex] = waypoint;
            waypoint = (MotionWaypoint) (path.waypoints.next((byte) 116));
          }
          this.sourceWaypointIndex = -1 + this.waypoints.length;
          this.destinationWaypointIndex = 0;
          segmentEndTick = 0;
          segmentStartTick = 0;
          while (segmentEndTick <= this.motionElapsedTicks) {
            segmentStartTick = segmentEndTick;
            this.advanceMotionSegment(68);
            segmentEndTick = segmentEndTick + this.waypoints[this.destinationWaypointIndex].durationTicks;
          }
          this.segmentElapsedTicks = -segmentStartTick + this.motionElapsedTicks;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "on.Q(" + (path != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    Brick() {
        this(0, 0, 0, 0, 0);
    }

    Brick(int x256, int y256, int velocityX256, int velocityY256, int typeId, int brickFlags, int brickState, int motionElapsedTicks) {
        super(x256, y256, velocityX256, velocityY256, 8704, 4096, typeId);
        this.pendingTypeId = -1;
        this.motionElapsedTicks = motionElapsedTicks;
        this.flags = brickFlags;
        this.motionPathIndex = brickState;
    }

    private final void dropPowerUp(PlayerBoard board, int obfuscationGuard) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (obfuscationGuard != 15165) {
            this.interpolateMotion((byte) -67, false);
          }
          if ((this.flags & 2) != 0 &&
            board.advancePowerUpDropCounter(26, this.typeId)) {
            board.fallingPowerUps.addLast(new PowerUp(this.x256 + this.width256 / 2 - 2048, this.y256 + this.height256 * 2, this.typeId), (byte) 3);
            if (!TextFieldRenderer.field_A) {
              return;
            }
            WidgetLayer.a(this.typeId, 2, (byte) -92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("on.R(");
          if (board == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void setMotionPath(BrickMotionPath path, boolean includeVelocity, int obfuscationGuard) {
        try {
          this.attachMotionPath(path, (byte) -105);
          this.interpolateMotion((byte) 36, includeVelocity);
          if (obfuscationGuard != 4) {
            Brick.a((byte) -120, -81);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "on.P(" + (path != null ? "{...}" : "null") + ',' + includeVelocity + ',' + obfuscationGuard + ')');
        }
    }

    final void interpolateMotion(byte obfuscationGuard, boolean includeVelocity) {
        MotionWaypoint sourceWaypoint = this.waypoints[this.sourceWaypointIndex];
        MotionWaypoint destinationWaypoint = this.waypoints[this.destinationWaypointIndex];
        this.velocityX256 = -sourceWaypoint.x256 + destinationWaypoint.x256;
        int durationTicks = destinationWaypoint.durationTicks;
        this.velocityY256 = destinationWaypoint.y256 - sourceWaypoint.y256;
        if (obfuscationGuard <= 33) {
          this.advanceMotionSegment(-3);
        }
        this.x256 = this.segmentElapsedTicks * this.velocityX256 / durationTicks + sourceWaypoint.x256;
        this.y256 = sourceWaypoint.y256 + this.velocityY256 * this.segmentElapsedTicks / durationTicks;
        if (includeVelocity) {
          this.velocityX256 = this.velocityX256 / durationTicks;
          this.velocityY256 = this.velocityY256 / durationTicks;
        } else {
          this.velocityX256 = 0;
          this.velocityY256 = 0;
        }
    }

    public static void d(int param0) {
        field_D = null;
        jungleSmallSprite = null;
        chocCapsSprites = (RgbSprite[][]) null;
        field_A = null;
        field_z = null;
        if (param0 != 4641) {
          field_x = (CacheIoWorker) null;
        }
        bubbleDistortionFalloff = null;
        field_y = null;
        field_x = null;
        field_K = null;
        field_O = null;
        field_F = null;
    }

    final void onCircleContact(byte obfuscationGuard, PlayerBoard board, CircleBody circle) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Ball var7 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var7 = (Ball) (circle);
          if (this.typeId == 28) {
            board.teleportBall((byte) -63, this, var7);
            return;
          }
          if ((EmailValidator.alwaysSolidBrickTypeMask & 1 << this.typeId) != 0 ||
            var7.penetrationTicks == 0 &&
            var7.phaseTicks == 0) {
            super.onCircleContact((byte) 53, board, circle);
            var7.brickBounceCount = var7.brickBounceCount + 1;
            if (IntegerValidationHelpers.collisionFace != 8 &&
              IntegerValidationHelpers.collisionFace != 4) {
              var7.velocityY256 = -var7.velocityY256;
              var5 = DualLinkIterator.collisionNormalY256 * (this.velocityY256 - var7.velocityY256);
              if (var5 < 0) {
                var7.velocityY256 = this.velocityY256;
              }
            } else {
              var7.velocityX256 = -var7.velocityX256;
              var5 = SpriteGeometry.collisionNormalX256 * (this.velocityX256 - var7.velocityX256);
              if (0 > var5) {
                var7.velocityX256 = this.velocityX256;
              }
            }
            var7.contactCount = var7.contactCount + 1;
            if ((var7.brickBounceCount & 3) == 0) {
              var7.velocityX256 = var7.velocityX256 + (-board.nextRandomBoundedInt(4, (byte) 62) + 2);
              var7.velocityY256 = var7.velocityY256 + (2 - board.nextRandomBoundedInt(4, (byte) 62));
            }
          }
          stackIn_21_0 = (var7.phaseTicks != 0) ? 0 : 1;
          var5Lifetime1 = stackIn_21_0;
          stackIn_24_0 = var5Lifetime1;
          if (this.typeId == 19 &&
            IntegerValidationHelpers.collisionFace != 1) {
            stackIn_26_1 = 0;
          } else {
            stackIn_26_1 = 1;
          }
          var5Lifetime2 = stackIn_24_0 & stackIn_26_1;
          stackIn_29_0 = var5Lifetime2;
          if (20 == this.typeId &&
            IntegerValidationHelpers.collisionFace != 2) {
            stackIn_31_1 = 0;
          } else {
            stackIn_31_1 = 1;
          }
          var5Lifetime3 = stackIn_29_0 & stackIn_31_1;
          if (var5Lifetime3 != 0) {
            if (25 == this.typeId) {
              board.toggleBrickTypes26And27(-27);
            }
            if (this.typeId != 27 ||
              this.pendingTypeId != 26) {
              if (this.typeId == 26 &&
                this.pendingTypeId == 27) {
                this.typeId = 27;
                this.pendingTypeId = 0;
                this.transitionCode = 1;
              } else {
                if (board.field_l + 1 != StrongCacheEntry.field_E[this.typeId]) {
                  if ((this.flags & 1) == 0) {
                    board.field_l = 0;
                  }
                } else {
                  board.field_l = board.field_l + 1;
                }
                this.pendingTypeId = MonotonicTime.field_b[this.typeId];
                dupTemp$0 = rb.field_a[this.typeId];
                this.transitionCode = dupTemp$0;
                if (dupTemp$0 < 0) {
                  if (board.nextRandomBoundedInt(100, (byte) 62) > 65) {
                    if (IntegerValidationHelpers.collisionFace != 1) {
                      if (IntegerValidationHelpers.collisionFace == 2) {
                        this.transitionCode = 7;
                      } else {
                        if (IntegerValidationHelpers.collisionFace != 8) {
                          this.transitionCode = 9;
                        } else {
                          this.transitionCode = 8;
                        }
                      }
                    } else {
                      this.transitionCode = 6;
                    }
                  } else {
                    this.transitionCode = board.nextRandomBoundedInt(6, (byte) 62);
                  }
                }
                this.dropPowerUp(board, 15165);
              }
              this.stateWord = 0;
            }
          }
          if (19 == this.typeId &&
            this.pendingTypeId < 0) {
            this.pendingTypeId = this.typeId;
            this.transitionCode = 12;
          }
          if (20 == this.typeId &&
            this.pendingTypeId < 0) {
            this.transitionCode = 12;
            this.pendingTypeId = this.typeId;
          }
          if (obfuscationGuard != 53) {
            field_F = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_70_0 = var4;
          stackIn_70_1 = new StringBuilder().append("on.E(").append(obfuscationGuard).append(',');
          if (board == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (circle == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final boolean resolveCircleCollision(CircleBody circle, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != (4 & this.flags) &&
            this.waypoints[this.sourceWaypointIndex].durationTicks == 1 &&
            0 == this.segmentElapsedTicks) {
            return false;
          }
          if ((1 << this.typeId & EmailValidator.alwaysSolidBrickTypeMask) == 0 &&
            0 != ((Ball) (circle)).phaseTicks) {
            return false;
          }
          if (this.pendingTypeId == 0) {
            return false;
          }
          var3_int = -83 % ((-29 - obfuscationGuard) / 35);
          stackIn_13_0 = super.resolveCircleCollision(circle, (byte) -120);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("on.F(");
          if (circle == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var1 = (-640 + kp.field_a) / 2;
        int var2 = ScrollPaneWithFooter.field_Yb * ScrollPaneWithFooter.field_Yb;
        int var3 = var2 - TextLineLayout.field_b * TextLineLayout.field_b;
        ContentTransitionLayer.field_gb.setBounds(-124 + (Rasterizer2D.height - 90), 90, -(199 * var3 / var2) + var1, 199, (byte) 64);
        if (param0 >= -50) {
          Brick.d(61);
        }
        FontRequestHelpers.field_a.setBounds(-4 + Rasterizer2D.height - 120, 0, 438 * var3 / var2 + (var1 + 202), 438, (byte) 64);
    }

    Brick(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3, param4, 0, 0, 0);
    }

    final void advanceMotionSegment(int obfuscationGuard) {
        int nextDestinationIndex = this.destinationWaypointIndex + 1;
        this.destinationWaypointIndex = this.destinationWaypointIndex + 1;
        this.destinationWaypointIndex = nextDestinationIndex % this.waypoints.length;
        int nextSourceIndex = this.sourceWaypointIndex + 1;
        this.sourceWaypointIndex = this.sourceWaypointIndex + 1;
        this.sourceWaypointIndex = nextSourceIndex % this.waypoints.length;
        if (obfuscationGuard <= 61) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.readBodySnapshot(-99, (PacketBuffer) null);
        }
        this.motionElapsedTicks = this.motionElapsedTicks % this.pathDurationTicks;
        this.segmentElapsedTicks = 0;
    }

    final static int a(byte param0, int param1) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        GameplayScreen.field_j = 0;
        MouseInput.field_d = null;
        IndexedSpriteGeometry.field_e = null;
        int var2 = ByteArrayPoolHelpers.field_a;
        ByteArrayPoolHelpers.field_a = StatefulWidgetRenderer.field_z;
        int var3 = -47 / ((param0 + 22) / 61);
        if (param1 == 51) {
          PacketReceiveHelpers.field_f.lastError = 2;
        } else {
          if (param1 != 50) {
            PacketReceiveHelpers.field_f.lastError = 1;
          } else {
            PacketReceiveHelpers.field_f.lastError = 5;
          }
        }
        StatefulWidgetRenderer.field_z = var2;
        PacketReceiveHelpers.field_f.failureCount = PacketReceiveHelpers.field_f.failureCount + 1;
        if (2 <= PacketReceiveHelpers.field_f.failureCount &&
          param1 == 51) {
          return 2;
        }
        if (PacketReceiveHelpers.field_f.failureCount >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (!(PacketReceiveHelpers.field_f.failureCount < 4)) {
          return 1;
        }
        return -1;
    }

    final void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        BrickMotionPath var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (obfuscationGuard <= 89) {
            var4 = (BrickMotionPath) null;
            this.attachMotionPath((BrickMotionPath) null, (byte) 44);
          }
          super.readBodySnapshot(93, packet);
          this.pendingTypeId = packet.readByte(true);
          if (this.pendingTypeId > 0) {
            this.transitionCode = packet.readUnsignedByte(255);
          }
          this.flags = packet.readUnsignedByte(255) & 255;
          if ((4 & this.flags) != 0) {
            this.motionPathIndex = packet.readUnsignedByte(255);
            this.motionElapsedTicks = packet.readUnsignedShort(65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("on.L(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        int var0Lifetime1;
        double var1Lifetime1;
        field_y = new int[65536];
        bubbleDistortionFalloff = new int[65536];
        field_D = new int[]{100, 200, 300, 300, 500, 100, 300, 300, 500, 200, 500, 500, 500, 1000, 300, 1000, 100, 300, 500, 300, 500, 1000, 500, 300, 500, 1000, 300, 200, 500, 200, 100, 200, 100, 200, 100, 100, 100, 100, 100, 500, 1000, 200};
        field_F = "You must play <%1> more rated games before playing with the current options.";
        for (var0 = 0; var0 < 65536; var0++) {
          var1 = 256.0 - Math.sqrt((double)var0);
          bubbleDistortionFalloff[var0] = (int)(var1 * var1 + 0.5);
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 65536; var0Lifetime1++) {
          var1Lifetime1 = Math.sqrt((double)var0Lifetime1);
          field_y[var0Lifetime1] = (int)Math.floor((double)var0Lifetime1 * 0.0234375 + (-(9.0 * var1Lifetime1) + 768.5));
        }
        field_z = "<%0> has lost connection.";
    }
}
