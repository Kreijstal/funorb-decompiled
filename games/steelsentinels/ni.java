/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_c;
    static long field_d;
    static int[] field_b;
    static hk field_a;

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 >= 8) {
                break L1;
              } else {
                field_d = 102L;
                break L1;
              }
            }
            stackOut_3_0 = mg.field_ac;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ni.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        if (param0 < 21) {
            return;
        }
        try {
            field_a = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ni.B(" + param0 + ')');
        }
    }

    final synchronized static byte[] a(int param0, byte param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var2_int = 0;
        byte[] var3 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_18_0 = null;
        byte[] stackIn_26_0 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_17_0 = null;
        byte[] stackOut_25_0 = null;
        byte[] stackOut_38_0 = null;
        byte[] stackOut_41_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              if (param0 != 100) {
                break L1;
              } else {
                if (ck.field_h > 0) {
                  int fieldTemp$3 = ck.field_h - 1;
                  ck.field_h = ck.field_h - 1;
                  var2_array = dh.field_A[fieldTemp$3];
                  dh.field_A[ck.field_h] = null;
                  stackOut_6_0 = (byte[]) var2_array;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (param1 == -45) {
              L2: {
                if (param0 != 5000) {
                  break L2;
                } else {
                  if (0 < ak.field_c) {
                    int fieldTemp$4 = ak.field_c - 1;
                    ak.field_c = ak.field_c - 1;
                    var2_array = bg.field_A[fieldTemp$4];
                    bg.field_A[ak.field_c] = null;
                    stackOut_17_0 = (byte[]) var2_array;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 != 30000) {
                  break L3;
                } else {
                  if (0 < k.field_Gb) {
                    int fieldTemp$5 = k.field_Gb - 1;
                    k.field_Gb = k.field_Gb - 1;
                    var2_array = bc.field_vb[fieldTemp$5];
                    bc.field_vb[k.field_Gb] = null;
                    stackOut_25_0 = (byte[]) var2_array;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != lb.field_Wb) {
                  var2_int = 0;
                  L5: while (true) {
                    if (~bk.field_W.length >= ~var2_int) {
                      break L4;
                    } else {
                      L6: {
                        if (param0 != bk.field_W[var2_int]) {
                          break L6;
                        } else {
                          if (ff.field_ub[var2_int] <= 0) {
                            break L6;
                          } else {
                            ff.field_ub[var2_int] = ff.field_ub[var2_int] - 1;
                            var3 = lb.field_Wb[var2_int][ff.field_ub[var2_int] - 1];
                            lb.field_Wb[var2_int][ff.field_ub[var2_int]] = null;
                            stackOut_38_0 = (byte[]) var3;
                            stackIn_39_0 = stackOut_38_0;
                            return stackIn_39_0;
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
              stackOut_41_0 = new byte[param0];
              stackIn_42_0 = stackOut_41_0;
              break L0;
            } else {
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              return (byte[]) (Object) stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ni.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_42_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 250;
        field_b = new int[128];
    }
}
