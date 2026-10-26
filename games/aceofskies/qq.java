/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qq {
    int field_f;
    static AircraftDefinition field_g;
    static vd[] field_e;
    String field_c;
    String field_a;
    String field_b;
    ResourceArchive field_d;

    final static int a(int param0, int param1) {
        if (param0 != 20) {
          field_e = (vd[]) null;
          return bs.a(-1, ci.gameRandom, param1);
        }
        return bs.a(-1, ci.gameRandom, param1);
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 < 35) {
          field_g = (AircraftDefinition) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static void a(byte param0) {
        if (null != du.menuActionLabels) {
          return;
        }
        du.menuActionLabels = new String[23];
        du.menuActionLabels[4] = dk.field_b;
        du.menuActionLabels[11] = ne.field_h;
        du.menuActionLabels[0] = HighscoreNameEntry.field_c;
        du.menuActionLabels[16] = q.field_l;
        du.menuActionLabels[1] = s.field_h;
        du.menuActionLabels[12] = af.field_a;
        du.menuActionLabels[6] = ef.field_i;
        du.menuActionLabels[5] = ef.field_i;
        du.menuActionLabels[14] = so.field_a;
        du.menuActionLabels[15] = iu.field_e;
        du.menuActionLabels[7] = ic.field_a;
        du.menuActionLabels[3] = me.field_a;
        du.menuActionLabels[13] = NetworkGameClient.field_C;
        du.menuActionLabels[2] = od.field_v;
        du.menuActionLabels[17] = ve.field_a;
        du.menuActionLabels[19] = iu.field_f;
        du.menuActionLabels[8] = tq.field_e[0];
        du.menuActionLabels[20] = wq.field_i;
        if (param0 <= -83) {
          du.menuActionLabels[18] = so.field_c;
          du.menuActionLabels[10] = tq.field_e[2];
          du.menuActionLabels[21] = ki.field_c;
          du.menuActionLabels[22] = ii.field_l;
          du.menuActionLabels[9] = tq.field_e[1];
          return;
        }
        field_e = (vd[]) null;
        du.menuActionLabels[18] = so.field_c;
        du.menuActionLabels[10] = tq.field_e[2];
        du.menuActionLabels[21] = ki.field_c;
        du.menuActionLabels[22] = ii.field_l;
        du.menuActionLabels[9] = tq.field_e[1];
    }

    private qq() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new AircraftDefinition(1.2, 2, 2, 300, 3, 7.0, 10.0, 16, 1);
    }
}
