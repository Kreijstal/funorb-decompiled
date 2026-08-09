/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wfa extends kna {
    static String field_G;
    static byte[] field_F;

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.t(13);
            return true;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            wfa.r((byte) -56);
            return 7;
        }
        return 7;
    }

    wfa(la param0, int param1) {
        super(param0, param1);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public static void r(byte param0) {
        field_G = null;
        field_F = null;
        if (param0 >= -97) {
            field_G = (String) null;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            if (param0) {
                kh var4 = (kh) null;
                this.a(true, (kh) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wfa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(117, 4194304, 4194304);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        rea var5 = null;
        mfa var6 = null;
        dc var7 = null;
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
            var4.a((byte) -3, 20);
            var4.h(param1, param1 ^ 3);
            var4.b((byte) 17, true);
            var4.a(4, (byte) -12, true);
            var5 = new rea(param2, param0);
            var5.a(50, 8, param1 ^ 2, 25, 6);
            var5.b((byte) 72, true);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (dc) ((Object) var6.a(11, 114));
            var4.a(var5, (byte) 124, var7);
            stackIn_1_0 = (fsa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("wfa.AC(").append(param0).append(',').append(param1).append(',');

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

    final static boolean a(boolean param0, int param1, kh param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = (kh) (param2);

              stackIn_2_1 = -128;

              if (param0) {
                stackIn_3_0 = (kh) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              } else {
                stackIn_3_0 = (kh) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              }
            }
            ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
            var3_int = -96 % ((param1 - 62) / 35);
            stackIn_4_0 = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wfa.SB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    wfa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_G = "Walk into these mirrors holding <img=8><img=9> to drag them around. Reflect carefully before handling dangerous laser beams.";
        field_F = new byte[520];
    }
}
