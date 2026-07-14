/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static hh field_c;
    static int field_g;
    static int[] field_e;
    static int field_b;
    static int field_f;
    static int field_a;
    static hl field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 < 115) {
            Object var2 = null;
            vi.a((gi) null, 47);
        }
        field_c = null;
        field_e = null;
    }

    final static void a(gi param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        if (param1 == 3) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= 3) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= hf.field_b) {
                  mf.field_l[param0.b(108)] = mf.field_l[param0.b(108)] + 1;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (hf.field_b <= var3) {
                      hf.field_b = var2;
                      hf.field_b = hf.field_b + 1;
                      qm.field_d[hf.field_b] = param0;
                      return;
                    } else {
                      L3: {
                        if (qm.field_d[var3].field_a == param0.field_a) {
                          var4 = qm.field_d[var3].b(47);
                          if (mf.field_l[var4] <= mn.field_k) {
                            break L3;
                          } else {
                            mf.field_l[var4] = mf.field_l[var4] - 1;
                            var3++;
                            continue L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var2++;
                      qm.field_d[var2] = qm.field_d[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  if (qm.field_d[var2].field_a == param0.field_a) {
                    mf.field_l[qm.field_d[var2].b(param1 ^ 83)] = mf.field_l[qm.field_d[var2].b(param1 ^ 83)] + 1;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              mf.field_l[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, String param1, vl param2, wl param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = EscapeVector.field_A;
          if (!param4) {
            break L0;
          } else {
            vi.a(-80);
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (param1.length() <= var7) {
            return;
          } else {
            L2: {
              var8 = param1.charAt(var7);
              if (var8 == 60) {
                var6 = (var5 >> 1475913832) + param2.field_b[0] + param3.b(param1.substring(0, var7));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((var6 ^ -1) == 0) {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param2.field_b[var7] = param2.field_b[0] + ((var5 >> -1285790584) - -param3.b(param1.substring(0, 1 + var7))) + -param3.a((char) var8);
                break L3;
              } else {
                param2.field_b[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_f = 2;
    }
}
