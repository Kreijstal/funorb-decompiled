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
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var2_int = 0;
        byte[] var3 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        byte[] stackIn_37_0 = null;
        byte[] stackIn_40_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_4_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_18_0 = null;
        byte[] stackOut_36_0 = null;
        byte[] stackOut_39_0 = null;
        Object stackOut_21_0 = null;
        try {
          L0: {
            L1: {
              if (param0 != 100) {
                break L1;
              } else {
                if (af.field_b <= 0) {
                  break L1;
                } else {
                  int fieldTemp$4 = af.field_b - 1;
                  af.field_b = af.field_b - 1;
                  var2_array = ut.field_W[fieldTemp$4];
                  ut.field_W[af.field_b] = null;
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
                if (0 >= ul.field_d) {
                  break L2;
                } else {
                  byte[][] fieldTemp$5 = oo.field_d;
                  int fieldTemp$6 = ul.field_d - 1;
                  ul.field_d = ul.field_d - 1;
                  var2_array = fieldTemp$5[fieldTemp$6];
                  oo.field_d[ul.field_d] = null;
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
                if (oj.field_v > 0) {
                  int fieldTemp$7 = oj.field_v - 1;
                  oj.field_v = oj.field_v - 1;
                  var2_array = dh.field_j[fieldTemp$7];
                  dh.field_j[oj.field_v] = null;
                  stackOut_18_0 = (byte[]) var2_array;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  break L3;
                }
              }
            }
            if (param1 == 50) {
              L4: {
                if (vh.field_k != null) {
                  var2_int = 0;
                  L5: while (true) {
                    if (var2_int >= at.field_b.length) {
                      break L4;
                    } else {
                      L6: {
                        if (~at.field_b[var2_int] != ~param0) {
                          break L6;
                        } else {
                          if (ca.field_a[var2_int] > 0) {
                            ca.field_a[var2_int] = ca.field_a[var2_int] - 1;
                            var3 = vh.field_k[var2_int][ca.field_a[var2_int] - 1];
                            vh.field_k[var2_int][ca.field_a[var2_int]] = null;
                            stackOut_36_0 = (byte[]) var3;
                            stackIn_37_0 = stackOut_36_0;
                            return stackIn_37_0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var2_int++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_39_0 = new byte[param0];
              stackIn_40_0 = stackOut_39_0;
              break L0;
            } else {
              stackOut_21_0 = null;
              stackIn_22_0 = stackOut_21_0;
              return (byte[]) (Object) stackIn_22_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "od.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_40_0;
    }

    final static String[] a(int param0, String param1) {
        Object var2 = null;
        String[] var2_array = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            if (param1.length() != 1) {
              var2_array = dj.a(77, ' ', param1);
              if (var2_array.length != 1) {
                stackOut_9_0 = (String[]) var2_array;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (String[]) (Object) stackIn_8_0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (String[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("od.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "od.A(" + param0 + ')');
        }
    }

    final synchronized static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
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
              L5: {
                if (vh.field_k == null) {
                  break L5;
                } else {
                  var2_int = 0;
                  L6: while (true) {
                    if (~at.field_b.length >= ~var2_int) {
                      break L5;
                    } else {
                      if (var3 != 0) {
                        break L4;
                      } else {
                        L7: {
                          if (~at.field_b[var2_int] != ~param1.length) {
                            break L7;
                          } else {
                            if (vh.field_k[var2_int].length <= ca.field_a[var2_int]) {
                              break L7;
                            } else {
                              ca.field_a[var2_int] = ca.field_a[var2_int] + 1;
                              vh.field_k[var2_int][ca.field_a[var2_int]] = param1;
                              return;
                            }
                          }
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("od.B(").append(param0).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
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
