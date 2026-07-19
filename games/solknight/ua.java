/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ki implements ka {
    static String[] field_M;
    private ge field_K;
    static String field_E;
    static o[] field_F;
    private pj[] field_J;
    static mf field_I;
    static int field_L;
    static int field_N;
    static mg field_G;
    static int field_H;
    private String[] field_D;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = SolKnight.field_L ? 1 : 0;
          qf.field_a = null;
          ug.field_f = 0;
          if (param1 == -86) {
            break L0;
          } else {
            field_L = -67;
            break L0;
          }
        }
        L1: {
          L2: {
            ik.field_b = null;
            var2 = ue.field_a;
            ue.field_a = vc.field_e;
            if (param0 != 51) {
              break L2;
            } else {
              il.field_c.field_c = 2;
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (param0 == 50) {
              break L3;
            } else {
              il.field_c.field_c = 1;
              if (var3 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
          }
          il.field_c.field_c = 5;
          break L1;
        }
        L4: {
          vc.field_e = var2;
          il.field_c.field_l = il.field_c.field_l + 1;
          if (2 > il.field_c.field_l) {
            break L4;
          } else {
            if ((param0 ^ -1) != -52) {
              break L4;
            } else {
              return 2;
            }
          }
        }
        L5: {
          if (-3 < (il.field_c.field_l ^ -1)) {
            break L5;
          } else {
            if (param0 == 50) {
              return 5;
            } else {
              break L5;
            }
          }
        }
        if ((il.field_c.field_l ^ -1) <= -5) {
          return 1;
        } else {
          return -1;
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -77, param2, param3)) {
              var5_int = -102 / ((param1 - 31) / 56);
              if (98 != param2) {
                if (99 != param2) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = this.b(108, param3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = this.a((byte) -112, param3);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("ua.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_I = null;
        int var1 = -23 % ((param0 - 11) / 52);
        field_F = null;
        field_M = null;
        field_E = null;
        field_G = null;
    }

    final static void a(byte param0) {
        if (param0 > -92) {
            ua.a((byte) 57);
        }
        hc.a(lf.field_e, false, ug.field_d, true);
        ga.field_G = true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        mg var5 = field_G;
        if (this.field_D != null) {
            discarded$0 = var5.a(nb.field_d, param2 + this.field_m, this.field_j + param0, this.field_t, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_F);
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        gb var16 = null;
        gb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_58_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var16 = new gb(param1);
            var17 = var16;
            var17.field_m = -2 + param1.length;
            nb.field_c = var17.i(39);
            qf.field_d = new int[nb.field_c];
            rg.field_e = new boolean[nb.field_c];
            ph.field_h = new int[nb.field_c];
            uj.field_b = new int[nb.field_c];
            sa.field_l = new int[nb.field_c];
            jc.field_c = new byte[nb.field_c][];
            uf.field_s = new byte[nb.field_c][];
            var17.field_m = -(nb.field_c * 8) + param1.length - 7;
            kl.field_a = var17.i(param0 ^ -8);
            we.field_e = var17.i(28);
            var3 = 1 + (255 & var17.j(255));
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (nb.field_c <= var4) {
                    break L3;
                  } else {
                    ph.field_h[var4] = var16.i(-116);
                    var4++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 >= nb.field_c) {
                      break L6;
                    } else {
                      qf.field_d[var4] = var16.i(-110);
                      var4++;
                      if (var15 != 0) {
                        break L5;
                      } else {
                        if (var15 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var4 >= nb.field_c) {
                        break L9;
                      } else {
                        sa.field_l[var4] = var16.i(11);
                        var4++;
                        if (var15 != 0) {
                          break L8;
                        } else {
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L8;
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (nb.field_c <= var4) {
                          break L12;
                        } else {
                          uj.field_b[var4] = var16.i(param0 + 40);
                          var4++;
                          if (var15 != 0) {
                            break L11;
                          } else {
                            if (var15 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var17.field_m = param1.length + (-7 + -(8 * nb.field_c) + 3 + -(3 * var3));
                      ig.field_H = new int[var3];
                      break L11;
                    }
                    var4 = 1;
                    L13: while (true) {
                      L14: {
                        if (var4 >= var3) {
                          var17.field_m = 0;
                          stackOut_28_0 = param0;
                          stackIn_29_0 = stackOut_28_0;
                          break L14;
                        } else {
                          ig.field_H[var4] = var16.b(false);
                          stackOut_24_0 = ig.field_H[var4];
                          stackIn_29_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var15 != 0) {
                            break L14;
                          } else {
                            L15: {
                              if (stackIn_25_0 != 0) {
                                break L15;
                              } else {
                                ig.field_H[var4] = 1;
                                break L15;
                              }
                            }
                            var4++;
                            continue L13;
                          }
                        }
                      }
                      var4 = stackIn_29_0;
                      L16: while (true) {
                        stackOut_30_0 = var4 ^ -1;
                        stackIn_31_0 = stackOut_30_0;
                        L17: while (true) {
                          stackOut_31_0 = stackIn_31_0;
                          stackOut_31_1 = nb.field_c ^ -1;
                          stackIn_32_0 = stackOut_31_0;
                          stackIn_32_1 = stackOut_31_1;
                          L18: while (true) {
                            L19: {
                              if (stackIn_32_0 <= stackIn_32_1) {
                                break L19;
                              } else {
                                var5 = sa.field_l[var4];
                                var6 = uj.field_b[var4];
                                var7 = var5 * var6;
                                var20 = new byte[var7];
                                var18 = var20;
                                var8 = var18;
                                jc.field_c[var4] = var20;
                                var21 = new byte[var7];
                                var19 = var21;
                                var9 = var19;
                                uf.field_s[var4] = var21;
                                var10 = 0;
                                var11 = var17.j(255);
                                if (var15 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  L20: {
                                    L21: {
                                      L22: {
                                        if (0 != (var11 & 1)) {
                                          break L22;
                                        } else {
                                          var12 = 0;
                                          L23: while (true) {
                                            if (var12 >= var7) {
                                              if ((2 & var11) == 0) {
                                                break L21;
                                              } else {
                                                var12 = 0;
                                                if (var7 <= var12) {
                                                  if (var15 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L22;
                                                  }
                                                } else {
                                                  dupTemp$1 = var16.a((byte) -14);
                                                  var9[var12] = dupTemp$1;
                                                  var13 = dupTemp$1;
                                                  stackOut_42_0 = var10;
                                                  stackOut_42_1 = var13 ^ -1;
                                                  stackIn_32_0 = stackOut_42_0;
                                                  stackIn_32_1 = stackOut_42_1;
                                                  continue L18;
                                                }
                                              }
                                            } else {
                                              var8[var12] = var16.a((byte) -14);
                                              var12++;
                                              if (var15 != 0) {
                                                break L20;
                                              } else {
                                                continue L23;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var12 = 0;
                                      L24: while (true) {
                                        L25: {
                                          if (var5 <= var12) {
                                            stackOut_55_0 = var11 & 2;
                                            stackIn_56_0 = stackOut_55_0;
                                            break L25;
                                          } else {
                                            stackOut_47_0 = 0;
                                            stackIn_56_0 = stackOut_47_0;
                                            stackIn_48_0 = stackOut_47_0;
                                            if (var15 != 0) {
                                              break L25;
                                            } else {
                                              var13 = stackIn_48_0;
                                              L26: while (true) {
                                                L27: {
                                                  if (var6 <= var13) {
                                                    var12++;
                                                    break L27;
                                                  } else {
                                                    var8[var12 - -(var13 * var5)] = var16.a((byte) -14);
                                                    var13++;
                                                    if (var15 != 0) {
                                                      break L27;
                                                    } else {
                                                      continue L26;
                                                    }
                                                  }
                                                }
                                                continue L24;
                                              }
                                            }
                                          }
                                        }
                                        if (stackIn_56_0 == 0) {
                                          break L21;
                                        } else {
                                          var12 = 0;
                                          if ((var12 ^ -1) <= (var5 ^ -1)) {
                                            break L21;
                                          } else {
                                            stackOut_58_0 = 0;
                                            stackIn_31_0 = stackOut_58_0;
                                            continue L17;
                                          }
                                        }
                                      }
                                    }
                                    rg.field_e[var4] = var10 != 0;
                                    var4++;
                                    break L20;
                                  }
                                  if (var15 == 0) {
                                    continue L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L0;
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
          L28: {
            var2 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var2);
            stackOut_63_1 = new StringBuilder().append("ua.J(").append(param0).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param1 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L28;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L28;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ol a(boolean param0, byte[] param1) {
        ol var2 = null;
        RuntimeException var2_ref = null;
        ol stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ol stackOut_5_0 = null;
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
            if (param1 != null) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_H = -117;
                  break L1;
                }
              }
              var2 = new ol(param1, ph.field_h, qf.field_d, sa.field_l, uj.field_b, ig.field_H, jc.field_c);
              og.a((byte) -97);
              stackOut_5_0 = (ol) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ua.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        pj stackIn_6_0 = null;
        pj stackIn_6_1 = null;
        pj stackIn_10_0 = null;
        pj stackIn_10_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pj stackOut_5_0 = null;
        pj stackOut_5_1 = null;
        pj stackOut_9_0 = null;
        pj stackOut_9_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param4) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6_int >= this.field_D.length) {
                      break L3;
                    } else {
                      stackOut_5_0 = (pj) (param3);
                      stackOut_5_1 = this.field_J[var6_int];
                      stackIn_10_0 = stackOut_5_0;
                      stackIn_10_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_6_0 != stackIn_6_1) {
                            break L4;
                          } else {
                            this.field_K.a(param4, this.field_D[var6_int]);
                            break L4;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_9_0 = (pj) (param3);
                  stackOut_9_1 = this.field_J[this.field_D.length];
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L2;
                }
                L5: {
                  if (stackIn_10_0 != stackIn_10_1) {
                    break L5;
                  } else {
                    this.field_K.a((byte) 22);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("ua.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static mb h(int param0) {
        if (param0 != 0) {
            field_F = (o[]) null;
        }
        return new mb(sg.b(-1), he.a(71));
    }

    ua(ge param0) {
        super(0, 0, 0, 0, (j) null);
        try {
            this.field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_B.a(true);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != 0) {
                  var3_int = param1.length;
                  this.field_D = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var4_int >= var3_int) {
                        break L3;
                      } else {
                        this.field_D[var4_int] = gh.a(-31433, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      var4 = new ri(field_G, 0, 1);
                      this.field_J = new pj[var3_int + 1];
                      if (param0 == 20870) {
                        break L4;
                      } else {
                        field_L = -28;
                        break L4;
                      }
                    }
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var3_int <= var5) {
                          this.field_J[var3_int] = new pj(wc.field_d, (dg) (this));
                          this.field_J[var3_int].field_w = (j) ((Object) var4);
                          this.field_J[var3_int].b(15, 100, 0, 0, 20 - -((1 + var3_int) * 16));
                          this.a(this.field_J[var3_int], 5411);
                          break L6;
                        } else {
                          this.field_J[var5] = new pj(this.field_D[var5], (dg) (this));
                          this.field_J[var5].field_w = (j) ((Object) var4);
                          this.field_J[var5].field_z = he.field_f;
                          this.field_J[var5].b(15, 80, 0, 0, 20 - -(16 * var5));
                          this.a(this.field_J[var5], 5411);
                          var5++;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            continue L5;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_D = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("ua.H(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_E = "Subscribing members have access to fullscreen mode.<br>TODO Game-specific benefits, screenshots, etc.";
        field_M = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_L = 0;
    }
}
