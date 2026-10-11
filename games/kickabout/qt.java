/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qt extends js {
    static int[] field_r;
    private String field_s;
    private int field_p;
    private int field_q;
    static ut field_u;
    private String field_w;
    private io[] field_v;
    private int field_t;
    static String field_z;
    private int field_g;
    ko field_x;
    static String field_k;
    io[] field_i;
    static String field_h;
    int field_j;
    static int field_l;
    static gq field_y;
    private int field_o;
    private boolean field_m;
    static hd field_n;

    private final boolean e(byte param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (param0 != 83) {
          field_n = (hd) null;
        }
        for (var2 = 0; this.field_i.length > var2; var2++) {
          if (7 == this.field_i[var2].field_m) {
            return true;
          }
        }
        return false;
    }

    final boolean a(qt param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4319) {
            this.a(false, -69);
          }
          stackIn_5_0 = !(param0.field_q <= this.field_q);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qt.BA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        if (this.field_c == 24) {
          var2 = 12;
        }
        if (param0 <= 41) {
          field_y = (gq) null;
        }
        if (this.field_c == 25) {
          var2 = 14;
        }
        if (this.field_c == 14) {
          var2 = 15;
        }
        if (this.field_c == 23) {
          var2 = 13;
        }
        if (16 == this.field_c) {
          var2 = 16;
        }
        if (this.field_c == 15) {
          var2 = 17;
        }
        kj.a(63, var2);
    }

    int b(int param0, int param1) {
        if (param1 != -22667) {
          this.field_p = -20;
        }
        if (this.field_i[param0].field_m == 37) {
          return wr.field_f - 50;
        }
        return 190;
    }

    void a(int param0, boolean param1) {
        int var3;
        js var3_ref_js;
        int var4;
        js var4_ref_js;
        int var5;
        ut var5_ref_ut;
        int var6;
        int var7;
        ut var8;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var4Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1Lifetime1;
        var7 = Kickabout.field_G;
        if (this.field_t != 0) {
          var3 = 14 + (5 * this.field_t - 5);
          for (var4 = 0; this.field_t > var4; var4++) {
            var3 = var3 + this.field_i[var4].field_h;
          }
          var4Lifetime2 = this.field_i[0].field_d + 14;
          if (1 < this.field_g) {
            for (var5 = 1; this.field_g > var5; var5++) {
              var4Lifetime2 = var4Lifetime2 + (14 + this.field_i[var5].field_d);
            }
          }
          var5Lifetime3 = this.b(0, -22667) - (this.field_i[0].field_d >> 1);
          var6 = this.a(60, 0) - (this.field_i[0].field_h >> 1);
          var5Lifetime3 = var5Lifetime3 - 7 + this.field_j;
          var6 = var6 - 7;
          on.a(var5Lifetime3, var6, var4Lifetime2, var3, 12, 0, 128);
        }
        if (param0 != -5) {
          return;
        }
        if (-1 != this.field_o) {
          var3Lifetime1 = -((this.field_j << 6) / 640);
          var8 = ug.field_b[this.field_o][1];
          var5_ref_ut = ug.field_b[this.field_o][0];
          for (var6Lifetime1 = 0; var6Lifetime1 < wr.field_f - var5_ref_ut.field_o; var6Lifetime1 = var6Lifetime1 + var8.field_o) {
            var8.d(var6Lifetime1, var3Lifetime1);
          }
          var5_ref_ut.d(-var5_ref_ut.field_o + wr.field_f, var3Lifetime1);
          var6Lifetime1Lifetime1 = var3Lifetime1 - (-var5_ref_ut.field_v + 18);
          if (null != this.field_w) {
            un.field_d.a(this.field_w, 10, var6Lifetime1Lifetime1, 16777215, -1);
          }
          if (null != this.field_s) {
            un.field_d.c(this.field_s, this.field_p, var6Lifetime1Lifetime1, 16777215, -1);
          }
        }
        if (this.field_m) {
          var3_ref_js = cq.field_h;
          var4_ref_js = ra.field_G;
          if (var4_ref_js != null) {
            if (var3_ref_js == this &&
              var4_ref_js instanceof qt &&
              ((qt) (var4_ref_js)).field_m) {
              ai.field_E.d(0, 430);
            } else {
              var5Lifetime1 = (ce.field_I << 9) / 24;
              if (256 < var5Lifetime1) {
                var5Lifetime1 = 256;
              }
              if (this == cq.field_h) {
                var5Lifetime1 = -var5Lifetime1 + 256;
              }
              ai.field_E.b(0, 430, var5Lifetime1);
            }
          } else {
            ai.field_E.d(0, 430);
          }
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < this.field_x.field_a; var3Lifetime2++) {
          L12: {
            if (this.a(var3Lifetime2, (byte) -95)) {
              var4Lifetime1 = this.b(var3Lifetime2, param0 - 22662) + this.field_j;
              var5Lifetime2 = this.field_i[var3Lifetime2].field_m;
              if (var5Lifetime2 == 7) {
                if (this == cq.field_h &&
                  ra.field_G instanceof qt &&
                  ((qt) (ra.field_G)).e((byte) 83)) {
                  break L12;
                }
                if (ra.field_G == this &&
                  cq.field_h instanceof qt &&
                  ((qt) (cq.field_h)).e((byte) 83)) {
                  var4Lifetime1 = var4Lifetime1 - this.field_j;
                }
              }
              if (7 == var5Lifetime2 ||
                var5Lifetime2 == 43 ||
                var5Lifetime2 == 19 ||
                var5Lifetime2 == 42 ||
                var5Lifetime2 == 21 ||
                var5Lifetime2 == 22 ||
                var5Lifetime2 == 37) {
                on.a(-4 + (var4Lifetime1 - (this.field_i[var3Lifetime2].field_d >> 1)), this.a(123, var3Lifetime2) + (-(this.field_i[var3Lifetime2].field_h >> 1) - 4), 8 + this.field_i[var3Lifetime2].field_d, 8 + this.field_i[var3Lifetime2].field_h, 10, 0, 128);
              }
              this.field_i[var3Lifetime2].a(this.a(-106, var3Lifetime2), var4Lifetime1, 13800);
            }
          }
        }
    }

    boolean a(int param0, int param1, char param2) {
        int var4;
        int var5;
        int stackIn_8_0 = 0;
        io stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        var5 = Kickabout.field_G;
        if (this.field_x.field_e >= 0) {
          if (17 != this.field_i[this.field_x.field_e].field_m) {
            stackIn_8_0 = (16 == this.field_i[this.field_x.field_e].field_m) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
        } else {
          stackIn_8_0 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var4 = stackIn_8_0;
        if (param0 == 13) {
          this.c(-77);
        } else {
          if (var4 != 0 && (param0 == 96 ||
            param0 == 97)) {
            stackIn_19_0 = this.field_i[this.field_x.field_e];
            stackIn_20_1 = (param0 == 96);
            ((io) (Object) stackIn_19_0).a(stackIn_20_1, -27);
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_x.d(107);
            if (0 <= this.field_x.field_e &&
              this.field_x.c(-1)) {
              this.field_i[this.field_x.field_e].a(-1, false);
            }
          }
        }
        if (param1 <= -5) {
          return true;
        }
        this.a(-115, 63);
        return true;
    }

    void a(int param0, boolean param1, int param2, js param3) {
        int var5_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 instanceof qt) {
            var5_int = -param0 + 256;
            this.field_j = var5_int * (var5_int * 640) >> 16;
            if (!param1) {
              this.field_j = this.field_j - 640;
            }
            if (!param1 &&
              ((qt) (param3)).a(this, -4319) ||
              param1 &&
              this.a((qt) (param3), -4319)) {
              this.field_j = -this.field_j;
            }
          } else {
            this.field_j = wr.field_f - po.a((js) (this), -4);
          }
          if (param2 >= -28) {
            this.field_j = 124;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qt.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (this.field_v != null) {
          this.a(false, this.field_v);
        }
        if (param0 >= -94) {
          io[] var3 = (io[]) null;
          this.a(false, (io[]) null);
        }
    }

    final void a(String param0, int param1, int param2, int param3, String param4, io[] param5, io[] param6, int param7, boolean param8, int param9, int param10, int param11) {
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        try {
          this.field_w = param0;
          this.field_g = param2;
          this.field_o = param9;
          this.field_p = param7;
          this.field_q = param11;
          stackIn_3_1 = (param8);
          this.field_m = stackIn_3_1;
          this.field_c = param10;
          if (param3 != -46) {
            qt.c((byte) 105);
          }
          this.field_t = param1;
          if (param6 == null) {
            param6 = new io[]{};
          }
          this.field_s = param4;
          if (param5 != null) {
            this.a(false, param5);
            this.field_v = param6;
          } else {
            this.a(false, param6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_13_0 = var13;
          stackIn_13_1 = new StringBuilder().append("qt.CA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    void b(int param0) {
        if (param0 != -38) {
          qt var3 = (qt) null;
          this.a((qt) null, 112);
        }
    }

    boolean a(int param0, byte param1) {
        if (param1 != -95) {
          this.a(true, 92);
        }
        return true;
    }

    qt() {
        super(0);
        this.field_j = 0;
    }

    final static boolean d(int param0) {
        int var2 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_34_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_45_0 = false;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_61_0 = false;
        boolean stackIn_66_0 = false;
        boolean stackIn_70_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        try {
          if (ks.field_e == 1) {
            stackIn_70_0 = (et.field_d.field_V.field_m == 0);
            return stackIn_70_0;
          }
          if (2 == ks.field_e) {
            stackIn_6_0 = !(mh.field_k.a(true) >= 285);
            return stackIn_6_0;
          }
          if (ks.field_e == 3) {
            stackIn_12_0 = (790 < mh.field_k.f(param0 - 85)) && (1000 < mh.field_k.a(true));
            return stackIn_12_0;
          }
          if (ks.field_e == 4) {
            stackIn_66_0 = (et.field_d.field_V.field_m == 0) && (et.field_d.field_V.field_s == 3);
            return stackIn_66_0;
          }
          if (5 == ks.field_e) {
            stackIn_19_0 = (et.field_d.field_V.field_m == 0) && (et.field_d.field_V.field_s == 1);
            return stackIn_19_0;
          }
          if (ks.field_e == 6) {
            stackIn_61_0 = (et.field_d.field_V.field_m == 0) && (3 == et.field_d.field_V.field_s);
            return stackIn_61_0;
          }
          if (ks.field_e == 7) {
            stackIn_49_0 = (et.field_d.field_V.field_m != 0) ? 0 : 1;
            var1_int = stackIn_49_0;
            for (var2 = 1; 4 > var2; var2++) {
              stackIn_53_0 = var1_int;
              if (et.field_d.field_P[1][var2].field_w != fm.a((byte) -27, 1)) {
                stackIn_54_1 = 0;
              } else {
                stackIn_54_1 = 1;
              }
              var1_int = stackIn_53_0 & stackIn_54_1;
            }
            stackIn_56_0 = var1_int;
            return stackIn_56_0 != 0;
          }
          if (8 == ks.field_e) {
            stackIn_28_0 = (et.field_d.field_V.field_m == 0) && (ld.field_f.f(-115) > 760) && (ld.field_f.a(true) > 1000);
            return stackIn_28_0;
          }
          if (9 == ks.field_e) {
            stackIn_34_0 = (0 == et.field_d.field_V.field_m) && (et.field_d.field_V.field_s == 1);
            return stackIn_34_0;
          }
          if (ks.field_e == 10) {
            stackIn_39_0 = (et.field_d.field_R[0].field_g == 4);
            return stackIn_39_0;
          }
          if (11 == ks.field_e) {
            stackIn_45_0 = (et.field_d.field_V.field_m == 0);
            return stackIn_45_0;
          }
          if (param0 != -8) {
            qt.c((byte) -118);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "qt.V(" + param0 + ')');
        }
    }

    void a(boolean param0, int param1) {
        if (param1 <= 99) {
          this.field_v = (io[]) null;
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        for (var4 = 0; var4 < this.field_i.length; var4++) {
          var5 = this.field_i[var4].field_d;
          var6 = this.field_i[var4].field_h;
          var7 = this.b(var4, -22667) - (var5 >> 1) + this.field_j;
          var8 = -(var6 >> 1) + this.a(31, var4);
          if (this.a(var4, (byte) -95) &&
            param0 >= var7 &&
            var5 + var7 > param0 &&
            param1 >= var8 &&
            var8 + var6 > param1) {
            return var4;
          }
        }
        if (param2 < 29) {
          return 43;
        }
        return -1;
    }

    void a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_1 = false;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = Kickabout.field_G;
        stackIn_3_0 = param1;
        stackIn_4_1 = (!ec.field_e) && (!an.field_d);
        param1 = stackIn_3_0 & stackIn_4_1;
        if (!param1) {
          this.field_x.field_e = -1;
        }
        if (param1) {
          var3 = this.a(wt.field_x, us.field_j, (byte) 30);
          this.field_x.a(-21174, var3, this.a(dn.field_yb, kf.field_Eb, (byte) 110));
          if (var3 == -1) {
            stackIn_11_0 = -1;
          } else {
            stackIn_11_0 = this.field_i[var3].field_m;
          }
          var4 = stackIn_11_0;
          if (var4 != -1 &&
            null != fa.field_g[var4]) {
            qd.$cfr$intArgs$a$b6210757cdab(-67, fa.field_g[var4]);
          }
        }
        var9 = 0;
        var3Lifetime1 = var9;
        while (this.field_i.length > var9) {
          stackIn_20_0 = (~var9 != ~this.field_x.field_e) ? 0 : 1;
          var4Lifetime1 = stackIn_20_0;
          if (var4Lifetime1 != 0) {
            stackIn_26_0 = (this.field_x.c(-1)) ? 1 : 0;
          } else {
            stackIn_26_0 = 0;
          }
          var5 = stackIn_26_0;
          if (var4Lifetime1 != 0) {
            stackIn_32_0 = (this.field_x.a(0)) ? 1 : 0;
          } else {
            stackIn_32_0 = 0;
          }
          var6 = stackIn_32_0;
          var7 = wt.field_x - this.b(var9, -22667);
          this.field_i[var9].a(var4Lifetime1 != 0, var5 != 0, var6 != 0, 16, var7);
          var9++;
        }
        var4Lifetime2 = -54 % ((38 - param0) / 60);
    }

    final static void a(int param0) {
        np.field_Jb.a(new qq(), 3);
        if (param0 != 16144) {
          qt.d(-47);
        }
    }

    void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        io var6 = null;
        int var7 = Kickabout.field_G;
        this.field_x.a(-1, 0, param1, param2);
        io[] var8 = this.field_i;
        io[] var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
          var6 = var8[var5];
          var6.a(false, false, false, 16, 0);
        }
        if (param0 == this.field_i.length) {
          this.field_x.field_e = -1;
        }
    }

    private final void c(int param0) {
        if (param0 > -67) {
          return;
        }
        if (0 == this.field_c ||
          18 == this.field_c) {
          return;
        }
        vj.a(106, false);
    }

    public static void c(byte param0) {
        field_y = null;
        field_n = null;
        field_z = null;
        int var1 = 27 % ((param0 + 56) / 45);
        field_h = null;
        field_u = null;
        field_k = null;
        field_r = null;
    }

    int a(int param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        var6 = Kickabout.field_G;
        if (this.field_i[param1].field_m != 7 &&
          42 != this.field_i[param1].field_m &&
          this.field_i[param1].field_m != 37 &&
          this.field_i[param1].field_m != 19 &&
          this.field_i[param1].field_m != 43) {
          var3 = -124 % ((param0 + 49) / 52);
          var4 = 190;
          if (this.field_i[param1].field_m != 46 &&
            48 != this.field_i[param1].field_m &&
            this.field_i[param1].field_m != 45 &&
            this.field_i[param1].field_m != 28 &&
            this.field_i[param1].field_m != 26) {
            if (25 == this.field_i[param1].field_m ||
              3 == this.field_i[param1].field_m ||
              18 == this.field_i[param1].field_m) {
              var4 += 25;
            }
          } else {
            var4 -= 25;
          }
          for (var5 = 0; param1 > var5; var5++) {
            var4 = var4 + ((this.field_i[var5].field_h >> 1) + 5 + (this.field_i[var5 + 1].field_h >> 1));
          }
          return var4;
        }
        return 469 - (this.field_i[param1].field_h >> 1);
    }

    private final void a(boolean param0, io[] param1) {
        this.field_i = param1;
        if (param0) {
          return;
        }
        try {
          this.field_x = new ko(this.field_i.length);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qt.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static hd f(byte param0) {
        if (param0 != -63) {
          return (hd) null;
        }
        return nq.field_F.field_yb;
    }

    static {
        field_r = new int[]{672, 100, 1294};
        field_h = "scroll down";
        field_z = "Lobby";
        field_k = "Remove friend";
    }
}
