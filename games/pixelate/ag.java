/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends mg {
    static boolean field_p;
    static String field_n;
    static java.math.BigInteger field_m;
    static String field_o;

    final dj a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        dj stackIn_3_0 = null;
        dj stackIn_6_0 = null;
        dj stackIn_11_0 = null;
        dj stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!td.a(-106, var4)) {
              stackIn_3_0 = sk.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1) {
                L1: {
                  var5 = (CharSequence) ((Object) param0);
                  var3_int = na.a(var5, (byte) -33);
                  if (-1 <= (var3_int ^ -1)) {
                    break L1;
                  } else {
                    if ((var3_int ^ -1) >= -131) {
                      stackIn_13_0 = qk.field_g;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_11_0 = sk.field_a;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = (dj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ag.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    ag(c param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -76) {
              if (this.a(param1, true) == sk.field_a) {
                stackIn_6_0 = mc.field_t;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ag.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void e(int param0) {
        field_n = null;
        field_m = null;
        field_o = null;
        if (param0 == -1) {
            return;
        }
        ag.a((byte) -3, -69);
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        lc var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (lc) ((Object) rg.field_c.c(1504642273));
              if (param0 < -112) {
                break L1;
              } else {
                field_p = true;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                em.a((byte) -7, var4, param1);
                var4 = (lc) ((Object) rg.field_c.f(1504642273));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ag.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_n = "This password contains repeated characters, and would be easy to guess";
        field_m = new java.math.BigInteger("65537");
        field_o = "Searching for opponents";
    }
}
