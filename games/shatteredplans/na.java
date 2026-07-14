/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class na {
    int field_x;
    byte[][] field_C;
    int field_g;
    int field_B;
    byte field_v;
    boolean[] field_a;
    byte[] field_c;
    int field_m;
    int field_z;
    int[][] field_y;
    int field_f;
    int field_p;
    int field_G;
    int[] field_q;
    int field_w;
    static Random field_u;
    int field_b;
    int[] field_i;
    int field_j;
    int[][] field_o;
    boolean[] field_M;
    byte[] field_D;
    byte[] field_A;
    int[][] field_H;
    byte[] field_t;
    byte[] field_n;
    int field_k;
    int field_e;
    int[] field_l;
    int[] field_K;
    static gq field_I;
    byte[] field_E;
    int field_h;
    static pf field_J;
    static int field_L;
    static String field_s;
    static int field_r;
    int field_d;
    static int field_F;

    public static void b(byte param0) {
        int var1 = 104 % ((-30 - param0) / 39);
        field_s = null;
        field_J = null;
        field_u = null;
        field_I = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param2 = fr.a(param2, 1, '_', "");
          var3 = dn.a(param2, true);
          if (param1 >= 126) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$2 = na.a((String) null, 75, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 != param0.indexOf(param2)) {
              break L2;
            } else {
              if (0 == (param0.indexOf(var3) ^ -1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (oq.field_i != null) {
          return;
        } else {
          L0: {
            ga.field_L = rs.field_zb + uq.field_h;
            rj.field_r = rs.field_zb + an.field_a;
            oq.field_i = new String[33];
            oq.field_i[14] = tm.field_o;
            oq.field_i[0] = wm.field_f;
            oq.field_i[7] = sn.field_b;
            oq.field_i[4] = lr.field_e;
            oq.field_i[12] = ar.field_g;
            oq.field_i[1] = km.field_a;
            oq.field_i[8] = cj.field_v;
            oq.field_i[5] = ro.field_e;
            if (param0 >= 6) {
              break L0;
            } else {
              field_u = null;
              break L0;
            }
          }
          oq.field_i[10] = uc.field_y;
          oq.field_i[9] = null;
          oq.field_i[6] = ro.field_e;
          oq.field_i[2] = t.field_a;
          oq.field_i[15] = bf.field_a[0];
          oq.field_i[27] = fe.field_z;
          oq.field_i[21] = wd.field_Q;
          oq.field_i[32] = ga.field_L;
          oq.field_i[19] = ul.field_Fb[1];
          oq.field_i[17] = bf.field_a[2];
          oq.field_i[28] = lm.field_a;
          oq.field_i[30] = ee.field_j;
          oq.field_i[29] = tp.field_k;
          oq.field_i[20] = rl.field_d;
          oq.field_i[24] = lq.field_p;
          oq.field_i[26] = ee.field_n;
          oq.field_i[31] = ep.field_d;
          oq.field_i[25] = ii.field_v;
          oq.field_i[23] = ur.field_Db;
          oq.field_i[16] = bf.field_a[1];
          oq.field_i[18] = ul.field_Fb[0];
          oq.field_i[22] = rs.field_zb;
          jo.field_g[0] = ih.field_e;
          jo.field_g[9] = in.field_a;
          jo.field_g[7] = rp.field_J;
          jo.field_g[11] = qe.field_l;
          jo.field_g[3] = tc.field_D;
          jo.field_g[14] = ss.field_d;
          jo.field_g[5] = rg.field_g;
          jo.field_g[8] = ck.field_d;
          jo.field_g[4] = lk.field_D;
          jo.field_g[6] = ms.field_f;
          jo.field_g[10] = w.field_H;
          jo.field_g[12] = am.field_zb;
          jo.field_g[2] = rq.field_c;
          jo.field_g[15] = af.field_c;
          jo.field_g[13] = kh.field_Eb;
          jo.field_g[1] = gq.field_g;
          bk.field_b[6] = en.field_e;
          bk.field_b[11] = vo.field_a;
          bk.field_b[0] = qk.field_v;
          bk.field_b[15] = ta.field_e;
          bk.field_b[13] = oo.field_d;
          bk.field_b[4] = vs.field_c;
          bk.field_b[12] = vs.field_b;
          bk.field_b[14] = ch.field_b;
          bk.field_b[1] = np.field_l;
          bk.field_b[5] = rk.field_m;
          bk.field_b[10] = nd.field_b;
          bk.field_b[9] = ln.field_P;
          bk.field_b[8] = nr.field_s;
          bk.field_b[7] = me.field_f;
          bk.field_b[2] = nf.field_m;
          bk.field_b[3] = wa.field_i;
          w.field_J[0] = new String[5];
          ub.field_Db = new String[5][];
          ub.field_Db[0] = new String[5];
          var1 = 0;
          L1: while (true) {
            if ((var1 ^ -1) <= -6) {
              ub.field_Db[4] = ua.field_c;
              ub.field_Db[2] = tc.field_E;
              return;
            } else {
              w.field_J[0][var1] = Integer.toString(var1);
              ub.field_Db[0][var1] = be.field_i;
              var1++;
              continue L1;
            }
          }
        }
    }

    na() {
        ((na) this).field_C = new byte[6][258];
        ((na) this).field_c = new byte[18002];
        ((na) this).field_o = new int[6][258];
        ((na) this).field_D = new byte[4096];
        ((na) this).field_b = 0;
        ((na) this).field_M = new boolean[16];
        ((na) this).field_y = new int[6][258];
        ((na) this).field_t = new byte[18002];
        ((na) this).field_A = new byte[256];
        ((na) this).field_K = new int[16];
        ((na) this).field_i = new int[6];
        ((na) this).field_l = new int[257];
        ((na) this).field_a = new boolean[256];
        ((na) this).field_q = new int[256];
        ((na) this).field_H = new int[6][258];
        ((na) this).field_d = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new Random();
        field_I = new gq(9, 0, 4, 1);
        field_s = "Production";
        field_J = new pf();
        field_F = 0;
    }
}
