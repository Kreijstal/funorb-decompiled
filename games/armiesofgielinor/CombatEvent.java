/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CombatEvent extends GameEvent {
    private int defenderAnimationCount;
    int attackerX;
    static int[] field_L;
    boolean attackerDies;
    private boolean defenderDeployed;
    boolean defenderDies;
    int attackerY;
    int attackerDamage;
    int battleId;
    int defenderDamage;
    static int[] field_A;
    static je field_I;
    boolean attackerDeployed;
    private int unseenUnitType;
    int targetDeltaX;
    static int field_P;
    int targetDeltaY;
    static String field_O;
    private int attackerAnimationCount;

    public static void e(byte param0) {
        field_A = null;
        if (param0 < -122) {
          field_O = null;
          field_L = null;
          field_I = null;
          return;
        }
        field_O = (String) null;
        field_O = null;
        field_L = null;
        field_I = null;
    }

    final static void a(int param0, int param1, int param2) {
        CipherPacketBuffer var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(1, 3);
        var3.b(1, 8);
        if (param1 <= -41) {
          var3.b(true, param2);
          return;
        }
        CombatEvent.e((byte) 75);
        var3.b(true, param2);
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        String var3 = null;
        int var4 = -122 / ((53 - obfuscationGuard) / 51);
        String var3Lifetime1;
        if (verbose) {
          System.out.println("Combat event debug");
          System.out.println("Attacker at " + this.attackerX + "," + this.attackerY);
          System.out.println("Attacks " + (this.attackerX + this.targetDeltaX) + "," + (this.attackerY + this.targetDeltaY));
          System.out.println("Attacker deals " + this.attackerDamage + " damage");
          System.out.println("Defender deals " + this.defenderDamage + " damage");
          if (this.attackerDies) {
            System.out.println("Attacker dies");
          }
          if (this.defenderDies) {
            System.out.println("Defender dies");
          }
          System.out.println(this.attackerAnimationCount + " attackers in anim");
          System.out.println(this.defenderAnimationCount + " defenders in anim");
          System.out.println("Unseen type is" + this.unseenUnitType);
          var3 = "EventCombat: creature: " + this.unseenUnitType + ", com:(" + this.attackerX + "," + this.attackerY + ")" + ", att:(" + this.targetDeltaX + "," + this.targetDeltaY + ")" + ", dam:(" + this.attackerDamage + "," + this.defenderDamage + ")" + "\n" + "die:(" + this.attackerDies + "," + this.defenderDies + ")" + ", count:(" + this.attackerAnimationCount + "," + this.defenderAnimationCount + ")" + ", deployed:(" + this.attackerDeployed + "," + this.defenderDeployed + ")" + ", battleid:" + this.battleId;
          return var3;
        }
        var3Lifetime1 = "EventCombat: creature: " + this.unseenUnitType + ", com:(" + this.attackerX + "," + this.attackerY + ")" + ", att:(" + this.targetDeltaX + "," + this.targetDeltaY + ")" + ", dam:(" + this.attackerDamage + "," + this.defenderDamage + ")" + "\n" + "die:(" + this.attackerDies + "," + this.defenderDies + ")" + ", count:(" + this.attackerAnimationCount + "," + this.defenderAnimationCount + ")" + ", deployed:(" + this.attackerDeployed + "," + this.defenderDeployed + ")" + ", battleid:" + this.battleId;
        return var3Lifetime1;
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        boolean stackIn_34_0 = false;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Unit var5 = null;
        Unit var6 = null;
        try {
          var6 = param2.battlefield.getUnitAt(this.attackerY, true, this.attackerX);
          if (param1 > -84) {
            this.attackerY = -99;
          }
          var5 = param2.battlefield.getUnitAt(this.targetDeltaY + this.attackerY, true, this.attackerX + this.targetDeltaX);
          if (this.targetDeltaY * this.targetDeltaY + this.targetDeltaX * this.targetDeltaX != 1) {
            if (var6 != null) {
              var6.setFacingAngle(118, 2048 - (int)(2048.0 * Math.atan2((double)this.targetDeltaY, (double)(-this.targetDeltaX)) / 3.141592653589793 / 2.0) + 256 & 2047);
            }
          } else {
            if (var6 != null) {
              if (this.targetDeltaX > 0) {
                var6.setFacingAngle(74, 1280);
              }
              if (this.targetDeltaY > 0) {
                var6.setFacingAngle(-118, 1792);
              }
              if (this.targetDeltaX < 0) {
                var6.setFacingAngle(-127, 256);
              }
              if (this.targetDeltaY < 0) {
                var6.setFacingAngle(-122, 768);
              }
            }
            if (var5 != null) {
              if (this.targetDeltaX > 0) {
                var5.setFacingAngle(72, 256);
              }
              if (this.targetDeltaY > 0) {
                var5.setFacingAngle(-117, 768);
              }
              if (this.targetDeltaX < 0) {
                var5.setFacingAngle(-121, 1280);
              }
              if (this.targetDeltaY < 0) {
                var5.setFacingAngle(3, 1792);
              }
            }
          }
          param2.d(this.battleId, 4);
          if (!uc.field_a) {
            stackIn_34_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_34_0;
          }
          param2.e(this.battleId, -56);
          this.applyToBattlefield(param2.battlefield, -26661);
          param2.a(true, var6);
          this.c((byte) -125);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_37_0 = var4;
          stackIn_37_1 = new StringBuilder().append("ag.A(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        try {
          battlefield.queueCombatConsequences(this.attackerY, this.targetDeltaX, this.attackerDies, this.attackerX, this.targetDeltaY, 111, this.defenderDies, this.attackerDamage, this.defenderDamage, this.unseenUnitType);
          hf.a(battlefield, (byte) 9, true);
          if (obfuscationGuard != -26661) {
            this.targetDeltaY = -38;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ag.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static java.applet.Applet d(byte param0) {
        if (null != la.field_g) {
          return la.field_g;
        }
        int var1 = 90 % ((param0 + 67) / 44);
        return (java.applet.Applet) ((Object) lr.field_a);
    }

    CombatEvent(int unseenUnitType, int attackerX, int attackerY, int targetDeltaX, int targetDeltaY, int attackerDamage, int defenderDamage, boolean attackerDies, boolean defenderDies, int attackerAnimationCount, int defenderAnimationCount, boolean attackerDeployed, boolean defenderDeployed, int battleId) {
        this.field_m = 1;
        this.attackerDamage = attackerDamage;
        this.battleId = battleId;
        this.attackerDeployed = attackerDeployed ? true : false;
        this.defenderAnimationCount = defenderAnimationCount;
        this.attackerY = attackerY;
        this.targetDeltaX = targetDeltaX;
        this.attackerDies = attackerDies ? true : false;
        this.defenderDamage = defenderDamage;
        this.defenderDeployed = defenderDeployed ? true : false;
        this.attackerAnimationCount = attackerAnimationCount;
        this.defenderDies = defenderDies ? true : false;
        this.unseenUnitType = unseenUnitType;
        this.targetDeltaY = targetDeltaY;
        this.attackerX = attackerX;
    }

    static {
        field_L = new int[4];
        field_A = new int[5];
        field_O = "To Customer Support";
        field_P = 0;
    }
}
