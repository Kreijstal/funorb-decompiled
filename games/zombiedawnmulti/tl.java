/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends qa {
    static ld field_t;
    static int field_v;
    private int[][] field_s;
    int[] field_r;
    private String[] field_u;
    private int[] field_q;

    final static boolean d(byte param0) {
        if (param0 != -20) {
            field_v = 88;
        }
        return pd.a(jj.field_M, ql.field_a, param0 + 22);
    }

    final void a(k param0, byte param1) {
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
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    var3_int = param0.g(31365);
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
                  this.a(88, param0, var3_int);
                  break L3;
                }
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
              L5: {
                if (param1 == 118) {
                  break L5;
                } else {
                  field_v = -62;
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
            stackOut_10_1 = new StringBuilder().append("tl.I(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            if (this.field_r != null) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_r.length) {
                  break L1;
                } else {
                  this.field_r[var2] = cr.b(this.field_r[var2], 32768);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 > 98) {
            break L0;
          } else {
            this.field_u = (String[]) null;
            break L0;
          }
        }
    }

    final String e(int param0) {
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_9_0 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = new StringBuilder(80);
        var2 = var5;
        if (this.field_u != null) {
          discarded$14 = var5.append(this.field_u[0]);
          if (param0 == -18572) {
            var3 = 1;
            L0: while (true) {
              L1: {
                L2: {
                  if (var3 >= this.field_u.length) {
                    break L2;
                  } else {
                    discarded$15 = var2.append("...");
                    stackOut_6_0 = var5.append(this.field_u[var3]);
                    stackIn_10_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      var3++;
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_9_0 = (StringBuilder) (var2);
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              return ((StringBuilder) (Object) stackIn_10_0).toString();
            }
          } else {
            return (String) null;
          }
        } else {
          return "";
        }
    }

    private final void a(int param0, k param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ao var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 3 / ((param0 - -33) / 46);
                if (-2 != (param2 ^ -1)) {
                  break L2;
                } else {
                  this.field_u = mk.a('<', false, param1.f((byte) -62));
                  if (var10 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (2 == param2) {
                var5 = param1.g(31365);
                this.field_r = new int[var5];
                var6 = 0;
                L3: while (true) {
                  if (var6 >= var5) {
                    break L1;
                  } else {
                    this.field_r[var6] = param1.d((byte) 69);
                    var6++;
                    if (var10 != 0) {
                      break L1;
                    } else {
                      continue L3;
                    }
                  }
                }
              } else {
                L4: {
                  if (-4 != (param2 ^ -1)) {
                    break L4;
                  } else {
                    var5 = param1.g(31365);
                    this.field_s = new int[var5][];
                    this.field_q = new int[var5];
                    var6 = 0;
                    L5: while (true) {
                      if (var6 >= var5) {
                        if (var10 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        var7 = param1.d((byte) 69);
                        var8 = r.a(var7, (byte) 35);
                        if (var10 != 0) {
                          break L1;
                        } else {
                          L6: {
                            L7: {
                              if (var8 != null) {
                                this.field_q[var6] = var7;
                                array$1 = new int[var8.field_f];
                                this.field_s[var6] = array$1;
                                var9 = 0;
                                L8: while (true) {
                                  if (var8.field_f <= var9) {
                                    break L7;
                                  } else {
                                    this.field_s[var6][var9] = param1.d((byte) 69);
                                    var9++;
                                    if (var10 != 0) {
                                      break L6;
                                    } else {
                                      if (var10 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            var6++;
                            break L6;
                          }
                          continue L5;
                        }
                      }
                    }
                  }
                }
                if ((param2 ^ -1) != -5) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("tl.M(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, ga param2, int param3, int param4, int param5) {
        if (!(!op.field_m.field_c)) {
            return;
        }
        if (df.field_I) {
            cf.field_s.a(param4, param0, 0, param3, 3, param5);
            return;
        }
        try {
            param2.b((byte) -35, 65);
            param2.a(param1 ^ -102, param0);
            param2.a(param5, (byte) -45);
            if (param1 != -11) {
                ga var7 = (ga) null;
                tl.a(-103, (byte) 41, (ga) null, -22, 121, -61);
            }
            param2.a(param3, (byte) -110);
            param2.a(param4, (byte) -64);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "tl.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        if (param0 != 32768) {
            field_t = (ld) null;
        }
    }

    tl() {
    }

    static {
        field_v = 65;
    }
}
