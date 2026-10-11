/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AiActionCandidate extends IntrusiveNode {
    int spellId;
    int targetX;
    static String field_n;
    int destinationX;
    static long[] field_u;
    float score;
    int targetY;
    int executionResult;
    int destinationY;
    static String field_v;
    int selectionVariant;
    static int[] field_p;

    final static void e(int param0) {
        if (param0 != 17023) {
          field_p = (int[]) null;
        }
        if (AreaSpell.field_e != null) {
          AreaSpell.field_e.field_h = false;
        }
        ds.a(0, param0 ^ -16982);
    }

    public static void f(int param0) {
        field_p = null;
        int var1 = -70 / ((-47 - param0) / 52);
        field_u = null;
        field_v = null;
        field_n = null;
    }

    final boolean hasTarget(int obfuscationGuard) {
        int var2 = 75 / ((-13 - obfuscationGuard) / 54);
        return this.targetX != -1 ? true : false;
    }

    final int execute(byte obfuscationGuard, AiPlanner planner) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hw var3 = null;
        RuntimeException var3_ref = null;
        SpellAreaSelection var4 = null;
        try {
          if (this.destinationX != -1) {
            if (this.selectionVariant == -1) {
              planner.actionMovement.reconstructPath(this.destinationY, (byte) -116, this.destinationX);
              if (planner.actionMovement.pathLength <= 0 &&
                this.targetX == -1) {
                this.executionResult = -2;
              }
              if (this.targetX != -1) {
                planner.actionMovement.targetDeltaX = -this.destinationX + this.targetX;
                planner.actionMovement.targetDeltaY = this.targetY - this.destinationY;
              }
              var4 = planner.actionMovement.a(planner.playerId, 103);
              if (!planner.executeSelection(var4, -125)) {
                this.executionResult = -2;
              }
            } else {
              var3 = new hw(this.spellId, this.destinationX, this.destinationY, this.selectionVariant);
              planner.executeSelection(var3, -124);
            }
          }
          if (obfuscationGuard != 5) {
            this.targetY = 65;
          }
          stackIn_15_0 = this.executionResult;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("jb.G(").append(obfuscationGuard).append(',');
          if (planner == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void reset(int targetY) {
        this.spellId = -1;
        this.score = 1.401298464324817e-45f;
        this.destinationX = -1;
        this.selectionVariant = -1;
        this.destinationY = -1;
        this.executionResult = -1;
        this.targetY = targetY;
        this.targetX = -1;
    }

    final boolean hasDestination(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          this.hasTarget(-25);
        }
        return this.destinationX != -1 ? true : false;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 16150) {
            return true;
          }
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = ou.field_a;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != param0) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "jb.F(" + param0 + ',' + param1 + ')');
        }
    }

    AiActionCandidate() {
    }

    static {
        field_u = new long[32];
        field_v = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_n = "Dragonhide armour deflects fire and acts as a barrier to heat.";
        field_p = new int[8192];
    }
}
