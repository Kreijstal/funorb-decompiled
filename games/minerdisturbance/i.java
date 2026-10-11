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
        if (param0 == -57) {
          field_b = (String[][]) null;
          field_c = null;
          field_d = null;
          return;
        }
        i.b((byte) -113);
        field_b = (String[][]) null;
        field_c = null;
        field_d = null;
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
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          var6 = new int[8];
          var3 = var6;
          var4 = 0;
          if (param0 >= -103) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          while (8 > var4) {
            var6[var4] = hi.a(param1[var4], param2[var4]);
            var4++;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("i.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_b = new String[][]{null, new String[]{"Snow: Soft, white and easy to mine through! This will melt to water if you blow it up!"}};
        field_d = "Mouse over an icon for details";
    }
}
