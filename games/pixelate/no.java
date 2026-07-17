/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends kd {
    private int field_f;
    static String field_n;
    static tf[] field_p;
    static String field_g;
    private int field_i;
    static String field_j;
    static int field_h;
    private int field_e;
    private int field_q;
    private int field_k;
    private String field_m;
    private boolean field_o;
    private jl field_l;

    final static void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, eq param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        lo[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        lo var13 = null;
        int var14 = 0;
        int var15 = 0;
        lo[] var16 = null;
        int[] var17 = null;
        lo[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        lo[][] stackIn_31_0 = null;
        lo[][] stackIn_32_0 = null;
        lo[][] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        lo[][] stackOut_30_0 = null;
        lo[][] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        lo[][] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > param7) {
                L2: {
                  stackOut_30_0 = hc.field_L;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (param7 != -1) {
                    stackOut_32_0 = (lo[][]) (Object) stackIn_32_0;
                    stackOut_32_1 = param7 + 4;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L2;
                  } else {
                    stackOut_31_0 = (lo[][]) (Object) stackIn_31_0;
                    stackOut_31_1 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_33_0[stackIn_33_1];
                  var18 = var16;
                  var8_array = var18;
                  var9 = 1;
                  if (!param3) {
                    break L3;
                  } else {
                    if (param7 == -1) {
                      var10 = 0;
                      L4: while (true) {
                        if (var10 >= ia.field_a.length) {
                          break L3;
                        } else {
                          if (0 == (qm.field_J[var10 / 8] & 1 << (7 & var10))) {
                            var10++;
                            continue L4;
                          } else {
                            var9 = 0;
                            break L3;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L5: while (true) {
                        L6: {
                          if (var10 >= var16.length - 1) {
                            break L6;
                          } else {
                            if ((k.field_k[(var10 + param1) / 8] & 1 << (7 & var10 + param1)) == 0) {
                              var10++;
                              continue L5;
                            } else {
                              var9 = 0;
                              break L6;
                            }
                          }
                        }
                        param1 = param1 + (oe.field_Rb[param7] & 255);
                        break L3;
                      }
                    }
                  }
                }
                var10 = 0;
                var11 = 0;
                L7: while (true) {
                  L8: {
                    if (param7 != -1) {
                      stackOut_49_0 = -1 + var18.length;
                      stackIn_50_0 = stackOut_49_0;
                      break L8;
                    } else {
                      stackOut_48_0 = ia.field_a.length;
                      stackIn_50_0 = stackOut_48_0;
                      break L8;
                    }
                  }
                  if (stackIn_50_0 <= var11) {
                    if (var10 == 0) {
                      var11 = 0;
                      L9: while (true) {
                        if (var18.length - 1 <= var11) {
                          break L1;
                        } else {
                          L10: {
                            if (param7 == -1) {
                              param4 = var11;
                              break L10;
                            } else {
                              kf.field_o[param7] = (byte)var11;
                              break L10;
                            }
                          }
                          no.a(param0, param1, (byte) 83, param3, param4, param5, param6, param7 - -1);
                          if (!pb.field_f) {
                            var11++;
                            continue L9;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L11: {
                      if (-1 != param7) {
                        kf.field_o[param7] = (byte)var11;
                        break L11;
                      } else {
                        param4 = var11;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (param7 != 0) {
                          break L13;
                        } else {
                          if (-2 == ia.field_a.length) {
                            var12 = 1;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var13 = var8_array[var11 + 1];
                      if (param3) {
                        L14: {
                          if (!var13.field_U) {
                            if (var9 != 0) {
                              if (var13.field_rb) {
                                stackOut_72_0 = 1;
                                stackIn_74_0 = stackOut_72_0;
                                break L14;
                              } else {
                                stackOut_71_0 = 0;
                                stackIn_74_0 = stackOut_71_0;
                                break L14;
                              }
                            } else {
                              stackOut_69_0 = 0;
                              stackIn_74_0 = stackOut_69_0;
                              break L14;
                            }
                          } else {
                            stackOut_67_0 = 1;
                            stackIn_74_0 = stackOut_67_0;
                            break L14;
                          }
                        }
                        var12 = stackIn_74_0;
                        break L12;
                      } else {
                        L15: {
                          if (-1 == param7) {
                            if (ia.field_a[var11] != io.field_c.field_ec) {
                              stackOut_64_0 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              break L15;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              break L15;
                            }
                          } else {
                            if (var11 != (io.field_c.field_Eb[param7] & 255)) {
                              stackOut_61_0 = 0;
                              stackIn_65_0 = stackOut_61_0;
                              break L15;
                            } else {
                              stackOut_60_0 = 1;
                              stackIn_65_0 = stackOut_60_0;
                              break L15;
                            }
                          }
                        }
                        var12 = stackIn_65_0;
                        break L12;
                      }
                    }
                    L16: {
                      if (var12 == 0) {
                        break L16;
                      } else {
                        var10 = 1;
                        no.a(param0, param1, (byte) 124, param3, param4, param5, param6, 1 + param7);
                        break L16;
                      }
                    }
                    if (pb.field_f) {
                      return;
                    } else {
                      var11++;
                      continue L7;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L17: while (true) {
                  if (var9 >= h.field_Z.length) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      pb.field_f = true;
                      break L1;
                    }
                  } else {
                    var21 = h.field_Z[var9];
                    var20 = var21;
                    var19 = var20;
                    var17 = var19;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    var12 = 0;
                    L18: while (true) {
                      L19: {
                        if (var21.length <= var12) {
                          L20: {
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (fj.field_b == param7) {
                                break L20;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L21: while (true) {
                            if (var21.length <= var12) {
                              break L19;
                            } else {
                              L22: {
                                var13_int = var21[var12];
                                if (-1 != var13_int) {
                                  if (param7 > var13_int) {
                                    lc.field_t[var13_int] = true;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                } else {
                                  ib.field_b = true;
                                  break L22;
                                }
                              }
                              var12 += 2;
                              continue L21;
                            }
                          }
                        } else {
                          L23: {
                            var13_int = var21[var12];
                            var14 = var10_ref_int__[1 + var12];
                            if (var13_int != -1) {
                              L24: {
                                if (param7 != var13_int) {
                                  break L24;
                                } else {
                                  if (var14 != param5) {
                                    break L24;
                                  } else {
                                    var11 = 1;
                                    break L23;
                                  }
                                }
                              }
                              if (var13_int >= param7) {
                                break L19;
                              } else {
                                if ((kf.field_o[var13_int] & 255) != var14) {
                                  break L19;
                                } else {
                                  break L23;
                                }
                              }
                            } else {
                              if (var14 != ia.field_a[param4]) {
                                break L19;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var12 += 2;
                          continue L18;
                        }
                      }
                      var9++;
                      continue L17;
                    }
                  }
                }
              }
            }
            L25: {
              if (param2 > 67) {
                break L25;
              } else {
                field_g = null;
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var8;
            stackOut_95_1 = new StringBuilder().append("no.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param6 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L26;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L26;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 44 + param7 + 41);
        }
    }

    public static void f() {
        field_g = null;
        field_n = null;
        field_j = null;
        field_p = null;
    }

    final static void a(boolean param0) {
        ui.field_i.a(param0, 0);
        oj var2 = td.field_b;
        if (var2 != null) {
            var2.a(ui.field_i.field_gb, ui.field_i.field_tb, 104);
        }
    }

    final void a(int param0, int param1, String param2, jl param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mn var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        mn stackIn_32_0 = null;
        mn stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        mn stackIn_33_0 = null;
        mn stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        mn stackIn_34_0 = null;
        mn stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        jl stackIn_37_0 = null;
        jl stackIn_38_0 = null;
        jl stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        mn stackOut_31_0 = null;
        mn stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        mn stackOut_33_0 = null;
        mn stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        mn stackOut_32_0 = null;
        mn stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        jl stackOut_36_0 = null;
        jl stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        jl stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != ~param7) {
                break L1;
              } else {
                param7 = param3.field_M;
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (param3 != ((no) this).field_l) {
                  break L2;
                } else {
                  if (((no) this).field_o) {
                    break L2;
                  } else {
                    if (param5 != ((no) this).field_i) {
                      break L2;
                    } else {
                      if (~param6 != ~((no) this).field_f) {
                        break L2;
                      } else {
                        if (((no) this).field_e != param7) {
                          break L2;
                        } else {
                          if (((no) this).field_q != param4) {
                            break L2;
                          } else {
                            if (~((no) this).field_k != ~param0) {
                              break L2;
                            } else {
                              if (null == ((no) this).field_m) {
                                break L2;
                              } else {
                                if (((no) this).field_m.equals((Object) (Object) param2)) {
                                  return;
                                } else {
                                  break L2;
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
              L3: {
                ((no) this).field_q = param4;
                ((no) this).field_f = param6;
                ((no) this).field_l = param3;
                ((no) this).field_i = param5;
                ((no) this).field_e = param7;
                ((no) this).field_k = param0;
                ((no) this).field_o = false;
                ((no) this).field_m = param2;
                var16 = new String[1 + param3.b(param2, param0)];
                var17 = var16;
                var10 = Math.max(1, param3.a(param2, new int[1], var17));
                if (((no) this).field_f != 3) {
                  break L3;
                } else {
                  if (var10 != 1) {
                    break L3;
                  } else {
                    ((no) this).field_f = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (((no) this).field_f == 0) {
                  var11 = param3.field_w;
                  break L4;
                } else {
                  if (1 != ((no) this).field_f) {
                    if (((no) this).field_f == 2) {
                      var11 = -(((no) this).field_e * var10) + ((no) this).field_q - param3.field_z;
                      break L4;
                    } else {
                      L5: {
                        var12 = (((no) this).field_q - var10 * ((no) this).field_e) / (1 + var10);
                        if (0 <= var12) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      var11 = param3.field_w + var12;
                      ((no) this).field_e = ((no) this).field_e + var12;
                      break L4;
                    }
                  } else {
                    var11 = (((no) this).field_q + -(var10 * ((no) this).field_e) >> 1) + param3.field_w;
                    break L4;
                  }
                }
              }
              ((no) this).field_b = new mn[var10];
              var12 = 0;
              L6: while (true) {
                if (var10 <= var12) {
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_31_0 = null;
                    stackOut_31_1 = null;
                    stackOut_31_2 = var11 - param3.field_w;
                    stackOut_31_3 = var11 - -param3.field_z;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    stackIn_32_3 = stackOut_31_3;
                    if (var13 != null) {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = var13.length();
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      stackIn_34_3 = stackOut_33_3;
                      stackIn_34_4 = stackOut_33_4;
                      break L7;
                    } else {
                      stackOut_32_0 = null;
                      stackOut_32_1 = null;
                      stackOut_32_2 = stackIn_32_2;
                      stackOut_32_3 = stackIn_32_3;
                      stackOut_32_4 = 0;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      stackIn_34_2 = stackOut_32_2;
                      stackIn_34_3 = stackOut_32_3;
                      stackIn_34_4 = stackOut_32_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new mn(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                    var14.field_g[0] = 0;
                    if (var13 != null) {
                      L9: {
                        var14.field_g[var13.length()] = param3.c(var13);
                        stackOut_36_0 = (jl) param3;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (param5 != 3) {
                          stackOut_38_0 = (jl) (Object) stackIn_38_0;
                          stackOut_38_1 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          break L9;
                        } else {
                          stackOut_37_0 = (jl) (Object) stackIn_37_0;
                          stackOut_37_1 = ((no) this).a(var13, param0, param3.c(var13), 60);
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          break L9;
                        }
                      }
                      an.a(stackIn_39_0, stackIn_39_1, (byte) -92, var14, var13);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var11 = var11 + param7;
                  ((no) this).field_b[var12] = var14;
                  var12++;
                  continue L6;
                }
              }
            } else {
              ((no) this).field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var9;
            stackOut_42_1 = new StringBuilder().append("no.K(").append(param0).append(44).append(param1).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44);
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(String param0, boolean param1, int param2, jl param3, int param4) {
        mn var8 = null;
        int var7 = 0;
        if (!(param0 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (param1) {
            field_g = null;
        }
        if (((no) this).field_l == param3) {
            if (((no) this).field_o) {
                if (1 == ((no) this).field_i) {
                    if (null != ((no) this).field_m) {
                        if (!(!((no) this).field_m.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((no) this).field_i = 1;
            ((no) this).field_o = true;
            ((no) this).field_l = param3;
            var8 = this.a(param0, 0, param3, param2);
            var7 = param3.c(param0);
            var8.field_g[0] = param4 - (var7 >> 1);
            var8.field_g[param0.length()] = param4 + (var7 >> 1);
            an.a(param3, 0, (byte) -92, var8, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "no.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        ak var6 = null;
        ak var7 = null;
        ak var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        bb var17 = null;
        int var17_int = 0;
        Object var18 = null;
        uj var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        ak var22 = null;
        int[] var23 = null;
        String var26 = null;
        int[] var27 = null;
        ak var29 = null;
        int[] var30 = null;
        int[] var34 = null;
        int[] var35 = null;
        ak stackIn_18_0 = null;
        ak stackIn_19_0 = null;
        ak stackIn_20_0 = null;
        ak stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_39_0 = 0;
        ak stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        ak stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        ak stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        ak stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        ak stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        ak stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        ak stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        ak stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        ak stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        ak stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_154_2 = 0;
        ak stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        ak stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        ak stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        ak stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        ak stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        RuntimeException decompiledCaughtException = null;
        ak stackOut_17_0 = null;
        ak stackOut_18_0 = null;
        ak stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ak stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        ak stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        ak stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        ak stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        ak stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        ak stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        ak stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        ak stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        ak stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        ak stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        int stackOut_152_2 = 0;
        ak stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        ak stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        ak stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        ak stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        ak stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        ak stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        var18 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            cm.b(h.field_W, 4740);
            if (param1 == 1) {
              L1: {
                if (io.field_c != null) {
                  L2: {
                    gk.field_kb.field_rb = true;
                    wm.field_d.field_nb = 0;
                    var22 = wm.field_d;
                    var29 = var22;
                    var29.field_K = 0;
                    var6 = ep.field_a;
                    ep.field_a.field_nb = 0;
                    var6.field_K = 0;
                    var7 = nk.field_e;
                    nk.field_e.field_nb = 0;
                    var7.field_K = 0;
                    if (pl.m(param1 + 98)) {
                      L3: {
                        vp.field_Qb.field_cb = hk.field_g.toUpperCase();
                        var9 = (ai.field_A.field_K - -2) / 2;
                        wm.field_d.a(ai.field_A.field_nb - 40, 40, 0, 256, var9 - 2);
                        if (io.field_c.field_ec > io.field_c.field_mc) {
                          wm.field_d.field_cb = ca.field_k.toUpperCase();
                          wm.field_d.field_rb = true;
                          break L3;
                        } else {
                          wm.field_d.field_cb = fo.field_m.toUpperCase();
                          wm.field_d.field_rb = false;
                          break L3;
                        }
                      }
                      L4: {
                        wm.field_d.field_zb = bf.field_k.field_zb;
                        if (ka.field_X <= 0) {
                          break L4;
                        } else {
                          L5: {
                            if (ka.field_X != 1) {
                              var10_ref_String = sd.a(d.field_a, 99, new String[1]);
                              break L5;
                            } else {
                              var10_ref_String = sm.field_k;
                              break L5;
                            }
                          }
                          wm.field_d.field_cb = wm.field_d.field_cb + "<br>" + var10_ref_String;
                          if (0 != (16 & rb.field_o)) {
                            break L4;
                          } else {
                            if (bm.field_o) {
                              break L4;
                            } else {
                              wm.field_d.field_zb = bf.field_k.field_ab;
                              break L4;
                            }
                          }
                        }
                      }
                      L6: {
                        L7: {
                          ep.field_a.a(-40 + ai.field_A.field_nb, 40, var9, 256, -var9 + ai.field_A.field_K);
                          ep.field_a.field_cb = kb.field_J.toUpperCase();
                          var8 = ep.field_a;
                          stackOut_17_0 = ep.field_a;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (!param0) {
                            break L7;
                          } else {
                            stackOut_18_0 = (ak) (Object) stackIn_18_0;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (bo.field_e != 0L) {
                              break L7;
                            } else {
                              stackOut_19_0 = (ak) (Object) stackIn_19_0;
                              stackOut_19_1 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              break L6;
                            }
                          }
                        }
                        stackOut_20_0 = (ak) (Object) stackIn_20_0;
                        stackOut_20_1 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L6;
                      }
                      L8: {
                        stackIn_21_0.field_rb = stackIn_21_1 != 0;
                        var10 = 2;
                        if (h.field_Z == null) {
                          break L8;
                        } else {
                          L9: {
                            if (kf.field_o != null) {
                              break L9;
                            } else {
                              kf.field_o = new byte[fj.field_b];
                              lc.field_t = new boolean[fj.field_b];
                              break L9;
                            }
                          }
                          var11_int = 0;
                          L10: while (true) {
                            if (fj.field_b <= var11_int) {
                              var10 = 0;
                              L11: while (true) {
                                L12: {
                                  if (var10 >= 2) {
                                    break L12;
                                  } else {
                                    var11_int = 0;
                                    var12 = 0;
                                    L13: while (true) {
                                      if (var12 >= h.field_Z.length) {
                                        if (var11_int == 0) {
                                          var10++;
                                          continue L11;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        var34 = h.field_Z[var12];
                                        var30 = var34;
                                        var27 = var30;
                                        var23 = var27;
                                        var20 = var23;
                                        var35 = var20;
                                        var14_int = 0;
                                        if (var14_int >= var34.length) {
                                          var11_int = 1;
                                          var14_int = -1;
                                          var15 = 0;
                                          L14: while (true) {
                                            if (var35.length <= var15) {
                                              lc.field_t[var14_int] = true;
                                              var12++;
                                              continue L13;
                                            } else {
                                              L15: {
                                                var16 = var35[var15];
                                                if (var16 <= var14_int) {
                                                  break L15;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                              var15 += 2;
                                              continue L14;
                                            }
                                          }
                                        } else {
                                          var15 = var34[var14_int];
                                          var16 = var20[var14_int + 1];
                                          if (var15 == -1) {
                                            L16: {
                                              if (var10 == 0) {
                                                stackOut_38_0 = io.field_c.field_ec;
                                                stackIn_39_0 = stackOut_38_0;
                                                break L16;
                                              } else {
                                                stackOut_37_0 = io.field_c.field_mc;
                                                stackIn_39_0 = stackOut_37_0;
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              var17_int = stackIn_39_0;
                                              if (var17_int != var16) {
                                                break L17;
                                              } else {
                                                break L17;
                                              }
                                            }
                                            var12++;
                                            continue L13;
                                          } else {
                                            L18: {
                                              if (var16 != (255 & io.field_c.field_Eb[var15])) {
                                                break L18;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if (wo.field_h < 2) {
                                  break L8;
                                } else {
                                  if (bc.field_m[12]) {
                                    var10 = 2;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            } else {
                              lc.field_t[var11_int] = false;
                              var11_int++;
                              continue L10;
                            }
                          }
                        }
                      }
                      if (2 > var10) {
                        ep.field_a.field_rb = false;
                        if (!ep.field_a.field_R) {
                          break L2;
                        } else {
                          var11 = null;
                          var12 = 0;
                          var13_int = 0;
                          L19: while (true) {
                            if (var13_int >= fj.field_b) {
                              L20: {
                                if (0 == var10) {
                                  var13 = ji.field_a;
                                  if (var12 != 0) {
                                    var14 = cf.field_x + var11;
                                    break L20;
                                  } else {
                                    var14 = sd.a(sm.field_n, 80, new String[1]);
                                    break L20;
                                  }
                                } else {
                                  var13 = aq.field_c;
                                  if (var12 != 0) {
                                    var14 = fg.field_b + var11;
                                    break L20;
                                  } else {
                                    var14 = sd.a(ff.field_b, 31, new String[1]);
                                    break L20;
                                  }
                                }
                              }
                              up.field_o = "<col=A00000>" + var13 + "<br>" + var14;
                              break L2;
                            } else {
                              L21: {
                                if (lc.field_t[var13_int]) {
                                  var26 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                                  if (var11 == null) {
                                    var11 = (Object) (Object) var26;
                                    break L21;
                                  } else {
                                    var11 = (Object) (Object) (var11 + ", " + var26);
                                    var12 = 1;
                                    break L21;
                                  }
                                } else {
                                  break L21;
                                }
                              }
                              var13_int++;
                              continue L19;
                            }
                          }
                        }
                      } else {
                        L22: {
                          if (null != jm.field_r) {
                            break L22;
                          } else {
                            if (w.field_z != null) {
                              break L22;
                            } else {
                              if (null != pa.field_a) {
                                break L22;
                              } else {
                                if (oo.field_e != null) {
                                  break L22;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                        var11_int = 0;
                        var12 = 0;
                        var13_int = 0;
                        var14_int = 0;
                        var15 = 0;
                        var16 = 0;
                        L23: while (true) {
                          if (var16 >= fj.field_b) {
                            var16 = 0;
                            var17 = ae.field_c.field_Fb.field_L;
                            var18_ref = (uj) (Object) var17.c(1504642273);
                            L24: while (true) {
                              L25: {
                                if (var18_ref == null) {
                                  break L25;
                                } else {
                                  if (var18_ref.b((byte) -98)) {
                                    var18_ref = (uj) (Object) var17.f(1504642273);
                                    continue L24;
                                  } else {
                                    L26: {
                                      if (var11_int == 0) {
                                        break L26;
                                      } else {
                                        if (!var18_ref.field_Xb) {
                                          var16 = 1;
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    if (var18_ref.field_Rb < var13_int) {
                                      var16 = 1;
                                      break L25;
                                    } else {
                                      if (var18_ref.field_Yb < var14_int) {
                                        var16 = 1;
                                        break L25;
                                      } else {
                                        if ((~var18_ref.field_Ib & var15) > 0) {
                                          var16 = 1;
                                          break L25;
                                        } else {
                                          if (var12 != 0) {
                                            var16 = 1;
                                            break L25;
                                          } else {
                                            var18_ref = (uj) (Object) var17.f(1504642273);
                                            continue L24;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L27: {
                                if (wo.field_h < 2) {
                                  break L27;
                                } else {
                                  if (bc.field_m[12]) {
                                    var16 = 0;
                                    break L27;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              if (var16 != 0) {
                                ep.field_a.field_rb = false;
                                if (!ep.field_a.field_R) {
                                  break L2;
                                } else {
                                  if (0 != nd.field_b.field_g.field_Jb) {
                                    up.field_o = sd.a(li.field_b, 107, new String[1]);
                                    break L2;
                                  } else {
                                    up.field_o = pc.field_u;
                                    break L2;
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                          } else {
                            L28: {
                              var17_int = io.field_c.field_Eb[var16] & 255;
                              if (jm.field_r == null) {
                                break L28;
                              } else {
                                if (jm.field_r[var16] == null) {
                                  break L28;
                                } else {
                                  if (!jm.field_r[var16][var17_int]) {
                                    break L28;
                                  } else {
                                    var11_int = 1;
                                    break L28;
                                  }
                                }
                              }
                            }
                            L29: {
                              if (w.field_z == null) {
                                break L29;
                              } else {
                                if (null != w.field_z[var16]) {
                                  L30: {
                                    var18_int = w.field_z[var16][var17_int];
                                    if (var18_int > var13_int) {
                                      var13_int = var18_int;
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  if (var18_int == 0) {
                                    break L29;
                                  } else {
                                    if (fe.field_a) {
                                      break L29;
                                    } else {
                                      var11_int = 1;
                                      break L29;
                                    }
                                  }
                                } else {
                                  break L29;
                                }
                              }
                            }
                            L31: {
                              if (null == pa.field_a) {
                                break L31;
                              } else {
                                if (null != pa.field_a[var16]) {
                                  L32: {
                                    var18_int = pa.field_a[var16][var17_int];
                                    if (var14_int >= var18_int) {
                                      break L32;
                                    } else {
                                      var14_int = var18_int;
                                      break L32;
                                    }
                                  }
                                  if (var18_int == 0) {
                                    break L31;
                                  } else {
                                    if (!fe.field_a) {
                                      var11_int = 1;
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L33: {
                              if (oo.field_e == null) {
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            var16++;
                            continue L23;
                          }
                        }
                      }
                    } else {
                      var9_ref_String = io.field_c.field_pc;
                      vp.field_Qb.field_cb = sd.a(fk.field_q, param1 ^ 62, new String[1]).toUpperCase();
                      nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, param1 + 255, ai.field_A.field_K);
                      nk.field_e.field_cb = sd.a(qh.field_a, param1 + 23, new String[1]);
                      var8 = nk.field_e;
                      break L2;
                    }
                  }
                  L34: {
                    if (0L != bo.field_e) {
                      L35: {
                        var9 = (int)(-hm.a(64) + bo.field_e);
                        var9 = (var9 + 999) / 1000;
                        if (var9 < 1) {
                          var9 = 1;
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                      var8.field_cb = sd.a(ao.field_i, 100, new String[1]);
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  qo.field_q.field_cb = sd.a(oe.field_Gb, param1 + 68, new String[2]);
                  break L1;
                } else {
                  break L1;
                }
              }
              L36: {
                L37: {
                  stackOut_144_0 = ff.field_h;
                  stackOut_144_1 = -28476;
                  stackIn_148_0 = stackOut_144_0;
                  stackIn_148_1 = stackOut_144_1;
                  stackIn_145_0 = stackOut_144_0;
                  stackIn_145_1 = stackOut_144_1;
                  if (!param4) {
                    break L37;
                  } else {
                    stackOut_145_0 = (ak) (Object) stackIn_145_0;
                    stackOut_145_1 = stackIn_145_1;
                    stackIn_148_0 = stackOut_145_0;
                    stackIn_148_1 = stackOut_145_1;
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    if (param3) {
                      break L37;
                    } else {
                      stackOut_146_0 = (ak) (Object) stackIn_146_0;
                      stackOut_146_1 = stackIn_146_1;
                      stackIn_148_0 = stackOut_146_0;
                      stackIn_148_1 = stackOut_146_1;
                      stackIn_147_0 = stackOut_146_0;
                      stackIn_147_1 = stackOut_146_1;
                      if (bm.field_o) {
                        break L37;
                      } else {
                        stackOut_147_0 = (ak) (Object) stackIn_147_0;
                        stackOut_147_1 = stackIn_147_1;
                        stackOut_147_2 = 1;
                        stackIn_149_0 = stackOut_147_0;
                        stackIn_149_1 = stackOut_147_1;
                        stackIn_149_2 = stackOut_147_2;
                        break L36;
                      }
                    }
                  }
                }
                stackOut_148_0 = (ak) (Object) stackIn_148_0;
                stackOut_148_1 = stackIn_148_1;
                stackOut_148_2 = 0;
                stackIn_149_0 = stackOut_148_0;
                stackIn_149_1 = stackOut_148_1;
                stackIn_149_2 = stackOut_148_2;
                break L36;
              }
              L38: {
                L39: {
                  ((ak) (Object) stackIn_149_0).a(stackIn_149_1, stackIn_149_2 != 0);
                  stackOut_149_0 = ai.field_A;
                  stackOut_149_1 = -28476;
                  stackIn_153_0 = stackOut_149_0;
                  stackIn_153_1 = stackOut_149_1;
                  stackIn_150_0 = stackOut_149_0;
                  stackIn_150_1 = stackOut_149_1;
                  if (!param4) {
                    break L39;
                  } else {
                    stackOut_150_0 = (ak) (Object) stackIn_150_0;
                    stackOut_150_1 = stackIn_150_1;
                    stackIn_153_0 = stackOut_150_0;
                    stackIn_153_1 = stackOut_150_1;
                    stackIn_151_0 = stackOut_150_0;
                    stackIn_151_1 = stackOut_150_1;
                    if (param3) {
                      break L39;
                    } else {
                      stackOut_151_0 = (ak) (Object) stackIn_151_0;
                      stackOut_151_1 = stackIn_151_1;
                      stackIn_153_0 = stackOut_151_0;
                      stackIn_153_1 = stackOut_151_1;
                      stackIn_152_0 = stackOut_151_0;
                      stackIn_152_1 = stackOut_151_1;
                      if (bm.field_o) {
                        break L39;
                      } else {
                        stackOut_152_0 = (ak) (Object) stackIn_152_0;
                        stackOut_152_1 = stackIn_152_1;
                        stackOut_152_2 = 1;
                        stackIn_154_0 = stackOut_152_0;
                        stackIn_154_1 = stackOut_152_1;
                        stackIn_154_2 = stackOut_152_2;
                        break L38;
                      }
                    }
                  }
                }
                stackOut_153_0 = (ak) (Object) stackIn_153_0;
                stackOut_153_1 = stackIn_153_1;
                stackOut_153_2 = 0;
                stackIn_154_0 = stackOut_153_0;
                stackIn_154_1 = stackOut_153_1;
                stackIn_154_2 = stackOut_153_2;
                break L38;
              }
              L40: {
                L41: {
                  ((ak) (Object) stackIn_154_0).a(stackIn_154_1, stackIn_154_2 != 0);
                  stackOut_154_0 = ra.field_e;
                  stackOut_154_1 = -28476;
                  stackIn_158_0 = stackOut_154_0;
                  stackIn_158_1 = stackOut_154_1;
                  stackIn_155_0 = stackOut_154_0;
                  stackIn_155_1 = stackOut_154_1;
                  if (!param4) {
                    break L41;
                  } else {
                    stackOut_155_0 = (ak) (Object) stackIn_155_0;
                    stackOut_155_1 = stackIn_155_1;
                    stackIn_158_0 = stackOut_155_0;
                    stackIn_158_1 = stackOut_155_1;
                    stackIn_156_0 = stackOut_155_0;
                    stackIn_156_1 = stackOut_155_1;
                    if (param3) {
                      break L41;
                    } else {
                      stackOut_156_0 = (ak) (Object) stackIn_156_0;
                      stackOut_156_1 = stackIn_156_1;
                      stackIn_158_0 = stackOut_156_0;
                      stackIn_158_1 = stackOut_156_1;
                      stackIn_157_0 = stackOut_156_0;
                      stackIn_157_1 = stackOut_156_1;
                      if (!bm.field_o) {
                        break L41;
                      } else {
                        stackOut_157_0 = (ak) (Object) stackIn_157_0;
                        stackOut_157_1 = stackIn_157_1;
                        stackOut_157_2 = 1;
                        stackIn_159_0 = stackOut_157_0;
                        stackIn_159_1 = stackOut_157_1;
                        stackIn_159_2 = stackOut_157_2;
                        break L40;
                      }
                    }
                  }
                }
                stackOut_158_0 = (ak) (Object) stackIn_158_0;
                stackOut_158_1 = stackIn_158_1;
                stackOut_158_2 = 0;
                stackIn_159_0 = stackOut_158_0;
                stackIn_159_1 = stackOut_158_1;
                stackIn_159_2 = stackOut_158_2;
                break L40;
              }
              L42: {
                ((ak) (Object) stackIn_159_0).a(stackIn_159_1, stackIn_159_2 != 0);
                nd.field_b.field_g.b((byte) -122);
                if (null != io.field_c) {
                  L43: {
                    if (0 == gk.field_kb.field_P) {
                      break L43;
                    } else {
                      int discarded$1 = 0;
                      qg.a(io.field_c.c((byte) 8), param2);
                      break L43;
                    }
                  }
                  L44: {
                    if (0 == wm.field_d.field_P) {
                      break L44;
                    } else {
                      bm.field_o = true;
                      break L44;
                    }
                  }
                  L45: {
                    if (ep.field_a.field_P != 0) {
                      of.field_c = true;
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                  L46: {
                    if (0 != hb.field_eb.field_P) {
                      bm.field_o = false;
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  be.a(false, io.field_c, param2, -1);
                  break L42;
                } else {
                  break L42;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "no.N(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void e() {
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tf var6 = null;
        tf var7 = null;
        tf var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            t.a(243, 197, 369, 143, 16777215);
            t.d(244, 198, 367, 141, 0);
            if (wg.field_g != null) {
              L1: {
                var6 = wg.field_g[ae.field_b];
                if (var6 == null) {
                  if (qe.field_A == null) {
                    break L1;
                  } else {
                    int discarded$3 = qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  }
                } else {
                  var6.b(245, 199);
                  break L1;
                }
              }
              L2: {
                if (ui.field_k <= jn.field_q) {
                  break L2;
                } else {
                  var7 = wg.field_g[jc.field_b];
                  if (var7 != null) {
                    var2_int = jn.field_q * (var7.field_A - -60) / ui.field_k;
                    var3 = var2_int + -30;
                    if (!pm.field_e) {
                      kj.a(256 * (-var3 + var7.field_A) / 30, var7, 245, 89, 199, -256 * var3 / 30);
                      break L2;
                    } else {
                      kj.a(var3 * -256 / 30, var7, 245, -123, 199, (var7.field_A - var3) * 256 / 30);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null == qe.field_A) {
                  break L3;
                } else {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L4: while (true) {
                    if (var5 >= wg.field_g.length) {
                      if (var2 != null) {
                        int discarded$4 = qe.field_A.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      L5: {
                        var8 = wg.field_g[var5];
                        if (var8 != null) {
                          L6: {
                            if (var8.field_A != 365) {
                              break L6;
                            } else {
                              if (var8.field_B != 139) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (var2 == null) {
                            var2 = (Object) (Object) Integer.toString(var5);
                            break L5;
                          } else {
                            var2 = (Object) (Object) (var2 + ", " + var5);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              L7: {
                if (null == qe.field_A) {
                  break L7;
                } else {
                  int discarded$5 = qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "no.P(" + -19308 + 41);
        }
    }

    final static long d() {
        return -jc.field_c + hm.a(64);
    }

    final void a(jl param0, int param1, int param2, boolean param3, String param4) {
        mn var8 = null;
        mn var9 = null;
        if (!(param4 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (((no) this).field_l == param0) {
            if (((no) this).field_o) {
                if (((no) this).field_i == 2) {
                    if (((no) this).field_m != null) {
                        if (((no) this).field_m.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((no) this).field_m = param4;
        ((no) this).field_i = 2;
        ((no) this).field_o = true;
        ((no) this).field_l = param0;
        if (param3) {
            return;
        }
        try {
            var8 = this.a(param4, 0, param0, param1);
            var9 = var8;
            var9.field_g[0] = -param0.c(param4) + param2;
            var9.field_g[param4.length()] = param2;
            an.a(param0, 0, (byte) -92, var9, param4);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "no.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final mn a(String param0, int param1, jl param2, int param3) {
        mn var5 = null;
        RuntimeException var5_ref = null;
        mn var6 = null;
        mn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        mn stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            var6 = new mn(-param2.field_w + param3, param3 - -param2.field_z, param0.length());
            var5 = var6;
            ((no) this).field_b = new mn[]{var6};
            stackOut_2_0 = (mn) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("no.T(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(0).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final void a(String param0, int param1, jl param2, int param3, int param4) {
        mn var7 = null;
        int var6_int = -72 % ((param4 - -70) / 49);
        if (!(param0 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (((no) this).field_l == param2) {
            if (((no) this).field_o) {
                if (0 == ((no) this).field_i) {
                    if (((no) this).field_m != null) {
                        if (((no) this).field_m.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((no) this).field_o = true;
            ((no) this).field_l = param2;
            ((no) this).field_i = 0;
            ((no) this).field_m = param0;
            var7 = this.a(param0, 0, param2, param1);
            var7.field_g[0] = param3;
            var7.field_g[param0.length()] = param2.c(param0) + param3;
            an.a(param2, 0, (byte) -92, var7, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "no.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public no() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Asking for or providing contact information";
        field_g = "Unpacking graphics";
        field_h = 0;
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
