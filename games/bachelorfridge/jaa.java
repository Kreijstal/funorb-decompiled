/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jaa extends bca {
    int field_r;
    static int field_q;
    static int[] field_u;
    int field_t;
    static int field_s;

    final void a(op param0, int param1) {
        try {
            param0.b((byte) 40, 33, this.field_t, this.field_r);
            int var3_int = -24 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jaa.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 > -88) {
            field_u = (int[]) null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    jaa(int param0, nq param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_r = param3;
            this.field_t = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jaa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        cca stackIn_4_0 = null;
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
              stackIn_4_0 = new cca(param1, (jaa) (this));
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

            stackIn_7_1 = new StringBuilder().append("jaa.A(").append(param0).append(',');

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

    jaa(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 49);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (-1 < (var2_int ^ -1)) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_t = param0.b(16711935);
            this.field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jaa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 >= -12) {
            return;
        }
        try {
            super.a((byte) -88, param1);
            param1.d(this.field_t, 0);
            param1.d(this.field_r, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jaa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new int[5];
        field_s = 0;
    }
}
