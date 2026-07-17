/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ms {
    static hv field_m;
    int field_o;
    int field_k;
    static int field_l;
    static int field_p;
    static Object field_n;
    static String field_r;
    static int[] field_q;

    public static void a(byte param0) {
        if (param0 > -117) {
          pd.a((byte) 113);
          field_q = null;
          field_r = null;
          field_n = null;
          field_m = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          field_n = null;
          field_m = null;
          return;
        }
    }

    final static void a(byte param0, int param1, of param2) {
        pl var3 = null;
        try {
            if (param0 != -65) {
                field_m = null;
            }
            var3 = as.field_v;
            var3.g(param1, 8);
            var3.b((byte) 103, 5);
            var3.b((byte) 46, 0);
            var3.b(117, param2.field_p);
            var3.b((byte) 86, param2.field_l);
            var3.b((byte) 121, param2.field_s);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "pd.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static db a(byte[] param0, int param1, int param2) {
        db var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        db stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        db stackOut_2_0 = null;
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
              if (param2 == 5412) {
                break L1;
              } else {
                var4 = null;
                db discarded$2 = pd.a((byte[]) null, 48, 96);
                break L1;
              }
            }
            var3 = new db(param0);
            jj.field_a.a((ms) (Object) var3, (byte) 39);
            mn.a(var3, param2 + -5530, param1);
            stackOut_2_0 = (db) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("pd.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    private pd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new hv();
        field_r = "Name";
    }
}
