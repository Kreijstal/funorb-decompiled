/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends cb {
    static ea field_l;
    static ea[] field_k;
    static int field_j;
    static String field_i;

    public static void f(int param0) {
        if (param0 != -27836) {
            boolean discarded$0 = wj.g(-60);
        }
        field_k = null;
        field_l = null;
        field_i = null;
    }

    final static boolean a(char param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param1 < 1) {
            field_j = 99;
        }
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (!(!fg.a(-1975005818, param0))) {
            return true;
        }
        char[] var6 = mf.field_f;
        char[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (param0 == var4) {
                return true;
            }
        }
        var2 = ml.field_c;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (!(var4 != param0)) {
                return true;
            }
        }
        return false;
    }

    final static boolean g(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        var1 = 17 / ((param0 - 60) / 57);
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -36) {
            return true;
          } else {
            if (th.field_b[var2][cm.field_o]) {
              if (!d.a(var2, cm.field_o, (byte) 68)) {
                return false;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final String a(byte param0, String param1) {
        int var3 = 10 % ((49 - param0) / 56);
        if (((wj) this).a(param1, 5) != fg.field_d) {
            return null;
        }
        return vd.field_r;
    }

    final ag a(String param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        L0: {
          if (param1 == 5) {
            break L0;
          } else {
            var4 = null;
            String discarded$2 = ((wj) this).a((byte) 97, (String) null);
            break L0;
          }
        }
        var5 = (CharSequence) (Object) param0;
        if (!oi.a(-19804, var5)) {
          return fg.field_d;
        } else {
          L1: {
            var6 = (CharSequence) (Object) param0;
            var3 = md.a(var6, true);
            if (-1 <= (var3 ^ -1)) {
              break L1;
            } else {
              if ((var3 ^ -1) < -131) {
                break L1;
              } else {
                return sc.field_a;
              }
            }
          }
          return fg.field_d;
        }
    }

    wj(ui param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ea[4];
        field_i = "Suggested names: ";
    }
}
