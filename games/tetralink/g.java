/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends eb {
    private int field_R;
    private int[] field_r;
    private int[] field_V;
    int[] field_I;
    private int[] field_H;
    private int[] field_t;
    static String field_O;
    private dj field_A;
    private int[] field_v;
    static int field_s;
    private int[] field_K;
    private int field_X;
    private int[] field_M;
    private int[] field_u;
    private int[] field_Q;
    private int[] field_E;
    int[] field_T;
    private wj field_N;
    private oc[][] field_J;
    private int[] field_L;
    private oc[][] field_B;
    int[] field_G;
    private int[] field_w;
    private int[] field_W;
    private long field_C;
    private wn field_y;
    private boolean field_x;
    private int field_Y;
    private int field_S;
    private long field_D;
    private boolean field_U;
    private int field_F;
    private ri field_z;

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2_int = ((g) this).field_Y;
              if (param0 > 19) {
                break L1;
              } else {
                ((g) this).field_V = null;
                break L1;
              }
            }
            L2: {
              var3 = ((g) this).field_S;
              var4 = ((g) this).field_C;
              if (null == ((g) this).field_z) {
                break L2;
              } else {
                if (~((g) this).field_F != ~var3) {
                  break L2;
                } else {
                  this.a(((g) this).field_z, 0, ((g) this).field_U, ((g) this).field_x);
                  this.b((byte) 38);
                  return;
                }
              }
            }
            L3: while (true) {
              stackOut_10_0 = ~var3;
              stackOut_10_1 = ~((g) this).field_S;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (stackIn_11_0 != stackIn_11_1) {
                        break L7;
                      } else {
                        L8: while (true) {
                          stackOut_12_0 = var3;
                          stackOut_12_1 = ((g) this).field_N.field_g[var2_int];
                          stackIn_46_0 = stackOut_12_0;
                          stackIn_46_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (var7 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (stackIn_13_0 != stackIn_13_1) {
                                break L9;
                              } else {
                                ((g) this).field_N.f(var2_int);
                                var6 = ((g) this).field_N.c(var2_int);
                                stackOut_14_0 = -2;
                                stackOut_14_1 = ~var6;
                                stackIn_11_0 = stackOut_14_0;
                                stackIn_11_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_15_0 != stackIn_15_1) {
                                    L10: {
                                      if ((128 & var6) == 0) {
                                        break L10;
                                      } else {
                                        this.f(91, var6);
                                        break L10;
                                      }
                                    }
                                    ((g) this).field_N.e(var2_int);
                                    ((g) this).field_N.b(var2_int);
                                    if (var7 == 0) {
                                      continue L8;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    L11: {
                                      ((g) this).field_N.c();
                                      ((g) this).field_N.b(var2_int);
                                      if (((g) this).field_N.a()) {
                                        break L11;
                                      } else {
                                        if (var7 == 0) {
                                          break L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (((g) this).field_z != null) {
                                      ((g) this).a(((g) this).field_x, ((g) this).field_z, (byte) 123);
                                      this.b((byte) 108);
                                      return;
                                    } else {
                                      L12: {
                                        if (!((g) this).field_x) {
                                          break L12;
                                        } else {
                                          if (var3 == 0) {
                                            break L12;
                                          } else {
                                            ((g) this).field_N.a(var4);
                                            if (var7 == 0) {
                                              break L9;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                      this.a(true, (byte) 127);
                                      ((g) this).field_N.d();
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((g) this).field_N.g();
                            var3 = ((g) this).field_N.field_g[var2_int];
                            var4 = ((g) this).field_N.d(var3);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    ((g) this).field_C = var4;
                    ((g) this).field_Y = var2_int;
                    ((g) this).field_S = var3;
                    if (((g) this).field_z == null) {
                      break L5;
                    } else {
                      stackOut_44_0 = var3;
                      stackOut_44_1 = ((g) this).field_F;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      break L6;
                    }
                  }
                  if (stackIn_46_0 > stackIn_46_1) {
                    ((g) this).field_Y = -1;
                    ((g) this).field_S = ((g) this).field_F;
                    ((g) this).field_C = ((g) this).field_N.d(((g) this).field_S);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "g.IA(" + param0 + ')');
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            var3_int = 240 & param1;
            if (128 != var3_int) {
              if (var3_int != 144) {
                if (160 != var3_int) {
                  if (var3_int != 176) {
                    if (var3_int == 192) {
                      var4 = 15 & param1;
                      var5 = (32759 & param1) >> 1805059432;
                      this.c(var5 + ((g) this).field_M[var4], -2, var4);
                      return;
                    } else {
                      if (var3_int != 208) {
                        if (var3_int != 224) {
                          var3_int = 255 & param1;
                          if (var3_int == 255) {
                            this.a(true, (byte) 77);
                            return;
                          } else {
                            L1: {
                              if (param0 >= 67) {
                                break L1;
                              } else {
                                ((g) this).field_X = -10;
                                break L1;
                              }
                            }
                            break L0;
                          }
                        } else {
                          var4 = 15 & param1;
                          var5 = ((param1 & 8323385) >> -963451735) - -((param1 & 32630) >> -1920798552);
                          this.d(-27508, var4, var5);
                          return;
                        }
                      } else {
                        var4 = 15 & param1;
                        var5 = (32749 & param1) >> 907433544;
                        this.a((byte) -62, var5, var4);
                        return;
                      }
                    }
                  } else {
                    L2: {
                      var4 = param1 & 15;
                      var5 = param1 >> 914445448 & 127;
                      var6 = 127 & param1 >> 2057021136;
                      if (var5 == 0) {
                        ((g) this).field_M[var4] = pl.a(-2080769, ((g) this).field_M[var4]) - -(var6 << -947925778);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (32 != var5) {
                        break L3;
                      } else {
                        ((g) this).field_M[var4] = (var6 << -505531545) + pl.a(((g) this).field_M[var4], -16257);
                        break L3;
                      }
                    }
                    L4: {
                      if (1 != var5) {
                        break L4;
                      } else {
                        ((g) this).field_t[var4] = pl.a(((g) this).field_t[var4], -16257) + (var6 << -1208268313);
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 == 33) {
                        ((g) this).field_t[var4] = pl.a(((g) this).field_t[var4], -128) + var6;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (5 != var5) {
                        break L6;
                      } else {
                        ((g) this).field_V[var4] = pl.a(((g) this).field_V[var4], -16257) - -(var6 << 1697963335);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 == 37) {
                        ((g) this).field_V[var4] = pl.a(((g) this).field_V[var4], -128) + var6;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 != 7) {
                        break L8;
                      } else {
                        ((g) this).field_u[var4] = pl.a(-16257, ((g) this).field_u[var4]) - -(var6 << -788335705);
                        break L8;
                      }
                    }
                    L9: {
                      if (var5 == 39) {
                        ((g) this).field_u[var4] = var6 + pl.a(-128, ((g) this).field_u[var4]);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var5 == 10) {
                        ((g) this).field_r[var4] = (var6 << -141913977) + pl.a(((g) this).field_r[var4], -16257);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 != 42) {
                        break L11;
                      } else {
                        ((g) this).field_r[var4] = pl.a(((g) this).field_r[var4], -128) - -var6;
                        break L11;
                      }
                    }
                    L12: {
                      if (var5 != 11) {
                        break L12;
                      } else {
                        ((g) this).field_W[var4] = pl.a(((g) this).field_W[var4], -16257) + (var6 << -1658171065);
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 != 43) {
                        break L13;
                      } else {
                        ((g) this).field_W[var4] = var6 + pl.a(-128, ((g) this).field_W[var4]);
                        break L13;
                      }
                    }
                    L14: {
                      if (64 != var5) {
                        break L14;
                      } else {
                        L15: {
                          if (64 <= var6) {
                            break L15;
                          } else {
                            ((g) this).field_I[var4] = pl.a(((g) this).field_I[var4], -2);
                            if (var8 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        ((g) this).field_I[var4] = mc.a(((g) this).field_I[var4], 1);
                        break L14;
                      }
                    }
                    L16: {
                      if (65 != var5) {
                        break L16;
                      } else {
                        L17: {
                          if (var6 >= 64) {
                            break L17;
                          } else {
                            this.a(var4, (byte) 116);
                            ((g) this).field_I[var4] = pl.a(((g) this).field_I[var4], -3);
                            if (var8 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ((g) this).field_I[var4] = mc.a(((g) this).field_I[var4], 2);
                        break L16;
                      }
                    }
                    L18: {
                      if (var5 != 99) {
                        break L18;
                      } else {
                        ((g) this).field_v[var4] = pl.a(127, ((g) this).field_v[var4]) - -(var6 << 1332664455);
                        break L18;
                      }
                    }
                    L19: {
                      if (var5 != 98) {
                        break L19;
                      } else {
                        ((g) this).field_v[var4] = var6 + pl.a(16256, ((g) this).field_v[var4]);
                        break L19;
                      }
                    }
                    L20: {
                      if (var5 != 101) {
                        break L20;
                      } else {
                        ((g) this).field_v[var4] = pl.a(127, ((g) this).field_v[var4]) + 16384 + (var6 << -1691504825);
                        break L20;
                      }
                    }
                    L21: {
                      if (var5 != 100) {
                        break L21;
                      } else {
                        ((g) this).field_v[var4] = var6 + 16384 + pl.a(16256, ((g) this).field_v[var4]);
                        break L21;
                      }
                    }
                    L22: {
                      if (var5 == 120) {
                        this.b((byte) -119, var4);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (121 == var5) {
                        this.d(var4, 16384);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (var5 != 123) {
                        break L24;
                      } else {
                        this.e(var4, -58);
                        break L24;
                      }
                    }
                    L25: {
                      if (var5 == 6) {
                        var7 = ((g) this).field_v[var4];
                        if (var7 == 16384) {
                          ((g) this).field_K[var4] = (var6 << 1762435623) + pl.a(((g) this).field_K[var4], -16257);
                          break L25;
                        } else {
                          break L25;
                        }
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (38 != var5) {
                        break L26;
                      } else {
                        var7 = ((g) this).field_v[var4];
                        if (var7 == 16384) {
                          ((g) this).field_K[var4] = var6 + pl.a(((g) this).field_K[var4], -128);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (var5 != 16) {
                        break L27;
                      } else {
                        ((g) this).field_G[var4] = pl.a(((g) this).field_G[var4], -16257) - -(var6 << 737750855);
                        break L27;
                      }
                    }
                    L28: {
                      if (var5 == 48) {
                        ((g) this).field_G[var4] = pl.a(-128, ((g) this).field_G[var4]) - -var6;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (var5 != 81) {
                        break L29;
                      } else {
                        L30: {
                          if (64 > var6) {
                            break L30;
                          } else {
                            ((g) this).field_I[var4] = mc.a(((g) this).field_I[var4], 4);
                            if (var8 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        this.b(var4, 114);
                        ((g) this).field_I[var4] = pl.a(((g) this).field_I[var4], -5);
                        break L29;
                      }
                    }
                    L31: {
                      if (var5 == 17) {
                        this.f(var4, 13242, (-16257 & ((g) this).field_L[var4]) + (var6 << 1524742343));
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      if (var5 != 49) {
                        break L32;
                      } else {
                        this.f(var4, 13242, var6 + (-128 & ((g) this).field_L[var4]));
                        break L32;
                      }
                    }
                    return;
                  }
                } else {
                  var4 = param1 & 15;
                  var5 = (param1 & 32674) >> -2138388120;
                  var6 = (param1 & 8343902) >> 487759088;
                  this.a(false, var4, var5, var6);
                  return;
                }
              } else {
                L33: {
                  L34: {
                    var4 = 15 & param1;
                    var5 = (param1 & 32590) >> 1670248424;
                    var6 = (8359574 & param1) >> -341086288;
                    if (var6 <= 0) {
                      break L34;
                    } else {
                      this.a(var5, var6, -25798, var4);
                      if (var8 == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  this.a(var5, (byte) 77, var4, 64);
                  break L33;
                }
                return;
              }
            } else {
              var4 = param1 & 15;
              var5 = param1 >> 284317704 & 127;
              var6 = (8323462 & param1) >> -612721296;
              this.a(var5, (byte) 77, var4, var6);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "g.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(oc param0, int param1) {
        RuntimeException var3 = null;
        lm var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (((g) this).field_w[param0.field_n] == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_ref = param0.field_q;
                var4 = 4096 + ((g) this).field_W[param0.field_n] * ((g) this).field_u[param0.field_n] >> -823009363;
                var4 = 16384 + var4 * var4 >> -2039942801;
                var4 = 16384 + param0.field_J * var4 >> -2039204881;
                var4 = var4 * ((g) this).field_X - -128 >> 1633766472;
                var4 = var4 * ((g) this).field_w[param0.field_n] - -128 >> 1094746472;
                if (var3_ref.field_a > 0) {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)var3_ref.field_a * (0.00001953125 * (double)param0.field_t)) + 0.5);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 16402) {
                  break L2;
                } else {
                  field_O = null;
                  break L2;
                }
              }
              L3: {
                if (null == var3_ref.field_d) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_o;
                    var6 = var3_ref.field_d[1 + param0.field_G];
                    if (~param0.field_G > ~(-2 + var3_ref.field_d.length)) {
                      var7 = var3_ref.field_d[param0.field_G] << -865160376 & 65280;
                      var8 = (var3_ref.field_d[2 + param0.field_G] & 255) << 147655528;
                      var6 = var6 + (var5 - var7) * (var3_ref.field_d[3 + param0.field_G] - var6) / (var8 + -var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = 32 + var6 * var4 >> -22295034;
                  break L3;
                }
              }
              L5: {
                if (0 >= param0.field_v) {
                  break L5;
                } else {
                  if (null == var3_ref.field_e) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_v;
                      var6 = var3_ref.field_e[param0.field_A + 1];
                      if (param0.field_A >= -2 + var3_ref.field_e.length) {
                        break L6;
                      } else {
                        var7 = var3_ref.field_e[param0.field_A] << 456528392 & 65280;
                        var8 = (var3_ref.field_e[param0.field_A - -2] & 255) << -1875788184;
                        var6 = var6 + (var5 - var7) * (-var6 + var3_ref.field_e[param0.field_A + 3]) / (-var7 + var8);
                        break L6;
                      }
                    }
                    var4 = 32 + var6 * var4 >> 1340966406;
                    break L5;
                  }
                }
              }
              stackOut_25_0 = var4;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("g.M(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    private final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        oc var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if ((((g) this).field_I[param0] & 4) == 0) {
                  break L2;
                } else {
                  var3 = (oc) (Object) ((g) this).field_y.field_u.c(false);
                  L3: while (true) {
                    if (null == var3) {
                      break L2;
                    } else {
                      stackOut_4_0 = param0;
                      stackOut_4_1 = var3.field_n;
                      stackIn_12_0 = stackOut_4_0;
                      stackIn_12_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 != stackIn_5_1) {
                            break L4;
                          } else {
                            var3.field_F = 0;
                            break L4;
                          }
                        }
                        var3 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_11_0 = 65;
              stackOut_11_1 = (10 - param1) / 37;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L1;
            }
            var3_int = stackIn_12_0 / stackIn_12_1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) (Object) runtimeException, "g.I(" + param0 + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        hl stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        hl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        hl stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        hl stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        hl stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        try {
          L0: {
            L1: {
              stackOut_0_0 = gm.field_d;
              stackOut_0_1 = -92;
              stackOut_0_2 = hh.field_c.field_Hb;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_3_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (!kj.field_b) {
                stackOut_3_0 = (hl) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_1_0 = (hl) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = ha.field_e + 2 + 42;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                stackIn_4_3 = stackOut_1_3;
                break L1;
              }
            }
            L2: {
              ((hl) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2 - stackIn_4_3, 0, 18, 0);
              if (param0 == 1753) {
                break L2;
              } else {
                field_s = 47;
                break L2;
              }
            }
            qc.field_eb.a((byte) -93, 42 + ha.field_e, 0, 18, -40 + hh.field_c.field_Hb + (-ha.field_e + -2));
            hn.field_Q.a(hh.field_c.field_Hb, ha.field_e, hh.field_c.field_R - 20, true, 20, 0, 2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "g.V(" + param0 + ')');
        }
    }

    private final int a(byte param0, oc param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = ((g) this).field_r[param1.field_n];
            var4 = -71 / ((-33 - param0) / 52);
            if (var3_int < 8192) {
              stackOut_3_0 = 32 + param1.field_r * var3_int >> 784401958;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -((-param1.field_r + 128) * (16384 - var3_int) + 32 >> 1494207622) + 16384;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("g.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static oh[] a(int param0, int param1, int param2, byte param3) {
        oh[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        oh[] stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        oh[] stackOut_11_0 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            var4 = new oh[9];
            var4[0] = ce.a(param1, param2, 0);
            var5 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (9 <= var5) {
                    break L3;
                  } else {
                    var4[var5] = var4[0];
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4[4] = ce.a(param0, 64, 0);
                break L2;
              }
              L4: {
                if (param3 > 44) {
                  break L4;
                } else {
                  g.a(78, (byte) -73, -70);
                  break L4;
                }
              }
              stackOut_11_0 = (oh[]) var4;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4_ref, "g.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (((g) this).field_N.f()) {
                var2_int = ((g) this).field_R * ((g) this).field_N.field_f / nk.field_k;
                L2: while (true) {
                  L3: {
                    var3 = (long)param0 * (long)var2_int + ((g) this).field_D;
                    if (((g) this).field_C - var3 >= 0L) {
                      ((g) this).field_D = var3;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var5 = (int)((-1L + (long)var2_int + ((g) this).field_C + -((g) this).field_D) / (long)var2_int);
                    ((g) this).field_D = ((g) this).field_D + (long)var5 * (long)var2_int;
                    ((g) this).field_y.a(var5);
                    param0 = param0 - var5;
                    this.b((byte) 110);
                    if (((g) this).field_N.f()) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            ((g) this).field_y.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "g.VA(" + param0 + ')');
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -95) {
                break L1;
              } else {
                this.a((byte) 8, 116, 107);
                break L1;
              }
            }
            this.a(param0, -121, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "g.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_O = null;
            int var1_int = -46 % ((54 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.N(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        try {
            if (param0 != -62) {
                ((g) this).d(96);
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (param2 > 54) {
              L1: {
                L2: {
                  L3: {
                    if (param1 < 0) {
                      break L3;
                    } else {
                      ((g) this).field_w[param1] = param0;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_int = 0;
                  L4: while (true) {
                    if (16 <= var4_int) {
                      break L2;
                    } else {
                      ((g) this).field_w[var4_int] = param0;
                      var4_int++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "g.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 487759088) {
                break L1;
              } else {
                boolean discarded$2 = ((g) this).a((fa) null, (ri) null, (ah) null, -13, -73);
                break L1;
              }
            }
            ((g) this).field_N.d();
            ((g) this).field_z = null;
            this.a(param1, (byte) 39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "g.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        try {
          L0: {
            var2_int = -65 / ((14 - param0) / 33);
            stackOut_0_0 = ((g) this).field_N.f();
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "g.UA(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final boolean b(byte param0, oc param1) {
        RuntimeException var3 = null;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 94) {
                break L1;
              } else {
                field_s = -84;
                break L1;
              }
            }
            if (null != param1.field_I) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              L2: {
                if (param1.field_v < 0) {
                  break L2;
                } else {
                  param1.b(false);
                  if (param1.field_C <= 0) {
                    break L2;
                  } else {
                    if (param1 != ((g) this).field_J[param1.field_n][param1.field_C]) {
                      break L2;
                    } else {
                      ((g) this).field_J[param1.field_n][param1.field_C] = null;
                      break L2;
                    }
                  }
                }
              }
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("g.HA(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized int a() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "g.OA()");
        }
        return stackIn_1_0;
    }

    private final void f(int param0, int param1, int param2) {
        ((g) this).field_L[param0] = param2;
        if (param1 != 13242) {
            return;
        }
        try {
            ((g) this).field_T[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param2 * 0.00054931640625));
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(String[] args, String param1, int param2, byte param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param3 == 3) {
                break L1;
              } else {
                field_O = null;
                break L1;
              }
            }
            L2: {
              L3: {
                pi.field_a = ik.field_d;
                if (param2 != 255) {
                  break L3;
                } else {
                  L4: {
                    if (13 <= wh.field_k) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L4;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L4;
                    }
                  }
                  pm.field_f = al.a(stackIn_11_0 != 0, 1);
                  ia.a((String[]) null, param3 ^ 10535);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (param2 < 100) {
                  break L5;
                } else {
                  if (105 < param2) {
                    break L5;
                  } else {
                    var4 = args;
                    ia.a(var4, 10532);
                    pm.field_f = ng.a((byte) -67, args);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              pm.field_f = hj.a(param1, param2, false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4_ref;
            stackOut_22_1 = new StringBuilder().append("g.H(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (args == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((g) this).field_H[param0] = param2;
              ((g) this).field_M[param0] = pl.a(param2, -128);
              if (param1 < -70) {
                break L1;
              } else {
                ((g) this).a((byte) -28, 93);
                break L1;
              }
            }
            this.c(param2, -2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "g.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        el var3 = null;
        bc var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == nd.field_Nb) {
                break L1;
              } else {
                L2: {
                  var3 = (el) (Object) db.field_e.a((long)nd.field_Nb, 1);
                  if (var3 == null) {
                    break L2;
                  } else {
                    var3.field_fc = null;
                    break L2;
                  }
                }
                nd.field_Nb = param2;
                var4 = nd.field_Lb;
                var4.f(param0, (byte) -92);
                var4.a(3, false);
                var4.a(11, false);
                var4.b(param2, false);
                break L1;
              }
            }
            L3: {
              if (param1 <= -113) {
                break L3;
              } else {
                g.c((byte) -93);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) (Object) runtimeException, "g.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void e(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        bc var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = nd.field_Lb;
              var3.f(param2, (byte) -92);
              var3.a(3, false);
              var3.a(9, false);
              var3.b(param0, false);
              if (param1 <= -122) {
                break L1;
              } else {
                g.a(39, (byte) -68, -123);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) (Object) runtimeException, "g.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        RuntimeException runtimeException = null;
        oc var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            var4 = -66 / ((9 - param0) / 45);
            var3 = (oc) (Object) ((g) this).field_y.field_u.c(false);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (param1 < 0) {
                            break L5;
                          } else {
                            if (var3.field_n == param1) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (var3.field_I == null) {
                            break L6;
                          } else {
                            L7: {
                              var3.field_I.g(nk.field_k / 100);
                              if (!var3.field_I.g()) {
                                break L7;
                              } else {
                                ((g) this).field_y.field_s.a((eb) (Object) var3.field_I);
                                break L7;
                              }
                            }
                            var3.a(77);
                            break L6;
                          }
                        }
                        L8: {
                          if (0 <= var3.field_v) {
                            break L8;
                          } else {
                            ((g) this).field_B[var3.field_n][var3.field_E] = null;
                            break L8;
                          }
                        }
                        var3.b(false);
                        break L4;
                      }
                      var3 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) (Object) runtimeException, "g.F(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(boolean param0, ri param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, 0, true, param0);
              if (param2 > 1) {
                break L1;
              } else {
                ((g) this).field_W = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("g.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final synchronized eb c() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "g.FA()");
        }
        return (eb) (Object) stackIn_1_0;
    }

    private final void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        oc var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -107 / ((param1 - -65) / 51);
                if ((2 & ((g) this).field_I[param0]) == 0) {
                  break L2;
                } else {
                  var4 = (oc) (Object) ((g) this).field_y.field_u.c(false);
                  L3: while (true) {
                    if (null == var4) {
                      break L2;
                    } else {
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (~var4.field_n != ~param0) {
                            break L4;
                          } else {
                            if (((g) this).field_B[param0][var4.field_E] == null) {
                              if (var4.field_v >= 0) {
                                break L4;
                              } else {
                                var4.field_v = 0;
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) (Object) runtimeException, "g.B(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void e(byte param0) {
        ng var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 >= 111) {
                break L1;
              } else {
                int discarded$2 = ((g) this).a();
                break L1;
              }
            }
            var2 = (ng) (Object) ((g) this).field_A.b(84);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2) {
                    break L4;
                  } else {
                    var2.b((byte) -118);
                    var2 = (ng) (Object) ((g) this).field_A.a(-1);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "g.P(" + param0 + ')');
        }
    }

    final synchronized eb b() {
        RuntimeException var1 = null;
        wn stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        wn stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((g) this).field_y;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "g.QA()");
        }
        return (eb) (Object) stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        ng var5_ref = null;
        oc var5_ref2 = null;
        wf var6 = null;
        int var6_int = 0;
        oc var7 = null;
        oc var8 = null;
        int var9 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        oc stackIn_23_2 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        oc stackIn_25_2 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        oc stackIn_27_2 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        oc stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        oc stackOut_22_2 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        oc stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        oc stackOut_23_2 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        oc stackOut_25_2 = null;
        int stackOut_25_3 = 0;
        var9 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              this.a(param0, (byte) 77, param3, 64);
              if ((((g) this).field_I[param3] & 2) == 0) {
                break L1;
              } else {
                var5_ref2 = (oc) (Object) ((g) this).field_y.field_u.d(true);
                L2: while (true) {
                  if (null == var5_ref2) {
                    break L1;
                  } else {
                    L3: {
                      if (param3 != var5_ref2.field_n) {
                        break L3;
                      } else {
                        if (var5_ref2.field_v >= 0) {
                          break L3;
                        } else {
                          ((g) this).field_B[param3][var5_ref2.field_E] = null;
                          ((g) this).field_B[param3][param0] = var5_ref2;
                          var6_int = (var5_ref2.field_D * var5_ref2.field_u >> 813206924) + var5_ref2.field_x;
                          var5_ref2.field_x = var5_ref2.field_x + (-var5_ref2.field_E + param0 << 45013032);
                          var5_ref2.field_E = param0;
                          var5_ref2.field_D = 4096;
                          var5_ref2.field_u = -var5_ref2.field_x + var6_int;
                          return;
                        }
                      }
                    }
                    var5_ref2 = (oc) (Object) ((g) this).field_y.field_u.d((byte) 14);
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var5_ref = (ng) (Object) ((g) this).field_A.a((long)((g) this).field_E[param3], (byte) -43);
            if (null != var5_ref) {
              var6 = var5_ref.field_z[param0];
              if (var6 != null) {
                L4: {
                  var7 = new oc();
                  var7.field_B = var5_ref;
                  var7.field_y = var6;
                  var7.field_n = param3;
                  var7.field_q = var5_ref.field_v[param0];
                  if (param2 == -25798) {
                    break L4;
                  } else {
                    ((g) this).c(-115, -32);
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    var7.field_C = var5_ref.field_p[param0];
                    var7.field_E = param0;
                    var7.field_J = var5_ref.field_A[param0] * (var5_ref.field_C * param1 * param1) - -1024 >> -2137829141;
                    var7.field_r = 255 & var5_ref.field_w[param0];
                    var7.field_x = (param0 << 1408036168) - (32767 & var5_ref.field_o[param0]);
                    var7.field_A = 0;
                    var7.field_o = 0;
                    var7.field_v = -1;
                    var7.field_G = 0;
                    var7.field_t = 0;
                    if (((g) this).field_G[param3] != 0) {
                      break L6;
                    } else {
                      var7.field_I = ee.a(var6, this.a(-18511, var7), this.a(var7, 16402), this.a((byte) 87, var7));
                      if (var9 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var7.field_I = ee.a(var6, this.a(-18511, var7), 0, this.a((byte) 24, var7));
                    stackOut_22_0 = this;
                    stackOut_22_1 = 0;
                    stackOut_22_2 = (oc) var7;
                    stackIn_27_0 = stackOut_22_0;
                    stackIn_27_1 = stackOut_22_1;
                    stackIn_27_2 = stackOut_22_2;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    if (var5_ref.field_o[param0] >= 0) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = stackIn_27_1;
                      stackOut_27_2 = (oc) (Object) stackIn_27_2;
                      stackOut_27_3 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      stackIn_28_3 = stackOut_27_3;
                      break L7;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = (oc) (Object) stackIn_23_2;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackOut_25_0 = this;
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = (oc) (Object) stackIn_25_2;
                      stackOut_25_3 = 1;
                      stackIn_28_0 = stackOut_25_0;
                      stackIn_28_1 = stackOut_25_1;
                      stackIn_28_2 = stackOut_25_2;
                      stackIn_28_3 = stackOut_25_3;
                      break L7;
                    }
                  }
                  ((g) this).a(stackIn_28_1 != 0, stackIn_28_2, stackIn_28_3 != 0);
                  break L5;
                }
                L8: {
                  if (var5_ref.field_o[param0] >= 0) {
                    break L8;
                  } else {
                    var7.field_I.c(-1);
                    break L8;
                  }
                }
                L9: {
                  if (0 <= var7.field_C) {
                    L10: {
                      var8 = ((g) this).field_J[param3][var7.field_C];
                      if (null == var8) {
                        break L10;
                      } else {
                        if (var8.field_v < 0) {
                          ((g) this).field_B[param3][var8.field_E] = null;
                          var8.field_v = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ((g) this).field_J[param3][var7.field_C] = var7;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((g) this).field_y.field_u.a((mc) (Object) var7, false);
                ((g) this).field_B[param3][param0] = var7;
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var5, "g.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(byte param0, int param1) {
        try {
            int var3_int = 97 / ((param0 - 45) / 38);
            ((g) this).field_X = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param0 != -27508) {
            return;
        }
        try {
            ((g) this).field_Q[param1] = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        try {
            if (param0) {
                ((g) this).field_Y = -94;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int[] param1, int param2, oc param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        lm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_124_0 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_121_0 = 0;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              param3.field_s = nk.field_k / 100;
              if (0 > param3.field_v) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_I) {
                    break L2;
                  } else {
                    if (param3.field_I.l()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.a(-121);
                  param3.b(false);
                  if (param3.field_C <= 0) {
                    break L3;
                  } else {
                    if (((g) this).field_J[param3.field_n][param3.field_C] == param3) {
                      ((g) this).field_J[param3.field_n][param3.field_C] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_D;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((g) this).field_V[param3.field_n]));
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_D = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_I.d(this.a(-18511, param3));
              if (param4 == 21107) {
                break L6;
              } else {
                ((g) this).field_G = null;
                break L6;
              }
            }
            L7: {
              var7 = param3.field_q;
              param3.field_p = param3.field_p + var7.field_k;
              param3.field_H = param3.field_H + 1;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((param3.field_E + -60 << 209385224) - -(param3.field_D * param3.field_u >> 800976684));
              if (0 >= var7.field_a) {
                break L7;
              } else {
                L8: {
                  L9: {
                    if (var7.field_i <= 0) {
                      break L9;
                    } else {
                      param3.field_t = param3.field_t + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
                      if (var11 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  param3.field_t = param3.field_t + 128;
                  break L8;
                }
                if (param3.field_t * var7.field_a < 819200) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              }
            }
            L10: {
              if (var7.field_d == null) {
                break L10;
              } else {
                L11: {
                  L12: {
                    if (var7.field_b > 0) {
                      break L12;
                    } else {
                      param3.field_o = param3.field_o + 128;
                      if (var11 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                  break L11;
                }
                L13: while (true) {
                  L14: {
                    L15: {
                      if (var7.field_d.length + -2 <= param3.field_G) {
                        break L15;
                      } else {
                        stackOut_51_0 = ~param3.field_o;
                        stackOut_51_1 = ~((255 & var7.field_d[2 + param3.field_G]) << 2089748008);
                        stackIn_59_0 = stackOut_51_0;
                        stackIn_59_1 = stackOut_51_1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        if (var11 != 0) {
                          break L14;
                        } else {
                          if (stackIn_52_0 >= stackIn_52_1) {
                            break L15;
                          } else {
                            param3.field_G = param3.field_G + 2;
                            if (var11 == 0) {
                              continue L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    stackOut_58_0 = var7.field_d.length + -2;
                    stackOut_58_1 = param3.field_G;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    break L14;
                  }
                  if (stackIn_59_0 != stackIn_59_1) {
                    break L10;
                  } else {
                    if (var7.field_d[param3.field_G + 1] == 0) {
                      var8 = 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
              }
            }
            L16: {
              if (0 > param3.field_v) {
                break L16;
              } else {
                if (var7.field_e == null) {
                  break L16;
                } else {
                  if ((((g) this).field_I[param3.field_n] & 1) == 0) {
                    L17: {
                      if (param3.field_C < 0) {
                        break L17;
                      } else {
                        if (((g) this).field_J[param3.field_n][param3.field_C] != param3) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (var7.field_j > 0) {
                          break L19;
                        } else {
                          param3.field_v = param3.field_v + 128;
                          if (var11 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_j * var9) + 0.5);
                      break L18;
                    }
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (~(-2 + var7.field_e.length) >= ~param3.field_A) {
                            break L22;
                          } else {
                            stackOut_88_0 = var7.field_e[param3.field_A - -2] << -1188957240 & 65280;
                            stackOut_88_1 = param3.field_v;
                            stackIn_96_0 = stackOut_88_0;
                            stackIn_96_1 = stackOut_88_1;
                            stackIn_89_0 = stackOut_88_0;
                            stackIn_89_1 = stackOut_88_1;
                            if (var11 != 0) {
                              break L21;
                            } else {
                              if (stackIn_89_0 >= stackIn_89_1) {
                                break L22;
                              } else {
                                param3.field_A = param3.field_A + 2;
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        stackOut_95_0 = param3.field_A;
                        stackOut_95_1 = var7.field_e.length - 2;
                        stackIn_96_0 = stackOut_95_0;
                        stackIn_96_1 = stackOut_95_1;
                        break L21;
                      }
                      if (stackIn_96_0 == stackIn_96_1) {
                        var8 = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  } else {
                    break L16;
                  }
                }
              }
            }
            if (var8 == 0) {
              param3.field_I.a(param3.field_s, this.a(param3, 16402), this.a((byte) -118, param3));
              stackOut_123_0 = 0;
              stackIn_124_0 = stackOut_123_0;
              break L0;
            } else {
              L23: {
                L24: {
                  param3.field_I.g(param3.field_s);
                  if (null != param1) {
                    break L24;
                  } else {
                    param3.field_I.a(param2);
                    if (var11 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                param3.field_I.b(param1, param0, param2);
                break L23;
              }
              L25: {
                if (param3.field_I.g()) {
                  ((g) this).field_y.field_s.a((eb) (Object) param3.field_I);
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                param3.a(59);
                if (param3.field_v < 0) {
                  break L26;
                } else {
                  param3.b(false);
                  if (param3.field_C <= 0) {
                    break L26;
                  } else {
                    if (((g) this).field_J[param3.field_n][param3.field_C] != param3) {
                      break L26;
                    } else {
                      ((g) this).field_J[param3.field_n][param3.field_C] = null;
                      break L26;
                    }
                  }
                }
              }
              stackOut_121_0 = 1;
              stackIn_122_0 = stackOut_121_0;
              return stackIn_122_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_125_0 = (RuntimeException) var6;
            stackOut_125_1 = new StringBuilder().append("g.RA(").append(param0).append(',');
            stackIn_128_0 = stackOut_125_0;
            stackIn_128_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param1 == null) {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L27;
            } else {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "{...}";
              stackIn_129_0 = stackOut_126_0;
              stackIn_129_1 = stackOut_126_1;
              stackIn_129_2 = stackOut_126_2;
              break L27;
            }
          }
          L28: {
            stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
            stackOut_129_1 = ((StringBuilder) (Object) stackIn_129_1).append(stackIn_129_2).append(',').append(param2).append(',');
            stackIn_132_0 = stackOut_129_0;
            stackIn_132_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param3 == null) {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "null";
              stackIn_133_0 = stackOut_132_0;
              stackIn_133_1 = stackOut_132_1;
              stackIn_133_2 = stackOut_132_2;
              break L28;
            } else {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "{...}";
              stackIn_133_0 = stackOut_130_0;
              stackIn_133_1 = stackOut_130_1;
              stackIn_133_2 = stackOut_130_2;
              break L28;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_133_0, stackIn_133_2 + ',' + param4 + ')');
        }
        return stackIn_124_0 != 0;
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            if (0 <= param0) {
              L1: {
                if (param1 == 16384) {
                  break L1;
                } else {
                  this.b((byte) -88, 32);
                  break L1;
                }
              }
              ((g) this).field_u[param0] = 12800;
              ((g) this).field_r[param0] = 8192;
              ((g) this).field_W[param0] = 16383;
              ((g) this).field_Q[param0] = 8192;
              ((g) this).field_t[param0] = 0;
              ((g) this).field_V[param0] = 8192;
              this.a(param0, (byte) 94);
              this.b(param0, -52);
              ((g) this).field_I[param0] = 0;
              ((g) this).field_v[param0] = 32767;
              ((g) this).field_K[param0] = 256;
              ((g) this).field_G[param0] = 0;
              this.f(param0, param1 + -3142, 8192);
              break L0;
            } else {
              param0 = 0;
              L2: while (true) {
                L3: {
                  if (param0 >= 16) {
                    break L3;
                  } else {
                    this.d(param0, 16384);
                    param0++;
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "g.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized void a(ri param0, int param1, boolean param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            this.a(487759088, param2);
            ((g) this).field_N.a(param0.field_o);
            ((g) this).field_x = param3;
            ((g) this).field_D = (long)param1;
            var5_int = ((g) this).field_N.e();
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var5_int >= ~var6) {
                    break L3;
                  } else {
                    ((g) this).field_N.f(var6);
                    ((g) this).field_N.e(var6);
                    ((g) this).field_N.b(var6);
                    var6++;
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
                ((g) this).field_Y = ((g) this).field_N.g();
                ((g) this).field_S = ((g) this).field_N.field_g[((g) this).field_Y];
                ((g) this).field_C = ((g) this).field_N.d(((g) this).field_S);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("g.Q(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (~param0 != ~((g) this).field_E[param2]) {
                  ((g) this).field_E[param2] = param0;
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= 128) {
                      break L2;
                    } else {
                      ((g) this).field_J[param2][var4_int] = null;
                      var4_int++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param1 == -2) {
                break L1;
              } else {
                this.b(-10, -14);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "g.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, oc param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        lm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_D * param1.field_u >> 1333401036) + param1.field_x;
              var3_int = var3_int + (((g) this).field_K[param1.field_n] * (-8192 + ((g) this).field_Q[param1.field_n]) >> -1310617012);
              var4 = param1.field_q;
              if (var4.field_k <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_c > 0) {
                    break L2;
                  } else {
                    if (((g) this).field_t[param1.field_n] <= 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_c << 206066402;
                  var6 = var4.field_h << 563193249;
                  if (param1.field_H < var6) {
                    var5 = var5 * param1.field_H / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((g) this).field_t[param1.field_n] >> 1347643367);
                var7 = Math.sin((double)(param1.field_p & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              var5 = (int)(0.5 + (double)(param1.field_y.field_o * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)nk.field_k);
              if (param0 == -18511) {
                break L4;
              } else {
                ((g) this).field_v = null;
                break L4;
              }
            }
            L5: {
              if (var5 < 1) {
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_16_0 = var5;
                stackIn_19_0 = stackOut_16_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("g.JA(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0;
    }

    final synchronized boolean a(fa param0, ri param1, ah param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ch var8 = null;
        int var9 = 0;
        ng var10 = null;
        int var11 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              param1.a();
              var6_int = 1;
              var7 = null;
              if (param3 > ~param4) {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (ch) (Object) param1.field_n.b(43);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var8) {
                    break L4;
                  } else {
                    var9 = (int)var8.field_c;
                    var10 = (ng) (Object) ((g) this).field_A.a((long)var9, (byte) -43);
                    if (var11 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (null == var10) {
                            L7: {
                              var10 = go.a(true, var9, param2);
                              if (var10 == null) {
                                var6_int = 0;
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            ((g) this).field_A.a((long)var9, -53, (mc) (Object) var10);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (!var10.a((int[]) var7, param0, (byte) -114, var8.field_p)) {
                          var6_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var8 = (ch) (Object) param1.field_n.a(-1);
                      if (var11 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (var6_int == 0) {
                  break L3;
                } else {
                  param1.b();
                  break L3;
                }
              }
              stackOut_27_0 = var6_int;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("g.SA(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L8;
            }
          }
          L9: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L9;
            }
          }
          L10: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L10;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 == -1) {
                break L1;
              } else {
                field_s = 79;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= var2_int) {
                    break L4;
                  } else {
                    stackOut_6_0 = rh.a(param1.charAt(var4), false) + (var3 << 1165239525) + -var3;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      var3 = stackIn_7_0;
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_8_0 = var3;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("g.KA(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 18) {
                break L1;
              } else {
                g.a((String[]) null, (String) null, -80, (byte) 37);
                break L1;
              }
            }
            this.a(487759088, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "g.LA(" + param0 + ')');
        }
    }

    final synchronized void c(int param0, int param1) {
        try {
            ((g) this).field_R = param0;
            if (param1 > -9) {
                ((g) this).field_E = null;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.CA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  this.b((byte) -100, -1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.e(-1, -120);
              break L1;
            }
            L3: {
              this.d(-1, 16384);
              var3_int = 0;
              if (param1 >= 9) {
                break L3;
              } else {
                this.a(-128, 56, -103, 34);
                break L3;
              }
            }
            L4: while (true) {
              L5: {
                L6: {
                  if (var3_int >= 16) {
                    break L6;
                  } else {
                    ((g) this).field_E[var3_int] = ((g) this).field_H[var3_int];
                    var3_int++;
                    if (var4 != 0) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var3_int = 0;
                break L5;
              }
              L7: while (true) {
                L8: {
                  L9: {
                    if (var3_int >= 16) {
                      break L9;
                    } else {
                      ((g) this).field_M[var3_int] = pl.a(((g) this).field_H[var3_int], -128);
                      var3_int++;
                      if (var4 != 0) {
                        break L8;
                      } else {
                        if (var4 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  break L8;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "g.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, oc param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1.field_y.field_s.length;
              if (!param0) {
                break L1;
              } else {
                this.a((ri) null, 123, false, false);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param2) {
                  break L3;
                } else {
                  if (!param1.field_y.field_p) {
                    break L3;
                  } else {
                    L4: {
                      var6 = -param1.field_y.field_q + var4_int + var4_int;
                      var4_int = var4_int << 8;
                      var5 = (int)((long)var6 * (long)((g) this).field_G[param1.field_n] >> -15158330);
                      if (~var5 <= ~var4_int) {
                        param1.field_I.a(true);
                        var5 = -1 + var4_int + var4_int + -var5;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (TetraLink.field_J == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var5 = (int)((long)((g) this).field_G[param1.field_n] * (long)var4_int >> -1931776634);
              break L2;
            }
            param1.field_I.e(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("g.W(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
    }

    private final void e(int param0, int param1) {
        oc var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 < -12) {
                break L1;
              } else {
                ((g) this).field_M = null;
                break L1;
              }
            }
            var3 = (oc) (Object) ((g) this).field_y.field_u.c(false);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (param0 < 0) {
                            break L6;
                          } else {
                            if (~param0 != ~var3.field_n) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (0 > var3.field_v) {
                          ((g) this).field_B[var3.field_n][var3.field_E] = null;
                          var3.field_v = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var3 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3_ref, "g.S(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (((g) this).field_N.f()) {
                var4_int = ((g) this).field_R * ((g) this).field_N.field_f / nk.field_k;
                L2: while (true) {
                  L3: {
                    var5 = ((g) this).field_D - -((long)param2 * (long)var4_int);
                    if (-var5 + ((g) this).field_C >= 0L) {
                      ((g) this).field_D = var5;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var7 = (int)((-1L + ((long)var4_int + ((g) this).field_C - ((g) this).field_D)) / (long)var4_int);
                  ((g) this).field_D = ((g) this).field_D + (long)var4_int * (long)var7;
                  ((g) this).field_y.b(param0, param1, var7);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  this.b((byte) 111);
                  if (!((g) this).field_N.f()) {
                    break L1;
                  } else {
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            ((g) this).field_y.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("g.BA(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        oc var5 = null;
        RuntimeException var5_ref = null;
        oc var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            var5 = ((g) this).field_B[param2][param0];
            if (var5 != null) {
              L1: {
                if (param1 == 77) {
                  break L1;
                } else {
                  field_O = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    ((g) this).field_B[param2][param0] = null;
                    if ((((g) this).field_I[param2] & 2) != 0) {
                      break L4;
                    } else {
                      var5.field_v = 0;
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6 = (oc) (Object) ((g) this).field_y.field_u.c(false);
                  L5: while (true) {
                    if (var6 == null) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (var6.field_n != var5.field_n) {
                            break L6;
                          } else {
                            if (0 <= var6.field_v) {
                              break L6;
                            } else {
                              if (var5 == var6) {
                                break L6;
                              } else {
                                var5.field_v = 0;
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        var6 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
                        if (var7 == 0) {
                          continue L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var5_ref, "g.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public g() {
        ((g) this).field_r = new int[16];
        ((g) this).field_I = new int[16];
        ((g) this).field_R = 1000000;
        ((g) this).field_t = new int[16];
        ((g) this).field_X = 256;
        ((g) this).field_M = new int[16];
        ((g) this).field_K = new int[16];
        ((g) this).field_u = new int[16];
        ((g) this).field_H = new int[16];
        ((g) this).field_J = new oc[16][128];
        ((g) this).field_V = new int[16];
        ((g) this).field_B = new oc[16][128];
        ((g) this).field_v = new int[16];
        ((g) this).field_E = new int[16];
        ((g) this).field_T = new int[16];
        ((g) this).field_Q = new int[16];
        ((g) this).field_L = new int[16];
        ((g) this).field_G = new int[16];
        ((g) this).field_w = new int[16];
        ((g) this).field_W = new int[16];
        ((g) this).field_N = new wj();
        ((g) this).field_y = new wn((g) this);
        try {
            ((g) this).field_A = new dj(128);
            ((g) this).b(256, -1, 61);
            this.a(true, (byte) 49);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "g.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 1;
    }
}
