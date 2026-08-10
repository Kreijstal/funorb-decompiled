/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static int field_c;
    static int[] field_d;
    static int[] field_a;
    static String field_e;
    static int field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 92) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, int param4, be param5) {
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        db[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        db[] var10 = null;
        eb var11 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param5.b((byte) -100)) {
              L1: {
                if ((param1 ^ -1) == param3) {
                  var10 = a.a(param5, -119);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (var10[var8].field_d == param0) {
                          L3: {
                            if (var10[var8].field_b == param4) {
                              L4: {
                                if (param2 == 0) {
                                  break L4;
                                } else {
                                  if (param2 == var10[var8].field_a) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param1 < var10[var8].field_e) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              param1 = var10[var8].field_e;
                              var7_int = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param5.a(param1, param0, param2, param3 + 28253, param4);
              L6: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) (var11.field_g);
                  if (var7 != null) {
                    if (-3 != (var11.field_a ^ -1)) {
                      stackIn_37_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      tj.a(param5, var7, -23144);
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  hb.a(10L, param3 + 122);
                  continue L6;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var6_ref);

            stackIn_40_1 = new StringBuilder().append("m.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_32_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_35_0);
              } else {
                return stackIn_37_0;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        bm.field_d.a((byte) 82, param1, 0);
    }

    static {
        field_d = new int[12];
        field_d[1] = 1;
        field_d[4] = 5000;
        field_d[5] = 1000;
        field_d[3] = 5000;
        field_d[6] = 1;
        field_d[7] = 10;
        field_d[10] = 10;
        field_d[8] = 1;
        field_d[2] = 10;
        field_d[11] = 5000;
        field_d[0] = 1;
        field_d[9] = 10;
        field_e = "Unpacking music";
    }
}
