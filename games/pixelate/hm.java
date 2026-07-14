/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_a;
    static String[] field_f;
    static String field_c;
    static String field_e;
    static String field_d;
    static int field_b;

    final static og a(int param0, byte[] param1, int param2) {
        og var3 = new og(param1);
        wk.field_g.a(22125, (fa) (Object) var3);
        dq.a(param2, -18989, var3);
        int var4 = 55 / ((param0 - 68) / 46);
        return var3;
    }

    final static el a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        el var5 = null;
        if (param1 != null) {
          if (0 != param1.length()) {
            var2 = param1.indexOf('@');
            if (0 != (var2 ^ -1)) {
              var3 = param1.substring(param0, var2);
              var4 = param1.substring(var2 - -1);
              var5 = wf.a(false, var3);
              if (var5 != null) {
                return var5;
              } else {
                return jf.a(var4, param0 ^ -4384);
              }
            } else {
              return pd.field_Kb;
            }
          } else {
            return ge.field_i;
          }
        } else {
          return ge.field_i;
        }
    }

    public static void b(byte param0) {
        if (param0 != 9) {
            return;
        }
        field_a = null;
        field_c = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void a(byte param0) {
        oo.field_f = -1;
        qg.field_b = null;
        re.field_h = false;
        no.field_h = 0;
        tm.field_V = -1;
        int var1 = -61 / ((17 - param0) / 55);
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 == 64) {
          var1 = System.currentTimeMillis();
          if (var1 < wa.field_h) {
            qj.field_d = qj.field_d + (wa.field_h + -var1);
            wa.field_h = var1;
            return var1 - -qj.field_d;
          } else {
            wa.field_h = var1;
            return var1 - -qj.field_d;
          }
        } else {
          return 86L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"The aim of the game is construct the picture on the left.", "Use the <col=ffff00>arrow keys</col> to move.<br>Hit '<col=ffff00>CTRL</col>' to rotate.", "Press '<col=ffff00>ENTER</col>' to skip the tutorial."};
        field_e = "Creating your account";
        field_c = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_d = "Create";
    }
}
