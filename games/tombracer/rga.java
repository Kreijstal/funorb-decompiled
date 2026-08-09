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
        }
        field_b = null;
    }

    final static String[] a(int param0, String param1, char param2) {
        int incrementValue$1 = 0;
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
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                rga.a(65, (String) null, 'ﾭ');
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param1.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2 == param1.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param1.substring(var6, var8);
                    var6 = var8 + 1;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("rga.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var9 = param7 + -param0;
            var8_int = param0 + param4;
            var12 = param4;
            L1: while (true) {
              if (var8_int <= var12) {
                L2: {
                  if (param1 > 97) {
                    break L2;
                  } else {
                    rga.a((byte) -93);
                    break L2;
                  }
                }
                var12 = param7;
                L3: while (true) {
                  if (var12 <= var9) {
                    var11 = param6 - param0;
                    var10 = param3 + param0;
                    var12 = var8_int;
                    L4: while (true) {
                      if (var9 < var12) {
                        break L0;
                      } else {
                        var18 = vaa.field_a[var12];
                        nra.a((byte) -55, param5, var10, var18, param3);
                        nra.a((byte) -55, param2, var11, var18, var10);
                        nra.a((byte) -55, param5, param6, var18, var11);
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
                    var12--;
                    continue L3;
                  }
                }
              } else {
                nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
                var12++;
                continue L1;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -57 % ((param2 - -32) / 49);
            if (param0 != null) {
              stackIn_4_0 = param0.a(param1, 654255, false);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("rga.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final rga a(int param0, int param1) {
        if (param0 != 0) {
            ka var4 = (ka) null;
            rga.a((ka) null, (byte) 71, 47);
        }
        return new rga(this.field_c, param1);
    }

    final static int b(int param0, int param1) {
        if (param0 != 26499) {
            String var3 = (String) null;
            rga.a(121, (String) null, 'J');
        }
        if (!(cm.field_a != null)) {
            return 0;
        }
        g[] var4 = cm.field_a[param1].field_c;
        g[] var2 = var4;
        return var4.length;
    }

    rga(int param0, int param1) {
        this.field_c = param0;
        this.field_a = param1;
    }

    static {
    }
}
