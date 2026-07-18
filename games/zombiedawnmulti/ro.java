/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends kb {
    static th field_M;
    static cj field_O;
    static boolean field_L;
    static String field_N;

    ro(String[] param0, fc param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_N = null;
        field_M = null;
        field_O = null;
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 <= -118) {
              var3_int = 0;
              var4 = param2.length();
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (param1 != param2.charAt(var5)) {
                      var5++;
                      break L2;
                    } else {
                      var3_int++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 101;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ro.C(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(k param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ek var3_ref = null;
        ce var3_ref2 = null;
        int var4_int = 0;
        bf var4 = null;
        int var5 = 0;
        int var6 = 0;
        pa var7 = null;
        og var8 = null;
        ge var9 = null;
        k stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        k stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        k stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        k stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        k stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        k stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.a(-110, ((ro) this).field_r);
              param0.a(((ro) this).field_H, (byte) -96);
              stackOut_1_0 = (k) param0;
              stackOut_1_1 = 109;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((ro) this).field_i) {
                stackOut_3_0 = (k) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (k) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            ((k) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2);
            param0.a(((ro) this).field_C, (byte) -121);
            param0.a(((ro) this).field_I, (byte) -55);
            param0.a(((ro) this).field_g, (byte) -54);
            param0.a(-73, ((ro) this).field_l);
            var3_int = 0;
            L2: while (true) {
              if (((ro) this).field_t <= var3_int) {
                var3_ref = (ek) (Object) ((ro) this).field_K.c(40);
                L3: while (true) {
                  if (var3_ref == null) {
                    var3_ref2 = (ce) (Object) ((ro) this).field_s.c(102);
                    L4: while (true) {
                      if (var3_ref2 == null) {
                        var3_int = 11 + 16 * ((ro) this).field_t - -((((ro) this).field_K.a(0) - -((ro) this).field_s.a(0) + ((ro) this).field_A.a(0)) * 8);
                        if (57 + var3_int > 2000) {
                          param0.a(117, 0);
                          return;
                        } else {
                          var4 = (bf) (Object) ((ro) this).field_A.c(59);
                          if (param1 < -107) {
                            L5: while (true) {
                              if (var4 == null) {
                                param0.a(-106, 0);
                                break L0;
                              } else {
                                param0.a(-94, 4);
                                param0.a(-36, 0);
                                param0.a(var4.field_i, (byte) -104);
                                param0.a(var4.field_l, (byte) -107);
                                var5 = 0;
                                var5 = var5 | var4.field_o << 30;
                                param0.a(var5, (byte) -105);
                                var4 = (bf) (Object) ((ro) this).field_A.b(6);
                                continue L5;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        param0.a(-64, 5);
                        param0.a(112, var3_ref2.field_q);
                        param0.a((var3_ref2.field_m + ip.field_f) * 24, (byte) -69);
                        param0.a((ip.field_f + var3_ref2.field_t) * 24, (byte) -54);
                        param0.a(var3_ref2.field_s, (byte) -103);
                        var3_ref2 = (ce) (Object) ((ro) this).field_s.b(6);
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      L7: {
                        if (var3_ref instanceof pa) {
                          var7 = (pa) (Object) var3_ref;
                          if (var7.field_Q == 21) {
                            break L6;
                          } else {
                            if (!var7.field_Z) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        int discarded$1 = -105;
                        param0.a(108, this.a(var3_ref));
                        param0.a(110, var3_ref.field_x);
                        param0.a(var3_ref.e((byte) -112), (byte) -67);
                        param0.a(var3_ref.g(1829947600), (byte) -95);
                        var4_int = var3_ref.field_D;
                        if (var3_ref instanceof ge) {
                          var9 = (ge) (Object) var3_ref;
                          var4_int = var4_int | var9.field_gb << 30;
                          break L8;
                        } else {
                          if (var3_ref instanceof og) {
                            var8 = (og) (Object) var3_ref;
                            if (var8.field_Q) {
                              var4_int = var4_int | 536870912;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var4_int = var4_int & 255 | (-16777216 & var4_int) >> 16;
                      param0.a(var4_int, (byte) -104);
                      break L6;
                    }
                    var3_ref = (ek) (Object) ((ro) this).field_K.b(6);
                    continue L3;
                  }
                }
              } else {
                param0.a(110, ((ro) this).field_y[var3_int]);
                param0.d(((ro) this).field_D[var3_int][0], -8593);
                param0.d(((ro) this).field_D[var3_int][1], -8593);
                param0.a(((ro) this).field_d[var3_int], (byte) -84);
                param0.d((int)(((ro) this).field_e[var3_int] >>> 40), -8593);
                param0.a(((ro) this).field_a[var3_int], (byte) -85);
                param0.a(((ro) this).field_z[var3_int], (byte) -78);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("ro.E(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param1 + ')');
        }
    }

    private final int a(ek param0) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
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
            if (param0 instanceof ge) {
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              if (!(param0 instanceof lm)) {
                if (!(param0 instanceof og)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  stackOut_5_0 = 3;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                stackOut_2_0 = 2;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ro.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -105 + ')');
        }
        return stackIn_10_0;
    }

    final static int c() {
        return (li.field_C << 4) + ((qe.field_g << 2) - -ba.field_q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "? ? ?";
    }
}
