/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lw extends pt {
    static wk field_ob;
    static String field_nb;
    static String field_lb;
    static int field_mb;
    static String field_pb;
    static String field_kb;

    final static void a(byte param0, mq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              as.field_E.a((je) (Object) param1, 80);
              if (param0 == 79) {
                break L1;
              } else {
                field_nb = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lw.K(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    lw(gk param0, kb param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void a(kb param0, byte param1) {
        try {
            int var3_int = -61 % ((-27 - param1) / 44);
            super.a(param0, (byte) 87);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "lw.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void j() {
        field_ob = null;
        field_kb = null;
        field_pb = null;
        field_nb = null;
        field_lb = null;
    }

    final static nv n(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          lw.a((byte) -16, (mq) null);
          return new nv(0, 0, t.field_c.field_a, 0, (kh) null, t.field_c.field_k, t.field_c.field_p, t.field_c.field_a, t.field_c.field_a, t.field_c.field_b, t.field_c.field_n, false, true, 32768, 0);
        } else {
          return new nv(0, 0, t.field_c.field_a, 0, (kh) null, t.field_c.field_k, t.field_c.field_p, t.field_c.field_a, t.field_c.field_a, t.field_c.field_b, t.field_c.field_n, false, true, 32768, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "Highscores";
        field_nb = "You have <%0> unread messages!";
        field_pb = "Show chat";
        field_kb = "Enter name of player to delete from list";
    }
}
