/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static wk[] field_a;
    static String field_h;
    static String field_e;
    static wk[] field_d;
    static String field_f;
    static int field_b;
    static String field_g;
    static boolean[] field_c;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (af.field_b <= 0) {
              break L0;
            } else {
              int fieldTemp$8 = af.field_b - 1;
              af.field_b = af.field_b - 1;
              var2_ref_byte__ = ut.field_W[fieldTemp$8];
              ut.field_W[af.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (0 >= ul.field_d) {
              break L1;
            } else {
              byte[][] fieldTemp$9 = oo.field_d;
              int fieldTemp$10 = ul.field_d - 1;
              ul.field_d = ul.field_d - 1;
              var2_ref_byte__ = fieldTemp$9[fieldTemp$10];
              oo.field_d[ul.field_d] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (oj.field_v > 0) {
              int fieldTemp$11 = oj.field_v - 1;
              oj.field_v = oj.field_v - 1;
              var2_ref_byte__ = dh.field_j[fieldTemp$11];
              dh.field_j[oj.field_v] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (vh.field_k != null) {
            var2 = 0;
            L4: while (true) {
              if (var2 >= at.field_b.length) {
                break L3;
              } else {
                if (at.field_b[var2] == param0) {
                  if (ca.field_a[var2] > 0) {
                    ca.field_a[var2] = ca.field_a[var2] - 1;
                    var3 = vh.field_k[var2][ca.field_a[var2] - 1];
                    vh.field_k[var2][ca.field_a[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param0];
    }

    final static String[] a(int param0, String param1) {
        Object var2 = null;
        String[] var2_array = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_3_0 = null;
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
              if (param0 == -16399) {
                break L1;
              } else {
                od.a(36);
                break L1;
              }
            }
            var2 = null;
            if (-2 != param1.length()) {
              var3 = dj.a(77, ' ', param1);
              var2_array = var3;
              if (-2 != var3.length) {
                stackOut_8_0 = (String[]) var2_array;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String[]) (Object) stackIn_7_0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("od.D(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
        if (param0 != -1) {
            field_e = null;
        }
    }

    final synchronized static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1.length != 100) {
                break L1;
              } else {
                if (af.field_b < 1000) {
                  int fieldTemp$4 = af.field_b;
                  af.field_b = af.field_b + 1;
                  ut.field_W[fieldTemp$4] = param1;
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1.length != 5000) {
                break L2;
              } else {
                if (ul.field_d >= 250) {
                  break L2;
                } else {
                  byte[][] fieldTemp$5 = oo.field_d;
                  int fieldTemp$6 = ul.field_d;
                  ul.field_d = ul.field_d + 1;
                  fieldTemp$5[fieldTemp$6] = param1;
                  return;
                }
              }
            }
            L3: {
              if (~param1.length != param0) {
                break L3;
              } else {
                if (oj.field_v < 50) {
                  int fieldTemp$7 = oj.field_v;
                  oj.field_v = oj.field_v + 1;
                  dh.field_j[fieldTemp$7] = param1;
                  return;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (vh.field_k == null) {
                break L4;
              } else {
                var2_int = 0;
                L5: while (true) {
                  if (~at.field_b.length >= ~var2_int) {
                    break L4;
                  } else {
                    L6: {
                      if (~at.field_b[var2_int] != ~param1.length) {
                        break L6;
                      } else {
                        if (vh.field_k[var2_int].length <= ca.field_a[var2_int]) {
                          break L6;
                        } else {
                          ca.field_a[var2_int] = ca.field_a[var2_int] + 1;
                          vh.field_k[var2_int][ca.field_a[var2_int]] = param1;
                          return;
                        }
                      }
                    }
                    var2_int++;
                    continue L5;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("od.B(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Army Setup";
        field_h = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new boolean[]{false, true, true, false, true, true};
        field_e = "to keep fullscreen or";
        field_g = "Training";
    }
}
