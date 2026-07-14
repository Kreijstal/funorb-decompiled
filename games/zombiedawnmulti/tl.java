/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends qa {
    static ld field_t;
    static int field_v;
    private int[][] field_s;
    int[] field_r;
    private String[] field_u;
    private int[] field_q;

    final static boolean d(byte param0) {
        if (param0 != -20) {
            field_v = 88;
        }
        return pd.a(jj.field_M, ql.field_a, param0 + 22);
    }

    final void a(k param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        L0: while (true) {
          var3 = param0.g(31365);
          if (-1 != (var3 ^ -1)) {
            this.a(88, param0, var3);
            continue L0;
          } else {
            L1: {
              if (param1 == 118) {
                break L1;
              } else {
                field_v = -62;
                break L1;
              }
            }
            return;
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(((tl) this).field_r == null)) {
            for (var2 = 0; var2 < ((tl) this).field_r.length; var2++) {
                ((tl) this).field_r[var2] = cr.b(((tl) this).field_r[var2], 32768);
            }
        }
        if (param0 <= 98) {
            ((tl) this).field_u = null;
        }
    }

    final String e(int param0) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((tl) this).field_u == null) {
            return "";
        }
        StringBuilder discarded$8 = var5.append(((tl) this).field_u[0]);
        if (param0 != -18572) {
            return null;
        }
        for (var3 = 1; var3 < ((tl) this).field_u.length; var3++) {
            StringBuilder discarded$9 = var2.append("...");
            StringBuilder discarded$10 = var5.append(((tl) this).field_u[var3]);
        }
        return var2.toString();
    }

    private final void a(int param0, k param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ao var8 = null;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = 3 / ((param0 - -33) / 46);
          if (-2 != param2) {
            if (2 == param2) {
              var5 = param1.g(31365);
              ((tl) this).field_r = new int[var5];
              var6 = 0;
              L1: while (true) {
                if (var6 >= var5) {
                  break L0;
                } else {
                  ((tl) this).field_r[var6] = param1.d((byte) 69);
                  var6++;
                  continue L1;
                }
              }
            } else {
              if (-4 != param2) {
                if ((param2 ^ -1) != -5) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var5 = param1.g(31365);
                ((tl) this).field_s = new int[var5][];
                ((tl) this).field_q = new int[var5];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var5) {
                    break L0;
                  } else {
                    var7 = param1.d((byte) 69);
                    var8 = r.a(var7, (byte) 35);
                    if (var8 != null) {
                      ((tl) this).field_q[var6] = var7;
                      ((tl) this).field_s[var6] = new int[var8.field_f];
                      var9 = 0;
                      L3: while (true) {
                        if (var8.field_f > var9) {
                          ((tl) this).field_s[var6][var9] = param1.d((byte) 69);
                          var9++;
                          continue L3;
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            ((tl) this).field_u = mk.a('<', false, param1.f((byte) -62));
            break L0;
          }
        }
    }

    final static void a(int param0, byte param1, ga param2, int param3, int param4, int param5) {
        if (!(!op.field_m.field_c)) {
            return;
        }
        if (df.field_I) {
            cf.field_s.a(param4, param0, 0, param3, 3, param5);
            return;
        }
        param2.b((byte) -35, 65);
        param2.a(param1 ^ -102, param0);
        param2.a(param5, (byte) -45);
        if (param1 != -11) {
            Object var7 = null;
            tl.a(-103, (byte) 41, (ga) null, -22, 121, -61);
        }
        param2.a(param3, (byte) -110);
        param2.a(param4, (byte) -64);
    }

    public static void f(int param0) {
        field_t = null;
        if (param0 != 32768) {
            field_t = null;
        }
    }

    tl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 65;
    }
}
