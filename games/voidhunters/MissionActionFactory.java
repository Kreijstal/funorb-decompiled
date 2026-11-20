/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionActionFactory implements GameStateFactory {
    static ShipComponent[] field_a;

    final static String a(char param0, int param1) {
        if (param1 != 6) {
          field_a = (ShipComponent[]) null;
          return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 13 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new MissionAction());
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (ShipComponent[]) null;
          return (SerializableGameState[]) ((Object) new MissionAction[param1]);
        }
        return (SerializableGameState[]) ((Object) new MissionAction[param1]);
    }

    static {
        field_a = new ShipComponent[6];
    }
}
