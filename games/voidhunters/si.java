/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends rqa {
    static int field_s;
    static int field_p;
    static int field_r;
    static boolean[] field_o;
    static int[] field_q;

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
              si.a(164, 62, param0[0].a(60));
              if (param1 <= -119) {
                break L1;
              } else {
                si.a(100, -78, -48);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("si.A(");
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

    si(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_s = 71;
        }
        field_q = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2) {
        hna var3 = null;
        if (param1 != 62) {
            field_r = 110;
        }
        if (vqa.field_g != null) {
            var3 = new hna();
            var3.field_r = new tw();
            var3.field_r.field_d = new so(param0, param2);
            vqa.field_g.a(param1 ^ 62, true, var3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        ogb.a(105, 50);
        field_o = new boolean[112];
        field_q = new int[128];
        for (var0_int = 0; field_q.length > var0_int; var0_int++) {
            field_q[var0_int] = -1;
        }
        for (var0_int = 65; var0_int <= 90; var0_int++) {
            field_q[var0_int] = var0_int - 65;
        }
        for (var0_int = 97; var0_int <= 122; var0_int++) {
            field_q[var0_int] = 26 + (var0_int - 97);
        }
        for (var0_int = 48; var0_int <= 57; var0_int++) {
            field_q[var0_int] = -48 + (var0_int + 52);
        }
        int[] var0 = field_q;
        field_q[43] = 62;
        var0[42] = 62;
        field_q[47] = 63;
        int[] var1 = field_q;
        var1[45] = 63;
    }
}
