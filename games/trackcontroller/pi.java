/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fh {
    static String field_h;
    private java.nio.ByteBuffer field_g;
    static String field_f;

    final static void a(int param0, int param1, int param2, int param3, qj[] param4, int param5, int param6, int param7, qj[] param8, int param9, int param10, int param11, qj[] param12, int param13, oh param14, int param15, int param16, int param17, int param18, oh param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          if (param17 != 0) {
            return;
          }
          hf.a(param19, param5, param3, param10, false, param11, param20, param14, param15, param7, new na(param12), param0, param1, param2, new na(param8), param6, param13, param9, new na(param4), param18, param16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("pi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param20).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1) {
        try {
          this.field_g = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_g.position(0);
          this.field_g.put(param0);
          if (param1 != 13673) {
            byte[] var4 = (byte[]) null;
            this.a((byte[]) null, -51);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "pi.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] b(byte param0) {
        byte[] var4 = null;
        byte[] var2 = null;
        byte[] var4Lifetime1;
        byte[] var2Lifetime1;
        if (param0 == -2) {
          var4 = new byte[this.field_g.capacity()];
          var2 = var4;
          this.field_g.position(0);
          this.field_g.get(var4);
          return var4;
        }
        byte[] var3 = (byte[]) null;
        this.a((byte[]) null, -91);
        var4Lifetime1 = new byte[this.field_g.capacity()];
        var2Lifetime1 = var4Lifetime1;
        this.field_g.position(0);
        this.field_g.get(var4Lifetime1);
        return var4Lifetime1;
    }

    public static void b(int param0) {
        if (param0 != 0) {
          pi.b(81);
          field_h = null;
          field_f = null;
          return;
        }
        field_h = null;
        field_f = null;
    }

    pi() {
    }

    static {
        field_h = "Unfortunately you are not eligible to create an account.";
        field_f = "CONGRATULATIONS!";
    }
}
