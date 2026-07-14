/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends tg {
    static jf field_H;
    private nd field_I;
    int field_K;
    private int field_G;
    int field_J;
    static int[] field_F;
    static int field_N;
    static String field_L;
    static String field_M;

    final static void c(byte param0) {
        if (param0 != -44) {
          return;
        } else {
          nk.field_K = si.a(vm.field_d, new double[3], new double[3]);
          pe.field_j = si.b(nk.field_K);
          return;
        }
    }

    public static void e(int param0) {
        field_H = null;
        if (param0 <= 112) {
          gb.a(-40, -4, false, -93);
          field_M = null;
          field_L = null;
          field_F = null;
          return;
        } else {
          field_M = null;
          field_L = null;
          field_F = null;
          return;
        }
    }

    final static boolean g(boolean param0) {
        if (!param0) {
            return false;
        }
        return ak.b(-31609);
    }

    final int a(int param0, int param1) {
        if ((param1 ^ -1) <= param0) {
          if (param1 >= ((gb) this).field_I.a(false)) {
            return -1;
          } else {
            return ((gb) this).field_I.a(param1, (byte) -104);
          }
        } else {
          return -1;
        }
    }

    final int d(byte param0) {
        if (param0 >= -19) {
            return 121;
        }
        return ((gb) this).field_I.a(false);
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Virogrid.field_F ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((gb) this).field_J + param6 - param3;
            var9 = -(((gb) this).field_J * 2) + ((gb) this).field_g;
            if (var9 >= var8) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if (0 > var8) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var8 = var8 * ((gb) this).field_G / var9;
          if (-2 != (param1 ^ -1)) {
            if (2 == param1) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((gb) this).field_I.a(param2) <= var12) {
                  if ((var11 ^ -1) <= -1) {
                    ((gb) this).field_I.a((byte) 99, var11);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  var13 = -var8 + ((gb) this).field_I.a(var12, (byte) -18);
                  var13 = var13 * var13;
                  if (var10 > var13) {
                    var10 = var13;
                    var11 = var12;
                    var12++;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((gb) this).field_I.b(-1, var8);
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          bd.field_e = param1;
          hm.field_c = param3;
          we.field_l = 0;
          if (!mf.a(param0 ^ -95, hm.field_c)) {
            break L0;
          } else {
            var4 = 0;
            al.field_j[hm.field_c].a((byte) 119, var4, param2);
            break L0;
          }
        }
        L1: {
          if (3 == (hm.field_c ^ -1)) {
            em.field_c = 84.0f;
            ec.field_z = 3.1415927410125732f;
            jk.field_c = 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != -2) {
          field_H = null;
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 2147483647) {
            ((gb) this).field_G = 123;
            return ((gb) this).field_G;
        }
        return ((gb) this).field_G;
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_N = 9;
        field_M = "Players: <%0>/<%1>";
    }
}
