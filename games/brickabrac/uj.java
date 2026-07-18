/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private int field_i;
    private int field_f;
    private int field_g;
    private km field_m;
    private nc field_l;
    private int field_n;
    int field_h;
    private int field_b;
    private boolean field_d;
    private int field_j;
    private int field_a;
    private int field_k;
    static jp[] field_e;
    static mf field_o;
    private int field_c;
    private q field_p;
    private int field_r;
    int field_q;

    public static void a(boolean param0) {
        field_o = null;
        field_e = null;
    }

    final void a(int param0, boolean param1) {
        ((uj) this).field_g = ((uj) this).field_g + param0;
        if (!param1) {
            return;
        }
        if (((uj) this).field_g < 0) {
            ((uj) this).field_g = 0;
        }
        if (((uj) this).field_g > ((uj) this).field_k) {
            ((uj) this).field_g = ((uj) this).field_k;
        }
    }

    final static void a(int param0) {
        if (null == ag.field_D) {
          ag.field_D = new String[46];
          ag.field_D[5] = gg.field_l;
          ag.field_D[3] = tn.field_B;
          ag.field_D[4] = pp.field_c;
          ag.field_D[9] = mq.field_d;
          ag.field_D[1] = da.field_H;
          ag.field_D[11] = ej.field_H;
          ag.field_D[7] = jj.field_b;
          ag.field_D[0] = mo.field_O;
          ag.field_D[6] = rd.field_b;
          ag.field_D[8] = null;
          ag.field_D[13] = di.field_a;
          ag.field_D[27] = ld.field_r;
          ag.field_D[2] = pj.field_e;
          sl.field_A[11] = tn.field_w;
          sl.field_A[5] = ef.field_c;
          sl.field_A[6] = ch.field_i;
          sl.field_A[9] = mk.field_a;
          sl.field_A[4] = tm.field_d;
          ag.field_D[14] = pl.field_c[0];
          sl.field_A[3] = sj.field_e;
          ag.field_D[39] = ki.field_o;
          ag.field_D[23] = mh.field_mb;
          ag.field_D[21] = a.field_r;
          ag.field_D[17] = vq.field_E[0];
          ag.field_D[38] = kk.field_a;
          ag.field_D[34] = f.field_b;
          ag.field_D[28] = sn.field_r;
          ag.field_D[19] = jf.field_g;
          ag.field_D[35] = mq.field_d;
          ag.field_D[20] = pn.field_q;
          ag.field_D[33] = t.field_c;
          ag.field_D[32] = hk.field_L;
          ag.field_D[25] = ck.field_i;
          ag.field_D[24] = gi.field_r;
          ag.field_D[42] = oc.field_u;
          ag.field_D[37] = mq.field_i;
          sl.field_A[7] = ke.field_f;
          sl.field_A[8] = oq.field_v;
          ag.field_D[15] = pl.field_c[1];
          ag.field_D[16] = pl.field_c[2];
          sl.field_A[12] = uo.field_b;
          sl.field_A[10] = eh.field_d;
          ag.field_D[18] = vq.field_E[1];
          ag.field_D[26] = oq.field_u;
          ag.field_D[22] = d.field_D;
          sl.field_A[13] = vp.field_s;
          hm.field_b = new String[]{mi.field_a, qm.field_c, oa.field_Pb, s.field_a};
          sl.field_A[16] = dc.field_d;
          qn.field_u = new String[]{vh.field_T, oc.field_u};
          eh.field_e = new String[]{ag.field_C, bh.field_ub, qo.field_P, bq.field_f, jh.field_c};
          ar.field_a = new String[]{kk.field_a};
          sl.field_A[15] = ab.field_F;
          ih.field_j = new String[]{ff.field_g, pq.field_m, bm.field_b, bn.field_t};
          ml.field_e = new String[]{qi.field_N, bg.field_o, ue.field_a, eb.field_m, ch.field_j, vg.field_a, nk.field_f, tm.field_h};
          sl.field_A[17] = pq.field_q;
          sl.field_A[14] = vh.field_V;
          sl.field_A[18] = gf.field_g;
          return;
        } else {
          return;
        }
    }

    final static short[] a(byte param0, short[] param1, pi param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_18_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 < -53) {
              var4_int = param2.c(16, (byte) 61);
              if (var4_int != 0) {
                L1: {
                  L2: {
                    if (param1 == null) {
                      break L2;
                    } else {
                      if (param1.length == var4_int) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param1 = new short[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param2.c(4, (byte) 122);
                  var6 = (short)param2.c(16, (byte) 94);
                  if (var5 <= 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param1[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param1[var7] = (short)(param2.c(var5, (byte) 91) + var6);
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (short[]) param1;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (short[]) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("uj.E(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + 16 + ')');
        }
        return stackIn_19_0;
    }

    final void a(byte param0) {
        ((uj) this).field_b = pq.field_k;
        ((uj) this).field_g = 0;
        ((uj) this).field_n = po.field_a;
        ((uj) this).field_d = true;
        ((uj) this).field_q = 0;
        int var2 = 125 % ((-49 - param0) / 41);
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        vi.a((byte) 70, ((uj) this).field_p.field_c - -((uj) this).field_p.field_j, ((uj) this).field_p.field_c, ((uj) this).field_p.field_a, ((uj) this).field_p.field_a + ((uj) this).field_p.field_d);
        var2 = df.a(((uj) this).field_i, (byte) 15, ((uj) this).field_g + -((uj) this).field_c);
        if (param0 == 28) {
          var3 = ((uj) this).field_p.field_a + (-((uj) this).field_g + ((uj) this).field_c + ((uj) this).field_j) + var2 * ((uj) this).field_i;
          L0: while (true) {
            L1: {
              if (((uj) this).field_p.field_d + (10 - -((uj) this).field_p.field_a) <= var3) {
                break L1;
              } else {
                if (((uj) this).field_l.field_i <= var2) {
                  break L1;
                } else {
                  L2: {
                    if (0 > var2) {
                      break L2;
                    } else {
                      L3: {
                        var4 = 3;
                        if (hh.field_b[((uj) this).field_l.field_h] < var2) {
                          if (((uj) this).field_q == var2) {
                            var4 = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var2 != ((uj) this).field_q) {
                            var4 = 2;
                            break L3;
                          } else {
                            var4 = 1;
                            break L3;
                          }
                        }
                      }
                      nn.field_g.b(((uj) this).field_l.field_c[var2].field_o, (((uj) this).field_p.field_c * 2 + ((uj) this).field_p.field_j) / 2, var3, var4, -1);
                      break L2;
                    }
                  }
                  var2++;
                  var3 = var3 + ((uj) this).field_i;
                  continue L0;
                }
              }
            }
            sc.b(-106);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = df.a(((uj) this).field_f, (byte) 15, ((uj) this).field_g + -((uj) this).field_c) + ((uj) this).field_p.field_d / (2 * ((uj) this).field_i);
          if (param0 == -28088) {
            break L0;
          } else {
            ((uj) this).field_r = -121;
            break L0;
          }
        }
        L1: {
          if (param1 == 99) {
            ((uj) this).field_d = true;
            ((uj) this).field_q = ((uj) this).field_q + 1;
            if (((uj) this).field_q > var4) {
              ((uj) this).a(((uj) this).field_i, true);
              break L1;
            } else {
              break L1;
            }
          } else {
            if (param1 == 98) {
              ((uj) this).field_q = ((uj) this).field_q - 1;
              ((uj) this).field_d = true;
              if (((uj) this).field_q <= var4 - 1) {
                ((uj) this).a(-((uj) this).field_i, true);
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((uj) this).field_q < 0) {
            break L2;
          } else {
            if (~((uj) this).field_l.field_i < ~((uj) this).field_q) {
              return false;
            } else {
              break L2;
            }
          }
        }
        ((uj) this).field_q = -1;
        ((uj) this).field_d = false;
        return true;
    }

    final void b(byte param0) {
        ((uj) this).field_d = true;
        ((uj) this).field_q = -1 + ((uj) this).field_l.field_i;
        ((uj) this).field_g = ((uj) this).field_k;
        if (param0 >= -39) {
            ((uj) this).a(47, false);
        }
        ((uj) this).field_n = po.field_a;
        ((uj) this).field_b = pq.field_k;
    }

    final void b(int param0) {
        ((uj) this).field_g = param0;
    }

    final void b(boolean param0) {
        Object stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        Object stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        Object stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        Object stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        Object stackOut_4_0 = null;
        boolean stackOut_4_1 = false;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        L0: {
          if (((uj) this).field_a == ((uj) this).field_m.field_h.field_j) {
            L1: {
              ((uj) this).a(qc.field_o * ((uj) this).field_h, true);
              stackOut_2_0 = this;
              stackOut_2_1 = ((uj) this).field_d;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (qc.field_o != 0) {
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
            L2: {
              L3: {
                ((uj) this).field_d = stackIn_5_1 & stackIn_5_2 != 0;
                if (!((uj) this).field_d) {
                  break L3;
                } else {
                  if (pq.field_k != ((uj) this).field_b) {
                    break L3;
                  } else {
                    if (((uj) this).field_n == po.field_a) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                ((uj) this).field_q = df.a(((uj) this).field_i, (byte) 15, po.field_a - (((uj) this).field_p.field_a - (-((uj) this).field_c + ((uj) this).field_g)));
                if (((uj) this).field_q >= 0) {
                  break L4;
                } else {
                  ((uj) this).field_q = 0;
                  break L4;
                }
              }
              if (((uj) this).field_l.field_i < ((uj) this).field_q) {
                ((uj) this).field_q = ((uj) this).field_l.field_i;
                break L2;
              } else {
                break L2;
              }
            }
            ((uj) this).field_n = po.field_a;
            ((uj) this).field_b = pq.field_k;
            break L0;
          } else {
            ((uj) this).field_q = -1;
            ((uj) this).field_b = -1;
            ((uj) this).field_n = -1;
            ((uj) this).field_d = false;
            break L0;
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            ((uj) this).field_p = null;
            break L5;
          }
        }
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_66_0 = (byte[]) var3;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (0 >= var5) {
                        break L4;
                      } else {
                        if (128 > var5) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var5 < 160) {
                        break L5;
                      } else {
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 != 402) {
                          if (var5 != 8222) {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (var5 != 8224) {
                                if (var5 == 8225) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var5 != 710) {
                                    if (var5 != 8240) {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (var5 != 8249) {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (8216 != var5) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (8220 == var5) {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var5 != 8211) {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (353 != var5) {
                                                                  if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (382 != var5) {
                                                                        if (376 == var5) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  }
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L2;
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L2;
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      break L2;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("uj.G(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + false + ')');
        }
        return stackIn_67_0;
    }

    uj(int param0, int param1, int param2, km param3, q param4, nc param5) {
        ((uj) this).field_q = -1;
        try {
            ((uj) this).field_i = param0 + param1;
            ((uj) this).field_m = param3;
            ((uj) this).field_p = param4;
            ((uj) this).field_a = param2;
            ((uj) this).field_l = param5;
            ((uj) this).field_j = nn.field_g.field_L + (nn.field_g.field_B + -5);
            ((uj) this).field_c = param1;
            ((uj) this).field_f = param0;
            ((uj) this).field_r = ((uj) this).field_c - -(((uj) this).field_l.field_i * ((uj) this).field_i);
            ((uj) this).field_k = -((uj) this).field_p.field_d + ((uj) this).field_r + 5;
            if (0 > ((uj) this).field_k) {
                ((uj) this).field_k = 0;
            }
            ((uj) this).field_h = 3 * ((uj) this).field_f / 2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "uj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
