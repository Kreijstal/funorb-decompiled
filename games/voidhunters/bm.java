/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends rqa {
    static eab field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        soa var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(85, 62, param0[0].a(90));
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (soa) null;
                bm.a(13, (byte) -15, (soa) null, true, 117);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bm.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    bm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, soa param2, boolean param3, int param4) {
        soa stackIn_40_0;
        int stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        soa stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        llb stackIn_92_0;
        int stackIn_92_1;
        int stackIn_92_2;
        int stackIn_92_3;
        llb stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        RuntimeException stackIn_213_0 = null;
        StringBuilder stackIn_213_1 = null;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        String stackIn_214_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ij var10 = null;
        int var11_int = 0;
        Object var11 = null;
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
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        var31 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              if (param1 == 1) {
                break L1;
              } else {
                field_o = (eab) null;
                break L1;
              }
            }
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
                    L5: {
                      var10_int = lqa.field_o.field_Pb[var9] & 255;
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
                          if (var11_int > var6) {
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
                          if (var7 >= var11_int) {
                            break L8;
                          } else {
                            var7 = var11_int;
                            break L8;
                          }
                        }
                      }
                    }
                    if (hia.field_o != null) {
                      if (hia.field_o[var9] != null) {
                        var8 = var8 | hia.field_o[var9][var10_int];
                        var9++;
                        continue L4;
                      } else {
                        var9++;
                        continue L4;
                      }
                    } else {
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
            L10: {
              stackIn_40_0 = (soa) (param2);

              stackIn_40_1 = 38;

              stackIn_40_2 = 2;

              stackIn_40_3 = (8 + nna.field_w * 4) * param0;

              if (param2 != qg.field_a) {
                stackIn_41_0 = (soa) ((Object) stackIn_40_0);
                stackIn_41_1 = stackIn_40_1;
                stackIn_41_2 = stackIn_40_2;
                stackIn_41_3 = stackIn_40_3;
                stackIn_41_4 = 0;
                break L10;
              } else {
                stackIn_41_0 = (soa) ((Object) stackIn_40_0);
                stackIn_41_1 = stackIn_40_1;
                stackIn_41_2 = stackIn_40_2;
                stackIn_41_3 = stackIn_40_3;
                stackIn_41_4 = 1;
                break L10;
              }
            }
            L11: {
              if (!((soa) (Object) stackIn_41_0).a((byte) stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4 != 0, param3, 2 * (2 + nna.field_w))) {
                stackIn_44_0 = 0;
                break L11;
              } else {
                stackIn_44_0 = 1;
                break L11;
              }
            }
            var9 = stackIn_44_0;
            var10 = param2.field_wb.field_lb;
            var11 = null;
            var12 = (jk) ((Object) var10.d(0));
            L12: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L13: {
                  var13 = 0;
                  if (null == var12.field_lb) {
                    L14: {
                      var12.field_Ib = new llb(0L, bsa.field_q);
                      var12.b(param1 ^ -562, var12.field_Ib);
                      var12.field_Jb = new llb(0L, geb.field_o);
                      if (!ll.field_o) {
                        break L14;
                      } else {
                        var12.b(-561, var12.field_Jb);
                        break L14;
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
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L15: {
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
                  var32 = var12.field_xb;
                  var21 = 72;
                  if (tja.field_a != param2) {
                    break L15;
                  } else {
                    var21 += 42;
                    break L15;
                  }
                }
                L16: {
                  var33 = no.a(var12.field_Ib.field_eb, var32, var21);
                  var20 = var33;
                  if (var33.equals(var12.field_xb)) {
                    stackIn_56_0 = 0;
                    break L16;
                  } else {
                    stackIn_56_0 = 1;
                    break L16;
                  }
                }
                L17: {
                  var22 = stackIn_56_0;
                  if (var12.field_vb >= 4) {
                    var20 = "<img=" + (mha.field_a + var12.field_vb + -4) + ">" + var33;
                    break L17;
                  } else {
                    if (var12.field_vb <= 0) {
                      break L17;
                    } else {
                      var20 = "<img=" + (-1 + var12.field_vb) + ">" + var33;
                      break L17;
                    }
                  }
                }
                L18: {
                  var12.field_Ib.field_R = var20;
                  if (var12.i(-120)) {
                    break L18;
                  } else {
                    L19: {
                      L20: {
                        L21: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L21;
                          } else {
                            if (!var12.field_Lb) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (var12.field_Gb < var6) {
                          break L20;
                        } else {
                          if (var12.field_Bb < var7) {
                            break L20;
                          } else {
                            if ((var8 & (var12.field_Ab ^ -1)) <= 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      var24_int = 8421504;
                      var23_int = 8414771;
                      break L19;
                    }
                    L22: {
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
                        if (lqa.field_o.field_fc) {
                          break L22;
                        } else {
                          var12.field_Nb.field_R = ee.field_r;
                          break L22;
                        }
                      } else {
                        if (var12.field_Eb) {
                          var12.field_Ib.field_R = isa.a(gob.field_b, new String[]{var20}, 74);
                          var12.field_Nb.field_R = fqb.field_p;
                          break L22;
                        } else {
                          if (var12.field_Fb) {
                            var12.field_Ib.field_R = isa.a(uk.field_a, new String[]{var20}, 100);
                            var12.field_wb.field_R = knb.field_q;
                            var12.field_Nb.field_R = na.field_o;
                            break L22;
                          } else {
                            var12.field_wb.field_R = vnb.field_o;
                            break L22;
                          }
                        }
                      }
                    }
                    L23: {
                      var25_int = 0;
                      if (null == lqa.field_o) {
                        break L23;
                      } else {
                        if (!nmb.b(-91)) {
                          break L23;
                        } else {
                          if (wqa.field_a != var12.field_zb) {
                            L24: {
                              if (null != var12.field_wb.field_R) {
                                var26 = var12.field_wb.e(param1 + 93) + 2 * qs.field_c;
                                var12.field_wb.a(var25_int, 124, var26, var19, nna.field_w);
                                var25_int = var25_int + var26;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            if (var12.field_Nb.field_R != null) {
                              L25: {
                                if (rga.field_f != param2) {
                                  var26 = var12.field_Nb.e(101) + qs.field_c * 2;
                                  break L25;
                                } else {
                                  var26 = 40;
                                  break L25;
                                }
                              }
                              var12.field_Nb.a(var25_int, 127, var26, var19, nna.field_w);
                              var25_int = var25_int + var26;
                              break L23;
                            } else {
                              break L23;
                            }
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    L26: {
                      stackIn_92_0 = var12.field_Ib;

                      stackIn_92_1 = var25_int;

                      stackIn_92_2 = 116;

                      stackIn_92_3 = -var25_int;

                      if (!ll.field_o) {
                        stackIn_93_0 = (llb) ((Object) stackIn_92_0);
                        stackIn_93_1 = stackIn_92_1;
                        stackIn_93_2 = stackIn_92_2;
                        stackIn_93_3 = stackIn_92_3;
                        stackIn_93_4 = 0;
                        break L26;
                      } else {
                        stackIn_93_0 = (llb) ((Object) stackIn_92_0);
                        stackIn_93_1 = stackIn_92_1;
                        stackIn_93_2 = stackIn_92_2;
                        stackIn_93_3 = stackIn_92_3;
                        stackIn_93_4 = 42;
                        break L26;
                      }
                    }
                    L27: {
                      L28: {
                        ((llb) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3 + (-stackIn_93_4 + var12.field_hb), var19, nna.field_w);
                        var12.field_Jb.field_R = Integer.toString(var12.field_Gb);
                        var12.field_Jb.a(-40 + var12.field_hb, param1 + 123, 40, var19, nna.field_w);
                        if (!var12.field_Ib.field_O) {
                          break L28;
                        } else {
                          if (var22 == 0) {
                            break L28;
                          } else {
                            lob.field_a = var12.field_xb;
                            if (gp.field_q == null) {
                              break L27;
                            } else {
                              if (gp.field_q[var12.field_vb] == null) {
                                break L27;
                              } else {
                                lob.field_a = lob.field_a + " - " + gp.field_q[var12.field_vb];
                                break L27;
                              }
                            }
                          }
                        }
                      }
                      if (!var12.field_Ib.field_O) {
                        break L27;
                      } else {
                        if (null == gp.field_q) {
                          break L27;
                        } else {
                          if (null != gp.field_q[var12.field_vb]) {
                            lob.field_a = gp.field_q[var12.field_vb];
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    var19 = var19 + nna.field_w;
                    break L18;
                  }
                }
                L29: {
                  var23 = heb.a(var12.field_Db, var20, param1 ^ -3224);
                  var24 = var23;
                  var30 = var24;
                  var25 = var30;
                  var24 = var23;
                  if (var23 == null) {
                    break L29;
                  } else {
                    var24_int = var12.field_Mb.field_eb.c(var23, -qs.field_c + var12.field_hb + -qs.field_c);
                    var12.field_Mb.field_I = 256 * var12.field_yb / ktb.field_p;
                    var12.field_Mb.field_R = var23;
                    var12.field_Mb.a(qs.field_c, -102, var12.field_hb - qs.field_c * 2, var19, nna.field_w * var24_int);
                    var19 = var19 + nna.field_w * var24_int;
                    break L29;
                  }
                }
                L30: {
                  if (var9 != 0) {
                    break L30;
                  } else {
                    var12.field_E = var19 - var12.field_G;
                    break L30;
                  }
                }
                L31: {
                  if (var13 == 0) {
                    break L31;
                  } else {
                    param2.field_wb.a((llb) (var11), 2, var12, 101);
                    break L31;
                  }
                }
                L32: {
                  if (var12.field_o == 0) {
                    break L32;
                  } else {
                    if (!var12.i(61)) {
                      if (var12.field_wb.field_o == 0) {
                        if (0 != var12.field_Nb.field_o) {
                          pe.a(param4, var12.field_zb, -125);
                          break L32;
                        } else {
                          sn.a(qs.field_a, 0, var12, (byte) 71, oq.field_H, param2, 0);
                          break L32;
                        }
                      } else {
                        ut.a(6, var12.field_zb, param4);
                        break L32;
                      }
                    } else {
                      break L32;
                    }
                  }
                }
                L33: {
                  if (!var12.field_Q) {
                    break L33;
                  } else {
                    if (var12.i(121)) {
                      break L33;
                    } else {
                      L34: {
                        var24 = null;
                        if ((var12.field_zb ^ -1L) != (wqa.field_a ^ -1L)) {
                          L35: {
                            if (var5_int == 0) {
                              break L35;
                            } else {
                              if (!var12.field_Lb) {
                                var24 = isa.a(jla.field_B, new String[]{var20}, 120);
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
                          if (var7 > var12.field_Bb) {
                            L36: {
                              var25_int = -var12.field_Bb + var7;
                              if (var25_int == 1) {
                                var24 = isa.a(dfb.field_p, new String[]{var20}, 124);
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            var24 = isa.a(iwa.field_c, new String[]{var20, Integer.toString(var25_int)}, 124);
                            break L34;
                          } else {
                            if (var6 <= var12.field_Gb) {
                              if (-1 != (var8 & (var12.field_Ab ^ -1) ^ -1)) {
                                var25_int = wsb.a(var8 & (var12.field_Ab ^ -1), 1302374146);
                                var24 = isa.a(pha.field_q, new String[]{var20}, param1 ^ 124);
                                if ((var25_int ^ -1) >= -1) {
                                  break L34;
                                } else {
                                  if (null == mta.field_a) {
                                    break L34;
                                  } else {
                                    if (mta.field_a.length < var25_int) {
                                      break L34;
                                    } else {
                                      if (null == mta.field_a[-1 + var25_int]) {
                                        break L34;
                                      } else {
                                        var24 = isa.a(mta.field_a[var25_int + -1][2], new String[]{var20}, 82);
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            } else {
                              var24 = isa.a(cp.field_j, new String[]{var20, Integer.toString(var6)}, param1 + 92);
                              break L34;
                            }
                          }
                        } else {
                          L37: {
                            if (var5_int == 0) {
                              break L37;
                            } else {
                              if (var12.field_Lb) {
                                break L37;
                              } else {
                                var24 = aw.field_Db;
                                break L34;
                              }
                            }
                          }
                          if (var12.field_Bb >= var7) {
                            if (var6 > var12.field_Gb) {
                              var24 = isa.a(vl.field_q, new String[]{null, Integer.toString(var6)}, 92);
                              break L34;
                            } else {
                              if ((var8 & (var12.field_Ab ^ -1)) != 0) {
                                var25_int = wsb.a((var12.field_Ab ^ -1) & var8, 1302374146);
                                var24 = ooa.field_zb;
                                if (0 >= var25_int) {
                                  break L34;
                                } else {
                                  if (mta.field_a == null) {
                                    break L34;
                                  } else {
                                    if (var25_int > mta.field_a.length) {
                                      break L34;
                                    } else {
                                      if (mta.field_a[-1 + var25_int] != null) {
                                        var24 = mta.field_a[var25_int + -1][1];
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            }
                          } else {
                            L38: {
                              var25_int = var7 + -var12.field_Bb;
                              if ((var25_int ^ -1) != -2) {
                                break L38;
                              } else {
                                var24 = cqb.field_f;
                                break L38;
                              }
                            }
                            var24 = isa.a(otb.field_o, new String[]{null, Integer.toString(var25_int)}, 124);
                            break L34;
                          }
                        }
                      }
                      if (var24 == null) {
                        break L33;
                      } else {
                        var34 = "<col=A00000>" + (String) (var24);
                        var30_ref = var34;
                        var25 = var30_ref;
                        var24 = var25;
                        var30_ref = var34;
                        var25 = var30_ref;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L39: while (true) {
                          if (var27_int >= ocb.field_l) {
                            L40: {
                              L41: {
                                if (rga.field_f != param2) {
                                  break L41;
                                } else {
                                  if (nmb.b(param1 + -106)) {
                                    if (var26 != 0) {
                                      var24 = var34 + "<br>" + acb.field_r + (String) (var25);
                                      break L40;
                                    } else {
                                      var24 = var34 + "<br>" + isa.a(web.field_p, new String[]{(String) (var25)}, 89);
                                      break L40;
                                    }
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              if (var26 != 0) {
                                var24 = var34 + "<br>" + eka.field_a + (String) (var25);
                                break L40;
                              } else {
                                var24 = var34 + "<br>" + isa.a(pua.field_o, new String[]{(String) (var25)}, 122);
                                break L40;
                              }
                            }
                            L42: {
                              if (param2 != rga.field_f) {
                                break L42;
                              } else {
                                if (nmb.b(90)) {
                                  break L42;
                                } else {
                                  var27 = lqa.field_o.field_Vb;
                                  var24 = (String) (var24) + "<br>" + isa.a(rnb.field_o, new String[]{var27}, 125);
                                  break L42;
                                }
                              }
                            }
                            lob.field_a = (String) (var24);
                            break L33;
                          } else {
                            L43: {
                              var28 = lqa.field_o.field_Pb[var27_int] & 255;
                              var29 = 0;
                              if (qcb.field_o == null) {
                                break L43;
                              } else {
                                if (qcb.field_o[var27_int] == null) {
                                  break L43;
                                } else {
                                  if (!qcb.field_o[var27_int][var28]) {
                                    break L43;
                                  } else {
                                    if (!var12.field_Lb) {
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
                              if (crb.field_w == null) {
                                break L44;
                              } else {
                                if (null != crb.field_w[var27_int]) {
                                  L45: {
                                    var30_int = crb.field_w[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L45;
                                    } else {
                                      if (ufa.field_o) {
                                        break L45;
                                      } else {
                                        if (var12.field_Lb) {
                                          break L45;
                                        } else {
                                          var29 = 1;
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int > var12.field_Gb) {
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
                              if (tab.field_p == null) {
                                break L46;
                              } else {
                                if (null != tab.field_p[var27_int]) {
                                  L47: {
                                    var30_int = tab.field_p[var27_int][var28];
                                    if (0 == var30_int) {
                                      break L47;
                                    } else {
                                      if (ufa.field_o) {
                                        break L47;
                                      } else {
                                        if (!var12.field_Lb) {
                                          var29 = 1;
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  if (var12.field_Bb >= var30_int) {
                                    break L46;
                                  } else {
                                    var29 = 1;
                                    break L46;
                                  }
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L48: {
                              if (null == hia.field_o) {
                                break L48;
                              } else {
                                if (hia.field_o[var27_int] != null) {
                                  if (((var12.field_Ab ^ -1) & hia.field_o[var27_int][var28]) == 0) {
                                    break L48;
                                  } else {
                                    var29 = 1;
                                    break L48;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                            }
                            L49: {
                              if (var29 != 0) {
                                var30_ref = "<col=A00000>" + hva.field_c[var27_int] + "</col>";
                                var25 = var30_ref;
                                var24 = var25;
                                var25 = var30_ref;
                                if (var25 != null) {
                                  var26 = 1;
                                  var25 = (String) (var25) + ", " + var30_ref;
                                  var24 = var25;
                                  var24 = var25;
                                  break L49;
                                } else {
                                  var25 = var30_ref;
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
                      }
                    }
                  }
                }
                var11 = var12;
                var12 = (jk) ((Object) var10.a((byte) 23));
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackIn_213_0 = (RuntimeException) (var5);

            stackIn_213_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_214_0 = (RuntimeException) ((Object) stackIn_213_0);
              stackIn_214_1 = (StringBuilder) ((Object) stackIn_213_1);
              stackIn_214_2 = "null";
              break L50;
            } else {
              stackIn_214_0 = (RuntimeException) ((Object) stackIn_213_0);
              stackIn_214_1 = (StringBuilder) ((Object) stackIn_213_1);
              stackIn_214_2 = "{...}";
              break L50;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_214_0), stackIn_214_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -28228) {
            return;
        }
        field_o = null;
    }

    static {
    }
}
