/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vt extends tc {
    static int[] field_m;
    static wk field_k;
    static int field_n;
    static int field_l;

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (!bb.field_a) {
          if (!iu.field_h) {
            if (!po.a(param0, 6150, param2)) {
              if (!vi.field_d) {
                if (param3 <= 25) {
                  field_k = null;
                  return ro.b(param1, (byte) -59, param2);
                } else {
                  return ro.b(param1, (byte) -59, param2);
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return cd.a(param2, param0, false);
          }
        } else {
          return aw.field_i.a(rs.field_q, ui.field_i, 80);
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_m = null;
        if (param0) {
            vt.a(true);
        }
    }

    final static void a(int param0) {
        ft var1 = null;
        ft var2 = null;
        int var3 = 0;
        kr.field_G = new rk();
        kr.field_G.n(111);
        var1 = kr.field_G.e((byte) 126);
        if (var1 == null) {
          return;
        } else {
          var2 = kr.field_G.a((byte) -108);
          if (var2 != null) {
            var3 = kr.field_G.o(-1);
            if (var3 > -1) {
              return;
            } else {
              if (param0 <= -112) {
                if (null != kr.field_G.field_w) {
                  if (-1 == kr.field_G.field_w.length) {
                    return;
                  } else {
                    gb.a(var3, 7, var1.field_k, var2.field_k, var1.field_n, var2.field_n, kr.field_G.field_w, -40);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1, int param2, bv param3) {
        if (param0 != -9202) {
            return 101;
        }
        return ju.a(param3, 1 << param2, 1 << param1, param1, (byte) -122, param2);
    }

    vt() {
    }

    final static boolean a(int param0, tu param1, int param2, wk[] param3, String param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = param1.a(param4) + (param3[0].field_A << -200883423) >> 398192385;
        if (param5 <= -104) {
          var7 = -var6 + param0;
          var8 = param0 - -var6;
          if (-1 >= (var7 ^ -1)) {
            if (var8 <= 640) {
              return wg.a(-33, -var6 + param0, var6 + param0, param2, param3[0].field_x + param2);
            } else {
              param0 = param0 - (var8 - 640);
              return wg.a(-33, -var6 + param0, var6 + param0, param2, param3[0].field_x + param2);
            }
          } else {
            param0 = param0 - var7;
            return wg.a(-33, -var6 + param0, var6 + param0, param2, param3[0].field_x + param2);
          }
        } else {
          field_m = null;
          var7 = -var6 + param0;
          var8 = param0 - -var6;
          if (-1 >= (var7 ^ -1)) {
            if (var8 <= 640) {
              return wg.a(-33, -var6 + param0, var6 + param0, param2, param3[0].field_x + param2);
            } else {
              param0 = param0 - (var8 - 640);
              return wg.a(-33, -var6 + param0, var6 + param0, param2, param3[0].field_x + param2);
            }
          } else {
            param0 = param0 - var7;
            return wg.a(-33, -var6 + param0, var6 + param0, param2, param3[0].field_x + param2);
          }
        }
    }

    static {
    }
}
