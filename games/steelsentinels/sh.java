/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static int field_a;
    static fm field_b;
    static int field_d;
    static String field_c;

    final static int c(int param0) {
        int var1 = 124 % ((param0 - 17) / 56);
        return ce.field_r - ej.field_D;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -16088) {
            int discarded$0 = sh.c(11);
        }
        param3--;
        param2++;
        pb.a(param4, param3, param4 + param1, param3 - -param2);
        ic.field_db.f(param4, param3 - 17);
        pb.c();
        pb.c(param4, param3, param1, 0, 128);
        pb.c(param4, param3 - -1, param1, 0, 96);
        pb.c(param4, param3 + 2, param1, 0, 64);
        pb.c(param4, param3 + 3, param1, 0, 32);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          di.field_g = 10;
          qh.field_Yb = 0;
          var3 = -13 % ((param0 - -87) / 35);
          if (-1 != ge.field_j) {
            var4 = 0;
            var5 = (ge.field_j + -1) * 10;
            var6 = 0;
            L1: while (true) {
              if (var6 >= fm.field_f[ge.field_j]) {
                hc.field_V = var4;
                break L0;
              } else {
                if (ol.field_Ub != var6) {
                  var4 = var4 + jh.field_a[var6 + var5];
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = ol.field_Ub;
            if (-1 == var4) {
              di.field_g = 0;
              break L0;
            } else {
              if (var4 != 1) {
                if (3 != var4) {
                  if (var4 != -6) {
                    if (-8 != var4) {
                      if (9 == var4) {
                        di.field_g = 9;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      di.field_g = 7;
                      break L0;
                    }
                  } else {
                    di.field_g = 5;
                    break L0;
                  }
                } else {
                  di.field_g = 3;
                  break L0;
                }
              } else {
                di.field_g = 1;
                break L0;
              }
            }
          }
        }
        L2: {
          if (!param2) {
            break L2;
          } else {
            if (!ib.a(-78)) {
              km.field_a = dg.field_e;
              break L2;
            } else {
              var4 = param1 ? 1 : 0;
              q.a(-3, var4 != 0, -1, 0);
              break L2;
            }
          }
        }
    }

    final static de[] b(int param0) {
        if (param0 > -9) {
            field_c = null;
        }
        return new de[]{qd.field_o, mj.field_Vb, h.field_Y};
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -3274) {
            int discarded$0 = sh.c(63);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fm(14, 0, 4, 1);
        field_c = "Orb points: ";
    }
}
