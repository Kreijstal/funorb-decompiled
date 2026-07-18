/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pu {
    static String field_l;

    final static ma a(boolean param0, pf param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ma var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
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
                  var9 = null;
                  ma discarded$22 = sa.a(true, (pf) null);
                  break L1;
                }
              }
              L2: {
                var5.field_g = (short)param1.d(16, (byte) 121);
                int discarded$23 = 16;
                var5.field_x = as.a(var5.field_x, 127, param1);
                int discarded$24 = 16;
                var5.field_O = as.a(var5.field_O, 99, param1);
                int discarded$25 = 16;
                var5.field_r = as.a(var5.field_r, 102, param1);
                var5.field_K = (short)param1.d(16, (byte) -64);
                int discarded$26 = 16;
                var5.field_C = as.a(var5.field_C, 82, param1);
                int discarded$27 = 16;
                var5.field_h = as.a(var5.field_h, 123, param1);
                int discarded$28 = 16;
                var5.field_t = as.a(var5.field_t, 88, param1);
                if (var3 == 0) {
                  break L2;
                } else {
                  var5.field_i = (short)param1.d(16, (byte) 51);
                  int discarded$29 = 16;
                  var5.field_f = as.a(var5.field_f, 122, param1);
                  int discarded$30 = 16;
                  var5.field_N = as.a(var5.field_N, 75, param1);
                  int discarded$31 = 16;
                  var5.field_b = as.a(var5.field_b, 93, param1);
                  int discarded$32 = 16;
                  var5.field_F = as.a(var5.field_F, 96, param1);
                  int discarded$33 = 16;
                  var5.field_c = as.a(var5.field_c, 60, param1);
                  int discarded$34 = 16;
                  var5.field_e = as.a(var5.field_e, 83, param1);
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  int discarded$35 = param1.d(16, (byte) -85);
                  int discarded$36 = 16;
                  var5.field_y = as.a(var5.field_y, 90, param1);
                  int discarded$37 = 16;
                  var5.field_m = as.a(var5.field_m, 59, param1);
                  int discarded$38 = 16;
                  var5.field_l = as.a(var5.field_l, 97, param1);
                  int discarded$39 = 16;
                  var5.field_H = as.a(var5.field_H, 96, param1);
                  int discarded$40 = 16;
                  var5.field_v = as.a(var5.field_v, 75, param1);
                  break L3;
                }
              }
              L4: {
                if (!fa.a((byte) -75, param1)) {
                  break L4;
                } else {
                  int discarded$41 = 16;
                  var5.field_w = as.a(var5.field_w, 81, param1);
                  break L4;
                }
              }
              L5: {
                if (!fa.a((byte) -75, param1)) {
                  break L5;
                } else {
                  int discarded$42 = 16;
                  int discarded$43 = 103;
                  var5.field_d = hd.a(var5.field_d, param1);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_d.length) {
                      if (var6 != 0) {
                        var5.field_n = (byte)(1 + var6);
                        break L5;
                      } else {
                        var5.field_d = null;
                        break L5;
                      }
                    } else {
                      L7: {
                        if (var6 >= (var5.field_d[var7] & 255)) {
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_20_0 = (ma) var5;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("sa.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    public static void b() {
        field_l = null;
    }

    final static void c() {
        ud.a(nia.d(-31768), (byte) 95);
    }

    final static void d() {
        RuntimeException var1 = null;
        pf var1_ref = null;
        int var2 = 0;
        Object var3_ref = null;
        ema var3_ref_ema = null;
        long var3_long = 0L;
        int var3 = 0;
        uha var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        uha var5_ref = null;
        ema var5_ref2 = null;
        String var6 = null;
        ema var6_ref = null;
        String var7 = null;
        ema var7_ref = null;
        ema var8_ref_ema = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uha var13 = null;
        uha var14 = null;
        uha var15 = null;
        Object var16 = null;
        uha var17 = null;
        int stackIn_10_0 = 0;
        ema stackIn_16_0 = null;
        ema stackIn_17_0 = null;
        ema stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ema stackIn_96_0 = null;
        ema stackIn_97_0 = null;
        ema stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ema stackOut_95_0 = null;
        ema stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        ema stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        ema stackOut_15_0 = null;
        ema stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ema stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        var16 = null;
        var3_ref = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var1_ref = ig.field_m;
                  var2 = ((lu) (Object) var1_ref).b(16711935);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (2 == var2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (var2 == 4) {
                            break L3;
                          } else {
                            if (var2 != 5) {
                              if (var2 != 6) {
                                if (var2 == 7) {
                                  var3_ref_ema = (ema) (Object) aa.field_l.b((byte) 90);
                                  L4: while (true) {
                                    if (var3_ref_ema == null) {
                                      hc.field_J = 0;
                                      break L1;
                                    } else {
                                      var3_ref_ema.a(false);
                                      var3_ref_ema.b(0);
                                      var3_ref_ema = (ema) (Object) aa.field_l.c(0);
                                      continue L4;
                                    }
                                  }
                                } else {
                                  if (var2 != 8) {
                                    if (var2 != 9) {
                                      if (var2 != 10) {
                                        L5: {
                                          if (var2 == 11) {
                                            break L5;
                                          } else {
                                            if (var2 == 12) {
                                              break L5;
                                            } else {
                                              if (var2 == 13) {
                                                var3 = ((lu) (Object) var1_ref).e((byte) 100);
                                                var4_int = ((lu) (Object) var1_ref).b(16711935);
                                                var5_ref = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                                if (var5_ref != null) {
                                                  L6: {
                                                    var5_ref.field_gc = false;
                                                    var13 = var5_ref;
                                                    var13.field_Wb = false;
                                                    if (var4_int != 0) {
                                                      var5_ref.field_Mb = kla.field_x;
                                                      var5_ref.field_ec = var4_int;
                                                      break L6;
                                                    } else {
                                                      break L6;
                                                    }
                                                  }
                                                  int discarded$9 = 0;
                                                  h.a(var5_ref);
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              } else {
                                                L7: {
                                                  if (var2 == 14) {
                                                    break L7;
                                                  } else {
                                                    if (var2 != 16) {
                                                      L8: {
                                                        if (var2 == 15) {
                                                          break L8;
                                                        } else {
                                                          if (var2 != 17) {
                                                            if (var2 == 18) {
                                                              L9: {
                                                                var3_long = ((lu) (Object) var1_ref).c(-119);
                                                                var5 = ((lu) (Object) var1_ref).g(48);
                                                                var6 = ((lu) (Object) var1_ref).g(-33);
                                                                int discarded$10 = 28791;
                                                                var7_ref = uka.a(var3_long);
                                                                if (var7_ref == null) {
                                                                  var7_ref = new ema(var5, var6, var3_long);
                                                                  wi.field_i.a((eo) (Object) var7_ref, 91, var3_long);
                                                                  pw.field_w.field_Rb = pw.field_w.field_Rb + 1;
                                                                  break L9;
                                                                } else {
                                                                  break L9;
                                                                }
                                                              }
                                                              L10: {
                                                                var7_ref.field_Jb = ((lu) (Object) var1_ref).e((byte) 106);
                                                                var8 = ((lu) (Object) var1_ref).d(-1);
                                                                var7_ref.field_Gb = var8 >> 1;
                                                                stackOut_95_0 = (ema) var7_ref;
                                                                stackIn_97_0 = stackOut_95_0;
                                                                stackIn_96_0 = stackOut_95_0;
                                                                if (0 == (var8 & 1)) {
                                                                  stackOut_97_0 = (ema) (Object) stackIn_97_0;
                                                                  stackOut_97_1 = 0;
                                                                  stackIn_98_0 = stackOut_97_0;
                                                                  stackIn_98_1 = stackOut_97_1;
                                                                  break L10;
                                                                } else {
                                                                  stackOut_96_0 = (ema) (Object) stackIn_96_0;
                                                                  stackOut_96_1 = 1;
                                                                  stackIn_98_0 = stackOut_96_0;
                                                                  stackIn_98_1 = stackOut_96_1;
                                                                  break L10;
                                                                }
                                                              }
                                                              stackIn_98_0.field_zb = stackIn_98_1 != 0;
                                                              var7_ref.field_Kb = ((lu) (Object) var1_ref).b(16711935);
                                                              var7_ref.field_xb = ((lu) (Object) var1_ref).b(16711935);
                                                              bia.field_g.a((bw) (Object) var7_ref, true);
                                                              break L1;
                                                            } else {
                                                              if (19 == var2) {
                                                                L11: {
                                                                  var3_long = ((lu) (Object) var1_ref).c(-111);
                                                                  var5_int = ((lu) (Object) var1_ref).b(16711935);
                                                                  int discarded$11 = 28791;
                                                                  var6_ref = uka.a(var3_long);
                                                                  if (var6_ref == null) {
                                                                    break L11;
                                                                  } else {
                                                                    L12: {
                                                                      if (var5_int != 0) {
                                                                        var6_ref.field_yb = var5_int;
                                                                        var6_ref.field_Mb = kla.field_x;
                                                                        break L12;
                                                                      } else {
                                                                        var6_ref.a(false);
                                                                        break L12;
                                                                      }
                                                                    }
                                                                    var6_ref.b(0);
                                                                    pw.field_w.field_Rb = pw.field_w.field_Rb - 1;
                                                                    break L11;
                                                                  }
                                                                }
                                                                break L1;
                                                              } else {
                                                                if (var2 != 20) {
                                                                  if (var2 != 21) {
                                                                    if (var2 != 22) {
                                                                      if (var2 != 23) {
                                                                        cv.a(1, "L1: " + nia.d((byte) -106), (Throwable) null);
                                                                        vc.a((byte) -78);
                                                                        break L1;
                                                                      } else {
                                                                        ge.field_F = ((lu) (Object) var1_ref).c(-107);
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      wk.field_a = ((lu) (Object) var1_ref).e((byte) 48);
                                                                      ui.field_q = ((lu) (Object) var1_ref).d(-1);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var3 = ((lu) (Object) var1_ref).e((byte) 51);
                                                                    if (var3 != 0) {
                                                                      wda.field_a = (long)var3 + f.b((byte) 73);
                                                                      break L1;
                                                                    } else {
                                                                      wda.field_a = 0L;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  cja.a(pw.field_w, (lu) (Object) var1_ref, 125, false);
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                      L13: {
                                                        var3_long = ((lu) (Object) var1_ref).c(-110);
                                                        var5_int = ((lu) (Object) var1_ref).b(16711935);
                                                        int discarded$12 = 0;
                                                        var6_ref = gf.a(var3_long);
                                                        if (var6_ref == null) {
                                                          break L13;
                                                        } else {
                                                          L14: {
                                                            if (15 == var2) {
                                                              var6_ref.field_wb = false;
                                                              break L14;
                                                            } else {
                                                              if (var6_ref.field_Ob) {
                                                                hc.field_J = hc.field_J - 1;
                                                                var6_ref.field_Ob = false;
                                                                break L14;
                                                              } else {
                                                                break L14;
                                                              }
                                                            }
                                                          }
                                                          L15: {
                                                            if (0 != var5_int) {
                                                              var6_ref.field_Mb = kla.field_x;
                                                              var6_ref.field_yb = var5_int;
                                                              break L15;
                                                            } else {
                                                              break L15;
                                                            }
                                                          }
                                                          gj.a((byte) 63, var6_ref);
                                                          break L13;
                                                        }
                                                      }
                                                      break L1;
                                                    } else {
                                                      break L7;
                                                    }
                                                  }
                                                }
                                                L16: {
                                                  var3_long = ((lu) (Object) var1_ref).c(-102);
                                                  int discarded$13 = 0;
                                                  var5_ref2 = gf.a(var3_long);
                                                  if (var5_ref2 == null) {
                                                    break L16;
                                                  } else {
                                                    L17: {
                                                      if (var2 != 14) {
                                                        if (!var5_ref2.field_Ob) {
                                                          var5_ref2.field_Ob = true;
                                                          hc.field_J = hc.field_J + 1;
                                                          break L17;
                                                        } else {
                                                          break L17;
                                                        }
                                                      } else {
                                                        var5_ref2.field_wb = true;
                                                        break L17;
                                                      }
                                                    }
                                                    gj.a((byte) 56, var5_ref2);
                                                    break L16;
                                                  }
                                                }
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                        var3 = ((lu) (Object) var1_ref).e((byte) 72);
                                        var14 = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                        var4 = var14;
                                        if (var14 != null) {
                                          L18: {
                                            if (11 != var2) {
                                              var4.field_gc = true;
                                              break L18;
                                            } else {
                                              var14.field_Wb = true;
                                              break L18;
                                            }
                                          }
                                          int discarded$14 = 0;
                                          h.a(var4);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        var17 = (uha) (Object) uma.field_M.b((byte) 90);
                                        L19: while (true) {
                                          if (var17 == null) {
                                            break L2;
                                          } else {
                                            var17.a(false);
                                            var17.b(0);
                                            var17 = (uha) (Object) uma.field_M.c(0);
                                            continue L19;
                                          }
                                        }
                                      }
                                    } else {
                                      L20: {
                                        var3 = ((lu) (Object) var1_ref).e((byte) 54);
                                        var4_int = ((lu) (Object) var1_ref).b(16711935);
                                        var15 = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                        if (var15 == null) {
                                          break L20;
                                        } else {
                                          L21: {
                                            if (var4_int != 0) {
                                              var15.field_Mb = kla.field_x;
                                              var15.field_ec = var4_int;
                                              break L21;
                                            } else {
                                              var15.a(false);
                                              break L21;
                                            }
                                          }
                                          var15.b(0);
                                          break L20;
                                        }
                                      }
                                      break L1;
                                    }
                                  } else {
                                    L22: {
                                      var3 = ((lu) (Object) var1_ref).e((byte) 97);
                                      var4 = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                      if (var4 == null) {
                                        var4 = new uha(ld.field_q);
                                        ola.field_g.a((eo) (Object) var4, 91, (long)var3);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    cja.a(var4, (lu) (Object) var1_ref, 80, true);
                                    int discarded$15 = 0;
                                    h.a(var4);
                                    break L1;
                                  }
                                }
                              } else {
                                var3_long = ((lu) (Object) var1_ref).c(-109);
                                var5_int = ((lu) (Object) var1_ref).b(16711935);
                                int discarded$16 = 0;
                                var6_ref = gf.a(var3_long);
                                if (var6_ref != null) {
                                  L23: {
                                    if (!var6_ref.field_Ob) {
                                      break L23;
                                    } else {
                                      var6_ref.field_Ob = false;
                                      hc.field_J = hc.field_J - 1;
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    if (var5_int == 0) {
                                      var6_ref.a(false);
                                      break L24;
                                    } else {
                                      var6_ref.field_Mb = kla.field_x;
                                      var6_ref.field_yb = var5_int;
                                      break L24;
                                    }
                                  }
                                  var6_ref.b(0);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              L25: {
                                var3_long = ((lu) (Object) var1_ref).c(-124);
                                var5 = ((lu) (Object) var1_ref).g(113);
                                var6 = ((lu) (Object) var1_ref).g(65);
                                var7 = ((lu) (Object) var1_ref).g(-70);
                                int discarded$17 = 0;
                                var8_ref_ema = gf.a(var3_long);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_9_0 = 0;
                                  stackIn_10_0 = stackOut_9_0;
                                  break L25;
                                } else {
                                  stackOut_8_0 = 1;
                                  stackIn_10_0 = stackOut_8_0;
                                  break L25;
                                }
                              }
                              L26: {
                                var9 = stackIn_10_0;
                                if (var8_ref_ema == null) {
                                  var8_ref_ema = new ema(var5, var7, var3_long);
                                  iga.field_c.a((eo) (Object) var8_ref_ema, 91, var3_long);
                                  break L26;
                                } else {
                                  if (var9 != 0) {
                                    var8_ref_ema.a(var5, 0, var7);
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L27: {
                                var8_ref_ema.field_Cb = f.b((byte) 73) - (long)((lu) (Object) var1_ref).f(-59);
                                var8_ref_ema.field_Jb = ((lu) (Object) var1_ref).e((byte) 68);
                                var10 = ((lu) (Object) var1_ref).d(-1);
                                stackOut_15_0 = (ema) var8_ref_ema;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_16_0 = stackOut_15_0;
                                if ((var10 & 1) == 0) {
                                  stackOut_17_0 = (ema) (Object) stackIn_17_0;
                                  stackOut_17_1 = 0;
                                  stackIn_18_0 = stackOut_17_0;
                                  stackIn_18_1 = stackOut_17_1;
                                  break L27;
                                } else {
                                  stackOut_16_0 = (ema) (Object) stackIn_16_0;
                                  stackOut_16_1 = 1;
                                  stackIn_18_0 = stackOut_16_0;
                                  stackIn_18_1 = stackOut_16_1;
                                  break L27;
                                }
                              }
                              stackIn_18_0.field_zb = stackIn_18_1 != 0;
                              var8_ref_ema.field_Gb = var10 >> 1;
                              var8_ref_ema.field_Kb = ((lu) (Object) var1_ref).b(16711935);
                              var8_ref_ema.field_xb = ((lu) (Object) var1_ref).b(16711935);
                              gj.a((byte) 101, var8_ref_ema);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_ema = (ema) (Object) bia.field_g.b((byte) 90);
                L28: while (true) {
                  if (var3_ref_ema == null) {
                    var3_ref_ema = (ema) (Object) iga.field_c.b((byte) -73);
                    L29: while (true) {
                      if (var3_ref_ema == null) {
                        L30: {
                          if (var2 != 1) {
                            break L30;
                          } else {
                            if (null == pw.field_w) {
                              break L30;
                            } else {
                              ur.field_b = pw.field_w.field_Jb;
                              break L30;
                            }
                          }
                        }
                        L31: {
                          if (var2 == 4) {
                            var3 = ((lu) (Object) var1_ref).e((byte) 45);
                            pw.field_w = new uha(ld.field_q);
                            pw.field_w.a(true, (long)var3);
                            cja.a(pw.field_w, (lu) (Object) var1_ref, 54, false);
                            wda.field_a = 0L;
                            break L31;
                          } else {
                            pw.field_w = null;
                            break L31;
                          }
                        }
                        L32: {
                          L33: {
                            if (var2 == 2) {
                              break L33;
                            } else {
                              if (var2 != 3) {
                                rv.field_n = null;
                                break L32;
                              } else {
                                break L33;
                              }
                            }
                          }
                          if (null != rv.field_n) {
                            break L32;
                          } else {
                            rv.field_n = new uha(ld.field_q);
                            break L32;
                          }
                        }
                        if (var2 == 3) {
                          ce.field_y = true;
                          var3 = 0;
                          L34: while (true) {
                            if (~fia.field_r.length >= ~var3) {
                              tq.field_h = ((lu) (Object) var1_ref).b(16711935);
                              ena.field_n = ((lu) (Object) var1_ref).b(16711935);
                              var3 = 0;
                              L35: while (true) {
                                if (~var3 <= ~sca.field_c.length) {
                                  break L2;
                                } else {
                                  sca.field_c[var3] = ((lu) (Object) var1_ref).b(true);
                                  var3++;
                                  continue L35;
                                }
                              }
                            } else {
                              fia.field_r[var3] = ((lu) (Object) var1_ref).b(true);
                              var3++;
                              continue L34;
                            }
                          }
                        } else {
                          ce.field_y = false;
                          break L1;
                        }
                      } else {
                        L36: {
                          L37: {
                            if (var3_ref_ema.field_wb) {
                              break L37;
                            } else {
                              if (!var3_ref_ema.field_Ob) {
                                break L36;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (!var3_ref_ema.field_Ob) {
                              break L38;
                            } else {
                              var3_ref_ema.field_Ob = false;
                              hc.field_J = hc.field_J - 1;
                              break L38;
                            }
                          }
                          var3_ref_ema.field_wb = false;
                          gj.a((byte) 38, var3_ref_ema);
                          break L36;
                        }
                        var3_ref_ema = (ema) (Object) iga.field_c.a(-25177);
                        continue L29;
                      }
                    }
                  } else {
                    var3_ref_ema.a(false);
                    var3_ref_ema.b(0);
                    var3_ref_ema = (ema) (Object) bia.field_g.c(0);
                    continue L28;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "sa.B(" + -7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This entry doesn't match";
    }
}
