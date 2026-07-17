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
        int var3 = Virogrid.field_F ? 1 : 0;
        if (!(((th) this).field_u == null)) {
            for (var2 = 0; var2 < ((th) this).field_u.length; var2++) {
                ((th) this).field_u[var2] = oh.a(((th) this).field_u[var2], 32768);
            }
        }
        if (param0) {
            field_q = false;
        }
    }

    final void a(jc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("th.F(");
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
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final String d(int param0) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param0 < 113) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((th) this).field_w == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((th) this).field_w[0]);
        for (var3 = 1; ((th) this).field_w.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((th) this).field_w[var3]);
        }
        return var2.toString();
    }

    public static void e(int param0) {
        field_p = null;
        field_t = null;
        field_o = null;
        field_r = null;
        field_y = null;
        field_s = null;
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        tl stackIn_6_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        tl stackOut_5_0 = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (136 < param1.length) {
                var3 = new tl();
                ((wh) (Object) var3).a(param1, (byte) -4);
                stackOut_5_0 = (tl) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                L1: {
                  if (param0 == -3) {
                    break L1;
                  } else {
                    boolean discarded$2 = th.a((byte) 34, -128, -119, 34);
                    break L1;
                  }
                }
                stackOut_9_0 = va.a(param1, 0);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("th.G(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 0 + 41);
        }
        return (Object) (Object) stackIn_10_0;
    }

    final static void b(byte param0) {
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
          throw kg.a((Throwable) (Object) var1_ref, "th.E(" + 112 + 41);
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                        L4: {
                          var6 = param2.c((byte) 97);
                          var7 = vb.a((byte) 0, var6);
                          if (var7 != null) {
                            ((th) this).field_x[var5] = var6;
                            ((th) this).field_v[var5] = new int[var7.field_g];
                            var8 = 0;
                            L5: while (true) {
                              if (var7.field_g <= var8) {
                                break L4;
                              } else {
                                ((th) this).field_v[var5][var8] = param2.c((byte) 50);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
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
            L6: {
              if (param1 == 60) {
                break L6;
              } else {
                field_t = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("th.A(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
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
