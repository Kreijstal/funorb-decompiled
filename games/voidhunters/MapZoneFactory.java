/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MapZoneFactory implements GameStateFactory {
    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) -41);
          return (SerializableGameState[]) ((Object) new MapZone[param1]);
        }
        return (SerializableGameState[]) ((Object) new MapZone[param1]);
    }

    final static boolean isQuickChatOverlayOpen(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -26243) {
          return false;
        }
        if (null != RoundResultFactory.quickChatHelpWindow) {
          stackIn_7_0 = true;
        } else {
          if (LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 5 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new MapZone());
    }

    static {
    }
}
