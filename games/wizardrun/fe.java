/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fe extends mf {
    static int field_l;
    private og field_k;

    fe(og param0, og param1) {
        super(param0);
        try {
            ((fe) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fe.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final ok a(int param0, String param1) {
        dk var3 = null;
        RuntimeException var3_ref = null;
        ok stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        ok stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ok stackOut_3_0 = null;
        ok stackOut_10_0 = null;
        ok stackOut_9_0 = null;
        Object stackOut_6_0 = null;
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
            L1: {
              if (!(((fe) this).field_k instanceof wa)) {
                break L1;
              } else {
                var3 = ((wa) (Object) ((fe) this).field_k).a((byte) 119);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a(true) == gf.field_V) {
                    break L1;
                  } else {
                    stackOut_3_0 = hg.field_c;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0;
                  }
                }
              }
            }
            if (param0 == -1) {
              L2: {
                if (!param1.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                  stackOut_10_0 = hg.field_c;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = gf.field_V;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (ok) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("fe.C(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    final String a(String param0, int param1) {
        dk var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (((fe) this).field_k instanceof wa) {
                var3 = ((wa) (Object) ((fe) this).field_k).a((byte) 113);
                if (var3 != null) {
                  L2: {
                    if (var3.a(true) != gf.field_V) {
                      break L2;
                    } else {
                      if (!param0.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                        stackOut_7_0 = ec.field_h;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_9_0 = var3.a(-2864);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 == -1) {
                break L3;
              } else {
                fe.c((byte) -51);
                break L3;
              }
            }
            if (!param0.equals((Object) (Object) ((fe) this).field_k.field_k)) {
              stackOut_15_0 = ec.field_h;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("fe.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_16_0;
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ob var3 = null;
        ob var4 = null;
        ob stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_3_0 = null;
        ob stackOut_4_0 = null;
        var2 = wizardrun.field_H;
        try {
          L0: {
            var3 = new ob();
            var4 = var3;
            var4.field_b = 0;
            if (param0 > 91) {
              stackOut_3_0 = (ob) var4;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                if (stackIn_5_0.field_b >= 20) {
                  if (wi.field_K == 0) {
                    ld.field_d.e(aa.field_ib.field_b * 24, 336 - aa.field_ib.field_a * 24);
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  var4.field_a = 0;
                  L2: while (true) {
                    if (var4.field_a >= 15) {
                      var4.field_b = var4.field_b + 1;
                      stackOut_4_0 = (ob) var4;
                      stackIn_5_0 = stackOut_4_0;
                      continue L1;
                    } else {
                      L3: {
                        if (tc.field_l.field_j[var3.a((byte) -68)] <= 0) {
                          break L3;
                        } else {
                          lk.field_b[-1 + tc.field_l.field_j[var3.a((byte) -68)]].e(32 * var4.field_b, 32 * (-var4.field_a + 14));
                          break L3;
                        }
                      }
                      L4: {
                        if (0 >= tc.field_l.field_a[var3.a((byte) -68)]) {
                          break L4;
                        } else {
                          if (oc.field_b[-1 + tc.field_l.field_a[var3.a((byte) -68)]] == null) {
                            break L4;
                          } else {
                            oc.field_b[-1 + tc.field_l.field_a[var3.a((byte) -68)]][0].e(var4.field_b * 32, 32 * (-1 + (15 + -var4.field_a)));
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (!tc.field_l.field_d[var3.a((byte) -68)]) {
                          break L5;
                        } else {
                          if (!ke.field_w) {
                            break L5;
                          } else {
                            ed.d(32 * var4.field_b, -32 + (480 + -(var4.field_a * 32)), 32, 32, 16777215, 128);
                            break L5;
                          }
                        }
                      }
                      var4.field_a = var4.field_a + 1;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "fe.B(" + param0 + 41);
        }
    }

    static {
    }
}
