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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
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
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("bf.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
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
        RuntimeException var2 = null;
        ka var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                      stackOut_8_0 = -3;
                      stackOut_8_1 = var3.field_l ^ -1;
                      stackIn_19_0 = stackOut_8_0;
                      stackIn_19_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (stackIn_9_0 != stackIn_9_1) {
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
                stackOut_18_0 = 98;
                stackOut_18_1 = (param1 - -13) / 35;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
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
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("bf.C(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
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
        int var5 = 0;
        String var6 = null;
        ui var7 = null;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        boolean stackOut_2_0 = false;
        byte stackOut_6_0 = 0;
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
            stackOut_6_0 = param2;
            stackIn_7_0 = stackOut_6_0;
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
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 0) {
          var4 = (ui) ((Object) this.field_p.c(43));
          L0: while (true) {
            if (var4 != null) {
              var4.c(9307);
              var4 = (ui) ((Object) this.field_p.b(6));
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var2 = -43 / ((param0 - -32) / 47);
        this.a(true);
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
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("bf.A(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
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
        int var14 = 0;
        boolean[][] var15 = null;
        boolean[][] var16 = null;
        boolean[][] var17 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_k = param0.field_i.field_k;
            this.field_l = param3;
            this.field_i = param2;
            this.field_o = param1;
            param3 = param3 / 24;
            param2 = param2 / 24;
            var17 = new boolean[oi.field_i * 2 - -1][1 + 2 * oi.field_i];
            var16 = var17;
            var15 = var16;
            var5_array = var15;
            var6 = new boolean[var17.length][var17[0].length];
            var7 = param2 - oi.field_i;
            var8 = param3 + -oi.field_i;
            var15[oi.field_i][oi.field_i] = true;
            var9 = 0;
            L1: while (true) {
              stackOut_2_0 = oi.field_i ^ -1;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= (var9 ^ -1)) {
                      break L4;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_31_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var14 != 0) {
                        break L3;
                      } else {
                        var10 = stackIn_5_0;
                        L5: while (true) {
                          stackOut_6_0 = var5_array.length ^ -1;
                          stackIn_7_0 = stackOut_6_0;
                          L6: while (true) {
                            L7: {
                              if (stackIn_7_0 >= (var10 ^ -1)) {
                                break L7;
                              } else {
                                stackOut_8_0 = 0;
                                stackIn_3_0 = stackOut_8_0;
                                stackIn_9_0 = stackOut_8_0;
                                if (var14 != 0) {
                                  continue L2;
                                } else {
                                  var11 = stackIn_9_0;
                                  L8: while (true) {
                                    L9: {
                                      if (var5_array[0].length <= var11) {
                                        break L9;
                                      } else {
                                        var12 = var11 - -var7;
                                        var13 = var10 - -var8;
                                        stackOut_11_0 = var12;
                                        stackIn_7_0 = stackOut_11_0;
                                        stackIn_12_0 = stackOut_11_0;
                                        if (var14 != 0) {
                                          continue L6;
                                        } else {
                                          L10: {
                                            if (stackIn_12_0 <= 0) {
                                              break L10;
                                            } else {
                                              if (-1 <= (var13 ^ -1)) {
                                                break L10;
                                              } else {
                                                if (var12 >= this.field_k[0].length) {
                                                  break L10;
                                                } else {
                                                  if (this.field_k.length <= var13) {
                                                    break L10;
                                                  } else {
                                                    if ((this.field_k[var13][var12] & 1) == 0) {
                                                      break L10;
                                                    } else {
                                                      L11: {
                                                        if (var5_array[var10][var11]) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (-1 <= (var11 ^ -1)) {
                                                              break L12;
                                                            } else {
                                                              if (var5_array[var10][var11 - 1]) {
                                                                break L11;
                                                              } else {
                                                                break L12;
                                                              }
                                                            }
                                                          }
                                                          L13: {
                                                            if (-1 <= (var10 ^ -1)) {
                                                              break L13;
                                                            } else {
                                                              if (var5_array[var10 - 1][var11]) {
                                                                break L11;
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                          }
                                                          L14: {
                                                            if (var11 >= var5_array[0].length - 1) {
                                                              break L14;
                                                            } else {
                                                              if (var5_array[var10][var11 + 1]) {
                                                                break L11;
                                                              } else {
                                                                break L14;
                                                              }
                                                            }
                                                          }
                                                          if (var10 >= -1 + var5_array.length) {
                                                            break L10;
                                                          } else {
                                                            if (!var5_array[1 + var10][var11]) {
                                                              break L10;
                                                            } else {
                                                              break L11;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var6[var10][var11] = true;
                                                      break L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var11++;
                                          if (var14 == 0) {
                                            continue L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    var10++;
                                    if (var14 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            var10_ref_boolean____ = var5_array;
                            var5_array = var6;
                            var6 = var10_ref_boolean____;
                            var9++;
                            if (var14 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  this.field_p = new th();
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L3;
                }
                var9 = stackIn_31_0;
                L15: while (true) {
                  stackOut_32_0 = var5_array.length;
                  stackOut_32_1 = var9;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  L16: while (true) {
                    if (stackIn_33_0 <= stackIn_33_1) {
                      break L0;
                    } else {
                      if (var14 == 0) {
                        var10 = 0;
                        L17: while (true) {
                          if (var5_array[0].length <= var10) {
                            var9++;
                            continue L15;
                          } else {
                            var11 = var7 + var10;
                            var12 = var9 - -var8;
                            var13 = (param3 + -var12) * (-var12 + param3) + (param2 + -var11) * (param2 - var11);
                            stackOut_38_0 = 64;
                            stackOut_38_1 = var13;
                            stackIn_33_0 = stackOut_38_0;
                            stackIn_33_1 = stackOut_38_1;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            if (var14 != 0) {
                              continue L16;
                            } else {
                              L18: {
                                if (stackIn_39_0 <= stackIn_39_1) {
                                  break L18;
                                } else {
                                  if (!var5_array[var9][var10]) {
                                    break L18;
                                  } else {
                                    this.field_p.a(new ui(var11, var12, var13), false);
                                    break L18;
                                  }
                                }
                              }
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var5);
            stackOut_45_1 = new StringBuilder().append("bf.<init>(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L19;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L19;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_m = false;
        field_j = "Full";
        field_q = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
