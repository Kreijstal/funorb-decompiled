/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends ip {
    static md field_q;
    static String field_p;
    static cn field_m;
    static long field_o;
    static cf field_n;
    static u[] field_r;

    final String a(byte param0, String param1) {
        if (param0 < 44) {
            return null;
        }
        if (!(((qm) this).a(param1, 52) != pd.field_J)) {
            return uj.field_a;
        }
        return sh.field_b;
    }

    final static boolean a(int param0, char param1) {
        if (param0 == 57) {
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$6 = qm.a(-9, 'ￅ');
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void d(boolean param0) {
        field_q = null;
        field_m = null;
        if (param0) {
            return;
        }
        field_r = null;
        field_p = null;
        field_n = null;
    }

    final od a(String param0, int param1) {
        int var3 = null == kc.a(param0, true) ? 1 : 0;
        int var4 = -1 % ((param1 - 5) / 44);
        if (!(var3 != 0)) {
            return pd.field_J;
        }
        return c.field_d;
    }

    qm(rm param0) {
        super(param0);
    }

    final static int a(int param0, int param1, boolean param2, String param3, String param4, int param5, String param6) {
        cd var7 = null;
        cd var8 = null;
        if (param5 != 57) {
          field_q = null;
          var7 = new cd(param4);
          var8 = new cd(param6);
          return op.a(var7, param0, param1, var8, param3, param5 ^ -1, param2);
        } else {
          var7 = new cd(param4);
          var8 = new cd(param6);
          return op.a(var7, param0, param1, var8, param3, param5 ^ -1, param2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<col=FF0000>Attack -2</col>";
        field_q = new md();
    }
}
