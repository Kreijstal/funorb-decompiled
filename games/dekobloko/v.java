/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_g;
    static String field_c;
    static boolean field_d;
    static String field_b;
    static String field_f;
    static String field_e;
    static byte[] field_a;

    final static boolean a(char param0, int param1) {
        if (param1 != -24380) {
          short[] var3 = (short[]) null;
          v.a((uf) null, true, (short[]) null, -23);
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (122 >= param0) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (122 >= param0) {
            return true;
          }
          return false;
        }
        if (param0 >= 65) {
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (122 >= param0) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (122 >= param0) {
          return true;
        }
        return false;
    }

    final static void b(int param0) {
        if (param0 != 0) {
          v.b(118);
          be.a((byte) 123, vk.field_a);
          return;
        }
        be.a((byte) 123, vk.field_a);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 == -66) {
          field_e = null;
          return;
        }
        field_d = true;
        field_e = null;
    }

    final static short[] a(uf param0, boolean param1, short[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          if (!param1) {
            v.a('\016', -20);
          }
          var4_int = param0.a(param3, (byte) 110);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (short[]) (stackIn_5_0);
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new short[var4_int];
          }
          var5 = param0.a(4, (byte) 123);
          var6 = (short)param0.a(16, (byte) 46);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (short)(param0.a(var5, (byte) 99) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param2);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("v.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_g = "Email: ";
        field_b = "Unpacking music";
        field_d = true;
        field_f = "Resigned";
        field_e = "Mouse over an icon for details";
    }
}
