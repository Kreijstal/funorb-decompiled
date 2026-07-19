/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    private vb field_d;
    private int field_g;
    private int field_a;
    static boolean[] field_c;
    private qm field_b;
    static String field_f;
    static String field_e;

    private final void a(long param0, int param1) {
        sh var4 = null;
        if (param1 != 0) {
          this.a(52L, 125);
          var4 = (sh) ((Object) this.field_b.a(-2678, param0));
          this.a(var4, (byte) 20);
          return;
        } else {
          var4 = (sh) ((Object) this.field_b.a(-2678, param0));
          this.a(var4, (byte) 20);
          return;
        }
    }

    private final void a(long param0, Object param1, int param2, int param3) {
        sh var6 = null;
        vk var6_ref = null;
        int var7 = EscapeVector.field_A;
        if (!(param2 <= this.field_a)) {
            throw new IllegalStateException();
        }
        this.a(param0, 0);
        this.field_g = this.field_g - param2;
        while (-1 < (this.field_g ^ -1)) {
            var6 = (sh) ((Object) this.field_d.a((byte) 102));
            this.a(var6, (byte) -113);
        }
        if (param3 != 11261) {
            return;
        }
        try {
            var6_ref = new vk(param1, param2);
            this.field_b.a(param0, (byte) -106, var6_ref);
            this.field_d.a(false, var6_ref);
            ((sh) ((Object) var6_ref)).field_p = 0L;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(Object param0, long param1, byte param2) {
        if (param2 <= 53) {
            return;
        }
        try {
            this.a(param1, param0, 1, 11261);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        if (!param0) {
            field_e = (String) null;
        }
    }

    private final void a(sh param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3_int = 38 / ((param1 - -70) / 38);
            if (param0 != null) {
              param0.c((byte) -94);
              param0.d(117);
              this.field_g = this.field_g + param0.field_q;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("fa.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final Object a(long param0, byte param1) {
        Object var5 = null;
        vk var6 = null;
        sh var7 = null;
        var7 = (sh) ((Object) this.field_b.a(-2678, param0));
        if (var7 != null) {
          if (param1 == -54) {
            var5 = var7.e((byte) 97);
            if (var5 == null) {
              var7.c((byte) -85);
              var7.d(-58);
              this.field_g = this.field_g + var7.field_q;
              return null;
            } else {
              if (var7.d((byte) 120)) {
                var6 = new vk(var5, var7.field_q);
                this.field_b.a(var7.field_e, (byte) -106, var6);
                this.field_d.a(false, var6);
                ((sh) ((Object) var6)).field_p = 0L;
                var7.c((byte) -123);
                var7.d(param1 ^ 25);
                return var5;
              } else {
                this.field_d.a(false, var7);
                var7.field_p = 0L;
                return var5;
              }
            }
          } else {
            return (Object) null;
          }
        } else {
          return null;
        }
    }

    final static ih a(int param0, mf param1, int param2, mf param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        ih stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                fa.a(true);
                break L1;
              }
            }
            if (uc.a(param3, 121, param2, param4)) {
              stackOut_5_0 = qa.a(16826, param1.a(param2, (byte) -97, param4));
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("fa.G(").append(param0).append(',');
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
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ih) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new boolean[7];
        field_f = "Return to Pause Menu";
        field_e = "WARNING: HIGH GRAVITY";
    }
}
