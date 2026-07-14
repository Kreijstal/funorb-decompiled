/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static sna field_b;
    int field_d;
    private int field_f;
    private int field_c;
    pd[] field_a;
    static String field_e;

    final void a(byte param0, pd param1) {
        if (((qc) this).field_f >= qga.field_p[((qc) this).field_c]) {
          return;
        } else {
          L0: {
            ((qc) this).field_a[((qc) this).field_f] = param1;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            if (param0 <= -93) {
              break L0;
            } else {
              ((qc) this).field_c = 122;
              break L0;
            }
          }
          return;
        }
    }

    final static void a(je param0, int param1) {
        if (param1 != -2490) {
            return;
        }
        saa.field_a.b((tda) (Object) param0);
    }

    qc(int param0) {
        ((qc) this).field_c = param0;
        ((qc) this).field_d = qga.field_p[((qc) this).field_c];
        ((qc) this).field_a = new pd[((qc) this).field_d];
    }

    public static void a(byte param0) {
        if (param0 <= 15) {
            field_e = null;
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Scamming";
    }
}
