/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends oa {
    static ed field_H;
    byte field_y;
    int field_F;
    static int field_D;
    n field_A;
    static boolean field_E;
    static String field_C;
    static int field_z;
    static String[] field_I;
    static ed field_G;
    static String field_B;
    static int field_x;

    final static boolean a(byte param0, int param1) {
        if (param1 == 13) {
          return true;
        }
        if (param0 == 15) {
          return di.field_d.b((byte) -18);
        }
        s.d((byte) 54);
        return di.field_d.b((byte) -18);
    }

    final static byte[] a(byte param0, byte[] param1) {
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
        CharSequence[] var9 = null;
        n var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          var10 = new n(param1);
          var3 = var10.e(0);
          if (param0 != -26) {
            var9 = (CharSequence[]) null;
            s.a((byte) 49, (CharSequence[]) null);
          }
          var4 = var10.g(-5053);
          if (0 <= var4 && (m.field_q == 0 ||
            !(m.field_q < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5_ref_byte__ = var11;
              var10.a(var13, (byte) -96, 0, var4);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var10.g(-5053);
            if (0 <= var5 && (m.field_q == 0 ||
              !(m.field_q < var5))) {
              var14 = new byte[var5];
              var12 = var14;
              var6 = var12;
              if (1 != var3) {
                var7 = tc.field_g;
                synchronized (var7) {
                  tc.field_g.a(122, var14, var10);
                }
              } else {
                i.a(var14, var5, param1, var4, 9);
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
          stackIn_26_1 = new StringBuilder().append("s.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 != 34) {
          return;
        }
        field_B = null;
        field_I = null;
        field_H = null;
        field_G = null;
        field_C = null;
    }

    s() {
    }

    final byte[] a(boolean param0) {
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (this.field_A.field_m < this.field_A.field_g.length - this.field_y) {
          throw new RuntimeException();
        }
        if (param0) {
          return this.field_A.field_g;
        }
        this.field_A = (n) null;
        return this.field_A.field_g;
    }

    final int g(int param0) {
        if (param0 != 100) {
          this.field_F = -96;
          if (null == this.field_A) {
            return 0;
          }
          return this.field_A.field_m * 100 / (-this.field_y + this.field_A.field_g.length);
        }
        if (null == this.field_A) {
          return 0;
        }
        return this.field_A.field_m * 100 / (-this.field_y + this.field_A.field_g.length);
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        CharSequence[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -4) {
            var3 = (CharSequence[]) null;
            s.a((byte) -12, (CharSequence[]) null);
          }
          stackIn_3_0 = ua.a(0, param1.length, param1, 4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("s.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_C = "Mouse over an icon for details";
        field_D = 0;
        field_B = "Names can only contain letters, numbers, spaces and underscores";
    }
}
