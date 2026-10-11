/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TelefragEvent extends GameEvent {
    static int field_z;
    static String field_y;

    final boolean b(Battlefield param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -75) {
            stackIn_6_0 = (param0.tiles[this.unit.tileY * param0.mapWidth + this.unit.tileX].occupant != null);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kn.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 != -75) {
          TelefragEvent.g(-9);
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        String var3 = null;
        int var4 = 0;
        String var3Lifetime1;
        int var4Lifetime1;
        if (!verbose) {
          if (null == this.unit) {
            var3 = "EventTelefrag: unit: null";
          } else {
            var3 = "EventTelefrag: pos: (" + this.unit.tileX + "," + this.unit.tileY + ")";
          }
          var4 = -50 % ((53 - obfuscationGuard) / 51);
          return var3;
        }
        System.out.println("Teleport reappear event debug");
        System.out.println("Unit at " + this.unit.tileX + "," + this.unit.tileY);
        if (null == this.unit) {
          var3Lifetime1 = "EventTelefrag: unit: null";
        } else {
          var3Lifetime1 = "EventTelefrag: pos: (" + this.unit.tileX + "," + this.unit.tileY + ")";
        }
        var4Lifetime1 = -50 % ((53 - obfuscationGuard) / 51);
        return var3Lifetime1;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        MapTile var4 = null;
        MapTile var3 = null;
        if (battlefield.field_x) {
          return;
        }
        try {
          var4 = battlefield.tiles[battlefield.mapWidth * this.unit.tileY + this.unit.tileX];
          var3 = var4;
          if (null != var4.occupant) {
            var4.occupant.a(false, (byte) 105);
          }
          var3.occupant = this.unit;
          this.unit.refreshTileEffects((byte) 82);
          if (this.unit.unitType == 74) {
            this.unit.attacksRemaining = 2;
          } else {
            this.unit.attacksRemaining = 1;
          }
          if (obfuscationGuard != -26661) {
            TelefragEvent.g(99);
          }
          this.unit.movementSpent = true;
          fl.a(battlefield, -114);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kn.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    TelefragEvent(Unit param0) {
        try {
          this.unit = param0;
          this.eventKind = 5;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = 0;
        field_y = "Game full";
    }
}
