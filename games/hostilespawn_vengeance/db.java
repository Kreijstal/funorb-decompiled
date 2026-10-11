/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends hi {
    private ig field_q;
    private ig field_p;
    static java.awt.Frame field_r;
    static kk field_o;
    static int[] field_t;
    static String field_u;
    static int[] field_s;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_q.field_n.toLowerCase();
          var4 = param1.toLowerCase();
          var5 = 114 / ((-24 - param0) / 35);
          if (0 == var4.length()) {
            return null;
          }
          var6 = var4;
          if (vg.a(true, var6)) {
            stackIn_6_0 = ei.field_k;
            return stackIn_6_0;
          }
          if (nf.a(var6, -29205)) {
            stackIn_9_0 = g.field_R;
            return stackIn_9_0;
          }
          if (pb.a(17032, var6)) {
            stackIn_13_0 = uj.field_i;
            return stackIn_13_0;
          }
          if (this.a(121, param1)) {
            stackIn_16_0 = hg.field_c;
            return stackIn_16_0;
          }
          if (0 >= var7.length()) {
            stackIn_19_0 = l.field_b;
            return stackIn_19_0;
          }
          if (kc.a(var6, true, var7)) {
            stackIn_23_0 = jc.field_e;
            return stackIn_23_0;
          }
          if (vh.a(var7, 29360, var6)) {
            stackIn_26_0 = dc.field_c;
            return stackIn_26_0;
          }
          if (!eg.a(false, var7, var6)) {
            stackIn_31_0 = ei.field_k;
            return stackIn_31_0;
          }
          stackIn_29_0 = jc.field_e;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("db.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static String a(byte[] param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_3_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          var12 = new char[param3];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          if (param2 > -113) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var6 = 0; param3 > var6; var6++) {
            var7 = 255 & param0[param1 + var6];
            if (0 != var7) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = kh.field_hb[-128 + var7];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var10[incrementValue$1] = (char)var7;
            }
          }
          stackIn_16_0 = new String(var12, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("db.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    db(ig param0, ig param1, ig param2) {
        super(param0);
        try {
          this.field_q = param1;
          this.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        field_s = null;
        if (param0 > -35) {
          return;
        }
        field_o = null;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_p.field_n.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (0 <= var4.indexOf(var6)) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          if (param0 > 104) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("db.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final bm a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        bm stackIn_2_0 = null;
        bm stackIn_5_0 = null;
        bm stackIn_8_0 = null;
        bm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_q.field_n.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = bi.field_d;
            return stackIn_2_0;
          }
          if (!ja.a(var4, var3, 0)) {
            stackIn_5_0 = bi.field_d;
            return stackIn_5_0;
          }
          var5 = -63 % ((3 - param1) / 42);
          if (!this.a(123, param0)) {
            stackIn_10_0 = nd.field_d;
            return stackIn_10_0;
          }
          stackIn_8_0 = bi.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("db.L(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, ji param2) {
        try {
          kh.a(param2, param1, (byte) -105, param0);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "db.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = "Type your email address again to make sure it's correct";
    }
}
