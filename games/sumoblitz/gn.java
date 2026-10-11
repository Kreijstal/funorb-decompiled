/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    int field_e;
    static String field_g;
    static boolean field_b;
    String field_f;
    ki field_a;
    static boolean field_d;
    String field_h;
    String field_c;

    final static void a(int param0, boolean param1) {
        if (!param1) {
          byte[] var3 = (byte[]) null;
          gn.a((byte[]) null, (byte) -29, -53, 2);
        }
        fe.a(-125, rc.field_l[param0]);
    }

    final static byte[] a(byte[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        np var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 >= -98) {
            gn.a(-28, false);
          }
          if (param2 > 0) {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; var5_int < param3; var5_int++) {
              var8[var5_int] = param0[var5_int + param2];
            }
          } else {
            var4 = param0;
          }
          var5 = new np();
          var5.b(-9);
          var5.a(var4, 7, (long)(param3 * 8));
          var6 = new byte[64];
          var5.a(0, var6, -25);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("gn.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
          byte[] var2 = (byte[]) null;
          gn.a((byte[]) null, (byte) -96, -56, 90);
        }
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "Please enter your age in years";
    }
}
