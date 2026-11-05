/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends ue {
    int field_f;
    private int field_l;
    private int[] field_t;
    static ko field_h;
    static String field_p;
    private int field_q;
    static String field_j;
    private int[] field_e;
    private int field_u;
    static String field_k;
    private int field_g;
    private int field_m;
    private int field_r;
    static int[] field_o;
    static String field_n;
    private int field_i;
    private int[] field_s;

    final void f(int param0) {
        int var2_int = 0;
        ik dupTemp$0 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          if (param0 > -87) {
            return;
          }
          if (this.field_i < 195) {
            for (var2_int = 0; var2_int < 12; var2_int++) {
              if (this.field_i >= 60 + var2_int * 10 &&
                75 + 10 * var2_int > this.field_i) {
                dupTemp$0 = this.field_d[var2_int];
                dupTemp$0.field_a = dupTemp$0.field_a - 18;
              }
            }
            this.field_i = this.field_i + 1;
          }
          this.field_m = (this.field_m + 1) % vp.field_i[0].length;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "re.M(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_16_0 = 0;
        ik stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        dl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var8 = CrazyCrystals.field_B;
        try {
          var3 = ee.field_m;
          var4 = 106 - ee.field_m.field_o;
          var3.a(20, var4 + this.field_q);
          var5 = 56 + this.field_q;
          if (0 != ul.field_g &&
            o.field_h.equals("top")) {
            var5 = -8 + this.field_q;
          }
          vp.field_i[0][this.field_m].b(-46 + (kf.field_c + 20), var5, 42, 63);
          vp.field_i[0][this.field_m].b(me.field_b + 20 + 4, var5, 42, 63);
          if (param1) {
            re.d((byte) 114);
          }
          for (var6 = 0; var6 < this.field_d.length; var6++) {
            if (~param0 != ~var6) {
              stackIn_16_0 = (var6 == this.field_b.field_c) ? 16777215 : 12640511;
              var7 = stackIn_16_0;
            } else {
              var7 = 16760896;
            }
            stackIn_20_0 = this.field_d[var6];
            stackIn_21_1 = (var6 == this.field_b.field_c);
            ((ik) (Object) stackIn_20_0).a(stackIn_21_1, var7, 1);
          }
          stackIn_26_0 = (5 != this.field_b.field_c) ? 12640511 : 16777215;
          var6Lifetime1 = stackIn_26_0;
          this.a(this.field_d[5], var6Lifetime1, gi.field_m, true);
          stackIn_30_0 = (this.field_b.field_c == 6) ? 16777215 : 12640511;
          var6Lifetime2 = stackIn_30_0;
          this.a(this.field_d[6], var6Lifetime2, qd.field_r, true);
          stackIn_34_0 = (this.field_b.field_c == 7) ? 16777215 : 12640511;
          var6Lifetime3 = stackIn_34_0;
          if (rb.field_h >= 2 &&
            a.field_b == this) {
            if (!sg.field_a) {
              return;
            }
            an.field_q.b(ll.field_a, 635, 476, 16711680, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3_ref), "re.C(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        var4 = CrazyCrystals.field_B;
        try {
          var2_int = this.field_b.field_c;
          if (var2_int >= 0 &&
            var2_int <= 4 &&
            this.field_b.a(true)) {
            var3 = jl.field_c[var2_int];
            a.field_b = (ue) ((Object) new da(this, var2_int, this.field_d[var2_int].field_d, var3));
            return true;
          }
          if (var2_int == 5 &&
            this.field_b.d(96) &&
            gi.field_m > 0) {
            gi.field_m = gi.field_m - 8;
            if (gi.field_m < 0) {
              gi.field_m = 0;
            }
            tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
          }
          if (var2_int == 5 &&
            this.field_b.b(108) &&
            64 > gi.field_m) {
            gi.field_m = gi.field_m + 8;
            if (64 < gi.field_m) {
              gi.field_m = 64;
            }
            tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
          }
          if (var2_int == 5 &&
            this.field_b.b(true) &&
            gi.field_m > 0) {
            gi.field_m = 0;
          }
          if (var2_int == 5 &&
            this.field_b.e(-19741) &&
            64 > gi.field_m) {
            gi.field_m = 64;
            tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
          }
          if (param0 < 99) {
            this.field_f = -116;
          }
          if ((var2_int == 5 ||
            var2_int == 6) &&
            this.field_b.g(-1)) {
            var3Lifetime1 = qh.field_i - 6 + (-this.field_d[var2_int].field_a + (-9 - this.field_r));
            if (var3Lifetime1 >= 0) {
              if (64 < var3Lifetime1) {
                var3Lifetime1 = 64;
              }
            } else {
              var3Lifetime1 = 0;
            }
            if (var2_int == 5 && (var3Lifetime1 != gi.field_m ||
              this.field_b.a(true))) {
              gi.field_m = var3Lifetime1;
              tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
            }
            if (var2_int == 6 &&
              var3Lifetime1 != qd.field_r) {
              ia.a(-658435066, var3Lifetime1);
            }
          } else {
            if (5 == var2_int &&
              this.field_b.a(true)) {
              tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
            }
          }
          if (var2_int == 6 &&
            this.field_b.d(96) &&
            0 < qd.field_r) {
            ia.a(-658435066, -8 + qd.field_r);
          }
          if (var2_int == 6 &&
            this.field_b.b(77) &&
            qd.field_r < 64) {
            ia.a(-658435066, 8 + qd.field_r);
          }
          if (var2_int == 6 &&
            this.field_b.b(true) &&
            qd.field_r > 0) {
            ia.a(-658435066, 0);
          }
          if (var2_int == 6 &&
            this.field_b.e(-19741) &&
            qd.field_r < 64) {
            ia.a(-658435066, 64);
          }
          if (var2_int == 7 &&
            this.field_b.a(true)) {
            qc.a(this.field_b.field_i, 0);
            this.field_b.a(-1, true, -1);
            return true;
          }
          if (var2_int == 8 &&
            this.field_b.a(true)) {
            a.field_b = (ue) ((Object) new m(this, 8, cp.field_h, 0, 70, false));
            return true;
          }
          if (var2_int == 9 &&
            this.field_b.a(true)) {
            a.field_b = (ue) ((Object) new m(this, 9, fq.field_G, 1, 25, false));
            return true;
          }
          if (10 == var2_int &&
            this.field_b.a(true)) {
            a.field_b = (ue) ((Object) new vn((m) null, this, false));
            return true;
          }
          if (var2_int == 11) {
            if (!this.field_b.a(true)) {
              return false;
            }
            q.a(false);
            ta.a(le.b((byte) -20), 19);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "re.A(" + param0 + ')');
        }
    }

    final void b(int param0) {
        try {
          if (param0 != 8) {
            re.d((byte) 102);
          }
          this.e(79);
          this.a(-1, false);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "re.B(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        ik dupTemp$0 = null;
        int var3_int = 0;
        ik dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        try {
          if (param0 >= 0 &&
            this.field_t[param0] < 20) {
            this.field_t[param0] = this.field_t[param0] + 1;
            dupTemp$0 = this.field_d[param0];
            dupTemp$0.field_a = dupTemp$0.field_a - 14;
          }
          for (var3_int = 0; var3_int < 12; var3_int++) {
            if (~param0 != ~var3_int &&
              this.field_t[var3_int] > 0) {
              this.field_t[var3_int] = this.field_t[var3_int] - 1;
              dupTemp$1 = this.field_d[var3_int];
              dupTemp$1.field_a = dupTemp$1.field_a + 14;
            }
            this.field_d[var3_int].field_d = this.field_t[var3_int] * (-this.field_s[var3_int] + this.field_e[var3_int]) * this.field_t[var3_int] / 400 + this.field_s[var3_int];
          }
          if (param1 != -18) {
            field_k = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3), "re.P(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.a((byte) 20, -1);
          this.c(param2, param1, 180);
          this.field_q = this.field_q - 10;
          this.field_g = 0;
          if (this.field_q < -200) {
            this.field_q = -200;
          }
          if (param0 > -113) {
            this.a(51, (byte) 114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var4), "re.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        int var3_int = 0;
        ik dupTemp$0 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (this.field_l < 20) {
            this.field_l = this.field_l + 1;
            for (var3_int = 0; 12 > var3_int; var3_int++) {
              dupTemp$0 = this.field_d[var3_int];
              dupTemp$0.field_a = dupTemp$0.field_a + 14;
            }
          }
          this.a(param1, (byte) -18);
          if (param0 != 20) {
            this.a(-34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3), "re.F(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param1 > this.field_f) {
          this.field_f = this.field_f + param0;
          if (param1 < this.field_f) {
            this.field_f = param1;
          }
        }
        if (param2 != 180) {
          return;
        }
        try {
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "re.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_g < 13) {
            this.field_g = this.field_g + 1;
          }
          this.field_q = this.field_q + this.field_g;
          if (param0 < 46) {
            this.b(-112);
          }
          if (this.field_q >= 0) {
            this.field_q = 0;
            this.field_g = -this.field_g;
            this.field_g = this.field_g - (this.field_g >> 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "re.J(" + param0 + ')');
        }
    }

    private final void a(ik param0, int param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            this.e(-68);
          }
          ak.a((byte) 61, 9 + (param0.field_a + this.field_r), param0.field_d, param2, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("re.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          try {
            if (!un.field_u.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; var3 < param1.length(); var3++) {
              if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                return false;
              }
            }
            if (param0) {
              re.d((byte) -80);
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2_ref2;
          stackIn_27_1 = new StringBuilder().append("re.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        try {
          field_k = null;
          field_p = null;
          field_h = null;
          field_o = null;
          field_j = null;
          field_n = null;
          int var1_int = 10 / ((param0 + 7) / 62);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "re.O(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        int var2_int = 0;
        ik dupTemp$4 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          if (param0 != 14) {
            field_n = (String) null;
          }
          if (this.field_l > 0) {
            this.field_l = this.field_l - 1;
            for (var2_int = 0; 12 > var2_int; var2_int++) {
              dupTemp$4 = this.field_d[var2_int];
              dupTemp$4.field_a = dupTemp$4.field_a - 14;
            }
          }
          this.a(-1, (byte) -18);
          this.c(-1);
          this.c((byte) 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "re.N(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          this.f(-114);
          this.d(14);
          if (rb.field_h >= 2 &&
            cp.field_k[12]) {
            for (var2_int = 0; var2_int < 5; var2_int++) {
              ke.field_b[var2_int] = jl.field_c[var2_int];
            }
            ll.field_a = "All levels considered reached - free player restrictions may apply";
          }
          super.a(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "re.D(" + param0 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 < this.field_f) {
            ge.field_d.e(0, 0, -((this.field_f << 7) / 20) + 256);
          } else {
            ge.field_d.c(0, 0);
          }
          if (param0 < 11) {
            this.field_m = 118;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "re.G(" + param0 + ')');
        }
    }

    re() {
        super(12);
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        mh dupTemp$15 = null;
        mh dupTemp$16 = null;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var1_intLifetime1;
        int var1_intLifetime2;
        this.field_f = 0;
        this.field_q = -126;
        this.field_e = new int[12];
        this.field_t = new int[12];
        this.field_l = 0;
        this.field_g = 0;
        this.field_i = 0;
        this.field_s = new int[12];
        try {
          this.field_d = new ik[12];
          var1_int = 0;
          var2 = 95;
          incrementValue$10 = var1_int;
          var1_int++;
          this.field_d[incrementValue$10] = (ik) ((Object) new mh(690, var2, 180, ai.field_n, 2));
          var2 += 26;
          var2 += 10;
          incrementValue$11 = var1_int;
          var1_int++;
          this.field_d[incrementValue$11] = (ik) ((Object) new mh(690, var2, 180, rh.field_d, 2));
          var2 += 26;
          incrementValue$12 = var1_int;
          var1_int++;
          this.field_d[incrementValue$12] = (ik) ((Object) new mh(690, var2, 180, li.field_e, 2));
          var2 += 26;
          incrementValue$13 = var1_int;
          var1_int++;
          this.field_d[incrementValue$13] = (ik) ((Object) new mh(690, var2, 180, l.field_c, 2));
          var2 += 26;
          incrementValue$14 = var1_int;
          var1_int++;
          this.field_d[incrementValue$14] = (ik) ((Object) new mh(690, var2, 180, b.field_d, 2));
          var2 += 26;
          var2 += 10;
          var3 = go.field_l.a(fa.field_m);
          var4 = go.field_l.a(cc.field_b);
          var5 = var3;
          if (var4 > var5) {
            var5 = var4;
          }
          this.field_r = (-79 + (var5 + 180)) / 2;
          this.field_d[var1_int] = (ik) ((Object) new mh(690, var2, 180, fa.field_m, 0));
          var2 += 26;
          dupTemp$15 = (mh) (this.field_d[var1_int]);
          dupTemp$15.field_k = dupTemp$15.field_k + (-var3 + this.field_r);
          var1_int++;
          this.field_d[var1_int] = (ik) ((Object) new mh(690, var2, 180, cc.field_b, 0));
          var2 += 26;
          dupTemp$16 = (mh) (this.field_d[var1_int]);
          dupTemp$16.field_k = dupTemp$16.field_k + (-var4 + this.field_r);
          var1_int++;
          this.field_d[var1_int] = (ik) ((Object) new mh(690, var2, 180, vl.field_e, 2));
          var2 += 26;
          var1_int++;
          var2 += 10;
          incrementValue$17 = var1_int;
          var1_int++;
          this.field_d[incrementValue$17] = (ik) ((Object) new mh(690, var2, 180, cp.field_h, 2));
          var2 += 26;
          incrementValue$18 = var1_int;
          var1_int++;
          this.field_d[incrementValue$18] = (ik) ((Object) new mh(690, var2, 180, fq.field_G, 2));
          var2 += 26;
          var2 += 10;
          incrementValue$19 = var1_int;
          var1_int++;
          this.field_d[incrementValue$19] = (ik) ((Object) new mh(690, var2, 180, nk.field_n, 2));
          var2 += 26;
          var2 += 10;
          incrementValue$20 = var1_int;
          var1_int++;
          this.field_d[incrementValue$20] = (ik) ((Object) new mh(690, var2, 180, dc.field_C, 2));
          var2 += 26;
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 12; var1_intLifetime1++) {
            this.field_s[var1_intLifetime1] = this.field_d[var1_intLifetime1].field_d;
          }
          for (var1_intLifetime2 = 0; 5 > var1_intLifetime2; var1_intLifetime2++) {
            this.field_e[var1_intLifetime2] = 10;
          }
          var16 = this.field_e;
          var15 = this.field_e;
          this.field_e[10] = 78;
          var15[9] = 78;
          var16[8] = 78;
          um.a(128, "menu", (byte) 77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "re.<init>()");
        }
    }

    final void c(int param0) {
        String var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_f > 0) {
            this.field_f = this.field_f - this.field_u;
            if (this.field_f < 0) {
              this.field_f = 0;
            }
          }
          if (param0 != -1) {
            var3 = (String) null;
            re.a(true, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "re.I(" + param0 + ')');
        }
    }

    static {
        field_o = new int[128];
        field_k = "Error connecting to server. Please try using a different server.";
        field_n = "Waiting for graphics";
        field_p = "Last Crystal";
    }
}
