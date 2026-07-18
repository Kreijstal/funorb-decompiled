/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bk {
    static je field_f;
    static String field_g;
    static String field_b;
    static tp field_a;
    static String field_c;
    static at field_e;
    static ru[] field_d;
    static String field_h;

    final static void a(boolean param0, boolean param1, af param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ag.field_L[0] = iq.field_e.nextInt();
                ag.field_L[1] = iq.field_e.nextInt();
                vd.field_b.field_q = 0;
                ag.field_L[3] = (int)ts.field_h;
                ag.field_L[2] = (int)(ts.field_h >> 32);
                vd.field_b.a((byte) -69, ag.field_L[0]);
                vd.field_b.a((byte) -69, ag.field_L[1]);
                vd.field_b.a((byte) -125, ag.field_L[2]);
                vd.field_b.a((byte) -89, ag.field_L[3]);
                int discarded$1 = -84;
                pr.a(vd.field_b);
                vd.field_b.b(true, param4);
                param2.a(vd.field_b, -11436);
                vl.field_n.field_q = 0;
                if (param1) {
                  break L2;
                } else {
                  vl.field_n.b(1, 16);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              vl.field_n.b(1, 18);
              break L1;
            }
            L3: {
              vl.field_n.field_q = vl.field_n.field_q + 2;
              var5_int = vl.field_n.field_q;
              vl.field_n.a((byte) -67, fl.field_e);
              vl.field_n.a(an.field_E, 38359632);
              var6 = 0;
              if (!aw.field_l) {
                break L3;
              } else {
                var6 = var6 | 1;
                break L3;
              }
            }
            L4: {
              if (!ul.field_a) {
                break L4;
              } else {
                var6 = var6 | 4;
                break L4;
              }
            }
            L5: {
              if (param0) {
                var6 = var6 | 8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (gh.field_P == null) {
                break L6;
              } else {
                var6 = var6 | 16;
                break L6;
              }
            }
            L7: {
              vl.field_n.b(1, var6);
              var7 = mg.a(0, ag.d((byte) -116));
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              vl.field_n.b(var7, 13851);
              if (gh.field_P == null) {
                break L8;
              } else {
                vl.field_n.a(gh.field_P, 413740432);
                break L8;
              }
            }
            fp.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, (vh) (Object) vl.field_n);
            vl.field_n.f(0, vl.field_n.field_q + -var5_int);
            hb.a((byte) 29, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + 0 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, je param1, je param2, ka param3, je param4, int param5, je param6, je param7, je param8, ll param9, je param10, je param11) {
        RuntimeException var12 = null;
        wk var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        wk[] var16 = null;
        int var17 = 0;
        je var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int stackIn_4_0 = 0;
        String stackIn_13_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        boolean stackOut_27_0 = false;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var21 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ag.field_A[4] = 16711935;
            ag.field_A[0] = 16764000;
            tc.field_e = param3;
            ag.field_A[3] = 16736511;
            ag.field_A[1] = 6356832;
            bq.field_c = param0;
            uf.field_i = param4;
            ag.field_A[2] = 9474303;
            fm.field_d[0] = 16764000;
            ni.field_d = 8421504;
            fm.field_d[1] = 6356832;
            fm.field_d[3] = 16736511;
            ag.field_A[4] = 16711935;
            fm.field_d[2] = 16736352;
            var12_ref = new wk(4, 4);
            var13 = var12_ref.field_B;
            var14 = var12_ref.field_B;
            var15 = var12_ref.field_B;
            var12_ref.field_B[15] = 7368816;
            var14[5] = 7368816;
            var13[2] = 7368816;
            var15[8] = 7368816;
            var16 = new wk[9];
            var16[4] = var12_ref;
            var17 = -106;
            ag.field_I = new je(0L, param7);
            mp.field_Qb = new je(0L, param8);
            ag.field_I.a(mp.field_Qb, 55);
            var18 = new je(0L, (je) null);
            var18.field_fb = new at();
            vq.field_a = new dn(0L, var18, param1, param9);
            mp.field_Qb.a((je) (Object) vq.field_a, 126);
            we.field_f = new je(0L, param6);
            mp.field_Qb.a(we.field_f, 110);
            qj.field_z = new je(0L, param2);
            qj.field_z.field_Z = tc.field_e;
            we.field_f.a(qj.field_z, 82);
            we.field_f.i(-10027);
            rb.field_b = new je(0L, (je) null);
            rb.field_b.field_G = var16;
            we.field_f.a(rb.field_b, 99);
            jj.field_i = new je[5];
            bp.field_j = new je[5];
            we.field_g = new je[5];
            gt.field_b = new je[5];
            var19 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var19 >= 5) {
                    break L3;
                  } else {
                    stackOut_3_0 = var19;
                    stackIn_28_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var21 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_4_0 != 0) {
                              break L6;
                            } else {
                              L7: {
                                if (bq.field_c) {
                                  stackOut_12_0 = sa.field_c;
                                  stackIn_13_0 = stackOut_12_0;
                                  break L7;
                                } else {
                                  stackOut_10_0 = wf.field_u;
                                  stackIn_13_0 = stackOut_10_0;
                                  break L7;
                                }
                              }
                              var20 = stackIn_13_0;
                              if (var21 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var19 != 1) {
                              break L8;
                            } else {
                              if (!bq.field_c) {
                                break L8;
                              } else {
                                var20 = ob.field_O;
                                if (var21 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (var19 != 2) {
                            break L4;
                          } else {
                            var20 = tq.field_d;
                            break L5;
                          }
                        }
                        gt.field_b[var19] = new je(0L, param10);
                        jj.field_i[var19] = new je(0L, uf.field_i, var20);
                        we.field_g[var19] = new je(0L, (je) null);
                        we.field_g[var19].field_Fb = 1;
                        bp.field_j[var19] = new je(0L, uf.field_i);
                        bp.field_j[var19].field_Fb = 1;
                        gt.field_b[var19].a(jj.field_i[var19], 107);
                        gt.field_b[var19].a(we.field_g[var19], 45);
                        gt.field_b[var19].a(bp.field_j[var19], 85);
                        gt.field_b[var19].i(-10027);
                        ag.field_I.a(gt.field_b[var19], 121);
                        se.field_d = se.field_d + 1;
                        break L4;
                      }
                      var19++;
                      if (var21 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                mc.field_f = new je(0L, param11);
                mc.field_f.field_X = cv.field_n;
                ag.field_I.a(mc.field_f, 42);
                stackOut_27_0 = go.a(4);
                stackIn_28_0 = stackOut_27_0 ? 1 : 0;
                break L2;
              }
              L9: {
                L10: {
                  if (stackIn_28_0 == 0) {
                    break L10;
                  } else {
                    if (!bb.field_a) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                aw.field_i = new wr(0, 0, 0, 0);
                break L9;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var12 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var12;
            stackOut_35_1 = new StringBuilder().append("bk.D(").append(param0).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L11;
            }
          }
          L12: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L12;
            }
          }
          L13: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L13;
            }
          }
          L14: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param4 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L14;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L14;
            }
          }
          L15: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(-106).append(',');
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param6 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L15;
            }
          }
          L16: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param7 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L16;
            }
          }
          L17: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param8 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L17;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L17;
            }
          }
          L18: {
            stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',');
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param9 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L18;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L18;
            }
          }
          L19: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param10 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L19;
            }
          }
          L20: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param11 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L20;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ')');
        }
    }

    final static void a(int param0, int param1, um param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        nm stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        nm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        nm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        nm stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        nm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = lk.field_e;
              stackOut_0_1 = param0;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param4) {
                stackOut_3_0 = (nm) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_1_0 = (nm) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              ((nm) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, param2, param3 + -20608, param1, 1000000);
              if (param3 == 20607) {
                break L2;
              } else {
                bk.a(117, -8, (um) null, 124, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("bk.B(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_a = null;
            field_e = null;
            field_b = null;
            field_h = null;
            field_c = null;
            field_d = null;
            field_g = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "bk.E(" + true + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, of param4, dn param5, int param6) {
        RuntimeException var7 = null;
        tg var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            ng.a(param5, (je) (Object) param4, (int[]) null, param4.field_Yb, -1, 111, -1, param4.field_cc, param4.field_Pb);
            tn.field_Z.a(23899, true);
            tn.field_Z.a((int[]) null, 7, 0);
            tn.field_Z.b((byte) 44);
            var7_ref = tn.field_Z;
            var8 = param2;
            var9 = param6;
            var10 = 0;
            var11 = 0;
            var7_ref.field_i.a(var11, var9, var10, (byte) -118, var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("bk.A(").append(false).append(',').append(0).append(',').append(param2).append(',').append(0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> would need a rating of <%1> to play with the current options.";
        field_b = "Unit Selection";
        field_c = "Capture all enemy portals and defeat their barbarians to win this battle.";
        field_h = "<%0> has offered a draw";
    }
}
