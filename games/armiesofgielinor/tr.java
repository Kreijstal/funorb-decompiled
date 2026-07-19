/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr extends oj {
    int field_D;
    static String field_y;
    int field_E;
    static String field_G;
    static wk field_z;
    static byte[] field_F;
    private int field_B;
    static int[][] field_C;
    static int field_A;

    public static void g(int param0) {
        if (param0 > -88) {
            field_A = 25;
        }
        field_z = null;
        field_C = (int[][]) null;
        field_G = null;
        field_F = null;
        field_y = null;
    }

    final static void h(int param0) {
        L0: {
          al.field_f = new je(0L, (je) null);
          if (!fh.field_c) {
            break L0;
          } else {
            al.field_f.a(t.field_g, 84);
            break L0;
          }
        }
        al.field_f.a(nf.field_Kb, 104);
        pj.field_E = new ea(sa.field_c, al.field_f);
        if (param0 != 14570) {
          return;
        } else {
          no.field_T = new je(0L, (je) null);
          no.field_T.a(pj.field_E.field_a, 127);
          no.field_T.a(cp.field_d, 39);
          ak.b(false);
          return;
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = -17 % ((param0 - 53) / 51);
        if (!(!param1)) {
            System.out.println("Deploy event debug");
            System.out.println("Unit at " + this.field_E + "," + this.field_D);
        }
        String var4 = "EventDeploy: pos: (" + this.field_E + "," + this.field_D + "), mods: " + this.field_B;
        return var4;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -84) {
                break L1;
              } else {
                field_y = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a((byte) -39, param2, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("tr.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static of a(byte param0, long param1) {
        if (param0 != 121) {
            tr.h(23);
        }
        return (of) ((Object) oi.field_d.a((byte) -27, param1));
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        ne var4_ref_ne = null;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param1 == -26661) {
              L1: {
                var6 = param0.c(this.field_D, true, this.field_E);
                if (var6 == null) {
                  break L1;
                } else {
                  if (var6.c(false)) {
                    break L1;
                  } else {
                    L2: {
                      if (var6.field_N != 7) {
                        break L2;
                      } else {
                        var6.e(param1 + 26577);
                        var4_ref_ne = param0.field_Eb[this.field_E - -(this.field_D * param0.field_v)];
                        var4_ref_ne.field_h = 11;
                        var4_ref_ne.field_j = 1;
                        var4_ref_ne.field_b = true;
                        var4_ref_ne.field_g = this.field_B;
                        var4_ref_ne.field_a = var6.field_O;
                        break L2;
                      }
                    }
                    L3: {
                      if ((var6.field_N ^ -1) != -35) {
                        break L3;
                      } else {
                        var6.field_W = true;
                        var6.field_s = true;
                        var6.field_Y = 20;
                        var6.field_t = 20;
                        var6.a((byte) 71);
                        var6.z(10);
                        break L3;
                      }
                    }
                    if (var6.field_N == 17) {
                      L4: {
                        var6.e(param1 ^ 26692);
                        if ((1 & this.field_B ^ -1) < -1) {
                          stackOut_12_0 = -1 + var6.field_J;
                          stackIn_13_0 = stackOut_12_0;
                          break L4;
                        } else {
                          stackOut_11_0 = var6.field_J;
                          stackIn_13_0 = stackOut_11_0;
                          break L4;
                        }
                      }
                      L5: {
                        var4 = stackIn_13_0;
                        if ((2 & this.field_B) > 0) {
                          stackOut_15_0 = var6.field_w - 1;
                          stackIn_16_0 = stackOut_15_0;
                          break L5;
                        } else {
                          stackOut_14_0 = var6.field_w;
                          stackIn_16_0 = stackOut_14_0;
                          break L5;
                        }
                      }
                      var5 = stackIn_16_0;
                      param0.a(var5, var4, (byte) -13, var6.field_O);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              fl.a(param0, -115);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("tr.G(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        at var4 = null;
        Object var5 = null;
        hl var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tg var16 = null;
        tg var17 = null;
        dn stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        dn stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        dn stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        hl stackIn_13_0 = null;
        je stackIn_22_0 = null;
        je stackIn_23_0 = null;
        je stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_27_0 = 0;
        Object stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        dn stackOut_5_0 = null;
        boolean stackOut_5_1 = false;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        dn stackOut_4_0 = null;
        boolean stackOut_4_1 = false;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        hl stackOut_12_0 = null;
        je stackOut_21_0 = null;
        je stackOut_23_0 = null;
        String stackOut_23_1 = null;
        je stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        je stackOut_46_0 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -67) {
                break L1;
              } else {
                field_G = (String) null;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = sc.field_g.field_Kb;
              stackOut_3_1 = param1;
              stackOut_3_2 = (2 + jn.field_d) * (3 * param2);
              stackOut_3_3 = jn.field_d - -2;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (pq.field_b != sc.field_g.field_Kb) {
                stackOut_5_0 = (dn) ((Object) stackIn_5_0);
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L2;
              } else {
                stackOut_4_0 = (dn) ((Object) stackIn_4_0);
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L2;
              }
            }
            L3: {
              L4: {
                var3_int = ((dn) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 != 0, 0, 2) ? 1 : 0;
                var4 = sc.field_g.field_Nb.field_fb;
                if (-3 == (th.field_a ^ -1)) {
                  break L4;
                } else {
                  if ((th.field_a ^ -1) == -2) {
                    break L4;
                  } else {
                    sc.field_g.field_Kb.field_Nb.field_X = ef.field_a;
                    sc.field_g.field_xb = false;
                    jm.a(sc.field_g.field_Nb, -71);
                    if (var15 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              sc.field_g.field_Kb.field_Nb.field_X = null;
              sc.field_g.field_xb = true;
              var5 = null;
              var6 = (hl) ((Object) var4.e((byte) 110));
              L5: while (true) {
                L6: {
                  L7: {
                    if (var6 == null) {
                      break L7;
                    } else {
                      var7 = 0;
                      stackOut_12_0 = (hl) (var6);
                      stackIn_47_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var15 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (stackIn_13_0.field_fb != null) {
                            break L8;
                          } else {
                            var6.field_Qb = new je(0L, ga.field_i);
                            var6.a(var6.field_Qb, 114);
                            var6.field_Jb = new je(0L, ga.field_i);
                            var6.a(var6.field_Jb, 113);
                            var6.i(-10027);
                            var7 = 1;
                            break L8;
                          }
                        }
                        L9: {
                          var6.field_gb = sc.field_g.field_Nb.field_gb;
                          var6.field_Qb.a(jn.field_d, -20500, var6.field_gb, 0, 0);
                          var8 = 0;
                          if (null == var6.field_Nb) {
                            break L9;
                          } else {
                            if (!var6.field_Nb.equals("")) {
                              var6.field_Jb.field_cb = tl.field_e;
                              var6.field_Jb.field_W = 16737894;
                              var6.field_Jb.a(jn.field_d, -20500, tl.field_e.field_A + 3, 0, 0);
                              var8 = 1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var9 = 0;
                          var10 = var6.field_gb;
                          if (var8 == 0) {
                            break L10;
                          } else {
                            var9 = 3 + tl.field_e.field_A;
                            var10 = var10 - var9;
                            break L10;
                          }
                        }
                        L11: {
                          stackOut_21_0 = var6.field_Qb;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var10 <= 0) {
                            stackOut_23_0 = (je) ((Object) stackIn_23_0);
                            stackOut_23_1 = var6.field_Mb;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            break L11;
                          } else {
                            stackOut_22_0 = (je) ((Object) stackIn_22_0);
                            stackOut_22_1 = ka.a(var6.field_Qb.field_Z, var6.field_Mb, var10);
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_24_1 = stackOut_22_1;
                            break L11;
                          }
                        }
                        L12: {
                          stackIn_24_0.field_X = stackIn_24_1;
                          if (var6.field_Qb.field_X.equals(var6.field_Mb)) {
                            stackOut_26_0 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            break L12;
                          } else {
                            stackOut_25_0 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            break L12;
                          }
                        }
                        L13: {
                          var11 = stackIn_27_0;
                          var6.field_Qb.a(jn.field_d, -20500, var10, 0, var9);
                          if (var3_int != 0) {
                            break L13;
                          } else {
                            var6.field_nb = -var6.field_ob + jn.field_d;
                            break L13;
                          }
                        }
                        L14: {
                          if (var7 == 0) {
                            break L14;
                          } else {
                            sc.field_g.field_Nb.a(var6, true, 2, (je) (var5));
                            break L14;
                          }
                        }
                        L15: {
                          L16: {
                            if (var6.field_Jb == null) {
                              break L16;
                            } else {
                              if (!var6.field_Jb.field_eb) {
                                break L16;
                              } else {
                                ad.field_I = var6.field_Nb;
                                if (var15 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          if (!var6.field_Qb.field_eb) {
                            break L15;
                          } else {
                            if (var11 != 0) {
                              ad.field_I = var6.field_Mb;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L17: {
                          if (0 != var6.field_yb) {
                            ng.a(sc.field_g.field_Kb, var6, (int[]) null, var6.field_Mb, -1, -110, -1, var6.field_Pb, 0L);
                            var16 = tn.field_Z;
                            var13_ref_String = jm.field_u;
                            var16.field_i.a(7, var13_ref_String, (byte) -100);
                            var17 = tn.field_Z;
                            var13 = iu.field_t;
                            var14 = ur.field_z;
                            var17.field_i.a(0, var14, 0, (byte) -118, var13);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var5 = var6;
                        var6 = (hl) ((Object) var4.a((byte) 123));
                        if (var15 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L18: {
                    if (0 != sc.field_g.field_Ib.field_yb) {
                      tb.field_e = new oc(sc.field_g.field_Ib.field_V, sc.field_g.field_Ib.field_D, sc.field_g.field_Ib.field_gb, sc.field_g.field_Ib.field_ob, iw.field_o, kq.field_N, eq.field_h, eq.field_h);
                      ut.field_fb = 2;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  stackOut_46_0 = sc.field_g.field_Rb;
                  stackIn_47_0 = stackOut_46_0;
                  break L6;
                }
                if (((je) ((Object) stackIn_47_0)).field_yb == 0) {
                  break L3;
                } else {
                  tb.field_e = new oc(sc.field_g.field_Rb.field_V, sc.field_g.field_Rb.field_D, sc.field_g.field_Rb.field_gb, sc.field_g.field_Rb.field_ob, lw.field_kb, kq.field_N, eq.field_h, eq.field_h);
                  ut.field_fb = 3;
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "tr.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    tr(int param0, int param1, int param2) {
        this.field_B = param2;
        this.field_E = param0;
        this.field_m = 18;
        this.field_D = param1;
    }

    static {
        field_G = "<%0> wants to join";
        field_y = "You win!";
        field_A = 0;
        field_C = new int[][]{null, null, null, null, null, null};
    }
}
