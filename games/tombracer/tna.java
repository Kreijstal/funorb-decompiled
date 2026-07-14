/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tna extends loa {
    static String field_d;
    static ph[] field_c;
    static vna field_e;
    static String field_b;
    static int field_f;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, gqa param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ara.field_xb) {
                L2: {
                  if (param0 == 16599) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                baa.field_b[param1.a(false)] = baa.field_b[param1.a(false)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= ara.field_xb) {
                    ara.field_xb = var2;
                    ara.field_xb = ara.field_xb + 1;
                    wea.field_d[ara.field_xb] = param1;
                    return;
                  } else {
                    L4: {
                      if (param1.field_d == wea.field_d[var3].field_d) {
                        var4 = wea.field_d[var3].a(false);
                        if (sd.field_K >= baa.field_b[var4]) {
                          break L4;
                        } else {
                          baa.field_b[var4] = baa.field_b[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    wea.field_d[var2] = wea.field_d[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (wea.field_d[var2].field_d == param1.field_d) {
                  baa.field_b[wea.field_d[var2].a(false)] = baa.field_b[wea.field_d[var2].a(false)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            baa.field_b[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    tna(qea param0) {
        super(param0);
    }

    final void a(int param0, int param1, hj param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param1 < 73) {
            Object var8 = null;
            ((tna) this).a(-107, 127, (hj) null, -114);
        }
        for (var5 = 1; param2.field_f + -1 > var5; var5++) {
            for (var6 = 1; var6 < param2.field_a - 1; var6++) {
                param2.a(var6, 0, 0, var5);
            }
        }
        this.a(0, param2.field_f, 0, param2, param2.field_a, 1);
    }

    private final void a(int param0, int param1, int param2, hj param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        if (-6 < (param1 ^ -1)) {
          return;
        } else {
          if (5 > param4) {
            return;
          } else {
            var7 = (((tna) this).field_a.a(param1 / 2 + -1, 0) + param5) * 2 + param2;
            var8 = param0 - (-(2 * ((tna) this).field_a.a(-1 + param4 / 2, 0)) + -2);
            var9 = param2 - -1;
            L0: while (true) {
              if (var9 >= param1 + param2 + -1) {
                var9 = param0 - -1;
                L1: while (true) {
                  if (-1 + param4 + param0 <= var9) {
                    L2: {
                      var9 = ((tna) this).field_a.a(4, param5 ^ 1);
                      if (var9 == 0) {
                        break L2;
                      } else {
                        param3.a(param0 + 2 * (((tna) this).field_a.a(var8 + -param0, 0) / 2) - -1, 0, 0, var7);
                        break L2;
                      }
                    }
                    L3: {
                      if (1 == var9) {
                        break L3;
                      } else {
                        param3.a(var8, 0, 0, param2 + (((tna) this).field_a.a(-param2 + var7, param5 ^ 1) / 2 * 2 + 1));
                        break L3;
                      }
                    }
                    L4: {
                      if (2 != var9) {
                        param3.a(2 * (((tna) this).field_a.a(-1 + (param0 - -param4 + -var8), 0) / 2) + var8 + 1, 0, 0, var7);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (-4 != (var9 ^ -1)) {
                        param3.a(var8, 0, 0, 1 + ((tna) this).field_a.a(-1 + param2 + (param1 - var7), 0) / 2 * 2 + var7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.a(param0, -param2 + (var7 + 1), param2, param3, var8 + 1 + -param0, 1);
                    this.a(param0, param2 - -param1 + -var7, var7, param3, var8 + (1 + -param0), 1);
                    this.a(var8, -param2 + (var7 + 1), param2, param3, param0 + (param4 - var8), param5 + 0);
                    this.a(var8, param2 - (-param1 + var7), var7, param3, -var8 + (param0 - -param4), param5 ^ 0);
                    return;
                  } else {
                    param3.a(var9, 1, param5 ^ 1, var7);
                    var9++;
                    continue L1;
                  }
                }
              } else {
                param3.a(var8, 1, param5 ^ 1, var9);
                var9++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You have completed the free content of Tomb Racer, to play a further 5 worlds become a member at FunOrb.com.";
        field_e = new vna();
        field_b = "Connecting to<br>friend server...";
    }
}
