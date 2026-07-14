/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends rqa {
    static eab field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        nc stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        si.a(85, 62, param0[0].a(90));
                        if (param1 < -119) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        bm.a(13, (byte) -15, (soa) null, true, 117);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = new nc((Object) (Object) "void");
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var3;
                        stackOut_7_1 = new StringBuilder().append("bm.A(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, soa param2, boolean param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ij var10 = null;
        int var10_int = 0;
        jk var11 = null;
        int var11_int = 0;
        jk var12 = null;
        int var13 = 0;
        llb var14 = null;
        llb var15 = null;
        llb var16 = null;
        llb var17 = null;
        llb var18 = null;
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
        soa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        soa stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        soa stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_66_0 = 0;
        llb stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        llb stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        llb stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        soa stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        soa stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        soa stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        llb stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        llb stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        llb stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        L0: {
          var31 = VoidHunters.field_G;
          var5_int = 0;
          var6 = 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var7 = 0;
            var8 = 0;
            if (null == lqa.field_o) {
              break L2;
            } else {
              L3: {
                if (qcb.field_o != null) {
                  break L3;
                } else {
                  if (null != crb.field_w) {
                    break L3;
                  } else {
                    if (null != tab.field_p) {
                      break L3;
                    } else {
                      if (hia.field_o == null) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L4: while (true) {
                if (var9 >= ocb.field_l) {
                  break L2;
                } else {
                  var10_int = lqa.field_o.field_Pb[var9] & 255;
                  if (var31 != 0) {
                    break L1;
                  } else {
                    L5: {
                      if (qcb.field_o == null) {
                        break L5;
                      } else {
                        if (qcb.field_o[var9] == null) {
                          break L5;
                        } else {
                          if (qcb.field_o[var9][var10_int]) {
                            var5_int = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (crb.field_w == null) {
                        break L6;
                      } else {
                        if (null == crb.field_w[var9]) {
                          break L6;
                        } else {
                          L7: {
                            var11_int = crb.field_w[var9][var10_int];
                            if (var11_int == 0) {
                              break L7;
                            } else {
                              if (!ufa.field_o) {
                                var5_int = 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if ((var11_int ^ -1) < (var6 ^ -1)) {
                            var6 = var11_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L8: {
                      if (tab.field_p == null) {
                        break L8;
                      } else {
                        if (null == tab.field_p[var9]) {
                          break L8;
                        } else {
                          L9: {
                            var11_int = tab.field_p[var9][var10_int];
                            if (var11_int == 0) {
                              break L9;
                            } else {
                              if (!ufa.field_o) {
                                var5_int = 1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if ((var7 ^ -1) <= (var11_int ^ -1)) {
                            break L8;
                          } else {
                            var7 = var11_int;
                            break L8;
                          }
                        }
                      }
                    }
                    L10: {
                      if (hia.field_o == null) {
                        break L10;
                      } else {
                        if (hia.field_o[var9] == null) {
                          break L10;
                        } else {
                          var8 = var8 | hia.field_o[var9][var10_int];
                          break L10;
                        }
                      }
                    }
                    var9++;
                    if (var31 == 0) {
                      continue L4;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          L11: {
            stackOut_48_0 = (soa) param2;
            stackOut_48_1 = 38;
            stackOut_48_2 = 2;
            stackOut_48_3 = (8 + nna.field_w * 4) * param0;
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_50_2 = stackOut_48_2;
            stackIn_50_3 = stackOut_48_3;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            stackIn_49_2 = stackOut_48_2;
            stackIn_49_3 = stackOut_48_3;
            if (param2 != qg.field_a) {
              stackOut_50_0 = (soa) (Object) stackIn_50_0;
              stackOut_50_1 = stackIn_50_1;
              stackOut_50_2 = stackIn_50_2;
              stackOut_50_3 = stackIn_50_3;
              stackOut_50_4 = 0;
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              stackIn_51_3 = stackOut_50_3;
              stackIn_51_4 = stackOut_50_4;
              break L11;
            } else {
              stackOut_49_0 = (soa) (Object) stackIn_49_0;
              stackOut_49_1 = stackIn_49_1;
              stackOut_49_2 = stackIn_49_2;
              stackOut_49_3 = stackIn_49_3;
              stackOut_49_4 = 1;
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              stackIn_51_3 = stackOut_49_3;
              stackIn_51_4 = stackOut_49_4;
              break L11;
            }
          }
          var9 = ((soa) (Object) stackIn_51_0).a((byte) stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4 != 0, param3, 2 * (2 + nna.field_w)) ? 1 : 0;
          break L1;
        }
        var10 = param2.field_wb.field_lb;
        var11 = null;
        var12 = (jk) (Object) var10.d(0);
        L12: while (true) {
          L13: {
            L14: {
              if (var12 == null) {
                break L14;
              } else {
                var13 = 0;
                if (var31 != 0) {
                  break L13;
                } else {
                  L15: {
                    if (null == var12.field_lb) {
                      L16: {
                        var12.field_Ib = new llb(0L, bsa.field_q);
                        var12.b(param1 ^ -562, var12.field_Ib);
                        var12.field_Jb = new llb(0L, geb.field_o);
                        if (!ll.field_o) {
                          break L16;
                        } else {
                          var12.b(-561, var12.field_Jb);
                          break L16;
                        }
                      }
                      var12.field_Jb.field_F = 2;
                      var12.field_Mb = new llb(0L, qc.field_q);
                      var12.b(-561, var12.field_Mb);
                      var12.g(121);
                      var12.field_wb = new llb(0L, jba.field_h);
                      var12.b(-561, var12.field_wb);
                      var12.field_Nb = new llb(0L, nfb.field_a);
                      var13 = 1;
                      var12.b(-561, var12.field_Nb);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L17: {
                    var12.field_Ib.field_R = null;
                    var14 = var12.field_Ib;
                    var12.field_Ib.field_G = 0;
                    var14.field_hb = 0;
                    var12.field_Jb.field_R = null;
                    var12.field_Jb.field_G = 0;
                    var15 = var12.field_Jb;
                    var12.field_wb.field_R = null;
                    var15.field_hb = 0;
                    var16 = var12.field_wb;
                    var12.field_wb.field_G = 0;
                    var12.field_Nb.field_R = null;
                    var16.field_hb = 0;
                    var12.field_Nb.field_G = 0;
                    var17 = var12.field_Nb;
                    var12.field_Mb.field_R = null;
                    var17.field_hb = 0;
                    var12.field_Mb.field_G = 0;
                    var18 = var12.field_Mb;
                    var18.field_hb = 0;
                    var12.field_hb = param2.field_wb.field_hb;
                    var19 = 0;
                    var20 = var12.field_xb;
                    var21 = 72;
                    if (tja.field_a != param2) {
                      break L17;
                    } else {
                      var21 += 42;
                      break L17;
                    }
                  }
                  L18: {
                    var20 = no.a(var12.field_Ib.field_eb, var20, var21);
                    if (var20.equals((Object) (Object) var12.field_xb)) {
                      stackOut_65_0 = 0;
                      stackIn_66_0 = stackOut_65_0;
                      break L18;
                    } else {
                      stackOut_64_0 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      var22 = stackIn_66_0;
                      if (var12.field_vb >= 4) {
                        break L20;
                      } else {
                        if (var12.field_vb <= 0) {
                          break L19;
                        } else {
                          var20 = "<img=" + (-1 + var12.field_vb) + ">" + var20;
                          if (var31 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    var20 = "<img=" + (mha.field_a + var12.field_vb + -4) + ">" + var20;
                    break L19;
                  }
                  L21: {
                    var12.field_Ib.field_R = var20;
                    if (var12.i(-120)) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          L24: {
                            var23_int = 16764006;
                            var24_int = 16777215;
                            if (var5_int == 0) {
                              break L24;
                            } else {
                              if (!var12.field_Lb) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if (var12.field_Gb < var6) {
                            break L23;
                          } else {
                            if (var12.field_Bb < var7) {
                              break L23;
                            } else {
                              if ((var8 & (var12.field_Ab ^ -1)) <= 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        var24_int = 8421504;
                        var23_int = 8414771;
                        break L22;
                      }
                      L25: {
                        L26: {
                          var12.field_wb.field_Y = var23_int;
                          var12.field_Jb.field_Y = var23_int;
                          var12.field_Ib.field_Y = var23_int;
                          var12.field_Ib.field_U = var24_int;
                          var12.field_Ib.field_ib = var24_int;
                          var12.field_Ib.field_qb = var24_int;
                          var12.field_Jb.field_U = var24_int;
                          var12.field_Jb.field_ib = var24_int;
                          var12.field_Jb.field_qb = var24_int;
                          var12.field_wb.field_U = var24_int;
                          var12.field_wb.field_ib = var24_int;
                          var12.field_wb.field_qb = var24_int;
                          if (rga.field_f == param2) {
                            break L26;
                          } else {
                            L27: {
                              if (var12.field_Eb) {
                                break L27;
                              } else {
                                L28: {
                                  if (var12.field_Fb) {
                                    break L28;
                                  } else {
                                    var12.field_wb.field_R = vnb.field_o;
                                    if (var31 == 0) {
                                      break L25;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var12.field_Ib.field_R = isa.a(uk.field_a, new String[1], 100);
                                var12.field_wb.field_R = knb.field_q;
                                var12.field_Nb.field_R = na.field_o;
                                if (var31 == 0) {
                                  break L25;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var12.field_Ib.field_R = isa.a(gob.field_b, new String[1], 74);
                            var12.field_Nb.field_R = fqb.field_p;
                            if (var31 == 0) {
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                        if (lqa.field_o.field_fc) {
                          break L25;
                        } else {
                          var12.field_Nb.field_R = ee.field_r;
                          break L25;
                        }
                      }
                      L29: {
                        var25_int = 0;
                        if (null == lqa.field_o) {
                          break L29;
                        } else {
                          if (!nmb.b(-91)) {
                            break L29;
                          } else {
                            if (wqa.field_a != var12.field_zb) {
                              L30: {
                                if (null != var12.field_wb.field_R) {
                                  var26 = var12.field_wb.e(param1 + 93) + 2 * qs.field_c;
                                  var12.field_wb.a(var25_int, 124, var26, var19, nna.field_w);
                                  var25_int = var25_int + var26;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              if (var12.field_Nb.field_R != null) {
                                L31: {
                                  L32: {
                                    if (rga.field_f != param2) {
                                      break L32;
                                    } else {
                                      var26 = 40;
                                      if (var31 == 0) {
                                        break L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  var26 = var12.field_Nb.e(101) + qs.field_c * 2;
                                  break L31;
                                }
                                var12.field_Nb.a(var25_int, 127, var26, var19, nna.field_w);
                                var25_int = var25_int + var26;
                                break L29;
                              } else {
                                break L29;
                              }
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      L33: {
                        stackOut_111_0 = var12.field_Ib;
                        stackOut_111_1 = var25_int;
                        stackOut_111_2 = 116;
                        stackOut_111_3 = -var25_int;
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_113_1 = stackOut_111_1;
                        stackIn_113_2 = stackOut_111_2;
                        stackIn_113_3 = stackOut_111_3;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        if (!ll.field_o) {
                          stackOut_113_0 = (llb) (Object) stackIn_113_0;
                          stackOut_113_1 = stackIn_113_1;
                          stackOut_113_2 = stackIn_113_2;
                          stackOut_113_3 = stackIn_113_3;
                          stackOut_113_4 = 0;
                          stackIn_114_0 = stackOut_113_0;
                          stackIn_114_1 = stackOut_113_1;
                          stackIn_114_2 = stackOut_113_2;
                          stackIn_114_3 = stackOut_113_3;
                          stackIn_114_4 = stackOut_113_4;
                          break L33;
                        } else {
                          stackOut_112_0 = (llb) (Object) stackIn_112_0;
                          stackOut_112_1 = stackIn_112_1;
                          stackOut_112_2 = stackIn_112_2;
                          stackOut_112_3 = stackIn_112_3;
                          stackOut_112_4 = 42;
                          stackIn_114_0 = stackOut_112_0;
                          stackIn_114_1 = stackOut_112_1;
                          stackIn_114_2 = stackOut_112_2;
                          stackIn_114_3 = stackOut_112_3;
                          stackIn_114_4 = stackOut_112_4;
                          break L33;
                        }
                      }
                      L34: {
                        L35: {
                          ((llb) (Object) stackIn_114_0).a(stackIn_114_1, stackIn_114_2, stackIn_114_3 + (-stackIn_114_4 + var12.field_hb), var19, nna.field_w);
                          var12.field_Jb.field_R = Integer.toString(var12.field_Gb);
                          var12.field_Jb.a(-40 + var12.field_hb, param1 + 123, 40, var19, nna.field_w);
                          if (!var12.field_Ib.field_O) {
                            break L35;
                          } else {
                            if (var22 == 0) {
                              break L35;
                            } else {
                              lob.field_a = var12.field_xb;
                              if (gp.field_q == null) {
                                break L34;
                              } else {
                                if (gp.field_q[var12.field_vb] == null) {
                                  break L34;
                                } else {
                                  lob.field_a = lob.field_a + " - " + gp.field_q[var12.field_vb];
                                  if (var31 == 0) {
                                    break L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (!var12.field_Ib.field_O) {
                          break L34;
                        } else {
                          if (null == gp.field_q) {
                            break L34;
                          } else {
                            if (null != gp.field_q[var12.field_vb]) {
                              lob.field_a = gp.field_q[var12.field_vb];
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                      var19 = var19 + nna.field_w;
                      break L21;
                    }
                  }
                  L36: {
                    var23 = heb.a(var12.field_Db, var20, param1 ^ -3224);
                    if (null == var23) {
                      break L36;
                    } else {
                      var24_int = var12.field_Mb.field_eb.c(var23, -qs.field_c + var12.field_hb + -qs.field_c);
                      var12.field_Mb.field_I = 256 * var12.field_yb / ktb.field_p;
                      var12.field_Mb.field_R = var23;
                      var12.field_Mb.a(qs.field_c, -102, var12.field_hb - qs.field_c * 2, var19, nna.field_w * var24_int);
                      var19 = var19 + nna.field_w * var24_int;
                      break L36;
                    }
                  }
                  L37: {
                    if (var9 != 0) {
                      break L37;
                    } else {
                      var12.field_E = var19 - var12.field_G;
                      break L37;
                    }
                  }
                  L38: {
                    if (var13 == 0) {
                      break L38;
                    } else {
                      param2.field_wb.a((llb) (Object) var11, 2, (llb) (Object) var12, 101);
                      break L38;
                    }
                  }
                  L39: {
                    if ((var12.field_o ^ -1) == -1) {
                      break L39;
                    } else {
                      if (!var12.i(61)) {
                        L40: {
                          if ((var12.field_wb.field_o ^ -1) == -1) {
                            break L40;
                          } else {
                            ut.a(6, var12.field_zb, param4);
                            if (var31 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        L41: {
                          if (0 != var12.field_Nb.field_o) {
                            break L41;
                          } else {
                            sn.a(qs.field_a, 0, var12, (byte) 71, oq.field_H, param2, 0);
                            if (var31 == 0) {
                              break L39;
                            } else {
                              break L41;
                            }
                          }
                        }
                        pe.a(param4, var12.field_zb, -125);
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                  }
                  L42: {
                    if (!var12.field_Q) {
                      break L42;
                    } else {
                      if (var12.i(121)) {
                        break L42;
                      } else {
                        L43: {
                          var24 = null;
                          if ((var12.field_zb ^ -1L) != (wqa.field_a ^ -1L)) {
                            L44: {
                              if (var5_int == 0) {
                                break L44;
                              } else {
                                if (!var12.field_Lb) {
                                  var24 = isa.a(jla.field_B, new String[1], 120);
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            if ((var7 ^ -1) < (var12.field_Bb ^ -1)) {
                              L45: {
                                var25_int = -var12.field_Bb + var7;
                                if (var25_int == 1) {
                                  var24 = isa.a(dfb.field_p, new String[1], 124);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              var24 = isa.a(iwa.field_c, new String[2], 124);
                              break L43;
                            } else {
                              if ((var6 ^ -1) >= (var12.field_Gb ^ -1)) {
                                if (-1 != (var8 & (var12.field_Ab ^ -1) ^ -1)) {
                                  L46: {
                                    var25_int = wsb.a(var8 & (var12.field_Ab ^ -1), 1302374146);
                                    var24 = isa.a(pha.field_q, new String[1], param1 ^ 124);
                                    if ((var25_int ^ -1) >= -1) {
                                      break L46;
                                    } else {
                                      if (null == mta.field_a) {
                                        break L46;
                                      } else {
                                        if ((mta.field_a.length ^ -1) > (var25_int ^ -1)) {
                                          break L46;
                                        } else {
                                          if (null == mta.field_a[-1 + var25_int]) {
                                            break L46;
                                          } else {
                                            var24 = isa.a(mta.field_a[var25_int + -1][2], new String[1], 82);
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                } else {
                                  break L43;
                                }
                              } else {
                                var24 = isa.a(cp.field_j, new String[2], param1 + 92);
                                break L43;
                              }
                            }
                          } else {
                            L47: {
                              if (var5_int == 0) {
                                break L47;
                              } else {
                                if (var12.field_Lb) {
                                  break L47;
                                } else {
                                  var24 = aw.field_Db;
                                  break L43;
                                }
                              }
                            }
                            if ((var12.field_Bb ^ -1) <= (var7 ^ -1)) {
                              if (var6 > var12.field_Gb) {
                                var24 = isa.a(vl.field_q, new String[2], 92);
                                break L43;
                              } else {
                                if ((var8 & (var12.field_Ab ^ -1)) != 0) {
                                  L48: {
                                    var25_int = wsb.a((var12.field_Ab ^ -1) & var8, 1302374146);
                                    var24 = ooa.field_zb;
                                    if (0 >= var25_int) {
                                      break L48;
                                    } else {
                                      if (mta.field_a == null) {
                                        break L48;
                                      } else {
                                        if (var25_int > mta.field_a.length) {
                                          break L48;
                                        } else {
                                          if (mta.field_a[-1 + var25_int] != null) {
                                            var24_ref = mta.field_a[var25_int + -1][1];
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            } else {
                              L49: {
                                var25_int = var7 + -var12.field_Bb;
                                if ((var25_int ^ -1) != -2) {
                                  break L49;
                                } else {
                                  var24 = cqb.field_f;
                                  break L49;
                                }
                              }
                              var24 = isa.a(otb.field_o, new String[2], 124);
                              break L43;
                            }
                          }
                        }
                        if (null == var24) {
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
                                  L54: {
                                    if (var27_int >= ocb.field_l) {
                                      break L54;
                                    } else {
                                      var28 = lqa.field_o.field_Pb[var27_int] & 255;
                                      var29 = 0;
                                      if (var31 != 0) {
                                        break L53;
                                      } else {
                                        L55: {
                                          if (qcb.field_o == null) {
                                            break L55;
                                          } else {
                                            if (qcb.field_o[var27_int] == null) {
                                              break L55;
                                            } else {
                                              if (!qcb.field_o[var27_int][var28]) {
                                                break L55;
                                              } else {
                                                if (!var12.field_Lb) {
                                                  var29 = 1;
                                                  break L55;
                                                } else {
                                                  break L55;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L56: {
                                          if (crb.field_w == null) {
                                            break L56;
                                          } else {
                                            if (null != crb.field_w[var27_int]) {
                                              L57: {
                                                var30_int = crb.field_w[var27_int][var28];
                                                if (var30_int == 0) {
                                                  break L57;
                                                } else {
                                                  if (ufa.field_o) {
                                                    break L57;
                                                  } else {
                                                    if (var12.field_Lb) {
                                                      break L57;
                                                    } else {
                                                      var29 = 1;
                                                      break L57;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var30_int ^ -1) < (var12.field_Gb ^ -1)) {
                                                var29 = 1;
                                                break L56;
                                              } else {
                                                break L56;
                                              }
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                        L58: {
                                          if (tab.field_p == null) {
                                            break L58;
                                          } else {
                                            if (null != tab.field_p[var27_int]) {
                                              L59: {
                                                var30_int = tab.field_p[var27_int][var28];
                                                if (0 == var30_int) {
                                                  break L59;
                                                } else {
                                                  if (ufa.field_o) {
                                                    break L59;
                                                  } else {
                                                    if (!var12.field_Lb) {
                                                      var29 = 1;
                                                      break L59;
                                                    } else {
                                                      break L59;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var12.field_Bb >= var30_int) {
                                                break L58;
                                              } else {
                                                var29 = 1;
                                                break L58;
                                              }
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                        L60: {
                                          if (null == hia.field_o) {
                                            break L60;
                                          } else {
                                            if (hia.field_o[var27_int] != null) {
                                              if (((var12.field_Ab ^ -1) & hia.field_o[var27_int][var28] ^ -1) == -1) {
                                                break L60;
                                              } else {
                                                var29 = 1;
                                                break L60;
                                              }
                                            } else {
                                              break L60;
                                            }
                                          }
                                        }
                                        L61: {
                                          if (var29 != 0) {
                                            L62: {
                                              var30 = "<col=A00000>" + hva.field_c[var27_int] + "</col>";
                                              if (var25 != null) {
                                                break L62;
                                              } else {
                                                var25 = var30;
                                                if (var31 == 0) {
                                                  break L61;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                            var26 = 1;
                                            var25 = var25 + ", " + var30;
                                            break L61;
                                          } else {
                                            break L61;
                                          }
                                        }
                                        var27_int++;
                                        if (var31 == 0) {
                                          continue L50;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                  }
                                  if (rga.field_f != param2) {
                                    break L53;
                                  } else {
                                    if (nmb.b(param1 + -106)) {
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L63: {
                                  if (var26 != 0) {
                                    break L63;
                                  } else {
                                    var24 = var24 + "<br>" + isa.a(pua.field_o, new String[1], 122);
                                    if (var31 == 0) {
                                      break L51;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                                var24 = var24 + "<br>" + eka.field_a + var25;
                                if (var31 == 0) {
                                  break L51;
                                } else {
                                  break L52;
                                }
                              }
                              L64: {
                                if (var26 != 0) {
                                  break L64;
                                } else {
                                  var24 = var24 + "<br>" + isa.a(web.field_p, new String[1], 89);
                                  if (var31 == 0) {
                                    break L51;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              var24 = var24 + "<br>" + acb.field_r + var25;
                              break L51;
                            }
                            L65: {
                              if (param2 != rga.field_f) {
                                break L65;
                              } else {
                                if (nmb.b(90)) {
                                  break L65;
                                } else {
                                  var27 = lqa.field_o.field_Vb;
                                  var24 = var24 + "<br>" + isa.a(rnb.field_o, new String[1], 125);
                                  break L65;
                                }
                              }
                            }
                            lob.field_a = var24;
                            break L42;
                          }
                        }
                      }
                    }
                  }
                  var11 = var12;
                  var12 = (jk) (Object) var10.a((byte) 23);
                  if (var31 == 0) {
                    continue L12;
                  } else {
                    break L14;
                  }
                }
              }
            }
            break L13;
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -28228) {
            return;
        }
        try {
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bm.B(" + param0 + 41);
        }
    }

    static {
    }
}
