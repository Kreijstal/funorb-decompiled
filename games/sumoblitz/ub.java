/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ms {
    byte[] field_k;
    int field_l;
    long field_m;

    final static void a(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        ah var1;
        int var2;
        int var3;
        int var4;
        ah var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var5 = aa.field_a[0];
        var1 = var5;
        if (param0 >= 18) {
          L0: {
            if (ar.field_G != 1) {
              L1: {
                L2: {
                  if (hw.field_b[99]) {
                    break L2;
                  } else {
                    if (hw.field_b[Sumoblitz.field_I]) {
                      break L2;
                    } else {
                      stackIn_9_0 = 0;
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 256;
                break L1;
              }
              L3: {
                L4: {

                  if (hw.field_b[98]) {
                    break L4;
                  } else {

                    if (hw.field_b[nv.field_c]) {
                      break L4;
                    } else {
                      stackIn_13_0 = stackIn_9_0;
                      stackIn_13_1 = 0;
                      break L3;
                    }
                  }
                }
                stackIn_13_0 = stackIn_9_0;
                stackIn_13_1 = -256;
                break L3;
              }
              L5: {
                L6: {
                  var3 = stackIn_13_0 + stackIn_13_1;
                  if (hw.field_b[96]) {
                    break L6;
                  } else {
                    if (hw.field_b[rp.field_d]) {
                      break L6;
                    } else {
                      stackIn_17_0 = 0;
                      break L5;
                    }
                  }
                }
                stackIn_17_0 = -256;
                break L5;
              }
              L7: {
                L8: {

                  if (hw.field_b[97]) {
                    break L8;
                  } else {


                    if (!hw.field_b[ad.field_o]) {
                      stackIn_22_0 = stackIn_17_0;
                      stackIn_22_1 = 0;
                      break L7;
                    } else {

                      break L8;
                    }
                  }
                }
                stackIn_22_0 = stackIn_17_0;
                stackIn_22_1 = 256;
                break L7;
              }
              L9: {
                var2 = stackIn_22_0 + stackIn_22_1;
                if (var2 == 0) {
                  break L9;
                } else {
                  if (var3 != 0) {
                    var5.b(-109, var3 / 22, var2 / 22);
                    kp.field_a = true;
                    if (hw.field_b[83]) {
                      if (!var5.n(123)) {
                        var5.b(false);
                        if (-2 == (var5.field_l ^ -1)) {
                          if (!var5.j(20)) {
                            gn.a(33, true);
                            return;
                          } else {
                            gn.a(29, true);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        var5.k((byte) -90);
                        return;
                      }
                    } else {
                      var5.m(-95);
                      return;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              if (-1 != (var2 ^ -1)) {
                var5.b(-119, var3, var2);
                kp.field_a = true;
                break L0;
              } else {
                if (-1 != (var3 ^ -1)) {
                  var5.b(-119, var3, var2);
                  kp.field_a = true;
                  if (hw.field_b[83]) {
                    if (!var5.n(123)) {
                      var5.b(false);
                      if (-2 == (var5.field_l ^ -1)) {
                        if (!var5.j(20)) {
                          gn.a(33, true);
                          return;
                        } else {
                          gn.a(29, true);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      var5.k((byte) -90);
                      return;
                    }
                  } else {
                    var5.m(-95);
                    return;
                  }
                } else {
                  break L0;
                }
              }
            } else {
              var5.a(false, pi.field_e << 912686984, ko.field_p << -490324056);
              kp.field_a = true;
              break L0;
            }
          }
          if (hw.field_b[83]) {
            if (!var5.n(123)) {
              var5.b(false);
              if (-2 == (var5.field_l ^ -1)) {
                if (!var5.j(20)) {
                  gn.a(33, true);
                  return;
                } else {
                  gn.a(29, true);
                  return;
                }
              } else {
                return;
              }
            } else {
              var5.k((byte) -90);
              return;
            }
          } else {
            var5.m(-95);
            return;
          }
        } else {
          return;
        }
    }

    ub(long param0, int param1, byte[] param2) {
        try {
            this.field_l = param1;
            this.field_k = param2;
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ub.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static wb[] a(ki param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wb[] stackIn_2_0 = null;
        wb[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param0.a(0, param1);
            if (param2 == -56) {
              var5 = param0.a(var4_int, param3, (byte) 126);
              stackIn_4_0 = kr.a(19889, param0, var5, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wb[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ub.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
