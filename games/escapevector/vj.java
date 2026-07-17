/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vj {
    static cn field_d;
    static String[] field_c;
    static volatile int field_b;
    static int field_a;

    public static void a() {
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = EscapeVector.field_A;
        try {
          L0: {
            if (param6 < param2) {
              if (param1 > param6 + 1) {
                L1: {
                  if (param1 <= param6 - -5) {
                    break L1;
                  } else {
                    if (param3 == param5) {
                      break L1;
                    } else {
                      var7_int = (param3 >> 1) + (param5 >> 1) + (1 & (param5 & param3));
                      var8 = param6;
                      var9 = param3;
                      var10 = param5;
                      if (param0 < -87) {
                        var11 = param6;
                        L2: while (true) {
                          if (var11 >= param1) {
                            vj.a((byte) -109, var8, param2, param3, param4, var9, param6);
                            vj.a((byte) -96, param1, param2, var10, param4, param5, var8);
                            break L0;
                          } else {
                            L3: {
                              var12 = cd.field_q[var11];
                              if (param4) {
                                stackOut_24_0 = fl.field_k[var12];
                                stackIn_25_0 = stackOut_24_0;
                                break L3;
                              } else {
                                stackOut_23_0 = th.field_v[var12];
                                stackIn_25_0 = stackOut_23_0;
                                break L3;
                              }
                            }
                            L4: {
                              var13 = stackIn_25_0;
                              if (var7_int < var13) {
                                L5: {
                                  cd.field_q[var11] = cd.field_q[var8];
                                  if (var9 <= var13) {
                                    break L5;
                                  } else {
                                    var9 = var13;
                                    break L5;
                                  }
                                }
                                int incrementValue$1 = var8;
                                var8++;
                                cd.field_q[incrementValue$1] = var12;
                                break L4;
                              } else {
                                if (var13 > var10) {
                                  var10 = var13;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                var7_int = -1 + param1;
                L6: while (true) {
                  if (param6 >= var7_int) {
                    return;
                  } else {
                    var8 = param6;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = cd.field_q[var8];
                          var10 = cd.field_q[var8 - -1];
                          if (ke.a(var9, 2, var10, param4)) {
                            cd.field_q[var8] = var10;
                            cd.field_q[var8 + 1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var7, "vj.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
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
