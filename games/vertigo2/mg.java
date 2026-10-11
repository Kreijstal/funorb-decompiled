/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends oh {
    private int field_P;
    static int[] field_J;
    private String field_U;
    static nj field_N;
    private int field_I;
    private boolean field_H;
    private cc field_K;
    static nk[][] field_S;
    private int field_Q;
    static boolean field_O;
    static String field_T;
    static String field_L;
    static String field_G;
    static od field_R;
    static cr[] field_M;

    mg(int param0, int param1, int param2, int param3, iq param4, boolean param5, int param6, int param7, cc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ur) null, (uf) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_P = param9;
          this.field_I = param6;
          this.field_Q = param7;
          this.field_K = param8;
          this.field_C = param4;
          this.field_U = param10;
          stackIn_4_1 = (param5);
          this.field_H = stackIn_4_1;
          var12_int = this.field_I - this.field_Q;
          var13 = this.field_K.a(param10, var12_int, this.field_K.field_z) + this.field_Q * 2;
          if (param3 < var13) {
            this.a(false, param0, param1, var13, param2);
          } else {
            var13 = param3;
          }
          if (this.field_H) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_I + this.field_Q * 2;
          }
          var14 = stackIn_10_0;
          this.field_C.a(false, var14, (-param3 + var13 >> 1) + this.field_Q, -(2 * this.field_Q) + param3, param2 - this.field_I - 3 * this.field_Q);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_o;
        int var6 = param3 + this.field_t;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        int var7 = this.field_H ? -(2 * this.field_Q) - this.field_I + this.field_n : 0;
        this.field_K.a(this.field_U, this.field_Q + var7 + var5, var6 + this.field_Q, -this.field_Q + this.field_I, -(2 * this.field_Q) + this.field_s, this.field_P, -1, !this.field_H ? 2 : 0, 1, this.field_K.field_z);
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        if (null == bb.field_F) {
          bb.field_F = new fg(ch.field_e, eg.field_t);
          ch.field_e.b(bb.field_F, 0);
        }
        bb.field_F.a(param2, 4210752, param1, param3);
        if (param0 != 1) {
          return;
        }
        try {
          bi.c();
          mh.a(true, false);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, uh param3) {
        nk dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        nk stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        nk stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        nk stackIn_76_0 = null;
        boolean stackIn_77_1 = false;
        nk stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        boolean stackIn_83_1 = false;
        nk stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        boolean stackIn_89_2 = false;
        nk stackIn_93_0 = null;
        boolean stackIn_94_1 = false;
        int stackIn_98_0 = 0;
        nk stackIn_114_0 = null;
        boolean stackIn_115_1 = false;
        nk stackIn_118_0 = null;
        boolean stackIn_119_1 = false;
        nk stackIn_122_0 = null;
        boolean stackIn_123_1 = false;
        nk stackIn_126_0 = null;
        boolean stackIn_127_1 = false;
        String stackIn_142_0 = null;
        nk stackIn_146_0 = null;
        boolean stackIn_147_1 = false;
        nk stackIn_149_0 = null;
        boolean stackIn_150_1 = false;
        int stackIn_156_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_216_0 = 0;
        nk stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        boolean stackIn_319_2 = false;
        nk stackIn_321_0 = null;
        byte stackIn_321_1 = 0;
        int stackIn_321_2 = 0;
        int stackIn_321_3 = 0;
        boolean stackIn_324_1 = false;
        nk stackIn_328_0 = null;
        boolean stackIn_329_1 = false;
        nk stackIn_333_0 = null;
        boolean stackIn_334_1 = false;
        RuntimeException stackIn_342_0 = null;
        StringBuilder stackIn_342_1 = null;
        String stackIn_343_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        nk[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nk var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        nk var28 = null;
        nk var29 = null;
        nk[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2) {
            stackIn_12_0 = (qn.field_q) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (cn.b(false)) {
              stackIn_8_0 = (!param3.field_kc) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          var5 = param0 ? 1 : 0;
          if (!param2) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                field_S[0][1 + var6].field_tb != 0 &&
                var6 != param3.field_Ub) {
                param3.field_Ub = var6;
                var5 = 1;
              }
              stackIn_23_0 = field_S[0][var6 + 1];
              stackIn_24_1 = (var4_int != 0);
              stackIn_23_0.field_lb = stackIn_24_1;
              if (!db.field_S &&
                var6 == 3) {
                field_S[0][1 + var6].field_lb = false;
              }
              stackIn_30_0 = field_S[0][1 + var6];
              stackIn_31_1 = (var6 == param3.field_Ub);
              stackIn_30_0.field_V = stackIn_31_1;
            }
            if (field_S[0][2].field_G) {
              if (cn.b(false)) {
                ko.field_S = qn.field_z;
              } else {
                ko.field_S = Vertigo2.a(new String[]{gd.field_j.field_Nb}, e.field_e, 77);
              }
            }
          }
          if (2 <= rc.field_a.length) {
            if (param2) {
              stackIn_44_0 = (-1 != np.field_Ob) ? 1 : 0;
            } else {
              stackIn_44_0 = 0;
            }
            var6Lifetime1 = stackIn_44_0;
            if (var6Lifetime1 != 0) {
              var7 = np.field_Ob;
              for (var8_int = 0; qc.field_w.length > var8_int; var8_int++) {
                qc.field_w[var8_int] = (byte) 0;
              }
              qc.field_w[var7 / 8] = (byte)om.a((int) qc.field_w[var7 / 8], 1 << var7 % 8);
            }
            stackIn_52_0 = (!param2) ? 0 : -1;
            for (var7 = stackIn_52_0; rc.field_a.length > var7; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_60_0 = (var7 != np.field_Ob) ? 1 : 0;
              } else {
                stackIn_60_0 = 0;
              }
              var8_intLifetime1 = stackIn_60_0;
              if (var4_int != 0 &&
                field_S[1][1 + var7].field_tb != 0) {
                if (param2) {
                  if (var6Lifetime1 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < qc.field_w.length; var9++) {
                        qc.field_w[var9] = (byte) 0;
                      }
                    } else {
                      qc.field_w[var7 / 8] = (byte)tk.a((int) qc.field_w[var7 / 8], 1 << b.a(var7, 7));
                    }
                  }
                } else {
                  var9 = rc.field_a[var7];
                  if (var9 != param3.field_uc) {
                    param3.field_uc = var9;
                    var5 = 1;
                  }
                }
              }
              if (param2) {
                if (var7 == -1) {
                  field_S[1][var7 + 1].field_V = true;
                  for (var9 = 0; var9 < rc.field_a.length; var9++) {
                    dupTemp$0 = field_S[1][1 + var7];
                    stackIn_88_0 = dupTemp$0;
                    stackIn_88_1 = dupTemp$0.field_V;
                    stackIn_89_2 = ((qc.field_w[var9 / 8] & 1 << (7 & var9)) == 0);
                    stackIn_88_0.field_V = stackIn_88_1 & stackIn_89_2;
                  }
                } else {
                  stackIn_80_0 = field_S[1][var7 + 1];
                  stackIn_80_1 = ~(qc.field_w[var7 / 8] & 1 << (var7 & 7));
                  stackIn_80_2 = -1;
                  stackIn_83_1 = (stackIn_80_1 != stackIn_80_2);
                  stackIn_80_0.field_V = stackIn_83_1;
                }
              } else {
                var9 = rc.field_a[var7];
                stackIn_76_0 = field_S[1][1 + var7];
                stackIn_77_1 = (param3.field_uc == var9);
                stackIn_76_0.field_V = stackIn_77_1;
              }
              stackIn_93_0 = field_S[1][1 + var7];
              stackIn_94_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_93_0.field_lb = stackIn_94_1;
            }
          }
          stackIn_98_0 = (!param2) ? 1 : 0;
          for (var6Lifetime2 = stackIn_98_0; 3 > var6Lifetime2; var6Lifetime2++) {
            var28 = field_S[2][var6Lifetime2];
            if (var4_int != 0 &&
              0 != var28.field_tb) {
              if (!param2) {
                if (param3.field_xc != var6Lifetime2) {
                  param3.field_xc = var6Lifetime2;
                  var5 = 1;
                }
              } else {
                if (var6Lifetime2 != 0) {
                  kg.field_y = kg.field_y ^ var6Lifetime2;
                } else {
                  kg.field_y = 0;
                }
              }
            }
            if (!param2) {
              stackIn_122_0 = var28;
              stackIn_123_1 = (0 != (param3.field_xc & var6Lifetime2));
              stackIn_122_0.field_V = stackIn_123_1;
            } else {
              if (var6Lifetime2 != 0) {
                stackIn_118_0 = var28;
                stackIn_119_1 = ((var6Lifetime2 & kg.field_y) != 0);
                stackIn_118_0.field_V = stackIn_119_1;
              } else {
                stackIn_114_0 = var28;
                stackIn_115_1 = (kg.field_y == 0);
                stackIn_114_0.field_V = stackIn_115_1;
              }
            }
            stackIn_126_0 = var28;
            stackIn_127_1 = (var4_int != 0);
            stackIn_126_0.field_lb = stackIn_127_1;
          }
          if (param2 &&
            sp.field_O > 1) {
            for (var6Lifetime3 = 0; var6Lifetime3 < sp.field_O + 1; var6Lifetime3++) {
              var29 = field_S[3][var6Lifetime3];
              if (var4_int != 0 &&
                var29.field_tb != 0) {
                ua.field_a = var6Lifetime3;
              }
              if (var29.field_G &&
                var6Lifetime3 > 0) {
                if (lh.field_c == null) {
                  stackIn_142_0 = null;
                } else {
                  stackIn_142_0 = lh.field_c[var6Lifetime3 - 1];
                }
                var8 = stackIn_142_0;
                if (var8 != null) {
                  ko.field_S = var8;
                }
              }
              stackIn_146_0 = var29;
              stackIn_147_1 = (var4_int != 0);
              stackIn_146_0.field_lb = stackIn_147_1;
              stackIn_149_0 = var29;
              stackIn_150_1 = (var6Lifetime3 == ua.field_a);
              stackIn_149_0.field_V = stackIn_150_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = 0; ol.field_A > var7; var7++) {
            var30 = field_S[var7 + 4];
            var8_array = var30;
            stackIn_156_0 = (!param2) ? 0 : -1;
            for (var9 = stackIn_156_0; var30.length - 1 > var9; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (il.field_b != null &&
                  null != il.field_b[var7] &&
                  (il.field_b[var7][var9] & ~ob.field_L) > 0) {
                  var15 = ib.a(~ob.field_L & il.field_b[var7][var9], (byte) 79);
                  var14 = 1;
                }
                if (null != sf.field_f &&
                  sf.field_f[var7] != null &&
                  q.field_y <= 0 &&
                  sf.field_f[var7][var9]) {
                  var10 = 1;
                }
                if (null != te.field_D &&
                  te.field_D[var7] != null) {
                  var16 = te.field_D[var7][var9];
                  if (var16 > 0 &&
                    rp.field_a < var16) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !vb.field_g &&
                    q.field_y <= 0) {
                    var10 = 1;
                  }
                }
                if (null != qh.field_e &&
                  null != qh.field_e[var7]) {
                  var16Lifetime2 = qh.field_e[var7][var9];
                  if (0 != var16Lifetime2 &&
                    !vb.field_g &&
                    q.field_y <= 0) {
                    var10 = 1;
                  }
                  if (0 < var16Lifetime2 &&
                    qn.field_w < var16Lifetime2) {
                    var11 = 1;
                  }
                }
                if (param2) {
                  if (null != dl.field_b) {
                    if (dl.field_b[var7] != null) {
                      stackIn_204_0 = (!dl.field_b[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_204_0 = 0;
                    }
                  } else {
                    stackIn_204_0 = 0;
                  }
                } else {
                  stackIn_204_0 = 0;
                }
                var13 = stackIn_204_0;
              }
              if (2 <= fn.field_z &&
                cr.field_eb[12]) {
                var13 = 0;
                var14 = 0;
                var10 = 0;
                var11 = 0;
                var12 = 0;
              }
              gd.field_r = true;
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_216_0 = 0;
                } else {
                  stackIn_216_0 = 1;
                }
              } else {
                stackIn_216_0 = 1;
              }
              var16Lifetime1 = stackIn_216_0;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                gr.field_W != null && (!param2 ||
                !qn.field_q)) {
                ng.field_a = false;
                if (null == e.field_c) {
                  mn.field_t = new boolean[ol.field_A];
                  e.field_c = new byte[ol.field_A];
                }
                gd.field_r = false;
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  mn.field_t[var17_int] = false;
                }
                uq.a(param3, var7, 20473, 0, -1, var9, -1, param2);
                if (fn.field_z >= 2 &&
                  cr.field_eb[12]) {
                  gd.field_r = true;
                }
                if (!gd.field_r) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[var9 + 1];
              if (var4_int != 0 &&
                var17.field_tb != 0) {
                if (!param2) {
                  if (var16Lifetime1 == 0 &&
                    param3.field_fc[var7] != (byte)var9) {
                    param3.field_fc[var7] = (byte)var9;
                    var5 = 1;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; var18 < var30.length + (var6Lifetime4 - 1); var18++) {
                      dj.field_a[var18 / 8] = (byte)b.a((int) dj.field_a[var18 / 8], ~(1 << b.a(7, var18)));
                    }
                  } else {
                    dj.field_a[(var9 + var6Lifetime4) / 8] = (byte)tk.a((int) dj.field_a[(var9 + var6Lifetime4) / 8], 1 << b.a(7, var9 + var6Lifetime4));
                  }
                }
              }
              if (param2 &&
                var16Lifetime1 != 0) {
                dj.field_a[(var6Lifetime4 + var9) / 8] = (byte)b.a((int) dj.field_a[(var6Lifetime4 + var9) / 8], ~(1 << b.a(7, var6Lifetime4 + var9)));
              }
              if (var9 >= 0 &&
                var17.field_G) {
                if (null != rf.field_m) {
                  if (rf.field_m[var7] != null) {
                    var18_ref = rf.field_m[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                } else {
                  var18_ref = null;
                }
                if (an.field_f == null) {
                  var19 = null;
                } else {
                  if (null != an.field_f[var7]) {
                    var19 = an.field_f[var7][var9];
                  } else {
                    var19 = null;
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 == 0) {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = qh.field_e[var7][var9] - qn.field_w;
                      if (var22_int == 1) {
                        var21 = jm.field_D;
                      } else {
                        var21 = Vertigo2.a(new String[]{Integer.toString(var22_int)}, kk.field_h, 53);
                      }
                    }
                    if (var12 != 0) {
                      var31 = Vertigo2.a(new String[]{Integer.toString(rp.field_a), Integer.toString(te.field_D[var7][var9])}, mf.field_a, -120);
                      var21 = var31;
                      var21 = var31;
                      if (var21 == null) {
                        var21 = var31;
                      } else {
                        var21 = (String) (var21) + "<br>" + var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = ld.field_c;
                      if (0 < var15 &&
                        null != ck.field_H &&
                        var15 <= ck.field_H.length &&
                        ck.field_H[var15 - 1] != null) {
                        var22 = ck.field_H[var15 - 1][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  } else {
                    var21 = tr.field_d;
                  }
                } else {
                  var21 = le.field_b;
                }
                if (var4_int != 0 &&
                  !gd.field_r) {
                  var22 = null;
                  if (ng.field_a) {
                    var22 = "</col>" + rq.field_v + "<col=A00000>";
                    var25 = var22;
                    var22 = var25;
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var24 < var7; var24++) {
                    if (mn.field_t[var24]) {
                      var25_ref = "</col>" + md.field_C[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 != null) {
                        var22 = (String) (var22) + ", " + var25_ref;
                        var21 = var22;
                        var21 = var22;
                        var23 = 1;
                      } else {
                        var22 = var25_ref;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = qc.field_u + (String) (var22);
                  } else {
                    var21 = Vertigo2.a(new String[]{(String) (var22)}, ir.field_b, -124);
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = uj.a("<br>", "<br><col=A00000>", 0, var32);
                  if (var20 == null) {
                    var20 = var33;
                  } else {
                    var20 = (String) (var20) + "<br>" + var33;
                  }
                }
                if (var20 != null) {
                  ko.field_S = (String) (var20);
                }
              }
              if (!param2) {
                stackIn_328_0 = var17;
                stackIn_329_1 = (gd.field_r) && (param3.field_fc[var7] == (byte)var9);
                stackIn_328_0.field_V = stackIn_329_1;
              } else {
                if (-1 == var9) {
                  var17.field_V = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (var27 < var30.length + var6Lifetime4 - 1) {
                    stackIn_318_0 = var17;
                    stackIn_318_1 = var17.field_V;
                    stackIn_319_2 = ((dj.field_a[var27 / 8] & 1 << (var27 & 7)) == 0);
                    stackIn_318_0.field_V = stackIn_318_1 & stackIn_319_2;
                    var27++;
                  }
                } else {
                  stackIn_321_0 = var17;
                  stackIn_321_1 = dj.field_a[(var9 + var6Lifetime4) / 8];
                  stackIn_321_2 = 1;
                  stackIn_321_3 = 7 & var6Lifetime4 + var9;
                  stackIn_324_1 = ((stackIn_321_1 & stackIn_321_2 << stackIn_321_3) != 0);
                  stackIn_321_0.field_V = stackIn_324_1;
                }
              }
              stackIn_333_0 = var17;
              stackIn_334_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_333_0.field_lb = stackIn_334_1;
            }
            var6Lifetime4 = var6Lifetime4 + (kr.field_c[var7] & 255);
          }
          if (var5 != 0 &&
            !param2) {
            ar.a(953354214, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_342_0 = var4;
          stackIn_342_1 = new StringBuilder().append("mg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_343_2 = "null";
          } else {
            stackIn_343_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_342_0), ((StringBuilder) (Object) stackIn_342_1).append(stackIn_343_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_L = null;
        field_G = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_S = (nk[][]) null;
        field_N = null;
        if (param0 != 2) {
          uh var2 = (uh) null;
          mg.a(true, 49, false, (uh) null);
        }
        field_T = null;
    }

    final String a(boolean param0) {
        int var2 = this.field_C.field_p ? 1 : 0;
        this.field_C.field_p = this.field_p;
        String var3 = this.field_C.a(param0);
        this.field_C.field_p = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_J = new int[8192];
        field_N = new nj();
        field_T = "Cancel draw";
        field_G = "The following settings need to be changed:  ";
        field_L = "Breaking real-world laws";
    }
}
