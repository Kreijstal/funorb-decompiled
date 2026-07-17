/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class g extends tj {
    private rl field_l;
    static int field_n;
    static wg field_m;
    static int field_o;

    final sc a(int param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        sc stackIn_8_0 = null;
        sc stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_7_0 = null;
        sc stackOut_11_0 = null;
        sc stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (!(((g) this).field_l instanceof nd)) {
                  break L1;
                } else {
                  var3 = ((nd) (Object) ((g) this).field_l).a((byte) -106);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.b((byte) 124) != rh.field_p) {
                      stackOut_7_0 = ni.field_b;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (!param1.equals((Object) (Object) ((g) this).field_l.field_u)) {
                  stackOut_11_0 = ni.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = rh.field_p;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (sc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("g.H(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    public static void e() {
        field_m = null;
    }

    final static boolean f() {
        return gf.a(0, kk.c(-14047));
    }

    final String a(byte param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (!(((g) this).field_l instanceof nd)) {
                break L1;
              } else {
                var3 = ((nd) (Object) ((g) this).field_l).a((byte) 125);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b((byte) 122) != rh.field_p) {
                      break L2;
                    } else {
                      if (!param1.equals((Object) (Object) ((g) this).field_l.field_u)) {
                        stackOut_5_0 = re.field_cb;
                        stackIn_6_0 = stackOut_5_0;
                        return stackIn_6_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_7_0 = var3.a((byte) 82);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            L3: {
              if (param0 == -126) {
                break L3;
              } else {
                var4 = null;
                sc discarded$2 = ((g) this).a(-64, (String) null);
                break L3;
              }
            }
            if (!param1.equals((Object) (Object) ((g) this).field_l.field_u)) {
              stackOut_13_0 = re.field_cb;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("g.F(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    final static void a(int param0, int param1) {
        cc[] var2 = null;
        cc var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        cc var4 = null;
        int var5 = 0;
        cc[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            oc.field_e = param0;
            var6 = th.field_o;
            var2 = var6;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var6.length) {
                L2: {
                  if (param1 > 49) {
                    break L2;
                  } else {
                    field_m = null;
                    break L2;
                  }
                }
                L3: {
                  var2_ref = th.field_o[9];
                  if (!var2_ref.a(false)) {
                    var2_ref.c(0);
                    wj.field_j.a((lk) (Object) var2_ref);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var4 = var6[var3];
                  var2_ref = var4;
                  var2_ref = var4;
                  if (var4 == null) {
                    break L4;
                  } else {
                    var4.f(param0 * 128 / 256);
                    break L4;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2_ref2, "g.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        nc var4 = null;
        sj var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (nc) (Object) ok.field_b.a(true);
            L1: while (true) {
              if (var4 == null) {
                var5 = (sj) (Object) il.field_b.a(true);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    uh.a(var5, (byte) -123, 3);
                    var5 = (sj) (Object) il.field_b.f(2);
                    continue L2;
                  }
                }
              } else {
                ga.a(var4, 3, 74);
                var4 = (nc) (Object) ok.field_b.f(2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "g.K(" + 3 + 44 + -39 + 41);
        }
    }

    g(rl param0, rl param1) {
        super(param0);
        try {
            ((g) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 5;
    }
}
