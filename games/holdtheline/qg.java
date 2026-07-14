/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int[] field_d;
    static float[] field_c;
    static String field_a;
    static String[] field_b;

    final static sh a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        var2 = param0.length();
        if (param1 >= 34) {
          var3 = 0;
          L0: while (true) {
            if (var2 > var3) {
              var4 = param0.charAt(var3);
              if (var4 >= 48) {
                if (var4 <= 57) {
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return qj.field_F;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(hj param0, byte param1, int[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        gf.a();
        var3 = 62 / ((69 - param1) / 47);
        gf.a(param2, 0, param2.length);
        gf.c();
        L0: while (true) {
          if (gf.d()) {
            L1: {
              var4 = gf.field_g;
              if (-1 >= (var4 ^ -1)) {
                break L1;
              } else {
                var4 = 0;
                break L1;
              }
            }
            L2: {
              var5 = gf.field_b;
              if (tc.field_j <= var5) {
                var5 = -1 + tc.field_j;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = gf.field_a;
              if (var6 < 0) {
                var6 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var6 < tc.field_c) {
                break L4;
              } else {
                var6 = -1 + tc.field_c;
                break L4;
              }
            }
            var7 = var4 % param0.field_s;
            var8 = var6 % param0.field_y;
            var9 = var4 - -(tc.field_j * var6);
            var10 = var7 - -(param0.field_s * var8);
            var11 = param0.field_s + -var7;
            var12 = -var4 + var5;
            L5: while (true) {
              var12--;
              if (0 > var12) {
                continue L0;
              } else {
                var9++;
                var10++;
                tc.field_b[var9] = param0.field_z[var10];
                var11--;
                if (0 == var11) {
                  var10 = param0.field_s * var8;
                  var11 = param0.field_s;
                  continue L5;
                } else {
                  continue L5;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 >= 51) {
            return;
        }
        field_a = null;
    }

    final static jk a(int param0, int param1, int param2, int param3, int param4, ah[] param5, int param6, int param7, int param8, int param9, byte param10) {
        int var11 = -58 % ((-25 - param10) / 57);
        return kn.a(0, param8, param9, param6, 1, param7, param2, param1, param5, param4, 0, param3, param0);
    }

    final static boolean a(int param0, int param1, byte param2, gn param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param3.a(param0, true, param1);
        var4 = var5;
        if (var5 != null) {
          ug.a((byte) -97, var5);
          if (param2 != -27) {
            field_d = null;
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[1024];
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
        field_c = new float[]{0.6000000238418579f, 0.800000011920929f, 1.0f};
    }
}
