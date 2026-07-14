/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends ij {
    private String[] field_l;
    private int[] field_m;
    private int[][] field_n;
    static long field_p;
    int[] field_o;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        if (!(((mp) this).field_o == null)) {
            for (var2 = 0; ((mp) this).field_o.length > var2; var2++) {
                ((mp) this).field_o[var2] = hm.a(((mp) this).field_o[var2], 32768);
            }
        }
        if (param0 != -90) {
            ((mp) this).field_m = null;
        }
    }

    final static boolean a(int param0, String param1, dc param2, String param3, String param4, boolean param5, int param6) {
        if (lc.field_c != tl.field_e) {
            return false;
        }
        sa var8 = new sa(qe.field_g, param2);
        qe.field_g.b(-3264, (qm) (Object) var8);
        if (il.b(-120)) {
            var8.o(106);
        } else {
            ro.field_n = param6;
            qc.field_i = null;
            qh.field_f = param5 ? true : false;
            ji.field_x = param1;
            dg.field_a = param3;
            lc.field_c = l.field_b;
            fh.field_i = param4;
        }
        if (param0 != 0) {
            field_p = -79L;
            return true;
        }
        return true;
    }

    final void a(ng param0, byte param1) {
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        if (param1 <= 27) {
            field_p = 6L;
        }
        while (true) {
            var3 = param0.h(255);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(var3, param0, -3);
        }
    }

    final String e(int param0) {
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((mp) this).field_l == null) {
            return "";
        }
        if (param0 != 60) {
            ((mp) this).a((byte) 25);
        }
        StringBuilder discarded$0 = var5.append(((mp) this).field_l[0]);
        for (var3 = 1; var3 < ((mp) this).field_l.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((mp) this).field_l[var3]);
        }
        return var2.toString();
    }

    mp() {
    }

    private final void a(int param0, ng param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sj var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        if (param2 == -3) {
          L0: {
            if ((param0 ^ -1) == -2) {
              ((mp) this).field_l = ik.a(param1.i(110), (byte) -76, '<');
              break L0;
            } else {
              if ((param0 ^ -1) != -3) {
                if (3 == param0) {
                  var4 = param1.h(255);
                  ((mp) this).field_m = new int[var4];
                  ((mp) this).field_n = new int[var4][];
                  var5 = 0;
                  L1: while (true) {
                    if (var4 <= var5) {
                      break L0;
                    } else {
                      var6 = param1.c((byte) -7);
                      var7 = cf.a(var6, 123);
                      if (var7 != null) {
                        ((mp) this).field_m[var5] = var6;
                        ((mp) this).field_n[var5] = new int[var7.field_a];
                        var8 = 0;
                        L2: while (true) {
                          if (var8 < var7.field_a) {
                            ((mp) this).field_n[var5][var8] = param1.c((byte) -7);
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
                  if (4 == param0) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                var4 = param1.h(255);
                ((mp) this).field_o = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    ((mp) this).field_o[var5] = param1.c((byte) -7);
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
    }
}
