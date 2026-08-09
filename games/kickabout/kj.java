/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_c;
    int field_a;
    static byte[][] field_b;

    final static void a(int param0, int param1) {
        np.field_Jb.a(new pv(param1), 3);
        if (param0 != 63) {
            field_c = (String) null;
        }
    }

    final static ot a(int param0, int param1, up param2, int param3, int param4, boolean param5) {
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        ot stackIn_13_0 = null;
        ot stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        long var6_long = 0L;
        RuntimeException var6 = null;
        vs var7 = null;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var6_int = param1;
            L1: while (true) {
              if ((var6_int ^ -1) <= -65) {
                var6_long = nj.a(-53);
                if (-bk.field_b + var6_long >= 80L) {
                  if (ra.field_G == null) {
                    bk.field_b = var6_long;
                    ue.field_f[63].a(param1 + 184, param3, param0, param2, param5, param4);
                    dc.a(63, (byte) 88);
                    stackIn_21_0 = ue.field_f[0].field_h;
                    decompiledRegionSelector0 = 1;
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
                            stackIn_9_0 = var7.field_j;

                            if (param5) {
                              stackIn_10_0 = stackIn_9_0;
                              stackIn_10_1 = 0;
                              break L3;
                            } else {
                              stackIn_10_0 = stackIn_9_0;
                              stackIn_10_1 = 1;
                              break L3;
                            }
                          }
                          if ((stackIn_10_0 ? 1 : 0) != stackIn_10_1) {
                            dc.a(var6_int, (byte) 46);
                            stackIn_13_0 = ue.field_f[0].field_h;
                            decompiledRegionSelector0 = 0;
                            break L0;
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
            stackIn_24_0 = (RuntimeException) (var6);

            stackIn_24_1 = new StringBuilder().append("kj.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_21_0;
        }
    }

    final static void a(byte param0) {
        sp.c(44, -96);
        int var1 = 45 % ((param0 - -37) / 58);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    kj(int param0) {
        this.field_a = param0;
    }

    public static void b(byte param0) {
        field_b = (byte[][]) null;
        if (param0 >= -35) {
            field_c = (String) null;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              on.f(param2, param1, 1 + param4, 10000536);
              on.f(param2, param3 + param1, param4 + 1, param0);
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
                var9 = var8 | (var8 << 1054704968 | var8 << -1218881264);
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
          throw nb.a((Throwable) ((Object) var5), "kj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = "Online Auctions";
    }
}
