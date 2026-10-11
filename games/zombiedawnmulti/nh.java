/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends br {
    static int[] field_i;
    static th field_g;
    static String field_j;
    static String field_n;
    static boolean field_m;
    int field_k;
    int field_l;
    static String field_h;
    int field_f;

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = h.a(kj.field_q, 19313, am.field_b);
          if (var2_int == 1) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == param0) {
            param1 = "<img=1>" + param1;
          }
          stackIn_6_0 = (String) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("nh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean c(byte param0) {
        if (param0 >= -25) {
          return true;
        }
        return ab.field_k;
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != 48) {
          return;
        }
        field_i = null;
        field_g = null;
        field_n = null;
        field_h = null;
    }

    private nh() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new int[8192];
        field_j = "Release a mist that makes it harder for your opponents to see.";
        field_m = true;
        field_h = "Your undead army is victorious!";
    }
}
