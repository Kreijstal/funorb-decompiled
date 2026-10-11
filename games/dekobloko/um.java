/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static String field_b;
    static int field_d;
    static String field_e;
    static int field_a;
    static w[] field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        qe var5 = null;
        byte[] var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (param2 > 0) {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; param3 > var5_int; var5_int++) {
              var8[var5_int] = param1[param2 + var5_int];
            }
          } else {
            var4 = param1;
          }
          var5 = new qe();
          var5.b((byte) -44);
          var5.a(255, var4, (long)(8 * param3));
          var6 = new byte[64];
          var5.a(64767752, param0, var6);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("um.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3 = param1 >> 16;
        if (param2 == 11469) {
          var4 = param1 & 65535;
          var5 = param0 >> 16;
          var6 = param0 & 65535;
          return param0 * var3 + var4 * var5 + (var4 * var6 >> 16);
        }
        return 84;
    }

    final boolean b(int param0) {
        if (param0 != 22277) {
          return false;
        }
        if (this == nn.field_c) {
          return true;
        }
        if (this == of.field_a) {
          return true;
        }
        if (this != wf.field_u) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
          field_e = (String) null;
          field_b = null;
          field_e = null;
          return;
        }
        field_b = null;
        field_e = null;
    }

    static {
        field_b = "Please enter your age in years";
        field_d = 65;
        field_a = 4;
        field_e = "If you are not, please change your password to something more obscure!";
    }
}
