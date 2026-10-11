/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          byte[] var2 = (byte[]) null;
          qk.a(29, (byte[]) null);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        byte[] var7 = null;
        Object var8 = null;
        wf var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          var10 = new wf(param1);
          var3 = var10.d(true);
          var4 = var10.d((byte) 19);
          var5 = -48 % ((-21 - param0) / 59);
          if (var4 >= 0 && (jd.field_a == 0 ||
            !(jd.field_a < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var6_ref_byte__ = var11;
              var10.a(105, var4, 0, var13);
              stackIn_7_0 = var6_ref_byte__;
              return stackIn_7_0;
            }
            var6 = var10.d((byte) 19);
            if (var6 >= 0 && (jd.field_a == 0 ||
              !(jd.field_a < var6))) {
              var14 = new byte[var6];
              var12 = var14;
              var7 = var12;
              if (var3 == 1) {
                ic.a(var14, var6, param1, var4, 9);
              } else {
                var8 = al.field_F;
                synchronized (var8) {
                  al.field_F.a(8, var14, var10);
                }
              }
              stackIn_21_0 = var7;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("qk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param2 != 0) {
          return 118;
        }
        return ka.a(2);
    }

    static {
        field_a = "Loading...";
        field_b = "Unpacking sound effects";
    }
}
