/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static String[] field_b;
    static li field_a;
    static int[] field_c;

    final static void a(byte param0) {
        ke.field_f = new le[3];
        ke.field_f[0] = new le(410, 67);
        if (param0 != -31) {
          field_c = null;
          ke.field_f[1] = new le(221, 190);
          ke.field_f[2] = new le(178, 190);
          return;
        } else {
          ke.field_f[1] = new le(221, 190);
          ke.field_f[2] = new le(178, 190);
          return;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        field_b = null;
        if (param0 != 1) {
          var2 = null;
          gj.a(-38, -19, -44, 117, -100, -28, 19, -46, 44, (ta) null, 126, -70, (ta) null, 108, (gg) null, 59, 98, 43, 6, (gg) null, (gg) null);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, ta param9, int param10, int param11, ta param12, int param13, gg param14, int param15, int param16, int param17, int param18, gg param19, gg param20) {
        ff.a(false, param9, param12, param3);
        wf.a(param10, param17, param0, 8192, param16);
        if (param15 >= -88) {
          field_c = null;
          tf.a((byte) 33, param6, param13);
          e.a(param19, param8, param11, param18, -1, param20);
          qa.a((byte) -39, param14, param1, param5);
          w.a(param7, param4, param2, -21734);
          return;
        } else {
          tf.a((byte) 33, param6, param13);
          e.a(param19, param8, param11, param18, -1, param20);
          qa.a((byte) -39, param14, param1, param5);
          w.a(param7, param4, param2, -21734);
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        di.field_c = param1;
        sc.field_e = 1;
        ej.field_b = param0;
        dh.field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = null;
        field_c = new int[8192];
    }
}
