/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends jj {
    private vn[] field_n;
    static ea field_o;
    static int field_m;

    final static void a(tf[] param0, int param1, tf[] param2, int param3, jl param4, int param5, int param6, jl param7, int param8, int param9, byte param10, int param11, int param12, int param13, int param14, int param15, tf[] param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          L0: {
            vc.a(param17, param12, param9, new sb(param2), param14, new sb(param16), param8, param11, param13, param7, param5, param18, param3, new sb(param0), param19, param4, (byte) 119, param15, param20, param6, param1);
            var21_int = -40 / ((-41 - param10) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("da.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    da(String param0, tf[] param1) {
        super(param0, param1);
        try {
            this.d(-14116);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5 = kb.field_N;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                L2: {
                  if (param0 < -87) {
                    break L2;
                  } else {
                    field_m = -103;
                    break L2;
                  }
                }
                break L0;
              } else {
                incrementValue$8 = var2;
                var2++;
                var5[incrementValue$8] = 0;
                incrementValue$9 = var2;
                var2++;
                var5[incrementValue$9] = 0;
                incrementValue$10 = var2;
                var2++;
                var5[incrementValue$10] = 0;
                incrementValue$11 = var2;
                var2++;
                var5[incrementValue$11] = 0;
                incrementValue$12 = var2;
                var2++;
                var5[incrementValue$12] = 0;
                incrementValue$13 = var2;
                var2++;
                var5[incrementValue$13] = 0;
                incrementValue$14 = var2;
                var2++;
                var5[incrementValue$14] = 0;
                incrementValue$15 = var2;
                var2++;
                var5[incrementValue$15] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "da.F(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -13) {
            da.b((byte) 16);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final void a(boolean param0) {
        vn[] var2;
        int var3;
        vn var4;
        int var5;
        vn[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        jg.field_H.f(0, 0);
        var6 = this.field_n;
        var2 = var6;
        if (!param0) {
          var3 = 0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.a((byte) 123);
              var3++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_m = -17;
          var3 = 0;
          L1: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.a((byte) 123);
              var3++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void c(int param0) {
        vn[] var2;
        int var3;
        vn var4;
        int var5;
        vn[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        var6 = this.field_n;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var3 < var6.length) {
            var4 = var6[var3];
            var4.a(param0 + 127);
            var3++;
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void d(int param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        this.field_n = new vn[5];
        var2 = 0;
        if (param0 != -14116) {
          field_o = (ea) null;
          L0: while (true) {
            if (this.field_n.length > var2) {
              this.field_n[var2] = new vn(100 * var2);
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (this.field_n.length > var2) {
              this.field_n[var2] = new vn(100 * var2);
              var2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static int a(byte[] param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param2;
            if (param1 >= 98) {
              L1: while (true) {
                if (param3 <= var5) {
                  var4_int = var4_int ^ -1;
                  stackIn_7_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4_int = var4_int >>> -300237336 ^ dm.field_zb[255 & (var4_int ^ param0[var5])];
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -86;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("da.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_o = new ea(0);
    }
}
