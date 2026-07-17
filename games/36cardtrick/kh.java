/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kh {
    static char[] field_f;
    int field_b;
    static int field_e;
    int[] field_h;
    static bk field_c;
    int field_d;
    java.awt.Image field_a;
    static int field_g;

    public static void b(int param0) {
        field_c = null;
        field_f = null;
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, byte param3);

    abstract void a(java.awt.Component param0, int param1, byte param2, int param3);

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = -73 / ((param0 - -36) / 39);
        param1 = param1 & 8191;
        if (-4097 < param1) {
          L0: {
            if (-2049 > param1) {
              stackOut_7_0 = ad.field_g[2048 + -param1];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -ad.field_g[-2048 + param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 6144) {
              stackOut_3_0 = ad.field_g[param1 + -6144];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -ad.field_g[6144 - param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(int param0) {
        if (param0 != 200) {
            return;
        }
        vj.a(((kh) this).field_h, ((kh) this).field_b, ((kh) this).field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
