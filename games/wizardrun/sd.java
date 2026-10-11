/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String[] field_b;
    static String field_e;
    int field_a;
    static int[] field_f;
    static String field_c;
    static String[] field_d;

    final static byte[] a(mg param0, byte[] param1, int param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_17_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = wizardrun.field_H;
        try {
          var4_int = param0.g(param2, -11719);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new byte[var4_int];
          }
          var5 = param0.g(3, -11719);
          var6 = (byte)param0.g(8, -11719);
          if (0 >= var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)(param0.g(var5, param3 - 11730) + var6);
            }
          }
          if (param3 == 11) {
            stackIn_19_0 = (byte[]) (param1);
            return stackIn_19_0;
          }
          stackIn_17_0 = (byte[]) null;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("sd.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    sd(int param0) {
        this.field_a = param0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
          byte[] var2 = (byte[]) null;
          sd.a((mg) null, (byte[]) null, 19, (byte) -77);
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_e = "Jump into the captured enemies for larger crystals.";
        field_f = new int[8192];
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = "Logging in...";
    }
}
