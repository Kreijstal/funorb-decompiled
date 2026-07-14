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
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var1 = 0;
        if (param0 != -8) {
            field_c = null;
        }
        while (lp.field_c.length > var1) {
            op.field_c[0][var1] = lp.field_c[var1];
            var1++;
        }
        int var3 = 0;
        var1 = var3;
        while (var3 < bn.field_a.length) {
            mn.field_k[76][var3] = bn.field_a[var3];
            var3++;
        }
    }

    private final void a(int param0, vh param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-2 == (param2 ^ -1)) {
            var4 = param1.e((byte) -104);
            ((qb) this).field_d = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                ((qb) this).field_a = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4) {
                        break L0;
                      } else {
                        ((qb) this).field_a[var5] = (param1.e((byte) -104) << -264541712) - -((qb) this).field_a[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((qb) this).field_a[var5] = param1.e((byte) -104);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ((qb) this).field_d[var5] = param1.e((byte) -104);
                var5++;
                continue L1;
              }
            }
          } else {
            if (param2 == 2) {
              ((qb) this).field_g = param1.e((byte) -104);
              break L0;
            } else {
              if (param2 != 3) {
                if (param2 != 5) {
                  if (-7 == (param2 ^ -1)) {
                    int discarded$8 = param1.e((byte) -104);
                    break L0;
                  } else {
                    if ((param2 ^ -1) == -8) {
                      int discarded$9 = param1.e((byte) -104);
                      break L0;
                    } else {
                      if (param2 == 8) {
                        ((qb) this).field_j = param1.k(0);
                        ((qb) this).field_b = false;
                        break L0;
                      } else {
                        if (9 != param2) {
                          if ((param2 ^ -1) == -11) {
                            int discarded$10 = param1.k(param0 ^ 0);
                            break L0;
                          } else {
                            if (param2 != -12) {
                              if (-13 != param2) {
                                if (-14 == (param2 ^ -1)) {
                                  var4 = param1.e((byte) -104);
                                  ((qb) this).field_e = new int[var4][];
                                  var5 = 0;
                                  L4: while (true) {
                                    if (var4 <= var5) {
                                      break L0;
                                    } else {
                                      var6 = param1.k(param0 + 0);
                                      if (var6 > 0) {
                                        ((qb) this).field_e[var5] = new int[var6];
                                        ((qb) this).field_e[var5][0] = param1.d((byte) -13);
                                        var7 = 1;
                                        L5: while (true) {
                                          if (var7 < var6) {
                                            ((qb) this).field_e[var5][var7] = param1.e((byte) -104);
                                            var7++;
                                            continue L5;
                                          } else {
                                            var5++;
                                            continue L4;
                                          }
                                        }
                                      } else {
                                        var5++;
                                        continue L4;
                                      }
                                    }
                                  }
                                } else {
                                  if (param2 == 14) {
                                    break L0;
                                  } else {
                                    if ((param2 ^ -1) == -16) {
                                      break L0;
                                    } else {
                                      if (param2 != -17) {
                                        if (-19 != param2) {
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      } else {
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var4 = param1.k(0);
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= var4) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (var5 >= var4) {
                                        break L0;
                                      } else {
                                        int discarded$11 = param1.e((byte) -104);
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    int discarded$12 = param1.e((byte) -104);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              int discarded$13 = param1.k(param0 ^ 0);
                              break L0;
                            }
                          }
                        } else {
                          int discarded$14 = param1.k(0);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  int discarded$15 = param1.k(param0 + 0);
                  break L0;
                }
              } else {
                var4 = param1.k(0);
                ((qb) this).field_i = new int[1 + var4];
                var5 = 0;
                L8: while (true) {
                  if (var4 <= var5) {
                    ((qb) this).field_i[var4] = 9999999;
                    break L0;
                  } else {
                    ((qb) this).field_i[var5] = param1.k(0);
                    var5++;
                    continue L8;
                  }
                }
              }
            }
          }
        }
        L9: {
          if (param0 == 0) {
            break L9;
          } else {
            ((qb) this).field_a = null;
            break L9;
          }
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
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        L0: while (true) {
          var3 = param1.k(0);
          if (-1 != (var3 ^ -1)) {
            this.a(0, param1, var3);
            continue L0;
          } else {
            L1: {
              if (param0 == 32737) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            return;
          }
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        L0: {
          ((qb) this).field_j = 0;
          ((qb) this).field_g = -1;
          ((qb) this).field_b = true;
          var11 = param0.a((byte) 113, param2, param1);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 == null) {
            break L0;
          } else {
            this.a(32737, new vh(var11));
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (((qb) this).field_a.length <= var6) {
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((qb) this).field_d.length) {
              } else {
                if (((qb) this).field_d[var7] > var6) {
                  var6 = ((qb) this).field_d[var7];
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (var5 < ((qb) this).field_a[var6]) {
              var5 = ((qb) this).field_a[var6];
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
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
