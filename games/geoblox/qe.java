/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class qe {
    static int field_b;
    static int[] field_c;
    static int field_a;

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, d param4, int param5) {
        RuntimeException var6 = null;
        rj[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        rj[] var10 = null;
        cb var11 = null;
        Object stackIn_7_0 = null;
        Object stackIn_24_0 = null;
        java.awt.Frame stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        java.awt.Frame stackOut_25_0 = null;
        Object stackOut_23_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = Geoblox.field_C;
        try {
          L0: {
            if (param4.b(-26098)) {
              L1: {
                if (param1 != ~param0) {
                  break L1;
                } else {
                  var10 = vi.a(param1 ^ -112, param4);
                  var6_array = var10;
                  if (var6_array != null) {
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
                        L3: {
                          if (param3 != var10[var8].field_d) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (java.awt.Frame) (Object) stackIn_7_0;
                  }
                }
              }
              var11 = param4.a(param2, param1 ^ 1743550127, param5, param0, param3);
              L4: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) var11.field_b;
                  if (var7 != null) {
                    if (var11.field_a != 2) {
                      stackOut_25_0 = (java.awt.Frame) var7;
                      stackIn_26_0 = stackOut_25_0;
                      break L0;
                    } else {
                      jk.a(var7, 10, param4);
                      stackOut_23_0 = null;
                      stackIn_24_0 = stackOut_23_0;
                      return (java.awt.Frame) (Object) stackIn_24_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  bc.a(0, 10L);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("qe.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param5 + 41);
        }
        return stackIn_26_0;
    }

    public static void a(int param0) {
        if (param0 != -8616) {
            qe.a(87);
        }
        field_c = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (ji.field_h == 0) {
                break L1;
              } else {
                if (ji.field_h >= 21) {
                  break L1;
                } else {
                  fa.field_b = fa.field_b + 10;
                  break L1;
                }
              }
            }
            fa.field_b = fa.field_b + 10;
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
          throw t.a((Throwable) (Object) var1, "qe.B(" + 10 + 41);
        }
    }

    final static void a(rh param0, rh param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("qe.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -84 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
