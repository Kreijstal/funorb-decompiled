/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class en extends tj implements eg {
    private sb field_H;
    static tu field_E;
    static int field_F;
    static String field_G;

    abstract int a(byte param0);

    public static void n(int param0) {
        if (param0 != 0) {
            return;
        }
        field_G = null;
        field_E = null;
    }

    void a(byte param0, sb param1) {
        int[] discarded$0 = null;
        try {
            if (param0 >= -21) {
                vh var4 = (vh) null;
                discarded$0 = en.a((vh) null, (byte) -110);
            }
            this.field_H = param1;
            this.field_H.field_j = (en) (this);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "en.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int l(int param0);

    final static int[] a(vh param0, byte param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -24) {
                break L1;
              } else {
                en.n(-95);
                break L1;
              }
            }
            var5 = new int[param0.k(param1 ^ -24)];
            var2 = var5;
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5.length <= var3) {
                    break L4;
                  } else {
                    stackOut_5_0 = (int[]) (var5);
                    stackIn_9_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      stackIn_6_0[var3] = param0.k(0);
                      var3++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_8_0 = (int[]) (var5);
                stackIn_9_0 = stackOut_8_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2_ref);
            stackOut_10_1 = new StringBuilder().append("en.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    en(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4);
    }

    public final n a(int param0) {
        int[] discarded$0 = null;
        if (param0 != -918933630) {
            vh var3 = (vh) null;
            discarded$0 = en.a((vh) null, (byte) 126);
            return (n) ((Object) this.field_H);
        }
        return (n) ((Object) this.field_H);
    }

    abstract int m(int param0);

    abstract boolean k(int param0);

    static {
        field_G = "Loading extra data";
    }
}
