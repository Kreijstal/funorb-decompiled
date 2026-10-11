/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf {
    static String field_f;
    static String field_e;
    static int[] field_g;
    static String field_c;
    static String field_d;
    static long[] field_a;
    static boolean field_b;

    public static void c(int param0) {
        field_f = null;
        field_g = null;
        if (param0 == -8871) {
          field_d = null;
          field_c = null;
          field_a = null;
          field_e = null;
          return;
        }
        field_d = (String) null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_e = null;
    }

    final static void a(String param0, boolean param1, int param2, String param3) {
        if (param2 != 32) {
          return;
        }
        try {
          kd.field_a = param0;
          h.field_U = param3;
          ko.a(param1, rl.field_e, -26027);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        fa var1 = null;
        fa var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -29949) {
            field_g = (int[]) null;
          }
          ig.a(-56);
          var1 = po.field_b.c(1504642273);
          while (var1 instanceof ln) {
            var2 = var1.field_a;
            if (((ln) (var1)).field_o.h()) {
              var1.c(2779);
            }
            var1 = var2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "gf.H(" + param0 + ')');
        }
    }

    final static boolean a(fm param0, int param1, fm param2, fm param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.b(-3) &&
            param2.a("commonui", -1)) {
            if (!param0.b(-3)) {
              return false;
            }
            if (!param0.a("commonui", -1)) {
              return false;
            }
            var4_int = -3 / ((-26 - param1) / 51);
            if (param3.b(-3) &&
              param3.a("button.gif", -1)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gf.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    abstract void a(byte[] param0, boolean param1);

    abstract byte[] b(int param0);

    static {
        field_a = new long[32];
        field_c = "End of free game";
        field_d = "Only show private chat from my friends and opponents";
        field_f = "This game option is not available in rated games.";
        field_b = false;
        field_e = "Inviting <%0>";
    }
}
