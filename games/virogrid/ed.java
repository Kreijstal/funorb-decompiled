/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_f;
    static int field_b;
    static String field_e;
    static mg field_d;
    static km field_c;
    static int field_a;

    public static void a(byte param0) {
        if (param0 == 51) {
          field_e = null;
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_b = -120;
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        ml var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param1; param0 > var5; var5++) {
            var4_int = fi.field_j[(var4_int ^ param2[var5]) & 255] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          if (param3 != -26459) {
            var7 = (ml) null;
            ed.a(-79, (ml) null, 7, 111);
          }
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ed.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static pe a(int param0, ml param1, int param2, int param3) {
        RuntimeException var4 = null;
        pe stackIn_2_0 = null;
        pe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -629134904) {
            stackIn_4_0 = tm.a(jh.a(param1, 100, param3, param0), 105);
            return stackIn_4_0;
          }
          stackIn_2_0 = (pe) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ed.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_f = "You need to play 1 more rated game to unlock this option.";
        field_a = 50;
        field_e = "Year";
    }
}
