/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw extends td {
    static kv field_p;

    final ii a(op param0, int param1) {
        mna var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        aga var9 = null;
        int var10 = 0;
        aga var11 = null;
        var10 = BachelorFridge.field_y;
        var11 = ((sw) this).field_h.a(68, param0);
        var4 = new mna(((sw) this).field_g, new nq(var11));
        var4.field_q = ((sw) this).field_i;
        int[][] discarded$2 = var4.a(((sw) this).field_i, (byte) 106, var11, param0);
        var5 = var11.field_x;
        if (param1 == 3) {
          L0: {
            var6 = var11.field_J;
            var7 = var5;
            var8 = var6;
            if ((((sw) this).field_i ^ -1) == -3) {
              var7--;
              break L0;
            } else {
              if (4 == ((sw) this).field_i) {
                var7++;
                break L0;
              } else {
                if (1 != ((sw) this).field_i) {
                  if (3 == ((sw) this).field_i) {
                    var8++;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  var8--;
                  break L0;
                }
              }
            }
          }
          L1: {
            var9 = param0.field_a[var7][var8].field_l;
            if (var9 == null) {
              break L1;
            } else {
              if (!var9.i(107)) {
                var4.field_o.a((bw) (Object) new iv(new nq(var9), false, 1, 0, 29), true);
                break L1;
              } else {
                break L1;
              }
            }
          }
          return (ii) (Object) var4;
        } else {
          return null;
        }
    }

    sw(int param0, aga param1, int param2) {
        super(param0, param1);
        ((sw) this).field_i = param2;
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (param1 != 4) {
            field_p = null;
        }
        int var4 = param0.length();
        param0.setLength(param2);
        for (var5 = var4; var5 < param2; var5++) {
            param0.setCharAt(var5, param3);
        }
        return param0;
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_p = null;
        }
        field_p = null;
    }

    static {
    }
}
