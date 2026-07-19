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
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            sj.a(up.field_d, -891231071, param0, true, lj.field_n, 0, ab.field_j);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= lj.field_n) {
                    break L3;
                  } else {
                    la.field_c[var2_int + param0] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param1 <= -27) {
                    break L4;
                  } else {
                    field_u = (th) null;
                    break L4;
                  }
                }
                sj.a(ba.field_m, -891231071, param0 - -param0, false, param0 + lj.field_n, param0, mj.field_Ub);
                break L2;
              }
              L5: {
                if (param0 < lj.field_n) {
                  lj.field_n = param0;
                  break L5;
                } else {
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "md.A(" + param0 + ',' + param1 + ')');
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
        Object stackIn_11_0 = null;
        ml stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        ml stackOut_15_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                    stackOut_10_0 = null;
                    stackIn_19_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (stackIn_11_0 != var5) {
                          break L4;
                        } else {
                          var5 = var4.field_Hb;
                          break L4;
                        }
                      }
                      if (var5.equals(var2)) {
                        stackOut_15_0 = (ml) (var4);
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var4 = (ml) ((Object) bh.field_f.b((byte) 68));
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          stackOut_18_0 = null;
                          stackIn_19_0 = stackOut_18_0;
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
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2_ref);
            stackOut_20_1 = new StringBuilder().append("md.K(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
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
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var6 >= this.field_n) {
                break L2;
              } else {
                this.field_k[var6] = (short)(param0 * this.field_k[var6] / param1);
                this.field_E[var6] = (short)(this.field_E[var6] * param2 / param1);
                this.field_v[var6] = (short)(param3 * this.field_v[var6] / param1);
                var6++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (param4 == 2122) {
                break L3;
              } else {
                this.field_v = (short[]) null;
                break L3;
              }
            }
            this.a(255);
            break L1;
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= this.field_n) {
                break L2;
              } else {
                this.field_k[var5] = (short)(this.field_k[var5] + param2);
                this.field_E[var5] = (short)(this.field_E[var5] + param3);
                this.field_v[var5] = (short)(this.field_v[var5] + param0);
                var5++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.a(255);
            break L1;
          }
          L3: {
            if (param1 == 3) {
              break L3;
            } else {
              this.field_t = (int[]) null;
              break L3;
            }
          }
          return;
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = md.a(param0, 10, -31, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("md.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L6;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("md.I(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(String[] args, int param1, int[] param2, ul param3, String[] param4, ja[][] param5, ja[][] param6, String[][] param7, byte[] param8, int param9, boolean param10, byte[] param11, String[] param12, int param13, String[][] param14) {
        int discarded$4 = 0;
        mo[] array$5 = null;
        mo[] array$6 = null;
        mo[] array$7 = null;
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
        cj stackIn_70_0 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_3_0 = null;
        cj stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        cj stackOut_3_3 = null;
        cj stackOut_5_0 = null;
        cj stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        cj stackOut_5_3 = null;
        String stackOut_5_4 = null;
        cj stackOut_4_0 = null;
        cj stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        cj stackOut_4_3 = null;
        String stackOut_4_4 = null;
        int stackOut_55_0 = 0;
        int stackOut_38_0 = 0;
        cj stackOut_58_0 = null;
        Object stackOut_62_0 = null;
        mo[] stackOut_62_1 = null;
        Object stackOut_66_0 = null;
        mo[] stackOut_66_1 = null;
        cj stackOut_69_0 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        var21 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
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
                break L1;
              } else {
                pd.field_b.a((byte) 50, mo.field_Hb);
                break L1;
              }
            }
            L2: {
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
              stackOut_3_0 = null;
              stackOut_3_1 = null;
              stackOut_3_2 = 0L;
              stackOut_3_3 = he.field_i;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (!tb.field_u) {
                stackOut_5_0 = null;
                stackOut_5_1 = null;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = (cj) ((Object) stackIn_5_3);
                stackOut_5_4 = cn.field_C;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L2;
              } else {
                stackOut_4_0 = null;
                stackOut_4_1 = null;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = (cj) ((Object) stackIn_4_3);
                stackOut_4_4 = ff.field_t;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L2;
              }
            }
            L3: {
              pl.field_L = new cj(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
              cm.field_a = new cj(0L, (cj) null);
              cm.field_a.a((byte) 50, ro.field_O);
              if (param10) {
                break L3;
              } else {
                var22 = (CharSequence) null;
                discarded$4 = md.a((CharSequence) null, -24);
                break L3;
              }
            }
            L4: {
              cm.field_a.a((byte) 50, ml.field_Lb);
              ml.field_Lb.a((byte) 50, k.field_g);
              ml.field_Lb.a((byte) 50, ud.field_M);
              ml.field_Lb.a((byte) 50, tk.field_l);
              if (tb.field_u) {
                ml.field_Lb.a((byte) 50, sc.field_d);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ml.field_Lb.a((byte) 50, da.field_h);
              ml.field_Lb.a((byte) 50, bp.field_w);
              ml.field_Lb.a((byte) 50, ek.field_H);
              if (tb.field_u) {
                cm.field_a.a((byte) 50, ia.field_t);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
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
                break L6;
              } else {
                ga.field_r.a((byte) 50, bf.field_h);
                break L6;
              }
            }
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
            L7: while (true) {
              L8: {
                L9: {
                  L10: {
                    L11: {
                      if (5 <= var17_int) {
                        break L11;
                      } else {
                        ma.field_b[0][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, qp.field_u[var17_int], t.field_c[var17_int]);
                        var17_int++;
                        if (var21 != 0) {
                          break L10;
                        } else {
                          if (var21 == 0) {
                            continue L7;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (-3 >= (qo.field_r.length ^ -1)) {
                      mi.field_Ib[1] = new cj(0L, m.field_B, gi.field_n);
                      array$5 = new mo[1 + qo.field_r.length];
                      ma.field_b[1] = array$5;
                      ma.field_b[1][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                      break L10;
                    } else {
                      break L9;
                    }
                  }
                  var17_int = 0;
                  L12: while (true) {
                    if (var17_int >= qo.field_r.length) {
                      break L9;
                    } else {
                      ma.field_b[1][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, Integer.toString(qo.field_r[var17_int]));
                      var17_int++;
                      if (var21 != 0) {
                        break L8;
                      } else {
                        if (var21 == 0) {
                          continue L12;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                mi.field_Ib[2] = new cj(0L, m.field_B, qj.field_j);
                ma.field_b[2] = new mo[]{new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[0], be.field_f), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[1], wf.field_k)};
                break L8;
              }
              L13: {
                L14: {
                  if (-2 <= (r.field_f ^ -1)) {
                    break L14;
                  } else {
                    mi.field_Ib[3] = new cj(0L, m.field_B, gj.field_d);
                    array$6 = new mo[r.field_f - -1];
                    ma.field_b[3] = array$6;
                    ma.field_b[3][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    var17_int = 0;
                    L15: while (true) {
                      if (var17_int >= r.field_f) {
                        break L14;
                      } else {
                        ma.field_b[3][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, um.field_b[var17_int]);
                        var17_int++;
                        if (var21 != 0) {
                          break L13;
                        } else {
                          if (var21 == 0) {
                            continue L15;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                }
                var17_int = 0;
                break L13;
              }
              L16: while (true) {
                L17: {
                  if (param9 <= var17_int) {
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    break L17;
                  } else {
                    mi.field_Ib[4 + var17_int] = new cj(0L, m.field_B, cf.field_f[var17_int]);
                    array$7 = new mo[1 + tq.b(255, (int) ng.field_b[var17_int])];
                    ma.field_b[var17_int + 4] = array$7;
                    ma.field_b[var17_int + 4][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    stackOut_38_0 = 0;
                    stackIn_56_0 = stackOut_38_0;
                    stackIn_39_0 = stackOut_38_0;
                    if (var21 != 0) {
                      break L17;
                    } else {
                      var18 = stackIn_39_0;
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (var18 >= (255 & ng.field_b[var17_int])) {
                              break L20;
                            } else {
                              if (var21 != 0) {
                                break L19;
                              } else {
                                L21: {
                                  if (ZombieDawnMulti.field_L != null) {
                                    if (null == ZombieDawnMulti.field_L[var17_int]) {
                                      var19_ref = null;
                                      break L21;
                                    } else {
                                      var19_ref = ZombieDawnMulti.field_L[var17_int][var18];
                                      break L21;
                                    }
                                  } else {
                                    var19_ref = null;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (null == ul.field_m) {
                                    var20 = null;
                                    break L22;
                                  } else {
                                    if (ul.field_m[var17_int] == null) {
                                      var20 = null;
                                      break L22;
                                    } else {
                                      var20 = ul.field_m[var17_int][var18];
                                      break L22;
                                    }
                                  }
                                }
                                ma.field_b[var17_int + 4][var18 - -1] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) (var19_ref), (String) (var20));
                                var18++;
                                if (var21 == 0) {
                                  continue L18;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          var17_int++;
                          break L19;
                        }
                        continue L16;
                      }
                    }
                  }
                }
                var17_int = stackIn_56_0;
                L23: while (true) {
                  L24: {
                    L25: {
                      if (param9 + 4 <= var17_int) {
                        break L25;
                      } else {
                        stackOut_58_0 = mi.field_Ib[var17_int];
                        stackIn_70_0 = stackOut_58_0;
                        stackIn_59_0 = stackOut_58_0;
                        if (var21 != 0) {
                          break L24;
                        } else {
                          L26: {
                            if (stackIn_59_0 != null) {
                              mi.field_Ib[var17_int].field_J = 11;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          stackOut_62_0 = null;
                          stackOut_62_1 = ma.field_b[var17_int];
                          stackIn_63_0 = stackOut_62_0;
                          stackIn_63_1 = stackOut_62_1;
                          L27: while (true) {
                            L28: {
                              if (stackIn_63_0 != stackIn_63_1) {
                                var18 = 0;
                                if (ma.field_b[var17_int].length <= var18) {
                                  break L28;
                                } else {
                                  stackOut_66_0 = null;
                                  stackOut_66_1 = ma.field_b[var17_int];
                                  stackIn_63_0 = stackOut_66_0;
                                  stackIn_63_1 = stackOut_66_1;
                                  continue L27;
                                }
                              } else {
                                break L28;
                              }
                            }
                            var17_int++;
                            if (var21 == 0) {
                              continue L23;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                    }
                    en.field_b = new cj(0L, he.field_i);
                    gb.field_a = new cj(0L, he.field_i);
                    eb.field_B = new cj(0L, qc.field_u);
                    eb.field_B.b((byte) -32, vo.field_m);
                    eb.field_B.field_lb = 1;
                    stackOut_69_0 = eb.field_B;
                    stackIn_70_0 = stackOut_69_0;
                    break L24;
                  }
                  var17 = stackIn_70_0;
                  var17.field_R = 1;
                  fc.field_a = new cj(0L, (cj) null);
                  fc.field_a.a((byte) 50, gg.field_m);
                  fc.field_a.a((byte) 50, dl.field_a);
                  dl.field_a.a((byte) 50, ik.field_d);
                  var18 = 0;
                  L29: while (true) {
                    L30: {
                      L31: {
                        if (4 + param9 <= var18) {
                          break L31;
                        } else {
                          if (var21 != 0) {
                            break L30;
                          } else {
                            L32: {
                              L33: {
                                L34: {
                                  if (var18 != 1) {
                                    break L34;
                                  } else {
                                    if (qo.field_r.length < 2) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                L35: {
                                  if (var18 != 3) {
                                    break L35;
                                  } else {
                                    if ((r.field_f ^ -1) >= -2) {
                                      break L33;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                dl.field_a.a((byte) 50, mi.field_Ib[var18]);
                                var19 = 0;
                                L36: while (true) {
                                  if (ma.field_b[var18].length <= var19) {
                                    break L33;
                                  } else {
                                    if (var21 != 0) {
                                      break L32;
                                    } else {
                                      L37: {
                                        if (null != ma.field_b[var18][var19]) {
                                          dl.field_a.a((byte) 50, ma.field_b[var18][var19]);
                                          break L37;
                                        } else {
                                          break L37;
                                        }
                                      }
                                      var19++;
                                      if (var21 == 0) {
                                        continue L36;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                              var18++;
                              break L32;
                            }
                            if (var21 == 0) {
                              continue L29;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      fc.field_a.a((byte) 50, en.field_b);
                      fc.field_a.a((byte) 50, gb.field_a);
                      fc.field_a.a((byte) 50, eb.field_B);
                      mq.field_l = new cj(0L, kc.field_c, p.field_c.toUpperCase());
                      pg.field_a = new cj(0L, kb.field_n, qq.field_d.toUpperCase());
                      break L30;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var15 = decompiledCaughtException;
            stackOut_90_0 = (RuntimeException) (var15);
            stackOut_90_1 = new StringBuilder().append("md.F(");
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (args == null) {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L38;
            } else {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L38;
            }
          }
          L39: {
            stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
            stackOut_93_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(',').append(param1).append(',');
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param2 == null) {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L39;
            } else {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L39;
            }
          }
          L40: {
            stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
            stackOut_96_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param3 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L40;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L40;
            }
          }
          L41: {
            stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
            stackOut_99_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(',');
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param4 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L41;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L41;
            }
          }
          L42: {
            stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
            stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param5 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L42;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L42;
            }
          }
          L43: {
            stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
            stackOut_105_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',');
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param6 == null) {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L43;
            } else {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L43;
            }
          }
          L44: {
            stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',');
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param7 == null) {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L44;
            } else {
              stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L44;
            }
          }
          L45: {
            stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
            stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',');
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param8 == null) {
              stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L45;
            } else {
              stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
              stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L45;
            }
          }
          L46: {
            stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param11 == null) {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L46;
            } else {
              stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackOut_115_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L46;
            }
          }
          L47: {
            stackOut_117_0 = (RuntimeException) ((Object) stackIn_117_0);
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',');
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param12 == null) {
              stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L47;
            } else {
              stackOut_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L47;
            }
          }
          L48: {
            stackOut_120_0 = (RuntimeException) ((Object) stackIn_120_0);
            stackOut_120_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',').append(param13).append(',');
            stackIn_122_0 = stackOut_120_0;
            stackIn_122_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param14 == null) {
              stackOut_122_0 = (RuntimeException) ((Object) stackIn_122_0);
              stackOut_122_1 = (StringBuilder) ((Object) stackIn_122_1);
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L48;
            } else {
              stackOut_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackOut_121_1 = (StringBuilder) ((Object) stackIn_121_1);
              stackOut_121_2 = "{...}";
              stackIn_123_0 = stackOut_121_0;
              stackIn_123_1 = stackOut_121_1;
              stackIn_123_2 = stackOut_121_2;
              break L48;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_123_0), stackIn_123_2 + ')');
        }
    }

    private final void a(int param0) {
        this.field_d = false;
        if (param0 != 255) {
            md.b((byte) 18);
        }
    }

    final static int a(CharSequence param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_45_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (-37 > (param1 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param2 < -12) {
                      break L2;
                    } else {
                      md.a((String[]) null, -25, (int[]) null, (ul) null, (String[]) null, (ja[][]) null, (ja[][]) null, (String[][]) null, (byte[]) null, -121, true, (byte[]) null, (String[]) null, 73, (String[][]) null);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = 0;
                  L3: while (true) {
                    L4: {
                      if (var7 <= var8) {
                        stackOut_41_0 = var5;
                        stackIn_42_0 = stackOut_41_0;
                        break L4;
                      } else {
                        var9 = param0.charAt(var8);
                        stackOut_9_0 = -1;
                        stackIn_42_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_10_0 == (var8 ^ -1)) {
                                L7: {
                                  if (var9 == 45) {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                if (var9 != 43) {
                                  break L6;
                                } else {
                                  if (param3) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (var9 > 57) {
                                    break L9;
                                  } else {
                                    var9 -= 48;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (var9 < 65) {
                                  break L10;
                                } else {
                                  if (var9 > 90) {
                                    break L10;
                                  } else {
                                    var9 -= 55;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (var9 < 97) {
                                  break L11;
                                } else {
                                  if (122 < var9) {
                                    break L11;
                                  } else {
                                    var9 -= 87;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              throw new NumberFormatException();
                            }
                            if (param1 > var9) {
                              L12: {
                                if (var4_int != 0) {
                                  var9 = -var9;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var10 = var9 + param1 * var6;
                              if (var6 != var10 / param1) {
                                throw new NumberFormatException();
                              } else {
                                var5 = 1;
                                var6 = var10;
                                break L5;
                              }
                            } else {
                              throw new NumberFormatException();
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                    if (stackIn_42_0 == 0) {
                      throw new NumberFormatException();
                    } else {
                      stackOut_45_0 = var6;
                      stackIn_46_0 = stackOut_45_0;
                      break L0;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var4);
            stackOut_47_1 = new StringBuilder().append("md.J(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L13;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L13;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_46_0;
    }

    md() {
        this.field_d = false;
        this.field_m = (byte) 0;
    }

    static {
        field_u = new th();
    }
}
