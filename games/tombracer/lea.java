/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lea extends kna {
    static String field_F;

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.n((byte) 87);
            return false;
        }
        return false;
    }

    fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
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
              var4 = new fsa(param2, param0);
              var4.b((byte) -11, this.field_k, this.field_l);
              var4.h(0, 0);
              var4.a(0, (byte) -12, true);
              var4.a((byte) -3, 0);
              var4.b((byte) 17, false);
              var4.e(true, 125);
              if (param1 == 3) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            var4.a(98, true);
            stackIn_3_0 = (fsa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("lea.AC(").append(param0).append(',').append(param1).append(',');

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

    final int t(int param0) {
        if (param0 != 8) {
            return -111;
        }
        return 7;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lea.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void r(byte param0) {
        field_F = null;
        int var1 = 92 / ((-13 - param0) / 58);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    lea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 ^ 14, 2097152, 2097152);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = (String) null;
            return false;
        }
        return false;
    }

    lea(la param0, int param1) {
        super(param0, param1);
    }

    static {
        field_F = "My Best: <%0>";
    }
}
