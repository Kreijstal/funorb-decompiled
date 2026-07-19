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
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ps var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_15_0 = null;
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
            if (param1 != null) {
              if (param1 instanceof byte[]) {
                var3 = (byte[]) (param1);
                if (!param0) {
                  stackOut_8_0 = (byte[]) (var3);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_6_0 = nia.a(var3, (byte) -116);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (param1 instanceof ps) {
                  var4 = (ps) (param1);
                  stackOut_12_0 = var4.b(3);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2) {
                    throw new IllegalArgumentException();
                  } else {
                    stackOut_15_0 = (byte[]) null;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("ffb.A(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        int var1 = -75 / ((-40 - param0) / 34);
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
                field_d = (String) null;
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
              if (var6 <= var5_int) {
                break L0;
              } else {
                L3: {
                  var8 += 2;
                  var7 = var7 + var8;
                  if ((var7 ^ -1) >= -1) {
                    break L3;
                  } else {
                    var6--;
                    var7 = var7 - (var6 << -162312607);
                    var11 = -var6 + param2;
                    var12 = param2 - -var6;
                    if (lua.field_c > var12) {
                      break L3;
                    } else {
                      if (hab.field_i >= var11) {
                        L4: {
                          var13 = ksa.a(31123, ob.field_j, mt.field_o, var5_int + param4);
                          var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -var5_int);
                          if (var12 <= hab.field_i) {
                            ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (var11 >= lua.field_c) {
                          ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5_int++;
                var11 = -var5_int + param2;
                var12 = var5_int + param2;
                if (lua.field_c > var12) {
                  continue L2;
                } else {
                  if (var11 > hab.field_i) {
                    continue L2;
                  } else {
                    L5: {
                      var13 = ksa.a(31123, ob.field_j, mt.field_o, param4 + var6);
                      var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 - var6);
                      if (hab.field_i >= var12) {
                        ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (lua.field_c > var11) {
                      continue L2;
                    } else {
                      ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "ffb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Add condition (Node on team)";
        field_d = "Offer rematch";
        field_b = "Menu";
        field_c = "Player Name: ";
    }
}
