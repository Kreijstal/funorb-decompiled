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
        if (param0 != -11470) {
            this.field_b = (Object[]) (((Object[]) (this.field_b[8]))[1]);
        }
        this.field_e = this.field_e + 10;
        Object[] var5 = new Object[this.field_e];
        Object[] var2 = var5;
        for (var3 = 0; var3 < this.field_g; var3++) {
            var5[var3] = this.field_b[var3];
        }
        this.field_b = var2;
    }

    final static void a(int param0, int param1, ub param2, boolean param3, int param4) {
        RuntimeException var5 = null;
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
        ub stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        ub stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        ub stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_43_0 = 0;
        int stackIn_56_0 = 0;
        qr stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        qr stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        qr stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        String stackIn_220_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        ub stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        ub stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        qr stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        qr stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        qr stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        RuntimeException stackOut_217_0 = null;
        StringBuilder stackOut_217_1 = null;
        RuntimeException stackOut_219_0 = null;
        StringBuilder stackOut_219_1 = null;
        String stackOut_219_2 = null;
        RuntimeException stackOut_218_0 = null;
        StringBuilder stackOut_218_1 = null;
        String stackOut_218_2 = null;
        var31 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              if (null == np.field_a) {
                break L1;
              } else {
                L2: {
                  if (null != td.field_E) {
                    break L2;
                  } else {
                    if (ci.field_h != null) {
                      break L2;
                    } else {
                      if (null != pg.field_A) {
                        break L2;
                      } else {
                        if (null == ji.field_D) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var9 = 0;
                L3: while (true) {
                  if (var9 >= em.field_k) {
                    break L1;
                  } else {
                    L4: {
                      var10_int = np.field_a.field_dc[var9] & 255;
                      if (td.field_E == null) {
                        break L4;
                      } else {
                        if (null != td.field_E[var9]) {
                          if (!td.field_E[var9][var10_int]) {
                            break L4;
                          } else {
                            var5_int = 1;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (ci.field_h == null) {
                        break L5;
                      } else {
                        if (null != ci.field_h[var9]) {
                          L6: {
                            var11_int = ci.field_h[var9][var10_int];
                            if (var11_int <= var6) {
                              break L6;
                            } else {
                              var6 = var11_int;
                              break L6;
                            }
                          }
                          if (-1 == (var11_int ^ -1)) {
                            break L5;
                          } else {
                            if (hm.field_o) {
                              break L5;
                            } else {
                              var5_int = 1;
                              break L5;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (ji.field_D == null) {
                        break L7;
                      } else {
                        if (null == ji.field_D[var9]) {
                          break L7;
                        } else {
                          var8 = var8 | ji.field_D[var9][var10_int];
                          break L7;
                        }
                      }
                    }
                    if (pg.field_A != null) {
                      L8: {
                        if (null != pg.field_A[var9]) {
                          L9: {
                            var11_int = pg.field_A[var9][var10_int];
                            if (var11_int <= var7) {
                              break L9;
                            } else {
                              var7 = var11_int;
                              break L9;
                            }
                          }
                          if (var11_int != 0) {
                            if (!hm.field_o) {
                              var5_int = 1;
                              break L8;
                            } else {
                              var9++;
                              continue L3;
                            }
                          } else {
                            var9++;
                            continue L3;
                          }
                        } else {
                          break L8;
                        }
                      }
                      var9++;
                      continue L3;
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L10: {
              stackOut_37_0 = (ub) (param2);
              stackOut_37_1 = 4 * (2 + cr.field_c) * param0;
              stackOut_37_2 = cr.field_c * 2 + 4;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              if (param2 != hp.field_l) {
                stackOut_39_0 = (ub) ((Object) stackIn_39_0);
                stackOut_39_1 = stackIn_39_1;
                stackOut_39_2 = stackIn_39_2;
                stackOut_39_3 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                stackIn_40_2 = stackOut_39_2;
                stackIn_40_3 = stackOut_39_3;
                break L10;
              } else {
                stackOut_38_0 = (ub) ((Object) stackIn_38_0);
                stackOut_38_1 = stackIn_38_1;
                stackOut_38_2 = stackIn_38_2;
                stackOut_38_3 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_40_2 = stackOut_38_2;
                stackIn_40_3 = stackOut_38_3;
                break L10;
              }
            }
            L11: {
              if (((ub) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3 == 0, -108, param3, 2)) {
                stackOut_42_0 = 0;
                stackIn_43_0 = stackOut_42_0;
                break L11;
              } else {
                stackOut_41_0 = 1;
                stackIn_43_0 = stackOut_41_0;
                break L11;
              }
            }
            var9 = stackIn_43_0;
            var10 = param2.field_xb.field_M;
            var11 = null;
            var12 = (mj) ((Object) var10.d(param1));
            L12: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L13: {
                  var13 = 0;
                  if (null != var12.field_M) {
                    break L13;
                  } else {
                    L14: {
                      var12.field_Ab = new qr(0L, ek.field_E);
                      var12.a(4, var12.field_Ab);
                      var12.field_Ob = new qr(0L, oj.field_zb);
                      if (ns.field_pb) {
                        var12.a(param1 ^ 4, var12.field_Ob);
                        break L14;
                      } else {
                        break L14;
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
                    break L13;
                  }
                }
                L15: {
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
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  var33 = nq.a(var12.field_Ab.field_nb, var32, var21);
                  var20 = var33;
                  var20 = var33;
                  var20 = var33;
                  if (var33.equals(var12.field_Cb)) {
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    break L16;
                  } else {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    break L16;
                  }
                }
                L17: {
                  var22 = stackIn_56_0;
                  if ((var12.field_Lb ^ -1) > -5) {
                    if (0 >= var12.field_Lb) {
                      break L17;
                    } else {
                      var20 = "<img=" + (var12.field_Lb - 1) + ">" + var33;
                      break L17;
                    }
                  } else {
                    var20 = "<img=" + (rg.field_d + (var12.field_Lb + -4)) + ">" + var33;
                    break L17;
                  }
                }
                L18: {
                  var12.field_Ab.field_z = var20;
                  if (!var12.h(-89)) {
                    L19: {
                      L20: {
                        L21: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L21;
                          } else {
                            if (!var12.field_Ub) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (var6 > var12.field_Qb) {
                          break L20;
                        } else {
                          if (var12.field_Fb < var7) {
                            break L20;
                          } else {
                            if (((var12.field_Wb ^ -1) & var8 ^ -1) >= -1) {
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
                          var12.field_Ab.field_z = re.a(o.field_q, 4371, new String[]{var20});
                          var12.field_Mb.field_z = fb.field_bc;
                          break L22;
                        } else {
                          if (!var12.field_Vb) {
                            var12.field_Jb.field_z = um.field_p;
                            break L22;
                          } else {
                            var12.field_Ab.field_z = re.a(mg.field_E, 4371, new String[]{var20});
                            var12.field_Jb.field_z = o.field_m;
                            var12.field_Mb.field_z = hl.field_J;
                            break L22;
                          }
                        }
                      } else {
                        if (!np.field_a.field_Ab) {
                          var12.field_Mb.field_z = lc.field_a;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      var25_int = 0;
                      if (np.field_a == null) {
                        break L23;
                      } else {
                        if (!ip.a((byte) -97)) {
                          break L23;
                        } else {
                          if ((ec.field_p ^ -1L) == (var12.field_Ib ^ -1L)) {
                            break L23;
                          } else {
                            L24: {
                              if (null != var12.field_Jb.field_z) {
                                var26 = var12.field_Jb.e(false) + 2 * tg.field_a;
                                var12.field_Jb.a(var26, cr.field_c, (byte) 80, var19, var25_int);
                                var25_int = var25_int + var26;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            if (null != var12.field_Mb.field_z) {
                              L25: {
                                if (param2 != ro.field_a) {
                                  var26 = var12.field_Mb.e(false) - -(tg.field_a * 2);
                                  break L25;
                                } else {
                                  var26 = 40;
                                  break L25;
                                }
                              }
                              var12.field_Mb.a(var26, cr.field_c, (byte) 78, var19, var25_int);
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
                      stackOut_91_0 = var12.field_Ab;
                      stackOut_91_1 = -var25_int;
                      stackOut_91_2 = var12.field_K;
                      stackIn_93_0 = stackOut_91_0;
                      stackIn_93_1 = stackOut_91_1;
                      stackIn_93_2 = stackOut_91_2;
                      stackIn_92_0 = stackOut_91_0;
                      stackIn_92_1 = stackOut_91_1;
                      stackIn_92_2 = stackOut_91_2;
                      if (ns.field_pb) {
                        stackOut_93_0 = (qr) ((Object) stackIn_93_0);
                        stackOut_93_1 = stackIn_93_1;
                        stackOut_93_2 = stackIn_93_2;
                        stackOut_93_3 = 42;
                        stackIn_94_0 = stackOut_93_0;
                        stackIn_94_1 = stackOut_93_1;
                        stackIn_94_2 = stackOut_93_2;
                        stackIn_94_3 = stackOut_93_3;
                        break L26;
                      } else {
                        stackOut_92_0 = (qr) ((Object) stackIn_92_0);
                        stackOut_92_1 = stackIn_92_1;
                        stackOut_92_2 = stackIn_92_2;
                        stackOut_92_3 = 0;
                        stackIn_94_0 = stackOut_92_0;
                        stackIn_94_1 = stackOut_92_1;
                        stackIn_94_2 = stackOut_92_2;
                        stackIn_94_3 = stackOut_92_3;
                        break L26;
                      }
                    }
                    L27: {
                      L28: {
                        ((qr) (Object) stackIn_94_0).a(stackIn_94_1 + (stackIn_94_2 - stackIn_94_3), cr.field_c, (byte) 44, var19, var25_int);
                        var12.field_Ob.field_z = Integer.toString(var12.field_Qb);
                        var12.field_Ob.a(40, cr.field_c, (byte) 126, var19, var12.field_K - 40);
                        if (!var12.field_Ab.field_L) {
                          break L28;
                        } else {
                          if (var22 != 0) {
                            dn.field_k = var12.field_Cb;
                            if (tk.field_v == null) {
                              break L27;
                            } else {
                              if (null != tk.field_v[var12.field_Lb]) {
                                dn.field_k = dn.field_k + " - " + tk.field_v[var12.field_Lb];
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                          } else {
                            break L28;
                          }
                        }
                      }
                      if (!var12.field_Ab.field_L) {
                        break L27;
                      } else {
                        if (tk.field_v == null) {
                          break L27;
                        } else {
                          if (tk.field_v[var12.field_Lb] != null) {
                            dn.field_k = tk.field_v[var12.field_Lb];
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    var19 = var19 + cr.field_c;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L29: {
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
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (var9 == 0) {
                    var12.field_gb = var19 + -var12.field_mb;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (var13 != 0) {
                    param2.field_xb.a(2, (qr) (var11), var12, (byte) 126);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (var12.field_rb == 0) {
                    break L32;
                  } else {
                    if (var12.h(-72)) {
                      break L32;
                    } else {
                      if (0 != var12.field_Jb.field_rb) {
                        tj.a((byte) -79, param4, var12.field_Ib);
                        break L32;
                      } else {
                        if (0 == var12.field_Mb.field_rb) {
                          qg.a(nh.field_p, var12, td.field_P, param2, 0, 0, (byte) 110);
                          break L32;
                        } else {
                          bc.a(param4, (byte) 2, var12.field_Ib);
                          break L32;
                        }
                      }
                    }
                  }
                }
                L33: {
                  if (!var12.field_v) {
                    break L33;
                  } else {
                    if (!var12.h(-121)) {
                      L34: {
                        var24 = null;
                        if (ec.field_p != var12.field_Ib) {
                          L35: {
                            if (var5_int == 0) {
                              break L35;
                            } else {
                              if (!var12.field_Ub) {
                                var24 = re.a(fb.field_kc, param1 ^ 4371, new String[]{var20});
                                var30 = var24;
                                var25 = var30;
                                var24 = var25;
                                var30 = var24;
                                var25 = var30;
                                break L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          if (var12.field_Fb >= var7) {
                            if (var6 <= var12.field_Qb) {
                              if (-1 != (var8 & (var12.field_Wb ^ -1) ^ -1)) {
                                var25_int = db.a(param1 + 38, var8 & (var12.field_Wb ^ -1));
                                var24 = re.a(ra.field_j, 4371, new String[]{var20});
                                if (0 >= var25_int) {
                                  break L34;
                                } else {
                                  if (null == qa.field_s) {
                                    break L34;
                                  } else {
                                    if (var25_int > qa.field_s.length) {
                                      break L34;
                                    } else {
                                      if (qa.field_s[var25_int + -1] == null) {
                                        break L34;
                                      } else {
                                        var24 = re.a(qa.field_s[var25_int + -1][2], param1 ^ 4371, new String[]{var20});
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            } else {
                              var24 = re.a(mq.field_b, 4371, new String[]{var20, Integer.toString(var6)});
                              break L34;
                            }
                          } else {
                            L36: {
                              var25_int = -var12.field_Fb + var7;
                              if ((var25_int ^ -1) == -2) {
                                var24 = re.a(gs.field_i, 4371, new String[]{var20});
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            var24 = re.a(em.field_b, 4371, new String[]{var20, Integer.toString(var25_int)});
                            break L34;
                          }
                        } else {
                          L37: {
                            if (var5_int == 0) {
                              break L37;
                            } else {
                              if (!var12.field_Ub) {
                                var24 = vg.field_r;
                                break L34;
                              } else {
                                break L37;
                              }
                            }
                          }
                          if (var7 > var12.field_Fb) {
                            L38: {
                              var25_int = var7 + -var12.field_Fb;
                              if (var25_int == 1) {
                                var24 = fc.field_d;
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                            var24 = re.a(as.field_h, param1 ^ 4371, new String[]{null, Integer.toString(var25_int)});
                            break L34;
                          } else {
                            if (var6 <= var12.field_Qb) {
                              if (-1 == (var8 & (var12.field_Wb ^ -1) ^ -1)) {
                                break L34;
                              } else {
                                var25_int = db.a(param1 + 31, var8 & (var12.field_Wb ^ -1));
                                var24 = ub.field_Eb;
                                if (0 >= var25_int) {
                                  break L34;
                                } else {
                                  if (null == qa.field_s) {
                                    break L34;
                                  } else {
                                    if (qa.field_s.length < var25_int) {
                                      break L34;
                                    } else {
                                      if (qa.field_s[-1 + var25_int] != null) {
                                        var24 = qa.field_s[-1 + var25_int][1];
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = re.a(mk.field_f, 4371, new String[]{null, Integer.toString(var6)});
                              break L34;
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
                        L39: while (true) {
                          if (var27_int >= em.field_k) {
                            L40: {
                              L41: {
                                if (ro.field_a != param2) {
                                  break L41;
                                } else {
                                  if (ip.a((byte) -124)) {
                                    if (var26 != 0) {
                                      var24 = var34 + "<br>" + eg.field_s + var25;
                                      break L40;
                                    } else {
                                      var24 = var34 + "<br>" + re.a(ud.field_d, 4371, new String[]{var25});
                                      break L40;
                                    }
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              if (var26 != 0) {
                                var24 = var34 + "<br>" + sd.field_y + var25;
                                break L40;
                              } else {
                                var24 = var34 + "<br>" + re.a(ef.field_e, param1 + 4371, new String[]{var25});
                                break L40;
                              }
                            }
                            L42: {
                              if (ro.field_a != param2) {
                                break L42;
                              } else {
                                if (ip.a((byte) -126)) {
                                  break L42;
                                } else {
                                  var27 = np.field_a.field_Xb;
                                  var24 = var24 + "<br>" + re.a(ve.field_Gb, 4371, new String[]{var27});
                                  break L42;
                                }
                              }
                            }
                            dn.field_k = var24;
                            break L33;
                          } else {
                            L43: {
                              var28 = 255 & np.field_a.field_dc[var27_int];
                              var29 = 0;
                              if (td.field_E == null) {
                                break L43;
                              } else {
                                if (td.field_E[var27_int] == null) {
                                  break L43;
                                } else {
                                  if (!td.field_E[var27_int][var28]) {
                                    break L43;
                                  } else {
                                    if (!var12.field_Ub) {
                                      var29 = 1;
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                              }
                            }
                            L44: {
                              if (null == ci.field_h) {
                                break L44;
                              } else {
                                if (ci.field_h[var27_int] != null) {
                                  L45: {
                                    var30_int = ci.field_h[var27_int][var28];
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
                                  if (var12.field_Qb >= var30_int) {
                                    break L44;
                                  } else {
                                    var29 = 1;
                                    break L44;
                                  }
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L46: {
                              if (null == pg.field_A) {
                                break L46;
                              } else {
                                if (null != pg.field_A[var27_int]) {
                                  L47: {
                                    var30_int = pg.field_A[var27_int][var28];
                                    if (-1 == (var30_int ^ -1)) {
                                      break L47;
                                    } else {
                                      if (hm.field_o) {
                                        break L47;
                                      } else {
                                        if (var12.field_Ub) {
                                          break L47;
                                        } else {
                                          var29 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int > var12.field_Fb) {
                                    var29 = 1;
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L48: {
                              if (ji.field_D == null) {
                                break L48;
                              } else {
                                if (null == ji.field_D[var27_int]) {
                                  break L48;
                                } else {
                                  if (((var12.field_Wb ^ -1) & ji.field_D[var27_int][var28]) == 0) {
                                    break L48;
                                  } else {
                                    var29 = 1;
                                    break L48;
                                  }
                                }
                              }
                            }
                            L49: {
                              if (var29 != 0) {
                                var30 = "<col=A00000>" + gm.field_l[var27_int] + "</col>";
                                var25 = var30;
                                var24 = var25;
                                var25 = var30;
                                if (var25 == null) {
                                  var25 = var30;
                                  var24 = var25;
                                  var24 = var25;
                                  break L49;
                                } else {
                                  var26 = 1;
                                  var25 = var25 + ", " + var30;
                                  break L49;
                                }
                              } else {
                                break L49;
                              }
                            }
                            var27_int++;
                            continue L39;
                          }
                        }
                      } else {
                        break L33;
                      }
                    } else {
                      var11 = var12;
                      var12 = (mj) ((Object) var10.a((byte) -71));
                      continue L12;
                    }
                  }
                }
                var11 = var12;
                var12 = (mj) ((Object) var10.a((byte) -71));
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackOut_217_0 = (RuntimeException) (var5);
            stackOut_217_1 = new StringBuilder().append("dm.E(").append(param0).append(',').append(param1).append(',');
            stackIn_219_0 = stackOut_217_0;
            stackIn_219_1 = stackOut_217_1;
            stackIn_218_0 = stackOut_217_0;
            stackIn_218_1 = stackOut_217_1;
            if (param2 == null) {
              stackOut_219_0 = (RuntimeException) ((Object) stackIn_219_0);
              stackOut_219_1 = (StringBuilder) ((Object) stackIn_219_1);
              stackOut_219_2 = "null";
              stackIn_220_0 = stackOut_219_0;
              stackIn_220_1 = stackOut_219_1;
              stackIn_220_2 = stackOut_219_2;
              break L50;
            } else {
              stackOut_218_0 = (RuntimeException) ((Object) stackIn_218_0);
              stackOut_218_1 = (StringBuilder) ((Object) stackIn_218_1);
              stackOut_218_2 = "{...}";
              stackIn_220_0 = stackOut_218_0;
              stackIn_220_1 = stackOut_218_1;
              stackIn_220_2 = stackOut_218_2;
              break L50;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_220_0), stackIn_220_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        de.field_h = ff.field_v[param1];
        i.field_a = h.field_w[param1];
        if (param0 != 0) {
            ub var3 = (ub) null;
            dm.a(-32, 115, (ub) null, false, 125);
        }
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
              if (var3_int >= this.field_g) {
                break L0;
              } else {
                param0[var3_int] = this.field_b[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("dm.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, Object param1) {
        int fieldTemp$0 = 0;
        try {
            if (this.field_e == this.field_g) {
                this.a(-11470);
            }
            if (param0) {
                dm.a(((boolean[]) (((Object[]) (((Object[]) (this.field_b[7]))[2]))[1]))[4]);
            }
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_b[fieldTemp$0] = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public dm() {
        this.field_e = 10;
        this.field_g = 0;
        this.field_b = new Object[10];
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        field_f = null;
        field_d = null;
        field_a = null;
        if (param0) {
            ub var2 = (ub) null;
            dm.a(-33, 120, (ub) null, true, 27);
        }
    }

    static {
        field_a = "Shattered Plans has <%highlight>four different game types</col>, each with a different <%glossary>victory condition</col>.<br><br><%highlight>CONQUEST</col> - This is the simplest type of game: destroy all opponents to achieve victory. Any of the other game types can also be won in this way.<br><br><%highlight>CAPTURE AND HOLD</col> - The game has a fixed length of <%highlight>20 turns</col>, and a fixed map layout. In the centre of the map is <%highlight>Sol</col> and the damaged remains of Earth. At the end of each turn, the player who owns Sol earns <%highlight>1 point</col>. At the end of the 20 turns, the surviving player with the highest score wins. <%glossary>Ties</col> are broken in favour of the player who owns Sol. If none of the tied players own Sol, they draw and the other players lose.<br><br><%highlight>POINTS</col> - Players earn points each turn for the <%glossary>systems</col> they own. <%glossary>Colony homeworlds</col> are worth <%highlight>3 points</col> each turn, <%glossary>neutral homeworlds</col> are worth <%highlight>2 points</col>, and other worlds are worth <%highlight>1 point</col> each. The first player to reach the target number of points, which varies depending on map size, wins the game.<br><br><%highlight>DERELICTS</col> - Several <%glossary>derelict alien objects</col> are scattered around the map. Capturing a derelict allows you to begin researching it, earning you points each turn. This research is expensive, however, and so owning a derelict <%highlight>reduces your income<col> in each <%glossary>resource</col>. The first player to reach the target of <%highlight>50 points</col> wins.<br><br>";
        field_c = "Display Options";
        field_f = new bg("usename");
    }
}
