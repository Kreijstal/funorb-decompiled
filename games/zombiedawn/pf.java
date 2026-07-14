/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static vn field_f;
    static volatile int field_c;
    private int field_a;
    private nb[] field_i;
    static int field_g;
    private nb field_d;
    private long field_e;
    static ug field_b;
    static char[] field_h;

    final nb a(int param0, long param1) {
        nb var4 = null;
        nb var5 = null;
        int var6 = 0;
        nb var7 = null;
        nb var8 = null;
        var6 = ZombieDawn.field_J;
        ((pf) this).field_e = param1;
        if (param0 == 93) {
          var7 = ((pf) this).field_i[(int)((long)(((pf) this).field_a + -1) & param1)];
          var4 = var7;
          ((pf) this).field_d = var7.field_i;
          L0: while (true) {
            if (var4 == ((pf) this).field_d) {
              ((pf) this).field_d = null;
              return null;
            } else {
              if (((pf) this).field_d.field_n != param1) {
                ((pf) this).field_d = ((pf) this).field_d.field_i;
                continue L0;
              } else {
                var5 = ((pf) this).field_d;
                ((pf) this).field_d = ((pf) this).field_d.field_i;
                return var5;
              }
            }
          }
        } else {
          pf.a((byte) -112);
          var8 = ((pf) this).field_i[(int)((long)(((pf) this).field_a + -1) & param1)];
          var4 = var8;
          ((pf) this).field_d = var8.field_i;
          L1: while (true) {
            if (var4 == ((pf) this).field_d) {
              ((pf) this).field_d = null;
              return null;
            } else {
              if (((pf) this).field_d.field_n != param1) {
                ((pf) this).field_d = ((pf) this).field_d.field_i;
                continue L1;
              } else {
                var5 = ((pf) this).field_d;
                ((pf) this).field_d = ((pf) this).field_d.field_i;
                return var5;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        if (param0 != 88) {
            field_g = 58;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final nb b(byte param0) {
        nb var3 = null;
        int var4 = ZombieDawn.field_J;
        if (null == ((pf) this).field_d) {
            return null;
        }
        nb var2 = ((pf) this).field_i[(int)((long)(-1 + ((pf) this).field_a) & ((pf) this).field_e)];
        while (((pf) this).field_d != var2) {
            if (((pf) this).field_d.field_n == ((pf) this).field_e) {
                var3 = ((pf) this).field_d;
                ((pf) this).field_d = ((pf) this).field_d.field_i;
                return var3;
            }
            ((pf) this).field_d = ((pf) this).field_d.field_i;
        }
        if (param0 >= -96) {
            ((pf) this).field_a = 125;
            ((pf) this).field_d = null;
            return null;
        }
        ((pf) this).field_d = null;
        return null;
    }

    final void a(int param0, long param1, nb param2) {
        if (!(null == param2.field_h)) {
            param2.c((byte) -53);
        }
        nb var5 = ((pf) this).field_i[(int)((long)(((pf) this).field_a - param0) & param1)];
        param2.field_h = var5.field_h;
        param2.field_i = var5;
        param2.field_h.field_i = param2;
        param2.field_n = param1;
        param2.field_i.field_h = param2;
    }

    pf(int param0) {
        int var2 = 0;
        nb var3 = null;
        ((pf) this).field_i = new nb[param0];
        ((pf) this).field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new nb();
            ((pf) this).field_i[var2] = new nb();
            var3.field_i = var3;
            var3.field_h = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_h = new char[]{(char)91, (char)93, (char)35};
    }
}
