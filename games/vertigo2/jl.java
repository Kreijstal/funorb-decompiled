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
        param0.field_k = param1;
        param0.field_c.field_a = param0;
    }

    final static void a(r param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        jp var5 = null;
        int[] var6 = null;
        int var7 = 0;
        mi var8 = null;
        int var9 = 0;
        mi var10 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        var8 = new mi(param0.a("logo.fo3d", "", 0));
        var10 = var8;
        var3 = var10.h(-11);
        var10.p(0);
        wc.field_o = ng.a((byte) -108, var10);
        jg.field_j = new int[var3][];
        cg.field_b = new jp[var3];
        var4 = 0;
        L0: while (true) {
          if (var3 <= var4) {
            var10.b((byte) -71);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var3 <= var9) {
                L2: {
                  if (param1 < -73) {
                    break L2;
                  } else {
                    field_a = null;
                    break L2;
                  }
                }
                return;
              } else {
                var5 = cg.field_b[var9];
                var5.a(6, (byte) -121, 6, 6, 1);
                var5.a((byte) 117);
                var6 = new int[]{var5.field_S - -var5.field_D >> -1488729247, var5.field_E + var5.field_t >> 478319713, var5.field_B - -var5.field_k >> 1507211681};
                jg.field_j[var9] = var6;
                var5.a(-var6[1], -var6[2], -var6[0], 126);
                var9++;
                continue L1;
              }
            }
          } else {
            cg.field_b[var4] = di.a(var8, true);
            var4++;
            continue L0;
          }
        }
    }

    final li b(int param0) {
        ((jl) this).field_i = param0;
        return ((jl) this).c(-115);
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_h = null;
        field_g = null;
        if (param0 != 6) {
            field_h = null;
        }
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
            int discarded$2 = jl.a((qj) null, (qj) null, (byte) -49);
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
            ((jl) this).field_i = ((jl) this).field_i + 1;
            var5 = ((jl) this).field_e[((jl) this).field_i].field_c;
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
        int var3 = -22 / ((-54 - param2) / 34);
        Object var4 = null;
        return wn.a(false, 0, param0, 0, (String) null, false, param1);
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
            var3 = new li();
            ((jl) this).field_e[var2] = new li();
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
