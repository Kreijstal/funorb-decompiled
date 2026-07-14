/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends jc {
    static String field_n;
    private int field_r;
    private mm field_s;
    static String field_o;
    static char[] field_q;
    static km field_p;

    final void g(int param0, int param1) {
        ((hg) this).field_l = ((hg) this).field_l + 1;
        ((hg) this).field_g[((hg) this).field_l] = (byte)(param0 + ((hg) this).field_s.a(5180));
        if (param1 == 8) {
          return;
        } else {
          field_o = null;
          return;
        }
    }

    hg(byte[] param0) {
        super(param0);
    }

    final void j(int param0) {
        ((hg) this).field_r = param0 * ((hg) this).field_l;
    }

    final void k(int param0) {
        ((hg) this).field_l = (param0 + ((hg) this).field_r) / 8;
    }

    final void a(int[] param0, boolean param1) {
        ((hg) this).field_s = new mm(param0);
        if (!param1) {
            return;
        }
        int discarded$0 = ((hg) this).c((byte) -30, 7);
    }

    hg(int param0) {
        super(param0);
    }

    final int c(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = ((hg) this).field_r >> 1846173027;
        var4 = -(((hg) this).field_r & 7) + 8;
        ((hg) this).field_r = ((hg) this).field_r + param1;
        var5 = 0;
        if (param0 == -78) {
          L0: while (true) {
            if (param1 <= var4) {
              L1: {
                if (param1 == var4) {
                  var5 = var5 + (((hg) this).field_g[var3] & lh.field_b[var4]);
                  break L1;
                } else {
                  var5 = var5 + (((hg) this).field_g[var3] >> var4 + -param1 & lh.field_b[param1]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((lh.field_b[var4] & ((hg) this).field_g[var3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ((hg) this).field_r = 29;
          L2: while (true) {
            if (param1 <= var4) {
              L3: {
                if (param1 == var4) {
                  var5 = var5 + (((hg) this).field_g[var3] & lh.field_b[var4]);
                  break L3;
                } else {
                  var5 = var5 + (((hg) this).field_g[var3] >> var4 + -param1 & lh.field_b[param1]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((lh.field_b[var4] & ((hg) this).field_g[var3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0 != 103) {
            return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          if (param3 <= var5) {
            if (param0 > -103) {
              int discarded$2 = ((hg) this).c((byte) 114, 127);
              return;
            } else {
              return;
            }
          } else {
            ((hg) this).field_l = ((hg) this).field_l + 1;
            param2[var5 + param1] = (byte)(((hg) this).field_g[((hg) this).field_l] + -((hg) this).field_s.a(5180));
            var5++;
            continue L0;
          }
        }
    }

    final int e(boolean param0) {
        if (param0) {
          return -55;
        } else {
          ((hg) this).field_l = ((hg) this).field_l + 1;
          return ((hg) this).field_g[((hg) this).field_l] + -((hg) this).field_s.a(5180) & 255;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Play again";
        field_q = new char[128];
        field_o = "This game has started.";
    }
}
