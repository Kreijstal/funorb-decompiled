/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerFactory implements GameStateFactory {
    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new Player[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -118 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new Player());
    }

    final static SoftwareIndexedSprite2D createFirstSoftwareIndexedSprite(int param0) {
        SoftwareIndexedSprite2D var1 = new SoftwareIndexedSprite2D(fbb.field_i, Ship.field_H, iib.field_e[0], SettingsChange.field_f[0], SetMissionTerrainDebrisProbability.field_o[0], hla.field_a[0], sh.field_a[0], rlb.field_d);
        if (param0 < -53) {
          MatchResults.a(95);
          return var1;
        }
        PlayerFactory.createFirstSoftwareIndexedSprite(16);
        MatchResults.a(95);
        return var1;
    }

    static {
    }
}
