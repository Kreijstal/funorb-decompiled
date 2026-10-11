/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class oe {
    static int[] field_b;
    static int field_a;
    int field_d;
    String field_c;

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(int param0, int param1, rb param2, int param3, int param4) {
        rb var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          param2.a(12, param1 ^ -79);
          param2.c(17, -306);
          param2.c(param3, -306);
          param2.c(param0, -306);
          if (param1 != 32) {
            var6 = (rb) null;
            oe.a(-101, 110, (rb) null, -119, 60);
            param2.a(param4, -61);
          } else {
            param2.a(param4, -61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("oe.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        int var2Lifetime1;
        int var2Lifetime2;
        String var1Lifetime1;
        var5 = StarCannon.field_A;
        var6 = "(" + wc.field_i + " " + hh.field_a + " " + bh.field_d + ") " + vh.field_t;
        var1 = var6;
        if (il.field_g <= 0) {
          var2 = 37 % ((param0 - 3) / 43);
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2Lifetime1 = 0; il.field_g > var2Lifetime1; var2Lifetime1++) {
          var7 = var1Lifetime1 + ' ';
          var1Lifetime1 = var7;
          var3 = 255 & se.field_p.field_f[var2Lifetime1];
          var4 = var3 >> 4;
          var3 = var3 & 15;
          if (var4 >= 10) {
            var4 += 55;
          } else {
            var4 += 48;
          }
          var8 = var7 + (char)var4;
          if (var3 < 10) {
            var3 += 48;
          } else {
            var3 += 55;
          }
          var1Lifetime1 = var8 + (char)var3;
        }
        var2Lifetime2 = 37 % ((param0 - 3) / 43);
        return var1Lifetime1;
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            oe.b(71);
          }
          if (param0.equals("B")) {
            stackIn_5_0 = Byte.TYPE;
            return stackIn_5_0;
          }
          if (param0.equals("I")) {
            stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (param0.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param0.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param0.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param0.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param0.equals("D")) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (!param0.equals("C")) {
            stackIn_30_0 = Class.forName(param0);
            return stackIn_30_0;
          }
          stackIn_28_0 = Character.TYPE;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("oe.L(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 > -56) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_c, this.field_d);
    }

    final static i a(int param0, byte[] param1) {
        i var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        i stackIn_5_0 = null;
        i stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (i) (stackIn_2_0);
          }
          var2 = new i(param1, fc.field_d, qd.field_H, gg.field_d, gh.field_C, of.field_g, og.field_c);
          if (param0 != 5) {
            stackIn_5_0 = (i) null;
            return stackIn_5_0;
          }
          rc.b((byte) 105);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("oe.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static sg c(int param0) {
        if (s.field_i == null) {
          s.field_i = new sg();
          s.field_i.a((byte) 123, nb.field_c);
          s.field_i.field_u = 0;
          s.field_i.field_m = 4;
          s.field_i.field_h = 7697781;
          s.field_i.field_l = nb.field_b;
          s.field_i.field_g = 5;
          s.field_i.field_s = 2763306;
          s.field_i.field_r = 6;
          s.field_i.field_b = 14;
          if (param0 == -5671) {
            return s.field_i;
          }
          return (sg) null;
        }
        if (param0 == -5671) {
          return s.field_i;
        }
        return (sg) null;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 12) {
          oe.a(75);
        }
    }

    static {
    }
}
