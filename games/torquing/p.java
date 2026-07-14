/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends ta {
    int[] field_v;
    private String[] field_r;
    private int[] field_q;
    private int[][] field_s;
    static ce field_t;
    static t field_w;
    static fn field_x;
    static int field_u;

    public static void b(int param0) {
        field_x = null;
        if (param0 != 29841) {
            field_w = null;
        }
        field_w = null;
        field_t = null;
    }

    private final void a(int param0, int param1, fj param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        k var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Torquing.field_u;
          if (param0 == param1) {
            ((p) this).field_r = kc.a('<', param2.h((byte) 122), 0);
            break L0;
          } else {
            if (param0 != 2) {
              if (param0 == 3) {
                var4 = param2.i((byte) -101);
                ((p) this).field_s = new int[var4][];
                ((p) this).field_q = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param2.i(7088);
                    var7 = ni.a(89, var6);
                    if (var7 != null) {
                      ((p) this).field_q[var5] = var6;
                      ((p) this).field_s[var5] = new int[var7.field_a];
                      var8 = 0;
                      L2: while (true) {
                        if (var7.field_a > var8) {
                          ((p) this).field_s[var5][var8] = param2.i(7088);
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
                if (param0 == 4) {
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var4 = param2.i((byte) -101);
              ((p) this).field_v = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((p) this).field_v[var5] = param2.i(7088);
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(fj param0, byte param1) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        if (param1 <= 35) {
            return;
        }
        while (true) {
            var3 = param0.i((byte) -101);
            if (var3 == 0) {
                break;
            }
            this.a(var3, 1, param0);
        }
    }

    final static t[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Torquing.field_u;
        t[] var1 = new t[ti.field_g];
        for (var2 = 0; ti.field_g > var2; var2++) {
            var3 = ij.field_o[var2] * vo.field_b[var2];
            var4 = pn.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = cq.field_y[ie.a(255, (int) var4[var6])];
            }
            var1[var2] = new t(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], var5);
        }
        go.b(param0 + -3499);
        if (param0 != 3499) {
            field_x = null;
        }
        return var1;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (((p) this).field_v != null) {
            for (var2 = 0; var2 < ((p) this).field_v.length; var2++) {
                ((p) this).field_v[var2] = gm.a(((p) this).field_v[var2], 32768);
            }
        }
        if (param0 >= -28) {
            t[] discarded$0 = p.a(-61);
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((p) this).field_r) {
            return "";
        }
        if (param0 >= -126) {
            t[] discarded$0 = p.a(18);
        }
        StringBuilder discarded$1 = var5.append(((p) this).field_r[0]);
        for (var3 = 1; var3 < ((p) this).field_r.length; var3++) {
            StringBuilder discarded$2 = var2.append("...");
            StringBuilder discarded$3 = var5.append(((p) this).field_r[var3]);
        }
        return var2.toString();
    }

    p() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new ce();
        field_u = 50;
    }
}
