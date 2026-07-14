/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oj extends vh {
    static long field_y;
    int field_t;
    int field_p;
    int field_v;
    int field_u;
    int field_q;
    static cb field_w;
    static volatile long field_x;
    static char[] field_s;
    int field_r;

    private final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = ((oj) this).field_q << 294922755;
        var7 = ((oj) this).field_u << -232022461;
        param4 = (var6 & 15) + (param4 << -174144380);
        if (param0 != 88) {
          ((oj) this).field_v = -52;
          param1 = (var7 & 15) + (param1 << -44610108);
          ((oj) this).a(var6, var7, param4, param1, param2, param3);
          return;
        } else {
          param1 = (var7 & 15) + (param1 << -44610108);
          ((oj) this).a(var6, var7, param4, param1, param2, param3);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 21) {
          this.a((byte) -117, -7, -108, 10, -112);
          this.a((byte) 88, param3, param0 << -486964408, param1 << -620470107, param2);
          return;
        } else {
          this.a((byte) 88, param3, param0 << -486964408, param1 << -620470107, param2);
          return;
        }
    }

    public static void d(byte param0) {
        if (param0 > -47) {
            oj.d((byte) -67);
            field_w = null;
            field_s = null;
            return;
        }
        field_w = null;
        field_s = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    oj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0L;
        field_s = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
