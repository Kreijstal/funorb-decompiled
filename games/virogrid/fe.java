/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends km {
    static String field_Kb;
    static boolean field_Fb;
    private StringBuilder field_Eb;
    static String field_Lb;
    private km field_Jb;
    private km field_Hb;
    private int field_Ib;
    static boolean field_Gb;

    final static void a(int[] param0, boolean param1, boolean param2, wm param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = Virogrid.field_F ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param5[3] >> 2;
          var22 = param5[4] >> 2;
          var23 = param5[5] >> 2;
          var24 = param5[6] >> 2;
          var25 = param5[7] >> 2;
          var26 = param5[8] >> 2;
          var27 = param5[9] >> 2;
          var28 = param5[10] >> 2;
          var12 = param0[5] * var23 + var21 * param0[3] + var22 * param0[4] >> 14;
          var13 = var25 * param0[4] + (param0[3] * var24 + param0[5] * var26) >> 14;
          var29 = param5[11] >> 2;
          var18 = param0[11] * var23 + param0[9] * var21 + var22 * param0[10] >> 14;
          var16 = var26 * param0[8] + var24 * param0[6] + var25 * param0[7] >> 14;
          var14 = param0[5] * var29 + (param0[4] * var28 + param0[3] * var27) >> 14;
          if (!param2) {
            return;
          }
          var15 = param0[8] * var23 + (var21 * param0[6] + var22 * param0[7]) >> 14;
          var17 = param0[7] * var28 + (param0[6] * var27 + param0[8] * var29) >> 14;
          var20 = param0[9] * var27 + var28 * param0[10] + param0[11] * var29 >> 14;
          var19 = var26 * param0[11] + param0[10] * var25 + var24 * param0[9] >> 14;
          var21Lifetime1 = param0[0] - param5[0];
          var22Lifetime1 = param0[1] - param5[1];
          var23Lifetime1 = -param5[2] + param0[2];
          var9 = param5[5] * var23Lifetime1 + (var21Lifetime1 * param5[3] + param5[4] * var22Lifetime1) >> 16 - gb.field_N;
          var11 = var23Lifetime1 * param5[11] + param5[9] * var21Lifetime1 + var22Lifetime1 * param5[10] >> 16;
          var10 = param5[6] * var21Lifetime1 - (-(var22Lifetime1 * param5[7]) - var23Lifetime1 * param5[8]) >> 16 - gb.field_N;
          var21Lifetime2 = fk.field_j;
          var22Lifetime2 = fk.field_k;
          var23Lifetime2 = 0;
          L2: while (true) {
            if (var23Lifetime2 < param3.field_h) {
              var24Lifetime1 = param3.field_l[var23Lifetime2];
              var25Lifetime1 = param3.field_b[var23Lifetime2];
              var26Lifetime1 = param3.field_H[var23Lifetime2];
              var27Lifetime1 = var9 + (var26Lifetime1 * var18 + var12 * var24Lifetime1 + var15 * var25Lifetime1 >> -gb.field_N + 16);
              var28Lifetime1 = (var24Lifetime1 * var13 + var25Lifetime1 * var16 + var19 * var26Lifetime1 >> -gb.field_N + 16) + var10;
              var29Lifetime1 = var11 + (var26Lifetime1 * var20 + var14 * var24Lifetime1 + var25Lifetime1 * var17 >> 16);
              stackIn_67_0 = var29Lifetime1;
              stackIn_67_1 = 50;
              if (var30 == 0) {
                if (stackIn_67_0 >= stackIn_67_1) {
                  en.field_Hb[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  ld.field_h[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  dn.field_a[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                } else {
                  dn.field_a[var23Lifetime2] = -2147483648;
                }
                if (param6) {
                  mk.field_gb[var23Lifetime2] = var27Lifetime1 >> gb.field_N;
                  ea.field_c[var23Lifetime2] = var28Lifetime1 >> gb.field_N;
                  hh.field_b[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param3.field_R &&
                param3.field_E != null &&
                param3.field_f != null &&
                param3.field_q != null &&
                null != param3.field_c &&
                null != param3.field_o &&
                null != param3.field_n &&
                param3.field_P != null &&
                param3.field_M != null) {
                var23Lifetime2 = 0;
                while (!(param3.field_k <= var23Lifetime2)) {
                  var24Lifetime1 = param3.field_R[var23Lifetime2];
                  var25Lifetime1 = param3.field_E[var23Lifetime2];
                  var26Lifetime1 = param3.field_f[var23Lifetime2];
                  nm.field_a[var23Lifetime2] = var9 + (var24Lifetime1 * var12 + var15 * var25Lifetime1 + var26Lifetime1 * var18 >> 16);
                  hf.field_A[var23Lifetime2] = (var19 * var26Lifetime1 + (var16 * var25Lifetime1 + var13 * var24Lifetime1) >> 16) + var10;
                  gl.field_b[var23Lifetime2] = var11 + (var25Lifetime1 * var17 + (var14 * var24Lifetime1 + var26Lifetime1 * var20) >> 16);
                  var24Lifetime1 = param3.field_q[var23Lifetime2];
                  var25Lifetime1 = param3.field_c[var23Lifetime2];
                  var26Lifetime1 = param3.field_o[var23Lifetime2];
                  d.field_Lb[var23Lifetime2] = (var18 * var26Lifetime1 + var25Lifetime1 * var15 + var24Lifetime1 * var12 >> 16) + var9;
                  qe.field_i[var23Lifetime2] = var10 + (var25Lifetime1 * var16 + (var24Lifetime1 * var13 + var26Lifetime1 * var19) >> 16);
                  pg.field_j[var23Lifetime2] = (var26Lifetime1 * var20 + (var25Lifetime1 * var17 + var14 * var24Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param3.field_n[var23Lifetime2];
                  var25Lifetime1 = param3.field_P[var23Lifetime2];
                  var26Lifetime1 = param3.field_M[var23Lifetime2];
                  hf.field_z[var23Lifetime2] = (var18 * var26Lifetime1 + var15 * var25Lifetime1 + var24Lifetime1 * var12 >> 16) + var9;
                  ag.field_i[var23Lifetime2] = var10 + (var19 * var26Lifetime1 + var24Lifetime1 * var13 + var16 * var25Lifetime1 >> 16);
                  ul.field_h[var23Lifetime2] = (var25Lifetime1 * var17 + (var24Lifetime1 * var14 + var20 * var26Lifetime1) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param1) {
                var9 = param0[3];
                var10 = param0[4];
                var11 = param0[5];
                var12 = param0[6];
                var13 = param0[7];
                var14 = param0[8];
                var15 = param0[9];
                var16 = param0[10];
                var17 = param0[11];
                var18 = 0;
                while (!(param3.field_i <= var18)) {
                  stackIn_67_0 = u.field_q.length;
                  stackIn_67_1 = var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_67_0 <= stackIn_67_1) {
                    break;
                  }
                  var19 = param3.field_A[var18];
                  var20 = param3.field_G[var18];
                  var21Lifetime2 = param3.field_D[var18];
                  u.field_q[var18] = var21Lifetime2 * var15 + var20 * var12 + var19 * var9 >> 16;
                  fb.field_p[var18] = var10 * var19 - (-(var20 * var13) - var16 * var21Lifetime2) >> 16;
                  dc.field_Q[var18] = var11 * var19 + (var14 * var20 + var17 * var21Lifetime2) >> 16;
                  var18++;
                }
              }
              stackIn_67_0 = var8;
              stackIn_67_1 = param2 ? 1 : 0;
            }
            break;
          }
          lj.a(stackIn_67_0, stackIn_67_1 != 0, param4, var7_int, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("fe.C(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (this.field_Ib != 0) {
            return false;
          }
          if (um.field_Gb == 85 &&
            this.field_Eb.length() > 0) {
            gi.a(this.field_Eb, -18340, -1 + this.field_Eb.length(), ' ');
          }
          if (this.field_Eb.length() < 12) {
            var2_int = Character.toLowerCase(nm.field_d);
            if (var2_int == 32) {
              var2_int = 95;
            }
            if (var2_int == 95 &&
              this.field_Eb.length() > 0) {
              discarded$0 = this.field_Eb.append((char) var2_int);
            }
            if (bm.a((char) var2_int, false) ||
              kf.a(0, (char) var2_int)) {
              discarded$1 = this.field_Eb.append((char) var2_int);
            }
          }
          if (um.field_Gb == 84) {
            if (this.field_Eb.length() > 0) {
              this.field_V = this.field_Eb.toString();
              this.field_Ib = 2;
              if (Virogrid.field_F) {
                this.field_Ib = 1;
              }
            } else {
              this.field_Ib = 1;
            }
          }
          if (um.field_Gb == 13) {
            this.field_Ib = 1;
          }
          if (param0 < 20) {
            this.field_Ib = -124;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "fe.D(" + param0 + ')');
        }
    }

    fe(int param0, int param1, int param2, int param3, String param4, km param5, km param6, km param7) {
        super(0L, param5);
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Ib = 0;
        try {
          this.field_Jb = new km(0L, param6, param4);
          this.a(0, this.field_Jb);
          this.field_Hb = new km(0L, param7);
          this.field_Hb.field_E = 16764006;
          this.a(0, this.field_Hb);
          this.field_Hb.field_eb = "|";
          this.field_Eb = new StringBuilder(12);
          var9_int = this.field_Jb.c((byte) 127);
          this.field_Jb.a(5, pg.field_e, var9_int, (byte) -125, 3);
          this.field_Hb.a(5, pg.field_e, var9_int, (byte) -80, pg.field_e + 3);
          var10 = 5 + (5 + var9_int);
          var11 = 3 + 2 * pg.field_e + 3;
          var12 = sh.b(0, param2, param0, var10);
          var13 = p.a(-1, var11, param1, param3);
          this.a(var12, var11, var10, (byte) -55, var13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("fe.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, int param2, boolean param3, String param4) {
        String stackIn_5_0 = null;
        boolean stackIn_50_0 = false;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          dm.field_u = param2;
          rk.field_f = true;
          var5 = param4;
          if (param3) {
            stackIn_5_0 = wn.field_z;
          } else {
            stackIn_5_0 = vi.field_m;
          }
          boolean decompiledFrameRemainder0 = true;
          var6 = stackIn_5_0;
          if (0 != dm.field_u) {
            if (dm.field_u != 1) {
              throw new IllegalArgumentException();
            }
            var7 = sf.a((byte) 121, var5, pm.field_j, 480, gg.field_I);
            var8 = var7 + 2;
            vg.field_F = new String[var8];
            wf.field_f = new int[var8];
            var9 = 0;
            do {
              if (var8 <= var9) {
                ia.field_e = new int[1];
                break;
              }
              wf.field_f[var9] = -1;
              var9++;
            } while (var10 == 0);
            var9 = 0;
            do {
              if (var7 <= var9) {
                vg.field_F[var8 - 2] = "";
                vg.field_F[-1 + var8] = je.field_I;
                wf.field_f[-1 + var8] = 0;
                ia.field_e[0] = 2;
                break;
              }
              vg.field_F[var9] = gg.field_I[var9];
              var9++;
            } while (var10 == 0);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var7 = sf.a((byte) 124, var5, pm.field_j, 480, gg.field_I);
            var8 = var7 + 3;
            wf.field_f = new int[var8];
            vg.field_F = new String[var8];
            var9 = 0;
            do {
              if (var8 <= var9) {
                ia.field_e = new int[2];
                break;
              }
              wf.field_f[var9] = -1;
              var9++;
            } while (var10 == 0);
            var9 = 0;
            do {
              if (var7 <= var9) {
                vg.field_F[-3 + var8] = "";
                vg.field_F[-2 + var8] = var6;
                wf.field_f[-2 + var8] = 0;
                ia.field_e[0] = 1;
                vg.field_F[-1 + var8] = je.field_I;
                wf.field_f[-1 + var8] = 1;
                break;
              }
              vg.field_F[var9] = gg.field_I[var9];
              var9++;
            } while (var10 == 0);
            ia.field_e[1] = 2;
          }
          g.field_b.field_o = ia.field_e.length;
          var7 = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(vg.field_F.length > var8)))) {
            stackIn_60_0 = -1;
            stackIn_60_1 = ~wf.field_f[var8];
            if (var10 == 0) {
              stackIn_50_0 = !(stackIn_60_0 < stackIn_60_1);
              var9 = an.a(stackIn_50_0, (byte) 57, vg.field_F[var8]);
              if (-1 != wf.field_f[var8]) {
                var9 = var9 + dj.field_e * 2;
              }
              if (var9 > var7) {
                var7 = var9;
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            lj.field_g = g.field_b.field_o * (hd.field_e + ng.field_P << 1);
            sh.field_rb = -(var7 >> 1) + mh.field_g + var7;
            dg.field_x = mh.field_g - (var7 >> 1);
            stackIn_60_0 = param0;
            stackIn_60_1 = 45;
          }
          if (stackIn_60_0 != stackIn_60_1) {
            field_Fb = true;
          }
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < vg.field_F.length)))) {
            stackIn_74_0 = lj.field_g;
            stackIn_74_1 = -1;
            stackIn_74_2 = ~wf.field_f[var8];
            if (var10 == 0) {
              if (stackIn_74_1 >= stackIn_74_2) {
                stackIn_72_1 = di.field_o;
              } else {
                stackIn_72_1 = bn.field_b;
              }
              lj.field_g = stackIn_74_0 + stackIn_72_1;
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_74_0 = kn.field_I;
            stackIn_74_1 = lj.field_g;
            stackIn_74_2 = 1346030241;
          }
          tl.field_i = stackIn_74_0 - (stackIn_74_1 >> stackIn_74_2);
          g.field_b.a(param1, ve.a(hk.field_Jb, nl.field_u, (byte) 66), -563, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_79_0 = var5_ref;
          stackIn_79_1 = new StringBuilder().append("fe.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    final int b(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(param0, (byte) 118);
                        if (param1 == -28624) {
                            statePc = 4;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                field_Lb = (String) null;
                                statePc = 4;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0) {
                            statePc = 7;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 5. */
                            {
                                statePc = 45;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_4) {
                        statePc = ((Object) stateCaught_4 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_4);
                        }
                        caughtException = stateCaught_4;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!nd.b((byte) -128)) {
                            statePc = 45;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 8. */
                            {
                                if (um.field_Gb != 85) {
                                    statePc = 14;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 9. */
                                    {
                                        if (this.field_Eb.length() <= 0) {
                                            statePc = 14;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 10. */
                                            {
                                                /* Sequential CFG blocks: 10, 12. */
                                                {
                                                }
                                                {
                                                    gi.a(this.field_Eb, -18340, -1 + this.field_Eb.length(), ' ');
                                                    statePc = 14;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (mf.a((CharSequence) ((Object) this.field_Eb), nm.field_d, -13)) {
                            statePc = 32;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 15. */
                            {
                                if (this.field_Eb.length() != 0) {
                                    statePc = 21;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 16. */
                                    {
                                        /* Sequential CFG blocks: 16, 18. */
                                        {
                                        }
                                        {
                                            if (91 == nm.field_d) {
                                                statePc = 32;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 19. */
                                                {
                                                    statePc = 21;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (this.field_Eb.length() != 1) {
                            statePc = 27;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 22. */
                            {
                                /* Sequential CFG blocks: 22, 24. */
                                {
                                }
                                {
                                    if (nm.field_d == 35) {
                                        statePc = 32;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 25. */
                                        {
                                            statePc = 27;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_21) {
                        statePc = ((Object) stateCaught_21 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_21);
                        }
                        caughtException = stateCaught_21;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (93 == nm.field_d) {
                            statePc = 32;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 28. */
                            {
                                /* Sequential CFG blocks: 28, 30. */
                                {
                                }
                                {
                                    statePc = 33;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_27) {
                        statePc = ((Object) stateCaught_27 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_27);
                        }
                        caughtException = stateCaught_27;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        discarded$0 = this.field_Eb.append(nm.field_d);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (84 != um.field_Gb) {
                            /* Inlined CFG state: 41. */
                            {
                                if (um.field_Gb != 13) {
                                    statePc = 7;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 42. */
                                    {
                                        stackIn_43_0 = 1;
                                        statePc = 43;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 34. */
                            {
                                if (this.field_Eb.length() <= 0) {
                                    /* Inlined CFG state: 39. */
                                    {
                                        stackIn_40_0 = 1;
                                        statePc = 40;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 35. */
                                    {
                                        /* Sequential CFG blocks: 35, 37. */
                                        {
                                        }
                                        {
                                            this.field_V = this.field_Eb.toString();
                                            stackIn_38_0 = 2;
                                            statePc = 38;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0;
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 43: {
                    stackIn_46_0 = stackIn_43_0;
                    stackIn_44_0 = stackIn_46_0;
                    if (var4 != 0) {
                        statePc = 46;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 44. */
                        {
                            return stackIn_44_0;
                        }
                    }
                }
                case 45: {
                    try {
                        this.field_Hb.field_V = this.field_Eb.toString();
                        stackIn_46_0 = param0 ? 1 : 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        statePc = ((Object) stateCaught_45 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_45);
                        }
                        caughtException = stateCaught_45;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 == 0) {
                            statePc = 56;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 47. */
                            {
                                if (0 == oi.field_g) {
                                    statePc = 56;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 48. */
                                    {
                                        /* Sequential CFG blocks: 48, 50. */
                                        {
                                        }
                                        {
                                            if (this.field_nb == 0) {
                                                /* Inlined CFG state: 55. */
                                                {
                                                    this.field_Ib = 1;
                                                    statePc = 56;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                /* Inlined CFG state: 51. */
                                                {
                                                    /* Sequential CFG blocks: 51, 53. */
                                                    {
                                                    }
                                                    {
                                                        statePc = 56;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_46) {
                        statePc = ((Object) stateCaught_46 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_46);
                        }
                        caughtException = stateCaught_46;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = this.field_Ib;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        statePc = ((Object) stateCaught_56 instanceof RuntimeException ? 58 : -1);
                        if (statePc == -1) {
                            throw fe.<RuntimeException>$cfr$sneakyThrow(stateCaught_56);
                        }
                        caughtException = stateCaught_56;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw kg.a((Throwable) ((Object) var3), "fe.F(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static rm a(rm param0, int[] param1, byte param2) {
        rm var3 = null;
        RuntimeException var3_ref = null;
        rm stackIn_2_0 = null;
        rm stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new rm(0, 0, 0);
          var3.field_d = param0.field_d;
          var3.field_m = param1;
          var3.field_j = param0.field_j;
          var3.field_i = param0.field_i;
          var3.field_n = param0.field_n;
          if (param2 >= -10) {
            stackIn_2_0 = (rm) null;
            return stackIn_2_0;
          }
          var3.field_b = param0.field_b;
          var3.field_l = param0.field_l;
          var3.field_a = param0.field_a;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("fe.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (!vg.field_I.field_t) {
            if (0 == (1 << vg.field_I.field_e & vg.field_I.field_C.field_b)) {
              if (vg.field_I.field_C.field_b != 0) {
                de.field_pb[18] = rf.field_g;
                decompiledFrameRemainder0 = (var2 != 0);
              }
              if (decompiledFrameRemainder0) {
                if ((vg.field_I.field_v | 1 << vg.field_I.field_e) != 3) {
                  de.field_pb[18] = eb.field_g;
                  decompiledFrameRemainder0 = (var2 != 0);
                }
                if (decompiledFrameRemainder0) {
                  de.field_pb[18] = f.field_d;
                  decompiledFrameRemainder0 = (var2 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              de.field_pb[18] = ic.field_s;
              decompiledFrameRemainder0 = (var2 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if ((vg.field_I.field_C.field_b & 1 << vg.field_I.field_e) == 0) {
              if (0 == vg.field_I.field_C.field_b) {
                if (3 == (1 << vg.field_I.field_e | vg.field_I.field_v)) {
                  de.field_pb[18] = nk.field_M;
                  if (var2 != 0) {
                    de.field_pb[18] = ei.field_e;
                    de.field_pb[18] = pb.field_m;
                    de.field_pb[18] = ic.field_b;
                  }
                } else {
                  de.field_pb[18] = ei.field_e;
                  if (var2 != 0) {
                    de.field_pb[18] = pb.field_m;
                    de.field_pb[18] = ic.field_b;
                  }
                }
              } else {
                de.field_pb[18] = pb.field_m;
                if (var2 != 0) {
                  de.field_pb[18] = ic.field_b;
                }
              }
            } else {
              de.field_pb[18] = ic.field_b;
            }
          }
          if (param0 != 1) {
            field_Lb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fe.E(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 32498) {
            field_Kb = (String) null;
          }
          field_Kb = null;
          field_Lb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fe.G(" + param0 + ')');
        }
    }

    static {
        field_Fb = false;
        field_Kb = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
