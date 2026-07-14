/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf {
    static cg field_c;
    static String field_a;
    static boolean field_d;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = ZombieDawn.field_J;
        sg.field_jb.field_O[param1] = new int[sg.field_jb.field_O[0].length];
        sg.field_jb.field_O[param1][hm.field_L] = param0;
        if (param4 >= 65) {
          sg.field_jb.field_O[param1][t.field_c] = param2;
          sg.field_jb.field_O[param1][kd.field_nb[0]] = param3;
          var5 = 1;
          L0: while (true) {
            if (kd.field_nb.length <= var5) {
              return;
            } else {
              sg.field_jb.field_O[param1][kd.field_nb[var5]] = qb.a(sg.field_jb.field_O[param1][kd.field_nb[var5 + -1]], (byte) 91);
              var5++;
              continue L0;
            }
          }
        } else {
          var7 = null;
          rf.a((java.awt.Component) null, -32);
          sg.field_jb.field_O[param1][t.field_c] = param2;
          sg.field_jb.field_O[param1][kd.field_nb[0]] = param3;
          var5 = 1;
          L1: while (true) {
            if (kd.field_nb.length <= var5) {
              return;
            } else {
              sg.field_jb.field_O[param1][kd.field_nb[var5]] = qb.a(sg.field_jb.field_O[param1][kd.field_nb[var5 + -1]], (byte) 91);
              var5++;
              continue L1;
            }
          }
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
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) ea.field_c);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) ea.field_c);
        ih.field_F = -1;
        if (param1 > -11) {
            field_c = null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 11021) {
            field_c = null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    abstract void a(int param0, byte[] param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new cg(2, 4, 4, 0);
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_d = false;
        field_b = "To server list";
    }
}
