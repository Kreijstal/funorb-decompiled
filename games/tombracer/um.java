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
        vb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -6455) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var5 = qia.b(param2, 100, param4, param0);
            var6 = hda.a(param1, 1303, (cg) (Object) var5);
            var7 = new vb(var5, (vg) (Object) var6);
            tna.field_e.b((byte) -57, (vg) (Object) var7);
            kva.field_n.a((cg) (Object) var6);
            stackOut_2_0 = (vb) var7;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("um.EA(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_3_0;
    }

    um() {
    }

    final static int a(int param0, int param1, int param2) {
        if (~param2 == param1) {
          if (!kba.a(param1 + 1, param0)) {
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
