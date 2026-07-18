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
        try {
            int var1_int = 55 % ((param0 - 9) / 40);
            field_H = null;
            field_C = null;
            field_R = null;
            field_o = null;
            field_y = null;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "si.F(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (((si) this).field_a) {
              return;
            } else {
              ((si) this).field_a = true;
              var2_int = 32767;
              var3 = 32767;
              var4 = 32767;
              var5 = -32768;
              var6 = -32768;
              var7 = -32768;
              var8 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 >= ((si) this).field_w) {
                      break L3;
                    } else {
                      var9 = ((si) this).field_n[var8];
                      var10 = ((si) this).field_f[var8];
                      stackOut_6_0 = var5;
                      stackOut_6_1 = var9;
                      stackIn_25_0 = stackOut_6_0;
                      stackIn_25_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 >= stackIn_7_1) {
                            break L4;
                          } else {
                            var5 = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if (var10 >= var3) {
                            break L5;
                          } else {
                            var3 = var10;
                            break L5;
                          }
                        }
                        L6: {
                          if (~var6 <= ~var10) {
                            break L6;
                          } else {
                            var6 = var10;
                            break L6;
                          }
                        }
                        L7: {
                          if (~var2_int >= ~var9) {
                            break L7;
                          } else {
                            var2_int = var9;
                            break L7;
                          }
                        }
                        L8: {
                          var11 = ((si) this).field_P[var8];
                          if (var11 > var7) {
                            var7 = var11;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (~var11 <= ~var4) {
                            break L9;
                          } else {
                            var4 = var11;
                            break L9;
                          }
                        }
                        var8++;
                        if (var12 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_24_0 = param0;
                  stackOut_24_1 = -23443;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  break L2;
                }
                L10: {
                  if (stackIn_25_0 == stackIn_25_1) {
                    break L10;
                  } else {
                    ((si) this).field_K = null;
                    break L10;
                  }
                }
                ((si) this).field_A = var4;
                ((si) this).field_e = var3;
                ((si) this).field_k = var6;
                ((si) this).field_B = var5;
                ((si) this).field_b = var7;
                ((si) this).field_m = var2_int;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "si.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = param4;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6_int <= ~((si) this).field_w) {
                    break L3;
                  } else {
                    ((si) this).field_n[var6_int] = (short)(((si) this).field_n[var6_int] * param0 / param1);
                    ((si) this).field_f[var6_int] = (short)(param3 * ((si) this).field_f[var6_int] / param1);
                    ((si) this).field_P[var6_int] = (short)(((si) this).field_P[var6_int] * param2 / param1);
                    var6_int++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(78);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "si.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 15 % ((param3 - -11) / 63);
            L1: while (true) {
              L2: {
                L3: {
                  if (~var5_int <= ~((si) this).field_w) {
                    break L3;
                  } else {
                    ((si) this).field_n[var5_int] = (short)(((si) this).field_n[var5_int] + param1);
                    ((si) this).field_f[var5_int] = (short)(((si) this).field_f[var5_int] + param0);
                    ((si) this).field_P[var5_int] = (short)(((si) this).field_P[var5_int] + param2);
                    var5_int++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(87);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "si.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 27) {
                break L1;
              } else {
                ((si) this).field_q = null;
                break L1;
              }
            }
            ((si) this).field_a = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "si.B(" + param0 + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_139_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_110_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            ib.field_g = ib.field_g + 65536;
            L1: while (true) {
              L2: {
                L3: {
                  if (a.a(hd.field_b, ib.field_g, (byte) -17) < 65536) {
                    break L3;
                  } else {
                    ib.field_g = ib.field_g - hd.field_b;
                    stackOut_3_0 = bf.field_b + 1;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      bf.field_b = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              }
              L4: {
                L5: {
                  var2_int = stackIn_8_0;
                  if (wa.field_k == null) {
                    break L5;
                  } else {
                    var2_int = wa.field_k.length;
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (of.field_h == null) {
                  break L4;
                } else {
                  var2_int = of.field_h.length;
                  break L4;
                }
              }
              L6: {
                if (var2_int != -1) {
                  L7: {
                    if (td.field_i >= hd.field_g) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          td.field_i = td.field_i + 1;
                          if (~td.field_i >= ~hd.field_c) {
                            break L9;
                          } else {
                            if (null == wa.field_k) {
                              break L8;
                            } else {
                              if (null == wa.field_k[ql.field_o]) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (~td.field_i > ~hd.field_g) {
                          break L7;
                        } else {
                          if (null == wa.field_k[(1 + ql.field_o) % var2_int]) {
                            td.field_i = td.field_i - 1;
                            if (var5 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      td.field_i = td.field_i - 1;
                      break L7;
                    }
                  }
                  L10: {
                    if (~td.field_i <= ~hd.field_g) {
                      L11: {
                        L12: {
                          t.field_a = ql.field_o;
                          if (rc.field_i) {
                            break L12;
                          } else {
                            ql.field_o = ql.field_o - 1;
                            if (ql.field_o >= 0) {
                              break L11;
                            } else {
                              ql.field_o = ql.field_o + var2_int;
                              if (var5 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        ql.field_o = ql.field_o + 1;
                        if (~var2_int >= ~ql.field_o) {
                          ql.field_o = ql.field_o - var2_int;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      td.field_i = td.field_i - hd.field_g;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (~td.field_i < ~hd.field_c) {
                    rc.field_i = true;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L13: {
                if (null != jg.field_f) {
                  L14: {
                    var3 = -(jg.field_f.field_r / 2) + 357;
                    var4 = 0;
                    if (jk.field_r == 0) {
                      break L14;
                    } else {
                      if (~var3 <= ~ob.field_e) {
                        break L14;
                      } else {
                        if (~(var3 + jg.field_f.field_t) < ~ob.field_e) {
                          L15: {
                            if (269 + -jg.field_f.field_w >= pb.field_d) {
                              break L15;
                            } else {
                              if (pb.field_d < 269) {
                                td.field_i = hd.field_g;
                                var4 = 1;
                                rc.field_i = false;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          if (pb.field_d <= 586) {
                            break L14;
                          } else {
                            if (~pb.field_d > ~(jg.field_f.field_w + 586)) {
                              rc.field_i = true;
                              var4 = 1;
                              td.field_i = hd.field_g;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L13;
                  } else {
                    if (~hd.field_c <= ~td.field_i) {
                      break L13;
                    } else {
                      if (~var3 <= ~kc.field_b) {
                        break L13;
                      } else {
                        if (kc.field_b < jg.field_f.field_t + var3) {
                          L16: {
                            if (ag.field_f <= 269 + -jg.field_f.field_w) {
                              break L16;
                            } else {
                              if (ag.field_f >= 269) {
                                break L16;
                              } else {
                                td.field_i = hd.field_c;
                                break L16;
                              }
                            }
                          }
                          if (ag.field_f <= 586) {
                            break L13;
                          } else {
                            if (ag.field_f >= jg.field_f.field_w + 586) {
                              break L13;
                            } else {
                              td.field_i = hd.field_c;
                              break L13;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                } else {
                  break L13;
                }
              }
              if (param0 > 3) {
                L17: {
                  L18: {
                    if (!param1) {
                      break L18;
                    } else {
                      L19: {
                        ul.field_G.b(109, em.a(ob.field_e, false, pb.field_d), em.a(kc.field_b, false, ag.field_f));
                        if (!ul.field_G.b(-78)) {
                          break L19;
                        } else {
                          if (ul.field_G.field_k != 0) {
                            if (1 != ul.field_G.field_k) {
                              break L19;
                            } else {
                              stackOut_122_0 = 2;
                              stackIn_123_0 = stackOut_122_0;
                              return stackIn_123_0;
                            }
                          } else {
                            stackOut_119_0 = 3;
                            stackIn_120_0 = stackOut_119_0;
                            return stackIn_120_0;
                          }
                        }
                      }
                      L20: while (true) {
                        if (!wf.b(-97)) {
                          break L18;
                        } else {
                          L21: {
                            ul.field_G.a(0, true);
                            if (!ul.field_G.b(107)) {
                              break L21;
                            } else {
                              if (ul.field_G.field_k != 0) {
                                if (ul.field_G.field_k != 1) {
                                  break L21;
                                } else {
                                  stackOut_132_0 = 1;
                                  stackIn_133_0 = stackOut_132_0;
                                  return stackIn_133_0;
                                }
                              } else {
                                stackOut_129_0 = 3;
                                stackIn_130_0 = stackOut_129_0;
                                return stackIn_130_0;
                              }
                            }
                          }
                          if (ji.field_a != 13) {
                            continue L20;
                          } else {
                            stackOut_135_0 = 1;
                            stackIn_136_0 = stackOut_135_0;
                            stackOut_136_0 = stackIn_136_0;
                            stackIn_139_0 = stackOut_136_0;
                            stackIn_137_0 = stackOut_136_0;
                            if (var5 != 0) {
                              break L17;
                            } else {
                              return stackIn_137_0;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_138_0 = 0;
                  stackIn_139_0 = stackOut_138_0;
                  break L17;
                }
                break L0;
              } else {
                stackOut_110_0 = 107;
                stackIn_111_0 = stackOut_110_0;
                return stackIn_111_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "si.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_139_0;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = -14 / ((param1 - 2) / 51);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (0 >= param0) {
                    break L3;
                  } else {
                    var3_int = 1 & param2 | var3_int << 590365569;
                    param0--;
                    stackOut_3_0 = param2 >>> 1;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      param2 = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "si.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
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
