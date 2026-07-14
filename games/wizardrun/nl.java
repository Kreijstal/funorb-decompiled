/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl extends rk {
    static int field_r;
    int field_v;
    static String[] field_w;
    int field_x;
    int field_p;
    int field_z;
    static int[] field_A;
    static int field_y;
    int field_u;
    int field_s;
    static String[] field_t;
    static je[] field_q;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.a(param4 << -1465779192, param1, param0, (byte) -103, param3 << 2048026309);
        if (param2 >= -84) {
            ((nl) this).a(-50, 83, -33, -127, -16);
        }
    }

    public static void d(int param0) {
        field_t = null;
        field_w = null;
        if (param0 <= 84) {
            return;
        }
        field_A = null;
        field_q = null;
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = ((nl) this).field_x << 1733688995;
        int var7 = ((nl) this).field_s << -1303620765;
        param2 = (var6 & 15) + (param2 << 1625608196);
        param1 = (15 & var7) + (param1 << 2049057380);
        int var8 = -23 % ((param3 - -55) / 40);
        ((nl) this).a(var6, var7, param2, param1, param0, param4);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            if (!param1) {
                nl.d(-100);
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                param0.getAppletContext().showDocument(jl.a(-86, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    nl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = 0;
        field_t = new String[]{"Master Wizard", "Hat of Wizardry", "Cloak of Wizardry", "Gown of Wizardry", "Star of the Master", "Spider's Bane", "Pygmy Catcher", "Ghost Hunter", "Troll Basher", "Dragon Tamer", "Master of Magic", "Pumpkin Collector"};
        field_A = new int[8192];
        field_q = new je[38];
    }
}
