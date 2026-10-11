/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static tf field_c;
    static int field_d;
    static int field_b;
    static qh field_a;

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        if (param0 != -816856703) {
          hj var3 = (hj) null;
          u.a((hj) null, (byte) 92);
        }
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    final static oe[] a(hj param0, byte param1) {
        Object stackIn_3_0 = null;
        oe[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oe[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        oe var6_ref_oe = null;
        int var7 = 0;
        int var5Lifetime1;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param0.k(8, 1522829539);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (oe[]) (stackIn_3_0);
          }
          var3 = param0.k(12, 1522829539);
          var4 = new oe[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (!w.a(-1, param0)) {
              var6 = param0.k(ol.a(-23755, var5 - 1), 1522829539);
              var4[var5] = var4[var6];
            } else {
              var6_ref_oe = new oe();
              param0.k(24, 1522829539);
              param0.k(24, 1522829539);
              var6_ref_oe.field_b = param0.k(24, 1522829539);
              param0.k(9, 1522829539);
              param0.k(12, 1522829539);
              param0.k(12, 1522829539);
              param0.k(12, 1522829539);
              var4[var5] = var6_ref_oe;
            }
          }
          var5Lifetime1 = 70 / ((param1 + 47) / 36);
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("u.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, String param1, ci param2, boolean param3) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            field_a = (qh) null;
          }
          if (param2.a((byte) -125)) {
            stackIn_6_0 = param1 + " - " + param2.b(-22884) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("u.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, oa param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.f(-120);
            if (var3_int > param1) {
              var3_int = param1;
            }
            if (param0) {
              stackIn_4_0 = (String) null;
              return stackIn_4_0;
            }
            var4 = new byte[var3_int];
            param2.field_h = param2.field_h + bf.field_C.a(var3_int, var4, 0, param2.field_g, 0, param2.field_h);
            var5 = cc.a(0, 15923, var3_int, var4);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("u.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 < 99) {
          ci var2 = (ci) null;
          u.a((String) null, (String) null, (ci) null, false);
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_c = new tf(12, 0, 1, 0);
    }
}
