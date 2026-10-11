/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends a {
    static wb field_k;
    static o field_n;
    static String field_l;
    static String field_m;
    static int field_o;
    static String field_p;
    static o field_j;
    static java.awt.Canvas field_q;

    final static void d(byte param0) {
        if (null != ah.field_e) {
          ah.field_e.f(true);
        }
        sj.field_d = new ga();
        gf.field_cb.c(-3399, sj.field_d);
        if (param0 < 117) {
          field_o = 48;
        }
    }

    public static void e(byte param0) {
        field_j = null;
        field_l = null;
        field_q = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_n = null;
        if (param0 < 57) {
          field_k = (wb) null;
        }
    }

    final qf a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        qf stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != wd.a(param0, -112)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param1 > -109) {
            field_m = (String) null;
          }
          if (var3_int != 0) {
            return ph.field_g;
          }
          stackIn_8_0 = rg.field_f;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dc.J(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    dc(vg param0) {
        super(param0);
    }

    final static uj[] a(byte param0, dl param1) {
        uj[] stackIn_4_0 = null;
        uj[] stackIn_11_0 = null;
        uj[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        uj[] var4 = null;
        int var5 = 0;
        uj var6 = null;
        int var7 = 0;
        nj var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var5Lifetime1;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (!param1.b((byte) 31)) {
            stackIn_4_0 = new uj[]{};
            return stackIn_4_0;
          }
          var8 = param1.a(7721);
          while (0 == var8.field_c) {
            i.a((byte) 82, 10L);
          }
          if (var8.field_c == 2) {
            stackIn_11_0 = new uj[]{};
            return stackIn_11_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          var4 = new uj[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new uj();
            var4[var5] = var6;
            var6.field_c = var3[var5 << 2];
            var6.field_d = var3[(var5 << 2) + 1];
            var6.field_e = var3[2 + (var5 << 2)];
            var6.field_a = var3[3 + (var5 << 2)];
          }
          var5Lifetime1 = 56 / ((57 - param0) / 58);
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("dc.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(dj param0, int param1, byte param2) {
        jd var3 = id.field_c;
        if (param2 != 46) {
          return;
        }
        try {
          var3.e(param1, -2147483648);
          var3.c(36, param0.field_i);
          var3.c(108, param0.field_h);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "dc.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        dl var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (dl) null;
            dc.a((byte) -32, (dl) null);
          }
          if (this.a(param0, (byte) -112) != rg.field_f) {
            stackIn_6_0 = (String) (field_l);
            return stackIn_6_0;
          }
          stackIn_4_0 = fg.field_e;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("dc.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = new wb(3);
        field_l = "Email is valid";
        field_m = "CURRENT<br>SCORE";
        field_p = "Members' Benefits";
    }
}
