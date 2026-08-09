/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends br {
    static tq field_n;
    static ja field_f;
    private th field_p;
    private int[][] field_k;
    static boolean field_m;
    static String field_j;
    int field_l;
    static String field_q;
    int field_i;
    int field_o;
    static cj field_h;
    static int field_g;

    final boolean a(lm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ui var5 = null;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.c(-49);
                break L1;
              }
            }
            var3_int = param0.e((byte) -112);
            var4 = param0.g(param1 ^ 1829947600);
            var5 = (ui) ((Object) this.field_p.c(69));
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var5.a(param1 + 40, var3_int, var4);
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0) {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var5 = (ui) ((Object) this.field_p.b(6));
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("bf.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void a(ka param0, int param1) {
        int var2_int = 0;
        ka var3 = null;
        int var4 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_d) {
              L1: {
                L2: {
                  L3: {
                    if (param0.field_i != 0) {
                      break L3;
                    } else {
                      if (param0.field_o == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 0;
                  L4: while (true) {
                    if (uf.field_g <= var2_int) {
                      break L2;
                    } else {
                      var3 = uk.field_M[var2_int];
                      stackIn_19_0 = -3;

                      stackIn_19_1 = var3.field_l ^ -1;

                      if (var4 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (stackIn_19_0 != stackIn_19_1) {
                            break L5;
                          } else {
                            if (var3.field_i != param0.field_i) {
                              break L5;
                            } else {
                              if (param0.field_o != var3.field_o) {
                                break L5;
                              } else {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (param0.field_r != null) {
                    ld.field_Kb = param0.field_a;
                    bq.field_f = param0.field_e;
                    tb.field_t = param0.field_r;
                    en.field_c = param0.field_l;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackIn_19_0 = 98;
                stackIn_19_1 = (param1 - -13) / 35;
                break L1;
              }
              var2_int = stackIn_19_0 % stackIn_19_1;
              vk.a(param0, (byte) 83);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("bf.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 29919) {
            return;
        }
        field_n = null;
        field_j = null;
        field_h = null;
        field_q = null;
    }

    final boolean a(int param0, int param1, byte param2) {
        int var5;
        String var6;
        ui var7;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        boolean stackOut_2_0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = (ui) ((Object) this.field_p.c(param2 ^ 100));
        L0: while (true) {
          L1: {
            L2: {
              if (var7 == null) {
                break L2;
              } else {
                stackOut_2_0 = var7.a(param2 + -146, param0, param1);
                stackIn_7_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (!stackIn_3_0) {
                    var7 = (ui) ((Object) this.field_p.b(6));
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_7_0 = param2;
            break L1;
          }
          if (stackIn_7_0 != 29) {
            var6 = (String) null;
            bf.a(false, -90, (String) null);
            return false;
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        int var3 = 0;
        ui var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var4 = (ui) ((Object) this.field_p.c(43));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 != null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    var4.c(9307);
                    var4 = (ui) ((Object) this.field_p.b(6));
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        int var2 = -43 / ((param0 - -32) / 47);
        this.a(true);
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              nj.field_f = false;
              ud.field_ab = false;
              if (param0) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            L2: {
              if (null == h.field_L) {
                break L2;
              } else {
                if (!h.field_L.field_R) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 1;
                    if (-9 != (param1 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          if (ch.field_e) {
                            break L5;
                          } else {
                            param2 = f.field_b;
                            if (!ZombieDawnMulti.field_E) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        param2 = ql.field_f;
                        break L4;
                      }
                      param1 = 2;
                      b.field_c.a(-120, fa.field_Ib);
                      break L3;
                    }
                  }
                  L6: {
                    if ((param1 ^ -1) != -11) {
                      break L6;
                    } else {
                      var3_int = 0;
                      ua.i(-2);
                      break L6;
                    }
                  }
                  L7: {
                    if (var3_int == 0) {
                      break L7;
                    } else {
                      L8: {
                        if (!ud.field_ab) {
                          break L8;
                        } else {
                          param2 = vl.a(cj.field_Eb, new String[]{param2}, 2);
                          break L8;
                        }
                      }
                      L9: {
                        if (bl.field_h) {
                          param2 = wg.field_c;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      h.field_L.a(param2, 125, param1);
                      break L7;
                    }
                  }
                  if (256 == param1) {
                    break L2;
                  } else {
                    if ((param1 ^ -1) != -11) {
                      if (ch.field_e) {
                        break L2;
                      } else {
                        b.field_c.g((byte) 106);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("bf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    bf(fh param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        boolean[][] var5 = null;
        RuntimeException var5_ref = null;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[][] var15 = null;
        boolean[][] var16 = null;
        boolean[][] var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_k = param0.field_i.field_k;
                        this.field_l = param3;
                        this.field_i = param2;
                        this.field_o = param1;
                        param3 = param3 / 24;
                        param2 = param2 / 24;
                        var17 = new boolean[oi.field_i * 2 - -1][1 + 2 * oi.field_i];
                        var16 = var17;
                        var15 = var16;
                        var5 = var15;
                        var6 = new boolean[var17.length][var17[0].length];
                        var7 = param2 - oi.field_i;
                        var8 = param3 + -oi.field_i;
                        var15[oi.field_i][oi.field_i] = true;
                        var9 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = oi.field_i ^ -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= (var9 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_31_0 = 0;
                        stackIn_5_0 = stackIn_31_0;
                        if (var14 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = var5.length ^ -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= (var10 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_3_0 = 0;
                        stackIn_9_0 = stackIn_3_0;
                        if (var14 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var11 = stackIn_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5[0].length <= var11) {
                            statePc = 28;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12 = var11 - -var7;
                        var13 = var10 - -var8;
                        stackIn_7_0 = var12;
                        stackIn_12_0 = stackIn_7_0;
                        if (var14 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 <= 0) {
                            statePc = 27;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 <= (var13 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var12 >= this.field_k[0].length) {
                            statePc = 27;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_k.length <= var13) {
                            statePc = 27;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((this.field_k[var13][var12] & 1) == 0) {
                            statePc = 27;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5[var10][var11]) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 <= (var11 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var5[var10][var11 - 1]) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-1 <= (var10 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var5[var10 - 1][var11]) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var11 >= var5[0].length - 1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5[var10][var11 + 1]) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var10 >= -1 + var5.length) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!var5[1 + var10][var11]) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6[var10][var11] = true;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10++;
                        if (var14 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10_ref_boolean____ = var5;
                        var5 = var6;
                        var6 = var10_ref_boolean____;
                        var9++;
                        if (var14 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.field_p = new th();
                        stackIn_31_0 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = stackIn_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = var5.length;
                        stackIn_33_1 = var9;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 <= stackIn_33_1) {
                            statePc = 49;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var14 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        return;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var5[0].length <= var10) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var11 = var7 + var10;
                        var12 = var9 - -var8;
                        var13 = (param3 + -var12) * (-var12 + param3) + (param2 + -var11) * (param2 - var11);
                        stackIn_33_0 = 64;
                        stackIn_39_0 = stackIn_33_0;
                        stackIn_33_1 = var13;
                        stackIn_39_1 = stackIn_33_1;
                        if (var14 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 <= stackIn_39_1) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!var5[var9][var10]) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_p.a(new ui(var11, var12, var13), false);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10++;
                        if (var14 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9++;
                        if (var14 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_47_0 = (RuntimeException) (var5_ref);
                    stackIn_46_0 = stackIn_47_0;
                    stackIn_47_1 = new StringBuilder().append("bf.<init>(");
                    stackIn_46_1 = stackIn_47_1;
                    if (param0 == null) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_48_2 = "{...}";
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_48_2 = "null";
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    throw fa.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_m = false;
        field_j = "Full";
        field_q = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
