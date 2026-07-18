/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ffb {
    static String field_e;
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(boolean param0, Object param1) {
        RuntimeException var3 = null;
        byte[] var3_array = null;
        ps var4 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_15_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          if (param1 != null) {
            if (param1 instanceof byte[]) {
              var3_array = (byte[]) param1;
              if (!param0) {
                stackOut_10_0 = (byte[]) var3_array;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                int discarded$1 = -116;
                stackOut_8_0 = nia.a(var3_array);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              if (param1 instanceof ps) {
                var4 = (ps) param1;
                stackOut_15_0 = var4.b(3);
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("ffb.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L0;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + true + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        int var1 = -75;
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
            var5_int = 0;
            var6 = param0;
            var7 = -param0;
            var8 = -1;
            var9 = ksa.a(31123, ob.field_j, mt.field_o, param4 + param0);
            var10 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -param0);
            ww.a(param3, var9, rba.field_b[param2], (byte) 75, var10);
            L1: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L2: {
                  var8 += 2;
                  var7 = var7 + var8;
                  if (var7 <= 0) {
                    break L2;
                  } else {
                    var6--;
                    var7 = var7 - (var6 << 1);
                    var11 = -var6 + param2;
                    var12 = param2 - -var6;
                    if (lua.field_c > var12) {
                      break L2;
                    } else {
                      if (hab.field_i >= var11) {
                        L3: {
                          var13 = ksa.a(31123, ob.field_j, mt.field_o, var5_int + param4);
                          var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -var5_int);
                          if (var12 <= hab.field_i) {
                            ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (var11 >= lua.field_c) {
                          ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5_int++;
                var11 = -var5_int + param2;
                var12 = var5_int + param2;
                if (lua.field_c > var12) {
                  continue L1;
                } else {
                  if (var11 > hab.field_i) {
                    continue L1;
                  } else {
                    L4: {
                      var13 = ksa.a(31123, ob.field_j, mt.field_o, param4 + var6);
                      var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 - var6);
                      if (hab.field_i >= var12) {
                        ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (lua.field_c > var11) {
                      continue L1;
                    } else {
                      ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var5, "ffb.C(" + param0 + ',' + -89 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
