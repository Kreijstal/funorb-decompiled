/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends kd {
    static java.applet.Applet field_i;
    static int field_j;
    int field_k;
    byte[] field_h;

    final static void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2, byte param3, wf param4, int param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          if (param3 == 84) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        L1: {
          var7 = kf.a((byte) -21, param1);
          if (null != kd.field_e) {
            break L1;
          } else {
            kd.field_e = new java.security.SecureRandom();
            break L1;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L2: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L3: {
              L4: {
                if (null == gd.field_m) {
                  break L4;
                } else {
                  if (var7 > gd.field_m.field_j.length) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              gd.field_m = new wf(var7);
              break L3;
            }
            L5: {
              L6: {
                gd.field_m.field_h = 0;
                gd.field_m.a(param5, param6, 255, param1);
                gd.field_m.e(var7, (byte) 82);
                gd.field_m.a(-661454965, var15);
                if (null == fc.field_z) {
                  break L6;
                } else {
                  if ((fc.field_z.field_j.length ^ -1) > -101) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              fc.field_z = new wf(100);
              break L5;
            }
            fc.field_z.field_h = 0;
            fc.field_z.c(10, -1);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if (var11 >= 4) {
                fc.field_z.e(112, param1);
                fc.field_z.a(param3 ^ -11, param2, param0);
                param4.a(0, fc.field_z.field_j, param3 + 171, fc.field_z.field_h);
                param4.a(0, gd.field_m.field_j, 255, gd.field_m.field_h);
                return;
              } else {
                fc.field_z.f(var15[var11], -32287);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = kd.field_e.nextInt();
            var9++;
            continue L2;
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param1) {
            lf.c(0, 0, lf.field_f, lf.field_a, 0, 192);
        } else {
            lf.a();
        }
        we.a((byte) -65, param1);
        int var3 = -78 % ((param2 - -61) / 51);
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 0) {
            tg.a(true, false, 96);
        }
    }

    final static void a(wh param0, int param1, wh param2, int param3, int param4, int param5) {
        oh.field_b = param5;
        we.field_l = param3;
        fg.field_c = param2;
        if (param4 >= -99) {
            field_j = -2;
        }
        sc.field_d = param0;
        jh.field_e = param1;
    }

    private tg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 8;
    }
}
