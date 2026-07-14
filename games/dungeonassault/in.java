/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class in extends kg {
    private int field_r;
    String field_p;
    private int field_q;
    static og field_C;
    private int field_z;
    private boolean field_u;
    private int field_F;
    static boolean field_E;
    private int field_x;
    private boolean field_s;
    private long field_A;
    static pp field_y;
    private boolean field_v;
    private int field_w;
    static cn field_D;
    static int[] field_B;
    static String field_t;

    private final void a(String param0, int param1, boolean param2, int param3, int param4) {
        Exception var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        String var11 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        try {
          if (!((in) this).b(-126)) {
            return;
          } else {
            ((in) this).field_p = ((in) this).getCodeBase().getHost();
            var11 = ((in) this).field_p.toLowerCase();
            if (param2) {
              L0: {
                L1: {
                  stackOut_5_0 = this;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var11.equals((Object) (Object) "jagex.com")) {
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (!var11.endsWith(".jagex.com")) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L0;
                    } else {
                      stackOut_7_0 = this;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L0;
              }
              L2: {
                ((in) this).field_u = stackIn_10_1 != 0;
                ((in) this).field_z = Integer.parseInt(((in) this).getParameter("gameport1"));
                ((in) this).field_F = Integer.parseInt(((in) this).getParameter("gameport2"));
                var7 = ((in) this).getParameter("servernum");
                if (var7 != null) {
                  ((in) this).field_r = Integer.parseInt(var7);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                ((in) this).field_w = Integer.parseInt(((in) this).getParameter("gamecrc"));
                ((in) this).field_A = Long.parseLong(((in) this).getParameter("instanceid"));
                ((in) this).field_s = ((in) this).getParameter("member").equals((Object) (Object) "yes");
                var8 = ((in) this).getParameter("lang");
                if (var8 != null) {
                  ((in) this).field_x = Integer.parseInt(var8);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((in) this).field_x < 5) {
                  break L4;
                } else {
                  ((in) this).field_x = 0;
                  break L4;
                }
              }
              L5: {
                var9 = ((in) this).getParameter("affid");
                if (var9 != null) {
                  ((in) this).field_q = Integer.parseInt(var9);
                  break L5;
                } else {
                  break L5;
                }
              }
              f.field_d = Boolean.valueOf(((in) this).getParameter("simplemode")).booleanValue();
              ((in) this).a(32, (byte) 107, param0, param4, param1, param3, ((in) this).field_w);
            } else {
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        sm.a((Throwable) (Object) var6, 1, (String) null);
        ((in) this).a((byte) -112, "crash");
    }

    final void g(byte param0) {
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 != 2) {
          return;
        } else {
          L0: {
            if (!vk.a(22084)) {
              if (dk.field_c < 10) {
                break L0;
              } else {
                if (!l.a(true)) {
                  dh.b(-128);
                  break L0;
                } else {
                  if (kh.field_n != 0) {
                    td.a(pj.field_r, param0 + 119);
                    break L0;
                  } else {
                    int discarded$2 = this.a(false, false, false);
                    break L0;
                  }
                }
              }
            } else {
              L1: {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (null == cm.field_R) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L1;
                }
              }
              int discarded$3 = this.a(stackIn_5_1 != 0, stackIn_5_2 != 0, false);
              break L0;
            }
          }
          return;
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_t = null;
        field_D = null;
        field_y = null;
        field_B = null;
        if (param0 != -1) {
            in.e(-36);
        }
    }

    final static int a(int param0, int param1) {
        param0 = (1431655765 & param0 >>> 449097697) + (param0 & 1431655765);
        if (param1 != 8) {
            in.e(-51);
        }
        param0 = (param0 >>> -1538636638 & -1288490189) + (param0 & 858993459);
        param0 = param0 - -(param0 >>> 627652708) & 252645135;
        param0 = param0 + (param0 >>> 819635336);
        param0 = param0 + (param0 >>> -823313680);
        return 255 & param0;
    }

    final int b(byte param0, boolean param1) {
        if (param0 != 82) {
            int discarded$0 = this.g(12);
        }
        return this.a(false, param1, true);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((in) this).setBackground(java.awt.Color.black);
        hc.field_d = ((in) this).field_x;
        ae.a(hc.field_d, -5);
        dj.a(param1, 5000, ((in) this).field_A, ((in) this).field_z, ((in) this).field_p, ((in) this).field_w, hc.field_d, ((in) this).field_F, ((in) this).field_r, ((in) this).field_s, param6, param0, (byte) -27, i.field_A);
        an.a(((in) this).field_r, ((in) this).field_F, -69, ((in) this).field_z, ((in) this).field_p, hc.field_d, ((in) this).field_w, param1, i.field_A);
        uf.a(param6 ^ 5031);
        bn.field_j = pm.a((byte) 109);
        uk.a(c.field_h, (byte) -126);
        mh.field_a = param5;
        s.field_a = param7;
        bh.field_P = param2;
        pm.field_m = param3;
        sp.field_h = param4;
        this.e((byte) 68);
        ch.a((byte) -110);
    }

    final int f(byte param0) {
        int var2 = this.g(11);
        if (param0 < 86) {
            int discarded$0 = this.g(-68);
        }
        if (-1 != (var2 ^ -1)) {
            // if_icmpne L162
        }
        if (!(!pj.field_w[1])) {
            f.a(2, (byte) -50);
        }
        if (!(!pj.field_w[2])) {
            fl.a((byte) -93, 3);
        }
        if (pj.field_w[3]) {
            ep.a((byte) 127, 4);
        }
        if (!(!pj.field_w[4])) {
            ko.a(true, 5);
        }
        if (!(!pj.field_w[5])) {
            ol.a(8, 6);
        }
        if (!(!pj.field_w[6])) {
            tc.a(7, (byte) -112);
        }
        if (pj.field_w[8]) {
            hj.g(-59);
        }
        return var2;
    }

    private final void e(byte param0) {
        uo.field_c[2] = -2;
        uo.field_c[13] = -1;
        uo.field_c[5] = -1;
        uo.field_c[7] = -1;
        uo.field_c[11] = -1;
        uo.field_c[10] = -1;
        uo.field_c[12] = -1;
        uo.field_c[16] = -1;
        uo.field_c[1] = 16;
        uo.field_c[9] = -1;
        uo.field_c[18] = 1;
        if (param0 != 68) {
            ((in) this).field_A = -61L;
        }
        uo.field_c[17] = -1;
        uo.field_c[8] = -2;
        uo.field_c[6] = -2;
        uo.field_c[3] = -1;
        uo.field_c[4] = -1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = DungeonAssault.field_K;
          var5 = param2 + param0;
          var6 = param3 + param1;
          if (gf.field_j >= param0) {
            stackOut_2_0 = gf.field_j;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param3 > gf.field_f) {
            stackOut_5_0 = param3;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = gf.field_f;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (gf.field_h > var5) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = gf.field_h;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 >= gf.field_e) {
            stackOut_11_0 = gf.field_e;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          if (gf.field_j > param0) {
            break L4;
          } else {
            if (gf.field_h > param0) {
              var11 = var8 * gf.field_i + param0;
              var12 = var10 + (1 - var8) >> 70561761;
              L5: while (true) {
                var12--;
                if (0 > var12) {
                  break L4;
                } else {
                  gf.field_b[var11] = 16777215;
                  var11 = var11 + 2 * gf.field_i;
                  continue L5;
                }
              }
            } else {
              break L4;
            }
          }
        }
        if (param4 != 1) {
          return;
        } else {
          L6: {
            if (gf.field_f > param3) {
              break L6;
            } else {
              if (gf.field_e <= var6) {
                break L6;
              } else {
                var11 = param3 * gf.field_i + var7;
                var12 = -var7 + 1 + var9 >> 1879008897;
                L7: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L6;
                  } else {
                    gf.field_b[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              }
            }
          }
          L8: {
            if (gf.field_j > var5) {
              break L8;
            } else {
              if (var5 >= gf.field_h) {
                break L8;
              } else {
                var11 = (var8 + (1 & var5 + -param0)) * gf.field_i - -var5;
                var12 = var10 + 1 - var8 >> -454410015;
                L9: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L8;
                  } else {
                    gf.field_b[var11] = 16777215;
                    var11 = var11 + 2 * gf.field_i;
                    continue L9;
                  }
                }
              }
            }
          }
          L10: {
            if (gf.field_f > param3) {
              break L10;
            } else {
              if (gf.field_e <= var6) {
                break L10;
              } else {
                var11 = var7 + var6 * gf.field_i - -(-param3 + var6 & 1);
                var12 = -var7 + (var9 + 1) >> 757868257;
                L11: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L10;
                  } else {
                    gf.field_b[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final void d(boolean param0) {
        int var2 = 0;
        la var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          var2 = hc.field_c;
          if (var2 >= 64) {
            break L0;
          } else {
            if (pj.field_w[var2]) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((in) this).field_s = false;
                  break L1;
                }
              }
              if (0 == var2) {
                return;
              } else {
                L2: {
                  if (-2 != var2) {
                    if (var2 == 2) {
                      ui.a(30592);
                      break L2;
                    } else {
                      if (-4 != var2) {
                        if (var2 != 4) {
                          if (-6 != var2) {
                            if (6 == var2) {
                              bf.b(19664);
                              break L2;
                            } else {
                              if (-8 != var2) {
                                if (-9 != (var2 ^ -1)) {
                                  if (var2 != -17) {
                                    L3: {
                                      if (-12 == var2) {
                                        break L3;
                                      } else {
                                        if (-13 != (var2 ^ -1)) {
                                          if ((var2 ^ -1) == -14) {
                                            lf.d((byte) 123);
                                            break L2;
                                          } else {
                                            if (17 != var2) {
                                              if (18 != var2) {
                                                sm.a((Throwable) null, 1, "MGS1: " + sj.l(192));
                                                tl.a(124);
                                                break L2;
                                              } else {
                                                rc.c(16777215);
                                                break L2;
                                              }
                                            } else {
                                              this.d(-28859);
                                              break L2;
                                            }
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      if (var2 != 12) {
                                        stackOut_31_0 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        break L4;
                                      } else {
                                        stackOut_30_0 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        break L4;
                                      }
                                    }
                                    var3 = d.a(stackIn_32_0 != 0, (byte) 118);
                                    jm.a(var3, (byte) 116);
                                    break L2;
                                  } else {
                                    ih.a((byte) 59);
                                    break L2;
                                  }
                                } else {
                                  hb.a(-5, (ec) (Object) ra.field_c, i.field_A, nj.field_b);
                                  break L2;
                                }
                              } else {
                                this.f(8);
                                break L2;
                              }
                            }
                          } else {
                            rm.q(-5705);
                            break L2;
                          }
                        } else {
                          L5: {
                            if (param0) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L5;
                            } else {
                              stackOut_14_0 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              break L5;
                            }
                          }
                          hd.a(stackIn_16_0 != 0);
                          break L2;
                        }
                      } else {
                        pk.d(126);
                        break L2;
                      }
                    }
                  } else {
                    lg.a(72);
                    break L2;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        sm.a((Throwable) null, 1, "MGS2: " + sj.l(192));
        tl.a(-48);
    }

    private final void d(int param0) {
        if (param0 != -28859) {
            int discarded$0 = ((in) this).f((byte) 39);
        }
        int var2 = ra.field_c.c(true);
        int var3 = -1 != (var2 & 1 ^ -1) ? 1 : 0;
        int var4 = nj.field_b - 1;
        byte[] var5 = new byte[var4];
        ra.field_c.a(0, (byte) 95, var4, var5);
        oe.a((byte) 121, var3 != 0, m.c(true), dj.a(var5, false));
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            ec var12 = null;
            boolean stackIn_6_0 = false;
            cd stackIn_6_1 = null;
            boolean stackIn_7_0 = false;
            cd stackIn_7_1 = null;
            boolean stackIn_8_0 = false;
            cd stackIn_8_1 = null;
            int stackIn_8_2 = 0;
            int stackIn_46_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_48_1 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_5_0 = false;
            cd stackOut_5_1 = null;
            boolean stackOut_7_0 = false;
            cd stackOut_7_1 = null;
            int stackOut_7_2 = 0;
            boolean stackOut_6_0 = false;
            cd stackOut_6_1 = null;
            int stackOut_6_2 = 0;
            int stackOut_45_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_47_1 = 0;
            int stackOut_46_0 = 0;
            int stackOut_46_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = DungeonAssault.field_K;
                        if (!param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        int discarded$2 = this.a(false, false, false);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var4 = o.a(16711680, hc.field_d, param1, pj.field_r);
                        if (-1 != (var4 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        throw new IllegalStateException();
                    }
                    case 4: {
                        if (var4 != 1) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        stackOut_5_0 = param0;
                        stackOut_5_1 = ln.a((byte) -120);
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        stackOut_6_0 = stackIn_6_0;
                        stackOut_6_1 = (cd) (Object) stackIn_6_1;
                        stackOut_6_2 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        stackOut_7_0 = stackIn_7_0;
                        stackOut_7_1 = (cd) (Object) stackIn_7_1;
                        stackOut_7_2 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var5_int = qh.a(stackIn_8_0, stackIn_8_1, om.a(stackIn_8_2 != 0));
                        if (-1 != var5_int) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ri.a(tp.field_v, mf.field_c, var5_int, -15);
                        mf.field_c = null;
                        tp.field_v = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        var11 = fb.a((byte) 92);
                        if (var11 != null) {
                            statePc = 13;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ig.a(-99, var11.booleanValue());
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if ((var4 ^ -1) != -3) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var5_int = qm.a(((in) this).field_q, rn.a(-87), tp.c((byte) -73), em.e(7142), vl.c(-29455), 57, co.e((byte) 57));
                        if (-1 == var5_int) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        gj.a(var5_int, 29120, mf.field_c, tp.field_v);
                        tp.field_v = null;
                        mf.field_c = null;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (3 == var4) {
                            statePc = 19;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (gm.field_c == -1) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (-1 == (gm.field_c ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        gm.field_c = -1;
                        en.a((byte) -54);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (param2) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var5_int = bh.a(((in) this).field_u, em.e(7142), 106, ((in) this).field_q, false, vl.c(-29455));
                        if (var5_int != -1) {
                            statePc = 25;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (var5_int == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        nf.a(var5_int, true, tp.field_v);
                        tp.field_v = null;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 27: {
                        ne.field_g = hg.field_s;
                        bl.b((byte) -97);
                        kh.field_n = 10;
                        tl.field_l = false;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        hh.field_c = false;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (4 == var4) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (!ld.field_g) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        pd.a(5189, m.c(true));
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 33: {
                        tl.field_l = true;
                        kh.field_n = 10;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (-6 != (var4 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        eg.a((byte) -37, m.c(true));
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (6 != var4) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if (oj.field_b) {
                            statePc = 39;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        kh.field_n = 10;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if ((var4 ^ -1) == -8) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        pa.a(123, m.c(true));
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (8 == var4) {
                            statePc = 45;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 5189;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (param0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = stackIn_46_0;
                        stackOut_46_1 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackOut_47_0 = stackIn_47_0;
                        stackOut_47_1 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        pd.a(stackIn_48_0, m.c(stackIn_48_1 != 0));
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (9 != var4) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        jl.a(m.c(true), false);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (10 == var4) {
                            statePc = 53;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        ac.field_B.d((byte) -90, 17);
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if ((var4 ^ -1) == -12) {
                            statePc = 56;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        fk.a(84, m.c(true));
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        if ((var4 ^ -1) != -13) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        oe.a(ao.a(-21), m.c(true), (byte) 94);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        if (13 != var4) {
                            statePc = 69;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        try {
                            if (null != hl.field_i) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            hl.field_i = new tl(i.field_A, new java.net.URL(((in) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (!hl.field_i.d(34)) {
                                statePc = 69;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var12 = hl.field_i.c(3);
                            if (var12 == null) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var7 = mk.a((byte) -24, var12.field_m, var12.field_o, 0);
                            rg.a(15, var7);
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var9 = null;
                            rg.a(15, (String) null);
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            hl.field_i = null;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        var5 = (Exception) (Object) caughtException;
                        sm.a((Throwable) (Object) var5, 1, "S1");
                        var10 = null;
                        rg.a(15, (String) null);
                        hl.field_i = null;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        if (var4 == -16) {
                            statePc = 71;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        kh.field_n = 10;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        if (-17 == var4) {
                            statePc = 74;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        return 1;
                    }
                    case 75: {
                        if (17 == var4) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        return 0;
                    }
                    case 77: {
                        return 2;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        if (param0 != 8) {
            return;
        }
        String var2 = eg.a(-96);
        sm.a(m.c(true), 31500, var2);
    }

    final void a(int param0, String param1, int param2) {
        if (param2 != 0) {
            return;
        }
        this.a(param1, 640, true, param0, 480);
    }

    protected in() {
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        String stackIn_103_2 = null;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        String stackIn_104_2 = null;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        String stackIn_105_2 = null;
        int stackIn_105_3 = 0;
        int stackIn_134_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        String stackOut_102_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        String stackOut_104_2 = null;
        int stackOut_104_3 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        String stackOut_103_2 = null;
        int stackOut_103_3 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var5 = DungeonAssault.field_K;
          if (null != il.field_c) {
            L1: {
              if (cm.field_R == null) {
                var6 = ua.a(0);
                var4 = var6.getSize();
                il.field_c.a(var4.height, true, var4.width);
                break L1;
              } else {
                break L1;
              }
            }
            il.field_c.e(6731);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          bp.b(94);
          ke.b(param1 + 74);
          if (param1 == -74) {
            break L2;
          } else {
            ((in) this).field_q = -128;
            break L2;
          }
        }
        L3: {
          if (ao.a((byte) -116)) {
            break L3;
          } else {
            if ((kh.field_n ^ -1) != -12) {
              cp.f(-30208);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (bn.field_j == null) {
            break L4;
          } else {
            pj.field_r = bn.field_j.a(6);
            break L4;
          }
        }
        L5: {
          if (!dh.a((byte) -120)) {
            break L5;
          } else {
            L6: {
              var3 = 1200 * eg.c(1);
              if (((in) this).field_v) {
                break L6;
              } else {
                if (ib.b((byte) 31) <= var3) {
                  break L5;
                } else {
                  if (var3 >= mn.a((byte) 106)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            ((in) this).field_v = false;
            tl.a(122);
            l.a(param1 + 73);
            nf.a(2, true, sj.field_V);
            ql.a((byte) -105);
            hh.field_c = true;
            ab.field_a = 15000L + kd.c(-2456);
            break L5;
          }
        }
        L7: {
          L8: {
            if ((gm.field_c ^ -1) == 0) {
              break L8;
            } else {
              if (gm.field_c == 0) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          L9: {
            if ((gm.field_c ^ -1) != 0) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L9;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L9;
            }
          }
          var3 = stackIn_26_0;
          gm.field_c = fp.a((byte) 70);
          if (var3 == 0) {
            if (gm.field_c == 0) {
              break L7;
            } else {
              if (-1 == gm.field_c) {
                break L7;
              } else {
                ab.field_a = 15000L + kd.c(param1 ^ 2526);
                break L7;
              }
            }
          } else {
            if (gm.field_c == 0) {
              break L7;
            } else {
              if (-1 == gm.field_c) {
                break L7;
              } else {
                ab.field_a = 15000L + kd.c(param1 ^ 2526);
                break L7;
              }
            }
          }
        }
        L10: {
          if (-1 == gm.field_c) {
            break L10;
          } else {
            if (-1 == (gm.field_c ^ -1)) {
              break L10;
            } else {
              if (10 <= dk.field_c) {
                if (-11 >= (kh.field_n ^ -1)) {
                  L11: {
                    l.a(param1 + 73);
                    if (3 != gm.field_c) {
                      if ((gm.field_c ^ -1) == -5) {
                        nf.a(256, true, sf.field_e);
                        break L11;
                      } else {
                        if ((gm.field_c ^ -1) == -3) {
                          nf.a(256, true, ul.field_b);
                          break L11;
                        } else {
                          if ((gm.field_c ^ -1) != -6) {
                            nf.a(256, true, b.field_b);
                            break L11;
                          } else {
                            nf.a(5, true, ed.field_W);
                            break L11;
                          }
                        }
                      }
                    } else {
                      nf.a(256, true, ck.field_D);
                      break L11;
                    }
                  }
                  hh.field_c = true;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if (3 == gm.field_c) {
                  ((in) this).a((byte) -112, "js5crc");
                  break L10;
                } else {
                  if (gm.field_c == 4) {
                    ((in) this).a((byte) -112, "js5io");
                    break L10;
                  } else {
                    if (2 != gm.field_c) {
                      if (gm.field_c != 5) {
                        ((in) this).a((byte) -112, "js5connect");
                        break L10;
                      } else {
                        ((in) this).a((byte) -112, "outofdate");
                        break L10;
                      }
                    } else {
                      ((in) this).a((byte) -112, "js5connect_full");
                      break L10;
                    }
                  }
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (0 == (gm.field_c ^ -1)) {
                break L14;
              } else {
                if (0 != gm.field_c) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!dm.c(param1 + -43)) {
              break L12;
            } else {
              break L13;
            }
          }
          if ((kd.c(param1 + -2382) ^ -1L) <= (ab.field_a ^ -1L)) {
            hh.field_c = false;
            if (0 == gm.field_c) {
              break L12;
            } else {
              if (0 == gm.field_c) {
                break L12;
              } else {
                gm.field_c = -1;
                en.a((byte) -124);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (-1 != gm.field_c) {
            break L15;
          } else {
            if (!dm.c(-125)) {
              u.field_O = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (0 != dk.field_c) {
            break L16;
          } else {
            if (ln.a(255)) {
              dk.field_c = 1;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if ((dk.field_c ^ -1) != -2) {
            break L17;
          } else {
            L18: {
              if (hc.field_d == 0) {
                break L18;
              } else {
                ia.field_U = mk.a(mh.field_a, (byte) 34);
                break L18;
              }
            }
            fi.field_u = qd.a(false, true, s.field_a, (byte) -31, 1);
            kg.field_b = qd.a(false, true, pm.field_m, (byte) -31, 1);
            ib.field_b = qd.a(false, true, sp.field_h, (byte) -31, 1);
            dk.field_c = 2;
            gh.field_c = kg.field_b;
            uc.field_I = fi.field_u;
            break L17;
          }
        }
        L19: {
          if (dk.field_c == 2) {
            L20: {
              if (null != ia.field_U) {
                if (!ia.field_U.a(param1 + -14280)) {
                  break L20;
                } else {
                  if (ia.field_U.c("", param1 ^ -74)) {
                    if (!ia.field_U.a(false, "")) {
                      break L20;
                    } else {
                      ng.a(param1 ^ 27014, ia.field_U);
                      ia.field_U = null;
                      nf.d(0);
                      break L20;
                    }
                  } else {
                    ia.field_U = null;
                    break L20;
                  }
                }
              } else {
                break L20;
              }
            }
            if (ia.field_U != null) {
              break L19;
            } else {
              dk.field_c = 3;
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if ((dk.field_c ^ -1) == -4) {
            if (!ql.a(kg.field_b, ib.field_b, (byte) 61, fi.field_u)) {
              break L21;
            } else {
              if (fl.a(-43, ib.field_b)) {
                L22: {
                  L23: {
                    jm.a(false);
                    am.b(112);
                    lj.field_e = bg.field_t;
                    oj.field_b = false;
                    h.a(param1 ^ -8099, fi.field_u, ib.field_b, ld.field_g, kg.field_b);
                    if (np.field_D) {
                      break L23;
                    } else {
                      if (null == mi.field_d) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_99_0 = 8192;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_100_0 = stackOut_99_0;
                    if (np.field_D) {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      break L24;
                    } else {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_102_0 = stackIn_102_0;
                    stackOut_102_1 = stackIn_102_1;
                    stackOut_102_2 = mi.field_d;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_104_1 = stackOut_102_1;
                    stackIn_104_2 = stackOut_102_2;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    stackIn_103_2 = stackOut_102_2;
                    if (np.field_D) {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = (String) (Object) stackIn_104_2;
                      stackOut_104_3 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      stackIn_105_2 = stackOut_104_2;
                      stackIn_105_3 = stackOut_104_3;
                      break L25;
                    } else {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = (String) (Object) stackIn_103_2;
                      stackOut_103_3 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      stackIn_105_2 = stackOut_103_2;
                      stackIn_105_3 = stackOut_103_3;
                      break L25;
                    }
                  }
                  hd.a(stackIn_105_0, stackIn_105_1 != 0, stackIn_105_2, stackIn_105_3 != 0);
                  break L22;
                }
                L26: {
                  if (!f.field_d) {
                    break L26;
                  } else {
                    kd.a(4);
                    break L26;
                  }
                }
                L27: {
                  if (je.field_c != null) {
                    break L27;
                  } else {
                    je.field_c = fb.b((byte) 127);
                    tb.field_g = ab.a((byte) -97);
                    break L27;
                  }
                }
                nh.a((byte) -96, ib.field_b, je.field_c, tb.field_g);
                ib.field_b = null;
                fi.field_u = null;
                kg.field_b = null;
                qj.a((java.applet.Applet) this, (byte) 89);
                nf.d(0);
                dk.field_c = 10;
                break L21;
              } else {
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (dk.field_c != 10) {
            break L28;
          } else {
            L29: {
              if (hc.field_d != 0) {
                ec.field_k = mk.a(bh.field_P, (byte) 34);
                break L29;
              } else {
                break L29;
              }
            }
            dk.field_c = 11;
            break L28;
          }
        }
        L30: {
          if (-12 != (dk.field_c ^ -1)) {
            break L30;
          } else {
            L31: {
              if (null == ec.field_k) {
                break L31;
              } else {
                L32: {
                  if (!ec.field_k.a(-14354)) {
                    break L32;
                  } else {
                    if (!ec.field_k.a((byte) 59)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                tp.a(10, 0.0f, lk.a(ki.field_c, ec.field_k, ec.field_r, (byte) -125));
                break L30;
              }
            }
            ld.field_i = true;
            dk.field_c = 12;
            break L30;
          }
        }
        L33: {
          if ((dk.field_c ^ -1) != -13) {
            break L33;
          } else {
            if (!ld.field_i) {
              dk.field_c = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if ((dk.field_c ^ -1) == -14) {
            L35: {
              var3 = 1;
              if (be.field_s != null) {
                L36: {
                  if (!be.field_s.a(false)) {
                    stackOut_133_0 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    break L36;
                  } else {
                    stackOut_132_0 = 1;
                    stackIn_134_0 = stackOut_132_0;
                    break L36;
                  }
                }
                var3 = stackIn_134_0;
                tp.a(10, be.field_s.field_j, be.field_s.field_b);
                break L35;
              } else {
                break L35;
              }
            }
            if (var3 == 0) {
              break L34;
            } else {
              dk.field_c = 20;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (!ve.field_a) {
              break L37;
            } else {
              pd.a(c.field_h, -32);
              ((in) this).d((byte) 121);
              uk.a(c.field_h, (byte) -124);
              break L37;
            }
          }
        }
        L38: {
          if (!pj.field_w[8]) {
            break L38;
          } else {
            ta.b(12841);
            break L38;
          }
        }
    }

    private final int g(int param0) {
        if (param0 != 11) {
            return 24;
        }
        if (((in) this).field_i) {
            return -1;
        }
        if (!(dm.c(-118))) {
            return -1;
        }
        if (hh.field_c) {
            return -1;
        }
        int var2 = bh.a(((in) this).field_u, em.e(7142), 116, ((in) this).field_q, true, vl.c(-29455));
        if (!((var2 ^ -1) != 0)) {
            return -1;
        }
        if (0 != var2) {
            // if_icmpeq L93
        } else {
            if (kh.field_n == 11) {
                if (!(gm.field_c != 0)) {
                    bl.b((byte) -97);
                }
            }
            return var2;
        }
        if (!rm.field_P) {
            ((in) this).a((byte) -112, "reconnect");
        }
        l.a(-1);
        nf.a(var2, true, tp.field_v);
        hh.field_c = true;
        ab.field_a = 15000L + kd.c(-2456);
        return var2;
    }

    final void b(boolean param0, byte param1) {
        pj.field_w[16] = true;
        if (param1 >= -33) {
            ((in) this).field_F = 36;
        }
        pj.field_w[7] = true;
        pj.field_w[18] = true;
        pj.field_w[3] = true;
        pj.field_w[8] = param0;
        pj.field_w[17] = true;
        pj.field_w[0] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new og();
        field_B = new int[]{2, 13, 14, 8, 28, 7, 11};
        field_t = "Nimble even by the standards of his dexterous race, the saurus slink can dodge traps and attacks with equal ease.";
    }
}
