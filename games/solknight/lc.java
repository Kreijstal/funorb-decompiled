/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends gg {
    int field_o;
    static jh field_m;
    int field_q;
    static String field_l;
    int field_i;
    int field_n;
    static int field_h;
    static gb field_k;
    static volatile long field_s;
    int field_j;
    static nc field_t;
    static boolean field_u;
    static int field_p;
    int field_r;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          for (var2_int = param0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ec.a((char) var3, false) &&
              !gh.a((char) var3, (byte) -124)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("lc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
          field_s = -117L;
          return og.field_b;
        }
        return og.field_b;
    }

    public static void a(int param0) {
        if (param0 < -44) {
          field_t = null;
          field_l = null;
          field_k = null;
          field_m = null;
          return;
        }
        da var2 = (da) null;
        lc.a((da) null, 54, (String) null, (String) null, (da) null);
        field_t = null;
        field_l = null;
        field_k = null;
        field_m = null;
    }

    final static hd a(da param0, int param1, String param2, String param3, da param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            lc.a(113);
          }
          var5_int = param0.c(74, param3);
          var6 = param0.a(param2, -1, var5_int);
          stackIn_3_0 = sk.a((byte) -105, param0, var6, var5_int, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("lc.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, String param2, le param3, mg param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          if (param0 < 110) {
            field_u = true;
          }
          for (var7 = 1; param2.length() > var7; var7++) {
            var8 = param2.charAt(var7);
            if (60 == var8) {
              var6 = param3.field_c[0] + (var5_int >> 8) + param4.b(param2.substring(0, var7));
            }
            if (var6 != -1) {
              param3.field_c[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param1;
              }
              param3.field_c[var7] = (var5_int >> 8) + param3.field_c[0] - (-param4.b(param2.substring(0, 1 + var7)) + param4.a((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("lc.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, hi param3) {
        fh.field_b = param1;
        if (param0 != 5292) {
          return;
        }
        try {
          he.field_c = param3;
          pg.field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "lc.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, long param1) {
        try {
          try {
            Thread.sleep(param1);
          } catch (InterruptedException interruptedException) {
          }
          if (param0 == 2767) {
            return;
          }
          mg var4 = (mg) null;
          lc.a(14, 1, (String) null, (le) null, (mg) null);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private lc() throws Throwable {
        throw new Error();
    }

    static {
        field_s = 0L;
        field_h = 2621440;
        field_t = new nc();
    }
}
