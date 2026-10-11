/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KingBlackDragonEvent extends GameEvent {
    static gk field_C;
    static int field_A;
    private int field_B;
    static je[] field_z;
    static String field_y;

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -84) {
            field_y = (String) null;
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rl.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_3_0 = 0;
        RgbSprite stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int[][] stackIn_15_3;
        int stackIn_16_4 = 0;
        int var6;
        int var7;
        Unit var8;
        Unit var9;
        var8 = vs.field_e[param1].occupant;
        var9 = var8;
        stackIn_3_0 = (var9 == null) ? 0 : 1;
        var6 = stackIn_3_0;
        if (var6 == 0) {
          if (param0 != 1) {
          }
          return;
        }
        var7 = jf.field_C.field_q;
        if (var7 < 0) {
          var7 = CipherPacketBuffer.currentBattlefield.currentPlayer;
        }
        if (var9.field_u) {
          return;
        }
        if (null != var9.field_x) {
          stackIn_15_0 = TeamRoster.field_g;
          stackIn_15_1 = param2 + 10;
          stackIn_15_2 = 5 + param4;
          stackIn_15_3 = op.field_c;
          stackIn_16_4 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
          ((RgbSprite) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_15_2, stackIn_15_3[stackIn_16_4][var8.ownerPlayer]);
          if (jf.field_C.selectedUnit == var9) {
            TeamRoster.field_g.f(10 + param2, param4 + 5, (int)(Math.sin((double)ug.field_b / 3.141592653589793) * 64.0) + 128);
          } else {
            if (jf.field_C.field_oc == var9) {
              TeamRoster.field_g.f(10 + param2, param4 + 5, (int)(Math.sin((double)ug.field_b / 3.141592653589793) * 64.0) + 128);
            }
          }
          var9.field_x.a((byte) -72, param3);
        }
        if (param0 != 1) {
        }
        return;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        try {
          if (obfuscationGuard != -26661) {
            this.describeEvent((byte) -70, false);
          }
          battlefield.kingBlackDragonSummoned = true;
          fl.a(battlefield, -117);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "rl.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        if (verbose) {
          System.out.println("KBD summon event debug");
          System.out.println("Player " + this.field_B + " summonned KBD");
        }
        int var4 = 71 % ((53 - obfuscationGuard) / 51);
        String var3 = "EventKBD: player: " + this.field_B;
        return var3;
    }

    public static void g(int param0) {
        if (param0 <= -33) {
          field_C = null;
          field_y = null;
          field_z = null;
          return;
        }
        field_z = (je[]) null;
        field_C = null;
        field_y = null;
        field_z = null;
    }

    KingBlackDragonEvent(int param0) {
        this.field_B = param0;
        this.field_m = -1;
    }

    static {
        field_A = 0;
        field_y = "You appear to be telling someone your password - please don't!";
    }
}
