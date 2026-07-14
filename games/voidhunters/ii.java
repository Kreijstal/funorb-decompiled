/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii implements d {
    static String field_g;
    static dja field_d;
    private opa[] field_b;
    private ehb field_f;
    private asb field_e;
    private asb field_c;
    static boolean field_h;
    private int field_i;
    static String field_a;

    public final float[] a(float param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 121 / ((param4 - 31) / 41);
        return this.b(-2, param2).a(2, param3, (d) this, ((ii) this).field_b[param2].field_e, ((ii) this).field_e, param1);
    }

    public final int a(int param0) {
        if (param0 != 11316) {
            opa discarded$0 = ((ii) this).a(51, 52);
        }
        return ((ii) this).field_i;
    }

    public final int[] a(int param0, int param1, int param2, boolean param3, int param4, float param5) {
        if (param0 <= 78) {
            ((ii) this).field_e = null;
        }
        return this.b(-2, param4).a(param1, false, param2, ((ii) this).field_b[param4].field_e, ((ii) this).field_e, (d) this, (double)param5);
    }

    public final opa a(int param0, int param1) {
        if (param0 != -20292) {
            ((ii) this).field_c = null;
        }
        return ((ii) this).field_b[param1];
    }

    private final lra b(int param0, int param1) {
        fh var3 = ((ii) this).field_f.a((long)param1, 77);
        if (param0 != -2) {
            boolean discarded$0 = ((ii) this).a(-32, (byte) 119);
        }
        if (var3 != null) {
            return (lra) (Object) var3;
        }
        byte[] var4 = ((ii) this).field_c.c((byte) 9, param1);
        if (var4 == null) {
            return null;
        }
        lra var5 = new lra(new ds(var4));
        ((ii) this).field_f.a((long)param1, (byte) -22, (fh) (Object) var5);
        return var5;
    }

    public final boolean a(int param0, byte param1) {
        lra var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        var3 = this.b(-2, param0);
        if (param1 <= -30) {
          L0: {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (!var3.a(0, ((ii) this).field_e, (d) this)) {
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
          return false;
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 25498) {
            ii.b(116);
        }
    }

    public final int[] a(int param0, float param1, boolean param2, int param3, int param4, boolean param5) {
        if (!param2) {
            field_h = true;
        }
        return this.b(-2, param3).a(param5, (d) this, ((ii) this).field_e, 0, ((ii) this).field_b[param3].field_e, param4, (double)param1, param0);
    }

    ii(asb param0, asb param1, asb param2) {
        int var5 = 0;
        ds var7 = null;
        opa stackIn_10_0 = null;
        opa stackIn_11_0 = null;
        opa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        opa stackIn_18_0 = null;
        opa stackIn_19_0 = null;
        opa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        opa stackIn_26_0 = null;
        opa stackIn_27_0 = null;
        opa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        opa stackIn_69_0 = null;
        opa stackIn_70_0 = null;
        opa stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        opa stackIn_77_0 = null;
        opa stackIn_78_0 = null;
        opa stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        opa stackIn_90_0 = null;
        opa stackIn_91_0 = null;
        opa stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        opa stackIn_98_0 = null;
        opa stackIn_99_0 = null;
        opa stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        opa stackIn_106_0 = null;
        opa stackIn_107_0 = null;
        opa stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        opa stackOut_105_0 = null;
        opa stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        opa stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        opa stackOut_97_0 = null;
        opa stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        opa stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        opa stackOut_89_0 = null;
        opa stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        opa stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        opa stackOut_76_0 = null;
        opa stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        opa stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        opa stackOut_68_0 = null;
        opa stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        opa stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        opa stackOut_25_0 = null;
        opa stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        opa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        opa stackOut_17_0 = null;
        opa stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        opa stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        opa stackOut_9_0 = null;
        opa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        opa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ((ii) this).field_f = new ehb(256);
        ((ii) this).field_e = param2;
        ((ii) this).field_c = param1;
        var7 = new ds(param0.a(0, 0, (byte) 13));
        ((ii) this).field_i = var7.e(1869);
        ((ii) this).field_b = new opa[((ii) this).field_i];
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((ii) this).field_i) {
            var5 = 0;
            L1: while (true) {
              if (((ii) this).field_i <= var5) {
                var5 = 0;
                L2: while (true) {
                  if (((ii) this).field_i <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (((ii) this).field_i <= var5) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= ((ii) this).field_i) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((ii) this).field_i) {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= ((ii) this).field_i) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (((ii) this).field_i <= var5) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (var5 >= ((ii) this).field_i) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (((ii) this).field_i <= var5) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (((ii) this).field_i <= var5) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (var5 >= ((ii) this).field_i) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (var5 >= ((ii) this).field_i) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (((ii) this).field_i <= var5) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (((ii) this).field_i <= var5) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (((ii) this).field_i <= var5) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (var5 >= ((ii) this).field_i) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (var5 >= ((ii) this).field_i) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= ((ii) this).field_i) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (var5 >= ((ii) this).field_i) {
                                                                                      } else {
                                                                                        if (null != ((ii) this).field_b[var5]) {
                                                                                          ((ii) this).field_b[var5].field_q = var7.e((byte) -98);
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        } else {
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (null != ((ii) this).field_b[var5]) {
                                                                                      ((ii) this).field_b[var5].field_o = var7.h(36);
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    } else {
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (null != ((ii) this).field_b[var5]) {
                                                                                  ((ii) this).field_b[var5].field_f = var7.e((byte) -101);
                                                                                  var5++;
                                                                                  continue L17;
                                                                                } else {
                                                                                  var5++;
                                                                                  continue L17;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (null != ((ii) this).field_b[var5]) {
                                                                              L20: {
                                                                                stackOut_105_0 = ((ii) this).field_b[var5];
                                                                                stackIn_107_0 = stackOut_105_0;
                                                                                stackIn_106_0 = stackOut_105_0;
                                                                                if (1 != var7.e((byte) -115)) {
                                                                                  stackOut_107_0 = (opa) (Object) stackIn_107_0;
                                                                                  stackOut_107_1 = 0;
                                                                                  stackIn_108_0 = stackOut_107_0;
                                                                                  stackIn_108_1 = stackOut_107_1;
                                                                                  break L20;
                                                                                } else {
                                                                                  stackOut_106_0 = (opa) (Object) stackIn_106_0;
                                                                                  stackOut_106_1 = 1;
                                                                                  stackIn_108_0 = stackOut_106_0;
                                                                                  stackIn_108_1 = stackOut_106_1;
                                                                                  break L20;
                                                                                }
                                                                              }
                                                                              stackIn_108_0.field_i = stackIn_108_1 != 0;
                                                                              var5++;
                                                                              continue L16;
                                                                            } else {
                                                                              var5++;
                                                                              continue L16;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (((ii) this).field_b[var5] != null) {
                                                                          L21: {
                                                                            stackOut_97_0 = ((ii) this).field_b[var5];
                                                                            stackIn_99_0 = stackOut_97_0;
                                                                            stackIn_98_0 = stackOut_97_0;
                                                                            if ((var7.e((byte) -121) ^ -1) != -2) {
                                                                              stackOut_99_0 = (opa) (Object) stackIn_99_0;
                                                                              stackOut_99_1 = 0;
                                                                              stackIn_100_0 = stackOut_99_0;
                                                                              stackIn_100_1 = stackOut_99_1;
                                                                              break L21;
                                                                            } else {
                                                                              stackOut_98_0 = (opa) (Object) stackIn_98_0;
                                                                              stackOut_98_1 = 1;
                                                                              stackIn_100_0 = stackOut_98_0;
                                                                              stackIn_100_1 = stackOut_98_1;
                                                                              break L21;
                                                                            }
                                                                          }
                                                                          stackIn_100_0.field_s = stackIn_100_1 != 0;
                                                                          var5++;
                                                                          continue L15;
                                                                        } else {
                                                                          var5++;
                                                                          continue L15;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((ii) this).field_b[var5] != null) {
                                                                      L22: {
                                                                        stackOut_89_0 = ((ii) this).field_b[var5];
                                                                        stackIn_91_0 = stackOut_89_0;
                                                                        stackIn_90_0 = stackOut_89_0;
                                                                        if ((var7.e((byte) -95) ^ -1) != -2) {
                                                                          stackOut_91_0 = (opa) (Object) stackIn_91_0;
                                                                          stackOut_91_1 = 0;
                                                                          stackIn_92_0 = stackOut_91_0;
                                                                          stackIn_92_1 = stackOut_91_1;
                                                                          break L22;
                                                                        } else {
                                                                          stackOut_90_0 = (opa) (Object) stackIn_90_0;
                                                                          stackOut_90_1 = 1;
                                                                          stackIn_92_0 = stackOut_90_0;
                                                                          stackIn_92_1 = stackOut_90_1;
                                                                          break L22;
                                                                        }
                                                                      }
                                                                      stackIn_92_0.field_k = stackIn_92_1 != 0;
                                                                      var5++;
                                                                      continue L14;
                                                                    } else {
                                                                      var5++;
                                                                      continue L14;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((ii) this).field_b[var5] != null) {
                                                                  ((ii) this).field_b[var5].field_j = var7.d((byte) -114);
                                                                  var5++;
                                                                  continue L13;
                                                                } else {
                                                                  var5++;
                                                                  continue L13;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (null != ((ii) this).field_b[var5]) {
                                                              L23: {
                                                                stackOut_76_0 = ((ii) this).field_b[var5];
                                                                stackIn_78_0 = stackOut_76_0;
                                                                stackIn_77_0 = stackOut_76_0;
                                                                if ((var7.e((byte) -87) ^ -1) != -2) {
                                                                  stackOut_78_0 = (opa) (Object) stackIn_78_0;
                                                                  stackOut_78_1 = 0;
                                                                  stackIn_79_0 = stackOut_78_0;
                                                                  stackIn_79_1 = stackOut_78_1;
                                                                  break L23;
                                                                } else {
                                                                  stackOut_77_0 = (opa) (Object) stackIn_77_0;
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
                                                        if (null != ((ii) this).field_b[var5]) {
                                                          L24: {
                                                            stackOut_68_0 = ((ii) this).field_b[var5];
                                                            stackIn_70_0 = stackOut_68_0;
                                                            stackIn_69_0 = stackOut_68_0;
                                                            if ((var7.e((byte) -122) ^ -1) != -2) {
                                                              stackOut_70_0 = (opa) (Object) stackIn_70_0;
                                                              stackOut_70_1 = 0;
                                                              stackIn_71_0 = stackOut_70_0;
                                                              stackIn_71_1 = stackOut_70_1;
                                                              break L24;
                                                            } else {
                                                              stackOut_69_0 = (opa) (Object) stackIn_69_0;
                                                              stackOut_69_1 = 1;
                                                              stackIn_71_0 = stackOut_69_0;
                                                              stackIn_71_1 = stackOut_69_1;
                                                              break L24;
                                                            }
                                                          }
                                                          stackIn_71_0.field_a = stackIn_71_1 != 0;
                                                          var5++;
                                                          continue L11;
                                                        } else {
                                                          var5++;
                                                          continue L11;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (null != ((ii) this).field_b[var5]) {
                                                      ((ii) this).field_b[var5].field_d = var7.d((byte) -114);
                                                      var5++;
                                                      continue L10;
                                                    } else {
                                                      var5++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (null != ((ii) this).field_b[var5]) {
                                                  ((ii) this).field_b[var5].field_p = var7.d((byte) -114);
                                                  var5++;
                                                  continue L9;
                                                } else {
                                                  var5++;
                                                  continue L9;
                                                }
                                              }
                                            }
                                          } else {
                                            if (((ii) this).field_b[var5] != null) {
                                              ((ii) this).field_b[var5].field_l = (short)var7.e(1869);
                                              var5++;
                                              continue L8;
                                            } else {
                                              var5++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      } else {
                                        if (null != ((ii) this).field_b[var5]) {
                                          ((ii) this).field_b[var5].field_n = var7.d((byte) -114);
                                          var5++;
                                          continue L7;
                                        } else {
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  } else {
                                    if (((ii) this).field_b[var5] != null) {
                                      ((ii) this).field_b[var5].field_c = var7.d((byte) -114);
                                      var5++;
                                      continue L6;
                                    } else {
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                if (((ii) this).field_b[var5] != null) {
                                  ((ii) this).field_b[var5].field_b = var7.d((byte) -114);
                                  var5++;
                                  continue L5;
                                } else {
                                  var5++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            if (((ii) this).field_b[var5] != null) {
                              ((ii) this).field_b[var5].field_g = var7.d((byte) -114);
                              var5++;
                              continue L4;
                            } else {
                              var5++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        if (null != ((ii) this).field_b[var5]) {
                          L25: {
                            stackOut_25_0 = ((ii) this).field_b[var5];
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_26_0 = stackOut_25_0;
                            if (1 != var7.e((byte) -87)) {
                              stackOut_27_0 = (opa) (Object) stackIn_27_0;
                              stackOut_27_1 = 0;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              break L25;
                            } else {
                              stackOut_26_0 = (opa) (Object) stackIn_26_0;
                              stackOut_26_1 = 1;
                              stackIn_28_0 = stackOut_26_0;
                              stackIn_28_1 = stackOut_26_1;
                              break L25;
                            }
                          }
                          stackIn_28_0.field_m = stackIn_28_1 != 0;
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (null != ((ii) this).field_b[var5]) {
                      L26: {
                        stackOut_17_0 = ((ii) this).field_b[var5];
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (-2 != (var7.e((byte) -123) ^ -1)) {
                          stackOut_19_0 = (opa) (Object) stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L26;
                        } else {
                          stackOut_18_0 = (opa) (Object) stackIn_18_0;
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L26;
                        }
                      }
                      stackIn_20_0.field_h = stackIn_20_1 != 0;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (null != ((ii) this).field_b[var5]) {
                  L27: {
                    stackOut_9_0 = ((ii) this).field_b[var5];
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (0 != var7.e((byte) -119)) {
                      stackOut_11_0 = (opa) (Object) stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L27;
                    } else {
                      stackOut_10_0 = (opa) (Object) stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L27;
                    }
                  }
                  stackIn_12_0.field_r = stackIn_12_1 != 0;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            if (var7.e((byte) -99) == 1) {
              ((ii) this).field_b[var5] = new opa();
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Next event";
        field_d = (dja) (Object) new upa();
        field_a = "Assault";
    }
}
