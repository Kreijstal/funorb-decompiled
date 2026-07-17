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
        field_u = null;
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        var4 = ((lfa) this).field_n * (param1 - param2) >> 12;
        var5 = am.field_R[(1047373 & var4 * 255) >> 12];
        var5 = (var5 << 12) / ((lfa) this).field_n;
        if (param0 == 0) {
          L0: {
            L1: {
              var5 = (var5 << 12) / ((lfa) this).field_p;
              var5 = var5 * ((lfa) this).field_m >> 12;
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
        Object var1 = null;
        int var1_int = 0;
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
        gj var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        rk[] var15 = null;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_105_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_17_0 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (ri.field_a == 57) {
                break L1;
              } else {
                if (ri.field_a != 58) {
                  L2: {
                    var1 = null;
                    if (vs.field_d) {
                      var1 = (Object) (Object) dj.field_c;
                      break L2;
                    } else {
                      if (gja.field_n) {
                        var1 = (Object) (Object) sna.field_fb;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var1 != null) {
                    if (ri.field_a == 73) {
                      ((gj) var1).field_h.a(-2, (lu) (Object) ig.field_m);
                      ((gj) var1).l(-67);
                      ((gj) var1).d((byte) 77);
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    } else {
                      if (ri.field_a != 74) {
                        if (ri.field_a == 60) {
                          L3: {
                            if (var1 != null) {
                              L4: {
                                var2 = ig.field_m.e((byte) 66);
                                if (ig.field_m.b(16711935) != 1) {
                                  stackOut_42_0 = 0;
                                  stackIn_43_0 = stackOut_42_0;
                                  break L4;
                                } else {
                                  stackOut_41_0 = 1;
                                  stackIn_43_0 = stackOut_41_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var3_int = stackIn_43_0;
                                  var4_int = ig.field_m.b(true);
                                  var5 = ig.field_m.b(16711935);
                                  var6 = ig.field_m.e((byte) 127);
                                  if (0 != ((gj) var1).field_h.field_A) {
                                    break L6;
                                  } else {
                                    if (0 == var2) {
                                      break L6;
                                    } else {
                                      stackOut_45_0 = 1;
                                      stackIn_47_0 = stackOut_45_0;
                                      break L5;
                                    }
                                  }
                                }
                                stackOut_46_0 = 0;
                                stackIn_47_0 = stackOut_46_0;
                                break L5;
                              }
                              L7: {
                                var7 = stackIn_47_0;
                                ((gj) var1).field_h.a(var2, -16292, var3_int != 0);
                                ((gj) var1).field_h.field_Q = var5;
                                ((gj) var1).field_h.field_M = var4_int;
                                if (((gj) var1).field_h.field_o != 2) {
                                  break L7;
                                } else {
                                  ((gj) var1).c(640, var4_int, var5);
                                  break L7;
                                }
                              }
                              L8: {
                                if (var7 != 0) {
                                  ((gj) var1).l(-68);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                ((gj) var1).field_M = 0;
                                ((gj) var1).field_p = -500 + var6;
                                ((gj) var1).field_k = var6;
                                ((gj) var1).field_m = true;
                                ((gj) var1).field_Y = new sfa[7];
                                ((gj) var1).field_u = var6;
                                if (!((gj) var1).field_h.field_N) {
                                  ((gj) var1).f((byte) 50);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((gj) var1).m(10);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          stackOut_56_0 = 1;
                          stackIn_57_0 = stackOut_56_0;
                          return stackIn_57_0 != 0;
                        } else {
                          if (ri.field_a == 61) {
                            stackOut_60_0 = 1;
                            stackIn_61_0 = stackOut_60_0;
                            return stackIn_61_0 != 0;
                          } else {
                            if (75 == ri.field_a) {
                              var2 = ig.field_m.e((byte) 121);
                              ((gj) var1).field_u = var2;
                              ((gj) var1).field_p = var2 + -500;
                              ((gj) var1).c(false);
                              stackOut_64_0 = 1;
                              stackIn_65_0 = stackOut_64_0;
                              return stackIn_65_0 != 0;
                            } else {
                              if (ri.field_a == 84) {
                                stackOut_68_0 = 1;
                                stackIn_69_0 = stackOut_68_0;
                                return stackIn_69_0 != 0;
                              } else {
                                if (ri.field_a == 62) {
                                  var2 = ig.field_m.b(true);
                                  var3 = ((gj) var1).field_h;
                                  var4 = new tk[var3.field_d];
                                  var5 = 0;
                                  L10: while (true) {
                                    if (~var3.field_d >= ~var5) {
                                      L11: {
                                        var3.a(true, var2);
                                        var3.field_H = var4;
                                        if (0 != var3.field_A) {
                                          break L11;
                                        } else {
                                          var14 = null;
                                          eq.a((kv) null, (gj) var1, (byte) -111);
                                          sia.field_h = false;
                                          lg.a(true, 3, false);
                                          break L11;
                                        }
                                      }
                                      stackOut_77_0 = 1;
                                      stackIn_78_0 = stackOut_77_0;
                                      return stackIn_78_0 != 0;
                                    } else {
                                      var4[var5] = ika.a((byte) 85, (lu) (Object) ig.field_m);
                                      var5++;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  if (ri.field_a != 63) {
                                    if (ri.field_a != 64) {
                                      if (ri.field_a == 65) {
                                        ((gj) var1).field_h.field_s = ig.field_m.b(16711935);
                                        stackOut_90_0 = 1;
                                        stackIn_91_0 = stackOut_90_0;
                                        return stackIn_91_0 != 0;
                                      } else {
                                        if (ri.field_a != 66) {
                                          if (ri.field_a != 67) {
                                            stackOut_104_0 = 0;
                                            stackIn_105_0 = stackOut_104_0;
                                            break L0;
                                          } else {
                                            L12: {
                                              ((gj) var1).field_V = ig.field_m.b(16711935);
                                              if (vs.field_d) {
                                                hia.c((byte) -122);
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            stackOut_102_0 = 1;
                                            stackIn_103_0 = stackOut_102_0;
                                            return stackIn_103_0 != 0;
                                          }
                                        } else {
                                          L13: {
                                            ((gj) var1).field_h.field_f = ig.field_m.b(16711935);
                                            if (vs.field_d) {
                                              hia.c((byte) -109);
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          stackOut_96_0 = 1;
                                          stackIn_97_0 = stackOut_96_0;
                                          return stackIn_97_0 != 0;
                                        }
                                      }
                                    } else {
                                      ((gj) var1).field_h.field_v = ig.field_m.b(16711935);
                                      stackOut_86_0 = 1;
                                      stackIn_87_0 = stackOut_86_0;
                                      return stackIn_87_0 != 0;
                                    }
                                  } else {
                                    L14: {
                                      ((gj) var1).field_h.field_h = ig.field_m.b(16711935);
                                      if (vs.field_d) {
                                        qi.a((byte) 120);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    stackOut_83_0 = 1;
                                    stackIn_84_0 = stackOut_83_0;
                                    return stackIn_84_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L15: {
                          ((gj) var1).field_h.a(dw.field_f, true, (lu) (Object) ig.field_m);
                          if (!((gj) var1).field_h.field_U.e(12917)) {
                            ((gj) var1).field_g = ((cj) (Object) ((gj) var1).field_h.field_U.a(6)).field_j;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        ((gj) var1).field_m = false;
                        ((gj) var1).b((byte) -117);
                        ((gj) var1).field_cb = false;
                        ((gj) var1).field_e.a((byte) 75);
                        stackOut_34_0 = 1;
                        stackIn_35_0 = stackOut_34_0;
                        return stackIn_35_0 != 0;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  break L1;
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
            L16: while (true) {
              if (~var6_ref_String__.length >= ~var8_int) {
                L17: {
                  var8 = new op(var1_int, var2, var3_int, var4_int, var5, var6_ref_String__);
                  var9 = ig.field_m.e((byte) 80);
                  var8.a(-2, (lu) (Object) ig.field_m);
                  var10 = null;
                  if (var8.field_A != 0) {
                    break L17;
                  } else {
                    if (var7 < 0) {
                      break L17;
                    } else {
                      var11_int = ig.field_m.b(16711935);
                      var15 = new rk[var11_int];
                      var10 = (Object) (Object) var15;
                      var12 = 0;
                      L18: while (true) {
                        if (~var12 <= ~var11_int) {
                          break L17;
                        } else {
                          var15[var12] = gka.a((lu) (Object) ig.field_m, 255);
                          var12++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                L19: {
                  var11 = new gj(var8, var7, (rk[]) var10, true);
                  var11.field_g = ig.field_m.f(51);
                  if (var8.field_A == 0) {
                    break L19;
                  } else {
                    ala.a(26219, iq.field_m);
                    var11.l(-60);
                    var11.field_k = var9;
                    var11.field_p = -500 + var9;
                    var11.field_u = var9;
                    var11.field_m = true;
                    break L19;
                  }
                }
                L20: {
                  var11.n(-57);
                  if (ri.field_a == 57) {
                    vs.field_d = true;
                    dj.field_c = var11;
                    hia.c((byte) -119);
                    qi.a((byte) 122);
                    dna.f((byte) -12);
                    break L20;
                  } else {
                    sna.field_fb = var11;
                    gja.field_n = true;
                    break L20;
                  }
                }
                pha.field_a = false;
                sia.field_h = true;
                kaa.field_m = -1;
                dh.a((byte) 58, var2);
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                var6_ref_String__[var8_int] = ig.field_m.i(0);
                var8_int++;
                continue L16;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw pe.a((Throwable) var1, "lfa.D(" + -124 + 41);
        }
        return stackIn_105_0 != 0;
    }

    final static void a(int param0, ht param1, boolean param2, byte param3, jp param4, java.awt.Component param5) {
        try {
            if (param3 <= 25) {
                Object var7 = null;
                lfa.a(93, (ht) null, true, (byte) 13, (jp) null, (java.awt.Component) null);
            }
            efa.a(param0, param0, 1024, param2, param1, 19299, param5, param4);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lfa.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
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
                    if (var7 >= -2048) {
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
                    if (var7 <= 2048) {
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
                    if (var8 < -2048) {
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
                    if (var10 >= -2048) {
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                ((lfa) this).field_v = -29;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int == 0) {
                ((lfa) this).field_v = param1.e((byte) 83);
                break L2;
              } else {
                if (var4_int == 1) {
                  ((lfa) this).field_t = param1.e((byte) 102);
                  break L2;
                } else {
                  if (var4_int == 2) {
                    ((lfa) this).field_k = param1.e((byte) 115);
                    break L2;
                  } else {
                    if (var4_int == 3) {
                      ((lfa) this).field_r = param1.e((byte) 67);
                      break L2;
                    } else {
                      if (var4_int == 4) {
                        ((lfa) this).field_n = param1.e((byte) 45);
                        break L2;
                      } else {
                        if (var4_int == 5) {
                          ((lfa) this).field_m = param1.e((byte) 118);
                          break L2;
                        } else {
                          if (6 == var4_int) {
                            ((lfa) this).field_p = param1.e((byte) 70);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("lfa.E(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = ((lfa) this).field_n * (param0 - -param1) >> 12;
            var5 = am.field_R[255 & var4 * 255 >> 12];
            var5 = (var5 << 12) / ((lfa) this).field_n;
            var5 = (var5 << 12) / ((lfa) this).field_p;
            var5 = ((lfa) this).field_m * var5 >> 12;
            if (var5 <= param0 - param1) {
              break L1;
            } else {
              if (-var5 >= -param1 + param0) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 10;
    }
}
