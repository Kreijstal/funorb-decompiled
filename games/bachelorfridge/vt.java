/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt extends tia {
    static int field_k;
    static String field_m;
    static int[] field_l;
    private eaa field_j;
    private kv[] field_i;

    final static void a(sga param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        eaa var10 = null;
        Object var11 = null;
        int var11_int = 0;
        ema var12 = null;
        int var13 = 0;
        sna var14 = null;
        sna var15 = null;
        sna var16 = null;
        sna var17 = null;
        sna var18 = null;
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
        sga stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        sga stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        sga stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_54_0 = 0;
        sna stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        sna stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        sna stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        RuntimeException stackIn_212_0 = null;
        StringBuilder stackIn_212_1 = null;
        RuntimeException stackIn_213_0 = null;
        StringBuilder stackIn_213_1 = null;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        String stackIn_214_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        sga stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        sga stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        sga stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        sna stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        sna stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        sna stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_91_4 = 0;
        RuntimeException stackOut_211_0 = null;
        StringBuilder stackOut_211_1 = null;
        RuntimeException stackOut_213_0 = null;
        StringBuilder stackOut_213_1 = null;
        String stackOut_213_2 = null;
        RuntimeException stackOut_212_0 = null;
        StringBuilder stackOut_212_1 = null;
        String stackOut_212_2 = null;
        var31 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = param2;
              if (pw.field_w == null) {
                break L1;
              } else {
                L2: {
                  if (null != hr.field_b) {
                    break L2;
                  } else {
                    if (null != re.field_F) {
                      break L2;
                    } else {
                      if (null != gma.field_c) {
                        break L2;
                      } else {
                        if (null != wda.field_c) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                var9 = 0;
                L3: while (true) {
                  if (var9 >= ld.field_q) {
                    break L1;
                  } else {
                    L4: {
                      var10_int = pw.field_w.field_Eb[var9] & 255;
                      if (hr.field_b == null) {
                        break L4;
                      } else {
                        if (hr.field_b[var9] != null) {
                          if (!hr.field_b[var9][var10_int]) {
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
                      if (re.field_F == null) {
                        break L5;
                      } else {
                        if (null == re.field_F[var9]) {
                          break L5;
                        } else {
                          L6: {
                            var11_int = re.field_F[var9][var10_int];
                            if (var11_int > var6) {
                              var6 = var11_int;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if (-1 == (var11_int ^ -1)) {
                            break L5;
                          } else {
                            if (!bha.field_l) {
                              var5_int = 1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    L7: {
                      if (null == gma.field_c) {
                        break L7;
                      } else {
                        if (gma.field_c[var9] == null) {
                          break L7;
                        } else {
                          L8: {
                            var11_int = gma.field_c[var9][var10_int];
                            if (var11_int == 0) {
                              break L8;
                            } else {
                              if (bha.field_l) {
                                break L8;
                              } else {
                                var5_int = 1;
                                break L8;
                              }
                            }
                          }
                          if (var11_int <= var7) {
                            break L7;
                          } else {
                            var7 = var11_int;
                            break L7;
                          }
                        }
                      }
                    }
                    if (wda.field_c != null) {
                      if (null != wda.field_c[var9]) {
                        var8 = var8 | wda.field_c[var9][var10_int];
                        var9++;
                        continue L3;
                      } else {
                        var9++;
                        continue L3;
                      }
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L9: {
              stackOut_35_0 = (sga) (param0);
              stackOut_35_1 = 4 + rg.field_h * 2;
              stackOut_35_2 = 2;
              stackOut_35_3 = (rg.field_h * 4 - -8) * param4;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              stackIn_37_3 = stackOut_35_3;
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              stackIn_36_3 = stackOut_35_3;
              if (bga.field_m != param0) {
                stackOut_37_0 = (sga) ((Object) stackIn_37_0);
                stackOut_37_1 = stackIn_37_1;
                stackOut_37_2 = stackIn_37_2;
                stackOut_37_3 = stackIn_37_3;
                stackOut_37_4 = 0;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                stackIn_38_2 = stackOut_37_2;
                stackIn_38_3 = stackOut_37_3;
                stackIn_38_4 = stackOut_37_4;
                break L9;
              } else {
                stackOut_36_0 = (sga) ((Object) stackIn_36_0);
                stackOut_36_1 = stackIn_36_1;
                stackOut_36_2 = stackIn_36_2;
                stackOut_36_3 = stackIn_36_3;
                stackOut_36_4 = 1;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_38_2 = stackOut_36_2;
                stackIn_38_3 = stackOut_36_3;
                stackIn_38_4 = stackOut_36_4;
                break L9;
              }
            }
            L10: {
              if (((sga) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4 == 0, param3, true)) {
                stackOut_40_0 = 0;
                stackIn_41_0 = stackOut_40_0;
                break L10;
              } else {
                stackOut_39_0 = 1;
                stackIn_41_0 = stackOut_39_0;
                break L10;
              }
            }
            var9 = stackIn_41_0;
            var10 = param0.field_vb.field_z;
            var11 = null;
            var12 = (ema) ((Object) var10.b((byte) 90));
            L11: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L12: {
                  var13 = 0;
                  if (var12.field_z != null) {
                    break L12;
                  } else {
                    L13: {
                      var12.field_Ib = new sna(0L, gi.field_c);
                      var12.a(-1, var12.field_Ib);
                      var12.field_Bb = new sna(0L, wv.field_l);
                      if (eaa.field_c) {
                        var12.a(-1, var12.field_Bb);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var12.field_Bb.field_N = 2;
                    var12.field_vb = new sna(0L, qs.field_m);
                    var12.a(param2 ^ -1, var12.field_vb);
                    var12.d((byte) 118);
                    var12.field_Fb = new sna(0L, mh.field_k);
                    var12.a(-1, var12.field_Fb);
                    var12.field_Db = new sna(0L, tca.field_c);
                    var13 = 1;
                    var12.a(-1, var12.field_Db);
                    break L12;
                  }
                }
                L14: {
                  var12.field_Ib.field_Z = null;
                  var12.field_Ib.field_p = 0;
                  var14 = var12.field_Ib;
                  var12.field_Bb.field_Z = null;
                  var14.field_sb = 0;
                  var12.field_Bb.field_p = 0;
                  var15 = var12.field_Bb;
                  var12.field_Fb.field_Z = null;
                  var15.field_sb = 0;
                  var16 = var12.field_Fb;
                  var12.field_Fb.field_p = 0;
                  var12.field_Db.field_Z = null;
                  var16.field_sb = 0;
                  var17 = var12.field_Db;
                  var12.field_Db.field_p = 0;
                  var17.field_sb = 0;
                  var12.field_vb.field_Z = null;
                  var12.field_vb.field_p = 0;
                  var18 = var12.field_vb;
                  var18.field_sb = 0;
                  var12.field_sb = param0.field_vb.field_sb;
                  var19 = 0;
                  var32 = var12.field_Nb;
                  var21 = 72;
                  if (param0 == qba.field_m) {
                    var21 += 42;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  var33 = po.a(var12.field_Ib.field_jb, var32, var21);
                  var20 = var33;
                  if (var33.equals(var12.field_Nb)) {
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    break L15;
                  } else {
                    stackOut_52_0 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    break L15;
                  }
                }
                L16: {
                  var22 = stackIn_54_0;
                  if (4 > var12.field_Kb) {
                    if (-1 > (var12.field_Kb ^ -1)) {
                      var20 = "<img=" + (var12.field_Kb - 1) + ">" + var33;
                      break L16;
                    } else {
                      break L16;
                    }
                  } else {
                    var20 = "<img=" + (re.field_E + -4 + var12.field_Kb) + ">" + var33;
                    break L16;
                  }
                }
                L17: {
                  var12.field_Ib.field_Z = var20;
                  if (var12.f((byte) 21)) {
                    break L17;
                  } else {
                    L18: {
                      L19: {
                        L20: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L20;
                          } else {
                            if (!var12.field_zb) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (var12.field_Jb < var6) {
                          break L19;
                        } else {
                          if (var7 > var12.field_Gb) {
                            break L19;
                          } else {
                            if (0 >= (var8 & (var12.field_xb ^ -1))) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      var23_int = 8414771;
                      var24_int = 8421504;
                      break L18;
                    }
                    L21: {
                      var12.field_Fb.field_gb = var23_int;
                      var12.field_Bb.field_gb = var23_int;
                      var12.field_Ib.field_gb = var23_int;
                      var12.field_Ib.field_w = var24_int;
                      var12.field_Ib.field_G = var24_int;
                      var12.field_Ib.field_ab = var24_int;
                      var12.field_Bb.field_w = var24_int;
                      var12.field_Bb.field_G = var24_int;
                      var12.field_Bb.field_ab = var24_int;
                      var12.field_Fb.field_w = var24_int;
                      var12.field_Fb.field_G = var24_int;
                      var12.field_Fb.field_ab = var24_int;
                      if (param0 == ak.field_q) {
                        if (!pw.field_w.field_Zb) {
                          var12.field_Db.field_Z = ui.field_p;
                          break L21;
                        } else {
                          break L21;
                        }
                      } else {
                        if (!var12.field_wb) {
                          if (!var12.field_Ob) {
                            var12.field_Fb.field_Z = go.field_r;
                            break L21;
                          } else {
                            var12.field_Ib.field_Z = lga.a(true, new String[]{var20}, ql.field_p);
                            var12.field_Fb.field_Z = mc.field_i;
                            var12.field_Db.field_Z = im.field_b;
                            break L21;
                          }
                        } else {
                          var12.field_Ib.field_Z = lga.a(true, new String[]{var20}, vla.field_t);
                          var12.field_Db.field_Z = bga.field_f;
                          break L21;
                        }
                      }
                    }
                    L22: {
                      var25_int = 0;
                      if (null == pw.field_w) {
                        break L22;
                      } else {
                        if (!ps.d(-118)) {
                          break L22;
                        } else {
                          if (ge.field_F != var12.field_Eb) {
                            L23: {
                              if (var12.field_Fb.field_Z != null) {
                                var26 = var12.field_Fb.e(-1) - -(gba.field_Bb * 2);
                                var12.field_Fb.a(rg.field_h, 31407, var26, var25_int, var19);
                                var25_int = var25_int + var26;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            if (null != var12.field_Db.field_Z) {
                              L24: {
                                if (ak.field_q == param0) {
                                  var26 = 40;
                                  break L24;
                                } else {
                                  var26 = var12.field_Db.e(-1) - -(gba.field_Bb * 2);
                                  break L24;
                                }
                              }
                              var12.field_Db.a(rg.field_h, 31407, var26, var25_int, var19);
                              var25_int = var25_int + var26;
                              break L22;
                            } else {
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    L25: {
                      stackOut_90_0 = var12.field_Ib;
                      stackOut_90_1 = rg.field_h;
                      stackOut_90_2 = param2 + 31407;
                      stackOut_90_3 = var12.field_sb;
                      stackIn_92_0 = stackOut_90_0;
                      stackIn_92_1 = stackOut_90_1;
                      stackIn_92_2 = stackOut_90_2;
                      stackIn_92_3 = stackOut_90_3;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      stackIn_91_2 = stackOut_90_2;
                      stackIn_91_3 = stackOut_90_3;
                      if (!eaa.field_c) {
                        stackOut_92_0 = (sna) ((Object) stackIn_92_0);
                        stackOut_92_1 = stackIn_92_1;
                        stackOut_92_2 = stackIn_92_2;
                        stackOut_92_3 = stackIn_92_3;
                        stackOut_92_4 = 0;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        stackIn_93_2 = stackOut_92_2;
                        stackIn_93_3 = stackOut_92_3;
                        stackIn_93_4 = stackOut_92_4;
                        break L25;
                      } else {
                        stackOut_91_0 = (sna) ((Object) stackIn_91_0);
                        stackOut_91_1 = stackIn_91_1;
                        stackOut_91_2 = stackIn_91_2;
                        stackOut_91_3 = stackIn_91_3;
                        stackOut_91_4 = 42;
                        stackIn_93_0 = stackOut_91_0;
                        stackIn_93_1 = stackOut_91_1;
                        stackIn_93_2 = stackOut_91_2;
                        stackIn_93_3 = stackOut_91_3;
                        stackIn_93_4 = stackOut_91_4;
                        break L25;
                      }
                    }
                    L26: {
                      L27: {
                        ((sna) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3 + -stackIn_93_4 - var25_int, var25_int, var19);
                        var12.field_Bb.field_Z = Integer.toString(var12.field_Jb);
                        var12.field_Bb.a(rg.field_h, param2 + 31407, 40, -40 + var12.field_sb, var19);
                        if (!var12.field_Ib.field_T) {
                          break L27;
                        } else {
                          if (var22 != 0) {
                            jja.field_m = var12.field_Nb;
                            if (null == nt.field_y) {
                              break L26;
                            } else {
                              if (null != nt.field_y[var12.field_Kb]) {
                                jja.field_m = jja.field_m + " - " + nt.field_y[var12.field_Kb];
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                          } else {
                            break L27;
                          }
                        }
                      }
                      if (!var12.field_Ib.field_T) {
                        break L26;
                      } else {
                        if (nt.field_y == null) {
                          break L26;
                        } else {
                          if (nt.field_y[var12.field_Kb] != null) {
                            jja.field_m = nt.field_y[var12.field_Kb];
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    var19 = var19 + rg.field_h;
                    break L17;
                  }
                }
                L28: {
                  var23 = vaa.a(var20, var12.field_yb, -1);
                  var24 = var23;
                  var30 = var24;
                  var25 = var30;
                  var24 = var23;
                  if (var23 != null) {
                    var24_int = var12.field_vb.field_jb.b(var23, -gba.field_Bb + -gba.field_Bb + var12.field_sb);
                    var12.field_vb.field_Z = var23;
                    var12.field_vb.field_cb = 256 * var12.field_Mb / kla.field_x;
                    var12.field_vb.a(rg.field_h * var24_int, 31407, -(gba.field_Bb * 2) + var12.field_sb, gba.field_Bb, var19);
                    var19 = var19 + var24_int * rg.field_h;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (var9 != 0) {
                    break L29;
                  } else {
                    var12.field_hb = var19 + -var12.field_p;
                    break L29;
                  }
                }
                L30: {
                  if (var13 == 0) {
                    break L30;
                  } else {
                    param0.field_vb.a(false, var12, (sna) (var11), 2);
                    break L30;
                  }
                }
                L31: {
                  if (var12.field_R == 0) {
                    break L31;
                  } else {
                    if (var12.f((byte) 21)) {
                      break L31;
                    } else {
                      if (var12.field_Fb.field_R == 0) {
                        if (var12.field_Db.field_R != 0) {
                          od.a(var12.field_Eb, param1, 2);
                          break L31;
                        } else {
                          rda.a((byte) -104, 0, 0, param0, jc.field_r, var12, nfa.field_a);
                          break L31;
                        }
                      } else {
                        bia.a((byte) 90, var12.field_Eb, param1);
                        break L31;
                      }
                    }
                  }
                }
                L32: {
                  var11 = var12;
                  if (!var12.field_E) {
                    break L32;
                  } else {
                    if (var12.f((byte) 21)) {
                      break L32;
                    } else {
                      L33: {
                        var24 = null;
                        if ((ge.field_F ^ -1L) != (var12.field_Eb ^ -1L)) {
                          L34: {
                            if (var5_int == 0) {
                              break L34;
                            } else {
                              if (!var12.field_zb) {
                                var24 = lga.a(true, new String[]{var20}, in.field_d);
                                var30 = var24;
                                var25 = var30;
                                var24 = var25;
                                var30 = var24;
                                var25 = var30;
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          if (var7 > var12.field_Gb) {
                            L35: {
                              var25_int = var7 - var12.field_Gb;
                              if (var25_int != 1) {
                                break L35;
                              } else {
                                var24 = lga.a(true, new String[]{var20}, sna.field_C);
                                break L35;
                              }
                            }
                            var24 = lga.a(true, new String[]{var20, Integer.toString(var25_int)}, pi.field_h);
                            break L33;
                          } else {
                            if (var6 <= var12.field_Jb) {
                              if (0 == (var8 & (var12.field_xb ^ -1))) {
                                break L33;
                              } else {
                                var25_int = ho.a(91, (var12.field_xb ^ -1) & var8);
                                var24 = lga.a(true, new String[]{var20}, bh.field_s);
                                if (0 >= var25_int) {
                                  break L33;
                                } else {
                                  if (null == ffa.field_j) {
                                    break L33;
                                  } else {
                                    if (var25_int > ffa.field_j.length) {
                                      break L33;
                                    } else {
                                      if (null == ffa.field_j[var25_int + -1]) {
                                        break L33;
                                      } else {
                                        var24 = lga.a(true, new String[]{var20}, ffa.field_j[var25_int + -1][2]);
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = lga.a(true, new String[]{var20, Integer.toString(var6)}, bw.field_d);
                              break L33;
                            }
                          }
                        } else {
                          L36: {
                            if (var5_int == 0) {
                              break L36;
                            } else {
                              if (!var12.field_zb) {
                                var24 = fla.field_p;
                                break L33;
                              } else {
                                break L36;
                              }
                            }
                          }
                          if (var7 <= var12.field_Gb) {
                            if (var12.field_Jb < var6) {
                              var24 = lga.a(true, new String[]{null, Integer.toString(var6)}, pda.field_q);
                              break L33;
                            } else {
                              if (-1 == ((var12.field_xb ^ -1) & var8 ^ -1)) {
                                break L33;
                              } else {
                                var25_int = ho.a(86, (var12.field_xb ^ -1) & var8);
                                var24 = gl.field_f;
                                if ((var25_int ^ -1) >= -1) {
                                  break L33;
                                } else {
                                  if (ffa.field_j == null) {
                                    break L33;
                                  } else {
                                    if (ffa.field_j.length < var25_int) {
                                      break L33;
                                    } else {
                                      if (ffa.field_j[-1 + var25_int] == null) {
                                        break L33;
                                      } else {
                                        var24 = ffa.field_j[var25_int - 1][1];
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L37: {
                              var25_int = -var12.field_Gb + var7;
                              if (-2 == (var25_int ^ -1)) {
                                var24 = bk.field_w;
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            var24 = lga.a(true, new String[]{null, Integer.toString(var25_int)}, rj.field_o);
                            break L33;
                          }
                        }
                      }
                      if (var24 == null) {
                        break L32;
                      } else {
                        var34 = "<col=A00000>" + var24;
                        var30 = var34;
                        var25 = var30;
                        var24 = var25;
                        var30 = var34;
                        var25 = var30;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L38: while (true) {
                          if (var27_int >= ld.field_q) {
                            L39: {
                              L40: {
                                if (ak.field_q != param0) {
                                  break L40;
                                } else {
                                  if (!ps.d(param2 + -124)) {
                                    break L40;
                                  } else {
                                    if (var26 != 0) {
                                      var24 = var34 + "<br>" + qn.field_h + var25;
                                      break L39;
                                    } else {
                                      var24 = var34 + "<br>" + lga.a(true, new String[]{var25}, cb.field_n);
                                      break L39;
                                    }
                                  }
                                }
                              }
                              if (var26 == 0) {
                                var24 = var34 + "<br>" + lga.a(true, new String[]{var25}, jn.field_a);
                                break L39;
                              } else {
                                var24 = var34 + "<br>" + ra.field_l + var25;
                                break L39;
                              }
                            }
                            L41: {
                              if (ak.field_q != param0) {
                                break L41;
                              } else {
                                if (ps.d(-121)) {
                                  break L41;
                                } else {
                                  var27 = pw.field_w.field_Jb;
                                  var24 = var24 + "<br>" + lga.a(true, new String[]{var27}, ef.field_m);
                                  break L41;
                                }
                              }
                            }
                            jja.field_m = var24;
                            break L32;
                          } else {
                            L42: {
                              var28 = 255 & pw.field_w.field_Eb[var27_int];
                              var29 = 0;
                              if (hr.field_b == null) {
                                break L42;
                              } else {
                                if (null != hr.field_b[var27_int]) {
                                  if (!hr.field_b[var27_int][var28]) {
                                    break L42;
                                  } else {
                                    if (!var12.field_zb) {
                                      var29 = 1;
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                } else {
                                  break L42;
                                }
                              }
                            }
                            L43: {
                              if (null == re.field_F) {
                                break L43;
                              } else {
                                if (null != re.field_F[var27_int]) {
                                  L44: {
                                    var30_int = re.field_F[var27_int][var28];
                                    if (-1 == (var30_int ^ -1)) {
                                      break L44;
                                    } else {
                                      if (bha.field_l) {
                                        break L44;
                                      } else {
                                        if (var12.field_zb) {
                                          break L44;
                                        } else {
                                          var29 = 1;
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                  if (var12.field_Jb < var30_int) {
                                    var29 = 1;
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                } else {
                                  break L43;
                                }
                              }
                            }
                            L45: {
                              if (gma.field_c == null) {
                                break L45;
                              } else {
                                if (null != gma.field_c[var27_int]) {
                                  L46: {
                                    var30_int = gma.field_c[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L46;
                                    } else {
                                      if (bha.field_l) {
                                        break L46;
                                      } else {
                                        if (!var12.field_zb) {
                                          var29 = 1;
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int <= var12.field_Gb) {
                                    break L45;
                                  } else {
                                    var29 = 1;
                                    break L45;
                                  }
                                } else {
                                  break L45;
                                }
                              }
                            }
                            L47: {
                              if (null == wda.field_c) {
                                break L47;
                              } else {
                                if (null != wda.field_c[var27_int]) {
                                  if (-1 == ((var12.field_xb ^ -1) & wda.field_c[var27_int][var28] ^ -1)) {
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
                            L48: {
                              if (var29 != 0) {
                                var30 = "<col=A00000>" + kka.field_k[var27_int] + "</col>";
                                var25 = var30;
                                var24 = var25;
                                var25 = var30;
                                if (var25 == null) {
                                  var25 = var30;
                                  var24 = var25;
                                  var24 = var25;
                                  break L48;
                                } else {
                                  var25 = var25 + ", " + var30;
                                  var26 = 1;
                                  break L48;
                                }
                              } else {
                                break L48;
                              }
                            }
                            var27_int++;
                            continue L38;
                          }
                        }
                      }
                    }
                  }
                }
                var12 = (ema) ((Object) var10.c(0));
                continue L11;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L49: {
            var5 = decompiledCaughtException;
            stackOut_211_0 = (RuntimeException) (var5);
            stackOut_211_1 = new StringBuilder().append("vt.B(");
            stackIn_213_0 = stackOut_211_0;
            stackIn_213_1 = stackOut_211_1;
            stackIn_212_0 = stackOut_211_0;
            stackIn_212_1 = stackOut_211_1;
            if (param0 == null) {
              stackOut_213_0 = (RuntimeException) ((Object) stackIn_213_0);
              stackOut_213_1 = (StringBuilder) ((Object) stackIn_213_1);
              stackOut_213_2 = "null";
              stackIn_214_0 = stackOut_213_0;
              stackIn_214_1 = stackOut_213_1;
              stackIn_214_2 = stackOut_213_2;
              break L49;
            } else {
              stackOut_212_0 = (RuntimeException) ((Object) stackIn_212_0);
              stackOut_212_1 = (StringBuilder) ((Object) stackIn_212_1);
              stackOut_212_2 = "{...}";
              stackIn_214_0 = stackOut_212_0;
              stackIn_214_1 = stackOut_212_1;
              stackIn_214_2 = stackOut_212_2;
              break L49;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_214_0), stackIn_214_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
            return;
        }
        field_l = null;
    }

    vt(gj param0, ad param1) {
        super(param0, param1);
        int var3_int = 0;
        int var4 = 0;
        try {
            var3_int = qq.field_i.length;
            this.field_i = new kv[var3_int];
            for (var4 = 0; var4 < var3_int; var4++) {
                this.field_i[var4] = qq.field_i[var4].a();
            }
            this.field_j = new eaa();
            this.field_g = 192;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        int fieldTemp$4 = 0;
        boolean discarded$5 = false;
        int var3 = 0;
        b var4 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          fieldTemp$4 = this.field_g - 1;
          this.field_g = this.field_g - 1;
          if (-1 != (fieldTemp$4 & 31 ^ -1)) {
            break L0;
          } else {
            this.field_j.a(new b(), true);
            break L0;
          }
        }
        L1: {
          if (param0 < 0) {
            break L1;
          } else {
            field_l = (int[]) null;
            break L1;
          }
        }
        var4 = (b) ((Object) this.field_j.b((byte) 90));
        L2: while (true) {
          if (var4 == null) {
            L3: {
              L4: {
                if ((this.field_g ^ -1) < -1) {
                  break L4;
                } else {
                  if (!this.field_j.e(12917)) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L3;
            }
            return stackIn_12_0 != 0;
          } else {
            discarded$5 = var4.b(true);
            var4 = (b) ((Object) this.field_j.c(0));
            continue L2;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = BachelorFridge.field_y;
        if (param1 != 25415) {
            vt.b(-62);
        }
        b var4 = (b) ((Object) this.field_j.b((byte) 90));
        while (var4 != null) {
            this.field_i[var4.field_s].a(param2 - -(var4.field_i >> -702347133), -32 + ((var4.field_q >> 2124781507) + (var4.field_h >> 479943491)) + (param0 + -64), var4.field_o);
            var4 = (b) ((Object) this.field_j.c(0));
        }
    }

    static {
        field_l = new int[]{11, 8, 0, 1, 2, 3};
    }
}
