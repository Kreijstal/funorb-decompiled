/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oia implements gs {
    kva field_c;
    int field_a;
    static String field_e;
    private static String[] field_d;
    int field_b;

    public final boolean d(byte param0) {
        if (param0 != 48) {
            oia.b(true);
            return this.field_c.d((byte) 48);
        }
        return this.field_c.d((byte) 48);
    }

    public final boolean a(boolean param0, uh param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("oia.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
          this.field_a = -18;
          return this.field_c.c((byte) 103) - -this.field_b;
        } else {
          return this.field_c.c((byte) 103) - -this.field_b;
        }
    }

    public final void a(int param0, iq param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        gr var3 = this.field_c.c(-100);
        if (var3 != null) {
            if (!(var3.a(-101))) {
                return;
            }
        }
        if (param0 < 103) {
            sda var8 = (sda) null;
            oia.a(9, (sda) null, 48);
        }
        ka var4 = this.field_c.a((byte) 9, (oia) (this));
        if (var4 == null) {
            return;
        }
        try {
            var5 = this.b((byte) 69);
            var6 = this.c((byte) 102);
            var7 = this.e((byte) -114);
            gqa.a(0, -83584144, var6, var5, var4, var7);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oia.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
            field_d = (String[]) null;
        }
    }

    public final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return true;
    }

    final static void a(int param0, sda param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        kh var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var6 = ql.field_k;
              var6.k(param0, -2988);
              var6.field_h = var6.field_h + 1;
              var4 = var6.field_h;
              var6.i(1, 0);
              if (null == param1.field_j) {
                var6.i(0, 0);
                break L1;
              } else {
                var6.i(param1.field_j.length, 0);
                var6.a(0, param1.field_j, param1.field_j.length, 105);
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  var6.i(0, 0);
                  break L1;
                }
              }
            }
            var5 = 72 / ((30 - param2) / 34);
            discarded$1 = var6.g(var4, 64);
            var6.field_h = var6.field_h - 4;
            param1.field_l = var6.e(115);
            var6.d(-var4 + var6.field_h, (byte) -110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("oia.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
    }

    public final void f(int param0) {
        int discarded$0 = 0;
        if (param0 != -4366) {
            discarded$0 = this.b((byte) -5);
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          this.field_a = 113;
          return this.field_c.e((byte) -119) - 17825792;
        } else {
          return this.field_c.e((byte) -119) - 17825792;
        }
    }

    public final int b(byte param0) {
        int var2 = 35 / ((param0 - -23) / 53);
        return this.field_c.b((byte) 103) + this.field_a;
    }

    static {
        field_d = new String[2];
        field_d[0] = "Default";
        field_d[1] = "Other";
        field_e = "Next";
    }
}
