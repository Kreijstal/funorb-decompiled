/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends sr {
    static String field_s;
    static String field_t;
    static int field_n;
    static int field_q;
    static String field_u;
    static String field_p;
    static int field_r;
    static int field_o;

    final int a(int param0) {
        if (param0 >= -69) {
          field_n = -39;
          return 2;
        }
        return 2;
    }

    rl() {
    }

    final int a(int param0, Object param1, Object param2) {
        up var4 = null;
        RuntimeException var4_ref = null;
        up var5 = null;
        String var6 = null;
        String var7 = null;
        up var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ((sp) (param1)).field_Sb;
          var4 = var8;
          var5 = ((sp) (param2)).field_Sb;
          var6 = uf.field_e[var8.field_q];
          if (param0 != 2) {
            field_q = 3;
          }
          var7 = uf.field_e[var5.field_q];
          stackIn_3_0 = var6.compareTo(var7) ^ this.field_i << 31;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("rl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_s = null;
        field_p = null;
        field_u = null;
        if (param0 != 20) {
          rl.b(85);
          field_t = null;
          return;
        }
        field_t = null;
    }

    static {
        field_s = "Searching for opponents";
        field_t = "Defensive";
        field_q = 20;
        field_p = "This entry doesn't match";
        field_r = -1;
        field_u = "GAME OVER";
    }
}
