/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends nl {
    static boolean field_H;
    static String field_L;
    static int field_J;
    static int field_K;
    private at field_M;
    static String field_N;
    static String[] field_O;
    static long field_I;
    static String field_P;

    public gk() {
        super(0, 0, te.field_l, ij.field_x, (kh) null, (qo) null);
        ((gk) this).field_M = new at();
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((gk) this).field_k != null) {
            ((gk) this).field_k.a((kb) this, param0, -80, true, param1);
        }
        bb var5 = new bb(((gk) this).field_M);
        if (param2 > -82) {
            field_I = -21L;
        }
        kb var6 = (kb) (Object) var5.a(50);
        while (var6 != null) {
            var6.a(((gk) this).field_B + param0, ((gk) this).field_p + param1, (byte) -121, param3);
            var6 = (kb) (Object) var5.b((byte) -112);
        }
    }

    final wl a(byte param0) {
        bb var2 = null;
        wl var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = new bb(((gk) this).field_M);
          if (param0 == 89) {
            break L0;
          } else {
            field_N = null;
            break L0;
          }
        }
        var3 = (wl) (Object) var2.c(param0 + -39);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_L) {
              return var3;
            } else {
              var3 = (wl) (Object) var2.b(50);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void j(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((gk) this).field_M);
        wl var3 = (wl) (Object) var2.c(50);
        while (var3 != null) {
            var3.field_L = false;
            var3 = (wl) (Object) var2.b(50);
        }
        ((gk) this).field_E = null;
        if (param0 >= -85) {
            ((gk) this).d((byte) 125);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == ((gk) this).field_l) {
            if (!(((gk) this).field_w != param1)) {
                return;
            }
        }
        int var4 = (-((gk) this).field_l + param0) / 2;
        int var5 = (-((gk) this).field_w + param1) / 2;
        bb var6 = new bb(((gk) this).field_M);
        wl var7 = (wl) (Object) var6.c(50);
        if (param2 != -14) {
            ((gk) this).a(-19, 39, (byte) 87, 16);
        }
        while (var7 != null) {
            var7.field_p = var7.field_p + var5;
            var7.field_B = var7.field_B + var4;
            var7 = (wl) (Object) var6.b(50);
        }
        ((gk) this).field_l = param0;
        ((gk) this).field_w = param1;
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
            rs.field_t = 2;
            qd.field_G = param1;
            var5 = (CharSequence) (Object) param1;
            wm.field_b = k.a(var5, false);
            hf.field_c = true;
            if (param0 != -23503) {
                gk.a(120, (String) null, 75L);
            }
            dj.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void l(int param0) {
        field_O = null;
        field_P = null;
        field_L = null;
        field_N = null;
    }

    final void d(byte param0) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((gk) this).field_M);
        wl var3 = (wl) (Object) var2.c(50);
        while (var3 != null) {
            if (!(!var3.a((byte) -1))) {
                var3.d(-116);
            }
            var3 = (wl) (Object) var2.b(50);
        }
        ((gk) this).field_E = (kb) (Object) ((gk) this).a((byte) 89);
        int var4 = 94 / ((param0 - 30) / 60);
    }

    final void k(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((gk) this).field_M);
        if (param0 != 0) {
            ((gk) this).field_M = null;
        }
        wl var3 = (wl) (Object) var2.c(50);
        while (var3 != null) {
            if (var3.k(122)) {
                var3.d(param0 + 37);
            }
            var3 = (wl) (Object) var2.b(param0 ^ 50);
        }
    }

    final void a(kb param0, int param1) {
        wl var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 instanceof wl) {
              L1: {
                var3 = (wl) (Object) param0;
                ((gk) this).field_M.a(750, (tc) (Object) var3);
                var3.field_L = true;
                boolean discarded$8 = var3.a(11, (kb) this);
                if (param1 == 0) {
                  break L1;
                } else {
                  ((gk) this).field_M = null;
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("gk.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final kb a(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((gk) this).field_M);
        wl var3 = (wl) (Object) var2.c(50);
        while (var3 != null) {
            if (var3.field_L) {
                return var3.e((byte) 119);
            }
            var3 = (wl) (Object) var2.b(param0 + 1898);
        }
        if (param0 == -1848) {
            return null;
        }
        field_I = -68L;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "First tower";
        field_L = "<%0> and <%1>";
        field_O = new String[]{"zamorak", "saradomin", "guthix"};
        field_P = "Saradomin Strikes Highscores";
    }
}
