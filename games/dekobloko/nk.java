/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int field_b;
    static String field_c;
    static boolean field_k;
    private int field_a;
    private int field_o;
    private be field_m;
    private be field_n;
    static int field_g;
    private be[] field_e;
    private long field_h;
    static qm field_f;
    static int[] field_j;
    static String[][] field_d;
    static volatile int field_l;
    static boolean field_i;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_j = null;
        field_f = null;
        if (param0 > -31) {
            Object var2 = null;
            nk.a((w) null, (w) null, 83, -100, -58, (w) null, (byte[]) null, 7, 17, -108);
        }
    }

    final be b(int param0) {
        be var2_ref = null;
        int var2 = 0;
        int var3 = 0;
        be var4 = null;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (-1 <= (((nk) this).field_o ^ -1)) {
            break L0;
          } else {
            if (((nk) this).field_e[-1 + ((nk) this).field_o] != ((nk) this).field_m) {
              var2_ref = ((nk) this).field_m;
              ((nk) this).field_m = var2_ref.field_p;
              return var2_ref;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((nk) this).field_o >= ((nk) this).field_a) {
            var2 = -38 / ((param0 - -21) / 56);
            return null;
          } else {
            ((nk) this).field_o = ((nk) this).field_o + 1;
            var4 = ((nk) this).field_e[((nk) this).field_o].field_p;
            var2_ref = var4;
            if (var4 != ((nk) this).field_e[((nk) this).field_o + -1]) {
              ((nk) this).field_m = var2_ref.field_p;
              return var2_ref;
            } else {
              continue L1;
            }
          }
        }
    }

    final be d(int param0) {
        be var3 = null;
        int var4 = client.field_A ? 1 : 0;
        if (null == ((nk) this).field_n) {
            return null;
        }
        if (param0 != -17713) {
            return null;
        }
        be var2 = ((nk) this).field_e[(int)((long)(((nk) this).field_a - 1) & ((nk) this).field_h)];
        while (var2 != ((nk) this).field_n) {
            if (!(((nk) this).field_n.field_r != ((nk) this).field_h)) {
                var3 = ((nk) this).field_n;
                ((nk) this).field_n = ((nk) this).field_n.field_p;
                return var3;
            }
            ((nk) this).field_n = ((nk) this).field_n.field_p;
        }
        ((nk) this).field_n = null;
        return null;
    }

    final void a(be param0, int param1, long param2) {
        if (!(null == param0.field_v)) {
            param0.e((byte) 75);
        }
        be var5 = ((nk) this).field_e[(int)((long)(((nk) this).field_a - 1) & param2)];
        param0.field_p = var5;
        param0.field_v = var5.field_v;
        param0.field_v.field_p = param0;
        param0.field_r = param2;
        param0.field_p.field_v = param0;
        if (param1 != -1) {
            be discarded$0 = ((nk) this).b(85);
        }
    }

    final be c(int param0) {
        ((nk) this).field_o = 0;
        if (param0 != -9443) {
            field_i = true;
        }
        return ((nk) this).b(-81);
    }

    final static void a(w param0, w param1, int param2, int param3, int param4, w param5, byte[] param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        rb.field_k = param6;
        uc.field_g = -1L;
        hg.field_b = param3;
        j.field_b = param6.length;
        kk.field_l = new byte[(hg.field_b - -7) / 8];
        fj.field_h = false;
        g.field_N = null;
        cd.field_m = null;
        var10 = param2;
        var11 = 0;
        L0: while (true) {
          if (var11 >= rb.field_k.length) {
            L1: {
              var10 = (7 + var10) / 8;
              v.field_a = new byte[var10];
              if (null != param1.field_M) {
                break L1;
              } else {
                param1.field_M = new vj();
                break L1;
              }
            }
            L2: {
              i.field_b = param1.field_M;
              i.field_b.c(118);
              ob.field_i = new nk(param4);
              rf.field_o = -1;
              de.field_R = -1;
              cj.field_a = 0;
              ta.field_b = 0;
              if (null == param0.field_M) {
                param0.field_M = new vj();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              h.field_b = param0.field_M;
              h.field_b.c(param2 ^ 105);
              tg.field_b = new nk(param9);
              if (param5.field_M != null) {
                break L3;
              } else {
                param5.field_M = new vj();
                break L3;
              }
            }
            oc.field_b = param5.field_M;
            oc.field_b.c(121);
            hn.field_h = new nk(param8);
            oa.field_a = param7;
            km.field_C = 0L;
            return;
          } else {
            var10 = var10 + (255 & rb.field_k[var11]);
            var11++;
            continue L0;
          }
        }
    }

    final static boolean a(String param0, byte param1, tf param2, boolean param3, int param4, String param5, String param6) {
        if (!(uc.field_c == sh.field_d)) {
            return false;
        }
        wj var8 = new wj(ah.field_c, param2);
        ah.field_c.a((byte) -123, (ce) (Object) var8);
        if (dg.b(-40)) {
            var8.b(true);
        } else {
            ve.field_Gc = param0;
            ea.field_x = null;
            te.field_q = param6;
            sh.field_d = pa.field_V;
            qb.field_t = param5;
            jk.field_e = param4;
            cf.field_i = param3 ? true : false;
        }
        if (param1 <= 120) {
            return false;
        }
        return true;
    }

    nk(int param0) {
        int var2 = 0;
        be var3 = null;
        ((nk) this).field_o = 0;
        ((nk) this).field_e = new be[param0];
        ((nk) this).field_a = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new be();
            ((nk) this).field_e[var2] = new be();
            var3.field_v = var3;
            var3.field_p = var3;
        }
    }

    final be a(int param0, long param1) {
        be var5 = null;
        int var6 = client.field_A ? 1 : 0;
        ((nk) this).field_h = param1;
        be var4 = ((nk) this).field_e[(int)((long)(-1 + ((nk) this).field_a) & param1)];
        ((nk) this).field_n = var4.field_p;
        while (var4 != ((nk) this).field_n) {
            if ((((nk) this).field_n.field_r ^ -1L) == (param1 ^ -1L)) {
                var5 = ((nk) this).field_n;
                ((nk) this).field_n = ((nk) this).field_n.field_p;
                return var5;
            }
            ((nk) this).field_n = ((nk) this).field_n.field_p;
        }
        if (param0 != 24710) {
            Object var7 = null;
            boolean discarded$0 = nk.a((String) null, (byte) 91, (tf) null, false, 64, (String) null, (String) null);
        }
        ((nk) this).field_n = null;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The wildcard special item can be used in place of any other colour.";
        field_j = new int[8];
        field_d = new String[][]{new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2]};
        field_f = new qm(8, 0, 4, 1);
        field_l = 0;
        field_i = false;
    }
}
