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
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        ma stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        ma stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
                  ma discarded$2 = sa.a(true, (pf) null);
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
                  int discarded$3 = param1.d(16, (byte) -85);
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
                    L7: {
                      L8: {
                        if (var7 >= var5.field_d.length) {
                          break L8;
                        } else {
                          stackOut_14_0 = var6;
                          stackOut_14_1 = var5.field_d[var7] & 255;
                          stackIn_19_0 = stackOut_14_0;
                          stackIn_19_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (var8 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_15_0 >= stackIn_15_1) {
                                break L9;
                              } else {
                                var6 = var5.field_d[var7] & 255;
                                break L9;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_18_0 = -1;
                      stackOut_18_1 = ~var6;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L7;
                    }
                    L10: {
                      if (stackIn_19_0 != stackIn_19_1) {
                        break L10;
                      } else {
                        var5.field_d = null;
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var5.field_n = (byte)(1 + var6);
                    break L5;
                  }
                }
              }
              stackOut_23_0 = (ma) var5;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("sa.A(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return stackIn_24_0;
    }

    public static void b(int param0) {
        field_l = null;
        Object var2 = null;
        ma discarded$0 = sa.a(true, (pf) null);
    }

    final static void c(int param0) {
        ud.a(nia.d(-31768), (byte) 95);
        sa.b(116);
    }

    final static void d(int param0) {
        pf var1 = null;
        int var2 = 0;
        Object var3_ref = null;
        ema var3_ref_ema = null;
        long var3_long = 0L;
        int var3 = 0;
        uha var4_ref_uha = null;
        int var4 = 0;
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
        pf var13 = null;
        uha var14 = null;
        uha var15 = null;
        Object var16 = null;
        Object var17 = null;
        uha var18 = null;
        uha var19 = null;
        int stackIn_11_0 = 0;
        ema stackIn_17_0 = null;
        ema stackIn_18_0 = null;
        ema stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ema stackIn_111_0 = null;
        ema stackIn_112_0 = null;
        ema stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        boolean stackIn_145_0 = false;
        int stackIn_153_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        ema stackOut_16_0 = null;
        ema stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ema stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ema stackOut_110_0 = null;
        ema stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        ema stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        boolean stackOut_144_0 = false;
        int stackOut_152_0 = 0;
        L0: {
          var16 = null;
          var17 = null;
          var3_ref = null;
          var11 = BachelorFridge.field_y;
          var13 = ig.field_m;
          var1 = var13;
          if (param0 == -7) {
            break L0;
          } else {
            sa.c(41);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              var2 = ((lu) (Object) var1).b(16711935);
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
                        L4: {
                          if (var2 != 5) {
                            break L4;
                          } else {
                            L5: {
                              var3_long = ((lu) (Object) var1).c(-124);
                              var5 = ((lu) (Object) var1).g(113);
                              var6 = ((lu) (Object) var1).g(65);
                              var7 = ((lu) (Object) var1).g(-70);
                              var8_ref_ema = gf.a(var3_long, false);
                              if (var6.equals((Object) (Object) "")) {
                                stackOut_10_0 = 0;
                                stackIn_11_0 = stackOut_10_0;
                                break L5;
                              } else {
                                stackOut_9_0 = 1;
                                stackIn_11_0 = stackOut_9_0;
                                break L5;
                              }
                            }
                            L6: {
                              L7: {
                                var9 = stackIn_11_0;
                                if (var8_ref_ema == null) {
                                  break L7;
                                } else {
                                  if (var9 != 0) {
                                    var8_ref_ema.a(var5, param0 + 7, var7);
                                    if (var11 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var8_ref_ema = new ema(var5, var7, var3_long);
                              iga.field_c.a((eo) (Object) var8_ref_ema, param0 + 98, var3_long);
                              break L6;
                            }
                            L8: {
                              var8_ref_ema.field_Cb = f.b((byte) 73) - (long)((lu) (Object) var1).f(-59);
                              var8_ref_ema.field_Jb = ((lu) (Object) var1).e((byte) 68);
                              var10 = ((lu) (Object) var1).d(-1);
                              stackOut_16_0 = (ema) var8_ref_ema;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if ((var10 & 1) == 0) {
                                stackOut_18_0 = (ema) (Object) stackIn_18_0;
                                stackOut_18_1 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                break L8;
                              } else {
                                stackOut_17_0 = (ema) (Object) stackIn_17_0;
                                stackOut_17_1 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                break L8;
                              }
                            }
                            stackIn_19_0.field_zb = stackIn_19_1 != 0;
                            var8_ref_ema.field_Gb = var10 >> 1;
                            var8_ref_ema.field_Kb = ((lu) (Object) var1).b(param0 ^ -16711930);
                            var8_ref_ema.field_xb = ((lu) (Object) var1).b(16711935);
                            gj.a((byte) 101, var8_ref_ema);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L9: {
                          if (var2 != 6) {
                            break L9;
                          } else {
                            L10: {
                              var3_long = ((lu) (Object) var1).c(param0 ^ 106);
                              var5_int = ((lu) (Object) var1).b(param0 ^ -16711930);
                              var6_ref = gf.a(var3_long, false);
                              if (var6_ref != null) {
                                L11: {
                                  if (!var6_ref.field_Ob) {
                                    break L11;
                                  } else {
                                    var6_ref.field_Ob = false;
                                    hc.field_J = hc.field_J - 1;
                                    break L11;
                                  }
                                }
                                L12: {
                                  L13: {
                                    if (var5_int == 0) {
                                      break L13;
                                    } else {
                                      var6_ref.field_Mb = kla.field_x;
                                      var6_ref.field_yb = var5_int;
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var6_ref.a(false);
                                  break L12;
                                }
                                var6_ref.b(param0 ^ -7);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L14: {
                          if (var2 == 7) {
                            break L14;
                          } else {
                            L15: {
                              if (var2 != 8) {
                                break L15;
                              } else {
                                L16: {
                                  var3 = ((lu) (Object) var1).e((byte) 97);
                                  var4_ref_uha = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                  if (var4_ref_uha == null) {
                                    var4_ref_uha = new uha(ld.field_q);
                                    ola.field_g.a((eo) (Object) var4_ref_uha, 91, (long)var3);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                cja.a(var4_ref_uha, (lu) (Object) var1, 80, true);
                                h.a(var4_ref_uha, 0);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L17: {
                              if (var2 != 9) {
                                break L17;
                              } else {
                                L18: {
                                  var3 = ((lu) (Object) var1).e((byte) 54);
                                  var4 = ((lu) (Object) var1).b(16711935);
                                  var15 = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                  if (var15 == null) {
                                    break L18;
                                  } else {
                                    L19: {
                                      L20: {
                                        if (var4 != 0) {
                                          break L20;
                                        } else {
                                          var15.a(false);
                                          if (var11 == 0) {
                                            break L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      var15.field_Mb = kla.field_x;
                                      var15.field_ec = var4;
                                      break L19;
                                    }
                                    var15.b(0);
                                    break L18;
                                  }
                                }
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L21: {
                              if (var2 != 10) {
                                break L21;
                              } else {
                                var18 = (uha) (Object) uma.field_M.b((byte) 90);
                                L22: while (true) {
                                  L23: {
                                    if (var18 == null) {
                                      break L23;
                                    } else {
                                      var18.a(false);
                                      var18.b(0);
                                      var18 = (uha) (Object) uma.field_M.c(0);
                                      if (var11 != 0) {
                                        break L2;
                                      } else {
                                        if (var11 == 0) {
                                          continue L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            L24: {
                              if (var2 == 11) {
                                break L24;
                              } else {
                                if (var2 == 12) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (var2 == 13) {
                                      break L25;
                                    } else {
                                      L26: {
                                        L27: {
                                          if (var2 == 14) {
                                            break L27;
                                          } else {
                                            if (var2 != 16) {
                                              break L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        L28: {
                                          var3_long = ((lu) (Object) var1).c(param0 + -95);
                                          var5_ref2 = gf.a(var3_long, false);
                                          if (var5_ref2 == null) {
                                            break L28;
                                          } else {
                                            L29: {
                                              L30: {
                                                if (var2 != 14) {
                                                  break L30;
                                                } else {
                                                  var5_ref2.field_wb = true;
                                                  if (var11 == 0) {
                                                    break L29;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                              if (!var5_ref2.field_Ob) {
                                                var5_ref2.field_Ob = true;
                                                hc.field_J = hc.field_J + 1;
                                                break L29;
                                              } else {
                                                break L29;
                                              }
                                            }
                                            gj.a((byte) 56, var5_ref2);
                                            break L28;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      L31: {
                                        L32: {
                                          if (var2 == 15) {
                                            break L32;
                                          } else {
                                            if (var2 != 17) {
                                              break L31;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                        L33: {
                                          var3_long = ((lu) (Object) var1).c(param0 + -103);
                                          var5_int = ((lu) (Object) var1).b(16711935);
                                          var6_ref = gf.a(var3_long, false);
                                          if (var6_ref == null) {
                                            break L33;
                                          } else {
                                            L34: {
                                              L35: {
                                                if (15 == var2) {
                                                  break L35;
                                                } else {
                                                  if (var6_ref.field_Ob) {
                                                    hc.field_J = hc.field_J - 1;
                                                    var6_ref.field_Ob = false;
                                                    if (var11 == 0) {
                                                      break L34;
                                                    } else {
                                                      break L35;
                                                    }
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                              var6_ref.field_wb = false;
                                              break L34;
                                            }
                                            L36: {
                                              if (0 != var5_int) {
                                                var6_ref.field_Mb = kla.field_x;
                                                var6_ref.field_yb = var5_int;
                                                break L36;
                                              } else {
                                                break L36;
                                              }
                                            }
                                            gj.a((byte) 63, var6_ref);
                                            break L33;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L37: {
                                        if (var2 == 18) {
                                          break L37;
                                        } else {
                                          L38: {
                                            if (19 == var2) {
                                              break L38;
                                            } else {
                                              L39: {
                                                if (var2 != 20) {
                                                  break L39;
                                                } else {
                                                  cja.a(pw.field_w, (lu) (Object) var1, 125, false);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              L40: {
                                                if (var2 != 21) {
                                                  break L40;
                                                } else {
                                                  L41: {
                                                    L42: {
                                                      var3 = ((lu) (Object) var1).e((byte) 51);
                                                      if (var3 != 0) {
                                                        break L42;
                                                      } else {
                                                        wda.field_a = 0L;
                                                        if (var11 == 0) {
                                                          break L41;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                    }
                                                    wda.field_a = (long)var3 + f.b((byte) 73);
                                                    break L41;
                                                  }
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                              L43: {
                                                if (var2 != 22) {
                                                  break L43;
                                                } else {
                                                  wk.field_a = ((lu) (Object) var1).e((byte) 48);
                                                  ui.field_q = ((lu) (Object) var1).d(-1);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                              }
                                              L44: {
                                                if (var2 != 23) {
                                                  break L44;
                                                } else {
                                                  ge.field_F = ((lu) (Object) var1).c(param0 ^ 108);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                              cv.a(1, "L1: " + nia.d((byte) -106), (Throwable) null);
                                              vc.a((byte) -78);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          L45: {
                                            var3_long = ((lu) (Object) var1).c(-111);
                                            var5_int = ((lu) (Object) var1).b(16711935);
                                            var6_ref = uka.a(var3_long, param0 ^ -28786);
                                            if (var6_ref == null) {
                                              break L45;
                                            } else {
                                              L46: {
                                                L47: {
                                                  if (var5_int != 0) {
                                                    break L47;
                                                  } else {
                                                    var6_ref.a(false);
                                                    if (var11 == 0) {
                                                      break L46;
                                                    } else {
                                                      break L47;
                                                    }
                                                  }
                                                }
                                                var6_ref.field_yb = var5_int;
                                                var6_ref.field_Mb = kla.field_x;
                                                break L46;
                                              }
                                              var6_ref.b(0);
                                              pw.field_w.field_Rb = pw.field_w.field_Rb - 1;
                                              break L45;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                      L48: {
                                        var3_long = ((lu) (Object) var1).c(param0 + -112);
                                        var5 = ((lu) (Object) var1).g(param0 ^ -55);
                                        var6 = ((lu) (Object) var1).g(param0 + -26);
                                        var7_ref = uka.a(var3_long, 28791);
                                        if (var7_ref == null) {
                                          var7_ref = new ema(var5, var6, var3_long);
                                          wi.field_i.a((eo) (Object) var7_ref, param0 + 98, var3_long);
                                          pw.field_w.field_Rb = pw.field_w.field_Rb + 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      L49: {
                                        var7_ref.field_Jb = ((lu) (Object) var1).e((byte) 106);
                                        var8 = ((lu) (Object) var1).d(param0 + 6);
                                        var7_ref.field_Gb = var8 >> 1;
                                        stackOut_110_0 = (ema) var7_ref;
                                        stackIn_112_0 = stackOut_110_0;
                                        stackIn_111_0 = stackOut_110_0;
                                        if (0 == (var8 & 1)) {
                                          stackOut_112_0 = (ema) (Object) stackIn_112_0;
                                          stackOut_112_1 = 0;
                                          stackIn_113_0 = stackOut_112_0;
                                          stackIn_113_1 = stackOut_112_1;
                                          break L49;
                                        } else {
                                          stackOut_111_0 = (ema) (Object) stackIn_111_0;
                                          stackOut_111_1 = 1;
                                          stackIn_113_0 = stackOut_111_0;
                                          stackIn_113_1 = stackOut_111_1;
                                          break L49;
                                        }
                                      }
                                      stackIn_113_0.field_zb = stackIn_113_1 != 0;
                                      var7_ref.field_Kb = ((lu) (Object) var1).b(16711935);
                                      var7_ref.field_xb = ((lu) (Object) var1).b(param0 + 16711942);
                                      bia.field_g.a((bw) (Object) var7_ref, true);
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L50: {
                                    var3 = ((lu) (Object) var1).e((byte) 100);
                                    var4 = ((lu) (Object) var1).b(16711935);
                                    var5_ref = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                    if (var5_ref != null) {
                                      L51: {
                                        var5_ref.field_gc = false;
                                        var14 = var5_ref;
                                        var14.field_Wb = false;
                                        if (var4 != 0) {
                                          var5_ref.field_Mb = kla.field_x;
                                          var5_ref.field_ec = var4;
                                          break L51;
                                        } else {
                                          break L51;
                                        }
                                      }
                                      h.a(var5_ref, 0);
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            L52: {
                              var3 = ((lu) (Object) var1).e((byte) 72);
                              var19 = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                              if (var19 != null) {
                                L53: {
                                  L54: {
                                    if (11 != var2) {
                                      break L54;
                                    } else {
                                      var19.field_Wb = true;
                                      if (var11 == 0) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  var19.field_gc = true;
                                  break L53;
                                }
                                h.a(var19, 0);
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var3_ref_ema = (ema) (Object) aa.field_l.b((byte) 90);
                        L55: while (true) {
                          L56: {
                            L57: {
                              if (var3_ref_ema == null) {
                                break L57;
                              } else {
                                var3_ref_ema.a(false);
                                var3_ref_ema.b(0);
                                var3_ref_ema = (ema) (Object) aa.field_l.c(param0 + 7);
                                if (var11 != 0) {
                                  break L56;
                                } else {
                                  if (var11 == 0) {
                                    continue L55;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                            hc.field_J = 0;
                            break L56;
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref_ema = (ema) (Object) bia.field_g.b((byte) 90);
            L58: while (true) {
              L59: {
                L60: {
                  if (var3_ref_ema == null) {
                    break L60;
                  } else {
                    var3_ref_ema.a(false);
                    var3_ref_ema.b(0);
                    var3_ref_ema = (ema) (Object) bia.field_g.c(0);
                    if (var11 != 0) {
                      break L59;
                    } else {
                      if (var11 == 0) {
                        continue L58;
                      } else {
                        break L60;
                      }
                    }
                  }
                }
                var3_ref_ema = (ema) (Object) iga.field_c.b((byte) -73);
                break L59;
              }
              L61: while (true) {
                L62: {
                  L63: {
                    if (var3_ref_ema == null) {
                      break L63;
                    } else {
                      stackOut_144_0 = var3_ref_ema.field_wb;
                      stackIn_153_0 = stackOut_144_0 ? 1 : 0;
                      stackIn_145_0 = stackOut_144_0;
                      if (var11 != 0) {
                        break L62;
                      } else {
                        L64: {
                          L65: {
                            if (stackIn_145_0) {
                              break L65;
                            } else {
                              if (!var3_ref_ema.field_Ob) {
                                break L64;
                              } else {
                                break L65;
                              }
                            }
                          }
                          L66: {
                            if (!var3_ref_ema.field_Ob) {
                              break L66;
                            } else {
                              var3_ref_ema.field_Ob = false;
                              hc.field_J = hc.field_J - 1;
                              break L66;
                            }
                          }
                          var3_ref_ema.field_wb = false;
                          gj.a((byte) 38, var3_ref_ema);
                          break L64;
                        }
                        var3_ref_ema = (ema) (Object) iga.field_c.a(param0 + -25170);
                        if (var11 == 0) {
                          continue L61;
                        } else {
                          break L63;
                        }
                      }
                    }
                  }
                  stackOut_152_0 = ~var2;
                  stackIn_153_0 = stackOut_152_0;
                  break L62;
                }
                L67: {
                  if (stackIn_153_0 != -2) {
                    break L67;
                  } else {
                    if (null == pw.field_w) {
                      break L67;
                    } else {
                      ur.field_b = pw.field_w.field_Jb;
                      break L67;
                    }
                  }
                }
                L68: {
                  L69: {
                    if (var2 == 4) {
                      break L69;
                    } else {
                      pw.field_w = null;
                      if (var11 == 0) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  var3 = ((lu) (Object) var1).e((byte) 45);
                  pw.field_w = new uha(ld.field_q);
                  pw.field_w.a(true, (long)var3);
                  cja.a(pw.field_w, (lu) (Object) var1, 54, false);
                  wda.field_a = 0L;
                  break L68;
                }
                L70: {
                  L71: {
                    L72: {
                      if (var2 == 2) {
                        break L72;
                      } else {
                        if (var2 != 3) {
                          break L71;
                        } else {
                          break L72;
                        }
                      }
                    }
                    if (null != rv.field_n) {
                      break L70;
                    } else {
                      rv.field_n = new uha(ld.field_q);
                      if (var11 == 0) {
                        break L70;
                      } else {
                        break L71;
                      }
                    }
                  }
                  rv.field_n = null;
                  break L70;
                }
                L73: {
                  if (var2 == 3) {
                    break L73;
                  } else {
                    ce.field_y = false;
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L73;
                    }
                  }
                }
                ce.field_y = true;
                var3 = 0;
                L74: while (true) {
                  L75: {
                    L76: {
                      if (~fia.field_r.length >= ~var3) {
                        break L76;
                      } else {
                        fia.field_r[var3] = ((lu) (Object) var13).b(true);
                        var3++;
                        if (var11 != 0) {
                          break L75;
                        } else {
                          if (var11 == 0) {
                            continue L74;
                          } else {
                            break L76;
                          }
                        }
                      }
                    }
                    tq.field_h = ((lu) (Object) var1).b(16711935);
                    ena.field_n = ((lu) (Object) var1).b(16711935);
                    break L75;
                  }
                  var3 = 0;
                  L77: while (true) {
                    if (~var3 <= ~sca.field_c.length) {
                      break L2;
                    } else {
                      sca.field_c[var3] = ((lu) (Object) var13).b(true);
                      var3++;
                      if (var11 != 0) {
                        return;
                      } else {
                        if (var11 == 0) {
                          continue L77;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          break L1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This entry doesn't match";
    }
}
