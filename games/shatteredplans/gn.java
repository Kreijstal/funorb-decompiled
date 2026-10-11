/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends o {
    static String field_v;
    static String field_x;
    static bi field_y;
    static int field_t;
    static int field_B;
    static qr field_w;
    private wk field_z;
    static String field_A;
    static nq field_u;
    private wk[] field_C;

    final static void a(int param0, int param1, boolean param2, int param3) {
        es.field_n = param3;
        ah.field_P = param1;
        rm.field_b = param0;
        if (param2) {
          field_w = (qr) null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 != -9861) {
          qr var5 = (qr) null;
          gn.a(122, (si) null, (qr) null, (qr) null, (qr) null);
        }
        if (bq.field_h != null &&
          13 == oq.field_j) {
          bq.field_h = null;
          return true;
        }
        if (!sr.field_h) {
          if (dp.field_t ||
            oq.field_j == 9 ||
            oq.field_j == 10 ||
            oq.field_j == 11) {
            return dp.a(param1 ^ 9952, param0, param3);
          }
          if (oq.field_j == 80 &&
            b.d((byte) 108)) {
            sr.field_h = true;
            return true;
          }
          return false;
        }
        if (!b.d((byte) -97)) {
          return false;
        }
        int var4 = le.a(param0, param2, false) ? 1 : 0;
        if (80 == oq.field_j ||
          oq.field_j == 84) {
          var4 = 1;
          sr.field_h = false;
        }
        if (oq.field_j == 13) {
          qq.c(false);
          var4 = 1;
          sr.field_h = false;
        }
        return var4 != 0;
    }

    private final void a(gn param0, boolean param1, int param2) {
        int var4_int = 0;
        wk dupTemp$0 = null;
        wk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wk stackIn_12_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        wk var5 = null;
        wk var6 = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          super.a(param0, (byte) 42);
          if (param2 != -21979) {
            field_y = (bi) null;
          }
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_C[var4_int];
              if (var5 != null) {
                var6 = param0.field_C[var4_int];
                stackIn_11_0 = var5;
                stackIn_11_1 = 42;
                if (var6 == null) {
                  dupTemp$0 = new wk();
                  param0.field_C[var4_int] = dupTemp$0;
                  stackIn_12_2 = dupTemp$0;
                } else {
                  stackIn_12_2 = var6;
                }
                ((wk) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_12_2);
              } else {
                param0.field_C[var4_int] = null;
              }
            }
            return;
          }
          ps.a(this.field_C, 0, param0.field_C, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gn.J(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, bi param1) {
        int var4 = 0;
        wk[] var3 = null;
        wk var5 = null;
        int var6 = 0;
        wk[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -12) {
            gn.b(true);
          }
          var7 = this.field_C;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("gn.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final wk a(int param0, int param1) {
        int var3 = -79 % ((param0 + 42) / 59);
        wk dupTemp$0 = new wk();
        this.field_C[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public gn() {
        this.field_C = new wk[6];
        this.field_z = new wk();
        wk dupTemp$0 = new wk();
        this.field_C[0] = dupTemp$0;
        wk var1 = dupTemp$0;
        var1.a(false);
    }

    gn(gn param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, -21979);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        field_v = null;
        field_w = null;
        field_A = null;
        field_x = null;
        if (!param0) {
          qr var2 = (qr) null;
          gn.a(-46, (si) null, (qr) null, (qr) null, (qr) null);
        }
        field_y = null;
    }

    final static vm a(int param0, si param1, qr param2, qr param3, qr param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        vm stackIn_12_0 = null;
        vm stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        vm[] var11 = null;
        int var12 = 0;
        si var13_ref_si = null;
        int var13 = 0;
        int var15 = 0;
        dp var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (vm) (stackIn_3_0);
          }
          if (param1.field_r != null) {
            stackIn_7_0 = param1.field_r.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (null == param1.field_x) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = param1.field_x.length;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          if (param0 != 0) {
            stackIn_12_0 = (vm) null;
            return stackIn_12_0;
          }
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new vm[var7];
          if (param1.field_r != null) {
            for (var12 = 0; var12 < param1.field_r.length; var12++) {
              var13_ref_si = kq.field_A.a(param1.field_r[var12], (byte) 100);
              var8[var12] = var13_ref_si.field_t;
              var9[var12] = param1.field_p[var12];
              var11[var12] = gn.a(param0 + 0, var13_ref_si, param2, param3, param4);
            }
          }
          if (null != param1.field_x) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; var14 < param1.field_x.length; var14++) {
              var15 = param1.field_x[var14];
              if (-1 == var15) {
                var8[var12Lifetime1 + var14] = qh.field_u;
                var9[var12Lifetime1 + var14] = param1.field_s[var14];
                var10[var14 + var12Lifetime1] = param1.field_x[var14];
              } else {
                var16 = dh.field_c.a((byte) 47, var15);
                var8[var14 + var12Lifetime1] = var16.f(80);
                var9[var12Lifetime1 + var14] = param1.field_s[var14];
                if (0 >= var9[var12Lifetime1 + var14]) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var12Lifetime1 + var14] = param1.field_x[var14];
              }
            }
          }
          stackIn_28_0 = new vm(0L, param2, param4, param3, var11, var20, var8, var21);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("gn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void a(byte param0, bi[] param1) {
        int var4 = 0;
        wk[] var3 = null;
        wk var5 = null;
        int var6 = 0;
        wk[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var7 = this.field_C;
          var3 = var7;
          if (param0 != 8) {
            field_u = (nq) null;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_h = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("gn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(bi[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (param2 != 3) {
            field_x = (String) null;
          }
          if (this.field_C[var4_int] == null) {
            this.field_C[var4_int] = new wk();
          }
          this.field_C[param1].field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gn.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        vg stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        wk var7 = null;
        wk var9 = null;
        bi var10 = null;
        kg var11 = null;
        wk var12 = null;
        wk var13 = null;
        wk var14 = null;
        wk var15 = null;
        try {
          if (!(param0 instanceof kg)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (vg) (param0);
          }
          var11 = (kg) (stackIn_3_0);
          ke.a(-6187, param0.field_x + (param1 + param0.field_m), param0.field_n + param0.field_q + param3, param0.field_q + param3, param1 + param0.field_m);
          if (var11 != null) {
            param2 = param2 & var11.field_y;
          }
          var7 = this.field_C[0];
          this.field_z.a(false);
          var7.a(param0, this.field_z, this, param1, 0, param3);
          if (var11 != null) {
            if (var11.field_z) {
              var12 = this.field_C[1];
              if (var12 != null) {
                var12.a(param0, this.field_z, this, param1, param4 ^ 12, param3);
              }
            }
            if (var11.field_k) {
              var13 = this.field_C[3];
              if (0 != var11.field_o &&
                var13 != null) {
                var13.a(param0, this.field_z, this, param1, param4 - 12, param3);
              } else {
                var9 = this.field_C[2];
                if (var9 != null) {
                  var9.a(param0, this.field_z, this, param1, param4 ^ 12, param3);
                }
              }
            }
          }
          if (param0.f(1)) {
            var14 = this.field_C[5];
            if (var14 != null) {
              var14.a(param0, this.field_z, this, param1, 0, param3);
            }
          }
          if (!param2) {
            var15 = this.field_C[4];
            if (var15 != null) {
              var15.a(param0, this.field_z, this, param1, 0, param3);
            }
          }
          this.field_z.a(param1, true, param0, param3, this);
          ln.f((byte) 124);
          if (param4 != 12) {
            var10 = (bi) null;
            this.a(100, (bi) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("gn.E(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_x = "Click to accept the Non-Agression Pact <%0> is offering.";
        field_B = 0;
        field_v = "Try this now, or press <col=2F5FBF>'ENTER'</col> to continue.";
        field_A = "Hide game chat";
        field_t = 0;
    }
}
