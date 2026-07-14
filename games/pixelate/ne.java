/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ie {
    static tn field_I;

    private ne(int param0, int param1, int param2, int param3, eb param4, fn param5, ng param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((ne) this).field_H = param6;
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        bn var8 = qf.field_a;
        bn var7 = var8;
        if (var8 != null) {
            if (!((ne) this).a(param3 ^ 96, param1, param4, param0, param5)) {
            } else {
                if (!(((ne) this).field_n instanceof s)) {
                    // ifeq L127
                    ((s) (Object) var8.field_n).a(param3 ^ -106, var8, (ne) this);
                    qf.field_a = null;
                } else {
                    ((s) (Object) ((ne) this).field_n).a(116, var8, (ne) this);
                    qf.field_a = null;
                }
            }
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -1328614847;
        param1 = param1 | param1 >>> 399449186;
        if (param0 != -1879863704) {
            field_I = null;
        }
        param1 = param1 | param1 >>> 538739364;
        param1 = param1 | param1 >>> -1879863704;
        param1 = param1 | param1 >>> 576781968;
        return param1 + 1;
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var3 = lg.a(11, param1, param2);
        if (param0 >= 56) {
          if (var3 == null) {
            var4 = 0;
            L0: while (true) {
              if (var4 < param2.length()) {
                if (!oh.a(param2.charAt(var4), -112)) {
                  return nj.field_g;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = null;
    }
}
