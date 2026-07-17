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
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        sga stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        sga stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        sga stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_40_0 = 0;
        int stackIn_55_0 = 0;
        sna stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        sna stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        sna stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        sga stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        sga stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        sga stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        sna stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        sna stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        sna stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        L0: {
          L1: {
            var31 = BachelorFridge.field_y;
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
                  var10_int = pw.field_w.field_Eb[var9] & 255;
                  if (var31 != 0) {
                    break L0;
                  } else {
                    L4: {
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
                          if (var11_int == 0) {
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
                    L9: {
                      if (wda.field_c == null) {
                        break L9;
                      } else {
                        if (null == wda.field_c[var9]) {
                          break L9;
                        } else {
                          var8 = var8 | wda.field_c[var9][var10_int];
                          break L9;
                        }
                      }
                    }
                    var9++;
                    if (var31 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L10: {
            stackOut_34_0 = (sga) param0;
            stackOut_34_1 = 4 + rg.field_h * 2;
            stackOut_34_2 = 2;
            stackOut_34_3 = (rg.field_h * 4 - -8) * param4;
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_36_2 = stackOut_34_2;
            stackIn_36_3 = stackOut_34_3;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            stackIn_35_2 = stackOut_34_2;
            stackIn_35_3 = stackOut_34_3;
            if (bga.field_m != param0) {
              stackOut_36_0 = (sga) (Object) stackIn_36_0;
              stackOut_36_1 = stackIn_36_1;
              stackOut_36_2 = stackIn_36_2;
              stackOut_36_3 = stackIn_36_3;
              stackOut_36_4 = 0;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              stackIn_37_3 = stackOut_36_3;
              stackIn_37_4 = stackOut_36_4;
              break L10;
            } else {
              stackOut_35_0 = (sga) (Object) stackIn_35_0;
              stackOut_35_1 = stackIn_35_1;
              stackOut_35_2 = stackIn_35_2;
              stackOut_35_3 = stackIn_35_3;
              stackOut_35_4 = 1;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              stackIn_37_3 = stackOut_35_3;
              stackIn_37_4 = stackOut_35_4;
              break L10;
            }
          }
          L11: {
            if (((sga) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4 == 0, param3, true)) {
              stackOut_39_0 = 0;
              stackIn_40_0 = stackOut_39_0;
              break L11;
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              break L11;
            }
          }
          var9 = stackIn_40_0;
          break L0;
        }
        var10 = param0.field_vb.field_z;
        var11 = null;
        var12 = (ema) (Object) var10.b((byte) 90);
        L12: while (true) {
          L13: {
            if (var12 == null) {
              break L13;
            } else {
              var13 = 0;
              if (var31 != 0) {
                break L13;
              } else {
                L14: {
                  if (var12.field_z != null) {
                    break L14;
                  } else {
                    L15: {
                      var12.field_Ib = new sna(0L, gi.field_c);
                      var12.a(-1, var12.field_Ib);
                      var12.field_Bb = new sna(0L, wv.field_l);
                      if (eaa.field_c) {
                        var12.a(-1, var12.field_Bb);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var12.field_Bb.field_N = 2;
                    var12.field_vb = new sna(0L, qs.field_m);
                    var12.a(~param2, var12.field_vb);
                    var12.d((byte) 118);
                    var12.field_Fb = new sna(0L, mh.field_k);
                    var12.a(-1, var12.field_Fb);
                    var12.field_Db = new sna(0L, tca.field_c);
                    var13 = 1;
                    var12.a(-1, var12.field_Db);
                    break L14;
                  }
                }
                L16: {
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
                  var20 = var12.field_Nb;
                  var21 = 72;
                  if (param0 == qba.field_m) {
                    var21 += 42;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  var20 = po.a(var12.field_Ib.field_jb, var20, var21);
                  if (var20.equals((Object) (Object) var12.field_Nb)) {
                    stackOut_54_0 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    break L17;
                  } else {
                    stackOut_53_0 = 1;
                    stackIn_55_0 = stackOut_53_0;
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    var22 = stackIn_55_0;
                    if (4 > var12.field_Kb) {
                      break L19;
                    } else {
                      var20 = "<img=" + (re.field_E + -4 + var12.field_Kb) + ">" + var20;
                      if (var31 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (var12.field_Kb > 0) {
                    var20 = "<img=" + (var12.field_Kb - 1) + ">" + var20;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L20: {
                  var12.field_Ib.field_Z = var20;
                  if (var12.f((byte) 21)) {
                    break L20;
                  } else {
                    L21: {
                      L22: {
                        L23: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L23;
                          } else {
                            if (!var12.field_zb) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        if (var12.field_Jb < var6) {
                          break L22;
                        } else {
                          if (var7 > var12.field_Gb) {
                            break L22;
                          } else {
                            if (0 >= (var8 & ~var12.field_xb)) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      var23_int = 8414771;
                      var24_int = 8421504;
                      break L21;
                    }
                    L24: {
                      L25: {
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
                          break L25;
                        } else {
                          L26: {
                            if (!var12.field_wb) {
                              break L26;
                            } else {
                              var12.field_Ib.field_Z = lga.a(true, new String[1], vla.field_t);
                              var12.field_Db.field_Z = bga.field_f;
                              if (var31 == 0) {
                                break L24;
                              } else {
                                break L26;
                              }
                            }
                          }
                          L27: {
                            if (!var12.field_Ob) {
                              break L27;
                            } else {
                              var12.field_Ib.field_Z = lga.a(true, new String[1], ql.field_p);
                              var12.field_Fb.field_Z = mc.field_i;
                              var12.field_Db.field_Z = im.field_b;
                              if (var31 == 0) {
                                break L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                          var12.field_Fb.field_Z = go.field_r;
                          if (var31 == 0) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      if (!pw.field_w.field_Zb) {
                        var12.field_Db.field_Z = ui.field_p;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L28: {
                      var25_int = 0;
                      if (null == pw.field_w) {
                        break L28;
                      } else {
                        if (!ps.d(-118)) {
                          break L28;
                        } else {
                          if (ge.field_F != var12.field_Eb) {
                            L29: {
                              if (var12.field_Fb.field_Z != null) {
                                var26 = var12.field_Fb.e(-1) - -(gba.field_Bb * 2);
                                var12.field_Fb.a(rg.field_h, 31407, var26, var25_int, var19);
                                var25_int = var25_int + var26;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            if (null != var12.field_Db.field_Z) {
                              L30: {
                                L31: {
                                  if (ak.field_q == param0) {
                                    break L31;
                                  } else {
                                    var26 = var12.field_Db.e(-1) - -(gba.field_Bb * 2);
                                    if (var31 == 0) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                var26 = 40;
                                break L30;
                              }
                              var12.field_Db.a(rg.field_h, 31407, var26, var25_int, var19);
                              var25_int = var25_int + var26;
                              break L28;
                            } else {
                              break L28;
                            }
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    L32: {
                      stackOut_94_0 = var12.field_Ib;
                      stackOut_94_1 = rg.field_h;
                      stackOut_94_2 = param2 + 31407;
                      stackOut_94_3 = var12.field_sb;
                      stackIn_96_0 = stackOut_94_0;
                      stackIn_96_1 = stackOut_94_1;
                      stackIn_96_2 = stackOut_94_2;
                      stackIn_96_3 = stackOut_94_3;
                      stackIn_95_0 = stackOut_94_0;
                      stackIn_95_1 = stackOut_94_1;
                      stackIn_95_2 = stackOut_94_2;
                      stackIn_95_3 = stackOut_94_3;
                      if (!eaa.field_c) {
                        stackOut_96_0 = (sna) (Object) stackIn_96_0;
                        stackOut_96_1 = stackIn_96_1;
                        stackOut_96_2 = stackIn_96_2;
                        stackOut_96_3 = stackIn_96_3;
                        stackOut_96_4 = 0;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        stackIn_97_2 = stackOut_96_2;
                        stackIn_97_3 = stackOut_96_3;
                        stackIn_97_4 = stackOut_96_4;
                        break L32;
                      } else {
                        stackOut_95_0 = (sna) (Object) stackIn_95_0;
                        stackOut_95_1 = stackIn_95_1;
                        stackOut_95_2 = stackIn_95_2;
                        stackOut_95_3 = stackIn_95_3;
                        stackOut_95_4 = 42;
                        stackIn_97_0 = stackOut_95_0;
                        stackIn_97_1 = stackOut_95_1;
                        stackIn_97_2 = stackOut_95_2;
                        stackIn_97_3 = stackOut_95_3;
                        stackIn_97_4 = stackOut_95_4;
                        break L32;
                      }
                    }
                    L33: {
                      L34: {
                        L35: {
                          ((sna) (Object) stackIn_97_0).a(stackIn_97_1, stackIn_97_2, stackIn_97_3 + -stackIn_97_4 - var25_int, var25_int, var19);
                          var12.field_Bb.field_Z = Integer.toString(var12.field_Jb);
                          var12.field_Bb.a(rg.field_h, param2 + 31407, 40, -40 + var12.field_sb, var19);
                          if (!var12.field_Ib.field_T) {
                            break L35;
                          } else {
                            if (var22 != 0) {
                              break L34;
                            } else {
                              break L35;
                            }
                          }
                        }
                        if (!var12.field_Ib.field_T) {
                          break L33;
                        } else {
                          if (nt.field_y == null) {
                            break L33;
                          } else {
                            if (nt.field_y[var12.field_Kb] != null) {
                              jja.field_m = nt.field_y[var12.field_Kb];
                              if (var31 == 0) {
                                break L33;
                              } else {
                                break L34;
                              }
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      jja.field_m = var12.field_Nb;
                      if (null == nt.field_y) {
                        break L33;
                      } else {
                        if (null != nt.field_y[var12.field_Kb]) {
                          jja.field_m = jja.field_m + " - " + nt.field_y[var12.field_Kb];
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                    var19 = var19 + rg.field_h;
                    break L20;
                  }
                }
                L36: {
                  var23 = vaa.a(var20, var12.field_yb, -1);
                  var24 = var23;
                  var24 = var23;
                  if (var23 != null) {
                    var24_int = var12.field_vb.field_jb.b(var23, -gba.field_Bb + -gba.field_Bb + var12.field_sb);
                    var12.field_vb.field_Z = var23;
                    var12.field_vb.field_cb = 256 * var12.field_Mb / kla.field_x;
                    var12.field_vb.a(rg.field_h * var24_int, 31407, -(gba.field_Bb * 2) + var12.field_sb, gba.field_Bb, var19);
                    var19 = var19 + var24_int * rg.field_h;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (var9 != 0) {
                    break L37;
                  } else {
                    var12.field_hb = var19 + -var12.field_p;
                    break L37;
                  }
                }
                L38: {
                  if (var13 == 0) {
                    break L38;
                  } else {
                    param0.field_vb.a(false, (sna) (Object) var12, (sna) var11, 2);
                    break L38;
                  }
                }
                L39: {
                  if (var12.field_R == 0) {
                    break L39;
                  } else {
                    if (var12.f((byte) 21)) {
                      break L39;
                    } else {
                      L40: {
                        if (var12.field_Fb.field_R == 0) {
                          break L40;
                        } else {
                          bia.a((byte) 90, var12.field_Eb, param1);
                          if (var31 == 0) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      L41: {
                        if (var12.field_Db.field_R != 0) {
                          break L41;
                        } else {
                          rda.a((byte) -104, 0, 0, param0, jc.field_r, var12, nfa.field_a);
                          if (var31 == 0) {
                            break L39;
                          } else {
                            break L41;
                          }
                        }
                      }
                      od.a(var12.field_Eb, param1, 2);
                      break L39;
                    }
                  }
                }
                L42: {
                  var11 = (Object) (Object) var12;
                  if (!var12.field_E) {
                    break L42;
                  } else {
                    if (var12.f((byte) 21)) {
                      break L42;
                    } else {
                      L43: {
                        var24 = null;
                        if (~ge.field_F != ~var12.field_Eb) {
                          L44: {
                            if (var5_int == 0) {
                              break L44;
                            } else {
                              if (!var12.field_zb) {
                                var24 = lga.a(true, new String[1], in.field_d);
                                break L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                          if (var7 > var12.field_Gb) {
                            L45: {
                              var25_int = var7 - var12.field_Gb;
                              if (var25_int != 1) {
                                break L45;
                              } else {
                                var24 = lga.a(true, new String[1], sna.field_C);
                                break L45;
                              }
                            }
                            var24 = lga.a(true, new String[2], pi.field_h);
                            break L43;
                          } else {
                            if (var6 <= var12.field_Jb) {
                              if (0 == (var8 & ~var12.field_xb)) {
                                break L43;
                              } else {
                                var25_int = ho.a(91, ~var12.field_xb & var8);
                                var24 = lga.a(true, new String[1], bh.field_s);
                                if (0 >= var25_int) {
                                  break L43;
                                } else {
                                  if (null == ffa.field_j) {
                                    break L43;
                                  } else {
                                    if (var25_int > ffa.field_j.length) {
                                      break L43;
                                    } else {
                                      if (null == ffa.field_j[var25_int + -1]) {
                                        break L43;
                                      } else {
                                        var24 = lga.a(true, new String[1], ffa.field_j[var25_int + -1][2]);
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = lga.a(true, new String[2], bw.field_d);
                              break L43;
                            }
                          }
                        } else {
                          L46: {
                            if (var5_int == 0) {
                              break L46;
                            } else {
                              if (!var12.field_zb) {
                                var24 = fla.field_p;
                                break L43;
                              } else {
                                break L46;
                              }
                            }
                          }
                          if (var7 <= var12.field_Gb) {
                            if (var12.field_Jb < var6) {
                              var24 = lga.a(true, new String[2], pda.field_q);
                              break L43;
                            } else {
                              if (-1 == (var12.field_xb & var8)) {
                                break L43;
                              } else {
                                var25_int = ho.a(86, ~var12.field_xb & var8);
                                var24 = gl.field_f;
                                if (var25_int <= 0) {
                                  break L43;
                                } else {
                                  if (ffa.field_j == null) {
                                    break L43;
                                  } else {
                                    if (ffa.field_j.length < var25_int) {
                                      break L43;
                                    } else {
                                      if (ffa.field_j[-1 + var25_int] == null) {
                                        break L43;
                                      } else {
                                        var24 = ffa.field_j[var25_int - 1][1];
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L47: {
                              var25_int = -var12.field_Gb + var7;
                              if (var25_int == 1) {
                                var24 = bk.field_w;
                                break L47;
                              } else {
                                break L47;
                              }
                            }
                            var24 = lga.a(true, new String[2], rj.field_o);
                            break L43;
                          }
                        }
                      }
                      if (var24 == null) {
                        break L42;
                      } else {
                        var24 = "<col=A00000>" + var24;
                        var30 = var24;
                        var25 = var30;
                        var24 = var25;
                        var30 = var24;
                        var25 = var30;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L48: while (true) {
                          L49: {
                            L50: {
                              L51: {
                                if (var27_int >= ld.field_q) {
                                  break L51;
                                } else {
                                  var28 = 255 & pw.field_w.field_Eb[var27_int];
                                  var29 = 0;
                                  if (var31 != 0) {
                                    break L50;
                                  } else {
                                    L52: {
                                      if (hr.field_b == null) {
                                        break L52;
                                      } else {
                                        if (null != hr.field_b[var27_int]) {
                                          if (!hr.field_b[var27_int][var28]) {
                                            break L52;
                                          } else {
                                            if (!var12.field_zb) {
                                              var29 = 1;
                                              break L52;
                                            } else {
                                              break L52;
                                            }
                                          }
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                    L53: {
                                      if (null == re.field_F) {
                                        break L53;
                                      } else {
                                        if (null != re.field_F[var27_int]) {
                                          L54: {
                                            var30_int = re.field_F[var27_int][var28];
                                            if (var30_int == 0) {
                                              break L54;
                                            } else {
                                              if (bha.field_l) {
                                                break L54;
                                              } else {
                                                if (var12.field_zb) {
                                                  break L54;
                                                } else {
                                                  var29 = 1;
                                                  break L54;
                                                }
                                              }
                                            }
                                          }
                                          if (var12.field_Jb < var30_int) {
                                            var29 = 1;
                                            break L53;
                                          } else {
                                            break L53;
                                          }
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    L55: {
                                      if (gma.field_c == null) {
                                        break L55;
                                      } else {
                                        if (null != gma.field_c[var27_int]) {
                                          L56: {
                                            var30_int = gma.field_c[var27_int][var28];
                                            if (var30_int == 0) {
                                              break L56;
                                            } else {
                                              if (bha.field_l) {
                                                break L56;
                                              } else {
                                                if (!var12.field_zb) {
                                                  var29 = 1;
                                                  break L56;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                          }
                                          if (var30_int <= var12.field_Gb) {
                                            break L55;
                                          } else {
                                            var29 = 1;
                                            break L55;
                                          }
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                    L57: {
                                      if (null == wda.field_c) {
                                        break L57;
                                      } else {
                                        if (null != wda.field_c[var27_int]) {
                                          if (-1 == (var12.field_xb & wda.field_c[var27_int][var28])) {
                                            break L57;
                                          } else {
                                            var29 = 1;
                                            break L57;
                                          }
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                    L58: {
                                      if (var29 != 0) {
                                        L59: {
                                          var30 = "<col=A00000>" + kka.field_k[var27_int] + "</col>";
                                          var25 = var30;
                                          var24 = var25;
                                          var25 = var30;
                                          if (var25 == null) {
                                            break L59;
                                          } else {
                                            var25 = var25 + ", " + var30;
                                            var26 = 1;
                                            if (var31 == 0) {
                                              break L58;
                                            } else {
                                              break L59;
                                            }
                                          }
                                        }
                                        var25 = var30;
                                        var24 = var25;
                                        var24 = var25;
                                        break L58;
                                      } else {
                                        break L58;
                                      }
                                    }
                                    var27_int++;
                                    if (var31 == 0) {
                                      continue L48;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                              }
                              if (ak.field_q != param0) {
                                break L50;
                              } else {
                                if (!ps.d(param2 + -124)) {
                                  break L50;
                                } else {
                                  L60: {
                                    if (var26 != 0) {
                                      break L60;
                                    } else {
                                      var24 = var24 + "<br>" + lga.a(true, new String[1], cb.field_n);
                                      if (var31 == 0) {
                                        break L49;
                                      } else {
                                        break L60;
                                      }
                                    }
                                  }
                                  var24 = var24 + "<br>" + qn.field_h + var25;
                                  if (var31 == 0) {
                                    break L49;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                            }
                            L61: {
                              if (var26 == 0) {
                                break L61;
                              } else {
                                var24 = var24 + "<br>" + ra.field_l + var25;
                                if (var31 == 0) {
                                  break L49;
                                } else {
                                  break L61;
                                }
                              }
                            }
                            var24 = var24 + "<br>" + lga.a(true, new String[1], jn.field_a);
                            break L49;
                          }
                          L62: {
                            if (ak.field_q != param0) {
                              break L62;
                            } else {
                              if (ps.d(-121)) {
                                break L62;
                              } else {
                                var27 = pw.field_w.field_Jb;
                                var24 = var24 + "<br>" + lga.a(true, new String[1], ef.field_m);
                                break L62;
                              }
                            }
                          }
                          jja.field_m = var24;
                          break L42;
                        }
                      }
                    }
                  }
                }
                var12 = (ema) (Object) var10.c(0);
                if (var31 == 0) {
                  continue L12;
                } else {
                  break L13;
                }
              }
            }
          }
          return;
        }
    }

    public static void b(int param0) {
        field_m = null;
    }

    vt(gj param0, ad param1) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = qq.field_i.length;
            ((vt) this).field_i = new kv[var3_int];
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var3_int) {
                  ((vt) this).field_j = new eaa();
                  ((vt) this).field_g = 192;
                  break L2;
                } else {
                  ((vt) this).field_i[var4] = qq.field_i[var4].a();
                  var4++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("vt.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        b var4 = null;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          int fieldTemp$4 = ((vt) this).field_g - 1;
          ((vt) this).field_g = ((vt) this).field_g - 1;
          if ((fieldTemp$4 & 31) != 0) {
            break L0;
          } else {
            ((vt) this).field_j.a((bw) (Object) new b(), true);
            break L0;
          }
        }
        L1: {
          if (param0 < 0) {
            break L1;
          } else {
            field_l = null;
            break L1;
          }
        }
        var4 = (b) (Object) ((vt) this).field_j.b((byte) 90);
        L2: while (true) {
          L3: {
            L4: {
              L5: {
                if (var4 == null) {
                  break L5;
                } else {
                  boolean discarded$5 = var4.b(true);
                  var4 = (b) (Object) ((vt) this).field_j.c(0);
                  if (var3 != 0) {
                    break L4;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (((vt) this).field_g > 0) {
                break L4;
              } else {
                if (!((vt) this).field_j.e(12917)) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L3;
          }
          return stackIn_14_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        b var4 = null;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param1 == 25415) {
            break L0;
          } else {
            vt.b(-62);
            break L0;
          }
        }
        var4 = (b) (Object) ((vt) this).field_j.b((byte) 90);
        L1: while (true) {
          L2: {
            if (var4 == null) {
              break L2;
            } else {
              ((vt) this).field_i[var4.field_s].a(param2 - -(var4.field_i >> 3), -32 + ((var4.field_q >> 3) + (var4.field_h >> 3)) + (param0 + -64), var4.field_o);
              var4 = (b) (Object) ((vt) this).field_j.c(0);
              if (var5 != 0) {
                break L2;
              } else {
                if (var5 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{11, 8, 0, 1, 2, 3};
    }
}
