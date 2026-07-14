/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    boolean field_c;
    static hr field_f;
    int field_e;
    boolean field_b;
    String[] field_h;
    String field_g;
    static int field_a;
    static ck field_d;

    final static float a(float param0, float param1, int param2, float param3, int param4) {
        float[] var5 = null;
        float[] var6 = null;
        if (param4 != 2) {
          return 1.2348530292510986f;
        } else {
          var6 = qu.field_i[param2];
          var5 = var6;
          return var6[1] * param0 + param3 * var6[0] + var6[2] * param1;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 4) {
            field_a = 11;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(int param0, byte param1, hg param2) {
        hi.field_f.a((ms) (Object) param2, (byte) 39);
        pm.a(param0, 1, param2);
        if (param1 <= 5) {
            field_f = null;
        }
    }

    an(boolean param0) {
        ((an) this).field_b = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ck();
    }
}
