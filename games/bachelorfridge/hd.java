/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends oha {
    private int field_p;
    static int field_m;
    private int field_o;
    private int field_n;
    static String field_r;
    int field_q;

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -2) {
            break L0;
          } else {
            ((hd) this).field_p = -128;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hd) this).field_n < 1) {
              break L2;
            } else {
              if (0 > ((hd) this).field_p) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    hd(int param0, int param1, int param2, String param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        super(4, param0, param1, param2, 0, param11);
        try {
            ((hd) this).field_p = param8;
            ((hd) this).field_f = param3;
            ((hd) this).field_o = param6;
            ((hd) this).field_q = param5;
            ((hd) this).field_k = param4;
            ((hd) this).field_n = param9;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    final int c(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        if (((hd) this).field_o != 17) {
          L1: {
            if (((hd) this).field_p != 0) {
              break L1;
            } else {
              if (((hd) this).field_n != 0) {
                break L1;
              } else {
                return 1;
              }
            }
          }
          L2: {
            if (((hd) this).field_p != 1) {
              break L2;
            } else {
              if (1 == ((hd) this).field_n) {
                return 2;
              } else {
                break L2;
              }
            }
          }
          int discarded$2 = -96;
          if (!this.c()) {
            throw new IllegalStateException("This special doesn't have a defined range. Fix it.");
          } else {
            return 0;
          }
        } else {
          return 3;
        }
    }

    final static byte[] a(byte[] param0, pf param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = param1.d(16, (byte) -108);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new byte[var4_int];
                break L1;
              }
              var5 = param1.d(3, (byte) 87);
              var6 = (byte)param1.d(8, (byte) -117);
              L3: {
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param0[var7] = (byte)(param1.d(var5, (byte) 48) + var6);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) param0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("hd.J(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 103 + ',' + 16 + ')');
        }
        return stackIn_18_0;
    }

    public static void d() {
        field_r = null;
    }

    private final boolean c() {
        return ((hd) this).field_p == 0 && ((hd) this).field_n == 7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Play free version";
        field_m = -1;
    }
}
