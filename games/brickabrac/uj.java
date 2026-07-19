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
        byte[] discarded$0 = null;
        field_o = null;
        field_e = null;
        if (!param0) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = uj.a((CharSequence) null, false);
        }
    }

    final void a(int param0, boolean param1) {
        this.field_g = this.field_g + param0;
        if (!param1) {
            return;
        }
        if ((this.field_g ^ -1) > -1) {
            this.field_g = 0;
        }
        if (this.field_g > this.field_k) {
            this.field_g = this.field_k;
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
          if (param0 == -1) {
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
        short[] stackIn_3_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_18_0 = null;
        Object stackOut_5_0 = null;
        short[] stackOut_2_0 = null;
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
              var4_int = param2.c(param3, (byte) 61);
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
                  if ((var5 ^ -1) >= -1) {
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
                stackOut_18_0 = (short[]) (param1);
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (short[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("uj.E(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (short[]) ((Object) stackIn_6_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    final void a(byte param0) {
        this.field_b = pq.field_k;
        this.field_g = 0;
        this.field_n = po.field_a;
        this.field_d = true;
        this.field_q = 0;
        int var2 = 125 % ((-49 - param0) / 41);
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        vi.a((byte) 70, this.field_p.field_c - -this.field_p.field_j, this.field_p.field_c, this.field_p.field_a, this.field_p.field_a + this.field_p.field_d);
        var2 = df.a(this.field_i, (byte) 15, this.field_g + -this.field_c);
        if (param0 == 28) {
          var3 = this.field_p.field_a + (-this.field_g + this.field_c + this.field_j) + var2 * this.field_i;
          L0: while (true) {
            L1: {
              if (this.field_p.field_d + (10 - -this.field_p.field_a) <= var3) {
                break L1;
              } else {
                if (this.field_l.field_i <= var2) {
                  break L1;
                } else {
                  L2: {
                    if (0 > var2) {
                      break L2;
                    } else {
                      L3: {
                        var4 = 3;
                        if (hh.field_b[this.field_l.field_h] < var2) {
                          if (this.field_q == var2) {
                            var4 = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var2 != this.field_q) {
                            var4 = 2;
                            break L3;
                          } else {
                            var4 = 1;
                            break L3;
                          }
                        }
                      }
                      nn.field_g.b(this.field_l.field_c[var2].field_o, (this.field_p.field_c * 2 + this.field_p.field_j) / 2, var3, var4, -1);
                      break L2;
                    }
                  }
                  var2++;
                  var3 = var3 + this.field_i;
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
          var4 = df.a(this.field_f, (byte) 15, this.field_g + -this.field_c) + this.field_p.field_d / (2 * this.field_i);
          if (param0 == -28088) {
            break L0;
          } else {
            this.field_r = -121;
            break L0;
          }
        }
        L1: {
          if (-100 == (param1 ^ -1)) {
            this.field_d = true;
            this.field_q = this.field_q + 1;
            if (this.field_q > var4) {
              this.a(this.field_i, true);
              break L1;
            } else {
              break L1;
            }
          } else {
            if (-99 == (param1 ^ -1)) {
              this.field_q = this.field_q - 1;
              this.field_d = true;
              if (this.field_q <= var4 - 1) {
                this.a(-this.field_i, true);
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
          if (-1 < (this.field_q ^ -1)) {
            break L2;
          } else {
            if (this.field_l.field_i > this.field_q) {
              return false;
            } else {
              break L2;
            }
          }
        }
        this.field_q = -1;
        this.field_d = false;
        return true;
    }

    final void b(byte param0) {
        this.field_d = true;
        this.field_q = -1 + this.field_l.field_i;
        this.field_g = this.field_k;
        if (param0 >= -39) {
            this.a(47, false);
        }
        this.field_n = po.field_a;
        this.field_b = pq.field_k;
    }

    final void b(int param0) {
        this.field_g = param0;
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
          if (this.field_a == this.field_m.field_h.field_j) {
            L1: {
              this.a(qc.field_o * this.field_h, true);
              stackOut_2_0 = this;
              stackOut_2_1 = this.field_d;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (-1 != (qc.field_o ^ -1)) {
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
                ((uj) (this)).field_d = stackIn_5_1 & stackIn_5_2 != 0;
                if (!this.field_d) {
                  break L3;
                } else {
                  if (pq.field_k != this.field_b) {
                    break L3;
                  } else {
                    if (this.field_n == po.field_a) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                this.field_q = df.a(this.field_i, (byte) 15, po.field_a - (this.field_p.field_a - (-this.field_c + this.field_g)));
                if (-1 >= (this.field_q ^ -1)) {
                  break L4;
                } else {
                  this.field_q = 0;
                  break L4;
                }
              }
              if (this.field_l.field_i < this.field_q) {
                this.field_q = this.field_l.field_i;
                break L2;
              } else {
                break L2;
              }
            }
            this.field_n = po.field_a;
            this.field_b = pq.field_k;
            break L0;
          } else {
            this.field_q = -1;
            this.field_b = -1;
            this.field_n = -1;
            this.field_d = false;
            break L0;
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            this.field_p = (q) null;
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
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_o = (mf) null;
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_68_0 = (byte[]) (var3);
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (0 >= var5) {
                        break L5;
                      } else {
                        if (128 > var5) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 != 402) {
                          if (var5 != 8222) {
                            if (var5 == 8230) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (var5 != 8224) {
                                if (var5 == 8225) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var5 != 710) {
                                    if (var5 != 8240) {
                                      if (var5 == 352) {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      } else {
                                        if (var5 != 8249) {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (8216 != var5) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (8220 == var5) {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (var5 != 8211) {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (353 != var5) {
                                                                  if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 != var5) {
                                                                        if (376 == var5) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            }
                                          } else {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          }
                                        } else {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    }
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                }
                              } else {
                                var3[var4] = (byte)-122;
                                break L3;
                              }
                            }
                          } else {
                            var3[var4] = (byte)-124;
                            break L3;
                          }
                        } else {
                          var3[var4] = (byte)-125;
                          break L3;
                        }
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
                      }
                    } else {
                      var3[var4] = (byte)-128;
                      break L3;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) (var2);
            stackOut_70_1 = new StringBuilder().append("uj.G(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ')');
        }
        return stackIn_69_0;
    }

    uj(int param0, int param1, int param2, km param3, q param4, nc param5) {
        this.field_q = -1;
        try {
            this.field_i = param0 + param1;
            this.field_m = param3;
            this.field_p = param4;
            this.field_a = param2;
            this.field_l = param5;
            this.field_j = nn.field_g.field_L + (nn.field_g.field_B + -5);
            this.field_c = param1;
            this.field_f = param0;
            this.field_r = this.field_c - -(this.field_l.field_i * this.field_i);
            this.field_k = -this.field_p.field_d + this.field_r + 5;
            if (0 > this.field_k) {
                this.field_k = 0;
            }
            this.field_h = 3 * this.field_f / 2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "uj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
