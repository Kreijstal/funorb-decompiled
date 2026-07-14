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
        int var1 = -94 / ((-6 - param0) / 49);
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        if (0 < param3) {
          if (-1 <= (param0 ^ -1)) {
            return;
          } else {
            if (param3 > param0) {
              return;
            } else {
              L0: {
                param1[0] = param2[0];
                param1[-1 + param3] = param2[-1 + param0];
                if (!param4) {
                  break L0;
                } else {
                  field_a = 68;
                  break L0;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = 0;
              var8 = 1;
              var9 = 1;
              var10 = 1;
              L1: while (true) {
                if (var10 >= param0) {
                  return;
                } else {
                  L2: {
                    var5 = fj.a(1870096848, var10 * param3 << 668905488, lj.field_j[param0]) >> -69155600;
                    if (var6 >= var5) {
                      break L2;
                    } else {
                      L3: {
                        if ((var6 ^ -1) >= -1) {
                          break L3;
                        } else {
                          if (var6 < param3) {
                            param1[var6] = fj.a(1870096848, var7 << 3074576, lj.field_j[var10 - var9]) >> -305275792;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var7 = 0;
                      var6 = var5;
                      var8 = 1;
                      break L2;
                    }
                  }
                  if (var5 == var6) {
                    var7 = var7 + param2[var10];
                    if (var8 != 0) {
                      var9 = var10;
                      var8 = 0;
                      var10++;
                      continue L1;
                    } else {
                      var10++;
                      continue L1;
                    }
                  } else {
                    var10++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
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
