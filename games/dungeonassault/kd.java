/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static java.math.BigInteger field_d;
    static tf[] field_e;
    static String field_a;
    static cn field_f;
    static String field_b;
    static int field_c;
    static int[] field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        if (param3 >= param7) {
          if (param3 < param6) {
            ue.a(param7, gf.field_b, param5, param6, param1, param3, param0, param2, 16);
            if (param4 == 29108) {
              return;
            } else {
              return;
            }
          } else {
            if (param6 > param7) {
              ue.a(param7, gf.field_b, param5, param3, param2, param6, param0, param1, 16);
              if (param4 == 29108) {
                return;
              } else {
                return;
              }
            } else {
              ue.a(param6, gf.field_b, param5, param3, param0, param7, param2, param1, 16);
              if (param4 == 29108) {
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param7 >= param6) {
            if (param3 >= param6) {
              ue.a(param6, gf.field_b, param5, param7, param1, param3, param2, param0, 16);
              if (param4 != 29108) {
                return;
              } else {
                return;
              }
            } else {
              ue.a(param3, gf.field_b, param5, param7, param2, param6, param1, param0, 16);
              if (param4 != 29108) {
                return;
              } else {
                return;
              }
            }
          } else {
            ue.a(param3, gf.field_b, param5, param6, param0, param7, param1, param2, 16);
            if (param4 == 29108) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        hl.a(true);
        sn.a(param0 ^ 61, param0);
    }

    final static void a(int param0, nh param1) {
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        wj var8 = null;
        int var9 = 0;
        wj var10 = null;
        wj var11 = null;
        wj var12 = null;
        qh var13 = null;
        int[] var14 = null;
        wj var15 = null;
        wj var16 = null;
        qh var17 = null;
        qh var17_ref = null;
        int[] var18 = null;
        qh var19 = null;
        var7 = DungeonAssault.field_K;
        if (param0 == 31913) {
          var12 = new wj(param1.a("logo.fo3d", "", (byte) -113));
          var11 = var12;
          var3 = var11.c(true);
          var11.e(false);
          ch.field_n = lo.a(var11, (byte) -128);
          ih.field_w = new qh[var3];
          lk.field_R = new int[var3][];
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              var11.f((byte) 32);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var13 = ih.field_w[var9];
                  var17 = var13;
                  var19 = var17;
                  var17 = var13;
                  var13.a(1, false, 6, 6, 6);
                  var13.a((byte) -127);
                  var14 = new int[]{var13.field_H - -var13.field_i >> -1481761759, var13.field_p - -var13.field_M >> -702008991, var13.field_a + var13.field_b >> -622637407};
                  lk.field_R[var9] = var14;
                  var13.a(0, -var14[0], -var14[2], -var14[1]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              ih.field_w[var4] = df.a(false, var12);
              var4++;
              continue L0;
            }
          }
        } else {
          field_b = null;
          var16 = new wj(param1.a("logo.fo3d", "", (byte) -113));
          var8 = var16;
          var15 = var16;
          var10 = var15;
          var3 = var15.c(true);
          var15.e(false);
          ch.field_n = lo.a(var15, (byte) -128);
          ih.field_w = new qh[var3];
          lk.field_R = new int[var3][];
          var4 = 0;
          L2: while (true) {
            if (var3 <= var4) {
              var15.f((byte) 32);
              var9 = 0;
              var4 = var9;
              L3: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var17_ref = ih.field_w[var9];
                  var19 = var17_ref;
                  var19 = var17_ref;
                  var17_ref.a(1, false, 6, 6, 6);
                  var17_ref.a((byte) -127);
                  var18 = new int[]{var17_ref.field_H - -var17_ref.field_i >> -1481761759, var17_ref.field_p - -var17_ref.field_M >> -702008991, var17_ref.field_a + var17_ref.field_b >> -622637407};
                  lk.field_R[var9] = var18;
                  var17_ref.a(0, -var18[0], -var18[2], -var18[1]);
                  var9++;
                  continue L3;
                }
              }
            } else {
              ih.field_w[var4] = df.a(false, var16);
              var4++;
              continue L2;
            }
          }
        }
    }

    final static void b(int param0) {
        l.a(false, 0, 0, 0, 0, 0, 0, 0, 0, new int[0][], 0, false, 0);
        l.a(false, 0, 0, 1, 0, 0, 0, 0, 0, new int[0][], 0, false, 0);
        l.a(false, 0, 0, 2, 0, 0, 0, 0, 0, new int[0][], 0, true, 0);
        l.a(false, 0, 0, 3, 0, 0, 0, 0, param0 ^ 0, new int[0][], 0, false, 0);
        l.a(false, 0, 0, 5, 1, 1, 0, 100, 0, new int[0][], 0, false, 1);
        l.a(true, 0, 0, 4, 4, 1, 0, 200, param0 ^ 0, new int[1][], 0, false, 1);
        l.a(true, 0, 0, 6, 2, 1, 1, 300, 0, new int[1][], 3500, false, 2);
        l.a(true, 0, 0, 7, 6, 1, 0, 500, 0, new int[1][], 7500, false, 3);
        l.a(false, 0, 0, 8, 3, 1, 1, 600, param0 ^ 0, new int[1][], 11000, false, 4);
        l.a(true, 0, 0, 9, 4, 1, 0, 800, 0, new int[1][], 16000, false, 3);
        l.a(true, 0, 0, 11, 3, 1, 1, 1100, 0, new int[0][], 20000, true, 7);
        l.a(true, 6, 8, 21, 5, 2, 1, 1400, param0 ^ 0, new int[1][], 27500, false, 0);
        l.a(true, 6, 0, 12, 6, 1, 0, 1500, 0, new int[1][], 32000, true, 4);
        l.a(true, 0, 0, 13, 7, 1, 1, 1800, 0, new int[1][], 39000, false, 7);
        l.a(false, 0, 0, 10, 8, 1, 2, 2200, 0, new int[2][], 55000, true, 4);
        l.a(false, 0, 0, 14, 6, 1, 3, 2300, 0, new int[0][], 65000, true, 8);
        l.a(false, 0, 0, 35, 2, 3, 0, 100, param0 + 0, new int[1][], 0, false, 0);
        l.a(false, 0, 0, 36, 0, 3, 1, 1100, 0, new int[2][], 23000, false, 6);
        l.a(false, 0, 0, 37, 9, 3, -1, 2200, 0, new int[1][], 60000, false, 0);
        l.a(true, 1, 1, 15, 1, 2, 0, 100, 0, new int[0][], 0, false, 1);
        l.a(true, 1, 1, 16, 2, 2, 0, 200, 0, new int[1][], 0, false, 0);
        l.a(true, 2, 2, 17, 1, 2, 1, 300, 0, new int[0][], 4500, false, 1);
        l.a(true, 2, 1, 25, 3, 2, param0, 350, 0, new int[0][], 5500, false, 1);
        l.a(true, 2, 3, 18, 1, 2, 0, 400, param0 ^ 0, new int[0][], 6500, false, 1);
        l.a(true, 2, 3, 24, 3, 2, 1, 500, 0, new int[2][], 8500, false, 1);
        l.a(true, 2, 3, 19, 1, 2, 0, 600, 0, new int[0][], 9500, false, 4);
        l.a(true, 2, 4, 20, 3, 2, 0, 700, 0, new int[1][], 11500, false, 0);
        l.a(true, 5, 2, 23, 4, 2, -1, 800, 0, new int[1][], 12500, false, 3);
        l.a(true, 2, 2, 27, 5, 2, 0, 850, param0 ^ 0, new int[1][], 14000, false, 2);
        l.a(true, 3, 5, 30, 1, 2, -1, 900, 0, new int[0][], 18000, true, 4);
        l.a(true, 5, 4, 28, 2, 2, 1, 1100, 0, new int[2][], 21500, false, 6);
        l.a(true, 6, 6, 31, 2, 2, 1, 1200, 0, new int[0][], 24500, true, 0);
        l.a(true, 6, 2, 29, 4, 2, -1, 1300, 0, new int[0][], 26000, true, 6);
        l.a(true, 4, 8, 26, 7, 2, 0, 1400, 0, new int[1][], 30000, false, 0);
        l.a(true, 7, 7, 22, 1, 2, 1, 1800, 0, new int[1][], 35000, false, 1);
        l.a(true, 5, 4, 32, 7, 2, 1, 1900, 0, new int[1][], 42000, true, 4);
        l.a(true, 9, 5, 33, 8, 2, 2, 2200, 0, new int[0][], 62000, true, 5);
        l.a(true, 10, 6, 34, 10, 2, 3, 3000, param0 + 0, new int[1][], 70000, true, 5);
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 > -43) {
            field_d = null;
        }
    }

    final synchronized static long c(int param0) {
        long var1 = System.currentTimeMillis();
        if ((var1 ^ -1L) > (lo.field_f ^ -1L)) {
            fb.field_c = fb.field_c + (-var1 + lo.field_f);
            if (param0 == -2456) {
                lo.field_f = var1;
                return fb.field_c + var1;
            }
            kd.b(-64);
            lo.field_f = var1;
            return fb.field_c + var1;
        }
        if (param0 != -2456) {
            kd.b(-64);
            lo.field_f = var1;
            return fb.field_c + var1;
        }
        lo.field_f = var1;
        return fb.field_c + var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Just play";
        field_a = "Fullscreen";
        field_g = new int[4];
    }
}
