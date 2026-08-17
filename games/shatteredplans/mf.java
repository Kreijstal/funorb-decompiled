/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends ml {
    private fj field_s;
    static nq field_x;
    static boolean field_r;
    static String field_u;
    static nk[] field_o;
    static String[] field_w;
    static sq[] field_q;
    static String field_v;
    private boolean field_n;
    private String field_t;
    static boolean field_p;

    final static th a(int param0, int param1, bc param2, bc param3, int param4) {
        RuntimeException var5 = null;
        th stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vd.a(param1, param2, param0, 2)) {
              L1: {
                if (param4 <= -83) {
                  break L1;
                } else {
                  mf.e(87);
                  break L1;
                }
              }
              stackIn_7_0 = in.a(15, param3.a(param1, -1, param0));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("mf.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);

            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_7_0;
    }

    final static lp a(qk[] param0, boolean param1) {
        lp var2 = null;
        int var3 = 0;
        int var4 = 0;
        lp var5 = null;
        lp stackIn_7_0 = null;
        lp stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = new lp(0, 0, 182, param0.length * rs.field_Cb.field_J);
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (param0.length <= var3) {
                if (param1) {
                  stackIn_9_0 = (lp) (var2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_7_0 = (lp) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                param0[var3].a((byte) 119, 0, rs.field_Cb.field_J * var3);
                var5.a(param0[var3], 8);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("mf.R(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_9_0;
        }
    }

    final String a(boolean param0, String param1) {
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (this.field_s.b(-11196, param1) == tj.field_b) {
              stackIn_4_0 = this.field_s.a(false, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param0) {
                if (this.b(-11196, param1) == tj.field_b) {
                  stackIn_12_0 = ab.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_14_0 = dn.field_g;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_7_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("mf.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final u b(int param0, String param1) {
        u stackIn_2_0 = null;
        u stackIn_8_0 = null;
        u stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ks var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (this.field_s.b(param0, param1) != tj.field_b) {
              L1: {
                if (!param1.equals(this.field_t)) {
                  var3 = os.a(202, param1);
                  if (var3.b(14)) {
                    this.field_t = param1;
                    this.field_n = var3.a(true);
                    break L1;
                  } else {
                    stackIn_8_0 = lm.field_d;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_n) {
                  stackIn_14_0 = tj.field_b;
                  break L2;
                } else {
                  stackIn_14_0 = p.field_g;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = tj.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("mf.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  if (np.field_a == null) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ti.field_e = false;
              break L1;
            }
            L3: {
              if (param1) {
                if (0 < qa.field_t) {
                  qa.field_t = qa.field_t - 1;
                  break L3;
                } else {
                  if (-1 <= (bc.field_b ^ -1)) {
                    if (0 < ee.field_k) {
                      ee.field_k = ee.field_k - 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    bc.field_b = bc.field_b - 1;
                    break L3;
                  }
                }
              } else {
                if (np.field_a == null) {
                  if (null == he.field_p) {
                    ti.field_e = false;
                    if (-1 <= (bc.field_b ^ -1)) {
                      if (0 >= ee.field_k) {
                        if (ed.field_f <= qa.field_t) {
                          break L3;
                        } else {
                          L4: {
                            if (qa.field_t == 0) {
                              in.a((byte) -83);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          qa.field_t = qa.field_t + 1;
                          break L3;
                        }
                      } else {
                        ee.field_k = ee.field_k - 1;
                        break L3;
                      }
                    } else {
                      bc.field_b = bc.field_b - 1;
                      break L3;
                    }
                  } else {
                    if (qa.field_t <= 0) {
                      if (ee.field_k <= 0) {
                        if (ed.field_f > bc.field_b) {
                          L5: {
                            if (0 == bc.field_b) {
                              tc.a(true, true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          bc.field_b = bc.field_b + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        ee.field_k = ee.field_k - 1;
                        break L3;
                      }
                    } else {
                      qa.field_t = qa.field_t - 1;
                      break L3;
                    }
                  }
                } else {
                  if (0 < qa.field_t) {
                    qa.field_t = qa.field_t - 1;
                    break L3;
                  } else {
                    if (-1 > (bc.field_b ^ -1)) {
                      bc.field_b = bc.field_b - 1;
                      break L3;
                    } else {
                      if (ee.field_k < ed.field_f) {
                        L6: {
                          if (0 == ee.field_k) {
                            tc.a(true, false);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ee.field_k = ee.field_k + 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            if (param0) {
              break L0;
            } else {
              field_q = (sq[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "mf.U(" + param0 + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        try {
            field_u = null;
            field_o = null;
            if (param0 != 0) {
                field_p = true;
            }
            field_x = null;
            field_w = null;
            field_q = null;
            field_v = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "mf.T(" + param0 + ')');
        }
    }

    mf(go param0, go param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_n = false;
        this.field_t = "";
        try {
          L0: {
            this.field_s = new fj(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("mf.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void e(int param0) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = uo.field_h;
              var1 = var5;
              if (param0 > 92) {
                break L1;
              } else {
                mf.e(20);
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
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
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "mf.O(" + param0 + ')');
        }
    }

    final static bi a(bc param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        Object stackIn_3_0 = null;
        bi stackIn_9_0 = null;
        bi stackIn_9_1 = null;
        byte[] stackIn_9_2 = null;
        bi stackIn_10_0;
        bi stackIn_10_1;
        byte[] stackIn_10_2;
        Object stackIn_10_3;
        bi stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (param0.a((byte) 96, param2, param1)) {
                break L1;
              } else {
                param2 = param2 + ".jpg";
                if (param0.a((byte) 127, param2, param1)) {
                  break L1;
                } else {
                  stackIn_3_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              var5 = param0.a(true, param2, param1);
              var4 = var5;
              if (!param3) {
                break L2;
              } else {
                mf.a(false, true);
                break L2;
              }
            }
            L3: {
              stackIn_9_0 = null;

              stackIn_9_1 = null;

              stackIn_9_2 = (byte[]) (var5);

              if (null == bj.field_K) {
                stackIn_10_0 = null;
                stackIn_10_1 = null;
                stackIn_10_2 = (byte[]) ((Object) stackIn_9_2);
                stackIn_10_3 = tm.field_i;
                break L3;
              } else {
                stackIn_10_0 = null;
                stackIn_10_1 = null;
                stackIn_10_2 = (byte[]) ((Object) stackIn_9_2);
                stackIn_10_3 = bj.field_K;
                break L3;
              }
            }
            stackIn_11_0 = new bi(stackIn_10_2, (java.awt.Component) ((Object) stackIn_10_3));
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("mf.S(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);

            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);

            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bi) ((Object) stackIn_3_0);
        } else {
          return stackIn_11_0;
        }
    }

    final static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        mj var1_ref = null;
        fb var1_ref2 = null;
        RuntimeException var1_ref3 = null;
        int var2 = 0;
        var1 = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = (mj) ((Object) gr.field_p.d(0));
              if (param0 >= 4) {
                break L1;
              } else {
                mf.a(true, true);
                break L1;
              }
            }
            L2: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (fb) ((Object) kj.field_a.d(0));
                L3: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (mj) ((Object) uo.field_a.d(0));
                    L4: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        L5: {
                          if (var1_ref.field_Gb <= 0) {
                            break L5;
                          } else {
                            var1_ref.field_Gb = var1_ref.field_Gb - 1;
                            if (-1 == (var1_ref.field_Gb ^ -1)) {
                              var1_ref.field_Eb = 0;
                              if (!var1_ref.h(-96)) {
                                break L5;
                              } else {
                                var1_ref.b((byte) -108);
                                break L5;
                              }
                            } else {
                              var1_ref = (mj) ((Object) uo.field_a.a((byte) -71));
                              continue L4;
                            }
                          }
                        }
                        var1_ref = (mj) ((Object) uo.field_a.a((byte) -71));
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (0 < var1_ref2.field_Nb) {
                        var1_ref2.field_Nb = var1_ref2.field_Nb - 1;
                        if (-1 == (var1_ref2.field_Nb ^ -1)) {
                          var1_ref2.field_hc = 0;
                          if (!var1_ref2.f((byte) -78)) {
                            break L6;
                          } else {
                            var1_ref2.b((byte) -58);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref2 = (fb) ((Object) kj.field_a.a((byte) -71));
                    continue L3;
                  }
                }
              } else {
                L7: {
                  if (0 >= var1_ref.field_Gb) {
                    break L7;
                  } else {
                    var1_ref.field_Gb = var1_ref.field_Gb - 1;
                    if (-1 == (var1_ref.field_Gb ^ -1)) {
                      var1_ref.field_Eb = 0;
                      if (!var1_ref.h(-122)) {
                        break L7;
                      } else {
                        var1_ref.b((byte) -58);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                var1_ref = (mj) ((Object) gr.field_p.a((byte) -71));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref3), "mf.V(" + param0 + ')');
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new int[var2_int];
              if (param0 == 74) {
                break L1;
              } else {
                mf.e(40);
                break L1;
              }
            }
            var4 = 1;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_12_0 = (int[]) (var3);
                break L0;
              } else {
                var5 = var4;
                L3: while (true) {
                  L4: {
                    var5--;
                    if (0 > var5) {
                      break L4;
                    } else {
                      if (param1[var3[var5]] >= param1[var4]) {
                        break L4;
                      } else {
                        var3[var5 + 1] = var3[var5];
                        continue L3;
                      }
                    }
                  }
                  var3[1 + var5] = var4;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("mf.M(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    static {
        field_u = "You have offered a Non-Agression Pact to <%0>.";
        field_v = "READY";
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
