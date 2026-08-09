/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dia extends ela {
    static gq field_o;
    static float[] field_p;
    static char field_q;
    static float[] field_r;

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            field_r = (float[]) null;
            field_p = null;
            field_r = null;
            return;
        }
        field_p = null;
        field_r = null;
    }

    final static ka a(boolean param0, int param1, boolean param2, byte param3) {
        if (param0) {
            return ola.field_Ib[param1];
        }
        if (param3 < 119) {
            field_q = 'ﾶ';
            if (!(!param2)) {
                return mma.field_b[param1];
            }
            return jma.field_a[param1];
        }
        if (!(!param2)) {
            return mma.field_b[param1];
        }
        return jma.field_a[param1];
    }

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa stackIn_2_0 = null;
        bfa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = new bfa(sj.a((byte) 120));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (bfa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("dia.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    dia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = new float[2];
        field_r = new float[4];
        field_q = ',';
    }
}
