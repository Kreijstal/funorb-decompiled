/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private kd field_d;
    static String field_b;
    static int[] field_c;
    static hm field_a;
    private kd field_e;
    static rm field_f;

    final kd a(boolean param0) {
        kd var2 = null;
        var2 = ((ra) this).field_e;
        if (((ra) this).field_d == var2) {
          ((ra) this).field_e = null;
          return null;
        } else {
          ((ra) this).field_e = var2.field_o;
          if (param0) {
            ra.b((byte) 121);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final kd b(int param0) {
        kd var2 = ((ra) this).field_d.field_o;
        if (param0 != 22) {
            kd discarded$9 = ((ra) this).b(118);
            if (!(var2 != ((ra) this).field_d)) {
                ((ra) this).field_e = null;
                return null;
            }
            ((ra) this).field_e = var2.field_o;
            return var2;
        }
        if (!(var2 != ((ra) this).field_d)) {
            ((ra) this).field_e = null;
            return null;
        }
        ((ra) this).field_e = var2.field_o;
        return var2;
    }

    final void a(int param0) {
        kd var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        L0: while (true) {
          var2 = ((ra) this).field_d.field_o;
          if (var2 == ((ra) this).field_d) {
            if (param0 != 8150) {
              int discarded$2 = ((ra) this).a((byte) -114);
              ((ra) this).field_e = null;
              return;
            } else {
              ((ra) this).field_e = null;
              return;
            }
          } else {
            var2.e(480);
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = SteelSentinels.field_G;
          pb.g(param3, param0, 1 + param1, 10000536);
          pb.g(param3, param2 + param0, 1 + param1, 12105912);
          var5 = 1;
          if (pb.field_l <= param0 + var5) {
            break L0;
          } else {
            var5 = pb.field_l - param0;
            break L0;
          }
        }
        L1: {
          var6 = param2;
          if (pb.field_d >= var6 + param0) {
            break L1;
          } else {
            var6 = pb.field_d - param0;
            break L1;
          }
        }
        var7 = var5;
        L2: while (true) {
          if (var6 <= var7) {
            if (param4 <= 93) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            var8 = 152 - -(48 * var7 / param2);
            var9 = var8 << -1592151600 | var8 << 974872648 | var8;
            pb.field_g[pb.field_c * (param0 - -var7) + param3] = var9;
            pb.field_g[param1 + (param3 + pb.field_c * (param0 + var7))] = var9;
            var7++;
            continue L2;
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = -107 % ((-33 - param0) / 46);
        field_b = null;
        field_f = null;
        field_c = null;
    }

    final kd c(int param0) {
        kd var2 = null;
        int var3 = 0;
        var2 = ((ra) this).field_d.field_o;
        var3 = -86 % ((param0 - -32) / 35);
        if (var2 == ((ra) this).field_d) {
          return null;
        } else {
          var2.e(480);
          return var2;
        }
    }

    final static void a(int param0, int param1, mi param2, int param3, int param4, byte param5, String param6, int param7) {
        wk[] var8 = null;
        L0: {
          var8 = pl.field_T;
          jm.a(param1, param7, var8, 1, param3, param4);
          if (param6 != null) {
            param2.a(param6, param4 / 2 + param3, param2.field_U / 2 + param7 / 2 + param1, param0, -1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param5 == 68) {
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final void a(byte param0, kd param1) {
        if (null == param1.field_v) {
          param1.field_o = ((ra) this).field_d;
          param1.field_v = ((ra) this).field_d.field_v;
          param1.field_v.field_o = param1;
          param1.field_o.field_v = param1;
          if (param0 > 34) {
            return;
          } else {
            ((ra) this).field_e = null;
            return;
          }
        } else {
          param1.e(480);
          param1.field_o = ((ra) this).field_d;
          param1.field_v = ((ra) this).field_d.field_v;
          param1.field_v.field_o = param1;
          param1.field_o.field_v = param1;
          if (param0 > 34) {
            return;
          } else {
            ((ra) this).field_e = null;
            return;
          }
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        kd var3 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        var3 = ((ra) this).field_d.field_o;
        if (param0 < -81) {
          L0: while (true) {
            if (((ra) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_o;
              var2++;
              continue L0;
            }
          }
        } else {
          kd discarded$1 = ((ra) this).a(false);
          L1: while (true) {
            if (((ra) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_o;
              var2++;
              continue L1;
            }
          }
        }
    }

    public ra() {
        ((ra) this).field_d = new kd();
        ((ra) this).field_d.field_v = ((ra) this).field_d;
        ((ra) this).field_d.field_o = ((ra) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have completed the training missions. Log in or create a free account to play multiplayer games or to begin the single player campaign.";
        field_c = new int[]{0, 1, 28, 5, 35, 4, 3, 22, 19};
        field_a = new hm();
        field_f = new rm(1);
    }
}
