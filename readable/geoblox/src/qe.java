/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_b;
    static int[] field_c;
    static int field_a;

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, d param4, int param5) {
        Object stackIn_7_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        rj[] var10 = null;
        cb var11 = null;
        var9 = Geoblox.field_C;
        try {
          L0: {
            if (param4.b(-26098)) {
              L1: {
                if (param1 != (param0 ^ -1)) {
                  break L1;
                } else {
                  var10 = vi.a(param1 ^ -112, param4);
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
                        if (param3 == var10[var8].field_d) {
                          L3: {
                            if (var10[var8].field_f == param2) {
                              L4: {
                                if (param5 == 0) {
                                  break L4;
                                } else {
                                  if (param5 == var10[var8].field_a) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param0 < var10[var8].field_h) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              var7_int = 1;
                              param0 = var10[var8].field_h;
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
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              var11 = param4.a(param2, param1 ^ 1743550127, param5, param0, param3);
              L6: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) (var11.field_b);
                  if (var7 != null) {
                    if (-3 != (var11.field_a ^ -1)) {
                      stackIn_37_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      jk.a(var7, 10, param4);
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  bc.a(0, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var6_ref);

            stackIn_40_1 = new StringBuilder().append("qe.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_35_0);
          } else {
            return stackIn_37_0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -8616) {
            qe.a(87);
        }
        field_c = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (ji.field_h == 0) {
                break L1;
              } else {
                if ((ji.field_h ^ -1) <= -22) {
                  break L1;
                } else {
                  fa.field_b = fa.field_b + 10;
                  break L1;
                }
              }
            }
            fa.field_b = fa.field_b + param0;
            sa.field_b = fa.field_b / 3;
            L2: while (true) {
              if (fa.field_b <= 3 * sa.field_b) {
                break L0;
              } else {
                sa.field_b = sa.field_b + 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "qe.B(" + param0 + ')');
        }
    }

    final static void a(rh param0, rh param1, int param2) {
        try {
            if (param2 > -66) {
                d var4 = (d) null;
                qe.a(91, -118, 58, -45, (d) null, -79);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qe.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[8192];
    }
}
