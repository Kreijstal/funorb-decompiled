/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends mf {
    static int[] field_y;
    static String field_C;
    static int field_z;
    static String field_A;
    static int field_x;
    static String field_D;
    static int field_B;

    final static void a(int param0, rb param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        je var10 = null;
        Object var11 = null;
        int var11_int = 0;
        gd var12 = null;
        int var13 = 0;
        hl var14 = null;
        hl var15 = null;
        hl var16 = null;
        hl var17 = null;
        hl var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        int var23_int = 0;
        String var24 = null;
        int var24_int = 0;
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        rb stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        boolean stackIn_35_4 = false;
        rb stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        boolean stackIn_36_4 = false;
        rb stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        boolean stackIn_37_4 = false;
        int stackIn_37_5 = 0;
        int stackIn_40_0 = 0;
        int stackIn_53_0 = 0;
        hl stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        hl stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        hl stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        rb stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        boolean stackOut_34_4 = false;
        rb stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        boolean stackOut_36_4 = false;
        int stackOut_36_5 = 0;
        rb stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        boolean stackOut_35_4 = false;
        int stackOut_35_5 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        hl stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        hl stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        hl stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        L0: {
          var31 = TetraLink.field_J;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (qb.field_N == null) {
            break L0;
          } else {
            L1: {
              if (ba.field_S != null) {
                break L1;
              } else {
                if (null != a.field_g) {
                  break L1;
                } else {
                  if (null != bi.field_e) {
                    break L1;
                  } else {
                    if (null == ti.field_f) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (~var9 <= ~hg.field_k) {
                break L0;
              } else {
                L3: {
                  var10_int = 255 & qb.field_N.field_sc[var9];
                  if (ba.field_S == null) {
                    break L3;
                  } else {
                    if (null != ba.field_S[var9]) {
                      if (!ba.field_S[var9][var10_int]) {
                        break L3;
                      } else {
                        var5_int = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == a.field_g) {
                    break L4;
                  } else {
                    if (null == a.field_g[var9]) {
                      break L4;
                    } else {
                      L5: {
                        var11_int = a.field_g[var9][var10_int];
                        if (var11_int == 0) {
                          break L5;
                        } else {
                          if (oa.field_r) {
                            break L5;
                          } else {
                            var5_int = 1;
                            break L5;
                          }
                        }
                      }
                      if (~var6 > ~var11_int) {
                        var6 = var11_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  if (null == bi.field_e) {
                    break L6;
                  } else {
                    if (null == bi.field_e[var9]) {
                      break L6;
                    } else {
                      L7: {
                        var11_int = bi.field_e[var9][var10_int];
                        if (var11_int == 0) {
                          break L7;
                        } else {
                          if (!oa.field_r) {
                            var5_int = 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var11_int > var7) {
                        var7 = var11_int;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L8: {
                  if (null == ti.field_f) {
                    break L8;
                  } else {
                    if (null == ti.field_f[var9]) {
                      break L8;
                    } else {
                      var8 = var8 | ti.field_f[var9][var10_int];
                      break L8;
                    }
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L9: {
          stackOut_34_0 = (rb) param1;
          stackOut_34_1 = 2;
          stackOut_34_2 = (qe.field_d - -2) * 2;
          stackOut_34_3 = -120;
          stackOut_34_4 = param2;
          stackIn_36_0 = stackOut_34_0;
          stackIn_36_1 = stackOut_34_1;
          stackIn_36_2 = stackOut_34_2;
          stackIn_36_3 = stackOut_34_3;
          stackIn_36_4 = stackOut_34_4;
          stackIn_35_0 = stackOut_34_0;
          stackIn_35_1 = stackOut_34_1;
          stackIn_35_2 = stackOut_34_2;
          stackIn_35_3 = stackOut_34_3;
          stackIn_35_4 = stackOut_34_4;
          if (bi.field_d != param1) {
            stackOut_36_0 = (rb) (Object) stackIn_36_0;
            stackOut_36_1 = stackIn_36_1;
            stackOut_36_2 = stackIn_36_2;
            stackOut_36_3 = stackIn_36_3;
            stackOut_36_4 = stackIn_36_4;
            stackOut_36_5 = 0;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            stackIn_37_2 = stackOut_36_2;
            stackIn_37_3 = stackOut_36_3;
            stackIn_37_4 = stackOut_36_4;
            stackIn_37_5 = stackOut_36_5;
            break L9;
          } else {
            stackOut_35_0 = (rb) (Object) stackIn_35_0;
            stackOut_35_1 = stackIn_35_1;
            stackOut_35_2 = stackIn_35_2;
            stackOut_35_3 = stackIn_35_3;
            stackOut_35_4 = stackIn_35_4;
            stackOut_35_5 = 1;
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_37_2 = stackOut_35_2;
            stackIn_37_3 = stackOut_35_3;
            stackIn_37_4 = stackOut_35_4;
            stackIn_37_5 = stackOut_35_5;
            break L9;
          }
        }
        L10: {
          if (((rb) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4, stackIn_37_5 == 0, param0 * (4 * qe.field_d + 8))) {
            stackOut_39_0 = 0;
            stackIn_40_0 = stackOut_39_0;
            break L10;
          } else {
            stackOut_38_0 = 1;
            stackIn_40_0 = stackOut_38_0;
            break L10;
          }
        }
        L11: {
          var9 = stackIn_40_0;
          var10 = param1.field_Pb.field_fb;
          var11 = null;
          if (param3 == -1) {
            break L11;
          } else {
            field_y = null;
            break L11;
          }
        }
        var12 = (gd) (Object) var10.c(false);
        L12: while (true) {
          if (var12 == null) {
            return;
          } else {
            L13: {
              var13 = 0;
              if (null != var12.field_fb) {
                break L13;
              } else {
                L14: {
                  var12.field_Wb = new hl(0L, sk.field_h);
                  var12.a((byte) -121, var12.field_Wb);
                  var12.field_Lb = new hl(0L, ga.field_c);
                  if (!kj.field_b) {
                    break L14;
                  } else {
                    var12.a((byte) 14, var12.field_Lb);
                    break L14;
                  }
                }
                var12.field_Lb.field_xb = 2;
                var12.field_Ob = new hl(0L, bk.field_i);
                var12.a((byte) 103, var12.field_Ob);
                var12.c((byte) 108);
                var12.field_ac = new hl(0L, eo.field_c);
                var12.a((byte) -112, var12.field_ac);
                var12.field_Vb = new hl(0L, wh.field_l);
                var12.a((byte) 44, var12.field_Vb);
                var13 = 1;
                break L13;
              }
            }
            L15: {
              var12.field_Wb.field_jb = null;
              var14 = var12.field_Wb;
              var12.field_Wb.field_R = 0;
              var12.field_Lb.field_jb = null;
              var14.field_Hb = 0;
              var12.field_Lb.field_R = 0;
              var15 = var12.field_Lb;
              var15.field_Hb = 0;
              var12.field_ac.field_jb = null;
              var16 = var12.field_ac;
              var12.field_ac.field_R = 0;
              var12.field_Vb.field_jb = null;
              var16.field_Hb = 0;
              var17 = var12.field_Vb;
              var12.field_Vb.field_R = 0;
              var12.field_Ob.field_jb = null;
              var17.field_Hb = 0;
              var12.field_Ob.field_R = 0;
              var18 = var12.field_Ob;
              var18.field_Hb = 0;
              var12.field_Hb = param1.field_Pb.field_Hb;
              var19 = 0;
              var32 = var12.field_Yb;
              var20 = var32;
              var20 = var32;
              var21 = 72;
              if (param1 != hn.field_Q) {
                break L15;
              } else {
                var21 += 42;
                break L15;
              }
            }
            L16: {
              var33 = jb.a(var12.field_Wb.field_Ib, var32, var21);
              var20 = var33;
              var20 = var33;
              if (var33.equals((Object) (Object) var12.field_Yb)) {
                stackOut_52_0 = 0;
                stackIn_53_0 = stackOut_52_0;
                break L16;
              } else {
                stackOut_51_0 = 1;
                stackIn_53_0 = stackOut_51_0;
                break L16;
              }
            }
            L17: {
              var22 = stackIn_53_0;
              if (var12.field_dc < 4) {
                if (var12.field_dc <= 0) {
                  break L17;
                } else {
                  var20 = "<img=" + (-1 + var12.field_dc) + ">" + var33;
                  break L17;
                }
              } else {
                var20 = "<img=" + (fh.field_h + var12.field_dc - 4) + ">" + var33;
                break L17;
              }
            }
            L18: {
              var12.field_Wb.field_jb = var20;
              if (var12.d((byte) -1)) {
                break L18;
              } else {
                L19: {
                  L20: {
                    L21: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L21;
                      } else {
                        if (!var12.field_Tb) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    if (~var12.field_Pb > ~var6) {
                      break L20;
                    } else {
                      if (var7 > var12.field_Qb) {
                        break L20;
                      } else {
                        if ((~var12.field_Ub & var8) <= 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                  var23_int = 8414771;
                  var24_int = 8421504;
                  break L19;
                }
                L22: {
                  var12.field_ac.field_N = var23_int;
                  var12.field_Lb.field_N = var23_int;
                  var12.field_Wb.field_N = var23_int;
                  var12.field_Wb.field_nb = var24_int;
                  var12.field_Wb.field_ib = var24_int;
                  var12.field_Wb.field_L = var24_int;
                  var12.field_Lb.field_nb = var24_int;
                  var12.field_Lb.field_ib = var24_int;
                  var12.field_Lb.field_L = var24_int;
                  var12.field_ac.field_nb = var24_int;
                  var12.field_ac.field_ib = var24_int;
                  var12.field_ac.field_L = var24_int;
                  if (param1 != v.field_x) {
                    if (var12.field_cc) {
                      var12.field_Wb.field_jb = sk.a(new String[1], bj.field_a, param3 ^ -127);
                      var12.field_Vb.field_jb = rj.field_c;
                      break L22;
                    } else {
                      if (!var12.field_Kb) {
                        var12.field_ac.field_jb = go.field_e;
                        break L22;
                      } else {
                        var12.field_Wb.field_jb = sk.a(new String[1], qh.field_l, 125);
                        var12.field_ac.field_jb = nm.field_A;
                        var12.field_Vb.field_jb = af.field_d;
                        break L22;
                      }
                    }
                  } else {
                    if (!qb.field_N.field_Kb) {
                      var12.field_Vb.field_jb = rm.field_e;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  var25_int = 0;
                  if (null == qb.field_N) {
                    break L23;
                  } else {
                    if (!s.b(63)) {
                      break L23;
                    } else {
                      if (~oj.field_c == ~var12.field_Nb) {
                        break L23;
                      } else {
                        L24: {
                          if (null != var12.field_ac.field_jb) {
                            var26 = var12.field_ac.f(-19) - -(fn.field_Q * 2);
                            var12.field_ac.a((byte) -104, var26, var19, qe.field_d, var25_int);
                            var25_int = var25_int + var26;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        if (var12.field_Vb.field_jb != null) {
                          L25: {
                            if (v.field_x == param1) {
                              var26 = 40;
                              break L25;
                            } else {
                              var26 = var12.field_Vb.f(param3 ^ 63) - -(2 * fn.field_Q);
                              break L25;
                            }
                          }
                          var12.field_Vb.a((byte) -90, var26, var19, qe.field_d, var25_int);
                          var25_int = var25_int + var26;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                }
                L26: {
                  stackOut_87_0 = var12.field_Wb;
                  stackOut_87_1 = -108;
                  stackOut_87_2 = -var25_int;
                  stackIn_89_0 = stackOut_87_0;
                  stackIn_89_1 = stackOut_87_1;
                  stackIn_89_2 = stackOut_87_2;
                  stackIn_88_0 = stackOut_87_0;
                  stackIn_88_1 = stackOut_87_1;
                  stackIn_88_2 = stackOut_87_2;
                  if (kj.field_b) {
                    stackOut_89_0 = (hl) (Object) stackIn_89_0;
                    stackOut_89_1 = stackIn_89_1;
                    stackOut_89_2 = stackIn_89_2;
                    stackOut_89_3 = 42;
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    stackIn_90_2 = stackOut_89_2;
                    stackIn_90_3 = stackOut_89_3;
                    break L26;
                  } else {
                    stackOut_88_0 = (hl) (Object) stackIn_88_0;
                    stackOut_88_1 = stackIn_88_1;
                    stackOut_88_2 = stackIn_88_2;
                    stackOut_88_3 = 0;
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_90_1 = stackOut_88_1;
                    stackIn_90_2 = stackOut_88_2;
                    stackIn_90_3 = stackOut_88_3;
                    break L26;
                  }
                }
                L27: {
                  ((hl) (Object) stackIn_90_0).a((byte) stackIn_90_1, stackIn_90_2 + -stackIn_90_3 + var12.field_Hb, var19, qe.field_d, var25_int);
                  var12.field_Lb.field_jb = Integer.toString(var12.field_Pb);
                  var12.field_Lb.a((byte) -123, 40, var19, qe.field_d, -40 + var12.field_Hb);
                  var19 = var19 + qe.field_d;
                  if (!var12.field_Wb.field_Y) {
                    break L27;
                  } else {
                    if (var22 != 0) {
                      re.field_P = var12.field_Yb;
                      if (null == cb.field_v) {
                        break L18;
                      } else {
                        if (cb.field_v[var12.field_dc] == null) {
                          break L18;
                        } else {
                          re.field_P = re.field_P + " - " + cb.field_v[var12.field_dc];
                          break L18;
                        }
                      }
                    } else {
                      break L27;
                    }
                  }
                }
                if (!var12.field_Wb.field_Y) {
                  break L18;
                } else {
                  if (cb.field_v == null) {
                    break L18;
                  } else {
                    if (cb.field_v[var12.field_dc] == null) {
                      break L18;
                    } else {
                      re.field_P = cb.field_v[var12.field_dc];
                      break L18;
                    }
                  }
                }
              }
            }
            L28: {
              var23 = af.a((byte) 126, var12.field_Xb, var20);
              var24 = var23;
              var30 = var24;
              var25 = var30;
              var24 = var23;
              if (var23 != null) {
                var24_int = var12.field_Ob.field_Ib.c(var23, -fn.field_Q + -fn.field_Q + var12.field_Hb);
                var12.field_Ob.field_K = var12.field_Sb * 256 / u.field_a;
                var12.field_Ob.field_jb = var23;
                var12.field_Ob.a((byte) -80, var12.field_Hb + -(fn.field_Q * 2), var19, var24_int * qe.field_d, fn.field_Q);
                var19 = var19 + var24_int * qe.field_d;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (var9 != 0) {
                break L29;
              } else {
                var12.field_mb = -var12.field_R + var19;
                break L29;
              }
            }
            L30: {
              if (var13 == 0) {
                break L30;
              } else {
                param1.field_Pb.a((hl) var11, true, (hl) (Object) var12, 2);
                break L30;
              }
            }
            L31: {
              if (var12.field_F == 0) {
                break L31;
              } else {
                if (var12.d((byte) -1)) {
                  break L31;
                } else {
                  if (var12.field_ac.field_F == 0) {
                    if (var12.field_Vb.field_F != 0) {
                      qe.a(-122, param4, var12.field_Nb);
                      break L31;
                    } else {
                      qh.a(var12, field_B, 0, -66, li.field_o, 0, param1);
                      break L31;
                    }
                  } else {
                    q.a(param4, (byte) -118, var12.field_Nb);
                    break L31;
                  }
                }
              }
            }
            L32: {
              var11 = (Object) (Object) var12;
              if (!var12.field_rb) {
                break L32;
              } else {
                if (!var12.d((byte) -1)) {
                  L33: {
                    var24 = null;
                    if (var12.field_Nb != oj.field_c) {
                      L34: {
                        if (var5_int == 0) {
                          break L34;
                        } else {
                          if (var12.field_Tb) {
                            break L34;
                          } else {
                            var24 = sk.a(new String[1], lh.field_w, 124);
                            break L33;
                          }
                        }
                      }
                      if (~var7 < ~var12.field_Qb) {
                        L35: {
                          var25_int = var7 + -var12.field_Qb;
                          if (var25_int != 1) {
                            break L35;
                          } else {
                            var24 = sk.a(new String[1], k.field_b, 121);
                            break L35;
                          }
                        }
                        var24 = sk.a(new String[2], field_C, 123);
                        var30 = var24;
                        var25 = var30;
                        var24 = var25;
                        var30 = var24;
                        var25 = var30;
                        break L33;
                      } else {
                        if (~var6 >= ~var12.field_Pb) {
                          if ((~var12.field_Ub & var8) == 0) {
                            break L33;
                          } else {
                            L36: {
                              var25_int = fa.a(var8 & ~var12.field_Ub, -24338);
                              var24 = sk.a(new String[1], o.field_o, param3 + 123);
                              if (0 >= var25_int) {
                                break L36;
                              } else {
                                if (null == pd.field_t) {
                                  break L36;
                                } else {
                                  if (~pd.field_t.length > ~var25_int) {
                                    break L36;
                                  } else {
                                    if (null == pd.field_t[-1 + var25_int]) {
                                      break L36;
                                    } else {
                                      var24 = sk.a(new String[1], pd.field_t[var25_int + -1][2], param3 + 127);
                                      break L36;
                                    }
                                  }
                                }
                              }
                            }
                            break L33;
                          }
                        } else {
                          var24 = sk.a(new String[2], tl.field_Y, 121);
                          break L33;
                        }
                      }
                    } else {
                      L37: {
                        if (var5_int == 0) {
                          break L37;
                        } else {
                          if (!var12.field_Tb) {
                            var24 = pi.field_b;
                            break L33;
                          } else {
                            break L37;
                          }
                        }
                      }
                      if (var12.field_Qb < var7) {
                        L38: {
                          var25_int = var7 + -var12.field_Qb;
                          if (1 == var25_int) {
                            var24 = sn.field_d;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        var24 = sk.a(new String[2], tk.field_d, 124);
                        break L33;
                      } else {
                        if (var12.field_Pb >= var6) {
                          if ((var8 & ~var12.field_Ub) != 0) {
                            L39: {
                              var25_int = fa.a(~var12.field_Ub & var8, param3 ^ 24337);
                              var24 = jo.field_b;
                              if (var25_int <= 0) {
                                break L39;
                              } else {
                                if (null == pd.field_t) {
                                  break L39;
                                } else {
                                  if (~pd.field_t.length > ~var25_int) {
                                    break L39;
                                  } else {
                                    if (null != pd.field_t[-1 + var25_int]) {
                                      var24 = pd.field_t[var25_int - 1][1];
                                      break L39;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                              }
                            }
                            break L33;
                          } else {
                            break L33;
                          }
                        } else {
                          var24 = sk.a(new String[2], ae.field_M, 121);
                          break L33;
                        }
                      }
                    }
                  }
                  if (var24 != null) {
                    var34 = "<col=A00000>" + var24;
                    var30 = var34;
                    var25 = var30;
                    var24 = var25;
                    var30 = var34;
                    var25 = var30;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L40: while (true) {
                      if (~var27_int <= ~hg.field_k) {
                        L41: {
                          L42: {
                            if (param1 != v.field_x) {
                              break L42;
                            } else {
                              if (!s.b(63)) {
                                break L42;
                              } else {
                                if (var26 == 0) {
                                  var24 = var34 + "<br>" + sk.a(new String[1], tl.field_O, 123);
                                  break L41;
                                } else {
                                  var24 = var34 + "<br>" + t.field_p + var25;
                                  break L41;
                                }
                              }
                            }
                          }
                          if (var26 != 0) {
                            var24 = var34 + "<br>" + ve.field_f + var25;
                            break L41;
                          } else {
                            var24 = var34 + "<br>" + sk.a(new String[1], qk.field_c, 126);
                            break L41;
                          }
                        }
                        L43: {
                          if (param1 != v.field_x) {
                            break L43;
                          } else {
                            if (s.b(63)) {
                              break L43;
                            } else {
                              var27 = qb.field_N.field_ec;
                              var24 = var24 + "<br>" + sk.a(new String[1], vd.field_i, 126);
                              break L43;
                            }
                          }
                        }
                        re.field_P = var24;
                        break L32;
                      } else {
                        L44: {
                          var28 = 255 & qb.field_N.field_sc[var27_int];
                          var29 = 0;
                          if (ba.field_S == null) {
                            break L44;
                          } else {
                            if (ba.field_S[var27_int] != null) {
                              if (!ba.field_S[var27_int][var28]) {
                                break L44;
                              } else {
                                if (var12.field_Tb) {
                                  break L44;
                                } else {
                                  var29 = 1;
                                  break L44;
                                }
                              }
                            } else {
                              break L44;
                            }
                          }
                        }
                        L45: {
                          if (null == a.field_g) {
                            break L45;
                          } else {
                            if (null == a.field_g[var27_int]) {
                              break L45;
                            } else {
                              L46: {
                                var30_int = a.field_g[var27_int][var28];
                                if (var30_int == 0) {
                                  break L46;
                                } else {
                                  if (oa.field_r) {
                                    break L46;
                                  } else {
                                    if (!var12.field_Tb) {
                                      var29 = 1;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              if (~var12.field_Pb > ~var30_int) {
                                var29 = 1;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                          }
                        }
                        L47: {
                          if (null == bi.field_e) {
                            break L47;
                          } else {
                            if (null != bi.field_e[var27_int]) {
                              L48: {
                                var30_int = bi.field_e[var27_int][var28];
                                if (0 == var30_int) {
                                  break L48;
                                } else {
                                  if (oa.field_r) {
                                    break L48;
                                  } else {
                                    if (var12.field_Tb) {
                                      break L48;
                                    } else {
                                      var29 = 1;
                                      break L48;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Qb >= var30_int) {
                                break L47;
                              } else {
                                var29 = 1;
                                break L47;
                              }
                            } else {
                              break L47;
                            }
                          }
                        }
                        L49: {
                          if (null == ti.field_f) {
                            break L49;
                          } else {
                            if (null == ti.field_f[var27_int]) {
                              break L49;
                            } else {
                              if ((~var12.field_Ub & ti.field_f[var27_int][var28]) != 0) {
                                var29 = 1;
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                          }
                        }
                        L50: {
                          if (var29 == 0) {
                            break L50;
                          } else {
                            var30 = "<col=A00000>" + ll.field_y[var27_int] + "</col>";
                            var25 = var30;
                            var24 = var25;
                            var25 = var30;
                            if (var25 != null) {
                              var26 = 1;
                              var25 = var25 + ", " + var30;
                              var24 = var25;
                              var24 = var25;
                              break L50;
                            } else {
                              var25 = var30;
                              break L50;
                            }
                          }
                        }
                        var27_int++;
                        continue L40;
                      }
                    }
                  } else {
                    break L32;
                  }
                } else {
                  var12 = (gd) (Object) var10.a((byte) -70);
                  continue L12;
                }
              }
            }
            var12 = (gd) (Object) var10.a((byte) -70);
            continue L12;
          }
        }
    }

    private ci(jb param0, int param1) {
        super(param0, param1);
    }

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -14710) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ci.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        L0: {
          var2 = TetraLink.field_J;
          if ((aa.field_bc.field_a.field_h & 1 << aa.field_bc.field_i) != 0) {
            cd.field_c[10] = mh.field_f;
            break L0;
          } else {
            if (0 == aa.field_bc.field_a.field_h) {
              cd.field_c[10] = la.field_f;
              break L0;
            } else {
              cd.field_c[10] = lg.field_O;
              break L0;
            }
          }
        }
        L1: {
          if (param0 > 1) {
            break L1;
          } else {
            field_y = null;
            break L1;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, oh[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (param2 > 0) {
                  var6_int = param4[0].field_t;
                  var7 = param4[2].field_t;
                  var8 = param4[1].field_t;
                  param4[0].e(param3, param1, param0);
                  param4[2].e(-var7 + param2 + param3, param1, param0);
                  ra.a(lj.field_a);
                  ra.b(param3 - -var6_int, param1, param3 + param2 - var7, param1 + param4[1].field_F);
                  var9 = param3 + var6_int;
                  var10 = param3 + (param2 - var7);
                  param3 = var9;
                  L2: while (true) {
                    if (var10 <= param3) {
                      ra.b(lj.field_a);
                      break L0;
                    } else {
                      param4[1].e(param3, param1, param0);
                      param3 = param3 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ci.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + -119 + 41);
        }
    }

    final String c(na param0, int param1) {
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
              if (param1 == 4373) {
                break L1;
              } else {
                ci.c(-69);
                break L1;
              }
            }
            stackOut_2_0 = nl.a((byte) 52, '*', param0.field_A.length());
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ci.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    ci(int param0) {
        this(od.field_S, param0);
    }

    public static void c(boolean param0) {
        field_A = null;
        field_D = null;
        field_C = null;
        field_y = null;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 80) {
            return;
        }
        lg.a(false, param0 + -79, true);
    }

    final static oh[] d(int param0) {
        oh[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = TetraLink.field_J;
        var1 = new oh[vj.field_n];
        var2 = 0;
        L0: while (true) {
          if (var2 >= vj.field_n) {
            an.b(-128);
            return var1;
          } else {
            var3 = sn.field_e[var2] * je.field_h[var2];
            var24 = ga.field_a[var2];
            if (!gm.field_g[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new oh(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = ti.field_c[pl.a((int) var24[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var23 = jg.field_i[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (oh) (Object) new ue(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = mc.a(pl.a(-16777216, var23[var7] << 24), ti.field_c[pl.a(255, (int) var24[var7])]);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_A = "Back";
        field_B = 0;
        field_C = "<%0> must play <%1> more rated games before playing with the current options.";
        field_D = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
