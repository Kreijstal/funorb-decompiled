/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lva extends rqa {
    static float[] field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_p = -18;
          return new nc((Object) (Object) frb.a(102, 96));
        } else {
          return new nc((Object) (Object) frb.a(102, 96));
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          field_p = -73;
          al.field_a = kda.field_g + " <b>" + amb.field_b + "</b> " + vda.field_p + " <b>" + fja.field_r + "</b> " + inb.field_p + "<br>" + "<br>" + msa.field_r;
          return;
        } else {
          al.field_a = kda.field_g + " <b>" + amb.field_b + "</b> " + vda.field_p + " <b>" + fja.field_r + "</b> " + inb.field_p + "<br>" + "<br>" + msa.field_r;
          return;
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param1 + -1 & param0 >> -1128139841;
        int var4 = 125 % ((param2 - -6) / 41);
        return var3 + (param0 - -(param0 >>> 617169759)) % param1;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 617169759) {
            lva.a(-84);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 8 / ((-49 - param1) / 47);
        dmb.field_c = param2;
        wua.field_k = param0;
    }

    final static void e(byte param0) {
        if (param0 != 117) {
            return;
        }
        qn.field_h.g((byte) -17);
        qn.field_h.a(false, (shb) (Object) new hnb(qn.field_h));
    }

    lva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new float[4];
    }
}
