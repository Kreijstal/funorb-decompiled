/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((de) (this)).field_S = stackIn_4_1 != 0;
              this.field_X = param9;
              this.field_L = param4;
              this.field_O = param7;
              this.field_T = param8;
              this.field_Y = param10;
              this.field_Q = param6;
              var12_int = -this.field_O + this.field_Q;
              var13 = this.field_T.b(param10, var12_int, this.field_T.field_R) - -(this.field_O * 2);
              if (var13 > param3) {
                this.b(var13, param2, param0, param1, -16555);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_S) {
                stackIn_10_0 = this.field_Q - -(this.field_O * 2);
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_L.b(-(this.field_O * 2) + param3, param2 - this.field_Q + -(3 * this.field_O), var14, this.field_O + (var13 - param3 >> 1459606401), -16555);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("de.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    public static void g(int param0) {
        field_W = null;
        field_V = null;
        field_P = null;
        field_U = null;
        if (param0 >= -117) {
            field_P = (String) null;
        }
        field_ab = null;
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        String stackIn_4_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_26_1 = null;
        int stackIn_27_0 = 0;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ph.field_Ab = true;
              kk.field_k = param3;
              var11 = param2;
              if (!param4) {
                stackIn_4_0 = me.field_C;
                break L1;
              } else {
                stackIn_4_0 = qn.field_rb;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (-1 != (kk.field_k ^ -1)) {
                if ((kk.field_k ^ -1) == -2) {
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
            if (param1 == -5540) {
              L7: while (true) {
                if (var8 >= ef.field_M.length) {
                  ac.field_A = (je.field_c + le.field_t << 1002777217) * wj.field_Jb.field_l;
                  fb.field_f = -(var7 >> -1152159039) + (af.field_f + var7);
                  ad.field_a = af.field_f - (var7 >> 1945551777);
                  var8 = 0;
                  L8: while (true) {
                    if (var8 >= ef.field_M.length) {
                      rn.field_d = kk.field_e + -(ac.field_A >> 1639359713);
                      wj.field_Jb.a(0, 0, pm.a(pm.field_f, -2141435999, bh.field_g), param0);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L9: {
                        stackIn_37_0 = ac.field_A;

                        if (ug.field_q[var8] < 0) {
                          stackIn_38_0 = stackIn_37_0;
                          stackIn_38_1 = ma.field_I;
                          break L9;
                        } else {
                          stackIn_38_0 = stackIn_37_0;
                          stackIn_38_1 = vb.field_V;
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
                    stackIn_26_0 = 0;

                    stackIn_26_1 = ef.field_M[var8];

                    if (0 > ug.field_q[var8]) {
                      stackIn_27_0 = stackIn_26_0;
                      stackIn_27_1 = (String) ((Object) stackIn_26_1);
                      stackIn_27_2 = 0;
                      break L10;
                    } else {
                      stackIn_27_0 = stackIn_26_0;
                      stackIn_27_1 = (String) ((Object) stackIn_26_1);
                      stackIn_27_2 = 1;
                      break L10;
                    }
                  }
                  L11: {
                    var9 = qb.a(stackIn_27_0, stackIn_27_1, stackIn_27_2 != 0);
                    if ((ug.field_q[var8] ^ -1) != 0) {
                      var9 = var9 + ba.field_d * 2;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (var9 > var7) {
                    var7 = var9;
                    var8++;
                    continue L7;
                  } else {
                    var8++;
                    continue L7;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var5);

            stackIn_43_1 = new StringBuilder().append("de.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L12;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param0 + this.field_u;
        int var6 = this.field_D - -param3;
        if (param1 > -103) {
            return;
        }
        super.a(param0, -109, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        int var7 = this.field_S ? this.field_t + (-this.field_Q + -(2 * this.field_O)) : 0;
        this.field_T.a(this.field_Y, var7 + var5 + this.field_O, var6 - -this.field_O, -this.field_O + this.field_Q, this.field_y + -(2 * this.field_O), this.field_X, -1, this.field_S ? 0 : 2, 1, this.field_T.field_R);
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
            field_W = (ph) null;
        }
        return var1;
    }

    final String c(byte param0) {
        int var2 = this.field_L.field_q ? 1 : 0;
        this.field_L.field_q = this.field_q;
        String var3 = this.field_L.c(param0);
        this.field_L.field_q = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_ab = "If you do nothing the game will revert to normal view in <%0> second.";
        field_P = "Instructions";
        field_Z = false;
        field_U = new qm(12, 0, 1, 0);
    }
}
