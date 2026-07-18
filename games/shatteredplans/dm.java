/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static qr field_h;
    static bg field_f;
    static bi[] field_d;
    Object[] field_b;
    int field_g;
    static String field_c;
    static String field_a;
    private int field_e;
    static int field_i;

    private final void a(int param0) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        ((dm) this).field_e = ((dm) this).field_e + 10;
        Object[] var5 = new Object[((dm) this).field_e];
        Object[] var2 = var5;
        for (var3 = 0; var3 < ((dm) this).field_g; var3++) {
            var5[var3] = ((dm) this).field_b[var3];
        }
        ((dm) this).field_b = var2;
    }

    final static void a(int param0, int param1, ub param2, boolean param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        pf var10 = null;
        Object var11 = null;
        int var11_int = 0;
        mj var12 = null;
        int var13 = 0;
        qr var14 = null;
        qr var15 = null;
        qr var16 = null;
        qr var17 = null;
        qr var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
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
        ub stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        ub stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        ub stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        qr stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        qr stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        qr stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        ub stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        ub stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        ub stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        qr stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        qr stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        qr stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        L0: {
          var31 = ShatteredPlansClient.field_F ? 1 : 0;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null == np.field_a) {
            break L0;
          } else {
            L1: {
              if (null != td.field_E) {
                break L1;
              } else {
                if (ci.field_h != null) {
                  break L1;
                } else {
                  if (null != pg.field_A) {
                    break L1;
                  } else {
                    if (null == ji.field_D) {
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
              if (var9 >= em.field_k) {
                break L0;
              } else {
                L3: {
                  var10_int = np.field_a.field_dc[var9] & 255;
                  if (td.field_E == null) {
                    break L3;
                  } else {
                    if (null != td.field_E[var9]) {
                      if (!td.field_E[var9][var10_int]) {
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
                  if (ci.field_h == null) {
                    break L4;
                  } else {
                    if (null != ci.field_h[var9]) {
                      L5: {
                        var11_int = ci.field_h[var9][var10_int];
                        if (var11_int <= var6) {
                          break L5;
                        } else {
                          var6 = var11_int;
                          break L5;
                        }
                      }
                      if (var11_int == 0) {
                        break L4;
                      } else {
                        if (hm.field_o) {
                          break L4;
                        } else {
                          var5_int = 1;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (ji.field_D == null) {
                    break L6;
                  } else {
                    if (null == ji.field_D[var9]) {
                      break L6;
                    } else {
                      var8 = var8 | ji.field_D[var9][var10_int];
                      break L6;
                    }
                  }
                }
                L7: {
                  if (pg.field_A == null) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L8: {
          stackOut_26_0 = (ub) param2;
          stackOut_26_1 = 4 * (2 + cr.field_c) * param0;
          stackOut_26_2 = cr.field_c * 2 + 4;
          stackIn_28_0 = stackOut_26_0;
          stackIn_28_1 = stackOut_26_1;
          stackIn_28_2 = stackOut_26_2;
          stackIn_27_0 = stackOut_26_0;
          stackIn_27_1 = stackOut_26_1;
          stackIn_27_2 = stackOut_26_2;
          if (param2 != hp.field_l) {
            stackOut_28_0 = (ub) (Object) stackIn_28_0;
            stackOut_28_1 = stackIn_28_1;
            stackOut_28_2 = stackIn_28_2;
            stackOut_28_3 = 0;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            stackIn_29_2 = stackOut_28_2;
            stackIn_29_3 = stackOut_28_3;
            break L8;
          } else {
            stackOut_27_0 = (ub) (Object) stackIn_27_0;
            stackOut_27_1 = stackIn_27_1;
            stackOut_27_2 = stackIn_27_2;
            stackOut_27_3 = 1;
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_29_2 = stackOut_27_2;
            stackIn_29_3 = stackOut_27_3;
            break L8;
          }
        }
        L9: {
          if (((ub) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_29_3 == 0, -108, param3, 2)) {
            stackOut_31_0 = 0;
            stackIn_32_0 = stackOut_31_0;
            break L9;
          } else {
            stackOut_30_0 = 1;
            stackIn_32_0 = stackOut_30_0;
            break L9;
          }
        }
        var9 = stackIn_32_0;
        var10 = param2.field_xb.field_M;
        var11 = null;
        var12 = (mj) (Object) var10.d(param1);
        L10: while (true) {
          if (var12 == null) {
            return;
          } else {
            L11: {
              var13 = 0;
              if (null != var12.field_M) {
                break L11;
              } else {
                L12: {
                  var12.field_Ab = new qr(0L, ek.field_E);
                  var12.a(4, var12.field_Ab);
                  var12.field_Ob = new qr(0L, oj.field_zb);
                  if (ns.field_pb) {
                    var12.a(param1 ^ 4, var12.field_Ob);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var12.field_Ob.field_y = 2;
                var12.field_xb = new qr(0L, ii.field_u);
                var12.a(4, var12.field_xb);
                var12.e((byte) -128);
                var12.field_Jb = new qr(0L, kq.field_h);
                var12.a(param1 ^ 4, var12.field_Jb);
                var12.field_Mb = new qr(0L, rf.field_l);
                var13 = 1;
                var12.a(4, var12.field_Mb);
                break L11;
              }
            }
            L13: {
              var12.field_Ab.field_z = null;
              var14 = var12.field_Ab;
              var12.field_Ab.field_mb = 0;
              var12.field_Ob.field_z = null;
              var14.field_K = 0;
              var15 = var12.field_Ob;
              var12.field_Ob.field_mb = 0;
              var15.field_K = 0;
              var12.field_Jb.field_z = null;
              var12.field_Jb.field_mb = 0;
              var16 = var12.field_Jb;
              var12.field_Mb.field_z = null;
              var16.field_K = 0;
              var12.field_Mb.field_mb = 0;
              var17 = var12.field_Mb;
              var12.field_xb.field_z = null;
              var17.field_K = 0;
              var18 = var12.field_xb;
              var12.field_xb.field_mb = 0;
              var18.field_K = 0;
              var12.field_K = param2.field_xb.field_K;
              var19 = 0;
              var32 = var12.field_Cb;
              var20 = var32;
              var20 = var32;
              var21 = 72;
              if (ls.field_a == param2) {
                var21 += 42;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var33 = nq.a(var12.field_Ab.field_nb, var32, var21);
              var20 = var33;
              var20 = var33;
              if (var33.equals((Object) (Object) var12.field_Cb)) {
                stackOut_44_0 = 0;
                stackIn_45_0 = stackOut_44_0;
                break L14;
              } else {
                stackOut_43_0 = 1;
                stackIn_45_0 = stackOut_43_0;
                break L14;
              }
            }
            L15: {
              var22 = stackIn_45_0;
              if (var12.field_Lb < 4) {
                if (0 >= var12.field_Lb) {
                  break L15;
                } else {
                  var20 = "<img=" + (var12.field_Lb - 1) + ">" + var33;
                  break L15;
                }
              } else {
                var20 = "<img=" + (rg.field_d + (var12.field_Lb + -4)) + ">" + var33;
                break L15;
              }
            }
            L16: {
              var12.field_Ab.field_z = var20;
              if (!var12.h(-89)) {
                L17: {
                  L18: {
                    L19: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L19;
                      } else {
                        if (!var12.field_Ub) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (var6 > var12.field_Qb) {
                      break L18;
                    } else {
                      if (var12.field_Fb < var7) {
                        break L18;
                      } else {
                        if ((~var12.field_Wb & var8) <= 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  var23_int = 8414771;
                  var24_int = 8421504;
                  break L17;
                }
                L20: {
                  var12.field_Jb.field_x = var23_int;
                  var12.field_Ob.field_x = var23_int;
                  var12.field_Ab.field_x = var23_int;
                  var12.field_Ab.field_ab = var24_int;
                  var12.field_Ab.field_qb = var24_int;
                  var12.field_Ab.field_jb = var24_int;
                  var12.field_Ob.field_ab = var24_int;
                  var12.field_Ob.field_qb = var24_int;
                  var12.field_Ob.field_jb = var24_int;
                  var12.field_Jb.field_ab = var24_int;
                  var12.field_Jb.field_qb = var24_int;
                  var12.field_Jb.field_jb = var24_int;
                  if (ro.field_a != param2) {
                    if (var12.field_Tb) {
                      var12.field_Ab.field_z = re.a(o.field_q, 4371, new String[1]);
                      var12.field_Mb.field_z = fb.field_bc;
                      break L20;
                    } else {
                      if (!var12.field_Vb) {
                        var12.field_Jb.field_z = um.field_p;
                        break L20;
                      } else {
                        var12.field_Ab.field_z = re.a(mg.field_E, 4371, new String[1]);
                        var12.field_Jb.field_z = o.field_m;
                        var12.field_Mb.field_z = hl.field_J;
                        break L20;
                      }
                    }
                  } else {
                    if (!np.field_a.field_Ab) {
                      var12.field_Mb.field_z = lc.field_a;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                L21: {
                  var25_int = 0;
                  if (np.field_a == null) {
                    break L21;
                  } else {
                    if (!ip.a((byte) -97)) {
                      break L21;
                    } else {
                      if (~ec.field_p == ~var12.field_Ib) {
                        break L21;
                      } else {
                        L22: {
                          if (null != var12.field_Jb.field_z) {
                            var26 = var12.field_Jb.e(false) + 2 * tg.field_a;
                            var12.field_Jb.a(var26, cr.field_c, (byte) 80, var19, var25_int);
                            var25_int = var25_int + var26;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (null != var12.field_Mb.field_z) {
                          L23: {
                            if (param2 != ro.field_a) {
                              var26 = var12.field_Mb.e(false) - -(tg.field_a * 2);
                              break L23;
                            } else {
                              var26 = 40;
                              break L23;
                            }
                          }
                          var12.field_Mb.a(var26, cr.field_c, (byte) 78, var19, var25_int);
                          var25_int = var25_int + var26;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                }
                L24: {
                  stackOut_80_0 = var12.field_Ab;
                  stackOut_80_1 = -var25_int;
                  stackOut_80_2 = var12.field_K;
                  stackIn_82_0 = stackOut_80_0;
                  stackIn_82_1 = stackOut_80_1;
                  stackIn_82_2 = stackOut_80_2;
                  stackIn_81_0 = stackOut_80_0;
                  stackIn_81_1 = stackOut_80_1;
                  stackIn_81_2 = stackOut_80_2;
                  if (ns.field_pb) {
                    stackOut_82_0 = (qr) (Object) stackIn_82_0;
                    stackOut_82_1 = stackIn_82_1;
                    stackOut_82_2 = stackIn_82_2;
                    stackOut_82_3 = 42;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    stackIn_83_2 = stackOut_82_2;
                    stackIn_83_3 = stackOut_82_3;
                    break L24;
                  } else {
                    stackOut_81_0 = (qr) (Object) stackIn_81_0;
                    stackOut_81_1 = stackIn_81_1;
                    stackOut_81_2 = stackIn_81_2;
                    stackOut_81_3 = 0;
                    stackIn_83_0 = stackOut_81_0;
                    stackIn_83_1 = stackOut_81_1;
                    stackIn_83_2 = stackOut_81_2;
                    stackIn_83_3 = stackOut_81_3;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    ((qr) (Object) stackIn_83_0).a(stackIn_83_1 + (stackIn_83_2 - stackIn_83_3), cr.field_c, (byte) 44, var19, var25_int);
                    var12.field_Ob.field_z = Integer.toString(var12.field_Qb);
                    var12.field_Ob.a(40, cr.field_c, (byte) 126, var19, var12.field_K - 40);
                    if (!var12.field_Ab.field_L) {
                      break L26;
                    } else {
                      if (var22 != 0) {
                        dn.field_k = var12.field_Cb;
                        if (tk.field_v == null) {
                          break L25;
                        } else {
                          if (null != tk.field_v[var12.field_Lb]) {
                            dn.field_k = dn.field_k + " - " + tk.field_v[var12.field_Lb];
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      } else {
                        break L26;
                      }
                    }
                  }
                  if (!var12.field_Ab.field_L) {
                    break L25;
                  } else {
                    if (tk.field_v == null) {
                      break L25;
                    } else {
                      if (tk.field_v[var12.field_Lb] != null) {
                        dn.field_k = tk.field_v[var12.field_Lb];
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
                var19 = var19 + cr.field_c;
                break L16;
              } else {
                break L16;
              }
            }
            L27: {
              var23 = lc.a(var12.field_Eb, (byte) -87, var20);
              var24 = var23;
              var30 = var24;
              var25 = var30;
              var24 = var23;
              if (var23 != null) {
                var24_int = var12.field_xb.field_nb.a(var23, var12.field_K + -tg.field_a - tg.field_a);
                var12.field_xb.field_z = var23;
                var12.field_xb.field_I = 256 * var12.field_Gb / ks.field_i;
                var12.field_xb.a(-(2 * tg.field_a) + var12.field_K, var24_int * cr.field_c, (byte) 96, var19, tg.field_a);
                var19 = var19 + cr.field_c * var24_int;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (var9 == 0) {
                var12.field_gb = var19 + -var12.field_mb;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (var13 != 0) {
                param2.field_xb.a(2, (qr) var11, (qr) (Object) var12, (byte) 126);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (var12.field_rb == 0) {
                break L30;
              } else {
                if (var12.h(-72)) {
                  break L30;
                } else {
                  if (0 != var12.field_Jb.field_rb) {
                    tj.a((byte) -79, param4, var12.field_Ib);
                    break L30;
                  } else {
                    if (0 == var12.field_Mb.field_rb) {
                      qg.a(nh.field_p, var12, td.field_P, param2, 0, 0, (byte) 110);
                      break L30;
                    } else {
                      bc.a(param4, (byte) 2, var12.field_Ib);
                      break L30;
                    }
                  }
                }
              }
            }
            L31: {
              if (!var12.field_v) {
                break L31;
              } else {
                if (!var12.h(-121)) {
                  L32: {
                    var24 = null;
                    if (ec.field_p != var12.field_Ib) {
                      L33: {
                        if (var5_int == 0) {
                          break L33;
                        } else {
                          if (!var12.field_Ub) {
                            var24 = re.a(fb.field_kc, param1 ^ 4371, new String[1]);
                            var30 = var24;
                            var25 = var30;
                            var24 = var25;
                            var30 = var24;
                            var25 = var30;
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      if (var12.field_Fb >= var7) {
                        if (var6 <= var12.field_Qb) {
                          if (-1 != (var8 & var12.field_Wb)) {
                            var25_int = db.a(param1 + 38, var8 & ~var12.field_Wb);
                            var24 = re.a(ra.field_j, 4371, new String[1]);
                            if (0 >= var25_int) {
                              break L32;
                            } else {
                              if (null == qa.field_s) {
                                break L32;
                              } else {
                                if (var25_int > qa.field_s.length) {
                                  break L32;
                                } else {
                                  if (qa.field_s[var25_int + -1] == null) {
                                    break L32;
                                  } else {
                                    var24 = re.a(qa.field_s[var25_int + -1][2], param1 ^ 4371, new String[1]);
                                    break L32;
                                  }
                                }
                              }
                            }
                          } else {
                            break L32;
                          }
                        } else {
                          var24 = re.a(mq.field_b, 4371, new String[2]);
                          break L32;
                        }
                      } else {
                        L34: {
                          var25_int = -var12.field_Fb + var7;
                          if (var25_int == 1) {
                            var24 = re.a(gs.field_i, 4371, new String[1]);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        var24 = re.a(em.field_b, 4371, new String[2]);
                        break L32;
                      }
                    } else {
                      L35: {
                        if (var5_int == 0) {
                          break L35;
                        } else {
                          if (!var12.field_Ub) {
                            var24 = vg.field_r;
                            break L32;
                          } else {
                            break L35;
                          }
                        }
                      }
                      if (var7 > var12.field_Fb) {
                        L36: {
                          var25_int = var7 + -var12.field_Fb;
                          if (var25_int == 1) {
                            var24 = fc.field_d;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        var24 = re.a(as.field_h, param1 ^ 4371, new String[2]);
                        break L32;
                      } else {
                        if (var6 <= var12.field_Qb) {
                          if (-1 == (var8 & var12.field_Wb)) {
                            break L32;
                          } else {
                            var25_int = db.a(param1 + 31, var8 & ~var12.field_Wb);
                            var24 = ub.field_Eb;
                            if (0 >= var25_int) {
                              break L32;
                            } else {
                              if (null == qa.field_s) {
                                break L32;
                              } else {
                                if (qa.field_s.length < var25_int) {
                                  break L32;
                                } else {
                                  if (qa.field_s[-1 + var25_int] != null) {
                                    var24 = qa.field_s[-1 + var25_int][1];
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var24 = re.a(mk.field_f, 4371, new String[2]);
                          break L32;
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
                    L37: while (true) {
                      if (var27_int >= em.field_k) {
                        L38: {
                          L39: {
                            if (ro.field_a != param2) {
                              break L39;
                            } else {
                              if (ip.a((byte) -124)) {
                                if (var26 != 0) {
                                  var24 = var34 + "<br>" + eg.field_s + var25;
                                  break L38;
                                } else {
                                  var24 = var34 + "<br>" + re.a(ud.field_d, 4371, new String[1]);
                                  break L38;
                                }
                              } else {
                                break L39;
                              }
                            }
                          }
                          if (var26 != 0) {
                            var24 = var34 + "<br>" + sd.field_y + var25;
                            break L38;
                          } else {
                            var24 = var34 + "<br>" + re.a(ef.field_e, param1 + 4371, new String[1]);
                            break L38;
                          }
                        }
                        L40: {
                          if (ro.field_a != param2) {
                            break L40;
                          } else {
                            if (ip.a((byte) -126)) {
                              break L40;
                            } else {
                              var27 = np.field_a.field_Xb;
                              var24 = var24 + "<br>" + re.a(ve.field_Gb, 4371, new String[1]);
                              break L40;
                            }
                          }
                        }
                        dn.field_k = var24;
                        break L31;
                      } else {
                        L41: {
                          var28 = 255 & np.field_a.field_dc[var27_int];
                          var29 = 0;
                          if (td.field_E == null) {
                            break L41;
                          } else {
                            if (td.field_E[var27_int] == null) {
                              break L41;
                            } else {
                              if (!td.field_E[var27_int][var28]) {
                                break L41;
                              } else {
                                if (!var12.field_Ub) {
                                  var29 = 1;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                        }
                        L42: {
                          if (null == ci.field_h) {
                            break L42;
                          } else {
                            if (ci.field_h[var27_int] != null) {
                              L43: {
                                var30_int = ci.field_h[var27_int][var28];
                                if (var30_int == 0) {
                                  break L43;
                                } else {
                                  if (hm.field_o) {
                                    break L43;
                                  } else {
                                    if (var12.field_Ub) {
                                      break L43;
                                    } else {
                                      var29 = 1;
                                      break L43;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Qb >= var30_int) {
                                break L42;
                              } else {
                                var29 = 1;
                                break L42;
                              }
                            } else {
                              break L42;
                            }
                          }
                        }
                        L44: {
                          if (null == pg.field_A) {
                            break L44;
                          } else {
                            if (null != pg.field_A[var27_int]) {
                              L45: {
                                var30_int = pg.field_A[var27_int][var28];
                                if (var30_int == 0) {
                                  break L45;
                                } else {
                                  if (hm.field_o) {
                                    break L45;
                                  } else {
                                    if (var12.field_Ub) {
                                      break L45;
                                    } else {
                                      var29 = 1;
                                      break L45;
                                    }
                                  }
                                }
                              }
                              if (var30_int > var12.field_Fb) {
                                var29 = 1;
                                break L44;
                              } else {
                                break L44;
                              }
                            } else {
                              break L44;
                            }
                          }
                        }
                        L46: {
                          if (ji.field_D == null) {
                            break L46;
                          } else {
                            if (null == ji.field_D[var27_int]) {
                              break L46;
                            } else {
                              if ((~var12.field_Wb & ji.field_D[var27_int][var28]) == 0) {
                                break L46;
                              } else {
                                var29 = 1;
                                break L46;
                              }
                            }
                          }
                        }
                        L47: {
                          if (var29 != 0) {
                            var30 = "<col=A00000>" + gm.field_l[var27_int] + "</col>";
                            var25 = var30;
                            var24 = var25;
                            var25 = var30;
                            if (var25 == null) {
                              var25 = var30;
                              var24 = var25;
                              var24 = var25;
                              break L47;
                            } else {
                              var26 = 1;
                              var25 = var25 + ", " + var30;
                              break L47;
                            }
                          } else {
                            break L47;
                          }
                        }
                        var27_int++;
                        continue L37;
                      }
                    }
                  } else {
                    break L31;
                  }
                } else {
                  var11 = (Object) (Object) var12;
                  var12 = (mj) (Object) var10.a((byte) -71);
                  continue L10;
                }
              }
            }
            var11 = (Object) (Object) var12;
            var12 = (mj) (Object) var10.a((byte) -71);
            continue L10;
          }
        }
    }

    final static void a(int param0, int param1) {
        de.field_h = ff.field_v[param1];
        i.field_a = h.field_w[param1];
        ns.field_xb = ae.field_c[param1];
    }

    final void a(Object[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              if (var3_int >= ((dm) this).field_g) {
                break L0;
              } else {
                param0[var3_int] = ((dm) this).field_b[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("dm.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, Object param1) {
        try {
            if (((dm) this).field_e == ((dm) this).field_g) {
                this.a(-11470);
            }
            if (param0) {
                dm.a(((boolean[]) ((Object[]) ((Object[]) ((dm) this).field_b[7])[2])[1])[4]);
            }
            int fieldTemp$0 = ((dm) this).field_g;
            ((dm) this).field_g = ((dm) this).field_g + 1;
            ((dm) this).field_b[fieldTemp$0] = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "dm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public dm() {
        ((dm) this).field_e = 10;
        ((dm) this).field_g = 0;
        ((dm) this).field_b = new Object[10];
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        field_f = null;
        field_d = null;
        field_a = null;
        if (param0) {
            Object var2 = null;
            dm.a(-33, 120, (ub) null, true, 27);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Shattered Plans has <%highlight>four different game types</col>, each with a different <%glossary>victory condition</col>.<br><br><%highlight>CONQUEST</col> - This is the simplest type of game: destroy all opponents to achieve victory. Any of the other game types can also be won in this way.<br><br><%highlight>CAPTURE AND HOLD</col> - The game has a fixed length of <%highlight>20 turns</col>, and a fixed map layout. In the centre of the map is <%highlight>Sol</col> and the damaged remains of Earth. At the end of each turn, the player who owns Sol earns <%highlight>1 point</col>. At the end of the 20 turns, the surviving player with the highest score wins. <%glossary>Ties</col> are broken in favour of the player who owns Sol. If none of the tied players own Sol, they draw and the other players lose.<br><br><%highlight>POINTS</col> - Players earn points each turn for the <%glossary>systems</col> they own. <%glossary>Colony homeworlds</col> are worth <%highlight>3 points</col> each turn, <%glossary>neutral homeworlds</col> are worth <%highlight>2 points</col>, and other worlds are worth <%highlight>1 point</col> each. The first player to reach the target number of points, which varies depending on map size, wins the game.<br><br><%highlight>DERELICTS</col> - Several <%glossary>derelict alien objects</col> are scattered around the map. Capturing a derelict allows you to begin researching it, earning you points each turn. This research is expensive, however, and so owning a derelict <%highlight>reduces your income<col> in each <%glossary>resource</col>. The first player to reach the target of <%highlight>50 points</col> wins.<br><br>";
        field_c = "Display Options";
        field_f = new bg("usename");
    }
}
