/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends wj {
    static char field_p;
    static te field_o;
    private rj field_n;

    final static le[] a(String param0, ad param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            rd.c(false);
          }
          var4_int = param1.c(param3, (byte) -105);
          var5 = param1.a(param0, var4_int, -28459);
          stackIn_3_0 = tj.a(var5, param1, var4_int, (byte) -126);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rd.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 != 10396) {
          field_p = 'ﾳ';
          field_o = null;
          return;
        }
        field_o = null;
    }

    final static ai a(int param0, ad param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ai stackIn_5_0 = null;
        ai stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wg.a(param2, param0, param1, -3)) {
            stackIn_2_0 = null;
            return (ai) (stackIn_2_0);
          }
          if (param3 == 1896) {
            stackIn_7_0 = ee.k(15090);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ai) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("rd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    rd(rj param0, rj param1) {
        super(param0);
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            var4 = (String) null;
            rd.a((String) null, (ad) null, 78, (String) null);
          }
          if (this.field_n instanceof ag) {
            var3 = ((ag) ((Object) this.field_n)).a(-105);
            if (var3 != null) {
              if (var3.b(false) == wj.field_i &&
                !param1.equals(this.field_n.field_s)) {
                stackIn_7_0 = ad.field_k;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.b((byte) 66);
              return stackIn_9_0;
            }
          }
          if (param1.equals(this.field_n.field_s)) {
            return null;
          }
          stackIn_13_0 = ad.field_k;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("rd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        String var3 = null;
        Throwable decompiledCaughtException = null;
        String var3Lifetime1;
        if (we.field_n == null) {
          if (!param0) {
            return;
          }
          var3 = (String) null;
          rd.a((String) null, (ad) null, -96, (String) null);
          return;
        }
        var1 = we.field_n;
        synchronized (var1) {
          we.field_n = null;
        }
        if (param0) {
          var3Lifetime1 = (String) null;
          rd.a((String) null, (ad) null, -96, (String) null);
        }
    }

    final na a(String param0, int param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_6_0 = null;
        na stackIn_9_0 = null;
        na stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n instanceof ag) {
            var3 = ((ag) ((Object) this.field_n)).a(81);
            if (var3 != null &&
              var3.b(false) != wj.field_i) {
              stackIn_6_0 = ol.field_h;
              return stackIn_6_0;
            }
          }
          if (param1 != 3917) {
            stackIn_9_0 = (na) null;
            return stackIn_9_0;
          }
          if (!param0.equals(this.field_n.field_s)) {
            stackIn_13_0 = ol.field_h;
          } else {
            stackIn_13_0 = wj.field_i;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("rd.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new te(0, 2, 2, 1);
    }
}
