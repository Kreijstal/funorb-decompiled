/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThrusterBehaviourFactory implements GameStateFactory {
    static String field_a;
    static String field_b;

    public final SerializableGameState create(byte param0) {
        int var2 = -63 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new ThrusterBehaviour());
    }

    final static java.awt.Container getGameContainer(int param0) {
        if (null != PointDefenceLaserWeaponDefinition.field_c) {
          return (java.awt.Container) ((Object) PointDefenceLaserWeaponDefinition.field_c);
        }
        if (param0 != -28941) {
          field_a = (String) null;
          return (java.awt.Container) ((Object) MissionList.getApplet((byte) -122));
        }
        return (java.awt.Container) ((Object) MissionList.getApplet((byte) -122));
    }

    final static boolean a(int param0) {
        if (param0 != 31065) {
          return true;
        }
        return AdjustVariableAction.field_a;
    }

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        int var1 = 2 % ((-29 - param0) / 47);
        field_b = null;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new ThrusterBehaviour[param1]);
    }

    static {
        field_a = "More power plants";
        WorldFactory discarded$0 = new WorldFactory();
        field_b = "More sawblades";
    }
}
