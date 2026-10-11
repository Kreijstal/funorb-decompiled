/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static ei field_f;
    static java.awt.Font field_d;
    static pj[] field_c;
    private int[] field_a;
    static String field_e;
    static String field_b;

    final static int a(String param0, String param1, byte param2, boolean param3, boolean param4, int param5) {
        try {
          int stackIn_9_0 = 0;
          int stackIn_51_0 = 0;
          boolean stackIn_71_0 = false;
          boolean stackIn_75_0 = false;
          int stackIn_118_0 = 0;
          int stackIn_135_0 = 0;
          int stackIn_137_0 = 0;
          int stackIn_152_0 = 0;
          int stackIn_154_0 = 0;
          RuntimeException stackIn_158_0 = null;
          StringBuilder stackIn_158_1 = null;
          String stackIn_159_2 = null;
          StringBuilder stackIn_162_1 = null;
          String stackIn_163_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var6_intLifetime3;
          var9 = Torquing.field_u;
          try {
            if (param2 != 27) {
              field_b = (String) null;
            }
            if (null == vk.field_E) {
              var6_int = mo.a(269, param3) ? 1 : 0;
              if (var6_int == 0) {
                stackIn_9_0 = -1;
                return stackIn_9_0;
              }
            }
            if (ef.field_a == tb.field_o) {
              if (!param3) {
                eh.field_i = ab.a(param1, param0, 130, false);
              }
              if (param3 ||
                var9 != 0) {
                eh.field_i = tp.a((byte) -51, false, param0, (String) null, qd.field_e);
              }
              wa.field_d.field_n = 0;
              wa.field_d.b(90, 14);
              wa.field_d.b(90, eh.field_i.a(false).field_a);
              jd.a((byte) -122, -1);
              ef.field_a = en.field_v;
            }
            if (en.field_v == ef.field_a &&
              no.a(1, 0)) {
              var6_intLifetime1 = kj.field_d.i((byte) -101);
              if (0 != var6_intLifetime1) {
                oo.field_a = -1;
                ef.field_a = ld.field_e;
                fa.field_e = var6_intLifetime1;
              }
              if (0 == var6_intLifetime1 ||
                var9 != 0) {
                ef.field_a = aa.field_U;
              }
              kj.field_d.field_n = 0;
            }
            if (aa.field_U == ef.field_a &&
              no.a(8, 0)) {
              ij.field_l = kj.field_d.b(48);
              kj.field_d.field_n = 0;
              id.a(eh.field_i, param5, param3, 19, param4);
              ef.field_a = qi.field_a;
            }
            if (ef.field_a == qi.field_a &&
              no.a(1, 0)) {
              var6_intLifetime2 = kj.field_d.i((byte) -101);
              fa.field_e = var6_intLifetime2;
              kj.field_d.field_n = 0;
              wh.field_u = null;
              if (var6_intLifetime2 != 0 &&
                1 != var6_intLifetime2) {
                if (8 == var6_intLifetime2) {
                  ih.b(true);
                  lh.field_J = false;
                  stackIn_51_0 = var6_intLifetime2;
                  return stackIn_51_0;
                }
                ef.field_a = ld.field_e;
                oo.field_a = -1;
                if (var9 != 0) {
                  ef.field_a = p.field_t;
                  oo.field_a = -1;
                }
              } else {
                ef.field_a = p.field_t;
                oo.field_a = -1;
              }
            }
            if (p.field_t == ef.field_a &&
              ah.a(2)) {
              qd.field_e = kj.field_d.b(param2 + 44);
              ri.field_E = kj.field_d.i((byte) -101);
              kj.field_d.i((byte) -101);
              wp.field_w = kj.field_d.i(7088);
              var6 = kj.field_d.a(param2 - 8);
              var7 = kj.field_d.i((byte) -101);
              if (0 != (1 & var7)) {
                pc.b(false);
              }
              if (!param3) {
                stackIn_71_0 = (0 != (4 & var7));
                fj.field_l = stackIn_71_0;
                stackIn_75_0 = ((var7 & 8) != 0);
                qi.field_c = stackIn_75_0;
                if (!qi.field_c) {
                }
              }
              boolean decompiledFrameCompleted0 = true;
              if (ql.field_t) {
                kj.field_d.i((byte) -101);
                kj.field_d.i((byte) -101);
                kj.field_d.c((byte) -85);
                mf.field_w = kj.field_d.i(param2 ^ 7083);
                uf.field_n = new byte[mf.field_w];
                var8 = 0;
                while (!(mf.field_w <= var8)) {
                  uf.field_n[var8] = kj.field_d.f((byte) 111);
                  var8++;
                  if (var9 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                re.field_e = kj.field_d.h((byte) 126);
                tj.field_j = hf.a((CharSequence) ((Object) re.field_e), param2 + 82);
                pa.field_c = kj.field_d.i((byte) -101);
                ef.field_a = w.field_cb;
              }
              if (eh.field_i.a(false) != im.field_J) {
                if (eh.field_i.a(false) == hg.field_f) {
                  h.field_l.a(ip.a(param2 ^ 18), false);
                  if (var9 != 0) {
                    mf.field_u.a(ip.a(param2 - 18), false);
                  }
                }
              } else {
                mf.field_u.a(ip.a(param2 - 18), false);
              }
              lh.field_J = false;
              if (null != var6) {
                om.a((byte) -75, var6, ip.a(9));
              }
              L22: {
                if (!(wp.field_w <= 0) ||
                  fj.field_l) {
                  try {
                    hp.a(ip.a(param2 - 18), new Object[]{kp.a((byte) -87, qd.field_e)}, 28989, "zap");
                    decompiledRegionSelector0 = 0;
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8_ref_Throwable = decompiledCaughtException;
                    if (var9 == 0) {
                      decompiledRegionSelector0 = 0;
                    } else {
                      decompiledRegionSelector0 = 1;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L22;
                  }
                }
                try {
                  hp.a(ip.a(9), (byte) -85, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (wp.field_w > 0) {
                ao.field_b = true;
              }
              wa.field_d.a((byte) -111, od.field_s);
              var8 = 0;
              do {
                if (var8 >= 4) {
                  kj.field_d.a((byte) -114, od.field_s);
                  break;
                }
                od.field_s[var8] = od.field_s[var8] + 50;
                var8++;
              } while (var9 == 0);
              stackIn_118_0 = fa.field_e;
              return stackIn_118_0;
            }
            if (ld.field_e == ef.field_a &&
              ah.a(2)) {
              ih.b(true);
              if (7 == fa.field_e &&
                !lh.field_J) {
                lh.field_J = true;
                stackIn_137_0 = -1;
                return stackIn_137_0;
              }
              if (fa.field_e == 7) {
                fa.field_e = 3;
              }
              pl.field_u = kj.field_d.h((byte) 125);
              lh.field_J = false;
              stackIn_135_0 = fa.field_e;
              return stackIn_135_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (null == vk.field_E) {
              if (!lh.field_J) {
                var6_intLifetime3 = ea.field_t;
                ea.field_t = sf.field_a;
                lh.field_J = true;
                sf.field_a = var6_intLifetime3;
                decompiledFrameRemainder0 = (var9 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (lc.h((byte) -76) > 30000L) {
                  pl.field_u = eb.field_h;
                  if (var9 != 0) {
                    pl.field_u = hq.field_e;
                  }
                } else {
                  pl.field_u = hq.field_e;
                }
                lh.field_J = false;
                stackIn_152_0 = 3;
                return stackIn_152_0;
              }
            }
            stackIn_154_0 = -1;
            return stackIn_154_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_158_0 = var6_ref;
            stackIn_158_1 = new StringBuilder().append("vb.B(");
            if (param0 == null) {
              stackIn_159_2 = "null";
            } else {
              stackIn_159_2 = "{...}";
            }
            stackIn_162_1 = ((StringBuilder) (Object) stackIn_158_1).append(stackIn_159_2).append(',');
            if (param1 == null) {
              stackIn_163_2 = "null";
            } else {
              stackIn_163_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_158_0), ((StringBuilder) (Object) stackIn_162_1).append(stackIn_163_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static bp a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        bp stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          var2_int = param1.length();
          var3 = 0;
          L1: while (true) {
            if (var3 < var2_int) {
              var4 = param1.charAt(var3);
              stackIn_14_0 = 48;
              stackIn_14_1 = var4;
              if (var5 != 0) {
                break L1;
              }
              if (stackIn_14_0 <= stackIn_14_1 &&
                var4 <= 57) {
                var3++;
                continue;
              } else {
                stackIn_11_0 = null;
                return (bp) (stackIn_11_0);
              }
            }
            stackIn_14_0 = param0;
            stackIn_14_1 = 4;
            break;
          }
          if (stackIn_14_0 != stackIn_14_1) {
            field_d = (java.awt.Font) null;
          }
          stackIn_18_0 = va.field_H;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("vb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 ^ param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var4), "vb.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(of param0, byte param1, boolean param2, int[] param3, int[] param4, boolean param5, boolean param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
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
        var30 = Torquing.field_u;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param3[3] >> 2;
          var22 = param3[4] >> 2;
          var23 = param3[5] >> 2;
          var24 = param3[6] >> 2;
          var25 = param3[7] >> 2;
          var26 = param3[8] >> 2;
          var27 = param3[9] >> 2;
          var28 = param3[10] >> 2;
          var29 = param3[11] >> 2;
          var13 = var24 * param4[3] - (-(param4[4] * var25) - param4[5] * var26) >> 14;
          var12 = var23 * param4[5] + var22 * param4[4] + var21 * param4[3] >> 14;
          var19 = var26 * param4[11] + param4[10] * var25 + param4[9] * var24 >> 14;
          var18 = var22 * param4[10] + var21 * param4[9] + param4[11] * var23 >> 14;
          var20 = var27 * param4[9] + (param4[10] * var28 + param4[11] * var29) >> 14;
          var16 = var26 * param4[8] + var25 * param4[7] + param4[6] * var24 >> 14;
          var17 = param4[8] * var29 + (var28 * param4[7] + var27 * param4[6]) >> 14;
          var14 = param4[4] * var28 + (var27 * param4[3] + param4[5] * var29) >> 14;
          var15 = var22 * param4[7] + var21 * param4[6] + var23 * param4[8] >> 14;
          var21 = -param3[0] + param4[0];
          var22 = param4[1] - param3[1];
          var23 = -param3[2] + param4[2];
          var9 = var23 * param3[5] + (var21 * param3[3] + param3[4] * var22) >> -oe.field_b + 16;
          var10 = param3[8] * var23 + (param3[7] * var22 + param3[6] * var21) >> -oe.field_b + 16;
          var11 = param3[9] * var21 - (-(var22 * param3[10]) - var23 * param3[11]) >> 16;
          if (param1 != -77) {
            vb.a(96);
          }
          var21 = be.field_g;
          var22 = be.field_b;
          var23 = 0;
          L2: while (true) {
            if (param0.field_f > var23) {
              var24 = param0.field_B[var23];
              var25 = param0.field_j[var23];
              var26 = param0.field_d[var23];
              var27 = var9 + (var15 * var25 + var12 * var24 + var26 * var18 >> 16 - oe.field_b);
              var28 = var10 + (var25 * var16 + (var24 * var13 + var19 * var26) >> 16 - oe.field_b);
              var29 = (var26 * var20 + var25 * var17 + var14 * var24 >> 16) + var11;
              stackIn_62_0 = var29;
              stackIn_62_1 = 50;
              if (var30 != 0) {
                if (stackIn_62_0 > stackIn_62_1) {
                  if (m.field_c.length <= var18) {
                    break L2;
                  }
                  var19 = param0.field_q[var18];
                  var20 = param0.field_P[var18];
                  var21 = param0.field_a[var18];
                  m.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 16;
                  pm.field_s[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> 16;
                  tm.field_e[var18] = var21 * var17 + var11 * var19 + var14 * var20 >> 16;
                  var18++;
                  break L2;
                }
                break L2;
              }
              if (stackIn_62_0 >= stackIn_62_1) {
                kh.field_m[var23] = var27 / var29 + var21;
                u.field_w[var23] = var28 / var29 + var22;
                if (var7_int > var29) {
                  var7_int = var29;
                }
                hl.field_b[var23] = var29;
                if (var29 > var8) {
                  var8 = var29;
                }
              } else {
                hl.field_b[var23] = -2147483648;
              }
              if (param6) {
                dj.field_c[var23] = var27 >> oe.field_b;
                gi.field_a[var23] = var28 >> oe.field_b;
                ud.field_k[var23] = var29;
              }
              var23++;
              continue;
            }
            boolean decompiledFrameCompleted0 = true;
            if (null != param0.field_N &&
              null != param0.field_v &&
              param0.field_w != null &&
              param0.field_L != null &&
              param0.field_k != null &&
              null != param0.field_h &&
              param0.field_K != null &&
              null != param0.field_D &&
              param0.field_n != null) {
              var23 = 0;
              while (!(var23 >= param0.field_R)) {
                var24 = param0.field_N[var23];
                var25 = param0.field_v[var23];
                var26 = param0.field_w[var23];
                in.field_b[var23] = (var18 * var26 + var12 * var24 + var25 * var15 >> 16) + var9;
                io.field_s[var23] = var10 + (var19 * var26 + (var25 * var16 + var13 * var24) >> 16);
                vk.field_z[var23] = var11 + (var24 * var14 + var25 * var17 + var26 * var20 >> 16);
                var24 = param0.field_L[var23];
                var25 = param0.field_k[var23];
                var26 = param0.field_h[var23];
                pc.field_d[var23] = (var26 * var18 + (var24 * var12 + var15 * var25) >> 16) + var9;
                no.field_j[var23] = (var16 * var25 + (var24 * var13 + var19 * var26) >> 16) + var10;
                up.field_b[var23] = var11 + (var20 * var26 + var25 * var17 + var14 * var24 >> 16);
                var24 = param0.field_K[var23];
                var25 = param0.field_D[var23];
                var26 = param0.field_n[var23];
                ok.field_D[var23] = var9 + (var18 * var26 + (var12 * var24 + var15 * var25) >> 16);
                hm.field_s[var23] = var10 + (var16 * var25 + (var24 * var13 + var19 * var26) >> 16);
                uf.field_r[var23] = (var26 * var20 + var25 * var17 + var14 * var24 >> 16) + var11;
                var23++;
                if (var30 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (!param5) {
                break L2;
              }
              var9 = param4[3];
              var10 = param4[4];
              var11 = param4[5];
              var12 = param4[6];
              var13 = param4[7];
              var14 = param4[8];
              var15 = param4[9];
              var16 = param4[10];
              var17 = param4[11];
            }
            var18 = 0;
            do {
              stackIn_62_0 = ~var18;
              stackIn_62_1 = ~param0.field_C;
              if (stackIn_62_0 <= stackIn_62_1) {
                break;
              }
              if (m.field_c.length <= var18) {
                break;
              }
              var19 = param0.field_q[var18];
              var20 = param0.field_P[var18];
              var21 = param0.field_a[var18];
              m.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 16;
              pm.field_s[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> 16;
              tm.field_e[var18] = var21 * var17 + var11 * var19 + var14 * var20 >> 16;
              var18++;
            } while (var30 == 0);
            break;
          }
          vf.a(param0, var7_int, var8, param2, (byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("vb.D(");
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
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param4 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -485) {
                            statePc = 4;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                field_e = (String) null;
                                statePc = 4;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw vb.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3_int = (this.field_a.length >> 1) - 1;
                        var4 = param0 & var3_int;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        statePc = ((Object) stateCaught_4 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw vb.<RuntimeException>$cfr$sneakyThrow(stateCaught_4);
                        }
                        caughtException = stateCaught_4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = this.field_a[var4 + (var4 + 1)];
                        if (var5 != -1) {
                            /* Inlined CFG state: 9. */
                            {
                                stackIn_10_0 = param0;
                                statePc = 10;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 6. */
                            {
                                stackIn_7_0 = -1;
                                statePc = 7;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw vb.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 7: {
                    stackIn_10_0 = stackIn_7_0;
                    stackIn_8_0 = stackIn_10_0;
                    if (var6 != 0) {
                        statePc = 10;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 8. */
                        {
                            return stackIn_8_0;
                        }
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == this.field_a[var4 + var4]) {
                            /* Inlined CFG state: 13. */
                            {
                                stackIn_14_0 = var5;
                                statePc = 14;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                /* Sequential CFG blocks: 11, 15. */
                                {
                                }
                                {
                                    var4 = 1 + var4 & var3_int;
                                    statePc = 5;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw vb.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 16: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw rb.a((Throwable) ((Object) var3), "vb.E(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, String param1, boolean param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          km.a(30);
          dc.field_a.h(63);
          un.field_k = new pe(eo.field_a, (String) null, ff.field_a, param0, param2);
          if (param3 != 4805) {
            vb.a((of) null, (byte) 25, false, (int[]) null, (int[]) null, false, true);
          }
          hb.field_x = new qc(dc.field_a, un.field_k);
          dc.field_a.a(hb.field_x, (byte) 113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("vb.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_f = null;
          if (param0 <= 3) {
            vb.a(56, (String) null);
          }
          field_e = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "vb.G(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 32) {
            vb.a((String) null, (String) null, (byte) -26, false, true, 109);
          }
          stackIn_4_0 = sh.b(0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var4), "vb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    vb(int[] param0) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        try {
          var2_int = 1;
          do {
            if (var2_int > param0.length + (param0.length >> 1)) {
              this.field_a = new int[var2_int + var2_int];
              break;
            }
            var2_int = var2_int << 1;
          } while (var5 == 0);
          var3 = 0;
          do {
            if (var3 >= (var2_int + var2_int)) {
              var3 = 0;
              break;
            }
            this.field_a[var3] = -1;
            var3++;
          } while (var5 == 0);
          while (param0.length > var3) {
            if (var5 != 0) {
              return;
            }
            var4 = var2_int - 1 & param0[var3];
            while (this.field_a[1 + (var4 + var4)] != -1) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_a[var4 + var4] = param0[var3];
            this.field_a[var4 + (var4 + 1)] = var3;
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("vb.<init>(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_c = new pj[32];
        field_f = new ei();
        field_e = "SOUND:";
        field_b = "Click";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
