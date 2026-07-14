/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi implements vc {
    int field_a;
    private od field_e;
    static jn field_f;
    int[] field_c;
    int field_d;
    static int field_h;
    static ri[] field_b;
    static String field_g;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 != 5423) {
            hi.a(-118, -104, 102, (byte) -57, 11, -58, -86, -66, -88, -10, 127, 84, -31, 35, 34, 22);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = 0;
        var17 = Sumoblitz.field_L ? 1 : 0;
        if (param12 < param8) {
          if (param2 <= param8) {
            if (param12 < param2) {
              ph.a(param5, param13, param10, param6, lk.field_a, param11, param4, param1, param7, param0, param15, param14, param8, param12, (byte) -48, param9, param2);
              var16 = 70 % ((68 - param3) / 35);
              return;
            } else {
              ph.a(param0, param13, param10, param6, lk.field_a, param4, param11, param9, param14, param5, param15, param7, param8, param2, (byte) -48, param1, param12);
              var16 = 70 % ((68 - param3) / 35);
              return;
            }
          } else {
            ph.a(param5, param11, param7, param1, lk.field_a, param13, param4, param6, param10, param15, param0, param14, param2, param12, (byte) -48, param9, param8);
            var16 = 70 % ((68 - param3) / 35);
            return;
          }
        } else {
          if (param12 >= param2) {
            if (param2 <= param8) {
              ph.a(param0, param4, param14, param9, lk.field_a, param13, param11, param6, param10, param15, param5, param7, param12, param2, (byte) -48, param1, param8);
              var16 = 70 % ((68 - param3) / 35);
              return;
            } else {
              ph.a(param15, param4, param14, param9, lk.field_a, param11, param13, param1, param7, param0, param5, param10, param12, param8, (byte) -48, param6, param2);
              var16 = 70 % ((68 - param3) / 35);
              return;
            }
          } else {
            ph.a(param15, param11, param7, param1, lk.field_a, param4, param13, param9, param14, param5, param0, param10, param2, param8, (byte) -48, param6, param12);
            var16 = 70 % ((68 - param3) / 35);
            return;
          }
        }
    }

    hi(qa param0, hr param1, od param2) {
        gl var5 = null;
        mj var6 = null;
        if (!(param1 instanceof mj)) {
            if (!(param1 instanceof gl)) {
                throw new RuntimeException();
            }
            var5 = (gl) (Object) param1;
            ((hi) this).field_d = var5.field_z;
            ((hi) this).field_c = var5.field_E;
            ((hi) this).field_a = var5.field_q;
        } else {
            var6 = (mj) (Object) param1;
            ((hi) this).field_d = var6.field_z;
            ((hi) this).field_a = var6.field_q;
            ((hi) this).field_c = var6.field_E;
        }
        if (param2 == null) {
        }
        ((hi) this).field_e = param2;
        if (((hi) this).field_d != ((hi) this).field_e.field_b) {
            throw new RuntimeException();
        }
        if (((hi) this).field_a != ((hi) this).field_e.field_a) {
            throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new jn();
        field_g = "Checking";
    }
}
