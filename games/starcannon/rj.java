/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends rf {
    int[] field_g;
    boolean field_n;
    static id[] field_i;
    static String field_m;
    static String[] field_l;
    static String field_f;
    static int field_h;
    static int field_j;
    int field_k;

    final static int a(int param0, int param1, byte param2, byte[] param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 79) {
            field_l = (String[]) null;
          }
          var4_int = -1;
          for (var5 = param0; var5 < param1; var5++) {
            var4_int = var4_int >>> 8 ^ fb.field_n[(param3[var5] ^ var4_int) & 255];
          }
          var4_int = ~var4_int;
          stackIn_6_0 = var4_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -1) {
          rj.a(118);
        }
        field_l = null;
        field_m = null;
        field_i = null;
    }

    rj() {
        this.field_n = false;
    }

    static {
        field_f = "Achieved";
        field_j = 5;
        field_m = "Cancel";
        field_l = new String[]{"New superweapon!", "Serious challenges!", "Mega boss fights!"};
    }
}
