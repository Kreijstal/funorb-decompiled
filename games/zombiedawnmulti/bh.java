/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static vp field_a;
    static sc field_f;
    static th field_d;
    static String[] field_b;
    static int[] field_c;
    static String field_e;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 >= -2) {
            bh.a((byte) 84);
        }
        field_d = null;
        field_f = null;
    }

    final static String a(int param0, ka param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        jh var5 = null;
        String var6 = null;
        String stackIn_32_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param1.field_n == null) {
                break L1;
              } else {
                L2: {
                  var6 = param1.field_n;
                  var2 = var6;
                  var2 = var6;
                  var2 = var6;
                  if (1 == param1.field_h) {
                    var2 = "<img=0>" + var6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (-3 != (param1.field_h ^ -1)) {
                  break L1;
                } else {
                  var2 = "<img=1>" + (String) (var2);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 < -125) {
                break L3;
              } else {
                var5 = (jh) null;
                bh.a(-58, -66, -108, (jh) null, true, 107, -83, 97);
                break L3;
              }
            }
            L4: {
              L5: {
                var3 = "";
                if (2 != param1.field_l) {
                  break L5;
                } else {
                  if (!param1.field_k) {
                    L6: {
                      if (param1.field_i != 0) {
                        break L6;
                      } else {
                        if ((param1.field_o ^ -1) != -1) {
                          break L6;
                        } else {
                          var3 = vl.a(v.field_c, new String[]{(String) (var2)}, 2);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var3 = vl.a(lc.field_n, new String[]{(String) (var2)}, 2);
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
              L7: {
                if (-1 != (param1.field_l ^ -1)) {
                  break L7;
                } else {
                  if (sn.field_Hb) {
                    var3 = "[" + ne.field_vb + "] ";
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (param1.field_l != 1) {
                  break L8;
                } else {
                  var3 = "[" + vl.a(ae.field_g, new String[]{param1.field_g}, 2) + "] ";
                  break L8;
                }
              }
              L9: {
                if (-5 != (param1.field_l ^ -1)) {
                  break L9;
                } else {
                  if (null == bp.field_t) {
                    break L9;
                  } else {
                    var3 = "[" + bp.field_t + "] ";
                    break L9;
                  }
                }
              }
              L10: {
                if ((param1.field_l ^ -1) == -4) {
                  var3 = "[#" + param1.field_g + "] ";
                  break L10;
                } else {
                  break L10;
                }
              }
              if (!param1.field_k) {
                var3 = var3 + (String) (var2) + ": ";
                break L4;
              } else {
                break L4;
              }
            }
            stackOut_31_0 = (String) (var3);
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = var2;
            stackOut_33_1 = new StringBuilder().append("bh.A(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    final static void a(int param0, int param1, int param2, jh param3, boolean param4, int param5, int param6, int param7) {
        String discarded$1 = null;
        RuntimeException var8 = null;
        int var8_int = 0;
        mo[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mo var13_ref_mo = null;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        mo[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        mo[][] stackIn_5_0 = null;
        mo[][] stackIn_6_0 = null;
        mo[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mo[][] stackOut_4_0 = null;
        mo[][] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mo[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_110_0 = 0;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1712) {
                break L1;
              } else {
                var16 = (ka) null;
                discarded$1 = bh.a(-40, (ka) null);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param7 >= param5) {
                    break L4;
                  } else {
                    L5: {
                      stackOut_4_0 = ma.field_b;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (-1 != param7) {
                        stackOut_6_0 = (mo[][]) ((Object) stackIn_6_0);
                        stackOut_6_1 = 4 - -param7;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L5;
                      } else {
                        stackOut_5_0 = (mo[][]) ((Object) stackIn_5_0);
                        stackOut_5_1 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        var17 = stackIn_7_0[stackIn_7_1];
                        var8_array = var17;
                        var9 = 1;
                        if (!param4) {
                          break L7;
                        } else {
                          L8: {
                            if (-1 != param7) {
                              break L8;
                            } else {
                              var10_int = 0;
                              L9: while (true) {
                                L10: {
                                  if ((qo.field_r.length ^ -1) >= (var10_int ^ -1)) {
                                    break L10;
                                  } else {
                                    stackOut_11_0 = 0;
                                    stackIn_28_0 = stackOut_11_0;
                                    stackIn_12_0 = stackOut_11_0;
                                    if (var15 != 0) {
                                      break L6;
                                    } else {
                                      L11: {
                                        if (stackIn_12_0 == (fg.field_k[var10_int / 8] & 1 << (7 & var10_int))) {
                                          break L11;
                                        } else {
                                          var9 = 0;
                                          if (var15 == 0) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      var10_int++;
                                      if (var15 == 0) {
                                        continue L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                if (var15 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var10_int = 0;
                          L12: while (true) {
                            L13: {
                              L14: {
                                if (var10_int >= var17.length - 1) {
                                  break L14;
                                } else {
                                  stackOut_19_0 = -1;
                                  stackOut_19_1 = tg.field_a[(param2 - -var10_int) / 8] & 1 << (param2 + var10_int & 7) ^ -1;
                                  stackIn_26_0 = stackOut_19_0;
                                  stackIn_26_1 = stackOut_19_1;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  if (var15 != 0) {
                                    break L13;
                                  } else {
                                    L15: {
                                      if (stackIn_20_0 != stackIn_20_1) {
                                        var9 = 0;
                                        if (var15 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var10_int++;
                                    if (var15 == 0) {
                                      continue L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              stackOut_25_0 = param2;
                              stackOut_25_1 = od.field_Gb[param7] & 255;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              break L13;
                            }
                            param2 = stackIn_26_0 + stackIn_26_1;
                            break L7;
                          }
                        }
                      }
                      var10_int = 0;
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      break L6;
                    }
                    var11 = stackIn_28_0;
                    L16: while (true) {
                      L17: {
                        if (param7 == -1) {
                          stackOut_32_0 = qo.field_r.length;
                          stackIn_33_0 = stackOut_32_0;
                          break L17;
                        } else {
                          stackOut_30_0 = var17.length - 1;
                          stackIn_33_0 = stackOut_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          if (var15 != 0) {
                            break L17;
                          } else {
                            stackOut_31_0 = stackIn_31_0;
                            stackIn_33_0 = stackOut_31_0;
                            break L17;
                          }
                        }
                      }
                      L18: {
                        if (stackIn_33_0 <= var11) {
                          break L18;
                        } else {
                          L19: {
                            L20: {
                              if (-1 == param7) {
                                break L20;
                              } else {
                                rl.field_v[param7] = (byte)var11;
                                if (var15 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            param6 = var11;
                            break L19;
                          }
                          L21: {
                            L22: {
                              if (0 != (param7 ^ -1)) {
                                break L22;
                              } else {
                                if (1 != qo.field_r.length) {
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
                              var13_ref_mo = var17[var11 + 1];
                              if (param4) {
                                break L23;
                              } else {
                                L24: {
                                  if (0 != (param7 ^ -1)) {
                                    if ((mh.field_c.field_Zb[param7] & 255) != var11) {
                                      stackOut_48_0 = 0;
                                      stackIn_49_0 = stackOut_48_0;
                                      break L24;
                                    } else {
                                      stackOut_47_0 = 1;
                                      stackIn_49_0 = stackOut_47_0;
                                      break L24;
                                    }
                                  } else {
                                    if ((qo.field_r[var11] ^ -1) != (mh.field_c.field_mc ^ -1)) {
                                      stackOut_45_0 = 0;
                                      stackIn_49_0 = stackOut_45_0;
                                      break L24;
                                    } else {
                                      stackOut_44_0 = 1;
                                      stackIn_49_0 = stackOut_44_0;
                                      break L24;
                                    }
                                  }
                                }
                                var12 = stackIn_49_0;
                                if (var15 == 0) {
                                  break L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L25: {
                              L26: {
                                if (var13_ref_mo.field_Ab) {
                                  break L26;
                                } else {
                                  L27: {
                                    if (var9 == 0) {
                                      break L27;
                                    } else {
                                      if (!var13_ref_mo.field_Z) {
                                        break L27;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  stackOut_55_0 = 0;
                                  stackIn_56_0 = stackOut_55_0;
                                  break L25;
                                }
                              }
                              stackOut_54_0 = 1;
                              stackIn_56_0 = stackOut_54_0;
                              break L25;
                            }
                            var12 = stackIn_56_0;
                            break L21;
                          }
                          L28: {
                            if (var12 == 0) {
                              break L28;
                            } else {
                              var10_int = 1;
                              bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                              break L28;
                            }
                          }
                          if (dj.field_l) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            var11++;
                            if (var15 == 0) {
                              continue L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      L29: {
                        if (var10_int != 0) {
                          break L29;
                        } else {
                          var11 = 0;
                          L30: while (true) {
                            if (var11 >= -1 + var17.length) {
                              break L29;
                            } else {
                              if (var15 != 0) {
                                break L3;
                              } else {
                                L31: {
                                  L32: {
                                    if ((param7 ^ -1) == 0) {
                                      break L32;
                                    } else {
                                      rl.field_v[param7] = (byte)var11;
                                      if (var15 == 0) {
                                        break L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  param6 = var11;
                                  break L31;
                                }
                                bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                                if (dj.field_l) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  var11++;
                                  if (var15 == 0) {
                                    continue L30;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var15 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var8_int = 1;
                var9 = 0;
                L33: while (true) {
                  stackOut_77_0 = var9;
                  stackIn_78_0 = stackOut_77_0;
                  L34: while (true) {
                    L35: {
                      L36: {
                        if (stackIn_78_0 >= iq.field_b.length) {
                          break L36;
                        } else {
                          var19 = iq.field_b[var9];
                          var18 = var19;
                          var10 = var18;
                          var11 = 0;
                          stackOut_79_0 = 0;
                          stackIn_111_0 = stackOut_79_0;
                          stackIn_80_0 = stackOut_79_0;
                          if (var15 != 0) {
                            break L35;
                          } else {
                            var12 = stackIn_80_0;
                            L37: while (true) {
                              L38: {
                                L39: {
                                  L40: {
                                    if ((var12 ^ -1) <= (var19.length ^ -1)) {
                                      break L40;
                                    } else {
                                      var13 = var19[var12];
                                      var14 = var10[var12 - -1];
                                      stackOut_82_0 = -1;
                                      stackOut_82_1 = var13;
                                      stackIn_100_0 = stackOut_82_0;
                                      stackIn_100_1 = stackOut_82_1;
                                      stackIn_83_0 = stackOut_82_0;
                                      stackIn_83_1 = stackOut_82_1;
                                      if (var15 != 0) {
                                        break L39;
                                      } else {
                                        L41: {
                                          if (stackIn_83_0 != stackIn_83_1) {
                                            L42: {
                                              L43: {
                                                if (param7 != var13) {
                                                  break L43;
                                                } else {
                                                  if (param1 == var14) {
                                                    break L42;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                              }
                                              if ((param7 ^ -1) >= (var13 ^ -1)) {
                                                break L38;
                                              } else {
                                                if (var14 == (255 & rl.field_v[var13])) {
                                                  break L41;
                                                } else {
                                                  if (var15 == 0) {
                                                    break L38;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                            }
                                            var11 = 1;
                                            break L41;
                                          } else {
                                            if ((var14 ^ -1) != (qo.field_r[param6] ^ -1)) {
                                              break L38;
                                            } else {
                                              break L41;
                                            }
                                          }
                                        }
                                        var12 += 2;
                                        if (var15 == 0) {
                                          continue L37;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                  L44: {
                                    if (var11 != 0) {
                                      break L44;
                                    } else {
                                      if ((kj.field_h ^ -1) == (param7 ^ -1)) {
                                        break L44;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                  var8_int = 0;
                                  var12 = 0;
                                  stackOut_99_0 = var19.length;
                                  stackOut_99_1 = var12;
                                  stackIn_100_0 = stackOut_99_0;
                                  stackIn_100_1 = stackOut_99_1;
                                  break L39;
                                }
                                L45: while (true) {
                                  if (stackIn_100_0 <= stackIn_100_1) {
                                    break L38;
                                  } else {
                                    var13 = var19[var12];
                                    stackOut_101_0 = var13 ^ -1;
                                    stackIn_78_0 = stackOut_101_0;
                                    stackIn_102_0 = stackOut_101_0;
                                    if (var15 != 0) {
                                      continue L34;
                                    } else {
                                      L46: {
                                        L47: {
                                          if (stackIn_102_0 != 0) {
                                            break L47;
                                          } else {
                                            lp.field_p = true;
                                            if (var15 == 0) {
                                              break L46;
                                            } else {
                                              break L47;
                                            }
                                          }
                                        }
                                        if (var13 < param7) {
                                          ll.field_c[var13] = true;
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                      var12 += 2;
                                      if (var15 == 0) {
                                        stackOut_99_0 = var19.length;
                                        stackOut_99_1 = var12;
                                        stackIn_100_0 = stackOut_99_0;
                                        stackIn_100_1 = stackOut_99_1;
                                        continue L45;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                              var9++;
                              if (var15 == 0) {
                                continue L33;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                      }
                      stackOut_110_0 = var8_int;
                      stackIn_111_0 = stackOut_110_0;
                      break L35;
                    }
                    if (stackIn_111_0 == 0) {
                      break L3;
                    } else {
                      dj.field_l = true;
                      break L2;
                    }
                  }
                }
              }
              break L2;
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L48: {
            var8 = decompiledCaughtException;
            stackOut_114_0 = (RuntimeException) (var8);
            stackOut_114_1 = new StringBuilder().append("bh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param3 == null) {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L48;
            } else {
              stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackOut_115_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L48;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_117_0), stackIn_117_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
        field_e = "Type your password again to make sure it's correct";
        field_c = new int[8192];
        field_d = new th();
    }
}
