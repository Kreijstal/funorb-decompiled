/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends kna {
    static ta field_F;
    private int field_G;
    static String field_H;

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = null;
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            if (param0) {
                field_F = null;
            }
            super.a(param0, param1);
            param1.a((byte) 72, ((kt) this).field_G, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kt.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kt(la param0, int param1) {
        super(param0, param1);
        ((kt) this).field_G = 4;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        pt var5 = null;
        mfa var6 = null;
        nq var7 = null;
        fsa var8 = null;
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
            var8 = new fsa(param2, param0);
            var8.b((byte) -11, ((kt) this).field_k, ((kt) this).field_l);
            var8.h(param1, 0);
            var8.a(1, (byte) -12, true);
            var8.a((byte) -3, 6);
            var8.b((byte) 17, false);
            var8.g(126, 2);
            var8.a((byte) 83, (nv) (Object) new eq(param2, param0));
            var5 = new pt(param2, param0);
            var5.a(8 * ((kt) this).field_G, (byte) 127);
            var8.a((wda) (Object) var5, 0);
            var6 = rm.field_a;
            var7 = (nq) (Object) var6.a(16, param1 ^ 82);
            var7.b(8022, 2);
            var8.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
            stackOut_0_0 = (fsa) var8;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("kt.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void q(byte param0) {
        super.q(param0);
        ((kt) this).b(62, 2097152, 2097152);
        ((kt) this).a((byte) 109, new mka[1]);
    }

    final int t(int param0) {
        if (param0 != 8) {
            Object var3 = null;
            ((kt) this).a(true, (kh) null);
            return 7;
        }
        return 7;
    }

    kt(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((kt) this).field_G = 4;
        try {
            ((kt) this).field_G = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void A() {
        field_H = null;
        field_F = null;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            Object var3 = null;
            ((kt) this).a(true, (kh) null);
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Service unavailable";
    }
}
