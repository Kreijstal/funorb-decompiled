/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class df {
    int field_l;
    int field_k;
    static String field_c;
    static tk field_b;
    static vh field_f;
    static String field_m;
    static String[] field_a;
    private int field_g;
    static int field_e;
    boolean field_h;
    boolean field_j;
    int field_d;
    static dd field_i;

    final boolean a(byte param0, int param1, al param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == -8) {
              L1: {
                L2: {
                  if (!((df) this).field_h) {
                    break L2;
                  } else {
                    L3: {
                      if (!param2.field_l[((df) this).field_g].field_s) {
                        break L3;
                      } else {
                        if (param1 == ((df) this).field_g) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  }
                }
                stackOut_10_0 = 1;
                stackIn_13_0 = stackOut_10_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("df.F(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        String stackIn_35_0 = null;
        String stackIn_38_0 = null;
        String stackIn_41_0 = null;
        String stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_9_0 = null;
        String stackOut_16_0 = null;
        String stackOut_21_0 = null;
        String stackOut_26_0 = null;
        String stackOut_34_0 = null;
        String stackOut_42_0 = null;
        String stackOut_40_0 = null;
        String stackOut_37_0 = null;
        Object stackOut_29_0 = null;
        try {
          L0: {
            if (sf.field_y < 2) {
              stackOut_3_0 = kg.field_q;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (null != wh.field_a) {
                if (wh.field_a.d(84)) {
                  stackOut_11_0 = ud.field_F;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_9_0 = ir.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                if (!uj.field_d.d(101)) {
                  stackOut_16_0 = rp.field_c;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  if (!uj.field_d.a("commonui", 0)) {
                    stackOut_21_0 = oj.field_t + " - " + uj.field_d.a(100, "commonui") + "%";
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  } else {
                    if (!vf.field_nb.d(-127)) {
                      stackOut_26_0 = gh.field_Q;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0;
                    } else {
                      if (param0 == 84) {
                        if (!vf.field_nb.a("commonui", 0)) {
                          stackOut_34_0 = kb.field_a + " - " + vf.field_nb.a(100, "commonui") + "%";
                          stackIn_35_0 = stackOut_34_0;
                          return stackIn_35_0;
                        } else {
                          if (rg.field_r.d(66)) {
                            if (rg.field_r.c(-63)) {
                              stackOut_42_0 = cl.field_j;
                              stackIn_43_0 = stackOut_42_0;
                              break L0;
                            } else {
                              stackOut_40_0 = cf.field_c + " - " + rg.field_r.b(0) + "%";
                              stackIn_41_0 = stackOut_40_0;
                              return stackIn_41_0;
                            }
                          } else {
                            stackOut_37_0 = de.field_e;
                            stackIn_38_0 = stackOut_37_0;
                            return stackIn_38_0;
                          }
                        }
                      } else {
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        return (String) (Object) stackIn_30_0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "df.E(" + param0 + ')');
        }
        return stackIn_43_0;
    }

    final void a(int param0, pq param1, al param2) {
        RuntimeException var4 = null;
        long var4_long = 0L;
        long var6 = 0L;
        pq var8_ref_pq = null;
        int[] var8_ref_int__ = null;
        long var8 = 0L;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (((df) this).field_h) {
                var8_ref_pq = param2.field_l[((df) this).field_g];
                var4_long = (long)param1.field_g + -(long)var8_ref_pq.field_g;
                var6 = -(long)var8_ref_pq.field_k + (long)param1.field_k;
                var4_long = var4_long >> 8;
                var6 = var6 >> 8;
                break L1;
              } else {
                var8_ref_int__ = param2.field_e[((df) this).field_g];
                var4_long = -(long)var8_ref_int__[0] + (long)param1.field_g;
                var4_long = var4_long >> 8;
                var6 = (long)param1.field_k + -(long)var8_ref_int__[1];
                var6 = var6 >> 8;
                break L1;
              }
            }
            L2: {
              var8 = bm.a(-119, var4_long * var4_long + var6 * var6);
              if (-2147483648L > var8) {
                break L2;
              } else {
                if (var8 > 2147483647L) {
                  break L2;
                } else {
                  L3: {
                    if (param0 == 1763073386) {
                      break L3;
                    } else {
                      field_e = 62;
                      break L3;
                    }
                  }
                  ((df) this).field_l = (int)var8;
                  break L0;
                }
              }
            }
            throw new IllegalStateException("dist too big when checking for visibility.");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("df.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              if (param0 >= 82) {
                break L1;
              } else {
                String discarded$2 = df.a((byte) -85);
                break L1;
              }
            }
            field_a = null;
            field_c = null;
            field_i = null;
            field_f = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "df.A(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((df) this).field_h = param1;
              if (param2) {
                break L1;
              } else {
                ((df) this).field_g = -112;
                break L1;
              }
            }
            ((df) this).field_g = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "df.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(al param0, pq param1, int param2) {
        pq var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -6661) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            if (!((df) this).field_h) {
              var4_array = param0.field_e[((df) this).field_g];
              stackOut_6_0 = 8191 & tj.c(var4_array[0] - param1.field_g >> 209920874, -param1.field_k + var4_array[1] >> 509324874, 4096);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              var4 = param0.field_l[((df) this).field_g];
              stackOut_4_0 = 8191 & tj.c(var4.field_g - param1.field_g >> -1483681046, var4.field_k - param1.field_k >> 1763073386, 4096);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("df.G(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        long stackIn_7_2 = 0L;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        long stackOut_6_2 = 0L;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        long stackOut_4_2 = 0L;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 1048576) {
              L1: {
                stackOut_3_0 = ((df) this).field_l;
                stackOut_3_1 = -112;
                stackIn_6_0 = stackOut_3_0;
                stackIn_6_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (!((df) this).field_h) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 524288L;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 1048576L;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  stackIn_7_2 = stackOut_4_2;
                  break L1;
                }
              }
              stackOut_7_0 = dn.a(lh.a(stackIn_7_0, (byte) stackIn_7_1, stackIn_7_2), false);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = -61;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "df.B(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = "Passwords must be between 5 and 20 letters and numbers";
        field_m = "Cancel rematch";
    }
}
