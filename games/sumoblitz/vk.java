/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String[] field_b;
    int field_a;
    private fr field_c;
    static String field_d;
    static boolean field_e;

    protected final void finalize() throws Throwable {
        ((vk) this).field_c.a(((vk) this).field_a, (byte) 113);
        super.finalize();
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        if (param4 > param5) {
          if (param3 > 1 + param5) {
            L0: {
              if (param3 <= param5 - -5) {
                break L0;
              } else {
                if (param0 == param1) {
                  break L0;
                } else {
                  var7 = (param0 & param1 & 1) + (param0 >> 429166529) - -(param1 >> 1439930241);
                  var8 = param5;
                  var9 = param1;
                  var10 = param0;
                  var11 = param5;
                  L1: while (true) {
                    if (param3 <= var11) {
                      vk.a(var9, param1, param2, var8, param4, param5, param6);
                      vk.a(param0, var10, (byte) -107, param3, param4, var8, param6);
                      return;
                    } else {
                      L2: {
                        var12 = pd.field_q[var11];
                        if (!param6) {
                          stackOut_20_0 = uc.field_c[var12];
                          stackIn_21_0 = stackOut_20_0;
                          break L2;
                        } else {
                          stackOut_19_0 = lj.field_a[var12];
                          stackIn_21_0 = stackOut_19_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_21_0;
                      if (var13 <= var7) {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        L3: {
                          pd.field_q[var11] = pd.field_q[var8];
                          if (var13 < var9) {
                            var9 = var13;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        pd.field_q[var8] = var12;
                        var11++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param3;
            L4: while (true) {
              if (var7 <= param5) {
                return;
              } else {
                var8 = param5;
                L5: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = pd.field_q[var8];
                    var10 = pd.field_q[1 + var8];
                    if (jl.a(var10, var9, param6, (byte) 98)) {
                      pd.field_q[var8] = var10;
                      pd.field_q[var8 + 1] = var9;
                      var8++;
                      continue L5;
                    } else {
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (param0 > -31) {
            vk.a(-31);
        }
        qr.field_c = new jn();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 429166529) {
            vk.a(100, 10, (byte) 96, 17, -1, -25, true);
        }
        field_d = null;
    }

    vk(fr param0, int param1, int param2) {
        ((vk) this).field_a = param2;
        ((vk) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Placing enemies...", "Placing terrain..."};
        field_d = null;
    }
}
