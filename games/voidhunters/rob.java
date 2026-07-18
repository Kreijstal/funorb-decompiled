/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rob extends rqa {
    static byte[] field_o;
    static String field_p;
    static llb field_q;

    final static byte[] a(int param0, byte[] param1) {
        ds var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_31_0 = null;
        byte[] stackOut_11_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              var2 = new ds(param1);
              var3 = var2.e((byte) -93);
              var4 = var2.h(38);
              if (var4 < param0) {
                break L1;
              } else {
                L2: {
                  if (ph.field_o == 0) {
                    break L2;
                  } else {
                    if (var4 > ph.field_o) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (0 != var3) {
                  L3: {
                    var5 = var2.h(119);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (ph.field_o == 0) {
                          break L4;
                        } else {
                          if (~var5 >= ~ph.field_o) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var6 = new byte[var5];
                          if (1 != var3) {
                            break L6;
                          } else {
                            int discarded$1 = cv.a(var6, var5, param1, var4, 9);
                            if (VoidHunters.field_G == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7 = (Object) (Object) oaa.field_h;
                        synchronized (var7) {
                          L7: {
                            oaa.field_h.a(20773, var6, var2);
                            break L7;
                          }
                        }
                        break L5;
                      }
                      stackOut_31_0 = (byte[]) var6;
                      stackIn_32_0 = stackOut_31_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var5_ref_byte__ = new byte[var4];
                  var2.a(0, var5_ref_byte__, (byte) -59, var4);
                  stackOut_11_0 = (byte[]) var5_ref_byte__;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2_ref;
            stackOut_33_1 = new StringBuilder().append("rob.D(").append(param0).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_32_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_3_0 = new nc((Object) (Object) frb.a(194, 127));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rob.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        try {
            field_o = null;
            field_p = null;
            field_q = null;
            if (param0 >= -22) {
                field_p = null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rob.B(" + param0 + ')');
        }
    }

    final static String a(int param0, int[] param1) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var2 = new byte[1 + param1.length];
            var2[0] = tcb.field_p;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= param1.length) {
                    break L3;
                  } else {
                    var2[var3 + 1] = (byte)param1[var3];
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 65535) {
                  break L2;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (String) (Object) stackIn_9_0;
                }
              }
              stackOut_10_0 = fb.a(var2, (byte) -116);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("rob.C(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    rob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_o = new byte[32896];
        var0 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            field_p = "DESTROY THE DRONES";
            return;
          } else {
            var2 = 0;
            L1: while (true) {
              if (var1 < var2) {
                var1++;
                continue L0;
              } else {
                int incrementValue$29 = var0;
                var0++;
                field_o[incrementValue$29] = (byte)(int)(255.0 / Math.sqrt((double)((float)(65535 + var1 * var1 + var2 * var2) / 65535.0f)));
                var2++;
                continue L1;
              }
            }
          }
        }
    }
}
