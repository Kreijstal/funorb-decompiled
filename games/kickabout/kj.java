/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_c;
    int field_a;
    static byte[][] field_b;

    final static void a(int param0, int param1) {
        np.field_Jb.a((gn) (Object) new pv(param1), 3);
    }

    final static ot a(int param0, int param1, up param2, int param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        long var6_long = 0L;
        vs var7 = null;
        int var8 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        ot stackIn_13_0 = null;
        ot stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ot stackOut_20_0 = null;
        boolean stackOut_7_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_8_1 = 0;
        ot stackOut_12_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= 64) {
                var6_long = nj.a(-53);
                if (-bk.field_b + var6_long >= 80L) {
                  if (ra.field_G == null) {
                    bk.field_b = var6_long;
                    ue.field_f[63].a(184, param3, param0, param2, param5, param4);
                    dc.a(63, (byte) 88);
                    stackOut_20_0 = ue.field_f[0].field_h;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                L2: {
                  var7 = ue.field_f[var6_int];
                  if (param0 != var7.field_e) {
                    break L2;
                  } else {
                    if (param4 != var7.field_b) {
                      break L2;
                    } else {
                      if (param3 != var7.field_a) {
                        break L2;
                      } else {
                        if (!var7.field_d.b((byte) -98, param2)) {
                          break L2;
                        } else {
                          L3: {
                            stackOut_7_0 = var7.field_j;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (param5) {
                              stackOut_9_0 = stackIn_9_0;
                              stackOut_9_1 = 0;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              break L3;
                            } else {
                              stackOut_8_0 = stackIn_8_0;
                              stackOut_8_1 = 1;
                              stackIn_10_0 = stackOut_8_0;
                              stackIn_10_1 = stackOut_8_1;
                              break L3;
                            }
                          }
                          if ((stackIn_10_0 ? 1 : 0) != stackIn_10_1) {
                            dc.a(var6_int, (byte) 46);
                            stackOut_12_0 = ue.field_f[0].field_h;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6;
            stackOut_22_1 = new StringBuilder().append("kj.B(").append(param0).append(44).append(0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_21_0;
    }

    final static void a(byte param0) {
        wh discarded$0 = sp.c(44, -96);
        int var1 = 45 % ((param0 - -37) / 58);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    kj(int param0) {
        ((kj) this).field_a = param0;
    }

    public static void b() {
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              on.f(param2, param1, 1 + param4, 10000536);
              on.f(param2, param3 + param1, param4 + 1, 12105912);
              var5_int = 1;
              if (param1 - -var5_int < on.field_e) {
                var5_int = -param1 + on.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param3;
              if (param1 - -var6 <= on.field_h) {
                break L2;
              } else {
                var6 = on.field_h - param1;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 152 + var7 * 48 / param3;
                var9 = var8 | (var8 << 8 | var8 << 16);
                on.field_a[(param1 + var7) * on.field_g - -param2] = var9;
                on.field_a[param4 + (param2 + (var7 + param1) * on.field_g)] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "kj.D(" + 12105912 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Online Auctions";
    }
}
