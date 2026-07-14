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
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        while (true) {
            var3 = param1.h(255);
            if (var3 == 0) {
                break;
            }
            this.a(var3, param1, 16588);
        }
        if (param0 >= -89) {
            Object var5 = null;
            int discarded$0 = dk.a((dn) null, -51);
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
                if (-1 > (((dk) this).field_b ^ -1)) {
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param2 == 16588) {
          L0: {
            if (param0 != 1) {
              if (2 != param0) {
                if (param0 == 3) {
                  var4 = param1.h(param2 ^ 16435);
                  ((dk) this).field_d = new int[var4 - -1];
                  var5 = 0;
                  L1: while (true) {
                    if (var4 <= var5) {
                      ((dk) this).field_d[var4] = 9999999;
                      break L0;
                    } else {
                      ((dk) this).field_d[var5] = param1.h(255);
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  if (5 == param0) {
                    int discarded$8 = param1.h(255);
                    break L0;
                  } else {
                    if (6 == param0) {
                      int discarded$9 = param1.d(param2 ^ 16563);
                      break L0;
                    } else {
                      if (param0 == 7) {
                        int discarded$10 = param1.d(126);
                        break L0;
                      } else {
                        if (param0 == -9) {
                          ((dk) this).field_j = param1.h(255);
                          ((dk) this).field_f = false;
                          break L0;
                        } else {
                          if (9 != param0) {
                            if (-11 != param0) {
                              if (param0 != -12) {
                                if (12 == param0) {
                                  var4 = param1.h(255);
                                  var5 = 0;
                                  L2: while (true) {
                                    if (var5 >= var4) {
                                      var5 = 0;
                                      L3: while (true) {
                                        if (var4 <= var5) {
                                          break L0;
                                        } else {
                                          int discarded$11 = param1.d(121);
                                          var5++;
                                          continue L3;
                                        }
                                      }
                                    } else {
                                      int discarded$12 = param1.d(125);
                                      var5++;
                                      continue L2;
                                    }
                                  }
                                } else {
                                  if (-14 != param0) {
                                    if (-15 != param0) {
                                      if (-16 != param0) {
                                        if (param0 == 16) {
                                          break L0;
                                        } else {
                                          if (18 == param0) {
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      } else {
                                        ((dk) this).field_i = true;
                                        break L0;
                                      }
                                    } else {
                                      ((dk) this).field_h = true;
                                      break L0;
                                    }
                                  } else {
                                    var4 = param1.d(121);
                                    ((dk) this).field_g = new int[var4][];
                                    var5 = 0;
                                    L4: while (true) {
                                      if (var4 <= var5) {
                                        break L0;
                                      } else {
                                        var6 = param1.h(255);
                                        if (var6 > 0) {
                                          ((dk) this).field_g[var5] = new int[var6];
                                          ((dk) this).field_g[var5][0] = param1.a(-32768);
                                          var7 = 1;
                                          L5: while (true) {
                                            if (var7 < var6) {
                                              ((dk) this).field_g[var5][var7] = param1.d(123);
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
                                  }
                                }
                              } else {
                                int discarded$13 = param1.h(255);
                                break L0;
                              }
                            } else {
                              int discarded$14 = param1.h(255);
                              break L0;
                            }
                          } else {
                            int discarded$15 = param1.h(255);
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((dk) this).field_b = param1.d(122);
                break L0;
              }
            } else {
              var4 = param1.d(127);
              ((dk) this).field_e = new int[var4];
              var5 = 0;
              L6: while (true) {
                if (var5 >= var4) {
                  ((dk) this).field_l = new int[var4];
                  var5 = 0;
                  L7: while (true) {
                    if (var4 <= var5) {
                      var5 = 0;
                      L8: while (true) {
                        if (var4 <= var5) {
                          break L0;
                        } else {
                          ((dk) this).field_l[var5] = (param1.d(123) << 1872739824) - -((dk) this).field_l[var5];
                          var5++;
                          continue L8;
                        }
                      }
                    } else {
                      ((dk) this).field_l[var5] = param1.d(124);
                      var5++;
                      continue L7;
                    }
                  }
                } else {
                  ((dk) this).field_e[var5] = param1.d(121);
                  var5++;
                  continue L6;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static int a(dn param0, int param1) {
        if (param0 == lsa.field_c) {
          return 9216;
        } else {
          if (param0 != gd.field_H) {
            if (gq.field_u != param0) {
              if (param1 == 0) {
                throw new IllegalArgumentException();
              } else {
                return 21;
              }
            } else {
              return 34066;
            }
          } else {
            return 34065;
          }
        }
    }

    private dk(cn param0, int param1, int param2) {
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        L0: {
          ((dk) this).field_j = 0;
          ((dk) this).field_b = -1;
          ((dk) this).field_f = true;
          var11 = param0.a(false, param1, param2);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 == null) {
            break L0;
          } else {
            this.a(-110, new uia(var11));
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((dk) this).field_l.length) {
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((dk) this).field_e.length) {
              } else {
                if (var6 < ((dk) this).field_e[var7]) {
                  var6 = ((dk) this).field_e[var7];
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (((dk) this).field_l[var6] > var5) {
              var5 = ((dk) this).field_l[var6];
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
        field_k = "Despite his bank manager's despair, the previous occupant of the temple hid his cash in plain sight. Grab the coins for points.";
        field_a = "Lagoons of lava";
    }
}
