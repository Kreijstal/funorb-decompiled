/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf extends o {
    int field_m;
    static String field_k;
    static String field_n;
    static String field_l;

    final static boolean e(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = ad.field_b;
        synchronized (var1) {
          if (md.field_g == pk.field_H) {
            return false;
          }
          if (param0 != 32722) {
            field_l = (String) null;
          }
          ob.field_K = g.field_g[md.field_g];
          od.field_k = ll.field_b[md.field_g];
          md.field_g = 1 + md.field_g & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    nf(int param0) {
        this.field_m = param0;
    }

    public static void h(int param0) {
        field_k = null;
        if (param0 != 127) {
          field_n = (String) null;
          field_l = null;
          field_n = null;
          return;
        }
        field_l = null;
        field_n = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        mg var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          if (param1 != -2) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var9 = new mg(param0);
          var3 = var9.b((byte) 90);
          var4 = var9.l(0);
          if (var4 >= 0 && (0 == lj.field_E ||
            !(var4 > lj.field_E))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a((byte) 114, var12, 0, var4);
              stackIn_10_0 = var5_ref_byte__;
              return stackIn_10_0;
            }
            var5 = var9.l(0);
            if (0 <= var5 && (lj.field_E == 0 ||
              !(var5 > lj.field_E))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (var3 != 1) {
                var7 = tj.field_e;
                synchronized (var7) {
                  tj.field_e.a(var13, 693, var9);
                }
              } else {
                ac.a(var13, var5, param0, var4, 9);
              }
              stackIn_24_0 = var6;
              return stackIn_24_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("nf.D(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract Object f(int param0);

    abstract boolean g(int param0);

    static {
        field_k = "This game has been updated! Please reload this page.";
        field_l = "Achievements";
        field_n = "Orb Coins";
    }
}
