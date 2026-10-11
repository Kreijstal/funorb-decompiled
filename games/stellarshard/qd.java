/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private boolean field_g;
    private int field_b;
    int field_f;
    static java.awt.Canvas field_j;
    int field_i;
    private int field_c;
    private int field_a;
    static boolean field_h;
    private int field_d;
    static String field_e;

    final void a(int param0, int param1, int param2) {
        if (this.field_i <= param0) {
          throw new IllegalArgumentException();
        }
        if (this.field_i <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_b = 0;
        this.field_c = 0;
        if (0 != gh.field_c) {
          this.field_g = true;
          this.field_d = gh.field_c;
          this.field_f = param1;
          this.field_a = bf.field_b;
          this.field_c = gh.field_c;
        }
        if (this.field_d != 0 &&
          fb.field_n != 0) {
          if (this.field_a <= 0) {
            this.field_a = rc.field_m;
          }
          this.field_a = this.field_a - 1;
        }
        if (0 == gh.field_c &&
          fb.field_n == 0) {
          this.field_d = 0;
        }
        if (~this.field_d == param2 && (this.field_g ||
          qc.field_a)) {
          if (param0 >= 0) {
            if (param0 != this.field_f) {
            }
            this.field_g = true;
            this.field_f = param0;
          } else {
            if (this.field_g) {
              this.field_f = -1;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              param0.getAppletContext().showDocument(lk.a(param0, var2, 114), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            if (param1 != -30) {
              var3 = (java.applet.Applet) null;
              qd.a((java.applet.Applet) null, (byte) 50);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("qd.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        int var1 = 114 / ((param0 + 85) / 39);
    }

    final static pb a(pf param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        java.applet.Applet var6 = null;
        pb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.b(param2, (byte) -118);
          if (param3 < 41) {
            var6 = (java.applet.Applet) null;
            qd.a((java.applet.Applet) null, (byte) -109);
          }
          var5 = param0.a(var4_int, param1, (byte) -11);
          stackIn_3_0 = vc.a(param0, var5, var4_int, -2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qd.A(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, boolean param3) {
        this.field_d = 0;
        this.field_g = param2 ? true : false;
        if (param3) {
          return;
        }
        if (!this.field_g) {
          this.field_f = param1;
        } else {
          this.field_f = param0;
        }
    }

    final void a(int param0) {
        this.field_c = 0;
        this.field_b = param0;
        if (this.field_d == 0 &&
          gi.field_f == 98) {
          if (this.field_f <= 0) {
            this.field_f = this.field_i;
          }
          this.field_f = this.field_f - 1;
          this.field_g = false;
        }
        if (this.field_d == 0) {
          this.field_b = gi.field_f;
        }
        if (this.field_d == 0 &&
          99 == gi.field_f) {
          this.field_f = this.field_f + 1;
          if (this.field_f >= this.field_i) {
            this.field_f = 0;
          }
          this.field_g = false;
        }
    }

    final boolean c(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= -9) {
          this.field_a = 75;
        }
        stackIn_8_0 = (0 != this.field_c) || (84 == this.field_b) || (this.field_b == 83);
        return stackIn_8_0;
    }

    final static pb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        pb[] var10;
        pb[] var11_ref_pb__;
        int var11;
        int var12;
        pb var13;
        int var15;
        String var16;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = stellarshard.field_B;
        var9 = param1 + param5 + param7;
        var10 = new pb[]{new pb(var9, var9), new pb(param8, var9), new pb(var9, var9), new pb(var9, param8), new pb(64, 64), new pb(var9, param8), new pb(var9, var9), new pb(param8, var9), new pb(var9, var9)};
        var11_ref_pb__ = var10;
        for (var12 = 0; var12 < var11_ref_pb__.length; var12++) {
          var13 = var11_ref_pb__[var12];
          for (var14 = 0; var13.field_z.length > var14; var14++) {
            var13.field_z[var14] = param4;
          }
        }
        var11 = 0;
        if (param6 != -1) {
          var16 = (String) null;
          qd.a((pf) null, (String) null, (String) null, (byte) 11);
        }
        while (var11 < param5) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_z[var12Lifetime1 + var9 * (-1 - var11 + var9)] = param2;
            var10[8].field_z[var12Lifetime1 + (-1 + (var9 - var11)) * var9] = param2;
            var10[2].field_z[var9 * var12Lifetime1 + var9 - (1 + var11)] = param2;
            var10[8].field_z[-1 + var9 + (-var11 + var12Lifetime1 * var9)] = param2;
          }
          var11++;
        }
        for (var11Lifetime1 = 0; param5 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_z[var12Lifetime2 + var11Lifetime1 * var9] = param0;
            var10[0].field_z[var9 * var12Lifetime2 + var11Lifetime1] = param0;
            if (-var11Lifetime1 + var9 > var12Lifetime2) {
              var10[2].field_z[var12Lifetime2 + var9 * var11Lifetime1] = param0;
              var10[6].field_z[var11Lifetime1 + var9 * var12Lifetime2] = param0;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param8; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param5 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_z[(-1 + (-var12Lifetime3 + var9)) * param8 + var11Lifetime2] = param2;
            var10[5].field_z[var11Lifetime2 * var9 + var9 - (1 + var12Lifetime3)] = param2;
            var10[1].field_z[param8 * var12Lifetime3 + var11Lifetime2] = param0;
            var10[3].field_z[var12Lifetime3 + var11Lifetime2 * var9] = param0;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param8 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param7; var12Lifetime4++) {
            var10[1].field_z[var11Lifetime3 + (var9 + (-var12Lifetime4 - 1)) * param8] = param3;
            var10[3].field_z[var11Lifetime3 * var9 + (-var12Lifetime4 - 1) + var9] = param3;
            var10[7].field_z[var12Lifetime4 * param8 + var11Lifetime3] = param3;
            var10[5].field_z[var12Lifetime4 + var9 * var11Lifetime3] = param3;
          }
        }
        return var10;
    }

    final void a(int param0, int param1) {
        this.field_b = 0;
        if (param1 != 84) {
          field_j = (java.awt.Canvas) null;
        }
        this.field_c = 0;
        if (this.field_d == 0) {
          this.field_b = gi.field_f;
        }
        if (0 == this.field_d &&
          96 == gi.field_f) {
          if (this.field_f <= 0) {
            this.field_f = this.field_i;
          }
          this.field_g = false;
          this.field_f = this.field_f - 1;
        }
        if (this.field_d == 0 &&
          gi.field_f == 97) {
          this.field_f = this.field_f + 1;
          if (this.field_i <= this.field_f) {
            this.field_f = 0;
          }
          this.field_g = false;
        }
        if (this.field_d == 0 && (gi.field_f == 98 ||
          gi.field_f == 99)) {
          this.field_g = false;
          if (0 > this.field_f) {
            this.field_f = param0;
          }
        }
    }

    qd(int param0) {
        this.field_f = 0;
        this.field_g = false;
        this.field_i = param0;
    }

    static {
        field_e = "Loading music";
    }
}
