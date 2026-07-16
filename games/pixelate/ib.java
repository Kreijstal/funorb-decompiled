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
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param0.getCodeBase();
                var3 = lg.a(param1, param0, var4).getFile();
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
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        mh.a(pi.field_Rb, (byte) 95);
        if (param0 != 20558) {
            ib.a(-8);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_h = null;
        field_i = null;
        if (param0 != 2) {
            field_i = null;
        }
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
