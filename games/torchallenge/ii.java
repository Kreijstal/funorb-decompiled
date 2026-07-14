/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String[] field_g;
    static boolean field_e;
    private w field_l;
    static boolean field_d;
    static int field_a;
    static ka[] field_h;
    static int field_i;
    static qe field_k;
    static int field_c;
    private w field_b;
    static int[][] field_j;
    static int[][] field_f;

    final int a(boolean param0) {
        int var2 = 0;
        w var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
          return -18;
        } else {
          var2 = 0;
          var3 = ((ii) this).field_l.field_k;
          L0: while (true) {
            if (((ii) this).field_l == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_k;
              continue L0;
            }
          }
        }
    }

    final w a(int param0) {
        w var2 = ((ii) this).field_l.field_k;
        if (param0 != 25777) {
            int discarded$9 = ((ii) this).a(false);
            if (!(var2 != ((ii) this).field_l)) {
                ((ii) this).field_b = null;
                return null;
            }
            ((ii) this).field_b = var2.field_k;
            return var2;
        }
        if (!(var2 != ((ii) this).field_l)) {
            ((ii) this).field_b = null;
            return null;
        }
        ((ii) this).field_b = var2.field_k;
        return var2;
    }

    public static void b(int param0) {
        if (param0 != 16711680) {
          ii.a(-113, -60, 120, -92, 0, 96);
          field_h = null;
          field_j = null;
          field_g = null;
          field_f = null;
          field_k = null;
          return;
        } else {
          field_h = null;
          field_j = null;
          field_g = null;
          field_f = null;
          field_k = null;
          return;
        }
    }

    final w c(int param0) {
        w var2 = null;
        var2 = ((ii) this).field_l.field_k;
        if (var2 != ((ii) this).field_l) {
          if (param0 != -1) {
            field_f = null;
            var2.a(12695);
            return var2;
          } else {
            var2.a(12695);
            return var2;
          }
        } else {
          return null;
        }
    }

    final w d(int param0) {
        w var2 = null;
        var2 = ((ii) this).field_b;
        if (((ii) this).field_l != var2) {
          ((ii) this).field_b = var2.field_k;
          if (param0 < 12) {
            int discarded$2 = ((ii) this).a(false);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ii) this).field_b = null;
          return null;
        }
    }

    final void a(w param0, int param1) {
        Object var4 = null;
        L0: {
          if (param0.field_i != null) {
            param0.a(12695);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_i = ((ii) this).field_l.field_i;
        param0.field_k = ((ii) this).field_l;
        param0.field_i.field_k = param0;
        param0.field_k.field_i = param0;
        if (param1 != 3329) {
          var4 = null;
          ((ii) this).a((w) null, 42);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = TorChallenge.field_F ? 1 : 0;
          if (qg.field_a <= param4) {
            break L0;
          } else {
            param0 = param0 - (-param4 + qg.field_a);
            param4 = qg.field_a;
            break L0;
          }
        }
        L1: {
          if (qg.field_k <= param5) {
            break L1;
          } else {
            param1 = param1 - (-param5 + qg.field_k);
            param5 = qg.field_k;
            break L1;
          }
        }
        L2: {
          if (qg.field_c >= param4 - -param0) {
            break L2;
          } else {
            param0 = -param4 + qg.field_c;
            break L2;
          }
        }
        L3: {
          if (param1 + param5 <= qg.field_l) {
            break L3;
          } else {
            param1 = -param5 + qg.field_l;
            break L3;
          }
        }
        if (0 < param0) {
          if (0 < param1) {
            var6 = param4 - -(param5 * qg.field_g);
            var7 = qg.field_g - param0;
            if (param3 != 4) {
              return;
            } else {
              param5 = -param1;
              L4: while (true) {
                if (-1 >= (param5 ^ -1)) {
                  return;
                } else {
                  param4 = -param0;
                  L5: while (true) {
                    if (0 <= param4) {
                      var6 = var6 + var7;
                      param5++;
                      continue L4;
                    } else {
                      var8 = qg.field_i[var6];
                      if ((255 & var8 >> 1796256872) > param2) {
                        if ((var8 & 65280) >> -1727660024 >= (var8 & 16711680) >> 367754512) {
                          L6: {
                            var9 = ((var8 & 16711680) >> 1541911855) + -60;
                            if (var9 > 255) {
                              var9 = 255;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = 65280 & -(var10 >> 1489192997) + (var10 >> -1525050015);
                          var11 = 31 & var8 >> 330182819;
                          qg.field_i[var6] = p.a(p.a(var9 << 154227376, var10), var11);
                          var6++;
                          param4++;
                          continue L5;
                        } else {
                          var6++;
                          param4++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        param4++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public ii() {
        ((ii) this).field_l = new w();
        ((ii) this).field_l.field_k = ((ii) this).field_l;
        ((ii) this).field_l.field_i = ((ii) this).field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_i = 0;
        field_d = false;
        field_j = new int[][]{new int[2], new int[2], new int[2]};
        field_f = new int[4][];
    }
}
