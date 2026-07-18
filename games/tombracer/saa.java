/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class saa extends kna {
    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        fsa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_2_0 = null;
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
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                var5 = null;
                ((saa) this).a(true, (kh) null);
                break L1;
              }
            }
            var4 = new fsa(param2, param0);
            var4.b((byte) -11, ((saa) this).field_k, ((saa) this).field_l);
            var4.l(1, 146366800);
            var4.a((byte) 83, (nv) (Object) new sea(param2, false));
            stackOut_2_0 = (fsa) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("saa.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            boolean discarded$0 = ((saa) this).n((byte) -40);
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "saa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    saa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    saa(la param0, int param1) {
        super(param0, param1);
    }

    final int t(int param0) {
        if (param0 != 8) {
            int discarded$0 = ((saa) this).t(51);
            return 4;
        }
        return 4;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return true;
    }

    static {
    }
}
