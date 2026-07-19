/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends we {
    static String field_t;
    static int field_q;
    static int field_s;
    private lh field_v;
    static String field_u;
    static String field_x;
    static byte[][] field_w;
    private int field_r;

    pc(int param0) {
        super(param0);
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$3 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param3 <= var5_int) {
                    break L3;
                  } else {
                    fieldTemp$3 = this.field_m;
                    this.field_m = this.field_m + 1;
                    param0[var5_int - -param1] = (byte)(this.field_k[fieldTemp$3] + -this.field_v.a(256));
                    var5_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param2 >= 25) {
                  break L2;
                } else {
                  this.field_v = (lh) null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("pc.AB(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void g(int param0, int param1) {
        int discarded$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 15514) {
                break L1;
              } else {
                discarded$4 = this.f((byte) -21);
                break L1;
              }
            }
            fieldTemp$5 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_k[fieldTemp$5] = (byte)(param0 + this.field_v.a(256));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "pc.WA(" + param0 + ',' + param1 + ')');
        }
    }

    final static im a(int param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        bb var4 = null;
        Object var5 = null;
        Object var6 = null;
        im var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        wi var17 = null;
        String var18 = null;
        int var19 = 0;
        gp stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        gp stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        gp stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        im stackIn_18_0 = null;
        ak stackIn_43_0 = null;
        ak stackIn_45_0 = null;
        ak stackIn_46_0 = null;
        String stackIn_46_1 = null;
        ak stackIn_47_0 = null;
        ak stackIn_49_0 = null;
        ak stackIn_50_0 = null;
        String stackIn_50_1 = null;
        int stackIn_54_0 = 0;
        Object stackIn_95_0 = null;
        im stackIn_103_0 = null;
        Object stackIn_105_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gp stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        gp stackOut_4_0 = null;
        boolean stackOut_4_1 = false;
        int stackOut_4_2 = 0;
        gp stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        im stackOut_17_0 = null;
        ak stackOut_42_0 = null;
        ak stackOut_45_0 = null;
        String stackOut_45_1 = null;
        ak stackOut_43_0 = null;
        String stackOut_43_1 = null;
        ak stackOut_46_0 = null;
        ak stackOut_49_0 = null;
        String stackOut_49_1 = null;
        ak stackOut_47_0 = null;
        String stackOut_47_1 = null;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        ak stackOut_94_0 = null;
        Object stackOut_104_0 = null;
        im stackOut_102_0 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = ma.field_z.field_Gb;
              stackOut_1_1 = param1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (bj.field_d != ma.field_z.field_Gb) {
                stackOut_4_0 = (gp) ((Object) stackIn_4_0);
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L1;
              } else {
                stackOut_2_0 = (gp) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((gp) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2 != 0, 2, param0 * (3 * fq.field_q + 6), 0, 2 + fq.field_q) ? 1 : 0;
                var4 = ma.field_z.field_Fb.field_L;
                var5 = null;
                if ((gk.field_db ^ -1) == -3) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      wa.field_f.field_rb = false;
                      ak.field_E.field_cb = wd.field_b;
                      if ((gk.field_db ^ -1) == -2) {
                        break L5;
                      } else {
                        ma.field_z.field_Gb.field_Ib.field_cb = mk.field_c;
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ma.field_z.field_Gb.field_Ib.field_cb = ih.field_d;
                    break L4;
                  }
                  wd.a(ma.field_z.field_Fb, false);
                  if (var19 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              wa.field_f.field_rb = true;
              ak.field_E.field_cb = sd.a(ke.field_e, 78, new String[]{qp.field_L});
              ma.field_z.field_Gb.field_Ib.field_cb = null;
              var6 = null;
              var7 = (im) ((Object) var4.c(1504642273));
              L6: while (true) {
                L7: {
                  L8: {
                    if (var7 == null) {
                      break L8;
                    } else {
                      var8 = 0;
                      stackOut_17_0 = (im) (var7);
                      stackIn_95_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var19 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_18_0.field_L == null) {
                            var7.field_Pb = new ak(0L, ak.field_T);
                            var7.a(var7.field_Pb, (byte) 26);
                            var7.field_Eb = new ak(0L, of.field_i);
                            var7.a(var7.field_Eb, (byte) 26);
                            var7.field_Ob = new ak(0L, ak.field_T);
                            var7.a(var7.field_Ob, (byte) 26);
                            var7.field_Eb.field_Bb = 2;
                            var7.h(-257);
                            var8 = 1;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          L11: {
                            var7.field_K = ma.field_z.field_Fb.field_K;
                            var9 = 0;
                            if (null == var7.field_Nb) {
                              break L11;
                            } else {
                              L12: {
                                if (var7.field_Nb != qp.field_L) {
                                  break L12;
                                } else {
                                  var11 = 6750054;
                                  var10 = 52224;
                                  if (var19 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var10 = 13421568;
                              var11 = 16777062;
                              if (var19 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var11 = 16737894;
                          var10 = 13369344;
                          break L10;
                        }
                        L13: {
                          var12 = 0;
                          if (null == var7.field_Gb) {
                            break L13;
                          } else {
                            if (!var7.field_Gb.equals("")) {
                              var7.field_Ob.field_y = var11;
                              var7.field_Ob.field_H = dk.field_e;
                              var7.field_Ob.a(var9, fq.field_q, 0, 256, 3 + dk.field_e.field_A);
                              var12 = 1;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          var7.field_Eb.field_y = var11;
                          var7.field_Pb.field_y = var11;
                          var7.field_Eb.field_N = var10;
                          var7.field_Pb.field_N = var10;
                          var7.field_Eb.field_pb = var11;
                          var7.field_Pb.field_pb = var11;
                          var7.field_Eb.field_Cb = var11;
                          var7.field_Pb.field_Cb = var11;
                          var13 = 0;
                          var14 = var7.field_K + -82;
                          if (var12 != 0) {
                            var13 = dk.field_e.field_A - -3;
                            var14 = var14 - var13;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          stackOut_42_0 = var7.field_Pb;
                          stackIn_45_0 = stackOut_42_0;
                          stackIn_43_0 = stackOut_42_0;
                          if (var14 > 0) {
                            stackOut_45_0 = (ak) ((Object) stackIn_45_0);
                            stackOut_45_1 = jl.a(var7.field_Pb.field_Db, var7.field_Fb, var14);
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            break L15;
                          } else {
                            stackOut_43_0 = (ak) ((Object) stackIn_43_0);
                            stackOut_43_1 = var7.field_Fb;
                            stackIn_46_0 = stackOut_43_0;
                            stackIn_46_1 = stackOut_43_1;
                            break L15;
                          }
                        }
                        L16: {
                          stackIn_46_0.field_cb = stackIn_46_1;
                          var7.field_Pb.a(var9, fq.field_q, var13, 256, var14);
                          stackOut_46_0 = var7.field_Eb;
                          stackIn_49_0 = stackOut_46_0;
                          stackIn_47_0 = stackOut_46_0;
                          if (null != var7.field_Nb) {
                            stackOut_49_0 = (ak) ((Object) stackIn_49_0);
                            stackOut_49_1 = var7.field_Nb;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            break L16;
                          } else {
                            stackOut_47_0 = (ak) ((Object) stackIn_47_0);
                            stackOut_47_1 = re.field_g;
                            stackIn_50_0 = stackOut_47_0;
                            stackIn_50_1 = stackOut_47_1;
                            break L16;
                          }
                        }
                        L17: {
                          stackIn_50_0.field_cb = stackIn_50_1;
                          var7.field_Eb.a(var9, fq.field_q, -80 + var7.field_K, 256, 80);
                          if (var7.field_Pb.field_cb.equals(var7.field_Fb)) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L17;
                          } else {
                            stackOut_51_0 = 1;
                            stackIn_54_0 = stackOut_51_0;
                            break L17;
                          }
                        }
                        L18: {
                          var15 = stackIn_54_0;
                          var9 = var9 + fq.field_q;
                          if (var3_int != 0) {
                            break L18;
                          } else {
                            var7.field_Z = -var7.field_nb + var9;
                            break L18;
                          }
                        }
                        L19: {
                          if (var8 == 0) {
                            break L19;
                          } else {
                            ma.field_z.field_Fb.a(var7, 2, -1, (ak) (var6));
                            break L19;
                          }
                        }
                        L20: {
                          L21: {
                            var6 = var7;
                            if (var7.field_Ob == null) {
                              break L21;
                            } else {
                              if (!var7.field_Ob.field_W) {
                                break L21;
                              } else {
                                up.field_o = var7.field_Gb;
                                if (var19 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          L22: {
                            if (0 != var7.field_P) {
                              break L22;
                            } else {
                              if (!var7.field_Pb.field_W) {
                                break L20;
                              } else {
                                if (var15 == 0) {
                                  break L20;
                                } else {
                                  up.field_o = var7.field_Fb;
                                  if (var19 == 0) {
                                    break L20;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                          var16 = var7.field_Fb;
                          em.a((String) null, 0L, var16, -1, var7, -163, ma.field_z.field_Gb, (int[]) null, -1);
                          var5 = var7;
                          if (var7.field_Nb == null) {
                            break L20;
                          } else {
                            if (ul.a(75, eg.field_n.field_h)) {
                              break L20;
                            } else {
                              if (ln.field_q) {
                                break L20;
                              } else {
                                L23: {
                                  if (!lh.field_g) {
                                    var17 = eg.field_n;
                                    var18 = sd.a(nf.field_e, 46, new String[]{var16});
                                    var17.field_b.a(var18, (byte) -105, 8);
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                var17 = eg.field_n;
                                var18 = sd.a(ho.field_f, 101, new String[]{var16});
                                var17.field_b.a(var18, (byte) -102, 18);
                                break L20;
                              }
                            }
                          }
                        }
                        var7 = (im) ((Object) var4.f(1504642273));
                        if (var19 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_94_0 = ma.field_z.field_Ib;
                  stackIn_95_0 = stackOut_94_0;
                  break L7;
                }
                L24: {
                  if ((((ak) ((Object) stackIn_95_0)).field_P ^ -1) == -1) {
                    break L24;
                  } else {
                    he.field_f = new ve(ma.field_z.field_Ib.field_tb, ma.field_z.field_Ib.field_gb, ma.field_z.field_Ib.field_K, ma.field_z.field_Ib.field_nb, jj.field_j, po.field_c, mg.field_h, mg.field_h);
                    il.field_e = 0;
                    break L24;
                  }
                }
                if ((ma.field_z.field_Hb.field_P ^ -1) == -1) {
                  break L2;
                } else {
                  he.field_f = new ve(ma.field_z.field_Hb.field_tb, ma.field_z.field_Hb.field_gb, ma.field_z.field_Hb.field_K, ma.field_z.field_Hb.field_nb, hp.field_Fb, po.field_c, mg.field_h, mg.field_h);
                  il.field_e = 1;
                  break L2;
                }
              }
            }
            if (param2 >= 47) {
              stackOut_104_0 = var5;
              stackIn_105_0 = stackOut_104_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_102_0 = (im) null;
              stackIn_103_0 = stackOut_102_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "pc.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_103_0;
        } else {
          return (im) ((Object) stackIn_105_0);
        }
    }

    final void o(int param0) {
        try {
            this.field_m = (param0 + this.field_r) / 8;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pc.BB(" + param0 + ')');
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            this.field_v = new lh(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("pc.EB(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    pc(byte[] param0) {
        super(param0);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -47) {
                break L1;
              } else {
                field_q = -19;
                break L1;
              }
            }
            L2: {
              L3: {
                param2 = ub.a(param2, param1 ^ -47, "", '_');
                var3 = bc.b(0, param0);
                if (0 != (param2.indexOf(param0) ^ -1)) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("pc.CB(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void n(int param0) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -2) {
                break L1;
              } else {
                discarded$2 = pc.a((String) null, (byte) -7, (String) null);
                break L1;
              }
            }
            this.field_r = this.field_m * 8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pc.VA(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        int fieldTemp$2 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 83) {
                break L1;
              } else {
                field_q = -104;
                break L1;
              }
            }
            fieldTemp$2 = this.field_m;
            this.field_m = this.field_m + 1;
            stackOut_3_0 = 255 & this.field_k[fieldTemp$2] + -this.field_v.a(256);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pc.UA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int c(int param0, byte param1) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_r >> 2128391779;
            if (param1 == -34) {
              var4 = 8 + -(7 & this.field_r);
              var5 = 0;
              this.field_r = this.field_r + param0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if ((var4 ^ -1) <= (param0 ^ -1)) {
                        break L4;
                      } else {
                        incrementValue$2 = var3_int;
                        var3_int++;
                        var5 = var5 + ((pk.field_a[var4] & this.field_k[incrementValue$2]) << param0 + -var4);
                        param0 = param0 - var4;
                        var4 = 8;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if ((param0 ^ -1) == (var4 ^ -1)) {
                      break L3;
                    } else {
                      var5 = var5 + (this.field_k[var3_int] >> -param0 + var4 & pk.field_a[param0]);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = var5 + (this.field_k[var3_int] & pk.field_a[var4]);
                  break L2;
                }
                stackOut_13_0 = var5;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 65;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "pc.DB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    public static void m(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_t = null;
              if (param0 == 25208) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            field_w = (byte[][]) null;
            field_x = null;
            field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pc.SA(" + param0 + ')');
        }
    }

    static {
        field_t = "Invite only";
        field_s = 250;
        field_u = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_x = "Loading fonts";
        field_w = new byte[50][];
    }
}
