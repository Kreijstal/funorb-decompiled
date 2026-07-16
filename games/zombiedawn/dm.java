/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends nb {
    static String field_q;
    static String field_s;
    int[] field_u;
    private String[] field_t;
    static int[] field_r;
    private int[] field_v;
    private int[][] field_w;
    static int[] field_p;

    final void a(de param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param1 == 0) {
            break L0;
          } else {
            ((dm) this).field_t = null;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.d((byte) -120);
          if (0 != var3) {
            this.a(param0, var3, -9604);
            continue L1;
          } else {
            return;
          }
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        if (((dm) this).field_u != null) {
            for (var2 = 0; ((dm) this).field_u.length > var2; var2++) {
                ((dm) this).field_u[var2] = hi.a(((dm) this).field_u[var2], 32768);
            }
        }
        if (param0 != -76) {
            field_s = null;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 80) {
            field_q = null;
        }
        uo.a(true, param0 + -28598, param1);
    }

    final String e(int param0) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (!(((dm) this).field_t != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((dm) this).field_t[0]);
        for (var3 = 1; var3 < ((dm) this).field_t.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((dm) this).field_t[var3]);
        }
        return var2.toString();
    }

    dm() {
    }

    public static void d(int param0) {
        field_q = null;
        field_s = null;
        field_r = null;
        if (param0 != 3) {
            dm.a((byte) -123, false);
        }
        field_p = null;
    }

    private final void a(de param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        cg var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          if (param2 == -9604) {
            break L0;
          } else {
            String discarded$1 = ((dm) this).e(58);
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1) == -2) {
            ((dm) this).field_t = de.a('<', param0.a(true), -123);
            break L1;
          } else {
            if (-3 != (param1 ^ -1)) {
              if ((param1 ^ -1) != -4) {
                if ((param1 ^ -1) == -5) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var4 = param0.d((byte) -127);
                ((dm) this).field_v = new int[var4];
                ((dm) this).field_w = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if ((var5 ^ -1) <= (var4 ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      var6 = param0.f(param2 ^ -9602);
                      var7 = cj.a(var6, 0);
                      if (var7 != null) {
                        ((dm) this).field_v[var5] = var6;
                        ((dm) this).field_w[var5] = new int[var7.field_a];
                        var8 = 0;
                        L4: while (true) {
                          if (var7.field_a <= var8) {
                            break L3;
                          } else {
                            ((dm) this).field_w[var5][var8] = param0.f(rd.b(param2, -9602));
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              var4 = param0.d((byte) -122);
              ((dm) this).field_u = new int[var4];
              var5 = 0;
              L5: while (true) {
                if ((var5 ^ -1) <= (var4 ^ -1)) {
                  break L1;
                } else {
                  ((dm) this).field_u[var5] = param0.f(2);
                  var5++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_s = "SHOCKWAVE";
        field_q = "Previous";
        field_p = new int[256];
        field_r = new int[256];
        for (var0 = 0; field_p.length > var0; var0++) {
            field_p[var0] = hi.a(field_p[var0], var0 << -230103472);
            field_p[var0] = hi.a(field_p[var0], var0 / 3 << -1855224600);
        }
        int var1 = 0;
        var0 = var1;
        while (field_r.length > var1) {
            field_r[var1] = hi.a(field_r[var1], var1 << 595492528);
            field_r[var1] = hi.a(field_r[var1], var1 << -235960312);
            field_r[var1] = hi.a(field_r[var1], var1);
            var1++;
        }
    }
}
