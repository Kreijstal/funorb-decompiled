/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v implements eh {
    static int field_f;
    static String field_d;
    static long field_a;
    private long field_b;
    static boolean field_e;
    static int[] field_g;
    static String field_c;

    final static void e() {
        if (!ge.field_D) {
            throw new IllegalStateException();
        }
        bc.field_d = true;
        wg.a(-101, true);
        rl.field_N = 0;
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param3.indexOf('_', var8_int);
                  if (var8_int >= 0) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param3.indexOf('_', var9);
              if (var10 >= 0) {
                StringBuilder discarded$3 = var8.append(param3.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$4 = var8.append(param2);
                continue L3;
              } else {
                StringBuilder discarded$5 = var8.append(param3.substring(var9));
                stackOut_11_0 = var8.toString();
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("v.S(").append(95).append(44).append(-31).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0;
    }

    abstract ud f(int param0);

    public final void a(int param0) {
        int var2 = 68 / ((-9 - param0) / 50);
        ((v) this).field_b = qg.a(false);
    }

    public final ud a(byte param0) {
        if (((v) this).b(24685)) {
            return c.field_a;
        }
        if (!(qg.a(false) >= ((v) this).field_b - -350L)) {
            return lh.field_x;
        }
        int var2 = 35 / ((param0 - 55) / 49);
        return ((v) this).f(38);
    }

    public static void d(int param0) {
        field_g = null;
        field_d = null;
        field_c = null;
    }

    public final String c(int param0) {
        if (!((v) this).b(24685)) {
          if (qg.a(false) >= 350L + ((v) this).field_b) {
            if (param0 != 15914) {
              ((v) this).field_b = 72L;
              return ((v) this).b((byte) 22);
            } else {
              return ((v) this).b((byte) 22);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String b(byte param0);

    final static short[] a(int param0, short[] param1, la param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_18_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 >= 26) {
              var4_int = param2.d(0, 16);
              if (0 != var4_int) {
                L1: {
                  L2: {
                    if (param1 == null) {
                      break L2;
                    } else {
                      if (var4_int != param1.length) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param1 = new short[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param2.d(0, 4);
                  var6 = (short)param2.d(0, 16);
                  if (var5 <= 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param1[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param1[var7] = (short)(var6 + param2.d(0, var5));
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (short[]) param1;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("v.U(").append(16).append(44);
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
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param3 + 41);
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Just play";
        field_a = 0L;
        field_g = new int[]{6, 6, 9, 9, 18, 18};
        field_c = "Loading fonts";
    }
}
