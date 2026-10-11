/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_e;
    static int[] field_g;
    static String field_a;
    static int field_f;
    static int field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(byte[] param0, byte param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        iw var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          if (param1 != -3) {
            hh.a((byte) 111);
          }
          var9 = new iw(param0);
          var3 = var9.h((byte) -107);
          var4 = var9.k(param1 + 7);
          if (var4 >= 0 && (jk.field_h == 0 ||
            !(var4 > jk.field_h))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(var12, 0, (byte) -6, var4);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var9.k(4);
            if (var5 >= 0 && (jk.field_h == 0 ||
              !(var5 > jk.field_h))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (1 != var3) {
                var7 = lj.field_g;
                synchronized (var7) {
                  lj.field_g.a(-4019, var9, var13);
                }
              } else {
                au.a(var13, var5, param0, var4, 9);
              }
              stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("hh.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > 53) {
          field_g = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        hh.a((byte[]) null, (byte) -12);
        field_g = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(byte param0) {
        if (param0 != 97) {
          field_d = -103;
          if (10 > vj.field_c) {
            return false;
          }
          if (13 <= hl.field_d) {
            return true;
          }
          return false;
        }
        if (10 > vj.field_c) {
          return false;
        }
        if (13 <= hl.field_d) {
          return true;
        }
        return false;
    }

    static {
        field_e = "Join";
        field_a = "Gameplay";
        field_b = "Please log in as a subscribing member to access this feature.";
        field_c = "Click to turn on the buyout for this auction";
    }
}
