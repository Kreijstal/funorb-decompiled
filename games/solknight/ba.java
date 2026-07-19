/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ec {
    private int[][] field_q;
    static String field_o;
    static String field_r;
    private String[] field_p;
    static String[] field_s;
    int[] field_n;
    private int[] field_m;

    final void a(gb param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ba.f(1);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.j(255);
              if (var3_int == 0) {
                break L0;
              } else {
                this.a(var3_int, param0, 0);
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ba.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, gb param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ff var7 = null;
        int var8 = 0;
        int var9 = 0;
        gb var10 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 == param0) {
                this.field_p = b.a(param1.h(72), '<', true);
                break L1;
              } else {
                L2: {
                  if (param0 != 2) {
                    break L2;
                  } else {
                    var4_int = param1.j(255);
                    this.field_n = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        this.field_n[var5] = param1.i(-108);
                        var5++;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if ((param0 ^ -1) != -4) {
                    break L4;
                  } else {
                    var4_int = param1.j(param2 + 255);
                    this.field_q = new int[var4_int][];
                    this.field_m = new int[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var4_int) {
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        var6 = param1.i(38);
                        var7 = uf.a(var6, (byte) -121);
                        if (var9 != 0) {
                          break L1;
                        } else {
                          L6: {
                            L7: {
                              if (var7 == null) {
                                break L7;
                              } else {
                                this.field_m[var5] = var6;
                                array$1 = new int[var7.field_c];
                                this.field_q[var5] = array$1;
                                var8 = 0;
                                L8: while (true) {
                                  if (var8 >= var7.field_c) {
                                    break L7;
                                  } else {
                                    this.field_q[var5][var8] = param1.i(-122);
                                    var8++;
                                    if (var9 != 0) {
                                      break L6;
                                    } else {
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var5++;
                            break L6;
                          }
                          continue L5;
                        }
                      }
                    }
                  }
                }
                if ((param0 ^ -1) == -5) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L9: {
              if (param2 == 0) {
                break L9;
              } else {
                var10 = (gb) null;
                this.a((gb) null, true);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("ba.D(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    final String a(byte param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_9_0 = null;
        L0: {
          var4 = SolKnight.field_L ? 1 : 0;
          if (param0 >= 93) {
            break L0;
          } else {
            this.g(41);
            break L0;
          }
        }
        var5 = new StringBuilder(80);
        var2 = var5;
        if (null != this.field_p) {
          discarded$6 = var5.append(this.field_p[0]);
          var3 = 1;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_p.length <= var3) {
                  break L3;
                } else {
                  discarded$7 = var2.append("...");
                  stackOut_6_0 = var5.append(this.field_p[var3]);
                  stackIn_10_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_9_0 = (StringBuilder) (var2);
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            return ((StringBuilder) (Object) stackIn_10_0).toString();
          }
        } else {
          return "";
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 > 33) {
          L0: {
            if (this.field_n == null) {
              break L0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= this.field_n.length) {
                  break L0;
                } else {
                  this.field_n[var2] = qk.a(this.field_n[var2], 32768);
                  var2++;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 < 6) {
            field_o = (String) null;
        }
        field_r = null;
        field_s = null;
    }

    ba() {
    }

    static {
        field_o = null;
        field_r = "You are not currently logged in to the<nbsp>game.";
    }
}
