/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qp {
    int[] field_i;
    kca field_a;
    kca[] field_p;
    int field_l;
    int field_k;
    int[] field_j;
    int[] field_m;
    int[][] field_g;
    private int field_f;
    private int[] field_n;
    int[] field_d;
    byte[][] field_c;
    int[] field_h;
    private int[][] field_o;
    int field_e;
    private byte[] field_b;

    private final void a(byte param0, byte[] param1) {
        RuntimeException var3 = null;
        ds var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11_ref_byte__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int[] stackIn_138_0 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        String stackIn_148_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int[] stackOut_136_0 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        RuntimeException stackOut_147_0 = null;
        StringBuilder stackOut_147_1 = null;
        String stackOut_147_2 = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        String stackOut_145_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_ref = new ds(rob.a(0, param1));
              var4 = var3_ref.e((byte) -87);
              if (var4 < 5) {
                break L1;
              } else {
                if (7 < var4) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((qp) this).field_e = 0;
                      break L2;
                    } else {
                      ((qp) this).field_e = var3_ref.h(106);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var3_ref.e((byte) -117);
                    if (0 == (1 & var5)) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L3;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_18_0 = stackOut_15_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_18_0;
                    if ((var5 & 2) == 0) {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      break L4;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_22_0 = stackOut_19_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_22_0;
                    if (var4 >= 7) {
                      ((qp) this).field_f = var3_ref.n(-24099);
                      break L5;
                    } else {
                      ((qp) this).field_f = var3_ref.e(1869);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    ((qp) this).field_i = new int[((qp) this).field_f];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (~var10 <= ~((qp) this).field_f) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$5 = var8 + var3_ref.e(1869);
                            var8 = dupTemp$5;
                            ((qp) this).field_i[var10] = dupTemp$5;
                            if (((qp) this).field_i[var10] <= var9) {
                              break L8;
                            } else {
                              var9 = ((qp) this).field_i[var10];
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (((qp) this).field_f <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$6 = var8 + var3_ref.n(-24099);
                            var8 = dupTemp$6;
                            ((qp) this).field_i[var10] = dupTemp$6;
                            if (var9 < ((qp) this).field_i[var10]) {
                              var9 = ((qp) this).field_i[var10];
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((qp) this).field_l = 1 + var9;
                    ((qp) this).field_h = new int[((qp) this).field_l];
                    if (var7 != 0) {
                      ((qp) this).field_c = new byte[((qp) this).field_l][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((qp) this).field_m = new int[((qp) this).field_l];
                    ((qp) this).field_j = new int[((qp) this).field_l];
                    ((qp) this).field_d = new int[((qp) this).field_l];
                    ((qp) this).field_g = new int[((qp) this).field_l][];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((qp) this).field_n = new int[((qp) this).field_l];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((qp) this).field_l) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((qp) this).field_f) {
                              ((qp) this).field_a = new kca(((qp) this).field_n);
                              break L12;
                            } else {
                              ((qp) this).field_n[((qp) this).field_i[var10]] = var3_ref.h(25);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((qp) this).field_n[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((qp) this).field_f) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (~((qp) this).field_f >= ~var10) {
                              break L16;
                            } else {
                              var11_ref_byte__ = new byte[64];
                              var3_ref.a(0, var11_ref_byte__, (byte) -59, 64);
                              ((qp) this).field_c[((qp) this).field_i[var10]] = var11_ref_byte__;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (((qp) this).field_f <= var10) {
                          L19: {
                            if (param0 >= 0) {
                              break L19;
                            } else {
                              vu discarded$7 = qp.a(false, 91, -58);
                              break L19;
                            }
                          }
                          L20: {
                            if (var4 < 7) {
                              var10 = 0;
                              L21: while (true) {
                                if (~var10 <= ~((qp) this).field_f) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (~((qp) this).field_f >= ~var10) {
                                      break L20;
                                    } else {
                                      var11 = ((qp) this).field_i[var10];
                                      var8 = 0;
                                      var12 = ((qp) this).field_j[var11];
                                      var13 = -1;
                                      ((qp) this).field_g[var11] = new int[var12];
                                      var14 = 0;
                                      L23: while (true) {
                                        if (~var14 <= ~var12) {
                                          L24: {
                                            ((qp) this).field_m[var11] = 1 + var13;
                                            if (var12 != 1 + var13) {
                                              break L24;
                                            } else {
                                              ((qp) this).field_g[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          L25: {
                                            int dupTemp$8 = var8 + var3_ref.e(1869);
                                            var8 = dupTemp$8;
                                            ((qp) this).field_g[var11][var14] = dupTemp$8;
                                            var15 = dupTemp$8;
                                            if (~var13 > ~var15) {
                                              var13 = var15;
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          var14++;
                                          continue L23;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((qp) this).field_j[((qp) this).field_i[var10]] = var3_ref.e(1869);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L26: while (true) {
                                if (((qp) this).field_f <= var10) {
                                  var10 = 0;
                                  L27: while (true) {
                                    if (var10 >= ((qp) this).field_f) {
                                      break L20;
                                    } else {
                                      var11 = ((qp) this).field_i[var10];
                                      var12 = ((qp) this).field_j[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((qp) this).field_g[var11] = new int[var12];
                                      var14 = 0;
                                      L28: while (true) {
                                        if (var14 >= var12) {
                                          L29: {
                                            ((qp) this).field_m[var11] = var13 - -1;
                                            if (var13 + 1 != var12) {
                                              break L29;
                                            } else {
                                              ((qp) this).field_g[var11] = null;
                                              break L29;
                                            }
                                          }
                                          var10++;
                                          continue L27;
                                        } else {
                                          L30: {
                                            int dupTemp$9 = var8 + var3_ref.n(-24099);
                                            var8 = dupTemp$9;
                                            ((qp) this).field_g[var11][var14] = dupTemp$9;
                                            var15 = dupTemp$9;
                                            if (~var15 >= ~var13) {
                                              break L30;
                                            } else {
                                              var13 = var15;
                                              break L30;
                                            }
                                          }
                                          var14++;
                                          continue L28;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((qp) this).field_j[((qp) this).field_i[var10]] = var3_ref.n(-24099);
                                  var10++;
                                  continue L26;
                                }
                              }
                            }
                          }
                          L31: {
                            if (var6 != 0) {
                              ((qp) this).field_p = new kca[var9 + 1];
                              ((qp) this).field_o = new int[1 + var9][];
                              var10 = 0;
                              L32: while (true) {
                                if (~var10 <= ~((qp) this).field_f) {
                                  break L31;
                                } else {
                                  var11 = ((qp) this).field_i[var10];
                                  var12 = ((qp) this).field_j[var11];
                                  ((qp) this).field_o[var11] = new int[((qp) this).field_m[var11]];
                                  var13 = 0;
                                  L33: while (true) {
                                    if (((qp) this).field_m[var11] <= var13) {
                                      var13 = 0;
                                      L34: while (true) {
                                        if (~var12 >= ~var13) {
                                          ((qp) this).field_p[var11] = new kca(((qp) this).field_o[var11]);
                                          var10++;
                                          continue L32;
                                        } else {
                                          stackOut_136_0 = ((qp) this).field_g[var11];
                                          stackIn_138_0 = stackOut_136_0;
                                          L35: {
                                            if (stackIn_138_0 != null) {
                                              var14 = ((qp) this).field_g[var11][var13];
                                              break L35;
                                            } else {
                                              var14 = var13;
                                              break L35;
                                            }
                                          }
                                          ((qp) this).field_o[var11][var14] = var3_ref.h(38);
                                          var13++;
                                          continue L34;
                                        }
                                      }
                                    } else {
                                      ((qp) this).field_o[var11][var13] = -1;
                                      var13++;
                                      continue L33;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L31;
                            }
                          }
                          break L0;
                        } else {
                          ((qp) this).field_h[((qp) this).field_i[var10]] = var3_ref.h(56);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((qp) this).field_d[((qp) this).field_i[var10]] = var3_ref.h(122);
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var3 = decompiledCaughtException;
            stackOut_144_0 = (RuntimeException) var3;
            stackOut_144_1 = new StringBuilder().append("qp.A(").append(param0).append(44);
            stackIn_147_0 = stackOut_144_0;
            stackIn_147_1 = stackOut_144_1;
            stackIn_145_0 = stackOut_144_0;
            stackIn_145_1 = stackOut_144_1;
            if (param1 == null) {
              stackOut_147_0 = (RuntimeException) (Object) stackIn_147_0;
              stackOut_147_1 = (StringBuilder) (Object) stackIn_147_1;
              stackOut_147_2 = "null";
              stackIn_148_0 = stackOut_147_0;
              stackIn_148_1 = stackOut_147_1;
              stackIn_148_2 = stackOut_147_2;
              break L36;
            } else {
              stackOut_145_0 = (RuntimeException) (Object) stackIn_145_0;
              stackOut_145_1 = (StringBuilder) (Object) stackIn_145_1;
              stackOut_145_2 = "{...}";
              stackIn_148_0 = stackOut_145_0;
              stackIn_148_1 = stackOut_145_1;
              stackIn_148_2 = stackOut_145_2;
              break L36;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_148_0, stackIn_148_2 + 41);
        }
    }

    final static vu a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ij var4 = null;
        Object var5 = null;
        Object var6 = null;
        vu var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        hqb var17 = null;
        String var18 = null;
        int var19 = 0;
        soa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        soa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        soa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        llb stackIn_31_0 = null;
        llb stackIn_33_0 = null;
        llb stackIn_34_0 = null;
        String stackIn_34_1 = null;
        llb stackIn_35_0 = null;
        llb stackIn_37_0 = null;
        llb stackIn_38_0 = null;
        String stackIn_38_1 = null;
        int stackIn_42_0 = 0;
        Object stackIn_99_0 = null;
        RuntimeException decompiledCaughtException = null;
        soa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        soa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        soa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        llb stackOut_30_0 = null;
        llb stackOut_33_0 = null;
        String stackOut_33_1 = null;
        llb stackOut_31_0 = null;
        String stackOut_31_1 = null;
        llb stackOut_34_0 = null;
        llb stackOut_37_0 = null;
        String stackOut_37_1 = null;
        llb stackOut_35_0 = null;
        String stackOut_35_1 = null;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        Object stackOut_98_0 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = re.field_n.field_xb;
              stackOut_1_1 = 38;
              stackOut_1_2 = param1;
              stackOut_1_3 = param2 * (3 * (nna.field_w + 2));
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (qg.field_a != re.field_n.field_xb) {
                stackOut_4_0 = (soa) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                break L1;
              } else {
                stackOut_2_0 = (soa) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_5_4 = stackOut_2_4;
                break L1;
              }
            }
            L2: {
              var3_int = ((soa) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, param0, nna.field_w + 2) ? 1 : 0;
              var4 = re.field_n.field_yb.field_lb;
              var5 = null;
              if (iwa.field_b != 2) {
                L3: {
                  rtb.field_h.field_R = neb.field_p;
                  ci.field_c.field_y = false;
                  if (iwa.field_b != 1) {
                    re.field_n.field_xb.field_xb.field_R = dsa.field_o;
                    break L3;
                  } else {
                    re.field_n.field_xb.field_xb.field_R = iha.field_o;
                    break L3;
                  }
                }
                igb.a(re.field_n.field_yb, (byte) -100);
                break L2;
              } else {
                ci.field_c.field_y = true;
                rtb.field_h.field_R = isa.a(qna.field_o, new String[1], param1 + 89);
                re.field_n.field_xb.field_xb.field_R = null;
                var6 = null;
                var7 = (vu) (Object) var4.d(0);
                L4: while (true) {
                  if (null == var7) {
                    L5: {
                      if (re.field_n.field_wb.field_o != 0) {
                        ola.field_p = new qka(re.field_n.field_wb.field_M, re.field_n.field_wb.field_u, re.field_n.field_wb.field_hb, re.field_n.field_wb.field_G, hk.field_i, msa.field_o, qc.field_q, qc.field_q);
                        rc.field_b = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (re.field_n.field_zb.field_o == 0) {
                        break L6;
                      } else {
                        ola.field_p = new qka(re.field_n.field_zb.field_M, re.field_n.field_zb.field_u, re.field_n.field_zb.field_hb, re.field_n.field_zb.field_G, bba.field_e, msa.field_o, qc.field_q, qc.field_q);
                        rc.field_b = 1;
                        break L6;
                      }
                    }
                    break L2;
                  } else {
                    L7: {
                      var8 = 0;
                      if (var7.field_lb == null) {
                        var7.field_wb = new llb(0L, bsa.field_q);
                        var7.b(param1 + -563, var7.field_wb);
                        var7.field_Eb = new llb(0L, geb.field_o);
                        var7.b(-561, var7.field_Eb);
                        var7.field_Bb = new llb(0L, bsa.field_q);
                        var7.b(-561, var7.field_Bb);
                        var7.field_Eb.field_F = 2;
                        var8 = 1;
                        var7.g(113);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var7.field_hb = re.field_n.field_yb.field_hb;
                      var9 = 0;
                      if (null == var7.field_Ab) {
                        var10 = 13369344;
                        var11 = 16737894;
                        break L8;
                      } else {
                        if (kbb.field_q == var7.field_Ab) {
                          var10 = 52224;
                          var11 = 6750054;
                          break L8;
                        } else {
                          var10 = 13421568;
                          var11 = 16777062;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var12 = 0;
                      if (var7.field_vb == null) {
                        break L9;
                      } else {
                        if (var7.field_vb.equals((Object) (Object) "")) {
                          break L9;
                        } else {
                          var7.field_Bb.field_tb = iqb.field_o;
                          var7.field_Bb.field_qb = var11;
                          var12 = 1;
                          var7.field_Bb.a(0, 127, iqb.field_o.field_m - -3, var9, nna.field_w);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var7.field_Eb.field_Y = var10;
                      var7.field_wb.field_Y = var10;
                      var7.field_Eb.field_U = var11;
                      var7.field_wb.field_U = var11;
                      var7.field_Eb.field_qb = var11;
                      var7.field_wb.field_qb = var11;
                      var7.field_Eb.field_ib = var11;
                      var7.field_wb.field_ib = var11;
                      var13 = 0;
                      var14 = -80 + (var7.field_hb + -2);
                      if (var12 != 0) {
                        var13 = 3 + iqb.field_o.field_m;
                        var14 = var14 - var13;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      stackOut_30_0 = var7.field_wb;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (var14 > 0) {
                        stackOut_33_0 = (llb) (Object) stackIn_33_0;
                        stackOut_33_1 = no.a(var7.field_wb.field_eb, var7.field_Fb, var14);
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        break L11;
                      } else {
                        stackOut_31_0 = (llb) (Object) stackIn_31_0;
                        stackOut_31_1 = var7.field_Fb;
                        stackIn_34_0 = stackOut_31_0;
                        stackIn_34_1 = stackOut_31_1;
                        break L11;
                      }
                    }
                    L12: {
                      stackIn_34_0.field_R = stackIn_34_1;
                      var7.field_wb.a(var13, param1 + 121, var14, var9, nna.field_w);
                      stackOut_34_0 = var7.field_Eb;
                      stackIn_37_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (null != var7.field_Ab) {
                        stackOut_37_0 = (llb) (Object) stackIn_37_0;
                        stackOut_37_1 = var7.field_Ab;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L12;
                      } else {
                        stackOut_35_0 = (llb) (Object) stackIn_35_0;
                        stackOut_35_1 = wl.field_o;
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        break L12;
                      }
                    }
                    L13: {
                      stackIn_38_0.field_R = stackIn_38_1;
                      var7.field_Eb.a(var7.field_hb - 80, -79, 80, var9, nna.field_w);
                      if (var7.field_wb.field_R.equals((Object) (Object) var7.field_Fb)) {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        break L13;
                      } else {
                        stackOut_39_0 = 1;
                        stackIn_42_0 = stackOut_39_0;
                        break L13;
                      }
                    }
                    L14: {
                      var15 = stackIn_42_0;
                      var9 = var9 + nna.field_w;
                      if (var3_int == 0) {
                        var7.field_E = -var7.field_G + var9;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (var8 == 0) {
                        break L15;
                      } else {
                        re.field_n.field_yb.a((llb) var6, 2, (llb) (Object) var7, 40);
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        var6 = (Object) (Object) var7;
                        if (null == var7.field_Bb) {
                          break L17;
                        } else {
                          if (var7.field_Bb.field_O) {
                            lob.field_a = var7.field_vb;
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (var7.field_o == 0) {
                        if (!var7.field_wb.field_O) {
                          break L16;
                        } else {
                          if (var15 == 0) {
                            break L16;
                          } else {
                            lob.field_a = var7.field_Fb;
                            break L16;
                          }
                        }
                      } else {
                        L18: {
                          var16 = var7.field_Fb;
                          pea.a(0L, (llb) (Object) var7, -1, (int[]) null, var16, re.field_n.field_xb, (String) null, (byte) 87, -1);
                          if (null == var7.field_Ab) {
                            break L18;
                          } else {
                            if (qs.a(0, cka.field_o.field_a)) {
                              break L18;
                            } else {
                              if (erb.field_p) {
                                break L18;
                              } else {
                                L19: {
                                  if (!hb.field_c) {
                                    var17 = cka.field_o;
                                    var18 = isa.a(qia.field_o, new String[1], param1 + 122);
                                    var17.field_i.a(var18, (byte) -53, 8);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                var17 = cka.field_o;
                                var18 = isa.a(eha.field_p, new String[1], 115);
                                var17.field_i.a(var18, (byte) -53, 18);
                                break L18;
                              }
                            }
                          }
                        }
                        var5 = (Object) (Object) var7;
                        break L16;
                      }
                    }
                    var7 = (vu) (Object) var4.a((byte) 99);
                    continue L4;
                  }
                }
              }
            }
            stackOut_98_0 = var5;
            stackIn_99_0 = stackOut_98_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "qp.C(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return (vu) (Object) stackIn_99_0;
    }

    final static void a(boolean param0, int param1, java.applet.Applet param2, String param3) {
        try {
            RuntimeException runtimeException = null;
            java.net.MalformedURLException var4 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  if (!eab.field_s.startsWith("win")) {
                    break L1;
                  } else {
                    if (rd.a(param3, 69)) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                if (param1 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                gna.a((Throwable) null, "MGR1: " + param3, 0);
                break L2;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) runtimeException;
                stackOut_12_1 = new StringBuilder().append("qp.B(").append(param0).append(44).append(param1).append(44);
                stackIn_15_0 = stackOut_12_0;
                stackIn_15_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L3;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  break L3;
                }
              }
              L4: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param3 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L4;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_20_2 = stackOut_17_2;
                  break L4;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qp(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            ((qp) this).field_k = psb.a(param0, param0.length, 0);
            if (param1 != ((qp) this).field_k) {
              throw new RuntimeException();
            } else {
              L1: {
                if (null != param2) {
                  if (param2.length != 64) {
                    throw new RuntimeException();
                  } else {
                    ((qp) this).field_b = fqb.a((byte) 25, param0.length, param0, 0);
                    var4_int = 0;
                    L2: while (true) {
                      if (var4_int >= 64) {
                        break L1;
                      } else {
                        if (~param2[var4_int] == ~((qp) this).field_b[var4_int]) {
                          var4_int++;
                          continue L2;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              this.a((byte) 27, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) runtimeException;
            stackOut_21_1 = new StringBuilder().append("qp.<init>(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L3;
            }
          }
          L4: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    static {
    }
}
