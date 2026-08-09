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
            if (this == cd.field_s) {
              break L2;
            } else {
              if (this == le.field_a) {
                break L2;
              } else {
                if (qc.field_d != this) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + kl.a(param1, "\n", 0, "%0a"));
        if (param0 != 1) {
            int[] var3 = (int[]) null;
            cf.a(41, (int[]) null, (int[]) null, -115, false);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_e = null;
        int var1 = -94 / ((-6 - param0) / 49);
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, boolean param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (0 < param3) {
              if (-1 <= (param0 ^ -1)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param3 > param0) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    param1[0] = param2[0];
                    param1[-1 + param3] = param2[-1 + param0];
                    if (!param4) {
                      break L1;
                    } else {
                      field_a = 68;
                      break L1;
                    }
                  }
                  var5_int = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = 1;
                  var9 = 1;
                  var10 = 1;
                  L2: while (true) {
                    if (var10 >= param0) {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        var5_int = fj.a(1870096848, var10 * param3 << 668905488, lj.field_j[param0]) >> -69155600;
                        if (var6 >= var5_int) {
                          break L3;
                        } else {
                          L4: {
                            if ((var6 ^ -1) >= -1) {
                              break L4;
                            } else {
                              if (var6 < param3) {
                                param1[var6] = fj.a(1870096848, var7 << 3074576, lj.field_j[var10 - var9]) >> -305275792;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var7 = 0;
                          var6 = var5_int;
                          var8 = 1;
                          break L3;
                        }
                      }
                      if (var5_int == var6) {
                        var7 = var7 + param2[var10];
                        if (var8 != 0) {
                          var9 = var10;
                          var8 = 0;
                          var10++;
                          continue L2;
                        } else {
                          var10++;
                          continue L2;
                        }
                      } else {
                        var10++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("cf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = 50;
        field_b = -1;
    }
}
