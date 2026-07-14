/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends w {
    static int field_s;
    int[] field_x;
    static int[] field_C;
    static int[] field_q;
    private int[] field_t;
    private String[] field_z;
    static long field_u;
    static int[] field_p;
    private int[][] field_A;
    static int[][][][][] field_r;
    static int[] field_B;
    static k field_w;
    static ka field_v;
    static String field_y;

    final static int e(int param0) {
        int var1 = 0;
        int var2 = TorChallenge.field_F ? 1 : 0;
        boolean discarded$8 = t.field_b.a(lk.field_g, false, nd.field_g, true);
        t.field_b.j(-91);
        while (kj.e((byte) -39)) {
            boolean discarded$9 = t.field_b.a(di.field_m, b.field_J, 104);
        }
        if (!(-1 == ri.field_i)) {
            var1 = ri.field_i;
            fk.a(true, -1);
            return var1;
        }
        if (!(!hl.field_e)) {
            return 3;
        }
        if (eh.field_p == qc.field_i) {
            return 1;
        }
        if (!(ji.field_k.b(param0))) {
            return 1;
        }
        if (qc.field_i == gj.field_a) {
            return 2;
        }
        return -1;
    }

    public static void g(int param0) {
        field_r = null;
        field_y = null;
        field_q = null;
        field_C = null;
        field_p = null;
        field_v = null;
        field_w = null;
        if (param0 < 112) {
            return;
        }
        field_B = null;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (null != ((lh) this).field_x) {
            for (var2 = 0; ((lh) this).field_x.length > var2; var2++) {
                ((lh) this).field_x[var2] = p.a(((lh) this).field_x[var2], 32768);
            }
        }
        if (param0 != 0) {
            ((lh) this).field_z = null;
        }
    }

    final String b(boolean param0) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
            lh.g(-86);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((lh) this).field_z) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((lh) this).field_z[0]);
        for (var3 = 1; var3 < ((lh) this).field_z.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((lh) this).field_z[var3]);
        }
        return var2.toString();
    }

    lh() {
    }

    private final void a(int param0, uf param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        k var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          if (1 != param0) {
            if (param0 != 2) {
              if (param0 == -4) {
                var4 = param1.j(-87);
                ((lh) this).field_t = new int[var4];
                ((lh) this).field_A = new int[var4][];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param1.c(false);
                    var7 = oh.a((byte) 123, var6);
                    if (var7 != null) {
                      ((lh) this).field_t[var5] = var6;
                      ((lh) this).field_A[var5] = new int[var7.field_j];
                      var8 = 0;
                      L2: while (true) {
                        if (var7.field_j > var8) {
                          ((lh) this).field_A[var5][var8] = param1.c(false);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (-5 == param0) {
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var4 = param1.j(-95);
              ((lh) this).field_x = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  ((lh) this).field_x[var5] = param1.c(false);
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            ((lh) this).field_z = dl.a(param1.b(false), '<', -33);
            break L0;
          }
        }
        L4: {
          if (param2 == -817) {
            break L4;
          } else {
            field_w = null;
            break L4;
          }
        }
    }

    final static void f(int param0) {
        if (param0 <= 44) {
            return;
        }
        o var1 = (o) (Object) ve.field_c.c((byte) 116);
        if (var1 == null) {
            ob.b(-103);
            return;
        }
        pa var2 = id.field_b;
        int discarded$0 = var2.i(67);
        int discarded$1 = var2.i(54);
        int discarded$2 = var2.i(65);
        int discarded$3 = var2.i(56);
        var1.a(true);
    }

    final void a(uf param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 < -97) {
          L0: while (true) {
            var3 = param0.j(-118);
            if (0 != var3) {
              this.a(var3, param0, -817);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_C = new int[]{192, 192, 256};
        field_q = new int[]{192, 192, 256};
        field_B = new int[]{96, 96, 128};
        field_p = new int[]{128, 128, 144};
        field_y = "Please wait...";
        field_r = new int[][][][][]{new int[7][][][], new int[7][][][], new int[7][][][]};
        field_w = new k(4, 1, 1, 1);
    }
}
