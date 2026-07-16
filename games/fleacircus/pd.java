/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends lh {
    ie field_m;
    static dd[] field_k;
    int field_j;
    static String field_i;
    static int field_l;
    lh field_n;

    final static ob a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        ob var5 = null;
        if (param1 == null) {
            return tf.field_G;
        }
        if ((param1.length() ^ -1) == -1) {
            return tf.field_G;
        }
        if (param0 > -69) {
            field_l = -22;
            var2 = param1.indexOf('@');
            if (0 == (var2 ^ -1)) {
                return tf.field_H;
            }
            var3 = param1.substring(0, var2);
            var4 = param1.substring(1 + var2);
            var5 = jk.a(var3, (byte) 113);
            if (var5 != null) {
                return var5;
            }
            return id.a(var4, 31592);
        }
        var2 = param1.indexOf('@');
        if (0 == (var2 ^ -1)) {
            return tf.field_H;
        }
        var3 = param1.substring(0, var2);
        var4 = param1.substring(1 + var2);
        var5 = jk.a(var3, (byte) 113);
        if (var5 != null) {
            return var5;
        }
        return id.a(var4, 31592);
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 != -89) {
            pd.a((byte) 62);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param1) {
            gb.g(0, 0, gb.field_d, gb.field_k, 0, 192);
        } else {
            gb.c();
            gb.c();
            gb.c();
        }
        kb.a(param2, param1);
    }

    final static n a(byte[] param0, boolean param1) {
        n var2 = null;
        if (param0 != null) {
          if (!param1) {
            field_i = null;
            var2 = new n(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, rd.field_d, of.field_d);
            c.o(-28210);
            return var2;
          } else {
            var2 = new n(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, rd.field_d, of.field_d);
            c.o(-28210);
            return var2;
          }
        } else {
          return null;
        }
    }

    pd(ie param0, lh param1) {
        ((pd) this).field_m = param0;
        ((pd) this).field_j = param0.g();
        ((pd) this).field_n = param1;
        ((pd) this).field_m.h(((pd) this).field_j * gf.field_d + 128 >> -149676440);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Level score: <%0>";
    }
}
