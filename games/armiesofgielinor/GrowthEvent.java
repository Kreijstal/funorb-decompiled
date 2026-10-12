/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowthEvent extends GameEvent {
    int tileX;
    static String field_B;
    private boolean applied;
    private int playerId;
    static int[] field_E;
    private int originY;
    private int strength;
    private int originX;
    int tileY;
    static String field_I;

    public static void g(int param0) {
        if (param0 <= -5) {
          field_E = null;
          field_I = null;
          field_B = null;
          return;
        }
        field_B = (String) null;
        field_E = null;
        field_I = null;
        field_B = null;
    }

    static int bitwiseXor(int left, int right) {
        return left ^ right;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        Unit var5 = null;
        Unit var6 = null;
        if (this.applied) {
          return;
        }
        this.applied = true;
        this.unit = new Unit(this.tileX, this.tileY, 39, this.playerId, this.strength, this.strength, 0, 0, 0, battlefield, 0, 0, -1, false, 0);
        if (obfuscationGuard != -26661) {
          return;
        }
        try {
          battlefield.registerUnit(obfuscationGuard + 34949, this.unit);
          this.unit.attacksRemaining = 1;
          this.unit.movementSpent = true;
          var5 = battlefield.getUnitAt(this.originY, true, this.originX);
          var6 = var5;
          if (var6 != null) {
            var6.movementSpent = true;
          }
          fl.a(battlefield, obfuscationGuard ^ 26716);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kf.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
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
          if (param1 < -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kf.A(");
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var4 = -32 / ((obfuscationGuard - 53) / 51);
        String var3 = "EventGrowth: g: (" + this.tileX + "," + this.tileY + "), strength: " + this.strength + ", owner: " + this.playerId + ", o: (" + this.originX + "," + this.originY + ")";
        return var3;
    }

    GrowthEvent(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.originX = param2;
        this.playerId = param5;
        this.strength = param4;
        this.eventKind = 11;
        this.tileY = param1;
        this.tileX = param0;
        this.applied = false;
        this.originY = param3;
    }

    static {
        field_B = "<%0> has entered a game.";
        field_E = new int[]{7, 4, 4, 3, 2, 8};
        field_I = "END TURN";
    }
}
