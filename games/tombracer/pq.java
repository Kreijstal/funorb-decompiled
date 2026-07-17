/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq implements os {
    static int field_f;
    static int[] field_e;
    static jea field_g;
    static iu[] field_b;
    static nh field_a;
    static String field_d;
    static jea field_c;

    public final mva[] a(int param0, int param1) {
        if (param1 != -26955) {
            return null;
        }
        return (mva[]) (Object) new wd[param0];
    }

    public final mva a(byte param0) {
        if (param0 > -17) {
            return null;
        }
        return (mva) (Object) new wd();
    }

    final static void a(byte[] param0, boolean param1, int param2, int param3, int param4, int param5) {
        kh var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var6 = ql.field_k;
            var6.k(param5, -2988);
            var6.field_h = var6.field_h + 1;
            var7 = var6.field_h;
            var6.i(4, 0);
            var6.i(param4, 0);
            var8 = 0;
            var8 += 128;
            int var9 = 34;
            var6.i(var8, 0);
            var6.a(0, param0, param0.length, 91);
            var6.d(-var7 + var6.field_h, (byte) -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pq.D(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 44 + 0 + 44 + 17 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
            pq.a(-39);
        }
    }

    final static void a(java.awt.Canvas param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            ki.a(-18520, (java.awt.Component) (Object) param0);
            tia.a(0, (java.awt.Component) (Object) param0);
            if (tja.field_q != null) {
              tja.field_q.b(116, (java.awt.Component) (Object) param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("pq.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 0 + 41);
        }
    }

    final static void b() {
        afa.field_c = qk.h(-57);
        ej.field_a = new jta();
        gl.a(true, true, (byte) 97);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        int discarded$0 = 1;
        field_e = fqa.e();
        field_d = "Solicitation";
    }
}
