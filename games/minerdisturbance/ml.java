/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private int field_m;
    private int field_j;
    private int field_n;
    static int field_d;
    private int field_k;
    private int[] field_r;
    private nn field_o;
    private int field_e;
    private int field_h;
    private int field_q;
    private int field_i;
    private int field_g;
    static char[] field_c;
    private boolean field_b;
    private boolean field_p;
    private int field_l;
    static int field_a;
    private int field_f;

    private final int b(int param0, int param1) {
        boolean stackIn_87_0 = false;
        boolean stackIn_127_1 = false;
        kd stackIn_142_0 = null;
        boolean stackIn_143_1 = false;
        boolean stackIn_209_0 = false;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var5_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        if (param0 != 468) {
          return -66;
        }
        var3 = this.field_r[param1];
        var4 = -2;
        var5 = (lj.field_t + rg.field_sb + (nk.field_w + m.field_e)) % 8;
        if (var5 != 0) {
          if (var5 == 1) {
            di.field_X = di.field_X + ac.field_b;
            qd.field_M = qd.field_M - 1;
          } else {
            if (var5 != 2) {
              if (var5 != 3) {
                if (var5 == 4) {
                  ac.field_b = ac.field_b + 1;
                  vh.field_g = vh.field_g + qd.field_M;
                } else {
                  if (var5 != 5) {
                    if (var5 == 6) {
                      vh.field_g = vh.field_g - qd.field_M;
                      ac.field_b = ac.field_b - 1;
                    } else {
                      if (var5 == 7) {
                        vh.field_g = vh.field_g - ac.field_b;
                        qd.field_M = qd.field_M - 1;
                      }
                    }
                  } else {
                    qd.field_M = qd.field_M + 1;
                    vh.field_g = vh.field_g + ac.field_b;
                  }
                }
              } else {
                qd.field_M = qd.field_M + 1;
                di.field_X = di.field_X - ac.field_b;
              }
            } else {
              ac.field_b = ac.field_b + 1;
              di.field_X = di.field_X - qd.field_M;
            }
          }
        } else {
          di.field_X = di.field_X + qd.field_M;
          ac.field_b = ac.field_b - 1;
        }
        var5 = (lj.field_t + (rg.field_sb + (nk.field_w + m.field_e))) % 4;
        if (var5 != 0) {
          if (1 == var5) {
            pn.field_b = pn.field_b - aa.field_b;
            hl.field_b = hl.field_b - 1;
          } else {
            if (var5 != 2) {
              if (var5 == 3) {
                aa.field_b = aa.field_b - 1;
                pn.field_b = pn.field_b - hl.field_b;
              }
            } else {
              aa.field_b = aa.field_b + 1;
              pn.field_b = pn.field_b + hl.field_b;
            }
          }
        } else {
          pn.field_b = pn.field_b + aa.field_b;
          hl.field_b = hl.field_b + 1;
        }
        boolean decompiledFrameRemainder0 = true;
        var5 = var3;
        if (var5 == 3) {
          if (this.field_o.a((byte) 113)) {
            if (kj.a(false) &&
              this.field_n != 0) {
              var4 = 8;
            } else {
              var4 = 3;
            }
            tk.field_a = true;
          }
        } else {
          if (17 != var5) {
            if (19 != var5) {
              if (12 != var5) {
                if (7 != var5) {
                  if (var5 != 18) {
                    if (var5 != 9) {
                      if (var5 != 8) {
                        if (2 != var5) {
                          if (25 != var5) {
                            if (var5 != 1) {
                              if (var5 == 10) {
                                if (this.field_o.a((byte) 113) &&
                                  this.field_k < 6 &&
                                  !this.a(117)) {
                                  this.field_g = this.field_k;
                                  this.d(1, -502);
                                  this.field_k = this.field_k + 1;
                                }
                              } else {
                                if (var5 != 11) {
                                  if (var5 != 15) {
                                    if (0 == var5) {
                                      if (this.field_o.a((byte) 15)) {
                                        tk.field_a = true;
                                        if (0 == mc.field_w &&
                                          oj.field_J != 2 &&
                                          oj.field_J != 5) {
                                          var4 = 0;
                                        } else {
                                          var4 = 4;
                                        }
                                      }
                                    } else {
                                      if (var5 == 16) {
                                        if (this.field_o.a((byte) 112)) {
                                          ge.field_c = true;
                                          jf.field_b = this.field_n;
                                          if (8 == this.field_n) {
                                            tm.field_v = 3;
                                          } else {
                                            if (this.field_n == 6 &&
                                              ig.a(-20144)) {
                                              tm.field_v = 5;
                                            } else {
                                              if (9 == this.field_n) {
                                                tm.field_v = 9;
                                              } else {
                                                tm.field_v = 2;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (var5 == 6) {
                                          if (this.field_o.b(-96)) {
                                            fc.a(0, (byte) 97);
                                          }
                                          if (this.field_o.c(98)) {
                                            fc.a(256, (byte) 89);
                                          }
                                          if (this.field_o.d((byte) 77)) {
                                            var5 = 8;
                                            if (kb.field_c == 2) {
                                              var5 += 20;
                                            }
                                            var6 = -var5 - 134 + nk.field_w;
                                            if (var6 > 0) {
                                              if (144 <= var6) {
                                                fc.a(256, (byte) 62);
                                              } else {
                                                fc.a(256 * var6 / 144, (byte) 68);
                                              }
                                            } else {
                                              fc.a(0, (byte) 54);
                                            }
                                          }
                                          if (this.field_o.a(-95)) {
                                            cl.p(param0 - 403);
                                          }
                                          if (this.field_o.e((byte) 126)) {
                                            ol.a((byte) -94);
                                          }
                                        } else {
                                          if (22 == var5) {
                                            if (this.field_o.a((byte) -87)) {
                                              tk.field_a = true;
                                              var4 = 10;
                                            }
                                          } else {
                                            if (var5 != 23) {
                                              if (var5 != 14) {
                                                if (var5 != 21) {
                                                  if (var5 != 24 &&
                                                    var5 != 20) {
                                                    if (var5 == 4) {
                                                      if (!(!this.field_o.a((byte) -45))) {
                                                        ng.a((byte) 73);
                                                        try {
                                                          uf.a(13, bm.c(param0 - 555));
                                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                          decompiledCaughtException = decompiledCaughtParameter0;
                                                          var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                          var5_ref_Exception.printStackTrace();
                                                        }
                                                      }
                                                    } else {
                                                      if (var5 == 13) {
                                                        if (!(!this.field_o.a((byte) -57))) {
                                                          var4 = -1;
                                                          el.field_c = true;
                                                        }
                                                      } else {
                                                        if ((var5 == 5)) {
                                                          if (this.field_o.b(-94)) {
                                                            ma.a(-124, 0);
                                                          }
                                                          if (this.field_o.c(-64)) {
                                                            ma.a(-107, 256);
                                                          }
                                                          if (this.field_o.d((byte) 77)) {
                                                            var5 = 8;
                                                            if (kb.field_c == 2) {
                                                              var5 += 20;
                                                            }
                                                            var6 = nk.field_w - (var5 + 134);
                                                            if (var6 <= 0) {
                                                              oc.field_f = 0;
                                                            } else {
                                                              if (144 <= var6) {
                                                                oc.field_f = 256;
                                                              } else {
                                                                oc.field_f = var6 * 256 / 144;
                                                              }
                                                            }
                                                          }
                                                          if (this.field_o.a(112)) {
                                                            fc.a(false);
                                                          }
                                                          if (!(!this.field_o.e((byte) 127))) {
                                                            pn.b(60);
                                                          }
                                                        }
                                                      }
                                                    }
                                                    decompiledFrameRemainder0 = false;
                                                  }
                                                } else {
                                                  decompiledFrameRemainder0 = !(pj.field_a <= 0);
                                                  if (decompiledFrameRemainder0) {
                                                    decompiledFrameRemainder0 = !(!ci.field_b);
                                                  }
                                                }
                                                if ((decompiledFrameRemainder0) &&
                                                  (this.field_o.a((byte) 122))) {
                                                  if (var3 != 20 &&
                                                    24 != var3 &&
                                                    0 < pj.field_a) {
                                                    if (21 == var3) {
                                                      ah.field_f = 1;
                                                    }
                                                  } else {
                                                    decompiledFrameRemainder0 = !(!qd.field_S);
                                                    if (decompiledFrameRemainder0) {
                                                      ah.field_f = 0;
                                                    }
                                                  }
                                                  if (decompiledFrameRemainder0) {
                                                    if (nd.a(ah.field_f, param0 ^ 469) ||
                                                      ne.a((byte) 10, 27)) {
                                                      cm.field_n = cm.field_n + 1;
                                                    }
                                                    if (!d.field_c) {
                                                      sc.field_b = false;
                                                      if (0 == cm.field_n) {
                                                        sc.field_b = true;
                                                        if (sc.field_b) {
                                                          stackIn_209_0 = !(wj.g(122));
                                                          sc.field_b = stackIn_209_0;
                                                        }
                                                      }
                                                      sn.field_b[1] = null;
                                                      sn.field_b[0] = null;
                                                      pd.field_b.field_Q = new mc(pd.field_b, this.field_o.field_d);
                                                      var4 = -1;
                                                      el.field_c = true;
                                                    } else {
                                                      sn.field_b[1] = null;
                                                      sn.field_b[0] = null;
                                                      pd.field_b.field_Q = new mc(pd.field_b, this.field_o.field_d);
                                                      var4 = -1;
                                                      el.field_c = true;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (this.field_o.a((byte) 125)) {
                                                  tk.field_a = true;
                                                  var4 = 9;
                                                }
                                              }
                                            } else {
                                              if (this.field_o.a((byte) -72)) {
                                                tk.field_a = true;
                                                var4 = 11;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (this.field_o.a((byte) -46)) {
                                      var4 = 4;
                                      tk.field_a = true;
                                      stackIn_142_0 = wk.field_a;
                                      stackIn_143_1 = !(u.b(-4440) >= mk.b(58));
                                      ((kd) (Object) stackIn_142_0).a(stackIn_143_1, true);
                                    }
                                  }
                                } else {
                                  if (this.field_o.a((byte) -101) &&
                                    this.field_k > 0 &&
                                    !this.a(121)) {
                                    this.field_g = this.field_k;
                                    this.d(1, param0 - 970);
                                    this.field_k = this.field_k - 1;
                                    this.field_p = true;
                                  }
                                }
                              }
                            } else {
                              if (this.field_o.a((byte) 108)) {
                                tk.field_a = true;
                                var4 = 1;
                              }
                            }
                          } else {
                            if (this.field_o.a((byte) 27) &&
                              !this.a(99)) {
                              this.d(3, -502);
                              this.field_i = (1 + this.field_i) % 2;
                              stackIn_127_1 = (nk.field_w > 468) && (520 > nk.field_w);
                              this.field_p = stackIn_127_1;
                            }
                          }
                        } else {
                          if (this.field_o.a((byte) 126)) {
                            if (this.field_n != 5) {
                              var4 = (!kj.a(false)) ? 2 : 7;
                            } else {
                              var4 = 2;
                              kd.a(cm.field_o, (byte) -93);
                            }
                            tk.field_a = true;
                          }
                        }
                      } else {
                        if (this.field_o.a((byte) 115) &&
                          !this.a(111) &&
                          this.field_f != 1) {
                          this.field_g = this.field_f;
                          this.d(2, -502);
                          this.field_f = 1;
                        }
                      }
                    } else {
                      if (this.field_o.a((byte) 113) &&
                        !this.a(123) &&
                        this.field_f != 2) {
                        this.field_g = this.field_f;
                        this.d(2, -502);
                        this.field_f = 2;
                      }
                    }
                  } else {
                    if (this.field_o.a((byte) 112)) {
                      kj.a(-62);
                    }
                  }
                } else {
                  if (this.field_o.a((byte) -9) &&
                    !this.a(param0 ^ 446) &&
                    this.field_f != 0) {
                    this.field_g = this.field_f;
                    this.d(2, param0 - 970);
                    this.field_f = 0;
                  }
                }
              } else {
                if (this.field_o.a((byte) 10)) {
                  if (null != kf.field_d) {
                    ng.a((byte) -122);
                  } else {
                    cl.q(-64);
                  }
                }
              }
            } else {
              if (this.field_o.a((byte) 16)) {
                d.field_c = true;
                if (sc.field_b) {
                  mg.a((byte) -125);
                }
                stackIn_87_0 = !(sc.field_b);
                sc.field_b = stackIn_87_0;
              }
            }
          } else {
            if (this.field_o.a((byte) -3)) {
              rj.a((byte) -38, 6);
              pd.field_b.s(param0 ^ 428);
              var4 = -1;
              el.field_c = true;
            }
          }
        }
        return var4;
    }

    final boolean c(int param0) {
        if (param0 >= -29) {
          return true;
        }
        return true;
    }

    final static void a(sb param0, byte param1, sb param2) {
        ql[] array$0 = null;
        ql dupTemp$3 = null;
        ql[] array$1 = null;
        ql dupTemp$2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        ql[] var3 = null;
        RuntimeException var3_ref = null;
        String[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ql[] var17 = null;
        int var18 = 0;
        ql var18_ref_ql = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        ql var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        String[][] var28 = null;
        ql[] var29 = null;
        String[][] var30 = null;
        String[][] var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var23Lifetime1;
        var25 = MinerDisturbance.field_ab;
        try {
          array$0 = new ql[je.field_N[0]];
          kn.field_H[0] = array$0;
          var29 = array$0;
          var3 = var29;
          var28 = fg.a(65, param2);
          var4 = var28;
          var5 = -1;
          if (param1 != 0) {
            return;
          }
          var6 = -1;
          var7 = -1;
          var8 = -1;
          var9 = -1;
          var10 = -1;
          var11 = -1;
          var12 = -1;
          var13 = -1;
          var14 = -1;
          var15 = -1;
          var16 = -1;
          for (var17_int = 0; var28[0].length > var17_int; var17_int++) {
            if (var28[0][var17_int].equalsIgnoreCase("Iron Prob")) {
              var5 = var17_int;
            } else {
              if (!var28[0][var17_int].equalsIgnoreCase("Silver Prob")) {
                if (!var28[0][var17_int].equalsIgnoreCase("Gold Prob")) {
                  if (!var28[0][var17_int].equalsIgnoreCase("Effluvium Prob")) {
                    if (!var28[0][var17_int].equalsIgnoreCase("Diamond Prob")) {
                      if (!var28[0][var17_int].equalsIgnoreCase("Boulder Prob")) {
                        if (var28[0][var17_int].equalsIgnoreCase("Hole Prob")) {
                          var11 = var17_int;
                        } else {
                          if (!var28[0][var17_int].equalsIgnoreCase("Water Cell")) {
                            if (!var28[0][var17_int].equalsIgnoreCase("Gas Cell")) {
                              if (!var28[0][var17_int].equalsIgnoreCase("Random Water Cell")) {
                                if (!var28[0][var17_int].equalsIgnoreCase("Random Gas Cell")) {
                                  if (var28[0][var17_int].equalsIgnoreCase("Central Hole")) {
                                    var16 = var17_int;
                                  }
                                } else {
                                  var15 = var17_int;
                                }
                              } else {
                                var13 = var17_int;
                              }
                            } else {
                              var14 = var17_int;
                            }
                          } else {
                            var12 = var17_int;
                          }
                        }
                      } else {
                        var10 = var17_int;
                      }
                    } else {
                      var9 = var17_int;
                    }
                  } else {
                    var8 = var17_int;
                  }
                } else {
                  var7 = var17_int;
                }
              } else {
                var6 = var17_int;
              }
            }
          }
          var26 = 0;
          var17_intLifetime1 = var26;
          while (var29.length > var26) {
            dupTemp$3 = new ql();
            var3[var26] = dupTemp$3;
            var18_ref_ql = dupTemp$3;
            var18_ref_ql.field_o[0] = Integer.parseInt(var4[var26 + 1][var5]);
            var18_ref_ql.field_o[1] = Integer.parseInt(var4[var26 + 1][var6]);
            var18_ref_ql.field_o[2] = Integer.parseInt(var4[var26 + 1][var7]);
            var18_ref_ql.field_o[3] = Integer.parseInt(var4[var26 + 1][var8]);
            var18_ref_ql.field_o[4] = Integer.parseInt(var4[1 + var26][var9]);
            var18_ref_ql.field_e = Integer.parseInt(var4[1 + var26][var10]);
            var18_ref_ql.field_d = Integer.parseInt(var4[1 + var26][var11]);
            var18_ref_ql.field_f = Boolean.valueOf(var4[var26 + 1][var14]).booleanValue();
            var18_ref_ql.field_k = Boolean.valueOf(var4[var26 + 1][var12]).booleanValue();
            var18_ref_ql.field_i = Boolean.valueOf(var4[var26 + 1][var13]).booleanValue();
            var18_ref_ql.field_b = Boolean.valueOf(var4[var26 + 1][var15]).booleanValue();
            var18_ref_ql.field_n = Boolean.valueOf(var4[1 + var26][var16]).booleanValue();
            var26++;
          }
          array$1 = new ql[je.field_N[1]];
          kn.field_H[1] = array$1;
          var17 = array$1;
          var8Lifetime1 = -1;
          var12Lifetime1 = -1;
          var6Lifetime1 = -1;
          var7Lifetime1 = -1;
          var15Lifetime1 = -1;
          var13Lifetime1 = -1;
          var16Lifetime1 = -1;
          var30 = fg.a(65, param0);
          var4Lifetime1 = var30;
          var10Lifetime1 = -1;
          var5Lifetime1 = -1;
          var14Lifetime1 = -1;
          var11Lifetime1 = -1;
          var9Lifetime1 = -1;
          var18 = -1;
          var19 = -1;
          var20 = -1;
          var21 = -1;
          var22 = -1;
          for (var23 = 0; var23 < var30[0].length; var23++) {
            if (var30[0][var23].equalsIgnoreCase("Iron Prob")) {
              var5Lifetime1 = var23;
            } else {
              if (!var30[0][var23].equalsIgnoreCase("Silver Prob")) {
                if (!var30[0][var23].equalsIgnoreCase("Gold Prob")) {
                  if (!var30[0][var23].equalsIgnoreCase("Effluvium Prob")) {
                    if (var30[0][var23].equalsIgnoreCase("Diamond Prob")) {
                      var9Lifetime1 = var23;
                    } else {
                      if (!var30[0][var23].equalsIgnoreCase("Boulder Prob")) {
                        if (!var30[0][var23].equalsIgnoreCase("Hole Prob")) {
                          if (!var30[0][var23].equalsIgnoreCase("Water Cell")) {
                            if (!var30[0][var23].equalsIgnoreCase("Gas Cell")) {
                              if (!var30[0][var23].equalsIgnoreCase("Random Water Cell")) {
                                if (var30[0][var23].equalsIgnoreCase("Oil Cell")) {
                                  var18 = var23;
                                } else {
                                  if (!var30[0][var23].equalsIgnoreCase("Earth Prob")) {
                                    if (var30[0][var23].equalsIgnoreCase("Freeze Prob")) {
                                      var19 = var23;
                                    } else {
                                      if (var30[0][var23].equalsIgnoreCase("Random Gas Cell")) {
                                        var15Lifetime1 = var23;
                                      } else {
                                        if (!var30[0][var23].equalsIgnoreCase("Monster Is Walrus")) {
                                          if (var30[0][var23].equalsIgnoreCase("Has Penguin")) {
                                            var22 = var23;
                                          } else {
                                            if (var30[0][var23].equalsIgnoreCase("Central Hole")) {
                                              var16Lifetime1 = var23;
                                            }
                                          }
                                        } else {
                                          var21 = var23;
                                        }
                                      }
                                    }
                                  } else {
                                    var20 = var23;
                                  }
                                }
                              } else {
                                var13Lifetime1 = var23;
                              }
                            } else {
                              var14Lifetime1 = var23;
                            }
                          } else {
                            var12Lifetime1 = var23;
                          }
                        } else {
                          var11Lifetime1 = var23;
                        }
                      } else {
                        var10Lifetime1 = var23;
                      }
                    }
                  } else {
                    var8Lifetime1 = var23;
                  }
                } else {
                  var7Lifetime1 = var23;
                }
              } else {
                var6Lifetime1 = var23;
              }
            }
          }
          var27 = 0;
          var23Lifetime1 = var27;
          while (var27 < var17.length) {
            dupTemp$2 = new ql();
            var17[var27] = dupTemp$2;
            var24 = dupTemp$2;
            var24.field_o[0] = Integer.parseInt(var4Lifetime1[var27 + 1][var5Lifetime1]);
            var24.field_o[1] = Integer.parseInt(var4Lifetime1[1 + var27][var6Lifetime1]);
            var24.field_o[2] = Integer.parseInt(var4Lifetime1[var27 + 1][var7Lifetime1]);
            var24.field_o[3] = Integer.parseInt(var4Lifetime1[var27 + 1][var8Lifetime1]);
            var24.field_o[4] = Integer.parseInt(var4Lifetime1[1 + var27][var9Lifetime1]);
            var24.field_o[5] = Integer.parseInt(var4Lifetime1[1 + var27][var19]);
            var24.field_e = Integer.parseInt(var4Lifetime1[var27 + 1][var10Lifetime1]);
            var24.field_d = Integer.parseInt(var4Lifetime1[var27 + 1][var11Lifetime1]);
            var24.field_l = Integer.parseInt(var4Lifetime1[var27 + 1][var20]);
            var24.field_a = Boolean.valueOf(var4Lifetime1[var27 + 1][var18]).booleanValue();
            var24.field_f = Boolean.valueOf(var4Lifetime1[var27 + 1][var14Lifetime1]).booleanValue();
            var24.field_k = Boolean.valueOf(var4Lifetime1[var27 + 1][var12Lifetime1]).booleanValue();
            var24.field_i = Boolean.valueOf(var4Lifetime1[var27 + 1][var13Lifetime1]).booleanValue();
            var24.field_b = Boolean.valueOf(var4Lifetime1[var27 + 1][var15Lifetime1]).booleanValue();
            var24.field_h = Boolean.valueOf(var4Lifetime1[var27 + 1][var21]).booleanValue();
            var24.field_g = Boolean.valueOf(var4Lifetime1[var27 + 1][var22]).booleanValue();
            var24.field_n = Boolean.valueOf(var4Lifetime1[1 + var27][var16Lifetime1]).booleanValue();
            var27++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_77_0 = var3_ref;
          stackIn_77_1 = new StringBuilder().append("ml.R(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != 7) {
          this.b(120, -118, -86);
        }
        this.field_i = param1;
    }

    final void b(int param0, int param1, int param2) {
        int stackIn_25_1 = 0;
        boolean stackIn_26_2 = false;
        int stackIn_30_1 = 0;
        boolean stackIn_31_2 = false;
        Object stackIn_33_0;
        int stackIn_33_3;
        int stackIn_33_4;
        Object stackIn_34_0;
        boolean stackIn_34_5;
        boolean stackIn_37_0;
        int stackIn_37_1;
        boolean stackIn_37_2;
        int stackIn_37_3;
        boolean stackIn_38_4 = false;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        Object stackIn_50_0;
        boolean stackIn_50_3;
        int stackIn_65_1 = 0;
        boolean stackIn_66_2 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        var7 = MinerDisturbance.field_ab;
        if (param1 != -22674) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var5 = this.field_n;
        if (2 == var5) {
          if (this.a(96)) {
            var5 = this.field_g;
            if (this.field_j == 3) {
              var5 = this.field_f;
            }
            stackIn_25_1 = param2;
            stackIn_26_2 = !(this.field_p);
            this.a(stackIn_25_1, stackIn_26_2, var5, (byte) 121);
            this.a(param2, this.field_p, this.field_f, (byte) 121);
            for (var6 = 0; this.field_r.length > var6; var6++) {
              stackIn_30_1 = param2;
              stackIn_31_2 = (var6 == this.field_o.field_e);
              stackIn_33_0 = this;
              stackIn_33_3 = 95;
              stackIn_33_4 = var6;
              if (this.field_p) {
                stackIn_34_0 = this;
                stackIn_34_5 = false;
              } else {
                stackIn_34_0 = this;
                stackIn_34_5 = true;
              }
              this.a(stackIn_30_1, stackIn_31_2, (byte) stackIn_33_3, stackIn_33_4, stackIn_34_5);
            }
          } else {
            this.a(param2, false, this.field_f, (byte) 121);
          }
        } else {
          if (var5 != 8 &&
            var5 != 3) {
            if (var5 == 5) {
              jb.$cfr$intArgs$a$3cff09437531(true, -59, false, param2, false);
            } else {
              if (var5 == 7) {
                this.a(80, param2);
              } else {
                if (1 == var5) {
                  if (!this.a(121)) {
                    this.a(this.field_k, param1 + 22674, false, param2);
                  } else {
                    stackIn_49_1 = this.field_g;
                    stackIn_49_2 = 0;
                    if (this.field_p) {
                      stackIn_50_0 = this;
                      stackIn_50_3 = false;
                    } else {
                      stackIn_50_0 = this;
                      stackIn_50_3 = true;
                    }
                    this.a(stackIn_49_1, stackIn_49_2, stackIn_50_3, param2);
                    this.a(this.field_k, 0, this.field_p, param2);
                  }
                } else {
                  if (var5 == 6) {
                    this.b(param2, (byte) -125);
                  } else {
                    if (var5 == 11) {
                      eh.a(-param2, 0, 640, 480);
                      wk.field_a.d(117);
                      eh.a();
                    } else {
                      if (var5 != 4) {
                        if ((var5 == 9)) {
                          var4 = 640 + param2 - 640;
                          jc.field_G.f(320 + var4 - (jc.field_G.field_x >> 1), 15);
                        }
                      } else {
                        m.field_m.f(param2, 0);
                        if (!eg.b(112)) {
                          l.field_c.f(640 - (l.field_c.field_x + param2), -l.field_c.field_A + 480);
                        } else {
                          if (!fa.field_e) {
                            ak.field_c.f(-param2 + 640 - ak.field_c.field_x, -ak.field_c.field_A + 480);
                          } else {
                            var5 = -gi.field_a.field_A + 480;
                            var6 = -param2 + (-gi.field_a.field_x + 640);
                            gi.field_a.f(var6, 10 * (qd.field_R / 20) + var5);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_37_0 = false;
            stackIn_37_1 = 43;
            stackIn_37_2 = false;
            stackIn_37_3 = param2;
            stackIn_38_4 = (mc.field_w == 0);
            if (!jb.$cfr$intArgs$a$3cff09437531(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_38_4) &&
              kj.a(false)) {
              if (this.field_n != 8) {
                ce.field_d.a(kc.field_c, 170 - param2, 230, 300, 60, 1, -1, 1, 0, 0);
              } else {
                ce.field_d.a(vb.field_d, 220 - param2, 320, 200, 60, 1, -1, 1, 0, 0);
              }
            }
          }
        }
        if (this.field_n != 11) {
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_r.length; var4Lifetime1++) {
            stackIn_65_1 = param2;
            stackIn_66_2 = (this.field_o.field_e == var4Lifetime1);
            this.a(stackIn_65_1, stackIn_66_2, (byte) 85, var4Lifetime1, false);
          }
        }
    }

    final void b(byte param0) {
        this.field_k = 0;
        int var2 = -87 / ((-10 - param0) / 43);
        this.d(-111);
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var13_ref_int__;
        int var14;
        int var15;
        int var16;
        int[] var17;
        int[] var18;
        String[] var19;
        int[] var20;
        int[] var23;
        vm var25;
        String var26;
        vm var28;
        String var29;
        int[] var30;
        int var7Lifetime1;
        int var11Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        var16 = MinerDisturbance.field_ab;
        var19 = ol.field_b[param0];
        if (!this.field_p) {
          stackIn_8_0 = (param2) ? 0 : 640;
          var7 = stackIn_8_0 + this.field_e;
          var6 = var7 + (-640 - param3) + 125 + 640;
        } else {
          stackIn_3_0 = -this.field_e;
          stackIn_4_1 = (param2) ? -640 : 0;
          var7 = stackIn_3_0 + stackIn_4_1;
          var6 = var7 + param3 + 125;
        }
        ha.field_a.f(param3 - (-320 + (ha.field_a.field_x >> 1)), 15);
        var7Lifetime1 = 390;
        var8 = ce.field_d.field_E + ce.field_d.field_I - 2;
        var9 = mm.field_a.field_E + mm.field_a.field_I;
        var10 = param1;
        for (var11 = 0; var19.length > var11; var11++) {
          var10 = var10 + ce.field_d.a(var19[var11], var7Lifetime1);
        }
        var10 = var10 * var8;
        var10 = var10 + (4 + var9);
        if (param0 != 2) {
          if (param0 != 4) {
            if (param0 == 5) {
              var10 = var10 + 5 * var8;
            }
          } else {
            var10 = var10 + 3 * var8;
          }
        } else {
          var10 = var10 - 5 * var8;
        }
        g.a(90, var10 + 50, var6 - 30, 450, (byte) 53, hd.field_d);
        if (3 == param0) {
          var7Lifetime1 -= 32;
          var6 += 32;
        }
        L6: {
          var11Lifetime1 = 130;
          mm.field_a.a(pf.field_f[param0], var6, var11Lifetime1, 1, -1);
          var11Lifetime1 = var11Lifetime1 + var9;
          if (param0 == 1) {
            for (var12 = 0; var19.length > var12; var12++) {
              if (var12 != 0) {
                if (var12 != 1) {
                  if (var12 != 2) {
                    var13 = ce.field_d.a(var19[var12], ti.field_N, gf.field_a);
                    for (var14 = 0; var14 < var13; var14++) {
                      ce.field_d.a(gf.field_a[var14], var6 - (-var7Lifetime1 + ti.field_N[var14]), var11Lifetime1, 1, -1);
                      var11Lifetime1 = var11Lifetime1 + var8;
                    }
                  } else {
                    var11Lifetime1 = var11Lifetime1 + var8 * ce.field_d.a(var19[var12], var6, var11Lifetime1 - ce.field_d.field_I, var7Lifetime1, 480, 1, -1, 0, 0, var8);
                    var11Lifetime1 = var11Lifetime1 + var8;
                    ib.field_a.f(var6, var11Lifetime1);
                  }
                } else {
                  var11Lifetime1 = var11Lifetime1 + ce.field_d.a(var19[var12], var6 + 40, -ce.field_d.field_I + var11Lifetime1, var7Lifetime1 - 40, 480, 1, -1, 0, 0, var8) * var8;
                  var11Lifetime1 = var11Lifetime1 + var8;
                }
              } else {
                ce.field_d.a(var19[var12], var6, var11Lifetime1 - ce.field_d.field_I, 40, 480, 1, -1, 0, 0, var8);
              }
            }
          } else if (param0 == 2) {
            var12 = 0;
            for (var13 = 0; var13 < var19.length; var13++) {
              if (var13 != 3 &&
                7 != var13) {
                if (var13 == 0) {
                  fl.field_j[0].c(var6 + 180, var11Lifetime1 - 20);
                  fl.field_j[1].c(214 + var6, var11Lifetime1 - 20);
                  fl.field_j[2].c(var6 + 180, 14 + var11Lifetime1);
                } else {
                  if (var13 == 4) {
                    fl.field_j[13].c(var6 + 180, -20 + var11Lifetime1);
                    fl.field_j[14].c(var6 + 180, 14 + var11Lifetime1);
                  }
                }
                var14 = var6;
                if (0 != var13 &&
                  var13 != 4) {
                  if (var13 != 1 &&
                    var13 != 5) {
                    var14 += 260;
                  } else {
                    var14 += 60;
                  }
                } else {
                  var14 += 0;
                }
                var15 = ce.field_d.a(var19[var13], var14, var11Lifetime1 - ce.field_d.field_I, var7Lifetime1 / 3, 480, 1, -1, 0, 0, var8);
                var12 = Math.max(var12, var15);
                if (2 == var13 ||
                  6 == var13) {
                  var11Lifetime1 = var11Lifetime1 + var8 * (var12 + 1);
                  var12 = 0;
                }
              } else {
                var11Lifetime1 = var11Lifetime1 + (1 + ce.field_d.a(var19[var13], var6, -ce.field_d.field_I + var11Lifetime1, var7Lifetime1, 480, 1, -1, 0, 0, var8)) * var8;
              }
            }
          } else if (param0 != 4 &&
            5 != param0) {
            var12 = var6;
            if (param0 == 3) {
              fl.field_j[3].c(-33 + var6, 139);
              fl.field_j[4].c(-33 + var6, 180);
              fl.field_j[5].c(-33 + var6, 222);
              fl.field_j[7].c(var6 - 33, 258);
              fl.field_j[6].c(var6 - 33, 291);
              var12 += 5;
              var6 -= 32;
            }
            for (var13 = 0; var13 < var19.length; var13++) {
              var11Lifetime1 = var11Lifetime1 + ce.field_d.a(var19[var13], var12, var11Lifetime1 - ce.field_d.field_I, var7Lifetime1, 480, 1, -1, 0, 0, var8) * var8;
            }
          } else if (4 == param0) {
            var7Lifetime1 -= 32;
            var6 += 32;
            var12 = 0;
            var18 = new int[2];
            var30 = var18;
            while (var12 < 2) {
              var18[var12] = -15 + var11Lifetime1;
              var11Lifetime1 = var11Lifetime1 + ce.field_d.a(var19[var12], 5 + var6, -ce.field_d.field_I + var11Lifetime1, var7Lifetime1, 480, 1, -1, 0, 0, var8) * var8;
              var11Lifetime1 = var11Lifetime1 + var8;
              var12++;
            }
            var6 -= 32;
            var7Lifetime1 += 32;
            while (var12 < var19.length) {
              var11Lifetime1 = var11Lifetime1 + var8 * ce.field_d.a(var19[var12], var6, -ce.field_d.field_I + var11Lifetime1, var7Lifetime1, 480, 1, -1, 0, 0, var8);
              var12++;
            }
            fl.field_j[8].c(-1 + var6, var30[0]);
            fl.field_j[9].c(-1 + var6, var30[1]);
          } else {
            if (param0 != 5) {
              var26 = param0 + 1 + "/" + 7;
              var25 = mm.field_a;
              var14 = 345 + var6;
              var15 = var25.field_E + var25.field_I + 90;
              var25.a(var26, var14, var25.field_N + var15, 1, -1);
              break L6;
            }
            var12 = 0;
            var11Lifetime1 = var11Lifetime1 + ce.field_d.a(var19[var12], var6, var11Lifetime1 - ce.field_d.field_I, var7Lifetime1, 480, 1, -1, 0, 0, var8) * var8;
            var7Lifetime1 -= 32;
            var6 += 32;
            var12++;
            var11Lifetime1 = var11Lifetime1 + var8;
            var23 = new int[4];
            var20 = var23;
            var17 = var20;
            var13_ref_int__ = var17;
            while (var12 < 5) {
              var17[-1 + var12] = -15 + var11Lifetime1;
              var14 = ce.field_d.a(var19[var12], 5 + var6, var11Lifetime1 - ce.field_d.field_I, var7Lifetime1, 480, 1, -1, 0, 0, var8);
              if (var14 == 1) {
                var14++;
              }
              var11Lifetime1 = var11Lifetime1 + var8 * var14;
              var11Lifetime1 = var11Lifetime1 + var8;
              var12++;
            }
            var6 -= 32;
            fl.field_j[10].c(var6 - 1, var23[0]);
            fl.field_j[11].c(-1 + var6, var23[1]);
            fl.field_j[12].c(-1 + var6, var23[2]);
            fl.field_j[15].c(-1 + var6, var23[3]);
          }
          var29 = param0 + 1 + "/" + 7;
          var28 = mm.field_a;
          var14Lifetime1 = 345 + var6;
          var15Lifetime1 = var28.field_E + var28.field_I + 90;
          var28.a(var29, var14Lifetime1, var28.field_N + var15Lifetime1, 1, -1);
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4, vm param5, int param6, int param7, boolean param8) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        try {
          param2 = param2 + this.field_l;
          param5.a(param3, -2 + param0, param2, 4, param1);
          param5.a(param3, param0 + 2, param2, 4, param1);
          param5.a(param3, param0, param2 + 2, 4, param1);
          param5.a(param3, param0 - 1, param2 - 1, 4, param1);
          param5.a(param3, param0 + 1, param2 + param7, 4, param1);
          param5.a(param3, param0 - 1, 1 + param2, 4, param1);
          param5.a(param3, 1 + param0, 1 + param2, 4, param1);
          if (param8) {
            param5.a(param3, param0, param2, param4, -1);
          } else {
            param5.a(param3, param0, param2, param6, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_6_0 = var10;
          stackIn_6_1 = new StringBuilder().append("ml.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int e(int param0) {
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = MinerDisturbance.field_ab;
        if (!this.field_b) {
          stackIn_5_0 = (this.field_n != 2) ? 0 : 1;
          boolean decompiledFrameRemainder0 = true;
          var2 = stackIn_5_0;
          if (lj.field_t == 98 &&
            var2 != 0) {
            this.field_o.c((byte) 126);
            if (!(this.field_o.d((byte) 77))) {
              if (this.field_o.field_e < 0) {
                this.field_o.a(0, 0);
              } else {
                if (this.field_o.field_e == 3) {
                  this.field_o.a(1, 0);
                } else {
                  if (0 >= pj.field_a) {
                    this.field_o.a(3, param0 ^ 1);
                  } else {
                    if (this.field_o.field_e >= 4) {
                      this.field_o.a(3, 0);
                    } else {
                      this.field_o.a(4, param0 ^ 1);
                    }
                  }
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (lj.field_t == 98 &&
              1 == this.field_n &&
              this.field_k == 6) {
              this.field_o.c((byte) 94);
              if (!(this.field_o.d((byte) 77))) {
                if (this.field_o.field_e < 0) {
                  this.field_o.a(0, 0);
                } else {
                  if (3 >= this.field_o.field_e) {
                    this.field_o.a(3, 0);
                  } else {
                    this.field_o.a(this.field_o.field_e, 0);
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (lj.field_t == 99 &&
                var2 != 0) {
                this.field_o.c((byte) 93);
                if (!(this.field_o.d((byte) 77))) {
                  if (this.field_o.field_e == 4) {
                    this.field_o.a(1, 0);
                  } else {
                    if (this.field_o.field_e < 3) {
                      this.field_o.a(3, param0 - 1);
                    } else {
                      if ((this.field_o.field_e == 3)) {
                        if (pj.field_a <= 0) {
                          this.field_o.a(1, param0 ^ 1);
                        } else {
                          this.field_o.a(4, 0);
                        }
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (99 == lj.field_t &&
                  1 == this.field_n &&
                  6 == this.field_k) {
                  this.field_o.c((byte) 118);
                  if (!(this.field_o.d((byte) 77))) {
                    if (this.field_o.field_e < 0) {
                      this.field_o.a(3, 0);
                    } else {
                      if (this.field_o.field_e < 3) {
                        this.field_o.a(this.field_o.field_e, 0);
                      } else {
                        this.field_o.a(1, 0);
                      }
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.field_o.d(-4664);
                }
              }
            }
          }
          if (this.field_n == 1) {
            if (this.field_o.field_e == 3 &&
              this.field_k != 6) {
              if (lj.field_t == 97) {
                this.field_o.field_e = 0;
              } else {
                this.field_o.field_e = 2;
              }
            }
            if (2 == this.field_o.field_e &&
              this.field_k == 6 &&
              97 == lj.field_t) {
              this.field_o.field_e = 3;
            }
          }
        } else {
          this.field_o.b((byte) -81);
        }
        if (param0 != 1) {
          field_d = 109;
        }
        var2Lifetime1 = -2;
        if (this.field_o.field_e != -1) {
          var2Lifetime1 = this.b(468, this.field_o.field_e);
        }
        return var2Lifetime1;
    }

    public static void a(byte param0) {
        int var1 = 12 % ((32 - param0) / 58);
        field_c = null;
    }

    private final void d(int param0, int param1) {
        this.field_e = 0;
        this.field_j = param0;
        if (param1 != -502) {
          field_a = 90;
        }
    }

    private final int c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = MinerDisturbance.field_ab;
        if (param0 != -21377) {
          return 33;
        }
        for (var4 = 0; var4 < this.field_r.length; var4++) {
          var5 = pk.field_b.c(m.field_g[var4], 640);
          if (this.field_m - var5 / 2 <= param2 &&
            var5 / 2 + this.field_m > param2 &&
            param1 >= var4 * this.field_l + this.field_q &&
            param1 < pk.field_b.field_I + var4 * this.field_l + this.field_q + pk.field_b.field_E) {
            return var4;
          }
        }
        return -1;
    }

    private final void d(int param0) {
        this.field_j = 0;
        this.field_e = -640;
        this.field_p = false;
        int var2 = 122 % ((78 - param0) / 47);
    }

    private final void a(int param0, boolean param1, byte param2, int param3, boolean param4) {
        StringBuilder stackIn_19_0 = null;
        String stackIn_20_1 = null;
        StringBuilder stackIn_24_0 = null;
        String stackIn_25_1 = null;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_68_0 = 0;
        int var6;
        int var7;
        vm var8;
        String var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        ea var16_ref_ea;
        int var16;
        int var17;
        int var18;
        int var19;
        String var20;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        String var9Lifetime1;
        String var9Lifetime2;
        var19 = MinerDisturbance.field_ab;
        var6 = this.field_r[param3];
        var7 = this.field_r.length;
        if (this.field_n != 1) {
          if (this.field_n == 2) {
            var7--;
            if (0 < pj.field_a) {
              var7--;
            }
          }
        } else {
          if (0 == this.field_k &&
            11 == var6) {
            return;
          }
          if (6 == this.field_k &&
            var6 == 10) {
            return;
          }
          var7--;
          if (var6 == 18 &&
            this.field_k != 6) {
            return;
          }
          if (var6 == 18) {
            param3 = 0;
            var7 = 1;
          }
        }
        var8 = pk.field_b;
        var20 = m.field_g[var6];
        var9 = var20;
        var9Lifetime1 = var20;
        var9Lifetime2 = var20;
        if (var6 == 12) {
          stackIn_19_0 = new StringBuilder().append(var20);
          if (kf.field_d == null) {
            stackIn_20_1 = ie.field_a;
          } else {
            stackIn_20_1 = gm.field_b;
          }
          var9Lifetime2 = ((StringBuilder) (Object) stackIn_19_0).append(stackIn_20_1).toString();
        }
        if (19 == var6) {
          stackIn_24_0 = new StringBuilder().append(var9Lifetime2);
          if (!sc.field_b) {
            stackIn_25_1 = ie.field_a;
          } else {
            stackIn_25_1 = gm.field_b;
          }
          var9Lifetime2 = ((StringBuilder) (Object) stackIn_24_0).append(stackIn_25_1).toString();
        }
        if (var6 == 0 &&
          mc.field_w == 0 && (this.field_n == 1 ||
          this.field_n == 3)) {
          var9Lifetime2 = a.field_b;
        }
        if (param2 <= 14) {
          return;
        }
        var12 = 8218369;
        var13 = 16502531;
        var14 = 15885602;
        if (!this.field_b) {
          if ((1 & var7) != 0) {
            var10 = this.field_m - (this.field_l * (var7 / 2) + (-(param3 * this.field_l) - param0));
          } else {
            var15 = this.field_m - this.field_l / 2 - (-1 + var7) / 2 * this.field_l;
            var10 = var15 + param3 * this.field_l + param0;
          }
          var11 = this.field_q;
          if (18 != var6) {
            if (0 == var6 &&
              this.field_n == 2) {
              var10 = this.field_m + param0;
              var11 = var11 + (pk.field_b.field_I + pk.field_b.field_E);
            }
          } else {
            var11 = var11 - (pk.field_b.field_I + pk.field_b.field_E);
          }
        } else {
          var11 = this.field_l * param3 + this.field_q;
          var10 = param0 + this.field_m;
        }
        if (var6 == 25) {
          if (this.field_p) {
            stackIn_54_0 = -this.field_e;
            stackIn_55_1 = (param4) ? -640 : 0;
            var15Lifetime1 = stackIn_54_0 + stackIn_55_1;
          } else {
            stackIn_51_0 = (param4) ? 0 : 640;
            var15Lifetime1 = stackIn_51_0 + this.field_e;
          }
          var10 = var15Lifetime1 - param0 + 120;
          if (nk.field_w > 120) {
            stackIn_62_0 = (nk.field_w < 172) ? 1 : 0;
          } else {
            stackIn_62_0 = 0;
          }
          var17 = stackIn_62_0;
          if (nk.field_w > 468) {
            stackIn_68_0 = (nk.field_w < 520) ? 1 : 0;
          } else {
            stackIn_68_0 = 0;
          }
          L17: {
            var18 = stackIn_68_0;
            if ((!param1 ||
              var17 == 0) && (!param1 ||
              var18 != 0)) {
              var16_ref_ea = bl.field_w;
              break L17;
            }
            var16_ref_ea = h.field_c;
          }
          L21: {
            var16_ref_ea.g(var10, 83);
            var10 = var15Lifetime1 + (-param0 + 468);
            if ((!param1 ||
              var18 == 0) && (!param1 ||
              var17 != 0)) {
              var16_ref_ea = bl.field_w;
              break L21;
            }
            var16_ref_ea = h.field_c;
          }
          var16_ref_ea.a();
          var16_ref_ea.g(var10, 83);
          var16_ref_ea.a();
          return;
        }
        if (var6 == 20 &&
          !qd.field_S) {
          var13 = 11184810;
          var9Lifetime2 = dc.field_c;
          var14 = 14235957;
        }
        if (var6 == 21 &&
          !ci.field_b) {
          var14 = 16755370;
          var13 = 11184810;
          var9Lifetime2 = jk.field_lb;
        }
        if (var6 == 18 &&
          g.a(-36)) {
          var15Lifetime2 = 3355443;
          this.a(var11, var10, -22542, var8, 6776679, 14013909, var9Lifetime2, var15Lifetime2, param1);
        } else if (this.field_b &&
          this.field_n != 6) {
          this.a(var10, var12, var11, var9Lifetime2, var14, var8, var13, -1, param1);
        } else {
          this.a(var11, var10, -22542, var8, var13, var14, var9Lifetime2, var12, param1);
        }
        if (6 == var6) {
          var15Lifetime3 = var13;
          var16 = 0;
          if (kb.field_c == 2) {
            var16 = 20;
          }
          var17Lifetime1 = 134 + var16;
          eh.c(2 + var10 + var17Lifetime1, 28 + var11, 4, var12);
          eh.c(2 + (144 + var17Lifetime1) + var10, 28 + var11, 4, var12);
          eh.c(-1 + (var10 + var17Lifetime1), var11 + 26, 3, var15Lifetime3);
          eh.d(var17Lifetime1 + var10 - 1, 26 + var11, 4, 1);
          eh.c(-1 + (var10 + var17Lifetime1 + 144), var11 + 26, 3, var15Lifetime3);
          eh.d(143 + var10 + var17Lifetime1, var11 + 26, 4, 1);
          eh.e(var17Lifetime1 + var10, 23 + var11, 144, 10, var12);
          eh.e(var10 + var17Lifetime1, var11 + 30, 144, 1);
          eh.e(var17Lifetime1 + var10, 23 + var11, 144, 7, var15Lifetime3);
          eh.e(var17Lifetime1 + var10, 22 + var11, 144, 1);
          var18Lifetime1 = -2 + var17Lifetime1 + (var10 + ee.field_J * 144 / 256);
          eh.a(var18Lifetime1 - 1, 18 + var11, 6, 18, 1);
          eh.e(var18Lifetime1, var11 + 19, 4, 16, var15Lifetime3);
        }
        if (var6 == 5) {
          var15Lifetime4 = var13;
          var16Lifetime1 = 0;
          if (2 == kb.field_c) {
            var16Lifetime1 = 20;
          }
          var17Lifetime2 = 134 + var16Lifetime1;
          eh.c(var17Lifetime2 + var10 + 2, 28 + var11, 4, var12);
          eh.c(144 + var10 + var17Lifetime2 + 2, 28 + var11, 4, var12);
          eh.c(-1 + var10 + var17Lifetime2, 26 + var11, 3, var15Lifetime4);
          eh.d(var17Lifetime2 + var10 - 1, 26 + var11, 4, 1);
          eh.c(var10 + var17Lifetime2 + 143, 26 + var11, 3, var15Lifetime4);
          eh.d(144 + (var10 + var17Lifetime2 - 1), 26 + var11, 4, 1);
          eh.e(var10 + var17Lifetime2, 23 + var11, 144, 10, var12);
          eh.e(var17Lifetime2 + var10, 30 + var11, 144, 1);
          eh.e(var17Lifetime2 + var10, 23 + var11, 144, 7, var15Lifetime4);
          eh.e(var10 + var17Lifetime2, var11 + 22, 144, 1);
          var18Lifetime2 = -2 + (144 * oc.field_f / 256 + var17Lifetime2) + var10;
          eh.a(-1 + var18Lifetime2, 18 + var11, 6, 18, 1);
          eh.e(var18Lifetime2, var11 + 19, 4, 16, var15Lifetime4);
        }
        return;
    }

    private final boolean a(int param0) {
        if (param0 <= 87) {
          return false;
        }
        return this.field_j != 0 ? true : false;
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -107) {
          return 83;
        }
        return dj.field_g[param0 & 2047];
    }

    final static void a(byte param0, int param1, ea param2, ea param3) {
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        var12 = MinerDisturbance.field_ab;
        try {
          var4_int = 0;
          var14 = param3.field_D;
          var13 = var14;
          var5 = var13;
          var6 = param2.field_D;
          if (param0 != 93) {
            return;
          }
          var7 = param3.field_C;
          var8 = param3.field_y;
          for (var9 = 0; var9 < var7; var9++) {
            for (var10 = 0; var8 > var10; var10++) {
              var11 = var14[var4_int];
              if (var11 != 0 &&
                var11 != param1) {
                if (var10 != 0 &&
                  var5[-1 + var4_int] != 0) {
                  if (var10 != -1 + var8 &&
                    var5[1 + var4_int] != 0) {
                    if (var9 != 0 &&
                      var5[var4_int - var8] != 0) {
                      if (var7 - 1 == var9 ||
                        var5[var8 + var4_int] == 0) {
                        var11 = param1;
                      }
                    } else {
                      var11 = param1;
                    }
                  } else {
                    var11 = param1;
                  }
                } else {
                  var11 = param1;
                }
                var6[var4_int++] = var11;
              } else {
                var4_int++;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("ml.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        nn stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        if (4 != this.field_n && (0 != this.field_n ||
          param1 == -1)) {
          this.field_o.field_e = 0;
          if (this.field_n == 1) {
            this.field_o.field_e = 1;
          } else {
            if (this.field_n == 2) {
              this.field_o.field_e = 2;
            }
          }
        }
        stackIn_11_0 = this.field_o;
        stackIn_12_1 = (u.b(-4440) >= mk.b(117)) ? false : true;
        ((nn) (Object) stackIn_11_0).a(stackIn_12_1, param0, 116);
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var7Lifetime1;
        int var7Lifetime2;
        var10 = MinerDisturbance.field_ab;
        stackIn_3_0 = (this.field_n != 2) ? 0 : 1;
        var4 = stackIn_3_0;
        if (var4 != 0 &&
          0 < pj.field_a &&
          83 < param2 &&
          111 > param2) {
          if ((param1 <= 120 ||
            param1 >= 172) &&
            (param1 <= 468 ||
            520 <= param1)) {
            return -1;
          }
          return 4;
        }
        if ((var4 != 0 ||
          !(param2 > pk.field_b.field_I + this.field_q + pk.field_b.field_E)) &&
          (this.field_n == 1 ||
          this.field_q <= param2)) {
          if (1 == this.field_n &&
            pk.field_b.field_E + (this.field_q - pk.field_b.field_I) > param2) {
            return -1;
          }
          if (var4 != 0 &&
            param2 > 3 * (pk.field_b.field_I + pk.field_b.field_E) + this.field_q) {
            return -1;
          }
          var5 = this.field_r.length;
          if (1 == this.field_n) {
            var5--;
          } else {
            if (var4 != 0) {
              var5--;
              if (pj.field_a > 0) {
                var5--;
              }
            }
          }
          if (0 == (var5 & 1)) {
            var6 = -((var5 - 1) / 2 * this.field_l) + (-(this.field_l / 2) + this.field_m);
          } else {
            var6 = this.field_m - var5 / 2 * this.field_l;
          }
          if (this.field_n == 1 &&
            this.field_q > param2) {
            var7 = pk.field_b.c(m.field_g[18], 640);
            if (-(var7 / 2) + this.field_m < param1 &&
              param1 < this.field_m + var7 / 2) {
              return 3;
            }
          }
          if (var4 != 0 &&
            param2 <= this.field_q + (pk.field_b.field_E + pk.field_b.field_I) * 3 &&
            param2 > pk.field_b.field_E + (pk.field_b.field_I + this.field_q)) {
            var7Lifetime1 = pk.field_b.c(m.field_g[0], 640);
            if (param1 > -(var7Lifetime1 / 2) + this.field_m &&
              this.field_m + var7Lifetime1 / 2 > param1) {
              return 3;
            }
            return -1;
          }
          var7Lifetime2 = var6;
          var8 = 0;
          if (param0 != 640) {
            return -122;
          }
          while (var5 > var8) {
            var9 = pk.field_b.c(m.field_g[this.field_r[var8]], 640);
            if (var7Lifetime2 - var9 / 2 < param1 &&
              param1 < var7Lifetime2 + var9 / 2) {
              return var8;
            }
            var8++;
            var7Lifetime2 = var7Lifetime2 + this.field_l;
          }
          return -1;
        }
        return -1;
    }

    private final void a(int param0, boolean param1, int param2, byte param3) {
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        String stackIn_46_0 = null;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var6Lifetime1;
        var12 = MinerDisturbance.field_ab;
        if (kj.a(false)) {
          return;
        }
        var5 = this.field_i;
        stackIn_5_0 = (this.field_p) ? 0 : 1;
        stackIn_8_1 = (param1) ? 0 : 1;
        if ((stackIn_5_0 ^ stackIn_8_1) != 0 &&
          this.field_j == 3) {
          var5 = (1 + this.field_i) % 2;
        }
        if (sn.field_b[var5] == null) {
          stackIn_17_0 = (0 == var5) ? 6 : 7;
          var6 = stackIn_17_0;
          sn.field_b[var5] = gk.a(3, 1, var6, eg.a((int) param3, -18), 10);
        }
        if (!this.field_p) {
          stackIn_26_0 = (param1) ? 0 : 640;
          var6Lifetime1 = stackIn_26_0 + this.field_e;
        } else {
          stackIn_22_0 = (!param1) ? 0 : -640;
          var6Lifetime1 = stackIn_22_0 - this.field_e;
        }
        var7 = var6Lifetime1;
        if (this.field_j == 3) {
          var7 = 0;
        }
        if (param2 == 0) {
          on.field_x.f(640 + (-(on.field_x.field_x >> 1) + (320 + (-param0 - 640)) + var7), 6);
        } else {
          if (param2 == 2) {
            sk.field_e.f(var7 + 640 + (-(sk.field_e.field_x >> 1) - param0 - 320), 6);
          } else {
            if (param2 == 1) {
              ld.field_x.f(var7 - (ld.field_x.field_x >> 1) + (320 - param0) + 0, 6);
            }
          }
        }
        var8 = 410;
        var9 = var6Lifetime1 + 115 - param0;
        var10 = 60 + var8;
        var11 = 285;
        var10 = var10 - (ak.field_a[0].field_x + ak.field_a[2].field_x);
        var10 = var10 / ak.field_a[1].field_x * ak.field_a[1].field_x;
        var11 = var11 - (ak.field_a[0].field_A + ak.field_a[6].field_A);
        var10 = var10 + (ak.field_a[0].field_x + ak.field_a[2].field_x);
        var11 = ak.field_a[3].field_A * (1 + var11 / ak.field_a[3].field_A);
        var11 = var11 + (ak.field_a[6].field_A + ak.field_a[0].field_A);
        if (var10 < var8) {
          var10 = var10 + ak.field_a[1].field_x;
        }
        if (param3 != 121) {
          return;
        }
        if (285 > var11) {
          var11 = var11 + ak.field_a[1].field_A;
        }
        g.a(80, var11, var9 + (var8 - var10) / 2, var10, (byte) 113, ak.field_a);
        ff.field_f.f(var9 + (var8 - ff.field_f.field_x) / 2, 85);
        if (0 != var5) {
          stackIn_46_0 = rj.field_a;
        } else {
          stackIn_46_0 = gn.field_a;
        }
        bd.a(stackIn_46_0, var9 + var8 / 2, param3 - 121, 109);
        this.a(param3 ^ 110, var5, var8, sn.field_b[var5], var9, param2);
        ce.field_d.a(am.field_N, 0 - param0 + 130 + var6Lifetime1, 310, 380, 30, 1, -1, 1, 1, 0);
        return;
    }

    private final void a(int param0, int param1, int param2, lc param3, int param4, int param5) {
        int var14_int = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        int var8 = 0;
        String[] var8_ref_String__ = null;
        vm var9 = null;
        int var10_int = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        String var16 = null;
        int var17 = 0;
        sb var18 = null;
        int[] var22 = null;
        var17 = MinerDisturbance.field_ab;
        try {
          if (!param3.field_t) {
            var7 = nj.field_d;
            var8 = 100 + pk.field_b.field_I + 76;
            pk.field_b.b(var7, param2 / 2 + param4, var8, 16689702, -1);
          } else {
            if (null != param3.field_p) {
              var7_int = 0;
              var8_ref_String__ = param3.field_p[param5];
              var9 = ce.field_d;
              if (var8_ref_String__ != null) {
                stackIn_8_0 = (vk.field_a != param1) ? 0 : 1;
                var10_int = stackIn_8_0;
                var22 = param3.field_n[param5];
                var12 = 100 - (-var9.field_I - 25);
                var13 = 0;
                for (var14_int = 0; var14_int < 10; var14_int++) {
                  if (null != var8_ref_String__[var14_int]) {
                    var7_int = 1;
                    var15 = var22[var14_int];
                    var16 = var8_ref_String__[var14_int] + " <col=666666>" + this.d(256, var15, param1) + "</col>";
                    if (var10_int != 0 &&
                      var13 == 0 &&
                      ha.field_b >= 0 &&
                      var15 == Math.abs(ha.field_b) &&
                      ci.a(-27933, var8_ref_String__[var14_int])) {
                      var13 = 1;
                      var9.c(1 + var14_int + ". ", param4 + 45, var12, 16610816, -1);
                      var9.a(var16, 45 + param4, var12, 16610816, -1);
                      var9.c(ab.a(0, kb.field_c, true, (long)var15, true), param2 + (param4 - 35), var12, 16610816, -1);
                    } else {
                      var9.c(var14_int + 1 + ". ", 45 + param4, var12, 1, -1);
                      var9.a(var16, 45 + param4, var12, 1, -1);
                      var9.c(ab.a(0, kb.field_c, true, (long)var15, true), param2 + (param4 - 35), var12, 1, -1);
                    }
                  }
                  var12 += 17;
                }
                if (var13 == 0 &&
                  !(ha.field_b <= 0) &&
                  var10_int != 0) {
                  var14 = ti.field_J + " " + this.d(256, ha.field_b, param1);
                  var9.a(var14, param4 + 45, var12, 16724225, -1);
                  var9.c(ab.a(0, kb.field_c, true, (long)Math.abs(ha.field_b), true), param2 + (param4 - 35), var12, 16724225, -1);
                }
              }
              if (var7_int == 0) {
                var10 = ae.field_b;
                var11 = 76 + pk.field_b.field_I + 100;
                pk.field_b.b(var10, param4 + param2 / 2, var11, 16689702, -1);
              }
            } else {
              var7 = ff.field_d;
              var8 = pk.field_b.field_I + 100 + 76;
              pk.field_b.b(var7, param4 + param2 / 2, var8, 16689702, -1);
            }
          }
          if (param0 != 23) {
            var18 = (sb) null;
            ml.a((sb) null, (byte) 74, (sb) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_34_0 = var7_ref;
          stackIn_34_1 = new StringBuilder().append("ml.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        var5 = MinerDisturbance.field_ab;
        if (this.a(107)) {
          this.field_e = this.field_e - 32;
          if (this.field_e < -640) {
            this.d(param0 - 8654);
          }
        }
        if (1 == this.field_n) {
          if (this.field_o.field_e >= 0 && (this.field_k == 0 &&
            this.field_r[this.field_o.field_e] == 11 ||
            this.field_k == 6 &&
            this.field_r[this.field_o.field_e] == 10)) {
            for (var2 = 0; this.field_r.length > var2; var2++) {
              if (0 == this.field_r[var2]) {
                this.field_o.field_e = var2;
                break;
              }
            }
          }
        } else {
          if (3 == this.field_n ||
            this.field_n == 8 ||
            this.field_n == 5) {
            c.a((byte) -103);
          }
        }
        if (param0 != 8779) {
          this.field_k = -5;
        }
        if (this.field_n != 11 &&
          this.field_b) {
          if (this.field_n != 6) {
            this.field_o.a(this.field_q, this.field_m, 140, this.field_l, this.field_h + this.field_m);
          } else {
            var2Lifetime1 = this.c(-21377, m.field_e, wi.field_w);
            var3 = this.c(-21377, gb.field_e, nk.field_w);
            this.field_o.a(var3, var2Lifetime1, -1);
          }
        } else {
          var2Lifetime1 = -1;
          var3 = -1;
          if (this.field_n != 11) {
            var2Lifetime1 = this.a(640, wi.field_w, m.field_e);
            var3 = this.a(param0 - 8139, nk.field_w, gb.field_e);
            this.field_o.a(var3, var2Lifetime1, param0 ^ -8780);
          } else {
            var4 = wk.field_a.a(true, 1);
            if (1 == var4) {
              tk.field_a = true;
              return 4;
            }
            if (var4 == 2) {
              tk.field_a = true;
              return 4;
            }
          }
        }
        if (this.field_o.field_e != -1) {
          return this.b(468, this.field_o.field_e);
        }
        return -2;
    }

    private final String d(int param0, int param1, int param2) {
        if (param0 != 256) {
          return (String) null;
        }
        if (0 == param2) {
          if (0 == param1) {
            return dh.field_c[0][0];
          }
          if (param1 < 1000) {
            return dh.field_c[0][1];
          }
          if (5000 > param1) {
            return dh.field_c[0][2];
          }
          if (param1 < 25000) {
            return dh.field_c[0][3];
          }
          if (param1 < 50000) {
            return dh.field_c[0][4];
          }
          if (param1 < 100000) {
            return dh.field_c[0][5];
          }
          if (param1 < 200000) {
            return dh.field_c[0][6];
          }
          if (500000 > param1) {
            return dh.field_c[0][7];
          }
          if (1000000 > param1) {
            return dh.field_c[0][8];
          }
          return dh.field_c[0][9];
        }
        if (0 == param1) {
          return dh.field_c[1][0];
        }
        if (5000 > param1) {
          return dh.field_c[1][1];
        }
        if (param1 < 25000) {
          return dh.field_c[1][2];
        }
        if (param1 < 50000) {
          return dh.field_c[1][3];
        }
        if (param1 < 100000) {
          return dh.field_c[1][4];
        }
        if (param1 < 200000) {
          return dh.field_c[1][5];
        }
        if (param1 < 500000) {
          return dh.field_c[1][6];
        }
        if (1000000 > param1) {
          return dh.field_c[1][7];
        }
        if (param1 < 2000000) {
          return dh.field_c[1][8];
        }
        return dh.field_c[1][9];
    }

    private final void b(int param0, byte param1) {
        int var3 = param0 + 172;
        int var4 = 70;
        int var5 = 296;
        int var6 = 116;
        if (param1 >= -79) {
          return;
        }
        g.a(var4, var6 + 30, var3 - 20, 40 + var5, (byte) 80, hd.field_d);
        int var7 = ce.field_d.field_I + ce.field_d.field_E;
        var4 += 50;
        pk.field_b.b(si.field_e, 320 + param0, var4, 0, -1);
        var4 = var4 + var7;
        ce.field_d.a(ci.field_j, var3 + 10, var4, -20 + var5, 300, 0, -1, 1, 0, 14);
        g.a(285, 90, var3 - 20, var5 + 40, (byte) 47, hd.field_d);
        ce.field_d.a(bf.field_a, var3 + 10, 310, var5 - 20, 300, 0, -1, 1, 0, 14);
    }

    private final void a(int param0, int param1) {
        int var3 = this.field_e;
        int var4 = var3 + (-param1 + 755);
        on.field_x.f(var3 + (-param1 + 640 + (320 - (on.field_x.field_x >> 1))), 15);
        g.a(param0, 235, var4, 410, (byte) 113, hd.field_d);
        String var5 = ae.field_b;
        int var6 = 176 + pk.field_b.field_I;
        pk.field_b.b(var5, var3 + (-param1 + 640) + 320, var6, 16689702, -1);
        ce.field_d.a(vb.field_d, var3 + (130 - param1) + 640, 260, 380, 30, 1, -1, 1, 1, 0);
    }

    private final void a(int param0, int param1, int param2, vm param3, int param4, int param5, String param6, int param7, boolean param8) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        try {
          param0 += 42;
          param3.b(param6, -2 + param1, param0, 4, param7);
          param3.b(param6, 2 + param1, param0, 4, param7);
          param3.b(param6, param1, param0 - 2, 4, param7);
          param3.b(param6, param1, param0 + 2, 4, param7);
          if (param2 != -22542) {
            this.field_n = 46;
          }
          param3.b(param6, -1 + param1, -1 + param0, 4, param7);
          param3.b(param6, 1 + param1, param0 - 1, 4, param7);
          param3.b(param6, -1 + param1, 1 + param0, 4, param7);
          param3.b(param6, 1 + param1, param0 + 1, 4, param7);
          if (param8) {
            param3.b(param6, param1, param0, param5, -1);
          } else {
            param3.b(param6, param1, param0, param4, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_8_0 = var10;
          stackIn_8_1 = new StringBuilder().append("ml.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    ml(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        int var10_int = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_e = -640;
        this.field_k = 0;
        this.field_i = 0;
        this.field_p = false;
        this.field_f = 0;
        this.field_g = -1;
        try {
          this.field_l = param6;
          this.field_m = param2;
          this.field_n = param0;
          this.field_q = param3;
          this.field_r = param1;
          stackIn_4_1 = (param7);
          this.field_b = stackIn_4_1;
          this.field_h = param4;
          this.field_o = new nn(this.field_r.length);
          if (this.field_n == 1) {
            for (var10_int = 0; var10_int < 11; var10_int++) {
              if (var10_int < 8) {
                ti.field_N[var10_int] = -10 - ib.field_a.field_x + 390;
              } else {
                ti.field_N[var10_int] = 390;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_14_0 = var10;
          stackIn_14_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_d = 9;
        field_c = new char[]{(char)91, (char)93, (char)35};
    }
}
