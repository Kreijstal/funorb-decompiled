/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends gn {
    static se field_l;
    static String field_g;
    int field_p;
    int field_m;
    int field_f;
    int field_k;
    int field_j;
    String[][] field_i;
    static int[] field_n;
    int[][] field_o;
    int field_h;
    boolean field_e;

    public static void a(byte param0) {
        field_g = null;
        field_l = null;
        field_n = null;
        if (param0 < 41) {
            field_n = null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ut[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut[] var9 = null;
        ut[] var14 = null;
        ut var15 = null;
        ut var18 = null;
        ut[] var19 = null;
        ut var20 = null;
        ut var21 = null;
        var8 = Kickabout.field_G;
        if (param2 > 33) {
          var19 = iw.field_h;
          var9 = var19;
          var3 = var9;
          if (-1 != (rm.field_C ^ -1)) {
            if ((rm.field_C ^ -1) == -2) {
              var4 = 0;
              L0: while (true) {
                if ((var4 ^ -1) > -16) {
                  var21 = var9[p.a((byte) -24, var19.length)];
                  var6 = p.a((byte) -24, 896 + -(var21.field_o >> -124023839));
                  var7 = p.a((byte) -24, 1344 - (var21.field_v >> 743273921));
                  var21.c(var6 + param1, var7 + param0);
                  var4++;
                  continue L0;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            var4 = 0;
            L1: while (true) {
              if (-31 < (var4 ^ -1)) {
                var20 = var9[p.a((byte) -24, var19.length)];
                var6 = p.a((byte) -24, 896 - (var20.field_o >> 301229921));
                var7 = p.a((byte) -24, 1344 + -(var20.field_v >> 1310203777));
                var20.c(var6 + param1, param0 + var7);
                var4++;
                continue L1;
              } else {
                return;
              }
            }
          }
        } else {
          field_l = null;
          var14 = iw.field_h;
          var9 = var14;
          var3 = var9;
          if (-1 != (rm.field_C ^ -1)) {
            if ((rm.field_C ^ -1) == -2) {
              var4 = 0;
              L2: while (true) {
                if ((var4 ^ -1) > -16) {
                  var18 = var9[p.a((byte) -24, var14.length)];
                  var6 = p.a((byte) -24, 896 + -(var18.field_o >> -124023839));
                  var7 = p.a((byte) -24, 1344 - (var18.field_v >> 743273921));
                  var18.c(var6 + param1, var7 + param0);
                  var4++;
                  continue L2;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            var4 = 0;
            L3: while (true) {
              if (-31 < (var4 ^ -1)) {
                var15 = var9[p.a((byte) -24, var14.length)];
                var6 = p.a((byte) -24, 896 - (var15.field_o >> 301229921));
                var7 = p.a((byte) -24, 1344 + -(var15.field_v >> 1310203777));
                var15.c(var6 + param1, param0 + var7);
                var4++;
                continue L3;
              } else {
                return;
              }
            }
          }
        }
    }

    final static ki a(int param0, up[] param1, gr param2, int param3, int param4) {
        ki var5 = new ki(5, param4, param3, (byte) 0, (byte) 0);
        var5.field_s = param1;
        if (param0 != 18238) {
            return null;
        }
        var5.field_t = param2;
        return var5;
    }

    wd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "gameplay";
    }
}
