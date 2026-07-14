/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tla extends bca {
    static eaa field_q;
    int field_r;
    int field_v;
    aj[] field_t;
    static String field_s;
    int field_u;

    final static void d(int param0) {
        int var1 = 0;
        if (null == cr.field_c) {
          if (sla.field_a != null) {
            L0: {
              rp.a(true, sla.field_a);
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L0;
              } else {
                break L0;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          } else {
            L1: {
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L1;
              } else {
                break L1;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          }
        } else {
          rp.a(true, cr.field_c);
          if (sla.field_a == null) {
            L2: {
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L2;
              } else {
                break L2;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          } else {
            L3: {
              rp.a(true, sla.field_a);
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L3;
              } else {
                break L3;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          }
        }
    }

    tla(int param0, nq param1) {
        super(param0, param1);
        ((tla) this).field_u = 0;
        ((tla) this).field_t = new aj[6];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0 >= dg.field_f) {
          if (param0 >= dg.field_h) {
            return;
          } else {
            if (param3 >= dg.field_j) {
              if (dg.field_k > param3) {
                var5 = 65280 & param2;
                if (param1 != -1898743704) {
                  return;
                } else {
                  var5 = var5 * param4;
                  param2 = param2 & 16711935;
                  param2 = param2 * param4;
                  var5 = var5 & 16711680;
                  param2 = param2 & -16711936;
                  var6 = dg.field_i * param3 + param0;
                  var7 = dg.field_e[var6];
                  var5 = var5 + (16711680 & (var7 & 65280) * (256 - param4));
                  param2 = param2 + ((16711935 & var7) * (256 + -param4) & -16711936);
                  dg.field_e[var6] = mp.a(param2, var5) >>> -1898743704;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new fd(param1, (tla) this);
    }

    tla(lu param0) {
        super(param0);
        int var3 = 0;
        ((tla) this).field_k = param0.e((byte) 46);
        ((tla) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((tla) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((tla) this).field_v = param0.b(16711935);
        ((tla) this).field_r = param0.b(16711935);
        ((tla) this).field_u = param0.b(16711935);
        ((tla) this).field_t = new aj[((tla) this).field_u];
        for (var3 = 0; ((tla) this).field_u > var3; var3++) {
            ((tla) this).field_t[var3] = new aj(param0.b(16711935), param0.b(16711935));
        }
    }

    final void a(byte param0, lu param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        this.a((byte) -82, param1);
        param1.d(((tla) this).field_v, 0);
        param1.d(((tla) this).field_r, 0);
        param1.d(((tla) this).field_u, 0);
        if (param0 >= -12) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (((tla) this).field_u <= var3) {
              return;
            } else {
              param1.d(((tla) this).field_t[var3].field_c, 0);
              param1.d(((tla) this).field_t[var3].field_a, 0);
              var3++;
              continue L0;
            }
          }
        }
    }

    final int[][] d(boolean param0) {
        int[][] var2 = null;
        int[][] var3 = null;
        int[][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[][] var7 = null;
        L0: {
          var7 = new int[17][17];
          var6 = var7;
          var5 = var6;
          var4 = var5;
          var3 = var4;
          var2 = var3;
          var7[5][8] = 1;
          if (!param0) {
            break L0;
          } else {
            tla.c(false);
            break L0;
          }
        }
        var7[6][7] = 1;
        var7[7][7] = 1;
        var7[7][6] = 1;
        var7[6][9] = 1;
        var7[6][8] = 1;
        var7[7][10] = 1;
        var7[8][7] = 1;
        var7[8][6] = 1;
        var7[7][9] = 1;
        var7[7][8] = 1;
        var7[8][5] = 1;
        var7[8][8] = 1;
        var7[9][7] = 1;
        var7[9][6] = 1;
        var7[8][9] = 1;
        var7[8][10] = 1;
        var7[8][11] = 1;
        var7[9][10] = 1;
        var7[9][9] = 1;
        var7[9][8] = 1;
        var7[10][7] = 1;
        var7[10][9] = 1;
        var7[10][8] = 1;
        var7[11][8] = 1;
        return var2;
    }

    public static void c(boolean param0) {
        field_q = null;
        field_s = null;
        if (param0) {
            tla.c(true);
        }
    }

    final void a(op param0, int param1) {
        int var3 = -53 / ((param1 - 12) / 35);
        ((tla) this).a(param0, (byte) -2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Click";
        field_q = new eaa();
    }
}
