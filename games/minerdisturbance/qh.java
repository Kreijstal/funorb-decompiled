/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements ad {
    static String field_d;
    static int field_e;
    static int field_a;
    static int field_c;
    static String field_b;

    final static Object a(byte param0, boolean param1, byte[] param2) {
        t var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        t stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 112) {
            field_e = 94;
          }
          if (param2 == null) {
            stackIn_4_0 = null;
            return stackIn_4_0;
          }
          if (136 < param2.length) {
            var3 = new t();
            ((ni) ((Object) var3)).a((byte) -119, param2);
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (param1) {
            stackIn_13_0 = kh.a(param2, (byte) -16);
            return stackIn_13_0;
          }
          stackIn_11_0 = (byte[]) (param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("qh.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ea var8 = null;
        try {
          var6_int = param1 + param2.field_u;
          var7 = param2.field_t + param3;
          if (param0 != 12088) {
            return;
          }
          ng.a(param2.field_q, param2.field_v, 127, var6_int, var7);
          var8 = ed.field_g[1];
          if (param2 instanceof hc &&
            ((hc) (param2)).field_H) {
            var8.g((-var8.field_x + param2.field_v >> 1) + 1 + var6_int, var7 - (-1 - (-var8.field_A + param2.field_q >> 1)), 256);
          }
          if (param2.k(73)) {
            se.c(2 + var6_int, 2, 2 + var7, param2.field_v - 4, param2.field_q - 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("qh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        try {
          if (param1 == null) {
            stackIn_4_0 = rd.field_c;
            return stackIn_4_0;
          }
          var3_int = param1.length();
          if (param2) {
            stackIn_7_0 = (String) null;
            return stackIn_7_0;
          }
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = cl.a(-95, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ra.a(118, var4.charAt(0)) &&
                !ra.a(117, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                for (var6 = 0; var6 < param1.length(); var6++) {
                  var7 = param1.charAt(var6);
                  if (!ra.a(116, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_31_0 = ra.field_a;
                    return stackIn_31_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_36_0 = vh.field_d;
                return stackIn_36_0;
              }
              stackIn_22_0 = vh.field_d;
              return stackIn_22_0;
            }
            stackIn_17_0 = rd.field_c;
            return stackIn_17_0;
          }
          stackIn_12_0 = rd.field_c;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 1) {
          return;
        }
        vd.field_y = param0;
        h.field_b = param1;
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = 127 % ((param0 - 44) / 48);
        field_b = null;
    }

    static {
        field_d = "The 3x multiplier gives you triple points! Skilled miners use this to get the best rankings. If you buy 2x AND 3x, they combine to a massive 6x multiplier!";
        field_a = -1;
        field_e = 0;
        field_c = 2;
        field_b = "Ranking: Mhor's Mickaxe mof Massive Mining Multraness";
    }
}
