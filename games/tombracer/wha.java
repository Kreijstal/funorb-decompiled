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
            field_I = (String) null;
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
        hia stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hia stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        fsa stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = new fsa(param2, param0);
              var9.b((byte) -11, this.field_k, this.field_l);
              var9.h(3, 0);
              var9.a(1, (byte) -12, true);
              var9.a((byte) -3, 6);
              var9.b((byte) 17, false);
              var9.g(119, 2);
              var9.a((byte) 83, (nv) (new eq(param2, param0)));
              var5 = new hia(param2, param0);
              if (34 != this.r(12)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_3_0;
              var5.b(11050, var6 != 0);
              stackIn_5_0 = (hia) (var5);

              stackIn_5_1 = param1 + -3;

              if (var6 != 0) {
                stackIn_6_0 = (hia) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = 0;
                break L2;
              } else {
                stackIn_6_0 = (hia) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = 1;
                break L2;
              }
            }
            ((hia) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_6_2 != 0);
            var5.a(false, this.field_F);
            var9.a(var5, param1 ^ param1);
            var7 = rm.field_a;
            var8 = (nq) ((Object) var7.a(16, param1 + 119));
            var8.b(param1 ^ 8021, 0);
            var9.a(var5, (byte) 124, var8);
            stackIn_7_0 = (fsa) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("wha.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 28, wma.a((byte) 8, 4, this.field_F), 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wha.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    wha(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        this.field_F = 131072;
        try {
            this.field_F = ji.a(param2.b((byte) 44, 8), 104, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    wha(la param0, int param1) {
        super(param0, param1);
        this.field_F = 131072;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_J = (dd) null;
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            this.v(-48);
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
        this.b(param0 + 250, 2097152, 2097152);
        this.a((byte) 112, new mka[]{new mka(0, 0, 2097152, 0, 40)});
    }

    public static void r(byte param0) {
        field_J = null;
        field_H = null;
        field_I = null;
        field_K = null;
        field_G = null;
        int var1 = -80 / ((param0 - -32) / 57);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_H = (String) null;
            return true;
        }
        return true;
    }

    static {
        field_H = "<%0> cannot join; the game has started.";
        field_J = new dd(64);
        field_I = "<%0> has not yet unlocked this option for use.";
        field_G = "To <%0>: ";
        field_K = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
