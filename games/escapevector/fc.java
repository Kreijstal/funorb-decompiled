/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static int field_a;

    final static void a(boolean param0) {
        if (kb.field_d == 0 - hb.field_h) {
          kb.field_d = kb.field_d + 1;
          if (param0) {
            return;
          }
          fc.a(74, -19);
          return;
        }
        if (kb.field_d != 250 - hb.field_h) {
          kb.field_d = kb.field_d + 1;
          if (param0) {
            return;
          }
          fc.a(74, -19);
          return;
        }
        kb.field_d = kb.field_d + 1;
        if (param0) {
          return;
        }
        fc.a(74, -19);
    }

    final static void a(int param0) {
        ei.field_i = false;
        if (param0 == 3161) {
          eb.field_H = false;
          WhirlpoolHasher.a(-1, param0 - 3109);
          dn.field_q = RasterBuffer.field_g;
          ui.field_b = RasterBuffer.field_g;
          return;
        }
        field_a = -26;
        eb.field_H = false;
        WhirlpoolHasher.a(-1, param0 - 3109);
        dn.field_q = RasterBuffer.field_g;
        ui.field_b = RasterBuffer.field_g;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7, int param8, int param9, int param10, boolean param11) {
        if (param6) {
          param1 = 2 - bk.a(6, false, -param1 + 2) * 6;
          param2 = 3 + 6 * bk.a(6, false, -2 + (param2 - 1));
          param10 = -(6 * bk.a(6, false, 0 - param10)) + 0;
          param3 = 1 + bk.a(6, false, param3 - 1) * 6;
        }
        if (param5 != 29788) {
          field_a = -100;
          if (!param4 ||
            param0 >= 16) {
            SoftwareRasterizer.a(1 + param1, 1 + param10, -2 + (param2 - param1), param3 - param10 - 2, 0);
            qi.a(param8, param2, param7, param9, param10, -29, param1, param3, param0);
            if (param11) {
              qi.a(param8, -3 + param2, param7, -1, 3 + param10, -88, param1 + 3, param3 - 3, param0);
            }
            return;
          }
          int var12 = 66049 * (16 - param0);
          int var13 = 986895 & 330245 * (-param0 + 16) >> 4;
          int var14 = param1;
          int var15 = param10;
          int var16 = param2;
          int var17 = param3;
          if (param11) {
            SoftwareRasterizer.a(param1 + 1, param10 + 1, -2 + param2 - param1, 3, 0);
            SoftwareRasterizer.a(1 + param1, 4 + param10, 3, param3 + (-param10 - 8), 0);
            SoftwareRasterizer.a(param2 - 4, param10 + 4, 3, param3 - param10 - 8, 0);
            var14 += 3;
            var15 += 3;
            var17 -= 3;
            var16 -= 3;
            SoftwareRasterizer.a(1 + param1, -4 + param3, param2 - param1 - 2, 3, 0);
          } else {
            SoftwareRasterizer.c(var14 + 1, var15 + 1, var16 + (-var14 - 2), -2 + (-var15 + var17), var12, var13);
            qi.a(param8, param2, param7, param9, param10, -29, param1, param3, param0);
            if (param11) {
              qi.a(param8, -3 + param2, param7, -1, 3 + param10, -88, param1 + 3, param3 - 3, param0);
            }
            return;
          }
          SoftwareRasterizer.c(var14 + 1, var15 + 1, var16 + (-var14 - 2), -2 + (-var15 + var17), var12, var13);
          qi.a(param8, param2, param7, param9, param10, -29, param1, param3, param0);
          if (param11) {
            qi.a(param8, -3 + param2, param7, -1, 3 + param10, -88, param1 + 3, param3 - 3, param0);
          }
          return;
        }
        if (!param4) {
          SoftwareRasterizer.a(1 + param1, 1 + param10, -2 + (param2 - param1), param3 - param10 - 2, 0);
          qi.a(param8, param2, param7, param9, param10, -29, param1, param3, param0);
          if (param11) {
            qi.a(param8, -3 + param2, param7, -1, 3 + param10, -88, param1 + 3, param3 - 3, param0);
          }
          return;
        }
        if (param0 >= 16) {
          SoftwareRasterizer.a(1 + param1, 1 + param10, -2 + (param2 - param1), param3 - param10 - 2, 0);
          qi.a(param8, param2, param7, param9, param10, -29, param1, param3, param0);
          if (param11) {
            qi.a(param8, -3 + param2, param7, -1, 3 + param10, -88, param1 + 3, param3 - 3, param0);
          }
          return;
        }
        int var12Lifetime1 = 66049 * (16 - param0);
        int var13Lifetime1 = 986895 & 330245 * (-param0 + 16) >> 4;
        int var14Lifetime1 = param1;
        int var15Lifetime1 = param10;
        int var16Lifetime1 = param2;
        int var17Lifetime1 = param3;
        if (param11) {
          SoftwareRasterizer.a(param1 + 1, param10 + 1, -2 + param2 - param1, 3, 0);
          SoftwareRasterizer.a(1 + param1, 4 + param10, 3, param3 + (-param10 - 8), 0);
          SoftwareRasterizer.a(param2 - 4, param10 + 4, 3, param3 - param10 - 8, 0);
          var14Lifetime1 += 3;
          var15Lifetime1 += 3;
          var17Lifetime1 -= 3;
          var16Lifetime1 -= 3;
          SoftwareRasterizer.a(1 + param1, -4 + param3, param2 - param1 - 2, 3, 0);
        } else {
          SoftwareRasterizer.c(var14Lifetime1 + 1, var15Lifetime1 + 1, var16Lifetime1 + (-var14Lifetime1 - 2), -2 + (-var15Lifetime1 + var17Lifetime1), var12Lifetime1, var13Lifetime1);
          qi.a(param8, param2, param7, param9, param10, -29, param1, param3, param0);
          if (param11) {
            qi.a(param8, -3 + param2, param7, -1, 3 + param10, -88, param1 + 3, param3 - 3, param0);
          }
          return;
        }
        SoftwareRasterizer.c(var14Lifetime1 + 1, var15Lifetime1 + 1, var16Lifetime1 + (-var14Lifetime1 - 2), -2 + (-var15Lifetime1 + var17Lifetime1), var12Lifetime1, var13Lifetime1);
        qi.a(param8, param2, param7, param9, param10, -29, param1, param3, param0);
        if (param11) {
          qi.a(param8, -3 + param2, param7, -1, 3 + param10, -88, param1 + 3, param3 - 3, param0);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static NameAvailabilityResult a(boolean param0, byte param1) {
        NameAvailabilityResult var2 = new NameAvailabilityResult(true);
        if (param1 <= -39) {
          var2.field_e = param0 ? true : false;
          return var2;
        }
        return (NameAvailabilityResult) null;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0 == 10758) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            if (param1 >= 2048) {
              stackIn_19_0 = un.field_t[-param1 + 4096];
            } else {
              stackIn_19_0 = un.field_t[param1];
            }
            return stackIn_19_0;
          }
          if (param1 >= 6144) {
            stackIn_15_0 = -un.field_t[-param1 + 8192];
          } else {
            stackIn_15_0 = -un.field_t[param1 - 4096];
          }
          return stackIn_15_0;
        }
        fc.a(-66, 52);
        param1 = param1 & 8191;
        if (param1 < 4096) {
          if (param1 >= 2048) {
            stackIn_9_0 = un.field_t[-param1 + 4096];
          } else {
            stackIn_9_0 = un.field_t[param1];
          }
          return stackIn_9_0;
        }
        if (param1 >= 6144) {
          stackIn_5_0 = -un.field_t[-param1 + 8192];
        } else {
          stackIn_5_0 = -un.field_t[param1 - 4096];
        }
        return stackIn_5_0;
    }

    static {
    }
}
