/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends al {
    private String[] field_w;
    int[] field_y;
    private int[][] field_v;
    private int[] field_x;
    static long field_u;

    private final void a(int param0, byte param1, sb param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bg var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = MinerDisturbance.field_ab;
          if (param0 != 1) {
            if (2 == param0) {
              var4 = param2.d((byte) -54);
              ((fc) this).field_y = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((fc) this).field_y[var5] = param2.e(-64);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (-4 != (param0 ^ -1)) {
                if ((param0 ^ -1) == -5) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param2.d((byte) -54);
                ((fc) this).field_x = new int[var4];
                ((fc) this).field_v = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param2.e(-103);
                    var7 = in.a(var6, (byte) 77);
                    if (var7 != null) {
                      ((fc) this).field_x[var5] = var6;
                      ((fc) this).field_v[var5] = new int[var7.field_a];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_a > var8) {
                          ((fc) this).field_v[var5][var8] = param2.e(-55);
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
            ((fc) this).field_w = h.a('<', true, param2.a(false));
            break L0;
          }
        }
        L4: {
          if (param1 > 91) {
            break L4;
          } else {
            ((fc) this).field_v = null;
            break L4;
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (param0) {
            String discarded$0 = fc.b((byte) -36);
        }
        if ((oc.field_f ^ -1) < -33) {
            var1 = oc.field_f % 32;
            if (0 == var1) {
                var1 = 32;
            }
            ma.a(-96, oc.field_f - var1);
        } else {
            ma.a(-102, 0);
        }
    }

    final static String b(byte param0) {
        if (param0 <= 115) {
            return null;
        }
        if (!(ci.field_e != ic.field_l)) {
            return wm.field_d;
        }
        if (ci.field_e == bd.field_h) {
            return ic.field_m;
        }
        if (!wm.field_f.a(0)) {
            return ic.field_m;
        }
        return pl.field_a;
    }

    final String f(int param0) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(null != ((fc) this).field_w)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((fc) this).field_w[0]);
        for (var3 = param0; ((fc) this).field_w.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((fc) this).field_w[var3]);
        }
        return var2.toString();
    }

    final void a(int param0, sb param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        L0: while (true) {
          var3 = param1.d((byte) -54);
          if (var3 != 0) {
            this.a(var3, (byte) 119, param1);
            continue L0;
          } else {
            L1: {
              if (param0 == 32768) {
                break L1;
              } else {
                String discarded$1 = fc.b((byte) -29);
                break L1;
              }
            }
            return;
          }
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = MinerDisturbance.field_ab;
        if (param0 != 60) {
            Object var4 = null;
            ((fc) this).a(80, (sb) null);
        }
        if (!(null == ((fc) this).field_y)) {
            for (var2 = 0; ((fc) this).field_y.length > var2; var2++) {
                ((fc) this).field_y[var2] = hi.a(((fc) this).field_y[var2], 32768);
            }
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 <= 35) {
            fc.a(-84, (byte) 24);
        }
        ee.field_J = param0;
        if (!(null == km.field_a)) {
            km.field_a.a((byte) -95, param0);
        }
        if (null != nj.field_e) {
            nj.field_e.a(81, param0);
        }
    }

    fc() {
    }

    static {
    }
}
