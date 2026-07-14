/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private ad field_c;
    static ib field_b;
    private je field_a;
    private ad field_d;
    static int[] field_e;

    public static void a(int param0) {
        if (param0 != -18728) {
            field_b = null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    final static void a(String[] args, boolean param1) {
        if (nf.field_F == null) {
          if (param1) {
            if (sc.field_f != null) {
              sc.field_f.field_H.a(args, 560186724);
              return;
            } else {
              return;
            }
          } else {
            field_b = null;
            if (sc.field_f != null) {
              sc.field_f.field_H.a(args, 560186724);
              return;
            } else {
              return;
            }
          }
        } else {
          nf.field_F.field_G.a(args, 560186724);
          if (!param1) {
            field_b = null;
            if (sc.field_f == null) {
              return;
            } else {
              sc.field_f.field_H.a(args, 560186724);
              return;
            }
          } else {
            if (sc.field_f != null) {
              sc.field_f.field_H.a(args, 560186724);
              return;
            } else {
              return;
            }
          }
        }
    }

    final pi a(int param0, int param1) {
        pi var3 = null;
        pi var3_ref = null;
        byte[] var4 = null;
        var3 = (pi) ((wh) this).field_a.a((long)param0, (byte) 114);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1 < (param0 ^ -1)) {
              var4 = ((wh) this).field_d.b(255, param0, 1);
              break L0;
            } else {
              var4 = ((wh) this).field_c.b(255, 32767 & param0, 1);
              break L0;
            }
          }
          L1: {
            var3_ref = new pi();
            if (var4 != null) {
              var3_ref.a(new gk(var4), true);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 >= 32768) {
            var3_ref.e(0);
            ((wh) this).field_a.a((long)param0, (Object) (Object) var3_ref, -92);
            return var3_ref;
          } else {
            ((wh) this).field_a.a((long)param0, (Object) (Object) var3_ref, -92);
            return var3_ref;
          }
        }
    }

    final static void a(byte param0, le param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (-1 == (3 & (param1.field_j | param1.field_k) ^ -1)) {
            break L0;
          } else {
            var2 = 4 + -(3 & param1.field_k);
            var3 = -(3 & param1.field_j) + 4;
            var4 = var2 + param1.field_k;
            var5 = new int[var4 * (param1.field_j - -var3)];
            var6 = var3 * var4 - -var2;
            var7 = 0;
            L1: while (true) {
              if (param1.field_j <= var7) {
                param1.field_k = param1.field_k + var2;
                param1.field_j = param1.field_j + var3;
                param1.field_q = param1.field_q - var3;
                param1.field_r = param1.field_r - var2;
                param1.field_s = var5;
                break L0;
              } else {
                var8 = 0;
                L2: while (true) {
                  if (param1.field_k <= var8) {
                    var6 = var6 + var2;
                    var7++;
                    continue L1;
                  } else {
                    var6++;
                    var5[var6] = param1.field_s[var7 * param1.field_k - -var8];
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        if (param0 >= -66) {
          wh.a(-77);
          return;
        } else {
          return;
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ib();
    }
}
