/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static di field_c;
    static int field_b;
    static int field_a;

    final static void a(int param0) {
        if (!fd.d((byte) -21)) {
            return;
        }
        qc.a(4, false, 0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = 0;
        var17 = stellarshard.field_B;
        var16 = -36;
        if (param12 < param1) {
          if (param8 <= param1) {
            if (param12 < param8) {
              qc.a(param13, param0, ti.field_a, param5, param3, param11, param10, param1, param6, param12, param8, param2, (byte) 127, param9, param14, param15, param4);
              return;
            } else {
              qc.a(param13, param0, ti.field_a, param15, param3, param4, param10, param1, param9, param8, param12, param14, (byte) 127, param6, param2, param5, param11);
              return;
            }
          } else {
            qc.a(param4, param5, ti.field_a, param0, param6, param11, param14, param8, param3, param12, param1, param2, (byte) 127, param9, param10, param15, param13);
            return;
          }
        } else {
          if (param12 >= param8) {
            if (param1 >= param8) {
              qc.a(param11, param15, ti.field_a, param0, param9, param4, param2, param12, param3, param8, param1, param14, (byte) 127, param6, param10, param5, param13);
              return;
            } else {
              qc.a(param11, param15, ti.field_a, param5, param9, param13, param2, param12, param6, param1, param8, param10, (byte) 127, param3, param14, param0, param4);
              return;
            }
          } else {
            qc.a(param4, param5, ti.field_a, param15, param6, param13, param14, param8, param9, param1, param12, param10, (byte) 127, param3, param2, param0, param11);
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        ug.field_d = ib.field_h[param1];
        rg.field_I = se.field_E[param1];
        kf.field_d = e.field_f[param1];
        if (param0 <= 33) {
            ke.a(110, 60);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new di();
    }
}
