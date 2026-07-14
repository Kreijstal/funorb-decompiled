/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class de extends ma {
    static int field_M;
    static ph field_W;
    private mm field_T;
    private int field_O;
    static qm field_U;
    static String field_ab;
    private boolean field_S;
    static String field_P;
    private int field_X;
    private int field_Q;
    static int field_R;
    static uf field_V;
    static boolean field_Z;
    private String field_Y;

    de(int param0, int param1, int param2, int param3, ce param4, boolean param5, int param6, int param7, mm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (gl) null, (kg) null);
        ((de) this).field_S = param5 ? true : false;
        ((de) this).field_X = param9;
        ((de) this).field_L = param4;
        ((de) this).field_O = param7;
        ((de) this).field_T = param8;
        ((de) this).field_Y = param10;
        ((de) this).field_Q = param6;
        int var12 = -((de) this).field_O + ((de) this).field_Q;
        int var13 = ((de) this).field_T.b(param10, var12, ((de) this).field_T.field_R) - -(((de) this).field_O * 2);
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((de) this).b(var13, param2, param0, param1, -16555);
        }
        int var14 = ((de) this).field_S ? 0 : ((de) this).field_Q - -(((de) this).field_O * 2);
        ((de) this).field_L.b(-(((de) this).field_O * 2) + param3, param2 - ((de) this).field_Q + -(3 * ((de) this).field_O), var14, ((de) this).field_O + (var13 - param3 >> 1459606401), -16555);
    }

    public static void g(int param0) {
        field_W = null;
        field_V = null;
        field_P = null;
        field_U = null;
        if (param0 >= -117) {
            field_P = null;
        }
        field_ab = null;
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        int stackIn_24_0 = 0;
        String stackIn_24_1 = null;
        int stackIn_25_0 = 0;
        String stackIn_25_1 = null;
        int stackIn_26_0 = 0;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_23_0 = 0;
        String stackOut_23_1 = null;
        int stackOut_25_0 = 0;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_24_0 = 0;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          ph.field_Ab = true;
          kk.field_k = param3;
          var11 = param2;
          if (!param4) {
            stackOut_2_0 = me.field_C;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qn.field_rb;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (-1 != (kk.field_k ^ -1)) {
            if ((kk.field_k ^ -1) == -2) {
              var7 = te.a(var11, 104, 480, pj.field_N, wf.field_q);
              var8 = 2 - -var7;
              ug.field_q = new int[var8];
              ef.field_M = new String[var8];
              var9 = 0;
              L2: while (true) {
                if (var9 >= var8) {
                  ef.field_T = new int[1];
                  var9 = 0;
                  L3: while (true) {
                    if (var9 >= var7) {
                      ef.field_M[var8 + -2] = "";
                      ef.field_M[-1 + var8] = og.field_gb;
                      ug.field_q[-1 + var8] = 0;
                      ef.field_T[0] = 2;
                      break L1;
                    } else {
                      ef.field_M[var9] = pj.field_N[var9];
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  ug.field_q[var9] = -1;
                  var9++;
                  continue L2;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            var7 = te.a(var11, 116, 480, pj.field_N, wf.field_q);
            var8 = var7 + 3;
            ug.field_q = new int[var8];
            ef.field_M = new String[var8];
            var9 = 0;
            L4: while (true) {
              if (var9 >= var8) {
                ef.field_T = new int[2];
                var9 = 0;
                L5: while (true) {
                  if (var9 >= var7) {
                    ef.field_M[-3 + var8] = "";
                    ef.field_M[var8 - 2] = var6;
                    ug.field_q[var8 + -2] = 0;
                    ef.field_T[0] = 1;
                    ef.field_M[-1 + var8] = og.field_gb;
                    ug.field_q[-1 + var8] = 1;
                    ef.field_T[1] = 2;
                    break L1;
                  } else {
                    ef.field_M[var9] = pj.field_N[var9];
                    var9++;
                    continue L5;
                  }
                }
              } else {
                ug.field_q[var9] = -1;
                var9++;
                continue L4;
              }
            }
          }
        }
        wj.field_Jb.field_l = ef.field_T.length;
        var7 = 0;
        var8 = 0;
        if (param1 == -5540) {
          L6: while (true) {
            if (var8 >= ef.field_M.length) {
              ac.field_A = (je.field_c + le.field_t << 1002777217) * wj.field_Jb.field_l;
              fb.field_f = -(var7 >> -1152159039) + (af.field_f + var7);
              ad.field_a = af.field_f - (var7 >> 1945551777);
              var8 = 0;
              L7: while (true) {
                if (var8 >= ef.field_M.length) {
                  rn.field_d = kk.field_e + -(ac.field_A >> 1639359713);
                  wj.field_Jb.a(0, 0, pm.a(pm.field_f, -2141435999, bh.field_g), param0);
                  return;
                } else {
                  L8: {
                    stackOut_34_0 = ac.field_A;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (ug.field_q[var8] < 0) {
                      stackOut_36_0 = stackIn_36_0;
                      stackOut_36_1 = ma.field_I;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L8;
                    } else {
                      stackOut_35_0 = stackIn_35_0;
                      stackOut_35_1 = vb.field_V;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L8;
                    }
                  }
                  ac.field_A = stackIn_37_0 + stackIn_37_1;
                  var8++;
                  continue L7;
                }
              }
            } else {
              L9: {
                stackOut_23_0 = 0;
                stackOut_23_1 = ef.field_M[var8];
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (0 > ug.field_q[var8]) {
                  stackOut_25_0 = stackIn_25_0;
                  stackOut_25_1 = (String) (Object) stackIn_25_1;
                  stackOut_25_2 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L9;
                } else {
                  stackOut_24_0 = stackIn_24_0;
                  stackOut_24_1 = (String) (Object) stackIn_24_1;
                  stackOut_24_2 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L9;
                }
              }
              L10: {
                var9 = qb.a(stackIn_26_0, stackIn_26_1, stackIn_26_2 != 0);
                if ((ug.field_q[var8] ^ -1) != 0) {
                  var9 = var9 + ba.field_d * 2;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (var9 > var7) {
                var7 = var9;
                var8++;
                continue L6;
              } else {
                var8++;
                continue L6;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param0 + ((de) this).field_u;
        int var6 = ((de) this).field_D - -param3;
        if (param1 > -103) {
            return;
        }
        super.a(param0, -109, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        int var7 = ((de) this).field_S ? ((de) this).field_t + (-((de) this).field_Q + -(2 * ((de) this).field_O)) : 0;
        int discarded$0 = ((de) this).field_T.a(((de) this).field_Y, var7 + var5 + ((de) this).field_O, var6 - -((de) this).field_O, -((de) this).field_O + ((de) this).field_Q, ((de) this).field_y + -(2 * ((de) this).field_O), ((de) this).field_X, -1, ((de) this).field_S ? 0 : 2, 1, ((de) this).field_T.field_R);
    }

    final static ck[] c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = client.field_A ? 1 : 0;
        ck[] var1 = new ck[ec.field_g];
        for (var2 = 0; var2 < ec.field_g; var2++) {
            var3 = hc.field_c[var2] * tm.field_a[var2];
            var4 = tc.field_Nb[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = mb.field_d[lb.a((int) var4[var6], 255)];
            }
            var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var5);
        }
        oa.a(126);
        if (param0) {
            field_W = null;
        }
        return var1;
    }

    final String c(byte param0) {
        int var2 = ((de) this).field_L.field_q ? 1 : 0;
        ((de) this).field_L.field_q = ((de) this).field_q;
        String var3 = ((de) this).field_L.c(param0);
        ((de) this).field_L.field_q = var2 != 0 ? true : false;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "If you do nothing the game will revert to normal view in <%0> second.";
        field_P = "Instructions";
        field_Z = false;
        field_U = new qm(12, 0, 1, 0);
    }
}
