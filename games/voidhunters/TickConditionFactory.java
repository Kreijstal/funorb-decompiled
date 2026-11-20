/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TickConditionFactory implements GameStateFactory {
    static String field_b;
    static float[][] field_a;

    public static void clearSharedReferences(boolean param0) {
        field_b = null;
        field_a = (float[][]) null;
        if (param0) {
          TickConditionFactory.clearSharedReferences(true);
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -32 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new TickCondition());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (float[][]) null;
          return (SerializableGameState[]) ((Object) new TickCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new TickCondition[param1]);
    }

    static {
        field_b = "Searching for an opponent";
        field_a = new float[][]{new float[]{-0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}};
    }
}
