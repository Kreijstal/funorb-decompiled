/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends go {
    static String field_l;
    static String field_m;
    static int field_n;

    final ea b(int param0) {
        if (param0 != -27096) {
          field_n = -3;
        }
        return da.field_o;
    }

    final static void a(int param0, int param1, int param2, String param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          var4_int = param0;
          while (true) {
            if (var4_int >= up.field_n.length) {
              return;
            }
            if (!up.field_n[var4_int].field_f) {
              var4_int++;
              continue;
            }
            break;
          }
          up.field_n[var4_int].a(param3, param2, -1379417087, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gq.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    gq(long param0, String param1) {
        super(param0, param1);
    }

    public static void e(int param0) {
        if (param0 != 100) {
          field_n = 92;
        }
        field_l = null;
        field_m = null;
    }

    final static boolean d(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 <= 55) {
          field_m = (String) null;
        }
        stackIn_7_0 = (jg.a((byte) 59)) || !(uo.field_j > 0);
        return stackIn_7_0;
    }

    static {
        field_l = "This game has started.";
        field_m = "Main Menu";
        field_n = 100;
    }
}
