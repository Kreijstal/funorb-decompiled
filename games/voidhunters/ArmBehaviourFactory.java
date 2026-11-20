/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArmBehaviourFactory implements GameStateFactory {
    static int field_a;

    final static void sendLobbyGameRequest(int param0, int param1, int param2) {
        IsaacPacketBuffer var3 = null;
        if (param2 == 20694) {
          var3 = RequestNewestBlackboxRecording.field_p;
          var3.writeIsaacByte(param2 ^ 4057, param1);
          var3.writeByte(0, 3);
          var3.writeByte(0, 10);
          var3.writeShort(param0, true);
          return;
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.createArray(-5, 123);
          return (SerializableGameState[]) ((Object) new ArmBehaviour[param1]);
        }
        return (SerializableGameState[]) ((Object) new ArmBehaviour[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -123 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new ArmBehaviour());
    }

    static {
        field_a = 10;
    }
}
