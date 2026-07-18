/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class jm implements pf, ac {
    static volatile boolean field_j;
    private int field_c;
    int field_l;
    static String field_b;
    int field_i;
    private boolean field_n;
    int field_m;
    int field_k;
    int field_f;
    int field_h;
    int field_a;
    dj field_g;
    int field_e;
    int field_d;
    int field_o;

    public final int a(int param0, int param1, qm param2) {
        RuntimeException var4 = null;
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
              if (param1 == -13372) {
                break L1;
              } else {
                ((jm) this).field_o = 75;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0, 0, (byte) 120, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("jm.T(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, byte param1, boolean param2, na param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        nl[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nl var13_ref_nl = null;
        int var14 = 0;
        int var15 = 0;
        nl[] var16 = null;
        nl[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        nl[][] stackIn_5_0 = null;
        nl[][] stackIn_6_0 = null;
        nl[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        nl[][] stackOut_4_0 = null;
        nl[][] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        nl[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param6 >= param5) {
                var8_int = 1;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= um.field_a.length) {
                    if (var8_int != 0) {
                      bg.field_a = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var21 = um.field_a[var9];
                    var20 = var21;
                    var19 = var20;
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      L4: {
                        if (var12 >= var21.length) {
                          if (var11 != 0) {
                            var12 = 0;
                            L5: while (true) {
                              if (var21.length <= var12) {
                                var8_int = 0;
                                break L4;
                              } else {
                                L6: {
                                  var13 = var21[var12];
                                  if (var13 == -1) {
                                    nb.field_d = true;
                                    break L6;
                                  } else {
                                    if (param6 <= var13) {
                                      break L6;
                                    } else {
                                      tk.field_q[var13] = true;
                                      break L6;
                                    }
                                  }
                                }
                                var12 += 2;
                                continue L5;
                              }
                            }
                          } else {
                            L7: {
                              if (param6 != vf.field_l) {
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var9++;
                            continue L2;
                          }
                        } else {
                          L8: {
                            var13 = var21[var12];
                            var14 = var10[var12 - -1];
                            if (var13 == -1) {
                              if (var14 == ao.field_h[param0]) {
                                break L8;
                              } else {
                                break L4;
                              }
                            } else {
                              L9: {
                                if (var13 != param6) {
                                  break L9;
                                } else {
                                  if (param4 == var14) {
                                    var11 = 1;
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (param6 <= var13) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var9++;
                              continue L2;
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
                L11: {
                  stackOut_4_0 = s.field_e;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (-1 == param6) {
                    stackOut_6_0 = (nl[][]) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L11;
                  } else {
                    stackOut_5_0 = (nl[][]) (Object) stackIn_5_0;
                    stackOut_5_1 = 4 - -param6;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L11;
                  }
                }
                L12: {
                  var16 = stackIn_7_0[stackIn_7_1];
                  var17 = var16;
                  var8_array = var17;
                  var9 = 1;
                  if (param2) {
                    if (param6 == -1) {
                      var10_int = 0;
                      L13: while (true) {
                        if (ao.field_h.length <= var10_int) {
                          break L12;
                        } else {
                          if ((gh.field_E[var10_int / 8] & 1 << (7 & var10_int)) != 0) {
                            var9 = 0;
                            break L12;
                          } else {
                            var10_int++;
                            continue L13;
                          }
                        }
                      }
                    } else {
                      var10_int = 0;
                      L14: while (true) {
                        L15: {
                          if (var10_int >= var16.length + -1) {
                            break L15;
                          } else {
                            if (0 != (ng.field_D[(param7 - -var10_int) / 8] & 1 << (var10_int + param7 & 7))) {
                              var9 = 0;
                              break L15;
                            } else {
                              var10_int++;
                              continue L14;
                            }
                          }
                        }
                        param7 = param7 + (in.field_Nb[param6] & 255);
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                var10_int = 0;
                var11 = 0;
                L16: while (true) {
                  L17: {
                    stackOut_24_0 = ~var11;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_25_0 = stackOut_24_0;
                    if (-1 == param6) {
                      stackOut_26_0 = stackIn_26_0;
                      stackOut_26_1 = ao.field_h.length;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      break L17;
                    } else {
                      stackOut_25_0 = stackIn_25_0;
                      stackOut_25_1 = var17.length + -1;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      break L17;
                    }
                  }
                  if (stackIn_27_0 <= ~stackIn_27_1) {
                    if (var10_int == 0) {
                      var11 = 0;
                      L18: while (true) {
                        if (var11 >= var17.length - 1) {
                          break L1;
                        } else {
                          L19: {
                            if (param6 != -1) {
                              qa.field_l[param6] = (byte)var11;
                              break L19;
                            } else {
                              param0 = var11;
                              break L19;
                            }
                          }
                          jm.a(param0, (byte) -25, param2, param3, param4, param5, 1 + param6, param7);
                          if (!bg.field_a) {
                            var11++;
                            continue L18;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L20: {
                      if (param6 == -1) {
                        param0 = var11;
                        break L20;
                      } else {
                        qa.field_l[param6] = (byte)var11;
                        break L20;
                      }
                    }
                    L21: {
                      L22: {
                        if (param6 != -1) {
                          break L22;
                        } else {
                          if (ao.field_h.length != 1) {
                            break L22;
                          } else {
                            var12 = 1;
                            break L21;
                          }
                        }
                      }
                      var13_ref_nl = var8_array[var11 + 1];
                      if (param2) {
                        L23: {
                          if (!var13_ref_nl.field_ab) {
                            if (var9 != 0) {
                              if (var13_ref_nl.field_ub) {
                                stackOut_49_0 = 1;
                                stackIn_51_0 = stackOut_49_0;
                                break L23;
                              } else {
                                stackOut_48_0 = 0;
                                stackIn_51_0 = stackOut_48_0;
                                break L23;
                              }
                            } else {
                              stackOut_46_0 = 0;
                              stackIn_51_0 = stackOut_46_0;
                              break L23;
                            }
                          } else {
                            stackOut_44_0 = 1;
                            stackIn_51_0 = stackOut_44_0;
                            break L23;
                          }
                        }
                        var12 = stackIn_51_0;
                        break L21;
                      } else {
                        L24: {
                          if (-1 == param6) {
                            if (ao.field_h[var11] != wi.field_f.field_dc) {
                              stackOut_41_0 = 0;
                              stackIn_42_0 = stackOut_41_0;
                              break L24;
                            } else {
                              stackOut_40_0 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              break L24;
                            }
                          } else {
                            if ((wi.field_f.field_Wb[param6] & 255) != var11) {
                              stackOut_38_0 = 0;
                              stackIn_42_0 = stackOut_38_0;
                              break L24;
                            } else {
                              stackOut_37_0 = 1;
                              stackIn_42_0 = stackOut_37_0;
                              break L24;
                            }
                          }
                        }
                        var12 = stackIn_42_0;
                        break L21;
                      }
                    }
                    L25: {
                      if (var12 != 0) {
                        jm.a(param0, (byte) -25, param2, param3, param4, param5, 1 + param6, param7);
                        var10_int = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    if (bg.field_a) {
                      return;
                    } else {
                      var11++;
                      continue L16;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var8;
            stackOut_102_1 = new StringBuilder().append("jm.G(").append(param0).append(',').append(-25).append(',').append(param2).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param3 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L26;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L26;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(jm param0, int param1) {
        param0.field_g = ((jm) this).field_g;
        param0.field_o = ((jm) this).field_o;
        param0.field_a = ((jm) this).field_a;
        param0.field_d = ((jm) this).field_d;
        param0.field_c = ((jm) this).field_c;
        param0.field_i = ((jm) this).field_i;
        param0.field_l = ((jm) this).field_l;
        param0.field_f = ((jm) this).field_f;
        if (param1 != 1881) {
            return;
        }
        try {
            param0.field_k = ((jm) this).field_k;
            param0.field_e = ((jm) this).field_e;
            param0.field_n = ((jm) this).field_n;
            param0.field_m = ((jm) this).field_m;
            param0.field_h = ((jm) this).field_h;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, qm param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        kh var17 = null;
        kh var18 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 != param5) {
              L1: {
                if (param3 == 6600) {
                  break L1;
                } else {
                  ((jm) this).field_g = null;
                  break L1;
                }
              }
              L2: {
                if (!param1.d(-2116)) {
                  break L2;
                } else {
                  L3: {
                    var17 = ((jm) this).a(param1, -118);
                    var18 = var17;
                    if (param4 > param5) {
                      var8 = param5;
                      var9 = param4;
                      break L3;
                    } else {
                      var8 = param4;
                      var9 = param5;
                      break L3;
                    }
                  }
                  var10 = var18.a((byte) -67, var8);
                  var11 = var18.a((byte) 77, var9);
                  da.a(param2 + param1.field_n - -param1.field_v, param1.field_j + param0 - -param1.field_k, 123, param2 - -param1.field_n, param1.field_j + param0);
                  var12 = var10;
                  L4: while (true) {
                    if (var12 > var11) {
                      oo.c(param3 + -22005);
                      break L2;
                    } else {
                      L5: {
                        var13 = var17.field_f[var12];
                        if (var12 == var10) {
                          stackOut_13_0 = var18.a(var8, 0);
                          stackIn_14_0 = stackOut_13_0;
                          break L5;
                        } else {
                          stackOut_12_0 = var13.field_f[0];
                          stackIn_14_0 = stackOut_12_0;
                          break L5;
                        }
                      }
                      L6: {
                        var14 = stackIn_14_0;
                        if (var12 != var11) {
                          if (var13 == null) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L6;
                          } else {
                            stackOut_17_0 = var13.field_f[var13.field_f.length + -1];
                            stackIn_19_0 = stackOut_17_0;
                            break L6;
                          }
                        } else {
                          stackOut_15_0 = var18.a(var9, param3 ^ 6600);
                          stackIn_19_0 = stackOut_15_0;
                          break L6;
                        }
                      }
                      var15 = stackIn_19_0;
                      io.field_n.a(var13.field_e, var13.field_g + param1.field_i + ((jm) this).field_f + (param0 + param1.field_j), ((jm) this).field_e, -var14 + var15, ((jm) this).field_e >>> 24, param3 + -6599, this.a(param2, param3 + 2693, var14, param1));
                      var12++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("jm.Q(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, qm param3) {
        RuntimeException var5 = null;
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
              if (param1 == 9293) {
                break L1;
              } else {
                ((jm) this).field_m = -128;
                break L1;
              }
            }
            stackOut_2_0 = param2 + param0 + (param3.field_n + ((jm) this).field_m - -param3.field_h);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("jm.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, int param3, qm param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        vd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kh var13 = null;
        kh var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 > 6) {
              L1: {
                if (!param4.d(-2116)) {
                  break L1;
                } else {
                  L2: {
                    var13 = ((jm) this).a(param4, -128);
                    var14 = var13;
                    var7 = var14.a((byte) -109, param3);
                    var8 = var13.field_f[var7];
                    var9 = var14.a(param3, 0);
                    var10 = this.a(param2, 9293, var9, param4);
                    var11 = ((jm) this).a(param1, -13372, param4) + Math.max(0, var8.field_g);
                    int discarded$1 = 0;
                    stackOut_3_0 = ((jm) this).a(param1, -13372, param4);
                    stackOut_3_1 = this.a(param4);
                    stackOut_3_2 = var8.field_e;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    if (var14.field_f.length <= 1 + var7) {
                      stackOut_5_0 = stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = stackIn_5_2;
                      stackOut_5_3 = var8.field_e;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      stackIn_6_3 = stackOut_5_3;
                      break L2;
                    } else {
                      stackOut_4_0 = stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = stackIn_4_2;
                      stackOut_4_3 = var13.field_f[1 + var7].field_g;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_6_3 = stackOut_4_3;
                      break L2;
                    }
                  }
                  var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
                  da.a(param4.field_n + param2 - -param4.field_v, param4.field_k + param4.field_j + param1, 116, param2 + param4.field_n, param1 + param4.field_j);
                  io.field_n.a(var10, var10, var12, ((jm) this).field_o, var11, (byte) 102);
                  oo.c(-15405);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("jm.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    public final int a(int param0) {
        if (param0 != 27184) {
            Object var3 = null;
            int discarded$0 = ((jm) this).a((qm) null, (byte) -41, 24);
        }
        return ((jm) this).field_g.field_m + ((jm) this).field_g.field_C;
    }

    public void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((jm) this).field_g != null) {
              L1: {
                this.a(param3, param2, param0, (byte) -89);
                if (param1 == 5592405) {
                  break L1;
                } else {
                  ((jm) this).field_c = 110;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("jm.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(int param0, qm param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            kh discarded$8 = ((jm) this).a(param1, -35);
            if (param5 == 2454) {
              stackOut_3_0 = param1.field_s.a(-((jm) this).a(param4, -13372, param1) + param2, -((jm) this).a(param1, (byte) -105, param0) + param3, true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -110;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("jm.V(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, int param1, qm param2, byte param3) {
        try {
            this.a(0, 23034, ((jm) this).field_k, 0, param2, param0, param1, ((jm) this).field_c);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + -89 + ')');
        }
    }

    public final int a(qm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 17 % ((-9 - param1) / 44);
            stackOut_0_0 = -((jm) this).field_m + (param0.field_v + -((jm) this).field_l);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("jm.N(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    String a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = param1.field_g;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jm.K(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public final int a(byte param0, qm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            kh discarded$2 = ((jm) this).a(param1, -123);
            var3_int = -79 / ((76 - param0) / 39);
            stackOut_0_0 = param1.field_s.b((byte) 71) + ((jm) this).field_m + ((jm) this).field_l;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("jm.B(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    jm(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void b(byte param0, qm param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param1.field_s) {
                break L1;
              } else {
                param1.field_s = (kh) (Object) new re();
                break L1;
              }
            }
            var3_int = ((jm) this).a(param1, (byte) 71);
            int discarded$1 = 0;
            var4 = this.a(param1);
            L2: {
              var6 = ((jm) this).field_a;
              if (var6 != 0) {
                if (var6 != 2) {
                  L3: {
                    if (var6 != 3) {
                      if (var6 != 1) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = (-((jm) this).field_g.field_C + (var4 + -((jm) this).field_g.field_m) >> 1) + ((jm) this).field_g.field_C;
                  break L2;
                } else {
                  var5 = -((jm) this).field_g.field_m + var4;
                  break L2;
                }
              } else {
                var5 = ((jm) this).field_g.field_C;
                break L2;
              }
            }
            L4: {
              L5: {
                L6: {
                  var6 = ((jm) this).field_i;
                  if (0 != var6) {
                    if (3 == var6) {
                      break L6;
                    } else {
                      if (1 == var6) {
                        if (param1.field_s instanceof re) {
                          ((re) (Object) param1.field_s).a(((jm) this).a(false, param1), var3_int >> 1, var5, (byte) -18, ((jm) this).field_g);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        if (var6 == 2) {
                          if (param1.field_s instanceof re) {
                            ((re) (Object) param1.field_s).a(var3_int, (byte) -105, ((jm) this).field_g, var5, ((jm) this).a(false, param1));
                            break L5;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                if (!(param1.field_s instanceof re)) {
                  break L5;
                } else {
                  ((re) (Object) param1.field_s).a(((jm) this).a(false, param1), (byte) -123, ((jm) this).field_g, var5, 0);
                  break L4;
                }
              }
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("jm.H(").append(-33).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, qm param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              da.a(param4.field_v + (param4.field_n + param6), param5 - (-param4.field_j + -param4.field_k), 121, param6 - -param4.field_n, param4.field_j + param5);
              var9_int = ((jm) this).a(param4, (byte) 56);
              int discarded$2 = 0;
              var10 = this.a(param4);
              if (((jm) this).field_n) {
                int discarded$3 = ((jm) this).field_g.a(((jm) this).a(false, param4), this.a(param6, 9293, 0, param4), this.a(param5, 0, (byte) 120, param4), var9_int, var10, param2, param7, ((jm) this).field_i, ((jm) this).field_a, ((jm) this).field_h);
                break L1;
              } else {
                L2: {
                  var12 = ((jm) this).field_a;
                  if (0 == var12) {
                    var11 = ((jm) this).field_g.field_C;
                    break L2;
                  } else {
                    if (var12 == 2) {
                      var11 = -((jm) this).field_g.field_m + var10;
                      break L2;
                    } else {
                      L3: {
                        if (var12 != 3) {
                          if (var12 != 1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var11 = (-((jm) this).field_g.field_C + var10 + -((jm) this).field_g.field_m >> 1) + ((jm) this).field_g.field_C;
                      break L2;
                    }
                  }
                }
                L4: {
                  var12 = ((jm) this).field_i;
                  if (var12 != 0) {
                    if (var12 == 3) {
                      break L4;
                    } else {
                      if (var12 == 1) {
                        ((jm) this).field_g.b(((jm) this).a(false, param4), (var9_int >> 1) + this.a(param6, 9293, 0, param4), this.a(param5, 0, (byte) 120, param4) + var11, param2, param7);
                        break L1;
                      } else {
                        if (var12 != 2) {
                          break L1;
                        } else {
                          ((jm) this).field_g.c(((jm) this).a(false, param4), this.a(param6, 9293, 0, param4) + var9_int, var11 + this.a(param5, 0, (byte) 120, param4), param2, param7);
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                ((jm) this).field_g.a(((jm) this).a(false, param4), this.a(param6, 9293, 0, param4), var11 + this.a(param5, 0, (byte) 120, param4), param2, param7);
                break L1;
              }
            }
            oo.c(-15405);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var9;
            stackOut_23_1 = new StringBuilder().append("jm.M(").append(0).append(',').append(23034).append(',').append(param2).append(',').append(0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final kh a(qm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 58 % ((-83 - param1) / 35);
              if (param0.field_s == null) {
                param0.field_s = (kh) (Object) new re();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((jm) this).field_n) {
                int discarded$2 = 0;
                ((re) (Object) param0.field_s).a((byte) 119, ((jm) this).field_g, this.a(param0), ((jm) this).field_h, ((jm) this).field_i, ((jm) this).field_a, ((jm) this).a(false, param0), ((jm) this).a(param0, (byte) -62));
                break L2;
              } else {
                this.b((byte) -33, param0);
                break L2;
              }
            }
            stackOut_6_0 = param0.field_s;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("jm.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public final int b(qm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            kh discarded$8 = ((jm) this).a(param0, 6);
            if (param1 == 1) {
              stackOut_3_0 = param0.field_s.a((byte) -54) + (((jm) this).field_f + ((jm) this).field_d);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -42;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jm.P(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (ul.field_A <= 32) {
            int discarded$1 = 0;
            eb.a(0);
        } else {
            var1 = ul.field_A % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            int discarded$2 = 0;
            eb.a(ul.field_A + -var1);
        }
        if (param0 < 29) {
            jm.b(-66);
        }
    }

    private final int a(qm param0) {
        RuntimeException var3 = null;
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
            stackOut_2_0 = -((jm) this).field_d + (-((jm) this).field_f + param0.field_k);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jm.R(");
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + false + ')');
        }
        return stackIn_3_0;
    }

    protected jm() {
    }

    private final int a(int param0, int param1, byte param2, qm param3) {
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = ((jm) this).field_f + param0 + param3.field_j + param3.field_i;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("jm.I(").append(param0).append(',').append(0).append(',').append(120).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(qm param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -88) {
              stackOut_3_0 = this.a(param2, 9293, 0, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 53;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("jm.S(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    jm(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            ((jm) this).field_g = param0;
            ((jm) this).field_f = param3;
            ((jm) this).field_o = param10;
            ((jm) this).field_e = param11;
            ((jm) this).field_l = param2;
            ((jm) this).field_n = param12 ? true : false;
            ((jm) this).field_a = param8;
            ((jm) this).field_d = param4;
            ((jm) this).field_i = param7;
            ((jm) this).field_h = param9;
            ((jm) this).field_c = param6;
            ((jm) this).field_m = param1;
            ((jm) this).field_k = param5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public static void c() {
        field_b = null;
        int var1 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
    }
}
