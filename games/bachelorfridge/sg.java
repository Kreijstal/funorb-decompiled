/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends td {
    static eq field_p;
    static int[] field_q;
    static boolean field_r;

    final ii a(op param0, int param1) {
        ps var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        Object var9 = null;
        aga var10 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          var10 = ((sg) this).field_h.a(91, param0);
          var4 = new ps(((sg) this).field_g, new nq(var10));
          var5 = 0;
          if (param1 == 3) {
            break L0;
          } else {
            var9 = null;
            ii discarded$1 = ((sg) this).a((op) null, -50);
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= param0.field_d) {
            return (ii) (Object) var4;
          } else {
            var6 = 0;
            L2: while (true) {
              if (7 <= var6) {
                var5++;
                continue L1;
              } else {
                if (null != param0.field_S[var5].field_b[var6]) {
                  var7 = param0.field_S[var5].field_b[var6];
                  if (var7.field_A) {
                    if (var7.i(68)) {
                      if (param0.field_a[var7.field_x][var7.field_J].field_l == null) {
                        var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, -10, 35), true);
                        var4.field_o.a((bw) (Object) new cn(new nq(var7), var7.field_x, var7.field_J), true);
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    sg(int param0, aga param1) {
        super(param0, param1);
    }

    public static void c(byte param0) {
        int var1 = 46 % ((param0 - -42) / 51);
        field_q = null;
        field_p = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 1816304479) {
            field_r = false;
        }
        int var3 = param2 >> 1816304479 & -1 + param0;
        return var3 + ((param2 >>> -885124769) + param2) % param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = vv.a((byte) 121);
    }
}
