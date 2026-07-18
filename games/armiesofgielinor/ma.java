/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends fn implements eg {
    static boolean field_Z;
    private int field_W;
    private n field_bb;
    static String field_Y;
    static String field_X;
    static long field_ab;

    final void d(byte param0) {
        if (param0 >= -114) {
            n discarded$0 = ((ma) this).a(-106);
        }
        super.d((byte) -117);
        if (!(null == ((ma) this).field_bb)) {
            ((ma) this).field_bb.a(124);
        }
    }

    final String h(int param0) {
        if (!((ma) this).field_t) {
            return null;
        }
        if (((ma) this).field_s == null) {
            return null;
        }
        ip.a(ko.field_b, ((ma) this).field_l - ((ma) this).field_W + sm.field_d, (byte) 113);
        if (param0 != 21384) {
            return null;
        }
        return ((ma) this).field_s;
    }

    final static ls[] a(int param0, hd param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        ls[] var4 = null;
        int var5 = 0;
        ls var6 = null;
        int var7 = 0;
        wo var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        ls[] stackIn_3_0 = null;
        ls[] stackIn_9_0 = null;
        ls[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ls[] stackOut_15_0 = null;
        ls[] stackOut_8_0 = null;
        ls[] stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1.b(false)) {
              var8 = param1.b(-20681);
              L1: while (true) {
                if (0 != var8.field_g) {
                  if (2 != var8.field_g) {
                    L2: {
                      var12 = (int[]) var8.field_f;
                      var11 = var12;
                      var10 = var11;
                      var9 = var10;
                      var3 = var9;
                      var4 = new ls[var12.length >> 2];
                      if (param0 < -3) {
                        break L2;
                      } else {
                        field_X = null;
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_15_0 = (ls[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new ls();
                        var4[var5] = var6;
                        var6.field_b = var3[var5 << 2];
                        var6.field_a = var3[(var5 << 2) - -1];
                        var6.field_f = var3[(var5 << 2) - -2];
                        var6.field_e = var3[(var5 << 2) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_8_0 = new ls[]{};
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  nu.a(10L, 0);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new ls[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ma.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    public final n a(int param0) {
        if (param0 != -918933630) {
            n discarded$0 = ((ma) this).a(-10);
        }
        return ((ma) this).field_bb;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 != 3) {
            int discarded$0 = ma.a(71, -15, 73, 84);
        }
        return (-1 == (param2 & 1) ? param0 : -param0) + (-1 != (param2 & 2) ? -param3 : param3);
    }

    ma(String param0, qo param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(byte param0, n param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ma) this).field_bb = param1;
              if (param0 == 16) {
                break L1;
              } else {
                var4 = null;
                ((ma) this).a((byte) -62, (n) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ma.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            if (param0 != 32722) {
                ((ma) this).field_W = 103;
            }
            super.a(param0, param1, param2, param3);
            ((ma) this).field_W = sm.field_d + -((ma) this).field_B + -param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ma.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_X = null;
        field_Y = null;
        int var1 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = "Units";
        field_X = "Items that can be given to units to improve their abilities in battle.";
        field_Z = true;
    }
}
