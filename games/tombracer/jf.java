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
        iu discarded$5 = null;
        iu var3 = null;
        int var4 = 0;
        int var5 = 0;
        iu stackIn_6_0 = null;
        iu stackIn_8_0 = null;
        iu stackIn_13_0 = null;
        iu stackIn_14_0 = null;
        iu stackOut_12_0 = null;
        iu stackOut_5_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = new iu(param2, param2);
        if (param1 > 36) {
          var4 = 0;
          L0: while (true) {
            if (var3.field_r.length > var4) {
              stackOut_12_0 = (iu) (var3);
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var5 == 0) {
                stackIn_14_0.field_r[var4] = param0;
                var4++;
                continue L0;
              } else {
                return stackIn_13_0;
              }
            } else {
              return var3;
            }
          }
        } else {
          discarded$5 = jf.a(44, 69, 69);
          var4 = 0;
          L1: while (true) {
            if (var3.field_r.length > var4) {
              stackOut_5_0 = (iu) (var3);
              stackIn_8_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 != 0) {
                return stackIn_8_0;
              } else {
                stackIn_6_0.field_r[var4] = param0;
                var4++;
                continue L1;
              }
            } else {
              return var3;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 2) {
            return;
        }
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
                field_p = (dk[]) null;
                break L1;
              }
            }
            stackOut_2_0 = new bfa(sra.a((String) (param0[0].field_d), 85));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("jf.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_o = "You are invited to <%0>'s game.";
        field_s = "Accept draw";
        field_t = new byte[]{(byte)4, (byte)2};
    }
}
