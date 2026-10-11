/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks extends ff {
    static int field_v;
    static ri[] field_w;
    static String field_u;
    static cp field_x;
    static ri field_t;
    private byte[] field_s;

    ks() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final byte[] b(int param0, int param1, int param2, int param3) {
        this.field_s = new byte[param1 * (param2 * param3) * 2];
        this.a(param3, param0 ^ 207, param2, param1);
        if (param0 == 1) {
          return this.field_s;
        }
        ks.a((byte) -23, -46, 65, -1, 46);
        return this.field_s;
    }

    public static void d(int param0) {
        field_w = null;
        if (param0 == -11701) {
          field_t = null;
          field_u = null;
          field_x = null;
          return;
        }
        fs var2 = (fs) null;
        ks.a((java.math.BigInteger) null, (java.math.BigInteger) null, true, (fs) null, (fs) null);
        field_t = null;
        field_u = null;
        field_x = null;
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, boolean param2, fs param3, fs param4) {
        if (param2) {
          return;
        }
        try {
          sr.a(param0, param4.field_p, param4.field_n, param1, (byte) -29, param3, 0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ks.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static wb[] a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= -5) {
          return oq.a(param4, param2, 1, 1, 1, param3, (byte) -113, param1, 3);
        }
        field_x = (cp) null;
        return oq.a(param4, param2, 1, 1, 1, param3, (byte) -113, param1, 3);
    }

    final static ha a(int param0, java.awt.Canvas param1, d param2, boolean param3, int param4, ki param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        java.awt.Dimension var8 = null;
        ha stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 0;
          var7 = 0;
          if (param1 != null) {
            var8 = param1.getSize();
            var6_int = var8.width;
            var7 = var8.height;
          }
          if (!param3) {
            field_x = (cp) null;
          }
          stackIn_5_0 = ha.a(param0, param1, -1, param4, param2, var7, var6_int, param5);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ks.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        param1 = (byte)((param1 >> 1 & 127) + param2);
        int var4 = 2 * param0;
        int incrementValue$0 = var4;
        var4++;
        this.field_s[incrementValue$0] = (byte)param1;
        this.field_s[var4] = (byte)param1;
    }

    static {
        field_u = "Email (Login):";
        field_v = 0;
    }
}
