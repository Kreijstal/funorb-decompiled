/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static ga field_b;
    static java.applet.Applet field_a;
    static String field_e;
    static int field_d;
    static int field_c;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -43) {
                break L1;
              } else {
                field_d = -126;
                break L1;
              }
            }
            field_a = null;
            field_e = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ej.B(" + param0 + ')');
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var2_int = 0;
        byte[] var3 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_17_0 = null;
        byte[] stackIn_33_0 = null;
        byte[] stackIn_36_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_4_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_16_0 = null;
        byte[] stackOut_32_0 = null;
        byte[] stackOut_35_0 = null;
        try {
          L0: {
            L1: {
              if (param0 != 100) {
                break L1;
              } else {
                if (0 >= p.field_U) {
                  break L1;
                } else {
                  int fieldTemp$4 = p.field_U - 1;
                  p.field_U = p.field_U - 1;
                  var2_array = ec.field_f[fieldTemp$4];
                  ec.field_f[p.field_U] = null;
                  stackOut_4_0 = (byte[]) var2_array;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            L2: {
              if (param0 != 5000) {
                break L2;
              } else {
                if (dj.field_d <= 0) {
                  break L2;
                } else {
                  int fieldTemp$5 = dj.field_d - 1;
                  dj.field_d = dj.field_d - 1;
                  var2_array = wl.field_g[fieldTemp$5];
                  wl.field_g[dj.field_d] = null;
                  stackOut_10_0 = (byte[]) var2_array;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
            L3: {
              if (param0 != 30000) {
                break L3;
              } else {
                if (id.field_a <= 0) {
                  break L3;
                } else {
                  byte[][] fieldTemp$6 = qh.field_a;
                  int fieldTemp$7 = id.field_a - 1;
                  id.field_a = id.field_a - 1;
                  var2_array = fieldTemp$6[fieldTemp$7];
                  qh.field_a[id.field_a] = null;
                  stackOut_16_0 = (byte[]) var2_array;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                }
              }
            }
            L4: {
              if (param1 == 1) {
                break L4;
              } else {
                field_e = null;
                break L4;
              }
            }
            L5: {
              if (th.field_a != null) {
                var2_int = 0;
                L6: while (true) {
                  if (~mj.field_a.length >= ~var2_int) {
                    break L5;
                  } else {
                    L7: {
                      if (param0 != mj.field_a[var2_int]) {
                        break L7;
                      } else {
                        if (0 >= pe.field_C[var2_int]) {
                          break L7;
                        } else {
                          pe.field_C[var2_int] = pe.field_C[var2_int] - 1;
                          var3 = th.field_a[var2_int][pe.field_C[var2_int] - 1];
                          th.field_a[var2_int][pe.field_C[var2_int]] = null;
                          stackOut_32_0 = (byte[]) var3;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        }
                      }
                    }
                    var2_int++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            stackOut_35_0 = new byte[param0];
            stackIn_36_0 = stackOut_35_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "ej.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_36_0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2 <= 1) {
                    break L3;
                  } else {
                    stackOut_3_0 = -1;
                    stackOut_3_1 = ~(param2 & 1);
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_11_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          var3_int = var3_int * param0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param0 = param0 * param0;
                      param2 = param2 >> 1;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = ~param2;
                stackOut_10_1 = -2;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              }
              if (stackIn_11_0 == stackIn_11_1) {
                stackOut_13_0 = param0 * var3_int;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              } else {
                if (param1 == -1) {
                  stackOut_18_0 = var3_int;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  stackOut_16_0 = -47;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "ej.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ga();
        field_e = "Loading music";
    }
}
