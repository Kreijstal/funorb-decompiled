/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ela {
    static String field_o;
    static dk[] field_p;
    static String field_s;
    static int field_q;
    static byte[] field_t;
    static boolean field_r;

    jf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static iu a(int param0, int param1, int param2) {
        iu var3 = null;
        int var4 = 0;
        int var5 = 0;
        iu var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = new iu(param2, param2);
        var3 = var6;
        if (param1 <= 36) {
          iu discarded$2 = jf.a(44, 69, 69);
          var4 = 0;
          L0: while (true) {
            if (var3.field_r.length <= var4) {
              return var3;
            } else {
              var6.field_r[var4] = param0;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (var3.field_r.length <= var4) {
              return var3;
            } else {
              var6.field_r[var4] = param0;
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a() {
        field_t = null;
        field_p = null;
        field_o = null;
        field_s = null;
    }

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bfa stackOut_2_0 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            int discarded$2 = 85;
            stackOut_2_0 = new bfa((Object) (Object) sra.a((String) param0[0].field_d));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jf.A(");
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You are invited to <%0>'s game.";
        field_s = "Accept draw";
        field_t = new byte[]{(byte) 4, (byte) 2};
    }
}
