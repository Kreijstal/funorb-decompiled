/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dlb implements dja {
    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new Player[param1]);
    }

    public final tv a(byte param0) {
        int var2 = -118 % ((-64 - param0) / 50);
        return (tv) ((Object) new Player());
    }

    final static caa a(int param0) {
        caa var1 = new caa(fbb.field_i, Ship.field_H, iib.field_e[0], SettingsChange.field_f[0], SetMissionTerrainDebrisProbability.field_o[0], hla.field_a[0], sh.field_a[0], rlb.field_d);
        if (param0 < -53) {
          MatchResults.a(95);
          return var1;
        }
        dlb.a(16);
        MatchResults.a(95);
        return var1;
    }

    static {
    }
}
