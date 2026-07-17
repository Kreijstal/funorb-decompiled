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
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((de) this).field_S = stackIn_4_1 != 0;
              ((de) this).field_X = param9;
              ((de) this).field_L = param4;
              ((de) this).field_O = param7;
              ((de) this).field_T = param8;
              ((de) this).field_Y = param10;
              ((de) this).field_Q = param6;
              var12_int = -((de) this).field_O + ((de) this).field_Q;
              var13 = ((de) this).field_T.b(param10, var12_int, ((de) this).field_T.field_R) - -(((de) this).field_O * 2);
              if (var13 > param3) {
                ((de) this).b(var13, param2, param0, param1, -16555);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!((de) this).field_S) {
                stackOut_9_0 = ((de) this).field_Q - -(((de) this).field_O * 2);
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((de) this).field_L.b(-(((de) this).field_O * 2) + param3, param2 - ((de) this).field_Q + -(3 * ((de) this).field_O), var14, ((de) this).field_O + (var13 - param3 >> 1), -16555);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("de.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    public static void g() {
        field_W = null;
        field_V = null;
        field_P = null;
        field_U = null;
        field_ab = null;
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        int stackIn_25_0 = 0;
        String stackIn_25_1 = null;
        int stackIn_26_0 = 0;
        String stackIn_26_1 = null;
        int stackIn_27_0 = 0;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_24_0 = 0;
        String stackOut_24_1 = null;
        int stackOut_26_0 = 0;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_25_0 = 0;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ph.field_Ab = true;
              kk.field_k = param3;
              var11 = param2;
              if (!param4) {
                stackOut_3_0 = me.field_C;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = qn.field_rb;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (kk.field_k != 0) {
                if (kk.field_k == 1) {
                  var7 = te.a(var11, 104, 480, pj.field_N, wf.field_q);
                  var8 = 2 - -var7;
                  ug.field_q = new int[var8];
                  ef.field_M = new String[var8];
                  var9 = 0;
                  L3: while (true) {
                    if (var9 >= var8) {
                      ef.field_T = new int[1];
                      var9 = 0;
                      L4: while (true) {
                        if (var9 >= var7) {
                          ef.field_M[var8 + -2] = "";
                          ef.field_M[-1 + var8] = og.field_gb;
                          ug.field_q[-1 + var8] = 0;
                          ef.field_T[0] = 2;
                          break L2;
                        } else {
                          ef.field_M[var9] = pj.field_N[var9];
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      ug.field_q[var9] = -1;
                      var9++;
                      continue L3;
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
                L5: while (true) {
                  if (var9 >= var8) {
                    ef.field_T = new int[2];
                    var9 = 0;
                    L6: while (true) {
                      if (var9 >= var7) {
                        ef.field_M[-3 + var8] = "";
                        ef.field_M[var8 - 2] = var6;
                        ug.field_q[var8 + -2] = 0;
                        ef.field_T[0] = 1;
                        ef.field_M[-1 + var8] = og.field_gb;
                        ug.field_q[-1 + var8] = 1;
                        ef.field_T[1] = 2;
                        break L2;
                      } else {
                        ef.field_M[var9] = pj.field_N[var9];
                        var9++;
                        continue L6;
                      }
                    }
                  } else {
                    ug.field_q[var9] = -1;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
            wj.field_Jb.field_l = ef.field_T.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (var8 >= ef.field_M.length) {
                ac.field_A = (je.field_c + le.field_t << 1) * wj.field_Jb.field_l;
                fb.field_f = -(var7 >> 1) + (af.field_f + var7);
                ad.field_a = af.field_f - (var7 >> 1);
                var8 = 0;
                L8: while (true) {
                  if (var8 >= ef.field_M.length) {
                    rn.field_d = kk.field_e + -(ac.field_A >> 1);
                    wj.field_Jb.a(0, 0, pm.a(pm.field_f, -2141435999, bh.field_g), param0);
                    break L0;
                  } else {
                    L9: {
                      stackOut_35_0 = ac.field_A;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (ug.field_q[var8] < 0) {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = ma.field_I;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L9;
                      } else {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = vb.field_V;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L9;
                      }
                    }
                    ac.field_A = stackIn_38_0 + stackIn_38_1;
                    var8++;
                    continue L8;
                  }
                }
              } else {
                L10: {
                  stackOut_24_0 = 0;
                  stackOut_24_1 = ef.field_M[var8];
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  if (0 > ug.field_q[var8]) {
                    stackOut_26_0 = stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    break L10;
                  } else {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    break L10;
                  }
                }
                L11: {
                  var9 = qb.a(stackIn_27_0, stackIn_27_1, stackIn_27_2 != 0);
                  if (ug.field_q[var8] != -1) {
                    var9 = var9 + ba.field_d * 2;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var9 <= var7) {
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var8++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("de.B(").append(param0).append(44).append(-5540).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param3 + 44 + param4 + 41);
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
