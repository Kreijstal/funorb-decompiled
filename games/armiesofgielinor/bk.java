/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              L2: {
                ag.field_L[0] = iq.field_e.nextInt();
                ag.field_L[1] = iq.field_e.nextInt();
                vd.field_b.field_q = 0;
                ag.field_L[3] = (int)ts.field_h;
                ag.field_L[2] = (int)(ts.field_h >> 16473696);
                vd.field_b.a((byte) -69, ag.field_L[0]);
                vd.field_b.a((byte) -69, ag.field_L[1]);
                vd.field_b.a((byte) -125, ag.field_L[2]);
                vd.field_b.a((byte) -89, ag.field_L[3]);
                pr.a(vd.field_b, (byte) -84);
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
              vl.field_n.b(var7, param3 + 13851);
              if (gh.field_P == null) {
                break L8;
              } else {
                vl.field_n.a(gh.field_P, 413740432);
                break L8;
              }
            }
            fp.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, vl.field_n);
            vl.field_n.f(param3 ^ param3, vl.field_n.field_q + -var5_int);
            hb.a((byte) 29, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, je param1, je param2, ka param3, je param4, int param5, je param6, je param7, je param8, ll param9, je param10, je param11) {
        String stackIn_13_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        wk[] var16 = null;
        int var17 = 0;
        je var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
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
            var12 = new wk(4, 4);
            var13 = var12.field_B;
            var14 = var12.field_B;
            var15 = var12.field_B;
            var12.field_B[15] = 7368816;
            var14[5] = 7368816;
            var13[2] = 7368816;
            var15[8] = 7368816;
            var16 = new wk[9];
            var16[4] = var12;
            var17 = 106 / ((param5 - -53) / 51);
            ag.field_I = new je(0L, param7);
            mp.field_Qb = new je(0L, param8);
            ag.field_I.a(mp.field_Qb, 55);
            var18 = new je(0L, (je) null);
            var18.field_fb = new at();
            vq.field_a = new dn(0L, var18, param1, param9);
            mp.field_Qb.a(vq.field_a, 126);
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
                  if ((var19 ^ -1) <= -6) {
                    break L3;
                  } else {
                    stackIn_28_0 = var19;

                    if (var21 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_28_0 != 0) {
                              break L6;
                            } else {
                              L7: {
                                if (bq.field_c) {
                                  stackIn_13_0 = sa.field_c;
                                  break L7;
                                } else {
                                  stackIn_13_0 = wf.field_u;
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
                            if (-2 != (var19 ^ -1)) {
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
                          if ((var19 ^ -1) != -3) {
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
                stackIn_28_0 = go.a(4) ? 1 : 0;
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
            var12_ref = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var12_ref);

            stackIn_38_1 = new StringBuilder().append("bk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L11;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L12;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param3 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L13;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');

            if (param4 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L14;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L15;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param7 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L16;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');

            if (param8 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L17;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',');

            if (param9 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L18;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param10 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L19;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param11 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L20;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L20;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_39_0), stackIn_75_2 + ')');
        }
    }

    final static void a(int param0, int param1, um param2, int param3, boolean param4) {
        nm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        nm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = lk.field_e;

              stackIn_3_1 = param0;

              if (param4) {
                stackIn_4_0 = (nm) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              } else {
                stackIn_4_0 = (nm) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
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
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("bk.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_h = null;
        field_c = null;
        if (!param0) {
            return;
        }
        try {
            field_d = null;
            field_g = null;
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bk.E(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, of param4, dn param5, int param6) {
        tg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              ng.a(param5, param4, (int[]) null, param4.field_Yb, -1, 111, -1, param4.field_cc, param4.field_Pb);
              tn.field_Z.a(23899, true);
              tn.field_Z.a((int[]) null, 7, 0);
              tn.field_Z.b((byte) 44);
              if (!param0) {
                break L1;
              } else {
                bk.a(true, (je) null, (je) null, (ka) null, (je) null, 86, (je) null, (je) null, (je) null, (ll) null, (je) null, (je) null);
                break L1;
              }
            }
            var7 = tn.field_Z;
            var8 = param2;
            var9 = param6;
            var10 = param3;
            var11 = param1;
            var7.field_i.a(var11, var9, var10, (byte) -118, var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7_ref);

            stackIn_8_1 = new StringBuilder().append("bk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param6 + ')');
        }
    }

    static {
        field_g = "<%0> would need a rating of <%1> to play with the current options.";
        field_b = "Unit Selection";
        field_c = "Capture all enemy portals and defeat their barbarians to win this battle.";
        field_h = "<%0> has offered a draw";
    }
}
