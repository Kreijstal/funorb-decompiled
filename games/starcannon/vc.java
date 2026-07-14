/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends rf {
    static String field_k;
    boolean field_j;
    static String field_f;
    int[][] field_o;
    int field_l;
    static hl[] field_m;
    long[][] field_g;
    String[][] field_n;
    int field_i;
    int field_h;

    final static void a(int param0, byte param1, int param2) {
        if (param1 != 60) {
          vc.b((byte) 96);
          ff.field_o = param0;
          nh.field_e = 1;
          jb.field_e = 0;
          vj.field_ab = param2;
          return;
        } else {
          ff.field_o = param0;
          nh.field_e = 1;
          jb.field_e = 0;
          vj.field_ab = param2;
          return;
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 != 35) {
            vc.b((byte) -120);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final static void a(int param0, int param1, int param2) {
        a.field_e = param1;
        if (param2 != 1) {
            return;
        }
        dg.field_n = param0;
    }

    vc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "POWERUPS 1/2:";
        field_f = "Sound: ";
    }
}
