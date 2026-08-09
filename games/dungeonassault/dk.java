/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk implements ca {
    static int field_c;
    static cn field_b;
    static String field_e;
    static String field_a;
    static int field_d;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -41) {
            field_b = (cn) null;
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cn var8 = null;
        try {
          L0: {
            L1: {
              if (param0 == 34) {
                break L1;
              } else {
                field_b = (cn) null;
                break L1;
              }
            }
            L2: {
              var6_int = param1.field_q + param2;
              var7 = param3 + param1.field_v;
              ll.a(param0 ^ 32, var6_int, param1.field_x, param1.field_s, var7);
              var8 = sl.field_c[1];
              if (!(param1 instanceof ck)) {
                break L2;
              } else {
                if (((ck) ((Object) param1)).field_E) {
                  var8.b(var6_int + (1 - -(-var8.field_E + param1.field_x >> -703459871)), 1 + var7 + (-var8.field_G + param1.field_s >> 855024673), 256);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param1.a((byte) 28)) {
              in.a(2 + var6_int, -4 + param1.field_s, param1.field_x - 4, var7 - -2, param0 + -33);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("dk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static wh a(int param0, int param1, String param2) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        wh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = vh.a(bl.field_t, "", param2);
            ai.a(param1 ^ param1, var3);
            stackIn_1_0 = new wh(var3, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("dk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_e = "You do not meet the requirements for the title of <%0>.";
        field_a = "Large, hairy humanoid with a jutting lower jaw, ramshackle plate armour and a two-handed hammer. Ogres are forever hungry, but luckily for them, they can eat almost anything.";
    }
}
