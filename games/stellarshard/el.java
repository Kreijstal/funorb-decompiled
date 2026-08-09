/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends ki {
    gi field_B;
    static String field_H;
    static int[] field_F;
    byte[] field_D;
    int field_C;
    static int field_I;
    static uc field_E;

    final static ek i(int param0) {
        ek var1;
        if (param0 < 88) {
          return (ek) null;
        } else {
          var1 = new ek(nc.field_G, wd.field_b, ak.field_c[0], vi.field_c[0], vc.field_b[0], ih.field_d[0], ih.field_b[0], gj.field_w);
          tb.f((byte) -113);
          return var1;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return 30;
        }
        if (!(!this.field_w)) {
            return 0;
        }
        return 100;
    }

    public static void h(int param0) {
        field_E = null;
        field_F = null;
        int var1 = 27 % ((-59 - param0) / 48);
        field_H = null;
    }

    el() {
    }

    final static ek a(String param0, pf param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ek stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.b(param3, (byte) -118);
            var6 = -52 % ((param2 - 71) / 55);
            var5 = param1.a(var4_int, param0, (byte) -11);
            stackIn_1_0 = fc.a(var4_int, param1, var5, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("el.B(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final byte[] g(int param0) {
        if (this.field_w) {
          throw new RuntimeException();
        } else {
          if (param0 != -27203) {
            this.a(true);
            return this.field_D;
          } else {
            return this.field_D;
          }
        }
    }

    static {
        field_F = new int[]{3, 6, 5, 6, 7, 4};
        field_H = "This password contains your email address, and would be easy to guess";
    }
}
