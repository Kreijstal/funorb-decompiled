/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends wj implements vh {
    static hd field_L;
    static String field_C;
    static int[] field_I;
    private hu field_B;
    private wv field_E;
    static int field_H;
    private int[] field_M;
    private String field_D;
    static int[] field_G;
    private int field_N;
    static String field_F;
    private wi[] field_J;

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        if (param3 > 64) {
          var6 = 0;
          L0: while (true) {
            if (((qp) this).field_N > var6) {
              if (((qp) this).field_J[var6] != param1) {
                var6++;
                var6++;
                continue L0;
              } else {
                var7 = ((qp) this).field_M[var6];
                if (var7 != -1) {
                  qd.b(38, ((qp) this).field_M[var6]);
                  return;
                } else {
                  ((qp) this).field_E.q(-77);
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          field_F = null;
          var6 = 0;
          L1: while (true) {
            if (((qp) this).field_N > var6) {
              if (((qp) this).field_J[var6] != param1) {
                var6++;
                var6++;
                continue L1;
              } else {
                var7 = ((qp) this).field_M[var6];
                if (var7 == -1) {
                  ((qp) this).field_E.q(-77);
                  return;
                } else {
                  qd.b(38, ((qp) this).field_M[var6]);
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_L = null;
        field_G = null;
        if (param0 != 14) {
          String discarded$2 = qp.a(-121, true, 59);
          field_C = null;
          field_F = null;
          field_I = null;
          return;
        } else {
          field_C = null;
          field_F = null;
          field_I = null;
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (!(((qp) this).field_N < param1)) {
            return;
        }
        wi[] var7 = new wi[param1];
        wi[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = param0; ((qp) this).field_N > var5; var5++) {
            var7[var5] = ((qp) this).field_J[var5];
            var4[var5] = ((qp) this).field_M[var5];
        }
        ((qp) this).field_J = var3;
        ((qp) this).field_M = var4;
        ((qp) this).field_N = param1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, (int) (char)param1, param2, param3);
        int discarded$0 = ((qp) this).field_B.a(((qp) this).field_D, 14 + (param2 + ((qp) this).field_t), 10 + (((qp) this).field_g + param3), -28 + ((qp) this).field_n, ((qp) this).field_i, 16777215, -1, 0, 0, ((qp) this).field_B.field_G);
    }

    final wi a(String param0, jv param1, byte param2) {
        wi var4 = null;
        int var5 = 0;
        if (param2 != 79) {
          return null;
        } else {
          var4 = new wi(param0, param1);
          var4.field_r = (gj) (Object) new op();
          var5 = -2 + ((qp) this).field_i;
          ((qp) this).a(34 + ((qp) this).field_i, 1, 0, ((qp) this).field_n, 0);
          var4.a(30, param2 ^ 78, 7, ((qp) this).field_n + -14, var5);
          ((qp) this).a(-102, (fd) (Object) var4);
          return var4;
        }
    }

    final void a(byte param0, int param1, String param2) {
        int var4 = 0;
        Object var5 = null;
        var4 = ((qp) this).field_N;
        this.a(0, var4 + 1);
        ((qp) this).field_J[var4] = ((qp) this).a(param2, (jv) this, (byte) 79);
        if (param0 <= 53) {
          var5 = null;
          ((qp) this).a((byte) -105, -6, (String) null);
          ((qp) this).field_M[var4] = param1;
          return;
        } else {
          ((qp) this).field_M[var4] = param1;
          return;
        }
    }

    qp(wv param0, hu param1, String param2) {
        super(0, 0, 288, 0, (gj) null);
        ((qp) this).field_N = 0;
        ((qp) this).field_D = param2;
        ((qp) this).field_E = param0;
        ((qp) this).field_B = param1;
        int var4 = null == ((qp) this).field_D ? 0 : ((qp) this).field_B.c(((qp) this).field_D, 260, ((qp) this).field_B.field_G);
        ((qp) this).a(22 + var4, 1, 0, 288, 0);
    }

    final static String a(int param0, boolean param1, int param2) {
        if (5 != param0) {
          if (4 != param0) {
            if (-4 != (param0 ^ -1)) {
              if (1 != param0) {
                if (param0 != 2) {
                  if (param1) {
                    field_F = null;
                    throw new IllegalStateException();
                  } else {
                    throw new IllegalStateException();
                  }
                } else {
                  return rp.field_C;
                }
              } else {
                return vo.a((byte) -18, po.field_g, new String[2]);
              }
            } else {
              return lk.field_e;
            }
          } else {
            return vo.a((byte) -18, bd.field_B, new String[1]);
          }
        } else {
          return vo.a((byte) -18, fi.field_b, new String[1]);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Qualifying Round";
        field_I = new int[8192];
        field_F = "Please enter your age in years";
    }
}
