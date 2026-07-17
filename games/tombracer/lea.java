/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lea extends kna {
    static String field_F;

    final boolean s(int param0) {
        if (param0 != -15254) {
            boolean discarded$0 = ((lea) this).n((byte) 87);
            return false;
        }
        return false;
    }

    fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
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
              var4 = new fsa(param2, param0);
              var4.b((byte) -11, ((lea) this).field_k, ((lea) this).field_l);
              var4.h(0, 0);
              var4.a(0, (byte) -12, true);
              var4.a((byte) -3, 0);
              var4.b((byte) 17, false);
              var4.e(true, 125);
              if (param1 == 3) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            var4.a(98, true);
            stackOut_2_0 = (fsa) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("lea.AC(").append(param0).append(44).append(param1).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
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
            throw tba.a((Throwable) (Object) runtimeException, "lea.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void r() {
        field_F = null;
        int var1 = 92;
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
        ((lea) this).b(param0 ^ 14, 2097152, 2097152);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = null;
            return false;
        }
        return false;
    }

    lea(la param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "My Best: <%0>";
    }
}
