/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vjb {
    static boolean field_a;
    static sfb field_b;
    static String field_c;

    final static void a(byte param0) {
        if (param0 <= 75) {
          vjb.a((byte) 48);
          lnb.d(0);
          ebb.a((byte) -74);
          crb.field_v = null;
          fea.a(-1);
          return;
        } else {
          lnb.d(0);
          ebb.a((byte) -74);
          crb.field_v = null;
          fea.a(-1);
          return;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != 53) {
            vjb.b((byte) -48);
        }
    }

    abstract void a(float param0, float param1, float[] param2, float param3, int param4, float param5, byte param6, int param7, int param8, int param9, int param10);

    static {
        field_a = false;
        field_c = "<%0> is already on your ignore list.";
    }
}
