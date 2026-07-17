/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cf {
    static ka field_c;
    static Calendar field_e;
    static int field_f;
    static rk field_d;
    static int field_a;
    static int field_b;

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 668905488) {
            break L0;
          } else {
            field_f = 71;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == (Object) (Object) cd.field_s) {
              break L2;
            } else {
              if (this == (Object) (Object) le.field_a) {
                break L2;
              } else {
                if ((Object) (Object) qc.field_d != this) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + kl.a(param1, "\n", 0, "%0a"));
        if (param0 != 1) {
            Object var3 = null;
            cf.a(41, (int[]) null, (int[]) null, -115, false);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_e = null;
        int var1 = -47;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (0 < param3) {
              if (param0 <= 0) {
                return;
              } else {
                if (param3 > param0) {
                  return;
                } else {
                  param1[0] = param2[0];
                  param1[-1 + param3] = param2[-1 + param0];
                  var5_int = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = 1;
                  var9 = 1;
                  var10 = 1;
                  L1: while (true) {
                    if (var10 >= param0) {
                      break L0;
                    } else {
                      L2: {
                        var5_int = fj.a(1870096848, var10 * param3 << 16, lj.field_j[param0]) >> 16;
                        if (var6 >= var5_int) {
                          break L2;
                        } else {
                          L3: {
                            if (var6 <= 0) {
                              break L3;
                            } else {
                              if (var6 < param3) {
                                param1[var6] = fj.a(1870096848, var7 << 16, lj.field_j[var10 - var9]) >> 16;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var7 = 0;
                          var6 = var5_int;
                          var8 = 1;
                          break L2;
                        }
                      }
                      L4: {
                        if (var5_int != var6) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var10++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("cf.D(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = 50;
        field_b = -1;
    }
}
