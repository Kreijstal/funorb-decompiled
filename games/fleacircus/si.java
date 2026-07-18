/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    short[] field_M;
    short[] field_s;
    static String field_o;
    static dd field_C;
    short field_w;
    short[] field_t;
    int field_m;
    short[] field_F;
    int field_b;
    short[] field_P;
    short[] field_Q;
    int[] field_d;
    int[] field_G;
    short[] field_n;
    short[] field_q;
    int[] field_v;
    short[] field_D;
    int[] field_O;
    static vg field_y;
    short[] field_i;
    private boolean field_a;
    int[] field_z;
    int field_k;
    short field_p;
    short[] field_K;
    byte field_h;
    int[] field_g;
    short[] field_f;
    static int[] field_R;
    int[] field_c;
    short[] field_l;
    int[] field_L;
    int field_A;
    int[] field_I;
    int field_B;
    short[] field_N;
    short[] field_E;
    short[] field_u;
    short[] field_x;
    int field_e;
    short field_j;
    byte[] field_J;
    static String field_H;
    short[] field_r;

    public static void c(int param0) {
        int var1 = 55 % ((param0 - 9) / 40);
        field_H = null;
        field_C = null;
        field_R = null;
        field_o = null;
        field_y = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = fleas.field_A ? 1 : 0;
        if (((si) this).field_a) {
          return;
        } else {
          ((si) this).field_a = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((si) this).field_w) {
              L1: {
                if (param0 == -23443) {
                  break L1;
                } else {
                  ((si) this).field_K = null;
                  break L1;
                }
              }
              ((si) this).field_A = var4;
              ((si) this).field_e = var3;
              ((si) this).field_k = var6;
              ((si) this).field_B = var5;
              ((si) this).field_b = var7;
              ((si) this).field_m = var2;
              return;
            } else {
              L2: {
                var9 = ((si) this).field_n[var8];
                var10 = ((si) this).field_f[var8];
                if (var5 >= var9) {
                  break L2;
                } else {
                  var5 = var9;
                  break L2;
                }
              }
              L3: {
                if (var10 >= var3) {
                  break L3;
                } else {
                  var3 = var10;
                  break L3;
                }
              }
              L4: {
                if (var6 >= var10) {
                  break L4;
                } else {
                  var6 = var10;
                  break L4;
                }
              }
              L5: {
                if (var2 <= var9) {
                  break L5;
                } else {
                  var2 = var9;
                  break L5;
                }
              }
              L6: {
                var11 = ((si) this).field_P[var8];
                if (var11 > var7) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var6 = param4;
        L0: while (true) {
          if (var6 < ((si) this).field_w) {
            ((si) this).field_n[var6] = (short)(((si) this).field_n[var6] * param0 / param1);
            ((si) this).field_f[var6] = (short)(param3 * ((si) this).field_f[var6] / param1);
            ((si) this).field_P[var6] = (short)(((si) this).field_P[var6] * param2 / param1);
            var6++;
            continue L0;
          } else {
            this.a(78);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var5 = 0;
        var6 = 15 % ((param3 - -11) / 63);
        L0: while (true) {
          if (var5 < ((si) this).field_w) {
            ((si) this).field_n[var5] = (short)(((si) this).field_n[var5] + param1);
            ((si) this).field_f[var5] = (short)(((si) this).field_f[var5] + param0);
            ((si) this).field_P[var5] = (short)(((si) this).field_P[var5] + param2);
            var5++;
            continue L0;
          } else {
            this.a(87);
            return;
          }
        }
    }

    private final void a(int param0) {
        if (param0 <= 27) {
            ((si) this).field_q = null;
        }
        ((si) this).field_a = false;
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_86_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_103_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            ib.field_g = ib.field_g + 65536;
            L1: while (true) {
              int discarded$1 = -17;
              if (a.a(hd.field_b, ib.field_g) < 65536) {
                L2: {
                  var2_int = -1;
                  if (wa.field_k == null) {
                    if (of.field_h == null) {
                      break L2;
                    } else {
                      var2_int = of.field_h.length;
                      break L2;
                    }
                  } else {
                    var2_int = wa.field_k.length;
                    break L2;
                  }
                }
                L3: {
                  if (var2_int != -1) {
                    L4: {
                      if (td.field_i >= hd.field_g) {
                        break L4;
                      } else {
                        L5: {
                          td.field_i = td.field_i + 1;
                          if (td.field_i <= hd.field_c) {
                            break L5;
                          } else {
                            L6: {
                              if (null == wa.field_k) {
                                break L6;
                              } else {
                                if (null == wa.field_k[ql.field_o]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            td.field_i = td.field_i - 1;
                            break L4;
                          }
                        }
                        if (td.field_i < hd.field_g) {
                          break L4;
                        } else {
                          if (null == wa.field_k[(1 + ql.field_o) % var2_int]) {
                            td.field_i = td.field_i - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (td.field_i >= hd.field_g) {
                        L8: {
                          t.field_a = ql.field_o;
                          if (rc.field_i) {
                            ql.field_o = ql.field_o + 1;
                            if (var2_int <= ql.field_o) {
                              ql.field_o = ql.field_o - var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            ql.field_o = ql.field_o - 1;
                            if (ql.field_o >= 0) {
                              break L8;
                            } else {
                              ql.field_o = ql.field_o + var2_int;
                              break L8;
                            }
                          }
                        }
                        td.field_i = td.field_i - hd.field_g;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (td.field_i > hd.field_c) {
                      rc.field_i = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L9: {
                  if (null != jg.field_f) {
                    L10: {
                      var3 = -(jg.field_f.field_r / 2) + 357;
                      var4 = 0;
                      if (jk.field_r == 0) {
                        break L10;
                      } else {
                        if (var3 >= ob.field_e) {
                          break L10;
                        } else {
                          if (var3 + jg.field_f.field_t > ob.field_e) {
                            L11: {
                              if (269 + -jg.field_f.field_w >= pb.field_d) {
                                break L11;
                              } else {
                                if (pb.field_d < 269) {
                                  td.field_i = hd.field_g;
                                  var4 = 1;
                                  rc.field_i = false;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (pb.field_d <= 586) {
                              break L10;
                            } else {
                              if (pb.field_d < jg.field_f.field_w + 586) {
                                rc.field_i = true;
                                var4 = 1;
                                td.field_i = hd.field_g;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (hd.field_c >= td.field_i) {
                        break L9;
                      } else {
                        if (var3 >= kc.field_b) {
                          break L9;
                        } else {
                          if (kc.field_b < jg.field_f.field_t + var3) {
                            L12: {
                              if (ag.field_f <= 269 + -jg.field_f.field_w) {
                                break L12;
                              } else {
                                if (ag.field_f >= 269) {
                                  break L12;
                                } else {
                                  td.field_i = hd.field_c;
                                  break L12;
                                }
                              }
                            }
                            if (ag.field_f <= 586) {
                              break L9;
                            } else {
                              if (ag.field_f >= jg.field_f.field_w + 586) {
                                break L9;
                              } else {
                                td.field_i = hd.field_c;
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                L13: {
                  if (!param1) {
                    break L13;
                  } else {
                    L14: {
                      ul.field_G.b(109, em.a(ob.field_e, false, pb.field_d), em.a(kc.field_b, false, ag.field_f));
                      if (!ul.field_G.b(-78)) {
                        break L14;
                      } else {
                        if (ul.field_G.field_k != 0) {
                          if (1 != ul.field_G.field_k) {
                            break L14;
                          } else {
                            stackOut_86_0 = 2;
                            stackIn_87_0 = stackOut_86_0;
                            return stackIn_87_0;
                          }
                        } else {
                          stackOut_83_0 = 3;
                          stackIn_84_0 = stackOut_83_0;
                          return stackIn_84_0;
                        }
                      }
                    }
                    stackOut_88_0 = -97;
                    stackIn_91_0 = stackOut_88_0;
                    L15: while (true) {
                      if (!wf.b(stackIn_91_0)) {
                        break L13;
                      } else {
                        L16: {
                          ul.field_G.a(0, true);
                          if (!ul.field_G.b(107)) {
                            break L16;
                          } else {
                            if (ul.field_G.field_k != 0) {
                              if (ul.field_G.field_k != 1) {
                                break L16;
                              } else {
                                stackOut_98_0 = 1;
                                stackIn_99_0 = stackOut_98_0;
                                return stackIn_99_0;
                              }
                            } else {
                              stackOut_95_0 = 3;
                              stackIn_96_0 = stackOut_95_0;
                              return stackIn_96_0;
                            }
                          }
                        }
                        if (ji.field_a != 13) {
                          stackOut_90_0 = -97;
                          stackIn_91_0 = stackOut_90_0;
                          continue L15;
                        } else {
                          stackOut_101_0 = 1;
                          stackIn_102_0 = stackOut_101_0;
                          return stackIn_102_0;
                        }
                      }
                    }
                  }
                }
                stackOut_103_0 = 0;
                stackIn_104_0 = stackOut_103_0;
                break L0;
              } else {
                ib.field_g = ib.field_g - hd.field_b;
                bf.field_b = bf.field_b + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "si.E(" + 26 + ',' + param1 + ')');
        }
        return stackIn_104_0;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = 14;
            var3_int = 0;
            L1: while (true) {
              if (0 >= param0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = 1 & param2 | var3_int << 1;
                param0--;
                param2 = param2 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "si.D(" + param0 + ',' + -56 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    si() {
        ((si) this).field_a = false;
        ((si) this).field_h = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[4];
        field_H = "<%0>Spring:<%1> Fleas standing on these are bounced up until they hit something.";
        field_o = "<%0>Blocks:<%1> fleas can walk on these, but can't climb up the sides.";
    }
}
