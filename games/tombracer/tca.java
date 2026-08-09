/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tca extends ra {
    static String field_M;
    static vna field_N;

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eq var5 = null;
        ro var6 = null;
        mfa var7 = null;
        lma var8 = null;
        fsa var9 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, this.field_k, this.field_l);
            var9.h(param1, 0);
            var9.a(1, (byte) -12, true);
            var9.g(param1 ^ 109, 2);
            var9.a((byte) -3, 20);
            var9.b((byte) 17, true);
            var5 = new eq(param2, param0);
            var9.a((byte) 83, (nv) (var5));
            var6 = this.a((byte) 124, param2, param0);
            var9.a(var6, param1 ^ 3);
            var7 = rm.field_a;
            var8 = (lma) ((Object) var7.a(15, 111));
            var9.a((gr) null, (byte) 124, var8);
            stackIn_1_0 = (fsa) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("tca.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tca.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void D(int param0) {
        field_N = null;
        if (param0 != 15) {
            tca.D(-122);
            field_M = null;
            return;
        }
        field_M = null;
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -24;
        }
        return 7;
    }

    final boolean A(int param0) {
        int var2 = 103 % ((param0 - 0) / 60);
        return true;
    }

    tca(la param0, int param1) {
        super(param0, param1);
    }

    tca(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.z(95);
            return true;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
            this.v(46);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            this.s(-76);
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            this.v(-96);
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_N = (vna) null;
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        field_M = "To server list";
        field_N = new vna();
    }
}
