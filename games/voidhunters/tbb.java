/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tbb implements ntb {
    private int[] field_d;
    private int[] field_f;
    private int field_c;
    private int[] field_b;
    private int field_a;
    private int field_g;
    private int[] field_e;

    public final void b(byte param0, tv param1) {
        tbb var3 = null;
        try {
          var3 = (tbb) (param1);
          var3.field_b = dob.a(var3.field_b, (byte) -124, this.field_b);
          var3.field_f = dob.a(var3.field_f, (byte) -105, this.field_f);
          var3.field_e = dob.a(var3.field_e, (byte) -29, this.field_e);
          var3.field_d = dob.a(var3.field_d, (byte) -103, this.field_d);
          if (param0 <= 54) {
            this.field_b = (int[]) null;
          }
          var3.field_a = this.field_a;
          var3.field_g = this.field_g;
          var3.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tbb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            this.field_g = -81;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tbb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        tv var3 = null;
        tv var3Lifetime1;
        this.field_a = this.field_a - 8;
        this.field_g = this.field_g + 1;
        if (this.field_a < 0) {
          this.field_a = 0;
        }
        if (this.field_g > 4) {
          this.field_c = (1 + this.field_c) % 64;
          this.field_d[this.field_c] = 0;
          this.field_g = 0;
          if (param0 >= -123) {
            var3 = (tv) null;
            this.b((byte) -29, (tv) null);
            return;
          }
          return;
        }
        if (param0 >= -123) {
          var3Lifetime1 = (tv) null;
          this.b((byte) -29, (tv) null);
          return;
        }
    }

    final void a(byte param0, int param1) {
        tv var4 = null;
        tv var4Lifetime1;
        this.field_a = this.field_a + param1;
        if (this.field_a > 255) {
          this.field_a = 255;
          if (param0 <= 93) {
            var4 = (tv) null;
            this.a((tv) null, 104);
            return;
          }
          return;
        }
        if (param0 <= 93) {
          var4Lifetime1 = (tv) null;
          this.a((tv) null, 104);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var8Lifetime1;
        if (param2 < -104) {
          var8 = this.field_c << 1;
          this.field_b[var8] = param4;
          this.field_b[1 + var8] = param6;
          this.field_f[var8] = param1;
          this.field_f[1 + var8] = param0;
          this.field_e[var8] = param3;
          this.field_e[var8 + 1] = param5;
          this.field_d[this.field_c] = this.field_a;
          return;
        }
        this.field_b = (int[]) null;
        var8Lifetime1 = this.field_c << 1;
        this.field_b[var8Lifetime1] = param4;
        this.field_b[1 + var8Lifetime1] = param6;
        this.field_f[var8Lifetime1] = param1;
        this.field_f[1 + var8Lifetime1] = param0;
        this.field_e[var8Lifetime1] = param3;
        this.field_e[var8Lifetime1 + 1] = param5;
        this.field_d[this.field_c] = this.field_a;
    }

    final void a(lta param0, int param1, int param2) {
        try {
          if (param1 != 1325107016) {
            this.field_f = (int[]) null;
          }
          fsb.a(param0, this.field_f, 6407, this.field_g, this.field_b, this.field_e, this.field_c, this.field_d, param2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tbb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static pgb a(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_26_0 = null;
        Throwable decompiledCaughtException = null;
        faa var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        faa var8 = null;
        pi var9 = null;
        var7 = VoidHunters.field_G;
        var8 = qga.field_b;
        var2 = var8;
        if (param0 < 4) {
          return (pgb) null;
        }
        var3 = var8.e((byte) -121);
        wja.field_a = 127 & var3;
        stackIn_5_0 = ((128 & var3) != 0);
        dab.field_e = stackIn_5_0;
        bl.field_A = var8.e((byte) -106);
        sga.field_q = var8.k(255);
        if (wja.field_a == 2) {
          sj.field_o = var8.e(1869);
          jkb.field_b = var8.c((byte) -38);
        } else {
          sj.field_o = 0;
          jkb.field_b = 0;
        }
        stackIn_11_0 = (var8.e((byte) -106) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        ti.field_h = var8.a(-1);
        if (var4 != 0) {
          uja.field_a = var8.a(-1);
        } else {
          uja.field_a = ti.field_h;
        }
        if (wja.field_a == 1) {
          psb.field_a = var8.e(1869);
          pva.field_f = var8.a(-1);
        } else {
          if (wja.field_a != 4) {
            psb.field_a = 0;
            pva.field_f = null;
          } else {
            psb.field_a = var8.e(1869);
            pva.field_f = var8.a(-1);
          }
        }
        if (!param1) {
          jh.field_p = sib.a(80, var8, (byte) 112);
          un.field_h = null;
          return new pgb(param1);
        }
        var5 = var8.e(1869);
        try {
          var9 = usa.field_o.a(var5, -119);
          jh.field_p = var9.a(80);
          if (uja.field_a.equals(kca.field_a)) {
            stackIn_26_0 = null;
          } else {
            stackIn_26_0 = var9.field_n;
          }
          un.field_h = stackIn_26_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          gna.a((Throwable) ((Object) var6), "CC1", 0);
          un.field_h = null;
          jh.field_p = null;
          return new pgb(param1);
        }
        return new pgb(param1);
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.field_e = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tbb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; this.field_b.length > var2; var2++) {
          this.field_b[var2] = 0;
          this.field_f[var2] = 0;
          this.field_f[var2] = 0;
        }
        for (var2Lifetime1 = 0; this.field_d.length > var2Lifetime1; var2Lifetime1++) {
          this.field_d[var2Lifetime1] = 0;
        }
        var2Lifetime2 = 104 / ((37 - param0) / 55);
        this.field_c = 0;
        this.field_a = 0;
        this.field_g = 0;
    }

    final static void a(no param0, int param1, toa param2, String param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (param4 != 18126) {
            tbb.a(-98, false);
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param3.length() > var7; var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) - (-param2.field_c[0] - param0.b(param3.substring(0, var7)));
            }
            if (-1 != var6) {
              param2.field_c[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param1;
              }
              param2.field_c[var7] = param2.field_c[0] + ((var5_int >> 8) + (param0.b(param3.substring(0, 1 + var7)) - param0.a((char) var8)));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("tbb.K(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 74 / ((22 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("tbb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        try {
          if (param1 > -19) {
            this.a(-95, 21, (byte) 84, 30, -19, 64, 55);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tbb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    tbb() {
        this.field_d = new int[64];
        this.field_c = 0;
        this.field_f = new int[128];
        this.field_b = new int[128];
        this.field_a = 0;
        this.field_g = 0;
        this.field_e = new int[128];
    }

    static {
    }
}
