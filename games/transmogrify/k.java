/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k {
    static String field_e;
    int field_c;
    static String field_a;
    int field_d;
    int field_f;
    int field_b;
    int field_h;
    int field_g;

    public static void a(boolean param0) {
        if (param0) {
          field_e = (String) null;
          field_e = null;
          field_a = null;
          return;
        }
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static void b(boolean param0) {
        if (!param0) {
          field_e = (String) null;
        }
    }

    final static void a(int param0, boolean param1, int param2, ti[] param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param3 != null &&
            param4 > 0) {
            var5_int = param3[0].field_r;
            var6 = param3[2].field_r;
            if (!param1) {
              return;
            }
            var7 = param3[1].field_r;
            param3[0].c(param2, param0);
            param3[2].c(-var6 + (param2 + param4), param0);
            sb.a(q.field_i);
            sb.g(var5_int + param2, param0, param2 + param4 - var6, param3[1].field_s + param0);
            var8 = param2 + var5_int;
            var9 = -var6 + param2 + param4;
            for (param2 = var8; param2 < var9; param2 = param2 + var7) {
              param3[1].c(param2, param0);
            }
            sb.b(q.field_i);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("k.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 > -11) {
          return true;
        }
        if (param0 >= 65) {
          if (90 >= param0) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    static {
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_e = "Loading sound effects";
    }
}
