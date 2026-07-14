/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends eh {
    static ui field_l;
    int field_r;
    private int field_o;
    private int field_j;
    private lm field_q;
    static ei field_p;
    tl field_t;
    private int field_k;
    static String field_s;
    static int field_n;
    private int field_m;
    static int field_u;

    final static ak a(fj param0, byte param1) {
        int var2 = -118 / ((12 - param1) / 49);
        return new ak(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.i((byte) -101));
    }

    tl(int param0, int param1, int param2, int param3, int param4) {
        super((double)param0, (double)param1, (double)param2);
        ((tl) this).field_j = param2;
        ((tl) this).field_r = param3;
        ((tl) this).field_o = param1;
        ((tl) this).field_m = param0;
        ((tl) this).field_k = param4;
    }

    final boolean f(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 25468) {
          L0: {
            L1: {
              if (7 != ((tl) this).field_r) {
                break L1;
              } else {
                if (0 == ((tl) this).field_k) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public static void d(byte param0) {
        field_s = null;
        field_l = null;
        if (param0 >= -95) {
            field_u = -20;
        }
        field_p = null;
    }

    final lm a(byte param0) {
        if (param0 > -24) {
            ((tl) this).field_t = null;
        }
        return (lm) (Object) new ej(((tl) this).field_g[0], ((tl) this).field_g[1], ((tl) this).field_g[2], (double)this.e(-109));
    }

    final kh d(int param0) {
        kh var2 = null;
        kh var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kh var7 = null;
        kh var8 = null;
        kh var9 = null;
        kh var10 = null;
        var6 = Torquing.field_u;
        if ((((tl) this).field_r ^ -1) != -3) {
          if ((((tl) this).field_r ^ -1) != -2) {
            if (param0 == -2) {
              return vc.field_c[((tl) this).field_r];
            } else {
              return null;
            }
          } else {
            L0: {
              var2 = (kh) (Object) on.field_e.a((long)((tl) this).field_k, (byte) 94);
              if (var2 == null) {
                L1: {
                  var8 = new kh(vc.field_c[((tl) this).field_r], true, false, true, true);
                  var10 = var8;
                  var2_ref = var10;
                  if (((tl) this).field_k > 100) {
                    if (((tl) this).field_k > 250) {
                      if ((((tl) this).field_k ^ -1) >= -501) {
                        var3 = 107;
                        break L1;
                      } else {
                        var3 = 12256;
                        break L1;
                      }
                    } else {
                      var3 = 3800;
                      break L1;
                    }
                  } else {
                    var3 = 127;
                    break L1;
                  }
                }
                var4 = var10.field_l.field_g - 1;
                L2: while (true) {
                  if ((var4 ^ -1) > -1) {
                    on.field_e.a(false, (long)((tl) this).field_k, (q) (Object) var10);
                    break L0;
                  } else {
                    L3: {
                      if (var8.field_l.field_m[var4] == 127) {
                        var8.field_l.field_m[var4] = (short)var3;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4--;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return var2_ref;
          }
        } else {
          L4: {
            var2 = (kh) (Object) og.field_k.a((long)((tl) this).field_k, (byte) 117);
            if (var2 == null) {
              L5: {
                var7 = new kh(vc.field_c[((tl) this).field_r], true, false, true, true);
                var9 = var7;
                var2_ref = var9;
                if (((tl) this).field_k > 5) {
                  if (((tl) this).field_k > 10) {
                    if (-16 > (((tl) this).field_k ^ -1)) {
                      if (((tl) this).field_k <= 20) {
                        var4 = 1023;
                        var3 = 0;
                        break L5;
                      } else {
                        if (25 >= ((tl) this).field_k) {
                          var3 = 44032;
                          var4 = 1023;
                          break L5;
                        } else {
                          if ((((tl) this).field_k ^ -1) >= -31) {
                            var3 = 21504;
                            var4 = 1023;
                            break L5;
                          } else {
                            var4 = 1023;
                            var3 = 11264;
                            break L5;
                          }
                        }
                      }
                    } else {
                      var3 = 5120;
                      var4 = 1023;
                      break L5;
                    }
                  } else {
                    var3 = 96;
                    var4 = 0;
                    break L5;
                  }
                } else {
                  var4 = 0;
                  var3 = 32;
                  break L5;
                }
              }
              var5 = var9.field_l.field_g + -1;
              L6: while (true) {
                if ((var5 ^ -1) > -1) {
                  og.field_k.a(false, (long)((tl) this).field_k, (q) (Object) var9);
                  break L4;
                } else {
                  L7: {
                    if ((var7.field_l.field_m[var5] ^ -1) != -128) {
                      var9.field_l.field_m[var5] = (short)gm.a(ie.a((int) var7.field_l.field_m[var5], var4), var3);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var5--;
                  continue L6;
                }
              }
            } else {
              break L4;
            }
          }
          return var2_ref;
        }
    }

    final static h a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
            h discarded$0 = tl.a(44, -118, 22, -115);
        }
        h var4 = new h();
        var4.field_k = new int[param2];
        var4.field_m = param1;
        to.field_s.a((byte) 54, (q) (Object) var4);
        va.a(var4, (byte) 119, param0);
        return var4;
    }

    final void a(bi param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        ei stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        sb stackIn_41_2 = null;
        sb stackIn_41_3 = null;
        String stackIn_41_4 = null;
        int stackIn_41_5 = 0;
        int stackIn_41_6 = 0;
        ei stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        sb stackIn_42_2 = null;
        sb stackIn_42_3 = null;
        String stackIn_42_4 = null;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        ei stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        sb stackIn_43_2 = null;
        sb stackIn_43_3 = null;
        String stackIn_43_4 = null;
        int stackIn_43_5 = 0;
        int stackIn_43_6 = 0;
        int stackIn_43_7 = 0;
        ei stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        sb stackIn_45_2 = null;
        sb stackIn_45_3 = null;
        String stackIn_45_4 = null;
        int stackIn_45_5 = 0;
        int stackIn_45_6 = 0;
        ei stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        sb stackIn_46_2 = null;
        sb stackIn_46_3 = null;
        String stackIn_46_4 = null;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        ei stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        sb stackIn_47_2 = null;
        sb stackIn_47_3 = null;
        String stackIn_47_4 = null;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        ei stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        sb stackOut_44_2 = null;
        sb stackOut_44_3 = null;
        String stackOut_44_4 = null;
        int stackOut_44_5 = 0;
        int stackOut_44_6 = 0;
        ei stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        sb stackOut_46_2 = null;
        sb stackOut_46_3 = null;
        String stackOut_46_4 = null;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        ei stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        sb stackOut_45_2 = null;
        sb stackOut_45_3 = null;
        String stackOut_45_4 = null;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        ei stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        sb stackOut_40_2 = null;
        sb stackOut_40_3 = null;
        String stackOut_40_4 = null;
        int stackOut_40_5 = 0;
        int stackOut_40_6 = 0;
        ei stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        sb stackOut_42_2 = null;
        sb stackOut_42_3 = null;
        String stackOut_42_4 = null;
        int stackOut_42_5 = 0;
        int stackOut_42_6 = 0;
        int stackOut_42_7 = 0;
        ei stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        sb stackOut_41_2 = null;
        sb stackOut_41_3 = null;
        String stackOut_41_4 = null;
        int stackOut_41_5 = 0;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        var10 = Torquing.field_u;
        if (param1 == 19) {
          L0: {
            var15 = gj.field_i;
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var3 = var11;
            var4 = (-var15[2] + ((tl) this).field_j) * var15[5] + var15[3] * (-var15[0] + ((tl) this).field_m) - -((-var15[1] + ((tl) this).field_o) * var15[4]) >> -1378221168;
            var5 = (((tl) this).field_j + -var15[2]) * var15[8] + ((-var15[1] + ((tl) this).field_o) * var15[7] + var15[6] * (((tl) this).field_m - var15[0])) >> 1817498320;
            var6 = var15[9] * (-var15[0] + ((tl) this).field_m) - -(var15[10] * (((tl) this).field_o + -var15[1])) + var15[11] * (((tl) this).field_j + -var15[2]) >> 1890150896;
            var7 = (var4 << -81261975) / var6 + be.field_g;
            var8 = (var5 << -1017731031) / var6 + be.field_b;
            var9 = ((tl) this).field_r;
            if (0 == var9) {
              param0.g(param1 ^ 111);
              th.a(100, th.field_F[18]);
              la.field_k[11].a(false);
              jh.a(la.field_k[11], 0);
              break L0;
            } else {
              if ((var9 ^ -1) != -2) {
                if (var9 == 2) {
                  L1: {
                    param0.b((byte) 122, 1000 * ((tl) this).field_k);
                    stackOut_44_0 = param0.field_e;
                    stackOut_44_1 = 54;
                    stackOut_44_2 = null;
                    stackOut_44_3 = null;
                    stackOut_44_4 = wh.a(((tl) this).field_k * 1000, (byte) 21);
                    stackOut_44_5 = var7;
                    stackOut_44_6 = var8;
                    stackIn_46_0 = stackOut_44_0;
                    stackIn_46_1 = stackOut_44_1;
                    stackIn_46_2 = stackOut_44_2;
                    stackIn_46_3 = stackOut_44_3;
                    stackIn_46_4 = stackOut_44_4;
                    stackIn_46_5 = stackOut_44_5;
                    stackIn_46_6 = stackOut_44_6;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    stackIn_45_2 = stackOut_44_2;
                    stackIn_45_3 = stackOut_44_3;
                    stackIn_45_4 = stackOut_44_4;
                    stackIn_45_5 = stackOut_44_5;
                    stackIn_45_6 = stackOut_44_6;
                    if (-31 >= (((tl) this).field_k ^ -1)) {
                      stackOut_46_0 = (ei) (Object) stackIn_46_0;
                      stackOut_46_1 = stackIn_46_1;
                      stackOut_46_2 = null;
                      stackOut_46_3 = null;
                      stackOut_46_4 = (String) (Object) stackIn_46_4;
                      stackOut_46_5 = stackIn_46_5;
                      stackOut_46_6 = stackIn_46_6;
                      stackOut_46_7 = 2;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      stackIn_47_2 = stackOut_46_2;
                      stackIn_47_3 = stackOut_46_3;
                      stackIn_47_4 = stackOut_46_4;
                      stackIn_47_5 = stackOut_46_5;
                      stackIn_47_6 = stackOut_46_6;
                      stackIn_47_7 = stackOut_46_7;
                      break L1;
                    } else {
                      stackOut_45_0 = (ei) (Object) stackIn_45_0;
                      stackOut_45_1 = stackIn_45_1;
                      stackOut_45_2 = null;
                      stackOut_45_3 = null;
                      stackOut_45_4 = (String) (Object) stackIn_45_4;
                      stackOut_45_5 = stackIn_45_5;
                      stackOut_45_6 = stackIn_45_6;
                      stackOut_45_7 = 3;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_47_2 = stackOut_45_2;
                      stackIn_47_3 = stackOut_45_3;
                      stackIn_47_4 = stackOut_45_4;
                      stackIn_47_5 = stackOut_45_5;
                      stackIn_47_6 = stackOut_45_6;
                      stackIn_47_7 = stackOut_45_7;
                      break L1;
                    }
                  }
                  new sb(stackIn_47_4, stackIn_47_5, stackIn_47_6, stackIn_47_7);
                  ((ei) (Object) stackIn_47_0).a((byte) stackIn_47_1, (q) (Object) stackIn_47_2);
                  th.a(100, th.field_F[7]);
                  break L0;
                } else {
                  if (-5 == (var9 ^ -1)) {
                    param0.c((byte) 122);
                    param0.field_e.a((byte) 54, (q) (Object) new sb(gi.field_b, var7, var8, 3));
                    th.a(100, th.field_F[9]);
                    break L0;
                  } else {
                    if (var9 == 5) {
                      param0.a((byte) 121);
                      th.a(100, th.field_F[8]);
                      th.a(100, th.field_F[27]);
                      break L0;
                    } else {
                      if ((var9 ^ -1) != -8) {
                        if (-7 != (var9 ^ -1)) {
                          if ((var9 ^ -1) == -9) {
                            param0.a(0);
                            param0.field_e.a((byte) 54, (q) (Object) new sb(je.field_i, var7, var8, 3));
                            th.a(param1 + 81, th.field_F[18]);
                            break L0;
                          } else {
                            L2: {
                              if (9 != var9) {
                                if (-11 != (var9 ^ -1)) {
                                  if ((var9 ^ -1) != -12) {
                                    if (var9 != 12) {
                                      if (var9 != 13) {
                                        if ((var9 ^ -1) != -15) {
                                          if (var9 != 15) {
                                            if (-17 != (var9 ^ -1)) {
                                              L3: {
                                                if ((var9 ^ -1) == -18) {
                                                  break L3;
                                                } else {
                                                  if (18 == var9) {
                                                    break L3;
                                                  } else {
                                                    if (-20 != (var9 ^ -1)) {
                                                      if (var9 == 21) {
                                                        break L3;
                                                      } else {
                                                        if ((var9 ^ -1) == -21) {
                                                          break L3;
                                                        } else {
                                                          if (-23 == (var9 ^ -1)) {
                                                            break L3;
                                                          } else {
                                                            if (-24 == (var9 ^ -1)) {
                                                              break L3;
                                                            } else {
                                                              if (-25 != (var9 ^ -1)) {
                                                                break L0;
                                                              } else {
                                                                break L3;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              }
                                              param0.a((byte) 113, 1000);
                                              param0.field_e.a((byte) 54, (q) (Object) new sb(nc.field_c, var7, var8, 3));
                                              param0.a((byte) -68, vc.field_c[((tl) this).field_r], 1092, 72);
                                              param0.field_i = vc.field_c[((tl) this).field_r];
                                              param0.field_z = param0.field_z | 1 << param0.field_d.field_s;
                                              la.field_k[10].g();
                                              jh.a(la.field_k[10], 0);
                                              break L0;
                                            } else {
                                              param0.field_e.a((byte) 54, (q) (Object) new sb(Integer.toString(1000), var7, var8, 2));
                                              param0.a((byte) 124, 1000);
                                              param0.a(-9 + ((tl) this).field_r, -73);
                                              break L0;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            param0.field_e.a((byte) 54, (q) (Object) new sb(Integer.toString(1000), var7, var8, 2));
                            param0.a((byte) 124, 1000);
                            param0.a(-9 + ((tl) this).field_r, -73);
                            break L0;
                          }
                        } else {
                          param0.e(-7045);
                          param0.field_e.a((byte) 54, (q) (Object) new sb(ea.field_u, var7, var8, 3));
                          th.a(param1 ^ 119, th.field_F[19]);
                          th.a(100, th.field_F[10]);
                          break L0;
                        }
                      } else {
                        param0.a(((tl) this).field_c, ((tl) this).field_g[1], ((tl) this).field_g[0], ((tl) this).field_h, ((tl) this).field_g[2], 0);
                        th.a(param1 + 81, th.field_F[13]);
                        break L0;
                      }
                    }
                  }
                }
              } else {
                L4: {
                  param0.a((byte) 98, ((tl) this).field_k);
                  stackOut_40_0 = param0.field_e;
                  stackOut_40_1 = 54;
                  stackOut_40_2 = null;
                  stackOut_40_3 = null;
                  stackOut_40_4 = Integer.toString(((tl) this).field_k);
                  stackOut_40_5 = var7;
                  stackOut_40_6 = var8;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  stackIn_42_3 = stackOut_40_3;
                  stackIn_42_4 = stackOut_40_4;
                  stackIn_42_5 = stackOut_40_5;
                  stackIn_42_6 = stackOut_40_6;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  stackIn_41_3 = stackOut_40_3;
                  stackIn_41_4 = stackOut_40_4;
                  stackIn_41_5 = stackOut_40_5;
                  stackIn_41_6 = stackOut_40_6;
                  if ((((tl) this).field_k ^ -1) > -501) {
                    stackOut_42_0 = (ei) (Object) stackIn_42_0;
                    stackOut_42_1 = stackIn_42_1;
                    stackOut_42_2 = null;
                    stackOut_42_3 = null;
                    stackOut_42_4 = (String) (Object) stackIn_42_4;
                    stackOut_42_5 = stackIn_42_5;
                    stackOut_42_6 = stackIn_42_6;
                    stackOut_42_7 = 3;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    stackIn_43_2 = stackOut_42_2;
                    stackIn_43_3 = stackOut_42_3;
                    stackIn_43_4 = stackOut_42_4;
                    stackIn_43_5 = stackOut_42_5;
                    stackIn_43_6 = stackOut_42_6;
                    stackIn_43_7 = stackOut_42_7;
                    break L4;
                  } else {
                    stackOut_41_0 = (ei) (Object) stackIn_41_0;
                    stackOut_41_1 = stackIn_41_1;
                    stackOut_41_2 = null;
                    stackOut_41_3 = null;
                    stackOut_41_4 = (String) (Object) stackIn_41_4;
                    stackOut_41_5 = stackIn_41_5;
                    stackOut_41_6 = stackIn_41_6;
                    stackOut_41_7 = 2;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_43_2 = stackOut_41_2;
                    stackIn_43_3 = stackOut_41_3;
                    stackIn_43_4 = stackOut_41_4;
                    stackIn_43_5 = stackOut_41_5;
                    stackIn_43_6 = stackOut_41_6;
                    stackIn_43_7 = stackOut_41_7;
                    break L4;
                  }
                }
                new sb(stackIn_43_4, stackIn_43_5, stackIn_43_6, stackIn_43_7);
                ((ei) (Object) stackIn_43_0).a((byte) stackIn_43_1, (q) (Object) stackIn_43_2);
                th.a(param1 + 81, th.field_F[19]);
                th.a(100, th.field_F[6]);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, double[] param1) {
        double var3 = ap.b(param1, param0, ((tl) this).field_g, 0) - 30.0;
        return (double)this.e(param0 ^ -127) > var3 ? true : false;
    }

    private final int e(int param0) {
        rm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Torquing.field_u;
        int var2 = -108 % ((-61 - param0) / 36);
        if (!(0 != al.field_e[((tl) this).field_r])) {
            var3 = ((tl) this).d(-2).field_l;
            var4 = 0;
            for (var5 = 0; (var3.field_f ^ -1) < (var5 ^ -1); var5++) {
                var6 = var3.field_M[var5];
                var7 = var3.field_E[var5];
                var8 = var7 * var7 + var6 * var6;
                if (!(var4 >= var8)) {
                    var4 = var8;
                }
            }
            al.field_e[((tl) this).field_r] = (int)(0.99 + Math.sqrt((double)var4));
        }
        return al.field_e[((tl) this).field_r];
    }

    final double a(int param0, double param1) {
        if (param0 != 0) {
            kh discarded$0 = ((tl) this).d(-97);
        }
        if (!(!((tl) this).f(25468))) {
            ((tl) this).field_g = hl.a(param1, qd.field_h, false, param0 + -6076, false, false, 30.0, 0.0, ((tl) this).field_a, ((tl) this).field_g, qd.field_h);
            ((tl) this).c(0);
            ((tl) this).field_h.a(((tl) this).d(-2), ((tl) this).field_f);
        }
        return ap.a(((tl) this).field_g, 0, re.field_d, 0);
    }

    final void e(byte param0) {
        ((tl) this).field_g = new double[13];
        ((tl) this).field_g[2] = (double)((tl) this).field_j;
        ((tl) this).field_g[1] = (double)((tl) this).field_o;
        ((tl) this).field_g[6] = 1.0;
        ((tl) this).field_g[0] = (double)((tl) this).field_m;
        if (param0 >= -77) {
            return;
        }
        if (3 != ((tl) this).field_r) {
            if ((((tl) this).field_r ^ -1) <= -26) {
                // if_icmplt L89
            } else {
                boolean discarded$0 = he.a(((tl) this).field_a, 0.08, ((tl) this).field_g, 16777215, 30.0);
            }
        }
        ((tl) this).c(0);
        ((tl) this).field_d = null;
        if (null == ((tl) this).field_q) {
            ((tl) this).b(1);
            ((tl) this).field_q = ((tl) this).field_d;
        } else {
            ((tl) this).field_d = ((tl) this).field_q;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new ui(0, 0);
        field_s = "Orb points: <%0>";
        field_p = new ei();
    }
}
