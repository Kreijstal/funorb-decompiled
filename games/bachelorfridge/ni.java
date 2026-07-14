/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends pv {
    static ss field_l;
    static String field_k;
    static kv field_j;

    ni(jfa param0) {
        ((ni) this).field_f = param0;
    }

    final static ai[] a(byte param0, pf param1) {
        int var2 = 0;
        int var3 = 0;
        ai[] var4 = null;
        int var5 = 0;
        ai var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var2 = param1.d(8, (byte) -65);
        if (-1 <= (var2 ^ -1)) {
          var3 = param1.d(12, (byte) 45);
          if (param0 == 41) {
            var4 = new ai[var3];
            var5 = 0;
            L0: while (true) {
              if (var5 >= var3) {
                return var4;
              } else {
                if (!fa.a((byte) -75, param1)) {
                  var6 = param1.d(nia.a(-1 + var5, false), (byte) 64);
                  var4[var5] = var4[var6];
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new ai();
                  int discarded$156 = param1.d(24, (byte) -105);
                  int discarded$157 = param1.d(24, (byte) 50);
                  var6_ref.field_b = param1.d(24, (byte) -123);
                  int discarded$158 = param1.d(9, (byte) 69);
                  int discarded$159 = param1.d(12, (byte) -64);
                  int discarded$160 = param1.d(12, (byte) 58);
                  int discarded$161 = param1.d(12, (byte) -116);
                  var4[var5] = var6_ref;
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final int c(boolean param0) {
        if (!param0) {
            boolean discarded$0 = ((ni) this).b(true);
        }
        return 50;
    }

    final boolean b(boolean param0) {
        ((ni) this).field_g = ((ni) this).field_g + 1;
        if (!(((ni) this).field_g + 1 <= this.c(param0))) {
            ((ni) this).field_f.field_p = 2048;
            ((ni) this).field_f.field_k = ((ni) this).field_f.b(true);
            return true;
        }
        if (!(((ni) this).field_g != 1)) {
            ((ni) this).field_f.field_v.a((byte) 66, ((ni) this).field_f.field_g.field_o.field_b, 0);
        }
        if (-41 >= (((ni) this).field_g ^ -1)) {
        }
        return false;
    }

    public static void b(int param0) {
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0 >= -48) {
            ni.b(113);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "to over <%0> great games";
    }
}
