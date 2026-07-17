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
        var5 = ((lk) this).field_j >> 1;
        var6 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (((lk) this).field_j <= var6) {
                break L2;
              } else {
                var7 = (((lk) this).field_N * 2 - 1) * (var6 >> 1) % (2 * ((lk) this).field_N);
                var8 = 16711935 & param1;
                var9 = param1 & 65280;
                var10 = var6 + -var5;
                var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
                stackOut_2_0 = -257;
                stackOut_2_1 = ~var11;
                stackIn_11_0 = stackOut_2_0;
                stackIn_11_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 < stackIn_3_1) {
                      stackOut_5_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> 8;
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
                      stackOut_7_0 = (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> 8;
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
        try {
            cg.a((byte) -105, 12);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "lk.HA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param3 <= -85) {
              if (((lk) this).field_H) {
                ((lk) this).field_B = ((lk) this).field_B + 1;
                if (((lk) this).field_N * 2 >= ((lk) this).field_B) {
                  break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("lk.I(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    final static kc a(String param0, boolean param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        kc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        kc stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param2 == -35) {
                break L1;
              } else {
                var7 = null;
                lk.a(63, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = null;
                if (param3.indexOf('@') != -1) {
                  break L3;
                } else {
                  var8 = (CharSequence) (Object) param3;
                  var4_long = uj.a(var8, (byte) -126);
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
            stackOut_5_0 = r.a(param1, var4_long, (byte) 84, (String) var6, param0);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("lk.AA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
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
            if (((lk) this).field_I >= 65536) {
              return;
            } else {
              mi.a((byte) -52, var5 - -((lk) this).field_u, var5 + (((lk) this).field_u * ((lk) this).field_I >> 16), var6 - -((lk) this).field_j, var6);
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
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_12_0 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (!wf.b(-113)) {
                    break L3;
                  } else {
                    bk.field_a.h(0);
                    stackOut_3_0 = bk.field_a.b(-66);
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          var1_int = 1;
                          break L4;
                        }
                      }
                      if (ji.field_a == 13) {
                        var2 = 1;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                bk.field_a.b(105, bg.a(pb.field_d, ob.field_e, 96), bg.a(ag.field_f, kc.field_b, 115));
                stackOut_9_0 = bk.field_a.b(-46);
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L5: {
                if (!stackIn_10_0) {
                  break L5;
                } else {
                  var1_int = 1;
                  break L5;
                }
              }
              stackOut_12_0 = 108;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "lk.EA(" + 67 + 41);
        }
        return stackIn_13_0;
    }

    private final dd d(byte param0) {
        int var2 = 0;
        dd var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        var9 = fleas.field_A ? 1 : 0;
        var2 = ((lk) this).field_j >> 1;
        var3 = new dd(var2, ((lk) this).field_j);
        r.a(var3, 45);
        var4 = 0;
        L0: while (true) {
          stackOut_1_0 = ((lk) this).field_j;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 <= var4) {
                  break L3;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_15_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L2;
                  } else {
                    var5 = stackIn_4_0;
                    L4: while (true) {
                      if (var5 >= var2) {
                        var4++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      } else {
                        var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((lk) this).field_j));
                        var8 = 1;
                        stackOut_6_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                        stackIn_2_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var9 != 0) {
                          continue L1;
                        } else {
                          L5: {
                            if (stackIn_7_0 >= 0) {
                              break L5;
                            } else {
                              L6: {
                                var6 = Math.sqrt(1.0 - var6);
                                if (1.0 <= var6) {
                                  stackOut_10_0 = 255;
                                  stackIn_11_0 = stackOut_10_0;
                                  break L6;
                                } else {
                                  stackOut_9_0 = (int)(255.0 * var6);
                                  stackIn_11_0 = stackOut_9_0;
                                  break L6;
                                }
                              }
                              var8 = stackIn_11_0;
                              break L5;
                            }
                          }
                          gb.a(var5, var4, var8 << 8 | var8 | var8 << 16);
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_14_0 = -106;
              stackIn_15_0 = stackOut_14_0;
              break L2;
            }
            ia.a(stackIn_15_0);
            return var3;
          }
        }
    }

    lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, (16711422 & param6) >> 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(124);
    }

    private final void a(dd param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((lk) this).field_u + param3;
              mi.a((byte) -52, var5_int + -((lk) this).field_P.field_w, param3 - -((lk) this).field_P.field_w, param1 + ((lk) this).field_j, param1);
              var6 = -((lk) this).field_B + param3;
              if (param2 == 0) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var5_int <= var6) {
                  ia.a(param2 ^ -81);
                  break L3;
                } else {
                  param0.d(var6, param1);
                  var6 = var6 + param0.field_w;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              L4: {
                if (gb.field_l > ((lk) this).field_P.field_w + param3) {
                  break L4;
                } else {
                  r.a(((lk) this).field_M, 45);
                  param0.d(-((lk) this).field_B, 0);
                  param0.d(((lk) this).field_N * 2 - ((lk) this).field_B, 0);
                  ((lk) this).field_F.a(0, 0);
                  ia.a(-70);
                  ((lk) this).field_M.d(param3, param1);
                  break L4;
                }
              }
              L5: {
                if (var5_int - ((lk) this).field_P.field_w > gb.field_h) {
                  break L5;
                } else {
                  r.a(((lk) this).field_M, 45);
                  var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var7 <= ((lk) this).field_N * 2) {
                          break L8;
                        } else {
                          var7 = var7 - 2 * ((lk) this).field_N;
                          if (var8 != 0) {
                            break L7;
                          } else {
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      param0.d(-var7, 0);
                      param0.d(-var7 + ((lk) this).field_N * 2, 0);
                      ((lk) this).field_P.a(0, 0);
                      ia.a(-79);
                      break L7;
                    }
                    ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5_int, param1);
                    break L5;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("lk.JA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
        if (vg.field_z != -wf.field_c) {
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
          ((lk) this).field_M = new dd(((lk) this).field_j >> 1, ((lk) this).field_j);
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
        ((lk) this).field_L = (param1 & 16711422) >> 1;
        ((lk) this).field_G = param1;
        ((lk) this).field_C = param2;
        ((lk) this).field_K = 8355711 & param2 >> 1;
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
