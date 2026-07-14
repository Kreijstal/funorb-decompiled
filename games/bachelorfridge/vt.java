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
        eaa var10 = null;
        int var10_int = 0;
        ema var11 = null;
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
        int var24_int = 0;
        String var24 = null;
        String var24_ref = null;
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        int var31 = 0;
        sga stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        sga stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        sga stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int stackIn_65_0 = 0;
        sna stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        sna stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        sna stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        sga stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        sga stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_47_4 = 0;
        sga stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        sna stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        sna stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        sna stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
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
                            if ((var11_int ^ -1) == -1) {
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
                          if ((var11_int ^ -1) >= (var7 ^ -1)) {
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
            stackOut_45_0 = (sga) param0;
            stackOut_45_1 = 4 + rg.field_h * 2;
            stackOut_45_2 = 2;
            stackOut_45_3 = (rg.field_h * 4 - -8) * param4;
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_47_2 = stackOut_45_2;
            stackIn_47_3 = stackOut_45_3;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            stackIn_46_2 = stackOut_45_2;
            stackIn_46_3 = stackOut_45_3;
            if (bga.field_m != param0) {
              stackOut_47_0 = (sga) (Object) stackIn_47_0;
              stackOut_47_1 = stackIn_47_1;
              stackOut_47_2 = stackIn_47_2;
              stackOut_47_3 = stackIn_47_3;
              stackOut_47_4 = 0;
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              stackIn_48_3 = stackOut_47_3;
              stackIn_48_4 = stackOut_47_4;
              break L10;
            } else {
              stackOut_46_0 = (sga) (Object) stackIn_46_0;
              stackOut_46_1 = stackIn_46_1;
              stackOut_46_2 = stackIn_46_2;
              stackOut_46_3 = stackIn_46_3;
              stackOut_46_4 = 1;
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              stackIn_48_3 = stackOut_46_3;
              stackIn_48_4 = stackOut_46_4;
              break L10;
            }
          }
          var9 = ((sga) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4 != 0, param3, true) ? 1 : 0;
          break L0;
        }
        var10 = param0.field_vb.field_z;
        var11 = null;
        var12 = (ema) (Object) var10.b((byte) 90);
        L11: while (true) {
          L12: {
            L13: {
              if (var12 == null) {
                break L13;
              } else {
                var13 = 0;
                if (var31 != 0) {
                  break L12;
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
                      var12.a(param2 ^ -1, var12.field_vb);
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
                      stackOut_64_0 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      break L17;
                    } else {
                      stackOut_63_0 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      var22 = stackIn_65_0;
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
                    if (-1 > (var12.field_Kb ^ -1)) {
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
                          if ((var12.field_Jb ^ -1) > (var6 ^ -1)) {
                            break L22;
                          } else {
                            if ((var7 ^ -1) < (var12.field_Gb ^ -1)) {
                              break L22;
                            } else {
                              if (0 >= (var8 & (var12.field_xb ^ -1))) {
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
                        stackOut_112_0 = var12.field_Ib;
                        stackOut_112_1 = rg.field_h;
                        stackOut_112_2 = param2 + 31407;
                        stackOut_112_3 = var12.field_sb;
                        stackIn_114_0 = stackOut_112_0;
                        stackIn_114_1 = stackOut_112_1;
                        stackIn_114_2 = stackOut_112_2;
                        stackIn_114_3 = stackOut_112_3;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        stackIn_113_2 = stackOut_112_2;
                        stackIn_113_3 = stackOut_112_3;
                        if (!eaa.field_c) {
                          stackOut_114_0 = (sna) (Object) stackIn_114_0;
                          stackOut_114_1 = stackIn_114_1;
                          stackOut_114_2 = stackIn_114_2;
                          stackOut_114_3 = stackIn_114_3;
                          stackOut_114_4 = 0;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          stackIn_115_2 = stackOut_114_2;
                          stackIn_115_3 = stackOut_114_3;
                          stackIn_115_4 = stackOut_114_4;
                          break L32;
                        } else {
                          stackOut_113_0 = (sna) (Object) stackIn_113_0;
                          stackOut_113_1 = stackIn_113_1;
                          stackOut_113_2 = stackIn_113_2;
                          stackOut_113_3 = stackIn_113_3;
                          stackOut_113_4 = 42;
                          stackIn_115_0 = stackOut_113_0;
                          stackIn_115_1 = stackOut_113_1;
                          stackIn_115_2 = stackOut_113_2;
                          stackIn_115_3 = stackOut_113_3;
                          stackIn_115_4 = stackOut_113_4;
                          break L32;
                        }
                      }
                      L33: {
                        L34: {
                          L35: {
                            ((sna) (Object) stackIn_115_0).a(stackIn_115_1, stackIn_115_2, stackIn_115_3 + -stackIn_115_4 - var25_int, var25_int, var19);
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
                      param0.field_vb.a(false, (sna) (Object) var12, (sna) (Object) var11, 2);
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
                    var11 = var12;
                    if (!var12.field_E) {
                      break L42;
                    } else {
                      if (var12.f((byte) 21)) {
                        break L42;
                      } else {
                        L43: {
                          var24 = null;
                          if ((ge.field_F ^ -1L) != (var12.field_Eb ^ -1L)) {
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
                            if ((var7 ^ -1) < (var12.field_Gb ^ -1)) {
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
                                if (0 == (var8 & (var12.field_xb ^ -1))) {
                                  break L43;
                                } else {
                                  L46: {
                                    var25_int = ho.a(91, (var12.field_xb ^ -1) & var8);
                                    var24 = lga.a(true, new String[1], bh.field_s);
                                    if (0 >= var25_int) {
                                      break L46;
                                    } else {
                                      if (null == ffa.field_j) {
                                        break L46;
                                      } else {
                                        if ((var25_int ^ -1) < (ffa.field_j.length ^ -1)) {
                                          break L46;
                                        } else {
                                          if (null == ffa.field_j[var25_int + -1]) {
                                            break L46;
                                          } else {
                                            var24 = lga.a(true, new String[1], ffa.field_j[var25_int + -1][2]);
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                }
                              } else {
                                var24 = lga.a(true, new String[2], bw.field_d);
                                break L43;
                              }
                            }
                          } else {
                            L47: {
                              if (var5_int == 0) {
                                break L47;
                              } else {
                                if (!var12.field_zb) {
                                  var24 = fla.field_p;
                                  break L43;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            if (var7 <= var12.field_Gb) {
                              if ((var12.field_Jb ^ -1) > (var6 ^ -1)) {
                                var24 = lga.a(true, new String[2], pda.field_q);
                                break L43;
                              } else {
                                if (-1 == ((var12.field_xb ^ -1) & var8 ^ -1)) {
                                  break L43;
                                } else {
                                  L48: {
                                    var25_int = ho.a(86, (var12.field_xb ^ -1) & var8);
                                    var24 = gl.field_f;
                                    if ((var25_int ^ -1) >= -1) {
                                      break L48;
                                    } else {
                                      if (ffa.field_j == null) {
                                        break L48;
                                      } else {
                                        if ((ffa.field_j.length ^ -1) > (var25_int ^ -1)) {
                                          break L48;
                                        } else {
                                          if (ffa.field_j[-1 + var25_int] == null) {
                                            break L48;
                                          } else {
                                            var24_ref = ffa.field_j[var25_int - 1][1];
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                }
                              }
                            } else {
                              L49: {
                                var25_int = -var12.field_Gb + var7;
                                if (-2 == (var25_int ^ -1)) {
                                  var24 = bk.field_w;
                                  break L49;
                                } else {
                                  break L49;
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
                          var25 = null;
                          var26 = 0;
                          var27_int = 0;
                          L50: while (true) {
                            L51: {
                              L52: {
                                L53: {
                                  if (var27_int >= ld.field_q) {
                                    break L53;
                                  } else {
                                    var28 = 255 & pw.field_w.field_Eb[var27_int];
                                    var29 = 0;
                                    if (var31 != 0) {
                                      break L52;
                                    } else {
                                      L54: {
                                        if (hr.field_b == null) {
                                          break L54;
                                        } else {
                                          if (null != hr.field_b[var27_int]) {
                                            if (!hr.field_b[var27_int][var28]) {
                                              break L54;
                                            } else {
                                              if (!var12.field_zb) {
                                                var29 = 1;
                                                break L54;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                      L55: {
                                        if (null == re.field_F) {
                                          break L55;
                                        } else {
                                          if (null != re.field_F[var27_int]) {
                                            L56: {
                                              var30_int = re.field_F[var27_int][var28];
                                              if (-1 == (var30_int ^ -1)) {
                                                break L56;
                                              } else {
                                                if (bha.field_l) {
                                                  break L56;
                                                } else {
                                                  if (var12.field_zb) {
                                                    break L56;
                                                  } else {
                                                    var29 = 1;
                                                    break L56;
                                                  }
                                                }
                                              }
                                            }
                                            if ((var12.field_Jb ^ -1) > (var30_int ^ -1)) {
                                              var29 = 1;
                                              break L55;
                                            } else {
                                              break L55;
                                            }
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                      L57: {
                                        if (gma.field_c == null) {
                                          break L57;
                                        } else {
                                          if (null != gma.field_c[var27_int]) {
                                            L58: {
                                              var30_int = gma.field_c[var27_int][var28];
                                              if (var30_int == 0) {
                                                break L58;
                                              } else {
                                                if (bha.field_l) {
                                                  break L58;
                                                } else {
                                                  if (!var12.field_zb) {
                                                    var29 = 1;
                                                    break L58;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                            }
                                            if ((var30_int ^ -1) >= (var12.field_Gb ^ -1)) {
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
                                      L59: {
                                        if (null == wda.field_c) {
                                          break L59;
                                        } else {
                                          if (null != wda.field_c[var27_int]) {
                                            if (-1 == ((var12.field_xb ^ -1) & wda.field_c[var27_int][var28] ^ -1)) {
                                              break L59;
                                            } else {
                                              var29 = 1;
                                              break L59;
                                            }
                                          } else {
                                            break L59;
                                          }
                                        }
                                      }
                                      L60: {
                                        if (var29 != 0) {
                                          L61: {
                                            var30 = "<col=A00000>" + kka.field_k[var27_int] + "</col>";
                                            if (var25 == null) {
                                              break L61;
                                            } else {
                                              var25 = var25 + ", " + var30;
                                              var26 = 1;
                                              if (var31 == 0) {
                                                break L60;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          var25 = var30;
                                          break L60;
                                        } else {
                                          break L60;
                                        }
                                      }
                                      var27_int++;
                                      if (var31 == 0) {
                                        continue L50;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                                if (ak.field_q != param0) {
                                  break L52;
                                } else {
                                  if (!ps.d(param2 + -124)) {
                                    break L52;
                                  } else {
                                    L62: {
                                      if (var26 != 0) {
                                        break L62;
                                      } else {
                                        var24 = var24 + "<br>" + lga.a(true, new String[1], cb.field_n);
                                        if (var31 == 0) {
                                          break L51;
                                        } else {
                                          break L62;
                                        }
                                      }
                                    }
                                    var24 = var24 + "<br>" + qn.field_h + var25;
                                    if (var31 == 0) {
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              L63: {
                                if (var26 == 0) {
                                  break L63;
                                } else {
                                  var24 = var24 + "<br>" + ra.field_l + var25;
                                  if (var31 == 0) {
                                    break L51;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var24 = var24 + "<br>" + lga.a(true, new String[1], jn.field_a);
                              break L51;
                            }
                            L64: {
                              if (ak.field_q != param0) {
                                break L64;
                              } else {
                                if (ps.d(-121)) {
                                  break L64;
                                } else {
                                  var27 = pw.field_w.field_Jb;
                                  var24 = var24 + "<br>" + lga.a(true, new String[1], ef.field_m);
                                  break L64;
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
                    continue L11;
                  } else {
                    break L13;
                  }
                }
              }
            }
            break L12;
          }
          return;
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_l = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vt.A(" + param0 + 41);
        }
    }

    vt(gj param0, ad param1) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = qq.field_i.length;
                        ((vt) this).field_i = new kv[var3_int];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) <= (var3_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((vt) this).field_i[var4] = qq.field_i[var4].a();
                        var4++;
                        if (var5 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((vt) this).field_j = new eaa();
                        ((vt) this).field_g = 192;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) runtimeException;
                        stackOut_10_1 = new StringBuilder().append("vt.<init>(");
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param0 == null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param1 == null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_18_2 = stackOut_15_2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                    stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                    stackOut_17_2 = "null";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw pe.a((Throwable) (Object) stackIn_18_0, (String) (Object) (stackIn_18_2 + 41));
                }
                case 19: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0) {
        b var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((vt) this).field_g = ((vt) this).field_g - 1;
                        if (-1 != (((vt) this).field_g - 1 & 31 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((vt) this).field_j.a((bw) (Object) new b(), true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 < 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_l = null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2 = (b) (Object) ((vt) this).field_j.b((byte) 90);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2 == null) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        boolean discarded$2 = var2.b(true);
                        var2 = (b) (Object) ((vt) this).field_j.c(0);
                        stackOut_11_0 = var3;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var3 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((((vt) this).field_g ^ -1) < -1) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!((vt) this).field_j.e(12917)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2_ref, "vt.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        b var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 25415) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vt.b(-62);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = (b) (Object) ((vt) this).field_j.b((byte) 90);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == null) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((vt) this).field_i[var4.field_s].a(param2 - -(var4.field_i >> -702347133), -32 + ((var4.field_q >> 2124781507) + (var4.field_h >> 479943491)) + (param0 + -64), var4.field_o);
                        var4 = (b) (Object) ((vt) this).field_j.c(0);
                        stackOut_7_0 = var5;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var4_ref, "vt.C(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{11, 8, 0, 1, 2, 3};
    }
}
