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
        if (param1 != 100) {
            int discarded$0 = this.b(-88, -45);
        }
        int[] var4 = new int[this.b(param0, param1 ^ 101)];
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
        if (0 <= param0) {
            // if_icmplt L16
        } else {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (((m) this).field_f != param0) {
            he.a(((m) this).field_b, param0 + 1, ((m) this).field_b, param0, -param0 + ((m) this).field_f);
        }
        ((m) this).field_f = ((m) this).field_f - 1;
        if (param1 != -116) {
            int discarded$0 = ((m) this).a(true);
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        h var9 = null;
        int var10 = 0;
        int stackIn_16_0 = 0;
        String stackIn_21_0 = null;
        int stackIn_25_0 = 0;
        String stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        h stackIn_41_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        String stackOut_20_0 = null;
        String stackOut_19_0 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String stackOut_29_0 = null;
        String stackOut_28_0 = null;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        h stackOut_40_0 = null;
        h stackOut_39_0 = null;
        L0: {
          var10 = TorChallenge.field_F ? 1 : 0;
          var1 = jl.field_e;
          var2 = 0;
          if (-3 == (nd.field_c ^ -1)) {
            var3_long = ol.a(256) + -fd.field_e;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 <= var2) {
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= gf.field_s.length) {
            L2: {
              if (param0 >= 12) {
                break L2;
              } else {
                field_j = null;
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var4 = dl.field_s[var3];
              if ((var4 ^ -1) > -1) {
                var5 = qa.field_f;
                break L3;
              } else {
                if (ui.field_c.field_j != var4) {
                  var5 = ai.field_d;
                  break L3;
                } else {
                  var5 = lg.field_f;
                  break L3;
                }
              }
            }
            L4: {
              var6 = gf.field_s[var3];
              if (nd.field_c != -3) {
                break L4;
              } else {
                if (-2 != var2) {
                  break L4;
                } else {
                  L5: {
                    if (qb.field_c.length > ji.field_n.length) {
                      stackOut_15_0 = qb.field_c.length;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    } else {
                      stackOut_14_0 = ji.field_n.length;
                      stackIn_16_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_16_0;
                    if (var3 < 6) {
                      break L6;
                    } else {
                      if (var3 >= 6 + var7) {
                        break L6;
                      } else {
                        L7: {
                          if (ji.field_n.length + -6 + (var3 - var7) >= 0) {
                            stackOut_20_0 = ji.field_n[ji.field_n.length + (var3 - 6 - var7)];
                            stackIn_21_0 = stackOut_20_0;
                            break L7;
                          } else {
                            stackOut_19_0 = "";
                            stackIn_21_0 = stackOut_19_0;
                            break L7;
                          }
                        }
                        var6_ref = stackIn_21_0;
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (qi.field_b.length > jl.field_c.length) {
                      stackOut_24_0 = qi.field_b.length;
                      stackIn_25_0 = stackOut_24_0;
                      break L8;
                    } else {
                      stackOut_23_0 = jl.field_c.length;
                      stackIn_25_0 = stackOut_23_0;
                      break L8;
                    }
                  }
                  var8 = stackIn_25_0;
                  if (var3 < 7 - -var7) {
                    break L4;
                  } else {
                    if (var3 >= var8 + var7 + 7) {
                      break L4;
                    } else {
                      L9: {
                        if (-var7 + (var3 - 7) < jl.field_c.length) {
                          stackOut_29_0 = jl.field_c[-var7 + (-7 + var3)];
                          stackIn_30_0 = stackOut_29_0;
                          break L9;
                        } else {
                          stackOut_28_0 = "";
                          stackIn_30_0 = stackOut_28_0;
                          break L9;
                        }
                      }
                      var6_ref = stackIn_30_0;
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if ((var4 ^ -1) != 1) {
                break L10;
              } else {
                var6_ref = Integer.toString(var2);
                break L10;
              }
            }
            L11: {
              stackOut_33_0 = -18;
              stackIn_35_0 = stackOut_33_0;
              stackIn_34_0 = stackOut_33_0;
              if ((var4 ^ -1) > -1) {
                stackOut_35_0 = stackIn_35_0;
                stackOut_35_1 = 0;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                break L11;
              } else {
                stackOut_34_0 = stackIn_34_0;
                stackOut_34_1 = 1;
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                break L11;
              }
            }
            L12: {
              var7 = ki.a((byte) stackIn_36_0, stackIn_36_1 != 0, var6_ref);
              var8 = -(var7 >> -910175199) + dg.field_ab;
              if (var4 >= 0) {
                L13: {
                  var1 = var1 + uc.field_Y;
                  if (var4 != ui.field_c.field_j) {
                    stackOut_40_0 = tf.field_f;
                    stackIn_41_0 = stackOut_40_0;
                    break L13;
                  } else {
                    stackOut_39_0 = kk.field_e;
                    stackIn_41_0 = stackOut_39_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_41_0;
                  if (var9 == null) {
                    break L14;
                  } else {
                    var9.a(sl.field_f + (ai.field_a << 125006337), var1, -1, -ni.field_i + var8, (ni.field_i << -568235679) + var7);
                    break L14;
                  }
                }
                var1 = var1 + ai.field_a;
                break L12;
              } else {
                break L12;
              }
            }
            if (-1 >= (var4 ^ -1)) {
              ec.field_c.c(var6_ref, var8, re.field_A + var1, var5, -1);
              var1 = var1 + (sl.field_f + (ai.field_a + uc.field_Y));
              var3++;
              continue L1;
            } else {
              pf.field_c.c(var6_ref, var8, var1 - -hb.field_d, var5, -1);
              var1 = var1 + ok.field_e;
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (!(((m) this).field_f >= param0)) {
            ((m) this).field_f = param0;
        }
        if (param0 >= ((m) this).field_b.length) {
            this.a(param0, 100);
        }
        if (param1 <= 39) {
            return;
        }
        ((m) this).field_b[param0] = param2;
    }

    final static boolean b(byte param0) {
        int var3 = 0;
        int[] var9 = null;
        int[] var1 = null;
        int var5 = TorChallenge.field_F ? 1 : 0;
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            var9 = ia.field_p[var3];
            var1 = lg.field_d[var3];
            if (1 == kf.field_b) {
                if (fl.field_t[var3] != null) {
                    var1 = fl.field_t[var3];
                }
            }
            da.a(var1[1], var1[2], var1[8] - -var1[6], param0 ^ -26, var1[3], var3, var9);
        }
        ee.field_s = tf.field_x.a(we.field_c[12][0]);
        if (param0 != -98) {
            field_j = null;
        }
        var3 = tf.field_x.a(we.field_c[13][0]);
        if (ee.field_s < var3) {
            ee.field_s = var3;
        }
        int var4 = tf.field_x.field_t - -tf.field_x.field_K + 4;
        il.field_q[6] = var4 + tf.field_x.field_x + (200 + tf.field_x.field_K);
        ea.field_d[6] = 33 - -(2 * var4);
        return true;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        var3 = ((m) this).field_b.length;
        L1: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((m) this).field_a) {
              if (var3 != 0) {
                var3 = var3 * ((m) this).field_e;
                continue L1;
              } else {
                var3 = 1;
                continue L1;
              }
            } else {
              var3 = var3 + ((m) this).field_e;
              continue L1;
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
        if (param2 != 6) {
            Object var5 = null;
            ge[] discarded$0 = m.a((lj) null, -92, (byte) -64, 66);
        }
        if (!lk.a(160, param0, param1, param3)) {
            return null;
        }
        return jc.b(-125);
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
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          eh.field_p = hf.field_b;
          if (!param2) {
            break L0;
          } else {
            var6 = null;
            m.a(120, (String) null, true, (String[]) null);
            break L0;
          }
        }
        L1: {
          if (255 != param0) {
            L2: {
              if (-101 > param0) {
                break L2;
              } else {
                if (param0 <= 105) {
                  var4 = param3;
                  ae.a((byte) 61, var4);
                  gf.field_w = wk.a(param3, -1);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            gf.field_w = mg.a((byte) 15, param1, param0);
            break L1;
          } else {
            L3: {
              stackOut_3_0 = -115;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (-14 >= cf.field_f) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L3;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L3;
              }
            }
            gf.field_w = be.a(stackIn_6_0, stackIn_6_1 != 0);
            var7 = null;
            ae.a((byte) 73, (String[]) null);
            break L1;
          }
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
