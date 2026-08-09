/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class saa extends kna {
    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        kh var5 = null;
        fsa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                var5 = (kh) null;
                this.a(true, (kh) null);
                break L1;
              }
            }
            var4 = new fsa(param2, param0);
            var4.b((byte) -11, this.field_k, this.field_l);
            var4.l(1, 146366800);
            var4.a((byte) 83, (nv) (new sea(param2, false)));
            stackIn_3_0 = (fsa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("saa.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            this.n((byte) -40);
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "saa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
            this.t(51);
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
