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
        int var4 = 0;
        dn var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.h(255);
              if (var3_int == 0) {
                L2: {
                  if (param0 < -89) {
                    break L2;
                  } else {
                    var5 = (dn) null;
                    dk.a((dn) null, -51);
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a(var3_int, param1, 16588);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("dk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_3_0 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          var4 = 0;
          if (param1) {
            stackIn_3_0 = 1;
            break L0;
          } else {
            stackIn_3_0 = this.field_j;
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
              if (var7 >= this.field_e.length) {
                if (-1 > (this.field_b ^ -1)) {
                  var4 = this.field_b;
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
              } else {
                var3 = var3 + this.field_e[var7];
                var7++;
                continue L3;
              }
            }
          }
        }
    }

    private final void a(int param0, uia param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == 16588) {
              L1: {
                L2: {
                  if (param0 != 1) {
                    if (2 != param0) {
                      if (param0 == 3) {
                        var4_int = param1.h(param2 ^ 16435);
                        this.field_d = new int[var4_int - -1];
                        var5 = 0;
                        L3: while (true) {
                          if (var4_int <= var5) {
                            this.field_d[var4_int] = 9999999;
                            break L2;
                          } else {
                            this.field_d[var5] = param1.h(255);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        if (5 == param0) {
                          param1.h(255);
                          break L1;
                        } else {
                          if (6 == param0) {
                            param1.d(param2 ^ 16563);
                            break L1;
                          } else {
                            if (param0 == 7) {
                              param1.d(126);
                              break L1;
                            } else {
                              if ((param0 ^ -1) == -9) {
                                this.field_j = param1.h(255);
                                this.field_f = false;
                                break L1;
                              } else {
                                if (9 != param0) {
                                  if (-11 != (param0 ^ -1)) {
                                    if ((param0 ^ -1) != -12) {
                                      if (12 == param0) {
                                        var4_int = param1.h(255);
                                        var5 = 0;
                                        L4: while (true) {
                                          if (var5 >= var4_int) {
                                            var5 = 0;
                                            L5: while (true) {
                                              if (var4_int <= var5) {
                                                break L2;
                                              } else {
                                                param1.d(121);
                                                var5++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            param1.d(125);
                                            var5++;
                                            continue L4;
                                          }
                                        }
                                      } else {
                                        if (-14 != (param0 ^ -1)) {
                                          if (-15 != (param0 ^ -1)) {
                                            if (-16 != (param0 ^ -1)) {
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
                                              this.field_i = true;
                                              break L1;
                                            }
                                          } else {
                                            this.field_h = true;
                                            break L1;
                                          }
                                        } else {
                                          var4_int = param1.d(121);
                                          this.field_g = new int[var4_int][];
                                          var5 = 0;
                                          L6: while (true) {
                                            if (var4_int <= var5) {
                                              break L2;
                                            } else {
                                              L7: {
                                                var6 = param1.h(255);
                                                if (var6 <= 0) {
                                                  break L7;
                                                } else {
                                                  array$0 = new int[var6];
                                                  this.field_g[var5] = array$0;
                                                  this.field_g[var5][0] = param1.a(-32768);
                                                  var7 = 1;
                                                  L8: while (true) {
                                                    if (var7 >= var6) {
                                                      break L7;
                                                    } else {
                                                      this.field_g[var5][var7] = param1.d(123);
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
                                      param1.h(255);
                                      break L1;
                                    }
                                  } else {
                                    param1.h(255);
                                    break L1;
                                  }
                                } else {
                                  param1.h(255);
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      this.field_b = param1.d(122);
                      break L1;
                    }
                  } else {
                    var4_int = param1.d(127);
                    this.field_e = new int[var4_int];
                    var5 = 0;
                    L9: while (true) {
                      if (var5 >= var4_int) {
                        this.field_l = new int[var4_int];
                        var5 = 0;
                        L10: while (true) {
                          if (var4_int <= var5) {
                            var5 = 0;
                            L11: while (true) {
                              if (var4_int <= var5) {
                                break L2;
                              } else {
                                this.field_l[var5] = (param1.d(123) << 1872739824) - -this.field_l[var5];
                                var5++;
                                continue L11;
                              }
                            }
                          } else {
                            this.field_l[var5] = param1.d(124);
                            var5++;
                            continue L10;
                          }
                        }
                      } else {
                        this.field_e[var5] = param1.d(121);
                        var5++;
                        continue L9;
                      }
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var4);

            stackIn_59_1 = new StringBuilder().append("dk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L12;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(dn param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == lsa.field_c) {
              stackIn_8_0 = 9216;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param0 != gd.field_H) {
                if (gq.field_u != param0) {
                  if (param1 == 0) {
                    throw new IllegalArgumentException();
                  } else {
                    stackIn_11_0 = 21;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_6_0 = 34066;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_3_0 = 34065;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("dk.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_11_0;
            }
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        this.field_j = 0;
        this.field_b = -1;
        try {
          L0: {
            L1: {
              this.field_f = true;
              var11 = param0.a(false, param1, param2);
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(-110, new uia(var11));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= this.field_l.length) {
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= this.field_e.length) {
                    break L0;
                  } else {
                    L4: {
                      if (var6 >= this.field_e[var7]) {
                        break L4;
                      } else {
                        var6 = this.field_e[var7];
                        break L4;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              } else {
                L5: {
                  if (this.field_l[var6] <= var5) {
                    break L5;
                  } else {
                    var5 = this.field_l[var6];
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
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("dk.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = "Despite his bank manager's despair, the previous occupant of the temple hid his cash in plain sight. Grab the coins for points.";
        field_a = "Lagoons of lava";
    }
}
