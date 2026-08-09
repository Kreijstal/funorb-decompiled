/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i implements uj {
    static String[][] field_b;
    static String field_d;
    static int[] field_c;
    static int field_a;

    public final String a(byte param0) {
        int var2 = -47 / ((-33 - param0) / 62);
        return "Make Ore Diamonds";
    }

    public final void a(boolean param0) {
        gd.field_x = 4;
        tb.field_a = 1;
        if (!param0) {
            return;
        }
        int[] var3 = (int[]) null;
        i.a(-114, (int[]) null, (int[]) null);
    }

    public static void b(byte param0) {
        if (param0 != -57) {
          i.b((byte) -113);
          field_b = (String[][]) null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_b = (String[][]) null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static int[] a(int param0, int[] param1, int[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var6 = new int[8];
            var3 = var6;
            var4 = 0;
            if (param0 < -103) {
              L1: while (true) {
                if (8 <= var4) {
                  stackIn_7_0 = (int[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6[var4] = hi.a(param1[var4], param2[var4]);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (int[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("i.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_b = new String[][]{null, new String[]{"Snow: Soft, white and easy to mine through! This will melt to water if you blow it up!"}};
        field_d = "Mouse over an icon for details";
    }
}
