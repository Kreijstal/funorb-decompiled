/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != -3) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static String b(int param0) {
        if (mp.field_a < 2) {
          return pi.field_b;
        }
        if (null != hd.field_H) {
          if (!hd.field_H.b((byte) 127)) {
            return ek.field_k;
          }
          return mm.field_c;
        }
        if (!wd.field_j.b((byte) 127)) {
          return m.field_V;
        }
        if (!wd.field_j.a("commonui", 100)) {
          return es.field_j + " - " + wd.field_j.a("commonui", (byte) 33) + "%";
        }
        if (param0 <= 90) {
          dn.b(-125);
        }
        if (!eb.field_f.b((byte) 127)) {
          return ce.field_l;
        }
        if (!eb.field_f.a("commonui", 100)) {
          return ow.field_a + " - " + eb.field_f.a("commonui", (byte) 33) + "%";
        }
        if (!hw.field_a.b((byte) 127)) {
          return fl.field_s;
        }
        if (!hw.field_a.a(true)) {
          return rd.field_m + " - " + hw.field_a.a(0) + "%";
        }
        return mm.field_b;
    }

    static {
        field_b = "arcade game";
        field_a = "Apply";
    }
}
