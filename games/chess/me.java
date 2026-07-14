/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static km field_d;
    static kd field_a;
    static jc field_e;
    static hg field_b;
    static rk[] field_c;

    final static void a(String param0, int param1, fj param2, lh param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Chess.field_G;
        var5 = 0;
        var6 = -1;
        if (param4 == 79) {
          var7 = 1;
          L0: while (true) {
            if (var7 >= param0.length()) {
              return;
            } else {
              L1: {
                var8 = param0.charAt(var7);
                if (var8 != 60) {
                  break L1;
                } else {
                  var6 = (var5 >> -1414377432) + param2.field_i[0] - -param3.b(param0.substring(0, var7));
                  break L1;
                }
              }
              L2: {
                if (-1 == var6) {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param1;
                      break L3;
                    }
                  }
                  param2.field_i[var7] = param2.field_i[0] + (var5 >> 76903592) + param3.b(param0.substring(0, 1 + var7)) + -param3.a((char) var8);
                  break L2;
                } else {
                  param2.field_i[var7] = var6;
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        if (param0 != 18854) {
            Object var2 = null;
            me.a((String) null, 27, (fj) null, (lh) null, (byte) 90);
        }
    }

    final static int a(int param0, int param1) {
        param0 = ((param0 & -1431655765) >>> -325083679) + (param0 & 1431655765);
        param0 = (858993459 & param0) - -(1932735283 & param0 >>> 1145352674);
        int var2 = 14 % ((-35 - param1) / 32);
        param0 = 252645135 & param0 + (param0 >>> 1015902052);
        param0 = param0 + (param0 >>> -611710968);
        param0 = param0 + (param0 >>> 2102781392);
        return param0 & 255;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new hg(9, 0, 4, 1);
    }
}
