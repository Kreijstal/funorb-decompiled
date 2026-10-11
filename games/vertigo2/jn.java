/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_d;
    static fi field_g;
    private lo field_e;
    private r field_f;
    private r field_a;
    static int field_c;
    static er[] field_b;

    final q a(int param0, int param1) {
        q var3;
        byte[] var4;
        q var3Lifetime1;
        var3 = (q) (this.field_e.b((long)param1, (byte) 74));
        if (var3 != null) {
          return var3;
        }
        if (32768 <= param1) {
          var4 = this.field_a.a(1, param1 & 32767, (byte) -93);
        } else {
          var4 = this.field_f.a(1, param1, (byte) -22);
        }
        var3Lifetime1 = new q();
        if (param0 != 1) {
          this.a(65, -27);
        }
        if (var4 != null) {
          var3Lifetime1.a(new ed(var4), -88);
        }
        if (32768 <= param1) {
          var3Lifetime1.a((byte) 93);
        }
        this.field_e.a((long)param1, var3Lifetime1, (byte) -86);
        return var3Lifetime1;
    }

    final static void a(li param0, li param1, int param2) {
        if (param2 != 18724) {
          return;
        }
        try {
          if (param0.field_a != null) {
            param0.c(2);
          }
          param0.field_c = param1;
          param0.field_a = param1.field_a;
          param0.field_a.field_c = param0;
          param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "jn.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        ga.a(nl.field_e, param0, param0 ^ 82);
        ga.a(nq.field_G, 6, 86);
        ga.a(ir.field_e, 8, param0 ^ 126);
        ga.a(aa.field_Jb, 13, 80);
        if (!mm.b(-12942)) {
          ga.a(po.field_c, 18, 127);
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        if (param0 < 37) {
          field_d = (String) null;
        }
    }

    jn(int param0, r param1, r param2, jh param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_e = new lo(64);
        try {
          this.field_f = param1;
          this.field_a = param2;
          if (this.field_f != null) {
            this.field_f.b(1, (byte) -99);
          }
          if (this.field_a == null) {
            return;
          }
          this.field_a.b(1, (byte) -29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("jn.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, java.awt.Component param2, int param3, boolean param4, int param5, db param6, jj param7) {
        try {
          dd.a(param0, param4, 10);
          ri.field_r = dd.a(param7, param2, 0, param3);
          mh.field_d = dd.a(param7, param2, 1, param1);
          il.field_g = new fp();
          wp.field_a = param1 * 1000 / param0;
          mh.field_d.a(il.field_g);
          qc.field_v = param6;
          qc.field_v.c(-82, nd.field_k);
          if (param5 != 18246) {
            field_c = 51;
          }
          ri.field_r.a(qc.field_v);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "jn.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -4765) {
          return;
        }
        or.field_c = param0;
        ek.field_E = param2;
    }

    final static void a(int[] param0, int param1, fb param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param6 = param6 - param0[0];
          param3 = param3 - param0[1];
          param1 = param1 - param0[2];
          var9_int = param1 * param0[11] + (param3 * param0[param7] + param0[9] * param6) >> 9;
          if (var9_int <= 6400) {
            return;
          }
          var10 = (param8 << 16) / var9_int;
          var11 = (param5 << 16) / var9_int;
          var12 = -(var10 >> 1) + ((param0[5] * param1 + param3 * param0[4] + param0[3] * param6) / var9_int + bi.field_d + oo.field_l);
          var13 = oo.field_e + bi.field_f + (param6 * param0[6] + param3 * param0[7] + param1 * param0[8]) / var9_int - (var11 >> 1);
          if (param4 != 256) {
            param2.a(var12, var13, var10, var11, param4);
            return;
          }
          param2.a(var12, var13, var10, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_8_0 = var9;
          stackIn_8_1 = new StringBuilder().append("jn.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_d = "Names should contain a maximum of 12 characters";
        field_c = 1;
    }
}
