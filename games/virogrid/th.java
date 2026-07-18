/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wb {
    static dl field_t;
    int[] field_u;
    private int[][] field_v;
    private int[] field_x;
    static int field_z;
    private String[] field_w;
    static String field_r;
    static String[][] field_p;
    static il field_y;
    static km[] field_o;
    static String field_s;
    static boolean field_q;

    final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Virogrid.field_F ? 1 : 0;
          if (((th) this).field_u != null) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((th) this).field_u.length) {
                break L0;
              } else {
                ((th) this).field_u[var2] = oh.a(((th) this).field_u[var2], 32768);
                var2++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            field_q = false;
            break L2;
          }
        }
    }

    final void a(jc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.g(11132);
              if (var3_int != 0) {
                this.a(var3_int, 60, param0);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("th.F(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (param0 >= 113) {
          var5 = new StringBuilder(80);
          var2 = var5;
          if (((th) this).field_w != null) {
            StringBuilder discarded$16 = var5.append(((th) this).field_w[0]);
            var3 = 1;
            L0: while (true) {
              if (((th) this).field_w.length <= var3) {
                return var2.toString();
              } else {
                StringBuilder discarded$17 = var2.append("...");
                StringBuilder discarded$18 = var5.append(((th) this).field_w[var3]);
                var3++;
                continue L0;
              }
            }
          } else {
            return "";
          }
        } else {
          return null;
        }
    }

    public static void e() {
        field_p = null;
        field_t = null;
        field_o = null;
        field_r = null;
        field_y = null;
        field_s = null;
    }

    final static Object a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        tl var3_ref = null;
        Object stackIn_2_0 = null;
        tl stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        tl stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          if (param1 != null) {
            if (136 < param1.length) {
              var3_ref = new tl();
              ((wh) (Object) var3_ref).a(param1, (byte) -4);
              stackOut_6_0 = (tl) var3_ref;
              stackIn_7_0 = stackOut_6_0;
              return (Object) (Object) stackIn_7_0;
            } else {
              return (Object) (Object) param1;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("th.G(").append(-3).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L0;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L0;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + false + ')');
        }
    }

    final static void b() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) w.field_L;
            synchronized (var1) {
              L1: {
                L2: {
                  ph.field_h = re.field_l;
                  um.field_Fb = um.field_Fb + 1;
                  if (ch.field_f >= 0) {
                    L3: while (true) {
                      if (ch.field_f == bf.field_i) {
                        break L2;
                      } else {
                        var2 = ab.field_H[bf.field_i];
                        bf.field_i = bf.field_i - -1 & 127;
                        if (var2 < 0) {
                          dc.field_Y[~var2] = false;
                          continue L3;
                        } else {
                          dc.field_Y[var2] = true;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (112 <= var2) {
                        ch.field_f = bf.field_i;
                        break L2;
                      } else {
                        dc.field_Y[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                re.field_l = hh.field_e;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1_ref, "th.E(" + 112 + ')');
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        L0: {
          var4 = -93 % ((13 - param0) / 45);
          if (param3 < 0) {
            break L0;
          } else {
            if (param3 > 11) {
              break L0;
            } else {
              if (param2 < 1) {
                return false;
              } else {
                if (~kb.a(false, param1, param3) <= ~param2) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    private final void a(int param0, int param1, jc param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        lc var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                ((th) this).field_w = ql.a(param2.h(-122), (byte) -123, '<');
                break L1;
              } else {
                if (param0 == 2) {
                  var4_int = param2.g(11132);
                  ((th) this).field_u = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((th) this).field_u[var5] = param2.c((byte) 110);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param0 == 3) {
                    var4_int = param2.g(11132);
                    ((th) this).field_x = new int[var4_int];
                    ((th) this).field_v = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        var6 = param2.c((byte) 97);
                        var7 = vb.a((byte) 0, var6);
                        if (null != var7) {
                          L4: {
                            ((th) this).field_x[var5] = var6;
                            ((th) this).field_v[var5] = new int[var7.field_g];
                            var8 = 0;
                            if (var7.field_g <= var8) {
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (param0 == 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("th.A(").append(param0).append(',').append(60).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    th() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new dl();
        field_r = "Average rating";
        field_s = "Resign";
    }
}
