/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh {
    static nk field_a;
    static qk field_c;
    static ja field_d;
    static volatile int field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -41) {
          mh.a((byte) 58);
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = Main.field_T;
        if (d.field_c > param0) {
          if (wc.field_A != null) {
            gj.field_a = wc.field_A.c(-1);
            vd.a(2, -1);
          } else {
            gj.field_a = qa.a(0, 480, 0, 17651, jk.field_a, 640);
          }
          if (gj.field_a != null) {
            tk.a(gj.field_a, -1);
            var2 = 2;
          } else {
            var2 = 3;
          }
        } else {
          var2 = (!dl.d(0)) ? 1 : 0;
        }
        if (null == wc.field_A &&
          rg.field_a) {
          sc.a(var2, (byte) 116, param1);
        }
    }

    final static int a(boolean param0, int param1, ee param2, String param3, String[] param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Main.field_T;
        try {
          var5_int = param2.a(param3);
          if (var5_int <= param1 &&
            param3.indexOf("<br>") == -1) {
            param4[0] = param3;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (-1 + (param1 + var5_int)) / param1;
          param1 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param3.length();
          if (param0) {
            stackIn_8_0 = 69;
            return stackIn_8_0;
          }
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param3.charAt(var9);
            if (var10 == 32 ||
              45 == var10) {
              var11 = param3.substring(var7, var9 + 1).trim();
              var12 = param2.a(var11);
              if (param1 <= var12) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param3.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param4[incrementValue$2] = param3.substring(var7, -3 + var9).trim();
              var7 = 1 + var9;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$0] = param3.substring(var7, var8).trim();
          }
          stackIn_28_0 = var6Lifetime1;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("mh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final static nk a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        nk stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -63) {
            mh.a(125, true);
          }
          if (ei.field_d == hh.field_g) {
            stackIn_4_0 = null;
            return (nk) (stackIn_4_0);
          }
          if (ei.field_d == gg.field_b &&
            param1.equals(dj.field_e)) {
            ei.field_d = tj.field_F;
            stackIn_8_0 = tf.field_s;
            return stackIn_8_0;
          }
          ei.field_d = hh.field_g;
          tf.field_s = null;
          dj.field_e = param1;
          stackIn_10_0 = null;
          return (nk) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("mh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
    }
}
