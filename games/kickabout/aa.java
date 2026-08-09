/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aa extends ps {
    private long field_g;
    private String field_i;
    static String field_h;
    static ut field_f;

    final static void a(byte param0, int param1, mp param2) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        mp var5 = null;
        ml var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = or.field_d;
              var3 = var6;
              var6.b(param1, (byte) 113);
              var6.field_n = var6.field_n + 1;
              var4 = var6.field_n;
              var6.a(116, 1);
              if (null == param2.field_o) {
                var6.a(102, 0);
                break L1;
              } else {
                var6.a(111, param2.field_o.length);
                var6.a(0, param2.field_o.length, 1991220144, param2.field_o);
                break L1;
              }
            }
            var6.a(var4, false);
            var6.field_n = var6.field_n - 4;
            param2.field_m = var6.k(4);
            var6.c(param0 ^ 42, -var4 + var6.field_n);
            if (param0 == 20) {
              break L0;
            } else {
              var5 = (mp) null;
              aa.a((byte) -56, 113, (mp) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("aa.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(iw param0, int param1) {
        try {
            param0.a(this.field_g, -1781890008);
            param0.a((byte) -85, this.field_i);
            if (param1 != 17053) {
                mp var4 = (mp) null;
                aa.a((byte) 56, -49, (mp) null);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "aa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 > -101) {
            field_f = (ut) null;
            field_h = null;
            field_f = null;
            return;
        }
        field_h = null;
        field_f = null;
    }

    final static long c(int param0) {
        if (param0 != 29680) {
            aa.c(42);
            return nj.a(108) - ci.field_c;
        }
        return nj.a(108) - ci.field_c;
    }

    kj a(byte param0) {
        if (param0 > -77) {
            return (kj) null;
        }
        return ap.field_w;
    }

    aa(long param0, String param1) {
        try {
            this.field_i = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "aa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "There are no auctions in progress.";
    }
}
