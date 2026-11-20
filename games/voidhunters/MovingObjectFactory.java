/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MovingObjectFactory implements GameStateFactory {
    static java.awt.Dimension field_a;
    static int field_b;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 > 109) {
          return;
        }
        field_a = (java.awt.Dimension) null;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (java.awt.Dimension) null;
          return (SerializableGameState[]) ((Object) new MovingObject[param1]);
        }
        return (SerializableGameState[]) ((Object) new MovingObject[param1]);
    }

    final static void insertSortedLobbyGame(byte param0, LobbyGameEntry param1) {
        LobbyGameEntry var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          param1.unlink(-3846);
          var2 = (LobbyGameEntry) (kja.field_E.first(0));
          if (param0 < 99) {
            return;
          }
          while (var2 != null) {
            if (var2.comesBefore(param1, -128)) {
              var2 = (LobbyGameEntry) (kja.field_E.next((byte) 28));
              continue;
            }
            break;
          }
          if (var2 == null) {
            kja.field_E.addLast(-10258, param1);
            return;
          }
          SoftwareFramebuffer.insertBefore(param1, var2, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("eta.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != -1104) {
          return false;
        }
        return (param2 & 2048) != 0 ? true : false;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 31 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new MovingObject());
    }

    static {
        field_a = new java.awt.Dimension(640, 480);
        field_b = 4;
    }
}
