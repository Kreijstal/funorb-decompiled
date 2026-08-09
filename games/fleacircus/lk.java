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
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        dd var14;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        var13 = fleas.field_A ? 1 : 0;
        var14 = new dd(this.field_N * 2, this.field_j);
        r.a(var14, 45);
        var5 = this.field_j >> -34084671;
        var6 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_j <= var6) {
                break L2;
              } else {
                var7 = (this.field_N * 2 - 1) * (var6 >> 409506081) % (2 * this.field_N);
                var8 = 16711935 & param1;
                var9 = param1 & 65280;
                var10 = var6 + -var5;
                var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
                stackIn_11_0 = -257;

                stackIn_11_1 = var11 ^ -1;

                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_11_0 < stackIn_11_1) {
                      stackIn_6_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> 502419848;
                      break L3;
                    } else {
                      stackIn_6_0 = var9 | var8;
                      break L3;
                    }
                  }
                  L4: {
                    var12 = stackIn_6_0;
                    gb.b(var7, var6, this.field_N, var12);
                    var8 = 16711935 & param0;
                    var9 = param0 & 65280;
                    gb.b(var7 + -(this.field_N * 2), var6, this.field_N, var12);
                    if (256 <= var11) {
                      stackIn_9_0 = var9 | var8;
                      break L4;
                    } else {
                      stackIn_9_0 = (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> -215237912;
                      break L4;
                    }
                  }
                  var12 = stackIn_9_0;
                  gb.b(var7 + this.field_N, var6, this.field_N, var12);
                  gb.b(-this.field_N + var7, var6, this.field_N, var12);
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
            stackIn_11_0 = 83;
            stackIn_11_1 = (9 - param2) / 48;
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
            throw pf.a((Throwable) ((Object) runtimeException), "lk.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 <= -85) {
              if (this.field_H) {
                this.field_B = this.field_B + 1;
                if (this.field_N * 2 >= this.field_B) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_B = this.field_B - this.field_N * 2;
                  return;
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("lk.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static kc a(String param0, boolean param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        kc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param2 == -35) {
                break L1;
              } else {
                var7 = (String) null;
                lk.a(63, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = null;
                if ((param3.indexOf('@') ^ -1) != 0) {
                  break L3;
                } else {
                  var8 = (CharSequence) ((Object) param3);
                  var4_long = uj.a(var8, (byte) -126);
                  if (!fleas.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = param3;
              break L2;
            }
            stackIn_6_0 = r.a(param1, var4_long, (byte) 84, (String) (var6), param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("lk.AA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        if (0 != param3) {
          return;
        } else {
          if (param2) {
            var5 = param1 - -this.field_y;
            var6 = this.field_z + param0;
            this.a(this.field_E[0], var6, 0, var5);
            if (-65537 >= (this.field_I ^ -1)) {
              return;
            } else {
              mi.a((byte) -52, var5 - -this.field_u, var5 + (this.field_u * this.field_I >> 650292688), var6 - -this.field_j, var6);
              this.a(this.field_E[1], var6, 0, var5);
              ia.a(-68);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static int k(int param0) {
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_31_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
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
                    stackIn_10_0 = bk.field_a.b(-66);

                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_10_0) {
                          break L4;
                        } else {
                          var1_int = 1;
                          break L4;
                        }
                      }
                      if (-14 == (ji.field_a ^ -1)) {
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
                stackIn_10_0 = bk.field_a.b(-46);
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
              if (param0 == 10999) {
                L6: {
                  L7: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L7;
                    } else {
                      if (-1 < (bk.field_a.field_k ^ -1)) {
                        break L7;
                      } else {
                        L8: {
                          var3 = em.field_e[bk.field_a.field_k];
                          if (var3 == 2) {
                            break L8;
                          } else {
                            if ((var3 ^ -1) != -6) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        md.i(124);
                        if (var7 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L6;
                  } else {
                    if (-3 == (vc.field_a ^ -1)) {
                      break L6;
                    } else {
                      md.i(-109);
                      break L6;
                    }
                  }
                }
                L9: {
                  if (-1 != (var3 ^ -1)) {
                    break L9;
                  } else {
                    if (2 != vc.field_a) {
                      break L9;
                    } else {
                      var4 = -sd.field_h + lj.a((byte) -38);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 <= 0) {
                        pf.a(5, 1, true);
                        var3 = 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                stackIn_31_0 = var3;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_14_0 = 108;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "lk.EA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_31_0;
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
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    var2 = this.field_j >> 1509851841;
                    var3 = new dd(var2, this.field_j);
                    r.a(var3, 45);
                    if (param0 != -15) {
                        statePc = 17;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this.field_j ^ -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 >= (var4 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_16_0 = 0;
                    stackIn_5_0 = stackIn_16_0;
                    if (var9 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var5 >= var2) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_j));
                    var8 = 1;
                    stackIn_3_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                    stackIn_8_0 = stackIn_3_0;
                    if (var9 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 >= 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = Math.sqrt(1.0 - var6);
                    if (1.0 <= var6) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (int)(255.0 * var6);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var8 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    gb.a(var5, var4, var8 << -2076140760 | var8 | var8 << -1840242832);
                    var5++;
                    if (var9 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = -106;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    ia.a(stackIn_16_0);
                    return var3;
                }
                case 17: {
                    field_D = (vg) null;
                    var4 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = this.field_j ^ -1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 >= (var4 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_32_0 = 0;
                    stackIn_21_0 = stackIn_32_0;
                    if (var9 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = stackIn_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var5 >= var2) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_j));
                    var8 = 1;
                    stackIn_19_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                    stackIn_24_0 = stackIn_19_0;
                    if (var9 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 >= 0) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var6 = Math.sqrt(1.0 - var6);
                    if (1.0 <= var6) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (int)(255.0 * var6);
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = 255;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var8 = stackIn_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    gb.a(var5, var4, var8 << -2076140760 | var8 | var8 << -1840242832);
                    var5++;
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = -106;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    ia.a(stackIn_32_0);
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_u + param3;
                        mi.a((byte) -52, var5_int + -this.field_P.field_w, param3 - -this.field_P.field_w, param1 + this.field_j, param1);
                        var6 = -this.field_B + param3;
                        if (param2 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_A = (fh) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0.d(var6, param1);
                        var6 = var6 + param0.field_w;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ia.a(param2 ^ -81);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (gb.field_l > this.field_P.field_w + param3) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        r.a(this.field_M, 45);
                        param0.d(-this.field_B, 0);
                        param0.d(this.field_N * 2 - this.field_B, 0);
                        this.field_F.a(0, 0);
                        ia.a(-70);
                        this.field_M.d(param3, param1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5_int - this.field_P.field_w > gb.field_h) {
                            statePc = 23;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        r.a(this.field_M, 45);
                        var7 = this.field_B + (-this.field_P.field_w + this.field_u);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 <= this.field_N * 2) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = var7 - 2 * this.field_N;
                        if (var8 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        param0.d(-var7, 0);
                        param0.d(-var7 + this.field_N * 2, 0);
                        this.field_P.a(0, 0);
                        ia.a(-79);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_M.d(-this.field_P.field_w + var5_int, param1);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_21_0 = (RuntimeException) (var5);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = new StringBuilder().append("lk.JA(");
                    stackIn_20_1 = stackIn_21_1;
                    if (param0 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
          this.field_E = new dd[]{this.b(this.field_G, this.field_C, -117), this.b(this.field_L, this.field_K, 118)};
          this.field_P = this.d((byte) -15);
          this.field_F = this.field_P.b();
          this.field_M = new dd(this.field_j >> 628191361, this.field_j);
          return;
        }
    }

    final static boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == 10) {
          if (10 <= bh.field_t) {
            if (ci.field_f) {
              return false;
            } else {
              L0: {
                if (qh.j(32391)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          lk.k(67);
          if (10 <= bh.field_t) {
            if (ci.field_f) {
              return false;
            } else {
              L1: {
                if (qh.j(32391)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
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
        this.field_L = (param1 & 16711422) >> -1387688991;
        this.field_G = param1;
        this.field_C = param2;
        this.field_K = 8355711 & param2 >> 867289153;
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
        this.field_L = param8;
        this.field_C = param5;
        this.field_G = param6;
        this.field_K = param7;
        this.field_N = param4;
        this.a(param0, param2, param1, param3, 80);
    }

    static {
        field_O = new vc();
        field_J = 0;
        field_A = new fh(6, 0, 4, 2);
    }
}
