/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    byte[] field_z;
    int[] field_i;
    short[] field_K;
    private boolean field_d;
    short[] field_E;
    int[] field_I;
    short[] field_M;
    short[] field_c;
    int[] field_q;
    short[] field_p;
    short[] field_x;
    int[] field_f;
    short[] field_J;
    short[] field_H;
    int[] field_O;
    byte field_m;
    int field_C;
    int[] field_t;
    int field_l;
    int field_G;
    short[] field_a;
    int field_D;
    short[] field_g;
    short field_n;
    int field_j;
    short[] field_L;
    short field_o;
    short[] field_A;
    short[] field_y;
    static th field_u;
    static ja[] field_N;
    int field_r;
    short[] field_b;
    short[] field_F;
    int[] field_e;
    int[] field_h;
    short[] field_v;
    short[] field_k;
    short[] field_s;
    short field_B;
    int[] field_w;

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sj.a(up.field_d, -891231071, param0, true, lj.field_n, 0, ab.field_j);
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= lj.field_n) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        la.field_c[var2_int + param0] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 <= -27) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_u = (th) null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        sj.a(ba.field_m, -891231071, param0 - -param0, false, param0 + lj.field_n, param0, mj.field_Ub);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 < lj.field_n) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        lj.field_n = param0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "md.A(" + param0 + ',' + param1 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_N = null;
        if (param0 != 119) {
            return;
        }
        field_u = null;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_d) {
          return;
        } else {
          L0: {
            this.field_d = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            if (param0 < -20) {
              break L0;
            } else {
              md.a(-5, 114);
              break L0;
            }
          }
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_n <= var8) {
                  break L3;
                } else {
                  var9 = this.field_k[var8];
                  var10 = this.field_E[var8];
                  if (var12 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (var5 >= var9) {
                        break L4;
                      } else {
                        var5 = var9;
                        break L4;
                      }
                    }
                    L5: {
                      if (var9 >= var2) {
                        break L5;
                      } else {
                        var2 = var9;
                        break L5;
                      }
                    }
                    L6: {
                      if (var10 <= var6) {
                        break L6;
                      } else {
                        var6 = var10;
                        break L6;
                      }
                    }
                    L7: {
                      var11 = this.field_v[var8];
                      if (var3 <= var10) {
                        break L7;
                      } else {
                        var3 = var10;
                        break L7;
                      }
                    }
                    L8: {
                      if (var11 > var7) {
                        var7 = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var4 <= var11) {
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
              this.field_G = var3;
              this.field_D = var5;
              this.field_C = var2;
              this.field_j = var7;
              this.field_l = var6;
              this.field_r = var4;
              break L2;
            }
            return;
          }
        }
    }

    final static ml a(byte param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ml var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        ml stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (bh.field_f != null) {
              L1: {
                var7 = (CharSequence) ((Object) param1);
                var2 = tg.a(var7, false);
                var3 = 24 / ((47 - param0) / 43);
                if (var2 == null) {
                  var2 = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = (ml) ((Object) bh.field_f.a((long)var2.hashCode(), -22877));
              L2: while (true) {
                if (var4 != null) {
                  L3: {
                    var8 = (CharSequence) ((Object) var4.field_Hb);
                    var5 = tg.a(var8, false);
                    stackIn_19_0 = null;

                    if (var6 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (stackIn_19_0 != var5) {
                          break L4;
                        } else {
                          var5 = var4.field_Hb;
                          break L4;
                        }
                      }
                      if (var5.equals(var2)) {
                        stackIn_16_0 = (ml) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var4 = (ml) ((Object) bh.field_f.b((byte) 68));
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          stackIn_19_0 = null;
                          break L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref);

            stackIn_22_1 = new StringBuilder().append("md.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ml) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ml) ((Object) stackIn_19_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    var6 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var6 >= this.field_n) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_k[var6] = (short)(param0 * this.field_k[var6] / param1);
                    this.field_E[var6] = (short)(this.field_E[var6] * param2 / param1);
                    this.field_v[var6] = (short)(param3 * this.field_v[var6] / param1);
                    var6++;
                    if (var7 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param4 == 2122) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_v = (short[]) null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    this.a(255);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var5 >= this.field_n) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_k[var5] = (short)(this.field_k[var5] + param2);
                    this.field_E[var5] = (short)(this.field_E[var5] + param3);
                    this.field_v[var5] = (short)(this.field_v[var5] + param0);
                    var5++;
                    if (var6 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(255);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 == 3) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_t = (int[]) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -9159) {
                break L1;
              } else {
                field_N = (ja[]) null;
                break L1;
              }
            }
            stackIn_3_0 = md.a(param0, 10, -31, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("md.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(ml param0, byte param1, ml param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -49) {
                break L1;
              } else {
                field_N = (ja[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = param0.field_Mb + -param2.field_Mb;
                if (param0.field_Nb != ta.field_ob) {
                  break L3;
                } else {
                  var3_int -= 200;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (param0.field_Nb != null) {
                break L2;
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L4: {
              L5: {
                if (param2.field_Nb == ta.field_ob) {
                  break L5;
                } else {
                  if (null == param2.field_Nb) {
                    var3_int -= 200;
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var3_int += 200;
              break L4;
            }
            L6: {
              if (var3_int <= 0) {
                stackIn_16_0 = 0;
                break L6;
              } else {
                stackIn_16_0 = 1;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("md.I(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(String[] args, int param1, int[] param2, ul param3, String[] param4, ja[][] param5, ja[][] param6, String[][] param7, byte[] param8, int param9, boolean param10, byte[] param11, String[] param12, int param13, String[][] param14) {
        mo[] array$0 = null;
        mo[] array$1 = null;
        mo[] array$2 = null;
        cj stackIn_4_0 = null;
        cj stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        cj stackIn_4_3 = null;
        cj stackIn_5_0 = null;
        cj stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        cj stackIn_5_3 = null;
        cj stackIn_6_0 = null;
        cj stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        cj stackIn_6_3 = null;
        String stackIn_6_4 = null;
        int stackIn_39_0 = 0;
        int stackIn_56_0 = 0;
        cj stackIn_59_0 = null;
        Object stackIn_63_0 = null;
        mo[] stackIn_63_1 = null;
        Object stackIn_68_0 = null;
        mo[] stackIn_68_1 = null;
        cj stackIn_74_0 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        RuntimeException var15 = null;
        cj var16 = null;
        int var17_int = 0;
        cj var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        CharSequence var22 = null;
        cj var24 = null;
        cj var25 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    cf.field_f = args;
                    qp.field_s = param4;
                    ZombieDawnMulti.field_L = param5;
                    qo.field_r = param2;
                    um.field_b = param12;
                    i.field_e = param1;
                    ul.field_m = param14;
                    ch.field_c = param11;
                    ng.field_b = param8;
                    um.field_g = param6;
                    kp.field_n = param7;
                    r.field_f = param13;
                    qp.field_u = pb.a("lobby", param3, -256, "gameprivacy");
                    ke.field_i = pb.a("lobby", param3, -256, "ratedgame");
                    na.field_G = pb.a("lobby", param3, -256, "opentome");
                    we.field_j = pb.a("lobby", param3, -256, "allowspectators");
                    t.field_c = new String[5];
                    t.field_c[2] = al.field_W;
                    t.field_c[3] = dm.field_Xb;
                    t.field_c[4] = vo.field_s;
                    t.field_c[0] = vb.field_g;
                    t.field_c[1] = ka.field_m;
                    pd.field_b = new cj(0L, (cj) null);
                    dm.field_ac = new cj(0L, vd.field_a, qd.field_r);
                    mo.field_Hb = new cj(0L, pn.field_g, cg.field_j);
                    hf.field_e = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
                    pd.field_b.a((byte) 50, dm.field_ac);
                    if (!tb.field_u) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    pd.field_b.a((byte) 50, mo.field_Hb);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    pd.field_b.a((byte) 50, hf.field_e);
                    hf.field_e.field_Jb.b((byte) -32, vo.field_m);
                    hf.field_e.field_Jb.field_lb = 1;
                    var24 = hf.field_e.field_Jb;
                    var25 = var24;
                    var25.field_R = 1;
                    ql.field_b = new cj(0L, vo.field_m);
                    ql.field_b.field_R = 1;
                    kj.field_u = new cj(0L, ai.field_c, e.field_b.toUpperCase());
                    ro.field_O = new cj(0L, ed.field_d, uo.field_j.toUpperCase());
                    ml.field_Lb = new cj(0L, cg.field_f);
                    k.field_g = new cj(0L, vd.field_a, vh.field_Nb);
                    ud.field_M = new cj(0L, al.field_fb, kb.field_p);
                    tk.field_l = new cj(0L, al.field_fb, ck.field_b);
                    sc.field_d = new cj(0L, al.field_fb, jl.field_t);
                    da.field_h = new cj(0L, al.field_fb, op.field_k);
                    bp.field_w = new cj(0L, pn.field_g, fd.field_N);
                    ek.field_H = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
                    ia.field_t = new cj(0L, he.field_i, sn.field_Gb.toUpperCase());
                    ia.field_t.field_Z = tb.field_u;
                    stackIn_5_0 = null;
                    stackIn_4_0 = stackIn_5_0;
                    stackIn_5_1 = null;
                    stackIn_4_1 = stackIn_5_1;
                    stackIn_5_2 = 0L;
                    stackIn_4_2 = stackIn_5_2;
                    stackIn_5_3 = he.field_i;
                    stackIn_4_3 = stackIn_5_3;
                    if (!tb.field_u) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = null;
                    stackIn_6_1 = null;
                    stackIn_6_2 = stackIn_4_2;
                    stackIn_6_3 = (cj) ((Object) stackIn_4_3);
                    stackIn_6_4 = ff.field_t;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = null;
                    stackIn_6_1 = null;
                    stackIn_6_2 = stackIn_5_2;
                    stackIn_6_3 = (cj) ((Object) stackIn_5_3);
                    stackIn_6_4 = cn.field_C;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    pl.field_L = new cj(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
                    cm.field_a = new cj(0L, (cj) null);
                    cm.field_a.a((byte) 50, ro.field_O);
                    if (param10) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var22 = (CharSequence) null;
                    md.a((CharSequence) null, -24);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    cm.field_a.a((byte) 50, ml.field_Lb);
                    ml.field_Lb.a((byte) 50, k.field_g);
                    ml.field_Lb.a((byte) 50, ud.field_M);
                    ml.field_Lb.a((byte) 50, tk.field_l);
                    if (tb.field_u) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ml.field_Lb.a((byte) 50, sc.field_d);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    ml.field_Lb.a((byte) 50, da.field_h);
                    ml.field_Lb.a((byte) 50, bp.field_w);
                    ml.field_Lb.a((byte) 50, ek.field_H);
                    if (tb.field_u) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    cm.field_a.a((byte) 50, ia.field_t);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    cm.field_a.a((byte) 50, pl.field_L);
                    sc.field_j = new cj(0L, vo.field_m);
                    sc.field_j.field_lb = 0;
                    sc.field_j.field_R = 1;
                    kn.field_a = new cj(0L, kb.field_n, ji.field_e.toUpperCase());
                    lm.field_gb = new cj(0L, wa.field_a);
                    lm.field_gb.a((byte) 50, sc.field_j);
                    lm.field_gb.a((byte) 50, kn.field_a);
                    sk.field_i = new cj(0L, nc.field_e);
                    sk.field_i.b((byte) -32, vo.field_m);
                    var16 = sk.field_i;
                    sk.field_i.field_lb = 1;
                    var16.field_R = 1;
                    ga.field_r = new cj(0L, (cj) null);
                    fn.field_h = new cj(0L, vo.field_m);
                    fn.field_h.field_R = 1;
                    ie.field_jb = new cj(0L, vd.field_a, qd.field_r);
                    bf.field_h = new cj(0L, pn.field_g, cg.field_j);
                    bf.field_n = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
                    ga.field_r.a((byte) 50, fn.field_h);
                    ga.field_r.a((byte) 50, ie.field_jb);
                    if (!tb.field_u) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ga.field_r.a((byte) 50, bf.field_h);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    ga.field_r.a((byte) 50, bf.field_n);
                    jp.field_b = new cj(0L, ai.field_c, pi.field_b.toUpperCase());
                    gg.field_m = new cj(0L, ed.field_d);
                    dl.field_a = new cj(0L, cg.field_f);
                    ik.field_d = new cj(0L, hd.field_x, vb.field_d.toUpperCase());
                    mi.field_Ib = new cj[4 + param9];
                    ma.field_b = new mo[param9 - -4][];
                    mi.field_Ib[0] = new cj(0L, m.field_B, kg.field_f);
                    ma.field_b[0] = new mo[6];
                    var17_int = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (5 <= var17_int) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ma.field_b[0][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, qp.field_u[var17_int], t.field_c[var17_int]);
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var21 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (-3 >= (qo.field_r.length ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 23: {
                    mi.field_Ib[1] = new cj(0L, m.field_B, gi.field_n);
                    array$0 = new mo[1 + qo.field_r.length];
                    ma.field_b[1] = array$0;
                    ma.field_b[1][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var17_int = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var17_int >= qo.field_r.length) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ma.field_b[1][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, Integer.toString(qo.field_r[var17_int]));
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var21 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    mi.field_Ib[2] = new cj(0L, m.field_B, qj.field_j);
                    ma.field_b[2] = new mo[]{new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[0], be.field_f), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[1], wf.field_k)};
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (-2 <= (r.field_f ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    mi.field_Ib[3] = new cj(0L, m.field_B, gj.field_d);
                    array$1 = new mo[r.field_f - -1];
                    ma.field_b[3] = array$1;
                    ma.field_b[3][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    var17_int = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var17_int >= r.field_f) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ma.field_b[3][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, um.field_b[var17_int]);
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var21 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var17_int = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (param9 <= var17_int) {
                        statePc = 55;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    mi.field_Ib[4 + var17_int] = new cj(0L, m.field_B, cf.field_f[var17_int]);
                    array$2 = new mo[1 + tq.b(255, (int) ng.field_b[var17_int])];
                    ma.field_b[var17_int + 4] = array$2;
                    ma.field_b[var17_int + 4][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    stackIn_56_0 = 0;
                    stackIn_39_0 = stackIn_56_0;
                    if (var21 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var18 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var18 >= (255 & ng.field_b[var17_int])) {
                        statePc = 53;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var21 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (ZombieDawnMulti.field_L != null) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var19_ref = null;
                    statePc = 47;
                    continue stateLoop;
                }
                case 44: {
                    if (null == ZombieDawnMulti.field_L[var17_int]) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var19_ref = ZombieDawnMulti.field_L[var17_int][var18];
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    var19_ref = null;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (null == ul.field_m) {
                        statePc = 51;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (ul.field_m[var17_int] == null) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var20 = ul.field_m[var17_int][var18];
                    statePc = 52;
                    continue stateLoop;
                }
                case 50: {
                    var20 = null;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    var20 = null;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    ma.field_b[var17_int + 4][var18 - -1] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) (var19_ref), (String) (var20));
                    var18++;
                    if (var21 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var17_int++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var21 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var17_int = stackIn_56_0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (param9 + 4 <= var17_int) {
                        statePc = 73;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_74_0 = mi.field_Ib[var17_int];
                    stackIn_59_0 = stackIn_74_0;
                    if (var21 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 != null) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    mi.field_Ib[var17_int].field_J = 11;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = null;
                    stackIn_63_1 = ma.field_b[var17_int];
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (stackIn_63_0 != stackIn_63_1) {
                        statePc = 65;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var18 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (ma.field_b[var17_int].length <= var18) {
                        statePc = 72;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_63_0 = null;
                    stackIn_68_0 = stackIn_63_0;
                    stackIn_63_1 = ma.field_b[var17_int];
                    stackIn_68_1 = stackIn_63_1;
                    if (var21 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 == stackIn_68_1[var18]) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (ma.field_b[var17_int][var18].field_Mb == null) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    ma.field_b[var17_int][var18].field_Mb.field_J = 11;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var18++;
                    if (var21 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var17_int++;
                    if (var21 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    en.field_b = new cj(0L, he.field_i);
                    gb.field_a = new cj(0L, he.field_i);
                    eb.field_B = new cj(0L, qc.field_u);
                    eb.field_B.b((byte) -32, vo.field_m);
                    eb.field_B.field_lb = 1;
                    stackIn_74_0 = eb.field_B;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var17 = stackIn_74_0;
                    var17.field_R = 1;
                    fc.field_a = new cj(0L, (cj) null);
                    fc.field_a.a((byte) 50, gg.field_m);
                    fc.field_a.a((byte) 50, dl.field_a);
                    dl.field_a.a((byte) 50, ik.field_d);
                    var18 = 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (4 + param9 <= var18) {
                        statePc = 92;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var21 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var18 != 1) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (qo.field_r.length < 2) {
                        statePc = 90;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var18 != 3) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((r.field_f ^ -1) >= -2) {
                        statePc = 90;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    dl.field_a.a((byte) 50, mi.field_Ib[var18]);
                    var19 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (ma.field_b[var18].length <= var19) {
                        statePc = 90;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var21 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (null != ma.field_b[var18][var19]) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    dl.field_a.a((byte) 50, ma.field_b[var18][var19]);
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    var19++;
                    if (var21 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var18++;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (var21 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    fc.field_a.a((byte) 50, en.field_b);
                    fc.field_a.a((byte) 50, gb.field_a);
                    fc.field_a.a((byte) 50, eb.field_B);
                    mq.field_l = new cj(0L, kc.field_c, p.field_c.toUpperCase());
                    pg.field_a = new cj(0L, kb.field_n, qq.field_d.toUpperCase());
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        this.field_d = false;
        if (param0 != 255) {
            md.b((byte) 18);
        }
    }

    final static int a(CharSequence param0, int param1, int param2, boolean param3) {
        int stackIn_10_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 < 2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-37 > (param1 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException("" + param1);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 0;
                        if (param2 < -12) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        md.a((String[]) null, -25, (int[]) null, (ul) null, (String[]) null, (ja[][]) null, (ja[][]) null, (String[][]) null, (byte[]) null, -121, true, (byte[]) null, (String[]) null, 73, (String[][]) null);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 0;
                        var6 = 0;
                        var7 = param0.length();
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 <= var8) {
                            statePc = 41;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param0.charAt(var8);
                        stackIn_42_0 = -1;
                        stackIn_10_0 = stackIn_42_0;
                        if (var11 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == (var8 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 45) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = 1;
                        if (var11 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var9 != 43) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param3) {
                            statePc = 40;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var9 < 48) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var9 > 57) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 -= 48;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9 < 65) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var9 > 90) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9 -= 55;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var9 < 97) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (122 < var9) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 -= 87;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param1 > var9) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4_int != 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = -var9;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10 = var9 + param1 * var6;
                        if (var6 != var10 / param1) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5 = 1;
                        var6 = var10;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = var5;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = var6;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return stackIn_46_0;
                }
                case 47: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_49_0 = (RuntimeException) (var4);
                    stackIn_48_0 = stackIn_49_0;
                    stackIn_49_1 = new StringBuilder().append("md.J(");
                    stackIn_48_1 = stackIn_49_1;
                    if (param0 == null) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_50_2 = "{...}";
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_50_2 = "null";
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    throw fa.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    md() {
        this.field_d = false;
        this.field_m = (byte) 0;
    }

    static {
        field_u = new th();
    }
}
