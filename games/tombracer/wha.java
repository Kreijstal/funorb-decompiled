/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wha extends kna {
    static String field_H;
    static dd field_J;
    private int field_F;
    static String field_G;
    static String field_I;
    static String[] field_K;

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_I = null;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        hia var5 = null;
        int var6 = 0;
        mfa var7 = null;
        nq var8 = null;
        fsa var9 = null;
        int stackIn_3_0 = 0;
        hia stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hia stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hia stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        fsa stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        hia stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hia stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        hia stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        fsa stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var9 = new fsa(param2, param0);
              var9.b((byte) -11, ((wha) this).field_k, ((wha) this).field_l);
              var9.h(3, 0);
              var9.a(1, (byte) -12, true);
              var9.a((byte) -3, 6);
              var9.b((byte) 17, false);
              var9.g(119, 2);
              var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
              var5 = new hia(param2, param0);
              if (34 != ((wha) this).r(12)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_3_0;
              var5.b(11050, var6 != 0);
              stackOut_3_0 = (hia) var5;
              stackOut_3_1 = param1 + -3;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (var6 != 0) {
                stackOut_5_0 = (hia) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                break L2;
              } else {
                stackOut_4_0 = (hia) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                break L2;
              }
            }
            ((hia) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_6_2 != 0);
            var5.a(false, ((wha) this).field_F);
            var9.a((wda) (Object) var5, param1 ^ param1);
            var7 = rm.field_a;
            var8 = (nq) (Object) var7.a(16, param1 + 119);
            var8.b(param1 ^ 8021, 0);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
            stackOut_6_0 = (fsa) var9;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("wha.AC(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 28, wma.a((byte) 8, 4, ((wha) this).field_F), 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wha.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    wha(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((wha) this).field_F = 131072;
        try {
            ((wha) this).field_F = ji.a(param2.b((byte) 44, 8), 104, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wha.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    wha(la param0, int param1) {
        super(param0, param1);
        ((wha) this).field_F = 131072;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_J = null;
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((wha) this).v(-48);
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -65;
        }
        return 7;
    }

    final void q(byte param0) {
        super.q(param0);
        ((wha) this).b(param0 + 250, 2097152, 2097152);
        ((wha) this).a((byte) 112, new mka[1]);
    }

    public static void r(byte param0) {
        field_J = null;
        field_H = null;
        field_I = null;
        field_K = null;
        field_G = null;
        int var1 = -80;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_H = null;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<%0> cannot join; the game has started.";
        field_J = new dd(64);
        field_I = "<%0> has not yet unlocked this option for use.";
        field_G = "To <%0>: ";
        field_K = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
