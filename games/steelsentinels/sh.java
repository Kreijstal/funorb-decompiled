/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static int field_a;
    static fm field_b;
    static int field_d;
    static String field_c;

    final static int c(int param0) {
        int var1 = 0;
        return ce.field_r - ej.field_D;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param3--;
        param2++;
        pb.a(0, param3, 640, param3 - -param2);
        ic.field_db.f(0, param3 - 17);
        pb.c();
        pb.c(0, param3, 640, 0, 128);
        pb.c(0, param3 - -1, 640, 0, 96);
        pb.c(0, param3 + 2, 640, 0, 64);
        pb.c(0, param3 + 3, 640, 0, 32);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              di.field_g = 10;
              qh.field_Yb = 0;
              var3_int = -13 % ((param0 - -87) / 35);
              if (ge.field_j != 0) {
                var4 = 0;
                var5 = (ge.field_j + -1) * 10;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= fm.field_f[ge.field_j]) {
                    hc.field_V = var4;
                    break L1;
                  } else {
                    L3: {
                      if (~ol.field_Ub != ~var6) {
                        var4 = var4 + jh.field_a[var6 + var5];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4 = ol.field_Ub;
                if (var4 == 0) {
                  di.field_g = 0;
                  break L1;
                } else {
                  if (var4 != 1) {
                    if (3 != var4) {
                      if (var4 != 5) {
                        if (var4 != 7) {
                          if (9 == var4) {
                            di.field_g = 9;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          di.field_g = 7;
                          break L1;
                        }
                      } else {
                        di.field_g = 5;
                        break L1;
                      }
                    } else {
                      di.field_g = 3;
                      break L1;
                    }
                  } else {
                    di.field_g = 1;
                    break L1;
                  }
                }
              }
            }
            L4: {
              if (!param2) {
                break L4;
              } else {
                if (!ib.a(-78)) {
                  km.field_a = dg.field_e;
                  break L4;
                } else {
                  var4 = param1 ? 1 : 0;
                  q.a(-3, var4 != 0, -1, 0);
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "sh.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static de[] b(int param0) {
        return new de[]{qd.field_o, mj.field_Vb, h.field_Y};
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fm(14, 0, 4, 1);
        field_c = "Orb points: ";
    }
}
