/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends kna {
    static efa field_F;

    final void a(boolean param0, kh param1) {
        if (param0) {
            return;
        }
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "md.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 + 213, 2097152, 2097152);
        this.a((byte) 80, new mka[]{new mka(0, 0, 2097152, 0, 40)});
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = (efa) null;
            return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_F = (efa) null;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        eq var5 = null;
        mfa var6 = null;
        boa var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new fsa(param2, param0);
            var4.b((byte) -11, this.field_k, this.field_l);
            var4.a((byte) -3, 4);
            var4.h(param1, param1 ^ 3);
            var4.e(true, 122);
            var4.g(112, 1);
            var4.b((byte) 17, false);
            var4.a(1, (byte) -12, true);
            var5 = new eq(param2, param0);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (boa) ((Object) var6.a(7, 103));
            var7.b(125, 0);
            var4.a((gr) null, (byte) 124, var7);
            stackOut_0_0 = (fsa) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("md.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final int t(int param0) {
        int discarded$0 = 0;
        if (param0 != 8) {
            discarded$0 = this.t(100);
            return 7;
        }
        return 7;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            md.A(-92);
            return false;
        }
        return false;
    }

    public static void A(int param0) {
        if (param0 < 96) {
            md.A(19);
            field_F = null;
            return;
        }
        field_F = null;
    }

    md(la param0, int param1) {
        super(param0, param1);
    }

    md(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_F = (efa) null;
            return false;
        }
        return false;
    }

    static {
    }
}
