/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends gg {
    int field_h;
    static String field_m;
    static boolean field_p;
    static int field_i;
    int field_q;
    int field_l;
    int field_n;
    int field_j;
    int field_o;
    static int field_k;

    public static void a(int param0) {
        field_m = null;
        if (param0 != 0) {
            boolean discarded$0 = bl.a((byte) 16);
        }
    }

    final static od a(od param0, int[] param1, byte param2) {
        od var3 = null;
        Object var4 = null;
        if (param2 != 100) {
          var4 = null;
          od discarded$1 = bl.a((od) null, (int[]) null, (byte) -77);
          var3 = new od(0, 0, 0);
          var3.field_m = param1;
          var3.field_b = param0.field_b;
          var3.field_a = param0.field_a;
          var3.field_i = param0.field_i;
          var3.field_n = param0.field_n;
          var3.field_d = param0.field_d;
          var3.field_l = param0.field_l;
          var3.field_j = param0.field_j;
          return var3;
        } else {
          var3 = new od(0, 0, 0);
          var3.field_m = param1;
          var3.field_b = param0.field_b;
          var3.field_a = param0.field_a;
          var3.field_i = param0.field_i;
          var3.field_n = param0.field_n;
          var3.field_d = param0.field_d;
          var3.field_l = param0.field_l;
          var3.field_j = param0.field_j;
          return var3;
        }
    }

    final static boolean a(byte param0) {
        if (param0 == -81) {
          if (kj.field_R <= -21) {
            if (bb.h(param0 + -44)) {
              if (-1 < c.field_H) {
                if (rd.b(6144)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$5 = bl.a((byte) -9);
          if (kj.field_R <= -21) {
            if (bb.h(param0 + -44)) {
              if (-1 < c.field_H) {
                if (rd.b(6144)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static od[] b(boolean param0) {
        od[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        var1 = new od[nb.field_c];
        if (param0) {
          od[] discarded$1 = bl.b(false);
          var2 = 0;
          L0: while (true) {
            if (nb.field_c <= var2) {
              og.a((byte) -97);
              return var1;
            } else {
              var1[var2] = new od(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], jc.field_c[var2], ig.field_H);
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          L1: while (true) {
            if (nb.field_c <= var2) {
              og.a((byte) -97);
              return var1;
            } else {
              var1[var2] = new od(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], jc.field_c[var2], ig.field_H);
              var2++;
              continue L1;
            }
          }
        }
    }

    bl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((bl) this).field_q = param2;
        ((bl) this).field_j = param1;
        ((bl) this).field_h = param3;
        ((bl) this).field_n = param0;
        ((bl) this).field_l = param5;
        ((bl) this).field_o = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = false;
        field_m = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
