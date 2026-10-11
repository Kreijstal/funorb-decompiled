/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static String field_g;
    static uj field_h;
    static java.math.BigInteger field_f;
    static String field_e;
    static int[] field_i;
    static int field_a;
    static int field_b;
    static int field_d;
    static String field_c;

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        field_i = null;
        field_c = null;
        if (param0 != 4) {
          q.a(125, (byte) -14, -93, -34, -5, -28, 57);
        }
        field_h = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param2 <= 2) {
            q.a(-2);
          }
          if (!vg.a(param1, param0, (byte) 26)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (var3_int >= param0.length()) {
              return true;
            }
            if (bc.a(param0.charAt(var3_int), -161)) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("q.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param1 != 12) {
          return false;
        }
        stackIn_8_0 = (param5 <= param4) && (param4 < param6 + param5) && (param2 <= param0) && (param0 < param2 + param3);
        return stackIn_8_0;
    }

    static {
        field_g = "Password is valid";
        field_i = new int[4];
        field_e = "Summoning Monsters";
        field_f = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_c = "Unpacking sound effects";
    }
}
