/*
 * Decompiled by CFR-JS 0.4.0.
 */
class eo extends bw {
    static kv[] field_k;
    static js field_f;
    eo field_m;
    static String field_j;
    static int field_l;
    static String field_g;
    long field_h;
    eo field_i;

    final void b(int param0) {
        if (null == ((eo) this).field_i) {
          return;
        } else {
          ((eo) this).field_i.field_m = ((eo) this).field_m;
          if (param0 != 0) {
            return;
          } else {
            ((eo) this).field_m.field_i = ((eo) this).field_i;
            ((eo) this).field_i = null;
            ((eo) this).field_m = null;
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_j = null;
        field_k = null;
        field_g = null;
        if (param0 != 114) {
            return;
        }
        field_f = null;
    }

    final long d(int param0) {
        if (param0 >= -97) {
            return 6L;
        }
        return ((eo) this).field_h;
    }

    final boolean a(int param0) {
        if (param0 == 0) {
          if (((eo) this).field_i == null) {
            return false;
          } else {
            return true;
          }
        } else {
          ((eo) this).b(115);
          if (((eo) this).field_i == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static pp a(lu param0, int param1) {
        nq var2 = null;
        if (param1 != -4479) {
          field_l = 115;
          var2 = qi.a(param0, (byte) 64);
          return (pp) (Object) new fda(var2);
        } else {
          var2 = qi.a(param0, (byte) 64);
          return (pp) (Object) new fda(var2);
        }
    }

    final static void c(int param0) {
        int var3 = BachelorFridge.field_y;
        bda.field_l = 0;
        sja.field_gb = null;
        maa.field_v = 0;
        es.field_j.d(71);
        cca.field_v.d(59);
        eo var1 = wja.field_m.b((byte) -73);
        while (var1 != null) {
            var1.b(0);
            var1 = wja.field_m.a(-25177);
        }
        int var2 = -42 / ((param0 - 35) / 54);
        var1 = fq.field_s.b((byte) -73);
        while (var1 != null) {
            var1.b(0);
            var1 = fq.field_s.a(-25177);
        }
        um.field_c = 0;
    }

    final void a(boolean param0, long param1) {
        if (null != ((eo) this).field_i) {
            throw new RuntimeException();
        }
        if (!param0) {
            return;
        }
        ((eo) this).field_h = param1;
    }

    protected eo() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_j = "Visit the Account Management section on the main site to view.";
        field_g = "Achieved";
    }
}
