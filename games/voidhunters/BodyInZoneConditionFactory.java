/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BodyInZoneConditionFactory implements GameStateFactory {
    static long field_a;
    static int field_b;

    public final SerializableGameState create(byte param0) {
        int var2 = -10 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new BodyInZoneCondition());
    }

    final static boolean isMenuScreenActive(boolean param0, int param1) {
        if (param0) {
          return true;
        }
        return param1 >= 0 ? true : false;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.createArray(-39, -108);
          return (SerializableGameState[]) ((Object) new BodyInZoneCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new BodyInZoneCondition[param1]);
    }

    final static void configureMenuItemStyles(int param0, NineSliceSprite param1, int param2, int param3, NineSliceSprite param4, int param5) {
        ShipTeamCondition.field_e = param5;
        SpawnEnemyShipOrderDefinition.field_g = param0;
        if (param2 <= 112) {
          return;
        }
        try {
          SocialTabResources.field_d = param1;
          SetPointDefenceLaserAimarc.field_q = param3;
          StrongCacheReference.field_o = param4;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "wqa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_b = 1;
    }
}
