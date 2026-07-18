/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec implements eb {
    static byte[][] field_g;
    static dd field_d;
    static char[] field_j;
    static int field_f;
    private int field_e;
    static int field_b;
    static String field_k;
    static int field_i;
    private al field_h;
    static int field_c;
    private pq field_a;

    final static void a(int param0, int param1, int param2, String[] param3, java.applet.Applet param4) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              sa.field_o = param4.getParameter("overxgames");
              if (sa.field_o != null) {
                break L1;
              } else {
                sa.field_o = "0";
                break L1;
              }
            }
            L2: {
              pd.field_e = param4.getParameter("overxachievements");
              if (null != pd.field_e) {
                break L2;
              } else {
                pd.field_e = "0";
                break L2;
              }
            }
            L3: {
              L4: {
                var6 = param4.getParameter("currency");
                if (var6 == null) {
                  break L4;
                } else {
                  if (ka.a(10, (CharSequence) (Object) var6)) {
                    qg.field_e = kq.a((byte) 63, (CharSequence) (Object) var6);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              qg.field_e = 2;
              break L3;
            }
            vc.field_L = 0;
            oo.field_k = 0;
            er.field_X = 16777215;
            jr.field_m = new dd[param3.length];
            var7 = 0;
            L5: while (true) {
              if (var7 >= param3.length) {
                mk.field_a = param3;
                break L0;
              } else {
                jr.field_m[var7] = new dd(317, 34);
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6_ref;
            stackOut_15_1 = new StringBuilder().append("ec.G(").append(0).append(',').append(0).append(',').append(37).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 16777215 + ')');
        }
    }

    public final void a(int[] param0, int param1) {
        RuntimeException var3 = null;
        tm stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int[] stackIn_1_3 = null;
        int[] stackIn_1_4 = null;
        tm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int[] stackIn_2_3 = null;
        int[] stackIn_2_4 = null;
        tm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int[] stackIn_3_3 = null;
        int[] stackIn_3_4 = null;
        int stackIn_3_5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        tm stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int[] stackOut_0_3 = null;
        int[] stackOut_0_4 = null;
        tm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int[] stackOut_2_3 = null;
        int[] stackOut_2_4 = null;
        int stackOut_2_5 = 0;
        tm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int[] stackOut_1_3 = null;
        int[] stackOut_1_4 = null;
        int stackOut_1_5 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = dq.field_a;
              stackOut_0_1 = -1912602369;
              stackOut_0_2 = ((ec) this).field_e;
              stackOut_0_3 = ((ec) this).field_a.field_G;
              stackOut_0_4 = (int[]) param0;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              if (((ec) this).field_e != ((ec) this).field_h.j(param1 ^ -32240).field_I) {
                stackOut_2_0 = (tm) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = (int[]) (Object) stackIn_2_3;
                stackOut_2_4 = (int[]) (Object) stackIn_2_4;
                stackOut_2_5 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                break L1;
              } else {
                stackOut_1_0 = (tm) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = (int[]) (Object) stackIn_1_3;
                stackOut_1_4 = (int[]) (Object) stackIn_1_4;
                stackOut_1_5 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                break L1;
              }
            }
            L2: {
              ((tm) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5 != 0);
              if ((pd.field_i & 4L) == 0L) {
                break L2;
              } else {
                L3: {
                  L4: {
                    ((ec) this).field_a.f(param1 ^ 32245);
                    if (((ec) this).field_a.field_I != 0) {
                      break L4;
                    } else {
                      if (((ec) this).field_a.field_t != 0) {
                        break L4;
                      } else {
                        if (((ec) this).field_a.field_e != 0) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  int discarded$6 = 1;
                  int discarded$7 = 1;
                  cl.a(16711680, 1, param0, ol.a(new int[3]), ol.a(new int[3]));
                  break L3;
                }
                L5: {
                  L6: {
                    if (-1 != ((ec) this).field_a.field_n) {
                      break L6;
                    } else {
                      if (-1 != ((ec) this).field_a.field_b) {
                        break L6;
                      } else {
                        if (0 == ((ec) this).field_a.field_K) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  int discarded$8 = 1;
                  int discarded$9 = 1;
                  cl.a(65280, 1, param0, ol.a(new int[3]), ol.a(new int[3]));
                  break L5;
                }
                L7: {
                  if (0 != ((ec) this).field_a.field_l) {
                    break L7;
                  } else {
                    if (((ec) this).field_a.field_h == 0) {
                      break L2;
                    } else {
                      break L7;
                    }
                  }
                }
                int discarded$10 = 1;
                int discarded$11 = 1;
                cl.a(16776960, 1, param0, ol.a(new int[3]), ol.a(new int[3]));
                break L2;
              }
            }
            L8: {
              if (param1 == -32215) {
                break L8;
              } else {
                field_b = 107;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("ec.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        return param2 * param2 * (param2 * 256) / param1 / param1 / param1;
    }

    public final int b(int[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param1 <= -27) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = ((ec) this).b((int[]) null, -80);
                break L1;
              }
            }
            stackOut_2_0 = param0[11] * (-param0[2] + ((ec) this).field_a.field_G[2]) + (((ec) this).field_a.field_G[1] - param0[1]) * param0[10] + (((ec) this).field_a.field_G[0] - param0[0]) * param0[9];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ec.C(");
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

    final static String a(byte param0, long param1) {
        long var8 = 0L;
        int var10 = Pool.field_O;
        if (param1 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (param1 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var4 = var4 / 37L;
            var3++;
        }
        int var7 = 111;
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var8 = param1;
            param1 = param1 / 37L;
            StringBuilder discarded$0 = var6.append(dp.field_d[(int)(-(37L * param1) + var8)]);
        }
        return var6.reverse().toString();
    }

    final static String a(boolean param0) {
        return kn.field_e.j(-125);
    }

    public static void a() {
        field_g = null;
        field_d = null;
        field_j = null;
        field_k = null;
    }

    ec(int param0, al param1) {
        try {
            ((ec) this).field_e = param0;
            ((ec) this).field_h = param1;
            ((ec) this).field_a = ((ec) this).field_h.field_l[((ec) this).field_e];
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ec.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new byte[50][];
        field_k = "Try again!";
        field_j = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};
        field_b = 256;
    }
}
