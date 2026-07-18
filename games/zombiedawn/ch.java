/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static vn field_a;
    static int field_b;
    static String field_c;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              if (param0 == 1426) {
                break L1;
              } else {
                boolean discarded$2 = ch.a((CharSequence) null, false, -68);
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "ch.E(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 <= 5) {
            return;
        }
        try {
            ph.a((byte) 62, (wj) null);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ch.C(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        try {
            ac.field_m = 1426;
            if (param0 != 80) {
                boolean discarded$0 = ch.a((CharSequence) null, false, 20);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ch.D(" + param0 + ')');
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var2_int = 0;
        byte[] var3 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_16_0 = null;
        byte[] stackIn_24_0 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_4_0 = null;
        byte[] stackOut_15_0 = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_38_0 = null;
        byte[] stackOut_41_0 = null;
        Object stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (100 != param1) {
                break L1;
              } else {
                if (qg.field_c <= 0) {
                  break L1;
                } else {
                  byte[][] fieldTemp$5 = ff.field_c;
                  int fieldTemp$6 = qg.field_c - 1;
                  qg.field_c = qg.field_c - 1;
                  var2_array = fieldTemp$5[fieldTemp$6];
                  ff.field_c[qg.field_c] = null;
                  stackOut_4_0 = (byte[]) var2_array;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            if (param0 == -5827) {
              L2: {
                if (param1 != 5000) {
                  break L2;
                } else {
                  if (re.field_e > 0) {
                    byte[][] fieldTemp$7 = ka.field_e;
                    int fieldTemp$8 = re.field_e - 1;
                    re.field_e = re.field_e - 1;
                    var2_array = fieldTemp$7[fieldTemp$8];
                    ka.field_e[re.field_e] = null;
                    stackOut_15_0 = (byte[]) var2_array;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 != 30000) {
                  break L3;
                } else {
                  if (kn.field_F > 0) {
                    int fieldTemp$9 = kn.field_F - 1;
                    kn.field_F = kn.field_F - 1;
                    var2_array = sh.field_j[fieldTemp$9];
                    sh.field_j[kn.field_F] = null;
                    stackOut_23_0 = (byte[]) var2_array;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (wg.field_j != null) {
                  var2_int = 0;
                  L5: while (true) {
                    if (fl.field_d.length <= var2_int) {
                      break L4;
                    } else {
                      L6: {
                        if (param1 != fl.field_d[var2_int]) {
                          break L6;
                        } else {
                          if (ba.field_w[var2_int] > 0) {
                            ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                            var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                            wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                            stackOut_38_0 = (byte[]) var3;
                            stackIn_39_0 = stackOut_38_0;
                            return stackIn_39_0;
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
              stackOut_41_0 = new byte[param1];
              stackIn_42_0 = stackOut_41_0;
              break L0;
            } else {
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (byte[]) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "ch.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_42_0;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (!vb.a(param2, param0, param1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param0.length() <= var3_int) {
                      break L3;
                    } else {
                      stackOut_8_0 = jb.a((byte) 27, param0.charAt(var3_int));
                      stackIn_17_0 = stackOut_8_0 ? 1 : 0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_9_0) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ch.B(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You don't seem to have completed all of the Mall and Power Plant levels yet. We recommend you do so before attempting the UK levels.";
    }
}
