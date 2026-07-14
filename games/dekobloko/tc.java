/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends w {
    static byte[][] field_Nb;
    private w field_Vb;
    static w field_Ub;
    private w[] field_Rb;
    static ck field_Tb;
    static String field_Qb;
    int field_Pb;
    private w[] field_Sb;
    static w field_Ob;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (((tc) this).field_Rb.length <= var2) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.a(-26, true, -12);
                break L1;
              }
            }
            return;
          } else {
            if (var2 != ((tc) this).field_Pb) {
              if (0 != ((tc) this).field_Rb[var2].field_ob) {
                ((tc) this).field_Rb[((tc) this).field_Pb].field_ab = false;
                ((tc) this).field_Sb[((tc) this).field_Pb].field_vb = ((tc) this).field_Sb[((tc) this).field_Pb].field_vb + 10000;
                ((tc) this).field_Pb = var2;
                ((tc) this).field_Rb[var2].field_ab = true;
                ((tc) this).field_Sb[var2].field_vb = ((tc) this).field_Sb[var2].field_vb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void h(byte param0) {
        if (param0 <= 83) {
            return;
        }
        field_Nb = null;
        field_Ob = null;
        field_Tb = null;
        field_Qb = null;
        field_Ub = null;
    }

    tc(long param0, w param1, String[] param2, w param3, w[] param4, int param5) {
        super(param0, (w) null);
        int var8 = 0;
        w var9 = null;
        ((tc) this).field_Rb = new w[param2.length];
        ((tc) this).field_Vb = new w(0L, param3);
        ((tc) this).field_Sb = param4;
        for (var8 = 0; param2.length > var8; var8++) {
            var9 = new w(0L, param1);
            var9.field_Y = param2[var8];
            ((tc) this).field_Rb[var8] = var9;
            ((tc) this).a(var9, -16834);
        }
        ((tc) this).a(((tc) this).field_Vb, -16834);
        int var11 = 0;
        var8 = var11;
        while (var11 < param4.length) {
            ((tc) this).field_Vb.a(param4[var11], -16834);
            var11++;
        }
        ((tc) this).field_Pb = param5;
        ((tc) this).field_Rb[param5].field_ab = true;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            ((tc) this).a(-2, -35, 12, -28, 52, 1, -110);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((tc) this).field_Rb.length) {
            ((tc) this).field_Vb.a(((tc) this).field_mb, 0, param2, -param2 + ((tc) this).field_N, 0);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= ((tc) this).field_Sb.length) {
                return;
              } else {
                ((tc) this).field_Sb[var8].a(((tc) this).field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + ((tc) this).field_Vb.field_N, param0);
                if (var8 != ((tc) this).field_Pb) {
                  ((tc) this).field_Sb[var8].field_vb = ((tc) this).field_Sb[var8].field_vb + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * ((tc) this).field_mb / ((tc) this).field_Rb.length;
            var6 = ((tc) this).field_mb * (var4 - -1) / ((tc) this).field_Rb.length;
            ((tc) this).field_Rb[var4].field_vb = var5;
            ((tc) this).field_Rb[var4].field_Ib = 0;
            ((tc) this).field_Rb[var4].field_mb = var6 + -var5;
            ((tc) this).field_Rb[var4].field_N = param2;
            var4++;
            continue L1;
          }
        }
    }

    final static w g(byte param0) {
        if (param0 != 98) {
            return null;
        }
        return dm.a((byte) 108);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= -44) {
            this.a(4, true, -41);
        }
        ((tc) this).field_N = param0;
        ((tc) this).field_mb = param2;
        ((tc) this).field_vb = param5;
        ((tc) this).field_Ib = param1;
        this.a(param3, true, param4);
    }

    final static int a(int param0, hl param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          var2 = ij.field_c;
          if (-3 == (param1.field_m ^ -1)) {
            if (!param1.field_j) {
              L1: {
                if (param1.field_i != 0) {
                  break L1;
                } else {
                  if (-1 == (param1.field_n ^ -1)) {
                    var2 = tl.field_q[param1.field_m];
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = ul.field_c[param1.field_m];
              break L0;
            } else {
              var2 = ij.field_c;
              break L0;
            }
          } else {
            if (4 != param1.field_m) {
              if (param1.field_r != uc.field_g) {
                var2 = ul.field_c[param1.field_m];
                break L0;
              } else {
                var2 = tl.field_q[param1.field_m];
                break L0;
              }
            } else {
              var2 = ul.field_c[param1.field_m];
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 4636) {
            break L2;
          } else {
            w discarded$1 = tc.g((byte) 85);
            break L2;
          }
        }
        return var2;
    }

    static {
    }
}
