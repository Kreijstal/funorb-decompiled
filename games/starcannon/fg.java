/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static hl[] field_c;
    static jl[] field_a;
    static int[] field_b;

    final static id[] a(ue param0, String param1, String param2, boolean param3) {
        int var4 = param0.a(param2, param3);
        int var5 = param0.a(param1, !param3 ? true : false, var4);
        return ji.a(!param3 ? true : false, param0, var5, var4);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 6) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, hl[] param1, int param2, int param3) {
        if (param0 != 32513) {
          field_b = null;
          u.field_c = new gi(param1);
          qf.field_g = param2;
          qc.field_g = param3;
          nc.a((byte) 83);
          return;
        } else {
          u.field_c = new gi(param1);
          qf.field_g = param2;
          qc.field_g = param3;
          nc.a((byte) 83);
          return;
        }
    }

    static {
    }
}
