/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha extends wda {
    private int field_r;
    private boolean field_p;
    private boolean field_t;
    private int field_o;
    private int field_q;
    static String field_s;

    final int a(int param0, int param1) {
        if (param0 != 0) {
          return -79;
        }
        param1 = fs.a((byte) 54, param1, this.field_o);
        param1 = fs.a((byte) 100, param1, this.field_q);
        param1 = fs.a((byte) 107, param1, this.field_r);
        return param1;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var2 = this.d((byte) -112);
        var3 = this.a(false);
        if (!this.field_p &&
          !this.field_t) {
          var4 = (cr.a(true, this.field_q >> 2) >> 8) * (this.field_o >> 8) + var2;
          var5 = var3 + (pla.b(35, this.field_q >> 2) >> 8) * (this.field_o >> 8);
        } else {
          var4 = this.field_n.s(25745);
          var5 = this.field_n.e(false);
          this.field_p = false;
        }
        this.field_q = this.field_q - this.field_r;
        this.field_q = dfa.a(this.field_q, 32768, 78);
        var7 = 49 % ((param0 + 69) / 42);
        var6 = var2 + (cr.a(true, this.field_q >> 2) >> 8) * (this.field_o >> 8);
        var8 = var3 + (pla.b(102, this.field_q >> 2) >> 8) * (this.field_o >> 8);
        this.field_n.a((byte) -94, -var4 + var6, var8 - var5);
    }

    final static boolean a(int param0, kh param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5907) {
            stackIn_6_0 = (param1.b((byte) 44, 1) == 1);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("uha.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, fsa param1) {
        try {
          super.a(85, param1);
          this.field_p = true;
          if (param0 < 35) {
            this.field_r = -34;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uha.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
          this.a(116, 3);
        }
    }

    final void c(byte param0) {
        if (param0 > -116) {
          this.field_t = false;
        }
        super.c((byte) -120);
        this.field_q = -this.field_q;
        this.field_r = -this.field_r;
    }

    final static int e(byte param0) {
        if (param0 < 47) {
          field_s = (String) null;
        }
        return 256;
    }

    final void a(kh param0, byte param1) {
        jea var4 = null;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, (byte) -122);
          param0.a((byte) -44, this.field_o >> 16, 10);
          param0.a((byte) 90, dqa.a(true, this.field_r, 12), 12);
          param0.a((byte) -126, cn.a((byte) 74, this.field_q, 32768, 4), 4);
          stackIn_2_0 = (kh) (param0);
          stackIn_2_1 = -128;
          if (!this.field_t) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((kh) (Object) stackIn_2_0).a((byte) stackIn_2_1, stackIn_3_2, 1);
          if (param1 >= -78) {
            var4 = (jea) null;
            uha.a((jea) null, -46, (byte) 104, (jea) null, -72, 112, (byte[]) null, -67, (jea) null, 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("uha.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    uha(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_p = false;
        this.field_t = true;
        try {
          this.field_o = param1.b((byte) 44, 10) << 16;
          this.field_r = bla.a(true, 12, param1.b((byte) 44, 12));
          if (param0.field_E < 10) {
            this.field_q = oo.a(3, 32768, 0, param1.b((byte) 44, 3));
            this.field_t = true;
          } else {
            this.field_q = oo.a(4, 32768, 0, param1.b((byte) 44, 4));
            stackIn_5_1 = (1 == param1.b((byte) 44, 1));
            this.field_t = stackIn_5_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("uha.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(jea param0, int param1, byte param2, jea param3, int param4, int param5, byte[] param6, int param7, jea param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          um.field_m = param6;
          hpa.field_g = param5;
          rb.field_r = -1L;
          fk.field_b = param6.length;
          uu.field_a = null;
          ifa.field_n = null;
          qa.field_o = false;
          vk.field_b = new byte[(7 + hpa.field_g) / 8];
          if (param2 != -51) {
            return;
          }
          var10_int = 0;
          for (var11 = 0; var11 < um.field_m.length; var11++) {
            var10_int = var10_int + (um.field_m[var11] & 255);
          }
          var10_int = (var10_int + 7) / 8;
          tqa.field_e = new byte[var10_int];
          if (null == param8.field_J) {
            param8.field_J = new vna();
          }
          uma.field_b = param8.field_J;
          uma.field_b.d(param2 ^ -59);
          fua.field_a = new af(param4);
          rda.field_o = 0;
          so.field_K = 0;
          bha.field_z = -1;
          qb.field_f = -1;
          if (param3.field_J == null) {
            param3.field_J = new vna();
          }
          asa.field_j = param3.field_J;
          asa.field_j.d(8);
          jb.field_K = new af(param7);
          if (param0.field_J == null) {
            param0.field_J = new vna();
          }
          qha.field_g = param0.field_J;
          qha.field_g.d(8);
          tc.field_d = new af(param1);
          qsa.field_a = param9;
          uq.field_d = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_18_0 = var10;
          stackIn_18_1 = new StringBuilder().append("uha.N(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param9).append(')').toString());
        }
    }

    public static void e(int param0) {
        int var1 = -111 % ((-80 - param0) / 46);
        field_s = null;
    }

    final int c(int param0) {
        if (param0 != 1) {
          this.field_r = 5;
        }
        return 9;
    }

    static {
        field_s = "Bags";
    }
}
