/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rga {
    static int[] field_b;
    int field_a;
    private int field_c;

    public static void a(byte param0) {
        if (param0 <= 56) {
            field_b = (int[]) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static String[] a(int param0, String param1, char param2) {
        String[] discarded$4 = null;
        int incrementValue$5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = (CharSequence) ((Object) param1);
              var3_int = sd.a(param2, (byte) 93, var11);
              var4 = new String[1 + var3_int];
              var5 = 0;
              var6 = 0;
              if (param0 == 32287) {
                break L1;
              } else {
                var10 = (String) null;
                discarded$4 = rga.a(65, (String) null, 'ﾭ');
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var7 >= var3_int) {
                  var4[var3_int] = param1.substring(var6);
                  break L3;
                } else {
                  if (var9 != 0) {
                    break L3;
                  } else {
                    var8 = var6;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (param2 == param1.charAt(var8)) {
                            break L6;
                          } else {
                            var8++;
                            if (var9 != 0) {
                              break L5;
                            } else {
                              if (var9 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        incrementValue$5 = var5;
                        var5++;
                        var4[incrementValue$5] = param1.substring(var6, var8);
                        var6 = var8 + 1;
                        var7++;
                        break L5;
                      }
                      continue L2;
                    }
                  }
                }
              }
              stackOut_14_0 = (String[]) (var4);
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("rga.F(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var9 = param7 + -param0;
            var8_int = param0 + param4;
            var12 = param4;
            L1: while (true) {
              L2: {
                if (var8_int <= var12) {
                  if (param1 > 97) {
                    break L2;
                  } else {
                    rga.a((byte) -93);
                    break L2;
                  }
                } else {
                  nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
                  var12++;
                  if (var14 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              var12 = param7;
              L3: while (true) {
                L4: {
                  if (var12 <= var9) {
                    stackOut_13_0 = param6;
                    stackOut_13_1 = param0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L4;
                  } else {
                    stackOut_10_0 = -55;
                    stackOut_10_1 = param5;
                    stackIn_14_0 = stackOut_10_0;
                    stackIn_14_1 = stackOut_10_1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    if (var14 != 0) {
                      break L4;
                    } else {
                      nra.a((byte) stackIn_11_0, stackIn_11_1, param6, vaa.field_a[var12], param3);
                      var12--;
                      continue L3;
                    }
                  }
                }
                var11 = stackIn_14_0 - stackIn_14_1;
                var10 = param3 + param0;
                var12 = var8_int;
                L5: while (true) {
                  if (var9 < var12) {
                    break L0;
                  } else {
                    var18 = vaa.field_a[var12];
                    nra.a((byte) -55, param5, var10, var18, param3);
                    nra.a((byte) -55, param2, var11, var18, var10);
                    nra.a((byte) -55, param5, param6, var18, var11);
                    var12++;
                    if (var14 == 0) {
                      continue L5;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var8), "rga.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static ka a(ka param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ka stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = -57 % ((param2 - -32) / 49);
            if (param0 != null) {
              stackOut_3_0 = param0.a(param1, 654255, false);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("rga.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final rga a(int param0, int param1) {
        ka discarded$2 = null;
        ka var4 = null;
        if (param0 != 0) {
          var4 = (ka) null;
          discarded$2 = rga.a((ka) null, (byte) 71, 47);
          return new rga(this.field_c, param1);
        } else {
          return new rga(this.field_c, param1);
        }
    }

    final static int b(int param0, int param1) {
        String[] discarded$6 = null;
        g[] var4 = null;
        g[] var2 = null;
        if (param0 != 26499) {
            String var3 = (String) null;
            discarded$6 = rga.a(121, (String) null, 'J');
            if (!(cm.field_a != null)) {
                return 0;
            }
            var4 = cm.field_a[param1].field_c;
            var2 = var4;
            return var4.length;
        }
        if (!(cm.field_a != null)) {
            return 0;
        }
        var4 = cm.field_a[param1].field_c;
        var2 = var4;
        return var4.length;
    }

    rga(int param0, int param1) {
        this.field_c = param0;
        this.field_a = param1;
    }

    static {
    }
}
