/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends im {
    static eg field_q;
    static boolean field_p;
    static String field_l;
    static int[][] field_n;
    static int field_m;
    static String field_j;
    static String field_k;
    static String field_o;

    final static m a() {
        return pc.field_e;
    }

    ld(long param0, String param1) {
        super(param0, param1);
    }

    final static pb a(int param0, boolean param1) {
        pb var2 = null;
        var2 = new pb();
        hn.field_q.b((pg) (Object) var2, -1);
        ik.a(param0, 0);
        if (param1) {
          pb discarded$2 = ld.a(15, true);
          return var2;
        } else {
          return var2;
        }
    }

    final ch a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return fe.field_n;
    }

    final static void c(byte param0) {
        tc.field_A = null;
    }

    public static void b() {
        field_o = null;
        field_n = null;
        field_j = null;
        field_k = null;
        field_l = null;
        field_q = null;
        int var1 = -71;
    }

    final static void a(cm param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          cc.field_e.b((pg) (Object) param0, -1);
          hb.a(param0, 4, (byte) 92);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ld.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 118 + ',' + 4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Not yet achieved";
        field_j = "Reading Book of Storm";
        field_n = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_k = "Arcane spells focus on useful utilities and basic summoning abilities.";
    }
}
