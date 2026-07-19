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
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            if (pb.field_a != r.field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_long = dd.b(param1 + 198);
                if (jl.field_h == 0) {
                  break L1;
                } else {
                  if (0 > t.field_C) {
                    var4_ref_q = (q) ((Object) le.field_e.c(-3905));
                    if (var4_ref_q == null) {
                      break L1;
                    } else {
                      if (var2_long <= var4_ref_q.field_g) {
                        break L1;
                      } else {
                        var4_ref_q.b(4);
                        il.field_g = var4_ref_q.field_k.length;
                        se.field_p.field_g = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (var5_int >= il.field_g) {
                            wc.field_i = hh.field_a;
                            hh.field_a = bh.field_d;
                            bh.field_d = vh.field_t;
                            vh.field_t = var4_ref_q.field_f;
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            se.field_p.field_f[var5_int] = var4_ref_q.field_k[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (param1 == -99) {
                  break L3;
                } else {
                  field_a = (String) null;
                  break L3;
                }
              }
              L4: while (true) {
                L5: {
                  if (t.field_C < 0) {
                    se.field_p.field_g = 0;
                    if (ag.a(125, 1)) {
                      t.field_C = se.field_p.m(255);
                      se.field_p.field_g = 0;
                      il.field_g = param0[t.field_C];
                      break L5;
                    } else {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L5;
                  }
                }
                if (!fk.a(false)) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
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
                        le.field_e.b(80, var5);
                        t.field_C = -1;
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
                    stackOut_28_0 = 1;
                    stackIn_29_0 = stackOut_28_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var2);
            stackOut_38_1 = new StringBuilder().append("ll.C(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_29_0 != 0;
              }
            }
          }
        }
    }

    final static java.applet.Applet b(int param0) {
        java.applet.Applet discarded$0 = null;
        if (oj.field_f != null) {
            return oj.field_f;
        }
        if (param0 < 67) {
            discarded$0 = ll.b(8);
        }
        return (java.applet.Applet) ((Object) ic.field_b);
    }

    final static hh a(boolean param0, byte param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param1 == -49) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              var6 = null;
              if (-1 == param2.indexOf('@')) {
                var7 = (CharSequence) ((Object) param2);
                var4_long = ik.a(var7, (byte) -83);
                break L2;
              } else {
                var6 = param2;
                break L2;
              }
            }
            stackOut_5_0 = ik.a(param3, -66, var4_long, (String) (var6), param0);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("ll.B(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = (String) null;
        }
    }

    static {
        field_a = "Name is available";
    }
}
