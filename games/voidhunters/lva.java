/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lva extends rqa {
    static float[] field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                field_p = -18;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(102, 96));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("lva.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void b() {
        al.field_a = kda.field_g + " <b>" + amb.field_b + "</b> " + vda.field_p + " <b>" + fja.field_r + "</b> " + inb.field_p + "<br>" + "<br>" + msa.field_r;
    }

    final static int b(int param0, int param1) {
        int var3 = param1 + -1 & param0 >> 31;
        int var4 = 1;
        return var3 + (param0 - -(param0 >>> 31)) % param1;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 617169759) {
            lva.a(-84);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = -8;
        dmb.field_c = param2;
        wua.field_k = param0;
    }

    final static void e() {
        qn.field_h.g((byte) -17);
        qn.field_h.a(false, (shb) (Object) new hnb(qn.field_h));
    }

    lva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new float[4];
    }
}
