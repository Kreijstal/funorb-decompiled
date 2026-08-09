/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends kna {
    static boolean field_F;

    ve(la param0, int param1) {
        super(param0, param1);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        mfa var5 = null;
        am var6 = null;
        gaa var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fsa(param2, param0);
            var4.b((byte) -11, this.field_k, this.field_l);
            var4.a((byte) -3, 5);
            var5 = rm.field_a;
            var6 = (am) ((Object) var5.a(4, 80));
            var6.b(1, (byte) 77);
            var4.a((gr) null, (byte) 124, var6);
            var7 = (gaa) ((Object) var5.a(5, 88));
            var7.a(64, 119);
            var7.a(true, 16633231);
            var7.b(1, 96);
            var7.a(0, param1, 1, true);
            var4.a((gr) null, (byte) 124, var7);
            stackIn_1_0 = (fsa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ve.AC(").append(param0).append(',').append(param1).append(',');

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
            if (param0) {
                field_F = true;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ve.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -121;
        }
        return 7;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_F = false;
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 + 29, 2097152, 2097152);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            kh var3 = (kh) null;
            this.a(true, (kh) null);
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            la var3 = (la) null;
            this.a(true, 119, (la) null);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            la var3 = (la) null;
            this.a(false, -64, (la) null);
            return false;
        }
        return false;
    }

    ve(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_F = false;
    }
}
