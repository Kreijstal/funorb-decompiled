/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends en {
    static String[] field_e;
    static cn field_f;
    static long[] field_g;
    private wb field_d;

    public static void a(boolean param0) {
        cn discarded$0 = null;
        field_f = null;
        field_e = null;
        field_g = null;
        if (!param0) {
            nh var2 = (nh) null;
            discarded$0 = jf.a(18, (nh) null, -123, (byte) -39);
        }
    }

    private final cn c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        cn var5 = null;
        cn var6 = null;
        if (param0 >= 18) {
          L0: {
            jh.c();
            var2 = 4 + this.field_d.field_c.field_y + la.field_b.b(this.field_d.field_b);
            var3 = la.field_b.field_H - -la.field_b.field_E;
            if (this.field_d.field_c.field_v <= var3) {
              break L0;
            } else {
              var3 = this.field_d.field_c.field_v;
              break L0;
            }
          }
          var5 = new cn(var2, var3);
          var5.e();
          this.field_d.field_c.c(0, la.field_b.field_H - this.field_d.field_c.field_v >> -185047103, this.field_d.field_a);
          la.field_b.b(ck.field_H.a(this.field_d.field_b, (byte) -48), 4 + this.field_d.field_c.field_y, la.field_b.field_H, this.field_d.field_a, -1);
          jh.b();
          return var5;
        } else {
          this.field_d = (wb) null;
          L1: {
            jh.c();
            var2 = 4 + this.field_d.field_c.field_y + la.field_b.b(this.field_d.field_b);
            var3 = la.field_b.field_H - -la.field_b.field_E;
            if (this.field_d.field_c.field_v <= var3) {
              break L1;
            } else {
              var3 = this.field_d.field_c.field_v;
              break L1;
            }
          }
          var6 = new cn(var2, var3);
          var6.e();
          this.field_d.field_c.c(0, la.field_b.field_H - this.field_d.field_c.field_v >> -185047103, this.field_d.field_a);
          la.field_b.b(ck.field_H.a(this.field_d.field_b, (byte) -48), 4 + this.field_d.field_c.field_y, la.field_b.field_H, this.field_d.field_a, -1);
          jh.b();
          return var6;
        }
    }

    final static cn a(int param0, nh param1, int param2, byte param3) {
        RuntimeException var4 = null;
        cn stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        cn stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        cn stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param3 == 41) {
              if (kk.a(param1, 1, param2, param0)) {
                stackOut_6_0 = ff.a((byte) 86);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (cn) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("jf.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (cn) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final void a(int param0, sa param1) {
        cn var3 = null;
        try {
            var3 = this.c((byte) 44);
            param1.a(var3, param0, false, -5, param1.field_y - var3.field_v >> -465314207);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "jf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final cn b(byte param0) {
        int var2 = -24 / ((-58 - param0) / 35);
        return this.c((byte) 25);
    }

    jf(wb param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new String[]{"Immortality", "Deaths are treated as incapacitation."};
        field_g = new long[32];
    }
}
