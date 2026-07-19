/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static hm field_e;
    static boolean field_a;
    static long field_g;
    static af field_c;
    static int field_d;
    static String field_f;
    static String field_b;

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_c = null;
        field_f = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        L0: {
          L1: {
            if (param0) {
              break L1;
            } else {
              hk.b();
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          hk.a(0, 0, hk.field_j, hk.field_i, 0, 192);
          break L0;
        }
        if (param2 <= 39) {
          return;
        } else {
          cg.a(param0, 91);
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        if (!param1) {
            field_b = (String) null;
        }
        si.a(kf.field_O, param2, nk.field_b, hn.field_a, param0, (byte) -41, param3);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ve param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        qd[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qd var13_ref_qd = null;
        int var14 = 0;
        int var15 = 0;
        qd[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        qd[][] stackIn_3_0 = null;
        qd[][] stackIn_4_0 = null;
        qd[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qd[][] stackOut_2_0 = null;
        qd[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        qd[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_99_0 = 0;
        boolean stackOut_102_0 = false;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param5 <= param2) {
                    break L3;
                  } else {
                    L4: {
                      stackOut_2_0 = qa.field_v;
                      stackIn_4_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (0 != (param2 ^ -1)) {
                        stackOut_4_0 = (qd[][]) ((Object) stackIn_4_0);
                        stackOut_4_1 = param2 + 4;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        break L4;
                      } else {
                        stackOut_3_0 = (qd[][]) ((Object) stackIn_3_0);
                        stackOut_3_1 = 1;
                        stackIn_5_0 = stackOut_3_0;
                        stackIn_5_1 = stackOut_3_1;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        var16 = stackIn_5_0[stackIn_5_1];
                        var8_array = var16;
                        var9 = 1;
                        if (!param1) {
                          break L6;
                        } else {
                          L7: {
                            if (param2 != -1) {
                              break L7;
                            } else {
                              var10_int = 0;
                              L8: while (true) {
                                L9: {
                                  if (b.field_P.length <= var10_int) {
                                    break L9;
                                  } else {
                                    stackOut_9_0 = kk.field_l[var10_int / 8] & 1 << (7 & var10_int);
                                    stackIn_25_0 = stackOut_9_0;
                                    stackIn_10_0 = stackOut_9_0;
                                    if (var15 != 0) {
                                      break L5;
                                    } else {
                                      L10: {
                                        if (stackIn_10_0 == 0) {
                                          break L10;
                                        } else {
                                          var9 = 0;
                                          if (var15 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var10_int++;
                                      if (var15 == 0) {
                                        continue L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                if (var15 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var10_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (var16.length + -1 <= var10_int) {
                                  break L13;
                                } else {
                                  stackOut_17_0 = 0;
                                  stackOut_17_1 = v.field_a[(param3 + var10_int) / 8] & 1 << (7 & param3 + var10_int);
                                  stackIn_23_0 = stackOut_17_0;
                                  stackIn_23_1 = stackOut_17_1;
                                  stackIn_18_0 = stackOut_17_0;
                                  stackIn_18_1 = stackOut_17_1;
                                  if (var15 != 0) {
                                    break L12;
                                  } else {
                                    L14: {
                                      if (stackIn_18_0 == stackIn_18_1) {
                                        break L14;
                                      } else {
                                        var9 = 0;
                                        if (var15 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var10_int++;
                                    if (var15 == 0) {
                                      continue L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              stackOut_22_0 = param3;
                              stackOut_22_1 = 255 & rb.field_k[param2];
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              break L12;
                            }
                            param3 = stackIn_23_0 + stackIn_23_1;
                            break L6;
                          }
                        }
                      }
                      var10_int = 0;
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L5;
                    }
                    var11 = stackIn_25_0;
                    L15: while (true) {
                      L16: {
                        L17: {
                          stackOut_26_0 = var11;
                          stackIn_29_0 = stackOut_26_0;
                          stackIn_27_0 = stackOut_26_0;
                          if ((param2 ^ -1) != 0) {
                            stackOut_29_0 = stackIn_29_0;
                            stackOut_29_1 = -1;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            break L17;
                          } else {
                            stackOut_27_0 = stackIn_27_0;
                            stackOut_27_1 = b.field_P.length;
                            stackIn_30_0 = stackOut_27_0;
                            stackIn_30_1 = stackOut_27_1;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            if (var15 != 0) {
                              break L17;
                            } else {
                              stackOut_28_0 = stackIn_28_0;
                              stackOut_28_1 = stackIn_28_1;
                              stackIn_31_0 = stackOut_28_0;
                              stackIn_31_1 = stackOut_28_1;
                              break L16;
                            }
                          }
                        }
                        stackOut_30_0 = stackIn_30_0;
                        stackOut_30_1 = stackIn_30_1 + var16.length;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L16;
                      }
                      L18: {
                        if (stackIn_31_0 >= stackIn_31_1) {
                          break L18;
                        } else {
                          L19: {
                            L20: {
                              if (0 != (param2 ^ -1)) {
                                break L20;
                              } else {
                                param0 = var11;
                                if (var15 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            km.field_D[param2] = (byte)var11;
                            break L19;
                          }
                          L21: {
                            L22: {
                              if (0 != (param2 ^ -1)) {
                                break L22;
                              } else {
                                if (b.field_P.length != 1) {
                                  break L22;
                                } else {
                                  var12 = 1;
                                  if (var15 == 0) {
                                    break L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            L23: {
                              var13_ref_qd = var16[1 + var11];
                              if (param1) {
                                break L23;
                              } else {
                                L24: {
                                  if ((param2 ^ -1) != 0) {
                                    if (var11 != (255 & cd.field_m.field_kc[param2])) {
                                      stackOut_45_0 = 0;
                                      stackIn_46_0 = stackOut_45_0;
                                      break L24;
                                    } else {
                                      stackOut_44_0 = 1;
                                      stackIn_46_0 = stackOut_44_0;
                                      break L24;
                                    }
                                  } else {
                                    if (cd.field_m.field_mc != b.field_P[var11]) {
                                      stackOut_42_0 = 0;
                                      stackIn_46_0 = stackOut_42_0;
                                      break L24;
                                    } else {
                                      stackOut_41_0 = 1;
                                      stackIn_46_0 = stackOut_41_0;
                                      break L24;
                                    }
                                  }
                                }
                                var12 = stackIn_46_0;
                                if (var15 == 0) {
                                  break L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L25: {
                              if (!var13_ref_qd.field_ab) {
                                if (var9 != 0) {
                                  if (var13_ref_qd.field_Hb) {
                                    stackOut_53_0 = 1;
                                    stackIn_55_0 = stackOut_53_0;
                                    break L25;
                                  } else {
                                    stackOut_52_0 = 0;
                                    stackIn_55_0 = stackOut_52_0;
                                    break L25;
                                  }
                                } else {
                                  stackOut_50_0 = 0;
                                  stackIn_55_0 = stackOut_50_0;
                                  break L25;
                                }
                              } else {
                                stackOut_48_0 = 1;
                                stackIn_55_0 = stackOut_48_0;
                                break L25;
                              }
                            }
                            var12 = stackIn_55_0;
                            break L21;
                          }
                          L26: {
                            if (var12 != 0) {
                              uc.a(param0, param1, param2 - -1, param3, param4, param5, param6, false);
                              var10_int = 1;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          if (!ve.field_ac) {
                            var11++;
                            if (var15 == 0) {
                              continue L15;
                            } else {
                              break L18;
                            }
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        }
                      }
                      L27: {
                        if (var10_int != 0) {
                          break L27;
                        } else {
                          var11 = 0;
                          L28: while (true) {
                            if (var11 >= -1 + var16.length) {
                              break L27;
                            } else {
                              stackOut_65_0 = -1;
                              stackIn_103_0 = stackOut_65_0;
                              stackIn_66_0 = stackOut_65_0;
                              if (var15 != 0) {
                                break L1;
                              } else {
                                L29: {
                                  L30: {
                                    if (stackIn_66_0 == param2) {
                                      break L30;
                                    } else {
                                      km.field_D[param2] = (byte)var11;
                                      if (var15 == 0) {
                                        break L29;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  param0 = var11;
                                  break L29;
                                }
                                uc.a(param0, param1, 1 + param2, param3, param4, param5, param6, false);
                                if (!ve.field_ac) {
                                  var11++;
                                  continue L28;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var15 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var8_int = 1;
                var9 = 0;
                L31: while (true) {
                  stackOut_75_0 = bc.field_D.length;
                  stackIn_76_0 = stackOut_75_0;
                  L32: while (true) {
                    L33: {
                      L34: {
                        if (stackIn_76_0 <= var9) {
                          break L34;
                        } else {
                          var18 = bc.field_D[var9];
                          var17 = var18;
                          var10 = var17;
                          var11 = 0;
                          stackOut_77_0 = 0;
                          stackIn_100_0 = stackOut_77_0;
                          stackIn_78_0 = stackOut_77_0;
                          if (var15 != 0) {
                            break L33;
                          } else {
                            var12 = stackIn_78_0;
                            L35: while (true) {
                              L36: {
                                L37: {
                                  if (var12 >= var18.length) {
                                    stackOut_91_0 = var11;
                                    stackIn_92_0 = stackOut_91_0;
                                    break L37;
                                  } else {
                                    var13 = var18[var12];
                                    var14 = var10[1 + var12];
                                    stackOut_80_0 = var13 ^ -1;
                                    stackIn_92_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    if (var15 != 0) {
                                      break L37;
                                    } else {
                                      L38: {
                                        if (stackIn_81_0 == 0) {
                                          if (b.field_P[param0] != var14) {
                                            break L36;
                                          } else {
                                            break L38;
                                          }
                                        } else {
                                          L39: {
                                            if (param2 != var13) {
                                              break L39;
                                            } else {
                                              if (param4 != var14) {
                                                break L39;
                                              } else {
                                                var11 = 1;
                                                if (var15 == 0) {
                                                  break L38;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                          }
                                          if (param2 <= var13) {
                                            break L36;
                                          } else {
                                            if ((km.field_D[var13] & 255) != var14) {
                                              break L36;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      var12 += 2;
                                      continue L35;
                                    }
                                  }
                                }
                                L40: {
                                  if (stackIn_92_0 != 0) {
                                    break L40;
                                  } else {
                                    if (param2 != j.field_b) {
                                      break L36;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                                var8_int = 0;
                                var12 = 0;
                                if (var12 >= var18.length) {
                                  break L36;
                                } else {
                                  var13 = var18[var12];
                                  stackOut_96_0 = var13 ^ -1;
                                  stackIn_76_0 = stackOut_96_0;
                                  continue L32;
                                }
                              }
                              var9++;
                              if (var15 == 0) {
                                continue L31;
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                      }
                      stackOut_99_0 = var8_int;
                      stackIn_100_0 = stackOut_99_0;
                      break L33;
                    }
                    if (stackIn_100_0 == 0) {
                      break L2;
                    } else {
                      ve.field_ac = true;
                      break L2;
                    }
                  }
                }
              }
              stackOut_102_0 = param7;
              stackIn_103_0 = stackOut_102_0 ? 1 : 0;
              break L1;
            }
            L41: {
              if (stackIn_103_0 == 0) {
                break L41;
              } else {
                field_b = (String) null;
                break L41;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var8 = decompiledCaughtException;
            stackOut_106_0 = (RuntimeException) (var8);
            stackOut_106_1 = new StringBuilder().append("uc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_108_0 = stackOut_106_0;
            stackIn_108_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param6 == null) {
              stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L42;
            } else {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "{...}";
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              break L42;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_109_0), stackIn_109_2 + ',' + param7 + ')');
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

    static {
        field_a = true;
        field_c = new af();
        field_f = "Accept";
        field_b = "Lobby";
    }
}
