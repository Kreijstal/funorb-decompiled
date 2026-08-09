/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    private int field_b;
    static dg field_d;
    static String field_g;
    static double[][] field_a;
    static int field_f;
    private int field_e;
    private ut field_c;
    static String field_h;

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -14954) {
            break L0;
          } else {
            field_d = (dg) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (op.field_y == null) {
              break L2;
            } else {
              if (jn.field_rb != un.field_c) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(sr param0, int param1, Object[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param3 == 29921) {
                break L1;
              } else {
                ((long[]) (param2[4]))[5] = -61L;
                break L1;
              }
            }
            L2: {
              if (param1 > param4) {
                var5_int = (param4 - -param1) / 2;
                var6 = param4;
                var7 = param2[var5_int];
                param2[var5_int] = param2[param1];
                param2[param1] = var7;
                var8 = param4;
                L3: while (true) {
                  if (var8 >= param1) {
                    param2[param1] = param2[var6];
                    param2[var6] = var7;
                    oh.a(param0, -1 + var6, param2, param3 ^ 0, param4);
                    oh.a(param0, param1, param2, 29921, var6 - -1);
                    break L2;
                  } else {
                    L4: {
                      if ((param0.a(2, param2[var8], var7) ^ -1) >= -1) {
                        var9 = param2[var8];
                        param2[var8] = param2[var6];
                        incrementValue$0 = var6;
                        var6++;
                        param2[incrementValue$0] = var9;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var8++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("oh.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        ql.a(true, wn.field_i, ld.field_a, 3960);
        is.field_a = true;
        if (param0 > -63) {
            field_a = (double[][]) null;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (256 == hw.field_i) {
            this.field_c.c(b.c(-62, this.field_b), go.a(this.field_e, (byte) -56));
        } else {
            var2 = this.field_c.field_o * hw.field_i >> 359249000;
            var3 = hw.field_i * this.field_c.field_v >> -574934456;
            this.field_c.a(b.c(-109, this.field_b), go.a(this.field_e, (byte) -56), var2, var3);
        }
        if (param0 < 106) {
            field_a = (double[][]) null;
        }
    }

    oh(ut param0, int param1, int param2) {
        try {
            this.field_b = param1;
            this.field_c = param0;
            this.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 >= -43) {
            return;
        }
        field_h = null;
        field_d = null;
        field_g = null;
        field_a = (double[][]) null;
    }

    static {
        field_g = "Team Results";
        field_a = new double[][]{new double[]{0.0, 1.0, 1.0}, new double[]{0.7, 1.23, 1.03}, new double[]{0.39, 1.47, 0.95}};
        field_h = "Name";
    }
}
