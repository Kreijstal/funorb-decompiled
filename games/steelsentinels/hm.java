/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_b;
    static gh field_a;
    static String field_e;
    static int[] field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 <= 40) {
          nk var2 = (nk) null;
          hm.a((byte) 75, (int[]) null, (nk) null);
        }
    }

    final static int a(byte param0, int[] param1, nk param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = SteelSentinels.field_G;
        try {
          if (param0 <= 116) {
            stackIn_3_0 = 49;
            return stackIn_3_0;
          }
          var3_int = param2.e((byte) -120);
          var4 = param2.i(-121);
          for (var5 = 0; var5 < var4; var5++) {
            if (param1[var5] == 34) {
              stackIn_8_0 = 6100;
              return stackIn_8_0;
            }
            if (param1[var5] >= 0 &&
              param1[var5] < dn.field_Sb.length) {
              var3_int = var3_int + dn.field_Sb[param1[var5]];
            }
          }
          stackIn_18_0 = var3_int;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("hm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_b = "Rockets and missiles reload faster.";
        field_d = "Set up new game";
        field_e = "SHIFT";
        field_c = new int[8192];
        field_a = null;
    }
}
