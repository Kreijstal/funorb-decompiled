/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vha extends bca {
    final void a(op param0, int param1) {
        try {
            this.a(param0, (byte) -2);
            int var3_int = 93 / ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vha.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        nma stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = new nma(param1, (vha) (this));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (at) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("vha.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (at) ((Object) stackIn_4_0);
        }
    }

    vha(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_k = param0.e((byte) 55);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (-1 < (var2_int ^ -1)) {
                break L0;
              } else {
                this.field_o.a(dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("vha.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    vha(int param0, nq param1) {
        super(param0, param1);
    }

    final static pp b(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        pp stackIn_2_0 = null;
        cn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -114) {
              var2 = qi.a(param0, (byte) 85);
              var3 = param0.b(16711935);
              var4 = param0.b(16711935);
              stackIn_4_0 = new cn(var2, var3, var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("vha.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (pp) ((Object) stackIn_4_0);
        }
    }

    static {
    }
}
