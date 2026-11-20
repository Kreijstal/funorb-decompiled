/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionConditionFactory implements GameStateFactory {
    static vfa field_b;
    static QuickChatDynamicCommand field_c;
    static Widget field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_c = (QuickChatDynamicCommand) null;
          return (SerializableGameState[]) ((Object) new MissionCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new MissionCondition[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -65 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new MissionCondition());
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 == -80) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        field_c = (QuickChatDynamicCommand) null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_b = null;
        field_c = new QuickChatDynamicCommand(4, 1, 1, 1);
    }
}
