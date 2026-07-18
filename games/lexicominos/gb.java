/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    private String field_c;
    private boolean field_b;
    static int field_a;
    static boolean field_d;

    gb(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((gb) this).field_c = param0;
              if (null != ((gb) this).field_c) {
                break L1;
              } else {
                ((gb) this).field_c = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              ((gb) this).field_b = stackIn_6_1 != 0;
              if (((gb) this).field_c.length() != 0) {
                break L3;
              } else {
                ((gb) this).field_b = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("gb.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static aj a(int param0, int param1) {
        aj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        aj[] var5 = null;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          int discarded$4 = -55;
          var5 = ah.a();
          var2 = var5;
          if (param1 == 2121865922) {
            break L0;
          } else {
            aj discarded$5 = gb.a(71, -115);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_a == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static we[] a(byte param0, ab param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        we[] var4 = null;
        int var5 = 0;
        we var6 = null;
        int var7 = 0;
        Object var8 = null;
        ei var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        we[] stackIn_6_0 = null;
        we[] stackIn_13_0 = null;
        we[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        we[] stackOut_5_0 = null;
        we[] stackOut_12_0 = null;
        we[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -66) {
                break L1;
              } else {
                var8 = null;
                we[] discarded$1 = gb.a((byte) 108, (ab) null);
                break L1;
              }
            }
            if (!param1.b(0)) {
              stackOut_5_0 = new we[]{};
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              var9 = param1.a((byte) 127);
              L2: while (true) {
                if (var9.field_b != 0) {
                  if (2 == var9.field_b) {
                    stackOut_12_0 = new we[]{};
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    var13 = (int[]) var9.field_g;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var3 = var10;
                    var4 = new we[var13.length >> 2];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_17_0 = (we[]) var4;
                        stackIn_18_0 = stackOut_17_0;
                        break L0;
                      } else {
                        var6 = new we();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 2];
                        var6.field_e = var3[1 + (var5 << 2)];
                        var6.field_f = var3[(var5 << 2) + 2];
                        var6.field_k = var3[(var5 << 2) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  ge.a(0, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("gb.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    gb(String param0) {
        this(param0, false);
    }

    final boolean a(int param0) {
        if (param0 != 15738) {
            field_a = -125;
        }
        return ((gb) this).field_b;
    }

    final String b(int param0) {
        if (param0 != 25545) {
            return null;
        }
        return ((gb) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
