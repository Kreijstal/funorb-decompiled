/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    private int[][] field_e;
    private int[] field_i;
    static String[] field_c;
    int[] field_d;
    boolean field_b;
    int field_j;
    static int[] field_f;
    static np field_h;
    int[] field_a;
    static String field_k;
    static String field_l;
    int field_g;

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (lp.field_c.length <= var1_int) {
                var3 = 0;
                var1_int = var3;
                L2: while (true) {
                  if (var3 >= bn.field_a.length) {
                    break L0;
                  } else {
                    mn.field_k[76][var3] = bn.field_a[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                op.field_c[0][var1_int] = lp.field_c[var1_int];
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "qb.E(" + -8 + ')');
        }
    }

    private final void a(int param0, vh param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                var4_int = param1.e((byte) -104);
                ((qb) this).field_d = new int[var4_int];
                var5 = 0;
                L2: while (true) {
                  if (var4_int <= var5) {
                    ((qb) this).field_a = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (~var5 <= ~var4_int) {
                        var5 = 0;
                        L4: while (true) {
                          if (~var5 <= ~var4_int) {
                            break L1;
                          } else {
                            ((qb) this).field_a[var5] = (param1.e((byte) -104) << 16) - -((qb) this).field_a[var5];
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        ((qb) this).field_a[var5] = param1.e((byte) -104);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((qb) this).field_d[var5] = param1.e((byte) -104);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (param2 == 2) {
                  ((qb) this).field_g = param1.e((byte) -104);
                  break L1;
                } else {
                  if (param2 != 3) {
                    if (param2 != 5) {
                      if (param2 == 6) {
                        int discarded$8 = param1.e((byte) -104);
                        break L1;
                      } else {
                        if (param2 == 7) {
                          int discarded$9 = param1.e((byte) -104);
                          break L1;
                        } else {
                          if (param2 == 8) {
                            ((qb) this).field_j = param1.k(0);
                            ((qb) this).field_b = false;
                            break L1;
                          } else {
                            if (9 != param2) {
                              if (param2 == 10) {
                                int discarded$10 = param1.k(0);
                                break L1;
                              } else {
                                if (param2 != 11) {
                                  if (param2 != 12) {
                                    if (param2 == 13) {
                                      var4_int = param1.e((byte) -104);
                                      ((qb) this).field_e = new int[var4_int][];
                                      var5 = 0;
                                      L5: while (true) {
                                        if (var4_int <= var5) {
                                          break L1;
                                        } else {
                                          L6: {
                                            var6 = param1.k(0);
                                            if (var6 <= 0) {
                                              break L6;
                                            } else {
                                              ((qb) this).field_e[var5] = new int[var6];
                                              ((qb) this).field_e[var5][0] = param1.d((byte) -13);
                                              var7 = 1;
                                              L7: while (true) {
                                                if (~var7 <= ~var6) {
                                                  break L6;
                                                } else {
                                                  ((qb) this).field_e[var5][var7] = param1.e((byte) -104);
                                                  var7++;
                                                  continue L7;
                                                }
                                              }
                                            }
                                          }
                                          var5++;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      if (param2 == 14) {
                                        break L1;
                                      } else {
                                        if (param2 == 15) {
                                          break L1;
                                        } else {
                                          if (param2 != 16) {
                                            if (param2 != 18) {
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var4_int = param1.k(0);
                                    var5 = 0;
                                    L8: while (true) {
                                      if (var5 >= var4_int) {
                                        var5 = 0;
                                        L9: while (true) {
                                          if (var5 >= var4_int) {
                                            break L1;
                                          } else {
                                            int discarded$11 = param1.e((byte) -104);
                                            var5++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        int discarded$12 = param1.e((byte) -104);
                                        var5++;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  int discarded$13 = param1.k(0);
                                  break L1;
                                }
                              }
                            } else {
                              int discarded$14 = param1.k(0);
                              break L1;
                            }
                          }
                        }
                      }
                    } else {
                      int discarded$15 = param1.k(0);
                      break L1;
                    }
                  } else {
                    var4_int = param1.k(0);
                    ((qb) this).field_i = new int[1 + var4_int];
                    var5 = 0;
                    L10: while (true) {
                      if (~var4_int >= ~var5) {
                        ((qb) this).field_i[var4_int] = 9999999;
                        break L1;
                      } else {
                        ((qb) this).field_i[var5] = param1.k(0);
                        var5++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var4;
            stackOut_56_1 = new StringBuilder().append("qb.C(").append(0).append(',');
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L11;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L11;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ',' + param2 + ')');
        }
    }

    private qb(kl param0, int param1, String param2) {
        this(param0, param1, param0.a((byte) 28, param1, param2));
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + tq.field_c) / 2;
        int var4 = -54 / ((33 - param1) / 47);
        int var3 = mj.field_c * mj.field_c;
        int var5 = -(param0 * param0) + var3;
        lk.field_a.a(-90 + (-120 + (qn.field_g + -4)), -20500, 199, 90, -(199 * var5 / var3) + var2);
        pd.field_c.a(qn.field_g - 124, -20500, 438, 0, 202 + var2 - -(438 * var5 / var3));
    }

    private final void a(int param0, vh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.k(0);
              if (var3_int != 0) {
                this.a(0, param1, var3_int);
                continue L1;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("qb.B(").append(32737).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 >= -18) {
            return;
        }
        field_l = null;
        field_h = null;
        field_f = null;
        field_c = null;
    }

    qb(kl param0, String param1, String param2) {
        this(param0, param0.a(param1, 122), param2);
    }

    private qb(kl param0, int param1, int param2) {
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
        ((qb) this).field_j = 0;
        ((qb) this).field_g = -1;
        try {
          L0: {
            L1: {
              ((qb) this).field_b = true;
              var13 = param0.a((byte) 113, param2, param1);
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(32737, new vh(var13));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (((qb) this).field_a.length <= var6) {
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= ((qb) this).field_d.length) {
                    break L0;
                  } else {
                    L4: {
                      if (((qb) this).field_d[var7] <= var6) {
                        break L4;
                      } else {
                        var6 = ((qb) this).field_d[var7];
                        break L4;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              } else {
                L5: {
                  if (var5 >= ((qb) this).field_a[var6]) {
                    break L5;
                  } else {
                    var5 = ((qb) this).field_a[var6];
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
            stackOut_14_1 = new StringBuilder().append("qb.<init>(");
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
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{4, 5, 6, 7, 8};
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_l = "Bolts";
        field_k = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
