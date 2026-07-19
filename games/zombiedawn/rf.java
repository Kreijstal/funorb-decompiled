/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf {
    static cg field_c;
    static String field_a;
    static boolean field_d;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int[] array$2 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        java.awt.Component var7 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              array$2 = new int[sg.field_jb.field_O[0].length];
              sg.field_jb.field_O[param1] = array$2;
              sg.field_jb.field_O[param1][hm.field_L] = param0;
              if (param4 >= 65) {
                break L1;
              } else {
                var7 = (java.awt.Component) null;
                rf.a((java.awt.Component) null, -32);
                break L1;
              }
            }
            sg.field_jb.field_O[param1][t.field_c] = param2;
            sg.field_jb.field_O[param1][kd.field_nb[0]] = param3;
            var5_int = 1;
            L2: while (true) {
              if (kd.field_nb.length <= var5_int) {
                break L0;
              } else {
                sg.field_jb.field_O[param1][kd.field_nb[var5_int]] = qb.a(sg.field_jb.field_O[param1][kd.field_nb[var5_int + -1]], (byte) 91);
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "rf.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            return -124;
        }
        return -wh.field_c + rg.field_E;
    }

    abstract byte[] a(byte param0);

    final static void a(java.awt.Component param0, int param1) {
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
              param0.removeKeyListener(ea.field_c);
              param0.removeFocusListener(ea.field_c);
              ih.field_F = -1;
              if (param1 <= -11) {
                break L1;
              } else {
                field_c = (cg) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rf.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 11021) {
            field_c = (cg) null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    abstract void a(int param0, byte[] param1);

    static {
        field_c = new cg(2, 4, 4, 0);
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_d = false;
        field_b = "To server list";
    }
}
