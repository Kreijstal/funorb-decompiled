/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class cn implements qk, eg {
    int field_a;
    static boolean field_l;
    int field_h;
    int field_d;
    mi field_f;
    int field_m;
    private int field_g;
    private boolean field_i;
    int field_b;
    int field_k;
    int field_n;
    int field_j;
    int field_e;
    int field_c;

    public void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        if (param2 != -30) {
            return;
        }
        if (((cn) this).field_f == null) {
            return;
        }
        try {
            this.a(param4, param0, param1, 118);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "cn.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final int d(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                ((cn) this).field_f = null;
                break L1;
              }
            }
            stackOut_2_0 = -((cn) this).field_h + param1.field_E + -((cn) this).field_d;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cn.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        gh var6 = null;
        gh var7 = null;
        gh var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        ul var17 = null;
        int var17_int = 0;
        Object var18 = null;
        cc var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        gh var21 = null;
        int[] var22 = null;
        int[] var24 = null;
        gh var25 = null;
        int[] var26 = null;
        String var27 = null;
        String var28 = null;
        int[] var29 = null;
        gh stackIn_16_0 = null;
        gh stackIn_17_0 = null;
        gh stackIn_18_0 = null;
        gh stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_35_0 = 0;
        gh stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        gh stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        gh stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        gh stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        gh stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_154_2 = 0;
        gh stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        gh stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        gh stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        gh stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        gh stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        gh stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        gh stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        gh stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        gh stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        gh stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        int stackIn_166_2 = 0;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_15_0 = null;
        gh stackOut_16_0 = null;
        gh stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        gh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        gh stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        gh stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        gh stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        gh stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        int stackOut_152_2 = 0;
        gh stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        gh stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        gh stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        gh stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        gh stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        gh stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        gh stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        gh stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        gh stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        gh stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_164_2 = 0;
        gh stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        int stackOut_165_2 = 0;
        var18 = null;
        var19 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              vb.a((byte) 48, fj.field_f);
              if (null != nf.field_b) {
                L2: {
                  mn.field_E.field_T = true;
                  var21 = rn.field_C;
                  var25 = var21;
                  rn.field_C.field_Lb = 0;
                  var25.field_zb = 0;
                  fk.field_q.field_Lb = 0;
                  var6 = fk.field_q;
                  var6.field_zb = 0;
                  var7 = rh.field_w;
                  rh.field_w.field_Lb = 0;
                  var7.field_zb = 0;
                  if (kk.a(-28548)) {
                    L3: {
                      nm.field_q.field_S = a.field_f.toUpperCase();
                      var9 = (2 + gl.field_y.field_zb) / 2;
                      rn.field_C.a(0, gl.field_y.field_Lb + -40, 40, 0, -2 + var9);
                      if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                        rn.field_C.field_S = pe.field_U.toUpperCase();
                        rn.field_C.field_T = false;
                        break L3;
                      } else {
                        rn.field_C.field_S = he.field_j.toUpperCase();
                        rn.field_C.field_T = true;
                        break L3;
                      }
                    }
                    L4: {
                      rn.field_C.field_I = rm.field_j.field_I;
                      if (ja.field_a <= 0) {
                        break L4;
                      } else {
                        L5: {
                          if (1 == ja.field_a) {
                            var10_ref_String = ih.field_o;
                            break L5;
                          } else {
                            var10_ref_String = db.a(sj.field_B, param0 + -83, new String[1]);
                            break L5;
                          }
                        }
                        rn.field_C.field_S = rn.field_C.field_S + "<br>" + var10_ref_String;
                        if ((16 & qa.field_H) != 0) {
                          break L4;
                        } else {
                          if (vb.field_c) {
                            break L4;
                          } else {
                            rn.field_C.field_I = rm.field_j.field_Ab;
                            break L4;
                          }
                        }
                      }
                    }
                    L6: {
                      L7: {
                        fk.field_q.a(0, -40 + gl.field_y.field_Lb, 40, var9, -var9 + gl.field_y.field_zb);
                        fk.field_q.field_S = jk.field_b.toUpperCase();
                        stackOut_15_0 = fk.field_q;
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (!param3) {
                          break L7;
                        } else {
                          stackOut_16_0 = (gh) (Object) stackIn_16_0;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (ka.field_R != 0L) {
                            break L7;
                          } else {
                            stackOut_17_0 = (gh) (Object) stackIn_17_0;
                            stackOut_17_1 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            break L6;
                          }
                        }
                      }
                      stackOut_18_0 = (gh) (Object) stackIn_18_0;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L6;
                    }
                    L8: {
                      L9: {
                        L10: {
                          stackIn_19_0.field_T = stackIn_19_1 != 0;
                          var8 = fk.field_q;
                          var10 = 2;
                          if (null == m.field_b) {
                            break L10;
                          } else {
                            L11: {
                              if (null != dl.field_O) {
                                break L11;
                              } else {
                                dl.field_O = new byte[be.field_a];
                                m.field_h = new boolean[be.field_a];
                                break L11;
                              }
                            }
                            var11 = 0;
                            L12: while (true) {
                              if (be.field_a <= var11) {
                                var10 = 0;
                                L13: while (true) {
                                  if (var10 >= 2) {
                                    if (ul.field_d < 2) {
                                      break L10;
                                    } else {
                                      if (fc.field_e[12]) {
                                        var10 = 2;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  } else {
                                    var11 = 0;
                                    var12 = 0;
                                    L14: while (true) {
                                      if (var12 >= m.field_b.length) {
                                        if (var11 == 0) {
                                          var10++;
                                          continue L13;
                                        } else {
                                          L15: {
                                            if (ul.field_d < 2) {
                                              break L15;
                                            } else {
                                              if (fc.field_e[12]) {
                                                var10 = 2;
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          if (var10 >= 2) {
                                            break L8;
                                          } else {
                                            fk.field_q.field_T = false;
                                            if (!fk.field_q.field_K) {
                                              break L2;
                                            } else {
                                              var11_ref = null;
                                              var12 = 0;
                                              var13 = 0;
                                              L16: while (true) {
                                                if (var13 >= be.field_a) {
                                                  break L9;
                                                } else {
                                                  L17: {
                                                    if (m.field_h[var13]) {
                                                      var27 = "<col=A00000>" + al.field_a[var13] + "</col>";
                                                      if (var11_ref == null) {
                                                        var11_ref = (Object) (Object) var27;
                                                        break L17;
                                                      } else {
                                                        var11_ref = (Object) (Object) (var11_ref + ", " + var27);
                                                        var12 = 1;
                                                        break L17;
                                                      }
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                  var13++;
                                                  continue L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var29 = m.field_b[var12];
                                        var26 = var29;
                                        var24 = var26;
                                        var22 = var24;
                                        var13_ref_int__ = var22;
                                        var14 = 0;
                                        L18: while (true) {
                                          L19: {
                                            if (var14 >= var29.length) {
                                              var11 = 1;
                                              var14 = -1;
                                              var15 = 0;
                                              L20: while (true) {
                                                if (var15 >= var29.length) {
                                                  m.field_h[var14] = true;
                                                  break L19;
                                                } else {
                                                  L21: {
                                                    var16 = var29[var15];
                                                    if (var16 <= var14) {
                                                      break L21;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                  var15 += 2;
                                                  continue L20;
                                                }
                                              }
                                            } else {
                                              var15 = var29[var14];
                                              var16 = var13_ref_int__[var14 + 1];
                                              if (var15 != -1) {
                                                if (var16 == (255 & nf.field_b.field_Sb[var15])) {
                                                  var14 += 2;
                                                  continue L18;
                                                } else {
                                                  break L19;
                                                }
                                              } else {
                                                L22: {
                                                  if (0 != var10) {
                                                    stackOut_34_0 = nf.field_b.field_wc;
                                                    stackIn_35_0 = stackOut_34_0;
                                                    break L22;
                                                  } else {
                                                    stackOut_33_0 = nf.field_b.field_Ub;
                                                    stackIn_35_0 = stackOut_33_0;
                                                    break L22;
                                                  }
                                                }
                                                L23: {
                                                  var17_int = stackIn_35_0;
                                                  if (var16 != var17_int) {
                                                    break L23;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                                var12++;
                                                continue L14;
                                              }
                                            }
                                          }
                                          var12++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                m.field_h[var11] = false;
                                var11++;
                                continue L12;
                              }
                            }
                          }
                        }
                        if (var10 >= 2) {
                          break L8;
                        } else {
                          fk.field_q.field_T = false;
                          if (!fk.field_q.field_K) {
                            break L2;
                          } else {
                            var11_ref = null;
                            var12 = 0;
                            var13 = 0;
                            L24: while (true) {
                              if (var13 >= be.field_a) {
                                break L9;
                              } else {
                                L25: {
                                  if (m.field_h[var13]) {
                                    var28 = "<col=A00000>" + al.field_a[var13] + "</col>";
                                    if (var11_ref == null) {
                                      var11_ref = (Object) (Object) var28;
                                      break L25;
                                    } else {
                                      var11_ref = (Object) (Object) (var11_ref + ", " + var28);
                                      var12 = 1;
                                      break L25;
                                    }
                                  } else {
                                    break L25;
                                  }
                                }
                                var13++;
                                continue L24;
                              }
                            }
                          }
                        }
                      }
                      L26: {
                        if (var10 == 0) {
                          var13_ref_String = jf.field_gb;
                          if (var12 == 0) {
                            var14_ref_String = db.a(il.field_b, -61, new String[1]);
                            break L26;
                          } else {
                            var14_ref_String = ei.field_v + var11_ref;
                            break L26;
                          }
                        } else {
                          var13_ref_String = ib.field_a;
                          if (var12 == 0) {
                            var14_ref_String = db.a(hf.field_f, -113, new String[1]);
                            break L26;
                          } else {
                            var14_ref_String = pc.field_r + var11_ref;
                            break L26;
                          }
                        }
                      }
                      ll.field_i = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                      break L2;
                    }
                    L27: {
                      if (null != ad.field_d) {
                        break L27;
                      } else {
                        if (ja.field_b != null) {
                          break L27;
                        } else {
                          if (null != ol.field_cc) {
                            break L27;
                          } else {
                            if (null == fc.field_b) {
                              break L2;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L28: while (true) {
                      if (be.field_a <= var16) {
                        var16 = 0;
                        var17 = gl.field_t.field_Ub.field_M;
                        var18_ref = (cc) (Object) var17.e(13058);
                        L29: while (true) {
                          L30: {
                            if (var18_ref == null) {
                              break L30;
                            } else {
                              L31: {
                                if (var18_ref.d((byte) -36)) {
                                  break L31;
                                } else {
                                  L32: {
                                    if (var11 == 0) {
                                      break L32;
                                    } else {
                                      if (!var18_ref.field_nc) {
                                        var16 = 1;
                                        break L30;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  if (var13 <= var18_ref.field_ac) {
                                    if (var18_ref.field_dc >= var14) {
                                      if ((var15 & ~var18_ref.field_qc) <= 0) {
                                        if (var12 != 0) {
                                          var16 = 1;
                                          break L30;
                                        } else {
                                          break L31;
                                        }
                                      } else {
                                        var16 = 1;
                                        break L30;
                                      }
                                    } else {
                                      var16 = 1;
                                      break L30;
                                    }
                                  } else {
                                    var16 = 1;
                                    break L30;
                                  }
                                }
                              }
                              var18_ref = (cc) (Object) var17.a((byte) -12);
                              continue L29;
                            }
                          }
                          L33: {
                            if (2 > ul.field_d) {
                              break L33;
                            } else {
                              if (fc.field_e[12]) {
                                var16 = 0;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          if (var16 != 0) {
                            fk.field_q.field_T = false;
                            if (fk.field_q.field_K) {
                              if (fg.field_Tb.field_d.field_bc != 0) {
                                ll.field_i = db.a(kf.field_r, -74, new String[1]);
                                break L2;
                              } else {
                                ll.field_i = sf.field_f;
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        L34: {
                          var17_int = 255 & nf.field_b.field_Sb[var16];
                          if (null == ad.field_d) {
                            break L34;
                          } else {
                            if (null == ad.field_d[var16]) {
                              break L34;
                            } else {
                              if (!ad.field_d[var16][var17_int]) {
                                break L34;
                              } else {
                                var11 = 1;
                                break L34;
                              }
                            }
                          }
                        }
                        L35: {
                          if (ja.field_b == null) {
                            break L35;
                          } else {
                            if (null == ja.field_b[var16]) {
                              break L35;
                            } else {
                              L36: {
                                var18_int = ja.field_b[var16][var17_int];
                                if (var18_int == 0) {
                                  break L36;
                                } else {
                                  if (vg.field_a) {
                                    break L36;
                                  } else {
                                    var11 = 1;
                                    break L36;
                                  }
                                }
                              }
                              if (var13 >= var18_int) {
                                break L35;
                              } else {
                                var13 = var18_int;
                                break L35;
                              }
                            }
                          }
                        }
                        L37: {
                          if (null == ol.field_cc) {
                            break L37;
                          } else {
                            if (null == ol.field_cc[var16]) {
                              break L37;
                            } else {
                              L38: {
                                var18_int = ol.field_cc[var16][var17_int];
                                if (0 == var18_int) {
                                  break L38;
                                } else {
                                  if (vg.field_a) {
                                    break L38;
                                  } else {
                                    var11 = 1;
                                    break L38;
                                  }
                                }
                              }
                              if (var14 >= var18_int) {
                                break L37;
                              } else {
                                var14 = var18_int;
                                break L37;
                              }
                            }
                          }
                        }
                        L39: {
                          if (fc.field_b == null) {
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        var16++;
                        continue L28;
                      }
                    }
                  } else {
                    var9_ref_String = nf.field_b.field_Xb;
                    nm.field_q.field_S = db.a(pd.field_ab, -40, new String[1]).toUpperCase();
                    rh.field_w.a(0, gl.field_y.field_Lb + -40, 40, 0, gl.field_y.field_zb);
                    rh.field_w.field_S = db.a(jj.field_f, -108, new String[1]);
                    var8 = rh.field_w;
                    break L2;
                  }
                }
                L40: {
                  if (ka.field_R != 0L) {
                    L41: {
                      var9 = (int)(-mm.a(param0 + -86) + ka.field_R);
                      var9 = (var9 - -999) / 1000;
                      if (var9 < 1) {
                        var9 = 1;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    var8.field_S = db.a(ch.field_P, -68, new String[1]);
                    break L40;
                  } else {
                    break L40;
                  }
                }
                uj.field_e.field_S = db.a(ci.field_h, -32, new String[2]);
                break L1;
              } else {
                break L1;
              }
            }
            L42: {
              L43: {
                stackOut_149_0 = ql.field_ec;
                stackOut_149_1 = -99;
                stackIn_153_0 = stackOut_149_0;
                stackIn_153_1 = stackOut_149_1;
                stackIn_150_0 = stackOut_149_0;
                stackIn_150_1 = stackOut_149_1;
                if (!param1) {
                  break L43;
                } else {
                  stackOut_150_0 = (gh) (Object) stackIn_150_0;
                  stackOut_150_1 = stackIn_150_1;
                  stackIn_153_0 = stackOut_150_0;
                  stackIn_153_1 = stackOut_150_1;
                  stackIn_151_0 = stackOut_150_0;
                  stackIn_151_1 = stackOut_150_1;
                  if (param2) {
                    break L43;
                  } else {
                    stackOut_151_0 = (gh) (Object) stackIn_151_0;
                    stackOut_151_1 = stackIn_151_1;
                    stackIn_153_0 = stackOut_151_0;
                    stackIn_153_1 = stackOut_151_1;
                    stackIn_152_0 = stackOut_151_0;
                    stackIn_152_1 = stackOut_151_1;
                    if (vb.field_c) {
                      break L43;
                    } else {
                      stackOut_152_0 = (gh) (Object) stackIn_152_0;
                      stackOut_152_1 = stackIn_152_1;
                      stackOut_152_2 = 1;
                      stackIn_154_0 = stackOut_152_0;
                      stackIn_154_1 = stackOut_152_1;
                      stackIn_154_2 = stackOut_152_2;
                      break L42;
                    }
                  }
                }
              }
              stackOut_153_0 = (gh) (Object) stackIn_153_0;
              stackOut_153_1 = stackIn_153_1;
              stackOut_153_2 = 0;
              stackIn_154_0 = stackOut_153_0;
              stackIn_154_1 = stackOut_153_1;
              stackIn_154_2 = stackOut_153_2;
              break L42;
            }
            L44: {
              L45: {
                ((gh) (Object) stackIn_154_0).a((byte) stackIn_154_1, stackIn_154_2 != 0);
                stackOut_154_0 = gl.field_y;
                stackOut_154_1 = -88;
                stackIn_158_0 = stackOut_154_0;
                stackIn_158_1 = stackOut_154_1;
                stackIn_155_0 = stackOut_154_0;
                stackIn_155_1 = stackOut_154_1;
                if (!param1) {
                  break L45;
                } else {
                  stackOut_155_0 = (gh) (Object) stackIn_155_0;
                  stackOut_155_1 = stackIn_155_1;
                  stackIn_158_0 = stackOut_155_0;
                  stackIn_158_1 = stackOut_155_1;
                  stackIn_156_0 = stackOut_155_0;
                  stackIn_156_1 = stackOut_155_1;
                  if (param2) {
                    break L45;
                  } else {
                    stackOut_156_0 = (gh) (Object) stackIn_156_0;
                    stackOut_156_1 = stackIn_156_1;
                    stackIn_158_0 = stackOut_156_0;
                    stackIn_158_1 = stackOut_156_1;
                    stackIn_157_0 = stackOut_156_0;
                    stackIn_157_1 = stackOut_156_1;
                    if (vb.field_c) {
                      break L45;
                    } else {
                      stackOut_157_0 = (gh) (Object) stackIn_157_0;
                      stackOut_157_1 = stackIn_157_1;
                      stackOut_157_2 = 1;
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_159_1 = stackOut_157_1;
                      stackIn_159_2 = stackOut_157_2;
                      break L44;
                    }
                  }
                }
              }
              stackOut_158_0 = (gh) (Object) stackIn_158_0;
              stackOut_158_1 = stackIn_158_1;
              stackOut_158_2 = 0;
              stackIn_159_0 = stackOut_158_0;
              stackIn_159_1 = stackOut_158_1;
              stackIn_159_2 = stackOut_158_2;
              break L44;
            }
            L46: {
              ((gh) (Object) stackIn_159_0).a((byte) stackIn_159_1, stackIn_159_2 != 0);
              if (param0 == 0) {
                break L46;
              } else {
                cn.a(126, false, true, true, 60);
                break L46;
              }
            }
            L47: {
              L48: {
                stackOut_161_0 = fb.field_r;
                stackOut_161_1 = -5;
                stackIn_165_0 = stackOut_161_0;
                stackIn_165_1 = stackOut_161_1;
                stackIn_162_0 = stackOut_161_0;
                stackIn_162_1 = stackOut_161_1;
                if (!param1) {
                  break L48;
                } else {
                  stackOut_162_0 = (gh) (Object) stackIn_162_0;
                  stackOut_162_1 = stackIn_162_1;
                  stackIn_165_0 = stackOut_162_0;
                  stackIn_165_1 = stackOut_162_1;
                  stackIn_163_0 = stackOut_162_0;
                  stackIn_163_1 = stackOut_162_1;
                  if (param2) {
                    break L48;
                  } else {
                    stackOut_163_0 = (gh) (Object) stackIn_163_0;
                    stackOut_163_1 = stackIn_163_1;
                    stackIn_165_0 = stackOut_163_0;
                    stackIn_165_1 = stackOut_163_1;
                    stackIn_164_0 = stackOut_163_0;
                    stackIn_164_1 = stackOut_163_1;
                    if (!vb.field_c) {
                      break L48;
                    } else {
                      stackOut_164_0 = (gh) (Object) stackIn_164_0;
                      stackOut_164_1 = stackIn_164_1;
                      stackOut_164_2 = 1;
                      stackIn_166_0 = stackOut_164_0;
                      stackIn_166_1 = stackOut_164_1;
                      stackIn_166_2 = stackOut_164_2;
                      break L47;
                    }
                  }
                }
              }
              stackOut_165_0 = (gh) (Object) stackIn_165_0;
              stackOut_165_1 = stackIn_165_1;
              stackOut_165_2 = 0;
              stackIn_166_0 = stackOut_165_0;
              stackIn_166_1 = stackOut_165_1;
              stackIn_166_2 = stackOut_165_2;
              break L47;
            }
            L49: {
              ((gh) (Object) stackIn_166_0).a((byte) stackIn_166_1, stackIn_166_2 != 0);
              fg.field_Tb.field_d.j(param0 + 10000);
              if (null == nf.field_b) {
                break L49;
              } else {
                L50: {
                  if (mn.field_E.field_Eb != 0) {
                    na.a((byte) -119, param4, nf.field_b.j(param0 ^ -33));
                    break L50;
                  } else {
                    break L50;
                  }
                }
                L51: {
                  if (rn.field_C.field_Eb == 0) {
                    break L51;
                  } else {
                    vb.field_c = true;
                    break L51;
                  }
                }
                L52: {
                  if (fk.field_q.field_Eb == 0) {
                    break L52;
                  } else {
                    qb.field_J = true;
                    break L52;
                  }
                }
                L53: {
                  if (ta.field_i.field_Eb == 0) {
                    break L53;
                  } else {
                    vb.field_c = false;
                    break L53;
                  }
                }
                cb.a(nf.field_b, (byte) -115, param4, false);
                break L49;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "cn.R(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final int a(int param0, int param1, int param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param3.field_F + ((cn) this).field_h + param1 - -param3.field_z;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("cn.E(").append(0).append(44).append(param1).append(44).append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    String c(int param0, lh param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                int discarded$2 = ((cn) this).b((byte) 115, (lh) null);
                break L1;
              }
            }
            stackOut_2_0 = param1.field_y;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cn.G(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        if (!param3) {
          L0: {
            if (qf.field_e == null) {
              break L0;
            } else {
              if (ei.field_q != 13) {
                break L0;
              } else {
                qf.field_e = null;
                return true;
              }
            }
          }
          if (jn.field_g) {
            if (fa.a(38)) {
              L1: {
                if (!he.a((byte) -125, param2, param0)) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L1;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var4 = stackIn_21_0;
                  if (ei.field_q == 80) {
                    break L3;
                  } else {
                    if (84 != ei.field_q) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4 = 1;
                jn.field_g = false;
                break L2;
              }
              L4: {
                if (ei.field_q == 13) {
                  pg.d(88);
                  jn.field_g = false;
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var4 != 0;
            } else {
              return false;
            }
          } else {
            L5: {
              if (vb.field_e) {
                break L5;
              } else {
                if (ei.field_q == 9) {
                  break L5;
                } else {
                  if (10 == ei.field_q) {
                    break L5;
                  } else {
                    if (ei.field_q != 11) {
                      L6: {
                        if (ei.field_q != 80) {
                          break L6;
                        } else {
                          if (!fa.a(38)) {
                            break L6;
                          } else {
                            jn.field_g = true;
                            return true;
                          }
                        }
                      }
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            return ba.a(123, param0, param1);
          }
        } else {
          return true;
        }
    }

    public final int a(int param0, int param1, lh param2, byte param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              da discarded$8 = ((cn) this).b(-1, param2);
              if (param3 == 115) {
                break L1;
              } else {
                ((cn) this).field_h = -14;
                break L1;
              }
            }
            stackOut_2_0 = param2.field_s.a(0, -((cn) this).a(param0, 3, param2) + param1, param5 + -((cn) this).a((byte) -123, param2, param4));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("cn.Q(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_3_0;
    }

    public final int a(byte param0, lh param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -113) {
                break L1;
              } else {
                int discarded$2 = ((cn) this).a((byte) 8, (lh) null, 100);
                break L1;
              }
            }
            stackOut_2_0 = this.a(0, param2, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cn.W(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public final int a(int param0) {
        int var2 = 26 / ((70 - param0) / 37);
        return ((cn) this).field_f.field_G - -((cn) this).field_f.field_F;
    }

    private final void a(lh param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (null == param0.field_s) {
                param0.field_s = (da) (Object) new si();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = ((cn) this).a(5546, param0);
              var4 = this.d(-3, param0);
              var6 = ((cn) this).field_j;
              if (var6 == 0) {
                var5 = ((cn) this).field_f.field_G;
                break L2;
              } else {
                if (var6 != 2) {
                  L3: {
                    if (var6 == 3) {
                      break L3;
                    } else {
                      if (var6 != 1) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = ((cn) this).field_f.field_G + (-((cn) this).field_f.field_F + (-((cn) this).field_f.field_G + var4) >> 1);
                  break L2;
                } else {
                  var5 = var4 - ((cn) this).field_f.field_F;
                  break L2;
                }
              }
            }
            L4: {
              L5: {
                var6 = ((cn) this).field_a;
                if (0 == var6) {
                  break L5;
                } else {
                  if (var6 == 3) {
                    break L5;
                  } else {
                    L6: {
                      if (var6 == 1) {
                        if (!(param0.field_s instanceof si)) {
                          break L6;
                        } else {
                          ((si) (Object) param0.field_s).b(var3_int >> 1, ((cn) this).c(-1, param0), var5, -1385548511, ((cn) this).field_f);
                          break L4;
                        }
                      } else {
                        if (var6 != 2) {
                          break L6;
                        } else {
                          if (param0.field_s instanceof si) {
                            ((si) (Object) param0.field_s).a(((cn) this).c(-1, param0), true, var3_int, var5, ((cn) this).field_f);
                            break L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L4;
                  }
                }
              }
              if (param0.field_s instanceof si) {
                ((si) (Object) param0.field_s).a(0, ((cn) this).c(-1, param0), 97, var5, ((cn) this).field_f);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("cn.T(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + 125 + 41);
        }
    }

    cn(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(byte param0, lh param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param2 + ((cn) this).field_b + (param1.field_o + param3 + param1.field_u);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("cn.M(").append(114).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = hh.a(ji.a(-87, param1), (byte) -114);
              if (param0 >= 89) {
                break L1;
              } else {
                field_l = false;
                break L1;
              }
            }
            L2: {
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_4_0 = (String) var2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("cn.AA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, lh param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              fe.a(param0 - -param6.field_o, param2 + param6.field_z, 47, param6.field_x + (param6.field_o + param0), param6.field_E + param6.field_z + param2);
              var9_int = ((cn) this).a(5546, param6);
              var10 = this.d(-3, param6);
              if (((cn) this).field_i) {
                int discarded$1 = ((cn) this).field_f.a(((cn) this).c(-1, param6), this.a((byte) 114, param6, 0, param0), this.a(0, param2, 0, param6), var9_int, var10, param7, param4, ((cn) this).field_a, ((cn) this).field_j, ((cn) this).field_m);
                break L1;
              } else {
                L2: {
                  var12 = ((cn) this).field_j;
                  if (var12 == 0) {
                    var11 = ((cn) this).field_f.field_G;
                    break L2;
                  } else {
                    if (var12 == 2) {
                      var11 = var10 - ((cn) this).field_f.field_F;
                      break L2;
                    } else {
                      L3: {
                        if (3 != var12) {
                          if (var12 != 1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var11 = (-((cn) this).field_f.field_F + -((cn) this).field_f.field_G + var10 >> 1) + ((cn) this).field_f.field_G;
                      break L2;
                    }
                  }
                }
                L4: {
                  var12 = ((cn) this).field_a;
                  if (0 != var12) {
                    if (var12 == 3) {
                      break L4;
                    } else {
                      if (var12 == 1) {
                        ((cn) this).field_f.a(((cn) this).c(-1, param6), (var9_int >> 1) + this.a((byte) 114, param6, 0, param0), this.a(0, param2, 0, param6) + var11, param7, param4);
                        break L1;
                      } else {
                        if (var12 != 2) {
                          break L1;
                        } else {
                          ((cn) this).field_f.c(((cn) this).c(-1, param6), this.a((byte) 114, param6, 0, param0) + var9_int, this.a(0, param2, 0, param6) + var11, param7, param4);
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                ((cn) this).field_f.b(((cn) this).c(-1, param6), this.a((byte) 114, param6, 0, param0), var11 + this.a(0, param2, 0, param6), param7, param4);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var9;
            stackOut_23_1 = new StringBuilder().append("cn.U(").append(param0).append(44).append(-11867).append(44).append(param2).append(44).append(0).append(44).append(param4).append(44).append(0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param6 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param7 + 41);
        }
    }

    public final da b(int param0, lh param1) {
        RuntimeException var3 = null;
        da stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        da stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((cn) this).field_k = -75;
                break L1;
              }
            }
            L2: {
              if (null != param1.field_s) {
                break L2;
              } else {
                param1.field_s = (da) (Object) new si();
                break L2;
              }
            }
            L3: {
              if (!((cn) this).field_i) {
                int discarded$2 = 125;
                this.a(param1);
                break L3;
              } else {
                ((si) (Object) param1.field_s).a(((cn) this).a(param0 + 5547, param1), ((cn) this).field_a, ((cn) this).field_m, ((cn) this).c(-1, param1), ((cn) this).field_j, ((cn) this).field_f, this.d(param0 + -2, param1), param0 + 2);
                break L3;
              }
            }
            stackOut_7_0 = param1.field_s;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cn.N(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    public final int a(int param0, int param1, lh param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                int discarded$2 = this.d(-89, (lh) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a((byte) 114, param2, 0, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cn.O(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, boolean param2, int param3, lh param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        il var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        da var17 = null;
        da var18 = null;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            if (param3 != param5) {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  ((cn) this).a(107, -2, false, -112, (lh) null, 115);
                  break L1;
                }
              }
              L2: {
                if (param4.d(0)) {
                  L3: {
                    var17 = ((cn) this).b(-1, param4);
                    var18 = var17;
                    if (param5 <= param3) {
                      var8 = param5;
                      var9 = param3;
                      break L3;
                    } else {
                      var8 = param3;
                      var9 = param5;
                      break L3;
                    }
                  }
                  var10 = var18.b(-1, var8);
                  var11 = var18.b(-1, var9);
                  fe.a(param4.field_o + param1, param4.field_z + param0, -78, param4.field_o + param1 + param4.field_x, param4.field_z + param0 - -param4.field_E);
                  var12 = var10;
                  L4: while (true) {
                    if (var11 < var12) {
                      tk.f((byte) 113);
                      break L2;
                    } else {
                      L5: {
                        var13 = var17.field_h[var12];
                        if (var10 != var12) {
                          stackOut_14_0 = var13.field_f[0];
                          stackIn_15_0 = stackOut_14_0;
                          break L5;
                        } else {
                          stackOut_13_0 = var18.a(1, var8);
                          stackIn_15_0 = stackOut_13_0;
                          break L5;
                        }
                      }
                      L6: {
                        var14 = stackIn_15_0;
                        if (var12 != var11) {
                          if (var13 == null) {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            break L6;
                          } else {
                            stackOut_18_0 = var13.field_f[var13.field_f.length - 1];
                            stackIn_20_0 = stackOut_18_0;
                            break L6;
                          }
                        } else {
                          stackOut_16_0 = var18.a(1, var9);
                          stackIn_20_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      var15 = stackIn_20_0;
                      ad.field_j.a(-var14 + var15, 5939, this.a((byte) 114, param4, var14, param1), var13.field_a, ((cn) this).field_c >>> 24, ((cn) this).field_c, param0 + param4.field_z - (-((cn) this).field_h + -param4.field_F - var13.field_h));
                      var12++;
                      continue L4;
                    }
                  }
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("cn.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param5 + 41);
        }
    }

    final void a(cn param0, int param1) {
        try {
            param0.field_g = ((cn) this).field_g;
            if (param1 != -3) {
                ((cn) this).field_j = 10;
            }
            param0.field_k = ((cn) this).field_k;
            param0.field_i = ((cn) this).field_i;
            param0.field_e = ((cn) this).field_e;
            param0.field_a = ((cn) this).field_a;
            param0.field_d = ((cn) this).field_d;
            param0.field_j = ((cn) this).field_j;
            param0.field_c = ((cn) this).field_c;
            param0.field_h = ((cn) this).field_h;
            param0.field_b = ((cn) this).field_b;
            param0.field_m = ((cn) this).field_m;
            param0.field_f = ((cn) this).field_f;
            param0.field_n = ((cn) this).field_n;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "cn.K(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, lh param2, int param3) {
        try {
            this.a(param1, -11867, param0, 0, ((cn) this).field_g, 0, param2, ((cn) this).field_k);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "cn.P(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + 118 + 41);
        }
    }

    public final int b(byte param0, lh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -120 / ((param0 - -67) / 59);
            da discarded$2 = ((cn) this).b(-1, param1);
            stackOut_0_0 = param1.field_s.a((byte) 24) + ((cn) this).field_h - -((cn) this).field_d;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("cn.L(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public final int a(byte param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              da discarded$7 = ((cn) this).b(-1, param1);
              if (param0 > 40) {
                break L1;
              } else {
                cn.a(-9, true, false, false, 56);
                break L1;
              }
            }
            stackOut_2_0 = param1.field_s.b((byte) -100) + ((cn) this).field_b + ((cn) this).field_n;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cn.BA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final int a(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5546) {
                break L1;
              } else {
                ((cn) this).field_m = 61;
                break L1;
              }
            }
            stackOut_2_0 = -((cn) this).field_n + (-((cn) this).field_b + param1.field_x);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cn.J(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final void a(lh param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        il var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        da var13 = null;
        da var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param4 > 70) {
                break L1;
              } else {
                boolean discarded$1 = cn.a(-106, 84, -5, false);
                break L1;
              }
            }
            L2: {
              if (param0.d(0)) {
                L3: {
                  var13 = ((cn) this).b(-1, param0);
                  var14 = var13;
                  var7 = var14.b(-1, param1);
                  var8 = var13.field_h[var7];
                  var9 = var14.a(1, param1);
                  var10 = this.a((byte) 114, param0, var9, param3);
                  var11 = ((cn) this).a((byte) -120, param0, param2) + Math.max(0, var8.field_h);
                  stackOut_4_0 = ((cn) this).a((byte) -116, param0, param2);
                  stackOut_4_1 = this.d(-3, param0);
                  stackOut_4_2 = var8.field_a;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  if (var14.field_h.length > 1 + var7) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = var13.field_h[var7 - -1].field_h;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    stackIn_7_3 = stackOut_6_3;
                    break L3;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = stackIn_5_2;
                    stackOut_5_3 = var8.field_a;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    break L3;
                  }
                }
                var12 = stackIn_7_0 + Math.min(stackIn_7_1, Math.min(stackIn_7_2, stackIn_7_3));
                fe.a(param0.field_o + param3, param2 + param0.field_z, 113, param0.field_x + (param0.field_o + param3), param0.field_E + (param0.field_z + param2));
                ad.field_j.a(var11, var12, ((cn) this).field_e, (byte) -121, var10, var10);
                tk.f((byte) 120);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("cn.S(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    protected cn() {
    }

    cn(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            ((cn) this).field_h = param3;
            ((cn) this).field_a = param7;
            ((cn) this).field_g = param6;
            ((cn) this).field_d = param4;
            ((cn) this).field_f = param0;
            ((cn) this).field_n = param2;
            ((cn) this).field_c = param11;
            ((cn) this).field_e = param10;
            ((cn) this).field_m = param9;
            ((cn) this).field_i = param12 ? true : false;
            ((cn) this).field_k = param5;
            ((cn) this).field_b = param1;
            ((cn) this).field_j = param8;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "cn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
    }
}
