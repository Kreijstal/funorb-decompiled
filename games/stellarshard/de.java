/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static bd field_c;
    static li field_d;
    static th field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 4) {
            de.a(57);
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = stellarshard.field_B;
        if (param0 < param4) {
          if (param0 + 1 >= param3) {
            return;
          } else {
            L0: {
              if (5 + param0 >= param3) {
                break L0;
              } else {
                if (param6 != param2) {
                  var7 = (param1 & (param2 & param6)) + ((param2 >> 1584257153) - -(param6 >> 38940705));
                  var8 = param0;
                  var9 = param6;
                  var10 = param2;
                  var11 = param0;
                  L1: while (true) {
                    if (param3 <= var11) {
                      de.a(param0, param1 ^ 0, var9, var8, param4, param5, param6);
                      de.a(var8, param1 + 0, param2, param3, param4, param5, var10);
                      return;
                    } else {
                      L2: {
                        var12 = fj.field_b[var11];
                        if (!param5) {
                          stackOut_22_0 = vh.field_h[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L2;
                        } else {
                          stackOut_21_0 = se.field_B[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var7 >= var13) {
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
                          fj.field_b[var11] = fj.field_b[var8];
                          if (var9 > var13) {
                            var9 = var13;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        int incrementValue$1 = var8;
                        var8++;
                        fj.field_b[incrementValue$1] = var12;
                        var11++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = param3 + -1;
            L4: while (true) {
              if (var7 <= param0) {
                return;
              } else {
                var8 = param0;
                L5: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = fj.field_b[var8];
                    var10 = fj.field_b[var8 - -1];
                    if (hf.a(var10, param5, var9, (byte) 41)) {
                      fj.field_b[var8] = var10;
                      fj.field_b[1 + var8] = var9;
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
          }
        } else {
          return;
        }
    }

    final static bk a(String param0, int param1) {
        if (param1 >= -16) {
            Object var3 = null;
            bk discarded$0 = de.a((String) null, 4);
        }
        return new bk(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new li(1, 2, 2, 0);
        field_a = new th();
        field_b = new int[4];
    }
}
