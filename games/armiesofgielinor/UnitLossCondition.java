/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitLossCondition implements MatchCondition {
    static je field_f;
    static IndexedSprite field_a;
    private int playerId;
    private Battlefield battlefield;
    static co[] field_d;
    static String field_c;

    public final String describeCondition(int obfuscationGuard) {
        if (obfuscationGuard >= -122) {
          UnitLossCondition.d(18);
        }
        return "Defeat: Total Unit Loss";
    }

    public final boolean isVictory(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          this.isDefeat(118);
          return false;
        }
        return false;
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 <= 114) {
          return;
        }
        field_d = null;
        field_f = null;
        field_a = null;
    }

    UnitLossCondition(int playerId, Battlefield battlefield) {
        try {
          this.playerId = playerId;
          this.battlefield = battlefield;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mc.<init>(" + playerId + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean isDefeat(int obfuscationGuard) {
        int var2 = 0;
        int var4;
        NodeDeque var3;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = 0; var2 < this.battlefield.playerCount; var2++) {
          if ((null == this.battlefield.campaignMission ||
            var2 == this.playerId) &&
            this.battlefield.arePlayersAllied(this.playerId, -16985, var2)) {
            var3 = this.battlefield.getUnitsForPlayer(var2, 0);
            if (var3 != null &&
              var3.size(false) > 0) {
              return false;
            }
          }
        }
        if (this.battlefield.campaignMission == null &&
          this.battlefield.hasUsablePortal(this.playerId, (byte) -26)) {
          return false;
        }
        if (obfuscationGuard <= -121) {
          return true;
        }
        this.describeCondition(62);
        return true;
    }

    static {
        field_c = "Heavy stone armour that protects a unit from all damage for a certain number of attacks, but slows down or immobilises the unit.";
    }
}
