/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends hl {
    hl field_Wb;
    static ei field_Qb;
    static int field_Ob;
    String field_Ub;
    static String field_Pb;
    hl field_Tb;
    hl field_Kb;
    String field_Vb;
    String field_Lb;
    static int field_Nb;
    static int field_Sb;
    int field_Rb;
    String field_Mb;

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
              if (param1 <= -36) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = ud.a((byte[]) null, -110);
                break L1;
              }
            }
            stackOut_2_0 = cl.a(-1095, param0.length, param0, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ud.C(");
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
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    ud() {
        super(0L, (hl) null);
    }

    public static void h(int param0) {
        field_Qb = null;
        field_Pb = null;
    }

    final static boolean c(boolean param0) {
        return ai.a((byte) 105);
    }

    final static void d(byte param0) {
        om.a(true, false, ek.field_s, pl.field_e);
        int var1 = -70 / ((-60 - param0) / 40);
        sn.field_b = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = 0;
        field_Pb = "Concluded";
    }
}
