/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static String field_e;
    static String field_f;
    static gh[] field_b;
    static String field_c;
    static String field_a;
    static int field_d;

    public static void a(boolean param0) {
        Object var2 = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (!param0) {
          var2 = null;
          en.a((java.awt.Canvas) null, 17);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(byte param0, ak param1, int param2, int param3, ak param4, int param5) {
        h.field_U = param3;
        qh.field_Xb = param4;
        tf.field_c = param5;
        id.field_ac = param2;
        rg.field_b = param1;
        if (param0 > -46) {
            en.a(70);
        }
    }

    private final static void a(int param0, String param1, boolean param2, float param3) {
        if (!(r.field_r != null)) {
            r.field_r = new ki(ag.field_p, ba.field_f);
            ag.field_p.a((lh) (Object) r.field_r, 79);
        }
        r.field_r.a(114, param2, param1, param3);
        if (param0 > -77) {
            en.a(-66);
        } else {
            pb.b();
        }
        pb.b();
        pb.b();
        wn.a(0, true);
    }

    final static void a(java.awt.Canvas param0, int param1) {
        Object var3 = null;
        if (uj.field_d != 11) {
          if (param1 != -28003) {
            var3 = null;
            en.a((byte) 126, (ak) null, -34, -85, (ak) null, -5);
            en.a(-84, od.field_i, rg.field_h, q.field_l);
            kg.a(0, 0, 28594, param0);
            return;
          } else {
            en.a(-84, od.field_i, rg.field_h, q.field_l);
            kg.a(0, 0, 28594, param0);
            return;
          }
        } else {
          sl.a((byte) 3);
          if (param1 == -28003) {
            en.a(-84, od.field_i, rg.field_h, q.field_l);
            kg.a(0, 0, 28594, param0);
            return;
          } else {
            var3 = null;
            en.a((byte) 126, (ak) null, -34, -85, (ak) null, -5);
            en.a(-84, od.field_i, rg.field_h, q.field_l);
            kg.a(0, 0, 28594, param0);
            return;
          }
        }
    }

    final static void a(int param0) {
        int var1 = -81 % ((0 - param0) / 52);
        s.a(10);
    }

    final static hk a(int param0, int param1) {
        if (param1 != 28858) {
            return null;
        }
        return (hk) (Object) (fm.field_a != null ? fm.field_a.a((long)param0, (byte) 98) : null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Loading graphics";
        field_c = "Real-life threats";
        field_d = 500;
        field_a = "Invalid name";
    }
}
