/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends hn {
    private String field_k;
    private String field_g;
    static int[] field_e;
    static int field_f;
    static bg field_i;
    static String field_h;
    static int[] field_l;
    static String field_j;

    final ec b(int param0) {
        if (param0 != 0) {
            field_j = null;
        }
        return hk.field_i;
    }

    final static void f(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Exception var5 = null;
        int var6 = 0;
        int stackIn_13_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_69_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!fl.field_d) {
              L1: {
                tl.field_q = tl.field_q + 1;
                if (tk.field_a) {
                  L2: {
                    if (-1 == oj.field_J) {
                      break L2;
                    } else {
                      if (nb.field_i[oj.field_J].c(-41)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (11 >= q.field_c) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var1_int = stackIn_13_0;
                    if (var1_int == 0) {
                      ui.field_L = ui.field_L - 32;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-640 > ui.field_L) {
                      break L5;
                    } else {
                      if (var1_int != 0) {
                        break L5;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ui.field_L = -640;
                  tk.field_a = false;
                  if (!el.field_c) {
                    if (q.field_c != oj.field_J) {
                      L6: {
                        ah.field_e = -1;
                        if (oj.field_J == 2) {
                          sn.field_b[0] = null;
                          sn.field_b[1] = null;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        mc.field_w = oj.field_J;
                        oj.field_J = q.field_c;
                        if (oj.field_J == 5) {
                          break L7;
                        } else {
                          if (oj.field_J == 2) {
                            break L7;
                          } else {
                            break L1;
                          }
                        }
                      }
                      mc.field_w = 4;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L8: {
                      lb.field_q = false;
                      fl.field_d = true;
                      mc.field_w = -1;
                      tb.field_e = true;
                      if (null == pd.field_b) {
                        break L8;
                      } else {
                        pd.field_b.field_K = false;
                        kh.a((byte) 92);
                        break L8;
                      }
                    }
                    return;
                  }
                } else {
                  ui.field_L = ui.field_L + 32;
                  if (ui.field_L > 0) {
                    tb.field_e = false;
                    ui.field_L = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L9: {
                L10: {
                  var1_int = -2;
                  if (ui.field_L == 0) {
                    break L10;
                  } else {
                    if (oj.field_J < 0) {
                      break L10;
                    } else {
                      if (!nb.field_i[oj.field_J].c(-39)) {
                        break L10;
                      } else {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L9;
                      }
                    }
                  }
                }
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L9;
              }
              L11: {
                var2 = stackIn_37_0;
                if (oj.field_J != 11) {
                  L12: while (true) {
                    if (!mm.b((byte) 70)) {
                      if (0 > var1_int) {
                        break L11;
                      } else {
                        if (var2 != 0) {
                          break L11;
                        } else {
                          nb.field_i[var1_int].c(-1, oj.field_J);
                          nb.field_i[var1_int].b((byte) -108);
                          break L11;
                        }
                      }
                    } else {
                      L13: {
                        L14: {
                          if (lj.field_t != 13) {
                            break L14;
                          } else {
                            if (oj.field_J == 4) {
                              break L14;
                            } else {
                              if (oj.field_J != 6) {
                                L15: {
                                  if (0 != oj.field_J) {
                                    break L15;
                                  } else {
                                    el.field_c = true;
                                    var1_int = -1;
                                    break L15;
                                  }
                                }
                                L16: {
                                  L17: {
                                    if (oj.field_J == 2) {
                                      break L17;
                                    } else {
                                      if (oj.field_J != 5) {
                                        stackOut_55_0 = 0;
                                        stackIn_56_0 = stackOut_55_0;
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  stackOut_54_0 = 1;
                                  stackIn_56_0 = stackOut_54_0;
                                  break L16;
                                }
                                L18: {
                                  var3 = stackIn_56_0;
                                  if (var3 == 0) {
                                    break L18;
                                  } else {
                                    if (mc.field_w == 0) {
                                      mc.field_w = 4;
                                      break L13;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                if (mc.field_w == 6) {
                                  var1_int = 4;
                                  break L13;
                                } else {
                                  var1_int = mc.field_w;
                                  break L13;
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        if (oj.field_J == -1) {
                          break L13;
                        } else {
                          if (var2 != 0) {
                            break L13;
                          } else {
                            var3 = nb.field_i[oj.field_J].e(1);
                            if (var3 > -2) {
                              var1_int = var3;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      if (lj.field_t != 12) {
                        continue L12;
                      } else {
                        if (wj.field_j >= 2) {
                          L19: {
                            if (gd.field_w) {
                              stackOut_68_0 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              break L19;
                            } else {
                              stackOut_67_0 = 1;
                              stackIn_69_0 = stackOut_67_0;
                              break L19;
                            }
                          }
                          gd.field_w = stackIn_69_0 != 0;
                          continue L12;
                        } else {
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L11;
                }
              }
              L20: {
                if (oj.field_J < 0) {
                  break L20;
                } else {
                  if (var2 != 0) {
                    break L20;
                  } else {
                    var3 = nb.field_i[oj.field_J].b(8779);
                    if (-2 < var3) {
                      L21: {
                        if (var3 >= 0) {
                          nb.field_i[var3].c(-1, oj.field_J);
                          nb.field_i[var3].b((byte) 55);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var1_int = var3;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              L22: {
                if (var1_int <= -2) {
                  break L22;
                } else {
                  if (~oj.field_J == ~var1_int) {
                    break L22;
                  } else {
                    q.field_c = var1_int;
                    tk.field_a = true;
                    break L22;
                  }
                }
              }
              L23: {
                if (jk.field_ab == 0) {
                  break L23;
                } else {
                  L24: {
                    if (3 == oj.field_J) {
                      break L24;
                    } else {
                      if (8 != oj.field_J) {
                        if (5 == oj.field_J) {
                          ce.a(ui.field_L, false, false, true);
                          break L23;
                        } else {
                          break L23;
                        }
                      } else {
                        break L24;
                      }
                    }
                  }
                  ce.a(ui.field_L, false, false, false);
                  break L23;
                }
              }
              L25: {
                fa.field_e = false;
                if (oj.field_J != 4) {
                  break L25;
                } else {
                  if (!eg.b(42)) {
                    break L25;
                  } else {
                    L26: {
                      if (0 >= qd.field_R) {
                        break L26;
                      } else {
                        qd.field_R = qd.field_R - 1;
                        break L26;
                      }
                    }
                    var3 = 20 + (-ak.field_c.field_x + 640) + -ui.field_L;
                    var4 = 500 + -ak.field_c.field_A;
                    if (~nk.field_w > ~var3) {
                      break L25;
                    } else {
                      if (640 <= nk.field_w) {
                        break L25;
                      } else {
                        if (~var4 < ~gb.field_e) {
                          break L25;
                        } else {
                          if (gb.field_e >= 480) {
                            break L25;
                          } else {
                            fa.field_e = true;
                            if (jk.field_ab == 0) {
                              break L25;
                            } else {
                              if (0 != qd.field_R) {
                                break L25;
                              } else {
                                try {
                                  L27: {
                                    qd.field_R = 25;
                                    cn.a(bm.c(-125), "http://itunes.apple.com/us/app/miner-disturbance/id374275550?mt=8", 11050, true);
                                    break L27;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L28: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    var5.printStackTrace();
                                    break L28;
                                  }
                                }
                                break L25;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L29: {
                if (param0 == -18627) {
                  break L29;
                } else {
                  oc.e(5);
                  break L29;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "oc.B(" + param0 + ')');
        }
    }

    final static ih a(bj param0, byte param1, String param2, String param3, bj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        ih stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = param4.a(127, param2);
            if (param1 == 125) {
              var6 = param4.a(param3, var5_int, -103);
              stackOut_3_0 = pk.a(var6, param4, (byte) 82, var5_int, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ih) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("oc.E(");
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void e(int param0) {
        field_i = null;
        field_j = null;
        field_l = null;
        field_e = null;
        if (param0 != -640) {
            oc.f(74);
        }
        field_h = null;
    }

    final static boolean d(int param0) {
        if (param0 <= 42) {
            Object var2 = null;
            ih discarded$0 = oc.a((bj) null, (byte) -68, (String) null, (String) null, (bj) null);
        }
        return cg.field_C;
    }

    oc(String param0, String param1) {
        try {
            ((oc) this).field_k = param1;
            ((oc) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "oc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(sb param0, byte param1) {
        if (param1 > -85) {
            return;
        }
        try {
            param0.a(8, ((oc) this).field_g);
            param0.a((byte) 97, ((oc) this).field_k);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "oc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 256;
        field_i = new bg(9, 0, 4, 1);
        field_l = new int[8192];
        field_h = "Scannox: Detects movement through rock.";
        field_j = "Age:";
    }
}
