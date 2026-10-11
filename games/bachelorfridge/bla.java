/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bla extends td {
    static kv[] field_p;
    static String field_q;

    final static ee[] a(int param0, String param1, String param2, vr param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vr var6 = null;
        ee[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(param1, false);
          var5 = param3.a((byte) 6, var4_int, param2);
          if (param0 != 29611) {
            var6 = (vr) null;
            bla.a(39, (String) null, (String) null, (vr) null);
          }
          stackIn_3_0 = kn.a(-7726, param3, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bla.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, kv[] param1, byte param2, int param3) {
        raa.field_I = new lda(param1);
        wo.field_j = param0;
        if (param2 != 15) {
          return;
        }
        try {
          ge.field_I = param3;
          el.e((byte) 122);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bla.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga var4 = null;
        pg var5 = null;
        kv[] var6 = null;
        ew stackIn_6_0 = null;
        pg stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            var6 = (kv[]) null;
            bla.a(57, (kv[]) null, (byte) 36, -19);
          }
          var3 = this.field_h.a(62, param0);
          var4 = this.field_j.a(116, param0);
          if (var4 != null &&
            !var4.i(-77)) {
            var5 = new pg(this.field_g, new nq(var3), this.field_j);
            var5.field_o.a(new iv(new nq(var4), false, 1, 0, 42), true);
            stackIn_8_0 = var5;
            return (ii) ((Object) stackIn_8_0);
          }
          stackIn_6_0 = new ew(new nq(var3));
          return (ii) ((Object) stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("bla.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    bla(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bla.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_p = null;
        if (param0 == 42) {
          field_q = null;
          return;
        }
        vr var2 = (vr) null;
        bla.a(30, (String) null, (String) null, (vr) null);
        field_q = null;
    }

    final static void c(byte param0) {
        lw.field_k = new String[cja.field_v];
        lw.field_k[7] = me.field_q;
        lw.field_k[18] = saa.field_r;
        lw.field_k[6] = on.field_p;
        lw.field_k[19] = ql.field_q;
        lw.field_k[16] = tl.field_q;
        lw.field_k[param0] = cu.field_y;
        lw.field_k[9] = bda.field_o;
        lw.field_k[17] = vaa.field_c;
        lw.field_k[11] = io.field_r;
        lw.field_k[21] = us.field_d;
        lw.field_k[20] = ts.field_q;
        lw.field_k[5] = rb.field_r;
        lw.field_k[4] = nu.field_a;
        lw.field_k[15] = qc.field_e;
    }

    static {
        field_q = "Your rating is <%0>";
    }
}
