/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends br {
    static String field_f;
    static int field_j;
    int field_h;
    static String field_i;
    int field_g;

    final static ae a(ga param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param0.d((byte) 69);
        var3 = param0.g(param1 ^ -31477);
        var4 = new int[var3];
        var5 = 0;
        L0: while (true) {
          if (var3 <= var5) {
            if (param1 != -114) {
              qk.b(true);
              return (ae) (Object) new fg(var2, var4);
            } else {
              return (ae) (Object) new fg(var2, var4);
            }
          } else {
            var4[var5] = param0.d((byte) 69);
            var5++;
            continue L0;
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var2 = bd.field_g;
        var3 = bo.field_d;
        var4 = vo.field_m.field_yb.b(param0, 500);
        var5 = vo.field_m.field_yb.c(param0, 500) + 6;
        var6 = 2 + var4 * jk.field_f;
        var7 = qp.a(var2, (byte) 126, var5, 12);
        var8 = br.a(true, var3, 20, var6);
        oo.a(var7, var8, var5, var6, 0);
        oo.e(var7 + 1, var8 - -1, -2 + var5, var6 + -2, 16777088);
        if (param1 > -109) {
          field_j = 23;
          int discarded$2 = vo.field_m.field_yb.a(param0, var7 + 3, -vo.field_m.field_yb.field_C + 1 + (var8 + jp.field_f), 500, 1000, 0, -1, 0, 0, jk.field_f);
          return;
        } else {
          int discarded$3 = vo.field_m.field_yb.a(param0, var7 + 3, -vo.field_m.field_yb.field_C + 1 + (var8 + jp.field_f), 500, 1000, 0, -1, 0, 0, jk.field_f);
          return;
        }
    }

    final qk a(int param0) {
        if (param0 != 30544) {
            return null;
        }
        return new qk(((qk) this).field_g, ((qk) this).field_h);
    }

    qk(int param0, int param1) {
        ((qk) this).field_h = param1;
        ((qk) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Start Game";
        field_i = "<%0> has dropped out.";
    }
}
