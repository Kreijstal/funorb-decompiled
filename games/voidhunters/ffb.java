/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ffb {
    static String field_e;
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        RuntimeException var3 = null;
        byte[] var3_array = null;
        ps var3_ref = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          if (param1 == null) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (param1 instanceof byte[]) {
              var3_array = (byte[]) param1;
              if (!param0) {
                stackOut_11_0 = (byte[]) var3_array;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_9_0 = nia.a(var3_array, (byte) -116);
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            } else {
              if (param1 instanceof ps) {
                var3_ref = (ps) param1;
                stackOut_16_0 = var3_ref.b(3);
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              } else {
                if (param2) {
                  throw new IllegalArgumentException();
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (byte[]) (Object) stackIn_20_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("ffb.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L0;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_a = null;
            field_b = null;
            field_e = null;
            field_c = null;
            field_d = null;
            int var1_int = -75 / ((-40 - param0) / 34);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ffb.B(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -72) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = param0;
            var7 = -param0;
            var8 = -1;
            var9 = ksa.a(31123, ob.field_j, mt.field_o, param4 + param0);
            var10 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -param0);
            ww.a(param3, var9, rba.field_b[param2], (byte) 75, var10);
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 <= var5_int) {
                    break L4;
                  } else {
                    var8 += 2;
                    var7 = var7 + var8;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (var7 <= 0) {
                          break L5;
                        } else {
                          var6--;
                          var7 = var7 - (var6 << -162312607);
                          var11 = -var6 + param2;
                          var12 = param2 - -var6;
                          if (lua.field_c > var12) {
                            break L5;
                          } else {
                            if (hab.field_i >= var11) {
                              L6: {
                                var13 = ksa.a(31123, ob.field_j, mt.field_o, var5_int + param4);
                                var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -var5_int);
                                if (~var12 >= ~hab.field_i) {
                                  ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              if (var11 >= lua.field_c) {
                                ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L7: {
                        var5_int++;
                        var11 = -var5_int + param2;
                        var12 = var5_int + param2;
                        if (lua.field_c > var12) {
                          break L7;
                        } else {
                          if (~var11 < ~hab.field_i) {
                            break L7;
                          } else {
                            L8: {
                              var13 = ksa.a(31123, ob.field_j, mt.field_o, param4 + var6);
                              var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 - var6);
                              if (hab.field_i >= var12) {
                                ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (~lua.field_c < ~var11) {
                              break L7;
                            } else {
                              ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                              break L7;
                            }
                          }
                        }
                      }
                      if (var15 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var5, "ffb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Add condition (Node on team)";
        field_d = "Offer rematch";
        field_b = "Menu";
        field_c = "Player Name: ";
    }
}
