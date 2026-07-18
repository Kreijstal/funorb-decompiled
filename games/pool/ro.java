/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    private int field_t;
    int[] field_q;
    int[] field_j;
    private int field_b;
    private int field_n;
    int field_k;
    private int field_a;
    static String field_p;
    static boolean field_e;
    static String field_s;
    int field_m;
    private int field_u;
    static int[] field_d;
    private int field_l;
    int field_f;
    private int field_o;
    int[] field_h;
    byte field_r;
    int field_i;
    static String field_g;
    static int[][][] field_v;
    private int[] field_c;

    final static nj[] a(int param0, oq param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        nj[] var4 = null;
        int var5 = 0;
        nj var6_ref_nj = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        nj[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj[] stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var2_int = param1.e(8, 92);
            if (var2_int <= 0) {
              var3 = param1.e(12, 82);
              var4 = new nj[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_9_0 = (nj[]) var4;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  L2: {
                    if (!gk.a((byte) 118, param1)) {
                      var6 = param1.e(fr.a(16, -1 + var5), 105);
                      var4[var5] = var4[var6];
                      break L2;
                    } else {
                      var6_ref_nj = new nj();
                      int discarded$12 = param1.e(24, 22);
                      int discarded$13 = param1.e(24, 62);
                      var6_ref_nj.field_a = param1.e(24, 28);
                      int discarded$14 = param1.e(9, 44);
                      int discarded$15 = param1.e(12, 104);
                      int discarded$16 = param1.e(12, 125);
                      int discarded$17 = param1.e(12, 99);
                      var4[var5] = var6_ref_nj;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nj[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ro.D(").append(24).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (em.field_K) {
              return;
            } else {
              L1: {
                if (null == ta.field_g) {
                  ta.field_g = bo.a(4, 47);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!ta.field_g.field_s) {
                  break L2;
                } else {
                  var18 = oa.field_g;
                  var14 = var18;
                  var12 = var14;
                  var10 = var12;
                  var5 = var10;
                  var1_array = var5;
                  var19 = ta.field_g.field_l;
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= 8) {
                      var20 = hp.field_c;
                      var16 = var20;
                      var13 = var16;
                      var11 = var13;
                      var7 = var11;
                      var1_array = var7;
                      var21 = ta.field_g.field_l;
                      var9 = 0;
                      var3 = var9;
                      L4: while (true) {
                        if (var9 >= 8) {
                          em.field_K = true;
                          ta.field_g = null;
                          break L2;
                        } else {
                          var7[var9] = rb.b(var20[var9], ~var21[var9]);
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      var5[var3] = md.a(var18[var3], var19[var3]);
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
              L5: {
                if (em.field_K) {
                  kk.g(47);
                  if (ne.field_w == 18) {
                    if (oe.a(false, hp.field_c)) {
                      s.field_c[18].a(0, 0, false);
                      break L5;
                    } else {
                      ne.field_w = 16;
                      fq.a(-3405, 16, sq.field_b, false);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "ro.A(" + -41 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int[] param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              param0 = param0 - param5[0];
              param1 = param1 - param5[2];
              param3 = param3 - param5[1];
              ((ro) this).field_u = param5[6] * param0 + (param3 * param5[7] - -(param1 * param5[8])) >> 16;
              ((ro) this).field_n = param1 * param5[5] + param0 * param5[3] + param3 * param5[4] >> 16;
              ((ro) this).field_a = param0 * param5[9] + (param3 * param5[10] - -(param5[11] * param1)) >> 16;
              if (param4 == 120) {
                break L1;
              } else {
                ((ro) this).field_t = 28;
                break L1;
              }
            }
            L2: {
              ((ro) this).field_l = param2;
              if (((ro) this).field_a == 0) {
                break L2;
              } else {
                if (((ro) this).field_a == 1) {
                  break L2;
                } else {
                  ((ro) this).field_b = bb.a(((ro) this).field_a, ((ro) this).field_n, (byte) 99);
                  ((ro) this).field_o = vd.a(((ro) this).field_a, (byte) 103, ((ro) this).field_u);
                  ((ro) this).field_t = lo.a(((ro) this).field_l, ((ro) this).field_a, (byte) 123);
                  break L2;
                }
              }
            }
            ((ro) this).field_k = 0;
            ((ro) this).field_i = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7;
            stackOut_7_1 = new StringBuilder().append("ro.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(ro param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((ro) this).field_i = param0.field_f + ((ro) this).field_f;
              if (param1 == -16875) {
                break L1;
              } else {
                ((ro) this).field_b = 105;
                break L1;
              }
            }
            L2: {
              L3: {
                ((ro) this).field_k = param0.field_m + ((ro) this).field_m;
                if (0 != ((ro) this).field_i) {
                  break L3;
                } else {
                  if (((ro) this).field_k != 0) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = ke.a(false, ((ro) this).field_k * ((ro) this).field_k + ((ro) this).field_i * ((ro) this).field_i);
              if (var3_int == 0) {
                break L2;
              } else {
                ((ro) this).field_i = (((ro) this).field_i << 8) / var3_int;
                ((ro) this).field_k = (((ro) this).field_k << 8) / var3_int;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ro.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final boolean b(ro param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 24) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ((ro) this).b((ro) null, -17);
                break L1;
              }
            }
            stackOut_2_0 = hk.a(99, param0.field_n, ((ro) this).field_n, param0.field_u, param0.field_a, ((ro) this).field_a, ((ro) this).field_u);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ro.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_v = null;
        field_s = null;
        field_p = null;
    }

    final void a(byte param0, ro param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              ((ro) this).field_q[0] = ((ro) this).field_n;
              ((ro) this).field_j[0] = ((ro) this).field_u;
              ((ro) this).field_c[0] = ((ro) this).field_a;
              ((ro) this).field_h[0] = ((ro) this).field_l;
              ((ro) this).field_q[1] = param1.field_n;
              ((ro) this).field_j[1] = param1.field_u;
              ((ro) this).field_c[1] = param1.field_a;
              ((ro) this).field_h[1] = param1.field_l;
              ((ro) this).field_r = ic.a(((ro) this).field_j, 0, ((ro) this).field_q, ((ro) this).field_h, ((ro) this).field_c, param0 + -56);
              if ((((ro) this).field_r & 15) == 0) {
                ((ro) this).field_q[0] = ((ro) this).field_b;
                ((ro) this).field_j[0] = ((ro) this).field_o;
                ((ro) this).field_h[0] = ((ro) this).field_t;
                break L1;
              } else {
                ((ro) this).field_q[0] = bb.a(((ro) this).field_c[0], ((ro) this).field_q[0], (byte) 99);
                ((ro) this).field_j[0] = vd.a(((ro) this).field_c[0], (byte) 69, ((ro) this).field_j[0]);
                ((ro) this).field_h[0] = lo.a(((ro) this).field_h[0], ((ro) this).field_c[0], (byte) 84);
                break L1;
              }
            }
            L2: {
              if ((((ro) this).field_r & 240) == 0) {
                ((ro) this).field_q[1] = param1.field_b;
                ((ro) this).field_j[1] = param1.field_o;
                ((ro) this).field_h[1] = param1.field_t;
                break L2;
              } else {
                ((ro) this).field_q[1] = bb.a(((ro) this).field_c[1], ((ro) this).field_q[1], (byte) 99);
                ((ro) this).field_j[1] = vd.a(((ro) this).field_c[1], (byte) 68, ((ro) this).field_j[1]);
                ((ro) this).field_h[1] = lo.a(((ro) this).field_h[1], ((ro) this).field_c[1], (byte) 83);
                break L2;
              }
            }
            L3: {
              ((ro) this).field_m = ((ro) this).field_j[1] - ((ro) this).field_j[0];
              if (param0 == 60) {
                break L3;
              } else {
                ((ro) this).field_c = null;
                break L3;
              }
            }
            L4: {
              L5: {
                ((ro) this).field_f = ((ro) this).field_q[1] - ((ro) this).field_q[0];
                if (0 != ((ro) this).field_f) {
                  break L5;
                } else {
                  if (((ro) this).field_m == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var3_int = ke.a(false, ((ro) this).field_m * ((ro) this).field_m + ((ro) this).field_f * ((ro) this).field_f);
              if (var3_int == 0) {
                break L4;
              } else {
                ((ro) this).field_m = (((ro) this).field_m << 8) / var3_int;
                ((ro) this).field_f = (((ro) this).field_f << 8) / var3_int;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ro.F(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    ro() {
        ((ro) this).field_h = new int[2];
        ((ro) this).field_q = new int[2];
        ((ro) this).field_j = new int[2];
        ((ro) this).field_c = new int[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Game full";
        field_g = "Reject <%0> from this game";
    }
}
