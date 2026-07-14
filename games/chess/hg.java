/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static ci field_f;
    static wg field_b;
    static String field_a;
    static int[] field_d;
    int field_c;
    int field_e;

    final static int a(int param0, boolean param1, int param2) {
        if (!param1) {
          if ((param2 ^ -1) > -3) {
            if (5 <= param0) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          int discarded$7 = hg.a(-93, false, -114);
          if ((param2 ^ -1) > -3) {
            if (5 <= param0) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(int param0, int param1, ci param2, int param3, ci param4, int param5, boolean param6, int param7, ci param8, byte[] param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Chess.field_G;
        qh.field_g = param0;
        wk.field_e = param9;
        gb.field_t = -1L;
        qa.field_e = param9.length;
        g.field_f = new byte[(qh.field_g + 7) / 8];
        ud.field_b = false;
        pd.field_Rb = null;
        ib.field_d = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (wk.field_e.length <= var11) {
            L1: {
              var10 = (var10 + 7) / 8;
              fe.field_d = new byte[var10];
              if (null != param2.field_I) {
                break L1;
              } else {
                param2.field_I = new jc();
                break L1;
              }
            }
            if (param6) {
              L2: {
                bb.field_d = param2.field_I;
                bb.field_d.e(-31023);
                d.field_Mb = new dk(param5);
                fm.field_W = -1;
                jf.field_b = -1;
                cn.field_g = 0;
                cb.field_f = 0;
                if (param8.field_I == null) {
                  param8.field_I = new jc();
                  break L2;
                } else {
                  break L2;
                }
              }
              nk.field_t = param8.field_I;
              nk.field_t.e(-31023);
              ae.field_f = new dk(param1);
              if (param4.field_I != null) {
                pd.field_Sb = param4.field_I;
                pd.field_Sb.e(-31023);
                cm.field_v = new dk(param3);
                eg.field_e = 0L;
                ig.field_g = param7;
                return;
              } else {
                param4.field_I = new jc();
                pd.field_Sb = param4.field_I;
                pd.field_Sb.e(-31023);
                cm.field_v = new dk(param3);
                eg.field_e = 0L;
                ig.field_g = param7;
                return;
              }
            } else {
              return;
            }
          } else {
            var10 = var10 + (wk.field_e[var11] & 255);
            var11++;
            continue L0;
          }
        }
    }

    final static double a(byte param0, double param1, double param2) {
        if (param0 != 26) {
          field_a = null;
          return Math.sqrt(param1 * param1 + param2 * param2);
        } else {
          return Math.sqrt(param1 * param1 + param2 * param2);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 > -9) {
            field_a = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    hg(int param0, int param1, int param2, int param3) {
        ((hg) this).field_e = param0;
        ((hg) this).field_c = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OK";
    }
}
