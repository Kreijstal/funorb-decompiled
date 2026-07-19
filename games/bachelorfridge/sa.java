/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pu {
    static String field_l;

    final static ma a(boolean param0, pf param1) {
        ma discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ma var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pf var9 = null;
        ma stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.d(8, (byte) -80);
            if (var2_int <= 0) {
              L1: {
                var3 = fa.a((byte) -75, param1) ? 1 : 0;
                var4 = fa.a((byte) -75, param1) ? 1 : 0;
                var5 = new ma();
                if (!param0) {
                  break L1;
                } else {
                  var9 = (pf) null;
                  discarded$2 = sa.a(true, (pf) null);
                  break L1;
                }
              }
              L2: {
                var5.field_g = (short)param1.d(16, (byte) 121);
                var5.field_x = as.a(var5.field_x, 127, param1, 16);
                var5.field_O = as.a(var5.field_O, 99, param1, 16);
                var5.field_r = as.a(var5.field_r, 102, param1, 16);
                var5.field_K = (short)param1.d(16, (byte) -64);
                var5.field_C = as.a(var5.field_C, 82, param1, 16);
                var5.field_h = as.a(var5.field_h, 123, param1, 16);
                var5.field_t = as.a(var5.field_t, 88, param1, 16);
                if (var3 == 0) {
                  break L2;
                } else {
                  var5.field_i = (short)param1.d(16, (byte) 51);
                  var5.field_f = as.a(var5.field_f, 122, param1, 16);
                  var5.field_N = as.a(var5.field_N, 75, param1, 16);
                  var5.field_b = as.a(var5.field_b, 93, param1, 16);
                  var5.field_F = as.a(var5.field_F, 96, param1, 16);
                  var5.field_c = as.a(var5.field_c, 60, param1, 16);
                  var5.field_e = as.a(var5.field_e, 83, param1, 16);
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  discarded$3 = param1.d(16, (byte) -85);
                  var5.field_y = as.a(var5.field_y, 90, param1, 16);
                  var5.field_m = as.a(var5.field_m, 59, param1, 16);
                  var5.field_l = as.a(var5.field_l, 97, param1, 16);
                  var5.field_H = as.a(var5.field_H, 96, param1, 16);
                  var5.field_v = as.a(var5.field_v, 75, param1, 16);
                  break L3;
                }
              }
              L4: {
                if (!fa.a((byte) -75, param1)) {
                  break L4;
                } else {
                  var5.field_w = as.a(var5.field_w, 81, param1, 16);
                  break L4;
                }
              }
              L5: {
                if (!fa.a((byte) -75, param1)) {
                  break L5;
                } else {
                  var5.field_d = hd.a(var5.field_d, param1, (byte) 103, 16);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_d.length) {
                      if (-1 != (var6 ^ -1)) {
                        var5.field_n = (byte)(1 + var6);
                        break L5;
                      } else {
                        var5.field_d = null;
                        break L5;
                      }
                    } else {
                      if (var6 < (var5.field_d[var7] & 255)) {
                        var6 = var5.field_d[var7] & 255;
                        var7++;
                        continue L6;
                      } else {
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = (ma) (var5);
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("sa.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    public static void b(int param0) {
        ma discarded$0 = null;
        field_l = null;
        if (param0 != 0) {
            pf var2 = (pf) null;
            discarded$0 = sa.a(true, (pf) null);
        }
    }

    final static void c(int param0) {
        ud.a(nia.d(-31768), (byte) 95);
        if (param0 >= -82) {
            sa.b(116);
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        pf var1_ref = null;
        int var2 = 0;
        Object var3_ref = null;
        ema var3_ref_ema = null;
        long var3_long = 0L;
        int var3 = 0;
        uha var4_ref_uha = null;
        int var4 = 0;
        int var5 = 0;
        ema var7 = null;
        ema var8_ref_ema = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uha var13 = null;
        uha var14 = null;
        uha var15 = null;
        Object var16 = null;
        String var17 = null;
        ema var18 = null;
        String var19 = null;
        String var20 = null;
        ema var21 = null;
        ema var22 = null;
        ema var23 = null;
        ema var24 = null;
        String var25 = null;
        String var26 = null;
        Object var27 = null;
        uha var27_ref = null;
        uha var28 = null;
        uha var29 = null;
        int stackIn_12_0 = 0;
        ema stackIn_18_0 = null;
        ema stackIn_19_0 = null;
        ema stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ema stackIn_94_0 = null;
        ema stackIn_95_0 = null;
        ema stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ema stackOut_93_0 = null;
        ema stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        ema stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        ema stackOut_17_0 = null;
        ema stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ema stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        var16 = null;
        var27 = null;
        var3_ref = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var1_ref = ig.field_m;
              if (param0 == -7) {
                break L1;
              } else {
                sa.c(41);
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = ((lu) ((Object) var1_ref)).b(16711935);
                if (var2 == 0) {
                  break L3;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L3;
                  } else {
                    if (2 == var2) {
                      break L3;
                    } else {
                      if ((var2 ^ -1) == -4) {
                        break L3;
                      } else {
                        if ((var2 ^ -1) == -5) {
                          break L3;
                        } else {
                          if (-6 != (var2 ^ -1)) {
                            if ((var2 ^ -1) != -7) {
                              if ((var2 ^ -1) == -8) {
                                var3_ref_ema = (ema) ((Object) aa.field_l.b((byte) 90));
                                L4: while (true) {
                                  if (var3_ref_ema == null) {
                                    hc.field_J = 0;
                                    break L2;
                                  } else {
                                    var3_ref_ema.a(false);
                                    var3_ref_ema.b(0);
                                    var3_ref_ema = (ema) ((Object) aa.field_l.c(param0 + 7));
                                    continue L4;
                                  }
                                }
                              } else {
                                if (var2 != 8) {
                                  if (-10 != (var2 ^ -1)) {
                                    if (-11 != (var2 ^ -1)) {
                                      L5: {
                                        if (var2 == 11) {
                                          break L5;
                                        } else {
                                          if ((var2 ^ -1) == -13) {
                                            break L5;
                                          } else {
                                            if (var2 == 13) {
                                              var3 = ((lu) ((Object) var1_ref)).e((byte) 100);
                                              var4 = ((lu) ((Object) var1_ref)).b(16711935);
                                              var27_ref = (uha) ((Object) ola.field_g.a((long)var3, (byte) -87));
                                              if (var27_ref != null) {
                                                L6: {
                                                  var27_ref.field_gc = false;
                                                  var13 = var27_ref;
                                                  var13.field_Wb = false;
                                                  if (var4 != 0) {
                                                    var27_ref.field_Mb = kla.field_x;
                                                    var27_ref.field_ec = var4;
                                                    break L6;
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                                h.a(var27_ref, 0);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              L7: {
                                                if ((var2 ^ -1) == -15) {
                                                  break L7;
                                                } else {
                                                  if (-17 != (var2 ^ -1)) {
                                                    L8: {
                                                      if (var2 == 15) {
                                                        break L8;
                                                      } else {
                                                        if (-18 != (var2 ^ -1)) {
                                                          if ((var2 ^ -1) == -19) {
                                                            L9: {
                                                              var3_long = ((lu) ((Object) var1_ref)).c(param0 + -112);
                                                              var25 = ((lu) ((Object) var1_ref)).g(param0 ^ -55);
                                                              var26 = ((lu) ((Object) var1_ref)).g(param0 + -26);
                                                              var7 = uka.a(var3_long, 28791);
                                                              if (var7 == null) {
                                                                var7 = new ema(var25, var26, var3_long);
                                                                wi.field_i.a(var7, param0 + 98, var3_long);
                                                                pw.field_w.field_Rb = pw.field_w.field_Rb + 1;
                                                                break L9;
                                                              } else {
                                                                break L9;
                                                              }
                                                            }
                                                            L10: {
                                                              var7.field_Jb = ((lu) ((Object) var1_ref)).e((byte) 106);
                                                              var8 = ((lu) ((Object) var1_ref)).d(param0 + 6);
                                                              var7.field_Gb = var8 >> 452760097;
                                                              stackOut_93_0 = (ema) (var7);
                                                              stackIn_95_0 = stackOut_93_0;
                                                              stackIn_94_0 = stackOut_93_0;
                                                              if (0 == (var8 & 1)) {
                                                                stackOut_95_0 = (ema) ((Object) stackIn_95_0);
                                                                stackOut_95_1 = 0;
                                                                stackIn_96_0 = stackOut_95_0;
                                                                stackIn_96_1 = stackOut_95_1;
                                                                break L10;
                                                              } else {
                                                                stackOut_94_0 = (ema) ((Object) stackIn_94_0);
                                                                stackOut_94_1 = 1;
                                                                stackIn_96_0 = stackOut_94_0;
                                                                stackIn_96_1 = stackOut_94_1;
                                                                break L10;
                                                              }
                                                            }
                                                            stackIn_96_0.field_zb = stackIn_96_1 != 0;
                                                            var7.field_Kb = ((lu) ((Object) var1_ref)).b(16711935);
                                                            var7.field_xb = ((lu) ((Object) var1_ref)).b(param0 + 16711942);
                                                            bia.field_g.a(var7, true);
                                                            break L2;
                                                          } else {
                                                            if (19 == var2) {
                                                              var3_long = ((lu) ((Object) var1_ref)).c(-111);
                                                              var5 = ((lu) ((Object) var1_ref)).b(16711935);
                                                              var24 = uka.a(var3_long, param0 ^ -28786);
                                                              if (var24 == null) {
                                                                break L2;
                                                              } else {
                                                                L11: {
                                                                  if (-1 != (var5 ^ -1)) {
                                                                    var24.field_yb = var5;
                                                                    var24.field_Mb = kla.field_x;
                                                                    break L11;
                                                                  } else {
                                                                    var24.a(false);
                                                                    break L11;
                                                                  }
                                                                }
                                                                var24.b(0);
                                                                pw.field_w.field_Rb = pw.field_w.field_Rb - 1;
                                                                break L2;
                                                              }
                                                            } else {
                                                              if ((var2 ^ -1) != -21) {
                                                                if ((var2 ^ -1) != -22) {
                                                                  if ((var2 ^ -1) != -23) {
                                                                    if ((var2 ^ -1) != -24) {
                                                                      cv.a(1, "L1: " + nia.d((byte) -106), (Throwable) null);
                                                                      vc.a((byte) -78);
                                                                      break L2;
                                                                    } else {
                                                                      ge.field_F = ((lu) ((Object) var1_ref)).c(param0 ^ 108);
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    wk.field_a = ((lu) ((Object) var1_ref)).e((byte) 48);
                                                                    ui.field_q = ((lu) ((Object) var1_ref)).d(-1);
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var3 = ((lu) ((Object) var1_ref)).e((byte) 51);
                                                                  if (-1 != (var3 ^ -1)) {
                                                                    wda.field_a = (long)var3 + f.b((byte) 73);
                                                                    break L2;
                                                                  } else {
                                                                    wda.field_a = 0L;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                cja.a(pw.field_w, var1_ref, 125, false);
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    var3_long = ((lu) ((Object) var1_ref)).c(param0 + -103);
                                                    var5 = ((lu) ((Object) var1_ref)).b(16711935);
                                                    var23 = gf.a(var3_long, false);
                                                    if (var23 == null) {
                                                      break L2;
                                                    } else {
                                                      L12: {
                                                        if (15 == var2) {
                                                          var23.field_wb = false;
                                                          break L12;
                                                        } else {
                                                          if (var23.field_Ob) {
                                                            hc.field_J = hc.field_J - 1;
                                                            var23.field_Ob = false;
                                                            break L12;
                                                          } else {
                                                            break L12;
                                                          }
                                                        }
                                                      }
                                                      L13: {
                                                        if (0 != var5) {
                                                          var23.field_Mb = kla.field_x;
                                                          var23.field_yb = var5;
                                                          break L13;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                      gj.a((byte) 63, var23);
                                                      break L2;
                                                    }
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                              }
                                              var3_long = ((lu) ((Object) var1_ref)).c(param0 + -95);
                                              var22 = gf.a(var3_long, false);
                                              if (var22 == null) {
                                                break L2;
                                              } else {
                                                L14: {
                                                  if ((var2 ^ -1) != -15) {
                                                    if (!var22.field_Ob) {
                                                      var22.field_Ob = true;
                                                      hc.field_J = hc.field_J + 1;
                                                      break L14;
                                                    } else {
                                                      break L14;
                                                    }
                                                  } else {
                                                    var22.field_wb = true;
                                                    break L14;
                                                  }
                                                }
                                                gj.a((byte) 56, var22);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3 = ((lu) ((Object) var1_ref)).e((byte) 72);
                                      var14 = (uha) ((Object) ola.field_g.a((long)var3, (byte) -87));
                                      var28 = var14;
                                      if (var14 != null) {
                                        L15: {
                                          if (11 != var2) {
                                            var28.field_gc = true;
                                            break L15;
                                          } else {
                                            var14.field_Wb = true;
                                            break L15;
                                          }
                                        }
                                        h.a(var28, 0);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      var29 = (uha) ((Object) uma.field_M.b((byte) 90));
                                      L16: while (true) {
                                        if (var29 == null) {
                                          break L2;
                                        } else {
                                          var29.a(false);
                                          var29.b(0);
                                          var29 = (uha) ((Object) uma.field_M.c(0));
                                          continue L16;
                                        }
                                      }
                                    }
                                  } else {
                                    var3 = ((lu) ((Object) var1_ref)).e((byte) 54);
                                    var4 = ((lu) ((Object) var1_ref)).b(16711935);
                                    var15 = (uha) ((Object) ola.field_g.a((long)var3, (byte) -87));
                                    if (var15 == null) {
                                      break L2;
                                    } else {
                                      L17: {
                                        if (var4 != 0) {
                                          var15.field_Mb = kla.field_x;
                                          var15.field_ec = var4;
                                          break L17;
                                        } else {
                                          var15.a(false);
                                          break L17;
                                        }
                                      }
                                      var15.b(0);
                                      break L2;
                                    }
                                  }
                                } else {
                                  L18: {
                                    var3 = ((lu) ((Object) var1_ref)).e((byte) 97);
                                    var4_ref_uha = (uha) ((Object) ola.field_g.a((long)var3, (byte) -87));
                                    if (var4_ref_uha == null) {
                                      var4_ref_uha = new uha(ld.field_q);
                                      ola.field_g.a(var4_ref_uha, 91, (long)var3);
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  cja.a(var4_ref_uha, var1_ref, 80, true);
                                  h.a(var4_ref_uha, 0);
                                  break L2;
                                }
                              }
                            } else {
                              var3_long = ((lu) ((Object) var1_ref)).c(param0 ^ 106);
                              var5 = ((lu) ((Object) var1_ref)).b(param0 ^ -16711930);
                              var21 = gf.a(var3_long, false);
                              if (var21 != null) {
                                L19: {
                                  if (!var21.field_Ob) {
                                    break L19;
                                  } else {
                                    var21.field_Ob = false;
                                    hc.field_J = hc.field_J - 1;
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (var5 == 0) {
                                    var21.a(false);
                                    break L20;
                                  } else {
                                    var21.field_Mb = kla.field_x;
                                    var21.field_yb = var5;
                                    break L20;
                                  }
                                }
                                var21.b(param0 ^ -7);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          } else {
                            L21: {
                              var3_long = ((lu) ((Object) var1_ref)).c(-124);
                              var19 = ((lu) ((Object) var1_ref)).g(113);
                              var17 = ((lu) ((Object) var1_ref)).g(65);
                              var20 = ((lu) ((Object) var1_ref)).g(-70);
                              var18 = gf.a(var3_long, false);
                              var8_ref_ema = var18;
                              if (var17.equals("")) {
                                stackOut_11_0 = 0;
                                stackIn_12_0 = stackOut_11_0;
                                break L21;
                              } else {
                                stackOut_10_0 = 1;
                                stackIn_12_0 = stackOut_10_0;
                                break L21;
                              }
                            }
                            L22: {
                              var9 = stackIn_12_0;
                              if (var18 == null) {
                                var8_ref_ema = new ema(var19, var20, var3_long);
                                iga.field_c.a(var8_ref_ema, param0 + 98, var3_long);
                                break L22;
                              } else {
                                if (var9 != 0) {
                                  var18.a(var19, param0 + 7, var20);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              var8_ref_ema.field_Cb = f.b((byte) 73) - (long)((lu) ((Object) var1_ref)).f(-59);
                              var8_ref_ema.field_Jb = ((lu) ((Object) var1_ref)).e((byte) 68);
                              var10 = ((lu) ((Object) var1_ref)).d(-1);
                              stackOut_17_0 = (ema) (var8_ref_ema);
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (-1 == (var10 & 1 ^ -1)) {
                                stackOut_19_0 = (ema) ((Object) stackIn_19_0);
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L23;
                              } else {
                                stackOut_18_0 = (ema) ((Object) stackIn_18_0);
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L23;
                              }
                            }
                            stackIn_20_0.field_zb = stackIn_20_1 != 0;
                            var8_ref_ema.field_Gb = var10 >> -1784389311;
                            var8_ref_ema.field_Kb = ((lu) ((Object) var1_ref)).b(param0 ^ -16711930);
                            var8_ref_ema.field_xb = ((lu) ((Object) var1_ref)).b(16711935);
                            gj.a((byte) 101, var8_ref_ema);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_ema = (ema) ((Object) bia.field_g.b((byte) 90));
              L24: while (true) {
                if (var3_ref_ema == null) {
                  var3_ref_ema = (ema) ((Object) iga.field_c.b((byte) -73));
                  L25: while (true) {
                    if (var3_ref_ema == null) {
                      L26: {
                        if ((var2 ^ -1) != -2) {
                          break L26;
                        } else {
                          if (null == pw.field_w) {
                            break L26;
                          } else {
                            ur.field_b = pw.field_w.field_Jb;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if ((var2 ^ -1) == -5) {
                          var3 = ((lu) ((Object) var1_ref)).e((byte) 45);
                          pw.field_w = new uha(ld.field_q);
                          pw.field_w.a(true, (long)var3);
                          cja.a(pw.field_w, var1_ref, 54, false);
                          wda.field_a = 0L;
                          break L27;
                        } else {
                          pw.field_w = null;
                          break L27;
                        }
                      }
                      L28: {
                        L29: {
                          if (-3 == (var2 ^ -1)) {
                            break L29;
                          } else {
                            if ((var2 ^ -1) != -4) {
                              rv.field_n = null;
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        if (null != rv.field_n) {
                          break L28;
                        } else {
                          rv.field_n = new uha(ld.field_q);
                          break L28;
                        }
                      }
                      if (-4 == (var2 ^ -1)) {
                        ce.field_y = true;
                        var3 = 0;
                        L30: while (true) {
                          if (fia.field_r.length <= var3) {
                            tq.field_h = ((lu) ((Object) var1_ref)).b(16711935);
                            ena.field_n = ((lu) ((Object) var1_ref)).b(16711935);
                            var3 = 0;
                            L31: while (true) {
                              if (var3 >= sca.field_c.length) {
                                break L2;
                              } else {
                                sca.field_c[var3] = ((lu) ((Object) var1_ref)).b(true);
                                var3++;
                                continue L31;
                              }
                            }
                          } else {
                            fia.field_r[var3] = ((lu) ((Object) var1_ref)).b(true);
                            var3++;
                            continue L30;
                          }
                        }
                      } else {
                        ce.field_y = false;
                        break L2;
                      }
                    } else {
                      L32: {
                        L33: {
                          if (var3_ref_ema.field_wb) {
                            break L33;
                          } else {
                            if (!var3_ref_ema.field_Ob) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        L34: {
                          if (!var3_ref_ema.field_Ob) {
                            break L34;
                          } else {
                            var3_ref_ema.field_Ob = false;
                            hc.field_J = hc.field_J - 1;
                            break L34;
                          }
                        }
                        var3_ref_ema.field_wb = false;
                        gj.a((byte) 38, var3_ref_ema);
                        break L32;
                      }
                      var3_ref_ema = (ema) ((Object) iga.field_c.a(param0 + -25170));
                      continue L25;
                    }
                  }
                } else {
                  var3_ref_ema.a(false);
                  var3_ref_ema.b(0);
                  var3_ref_ema = (ema) ((Object) bia.field_g.c(0));
                  continue L24;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "sa.B(" + param0 + ')');
        }
    }

    static {
        field_l = "This entry doesn't match";
    }
}
