/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends to {
    static String[] field_v;
    static int field_u;

    public static void d(byte param0) {
        int var1 = 81 / ((19 - param0) / 47);
        field_v = null;
    }

    private sh(int param0, int param1, int param2, int param3, ir param4, no param5, ea param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((sh) this).field_s = param6;
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        this.a(param0, param1, param2, param3, param4, param5);
        hg var8 = mm.field_a;
        hg var7 = var8;
        if (var8 != null) {
            if (!((sh) this).a(param2, param1, param5 ^ -122, param0, param3)) {
            } else {
                if (!(((sh) this).field_o instanceof ma)) {
                    // ifeq L125
                    ((ma) ((hg) var8).field_o).a(var8, -16073, (sh) this);
                    mm.field_a = null;
                } else {
                    ((ma) ((sh) this).field_o).a(var8, -16073, (sh) this);
                    mm.field_a = null;
                }
            }
        }
    }

    final static wu a(dl param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        wu var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var2 = param0.b((byte) 81, 8);
        if (var2 <= 0) {
          if (param1 == -14) {
            L0: {
              var3 = tn.a(83, param0) ? 1 : 0;
              var4 = tn.a(-64, param0) ? 1 : 0;
              var5 = new wu();
              var5.field_r = (short)param0.b((byte) 87, 16);
              var5.field_z = ua.a(param0, ((wu) var5).field_z, 0, 16);
              var5.field_P = ua.a(param0, ((wu) var5).field_P, param1 + 14, 16);
              var5.field_F = ua.a(param0, ((wu) var5).field_F, 0, 16);
              var5.field_K = (short)param0.b((byte) 119, 16);
              var5.field_I = ua.a(param0, ((wu) var5).field_I, param1 + 14, 16);
              var5.field_t = ua.a(param0, ((wu) var5).field_t, 0, 16);
              var5.field_m = ua.a(param0, ((wu) var5).field_m, 0, 16);
              if (var3 == 0) {
                break L0;
              } else {
                var5.field_q = (short)param0.b((byte) 83, 16);
                var5.field_H = ua.a(param0, ((wu) var5).field_H, 0, 16);
                var5.field_L = ua.a(param0, ((wu) var5).field_L, 0, 16);
                var5.field_n = ua.a(param0, ((wu) var5).field_n, param1 ^ -14, 16);
                var5.field_B = ua.a(param0, ((wu) var5).field_B, 0, 16);
                var5.field_g = ua.a(param0, ((wu) var5).field_g, param1 + 14, 16);
                var5.field_D = ua.a(param0, ((wu) var5).field_D, 0, 16);
                break L0;
              }
            }
            L1: {
              if (var4 == 0) {
                break L1;
              } else {
                int discarded$1 = param0.b((byte) 84, 16);
                var5.field_G = ua.a(param0, ((wu) var5).field_G, param1 ^ -14, 16);
                var5.field_d = ua.a(param0, ((wu) var5).field_d, 0, 16);
                var5.field_y = ua.a(param0, ((wu) var5).field_y, 0, 16);
                var5.field_C = ua.a(param0, ((wu) var5).field_C, param1 + 14, 16);
                var5.field_v = ua.a(param0, ((wu) var5).field_v, 0, 16);
                break L1;
              }
            }
            L2: {
              if (!tn.a(122, param0)) {
                break L2;
              } else {
                var5.field_u = ua.a(param0, ((wu) var5).field_u, param1 + 14, 16);
                break L2;
              }
            }
            L3: {
              if (!tn.a(83, param0)) {
                break L3;
              } else {
                var5.field_x = ao.a(param0, ((wu) var5).field_x, true, 16);
                var6 = 0;
                var7 = 0;
                L4: while (true) {
                  if (var7 >= ((wu) var5).field_x.length) {
                    if (0 == var6) {
                      var5.field_x = null;
                      break L3;
                    } else {
                      var5.field_f = (byte)(var6 + 1);
                      break L3;
                    }
                  } else {
                    if (var6 < (((wu) var5).field_x[var7] & 255)) {
                      var6 = 255 & ((wu) var5).field_x[var7];
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              }
            }
            return var5;
          } else {
            return (wu) null;
          }
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_u = 640;
    }
}
