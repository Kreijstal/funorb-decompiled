/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private int field_e;
    private int[] field_b;
    private int field_f;
    static int field_h;
    private boolean field_a;
    static boolean field_d;
    static int[][] field_c;
    static ib field_j;
    static int[] field_i;
    static int[] field_g;

    private final void a(int param0, int param1) {
        int discarded$0 = 1;
        int[] var4 = new int[this.b(param0)];
        int[] var3 = var4;
        he.a(((m) this).field_b, 0, var4, 0, ((m) this).field_b.length);
        ((m) this).field_b = var4;
    }

    final int a(boolean param0) {
        if (param0) {
            ((m) this).field_b = null;
        }
        return ((m) this).field_f + 1;
    }

    final void b(int param0, byte param1) {
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (((m) this).field_f < param0) {
              break L0;
            } else {
              L1: {
                if (((m) this).field_f == param0) {
                  break L1;
                } else {
                  he.a(((m) this).field_b, param0 + 1, ((m) this).field_b, param0, -param0 + ((m) this).field_f);
                  break L1;
                }
              }
              L2: {
                ((m) this).field_f = ((m) this).field_f - 1;
                if (param1 == -116) {
                  break L2;
                } else {
                  int discarded$2 = ((m) this).a(true);
                  break L2;
                }
              }
              return;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        h var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        String stackIn_22_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_31_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        h stackIn_42_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_30_0 = null;
        String stackOut_29_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        h stackOut_41_0 = null;
        h stackOut_40_0 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = jl.field_e;
              var2 = 0;
              if (nd.field_c == 2) {
                var3_long = ol.a(256) + -fd.field_e;
                var2 = (int)((10999L - var3_long) / 1000L);
                if (0 <= var2) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~var3 <= ~gf.field_s.length) {
                L3: {
                  if (param0 >= 12) {
                    break L3;
                  } else {
                    field_j = null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var4 = dl.field_s[var3];
                  if (var4 < 0) {
                    var5 = qa.field_f;
                    break L4;
                  } else {
                    if (ui.field_c.field_j != var4) {
                      var5 = ai.field_d;
                      break L4;
                    } else {
                      var5 = lg.field_f;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = gf.field_s[var3];
                  if (nd.field_c != 2) {
                    break L5;
                  } else {
                    if (var2 != 1) {
                      break L5;
                    } else {
                      L6: {
                        if (qb.field_c.length > ji.field_n.length) {
                          stackOut_16_0 = qb.field_c.length;
                          stackIn_17_0 = stackOut_16_0;
                          break L6;
                        } else {
                          stackOut_15_0 = ji.field_n.length;
                          stackIn_17_0 = stackOut_15_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_17_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (~var3 <= ~(6 + var7)) {
                            break L7;
                          } else {
                            L8: {
                              if (ji.field_n.length + -6 + (var3 - var7) >= 0) {
                                stackOut_21_0 = ji.field_n[ji.field_n.length + (var3 - 6 - var7)];
                                stackIn_22_0 = stackOut_21_0;
                                break L8;
                              } else {
                                stackOut_20_0 = "";
                                stackIn_22_0 = stackOut_20_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_22_0;
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (qi.field_b.length > jl.field_c.length) {
                          stackOut_25_0 = qi.field_b.length;
                          stackIn_26_0 = stackOut_25_0;
                          break L9;
                        } else {
                          stackOut_24_0 = jl.field_c.length;
                          stackIn_26_0 = stackOut_24_0;
                          break L9;
                        }
                      }
                      var8 = stackIn_26_0;
                      if (var3 < 7 - -var7) {
                        break L5;
                      } else {
                        if (var3 >= var8 + var7 + 7) {
                          break L5;
                        } else {
                          L10: {
                            if (~(-var7 + (var3 - 7)) > ~jl.field_c.length) {
                              stackOut_30_0 = jl.field_c[-var7 + (-7 + var3)];
                              stackIn_31_0 = stackOut_30_0;
                              break L10;
                            } else {
                              stackOut_29_0 = "";
                              stackIn_31_0 = stackOut_29_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_31_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (var4 != -2) {
                    break L11;
                  } else {
                    var6 = Integer.toString(var2);
                    break L11;
                  }
                }
                L12: {
                  stackOut_34_0 = -18;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_35_0 = stackOut_34_0;
                  if (var4 < 0) {
                    stackOut_36_0 = stackIn_36_0;
                    stackOut_36_1 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L12;
                  } else {
                    stackOut_35_0 = stackIn_35_0;
                    stackOut_35_1 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    break L12;
                  }
                }
                L13: {
                  var7 = ki.a((byte) stackIn_37_0, stackIn_37_1 != 0, var6);
                  var8 = -(var7 >> 1) + dg.field_ab;
                  if (var4 >= 0) {
                    L14: {
                      var1_int = var1_int + uc.field_Y;
                      if (~var4 != ~ui.field_c.field_j) {
                        stackOut_41_0 = tf.field_f;
                        stackIn_42_0 = stackOut_41_0;
                        break L14;
                      } else {
                        stackOut_40_0 = kk.field_e;
                        stackIn_42_0 = stackOut_40_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_42_0;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(sl.field_f + (ai.field_a << 1), var1_int, -1, -ni.field_i + var8, (ni.field_i << 1) + var7);
                        break L15;
                      }
                    }
                    var1_int = var1_int + ai.field_a;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (var4 >= 0) {
                    ec.field_c.c(var6, var8, re.field_A + var1_int, var5, -1);
                    var1_int = var1_int + (sl.field_f + (ai.field_a + uc.field_Y));
                    break L16;
                  } else {
                    pf.field_c.c(var6, var8, var1_int - -hb.field_d, var5, -1);
                    var1_int = var1_int + ok.field_e;
                    break L16;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "m.J(" + param0 + 41);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (!(((m) this).field_f >= param0)) {
            ((m) this).field_f = param0;
        }
        if (param0 >= ((m) this).field_b.length) {
            this.a(param0, 100);
        }
    }

    final static boolean b() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var9 = null;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3 = 0;
            L1: while (true) {
              if (var3 >= 16) {
                ee.field_s = tf.field_x.a(we.field_c[12][0]);
                L2: {
                  var3 = tf.field_x.a(we.field_c[13][0]);
                  if (ee.field_s >= var3) {
                    break L2;
                  } else {
                    ee.field_s = var3;
                    break L2;
                  }
                }
                var4 = tf.field_x.field_t - -tf.field_x.field_K + 4;
                il.field_q[6] = var4 + tf.field_x.field_x + (200 + tf.field_x.field_K);
                ea.field_d[6] = 33 - -(2 * var4);
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  var9 = ia.field_p[var3];
                  var1 = lg.field_d[var3];
                  if (1 != kf.field_b) {
                    break L3;
                  } else {
                    if (fl.field_t[var3] == null) {
                      break L3;
                    } else {
                      var1 = fl.field_t[var3];
                      break L3;
                    }
                  }
                }
                da.a(var1[1], var1[2], var1[8] - -var1[6], 120, var1[3], var3, var9);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1_ref, "m.H(" + -98 + 41);
        }
        return stackIn_12_0 != 0;
    }

    private final int b(int param0) {
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        var3 = ((m) this).field_b.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((m) this).field_a) {
              if (var3 != 0) {
                var3 = var3 * ((m) this).field_e;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + ((m) this).field_e;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, byte param1) {
        this.a(((m) this).field_f + 1, (byte) 99, param0);
        if (param1 < 39) {
            m.a(-27);
        }
    }

    final static ge[] a(lj param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        Object stackIn_4_0 = null;
        ge[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ge[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 6) {
                break L1;
              } else {
                var5 = null;
                ge[] discarded$2 = m.a((lj) null, -92, (byte) -64, 66);
                break L1;
              }
            }
            if (lk.a(160, param0, param1, param3)) {
              stackOut_5_0 = jc.b(-125);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ge[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("m.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_c = null;
        field_i = null;
        field_g = null;
        if (param0 != 128) {
            m.a((byte) -35);
        }
        field_j = null;
    }

    private m() throws Throwable {
        throw new Error();
    }

    final int c(int param0, int param1) {
        if (param1 != 7) {
            m.a(-97);
        }
        if (param0 > ((m) this).field_f) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((m) this).field_b[param0];
    }

    final static void a(int param0, String param1, boolean param2, String[] param3) {
        RuntimeException var4 = null;
        String[] var4_array = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              eh.field_p = hf.field_b;
              if (!param2) {
                break L1;
              } else {
                var6 = null;
                m.a(120, (String) null, true, (String[]) null);
                break L1;
              }
            }
            L2: {
              if (255 != param0) {
                L3: {
                  if (param0 < 100) {
                    break L3;
                  } else {
                    if (param0 <= 105) {
                      var4_array = param3;
                      ae.a((byte) 61, var4_array);
                      gf.field_w = wk.a(param3, -1);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                gf.field_w = mg.a((byte) 15, param1, param0);
                break L2;
              } else {
                L4: {
                  stackOut_4_0 = -115;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (cf.field_f >= 13) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L4;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L4;
                  }
                }
                gf.field_w = be.a(stackIn_7_0, stackIn_7_1 != 0);
                var7 = null;
                ae.a((byte) 73, (String[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("m.B(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[][]{new int[1], new int[6], new int[1], new int[1], new int[1], new int[1]};
        field_i = new int[128];
        field_g = new int[]{116, 195, 407, 89};
    }
}
