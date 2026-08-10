/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf {
    static cg field_c;
    static String field_a;
    static boolean field_d;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int[] array$1 = null;
        int var5_int = 0;
        int var6 = 0;
        java.awt.Component var7 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              array$1 = new int[sg.field_jb.field_O[0].length];
              sg.field_jb.field_O[param1] = array$1;
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
        try {
            param0.removeKeyListener(ea.field_c);
            param0.removeFocusListener(ea.field_c);
            ih.field_F = -1;
            if (param1 > -11) {
                field_c = (cg) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "rf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
