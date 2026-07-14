/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gn {
    int field_X;
    static ip field_cb;
    static boolean field_S;
    int field_bb;
    int field_T;
    int field_U;
    static boolean field_ab;
    int field_R;
    int field_W;
    static String[] field_N;
    static ja field_P;
    static String field_Y;
    static ri field_Q;
    static cj field_M;
    static int[] field_V;
    static String field_Z;
    static String[] field_O;

    final static boolean a(int param0, ul param1, int param2, byte param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param1.a(param0, true, param2);
        var4 = var5;
        if (var5 == null) {
          return false;
        } else {
          if (param3 != -42) {
            field_V = null;
            pd.a((byte) 108, var5);
            return true;
          } else {
            pd.a((byte) 108, var5);
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        Object var13 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4 ^ 0, param5, param6)) {
          var8 = -((ud) this).field_y + (-param5 + -((ud) this).field_R) + param1;
          var9 = -((ud) this).field_bb + (-((ud) this).field_i + (-param6 + param0));
          if (var8 * var8 + var9 * var9 < ((ud) this).field_X * ((ud) this).field_X) {
            var10 = Math.atan2((double)var9, (double)var8) - mg.field_J;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)((ud) this).field_U;
              ((ud) this).field_T = (int)(var10 * (double)((ud) this).field_U / 6.283185307179586);
              L0: while (true) {
                if (((ud) this).field_T >= ((ud) this).field_U) {
                  ((ud) this).field_T = ((ud) this).field_T - ((ud) this).field_U;
                  continue L0;
                } else {
                  L1: while (true) {
                    if (((ud) this).field_T >= 0) {
                      return true;
                    } else {
                      ((ud) this).field_T = ((ud) this).field_T + ((ud) this).field_U;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              L2: {
                if (var10 <= 0.0) {
                  break L2;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((ud) this).field_U;
                  break L2;
                }
              }
              ((ud) this).field_T = (int)(var10 * (double)((ud) this).field_U / 6.283185307179586);
              L3: while (true) {
                if (((ud) this).field_T < ((ud) this).field_U) {
                  L4: while (true) {
                    if (((ud) this).field_T >= 0) {
                      return true;
                    } else {
                      ((ud) this).field_T = ((ud) this).field_T + ((ud) this).field_U;
                      continue L4;
                    }
                  }
                } else {
                  ((ud) this).field_T = ((ud) this).field_T - ((ud) this).field_U;
                  continue L3;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          if (param4 != -24) {
            var13 = null;
            ud.a(17, -37, (ul) null, (vp) null);
            return false;
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, ul param2, vp param3) {
        if (param0 != -3758) {
          field_Q = null;
          vm.field_hb = param1 * wq.a((byte) 72) / 1000;
          ui.a(7478, param2);
          lh.a(-30, param2);
          bm.a(30651, param2);
          pg.a(false);
          eh.a(-1741);
          f.field_a = 0 - vm.field_hb;
          return;
        } else {
          vm.field_hb = param1 * wq.a((byte) 72) / 1000;
          ui.a(7478, param2);
          lh.a(-30, param2);
          bm.a(30651, param2);
          pg.a(false);
          eh.a(-1741);
          f.field_a = 0 - vm.field_hb;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int discarded$3 = lk.b(false);
        if (param1 == 1000) {
            return;
        }
        ud.f(-127);
    }

    public static void f(int param0) {
        if (param0 <= 14) {
          ud.f(-15);
          field_Z = null;
          field_Q = null;
          field_V = null;
          field_cb = null;
          field_P = null;
          field_M = null;
          field_O = null;
          field_N = null;
          field_Y = null;
          return;
        } else {
          field_Z = null;
          field_Q = null;
          field_V = null;
          field_cb = null;
          field_P = null;
          field_M = null;
          field_O = null;
          field_N = null;
          field_Y = null;
          return;
        }
    }

    private ud() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new ip();
        field_V = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_Z = "Enter name of friend to add to list";
        field_O = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
