/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends hs {
    static String field_m;
    private hd[] field_k;
    private hd field_t;
    static boolean field_j;
    static int field_n;
    static int field_u;
    private hd field_s;
    static int field_q;
    private hd field_o;
    static wc field_p;
    private jw field_l;
    static int[] field_r;

    final void e(int param0) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        String stackIn_22_0 = null;
        jw stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        int var2;
        int var3;
        int var4;
        String var4_ref_String;
        String var5_ref_String;
        hd var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var4Lifetime1;
        var10 = Kickabout.field_G;
        this.c(108);
        this.a(false, gb.field_H);
        this.b(-2351, this.field_a.field_v);
        if (~this.field_g != param0) {
          stackIn_6_0 = (this.field_a.field_n.a(8658, this.field_g)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        if (!this.a((byte) 13)) {
          stackIn_9_0 = -1;
        } else {
          stackIn_9_0 = this.field_g;
        }
        var3 = stackIn_9_0;
        for (var4 = 0; var4 < 3; var4++) {
          if (var4 == 1) {
            var5_ref_String = wh.field_e;
          } else {
            if (var4 == 0) {
              var5_ref_String = he.field_Ub;
            } else {
              var5_ref_String = nu.field_a;
            }
          }
          wj.a(var3, 8, var5_ref_String, var4 * 162 + 78, 105, 126);
        }
        if (this.a((byte) 13)) {
          if (var2 != 0) {
            stackIn_22_0 = kp.field_a;
          } else {
            stackIn_22_0 = kk.field_A;
          }
          var4_ref_String = stackIn_22_0;
          wb.a(var4_ref_String, 302, 46, 316, 88, 0);
          stackIn_24_0 = this.field_l;
          stackIn_25_1 = (var2 != 0) ? false : true;
          ((jw) (Object) stackIn_24_0).a(stackIn_25_1, (byte) 46);
        }
        this.field_t.a(96, false);
        var4Lifetime1 = 128;
        for (var5 = 0; var5 < this.field_a.field_I; var5++) {
          var6 = this.field_k[var5];
          if (!this.field_a.field_R[var5].d(3511)) {
            var7 = un.field_d.a(var6.field_E);
            var8 = (var6.field_q - var7 >> 1) + var6.field_F;
            var9 = 20;
            on.b(var8, 6 + var4Lifetime1, var7 + var8, var4Lifetime1 + var9 - 2, 13382451);
            on.b(var8 + var7, var4Lifetime1 + 6, var8, -2 + var4Lifetime1 + var9, 13382451);
          }
          pt.a(76, -22914, 0, 480, 0);
          on.a(52, var4Lifetime1, 486, 21, 7, 65793, 128);
          ta.e(120);
          b.field_U[this.field_a.field_g[var5].field_f].c(55, 1 + var4Lifetime1);
          pt.a(640, -22914, 564, 480, 0);
          on.a(78, var4Lifetime1, 512, 21, 7, 65793, 128);
          ta.e(121);
          var4Lifetime1 += 23;
          if (this.field_a.field_n.a(param0 ^ 8659, var5)) {
            vb.field_l.c(564, var6.field_T - 4);
          }
        }
        if (this.field_a.field_f) {
          un.field_d.a("FB", 5, 17, 16777215, -1);
        }
    }

    final static void f(int param0) {
        int var1 = 113 % ((-88 - param0) / 32);
        da.field_h.b(22997);
    }

    final void f(int param0, int param1) {
        if (param0 < 98) {
          wb.f(77);
        }
    }

    public static void g(int param0) {
        field_r = null;
        if (param0 >= -20) {
          return;
        }
        field_p = null;
        field_m = null;
    }

    final static void a(int param0, String param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        String var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (kd.field_z.field_sb != 0 &&
            !iw.field_l) {
            if (!kb.field_C) {
              vg.field_Wb = true;
            } else {
              hp.b(0);
            }
          }
          if (vg.field_Wb) {
            m.a((byte) 49, 20, param1, param4, param3, param6, param4, param7, param0);
            mu.field_Y.b(0, param2);
            if (param2) {
              if (0 != gl.field_c.field_sb) {
                vg.field_Wb = false;
              }
              if (0 != b.field_N.field_sb) {
                td.a(76);
                vg.field_Wb = false;
              }
            }
          }
          if (param5 <= 70) {
            var9 = (String) null;
            wb.a(27, (String) null, 93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("wb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static boolean h(int param0) {
        if (param0 > -35) {
          field_r = (int[]) null;
        }
        return al.field_Ab.a((byte) -45);
    }

    private final void a(byte param0, int param1) {
        this.field_a.a(mg.a(this.field_g, (byte) 0, param1), -125);
        if (param0 >= -95) {
          return;
        }
        if (this.field_f) {
          or.field_d.b(72, (byte) -47);
          or.field_d.a(117, param1);
        }
    }

    wb(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        int var4_int = 0;
        RuntimeException runtimeException = null;
        hd var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_t = new hd();
          this.field_t.a(true, 640, 0, 0, 480);
          this.field_k = new hd[param0.field_I];
          for (var4_int = 0; param0.field_I > var4_int; var4_int++) {
            var5 = new hd();
            var5.field_E = param0.field_S[var4_int].toLowerCase();
            var5.field_y = 16777215;
            var5.field_X = (hu) ((Object) un.field_d);
            var5.field_A = 1;
            var5.field_q = 158;
            var5.field_mb = 21;
            var5.field_J = 105 + 23 * (1 + var4_int);
            var5.field_s = qs.field_P[0] - (var5.field_q >> 1) + 1;
            if (this.a((byte) 13) &&
              var4_int == param1) {
              this.a(var5, (byte) -64);
            }
            this.field_k[var4_int] = var5;
            this.field_t.a((byte) -126, this.field_k[var4_int]);
          }
          if (this.a((byte) 13)) {
            this.field_l = new jw(sl.field_Ab, un.field_d, 120);
            this.field_l.field_s = 442;
            this.field_l.field_J = 322;
            this.field_t.a((byte) -121, (hd) (this.field_l));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("wb.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (this.a((byte) 13) &&
          !this.field_a.field_n.a(8658, this.field_g)) {
          if (param2 == 96 &&
            this.field_a.field_n.a((byte) 107, this.field_g)) {
            this.a((byte) -119, 0);
          }
          if (param2 == 97 &&
            this.field_a.field_n.b((byte) 100, this.field_g)) {
            this.a((byte) -103, 1);
          }
          if (param2 == 84) {
            this.a((byte) -127, 2);
          }
        }
        if (param1 == 1670) {
        }
        return true;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = Kickabout.field_G;
        try {
          da.field_u = new ot[32];
          for (var1_int = 0; var1_int < 32; var1_int++) {
            var2 = -(var1_int << 11) / 32;
            da.field_u[var1_int] = wa.a(-116, var2);
          }
          if (param0 != -47) {
            field_u = 99;
          }
          ar.field_c = qo.g(-22976);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wb.J(" + param0 + ')');
        }
    }

    final static wn a(int param0, String param1, int param2) {
        wn var3 = null;
        RuntimeException var3_ref = null;
        wn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new wn(false);
          var3.field_e = param2;
          if (param0 >= -118) {
            field_m = (String) null;
          }
          var3.field_d = param1;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("wb.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(hd param0, byte param1) {
        hd var5 = null;
        try {
          this.field_o = new hd();
          this.field_s = new hd();
          var5 = new hd(0L, param0);
          var5.field_S = sp.a((byte) 26, 12303291);
          var5.field_B = -2;
          var5.field_hb = 5592405;
          var5.field_ub = 65793;
          var5.field_y = 16777215;
          this.field_o.a(var5, (byte) -80);
          this.field_s.a(var5, (byte) 107);
          this.field_o.field_E = "<lt>";
          this.field_s.field_E = "<gt>";
          param0.a((byte) -106, this.field_o);
          param0.a((byte) -112, this.field_s);
          this.field_o.field_R = null;
          this.field_s.field_R = null;
          int var4 = 100 / ((87 - param1) / 37);
          this.field_o.a(true, 21, 2, 0, 21);
          this.field_s.a(true, 21, -21 + param0.field_q - 2, 0, 21);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        hd stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        hd stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int var3;
        hd var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var3Lifetime1;
        var8 = Kickabout.field_G;
        super.a(-103, param1);
        for (var3 = 0; this.field_a.field_I > var3; var3++) {
          stackIn_4_0 = this.field_k[var3];
          stackIn_5_1 = (~(this.field_k[var3].field_s + (this.field_k[var3].field_q >> 1)) == ~qs.field_P[this.field_a.field_n.field_k[var3] + 1]);
          stackIn_4_0.field_lb = stackIn_5_1;
        }
        if (param0 >= -92) {
          this.f(-102, 73);
        }
        this.field_t.b(0, param1);
        var9 = 0;
        var3Lifetime1 = var9;
        while (this.field_a.field_I > var9) {
          var4 = this.field_k[var9];
          var5 = 1 + this.field_a.field_n.field_k[var9];
          var6 = qs.field_P[var5] - (var4.field_q >> 1);
          if (~var6 != ~var4.field_s) {
            var7 = var4.field_s;
            var4.field_s = var4.field_s * 3 + var6 >> 2;
            if (var4.field_s == var7 &&
              var4.field_s != var6) {
              stackIn_21_0 = var4;
              stackIn_21_1 = var4.field_s;
              if (var6 >= var4.field_s) {
                stackIn_22_2 = 1;
              } else {
                stackIn_22_2 = -1;
              }
              stackIn_21_0.field_s = stackIn_21_1 + stackIn_22_2;
            }
          }
          var9++;
        }
        if (this.a((byte) 13)) {
          this.field_o.field_lb = this.field_a.field_n.a((byte) 50, this.field_g);
          this.field_s.field_lb = this.field_a.field_n.b((byte) 79, this.field_g);
          if (0 != this.field_o.field_sb) {
            this.field_o.b(0, param1);
            this.a((byte) -109, 0);
            kj.a((byte) 98);
          }
          if (this.field_s.field_sb != 0) {
            this.field_s.b(0, param1);
            this.a((byte) -111, 1);
            kj.a((byte) -105);
          }
          if (0 != this.field_l.field_sb) {
            this.a((byte) -118, 2);
            sp.c(61, -126);
          }
          this.field_l.field_Gb = this.field_a.field_n.a(8658, this.field_g);
        }
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 0) {
          return;
        }
        try {
          ul.a(param2, 1, param3, true, (byte) -120, param1, 16, param4, 1, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_m = "Names should contain a maximum of 12 characters";
        field_q = 500;
        field_u = 0;
        field_n = -1;
        field_r = new int[74];
        field_r[36] = 4;
        field_r[39] = 7;
        field_r[38] = 7;
        field_r[23] = -2;
        field_r[26] = 2;
        field_r[14] = 2;
        field_r[27] = 4;
        field_r[13] = -2;
        field_r[5] = 4;
        field_r[42] = 4;
        field_r[40] = 2;
        field_r[15] = 4;
        field_r[12] = 2;
        field_r[25] = -2;
        field_r[34] = 2;
        field_r[22] = -2;
        field_r[44] = 7;
        field_r[35] = 4;
        field_r[10] = -2;
        field_r[37] = 7;
        field_r[11] = -2;
        field_r[6] = 7;
        field_r[41] = 4;
        field_r[4] = 2;
        field_r[24] = 2;
        field_r[45] = 7;
        field_r[43] = 7;
    }
}
