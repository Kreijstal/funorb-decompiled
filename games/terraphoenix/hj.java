/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends jc {
    static String field_A;
    static String field_H;
    static int[] field_J;
    static long field_I;
    static int[] field_K;

    private hj(int param0, int param1, int param2, int param3, cj param4, sc param5, gl param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((hj) this).field_F = param6;
    }

    final static int a(boolean param0, int param1) {
        param1 = (-715827883 & param1 >>> -369887039) + (1431655765 & param1);
        param1 = (858993459 & param1) + (1932735283 & param1 >>> -390770142);
        param1 = 252645135 & (param1 >>> 458938756) + param1;
        if (!param0) {
          hj.g(-63);
          param1 = param1 + (param1 >>> -1298316344);
          param1 = param1 + (param1 >>> -368520592);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> -1298316344);
          param1 = param1 + (param1 >>> -368520592);
          return param1 & 255;
        }
    }

    final static void g(int param0) {
        if (param0 != -7958) {
            field_A = null;
        }
    }

    public static void g(byte param0) {
        field_J = null;
        field_H = null;
        if (param0 >= -102) {
          field_K = null;
          field_K = null;
          field_A = null;
          return;
        } else {
          field_K = null;
          field_A = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        cb var7 = null;
        super.a(59, param1, param2, param3, param4, param5);
        var7 = oj.field_w;
        if (param0 > 36) {
          if (var7 != null) {
            if (((hj) this).a(param3, param2, false, param4, param1)) {
              if (!(((hj) this).field_r instanceof fe)) {
                if (!(var7.field_r instanceof fe)) {
                  return;
                } else {
                  ((fe) (Object) var7.field_r).a((hj) this, var7, 118);
                  oj.field_w = null;
                  return;
                }
              } else {
                ((fe) (Object) ((hj) this).field_r).a((hj) this, var7, 121);
                oj.field_w = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Not enough time";
        field_J = new int[8192];
        field_H = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
