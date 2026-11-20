/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceNodeFactory implements GameStateFactory {
    public final SerializableGameState create(byte param0) {
        int var2 = -50 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new ResourceNode());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) -86);
          return (SerializableGameState[]) ((Object) new ResourceNode[param1]);
        }
        return (SerializableGameState[]) ((Object) new ResourceNode[param1]);
    }

    static {
    }
}
