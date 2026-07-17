/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static byte[][] field_e;
    private dj field_g;
    static String field_a;
    static byte[][] field_f;
    private dl field_c;
    private dj field_b;
    static boolean[] field_h;
    private dl field_d;

    private final gi a(int param0, int param1, int[] param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gi var8 = null;
        ml var9 = null;
        gi var10 = null;
        gi stackIn_3_0 = null;
        gi stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        gi stackOut_2_0 = null;
        gi stackOut_13_0 = null;
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
            var5_int = param1 ^ ((268439551 & param0) << 4 | param0 >>> 12);
            var5_int = var5_int | param0 << 16;
            var6 = (long)var5_int;
            var8 = (gi) (Object) ((ka) this).field_d.a(var6, 75);
            if (var8 != null) {
              stackOut_2_0 = (gi) var8;
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
                    return null;
                  }
                }
              }
              var9 = ml.a(((ka) this).field_g, param0, param1);
              if (var9 != null) {
                L2: {
                  var10 = var9.b();
                  var8 = var10;
                  ((ka) this).field_d.a(-99, var6, (le) (Object) var8);
                  if (param2 == null) {
                    break L2;
                  } else {
                    param2[0] = param2[0] - var10.field_l.length;
                    break L2;
                  }
                }
                stackOut_13_0 = (gi) var8;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ka.B(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 1 + 41);
        }
        return stackIn_14_0;
    }

    final gi a(int param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        gi stackIn_3_0 = null;
        gi stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        gi stackOut_2_0 = null;
        gi stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (1 == ((ka) this).field_g.d(-1)) {
            int discarded$6 = 1;
            stackOut_2_0 = this.a(0, param0, param2);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            L0: {
              if (!param1) {
                break L0;
              } else {
                var5 = null;
                gi discarded$7 = ((ka) this).a(-25, (int[]) null, -10);
                break L0;
              }
            }
            if (((ka) this).field_g.a((byte) 105, param0) != 1) {
              throw new RuntimeException();
            } else {
              int discarded$8 = 1;
              stackOut_7_0 = this.a(param0, 0, param2);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ka.C(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_h = null;
        field_e = null;
    }

    final gi a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        gi stackIn_3_0 = null;
        gi stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        gi stackOut_2_0 = null;
        gi stackOut_8_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (((ka) this).field_b.d(param0 ^ -1856253637) == 1) {
            stackOut_2_0 = this.a(param2, param1, 0, 117);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            L0: {
              if (param0 == 1856253636) {
                break L0;
              } else {
                ((ka) this).field_d = null;
                break L0;
              }
            }
            if (((ka) this).field_b.a((byte) 82, param2) == 1) {
              stackOut_8_0 = this.a(0, param1, param2, 113);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ka.D(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    private final gi a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gi var8 = null;
        mb var9 = null;
        Object stackIn_2_0 = null;
        gi stackIn_5_0 = null;
        Object stackIn_17_0 = null;
        gi stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        gi stackOut_18_0 = null;
        Object stackOut_16_0 = null;
        gi stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var5_int = param0 ^ (param2 >>> 12 | param2 << 4 & 65531);
            var5_int = var5_int | param2 << 16;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (gi) (Object) ((ka) this).field_d.a(var6, 58);
            if (param3 >= 95) {
              if (var8 == null) {
                L1: {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (param1[0] > 0) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                L2: {
                  var9 = (mb) (Object) ((ka) this).field_c.a(var6, 100);
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9 = mb.a(((ka) this).field_b, param2, param0);
                    if (var9 != null) {
                      ((ka) this).field_c.a(-118, var6, (le) (Object) var9);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                }
                var8 = var9.a(param1);
                if (var8 != null) {
                  var9.b(-27598);
                  ((ka) this).field_d.a(-102, var6, (le) (Object) var8);
                  stackOut_18_0 = (gi) var8;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (gi) (Object) stackIn_17_0;
                }
              } else {
                stackOut_4_0 = (gi) var8;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (gi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("ka.A(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_19_0;
    }

    ka(dj param0, dj param1) {
        ((ka) this).field_c = new dl(256);
        ((ka) this).field_d = new dl(256);
        try {
            ((ka) this).field_g = param0;
            ((ka) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ka.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[250][];
        field_h = new boolean[]{};
    }
}
