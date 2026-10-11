/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sla {
    static jpa field_a;
    static String[] field_b;
    static String field_c;
    static float[] field_f;
    static int field_d;
    static String field_e;

    public static void a(int param0) {
        if (param0 == -11536) {
          field_a = null;
          field_e = null;
          field_f = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (String[]) null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_c = null;
        field_b = null;
    }

    final static void b(int param0) {
        qpa.field_b = null;
        if (oea.field_i != null) {
          mka.field_b = rma.field_b;
          pq.field_g = oea.field_i;
          rma.field_b = null;
          pq.field_g.field_N = -1;
          oea.field_i = null;
          pq.field_g.field_ab = -1;
          lra.field_d = null;
          dh.field_e = null;
          lra.field_e = null;
          if (param0 != 29585) {
            sla.b(-98);
            wi.field_s = null;
            ni.field_c = true;
            return;
          }
          wi.field_s = null;
          ni.field_c = true;
          return;
        }
        lra.field_d = null;
        dh.field_e = null;
        lra.field_e = null;
        if (param0 == 29585) {
          wi.field_s = null;
          ni.field_c = true;
          return;
        }
        sla.b(-98);
        wi.field_s = null;
        ni.field_c = true;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = "Create";
        field_e = "Public chat is unavailable while setting up a rated game.";
        field_f = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
    }
}
