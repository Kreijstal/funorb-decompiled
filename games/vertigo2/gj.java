/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ji {
    static cr field_z;
    static int field_y;

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var41 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        L0: {
          var19 = Vertigo2.field_L ? 1 : 0;
          if (param0 == -3780) {
            break L0;
          } else {
            field_y = 109;
            break L0;
          }
        }
        L1: {
          var51 = ((gj) this).field_v.a(param1, param0 ^ 3778);
          var41 = var51;
          var31 = var41;
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (((gj) this).field_v.field_c) {
            var54 = ((gj) this).a(2, -1, param1);
            var52 = ((gj) this).c(0, 3, param1);
            var53 = ((gj) this).c(1, 3, param1);
            var7 = var51[0];
            var8 = var51[1];
            var9 = var51[2];
            var55 = var52[0];
            var56 = var52[1];
            var57 = var52[2];
            var58 = var53[0];
            var59 = var53[1];
            var60 = var53[2];
            var16 = 0;
            L2: while (true) {
              if (var16 >= we.field_M) {
                break L1;
              } else {
                var17 = var54[var16];
                if (var17 != 4096) {
                  var58 = var53[0];
                  if (var17 == 0) {
                    var58 = var53[0];
                    var7[var16] = var58[var16];
                    var8[var16] = var59[var16];
                    var9[var16] = var60[var16];
                    var16++;
                    continue L2;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var58[var16] * var18 + var17 * var55[var16] >> 12;
                    var8[var16] = var59[var16] * var18 + var17 * var56[var16] >> 12;
                    var9[var16] = var60[var16] * var18 + var17 * var57[var16] >> 12;
                    var16++;
                    continue L2;
                  }
                } else {
                  var7[var16] = var55[var16];
                  var8[var16] = var56[var16];
                  var9[var16] = var57[var16];
                  var16++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    public gj() {
        super(3, false);
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          var3 = ((gj) this).field_x.a(param0, (byte) -59);
          if (((gj) this).field_x.field_i) {
            var20 = ((gj) this).a(0, -1, param0);
            var21 = ((gj) this).a(1, -1, param0);
            var19 = ((gj) this).a(2, -1, param0);
            var7 = 0;
            L1: while (true) {
              if (we.field_M <= var7) {
                if (param1 >= 91) {
                  break L0;
                } else {
                  int[] discarded$10 = ((gj) this).c(-97, -12);
                  break L0;
                }
              } else {
                var8 = var19[var7];
                if (var8 == 4096) {
                  var3[var7] = var20[var7];
                  var7++;
                  continue L1;
                } else {
                  if (var8 == 0) {
                    var3[var7] = var21[var7];
                    var7++;
                    continue L1;
                  } else {
                    var3[var7] = var20[var7] * var8 - -((-var8 + 4096) * var21[var7]) >> 12;
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            if (param1 >= 91) {
              break L0;
            } else {
              int[] discarded$11 = ((gj) this).c(-97, -12);
              break L0;
            }
          }
        }
        return var3;
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        L0: {
          am.field_n = param3;
          vl.field_c = 0;
          ue.field_O = param2;
          if (al.a(am.field_n, (byte) -94)) {
            L1: {
              L2: {
                var4 = 0;
                if (am.field_n == 13) {
                  break L2;
                } else {
                  if (am.field_n == 19) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var4 = 1;
              break L1;
            }
            L3: {
              if (am.field_n == 0) {
                break L3;
              } else {
                if (am.field_n == 21) {
                  break L3;
                } else {
                  if (am.field_n == 1) {
                    break L3;
                  } else {
                    if (2 == am.field_n) {
                      break L3;
                    } else {
                      if (am.field_n == 22) {
                        break L3;
                      } else {
                        if (3 == am.field_n) {
                          break L3;
                        } else {
                          if (am.field_n == 4) {
                            break L3;
                          } else {
                            var4 = vp.a((byte) 76, am.field_n) - 1;
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (am.field_n != 7) {
                break L4;
              } else {
                var4 = 1;
                break L4;
              }
            }
            fh.field_y[am.field_n].a(-121, param1, var4);
            break L0;
          } else {
            break L0;
          }
        }
        var4 = 72 % ((-10 - param0) / 41);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, boolean param4) {
        cr var6 = null;
        cr var7 = null;
        cr var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        Object var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        nj var17 = null;
        int var17_int = 0;
        Object var18 = null;
        bs var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        cr var21 = null;
        int[] var22 = null;
        String var24 = null;
        int[] var25 = null;
        cr var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        cr stackIn_17_0 = null;
        cr stackIn_18_0 = null;
        cr stackIn_19_0 = null;
        cr stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_40_0 = 0;
        cr stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        cr stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        cr stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        cr stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        cr stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        cr stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        cr stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        cr stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        cr stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        cr stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        int stackIn_144_2 = 0;
        cr stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        cr stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        cr stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        cr stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        cr stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        cr stackOut_16_0 = null;
        cr stackOut_17_0 = null;
        cr stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cr stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        cr stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        cr stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        cr stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        cr stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        cr stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        int stackOut_138_2 = 0;
        cr stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        cr stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        cr stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        cr stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        int stackOut_142_2 = 0;
        cr stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        int stackOut_143_2 = 0;
        cr stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        cr stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        cr stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        cr stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        cr stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        L0: {
          var18 = null;
          var19 = Vertigo2.field_L ? 1 : 0;
          hq.b(mp.field_b, -127);
          if (null != gd.field_j) {
            L1: {
              ne.field_G.field_lb = true;
              var21 = fo.field_f;
              var26 = var21;
              fo.field_f.field_db = 0;
              var26.field_Fb = 0;
              hd.field_g.field_db = 0;
              var6 = hd.field_g;
              var6.field_Fb = 0;
              kk.field_f.field_db = 0;
              var7 = kk.field_f;
              var7.field_Fb = 0;
              int discarded$2 = 0;
              if (cn.b()) {
                L2: {
                  ud.field_x.field_S = fq.field_a.toUpperCase();
                  var9 = (2 + lb.field_c.field_Fb) / 2;
                  fo.field_f.a(93, var9 - 2, 40, lb.field_c.field_db - 40, 0);
                  if (gd.field_j.field_uc <= gd.field_j.field_Qb) {
                    fo.field_f.field_S = fg.field_db.toUpperCase();
                    fo.field_f.field_lb = false;
                    break L2;
                  } else {
                    fo.field_f.field_S = eh.field_g.toUpperCase();
                    fo.field_f.field_lb = true;
                    break L2;
                  }
                }
                L3: {
                  fo.field_f.field_Bb = fb.field_u.field_Bb;
                  if (kk.field_j <= 0) {
                    break L3;
                  } else {
                    L4: {
                      if (1 != kk.field_j) {
                        var10_ref_String = Vertigo2.a(new String[1], uo.field_c, 111);
                        break L4;
                      } else {
                        var10_ref_String = e.field_l;
                        break L4;
                      }
                    }
                    L5: {
                      if (0 != (lo.field_d & 16)) {
                        break L5;
                      } else {
                        if (!im.field_g) {
                          fo.field_f.field_Bb = fb.field_u.field_Q;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    fo.field_f.field_S = fo.field_f.field_S + "<br>" + var10_ref_String;
                    break L3;
                  }
                }
                L6: {
                  L7: {
                    hd.field_g.a(82, -var9 + lb.field_c.field_Fb, 40, lb.field_c.field_db - 40, var9);
                    hd.field_g.field_S = gm.field_a.toUpperCase();
                    stackOut_16_0 = hd.field_g;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (!param0) {
                      break L7;
                    } else {
                      stackOut_17_0 = (cr) (Object) stackIn_17_0;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (r.field_h != 0L) {
                        break L7;
                      } else {
                        stackOut_18_0 = (cr) (Object) stackIn_18_0;
                        stackOut_18_1 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L6;
                      }
                    }
                  }
                  stackOut_19_0 = (cr) (Object) stackIn_19_0;
                  stackOut_19_1 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L6;
                }
                L8: {
                  stackIn_20_0.field_lb = stackIn_20_1 != 0;
                  var8 = hd.field_g;
                  var10 = 2;
                  if (gr.field_W == null) {
                    break L8;
                  } else {
                    L9: {
                      if (null == e.field_c) {
                        e.field_c = new byte[ol.field_A];
                        mn.field_t = new boolean[ol.field_A];
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var11_int = 0;
                    L10: while (true) {
                      if (ol.field_A <= var11_int) {
                        var10 = 0;
                        L11: while (true) {
                          if (2 <= var10) {
                            if (2 > fn.field_z) {
                              break L8;
                            } else {
                              if (!cr.field_eb[12]) {
                                break L8;
                              } else {
                                var10 = 2;
                                break L8;
                              }
                            }
                          } else {
                            var11_int = 0;
                            var12 = 0;
                            L12: while (true) {
                              if (gr.field_W.length <= var12) {
                                if (var11_int == 0) {
                                  var10++;
                                  continue L11;
                                } else {
                                  var10++;
                                  continue L11;
                                }
                              } else {
                                var28 = gr.field_W[var12];
                                var27 = var28;
                                var25 = var27;
                                var22 = var25;
                                var13_array = var22;
                                var14_int = 0;
                                L13: while (true) {
                                  L14: {
                                    if (var28.length <= var14_int) {
                                      var11_int = 1;
                                      var14_int = -1;
                                      var15 = 0;
                                      L15: while (true) {
                                        if (var15 >= var28.length) {
                                          mn.field_t[var14_int] = true;
                                          break L14;
                                        } else {
                                          var16 = var28[var15];
                                          if (var16 <= var14_int) {
                                            var15 += 2;
                                            continue L15;
                                          } else {
                                            var15 += 2;
                                            continue L15;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = var28[var14_int];
                                      var16 = var13_array[var14_int + 1];
                                      if (var15 == -1) {
                                        L16: {
                                          if (var10 == 0) {
                                            stackOut_39_0 = gd.field_j.field_uc;
                                            stackIn_40_0 = stackOut_39_0;
                                            break L16;
                                          } else {
                                            stackOut_38_0 = gd.field_j.field_Qb;
                                            stackIn_40_0 = stackOut_38_0;
                                            break L16;
                                          }
                                        }
                                        var17_int = stackIn_40_0;
                                        if (var16 == var17_int) {
                                          var14_int += 2;
                                          continue L13;
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        if ((255 & gd.field_j.field_fc[var15]) != var16) {
                                          var12++;
                                          continue L12;
                                        } else {
                                          var12++;
                                          continue L12;
                                        }
                                      }
                                    }
                                  }
                                  var12++;
                                  continue L12;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        mn.field_t[var11_int] = false;
                        var11_int++;
                        continue L10;
                      }
                    }
                  }
                }
                if (var10 < 2) {
                  hd.field_g.field_lb = false;
                  if (!hd.field_g.field_G) {
                    break L1;
                  } else {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    L17: while (true) {
                      if (var13_int >= ol.field_A) {
                        L18: {
                          if (var10 != 0) {
                            var13 = lo.field_a;
                            if (var12 == 0) {
                              var14 = Vertigo2.a(new String[1], eg.field_q, -123);
                              break L18;
                            } else {
                              var14 = ni.field_e + var11;
                              break L18;
                            }
                          } else {
                            var13 = rn.field_y;
                            if (var12 != 0) {
                              var14 = ia.field_H + var11;
                              break L18;
                            } else {
                              var14 = Vertigo2.a(new String[1], fa.field_t, 14);
                              break L18;
                            }
                          }
                        }
                        ko.field_S = "<col=A00000>" + var13 + "<br>" + var14;
                        break L1;
                      } else {
                        L19: {
                          if (mn.field_t[var13_int]) {
                            var24 = "<col=A00000>" + md.field_C[var13_int] + "</col>";
                            if (var11 == null) {
                              var11 = (Object) (Object) var24;
                              break L19;
                            } else {
                              var12 = 1;
                              var11 = (Object) (Object) (var11 + ", " + var24);
                              break L19;
                            }
                          } else {
                            break L19;
                          }
                        }
                        var13_int++;
                        continue L17;
                      }
                    }
                  }
                } else {
                  L20: {
                    if (sf.field_f != null) {
                      break L20;
                    } else {
                      if (te.field_D != null) {
                        break L20;
                      } else {
                        if (qh.field_e != null) {
                          break L20;
                        } else {
                          if (null != il.field_b) {
                            break L20;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  var11_int = 0;
                  var12 = 0;
                  var13_int = 0;
                  var14_int = 0;
                  var15 = 0;
                  var16 = 0;
                  L21: while (true) {
                    if (var16 >= ol.field_A) {
                      var16 = 0;
                      var17 = vd.field_d.field_Nb.field_M;
                      var18_ref = (bs) (Object) var17.a((byte) 100);
                      L22: while (true) {
                        L23: {
                          if (var18_ref == null) {
                            break L23;
                          } else {
                            L24: {
                              if (!var18_ref.k(15)) {
                                L25: {
                                  if (var11_int == 0) {
                                    break L25;
                                  } else {
                                    if (var18_ref.field_Zb) {
                                      break L25;
                                    } else {
                                      var16 = 1;
                                      break L23;
                                    }
                                  }
                                }
                                if (var18_ref.field_Rb < var13_int) {
                                  var16 = 1;
                                  break L23;
                                } else {
                                  if (var18_ref.field_Mb < var14_int) {
                                    var16 = 1;
                                    break L23;
                                  } else {
                                    if ((var15 & ~var18_ref.field_Kb) <= 0) {
                                      if (var12 == 0) {
                                        break L24;
                                      } else {
                                        var16 = 1;
                                        break L23;
                                      }
                                    } else {
                                      var16 = 1;
                                      break L23;
                                    }
                                  }
                                }
                              } else {
                                break L24;
                              }
                            }
                            var18_ref = (bs) (Object) var17.b(35);
                            continue L22;
                          }
                        }
                        L26: {
                          if (fn.field_z < 2) {
                            break L26;
                          } else {
                            if (cr.field_eb[12]) {
                              var16 = 0;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                        }
                        if (var16 != 0) {
                          hd.field_g.field_lb = false;
                          if (hd.field_g.field_G) {
                            if (el.field_e.field_b.field_Kb == 0) {
                              ko.field_S = di.field_y;
                              break L1;
                            } else {
                              ko.field_S = Vertigo2.a(new String[1], pb.field_e, -117);
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L27: {
                        var17_int = 255 & gd.field_j.field_fc[var16];
                        if (sf.field_f == null) {
                          break L27;
                        } else {
                          if (sf.field_f[var16] == null) {
                            break L27;
                          } else {
                            if (sf.field_f[var16][var17_int]) {
                              var11_int = 1;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                      L28: {
                        if (null == te.field_D) {
                          break L28;
                        } else {
                          if (te.field_D[var16] == null) {
                            break L28;
                          } else {
                            L29: {
                              var18_int = te.field_D[var16][var17_int];
                              if (var13_int >= var18_int) {
                                break L29;
                              } else {
                                var13_int = var18_int;
                                break L29;
                              }
                            }
                            if (var18_int == 0) {
                              break L28;
                            } else {
                              if (vb.field_g) {
                                break L28;
                              } else {
                                var11_int = 1;
                                break L28;
                              }
                            }
                          }
                        }
                      }
                      L30: {
                        if (il.field_b == null) {
                          break L30;
                        } else {
                          if (null == il.field_b[var16]) {
                            break L30;
                          } else {
                            var15 = var15 | il.field_b[var16][var17_int];
                            break L30;
                          }
                        }
                      }
                      if (null == qh.field_e) {
                        var16++;
                        continue L21;
                      } else {
                        var16++;
                        continue L21;
                      }
                    }
                  }
                }
              } else {
                var9_ref_String = gd.field_j.field_Nb;
                ud.field_x.field_S = Vertigo2.a(new String[1], ie.field_Rb, 20).toUpperCase();
                kk.field_f.a(88, lb.field_c.field_Fb, 40, -40 + lb.field_c.field_db, 0);
                kk.field_f.field_S = Vertigo2.a(new String[1], od.field_Ob, 78);
                var8 = kk.field_f;
                break L1;
              }
            }
            L31: {
              if (r.field_h == 0L) {
                break L31;
              } else {
                L32: {
                  var9 = (int)(r.field_h + -gk.a(108));
                  var9 = (var9 + 999) / 1000;
                  if (var9 < 1) {
                    var9 = 1;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                var8.field_S = Vertigo2.a(new String[1], me.field_a, 89);
                break L31;
              }
            }
            nb.field_D.field_S = Vertigo2.a(new String[2], nq.field_I, 9);
            break L0;
          } else {
            break L0;
          }
        }
        L33: {
          L34: {
            stackOut_134_0 = hk.field_o;
            stackOut_134_1 = 0;
            stackIn_138_0 = stackOut_134_0;
            stackIn_138_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (!param4) {
              break L34;
            } else {
              stackOut_135_0 = (cr) (Object) stackIn_135_0;
              stackOut_135_1 = stackIn_135_1;
              stackIn_138_0 = stackOut_135_0;
              stackIn_138_1 = stackOut_135_1;
              stackIn_136_0 = stackOut_135_0;
              stackIn_136_1 = stackOut_135_1;
              if (param2) {
                break L34;
              } else {
                stackOut_136_0 = (cr) (Object) stackIn_136_0;
                stackOut_136_1 = stackIn_136_1;
                stackIn_138_0 = stackOut_136_0;
                stackIn_138_1 = stackOut_136_1;
                stackIn_137_0 = stackOut_136_0;
                stackIn_137_1 = stackOut_136_1;
                if (im.field_g) {
                  break L34;
                } else {
                  stackOut_137_0 = (cr) (Object) stackIn_137_0;
                  stackOut_137_1 = stackIn_137_1;
                  stackOut_137_2 = 1;
                  stackIn_139_0 = stackOut_137_0;
                  stackIn_139_1 = stackOut_137_1;
                  stackIn_139_2 = stackOut_137_2;
                  break L33;
                }
              }
            }
          }
          stackOut_138_0 = (cr) (Object) stackIn_138_0;
          stackOut_138_1 = stackIn_138_1;
          stackOut_138_2 = 0;
          stackIn_139_0 = stackOut_138_0;
          stackIn_139_1 = stackOut_138_1;
          stackIn_139_2 = stackOut_138_2;
          break L33;
        }
        L35: {
          L36: {
            ((cr) (Object) stackIn_139_0).a(stackIn_139_1, stackIn_139_2 != 0);
            stackOut_139_0 = lb.field_c;
            stackOut_139_1 = 0;
            stackIn_143_0 = stackOut_139_0;
            stackIn_143_1 = stackOut_139_1;
            stackIn_140_0 = stackOut_139_0;
            stackIn_140_1 = stackOut_139_1;
            if (!param4) {
              break L36;
            } else {
              stackOut_140_0 = (cr) (Object) stackIn_140_0;
              stackOut_140_1 = stackIn_140_1;
              stackIn_143_0 = stackOut_140_0;
              stackIn_143_1 = stackOut_140_1;
              stackIn_141_0 = stackOut_140_0;
              stackIn_141_1 = stackOut_140_1;
              if (param2) {
                break L36;
              } else {
                stackOut_141_0 = (cr) (Object) stackIn_141_0;
                stackOut_141_1 = stackIn_141_1;
                stackIn_143_0 = stackOut_141_0;
                stackIn_143_1 = stackOut_141_1;
                stackIn_142_0 = stackOut_141_0;
                stackIn_142_1 = stackOut_141_1;
                if (im.field_g) {
                  break L36;
                } else {
                  stackOut_142_0 = (cr) (Object) stackIn_142_0;
                  stackOut_142_1 = stackIn_142_1;
                  stackOut_142_2 = 1;
                  stackIn_144_0 = stackOut_142_0;
                  stackIn_144_1 = stackOut_142_1;
                  stackIn_144_2 = stackOut_142_2;
                  break L35;
                }
              }
            }
          }
          stackOut_143_0 = (cr) (Object) stackIn_143_0;
          stackOut_143_1 = stackIn_143_1;
          stackOut_143_2 = 0;
          stackIn_144_0 = stackOut_143_0;
          stackIn_144_1 = stackOut_143_1;
          stackIn_144_2 = stackOut_143_2;
          break L35;
        }
        L37: {
          L38: {
            ((cr) (Object) stackIn_144_0).a(stackIn_144_1, stackIn_144_2 != 0);
            stackOut_144_0 = wc.field_m;
            stackOut_144_1 = 0;
            stackIn_148_0 = stackOut_144_0;
            stackIn_148_1 = stackOut_144_1;
            stackIn_145_0 = stackOut_144_0;
            stackIn_145_1 = stackOut_144_1;
            if (!param4) {
              break L38;
            } else {
              stackOut_145_0 = (cr) (Object) stackIn_145_0;
              stackOut_145_1 = stackIn_145_1;
              stackIn_148_0 = stackOut_145_0;
              stackIn_148_1 = stackOut_145_1;
              stackIn_146_0 = stackOut_145_0;
              stackIn_146_1 = stackOut_145_1;
              if (param2) {
                break L38;
              } else {
                stackOut_146_0 = (cr) (Object) stackIn_146_0;
                stackOut_146_1 = stackIn_146_1;
                stackIn_148_0 = stackOut_146_0;
                stackIn_148_1 = stackOut_146_1;
                stackIn_147_0 = stackOut_146_0;
                stackIn_147_1 = stackOut_146_1;
                if (!im.field_g) {
                  break L38;
                } else {
                  stackOut_147_0 = (cr) (Object) stackIn_147_0;
                  stackOut_147_1 = stackIn_147_1;
                  stackOut_147_2 = 1;
                  stackIn_149_0 = stackOut_147_0;
                  stackIn_149_1 = stackOut_147_1;
                  stackIn_149_2 = stackOut_147_2;
                  break L37;
                }
              }
            }
          }
          stackOut_148_0 = (cr) (Object) stackIn_148_0;
          stackOut_148_1 = stackIn_148_1;
          stackOut_148_2 = 0;
          stackIn_149_0 = stackOut_148_0;
          stackIn_149_1 = stackOut_148_1;
          stackIn_149_2 = stackOut_148_2;
          break L37;
        }
        L39: {
          ((cr) (Object) stackIn_149_0).a(stackIn_149_1, stackIn_149_2 != 0);
          el.field_e.field_b.k(0);
          if (gd.field_j == null) {
            break L39;
          } else {
            L40: {
              if (ne.field_G.field_tb == 0) {
                break L40;
              } else {
                int discarded$3 = 18964;
                qk.d(gd.field_j.a((byte) -38), 11);
                break L40;
              }
            }
            L41: {
              if (hd.field_g.field_tb == 0) {
                break L41;
              } else {
                na.field_p = true;
                break L41;
              }
            }
            L42: {
              if (fo.field_f.field_tb != 0) {
                im.field_g = true;
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              if (Vertigo2.field_M.field_tb != 0) {
                im.field_g = false;
                break L43;
              } else {
                break L43;
              }
            }
            mg.a(false, 11, false, gd.field_j);
            break L39;
          }
        }
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (1 != param2.h(-11)) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L2;
                  }
                }
                ((gj) this).field_o = stackIn_4_1 != 0;
                break L1;
              }
            }
            L3: {
              if (param0 == 110) {
                break L3;
              } else {
                int[] discarded$2 = ((gj) this).c(-57, -56);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("gj.C(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void b(byte param0) {
        if (param0 >= -68) {
            gj.b((byte) -14);
        }
        field_z = null;
    }

    static {
    }
}
