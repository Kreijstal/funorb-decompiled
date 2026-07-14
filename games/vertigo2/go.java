/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    boolean field_a;
    private int[][] field_i;
    private int[] field_f;
    static int field_h;
    int[] field_c;
    int[] field_e;
    static String field_d;
    static String field_g;
    int field_j;
    int field_b;

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
          var8 = Vertigo2.field_L ? 1 : 0;
          var3 = 0;
          var4 = 0;
          if (param1) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((go) this).field_j;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 <= -114) {
            break L1;
          } else {
            go.b(-19);
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
              if (var7 >= ((go) this).field_e.length) {
                if (((go) this).field_b > 0) {
                  var4 = ((go) this).field_b;
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
              } else {
                var3 = var3 + ((go) this).field_e[var7];
                var7++;
                continue L3;
              }
            }
          }
        }
    }

    final static void b(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 < 13) {
            return;
        }
        int[] var5 = oq.field_F;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    private final void a(int param0, ed param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        L0: while (true) {
          var3 = param1.h(-11);
          if (0 != var3) {
            this.a(var3, param1, (byte) -121);
            continue L0;
          } else {
            L1: {
              if (param0 >= 108) {
                break L1;
              } else {
                var5 = null;
                this.a(-60, (ed) null);
                break L1;
              }
            }
            return;
          }
        }
    }

    private go(r param0, int param1, String param2) {
        this(param0, param1, param0.a(param1, param2, 111));
    }

    go(r param0, String param1, String param2) {
        this(param0, param0.a((byte) 122, param1), param2);
    }

    private final void a(int param0, ed param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          var4 = 124 / ((param2 - 4) / 62);
          if (-2 == (param0 ^ -1)) {
            var5 = param1.a((byte) -11);
            ((go) this).field_e = new int[var5];
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5) {
                ((go) this).field_c = new int[var5];
                var6 = 0;
                L2: while (true) {
                  if (var5 <= var6) {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= var5) {
                        break L0;
                      } else {
                        ((go) this).field_c[var6] = (param1.a((byte) -11) << -533953584) - -((go) this).field_c[var6];
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    ((go) this).field_c[var6] = param1.a((byte) -11);
                    var6++;
                    continue L2;
                  }
                }
              } else {
                ((go) this).field_e[var6] = param1.a((byte) -11);
                var6++;
                continue L1;
              }
            }
          } else {
            if (param0 == 2) {
              ((go) this).field_b = param1.a((byte) -11);
              break L0;
            } else {
              if (param0 == -4) {
                var5 = param1.h(-11);
                ((go) this).field_f = new int[1 + var5];
                var6 = 0;
                L4: while (true) {
                  if (var6 >= var5) {
                    ((go) this).field_f[var5] = 9999999;
                    break L0;
                  } else {
                    ((go) this).field_f[var6] = param1.h(-11);
                    var6++;
                    continue L4;
                  }
                }
              } else {
                if (param0 == 5) {
                  int discarded$8 = param1.h(-11);
                  break L0;
                } else {
                  if (-7 != param0) {
                    if (-8 == (param0 ^ -1)) {
                      int discarded$9 = param1.a((byte) -11);
                      break L0;
                    } else {
                      if (8 == param0) {
                        ((go) this).field_j = param1.h(-11);
                        ((go) this).field_a = false;
                        break L0;
                      } else {
                        if ((param0 ^ -1) != -10) {
                          if ((param0 ^ -1) != -11) {
                            if (11 != param0) {
                              if (12 != param0) {
                                if ((param0 ^ -1) == -14) {
                                  var5 = param1.a((byte) -11);
                                  ((go) this).field_i = new int[var5][];
                                  var6 = 0;
                                  L5: while (true) {
                                    if (var6 >= var5) {
                                      break L0;
                                    } else {
                                      var7 = param1.h(-11);
                                      if (0 < var7) {
                                        ((go) this).field_i[var6] = new int[var7];
                                        ((go) this).field_i[var6][0] = param1.m(0);
                                        var8 = 1;
                                        L6: while (true) {
                                          if (var8 < var7) {
                                            ((go) this).field_i[var6][var8] = param1.a((byte) -11);
                                            var8++;
                                            continue L6;
                                          } else {
                                            var6++;
                                            continue L5;
                                          }
                                        }
                                      } else {
                                        var6++;
                                        continue L5;
                                      }
                                    }
                                  }
                                } else {
                                  if (14 == param0) {
                                    break L0;
                                  } else {
                                    if ((param0 ^ -1) == -16) {
                                      break L0;
                                    } else {
                                      if (param0 == -17) {
                                        break L0;
                                      } else {
                                        if (-19 == param0) {
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var5 = param1.h(-11);
                                var6 = 0;
                                L7: while (true) {
                                  if (var6 >= var5) {
                                    var6 = 0;
                                    L8: while (true) {
                                      if (var6 >= var5) {
                                        break L0;
                                      } else {
                                        int discarded$10 = param1.a((byte) -11);
                                        var6++;
                                        continue L8;
                                      }
                                    }
                                  } else {
                                    int discarded$11 = param1.a((byte) -11);
                                    var6++;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              int discarded$12 = param1.h(-11);
                              break L0;
                            }
                          } else {
                            int discarded$13 = param1.h(-11);
                            break L0;
                          }
                        } else {
                          int discarded$14 = param1.h(-11);
                          break L0;
                        }
                      }
                    }
                  } else {
                    int discarded$15 = param1.a((byte) -11);
                    break L0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = 40 % ((param0 - -63) / 61);
        field_g = null;
    }

    private go(r param0, int param1, int param2) {
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        L0: {
          ((go) this).field_j = 0;
          ((go) this).field_b = -1;
          ((go) this).field_a = true;
          var11 = param0.a(param1, param2, (byte) -79);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 == null) {
            break L0;
          } else {
            this.a(121, new ed(var11));
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((go) this).field_c.length) {
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((go) this).field_e.length) {
              } else {
                if (((go) this).field_e[var7] > var6) {
                  var6 = ((go) this).field_e[var7];
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (var5 < ((go) this).field_c[var6]) {
              var5 = ((go) this).field_c[var6];
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
        field_d = "Oh dear, you failed Co-op mode. Better luck next time.";
        field_h = 2;
    }
}
