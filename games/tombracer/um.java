/*
 * Decompiled by CFR-JS 0.4.0.
 */
class um extends od {
    static String field_k;
    static byte[] field_m;
    static mpa field_l;

    final static vb a(int param0, int param1, u param2, int param3, int param4) {
        qia var5 = null;
        RuntimeException var5_ref = null;
        sc var6 = null;
        vb var7 = null;
        vb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5 = qia.b(param2, 100, param4, param0);
            var6 = hda.a(param1, 1303, (cg) (Object) var5);
            var7 = new vb(var5, (vg) (Object) var6);
            tna.field_e.b((byte) -57, (vg) (Object) var7);
            kva.field_n.a((cg) (Object) var6);
            stackOut_0_0 = (vb) var7;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("um.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -6455 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    um() {
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if (!kba.a(-1, param0)) {
            return epa.field_r[param2];
          } else {
            return 29;
          }
        } else {
          return epa.field_r[param2];
        }
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_m = null;
        field_l = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "OpenGL";
    }
}
