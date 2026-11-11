/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PathMoveLocomotor extends Locomotor {
    private int turnSpeed;
    static String field_q;
    private int waypointIndex;
    private boolean field_s;
    private WaypointPath path;
    private boolean turnsToFaceWaypoint;
    private boolean stopsWhileTurning;
    private int speed;
    static int field_p;

    final int getTypeId(int param0) {
        if (param0 != 1) {
          return 10;
        }
        return 5;
    }

    final void setTurnsToFaceWaypoint(boolean param0, int param1) {
        this.turnsToFaceWaypoint = param0 ? true : false;
        if (param1 != -606738686) {
          this.tick((byte) -25);
        }
    }

    PathMoveLocomotor(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        WaypointPath stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_17_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_s = false;
        try {
          this.path = new WaypointPath(param0.formatVersion, param1);
          if (7 < param0.formatVersion) {
            this.speed = this.decodeFixed16(param1.readBits((byte) 44, 8), false);
          } else {
            this.speed = param1.readBits((byte) 44, 4) << 16;
          }
          if (param0.formatVersion < 11) {
            stackIn_7_0 = this.path;
            stackIn_8_1 = (1 == param1.readBits((byte) 44, 1));
            ((WaypointPath) (Object) stackIn_7_0).setStopsAtEnd(stackIn_8_1, 1);
          }
          if (param0.formatVersion >= 12) {
            stackIn_13_1 = (param1.readBits((byte) 44, 1) == 1);
            this.turnsToFaceWaypoint = stackIn_13_1;
            if (this.turnsToFaceWaypoint) {
              stackIn_17_1 = (param1.readBits((byte) 44, 1) == 1);
              this.stopsWhileTurning = stackIn_17_1;
              this.turnSpeed = param1.readBits((byte) 44, 12);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ro.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void setStopsWhileTurning(int param0, boolean param1) {
        if (param0 != 4) {
          return;
        }
        this.stopsWhileTurning = param1 ? true : false;
    }

    final void tick(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var13Lifetime5;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var12Lifetime5;
        int var12Lifetime6;
        int var12Lifetime7;
        int var13Lifetime6;
        int var13Lifetime7;
        int var13Lifetime8;
        int var13Lifetime9;
        int var14Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        int var14Lifetime9;
        if (this.path.isEmpty(-4075)) {
          return;
        }
        int[][] var17 = this.path.getPoints(-2);
        int[][] var16 = var17;
        int[][] var15 = var16;
        int[][] var2 = var15;
        int var3 = 45 / ((-69 - param0) / 42);
        if (var17.length > this.waypointIndex) {
          var4 = var15[this.waypointIndex][0] + this.getTrapInitialLocalX((byte) -70);
          var5 = var15[this.waypointIndex][1] + this.getTrapInitialLocalY(false);
          var6 = -this.trap.getLocalX(25745) + var4;
          var7 = var5 - this.trap.getLocalY(false);
          var8 = this.speed >> 16;
          var8 = var8 * var8;
          var9 = (var6 >> 16) * (var6 >> 16) + (var7 >> 16) * (var7 >> 16);
          if (var9 <= var8) {
            this.trap.move((byte) -112, var6, var7);
            this.field_s = true;
            this.waypointIndex = this.waypointIndex + 1;
            return;
          }
          var10 = qva.headingFromVector((byte) -99, var7, var6);
          if (!this.turnsToFaceWaypoint) {
            var11 = MouseInputHandler.sin2048((byte) 126, var10 >> 2);
            var12 = ModelAnimator.cos2048(0, var10 >> 2);
            var13 = doa.multiplyFixedCoarse(2, this.speed, var11);
            var14 = doa.multiplyFixedCoarse(2, this.speed, var12);
            this.trap.move((byte) -77, var13, var14);
            return;
          }
          if (!this.field_s) {
            var11Lifetime5 = MouseInputHandler.sin2048((byte) 126, var10 >> 2);
            var12Lifetime5 = ModelAnimator.cos2048(0, var10 >> 2);
            var13Lifetime6 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime5);
            var14Lifetime6 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime5);
            this.trap.move((byte) -77, var13Lifetime6, var14Lifetime6);
            return;
          }
          var11Lifetime6 = S2CRoundResultPacket.wrapDelta(8192, -16390, var10, this.trap.getFacingAngle(-25787));
          var12Lifetime6 = S2CNextRoundPacket.abs(var11Lifetime6, 39);
          if (this.turnSpeed == 0) {
            this.trap.rotateBy(false, -var11Lifetime6);
            this.field_s = false;
            var11Lifetime6 = MouseInputHandler.sin2048((byte) 126, var10 >> 2);
            var12Lifetime6 = ModelAnimator.cos2048(0, var10 >> 2);
            var13Lifetime7 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime6);
            var14Lifetime7 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime6);
            this.trap.move((byte) -77, var13Lifetime7, var14Lifetime7);
            return;
          }
          if (var12Lifetime6 <= this.turnSpeed) {
            this.trap.rotateBy(false, -var11Lifetime6);
            this.field_s = false;
            var11Lifetime6 = MouseInputHandler.sin2048((byte) 126, var10 >> 2);
            var12Lifetime6 = ModelAnimator.cos2048(0, var10 >> 2);
            var13Lifetime8 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime6);
            var14Lifetime8 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime6);
            this.trap.move((byte) -77, var13Lifetime8, var14Lifetime8);
            return;
          }
          this.trap.rotateBy(false, -lw.signum(var11Lifetime6, (byte) -76) * this.turnSpeed);
          if (this.stopsWhileTurning) {
            return;
          }
          var11Lifetime7 = MouseInputHandler.sin2048((byte) 126, var10 >> 2);
          var12Lifetime7 = ModelAnimator.cos2048(0, var10 >> 2);
          var13Lifetime9 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime7);
          var14Lifetime9 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime7);
          this.trap.move((byte) -77, var13Lifetime9, var14Lifetime9);
          return;
        }
        this.waypointIndex = 0;
        if (this.path.stopsAtEnd((byte) 21)) {
          this.stopped = true;
          return;
        }
        var4Lifetime1 = var15[this.waypointIndex][0] + this.getTrapInitialLocalX((byte) -70);
        var5Lifetime1 = var15[this.waypointIndex][1] + this.getTrapInitialLocalY(false);
        var6Lifetime1 = -this.trap.getLocalX(25745) + var4Lifetime1;
        var7Lifetime1 = var5Lifetime1 - this.trap.getLocalY(false);
        var8Lifetime1 = this.speed >> 16;
        var8Lifetime1 = var8Lifetime1 * var8Lifetime1;
        var9Lifetime1 = (var6Lifetime1 >> 16) * (var6Lifetime1 >> 16) + (var7Lifetime1 >> 16) * (var7Lifetime1 >> 16);
        if (var9Lifetime1 <= var8Lifetime1) {
          this.trap.move((byte) -112, var6Lifetime1, var7Lifetime1);
          this.field_s = true;
          this.waypointIndex = this.waypointIndex + 1;
          return;
        }
        var10Lifetime1 = qva.headingFromVector((byte) -99, var7Lifetime1, var6Lifetime1);
        if (!this.turnsToFaceWaypoint) {
          var11Lifetime1 = MouseInputHandler.sin2048((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime1 = ModelAnimator.cos2048(0, var10Lifetime1 >> 2);
          var13Lifetime1 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime1);
          var14Lifetime1 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime1);
          this.trap.move((byte) -77, var13Lifetime1, var14Lifetime1);
          return;
        }
        if (!this.field_s) {
          var11Lifetime2 = MouseInputHandler.sin2048((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime2 = ModelAnimator.cos2048(0, var10Lifetime1 >> 2);
          var13Lifetime2 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime2);
          var14Lifetime2 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime2);
          this.trap.move((byte) -77, var13Lifetime2, var14Lifetime2);
          return;
        }
        var11Lifetime3 = S2CRoundResultPacket.wrapDelta(8192, -16390, var10Lifetime1, this.trap.getFacingAngle(-25787));
        var12Lifetime3 = S2CNextRoundPacket.abs(var11Lifetime3, 39);
        if (this.turnSpeed == 0) {
          this.trap.rotateBy(false, -var11Lifetime3);
          this.field_s = false;
          var11Lifetime3 = MouseInputHandler.sin2048((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime3 = ModelAnimator.cos2048(0, var10Lifetime1 >> 2);
          var13Lifetime3 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime3);
          var14Lifetime3 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime3);
          this.trap.move((byte) -77, var13Lifetime3, var14Lifetime3);
          return;
        }
        if (var12Lifetime3 <= this.turnSpeed) {
          this.trap.rotateBy(false, -var11Lifetime3);
          this.field_s = false;
          var11Lifetime3 = MouseInputHandler.sin2048((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime3 = ModelAnimator.cos2048(0, var10Lifetime1 >> 2);
          var13Lifetime4 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime3);
          var14Lifetime4 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime3);
          this.trap.move((byte) -77, var13Lifetime4, var14Lifetime4);
          return;
        }
        this.trap.rotateBy(false, -lw.signum(var11Lifetime3, (byte) -76) * this.turnSpeed);
        if (this.stopsWhileTurning) {
          return;
        }
        var11Lifetime4 = MouseInputHandler.sin2048((byte) 126, var10Lifetime1 >> 2);
        var12Lifetime4 = ModelAnimator.cos2048(0, var10Lifetime1 >> 2);
        var13Lifetime5 = doa.multiplyFixedCoarse(2, this.speed, var11Lifetime4);
        var14Lifetime5 = doa.multiplyFixedCoarse(2, this.speed, var12Lifetime4);
        this.trap.move((byte) -77, var13Lifetime5, var14Lifetime5);
    }

    final void setTurnSpeed(int param0, int param1) {
        this.turnSpeed = param0;
        int var3 = 18 % ((37 - param1) / 55);
    }

    final void applyConstraint(int param0) {
        if (param0 != 1) {
          this.getSpeed(91);
        }
    }

    final int hashState(int param0, int param1) {
        param1 = CurveOperator.mixHash((byte) 98, param1, this.speed);
        param1 = CurveOperator.mixHash((byte) 26, param1, this.waypointIndex);
        if (param0 == 0) {
          return param1;
        }
        field_q = (String) null;
        return param1;
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        try {
          super.encode(param0, (byte) -91);
          if (param1 >= -78) {
            this.turnsToFaceWaypoint = true;
          }
          this.path.encode(param0, 0);
          param0.writeBits((byte) 54, this.encodeFixed16(0, this.speed), 8);
          param0.writeBits((byte) -127, !this.turnsToFaceWaypoint ? 0 : 1, 1);
          if (this.turnsToFaceWaypoint) {
            param0.writeBits((byte) -126, this.stopsWhileTurning ? 1 : 0, 1);
            param0.writeBits((byte) -128, this.turnSpeed, 12);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ro.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setPath(int param0, WaypointPath param1) {
        try {
          this.path = param1;
          if (param0 < 6) {
            field_q = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ro.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    PathMoveLocomotor(Room param0, boolean param1) {
        super(param0, param1);
        this.field_s = false;
        try {
          this.path = new WaypointPath();
          this.speed = 131072;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int measureStringWidth(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -116) {
            stackIn_2_0 = 51;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = qt.field_a.stringWidth(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = ConsoleValue.field_c.stringWidth(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ro.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getSpeed(int param0) {
        if (param0 < 2) {
          field_q = (String) null;
          return this.speed;
        }
        return this.speed;
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        if (param0 > -101) {
          String var2 = (String) null;
          PathMoveLocomotor.$cfr$intArgs$a$590e95718a07(-4, (String) null, false);
        }
    }

    final void mirror(byte param0) {
        if (param0 <= -116) {
          super.mirror((byte) -119);
          this.path.mirror(true);
          return;
        }
        this.waypointIndex = -124;
        super.mirror((byte) -119);
        this.path.mirror(true);
    }

    final void setSpeed(byte param0, int param1) {
        this.speed = param1;
        int var3 = 84 % ((-37 - param0) / 46);
    }

    final int getWaypointIndex(boolean param0) {
        if (param0) {
          this.speed = -121;
          return this.waypointIndex;
        }
        return this.waypointIndex;
    }

    static {
        field_q = "Enter name of friend to delete from list";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$590e95718a07(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -116) {
            stackIn_2_0 = 51;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = qt.field_a.stringWidth(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = ConsoleValue.field_c.stringWidth(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ro.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }
}
