/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov {
    static String field_d;
    static int field_e;
    static rn field_h;
    static String field_f;
    static je field_i;
    static String field_c;
    static sa field_g;
    static nr field_m;
    static String field_l;
    static int field_b;
    static String field_k;
    static String field_a;
    static String field_j;

    public static void a(byte param0) {
        field_j = null;
        field_h = null;
        int var1 = 16 % ((param0 - -4) / 43);
        field_m = null;
        field_d = null;
        field_a = null;
        field_i = null;
        field_f = null;
        field_c = null;
        field_g = null;
        field_l = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2) {
        bv var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(param1 + -2, param1);
        var3.b(1, 10);
        var3.b(true, param2);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 11982) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(ck.a(-3780, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Purse";
        field_c = "Catalysts";
        field_d = "Options";
        field_h = new rn();
        field_l = "From <%0>: ";
        field_k = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_a = "Barbarian Chieftain";
        field_j = "Please try changing the following settings:  ";
    }
}
