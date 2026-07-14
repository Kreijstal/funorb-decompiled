/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static String field_f;
    static int field_d;
    static String[] field_c;
    static vh field_e;
    static String field_g;
    private String field_i;
    static int[] field_l;
    static char field_b;
    static int[] field_k;
    static int field_j;
    static String field_a;
    static int[][] field_h;

    final static int b(int param0) {
        if (param0 < 6) {
            field_a = null;
        }
        return -kk.field_z + gp.field_c;
    }

    final boolean a(String param0, byte param1) {
        if (param1 < 46) {
            return false;
        }
        return ((ml) this).field_i.equals((Object) (Object) param0);
    }

    final void a(java.applet.Applet param0, boolean param1) {
        if (!param1) {
            field_a = null;
        }
        nn.a(31536000L, (byte) -120, param0, ((ml) this).field_i, "jagex-last-login-method");
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -26458) {
            int discarded$0 = ml.b(65);
        }
        field_k = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_f = null;
        field_l = null;
    }

    ml(String param0) {
        ((ml) this).field_i = param0;
    }

    final static void a(int param0, byte param1, int param2, int param3, dd param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        L0: {
          var20 = Pool.field_O;
          var6 = (param5 + -param0 << -631634488) / param4.field_w;
          var7 = (param0 << -1496650264) + param4.field_G * var6;
          param2 = param2 + param4.field_G;
          param3 = param3 + param4.field_B;
          var8 = param2 - -(qh.field_l * param3);
          var9 = 0;
          var10 = param4.field_A;
          var11 = param4.field_z;
          var12 = qh.field_l + -var11;
          var13 = 0;
          if (param3 < qh.field_c) {
            var14 = -param3 + qh.field_c;
            var8 = var8 + var14 * qh.field_l;
            var9 = var9 + var11 * var14;
            param3 = qh.field_c;
            var10 = var10 - var14;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var10 + param3 <= qh.field_g) {
            break L1;
          } else {
            var10 = var10 - (-qh.field_g + (var10 + param3));
            break L1;
          }
        }
        L2: {
          if (param2 < qh.field_b) {
            var14 = -param2 + qh.field_b;
            param2 = qh.field_b;
            var8 = var8 + var14;
            var13 = var13 + var14;
            var9 = var9 + var14;
            var11 = var11 - var14;
            var7 = var7 + var6 * var14;
            var12 = var12 + var14;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2 + var11 > qh.field_j) {
            var14 = param2 + (var11 + -qh.field_j);
            var12 = var12 + var14;
            var13 = var13 + var14;
            var11 = var11 - var14;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 >= var11) {
            break L4;
          } else {
            if (-1 > (var10 ^ -1)) {
              L5: {
                if (param1 >= 44) {
                  break L5;
                } else {
                  var21 = null;
                  ml.a(26, (byte) 106, -29, 66, (dd) null, 59);
                  break L5;
                }
              }
              param3 = -var10;
              L6: while (true) {
                if ((param3 ^ -1) <= -1) {
                  return;
                } else {
                  var14 = var7;
                  param2 = -var11;
                  L7: while (true) {
                    if ((param2 ^ -1) <= -1) {
                      var9 = var9 + var13;
                      var8 = var8 + var12;
                      param3++;
                      continue L6;
                    } else {
                      var15 = var14 >> 1055885800;
                      var14 = var14 + var6;
                      var16 = 256 - var15;
                      if ((var15 ^ -1) > -1) {
                        var9++;
                        var8++;
                        param2++;
                        continue L7;
                      } else {
                        var9++;
                        var17 = param4.field_D[var9];
                        if (0 != var17) {
                          if (-256 <= (var15 ^ -1)) {
                            var18 = qh.field_d[var8];
                            var19 = 16711935 & var16 * (var18 & 16711935) - -((var17 & 16711935) * var15) >> 1867130248;
                            qh.field_d[var8] = var19 - -rb.b(65280, rb.b(var17, 65280) * var15 + var16 * rb.b(var18, 65280) >> 170034888);
                            var8++;
                            param2++;
                            continue L7;
                          } else {
                            qh.field_d[var8] = var17;
                            var8++;
                            param2++;
                            continue L7;
                          }
                        } else {
                          var8++;
                          param2++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    final static void a(int param0, oj param1, int param2) {
        ta.field_i.b((byte) -31, (ma) (Object) param1);
        if (param0 != 25756) {
            return;
        }
        ch.a(false, param1, param2);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Elapsed time";
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = "<%0>, would you like to <u>play</u> the next shot or <u>pass</u> and make your opponent play?";
        field_l = new int[12];
        field_k = new int[]{8};
        field_a = "Show";
        field_h = new int[][]{new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4]};
    }
}
