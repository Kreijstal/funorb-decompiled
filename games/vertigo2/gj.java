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
              if (~var16 <= ~we.field_M) {
                break L1;
              } else {
                L3: {
                  L4: {
                    var17 = var54[var16];
                    if (var17 != 4096) {
                      break L4;
                    } else {
                      var7[var16] = var55[var16];
                      var8[var16] = var56[var16];
                      var9[var16] = var57[var16];
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var58 = var53[0];
                    if (var17 == 0) {
                      break L5;
                    } else {
                      var18 = -var17 + 4096;
                      var7[var16] = var58[var16] * var18 + var17 * var55[var16] >> 12;
                      var8[var16] = var59[var16] * var18 + var17 * var56[var16] >> 12;
                      var9[var16] = var60[var16] * var18 + var17 * var57[var16] >> 12;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var58 = var53[0];
                  var7[var16] = var58[var16];
                  var8[var16] = var59[var16];
                  var9[var16] = var60[var16];
                  break L3;
                }
                var16++;
                if (var19 == 0) {
                  continue L2;
                } else {
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var20;
    }

    public gj() {
        super(3, false);
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        L0: {
          L1: {
            var9 = Vertigo2.field_L ? 1 : 0;
            var10 = ((gj) this).field_x.a(param0, (byte) -59);
            var3 = var10;
            if (((gj) this).field_x.field_i) {
              var21 = ((gj) this).a(0, -1, param0);
              var22 = ((gj) this).a(1, -1, param0);
              var20 = ((gj) this).a(2, -1, param0);
              var7 = 0;
              L2: while (true) {
                if (~we.field_M >= ~var7) {
                  break L1;
                } else {
                  var8 = var20[var7];
                  stackOut_4_0 = -4097;
                  stackOut_4_1 = ~var8;
                  stackIn_14_0 = stackOut_4_0;
                  stackIn_14_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var9 != 0) {
                    break L0;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_5_0 == stackIn_5_1) {
                          break L4;
                        } else {
                          L5: {
                            if (var8 == 0) {
                              break L5;
                            } else {
                              var10[var7] = var21[var7] * var8 - -((-var8 + 4096) * var22[var7]) >> 12;
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var10 = var3;
                          var10[var7] = var22[var7];
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var10 = var3;
                      var10[var7] = var21[var7];
                      break L3;
                    }
                    var7++;
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_13_0 = param1;
          stackOut_13_1 = 91;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          break L0;
        }
        L6: {
          if (stackIn_14_0 >= stackIn_14_1) {
            break L6;
          } else {
            int[] discarded$2 = ((gj) this).c(-97, -12);
            break L6;
          }
        }
        return var10;
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        L0: {
          am.field_n = 5;
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
        RuntimeException var5 = null;
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
        int var17_int = 0;
        nj var17 = null;
        Object var18 = null;
        bs var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        cr var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        cr var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        cr stackIn_19_0 = null;
        cr stackIn_20_0 = null;
        cr stackIn_21_0 = null;
        cr stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_108_0 = false;
        int stackIn_126_0 = 0;
        boolean stackIn_136_0 = false;
        boolean stackIn_153_0 = false;
        int stackIn_160_0 = 0;
        cr stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        cr stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        cr stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        cr stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        cr stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        int stackIn_179_2 = 0;
        cr stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        cr stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        cr stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        cr stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        cr stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        int stackIn_184_2 = 0;
        cr stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        cr stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        cr stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        cr stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        cr stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        int stackIn_189_2 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        cr stackOut_18_0 = null;
        cr stackOut_19_0 = null;
        cr stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        cr stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_68_0 = 0;
        boolean stackOut_107_0 = false;
        int stackOut_125_0 = 0;
        boolean stackOut_135_0 = false;
        boolean stackOut_152_0 = false;
        int stackOut_159_0 = 0;
        cr stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        cr stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        cr stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        cr stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        int stackOut_177_2 = 0;
        cr stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        int stackOut_178_2 = 0;
        cr stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        cr stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        cr stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        cr stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        int stackOut_182_2 = 0;
        cr stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        int stackOut_183_2 = 0;
        cr stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        cr stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        cr stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        cr stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        cr stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        int stackOut_188_2 = 0;
        var18 = null;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              hq.b(mp.field_b, -127);
              if (null != gd.field_j) {
                L2: {
                  L3: {
                    ne.field_G.field_lb = true;
                    var22 = fo.field_f;
                    var27 = var22;
                    fo.field_f.field_db = 0;
                    var27.field_Fb = 0;
                    hd.field_g.field_db = 0;
                    var6 = hd.field_g;
                    var6.field_Fb = 0;
                    kk.field_f.field_db = 0;
                    var7 = kk.field_f;
                    var7.field_Fb = 0;
                    if (cn.b(false)) {
                      break L3;
                    } else {
                      var9_ref_String = gd.field_j.field_Nb;
                      ud.field_x.field_S = Vertigo2.a(new String[1], ie.field_Rb, 20).toUpperCase();
                      kk.field_f.a(88, lb.field_c.field_Fb, 40, -40 + lb.field_c.field_db, 0);
                      kk.field_f.field_S = Vertigo2.a(new String[1], od.field_Ob, 78);
                      var8 = kk.field_f;
                      if (var19 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      ud.field_x.field_S = fq.field_a.toUpperCase();
                      var9 = (2 + lb.field_c.field_Fb) / 2;
                      fo.field_f.a(93, var9 - 2, 40, lb.field_c.field_db - 40, 0);
                      if (~gd.field_j.field_uc >= ~gd.field_j.field_Qb) {
                        break L5;
                      } else {
                        fo.field_f.field_S = eh.field_g.toUpperCase();
                        fo.field_f.field_lb = true;
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    fo.field_f.field_S = fg.field_db.toUpperCase();
                    fo.field_f.field_lb = false;
                    break L4;
                  }
                  L6: {
                    fo.field_f.field_Bb = fb.field_u.field_Bb;
                    if (kk.field_j <= 0) {
                      break L6;
                    } else {
                      L7: {
                        L8: {
                          if (1 != kk.field_j) {
                            break L8;
                          } else {
                            var10_ref_String = e.field_l;
                            if (var19 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10_ref_String = Vertigo2.a(new String[1], uo.field_c, 111);
                        break L7;
                      }
                      L9: {
                        if (0 != (lo.field_d & 16)) {
                          break L9;
                        } else {
                          if (!im.field_g) {
                            fo.field_f.field_Bb = fb.field_u.field_Q;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      fo.field_f.field_S = fo.field_f.field_S + "<br>" + var10_ref_String;
                      break L6;
                    }
                  }
                  L10: {
                    L11: {
                      hd.field_g.a(82, -var9 + lb.field_c.field_Fb, 40, lb.field_c.field_db - 40, var9);
                      hd.field_g.field_S = gm.field_a.toUpperCase();
                      stackOut_18_0 = hd.field_g;
                      stackIn_21_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (!param0) {
                        break L11;
                      } else {
                        stackOut_19_0 = (cr) (Object) stackIn_19_0;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (r.field_h != 0L) {
                          break L11;
                        } else {
                          stackOut_20_0 = (cr) (Object) stackIn_20_0;
                          stackOut_20_1 = 1;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          break L10;
                        }
                      }
                    }
                    stackOut_21_0 = (cr) (Object) stackIn_21_0;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L10;
                  }
                  L12: {
                    stackIn_22_0.field_lb = stackIn_22_1 != 0;
                    var8 = hd.field_g;
                    var10 = 2;
                    if (gr.field_W == null) {
                      break L12;
                    } else {
                      L13: {
                        if (null == e.field_c) {
                          e.field_c = new byte[ol.field_A];
                          mn.field_t = new boolean[ol.field_A];
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var11_int = 0;
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (~ol.field_A >= ~var11_int) {
                              break L16;
                            } else {
                              mn.field_t[var11_int] = false;
                              var11_int++;
                              if (var19 != 0) {
                                break L15;
                              } else {
                                if (var19 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          var10 = 0;
                          break L15;
                        }
                        L17: while (true) {
                          L18: {
                            L19: {
                              if (2 <= var10) {
                                break L19;
                              } else {
                                var11_int = 0;
                                stackOut_34_0 = 0;
                                stackIn_69_0 = stackOut_34_0;
                                stackIn_35_0 = stackOut_34_0;
                                if (var19 != 0) {
                                  break L18;
                                } else {
                                  var12 = stackIn_35_0;
                                  L20: while (true) {
                                    stackOut_36_0 = gr.field_W.length;
                                    stackOut_36_1 = var12;
                                    stackIn_37_0 = stackOut_36_0;
                                    stackIn_37_1 = stackOut_36_1;
                                    L21: while (true) {
                                      L22: {
                                        L23: {
                                          if (stackIn_37_0 <= stackIn_37_1) {
                                            break L23;
                                          } else {
                                            var29 = gr.field_W[var12];
                                            var28 = var29;
                                            var26 = var28;
                                            var23 = var26;
                                            var20 = var23;
                                            var13_array = var20;
                                            stackOut_38_0 = 0;
                                            stackIn_63_0 = stackOut_38_0;
                                            stackIn_39_0 = stackOut_38_0;
                                            if (var19 != 0) {
                                              break L22;
                                            } else {
                                              var14_int = stackIn_39_0;
                                              L24: while (true) {
                                                L25: {
                                                  L26: {
                                                    L27: {
                                                      if (~var29.length >= ~var14_int) {
                                                        break L27;
                                                      } else {
                                                        var15 = var29[var14_int];
                                                        var16 = var20[var14_int + 1];
                                                        stackOut_41_0 = var15;
                                                        stackOut_41_1 = -1;
                                                        stackIn_55_0 = stackOut_41_0;
                                                        stackIn_55_1 = stackOut_41_1;
                                                        stackIn_42_0 = stackOut_41_0;
                                                        stackIn_42_1 = stackOut_41_1;
                                                        if (var19 != 0) {
                                                          break L26;
                                                        } else {
                                                          L28: {
                                                            if (stackIn_42_0 == stackIn_42_1) {
                                                              L29: {
                                                                if (var10 == 0) {
                                                                  stackOut_47_0 = gd.field_j.field_uc;
                                                                  stackIn_48_0 = stackOut_47_0;
                                                                  break L29;
                                                                } else {
                                                                  stackOut_46_0 = gd.field_j.field_Qb;
                                                                  stackIn_48_0 = stackOut_46_0;
                                                                  break L29;
                                                                }
                                                              }
                                                              var17_int = stackIn_48_0;
                                                              if (var16 == var17_int) {
                                                                break L28;
                                                              } else {
                                                                if (var19 == 0) {
                                                                  break L25;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            } else {
                                                              if ((255 & gd.field_j.field_fc[var15]) != var16) {
                                                                break L25;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          var14_int += 2;
                                                          if (var19 == 0) {
                                                            continue L24;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var11_int = 1;
                                                    var14_int = -1;
                                                    var15 = 0;
                                                    stackOut_54_0 = var15;
                                                    stackOut_54_1 = var29.length;
                                                    stackIn_55_0 = stackOut_54_0;
                                                    stackIn_55_1 = stackOut_54_1;
                                                    break L26;
                                                  }
                                                  L30: while (true) {
                                                    L31: {
                                                      if (stackIn_55_0 >= stackIn_55_1) {
                                                        break L31;
                                                      } else {
                                                        var16 = var29[var15];
                                                        stackOut_56_0 = var16;
                                                        stackOut_56_1 = var14_int;
                                                        stackIn_37_0 = stackOut_56_0;
                                                        stackIn_37_1 = stackOut_56_1;
                                                        stackIn_57_0 = stackOut_56_0;
                                                        stackIn_57_1 = stackOut_56_1;
                                                        if (var19 != 0) {
                                                          continue L21;
                                                        } else {
                                                          L32: {
                                                            if (stackIn_57_0 <= stackIn_57_1) {
                                                              break L32;
                                                            } else {
                                                              var14_int = var16;
                                                              break L32;
                                                            }
                                                          }
                                                          var15 += 2;
                                                          if (var19 == 0) {
                                                            stackOut_54_0 = var15;
                                                            stackOut_54_1 = var29.length;
                                                            stackIn_55_0 = stackOut_54_0;
                                                            stackIn_55_1 = stackOut_54_1;
                                                            continue L30;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    mn.field_t[var14_int] = true;
                                                    break L25;
                                                  }
                                                }
                                                var12++;
                                                if (var19 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_62_0 = var11_int;
                                        stackIn_63_0 = stackOut_62_0;
                                        break L22;
                                      }
                                      L33: {
                                        if (stackIn_63_0 == 0) {
                                          break L33;
                                        } else {
                                          if (var19 == 0) {
                                            break L19;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                      var10++;
                                      if (var19 == 0) {
                                        continue L17;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_68_0 = 2;
                            stackIn_69_0 = stackOut_68_0;
                            break L18;
                          }
                          if (stackIn_69_0 > fn.field_z) {
                            break L12;
                          } else {
                            if (!cr.field_eb[12]) {
                              break L12;
                            } else {
                              var10 = 2;
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                  L34: {
                    L35: {
                      L36: {
                        if (var10 < 2) {
                          break L36;
                        } else {
                          L37: {
                            if (sf.field_f != null) {
                              break L37;
                            } else {
                              if (te.field_D != null) {
                                break L37;
                              } else {
                                if (qh.field_e != null) {
                                  break L37;
                                } else {
                                  if (null != il.field_b) {
                                    break L37;
                                  } else {
                                    break L2;
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
                          L38: while (true) {
                            L39: {
                              L40: {
                                if (var16 >= ol.field_A) {
                                  break L40;
                                } else {
                                  var17_int = 255 & gd.field_j.field_fc[var16];
                                  if (var19 != 0) {
                                    break L39;
                                  } else {
                                    L41: {
                                      if (sf.field_f == null) {
                                        break L41;
                                      } else {
                                        if (sf.field_f[var16] == null) {
                                          break L41;
                                        } else {
                                          if (sf.field_f[var16][var17_int]) {
                                            var11_int = 1;
                                            break L41;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    L42: {
                                      if (null == te.field_D) {
                                        break L42;
                                      } else {
                                        if (te.field_D[var16] == null) {
                                          break L42;
                                        } else {
                                          L43: {
                                            var18_int = te.field_D[var16][var17_int];
                                            if (~var13_int <= ~var18_int) {
                                              break L43;
                                            } else {
                                              var13_int = var18_int;
                                              break L43;
                                            }
                                          }
                                          if (var18_int == 0) {
                                            break L42;
                                          } else {
                                            if (vb.field_g) {
                                              break L42;
                                            } else {
                                              var11_int = 1;
                                              break L42;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L44: {
                                      if (il.field_b == null) {
                                        break L44;
                                      } else {
                                        if (null == il.field_b[var16]) {
                                          break L44;
                                        } else {
                                          var15 = var15 | il.field_b[var16][var17_int];
                                          break L44;
                                        }
                                      }
                                    }
                                    L45: {
                                      if (null == qh.field_e) {
                                        break L45;
                                      } else {
                                        if (null == qh.field_e[var16]) {
                                          break L45;
                                        } else {
                                          L46: {
                                            var18_int = qh.field_e[var16][var17_int];
                                            if (var18_int == 0) {
                                              break L46;
                                            } else {
                                              if (vb.field_g) {
                                                break L46;
                                              } else {
                                                var11_int = 1;
                                                break L46;
                                              }
                                            }
                                          }
                                          if (~var14_int <= ~var18_int) {
                                            break L45;
                                          } else {
                                            var14_int = var18_int;
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    var16++;
                                    if (var19 == 0) {
                                      continue L38;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                              }
                              var16 = 0;
                              break L39;
                            }
                            var17 = vd.field_d.field_Nb.field_M;
                            var18_ref = (bs) (Object) var17.a((byte) 100);
                            L47: while (true) {
                              L48: {
                                L49: {
                                  if (var18_ref == null) {
                                    break L49;
                                  } else {
                                    stackOut_107_0 = var18_ref.k(param3 + 15);
                                    stackIn_126_0 = stackOut_107_0 ? 1 : 0;
                                    stackIn_108_0 = stackOut_107_0;
                                    if (var19 != 0) {
                                      break L48;
                                    } else {
                                      L50: {
                                        L51: {
                                          if (!stackIn_108_0) {
                                            break L51;
                                          } else {
                                            if (var19 == 0) {
                                              break L50;
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                        L52: {
                                          if (var11_int == 0) {
                                            break L52;
                                          } else {
                                            if (var18_ref.field_Zb) {
                                              break L52;
                                            } else {
                                              var16 = 1;
                                              if (var19 == 0) {
                                                break L49;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                        }
                                        L53: {
                                          if (~var18_ref.field_Rb > ~var13_int) {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L49;
                                            } else {
                                              break L53;
                                            }
                                          } else {
                                            break L53;
                                          }
                                        }
                                        L54: {
                                          if (~var18_ref.field_Mb > ~var14_int) {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L49;
                                            } else {
                                              break L54;
                                            }
                                          } else {
                                            break L54;
                                          }
                                        }
                                        L55: {
                                          if ((var15 & ~var18_ref.field_Kb) <= 0) {
                                            break L55;
                                          } else {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L49;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        if (var12 == 0) {
                                          break L50;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L49;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                      var18_ref = (bs) (Object) var17.b(35);
                                      if (var19 == 0) {
                                        continue L47;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                }
                                stackOut_125_0 = fn.field_z;
                                stackIn_126_0 = stackOut_125_0;
                                break L48;
                              }
                              L56: {
                                if (stackIn_126_0 < 2) {
                                  break L56;
                                } else {
                                  if (cr.field_eb[12]) {
                                    var16 = 0;
                                    break L56;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                              L57: {
                                if (var16 != 0) {
                                  break L57;
                                } else {
                                  if (var19 == 0) {
                                    break L2;
                                  } else {
                                    hd.field_g.field_lb = false;
                                    if (!hd.field_g.field_G) {
                                      break L2;
                                    } else {
                                      var11 = null;
                                      var12 = 0;
                                      var13_int = 0;
                                      L58: while (true) {
                                        if (~var13_int <= ~ol.field_A) {
                                          break L35;
                                        } else {
                                          stackOut_135_0 = mn.field_t[var13_int];
                                          stackIn_160_0 = stackOut_135_0 ? 1 : 0;
                                          stackIn_136_0 = stackOut_135_0;
                                          if (var19 != 0) {
                                            break L34;
                                          } else {
                                            L59: {
                                              if (stackIn_136_0) {
                                                L60: {
                                                  var24 = "<col=A00000>" + md.field_C[var13_int] + "</col>";
                                                  if (var11 == null) {
                                                    break L60;
                                                  } else {
                                                    var12 = 1;
                                                    var11 = (Object) (Object) (var11 + ", " + var24);
                                                    if (var19 == 0) {
                                                      break L59;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                }
                                                var11 = (Object) (Object) var24;
                                                break L59;
                                              } else {
                                                break L59;
                                              }
                                            }
                                            var13_int++;
                                            if (var19 == 0) {
                                              continue L58;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L61: {
                                hd.field_g.field_lb = false;
                                if (hd.field_g.field_G) {
                                  L62: {
                                    if (el.field_e.field_b.field_Kb == 0) {
                                      break L62;
                                    } else {
                                      ko.field_S = Vertigo2.a(new String[1], pb.field_e, param3 ^ -117);
                                      if (var19 == 0) {
                                        break L61;
                                      } else {
                                        break L62;
                                      }
                                    }
                                  }
                                  ko.field_S = di.field_y;
                                  break L61;
                                } else {
                                  break L61;
                                }
                              }
                              if (var19 == 0) {
                                break L2;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                      }
                      hd.field_g.field_lb = false;
                      if (!hd.field_g.field_G) {
                        break L2;
                      } else {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L63: while (true) {
                          if (~var13_int <= ~ol.field_A) {
                            break L35;
                          } else {
                            stackOut_152_0 = mn.field_t[var13_int];
                            stackIn_160_0 = stackOut_152_0 ? 1 : 0;
                            stackIn_153_0 = stackOut_152_0;
                            if (var19 != 0) {
                              break L34;
                            } else {
                              L64: {
                                if (stackIn_153_0) {
                                  L65: {
                                    var25 = "<col=A00000>" + md.field_C[var13_int] + "</col>";
                                    if (var11 == null) {
                                      break L65;
                                    } else {
                                      var12 = 1;
                                      var11 = (Object) (Object) (var11 + ", " + var25);
                                      if (var19 == 0) {
                                        break L64;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                  var11 = (Object) (Object) var25;
                                  break L64;
                                } else {
                                  break L64;
                                }
                              }
                              var13_int++;
                              if (var19 == 0) {
                                continue L63;
                              } else {
                                break L35;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_159_0 = -1;
                    stackIn_160_0 = stackOut_159_0;
                    break L34;
                  }
                  L66: {
                    if (stackIn_160_0 != ~var10) {
                      L67: {
                        var13 = lo.field_a;
                        if (var12 == 0) {
                          break L67;
                        } else {
                          var14 = ni.field_e + var11;
                          if (var19 == 0) {
                            break L66;
                          } else {
                            break L67;
                          }
                        }
                      }
                      var14 = Vertigo2.a(new String[1], eg.field_q, -123);
                      break L66;
                    } else {
                      L68: {
                        var13 = rn.field_y;
                        if (var12 != 0) {
                          break L68;
                        } else {
                          var14 = Vertigo2.a(new String[1], fa.field_t, 14);
                          if (var19 == 0) {
                            break L66;
                          } else {
                            break L68;
                          }
                        }
                      }
                      var14 = ia.field_H + var11;
                      break L66;
                    }
                  }
                  ko.field_S = "<col=A00000>" + var13 + "<br>" + var14;
                  break L2;
                }
                L69: {
                  if (r.field_h == 0L) {
                    break L69;
                  } else {
                    L70: {
                      var9 = (int)(r.field_h + -gk.a(param3 + 108));
                      var9 = (var9 + 999) / 1000;
                      if (var9 < 1) {
                        var9 = 1;
                        break L70;
                      } else {
                        break L70;
                      }
                    }
                    var8.field_S = Vertigo2.a(new String[1], me.field_a, param3 ^ 89);
                    break L69;
                  }
                }
                nb.field_D.field_S = Vertigo2.a(new String[2], nq.field_I, 9);
                break L1;
              } else {
                break L1;
              }
            }
            L71: {
              L72: {
                stackOut_174_0 = hk.field_o;
                stackOut_174_1 = 0;
                stackIn_178_0 = stackOut_174_0;
                stackIn_178_1 = stackOut_174_1;
                stackIn_175_0 = stackOut_174_0;
                stackIn_175_1 = stackOut_174_1;
                if (!param4) {
                  break L72;
                } else {
                  stackOut_175_0 = (cr) (Object) stackIn_175_0;
                  stackOut_175_1 = stackIn_175_1;
                  stackIn_178_0 = stackOut_175_0;
                  stackIn_178_1 = stackOut_175_1;
                  stackIn_176_0 = stackOut_175_0;
                  stackIn_176_1 = stackOut_175_1;
                  if (param2) {
                    break L72;
                  } else {
                    stackOut_176_0 = (cr) (Object) stackIn_176_0;
                    stackOut_176_1 = stackIn_176_1;
                    stackIn_178_0 = stackOut_176_0;
                    stackIn_178_1 = stackOut_176_1;
                    stackIn_177_0 = stackOut_176_0;
                    stackIn_177_1 = stackOut_176_1;
                    if (im.field_g) {
                      break L72;
                    } else {
                      stackOut_177_0 = (cr) (Object) stackIn_177_0;
                      stackOut_177_1 = stackIn_177_1;
                      stackOut_177_2 = 1;
                      stackIn_179_0 = stackOut_177_0;
                      stackIn_179_1 = stackOut_177_1;
                      stackIn_179_2 = stackOut_177_2;
                      break L71;
                    }
                  }
                }
              }
              stackOut_178_0 = (cr) (Object) stackIn_178_0;
              stackOut_178_1 = stackIn_178_1;
              stackOut_178_2 = 0;
              stackIn_179_0 = stackOut_178_0;
              stackIn_179_1 = stackOut_178_1;
              stackIn_179_2 = stackOut_178_2;
              break L71;
            }
            L73: {
              L74: {
                ((cr) (Object) stackIn_179_0).a(stackIn_179_1, stackIn_179_2 != 0);
                stackOut_179_0 = lb.field_c;
                stackOut_179_1 = 0;
                stackIn_183_0 = stackOut_179_0;
                stackIn_183_1 = stackOut_179_1;
                stackIn_180_0 = stackOut_179_0;
                stackIn_180_1 = stackOut_179_1;
                if (!param4) {
                  break L74;
                } else {
                  stackOut_180_0 = (cr) (Object) stackIn_180_0;
                  stackOut_180_1 = stackIn_180_1;
                  stackIn_183_0 = stackOut_180_0;
                  stackIn_183_1 = stackOut_180_1;
                  stackIn_181_0 = stackOut_180_0;
                  stackIn_181_1 = stackOut_180_1;
                  if (param2) {
                    break L74;
                  } else {
                    stackOut_181_0 = (cr) (Object) stackIn_181_0;
                    stackOut_181_1 = stackIn_181_1;
                    stackIn_183_0 = stackOut_181_0;
                    stackIn_183_1 = stackOut_181_1;
                    stackIn_182_0 = stackOut_181_0;
                    stackIn_182_1 = stackOut_181_1;
                    if (im.field_g) {
                      break L74;
                    } else {
                      stackOut_182_0 = (cr) (Object) stackIn_182_0;
                      stackOut_182_1 = stackIn_182_1;
                      stackOut_182_2 = 1;
                      stackIn_184_0 = stackOut_182_0;
                      stackIn_184_1 = stackOut_182_1;
                      stackIn_184_2 = stackOut_182_2;
                      break L73;
                    }
                  }
                }
              }
              stackOut_183_0 = (cr) (Object) stackIn_183_0;
              stackOut_183_1 = stackIn_183_1;
              stackOut_183_2 = 0;
              stackIn_184_0 = stackOut_183_0;
              stackIn_184_1 = stackOut_183_1;
              stackIn_184_2 = stackOut_183_2;
              break L73;
            }
            L75: {
              L76: {
                ((cr) (Object) stackIn_184_0).a(stackIn_184_1, stackIn_184_2 != 0);
                stackOut_184_0 = wc.field_m;
                stackOut_184_1 = param3;
                stackIn_188_0 = stackOut_184_0;
                stackIn_188_1 = stackOut_184_1;
                stackIn_185_0 = stackOut_184_0;
                stackIn_185_1 = stackOut_184_1;
                if (!param4) {
                  break L76;
                } else {
                  stackOut_185_0 = (cr) (Object) stackIn_185_0;
                  stackOut_185_1 = stackIn_185_1;
                  stackIn_188_0 = stackOut_185_0;
                  stackIn_188_1 = stackOut_185_1;
                  stackIn_186_0 = stackOut_185_0;
                  stackIn_186_1 = stackOut_185_1;
                  if (param2) {
                    break L76;
                  } else {
                    stackOut_186_0 = (cr) (Object) stackIn_186_0;
                    stackOut_186_1 = stackIn_186_1;
                    stackIn_188_0 = stackOut_186_0;
                    stackIn_188_1 = stackOut_186_1;
                    stackIn_187_0 = stackOut_186_0;
                    stackIn_187_1 = stackOut_186_1;
                    if (!im.field_g) {
                      break L76;
                    } else {
                      stackOut_187_0 = (cr) (Object) stackIn_187_0;
                      stackOut_187_1 = stackIn_187_1;
                      stackOut_187_2 = 1;
                      stackIn_189_0 = stackOut_187_0;
                      stackIn_189_1 = stackOut_187_1;
                      stackIn_189_2 = stackOut_187_2;
                      break L75;
                    }
                  }
                }
              }
              stackOut_188_0 = (cr) (Object) stackIn_188_0;
              stackOut_188_1 = stackIn_188_1;
              stackOut_188_2 = 0;
              stackIn_189_0 = stackOut_188_0;
              stackIn_189_1 = stackOut_188_1;
              stackIn_189_2 = stackOut_188_2;
              break L75;
            }
            L77: {
              ((cr) (Object) stackIn_189_0).a(stackIn_189_1, stackIn_189_2 != 0);
              el.field_e.field_b.k(0);
              if (gd.field_j == null) {
                break L77;
              } else {
                L78: {
                  if (ne.field_G.field_tb == 0) {
                    break L78;
                  } else {
                    qk.d(gd.field_j.a((byte) -38), param1, 18964);
                    break L78;
                  }
                }
                L79: {
                  if (hd.field_g.field_tb == 0) {
                    break L79;
                  } else {
                    na.field_p = true;
                    break L79;
                  }
                }
                L80: {
                  if (fo.field_f.field_tb != 0) {
                    im.field_g = true;
                    break L80;
                  } else {
                    break L80;
                  }
                }
                L81: {
                  if (Vertigo2.field_M.field_tb != 0) {
                    im.field_g = false;
                    break L81;
                  } else {
                    break L81;
                  }
                }
                mg.a(false, param1, false, gd.field_j);
                break L77;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "gj.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
        gj.b((byte) -14);
        field_z = null;
    }

    static {
    }
}
