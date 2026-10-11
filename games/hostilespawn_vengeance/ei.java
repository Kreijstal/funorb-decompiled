/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends am {
    static bd field_p;
    static bd field_m;
    static vl field_q;
    static int field_l;
    static boolean field_i;
    static bd field_n;
    byte[] field_r;
    long field_j;
    int field_s;
    static String field_k;
    static vl field_h;
    static eg field_o;
    static boolean field_t;

    final static void a(int param0, int param1, oc param2, boolean param3, og param4, oc param5, int param6, int param7, boolean param8, oj param9, int param10, int param11, int param12, int param13, int param14, int param15, oc param16) {
        int fieldTemp$0 = 0;
        og dupTemp$1 = null;
        og dupTemp$2 = null;
        og dupTemp$3 = null;
        oc dupTemp$4 = null;
        og dupTemp$5 = null;
        oc dupTemp$6 = null;
        int fieldTemp$7 = 0;
        int stackIn_15_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_261_0 = 0;
        RuntimeException stackIn_474_0 = null;
        StringBuilder stackIn_474_1 = null;
        String stackIn_475_2 = null;
        StringBuilder stackIn_477_1 = null;
        String stackIn_478_2 = null;
        StringBuilder stackIn_480_1 = null;
        String stackIn_481_2 = null;
        StringBuilder stackIn_483_1 = null;
        String stackIn_484_2 = null;
        StringBuilder stackIn_486_1 = null;
        String stackIn_487_2 = null;
        RuntimeException decompiledCaughtException = null;
        oj var17 = null;
        RuntimeException var17_ref = null;
        double var18 = 0.0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        bd[][] var22_ref_bd____ = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        var40 = HostileSpawn.field_I ? 1 : 0;
        try {
          param9.field_G = 2;
          var17 = mm.field_m[0];
          var18 = nh.a(-12149, param9, var17);
          if (var18 < 0.0) {
            var18 = var18 + 256.0;
          }
          if (param3) {
            if (param11 < param1) {
              if (param15 <= param1) {
                if (-param1 < param11) {
                  stackIn_15_0 = (param15 <= -param1) ? 0 : 1;
                } else {
                  stackIn_15_0 = 0;
                }
              } else {
                stackIn_15_0 = 0;
              }
            } else {
              stackIn_15_0 = 0;
            }
          } else {
            stackIn_15_0 = 0;
          }
          var20 = stackIn_15_0;
          if (19 == param9.field_i &&
            param9.field_w == 4 &&
            var20 == 0 &&
            param8) {
            param9.field_w = 1;
          }
          if (param3) {
            if (param11 < param0) {
              if (param0 > param15) {
                if (param11 > -param0) {
                  stackIn_33_0 = (param15 <= -param0) ? 0 : 1;
                } else {
                  stackIn_33_0 = 0;
                }
              } else {
                stackIn_33_0 = 0;
              }
            } else {
              stackIn_33_0 = 0;
            }
          } else {
            stackIn_33_0 = 0;
          }
          var21 = stackIn_33_0;
          if (19 == param9.field_i && (!param8 ||
            var20 != 0)) {
            stackIn_40_0 = (!lm.a(var17, param9, -62)) ? 0 : 1;
            var20 = stackIn_40_0;
            if (var20 == 0 &&
              param9.field_w == 4) {
              param9.field_w = 1;
            }
          }
          if (param9.field_i == 27 &&
            !param9.field_s &&
            var21 == 0 &&
            param9.field_w != 0) {
            param9.field_w = 0;
            param9.field_z = 0;
          }
          if (param9.field_B > -100) {
            param9.field_B = param9.field_B - 1;
          }
          fieldTemp$0 = param9.field_p + 1;
          param9.field_p = param9.field_p + 1;
          if (param9.field_C <= fieldTemp$0) {
            param9.field_z = param9.field_z + 1;
            param9.field_p = 0;
          }
          if (0 < param9.field_B &&
            param9.field_w != 1) {
            param9.field_B = 0;
          }
          var22 = param9.field_w;
          if (var22 != 0) {
            if (var22 != 1) {
              if (var22 != 2) {
                if (var22 == 3) {
                  param9.a(225, -64.0 + param9.field_c, param7);
                  if (param9.field_c % 64.0 < 4.0) {
                    param9.field_w = 1;
                    param9.field_c = Math.floor(param9.field_c / 64.0) * 64.0;
                  }
                } else {
                  if (var22 == 4) {
                    param9.field_p = param9.field_p + 2;
                    if (!param8 &&
                      param9.field_i != 19) {
                      param9.field_w = 1;
                    } else {
                      if (var21 == 0) {
                        if (var20 == 0 &&
                          param8) {
                          param9.field_w = 1;
                        } else {
                          if (19 == param9.field_i) {
                            var22 = param9.field_z % lb.field_a[4].length;
                            if (var22 == 4 &&
                              param9.field_p == 2) {
                              param9.field_e = 50;
                              tk.a(3, jc.field_c, 62, true);
                              jn.field_F[ib.field_c].field_c = param9.field_c;
                              jn.field_F[ib.field_c].field_j.a((byte) 46, param2);
                              jn.field_F[ib.field_c].field_l.a(param4, -28860);
                              dupTemp$1 = jn.field_F[ib.field_c].field_l;
                              dupTemp$1.field_f = dupTemp$1.field_f - 0.5;
                              dupTemp$2 = jn.field_F[ib.field_c].field_l;
                              dupTemp$2.field_a = dupTemp$2.field_a - 0.5;
                              if (0.0 > jn.field_F[ib.field_c].field_l.field_f) {
                                dupTemp$3 = jn.field_F[ib.field_c].field_l;
                                dupTemp$3.field_f = dupTemp$3.field_f + 1.0;
                                dupTemp$4 = jn.field_F[ib.field_c].field_j;
                                dupTemp$4.field_e = dupTemp$4.field_e - 1;
                              }
                              if (jn.field_F[ib.field_c].field_l.field_a < 0.0) {
                                dupTemp$5 = jn.field_F[ib.field_c].field_l;
                                dupTemp$5.field_a = dupTemp$5.field_a + 1.0;
                                dupTemp$6 = jn.field_F[ib.field_c].field_j;
                                dupTemp$6.field_g = dupTemp$6.field_g - 1;
                              }
                              jn.field_F[ib.field_c].field_e = 0;
                              jn.field_F[ib.field_c].field_h = 0;
                              jn.field_F[ib.field_c].field_i = 13;
                              jn.field_F[ib.field_c].field_l.a(20, (byte) 94, jn.field_F[ib.field_c].field_c);
                              ib.field_c = ib.field_c + 1;
                              if (Math.random() < 0.5) {
                                param9.field_c = param9.field_c + 64.0;
                                param9.b(-27757, (int)(Math.random() * 10.0), ln.field_a);
                                param9.field_c = param9.field_c - 64.0;
                              } else {
                                param9.field_c = param9.field_c - 64.0;
                                param9.b(-27757, (int)(Math.random() * 10.0), ln.field_a);
                                param9.field_c = param9.field_c + 64.0;
                              }
                            }
                            param5.a((byte) 46, param16);
                            param5.b(param2, 24161);
                            var18 = param5.a(25124);
                            param9.a(225, var18, 5);
                          } else {
                            if (param9.field_i != 27) {
                              L17: {
                                if ((3 & param9.field_e) == 0 &&
                                  eh.field_g > 0 &&
                                  Math.abs(param11) <= 48 &&
                                  Math.abs(param15) <= 48) {
                                  ci.a(1, 45);
                                  if (uj.field_l == 1 &&
                                    0 >= param9.field_e) {
                                    param9.field_e = 30;
                                    var22 = param9.field_i;
                                    if (var22 != 1 &&
                                      var22 != 25) {
                                      switch (var22) {
                                        case 24:
                                          tk.a(1, jc.field_c, 0, true);
                                          break L17;
                                        case 27:
                                          break L17;
                                        case 26:
                                          break L17;
                                        case 19:
                                          break L17;
                                        case 23:
                                          break L17;
                                        default:
                                          break L17;
                                        case 8:
                                          param9.field_e = 60;
                                          tk.a(5, jc.field_c, 35, true);
                                          break L17;
                                        case 18:
                                          break;
                                      }
                                    }
                                    tk.a(1, jc.field_c, 0, true);
                                  }
                                }
                              }
                              if (param9.field_e > 0) {
                                param9.field_e = param9.field_e - 1;
                              }
                              param5.a((byte) 46, param16);
                              param5.b(param2, 24161);
                              var18 = param5.a(25124);
                              param9.a(225, var18, 5);
                            } else {
                              var22 = param9.field_z % pa.field_i[4].length;
                              if (var22 >= 14 &&
                                17 >= var22 &&
                                eh.field_g > 0 &&
                                Math.abs(param11) <= 48 &&
                                48 >= Math.abs(param15)) {
                                ci.a(3, 126);
                                if (1 == uj.field_l &&
                                  param9.field_e <= 0) {
                                }
                                if (param9.field_e > 0) {
                                  param9.field_e = param9.field_e - 1;
                                }
                              }
                              param5.a((byte) 46, param16);
                              param5.b(param2, 24161);
                              var18 = param5.a(25124);
                              param9.a(225, var18, 5);
                            }
                          }
                        }
                      } else {
                        param9.field_J = true;
                        param9.field_w = 1;
                      }
                    }
                  } else {
                    if (var22 == 5) {
                      param9.field_l.a(25302, true, param9.field_K, param9.field_t, ln.field_a, 1, param9.field_j);
                      param9.b((byte) 117);
                      var22_ref_bd____ = param9.e(127);
                      var23 = 3;
                      if (var22_ref_bd____ != null &&
                        var22_ref_bd____[5] != null) {
                        var23 = var22_ref_bd____[5].length;
                      }
                      if (param9.field_z >= var23) {
                        if (3 == ha.field_t &&
                          param9.field_i == 8 &&
                          0 == bm.field_c) {
                          kd.a(0, 1);
                        }
                        if (param9.field_i == 23) {
                          jj.a(16, param9);
                        }
                        if (param9.field_i == 8) {
                          for (var24 = 0; var24 < 10; var24++) {
                            mm.field_m[el.field_j] = new oj(param9.field_j, 3, rl.field_c);
                            el.field_j = el.field_j + 1;
                          }
                        }
                        param9.c((byte) -123);
                        bn.a(3, param9);
                      }
                    }
                  }
                }
              } else {
                param9.a(225, param9.field_c + 64.0, param7);
                if (4.0 > param9.field_c % 64.0) {
                  param9.field_w = 1;
                  param9.field_c = 64.0 * Math.floor(param9.field_c / 64.0);
                }
              }
            } else {
              if (param9.field_i == 27) {
                if (ln.field_a.field_c[param12] == 6) {
                  ln.field_a.field_c[param12] = 5;
                }
                if (ln.field_a.field_c[-1 + param12] == 6) {
                  ln.field_a.field_c[-1 + param12] = 0;
                }
                if (6 == ln.field_a.field_c[param12 - ln.field_a.field_d]) {
                  ln.field_a.field_c[param12 - ln.field_a.field_d] = 0;
                }
                if (ln.field_a.field_c[param12 + (-ln.field_a.field_d - 1)] == 6) {
                  ln.field_a.field_c[-1 + (param12 - ln.field_a.field_d)] = 0;
                }
              }
              boolean decompiledFrameRemainder1 = true;
              if (param8) {
                if (var20 != 0 &&
                  var21 == 0) {
                  param9.field_w = 4;
                } else {
                  if (var21 == 0) {
                    param9.field_J = false;
                  } else {
                    param9.field_w = 1;
                    param9.field_J = true;
                    if (param9.field_B > 0) {
                      param9.field_B = 0;
                    }
                  }
                  var22 = cm.field_c[param12];
                  var23 = param12 - param10;
                  var24 = param12 + param10;
                  var25 = param12 + 1;
                  var26 = -1 + param12;
                  stackIn_123_0 = (3 == param9.field_i) ? 0 : 1;
                  var27 = stackIn_123_0;
                  stackIn_126_0 = (1 >= ln.field_a.b(var27, 5857, var23)) ? 0 : 1;
                  var28 = stackIn_126_0;
                  stackIn_129_0 = (1 >= ln.field_a.b(var27, 5857, var24)) ? 0 : 1;
                  var29 = stackIn_129_0;
                  stackIn_132_0 = (ln.field_a.b(var27, 5857, var25) <= 1) ? 0 : 1;
                  var30 = stackIn_132_0;
                  stackIn_135_0 = (ln.field_a.b(var27, 5857, var26) <= 1) ? 0 : 1;
                  var31 = stackIn_135_0;
                  if (var28 == 0 &&
                    var29 == 0 &&
                    var30 == 0 &&
                    var31 == 0) {
                    stackIn_142_0 = 0;
                  } else {
                    stackIn_142_0 = 1;
                  }
                  var32 = stackIn_142_0;
                  if (var32 == 0 && (!(1 >= ln.field_a.b(var27, 5857, -1 + var23)) ||
                    !(ln.field_a.b(var27, 5857, 1 + var23) <= 1) ||
                    !(ln.field_a.b(var27, 5857, var24 - 1) <= 1) ||
                    !(ln.field_a.b(var27, 5857, var24 + 1) <= 1))) {
                    var32 = 1;
                  }
                  var33 = 0;
                  if (var32 != 0) {
                    var33 = 1;
                  } else {
                    if (!param9.field_J) {
                      if (var22 <= cm.field_c[var23] &&
                        var28 == 0) {
                        stackIn_173_0 = 1;
                      } else {
                        stackIn_173_0 = 0;
                      }
                      var34 = stackIn_173_0;
                      if (var22 <= cm.field_c[var26] &&
                        var31 == 0) {
                        stackIn_177_0 = 1;
                      } else {
                        stackIn_177_0 = 0;
                      }
                      var37 = stackIn_177_0;
                      if (cm.field_c[var24] >= var22 &&
                        var29 == 0) {
                        stackIn_181_0 = 1;
                      } else {
                        stackIn_181_0 = 0;
                      }
                      var35 = stackIn_181_0;
                      if (cm.field_c[var25] >= var22 &&
                        var30 == 0) {
                        stackIn_185_0 = 1;
                      } else {
                        stackIn_185_0 = 0;
                      }
                      var36 = stackIn_185_0;
                    } else {
                      if (cm.field_c[var24] <= var22 &&
                        var29 == 0) {
                        stackIn_156_0 = 1;
                      } else {
                        stackIn_156_0 = 0;
                      }
                      var34 = stackIn_156_0;
                      if (var22 >= cm.field_c[var26] &&
                        var31 == 0) {
                        stackIn_160_0 = 1;
                      } else {
                        stackIn_160_0 = 0;
                      }
                      var36 = stackIn_160_0;
                      if (var22 >= cm.field_c[var23] &&
                        var28 == 0) {
                        stackIn_164_0 = 1;
                      } else {
                        stackIn_164_0 = 0;
                      }
                      var35 = stackIn_164_0;
                      if (var22 >= cm.field_c[var25] &&
                        var30 == 0) {
                        stackIn_168_0 = 1;
                      } else {
                        stackIn_168_0 = 0;
                      }
                      var37 = stackIn_168_0;
                    }
                    if ((var18 >= 224.0 ||
                      var18 < 32.0) &&
                      var34 == 0) {
                      var33 = 1;
                    } else {
                      if (32.0 <= var18 &&
                        96.0 > var18 &&
                        var37 == 0) {
                        var33 = 1;
                      } else {
                        if (96.0 <= var18 &&
                          var18 < 160.0 &&
                          var35 == 0) {
                          var33 = 1;
                        } else {
                          if (var18 >= 160.0 &&
                            224.0 > var18 &&
                            var36 == 0) {
                            var33 = 1;
                          }
                        }
                      }
                    }
                  }
                  if (var33 == 0) {
                    if (1 == param9.field_i &&
                      !param9.field_J) {
                      if (0 < tm.field_q) {
                        if (-25 >= param9.field_B) {
                          param9.field_B = (int)((0.5 * Math.random() + 0.5) * 100.0);
                        }
                        if (of.field_a == 0 &&
                          Math.random() < 0.4) {
                          var38 = uh.field_i;
                          if (param11 >= 4 ||
                            param15 >= 4) {
                            var38 = var38 / 2;
                          }
                          jh.a(var38, (byte) 49, 12, jc.field_c, 6);
                          of.field_a = 20 + (int)(50.0 * Math.random());
                        }
                      } else {
                        if (param9.field_B <= -100 &&
                          Math.random() < 0.04) {
                          param9.field_B = (int)((0.5 + Math.random() * 0.5) * 100.0);
                        }
                        if (of.field_a == 0 &&
                          Math.random() < 0.4) {
                          var38 = uh.field_i;
                          if (param11 >= 4 ||
                            4 <= param15) {
                            var38 = var38 / 2;
                          }
                          jh.a(var38, (byte) 40, 12, jc.field_c, 6);
                          of.field_a = (int)(50.0 * Math.random()) + 20;
                        }
                      }
                    }
                    if (0 < param9.field_B) {
                      param6 = param6 * 3;
                      param9.field_p = param9.field_p + 2;
                      if (param9.field_p >= param9.field_C) {
                        param9.field_p = 0;
                        param9.field_z = param9.field_z + 1;
                      }
                    }
                    param9.a(225, var18, 3);
                    li.field_r = param9.a(ln.field_a, 128, param6);
                    if (li.field_r[0] ||
                      li.field_r[1]) {
                      param9.field_D = 50;
                      param9.field_w = 0;
                    }
                  } else {
                    if (1 == param9.field_i &&
                      !param9.field_J) {
                      if (tm.field_q > 0) {
                        if (param9.field_B <= -25) {
                          param9.field_B = (int)((Math.random() + 0.5) * 100.0);
                        }
                      } else {
                        if (param9.field_B <= -100 &&
                          Math.random() < 0.02) {
                          param9.field_B = (int)(100.0 * (Math.random() + 0.5));
                        }
                      }
                    }
                    if (param9.field_B > 0) {
                      param6 = param6 * 3;
                      param9.field_p = param9.field_p + 2;
                      if (param9.field_p >= param9.field_C) {
                        param9.field_p = 0;
                        param9.field_z = param9.field_z + 1;
                      }
                    }
                    if (!param9.field_J) {
                      if (var22 <= cm.field_c[var26] &&
                        var31 == 0) {
                        stackIn_249_0 = 1;
                      } else {
                        stackIn_249_0 = 0;
                      }
                      var37 = stackIn_249_0;
                      if (cm.field_c[var25] >= var22 &&
                        var30 == 0) {
                        stackIn_253_0 = 1;
                      } else {
                        stackIn_253_0 = 0;
                      }
                      var36 = stackIn_253_0;
                      if (var22 <= cm.field_c[var24] &&
                        var29 == 0) {
                        stackIn_257_0 = 1;
                      } else {
                        stackIn_257_0 = 0;
                      }
                      var35 = stackIn_257_0;
                      if (var22 <= cm.field_c[var23] &&
                        var28 == 0) {
                        stackIn_261_0 = 1;
                      } else {
                        stackIn_261_0 = 0;
                      }
                      var34 = stackIn_261_0;
                      if (var34 == 0 &&
                        var35 == 0 &&
                        var36 == 0 &&
                        var37 == 0) {
                        if (var30 == 0) {
                          var36 = 1;
                        } else {
                          if (var28 == 0) {
                            var34 = 1;
                          }
                        }
                      }
                    } else {
                      if (cm.field_c[var24] <= var22 &&
                        var29 == 0) {
                        stackIn_225_0 = 1;
                      } else {
                        stackIn_225_0 = 0;
                      }
                      var34 = stackIn_225_0;
                      if (var22 >= cm.field_c[var26] &&
                        var31 == 0) {
                        stackIn_229_0 = 1;
                      } else {
                        stackIn_229_0 = 0;
                      }
                      var36 = stackIn_229_0;
                      if (var22 >= cm.field_c[var23] &&
                        var28 == 0) {
                        stackIn_233_0 = 1;
                      } else {
                        stackIn_233_0 = 0;
                      }
                      var35 = stackIn_233_0;
                      if (cm.field_c[var25] <= var22 &&
                        var30 == 0) {
                        stackIn_237_0 = 1;
                      } else {
                        stackIn_237_0 = 0;
                      }
                      var37 = stackIn_237_0;
                      if (var34 == 0 &&
                        var35 == 0 &&
                        var36 == 0 &&
                        var37 == 0) {
                        if (var30 == 0) {
                          var37 = 1;
                        } else {
                          if (var28 == 0) {
                            var35 = 1;
                          }
                        }
                      }
                    }
                    if (var34 != 0) {
                      var18 = 0.0;
                    }
                    if (var35 != 0) {
                      var18 = 128.0;
                    }
                    if (var36 != 0) {
                      var18 = 192.0;
                    }
                    if (var37 != 0) {
                      var18 = 64.0;
                    }
                    param9.a(225, var18, 3);
                    if (64.0 == var18 ||
                      192.0 == var18) {
                      if (0.5 > param4.field_a) {
                        param4.field_a = param4.field_a + 0.01;
                      }
                      if (0.5 < param4.field_a) {
                        param4.field_a = param4.field_a - 0.01;
                      }
                    }
                    if (0.0 == var18 ||
                      var18 == 128.0) {
                      if (0.5 > param4.field_f) {
                        param4.field_f = param4.field_f + 0.01;
                      }
                      if (param4.field_f > 0.5) {
                        param4.field_f = param4.field_f - 0.01;
                      }
                    }
                    var38 = param6;
                    var39 = var38 / 2;
                    var38 = var38 - var39;
                    li.field_r = param9.a(ln.field_a, 128, var39);
                    if ((li.field_r[0] ||
                      li.field_r[1]) && (param9.field_i == 27 &&
                      !param9.field_s)) {
                      param9.field_I = param9.field_x;
                      param9.field_L = 100;
                      param9.field_s = true;
                    }
                    var39 = var38 / 2;
                    param9.a(225, var18, 1);
                    li.field_r = param9.a(ln.field_a, 128, var39);
                    var38 = var38 - var39;
                    if (!li.field_r[0] &&
                      !li.field_r[1]) {
                    }
                    param9.a(225, var18, 1);
                    li.field_r = param9.a(ln.field_a, 128, var38);
                    if (!li.field_r[0] &&
                      !li.field_r[1]) {
                    }
                  }
                }
              } else {
                if (0 < param9.field_B) {
                  param9.field_B = 0;
                }
                if (0 <= param9.field_I) {
                  param9.field_t = param6;
                  param9.field_K = param9.field_c;
                }
                li.field_r = param9.a(param6, 3, ln.field_a);
                if (!li.field_r[0] &&
                  !li.field_r[1]) {
                  if (!(!(0.01 > Math.random()))) {
                    param9.field_D = 50;
                    param9.field_w = 0;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  param9.field_w = 0;
                  param9.field_D = 50;
                }
              }
              if (param9.field_i == 27) {
                ln.field_a.field_c[param12] = 6;
                if (0 == ln.field_a.field_c[-1 + param12]) {
                  ln.field_a.field_c[-1 + param12] = 6;
                }
                if (0 == ln.field_a.field_c[-1 - ln.field_a.field_d + param12]) {
                  ln.field_a.field_c[-ln.field_a.field_d + (param12 - 1)] = 6;
                }
                if (ln.field_a.field_c[-ln.field_a.field_d + param12] == 0) {
                  ln.field_a.field_c[param12 - ln.field_a.field_d] = 6;
                }
              }
            }
          } else {
            if (param9.field_i != 27 ||
              param9.field_s ||
              var21 != 0) {
              if (param8) {
                if (var21 == 0) {
                  param9.field_J = false;
                  if (var20 == 0) {
                    param9.field_w = 1;
                    param9.a(225, var18, param14);
                  } else {
                    param9.field_w = 4;
                    param9.field_c = var18;
                  }
                } else {
                  param9.field_w = 1;
                  param9.field_J = true;
                }
              } else {
                fieldTemp$7 = param9.field_D - 1;
                param9.field_D = param9.field_D - 1;
                if (fieldTemp$7 < 0) {
                  var22 = (int)(Math.random() * 3.0);
                  if (var22 != 0) {
                    if (var22 != 1) {
                      if (var22 == 2) {
                        param9.field_w = 3;
                      }
                    } else {
                      param9.field_w = 2;
                    }
                  } else {
                    param9.field_w = 1;
                  }
                }
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (param9.field_w != 5) {
            if (var21 != 0) {
              param9.field_J = true;
              param9.field_w = 1;
            }
            if (param11 <= param1 &&
              param1 >= param15 &&
              -param1 <= param11 &&
              -param1 <= param15) {
              if (((param9.field_i != 19)) &&
                (!(param9.field_J))) {
                param9.field_w = 4;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              param9.field_J = false;
            }
          }
          if (param9.field_I <= 0) {
            tm.field_q = 2;
            if (param9.field_i != 27 &&
              param9.field_w != 5) {
              param9.field_z = 0;
              param9.field_w = 5;
              param9.e((byte) -49);
              if (8 == param9.field_i) {
                param9.field_C = 16;
              }
            }
          }
          ak.field_f = ak.field_f + 1;
          if (param13 < 12) {
            return;
          }
          if (param8) {
            ak.field_f = ak.field_f + 50;
          }
          if (param9.field_w == 4) {
            ak.field_f = ak.field_f + 450;
          }
          if (param9.field_i == 27) {
            if (4 != param9.field_w) {
              var22 = cm.field_c[param9.field_j.b(-4)];
              if (0 < var22) {
                lj.field_q = lj.field_q + var22 * 50;
              }
            } else {
              lj.field_q = 256;
            }
            if (lj.field_q >= 20) {
              return;
            }
            lj.field_q = 20;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17_ref = decompiledCaughtException;
          stackIn_474_0 = var17_ref;
          stackIn_474_1 = new StringBuilder().append("ei.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_475_2 = "null";
          } else {
            stackIn_475_2 = "{...}";
          }
          stackIn_477_1 = ((StringBuilder) (Object) stackIn_474_1).append(stackIn_475_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_478_2 = "null";
          } else {
            stackIn_478_2 = "{...}";
          }
          stackIn_480_1 = ((StringBuilder) (Object) stackIn_477_1).append(stackIn_478_2).append(',');
          if (param5 == null) {
            stackIn_481_2 = "null";
          } else {
            stackIn_481_2 = "{...}";
          }
          stackIn_483_1 = ((StringBuilder) (Object) stackIn_480_1).append(stackIn_481_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_484_2 = "null";
          } else {
            stackIn_484_2 = "{...}";
          }
          stackIn_486_1 = ((StringBuilder) (Object) stackIn_483_1).append(stackIn_484_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_487_2 = "null";
          } else {
            stackIn_487_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_474_0), ((StringBuilder) (Object) stackIn_486_1).append(stackIn_487_2).append(')').toString());
        }
    }

    final static bd[] a(int param0, int param1, int param2, int param3, int param4) {
        bd[] var6 = new bd[9];
        bd[] var5 = var6;
        bd dupTemp$0 = el.a(-7, param1, param3);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        if (param4 <= 101) {
          field_o = (eg) null;
        }
        bd dupTemp$1 = el.a(-122, param1, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param2 != 0) {
          var6[4] = el.a(-115, 64, param2);
        }
        return var5;
    }

    final static void d(int param0) {
        int stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        int stackIn_5_5 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (jf.field_d < 50) {
          stackIn_4_0 = 0;
          stackIn_4_1 = 0;
          stackIn_4_2 = 640;
          stackIn_4_3 = 480;
          stackIn_4_4 = 0;
          if (jf.field_d < 25) {
            stackIn_5_5 = 0;
          } else {
            stackIn_5_5 = -50 + 2 * jf.field_d;
          }
          si.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, -(stackIn_5_5 * 5) + 250);
          var1 = -72 + mm.field_m[0].field_j.field_e * 24 - uj.field_p.field_e;
          var2 = -48 + 24 * mm.field_m[0].field_j.field_g - uj.field_p.field_g;
          if (dl.field_n != null) {
            var3 = 0;
            var4 = 1;
            if (bm.field_c == 0) {
              if (rl.field_c == 0) {
                var4 = 0;
              }
              if (rl.field_c == 1) {
                var3 = 1;
              }
            } else {
              if (rl.field_c <= 4) {
                var3 = 1;
              }
              if (0 == rl.field_c) {
                var4 = 0;
              }
              if (rl.field_c == 8) {
                var4 = 0;
              }
              if (rl.field_c == 9) {
                var4 = 0;
              }
            }
            if (var4 != 0) {
              vj.field_e[0].a(true, 128, 192, var1 + dl.field_n.field_z / 2, dl.field_n.field_z / 2 + var2);
              if (var3 == 0) {
                if (jf.field_d >= 40) {
                  dl.field_n.c(-((50 - jf.field_d) / 2) + var1, -((-jf.field_d + 50) / 2) + var2, -jf.field_d + dl.field_n.field_u + 50, 50 + dl.field_n.field_r - jf.field_d, -(25 * jf.field_d) + 1250);
                } else {
                  dl.field_n.a(var1 - (-jf.field_d + 50) / 2, var2 - (50 - jf.field_d) / 2, 50 + (dl.field_n.field_u - jf.field_d), 50 + (dl.field_n.field_r - jf.field_d));
                  si.a(-((-jf.field_d + 50) / 2) + var1, -((-jf.field_d + 50) / 2) + var2, dl.field_n.field_u + 50 - jf.field_d, 50 + dl.field_n.field_r - jf.field_d, 0, (10200 - 255 * jf.field_d) / 40);
                }
              } else {
                if (jf.field_d < 40) {
                  dl.field_n.b(var1 + dl.field_n.field_z / 2, var2 + dl.field_n.field_z / 2, 0, jf.field_d + 78 << 5);
                } else {
                  dl.field_n.c((50 - jf.field_d) / 4 + var1, var2 + (-jf.field_d + 50) / 4, -((-jf.field_d + 50) / 2) + dl.field_n.field_u, dl.field_n.field_r - (50 - jf.field_d) / 2, -(25 * jf.field_d) + 1250);
                }
              }
            }
          }
        }
        if (param0 > -8) {
          ei.d(-29);
        }
    }

    final static void a(p param0, byte param1, int[] param2, int param3, int[] param4, int[] param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        oc var7 = null;
        og var8 = null;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          param0.a(param1 ^ -8463);
          param0.field_e = 0;
          if (param1 != -116) {
            ei.d(49);
          }
          var6_int = 0;
          var7 = param0.field_j;
          var8 = param0.field_l;
          var9 = param0.field_c;
          param4[param3] = 0;
          var11 = ln.field_a.field_r[param3] ? 1 : 0;
          while (param0.field_e == 0) {
            if (var6_int < 104) {
              var8.a(5, (byte) 94, var9);
              var6_int++;
              param0.a(param1 + 8689);
              var12 = var7.b(-4);
              if (var11 == 0 &&
                !wb.field_Z &&
                ln.field_a.field_r[var12]) {
                param0.field_e = 1;
              }
              var11 = ln.field_a.field_r[var12] ? 1 : 0;
              if (param2[var12] == 1) {
                if (4 <= var6_int) {
                  param0.field_e = 1;
                } else {
                  tg.a(var12, param1 + 30543);
                }
              }
              if (param4[var12] == 2) {
                param0.field_e = 1;
              }
              var13 = 26 - (var6_int >> 2);
              if (param5[var12] >= var13) {
                continue;
              }
              param5[var12] = var13;
              continue;
            }
            break;
          }
          param4[param3] = 3;
          param0.field_i = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("ei.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_p = null;
        field_m = null;
        field_k = null;
        field_o = null;
        field_h = null;
        field_n = null;
        if (param0 != 3) {
          String var2 = (String) null;
          ei.a((gb) null, 102, (String) null, (String) null);
        }
        field_q = null;
    }

    final static bd[] a(gb param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        oc var6 = null;
        bd[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a((byte) -2, param2);
          if (param1 < 88) {
            var6 = (oc) null;
            ei.a(36, -95, (oc) null, true, (og) null, (oc) null, 63, -21, false, (oj) null, -5, 22, 60, 105, 79, 88, (oc) null);
          }
          var5 = param0.a(var4_int, param3, -1);
          stackIn_3_0 = ne.a(44, param0, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ei.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ei(long param0, int param1, byte[] param2) {
        try {
          this.field_r = param2;
          this.field_j = param0;
          this.field_s = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ei.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = false;
        field_l = 0;
        field_k = "Passwords must be between 5 and 20 characters long";
        field_q = new vl();
        field_t = true;
        field_h = new vl();
    }
}
