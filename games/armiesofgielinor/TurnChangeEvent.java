/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TurnChangeEvent extends GameEvent {
    private int newTurnNumber;
    private int nextPlayer;

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        if (verbose) {
          System.out.println("Turn change: new turn: " + this.newTurnNumber + " player: " + this.nextPlayer);
        }
        String var3 = "EventTurnChange: new turn: " + this.newTurnNumber + " player: " + this.nextPlayer;
        int var4 = 2 % ((obfuscationGuard - 53) / 51);
        return var3;
    }

    final static void d(byte param0) {
        vi.a(-76);
        if (param0 != -112) {
          return;
        }
        mw.b(dh.field_n[0].field_A, jn.field_c, mi.field_l, gl.field_c, jn.field_d, 1);
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        try {
          if (obfuscationGuard != -26661) {
            this.newTurnNumber = 68;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kc.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.battlefield.field_X) {
            return false;
          }
          param2.f(this.newTurnNumber, this.nextPlayer, 0);
          if (param1 < -84) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("kc.A(");
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

    TurnChangeEvent(int param0, int param1) {
        this.nextPlayer = param1;
        this.field_m = 22;
        this.newTurnNumber = param0;
    }

    static {
    }
}
