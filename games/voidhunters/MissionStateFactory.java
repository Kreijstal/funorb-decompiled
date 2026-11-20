/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionStateFactory implements GameStateFactory {
    public final SerializableGameState create(byte param0) {
        int var2 = 13 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new MissionState());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.createArray(51, -109);
          return (SerializableGameState[]) ((Object) new MissionState[param1]);
        }
        return (SerializableGameState[]) ((Object) new MissionState[param1]);
    }

    static {
    }
}
