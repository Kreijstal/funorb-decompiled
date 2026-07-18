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
        sga stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        sga stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        sga stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_37_0 = 0;
        int stackIn_50_0 = 0;
        sna stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        sna stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        sna stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_89_4 = 0;
        sga stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        sga stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        sga stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        sna stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        sna stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        sna stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_87_4 = 0;
        L0: {
          var31 = BachelorFridge.field_y;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (pw.field_w == null) {
            break L0;
          } else {
            L1: {
              if (null != hr.field_b) {
                break L1;
              } else {
                if (null != re.field_F) {
                  break L1;
                } else {
                  if (null != gma.field_c) {
                    break L1;
                  } else {
                    if (null != wda.field_c) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (var9 >= ld.field_q) {
                break L0;
              } else {
                L3: {
                  var10_int = pw.field_w.field_Eb[var9] & 255;
                  if (hr.field_b == null) {
                    break L3;
                  } else {
                    if (hr.field_b[var9] != null) {
                      if (!hr.field_b[var9][var10_int]) {
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
                  if (re.field_F == null) {
                    break L4;
                  } else {
                    if (null == re.field_F[var9]) {
                      break L4;
                    } else {
                      L5: {
                        var11_int = re.field_F[var9][var10_int];
                        if (var11_int > var6) {
                          var6 = var11_int;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (var11_int == 0) {
                        break L4;
                      } else {
                        if (!bha.field_l) {
                          var5_int = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (null == gma.field_c) {
                    break L6;
                  } else {
                    if (gma.field_c[var9] == null) {
                      break L6;
                    } else {
                      L7: {
                        var11_int = gma.field_c[var9][var10_int];
                        if (var11_int == 0) {
                          break L7;
                        } else {
                          if (bha.field_l) {
                            break L7;
                          } else {
                            var5_int = 1;
                            break L7;
                          }
                        }
                      }
                      if (var11_int <= var7) {
                        break L6;
                      } else {
                        var7 = var11_int;
                        break L6;
                      }
                    }
                  }
                }
                L8: {
                  if (wda.field_c == null) {
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L9: {
          stackOut_31_0 = (sga) param0;
          stackOut_31_1 = 4 + rg.field_h * 2;
          stackOut_31_2 = 2;
          stackOut_31_3 = (rg.field_h * 4 - -8) * param4;
          stackIn_33_0 = stackOut_31_0;
          stackIn_33_1 = stackOut_31_1;
          stackIn_33_2 = stackOut_31_2;
          stackIn_33_3 = stackOut_31_3;
          stackIn_32_0 = stackOut_31_0;
          stackIn_32_1 = stackOut_31_1;
          stackIn_32_2 = stackOut_31_2;
          stackIn_32_3 = stackOut_31_3;
          if (bga.field_m != param0) {
            stackOut_33_0 = (sga) (Object) stackIn_33_0;
            stackOut_33_1 = stackIn_33_1;
            stackOut_33_2 = stackIn_33_2;
            stackOut_33_3 = stackIn_33_3;
            stackOut_33_4 = 0;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            stackIn_34_2 = stackOut_33_2;
            stackIn_34_3 = stackOut_33_3;
            stackIn_34_4 = stackOut_33_4;
            break L9;
          } else {
            stackOut_32_0 = (sga) (Object) stackIn_32_0;
            stackOut_32_1 = stackIn_32_1;
            stackOut_32_2 = stackIn_32_2;
            stackOut_32_3 = stackIn_32_3;
            stackOut_32_4 = 1;
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_34_2 = stackOut_32_2;
            stackIn_34_3 = stackOut_32_3;
            stackIn_34_4 = stackOut_32_4;
            break L9;
          }
        }
        L10: {
          if (((sga) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4 == 0, param3, true)) {
            stackOut_36_0 = 0;
            stackIn_37_0 = stackOut_36_0;
            break L10;
          } else {
            stackOut_35_0 = 1;
            stackIn_37_0 = stackOut_35_0;
            break L10;
          }
        }
        var9 = stackIn_37_0;
        var10 = param0.field_vb.field_z;
        var11 = null;
        var12 = (ema) (Object) var10.b((byte) 90);
        L11: while (true) {
          if (var12 == null) {
            return;
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
                var12.a(-1, var12.field_vb);
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
              var20 = var12.field_Nb;
              var21 = 72;
              if (param0 == qba.field_m) {
                var21 += 42;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var20 = po.a(var12.field_Ib.field_jb, var20, var21);
              if (var20.equals((Object) (Object) var12.field_Nb)) {
                stackOut_49_0 = 0;
                stackIn_50_0 = stackOut_49_0;
                break L15;
              } else {
                stackOut_48_0 = 1;
                stackIn_50_0 = stackOut_48_0;
                break L15;
              }
            }
            L16: {
              var22 = stackIn_50_0;
              if (4 > var12.field_Kb) {
                if (var12.field_Kb > 0) {
                  var20 = "<img=" + (var12.field_Kb - 1) + ">" + var20;
                  break L16;
                } else {
                  break L16;
                }
              } else {
                var20 = "<img=" + (re.field_E + -4 + var12.field_Kb) + ">" + var20;
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
                        if (0 >= (var8 & ~var12.field_xb)) {
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
                        var12.field_Ib.field_Z = lga.a(true, new String[1], ql.field_p);
                        var12.field_Fb.field_Z = mc.field_i;
                        var12.field_Db.field_Z = im.field_b;
                        break L21;
                      }
                    } else {
                      var12.field_Ib.field_Z = lga.a(true, new String[1], vla.field_t);
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
                  stackOut_86_0 = var12.field_Ib;
                  stackOut_86_1 = rg.field_h;
                  stackOut_86_2 = 31407;
                  stackOut_86_3 = var12.field_sb;
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_88_1 = stackOut_86_1;
                  stackIn_88_2 = stackOut_86_2;
                  stackIn_88_3 = stackOut_86_3;
                  stackIn_87_0 = stackOut_86_0;
                  stackIn_87_1 = stackOut_86_1;
                  stackIn_87_2 = stackOut_86_2;
                  stackIn_87_3 = stackOut_86_3;
                  if (!eaa.field_c) {
                    stackOut_88_0 = (sna) (Object) stackIn_88_0;
                    stackOut_88_1 = stackIn_88_1;
                    stackOut_88_2 = stackIn_88_2;
                    stackOut_88_3 = stackIn_88_3;
                    stackOut_88_4 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    stackIn_89_3 = stackOut_88_3;
                    stackIn_89_4 = stackOut_88_4;
                    break L25;
                  } else {
                    stackOut_87_0 = (sna) (Object) stackIn_87_0;
                    stackOut_87_1 = stackIn_87_1;
                    stackOut_87_2 = stackIn_87_2;
                    stackOut_87_3 = stackIn_87_3;
                    stackOut_87_4 = 42;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    stackIn_89_2 = stackOut_87_2;
                    stackIn_89_3 = stackOut_87_3;
                    stackIn_89_4 = stackOut_87_4;
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    ((sna) (Object) stackIn_89_0).a(stackIn_89_1, stackIn_89_2, stackIn_89_3 + -stackIn_89_4 - var25_int, var25_int, var19);
                    var12.field_Bb.field_Z = Integer.toString(var12.field_Jb);
                    var12.field_Bb.a(rg.field_h, 31407, 40, -40 + var12.field_sb, var19);
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
              int discarded$1 = -1;
              var23 = vaa.a(var20, var12.field_yb);
              var24 = var23;
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
                param0.field_vb.a(false, (sna) (Object) var12, (sna) var11, 2);
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
                      od.a(var12.field_Eb, 11, 2);
                      break L31;
                    } else {
                      rda.a((byte) -104, 0, 0, param0, jc.field_r, var12, nfa.field_a);
                      break L31;
                    }
                  } else {
                    bia.a((byte) 90, var12.field_Eb, 11);
                    break L31;
                  }
                }
              }
            }
            L32: {
              var11 = (Object) (Object) var12;
              if (!var12.field_E) {
                break L32;
              } else {
                if (var12.f((byte) 21)) {
                  break L32;
                } else {
                  L33: {
                    var24 = null;
                    if (~ge.field_F != ~var12.field_Eb) {
                      L34: {
                        if (var5_int == 0) {
                          break L34;
                        } else {
                          if (!var12.field_zb) {
                            var24 = lga.a(true, new String[1], in.field_d);
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
                            var24 = lga.a(true, new String[1], sna.field_C);
                            break L35;
                          }
                        }
                        var24 = lga.a(true, new String[2], pi.field_h);
                        break L33;
                      } else {
                        if (var6 <= var12.field_Jb) {
                          if (0 == (var8 & ~var12.field_xb)) {
                            break L33;
                          } else {
                            var25_int = ho.a(91, ~var12.field_xb & var8);
                            var24 = lga.a(true, new String[1], bh.field_s);
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
                                    var24 = lga.a(true, new String[1], ffa.field_j[var25_int + -1][2]);
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var24 = lga.a(true, new String[2], bw.field_d);
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
                          var24 = lga.a(true, new String[2], pda.field_q);
                          break L33;
                        } else {
                          if (-1 == (var12.field_xb & var8)) {
                            break L33;
                          } else {
                            var25_int = ho.a(86, ~var12.field_xb & var8);
                            var24 = gl.field_f;
                            if (var25_int <= 0) {
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
                          if (var25_int == 1) {
                            var24 = bk.field_w;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        var24 = lga.a(true, new String[2], rj.field_o);
                        break L33;
                      }
                    }
                  }
                  if (var24 == null) {
                    break L32;
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
                    L38: while (true) {
                      if (var27_int >= ld.field_q) {
                        L39: {
                          L40: {
                            if (ak.field_q != param0) {
                              break L40;
                            } else {
                              if (!ps.d(-124)) {
                                break L40;
                              } else {
                                if (var26 != 0) {
                                  var24 = var24 + "<br>" + qn.field_h + var25;
                                  break L39;
                                } else {
                                  var24 = var24 + "<br>" + lga.a(true, new String[1], cb.field_n);
                                  break L39;
                                }
                              }
                            }
                          }
                          if (var26 == 0) {
                            var24 = var24 + "<br>" + lga.a(true, new String[1], jn.field_a);
                            break L39;
                          } else {
                            var24 = var24 + "<br>" + ra.field_l + var25;
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
                              var24 = var24 + "<br>" + lga.a(true, new String[1], ef.field_m);
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
                                if (var30_int == 0) {
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
                              if (-1 == (var12.field_xb & wda.field_c[var27_int][var28])) {
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
            var12 = (ema) (Object) var10.c(0);
            continue L11;
          }
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
            ((vt) this).field_i = new kv[var3_int];
            for (var4 = 0; var4 < var3_int; var4++) {
                ((vt) this).field_i[var4] = qq.field_i[var4].a();
            }
            ((vt) this).field_j = new eaa();
            ((vt) this).field_g = 192;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        b var4 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
          if (var4 == null) {
            L3: {
              L4: {
                if (((vt) this).field_g > 0) {
                  break L4;
                } else {
                  if (!((vt) this).field_j.e(12917)) {
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
            boolean discarded$5 = var4.b(true);
            var4 = (b) (Object) ((vt) this).field_j.c(0);
            continue L2;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = BachelorFridge.field_y;
        if (param1 != 25415) {
            vt.b(-62);
        }
        b var4 = (b) (Object) ((vt) this).field_j.b((byte) 90);
        while (var4 != null) {
            ((vt) this).field_i[var4.field_s].a(param2 - -(var4.field_i >> 3), -32 + ((var4.field_q >> 3) + (var4.field_h >> 3)) + (param0 + -64), var4.field_o);
            var4 = (b) (Object) ((vt) this).field_j.c(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{11, 8, 0, 1, 2, 3};
    }
}
