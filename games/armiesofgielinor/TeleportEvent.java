/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeleportEvent extends GameEvent {
    private boolean applied;
    int sourceY;
    private boolean skipDestinationPlacement;
    private int targetDeltaY;
    int sourceX;
    private int targetDeltaX;

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var4 = 0;
        String var3 = null;
        String var3Lifetime1;
        int var4Lifetime1;
        if (!verbose) {
          var4 = -18 / ((obfuscationGuard - 53) / 51);
          var3 = "EventTeleport: pos: (" + this.sourceX + "," + this.sourceY + ")" + ",d: (" + this.targetDeltaX + "," + this.targetDeltaY + ")";
          return var3;
        }
        System.out.println("Teleport event debug");
        System.out.println("Unit at " + this.sourceX + "," + this.sourceY);
        System.out.println("Jumped to " + (this.targetDeltaX + this.sourceX) + "," + (this.targetDeltaY + this.sourceY));
        var4Lifetime1 = -18 / ((obfuscationGuard - 53) / 51);
        var3Lifetime1 = "EventTeleport: pos: (" + this.sourceX + "," + this.sourceY + ")" + ",d: (" + this.targetDeltaX + "," + this.targetDeltaY + ")";
        return var3Lifetime1;
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (!this.a((byte) -39, param2, param0, true)) ? 0 : 1;
          var4_int = stackIn_3_0;
          if (param1 > -84) {
            TeleportEvent.a(-83, -34, -127);
          }
          if (!this.skipDestinationPlacement) {
            var4_int = var4_int != 0 | this.a(this.sourceY + this.targetDeltaY, 15, param2, param0, this.sourceX + this.targetDeltaX) ? 1 : 0;
          }
          stackIn_8_0 = var4_int;
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ec.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        MapTile var3 = null;
        RuntimeException var3_ref = null;
        MapTile var4 = null;
        try {
          if (this.applied) {
            return;
          }
          this.applied = true;
          var4 = battlefield.tiles[this.sourceX + this.sourceY * battlefield.mapWidth];
          var3 = var4;
          if (this.unit.packedFlag256) {
            this.unit.packedFlag256 = false;
            var4.occupant.packedFlag256 = false;
            battlefield.unitsByPlayer[this.unit.ownerPlayer].addLast((byte) -119, (IntrusiveNode) (this.unit));
          } else {
            var3.occupant = null;
            var3.captureStrength = var4.getDefaultCaptureStrength(10);
            if (this.unit.p(-43)) {
              battlefield.a(this.sourceY, this.sourceX, obfuscationGuard + 26661, 3);
            }
          }
          this.unit.movementSpent = true;
          this.unit.tileX = this.unit.tileX + this.targetDeltaX;
          this.unit.tileY = this.unit.tileY + this.targetDeltaY;
          if (obfuscationGuard != -26661) {
            return;
          }
          if (!this.skipDestinationPlacement) {
            battlefield.tiles[battlefield.mapWidth * this.unit.tileY + this.unit.tileX].occupant = this.unit;
            if (this.unit.p(-70)) {
              battlefield.a(this.unit.tileY, this.unit.tileX, 0, 3);
            }
          }
          fl.a(battlefield, -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ec.G(");
          if (battlefield == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 <= 97) {
            stackIn_3_0 = -55;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = od.field_b;
          while (wp.field_v.length > var3_int) {
            var5 = TileMetadata.field_h[var3_int];
            if (0 > var5) {
              var4 = var4 + fh.field_e;
            } else {
              var6 = lg.a(wp.field_v[var3_int], true, (byte) -56);
              var4 = var4 + cp.field_a;
              var7 = rk.field_B - (var6 >> 1);
              if (mu.a(param0, (el.field_c << 1) + TelepopEvent.field_B, param2, -et.field_b + var7, 5138823, var6 + (et.field_b << 1), var4)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + (cp.field_a + (el.field_c << 1) + TelepopEvent.field_B);
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ec.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    TeleportEvent(int sourceX, int sourceY, int packedTargetDelta, boolean skipDestinationPlacement) {
        this.targetDeltaX = packedTargetDelta >> 8;
        this.targetDeltaY = 255 & packedTargetDelta;
        this.sourceY = sourceY;
        this.sourceX = sourceX;
        this.targetDeltaX = -128 + (this.targetDeltaX ^ 128);
        this.targetDeltaY = (128 ^ this.targetDeltaY) - 128;
        this.skipDestinationPlacement = skipDestinationPlacement ? true : false;
        this.eventKind = this.skipDestinationPlacement ? 21 : 26;
    }

    TeleportEvent(int sourceX, int sourceY, int targetDeltaX, int targetDeltaY, boolean skipDestinationPlacement) {
        this.sourceX = sourceX;
        this.sourceY = sourceY;
        this.targetDeltaX = targetDeltaX;
        this.skipDestinationPlacement = skipDestinationPlacement ? true : false;
        this.targetDeltaY = targetDeltaY;
        this.eventKind = this.skipDestinationPlacement ? 21 : 26;
    }

    static {
    }
}
