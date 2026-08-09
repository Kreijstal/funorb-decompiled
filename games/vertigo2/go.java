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
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_3_0 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
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
              if (var7 >= this.field_e.length) {
                if (this.field_b > 0) {
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

    final static void b(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 >= 13) {
              var5 = oq.field_F;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              L1: while (true) {
                if (var2 >= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "go.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, ed param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ed var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.h(-11);
              if (0 != var3_int) {
                this.a(var3_int, param1, (byte) -121);
                continue L1;
              } else {
                L2: {
                  if (param0 >= 108) {
                    break L2;
                  } else {
                    var5 = (ed) null;
                    this.a(-60, (ed) null);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("go.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    private go(r param0, int param1, String param2) {
        this(param0, param1, param0.a(param1, param2, 111));
    }

    go(r param0, String param1, String param2) {
        this(param0, param0.a((byte) 122, param1), param2);
    }

    private final void a(int param0, ed param1, byte param2) {
        int[] array$0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 124 / ((param2 - 4) / 62);
              if (-2 == (param0 ^ -1)) {
                var5 = param1.a((byte) -11);
                this.field_e = new int[var5];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var5) {
                    this.field_c = new int[var5];
                    var6 = 0;
                    L3: while (true) {
                      if (var5 <= var6) {
                        var6 = 0;
                        L4: while (true) {
                          if (var6 >= var5) {
                            break L1;
                          } else {
                            this.field_c[var6] = (param1.a((byte) -11) << -533953584) - -this.field_c[var6];
                            var6++;
                            continue L4;
                          }
                        }
                      } else {
                        this.field_c[var6] = param1.a((byte) -11);
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_e[var6] = param1.a((byte) -11);
                    var6++;
                    continue L2;
                  }
                }
              } else {
                if (param0 == 2) {
                  this.field_b = param1.a((byte) -11);
                  break L1;
                } else {
                  if ((param0 ^ -1) == -4) {
                    var5 = param1.h(-11);
                    this.field_f = new int[1 + var5];
                    var6 = 0;
                    L5: while (true) {
                      if (var6 >= var5) {
                        this.field_f[var5] = 9999999;
                        break L1;
                      } else {
                        this.field_f[var6] = param1.h(-11);
                        var6++;
                        continue L5;
                      }
                    }
                  } else {
                    if (param0 == 5) {
                      param1.h(-11);
                      break L1;
                    } else {
                      if (-7 != (param0 ^ -1)) {
                        if (-8 == (param0 ^ -1)) {
                          param1.a((byte) -11);
                          break L1;
                        } else {
                          if (8 == param0) {
                            this.field_j = param1.h(-11);
                            this.field_a = false;
                            break L1;
                          } else {
                            if ((param0 ^ -1) != -10) {
                              if ((param0 ^ -1) != -11) {
                                if (11 != param0) {
                                  if (12 != param0) {
                                    if ((param0 ^ -1) == -14) {
                                      var5 = param1.a((byte) -11);
                                      this.field_i = new int[var5][];
                                      var6 = 0;
                                      L6: while (true) {
                                        if (var6 >= var5) {
                                          break L1;
                                        } else {
                                          L7: {
                                            var7 = param1.h(-11);
                                            if (0 < var7) {
                                              array$0 = new int[var7];
                                              this.field_i[var6] = array$0;
                                              this.field_i[var6][0] = param1.m(0);
                                              var8 = 1;
                                              L8: while (true) {
                                                if (var8 >= var7) {
                                                  break L7;
                                                } else {
                                                  this.field_i[var6][var8] = param1.a((byte) -11);
                                                  var8++;
                                                  continue L8;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          }
                                          var6++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      if (14 == param0) {
                                        break L1;
                                      } else {
                                        if ((param0 ^ -1) == -16) {
                                          break L1;
                                        } else {
                                          if ((param0 ^ -1) == -17) {
                                            break L1;
                                          } else {
                                            if (-19 == (param0 ^ -1)) {
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var5 = param1.h(-11);
                                    var6 = 0;
                                    L9: while (true) {
                                      if (var6 >= var5) {
                                        var6 = 0;
                                        L10: while (true) {
                                          if (var6 >= var5) {
                                            break L1;
                                          } else {
                                            param1.a((byte) -11);
                                            var6++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        param1.a((byte) -11);
                                        var6++;
                                        continue L9;
                                      }
                                    }
                                  }
                                } else {
                                  param1.h(-11);
                                  break L1;
                                }
                              } else {
                                param1.h(-11);
                                break L1;
                              }
                            } else {
                              param1.h(-11);
                              break L1;
                            }
                          }
                        }
                      } else {
                        param1.a((byte) -11);
                        break L1;
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
            stackIn_56_0 = (RuntimeException) (var4);

            stackIn_56_1 = new StringBuilder().append("go.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L11;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L11;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param2 + ')');
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
              this.field_a = true;
              var11 = param0.a(param1, param2, (byte) -79);
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(121, new ed(var11));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= this.field_c.length) {
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= this.field_e.length) {
                    break L0;
                  } else {
                    L4: {
                      if (this.field_e[var7] <= var6) {
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
                  if (var5 >= this.field_c[var6]) {
                    break L5;
                  } else {
                    var5 = this.field_c[var6];
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

            stackIn_16_1 = new StringBuilder().append("go.<init>(");

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
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Oh dear, you failed Co-op mode. Better luck next time.";
        field_h = 2;
    }
}
