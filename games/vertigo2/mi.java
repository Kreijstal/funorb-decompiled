/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ed {
    private int field_z;
    private wa field_v;
    private int field_y;
    static int[] field_w;
    static String field_x;

    mi(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        param2 = param2 & e.field_b[param1];
        while (param1 > ((mi) this).field_y) {
            param1 = param1 - ((mi) this).field_y;
            ((mi) this).field_u = ((mi) this).field_u + 1;
            ((mi) this).field_p[((mi) this).field_u] = (byte)(((mi) this).field_p[((mi) this).field_u] + (param2 >>> param1));
            ((mi) this).field_p[((mi) this).field_u] = (byte) 0;
            ((mi) this).field_y = 8;
        }
        int var4 = -41 / ((62 - param0) / 36);
        if (((mi) this).field_y == param1) {
            ((mi) this).field_u = ((mi) this).field_u + 1;
            ((mi) this).field_p[((mi) this).field_u] = (byte)(((mi) this).field_p[((mi) this).field_u] + param2);
            ((mi) this).field_p[((mi) this).field_u] = (byte) 0;
            ((mi) this).field_y = 8;
            return;
        }
        ((mi) this).field_y = ((mi) this).field_y - param1;
        ((mi) this).field_p[((mi) this).field_u] = (byte)(((mi) this).field_p[((mi) this).field_u] + (param2 << ((mi) this).field_y));
    }

    final void d(boolean param0) {
        ((mi) this).field_p[((mi) this).field_u] = (byte) 0;
        ((mi) this).field_y = 8;
        if (param0) {
            mi.r(42);
        }
    }

    final void j(int param0, int param1) {
        ((mi) this).field_u = ((mi) this).field_u + 1;
        ((mi) this).field_p[((mi) this).field_u] = (byte)(((mi) this).field_v.a((byte) 72) + param0);
        if (param1 <= 117) {
            int discarded$0 = ((mi) this).c((byte) -52, 85);
        }
    }

    final int c(byte param0) {
        int var2 = -43 / ((param0 - -50) / 46);
        ((mi) this).field_u = ((mi) this).field_u + 1;
        return 255 & ((mi) this).field_p[((mi) this).field_u] - ((mi) this).field_v.a((byte) 72);
    }

    final static er[] a(String param0, r param1, byte param2, String param3) {
        int var4 = param1.a((byte) 126, param3);
        if (param2 != 34) {
            mi.r(66);
        }
        int var5 = param1.a(var4, param0, 94);
        return bk.a(var4, var5, param1, -2724);
    }

    final void p(int param0) {
        if (param0 != 0) {
            ((mi) this).d(false);
            ((mi) this).field_z = ((mi) this).field_u * 8;
            return;
        }
        ((mi) this).field_z = ((mi) this).field_u * 8;
    }

    final int c(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 < -92) {
          var3 = ((mi) this).field_z >> -74625533;
          var4 = 8 + -(7 & ((mi) this).field_z);
          ((mi) this).field_z = ((mi) this).field_z + param1;
          var5 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              L1: {
                if (var4 == param1) {
                  var5 = var5 + (((mi) this).field_p[var3] & e.field_b[var4]);
                  break L1;
                } else {
                  var5 = var5 + (((mi) this).field_p[var3] >> var4 + -param1 & e.field_b[param1]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((e.field_b[var4] & ((mi) this).field_p[var3]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          field_w = null;
          var3 = ((mi) this).field_z >> -74625533;
          var4 = 8 + -(7 & ((mi) this).field_z);
          ((mi) this).field_z = ((mi) this).field_z + param1;
          var5 = 0;
          L2: while (true) {
            if (param1 <= var4) {
              L3: {
                if (var4 == param1) {
                  var5 = var5 + (((mi) this).field_p[var3] & e.field_b[var4]);
                  break L3;
                } else {
                  var5 = var5 + (((mi) this).field_p[var3] >> var4 + -param1 & e.field_b[param1]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((e.field_b[var4] & ((mi) this).field_p[var3]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 < 24) {
            field_x = null;
            for (var5 = 0; var5 < param1; var5++) {
                ((mi) this).field_u = ((mi) this).field_u + 1;
                param2[param3 + var5] = (byte)(((mi) this).field_p[((mi) this).field_u] + -((mi) this).field_v.a((byte) 72));
            }
            return;
        }
        for (var5 = 0; var5 < param1; var5++) {
            ((mi) this).field_u = ((mi) this).field_u + 1;
            param2[param3 + var5] = (byte)(((mi) this).field_p[((mi) this).field_u] + -((mi) this).field_v.a((byte) 72));
        }
    }

    final void b(int[] param0, int param1) {
        if (param1 < 33) {
            ((mi) this).j(40, -119);
            ((mi) this).field_v = new wa(param0);
            return;
        }
        ((mi) this).field_v = new wa(param0);
    }

    final void q(int param0) {
        if (!((((mi) this).field_y ^ -1) <= param0)) {
            ((mi) this).field_y = 8;
            ((mi) this).field_u = ((mi) this).field_u + 1;
        }
    }

    final void b(byte param0) {
        ((mi) this).field_u = (((mi) this).field_z + 7) / 8;
        if (param0 > -49) {
            ((mi) this).field_v = null;
        }
    }

    public static void r(int param0) {
        field_w = null;
        field_x = null;
        if (param0 <= 79) {
            mi.r(84);
        }
    }

    mi(int param0) {
        super(param0);
    }

    final static void k(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -32460) {
          m.field_B = param1;
          var2 = param1;
          if (var2 == -1) {
            pn.field_L = 1;
            be.field_q = false;
            pl.field_n = 1;
            oo.field_i = true;
            hn.field_t = false;
            cn.field_r = false;
            lf.field_C = false;
            return;
          } else {
            if (-2 == var2) {
              pl.field_n = 0;
              be.field_q = false;
              oo.field_i = true;
              lf.field_C = true;
              pn.field_L = 1;
              hn.field_t = true;
              cn.field_r = true;
              return;
            } else {
              if (var2 == 2) {
                cn.field_r = true;
                hn.field_t = true;
                pl.field_n = 0;
                be.field_q = true;
                lf.field_C = true;
                pn.field_L = 0;
                oo.field_i = false;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          mi.r(53);
          m.field_B = param1;
          var2 = param1;
          if (var2 == -1) {
            pn.field_L = 1;
            be.field_q = false;
            pl.field_n = 1;
            oo.field_i = true;
            hn.field_t = false;
            cn.field_r = false;
            lf.field_C = false;
            return;
          } else {
            if (-2 == var2) {
              pl.field_n = 0;
              be.field_q = false;
              oo.field_i = true;
              lf.field_C = true;
              pn.field_L = 1;
              hn.field_t = true;
              cn.field_r = true;
              return;
            } else {
              if (var2 == 2) {
                cn.field_r = true;
                hn.field_t = true;
                pl.field_n = 0;
                be.field_q = true;
                lf.field_C = true;
                pn.field_L = 0;
                oo.field_i = false;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Add <%0> to ignore list";
    }
}
