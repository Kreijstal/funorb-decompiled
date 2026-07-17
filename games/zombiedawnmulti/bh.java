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
        Object var5 = null;
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
                  var2 = (Object) (Object) var6;
                  var2 = (Object) (Object) var6;
                  if (1 == param1.field_h) {
                    var2 = (Object) (Object) ("<img=0>" + var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1.field_h != 2) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + var2);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 < -125) {
                break L3;
              } else {
                var5 = null;
                bh.a(-58, -66, -108, (jh) null, true, 107, -83, 97);
                break L3;
              }
            }
            L4: {
              var3 = "";
              if (2 != param1.field_l) {
                L5: {
                  if (param1.field_l != 0) {
                    break L5;
                  } else {
                    if (sn.field_Hb) {
                      var3 = "[" + ne.field_vb + "] ";
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param1.field_l != 1) {
                    break L6;
                  } else {
                    var3 = "[" + vl.a(ae.field_g, new String[1], 2) + "] ";
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_l != 4) {
                    break L7;
                  } else {
                    if (null == bp.field_t) {
                      break L7;
                    } else {
                      var3 = "[" + bp.field_t + "] ";
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param1.field_l == 3) {
                    var3 = "[#" + param1.field_g + "] ";
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (!param1.field_k) {
                  var3 = var3 + var2 + ": ";
                  break L4;
                } else {
                  break L4;
                }
              } else {
                if (!param1.field_k) {
                  L9: {
                    if (param1.field_i != 0) {
                      break L9;
                    } else {
                      if (param1.field_o != 0) {
                        break L9;
                      } else {
                        var3 = vl.a(v.field_c, new String[1], 2);
                        break L4;
                      }
                    }
                  }
                  var3 = vl.a(lc.field_n, new String[1], 2);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            stackOut_31_0 = (String) var3;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_33_0 = var2;
            stackOut_33_1 = new StringBuilder().append("bh.A(").append(param0).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_32_0;
    }

    final static void a(int param0, int param1, int param2, jh param3, boolean param4, int param5, int param6, int param7) {
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
        Object var16 = null;
        mo[] var17 = null;
        mo[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        mo[][] stackIn_5_0 = null;
        mo[][] stackIn_6_0 = null;
        mo[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        mo[][] stackOut_4_0 = null;
        mo[][] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mo[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1712) {
                break L1;
              } else {
                var16 = null;
                String discarded$1 = bh.a(-40, (ka) null);
                break L1;
              }
            }
            L2: {
              if (param7 >= param5) {
                var8_int = 1;
                var9 = 0;
                L3: while (true) {
                  if (var9 >= iq.field_b.length) {
                    if (var8_int == 0) {
                      break L2;
                    } else {
                      dj.field_l = true;
                      break L2;
                    }
                  } else {
                    var22 = iq.field_b[var9];
                    var21 = var22;
                    var20 = var21;
                    var19 = var20;
                    var10 = var19;
                    var11 = 0;
                    var12 = 0;
                    L4: while (true) {
                      L5: {
                        if (var12 >= var22.length) {
                          L6: {
                            if (var11 != 0) {
                              break L6;
                            } else {
                              if (kj.field_h == param7) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L7: while (true) {
                            if (var22.length <= var12) {
                              break L5;
                            } else {
                              L8: {
                                var13 = var22[var12];
                                if (var13 != -1) {
                                  if (var13 < param7) {
                                    ll.field_c[var13] = true;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  lp.field_p = true;
                                  break L8;
                                }
                              }
                              var12 += 2;
                              continue L7;
                            }
                          }
                        } else {
                          L9: {
                            var13 = var22[var12];
                            var14 = var10[var12 - -1];
                            if (-1 != var13) {
                              L10: {
                                if (param7 != var13) {
                                  break L10;
                                } else {
                                  if (param1 == var14) {
                                    var11 = 1;
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (param7 <= var13) {
                                break L5;
                              } else {
                                L11: {
                                  if (var14 == (255 & rl.field_v[var13])) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var12 += 2;
                                continue L4;
                              }
                            } else {
                              if (var14 != qo.field_r[param6]) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var12 += 2;
                          continue L4;
                        }
                      }
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                L12: {
                  stackOut_4_0 = ma.field_b;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (-1 != param7) {
                    stackOut_6_0 = (mo[][]) (Object) stackIn_6_0;
                    stackOut_6_1 = 4 - -param7;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L12;
                  } else {
                    stackOut_5_0 = (mo[][]) (Object) stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L12;
                  }
                }
                L13: {
                  var17 = stackIn_7_0[stackIn_7_1];
                  var18 = var17;
                  var8_array = var18;
                  var9 = 1;
                  if (!param4) {
                    break L13;
                  } else {
                    if (-1 != param7) {
                      var10_int = 0;
                      L14: while (true) {
                        L15: {
                          if (var10_int >= var17.length - 1) {
                            break L15;
                          } else {
                            if ((tg.field_a[(param2 - -var10_int) / 8] & 1 << (param2 + var10_int & 7)) != 0) {
                              var9 = 0;
                              break L15;
                            } else {
                              var10_int++;
                              continue L14;
                            }
                          }
                        }
                        param2 = param2 + (od.field_Gb[param7] & 255);
                        break L13;
                      }
                    } else {
                      var10_int = 0;
                      L16: while (true) {
                        if (qo.field_r.length <= var10_int) {
                          break L13;
                        } else {
                          if (0 == (fg.field_k[var10_int / 8] & 1 << (7 & var10_int))) {
                            var10_int++;
                            continue L16;
                          } else {
                            var9 = 0;
                            break L13;
                          }
                        }
                      }
                    }
                  }
                }
                var10_int = 0;
                var11 = 0;
                L17: while (true) {
                  L18: {
                    if (param7 == -1) {
                      stackOut_24_0 = qo.field_r.length;
                      stackIn_25_0 = stackOut_24_0;
                      break L18;
                    } else {
                      stackOut_23_0 = var18.length - 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L18;
                    }
                  }
                  if (stackIn_25_0 <= var11) {
                    if (var10_int != 0) {
                      break L2;
                    } else {
                      var11 = 0;
                      L19: while (true) {
                        if (var11 >= -1 + var18.length) {
                          break L2;
                        } else {
                          L20: {
                            if (param7 == -1) {
                              param6 = var11;
                              break L20;
                            } else {
                              rl.field_v[param7] = (byte)var11;
                              break L20;
                            }
                          }
                          bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                          if (dj.field_l) {
                            return;
                          } else {
                            var11++;
                            continue L19;
                          }
                        }
                      }
                    }
                  } else {
                    L21: {
                      if (-1 == param7) {
                        param6 = var11;
                        break L21;
                      } else {
                        rl.field_v[param7] = (byte)var11;
                        break L21;
                      }
                    }
                    L22: {
                      L23: {
                        if (param7 != -1) {
                          break L23;
                        } else {
                          if (1 != qo.field_r.length) {
                            break L23;
                          } else {
                            var12 = 1;
                            break L22;
                          }
                        }
                      }
                      var13_ref_mo = var8_array[var11 + 1];
                      if (param4) {
                        L24: {
                          if (!var13_ref_mo.field_Ab) {
                            if (var9 != 0) {
                              if (var13_ref_mo.field_Z) {
                                stackOut_47_0 = 1;
                                stackIn_49_0 = stackOut_47_0;
                                break L24;
                              } else {
                                stackOut_46_0 = 0;
                                stackIn_49_0 = stackOut_46_0;
                                break L24;
                              }
                            } else {
                              stackOut_44_0 = 0;
                              stackIn_49_0 = stackOut_44_0;
                              break L24;
                            }
                          } else {
                            stackOut_42_0 = 1;
                            stackIn_49_0 = stackOut_42_0;
                            break L24;
                          }
                        }
                        var12 = stackIn_49_0;
                        break L22;
                      } else {
                        L25: {
                          if (param7 != -1) {
                            if ((mh.field_c.field_Zb[param7] & 255) != var11) {
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L25;
                            } else {
                              stackOut_38_0 = 1;
                              stackIn_40_0 = stackOut_38_0;
                              break L25;
                            }
                          } else {
                            if (qo.field_r[var11] != mh.field_c.field_mc) {
                              stackOut_36_0 = 0;
                              stackIn_40_0 = stackOut_36_0;
                              break L25;
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_40_0 = stackOut_35_0;
                              break L25;
                            }
                          }
                        }
                        var12 = stackIn_40_0;
                        break L22;
                      }
                    }
                    L26: {
                      if (var12 == 0) {
                        break L26;
                      } else {
                        var10_int = 1;
                        bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                        break L26;
                      }
                    }
                    if (dj.field_l) {
                      return;
                    } else {
                      var11++;
                      continue L17;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var8 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var8;
            stackOut_98_1 = new StringBuilder().append("bh.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param3 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L27;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L27;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Type your password again to make sure it's correct";
        field_c = new int[8192];
        field_d = new th();
    }
}
