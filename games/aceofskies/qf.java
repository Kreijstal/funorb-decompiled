/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends o {
    int field_i;
    int field_j;
    int field_g;
    static String field_k;
    int field_l;
    int field_h;

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_k = (String) null;
          }
          stackIn_3_0 = mi.a(-120, param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qf.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, kc param4) {
        try {
          this.field_d.a(param4, true);
          this.field_l = param2;
          if (param1 < 99) {
            qf.a((byte) -97, true);
          }
          this.field_g = param0;
          this.field_i = 10;
          this.field_h = qq.a(20, es.field_b.length);
          this.field_j = param3;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qf.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public qf() {
        super(new kc());
        this.field_h = 0;
    }

    final void a(int param0, kc param1, int param2, int param3) {
        try {
          this.field_d.a(param1, true);
          this.field_l = param2;
          this.field_g = param3;
          int var5_int = 68 / ((43 - param0) / 61);
          this.field_i = 10;
          this.field_h = qq.a(20, es.field_b.length);
          this.field_j = 92;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(String param0, int param1, String param2, gk param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 65) {
            qf.b(-73);
          }
          if (!param3.b((byte) -77)) {
            stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          stackIn_7_0 = param0 + " - " + param3.a(param1, 100) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qf.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte[] param0, rb param1, int param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          var7_int = dq.a(param4, -70);
          if (null == lp.field_b) {
            lp.field_b = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          if (param2 != 25215) {
            qf.a((byte) 115, false);
          }
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = lp.field_b.nextInt();
          }
          if (wt.field_l == null ||
            !(var7_int <= wt.field_l.field_f.length)) {
            wt.field_l = new rb(var7_int);
          }
          wt.field_l.field_g = 0;
          wt.field_l.a(true, param4, param6, param0);
          wt.field_l.a(var7_int, (byte) 88);
          wt.field_l.a(var13, 2097272037);
          if (ke.field_a == null ||
            !(ke.field_a.field_f.length >= 100)) {
            ke.field_a = new rb(100);
          }
          ke.field_a.field_g = 0;
          ke.field_a.b(-1336879960, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            ke.field_a.a((byte) 87, var13[var11]);
            var11++;
          }
          ke.field_a.a(param4, 23385);
          ke.field_a.a(0, param5, param3);
          param1.a(true, ke.field_a.field_g, 0, ke.field_a.field_f);
          param1.a(true, wt.field_l.field_g, 0, wt.field_l.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("qf.M(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          qf.a((byte) 104, true);
        }
        field_k = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 77) {
          return;
        }
        gm.field_x.a(false, param1);
    }

    static {
        field_k = "OK";
    }
}
