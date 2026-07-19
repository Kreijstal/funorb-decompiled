/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends qf {
    private boolean field_l;
    private vb field_o;
    static hl field_q;
    static String field_p;
    private String field_n;
    static String field_j;
    static String field_k;
    static String field_m;
    static boolean field_r;
    static String field_s;

    public static void f(int param0) {
        field_p = null;
        field_k = null;
        if (param0 != 1) {
            return;
        }
        field_j = null;
        field_s = null;
        field_q = null;
        field_m = null;
    }

    final static ig a(boolean param0, boolean param1) {
        ig var2 = null;
        ig stackIn_2_0 = null;
        ig stackIn_3_0 = null;
        ig stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ig stackIn_6_0 = null;
        ig stackIn_7_0 = null;
        ig stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ig stackOut_5_0 = null;
        ig stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ig stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ig stackOut_1_0 = null;
        ig stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ig stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1) {
          L0: {
            field_q = (hl) null;
            var2 = new ig(true);
            stackOut_5_0 = (ig) (var2);
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (ig) ((Object) stackIn_7_0);
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (ig) ((Object) stackIn_6_0);
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_g = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new ig(true);
            stackOut_1_0 = (ig) (var2);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (ig) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ig) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_g = stackIn_4_1 != 0;
          return var2;
        }
    }

    cf(fe param0, fe param1) {
        super(param0);
        this.field_l = false;
        this.field_n = "";
        try {
            this.field_o = new vb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final p a(String param0, int param1) {
        p discarded$2 = null;
        qb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        p stackIn_5_0 = null;
        p stackIn_9_0 = null;
        p stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        p stackOut_4_0 = null;
        p stackOut_8_0 = null;
        p stackOut_13_0 = null;
        p stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -26188) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = this.a((String) null, 74);
                break L1;
              }
            }
            if (this.field_o.a(param0, param1 ^ 0) == sb.field_n) {
              stackOut_4_0 = sb.field_n;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0.equals(this.field_n)) {
                  break L2;
                } else {
                  var3 = ij.a(param0, (byte) -51);
                  if (var3.b(false)) {
                    this.field_n = param0;
                    this.field_l = var3.b((byte) -72);
                    break L2;
                  } else {
                    stackOut_8_0 = cd.field_a;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                if (this.field_l) {
                  stackOut_13_0 = bf.field_x;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = sb.field_n;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("cf.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void e(byte param0) {
        jh.field_c[4] = new int[]{5};
        if (param0 < -64) {
          L0: {
            fg.field_a[4] = new jl(4);
            ad.a(2, new int[]{8, 9, 10, 6}, true);
            fg.field_a[2] = new jl(2);
            if (0 >= u.field_d) {
              break L0;
            } else {
              if (!ha.a(100, nb.field_e)) {
                break L0;
              } else {
                ad.a(1, new int[]{1, 12, 13, 20, 4, 3, 7}, true);
                fg.field_a[1] = new jl(1);
                if (u.field_d > 0) {
                  if (7 != lf.field_cb) {
                    return;
                  } else {
                    lf.field_cb = 0;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (u.field_d > 0) {
            if (7 != lf.field_cb) {
              return;
            } else {
              lf.field_cb = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          field_s = (String) null;
          fg.field_a[4] = new jl(4);
          ad.a(2, new int[]{8, 9, 10, 6}, true);
          fg.field_a[2] = new jl(2);
          if (0 < u.field_d) {
            if (ha.a(100, nb.field_e)) {
              ad.a(1, new int[]{1, 12, 13, 20, 4, 3, 7}, true);
              fg.field_a[1] = new jl(1);
              if (u.field_d > 0) {
                if (7 != lf.field_cb) {
                  return;
                } else {
                  lf.field_cb = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (u.field_d > 0) {
                if (7 != lf.field_cb) {
                  return;
                } else {
                  lf.field_cb = 0;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (u.field_d > 0) {
              if (7 != lf.field_cb) {
                return;
              } else {
                lf.field_cb = 0;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_1_0 = null;
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
            if (!param1) {
              if (this.field_o.a(param0, -26188) == sb.field_n) {
                stackOut_5_0 = this.field_o.a(param0, false);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.a(param0, -26188) != sb.field_n) {
                  stackOut_10_0 = wi.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = hi.field_e;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("cf.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    static {
        field_p = "Connection restored.";
        field_j = "Quit";
        field_k = "Difficulty - EASY";
        field_m = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_s = "That name is not available";
    }
}
