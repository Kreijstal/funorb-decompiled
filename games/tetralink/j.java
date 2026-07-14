/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends gb {
    static int[] field_x;
    static int field_u;
    private int[] field_y;
    private int[][] field_z;
    static String field_t;
    int[] field_v;
    private String[] field_w;

    public static void f(int param0) {
        if (param0 != 4) {
            field_u = 52;
        }
        field_x = null;
        field_t = null;
    }

    private final void a(int param0, int param1, bh param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        db var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        if (param1 < -38) {
          L0: {
            if (1 != param0) {
              if (param0 == 2) {
                var4 = param2.d((byte) -99);
                ((j) this).field_v = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    ((j) this).field_v[var5] = param2.e(127);
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (-4 == (param0 ^ -1)) {
                  var4 = param2.d((byte) -99);
                  ((j) this).field_y = new int[var4];
                  ((j) this).field_z = new int[var4][];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4) {
                      break L0;
                    } else {
                      var6 = param2.e(127);
                      var7 = bj.a(0, var6);
                      if (var7 != null) {
                        ((j) this).field_y[var5] = var6;
                        ((j) this).field_z[var5] = new int[var7.field_c];
                        var8 = 0;
                        L3: while (true) {
                          if (var8 < var7.field_c) {
                            ((j) this).field_z[var5][var8] = param2.e(127);
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
                } else {
                  if (4 == param0) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              ((j) this).field_w = hi.a(param2.g((byte) 81), '<', 783);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(bh param0, int param1) {
        int var3 = 0;
        int var4 = TetraLink.field_J;
        if (param1 != 15067) {
            return;
        }
        while (true) {
            var3 = param0.d((byte) -99);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(var3, -85, param0);
        }
    }

    final String h(int param0) {
        int var3 = 0;
        int var4 = TetraLink.field_J;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((j) this).field_w == null) {
            return "";
        }
        StringBuilder discarded$7 = var5.append(((j) this).field_w[0]);
        if (param0 > -10) {
            return null;
        }
        for (var3 = 1; ((j) this).field_w.length > var3; var3++) {
            StringBuilder discarded$8 = var2.append("...");
            StringBuilder discarded$9 = var5.append(((j) this).field_w[var3]);
        }
        return var2.toString();
    }

    j() {
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        if (param0 != 25271) {
            Object var4 = null;
            this.a(0, 67, (bh) null);
        }
        if (null != ((j) this).field_v) {
            for (var2 = 0; ((j) this).field_v.length > var2; var2++) {
                ((j) this).field_v[var2] = mc.a(((j) this).field_v[var2], 32768);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Offline";
    }
}
