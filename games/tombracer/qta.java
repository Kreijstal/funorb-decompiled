/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qta extends ge {
    qta(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(81, 2097152, 2097152);
    }

    final boolean n(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -122) {
            discarded$0 = this.z(10);
            return true;
        }
        return true;
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            return false;
        }
        return true;
    }

    qta(la param0, int param1) {
        super(param0, param1);
    }

    final boolean B(int param0) {
        boolean discarded$0 = false;
        if (param0 != -23309) {
            discarded$0 = this.z(-114);
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        ska var5 = null;
        roa var6 = null;
        mfa var7 = null;
        boa var8 = null;
        fsa var9 = null;
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
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, this.field_k, this.field_l);
            var9.h(3, param1 ^ param1);
            var9.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new ska(param2, param0);
            var6 = ci.a(1, -1);
            var6.a(param1 ^ -119, true);
            var5.a(var6, (byte) 61);
            this.a((byte) 43, var5, param2);
            var9.a((byte) 83, (nv) (var5));
            var7 = rm.field_a;
            var8 = (boa) ((Object) var7.a(7, param1 ^ 122));
            var8.b(106, 13);
            var9.a(var5, (byte) 124, var8);
            stackOut_0_0 = (fsa) (var9);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("qta.AC(").append(param0).append(',').append(param1).append(',');
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

    final boolean C(int param0) {
        boolean discarded$0 = false;
        if (param0 != 128) {
            discarded$0 = this.z(-65);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        fsa discarded$0 = null;
        if (param0 != 555277520) {
            la var3 = (la) null;
            discarded$0 = this.a(true, -115, (la) null);
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qta.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            kh var3 = (kh) null;
            this.a(false, (kh) null);
            return 7;
        }
        return 7;
    }

    static {
    }
}
