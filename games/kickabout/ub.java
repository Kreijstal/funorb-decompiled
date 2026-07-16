/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ub extends wj {
    private int field_F;
    static int field_B;
    static kg[] field_G;
    static int field_E;
    boolean field_C;
    private se field_H;
    static hd field_D;

    final static kg h(byte param0) {
        kg var1 = new kg(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[0], ku.field_c[0], lo.field_j[0], pq.field_O[0], lt.field_a);
        int var2 = 103 / ((param0 - -65) / 46);
        tk.h((byte) -98);
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((ub) this).field_F != 0) {
          if (((ub) this).field_F >= 256) {
            if (param0 != 0) {
              return;
            } else {
              ((ub) this).a(((ub) this).field_t + param2, (byte) 64, param3 - -((ub) this).field_g);
              super.a(param0, 65, param2, param3);
              return;
            }
          } else {
            if (null != d.field_a) {
              if (d.field_a.field_q >= ((ub) this).field_n) {
                if (((ub) this).field_i <= d.field_a.field_w) {
                  iw.a(param1 + -190, d.field_a);
                  on.b();
                  ((ub) this).a(0, (byte) 125, 0);
                  super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
                  ta.e(127);
                  d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
                  return;
                } else {
                  d.field_a = new ut(((ub) this).field_n, ((ub) this).field_i);
                  iw.a(param1 + -190, d.field_a);
                  on.b();
                  ((ub) this).a(0, (byte) 125, 0);
                  super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
                  ta.e(127);
                  d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
                  return;
                }
              } else {
                d.field_a = new ut(((ub) this).field_n, ((ub) this).field_i);
                iw.a(param1 + -190, d.field_a);
                on.b();
                ((ub) this).a(0, (byte) 125, 0);
                super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
                ta.e(127);
                d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
                return;
              }
            } else {
              d.field_a = new ut(((ub) this).field_n, ((ub) this).field_i);
              iw.a(param1 + -190, d.field_a);
              on.b();
              ((ub) this).a(0, (byte) 125, 0);
              super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
              ta.e(127);
              d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static ut[] i(byte param0) {
        ut[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        var1 = new ut[io.field_l];
        if (param0 != 78) {
          return null;
        } else {
          var2 = 0;
          L0: while (true) {
            if (io.field_l <= var2) {
              tk.h((byte) -70);
              return var1;
            } else {
              var3 = ku.field_c[var2] * lo.field_j[var2];
              var4 = pq.field_O[var2];
              var5 = new int[var3];
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new ut(kw.field_i, ai.field_J, aq.field_f[var2], fc.field_g[var2], ku.field_c[var2], lo.field_j[var2], var5);
                  var2++;
                  continue L0;
                } else {
                  var5[var6] = lt.field_a[qj.b((int) var4[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        Object var2 = null;
        hn var2_ref = null;
        int var3 = 0;
        hn var4 = null;
        hn var5 = null;
        var2 = null;
        var3 = Kickabout.field_G;
        if (param1 < -23) {
          var2_ref = (hn) (Object) da.field_h.g(24009);
          L0: while (true) {
            if (var2_ref == null) {
              var4 = new hn(4, new int[1]);
              ii.a(var4, 102);
              return;
            } else {
              L1: {
                if ((var2_ref.field_i ^ -1) == -5) {
                  var2_ref.c((byte) -109);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2_ref = (hn) (Object) da.field_h.c(33);
              continue L0;
            }
          }
        } else {
          field_G = null;
          var2_ref = (hn) (Object) da.field_h.g(24009);
          L2: while (true) {
            if (var2_ref == null) {
              var5 = new hn(4, new int[1]);
              var2_ref = var5;
              ii.a(var5, 102);
              return;
            } else {
              L3: {
                if ((var2_ref.field_i ^ -1) == -5) {
                  var2_ref.c((byte) -109);
                  break L3;
                } else {
                  break L3;
                }
              }
              var2_ref = (hn) (Object) da.field_h.c(33);
              continue L2;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_G = null;
        int var1 = 0 / ((45 - param0) / 43);
        field_D = null;
    }

    private final int b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((ub) this).field_F = -20;
            if (((ub) this).field_C) {
              if (this != (Object) (Object) ((ub) this).field_H.h((byte) 18)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (((ub) this).field_C) {
              if (this != (Object) (Object) ((ub) this).field_H.h((byte) 18)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 < 90) {
          return;
        } else {
          ((ub) this).a(param1, 1, il.field_b - param2 >> 2041653953, param2, -param1 + im.field_Ab >> 670053569);
          return;
        }
    }

    final fd a(boolean param0) {
        fd var2 = super.a(param0);
        if (var2 != null) {
            return var2;
        }
        return (fd) this;
    }

    boolean k(int param0) {
        int var2 = this.b(true);
        int var3 = -((ub) this).field_F + var2;
        if ((var3 ^ -1) < -1) {
            ((ub) this).field_F = ((ub) this).field_F + (var3 + 8 - 1) / 8;
            if (!(param0 >= (var3 ^ -1))) {
                ((ub) this).field_F = ((ub) this).field_F + (1 + (var3 - 16)) / 16;
            }
            if (0 != ((ub) this).field_F) {
                return false;
            }
            if (-1 != (var2 ^ -1)) {
                return false;
            }
            return !((ub) this).field_C ? true : false;
        }
        if (!(param0 >= (var3 ^ -1))) {
            ((ub) this).field_F = ((ub) this).field_F + (1 + (var3 - 16)) / 16;
        }
        if (0 != ((ub) this).field_F) {
            return false;
        }
        if (-1 != (var2 ^ -1)) {
            return false;
        }
        return !((ub) this).field_C ? true : false;
    }

    ub(se param0, int param1, int param2) {
        super(il.field_b - param1 >> -138341247, -param2 + im.field_Ab >> -788726207, param1, param2, (gj) null);
        ((ub) this).field_F = 0;
        ((ub) this).field_H = param0;
        ((ub) this).field_C = false;
    }

    abstract void a(int param0, byte param1, int param2);

    boolean a(int param0) {
        ((ub) this).field_F = this.b(true);
        if (param0 < -11) {
          if (-1 == (((ub) this).field_F ^ -1)) {
            if (((ub) this).field_C) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static long a(int param0, byte param1, long param2) {
        int var4 = 32 % ((-15 - param1) / 62);
        return param2 << param0 | param2 >>> -param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
    }
}
