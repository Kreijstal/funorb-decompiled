/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends uh {
    static String field_v;
    int[] field_D;
    private int[] field_E;
    private int[][] field_u;
    static vh field_A;
    private String[] field_z;
    static he[] field_y;
    static String field_w;
    static boolean field_B;
    static String field_x;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        ja.field_t[gg.field_b] = param3;
        bj.field_a[gg.field_b] = gg.field_b;
        rc.field_i[gg.field_b] = param2;
        if (!(param2 >= cc.field_B)) {
            ha.field_c = param2;
        }
        if (param2 > pf.field_f) {
            mh.field_b = param2;
        }
        fi.field_h[gg.field_b] = param0;
        kk.field_a[gg.field_b] = param4;
        qj.field_d[gg.field_b] = param5;
        int var6 = param4 + param0 - -param5;
        if (param1 > -60) {
            ec discarded$0 = ai.g(-61);
        }
        int var7 = 0 == var6 ? 0 : 1000 * param0 / var6;
        kf.field_c[gg.field_b] = var7;
        if (!(var7 <= mh.field_b)) {
            mh.field_b = var7;
        }
        gg.field_b = gg.field_b + 1;
        if (var7 < ha.field_c) {
            ha.field_c = var7;
        }
    }

    final String i(int param0) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((ai) this).field_z == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ai) this).field_z[0]);
        for (var3 = 1; ((ai) this).field_z.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ai) this).field_z[var3]);
        }
        if (param0 < 120) {
            ((ai) this).a((byte) 20);
        }
        return var2.toString();
    }

    private final void a(od param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sa var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param2 != 1) {
            if ((param2 ^ -1) == -3) {
              var4 = param0.l(31760);
              ((ai) this).field_D = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  ((ai) this).field_D[var5] = param0.j(-788751192);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if ((param2 ^ -1) != -4) {
                if (4 == param2) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param0.l(31760);
                ((ai) this).field_u = new int[var4][];
                ((ai) this).field_E = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    var6 = param0.j(-788751192);
                    var7 = m.a(var6, (byte) 46);
                    if (var7 != null) {
                      ((ai) this).field_E[var5] = var6;
                      ((ai) this).field_u[var5] = new int[var7.field_a];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_a > var8) {
                          ((ai) this).field_u[var5][var8] = param0.j(-788751192);
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
            }
          } else {
            ((ai) this).field_z = ki.a((byte) -123, '<', param0.b((byte) -56));
            break L0;
          }
        }
        L4: {
          if (param1 < -6) {
            break L4;
          } else {
            var10 = null;
            ((ai) this).a((od) null, 90);
            break L4;
          }
        }
    }

    final static ec g(int param0) {
        if (param0 != -29132) {
            ec discarded$0 = ai.g(-85);
        }
        return ie.field_v;
    }

    final void a(byte param0) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = 83 % ((-66 - param0) / 46);
        if (((ai) this).field_D != null) {
            for (var3 = 0; ((ai) this).field_D.length > var3; var3++) {
                ((ai) this).field_D[var3] = li.a(((ai) this).field_D[var3], 32768);
            }
        }
    }

    public static void h(int param0) {
        field_x = null;
        field_A = null;
        if (param0 != -30463) {
            ai.a(0, (byte) -77, 16, -100, 52, 101);
        }
        field_w = null;
        field_v = null;
        field_y = null;
    }

    ai() {
    }

    final void a(od param0, int param1) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (true) {
            var3 = param0.l(31760);
            if (0 == var3) {
                break;
            }
            this.a(param0, param1 ^ -61, var3);
        }
        if (param1 != 0) {
            ((ai) this).a((byte) 112);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Create a free Account";
        field_w = "Create your own free Jagex account";
        field_A = new vh();
        field_x = "Unpacking music";
        field_B = false;
    }
}
