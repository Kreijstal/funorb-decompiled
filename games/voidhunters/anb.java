/*
 * Decompiled by CFR-JS 0.4.0.
 */
class anb extends ara implements ntb, utb {
    private int field_m;
    private int field_i;
    int[] field_q;
    int field_s;
    int field_n;
    private int field_r;
    int field_l;
    int field_p;
    private int field_j;
    int field_o;
    ml field_k;
    int field_t;

    public void a(tv param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        anb var5 = null;
        try {
          super.a(param0, -85);
          var5 = (anb) (param0);
          if (this.field_k != null &&
            var5.field_k != null) {
            this.field_k.a(var5.field_k, -80);
          }
          var4 = 0;
          stackIn_7_0 = (var5.field_k != null) ? 0 : 1;
          if (null != this.field_k) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = 1;
          }
          if ((stackIn_7_0 ^ stackIn_10_1) != 0 ||
            this.field_k != null &&
            this.field_k.a((byte) -118, (tv) (var5.field_k))) {
            System.out.println("Component chassis has changed. before=" + var5.field_k + ", now=" + this.field_k);
            var4 = 1;
          }
          if (var5.field_r != this.field_r) {
            var4 = 1;
            System.out.println("int angle has changed. before=" + var5.field_r + ", now=" + this.field_r);
          }
          if (var5.field_n != this.field_n) {
            System.out.println("int angularvelocity has changed. before=" + var5.field_n + ", now=" + this.field_n);
            var4 = 1;
          }
          if (var5.field_i != this.field_i) {
            var4 = 1;
            System.out.println("int centreofmassx has changed. before=" + var5.field_i + ", now=" + this.field_i);
          }
          if (this.field_j != var5.field_j) {
            var4 = 1;
            System.out.println("int centreofmassy has changed. before=" + var5.field_j + ", now=" + this.field_j);
          }
          if (var5.field_s != this.field_s) {
            System.out.println("int mass has changed. before=" + var5.field_s + ", now=" + this.field_s);
            var4 = 1;
          }
          if (this.field_m != var5.field_m) {
            System.out.println("int momentofinertia has changed. before=" + var5.field_m + ", now=" + this.field_m);
            var4 = 1;
          }
          if (ikb.a(this.field_q, var5.field_q, false)) {
            var4 = 1;
            System.out.println("int[] boundingbox has changed. ");
          }
          if (param1 > -19) {
            return;
          }
          if (this.field_l != var5.field_l) {
            var4 = 1;
            System.out.println("int id has changed. before=" + var5.field_l + ", now=" + this.field_l);
          }
          if (var4 != 0) {
            System.out.println("This instance of Body has changed, where id=" + this.field_l);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("anb.F(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    final int j(int param0) {
        if (param0 != 995401160) {
          this.f(85);
        }
        int var2 = this.field_r >> 8;
        return (int)((long)this.field_i * (long)fc.a(var2, (byte) -62) - (long)this.field_j * (long)eu.a(var2, 124) >> 16);
    }

    final void a(boolean param0, boolean param1, pe param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          this.field_d = this.field_d + this.field_f;
          if (!param1) {
            this.e((byte) 36);
          }
          this.field_r = this.field_r + this.field_n;
          this.field_e = this.field_e + this.field_h;
          this.field_n = nu.field_q * this.field_n / gbb.field_o;
          this.field_h = this.field_h * ibb.field_a / fna.field_o;
          this.field_f = ibb.field_a * this.field_f / fna.field_o;
          if (param0) {
            param2.field_u.a(this.field_q, (byte) -105);
          }
          this.c(16);
          var4_int = this.field_d - this.j(995401160);
          var5 = this.field_e - this.i((byte) 5);
          this.field_k.a(this instanceof sg, var4_int, var5, this.field_r >> 8, 0, this.field_q);
          if (param0) {
            param2.field_u.a(1, this.d(82), this.field_l, this.field_q);
            this.d((byte) 124);
          } else {
            this.d((byte) 124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("anb.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int i(byte param0) {
        if (param0 != 5) {
          return -127;
        }
        int var2 = this.field_r >> 8;
        return (int)((long)this.field_i * (long)eu.a(var2, param0 + 105) + (long)this.field_j * (long)fc.a(var2, (byte) -68) >> 16);
    }

    public void a(faa param0, int param1) {
        try {
          super.a(param0, false);
          if (kv.a(false, param0)) {
            if (null == this.field_k) {
              this.field_k = new ml();
            }
            this.field_k.a(param0, 32);
          } else {
            this.field_k = null;
          }
          this.field_r = uwa.a(24, param0, (byte) 20);
          this.field_n = uwa.a(24, param0, (byte) 20);
          this.field_i = param0.i(0, 32);
          this.field_j = param0.i(param1 - 32, 32);
          this.field_s = param0.i(0, param1);
          this.field_m = param0.i(0, 32);
          this.field_q = wkb.a((byte) 37, this.field_q, param0, 8);
          this.field_l = param0.i(0, 16);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int[] param0, int[] param1, int[] param2, int param3, int[] param4, int param5, ml[] param6) {
        int var8_int = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (param3 != 3) {
            this.field_k = (ml) null;
          }
          for (var8_int = 0; param6.length > var8_int; var8_int++) {
            var9 = ar.a(param4[var8_int], (byte) 111, param1[var8_int]);
            stackIn_8_0 = (param2[var8_int] < 0) ? 0 : 1;
            if (param5 < 0) {
              stackIn_11_1 = 0;
            } else {
              stackIn_11_1 = 1;
            }
            var10 = stackIn_8_0 ^ stackIn_11_1;
            var11 = param2[var8_int];
            if (param2[var8_int] < 0 &&
              var10 != 0 ||
              0 < param2[var8_int] &&
              var10 == 0) {
              var11 = -var11;
            }
            param0[var8_int] = var11 / Math.max(var9, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("anb.CA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final int g(byte param0) {
        int var2 = 124 % ((param0 - 62) / 55);
        return this.field_e;
    }

    final int g(int param0) {
        if (param0 >= -36) {
          this.g(-59);
        }
        int var2 = Math.abs(-this.field_d + this.field_q[0]);
        int var3 = Math.abs(-this.field_d + this.field_q[1]);
        int var4 = Math.abs(this.field_q[2] - this.field_e);
        int var5 = Math.abs(this.field_q[3] - this.field_e);
        return Math.max(var2, Math.max(var3, Math.max(var4, var5)));
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        if (param0 != 24) {
          pe var4 = (pe) null;
          this.a((lta) null, -28, (pe) null, -49);
        }
        if (this.field_t != 0 ||
          this.field_o != 0) {
          this.field_f = this.field_f + this.field_t / param1;
          this.field_h = this.field_h + this.field_o / param1;
          this.d((byte) 91);
          this.field_t = 0;
          this.field_o = 0;
        }
        if (this.field_p != 0) {
          var3 = this.field_p / Math.max(this.field_m >> wf.field_e, 1);
          this.field_n = this.field_n + var3;
          this.d((byte) 40);
          this.field_p = 0;
        }
    }

    final void i(int param0) {
        this.c(16);
        int var2 = this.field_d - this.j(995401160);
        int var3 = this.field_e - this.i((byte) 5);
        this.field_k.a(this instanceof sg, var2, var3, this.field_r >> 8, param0, this.field_q);
    }

    final int e(int param0) {
        if (param0 != 0) {
          this.field_o = -108;
        }
        return this.field_r >> 8;
    }

    int d(int param0) {
        if (param0 <= 42) {
          this.field_p = -29;
        }
        return -1;
    }

    void e(byte param0) {
        int var2 = this.j(995401160);
        int var3 = this.i((byte) 5);
        this.field_k.a(0, true, 0, false, (byte) 88, 0, (int[]) null);
        if (param0 != 119) {
          this.field_k = (ml) null;
        }
        this.field_s = this.field_k.e((byte) -86);
        int[] var4 = new int[]{0, 0, 0};
        this.field_k.a((byte) 114, var4);
        int var5 = Math.max(1, var4[2] >> 4);
        this.field_j = var4[1] / var5;
        this.field_i = var4[0] / var5;
        this.field_m = this.field_k.a(-921054591, this.field_i, this.field_j);
        int var6 = this.j(995401160);
        int var7 = this.i((byte) 5);
        int var8 = var6 - var2;
        this.field_d = this.field_d + var8;
        int var9 = var7 - var3;
        this.field_e = this.field_e + var9;
        this.field_k.a(this.field_r >> 8, false, this.field_e - var7, this instanceof sg, (byte) 106, this.field_d - var6, (int[]) null);
        this.d((byte) 38);
    }

    final boolean h(int param0) {
        if (param0 >= -112) {
          return false;
        }
        return this.field_k.k((byte) 84);
    }

    public void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -111);
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = -94;
          stackIn_3_2 = (this.field_k != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.field_k.b(param0, -115);
          }
          param0.a(-632, this.field_r, 24);
          param0.a(-632, this.field_n, 24);
          param0.a(-632, this.field_l, 16);
          if (param1 > -109) {
            this.c(-33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("anb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = fc.a(param1, (byte) -69) * param3 >> 8;
        int var7 = param3 * eu.a(param1, 42) >> 8;
        this.a(var7, param2, param0, (byte) -118, var6);
        if (param4 != 1948934248) {
          this.field_l = 82;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -57 / ((param0 + 56) / 55);
        return this.field_k.a(param2, false, 0, param1, 21750, 0);
    }

    public void a(faa param0, boolean param1) {
        try {
          super.a(param0, false);
          if (kv.a(param1, param0)) {
            if (null == this.field_k) {
              this.field_k = new ml();
            }
            this.field_k.a(param0, false);
          } else {
            this.field_k = null;
          }
          this.field_r = uwa.a(24, param0, (byte) 20);
          this.field_n = uwa.a(24, param0, (byte) 20);
          this.field_l = param0.i(0, 16);
          this.h((byte) 63);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, pe param2) {
        try {
          this.field_k.a(param1, param2, this, (byte) -89);
          if (param0 >= -46) {
            this.field_t = 42;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.RA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(lta param0, int param1, pe param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (!rna.a(this.field_q, param0.field_f, 36)) {
            return;
          }
          this.field_k.a((byte) 125, param0, this instanceof sg, param2, param1);
          if (pqa.a(2, 11284)) {
            var5_int = this.j(995401160);
            var6 = this.i((byte) 5);
            var7 = param0.a(this.field_d, (byte) 125);
            var8 = param0.b(true, this.field_e);
            ena.a(var8, param0.field_a * 1024.0f, -81, var7, 16711680);
            var9 = param0.a(-var5_int + this.field_d, (byte) 122);
            var10 = param0.b(true, -var6 + this.field_e);
            kq.a(1024.0f * param0.field_a, (byte) 90, var10, 16777215, var9);
          }
          if (pqa.a(param3, param3 ^ 11268)) {
            var5_intLifetime1 = param0.a(this.field_q[0], (byte) 121);
            var6Lifetime1 = param0.a(this.field_q[1], (byte) 112);
            var7Lifetime1 = param0.b(true, this.field_q[2]);
            var8Lifetime1 = param0.b(true, this.field_q[3]);
            uv.a(param3 + 105, var5_intLifetime1, -var7Lifetime1 + var8Lifetime1, var7Lifetime1, 16711935, -var5_intLifetime1 + var6Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("anb.IB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        this.field_r = param0 << 8;
        if (param1 > -13) {
          this.field_i = -127;
        }
    }

    final int c(byte param0) {
        if (param0 > -111) {
          return 58;
        }
        return this.field_f;
    }

    final void a(int param0, pe param1) {
        try {
          int var3_int = -85 % ((26 - param0) / 35);
          this.field_k.a(0, param1, this);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(boolean param0) {
        if (!param0) {
          return -2;
        }
        return this.field_k.a(0, this.field_e, -125, this.field_d);
    }

    final int f(int param0) {
        if (param0 != 0) {
          this.field_l = -93;
        }
        return this.field_h;
    }

    final boolean k(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 995401160) {
          this.field_t = -99;
        }
        stackIn_8_0 = (this.field_f != 0) || (this.field_h != 0) || (this.field_n != 0);
        return stackIn_8_0;
    }

    public void a(faa param0, byte param1) {
        super.b(param0, -113);
        if (vq.a(param0, 54, this.field_k != null ? true : false)) {
          this.field_k.a(param0, (byte) -113);
        }
        param0.a(-632, this.field_r, 24);
        if (param1 > -91) {
          return;
        }
        try {
          param0.a(-632, this.field_n, 24);
          param0.a(-632, this.field_i, 32);
          param0.a(-632, this.field_j, 32);
          param0.a(-632, this.field_s, 32);
          param0.a(-632, this.field_m, 32);
          pgb.a(8, null != this.field_q ? this.field_q.length : 0, 84, param0, this.field_q);
          param0.a(-632, this.field_l, 16);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        if (this instanceof nbb) {
          this.field_k.c(0, this.field_k.i((byte) -112).field_b, param0 - 7, this.field_k.i((byte) -112).field_i);
        } else {
          this.field_k.c(0, 0, 56, 0);
        }
        int var2 = this.field_d;
        int var3 = this.field_e;
        this.e((byte) 119);
        this.field_d = var2;
        if (param0 != 63) {
          return;
        }
        this.field_e = var3;
        this.c(16);
        this.field_k.a(this instanceof sg, this.field_d - this.j(995401160), this.field_e - this.i((byte) 5), this.field_r >> 8, param0 - 63, this.field_q);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 5 / ((param2 + 11) / 38);
        this.field_d = param0;
        this.field_e = param1;
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_10_0 = false;
        if (param2 < 8) {
          this.c(101, -72, -14, 88, 79);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_q != null && (this.field_q[0] < param4 ||
          this.field_q[1] > param1 ||
          this.field_q[2] < param3 ||
          this.field_q[3] > param0)) {
          stackIn_10_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_10_0 = false;
        }
        return stackIn_10_0;
    }

    void d(byte param0) {
        int var2 = -43 % ((param0 + 4) / 38);
    }

    final int c(boolean param0) {
        if (param0) {
          pe var3 = (pe) null;
          this.a((pe) null, 115, false, 79, -113);
        }
        return this.field_l;
    }

    void a(int param0, int param1, pe param2, int param3, int param4) {
        pe var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 >= 0) {
            this.field_k.a(param1, param3, param2, (byte) -73, param4, this);
          }
          if (param0 > -36) {
            var7 = (pe) null;
            this.a(-66, -62, (pe) null, 87, -25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("anb.WA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(pe param0, int param1, boolean param2, int param3, int param4) {
        int var17 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ml[] var7_ref_ml__ = null;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        boolean[] var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        ml var27_ref = null;
        Object var28 = null;
        ml var28_ref = null;
        Object var29 = null;
        ml var29_ref = null;
        Object var30 = null;
        ml var30_ref = null;
        Object var31 = null;
        ml var31_ref = null;
        Object var32 = null;
        ml var32_ref = null;
        ml var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        ml var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var49 = null;
        int[] var50 = null;
        int var7Lifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var12_intLifetime3;
        int var16Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var25Lifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        int var8_intLifetime4;
        int var8_intLifetime5;
        int var8_intLifetime6;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var20Lifetime1Lifetime1;
        int var21Lifetime1Lifetime1;
        int var22Lifetime1Lifetime1;
        var27 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var26 = VoidHunters.field_G;
        try {
          if (gra.field_o == 1) {
            stackIn_7_0 = (this.field_k.i((byte) -112).field_s) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var6_int = stackIn_7_0;
          if (param2) {
            this.h((byte) -95);
          }
          if (var6_int != 0) {
            var27_ref = new ml(13);
            var27_ref.a((byte) -127, 1);
            var8_int = 4096;
            var9 = -(var8_int * fc.a(this.field_k.field_b, (byte) -76)) >> 16;
            var10 = -(eu.a(this.field_k.field_b, 40) * var8_int) >> 16;
            var27_ref.a(false, this.field_k.field_r + var9, this.field_k.field_n + var10, this.field_k.field_b, 0, (int[]) null);
            av.field_a[0] = var27_ref;
            var28_ref = new ml(13);
            var28_ref.a((byte) 114, 2);
            var8_intLifetime2 = 4096;
            var9Lifetime2 = fc.a(this.field_k.field_b, (byte) 100) * var8_intLifetime2 >> 16;
            var10Lifetime2 = var8_intLifetime2 * eu.a(this.field_k.field_b, 122) >> 16;
            var11 = this.field_k.field_b + 4096;
            var28_ref.a(false, this.field_k.field_r + var9Lifetime2, this.field_k.field_n + var10Lifetime2, var11, 0, (int[]) null);
            av.field_a[1] = var28_ref;
            var29_ref = new ml(13);
            var29_ref.a((byte) 113, 36);
            var8_intLifetime3 = 8192;
            var9Lifetime3 = rrb.a(22433, 256 + this.field_k.field_b);
            var10Lifetime3 = var8_intLifetime3 * fc.a(var9Lifetime3, (byte) -112) >> 16;
            var11Lifetime2 = var8_intLifetime3 * eu.a(var9Lifetime3, 85) >> 16;
            var12_int = rrb.a(22433, -2048 + this.field_k.field_b);
            var29_ref.a(false, var10Lifetime3 + this.field_k.field_r, var11Lifetime2 + this.field_k.field_n, var12_int, 0, (int[]) null);
            av.field_a[2] = var29_ref;
            var30_ref = new ml(13);
            var30_ref.a((byte) 120, 72);
            var8_intLifetime4 = 8192;
            var9Lifetime4 = rrb.a(22433, this.field_k.field_b - 256);
            var10Lifetime4 = var8_intLifetime4 * fc.a(var9Lifetime4, (byte) -102) >> 16;
            var11Lifetime3 = var8_intLifetime4 * eu.a(var9Lifetime4, 87) >> 16;
            var12_intLifetime1 = rrb.a(22433, 2048 + this.field_k.field_b);
            var30_ref.a(false, var10Lifetime4 + this.field_k.field_r, var11Lifetime3 + this.field_k.field_n, var12_intLifetime1, 0, (int[]) null);
            av.field_a[3] = var30_ref;
            var31_ref = new ml(13);
            var31_ref.a((byte) -23, 68);
            var8_intLifetime5 = 8192;
            var9Lifetime5 = rrb.a(22433, this.field_k.field_b - 3840);
            var10Lifetime5 = fc.a(var9Lifetime5, (byte) -91) * var8_intLifetime5 >> 16;
            var11Lifetime4 = var8_intLifetime5 * eu.a(var9Lifetime5, 122) >> 16;
            var12_intLifetime2 = rrb.a(22433, this.field_k.field_b + 2048);
            var31_ref.a(false, var10Lifetime5 + this.field_k.field_r, var11Lifetime4 + this.field_k.field_n, var12_intLifetime2, 0, (int[]) null);
            av.field_a[4] = var31_ref;
            var32_ref = new ml(13);
            var32_ref.a((byte) 12, 40);
            var8_intLifetime6 = 8192;
            var9Lifetime6 = rrb.a(22433, 4096 + this.field_k.field_b - 256);
            var10Lifetime6 = var8_intLifetime6 * fc.a(var9Lifetime6, (byte) 46) >> 16;
            var11Lifetime5 = var8_intLifetime6 * eu.a(var9Lifetime6, 85) >> 16;
            var12_intLifetime3 = rrb.a(22433, this.field_k.field_b - 2048);
            var32_ref.a(false, var10Lifetime6 + this.field_k.field_r, this.field_k.field_n + var11Lifetime5, var12_intLifetime3, 0, (int[]) null);
            av.field_a[5] = var32_ref;
          }
          boolean decompiledFrameRemainder0 = true;
          if (1 == wqa.field_b &&
            (99 & param1) != 0 &&
            (param1 & 111) == (99 & param1)) {
            var7_ref_ml__ = this.field_k.a(0, (ml[]) null, param1);
            if (var6_int != 0) {
              for (var8_intLifetime1 = 0; var8_intLifetime1 < av.field_a.length; var8_intLifetime1++) {
                var7_ref_ml__ = (ml[]) (ija.a(av.field_a[var8_intLifetime1], var7_ref_ml__, 0, ii.field_d));
              }
            }
            if (var7_ref_ml__ == null) {
              param1 = param1 & -112;
              if ((var6_int != 0)) {
                for (var7 = 0; var7 < av.field_a.length; var7++) {
                  av.field_a[var7].a(param4, 7834, this, param3, param1, param0);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var41 = new int[var7_ref_ml__.length];
              var34 = var41;
              var8 = var34;
              var9Lifetime1 = this.field_t;
              var10Lifetime1 = this.field_o;
              var11Lifetime1 = this.field_p;
              var43 = new int[var7_ref_ml__.length];
              var36 = var43;
              var12 = var36;
              var44 = new int[var7_ref_ml__.length];
              var37 = var44;
              var13 = var37;
              var42 = new int[var7_ref_ml__.length];
              var35 = var42;
              var14 = var35;
              var15 = 0;
              for (var16 = 0; var7_ref_ml__.length > var16; var16++) {
                var33 = var7_ref_ml__[var16];
                var18_int = var33.field_e;
                var19 = this.field_t;
                var20 = this.field_o;
                var21 = this.field_p;
                var22 = var33.field_a.a(var33.field_j, false);
                this.a(var33.field_n, var33.field_b, var33.field_r, var22, 1948934248);
                var12[var16] = this.field_t - var19;
                var13[var16] = -var20 + this.field_o;
                var14[var16] = this.field_p - var21;
                if ((param1 & var18_int) != 0) {
                  var41[var16] = 256;
                  var15 = var15 + var42[var16];
                  var12[var16] = -var43[var16];
                  var13[var16] = -var44[var16];
                  var14[var16] = -var42[var16];
                }
              }
              this.field_o = var10Lifetime1;
              this.field_p = var11Lifetime1;
              this.field_t = var9Lifetime1;
              var16Lifetime1 = var15 / Math.max(this.field_m >> wf.field_e, 1);
              if (var15 != 0 &&
                Math.abs(var16Lifetime1) > us.field_f) {
                var49 = new int[var7_ref_ml__.length];
                var18 = new boolean[var7_ref_ml__.length];
                this.a(var49, var44, var42, 3, var43, var15, var7_ref_ml__);
                var50 = new int[var7_ref_ml__.length];
                for (var20Lifetime1 = 0; var50.length > var20Lifetime1; var20Lifetime1++) {
                  var21Lifetime1 = -2147483648;
                  var22Lifetime1 = -1;
                  for (var23 = 0; var23 < var49.length; var23++) {
                    if (!var18[var23] &&
                      var49[var23] > var21Lifetime1) {
                      var22Lifetime1 = var23;
                      var21Lifetime1 = var49[var23];
                    }
                  }
                  if (var22Lifetime1 != -1) {
                    var50[var20Lifetime1] = var22Lifetime1;
                    var18[var22Lifetime1] = true;
                  }
                }
                var20Lifetime1Lifetime1 = 0;
                while (var50.length > var20Lifetime1Lifetime1) {
                  var21Lifetime1Lifetime1 = var50[var20Lifetime1Lifetime1];
                  if (0 > var49[var21Lifetime1Lifetime1]) {
                    break;
                  }
                  var22Lifetime1Lifetime1 = var42[var21Lifetime1Lifetime1];
                  var23Lifetime1 = Math.abs(var15);
                  var24 = Math.abs(var22Lifetime1Lifetime1) >> 8;
                  var25 = var23Lifetime1 / Math.max(var24, 1);
                  if (var25 < 256) {
                    if (var41[var21Lifetime1Lifetime1] > 0) {
                      var8[var21Lifetime1Lifetime1] = -var25 + 256;
                      break;
                    }
                    var41[var21Lifetime1Lifetime1] = var25;
                    break;
                  }
                  if (var41[var21Lifetime1Lifetime1] > 0) {
                    var41[var21Lifetime1Lifetime1] = 0;
                  } else {
                    var41[var21Lifetime1Lifetime1] = 256;
                  }
                  var15 = var15 + var22Lifetime1Lifetime1;
                  var25Lifetime1 = 256;
                  var20Lifetime1Lifetime1++;
                }
              }
              for (var17 = 0; var17 < var7_ref_ml__.length; var17++) {
                var40 = var7_ref_ml__[var17];
                if (var41[var17] > 0) {
                  var40.a(this, param4, param0, param3, 55, var41[var17]);
                }
              }
              param1 = param1 & -112;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (var6_int != 0)) {
            for (var7Lifetime1 = 0; var7Lifetime1 < av.field_a.length; var7Lifetime1++) {
              av.field_a[var7Lifetime1].a(param4, 7834, this, param3, param1, param0);
            }
          }
          this.field_k.a(param4, 7834, this, param3, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("anb.FB(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int e(boolean param0) {
        if (param0) {
          this.field_r = 99;
        }
        return this.field_s;
    }

    void a(pe param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        pe var6 = null;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            stackIn_18_0 = 1;
          } else {
            if (0 == this.field_f) {
              if (this.field_h == 0) {
                if (0 == this.field_n) {
                  if (this.field_q[0] == 0) {
                    if (this.field_q[1] == 0) {
                      if (this.field_q[2] == 0) {
                        stackIn_18_0 = (0 == this.field_q[3]) ? 1 : 0;
                      } else {
                        stackIn_18_0 = 0;
                      }
                    } else {
                      stackIn_18_0 = 0;
                    }
                  } else {
                    stackIn_18_0 = 0;
                  }
                } else {
                  stackIn_18_0 = 1;
                }
              } else {
                stackIn_18_0 = 1;
              }
            } else {
              stackIn_18_0 = 1;
            }
          }
          var5_int = stackIn_18_0;
          if (var5_int != 0) {
            this.a(param3, true, param0);
          }
          if (this instanceof sg) {
            this.field_k.a(true, (byte) -124, param0, this);
          }
          if (param2 != 67) {
            var6 = (pe) null;
            this.a(93, false, (pe) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("anb.SA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(boolean param0) {
        if (param0) {
          this.e((byte) 22);
        }
        return this.field_d;
    }

    final void a(tpb param0, tj param1, byte param2) {
        try {
          this.field_k.a(param1, param0, 0);
          if (param2 < 24) {
            this.field_r = 116;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.U(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        if (null == this.field_q) {
          return false;
        }
        if (param1 != 2147483647) {
          this.f((byte) 36);
        }
        var6 = 0;
        if (this.field_q[0] < param3) {
          var6 = 1;
          if (0 > this.field_f) {
            this.field_f = -this.field_f;
          }
          this.field_d = this.field_d + (-this.field_q[0] + param3);
        }
        if (param4 < this.field_q[1]) {
          if (this.field_f > 0) {
            this.field_f = -this.field_f;
          }
          var6 = 1;
          this.field_d = this.field_d + (param4 - this.field_q[1]);
        }
        if (this.field_q[2] < param0) {
          if (this.field_h < 0) {
            this.field_h = -this.field_h;
          }
          var6 = 1;
          this.field_e = this.field_e + (-this.field_q[2] + param0);
        }
        if (this.field_q[3] > param2) {
          this.field_e = this.field_e + (param2 - this.field_q[3]);
          if (this.field_h > 0) {
            this.field_h = -this.field_h;
          }
          var6 = 1;
        }
        return var6 != 0;
    }

    final int[] f(byte param0) {
        if (param0 >= -21) {
          return (int[]) null;
        }
        return this.field_q;
    }

    public boolean a(byte param0, tv param1) {
        anb var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -16 / ((param0 - 22) / 59);
          var3 = (anb) (param1);
          if (!super.a((byte) 104, param1)) {
            stackIn_4_0 = (null != this.field_k) ? 0 : 1;
            if (var3.field_k != null) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (this.field_k == null ||
              !this.field_k.a((byte) 126, (tv) (var3.field_k))) && (var3.field_r == this.field_r &&
              var3.field_n == this.field_n &&
              this.field_l == var3.field_l)) {
              stackIn_17_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_17_0 = true;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("anb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6;
        int var7;
        long var8;
        long var10;
        long var12;
        int var14;
        this.field_t = this.field_t + param4;
        this.field_o = this.field_o + param0;
        var6 = -this.field_d + param1;
        var7 = -this.field_e + param2;
        if (param3 > -112) {
          this.field_s = 65;
        }
        var8 = (long)(-var7 >> ge.field_c);
        var10 = (long)(var6 >> ge.field_c);
        var12 = var8 * (long)param4 + (long)param0 * var10;
        var14 = this.field_p;
        this.field_p = (int)((long)this.field_p + (var12 >> tua.field_a));
        if (var12 > 0L) {
          if (this.field_p < var14) {
            this.field_p = 2147483647;
          } else {
            if (var12 < 0L &&
              var14 < this.field_p) {
              this.field_p = -2147483648;
            }
          }
        } else {
          if (var12 < 0L &&
            var14 < this.field_p) {
            this.field_p = -2147483648;
          }
        }
        this.d((byte) 111);
        cqb.a(param1, param2, param2 - param0, -param4 + param1, (byte) -54);
    }

    final void a(sfa param0, tj param1, int param2) {
        try {
          this.field_k.a(param1, param0, -1);
          if (param2 != -4414) {
            pe var5 = (pe) null;
            this.a(97, false, (pe) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.JB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        return ": Mass=" + this.field_s + ", MOI=" + this.field_m + ",xpos=" + this.field_d + ",ypos=" + this.field_e + ", angle=" + this.field_r + ",avel=" + this.field_n;
    }

    public void b(byte param0, tv param1) {
        anb var4 = null;
        try {
          super.b((byte) 105, param1);
          var4 = (anb) (param1);
          if (null != this.field_k) {
            if (null == var4.field_k) {
              var4.field_k = new ml();
            }
            this.field_k.b((byte) 110, var4.field_k);
          } else {
            var4.field_k = null;
          }
          var4.field_n = this.field_n;
          var4.field_m = this.field_m;
          var4.field_r = this.field_r;
          var4.field_s = this.field_s;
          var4.field_i = this.field_i;
          var4.field_j = this.field_j;
          if (param0 < 54) {
            this.field_l = 79;
          }
          var4.field_q = dob.a(var4.field_q, (byte) -85, this.field_q);
          var4.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "anb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    anb() {
        this.field_q = new int[4];
    }

    private final void c(int param0) {
        this.field_q[3] = -2147483648;
        this.field_q[2] = 2147483647;
        this.field_q[1] = -2147483648;
        if (param0 != 16) {
          this.field_s = 17;
        }
        this.field_q[0] = 2147483647;
    }

    static {
    }
}
