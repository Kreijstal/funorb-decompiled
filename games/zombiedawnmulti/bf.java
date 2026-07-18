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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((bf) this).c(-49);
                break L1;
              }
            }
            var3_int = param0.e((byte) -112);
            var4 = param0.g(param1 ^ 1829947600);
            var5 = (ui) (Object) ((bf) this).field_p.c(69);
            L2: while (true) {
              if (var5 == null) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (var5.a(param1 + 40, var3_int, var4)) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  var5 = (ui) (Object) ((bf) this).field_p.b(6);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("bf.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(ka param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ka var3 = null;
        int var4 = 0;
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
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_d) {
              L1: {
                L2: {
                  if (param0.field_i != 0) {
                    break L2;
                  } else {
                    if (param0.field_o == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (uf.field_g <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = uk.field_M[var2_int];
                      if (var3.field_l != 2) {
                        break L4;
                      } else {
                        if (var3.field_i != param0.field_i) {
                          break L4;
                        } else {
                          if (param0.field_o != var3.field_o) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_r != null) {
                  ld.field_Kb = param0.field_a;
                  bq.field_f = param0.field_e;
                  tb.field_t = param0.field_r;
                  en.field_c = param0.field_l;
                  break L5;
                } else {
                  break L5;
                }
              }
              var2_int = 0;
              int discarded$2 = 83;
              vk.a(param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("bf.C(");
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
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + -53 + ')');
        }
    }

    public static void d() {
        field_f = null;
        field_n = null;
        field_j = null;
        field_h = null;
        field_q = null;
    }

    final boolean a(int param0, int param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        ui var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = (ui) (Object) ((bf) this).field_p.c(param2 ^ 100);
        L0: while (true) {
          if (var7 == null) {
            if (param2 != 29) {
              var6 = null;
              bf.a(false, -90, (String) null);
              return false;
            } else {
              return false;
            }
          } else {
            if (!var7.a(param2 + -146, param0, param1)) {
              var7 = (ui) (Object) ((bf) this).field_p.b(6);
              continue L0;
            } else {
              return true;
            }
          }
        }
    }

    final void c(int param0) {
        int var3 = 0;
        ui var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 0) {
          return;
        } else {
          var4 = (ui) (Object) ((bf) this).field_p.c(43);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              var4.c(9307);
              var4 = (ui) (Object) ((bf) this).field_p.b(6);
              continue L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = -43 / ((param0 - -32) / 47);
        ((bf) this).a(true);
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              nj.field_f = false;
              ud.field_ab = false;
              if (param0) {
                break L1;
              } else {
                field_j = null;
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
                    if (param1 != 8) {
                      break L3;
                    } else {
                      L4: {
                        if (ch.field_e) {
                          param2 = ql.field_f;
                          break L4;
                        } else {
                          param2 = f.field_b;
                          break L4;
                        }
                      }
                      param1 = 2;
                      b.field_c.a(-120, fa.field_Ib);
                      break L3;
                    }
                  }
                  L5: {
                    if (param1 != 10) {
                      break L5;
                    } else {
                      var3_int = 0;
                      int discarded$2 = -2;
                      ua.i();
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int == 0) {
                      break L6;
                    } else {
                      L7: {
                        if (!ud.field_ab) {
                          break L7;
                        } else {
                          param2 = vl.a(cj.field_Eb, new String[1], 2);
                          break L7;
                        }
                      }
                      L8: {
                        if (bl.field_h) {
                          param2 = wg.field_c;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      h.field_L.a(param2, 125, param1);
                      break L6;
                    }
                  }
                  if (256 == param1) {
                    break L2;
                  } else {
                    if (param1 != 10) {
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
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("bf.A(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    bf(fh param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean[][] var5_array = null;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean[][] var15 = null;
        int var16 = 0;
        boolean[][] var17 = null;
        boolean[][] var18 = null;
        boolean[][] var19 = null;
        boolean[][] var20 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        try {
          L0: {
            ((bf) this).field_k = param0.field_i.field_k;
            ((bf) this).field_l = param3;
            ((bf) this).field_i = param2;
            ((bf) this).field_o = param1;
            param3 = param3 / 24;
            param2 = param2 / 24;
            var20 = new boolean[oi.field_i * 2 - -1][1 + 2 * oi.field_i];
            var19 = var20;
            var18 = var19;
            var17 = var18;
            var15 = var17;
            var5_array = var15;
            var6 = new boolean[var20.length][var20[0].length];
            var7 = param2 - oi.field_i;
            var8 = param3 + -oi.field_i;
            var15[oi.field_i][oi.field_i] = true;
            var9 = 0;
            L1: while (true) {
              if (~oi.field_i >= ~var9) {
                ((bf) this).field_p = new th();
                var9 = 0;
                L2: while (true) {
                  if (var5_array.length <= var9) {
                    break L0;
                  } else {
                    var16 = 0;
                    var10 = var16;
                    L3: while (true) {
                      if (var5_array[0].length <= var16) {
                        var9++;
                        continue L2;
                      } else {
                        var11 = var7 + var16;
                        var12 = var9 - -var8;
                        var13 = (param3 + -var12) * (-var12 + param3) + (param2 + -var11) * (param2 - var11);
                        if (64 <= var13) {
                          var16++;
                          continue L3;
                        } else {
                          if (!var5_array[var9][var16]) {
                            var16++;
                            continue L3;
                          } else {
                            ((bf) this).field_p.a((br) (Object) new ui(var11, var12, var13), false);
                            var16++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var10 = 0;
                L4: while (true) {
                  if (~var5_array.length >= ~var10) {
                    var10_ref_boolean____ = var5_array;
                    var5_array = var6;
                    var6 = var10_ref_boolean____;
                    var9++;
                    continue L1;
                  } else {
                    var11 = 0;
                    L5: while (true) {
                      if (var5_array[0].length <= var11) {
                        var10++;
                        continue L4;
                      } else {
                        var12 = var11 - -var7;
                        var13 = var10 - -var8;
                        if (var12 <= 0) {
                          var11++;
                          var11++;
                          continue L5;
                        } else {
                          if (var13 <= 0) {
                            var11++;
                            var11++;
                            continue L5;
                          } else {
                            if (~var12 <= ~((bf) this).field_k[0].length) {
                              var11++;
                              continue L5;
                            } else {
                              if (~((bf) this).field_k.length >= ~var13) {
                                var11++;
                                continue L5;
                              } else {
                                if ((((bf) this).field_k[var13][var12] & 1) == 0) {
                                  var11++;
                                  continue L5;
                                } else {
                                  L6: {
                                    if (var5_array[var10][var11]) {
                                      break L6;
                                    } else {
                                      L7: {
                                        if (var11 <= 0) {
                                          break L7;
                                        } else {
                                          if (var5_array[var10][var11 - 1]) {
                                            break L6;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      L8: {
                                        if (var10 <= 0) {
                                          break L8;
                                        } else {
                                          if (var5_array[var10 - 1][var11]) {
                                            break L6;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (~var11 <= ~(var5_array[0].length - 1)) {
                                          break L9;
                                        } else {
                                          if (var5_array[var10][var11 + 1]) {
                                            break L6;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (~var10 <= ~(-1 + var5_array.length)) {
                                        var11++;
                                        continue L5;
                                      } else {
                                        if (!var5_array[1 + var10][var11]) {
                                          var11++;
                                          continue L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  var6[var10][var11] = true;
                                  var11++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var5;
            stackOut_46_1 = new StringBuilder().append("bf.<init>(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L10;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
        field_j = "Full";
        field_q = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
