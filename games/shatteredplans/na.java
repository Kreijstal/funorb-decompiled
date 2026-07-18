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

    public static void b() {
        int var1 = 0;
        field_s = null;
        field_J = null;
        field_u = null;
        field_I = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param2 = fr.a(param2, 1, '_', "");
              int discarded$4 = 1;
              var3 = dn.a(param2);
              if (param1 >= 126) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$5 = na.a((String) null, 75, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-1 != param0.indexOf(param2)) {
                  break L3;
                } else {
                  if (param0.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("na.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (oq.field_i != null) {
              return;
            } else {
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
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= 5) {
                  ub.field_Db[4] = ua.field_c;
                  ub.field_Db[2] = tc.field_E;
                  break L0;
                } else {
                  w.field_J[0][var1_int] = Integer.toString(var1_int);
                  ub.field_Db[0][var1_int] = be.field_i;
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "na.B(" + 51 + ')');
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
