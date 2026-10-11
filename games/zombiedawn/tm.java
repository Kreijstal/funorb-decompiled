/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends le {
    static int[] field_n;
    static vn field_m;
    static int[] field_i;
    static int[] field_l;
    static vn[] field_h;
    fn field_j;
    static int[] field_k;
    static String field_o;

    final static void a(int param0, int param1, int param2, vn[] param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          if (param3 != null &&
            param5 > 0) {
            var6_int = param3[0].field_r;
            var7 = param3[2].field_r;
            var8 = param3[1].field_r;
            param3[0].c(param0, param2, param4);
            param3[2].c(-var7 + (param5 + param0), param2, param4);
            bi.b(eo.field_c);
            bi.c(param0 + var6_int, param2, param5 + param0 - var7, param3[1].field_q + param2);
            var9 = param0 + var6_int;
            var10 = param0 + param5 - var7;
            for (param0 = var9; param0 < var10; param0 = param0 + var8) {
              param3[1].c(param0, param2, param4);
            }
            if (param1 != 32421) {
              tm.a(-59, (byte) 126, false, -69);
            }
            bi.a(eo.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("tm.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static Class b(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param1.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (param0 <= 64) {
            stackIn_27_0 = (Class) null;
            return stackIn_27_0;
          }
          if (!param1.equals("C")) {
            stackIn_32_0 = Class.forName(param1);
            return stackIn_32_0;
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("tm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 == -5364) {
          field_m = null;
          field_l = null;
          field_i = null;
          field_n = null;
          field_k = null;
          field_h = null;
          return;
        }
    }

    final static eo a(byte param0, String param1) {
        RuntimeException var2 = null;
        eo stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vh.field_c == tk.field_a) {
            return null;
          }
          if (param0 != 51) {
            field_n = (int[]) null;
          }
          if (tk.field_a == hm.field_H &&
            param1.equals(kk.field_k)) {
            tk.field_a = ic.field_S;
            stackIn_8_0 = r.field_G;
            return stackIn_8_0;
          }
          r.field_G = null;
          tk.field_a = vh.field_c;
          kk.field_k = param1;
          stackIn_10_0 = null;
          return (eo) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    tm(int param0) {
        this.field_j = fn.a(vb.field_D[param0], 100, 256);
        aa.a(120, this.field_j);
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var7 = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        boolean[] var6 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        boolean[] var15 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          var9 = new int[1 + tl.field_g.length];
          var13 = var9;
          var10 = var13;
          var4 = var10;
          var14 = new int[tl.field_g.length + 1];
          var11 = var14;
          var5 = var11;
          var15 = new boolean[1 + tl.field_g.length];
          var12 = var15;
          var6 = var12;
          for (var7 = 0; tl.field_g.length > var7; var7++) {
            var9[var7] = tl.field_g[var7];
            var5[var7] = oo.field_U[var7];
            var6[var7] = ka.field_h[var7];
          }
          var4[-1 + var13.length] = param0;
          var5[var14.length - 1] = param3;
          var6[-1 + var15.length] = param2;
          oo.field_U = var5;
          ka.field_h = var6;
          tl.field_g = var4;
          if (param1 == -77) {
            return;
          }
          field_m = (vn) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4_ref), "tm.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_l = new int[9];
        field_n = new int[9];
        field_k = new int[9];
        field_i = new int[9];
        field_n[0] = 320;
        field_i[0] = 5;
        field_l[0] = 3;
        field_k[0] = 47;
        field_n[1] = 344;
        field_i[1] = 5;
        field_l[1] = 4;
        field_n[2] = 376;
        field_k[1] = 50;
        field_i[2] = 5;
        field_l[2] = 3;
        field_n[3] = 400;
        field_k[2] = 47;
        field_i[3] = 5;
        field_l[3] = 3;
        field_k[3] = 47;
        field_n[4] = 424;
        field_i[4] = 5;
        field_l[4] = 3;
        field_k[4] = 47;
        field_n[5] = 296;
        field_i[5] = 6;
        field_l[5] = 3;
        field_k[5] = 44;
        field_n[6] = 272;
        field_i[6] = 6;
        field_l[6] = 3;
        field_n[7] = 216;
        field_k[6] = 44;
        field_i[7] = 5;
        field_l[7] = 4;
        field_n[8] = 192;
        field_k[7] = 55;
        field_i[8] = 5;
        field_l[8] = 3;
        field_k[8] = 47;
    }
}
