/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static wb field_a;
    private mf field_e;
    private mf field_d;
    static String field_c;
    private ib field_b;
    private ib field_g;
    static te[] field_f;

    private final hh a(int[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hh var8 = null;
        in var9 = null;
        Object stackIn_2_0 = null;
        hh stackIn_6_0 = null;
        Object stackIn_14_0 = null;
        hh stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_5_0 = null;
        Object stackOut_13_0 = null;
        hh stackOut_19_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            var5_int = (param2 << 4 & 65522 | param2 >>> 12) ^ param3;
            if (param1 > 14) {
              var5_int = var5_int | param2 << 16;
              var6 = 4294967296L ^ (long)var5_int;
              var8 = (hh) (Object) ((ec) this).field_g.a(var6, -1);
              if (var8 != null) {
                stackOut_5_0 = (hh) var8;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                L1: {
                  if (param0 == null) {
                    break L1;
                  } else {
                    if (0 < param0[0]) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                L2: {
                  var9 = (in) (Object) ((ec) this).field_b.a(var6, -1);
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9 = in.a(((ec) this).field_e, param2, param3);
                    if (var9 != null) {
                      ((ec) this).field_b.a((hg) (Object) var9, 10901, var6);
                      break L2;
                    } else {
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      return (hh) (Object) stackIn_14_0;
                    }
                  }
                }
                var8 = var9.a(param0);
                if (var8 != null) {
                  var9.c((byte) -27);
                  ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                  stackOut_19_0 = (hh) var8;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("ec.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_20_0;
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -39;
        field_c = null;
        field_f = null;
    }

    private final hh a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hh var8 = null;
        kj var9 = null;
        Object var10 = null;
        hh var11 = null;
        hh stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        hh stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        hh stackOut_16_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5_int = param3 ^ (param1 << 4 & 65533 | param1 >>> 12);
            var5_int = var5_int | param1 << 16;
            var6 = (long)var5_int;
            var8 = (hh) (Object) ((ec) this).field_g.a(var6, -1);
            if (var8 != null) {
              stackOut_2_0 = (hh) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2[0] > 0) {
                    break L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (hh) (Object) stackIn_7_0;
                  }
                }
              }
              var9 = kj.a(((ec) this).field_d, param1, param3);
              if (var9 != null) {
                L2: {
                  if (param0 == 1158948012) {
                    break L2;
                  } else {
                    var10 = null;
                    hh discarded$2 = this.a(-13, 124, (int[]) null, 13);
                    break L2;
                  }
                }
                L3: {
                  var11 = var9.a();
                  var8 = var11;
                  ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                  if (param2 != null) {
                    param2[0] = param2[0] - var11.field_h.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_16_0 = (hh) var8;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (hh) (Object) stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("ec.C(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
        return stackIn_17_0;
    }

    final hh a(int param0, byte param1, int param2) {
        if (param1 != -128) {
          ((ec) this).field_d = null;
          return this.a((int[]) null, (byte) 18, param0, param2);
        } else {
          return this.a((int[]) null, (byte) 18, param0, param2);
        }
    }

    final hh a(byte param0, int param1, int param2) {
        if (param0 <= 44) {
          ((ec) this).field_e = null;
          return this.a(1158948012, param2, (int[]) null, param1);
        } else {
          return this.a(1158948012, param2, (int[]) null, param1);
        }
    }

    ec(mf param0, mf param1) {
        ((ec) this).field_b = new ib(256);
        ((ec) this).field_g = new ib(256);
        try {
            ((ec) this).field_e = param1;
            ((ec) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ec.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email is valid";
    }
}
