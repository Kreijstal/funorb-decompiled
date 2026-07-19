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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0 == -8) {
                break L1;
              } else {
                field_c = (String[]) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (lp.field_c.length <= var1_int) {
                    break L4;
                  } else {
                    op.field_c[0][var1_int] = lp.field_c[var1_int];
                    var1_int++;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var1_int = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  if (var1_int >= bn.field_a.length) {
                    break L6;
                  } else {
                    mn.field_k[76][var1_int] = bn.field_a[var1_int];
                    var1_int++;
                    if (var2 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var2 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "qb.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, vh param1, int param2) {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int[] array$14 = null;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_46_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_81_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (-2 == (param2 ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if (param2 == 2) {
                          break L5;
                        } else {
                          L6: {
                            if (param2 != 3) {
                              break L6;
                            } else {
                              var4_int = param1.k(0);
                              this.field_i = new int[1 + var4_int];
                              var5 = 0;
                              L7: while (true) {
                                L8: {
                                  if (var4_int <= var5) {
                                    this.field_i[var4_int] = 9999999;
                                    break L8;
                                  } else {
                                    this.field_i[var5] = param1.k(0);
                                    var5++;
                                    if (var8 != 0) {
                                      break L8;
                                    } else {
                                      continue L7;
                                    }
                                  }
                                }
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L9: {
                            if (param2 != 5) {
                              break L9;
                            } else {
                              discarded$9 = param1.k(param0 + 0);
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (-7 == (param2 ^ -1)) {
                              break L10;
                            } else {
                              L11: {
                                if ((param2 ^ -1) == -8) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (param2 == 8) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (9 != param2) {
                                          break L13;
                                        } else {
                                          discarded$10 = param1.k(0);
                                          if (var8 == 0) {
                                            break L3;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      L14: {
                                        if ((param2 ^ -1) == -11) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if ((param2 ^ -1) != -12) {
                                              break L15;
                                            } else {
                                              discarded$11 = param1.k(param0 ^ 0);
                                              if (var8 == 0) {
                                                break L3;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (-13 != (param2 ^ -1)) {
                                              break L16;
                                            } else {
                                              var4_int = param1.k(0);
                                              var5 = 0;
                                              L17: while (true) {
                                                L18: {
                                                  if (var5 >= var4_int) {
                                                    var5 = 0;
                                                    break L18;
                                                  } else {
                                                    discarded$12 = param1.e((byte) -104);
                                                    var5++;
                                                    if (var8 != 0) {
                                                      break L18;
                                                    } else {
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                                L19: while (true) {
                                                  if (var5 >= var4_int) {
                                                    if (var8 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L16;
                                                    }
                                                  } else {
                                                    discarded$13 = param1.e((byte) -104);
                                                    var5++;
                                                    if (var8 != 0) {
                                                      break L3;
                                                    } else {
                                                      continue L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (-14 == (param2 ^ -1)) {
                                            var4_int = param1.e((byte) -104);
                                            this.field_e = new int[var4_int][];
                                            var5 = 0;
                                            L20: while (true) {
                                              if (var4_int <= var5) {
                                                if (var8 == 0) {
                                                  break L3;
                                                } else {
                                                  break L14;
                                                }
                                              } else {
                                                var6 = param1.k(param0 + 0);
                                                stackOut_45_0 = var6;
                                                stackIn_82_0 = stackOut_45_0;
                                                stackIn_46_0 = stackOut_45_0;
                                                if (var8 != 0) {
                                                  break L2;
                                                } else {
                                                  L21: {
                                                    L22: {
                                                      if (stackIn_46_0 <= 0) {
                                                        break L22;
                                                      } else {
                                                        array$14 = new int[var6];
                                                        this.field_e[var5] = array$14;
                                                        this.field_e[var5][0] = param1.d((byte) -13);
                                                        var7 = 1;
                                                        L23: while (true) {
                                                          if (var7 >= var6) {
                                                            break L22;
                                                          } else {
                                                            this.field_e[var5][var7] = param1.e((byte) -104);
                                                            var7++;
                                                            if (var8 != 0) {
                                                              break L21;
                                                            } else {
                                                              continue L23;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var5++;
                                                    break L21;
                                                  }
                                                  continue L20;
                                                }
                                              }
                                            }
                                          } else {
                                            if (param2 == 14) {
                                              break L3;
                                            } else {
                                              if ((param2 ^ -1) == -16) {
                                                break L3;
                                              } else {
                                                if ((param2 ^ -1) != -17) {
                                                  if (-19 != (param2 ^ -1)) {
                                                    break L3;
                                                  } else {
                                                    break L3;
                                                  }
                                                } else {
                                                  break L3;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      discarded$15 = param1.k(param0 ^ 0);
                                      if (var8 == 0) {
                                        break L3;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  this.field_j = param1.k(0);
                                  this.field_b = false;
                                  if (var8 == 0) {
                                    break L3;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              discarded$16 = param1.e((byte) -104);
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L10;
                              }
                            }
                          }
                          discarded$17 = param1.e((byte) -104);
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_g = param1.e((byte) -104);
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4_int = param1.e((byte) -104);
                  this.field_d = new int[var4_int];
                  var5 = 0;
                  L24: while (true) {
                    L25: {
                      if (var4_int <= var5) {
                        this.field_a = new int[var4_int];
                        break L25;
                      } else {
                        this.field_d[var5] = param1.e((byte) -104);
                        var5++;
                        if (var8 != 0) {
                          break L25;
                        } else {
                          continue L24;
                        }
                      }
                    }
                    var5 = 0;
                    L26: while (true) {
                      L27: {
                        if (var5 >= var4_int) {
                          var5 = 0;
                          break L27;
                        } else {
                          this.field_a[var5] = param1.e((byte) -104);
                          var5++;
                          if (var8 != 0) {
                            break L27;
                          } else {
                            continue L26;
                          }
                        }
                      }
                      L28: while (true) {
                        if (var5 >= var4_int) {
                          break L3;
                        } else {
                          this.field_a[var5] = (param1.e((byte) -104) << -264541712) - -this.field_a[var5];
                          var5++;
                          if (var8 != 0) {
                            break L1;
                          } else {
                            continue L28;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_81_0 = param0;
                stackIn_82_0 = stackOut_81_0;
                break L2;
              }
              if (stackIn_82_0 == 0) {
                break L1;
              } else {
                this.field_a = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var4 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) (var4);
            stackOut_85_1 = new StringBuilder().append("qb.C(").append(param0).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param1 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L29;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L29;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param2 + ')');
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    var3_int = param1.k(0);
                    if (-1 != (var3_int ^ -1)) {
                      break L4;
                    } else {
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.a(0, param1, var3_int);
                  break L3;
                }
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
              L5: {
                if (param0 == 32737) {
                  break L5;
                } else {
                  field_k = (String) null;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("qb.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L6;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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
        RuntimeException runtimeException = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_j = 0;
        this.field_g = -1;
        try {
          L0: {
            L1: {
              this.field_b = true;
              var11 = param0.a((byte) 113, param2, param1);
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(32737, new vh(var11));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (this.field_a.length <= var6) {
                    break L4;
                  } else {
                    stackOut_5_0 = var5 ^ -1;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 <= (this.field_a[var6] ^ -1)) {
                          break L5;
                        } else {
                          var5 = this.field_a[var6];
                          break L5;
                        }
                      }
                      var6++;
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6 = 0;
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              }
              var7 = stackIn_10_0;
              L6: while (true) {
                L7: {
                  if (var7 >= this.field_d.length) {
                    break L7;
                  } else {
                    if (var8 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L8: {
                        if (this.field_d[var7] <= var6) {
                          break L8;
                        } else {
                          var6 = this.field_d[var7];
                          break L8;
                        }
                      }
                      var7++;
                      if (var8 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (runtimeException);
            stackOut_17_1 = new StringBuilder().append("qb.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L9;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_f = new int[]{4, 5, 6, 7, 8};
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_l = "Bolts";
        field_k = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
