/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sb {
    int field_j;
    int field_h;
    int field_a;
    static ip field_i;
    int field_b;
    static String field_g;
    static String field_k;
    static int field_c;
    int field_e;
    int field_f;
    static String field_d;

    final static ma a(int param0, String param1) {
        ma stackIn_3_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        ma stackIn_27_0 = null;
        ma stackIn_40_0 = null;
        ma stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = jo.field_e;
            return stackIn_3_0;
          }
          if (param0 != 32351) {
            field_d = (String) null;
          }
          if (64 < var2_int) {
            stackIn_9_0 = er.field_f;
            return stackIn_9_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_13_0 = so.field_t;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_27_0 = so.field_t;
                  return stackIn_27_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = so.field_t;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (cd.field_Kb.indexOf(var5Lifetime1) == -1) {
                stackIn_44_0 = so.field_t;
                return stackIn_44_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_50_0 = var2;
          stackIn_50_1 = new StringBuilder().append("sb.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_k = null;
        int var1 = 50 % ((-63 - param0) / 43);
        field_i = null;
    }

    abstract void a(int param0, int param1);

    static {
        field_g = "Add <%0> to ignore list";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_i = new ip();
    }
}
