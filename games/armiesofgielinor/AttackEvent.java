/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AttackEvent extends GameEvent {
    private boolean applied;
    private int targetDeltaY;
    static String[][][] field_A;
    private int targetDeltaX;
    private int attackerAnimationCount;
    private int defenderAnimationCount;
    static String field_D;
    static volatile long field_P;
    private Unit targetUnit;
    static RgbSprite field_E;
    static String field_K;
    private int attackerY;
    static RgbSprite[] field_y;
    private int attackerX;
    static RgbSprite field_O;
    static String field_F;

    public static void a(boolean param0) {
        field_F = null;
        if (!param0) {
          field_O = null;
          field_K = null;
          field_D = null;
          field_E = null;
          field_A = (String[][][]) null;
          field_y = null;
          return;
        }
        AttackEvent.b(false);
        field_O = null;
        field_K = null;
        field_D = null;
        field_E = null;
        field_A = (String[][][]) null;
        field_y = null;
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var4 = 0;
        String var3 = null;
        String var3Lifetime1;
        int var4Lifetime1;
        if (!verbose) {
          var4 = -24 % ((53 - obfuscationGuard) / 51);
          var3 = "EventAttack: pos: (" + this.unit.tileX + "," + this.unit.tileY + ")";
          return var3;
        }
        System.out.println("Attack event debug");
        System.out.println("Unit at " + this.unit.tileX + "," + this.unit.tileY);
        var4Lifetime1 = -24 % ((53 - obfuscationGuard) / 51);
        var3Lifetime1 = "EventAttack: pos: (" + this.unit.tileX + "," + this.unit.tileY + ")";
        return var3Lifetime1;
    }

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
            this.targetDeltaY = 109;
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ns.A(");
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

    final static int a(boolean param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 0) {
            throw new IllegalArgumentException();
          }
          if (pg.a(param1, -10)) {
            stackIn_6_0 = (int)((long)param1 * (4294967295L & (long)param2.nextInt()) >> 32);
            return stackIn_6_0;
          }
          if (param0) {
            AttackEvent.b(true);
          }
          var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
          do {
            var4 = param2.nextInt();
          } while (var3_int <= var4);
          stackIn_13_0 = th.a(var4, 1, param1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ns.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          vl.field_n.writeCipheredOpcode(32161, 76);
          if (param0) {
            field_A = (String[][][]) null;
          }
          for (var1_int = 0; 5 > var1_int; var1_int++) {
            vl.field_n.writeShort(true, pg.field_d.field_d[var1_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ns.B(" + param0 + ')');
        }
    }

    final static void d(byte param0) {
        if (!fh.field_i) {
          throw new IllegalStateException();
        }
        if (null != qc.field_a) {
          qc.field_a.b(true);
        }
        String var1 = dg.a(-123);
        np.field_Qb = new df(var1, (String) null, true, false, false);
        if (param0 >= 75) {
          KingBlackDragonEvent.field_C.a(lt.field_g, 0);
          lt.field_g.a(np.field_Qb, (byte) 55);
          lt.field_g.l(105);
          return;
        }
        AttackEvent.a(true);
        KingBlackDragonEvent.field_C.a(lt.field_g, 0);
        lt.field_g.a(np.field_Qb, (byte) 55);
        lt.field_g.l(105);
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        NodeDeque stackIn_13_0;
        int stackIn_13_1;
        CombatEvent stackIn_13_2;
        CombatEvent stackIn_13_3;
        int stackIn_13_4;
        int stackIn_13_5;
        int stackIn_13_6;
        int stackIn_13_7;
        int stackIn_13_8;
        int stackIn_13_9;
        int stackIn_13_10;
        CombatEvent stackIn_14_2 = null;
        CombatEvent stackIn_14_3 = null;
        boolean stackIn_14_11 = false;
        boolean stackIn_17_12 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        GameplayController var6 = null;
        int[] var10 = null;
        CombatEvent stackIn_14_2Lifetime1;
        CombatEvent stackIn_14_3Lifetime1;
        try {
          if (obfuscationGuard != -26661) {
            var6 = (GameplayController) null;
            this.a((NodeDeque) null, (byte) 68, (GameplayController) null);
          }
          if (this.applied) {
            return;
          }
          this.applied = true;
          this.unit = battlefield.getUnitAt(this.attackerY, true, this.attackerX);
          if (null == this.unit) {
            return;
          }
          var3_int = this.unit.tileX;
          var4 = this.unit.tileY;
          if (!this.unit.canParasitize(this.targetUnit, (byte) 119)) {
            if (this.targetUnit.getUnitCategory(0) == 4 &&
              !this.unit.canAttackFlying((byte) 103)) {
              return;
            }
            var10 = battlefield.predictCombat(this.targetUnit, var4, (byte) -128, this.targetDeltaY, this.unit, this.targetDeltaX, var3_int);
            stackIn_13_0 = battlefield.pendingEvents;
            stackIn_13_1 = obfuscationGuard ^ -27339;
            stackIn_13_2 = null;
            stackIn_13_3 = null;
            stackIn_13_4 = this.targetUnit.unitType;
            stackIn_13_5 = var3_int;
            stackIn_13_6 = var4;
            stackIn_13_7 = this.targetDeltaX;
            stackIn_13_8 = this.targetDeltaY;
            stackIn_13_9 = var10[0];
            stackIn_13_10 = var10[1];
            if ((1 & var10[2]) <= 0) {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_11 = false;
            } else {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_11 = true;
            }
            if (0 >= (var10[2] & 2)) {
              stackIn_14_2Lifetime1 = null;
              stackIn_14_3Lifetime1 = null;
              stackIn_17_12 = false;
            } else {
              stackIn_14_2Lifetime1 = null;
              stackIn_14_3Lifetime1 = null;
              stackIn_17_12 = true;
            }
            ((NodeDeque) (Object) stackIn_13_0).addFirst(stackIn_13_1, new CombatEvent(stackIn_13_4, stackIn_13_5, stackIn_13_6, stackIn_13_7, stackIn_13_8, stackIn_13_9, stackIn_13_10, stackIn_14_11, stackIn_17_12, this.attackerAnimationCount, this.defenderAnimationCount, this.unit.packedFlag8, this.targetUnit.packedFlag8, 0));
            return;
          }
          battlefield.pendingEvents.addFirst(750, new ParasiteEvent(var3_int, var4, this.targetDeltaX, this.targetDeltaY, this.unit.ownerPlayer));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ns.G(");
          if (battlefield == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    AttackEvent(int attackerX, int attackerY, int targetDeltaX, int targetDeltaY, Unit targetUnit, int attackerAnimationCount, int defenderAnimationCount) {
        try {
          this.attackerX = attackerX;
          this.targetDeltaY = targetDeltaY;
          this.eventKind = 27;
          this.attackerY = attackerY;
          this.applied = false;
          this.attackerAnimationCount = attackerAnimationCount;
          this.targetUnit = targetUnit;
          this.targetDeltaX = targetDeltaX;
          this.defenderAnimationCount = defenderAnimationCount;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ns.<init>(" + attackerX + ',' + attackerY + ',' + targetDeltaX + ',' + targetDeltaY + ',' + (targetUnit != null ? "{...}" : "null") + ',' + attackerAnimationCount + ',' + defenderAnimationCount + ')');
        }
    }

    static {
        field_A = new String[][][]{new String[][]{new String[]{"green_small_2_king_of_my_castle.lev", "small_tom.lev", "islands.lev", "Green_small_2_mf1.lev"}, new String[]{"Green_medium_4_MF4.lev", "Green_medium_4_MF3.lev", "Green_medium_4_MF2.lev", "Green_medium_4_MF1.lev"}, new String[]{"Green_large_6_mf1.lev", "Green_large_6_mf2.lev", "Green_large_6_mf3.lev", "Green_large_6_mf4.lev"}}, new String[][]{new String[]{"desert_small_2_dead_sea.lev", "desert_small_2_oasis.lev", "Desert_small_2_mf1.lev", "Desert_small_2_mf2.lev", "Desert_small_2_mf3.lev"}, new String[]{"Desert_medium_4_MF4.lev", "Desert_medium_4_MF3.lev", "Desert_medium_4_MF2.lev", "Desert_medium_4_MF1.lev"}, new String[]{"Desert_large_6_mf1.lev", "Desert_large_6_mf2.lev", "Desert_large_6_mf3.lev", "Desert_large_6_mf4.lev"}}, new String[][]{new String[]{"winter_small_2_mountain_clearing.lev", "winter_small_2_river_valley.lev", "Frozen_small_2_mf1.lev", "Frozen_small_2_mf2.lev", "Frozen_small_2_mf3.lev", "Frozen_small_2_mf4.lev"}, new String[]{"Frozen_medium_4_MF4.lev", "Frozen_medium_4_MF3.lev", "Frozen_medium_4_MF2.lev", "Frozen_medium_4_MF1.lev"}, new String[]{"Frozen_large_6_mf1.lev", "Frozen_large_6_mf2.lev", "Frozen_large_6_mf3.lev", "Frozen_large_6_mf4.lev"}}, new String[][]{new String[]{"Green_small_2_WaterbirthIsle.lev", "Green_2_Small_Swampnsea.lev", "Green_small_2_EmbryoIsles.lev", "Green_small_2_urborg.lev"}, new String[]{"Green_2_Medium_Swamp_Star.lev", "Green_medium_4_sludge_grind.lev", "Green_medium_4_fortress_isle.lev", "Green_medium_4_staggered.lev"}, new String[]{"Green_large_6_crux.lev", "Green_large_6_TheCrossing.lev", "Green_6_Large_Swampcircle.lev", "Green_6_Large_Chambers.lev"}}};
        field_D = "Invite only";
        field_P = 0L;
        field_K = "You can join this game";
        field_F = "Your rating is <%0>";
    }
}
