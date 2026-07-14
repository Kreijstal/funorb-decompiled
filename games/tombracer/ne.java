/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private int field_b;
    static int[][] field_f;
    static iv field_d;
    private long field_a;
    static fta field_c;
    static String field_e;

    final gj b(int param0, int param1) {
        if (param0 != 0) {
            return null;
        }
        return gj.a((byte) 41, this.a(param1, -1));
    }

    final static void a(cn param0, int param1) {
        fg.b(param0.a("headers.packvorbis", (byte) 124, ""));
        fg var2 = fg.a(param0, "jagex logo2.packvorbis", "");
        u discarded$0 = var2.a();
        int var3 = -87 % ((param1 - 12) / 50);
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        var3 = hua.a(param2, 0);
        if (param0) {
          if (-1 != param1.indexOf(param2)) {
            return true;
          } else {
            if ((param1.indexOf(var3) ^ -1) == 0) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  L0: {
                    if (param1.endsWith(param2)) {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L0;
                    } else {
                      if (!param1.endsWith(var3)) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  }
                  return stackIn_27_0 != 0;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          var4 = null;
          boolean discarded$4 = ne.a(false, (String) null, (String) null);
          if (-1 == param1.indexOf(param2)) {
            if ((param1.indexOf(var3) ^ -1) == 0) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (!param1.endsWith(var3)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != -1) {
            ((ne) this).field_b = -59;
            return (int)(((ne) this).field_a >> gj.field_f * param0) & 15;
        }
        return (int)(((ne) this).field_a >> gj.field_f * param0) & 15;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != 15) {
            field_d = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var1 = c.field_g[0];
        var2 = 1;
        if (param0 >= -49) {
          var5 = null;
          boolean discarded$1 = ne.a(true, (String) null, (String) null);
          L0: while (true) {
            if (c.field_g.length > var2) {
              var3 = c.field_g[var2];
              lua.a(aia.field_t, var2 << 1665449828, aia.field_t, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (c.field_g.length > var2) {
              var3 = c.field_g[var2];
              lua.a(aia.field_t, var2 << 1665449828, aia.field_t, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final int b(byte param0) {
        int var2 = -110 % ((param0 - -27) / 42);
        return ((ne) this).field_b;
    }

    private final void a(int param0, gj param1) {
        if (param0 != 1) {
            return;
        }
        ((ne) this).field_b = ((ne) this).field_b + 1;
        ((ne) this).field_a = ((ne) this).field_a | (long)(param1.field_i << ((ne) this).field_b * gj.field_f);
    }

    ne(gj param0) {
        ((ne) this).field_b = 1;
        ((ne) this).field_a = (long)param0.field_i;
    }

    ne(gj[] param0) {
        int var2 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0.length) {
            this.a(1, param0[var2]);
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
        field_c = new fta();
        field_e = "Icons are heavy, ugly, and probably belong in a museum. Dump these deadweights with <img=8><img=9> or save them for tons of points.";
    }
}
