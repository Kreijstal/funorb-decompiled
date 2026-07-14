/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lfa extends k {
    static int field_q;
    private int field_m;
    static sna field_l;
    static kv field_u;
    static ee field_s;
    private int field_p;
    private int field_n;
    private int field_v;
    private int field_t;
    private int field_k;
    private int field_r;
    static int field_o;

    public static void e(byte param0) {
        field_s = null;
        field_l = null;
        if (param0 != -128) {
            return;
        }
        field_u = null;
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        var4 = ((lfa) this).field_n * (param1 - param2) >> 774652908;
        var5 = am.field_R[(1047373 & var4 * 255) >> -1436660628];
        var5 = (var5 << 742446028) / ((lfa) this).field_n;
        if (param0 == 0) {
          L0: {
            L1: {
              var5 = (var5 << 1318065004) / ((lfa) this).field_p;
              var5 = var5 * ((lfa) this).field_m >> -1049884916;
              if (var5 <= param1 + param2) {
                break L1;
              } else {
                if (param2 - -param1 <= -var5) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static boolean d(int param0) {
        int var1_int = 0;
        gj var1 = null;
        int var2 = 0;
        int var3_int = 0;
        op var3 = null;
        int var4_int = 0;
        tk[] var4 = null;
        int var5 = 0;
        String[] var6_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        op var8 = null;
        int var9 = 0;
        Object var10 = null;
        rk[] var10_array = null;
        gj var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        rk[] var15 = null;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          if ((ri.field_a ^ -1) == -58) {
            break L0;
          } else {
            if ((ri.field_a ^ -1) != -59) {
              L1: {
                var1 = null;
                if (param0 <= -30) {
                  break L1;
                } else {
                  field_l = null;
                  break L1;
                }
              }
              L2: {
                if (vs.field_d) {
                  var1 = dj.field_c;
                  break L2;
                } else {
                  if (gja.field_n) {
                    var1 = sna.field_fb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (var1 != null) {
                if (-74 == (ri.field_a ^ -1)) {
                  var1.field_h.a(-2, (lu) (Object) ig.field_m);
                  var1.l(-67);
                  var1.d((byte) 77);
                  return true;
                } else {
                  if (-75 != (ri.field_a ^ -1)) {
                    if (ri.field_a == -61) {
                      L3: {
                        if (var1 != null) {
                          L4: {
                            var2 = ig.field_m.e((byte) 66);
                            if (-2 != ig.field_m.b(16711935)) {
                              stackOut_40_0 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              break L4;
                            } else {
                              stackOut_39_0 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              break L4;
                            }
                          }
                          L5: {
                            var3_int = stackIn_41_0;
                            var4_int = ig.field_m.b(true);
                            var5 = ig.field_m.b(16711935);
                            var6 = ig.field_m.e((byte) 127);
                            if (0 == var1.field_h.field_A) {
                              if (0 != var2) {
                                stackOut_45_0 = 1;
                                stackIn_47_0 = stackOut_45_0;
                                break L5;
                              } else {
                                stackOut_44_0 = 0;
                                stackIn_47_0 = stackOut_44_0;
                                break L5;
                              }
                            } else {
                              stackOut_42_0 = 0;
                              stackIn_47_0 = stackOut_42_0;
                              break L5;
                            }
                          }
                          L6: {
                            var7 = stackIn_47_0;
                            var1.field_h.a(var2, -16292, var3_int != 0);
                            var1.field_h.field_Q = var5;
                            var1.field_h.field_M = var4_int;
                            if (var1.field_h.field_o != 2) {
                              break L6;
                            } else {
                              var1.c(640, var4_int, var5);
                              break L6;
                            }
                          }
                          L7: {
                            if (var7 != 0) {
                              var1.l(-68);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            var1.field_M = 0;
                            var1.field_p = -500 + var6;
                            var1.field_k = var6;
                            var1.field_m = true;
                            var1.field_Y = new sfa[7];
                            var1.field_u = var6;
                            if (!var1.field_h.field_N) {
                              var1.f((byte) 50);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var1.m(10);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return true;
                    } else {
                      if ((ri.field_a ^ -1) == -62) {
                        return true;
                      } else {
                        if (75 == ri.field_a) {
                          var2 = ig.field_m.e((byte) 121);
                          var1.field_u = var2;
                          var1.field_p = var2 + -500;
                          var1.c(false);
                          return true;
                        } else {
                          if ((ri.field_a ^ -1) == -85) {
                            return true;
                          } else {
                            if ((ri.field_a ^ -1) == -63) {
                              var2 = ig.field_m.b(true);
                              var3 = var1.field_h;
                              var4 = new tk[var3.field_d];
                              var5 = 0;
                              L9: while (true) {
                                if (var3.field_d <= var5) {
                                  L10: {
                                    var3.a(true, var2);
                                    var3.field_H = var4;
                                    if (0 != var3.field_A) {
                                      break L10;
                                    } else {
                                      var14 = null;
                                      eq.a((kv) null, var1, (byte) -111);
                                      sia.field_h = false;
                                      lg.a(true, 3, false);
                                      break L10;
                                    }
                                  }
                                  return true;
                                } else {
                                  var4[var5] = ika.a((byte) 85, (lu) (Object) ig.field_m);
                                  var5++;
                                  continue L9;
                                }
                              }
                            } else {
                              if ((ri.field_a ^ -1) != -64) {
                                if (ri.field_a != 64) {
                                  if (ri.field_a == 65) {
                                    var1.field_h.field_s = ig.field_m.b(16711935);
                                    return true;
                                  } else {
                                    if (ri.field_a != 66) {
                                      if (-68 != (ri.field_a ^ -1)) {
                                        return false;
                                      } else {
                                        L11: {
                                          var1.field_V = ig.field_m.b(16711935);
                                          if (vs.field_d) {
                                            hia.c((byte) -122);
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        return true;
                                      }
                                    } else {
                                      L12: {
                                        var1.field_h.field_f = ig.field_m.b(16711935);
                                        if (vs.field_d) {
                                          hia.c((byte) -109);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      return true;
                                    }
                                  }
                                } else {
                                  var1.field_h.field_v = ig.field_m.b(16711935);
                                  return true;
                                }
                              } else {
                                L13: {
                                  var1.field_h.field_h = ig.field_m.b(16711935);
                                  if (vs.field_d) {
                                    qi.a((byte) 120);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                return true;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L14: {
                      var1.field_h.a(dw.field_f, true, (lu) (Object) ig.field_m);
                      if (!var1.field_h.field_U.e(12917)) {
                        var1.field_g = ((cj) (Object) var1.field_h.field_U.a(6)).field_j;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1.field_m = false;
                    var1.b((byte) -117);
                    var1.field_cb = false;
                    var1.field_e.a((byte) 75);
                    return true;
                  }
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
        }
        baa.e(17035);
        hba.a(true, wha.field_a);
        gs.field_f = null;
        var1_int = ig.field_m.b(16711935);
        var2 = ig.field_m.b(16711935);
        var3_int = ig.field_m.b(16711935);
        var4_int = ig.field_m.b(16711935);
        var5 = ig.field_m.b(16711935);
        var6_ref_String__ = new String[ig.field_m.b(16711935)];
        var7 = ig.field_m.b(true);
        var8_int = 0;
        L15: while (true) {
          if (var6_ref_String__.length <= var8_int) {
            L16: {
              var8 = new op(var1_int, var2, var3_int, var4_int, var5, var6_ref_String__);
              var9 = ig.field_m.e((byte) 80);
              var8.a(-2, (lu) (Object) ig.field_m);
              var10 = null;
              if (var8.field_A != 0) {
                break L16;
              } else {
                if (var7 < 0) {
                  break L16;
                } else {
                  var11_int = ig.field_m.b(16711935);
                  var15 = new rk[var11_int];
                  var10_array = var15;
                  var12 = 0;
                  L17: while (true) {
                    if (var12 >= var11_int) {
                      break L16;
                    } else {
                      var15[var12] = gka.a((lu) (Object) ig.field_m, 255);
                      var12++;
                      continue L17;
                    }
                  }
                }
              }
            }
            L18: {
              var11 = new gj(var8, var7, var10_array, true);
              var11.field_g = ig.field_m.f(51);
              if (var8.field_A == 0) {
                break L18;
              } else {
                ala.a(26219, iq.field_m);
                var11.l(-60);
                var11.field_k = var9;
                var11.field_p = -500 + var9;
                var11.field_u = var9;
                var11.field_m = true;
                break L18;
              }
            }
            L19: {
              var11.n(-57);
              if (-58 == (ri.field_a ^ -1)) {
                vs.field_d = true;
                dj.field_c = var11;
                hia.c((byte) -119);
                qi.a((byte) 122);
                dna.f((byte) -12);
                break L19;
              } else {
                sna.field_fb = var11;
                gja.field_n = true;
                break L19;
              }
            }
            pha.field_a = false;
            sia.field_h = true;
            kaa.field_m = -1;
            dh.a((byte) 58, var2);
            return true;
          } else {
            var6_ref_String__[var8_int] = ig.field_m.i(0);
            var8_int++;
            continue L15;
          }
        }
    }

    final static void a(int param0, ht param1, boolean param2, byte param3, jp param4, java.awt.Component param5) {
        if (param3 <= 25) {
            Object var7 = null;
            lfa.a(93, (ht) null, true, (byte) 13, (jp) null, (java.awt.Component) null);
        }
        efa.a(param0, param0, 1024, param2, param1, 19299, param5, param4);
    }

    final void d(byte param0) {
        gea.a(4231);
        if (param0 != -68) {
            Object var3 = null;
            ((lfa) this).a((byte) -6, (lu) null, -101);
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        var11 = BachelorFridge.field_y;
        if (param1 == 0) {
          L0: {
            var12 = ((lfa) this).field_j.a(param0, -1);
            var3 = var12;
            if (((lfa) this).field_j.field_m) {
              var4 = tj.field_f[param0] - 2048;
              var5 = 0;
              L1: while (true) {
                if (hh.field_d <= var5) {
                  break L0;
                } else {
                  L2: {
                    var6 = -2048 + jq.field_k[var5];
                    var7 = var6 + ((lfa) this).field_v;
                    if (var7 <= 2047) {
                      stackOut_8_0 = var7;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 4096 + var7;
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var7 = stackIn_9_0;
                    if (-2049 >= var7) {
                      stackOut_11_0 = var7;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var7 - 4096;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var7 = stackIn_12_0;
                    var8 = ((lfa) this).field_t + var4;
                    if ((var8 ^ -1) > 2047) {
                      stackOut_14_0 = 4096 + var8;
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = var8;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  L5: {
                    var8 = stackIn_15_0;
                    if (2048 < var8) {
                      stackOut_17_0 = var8 - 4096;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = var8;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var8 = stackIn_18_0;
                    var9 = ((lfa) this).field_k + var6;
                    if (-2048 > var9) {
                      stackOut_20_0 = var9 - -4096;
                      stackIn_21_0 = stackOut_20_0;
                      break L6;
                    } else {
                      stackOut_19_0 = var9;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    }
                  }
                  L7: {
                    var9 = stackIn_21_0;
                    if (2048 >= var9) {
                      stackOut_23_0 = var9;
                      stackIn_24_0 = stackOut_23_0;
                      break L7;
                    } else {
                      stackOut_22_0 = -4096 + var9;
                      stackIn_24_0 = stackOut_22_0;
                      break L7;
                    }
                  }
                  L8: {
                    var9 = stackIn_24_0;
                    var10 = ((lfa) this).field_r + var4;
                    if ((var10 ^ -1) <= 2047) {
                      stackOut_26_0 = var10;
                      stackIn_27_0 = stackOut_26_0;
                      break L8;
                    } else {
                      stackOut_25_0 = 4096 + var10;
                      stackIn_27_0 = stackOut_25_0;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = stackIn_27_0;
                    if (2048 >= var10) {
                      stackOut_29_0 = var10;
                      stackIn_30_0 = stackOut_29_0;
                      break L9;
                    } else {
                      stackOut_28_0 = var10 + -4096;
                      stackIn_30_0 = stackOut_28_0;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      var10 = stackIn_30_0;
                      stackOut_30_0 = (int[]) var12;
                      stackOut_30_1 = var5;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_33_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (this.b(0, var8, var7)) {
                        break L11;
                      } else {
                        stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                        stackOut_31_1 = stackIn_31_1;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        if (this.a(var10, var9, -106)) {
                          break L11;
                        } else {
                          stackOut_32_0 = (int[]) (Object) stackIn_32_0;
                          stackOut_32_1 = stackIn_32_1;
                          stackOut_32_2 = 0;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          stackIn_34_2 = stackOut_32_2;
                          break L10;
                        }
                      }
                    }
                    stackOut_33_0 = (int[]) (Object) stackIn_33_0;
                    stackOut_33_1 = stackIn_33_1;
                    stackOut_33_2 = 4096;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    break L10;
                  }
                  stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                  var5++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return var12;
        } else {
          return null;
        }
    }

    public lfa() {
        super(0, true);
        ((lfa) this).field_m = 4096;
        ((lfa) this).field_t = 0;
        ((lfa) this).field_k = 0;
        ((lfa) this).field_r = 2048;
        ((lfa) this).field_p = 8192;
        ((lfa) this).field_v = 2048;
        ((lfa) this).field_n = 12288;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 == -71) {
            break L0;
          } else {
            ((lfa) this).field_v = -29;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (-1 == (var4 ^ -1)) {
            ((lfa) this).field_v = param1.e((byte) 83);
            break L1;
          } else {
            if (var4 == -2) {
              ((lfa) this).field_t = param1.e((byte) 102);
              break L1;
            } else {
              if (-3 == var4) {
                ((lfa) this).field_k = param1.e((byte) 115);
                break L1;
              } else {
                if ((var4 ^ -1) == -4) {
                  ((lfa) this).field_r = param1.e((byte) 67);
                  break L1;
                } else {
                  if ((var4 ^ -1) == -5) {
                    ((lfa) this).field_n = param1.e((byte) 45);
                    break L1;
                  } else {
                    if ((var4 ^ -1) == -6) {
                      ((lfa) this).field_m = param1.e((byte) 118);
                      break L1;
                    } else {
                      if (6 == var4) {
                        ((lfa) this).field_p = param1.e((byte) 70);
                        break L1;
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
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var4 = ((lfa) this).field_n * (param0 - -param1) >> -717313524;
          var5 = am.field_R[255 & var4 * 255 >> -2071325172];
          var5 = (var5 << 4658476) / ((lfa) this).field_n;
          if (param2 <= -29) {
            break L0;
          } else {
            var6 = null;
            ((lfa) this).a((byte) -2, (lu) null, 90);
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = (var5 << -2087017620) / ((lfa) this).field_p;
            var5 = ((lfa) this).field_m * var5 >> 657207596;
            if (var5 <= param0 - param1) {
              break L2;
            } else {
              if (-var5 >= -param1 + param0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 10;
    }
}
