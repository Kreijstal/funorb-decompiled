/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FighterBayWeaponDefinition extends WeaponDefinition {
    final int getReloadTime(byte param0) {
        if (param0 <= 0) {
          return -105;
        }
        return MapClearanceRectangleFactory.field_b;
    }

    final boolean hasRecoil(byte param0) {
        if (param0 < 18) {
          return true;
        }
        return false;
    }

    FighterBayWeaponDefinition() {
    }

    final static void l(int param0) {
        if (param0 > -115) {
          return;
        }
        if (SetShipSpawnInvulnerabilityTime.field_o != null) {
          SetShipSpawnInvulnerabilityTime.field_o.close(1);
          SetShipSpawnInvulnerabilityTime.field_o = null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 < -21) {
          return 0 != (param1 & 1024) ? true : false;
        }
        FighterBayWeaponDefinition.l(71);
        return 0 != (param1 & 1024) ? true : false;
    }

    final boolean aimsDirectlyAtTarget(boolean param0) {
        if (!param0) {
          return true;
        }
        return true;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          return -71;
        }
        return SetThrusterBindingMoveAndTurnHasOppositeMove.field_p;
    }

    final int getAimArc(int param0) {
        int var2 = 120 % ((param0 - 7) / 47);
        return SetVariableActionFactory.field_b;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          this.getAimArc(-100);
          return 87;
        }
        return 87;
    }

    static {
    }
}
