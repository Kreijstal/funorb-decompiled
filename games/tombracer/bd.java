/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends vg {
    int field_f;
    int field_m;
    int field_k;
    int field_n;
    int field_h;
    static nh field_i;
    int[] field_g;
    static String field_j;
    int field_l;

    final static hra a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = param1.length();
        if ((var2 ^ -1) == param0) {
          return is.field_wb;
        } else {
          if (var2 >= -65) {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (var5 == 46) {
                    L1: {
                      if (-1 == (var4 ^ -1)) {
                        break L1;
                      } else {
                        if (var2 + -1 == var4) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return fb.field_c;
                  } else {
                    if ((tl.field_p.indexOf(var5) ^ -1) != 0) {
                      var3 = 0;
                      var4++;
                      continue L0;
                    } else {
                      return fb.field_c;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (-35 == param1.charAt(var2 + -1)) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (34 != var5) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            return fb.field_c;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return fb.field_c;
              }
            }
          } else {
            return rg.field_A;
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 <= 61) {
            field_i = null;
        }
        field_j = null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((bd) this).field_m = param0;
        ((bd) this).field_k = param4;
        ((bd) this).field_g = param1;
        ((bd) this).field_f = param7;
        ((bd) this).field_h = param3;
        ((bd) this).field_n = param5;
        if (param2 < 113) {
            bd.a(-51);
        }
        ((bd) this).field_l = param6;
    }

    bd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Bonus";
    }
}
