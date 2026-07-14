/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vj {
    static cn field_d;
    static String[] field_c;
    static volatile int field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 > -99) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
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
        var14 = EscapeVector.field_A;
        if (param6 < param2) {
          if (param1 > param6 + 1) {
            L0: {
              if (param1 <= param6 - -5) {
                break L0;
              } else {
                if (param3 == param5) {
                  break L0;
                } else {
                  var7 = (param3 >> 1216373889) + (param5 >> -955460319) + (1 & (param5 & param3));
                  var8 = param6;
                  var9 = param3;
                  var10 = param5;
                  if (param0 < -87) {
                    var11 = param6;
                    L1: while (true) {
                      if (var11 >= param1) {
                        vj.a((byte) -109, var8, param2, param3, param4, var9, param6);
                        vj.a((byte) -96, param1, param2, var10, param4, param5, var8);
                        return;
                      } else {
                        L2: {
                          var12 = cd.field_q[var11];
                          if (param4) {
                            stackOut_22_0 = fl.field_k[var12];
                            stackIn_23_0 = stackOut_22_0;
                            break L2;
                          } else {
                            stackOut_21_0 = th.field_v[var12];
                            stackIn_23_0 = stackOut_21_0;
                            break L2;
                          }
                        }
                        var13 = stackIn_23_0;
                        if (var7 < var13) {
                          L3: {
                            cd.field_q[var11] = cd.field_q[var8];
                            if (var9 <= var13) {
                              break L3;
                            } else {
                              var9 = var13;
                              break L3;
                            }
                          }
                          var8++;
                          cd.field_q[var8] = var12;
                          var11++;
                          continue L1;
                        } else {
                          if (var13 > var10) {
                            var10 = var13;
                            var11++;
                            continue L1;
                          } else {
                            var11++;
                            continue L1;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var7 = -1 + param1;
            L4: while (true) {
              if (param6 >= var7) {
                return;
              } else {
                var8 = param6;
                L5: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = cd.field_q[var8];
                    var10 = cd.field_q[var8 - -1];
                    if (ke.a(var9, 2, var10, param4)) {
                      cd.field_q[var8] = var10;
                      cd.field_q[var8 + 1] = var9;
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

    final static void b(int param0) {
        if (param0 < 82) {
            return;
        }
        if (!(bk.field_r == null)) {
            bk.field_r.a((byte) -121);
        }
    }

    abstract void a(n param0, byte param1);

    abstract fk a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new cn();
        field_b = 0;
        field_c = new String[]{"An explosive new campaign, with a compelling storyline", "Destroy the aliens' military infrastructure", "Challenge your piloting skills in Simulator mode"};
        field_a = 0;
    }
}
