/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends rqa {
    static float[] field_r;
    static llb field_p;
    static float[] field_o;
    static dja field_q;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 16086) {
          kn.a(-66);
          field_q = null;
          field_p = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_r = null;
          return;
        }
    }

    kn(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          kn.a(-101);
          return new nc((Object) (Object) frb.a(115, 100));
        } else {
          return new nc((Object) (Object) frb.a(115, 100));
        }
    }

    final static void a(byte param0, int[] param1, long[] param2) {
        kc.a(-14677, param2, 0, param1, param2.length + -1);
        if (param0 != -24) {
            Object var4 = null;
            Object[] discarded$0 = kn.a((Object[]) null, (Object) null, false, (dja) null, 32);
        }
    }

    final static Object[] a(Object[] param0, Object param1, boolean param2, dja param3, int param4) {
        if (param4 >= -73) {
          kn.a(64);
          return qlb.a(param0, param1, param3, param2, false, 1);
        } else {
          return qlb.a(param0, param1, param3, param2, false, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_r = new float[16384];
        field_o = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; 16384 > var2; var2++) {
            field_r[var2] = (float)Math.sin(var0 * (double)var2);
            field_o[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_q = (dja) (Object) new qaa();
    }
}
