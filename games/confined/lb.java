/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends jl {
    private String[] field_w;
    int[] field_s;
    private int[][] field_t;
    static int[] field_u;
    private int[] field_v;

    final void a(int param0, kg param1) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        int var3 = 17 / ((-60 - param0) / 57);
        while (true) {
            var4 = param1.c(32);
            if (-1 == (var4 ^ -1)) {
                break;
            }
            this.a(0, param1, var4);
        }
    }

    private final void a(int param0, kg param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        e var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Confined.field_J ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            int discarded$2 = lb.a(-24, 127);
            break L0;
          }
        }
        L1: {
          if (1 != param2) {
            if (param2 != 2) {
              if (param2 != 3) {
                if ((param2 ^ -1) == -5) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var4 = param1.c(32);
                ((lb) this).field_v = new int[var4];
                ((lb) this).field_t = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param1.a((byte) 25);
                    var7 = jf.a((byte) 126, var6);
                    if (var7 != null) {
                      ((lb) this).field_v[var5] = var6;
                      ((lb) this).field_t[var5] = new int[var7.field_b];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_b > var8) {
                          ((lb) this).field_t[var5][var8] = param1.a((byte) 25);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var4 = param1.c(param0 + 32);
              ((lb) this).field_s = new int[var4];
              var5 = 0;
              L4: while (true) {
                if (var4 <= var5) {
                  break L1;
                } else {
                  ((lb) this).field_s[var5] = param1.a((byte) 25);
                  var5++;
                  continue L4;
                }
              }
            }
          } else {
            ((lb) this).field_w = ij.a(0, '<', param1.d(true));
            break L1;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, double param4, od param5) {
        ti.a(param3 + 24, param0 - -24);
        int var7 = (int)(Math.cos((double)(qn.field_r & 511) * 0.03681553890925539) * 65536.0);
        int var8 = (int)(65536.0 * Math.sin(0.03681553890925539 * (double)(511 & qn.field_r)));
        sk var9 = (sk) (Object) param5.a(96, 455, -var8 / 256, -192, var7 / 256);
        rl.field_u[11] = -var7;
        rl.field_u[9] = -var8;
        if (param1 < 32) {
            return;
        }
        rl.field_u[2] = (int)(param4 * (16.666666666666668 * (double)param2));
        rl.field_u[3] = -var7;
        rl.field_u[5] = var8;
        var9.a(tj.field_A, rl.field_u);
        ti.a();
    }

    public static void e(int param0) {
        field_u = null;
        if (param0 <= 113) {
            field_u = null;
        }
    }

    final String e(byte param0) {
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(null != ((lb) this).field_w)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((lb) this).field_w[0]);
        for (var3 = 1; ((lb) this).field_w.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((lb) this).field_w[var3]);
        }
        var3 = -120 % ((param0 - 12) / 50);
        return var2.toString();
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -423233439;
        param1 = param1 | param1 >>> 675001474;
        param1 = param1 | param1 >>> 1931516868;
        param1 = param1 | param1 >>> 315043560;
        if (param0 != 675001474) {
            int discarded$0 = lb.a(-62, -60);
        }
        param1 = param1 | param1 >>> 750440752;
        return param1 - -1;
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        if (null != ((lb) this).field_s) {
            for (var2 = 0; ((lb) this).field_s.length > var2; var2++) {
                ((lb) this).field_s[var2] = nl.a(((lb) this).field_s[var2], 32768);
            }
        }
        if (param0 != 0) {
            lb.e(93);
        }
    }

    lb() {
    }

    final static void d(int param0) {
        if (param0 > -98) {
            field_u = null;
        }
    }

    final static int c(int param0) {
        if (param0 != -30316) {
            field_u = null;
            return 1;
        }
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
    }
}
