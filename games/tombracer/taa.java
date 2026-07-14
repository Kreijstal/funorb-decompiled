/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class taa extends vg {
    private int field_f;
    private int field_h;
    static nc field_g;

    final void a(uia param0, int param1) {
        if (param1 != 32654) {
            taa.a((byte) -36);
        }
        param0.i(((taa) this).field_h, 0);
        param0.i(((taa) this).field_f, 0);
    }

    final int c(int param0) {
        if (param0 != 16) {
            return -13;
        }
        return ((taa) this).field_h;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if ((param2 ^ -1) == -11) {
            param3 = param3 - (id.field_h[0].a() * 2 - -(id.field_h[0].a() / 2));
            var4 = 0;
            L1: while (true) {
              if (-5 >= (var4 ^ -1)) {
                break L0;
              } else {
                var5 = var4 + 12;
                id.field_h[var5].a(param3, param1 - (id.field_h[var5].c() >> -1496548831));
                param3 = param3 + id.field_h[var5].a();
                var4++;
                continue L1;
              }
            }
          } else {
            if (param2 != 9) {
              if (param2 != 8) {
                L2: {
                  if ((param2 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (7 < param2) {
                      break L2;
                    } else {
                      id.field_h[param2].a(-(id.field_h[param2].a() >> -1567654239) + param3, -(id.field_h[param2].c() >> 1548346849) + param1);
                      break L0;
                    }
                  }
                }
                if (-12 != (param2 ^ -1)) {
                  break L0;
                } else {
                  id.field_h[16].a(-(id.field_h[16].a() >> -1331517311) + param3, -(id.field_h[16].c() >> -1132591743) + param1);
                  break L0;
                }
              } else {
                param3 = param3 - (id.field_h[0].a() + id.field_h[0].a() / 2);
                var4 = 0;
                L3: while (true) {
                  if ((var4 ^ -1) <= -3) {
                    break L0;
                  } else {
                    var5 = var4 + 8;
                    id.field_h[var5].a(param3, -(id.field_h[var5].c() >> -1980345311) + param1);
                    param3 = param3 + id.field_h[var5].a();
                    var4++;
                    continue L3;
                  }
                }
              }
            } else {
              param3 = param3 - (id.field_h[0].a() - -(id.field_h[0].a() / 2));
              var4 = 0;
              L4: while (true) {
                if (-3 >= (var4 ^ -1)) {
                  break L0;
                } else {
                  var5 = var4 + 10;
                  id.field_h[var5].a(param3, -(id.field_h[var5].c() >> -873154239) + param1);
                  param3 = param3 + id.field_h[var5].a();
                  var4++;
                  continue L4;
                }
              }
            }
          }
        }
        L5: {
          if (param0 < -106) {
            break L5;
          } else {
            taa.a((byte) -56, 127, 63, -18);
            break L5;
          }
        }
    }

    taa(int param0, int param1) {
        ((taa) this).field_h = param0;
        ((taa) this).field_f = param1;
    }

    final boolean b(int param0) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              L2: {
                if (((taa) this).field_h != 0) {
                  break L2;
                } else {
                  if (!di.field_f[((taa) this).field_f]) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (((taa) this).field_h != 1) {
                  break L3;
                } else {
                  if (wk.field_i[((taa) this).field_f]) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return false;
        }
    }

    final int a(int param0) {
        if (param0 != -13939) {
            ((taa) this).field_f = 74;
        }
        return ((taa) this).field_f;
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = 122 % ((69 - param0) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        eqa discarded$0 = new eqa();
    }
}
