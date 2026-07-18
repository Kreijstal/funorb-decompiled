/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_b;
    private int[][] field_g;
    int[] field_e;
    int[] field_l;
    static cn field_c;
    boolean field_h;
    private int[] field_d;
    static String field_k;
    static String field_a;
    boolean field_i;
    int field_j;
    boolean field_f;

    private dk(cn param0, int param1, String param2) {
        this(param0, param1, param0.a(true, param2, param1));
    }

    dk(cn param0, String param1, String param2) {
        this(param0, param0.b(param1, -7768), param2);
    }

    private final void a(int param0, uia param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.h(255);
              if (var3_int == 0) {
                break L0;
              } else {
                this.a(var3_int, param1, 16588);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("dk.A(").append(-110).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 104) {
            return;
        }
        field_c = null;
        field_k = null;
    }

    final int a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          var4 = 0;
          if (param1) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((dk) this).field_j;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 > 82) {
            break L1;
          } else {
            dk.a((byte) -28);
            break L1;
          }
        }
        var6 = 0;
        L2: while (true) {
          if (var6 >= var5) {
            return var3;
          } else {
            var7 = var4;
            L3: while (true) {
              if (var7 >= ((dk) this).field_e.length) {
                if (((dk) this).field_b > 0) {
                  var4 = ((dk) this).field_b;
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
              } else {
                var3 = var3 + ((dk) this).field_e[var7];
                var7++;
                continue L3;
              }
            }
          }
        }
    }

    private final void a(int param0, uia param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != 1) {
                  if (2 != param0) {
                    if (param0 == 3) {
                      var4_int = param1.h(255);
                      ((dk) this).field_d = new int[var4_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var4_int <= var5) {
                          ((dk) this).field_d[var4_int] = 9999999;
                          break L2;
                        } else {
                          ((dk) this).field_d[var5] = param1.h(255);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (5 == param0) {
                        int discarded$8 = param1.h(255);
                        break L1;
                      } else {
                        if (6 == param0) {
                          int discarded$9 = param1.d(127);
                          break L1;
                        } else {
                          if (param0 == 7) {
                            int discarded$10 = param1.d(126);
                            break L1;
                          } else {
                            if (param0 == 8) {
                              ((dk) this).field_j = param1.h(255);
                              ((dk) this).field_f = false;
                              break L1;
                            } else {
                              if (9 != param0) {
                                if (param0 != 10) {
                                  if (param0 != 11) {
                                    if (12 == param0) {
                                      var4_int = param1.h(255);
                                      var5 = 0;
                                      L4: while (true) {
                                        if (~var5 <= ~var4_int) {
                                          var5 = 0;
                                          L5: while (true) {
                                            if (~var4_int >= ~var5) {
                                              break L2;
                                            } else {
                                              int discarded$11 = param1.d(121);
                                              var5++;
                                              continue L5;
                                            }
                                          }
                                        } else {
                                          int discarded$12 = param1.d(125);
                                          var5++;
                                          continue L4;
                                        }
                                      }
                                    } else {
                                      if (param0 != 13) {
                                        if (param0 != 14) {
                                          if (param0 != 15) {
                                            if (param0 == 16) {
                                              break L2;
                                            } else {
                                              if (18 == param0) {
                                                break L2;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            ((dk) this).field_i = true;
                                            break L1;
                                          }
                                        } else {
                                          ((dk) this).field_h = true;
                                          break L1;
                                        }
                                      } else {
                                        var4_int = param1.d(121);
                                        ((dk) this).field_g = new int[var4_int][];
                                        var5 = 0;
                                        L6: while (true) {
                                          if (~var4_int >= ~var5) {
                                            break L2;
                                          } else {
                                            L7: {
                                              var6 = param1.h(255);
                                              if (var6 <= 0) {
                                                break L7;
                                              } else {
                                                ((dk) this).field_g[var5] = new int[var6];
                                                ((dk) this).field_g[var5][0] = param1.a(-32768);
                                                var7 = 1;
                                                L8: while (true) {
                                                  if (var7 >= var6) {
                                                    break L7;
                                                  } else {
                                                    ((dk) this).field_g[var5][var7] = param1.d(123);
                                                    var7++;
                                                    continue L8;
                                                  }
                                                }
                                              }
                                            }
                                            var5++;
                                            continue L6;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    int discarded$13 = param1.h(255);
                                    break L1;
                                  }
                                } else {
                                  int discarded$14 = param1.h(255);
                                  break L1;
                                }
                              } else {
                                int discarded$15 = param1.h(255);
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    ((dk) this).field_b = param1.d(122);
                    break L1;
                  }
                } else {
                  var4_int = param1.d(127);
                  ((dk) this).field_e = new int[var4_int];
                  var5 = 0;
                  L9: while (true) {
                    if (~var5 <= ~var4_int) {
                      ((dk) this).field_l = new int[var4_int];
                      var5 = 0;
                      L10: while (true) {
                        if (var4_int <= var5) {
                          var5 = 0;
                          L11: while (true) {
                            if (var4_int <= var5) {
                              break L2;
                            } else {
                              ((dk) this).field_l[var5] = (param1.d(123) << 16) - -((dk) this).field_l[var5];
                              var5++;
                              continue L11;
                            }
                          }
                        } else {
                          ((dk) this).field_l[var5] = param1.d(124);
                          var5++;
                          continue L10;
                        }
                      }
                    } else {
                      ((dk) this).field_e[var5] = param1.d(121);
                      var5++;
                      continue L9;
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var4;
            stackOut_57_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param1 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L12;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + 16588 + ')');
        }
    }

    final static int a(dn param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 == lsa.field_c) {
              stackOut_7_0 = 9216;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0 != gd.field_H) {
                if (gq.field_u != param0) {
                  stackOut_9_0 = 21;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_5_0 = 34066;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                stackOut_2_0 = 34065;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("dk.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + 0 + ')');
        }
        return stackIn_10_0;
    }

    private dk(cn param0, int param1, int param2) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        ((dk) this).field_j = 0;
        ((dk) this).field_b = -1;
        try {
          L0: {
            L1: {
              ((dk) this).field_f = true;
              var13 = param0.a(false, param1, param2);
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(-110, new uia(var13));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= ((dk) this).field_l.length) {
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= ((dk) this).field_e.length) {
                    break L0;
                  } else {
                    L4: {
                      if (var6 >= ((dk) this).field_e[var7]) {
                        break L4;
                      } else {
                        var6 = ((dk) this).field_e[var7];
                        break L4;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              } else {
                L5: {
                  if (((dk) this).field_l[var6] <= var5) {
                    break L5;
                  } else {
                    var5 = ((dk) this).field_l[var6];
                    break L5;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4_ref;
            stackOut_14_1 = new StringBuilder().append("dk.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Despite his bank manager's despair, the previous occupant of the temple hid his cash in plain sight. Grab the coins for points.";
        field_a = "Lagoons of lava";
    }
}
