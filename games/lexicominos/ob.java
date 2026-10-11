/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends bl {
    static db field_e;
    static String[] field_f;
    static boolean field_c;
    static db field_d;

    final static StringBuilder a(int param0, StringBuilder param1, byte param2, char param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var4_int = param1.length();
          param1.setLength(param0);
          if (param2 != 22) {
            field_d = (db) null;
          }
          for (var5 = var4_int; param0 > var5; var5++) {
            param1.setCharAt(var5, param3);
          }
          stackIn_7_0 = (StringBuilder) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ob.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 >= 112) {
          field_e = null;
          field_d = null;
          field_f = null;
          return;
        }
        ob.b(119);
        field_e = null;
        field_d = null;
        field_f = null;
    }

    static {
        field_c = false;
    }
}
