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
        int discarded$0 = 0;
        if (param1 != 100) {
            discarded$0 = this.b(-88, -45);
        }
        int[] var4 = new int[this.b(param0, param1 ^ 101)];
        int[] var3 = var4;
        he.a(this.field_b, 0, var4, 0, this.field_b.length);
        this.field_b = var4;
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_b = (int[]) null;
        }
        return this.field_f + 1;
    }

    final void b(int param0, byte param1) {
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (this.field_f < param0) {
              break L0;
            } else {
              L1: {
                if (this.field_f == param0) {
                  break L1;
                } else {
                  he.a(this.field_b, param0 + 1, this.field_b, param0, -param0 + this.field_f);
                  break L1;
                }
              }
              L2: {
                this.field_f = this.field_f - 1;
                if (param1 == -116) {
                  break L2;
                } else {
                  this.a(true);
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
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        h stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = jl.field_e;
              var2 = 0;
              if (-3 == (nd.field_c ^ -1)) {
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
              if (var3 >= gf.field_s.length) {
                L3: {
                  if (param0 >= 12) {
                    break L3;
                  } else {
                    field_j = (ib) null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var4 = dl.field_s[var3];
                  if ((var4 ^ -1) > -1) {
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
                  if ((nd.field_c ^ -1) != -3) {
                    break L5;
                  } else {
                    if (-2 != (var2 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        if (qb.field_c.length > ji.field_n.length) {
                          stackIn_19_0 = qb.field_c.length;
                          break L6;
                        } else {
                          stackIn_19_0 = ji.field_n.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var3 >= 6 + var7) {
                            break L7;
                          } else {
                            L8: {
                              if (ji.field_n.length + -6 + (var3 - var7) >= 0) {
                                stackIn_24_0 = ji.field_n[ji.field_n.length + (var3 - 6 - var7)];
                                break L8;
                              } else {
                                stackIn_24_0 = "";
                                break L8;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (qi.field_b.length > jl.field_c.length) {
                          stackIn_28_0 = qi.field_b.length;
                          break L9;
                        } else {
                          stackIn_28_0 = jl.field_c.length;
                          break L9;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (var3 < 7 - -var7) {
                        break L5;
                      } else {
                        if (var3 >= var8 + var7 + 7) {
                          break L5;
                        } else {
                          L10: {
                            if (-var7 + (var3 - 7) < jl.field_c.length) {
                              stackIn_33_0 = jl.field_c[-var7 + (-7 + var3)];
                              break L10;
                            } else {
                              stackIn_33_0 = "";
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if ((var4 ^ -1) != 1) {
                    break L11;
                  } else {
                    var6 = Integer.toString(var2);
                    break L11;
                  }
                }
                L12: {
                  stackIn_38_0 = -18;

                  if ((var4 ^ -1) > -1) {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = 0;
                    break L12;
                  } else {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = ki.a((byte) stackIn_39_0, stackIn_39_1 != 0, var6);
                  var8 = -(var7 >> -910175199) + dg.field_ab;
                  if (var4 >= 0) {
                    L14: {
                      var1_int = var1_int + uc.field_Y;
                      if (var4 != ui.field_c.field_j) {
                        stackIn_44_0 = tf.field_f;
                        break L14;
                      } else {
                        stackIn_44_0 = kk.field_e;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(sl.field_f + (ai.field_a << 125006337), var1_int, -1, -ni.field_i + var8, (ni.field_i << -568235679) + var7);
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
                  if (-1 >= (var4 ^ -1)) {
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
          throw oj.a((Throwable) ((Object) var1), "m.J(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (!(this.field_f >= param0)) {
            this.field_f = param0;
        }
        if (param0 >= this.field_b.length) {
            this.a(param0, 100);
        }
        if (param1 <= 39) {
            return;
        }
        this.field_b[param0] = param2;
    }

    final static boolean b(byte param0) {
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var9 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3 = 0;
            L1: while (true) {
              if (-17 >= (var3 ^ -1)) {
                L2: {
                  ee.field_s = tf.field_x.a(we.field_c[12][0]);
                  if (param0 == -98) {
                    break L2;
                  } else {
                    field_j = (ib) null;
                    break L2;
                  }
                }
                L3: {
                  var3 = tf.field_x.a(we.field_c[13][0]);
                  if (ee.field_s >= var3) {
                    break L3;
                  } else {
                    ee.field_s = var3;
                    break L3;
                  }
                }
                var4 = tf.field_x.field_t - -tf.field_x.field_K + 4;
                il.field_q[6] = var4 + tf.field_x.field_x + (200 + tf.field_x.field_K);
                ea.field_d[6] = 33 - -(2 * var4);
                stackIn_14_0 = 1;
                break L0;
              } else {
                L4: {
                  var9 = ia.field_p[var3];
                  var1 = lg.field_d[var3];
                  if (1 != kf.field_b) {
                    break L4;
                  } else {
                    if (fl.field_t[var3] == null) {
                      break L4;
                    } else {
                      var1 = fl.field_t[var3];
                      break L4;
                    }
                  }
                }
                da.a(var1[1], var1[2], var1[8] - -var1[6], param0 ^ -26, var1[3], var3, var9);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "m.H(" + param0 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_g = (int[]) null;
            break L0;
          }
        }
        var3 = this.field_b.length;
        L1: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (this.field_a) {
              if (var3 != 0) {
                var3 = var3 * this.field_e;
                continue L1;
              } else {
                var3 = 1;
                continue L1;
              }
            } else {
              var3 = var3 + this.field_e;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, byte param1) {
        this.a(this.field_f + 1, (byte) 99, param0);
        if (param1 < 39) {
            m.a(-27);
        }
    }

    final static ge[] a(lj param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        lj var5 = null;
        Object stackIn_4_0 = null;
        ge[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 6) {
                break L1;
              } else {
                var5 = (lj) null;
                m.a((lj) null, -92, (byte) -64, 66);
                break L1;
              }
            }
            if (lk.a(160, param0, param1, param3)) {
              stackIn_6_0 = jc.b(-125);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("m.I(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ge[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_c = (int[][]) null;
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
        if (param0 > this.field_f) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_b[param0];
    }

    final static void a(int param0, String param1, boolean param2, String[] param3) {
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              eh.field_p = hf.field_b;
              if (!param2) {
                break L1;
              } else {
                var6 = (String[]) null;
                m.a(120, (String) null, true, (String[]) null);
                break L1;
              }
            }
            L2: {
              if (255 != param0) {
                L3: {
                  if (-101 < (param0 ^ -1)) {
                    break L3;
                  } else {
                    if (param0 <= 105) {
                      var4 = param3;
                      ae.a((byte) 61, var4);
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
                  stackIn_6_0 = -115;

                  if (-14 >= (cf.field_f ^ -1)) {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 0;
                    break L4;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 1;
                    break L4;
                  }
                }
                gf.field_w = be.a(stackIn_7_0, stackIn_7_1 != 0);
                var7 = (String[]) null;
                ae.a((byte) 73, (String[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("m.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_c = new int[][]{new int[]{60}, new int[]{250, 250, 250, 250, 250, 250}, new int[]{0}, new int[]{0}, new int[]{100}, new int[]{50}};
        field_i = new int[128];
        field_g = new int[]{116, 195, 407, 89};
    }
}
