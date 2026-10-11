/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends kf {
    private int field_F;
    private ma field_E;
    static String field_G;

    public static void j(int param0) {
        field_G = null;
        if (param0 != 6977) {
          field_G = (String) null;
        }
    }

    final boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 44) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ld.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final String b(int param0) {
        if (param0 <= 121) {
          ld.i(55);
          if (this.field_m) {
            return this.field_E.a((byte) 102);
          }
          return null;
        }
        if (this.field_m) {
          return this.field_E.a((byte) 102);
        }
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          if (param0 < 70) {
            var4 = (String) null;
            ld.a((Throwable) null, (String) null);
          }
          o.a(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ld.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        if (param0 != -29115) {
          return;
        }
        ni.a(-125, 4);
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
          this.field_F = this.field_F + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ld.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    ld(ma param0) {
        try {
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        db var15 = null;
        db var16 = null;
        db var14 = null;
        db var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = Lexicominos.field_L ? 1 : 0;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        int var5 = (this.field_j >> 1) + this.field_t + param2;
        int var6 = this.field_o + (param1 + (this.field_v >> 1));
        sc var8 = this.field_E.b((byte) 116);
        if (jj.field_e == var8) {
          var15 = be.field_b[0];
          var9 = var15.field_r << 1;
          var10 = var15.field_x << 1;
          if (dd.field_f == null) {
            dd.field_f = new db(var9, var10);
            de.a(dd.field_f, param0 ^ -117);
            var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
            return;
          }
          if (var9 > dd.field_f.field_p) {
            dd.field_f = new db(var9, var10);
            de.a(dd.field_f, param0 ^ -117);
            var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
            return;
          }
          if (dd.field_f.field_u >= var10) {
            de.a(dd.field_f, 6);
            lf.a();
            var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
            return;
          }
          dd.field_f = new db(var9, var10);
          de.a(dd.field_f, param0 ^ -117);
          var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
          pd.a(-22949);
          dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
          return;
        }
        if (be.field_q == var8) {
          var16 = be.field_b[0];
          var9Lifetime1 = var16.field_r << 1;
          var10Lifetime1 = var16.field_x << 1;
          if (dd.field_f == null) {
            dd.field_f = new db(var9Lifetime1, var10Lifetime1);
            de.a(dd.field_f, param0 ^ -117);
            var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
            return;
          }
          if (var9Lifetime1 > dd.field_f.field_p) {
            dd.field_f = new db(var9Lifetime1, var10Lifetime1);
            de.a(dd.field_f, param0 ^ -117);
            var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
            return;
          }
          if (dd.field_f.field_u >= var10Lifetime1) {
            de.a(dd.field_f, 6);
            lf.a();
            var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
            return;
          }
          dd.field_f = new db(var9Lifetime1, var10Lifetime1);
          de.a(dd.field_f, param0 ^ -117);
          var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
          pd.a(-22949);
          dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
          return;
        }
        if (ni.field_b == var8) {
          var14 = be.field_b[2];
          var14.d(var5 - (var14.field_p >> 1), var6 - (var14.field_u >> 1), 256);
          return;
        }
        if (rh.field_p == var8) {
          var13 = be.field_b[1];
          var13.d(-(var13.field_p >> 1) + var5, var6 - (var13.field_u >> 1), 256);
          return;
        }
    }

    final static de a(Throwable param0, String param1) {
        de var2 = null;
        if (!(param0 instanceof de)) {
          var2 = new de(param0, param1);
        } else {
          var2 = (de) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    static {
        field_G = "Player";
    }
}
