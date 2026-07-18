/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vd {
    static String field_d;
    static wl field_c;
    static la field_e;
    static int field_f;
    static String field_b;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (qk.field_p < param0) {
                break L1;
              } else {
                if (j.field_q > param5) {
                  break L1;
                } else {
                  L2: {
                    if (param4 < kn.field_e) {
                      param4 = kn.field_e;
                      var7 = 0;
                      break L2;
                    } else {
                      if (qg.field_z < param4) {
                        var7 = 0;
                        param4 = qg.field_z;
                        break L2;
                      } else {
                        var7 = 1;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (param2 < kn.field_e) {
                      var8 = 0;
                      param2 = kn.field_e;
                      break L3;
                    } else {
                      if (qg.field_z < param2) {
                        param2 = qg.field_z;
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = 1;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param0 < j.field_q) {
                      param0 = j.field_q;
                      break L4;
                    } else {
                      int incrementValue$2 = param0;
                      param0++;
                      di.a(param4, (byte) -101, param3, qd.field_a[incrementValue$2], param2);
                      break L4;
                    }
                  }
                  L5: {
                    if (qk.field_p < param5) {
                      param5 = qk.field_p;
                      break L5;
                    } else {
                      int incrementValue$3 = param5;
                      param5--;
                      di.a(param4, (byte) 113, param3, qd.field_a[incrementValue$3], param2);
                      break L5;
                    }
                  }
                  L6: {
                    if (var7 == 0) {
                      break L6;
                    } else {
                      if (var8 != 0) {
                        var9 = param0;
                        L7: while (true) {
                          if (var9 > param5) {
                            break L1;
                          } else {
                            var15 = qd.field_a[var9];
                            var14 = var15;
                            var13 = var14;
                            var12 = var13;
                            var10 = var12;
                            var15[param2] = param3;
                            var10[param4] = param3;
                            var9++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var7 != 0) {
                    var9 = param0;
                    L8: while (true) {
                      if (var9 > param5) {
                        break L1;
                      } else {
                        qd.field_a[var9][param4] = param3;
                        var9++;
                        continue L8;
                      }
                    }
                  } else {
                    if (var8 != 0) {
                      var9 = param0;
                      L9: while (true) {
                        if (param5 < var9) {
                          break L1;
                        } else {
                          qd.field_a[var9][param2] = param3;
                          var9++;
                          continue L9;
                        }
                      }
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
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var6, "vd.B(" + param0 + ',' + -89 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        df var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        qp var12 = null;
        df var13 = null;
        int[] var14 = null;
        nh var15 = null;
        Object var16 = null;
        nh var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var13 = kj.field_d;
              var2 = var13.i((byte) -101);
              if (var2 != 0) {
                if (var2 != 1) {
                  if (2 != var2) {
                    nn.a("A1: " + me.a(-1), (Throwable) null, -9958);
                    int discarded$4 = 1;
                    ih.b();
                    break L1;
                  } else {
                    var16_ref = (nh) (Object) to.field_q.b(0);
                    if (var16_ref == null) {
                      int discarded$5 = 1;
                      ih.b();
                      return;
                    } else {
                      var16_ref.field_r = kb.a((byte) -91);
                      var16_ref.field_m = var16_ref.field_r[0];
                      var16_ref.field_n = true;
                      var16_ref.f(0);
                      break L1;
                    }
                  }
                } else {
                  var12 = (qp) (Object) tl.field_p.b(0);
                  if (var12 != null) {
                    var12.f(0);
                    break L1;
                  } else {
                    int discarded$6 = 1;
                    ih.b();
                    return;
                  }
                }
              } else {
                var11 = kb.a((byte) -84);
                var19 = var11;
                var18 = var19;
                var17 = var18;
                var14 = var17;
                var3 = var14;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((fj) (Object) var5).i((byte) -101);
                var7 = 0;
                L2: while (true) {
                  if (var6 <= var7) {
                    var15 = (nh) (Object) to.field_q.b(0);
                    if (var15 != null) {
                      var15.field_r = var3;
                      var15.field_n = true;
                      var15.field_m = var19[0];
                      var15.f(0);
                      break L1;
                    } else {
                      int discarded$7 = 1;
                      ih.b();
                      return;
                    }
                  } else {
                    var10[var7] = ((fj) (Object) var5).c((byte) -65);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "vd.A(" + 27912 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Torquing.field_u;
        try {
          var3 = lk.a(false, 23, param1);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var4 = 0;
            L0: while (true) {
              if (var4 < param1.length()) {
                if (co.a(-112, param1.charAt(var4))) {
                  var4++;
                  continue L0;
                } else {
                  stackOut_9_0 = wc.field_s;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("vd.D(").append(-127).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Continue";
        field_f = -2147483648;
        field_a = "Guide <col=2>Torquing</col> to the flag across the maze of platforms. Be careful not to run out of time or fall to your doom!";
    }
}
