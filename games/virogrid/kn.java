/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends ec {
    static String field_F;
    static int field_B;
    static int field_I;
    static byte[] field_E;
    static int[] field_K;
    static String field_L;
    static String field_G;
    int field_H;
    static String field_J;

    final static void g(int param0) {
        u discarded$0 = null;
        la.field_g = 0;
        if (param0 != 20128) {
            discarded$0 = kn.f(-95);
        }
    }

    public static void h(int param0) {
        boolean discarded$0 = false;
        field_E = null;
        field_F = null;
        field_J = null;
        if (param0 != 0) {
            discarded$0 = kn.a('ﾬ', (byte) 74);
        }
        field_L = null;
        field_G = null;
        field_K = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (this.field_x == null) {
            return;
        }
        if (-1 == (this.field_H ^ -1)) {
            return;
        }
        if (!(256 != this.field_H)) {
            this.field_x.a((byte) 37, param1 - -this.field_l, this.field_u + param2, param3);
            return;
        }
        mg var5 = new mg(this.field_x.field_g, this.field_x.field_m);
        kb.a(var5, 16865);
        this.field_x.a(param0, 0, 0, param3);
        ai.a(true);
        var5.a(param1 - -this.field_l, this.field_u + param2, this.field_H);
    }

    public kn() {
        super(0, 0, 0, 0, (ol) null, (cd) null);
        this.field_H = 256;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, he param7) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        int var8_int = 0;
        hk[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hk var13_ref_hk = null;
        int var14 = 0;
        int var15 = 0;
        hk[] var16 = null;
        hk[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        hk[][] stackIn_3_0 = null;
        hk[][] stackIn_4_0 = null;
        hk[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hk[][] stackOut_2_0 = null;
        hk[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hk[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param6 >= param3) {
                var8_int = 1;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= nb.field_q.length) {
                    if (var8_int != 0) {
                      ud.field_b = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var19 = nb.field_q[var9];
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      L4: {
                        if (var12 >= var19.length) {
                          L5: {
                            if (var11 != 0) {
                              break L5;
                            } else {
                              if (vb.field_h != param6) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L6: while (true) {
                            if (var19.length <= var12) {
                              break L4;
                            } else {
                              L7: {
                                var13 = var19[var12];
                                if (var13 != -1) {
                                  if (param6 <= var13) {
                                    break L7;
                                  } else {
                                    hk.field_Lb[var13] = true;
                                    break L7;
                                  }
                                } else {
                                  vi.field_l = true;
                                  break L7;
                                }
                              }
                              var12 += 2;
                              continue L6;
                            }
                          }
                        } else {
                          L8: {
                            var13 = var19[var12];
                            var14 = var10[var12 - -1];
                            if ((var13 ^ -1) == 0) {
                              if (var14 == vj.field_b[param2]) {
                                break L8;
                              } else {
                                break L4;
                              }
                            } else {
                              L9: {
                                if (param6 != var13) {
                                  break L9;
                                } else {
                                  if (param1 != var14) {
                                    break L9;
                                  } else {
                                    var11 = 1;
                                    break L8;
                                  }
                                }
                              }
                              if (var13 >= param6) {
                                break L4;
                              } else {
                                if (var14 == (ub.field_D[var13] & 255)) {
                                  break L8;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var12 += 2;
                          continue L3;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                L10: {
                  stackOut_2_0 = oe.field_b;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (0 != (param6 ^ -1)) {
                    stackOut_4_0 = (hk[][]) ((Object) stackIn_4_0);
                    stackOut_4_1 = param6 + 4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L10;
                  } else {
                    stackOut_3_0 = (hk[][]) ((Object) stackIn_3_0);
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L10;
                  }
                }
                L11: {
                  var16 = stackIn_5_0[stackIn_5_1];
                  var17 = var16;
                  var8_array = var17;
                  var9 = 1;
                  if (!param0) {
                    break L11;
                  } else {
                    if (-1 != param6) {
                      var10_int = 0;
                      L12: while (true) {
                        L13: {
                          if (var10_int >= var16.length + -1) {
                            break L13;
                          } else {
                            if ((pm.field_p[(var10_int + param4) / 8] & 1 << (param4 + var10_int & 7)) == 0) {
                              var10_int++;
                              continue L12;
                            } else {
                              var9 = 0;
                              break L13;
                            }
                          }
                        }
                        param4 = param4 + (lk.field_Pb[param6] & 255);
                        break L11;
                      }
                    } else {
                      var10_int = 0;
                      L14: while (true) {
                        if (vj.field_b.length <= var10_int) {
                          break L11;
                        } else {
                          if ((field_E[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                            var10_int++;
                            continue L14;
                          } else {
                            var9 = 0;
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
                var10_int = 0;
                var11 = 0;
                L15: while (true) {
                  L16: {
                    if (-1 != param6) {
                      stackOut_21_0 = var17.length + -1;
                      stackIn_22_0 = stackOut_21_0;
                      break L16;
                    } else {
                      stackOut_20_0 = vj.field_b.length;
                      stackIn_22_0 = stackOut_20_0;
                      break L16;
                    }
                  }
                  if ((stackIn_22_0 ^ -1) >= (var11 ^ -1)) {
                    if (var10_int == 0) {
                      var11 = 0;
                      L17: while (true) {
                        if (-1 + var17.length <= var11) {
                          break L1;
                        } else {
                          L18: {
                            if ((param6 ^ -1) != 0) {
                              ub.field_D[param6] = (byte)var11;
                              break L18;
                            } else {
                              param2 = var11;
                              break L18;
                            }
                          }
                          kn.a(param0, param1, param2, param3, param4, 8, param6 - -1, param7);
                          if (!ud.field_b) {
                            var11++;
                            continue L17;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L19: {
                      if ((param6 ^ -1) != 0) {
                        ub.field_D[param6] = (byte)var11;
                        break L19;
                      } else {
                        param2 = var11;
                        break L19;
                      }
                    }
                    L20: {
                      L21: {
                        if (param6 != -1) {
                          break L21;
                        } else {
                          if (-2 != (vj.field_b.length ^ -1)) {
                            break L21;
                          } else {
                            var12 = 1;
                            break L20;
                          }
                        }
                      }
                      var13_ref_hk = var8_array[var11 + 1];
                      if (!param0) {
                        L22: {
                          if (0 == (param6 ^ -1)) {
                            if (wl.field_d.field_vc != vj.field_b[var11]) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L22;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              break L22;
                            }
                          } else {
                            if ((255 & wl.field_d.field_Pb[param6]) != var11) {
                              stackOut_42_0 = 0;
                              stackIn_46_0 = stackOut_42_0;
                              break L22;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_46_0 = stackOut_41_0;
                              break L22;
                            }
                          }
                        }
                        var12 = stackIn_46_0;
                        break L20;
                      } else {
                        L23: {
                          if (!var13_ref_hk.field_xb) {
                            if (var9 != 0) {
                              if (var13_ref_hk.field_Y) {
                                stackOut_36_0 = 1;
                                stackIn_38_0 = stackOut_36_0;
                                break L23;
                              } else {
                                stackOut_35_0 = 0;
                                stackIn_38_0 = stackOut_35_0;
                                break L23;
                              }
                            } else {
                              stackOut_33_0 = 0;
                              stackIn_38_0 = stackOut_33_0;
                              break L23;
                            }
                          } else {
                            stackOut_31_0 = 1;
                            stackIn_38_0 = stackOut_31_0;
                            break L23;
                          }
                        }
                        var12 = stackIn_38_0;
                        break L20;
                      }
                    }
                    L24: {
                      if (var12 == 0) {
                        break L24;
                      } else {
                        kn.a(param0, param1, param2, param3, param4, param5 + 0, 1 + param6, param7);
                        var10_int = 1;
                        break L24;
                      }
                    }
                    if (ud.field_b) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var11++;
                      continue L15;
                    }
                  }
                }
              }
            }
            L25: {
              if (param5 == 8) {
                break L25;
              } else {
                discarded$1 = kn.a('', (byte) -102);
                break L25;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var8);
            stackOut_95_1 = new StringBuilder().append("kn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param7 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L26;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L26;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ')');
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

    final static String a(String param0, byte param1, String param2, String param3) {
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param1 != -33) {
            return (String) null;
        }
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param3.length());
            var4 = param0.indexOf(param3, param2.length() + var4);
        }
        return param0;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param1 == -69) {
            break L0;
          } else {
            field_I = 27;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 48) {
                break L3;
              } else {
                if (param0 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 65) {
                break L4;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 < 97) {
                break L5;
              } else {
                if (param0 > 122) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final static u f(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        u var2 = null;
        u stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        u stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0 == 256) {
                break L1;
              } else {
                field_L = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              var2 = dm.field_v.a(var1_int, (byte) 35);
              if (var2.field_o) {
                stackOut_4_0 = (u) (var2);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        return stackIn_5_0;
    }

    kn(fi param0) {
        super(param0.field_l, param0.field_u, param0.field_g, param0.field_m, (ol) null, (cd) null);
        try {
            param0.a(this.field_m, true, 0, 0, this.field_g);
            this.field_H = 256;
            this.field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = "Breaking real-world laws";
        field_B = -1;
        field_K = new int[4];
        field_L = "Mouse over an icon for details";
        field_G = "This password is part of your Player Name, and would be easy to guess";
    }
}
