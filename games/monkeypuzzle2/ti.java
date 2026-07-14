/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_a;

    final static int a(int param0, de param1, int param2, d param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (null == param1.field_i) {
              break L0;
            } else {
              if (param3 == null) {
                break L0;
              } else {
                if (param1.field_k != param3.field_m) {
                  break L0;
                } else {
                  var4 = param3.field_f.length;
                  var5 = param1.field_i[param2].length / var4;
                  var6 = param0;
                  L1: while (true) {
                    if (var6 >= var5) {
                      return -1;
                    } else {
                      if (param3.field_g == param1.field_p[param2][var6]) {
                        if (f.a(-15189, param1.field_g[param2][var6])) {
                          var7 = 0;
                          L2: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param1.field_i[param2][var6 * var4 + var7] == param3.field_f[var7]) {
                                var6 = var6;
                                var7++;
                                continue L2;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final static void a(int param0, boolean param1) {
        bb.field_a.b(16564, param1);
        if (param0 != 0) {
            Object var3 = null;
            int discarded$0 = ti.a(72, (de) null, -117, (d) null);
        }
    }

    static {
    }
}
