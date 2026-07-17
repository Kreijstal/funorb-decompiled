/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vj {
    int field_b;
    static dd field_c;
    static String field_a;

    final void a(int param0) {
        if (param0 > ~wi.field_b) {
          if (null != cm.field_b) {
            return;
          } else {
            cm.field_b = va.a(mc.field_b, 40, pg.field_d, 65495, vh.field_o, (byte) -102, 3, new int[1], mc.field_a);
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        j.field_f = j.field_f ^ ((vj) this).field_b;
        vh.field_o = vh.field_o ^ j.field_f;
        wi.field_b = wi.field_b + j.field_f;
        pg.field_d = pg.field_d ^ j.field_f;
        j.field_f = ((vj) this).field_b;
        if (param0) {
          field_c = null;
          mc.field_a = wi.field_b & 65535;
          mc.field_b = -65536 & wi.field_b;
          return;
        } else {
          mc.field_a = wi.field_b & 65535;
          mc.field_b = -65536 & wi.field_b;
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param0 > -111) {
          ((vj) this).a(-120, 73);
          j.field_f = j.field_f ^ ((vj) this).field_b;
          j.field_f = j.field_f + param1;
          j.field_f = j.field_f ^ ((vj) this).field_b;
          return;
        } else {
          j.field_f = j.field_f ^ ((vj) this).field_b;
          j.field_f = j.field_f + param1;
          j.field_f = j.field_f ^ ((vj) this).field_b;
          return;
        }
    }

    public static void b() {
        field_a = null;
        field_c = null;
    }

    vj() {
        fleas.field_L = 0;
        ((vj) this).field_b = db.a((byte) -115, qe.field_j, 65536) << 16;
        ((vj) this).field_b = ((vj) this).field_b + db.a((byte) -115, qe.field_j, 65536);
        mc.field_b = 0;
        wi.field_b = 0;
        pg.field_d = 61453;
        mc.field_a = 0;
        vh.field_o = -889323520;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hints (2/2)";
    }
}
