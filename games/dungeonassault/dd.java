/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends rj {
    static dd field_E;
    static String field_z;
    static int[] field_A;
    static int[] field_C;
    int field_G;
    int field_F;
    private int field_D;
    static wh field_B;

    final void a(boolean param0, int param1, int param2) {
        if (!(-68 >= (param1 ^ -1))) {
            param1 = 67;
        }
        super.a(param0, param1, param2);
        ((dd) this).field_D = -20 + param1;
    }

    final static int a(int param0, boolean param1) {
        L0: {
          if (!param1) {
            break L0;
          } else {
            int discarded$1 = dd.a(44, true);
            break L0;
          }
        }
        if (param0 < 65536) {
          if (param0 > -257) {
            if (0 <= param0) {
              return i.field_u[param0] >> 620677224;
            } else {
              return -1;
            }
          } else {
            if (-4097 > param0) {
              if (1024 <= param0) {
                return i.field_u[param0 >> -964118556] >> 1055449994;
              } else {
                return i.field_u[param0 >> -518475742] >> -1965741623;
              }
            } else {
              if (16384 <= param0) {
                return i.field_u[param0 >> -1723401048] >> 1941784588;
              } else {
                return i.field_u[param0 >> -871764186] >> 1836140299;
              }
            }
          }
        } else {
          if (16777216 > param0) {
            if (param0 < 1048576) {
              if (-262145 < (param0 ^ -1)) {
                return i.field_u[param0 >> 85196746] >> 1770679117;
              } else {
                return i.field_u[param0 >> -1426227028] >> -971274002;
              }
            } else {
              if ((param0 ^ -1) > -4194305) {
                return i.field_u[param0 >> 707326478] >> 2111196751;
              } else {
                return i.field_u[param0 >> -402174640] >> 146705584;
              }
            }
          } else {
            if ((param0 ^ -1) <= -268435457) {
              if (-1073741825 >= (param0 ^ -1)) {
                return i.field_u[param0 >> 455779704] >> -454282060;
              } else {
                return i.field_u[param0 >> -1859793578] >> 2019403795;
              }
            } else {
              if (67108864 <= param0) {
                return i.field_u[param0 >> -482796236] >> -2056822190;
              } else {
                return i.field_u[param0 >> 832273362] >> -681773583;
              }
            }
          }
        }
    }

    public static void c(byte param0) {
        field_A = null;
        field_C = null;
        if (param0 != -40) {
            field_E = null;
        }
        field_E = null;
        field_z = null;
        field_B = null;
    }

    final void d(int param0, int param1, int param2) {
        if (-1 == (((dd) this).field_D ^ -1)) {
            return;
        }
        int var4 = (-33 + param0) * ((dd) this).field_G / (-46 + ((dd) this).field_D);
        if (var4 > ((dd) this).field_G) {
            var4 = ((dd) this).field_G;
        }
        if (param1 != 128) {
            ((dd) this).a(41, -14);
        }
        if (0 > var4) {
            var4 = 0;
        }
        ((dd) this).field_F = var4;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var7 = DungeonAssault.field_K;
        var4 = param0 + ((dd) this).field_t;
        var5 = ((dd) this).field_i + param2;
        bp.a(var5, bl.field_o, var4, (byte) 99);
        bp.a(((dd) this).field_D + var5 - -10, go.field_S, var4, (byte) 99);
        var6 = 0;
        L0: while (true) {
          if (var6 >= 7) {
            var6 = 0;
            L1: while (true) {
              if ((var6 ^ -1) <= -4) {
                var6 = 1;
                L2: while (true) {
                  if (((dd) this).field_D + -1 <= var6) {
                    L3: {
                      if (((dd) this).field_G != 0) {
                        stackOut_11_0 = (((dd) this).field_D - 46) * ((dd) this).field_F / ((dd) this).field_G;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_12_0;
                      bp.a(4 + var5, im.field_m, var6 + (var4 + 10), (byte) 99);
                      tn.field_W.h(var4, var5);
                      if (param1 == 8187) {
                        break L4;
                      } else {
                        field_C = null;
                        break L4;
                      }
                    }
                    dc.field_x.h(((dd) this).field_D + var4 + 10, var5);
                    ml.field_a.h(var4 + (10 + var6), 4 + var5);
                    return;
                  } else {
                    qe.b(var6 + (10 + var4), var5 + 7, 5, 0, -(var6 * 80 / ((dd) this).field_D) + 144);
                    var6++;
                    continue L2;
                  }
                }
              } else {
                qe.a(11 + var4, var5 + 5 + -var6, -2 + ((dd) this).field_D, 0, 64 * (-var6 + 3));
                qe.a(11 + var4, var5 - -13 - -var6, -2 + ((dd) this).field_D, 0, (3 - var6) * 64);
                var6++;
                continue L1;
              }
            }
          } else {
            te.a(var4 + 11, var6 + var5 + 6, -2 + ((dd) this).field_D, kc.field_M);
            var6++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1) {
        ((dd) this).field_F = ((dd) this).field_F + (param1 * ((dd) this).field_G >> 1473275173);
        if (!(((dd) this).field_F <= ((dd) this).field_G)) {
            ((dd) this).field_F = ((dd) this).field_G;
        }
        if (param0 != 1) {
            field_z = null;
        }
        if (-1 < (((dd) this).field_F ^ -1)) {
            ((dd) this).field_F = 0;
        }
    }

    final static cn a(byte param0, int param1, cn param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        cn var6 = new cn(param1 * 2 + param2.field_y, 2 * param1 + param2.field_v);
        jh.a(var6);
        gf.b(0, 0, var6.field_y, var6.field_v, 16777215);
        for (var4 = 0; param1 > var4; var4++) {
            param2.e(param1 + -param2.field_w, param1 - param2.field_A, 0);
            gf.d(1, 1, 0, 0, var6.field_y, var6.field_v);
        }
        var6.h();
        param2.e(param1 - param2.field_w, param1 - param2.field_A, 0);
        jh.b();
        if (param0 != -112) {
            return null;
        }
        var6.field_w = param2.field_w + -param1;
        var6.field_A = param2.field_A - param1;
        return var6;
    }

    final void a(int param0, byte param1, int param2) {
        if (!(((dd) this).field_D != 0)) {
            return;
        }
        int var4 = ((dd) this).field_G * (param2 + -33) / (-46 + ((dd) this).field_D);
        if (((dd) this).field_F < var4) {
            ((dd) this).field_F = ((dd) this).field_F + (((dd) this).field_G >> -556957852);
        }
        if (var4 < ((dd) this).field_F) {
            ((dd) this).field_F = ((dd) this).field_F - (((dd) this).field_G >> 389311268);
        }
        if (!(((dd) this).field_G >= ((dd) this).field_F)) {
            ((dd) this).field_F = ((dd) this).field_G;
        }
        if (((dd) this).field_F < 0) {
            ((dd) this).field_F = 0;
        }
        if (param1 > -59) {
            field_C = null;
        }
    }

    dd(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param3, 19, param2);
        ((dd) this).field_F = param5;
        ((dd) this).field_G = param4;
        ((dd) this).field_D = param3 - 20;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Bottomless Pit";
        field_C = new int[]{45, 187, 495, 660, 885, 1039, 1230, 1410, 1674};
    }
}
