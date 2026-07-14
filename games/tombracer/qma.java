/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qma implements d {
    private int field_a;
    static boolean field_c;
    private dw[] field_b;
    static String field_f;
    private pea field_e;
    private cn field_d;
    private cn field_g;

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 10) {
            Object var2 = null;
            qma.a((java.awt.Component) null, 70);
        }
    }

    public boolean a(int param0, byte param1) {
        km var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 >= 10) {
          L0: {
            L1: {
              var3 = this.a(param0, 0);
              if (var3 == null) {
                break L1;
              } else {
                if (!var3.a(((qma) this).field_d, (d) this, 0)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public final int a(int param0) {
        if (param0 != -15061) {
            return 75;
        }
        return ((qma) this).field_a;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) nfa.field_n);
        if (param1 > -4) {
            return;
        }
        param0.addFocusListener((java.awt.event.FocusListener) (Object) nfa.field_n);
    }

    public final dw a(byte param0, int param1) {
        int var3 = -28 % ((55 - param0) / 41);
        return ((qma) this).field_b[param1];
    }

    public final int[] a(int param0, int param1, boolean param2, int param3, float param4, int param5) {
        if (param0 != 14907) {
            ((qma) this).field_d = null;
        }
        return this.a(param1, 0).a(param5, ((qma) this).field_d, param2, (double)param4, (d) this, (byte) 104, param3, ((qma) this).field_b[param1].field_e);
    }

    private final km a(int param0, int param1) {
        od var3 = ((qma) this).field_e.a(param1 + param1, (long)param0);
        if (!(var3 == null)) {
            return (km) (Object) var3;
        }
        byte[] var4 = ((qma) this).field_g.f(param0, -109);
        if (var4 == null) {
            return null;
        }
        km var5 = new km(new uia(var4));
        ((qma) this).field_e.a((od) (Object) var5, (byte) 96, (long)param0);
        return var5;
    }

    public final float[] a(int param0, int param1, int param2, int param3, float param4, boolean param5) {
        if (param0 <= 114) {
            field_f = null;
        }
        return this.a(param3, 0).a((d) this, (byte) -127, param1, param2, ((qma) this).field_b[param3].field_e, ((qma) this).field_d);
    }

    qma(cn param0, cn param1, cn param2) {
        int var5 = 0;
        uia var7 = null;
        dw stackIn_10_0 = null;
        dw stackIn_11_0 = null;
        dw stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        dw stackIn_18_0 = null;
        dw stackIn_19_0 = null;
        dw stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        dw stackIn_26_0 = null;
        dw stackIn_27_0 = null;
        dw stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        dw stackIn_69_0 = null;
        dw stackIn_70_0 = null;
        dw stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        dw stackIn_77_0 = null;
        dw stackIn_78_0 = null;
        dw stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        dw stackIn_90_0 = null;
        dw stackIn_91_0 = null;
        dw stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        dw stackIn_98_0 = null;
        dw stackIn_99_0 = null;
        dw stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        dw stackIn_106_0 = null;
        dw stackIn_107_0 = null;
        dw stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        dw stackOut_105_0 = null;
        dw stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        dw stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        dw stackOut_97_0 = null;
        dw stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        dw stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        dw stackOut_89_0 = null;
        dw stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        dw stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        dw stackOut_76_0 = null;
        dw stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        dw stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        dw stackOut_68_0 = null;
        dw stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        dw stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        dw stackOut_25_0 = null;
        dw stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        dw stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        dw stackOut_17_0 = null;
        dw stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        dw stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        dw stackOut_9_0 = null;
        dw stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        dw stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ((qma) this).field_e = new pea(256);
        ((qma) this).field_d = param2;
        ((qma) this).field_g = param1;
        var7 = new uia(param0.a(false, 0, 0));
        ((qma) this).field_a = var7.d(123);
        ((qma) this).field_b = new dw[((qma) this).field_a];
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((qma) this).field_a) {
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((qma) this).field_a) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((qma) this).field_a) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((qma) this).field_a) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= ((qma) this).field_a) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((qma) this).field_a) {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= ((qma) this).field_a) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (var5 >= ((qma) this).field_a) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (var5 >= ((qma) this).field_a) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (var5 >= ((qma) this).field_a) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (var5 >= ((qma) this).field_a) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (((qma) this).field_a <= var5) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (var5 >= ((qma) this).field_a) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (((qma) this).field_a <= var5) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (var5 >= ((qma) this).field_a) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (var5 >= ((qma) this).field_a) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (((qma) this).field_a <= var5) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (var5 >= ((qma) this).field_a) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= ((qma) this).field_a) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (((qma) this).field_a <= var5) {
                                                                                      } else {
                                                                                        if (((qma) this).field_b[var5] != null) {
                                                                                          ((qma) this).field_b[var5].field_d = var7.h(255);
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        } else {
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (((qma) this).field_b[var5] != null) {
                                                                                      ((qma) this).field_b[var5].field_t = var7.e(-106);
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    } else {
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (((qma) this).field_b[var5] != null) {
                                                                                  ((qma) this).field_b[var5].field_q = var7.h(255);
                                                                                  var5++;
                                                                                  continue L17;
                                                                                } else {
                                                                                  var5++;
                                                                                  continue L17;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (((qma) this).field_b[var5] != null) {
                                                                              L20: {
                                                                                stackOut_105_0 = ((qma) this).field_b[var5];
                                                                                stackIn_107_0 = stackOut_105_0;
                                                                                stackIn_106_0 = stackOut_105_0;
                                                                                if (1 != var7.h(255)) {
                                                                                  stackOut_107_0 = (dw) (Object) stackIn_107_0;
                                                                                  stackOut_107_1 = 0;
                                                                                  stackIn_108_0 = stackOut_107_0;
                                                                                  stackIn_108_1 = stackOut_107_1;
                                                                                  break L20;
                                                                                } else {
                                                                                  stackOut_106_0 = (dw) (Object) stackIn_106_0;
                                                                                  stackOut_106_1 = 1;
                                                                                  stackIn_108_0 = stackOut_106_0;
                                                                                  stackIn_108_1 = stackOut_106_1;
                                                                                  break L20;
                                                                                }
                                                                              }
                                                                              stackIn_108_0.field_l = stackIn_108_1 != 0;
                                                                              var5++;
                                                                              continue L16;
                                                                            } else {
                                                                              var5++;
                                                                              continue L16;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (((qma) this).field_b[var5] != null) {
                                                                          L21: {
                                                                            stackOut_97_0 = ((qma) this).field_b[var5];
                                                                            stackIn_99_0 = stackOut_97_0;
                                                                            stackIn_98_0 = stackOut_97_0;
                                                                            if ((var7.h(255) ^ -1) != -2) {
                                                                              stackOut_99_0 = (dw) (Object) stackIn_99_0;
                                                                              stackOut_99_1 = 0;
                                                                              stackIn_100_0 = stackOut_99_0;
                                                                              stackIn_100_1 = stackOut_99_1;
                                                                              break L21;
                                                                            } else {
                                                                              stackOut_98_0 = (dw) (Object) stackIn_98_0;
                                                                              stackOut_98_1 = 1;
                                                                              stackIn_100_0 = stackOut_98_0;
                                                                              stackIn_100_1 = stackOut_98_1;
                                                                              break L21;
                                                                            }
                                                                          }
                                                                          stackIn_100_0.field_n = stackIn_100_1 != 0;
                                                                          var5++;
                                                                          continue L15;
                                                                        } else {
                                                                          var5++;
                                                                          continue L15;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((qma) this).field_b[var5] != null) {
                                                                      L22: {
                                                                        stackOut_89_0 = ((qma) this).field_b[var5];
                                                                        stackIn_91_0 = stackOut_89_0;
                                                                        stackIn_90_0 = stackOut_89_0;
                                                                        if (var7.h(255) != 1) {
                                                                          stackOut_91_0 = (dw) (Object) stackIn_91_0;
                                                                          stackOut_91_1 = 0;
                                                                          stackIn_92_0 = stackOut_91_0;
                                                                          stackIn_92_1 = stackOut_91_1;
                                                                          break L22;
                                                                        } else {
                                                                          stackOut_90_0 = (dw) (Object) stackIn_90_0;
                                                                          stackOut_90_1 = 1;
                                                                          stackIn_92_0 = stackOut_90_0;
                                                                          stackIn_92_1 = stackOut_90_1;
                                                                          break L22;
                                                                        }
                                                                      }
                                                                      stackIn_92_0.field_b = stackIn_92_1 != 0;
                                                                      var5++;
                                                                      continue L14;
                                                                    } else {
                                                                      var5++;
                                                                      continue L14;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (null != ((qma) this).field_b[var5]) {
                                                                  ((qma) this).field_b[var5].field_r = var7.c((byte) 39);
                                                                  var5++;
                                                                  continue L13;
                                                                } else {
                                                                  var5++;
                                                                  continue L13;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((qma) this).field_b[var5] != null) {
                                                              L23: {
                                                                stackOut_76_0 = ((qma) this).field_b[var5];
                                                                stackIn_78_0 = stackOut_76_0;
                                                                stackIn_77_0 = stackOut_76_0;
                                                                if (-2 != (var7.h(255) ^ -1)) {
                                                                  stackOut_78_0 = (dw) (Object) stackIn_78_0;
                                                                  stackOut_78_1 = 0;
                                                                  stackIn_79_0 = stackOut_78_0;
                                                                  stackIn_79_1 = stackOut_78_1;
                                                                  break L23;
                                                                } else {
                                                                  stackOut_77_0 = (dw) (Object) stackIn_77_0;
                                                                  stackOut_77_1 = 1;
                                                                  stackIn_79_0 = stackOut_77_0;
                                                                  stackIn_79_1 = stackOut_77_1;
                                                                  break L23;
                                                                }
                                                              }
                                                              stackIn_79_0.field_e = stackIn_79_1 != 0;
                                                              var5++;
                                                              continue L12;
                                                            } else {
                                                              var5++;
                                                              continue L12;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (((qma) this).field_b[var5] != null) {
                                                          L24: {
                                                            stackOut_68_0 = ((qma) this).field_b[var5];
                                                            stackIn_70_0 = stackOut_68_0;
                                                            stackIn_69_0 = stackOut_68_0;
                                                            if (var7.h(255) != 1) {
                                                              stackOut_70_0 = (dw) (Object) stackIn_70_0;
                                                              stackOut_70_1 = 0;
                                                              stackIn_71_0 = stackOut_70_0;
                                                              stackIn_71_1 = stackOut_70_1;
                                                              break L24;
                                                            } else {
                                                              stackOut_69_0 = (dw) (Object) stackIn_69_0;
                                                              stackOut_69_1 = 1;
                                                              stackIn_71_0 = stackOut_69_0;
                                                              stackIn_71_1 = stackOut_69_1;
                                                              break L24;
                                                            }
                                                          }
                                                          stackIn_71_0.field_k = stackIn_71_1 != 0;
                                                          var5++;
                                                          continue L11;
                                                        } else {
                                                          var5++;
                                                          continue L11;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (null != ((qma) this).field_b[var5]) {
                                                      ((qma) this).field_b[var5].field_o = var7.c((byte) 70);
                                                      var5++;
                                                      continue L10;
                                                    } else {
                                                      var5++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (null != ((qma) this).field_b[var5]) {
                                                  ((qma) this).field_b[var5].field_s = var7.c((byte) 45);
                                                  var5++;
                                                  continue L9;
                                                } else {
                                                  var5++;
                                                  continue L9;
                                                }
                                              }
                                            }
                                          } else {
                                            if (null != ((qma) this).field_b[var5]) {
                                              ((qma) this).field_b[var5].field_m = (short)var7.d(124);
                                              var5++;
                                              continue L8;
                                            } else {
                                              var5++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      } else {
                                        if (null != ((qma) this).field_b[var5]) {
                                          ((qma) this).field_b[var5].field_a = var7.c((byte) 126);
                                          var5++;
                                          continue L7;
                                        } else {
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  } else {
                                    if (((qma) this).field_b[var5] != null) {
                                      ((qma) this).field_b[var5].field_h = var7.c((byte) 85);
                                      var5++;
                                      continue L6;
                                    } else {
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                if (null != ((qma) this).field_b[var5]) {
                                  ((qma) this).field_b[var5].field_c = var7.c((byte) 91);
                                  var5++;
                                  continue L5;
                                } else {
                                  var5++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            if (((qma) this).field_b[var5] != null) {
                              ((qma) this).field_b[var5].field_i = var7.c((byte) 90);
                              var5++;
                              continue L4;
                            } else {
                              var5++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        if (null != ((qma) this).field_b[var5]) {
                          L25: {
                            stackOut_25_0 = ((qma) this).field_b[var5];
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_26_0 = stackOut_25_0;
                            if (var7.h(255) != 1) {
                              stackOut_27_0 = (dw) (Object) stackIn_27_0;
                              stackOut_27_1 = 0;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              break L25;
                            } else {
                              stackOut_26_0 = (dw) (Object) stackIn_26_0;
                              stackOut_26_1 = 1;
                              stackIn_28_0 = stackOut_26_0;
                              stackIn_28_1 = stackOut_26_1;
                              break L25;
                            }
                          }
                          stackIn_28_0.field_f = stackIn_28_1 != 0;
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (null != ((qma) this).field_b[var5]) {
                      L26: {
                        stackOut_17_0 = ((qma) this).field_b[var5];
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (-2 != (var7.h(255) ^ -1)) {
                          stackOut_19_0 = (dw) (Object) stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L26;
                        } else {
                          stackOut_18_0 = (dw) (Object) stackIn_18_0;
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L26;
                        }
                      }
                      stackIn_20_0.field_g = stackIn_20_1 != 0;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (null != ((qma) this).field_b[var5]) {
                  L27: {
                    stackOut_9_0 = ((qma) this).field_b[var5];
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var7.h(255) != 0) {
                      stackOut_11_0 = (dw) (Object) stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L27;
                    } else {
                      stackOut_10_0 = (dw) (Object) stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L27;
                    }
                  }
                  stackIn_12_0.field_p = stackIn_12_1 != 0;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            if (var7.h(255) == 1) {
              ((qma) this).field_b[var5] = new dw();
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public final int[] a(byte param0, int param1, float param2, int param3, boolean param4, int param5) {
        if (param0 != 40) {
            int discarded$0 = qma.a((byte) 28, 0.7337705479498259);
        }
        return this.a(param3, 0).a(param1, ((qma) this).field_b[param3].field_e, param5, (double)param2, ((qma) this).field_d, (d) this, false);
    }

    final static int a(byte param0, double param1) {
        if (param0 != 123) {
            field_f = null;
        }
        if (0.0 >= param1) {
            if (0.0 > param1) {
                return (int)(param1 - 0.5);
            }
            return 0;
        }
        return (int)(0.5 + param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_f = "That name is not available";
    }
}
