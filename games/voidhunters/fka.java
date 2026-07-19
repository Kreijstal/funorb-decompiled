/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fka extends ksa {
    int field_e;
    ml field_d;
    ml field_f;

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -51) {
                break L1;
              } else {
                fka.a(96, (byte) 89, false, true, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("fka.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        llb var6 = null;
        llb var7 = null;
        llb var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        ij var17 = null;
        int var17_int = 0;
        Object var18 = null;
        jk var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        llb var21 = null;
        int[] var22 = null;
        String var23 = null;
        int[] var24 = null;
        llb var25 = null;
        llb stackIn_18_0 = null;
        llb stackIn_19_0 = null;
        llb stackIn_20_0 = null;
        llb stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_38_0 = 0;
        llb stackIn_152_0 = null;
        llb stackIn_153_0 = null;
        llb stackIn_154_0 = null;
        llb stackIn_155_0 = null;
        llb stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        llb stackIn_157_0 = null;
        llb stackIn_158_0 = null;
        llb stackIn_159_0 = null;
        llb stackIn_160_0 = null;
        llb stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        llb stackIn_162_0 = null;
        llb stackIn_163_0 = null;
        llb stackIn_164_0 = null;
        llb stackIn_165_0 = null;
        llb stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        RuntimeException decompiledCaughtException = null;
        llb stackOut_17_0 = null;
        llb stackOut_18_0 = null;
        llb stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        llb stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        llb stackOut_151_0 = null;
        llb stackOut_152_0 = null;
        llb stackOut_153_0 = null;
        llb stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        llb stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        llb stackOut_156_0 = null;
        llb stackOut_157_0 = null;
        llb stackOut_158_0 = null;
        llb stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        llb stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        llb stackOut_161_0 = null;
        llb stackOut_162_0 = null;
        llb stackOut_163_0 = null;
        llb stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        llb stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        var18 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              lkb.a(tba.field_p, (byte) -128);
              if (lqa.field_o != null) {
                L2: {
                  nt.field_q.field_y = true;
                  vw.field_a.field_G = 0;
                  var21 = vw.field_a;
                  var25 = var21;
                  var25.field_hb = 0;
                  var6 = qsa.field_b;
                  qsa.field_b.field_G = 0;
                  var6.field_hb = 0;
                  qi.field_p.field_G = 0;
                  var7 = qi.field_p;
                  var7.field_hb = 0;
                  if (nmb.b(119)) {
                    L3: {
                      rob.field_q.field_R = fmb.field_p.toUpperCase();
                      var9 = (2 + vva.field_r.field_hb) / 2;
                      vw.field_a.a(0, 116, -2 + var9, vva.field_r.field_G - 40, 40);
                      if (lqa.field_o.field_Fb <= lqa.field_o.field_zb) {
                        vw.field_a.field_R = ukb.field_q.toUpperCase();
                        vw.field_a.field_y = false;
                        break L3;
                      } else {
                        vw.field_a.field_R = ko.field_d.toUpperCase();
                        vw.field_a.field_y = true;
                        break L3;
                      }
                    }
                    L4: {
                      vw.field_a.field_gb = qcb.field_p.field_gb;
                      if (0 >= qea.field_p) {
                        break L4;
                      } else {
                        L5: {
                          if (qea.field_p != 1) {
                            var10_ref_String = isa.a(nha.field_p, new String[]{Integer.toString(qea.field_p)}, 99);
                            break L5;
                          } else {
                            var10_ref_String = rja.field_o;
                            break L5;
                          }
                        }
                        L6: {
                          if (-1 != (16 & ls.field_o ^ -1)) {
                            break L6;
                          } else {
                            if (!wo.field_o) {
                              vw.field_a.field_gb = qcb.field_p.field_mb;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        vw.field_a.field_R = vw.field_a.field_R + "<br>" + var10_ref_String;
                        break L4;
                      }
                    }
                    L7: {
                      L8: {
                        qsa.field_b.a(var9, 119, vva.field_r.field_hb - var9, vva.field_r.field_G - 40, 40);
                        qsa.field_b.field_R = pga.field_o.toUpperCase();
                        stackOut_17_0 = qsa.field_b;
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (!param2) {
                          break L8;
                        } else {
                          stackOut_18_0 = (llb) ((Object) stackIn_18_0);
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (qga.field_a != 0L) {
                            break L8;
                          } else {
                            stackOut_19_0 = (llb) ((Object) stackIn_19_0);
                            stackOut_19_1 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_20_0 = (llb) ((Object) stackIn_20_0);
                      stackOut_20_1 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L7;
                    }
                    L9: {
                      stackIn_21_0.field_y = stackIn_21_1 != 0;
                      var8 = qsa.field_b;
                      var10 = 2;
                      if (ncb.field_a == null) {
                        break L9;
                      } else {
                        L10: {
                          if (null == tib.field_i) {
                            tib.field_i = new byte[ocb.field_l];
                            mia.field_a = new boolean[ocb.field_l];
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var11 = 0;
                        L11: while (true) {
                          if (var11 >= ocb.field_l) {
                            var10 = 0;
                            L12: while (true) {
                              L13: {
                                if (-3 >= (var10 ^ -1)) {
                                  break L13;
                                } else {
                                  var11 = 0;
                                  var12 = 0;
                                  L14: while (true) {
                                    if (var12 >= ncb.field_a.length) {
                                      if (var11 != 0) {
                                        break L13;
                                      } else {
                                        var10++;
                                        continue L12;
                                      }
                                    } else {
                                      var24 = ncb.field_a[var12];
                                      var22 = var24;
                                      var13_ref_int__ = var22;
                                      var14 = 0;
                                      L15: while (true) {
                                        if (var24.length <= var14) {
                                          var11 = 1;
                                          var14 = -1;
                                          var15 = 0;
                                          L16: while (true) {
                                            if (var15 >= var24.length) {
                                              mia.field_a[var14] = true;
                                              var12++;
                                              continue L14;
                                            } else {
                                              var16 = var24[var15];
                                              if (var16 > var14) {
                                                var14 = var16;
                                                var15 += 2;
                                                continue L16;
                                              } else {
                                                var15 += 2;
                                                continue L16;
                                              }
                                            }
                                          }
                                        } else {
                                          L17: {
                                            var15 = var24[var14];
                                            var16 = var13_ref_int__[var14 + 1];
                                            if (-1 != var15) {
                                              if ((255 & lqa.field_o.field_Pb[var15]) == var16) {
                                                break L17;
                                              } else {
                                                var12++;
                                                continue L14;
                                              }
                                            } else {
                                              L18: {
                                                if (var10 == 0) {
                                                  stackOut_37_0 = lqa.field_o.field_Fb;
                                                  stackIn_38_0 = stackOut_37_0;
                                                  break L18;
                                                } else {
                                                  stackOut_36_0 = lqa.field_o.field_zb;
                                                  stackIn_38_0 = stackOut_36_0;
                                                  break L18;
                                                }
                                              }
                                              var17_int = stackIn_38_0;
                                              if (var17_int == var16) {
                                                break L17;
                                              } else {
                                                var12++;
                                                continue L14;
                                              }
                                            }
                                          }
                                          var14 += 2;
                                          continue L15;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if ((go.field_p ^ -1) > -3) {
                                break L9;
                              } else {
                                if (si.field_o[12]) {
                                  var10 = 2;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          } else {
                            mia.field_a[var11] = false;
                            var11++;
                            continue L11;
                          }
                        }
                      }
                    }
                    if (var10 >= 2) {
                      L19: {
                        if (null != qcb.field_o) {
                          break L19;
                        } else {
                          if (null != crb.field_w) {
                            break L19;
                          } else {
                            if (null != tab.field_p) {
                              break L19;
                            } else {
                              if (null != hia.field_o) {
                                break L19;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      var16 = 0;
                      L20: while (true) {
                        if (ocb.field_l <= var16) {
                          var16 = 0;
                          var17 = rga.field_f.field_wb.field_lb;
                          var18_ref = (jk) ((Object) var17.d(0));
                          L21: while (true) {
                            L22: {
                              if (var18_ref == null) {
                                break L22;
                              } else {
                                L23: {
                                  if (!var18_ref.i(56)) {
                                    L24: {
                                      if (var11 == 0) {
                                        break L24;
                                      } else {
                                        if (!var18_ref.field_Lb) {
                                          var16 = 1;
                                          break L22;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                    if (var18_ref.field_Gb < var13) {
                                      var16 = 1;
                                      break L22;
                                    } else {
                                      if (var18_ref.field_Bb >= var14) {
                                        if (-1 > (var15 & (var18_ref.field_Ab ^ -1) ^ -1)) {
                                          var16 = 1;
                                          break L22;
                                        } else {
                                          if (var12 == 0) {
                                            break L23;
                                          } else {
                                            var16 = 1;
                                            break L22;
                                          }
                                        }
                                      } else {
                                        var16 = 1;
                                        break L22;
                                      }
                                    }
                                  } else {
                                    break L23;
                                  }
                                }
                                var18_ref = (jk) ((Object) var17.a((byte) 98));
                                continue L21;
                              }
                            }
                            L25: {
                              if (go.field_p < 2) {
                                break L25;
                              } else {
                                if (si.field_o[12]) {
                                  var16 = 0;
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            if (var16 == 0) {
                              break L2;
                            } else {
                              qsa.field_b.field_y = false;
                              if (qsa.field_b.field_Q) {
                                if (0 == hra.field_o.field_a.field_Ab) {
                                  lob.field_a = kob.field_e;
                                  break L2;
                                } else {
                                  lob.field_a = isa.a(hja.field_p, new String[]{bd.field_a}, 121);
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                        } else {
                          L26: {
                            var17_int = 255 & lqa.field_o.field_Pb[var16];
                            if (null == qcb.field_o) {
                              break L26;
                            } else {
                              if (null == qcb.field_o[var16]) {
                                break L26;
                              } else {
                                if (qcb.field_o[var16][var17_int]) {
                                  var11 = 1;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L27: {
                            if (crb.field_w == null) {
                              break L27;
                            } else {
                              if (crb.field_w[var16] == null) {
                                break L27;
                              } else {
                                L28: {
                                  var18_int = crb.field_w[var16][var17_int];
                                  if (var18_int > var13) {
                                    var13 = var18_int;
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                if (var18_int == 0) {
                                  break L27;
                                } else {
                                  if (!ufa.field_o) {
                                    var11 = 1;
                                    break L27;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                          L29: {
                            if (tab.field_p == null) {
                              break L29;
                            } else {
                              if (tab.field_p[var16] != null) {
                                L30: {
                                  var18_int = tab.field_p[var16][var17_int];
                                  if (var14 < var18_int) {
                                    var14 = var18_int;
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                                if (-1 == (var18_int ^ -1)) {
                                  break L29;
                                } else {
                                  if (ufa.field_o) {
                                    break L29;
                                  } else {
                                    var11 = 1;
                                    break L29;
                                  }
                                }
                              } else {
                                if (null != hia.field_o) {
                                  if (hia.field_o[var16] != null) {
                                    var15 = var15 | hia.field_o[var16][var17_int];
                                    var16++;
                                    continue L20;
                                  } else {
                                    var16++;
                                    continue L20;
                                  }
                                } else {
                                  var16++;
                                  continue L20;
                                }
                              }
                            }
                          }
                          if (null != hia.field_o) {
                            if (hia.field_o[var16] != null) {
                              var15 = var15 | hia.field_o[var16][var17_int];
                              var16++;
                              continue L20;
                            } else {
                              var16++;
                              continue L20;
                            }
                          } else {
                            var16++;
                            continue L20;
                          }
                        }
                      }
                    } else {
                      qsa.field_b.field_y = false;
                      if (qsa.field_b.field_Q) {
                        var11_ref = null;
                        var12 = 0;
                        var13 = 0;
                        L31: while (true) {
                          if (ocb.field_l <= var13) {
                            L32: {
                              if (var10 != 0) {
                                var13_ref_String = ef.field_A;
                                if (var12 == 0) {
                                  var14_ref_String = isa.a(jra.field_b, new String[]{(String) (var11_ref)}, 92);
                                  break L32;
                                } else {
                                  var14_ref_String = alb.field_a + (String) (var11_ref);
                                  break L32;
                                }
                              } else {
                                var13_ref_String = dhb.field_o;
                                if (var12 != 0) {
                                  var14_ref_String = nd.field_o + (String) (var11_ref);
                                  break L32;
                                } else {
                                  var14_ref_String = isa.a(cp.field_g, new String[]{(String) (var11_ref)}, 126);
                                  break L32;
                                }
                              }
                            }
                            lob.field_a = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                            break L2;
                          } else {
                            if (mia.field_a[var13]) {
                              L33: {
                                var23 = "<col=A00000>" + hva.field_c[var13] + "</col>";
                                if (var11_ref == null) {
                                  var11_ref = var23;
                                  break L33;
                                } else {
                                  var11_ref = (String) (var11_ref) + ", " + var23;
                                  var12 = 1;
                                  break L33;
                                }
                              }
                              var13++;
                              continue L31;
                            } else {
                              var13++;
                              continue L31;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    var9_ref_String = lqa.field_o.field_Vb;
                    rob.field_q.field_R = isa.a(wt.field_b, new String[]{var9_ref_String}, 118).toUpperCase();
                    qi.field_p.a(0, -127, vva.field_r.field_hb, -40 + vva.field_r.field_G, 40);
                    qi.field_p.field_R = isa.a(ub.field_h, new String[]{var9_ref_String}, 79);
                    var8 = qi.field_p;
                    break L2;
                  }
                }
                L34: {
                  if (qga.field_a == 0L) {
                    break L34;
                  } else {
                    L35: {
                      var9 = (int)(-wt.a(false) + qga.field_a);
                      var9 = (999 + var9) / 1000;
                      if (1 <= var9) {
                        break L35;
                      } else {
                        var9 = 1;
                        break L35;
                      }
                    }
                    var8.field_R = isa.a(cu.field_o, new String[]{Integer.toString(var9)}, 79);
                    break L34;
                  }
                }
                ukb.field_o.field_R = isa.a(tma.field_o, new String[]{Integer.toString(lqa.field_o.field_zb), Integer.toString(lqa.field_o.field_Fb)}, 124);
                break L1;
              } else {
                break L1;
              }
            }
            L36: {
              if (param1 >= 8) {
                break L36;
              } else {
                fka.a(-44, (byte) 40, true, false, true);
                break L36;
              }
            }
            L37: {
              L38: {
                stackOut_151_0 = rga.field_g;
                stackIn_155_0 = stackOut_151_0;
                stackIn_152_0 = stackOut_151_0;
                if (!param3) {
                  break L38;
                } else {
                  stackOut_152_0 = (llb) ((Object) stackIn_152_0);
                  stackIn_155_0 = stackOut_152_0;
                  stackIn_153_0 = stackOut_152_0;
                  if (param4) {
                    break L38;
                  } else {
                    stackOut_153_0 = (llb) ((Object) stackIn_153_0);
                    stackIn_155_0 = stackOut_153_0;
                    stackIn_154_0 = stackOut_153_0;
                    if (wo.field_o) {
                      break L38;
                    } else {
                      stackOut_154_0 = (llb) ((Object) stackIn_154_0);
                      stackOut_154_1 = 1;
                      stackIn_156_0 = stackOut_154_0;
                      stackIn_156_1 = stackOut_154_1;
                      break L37;
                    }
                  }
                }
              }
              stackOut_155_0 = (llb) ((Object) stackIn_155_0);
              stackOut_155_1 = 0;
              stackIn_156_0 = stackOut_155_0;
              stackIn_156_1 = stackOut_155_1;
              break L37;
            }
            L39: {
              L40: {
                ((llb) (Object) stackIn_156_0).a(stackIn_156_1 != 0, 1332);
                stackOut_156_0 = vva.field_r;
                stackIn_160_0 = stackOut_156_0;
                stackIn_157_0 = stackOut_156_0;
                if (!param3) {
                  break L40;
                } else {
                  stackOut_157_0 = (llb) ((Object) stackIn_157_0);
                  stackIn_160_0 = stackOut_157_0;
                  stackIn_158_0 = stackOut_157_0;
                  if (param4) {
                    break L40;
                  } else {
                    stackOut_158_0 = (llb) ((Object) stackIn_158_0);
                    stackIn_160_0 = stackOut_158_0;
                    stackIn_159_0 = stackOut_158_0;
                    if (wo.field_o) {
                      break L40;
                    } else {
                      stackOut_159_0 = (llb) ((Object) stackIn_159_0);
                      stackOut_159_1 = 1;
                      stackIn_161_0 = stackOut_159_0;
                      stackIn_161_1 = stackOut_159_1;
                      break L39;
                    }
                  }
                }
              }
              stackOut_160_0 = (llb) ((Object) stackIn_160_0);
              stackOut_160_1 = 0;
              stackIn_161_0 = stackOut_160_0;
              stackIn_161_1 = stackOut_160_1;
              break L39;
            }
            L41: {
              L42: {
                ((llb) (Object) stackIn_161_0).a(stackIn_161_1 != 0, 1332);
                stackOut_161_0 = jfb.field_o;
                stackIn_165_0 = stackOut_161_0;
                stackIn_162_0 = stackOut_161_0;
                if (!param3) {
                  break L42;
                } else {
                  stackOut_162_0 = (llb) ((Object) stackIn_162_0);
                  stackIn_165_0 = stackOut_162_0;
                  stackIn_163_0 = stackOut_162_0;
                  if (param4) {
                    break L42;
                  } else {
                    stackOut_163_0 = (llb) ((Object) stackIn_163_0);
                    stackIn_165_0 = stackOut_163_0;
                    stackIn_164_0 = stackOut_163_0;
                    if (!wo.field_o) {
                      break L42;
                    } else {
                      stackOut_164_0 = (llb) ((Object) stackIn_164_0);
                      stackOut_164_1 = 1;
                      stackIn_166_0 = stackOut_164_0;
                      stackIn_166_1 = stackOut_164_1;
                      break L41;
                    }
                  }
                }
              }
              stackOut_165_0 = (llb) ((Object) stackIn_165_0);
              stackOut_165_1 = 0;
              stackIn_166_0 = stackOut_165_0;
              stackIn_166_1 = stackOut_165_1;
              break L41;
            }
            L43: {
              ((llb) (Object) stackIn_166_0).a(stackIn_166_1 != 0, 1332);
              hra.field_o.field_a.i(10000);
              if (null != lqa.field_o) {
                L44: {
                  if (nt.field_q.field_o != 0) {
                    sh.a(lqa.field_o.f((byte) -13), -1, param0);
                    break L44;
                  } else {
                    break L44;
                  }
                }
                L45: {
                  if (vw.field_a.field_o == 0) {
                    break L45;
                  } else {
                    wo.field_o = true;
                    break L45;
                  }
                }
                L46: {
                  if (qsa.field_b.field_o == 0) {
                    break L46;
                  } else {
                    qu.field_o = true;
                    break L46;
                  }
                }
                L47: {
                  if (rlb.field_a.field_o != 0) {
                    wo.field_o = false;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                asb.a(param0, lqa.field_o, false, (byte) -67);
                break L43;
              } else {
                break L43;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "fka.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    fka(ml param0, int param1, ml param2, int param3, int param4) {
        try {
            this.field_d = param0;
            this.field_f = param2;
            this.field_e = param4;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
