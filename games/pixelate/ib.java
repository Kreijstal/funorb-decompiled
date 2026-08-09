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
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              try {
                L0: {
                  var4 = param0.getCodeBase();
                  var3 = lg.a(param1, param0, var4).getFile();
                  cq.a(param0, (byte) -62, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
                  cq.a(param0, (byte) -115, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
                  cq.a(param0, (byte) 108, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
                  cq.a(param0, (byte) -44, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
                  cq.a(param0, (byte) 78, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
                  cq.a(param0, (byte) 66, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
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
                stackIn_6_0 = (RuntimeException) (var2_ref);

                stackIn_6_1 = new StringBuilder().append("ib.C(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
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
            field_i = (int[]) null;
        }
    }

    ib(int param0, int param1) {
        this.field_d = param1;
        this.field_j = param0;
    }

    static {
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_e = 2;
        field_i = new int[5];
    }
}
