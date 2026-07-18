/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static String field_a;

    final static boolean a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        q var4_ref_q = null;
        int var4 = 0;
        int var5_int = 0;
        q var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = StarCannon.field_A;
        try {
          if (pb.field_a != r.field_c) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            L0: {
              L1: {
                var2_long = dd.b(99);
                if (jl.field_h == 0) {
                  break L1;
                } else {
                  if (0 > t.field_C) {
                    L2: {
                      var4_ref_q = (q) (Object) le.field_e.c(-3905);
                      if (var4_ref_q == null) {
                        break L2;
                      } else {
                        if (var2_long <= var4_ref_q.field_g) {
                          break L2;
                        } else {
                          var4_ref_q.b(4);
                          il.field_g = var4_ref_q.field_k.length;
                          se.field_p.field_g = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (var5_int >= il.field_g) {
                              wc.field_i = hh.field_a;
                              hh.field_a = bh.field_d;
                              bh.field_d = vh.field_t;
                              vh.field_t = var4_ref_q.field_f;
                              stackOut_13_0 = 1;
                              stackIn_14_0 = stackOut_13_0;
                              return stackIn_14_0 != 0;
                            } else {
                              se.field_p.field_f[var5_int] = var4_ref_q.field_k[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_16_0 = t.field_C;
                    stackIn_18_0 = stackOut_16_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_15_0 = t.field_C;
              stackIn_18_0 = stackOut_15_0;
              break L0;
            }
            L4: while (true) {
              L5: {
                if (stackIn_18_0 < 0) {
                  se.field_p.field_g = 0;
                  if (ag.a(125, 1)) {
                    t.field_C = se.field_p.m(255);
                    se.field_p.field_g = 0;
                    il.field_g = param0[t.field_C];
                    break L5;
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  }
                } else {
                  break L5;
                }
              }
              if (!fk.a(false)) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0 != 0;
              } else {
                if (jl.field_h != 0) {
                  L6: {
                    var4 = jl.field_h;
                    if (fc.field_b == 0.0) {
                      break L6;
                    } else {
                      var4 = (int)((double)var4 + di.field_l.nextGaussian() * fc.field_b);
                      if (0 > var4) {
                        var4 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5 = new q(var2_long + (long)var4, t.field_C, new byte[il.field_g]);
                  var6 = 0;
                  L7: while (true) {
                    if (var6 >= il.field_g) {
                      le.field_e.b(80, (rf) (Object) var5);
                      t.field_C = -1;
                      stackOut_17_0 = t.field_C;
                      stackIn_18_0 = stackOut_17_0;
                      continue L4;
                    } else {
                      var5.field_k[var6] = se.field_p.field_f[var6];
                      var6++;
                      continue L7;
                    }
                  }
                } else {
                  wc.field_i = hh.field_a;
                  hh.field_a = bh.field_d;
                  bh.field_d = vh.field_t;
                  vh.field_t = t.field_C;
                  t.field_C = -1;
                  stackOut_29_0 = 1;
                  stackIn_30_0 = stackOut_29_0;
                  return stackIn_30_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("ll.C(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + -99 + ')');
        }
    }

    final static java.applet.Applet b(int param0) {
        if (oj.field_f != null) {
            return oj.field_f;
        }
        if (param0 < 67) {
            java.applet.Applet discarded$0 = ll.b(8);
        }
        return (java.applet.Applet) (Object) ic.field_b;
    }

    final static hh a(boolean param0, byte param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
              var4_long = 0L;
              var6 = null;
              if (-1 == param2.indexOf('@')) {
                var7 = (CharSequence) (Object) param2;
                var4_long = ik.a(var7, (byte) -83);
                break L1;
              } else {
                var6 = (Object) (Object) param2;
                break L1;
              }
            }
            stackOut_3_0 = ik.a(param3, -66, var4_long, (String) var6, false);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ll.B(").append(false).append(',').append(-49).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Name is available";
    }
}
