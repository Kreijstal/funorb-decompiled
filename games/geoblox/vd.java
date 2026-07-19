/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    private long field_h;
    int field_f;
    private static int[] field_b;
    String field_k;
    int field_o;
    static int field_n;
    private int field_c;
    static volatile int field_a;
    private String field_i;
    int[] field_g;
    private boolean field_j;
    static String[] field_m;
    int field_d;
    static boolean field_l;
    static int field_p;
    static String field_e;

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_m = null;
        int var1 = -39 % ((62 - param0) / 42);
    }

    final static String a(String param0, String param1, int param2, boolean param3, rh param4) {
        String discarded$2 = null;
        RuntimeException var5 = null;
        rh var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            if (!param4.a(0)) {
              stackOut_2_0 = (String) (param1);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param3) {
                  break L1;
                } else {
                  var6 = (rh) null;
                  discarded$2 = vd.a((String) null, (String) null, 53, false, (rh) null);
                  break L1;
                }
              }
              stackOut_6_0 = param0 + " - " + param4.b((byte) 42, param2) + "%";
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("vd.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static int a(int param0) {
        double var1 = 0.0;
        if (param0 == 741924304) {
          if (Math.random() < sa.field_c) {
            var1 = Math.random();
            if (0.13 <= var1) {
              if (var1 >= 0.25) {
                if (var1 < 0.65) {
                  return 1;
                } else {
                  return 2;
                }
              } else {
                return 4;
              }
            } else {
              return 3;
            }
          } else {
            return 0;
          }
        } else {
          return 104;
        }
    }

    final int c(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        if (!this.field_j) {
          if (this.field_f == 2) {
            if (-1 <= (this.field_c ^ -1)) {
              if (wh.field_n == this.field_h) {
                return 1;
              } else {
                if ((vk.field_a ^ -1) == -3) {
                  if (!v.a(this.field_i, (byte) 89)) {
                    if (param0 <= 113) {
                      discarded$4 = vd.a(-69);
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  if (param0 <= 113) {
                    discarded$5 = vd.a(-69);
                    return 0;
                  } else {
                    return 0;
                  }
                }
              }
            } else {
              return 2;
            }
          } else {
            if (wh.field_n == this.field_h) {
              return 1;
            } else {
              if ((vk.field_a ^ -1) == -3) {
                if (!v.a(this.field_i, (byte) 89)) {
                  if (param0 <= 113) {
                    discarded$6 = vd.a(-69);
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                if (param0 <= 113) {
                  discarded$7 = vd.a(-69);
                  return 0;
                } else {
                  return 0;
                }
              }
            }
          }
        } else {
          return 2;
        }
    }

    vd(boolean param0) {
        this.field_i = jc.field_b;
        this.field_f = gj.field_u;
        this.field_h = uf.field_c;
        this.field_d = uk.field_o;
        this.field_k = re.field_f;
        this.field_j = field_l;
        if (param0) {
            this.field_g = vj.field_c;
        } else {
            this.field_g = null;
        }
        this.field_o = tj.field_b;
        this.field_c = bm.field_s;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            field_b = new int[5];
            field_n = 0;
            field_a = 0;
            field_m = new String[]{"All scores", "My scores", "Best each"};
            field_p = 6;
            var0 = 0;
            L0: while (true) {
              if (field_b.length <= var0) {
                field_e = "Excellent! Now try connecting three of a kind by shape.<br>Press <img=2> to continue.";
                break $cfr$clinit;
              } else {
                L1: {
                  if (-1 != (var0 ^ -1)) {
                    field_b[var0] = (1 + var0) * 51 << -874678192;
                    break L1;
                  } else {
                    field_b[var0] = (var0 - -1) * 20 << 741924304;
                    break L1;
                  }
                }
                if ((var0 ^ -1) < -3) {
                  field_b[var0] = lb.a(field_b[var0], (var0 + -2) * 22 << 1940867656);
                  var0++;
                  continue L0;
                } else {
                  var0++;
                  continue L0;
                }
              }
            }
        }
    }
}
