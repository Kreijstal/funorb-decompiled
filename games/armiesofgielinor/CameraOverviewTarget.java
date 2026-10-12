/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CameraOverviewTarget extends IntrusiveNode {
    private int tileYSum;
    private boolean holdStarted;
    private int tileXSum;
    private int holdTicks;
    static String field_o;
    private int sampleCount;

    final void addTile(int tileX, int tileY, byte obfuscationGuard) {
        this.sampleCount = this.sampleCount + 1;
        this.tileYSum = this.tileYSum + tileY;
        if (obfuscationGuard > 85) {
          this.tileXSum = this.tileXSum + tileX;
          return;
        }
    }

    final void startHold(int obfuscationGuard) {
        int var2 = -56 % ((obfuscationGuard + 48) / 43);
        this.holdStarted = true;
    }

    final boolean advanceHold(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        if (obfuscationGuard == -5) {
          fieldTemp$0 = this.holdTicks;
          this.holdTicks = this.holdTicks + 1;
          return 40 > fieldTemp$0 ? true : false;
        }
        Unit var3 = (Unit) null;
        this.containsUnit((Unit) null, 101);
        int fieldTemp$1 = this.holdTicks;
        this.holdTicks = this.holdTicks + 1;
        return 40 > fieldTemp$1 ? true : false;
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 != -66) {
          return false;
        }
        return AiPlanner.b(param3, param2, param0 ^ 76, param1);
    }

    final boolean hasStartedHold(byte obfuscationGuard) {
        if (obfuscationGuard <= 123) {
          this.addTile(82, 19, (byte) 40);
          return this.holdStarted;
        }
        return this.holdStarted;
    }

    final boolean isNearTarget(int obfuscationGuard, CameraOverviewTarget other) {
        int otherCenterX = 0;
        RuntimeException var3 = null;
        int otherCenterY = 0;
        int centerX = 0;
        int centerY = 0;
        int squaredDeltaX = 0;
        int squaredDeltaY = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          otherCenterX = other.tileXSum / other.sampleCount;
          otherCenterY = other.tileYSum / other.sampleCount;
          centerX = this.tileXSum / this.sampleCount;
          centerY = this.tileYSum / this.sampleCount;
          squaredDeltaX = -centerX + otherCenterX;
          squaredDeltaX = squaredDeltaX * squaredDeltaX;
          squaredDeltaY = -centerY + otherCenterY;
          squaredDeltaY = squaredDeltaY * squaredDeltaY;
          if (obfuscationGuard != -5) {
            this.holdTicks = -4;
          }
          stackIn_10_0 = ((!(squaredDeltaX >= 4) &&
            !(squaredDeltaY >= 25)) ||
            (!(squaredDeltaX >= 25) &&
            !(squaredDeltaY >= 4)));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ja.C(").append(obfuscationGuard).append(',');
          if (other == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean containsUnit(Unit unit, int obfuscationGuard) {
        RuntimeException var3 = null;
        CameraOverviewTarget var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -4977) {
            var4 = (CameraOverviewTarget) null;
            this.isNearTarget(114, (CameraOverviewTarget) null);
          }
          stackIn_3_0 = this.containsTile(unit.tileX, unit.tileY, (byte) -95);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ja.D(");
          if (unit == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void addUnit(byte obfuscationGuard, Unit unit) {
        if (obfuscationGuard > -59) {
          return;
        }
        try {
          this.addTile(unit.tileX, unit.tileY, (byte) 108);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ja.I(" + obfuscationGuard + ',' + (unit != null ? "{...}" : "null") + ')');
        }
    }

    final boolean containsTile(int tileX, int tileY, byte obfuscationGuard) {
        int guardedCenterY = 0;
        int centerX = this.tileXSum / this.sampleCount;
        int centerY;
        if (obfuscationGuard >= -27) {
          this.hasStartedHold((byte) 97);
          guardedCenterY = this.tileYSum / this.sampleCount;
          if (tileX < -2 + centerX) {
            return false;
          }
          if (guardedCenterY - 2 > tileY) {
            return false;
          }
          if (2 + centerX < tileX) {
            return false;
          }
          if (tileY <= guardedCenterY + 2) {
            return true;
          }
          return false;
        }
        centerY = this.tileYSum / this.sampleCount;
        if (tileX < -2 + centerX) {
          return false;
        }
        if (centerY - 2 > tileY) {
          return false;
        }
        if (2 + centerX < tileX) {
          return false;
        }
        if (tileY <= centerY + 2) {
          return true;
        }
        return false;
    }

    final int distanceSquaredTo(int obfuscationGuard, CameraOverviewTarget other) {
        int otherCenterX = 0;
        RuntimeException var3 = null;
        int otherCenterY = 0;
        int centerX = 0;
        int centerY = 0;
        int deltaX = 0;
        int deltaY = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          otherCenterX = other.tileXSum / other.sampleCount;
          otherCenterY = other.tileYSum / other.sampleCount;
          centerX = this.tileXSum / this.sampleCount;
          if (obfuscationGuard != 2) {
            stackIn_2_0 = -59;
            return stackIn_2_0;
          }
          centerY = this.tileYSum / this.sampleCount;
          deltaX = otherCenterX - centerX;
          deltaY = -centerY + otherCenterY;
          stackIn_4_0 = deltaY * deltaY + deltaX * deltaX;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ja.E(").append(obfuscationGuard).append(',');
          if (other == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int getTileIndex(int mapWidth, byte obfuscationGuard) {
        int centerX = this.tileXSum / this.sampleCount;
        int centerY = this.tileYSum / this.sampleCount;
        if (obfuscationGuard < -23) {
          return centerX + centerY * mapWidth;
        }
        return -50;
    }

    public static void e(int param0) {
        field_o = null;
        int var1 = 107 % ((param0 + 36) / 54);
    }

    CameraOverviewTarget(Unit unit) {
        try {
          this.sampleCount = 1;
          this.tileYSum = unit.tileY;
          this.tileXSum = unit.tileX;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ja.<init>(" + (unit != null ? "{...}" : "null") + ')');
        }
    }

    CameraOverviewTarget(int tileX, int tileY) {
        this.tileXSum = tileX;
        this.sampleCount = 1;
        this.tileYSum = tileY;
    }

    static {
        field_o = "Spells to harm a single unit.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$a$78278125798b(int param0, int param1, int param2, int param3) {
        if (param0 != -66) {
          return false;
        }
        return AiPlanner.b(param3, param2, param0 ^ 76, param1);
    }
}
