/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ms {
    byte[] field_k;
    int field_l;
    long field_m;

    final static void a() {
        ah var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ah var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          var5 = aa.field_a[0];
          var1 = var5;
          if (ar.field_G != 1) {
            L1: {
              L2: {
                if (hw.field_b[99]) {
                  break L2;
                } else {
                  if (hw.field_b[Sumoblitz.field_I]) {
                    break L2;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 256;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            L3: {
              L4: {
                stackOut_7_0 = stackIn_7_0;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (hw.field_b[98]) {
                  break L4;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (hw.field_b[nv.field_c]) {
                    break L4;
                  } else {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 0;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
              }
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = -256;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L3;
            }
            L5: {
              L6: {
                var3 = stackIn_11_0 + stackIn_11_1;
                if (hw.field_b[96]) {
                  break L6;
                } else {
                  if (hw.field_b[rp.field_d]) {
                    break L6;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
              }
              stackOut_14_0 = -256;
              stackIn_15_0 = stackOut_14_0;
              break L5;
            }
            L7: {
              L8: {
                stackOut_15_0 = stackIn_15_0;
                stackIn_18_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (hw.field_b[97]) {
                  break L8;
                } else {
                  stackOut_16_0 = stackIn_16_0;
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (!hw.field_b[ad.field_o]) {
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L7;
                  } else {
                    stackOut_17_0 = stackIn_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    break L8;
                  }
                }
              }
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = 256;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L7;
            }
            L9: {
              var2 = stackIn_20_0 + stackIn_20_1;
              if (var2 == 0) {
                break L9;
              } else {
                if (var3 != 0) {
                  var5.b(-109, var3 / 22, var2 / 22);
                  kp.field_a = true;
                  if (!hw.field_b[83]) {
                    var5.m(-95);
                    return;
                  } else {
                    if (!var5.n(123)) {
                      var5.b(false);
                      if (var5.field_l == 1) {
                        if (var5.j(20)) {
                          gn.a(29, true);
                          return;
                        } else {
                          gn.a(33, true);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      var5.k((byte) -90);
                      return;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            if (var2 != 0) {
              var5.b(-119, var3, var2);
              kp.field_a = true;
              break L0;
            } else {
              if (var3 != 0) {
                var5.b(-119, var3, var2);
                kp.field_a = true;
                if (!hw.field_b[83]) {
                  var5.m(-95);
                  return;
                } else {
                  if (!var5.n(123)) {
                    var5.b(false);
                    if (var5.field_l == 1) {
                      if (var5.j(20)) {
                        gn.a(29, true);
                        return;
                      } else {
                        gn.a(33, true);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    var5.k((byte) -90);
                    return;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            var5.a(false, pi.field_e << 8, ko.field_p << 8);
            kp.field_a = true;
            break L0;
          }
        }
        if (!hw.field_b[83]) {
          var5.m(-95);
          return;
        } else {
          if (!var5.n(123)) {
            var5.b(false);
            if (var5.field_l == 1) {
              if (var5.j(20)) {
                gn.a(29, true);
                return;
              } else {
                gn.a(33, true);
                return;
              }
            } else {
              return;
            }
          } else {
            var5.k((byte) -90);
            return;
          }
        }
    }

    ub(long param0, int param1, byte[] param2) {
        try {
            ((ub) this).field_l = param1;
            ((ub) this).field_k = param2;
            ((ub) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ub.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static wb[] a(ki param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wb[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        wb[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            var4_int = param0.a(0, param1);
            var5 = param0.a(var4_int, param3, (byte) 126);
            stackOut_2_0 = kr.a(19889, param0, var5, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ub.A(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(-56).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
    }
}
