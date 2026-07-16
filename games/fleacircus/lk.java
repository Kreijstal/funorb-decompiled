/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends qa {
    static vc field_O;
    int field_I;
    private int field_N;
    private dd[] field_E;
    private dd field_F;
    private int field_B;
    private int field_L;
    private int field_K;
    private int field_C;
    private dd field_P;
    static vg field_D;
    static volatile int field_J;
    private int field_G;
    static fh field_A;
    private dd field_M;
    static fa field_Q;
    boolean field_H;

    private final dd b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dd var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var13 = fleas.field_A ? 1 : 0;
        var14 = new dd(((lk) this).field_N * 2, ((lk) this).field_j);
        r.a(var14, 45);
        var5 = ((lk) this).field_j >> -34084671;
        var6 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (((lk) this).field_j <= var6) {
                break L2;
              } else {
                var7 = (((lk) this).field_N * 2 - 1) * (var6 >> 409506081) % (2 * ((lk) this).field_N);
                var8 = 16711935 & param1;
                var9 = param1 & 65280;
                var10 = var6 + -var5;
                var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
                stackOut_2_0 = -257;
                stackOut_2_1 = var11 ^ -1;
                stackIn_11_0 = stackOut_2_0;
                stackIn_11_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 < stackIn_3_1) {
                      stackOut_5_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> 502419848;
                      stackIn_6_0 = stackOut_5_0;
                      break L3;
                    } else {
                      stackOut_4_0 = var9 | var8;
                      stackIn_6_0 = stackOut_4_0;
                      break L3;
                    }
                  }
                  L4: {
                    var12 = stackIn_6_0;
                    gb.b(var7, var6, ((lk) this).field_N, var12);
                    var8 = 16711935 & param0;
                    var9 = param0 & 65280;
                    gb.b(var7 + -(((lk) this).field_N * 2), var6, ((lk) this).field_N, var12);
                    if (256 <= var11) {
                      stackOut_8_0 = var9 | var8;
                      stackIn_9_0 = stackOut_8_0;
                      break L4;
                    } else {
                      stackOut_7_0 = (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> -215237912;
                      stackIn_9_0 = stackOut_7_0;
                      break L4;
                    }
                  }
                  var12 = stackIn_9_0;
                  gb.b(var7 + ((lk) this).field_N, var6, ((lk) this).field_N, var12);
                  gb.b(-((lk) this).field_N + var7, var6, ((lk) this).field_N, var12);
                  var6++;
                  if (var13 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            ia.a(-121);
            stackOut_10_0 = 83;
            stackOut_10_1 = (9 - param2) / 48;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L1;
          }
          var6 = stackIn_11_0 % stackIn_11_1;
          return var14;
        }
    }

    final static void a(int param0, String param1) {
        fg.field_m = param1;
        if (param0 != -15493) {
            return;
        }
        cg.a((byte) -105, 12);
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        if (param3 <= -85) {
          if (((lk) this).field_H) {
            ((lk) this).field_B = ((lk) this).field_B + 1;
            if (((lk) this).field_N * 2 >= ((lk) this).field_B) {
              return;
            } else {
              ((lk) this).field_B = ((lk) this).field_B - ((lk) this).field_N * 2;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static kc a(String param0, boolean param1, byte param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var4 = 0L;
        if (param2 != -35) {
          L0: {
            L1: {
              var7 = null;
              lk.a(63, (String) null);
              var6 = null;
              if ((param3.indexOf('@') ^ -1) != 0) {
                break L1;
              } else {
                var8 = (CharSequence) (Object) param3;
                var4 = uj.a(var8, (byte) -126);
                if (!fleas.field_A) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (Object) (Object) param3;
            break L0;
          }
          return r.a(param1, var4, (byte) 84, (String) var6, param0);
        } else {
          L2: {
            L3: {
              var6 = null;
              if ((param3.indexOf('@') ^ -1) != 0) {
                break L3;
              } else {
                var9 = (CharSequence) (Object) param3;
                var4 = uj.a(var9, (byte) -126);
                if (!fleas.field_A) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var6 = (Object) (Object) param3;
            break L2;
          }
          return r.a(param1, var4, (byte) 84, (String) var6, param0);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (0 != param3) {
          return;
        } else {
          if (param2) {
            var5 = param1 - -((lk) this).field_y;
            var6 = ((lk) this).field_z + param0;
            this.a(((lk) this).field_E[0], var6, 0, var5);
            if (-65537 >= (((lk) this).field_I ^ -1)) {
              return;
            } else {
              mi.a((byte) -52, var5 - -((lk) this).field_u, var5 + (((lk) this).field_u * ((lk) this).field_I >> 650292688), var6 - -((lk) this).field_j, var6);
              this.a(((lk) this).field_E[1], var6, 0, var5);
              ia.a(-68);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static int k(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackOut_2_0 = false;
        boolean stackOut_8_0 = false;
        var7 = fleas.field_A ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (!wf.b(-113)) {
                break L2;
              } else {
                bk.field_a.h(0);
                stackOut_2_0 = bk.field_a.b(-66);
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (!stackIn_3_0) {
                      break L3;
                    } else {
                      var1 = 1;
                      break L3;
                    }
                  }
                  if (-14 == (ji.field_a ^ -1)) {
                    var2 = 1;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    continue L0;
                  }
                }
              }
            }
            bk.field_a.b(105, bg.a(pb.field_d, ob.field_e, 96), bg.a(ag.field_f, kc.field_b, 115));
            stackOut_8_0 = bk.field_a.b(-46);
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          L4: {
            if (!stackIn_9_0) {
              break L4;
            } else {
              var1 = 1;
              break L4;
            }
          }
          if (param0 == 10999) {
            var3 = 0;
            if (var1 != 0) {
              if (-1 >= (bk.field_a.field_k ^ -1)) {
                L5: {
                  var3 = em.field_e[bk.field_a.field_k];
                  if (var3 == 2) {
                    md.i(124);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (var2 == 0) {
                          break L6;
                        } else {
                          if (-3 == (vc.field_a ^ -1)) {
                            break L6;
                          } else {
                            L7: {
                              md.i(-109);
                              if (-1 != (var3 ^ -1)) {
                                break L7;
                              } else {
                                if (2 != vc.field_a) {
                                  break L7;
                                } else {
                                  var4 = -sd.field_h + lj.a((byte) -38);
                                  var6 = (int)((-var4 + 10999L) / 1000L);
                                  if (var6 <= 0) {
                                    pf.a(5, 1, true);
                                    var3 = 2;
                                    break L7;
                                  } else {
                                    return var3;
                                  }
                                }
                              }
                            }
                            return var3;
                          }
                        }
                      }
                      L8: {
                        if (-1 != (var3 ^ -1)) {
                          break L8;
                        } else {
                          if (2 != vc.field_a) {
                            break L8;
                          } else {
                            var4 = -sd.field_h + lj.a((byte) -38);
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (var6 <= 0) {
                              pf.a(5, 1, true);
                              var3 = 2;
                              break L8;
                            } else {
                              return var3;
                            }
                          }
                        }
                      }
                      return var3;
                    }
                  } else {
                    if ((var3 ^ -1) != -6) {
                      break L5;
                    } else {
                      L9: {
                        md.i(124);
                        if (var7 == 0) {
                          break L9;
                        } else {
                          if (var2 == 0) {
                            break L9;
                          } else {
                            if (-3 == (vc.field_a ^ -1)) {
                              break L9;
                            } else {
                              L10: {
                                md.i(-109);
                                if (-1 != (var3 ^ -1)) {
                                  break L10;
                                } else {
                                  if (2 != vc.field_a) {
                                    break L10;
                                  } else {
                                    var4 = -sd.field_h + lj.a((byte) -38);
                                    var6 = (int)((-var4 + 10999L) / 1000L);
                                    if (var6 <= 0) {
                                      pf.a(5, 1, true);
                                      var3 = 2;
                                      break L10;
                                    } else {
                                      return var3;
                                    }
                                  }
                                }
                              }
                              return var3;
                            }
                          }
                        }
                      }
                      L11: {
                        if (-1 != (var3 ^ -1)) {
                          break L11;
                        } else {
                          if (2 != vc.field_a) {
                            break L11;
                          } else {
                            var4 = -sd.field_h + lj.a((byte) -38);
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (var6 <= 0) {
                              pf.a(5, 1, true);
                              var3 = 2;
                              break L11;
                            } else {
                              return var3;
                            }
                          }
                        }
                      }
                      return var3;
                    }
                  }
                }
                L12: {
                  if (-1 != (var3 ^ -1)) {
                    break L12;
                  } else {
                    if (2 != vc.field_a) {
                      break L12;
                    } else {
                      var4 = -sd.field_h + lj.a((byte) -38);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 <= 0) {
                        pf.a(5, 1, true);
                        var3 = 2;
                        break L12;
                      } else {
                        return var3;
                      }
                    }
                  }
                }
                return var3;
              } else {
                if (var2 != 0) {
                  if (-3 != (vc.field_a ^ -1)) {
                    L13: {
                      md.i(-109);
                      if (-1 != (var3 ^ -1)) {
                        break L13;
                      } else {
                        if (2 != vc.field_a) {
                          break L13;
                        } else {
                          var4 = -sd.field_h + lj.a((byte) -38);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (var6 <= 0) {
                            pf.a(5, 1, true);
                            var3 = 2;
                            break L13;
                          } else {
                            return var3;
                          }
                        }
                      }
                    }
                    return var3;
                  } else {
                    L14: {
                      if (-1 != (var3 ^ -1)) {
                        break L14;
                      } else {
                        if (2 != vc.field_a) {
                          break L14;
                        } else {
                          var4 = -sd.field_h + lj.a((byte) -38);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (var6 <= 0) {
                            pf.a(5, 1, true);
                            var3 = 2;
                            break L14;
                          } else {
                            return var3;
                          }
                        }
                      }
                    }
                    return var3;
                  }
                } else {
                  L15: {
                    if (-1 != (var3 ^ -1)) {
                      break L15;
                    } else {
                      if (2 != vc.field_a) {
                        break L15;
                      } else {
                        var4 = -sd.field_h + lj.a((byte) -38);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (var6 <= 0) {
                          pf.a(5, 1, true);
                          var3 = 2;
                          break L15;
                        } else {
                          return var3;
                        }
                      }
                    }
                  }
                  return var3;
                }
              }
            } else {
              L16: {
                if (var2 == 0) {
                  break L16;
                } else {
                  if (-3 == (vc.field_a ^ -1)) {
                    break L16;
                  } else {
                    L17: {
                      md.i(-109);
                      if (-1 != (var3 ^ -1)) {
                        break L17;
                      } else {
                        if (2 != vc.field_a) {
                          break L17;
                        } else {
                          var4 = -sd.field_h + lj.a((byte) -38);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (var6 <= 0) {
                            pf.a(5, 1, true);
                            var3 = 2;
                            break L17;
                          } else {
                            return var3;
                          }
                        }
                      }
                    }
                    return var3;
                  }
                }
              }
              L18: {
                if (-1 != (var3 ^ -1)) {
                  break L18;
                } else {
                  if (2 != vc.field_a) {
                    break L18;
                  } else {
                    var4 = -sd.field_h + lj.a((byte) -38);
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (var6 <= 0) {
                      pf.a(5, 1, true);
                      var3 = 2;
                      break L18;
                    } else {
                      return var3;
                    }
                  }
                }
              }
              return var3;
            }
          } else {
            return 108;
          }
        }
    }

    private final dd d(byte param0) {
        int var2 = 0;
        dd var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        var9 = fleas.field_A ? 1 : 0;
        var2 = ((lk) this).field_j >> 1509851841;
        var3 = new dd(var2, ((lk) this).field_j);
        r.a(var3, 45);
        if (param0 != -15) {
          field_D = null;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (((lk) this).field_j <= var4) {
                  break L2;
                } else {
                  stackOut_17_0 = 0;
                  stackIn_28_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var9 != 0) {
                    break L1;
                  } else {
                    var5 = stackIn_18_0;
                    L3: while (true) {
                      if (var5 >= var2) {
                        var4++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      } else {
                        L4: {
                          var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((lk) this).field_j));
                          var8 = 1;
                          if (var6 >= 1.0) {
                            break L4;
                          } else {
                            L5: {
                              var6 = Math.sqrt(1.0 - var6);
                              if (1.0 <= var6) {
                                stackOut_23_0 = 255;
                                stackIn_24_0 = stackOut_23_0;
                                break L5;
                              } else {
                                stackOut_22_0 = (int)(255.0 * var6);
                                stackIn_24_0 = stackOut_22_0;
                                break L5;
                              }
                            }
                            var8 = stackIn_24_0;
                            break L4;
                          }
                        }
                        gb.a(var5, var4, var8 << -2076140760 | var8 | var8 << -1840242832);
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              stackOut_27_0 = -106;
              stackIn_28_0 = stackOut_27_0;
              break L1;
            }
            ia.a(stackIn_28_0);
            return var3;
          }
        } else {
          var4 = 0;
          L6: while (true) {
            L7: {
              L8: {
                if (((lk) this).field_j <= var4) {
                  break L8;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_14_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L7;
                  } else {
                    var5 = stackIn_4_0;
                    L9: while (true) {
                      if (var5 >= var2) {
                        var4++;
                        if (var9 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      } else {
                        L10: {
                          var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((lk) this).field_j));
                          var8 = 1;
                          if (var6 >= 1.0) {
                            break L10;
                          } else {
                            L11: {
                              var6 = Math.sqrt(1.0 - var6);
                              if (1.0 <= var6) {
                                stackOut_9_0 = 255;
                                stackIn_10_0 = stackOut_9_0;
                                break L11;
                              } else {
                                stackOut_8_0 = (int)(255.0 * var6);
                                stackIn_10_0 = stackOut_8_0;
                                break L11;
                              }
                            }
                            var8 = stackIn_10_0;
                            break L10;
                          }
                        }
                        gb.a(var5, var4, var8 << -2076140760 | var8 | var8 << -1840242832);
                        var5++;
                        continue L9;
                      }
                    }
                  }
                }
              }
              stackOut_13_0 = -106;
              stackIn_14_0 = stackOut_13_0;
              break L7;
            }
            ia.a(stackIn_14_0);
            return var3;
          }
        }
    }

    lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 794305025, (16711422 & param6) >> -1440119039);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(124);
    }

    private final void a(dd param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        var5 = ((lk) this).field_u + param3;
        mi.a((byte) -52, var5 + -((lk) this).field_P.field_w, param3 - -((lk) this).field_P.field_w, param1 + ((lk) this).field_j, param1);
        var6 = -((lk) this).field_B + param3;
        if (param2 == 0) {
          L0: while (true) {
            if (var5 <= var6) {
              L1: {
                ia.a(param2 ^ -81);
                if (gb.field_l > ((lk) this).field_P.field_w + param3) {
                  break L1;
                } else {
                  r.a(((lk) this).field_M, 45);
                  param0.d(-((lk) this).field_B, 0);
                  param0.d(((lk) this).field_N * 2 - ((lk) this).field_B, 0);
                  ((lk) this).field_F.a(0, 0);
                  ia.a(-70);
                  ((lk) this).field_M.d(param3, param1);
                  break L1;
                }
              }
              if (var5 - ((lk) this).field_P.field_w <= gb.field_h) {
                r.a(((lk) this).field_M, 45);
                var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                L2: while (true) {
                  if (var7 > ((lk) this).field_N * 2) {
                    var7 = var7 - 2 * ((lk) this).field_N;
                    if (var8 == 0) {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        param0.d(-var7, 0);
                        param0.d(-var7 + ((lk) this).field_N * 2, 0);
                        ((lk) this).field_P.a(0, 0);
                        ia.a(-79);
                        ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                        return;
                      }
                    } else {
                      ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                      return;
                    }
                  } else {
                    param0.d(-var7, 0);
                    param0.d(-var7 + ((lk) this).field_N * 2, 0);
                    ((lk) this).field_P.a(0, 0);
                    ia.a(-79);
                    ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              param0.d(var6, param1);
              var6 = var6 + param0.field_w;
              if (var8 != 0) {
                if (gb.field_l > ((lk) this).field_P.field_w + param3) {
                  if (var5 - ((lk) this).field_P.field_w <= gb.field_h) {
                    r.a(((lk) this).field_M, 45);
                    var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                    L3: while (true) {
                      if (var7 > ((lk) this).field_N * 2) {
                        var7 = var7 - 2 * ((lk) this).field_N;
                        if (var8 == 0) {
                          continue L3;
                        } else {
                          ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                          return;
                        }
                      } else {
                        param0.d(-var7, 0);
                        param0.d(-var7 + ((lk) this).field_N * 2, 0);
                        ((lk) this).field_P.a(0, 0);
                        ia.a(-79);
                        ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  r.a(((lk) this).field_M, 45);
                  param0.d(-((lk) this).field_B, 0);
                  param0.d(((lk) this).field_N * 2 - ((lk) this).field_B, 0);
                  ((lk) this).field_F.a(0, 0);
                  ia.a(-70);
                  ((lk) this).field_M.d(param3, param1);
                  if (var5 - ((lk) this).field_P.field_w <= gb.field_h) {
                    r.a(((lk) this).field_M, 45);
                    var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                    L4: while (true) {
                      if (var7 > ((lk) this).field_N * 2) {
                        var7 = var7 - 2 * ((lk) this).field_N;
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                          return;
                        }
                      } else {
                        param0.d(-var7, 0);
                        param0.d(-var7 + ((lk) this).field_N * 2, 0);
                        ((lk) this).field_P.a(0, 0);
                        ia.a(-79);
                        ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (var8 == 0) {
                  continue L0;
                } else {
                  ia.a(param2 ^ -81);
                  if (gb.field_l <= ((lk) this).field_P.field_w + param3) {
                    r.a(((lk) this).field_M, 45);
                    param0.d(-((lk) this).field_B, 0);
                    param0.d(((lk) this).field_N * 2 - ((lk) this).field_B, 0);
                    ((lk) this).field_F.a(0, 0);
                    ia.a(-70);
                    ((lk) this).field_M.d(param3, param1);
                    if (var5 - ((lk) this).field_P.field_w <= gb.field_h) {
                      r.a(((lk) this).field_M, 45);
                      var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                      L5: while (true) {
                        if (var7 > ((lk) this).field_N * 2) {
                          var7 = var7 - 2 * ((lk) this).field_N;
                          if (var8 == 0) {
                            continue L5;
                          } else {
                            ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                            return;
                          }
                        } else {
                          param0.d(-var7, 0);
                          param0.d(-var7 + ((lk) this).field_N * 2, 0);
                          ((lk) this).field_P.a(0, 0);
                          ia.a(-79);
                          ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (var5 - ((lk) this).field_P.field_w > gb.field_h) {
                      return;
                    } else {
                      r.a(((lk) this).field_M, 45);
                      var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                      L6: while (true) {
                        L7: {
                          if (var7 <= ((lk) this).field_N * 2) {
                            param0.d(-var7, 0);
                            param0.d(-var7 + ((lk) this).field_N * 2, 0);
                            ((lk) this).field_P.a(0, 0);
                            ia.a(-79);
                            break L7;
                          } else {
                            var7 = var7 - 2 * ((lk) this).field_N;
                            if (var8 != 0) {
                              break L7;
                            } else {
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                param0.d(-var7, 0);
                                param0.d(-var7 + ((lk) this).field_N * 2, 0);
                                ((lk) this).field_P.a(0, 0);
                                ia.a(-79);
                                break L7;
                              }
                            }
                          }
                        }
                        ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          field_A = null;
          L8: while (true) {
            L9: {
              if (var5 <= var6) {
                ia.a(param2 ^ -81);
                break L9;
              } else {
                param0.d(var6, param1);
                var6 = var6 + param0.field_w;
                if (var8 != 0) {
                  break L9;
                } else {
                  continue L8;
                }
              }
            }
            L10: {
              if (gb.field_l > ((lk) this).field_P.field_w + param3) {
                break L10;
              } else {
                r.a(((lk) this).field_M, 45);
                param0.d(-((lk) this).field_B, 0);
                param0.d(((lk) this).field_N * 2 - ((lk) this).field_B, 0);
                ((lk) this).field_F.a(0, 0);
                ia.a(-70);
                ((lk) this).field_M.d(param3, param1);
                break L10;
              }
            }
            if (var5 - ((lk) this).field_P.field_w > gb.field_h) {
              return;
            } else {
              r.a(((lk) this).field_M, 45);
              var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
              L11: while (true) {
                L12: {
                  if (var7 <= ((lk) this).field_N * 2) {
                    param0.d(-var7, 0);
                    param0.d(-var7 + ((lk) this).field_N * 2, 0);
                    ((lk) this).field_P.a(0, 0);
                    ia.a(-79);
                    break L12;
                  } else {
                    var7 = var7 - 2 * ((lk) this).field_N;
                    if (var8 != 0) {
                      break L12;
                    } else {
                      if (var8 == 0) {
                        continue L11;
                      } else {
                        param0.d(-var7, 0);
                        param0.d(-var7 + ((lk) this).field_N * 2, 0);
                        ((lk) this).field_P.a(0, 0);
                        ia.a(-79);
                        break L12;
                      }
                    }
                  }
                }
                ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        int var1 = 2 / ((param0 - -62) / 39);
        return true;
    }

    public static void c(boolean param0) {
        field_O = null;
        field_D = null;
        field_Q = null;
        field_A = null;
        if (param0) {
            return;
        }
        lk.c(true);
    }

    final static void a(byte param0) {
        if (vg.field_z != 0 + -wf.field_c) {
          if (vg.field_z != -wf.field_c + 250) {
            if (param0 != 35) {
              field_J = -59;
              vg.field_z = vg.field_z + 1;
              return;
            } else {
              vg.field_z = vg.field_z + 1;
              return;
            }
          } else {
            if (param0 != 35) {
              field_J = -59;
              vg.field_z = vg.field_z + 1;
              return;
            } else {
              vg.field_z = vg.field_z + 1;
              return;
            }
          }
        } else {
          if (param0 != 35) {
            field_J = -59;
            vg.field_z = vg.field_z + 1;
            return;
          } else {
            vg.field_z = vg.field_z + 1;
            return;
          }
        }
    }

    private final void j(int param0) {
        if (param0 < 116) {
          return;
        } else {
          ((lk) this).field_E = new dd[]{this.b(((lk) this).field_G, ((lk) this).field_C, -117), this.b(((lk) this).field_L, ((lk) this).field_K, 118)};
          ((lk) this).field_P = this.d((byte) -15);
          ((lk) this).field_F = ((lk) this).field_P.b();
          ((lk) this).field_M = new dd(((lk) this).field_j >> 628191361, ((lk) this).field_j);
          return;
        }
    }

    final static boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 10) {
          if (10 <= bh.field_t) {
            if (ci.field_f) {
              return false;
            } else {
              L0: {
                if (qh.j(32391)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          int discarded$5 = lk.k(67);
          if (10 <= bh.field_t) {
            if (ci.field_f) {
              return false;
            } else {
              L1: {
                if (qh.j(32391)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        ((lk) this).field_L = (param1 & 16711422) >> -1387688991;
        ((lk) this).field_G = param1;
        ((lk) this).field_C = param2;
        ((lk) this).field_K = 8355711 & param2 >> 867289153;
        if (param0 <= 77) {
          lk.c(false);
          this.j(119);
          return;
        } else {
          this.j(119);
          return;
        }
    }

    private lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((lk) this).field_L = param8;
        ((lk) this).field_C = param5;
        ((lk) this).field_G = param6;
        ((lk) this).field_K = param7;
        ((lk) this).field_N = param4;
        ((lk) this).a(param0, param2, param1, param3, 80);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new vc();
        field_J = 0;
        field_A = new fh(6, 0, 4, 2);
    }
}
