/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static int[] field_b;
    static int field_a;
    static char[] field_c;

    final static String a(int param0, int param1) {
        if (!(param0 < 60)) {
            return p.a(param0 % 60, param1, 45, param0 / 60);
        }
        String var6 = lq.field_S;
        char[] var10 = var6.toCharArray();
        char[] var9 = var10;
        char[] var8 = var9;
        char[] var7 = var8;
        char[] var4 = var7;
        int var5 = var6.indexOf("mm");
        int incrementValue$0 = var5;
        var5++;
        var4[incrementValue$0] = (char)(param0 >= 0 ? 48 + param0 / 10 : 45);
        int incrementValue$1 = var5;
        var5++;
        var4[incrementValue$1] = (char)(param0 < 0 ? 45 : param0 % 10 + 48);
        var5 = var6.indexOf("ss");
        int incrementValue$2 = var5;
        var5++;
        var4[incrementValue$2] = (char)(0 <= param1 ? param1 / 10 + 48 : 45);
        int incrementValue$3 = var5;
        var5++;
        var4[incrementValue$3] = (char)(param1 < 0 ? 45 : param1 % 10 + 48);
        return new String(var10);
    }

    final static int[] a(int param0) {
        int var1 = 53 % ((param0 - 72) / 37);
        return new int[8];
    }

    public static void a() {
        field_b = null;
        field_c = null;
    }

    final static void a(vh param0, byte param1, int param2) {
        aa var3 = null;
        RuntimeException var3_ref = null;
        vh var4 = null;
        vh stackIn_3_0 = null;
        vh stackIn_4_0 = null;
        vh stackIn_5_0 = null;
        vh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_2_0 = null;
        vh stackOut_3_0 = null;
        vh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 <= -38) {
              L1: {
                L2: {
                  stackOut_2_0 = (vh) param0;
                  stackIn_5_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param2 == -1) {
                    break L2;
                  } else {
                    stackOut_3_0 = (vh) (Object) stackIn_3_0;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if ((long)param2 != param0.field_c) {
                      break L2;
                    } else {
                      stackOut_4_0 = (vh) (Object) stackIn_4_0;
                      stackOut_4_1 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                }
                stackOut_5_0 = (vh) (Object) stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              }
              L3: {
                stackIn_6_0.field_Ib = stackIn_6_1 != 0;
                if (null == param0.field_T) {
                  break L3;
                } else {
                  if (param0.field_T.c(0)) {
                    break L3;
                  } else {
                    var3 = new aa(param0.field_T);
                    var4 = (vh) (Object) var3.b((byte) -92);
                    L4: while (true) {
                      if (var4 == null) {
                        break L3;
                      } else {
                        ek.a(var4, (byte) -69, param2);
                        var4 = (vh) (Object) var3.b(-111);
                        continue L4;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("ek.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static int a(byte param0, boolean param1, int param2, int param3) {
        return ph.a((byte) -115);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[12];
        field_a = 14;
        field_c = new char[128];
    }
}
