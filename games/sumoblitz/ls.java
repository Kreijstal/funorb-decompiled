/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    int field_k;
    static ls field_b;
    int field_i;
    private int field_f;
    private io field_m;
    static ls field_c;
    static ls field_g;
    static ls field_j;
    static ls field_e;
    static ls field_d;
    static ls field_a;
    static int field_h;
    static String field_l;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Sumoblitz.field_L ? 1 : 0;
        try {
            jl.field_a.b((byte) 105);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                gd.field_k[var1_int] = 0L;
            }
            for (var1_int = param0; var1_int < 32; var1_int++) {
                fa.field_a[var1_int] = 0L;
            }
            vt.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ls.A(" + param0 + 41);
        }
    }

    final static String a(byte param0) {
        return ig.field_a.d(-1);
    }

    final static void a(int param0, int param1, int param2) {
        wr.field_F = param2;
        if (param1 > -42) {
            return;
        }
        ha.field_b = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ls a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0;
        if (var2 == 0) {
          return field_b;
        } else {
          if (var2 != 1) {
            if (var2 != 2) {
              if (var2 == 3) {
                return field_j;
              } else {
                if (var2 == 4) {
                  return field_e;
                } else {
                  if (var2 == 5) {
                    return field_d;
                  } else {
                    if (var2 == 6) {
                      return field_a;
                    } else {
                      return null;
                    }
                  }
                }
              }
            } else {
              return field_g;
            }
          } else {
            return field_c;
          }
        }
    }

    final static void a(float param0, float param1, int param2, int param3, byte[] param4, int param5, float param6, int param7, int param8, int param9, int param10, float param11, ab param12, float param13) {
        RuntimeException var14 = null;
        int var14_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        float[] var24 = null;
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
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 <= -59) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var14_int = param3 * param9;
            var24 = new float[var14_int];
            var16 = 0;
            L2: while (true) {
              if (var16 >= param10) {
                var20 = param2;
                var16 = var20;
                var17 = 0;
                L3: while (true) {
                  if (var14_int <= var17) {
                    break L0;
                  } else {
                    param4[var20] = (byte)(param4[var20] - -127);
                    var20++;
                    var17++;
                    continue L3;
                  }
                }
              } else {
                param12.a(param1 / (float)param9, 0, param11 / (float)param3, param0 / (float)param7, param5, param7, 1, var24, param9, param6 * 127.0f, param3);
                var17 = param2;
                var18 = 0;
                L4: while (true) {
                  if (var14_int <= var18) {
                    param6 = param6 * param13;
                    param1 = param1 * 2.0f;
                    param0 = param0 * 2.0f;
                    param11 = param11 * 2.0f;
                    var16++;
                    continue L2;
                  } else {
                    param4[var17] = (byte)(int)((float)param4[var17] + var24[var18]);
                    var17++;
                    var18++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var14 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var14;
            stackOut_13_1 = new StringBuilder().append("ls.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param12 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param13 + 41);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_b = null;
        field_l = null;
        field_e = null;
        field_c = null;
        field_j = null;
        field_a = null;
    }

    private ls(int param0, int param1, io param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ls) this).field_m = param2;
            ((ls) this).field_f = param1;
            ((ls) this).field_i = param0;
            ((ls) this).field_k = ((ls) this).field_m.field_j * ((ls) this).field_f;
            if (((ls) this).field_i < 16) {
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("ls.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ls(0, 3, io.field_d);
        field_c = new ls(1, 3, io.field_d);
        field_g = new ls(2, 4, io.field_g);
        field_j = new ls(3, 1, io.field_d);
        field_e = new ls(4, 2, io.field_d);
        field_d = new ls(5, 3, io.field_d);
        field_a = new ls(6, 4, io.field_d);
        field_h = mr.a(16, (byte) -115);
        field_l = "Continue";
    }
}
