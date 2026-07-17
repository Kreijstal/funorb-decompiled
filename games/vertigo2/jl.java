/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    private li field_c;
    static String field_f;
    private int field_i;
    private li field_d;
    static String[] field_a;
    static String field_h;
    private int field_b;
    static er field_g;
    private li[] field_e;

    final void a(li param0, long param1, boolean param2) {
        if (param0.field_a != null) {
            param0.c(2);
        }
        li var5 = ((jl) this).field_e[(int)(param1 & (long)(((jl) this).field_b - 1))];
        param0.field_c = var5;
        param0.field_a = var5.field_a;
        param0.field_a.field_c = param0;
        if (param2) {
            return;
        }
        try {
            param0.field_k = param1;
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "jl.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(r param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jp var5 = null;
        int[] var6 = null;
        int var7 = 0;
        mi var8 = null;
        int var9 = 0;
        mi var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new mi(param0.a("logo.fo3d", "", 0));
            var10 = var8;
            var3 = var10.h(-11);
            var10.p(0);
            wc.field_o = ng.a((byte) -108, var10);
            jg.field_j = new int[var3][];
            cg.field_b = new jp[var3];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var10.b((byte) -71);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = cg.field_b[var9];
                    var5.a(6, (byte) -121, 6, 6, 1);
                    var5.a((byte) 117);
                    var6 = new int[]{var5.field_S - -var5.field_D >> 1, var5.field_E + var5.field_t >> 1, var5.field_B - -var5.field_k >> 1};
                    jg.field_j[var9] = var6;
                    var5.a(-var6[1], -var6[2], -var6[0], 126);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                int discarded$1 = 1;
                cg.field_b[var4] = di.a(var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("jl.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + -85 + 41);
        }
    }

    final li b(int param0) {
        ((jl) this).field_i = param0;
        return ((jl) this).c(-115);
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_h = null;
        field_g = null;
    }

    final li c(int param0) {
        li var2 = null;
        int var3 = 0;
        Object var4 = null;
        li var5 = null;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          if (param0 < -9) {
            break L0;
          } else {
            var4 = null;
            int discarded$4 = jl.a((qj) null, (qj) null, (byte) -49);
            break L0;
          }
        }
        L1: {
          if (((jl) this).field_i <= 0) {
            break L1;
          } else {
            if (((jl) this).field_c == ((jl) this).field_e[-1 + ((jl) this).field_i]) {
              break L1;
            } else {
              var2 = ((jl) this).field_c;
              ((jl) this).field_c = var2.field_c;
              return var2;
            }
          }
        }
        L2: while (true) {
          if (((jl) this).field_i < ((jl) this).field_b) {
            int fieldTemp$5 = ((jl) this).field_i;
            ((jl) this).field_i = ((jl) this).field_i + 1;
            var5 = ((jl) this).field_e[fieldTemp$5].field_c;
            var2 = var5;
            if (var5 != ((jl) this).field_e[-1 + ((jl) this).field_i]) {
              ((jl) this).field_c = var2.field_c;
              return var2;
            } else {
              continue L2;
            }
          } else {
            return null;
          }
        }
    }

    final static int a(qj param0, qj param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var3_int = -22 / ((-54 - param2) / 34);
            var4 = null;
            stackOut_0_0 = wn.a(false, 0, param0, 0, (String) null, false, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("jl.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    final li a(long param0, byte param1) {
        li var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 != 64) {
            li discarded$0 = ((jl) this).c(127);
        }
        li var4 = ((jl) this).field_e[(int)((long)(((jl) this).field_b - 1) & param0)];
        ((jl) this).field_d = var4.field_c;
        while (((jl) this).field_d != var4) {
            if (!(param0 != ((jl) this).field_d.field_k)) {
                var5 = ((jl) this).field_d;
                ((jl) this).field_d = ((jl) this).field_d.field_c;
                return var5;
            }
            ((jl) this).field_d = ((jl) this).field_d.field_c;
        }
        ((jl) this).field_d = null;
        return null;
    }

    jl(int param0) {
        int var2 = 0;
        li var3 = null;
        ((jl) this).field_i = 0;
        ((jl) this).field_b = param0;
        ((jl) this).field_e = new li[param0];
        for (var2 = 0; var2 < param0; var2++) {
            li dupTemp$0 = new li();
            var3 = dupTemp$0;
            ((jl) this).field_e[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_c = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Show current player position", "Show current player cell", "Show FPS", "Show memory usage", "Show prediciton data", "Draw keyout packets", "Draw authoritative game", "Draw authoritative and predicted game", "Display player details", "Ignore auth version of game", "Display player animation"};
        field_h = "Played";
        field_f = "You are not currently logged in to the<nbsp>game.";
    }
}
