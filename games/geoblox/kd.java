/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static al field_b;
    static String field_d;
    static ng field_e;
    static String field_a;
    static int[] field_f;
    static int field_c;

    public static void a(byte param0) {
        int var1 = 0;
        field_e = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_b = null;
    }

    final static void b(byte param0) {
        if (param0 > 79) {
          if (10 != hj.field_a) {
            if (ck.b(0)) {
              lb.field_a = true;
              return;
            } else {
              la.f((byte) 24);
              hj.field_a = 11;
              lb.field_a = true;
              return;
            }
          } else {
            la.f((byte) 24);
            hj.field_a = 11;
            lb.field_a = true;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "It's the<br>bubble bonus!";
        field_a = "Achieved";
        field_f = new int[23];
        field_f[14] = lb.a(field_f[14], 128);
        field_f[12] = lb.a(field_f[12], 17);
        field_f[0] = 0;
        field_f[2] = lb.a(field_f[2], 12);
        field_f[15] = lb.a(field_f[15], 3);
        field_f[5] = lb.a(field_f[5], 140);
        field_f[1] = lb.a(field_f[1], 4);
        field_f[6] = lb.a(field_f[6], 1);
        field_f[11] = lb.a(field_f[11], 132);
        field_f[4] = lb.a(field_f[4], 0);
        field_f[16] = lb.a(field_f[16], 0);
        field_f[13] = lb.a(field_f[13], 16);
        field_f[21] = lb.a(field_f[21], 16);
        field_f[3] = lb.a(field_f[3], 133);
        field_f[7] = lb.a(field_f[7], 4);
        field_f[22] = lb.a(field_f[22], 0);
        field_f[17] = lb.a(field_f[17], 128);
        field_f[8] = lb.a(field_f[8], 136);
        field_f[20] = lb.a(field_f[20], 132);
        field_f[9] = lb.a(field_f[9], 2);
        field_f[18] = lb.a(field_f[18], 2);
        field_f[19] = lb.a(field_f[19], 16);
        field_f[10] = lb.a(field_f[10], 4);
        field_c = 0;
    }
}
