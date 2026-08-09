/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    static ao field_a;
    static String field_b;

    final static fq a(ga param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.d((byte) 69);
              if (param1 == 14) {
                break L1;
              } else {
                field_a = (ao) null;
                break L1;
              }
            }
            var3 = param0.g(31365);
            var4 = param0.d((byte) 69);
            stackIn_3_0 = new fq(var2_int, var3, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("oa.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int b(byte param0) {
        if (param0 > -11) {
          field_a = (ao) null;
          return new Date().getYear() + 1900;
        } else {
          return new Date().getYear() + 1900;
        }
    }

    final static void a(int param0) {
        ki.a(26);
        hh.b(param0);
    }

    final static boolean a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -9) {
                break L1;
              } else {
                oa.a(-15);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (-9 >= (var2_int ^ -1)) {
                    break L4;
                  } else {
                    stackIn_11_0 = param1[var2_int];

                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (stackIn_11_0 == 0) {
                        var2_int++;
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("oa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (he.field_a) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var1_int = 0;
                if (param0 > 4) {
                  break L1;
                } else {
                  var6 = (int[]) null;
                  oa.a(114, (int[]) null);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (op.field_m.field_z.length <= var2) {
                      break L4;
                    } else {
                      var3 = op.field_m.field_z[var2];
                      stackIn_20_0 = var3;

                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_20_0 <= 0) {
                            break L5;
                          } else {
                            L6: {
                              var4 = -var3 + op.field_m.a((byte) 32, var2, 750);
                              if (var4 > 50) {
                                var4 = var3;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L7: {
                              stackIn_16_0 = var1_int;

                              if (fb.field_e.field_M != var2) {
                                stackIn_17_0 = stackIn_16_0;
                                stackIn_17_1 = var4 / 20;
                                break L7;
                              } else {
                                stackIn_17_0 = stackIn_16_0;
                                stackIn_17_1 = var4 / 40;
                                break L7;
                              }
                            }
                            var1_int = stackIn_17_0 + stackIn_17_1;
                            break L5;
                          }
                        }
                        var2++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_20_0 = var1_int;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "oa.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_20_0;
        }
    }

    public static void b(int param0) {
        if (param0 != 3732) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = new ao(14, 0, 4, 1);
        field_b = "<%0> has been removed.";
    }
}
