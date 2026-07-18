/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    int field_j;
    static String[] field_c;
    static int field_e;
    static int field_a;
    static mm field_h;
    static int[] field_i;
    static boolean field_b;
    int field_d;
    static mk field_f;
    static int field_g;

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var4 = param0.getCodeBase();
                  var3 = lg.a(false, param0, var4).getFile();
                  Object discarded$6 = cq.a(param0, (byte) -62, new Object[2], "updatelinks");
                  Object discarded$7 = cq.a(param0, (byte) -115, new Object[2], "updatelinks");
                  Object discarded$8 = cq.a(param0, (byte) 108, new Object[2], "updatelinks");
                  Object discarded$9 = cq.a(param0, (byte) -44, new Object[2], "updatelinks");
                  Object discarded$10 = cq.a(param0, (byte) 78, new Object[2], "updatelinks");
                  Object discarded$11 = cq.a(param0, (byte) 66, new Object[2], "updatelinks");
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("ib.C(");
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
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + false + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        mh.a(pi.field_Rb, (byte) 95);
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_h = null;
        field_i = null;
    }

    ib(int param0, int param1) {
        ((ib) this).field_d = param1;
        ((ib) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_e = 2;
        field_i = new int[5];
    }
}
