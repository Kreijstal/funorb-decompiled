/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends q {
    int field_m;
    int field_j;
    static int field_k;
    static long[] field_l;

    final static boolean a(int param0, char param1) {
        int var2 = 97 / ((param0 + 11) / 33);
        if (param1 < 48) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 != -22677) {
          Object var2 = (Object) null;
          ui.a(false, (Object) null, (byte) -121);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static byte[] a(boolean param0, Object param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        dp var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param1 instanceof byte[]) {
            var3 = (byte[]) (param1);
            if (param0) {
              stackIn_8_0 = ch.a(var3, (byte) 115);
              return stackIn_8_0;
            }
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param2 != 37) {
            stackIn_11_0 = (byte[]) null;
            return stackIn_11_0;
          }
          if (!(param1 instanceof dp)) {
            throw new IllegalArgumentException();
          }
          var4 = (dp) (param1);
          stackIn_14_0 = var4.a(-21056);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ui.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    ui(int param0, int param1) {
        this.field_j = param1;
        this.field_m = param0;
    }

    static {
        field_l = new long[32];
        field_k = 0;
    }
}
