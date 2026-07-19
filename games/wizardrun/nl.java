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
            this.a(-50, 83, -33, -127, -16);
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
        int var6 = this.field_x << 1733688995;
        int var7 = this.field_s << -1303620765;
        param2 = (var6 & 15) + (param2 << 1625608196);
        param1 = (15 & var7) + (param1 << 2049057380);
        int var8 = -23 % ((param3 - -55) / 40);
        this.a(var6, var7, param2, param1, param0, param4);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                if (param1) {
                  break L0;
                } else {
                  nl.d(-100);
                  break L0;
                }
              }
              try {
                L1: {
                  var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                  param0.getAppletContext().showDocument(jl.a(-86, var2, param0), "_top");
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("nl.GB(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
        field_y = 0;
        field_t = new String[]{"Master Wizard", "Hat of Wizardry", "Cloak of Wizardry", "Gown of Wizardry", "Star of the Master", "Spider's Bane", "Pygmy Catcher", "Ghost Hunter", "Troll Basher", "Dragon Tamer", "Master of Magic", "Pumpkin Collector"};
        field_A = new int[8192];
        field_q = new je[38];
    }
}
